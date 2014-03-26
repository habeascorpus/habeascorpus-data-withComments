package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
dict	TokenNameIdentifier	 dict
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
;	TokenNameSEMICOLON	
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
InputStreamDataInput	TokenNameIdentifier	 Input Stream Data Input
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
CodecUtil	TokenNameIdentifier	 Codec Util
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
IOUtils	TokenNameIdentifier	 IO Utils
;	TokenNameSEMICOLON	
/** * Character category data. */	TokenNameCOMMENT_JAVADOC	 Character category data. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CharacterDefinition	TokenNameIdentifier	 Character Definition
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILENAME_SUFFIX	TokenNameIdentifier	 FILENAME  SUFFIX
=	TokenNameEQUAL	
".dat"	TokenNameStringLiteral	.dat
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HEADER	TokenNameIdentifier	 HEADER
=	TokenNameEQUAL	
"kuromoji_cd"	TokenNameStringLiteral	kuromoji_cd
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERSION	TokenNameIdentifier	 VERSION
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLASS_COUNT	TokenNameIdentifier	 CLASS  COUNT
=	TokenNameEQUAL	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// only used internally for lookup: 	TokenNameCOMMENT_LINE	only used internally for lookup: 
private	TokenNameprivate	
static	TokenNamestatic	
enum	TokenNameenum	
CharacterClass	TokenNameIdentifier	 Character Class
{	TokenNameLBRACE	
NGRAM	TokenNameIdentifier	 NGRAM
,	TokenNameCOMMA	
DEFAULT	TokenNameIdentifier	 DEFAULT
,	TokenNameCOMMA	
SPACE	TokenNameIdentifier	 SPACE
,	TokenNameCOMMA	
SYMBOL	TokenNameIdentifier	 SYMBOL
,	TokenNameCOMMA	
NUMERIC	TokenNameIdentifier	 NUMERIC
,	TokenNameCOMMA	
ALPHA	TokenNameIdentifier	 ALPHA
,	TokenNameCOMMA	
CYRILLIC	TokenNameIdentifier	 CYRILLIC
,	TokenNameCOMMA	
GREEK	TokenNameIdentifier	 GREEK
,	TokenNameCOMMA	
HIRAGANA	TokenNameIdentifier	 HIRAGANA
,	TokenNameCOMMA	
KATAKANA	TokenNameIdentifier	 KATAKANA
,	TokenNameCOMMA	
KANJI	TokenNameIdentifier	 KANJI
,	TokenNameCOMMA	
KANJINUMERIC	TokenNameIdentifier	 KANJINUMERIC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
characterCategoryMap	TokenNameIdentifier	 character Category Map
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0x10000	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
invokeMap	TokenNameIdentifier	 invoke Map
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
CLASS_COUNT	TokenNameIdentifier	 CLASS  COUNT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
groupMap	TokenNameIdentifier	 group Map
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
CLASS_COUNT	TokenNameIdentifier	 CLASS  COUNT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// the classes: 	TokenNameCOMMENT_LINE	the classes: 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
NGRAM	TokenNameIdentifier	 NGRAM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
NGRAM	TokenNameIdentifier	 NGRAM
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
DEFAULT	TokenNameIdentifier	 DEFAULT
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
SPACE	TokenNameIdentifier	 SPACE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
SPACE	TokenNameIdentifier	 SPACE
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
SYMBOL	TokenNameIdentifier	 SYMBOL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
SYMBOL	TokenNameIdentifier	 SYMBOL
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
NUMERIC	TokenNameIdentifier	 NUMERIC
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
NUMERIC	TokenNameIdentifier	 NUMERIC
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
ALPHA	TokenNameIdentifier	 ALPHA
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
ALPHA	TokenNameIdentifier	 ALPHA
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CYRILLIC	TokenNameIdentifier	 CYRILLIC
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
CYRILLIC	TokenNameIdentifier	 CYRILLIC
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
GREEK	TokenNameIdentifier	 GREEK
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
GREEK	TokenNameIdentifier	 GREEK
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
HIRAGANA	TokenNameIdentifier	 HIRAGANA
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
HIRAGANA	TokenNameIdentifier	 HIRAGANA
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
KATAKANA	TokenNameIdentifier	 KATAKANA
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
KATAKANA	TokenNameIdentifier	 KATAKANA
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
KANJI	TokenNameIdentifier	 KANJI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
KANJI	TokenNameIdentifier	 KANJI
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
KANJINUMERIC	TokenNameIdentifier	 KANJINUMERIC
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
KANJINUMERIC	TokenNameIdentifier	 KANJINUMERIC
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharacterDefinition	TokenNameIdentifier	 Character Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IOException	TokenNameIdentifier	 IO Exception
priorE	TokenNameIdentifier	 prior E
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
getClassResource	TokenNameIdentifier	 get Class Resource
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FILENAME_SUFFIX	TokenNameIdentifier	 FILENAME  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamDataInput	TokenNameIdentifier	 Input Stream Data Input
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CodecUtil	TokenNameIdentifier	 Codec Util
.	TokenNameDOT	
checkHeader	TokenNameIdentifier	 check Header
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
HEADER	TokenNameIdentifier	 HEADER
,	TokenNameCOMMA	
VERSION	TokenNameIdentifier	 VERSION
,	TokenNameCOMMA	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
characterCategoryMap	TokenNameIdentifier	 character Category Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
characterCategoryMap	TokenNameIdentifier	 character Category Map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
CLASS_COUNT	TokenNameIdentifier	 CLASS  COUNT
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invokeMap	TokenNameIdentifier	 invoke Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
groupMap	TokenNameIdentifier	 group Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x02	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
priorE	TokenNameIdentifier	 prior E
=	TokenNameEQUAL	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
priorE	TokenNameIdentifier	 prior E
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
getCharacterClass	TokenNameIdentifier	 get Character Class
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
characterCategoryMap	TokenNameIdentifier	 character Category Map
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isInvoke	TokenNameIdentifier	 is Invoke
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
invokeMap	TokenNameIdentifier	 invoke Map
[	TokenNameLBRACKET	
characterCategoryMap	TokenNameIdentifier	 character Category Map
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isGroup	TokenNameIdentifier	 is Group
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupMap	TokenNameIdentifier	 group Map
[	TokenNameLBRACKET	
characterCategoryMap	TokenNameIdentifier	 character Category Map
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isKanji	TokenNameIdentifier	 is Kanji
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
characterClass	TokenNameIdentifier	 character Class
=	TokenNameEQUAL	
characterCategoryMap	TokenNameIdentifier	 character Category Map
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
characterClass	TokenNameIdentifier	 character Class
==	TokenNameEQUAL_EQUAL	
KANJI	TokenNameIdentifier	 KANJI
||	TokenNameOR_OR	
characterClass	TokenNameIdentifier	 character Class
==	TokenNameEQUAL_EQUAL	
KANJINUMERIC	TokenNameIdentifier	 KANJINUMERIC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
lookupCharacterClass	TokenNameIdentifier	 lookup Character Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
characterClassName	TokenNameIdentifier	 character Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
CharacterClass	TokenNameIdentifier	 Character Class
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
characterClassName	TokenNameIdentifier	 character Class Name
)	TokenNameRPAREN	
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
CharacterDefinition	TokenNameIdentifier	 Character Definition
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SingletonHolder	TokenNameIdentifier	 Singleton Holder
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SingletonHolder	TokenNameIdentifier	 Singleton Holder
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
CharacterDefinition	TokenNameIdentifier	 Character Definition
INSTANCE	TokenNameIdentifier	 INSTANCE
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
CharacterDefinition	TokenNameIdentifier	 Character Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Cannot load CharacterDefinition."	TokenNameStringLiteral	Cannot load CharacterDefinition.
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
