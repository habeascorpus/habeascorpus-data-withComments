/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
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
UUID	TokenNameIdentifier	 UUID
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
TypeSizes	TokenNameIdentifier	 Type Sizes
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
UUIDSerializer	TokenNameIdentifier	 UUID Serializer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
StreamReply	TokenNameIdentifier	 Stream Reply
{	TokenNameLBRACE	
static	TokenNamestatic	
enum	TokenNameenum	
Status	TokenNameIdentifier	 Status
{	TokenNameLBRACE	
FILE_FINISHED	TokenNameIdentifier	 FILE  FINISHED
,	TokenNameCOMMA	
FILE_RETRY	TokenNameIdentifier	 FILE  RETRY
,	TokenNameCOMMA	
SESSION_FINISHED	TokenNameIdentifier	 SESSION  FINISHED
,	TokenNameCOMMA	
SESSION_FAILURE	TokenNameIdentifier	 SESSION  FAILURE
,	TokenNameCOMMA	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
StreamReply	TokenNameIdentifier	 Stream Reply
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
FileStatusSerializer	TokenNameIdentifier	 File Status Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Status	TokenNameIdentifier	 Status
action	TokenNameIdentifier	 action
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StreamReply	TokenNameIdentifier	 Stream Reply
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
Status	TokenNameIdentifier	 Status
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
action	TokenNameIdentifier	 action
=	TokenNameEQUAL	
action	TokenNameIdentifier	 action
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sessionId	TokenNameIdentifier	 session Id
=	TokenNameEQUAL	
sessionId	TokenNameIdentifier	 session Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
StreamReply	TokenNameIdentifier	 Stream Reply
>	TokenNameGREATER	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
StreamReply	TokenNameIdentifier	 Stream Reply
>	TokenNameGREATER	
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
.	TokenNameDOT	
STREAM_REPLY	TokenNameIdentifier	 STREAM  REPLY
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
"StreamReply("	TokenNameStringLiteral	StreamReply(
+	TokenNamePLUS	
"sessionId="	TokenNameStringLiteral	sessionId=
+	TokenNamePLUS	
sessionId	TokenNameIdentifier	 session Id
+	TokenNamePLUS	
", file='"	TokenNameStringLiteral	, file='
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
'\''	TokenNameCharacterLiteral	
+	TokenNamePLUS	
", action="	TokenNameStringLiteral	, action=
+	TokenNamePLUS	
action	TokenNameIdentifier	 action
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
FileStatusSerializer	TokenNameIdentifier	 File Status Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
StreamReply	TokenNameIdentifier	 Stream Reply
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
StreamReply	TokenNameIdentifier	 Stream Reply
reply	TokenNameIdentifier	 reply
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
UUIDSerializer	TokenNameIdentifier	 UUID Serializer
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StreamReply	TokenNameIdentifier	 Stream Reply
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
=	TokenNameEQUAL	
UUIDSerializer	TokenNameIdentifier	 UUID Serializer
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
targetFile	TokenNameIdentifier	 target File
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Status	TokenNameIdentifier	 Status
action	TokenNameIdentifier	 action
=	TokenNameEQUAL	
Status	TokenNameIdentifier	 Status
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
StreamReply	TokenNameIdentifier	 Stream Reply
(	TokenNameLPAREN	
targetFile	TokenNameIdentifier	 target File
,	TokenNameCOMMA	
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
StreamReply	TokenNameIdentifier	 Stream Reply
reply	TokenNameIdentifier	 reply
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
sessionId	TokenNameIdentifier	 session Id
)	TokenNameRPAREN	
+	TokenNamePLUS	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
+	TokenNamePLUS	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
action	TokenNameIdentifier	 action
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
