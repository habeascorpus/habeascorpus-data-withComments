package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Charsets	TokenNameIdentifier	 Charsets
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
.	TokenNameDOT	
jdbc	TokenNameIdentifier	 jdbc
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Hex	TokenNameIdentifier	 Hex
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
UUIDGen	TokenNameIdentifier	 UUID Gen
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
math	TokenNameIdentifier	 math
.	TokenNameDOT	
BigInteger	TokenNameIdentifier	 Big Integer
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeZone	TokenNameIdentifier	 Time Zone
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UUID	TokenNameIdentifier	 UUID
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
RoundTripTest	TokenNameIdentifier	 Round Trip Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testInteger	TokenNameIdentifier	 test Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
IntegerType	TokenNameIdentifier	 Integer Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
IntegerType	TokenNameIdentifier	 Integer Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
IntegerType	TokenNameIdentifier	 Integer Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
IntegerType	TokenNameIdentifier	 Integer Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
IntegerType	TokenNameIdentifier	 Integer Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
JdbcInteger	TokenNameIdentifier	 Jdbc Integer
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testLong	TokenNameIdentifier	 test Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
LongType	TokenNameIdentifier	 Long Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
LongType	TokenNameIdentifier	 Long Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
LongType	TokenNameIdentifier	 Long Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
LongType	TokenNameIdentifier	 Long Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
LongType	TokenNameIdentifier	 Long Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
JdbcLong	TokenNameIdentifier	 Jdbc Long
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
intLong	TokenNameIdentifier	 int Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Int32Type	TokenNameIdentifier	 Int32 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
Int32Type	TokenNameIdentifier	 Int32 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Int32Type	TokenNameIdentifier	 Int32 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
Int32Type	TokenNameIdentifier	 Int32 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Int32Type	TokenNameIdentifier	 Int32 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// assert Int32Type.instance.toString(1).equals("1"); 	TokenNameCOMMENT_LINE	assert Int32Type.instance.toString(1).equals("1"); 
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testAscii	TokenNameIdentifier	 test Ascii
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
abc	TokenNameIdentifier	 abc
=	TokenNameEQUAL	
"abc"	TokenNameStringLiteral	abc
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
Charsets	TokenNameIdentifier	 Charsets
.	TokenNameDOT	
US_ASCII	TokenNameIdentifier	 US  ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
AsciiType	TokenNameIdentifier	 Ascii Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
AsciiType	TokenNameIdentifier	 Ascii Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
AsciiType	TokenNameIdentifier	 Ascii Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
AsciiType	TokenNameIdentifier	 Ascii Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
abc	TokenNameIdentifier	 abc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
abc	TokenNameIdentifier	 abc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
AsciiType	TokenNameIdentifier	 Ascii Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
abc	TokenNameIdentifier	 abc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
JdbcAscii	TokenNameIdentifier	 Jdbc Ascii
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testBytes	TokenNameIdentifier	 test Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
JdbcBytes	TokenNameIdentifier	 Jdbc Bytes
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
BytesType	TokenNameIdentifier	 Bytes Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
Hex	TokenNameIdentifier	 Hex
.	TokenNameDOT	
bytesToHex	TokenNameIdentifier	 bytes To Hex
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Hex	TokenNameIdentifier	 Hex
.	TokenNameDOT	
bytesToHex	TokenNameIdentifier	 bytes To Hex
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
BytesType	TokenNameIdentifier	 Bytes Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
JdbcBytes	TokenNameIdentifier	 Jdbc Bytes
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
BytesType	TokenNameIdentifier	 Bytes Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
JdbcBytes	TokenNameIdentifier	 Jdbc Bytes
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Hex	TokenNameIdentifier	 Hex
.	TokenNameDOT	
bytesToHex	TokenNameIdentifier	 bytes To Hex
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testLexicalUUID	TokenNameIdentifier	 test Lexical UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
uuid	TokenNameIdentifier	 uuid
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
JdbcLexicalUUID	TokenNameIdentifier	 Jdbc Lexical UUID
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
LexicalUUIDType	TokenNameIdentifier	 Lexical UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
LexicalUUIDType	TokenNameIdentifier	 Lexical UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
LexicalUUIDType	TokenNameIdentifier	 Lexical UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
LexicalUUIDType	TokenNameIdentifier	 Lexical UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
JdbcLexicalUUID	TokenNameIdentifier	 Jdbc Lexical UUID
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTimeUUID	TokenNameIdentifier	 test Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
uuid	TokenNameIdentifier	 uuid
=	TokenNameEQUAL	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUID	TokenNameIdentifier	 get Time UUID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
JdbcTimeUUID	TokenNameIdentifier	 Jdbc Time UUID
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
setDefault	TokenNameIdentifier	 set Default
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"America/New_York"	TokenNameStringLiteral	America/New_York
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
2011	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MARCH	TokenNameIdentifier	 MARCH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Long	TokenNameIdentifier	 Long
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
1299560400000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTimeInMillis	TokenNameIdentifier	 get Time In Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTimeInMillis	TokenNameIdentifier	 get Time In Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create a uuid with a known time. 	TokenNameCOMMENT_LINE	create a uuid with a known time. 
uuid	TokenNameIdentifier	 uuid
=	TokenNameEQUAL	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"2011-03-08 00:00"	TokenNameStringLiteral	2011-03-08 00:00
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"2011-03-08 00:00:00"	TokenNameStringLiteral	2011-03-08 00:00:00
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"2011-03-08 00:00-0500"	TokenNameStringLiteral	2011-03-08 00:00-0500
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"2011-03-08 00:00:00-0500"	TokenNameStringLiteral	2011-03-08 00:00:00-0500
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"2011-03-08T00:00"	TokenNameStringLiteral	2011-03-08T00:00
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"2011-03-08T00:00-0500"	TokenNameStringLiteral	2011-03-08T00:00-0500
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"2011-03-08T00:00:00"	TokenNameStringLiteral	2011-03-08T00:00:00
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"2011-03-08T00:00:00-0500"	TokenNameStringLiteral	2011-03-08T00:00:00-0500
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"2011-03-08"	TokenNameStringLiteral	2011-03-08
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
"2011-03-08-0500"	TokenNameStringLiteral	2011-03-08-0500
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testUtf8	TokenNameIdentifier	 test Utf8
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
"?????"	TokenNameStringLiteral	?????
;	TokenNameSEMICOLON	
assert	TokenNameassert	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
Charsets	TokenNameIdentifier	 Charsets
.	TokenNameDOT	
UTF_8	TokenNameIdentifier	 UTF 8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
Charsets	TokenNameIdentifier	 Charsets
.	TokenNameDOT	
UTF_8	TokenNameIdentifier	 UTF 8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
Charsets	TokenNameIdentifier	 Charsets
.	TokenNameDOT	
UTF_8	TokenNameIdentifier	 UTF 8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
JdbcUTF8	TokenNameIdentifier	 Jdbc UT F8
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
