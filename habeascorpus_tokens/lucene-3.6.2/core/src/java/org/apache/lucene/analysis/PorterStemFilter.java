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
KeywordAttribute	TokenNameIdentifier	 Keyword Attribute
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
/** Transforms the token stream as per the Porter stemming algorithm. Note: the input to the stemming filter must already be in lower case, so you will need to use LowerCaseFilter or LowerCaseTokenizer farther down the Tokenizer chain in order for this to work properly! <P> To use this filter with other analyzers, you'll want to write an Analyzer class that sets up the TokenStream chain as you want it. To use this with LowerCaseTokenizer, for example, you'd write an analyzer like this: <P> <PRE> class MyAnalyzer extends Analyzer { public final TokenStream tokenStream(String fieldName, Reader reader) { return new PorterStemFilter(new LowerCaseTokenizer(reader)); } } </PRE> <p> Note: This filter is aware of the {@link KeywordAttribute}. To prevent certain terms from being passed to the stemmer {@link KeywordAttribute#isKeyword()} should be set to <code>true</code> in a previous {@link TokenStream}. </p> */	TokenNameCOMMENT_JAVADOC	 Transforms the token stream as per the Porter stemming algorithm. Note: the input to the stemming filter must already be in lower case, so you will need to use LowerCaseFilter or LowerCaseTokenizer farther down the Tokenizer chain in order for this to work properly! <P> To use this filter with other analyzers, you'll want to write an Analyzer class that sets up the TokenStream chain as you want it. To use this with LowerCaseTokenizer, for example, you'd write an analyzer like this: <P> <PRE> class MyAnalyzer extends Analyzer { public final TokenStream tokenStream(String fieldName, Reader reader) { return new PorterStemFilter(new LowerCaseTokenizer(reader)); } } </PRE> <p> Note: This filter is aware of the {@link KeywordAttribute}. To prevent certain terms from being passed to the stemmer {@link KeywordAttribute#isKeyword()} should be set to <code>true</code> in a previous {@link TokenStream}. </p> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
PorterStemFilter	TokenNameIdentifier	 Porter Stem Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
PorterStemmer	TokenNameIdentifier	 Porter Stemmer
stemmer	TokenNameIdentifier	 stemmer
=	TokenNameEQUAL	
new	TokenNamenew	
PorterStemmer	TokenNameIdentifier	 Porter Stemmer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
KeywordAttribute	TokenNameIdentifier	 Keyword Attribute
keywordAttr	TokenNameIdentifier	 keyword Attr
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
KeywordAttribute	TokenNameIdentifier	 Keyword Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PorterStemFilter	TokenNameIdentifier	 Porter Stem Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
!	TokenNameNOT	
keywordAttr	TokenNameIdentifier	 keyword Attr
.	TokenNameDOT	
isKeyword	TokenNameIdentifier	 is Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
stem	TokenNameIdentifier	 stem
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
)	TokenNameRPAREN	
)	TokenNameRPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
getResultBuffer	TokenNameIdentifier	 get Result Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
getResultLength	TokenNameIdentifier	 get Result Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
