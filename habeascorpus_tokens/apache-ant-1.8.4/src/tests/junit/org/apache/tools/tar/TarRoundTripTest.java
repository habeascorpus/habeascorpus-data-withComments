/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
tar	TokenNameIdentifier	 tar
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TarRoundTripTest	TokenNameIdentifier	 Tar Round Trip Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LONG_NAME	TokenNameIdentifier	 LONG  NAME
=	TokenNameEQUAL	
"this/path/name/contains/more/than/one/hundred/characters/in/order/"	TokenNameStringLiteral	this/path/name/contains/more/than/one/hundred/characters/in/order/
+	TokenNamePLUS	
"to/test/the/GNU/long/file/name/capability/round/tripped"	TokenNameStringLiteral	to/test/the/GNU/long/file/name/capability/round/tripped
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TarRoundTripTest	TokenNameIdentifier	 Tar Round Trip Test
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
/** * test round-tripping long (GNU) entries */	TokenNameCOMMENT_JAVADOC	 test round-tripping long (GNU) entries 
public	TokenNamepublic	
void	TokenNamevoid	
testLongRoundTripping	TokenNameIdentifier	 test Long Round Tripping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TarEntry	TokenNameIdentifier	 Tar Entry
original	TokenNameIdentifier	 original
=	TokenNameEQUAL	
new	TokenNamenew	
TarEntry	TokenNameIdentifier	 Tar Entry
(	TokenNameLPAREN	
LONG_NAME	TokenNameIdentifier	 LONG  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"over 100 chars"	TokenNameStringLiteral	over 100 chars
,	TokenNameCOMMA	
LONG_NAME	TokenNameIdentifier	 LONG  NAME
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"original name"	TokenNameStringLiteral	original name
,	TokenNameCOMMA	
LONG_NAME	TokenNameIdentifier	 LONG  NAME
,	TokenNameCOMMA	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TarOutputStream	TokenNameIdentifier	 Tar Output Stream
tos	TokenNameIdentifier	 tos
=	TokenNameEQUAL	
new	TokenNamenew	
TarOutputStream	TokenNameIdentifier	 Tar Output Stream
(	TokenNameLPAREN	
buff	TokenNameIdentifier	 buff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tos	TokenNameIdentifier	 tos
.	TokenNameDOT	
setLongFileMode	TokenNameIdentifier	 set Long File Mode
(	TokenNameLPAREN	
TarOutputStream	TokenNameIdentifier	 Tar Output Stream
.	TokenNameDOT	
LONGFILE_GNU	TokenNameIdentifier	 LONGFILE  GNU
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tos	TokenNameIdentifier	 tos
.	TokenNameDOT	
putNextEntry	TokenNameIdentifier	 put Next Entry
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tos	TokenNameIdentifier	 tos
.	TokenNameDOT	
closeEntry	TokenNameIdentifier	 close Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tos	TokenNameIdentifier	 tos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TarInputStream	TokenNameIdentifier	 Tar Input Stream
tis	TokenNameIdentifier	 tis
=	TokenNameEQUAL	
new	TokenNamenew	
TarInputStream	TokenNameIdentifier	 Tar Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TarEntry	TokenNameIdentifier	 Tar Entry
tripped	TokenNameIdentifier	 tripped
=	TokenNameEQUAL	
tis	TokenNameIdentifier	 tis
.	TokenNameDOT	
getNextEntry	TokenNameIdentifier	 get Next Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"round-tripped name"	TokenNameStringLiteral	round-tripped name
,	TokenNameCOMMA	
LONG_NAME	TokenNameIdentifier	 LONG  NAME
,	TokenNameCOMMA	
tripped	TokenNameIdentifier	 tripped
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"no more entries"	TokenNameStringLiteral	no more entries
,	TokenNameCOMMA	
tis	TokenNameIdentifier	 tis
.	TokenNameDOT	
getNextEntry	TokenNameIdentifier	 get Next Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tis	TokenNameIdentifier	 tis
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
