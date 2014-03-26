/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: QueryParameter.java 468638 2006-10-28 06:52:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: QueryParameter.java 468638 2006-10-28 06:52:06Z minchau $ 
/* This class holds a parameter definition for a JDBC PreparedStatement or CallableStatement. */	TokenNameCOMMENT_BLOCK	 This class holds a parameter definition for a JDBC PreparedStatement or CallableStatement. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
lib	TokenNameIdentifier	 lib
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
PreparedStatement	TokenNameIdentifier	 Prepared Statement
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
CallableStatement	TokenNameIdentifier	 Callable Statement
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Statement	TokenNameIdentifier	 Statement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
QueryParameter	TokenNameIdentifier	 Query Parameter
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
m_type	TokenNameIdentifier	 m type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_value	TokenNameIdentifier	 m value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
m_output	TokenNameIdentifier	 m output
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_typeName	TokenNameIdentifier	 m type Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
m_Typetable	TokenNameIdentifier	 m  Typetable
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
QueryParameter	TokenNameIdentifier	 Query Parameter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_type	TokenNameIdentifier	 m type
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_value	TokenNameIdentifier	 m value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_output	TokenNameIdentifier	 m output
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_typeName	TokenNameIdentifier	 m type Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param v The parameter value. * @param t The type of the parameter. */	TokenNameCOMMENT_JAVADOC	 @param v The parameter value. @param t The type of the parameter. 
public	TokenNamepublic	
QueryParameter	TokenNameIdentifier	 Query Parameter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_value	TokenNameIdentifier	 m value
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
m_output	TokenNameIdentifier	 m output
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
setTypeName	TokenNameIdentifier	 set Type Name
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryParameter	TokenNameIdentifier	 Query Parameter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
out_flag	TokenNameIdentifier	 out flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
m_value	TokenNameIdentifier	 m value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
m_output	TokenNameIdentifier	 m output
=	TokenNameEQUAL	
out_flag	TokenNameIdentifier	 out flag
;	TokenNameSEMICOLON	
setTypeName	TokenNameIdentifier	 set Type Name
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_value	TokenNameIdentifier	 m value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param newValue * */	TokenNameCOMMENT_JAVADOC	 @param newValue 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_value	TokenNameIdentifier	 m value
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Used to set the parameter type when the type information is provided in the query. * @param newType The parameter type. * */	TokenNameCOMMENT_JAVADOC	 Used to set the parameter type when the type information is provided in the query. @param newType The parameter type. 
public	TokenNamepublic	
void	TokenNamevoid	
setTypeName	TokenNameIdentifier	 set Type Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newType	TokenNameIdentifier	 new Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_type	TokenNameIdentifier	 m type
=	TokenNameEQUAL	
map_type	TokenNameIdentifier	 map type
(	TokenNameLPAREN	
newType	TokenNameIdentifier	 new Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_typeName	TokenNameIdentifier	 m type Name
=	TokenNameEQUAL	
newType	TokenNameIdentifier	 new Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_typeName	TokenNameIdentifier	 m type Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_type	TokenNameIdentifier	 m type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set Name, this should really be covered in the constructor but the * QueryParser has a State issue where the name is discoverd after the * Parameter object needs to be created */	TokenNameCOMMENT_JAVADOC	 Set Name, this should really be covered in the constructor but the QueryParser has a State issue where the name is discoverd after the Parameter object needs to be created 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
boolean	TokenNameboolean	
isOutput	TokenNameIdentifier	 is Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_output	TokenNameIdentifier	 m output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set Name, this should really be covered in the constructor but the * QueryParser has a State issue where the name is discoverd after the * Parameter object needs to be created */	TokenNameCOMMENT_JAVADOC	 Set Name, this should really be covered in the constructor but the QueryParser has a State issue where the name is discoverd after the Parameter object needs to be created 
public	TokenNamepublic	
void	TokenNamevoid	
setIsOutput	TokenNameIdentifier	 set Is Output
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_output	TokenNameIdentifier	 m output
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
map_type	TokenNameIdentifier	 map type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
typename	TokenNameIdentifier	 typename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_Typetable	TokenNameIdentifier	 m  Typetable
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Load up the type mapping table. 	TokenNameCOMMENT_LINE	Load up the type mapping table. 
m_Typetable	TokenNameIdentifier	 m  Typetable
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BIGINT"	TokenNameStringLiteral	BIGINT
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
BIGINT	TokenNameIdentifier	 BIGINT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BINARY"	TokenNameStringLiteral	BINARY
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
BINARY	TokenNameIdentifier	 BINARY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BIT"	TokenNameStringLiteral	BIT
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
BIT	TokenNameIdentifier	 BIT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CHAR"	TokenNameStringLiteral	CHAR
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
CHAR	TokenNameIdentifier	 CHAR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"DATE"	TokenNameStringLiteral	DATE
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
DATE	TokenNameIdentifier	 DATE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"DECIMAL"	TokenNameStringLiteral	DECIMAL
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
DECIMAL	TokenNameIdentifier	 DECIMAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"DOUBLE"	TokenNameStringLiteral	DOUBLE
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
DOUBLE	TokenNameIdentifier	 DOUBLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"FLOAT"	TokenNameStringLiteral	FLOAT
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"INTEGER"	TokenNameStringLiteral	INTEGER
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
INTEGER	TokenNameIdentifier	 INTEGER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LONGVARBINARY"	TokenNameStringLiteral	LONGVARBINARY
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
LONGVARBINARY	TokenNameIdentifier	 LONGVARBINARY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LONGVARCHAR"	TokenNameStringLiteral	LONGVARCHAR
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
LONGVARCHAR	TokenNameIdentifier	 LONGVARCHAR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"NULL"	TokenNameStringLiteral	NULL
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"NUMERIC"	TokenNameStringLiteral	NUMERIC
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
NUMERIC	TokenNameIdentifier	 NUMERIC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"OTHER"	TokenNameStringLiteral	OTHER
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
OTHER	TokenNameIdentifier	 OTHER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"REAL"	TokenNameStringLiteral	REAL
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
REAL	TokenNameIdentifier	 REAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"SMALLINT"	TokenNameStringLiteral	SMALLINT
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
SMALLINT	TokenNameIdentifier	 SMALLINT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TIME"	TokenNameStringLiteral	TIME
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
TIME	TokenNameIdentifier	 TIME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TIMESTAMP"	TokenNameStringLiteral	TIMESTAMP
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
TIMESTAMP	TokenNameIdentifier	 TIMESTAMP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TINYINT"	TokenNameStringLiteral	TINYINT
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
TINYINT	TokenNameIdentifier	 TINYINT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"VARBINARY"	TokenNameStringLiteral	VARBINARY
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
VARBINARY	TokenNameIdentifier	 VARBINARY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"VARCHAR"	TokenNameStringLiteral	VARCHAR
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
VARCHAR	TokenNameIdentifier	 VARCHAR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Aliases from Xalan SQL extension. 	TokenNameCOMMENT_LINE	Aliases from Xalan SQL extension. 
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"STRING"	TokenNameStringLiteral	STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
VARCHAR	TokenNameIdentifier	 VARCHAR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BIGDECIMAL"	TokenNameStringLiteral	BIGDECIMAL
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
NUMERIC	TokenNameIdentifier	 NUMERIC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BOOLEAN"	TokenNameStringLiteral	BOOLEAN
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
BIT	TokenNameIdentifier	 BIT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BYTES"	TokenNameStringLiteral	BYTES
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
LONGVARBINARY	TokenNameIdentifier	 LONGVARBINARY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LONG"	TokenNameStringLiteral	LONG
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
BIGINT	TokenNameIdentifier	 BIGINT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"SHORT"	TokenNameStringLiteral	SHORT
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
SMALLINT	TokenNameIdentifier	 SMALLINT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Integer	TokenNameIdentifier	 Integer
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
m_Typetable	TokenNameIdentifier	 m  Typetable
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
typename	TokenNameIdentifier	 typename
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
rtype	TokenNameIdentifier	 rtype
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
rtype	TokenNameIdentifier	 rtype
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Types	TokenNameIdentifier	 Types
.	TokenNameDOT	
OTHER	TokenNameIdentifier	 OTHER
;	TokenNameSEMICOLON	
else	TokenNameelse	
rtype	TokenNameIdentifier	 rtype
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
rtype	TokenNameIdentifier	 rtype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This code was in the XConnection, it is included for reference but it * should not be used. * * @TODO Remove this code as soon as it is determined that its Use Case is * resolved elsewhere. */	TokenNameCOMMENT_JAVADOC	 This code was in the XConnection, it is included for reference but it should not be used. * @TODO Remove this code as soon as it is determined that its Use Case is resolved elsewhere. 
/** * Set the parameter for a Prepared Statement * @param pos * @param stmt * @param p * * @throws SQLException */	TokenNameCOMMENT_JAVADOC	 Set the parameter for a Prepared Statement @param pos @param stmt @param p * @throws SQLException 
/* private void setParameter( int pos, PreparedStatement stmt, QueryParameter p )throws SQLException { String type = p.getType(); if (type.equalsIgnoreCase("string")) { stmt.setString(pos, p.getValue()); } if (type.equalsIgnoreCase("bigdecimal")) { stmt.setBigDecimal(pos, new BigDecimal(p.getValue())); } if (type.equalsIgnoreCase("boolean")) { Integer i = new Integer( p.getValue() ); boolean b = ((i.intValue() != 0) ? false : true); stmt.setBoolean(pos, b); } if (type.equalsIgnoreCase("bytes")) { stmt.setBytes(pos, p.getValue().getBytes()); } if (type.equalsIgnoreCase("date")) { stmt.setDate(pos, Date.valueOf(p.getValue())); } if (type.equalsIgnoreCase("double")) { Double d = new Double(p.getValue()); stmt.setDouble(pos, d.doubleValue() ); } if (type.equalsIgnoreCase("float")) { Float f = new Float(p.getValue()); stmt.setFloat(pos, f.floatValue()); } if (type.equalsIgnoreCase("long")) { Long l = new Long(p.getValue()); stmt.setLong(pos, l.longValue()); } if (type.equalsIgnoreCase("short")) { Short s = new Short(p.getValue()); stmt.setShort(pos, s.shortValue()); } if (type.equalsIgnoreCase("time")) { stmt.setTime(pos, Time.valueOf(p.getValue()) ); } if (type.equalsIgnoreCase("timestamp")) { stmt.setTimestamp(pos, Timestamp.valueOf(p.getValue()) ); } } */	TokenNameCOMMENT_BLOCK	 private void setParameter( int pos, PreparedStatement stmt, QueryParameter p )throws SQLException { String type = p.getType(); if (type.equalsIgnoreCase("string")) { stmt.setString(pos, p.getValue()); } if (type.equalsIgnoreCase("bigdecimal")) { stmt.setBigDecimal(pos, new BigDecimal(p.getValue())); } if (type.equalsIgnoreCase("boolean")) { Integer i = new Integer( p.getValue() ); boolean b = ((i.intValue() != 0) ? false : true); stmt.setBoolean(pos, b); } if (type.equalsIgnoreCase("bytes")) { stmt.setBytes(pos, p.getValue().getBytes()); } if (type.equalsIgnoreCase("date")) { stmt.setDate(pos, Date.valueOf(p.getValue())); } if (type.equalsIgnoreCase("double")) { Double d = new Double(p.getValue()); stmt.setDouble(pos, d.doubleValue() ); } if (type.equalsIgnoreCase("float")) { Float f = new Float(p.getValue()); stmt.setFloat(pos, f.floatValue()); } if (type.equalsIgnoreCase("long")) { Long l = new Long(p.getValue()); stmt.setLong(pos, l.longValue()); } if (type.equalsIgnoreCase("short")) { Short s = new Short(p.getValue()); stmt.setShort(pos, s.shortValue()); } if (type.equalsIgnoreCase("time")) { stmt.setTime(pos, Time.valueOf(p.getValue()) ); } if (type.equalsIgnoreCase("timestamp")) { stmt.setTimestamp(pos, Timestamp.valueOf(p.getValue()) ); } } 
}	TokenNameRBRACE	
