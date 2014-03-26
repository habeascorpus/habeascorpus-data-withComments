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
/** * A WhitespaceTokenizer is a tokenizer that divides text at whitespace. * Adjacent sequences of non-Whitespace characters form tokens. <a * name="version"/> * <p> * You must specify the required {@link Version} compatibility when creating * {@link WhitespaceTokenizer}: * <ul> * <li>As of 3.1, {@link CharTokenizer} uses an int based API to normalize and * detect token characters. See {@link CharTokenizer#isTokenChar(int)} and * {@link CharTokenizer#normalize(int)} for details.</li> * </ul> */	TokenNameCOMMENT_JAVADOC	 A WhitespaceTokenizer is a tokenizer that divides text at whitespace. Adjacent sequences of non-Whitespace characters form tokens. <a name="version"/> <p> You must specify the required {@link Version} compatibility when creating {@link WhitespaceTokenizer}: <ul> <li>As of 3.1, {@link CharTokenizer} uses an int based API to normalize and detect token characters. See {@link CharTokenizer#isTokenChar(int)} and {@link CharTokenizer#normalize(int)} for details.</li> </ul> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
WhitespaceTokenizer	TokenNameIdentifier	 Whitespace Tokenizer
extends	TokenNameextends	
CharTokenizer	TokenNameIdentifier	 Char Tokenizer
{	TokenNameLBRACE	
/** * Construct a new WhitespaceTokenizer. * @param matchVersion Lucene version * to match See {@link <a href="#version">above</a>} * * @param in * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Construct a new WhitespaceTokenizer. @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} * @param in the input to split up into tokens 
public	TokenNamepublic	
WhitespaceTokenizer	TokenNameIdentifier	 Whitespace Tokenizer
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
/** * Construct a new WhitespaceTokenizer using a given {@link AttributeSource}. * * @param matchVersion * Lucene version to match See {@link <a href="#version">above</a>} * @param source * the attribute source to use for this {@link Tokenizer} * @param in * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Construct a new WhitespaceTokenizer using a given {@link AttributeSource}. * @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} @param source the attribute source to use for this {@link Tokenizer} @param in the input to split up into tokens 
public	TokenNamepublic	
WhitespaceTokenizer	TokenNameIdentifier	 Whitespace Tokenizer
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
/** * Construct a new WhitespaceTokenizer using a given * {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * * @param * matchVersion Lucene version to match See * {@link <a href="#version">above</a>} * @param factory * the attribute factory to use for this {@link Tokenizer} * @param in * the input to split up into tokens */	TokenNameCOMMENT_JAVADOC	 Construct a new WhitespaceTokenizer using a given {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} @param factory the attribute factory to use for this {@link Tokenizer} @param in the input to split up into tokens 
public	TokenNamepublic	
WhitespaceTokenizer	TokenNameIdentifier	 Whitespace Tokenizer
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
/** * Construct a new WhitespaceTokenizer. * * @deprecated use {@link #WhitespaceTokenizer(Version, Reader)} instead. This will * be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Construct a new WhitespaceTokenizer. * @deprecated use {@link #WhitespaceTokenizer(Version, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
WhitespaceTokenizer	TokenNameIdentifier	 Whitespace Tokenizer
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
/** * Construct a new WhitespaceTokenizer using a given {@link AttributeSource}. * * @deprecated use {@link #WhitespaceTokenizer(Version, AttributeSource, Reader)} * instead. This will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Construct a new WhitespaceTokenizer using a given {@link AttributeSource}. * @deprecated use {@link #WhitespaceTokenizer(Version, AttributeSource, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
WhitespaceTokenizer	TokenNameIdentifier	 Whitespace Tokenizer
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
/** * Construct a new WhitespaceTokenizer using a given * {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * * @deprecated use {@link #WhitespaceTokenizer(Version, AttributeSource.AttributeFactory, Reader)} * instead. This will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Construct a new WhitespaceTokenizer using a given {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * @deprecated use {@link #WhitespaceTokenizer(Version, AttributeSource.AttributeFactory, Reader)} instead. This will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
WhitespaceTokenizer	TokenNameIdentifier	 Whitespace Tokenizer
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
/** Collects only characters which do not satisfy * {@link Character#isWhitespace(int)}.*/	TokenNameCOMMENT_JAVADOC	 Collects only characters which do not satisfy {@link Character#isWhitespace(int)}.
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
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
