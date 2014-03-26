package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ar	TokenNameIdentifier	 ar
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
LetterTokenizer	TokenNameIdentifier	 Letter Tokenizer
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
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
;	TokenNameSEMICOLON	
// javadoc @link 	TokenNameCOMMENT_LINE	javadoc @link 
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
/** * Tokenizer that breaks text into runs of letters and diacritics. * <p> * The problem with the standard Letter tokenizer is that it fails on diacritics. * Handling similar to this is necessary for Indic Scripts, Hebrew, Thaana, etc. * </p> * <p> * <a name="version"/> * You must specify the required {@link Version} compatibility when creating * {@link ArabicLetterTokenizer}: * <ul> * <li>As of 3.1, {@link CharTokenizer} uses an int based API to normalize and * detect token characters. See {@link #isTokenChar(int)} and * {@link #normalize(int)} for details.</li> * </ul> * @deprecated (3.1) Use {@link StandardTokenizer} instead. */	TokenNameCOMMENT_JAVADOC	 Tokenizer that breaks text into runs of letters and diacritics. <p> The problem with the standard Letter tokenizer is that it fails on diacritics. Handling similar to this is necessary for Indic Scripts, Hebrew, Thaana, etc. </p> <p> <a name="version"/> You must specify the required {@link Version} compatibility when creating {@link ArabicLetterTokenizer}: <ul> <li>As of 3.1, {@link CharTokenizer} uses an int based API to normalize and detect token characters. See {@link #isTokenChar(int)} and {@link #normalize(int)} for details.</li> </ul> @deprecated (3.1) Use {@link StandardTokenizer} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
ArabicLetterTokenizer	TokenNameIdentifier	 Arabic Letter Tokenizer
extends	TokenNameextends	
LetterTokenizer	TokenNameIdentifier	 Letter Tokenizer
{	TokenNameLBRACE	
/** * Construct a new ArabicLetterTokenizer. * @param matchVersion Lucene version * to match See {@link <a href="#version">above</a>} * * @param in * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Construct a new ArabicLetterTokenizer. @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} * @param in the input to split up into tokens 
public	TokenNamepublic	
ArabicLetterTokenizer	TokenNameIdentifier	 Arabic Letter Tokenizer
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
/** * Construct a new ArabicLetterTokenizer using a given {@link AttributeSource}. * * @param matchVersion * Lucene version to match See {@link <a href="#version">above</a>} * @param source * the attribute source to use for this Tokenizer * @param in * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Construct a new ArabicLetterTokenizer using a given {@link AttributeSource}. * @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} @param source the attribute source to use for this Tokenizer @param in the input to split up into tokens 
public	TokenNamepublic	
ArabicLetterTokenizer	TokenNameIdentifier	 Arabic Letter Tokenizer
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
/** * Construct a new ArabicLetterTokenizer using a given * {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * @param * matchVersion Lucene version to match See * {@link <a href="#version">above</a>} * * @param factory * the attribute factory to use for this Tokenizer * @param in * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Construct a new ArabicLetterTokenizer using a given {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} * @param factory the attribute factory to use for this Tokenizer @param in the input to split up into tokens 
public	TokenNamepublic	
ArabicLetterTokenizer	TokenNameIdentifier	 Arabic Letter Tokenizer
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
/** * Construct a new ArabicLetterTokenizer. * * @deprecated use {@link #ArabicLetterTokenizer(Version, Reader)} instead. This will * be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Construct a new ArabicLetterTokenizer. * @deprecated use {@link #ArabicLetterTokenizer(Version, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
ArabicLetterTokenizer	TokenNameIdentifier	 Arabic Letter Tokenizer
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
/** * Construct a new ArabicLetterTokenizer using a given {@link AttributeSource}. * * @deprecated use {@link #ArabicLetterTokenizer(Version, AttributeSource, Reader)} * instead. This will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Construct a new ArabicLetterTokenizer using a given {@link AttributeSource}. * @deprecated use {@link #ArabicLetterTokenizer(Version, AttributeSource, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
ArabicLetterTokenizer	TokenNameIdentifier	 Arabic Letter Tokenizer
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
/** * Construct a new ArabicLetterTokenizer using a given * {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * * @deprecated use {@link #ArabicLetterTokenizer(Version, AttributeSource.AttributeFactory, Reader)} * instead. This will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Construct a new ArabicLetterTokenizer using a given {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * @deprecated use {@link #ArabicLetterTokenizer(Version, AttributeSource.AttributeFactory, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
ArabicLetterTokenizer	TokenNameIdentifier	 Arabic Letter Tokenizer
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
/** * Allows for Letter category or NonspacingMark category * @see org.apache.lucene.analysis.LetterTokenizer#isTokenChar(int) */	TokenNameCOMMENT_JAVADOC	 Allows for Letter category or NonspacingMark category @see org.apache.lucene.analysis.LetterTokenizer#isTokenChar(int) 
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
super	TokenNamesuper	
.	TokenNameDOT	
isTokenChar	TokenNameIdentifier	 is Token Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
NON_SPACING_MARK	TokenNameIdentifier	 NON  SPACING  MARK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
