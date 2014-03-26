/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * JUnit 3 testcases for org.apache.tools.zip.ZipLong. * */	TokenNameCOMMENT_JAVADOC	 JUnit 3 testcases for org.apache.tools.zip.ZipLong. 
public	TokenNamepublic	
class	TokenNameclass	
ZipLongTest	TokenNameIdentifier	 Zip Long Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
ZipLongTest	TokenNameIdentifier	 Zip Long Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test conversion to bytes. */	TokenNameCOMMENT_JAVADOC	 Test conversion to bytes. 
public	TokenNamepublic	
void	TokenNamevoid	
testToBytes	TokenNameIdentifier	 test To Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipLong	TokenNameIdentifier	 Zip Long
zl	TokenNameIdentifier	 zl
=	TokenNameEQUAL	
new	TokenNamenew	
ZipLong	TokenNameIdentifier	 Zip Long
(	TokenNameLPAREN	
0x12345678	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
zl	TokenNameIdentifier	 zl
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"length getBytes"	TokenNameStringLiteral	length getBytes
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"first byte getBytes"	TokenNameStringLiteral	first byte getBytes
,	TokenNameCOMMA	
0x78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"second byte getBytes"	TokenNameStringLiteral	second byte getBytes
,	TokenNameCOMMA	
0x56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"third byte getBytes"	TokenNameStringLiteral	third byte getBytes
,	TokenNameCOMMA	
0x34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"fourth byte getBytes"	TokenNameStringLiteral	fourth byte getBytes
,	TokenNameCOMMA	
0x12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test conversion from bytes. */	TokenNameCOMMENT_JAVADOC	 Test conversion from bytes. 
public	TokenNamepublic	
void	TokenNamevoid	
testFromBytes	TokenNameIdentifier	 test From Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0x78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x12	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
ZipLong	TokenNameIdentifier	 Zip Long
zl	TokenNameIdentifier	 zl
=	TokenNameEQUAL	
new	TokenNamenew	
ZipLong	TokenNameIdentifier	 Zip Long
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"value from bytes"	TokenNameStringLiteral	value from bytes
,	TokenNameCOMMA	
0x12345678	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
zl	TokenNameIdentifier	 zl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test the contract of the equals method. */	TokenNameCOMMENT_JAVADOC	 Test the contract of the equals method. 
public	TokenNamepublic	
void	TokenNamevoid	
testEquals	TokenNameIdentifier	 test Equals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipLong	TokenNameIdentifier	 Zip Long
zl	TokenNameIdentifier	 zl
=	TokenNameEQUAL	
new	TokenNamenew	
ZipLong	TokenNameIdentifier	 Zip Long
(	TokenNameLPAREN	
0x12345678	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipLong	TokenNameIdentifier	 Zip Long
zl2	TokenNameIdentifier	 zl2
=	TokenNameEQUAL	
new	TokenNamenew	
ZipLong	TokenNameIdentifier	 Zip Long
(	TokenNameLPAREN	
0x12345678	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipLong	TokenNameIdentifier	 Zip Long
zl3	TokenNameIdentifier	 zl3
=	TokenNameEQUAL	
new	TokenNamenew	
ZipLong	TokenNameIdentifier	 Zip Long
(	TokenNameLPAREN	
0x87654321	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"reflexive"	TokenNameStringLiteral	reflexive
,	TokenNameCOMMA	
zl	TokenNameIdentifier	 zl
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
zl	TokenNameIdentifier	 zl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"works"	TokenNameStringLiteral	works
,	TokenNameCOMMA	
zl	TokenNameIdentifier	 zl
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
zl2	TokenNameIdentifier	 zl2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"works, part two"	TokenNameStringLiteral	works, part two
,	TokenNameCOMMA	
!	TokenNameNOT	
zl	TokenNameIdentifier	 zl
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
zl3	TokenNameIdentifier	 zl3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"symmetric"	TokenNameStringLiteral	symmetric
,	TokenNameCOMMA	
zl2	TokenNameIdentifier	 zl2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
zl	TokenNameIdentifier	 zl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"null handling"	TokenNameStringLiteral	null handling
,	TokenNameCOMMA	
!	TokenNameNOT	
zl	TokenNameIdentifier	 zl
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"non ZipLong handling"	TokenNameStringLiteral	non ZipLong handling
,	TokenNameCOMMA	
!	TokenNameNOT	
zl	TokenNameIdentifier	 zl
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x1234	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test sign handling. */	TokenNameCOMMENT_JAVADOC	 Test sign handling. 
public	TokenNamepublic	
void	TokenNamevoid	
testSign	TokenNameIdentifier	 test Sign
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipLong	TokenNameIdentifier	 Zip Long
zl	TokenNameIdentifier	 zl
=	TokenNameEQUAL	
new	TokenNamenew	
ZipLong	TokenNameIdentifier	 Zip Long
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0x00000000FFFFFFFFl	TokenNameLongLiteral	
,	TokenNameCOMMA	
zl	TokenNameIdentifier	 zl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testClone	TokenNameIdentifier	 test Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipLong	TokenNameIdentifier	 Zip Long
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
new	TokenNamenew	
ZipLong	TokenNameIdentifier	 Zip Long
(	TokenNameLPAREN	
42	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipLong	TokenNameIdentifier	 Zip Long
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipLong	TokenNameIdentifier	 Zip Long
)	TokenNameRPAREN	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
