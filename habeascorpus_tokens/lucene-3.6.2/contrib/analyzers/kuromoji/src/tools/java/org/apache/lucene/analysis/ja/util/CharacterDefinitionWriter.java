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
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
dict	TokenNameIdentifier	 dict
.	TokenNameDOT	
CharacterDefinition	TokenNameIdentifier	 Character Definition
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
DataOutput	TokenNameIdentifier	 Data Output
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
OutputStreamDataOutput	TokenNameIdentifier	 Output Stream Data Output
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
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CharacterDefinitionWriter	TokenNameIdentifier	 Character Definition Writer
{	TokenNameLBRACE	
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
CharacterDefinition	TokenNameIdentifier	 Character Definition
.	TokenNameDOT	
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
CharacterDefinition	TokenNameIdentifier	 Character Definition
.	TokenNameDOT	
CLASS_COUNT	TokenNameIdentifier	 CLASS  COUNT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Constructor for building. TODO: remove write access */	TokenNameCOMMENT_JAVADOC	 Constructor for building. TODO: remove write access 
public	TokenNamepublic	
CharacterDefinitionWriter	TokenNameIdentifier	 Character Definition Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
characterCategoryMap	TokenNameIdentifier	 character Category Map
,	TokenNameCOMMA	
CharacterDefinition	TokenNameIdentifier	 Character Definition
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Put mapping from unicode code point to character class. * * @param codePoint * code point * @param characterClassName character class name */	TokenNameCOMMENT_JAVADOC	 Put mapping from unicode code point to character class. * @param codePoint code point @param characterClassName character class name 
public	TokenNamepublic	
void	TokenNamevoid	
putCharacterCategory	TokenNameIdentifier	 put Character Category
(	TokenNameLPAREN	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
characterClassName	TokenNameIdentifier	 character Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
characterClassName	TokenNameIdentifier	 character Class Name
=	TokenNameEQUAL	
characterClassName	TokenNameIdentifier	 character Class Name
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// use first 	TokenNameCOMMENT_LINE	use first 
// category 	TokenNameCOMMENT_LINE	category 
// class 	TokenNameCOMMENT_LINE	class 
// Override Nakaguro 	TokenNameCOMMENT_LINE	Override Nakaguro 
if	TokenNameif	
(	TokenNameLPAREN	
codePoint	TokenNameIdentifier	 code Point
==	TokenNameEQUAL_EQUAL	
0x30FB	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
characterClassName	TokenNameIdentifier	 character Class Name
=	TokenNameEQUAL	
"SYMBOL"	TokenNameStringLiteral	SYMBOL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
characterCategoryMap	TokenNameIdentifier	 character Category Map
[	TokenNameLBRACKET	
codePoint	TokenNameIdentifier	 code Point
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
CharacterDefinition	TokenNameIdentifier	 Character Definition
.	TokenNameDOT	
lookupCharacterClass	TokenNameIdentifier	 lookup Character Class
(	TokenNameLPAREN	
characterClassName	TokenNameIdentifier	 character Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
putInvokeDefinition	TokenNameIdentifier	 put Invoke Definition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
characterClassName	TokenNameIdentifier	 character Class Name
,	TokenNameCOMMA	
int	TokenNameint	
invoke	TokenNameIdentifier	 invoke
,	TokenNameCOMMA	
int	TokenNameint	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
characterClass	TokenNameIdentifier	 character Class
=	TokenNameEQUAL	
CharacterDefinition	TokenNameIdentifier	 Character Definition
.	TokenNameDOT	
lookupCharacterClass	TokenNameIdentifier	 lookup Character Class
(	TokenNameLPAREN	
characterClassName	TokenNameIdentifier	 character Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invokeMap	TokenNameIdentifier	 invoke Map
[	TokenNameLBRACKET	
characterClass	TokenNameIdentifier	 character Class
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
invoke	TokenNameIdentifier	 invoke
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
groupMap	TokenNameIdentifier	 group Map
[	TokenNameLBRACKET	
characterClass	TokenNameIdentifier	 character Class
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// TODO: length def ignored 	TokenNameCOMMENT_LINE	TODO: length def ignored 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseDir	TokenNameIdentifier	 base Dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
baseDir	TokenNameIdentifier	 base Dir
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
CharacterDefinition	TokenNameIdentifier	 Character Definition
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
+	TokenNamePLUS	
CharacterDefinition	TokenNameIdentifier	 Character Definition
.	TokenNameDOT	
FILENAME_SUFFIX	TokenNameIdentifier	 FILENAME  SUFFIX
;	TokenNameSEMICOLON	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
OutputStreamDataOutput	TokenNameIdentifier	 Output Stream Data Output
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CodecUtil	TokenNameIdentifier	 Codec Util
.	TokenNameDOT	
writeHeader	TokenNameIdentifier	 write Header
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
CharacterDefinition	TokenNameIdentifier	 Character Definition
.	TokenNameDOT	
HEADER	TokenNameIdentifier	 HEADER
,	TokenNameCOMMA	
CharacterDefinition	TokenNameIdentifier	 Character Definition
.	TokenNameDOT	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
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
CharacterDefinition	TokenNameIdentifier	 Character Definition
.	TokenNameDOT	
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
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
invokeMap	TokenNameIdentifier	 invoke Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
?	TokenNameQUESTION	
0x01	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0x00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
groupMap	TokenNameIdentifier	 group Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
?	TokenNameQUESTION	
0x02	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0x00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
