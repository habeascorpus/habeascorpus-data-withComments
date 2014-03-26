/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayDataOutput	TokenNameIdentifier	 Byte Array Data Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteStreams	TokenNameIdentifier	 Byte Streams
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessagingService	TokenNameIdentifier	 Messaging Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInputStream	TokenNameIdentifier	 Data Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
AbstractSerializationsTester	TokenNameIdentifier	 Abstract Serializations Tester
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CUR_VER	TokenNameIdentifier	 CUR  VER
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"cassandra.version"	TokenNameStringLiteral	cassandra.version
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
VERSION_MAP	TokenNameIdentifier	 VERSION  MAP
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"0.7"	TokenNameStringLiteral	0.7
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_12	TokenNameIdentifier	 VERSION 12
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// TODO ant doesn't pass this -D up to the test, so it's kind of useless 	TokenNameCOMMENT_LINE	TODO ant doesn't pass this -D up to the test, so it's kind of useless 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
EXECUTE_WRITES	TokenNameIdentifier	 EXECUTE  WRITES
=	TokenNameEQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
"cassandra.test-serialization-writes"	TokenNameStringLiteral	cassandra.test-serialization-writes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
VERSION_MAP	TokenNameIdentifier	 VERSION  MAP
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
CUR_VER	TokenNameIdentifier	 CUR  VER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
void	TokenNamevoid	
testSerializedSize	TokenNameIdentifier	 test Serialized Size
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ByteArrayDataOutput	TokenNameIdentifier	 Byte Array Data Output
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
ByteStreams	TokenNameIdentifier	 Byte Streams
.	TokenNameDOT	
newDataOutput	TokenNameIdentifier	 new Data Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
DataInputStream	TokenNameIdentifier	 Data Input Stream
getInput	TokenNameIdentifier	 get Input
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"test/data/serialization/"	TokenNameStringLiteral	test/data/serialization/
+	TokenNamePLUS	
CUR_VER	TokenNameIdentifier	 CUR  VER
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"test/data/serialization/"	TokenNameStringLiteral	test/data/serialization/
+	TokenNamePLUS	
CUR_VER	TokenNameIdentifier	 CUR  VER
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
