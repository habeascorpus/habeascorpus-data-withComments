package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
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
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Replaceable	TokenNameIdentifier	 Replaceable
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Transliterator	TokenNameIdentifier	 Transliterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
UTF16	TokenNameIdentifier	 UT F16
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
UnicodeSet	TokenNameIdentifier	 Unicode Set
;	TokenNameSEMICOLON	
/** * A {@link TokenFilter} that transforms text with ICU. * <p> * ICU provides text-transformation functionality via its Transliteration API. * Although script conversion is its most common use, a Transliterator can * actually perform a more general class of tasks. In fact, Transliterator * defines a very general API which specifies only that a segment of the input * text is replaced by new text. The particulars of this conversion are * determined entirely by subclasses of Transliterator. * </p> * <p> * Some useful transformations for search are built-in: * <ul> * <li>Conversion from Traditional to Simplified Chinese characters * <li>Conversion from Hiragana to Katakana * <li>Conversion from Fullwidth to Halfwidth forms. * <li>Script conversions, for example Serbian Cyrillic to Latin * </ul> * </p> * <p> * Example usage: <blockquote>stream = new ICUTransformFilter(stream, * Transliterator.getInstance("Traditional-Simplified"));</blockquote> * </p> * For more details, see the <a * href="http://userguide.icu-project.org/transforms/general">ICU User * Guide</a>. */	TokenNameCOMMENT_JAVADOC	 A {@link TokenFilter} that transforms text with ICU. <p> ICU provides text-transformation functionality via its Transliteration API. Although script conversion is its most common use, a Transliterator can actually perform a more general class of tasks. In fact, Transliterator defines a very general API which specifies only that a segment of the input text is replaced by new text. The particulars of this conversion are determined entirely by subclasses of Transliterator. </p> <p> Some useful transformations for search are built-in: <ul> <li>Conversion from Traditional to Simplified Chinese characters <li>Conversion from Hiragana to Katakana <li>Conversion from Fullwidth to Halfwidth forms. <li>Script conversions, for example Serbian Cyrillic to Latin </ul> </p> <p> Example usage: <blockquote>stream = new ICUTransformFilter(stream, Transliterator.getInstance("Traditional-Simplified"));</blockquote> </p> For more details, see the <a href="http://userguide.icu-project.org/transforms/general">ICU User Guide</a>. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ICUTransformFilter	TokenNameIdentifier	 ICU Transform Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
// Transliterator to transform the text 	TokenNameCOMMENT_LINE	Transliterator to transform the text 
private	TokenNameprivate	
final	TokenNamefinal	
Transliterator	TokenNameIdentifier	 Transliterator
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
// Reusable position object 	TokenNameCOMMENT_LINE	Reusable position object 
private	TokenNameprivate	
final	TokenNamefinal	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
Position	TokenNameIdentifier	 Position
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
new	TokenNamenew	
Transliterator	TokenNameIdentifier	 Transliterator
.	TokenNameDOT	
Position	TokenNameIdentifier	 Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// term attribute, will be updated with transformed text. 	TokenNameCOMMENT_LINE	term attribute, will be updated with transformed text. 
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
// Wraps a termAttribute around the replaceable interface. 	TokenNameCOMMENT_LINE	Wraps a termAttribute around the replaceable interface. 
private	TokenNameprivate	
final	TokenNamefinal	
ReplaceableTermAttribute	TokenNameIdentifier	 Replaceable Term Attribute
replaceableAttribute	TokenNameIdentifier	 replaceable Attribute
=	TokenNameEQUAL	
new	TokenNamenew	
ReplaceableTermAttribute	TokenNameIdentifier	 Replaceable Term Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new ICUTransformFilter that transforms text on the given stream. * * @param input {@link TokenStream} to filter. * @param transform Transliterator to transform the text. */	TokenNameCOMMENT_JAVADOC	 Create a new ICUTransformFilter that transforms text on the given stream. * @param input {@link TokenStream} to filter. @param transform Transliterator to transform the text. 
public	TokenNamepublic	
ICUTransformFilter	TokenNameIdentifier	 ICU Transform Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Transliterator	TokenNameIdentifier	 Transliterator
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
/* * This is cheating, but speeds things up a lot. * If we wanted to use pkg-private APIs we could probably do better. */	TokenNameCOMMENT_BLOCK	 This is cheating, but speeds things up a lot. If we wanted to use pkg-private APIs we could probably do better. 
if	TokenNameif	
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
transform	TokenNameIdentifier	 transform
instanceof	TokenNameinstanceof	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
RuleBasedTransliterator	TokenNameIdentifier	 Rule Based Transliterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
UnicodeSet	TokenNameIdentifier	 Unicode Set
sourceSet	TokenNameIdentifier	 source Set
=	TokenNameEQUAL	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
getSourceSet	TokenNameIdentifier	 get Source Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sourceSet	TokenNameIdentifier	 source Set
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
sourceSet	TokenNameIdentifier	 source Set
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
setFilter	TokenNameIdentifier	 set Filter
(	TokenNameLPAREN	
sourceSet	TokenNameIdentifier	 source Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/* * Wrap around replaceable. clear the positions, and transliterate. */	TokenNameCOMMENT_BLOCK	 Wrap around replaceable. clear the positions, and transliterate. 
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
replaceableAttribute	TokenNameIdentifier	 replaceable Attribute
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
contextStart	TokenNameIdentifier	 context Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
contextLimit	TokenNameIdentifier	 context Limit
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
filteredTransliterate	TokenNameIdentifier	 filtered Transliterate
(	TokenNameLPAREN	
replaceableAttribute	TokenNameIdentifier	 replaceable Attribute
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
/** * Wrap a {@link CharTermAttribute} with the Replaceable API. */	TokenNameCOMMENT_JAVADOC	 Wrap a {@link CharTermAttribute} with the Replaceable API. 
final	TokenNamefinal	
class	TokenNameclass	
ReplaceableTermAttribute	TokenNameIdentifier	 Replaceable Term Attribute
implements	TokenNameimplements	
Replaceable	TokenNameIdentifier	 Replaceable
{	TokenNameLBRACE	
private	TokenNameprivate	
char	TokenNamechar	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
char32At	TokenNameIdentifier	 char32 At
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
UTF16	TokenNameIdentifier	 UT F16
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
char	TokenNamechar	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
int	TokenNameint	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
int	TokenNameint	
srcStart	TokenNameIdentifier	 src Start
,	TokenNameCOMMA	
int	TokenNameint	
srcLimit	TokenNameIdentifier	 src Limit
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dst	TokenNameIdentifier	 dst
,	TokenNameCOMMA	
int	TokenNameint	
dstStart	TokenNameIdentifier	 dst Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
srcStart	TokenNameIdentifier	 src Start
,	TokenNameCOMMA	
dst	TokenNameIdentifier	 dst
,	TokenNameCOMMA	
dstStart	TokenNameIdentifier	 dst Start
,	TokenNameCOMMA	
srcLimit	TokenNameIdentifier	 src Limit
-	TokenNameMINUS	
srcStart	TokenNameIdentifier	 src Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMetaData	TokenNameIdentifier	 has Meta Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
charsLen	TokenNameIdentifier	 chars Len
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newLength	TokenNameIdentifier	 new Length
=	TokenNameEQUAL	
shiftForReplace	TokenNameIdentifier	 shift For Replace
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
charsLen	TokenNameIdentifier	 chars Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// insert the replacement text 	TokenNameCOMMENT_LINE	insert the replacement text 
text	TokenNameIdentifier	 text
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
charsLen	TokenNameIdentifier	 chars Len
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
charsStart	TokenNameIdentifier	 chars Start
,	TokenNameCOMMA	
int	TokenNameint	
charsLen	TokenNameIdentifier	 chars Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// shift text if necessary for the replacement 	TokenNameCOMMENT_LINE	shift text if necessary for the replacement 
final	TokenNamefinal	
int	TokenNameint	
newLength	TokenNameIdentifier	 new Length
=	TokenNameEQUAL	
shiftForReplace	TokenNameIdentifier	 shift For Replace
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
charsLen	TokenNameIdentifier	 chars Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// insert the replacement text 	TokenNameCOMMENT_LINE	insert the replacement text 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
charsStart	TokenNameIdentifier	 chars Start
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
charsLen	TokenNameIdentifier	 chars Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** shift text (if necessary) for a replacement operation */	TokenNameCOMMENT_JAVADOC	 shift text (if necessary) for a replacement operation 
private	TokenNameprivate	
int	TokenNameint	
shiftForReplace	TokenNameIdentifier	 shift For Replace
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
int	TokenNameint	
charsLen	TokenNameIdentifier	 chars Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
replacementLength	TokenNameIdentifier	 replacement Length
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newLength	TokenNameIdentifier	 new Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
replacementLength	TokenNameIdentifier	 replacement Length
+	TokenNamePLUS	
charsLen	TokenNameIdentifier	 chars Len
;	TokenNameSEMICOLON	
// resize if necessary 	TokenNameCOMMENT_LINE	resize if necessary 
if	TokenNameif	
(	TokenNameLPAREN	
newLength	TokenNameIdentifier	 new Length
>	TokenNameGREATER	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if the substring being replaced is longer or shorter than the 	TokenNameCOMMENT_LINE	if the substring being replaced is longer or shorter than the 
// replacement, need to shift things around 	TokenNameCOMMENT_LINE	replacement, need to shift things around 
if	TokenNameif	
(	TokenNameLPAREN	
replacementLength	TokenNameIdentifier	 replacement Length
!=	TokenNameNOT_EQUAL	
charsLen	TokenNameIdentifier	 chars Len
&&	TokenNameAND_AND	
limit	TokenNameIdentifier	 limit
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
charsLen	TokenNameIdentifier	 chars Len
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newLength	TokenNameIdentifier	 new Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
