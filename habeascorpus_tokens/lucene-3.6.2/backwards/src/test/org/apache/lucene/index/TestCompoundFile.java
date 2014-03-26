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
File	TokenNameIdentifier	 File
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
Directory	TokenNameIdentifier	 Directory
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
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
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
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
.	TokenNameDOT	
Failure	TokenNameIdentifier	 Failure
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
SimpleFSDirectory	TokenNameIdentifier	 Simple FS Directory
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
_TestHelper	TokenNameIdentifier	 Test Helper
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
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestCompoundFile	TokenNameIdentifier	 Test Compound File
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
getTempDir	TokenNameIdentifier	 get Temp Dir
(	TokenNameLPAREN	
"testIndex"	TokenNameStringLiteral	testIndex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use a simple FSDir here, to be sure to have SimpleFSInputs 	TokenNameCOMMENT_LINE	use a simple FSDir here, to be sure to have SimpleFSInputs 
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFSDirectory	TokenNameIdentifier	 Simple FS Directory
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a file of the specified size with random data. */	TokenNameCOMMENT_JAVADOC	 Creates a file of the specified size with random data. 
private	TokenNameprivate	
void	TokenNamevoid	
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexOutput	TokenNameIdentifier	 Index Output
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a file of the specified size with sequential data. The first * byte is written as the start byte provided. All subsequent bytes are * computed as start + offset where offset is the number of the byte. */	TokenNameCOMMENT_JAVADOC	 Creates a file of the specified size with sequential data. The first byte is written as the start byte provided. All subsequent bytes are computed as start + offset where offset is the number of the byte. 
private	TokenNameprivate	
void	TokenNamevoid	
createSequenceFile	TokenNameIdentifier	 create Sequence File
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
byte	TokenNamebyte	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexOutput	TokenNameIdentifier	 Index Output
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
IndexInput	TokenNameIdentifier	 Index Input
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
IndexInput	TokenNameIdentifier	 Index Input
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
" null expected"	TokenNameStringLiteral	 null expected
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
" null test"	TokenNameStringLiteral	 null test
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
" length"	TokenNameStringLiteral	 length
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
" position"	TokenNameStringLiteral	 position
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
expectedBuffer	TokenNameIdentifier	 expected Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
512	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
testBuffer	TokenNameIdentifier	 test Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
expectedBuffer	TokenNameIdentifier	 expected Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
remainder	TokenNameIdentifier	 remainder
=	TokenNameEQUAL	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
remainder	TokenNameIdentifier	 remainder
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
readLen	TokenNameIdentifier	 read Len
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
remainder	TokenNameIdentifier	 remainder
,	TokenNameCOMMA	
expectedBuffer	TokenNameIdentifier	 expected Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
expectedBuffer	TokenNameIdentifier	 expected Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
readLen	TokenNameIdentifier	 read Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
testBuffer	TokenNameIdentifier	 test Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
readLen	TokenNameIdentifier	 read Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEqualArrays	TokenNameIdentifier	 assert Equal Arrays
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
", remainder "	TokenNameStringLiteral	, remainder 
+	TokenNamePLUS	
remainder	TokenNameIdentifier	 remainder
,	TokenNameCOMMA	
expectedBuffer	TokenNameIdentifier	 expected Buffer
,	TokenNameCOMMA	
testBuffer	TokenNameIdentifier	 test Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
readLen	TokenNameIdentifier	 read Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
remainder	TokenNameIdentifier	 remainder
-=	TokenNameMINUS_EQUAL	
readLen	TokenNameIdentifier	 read Len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
IndexInput	TokenNameIdentifier	 Index Input
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
IndexInput	TokenNameIdentifier	 Index Input
actual	TokenNameIdentifier	 actual
,	TokenNameCOMMA	
long	TokenNamelong	
seekTo	TokenNameIdentifier	 seek To
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
seekTo	TokenNameIdentifier	 seek To
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
seekTo	TokenNameIdentifier	 seek To
<	TokenNameLESS	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
seekTo	TokenNameIdentifier	 seek To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
seekTo	TokenNameIdentifier	 seek To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
", seek(mid)"	TokenNameStringLiteral	, seek(mid)
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertSameSeekBehavior	TokenNameIdentifier	 assert Same Seek Behavior
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
IndexInput	TokenNameIdentifier	 Index Input
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
IndexInput	TokenNameIdentifier	 Index Input
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// seek to 0 	TokenNameCOMMENT_LINE	seek to 0 
long	TokenNamelong	
point	TokenNameIdentifier	 point
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
", seek(0)"	TokenNameStringLiteral	, seek(0)
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
,	TokenNameCOMMA	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// seek to middle 	TokenNameCOMMENT_LINE	seek to middle 
point	TokenNameIdentifier	 point
=	TokenNameEQUAL	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2l	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
", seek(mid)"	TokenNameStringLiteral	, seek(mid)
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
,	TokenNameCOMMA	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// seek to end - 2 	TokenNameCOMMENT_LINE	seek to end - 2 
point	TokenNameIdentifier	 point
=	TokenNameEQUAL	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
", seek(end-2)"	TokenNameStringLiteral	, seek(end-2)
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
,	TokenNameCOMMA	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// seek to end - 1 	TokenNameCOMMENT_LINE	seek to end - 1 
point	TokenNameIdentifier	 point
=	TokenNameEQUAL	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
", seek(end-1)"	TokenNameStringLiteral	, seek(end-1)
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
,	TokenNameCOMMA	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// seek to the end 	TokenNameCOMMENT_LINE	seek to the end 
point	TokenNameIdentifier	 point
=	TokenNameEQUAL	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
", seek(end)"	TokenNameStringLiteral	, seek(end)
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
,	TokenNameCOMMA	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// seek past end 	TokenNameCOMMENT_LINE	seek past end 
point	TokenNameIdentifier	 point
=	TokenNameEQUAL	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
", seek(end+1)"	TokenNameStringLiteral	, seek(end+1)
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
,	TokenNameCOMMA	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertEqualArrays	TokenNameIdentifier	 assert Equal Arrays
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
" null expected"	TokenNameStringLiteral	 null expected
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
" null test"	TokenNameStringLiteral	 null test
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// =========================================================== 	TokenNameCOMMENT_LINE	=========================================================== 
// Tests of the basic CompoundFile functionality 	TokenNameCOMMENT_LINE	Tests of the basic CompoundFile functionality 
// =========================================================== 	TokenNameCOMMENT_LINE	=========================================================== 
/** This test creates compound file based on a single file. * Files of different sizes are tested: 0, 1, 10, 100 bytes. */	TokenNameCOMMENT_JAVADOC	 This test creates compound file based on a single file. Files of different sizes are tested: 0, 1, 10, 100 bytes. 
public	TokenNamepublic	
void	TokenNamevoid	
testSingleFile	TokenNameIdentifier	 test Single File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
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
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
"t"	TokenNameStringLiteral	t
+	TokenNamePLUS	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
createSequenceFile	TokenNameIdentifier	 create Sequence File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
csw	TokenNameIdentifier	 csw
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
".cfs"	TokenNameStringLiteral	.cfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
csw	TokenNameIdentifier	 csw
.	TokenNameDOT	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
csw	TokenNameIdentifier	 csw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
csr	TokenNameIdentifier	 csr
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
".cfs"	TokenNameStringLiteral	.cfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
csr	TokenNameIdentifier	 csr
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameSeekBehavior	TokenNameIdentifier	 assert Same Seek Behavior
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
csr	TokenNameIdentifier	 csr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This test creates compound file based on two files. * */	TokenNameCOMMENT_JAVADOC	 This test creates compound file based on two files. 
public	TokenNamepublic	
void	TokenNamevoid	
testTwoFiles	TokenNameIdentifier	 test Two Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
createSequenceFile	TokenNameIdentifier	 create Sequence File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"d1"	TokenNameStringLiteral	d1
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createSequenceFile	TokenNameIdentifier	 create Sequence File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"d2"	TokenNameStringLiteral	d2
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
114	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
csw	TokenNameIdentifier	 csw
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"d.csf"	TokenNameStringLiteral	d.csf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
csw	TokenNameIdentifier	 csw
.	TokenNameDOT	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
"d1"	TokenNameStringLiteral	d1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
csw	TokenNameIdentifier	 csw
.	TokenNameDOT	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
"d2"	TokenNameStringLiteral	d2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
csw	TokenNameIdentifier	 csw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
csr	TokenNameIdentifier	 csr
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"d.csf"	TokenNameStringLiteral	d.csf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"d1"	TokenNameStringLiteral	d1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
csr	TokenNameIdentifier	 csr
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"d1"	TokenNameStringLiteral	d1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
"d1"	TokenNameStringLiteral	d1
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameSeekBehavior	TokenNameIdentifier	 assert Same Seek Behavior
(	TokenNameLPAREN	
"d1"	TokenNameStringLiteral	d1
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"d2"	TokenNameStringLiteral	d2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
csr	TokenNameIdentifier	 csr
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"d2"	TokenNameStringLiteral	d2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
"d2"	TokenNameStringLiteral	d2
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameSeekBehavior	TokenNameIdentifier	 assert Same Seek Behavior
(	TokenNameLPAREN	
"d2"	TokenNameStringLiteral	d2
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
csr	TokenNameIdentifier	 csr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This test creates a compound file based on a large number of files of * various length. The file content is generated randomly. The sizes range * from 0 to 1Mb. Some of the sizes are selected to test the buffering * logic in the file reading code. For this the chunk variable is set to * the length of the buffer used internally by the compound file logic. */	TokenNameCOMMENT_JAVADOC	 This test creates a compound file based on a large number of files of various length. The file content is generated randomly. The sizes range from 0 to 1Mb. Some of the sizes are selected to test the buffering logic in the file reading code. For this the chunk variable is set to the length of the buffer used internally by the compound file logic. 
public	TokenNamepublic	
void	TokenNamevoid	
testRandomFiles	TokenNameIdentifier	 test Random Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Setup the test segment 	TokenNameCOMMENT_LINE	Setup the test segment 
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
=	TokenNameEQUAL	
"test"	TokenNameStringLiteral	test
;	TokenNameSEMICOLON	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// internal buffer size used by the stream 	TokenNameCOMMENT_LINE	internal buffer size used by the stream 
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".zero"	TokenNameStringLiteral	.zero
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".one"	TokenNameStringLiteral	.one
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".ten"	TokenNameStringLiteral	.ten
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".hundred"	TokenNameStringLiteral	.hundred
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".big1"	TokenNameStringLiteral	.big1
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".big2"	TokenNameStringLiteral	.big2
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".big3"	TokenNameStringLiteral	.big3
,	TokenNameCOMMA	
chunk	TokenNameIdentifier	 chunk
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".big4"	TokenNameStringLiteral	.big4
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".big5"	TokenNameStringLiteral	.big5
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
chunk	TokenNameIdentifier	 chunk
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".big6"	TokenNameStringLiteral	.big6
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
chunk	TokenNameIdentifier	 chunk
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".big7"	TokenNameStringLiteral	.big7
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
chunk	TokenNameIdentifier	 chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Setup extraneous files 	TokenNameCOMMENT_LINE	Setup extraneous files 
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"onetwothree"	TokenNameStringLiteral	onetwothree
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".notIn"	TokenNameStringLiteral	.notIn
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createRandomFile	TokenNameIdentifier	 create Random File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
".notIn2"	TokenNameStringLiteral	.notIn2
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now test 	TokenNameCOMMENT_LINE	Now test 
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
csw	TokenNameIdentifier	 csw
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"test.cfs"	TokenNameStringLiteral	test.cfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
".zero"	TokenNameStringLiteral	.zero
,	TokenNameCOMMA	
".one"	TokenNameStringLiteral	.one
,	TokenNameCOMMA	
".ten"	TokenNameStringLiteral	.ten
,	TokenNameCOMMA	
".hundred"	TokenNameStringLiteral	.hundred
,	TokenNameCOMMA	
".big1"	TokenNameStringLiteral	.big1
,	TokenNameCOMMA	
".big2"	TokenNameStringLiteral	.big2
,	TokenNameCOMMA	
".big3"	TokenNameStringLiteral	.big3
,	TokenNameCOMMA	
".big4"	TokenNameStringLiteral	.big4
,	TokenNameCOMMA	
".big5"	TokenNameStringLiteral	.big5
,	TokenNameCOMMA	
".big6"	TokenNameStringLiteral	.big6
,	TokenNameCOMMA	
".big7"	TokenNameStringLiteral	.big7
}	TokenNameRBRACE	
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
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
csw	TokenNameIdentifier	 csw
.	TokenNameDOT	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
csw	TokenNameIdentifier	 csw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
csr	TokenNameIdentifier	 csr
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"test.cfs"	TokenNameStringLiteral	test.cfs
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
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexInput	TokenNameIdentifier	 Index Input
check	TokenNameIdentifier	 check
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
csr	TokenNameIdentifier	 csr
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
check	TokenNameIdentifier	 check
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameSeekBehavior	TokenNameIdentifier	 assert Same Seek Behavior
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
check	TokenNameIdentifier	 check
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
csr	TokenNameIdentifier	 csr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Setup a larger compound file with a number of components, each of * which is a sequential file (so that we can easily tell that we are * reading in the right byte). The methods sets up 20 files - f0 to f19, * the size of each file is 1000 bytes. */	TokenNameCOMMENT_JAVADOC	 Setup a larger compound file with a number of components, each of which is a sequential file (so that we can easily tell that we are reading in the right byte). The methods sets up 20 files - f0 to f19, the size of each file is 1000 bytes. 
private	TokenNameprivate	
void	TokenNamevoid	
setUp_2	TokenNameIdentifier	 set Up 2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
cw	TokenNameIdentifier	 cw
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"f.comp"	TokenNameStringLiteral	f.comp
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
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createSequenceFile	TokenNameIdentifier	 create Sequence File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"f"	TokenNameStringLiteral	f
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cw	TokenNameIdentifier	 cw
.	TokenNameDOT	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cw	TokenNameIdentifier	 cw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReadAfterClose	TokenNameIdentifier	 test Read After Close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
demo_FSIndexInputBug	TokenNameIdentifier	 demo  FS Index Input Bug
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
demo_FSIndexInputBug	TokenNameIdentifier	 demo  FS Index Input Bug
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
fsdir	TokenNameIdentifier	 fsdir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Setup the test file - we need more than 1024 bytes 	TokenNameCOMMENT_LINE	Setup the test file - we need more than 1024 bytes 
IndexOutput	TokenNameIdentifier	 Index Output
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
fsdir	TokenNameIdentifier	 fsdir
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
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
2000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
fsdir	TokenNameIdentifier	 fsdir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This read primes the buffer in IndexInput 	TokenNameCOMMENT_LINE	This read primes the buffer in IndexInput 
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Close the file 	TokenNameCOMMENT_LINE	Close the file 
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ERROR: this call should fail, but succeeds because the buffer 	TokenNameCOMMENT_LINE	ERROR: this call should fail, but succeeds because the buffer 
// is still filled 	TokenNameCOMMENT_LINE	is still filled 
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ERROR: this call should fail, but succeeds for some reason as well 	TokenNameCOMMENT_LINE	ERROR: this call should fail, but succeeds for some reason as well 
in	TokenNameIdentifier	 in
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
1099	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// OK: this call correctly fails. We are now past the 1024 internal 	TokenNameCOMMENT_LINE	OK: this call correctly fails. We are now past the 1024 internal 
// buffer, so an actual IO is attempted, which fails 	TokenNameCOMMENT_LINE	buffer, so an actual IO is attempted, which fails 
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"expected readByte() to throw exception"	TokenNameStringLiteral	expected readByte() to throw exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected exception 	TokenNameCOMMENT_LINE	expected exception 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
boolean	TokenNameboolean	
isCSIndexInput	TokenNameIdentifier	 is CS Index Input
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
is	TokenNameIdentifier	 is
instanceof	TokenNameinstanceof	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
.	TokenNameDOT	
CSIndexInput	TokenNameIdentifier	 CS Index Input
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
boolean	TokenNameboolean	
isCSIndexInputOpen	TokenNameIdentifier	 is CS Index Input Open
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isCSIndexInput	TokenNameIdentifier	 is CS Index Input
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
.	TokenNameDOT	
CSIndexInput	TokenNameIdentifier	 CS Index Input
cis	TokenNameIdentifier	 cis
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
.	TokenNameDOT	
CSIndexInput	TokenNameIdentifier	 CS Index Input
)	TokenNameRPAREN	
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_TestHelper	TokenNameIdentifier	 Test Helper
.	TokenNameDOT	
isSimpleFSIndexInputOpen	TokenNameIdentifier	 is Simple FS Index Input Open
(	TokenNameLPAREN	
cis	TokenNameIdentifier	 cis
.	TokenNameDOT	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testClonedStreamsClosing	TokenNameIdentifier	 test Cloned Streams Closing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
setUp_2	TokenNameIdentifier	 set Up 2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
cr	TokenNameIdentifier	 cr
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"f.comp"	TokenNameStringLiteral	f.comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// basic clone 	TokenNameCOMMENT_LINE	basic clone 
IndexInput	TokenNameIdentifier	 Index Input
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"f11"	TokenNameStringLiteral	f11
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this test only works for FSIndexInput 	TokenNameCOMMENT_LINE	this test only works for FSIndexInput 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
_TestHelper	TokenNameIdentifier	 Test Helper
.	TokenNameDOT	
isSimpleFSIndexInput	TokenNameIdentifier	 is Simple FS Index Input
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
_TestHelper	TokenNameIdentifier	 Test Helper
.	TokenNameDOT	
isSimpleFSIndexInputOpen	TokenNameIdentifier	 is Simple FS Index Input Open
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
one	TokenNameIdentifier	 one
=	TokenNameEQUAL	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"f11"	TokenNameStringLiteral	f11
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
isCSIndexInputOpen	TokenNameIdentifier	 is CS Index Input Open
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
two	TokenNameIdentifier	 two
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
)	TokenNameRPAREN	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
isCSIndexInputOpen	TokenNameIdentifier	 is CS Index Input Open
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
"basic clone one"	TokenNameStringLiteral	basic clone one
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
"basic clone two"	TokenNameStringLiteral	basic clone two
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now close the first stream 	TokenNameCOMMENT_LINE	Now close the first stream 
one	TokenNameIdentifier	 one
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Only close when cr is closed"	TokenNameStringLiteral	Only close when cr is closed
,	TokenNameCOMMA	
isCSIndexInputOpen	TokenNameIdentifier	 is CS Index Input Open
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The following should really fail since we couldn't expect to 	TokenNameCOMMENT_LINE	The following should really fail since we couldn't expect to 
// access a file once close has been called on it (regardless of 	TokenNameCOMMENT_LINE	access a file once close has been called on it (regardless of 
// buffering and/or clone magic) 	TokenNameCOMMENT_LINE	buffering and/or clone magic) 
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
"basic clone two/2"	TokenNameStringLiteral	basic clone two/2
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now close the compound reader 	TokenNameCOMMENT_LINE	Now close the compound reader 
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"Now closed one"	TokenNameStringLiteral	Now closed one
,	TokenNameCOMMA	
isCSIndexInputOpen	TokenNameIdentifier	 is CS Index Input Open
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"Now closed two"	TokenNameStringLiteral	Now closed two
,	TokenNameCOMMA	
isCSIndexInputOpen	TokenNameIdentifier	 is CS Index Input Open
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The following may also fail since the compound stream is closed 	TokenNameCOMMENT_LINE	The following may also fail since the compound stream is closed 
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//assertSameStreams("basic clone two/3", expected, two); 	TokenNameCOMMENT_LINE	assertSameStreams("basic clone two/3", expected, two); 
// Now close the second clone 	TokenNameCOMMENT_LINE	Now close the second clone 
two	TokenNameIdentifier	 two
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//assertSameStreams("basic clone two/4", expected, two); 	TokenNameCOMMENT_LINE	assertSameStreams("basic clone two/4", expected, two); 
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This test opens two files from a compound stream and verifies that * their file positions are independent of each other. */	TokenNameCOMMENT_JAVADOC	 This test opens two files from a compound stream and verifies that their file positions are independent of each other. 
public	TokenNamepublic	
void	TokenNamevoid	
testRandomAccess	TokenNameIdentifier	 test Random Access
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
setUp_2	TokenNameIdentifier	 set Up 2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
cr	TokenNameIdentifier	 cr
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"f.comp"	TokenNameStringLiteral	f.comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Open two files 	TokenNameCOMMENT_LINE	Open two files 
IndexInput	TokenNameIdentifier	 Index Input
e1	TokenNameIdentifier	 e1
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"f11"	TokenNameStringLiteral	f11
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
e2	TokenNameIdentifier	 e2
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"f3"	TokenNameStringLiteral	f3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"f11"	TokenNameStringLiteral	f11
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
a2	TokenNameIdentifier	 a2
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"f3"	TokenNameStringLiteral	f3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Seek the first pair 	TokenNameCOMMENT_LINE	Seek the first pair 
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
be1	TokenNameIdentifier	 be1
=	TokenNameEQUAL	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
ba1	TokenNameIdentifier	 ba1
=	TokenNameEQUAL	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be1	TokenNameIdentifier	 be1
,	TokenNameCOMMA	
ba1	TokenNameIdentifier	 ba1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now seek the second pair 	TokenNameCOMMENT_LINE	Now seek the second pair 
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
1027	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
1027	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1027	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1027	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
be2	TokenNameIdentifier	 be2
=	TokenNameEQUAL	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
ba2	TokenNameIdentifier	 ba2
=	TokenNameEQUAL	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be2	TokenNameIdentifier	 be2
,	TokenNameCOMMA	
ba2	TokenNameIdentifier	 ba2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now make sure the first one didn't move 	TokenNameCOMMENT_LINE	Now make sure the first one didn't move 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
101	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
101	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be1	TokenNameIdentifier	 be1
=	TokenNameEQUAL	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ba1	TokenNameIdentifier	 ba1
=	TokenNameEQUAL	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be1	TokenNameIdentifier	 be1
,	TokenNameCOMMA	
ba1	TokenNameIdentifier	 ba1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now more the first one again, past the buffer length 	TokenNameCOMMENT_LINE	Now more the first one again, past the buffer length 
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
1910	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
1910	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1910	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1910	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be1	TokenNameIdentifier	 be1
=	TokenNameEQUAL	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ba1	TokenNameIdentifier	 ba1
=	TokenNameEQUAL	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be1	TokenNameIdentifier	 be1
,	TokenNameCOMMA	
ba1	TokenNameIdentifier	 ba1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now make sure the second set didn't move 	TokenNameCOMMENT_LINE	Now make sure the second set didn't move 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1028	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1028	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be2	TokenNameIdentifier	 be2
=	TokenNameEQUAL	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ba2	TokenNameIdentifier	 ba2
=	TokenNameEQUAL	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be2	TokenNameIdentifier	 be2
,	TokenNameCOMMA	
ba2	TokenNameIdentifier	 ba2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Move the second set back, again cross the buffer size 	TokenNameCOMMENT_LINE	Move the second set back, again cross the buffer size 
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be2	TokenNameIdentifier	 be2
=	TokenNameEQUAL	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ba2	TokenNameIdentifier	 ba2
=	TokenNameEQUAL	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be2	TokenNameIdentifier	 be2
,	TokenNameCOMMA	
ba2	TokenNameIdentifier	 ba2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Finally, make sure the first set didn't move 	TokenNameCOMMENT_LINE	Finally, make sure the first set didn't move 
// Now make sure the first one didn't move 	TokenNameCOMMENT_LINE	Now make sure the first one didn't move 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1911	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1911	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be1	TokenNameIdentifier	 be1
=	TokenNameEQUAL	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ba1	TokenNameIdentifier	 ba1
=	TokenNameEQUAL	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be1	TokenNameIdentifier	 be1
,	TokenNameCOMMA	
ba1	TokenNameIdentifier	 ba1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This test opens two files from a compound stream and verifies that * their file positions are independent of each other. */	TokenNameCOMMENT_JAVADOC	 This test opens two files from a compound stream and verifies that their file positions are independent of each other. 
public	TokenNamepublic	
void	TokenNamevoid	
testRandomAccessClones	TokenNameIdentifier	 test Random Access Clones
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
setUp_2	TokenNameIdentifier	 set Up 2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
cr	TokenNameIdentifier	 cr
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"f.comp"	TokenNameStringLiteral	f.comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Open two files 	TokenNameCOMMENT_LINE	Open two files 
IndexInput	TokenNameIdentifier	 Index Input
e1	TokenNameIdentifier	 e1
=	TokenNameEQUAL	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"f11"	TokenNameStringLiteral	f11
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
e2	TokenNameIdentifier	 e2
=	TokenNameEQUAL	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"f3"	TokenNameStringLiteral	f3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
)	TokenNameRPAREN	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
a2	TokenNameIdentifier	 a2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
)	TokenNameRPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Seek the first pair 	TokenNameCOMMENT_LINE	Seek the first pair 
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
be1	TokenNameIdentifier	 be1
=	TokenNameEQUAL	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
ba1	TokenNameIdentifier	 ba1
=	TokenNameEQUAL	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be1	TokenNameIdentifier	 be1
,	TokenNameCOMMA	
ba1	TokenNameIdentifier	 ba1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now seek the second pair 	TokenNameCOMMENT_LINE	Now seek the second pair 
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
1027	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
1027	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1027	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1027	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
be2	TokenNameIdentifier	 be2
=	TokenNameEQUAL	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
ba2	TokenNameIdentifier	 ba2
=	TokenNameEQUAL	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be2	TokenNameIdentifier	 be2
,	TokenNameCOMMA	
ba2	TokenNameIdentifier	 ba2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now make sure the first one didn't move 	TokenNameCOMMENT_LINE	Now make sure the first one didn't move 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
101	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
101	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be1	TokenNameIdentifier	 be1
=	TokenNameEQUAL	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ba1	TokenNameIdentifier	 ba1
=	TokenNameEQUAL	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be1	TokenNameIdentifier	 be1
,	TokenNameCOMMA	
ba1	TokenNameIdentifier	 ba1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now more the first one again, past the buffer length 	TokenNameCOMMENT_LINE	Now more the first one again, past the buffer length 
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
1910	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
1910	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1910	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1910	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be1	TokenNameIdentifier	 be1
=	TokenNameEQUAL	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ba1	TokenNameIdentifier	 ba1
=	TokenNameEQUAL	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be1	TokenNameIdentifier	 be1
,	TokenNameCOMMA	
ba1	TokenNameIdentifier	 ba1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now make sure the second set didn't move 	TokenNameCOMMENT_LINE	Now make sure the second set didn't move 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1028	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1028	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be2	TokenNameIdentifier	 be2
=	TokenNameEQUAL	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ba2	TokenNameIdentifier	 ba2
=	TokenNameEQUAL	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be2	TokenNameIdentifier	 be2
,	TokenNameCOMMA	
ba2	TokenNameIdentifier	 ba2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Move the second set back, again cross the buffer size 	TokenNameCOMMENT_LINE	Move the second set back, again cross the buffer size 
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be2	TokenNameIdentifier	 be2
=	TokenNameEQUAL	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ba2	TokenNameIdentifier	 ba2
=	TokenNameEQUAL	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be2	TokenNameIdentifier	 be2
,	TokenNameCOMMA	
ba2	TokenNameIdentifier	 ba2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Finally, make sure the first set didn't move 	TokenNameCOMMENT_LINE	Finally, make sure the first set didn't move 
// Now make sure the first one didn't move 	TokenNameCOMMENT_LINE	Now make sure the first one didn't move 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1911	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1911	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be1	TokenNameIdentifier	 be1
=	TokenNameEQUAL	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ba1	TokenNameIdentifier	 ba1
=	TokenNameEQUAL	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
be1	TokenNameIdentifier	 be1
,	TokenNameCOMMA	
ba1	TokenNameIdentifier	 ba1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a1	TokenNameIdentifier	 a1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a2	TokenNameIdentifier	 a2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFileNotFound	TokenNameIdentifier	 test File Not Found
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
setUp_2	TokenNameIdentifier	 set Up 2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
cr	TokenNameIdentifier	 cr
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"f.comp"	TokenNameStringLiteral	f.comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Open two files 	TokenNameCOMMENT_LINE	Open two files 
try	TokenNametry	
{	TokenNameLBRACE	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"bogus"	TokenNameStringLiteral	bogus
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"File not found"	TokenNameStringLiteral	File not found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* success */	TokenNameCOMMENT_BLOCK	 success 
//System.out.println("SUCCESS: File Not Found: " + e); 	TokenNameCOMMENT_LINE	System.out.println("SUCCESS: File Not Found: " + e); 
}	TokenNameRBRACE	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReadPastEOF	TokenNameIdentifier	 test Read Past EOF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
setUp_2	TokenNameIdentifier	 set Up 2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
cr	TokenNameIdentifier	 cr
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"f.comp"	TokenNameStringLiteral	f.comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"f2"	TokenNameStringLiteral	f2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
100	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Single byte read past end of file"	TokenNameStringLiteral	Single byte read past end of file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* success */	TokenNameCOMMENT_BLOCK	 success 
//System.out.println("SUCCESS: single byte read past end of file: " + e); 	TokenNameCOMMENT_LINE	System.out.println("SUCCESS: single byte read past end of file: " + e); 
}	TokenNameRBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readBytes	TokenNameIdentifier	 read Bytes
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Block read past end of file"	TokenNameStringLiteral	Block read past end of file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* success */	TokenNameCOMMENT_BLOCK	 success 
//System.out.println("SUCCESS: block read past end of file: " + e); 	TokenNameCOMMENT_LINE	System.out.println("SUCCESS: block read past end of file: " + e); 
}	TokenNameRBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This test that writes larger than the size of the buffer output * will correctly increment the file pointer. */	TokenNameCOMMENT_JAVADOC	 This test that writes larger than the size of the buffer output will correctly increment the file pointer. 
public	TokenNamepublic	
void	TokenNamevoid	
testLargeWrites	TokenNameIdentifier	 test Large Writes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexOutput	TokenNameIdentifier	 Index Output
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
"testBufferStart.txt"	TokenNameStringLiteral	testBufferStart.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
largeBuf	TokenNameIdentifier	 large Buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
2048	TokenNameIntegerLiteral	
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
largeBuf	TokenNameIdentifier	 large Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
largeBuf	TokenNameIdentifier	 large Buf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
currentPos	TokenNameIdentifier	 current Pos
=	TokenNameEQUAL	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
largeBuf	TokenNameIdentifier	 large Buf
,	TokenNameCOMMA	
largeBuf	TokenNameIdentifier	 large Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
currentPos	TokenNameIdentifier	 current Pos
+	TokenNamePLUS	
largeBuf	TokenNameIdentifier	 large Buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
public	TokenNamepublic	
void	TokenNamevoid	
testAddExternalFile	TokenNameIdentifier	 test Add External File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
createSequenceFile	TokenNameIdentifier	 create Sequence File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"d1"	TokenNameStringLiteral	d1
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
newDir	TokenNameIdentifier	 new Dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
csw	TokenNameIdentifier	 csw
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
(	TokenNameLPAREN	
newDir	TokenNameIdentifier	 new Dir
,	TokenNameCOMMA	
"d.csf"	TokenNameStringLiteral	d.csf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
csw	TokenNameIdentifier	 csw
.	TokenNameDOT	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
"d1"	TokenNameStringLiteral	d1
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
csw	TokenNameIdentifier	 csw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
csr	TokenNameIdentifier	 csr
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
newDir	TokenNameIdentifier	 new Dir
,	TokenNameCOMMA	
"d.csf"	TokenNameStringLiteral	d.csf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"d1"	TokenNameStringLiteral	d1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexInput	TokenNameIdentifier	 Index Input
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
csr	TokenNameIdentifier	 csr
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"d1"	TokenNameStringLiteral	d1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameStreams	TokenNameIdentifier	 assert Same Streams
(	TokenNameLPAREN	
"d1"	TokenNameStringLiteral	d1
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSameSeekBehavior	TokenNameIdentifier	 assert Same Seek Behavior
(	TokenNameLPAREN	
"d1"	TokenNameStringLiteral	d1
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
csr	TokenNameIdentifier	 csr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newDir	TokenNameIdentifier	 new Dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make sure we don't somehow use more than 1 descriptor 	TokenNameCOMMENT_LINE	Make sure we don't somehow use more than 1 descriptor 
// when reading a CFS with many subs: 	TokenNameCOMMENT_LINE	when reading a CFS with many subs: 
public	TokenNamepublic	
void	TokenNamevoid	
testManySubFiles	TokenNameIdentifier	 test Many Sub Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
newFSDirectory	TokenNameIdentifier	 new FS Directory
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
getTempDir	TokenNameIdentifier	 get Temp Dir
(	TokenNameLPAREN	
"CFSManySubFiles"	TokenNameStringLiteral	CFSManySubFiles
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
FILE_COUNT	TokenNameIdentifier	 FILE  COUNT
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
fileIdx	TokenNameIdentifier	 file Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fileIdx	TokenNameIdentifier	 file Idx
<	TokenNameLESS	
FILE_COUNT	TokenNameIdentifier	 FILE  COUNT
;	TokenNameSEMICOLON	
fileIdx	TokenNameIdentifier	 file Idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexOutput	TokenNameIdentifier	 Index Output
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
"file."	TokenNameStringLiteral	file.
+	TokenNamePLUS	
fileIdx	TokenNameIdentifier	 file Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
fileIdx	TokenNameIdentifier	 file Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
cfw	TokenNameIdentifier	 cfw
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileWriter	TokenNameIdentifier	 Compound File Writer
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
"c.cfs"	TokenNameStringLiteral	c.cfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
fileIdx	TokenNameIdentifier	 file Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fileIdx	TokenNameIdentifier	 file Idx
<	TokenNameLESS	
FILE_COUNT	TokenNameIdentifier	 FILE  COUNT
;	TokenNameSEMICOLON	
fileIdx	TokenNameIdentifier	 file Idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cfw	TokenNameIdentifier	 cfw
.	TokenNameDOT	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
"file."	TokenNameStringLiteral	file.
+	TokenNamePLUS	
fileIdx	TokenNameIdentifier	 file Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cfw	TokenNameIdentifier	 cfw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexInput	TokenNameIdentifier	 Index Input
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ins	TokenNameIdentifier	 ins
=	TokenNameEQUAL	
new	TokenNamenew	
IndexInput	TokenNameIdentifier	 Index Input
[	TokenNameLBRACKET	
FILE_COUNT	TokenNameIdentifier	 FILE  COUNT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
cfr	TokenNameIdentifier	 cfr
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundFileReader	TokenNameIdentifier	 Compound File Reader
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
"c.cfs"	TokenNameStringLiteral	c.cfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
fileIdx	TokenNameIdentifier	 file Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fileIdx	TokenNameIdentifier	 file Idx
<	TokenNameLESS	
FILE_COUNT	TokenNameIdentifier	 FILE  COUNT
;	TokenNameSEMICOLON	
fileIdx	TokenNameIdentifier	 file Idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ins	TokenNameIdentifier	 ins
[	TokenNameLBRACKET	
fileIdx	TokenNameIdentifier	 file Idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cfr	TokenNameIdentifier	 cfr
.	TokenNameDOT	
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
"file."	TokenNameStringLiteral	file.
+	TokenNamePLUS	
fileIdx	TokenNameIdentifier	 file Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
fileIdx	TokenNameIdentifier	 file Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fileIdx	TokenNameIdentifier	 file Idx
<	TokenNameLESS	
FILE_COUNT	TokenNameIdentifier	 FILE  COUNT
;	TokenNameSEMICOLON	
fileIdx	TokenNameIdentifier	 file Idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
fileIdx	TokenNameIdentifier	 file Idx
,	TokenNameCOMMA	
ins	TokenNameIdentifier	 ins
[	TokenNameLBRACKET	
fileIdx	TokenNameIdentifier	 file Idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
fileIdx	TokenNameIdentifier	 file Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fileIdx	TokenNameIdentifier	 file Idx
<	TokenNameLESS	
FILE_COUNT	TokenNameIdentifier	 FILE  COUNT
;	TokenNameSEMICOLON	
fileIdx	TokenNameIdentifier	 file Idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ins	TokenNameIdentifier	 ins
[	TokenNameLBRACKET	
fileIdx	TokenNameIdentifier	 file Idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cfr	TokenNameIdentifier	 cfr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
