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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
Channels	TokenNameIdentifier	 Channels
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
WritableByteChannel	TokenNameIdentifier	 Writable Byte Channel
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
ArrayUtil	TokenNameIdentifier	 Array Util
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
dict	TokenNameIdentifier	 dict
.	TokenNameDOT	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BinaryDictionaryWriter	TokenNameIdentifier	 Binary Dictionary Writer
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
>	TokenNameGREATER	
implClazz	TokenNameIdentifier	 impl Clazz
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
targetMapEndOffset	TokenNameIdentifier	 target Map End Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastWordId	TokenNameIdentifier	 last Word Id
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastSourceId	TokenNameIdentifier	 last Source Id
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targetMap	TokenNameIdentifier	 target Map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
8192	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
8192	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
posDict	TokenNameIdentifier	 pos Dict
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BinaryDictionaryWriter	TokenNameIdentifier	 Binary Dictionary Writer
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
>	TokenNameGREATER	
implClazz	TokenNameIdentifier	 impl Clazz
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
implClazz	TokenNameIdentifier	 impl Clazz
=	TokenNameEQUAL	
implClazz	TokenNameIdentifier	 impl Clazz
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * put the entry in map * @return current position of buffer, which will be wordId of next entry */	TokenNameCOMMENT_JAVADOC	 put the entry in map @return current position of buffer, which will be wordId of next entry 
public	TokenNamepublic	
int	TokenNameint	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
leftId	TokenNameIdentifier	 left Id
=	TokenNameEQUAL	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
parseShort	TokenNameIdentifier	 parse Short
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
rightId	TokenNameIdentifier	 right Id
=	TokenNameEQUAL	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
parseShort	TokenNameIdentifier	 parse Short
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
wordCost	TokenNameIdentifier	 word Cost
=	TokenNameEQUAL	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
parseShort	TokenNameIdentifier	 parse Short
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// build up the POS string 	TokenNameCOMMENT_LINE	build up the POS string 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"*"	TokenNameStringLiteral	*
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
posData	TokenNameIdentifier	 pos Data
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CSVUtil	TokenNameIdentifier	 CSV Util
.	TokenNameDOT	
quoteEscape	TokenNameIdentifier	 quote Escape
(	TokenNameLPAREN	
posData	TokenNameIdentifier	 pos Data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"*"	TokenNameStringLiteral	*
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CSVUtil	TokenNameIdentifier	 CSV Util
.	TokenNameDOT	
quoteEscape	TokenNameIdentifier	 quote Escape
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"*"	TokenNameStringLiteral	*
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
9	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CSVUtil	TokenNameIdentifier	 CSV Util
.	TokenNameDOT	
quoteEscape	TokenNameIdentifier	 quote Escape
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
9	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
fullPOSData	TokenNameIdentifier	 full POS Data
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
baseForm	TokenNameIdentifier	 base Form
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
reading	TokenNameIdentifier	 reading
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
11	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pronunciation	TokenNameIdentifier	 pronunciation
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
12	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// extend buffer if necessary 	TokenNameCOMMENT_LINE	extend buffer if necessary 
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// worst case: two short, 3 bytes, and features (all as utf-16) 	TokenNameCOMMENT_LINE	worst case: two short, 3 bytes, and features (all as utf-16) 
int	TokenNameint	
worstCase	TokenNameIdentifier	 worst Case
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
baseForm	TokenNameIdentifier	 base Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
reading	TokenNameIdentifier	 reading
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
pronunciation	TokenNameIdentifier	 pronunciation
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
worstCase	TokenNameIdentifier	 worst Case
>	TokenNameGREATER	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
newBuffer	TokenNameIdentifier	 new Buffer
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
worstCase	TokenNameIdentifier	 worst Case
-	TokenNameMINUS	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newBuffer	TokenNameIdentifier	 new Buffer
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
newBuffer	TokenNameIdentifier	 new Buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
baseForm	TokenNameIdentifier	 base Form
)	TokenNameRPAREN	
||	TokenNameOR_OR	
baseForm	TokenNameIdentifier	 base Form
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
HAS_BASEFORM	TokenNameIdentifier	 HAS  BASEFORM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
reading	TokenNameIdentifier	 reading
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
toKatakana	TokenNameIdentifier	 to Katakana
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
HAS_READING	TokenNameIdentifier	 HAS  READING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
pronunciation	TokenNameIdentifier	 pronunciation
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
reading	TokenNameIdentifier	 reading
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
|=	TokenNameOR_EQUAL	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
HAS_PRONUNCIATION	TokenNameIdentifier	 HAS  PRONUNCIATION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
leftId	TokenNameIdentifier	 left Id
==	TokenNameEQUAL_EQUAL	
rightId	TokenNameIdentifier	 right Id
;	TokenNameSEMICOLON	
assert	TokenNameassert	
leftId	TokenNameIdentifier	 left Id
<	TokenNameLESS	
4096	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// there are still unused bits 	TokenNameCOMMENT_LINE	there are still unused bits 
// add pos mapping 	TokenNameCOMMENT_LINE	add pos mapping 
int	TokenNameint	
toFill	TokenNameIdentifier	 to Fill
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
leftId	TokenNameIdentifier	 left Id
-	TokenNameMINUS	
posDict	TokenNameIdentifier	 pos Dict
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
toFill	TokenNameIdentifier	 to Fill
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posDict	TokenNameIdentifier	 pos Dict
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
existing	TokenNameIdentifier	 existing
=	TokenNameEQUAL	
posDict	TokenNameIdentifier	 pos Dict
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
leftId	TokenNameIdentifier	 left Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
existing	TokenNameIdentifier	 existing
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fullPOSData	TokenNameIdentifier	 full POS Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posDict	TokenNameIdentifier	 pos Dict
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
leftId	TokenNameIdentifier	 left Id
,	TokenNameCOMMA	
fullPOSData	TokenNameIdentifier	 full POS Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
putShort	TokenNameIdentifier	 put Short
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
leftId	TokenNameIdentifier	 left Id
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
|	TokenNameOR	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
putShort	TokenNameIdentifier	 put Short
(	TokenNameLPAREN	
wordCost	TokenNameIdentifier	 word Cost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
HAS_BASEFORM	TokenNameIdentifier	 HAS  BASEFORM
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
baseForm	TokenNameIdentifier	 base Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
shared	TokenNameIdentifier	 shared
=	TokenNameEQUAL	
sharedPrefix	TokenNameIdentifier	 shared Prefix
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
baseForm	TokenNameIdentifier	 base Form
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
baseForm	TokenNameIdentifier	 base Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
shared	TokenNameIdentifier	 shared
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
shared	TokenNameIdentifier	 shared
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
|	TokenNameOR	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
shared	TokenNameIdentifier	 shared
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
baseForm	TokenNameIdentifier	 base Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
putChar	TokenNameIdentifier	 put Char
(	TokenNameLPAREN	
baseForm	TokenNameIdentifier	 base Form
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
HAS_READING	TokenNameIdentifier	 HAS  READING
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isKatakana	TokenNameIdentifier	 is Katakana
(	TokenNameLPAREN	
reading	TokenNameIdentifier	 reading
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
reading	TokenNameIdentifier	 reading
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeKatakana	TokenNameIdentifier	 write Katakana
(	TokenNameLPAREN	
reading	TokenNameIdentifier	 reading
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
reading	TokenNameIdentifier	 reading
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
reading	TokenNameIdentifier	 reading
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
putChar	TokenNameIdentifier	 put Char
(	TokenNameLPAREN	
reading	TokenNameIdentifier	 reading
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
HAS_PRONUNCIATION	TokenNameIdentifier	 HAS  PRONUNCIATION
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we can save 150KB here, but it makes the reader a little complicated. 	TokenNameCOMMENT_LINE	we can save 150KB here, but it makes the reader a little complicated. 
// int shared = sharedPrefix(reading, pronunciation); 	TokenNameCOMMENT_LINE	int shared = sharedPrefix(reading, pronunciation); 
// buffer.put((byte) shared); 	TokenNameCOMMENT_LINE	buffer.put((byte) shared); 
// pronunciation = pronunciation.substring(shared); 	TokenNameCOMMENT_LINE	pronunciation = pronunciation.substring(shared); 
if	TokenNameif	
(	TokenNameLPAREN	
isKatakana	TokenNameIdentifier	 is Katakana
(	TokenNameLPAREN	
pronunciation	TokenNameIdentifier	 pronunciation
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pronunciation	TokenNameIdentifier	 pronunciation
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeKatakana	TokenNameIdentifier	 write Katakana
(	TokenNameLPAREN	
pronunciation	TokenNameIdentifier	 pronunciation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
pronunciation	TokenNameIdentifier	 pronunciation
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
pronunciation	TokenNameIdentifier	 pronunciation
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
putChar	TokenNameIdentifier	 put Char
(	TokenNameLPAREN	
pronunciation	TokenNameIdentifier	 pronunciation
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isKatakana	TokenNameIdentifier	 is Katakana
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0x30A0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
0x30FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
writeKatakana	TokenNameIdentifier	 write Katakana
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
-	TokenNameMINUS	
0x30A0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toKatakana	TokenNameIdentifier	 to Katakana
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
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
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
0x3040	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0x3097	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
+	TokenNamePLUS	
0x60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
sharedPrefix	TokenNameIdentifier	 shared Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addMapping	TokenNameIdentifier	 add Mapping
(	TokenNameLPAREN	
int	TokenNameint	
sourceId	TokenNameIdentifier	 source Id
,	TokenNameCOMMA	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
wordId	TokenNameIdentifier	 word Id
>	TokenNameGREATER	
lastWordId	TokenNameIdentifier	 last Word Id
:	TokenNameCOLON	
"words out of order: "	TokenNameStringLiteral	words out of order: 
+	TokenNamePLUS	
wordId	TokenNameIdentifier	 word Id
+	TokenNamePLUS	
" vs lastID: "	TokenNameStringLiteral	 vs lastID: 
+	TokenNamePLUS	
lastWordId	TokenNameIdentifier	 last Word Id
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sourceId	TokenNameIdentifier	 source Id
>	TokenNameGREATER	
lastSourceId	TokenNameIdentifier	 last Source Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
sourceId	TokenNameIdentifier	 source Id
>	TokenNameGREATER	
lastSourceId	TokenNameIdentifier	 last Source Id
:	TokenNameCOLON	
"source ids out of order: lastSourceId="	TokenNameStringLiteral	source ids out of order: lastSourceId=
+	TokenNamePLUS	
lastSourceId	TokenNameIdentifier	 last Source Id
+	TokenNamePLUS	
" vs sourceId="	TokenNameStringLiteral	 vs sourceId=
+	TokenNamePLUS	
sourceId	TokenNameIdentifier	 source Id
;	TokenNameSEMICOLON	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
,	TokenNameCOMMA	
sourceId	TokenNameIdentifier	 source Id
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lastSourceId	TokenNameIdentifier	 last Source Id
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
sourceId	TokenNameIdentifier	 source Id
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
targetMapEndOffset	TokenNameIdentifier	 target Map End Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
sourceId	TokenNameIdentifier	 source Id
==	TokenNameEQUAL_EQUAL	
lastSourceId	TokenNameIdentifier	 last Source Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
targetMap	TokenNameIdentifier	 target Map
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
targetMap	TokenNameIdentifier	 target Map
,	TokenNameCOMMA	
targetMapEndOffset	TokenNameIdentifier	 target Map End Offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetMap	TokenNameIdentifier	 target Map
[	TokenNameLBRACKET	
targetMapEndOffset	TokenNameIdentifier	 target Map End Offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
wordId	TokenNameIdentifier	 word Id
;	TokenNameSEMICOLON	
targetMapEndOffset	TokenNameIdentifier	 target Map End Offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
lastSourceId	TokenNameIdentifier	 last Source Id
=	TokenNameEQUAL	
sourceId	TokenNameIdentifier	 source Id
;	TokenNameSEMICOLON	
lastWordId	TokenNameIdentifier	 last Word Id
=	TokenNameEQUAL	
wordId	TokenNameIdentifier	 word Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getBaseFileName	TokenNameIdentifier	 get Base File Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseDir	TokenNameIdentifier	 base Dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
baseDir	TokenNameIdentifier	 base Dir
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
implClazz	TokenNameIdentifier	 impl Clazz
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write dictionary in file * Dictionary format is: * [Size of dictionary(int)], [entry:{left id(short)}{right id(short)}{word cost(short)}{length of pos info(short)}{pos info(char)}], [entry...], [entry...]..... * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Write dictionary in file Dictionary format is: [Size of dictionary(int)], [entry:{left id(short)}{right id(short)}{word cost(short)}{length of pos info(short)}{pos info(char)}], [entry...], [entry...]..... @throws IOException 
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
final	TokenNamefinal	
String	TokenNameIdentifier	 String
baseName	TokenNameIdentifier	 base Name
=	TokenNameEQUAL	
getBaseFileName	TokenNameIdentifier	 get Base File Name
(	TokenNameLPAREN	
baseDir	TokenNameIdentifier	 base Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeDictionary	TokenNameIdentifier	 write Dictionary
(	TokenNameLPAREN	
baseName	TokenNameIdentifier	 base Name
+	TokenNamePLUS	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
DICT_FILENAME_SUFFIX	TokenNameIdentifier	 DICT  FILENAME  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeTargetMap	TokenNameIdentifier	 write Target Map
(	TokenNameLPAREN	
baseName	TokenNameIdentifier	 base Name
+	TokenNamePLUS	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
TARGETMAP_FILENAME_SUFFIX	TokenNameIdentifier	 TARGETMAP  FILENAME  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writePosDict	TokenNameIdentifier	 write Pos Dict
(	TokenNameLPAREN	
baseName	TokenNameIdentifier	 base Name
+	TokenNamePLUS	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
POSDICT_FILENAME_SUFFIX	TokenNameIdentifier	 POSDICT  FILENAME  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: maybe this int[] should instead be the output to the FST... 	TokenNameCOMMENT_LINE	TODO: maybe this int[] should instead be the output to the FST... 
protected	TokenNameprotected	
void	TokenNamevoid	
writeTargetMap	TokenNameIdentifier	 write Target Map
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
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
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
TARGETMAP_HEADER	TokenNameIdentifier	 TARGETMAP  HEADER
,	TokenNameCOMMA	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numSourceIds	TokenNameIdentifier	 num Source Ids
=	TokenNameEQUAL	
lastSourceId	TokenNameIdentifier	 last Source Id
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
targetMapEndOffset	TokenNameIdentifier	 target Map End Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// <-- size of main array 	TokenNameCOMMENT_LINE	<-- size of main array 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
numSourceIds	TokenNameIdentifier	 num Source Ids
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// <-- size of offset array (+ 1 more entry) 	TokenNameCOMMENT_LINE	<-- size of offset array (+ 1 more entry) 
int	TokenNameint	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sourceId	TokenNameIdentifier	 source Id
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ofs	TokenNameIdentifier	 ofs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ofs	TokenNameIdentifier	 ofs
<	TokenNameLESS	
targetMapEndOffset	TokenNameIdentifier	 target Map End Offset
;	TokenNameSEMICOLON	
ofs	TokenNameIdentifier	 ofs
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
targetMap	TokenNameIdentifier	 target Map
[	TokenNameLBRACKET	
ofs	TokenNameIdentifier	 ofs
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
-	TokenNameMINUS	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
assert	TokenNameassert	
delta	TokenNameIdentifier	 delta
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ofs	TokenNameIdentifier	 ofs
==	TokenNameEQUAL_EQUAL	
targetMapOffsets	TokenNameIdentifier	 target Map Offsets
[	TokenNameLBRACKET	
sourceId	TokenNameIdentifier	 source Id
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sourceId	TokenNameIdentifier	 source Id
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prev	TokenNameIdentifier	 prev
+=	TokenNamePLUS_EQUAL	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
sourceId	TokenNameIdentifier	 source Id
==	TokenNameEQUAL_EQUAL	
numSourceIds	TokenNameIdentifier	 num Source Ids
:	TokenNameCOLON	
"sourceId:"	TokenNameStringLiteral	sourceId:
+	TokenNamePLUS	
sourceId	TokenNameIdentifier	 source Id
+	TokenNamePLUS	
" != numSourceIds:"	TokenNameStringLiteral	 != numSourceIds:
+	TokenNamePLUS	
numSourceIds	TokenNameIdentifier	 num Source Ids
;	TokenNameSEMICOLON	
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
protected	TokenNameprotected	
void	TokenNamevoid	
writePosDict	TokenNameIdentifier	 write Pos Dict
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
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
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
POSDICT_HEADER	TokenNameIdentifier	 POSDICT  HEADER
,	TokenNameCOMMA	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
posDict	TokenNameIdentifier	 pos Dict
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
:	TokenNameCOLON	
posDict	TokenNameIdentifier	 pos Dict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
CSVUtil	TokenNameIdentifier	 CSV Util
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"malformed pos/inflection: "	TokenNameStringLiteral	malformed pos/inflection: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeString	TokenNameIdentifier	 write String
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
protected	TokenNameprotected	
void	TokenNamevoid	
writeDictionary	TokenNameIdentifier	 write Dictionary
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
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
final	TokenNamefinal	
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
DICT_HEADER	TokenNameIdentifier	 DICT  HEADER
,	TokenNameCOMMA	
BinaryDictionary	TokenNameIdentifier	 Binary Dictionary
.	TokenNameDOT	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
WritableByteChannel	TokenNameIdentifier	 Writable Byte Channel
channel	TokenNameIdentifier	 channel
=	TokenNameEQUAL	
Channels	TokenNameIdentifier	 Channels
.	TokenNameDOT	
newChannel	TokenNameIdentifier	 new Channel
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Write Buffer 	TokenNameCOMMENT_LINE	Write Buffer 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set position to 0, set limit to current position 	TokenNameCOMMENT_LINE	set position to 0, set limit to current position 
channel	TokenNameIdentifier	 channel
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
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
