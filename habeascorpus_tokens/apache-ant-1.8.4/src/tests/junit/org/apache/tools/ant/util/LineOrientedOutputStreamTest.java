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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
LineOrientedOutputStreamTest	TokenNameIdentifier	 Line Oriented Output Stream Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
LINE	TokenNameIdentifier	 LINE
=	TokenNameEQUAL	
"This is a line"	TokenNameStringLiteral	This is a line
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DummyStream	TokenNameIdentifier	 Dummy Stream
stream	TokenNameIdentifier	 stream
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LineOrientedOutputStreamTest	TokenNameIdentifier	 Line Oriented Output Stream Test
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
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
DummyStream	TokenNameIdentifier	 Dummy Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLineWithLinefeedArray	TokenNameIdentifier	 test Line With Linefeed Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeByteArray	TokenNameIdentifier	 write Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeAsArray	TokenNameIdentifier	 write As Array
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
assertInvoked	TokenNameIdentifier	 assert Invoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLineWithLinefeedSingleBytes	TokenNameIdentifier	 test Line With Linefeed Single Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeSingleBytes	TokenNameIdentifier	 write Single Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
assertInvoked	TokenNameIdentifier	 assert Invoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLineWithCariagereturnArray	TokenNameIdentifier	 test Line With Cariagereturn Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeByteArray	TokenNameIdentifier	 write Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeAsArray	TokenNameIdentifier	 write As Array
(	TokenNameLPAREN	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
assertInvoked	TokenNameIdentifier	 assert Invoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLineWithCariagereturnSingleBytes	TokenNameIdentifier	 test Line With Cariagereturn Single Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeSingleBytes	TokenNameIdentifier	 write Single Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
assertInvoked	TokenNameIdentifier	 assert Invoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLineWithCariagereturnLinefeedArray	TokenNameIdentifier	 test Line With Cariagereturn Linefeed Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeByteArray	TokenNameIdentifier	 write Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeAsArray	TokenNameIdentifier	 write As Array
(	TokenNameLPAREN	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeAsArray	TokenNameIdentifier	 write As Array
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
assertInvoked	TokenNameIdentifier	 assert Invoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLineWithCariagereturnLinefeedSingleBytes	TokenNameIdentifier	 test Line With Cariagereturn Linefeed Single Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeSingleBytes	TokenNameIdentifier	 write Single Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
assertInvoked	TokenNameIdentifier	 assert Invoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFlushArray	TokenNameIdentifier	 test Flush Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeByteArray	TokenNameIdentifier	 write Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
assertNotInvoked	TokenNameIdentifier	 assert Not Invoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFlushSingleBytes	TokenNameIdentifier	 test Flush Single Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeSingleBytes	TokenNameIdentifier	 write Single Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
assertNotInvoked	TokenNameIdentifier	 assert Not Invoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCloseArray	TokenNameIdentifier	 test Close Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeByteArray	TokenNameIdentifier	 write Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
assertInvoked	TokenNameIdentifier	 assert Invoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCloseSingleBytes	TokenNameIdentifier	 test Close Single Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeSingleBytes	TokenNameIdentifier	 write Single Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
assertInvoked	TokenNameIdentifier	 assert Invoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
writeByteArray	TokenNameIdentifier	 write Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
LINE	TokenNameIdentifier	 LINE
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
LINE	TokenNameIdentifier	 LINE
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
writeSingleBytes	TokenNameIdentifier	 write Single Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
LINE	TokenNameIdentifier	 LINE
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
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
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
writeAsArray	TokenNameIdentifier	 write As Array
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
}	TokenNameRBRACE	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
DummyStream	TokenNameIdentifier	 Dummy Stream
extends	TokenNameextends	
LineOrientedOutputStream	TokenNameIdentifier	 Line Oriented Output Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
invoked	TokenNameIdentifier	 invoked
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
void	TokenNamevoid	
processLine	TokenNameIdentifier	 process Line
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"Only one line"	TokenNameStringLiteral	Only one line
,	TokenNameCOMMA	
invoked	TokenNameIdentifier	 invoked
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
LINE	TokenNameIdentifier	 LINE
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invoked	TokenNameIdentifier	 invoked
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertInvoked	TokenNameIdentifier	 assert Invoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"At least one line"	TokenNameStringLiteral	At least one line
,	TokenNameCOMMA	
invoked	TokenNameIdentifier	 invoked
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertNotInvoked	TokenNameIdentifier	 assert Not Invoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"No output"	TokenNameStringLiteral	No output
,	TokenNameCOMMA	
invoked	TokenNameIdentifier	 invoked
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// LineOrientedOutputStreamTest 	TokenNameCOMMENT_LINE	LineOrientedOutputStreamTest 
