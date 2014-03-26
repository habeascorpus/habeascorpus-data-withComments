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
Reader	TokenNameIdentifier	 Reader
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
/** * LowerCaseTokenizer performs the function of LetterTokenizer * and LowerCaseFilter together. It divides text at non-letters and converts * them to lower case. While it is functionally equivalent to the combination * of LetterTokenizer and LowerCaseFilter, there is a performance advantage * to doing the two tasks at once, hence this (redundant) implementation. * <P> * Note: this does a decent job for most European languages, but does a terrible * job for some Asian languages, where words are not separated by spaces. * </p> * <p> * <a name="version"/> * You must specify the required {@link Version} compatibility when creating * {@link LowerCaseTokenizer}: * <ul> * <li>As of 3.1, {@link CharTokenizer} uses an int based API to normalize and * detect token characters. See {@link CharTokenizer#isTokenChar(int)} and * {@link CharTokenizer#normalize(int)} for details.</li> * </ul> * </p> */	TokenNameCOMMENT_JAVADOC	 LowerCaseTokenizer performs the function of LetterTokenizer and LowerCaseFilter together. It divides text at non-letters and converts them to lower case. While it is functionally equivalent to the combination of LetterTokenizer and LowerCaseFilter, there is a performance advantage to doing the two tasks at once, hence this (redundant) implementation. <P> Note: this does a decent job for most European languages, but does a terrible job for some Asian languages, where words are not separated by spaces. </p> <p> <a name="version"/> You must specify the required {@link Version} compatibility when creating {@link LowerCaseTokenizer}: <ul> <li>As of 3.1, {@link CharTokenizer} uses an int based API to normalize and detect token characters. See {@link CharTokenizer#isTokenChar(int)} and {@link CharTokenizer#normalize(int)} for details.</li> </ul> </p> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
LowerCaseTokenizer	TokenNameIdentifier	 Lower Case Tokenizer
extends	TokenNameextends	
LetterTokenizer	TokenNameIdentifier	 Letter Tokenizer
{	TokenNameLBRACE	
/** * Construct a new LowerCaseTokenizer. * * @param matchVersion * Lucene version to match See {@link <a href="#version">above</a>} * * @param in * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Construct a new LowerCaseTokenizer. * @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} * @param in the input to split up into tokens 
public	TokenNamepublic	
LowerCaseTokenizer	TokenNameIdentifier	 Lower Case Tokenizer
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
/** * Construct a new LowerCaseTokenizer using a given {@link AttributeSource}. * * @param matchVersion * Lucene version to match See {@link <a href="#version">above</a>} * @param source * the attribute source to use for this {@link Tokenizer} * @param in * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Construct a new LowerCaseTokenizer using a given {@link AttributeSource}. * @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} @param source the attribute source to use for this {@link Tokenizer} @param in the input to split up into tokens 
public	TokenNamepublic	
LowerCaseTokenizer	TokenNameIdentifier	 Lower Case Tokenizer
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
/** * Construct a new LowerCaseTokenizer using a given * {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * * @param matchVersion * Lucene version to match See {@link <a href="#version">above</a>} * @param factory * the attribute factory to use for this {@link Tokenizer} * @param in * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Construct a new LowerCaseTokenizer using a given {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} @param factory the attribute factory to use for this {@link Tokenizer} @param in the input to split up into tokens 
public	TokenNamepublic	
LowerCaseTokenizer	TokenNameIdentifier	 Lower Case Tokenizer
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
/** * Construct a new LowerCaseTokenizer. * * @deprecated use {@link #LowerCaseTokenizer(Version, Reader)} instead. This will be * removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Construct a new LowerCaseTokenizer. * @deprecated use {@link #LowerCaseTokenizer(Version, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
LowerCaseTokenizer	TokenNameIdentifier	 Lower Case Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new LowerCaseTokenizer using a given {@link AttributeSource}. * * @deprecated use {@link #LowerCaseTokenizer(Version, AttributeSource, Reader)} * instead. This will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Construct a new LowerCaseTokenizer using a given {@link AttributeSource}. * @deprecated use {@link #LowerCaseTokenizer(Version, AttributeSource, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
LowerCaseTokenizer	TokenNameIdentifier	 Lower Case Tokenizer
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
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new LowerCaseTokenizer using a given * {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * * @deprecated use {@link #LowerCaseTokenizer(Version, AttributeSource.AttributeFactory, Reader)} * instead. This will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Construct a new LowerCaseTokenizer using a given {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * @deprecated use {@link #LowerCaseTokenizer(Version, AttributeSource.AttributeFactory, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
LowerCaseTokenizer	TokenNameIdentifier	 Lower Case Tokenizer
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
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Converts char to lower case * {@link Character#toLowerCase(int)}.*/	TokenNameCOMMENT_JAVADOC	 Converts char to lower case {@link Character#toLowerCase(int)}.
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
