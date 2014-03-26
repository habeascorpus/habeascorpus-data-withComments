package org.apache.lucene.analysis.hunspell;

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

import org.apache.lucene.util.LuceneTestCase;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

public class HunspellDictionaryTest extends LuceneTestCase {
  
  private class CloseCheckInputStream extends InputStream {
    private InputStream delegate;
    
    private boolean closed = false;

    public CloseCheckInputStream(InputStream delegate) {
      super();
      this.delegate = delegate;
    }

    public int read() throws IOException {
      return delegate.read();
    }

    public int hashCode() {
      return delegate.hashCode();
    }

    public int read(byte[] b) throws IOException {
      return delegate.read(b);
    }

    public boolean equals(Object obj) {
      return delegate.equals(obj);
    }

    public int read(byte[] b, int off, int len) throws IOException {
      return delegate.read(b, off, len);
    }

    public long skip(long n) throws IOException {
      return delegate.skip(n);
    }

    public String toString() {
      return delegate.toString();
    }

    public int available() throws IOException {
      return delegate.available();
    }

    public void close() throws IOException {
      this.closed = true;
      delegate.close();
    }

    public void mark(int readlimit) {
      delegate.mark(readlimit);
    }

    public void reset() throws IOException {
      delegate.reset();
    }

    public boolean markSupported() {
      return delegate.markSupported();
    }
    
    public boolean isClosed() {
      return this.closed;
    }
    
  }

  @Test
  public void testResourceCleanup() throws IOException, ParseException {
    CloseCheckInputStream affixStream = new CloseCheckInputStream(getClass().getResourceAsStream("testCompressed.aff"));
    CloseCheckInputStream dictStream = new CloseCheckInputStream(getClass().getResourceAsStream("testCompressed.dic"));
    
    new HunspellDictionary(affixStream, dictStream, TEST_VERSION_CURRENT);
    
    assertFalse(affixStream.isClosed());
    assertFalse(dictStream.isClosed());
    
    affixStream.close();
    dictStream.close();
    
    assertTrue(affixStream.isClosed());
    assertTrue(dictStream.isClosed());
  }
  
  @Test
  public void testHunspellDictionary_loadDicAff() throws IOException, ParseException {
    InputStream affixStream = getClass().getResourceAsStream("test.aff");
    InputStream dictStream = getClass().getResourceAsStream("test.dic");

    HunspellDictionary dictionary = new HunspellDictionary(affixStream, dictStream, TEST_VERSION_CURRENT);
    assertEquals(3, dictionary.lookupSuffix(new char[]{'e'}, 0, 1).size());
    assertEquals(1, dictionary.lookupPrefix(new char[]{'s'}, 0, 1).size());
    assertEquals(1, dictionary.lookupWord(new char[]{'o', 'l', 'r'}, 0, 3).size());
    
    affixStream.close();
    dictStream.close();
  }

  @Test
  public void testCompressedHunspellDictionary_loadDicAff() throws IOException, ParseException {
    InputStream affixStream = getClass().getResourceAsStream("testCompressed.aff");
    InputStream dictStream = getClass().getResourceAsStream("testCompressed.dic");

    HunspellDictionary dictionary = new HunspellDictionary(affixStream, dictStream, TEST_VERSION_CURRENT);
    assertEquals(3, dictionary.lookupSuffix(new char[]{'e'}, 0, 1).size());
    assertEquals(1, dictionary.lookupPrefix(new char[]{'s'}, 0, 1).size());
    assertEquals(1, dictionary.lookupWord(new char[]{'o', 'l', 'r'}, 0, 3).size());
    
    affixStream.close();
    dictStream.close();
  }
}
