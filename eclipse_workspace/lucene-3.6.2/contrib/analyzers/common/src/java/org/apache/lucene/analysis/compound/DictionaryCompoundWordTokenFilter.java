package org.apache.lucene.analysis.compound;

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


import java.util.Set;

import org.apache.lucene.analysis.TokenFilter; // for javadocs
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.util.Version;

/**
 * A {@link TokenFilter} that decomposes compound words found in many Germanic languages.
 * <p>
 * "Donaudampfschiff" becomes Donau, dampf, schiff so that you can find
 * "Donaudampfschiff" even when you only enter "schiff". 
 *  It uses a brute-force algorithm to achieve this.
 * <p>
 * You must specify the required {@link Version} compatibility when creating
 * CompoundWordTokenFilterBase:
 * <ul>
 * <li>As of 3.1, CompoundWordTokenFilterBase correctly handles Unicode 4.0
 * supplementary characters in strings and char arrays provided as compound word
 * dictionaries.
 * </ul>
 * <p>If you pass in a {@link org.apache.lucene.analysis.CharArraySet} as dictionary,
 * it should be case-insensitive unless it contains only lowercased entries and you
 * have {@link org.apache.lucene.analysis.LowerCaseFilter} before this filter in your analysis chain.
 * For optional performance (as this filter does lots of lookups to the dictionary,
 * you should use the latter analysis chain/CharArraySet). Be aware: If you supply arbitrary
 * {@link Set Sets} to the ctors or {@code String[]} dictionaries, they will be automatically
 * transformed to case-insensitive!
 */
public class DictionaryCompoundWordTokenFilter extends CompoundWordTokenFilterBase {
  
  /**
   * Creates a new {@link DictionaryCompoundWordTokenFilter}.
   * @param input the {@link TokenStream} to process
   * @param dictionary the word dictionary to match against
   * @param minWordSize only words longer than this get processed
   * @param minSubwordSize only subwords longer than this get to the output stream
   * @param maxSubwordSize only subwords shorter than this get to the output stream
   * @param onlyLongestMatch Add only the longest matching subword to the stream
   * @deprecated use {@link #DictionaryCompoundWordTokenFilter(Version, TokenStream, String[], int, int, int, boolean)} instead
   */
  @Deprecated
  public DictionaryCompoundWordTokenFilter(TokenStream input, String[] dictionary,
      int minWordSize, int minSubwordSize, int maxSubwordSize, boolean onlyLongestMatch) {
    super(Version.LUCENE_30, input, dictionary, minWordSize, minSubwordSize, maxSubwordSize, onlyLongestMatch);
  }

  /**
   * Creates a new {@link DictionaryCompoundWordTokenFilter}
   *  
   * @param input the {@link TokenStream} to process
   * @param dictionary the word dictionary to match against
   * @deprecated use {@link #DictionaryCompoundWordTokenFilter(Version, TokenStream, String[])} instead 
   */
  @Deprecated
  public DictionaryCompoundWordTokenFilter(TokenStream input, String[] dictionary) {
    super(Version.LUCENE_30, input, dictionary);
  }

  /**
   * Creates a new {@link DictionaryCompoundWordTokenFilter}
   *  
   * @param input the {@link TokenStream} to process
   * @param dictionary the word dictionary to match against. If this is a {@link org.apache.lucene.analysis.CharArraySet CharArraySet} it must have set ignoreCase=false and only contain
   *        lower case strings.
   * @deprecated use {@link #DictionaryCompoundWordTokenFilter(Version, TokenStream, Set)} instead 
   */
  @Deprecated
  public DictionaryCompoundWordTokenFilter(TokenStream input, Set dictionary) {
    super(Version.LUCENE_30, input, dictionary);
  }

  /**
   * Creates a new {@link DictionaryCompoundWordTokenFilter}
   *  
   * @param input the {@link TokenStream} to process
   * @param dictionary the word dictionary to match against. If this is a {@link org.apache.lucene.analysis.CharArraySet CharArraySet} it must have set ignoreCase=false and only contain
   *        lower case strings. 
   * @param minWordSize only words longer than this get processed
   * @param minSubwordSize only subwords longer than this get to the output stream
   * @param maxSubwordSize only subwords shorter than this get to the output stream
   * @param onlyLongestMatch Add only the longest matching subword to the stream
   * @deprecated use {@link #DictionaryCompoundWordTokenFilter(Version, TokenStream, Set, int, int, int, boolean)} instead
   */
  @Deprecated
  public DictionaryCompoundWordTokenFilter(TokenStream input, Set dictionary,
      int minWordSize, int minSubwordSize, int maxSubwordSize, boolean onlyLongestMatch) {
    super(Version.LUCENE_30, input, dictionary, minWordSize, minSubwordSize, maxSubwordSize, onlyLongestMatch);
  }
  
  /**
   * Creates a new {@link DictionaryCompoundWordTokenFilter}
   * 
   * @param matchVersion
   *          Lucene version to enable correct Unicode 4.0 behavior in the
   *          dictionaries if Version > 3.0. See <a
   *          href="CompoundWordTokenFilterBase#version"
   *          >CompoundWordTokenFilterBase</a> for details.
   * @param input
   *          the {@link TokenStream} to process
   * @param dictionary
   *          the word dictionary to match against
   * @param minWordSize
   *          only words longer than this get processed
   * @param minSubwordSize
   *          only subwords longer than this get to the output stream
   * @param maxSubwordSize
   *          only subwords shorter than this get to the output stream
   * @param onlyLongestMatch
   *          Add only the longest matching subword to the stream
   * @deprecated Use the constructors taking {@link Set}
   */
  @Deprecated
  public DictionaryCompoundWordTokenFilter(Version matchVersion, TokenStream input, String[] dictionary,
      int minWordSize, int minSubwordSize, int maxSubwordSize, boolean onlyLongestMatch) {
    super(matchVersion, input, dictionary, minWordSize, minSubwordSize, maxSubwordSize, onlyLongestMatch);
  }

  /**
   * Creates a new {@link DictionaryCompoundWordTokenFilter}
   * 
   * @param matchVersion
   *          Lucene version to enable correct Unicode 4.0 behavior in the
   *          dictionaries if Version > 3.0. See <a
   *          href="CompoundWordTokenFilterBase#version"
   *          >CompoundWordTokenFilterBase</a> for details.
   * 
   * @param input
   *          the {@link TokenStream} to process
   * @param dictionary
   *          the word dictionary to match against
   * @deprecated Use the constructors taking {@link Set}
   */
  @Deprecated
  public DictionaryCompoundWordTokenFilter(Version matchVersion, TokenStream input, String[] dictionary) {
    super(matchVersion, input, dictionary);
  }
  
  /**
   * Creates a new {@link DictionaryCompoundWordTokenFilter}
   * 
   * @param matchVersion
   *          Lucene version to enable correct Unicode 4.0 behavior in the
   *          dictionaries if Version > 3.0. See <a
   *          href="CompoundWordTokenFilterBase#version"
   *          >CompoundWordTokenFilterBase</a> for details.
   * @param input
   *          the {@link TokenStream} to process
   * @param dictionary
   *          the word dictionary to match against.
   */
  public DictionaryCompoundWordTokenFilter(Version matchVersion, TokenStream input, Set<?> dictionary) {
    super(matchVersion, input, dictionary);
  }
  
  /**
   * Creates a new {@link DictionaryCompoundWordTokenFilter}
   * 
   * @param matchVersion
   *          Lucene version to enable correct Unicode 4.0 behavior in the
   *          dictionaries if Version > 3.0. See <a
   *          href="CompoundWordTokenFilterBase#version"
   *          >CompoundWordTokenFilterBase</a> for details.
   * @param input
   *          the {@link TokenStream} to process
   * @param dictionary
   *          the word dictionary to match against.
   * @param minWordSize
   *          only words longer than this get processed
   * @param minSubwordSize
   *          only subwords longer than this get to the output stream
   * @param maxSubwordSize
   *          only subwords shorter than this get to the output stream
   * @param onlyLongestMatch
   *          Add only the longest matching subword to the stream
   */
  public DictionaryCompoundWordTokenFilter(Version matchVersion, TokenStream input, Set<?> dictionary,
      int minWordSize, int minSubwordSize, int maxSubwordSize, boolean onlyLongestMatch) {
    super(matchVersion, input, dictionary, minWordSize, minSubwordSize, maxSubwordSize, onlyLongestMatch);
  }

  @Override
  protected void decompose() {
    final int len = termAtt.length();
    for (int i=0;i<=len-this.minSubwordSize;++i) {
        CompoundToken longestMatchToken=null;
        for (int j=this.minSubwordSize;j<=this.maxSubwordSize;++j) {
            if(i+j>len) {
                break;
            }
            if(dictionary.contains(termAtt.buffer(), i, j)) {
                if (this.onlyLongestMatch) {
                   if (longestMatchToken!=null) {
                     if (longestMatchToken.txt.length()<j) {
                       longestMatchToken=new CompoundToken(i,j);
                     }
                   } else {
                     longestMatchToken=new CompoundToken(i,j);
                   }
                } else {
                   tokens.add(new CompoundToken(i,j));
                }
            } 
        }
        if (this.onlyLongestMatch && longestMatchToken!=null) {
          tokens.add(longestMatchToken);
        }
    }
  }
}
