/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
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
config	TokenNameIdentifier	 config
.	TokenNameDOT	
KSMetaData	TokenNameIdentifier	 KS Meta Data
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
KSPropDefs	TokenNameIdentifier	 KS Prop Defs
extends	TokenNameextends	
PropertyDefinitions	TokenNameIdentifier	 Property Definitions
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KW_DURABLE_WRITES	TokenNameIdentifier	 KW  DURABLE  WRITES
=	TokenNameEQUAL	
"durable_writes"	TokenNameStringLiteral	durable_writes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KW_REPLICATION	TokenNameIdentifier	 KW  REPLICATION
=	TokenNameEQUAL	
"replication"	TokenNameStringLiteral	replication
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REPLICATION_STRATEGY_CLASS_KEY	TokenNameIdentifier	 REPLICATION  STRATEGY  CLASS  KEY
=	TokenNameEQUAL	
"class"	TokenNameStringLiteral	class
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
keywords	TokenNameIdentifier	 keywords
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
obsoleteKeywords	TokenNameIdentifier	 obsolete Keywords
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
keywords	TokenNameIdentifier	 keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
KW_DURABLE_WRITES	TokenNameIdentifier	 KW  DURABLE  WRITES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keywords	TokenNameIdentifier	 keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
KW_REPLICATION	TokenNameIdentifier	 KW  REPLICATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obsoleteKeywords	TokenNameIdentifier	 obsolete Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"strategy_class"	TokenNameStringLiteral	strategy_class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
strategyClass	TokenNameIdentifier	 strategy Class
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
,	TokenNameCOMMA	
SyntaxException	TokenNameIdentifier	 Syntax Exception
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
keywords	TokenNameIdentifier	 keywords
,	TokenNameCOMMA	
obsoleteKeywords	TokenNameIdentifier	 obsolete Keywords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
replicationOptions	TokenNameIdentifier	 replication Options
=	TokenNameEQUAL	
getReplicationOptions	TokenNameIdentifier	 get Replication Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
replicationOptions	TokenNameIdentifier	 replication Options
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
strategyClass	TokenNameIdentifier	 strategy Class
=	TokenNameEQUAL	
replicationOptions	TokenNameIdentifier	 replication Options
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
REPLICATION_STRATEGY_CLASS_KEY	TokenNameIdentifier	 REPLICATION  STRATEGY  CLASS  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replicationOptions	TokenNameIdentifier	 replication Options
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
REPLICATION_STRATEGY_CLASS_KEY	TokenNameIdentifier	 REPLICATION  STRATEGY  CLASS  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getReplicationOptions	TokenNameIdentifier	 get Replication Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SyntaxException	TokenNameIdentifier	 Syntax Exception
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
replicationOptions	TokenNameIdentifier	 replication Options
=	TokenNameEQUAL	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
KW_REPLICATION	TokenNameIdentifier	 KW  REPLICATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
replicationOptions	TokenNameIdentifier	 replication Options
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
replicationOptions	TokenNameIdentifier	 replication Options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getReplicationStrategyClass	TokenNameIdentifier	 get Replication Strategy Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
strategyClass	TokenNameIdentifier	 strategy Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
KSMetaData	TokenNameIdentifier	 KS Meta Data
asKSMetadata	TokenNameIdentifier	 as KS Metadata
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
KSMetaData	TokenNameIdentifier	 KS Meta Data
.	TokenNameDOT	
newKeyspace	TokenNameIdentifier	 new Keyspace
(	TokenNameLPAREN	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
getReplicationStrategyClass	TokenNameIdentifier	 get Replication Strategy Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getReplicationOptions	TokenNameIdentifier	 get Replication Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
KW_DURABLE_WRITES	TokenNameIdentifier	 KW  DURABLE  WRITES
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
KSMetaData	TokenNameIdentifier	 KS Meta Data
asKSMetadataUpdate	TokenNameIdentifier	 as KS Metadata Update
(	TokenNameLPAREN	
KSMetaData	TokenNameIdentifier	 KS Meta Data
old	TokenNameIdentifier	 old
)	TokenNameRPAREN	
throws	TokenNamethrows	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
sClass	TokenNameIdentifier	 s Class
=	TokenNameEQUAL	
strategyClass	TokenNameIdentifier	 strategy Class
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
sOptions	TokenNameIdentifier	 s Options
=	TokenNameEQUAL	
getReplicationOptions	TokenNameIdentifier	 get Replication Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sClass	TokenNameIdentifier	 s Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sClass	TokenNameIdentifier	 s Class
=	TokenNameEQUAL	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
strategyClass	TokenNameIdentifier	 strategy Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sOptions	TokenNameIdentifier	 s Options
=	TokenNameEQUAL	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
strategyOptions	TokenNameIdentifier	 strategy Options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
KSMetaData	TokenNameIdentifier	 KS Meta Data
.	TokenNameDOT	
newKeyspace	TokenNameIdentifier	 new Keyspace
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
sClass	TokenNameIdentifier	 s Class
,	TokenNameCOMMA	
sOptions	TokenNameIdentifier	 s Options
,	TokenNameCOMMA	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
KW_DURABLE_WRITES	TokenNameIdentifier	 KW  DURABLE  WRITES
,	TokenNameCOMMA	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
durableWrites	TokenNameIdentifier	 durable Writes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
