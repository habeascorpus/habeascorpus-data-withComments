/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SQLDocument.java 468638 2006-10-28 06:52:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SQLDocument.java 468638 2006-10-28 06:52:06Z minchau $ 
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
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
ExpressionContext	TokenNameIdentifier	 Expression Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMManager	TokenNameIdentifier	 DTM Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Connection	TokenNameIdentifier	 Connection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Statement	TokenNameIdentifier	 Statement
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
ResultSet	TokenNameIdentifier	 Result Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
ResultSetMetaData	TokenNameIdentifier	 Result Set Meta Data
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
SQLException	TokenNameIdentifier	 SQL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * The SQL Document is the main controlling class the executesa SQL Query */	TokenNameCOMMENT_JAVADOC	 The SQL Document is the main controlling class the executesa SQL Query 
public	TokenNamepublic	
class	TokenNameclass	
SQLDocument	TokenNameIdentifier	 SQL Document
extends	TokenNameextends	
DTMDocument	TokenNameIdentifier	 DTM Document
{	TokenNameLBRACE	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
=	TokenNameEQUAL	
"http://xml.apache.org/xalan/SQLExtension"	TokenNameStringLiteral	http://xml.apache.org/xalan/SQLExtension
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_SQL	TokenNameIdentifier	 S  SQL
=	TokenNameEQUAL	
"sql"	TokenNameStringLiteral	sql
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_ROW_SET	TokenNameIdentifier	 S  ROW  SET
=	TokenNameEQUAL	
"row-set"	TokenNameStringLiteral	row-set
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_METADATA	TokenNameIdentifier	 S  METADATA
=	TokenNameEQUAL	
"metadata"	TokenNameStringLiteral	metadata
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_COLUMN_HEADER	TokenNameIdentifier	 S  COLUMN  HEADER
=	TokenNameEQUAL	
"column-header"	TokenNameStringLiteral	column-header
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_ROW	TokenNameIdentifier	 S  ROW
=	TokenNameEQUAL	
"row"	TokenNameStringLiteral	row
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_COL	TokenNameIdentifier	 S  COL
=	TokenNameEQUAL	
"col"	TokenNameStringLiteral	col
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_OUT_PARAMETERS	TokenNameIdentifier	 S  OUT  PARAMETERS
=	TokenNameEQUAL	
"out-parameters"	TokenNameStringLiteral	out-parameters
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_CATALOGUE_NAME	TokenNameIdentifier	 S  CATALOGUE  NAME
=	TokenNameEQUAL	
"catalogue-name"	TokenNameStringLiteral	catalogue-name
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_DISPLAY_SIZE	TokenNameIdentifier	 S  DISPLAY  SIZE
=	TokenNameEQUAL	
"column-display-size"	TokenNameStringLiteral	column-display-size
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_COLUMN_LABEL	TokenNameIdentifier	 S  COLUMN  LABEL
=	TokenNameEQUAL	
"column-label"	TokenNameStringLiteral	column-label
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_COLUMN_NAME	TokenNameIdentifier	 S  COLUMN  NAME
=	TokenNameEQUAL	
"column-name"	TokenNameStringLiteral	column-name
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_COLUMN_TYPE	TokenNameIdentifier	 S  COLUMN  TYPE
=	TokenNameEQUAL	
"column-type"	TokenNameStringLiteral	column-type
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_COLUMN_TYPENAME	TokenNameIdentifier	 S  COLUMN  TYPENAME
=	TokenNameEQUAL	
"column-typename"	TokenNameStringLiteral	column-typename
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_PRECISION	TokenNameIdentifier	 S  PRECISION
=	TokenNameEQUAL	
"precision"	TokenNameStringLiteral	precision
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_SCALE	TokenNameIdentifier	 S  SCALE
=	TokenNameEQUAL	
"scale"	TokenNameStringLiteral	scale
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_SCHEMA_NAME	TokenNameIdentifier	 S  SCHEMA  NAME
=	TokenNameEQUAL	
"schema-name"	TokenNameStringLiteral	schema-name
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_TABLE_NAME	TokenNameIdentifier	 S  TABLE  NAME
=	TokenNameEQUAL	
"table-name"	TokenNameStringLiteral	table-name
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_CASESENSITIVE	TokenNameIdentifier	 S  CASESENSITIVE
=	TokenNameEQUAL	
"case-sensitive"	TokenNameStringLiteral	case-sensitive
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_DEFINITELYWRITABLE	TokenNameIdentifier	 S  DEFINITELYWRITABLE
=	TokenNameEQUAL	
"definitely-writable"	TokenNameStringLiteral	definitely-writable
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_ISNULLABLE	TokenNameIdentifier	 S  ISNULLABLE
=	TokenNameEQUAL	
"nullable"	TokenNameStringLiteral	nullable
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_ISSIGNED	TokenNameIdentifier	 S  ISSIGNED
=	TokenNameEQUAL	
"signed"	TokenNameStringLiteral	signed
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_ISWRITEABLE	TokenNameIdentifier	 S  ISWRITEABLE
=	TokenNameEQUAL	
"writable"	TokenNameStringLiteral	writable
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_ISSEARCHABLE	TokenNameIdentifier	 S  ISSEARCHABLE
=	TokenNameEQUAL	
"searchable"	TokenNameStringLiteral	searchable
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_SQL_TypeID	TokenNameIdentifier	 m  SQL  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_MetaData_TypeID	TokenNameIdentifier	 m  Meta Data  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColumnHeader_TypeID	TokenNameIdentifier	 m  Column Header  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_RowSet_TypeID	TokenNameIdentifier	 m  Row Set  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_Row_TypeID	TokenNameIdentifier	 m  Row  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_Col_TypeID	TokenNameIdentifier	 m  Col  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_OutParameter_TypeID	TokenNameIdentifier	 m  Out Parameter  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_CATALOGUE_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  CATALOGUE  NAME  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_DISPLAY_SIZE_TypeID	TokenNameIdentifier	 m  Col Attrib  DISPLAY  SIZE  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_COLUMN_LABEL_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  LABEL  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_COLUMN_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  NAME  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_COLUMN_TYPE_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  TYPE  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_COLUMN_TYPENAME_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  TYPENAME  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_PRECISION_TypeID	TokenNameIdentifier	 m  Col Attrib  PRECISION  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_SCALE_TypeID	TokenNameIdentifier	 m  Col Attrib  SCALE  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_SCHEMA_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  SCHEMA  NAME  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_TABLE_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  TABLE  NAME  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_CASESENSITIVE_TypeID	TokenNameIdentifier	 m  Col Attrib  CASESENSITIVE  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_DEFINITELYWRITEABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  DEFINITELYWRITEABLE  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_ISNULLABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  ISNULLABLE  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_ISSIGNED_TypeID	TokenNameIdentifier	 m  Col Attrib  ISSIGNED  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_ISWRITEABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  ISWRITEABLE  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ColAttrib_ISSEARCHABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  ISSEARCHABLE  Type ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The Statement used to extract the data from the database connection. */	TokenNameCOMMENT_JAVADOC	 The Statement used to extract the data from the database connection. 
private	TokenNameprivate	
Statement	TokenNameIdentifier	 Statement
m_Statement	TokenNameIdentifier	 m  Statement
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Expression COntext used to creat this document * may be used to grab variables from the XSL processor */	TokenNameCOMMENT_JAVADOC	 Expression COntext used to creat this document may be used to grab variables from the XSL processor 
private	TokenNameprivate	
ExpressionContext	TokenNameIdentifier	 Expression Context
m_ExpressionContext	TokenNameIdentifier	 m  Expression Context
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The Connection Pool where we has derived all of our connections * for this document */	TokenNameCOMMENT_JAVADOC	 The Connection Pool where we has derived all of our connections for this document 
private	TokenNameprivate	
ConnectionPool	TokenNameIdentifier	 Connection Pool
m_ConnectionPool	TokenNameIdentifier	 m  Connection Pool
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The current ResultSet. */	TokenNameCOMMENT_JAVADOC	 The current ResultSet. 
private	TokenNameprivate	
ResultSet	TokenNameIdentifier	 Result Set
m_ResultSet	TokenNameIdentifier	 m  Result Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The parameter definitions if this is a callable * statement with output parameters. */	TokenNameCOMMENT_JAVADOC	 The parameter definitions if this is a callable statement with output parameters. 
private	TokenNameprivate	
SQLQueryParser	TokenNameIdentifier	 SQL Query Parser
m_QueryParser	TokenNameIdentifier	 m  Query Parser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * As the column header array is built, keep the node index * for each Column. * The primary use of this is to locate the first attribute for * each column in each row as we add records. */	TokenNameCOMMENT_JAVADOC	 As the column header array is built, keep the node index for each Column. The primary use of this is to locate the first attribute for each column in each row as we add records. 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_ColHeadersIdx	TokenNameIdentifier	 m  Col Headers Idx
;	TokenNameSEMICOLON	
/** * An indicator on how many columns are in this query */	TokenNameCOMMENT_JAVADOC	 An indicator on how many columns are in this query 
private	TokenNameprivate	
int	TokenNameint	
m_ColCount	TokenNameIdentifier	 m  Col Count
;	TokenNameSEMICOLON	
/** * The Index of the MetaData Node. Currently the MetaData Node contains the * */	TokenNameCOMMENT_JAVADOC	 The Index of the MetaData Node. Currently the MetaData Node contains the 
private	TokenNameprivate	
int	TokenNameint	
m_MetaDataIdx	TokenNameIdentifier	 m  Meta Data Idx
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** * The index of the Row Set node. This is the sibling directly after * the last Column Header. */	TokenNameCOMMENT_JAVADOC	 The index of the Row Set node. This is the sibling directly after the last Column Header. 
private	TokenNameprivate	
int	TokenNameint	
m_RowSetIdx	TokenNameIdentifier	 m  Row Set Idx
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_SQLIdx	TokenNameIdentifier	 m  SQL Idx
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** * Demark the first row element where we started adding rows into the * Document. */	TokenNameCOMMENT_JAVADOC	 Demark the first row element where we started adding rows into the Document. 
private	TokenNameprivate	
int	TokenNameint	
m_FirstRowIdx	TokenNameIdentifier	 m  First Row Idx
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** * Keep track of the Last row inserted into the DTM from the ResultSet. * This will be used as the index of the parent Row Element when adding * a row. */	TokenNameCOMMENT_JAVADOC	 Keep track of the Last row inserted into the DTM from the ResultSet. This will be used as the index of the parent Row Element when adding a row. 
private	TokenNameprivate	
int	TokenNameint	
m_LastRowIdx	TokenNameIdentifier	 m  Last Row Idx
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** * Streaming Mode Control, In Streaming mode we reduce the memory * footprint since we only use a single row instance. */	TokenNameCOMMENT_JAVADOC	 Streaming Mode Control, In Streaming mode we reduce the memory footprint since we only use a single row instance. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_StreamingMode	TokenNameIdentifier	 m  Streaming Mode
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Multiple Result sets mode (metadata inside rowset). */	TokenNameCOMMENT_JAVADOC	 Multiple Result sets mode (metadata inside rowset). 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_MultipleResults	TokenNameIdentifier	 m  Multiple Results
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Flag to detect if an error occured during an operation * Defines how errors are handled and how the SQL Connection * is closed. */	TokenNameCOMMENT_JAVADOC	 Flag to detect if an error occured during an operation Defines how errors are handled and how the SQL Connection is closed. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_HasErrors	TokenNameIdentifier	 m  Has Errors
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Is statement caching enabled. */	TokenNameCOMMENT_JAVADOC	 Is statement caching enabled. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_IsStatementCachingEnabled	TokenNameIdentifier	 m  Is Statement Caching Enabled
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * XConnection this document came from. */	TokenNameCOMMENT_JAVADOC	 XConnection this document came from. 
private	TokenNameprivate	
XConnection	TokenNameIdentifier	 X Connection
m_XConnection	TokenNameIdentifier	 m  X Connection
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * @param mgr * @param ident * @throws SQLException */	TokenNameCOMMENT_JAVADOC	 @param mgr @param ident @throws SQLException 
// public cSQLDocument(DTMManager mgr, int ident, Statement stmt, 	TokenNameCOMMENT_LINE	public cSQLDocument(DTMManager mgr, int ident, Statement stmt, 
// ResultSet singleResult, Vector paramdefs, boolean streamingMode, 	TokenNameCOMMENT_LINE	ResultSet singleResult, Vector paramdefs, boolean streamingMode, 
// boolean multipleResults, boolean statementCachingEnabled) throws SQLException 	TokenNameCOMMENT_LINE	boolean multipleResults, boolean statementCachingEnabled) throws SQLException 
public	TokenNamepublic	
SQLDocument	TokenNameIdentifier	 SQL Document
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
int	TokenNameint	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This static method simplifies the creation of an SQL Document and allows * us to embedd the complexity of creating / handling the dtmIdent inside * the document. This type of method may better placed inside the DTMDocument * code */	TokenNameCOMMENT_JAVADOC	 This static method simplifies the creation of an SQL Document and allows us to embedd the complexity of creating / handling the dtmIdent inside the document. This type of method may better placed inside the DTMDocument code 
public	TokenNamepublic	
static	TokenNamestatic	
SQLDocument	TokenNameIdentifier	 SQL Document
getNewDocument	TokenNameIdentifier	 get New Document
(	TokenNameLPAREN	
ExpressionContext	TokenNameIdentifier	 Expression Context
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
.	TokenNameDOT	
XPathExpressionContext	TokenNameIdentifier	 X Path Expression Context
)	TokenNameRPAREN	
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTMManagerDefault	TokenNameIdentifier	 DTM Manager Default
mgrDefault	TokenNameIdentifier	 mgr Default
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMManagerDefault	TokenNameIdentifier	 DTM Manager Default
)	TokenNameRPAREN	
mgr	TokenNameIdentifier	 mgr
;	TokenNameSEMICOLON	
int	TokenNameint	
dtmIdent	TokenNameIdentifier	 dtm Ident
=	TokenNameEQUAL	
mgrDefault	TokenNameIdentifier	 mgr Default
.	TokenNameDOT	
getFirstFreeDTMID	TokenNameIdentifier	 get First Free DTMID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SQLDocument	TokenNameIdentifier	 SQL Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
SQLDocument	TokenNameIdentifier	 SQL Document
(	TokenNameLPAREN	
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
dtmIdent	TokenNameIdentifier	 dtm Ident
<<	TokenNameLEFT_SHIFT	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Register the document 	TokenNameCOMMENT_LINE	Register the document 
mgrDefault	TokenNameIdentifier	 mgr Default
.	TokenNameDOT	
addDTM	TokenNameIdentifier	 add DTM
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
dtmIdent	TokenNameIdentifier	 dtm Ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
setExpressionContext	TokenNameIdentifier	 set Expression Context
(	TokenNameLPAREN	
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * When building the SQL Document, we need to store the Expression * Context that was used to create the document. This will be se to * reference items int he XSLT process such as any variables that were * present. */	TokenNameCOMMENT_JAVADOC	 When building the SQL Document, we need to store the Expression Context that was used to create the document. This will be se to reference items int he XSLT process such as any variables that were present. 
protected	TokenNameprotected	
void	TokenNamevoid	
setExpressionContext	TokenNameIdentifier	 set Expression Context
(	TokenNameLPAREN	
ExpressionContext	TokenNameIdentifier	 Expression Context
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ExpressionContext	TokenNameIdentifier	 m  Expression Context
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the context used to build this document */	TokenNameCOMMENT_JAVADOC	 Return the context used to build this document 
public	TokenNamepublic	
ExpressionContext	TokenNameIdentifier	 Expression Context
getExpressionContext	TokenNameIdentifier	 get Expression Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_ExpressionContext	TokenNameIdentifier	 m  Expression Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XConnection	TokenNameIdentifier	 X Connection
xconn	TokenNameIdentifier	 xconn
,	TokenNameCOMMA	
SQLQueryParser	TokenNameIdentifier	 SQL Query Parser
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_StreamingMode	TokenNameIdentifier	 m  Streaming Mode
=	TokenNameEQUAL	
"true"	TokenNameStringLiteral	true
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
xconn	TokenNameIdentifier	 xconn
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
"streaming"	TokenNameStringLiteral	streaming
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_MultipleResults	TokenNameIdentifier	 m  Multiple Results
=	TokenNameEQUAL	
"true"	TokenNameStringLiteral	true
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
xconn	TokenNameIdentifier	 xconn
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
"multiple-results"	TokenNameStringLiteral	multiple-results
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_IsStatementCachingEnabled	TokenNameIdentifier	 m  Is Statement Caching Enabled
=	TokenNameEQUAL	
"true"	TokenNameStringLiteral	true
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
xconn	TokenNameIdentifier	 xconn
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
"cache-statements"	TokenNameStringLiteral	cache-statements
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_XConnection	TokenNameIdentifier	 m  X Connection
=	TokenNameEQUAL	
xconn	TokenNameIdentifier	 xconn
;	TokenNameSEMICOLON	
m_QueryParser	TokenNameIdentifier	 m  Query Parser
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
executeSQLStatement	TokenNameIdentifier	 execute SQL Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createExpandedNameTable	TokenNameIdentifier	 create Expanded Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Start the document here 	TokenNameCOMMENT_LINE	Start the document here 
m_DocumentIdx	TokenNameIdentifier	 m  Document Idx
=	TokenNameEQUAL	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_Document_TypeID	TokenNameIdentifier	 m  Document  Type ID
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_SQLIdx	TokenNameIdentifier	 m  SQL Idx
=	TokenNameEQUAL	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_SQL_TypeID	TokenNameIdentifier	 m  SQL  Type ID
,	TokenNameCOMMA	
m_DocumentIdx	TokenNameIdentifier	 m  Document Idx
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_MultipleResults	TokenNameIdentifier	 m  Multiple Results
)	TokenNameRPAREN	
extractSQLMetaData	TokenNameIdentifier	 extract SQL Meta Data
(	TokenNameLPAREN	
m_ResultSet	TokenNameIdentifier	 m  Result Set
.	TokenNameDOT	
getMetaData	TokenNameIdentifier	 get Meta Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Only grab the first row, subsequent rows will be 	TokenNameCOMMENT_LINE	Only grab the first row, subsequent rows will be 
// fetched on demand. 	TokenNameCOMMENT_LINE	fetched on demand. 
// We need to do this here so at least on row is set up 	TokenNameCOMMENT_LINE	We need to do this here so at least on row is set up 
// to measure when we are actually reading rows. 	TokenNameCOMMENT_LINE	to measure when we are actually reading rows. 
// We won't grab the first record in case the skip function 	TokenNameCOMMENT_LINE	We won't grab the first record in case the skip function 
// is applied prior to looking at the first record. 	TokenNameCOMMENT_LINE	is applied prior to looking at the first record. 
// JCG Changed 9/15/04 	TokenNameCOMMENT_LINE	JCG Changed 9/15/04 
// addRowToDTMFromResultSet(); 	TokenNameCOMMENT_LINE	addRowToDTMFromResultSet(); 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SQLException	TokenNameIdentifier	 SQL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_HasErrors	TokenNameIdentifier	 m  Has Errors
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
executeSQLStatement	TokenNameIdentifier	 execute SQL Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
m_ConnectionPool	TokenNameIdentifier	 m  Connection Pool
=	TokenNameEQUAL	
m_XConnection	TokenNameIdentifier	 m  X Connection
.	TokenNameDOT	
getConnectionPool	TokenNameIdentifier	 get Connection Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Connection	TokenNameIdentifier	 Connection
conn	TokenNameIdentifier	 conn
=	TokenNameEQUAL	
m_ConnectionPool	TokenNameIdentifier	 m  Connection Pool
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_QueryParser	TokenNameIdentifier	 m  Query Parser
.	TokenNameDOT	
hasParameters	TokenNameIdentifier	 has Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_Statement	TokenNameIdentifier	 m  Statement
=	TokenNameEQUAL	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
createStatement	TokenNameIdentifier	 create Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ResultSet	TokenNameIdentifier	 m  Result Set
=	TokenNameEQUAL	
m_Statement	TokenNameIdentifier	 m  Statement
.	TokenNameDOT	
executeQuery	TokenNameIdentifier	 execute Query
(	TokenNameLPAREN	
m_QueryParser	TokenNameIdentifier	 m  Query Parser
.	TokenNameDOT	
getSQLQuery	TokenNameIdentifier	 get SQL Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_QueryParser	TokenNameIdentifier	 m  Query Parser
.	TokenNameDOT	
isCallable	TokenNameIdentifier	 is Callable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CallableStatement	TokenNameIdentifier	 Callable Statement
cstmt	TokenNameIdentifier	 cstmt
=	TokenNameEQUAL	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
prepareCall	TokenNameIdentifier	 prepare Call
(	TokenNameLPAREN	
m_QueryParser	TokenNameIdentifier	 m  Query Parser
.	TokenNameDOT	
getSQLQuery	TokenNameIdentifier	 get SQL Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_QueryParser	TokenNameIdentifier	 m  Query Parser
.	TokenNameDOT	
registerOutputParameters	TokenNameIdentifier	 register Output Parameters
(	TokenNameLPAREN	
cstmt	TokenNameIdentifier	 cstmt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_QueryParser	TokenNameIdentifier	 m  Query Parser
.	TokenNameDOT	
populateStatement	TokenNameIdentifier	 populate Statement
(	TokenNameLPAREN	
cstmt	TokenNameIdentifier	 cstmt
,	TokenNameCOMMA	
m_ExpressionContext	TokenNameIdentifier	 m  Expression Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Statement	TokenNameIdentifier	 m  Statement
=	TokenNameEQUAL	
cstmt	TokenNameIdentifier	 cstmt
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cstmt	TokenNameIdentifier	 cstmt
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SQLException	TokenNameIdentifier	 SQL Exception
(	TokenNameLPAREN	
"Error in Callable Statement"	TokenNameStringLiteral	Error in Callable Statement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ResultSet	TokenNameIdentifier	 m  Result Set
=	TokenNameEQUAL	
m_Statement	TokenNameIdentifier	 m  Statement
.	TokenNameDOT	
getResultSet	TokenNameIdentifier	 get Result Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
PreparedStatement	TokenNameIdentifier	 Prepared Statement
stmt	TokenNameIdentifier	 stmt
=	TokenNameEQUAL	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
prepareStatement	TokenNameIdentifier	 prepare Statement
(	TokenNameLPAREN	
m_QueryParser	TokenNameIdentifier	 m  Query Parser
.	TokenNameDOT	
getSQLQuery	TokenNameIdentifier	 get SQL Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_QueryParser	TokenNameIdentifier	 m  Query Parser
.	TokenNameDOT	
populateStatement	TokenNameIdentifier	 populate Statement
(	TokenNameLPAREN	
stmt	TokenNameIdentifier	 stmt
,	TokenNameCOMMA	
m_ExpressionContext	TokenNameIdentifier	 m  Expression Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Statement	TokenNameIdentifier	 m  Statement
=	TokenNameEQUAL	
stmt	TokenNameIdentifier	 stmt
;	TokenNameSEMICOLON	
m_ResultSet	TokenNameIdentifier	 m  Result Set
=	TokenNameEQUAL	
stmt	TokenNameIdentifier	 stmt
.	TokenNameDOT	
executeQuery	TokenNameIdentifier	 execute Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Push the record set forward value rows. Used to help in * SQL pagination. * * @param value */	TokenNameCOMMENT_JAVADOC	 Push the record set forward value rows. Used to help in SQL pagination. * @param value 
public	TokenNamepublic	
void	TokenNamevoid	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_ResultSet	TokenNameIdentifier	 m  Result Set
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_ResultSet	TokenNameIdentifier	 m  Result Set
.	TokenNameDOT	
relative	TokenNameIdentifier	 relative
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
origEx	TokenNameIdentifier	 orig Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For now let's assume that the relative method is not supported. 	TokenNameCOMMENT_LINE	For now let's assume that the relative method is not supported. 
// So let's do it manually. 	TokenNameCOMMENT_LINE	So let's do it manually. 
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_ResultSet	TokenNameIdentifier	 m  Result Set
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we still fail, add in both exceptions 	TokenNameCOMMENT_LINE	If we still fail, add in both exceptions 
m_XConnection	TokenNameIdentifier	 m  X Connection
.	TokenNameDOT	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
origEx	TokenNameIdentifier	 orig Ex
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
checkWarnings	TokenNameIdentifier	 check Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_XConnection	TokenNameIdentifier	 m  X Connection
.	TokenNameDOT	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
checkWarnings	TokenNameIdentifier	 check Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Extract the Meta Data and build the Column Attribute List. * @param meta * @return */	TokenNameCOMMENT_JAVADOC	 Extract the Meta Data and build the Column Attribute List. @param meta @return 
private	TokenNameprivate	
void	TokenNamevoid	
extractSQLMetaData	TokenNameIdentifier	 extract SQL Meta Data
(	TokenNameLPAREN	
ResultSetMetaData	TokenNameIdentifier	 Result Set Meta Data
meta	TokenNameIdentifier	 meta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Build the Node Tree, just add the Column Header 	TokenNameCOMMENT_LINE	Build the Node Tree, just add the Column Header 
// branch now, the Row & col elements will be added 	TokenNameCOMMENT_LINE	branch now, the Row & col elements will be added 
// on request. 	TokenNameCOMMENT_LINE	on request. 
// Add in the row-set Element 	TokenNameCOMMENT_LINE	Add in the row-set Element 
// Add in the MetaData Element 	TokenNameCOMMENT_LINE	Add in the MetaData Element 
m_MetaDataIdx	TokenNameIdentifier	 m  Meta Data Idx
=	TokenNameEQUAL	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_MetaData_TypeID	TokenNameIdentifier	 m  Meta Data  Type ID
,	TokenNameCOMMA	
m_MultipleResults	TokenNameIdentifier	 m  Multiple Results
?	TokenNameQUESTION	
m_RowSetIdx	TokenNameIdentifier	 m  Row Set Idx
:	TokenNameCOLON	
m_SQLIdx	TokenNameIdentifier	 m  SQL Idx
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m_ColCount	TokenNameIdentifier	 m  Col Count
=	TokenNameEQUAL	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColHeadersIdx	TokenNameIdentifier	 m  Col Headers Idx
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_ColCount	TokenNameIdentifier	 m  Col Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_XConnection	TokenNameIdentifier	 m  X Connection
.	TokenNameDOT	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
checkWarnings	TokenNameIdentifier	 check Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//error("ERROR Extracting Metadata"); 	TokenNameCOMMENT_LINE	error("ERROR Extracting Metadata"); 
}	TokenNameRBRACE	
// The ColHeaderIdx will be used to keep track of the 	TokenNameCOMMENT_LINE	The ColHeaderIdx will be used to keep track of the 
// Element entries for the individual Column Header. 	TokenNameCOMMENT_LINE	Element entries for the individual Column Header. 
int	TokenNameint	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// JDBC Columms Start at 1 	TokenNameCOMMENT_LINE	JDBC Columms Start at 1 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
m_ColCount	TokenNameIdentifier	 m  Col Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ColHeadersIdx	TokenNameIdentifier	 m  Col Headers Idx
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_ColumnHeader_TypeID	TokenNameIdentifier	 m  Column Header  Type ID
,	TokenNameCOMMA	
m_MetaDataIdx	TokenNameIdentifier	 m  Meta Data Idx
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
=	TokenNameEQUAL	
m_ColHeadersIdx	TokenNameIdentifier	 m  Col Headers Idx
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// A bit brute force, but not sure how to clean it up 	TokenNameCOMMENT_LINE	A bit brute force, but not sure how to clean it up 
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getColumnName	TokenNameIdentifier	 get Column Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_COLUMN_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  NAME  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_COLUMN_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  NAME  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getColumnLabel	TokenNameIdentifier	 get Column Label
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_COLUMN_LABEL_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  LABEL  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_COLUMN_LABEL_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  LABEL  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getCatalogName	TokenNameIdentifier	 get Catalog Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_CATALOGUE_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  CATALOGUE  NAME  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_CATALOGUE_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  CATALOGUE  NAME  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getColumnDisplaySize	TokenNameIdentifier	 get Column Display Size
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_DISPLAY_SIZE_TypeID	TokenNameIdentifier	 m  Col Attrib  DISPLAY  SIZE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_DISPLAY_SIZE_TypeID	TokenNameIdentifier	 m  Col Attrib  DISPLAY  SIZE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getColumnType	TokenNameIdentifier	 get Column Type
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_COLUMN_TYPE_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  TYPE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_COLUMN_TYPE_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  TYPE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getColumnTypeName	TokenNameIdentifier	 get Column Type Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_COLUMN_TYPENAME_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  TYPENAME  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_COLUMN_TYPENAME_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  TYPENAME  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getPrecision	TokenNameIdentifier	 get Precision
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_PRECISION_TypeID	TokenNameIdentifier	 m  Col Attrib  PRECISION  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_PRECISION_TypeID	TokenNameIdentifier	 m  Col Attrib  PRECISION  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getScale	TokenNameIdentifier	 get Scale
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_SCALE_TypeID	TokenNameIdentifier	 m  Col Attrib  SCALE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_SCALE_TypeID	TokenNameIdentifier	 m  Col Attrib  SCALE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getSchemaName	TokenNameIdentifier	 get Schema Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_SCHEMA_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  SCHEMA  NAME  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_SCHEMA_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  SCHEMA  NAME  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
getTableName	TokenNameIdentifier	 get Table Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_TABLE_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  TABLE  NAME  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_TABLE_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  TABLE  NAME  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
?	TokenNameQUESTION	
S_ISTRUE	TokenNameIdentifier	 S  ISTRUE
:	TokenNameCOLON	
S_ISFALSE	TokenNameIdentifier	 S  ISFALSE
,	TokenNameCOMMA	
m_ColAttrib_CASESENSITIVE_TypeID	TokenNameIdentifier	 m  Col Attrib  CASESENSITIVE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_CASESENSITIVE_TypeID	TokenNameIdentifier	 m  Col Attrib  CASESENSITIVE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
isDefinitelyWritable	TokenNameIdentifier	 is Definitely Writable
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
?	TokenNameQUESTION	
S_ISTRUE	TokenNameIdentifier	 S  ISTRUE
:	TokenNameCOLON	
S_ISFALSE	TokenNameIdentifier	 S  ISFALSE
,	TokenNameCOMMA	
m_ColAttrib_DEFINITELYWRITEABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  DEFINITELYWRITEABLE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_DEFINITELYWRITEABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  DEFINITELYWRITEABLE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
S_ISTRUE	TokenNameIdentifier	 S  ISTRUE
:	TokenNameCOLON	
S_ISFALSE	TokenNameIdentifier	 S  ISFALSE
,	TokenNameCOMMA	
m_ColAttrib_ISNULLABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  ISNULLABLE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_ISNULLABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  ISNULLABLE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
isSigned	TokenNameIdentifier	 is Signed
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
?	TokenNameQUESTION	
S_ISTRUE	TokenNameIdentifier	 S  ISTRUE
:	TokenNameCOLON	
S_ISFALSE	TokenNameIdentifier	 S  ISFALSE
,	TokenNameCOMMA	
m_ColAttrib_ISSIGNED_TypeID	TokenNameIdentifier	 m  Col Attrib  ISSIGNED  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_ISSIGNED_TypeID	TokenNameIdentifier	 m  Col Attrib  ISSIGNED  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
isWritable	TokenNameIdentifier	 is Writable
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
?	TokenNameQUESTION	
S_ISTRUE	TokenNameIdentifier	 S  ISTRUE
:	TokenNameCOLON	
S_ISFALSE	TokenNameIdentifier	 S  ISFALSE
,	TokenNameCOMMA	
m_ColAttrib_ISWRITEABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  ISWRITEABLE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_ISWRITEABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  ISWRITEABLE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
meta	TokenNameIdentifier	 meta
.	TokenNameDOT	
isSearchable	TokenNameIdentifier	 is Searchable
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
?	TokenNameQUESTION	
S_ISTRUE	TokenNameIdentifier	 S  ISTRUE
:	TokenNameCOLON	
S_ISFALSE	TokenNameIdentifier	 S  ISFALSE
,	TokenNameCOMMA	
m_ColAttrib_ISSEARCHABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  ISSEARCHABLE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
S_ATTRIB_NOT_SUPPORTED	TokenNameIdentifier	 S  ATTRIB  NOT  SUPPORTED
,	TokenNameCOMMA	
m_ColAttrib_ISSEARCHABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  ISSEARCHABLE  Type ID
,	TokenNameCOMMA	
lastColHeaderIdx	TokenNameIdentifier	 last Col Header Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Populate the Expanded Name Table with the Node that we will use. * Keep a reference of each of the types for access speed. * @return */	TokenNameCOMMENT_JAVADOC	 Populate the Expanded Name Table with the Node that we will use. Keep a reference of each of the types for access speed. @return 
protected	TokenNameprotected	
void	TokenNamevoid	
createExpandedNameTable	TokenNameIdentifier	 create Expanded Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
createExpandedNameTable	TokenNameIdentifier	 create Expanded Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_SQL_TypeID	TokenNameIdentifier	 m  SQL  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_SQL	TokenNameIdentifier	 S  SQL
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_MetaData_TypeID	TokenNameIdentifier	 m  Meta Data  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_METADATA	TokenNameIdentifier	 S  METADATA
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColumnHeader_TypeID	TokenNameIdentifier	 m  Column Header  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_COLUMN_HEADER	TokenNameIdentifier	 S  COLUMN  HEADER
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_RowSet_TypeID	TokenNameIdentifier	 m  Row Set  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_ROW_SET	TokenNameIdentifier	 S  ROW  SET
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Row_TypeID	TokenNameIdentifier	 m  Row  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_ROW	TokenNameIdentifier	 S  ROW
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Col_TypeID	TokenNameIdentifier	 m  Col  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_COL	TokenNameIdentifier	 S  COL
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_OutParameter_TypeID	TokenNameIdentifier	 m  Out Parameter  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_OUT_PARAMETERS	TokenNameIdentifier	 S  OUT  PARAMETERS
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_CATALOGUE_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  CATALOGUE  NAME  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_CATALOGUE_NAME	TokenNameIdentifier	 S  CATALOGUE  NAME
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_DISPLAY_SIZE_TypeID	TokenNameIdentifier	 m  Col Attrib  DISPLAY  SIZE  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_DISPLAY_SIZE	TokenNameIdentifier	 S  DISPLAY  SIZE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_COLUMN_LABEL_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  LABEL  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_COLUMN_LABEL	TokenNameIdentifier	 S  COLUMN  LABEL
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_COLUMN_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  NAME  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_COLUMN_NAME	TokenNameIdentifier	 S  COLUMN  NAME
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_COLUMN_TYPE_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  TYPE  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_COLUMN_TYPE	TokenNameIdentifier	 S  COLUMN  TYPE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_COLUMN_TYPENAME_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  TYPENAME  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_COLUMN_TYPENAME	TokenNameIdentifier	 S  COLUMN  TYPENAME
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_PRECISION_TypeID	TokenNameIdentifier	 m  Col Attrib  PRECISION  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_PRECISION	TokenNameIdentifier	 S  PRECISION
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_SCALE_TypeID	TokenNameIdentifier	 m  Col Attrib  SCALE  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_SCALE	TokenNameIdentifier	 S  SCALE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_SCHEMA_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  SCHEMA  NAME  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_SCHEMA_NAME	TokenNameIdentifier	 S  SCHEMA  NAME
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_TABLE_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  TABLE  NAME  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_TABLE_NAME	TokenNameIdentifier	 S  TABLE  NAME
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_CASESENSITIVE_TypeID	TokenNameIdentifier	 m  Col Attrib  CASESENSITIVE  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_CASESENSITIVE	TokenNameIdentifier	 S  CASESENSITIVE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_DEFINITELYWRITEABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  DEFINITELYWRITEABLE  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_DEFINITELYWRITABLE	TokenNameIdentifier	 S  DEFINITELYWRITABLE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_ISNULLABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  ISNULLABLE  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_ISNULLABLE	TokenNameIdentifier	 S  ISNULLABLE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_ISSIGNED_TypeID	TokenNameIdentifier	 m  Col Attrib  ISSIGNED  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_ISSIGNED	TokenNameIdentifier	 S  ISSIGNED
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_ISWRITEABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  ISWRITEABLE  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_ISWRITEABLE	TokenNameIdentifier	 S  ISWRITEABLE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ColAttrib_ISSEARCHABLE_TypeID	TokenNameIdentifier	 m  Col Attrib  ISSEARCHABLE  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_ISSEARCHABLE	TokenNameIdentifier	 S  ISSEARCHABLE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pull a record from the result set and map it to a DTM based ROW * If we are in Streaming mode, then only create a single row and * keep copying the data into the same row. This will keep the memory * footprint constint independant of the RecordSet Size. If we are not * in Streaming mode then create ROWS for the whole tree. * @return */	TokenNameCOMMENT_JAVADOC	 Pull a record from the result set and map it to a DTM based ROW If we are in Streaming mode, then only create a single row and keep copying the data into the same row. This will keep the memory footprint constint independant of the RecordSet Size. If we are not in Streaming mode then create ROWS for the whole tree. @return 
private	TokenNameprivate	
boolean	TokenNameboolean	
addRowToDTMFromResultSet	TokenNameIdentifier	 add Row To DTM From Result Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// If we have not started the RowSet yet, then add it to the 	TokenNameCOMMENT_LINE	If we have not started the RowSet yet, then add it to the 
// tree. 	TokenNameCOMMENT_LINE	tree. 
if	TokenNameif	
(	TokenNameLPAREN	
m_FirstRowIdx	TokenNameIdentifier	 m  First Row Idx
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_RowSetIdx	TokenNameIdentifier	 m  Row Set Idx
=	TokenNameEQUAL	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_RowSet_TypeID	TokenNameIdentifier	 m  Row Set  Type ID
,	TokenNameCOMMA	
m_SQLIdx	TokenNameIdentifier	 m  SQL Idx
,	TokenNameCOMMA	
m_MultipleResults	TokenNameIdentifier	 m  Multiple Results
?	TokenNameQUESTION	
m_RowSetIdx	TokenNameIdentifier	 m  Row Set Idx
:	TokenNameCOLON	
m_MetaDataIdx	TokenNameIdentifier	 m  Meta Data Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_MultipleResults	TokenNameIdentifier	 m  Multiple Results
)	TokenNameRPAREN	
extractSQLMetaData	TokenNameIdentifier	 extract SQL Meta Data
(	TokenNameLPAREN	
m_ResultSet	TokenNameIdentifier	 m  Result Set
.	TokenNameDOT	
getMetaData	TokenNameIdentifier	 get Meta Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check to see if all the data has been read from the Query. 	TokenNameCOMMENT_LINE	Check to see if all the data has been read from the Query. 
// If we are at the end the signal that event 	TokenNameCOMMENT_LINE	If we are at the end the signal that event 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_ResultSet	TokenNameIdentifier	 m  Result Set
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In Streaming mode, the current ROW will always point back 	TokenNameCOMMENT_LINE	In Streaming mode, the current ROW will always point back 
// to itself until all the data was read. Once the Query is 	TokenNameCOMMENT_LINE	to itself until all the data was read. Once the Query is 
// empty then point the next row to DTM.NULL so that the stream 	TokenNameCOMMENT_LINE	empty then point the next row to DTM.NULL so that the stream 
// ends. Only do this if we have statted the loop to begin with. 	TokenNameCOMMENT_LINE	ends. Only do this if we have statted the loop to begin with. 
if	TokenNameif	
(	TokenNameLPAREN	
m_StreamingMode	TokenNameIdentifier	 m  Streaming Mode
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_LastRowIdx	TokenNameIdentifier	 m  Last Row Idx
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We are at the end, so let's untie the mark 	TokenNameCOMMENT_LINE	We are at the end, so let's untie the mark 
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
m_LastRowIdx	TokenNameIdentifier	 m  Last Row Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_ResultSet	TokenNameIdentifier	 m  Result Set
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_MultipleResults	TokenNameIdentifier	 m  Multiple Results
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_Statement	TokenNameIdentifier	 m  Statement
.	TokenNameDOT	
getMoreResults	TokenNameIdentifier	 get More Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m_Statement	TokenNameIdentifier	 m  Statement
.	TokenNameDOT	
getUpdateCount	TokenNameIdentifier	 get Update Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ResultSet	TokenNameIdentifier	 m  Result Set
=	TokenNameEQUAL	
m_Statement	TokenNameIdentifier	 m  Statement
.	TokenNameDOT	
getResultSet	TokenNameIdentifier	 get Result Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
m_ResultSet	TokenNameIdentifier	 m  Result Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_ResultSet	TokenNameIdentifier	 m  Result Set
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_FirstRowIdx	TokenNameIdentifier	 m  First Row Idx
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
addRowToDTMFromResultSet	TokenNameIdentifier	 add Row To DTM From Result Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
m_QueryParser	TokenNameIdentifier	 m  Query Parser
.	TokenNameDOT	
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get output parameters. 	TokenNameCOMMENT_LINE	Get output parameters. 
if	TokenNameif	
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
outParamIdx	TokenNameIdentifier	 out Param Idx
=	TokenNameEQUAL	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_OutParameter_TypeID	TokenNameIdentifier	 m  Out Parameter  Type ID
,	TokenNameCOMMA	
m_SQLIdx	TokenNameIdentifier	 m  SQL Idx
,	TokenNameCOMMA	
m_RowSetIdx	TokenNameIdentifier	 m  Row Set Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastColID	TokenNameIdentifier	 last Col ID
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
indx	TokenNameIdentifier	 indx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
indx	TokenNameIdentifier	 indx
<	TokenNameLESS	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indx	TokenNameIdentifier	 indx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueryParameter	TokenNameIdentifier	 Query Parameter
parm	TokenNameIdentifier	 parm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QueryParameter	TokenNameIdentifier	 Query Parameter
)	TokenNameRPAREN	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
indx	TokenNameIdentifier	 indx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parm	TokenNameIdentifier	 parm
.	TokenNameDOT	
isOutput	TokenNameIdentifier	 is Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
rawobj	TokenNameIdentifier	 rawobj
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CallableStatement	TokenNameIdentifier	 Callable Statement
)	TokenNameRPAREN	
m_Statement	TokenNameIdentifier	 m  Statement
)	TokenNameRPAREN	
.	TokenNameDOT	
getObject	TokenNameIdentifier	 get Object
(	TokenNameLPAREN	
indx	TokenNameIdentifier	 indx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastColID	TokenNameIdentifier	 last Col ID
=	TokenNameEQUAL	
addElementWithData	TokenNameIdentifier	 add Element With Data
(	TokenNameLPAREN	
rawobj	TokenNameIdentifier	 rawobj
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_Col_TypeID	TokenNameIdentifier	 m  Col  Type ID
,	TokenNameCOMMA	
outParamIdx	TokenNameIdentifier	 out Param Idx
,	TokenNameCOMMA	
lastColID	TokenNameIdentifier	 last Col ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
parm	TokenNameIdentifier	 parm
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_COLUMN_NAME_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  NAME  Type ID
,	TokenNameCOMMA	
lastColID	TokenNameIdentifier	 last Col ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
parm	TokenNameIdentifier	 parm
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_COLUMN_LABEL_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  LABEL  Type ID
,	TokenNameCOMMA	
lastColID	TokenNameIdentifier	 last Col ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
parm	TokenNameIdentifier	 parm
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_COLUMN_TYPE_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  TYPE  Type ID
,	TokenNameCOMMA	
lastColID	TokenNameIdentifier	 last Col ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addAttributeToNode	TokenNameIdentifier	 add Attribute To Node
(	TokenNameLPAREN	
parm	TokenNameIdentifier	 parm
.	TokenNameDOT	
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_ColAttrib_COLUMN_TYPENAME_TypeID	TokenNameIdentifier	 m  Col Attrib  COLUMN  TYPENAME  Type ID
,	TokenNameCOMMA	
lastColID	TokenNameIdentifier	 last Col ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
SQLWarning	TokenNameIdentifier	 SQL Warning
warn	TokenNameIdentifier	 warn
=	TokenNameEQUAL	
checkWarnings	TokenNameIdentifier	 check Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
warn	TokenNameIdentifier	 warn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_XConnection	TokenNameIdentifier	 m  X Connection
.	TokenNameDOT	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
warn	TokenNameIdentifier	 warn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If this is the first time here, start the new level 	TokenNameCOMMENT_LINE	If this is the first time here, start the new level 
if	TokenNameif	
(	TokenNameLPAREN	
m_FirstRowIdx	TokenNameIdentifier	 m  First Row Idx
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_FirstRowIdx	TokenNameIdentifier	 m  First Row Idx
=	TokenNameEQUAL	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_Row_TypeID	TokenNameIdentifier	 m  Row  Type ID
,	TokenNameCOMMA	
m_RowSetIdx	TokenNameIdentifier	 m  Row Set Idx
,	TokenNameCOMMA	
m_MultipleResults	TokenNameIdentifier	 m  Multiple Results
?	TokenNameQUESTION	
m_MetaDataIdx	TokenNameIdentifier	 m  Meta Data Idx
:	TokenNameCOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_LastRowIdx	TokenNameIdentifier	 m  Last Row Idx
=	TokenNameEQUAL	
m_FirstRowIdx	TokenNameIdentifier	 m  First Row Idx
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_StreamingMode	TokenNameIdentifier	 m  Streaming Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Let's tie the rows together until the end. 	TokenNameCOMMENT_LINE	Let's tie the rows together until the end. 
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
m_LastRowIdx	TokenNameIdentifier	 m  Last Row Idx
,	TokenNameCOMMA	
m_LastRowIdx	TokenNameIdentifier	 m  Last Row Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// If we are in Streaming mode, then only use a single row instance 	TokenNameCOMMENT_LINE	If we are in Streaming mode, then only use a single row instance 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_StreamingMode	TokenNameIdentifier	 m  Streaming Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_LastRowIdx	TokenNameIdentifier	 m  Last Row Idx
=	TokenNameEQUAL	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_Row_TypeID	TokenNameIdentifier	 m  Row  Type ID
,	TokenNameCOMMA	
m_RowSetIdx	TokenNameIdentifier	 m  Row Set Idx
,	TokenNameCOMMA	
m_LastRowIdx	TokenNameIdentifier	 m  Last Row Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If we are not in streaming mode, this will always be DTM.NULL 	TokenNameCOMMENT_LINE	If we are not in streaming mode, this will always be DTM.NULL 
// If we are in streaming mode, it will only be DTM.NULL the first time 	TokenNameCOMMENT_LINE	If we are in streaming mode, it will only be DTM.NULL the first time 
int	TokenNameint	
colID	TokenNameIdentifier	 col ID
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
m_LastRowIdx	TokenNameIdentifier	 m  Last Row Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Keep Track of who our parent was when adding new col objects. 	TokenNameCOMMENT_LINE	Keep Track of who our parent was when adding new col objects. 
int	TokenNameint	
pcolID	TokenNameIdentifier	 pcol ID
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// Columns in JDBC Start at 1 and go to the Extent 	TokenNameCOMMENT_LINE	Columns in JDBC Start at 1 and go to the Extent 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
m_ColCount	TokenNameIdentifier	 m  Col Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Just grab the Column Object Type, we will convert it to a string 	TokenNameCOMMENT_LINE	Just grab the Column Object Type, we will convert it to a string 
// later. 	TokenNameCOMMENT_LINE	later. 
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
m_ResultSet	TokenNameIdentifier	 m  Result Set
.	TokenNameDOT	
getObject	TokenNameIdentifier	 get Object
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a new column object if one does not exist. 	TokenNameCOMMENT_LINE	Create a new column object if one does not exist. 
// In Streaming mode, this mechinism will reuse the column 	TokenNameCOMMENT_LINE	In Streaming mode, this mechinism will reuse the column 
// data the second and subsequent row accesses. 	TokenNameCOMMENT_LINE	data the second and subsequent row accesses. 
if	TokenNameif	
(	TokenNameLPAREN	
colID	TokenNameIdentifier	 col ID
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pcolID	TokenNameIdentifier	 pcol ID
=	TokenNameEQUAL	
addElementWithData	TokenNameIdentifier	 add Element With Data
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_Col_TypeID	TokenNameIdentifier	 m  Col  Type ID
,	TokenNameCOMMA	
m_LastRowIdx	TokenNameIdentifier	 m  Last Row Idx
,	TokenNameCOMMA	
pcolID	TokenNameIdentifier	 pcol ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cloneAttributeFromNode	TokenNameIdentifier	 clone Attribute From Node
(	TokenNameLPAREN	
pcolID	TokenNameIdentifier	 pcol ID
,	TokenNameCOMMA	
m_ColHeadersIdx	TokenNameIdentifier	 m  Col Headers Idx
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// We must be in streaming mode, so let's just replace the data 	TokenNameCOMMENT_LINE	We must be in streaming mode, so let's just replace the data 
// If the firstch was not set then we have a major error 	TokenNameCOMMENT_LINE	If the firstch was not set then we have a major error 
int	TokenNameint	
dataIdent	TokenNameIdentifier	 data Ident
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
colID	TokenNameIdentifier	 col ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIdent	TokenNameIdentifier	 data Ident
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Streaming Mode, Data Error"	TokenNameStringLiteral	Streaming Mode, Data Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_ObjectArray	TokenNameIdentifier	 m  Object Array
.	TokenNameDOT	
setAt	TokenNameIdentifier	 set At
(	TokenNameLPAREN	
dataIdent	TokenNameIdentifier	 data Ident
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If 	TokenNameCOMMENT_LINE	If 
// In streaming mode, this will be !DTM.NULL 	TokenNameCOMMENT_LINE	In streaming mode, this will be !DTM.NULL 
// So if the elements were already established then we 	TokenNameCOMMENT_LINE	So if the elements were already established then we 
// should be able to walk them in order. 	TokenNameCOMMENT_LINE	should be able to walk them in order. 
if	TokenNameif	
(	TokenNameLPAREN	
colID	TokenNameIdentifier	 col ID
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
colID	TokenNameIdentifier	 col ID
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
colID	TokenNameIdentifier	 col ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// For Col Loop 	TokenNameCOMMENT_LINE	For Col Loop 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"SQL Error Fetching next row ["	TokenNameStringLiteral	SQL Error Fetching next row [
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_XConnection	TokenNameIdentifier	 m  X Connection
.	TokenNameDOT	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
checkWarnings	TokenNameIdentifier	 check Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_HasErrors	TokenNameIdentifier	 m  Has Errors
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Only do a single row... 	TokenNameCOMMENT_LINE	Only do a single row... 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used by the XConnection to determine if the Document should * handle the document differently. */	TokenNameCOMMENT_JAVADOC	 Used by the XConnection to determine if the Document should handle the document differently. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasErrors	TokenNameIdentifier	 has Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_HasErrors	TokenNameIdentifier	 m  Has Errors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close down any resources used by this document. If an SQL Error occure * while the document was being accessed, the SQL Connection used to create * this document will be released to the Connection Pool on error. This allows * the COnnection Pool to give special attention to any connection that may * be in a errored state. * */	TokenNameCOMMENT_JAVADOC	 Close down any resources used by this document. If an SQL Error occure while the document was being accessed, the SQL Connection used to create this document will be released to the Connection Pool on error. This allows the COnnection Pool to give special attention to any connection that may be in a errored state. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flushConnPool	TokenNameIdentifier	 flush Conn Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
SQLWarning	TokenNameIdentifier	 SQL Warning
warn	TokenNameIdentifier	 warn
=	TokenNameEQUAL	
checkWarnings	TokenNameIdentifier	 check Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
warn	TokenNameIdentifier	 warn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_XConnection	TokenNameIdentifier	 m  X Connection
.	TokenNameDOT	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
warn	TokenNameIdentifier	 warn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_ResultSet	TokenNameIdentifier	 m  Result Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ResultSet	TokenNameIdentifier	 m  Result Set
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ResultSet	TokenNameIdentifier	 m  Result Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
Connection	TokenNameIdentifier	 Connection
conn	TokenNameIdentifier	 conn
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_Statement	TokenNameIdentifier	 m  Statement
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conn	TokenNameIdentifier	 conn
=	TokenNameEQUAL	
m_Statement	TokenNameIdentifier	 m  Statement
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Statement	TokenNameIdentifier	 m  Statement
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Statement	TokenNameIdentifier	 m  Statement
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
conn	TokenNameIdentifier	 conn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_HasErrors	TokenNameIdentifier	 m  Has Errors
)	TokenNameRPAREN	
m_ConnectionPool	TokenNameIdentifier	 m  Connection Pool
.	TokenNameDOT	
releaseConnectionOnError	TokenNameIdentifier	 release Connection On Error
(	TokenNameLPAREN	
conn	TokenNameIdentifier	 conn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_ConnectionPool	TokenNameIdentifier	 m  Connection Pool
.	TokenNameDOT	
releaseConnection	TokenNameIdentifier	 release Connection
(	TokenNameLPAREN	
conn	TokenNameIdentifier	 conn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if (flushConnPool) m_ConnectionPool.freeUnused(); 	TokenNameCOMMENT_LINE	if (flushConnPool) m_ConnectionPool.freeUnused(); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
getManager	TokenNameIdentifier	 get Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return */	TokenNameCOMMENT_JAVADOC	 @return 
protected	TokenNameprotected	
boolean	TokenNameboolean	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"nextNode()"	TokenNameStringLiteral	nextNode()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// return m_ResultSet.isAfterLast(); 	TokenNameCOMMENT_LINE	return m_ResultSet.isAfterLast(); 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param identity * @return */	TokenNameCOMMENT_JAVADOC	 @param identity @return 
protected	TokenNameprotected	
int	TokenNameint	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we are asking for the next row and we have not 	TokenNameCOMMENT_LINE	If we are asking for the next row and we have not 
// been there yet then let's see if we can get another 	TokenNameCOMMENT_LINE	been there yet then let's see if we can get another 
// row from the ResultSet. 	TokenNameCOMMENT_LINE	row from the ResultSet. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
m_ResultSet	TokenNameIdentifier	 m  Result Set
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We need to prime the pump since we don't do it in execute any more. 	TokenNameCOMMENT_LINE	We need to prime the pump since we don't do it in execute any more. 
if	TokenNameif	
(	TokenNameLPAREN	
m_FirstRowIdx	TokenNameIdentifier	 m  First Row Idx
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addRowToDTMFromResultSet	TokenNameIdentifier	 add Row To DTM From Result Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
m_Row_TypeID	TokenNameIdentifier	 m  Row  Type ID
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
>=	TokenNameGREATER_EQUAL	
m_LastRowIdx	TokenNameIdentifier	 m  Last Row Idx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"reading from the ResultSet"	TokenNameStringLiteral	reading from the ResultSet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addRowToDTMFromResultSet	TokenNameIdentifier	 add Row To DTM From Result Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_MultipleResults	TokenNameIdentifier	 m  Multiple Results
&&	TokenNameAND_AND	
identity	TokenNameIdentifier	 identity
==	TokenNameEQUAL_EQUAL	
m_RowSetIdx	TokenNameIdentifier	 m  Row Set Idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"reading for next ResultSet"	TokenNameStringLiteral	reading for next ResultSet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startIdx	TokenNameIdentifier	 start Idx
=	TokenNameEQUAL	
m_RowSetIdx	TokenNameIdentifier	 m  Row Set Idx
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
startIdx	TokenNameIdentifier	 start Idx
==	TokenNameEQUAL_EQUAL	
m_RowSetIdx	TokenNameIdentifier	 m  Row Set Idx
&&	TokenNameAND_AND	
m_ResultSet	TokenNameIdentifier	 m  Result Set
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
addRowToDTMFromResultSet	TokenNameIdentifier	 add Row To DTM From Result Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
documentRegistration	TokenNameIdentifier	 document Registration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Document Registration"	TokenNameStringLiteral	Document Registration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
documentRelease	TokenNameIdentifier	 document Release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Document Release"	TokenNameStringLiteral	Document Release
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SQLWarning	TokenNameIdentifier	 SQL Warning
checkWarnings	TokenNameIdentifier	 check Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SQLWarning	TokenNameIdentifier	 SQL Warning
warn	TokenNameIdentifier	 warn
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_Statement	TokenNameIdentifier	 m  Statement
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
warn	TokenNameIdentifier	 warn
=	TokenNameEQUAL	
m_Statement	TokenNameIdentifier	 m  Statement
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Statement	TokenNameIdentifier	 m  Statement
.	TokenNameDOT	
clearWarnings	TokenNameIdentifier	 clear Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SQLException	TokenNameIdentifier	 SQL Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
warn	TokenNameIdentifier	 warn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
