package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
TestBytesRef	TokenNameIdentifier	 Test Bytes Ref
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmpty	TokenNameIdentifier	 test Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BytesRef	TokenNameIdentifier	 Bytes Ref
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
.	TokenNameDOT	
EMPTY_BYTES	TokenNameIdentifier	 EMPTY  BYTES
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFromBytes	TokenNameIdentifier	 test From Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'b'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'd'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
BytesRef	TokenNameIdentifier	 Bytes Ref
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BytesRef	TokenNameIdentifier	 Bytes Ref
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bcd"	TokenNameStringLiteral	bcd
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
utf8ToString	TokenNameIdentifier	 utf8 To String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFromChars	TokenNameIdentifier	 test From Chars
(	TokenNameLPAREN	
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
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
randomUnicodeString	TokenNameIdentifier	 random Unicode String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
utf8ToString	TokenNameIdentifier	 utf8 To String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
)	TokenNameRPAREN	
.	TokenNameDOT	
utf8ToString	TokenNameIdentifier	 utf8 To String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-3590, AIOOBE if you append to a bytesref with offset != 0 	TokenNameCOMMENT_LINE	LUCENE-3590, AIOOBE if you append to a bytesref with offset != 0 
public	TokenNamepublic	
void	TokenNamevoid	
testAppend	TokenNameIdentifier	 test Append
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'b'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'd'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
BytesRef	TokenNameIdentifier	 Bytes Ref
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// bcd 	TokenNameCOMMENT_LINE	bcd 
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
"e"	TokenNameStringLiteral	e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bcde"	TokenNameStringLiteral	bcde
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
utf8ToString	TokenNameIdentifier	 utf8 To String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-3590, AIOOBE if you copy to a bytesref with offset != 0 	TokenNameCOMMENT_LINE	LUCENE-3590, AIOOBE if you copy to a bytesref with offset != 0 
public	TokenNamepublic	
void	TokenNamevoid	
testCopyBytes	TokenNameIdentifier	 test Copy Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'a'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'b'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
'd'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
BytesRef	TokenNameIdentifier	 Bytes Ref
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// bcd 	TokenNameCOMMENT_LINE	bcd 
b	TokenNameIdentifier	 b
.	TokenNameDOT	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
"bcde"	TokenNameStringLiteral	bcde
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bcde"	TokenNameStringLiteral	bcde
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
utf8ToString	TokenNameIdentifier	 utf8 To String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
