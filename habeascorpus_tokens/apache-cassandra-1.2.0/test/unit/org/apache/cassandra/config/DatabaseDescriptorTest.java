/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
.	TokenNameDOT	
Gossiper	TokenNameIdentifier	 Gossiper
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
SimpleStrategy	TokenNameIdentifier	 Simple Strategy
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
MigrationManager	TokenNameIdentifier	 Migration Manager
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DatabaseDescriptorTest	TokenNameIdentifier	 Database Descriptor Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCFMetaDataSerialization	TokenNameIdentifier	 test CF Meta Data Serialization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
// test serialization of all defined test CFs. 	TokenNameCOMMENT_LINE	test serialization of all defined test CFs. 
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
:	TokenNameCOLON	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getNonSystemTables	TokenNameIdentifier	 get Non System Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
:	TokenNameCOLON	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTableMetaData	TokenNameIdentifier	 get Table Meta Data
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfmDupe	TokenNameIdentifier	 cfm Dupe
=	TokenNameEQUAL	
CFMetaData	TokenNameIdentifier	 CF Meta Data
.	TokenNameDOT	
fromThrift	TokenNameIdentifier	 from Thrift
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
toThrift	TokenNameIdentifier	 to Thrift
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cfmDupe	TokenNameIdentifier	 cfm Dupe
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cfmDupe	TokenNameIdentifier	 cfm Dupe
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testKSMetaDataSerialization	TokenNameIdentifier	 test KS Meta Data Serialization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
KSMetaData	TokenNameIdentifier	 KS Meta Data
ksm	TokenNameIdentifier	 ksm
:	TokenNameCOLON	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTableDefinitions	TokenNameIdentifier	 get Table Definitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not testing round-trip on the KsDef via serDe() because maps 	TokenNameCOMMENT_LINE	Not testing round-trip on the KsDef via serDe() because maps 
// cannot be compared in avro. 	TokenNameCOMMENT_LINE	cannot be compared in avro. 
KSMetaData	TokenNameIdentifier	 KS Meta Data
ksmDupe	TokenNameIdentifier	 ksm Dupe
=	TokenNameEQUAL	
KSMetaData	TokenNameIdentifier	 KS Meta Data
.	TokenNameDOT	
fromThrift	TokenNameIdentifier	 from Thrift
(	TokenNameLPAREN	
ksm	TokenNameIdentifier	 ksm
.	TokenNameDOT	
toThrift	TokenNameIdentifier	 to Thrift
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ksmDupe	TokenNameIdentifier	 ksm Dupe
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ksmDupe	TokenNameIdentifier	 ksm Dupe
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ksm	TokenNameIdentifier	 ksm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// this came as a result of CASSANDRA-995 	TokenNameCOMMENT_LINE	this came as a result of CASSANDRA-995 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTransKsMigration	TokenNameIdentifier	 test Trans Ks Migration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
SchemaLoader	TokenNameIdentifier	 Schema Loader
.	TokenNameDOT	
cleanupAndLeaveDirs	TokenNameIdentifier	 cleanup And Leave Dirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
loadSchemas	TokenNameIdentifier	 load Schemas
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getNonSystemTables	TokenNameIdentifier	 get Non System Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// add a few. 	TokenNameCOMMENT_LINE	add a few. 
MigrationManager	TokenNameIdentifier	 Migration Manager
.	TokenNameDOT	
announceNewKeyspace	TokenNameIdentifier	 announce New Keyspace
(	TokenNameLPAREN	
KSMetaData	TokenNameIdentifier	 KS Meta Data
.	TokenNameDOT	
testMetadata	TokenNameIdentifier	 test Metadata
(	TokenNameLPAREN	
"ks0"	TokenNameStringLiteral	ks0
,	TokenNameCOMMA	
SimpleStrategy	TokenNameIdentifier	 Simple Strategy
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
KSMetaData	TokenNameIdentifier	 KS Meta Data
.	TokenNameDOT	
optsWithRF	TokenNameIdentifier	 opts With RF
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MigrationManager	TokenNameIdentifier	 Migration Manager
.	TokenNameDOT	
announceNewKeyspace	TokenNameIdentifier	 announce New Keyspace
(	TokenNameLPAREN	
KSMetaData	TokenNameIdentifier	 KS Meta Data
.	TokenNameDOT	
testMetadata	TokenNameIdentifier	 test Metadata
(	TokenNameLPAREN	
"ks1"	TokenNameStringLiteral	ks1
,	TokenNameCOMMA	
SimpleStrategy	TokenNameIdentifier	 Simple Strategy
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
KSMetaData	TokenNameIdentifier	 KS Meta Data
.	TokenNameDOT	
optsWithRF	TokenNameIdentifier	 opts With RF
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTableDefinition	TokenNameIdentifier	 get Table Definition
(	TokenNameLPAREN	
"ks0"	TokenNameStringLiteral	ks0
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTableDefinition	TokenNameIdentifier	 get Table Definition
(	TokenNameLPAREN	
"ks1"	TokenNameStringLiteral	ks1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
clearTableDefinition	TokenNameIdentifier	 clear Table Definition
(	TokenNameLPAREN	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTableDefinition	TokenNameIdentifier	 get Table Definition
(	TokenNameLPAREN	
"ks0"	TokenNameStringLiteral	ks0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
clearTableDefinition	TokenNameIdentifier	 clear Table Definition
(	TokenNameLPAREN	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTableDefinition	TokenNameIdentifier	 get Table Definition
(	TokenNameLPAREN	
"ks1"	TokenNameStringLiteral	ks1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTableDefinition	TokenNameIdentifier	 get Table Definition
(	TokenNameLPAREN	
"ks0"	TokenNameStringLiteral	ks0
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTableDefinition	TokenNameIdentifier	 get Table Definition
(	TokenNameLPAREN	
"ks1"	TokenNameStringLiteral	ks1
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
loadSchemas	TokenNameIdentifier	 load Schemas
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTableDefinition	TokenNameIdentifier	 get Table Definition
(	TokenNameLPAREN	
"ks0"	TokenNameStringLiteral	ks0
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTableDefinition	TokenNameIdentifier	 get Table Definition
(	TokenNameLPAREN	
"ks1"	TokenNameStringLiteral	ks1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
Gossiper	TokenNameIdentifier	 Gossiper
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
