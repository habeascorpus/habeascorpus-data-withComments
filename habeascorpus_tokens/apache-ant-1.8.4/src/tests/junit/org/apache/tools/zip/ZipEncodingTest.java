/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Test zip encodings. */	TokenNameCOMMENT_JAVADOC	 Test zip encodings. 
public	TokenNamepublic	
class	TokenNameclass	
ZipEncodingTest	TokenNameIdentifier	 Zip Encoding Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNENC_STRING	TokenNameIdentifier	 UNENC  STRING
=	TokenNameEQUAL	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
// stress test for internal grow method. 	TokenNameCOMMENT_LINE	stress test for internal grow method. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BAD_STRING	TokenNameIdentifier	 BAD  STRING
=	TokenNameEQUAL	
"???????????"	TokenNameStringLiteral	???????????
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BAD_STRING_ENC	TokenNameIdentifier	 BAD  STRING  ENC
=	TokenNameEQUAL	
"%U2016%U2015%U2016%U2015%U2016%U2015%U2016%U2015%U2016%U2015%U2016"	TokenNameStringLiteral	%U2016%U2015%U2016%U2015%U2016%U2015%U2016%U2015%U2016%U2015%U2016
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testSimpleCp437Encoding	TokenNameIdentifier	 test Simple Cp437 Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
doSimpleEncodingTest	TokenNameIdentifier	 do Simple Encoding Test
(	TokenNameLPAREN	
"Cp437"	TokenNameStringLiteral	Cp437
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimpleCp850Encoding	TokenNameIdentifier	 test Simple Cp850 Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
doSimpleEncodingTest	TokenNameIdentifier	 do Simple Encoding Test
(	TokenNameLPAREN	
"Cp850"	TokenNameStringLiteral	Cp850
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNioCp1252Encoding	TokenNameIdentifier	 test Nio Cp1252 Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// CP1252 has some undefined code points, these are 	TokenNameCOMMENT_LINE	CP1252 has some undefined code points, these are 
// the defined ones 	TokenNameCOMMENT_LINE	the defined ones 
// retrieved by 	TokenNameCOMMENT_LINE	retrieved by 
// awk '/^0x/ && NF>2 {print $1;}' CP1252.TXT 	TokenNameCOMMENT_LINE	awk '/^0x/ && NF>2 {print $1;}' CP1252.TXT 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x07	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x08	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x26	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x52	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x53	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x54	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x55	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x58	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x63	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x65	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x67	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x68	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x73	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x74	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x75	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x76	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x77	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x79	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7E	TokenNameIntegerLiteral	
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
0x82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x88	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x89	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x8A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x8B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x8C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x8E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x91	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x92	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x93	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x94	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x95	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x96	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x97	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x98	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x99	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x9A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x9B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x9C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x9E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x9F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xA9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xAA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xAB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xAC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xAD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xAE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xAF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xB0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xB1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xB2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xB3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xB4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xB5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xB6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xB7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xB8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xB9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xBF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xC9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xCA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xCB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xCC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xCD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xCE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xCF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xD0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xD1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xD2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xD3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xD4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xD5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xD6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xD7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xD8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xD9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xDA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xDB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xDC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xDD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xDE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xDF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xE9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xEA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xEB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xEC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xED	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xEE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xEF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xF9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
doSimpleEncodingTest	TokenNameIdentifier	 do Simple Encoding Test
(	TokenNameLPAREN	
"Cp1252"	TokenNameStringLiteral	Cp1252
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
void	TokenNamevoid	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
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
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
doSimpleEncodingTest	TokenNameIdentifier	 do Simple Encoding Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
testBytes	TokenNameIdentifier	 test Bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
enc	TokenNameIdentifier	 enc
=	TokenNameEQUAL	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
getZipEncoding	TokenNameIdentifier	 get Zip Encoding
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testBytes	TokenNameIdentifier	 test Bytes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testBytes	TokenNameIdentifier	 test Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
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
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testBytes	TokenNameIdentifier	 test Bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
decoded	TokenNameIdentifier	 decoded
=	TokenNameEQUAL	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
testBytes	TokenNameIdentifier	 test Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
canEncode	TokenNameIdentifier	 can Encode
(	TokenNameLPAREN	
decoded	TokenNameIdentifier	 decoded
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
encoded	TokenNameIdentifier	 encoded
=	TokenNameEQUAL	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
decoded	TokenNameIdentifier	 decoded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
testBytes	TokenNameIdentifier	 test Bytes
,	TokenNameCOMMA	
encoded	TokenNameIdentifier	 encoded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
canEncode	TokenNameIdentifier	 can Encode
(	TokenNameLPAREN	
UNENC_STRING	TokenNameIdentifier	 UNENC  STRING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"%U2016"	TokenNameStringLiteral	%U2016
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"US-ASCII"	TokenNameStringLiteral	US-ASCII
)	TokenNameRPAREN	
,	TokenNameCOMMA	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
UNENC_STRING	TokenNameIdentifier	 UNENC  STRING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
canEncode	TokenNameIdentifier	 can Encode
(	TokenNameLPAREN	
BAD_STRING	TokenNameIdentifier	 BAD  STRING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
BAD_STRING_ENC	TokenNameIdentifier	 BAD  STRING  ENC
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"US-ASCII"	TokenNameStringLiteral	US-ASCII
)	TokenNameRPAREN	
,	TokenNameCOMMA	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
BAD_STRING	TokenNameIdentifier	 BAD  STRING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
