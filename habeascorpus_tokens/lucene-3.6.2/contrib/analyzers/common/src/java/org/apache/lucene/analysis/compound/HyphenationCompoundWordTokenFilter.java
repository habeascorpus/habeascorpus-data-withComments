package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
compound	TokenNameIdentifier	 compound
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenFilter	TokenNameIdentifier	 Token Filter
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
compound	TokenNameIdentifier	 compound
.	TokenNameDOT	
hyphenation	TokenNameIdentifier	 hyphenation
.	TokenNameDOT	
Hyphenation	TokenNameIdentifier	 Hyphenation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
compound	TokenNameIdentifier	 compound
.	TokenNameDOT	
hyphenation	TokenNameIdentifier	 hyphenation
.	TokenNameDOT	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
/** * A {@link TokenFilter} that decomposes compound words found in many Germanic languages. * <p> * "Donaudampfschiff" becomes Donau, dampf, schiff so that you can find * "Donaudampfschiff" even when you only enter "schiff". It uses a hyphenation * grammar and a word dictionary to achieve this. * <p> * You must specify the required {@link Version} compatibility when creating * CompoundWordTokenFilterBase: * <ul> * <li>As of 3.1, CompoundWordTokenFilterBase correctly handles Unicode 4.0 * supplementary characters in strings and char arrays provided as compound word * dictionaries. * </ul> * <p>If you pass in a {@link org.apache.lucene.analysis.CharArraySet} as dictionary, * it should be case-insensitive unless it contains only lowercased entries and you * have {@link org.apache.lucene.analysis.LowerCaseFilter} before this filter in your analysis chain. * For optional performance (as this filter does lots of lookups to the dictionary, * you should use the latter analysis chain/CharArraySet). Be aware: If you supply arbitrary * {@link Set Sets} to the ctors or {@code String[]} dictionaries, they will be automatically * transformed to case-insensitive! */	TokenNameCOMMENT_JAVADOC	 A {@link TokenFilter} that decomposes compound words found in many Germanic languages. <p> "Donaudampfschiff" becomes Donau, dampf, schiff so that you can find "Donaudampfschiff" even when you only enter "schiff". It uses a hyphenation grammar and a word dictionary to achieve this. <p> You must specify the required {@link Version} compatibility when creating CompoundWordTokenFilterBase: <ul> <li>As of 3.1, CompoundWordTokenFilterBase correctly handles Unicode 4.0 supplementary characters in strings and char arrays provided as compound word dictionaries. </ul> <p>If you pass in a {@link org.apache.lucene.analysis.CharArraySet} as dictionary, it should be case-insensitive unless it contains only lowercased entries and you have {@link org.apache.lucene.analysis.LowerCaseFilter} before this filter in your analysis chain. For optional performance (as this filter does lots of lookups to the dictionary, you should use the latter analysis chain/CharArraySet). Be aware: If you supply arbitrary {@link Set Sets} to the ctors or {@code String[]} dictionaries, they will be automatically transformed to case-insensitive! 
public	TokenNamepublic	
class	TokenNameclass	
HyphenationCompoundWordTokenFilter	TokenNameIdentifier	 Hyphenation Compound Word Token Filter
extends	TokenNameextends	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
{	TokenNameLBRACE	
private	TokenNameprivate	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
hyphenator	TokenNameIdentifier	 hyphenator
;	TokenNameSEMICOLON	
/** * Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * * @param matchVersion * Lucene version to enable correct Unicode 4.0 behavior in the * dictionaries if Version > 3.0. See <a * href="CompoundWordTokenFilterBase#version" * >CompoundWordTokenFilterBase</a> for details. * @param input * the {@link TokenStream} to process * @param hyphenator * the hyphenation pattern tree to use for hyphenation * @param dictionary * the word dictionary to match against * @param minWordSize * only words longer than this get processed * @param minSubwordSize * only subwords longer than this get to the output stream * @param maxSubwordSize * only subwords shorter than this get to the output stream * @param onlyLongestMatch * Add only the longest matching subword to the stream * @deprecated Use the constructors taking {@link Set} */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the dictionaries if Version > 3.0. See <a href="CompoundWordTokenFilterBase#version" >CompoundWordTokenFilterBase</a> for details. @param input the {@link TokenStream} to process @param hyphenator the hyphenation pattern tree to use for hyphenation @param dictionary the word dictionary to match against @param minWordSize only words longer than this get processed @param minSubwordSize only subwords longer than this get to the output stream @param maxSubwordSize only subwords shorter than this get to the output stream @param onlyLongestMatch Add only the longest matching subword to the stream @deprecated Use the constructors taking {@link Set} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
HyphenationCompoundWordTokenFilter	TokenNameIdentifier	 Hyphenation Compound Word Token Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
int	TokenNameint	
minWordSize	TokenNameIdentifier	 min Word Size
,	TokenNameCOMMA	
int	TokenNameint	
minSubwordSize	TokenNameIdentifier	 min Subword Size
,	TokenNameCOMMA	
int	TokenNameint	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
makeDictionary	TokenNameIdentifier	 make Dictionary
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
,	TokenNameCOMMA	
minWordSize	TokenNameIdentifier	 min Word Size
,	TokenNameCOMMA	
minSubwordSize	TokenNameIdentifier	 min Subword Size
,	TokenNameCOMMA	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
,	TokenNameCOMMA	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * * @param matchVersion * Lucene version to enable correct Unicode 4.0 behavior in the * dictionaries if Version > 3.0. See <a * href="CompoundWordTokenFilterBase#version" * >CompoundWordTokenFilterBase</a> for details. * @param input * the {@link TokenStream} to process * @param hyphenator * the hyphenation pattern tree to use for hyphenation * @param dictionary * the word dictionary to match against * @deprecated Use the constructors taking {@link Set} */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the dictionaries if Version > 3.0. See <a href="CompoundWordTokenFilterBase#version" >CompoundWordTokenFilterBase</a> for details. @param input the {@link TokenStream} to process @param hyphenator the hyphenation pattern tree to use for hyphenation @param dictionary the word dictionary to match against @deprecated Use the constructors taking {@link Set} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
HyphenationCompoundWordTokenFilter	TokenNameIdentifier	 Hyphenation Compound Word Token Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
makeDictionary	TokenNameIdentifier	 make Dictionary
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DEFAULT_MIN_WORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  WORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MIN_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SUBWORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MAX_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SUBWORD  SIZE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * * @param matchVersion * Lucene version to enable correct Unicode 4.0 behavior in the * dictionaries if Version > 3.0. See <a * href="CompoundWordTokenFilterBase#version" * >CompoundWordTokenFilterBase</a> for details. * @param input * the {@link TokenStream} to process * @param hyphenator * the hyphenation pattern tree to use for hyphenation * @param dictionary * the word dictionary to match against. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the dictionaries if Version > 3.0. See <a href="CompoundWordTokenFilterBase#version" >CompoundWordTokenFilterBase</a> for details. @param input the {@link TokenStream} to process @param hyphenator the hyphenation pattern tree to use for hyphenation @param dictionary the word dictionary to match against. 
public	TokenNamepublic	
HyphenationCompoundWordTokenFilter	TokenNameIdentifier	 Hyphenation Compound Word Token Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
DEFAULT_MIN_WORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  WORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MIN_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SUBWORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MAX_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SUBWORD  SIZE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * * @param matchVersion * Lucene version to enable correct Unicode 4.0 behavior in the * dictionaries if Version > 3.0. See <a * href="CompoundWordTokenFilterBase#version" * >CompoundWordTokenFilterBase</a> for details. * @param input * the {@link TokenStream} to process * @param hyphenator * the hyphenation pattern tree to use for hyphenation * @param dictionary * the word dictionary to match against. * @param minWordSize * only words longer than this get processed * @param minSubwordSize * only subwords longer than this get to the output stream * @param maxSubwordSize * only subwords shorter than this get to the output stream * @param onlyLongestMatch * Add only the longest matching subword to the stream */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the dictionaries if Version > 3.0. See <a href="CompoundWordTokenFilterBase#version" >CompoundWordTokenFilterBase</a> for details. @param input the {@link TokenStream} to process @param hyphenator the hyphenation pattern tree to use for hyphenation @param dictionary the word dictionary to match against. @param minWordSize only words longer than this get processed @param minSubwordSize only subwords longer than this get to the output stream @param maxSubwordSize only subwords shorter than this get to the output stream @param onlyLongestMatch Add only the longest matching subword to the stream 
public	TokenNamepublic	
HyphenationCompoundWordTokenFilter	TokenNameIdentifier	 Hyphenation Compound Word Token Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
int	TokenNameint	
minWordSize	TokenNameIdentifier	 min Word Size
,	TokenNameCOMMA	
int	TokenNameint	
minSubwordSize	TokenNameIdentifier	 min Subword Size
,	TokenNameCOMMA	
int	TokenNameint	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
minWordSize	TokenNameIdentifier	 min Word Size
,	TokenNameCOMMA	
minSubwordSize	TokenNameIdentifier	 min Subword Size
,	TokenNameCOMMA	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
,	TokenNameCOMMA	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hyphenator	TokenNameIdentifier	 hyphenator
=	TokenNameEQUAL	
hyphenator	TokenNameIdentifier	 hyphenator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a HyphenationCompoundWordTokenFilter with no dictionary. * <p> * Calls {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, Set, int, int, int, boolean) * HyphenationCompoundWordTokenFilter(matchVersion, input, hyphenator, * null, minWordSize, minSubwordSize, maxSubwordSize } */	TokenNameCOMMENT_JAVADOC	 Create a HyphenationCompoundWordTokenFilter with no dictionary. <p> Calls {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, Set, int, int, int, boolean) HyphenationCompoundWordTokenFilter(matchVersion, input, hyphenator, null, minWordSize, minSubwordSize, maxSubwordSize } 
public	TokenNamepublic	
HyphenationCompoundWordTokenFilter	TokenNameIdentifier	 Hyphenation Compound Word Token Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
int	TokenNameint	
minWordSize	TokenNameIdentifier	 min Word Size
,	TokenNameCOMMA	
int	TokenNameint	
minSubwordSize	TokenNameIdentifier	 min Subword Size
,	TokenNameCOMMA	
int	TokenNameint	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
minWordSize	TokenNameIdentifier	 min Word Size
,	TokenNameCOMMA	
minSubwordSize	TokenNameIdentifier	 min Subword Size
,	TokenNameCOMMA	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a HyphenationCompoundWordTokenFilter with no dictionary. * <p> * Calls {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, int, int, int) * HyphenationCompoundWordTokenFilter(matchVersion, input, hyphenator, * DEFAULT_MIN_WORD_SIZE, DEFAULT_MIN_SUBWORD_SIZE, DEFAULT_MAX_SUBWORD_SIZE } */	TokenNameCOMMENT_JAVADOC	 Create a HyphenationCompoundWordTokenFilter with no dictionary. <p> Calls {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, int, int, int) HyphenationCompoundWordTokenFilter(matchVersion, input, hyphenator, DEFAULT_MIN_WORD_SIZE, DEFAULT_MIN_SUBWORD_SIZE, DEFAULT_MAX_SUBWORD_SIZE } 
public	TokenNamepublic	
HyphenationCompoundWordTokenFilter	TokenNameIdentifier	 Hyphenation Compound Word Token Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
hyphenator	TokenNameIdentifier	 hyphenator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
DEFAULT_MIN_WORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  WORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MIN_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SUBWORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MAX_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SUBWORD  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * * @param input the {@link TokenStream} to process * @param hyphenator the hyphenation pattern tree to use for hyphenation * @param dictionary the word dictionary to match against * @param minWordSize only words longer than this get processed * @param minSubwordSize only subwords longer than this get to the output * stream * @param maxSubwordSize only subwords shorter than this get to the output * stream * @param onlyLongestMatch Add only the longest matching subword to the stream * @deprecated use {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, String[], int, int, int, boolean)} instead. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * @param input the {@link TokenStream} to process @param hyphenator the hyphenation pattern tree to use for hyphenation @param dictionary the word dictionary to match against @param minWordSize only words longer than this get processed @param minSubwordSize only subwords longer than this get to the output stream @param maxSubwordSize only subwords shorter than this get to the output stream @param onlyLongestMatch Add only the longest matching subword to the stream @deprecated use {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, String[], int, int, int, boolean)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
HyphenationCompoundWordTokenFilter	TokenNameIdentifier	 Hyphenation Compound Word Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
int	TokenNameint	
minWordSize	TokenNameIdentifier	 min Word Size
,	TokenNameCOMMA	
int	TokenNameint	
minSubwordSize	TokenNameIdentifier	 min Subword Size
,	TokenNameCOMMA	
int	TokenNameint	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
makeDictionary	TokenNameIdentifier	 make Dictionary
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
,	TokenNameCOMMA	
minWordSize	TokenNameIdentifier	 min Word Size
,	TokenNameCOMMA	
minSubwordSize	TokenNameIdentifier	 min Subword Size
,	TokenNameCOMMA	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
,	TokenNameCOMMA	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * * @param input the {@link TokenStream} to process * @param hyphenator the hyphenation pattern tree to use for hyphenation * @param dictionary the word dictionary to match against * @deprecated use {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, String[])} instead. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * @param input the {@link TokenStream} to process @param hyphenator the hyphenation pattern tree to use for hyphenation @param dictionary the word dictionary to match against @deprecated use {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, String[])} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
HyphenationCompoundWordTokenFilter	TokenNameIdentifier	 Hyphenation Compound Word Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
makeDictionary	TokenNameIdentifier	 make Dictionary
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DEFAULT_MIN_WORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  WORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MIN_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SUBWORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MAX_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SUBWORD  SIZE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * * @param input the {@link TokenStream} to process * @param hyphenator the hyphenation pattern tree to use for hyphenation * @param dictionary the word dictionary to match against. If this is a {@link org.apache.lucene.analysis.CharArraySet CharArraySet} it must have set ignoreCase=false and only contain * lower case strings. * @deprecated use {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, Set)} instead. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * @param input the {@link TokenStream} to process @param hyphenator the hyphenation pattern tree to use for hyphenation @param dictionary the word dictionary to match against. If this is a {@link org.apache.lucene.analysis.CharArraySet CharArraySet} it must have set ignoreCase=false and only contain lower case strings. @deprecated use {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, Set)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
HyphenationCompoundWordTokenFilter	TokenNameIdentifier	 Hyphenation Compound Word Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
DEFAULT_MIN_WORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  WORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MIN_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SUBWORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MAX_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SUBWORD  SIZE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * * @param input the {@link TokenStream} to process * @param hyphenator the hyphenation pattern tree to use for hyphenation * @param dictionary the word dictionary to match against. If this is a {@link org.apache.lucene.analysis.CharArraySet CharArraySet} it must have set ignoreCase=false and only contain * lower case strings. * @param minWordSize only words longer than this get processed * @param minSubwordSize only subwords longer than this get to the output * stream * @param maxSubwordSize only subwords shorter than this get to the output * stream * @param onlyLongestMatch Add only the longest matching subword to the stream * @deprecated use {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, Set, int, int, int, boolean)} instead. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link HyphenationCompoundWordTokenFilter} instance. * @param input the {@link TokenStream} to process @param hyphenator the hyphenation pattern tree to use for hyphenation @param dictionary the word dictionary to match against. If this is a {@link org.apache.lucene.analysis.CharArraySet CharArraySet} it must have set ignoreCase=false and only contain lower case strings. @param minWordSize only words longer than this get processed @param minSubwordSize only subwords longer than this get to the output stream @param maxSubwordSize only subwords shorter than this get to the output stream @param onlyLongestMatch Add only the longest matching subword to the stream @deprecated use {@link #HyphenationCompoundWordTokenFilter(Version, TokenStream, HyphenationTree, Set, int, int, int, boolean)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
HyphenationCompoundWordTokenFilter	TokenNameIdentifier	 Hyphenation Compound Word Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
hyphenator	TokenNameIdentifier	 hyphenator
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
int	TokenNameint	
minWordSize	TokenNameIdentifier	 min Word Size
,	TokenNameCOMMA	
int	TokenNameint	
minSubwordSize	TokenNameIdentifier	 min Subword Size
,	TokenNameCOMMA	
int	TokenNameint	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
minWordSize	TokenNameIdentifier	 min Word Size
,	TokenNameCOMMA	
minSubwordSize	TokenNameIdentifier	 min Subword Size
,	TokenNameCOMMA	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
,	TokenNameCOMMA	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hyphenator	TokenNameIdentifier	 hyphenator
=	TokenNameEQUAL	
hyphenator	TokenNameIdentifier	 hyphenator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a hyphenator tree * * @param hyphenationFilename the filename of the XML grammar to load * @return An object representing the hyphenation patterns * @throws Exception */	TokenNameCOMMENT_JAVADOC	 Create a hyphenator tree * @param hyphenationFilename the filename of the XML grammar to load @return An object representing the hyphenation patterns @throws Exception 
public	TokenNamepublic	
static	TokenNamestatic	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
getHyphenationTree	TokenNameIdentifier	 get Hyphenation Tree
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
hyphenationFilename	TokenNameIdentifier	 hyphenation Filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getHyphenationTree	TokenNameIdentifier	 get Hyphenation Tree
(	TokenNameLPAREN	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
hyphenationFilename	TokenNameIdentifier	 hyphenation Filename
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a hyphenator tree * * @param hyphenationFile the file of the XML grammar to load * @return An object representing the hyphenation patterns * @throws Exception */	TokenNameCOMMENT_JAVADOC	 Create a hyphenator tree * @param hyphenationFile the file of the XML grammar to load @return An object representing the hyphenation patterns @throws Exception 
public	TokenNamepublic	
static	TokenNamestatic	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
getHyphenationTree	TokenNameIdentifier	 get Hyphenation Tree
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
hyphenationFile	TokenNameIdentifier	 hyphenation File
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getHyphenationTree	TokenNameIdentifier	 get Hyphenation Tree
(	TokenNameLPAREN	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
hyphenationFile	TokenNameIdentifier	 hyphenation File
.	TokenNameDOT	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toExternalForm	TokenNameIdentifier	 to External Form
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a hyphenator tree * * @param hyphenationReader the reader of the XML grammar to load from * @return An object representing the hyphenation patterns * @throws Exception * @deprecated Don't use Readers with fixed charset to load XML files, unless programatically created. * Use {@link #getHyphenationTree(InputSource)} instead, where you can supply default charset and input * stream, if you like. */	TokenNameCOMMENT_JAVADOC	 Create a hyphenator tree * @param hyphenationReader the reader of the XML grammar to load from @return An object representing the hyphenation patterns @throws Exception @deprecated Don't use Readers with fixed charset to load XML files, unless programatically created. Use {@link #getHyphenationTree(InputSource)} instead, where you can supply default charset and input stream, if you like. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
getHyphenationTree	TokenNameIdentifier	 get Hyphenation Tree
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
hyphenationReader	TokenNameIdentifier	 hyphenation Reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
InputSource	TokenNameIdentifier	 Input Source
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
hyphenationReader	TokenNameIdentifier	 hyphenation Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we need this to load the DTD in very old parsers (like the one in JDK 1.4). 	TokenNameCOMMENT_LINE	we need this to load the DTD in very old parsers (like the one in JDK 1.4). 
// The DTD itsself is provided via EntityResolver, so it should always load, but 	TokenNameCOMMENT_LINE	The DTD itsself is provided via EntityResolver, so it should always load, but 
// some parsers still want to have a base URL (Crimson). 	TokenNameCOMMENT_LINE	some parsers still want to have a base URL (Crimson). 
is	TokenNameIdentifier	 is
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
"urn:java:"	TokenNameStringLiteral	urn:java:
+	TokenNamePLUS	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getHyphenationTree	TokenNameIdentifier	 get Hyphenation Tree
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a hyphenator tree * * @param hyphenationSource the InputSource pointing to the XML grammar * @return An object representing the hyphenation patterns * @throws Exception */	TokenNameCOMMENT_JAVADOC	 Create a hyphenator tree * @param hyphenationSource the InputSource pointing to the XML grammar @return An object representing the hyphenation patterns @throws Exception 
public	TokenNamepublic	
static	TokenNamestatic	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
getHyphenationTree	TokenNameIdentifier	 get Hyphenation Tree
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
hyphenationSource	TokenNameIdentifier	 hyphenation Source
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
tree	TokenNameIdentifier	 tree
=	TokenNameEQUAL	
new	TokenNamenew	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
loadPatterns	TokenNameIdentifier	 load Patterns
(	TokenNameLPAREN	
hyphenationSource	TokenNameIdentifier	 hyphenation Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tree	TokenNameIdentifier	 tree
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the hyphenation points 	TokenNameCOMMENT_LINE	get the hyphenation points 
Hyphenation	TokenNameIdentifier	 Hyphenation
hyphens	TokenNameIdentifier	 hyphens
=	TokenNameEQUAL	
hyphenator	TokenNameIdentifier	 hyphenator
.	TokenNameDOT	
hyphenate	TokenNameIdentifier	 hyphenate
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// No hyphen points found -> exit 	TokenNameCOMMENT_LINE	No hyphen points found -> exit 
if	TokenNameif	
(	TokenNameLPAREN	
hyphens	TokenNameIdentifier	 hyphens
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hyp	TokenNameIdentifier	 hyp
=	TokenNameEQUAL	
hyphens	TokenNameIdentifier	 hyphens
.	TokenNameDOT	
getHyphenationPoints	TokenNameIdentifier	 get Hyphenation Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
hyp	TokenNameIdentifier	 hyp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
remaining	TokenNameIdentifier	 remaining
=	TokenNameEQUAL	
hyp	TokenNameIdentifier	 hyp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
hyp	TokenNameIdentifier	 hyp
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
CompoundToken	TokenNameIdentifier	 Compound Token
longestMatchToken	TokenNameIdentifier	 longest Match Token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
remaining	TokenNameIdentifier	 remaining
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
partLength	TokenNameIdentifier	 part Length
=	TokenNameEQUAL	
hyp	TokenNameIdentifier	 hyp
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
// if the part is longer than maxSubwordSize we 	TokenNameCOMMENT_LINE	if the part is longer than maxSubwordSize we 
// are done with this round 	TokenNameCOMMENT_LINE	are done with this round 
if	TokenNameif	
(	TokenNameLPAREN	
partLength	TokenNameIdentifier	 part Length
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we only put subwords to the token stream 	TokenNameCOMMENT_LINE	we only put subwords to the token stream 
// that are longer than minPartSize 	TokenNameCOMMENT_LINE	that are longer than minPartSize 
if	TokenNameif	
(	TokenNameLPAREN	
partLength	TokenNameIdentifier	 part Length
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
minSubwordSize	TokenNameIdentifier	 min Subword Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// BOGUS/BROKEN/FUNKY/WACKO: somehow we have negative 'parts' according to the 	TokenNameCOMMENT_LINE	BOGUS/BROKEN/FUNKY/WACKO: somehow we have negative 'parts' according to the 
// calculation above, and we rely upon minSubwordSize being >=0 to filter them out... 	TokenNameCOMMENT_LINE	calculation above, and we rely upon minSubwordSize being >=0 to filter them out... 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check the dictionary 	TokenNameCOMMENT_LINE	check the dictionary 
if	TokenNameif	
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
partLength	TokenNameIdentifier	 part Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
longestMatchToken	TokenNameIdentifier	 longest Match Token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
longestMatchToken	TokenNameIdentifier	 longest Match Token
.	TokenNameDOT	
txt	TokenNameIdentifier	 txt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
partLength	TokenNameIdentifier	 part Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
longestMatchToken	TokenNameIdentifier	 longest Match Token
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundToken	TokenNameIdentifier	 Compound Token
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
partLength	TokenNameIdentifier	 part Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
longestMatchToken	TokenNameIdentifier	 longest Match Token
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundToken	TokenNameIdentifier	 Compound Token
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
partLength	TokenNameIdentifier	 part Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CompoundToken	TokenNameIdentifier	 Compound Token
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
partLength	TokenNameIdentifier	 part Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
partLength	TokenNameIdentifier	 part Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check the dictionary again with a word that is one character 	TokenNameCOMMENT_LINE	check the dictionary again with a word that is one character 
// shorter 	TokenNameCOMMENT_LINE	shorter 
// to avoid problems with genitive 's characters and other binding 	TokenNameCOMMENT_LINE	to avoid problems with genitive 's characters and other binding 
// characters 	TokenNameCOMMENT_LINE	characters 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
longestMatchToken	TokenNameIdentifier	 longest Match Token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
longestMatchToken	TokenNameIdentifier	 longest Match Token
.	TokenNameDOT	
txt	TokenNameIdentifier	 txt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
partLength	TokenNameIdentifier	 part Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
longestMatchToken	TokenNameIdentifier	 longest Match Token
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundToken	TokenNameIdentifier	 Compound Token
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
partLength	TokenNameIdentifier	 part Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
longestMatchToken	TokenNameIdentifier	 longest Match Token
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundToken	TokenNameIdentifier	 Compound Token
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
partLength	TokenNameIdentifier	 part Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CompoundToken	TokenNameIdentifier	 Compound Token
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
partLength	TokenNameIdentifier	 part Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
&&	TokenNameAND_AND	
longestMatchToken	TokenNameIdentifier	 longest Match Token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
longestMatchToken	TokenNameIdentifier	 longest Match Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
