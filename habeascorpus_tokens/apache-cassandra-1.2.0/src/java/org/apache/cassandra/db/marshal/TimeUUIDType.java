/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
UUID	TokenNameIdentifier	 UUID
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
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
JdbcTimeUUID	TokenNameIdentifier	 Jdbc Time UUID
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
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
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
public	TokenNamepublic	
class	TokenNameclass	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
extends	TokenNameextends	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
UUID	TokenNameIdentifier	 UUID
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
Pattern	TokenNameIdentifier	 Pattern
regexPattern	TokenNameIdentifier	 regex Pattern
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
"[A-Fa-f0-9]{8}\-[A-Fa-f0-9]{4}\-[A-Fa-f0-9]{4}\-[A-Fa-f0-9]{4}\-[A-Fa-f0-9]{12}"	TokenNameStringLiteral	[A-Fa-f0-9]{8}\-[A-Fa-f0-9]{4}\-[A-Fa-f0-9]{4}\-[A-Fa-f0-9]{4}\-[A-Fa-f0-9]{12}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// singleton 	TokenNameCOMMENT_LINE	singleton 
public	TokenNamepublic	
UUID	TokenNameIdentifier	 UUID
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
JdbcTimeUUID	TokenNameIdentifier	 Jdbc Time UUID
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
JdbcTimeUUID	TokenNameIdentifier	 Jdbc Time UUID
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
compareTimestampBytes	TokenNameIdentifier	 compare Timestamp Bytes
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
return	TokenNamereturn	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
compareTimestampBytes	TokenNameIdentifier	 compare Timestamp Bytes
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
o1Pos	TokenNameIdentifier	 o1 Pos
=	TokenNameEQUAL	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
o2Pos	TokenNameIdentifier	 o2 Pos
=	TokenNameEQUAL	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o1Pos	TokenNameIdentifier	 o1 Pos
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o2Pos	TokenNameIdentifier	 o2 Pos
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o1Pos	TokenNameIdentifier	 o1 Pos
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o2Pos	TokenNameIdentifier	 o2 Pos
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o1Pos	TokenNameIdentifier	 o1 Pos
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o2Pos	TokenNameIdentifier	 o2 Pos
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o1Pos	TokenNameIdentifier	 o1 Pos
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o2Pos	TokenNameIdentifier	 o2 Pos
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o1Pos	TokenNameIdentifier	 o1 Pos
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o2Pos	TokenNameIdentifier	 o2 Pos
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o1Pos	TokenNameIdentifier	 o1 Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o2Pos	TokenNameIdentifier	 o2 Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o1Pos	TokenNameIdentifier	 o1 Pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o2Pos	TokenNameIdentifier	 o2 Pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o1Pos	TokenNameIdentifier	 o1 Pos
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o2Pos	TokenNameIdentifier	 o2 Pos
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
JdbcTimeUUID	TokenNameIdentifier	 Jdbc Time UUID
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
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
MarshalException	TokenNameIdentifier	 Marshal Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
{	TokenNameLBRACE	
// Return an empty ByteBuffer for an empty string. 	TokenNameCOMMENT_LINE	Return an empty ByteBuffer for an empty string. 
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
idBytes	TokenNameIdentifier	 id Bytes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// ffffffff-ffff-ffff-ffff-ffffffffff 	TokenNameCOMMENT_LINE	ffffffff-ffff-ffff-ffff-ffffffffff 
if	TokenNameif	
(	TokenNameLPAREN	
regexPattern	TokenNameIdentifier	 regex Pattern
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
uuid	TokenNameIdentifier	 uuid
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
uuid	TokenNameIdentifier	 uuid
=	TokenNameEQUAL	
UUID	TokenNameIdentifier	 UUID
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idBytes	TokenNameIdentifier	 id Bytes
=	TokenNameEQUAL	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"unable to make UUID from '%s'"	TokenNameStringLiteral	unable to make UUID from '%s'
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uuid	TokenNameIdentifier	 uuid
.	TokenNameDOT	
version	TokenNameIdentifier	 version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
"TimeUUID supports only version 1 UUIDs"	TokenNameStringLiteral	TimeUUID supports only version 1 UUIDs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
idBytes	TokenNameIdentifier	 id Bytes
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
UUIDGen	TokenNameIdentifier	 UUID Gen
.	TokenNameDOT	
getTimeUUIDBytes	TokenNameIdentifier	 get Time UUID Bytes
(	TokenNameLPAREN	
DateType	TokenNameIdentifier	 Date Type
.	TokenNameDOT	
dateStringToTimestamp	TokenNameIdentifier	 date String To Timestamp
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
idBytes	TokenNameIdentifier	 id Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
16	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"TimeUUID should be 16 or 0 bytes (%d)"	TokenNameStringLiteral	TimeUUID should be 16 or 0 bytes (%d)
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
slice	TokenNameIdentifier	 slice
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
slice	TokenNameIdentifier	 slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// version is bits 4-7 of byte 6. 	TokenNameCOMMENT_LINE	version is bits 4-7 of byte 6. 
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
slice	TokenNameIdentifier	 slice
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
slice	TokenNameIdentifier	 slice
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xf0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0x10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
"Invalid version for TimeUUID type."	TokenNameStringLiteral	Invalid version for TimeUUID type.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
