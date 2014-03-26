package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
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
CharacterUtils	TokenNameIdentifier	 Character Utils
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
VirtualMethod	TokenNameIdentifier	 Virtual Method
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
CharacterUtils	TokenNameIdentifier	 Character Utils
.	TokenNameDOT	
CharacterBuffer	TokenNameIdentifier	 Character Buffer
;	TokenNameSEMICOLON	
/** * An abstract base class for simple, character-oriented tokenizers. * <p> * <a name="version">You must specify the required {@link Version} compatibility * when creating {@link CharTokenizer}: * <ul> * <li>As of 3.1, {@link CharTokenizer} uses an int based API to normalize and * detect token codepoints. See {@link #isTokenChar(int)} and * {@link #normalize(int)} for details.</li> * </ul> * <p> * A new {@link CharTokenizer} API has been introduced with Lucene 3.1. This API * moved from UTF-16 code units to UTF-32 codepoints to eventually add support * for <a href= * "http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Character.html#supplementary" * >supplementary characters</a>. The old <i>char</i> based API has been * deprecated and should be replaced with the <i>int</i> based methods * {@link #isTokenChar(int)} and {@link #normalize(int)}. * </p> * <p> * As of Lucene 3.1 each {@link CharTokenizer} - constructor expects a * {@link Version} argument. Based on the given {@link Version} either the new * API or a backwards compatibility layer is used at runtime. For * {@link Version} < 3.1 the backwards compatibility layer ensures correct * behavior even for indexes build with previous versions of Lucene. If a * {@link Version} >= 3.1 is used {@link CharTokenizer} requires the new API to * be implemented by the instantiated class. Yet, the old <i>char</i> based API * is not required anymore even if backwards compatibility must be preserved. * {@link CharTokenizer} subclasses implementing the new API are fully backwards * compatible if instantiated with {@link Version} < 3.1. * </p> * <p> * <strong>Note:</strong> If you use a subclass of {@link CharTokenizer} with {@link Version} >= * 3.1 on an index build with a version < 3.1, created tokens might not be * compatible with the terms in your index. * </p> **/	TokenNameCOMMENT_JAVADOC	 An abstract base class for simple, character-oriented tokenizers. <p> <a name="version">You must specify the required {@link Version} compatibility when creating {@link CharTokenizer}: <ul> <li>As of 3.1, {@link CharTokenizer} uses an int based API to normalize and detect token codepoints. See {@link #isTokenChar(int)} and {@link #normalize(int)} for details.</li> </ul> <p> A new {@link CharTokenizer} API has been introduced with Lucene 3.1. This API moved from UTF-16 code units to UTF-32 codepoints to eventually add support for <a href= "http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Character.html#supplementary" >supplementary characters</a>. The old <i>char</i> based API has been deprecated and should be replaced with the <i>int</i> based methods {@link #isTokenChar(int)} and {@link #normalize(int)}. </p> <p> As of Lucene 3.1 each {@link CharTokenizer} - constructor expects a {@link Version} argument. Based on the given {@link Version} either the new API or a backwards compatibility layer is used at runtime. For {@link Version} < 3.1 the backwards compatibility layer ensures correct behavior even for indexes build with previous versions of Lucene. If a {@link Version} >= 3.1 is used {@link CharTokenizer} requires the new API to be implemented by the instantiated class. Yet, the old <i>char</i> based API is not required anymore even if backwards compatibility must be preserved. {@link CharTokenizer} subclasses implementing the new API are fully backwards compatible if instantiated with {@link Version} < 3.1. </p> <p> <strong>Note:</strong> If you use a subclass of {@link CharTokenizer} with {@link Version} >= 3.1 on an index build with a version < 3.1, created tokens might not be compatible with the terms in your index. </p> *
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
extends	TokenNameextends	
Tokenizer	TokenNameIdentifier	 Tokenizer
{	TokenNameLBRACE	
/** * Creates a new {@link CharTokenizer} instance * * @param matchVersion * Lucene version to match See {@link <a href="#version">above</a>} * @param input * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link CharTokenizer} instance * @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} @param input the input to split up into tokens 
public	TokenNamepublic	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charUtils	TokenNameIdentifier	 char Utils
=	TokenNameEQUAL	
CharacterUtils	TokenNameIdentifier	 Character Utils
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
useOldAPI	TokenNameIdentifier	 use Old API
=	TokenNameEQUAL	
useOldAPI	TokenNameIdentifier	 use Old API
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link CharTokenizer} instance * * @param matchVersion * Lucene version to match See {@link <a href="#version">above</a>} * @param source * the attribute source to use for this {@link Tokenizer} * @param input * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link CharTokenizer} instance * @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} @param source the attribute source to use for this {@link Tokenizer} @param input the input to split up into tokens 
public	TokenNamepublic	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charUtils	TokenNameIdentifier	 char Utils
=	TokenNameEQUAL	
CharacterUtils	TokenNameIdentifier	 Character Utils
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
useOldAPI	TokenNameIdentifier	 use Old API
=	TokenNameEQUAL	
useOldAPI	TokenNameIdentifier	 use Old API
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link CharTokenizer} instance * * @param matchVersion * Lucene version to match See {@link <a href="#version">above</a>} * @param factory * the attribute factory to use for this {@link Tokenizer} * @param input * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link CharTokenizer} instance * @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} @param factory the attribute factory to use for this {@link Tokenizer} @param input the input to split up into tokens 
public	TokenNamepublic	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charUtils	TokenNameIdentifier	 char Utils
=	TokenNameEQUAL	
CharacterUtils	TokenNameIdentifier	 Character Utils
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
useOldAPI	TokenNameIdentifier	 use Old API
=	TokenNameEQUAL	
useOldAPI	TokenNameIdentifier	 use Old API
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link CharTokenizer} instance * @param input the input to split up into tokens * @deprecated use {@link #CharTokenizer(Version, Reader)} instead. This will be * removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link CharTokenizer} instance @param input the input to split up into tokens @deprecated use {@link #CharTokenizer(Version, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link CharTokenizer} instance * @param input the input to split up into tokens * @param source the attribute source to use for this {@link Tokenizer} * @deprecated use {@link #CharTokenizer(Version, AttributeSource, Reader)} instead. This will be * removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link CharTokenizer} instance @param input the input to split up into tokens @param source the attribute source to use for this {@link Tokenizer} @deprecated use {@link #CharTokenizer(Version, AttributeSource, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link CharTokenizer} instance * @param input the input to split up into tokens * @param factory the attribute factory to use for this {@link Tokenizer} * @deprecated use {@link #CharTokenizer(Version, AttributeSource.AttributeFactory, Reader)} instead. This will be * removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link CharTokenizer} instance @param input the input to split up into tokens @param factory the attribute factory to use for this {@link Tokenizer} @deprecated use {@link #CharTokenizer(Version, AttributeSource.AttributeFactory, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bufferIndex	TokenNameIdentifier	 buffer Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dataLen	TokenNameIdentifier	 data Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
finalOffset	TokenNameIdentifier	 final Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_WORD_LEN	TokenNameIdentifier	 MAX  WORD  LEN
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IO_BUFFER_SIZE	TokenNameIdentifier	 IO  BUFFER  SIZE
=	TokenNameEQUAL	
4096	TokenNameIntegerLiteral	
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
CharacterUtils	TokenNameIdentifier	 Character Utils
charUtils	TokenNameIdentifier	 char Utils
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CharacterBuffer	TokenNameIdentifier	 Character Buffer
ioBuffer	TokenNameIdentifier	 io Buffer
=	TokenNameEQUAL	
CharacterUtils	TokenNameIdentifier	 Character Utils
.	TokenNameDOT	
newCharacterBuffer	TokenNameIdentifier	 new Character Buffer
(	TokenNameLPAREN	
IO_BUFFER_SIZE	TokenNameIdentifier	 IO  BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @deprecated this will be removed in lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated this will be removed in lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
useOldAPI	TokenNameIdentifier	 use Old API
;	TokenNameSEMICOLON	
/** * @deprecated this will be removed in lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated this will be removed in lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
>	TokenNameGREATER	
isTokenCharMethod	TokenNameIdentifier	 is Token Char Method
=	TokenNameEQUAL	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
>	TokenNameGREATER	
(	TokenNameLPAREN	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"isTokenChar"	TokenNameStringLiteral	isTokenChar
,	TokenNameCOMMA	
char	TokenNamechar	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @deprecated this will be removed in lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated this will be removed in lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
>	TokenNameGREATER	
normalizeMethod	TokenNameIdentifier	 normalize Method
=	TokenNameEQUAL	
new	TokenNamenew	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
>	TokenNameGREATER	
(	TokenNameLPAREN	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"normalize"	TokenNameStringLiteral	normalize
,	TokenNameCOMMA	
char	TokenNamechar	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true iff a UTF-16 code unit should be included in a token. This * tokenizer generates as tokens adjacent sequences of characters which * satisfy this predicate. Characters for which this is <code>false</code> are * used to define token boundaries and are not included in tokens. * <p> * Note: This method cannot handle <a href= * "http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Character.html#supplementary" * >supplementary characters</a>. To support all Unicode characters, including * supplementary characters, use the {@link #isTokenChar(int)} method. * </p> * * @deprecated use {@link #isTokenChar(int)} instead. This method will be * removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Returns true iff a UTF-16 code unit should be included in a token. This tokenizer generates as tokens adjacent sequences of characters which satisfy this predicate. Characters for which this is <code>false</code> are used to define token boundaries and are not included in tokens. <p> Note: This method cannot handle <a href= "http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Character.html#supplementary" >supplementary characters</a>. To support all Unicode characters, including supplementary characters, use the {@link #isTokenChar(int)} method. </p> * @deprecated use {@link #isTokenChar(int)} instead. This method will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
boolean	TokenNameboolean	
isTokenChar	TokenNameIdentifier	 is Token Char
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isTokenChar	TokenNameIdentifier	 is Token Char
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called on each token UTF-16 code unit to normalize it before it is added to the * token. The default implementation does nothing. Subclasses may use this to, * e.g., lowercase tokens. * <p> * Note: This method cannot handle <a href= * "http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Character.html#supplementary" * >supplementary characters</a>. To support all Unicode characters, including * supplementary characters, use the {@link #normalize(int)} method. * </p> * * @deprecated use {@link #normalize(int)} instead. This method will be * removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Called on each token UTF-16 code unit to normalize it before it is added to the token. The default implementation does nothing. Subclasses may use this to, e.g., lowercase tokens. <p> Note: This method cannot handle <a href= "http://java.sun.com/j2se/1.5.0/docs/api/java/lang/Character.html#supplementary" >supplementary characters</a>. To support all Unicode characters, including supplementary characters, use the {@link #normalize(int)} method. </p> * @deprecated use {@link #normalize(int)} instead. This method will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
char	TokenNamechar	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true iff a codepoint should be included in a token. This tokenizer * generates as tokens adjacent sequences of codepoints which satisfy this * predicate. Codepoints for which this is false are used to define token * boundaries and are not included in tokens. * <p> * As of Lucene 3.1 the char based API ({@link #isTokenChar(char)} and * {@link #normalize(char)}) has been depreciated in favor of a Unicode 4.0 * compatible int based API to support codepoints instead of UTF-16 code * units. Subclasses of {@link CharTokenizer} must not override the char based * methods if a {@link Version} >= 3.1 is passed to the constructor. * <p> * <p> * NOTE: This method will be marked <i>abstract</i> in Lucene 4.0. * </p> */	TokenNameCOMMENT_JAVADOC	 Returns true iff a codepoint should be included in a token. This tokenizer generates as tokens adjacent sequences of codepoints which satisfy this predicate. Codepoints for which this is false are used to define token boundaries and are not included in tokens. <p> As of Lucene 3.1 the char based API ({@link #isTokenChar(char)} and {@link #normalize(char)}) has been depreciated in favor of a Unicode 4.0 compatible int based API to support codepoints instead of UTF-16 code units. Subclasses of {@link CharTokenizer} must not override the char based methods if a {@link Version} >= 3.1 is passed to the constructor. <p> <p> NOTE: This method will be marked <i>abstract</i> in Lucene 4.0. </p> 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isTokenChar	TokenNameIdentifier	 is Token Char
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"since LUCENE_31 subclasses of CharTokenizer must implement isTokenChar(int)"	TokenNameStringLiteral	since LUCENE_31 subclasses of CharTokenizer must implement isTokenChar(int)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called on each token character to normalize it before it is added to the * token. The default implementation does nothing. Subclasses may use this to, * e.g., lowercase tokens. * <p> * As of Lucene 3.1 the char based API ({@link #isTokenChar(char)} and * {@link #normalize(char)}) has been depreciated in favor of a Unicode 4.0 * compatible int based API to support codepoints instead of UTF-16 code * units. Subclasses of {@link CharTokenizer} must not override the char based * methods if a {@link Version} >= 3.1 is passed to the constructor. * <p> * <p> * NOTE: This method will be marked <i>abstract</i> in Lucene 4.0. * </p> */	TokenNameCOMMENT_JAVADOC	 Called on each token character to normalize it before it is added to the token. The default implementation does nothing. Subclasses may use this to, e.g., lowercase tokens. <p> As of Lucene 3.1 the char based API ({@link #isTokenChar(char)} and {@link #normalize(char)}) has been depreciated in favor of a Unicode 4.0 compatible int based API to support codepoints instead of UTF-16 code units. Subclasses of {@link CharTokenizer} must not override the char based methods if a {@link Version} >= 3.1 is passed to the constructor. <p> <p> NOTE: This method will be marked <i>abstract</i> in Lucene 4.0. </p> 
protected	TokenNameprotected	
int	TokenNameint	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
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
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useOldAPI	TokenNameIdentifier	 use Old API
)	TokenNameRPAREN	
// TODO remove this in LUCENE 4.0 	TokenNameCOMMENT_LINE	TODO remove this in LUCENE 4.0 
return	TokenNamereturn	
incrementTokenOld	TokenNameIdentifier	 increment Token Old
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// this variable is always initialized 	TokenNameCOMMENT_LINE	this variable is always initialized 
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferIndex	TokenNameIdentifier	 buffer Index
>=	TokenNameGREATER_EQUAL	
dataLen	TokenNameIdentifier	 data Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
dataLen	TokenNameIdentifier	 data Len
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
charUtils	TokenNameIdentifier	 char Utils
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
ioBuffer	TokenNameIdentifier	 io Buffer
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// read supplementary char aware with CharacterUtils 	TokenNameCOMMENT_LINE	read supplementary char aware with CharacterUtils 
dataLen	TokenNameIdentifier	 data Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// so next offset += dataLen won't decrement offset 	TokenNameCOMMENT_LINE	so next offset += dataLen won't decrement offset 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
finalOffset	TokenNameIdentifier	 final Offset
=	TokenNameEQUAL	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
dataLen	TokenNameIdentifier	 data Len
=	TokenNameEQUAL	
ioBuffer	TokenNameIdentifier	 io Buffer
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferIndex	TokenNameIdentifier	 buffer Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// use CharacterUtils here to support < 3.1 UTF-16 code unit behavior if the char based methods are gone 	TokenNameCOMMENT_LINE	use CharacterUtils here to support < 3.1 UTF-16 code unit behavior if the char based methods are gone 
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
charUtils	TokenNameIdentifier	 char Utils
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
ioBuffer	TokenNameIdentifier	 io Buffer
.	TokenNameDOT	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bufferIndex	TokenNameIdentifier	 buffer Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
charCount	TokenNameIdentifier	 char Count
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
charCount	TokenNameIdentifier	 char Count
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferIndex	TokenNameIdentifier	 buffer Index
+=	TokenNamePLUS_EQUAL	
charCount	TokenNameIdentifier	 char Count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isTokenChar	TokenNameIdentifier	 is Token Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if it's a token char 	TokenNameCOMMENT_LINE	if it's a token char 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// start of token 	TokenNameCOMMENT_LINE	start of token 
assert	TokenNameassert	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
bufferIndex	TokenNameIdentifier	 buffer Index
-	TokenNameMINUS	
charCount	TokenNameIdentifier	 char Count
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check if a supplementary could run out of bounds 	TokenNameCOMMENT_LINE	check if a supplementary could run out of bounds 
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure a supplementary fits in the buffer 	TokenNameCOMMENT_LINE	make sure a supplementary fits in the buffer 
}	TokenNameRBRACE	
end	TokenNameIdentifier	 end
+=	TokenNamePLUS_EQUAL	
charCount	TokenNameIdentifier	 char Count
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toChars	TokenNameIdentifier	 to Chars
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// buffer it, normalized 	TokenNameCOMMENT_LINE	buffer it, normalized 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
MAX_WORD_LEN	TokenNameIdentifier	 MAX  WORD  LEN
)	TokenNameRPAREN	
// buffer overflow! make sure to check for >= surrogate pair could break == test 	TokenNameCOMMENT_LINE	buffer overflow! make sure to check for >= surrogate pair could break == test 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// at non-Letter w/ chars 	TokenNameCOMMENT_LINE	at non-Letter w/ chars 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// return 'em 	TokenNameCOMMENT_LINE	return 'em 
}	TokenNameRBRACE	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
start	TokenNameIdentifier	 start
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
,	TokenNameCOMMA	
finalOffset	TokenNameIdentifier	 final Offset
=	TokenNameEQUAL	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The <= 3.0 version of incrementToken. This is a backwards compat implementation used * if a version <= 3.0 is provided to the ctor. * @deprecated remove in 4.0 */	TokenNameCOMMENT_JAVADOC	 The <= 3.0 version of incrementToken. This is a backwards compat implementation used if a version <= 3.0 is provided to the ctor. @deprecated remove in 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
boolean	TokenNameboolean	
incrementTokenOld	TokenNameIdentifier	 increment Token Old
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// this variable is always initialized 	TokenNameCOMMENT_LINE	this variable is always initialized 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldIoBuffer	TokenNameIdentifier	 old Io Buffer
=	TokenNameEQUAL	
ioBuffer	TokenNameIdentifier	 io Buffer
.	TokenNameDOT	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferIndex	TokenNameIdentifier	 buffer Index
>=	TokenNameGREATER_EQUAL	
dataLen	TokenNameIdentifier	 data Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
dataLen	TokenNameIdentifier	 data Len
;	TokenNameSEMICOLON	
dataLen	TokenNameIdentifier	 data Len
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
oldIoBuffer	TokenNameIdentifier	 old Io Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataLen	TokenNameIdentifier	 data Len
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataLen	TokenNameIdentifier	 data Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// so next offset += dataLen won't decrement offset 	TokenNameCOMMENT_LINE	so next offset += dataLen won't decrement offset 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
finalOffset	TokenNameIdentifier	 final Offset
=	TokenNameEQUAL	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
bufferIndex	TokenNameIdentifier	 buffer Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
oldIoBuffer	TokenNameIdentifier	 old Io Buffer
[	TokenNameLBRACKET	
bufferIndex	TokenNameIdentifier	 buffer Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isTokenChar	TokenNameIdentifier	 is Token Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if it's a token char 	TokenNameCOMMENT_LINE	if it's a token char 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// start of token 	TokenNameCOMMENT_LINE	start of token 
assert	TokenNameassert	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
bufferIndex	TokenNameIdentifier	 buffer Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// buffer it, normalized 	TokenNameCOMMENT_LINE	buffer it, normalized 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
MAX_WORD_LEN	TokenNameIdentifier	 MAX  WORD  LEN
)	TokenNameRPAREN	
// buffer overflow! 	TokenNameCOMMENT_LINE	buffer overflow! 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// at non-Letter w/ chars 	TokenNameCOMMENT_LINE	at non-Letter w/ chars 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// return 'em 	TokenNameCOMMENT_LINE	return 'em 
}	TokenNameRBRACE	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
start	TokenNameIdentifier	 start
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set final offset 	TokenNameCOMMENT_LINE	set final offset 
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
finalOffset	TokenNameIdentifier	 final Offset
,	TokenNameCOMMA	
finalOffset	TokenNameIdentifier	 final Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bufferIndex	TokenNameIdentifier	 buffer Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dataLen	TokenNameIdentifier	 data Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
finalOffset	TokenNameIdentifier	 final Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ioBuffer	TokenNameIdentifier	 io Buffer
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure to reset the IO buffer!! 	TokenNameCOMMENT_LINE	make sure to reset the IO buffer!! 
}	TokenNameRBRACE	
/** * @deprecated this will be removed in lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated this will be removed in lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
private	TokenNameprivate	
boolean	TokenNameboolean	
useOldAPI	TokenNameIdentifier	 use Old API
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
isTokenCharMethod	TokenNameIdentifier	 is Token Char Method
.	TokenNameDOT	
isOverriddenAsOf	TokenNameIdentifier	 is Overridden As Of
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
||	TokenNameOR_OR	
normalizeMethod	TokenNameIdentifier	 normalize Method
.	TokenNameDOT	
isOverriddenAsOf	TokenNameIdentifier	 is Overridden As Of
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"For matchVersion >= LUCENE_31, CharTokenizer subclasses must not override isTokenChar(char) or normalize(char)."	TokenNameStringLiteral	For matchVersion >= LUCENE_31, CharTokenizer subclasses must not override isTokenChar(char) or normalize(char).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
!	TokenNameNOT	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
