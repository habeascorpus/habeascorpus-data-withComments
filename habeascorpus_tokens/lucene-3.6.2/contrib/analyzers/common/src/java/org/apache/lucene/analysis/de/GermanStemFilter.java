package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
de	TokenNameIdentifier	 de
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
/** * A {@link TokenFilter} that stems German words. * <p> * It supports a table of words that should * not be stemmed at all. The stemmer used can be changed at runtime after the * filter object is created (as long as it is a {@link GermanStemmer}). * </p> * <p> * To prevent terms from being stemmed use an instance of * {@link KeywordMarkerFilter} or a custom {@link TokenFilter} that sets * the {@link KeywordAttribute} before this {@link TokenStream}. * </p> * @see KeywordMarkerFilter */	TokenNameCOMMENT_JAVADOC	 A {@link TokenFilter} that stems German words. <p> It supports a table of words that should not be stemmed at all. The stemmer used can be changed at runtime after the filter object is created (as long as it is a {@link GermanStemmer}). </p> <p> To prevent terms from being stemmed use an instance of {@link KeywordMarkerFilter} or a custom {@link TokenFilter} that sets the {@link KeywordAttribute} before this {@link TokenStream}. </p> @see KeywordMarkerFilter 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
GermanStemFilter	TokenNameIdentifier	 German Stem Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
/** * The actual token in the input stream. */	TokenNameCOMMENT_JAVADOC	 The actual token in the input stream. 
private	TokenNameprivate	
GermanStemmer	TokenNameIdentifier	 German Stemmer
stemmer	TokenNameIdentifier	 stemmer
=	TokenNameEQUAL	
new	TokenNamenew	
GermanStemmer	TokenNameIdentifier	 German Stemmer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
exclusionSet	TokenNameIdentifier	 exclusion Set
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
/** * Creates a {@link GermanStemFilter} instance * @param in the source {@link TokenStream} */	TokenNameCOMMENT_JAVADOC	 Creates a {@link GermanStemFilter} instance @param in the source {@link TokenStream} 
public	TokenNamepublic	
GermanStemFilter	TokenNameIdentifier	 German Stem Filter
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
/** * Builds a GermanStemFilter that uses an exclusion table. * @deprecated use {@link KeywordAttribute} with {@link KeywordMarkerFilter} instead. */	TokenNameCOMMENT_JAVADOC	 Builds a GermanStemFilter that uses an exclusion table. @deprecated use {@link KeywordAttribute} with {@link KeywordMarkerFilter} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
GermanStemFilter	TokenNameIdentifier	 German Stem Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
exclusionSet	TokenNameIdentifier	 exclusion Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exclusionSet	TokenNameIdentifier	 exclusion Set
=	TokenNameEQUAL	
exclusionSet	TokenNameIdentifier	 exclusion Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns true for next token in the stream, or false at EOS */	TokenNameCOMMENT_JAVADOC	 @return Returns true for next token in the stream, or false at EOS 
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
exclusionSet	TokenNameIdentifier	 exclusion Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
exclusionSet	TokenNameIdentifier	 exclusion Set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
/** * Set a alternative/custom {@link GermanStemmer} for this filter. */	TokenNameCOMMENT_JAVADOC	 Set a alternative/custom {@link GermanStemmer} for this filter. 
public	TokenNamepublic	
void	TokenNamevoid	
setStemmer	TokenNameIdentifier	 set Stemmer
(	TokenNameLPAREN	
GermanStemmer	TokenNameIdentifier	 German Stemmer
stemmer	TokenNameIdentifier	 stemmer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stemmer	TokenNameIdentifier	 stemmer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
stemmer	TokenNameIdentifier	 stemmer
=	TokenNameEQUAL	
stemmer	TokenNameIdentifier	 stemmer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set an alternative exclusion list for this filter. * @deprecated use {@link KeywordAttribute} with {@link KeywordMarkerFilter} instead. */	TokenNameCOMMENT_JAVADOC	 Set an alternative exclusion list for this filter. @deprecated use {@link KeywordAttribute} with {@link KeywordMarkerFilter} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
setExclusionSet	TokenNameIdentifier	 set Exclusion Set
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
exclusionSet	TokenNameIdentifier	 exclusion Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
exclusionSet	TokenNameIdentifier	 exclusion Set
=	TokenNameEQUAL	
exclusionSet	TokenNameIdentifier	 exclusion Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
