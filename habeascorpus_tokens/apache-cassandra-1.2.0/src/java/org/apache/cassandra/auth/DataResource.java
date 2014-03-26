/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
auth	TokenNameIdentifier	 auth
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Objects	TokenNameIdentifier	 Objects
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
config	TokenNameIdentifier	 config
.	TokenNameDOT	
Schema	TokenNameIdentifier	 Schema
;	TokenNameSEMICOLON	
/** * The primary type of resource in Cassandra. * * Used to represent a column family or a keyspace or the root level "data" resource. * "data" - the root level data resource. * "data/keyspace_name" - keyspace-level data resource. * "data/keyspace_name/column_family_name" - cf-level data resource. */	TokenNameCOMMENT_JAVADOC	 The primary type of resource in Cassandra. * Used to represent a column family or a keyspace or the root level "data" resource. "data" - the root level data resource. "data/keyspace_name" - keyspace-level data resource. "data/keyspace_name/column_family_name" - cf-level data resource. 
public	TokenNamepublic	
class	TokenNameclass	
DataResource	TokenNameIdentifier	 Data Resource
implements	TokenNameimplements	
IResource	TokenNameIdentifier	 I Resource
{	TokenNameLBRACE	
enum	TokenNameenum	
Level	TokenNameIdentifier	 Level
{	TokenNameLBRACE	
ROOT	TokenNameIdentifier	 ROOT
,	TokenNameCOMMA	
KEYSPACE	TokenNameIdentifier	 KEYSPACE
,	TokenNameCOMMA	
COLUMN_FAMILY	TokenNameIdentifier	 COLUMN  FAMILY
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ROOT_NAME	TokenNameIdentifier	 ROOT  NAME
=	TokenNameEQUAL	
"data"	TokenNameStringLiteral	data
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
DataResource	TokenNameIdentifier	 Data Resource
ROOT_RESOURCE	TokenNameIdentifier	 ROOT  RESOURCE
=	TokenNameEQUAL	
new	TokenNamenew	
DataResource	TokenNameIdentifier	 Data Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DataResource	TokenNameIdentifier	 Data Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ROOT	TokenNameIdentifier	 ROOT
;	TokenNameSEMICOLON	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
DataResource	TokenNameIdentifier	 Data Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
KEYSPACE	TokenNameIdentifier	 KEYSPACE
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
DataResource	TokenNameIdentifier	 Data Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
{	TokenNameLBRACE	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
COLUMN_FAMILY	TokenNameIdentifier	 COLUMN  FAMILY
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the root-level resource. */	TokenNameCOMMENT_JAVADOC	 @return the root-level resource. 
public	TokenNamepublic	
static	TokenNamestatic	
DataResource	TokenNameIdentifier	 Data Resource
root	TokenNameIdentifier	 root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ROOT_RESOURCE	TokenNameIdentifier	 ROOT  RESOURCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a DataResource representing a keyspace. * * @param keyspace Name of the keyspace. * @return DataResource instance representing the keyspace. */	TokenNameCOMMENT_JAVADOC	 Creates a DataResource representing a keyspace. * @param keyspace Name of the keyspace. @return DataResource instance representing the keyspace. 
public	TokenNamepublic	
static	TokenNamestatic	
DataResource	TokenNameIdentifier	 Data Resource
keyspace	TokenNameIdentifier	 keyspace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DataResource	TokenNameIdentifier	 Data Resource
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a DataResource instance representing a column family. * * @param keyspace Name of the keyspace. * @param columnFamily Name of the column family. * @return DataResource instance representing the column family. */	TokenNameCOMMENT_JAVADOC	 Creates a DataResource instance representing a column family. * @param keyspace Name of the keyspace. @param columnFamily Name of the column family. @return DataResource instance representing the column family. 
public	TokenNamepublic	
static	TokenNamestatic	
DataResource	TokenNameIdentifier	 Data Resource
columnFamily	TokenNameIdentifier	 column Family
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DataResource	TokenNameIdentifier	 Data Resource
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a data resource name into a DataResource instance. * * @param name Name of the data resource. * @return DataResource instance matching the name. */	TokenNameCOMMENT_JAVADOC	 Parses a data resource name into a DataResource instance. * @param name Name of the data resource. @return DataResource instance matching the name. 
public	TokenNamepublic	
static	TokenNamestatic	
DataResource	TokenNameIdentifier	 Data Resource
fromName	TokenNameIdentifier	 from Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ROOT_NAME	TokenNameIdentifier	 ROOT  NAME
)	TokenNameRPAREN	
||	TokenNameOR_OR	
parts	TokenNameIdentifier	 parts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s is not a valid data resource name"	TokenNameStringLiteral	%s is not a valid data resource name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
root	TokenNameIdentifier	 root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
keyspace	TokenNameIdentifier	 keyspace
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
columnFamily	TokenNameIdentifier	 column Family
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Printable name of the resource. */	TokenNameCOMMENT_JAVADOC	 @return Printable name of the resource. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ROOT	TokenNameIdentifier	 ROOT
:	TokenNameCOLON	
return	TokenNamereturn	
ROOT_NAME	TokenNameIdentifier	 ROOT  NAME
;	TokenNameSEMICOLON	
case	TokenNamecase	
KEYSPACE	TokenNameIdentifier	 KEYSPACE
:	TokenNameCOLON	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s/%s"	TokenNameStringLiteral	%s/%s
,	TokenNameCOMMA	
ROOT_NAME	TokenNameIdentifier	 ROOT  NAME
,	TokenNameCOMMA	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
COLUMN_FAMILY	TokenNameIdentifier	 COLUMN  FAMILY
:	TokenNameCOLON	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s/%s/%s"	TokenNameStringLiteral	%s/%s/%s
,	TokenNameCOMMA	
ROOT_NAME	TokenNameIdentifier	 ROOT  NAME
,	TokenNameCOMMA	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Parent of the resource, if any. Throws IllegalStateException if it's the root-level resource. */	TokenNameCOMMENT_JAVADOC	 @return Parent of the resource, if any. Throws IllegalStateException if it's the root-level resource. 
public	TokenNamepublic	
IResource	TokenNameIdentifier	 I Resource
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
KEYSPACE	TokenNameIdentifier	 KEYSPACE
:	TokenNameCOLON	
return	TokenNamereturn	
root	TokenNameIdentifier	 root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
COLUMN_FAMILY	TokenNameIdentifier	 COLUMN  FAMILY
:	TokenNameCOLON	
return	TokenNamereturn	
keyspace	TokenNameIdentifier	 keyspace
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Root-level resource can't have a parent"	TokenNameStringLiteral	Root-level resource can't have a parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isRootLevel	TokenNameIdentifier	 is Root Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ROOT	TokenNameIdentifier	 ROOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isKeyspaceLevel	TokenNameIdentifier	 is Keyspace Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
KEYSPACE	TokenNameIdentifier	 KEYSPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isColumnFamilyLevel	TokenNameIdentifier	 is Column Family Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
COLUMN_FAMILY	TokenNameIdentifier	 COLUMN  FAMILY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return keyspace of the resource. Throws IllegalStateException if it's the root-level resource. */	TokenNameCOMMENT_JAVADOC	 @return keyspace of the resource. Throws IllegalStateException if it's the root-level resource. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKeyspace	TokenNameIdentifier	 get Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isRootLevel	TokenNameIdentifier	 is Root Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"ROOT data resource has no keyspace"	TokenNameStringLiteral	ROOT data resource has no keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return column family of the resource. Throws IllegalStateException if it's not a cf-level resource. */	TokenNameCOMMENT_JAVADOC	 @return column family of the resource. Throws IllegalStateException if it's not a cf-level resource. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isColumnFamilyLevel	TokenNameIdentifier	 is Column Family Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s data resource has no column family"	TokenNameStringLiteral	%s data resource has no column family
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Whether or not the resource has a parent in the hierarchy. */	TokenNameCOMMENT_JAVADOC	 @return Whether or not the resource has a parent in the hierarchy. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasParent	TokenNameIdentifier	 has Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
level	TokenNameIdentifier	 level
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ROOT	TokenNameIdentifier	 ROOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Whether or not the resource exists in Cassandra. */	TokenNameCOMMENT_JAVADOC	 @return Whether or not the resource exists in Cassandra. 
public	TokenNamepublic	
boolean	TokenNameboolean	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ROOT	TokenNameIdentifier	 ROOT
:	TokenNameCOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
KEYSPACE	TokenNameIdentifier	 KEYSPACE
:	TokenNameCOLON	
return	TokenNamereturn	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTables	TokenNameIdentifier	 get Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
COLUMN_FAMILY	TokenNameIdentifier	 COLUMN  FAMILY
:	TokenNameCOLON	
return	TokenNamereturn	
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
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
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
switch	TokenNameswitch	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ROOT	TokenNameIdentifier	 ROOT
:	TokenNameCOLON	
return	TokenNamereturn	
"<all keyspaces>"	TokenNameStringLiteral	<all keyspaces>
;	TokenNameSEMICOLON	
case	TokenNamecase	
KEYSPACE	TokenNameIdentifier	 KEYSPACE
:	TokenNameCOLON	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"<keyspace %s>"	TokenNameStringLiteral	<keyspace %s>
,	TokenNameCOMMA	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
COLUMN_FAMILY	TokenNameIdentifier	 COLUMN  FAMILY
:	TokenNameCOLON	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"<table %s.%s>"	TokenNameStringLiteral	<table %s.%s>
,	TokenNameCOMMA	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
DataResource	TokenNameIdentifier	 Data Resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
DataResource	TokenNameIdentifier	 Data Resource
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataResource	TokenNameIdentifier	 Data Resource
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
equal	TokenNameIdentifier	 equal
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
equal	TokenNameIdentifier	 equal
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
equal	TokenNameIdentifier	 equal
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
