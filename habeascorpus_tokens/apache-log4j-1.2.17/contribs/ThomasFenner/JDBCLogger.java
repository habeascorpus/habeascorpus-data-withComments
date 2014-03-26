/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
klopotek	TokenNameIdentifier	 klopotek
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
log	TokenNameIdentifier	 log
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** This class encapsulate the logic which is necessary to log into a table. Used by JDBCAppender <p><b>Author : </b><A HREF="mailto:t.fenner@klopotek.de">Thomas Fenner</A></p> @since 1.0 */	TokenNameCOMMENT_JAVADOC	 This class encapsulate the logic which is necessary to log into a table. Used by JDBCAppender <p><b>Author : </b><A HREF="mailto:t.fenner@klopotek.de">Thomas Fenner</A></p> @since 1.0 
public	TokenNamepublic	
class	TokenNameclass	
JDBCLogger	TokenNameIdentifier	 JDBC Logger
{	TokenNameLBRACE	
//All columns of the log-table 	TokenNameCOMMENT_LINE	All columns of the log-table 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
logcols	TokenNameIdentifier	 logcols
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//Only columns which will be provided by logging 	TokenNameCOMMENT_LINE	Only columns which will be provided by logging 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
column_list	TokenNameIdentifier	 column list
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//Number of all columns 	TokenNameCOMMENT_LINE	Number of all columns 
private	TokenNameprivate	
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//Status for successful execution of method configure() 	TokenNameCOMMENT_LINE	Status for successful execution of method configure() 
private	TokenNameprivate	
boolean	TokenNameboolean	
isconfigured	TokenNameIdentifier	 isconfigured
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//Status for ready to do logging with method append() 	TokenNameCOMMENT_LINE	Status for ready to do logging with method append() 
private	TokenNameprivate	
boolean	TokenNameboolean	
ready	TokenNameIdentifier	 ready
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//This message will be filled with a error-string when method ready() failes, and can be got by calling getMsg() 	TokenNameCOMMENT_LINE	This message will be filled with a error-string when method ready() failes, and can be got by calling getMsg() 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
errormsg	TokenNameIdentifier	 errormsg
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Statement	TokenNameIdentifier	 Statement
stmt	TokenNameIdentifier	 stmt
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ResultSet	TokenNameIdentifier	 Result Set
rs	TokenNameIdentifier	 rs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//Variables for static SQL-statement logging 	TokenNameCOMMENT_LINE	Variables for static SQL-statement logging 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
sql	TokenNameIdentifier	 sql
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
new_sql	TokenNameIdentifier	 new sql
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
new_sql_part1	TokenNameIdentifier	 new sql part1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
new_sql_part2	TokenNameIdentifier	 new sql part2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
msg_wildcard	TokenNameIdentifier	 msg wildcard
=	TokenNameEQUAL	
"@MSG@"	TokenNameStringLiteral	@MSG@
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
msg_wildcard_pos	TokenNameIdentifier	 msg wildcard pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Writes a message into the database table. Throws an exception, if an database-error occurs ! */	TokenNameCOMMENT_JAVADOC	 Writes a message into the database table. Throws an exception, if an database-error occurs ! 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
_msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ready	TokenNameIdentifier	 ready
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ready	TokenNameIdentifier	 ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCLogger::append(), Not ready to append !"	TokenNameStringLiteral	JDBCLogger::append(), Not ready to append !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appendSQL	TokenNameIdentifier	 append SQL
(	TokenNameLPAREN	
_msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogColumn	TokenNameIdentifier	 Log Column
logcol	TokenNameIdentifier	 logcol
;	TokenNameSEMICOLON	
rs	TokenNameIdentifier	 rs
.	TokenNameDOT	
moveToInsertRow	TokenNameIdentifier	 move To Insert Row
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logcol	TokenNameIdentifier	 logcol
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LogColumn	TokenNameIdentifier	 Log Column
)	TokenNameRPAREN	
logcols	TokenNameIdentifier	 logcols
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
==	TokenNameEQUAL_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rs	TokenNameIdentifier	 rs
.	TokenNameDOT	
updateObject	TokenNameIdentifier	 update Object
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
_msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
==	TokenNameEQUAL_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
ID	TokenNameIdentifier	 ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rs	TokenNameIdentifier	 rs
.	TokenNameDOT	
updateObject	TokenNameIdentifier	 update Object
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
idhandler	TokenNameIdentifier	 idhandler
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
==	TokenNameEQUAL_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
STATIC	TokenNameIdentifier	 STATIC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rs	TokenNameIdentifier	 rs
.	TokenNameDOT	
updateObject	TokenNameIdentifier	 update Object
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
==	TokenNameEQUAL_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
TIMESTAMP	TokenNameIdentifier	 TIMESTAMP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rs	TokenNameIdentifier	 rs
.	TokenNameDOT	
updateObject	TokenNameIdentifier	 update Object
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
new	TokenNamenew	
Timestamp	TokenNameIdentifier	 Timestamp
(	TokenNameLPAREN	
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
rs	TokenNameIdentifier	 rs
.	TokenNameDOT	
insertRow	TokenNameIdentifier	 insert Row
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Writes a message into the database using a given sql-statement. Throws an exception, if an database-error occurs ! */	TokenNameCOMMENT_JAVADOC	 Writes a message into the database using a given sql-statement. Throws an exception, if an database-error occurs ! 
public	TokenNamepublic	
void	TokenNamevoid	
appendSQL	TokenNameIdentifier	 append SQL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
_msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ready	TokenNameIdentifier	 ready
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ready	TokenNameIdentifier	 ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCLogger::appendSQL(), Not ready to append !"	TokenNameStringLiteral	JDBCLogger::appendSQL(), Not ready to append !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCLogger::appendSQL(), No SQL-Statement configured !"	TokenNameStringLiteral	JDBCLogger::appendSQL(), No SQL-Statement configured !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
msg_wildcard_pos	TokenNameIdentifier	 msg wildcard pos
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new_sql	TokenNameIdentifier	 new sql
=	TokenNameEQUAL	
new_sql_part1	TokenNameIdentifier	 new sql part1
+	TokenNamePLUS	
_msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
new_sql_part2	TokenNameIdentifier	 new sql part2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
new_sql	TokenNameIdentifier	 new sql
=	TokenNameEQUAL	
sql	TokenNameIdentifier	 sql
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
stmt	TokenNameIdentifier	 stmt
.	TokenNameDOT	
executeUpdate	TokenNameIdentifier	 execute Update
(	TokenNameLPAREN	
new_sql	TokenNameIdentifier	 new sql
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errormsg	TokenNameIdentifier	 errormsg
=	TokenNameEQUAL	
new_sql	TokenNameIdentifier	 new sql
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Configures this class, by reading in the structure of the log-table Throws an exception, if an database-error occurs ! */	TokenNameCOMMENT_JAVADOC	 Configures this class, by reading in the structure of the log-table Throws an exception, if an database-error occurs ! 
public	TokenNamepublic	
void	TokenNamevoid	
configureTable	TokenNameIdentifier	 configure Table
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
_table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isconfigured	TokenNameIdentifier	 isconfigured
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
//Fill logcols with META-informations of the table-columns 	TokenNameCOMMENT_LINE	Fill logcols with META-informations of the table-columns 
stmt	TokenNameIdentifier	 stmt
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
createStatement	TokenNameIdentifier	 create Statement
(	TokenNameLPAREN	
ResultSet	TokenNameIdentifier	 Result Set
.	TokenNameDOT	
TYPE_SCROLL_INSENSITIVE	TokenNameIdentifier	 TYPE  SCROLL  INSENSITIVE
,	TokenNameCOMMA	
ResultSet	TokenNameIdentifier	 Result Set
.	TokenNameDOT	
CONCUR_UPDATABLE	TokenNameIdentifier	 CONCUR  UPDATABLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rs	TokenNameIdentifier	 rs
=	TokenNameEQUAL	
stmt	TokenNameIdentifier	 stmt
.	TokenNameDOT	
executeQuery	TokenNameIdentifier	 execute Query
(	TokenNameLPAREN	
"SELECT * FROM "	TokenNameStringLiteral	SELECT * FROM 
+	TokenNamePLUS	
_table	TokenNameIdentifier	 table
+	TokenNamePLUS	
" WHERE 1 = 2"	TokenNameStringLiteral	 WHERE 1 = 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogColumn	TokenNameIdentifier	 Log Column
logcol	TokenNameIdentifier	 logcol
;	TokenNameSEMICOLON	
ResultSetMetaData	TokenNameIdentifier	 Result Set Meta Data
rsmd	TokenNameIdentifier	 rsmd
=	TokenNameEQUAL	
rs	TokenNameIdentifier	 rs
.	TokenNameDOT	
getMetaData	TokenNameIdentifier	 get Meta Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
rsmd	TokenNameIdentifier	 rsmd
.	TokenNameDOT	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logcols	TokenNameIdentifier	 logcols
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logcol	TokenNameIdentifier	 logcol
=	TokenNameEQUAL	
new	TokenNamenew	
LogColumn	TokenNameIdentifier	 Log Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
rsmd	TokenNameIdentifier	 rsmd
.	TokenNameDOT	
getColumnName	TokenNameIdentifier	 get Column Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
rsmd	TokenNameIdentifier	 rsmd
.	TokenNameDOT	
getColumnTypeName	TokenNameIdentifier	 get Column Type Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
nullable	TokenNameIdentifier	 nullable
=	TokenNameEQUAL	
(	TokenNameLPAREN	
rsmd	TokenNameIdentifier	 rsmd
.	TokenNameDOT	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
rsmd	TokenNameIdentifier	 rsmd
.	TokenNameDOT	
columnNullable	TokenNameIdentifier	 column Nullable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
isWritable	TokenNameIdentifier	 is Writable
=	TokenNameEQUAL	
rsmd	TokenNameIdentifier	 rsmd
.	TokenNameDOT	
isWritable	TokenNameIdentifier	 is Writable
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
isWritable	TokenNameIdentifier	 is Writable
)	TokenNameRPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
ignore	TokenNameIdentifier	 ignore
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
logcols	TokenNameIdentifier	 logcols
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
_table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
isconfigured	TokenNameIdentifier	 isconfigured
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Configures this class, by storing and parsing the given sql-statement. Throws an exception, if somethings wrong ! */	TokenNameCOMMENT_JAVADOC	 Configures this class, by storing and parsing the given sql-statement. Throws an exception, if somethings wrong ! 
public	TokenNamepublic	
void	TokenNamevoid	
configureSQL	TokenNameIdentifier	 configure SQL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
_sql	TokenNameIdentifier	 sql
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isconfigured	TokenNameIdentifier	 isconfigured
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isConnected	TokenNameIdentifier	 is Connected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCLogger::configureSQL(), Not connected to database !"	TokenNameStringLiteral	JDBCLogger::configureSQL(), Not connected to database !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_sql	TokenNameIdentifier	 sql
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
_sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCLogger::configureSQL(), Invalid SQL-Statement !"	TokenNameStringLiteral	JDBCLogger::configureSQL(), Invalid SQL-Statement !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sql	TokenNameIdentifier	 sql
=	TokenNameEQUAL	
_sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stmt	TokenNameIdentifier	 stmt
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
createStatement	TokenNameIdentifier	 create Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msg_wildcard_pos	TokenNameIdentifier	 msg wildcard pos
=	TokenNameEQUAL	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
msg_wildcard	TokenNameIdentifier	 msg wildcard
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
msg_wildcard_pos	TokenNameIdentifier	 msg wildcard pos
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new_sql_part1	TokenNameIdentifier	 new sql part1
=	TokenNameEQUAL	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
msg_wildcard_pos	TokenNameIdentifier	 msg wildcard pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
;	TokenNameSEMICOLON	
//between the message... 	TokenNameCOMMENT_LINE	between the message... 
new_sql_part2	TokenNameIdentifier	 new sql part2
=	TokenNameEQUAL	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
msg_wildcard_pos	TokenNameIdentifier	 msg wildcard pos
+	TokenNamePLUS	
msg_wildcard	TokenNameIdentifier	 msg wildcard
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isconfigured	TokenNameIdentifier	 isconfigured
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets a connection. Throws an exception, if the connection is not open ! */	TokenNameCOMMENT_JAVADOC	 Sets a connection. Throws an exception, if the connection is not open ! 
public	TokenNamepublic	
void	TokenNamevoid	
setConnection	TokenNameIdentifier	 set Connection
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
_con	TokenNameIdentifier	 con
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
_con	TokenNameIdentifier	 con
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isConnected	TokenNameIdentifier	 is Connected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCLogger::setConnection(), Given connection isnt connected to database !"	TokenNameStringLiteral	JDBCLogger::setConnection(), Given connection isnt connected to database !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets a columns logtype (LogTypes) and value, which depends on that logtype. Throws an exception, if the given arguments arent correct ! */	TokenNameCOMMENT_JAVADOC	 Sets a columns logtype (LogTypes) and value, which depends on that logtype. Throws an exception, if the given arguments arent correct ! 
public	TokenNamepublic	
void	TokenNamevoid	
setLogType	TokenNameIdentifier	 set Log Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
_name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
_logtype	TokenNameIdentifier	 logtype
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isconfigured	TokenNameIdentifier	 isconfigured
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCLogger::setLogType(), Not configured !"	TokenNameStringLiteral	JDBCLogger::setLogType(), Not configured !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//setLogType() makes only sense for further configuration of configureTable() 	TokenNameCOMMENT_LINE	setLogType() makes only sense for further configuration of configureTable() 
if	TokenNameif	
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
_name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
_name	TokenNameIdentifier	 name
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
_name	TokenNameIdentifier	 name
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCLogger::setLogType(), Missing argument name !"	TokenNameStringLiteral	JDBCLogger::setLogType(), Missing argument name !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
isLogType	TokenNameIdentifier	 is Log Type
(	TokenNameLPAREN	
_logtype	TokenNameIdentifier	 logtype
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCLogger::setLogType(), Invalid logtype '"	TokenNameStringLiteral	JDBCLogger::setLogType(), Invalid logtype '
+	TokenNamePLUS	
_logtype	TokenNameIdentifier	 logtype
+	TokenNamePLUS	
"' !"	TokenNameStringLiteral	' !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_logtype	TokenNameIdentifier	 logtype
!=	TokenNameNOT_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
MSG	TokenNameIdentifier	 MSG
&&	TokenNameAND_AND	
_logtype	TokenNameIdentifier	 logtype
!=	TokenNameNOT_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
_value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCLogger::setLogType(), Missing argument value !"	TokenNameStringLiteral	JDBCLogger::setLogType(), Missing argument value !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogColumn	TokenNameIdentifier	 Log Column
logcol	TokenNameIdentifier	 logcol
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logcol	TokenNameIdentifier	 logcol
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LogColumn	TokenNameIdentifier	 Log Column
)	TokenNameRPAREN	
logcols	TokenNameIdentifier	 logcols
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
_name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
isWritable	TokenNameIdentifier	 is Writable
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCLogger::setLogType(), Column "	TokenNameStringLiteral	JDBCLogger::setLogType(), Column 
+	TokenNamePLUS	
_name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" is not writeable !"	TokenNameStringLiteral	 is not writeable !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Column gets the message 	TokenNameCOMMENT_LINE	Column gets the message 
if	TokenNameif	
(	TokenNameLPAREN	
_logtype	TokenNameIdentifier	 logtype
==	TokenNameEQUAL_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
=	TokenNameEQUAL	
_logtype	TokenNameIdentifier	 logtype
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Column will be provided by JDBCIDHandler::getID() 	TokenNameCOMMENT_LINE	Column will be provided by JDBCIDHandler::getID() 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_logtype	TokenNameIdentifier	 logtype
==	TokenNameEQUAL_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
ID	TokenNameIdentifier	 ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
=	TokenNameEQUAL	
_logtype	TokenNameIdentifier	 logtype
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
//Try to cast directly Object to JDBCIDHandler 	TokenNameCOMMENT_LINE	Try to cast directly Object to JDBCIDHandler 
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
idhandler	TokenNameIdentifier	 idhandler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JDBCIDHandler	TokenNameIdentifier	 JDBCID Handler
)	TokenNameRPAREN	
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
//Assuming _value is of class string which contains the classname of a JDBCIDHandler 	TokenNameCOMMENT_LINE	Assuming _value is of class string which contains the classname of a JDBCIDHandler 
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
idhandler	TokenNameIdentifier	 idhandler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JDBCIDHandler	TokenNameIdentifier	 JDBCID Handler
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCLogger::setLogType(), Cannot cast value of class "	TokenNameStringLiteral	JDBCLogger::setLogType(), Cannot cast value of class 
+	TokenNamePLUS	
_value	TokenNameIdentifier	 value
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" to class JDBCIDHandler !"	TokenNameStringLiteral	 to class JDBCIDHandler !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Column will be statically defined with Object _value 	TokenNameCOMMENT_LINE	Column will be statically defined with Object _value 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_logtype	TokenNameIdentifier	 logtype
==	TokenNameEQUAL_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
STATIC	TokenNameIdentifier	 STATIC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
=	TokenNameEQUAL	
_logtype	TokenNameIdentifier	 logtype
;	TokenNameSEMICOLON	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Column will be provided with a actually timestamp 	TokenNameCOMMENT_LINE	Column will be provided with a actually timestamp 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_logtype	TokenNameIdentifier	 logtype
==	TokenNameEQUAL_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
TIMESTAMP	TokenNameIdentifier	 TIMESTAMP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
=	TokenNameEQUAL	
_logtype	TokenNameIdentifier	 logtype
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Column will be fully ignored during process. 	TokenNameCOMMENT_LINE	Column will be fully ignored during process. 
//If this column is not nullable, the column has to be filled by a database trigger, 	TokenNameCOMMENT_LINE	If this column is not nullable, the column has to be filled by a database trigger, 
//else a database error occurs ! 	TokenNameCOMMENT_LINE	else a database error occurs ! 
//Columns which are not nullable, but should be not filled, must be explicit assigned with LogType.EMPTY, 	TokenNameCOMMENT_LINE	Columns which are not nullable, but should be not filled, must be explicit assigned with LogType.EMPTY, 
//else a value is required ! 	TokenNameCOMMENT_LINE	else a value is required ! 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_logtype	TokenNameIdentifier	 logtype
==	TokenNameEQUAL_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
=	TokenNameEQUAL	
_logtype	TokenNameIdentifier	 logtype
;	TokenNameSEMICOLON	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
ignore	TokenNameIdentifier	 ignore
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Return true, if this class is ready to append(), else false. When not ready, a reason-String is stored in the instance-variable msg. */	TokenNameCOMMENT_JAVADOC	 Return true, if this class is ready to append(), else false. When not ready, a reason-String is stored in the instance-variable msg. 
public	TokenNamepublic	
boolean	TokenNameboolean	
ready	TokenNameIdentifier	 ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ready	TokenNameIdentifier	 ready
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isconfigured	TokenNameIdentifier	 isconfigured
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errormsg	TokenNameIdentifier	 errormsg
=	TokenNameEQUAL	
"Not ready to append ! Call configure() first !"	TokenNameStringLiteral	Not ready to append ! Call configure() first !
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//No need to doing the whole rest... 	TokenNameCOMMENT_LINE	No need to doing the whole rest... 
if	TokenNameif	
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ready	TokenNameIdentifier	 ready
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
msgcol_defined	TokenNameIdentifier	 msgcol defined
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
LogColumn	TokenNameIdentifier	 Log Column
logcol	TokenNameIdentifier	 logcol
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logcol	TokenNameIdentifier	 logcol
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LogColumn	TokenNameIdentifier	 Log Column
)	TokenNameRPAREN	
logcols	TokenNameIdentifier	 logcols
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
ignore	TokenNameIdentifier	 ignore
||	TokenNameOR_OR	
!	TokenNameNOT	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
isWritable	TokenNameIdentifier	 is Writable
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
nullable	TokenNameIdentifier	 nullable
&&	TokenNameAND_AND	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
==	TokenNameEQUAL_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errormsg	TokenNameIdentifier	 errormsg
=	TokenNameEQUAL	
"Not ready to append ! Column "	TokenNameStringLiteral	Not ready to append ! Column 
+	TokenNamePLUS	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" is not nullable, and must be specified by setLogType() !"	TokenNameStringLiteral	 is not nullable, and must be specified by setLogType() !
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
==	TokenNameEQUAL_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
ID	TokenNameIdentifier	 ID
&&	TokenNameAND_AND	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
idhandler	TokenNameIdentifier	 idhandler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errormsg	TokenNameIdentifier	 errormsg
=	TokenNameEQUAL	
"Not ready to append ! Column "	TokenNameStringLiteral	Not ready to append ! Column 
+	TokenNamePLUS	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" is specified as an ID-column, and a JDBCIDHandler has to be set !"	TokenNameStringLiteral	 is specified as an ID-column, and a JDBCIDHandler has to be set !
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
==	TokenNameEQUAL_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
STATIC	TokenNameIdentifier	 STATIC
&&	TokenNameAND_AND	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errormsg	TokenNameIdentifier	 errormsg
=	TokenNameEQUAL	
"Not ready to append ! Column "	TokenNameStringLiteral	Not ready to append ! Column 
+	TokenNamePLUS	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" is specified as a static field, and a value has to be set !"	TokenNameStringLiteral	 is specified as a static field, and a value has to be set !
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
==	TokenNameEQUAL_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
MSG	TokenNameIdentifier	 MSG
)	TokenNameRPAREN	
msgcol_defined	TokenNameIdentifier	 msgcol defined
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
msgcol_defined	TokenNameIdentifier	 msgcol defined
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//create the column_list 	TokenNameCOMMENT_LINE	create the column_list 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logcol	TokenNameIdentifier	 logcol
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LogColumn	TokenNameIdentifier	 Log Column
)	TokenNameRPAREN	
logcols	TokenNameIdentifier	 logcols
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
ignore	TokenNameIdentifier	 ignore
||	TokenNameOR_OR	
!	TokenNameNOT	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
isWritable	TokenNameIdentifier	 is Writable
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
logtype	TokenNameIdentifier	 logtype
!=	TokenNameNOT_EQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
column_list	TokenNameIdentifier	 column list
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
column_list	TokenNameIdentifier	 column list
=	TokenNameEQUAL	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
column_list	TokenNameIdentifier	 column list
+=	TokenNamePLUS_EQUAL	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
logcol	TokenNameIdentifier	 logcol
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
rs	TokenNameIdentifier	 rs
=	TokenNameEQUAL	
stmt	TokenNameIdentifier	 stmt
.	TokenNameDOT	
executeQuery	TokenNameIdentifier	 execute Query
(	TokenNameLPAREN	
"SELECT "	TokenNameStringLiteral	SELECT 
+	TokenNamePLUS	
column_list	TokenNameIdentifier	 column list
+	TokenNamePLUS	
" FROM "	TokenNameStringLiteral	 FROM 
+	TokenNamePLUS	
table	TokenNameIdentifier	 table
+	TokenNamePLUS	
" WHERE 1 = 2"	TokenNameStringLiteral	 WHERE 1 = 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errormsg	TokenNameIdentifier	 errormsg
=	TokenNameEQUAL	
"Not ready to append ! Cannot select columns '"	TokenNameStringLiteral	Not ready to append ! Cannot select columns '
+	TokenNamePLUS	
column_list	TokenNameIdentifier	 column list
+	TokenNamePLUS	
"' of table "	TokenNameStringLiteral	' of table 
+	TokenNamePLUS	
table	TokenNameIdentifier	 table
+	TokenNamePLUS	
" !"	TokenNameStringLiteral	 !
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ready	TokenNameIdentifier	 ready
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return true, if this class is configured, else false. */	TokenNameCOMMENT_JAVADOC	 Return true, if this class is configured, else false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isConfigured	TokenNameIdentifier	 is Configured
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isconfigured	TokenNameIdentifier	 isconfigured
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return true, if this connection is open, else false. */	TokenNameCOMMENT_JAVADOC	 Return true, if this connection is open, else false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isConnected	TokenNameIdentifier	 is Connected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
isClosed	TokenNameIdentifier	 is Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
/** Return the internal error message stored in instance variable msg. */	TokenNameCOMMENT_JAVADOC	 Return the internal error message stored in instance variable msg. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getErrorMsg	TokenNameIdentifier	 get Error Msg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
errormsg	TokenNameIdentifier	 errormsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errormsg	TokenNameIdentifier	 errormsg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This class encapsulate all by class JDBCLogger needed data around a column */	TokenNameCOMMENT_JAVADOC	 This class encapsulate all by class JDBCLogger needed data around a column 
class	TokenNameclass	
LogColumn	TokenNameIdentifier	 Log Column
{	TokenNameLBRACE	
//column name 	TokenNameCOMMENT_LINE	column name 
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//column type 	TokenNameCOMMENT_LINE	column type 
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//not nullability means that this column is mandatory 	TokenNameCOMMENT_LINE	not nullability means that this column is mandatory 
boolean	TokenNameboolean	
nullable	TokenNameIdentifier	 nullable
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//isWritable means that the column can be updated, else column is only readable 	TokenNameCOMMENT_LINE	isWritable means that the column can be updated, else column is only readable 
boolean	TokenNameboolean	
isWritable	TokenNameIdentifier	 is Writable
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//if ignore is true, this column will be ignored by building sql-statements. 	TokenNameCOMMENT_LINE	if ignore is true, this column will be ignored by building sql-statements. 
boolean	TokenNameboolean	
ignore	TokenNameIdentifier	 ignore
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//Must be filled for not nullable columns ! In other case it is optional. 	TokenNameCOMMENT_LINE	Must be filled for not nullable columns ! In other case it is optional. 
int	TokenNameint	
logtype	TokenNameIdentifier	 logtype
=	TokenNameEQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//Generic storage for typewrapper-classes Long, String, etc... 	TokenNameCOMMENT_LINE	Generic storage for typewrapper-classes Long, String, etc... 
JDBCIDHandler	TokenNameIdentifier	 JDBCID Handler
idhandler	TokenNameIdentifier	 idhandler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This class contains all constants which are necessary to define a columns log-type. */	TokenNameCOMMENT_JAVADOC	 This class contains all constants which are necessary to define a columns log-type. 
class	TokenNameclass	
LogType	TokenNameIdentifier	 Log Type
{	TokenNameLBRACE	
//A column of this type will receive the message. 	TokenNameCOMMENT_LINE	A column of this type will receive the message. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MSG	TokenNameIdentifier	 MSG
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//A column of this type will be a unique identifier of the logged row. 	TokenNameCOMMENT_LINE	A column of this type will be a unique identifier of the logged row. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ID	TokenNameIdentifier	 ID
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//A column of this type will contain a static, one-time-defined value. 	TokenNameCOMMENT_LINE	A column of this type will contain a static, one-time-defined value. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STATIC	TokenNameIdentifier	 STATIC
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//A column of this type will be filled with an actual timestamp depending by the time the logging will be done. 	TokenNameCOMMENT_LINE	A column of this type will be filled with an actual timestamp depending by the time the logging will be done. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIMESTAMP	TokenNameIdentifier	 TIMESTAMP
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//A column of this type will contain no value and will not be included in logging insert-statement. 	TokenNameCOMMENT_LINE	A column of this type will contain no value and will not be included in logging insert-statement. 
//This could be a column which will be filled not by creation but otherwhere... 	TokenNameCOMMENT_LINE	This could be a column which will be filled not by creation but otherwhere... 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EMPTY	TokenNameIdentifier	 EMPTY
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isLogType	TokenNameIdentifier	 is Log Type
(	TokenNameLPAREN	
int	TokenNameint	
_lt	TokenNameIdentifier	 lt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_lt	TokenNameIdentifier	 lt
==	TokenNameEQUAL_EQUAL	
MSG	TokenNameIdentifier	 MSG
||	TokenNameOR_OR	
_lt	TokenNameIdentifier	 lt
==	TokenNameEQUAL_EQUAL	
STATIC	TokenNameIdentifier	 STATIC
||	TokenNameOR_OR	
_lt	TokenNameIdentifier	 lt
==	TokenNameEQUAL_EQUAL	
ID	TokenNameIdentifier	 ID
||	TokenNameOR_OR	
_lt	TokenNameIdentifier	 lt
==	TokenNameEQUAL_EQUAL	
TIMESTAMP	TokenNameIdentifier	 TIMESTAMP
||	TokenNameOR_OR	
_lt	TokenNameIdentifier	 lt
==	TokenNameEQUAL_EQUAL	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
parseLogType	TokenNameIdentifier	 parse Log Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
_lt	TokenNameIdentifier	 lt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_lt	TokenNameIdentifier	 lt
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"MSG"	TokenNameStringLiteral	MSG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
MSG	TokenNameIdentifier	 MSG
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_lt	TokenNameIdentifier	 lt
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ID"	TokenNameStringLiteral	ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
ID	TokenNameIdentifier	 ID
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_lt	TokenNameIdentifier	 lt
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"STATIC"	TokenNameStringLiteral	STATIC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
STATIC	TokenNameIdentifier	 STATIC
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_lt	TokenNameIdentifier	 lt
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"TIMESTAMP"	TokenNameStringLiteral	TIMESTAMP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
TIMESTAMP	TokenNameIdentifier	 TIMESTAMP
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_lt	TokenNameIdentifier	 lt
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"EMPTY"	TokenNameStringLiteral	EMPTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY	TokenNameIdentifier	 EMPTY
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
