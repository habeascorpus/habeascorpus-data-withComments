package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
nl	TokenNameIdentifier	 nl
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
snowball	TokenNameIdentifier	 snowball
.	TokenNameDOT	
SnowballFilter	TokenNameIdentifier	 Snowball Filter
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
/** * A {@link TokenFilter} that stems Dutch words. * <p> * It supports a table of words that should * not be stemmed at all. The stemmer used can be changed at runtime after the * filter object is created (as long as it is a {@link DutchStemmer}). * </p> * <p> * To prevent terms from being stemmed use an instance of * {@link KeywordMarkerFilter} or a custom {@link TokenFilter} that sets * the {@link KeywordAttribute} before this {@link TokenStream}. * </p> * @see KeywordMarkerFilter * @deprecated Use {@link SnowballFilter} with * {@link org.tartarus.snowball.ext.DutchStemmer} instead, which has the * same functionality. This filter will be removed in Lucene 5.0 */	TokenNameCOMMENT_JAVADOC	 A {@link TokenFilter} that stems Dutch words. <p> It supports a table of words that should not be stemmed at all. The stemmer used can be changed at runtime after the filter object is created (as long as it is a {@link DutchStemmer}). </p> <p> To prevent terms from being stemmed use an instance of {@link KeywordMarkerFilter} or a custom {@link TokenFilter} that sets the {@link KeywordAttribute} before this {@link TokenStream}. </p> @see KeywordMarkerFilter @deprecated Use {@link SnowballFilter} with {@link org.tartarus.snowball.ext.DutchStemmer} instead, which has the same functionality. This filter will be removed in Lucene 5.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
DutchStemFilter	TokenNameIdentifier	 Dutch Stem Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
/** * The actual token in the input stream. */	TokenNameCOMMENT_JAVADOC	 The actual token in the input stream. 
private	TokenNameprivate	
DutchStemmer	TokenNameIdentifier	 Dutch Stemmer
stemmer	TokenNameIdentifier	 stemmer
=	TokenNameEQUAL	
new	TokenNamenew	
DutchStemmer	TokenNameIdentifier	 Dutch Stemmer
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
public	TokenNamepublic	
DutchStemFilter	TokenNameIdentifier	 Dutch Stem Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
_in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
_in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a DutchStemFilter that uses an exclusion table. * @deprecated use {@link KeywordAttribute} with {@link KeywordMarkerFilter} instead. */	TokenNameCOMMENT_JAVADOC	 Builds a DutchStemFilter that uses an exclusion table. @deprecated use {@link KeywordAttribute} with {@link KeywordMarkerFilter} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
DutchStemFilter	TokenNameIdentifier	 Dutch Stem Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
_in	TokenNameIdentifier	 in
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
_in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exclusions	TokenNameIdentifier	 exclusions
=	TokenNameEQUAL	
exclusiontable	TokenNameIdentifier	 exclusiontable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param stemdictionary Dictionary of word stem pairs, that overrule the algorithm */	TokenNameCOMMENT_JAVADOC	 @param stemdictionary Dictionary of word stem pairs, that overrule the algorithm 
public	TokenNamepublic	
DutchStemFilter	TokenNameIdentifier	 Dutch Stem Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
_in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
?	TokenNameQUESTION	
,	TokenNameCOMMA	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stemdictionary	TokenNameIdentifier	 stemdictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
_in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
setStemDictionary	TokenNameIdentifier	 set Stem Dictionary
(	TokenNameLPAREN	
stemdictionary	TokenNameIdentifier	 stemdictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param stemdictionary Dictionary of word stem pairs, that overrule the algorithm * @deprecated use {@link KeywordAttribute} with {@link KeywordMarkerFilter} instead. */	TokenNameCOMMENT_JAVADOC	 @param stemdictionary Dictionary of word stem pairs, that overrule the algorithm @deprecated use {@link KeywordAttribute} with {@link KeywordMarkerFilter} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
DutchStemFilter	TokenNameIdentifier	 Dutch Stem Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
_in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
exclusiontable	TokenNameIdentifier	 exclusiontable
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
?	TokenNameQUESTION	
,	TokenNameCOMMA	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stemdictionary	TokenNameIdentifier	 stemdictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
_in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
exclusiontable	TokenNameIdentifier	 exclusiontable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
setStemDictionary	TokenNameIdentifier	 set Stem Dictionary
(	TokenNameLPAREN	
stemdictionary	TokenNameIdentifier	 stemdictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next token in the stream, or null at EOS */	TokenNameCOMMENT_JAVADOC	 Returns the next token in the stream, or null at EOS 
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
/** * Set a alternative/custom {@link DutchStemmer} for this filter. */	TokenNameCOMMENT_JAVADOC	 Set a alternative/custom {@link DutchStemmer} for this filter. 
public	TokenNamepublic	
void	TokenNamevoid	
setStemmer	TokenNameIdentifier	 set Stemmer
(	TokenNameLPAREN	
DutchStemmer	TokenNameIdentifier	 Dutch Stemmer
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
setExclusionTable	TokenNameIdentifier	 set Exclusion Table
(	TokenNameLPAREN	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
exclusiontable	TokenNameIdentifier	 exclusiontable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exclusions	TokenNameIdentifier	 exclusions
=	TokenNameEQUAL	
exclusiontable	TokenNameIdentifier	 exclusiontable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set dictionary for stemming, this dictionary overrules the algorithm, * so you can correct for a particular unwanted word-stem pair. */	TokenNameCOMMENT_JAVADOC	 Set dictionary for stemming, this dictionary overrules the algorithm, so you can correct for a particular unwanted word-stem pair. 
public	TokenNamepublic	
void	TokenNamevoid	
setStemDictionary	TokenNameIdentifier	 set Stem Dictionary
(	TokenNameLPAREN	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
?	TokenNameQUESTION	
,	TokenNameCOMMA	
?	TokenNameQUESTION	
>	TokenNameGREATER	
dict	TokenNameIdentifier	 dict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stemmer	TokenNameIdentifier	 stemmer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
setStemDictionary	TokenNameIdentifier	 set Stem Dictionary
(	TokenNameLPAREN	
dict	TokenNameIdentifier	 dict
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
