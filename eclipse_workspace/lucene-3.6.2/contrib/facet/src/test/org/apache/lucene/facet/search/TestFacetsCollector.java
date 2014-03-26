package org.apache.lucene.facet.search;

import java.util.Arrays;
import java.util.List;

import org.apache.lucene.analysis.KeywordAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.Field.Index;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.facet.index.CategoryDocumentBuilder;
import org.apache.lucene.facet.search.params.FacetSearchParams;
import org.apache.lucene.facet.search.params.ScoreFacetRequest;
import org.apache.lucene.facet.search.results.FacetResult;
import org.apache.lucene.facet.taxonomy.CategoryPath;
import org.apache.lucene.facet.taxonomy.TaxonomyWriter;
import org.apache.lucene.facet.taxonomy.directory.DirectoryTaxonomyReader;
import org.apache.lucene.facet.taxonomy.directory.DirectoryTaxonomyWriter;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.MatchAllDocsQuery;
import org.apache.lucene.search.MultiCollector;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.apache.lucene.util.IOUtils;
import org.apache.lucene.util.LuceneTestCase;
import org.junit.Test;

/*
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

public class TestFacetsCollector extends LuceneTestCase {

  @Test
  public void testFacetsWithDocScore() throws Exception {
    Directory indexDir = newDirectory();
    Directory taxoDir = newDirectory();

    TaxonomyWriter taxonomyWriter = new DirectoryTaxonomyWriter(taxoDir);
    IndexWriter iw = new IndexWriter(indexDir, new IndexWriterConfig(
        TEST_VERSION_CURRENT, new KeywordAnalyzer()));

    CategoryDocumentBuilder cdb = new CategoryDocumentBuilder(taxonomyWriter);
    Iterable<CategoryPath> cats = Arrays.asList(new CategoryPath("a"));
    for(int i = atLeast(2000); i > 0; --i) {
      Document doc = new Document();
      doc.add(new Field("f", "v", Store.NO, Index.NOT_ANALYZED_NO_NORMS));
      cdb.setCategoryPaths(cats);
      iw.addDocument(cdb.build(doc));
    }
    
    taxonomyWriter.close();
    iw.close();
    
    FacetSearchParams sParams = new FacetSearchParams();
    sParams.addFacetRequest(new ScoreFacetRequest(new CategoryPath("a"), 10));
    
    IndexReader r = IndexReader.open(indexDir);
    DirectoryTaxonomyReader taxo = new DirectoryTaxonomyReader(taxoDir);
    
    FacetsCollector fc = new FacetsCollector(sParams, r, taxo);
    TopScoreDocCollector topDocs = TopScoreDocCollector.create(10, false);
    new IndexSearcher(r).search(new MatchAllDocsQuery(), MultiCollector.wrap(fc, topDocs));
    
    List<FacetResult> res = fc.getFacetResults();
    double value = res.get(0).getFacetResultNode().getValue();
    double expected = topDocs.topDocs().getMaxScore() * r.numDocs();
    assertEquals(expected, value, 1E-10);
    
    IOUtils.close(taxo, taxoDir, r, indexDir);
  }
  
}
