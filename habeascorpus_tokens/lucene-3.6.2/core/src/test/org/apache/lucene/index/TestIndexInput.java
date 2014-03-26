package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
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
ByteArrayDataInput	TokenNameIdentifier	 Byte Array Data Input
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
ByteArrayDataOutput	TokenNameIdentifier	 Byte Array Data Output
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
IndexInput	TokenNameIdentifier	 Index Input
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
IndexOutput	TokenNameIdentifier	 Index Output
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
RAMDirectory	TokenNameIdentifier	 RAM Directory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
AfterClass	TokenNameIdentifier	 After Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
BeforeClass	TokenNameIdentifier	 Before Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestIndexInput	TokenNameIdentifier	 Test Index Input
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
READ_TEST_BYTES	TokenNameIdentifier	 READ  TEST  BYTES
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x07	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x0F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x07	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x7F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'L'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'u'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
// 2-byte UTF-8 (U+00BF "INVERTED QUESTION MARK") 	TokenNameCOMMENT_LINE	2-byte UTF-8 (U+00BF "INVERTED QUESTION MARK") 
0x02	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'L'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'u'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
// 3-byte UTF-8 (U+2620 "SKULL AND CROSSBONES") 	TokenNameCOMMENT_LINE	3-byte UTF-8 (U+2620 "SKULL AND CROSSBONES") 
0x03	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x98	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'L'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'u'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x98	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x98	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
// surrogate pairs 	TokenNameCOMMENT_LINE	surrogate pairs 
// (U+1D11E "MUSICAL SYMBOL G CLEF") 	TokenNameCOMMENT_LINE	(U+1D11E "MUSICAL SYMBOL G CLEF") 
// (U+1D160 "MUSICAL SYMBOL EIGHTH NOTE") 	TokenNameCOMMENT_LINE	(U+1D160 "MUSICAL SYMBOL EIGHTH NOTE") 
0x04	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x9D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x9E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x08	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x9D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x9E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x9D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'L'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'u'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x9D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x9E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x9D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
// null bytes 	TokenNameCOMMENT_LINE	null bytes 
0x01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x08	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'L'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'u'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
0x00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
0x00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
// tests for Exceptions on invalid values 	TokenNameCOMMENT_LINE	tests for Exceptions on invalid values 
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// guard value 	TokenNameCOMMENT_LINE	guard value 
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
// guard value 	TokenNameCOMMENT_LINE	guard value 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COUNT	TokenNameIdentifier	 COUNT
=	TokenNameEQUAL	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
*	TokenNameMULTIPLY	
65536	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
INTS	TokenNameIdentifier	 INTS
;	TokenNameSEMICOLON	
static	TokenNamestatic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
LONGS	TokenNameIdentifier	 LONGS
;	TokenNameSEMICOLON	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
RANDOM_TEST_BYTES	TokenNameIdentifier	 RANDOM  TEST  BYTES
;	TokenNameSEMICOLON	
@	TokenNameAT	
BeforeClass	TokenNameIdentifier	 Before Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
beforeClass	TokenNameIdentifier	 before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
INTS	TokenNameIdentifier	 INTS
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
COUNT	TokenNameIdentifier	 COUNT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
LONGS	TokenNameIdentifier	 LONGS
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
COUNT	TokenNameIdentifier	 COUNT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
RANDOM_TEST_BYTES	TokenNameIdentifier	 RANDOM  TEST  BYTES
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
COUNT	TokenNameIdentifier	 COUNT
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
9	TokenNameIntegerLiteral	
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ByteArrayDataOutput	TokenNameIdentifier	 Byte Array Data Output
bdo	TokenNameIdentifier	 bdo
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayDataOutput	TokenNameIdentifier	 Byte Array Data Output
(	TokenNameLPAREN	
RANDOM_TEST_BYTES	TokenNameIdentifier	 RANDOM  TEST  BYTES
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
COUNT	TokenNameIdentifier	 COUNT
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
INTS	TokenNameIdentifier	 INTS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bdo	TokenNameIdentifier	 bdo
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bdo	TokenNameIdentifier	 bdo
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
l1	TokenNameIdentifier	 l1
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rarely	TokenNameIdentifier	 rarely
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a long with lots of zeroes at the end 	TokenNameCOMMENT_LINE	a long with lots of zeroes at the end 
l1	TokenNameIdentifier	 l1
=	TokenNameEQUAL	
LONGS	TokenNameIdentifier	 LONGS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
l1	TokenNameIdentifier	 l1
=	TokenNameEQUAL	
LONGS	TokenNameIdentifier	 LONGS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bdo	TokenNameIdentifier	 bdo
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
l1	TokenNameIdentifier	 l1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bdo	TokenNameIdentifier	 bdo
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
l1	TokenNameIdentifier	 l1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
AfterClass	TokenNameIdentifier	 After Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
afterClass	TokenNameIdentifier	 after Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
INTS	TokenNameIdentifier	 INTS
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LONGS	TokenNameIdentifier	 LONGS
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
RANDOM_TEST_BYTES	TokenNameIdentifier	 RANDOM  TEST  BYTES
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkReads	TokenNameIdentifier	 check Reads
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
expectedEx	TokenNameIdentifier	 expected Ex
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
128	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
16383	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
16384	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
16385	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Lucene"	TokenNameStringLiteral	Lucene
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"¿"	TokenNameStringLiteral	¿
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Lu¿ce¿ne"	TokenNameStringLiteral	Lu¿ce¿ne
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Lu?ce?ne"	TokenNameStringLiteral	Lu?ce?ne
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Lu?ce?ne"	TokenNameStringLiteral	Lu?ce?ne
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Lu ce ne"	TokenNameStringLiteral	Lu ce ne
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readString	TokenNameIdentifier	 read String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw "	TokenNameStringLiteral	Should throw 
+	TokenNamePLUS	
expectedEx	TokenNameIdentifier	 expected Ex
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Invalid vInt"	TokenNameStringLiteral	Invalid vInt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
expectedEx	TokenNameIdentifier	 expected Ex
.	TokenNameDOT	
isInstance	TokenNameIdentifier	 is Instance
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// guard value 	TokenNameCOMMENT_LINE	guard value 
try	TokenNametry	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw "	TokenNameStringLiteral	Should throw 
+	TokenNamePLUS	
expectedEx	TokenNameIdentifier	 expected Ex
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Invalid vLong"	TokenNameStringLiteral	Invalid vLong
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
expectedEx	TokenNameIdentifier	 expected Ex
.	TokenNameDOT	
isInstance	TokenNameIdentifier	 is Instance
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// guard value 	TokenNameCOMMENT_LINE	guard value 
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkRandomReads	TokenNameIdentifier	 check Random Reads
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
COUNT	TokenNameIdentifier	 COUNT
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
INTS	TokenNameIdentifier	 INTS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
INTS	TokenNameIdentifier	 INTS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
LONGS	TokenNameIdentifier	 LONGS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
LONGS	TokenNameIdentifier	 LONGS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// this test only checks BufferedIndexInput because MockIndexInput extends BufferedIndexInput 	TokenNameCOMMENT_LINE	this test only checks BufferedIndexInput because MockIndexInput extends BufferedIndexInput 
public	TokenNamepublic	
void	TokenNamevoid	
testBufferedIndexInputRead	TokenNameIdentifier	 test Buffered Index Input Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexInput	TokenNameIdentifier	 Index Input
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
MockIndexInput	TokenNameIdentifier	 Mock Index Input
(	TokenNameLPAREN	
READ_TEST_BYTES	TokenNameIdentifier	 READ  TEST  BYTES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkReads	TokenNameIdentifier	 check Reads
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
MockIndexInput	TokenNameIdentifier	 Mock Index Input
(	TokenNameLPAREN	
RANDOM_TEST_BYTES	TokenNameIdentifier	 RANDOM  TEST  BYTES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkRandomReads	TokenNameIdentifier	 check Random Reads
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this test checks the raw IndexInput methods as it uses RAMIndexInput which extends IndexInput directly 	TokenNameCOMMENT_LINE	this test checks the raw IndexInput methods as it uses RAMIndexInput which extends IndexInput directly 
public	TokenNamepublic	
void	TokenNamevoid	
testRawIndexInputRead	TokenNameIdentifier	 test Raw Index Input Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
RAMDirectory	TokenNameIdentifier	 RAM Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
RAMDirectory	TokenNameIdentifier	 RAM Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexOutput	TokenNameIdentifier	 Index Output
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
READ_TEST_BYTES	TokenNameIdentifier	 READ  TEST  BYTES
,	TokenNameCOMMA	
READ_TEST_BYTES	TokenNameIdentifier	 READ  TEST  BYTES
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkReads	TokenNameIdentifier	 check Reads
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
RANDOM_TEST_BYTES	TokenNameIdentifier	 RANDOM  TEST  BYTES
,	TokenNameCOMMA	
RANDOM_TEST_BYTES	TokenNameIdentifier	 RANDOM  TEST  BYTES
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkRandomReads	TokenNameIdentifier	 check Random Reads
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testByteArrayDataInput	TokenNameIdentifier	 test Byte Array Data Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ByteArrayDataInput	TokenNameIdentifier	 Byte Array Data Input
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayDataInput	TokenNameIdentifier	 Byte Array Data Input
(	TokenNameLPAREN	
READ_TEST_BYTES	TokenNameIdentifier	 READ  TEST  BYTES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkReads	TokenNameIdentifier	 check Reads
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
RuntimeException	TokenNameIdentifier	 Runtime Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayDataInput	TokenNameIdentifier	 Byte Array Data Input
(	TokenNameLPAREN	
RANDOM_TEST_BYTES	TokenNameIdentifier	 RANDOM  TEST  BYTES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkRandomReads	TokenNameIdentifier	 check Random Reads
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert * * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Expert * @throws IOException 
public	TokenNamepublic	
void	TokenNamevoid	
testSkipChars	TokenNameIdentifier	 test Skip Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'L'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'u'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
utf8Str	TokenNameIdentifier	 utf8 Str
=	TokenNameEQUAL	
"??"	TokenNameStringLiteral	??
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
utf8Bytes	TokenNameIdentifier	 utf8 Bytes
=	TokenNameEQUAL	
utf8Str	TokenNameIdentifier	 utf8 Str
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
theBytes	TokenNameIdentifier	 the Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
utf8Bytes	TokenNameIdentifier	 utf8 Bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
theBytes	TokenNameIdentifier	 the Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
theBytes	TokenNameIdentifier	 the Bytes
[	TokenNameLBRACKET	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
utf8Str	TokenNameIdentifier	 utf8 Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Add in the number of chars we are storing, which should fit in a byte for this test 	TokenNameCOMMENT_LINE	Add in the number of chars we are storing, which should fit in a byte for this test 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
utf8Bytes	TokenNameIdentifier	 utf8 Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
theBytes	TokenNameIdentifier	 the Bytes
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
utf8Bytes	TokenNameIdentifier	 utf8 Bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
MockIndexInput	TokenNameIdentifier	 Mock Index Input
(	TokenNameLPAREN	
theBytes	TokenNameIdentifier	 the Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
128	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
16383	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
16384	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
16385	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
charsToRead	TokenNameIdentifier	 chars To Read
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//number of chars in the Lucene string 	TokenNameCOMMENT_LINE	number of chars in the Lucene string 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
0x06	TokenNameIntegerLiteral	
+	TokenNamePLUS	
" does not equal: "	TokenNameStringLiteral	 does not equal: 
+	TokenNamePLUS	
charsToRead	TokenNameIdentifier	 chars To Read
,	TokenNameCOMMA	
0x06	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
charsToRead	TokenNameIdentifier	 chars To Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
skipChars	TokenNameIdentifier	 skip Chars
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//there should be 6 chars remaining 	TokenNameCOMMENT_LINE	there should be 6 chars remaining 
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readChars	TokenNameIdentifier	 read Chars
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tmpStr	TokenNameIdentifier	 tmp Str
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
tmpStr	TokenNameIdentifier	 tmp Str
+	TokenNamePLUS	
" is not equal to "	TokenNameStringLiteral	 is not equal to 
+	TokenNamePLUS	
"ene"	TokenNameStringLiteral	ene
,	TokenNameCOMMA	
tmpStr	TokenNameIdentifier	 tmp Str
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ene"	TokenNameStringLiteral	ene
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Now read the UTF8 stuff 	TokenNameCOMMENT_LINE	Now read the UTF8 stuff 
charsToRead	TokenNameIdentifier	 chars To Read
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//since we are skipping one 	TokenNameCOMMENT_LINE	since we are skipping one 
is	TokenNameIdentifier	 is
.	TokenNameDOT	
skipChars	TokenNameIdentifier	 skip Chars
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
utf8Str	TokenNameIdentifier	 utf8 Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
" does not equal: "	TokenNameStringLiteral	 does not equal: 
+	TokenNamePLUS	
charsToRead	TokenNameIdentifier	 chars To Read
,	TokenNameCOMMA	
utf8Str	TokenNameIdentifier	 utf8 Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
charsToRead	TokenNameIdentifier	 chars To Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
charsToRead	TokenNameIdentifier	 chars To Read
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readChars	TokenNameIdentifier	 read Chars
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
charsToRead	TokenNameIdentifier	 chars To Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpStr	TokenNameIdentifier	 tmp Str
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
tmpStr	TokenNameIdentifier	 tmp Str
+	TokenNamePLUS	
" is not equal to "	TokenNameStringLiteral	 is not equal to 
+	TokenNamePLUS	
utf8Str	TokenNameIdentifier	 utf8 Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tmpStr	TokenNameIdentifier	 tmp Str
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
utf8Str	TokenNameIdentifier	 utf8 Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
