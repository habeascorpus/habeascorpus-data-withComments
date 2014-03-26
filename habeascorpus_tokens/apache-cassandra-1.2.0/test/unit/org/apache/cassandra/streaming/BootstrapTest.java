/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
static	TokenNamestatic	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
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
IOException	TokenNameIdentifier	 IO Exception
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
Descriptor	TokenNameIdentifier	 Descriptor
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
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
BootstrapTest	TokenNameIdentifier	 Bootstrap Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testGetNewNames	TokenNameIdentifier	 test Get New Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
fromFilename	TokenNameIdentifier	 from Filename
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Keyspace1-Standard1-ia-500-Data.db"	TokenNameStringLiteral	Keyspace1-Standard1-ia-500-Data.db
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// assert !desc.isLatestVersion; // minimum compatible version -- for now it is the latest as well 	TokenNameCOMMENT_LINE	assert !desc.isLatestVersion; // minimum compatible version -- for now it is the latest as well 
PendingFile	TokenNameIdentifier	 Pending File
inContext	TokenNameIdentifier	 in Context
=	TokenNameEQUAL	
new	TokenNamenew	
PendingFile	TokenNameIdentifier	 Pending File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
"Data.db"	TokenNameStringLiteral	Data.db
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
.	TokenNameDOT	
BOOTSTRAP	TokenNameIdentifier	 BOOTSTRAP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PendingFile	TokenNameIdentifier	 Pending File
outContext	TokenNameIdentifier	 out Context
=	TokenNameEQUAL	
StreamIn	TokenNameIdentifier	 Stream In
.	TokenNameDOT	
getContextMapping	TokenNameIdentifier	 get Context Mapping
(	TokenNameLPAREN	
inContext	TokenNameIdentifier	 in Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// filename and generation are expected to have changed 	TokenNameCOMMENT_LINE	filename and generation are expected to have changed 
assert	TokenNameassert	
!	TokenNameNOT	
inContext	TokenNameIdentifier	 in Context
.	TokenNameDOT	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
outContext	TokenNameIdentifier	 out Context
.	TokenNameDOT	
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nothing else should 	TokenNameCOMMENT_LINE	nothing else should 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
inContext	TokenNameIdentifier	 in Context
.	TokenNameDOT	
component	TokenNameIdentifier	 component
,	TokenNameCOMMA	
outContext	TokenNameIdentifier	 out Context
.	TokenNameDOT	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
ksname	TokenNameIdentifier	 ksname
,	TokenNameCOMMA	
outContext	TokenNameIdentifier	 out Context
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
ksname	TokenNameIdentifier	 ksname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
outContext	TokenNameIdentifier	 out Context
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
outContext	TokenNameIdentifier	 out Context
.	TokenNameDOT	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
