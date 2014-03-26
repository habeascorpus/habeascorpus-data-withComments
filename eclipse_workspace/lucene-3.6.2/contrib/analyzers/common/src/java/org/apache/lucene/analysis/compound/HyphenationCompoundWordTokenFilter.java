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

import java.io.File;
import java.io.Reader;
import java.util.Set;

import org.apache.lucene.analysis.TokenFilter; // for javadocs
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.compound.hyphenation.Hyphenation;
import org.apache.lucene.analysis.compound.hyphenation.HyphenationTree;
import org.apache.lucene.util.Version;
import org.xml.sax.InputSource;

/**
 * A {@link TokenFilter} that decomposes compound words found in many Germanic languages.
 * <p>
 * "Donaudampfschiff" becomes Donau, dampf, schiff so that you can find
 * "Donaudampfschiff" even when you only enter "schiff". It uses a hyphenation
 * grammar and a word dictionary to achieve this.
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
public class HyphenationCompoundWordTokenFilter extends
    CompoundWordTokenFilterBase {
  private HyphenationTree hyphenator;
  
  /**
   * Creates a new {@link HyphenationCompoundWordTokenFilter} instance.
   *  
   * @param matchVersion
   *          Lucene version to enable correct Unicode 4.0 behavior in the
   *          dictionaries if Version > 3.0. See <a
   *          href="CompoundWordTokenFilterBase#version"
   *          >CompoundWordTokenFilterBase</a> for details.
   * @param input
   *          the {@link TokenStream} to process
   * @param hyphenator
   *          the hyphenation pattern tree to use for hyphenation
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
  public HyphenationCompoundWordTokenFilter(Version matchVersion, TokenStream input,
      HyphenationTree hyphenator, String[] dictionary, int minWordSize,
      int minSubwordSize, int maxSubwordSize, boolean onlyLongestMatch) {
    this(matchVersion, input, hyphenator, makeDictionary(matchVersion, dictionary), minWordSize,
        minSubwordSize, maxSubwordSize, onlyLongestMatch);
  }

  /**
   * Creates a new {@link HyphenationCompoundWordTokenFilter} instance.
   *  
   * @param matchVersion
   *          Lucene version to enable correct Unicode 4.0 behavior in the
   *          dictionaries if Version > 3.0. See <a
   *          href="CompoundWordTokenFilterBase#version"
   *          >CompoundWordTokenFilterBase</a> for details.
   * @param input
   *          the {@link TokenStream} to process
   * @param hyphenator
   *          the hyphenation pattern tree to use for hyphenation
   * @param dictionary
   *          the word dictionary to match against
   * @deprecated Use the constructors taking {@link Set}
   */
  @Deprecated
  public HyphenationCompoundWordTokenFilter(Version matchVersion, TokenStream input,
      HyphenationTree hyphenator, String[] dictionary) {
    this(Version.LUCENE_30, input, hyphenator, makeDictionary(Version.LUCENE_30,dictionary), DEFAULT_MIN_WORD_SIZE,
        DEFAULT_MIN_SUBWORD_SIZE, DEFAULT_MAX_SUBWORD_SIZE, false);
  }

  /**
   * Creates a new {@link HyphenationCompoundWordTokenFilter} instance. 
   * 
   * @param matchVersion
   *          Lucene version to enable correct Unicode 4.0 behavior in the
   *          dictionaries if Version > 3.0. See <a
   *          href="CompoundWordTokenFilterBase#version"
   *          >CompoundWordTokenFilterBase</a> for details.
   * @param input
   *          the {@link TokenStream} to process
   * @param hyphenator
   *          the hyphenation pattern tree to use for hyphenation
   * @param dictionary
   *          the word dictionary to match against.
   */
  public HyphenationCompoundWordTokenFilter(Version matchVersion, TokenStream input,
      HyphenationTree hyphenator, Set<?> dictionary) {
    this(input, hyphenator, dictionary, DEFAULT_MIN_WORD_SIZE,
        DEFAULT_MIN_SUBWORD_SIZE, DEFAULT_MAX_SUBWORD_SIZE, false);
  }

  /**
   * Creates a new {@link HyphenationCompoundWordTokenFilter} instance.
   * 
   * @param matchVersion
   *          Lucene version to enable correct Unicode 4.0 behavior in the
   *          dictionaries if Version > 3.0. See <a
   *          href="CompoundWordTokenFilterBase#version"
   *          >CompoundWordTokenFilterBase</a> for details.
   * @param input
   *          the {@link TokenStream} to process
   * @param hyphenator
   *          the hyphenation pattern tree to use for hyphenation
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
  public HyphenationCompoundWordTokenFilter(Version matchVersion, TokenStream input,
      HyphenationTree hyphenator, Set<?> dictionary, int minWordSize,
      int minSubwordSize, int maxSubwordSize, boolean onlyLongestMatch) {
    super(matchVersion, input, dictionary, minWordSize, minSubwordSize, maxSubwordSize,
        onlyLongestMatch);

    this.hyphenator = hyphenator;
  }

  /**
   * Create a HyphenationCompoundWordTokenFilter with no dictionary.
   * <p>
   * Calls {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, Set, int, int, int, boolean)
   * HyphenationCompoundWordTokenFilter(matchVersion, input, hyphenator,
   * null, minWordSize, minSubwordSize, maxSubwordSize }
   */
  public HyphenationCompoundWordTokenFilter(Version matchVersion, TokenStream input,
      HyphenationTree hyphenator, int minWordSize, int minSubwordSize,
      int maxSubwordSize) {
    this(matchVersion, input, hyphenator, (Set<?>) null, minWordSize, minSubwordSize,
        maxSubwordSize, false);
  }
  
  /**
   * Create a HyphenationCompoundWordTokenFilter with no dictionary.
   * <p>
   * Calls {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, int, int, int) 
   * HyphenationCompoundWordTokenFilter(matchVersion, input, hyphenator, 
   * DEFAULT_MIN_WORD_SIZE, DEFAULT_MIN_SUBWORD_SIZE, DEFAULT_MAX_SUBWORD_SIZE }
   */
  public HyphenationCompoundWordTokenFilter(Version matchVersion, TokenStream input,
      HyphenationTree hyphenator) {
    this(matchVersion, input, hyphenator, DEFAULT_MIN_WORD_SIZE, DEFAULT_MIN_SUBWORD_SIZE, 
        DEFAULT_MAX_SUBWORD_SIZE);
  }

  /**
   * Creates a new {@link HyphenationCompoundWordTokenFilter} instance.
   * 
   * @param input the {@link TokenStream} to process
   * @param hyphenator the hyphenation pattern tree to use for hyphenation
   * @param dictionary the word dictionary to match against
   * @param minWordSize only words longer than this get processed
   * @param minSubwordSize only subwords longer than this get to the output
   *        stream
   * @param maxSubwordSize only subwords shorter than this get to the output
   *        stream
   * @param onlyLongestMatch Add only the longest matching subword to the stream
   * @deprecated use {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, String[], int, int, int, boolean)} instead. 
   */
  @Deprecated
  public HyphenationCompoundWordTokenFilter(TokenStream input,
      HyphenationTree hyphenator, String[] dictionary, int minWordSize,
      int minSubwordSize, int maxSubwordSize, boolean onlyLongestMatch) {
    this(Version.LUCENE_30, input, hyphenator, makeDictionary(Version.LUCENE_30, dictionary), minWordSize,
        minSubwordSize, maxSubwordSize, onlyLongestMatch);
  }

  /**
   * Creates a new {@link HyphenationCompoundWordTokenFilter} instance.
   *  
   * @param input the {@link TokenStream} to process
   * @param hyphenator the hyphenation pattern tree to use for hyphenation
   * @param dictionary the word dictionary to match against
   * @deprecated use {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, String[])} instead.
   */
  @Deprecated
  public HyphenationCompoundWordTokenFilter(TokenStream input,
      HyphenationTree hyphenator, String[] dictionary) {
    this(Version.LUCENE_30, input, hyphenator, makeDictionary(Version.LUCENE_30, dictionary), DEFAULT_MIN_WORD_SIZE,
        DEFAULT_MIN_SUBWORD_SIZE, DEFAULT_MAX_SUBWORD_SIZE, false);
  }

  /**
   * Creates a new {@link HyphenationCompoundWordTokenFilter} instance.
   *  
   * @param input the {@link TokenStream} to process
   * @param hyphenator the hyphenation pattern tree to use for hyphenation
   * @param dictionary the word dictionary to match against. If this is a {@link org.apache.lucene.analysis.CharArraySet CharArraySet} it must have set ignoreCase=false and only contain
   *        lower case strings. 
   * @deprecated use {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, Set)} instead.        
   */
  @Deprecated
  public HyphenationCompoundWordTokenFilter(TokenStream input,
      HyphenationTree hyphenator, Set<?> dictionary) {
    this(Version.LUCENE_30, input, hyphenator, dictionary, DEFAULT_MIN_WORD_SIZE,
        DEFAULT_MIN_SUBWORD_SIZE, DEFAULT_MAX_SUBWORD_SIZE, false);
  }

  /**
   * Creates a new {@link HyphenationCompoundWordTokenFilter} instance.
   *  
   * @param input the {@link TokenStream} to process
   * @param hyphenator the hyphenation pattern tree to use for hyphenation
   * @param dictionary the word dictionary to match against. If this is a {@link org.apache.lucene.analysis.CharArraySet CharArraySet} it must have set ignoreCase=false and only contain
   *        lower case strings. 
   * @param minWordSize only words longer than this get processed
   * @param minSubwordSize only subwords longer than this get to the output
   *        stream
   * @param maxSubwordSize only subwords shorter than this get to the output
   *        stream
   * @param onlyLongestMatch Add only the longest matching subword to the stream
   * @deprecated use {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, Set, int, int, int, boolean)} instead.
   */
  @Deprecated
  public HyphenationCompoundWordTokenFilter(TokenStream input,
      HyphenationTree hyphenator, Set<?> dictionary, int minWordSize,
      int minSubwordSize, int maxSubwordSize, boolean onlyLongestMatch) {
    super(Version.LUCENE_30, input, dictionary, minWordSize, minSubwordSize, maxSubwordSize,
        onlyLongestMatch);

    this.hyphenator = hyphenator;
  }

  /**
   * Create a hyphenator tree
   * 
   * @param hyphenationFilename the filename of the XML grammar to load
   * @return An object representing the hyphenation patterns
   * @throws Exception
   */
  public static HyphenationTree getHyphenationTree(String hyphenationFilename)
      throws Exception {
    return getHyphenationTree(new InputSource(hyphenationFilename));
  }

  /**
   * Create a hyphenator tree
   * 
   * @param hyphenationFile the file of the XML grammar to load
   * @return An object representing the hyphenation patterns
   * @throws Exception
   */
  public static HyphenationTree getHyphenationTree(File hyphenationFile)
      throws Exception {
    return getHyphenationTree(new InputSource(hyphenationFile.toURL().toExternalForm()));
  }

  /**
   * Create a hyphenator tree
   * 
   * @param hyphenationReader the reader of the XML grammar to load from
   * @return An object representing the hyphenation patterns
   * @throws Exception
   * @deprecated Don't use Readers with fixed charset to load XML files, unless programatically created.
   * Use {@link #getHyphenationTree(InputSource)} instead, where you can supply default charset and input
   * stream, if you like.
   */
  @Deprecated
  public static HyphenationTree getHyphenationTree(Reader hyphenationReader)
      throws Exception {
    final InputSource is = new InputSource(hyphenationReader);
    // we need this to load the DTD in very old parsers (like the one in JDK 1.4).
    // The DTD itsself is provided via EntityResolver, so it should always load, but
    // some parsers still want to have a base URL (Crimson).
    is.setSystemId("urn:java:" + HyphenationTree.class.getName());
    return getHyphenationTree(is);
  }

  /**
   * Create a hyphenator tree
   * 
   * @param hyphenationSource the InputSource pointing to the XML grammar
   * @return An object representing the hyphenation patterns
   * @throws Exception
   */
  public static HyphenationTree getHyphenationTree(InputSource hyphenationSource)
      throws Exception {
    HyphenationTree tree = new HyphenationTree();
    tree.loadPatterns(hyphenationSource);
    return tree;
  }

  @Override
  protected void decompose() {
    // get the hyphenation points
    Hyphenation hyphens = hyphenator.hyphenate(termAtt.buffer(), 0, termAtt.length(), 1, 1);
    // No hyphen points found -> exit
    if (hyphens == null) {
      return;
    }

    final int[] hyp = hyphens.getHyphenationPoints();

    for (int i = 0; i < hyp.length; ++i) {
      int remaining = hyp.length - i;
      int start = hyp[i];
      CompoundToken longestMatchToken = null;
      for (int j = 1; j < remaining; j++) {
        int partLength = hyp[i + j] - start;

        // if the part is longer than maxSubwordSize we
        // are done with this round
        if (partLength > this.maxSubwordSize) {
          break;
        }

        // we only put subwords to the token stream
        // that are longer than minPartSize
        if (partLength < this.minSubwordSize) {
          // BOGUS/BROKEN/FUNKY/WACKO: somehow we have negative 'parts' according to the 
          // calculation above, and we rely upon minSubwordSize being >=0 to filter them out...
          continue;
        }

        // check the dictionary
        if (dictionary == null || dictionary.contains(termAtt.buffer(), start, partLength)) {
          if (this.onlyLongestMatch) {
            if (longestMatchToken != null) {
              if (longestMatchToken.txt.length() < partLength) {
                longestMatchToken = new CompoundToken(start, partLength);
              }
            } else {
              longestMatchToken = new CompoundToken(start, partLength);
            }
          } else {
            tokens.add(new CompoundToken(start, partLength));
          }
        } else if (dictionary.contains(termAtt.buffer(), start, partLength - 1)) {
          // check the dictionary again with a word that is one character
          // shorter
          // to avoid problems with genitive 's characters and other binding
          // characters
          if (this.onlyLongestMatch) {
            if (longestMatchToken != null) {
              if (longestMatchToken.txt.length() < partLength - 1) {
                longestMatchToken = new CompoundToken(start, partLength - 1);
              }
            } else {
              longestMatchToken = new CompoundToken(start, partLength - 1);
            }
          } else {
            tokens.add(new CompoundToken(start, partLength - 1));
          }
        }
      }
      if (this.onlyLongestMatch && longestMatchToken!=null) {
        tokens.add(longestMatchToken);
      }
    }
  }
}
