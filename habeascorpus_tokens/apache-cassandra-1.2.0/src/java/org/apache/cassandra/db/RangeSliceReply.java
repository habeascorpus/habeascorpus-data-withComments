/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
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
DataOutput	TokenNameIdentifier	 Data Output
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FastByteArrayInputStream	TokenNameIdentifier	 Fast Byte Array Input Stream
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
MessageOut	TokenNameIdentifier	 Message Out
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
public	TokenNamepublic	
class	TokenNameclass	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
RangeSliceReplySerializer	TokenNameIdentifier	 Range Slice Reply Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
RangeSliceReplySerializer	TokenNameIdentifier	 Range Slice Reply Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
rows	TokenNameIdentifier	 rows
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
=	TokenNameEQUAL	
rows	TokenNameIdentifier	 rows
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
>	TokenNameGREATER	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
>	TokenNameGREATER	
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
.	TokenNameDOT	
REQUEST_RESPONSE	TokenNameIdentifier	 REQUEST  RESPONSE
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"RangeSliceReply{"	TokenNameStringLiteral	RangeSliceReply{
+	TokenNamePLUS	
"rows="	TokenNameStringLiteral	rows=
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
rows	TokenNameIdentifier	 rows
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
+	TokenNamePLUS	
'}'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
body	TokenNameIdentifier	 body
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FastByteArrayInputStream	TokenNameIdentifier	 Fast Byte Array Input Stream
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
RangeSliceReplySerializer	TokenNameIdentifier	 Range Slice Reply Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
rsr	TokenNameIdentifier	 rsr
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
rsr	TokenNameIdentifier	 rsr
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Row	TokenNameIdentifier	 Row
row	TokenNameIdentifier	 row
:	TokenNameCOLON	
rsr	TokenNameIdentifier	 rsr
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
Row	TokenNameIdentifier	 Row
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
rowCount	TokenNameIdentifier	 row Count
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
rows	TokenNameIdentifier	 rows
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
(	TokenNameLPAREN	
rowCount	TokenNameIdentifier	 row Count
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
rowCount	TokenNameIdentifier	 row Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Row	TokenNameIdentifier	 Row
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
(	TokenNameLPAREN	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
rsr	TokenNameIdentifier	 rsr
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
rsr	TokenNameIdentifier	 rsr
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Row	TokenNameIdentifier	 Row
row	TokenNameIdentifier	 row
:	TokenNameCOLON	
rsr	TokenNameIdentifier	 rsr
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
Row	TokenNameIdentifier	 Row
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
