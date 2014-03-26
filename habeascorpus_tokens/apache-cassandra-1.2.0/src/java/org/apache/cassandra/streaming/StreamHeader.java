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
*	TokenNameMULTIPLY	
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
StreamHeader	TokenNameIdentifier	 Stream Header
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
StreamHeader	TokenNameIdentifier	 Stream Header
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
StreamHeaderSerializer	TokenNameIdentifier	 Stream Header Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
/** file being sent on initial stream */	TokenNameCOMMENT_JAVADOC	 file being sent on initial stream 
public	TokenNamepublic	
final	TokenNamefinal	
PendingFile	TokenNameIdentifier	 Pending File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
/** session ID */	TokenNameCOMMENT_JAVADOC	 session ID 
public	TokenNamepublic	
final	TokenNamefinal	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
;	TokenNameSEMICOLON	
/** files to add to the session */	TokenNameCOMMENT_JAVADOC	 files to add to the session 
public	TokenNamepublic	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
pendingFiles	TokenNameIdentifier	 pending Files
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StreamHeader	TokenNameIdentifier	 Stream Header
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
PendingFile	TokenNameIdentifier	 Pending File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StreamHeader	TokenNameIdentifier	 Stream Header
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
PendingFile	TokenNameIdentifier	 Pending File
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
pendingFiles	TokenNameIdentifier	 pending Files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sessionId	TokenNameIdentifier	 session Id
=	TokenNameEQUAL	
sessionId	TokenNameIdentifier	 session Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pendingFiles	TokenNameIdentifier	 pending Files
=	TokenNameEQUAL	
pendingFiles	TokenNameIdentifier	 pending Files
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
StreamHeaderSerializer	TokenNameIdentifier	 Stream Header Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
StreamHeader	TokenNameIdentifier	 Stream Header
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
StreamHeader	TokenNameIdentifier	 Stream Header
sh	TokenNameIdentifier	 sh
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
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
sh	TokenNameIdentifier	 sh
.	TokenNameDOT	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UUIDSerializer	TokenNameIdentifier	 UUID Serializer
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
sh	TokenNameIdentifier	 sh
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
PendingFile	TokenNameIdentifier	 Pending File
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
sh	TokenNameIdentifier	 sh
.	TokenNameDOT	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
sh	TokenNameIdentifier	 sh
.	TokenNameDOT	
pendingFiles	TokenNameIdentifier	 pending Files
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PendingFile	TokenNameIdentifier	 Pending File
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
sh	TokenNameIdentifier	 sh
.	TokenNameDOT	
pendingFiles	TokenNameIdentifier	 pending Files
)	TokenNameRPAREN	
PendingFile	TokenNameIdentifier	 Pending File
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StreamHeader	TokenNameIdentifier	 Stream Header
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
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
PendingFile	TokenNameIdentifier	 Pending File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
PendingFile	TokenNameIdentifier	 Pending File
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
pendingFiles	TokenNameIdentifier	 pending Files
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PendingFile	TokenNameIdentifier	 Pending File
>	TokenNameGREATER	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
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
pendingFiles	TokenNameIdentifier	 pending Files
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
PendingFile	TokenNameIdentifier	 Pending File
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
StreamHeader	TokenNameIdentifier	 Stream Header
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
sessionId	TokenNameIdentifier	 session Id
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
pendingFiles	TokenNameIdentifier	 pending Files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
StreamHeader	TokenNameIdentifier	 Stream Header
sh	TokenNameIdentifier	 sh
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
sh	TokenNameIdentifier	 sh
.	TokenNameDOT	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
sh	TokenNameIdentifier	 sh
.	TokenNameDOT	
sessionId	TokenNameIdentifier	 session Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
PendingFile	TokenNameIdentifier	 Pending File
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
sh	TokenNameIdentifier	 sh
.	TokenNameDOT	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
sh	TokenNameIdentifier	 sh
.	TokenNameDOT	
pendingFiles	TokenNameIdentifier	 pending Files
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
PendingFile	TokenNameIdentifier	 Pending File
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
sh	TokenNameIdentifier	 sh
.	TokenNameDOT	
pendingFiles	TokenNameIdentifier	 pending Files
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
PendingFile	TokenNameIdentifier	 Pending File
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
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
