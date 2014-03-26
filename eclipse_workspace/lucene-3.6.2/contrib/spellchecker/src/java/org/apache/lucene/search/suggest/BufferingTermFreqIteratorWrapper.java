package org.apache.lucene.search.suggest;

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
import java.util.Comparator;
import org.apache.lucene.search.spell.TermFreqIterator;
import org.apache.lucene.util.ArrayUtil;
import org.apache.lucene.util.BytesRef;

/**
 * This wrapper buffers incoming elements.
 * @lucene.experimental
 */
public class BufferingTermFreqIteratorWrapper implements TermFreqIterator {
  // TODO keep this for now
  protected BytesRefList entries = new BytesRefList();
  protected int curPos = -1;
  protected long[] freqs = new long[1];
  private final BytesRef spare = new BytesRef();
  private final Comparator<BytesRef> comp;
  public BufferingTermFreqIteratorWrapper(TermFreqIterator source) throws IOException {
    this.comp = source.getComparator();
    BytesRef spare;
    int freqIndex = 0;
    while((spare = source.next()) != null) {
      entries.append(spare);
      if (freqIndex >= freqs.length) {
        freqs = ArrayUtil.grow(freqs, freqs.length+1);
      }
      freqs[freqIndex++] = source.weight();
    }
   
  }

  public long weight() {
    return freqs[curPos];
  }

  //@Override - not until Java 6
  public BytesRef next() throws IOException {
    if (++curPos < entries.size()) {
      entries.get(spare, curPos);
      return spare;
    }
    return null;
  }

  //@Override - not until Java 6
  public Comparator<BytesRef> getComparator() {
    return comp;
  }

 
}
