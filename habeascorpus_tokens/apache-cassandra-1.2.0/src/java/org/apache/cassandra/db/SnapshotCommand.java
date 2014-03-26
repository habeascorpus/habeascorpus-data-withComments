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
public	TokenNamepublic	
class	TokenNameclass	
SnapshotCommand	TokenNameIdentifier	 Snapshot Command
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SnapshotCommandSerializer	TokenNameIdentifier	 Snapshot Command Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
SnapshotCommandSerializer	TokenNameIdentifier	 Snapshot Command Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
column_family	TokenNameIdentifier	 column family
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
snapshot_name	TokenNameIdentifier	 snapshot name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
clear_snapshot	TokenNameIdentifier	 clear snapshot
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SnapshotCommand	TokenNameIdentifier	 Snapshot Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
snapshotName	TokenNameIdentifier	 snapshot Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
clearSnapshot	TokenNameIdentifier	 clear Snapshot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
column_family	TokenNameIdentifier	 column family
=	TokenNameEQUAL	
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
snapshot_name	TokenNameIdentifier	 snapshot name
=	TokenNameEQUAL	
snapshotName	TokenNameIdentifier	 snapshot Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clear_snapshot	TokenNameIdentifier	 clear snapshot
=	TokenNameEQUAL	
clearSnapshot	TokenNameIdentifier	 clear Snapshot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MessageOut	TokenNameIdentifier	 Message Out
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
SnapshotCommand	TokenNameIdentifier	 Snapshot Command
>	TokenNameGREATER	
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
.	TokenNameDOT	
SNAPSHOT	TokenNameIdentifier	 SNAPSHOT
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
"SnapshotCommand{"	TokenNameStringLiteral	SnapshotCommand{
+	TokenNamePLUS	
"keyspace='"	TokenNameStringLiteral	keyspace='
+	TokenNamePLUS	
keyspace	TokenNameIdentifier	 keyspace
+	TokenNamePLUS	
'\''	TokenNameCharacterLiteral	
+	TokenNamePLUS	
", column_family='"	TokenNameStringLiteral	, column_family='
+	TokenNamePLUS	
column_family	TokenNameIdentifier	 column family
+	TokenNamePLUS	
'\''	TokenNameCharacterLiteral	
+	TokenNamePLUS	
", snapshot_name="	TokenNameStringLiteral	, snapshot_name=
+	TokenNamePLUS	
snapshot_name	TokenNameIdentifier	 snapshot name
+	TokenNamePLUS	
", clear_snapshot="	TokenNameStringLiteral	, clear_snapshot=
+	TokenNamePLUS	
clear_snapshot	TokenNameIdentifier	 clear snapshot
+	TokenNamePLUS	
'}'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
SnapshotCommandSerializer	TokenNameIdentifier	 Snapshot Command Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
SnapshotCommand	TokenNameIdentifier	 Snapshot Command
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
SnapshotCommand	TokenNameIdentifier	 Snapshot Command
snapshot_command	TokenNameIdentifier	 snapshot command
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
snapshot_command	TokenNameIdentifier	 snapshot command
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
snapshot_command	TokenNameIdentifier	 snapshot command
.	TokenNameDOT	
column_family	TokenNameIdentifier	 column family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
snapshot_command	TokenNameIdentifier	 snapshot command
.	TokenNameDOT	
snapshot_name	TokenNameIdentifier	 snapshot name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeBoolean	TokenNameIdentifier	 write Boolean
(	TokenNameLPAREN	
snapshot_command	TokenNameIdentifier	 snapshot command
.	TokenNameDOT	
clear_snapshot	TokenNameIdentifier	 clear snapshot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SnapshotCommand	TokenNameIdentifier	 Snapshot Command
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
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
column_family	TokenNameIdentifier	 column family
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
snapshot_name	TokenNameIdentifier	 snapshot name
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
clear_snapshot	TokenNameIdentifier	 clear snapshot
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readBoolean	TokenNameIdentifier	 read Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SnapshotCommand	TokenNameIdentifier	 Snapshot Command
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
column_family	TokenNameIdentifier	 column family
,	TokenNameCOMMA	
snapshot_name	TokenNameIdentifier	 snapshot name
,	TokenNameCOMMA	
clear_snapshot	TokenNameIdentifier	 clear snapshot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
SnapshotCommand	TokenNameIdentifier	 Snapshot Command
sc	TokenNameIdentifier	 sc
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
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
+	TokenNamePLUS	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
column_family	TokenNameIdentifier	 column family
)	TokenNameRPAREN	
+	TokenNamePLUS	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
snapshot_name	TokenNameIdentifier	 snapshot name
)	TokenNameRPAREN	
+	TokenNamePLUS	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
clear_snapshot	TokenNameIdentifier	 clear snapshot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
