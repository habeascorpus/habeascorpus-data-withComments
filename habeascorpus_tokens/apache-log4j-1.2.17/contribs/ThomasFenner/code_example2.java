/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Here is a code example to configure the JDBCAppender without a configuration-file 	TokenNameCOMMENT_LINE	Here is a code example to configure the JDBCAppender without a configuration-file 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
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
public	TokenNamepublic	
class	TokenNameclass	
Log4JTest	TokenNameIdentifier	 Log4 J Test
{	TokenNameLBRACE	
// Create a category instance for this class 	TokenNameCOMMENT_LINE	Create a category instance for this class 
static	TokenNamestatic	
Category	TokenNameIdentifier	 Category
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
Category	TokenNameIdentifier	 Category
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
Log4JTest	TokenNameIdentifier	 Log4 J Test
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A JDBCIDHandler 	TokenNameCOMMENT_LINE	A JDBCIDHandler 
MyIDHandler	TokenNameIdentifier	 My ID Handler
idhandler	TokenNameIdentifier	 idhandler
=	TokenNameEQUAL	
new	TokenNamenew	
MyIDHandler	TokenNameIdentifier	 My ID Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Ensure to have all necessary drivers installed ! 	TokenNameCOMMENT_LINE	Ensure to have all necessary drivers installed ! 
try	TokenNametry	
{	TokenNameLBRACE	
Driver	TokenNameIdentifier	 Driver
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Driver	TokenNameIdentifier	 Driver
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"oracle.jdbc.driver.OracleDriver"	TokenNameStringLiteral	oracle.jdbc.driver.OracleDriver
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DriverManager	TokenNameIdentifier	 Driver Manager
.	TokenNameDOT	
registerDriver	TokenNameIdentifier	 register Driver
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
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
// Set the priority which messages have to be logged 	TokenNameCOMMENT_LINE	Set the priority which messages have to be logged 
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a new instance of JDBCAppender 	TokenNameCOMMENT_LINE	Create a new instance of JDBCAppender 
JDBCAppender	TokenNameIdentifier	 JDBC Appender
ja	TokenNameIdentifier	 ja
=	TokenNameEQUAL	
new	TokenNamenew	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set options with method setOption() 	TokenNameCOMMENT_LINE	Set options with method setOption() 
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
.	TokenNameDOT	
CONNECTOR_OPTION	TokenNameIdentifier	 CONNECTOR  OPTION
,	TokenNameCOMMA	
"MyConnectionHandler"	TokenNameStringLiteral	MyConnectionHandler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
.	TokenNameDOT	
URL_OPTION	TokenNameIdentifier	 URL  OPTION
,	TokenNameCOMMA	
"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1521))(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1526)))(CONNECT_DATA=(SID=LENZI)))"	TokenNameStringLiteral	jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1521))(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1526)))(CONNECT_DATA=(SID=LENZI)))
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
.	TokenNameDOT	
USERNAME_OPTION	TokenNameIdentifier	 USERNAME  OPTION
,	TokenNameCOMMA	
"mex_pr_dev60"	TokenNameStringLiteral	mex_pr_dev60
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
.	TokenNameDOT	
PASSWORD_OPTION	TokenNameIdentifier	 PASSWORD  OPTION
,	TokenNameCOMMA	
"mex_pr_dev60"	TokenNameStringLiteral	mex_pr_dev60
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
.	TokenNameDOT	
TABLE_OPTION	TokenNameIdentifier	 TABLE  OPTION
,	TokenNameCOMMA	
"logtest"	TokenNameStringLiteral	logtest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// There are two ways to setup the column-descriptions : 	TokenNameCOMMENT_LINE	There are two ways to setup the column-descriptions : 
// 1. Use the the method setOption(JDBCAppender.COLUMNS_OPTION, column-description) 	TokenNameCOMMENT_LINE	1. Use the the method setOption(JDBCAppender.COLUMNS_OPTION, column-description) 
//ja.setOption(JDBCAppender.COLUMNS_OPTION, "id_seq~EMPTY id~ID~MyIDHandler msg~MSG created_on~TIMESTAMP created_by~STATIC~:-) Thomas Fenner (t.fenner@klopotek.de)"); 	TokenNameCOMMENT_LINE	ja.setOption(JDBCAppender.COLUMNS_OPTION, "id_seq~EMPTY id~ID~MyIDHandler msg~MSG created_on~TIMESTAMP created_by~STATIC~:-) Thomas Fenner (t.fenner@klopotek.de)"); 
// 2. Use the better way of coding with method setLogType(String columnname, int LogType.xxx, Object xxx) 	TokenNameCOMMENT_LINE	2. Use the better way of coding with method setLogType(String columnname, int LogType.xxx, Object xxx) 
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
setLogType	TokenNameIdentifier	 set Log Type
(	TokenNameLPAREN	
"id_seq"	TokenNameStringLiteral	id_seq
,	TokenNameCOMMA	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
setLogType	TokenNameIdentifier	 set Log Type
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
ID	TokenNameIdentifier	 ID
,	TokenNameCOMMA	
idhandler	TokenNameIdentifier	 idhandler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
setLogType	TokenNameIdentifier	 set Log Type
(	TokenNameLPAREN	
"msg"	TokenNameStringLiteral	msg
,	TokenNameCOMMA	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
MSG	TokenNameIdentifier	 MSG
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
setLogType	TokenNameIdentifier	 set Log Type
(	TokenNameLPAREN	
"created_on"	TokenNameStringLiteral	created_on
,	TokenNameCOMMA	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
TIMESTAMP	TokenNameIdentifier	 TIMESTAMP
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
setLogType	TokenNameIdentifier	 set Log Type
(	TokenNameLPAREN	
"created_by"	TokenNameStringLiteral	created_by
,	TokenNameCOMMA	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
STATIC	TokenNameIdentifier	 STATIC
,	TokenNameCOMMA	
"FEN"	TokenNameStringLiteral	FEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If you just want to perform a static sql-statement, forget about the table- and columns-options, 	TokenNameCOMMENT_LINE	If you just want to perform a static sql-statement, forget about the table- and columns-options, 
// and use this one : 	TokenNameCOMMENT_LINE	and use this one : 
//ja.setOption(JDBCAppender.SQL_OPTION, "INSERT INTO LOGTEST (id, msg, created_on, created_by) VALUES (1, @MSG@, sysdate, 'me')"); 	TokenNameCOMMENT_LINE	ja.setOption(JDBCAppender.SQL_OPTION, "INSERT INTO LOGTEST (id, msg, created_on, created_by) VALUES (1, @MSG@, sysdate, 'me')"); 
// other options 	TokenNameCOMMENT_LINE	other options 
//ja.setOption(JDBCAppender.BUFFER_OPTION, "1"); 	TokenNameCOMMENT_LINE	ja.setOption(JDBCAppender.BUFFER_OPTION, "1"); 
//ja.setOption(JDBCAppender.COMMIT_OPTION, "Y"); 	TokenNameCOMMENT_LINE	ja.setOption(JDBCAppender.COMMIT_OPTION, "Y"); 
// Define a layout 	TokenNameCOMMENT_LINE	Define a layout 
//ja.setLayout(new PatternLayout("%m")); 	TokenNameCOMMENT_LINE	ja.setLayout(new PatternLayout("%m")); 
// Add the appender to a category 	TokenNameCOMMENT_LINE	Add the appender to a category 
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
ja	TokenNameIdentifier	 ja
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// These messages with Priority >= setted priority will be logged to the database. 	TokenNameCOMMENT_LINE	These messages with Priority >= setted priority will be logged to the database. 
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"debug"	TokenNameStringLiteral	debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"info"	TokenNameStringLiteral	info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"error"	TokenNameStringLiteral	error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"fatal"	TokenNameStringLiteral	fatal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Implement a sample JDBCConnectionHandler 	TokenNameCOMMENT_LINE	Implement a sample JDBCConnectionHandler 
class	TokenNameclass	
MyConnectionHandler	TokenNameIdentifier	 My Connection Handler
implements	TokenNameimplements	
JDBCConnectionHandler	TokenNameIdentifier	 JDBC Connection Handler
{	TokenNameLBRACE	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//Default connection 	TokenNameCOMMENT_LINE	Default connection 
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1521))(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1526)))(CONNECT_DATA=(SID=LENZI)))"	TokenNameStringLiteral	jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1521))(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1526)))(CONNECT_DATA=(SID=LENZI)))
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
=	TokenNameEQUAL	
"mex_pr_dev60"	TokenNameStringLiteral	mex_pr_dev60
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
"mex_pr_dev60"	TokenNameStringLiteral	mex_pr_dev60
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Connection	TokenNameIdentifier	 Connection
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
username	TokenNameIdentifier	 username
,	TokenNameCOMMA	
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Connection	TokenNameIdentifier	 Connection
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
_url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
_username	TokenNameIdentifier	 username
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
_password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
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
con	TokenNameIdentifier	 con
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
DriverManager	TokenNameIdentifier	 Driver Manager
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
_url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
_username	TokenNameIdentifier	 username
,	TokenNameCOMMA	
_password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setAutoCommit	TokenNameIdentifier	 set Auto Commit
(	TokenNameLPAREN	
false	TokenNamefalse	
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
return	TokenNamereturn	
con	TokenNameIdentifier	 con
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Implement a sample JDBCIDHandler 	TokenNameCOMMENT_LINE	Implement a sample JDBCIDHandler 
class	TokenNameclass	
MyIDHandler	TokenNameIdentifier	 My ID Handler
implements	TokenNameimplements	
JDBCIDHandler	TokenNameIdentifier	 JDBCID Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
long	TokenNamelong	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
