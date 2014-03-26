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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * A {@link TokenFilter} that decomposes compound words found in many Germanic languages. * <p> * "Donaudampfschiff" becomes Donau, dampf, schiff so that you can find * "Donaudampfschiff" even when you only enter "schiff". * It uses a brute-force algorithm to achieve this. * <p> * You must specify the required {@link Version} compatibility when creating * CompoundWordTokenFilterBase: * <ul> * <li>As of 3.1, CompoundWordTokenFilterBase correctly handles Unicode 4.0 * supplementary characters in strings and char arrays provided as compound word * dictionaries. * </ul> * <p>If you pass in a {@link org.apache.lucene.analysis.CharArraySet} as dictionary, * it should be case-insensitive unless it contains only lowercased entries and you * have {@link org.apache.lucene.analysis.LowerCaseFilter} before this filter in your analysis chain. * For optional performance (as this filter does lots of lookups to the dictionary, * you should use the latter analysis chain/CharArraySet). Be aware: If you supply arbitrary * {@link Set Sets} to the ctors or {@code String[]} dictionaries, they will be automatically * transformed to case-insensitive! */	TokenNameCOMMENT_JAVADOC	 A {@link TokenFilter} that decomposes compound words found in many Germanic languages. <p> "Donaudampfschiff" becomes Donau, dampf, schiff so that you can find "Donaudampfschiff" even when you only enter "schiff". It uses a brute-force algorithm to achieve this. <p> You must specify the required {@link Version} compatibility when creating CompoundWordTokenFilterBase: <ul> <li>As of 3.1, CompoundWordTokenFilterBase correctly handles Unicode 4.0 supplementary characters in strings and char arrays provided as compound word dictionaries. </ul> <p>If you pass in a {@link org.apache.lucene.analysis.CharArraySet} as dictionary, it should be case-insensitive unless it contains only lowercased entries and you have {@link org.apache.lucene.analysis.LowerCaseFilter} before this filter in your analysis chain. For optional performance (as this filter does lots of lookups to the dictionary, you should use the latter analysis chain/CharArraySet). Be aware: If you supply arbitrary {@link Set Sets} to the ctors or {@code String[]} dictionaries, they will be automatically transformed to case-insensitive! 
public	TokenNamepublic	
class	TokenNameclass	
DictionaryCompoundWordTokenFilter	TokenNameIdentifier	 Dictionary Compound Word Token Filter
extends	TokenNameextends	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
{	TokenNameLBRACE	
/** * Creates a new {@link DictionaryCompoundWordTokenFilter}. * @param input the {@link TokenStream} to process * @param dictionary the word dictionary to match against * @param minWordSize only words longer than this get processed * @param minSubwordSize only subwords longer than this get to the output stream * @param maxSubwordSize only subwords shorter than this get to the output stream * @param onlyLongestMatch Add only the longest matching subword to the stream * @deprecated use {@link #DictionaryCompoundWordTokenFilter(Version, TokenStream, String[], int, int, int, boolean)} instead */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link DictionaryCompoundWordTokenFilter}. @param input the {@link TokenStream} to process @param dictionary the word dictionary to match against @param minWordSize only words longer than this get processed @param minSubwordSize only subwords longer than this get to the output stream @param maxSubwordSize only subwords shorter than this get to the output stream @param onlyLongestMatch Add only the longest matching subword to the stream @deprecated use {@link #DictionaryCompoundWordTokenFilter(Version, TokenStream, String[], int, int, int, boolean)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
DictionaryCompoundWordTokenFilter	TokenNameIdentifier	 Dictionary Compound Word Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
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
}	TokenNameRBRACE	
/** * Creates a new {@link DictionaryCompoundWordTokenFilter} * * @param input the {@link TokenStream} to process * @param dictionary the word dictionary to match against * @deprecated use {@link #DictionaryCompoundWordTokenFilter(Version, TokenStream, String[])} instead */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link DictionaryCompoundWordTokenFilter} * @param input the {@link TokenStream} to process @param dictionary the word dictionary to match against @deprecated use {@link #DictionaryCompoundWordTokenFilter(Version, TokenStream, String[])} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
DictionaryCompoundWordTokenFilter	TokenNameIdentifier	 Dictionary Compound Word Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dictionary	TokenNameIdentifier	 dictionary
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link DictionaryCompoundWordTokenFilter} * * @param input the {@link TokenStream} to process * @param dictionary the word dictionary to match against. If this is a {@link org.apache.lucene.analysis.CharArraySet CharArraySet} it must have set ignoreCase=false and only contain * lower case strings. * @deprecated use {@link #DictionaryCompoundWordTokenFilter(Version, TokenStream, Set)} instead */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link DictionaryCompoundWordTokenFilter} * @param input the {@link TokenStream} to process @param dictionary the word dictionary to match against. If this is a {@link org.apache.lucene.analysis.CharArraySet CharArraySet} it must have set ignoreCase=false and only contain lower case strings. @deprecated use {@link #DictionaryCompoundWordTokenFilter(Version, TokenStream, Set)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
DictionaryCompoundWordTokenFilter	TokenNameIdentifier	 Dictionary Compound Word Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
dictionary	TokenNameIdentifier	 dictionary
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link DictionaryCompoundWordTokenFilter} * * @param input the {@link TokenStream} to process * @param dictionary the word dictionary to match against. If this is a {@link org.apache.lucene.analysis.CharArraySet CharArraySet} it must have set ignoreCase=false and only contain * lower case strings. * @param minWordSize only words longer than this get processed * @param minSubwordSize only subwords longer than this get to the output stream * @param maxSubwordSize only subwords shorter than this get to the output stream * @param onlyLongestMatch Add only the longest matching subword to the stream * @deprecated use {@link #DictionaryCompoundWordTokenFilter(Version, TokenStream, Set, int, int, int, boolean)} instead */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link DictionaryCompoundWordTokenFilter} * @param input the {@link TokenStream} to process @param dictionary the word dictionary to match against. If this is a {@link org.apache.lucene.analysis.CharArraySet CharArraySet} it must have set ignoreCase=false and only contain lower case strings. @param minWordSize only words longer than this get processed @param minSubwordSize only subwords longer than this get to the output stream @param maxSubwordSize only subwords shorter than this get to the output stream @param onlyLongestMatch Add only the longest matching subword to the stream @deprecated use {@link #DictionaryCompoundWordTokenFilter(Version, TokenStream, Set, int, int, int, boolean)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
DictionaryCompoundWordTokenFilter	TokenNameIdentifier	 Dictionary Compound Word Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
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
}	TokenNameRBRACE	
/** * Creates a new {@link DictionaryCompoundWordTokenFilter} * * @param matchVersion * Lucene version to enable correct Unicode 4.0 behavior in the * dictionaries if Version > 3.0. See <a * href="CompoundWordTokenFilterBase#version" * >CompoundWordTokenFilterBase</a> for details. * @param input * the {@link TokenStream} to process * @param dictionary * the word dictionary to match against * @param minWordSize * only words longer than this get processed * @param minSubwordSize * only subwords longer than this get to the output stream * @param maxSubwordSize * only subwords shorter than this get to the output stream * @param onlyLongestMatch * Add only the longest matching subword to the stream * @deprecated Use the constructors taking {@link Set} */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link DictionaryCompoundWordTokenFilter} * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the dictionaries if Version > 3.0. See <a href="CompoundWordTokenFilterBase#version" >CompoundWordTokenFilterBase</a> for details. @param input the {@link TokenStream} to process @param dictionary the word dictionary to match against @param minWordSize only words longer than this get processed @param minSubwordSize only subwords longer than this get to the output stream @param maxSubwordSize only subwords shorter than this get to the output stream @param onlyLongestMatch Add only the longest matching subword to the stream @deprecated Use the constructors taking {@link Set} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
DictionaryCompoundWordTokenFilter	TokenNameIdentifier	 Dictionary Compound Word Token Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
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
}	TokenNameRBRACE	
/** * Creates a new {@link DictionaryCompoundWordTokenFilter} * * @param matchVersion * Lucene version to enable correct Unicode 4.0 behavior in the * dictionaries if Version > 3.0. See <a * href="CompoundWordTokenFilterBase#version" * >CompoundWordTokenFilterBase</a> for details. * * @param input * the {@link TokenStream} to process * @param dictionary * the word dictionary to match against * @deprecated Use the constructors taking {@link Set} */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link DictionaryCompoundWordTokenFilter} * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the dictionaries if Version > 3.0. See <a href="CompoundWordTokenFilterBase#version" >CompoundWordTokenFilterBase</a> for details. * @param input the {@link TokenStream} to process @param dictionary the word dictionary to match against @deprecated Use the constructors taking {@link Set} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
DictionaryCompoundWordTokenFilter	TokenNameIdentifier	 Dictionary Compound Word Token Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link DictionaryCompoundWordTokenFilter} * * @param matchVersion * Lucene version to enable correct Unicode 4.0 behavior in the * dictionaries if Version > 3.0. See <a * href="CompoundWordTokenFilterBase#version" * >CompoundWordTokenFilterBase</a> for details. * @param input * the {@link TokenStream} to process * @param dictionary * the word dictionary to match against. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link DictionaryCompoundWordTokenFilter} * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the dictionaries if Version > 3.0. See <a href="CompoundWordTokenFilterBase#version" >CompoundWordTokenFilterBase</a> for details. @param input the {@link TokenStream} to process @param dictionary the word dictionary to match against. 
public	TokenNamepublic	
DictionaryCompoundWordTokenFilter	TokenNameIdentifier	 Dictionary Compound Word Token Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link DictionaryCompoundWordTokenFilter} * * @param matchVersion * Lucene version to enable correct Unicode 4.0 behavior in the * dictionaries if Version > 3.0. See <a * href="CompoundWordTokenFilterBase#version" * >CompoundWordTokenFilterBase</a> for details. * @param input * the {@link TokenStream} to process * @param dictionary * the word dictionary to match against. * @param minWordSize * only words longer than this get processed * @param minSubwordSize * only subwords longer than this get to the output stream * @param maxSubwordSize * only subwords shorter than this get to the output stream * @param onlyLongestMatch * Add only the longest matching subword to the stream */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link DictionaryCompoundWordTokenFilter} * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the dictionaries if Version > 3.0. See <a href="CompoundWordTokenFilterBase#version" >CompoundWordTokenFilterBase</a> for details. @param input the {@link TokenStream} to process @param dictionary the word dictionary to match against. @param minWordSize only words longer than this get processed @param minSubwordSize only subwords longer than this get to the output stream @param maxSubwordSize only subwords shorter than this get to the output stream @param onlyLongestMatch Add only the longest matching subword to the stream 
public	TokenNamepublic	
DictionaryCompoundWordTokenFilter	TokenNameIdentifier	 Dictionary Compound Word Token Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
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
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
<=	TokenNameLESS_EQUAL	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
this	TokenNamethis	
.	TokenNameDOT	
minSubwordSize	TokenNameIdentifier	 min Subword Size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
this	TokenNamethis	
.	TokenNameDOT	
minSubwordSize	TokenNameIdentifier	 min Subword Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
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
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
longestMatchToken	TokenNameIdentifier	 longest Match Token
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundToken	TokenNameIdentifier	 Compound Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
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
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
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
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
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
