/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
CfDef	TokenNameIdentifier	 Cf Def
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
IndexOperator	TokenNameIdentifier	 Index Operator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
KsDef	TokenNameIdentifier	 Ks Def
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
StringEscapeUtils	TokenNameIdentifier	 String Escape Utils
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CliUtils	TokenNameIdentifier	 Cli Utils
{	TokenNameLBRACE	
/** * Strips leading and trailing "'" characters, and handles * and escaped characters such as \n, \r, etc. * @param b - string to unescape * @return String - unexspaced string */	TokenNameCOMMENT_JAVADOC	 Strips leading and trailing "'" characters, and handles and escaped characters such as \n, \r, etc. @param b - string to unescape @return String - unexspaced string 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
unescapeSQLString	TokenNameIdentifier	 unescape SQL String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
StringEscapeUtils	TokenNameIdentifier	 String Escape Utils
.	TokenNameDOT	
unescapeJava	TokenNameIdentifier	 unescape Java
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
escapeSQLString	TokenNameIdentifier	 escape SQL String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// single quotes are not escaped in java, need to be for cli 	TokenNameCOMMENT_LINE	single quotes are not escaped in java, need to be for cli 
return	TokenNamereturn	
StringEscapeUtils	TokenNameIdentifier	 String Escape Utils
.	TokenNameDOT	
escapeJava	TokenNameIdentifier	 escape Java
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
,	TokenNameCOMMA	
"\'"	TokenNameStringLiteral	\'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns IndexOperator from string representation * @param operator - string representing IndexOperator (=, >=, >, <, <=) * @return IndexOperator - enum value of IndexOperator or null if not found */	TokenNameCOMMENT_JAVADOC	 Returns IndexOperator from string representation @param operator - string representing IndexOperator (=, >=, >, <, <=) @return IndexOperator - enum value of IndexOperator or null if not found 
public	TokenNamepublic	
static	TokenNamestatic	
IndexOperator	TokenNameIdentifier	 Index Operator
getIndexOperator	TokenNameIdentifier	 get Index Operator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
operator	TokenNameIdentifier	 operator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
operator	TokenNameIdentifier	 operator
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
IndexOperator	TokenNameIdentifier	 Index Operator
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
operator	TokenNameIdentifier	 operator
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
">="	TokenNameStringLiteral	>=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
IndexOperator	TokenNameIdentifier	 Index Operator
.	TokenNameDOT	
GTE	TokenNameIdentifier	 GTE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
operator	TokenNameIdentifier	 operator
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
IndexOperator	TokenNameIdentifier	 Index Operator
.	TokenNameDOT	
GT	TokenNameIdentifier	 GT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
operator	TokenNameIdentifier	 operator
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"<"	TokenNameStringLiteral	<
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
IndexOperator	TokenNameIdentifier	 Index Operator
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
operator	TokenNameIdentifier	 operator
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"<="	TokenNameStringLiteral	<=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
IndexOperator	TokenNameIdentifier	 Index Operator
.	TokenNameDOT	
LTE	TokenNameIdentifier	 LTE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns set of column family names in specified keySpace. * @param keySpace - keyspace definition to get column family names from. * @return Set - column family names */	TokenNameCOMMENT_JAVADOC	 Returns set of column family names in specified keySpace. @param keySpace - keyspace definition to get column family names from. @return Set - column family names 
public	TokenNamepublic	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getCfNamesByKeySpace	TokenNameIdentifier	 get Cf Names By Key Space
(	TokenNameLPAREN	
KsDef	TokenNameIdentifier	 Ks Def
keySpace	TokenNameIdentifier	 key Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CfDef	TokenNameIdentifier	 Cf Def
cfDef	TokenNameIdentifier	 cf Def
:	TokenNameCOLON	
keySpace	TokenNameIdentifier	 key Space
.	TokenNameDOT	
getCf_defs	TokenNameIdentifier	 get Cf defs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cfDef	TokenNameIdentifier	 cf Def
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
names	TokenNameIdentifier	 names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse the statement from cli and return KsDef * * @param keyspaceName - name of the keyspace to lookup * @param keyspaces - List of known keyspaces * * @return metadata about keyspace or null */	TokenNameCOMMENT_JAVADOC	 Parse the statement from cli and return KsDef * @param keyspaceName - name of the keyspace to lookup @param keyspaces - List of known keyspaces * @return metadata about keyspace or null 
public	TokenNamepublic	
static	TokenNamestatic	
KsDef	TokenNameIdentifier	 Ks Def
getKeySpaceDef	TokenNameIdentifier	 get Key Space Def
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspaceName	TokenNameIdentifier	 keyspace Name
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
KsDef	TokenNameIdentifier	 Ks Def
>	TokenNameGREATER	
keyspaces	TokenNameIdentifier	 keyspaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keyspaceName	TokenNameIdentifier	 keyspace Name
=	TokenNameEQUAL	
keyspaceName	TokenNameIdentifier	 keyspace Name
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
KsDef	TokenNameIdentifier	 Ks Def
ksDef	TokenNameIdentifier	 ks Def
:	TokenNameCOLON	
keyspaces	TokenNameIdentifier	 keyspaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ksDef	TokenNameIdentifier	 ks Def
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyspaceName	TokenNameIdentifier	 keyspace Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
ksDef	TokenNameIdentifier	 ks Def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
quote	TokenNameIdentifier	 quote
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"'%s'"	TokenNameStringLiteral	'%s'
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
