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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
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
CharArraySet	TokenNameIdentifier	 Char Array Set
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
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
AttributeSource	TokenNameIdentifier	 Attribute Source
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
/** * Base class for decomposition token filters. * <p> * You must specify the required {@link Version} compatibility when creating * CompoundWordTokenFilterBase: * <ul> * <li>As of 3.1, CompoundWordTokenFilterBase correctly handles Unicode 4.0 * supplementary characters in strings and char arrays provided as compound word * dictionaries. * </ul> * <p>If you pass in a {@link org.apache.lucene.analysis.CharArraySet} as dictionary, * it should be case-insensitive unless it contains only lowercased entries and you * have {@link org.apache.lucene.analysis.LowerCaseFilter} before this filter in your analysis chain. * For optional performance (as this filter does lots of lookups to the dictionary, * you should use the latter analysis chain/CharArraySet). Be aware: If you supply arbitrary * {@link Set Sets} to the ctors or {@code String[]} dictionaries, they will be automatically * transformed to case-insensitive! */	TokenNameCOMMENT_JAVADOC	 Base class for decomposition token filters. <p> You must specify the required {@link Version} compatibility when creating CompoundWordTokenFilterBase: <ul> <li>As of 3.1, CompoundWordTokenFilterBase correctly handles Unicode 4.0 supplementary characters in strings and char arrays provided as compound word dictionaries. </ul> <p>If you pass in a {@link org.apache.lucene.analysis.CharArraySet} as dictionary, it should be case-insensitive unless it contains only lowercased entries and you have {@link org.apache.lucene.analysis.LowerCaseFilter} before this filter in your analysis chain. For optional performance (as this filter does lots of lookups to the dictionary, you should use the latter analysis chain/CharArraySet). Be aware: If you supply arbitrary {@link Set Sets} to the ctors or {@code String[]} dictionaries, they will be automatically transformed to case-insensitive! 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
/** * The default for minimal word length that gets decomposed */	TokenNameCOMMENT_JAVADOC	 The default for minimal word length that gets decomposed 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MIN_WORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  WORD  SIZE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The default for minimal length of subwords that get propagated to the output of this filter */	TokenNameCOMMENT_JAVADOC	 The default for minimal length of subwords that get propagated to the output of this filter 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MIN_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SUBWORD  SIZE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The default for maximal length of subwords that get propagated to the output of this filter */	TokenNameCOMMENT_JAVADOC	 The default for maximal length of subwords that get propagated to the output of this filter 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SUBWORD  SIZE
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
CharArraySet	TokenNameIdentifier	 Char Array Set
dictionary	TokenNameIdentifier	 dictionary
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
CompoundToken	TokenNameIdentifier	 Compound Token
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
minWordSize	TokenNameIdentifier	 min Word Size
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
minSubwordSize	TokenNameIdentifier	 min Subword Size
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncAtt	TokenNameIdentifier	 pos Inc Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
/** * @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, String[], int, int, int, boolean)} instead */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, String[], int, int, int, boolean)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
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
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
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
/** * @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, String[], boolean)} instead */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, String[], boolean)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dictionary	TokenNameIdentifier	 dictionary
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
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, Set, boolean)} instead */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, Set, boolean)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
dictionary	TokenNameIdentifier	 dictionary
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
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
DEFAULT_MIN_WORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  WORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MIN_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SUBWORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MAX_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SUBWORD  SIZE
,	TokenNameCOMMA	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, String[])} instead */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, String[])} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
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
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
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
/** * @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, Set)} instead */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, Set)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
(	TokenNameLPAREN	
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
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
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
/** * @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, Set, int, int, int, boolean)} instead */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #CompoundWordTokenFilterBase(Version, TokenStream, Set, int, int, int, boolean)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
(	TokenNameLPAREN	
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
this	TokenNamethis	
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
protected	TokenNameprotected	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
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
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
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
protected	TokenNameprotected	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
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
makeDictionary	TokenNameIdentifier	 make Dictionary
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
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
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
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
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
DEFAULT_MIN_WORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  WORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MIN_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SUBWORD  SIZE
,	TokenNameCOMMA	
DEFAULT_MAX_SUBWORD_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SUBWORD  SIZE
,	TokenNameCOMMA	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
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
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
makeDictionary	TokenNameIdentifier	 make Dictionary
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
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
protected	TokenNameprotected	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
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
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
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
protected	TokenNameprotected	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
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
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
CompoundToken	TokenNameIdentifier	 Compound Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minWordSize	TokenNameIdentifier	 min Word Size
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minWordSize cannot be negative"	TokenNameStringLiteral	minWordSize cannot be negative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minWordSize	TokenNameIdentifier	 min Word Size
=	TokenNameEQUAL	
minWordSize	TokenNameIdentifier	 min Word Size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minSubwordSize	TokenNameIdentifier	 min Subword Size
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minSubwordSize cannot be negative"	TokenNameStringLiteral	minSubwordSize cannot be negative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minSubwordSize	TokenNameIdentifier	 min Subword Size
=	TokenNameEQUAL	
minSubwordSize	TokenNameIdentifier	 min Subword Size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"maxSubwordSize cannot be negative"	TokenNameStringLiteral	maxSubwordSize cannot be negative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
=	TokenNameEQUAL	
maxSubwordSize	TokenNameIdentifier	 max Subword Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
=	TokenNameEQUAL	
onlyLongestMatch	TokenNameIdentifier	 only Longest Match
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
dictionary	TokenNameIdentifier	 dictionary
instanceof	TokenNameinstanceof	
CharArraySet	TokenNameIdentifier	 Char Array Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dictionary	TokenNameIdentifier	 dictionary
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharArraySet	TokenNameIdentifier	 Char Array Set
)	TokenNameRPAREN	
dictionary	TokenNameIdentifier	 dictionary
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dictionary	TokenNameIdentifier	 dictionary
=	TokenNameEQUAL	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** @deprecated Only available for backwards compatibility. */	TokenNameCOMMENT_JAVADOC	 @deprecated Only available for backwards compatibility. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
CharArraySet	TokenNameIdentifier	 Char Array Set
makeDictionary	TokenNameIdentifier	 make Dictionary
(	TokenNameLPAREN	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
CompoundToken	TokenNameIdentifier	 Compound Token
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
removeFirst	TokenNameIdentifier	 remove First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restoreState	TokenNameIdentifier	 restore State
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// keep all other attributes untouched 	TokenNameCOMMENT_LINE	keep all other attributes untouched 
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
txt	TokenNameIdentifier	 txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncAtt	TokenNameIdentifier	 pos Inc Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// not really needed, but for safety 	TokenNameCOMMENT_LINE	not really needed, but for safety 
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only words longer than minWordSize get processed 	TokenNameCOMMENT_LINE	Only words longer than minWordSize get processed 
if	TokenNameif	
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
minWordSize	TokenNameIdentifier	 min Word Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// only capture the state if we really need it for producing new tokens 	TokenNameCOMMENT_LINE	only capture the state if we really need it for producing new tokens 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// return original token: 	TokenNameCOMMENT_LINE	return original token: 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Decomposes the current {@link #termAtt} and places {@link CompoundToken} instances in the {@link #tokens} list. * The original token may not be placed in the list, as it is automatically passed through this filter. */	TokenNameCOMMENT_JAVADOC	 Decomposes the current {@link #termAtt} and places {@link CompoundToken} instances in the {@link #tokens} list. The original token may not be placed in the list, as it is automatically passed through this filter. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper class to hold decompounded token information */	TokenNameCOMMENT_JAVADOC	 Helper class to hold decompounded token information 
protected	TokenNameprotected	
class	TokenNameclass	
CompoundToken	TokenNameIdentifier	 Compound Token
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
CharSequence	TokenNameIdentifier	 Char Sequence
txt	TokenNameIdentifier	 txt
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
/** Construct the compound token based on a slice of the current {@link CompoundWordTokenFilterBase#termAtt}. */	TokenNameCOMMENT_JAVADOC	 Construct the compound token based on a slice of the current {@link CompoundWordTokenFilterBase#termAtt}. 
public	TokenNamepublic	
CompoundToken	TokenNameIdentifier	 Compound Token
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
txt	TokenNameIdentifier	 txt
=	TokenNameEQUAL	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// offsets of the original word 	TokenNameCOMMENT_LINE	offsets of the original word 
int	TokenNameint	
startOff	TokenNameIdentifier	 start Off
=	TokenNameEQUAL	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOff	TokenNameIdentifier	 end Off
=	TokenNameEQUAL	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endOff	TokenNameIdentifier	 end Off
-	TokenNameMINUS	
startOff	TokenNameIdentifier	 start Off
!=	TokenNameNOT_EQUAL	
CompoundWordTokenFilterBase	TokenNameIdentifier	 Compound Word Token Filter Base
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if length by start + end offsets doesn't match the term text then assume 	TokenNameCOMMENT_LINE	if length by start + end offsets doesn't match the term text then assume 
// this is a synonym and don't adjust the offsets. 	TokenNameCOMMENT_LINE	this is a synonym and don't adjust the offsets. 
this	TokenNamethis	
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
startOff	TokenNameIdentifier	 start Off
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
endOff	TokenNameIdentifier	 end Off
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
newStart	TokenNameIdentifier	 new Start
=	TokenNameEQUAL	
startOff	TokenNameIdentifier	 start Off
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
newStart	TokenNameIdentifier	 new Start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
newStart	TokenNameIdentifier	 new Start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
