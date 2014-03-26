/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
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
FileInputStream	TokenNameIdentifier	 File Input Stream
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
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
;	TokenNameSEMICOLON	
/** * Utiities for serialization tests. * * @author Curt Arnold */	TokenNameCOMMENT_JAVADOC	 Utiities for serialization tests. * @author Curt Arnold 
public	TokenNamepublic	
class	TokenNameclass	
SerializationTestHelper	TokenNameIdentifier	 Serialization Test Helper
{	TokenNameLBRACE	
/** * Private constructor. */	TokenNameCOMMENT_JAVADOC	 Private constructor. 
private	TokenNameprivate	
SerializationTestHelper	TokenNameIdentifier	 Serialization Test Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a clone by serializing object and * deserializing byte stream. * @param obj object to serialize and deserialize. * @return clone * @throws IOException on IO error. * @throws ClassNotFoundException if class not found. */	TokenNameCOMMENT_JAVADOC	 Creates a clone by serializing object and deserializing byte stream. @param obj object to serialize and deserialize. @return clone @throws IOException on IO error. @throws ClassNotFoundException if class not found. 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
serializeClone	TokenNameIdentifier	 serialize Clone
(	TokenNameLPAREN	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
memOut	TokenNameIdentifier	 mem Out
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
objOut	TokenNameIdentifier	 obj Out
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
(	TokenNameLPAREN	
memOut	TokenNameIdentifier	 mem Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
objOut	TokenNameIdentifier	 obj Out
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
objOut	TokenNameIdentifier	 obj Out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
memOut	TokenNameIdentifier	 mem Out
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
objIs	TokenNameIdentifier	 obj Is
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
objIs	TokenNameIdentifier	 obj Is
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deserializes a specified file. * @param witness serialization file, may not be null. * @return deserialized object. * @throws Exception thrown on IO or deserialization exception. */	TokenNameCOMMENT_JAVADOC	 Deserializes a specified file. @param witness serialization file, may not be null. @return deserialized object. @throws Exception thrown on IO or deserialization exception. 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
deserializeStream	TokenNameIdentifier	 deserialize Stream
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
witness	TokenNameIdentifier	 witness
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
fileIs	TokenNameIdentifier	 file Is
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
witness	TokenNameIdentifier	 witness
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
objIs	TokenNameIdentifier	 obj Is
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
(	TokenNameLPAREN	
fileIs	TokenNameIdentifier	 file Is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
objIs	TokenNameIdentifier	 obj Is
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks the serialization of an object against an file * containing the expected serialization. * * @param witness name of file containing expected serialization. * @param obj object to be serialized. * @param skip positions in serialized stream that should not be compared. * @param endCompare position to stop comparison. * @throws Exception thrown on IO or serialization exception. */	TokenNameCOMMENT_JAVADOC	 Checks the serialization of an object against an file containing the expected serialization. * @param witness name of file containing expected serialization. @param obj object to be serialized. @param skip positions in serialized stream that should not be compared. @param endCompare position to stop comparison. @throws Exception thrown on IO or serialization exception. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertSerializationEquals	TokenNameIdentifier	 assert Serialization Equals
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
witness	TokenNameIdentifier	 witness
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
skip	TokenNameIdentifier	 skip
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
endCompare	TokenNameIdentifier	 end Compare
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
memOut	TokenNameIdentifier	 mem Out
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
objOut	TokenNameIdentifier	 obj Out
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
(	TokenNameLPAREN	
memOut	TokenNameIdentifier	 mem Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
objOut	TokenNameIdentifier	 obj Out
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
objOut	TokenNameIdentifier	 obj Out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertStreamEquals	TokenNameIdentifier	 assert Stream Equals
(	TokenNameLPAREN	
witness	TokenNameIdentifier	 witness
,	TokenNameCOMMA	
memOut	TokenNameIdentifier	 mem Out
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
skip	TokenNameIdentifier	 skip
,	TokenNameCOMMA	
endCompare	TokenNameIdentifier	 end Compare
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Asserts the serialized form of an object. * @param witness file name of expected serialization. * @param actual byte array of actual serialization. * @param skip positions to skip comparison. * @param endCompare position to stop comparison. * @throws IOException thrown on IO or serialization exception. */	TokenNameCOMMENT_JAVADOC	 Asserts the serialized form of an object. @param witness file name of expected serialization. @param actual byte array of actual serialization. @param skip positions to skip comparison. @param endCompare position to stop comparison. @throws IOException thrown on IO or serialization exception. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertStreamEquals	TokenNameIdentifier	 assert Stream Equals
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
witness	TokenNameIdentifier	 witness
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
actual	TokenNameIdentifier	 actual
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
skip	TokenNameIdentifier	 skip
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
endCompare	TokenNameIdentifier	 end Compare
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
witnessFile	TokenNameIdentifier	 witness File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
witness	TokenNameIdentifier	 witness
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
witnessFile	TokenNameIdentifier	 witness File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
skipIndex	TokenNameIdentifier	 skip Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
witnessFile	TokenNameIdentifier	 witness File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bytesRead	TokenNameIdentifier	 bytes Read
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytesRead	TokenNameIdentifier	 bytes Read
<	TokenNameLESS	
endCompare	TokenNameIdentifier	 end Compare
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestCase	TokenNameIdentifier	 Test Case
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
bytesRead	TokenNameIdentifier	 bytes Read
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
endScan	TokenNameIdentifier	 end Scan
=	TokenNameEQUAL	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endScan	TokenNameIdentifier	 end Scan
>	TokenNameGREATER	
endCompare	TokenNameIdentifier	 end Compare
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endScan	TokenNameIdentifier	 end Scan
=	TokenNameEQUAL	
endCompare	TokenNameIdentifier	 end Compare
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
endScan	TokenNameIdentifier	 end Scan
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
skipIndex	TokenNameIdentifier	 skip Index
<	TokenNameLESS	
skip	TokenNameIdentifier	 skip
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
skip	TokenNameIdentifier	 skip
[	TokenNameLBRACKET	
skipIndex	TokenNameIdentifier	 skip Index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
skipIndex	TokenNameIdentifier	 skip Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
actual	TokenNameIdentifier	 actual
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestCase	TokenNameIdentifier	 Test Case
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Difference at offset "	TokenNameStringLiteral	Difference at offset 
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// if the file doesn't exist then 	TokenNameCOMMENT_LINE	if the file doesn't exist then 
// assume that we are setting up and need to write it 	TokenNameCOMMENT_LINE	assume that we are setting up and need to write it 
FileOutputStream	TokenNameIdentifier	 File Output Stream
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
witnessFile	TokenNameIdentifier	 witness File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestCase	TokenNameIdentifier	 Test Case
.	TokenNameDOT	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Writing witness file "	TokenNameStringLiteral	Writing witness file 
+	TokenNamePLUS	
witness	TokenNameIdentifier	 witness
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
