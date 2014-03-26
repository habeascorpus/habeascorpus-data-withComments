package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
config	TokenNameIdentifier	 config
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
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
AsciiType	TokenNameIdentifier	 Ascii Type
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
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
UTF8Type	TokenNameIdentifier	 UT F8 Type
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
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
LocalStrategy	TokenNameIdentifier	 Local Strategy
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
NetworkTopologyStrategy	TokenNameIdentifier	 Network Topology Strategy
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
public	TokenNamepublic	
class	TokenNameclass	
ThriftValidationTest	TokenNameIdentifier	 Thrift Validation Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testValidateCommutativeWithStandard	TokenNameIdentifier	 test Validate Commutative With Standard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
ThriftValidation	TokenNameIdentifier	 Thrift Validation
.	TokenNameDOT	
validateColumnFamily	TokenNameIdentifier	 validate Column Family
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testValidateCommutativeWithCounter	TokenNameIdentifier	 test Validate Commutative With Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
ThriftValidation	TokenNameIdentifier	 Thrift Validation
.	TokenNameDOT	
validateColumnFamily	TokenNameIdentifier	 validate Column Family
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Counter1"	TokenNameStringLiteral	Counter1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testColumnNameEqualToKeyAlias	TokenNameIdentifier	 test Column Name Equal To Key Alias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CFMetaData	TokenNameIdentifier	 CF Meta Data
metaData	TokenNameIdentifier	 meta Data
=	TokenNameEQUAL	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getCFMetaData	TokenNameIdentifier	 get CF Meta Data
(	TokenNameLPAREN	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
,	TokenNameCOMMA	
"Standard1"	TokenNameStringLiteral	Standard1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CFMetaData	TokenNameIdentifier	 CF Meta Data
newMetadata	TokenNameIdentifier	 new Metadata
=	TokenNameEQUAL	
metaData	TokenNameIdentifier	 meta Data
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
gotException	TokenNameIdentifier	 got Exception
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// add a key_alias = "id" 	TokenNameCOMMENT_LINE	add a key_alias = "id" 
newMetadata	TokenNameIdentifier	 new Metadata
.	TokenNameDOT	
keyAliases	TokenNameIdentifier	 key Aliases
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
AsciiType	TokenNameIdentifier	 Ascii Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// should not throw IRE here 	TokenNameCOMMENT_LINE	should not throw IRE here 
try	TokenNametry	
{	TokenNameLBRACE	
newMetadata	TokenNameIdentifier	 new Metadata
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gotException	TokenNameIdentifier	 got Exception
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
gotException	TokenNameIdentifier	 got Exception
:	TokenNameCOLON	
"got unexpected ConfigurationException"	TokenNameStringLiteral	got unexpected ConfigurationException
;	TokenNameSEMICOLON	
// add a column with name = "id" 	TokenNameCOMMENT_LINE	add a column with name = "id" 
newMetadata	TokenNameIdentifier	 new Metadata
.	TokenNameDOT	
addColumnDefinition	TokenNameIdentifier	 add Column Definition
(	TokenNameLPAREN	
new	TokenNamenew	
ColumnDefinition	TokenNameIdentifier	 Column Definition
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
,	TokenNameCOMMA	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gotException	TokenNameIdentifier	 got Exception
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
newMetadata	TokenNameIdentifier	 new Metadata
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gotException	TokenNameIdentifier	 got Exception
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
gotException	TokenNameIdentifier	 got Exception
:	TokenNameCOLON	
"expected ConfigurationException but not received."	TokenNameStringLiteral	expected ConfigurationException but not received.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testValidateKsDef	TokenNameIdentifier	 test Validate Ks Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
KsDef	TokenNameIdentifier	 Ks Def
ks_def	TokenNameIdentifier	 ks def
=	TokenNameEQUAL	
new	TokenNamenew	
KsDef	TokenNameIdentifier	 Ks Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"keyspaceValid"	TokenNameStringLiteral	keyspaceValid
)	TokenNameRPAREN	
.	TokenNameDOT	
setStrategy_class	TokenNameIdentifier	 set Strategy class
(	TokenNameLPAREN	
LocalStrategy	TokenNameIdentifier	 Local Strategy
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
gotException	TokenNameIdentifier	 got Exception
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
KSMetaData	TokenNameIdentifier	 KS Meta Data
.	TokenNameDOT	
fromThrift	TokenNameIdentifier	 from Thrift
(	TokenNameLPAREN	
ks_def	TokenNameIdentifier	 ks def
)	TokenNameRPAREN	
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gotException	TokenNameIdentifier	 got Exception
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
gotException	TokenNameIdentifier	 got Exception
:	TokenNameCOLON	
"expected ConfigurationException but not received."	TokenNameStringLiteral	expected ConfigurationException but not received.
;	TokenNameSEMICOLON	
ks_def	TokenNameIdentifier	 ks def
.	TokenNameDOT	
setStrategy_class	TokenNameIdentifier	 set Strategy class
(	TokenNameLPAREN	
LocalStrategy	TokenNameIdentifier	 Local Strategy
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gotException	TokenNameIdentifier	 got Exception
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
KSMetaData	TokenNameIdentifier	 KS Meta Data
.	TokenNameDOT	
fromThrift	TokenNameIdentifier	 from Thrift
(	TokenNameLPAREN	
ks_def	TokenNameIdentifier	 ks def
)	TokenNameRPAREN	
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gotException	TokenNameIdentifier	 got Exception
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
gotException	TokenNameIdentifier	 got Exception
:	TokenNameCOLON	
"expected ConfigurationException but not received."	TokenNameStringLiteral	expected ConfigurationException but not received.
;	TokenNameSEMICOLON	
ks_def	TokenNameIdentifier	 ks def
.	TokenNameDOT	
setStrategy_class	TokenNameIdentifier	 set Strategy class
(	TokenNameLPAREN	
NetworkTopologyStrategy	TokenNameIdentifier	 Network Topology Strategy
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gotException	TokenNameIdentifier	 got Exception
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
KSMetaData	TokenNameIdentifier	 KS Meta Data
.	TokenNameDOT	
fromThrift	TokenNameIdentifier	 from Thrift
(	TokenNameLPAREN	
ks_def	TokenNameIdentifier	 ks def
)	TokenNameRPAREN	
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gotException	TokenNameIdentifier	 got Exception
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
gotException	TokenNameIdentifier	 got Exception
:	TokenNameCOLON	
"got unexpected ConfigurationException"	TokenNameStringLiteral	got unexpected ConfigurationException
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
