package org.apache.lucene.analysis.ja;

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

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.BaseTokenStreamTestCase;
import org.apache.lucene.analysis.KeywordTokenizer;
import org.apache.lucene.analysis.ReusableAnalyzerBase;
import org.apache.lucene.analysis.Tokenizer;

import java.io.IOException;
import java.io.Reader;

/**
 * Tests for {@link TestJapaneseReadingFormFilter}
 */
public class TestJapaneseReadingFormFilter extends BaseTokenStreamTestCase {
  private Analyzer katakanaAnalyzer = new ReusableAnalyzerBase() {
    @Override
    protected TokenStreamComponents createComponents(String fieldName, Reader reader) {
      Tokenizer tokenizer = new JapaneseTokenizer(reader, null, true, JapaneseTokenizer.Mode.SEARCH);
      return new TokenStreamComponents(tokenizer, new JapaneseReadingFormFilter(tokenizer, false));
    }
  };

  private Analyzer romajiAnalyzer = new ReusableAnalyzerBase() {
    @Override
    protected TokenStreamComponents createComponents(String fieldName, Reader reader) {
      Tokenizer tokenizer = new JapaneseTokenizer(reader, null, true, JapaneseTokenizer.Mode.SEARCH);
      return new TokenStreamComponents(tokenizer, new JapaneseReadingFormFilter(tokenizer, true));
    }
  };


  public void testKatakanaReadings() throws IOException {
    assertAnalyzesTo(katakanaAnalyzer, "今夜はロバート先生と話した",
        new String[] { "コンヤ", "ハ", "ロバート", "センセイ", "ト", "ハナシ", "タ" }
    );
  }

  public void testRomajiReadings() throws IOException {
    assertAnalyzesTo(romajiAnalyzer, "今夜はロバート先生と話した",
        new String[] { "kon'ya", "ha", "robato", "sensei", "to", "hanashi", "ta" }
    );
  }

  public void testRandomData() throws IOException {
    checkRandomData(random, katakanaAnalyzer, 1000*RANDOM_MULTIPLIER);
    checkRandomData(random, romajiAnalyzer, 1000*RANDOM_MULTIPLIER);
  }
  
  public void testEmptyTerm() throws IOException {
    Analyzer a = new ReusableAnalyzerBase() {
      @Override
      protected TokenStreamComponents createComponents(String fieldName, Reader reader) {
        Tokenizer tokenizer = new KeywordTokenizer(reader);
        return new TokenStreamComponents(tokenizer, new JapaneseReadingFormFilter(tokenizer));
      }
    };
    checkOneTermReuse(a, "", "");
  }
}
