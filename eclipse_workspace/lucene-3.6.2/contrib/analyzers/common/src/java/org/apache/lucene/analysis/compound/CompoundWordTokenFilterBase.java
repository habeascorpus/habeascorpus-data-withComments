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

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;

import org.apache.lucene.analysis.CharArraySet;
import org.apache.lucene.analysis.TokenFilter;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;
import org.apache.lucene.analysis.tokenattributes.PositionIncrementAttribute;
import org.apache.lucene.util.AttributeSource;
import org.apache.lucene.util.Version;

/**
 * Base class for decomposition token filters.
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
public abstract class CompoundWordTokenFilterBase extends TokenFilter {
  /**
   * The default for minimal word length that gets decomposed
   */
  public static final int DEFAULT_MIN_WORD_SIZE = 5;

  /**
   * The default for minimal length of subwords that get propagated to the output of this filter
   */
  public static final int DEFAULT_MIN_SUBWORD_SIZE = 2;

  /**
   * The default for maximal length of subwords that get propagated to the output of this filter
   */
  public static final int DEFAULT_MAX_SUBWORD_SIZE = 15;
  
  protected final CharArraySet dictionary;
  protected final LinkedList<CompoundToken> tokens;
  protected final int minWordSize;
  protected final int minSubwordSize;
  protected final int maxSubwordSize;
  protected final boolean onlyLongestMatch;
  
  protected final CharTermAttribute termAtt = addAttribute(CharTermAttribute.class);
  protected final OffsetAttribute offsetAtt = addAttribute(OffsetAttribute.class);
  private final PositionIncrementAttribute posIncAtt = addAttribute(PositionIncrementAttribute.class);
  
  private AttributeSource.State current;

  /**
   * @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, String[], int, int, int, boolean)} instead
   */
  @Deprecated
  protected CompoundWordTokenFilterBase(TokenStream input, String[] dictionary, int minWordSize, int minSubwordSize, int maxSubwordSize, boolean onlyLongestMatch) {
    this(Version.LUCENE_30, input, makeDictionary(Version.LUCENE_30, dictionary),minWordSize,minSubwordSize,maxSubwordSize, onlyLongestMatch);
  }
  
  /**
   * @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, String[], boolean)} instead
   */
  @Deprecated
  protected CompoundWordTokenFilterBase(TokenStream input, String[] dictionary, boolean onlyLongestMatch) {
    this(Version.LUCENE_30, input, makeDictionary(Version.LUCENE_30, dictionary),DEFAULT_MIN_WORD_SIZE,DEFAULT_MIN_SUBWORD_SIZE,DEFAULT_MAX_SUBWORD_SIZE, onlyLongestMatch);
  }
  
  /**
   * @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, Set, boolean)} instead
   */
  @Deprecated
  protected CompoundWordTokenFilterBase(TokenStream input, Set<?> dictionary, boolean onlyLongestMatch) {
    this(Version.LUCENE_30, input, dictionary,DEFAULT_MIN_WORD_SIZE,DEFAULT_MIN_SUBWORD_SIZE,DEFAULT_MAX_SUBWORD_SIZE, onlyLongestMatch);
  }
  
  /**
   * @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, String[])} instead
   */
  @Deprecated
  protected CompoundWordTokenFilterBase(TokenStream input, String[] dictionary) {
    this(Version.LUCENE_30, input, makeDictionary(Version.LUCENE_30, dictionary),DEFAULT_MIN_WORD_SIZE,DEFAULT_MIN_SUBWORD_SIZE,DEFAULT_MAX_SUBWORD_SIZE, false);
  }
  
  /**
   * @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, Set)} instead
   */
  @Deprecated
  protected CompoundWordTokenFilterBase(TokenStream input, Set<?> dictionary) {
    this(Version.LUCENE_30, input, dictionary,DEFAULT_MIN_WORD_SIZE,DEFAULT_MIN_SUBWORD_SIZE,DEFAULT_MAX_SUBWORD_SIZE, false);
  }

  /**
   * @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, Set, int, int, int, boolean)} instead
   */
  @Deprecated
  protected CompoundWordTokenFilterBase(TokenStream input, Set<?> dictionary, int minWordSize, int minSubwordSize, int maxSubwordSize, boolean onlyLongestMatch) {
    this(Version.LUCENE_30, input, dictionary, minWordSize, minSubwordSize, maxSubwordSize, onlyLongestMatch);
  }
  
  protected CompoundWordTokenFilterBase(Version matchVersion, TokenStream input, String[] dictionary, int minWordSize, int minSubwordSize, int maxSubwordSize, boolean onlyLongestMatch) {
    this(matchVersion, input,makeDictionary(matchVersion, dictionary),minWordSize,minSubwordSize,maxSubwordSize, onlyLongestMatch);
  }
  
  protected CompoundWordTokenFilterBase(Version matchVersion, TokenStream input, String[] dictionary, boolean onlyLongestMatch) {
    this(matchVersion, input,makeDictionary(matchVersion, dictionary),DEFAULT_MIN_WORD_SIZE,DEFAULT_MIN_SUBWORD_SIZE,DEFAULT_MAX_SUBWORD_SIZE, onlyLongestMatch);
  }

  protected CompoundWordTokenFilterBase(Version matchVersion, TokenStream input, Set<?> dictionary, boolean onlyLongestMatch) {
    this(matchVersion, input,dictionary,DEFAULT_MIN_WORD_SIZE,DEFAULT_MIN_SUBWORD_SIZE,DEFAULT_MAX_SUBWORD_SIZE, onlyLongestMatch);
  }

  protected CompoundWordTokenFilterBase(Version matchVersion, TokenStream input, String[] dictionary) {
    this(matchVersion, input,makeDictionary(matchVersion, dictionary),DEFAULT_MIN_WORD_SIZE,DEFAULT_MIN_SUBWORD_SIZE,DEFAULT_MAX_SUBWORD_SIZE, false);
  }

  protected CompoundWordTokenFilterBase(Version matchVersion, TokenStream input, Set<?> dictionary) {
    this(matchVersion, input,dictionary,DEFAULT_MIN_WORD_SIZE,DEFAULT_MIN_SUBWORD_SIZE,DEFAULT_MAX_SUBWORD_SIZE, false);
  }

  protected CompoundWordTokenFilterBase(Version matchVersion, TokenStream input, Set<?> dictionary, int minWordSize, int minSubwordSize, int maxSubwordSize, boolean onlyLongestMatch) {
    super(input);
    
    this.tokens=new LinkedList<CompoundToken>();
    if (minWordSize < 0) {
      throw new IllegalArgumentException("minWordSize cannot be negative");
    }
    this.minWordSize=minWordSize;
    if (minSubwordSize < 0) {
      throw new IllegalArgumentException("minSubwordSize cannot be negative");
    }
    this.minSubwordSize=minSubwordSize;
    if (maxSubwordSize < 0) {
      throw new IllegalArgumentException("maxSubwordSize cannot be negative");
    }
    this.maxSubwordSize=maxSubwordSize;
    this.onlyLongestMatch=onlyLongestMatch;
    
    if (dictionary==null || dictionary instanceof CharArraySet) {
      this.dictionary = (CharArraySet) dictionary;
    } else {
      this.dictionary = new CharArraySet(matchVersion, dictionary, true);
    }
  }
  
  /** @deprecated Only available for backwards compatibility. */
  @Deprecated
  public static CharArraySet makeDictionary(final Version matchVersion, final String[] dictionary) {
    if (dictionary == null) {
      return null;
    }
    return new CharArraySet(matchVersion, Arrays.asList(dictionary), true);
  }
  
  @Override
  public final boolean incrementToken() throws IOException {
    if (!tokens.isEmpty()) {
      assert current != null;
      CompoundToken token = tokens.removeFirst();
      restoreState(current); // keep all other attributes untouched
      termAtt.setEmpty().append(token.txt);
      offsetAtt.setOffset(token.startOffset, token.endOffset);
      posIncAtt.setPositionIncrement(0);
      return true;
    }

    current = null; // not really needed, but for safety
    if (input.incrementToken()) {
      // Only words longer than minWordSize get processed
      if (termAtt.length() >= this.minWordSize) {
        decompose();
        // only capture the state if we really need it for producing new tokens
        if (!tokens.isEmpty()) {
          current = captureState();
        }
      }
      // return original token:
      return true;
    } else {
      return false;
    }
  }

  /** Decomposes the current {@link #termAtt} and places {@link CompoundToken} instances in the {@link #tokens} list.
   * The original token may not be placed in the list, as it is automatically passed through this filter.
   */
  protected abstract void decompose();

  @Override
  public void reset() throws IOException {
    super.reset();
    tokens.clear();
    current = null;
  }
  
  /**
   * Helper class to hold decompounded token information
   */
  protected class CompoundToken {
    public final CharSequence txt;
    public final int startOffset, endOffset;

    /** Construct the compound token based on a slice of the current {@link CompoundWordTokenFilterBase#termAtt}. */
    public CompoundToken(int offset, int length) {
      this.txt = CompoundWordTokenFilterBase.this.termAtt.subSequence(offset, offset + length);
      
      // offsets of the original word
      int startOff = CompoundWordTokenFilterBase.this.offsetAtt.startOffset();
      int endOff = CompoundWordTokenFilterBase.this.offsetAtt.endOffset();
      
      if (endOff - startOff != CompoundWordTokenFilterBase.this.termAtt.length()) {
        // if length by start + end offsets doesn't match the term text then assume
        // this is a synonym and don't adjust the offsets.
        this.startOffset = startOff;
        this.endOffset = endOff;
      } else {
        final int newStart = startOff + offset;
        this.startOffset = newStart;
        this.endOffset = newStart + length;
      }
    }

  }  
}
