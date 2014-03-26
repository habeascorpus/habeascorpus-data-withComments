package org.apache.lucene.index;

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.apache.lucene.analysis.MockAnalyzer;
import org.apache.lucene.analysis.MockTokenizer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.IndexInput;
import org.apache.lucene.store.LockObtainFailedException;
import org.apache.lucene.util.BytesRef;
import org.apache.lucene.util.LuceneTestCase;
import org.apache.lucene.util._TestUtil;

public class TestTermInfosReaderIndex extends LuceneTestCase {
  
  private static final int NUMBER_OF_DOCUMENTS = 1000;
  private static final int NUMBER_OF_FIELDS = 100;
  private TermInfosReaderIndex index;
  private Directory directory;
  private SegmentTermEnum termEnum;
  private int indexDivisor;
  private int termIndexInterval;
  private int readBufferSize = 1024;
  private IndexReader reader;
  private List<Term> sampleTerms;
  
  @Override
  public void setUp() throws Exception {
    super.setUp();
    indexDivisor = _TestUtil.nextInt(random, 1, 10);
    directory = newDirectory();
    termIndexInterval = populate(directory);
    
    SegmentReader r = SegmentReader.getOnlySegmentReader(directory);
    String segment = r.getSegmentName();
    r.close();

    FieldInfos fieldInfos = new FieldInfos(directory, IndexFileNames.segmentFileName(segment, IndexFileNames.FIELD_INFOS_EXTENSION));
    String segmentFileName = IndexFileNames.segmentFileName(segment, IndexFileNames.TERMS_INDEX_EXTENSION);
    long tiiFileLength = directory.fileLength(segmentFileName);
    IndexInput input = directory.openInput(segmentFileName, readBufferSize);
    termEnum = new SegmentTermEnum(directory.openInput(IndexFileNames.segmentFileName(segment, IndexFileNames.TERMS_EXTENSION), readBufferSize), fieldInfos, false);
    int totalIndexInterval = termEnum.indexInterval * indexDivisor;
    
    SegmentTermEnum indexEnum = new SegmentTermEnum(input, fieldInfos, true);
    index = new TermInfosReaderIndex(indexEnum, indexDivisor, tiiFileLength, totalIndexInterval);
    indexEnum.close();
    input.close();
    
    reader = IndexReader.open(directory);
    sampleTerms = sample(reader,1000);
    
  }
  
  @Override
  public void tearDown() throws Exception {
    termEnum.close();
    reader.close();
    directory.close();
    super.tearDown();
  }
  
  public void testSeekEnum() throws CorruptIndexException, IOException {
    int indexPosition = 3;
    SegmentTermEnum clone = (SegmentTermEnum) termEnum.clone();
    Term term = findTermThatWouldBeAtIndex(clone, indexPosition);
    SegmentTermEnum enumerator = clone;
    index.seekEnum(enumerator, indexPosition);
    assertEquals(term, enumerator.term());
    clone.close();
  }
  
  public void testCompareTo() throws IOException {
    Term term = new Term("field" + random.nextInt(NUMBER_OF_FIELDS) ,getText());
    BytesRef termBytesRef = new BytesRef(term.text);
    for (int i = 0; i < index.length(); i++) {
      Term t = index.getTerm(i);
      int compareTo = term.compareTo(t);
      assertEquals(compareTo, index.compareTo(term, termBytesRef, i));
    }
  }
  
  public void testRandomSearchPerformance() throws CorruptIndexException, IOException {
    IndexSearcher searcher = new IndexSearcher(reader);
    for (Term t : sampleTerms) {
      TermQuery query = new TermQuery(t);
      TopDocs topDocs = searcher.search(query, 10);
      assertTrue(topDocs.totalHits > 0);
    }
    searcher.close();
  }

  private List<Term> sample(IndexReader reader, int size) throws IOException {
    List<Term> sample = new ArrayList<Term>();
    Random random = new Random();
    TermEnum terms = reader.terms();
    while (terms.next()) {
      if (sample.size() >= size) {
        int pos = random.nextInt(size);
        sample.set(pos, terms.term());
      } else {
        sample.add(terms.term());
      }
    }
    terms.close();
    Collections.shuffle(sample);
    return sample;
  }

  private Term findTermThatWouldBeAtIndex(SegmentTermEnum termEnum, int index) throws IOException {
    int termPosition = index * termIndexInterval * indexDivisor;
    for (int i = 0; i < termPosition; i++) {
      if (!termEnum.next()) {
        fail("Should not have run out of terms.");
      }
    }
    return termEnum.term();
  }

  private int populate(Directory directory) throws CorruptIndexException, LockObtainFailedException, IOException {
    IndexWriterConfig config = newIndexWriterConfig(TEST_VERSION_CURRENT, 
        new MockAnalyzer(random, MockTokenizer.KEYWORD, false));
    // turn off compound file, this test will open some index files directly.
    LogMergePolicy mp = newLogMergePolicy();
    mp.setUseCompoundFile(false);
    config.setMergePolicy(mp);

    RandomIndexWriter writer = new RandomIndexWriter(random, directory, config);
    for (int i = 0; i < NUMBER_OF_DOCUMENTS; i++) {
      Document document = new Document();
      for (int f = 0; f < NUMBER_OF_FIELDS; f++) {
        document.add(newField("field" + f,getText(),Store.NO,Index.NOT_ANALYZED_NO_NORMS));
      }
      writer.addDocument(document);
    }
    writer.forceMerge(1);
    writer.close();
    return config.getTermIndexInterval();
  }
  
  private String getText() {
    return Long.toString(random.nextLong(),Character.MAX_RADIX);
  }
}
