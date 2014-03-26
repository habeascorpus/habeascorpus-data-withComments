/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
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
TypeParser	TokenNameIdentifier	 Type Parser
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
.	TokenNameDOT	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
AlterTableStatement	TokenNameIdentifier	 Alter Table Statement
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
OperationType	TokenNameIdentifier	 Operation Type
{	TokenNameLBRACE	
ADD	TokenNameIdentifier	 ADD
,	TokenNameCOMMA	
ALTER	TokenNameIdentifier	 ALTER
,	TokenNameCOMMA	
DROP	TokenNameIdentifier	 DROP
,	TokenNameCOMMA	
OPTS	TokenNameIdentifier	 OPTS
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
OperationType	TokenNameIdentifier	 Operation Type
oType	TokenNameIdentifier	 o Type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
columnName	TokenNameIdentifier	 column Name
,	TokenNameCOMMA	
validator	TokenNameIdentifier	 validator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
cfProps	TokenNameIdentifier	 cf Props
=	TokenNameEQUAL	
new	TokenNamenew	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AlterTableStatement	TokenNameIdentifier	 Alter Table Statement
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
columnName	TokenNameIdentifier	 column Name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AlterTableStatement	TokenNameIdentifier	 Alter Table Statement
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnName	TokenNameIdentifier	 column Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
validator	TokenNameIdentifier	 validator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
columnName	TokenNameIdentifier	 column Name
,	TokenNameCOMMA	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AlterTableStatement	TokenNameIdentifier	 Alter Table Statement
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnName	TokenNameIdentifier	 column Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
propertyMap	TokenNameIdentifier	 property Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
oType	TokenNameIdentifier	 o Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columnName	TokenNameIdentifier	 column Name
=	TokenNameEQUAL	
columnName	TokenNameIdentifier	 column Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
validator	TokenNameIdentifier	 validator
=	TokenNameEQUAL	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
validator	TokenNameIdentifier	 validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// used only for ADD/ALTER commands 	TokenNameCOMMENT_LINE	used only for ADD/ALTER commands 
if	TokenNameif	
(	TokenNameLPAREN	
propertyMap	TokenNameIdentifier	 property Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
prop	TokenNameIdentifier	 prop
:	TokenNameCOLON	
propertyMap	TokenNameIdentifier	 property Map
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
addProperty	TokenNameIdentifier	 add Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
CFMetaData	TokenNameIdentifier	 CF Meta Data
getCFMetaData	TokenNameIdentifier	 get CF Meta Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
,	TokenNameCOMMA	
SyntaxException	TokenNameIdentifier	 Syntax Exception
{	TokenNameLBRACE	
CFMetaData	TokenNameIdentifier	 CF Meta Data
meta	TokenNameIdentifier	 meta
=	TokenNameEQUAL	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getCFMetaData	TokenNameIdentifier	 get CF Meta Data
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
=	TokenNameEQUAL	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
columnName	TokenNameIdentifier	 column Name
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
oType	TokenNameIdentifier	 o Type
==	TokenNameEQUAL_EQUAL	
OperationType	TokenNameIdentifier	 Operation Type
.	TokenNameDOT	
OPTS	TokenNameIdentifier	 OPTS
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
oType	TokenNameIdentifier	 o Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ADD	TokenNameIdentifier	 ADD
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getKeyAliases	TokenNameIdentifier	 get Key Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getKeyAliases	TokenNameIdentifier	 get Key Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Invalid column name: "	TokenNameStringLiteral	Invalid column name: 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
columnName	TokenNameIdentifier	 column Name
+	TokenNamePLUS	
", because it equals to a key alias."	TokenNameStringLiteral	, because it equals to a key alias.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
addColumnDefinition	TokenNameIdentifier	 add Column Definition
(	TokenNameLPAREN	
new	TokenNamenew	
ColumnDefinition	TokenNameIdentifier	 Column Definition
(	TokenNameLPAREN	
columnName	TokenNameIdentifier	 column Name
,	TokenNameCOMMA	
TypeParser	TokenNameIdentifier	 Type Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
validator	TokenNameIdentifier	 validator
)	TokenNameRPAREN	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ALTER	TokenNameIdentifier	 ALTER
:	TokenNameCOLON	
// We only look for the first key alias which is ok for CQL2 	TokenNameCOMMENT_LINE	We only look for the first key alias which is ok for CQL2 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getKeyAliases	TokenNameIdentifier	 get Key Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getKeyAliases	TokenNameIdentifier	 get Key Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
keyValidator	TokenNameIdentifier	 key Validator
(	TokenNameLPAREN	
TypeParser	TokenNameIdentifier	 Type Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
validator	TokenNameIdentifier	 validator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ColumnDefinition	TokenNameIdentifier	 Column Definition
toUpdate	TokenNameIdentifier	 to Update
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ColumnDefinition	TokenNameIdentifier	 Column Definition
columnDef	TokenNameIdentifier	 column Def
:	TokenNameCOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumn_metadata	TokenNameIdentifier	 get Column metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
columnDef	TokenNameIdentifier	 column Def
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toUpdate	TokenNameIdentifier	 to Update
=	TokenNameEQUAL	
columnDef	TokenNameIdentifier	 column Def
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toUpdate	TokenNameIdentifier	 to Update
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Column '%s' was not found in CF '%s'"	TokenNameStringLiteral	Column '%s' was not found in CF '%s'
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
columnName	TokenNameIdentifier	 column Name
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toUpdate	TokenNameIdentifier	 to Update
.	TokenNameDOT	
setValidator	TokenNameIdentifier	 set Validator
(	TokenNameLPAREN	
TypeParser	TokenNameIdentifier	 Type Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
validator	TokenNameIdentifier	 validator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DROP	TokenNameIdentifier	 DROP
:	TokenNameCOLON	
ColumnDefinition	TokenNameIdentifier	 Column Definition
toDelete	TokenNameIdentifier	 to Delete
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ColumnDefinition	TokenNameIdentifier	 Column Definition
columnDef	TokenNameIdentifier	 column Def
:	TokenNameCOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumn_metadata	TokenNameIdentifier	 get Column metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
columnDef	TokenNameIdentifier	 column Def
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toDelete	TokenNameIdentifier	 to Delete
=	TokenNameEQUAL	
columnDef	TokenNameIdentifier	 column Def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toDelete	TokenNameIdentifier	 to Delete
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Column '%s' was not found in CF '%s'"	TokenNameStringLiteral	Column '%s' was not found in CF '%s'
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
columnName	TokenNameIdentifier	 column Name
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
removeColumnDefinition	TokenNameIdentifier	 remove Column Definition
(	TokenNameLPAREN	
toDelete	TokenNameIdentifier	 to Delete
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
OPTS	TokenNameIdentifier	 OPTS
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"ALTER COLUMNFAMILY WITH invoked, but no parameters found"	TokenNameStringLiteral	ALTER COLUMNFAMILY WITH invoked, but no parameters found
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
applyPropertiesToCFMetadata	TokenNameIdentifier	 apply Properties To CF Metadata
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
,	TokenNameCOMMA	
cfProps	TokenNameIdentifier	 cf Props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cfm	TokenNameIdentifier	 cfm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"AlterTableStatement(cf=%s, type=%s, column=%s, validator=%s)"	TokenNameStringLiteral	AlterTableStatement(cf=%s, type=%s, column=%s, validator=%s)
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
oType	TokenNameIdentifier	 o Type
,	TokenNameCOMMA	
columnName	TokenNameIdentifier	 column Name
,	TokenNameCOMMA	
validator	TokenNameIdentifier	 validator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
applyPropertiesToCFMetadata	TokenNameIdentifier	 apply Properties To CF Metadata
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
,	TokenNameCOMMA	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
cfProps	TokenNameIdentifier	 cf Props
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
,	TokenNameCOMMA	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
hasProperty	TokenNameIdentifier	 has Property
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_COMPACTION_STRATEGY_CLASS	TokenNameIdentifier	 KW  COMPACTION  STRATEGY  CLASS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
compactionStrategyClass	TokenNameIdentifier	 compaction Strategy Class
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
compactionStrategyClass	TokenNameIdentifier	 compaction Strategy Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
hasProperty	TokenNameIdentifier	 has Property
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_COMPARATOR	TokenNameIdentifier	 KW  COMPARATOR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Can't change CF comparator after creation"	TokenNameStringLiteral	Can't change CF comparator after creation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
hasProperty	TokenNameIdentifier	 has Property
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_COMMENT	TokenNameIdentifier	 KW  COMMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_COMMENT	TokenNameIdentifier	 KW  COMMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
hasProperty	TokenNameIdentifier	 has Property
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_DEFAULTVALIDATION	TokenNameIdentifier	 KW  DEFAULTVALIDATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
defaultValidator	TokenNameIdentifier	 default Validator
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
getValidator	TokenNameIdentifier	 get Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Invalid validation type %s"	TokenNameStringLiteral	Invalid validation type %s
,	TokenNameCOMMA	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_DEFAULTVALIDATION	TokenNameIdentifier	 KW  DEFAULTVALIDATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
readRepairChance	TokenNameIdentifier	 read Repair Chance
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
getPropertyDouble	TokenNameIdentifier	 get Property Double
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_READREPAIRCHANCE	TokenNameIdentifier	 KW  READREPAIRCHANCE
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getReadRepairChance	TokenNameIdentifier	 get Read Repair Chance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
dcLocalReadRepairChance	TokenNameIdentifier	 dc Local Read Repair Chance
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
getPropertyDouble	TokenNameIdentifier	 get Property Double
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_DCLOCALREADREPAIRCHANCE	TokenNameIdentifier	 KW  DCLOCALREADREPAIRCHANCE
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getDcLocalReadRepair	TokenNameIdentifier	 get Dc Local Read Repair
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
gcGraceSeconds	TokenNameIdentifier	 gc Grace Seconds
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
getPropertyInt	TokenNameIdentifier	 get Property Int
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_GCGRACESECONDS	TokenNameIdentifier	 KW  GCGRACESECONDS
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getGcGraceSeconds	TokenNameIdentifier	 get Gc Grace Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
replicateOnWrite	TokenNameIdentifier	 replicate On Write
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
getPropertyBoolean	TokenNameIdentifier	 get Property Boolean
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_REPLICATEONWRITE	TokenNameIdentifier	 KW  REPLICATEONWRITE
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getReplicateOnWrite	TokenNameIdentifier	 get Replicate On Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
minCompactionThreshold	TokenNameIdentifier	 min Compaction Threshold
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
getPropertyInt	TokenNameIdentifier	 get Property Int
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_MINCOMPACTIONTHRESHOLD	TokenNameIdentifier	 KW  MINCOMPACTIONTHRESHOLD
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getMinCompactionThreshold	TokenNameIdentifier	 get Min Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
maxCompactionThreshold	TokenNameIdentifier	 max Compaction Threshold
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
getPropertyInt	TokenNameIdentifier	 get Property Int
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_MAXCOMPACTIONTHRESHOLD	TokenNameIdentifier	 KW  MAXCOMPACTIONTHRESHOLD
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getMaxCompactionThreshold	TokenNameIdentifier	 get Max Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
caching	TokenNameIdentifier	 caching
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
.	TokenNameDOT	
Caching	TokenNameIdentifier	 Caching
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
getPropertyString	TokenNameIdentifier	 get Property String
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_CACHING	TokenNameIdentifier	 KW  CACHING
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getCaching	TokenNameIdentifier	 get Caching
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
bloomFilterFpChance	TokenNameIdentifier	 bloom Filter Fp Chance
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
getPropertyDouble	TokenNameIdentifier	 get Property Double
(	TokenNameLPAREN	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
KW_BF_FP_CHANCE	TokenNameIdentifier	 KW  BF  FP  CHANCE
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getBloomFilterFpChance	TokenNameIdentifier	 get Bloom Filter Fp Chance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
compactionStrategyOptions	TokenNameIdentifier	 compaction Strategy Options
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
compactionStrategyOptions	TokenNameIdentifier	 compaction Strategy Options
(	TokenNameLPAREN	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
compactionStrategyOptions	TokenNameIdentifier	 compaction Strategy Options
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
compactionStrategyOptions	TokenNameIdentifier	 compaction Strategy Options
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
compressionParameters	TokenNameIdentifier	 compression Parameters
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
compressionParameters	TokenNameIdentifier	 compression Parameters
(	TokenNameLPAREN	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
cfProps	TokenNameIdentifier	 cf Props
.	TokenNameDOT	
compressionParameters	TokenNameIdentifier	 compression Parameters
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
