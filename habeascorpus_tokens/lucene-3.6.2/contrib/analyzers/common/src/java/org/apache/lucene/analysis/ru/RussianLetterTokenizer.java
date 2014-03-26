package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ru	TokenNameIdentifier	 ru
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
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
Tokenizer	TokenNameIdentifier	 Tokenizer
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
LetterTokenizer	TokenNameIdentifier	 Letter Tokenizer
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
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
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
/** * A RussianLetterTokenizer is a {@link Tokenizer} that extends {@link LetterTokenizer} * by also allowing the basic Latin digits 0-9. * <p> * <a name="version"/> * You must specify the required {@link Version} compatibility when creating * {@link RussianLetterTokenizer}: * <ul> * <li>As of 3.1, {@link CharTokenizer} uses an int based API to normalize and * detect token characters. See {@link CharTokenizer#isTokenChar(int)} and * {@link CharTokenizer#normalize(int)} for details.</li> * </ul> * @deprecated Use {@link StandardTokenizer} instead, which has the same functionality. * This filter will be removed in Lucene 5.0 */	TokenNameCOMMENT_JAVADOC	 A RussianLetterTokenizer is a {@link Tokenizer} that extends {@link LetterTokenizer} by also allowing the basic Latin digits 0-9. <p> <a name="version"/> You must specify the required {@link Version} compatibility when creating {@link RussianLetterTokenizer}: <ul> <li>As of 3.1, {@link CharTokenizer} uses an int based API to normalize and detect token characters. See {@link CharTokenizer#isTokenChar(int)} and {@link CharTokenizer#normalize(int)} for details.</li> </ul> @deprecated Use {@link StandardTokenizer} instead, which has the same functionality. This filter will be removed in Lucene 5.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
RussianLetterTokenizer	TokenNameIdentifier	 Russian Letter Tokenizer
extends	TokenNameextends	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DIGIT_0	TokenNameIdentifier	 DIGIT 0
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DIGIT_9	TokenNameIdentifier	 DIGIT 9
=	TokenNameEQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Construct a new RussianLetterTokenizer. * @param matchVersion Lucene version * to match See {@link <a href="#version">above</a>} * * @param in * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Construct a new RussianLetterTokenizer. @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} * @param in the input to split up into tokens 
public	TokenNamepublic	
RussianLetterTokenizer	TokenNameIdentifier	 Russian Letter Tokenizer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new RussianLetterTokenizer using a given {@link AttributeSource}. * * @param matchVersion * Lucene version to match See {@link <a href="#version">above</a>} * @param source * the attribute source to use for this {@link Tokenizer} * @param in * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Construct a new RussianLetterTokenizer using a given {@link AttributeSource}. * @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} @param source the attribute source to use for this {@link Tokenizer} @param in the input to split up into tokens 
public	TokenNamepublic	
RussianLetterTokenizer	TokenNameIdentifier	 Russian Letter Tokenizer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new RussianLetterTokenizer using a given * {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * @param * matchVersion Lucene version to match See * {@link <a href="#version">above</a>} * * @param factory * the attribute factory to use for this {@link Tokenizer} * @param in * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Construct a new RussianLetterTokenizer using a given {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} * @param factory the attribute factory to use for this {@link Tokenizer} @param in the input to split up into tokens 
public	TokenNamepublic	
RussianLetterTokenizer	TokenNameIdentifier	 Russian Letter Tokenizer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new RussianLetterTokenizer. * * @deprecated use {@link #RussianLetterTokenizer(Version, Reader)} instead. This will * be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Construct a new RussianLetterTokenizer. * @deprecated use {@link #RussianLetterTokenizer(Version, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
RussianLetterTokenizer	TokenNameIdentifier	 Russian Letter Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new RussianLetterTokenizer using a given {@link AttributeSource}. * * @deprecated use {@link #RussianLetterTokenizer(Version, AttributeSource, Reader)} * instead. This will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Construct a new RussianLetterTokenizer using a given {@link AttributeSource}. * @deprecated use {@link #RussianLetterTokenizer(Version, AttributeSource, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
RussianLetterTokenizer	TokenNameIdentifier	 Russian Letter Tokenizer
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new RussianLetterTokenizer using a given * {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * * @deprecated use {@link #RussianLetterTokenizer(Version, AttributeSource.AttributeFactory, Reader)} * instead. This will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Construct a new RussianLetterTokenizer using a given {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * @deprecated use {@link #RussianLetterTokenizer(Version, AttributeSource.AttributeFactory, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
RussianLetterTokenizer	TokenNameIdentifier	 Russian Letter Tokenizer
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Collects only characters which satisfy * {@link Character#isLetter(int)}. */	TokenNameCOMMENT_JAVADOC	 Collects only characters which satisfy {@link Character#isLetter(int)}. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
isTokenChar	TokenNameIdentifier	 is Token Char
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetter	TokenNameIdentifier	 is Letter
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
DIGIT_0	TokenNameIdentifier	 DIGIT 0
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
DIGIT_9	TokenNameIdentifier	 DIGIT 9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
