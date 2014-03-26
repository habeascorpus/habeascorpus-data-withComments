package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
shingle	TokenNameIdentifier	 shingle
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
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
TypeAttribute	TokenNameIdentifier	 Type Attribute
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
/** * <p>A ShingleFilter constructs shingles (token n-grams) from a token stream. * In other words, it creates combinations of tokens as a single token. * * <p>For example, the sentence "please divide this sentence into shingles" * might be tokenized into shingles "please divide", "divide this", * "this sentence", "sentence into", and "into shingles". * * <p>This filter handles position increments > 1 by inserting filler tokens * (tokens with termtext "_"). It does not handle a position increment of 0. */	TokenNameCOMMENT_JAVADOC	 <p>A ShingleFilter constructs shingles (token n-grams) from a token stream. In other words, it creates combinations of tokens as a single token. * <p>For example, the sentence "please divide this sentence into shingles" might be tokenized into shingles "please divide", "divide this", "this sentence", "sentence into", and "into shingles". * <p>This filter handles position increments > 1 by inserting filler tokens (tokens with termtext "_"). It does not handle a position increment of 0. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
/** * filler token for when positionIncrement is more than 1 */	TokenNameCOMMENT_JAVADOC	 filler token for when positionIncrement is more than 1 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FILLER_TOKEN	TokenNameIdentifier	 FILLER  TOKEN
=	TokenNameEQUAL	
{	TokenNameLBRACE	
'_'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * default maximum shingle size is 2. */	TokenNameCOMMENT_JAVADOC	 default maximum shingle size is 2. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SHINGLE  SIZE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * default minimum shingle size is 2. */	TokenNameCOMMENT_JAVADOC	 default minimum shingle size is 2. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MIN_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SHINGLE  SIZE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * default token type attribute value is "shingle" */	TokenNameCOMMENT_JAVADOC	 default token type attribute value is "shingle" 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_TOKEN_TYPE	TokenNameIdentifier	 DEFAULT  TOKEN  TYPE
=	TokenNameEQUAL	
"shingle"	TokenNameStringLiteral	shingle
;	TokenNameSEMICOLON	
/** * The default string to use when joining adjacent tokens to form a shingle */	TokenNameCOMMENT_JAVADOC	 The default string to use when joining adjacent tokens to form a shingle 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TOKEN_SEPARATOR	TokenNameIdentifier	 TOKEN  SEPARATOR
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * The sequence of input stream tokens (or filler tokens, if necessary) * that will be composed to form output shingles. */	TokenNameCOMMENT_JAVADOC	 The sequence of input stream tokens (or filler tokens, if necessary) that will be composed to form output shingles. 
private	TokenNameprivate	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
InputWindowToken	TokenNameIdentifier	 Input Window Token
>	TokenNameGREATER	
inputWindow	TokenNameIdentifier	 input Window
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
InputWindowToken	TokenNameIdentifier	 Input Window Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The number of input tokens in the next output token. This is the "n" in * "token n-grams". */	TokenNameCOMMENT_JAVADOC	 The number of input tokens in the next output token. This is the "n" in "token n-grams". 
private	TokenNameprivate	
CircularSequence	TokenNameIdentifier	 Circular Sequence
gramSize	TokenNameIdentifier	 gram Size
;	TokenNameSEMICOLON	
/** * Shingle and unigram text is composed here. */	TokenNameCOMMENT_JAVADOC	 Shingle and unigram text is composed here. 
private	TokenNameprivate	
StringBuilder	TokenNameIdentifier	 String Builder
gramBuilder	TokenNameIdentifier	 gram Builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The token type attribute value to use - default is "shingle" */	TokenNameCOMMENT_JAVADOC	 The token type attribute value to use - default is "shingle" 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
tokenType	TokenNameIdentifier	 token Type
=	TokenNameEQUAL	
DEFAULT_TOKEN_TYPE	TokenNameIdentifier	 DEFAULT  TOKEN  TYPE
;	TokenNameSEMICOLON	
/** * The string to use when joining adjacent tokens to form a shingle */	TokenNameCOMMENT_JAVADOC	 The string to use when joining adjacent tokens to form a shingle 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
tokenSeparator	TokenNameIdentifier	 token Separator
=	TokenNameEQUAL	
TOKEN_SEPARATOR	TokenNameIdentifier	 TOKEN  SEPARATOR
;	TokenNameSEMICOLON	
/** * By default, we output unigrams (individual tokens) as well as shingles * (token n-grams). */	TokenNameCOMMENT_JAVADOC	 By default, we output unigrams (individual tokens) as well as shingles (token n-grams). 
private	TokenNameprivate	
boolean	TokenNameboolean	
outputUnigrams	TokenNameIdentifier	 output Unigrams
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * By default, we don't override behavior of outputUnigrams. */	TokenNameCOMMENT_JAVADOC	 By default, we don't override behavior of outputUnigrams. 
private	TokenNameprivate	
boolean	TokenNameboolean	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * maximum shingle size (number of tokens) */	TokenNameCOMMENT_JAVADOC	 maximum shingle size (number of tokens) 
private	TokenNameprivate	
int	TokenNameint	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
;	TokenNameSEMICOLON	
/** * minimum shingle size (number of tokens) */	TokenNameCOMMENT_JAVADOC	 minimum shingle size (number of tokens) 
private	TokenNameprivate	
int	TokenNameint	
minShingleSize	TokenNameIdentifier	 min Shingle Size
;	TokenNameSEMICOLON	
/** * The remaining number of filler tokens to be inserted into the input stream * from which shingles are composed, to handle position increments greater * than one. */	TokenNameCOMMENT_JAVADOC	 The remaining number of filler tokens to be inserted into the input stream from which shingles are composed, to handle position increments greater than one. 
private	TokenNameprivate	
int	TokenNameint	
numFillerTokensToInsert	TokenNameIdentifier	 num Filler Tokens To Insert
;	TokenNameSEMICOLON	
/** * When the next input stream token has a position increment greater than * one, it is stored in this field until sufficient filler tokens have been * inserted to account for the position increment. */	TokenNameCOMMENT_JAVADOC	 When the next input stream token has a position increment greater than one, it is stored in this field until sufficient filler tokens have been inserted to account for the position increment. 
private	TokenNameprivate	
AttributeSource	TokenNameIdentifier	 Attribute Source
nextInputStreamToken	TokenNameIdentifier	 next Input Stream Token
;	TokenNameSEMICOLON	
/** * Whether or not there is a next input stream token. */	TokenNameCOMMENT_JAVADOC	 Whether or not there is a next input stream token. 
private	TokenNameprivate	
boolean	TokenNameboolean	
isNextInputStreamToken	TokenNameIdentifier	 is Next Input Stream Token
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Whether at least one unigram or shingle has been output at the current * position. */	TokenNameCOMMENT_JAVADOC	 Whether at least one unigram or shingle has been output at the current position. 
private	TokenNameprivate	
boolean	TokenNameboolean	
isOutputHere	TokenNameIdentifier	 is Output Here
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * true if no shingles have been output yet (for outputUnigramsIfNoShingles). */	TokenNameCOMMENT_JAVADOC	 true if no shingles have been output yet (for outputUnigramsIfNoShingles). 
boolean	TokenNameboolean	
noShingleOutput	TokenNameIdentifier	 no Shingle Output
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
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
private	TokenNameprivate	
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
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
posLenAtt	TokenNameIdentifier	 pos Len Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constructs a ShingleFilter with the specified shingle size from the * {@link TokenStream} <code>input</code> * * @param input input stream * @param minShingleSize minimum shingle size produced by the filter. * @param maxShingleSize maximum shingle size produced by the filter. */	TokenNameCOMMENT_JAVADOC	 Constructs a ShingleFilter with the specified shingle size from the {@link TokenStream} <code>input</code> * @param input input stream @param minShingleSize minimum shingle size produced by the filter. @param maxShingleSize maximum shingle size produced by the filter. 
public	TokenNamepublic	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
minShingleSize	TokenNameIdentifier	 min Shingle Size
,	TokenNameCOMMA	
int	TokenNameint	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMaxShingleSize	TokenNameIdentifier	 set Max Shingle Size
(	TokenNameLPAREN	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMinShingleSize	TokenNameIdentifier	 set Min Shingle Size
(	TokenNameLPAREN	
minShingleSize	TokenNameIdentifier	 min Shingle Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a ShingleFilter with the specified shingle size from the * {@link TokenStream} <code>input</code> * * @param input input stream * @param maxShingleSize maximum shingle size produced by the filter. */	TokenNameCOMMENT_JAVADOC	 Constructs a ShingleFilter with the specified shingle size from the {@link TokenStream} <code>input</code> * @param input input stream @param maxShingleSize maximum shingle size produced by the filter. 
public	TokenNamepublic	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
DEFAULT_MIN_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SHINGLE  SIZE
,	TokenNameCOMMA	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a ShingleFilter with default shingle size: 2. * * @param input input stream */	TokenNameCOMMENT_JAVADOC	 Construct a ShingleFilter with default shingle size: 2. * @param input input stream 
public	TokenNamepublic	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
DEFAULT_MIN_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SHINGLE  SIZE
,	TokenNameCOMMA	
DEFAULT_MAX_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SHINGLE  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a ShingleFilter with the specified token type for shingle tokens * and the default shingle size: 2 * * @param input input stream * @param tokenType token type for shingle tokens */	TokenNameCOMMENT_JAVADOC	 Construct a ShingleFilter with the specified token type for shingle tokens and the default shingle size: 2 * @param input input stream @param tokenType token type for shingle tokens 
public	TokenNamepublic	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tokenType	TokenNameIdentifier	 token Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
DEFAULT_MIN_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SHINGLE  SIZE
,	TokenNameCOMMA	
DEFAULT_MAX_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MAX  SHINGLE  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTokenType	TokenNameIdentifier	 set Token Type
(	TokenNameLPAREN	
tokenType	TokenNameIdentifier	 token Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the type of the shingle tokens produced by this filter. * (default: "shingle") * * @param tokenType token tokenType */	TokenNameCOMMENT_JAVADOC	 Set the type of the shingle tokens produced by this filter. (default: "shingle") * @param tokenType token tokenType 
public	TokenNamepublic	
void	TokenNamevoid	
setTokenType	TokenNameIdentifier	 set Token Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tokenType	TokenNameIdentifier	 token Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tokenType	TokenNameIdentifier	 token Type
=	TokenNameEQUAL	
tokenType	TokenNameIdentifier	 token Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Shall the output stream contain the input tokens (unigrams) as well as * shingles? (default: true.) * * @param outputUnigrams Whether or not the output stream shall contain * the input tokens (unigrams) */	TokenNameCOMMENT_JAVADOC	 Shall the output stream contain the input tokens (unigrams) as well as shingles? (default: true.) * @param outputUnigrams Whether or not the output stream shall contain the input tokens (unigrams) 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputUnigrams	TokenNameIdentifier	 set Output Unigrams
(	TokenNameLPAREN	
boolean	TokenNameboolean	
outputUnigrams	TokenNameIdentifier	 output Unigrams
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outputUnigrams	TokenNameIdentifier	 output Unigrams
=	TokenNameEQUAL	
outputUnigrams	TokenNameIdentifier	 output Unigrams
;	TokenNameSEMICOLON	
gramSize	TokenNameIdentifier	 gram Size
=	TokenNameEQUAL	
new	TokenNamenew	
CircularSequence	TokenNameIdentifier	 Circular Sequence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Shall we override the behavior of outputUnigrams==false for those * times when no shingles are available (because there are fewer than * minShingleSize tokens in the input stream)? (default: false.) * <p>Note that if outputUnigrams==true, then unigrams are always output, * regardless of whether any shingles are available. * * @param outputUnigramsIfNoShingles Whether or not to output a single * unigram when no shingles are available. */	TokenNameCOMMENT_JAVADOC	 <p>Shall we override the behavior of outputUnigrams==false for those times when no shingles are available (because there are fewer than minShingleSize tokens in the input stream)? (default: false.) <p>Note that if outputUnigrams==true, then unigrams are always output, regardless of whether any shingles are available. * @param outputUnigramsIfNoShingles Whether or not to output a single unigram when no shingles are available. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputUnigramsIfNoShingles	TokenNameIdentifier	 set Output Unigrams If No Shingles
(	TokenNameLPAREN	
boolean	TokenNameboolean	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
=	TokenNameEQUAL	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the max shingle size (default: 2) * * @param maxShingleSize max size of output shingles */	TokenNameCOMMENT_JAVADOC	 Set the max shingle size (default: 2) * @param maxShingleSize max size of output shingles 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxShingleSize	TokenNameIdentifier	 set Max Shingle Size
(	TokenNameLPAREN	
int	TokenNameint	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Max shingle size must be >= 2"	TokenNameStringLiteral	Max shingle size must be >= 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
=	TokenNameEQUAL	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set the min shingle size (default: 2). * <p>This method requires that the passed in minShingleSize is not greater * than maxShingleSize, so make sure that maxShingleSize is set before * calling this method. * <p>The unigram output option is independent of the min shingle size. * * @param minShingleSize min size of output shingles */	TokenNameCOMMENT_JAVADOC	 <p>Set the min shingle size (default: 2). <p>This method requires that the passed in minShingleSize is not greater than maxShingleSize, so make sure that maxShingleSize is set before calling this method. <p>The unigram output option is independent of the min shingle size. * @param minShingleSize min size of output shingles 
public	TokenNamepublic	
void	TokenNamevoid	
setMinShingleSize	TokenNameIdentifier	 set Min Shingle Size
(	TokenNameLPAREN	
int	TokenNameint	
minShingleSize	TokenNameIdentifier	 min Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minShingleSize	TokenNameIdentifier	 min Shingle Size
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Min shingle size must be >= 2"	TokenNameStringLiteral	Min shingle size must be >= 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minShingleSize	TokenNameIdentifier	 min Shingle Size
>	TokenNameGREATER	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Min shingle size must be <= max shingle size"	TokenNameStringLiteral	Min shingle size must be <= max shingle size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minShingleSize	TokenNameIdentifier	 min Shingle Size
=	TokenNameEQUAL	
minShingleSize	TokenNameIdentifier	 min Shingle Size
;	TokenNameSEMICOLON	
gramSize	TokenNameIdentifier	 gram Size
=	TokenNameEQUAL	
new	TokenNamenew	
CircularSequence	TokenNameIdentifier	 Circular Sequence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the string to use when joining adjacent tokens to form a shingle * @param tokenSeparator used to separate input stream tokens in output shingles */	TokenNameCOMMENT_JAVADOC	 Sets the string to use when joining adjacent tokens to form a shingle @param tokenSeparator used to separate input stream tokens in output shingles 
public	TokenNamepublic	
void	TokenNamevoid	
setTokenSeparator	TokenNameIdentifier	 set Token Separator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tokenSeparator	TokenNameIdentifier	 token Separator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tokenSeparator	TokenNameIdentifier	 token Separator
=	TokenNameEQUAL	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
tokenSeparator	TokenNameIdentifier	 token Separator
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
tokenSeparator	TokenNameIdentifier	 token Separator
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
boolean	TokenNameboolean	
tokenAvailable	TokenNameIdentifier	 token Available
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
builtGramSize	TokenNameIdentifier	 built Gram Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
atMinValue	TokenNameIdentifier	 at Min Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
inputWindow	TokenNameIdentifier	 input Window
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shiftInputWindow	TokenNameIdentifier	 shift Input Window
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gramBuilder	TokenNameIdentifier	 gram Builder
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
builtGramSize	TokenNameIdentifier	 built Gram Size
=	TokenNameEQUAL	
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
getPreviousValue	TokenNameIdentifier	 get Previous Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inputWindow	TokenNameIdentifier	 input Window
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isAllFiller	TokenNameIdentifier	 is All Filler
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
InputWindowToken	TokenNameIdentifier	 Input Window Token
nextToken	TokenNameIdentifier	 next Token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
InputWindowToken	TokenNameIdentifier	 Input Window Token
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
inputWindow	TokenNameIdentifier	 input Window
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
gramNum	TokenNameIdentifier	 gram Num
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
builtGramSize	TokenNameIdentifier	 built Gram Size
<	TokenNameLESS	
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
gramNum	TokenNameIdentifier	 gram Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToken	TokenNameIdentifier	 next Token
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
builtGramSize	TokenNameIdentifier	 built Gram Size
<	TokenNameLESS	
gramNum	TokenNameIdentifier	 gram Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
builtGramSize	TokenNameIdentifier	 built Gram Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gramBuilder	TokenNameIdentifier	 gram Builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
tokenSeparator	TokenNameIdentifier	 token Separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
gramBuilder	TokenNameIdentifier	 gram Builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
nextToken	TokenNameIdentifier	 next Token
.	TokenNameDOT	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nextToken	TokenNameIdentifier	 next Token
.	TokenNameDOT	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
builtGramSize	TokenNameIdentifier	 built Gram Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isAllFiller	TokenNameIdentifier	 is All Filler
&&	TokenNameAND_AND	
nextToken	TokenNameIdentifier	 next Token
.	TokenNameDOT	
isFiller	TokenNameIdentifier	 is Filler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gramNum	TokenNameIdentifier	 gram Num
==	TokenNameEQUAL_EQUAL	
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
isAllFiller	TokenNameIdentifier	 is All Filler
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAllFiller	TokenNameIdentifier	 is All Filler
&&	TokenNameAND_AND	
builtGramSize	TokenNameIdentifier	 built Gram Size
==	TokenNameEQUAL_EQUAL	
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inputWindow	TokenNameIdentifier	 input Window
.	TokenNameDOT	
getFirst	TokenNameIdentifier	 get First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
attSource	TokenNameIdentifier	 att Source
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
isOutputHere	TokenNameIdentifier	 is Output Here
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gramBuilder	TokenNameIdentifier	 gram Builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
tokenType	TokenNameIdentifier	 token Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
noShingleOutput	TokenNameIdentifier	 no Shingle Output
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
nextToken	TokenNameIdentifier	 next Token
.	TokenNameDOT	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posLenAtt	TokenNameIdentifier	 pos Len Att
.	TokenNameDOT	
setPositionLength	TokenNameIdentifier	 set Position Length
(	TokenNameLPAREN	
builtGramSize	TokenNameIdentifier	 built Gram Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isOutputHere	TokenNameIdentifier	 is Output Here
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenAvailable	TokenNameIdentifier	 token Available
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
tokenAvailable	TokenNameIdentifier	 token Available
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
exhausted	TokenNameIdentifier	 exhausted
;	TokenNameSEMICOLON	
/** * <p>Get the next token from the input stream. * <p>If the next token has <code>positionIncrement > 1</code>, * <code>positionIncrement - 1</code> {@link #FILLER_TOKEN}s are * inserted first. * @param target Where to put the new token; if null, a new instance is created. * @return On success, the populated token; null otherwise * @throws IOException if the input stream has a problem */	TokenNameCOMMENT_JAVADOC	 <p>Get the next token from the input stream. <p>If the next token has <code>positionIncrement > 1</code>, <code>positionIncrement - 1</code> {@link #FILLER_TOKEN}s are inserted first. @param target Where to put the new token; if null, a new instance is created. @return On success, the populated token; null otherwise @throws IOException if the input stream has a problem 
private	TokenNameprivate	
InputWindowToken	TokenNameIdentifier	 Input Window Token
getNextToken	TokenNameIdentifier	 get Next Token
(	TokenNameLPAREN	
InputWindowToken	TokenNameIdentifier	 Input Window Token
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InputWindowToken	TokenNameIdentifier	 Input Window Token
newTarget	TokenNameIdentifier	 new Target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numFillerTokensToInsert	TokenNameIdentifier	 num Filler Tokens To Insert
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newTarget	TokenNameIdentifier	 new Target
=	TokenNameEQUAL	
new	TokenNamenew	
InputWindowToken	TokenNameIdentifier	 Input Window Token
(	TokenNameLPAREN	
nextInputStreamToken	TokenNameIdentifier	 next Input Stream Token
.	TokenNameDOT	
cloneAttributes	TokenNameIdentifier	 clone Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nextInputStreamToken	TokenNameIdentifier	 next Input Stream Token
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
attSource	TokenNameIdentifier	 att Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// A filler token occupies no space 	TokenNameCOMMENT_LINE	A filler token occupies no space 
newTarget	TokenNameIdentifier	 new Target
.	TokenNameDOT	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
newTarget	TokenNameIdentifier	 new Target
.	TokenNameDOT	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newTarget	TokenNameIdentifier	 new Target
.	TokenNameDOT	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newTarget	TokenNameIdentifier	 new Target
.	TokenNameDOT	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
FILLER_TOKEN	TokenNameIdentifier	 FILLER  TOKEN
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FILLER_TOKEN	TokenNameIdentifier	 FILLER  TOKEN
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newTarget	TokenNameIdentifier	 new Target
.	TokenNameDOT	
isFiller	TokenNameIdentifier	 is Filler
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
numFillerTokensToInsert	TokenNameIdentifier	 num Filler Tokens To Insert
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isNextInputStreamToken	TokenNameIdentifier	 is Next Input Stream Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newTarget	TokenNameIdentifier	 new Target
=	TokenNameEQUAL	
new	TokenNamenew	
InputWindowToken	TokenNameIdentifier	 Input Window Token
(	TokenNameLPAREN	
nextInputStreamToken	TokenNameIdentifier	 next Input Stream Token
.	TokenNameDOT	
cloneAttributes	TokenNameIdentifier	 clone Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nextInputStreamToken	TokenNameIdentifier	 next Input Stream Token
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
attSource	TokenNameIdentifier	 att Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isNextInputStreamToken	TokenNameIdentifier	 is Next Input Stream Token
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
newTarget	TokenNameIdentifier	 new Target
.	TokenNameDOT	
isFiller	TokenNameIdentifier	 is Filler
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
exhausted	TokenNameIdentifier	 exhausted
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newTarget	TokenNameIdentifier	 new Target
=	TokenNameEQUAL	
new	TokenNamenew	
InputWindowToken	TokenNameIdentifier	 Input Window Token
(	TokenNameLPAREN	
cloneAttributes	TokenNameIdentifier	 clone Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
attSource	TokenNameIdentifier	 att Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Each output shingle must contain at least one input token, 	TokenNameCOMMENT_LINE	Each output shingle must contain at least one input token, 
// so no more than (maxShingleSize - 1) filler tokens will be inserted. 	TokenNameCOMMENT_LINE	so no more than (maxShingleSize - 1) filler tokens will be inserted. 
numFillerTokensToInsert	TokenNameIdentifier	 num Filler Tokens To Insert
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Save the current token as the next input stream token 	TokenNameCOMMENT_LINE	Save the current token as the next input stream token 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
nextInputStreamToken	TokenNameIdentifier	 next Input Stream Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextInputStreamToken	TokenNameIdentifier	 next Input Stream Token
=	TokenNameEQUAL	
cloneAttributes	TokenNameIdentifier	 clone Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
nextInputStreamToken	TokenNameIdentifier	 next Input Stream Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isNextInputStreamToken	TokenNameIdentifier	 is Next Input Stream Token
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// A filler token occupies no space 	TokenNameCOMMENT_LINE	A filler token occupies no space 
newTarget	TokenNameIdentifier	 new Target
.	TokenNameDOT	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newTarget	TokenNameIdentifier	 new Target
.	TokenNameDOT	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
FILLER_TOKEN	TokenNameIdentifier	 FILLER  TOKEN
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FILLER_TOKEN	TokenNameIdentifier	 FILLER  TOKEN
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newTarget	TokenNameIdentifier	 new Target
.	TokenNameDOT	
isFiller	TokenNameIdentifier	 is Filler
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
numFillerTokensToInsert	TokenNameIdentifier	 num Filler Tokens To Insert
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newTarget	TokenNameIdentifier	 new Target
.	TokenNameDOT	
isFiller	TokenNameIdentifier	 is Filler
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newTarget	TokenNameIdentifier	 new Target
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
exhausted	TokenNameIdentifier	 exhausted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newTarget	TokenNameIdentifier	 new Target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Fills {@link #inputWindow} with input stream tokens, if available, * shifting to the right if the window was previously full. * <p>Resets {@link #gramSize} to its minimum value. * * @throws IOException if there's a problem getting the next token */	TokenNameCOMMENT_JAVADOC	 <p>Fills {@link #inputWindow} with input stream tokens, if available, shifting to the right if the window was previously full. <p>Resets {@link #gramSize} to its minimum value. * @throws IOException if there's a problem getting the next token 
private	TokenNameprivate	
void	TokenNamevoid	
shiftInputWindow	TokenNameIdentifier	 shift Input Window
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InputWindowToken	TokenNameIdentifier	 Input Window Token
firstToken	TokenNameIdentifier	 first Token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inputWindow	TokenNameIdentifier	 input Window
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstToken	TokenNameIdentifier	 first Token
=	TokenNameEQUAL	
inputWindow	TokenNameIdentifier	 input Window
.	TokenNameDOT	
removeFirst	TokenNameIdentifier	 remove First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
inputWindow	TokenNameIdentifier	 input Window
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
firstToken	TokenNameIdentifier	 first Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// recycle the firstToken, if available 	TokenNameCOMMENT_LINE	recycle the firstToken, if available 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
getNextToken	TokenNameIdentifier	 get Next Token
(	TokenNameLPAREN	
firstToken	TokenNameIdentifier	 first Token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inputWindow	TokenNameIdentifier	 input Window
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
firstToken	TokenNameIdentifier	 first Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the firstToken becomes the last 	TokenNameCOMMENT_LINE	the firstToken becomes the last 
firstToken	TokenNameIdentifier	 first Token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// end of input stream 	TokenNameCOMMENT_LINE	end of input stream 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
InputWindowToken	TokenNameIdentifier	 Input Window Token
nextToken	TokenNameIdentifier	 next Token
=	TokenNameEQUAL	
getNextToken	TokenNameIdentifier	 get Next Token
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
nextToken	TokenNameIdentifier	 next Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inputWindow	TokenNameIdentifier	 input Window
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
nextToken	TokenNameIdentifier	 next Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// end of input stream 	TokenNameCOMMENT_LINE	end of input stream 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
&&	TokenNameAND_AND	
noShingleOutput	TokenNameIdentifier	 no Shingle Output
&&	TokenNameAND_AND	
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
minValue	TokenNameIdentifier	 min Value
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
inputWindow	TokenNameIdentifier	 input Window
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
minShingleSize	TokenNameIdentifier	 min Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
minValue	TokenNameIdentifier	 min Value
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isOutputHere	TokenNameIdentifier	 is Output Here
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inputWindow	TokenNameIdentifier	 input Window
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextInputStreamToken	TokenNameIdentifier	 next Input Stream Token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
isNextInputStreamToken	TokenNameIdentifier	 is Next Input Stream Token
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
numFillerTokensToInsert	TokenNameIdentifier	 num Filler Tokens To Insert
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
isOutputHere	TokenNameIdentifier	 is Output Here
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
noShingleOutput	TokenNameIdentifier	 no Shingle Output
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
exhausted	TokenNameIdentifier	 exhausted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
outputUnigramsIfNoShingles	TokenNameIdentifier	 output Unigrams If No Shingles
&&	TokenNameAND_AND	
!	TokenNameNOT	
outputUnigrams	TokenNameIdentifier	 output Unigrams
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fix up gramSize if minValue was reset for outputUnigramsIfNoShingles 	TokenNameCOMMENT_LINE	Fix up gramSize if minValue was reset for outputUnigramsIfNoShingles 
gramSize	TokenNameIdentifier	 gram Size
.	TokenNameDOT	
minValue	TokenNameIdentifier	 min Value
=	TokenNameEQUAL	
minShingleSize	TokenNameIdentifier	 min Shingle Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>An instance of this class is used to maintain the number of input * stream tokens that will be used to compose the next unigram or shingle: * {@link #gramSize}. * <p><code>gramSize</code> will take on values from the circular sequence * <b>{ [ 1, ] {@link #minShingleSize} [ , ... , {@link #maxShingleSize} ] }</b>. * <p>1 is included in the circular sequence only if * {@link #outputUnigrams} = true. */	TokenNameCOMMENT_JAVADOC	 <p>An instance of this class is used to maintain the number of input stream tokens that will be used to compose the next unigram or shingle: {@link #gramSize}. <p><code>gramSize</code> will take on values from the circular sequence <b>{ [ 1, ] {@link #minShingleSize} [ , ... , {@link #maxShingleSize} ] }</b>. <p>1 is included in the circular sequence only if {@link #outputUnigrams} = true. 
private	TokenNameprivate	
class	TokenNameclass	
CircularSequence	TokenNameIdentifier	 Circular Sequence
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
previousValue	TokenNameIdentifier	 previous Value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minValue	TokenNameIdentifier	 min Value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CircularSequence	TokenNameIdentifier	 Circular Sequence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minValue	TokenNameIdentifier	 min Value
=	TokenNameEQUAL	
outputUnigrams	TokenNameIdentifier	 output Unigrams
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
minShingleSize	TokenNameIdentifier	 min Shingle Size
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the current value. * @see #advance() */	TokenNameCOMMENT_JAVADOC	 @return the current value. @see #advance() 
public	TokenNamepublic	
int	TokenNameint	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Increments this circular number's value to the next member in the * circular sequence * <code>gramSize</code> will take on values from the circular sequence * <b>{ [ 1, ] {@link #minShingleSize} [ , ... , {@link #maxShingleSize} ] }</b>. * <p>1 is included in the circular sequence only if * {@link #outputUnigrams} = true. */	TokenNameCOMMENT_JAVADOC	 <p>Increments this circular number's value to the next member in the circular sequence <code>gramSize</code> will take on values from the circular sequence <b>{ [ 1, ] {@link #minShingleSize} [ , ... , {@link #maxShingleSize} ] }</b>. <p>1 is included in the circular sequence only if {@link #outputUnigrams} = true. 
public	TokenNamepublic	
void	TokenNamevoid	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
previousValue	TokenNameIdentifier	 previous Value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
minShingleSize	TokenNameIdentifier	 min Shingle Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Sets this circular number's value to the first member of the * circular sequence * <p><code>gramSize</code> will take on values from the circular sequence * <b>{ [ 1, ] {@link #minShingleSize} [ , ... , {@link #maxShingleSize} ] }</b>. * <p>1 is included in the circular sequence only if * {@link #outputUnigrams} = true. */	TokenNameCOMMENT_JAVADOC	 <p>Sets this circular number's value to the first member of the circular sequence <p><code>gramSize</code> will take on values from the circular sequence <b>{ [ 1, ] {@link #minShingleSize} [ , ... , {@link #maxShingleSize} ] }</b>. <p>1 is included in the circular sequence only if {@link #outputUnigrams} = true. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
previousValue	TokenNameIdentifier	 previous Value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
minValue	TokenNameIdentifier	 min Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Returns true if the current value is the first member of the circular * sequence. * <p>If {@link #outputUnigrams} = true, the first member of the circular * sequence will be 1; otherwise, it will be {@link #minShingleSize}. * * @return true if the current value is the first member of the circular * sequence; false otherwise */	TokenNameCOMMENT_JAVADOC	 <p>Returns true if the current value is the first member of the circular sequence. <p>If {@link #outputUnigrams} = true, the first member of the circular sequence will be 1; otherwise, it will be {@link #minShingleSize}. * @return true if the current value is the first member of the circular sequence; false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
atMinValue	TokenNameIdentifier	 at Min Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
minValue	TokenNameIdentifier	 min Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the value this instance had before the last advance() call */	TokenNameCOMMENT_JAVADOC	 @return the value this instance had before the last advance() call 
public	TokenNamepublic	
int	TokenNameint	
getPreviousValue	TokenNameIdentifier	 get Previous Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
previousValue	TokenNameIdentifier	 previous Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
InputWindowToken	TokenNameIdentifier	 Input Window Token
{	TokenNameLBRACE	
final	TokenNamefinal	
AttributeSource	TokenNameIdentifier	 Attribute Source
attSource	TokenNameIdentifier	 att Source
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
;	TokenNameSEMICOLON	
final	TokenNamefinal	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isFiller	TokenNameIdentifier	 is Filler
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InputWindowToken	TokenNameIdentifier	 Input Window Token
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
attSource	TokenNameIdentifier	 att Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
attSource	TokenNameIdentifier	 att Source
=	TokenNameEQUAL	
attSource	TokenNameIdentifier	 att Source
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
attSource	TokenNameIdentifier	 att Source
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
attSource	TokenNameIdentifier	 att Source
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
