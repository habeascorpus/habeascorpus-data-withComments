package org.apache.lucene.search.suggest;

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.apache.lucene.search.spell.TermFreqIterator;
import org.apache.lucene.store.ByteArrayDataOutput;
import org.apache.lucene.util.ArrayUtil;
import org.apache.lucene.util.BytesRef;
import org.apache.lucene.util.BytesRefHash;
import org.apache.lucene.util.LuceneTestCase;
import org.apache.lucene.util._TestUtil;

public class TestTermFreqIterator extends LuceneTestCase {
  public void testEmpty() throws Exception {
    TermFreqArrayIterator iterator = new TermFreqArrayIterator(new TermFreq[0]);
    TermFreqIterator wrapper = new SortedTermFreqIteratorWrapper(iterator, BytesRef.getUTF8SortedAsUnicodeComparator());
    assertNull(wrapper.next());
    wrapper = new UnsortedTermFreqIteratorWrapper(iterator);
    assertNull(wrapper.next());
  }
  
  public void testTerms() throws Exception {
    int num = atLeast(10000);
    
    Comparator<BytesRef> comparator = random.nextBoolean() ? BytesRef.getUTF8SortedAsUnicodeComparator() : BytesRef.getUTF8SortedAsUTF16Comparator();
    TreeMap<BytesRef,Long> sorted = new TreeMap<BytesRef,Long>(comparator);
    TermFreq[] unsorted = new TermFreq[num];

    for (int i = 0; i < num; i++) {
      BytesRef key;
      do {
        key = new BytesRef(_TestUtil.randomUnicodeString(random));
      } while (sorted.containsKey(key));
      long value = random.nextLong();
      sorted.put(key, value);
      unsorted[i] = new TermFreq(key, value);
    }
    
    // test the sorted iterator wrapper
    TermFreqIterator wrapper = new SortedTermFreqIteratorWrapper(new TermFreqArrayIterator(unsorted), comparator);
    Iterator<Map.Entry<BytesRef,Long>> expected = sorted.entrySet().iterator();
    while (expected.hasNext()) {
      Map.Entry<BytesRef,Long> entry = expected.next();
      
      assertEquals(entry.getKey(), wrapper.next());
      assertEquals(entry.getValue().longValue(), wrapper.weight());
    }
    assertNull(wrapper.next());
    
    // test the unsorted iterator wrapper
    wrapper = new UnsortedTermFreqIteratorWrapper(new TermFreqArrayIterator(unsorted));
    TreeMap<BytesRef,Long> actual = new TreeMap<BytesRef,Long>();
    BytesRef key;
    while ((key = wrapper.next()) != null) {
      long value = wrapper.weight();
      actual.put(BytesRef.deepCopyOf(key), value);
    }
    assertEquals(sorted, actual);
  }
  
  
  public void testRaw() throws Exception {
    int num = atLeast(10000);
    
    Comparator<BytesRef> comparator = BytesRef.getUTF8SortedAsUnicodeComparator();
    BytesRefHash sorted = new BytesRefHash();
    TermFreq[] unsorted = new TermFreq[num];
    byte[] buffer = new byte[0];
    ByteArrayDataOutput output = new ByteArrayDataOutput(buffer);

    for (int i = 0; i < num; i++) {
      BytesRef spare;
      long weight;
      do {
        spare = new BytesRef(_TestUtil.randomUnicodeString(random));
        if (spare.length + 8 >= buffer.length) {
          buffer = ArrayUtil.grow(buffer, spare.length + 8);
        }
        output.reset(buffer);
        output.writeBytes(spare.bytes, spare.offset, spare.length);
        weight = random.nextLong();
        output.writeLong(weight);
        
      } while (sorted.add(new BytesRef(buffer, 0, output.getPosition())) < 0);
      unsorted[i] = new TermFreq(spare, weight);
    }
    
    // test the sorted iterator wrapper
    TermFreqIterator wrapper = new SortedTermFreqIteratorWrapper(new TermFreqArrayIterator(unsorted), comparator, true);
    int[] sort = sorted.sort(comparator);
    int size = sorted.size();
    BytesRef spare = new BytesRef();
    for (int i = 0; i < size; i++) {
      sorted.get(sort[i], spare);
      spare.length -= 8; // sub the long value
      assertEquals(spare, wrapper.next());
      spare.offset = spare.offset + spare.length;
      spare.length = 8;
      assertEquals(asLong(spare), wrapper.weight());
    }
    assertNull(wrapper.next());
  }
  
  public static long asLong(BytesRef b) {
    return (((long) asIntInternal(b, b.offset) << 32) | asIntInternal(b,
        b.offset + 4) & 0xFFFFFFFFL);
  }

  private static int asIntInternal(BytesRef b, int pos) {
    return ((b.bytes[pos++] & 0xFF) << 24) | ((b.bytes[pos++] & 0xFF) << 16)
        | ((b.bytes[pos++] & 0xFF) << 8) | (b.bytes[pos] & 0xFF);
  }
}
