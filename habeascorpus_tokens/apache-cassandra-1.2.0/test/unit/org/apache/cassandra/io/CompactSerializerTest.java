package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
SchemaLoader	TokenNameIdentifier	 Schema Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
BeforeClass	TokenNameIdentifier	 Before Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
ParameterizedType	TokenNameIdentifier	 Parameterized Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
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
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CompactSerializerTest	TokenNameIdentifier	 Compact Serializer Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
expectedClassNames	TokenNameIdentifier	 expected Class Names
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
discoveredClassNames	TokenNameIdentifier	 discovered Class Names
;	TokenNameSEMICOLON	
@	TokenNameAT	
BeforeClass	TokenNameIdentifier	 Before Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
scanClasspath	TokenNameIdentifier	 scan Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectedClassNames	TokenNameIdentifier	 expected Class Names
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"RangeSliceCommandSerializer"	TokenNameStringLiteral	RangeSliceCommandSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"IndexScanCommandSerializer"	TokenNameStringLiteral	IndexScanCommandSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"ReadCommandSerializer"	TokenNameStringLiteral	ReadCommandSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"ReadResponseSerializer"	TokenNameStringLiteral	ReadResponseSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"RowSerializer"	TokenNameStringLiteral	RowSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"RowMutationSerializer"	TokenNameStringLiteral	RowMutationSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"SliceByNamesReadCommandSerializer"	TokenNameStringLiteral	SliceByNamesReadCommandSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"SliceFromReadCommandSerializer"	TokenNameStringLiteral	SliceFromReadCommandSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"TruncateResponseSerializer"	TokenNameStringLiteral	TruncateResponseSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"TruncationSerializer"	TokenNameStringLiteral	TruncationSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"WriteResponseSerializer"	TokenNameStringLiteral	WriteResponseSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"EndpointStateSerializer"	TokenNameStringLiteral	EndpointStateSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"GossipDigestSerializer"	TokenNameStringLiteral	GossipDigestSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"GossipDigestAck2Serializer"	TokenNameStringLiteral	GossipDigestAck2Serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"GossipDigestAckSerializer"	TokenNameStringLiteral	GossipDigestAckSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"GossipDigestSynSerializer"	TokenNameStringLiteral	GossipDigestSynSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"HeartBeatStateSerializer"	TokenNameStringLiteral	HeartBeatStateSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"VersionedValueSerializer"	TokenNameStringLiteral	VersionedValueSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"PendingFileSerializer"	TokenNameStringLiteral	PendingFileSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"StreamHeaderSerializer"	TokenNameStringLiteral	StreamHeaderSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"FileStatusSerializer"	TokenNameStringLiteral	FileStatusSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"StreamRequestSerializer"	TokenNameStringLiteral	StreamRequestSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"CounterMutationSerializer"	TokenNameStringLiteral	CounterMutationSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"HashableSerializer"	TokenNameStringLiteral	HashableSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"StreamingRepairTaskSerializer"	TokenNameStringLiteral	StreamingRepairTaskSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"AbstractBoundsSerializer"	TokenNameStringLiteral	AbstractBoundsSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"SnapshotCommandSerializer"	TokenNameStringLiteral	SnapshotCommandSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"RangeSliceReplySerializer"	TokenNameStringLiteral	RangeSliceReplySerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"StringSerializer"	TokenNameStringLiteral	StringSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"CallbackDeterminedSerializer"	TokenNameStringLiteral	CallbackDeterminedSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"TreeRequestSerializer"	TokenNameStringLiteral	TreeRequestSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"ValidatorSerializer"	TokenNameStringLiteral	ValidatorSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"MigrationsSerializer"	TokenNameStringLiteral	MigrationsSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"InnerSerializer"	TokenNameStringLiteral	InnerSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"LeafSerializer"	TokenNameStringLiteral	LeafSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"MerkleTreeSerializer"	TokenNameStringLiteral	MerkleTreeSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"UUIDSerializer"	TokenNameStringLiteral	UUIDSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"Serializer"	TokenNameStringLiteral	Serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"ColumnFamilySerializer"	TokenNameStringLiteral	ColumnFamilySerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"CompressionInfoSerializer"	TokenNameStringLiteral	CompressionInfoSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"ChunkSerializer"	TokenNameStringLiteral	ChunkSerializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
discoveredClassNames	TokenNameIdentifier	 discovered Class Names
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.class.path"	TokenNameStringLiteral	java.class.path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cp	TokenNameIdentifier	 cp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparator	TokenNameIdentifier	 path Separator
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
class	TokenNameclass	
DirScanner	TokenNameIdentifier	 Dir Scanner
{	TokenNameLBRACE	
void	TokenNamevoid	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
newCtx	TokenNameIdentifier	 new Ctx
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"org"	TokenNameStringLiteral	org
)	TokenNameRPAREN	
?	TokenNameQUESTION	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
:	TokenNameCOLON	
ctx	TokenNameIdentifier	 ctx
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
child	TokenNameIdentifier	 child
:	TokenNameCOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
newCtx	TokenNameIdentifier	 new Ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fName	TokenNameIdentifier	 f Name
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
fName	TokenNameIdentifier	 f Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fName	TokenNameIdentifier	 f Name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
simpleName	TokenNameIdentifier	 simple Name
=	TokenNameEQUAL	
cls	TokenNameIdentifier	 cls
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classTraversal	TokenNameIdentifier	 class Traversal
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
cls	TokenNameIdentifier	 cls
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Type	TokenNameIdentifier	 Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
interfaces	TokenNameIdentifier	 interfaces
=	TokenNameEQUAL	
cls	TokenNameIdentifier	 cls
.	TokenNameDOT	
getGenericInterfaces	TokenNameIdentifier	 get Generic Interfaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
interfaces	TokenNameIdentifier	 interfaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
ParameterizedType	TokenNameIdentifier	 Parameterized Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ParameterizedType	TokenNameIdentifier	 Parameterized Type
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ParameterizedType	TokenNameIdentifier	 Parameterized Type
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
getRawType	TokenNameIdentifier	 get Raw Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"IVersionedSerializer"	TokenNameStringLiteral	IVersionedSerializer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
discoveredClassNames	TokenNameIdentifier	 discovered Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
simpleName	TokenNameIdentifier	 simple Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
classTraversal	TokenNameIdentifier	 class Traversal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
cls	TokenNameIdentifier	 cls
.	TokenNameDOT	
getSuperclass	TokenNameIdentifier	 get Superclass
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
DirScanner	TokenNameIdentifier	 Dir Scanner
dirScanner	TokenNameIdentifier	 dir Scanner
=	TokenNameEQUAL	
new	TokenNamenew	
DirScanner	TokenNameIdentifier	 Dir Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cpItem	TokenNameIdentifier	 cp Item
:	TokenNameCOLON	
parts	TokenNameIdentifier	 parts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
cpItem	TokenNameIdentifier	 cp Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
dirScanner	TokenNameIdentifier	 dir Scanner
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** look for classes I expect to find. */	TokenNameCOMMENT_JAVADOC	 look for classes I expect to find. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
verifyAllSimpleNamesTest	TokenNameIdentifier	 verify All Simple Names Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
clsName	TokenNameIdentifier	 cls Name
:	TokenNameCOLON	
expectedClassNames	TokenNameIdentifier	 expected Class Names
)	TokenNameRPAREN	
assert	TokenNameassert	
discoveredClassNames	TokenNameIdentifier	 discovered Class Names
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
clsName	TokenNameIdentifier	 cls Name
)	TokenNameRPAREN	
:	TokenNameCOLON	
clsName	TokenNameIdentifier	 cls Name
+	TokenNamePLUS	
" was not discovered"	TokenNameStringLiteral	 was not discovered
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** look for classes I do not expect to find. */	TokenNameCOMMENT_JAVADOC	 look for classes I do not expect to find. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
noOthersTest	TokenNameIdentifier	 no Others Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
clsName	TokenNameIdentifier	 cls Name
:	TokenNameCOLON	
discoveredClassNames	TokenNameIdentifier	 discovered Class Names
)	TokenNameRPAREN	
assert	TokenNameassert	
expectedClassNames	TokenNameIdentifier	 expected Class Names
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
clsName	TokenNameIdentifier	 cls Name
)	TokenNameRPAREN	
:	TokenNameCOLON	
clsName	TokenNameIdentifier	 cls Name
+	TokenNamePLUS	
" was discovered"	TokenNameStringLiteral	 was discovered
;	TokenNameSEMICOLON	
assert	TokenNameassert	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
