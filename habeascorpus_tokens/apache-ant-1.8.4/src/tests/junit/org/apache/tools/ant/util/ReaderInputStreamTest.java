/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Test for ReaderInputStream */	TokenNameCOMMENT_JAVADOC	 Test for ReaderInputStream 
public	TokenNamepublic	
class	TokenNameclass	
ReaderInputStreamTest	TokenNameIdentifier	 Reader Input Stream Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
ReaderInputStreamTest	TokenNameIdentifier	 Reader Input Stream Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimple	TokenNameIdentifier	 test Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
compareBytes	TokenNameIdentifier	 compare Bytes
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
,	TokenNameCOMMA	
"utf-8"	TokenNameStringLiteral	utf-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimple16	TokenNameIdentifier	 test Simple16
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
compareBytes	TokenNameIdentifier	 compare Bytes
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"utf-16"	TokenNameStringLiteral	utf-16
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimpleAbc16	TokenNameIdentifier	 test Simple Abc16
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// THIS WILL FAIL. 	TokenNameCOMMENT_LINE	THIS WILL FAIL. 
//compareBytes("abc", "utf-16"); 	TokenNameCOMMENT_LINE	compareBytes("abc", "utf-16"); 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
40	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ReaderInputStream	TokenNameIdentifier	 Reader Input Stream
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
ReaderInputStream	TokenNameIdentifier	 Reader Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"utf-16"	TokenNameStringLiteral	utf-16
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
true	TokenNametrue	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
"abc"	TokenNameStringLiteral	abc
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"utf-16"	TokenNameStringLiteral	utf-16
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// String n = new String(bytes, 0, pos, "utf-16"); 	TokenNameCOMMENT_LINE	String n = new String(bytes, 0, pos, "utf-16"); 
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"utf-16"	TokenNameStringLiteral	utf-16
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReadZero	TokenNameIdentifier	 test Read Zero
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ReaderInputStream	TokenNameIdentifier	 Reader Input Stream
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
ReaderInputStream	TokenNameIdentifier	 Reader Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
30	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// First read in zero bytes 	TokenNameCOMMENT_LINE	First read in zero bytes 
r	TokenNameIdentifier	 r
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now read in the string 	TokenNameCOMMENT_LINE	Now read in the string 
int	TokenNameint	
readin	TokenNameIdentifier	 readin
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure that the counts are the same 	TokenNameCOMMENT_LINE	Make sure that the counts are the same 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
readin	TokenNameIdentifier	 readin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPreample	TokenNameIdentifier	 test Preample
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"utf-16"	TokenNameStringLiteral	utf-16
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Preample len is "	TokenNameStringLiteral	Preample len is 
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIso88591ToUtf8	TokenNameIdentifier	 test Iso88591 To Utf8
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
fin	TokenNameIdentifier	 fin
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ReaderInputStream	TokenNameIdentifier	 Reader Input Stream
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
utf8	TokenNameIdentifier	 utf8
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fin	TokenNameIdentifier	 fin
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
"src/tests/antunit/taskdefs/exec/input/iso8859-1"	TokenNameStringLiteral	src/tests/antunit/taskdefs/exec/input/iso8859-1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"ISO8859_1"	TokenNameStringLiteral	ISO8859_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
ReaderInputStream	TokenNameIdentifier	 Reader Input Stream
(	TokenNameLPAREN	
fin	TokenNameIdentifier	 fin
,	TokenNameCOMMA	
"UTF8"	TokenNameStringLiteral	UTF8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
actualOS	TokenNameIdentifier	 actual OS
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
actualOS	TokenNameIdentifier	 actual OS
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
utf8	TokenNameIdentifier	 utf8
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
"src/tests/antunit/taskdefs/exec/expected/utf-8"	TokenNameStringLiteral	src/tests/antunit/taskdefs/exec/expected/utf-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
expectedOS	TokenNameIdentifier	 expected OS
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectedOS	TokenNameIdentifier	 expected OS
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
expectedOS	TokenNameIdentifier	 expected OS
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
actualOS	TokenNameIdentifier	 actual OS
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"length"	TokenNameStringLiteral	length
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
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
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"byte "	TokenNameStringLiteral	byte 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
fin	TokenNameIdentifier	 fin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
compareBytes	TokenNameIdentifier	 compare Bytes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ReaderInputStream	TokenNameIdentifier	 Reader Input Stream
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
ReaderInputStream	TokenNameIdentifier	 Reader Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
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
int	TokenNameint	
expect	TokenNameIdentifier	 expect
=	TokenNameEQUAL	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expect	TokenNameIdentifier	 expect
!=	TokenNameNOT_EQUAL	
read	TokenNameIdentifier	 read
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Mismatch in ReaderInputStream at index "	TokenNameStringLiteral	Mismatch in ReaderInputStream at index 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" expecting "	TokenNameStringLiteral	 expecting 
+	TokenNamePLUS	
expect	TokenNameIdentifier	 expect
+	TokenNamePLUS	
" got "	TokenNameStringLiteral	 got 
+	TokenNamePLUS	
read	TokenNameIdentifier	 read
+	TokenNamePLUS	
" for string "	TokenNameStringLiteral	 for string 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
" with encoding "	TokenNameStringLiteral	 with encoding 
+	TokenNamePLUS	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Mismatch in ReaderInputStream - EOF not seen for string "	TokenNameStringLiteral	Mismatch in ReaderInputStream - EOF not seen for string 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
" with encoding "	TokenNameStringLiteral	 with encoding 
+	TokenNamePLUS	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
