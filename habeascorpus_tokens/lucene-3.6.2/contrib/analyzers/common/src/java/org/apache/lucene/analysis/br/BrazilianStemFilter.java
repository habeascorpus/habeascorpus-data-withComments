package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
br	TokenNameIdentifier	 br
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
KeywordMarkerFilter	TokenNameIdentifier	 Keyword Marker Filter
;	TokenNameSEMICOLON	
// for javadoc 	TokenNameCOMMENT_LINE	for javadoc 
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
/** * A {@link TokenFilter} that applies {@link BrazilianStemmer}. * <p> * To prevent terms from being stemmed use an instance of * {@link KeywordMarkerFilter} or a custom {@link TokenFilter} that sets * the {@link KeywordAttribute} before this {@link TokenStream}. * </p> * @see KeywordMarkerFilter * */	TokenNameCOMMENT_JAVADOC	 A {@link TokenFilter} that applies {@link BrazilianStemmer}. <p> To prevent terms from being stemmed use an instance of {@link KeywordMarkerFilter} or a custom {@link TokenFilter} that sets the {@link KeywordAttribute} before this {@link TokenStream}. </p> @see KeywordMarkerFilter 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
BrazilianStemFilter	TokenNameIdentifier	 Brazilian Stem Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
/** * {@link BrazilianStemmer} in use by this filter. */	TokenNameCOMMENT_JAVADOC	 {@link BrazilianStemmer} in use by this filter. 
private	TokenNameprivate	
BrazilianStemmer	TokenNameIdentifier	 Brazilian Stemmer
stemmer	TokenNameIdentifier	 stemmer
=	TokenNameEQUAL	
new	TokenNamenew	
BrazilianStemmer	TokenNameIdentifier	 Brazilian Stemmer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
exclusions	TokenNameIdentifier	 exclusions
=	TokenNameEQUAL	
null	TokenNamenull	
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
/** * Creates a new BrazilianStemFilter * * @param in the source {@link TokenStream} */	TokenNameCOMMENT_JAVADOC	 Creates a new BrazilianStemFilter * @param in the source {@link TokenStream} 
public	TokenNamepublic	
BrazilianStemFilter	TokenNameIdentifier	 Brazilian Stem Filter
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
/** * Creates a new BrazilianStemFilter * * @param in the source {@link TokenStream} * @param exclusiontable a set of terms that should be prevented from being stemmed. * @deprecated use {@link KeywordAttribute} with {@link KeywordMarkerFilter} instead. */	TokenNameCOMMENT_JAVADOC	 Creates a new BrazilianStemFilter * @param in the source {@link TokenStream} @param exclusiontable a set of terms that should be prevented from being stemmed. @deprecated use {@link KeywordAttribute} with {@link KeywordMarkerFilter} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
BrazilianStemFilter	TokenNameIdentifier	 Brazilian Stem Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
exclusiontable	TokenNameIdentifier	 exclusiontable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exclusions	TokenNameIdentifier	 exclusions
=	TokenNameEQUAL	
exclusiontable	TokenNameIdentifier	 exclusiontable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check the exclusion table. 	TokenNameCOMMENT_LINE	Check the exclusion table. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
keywordAttr	TokenNameIdentifier	 keyword Attr
.	TokenNameDOT	
isKeyword	TokenNameIdentifier	 is Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
exclusions	TokenNameIdentifier	 exclusions
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
exclusions	TokenNameIdentifier	 exclusions
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If not stemmed, don't waste the time adjusting the token. 	TokenNameCOMMENT_LINE	If not stemmed, don't waste the time adjusting the token. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	