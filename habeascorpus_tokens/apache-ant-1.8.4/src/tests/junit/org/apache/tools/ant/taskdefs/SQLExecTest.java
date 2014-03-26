/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
Driver	TokenNameIdentifier	 Driver
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
SQLException	TokenNameIdentifier	 SQL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
DriverPropertyInfo	TokenNameIdentifier	 Driver Property Info
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Simple testcase to test for driver caching. * To test for your own database, you may need to tweak getProperties(int) * and add a couple of keys. see testOracle and testMySQL for an example. * * It would be much better to extend this testcase by using HSQL * as the test db, so that a db is really used. * */	TokenNameCOMMENT_JAVADOC	 Simple testcase to test for driver caching. To test for your own database, you may need to tweak getProperties(int) and add a couple of keys. see testOracle and testMySQL for an example. * It would be much better to extend this testcase by using HSQL as the test db, so that a db is really used. 
public	TokenNamepublic	
class	TokenNameclass	
SQLExecTest	TokenNameIdentifier	 SQL Exec Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
// some database keys, see #getProperties(int) 	TokenNameCOMMENT_LINE	some database keys, see #getProperties(int) 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NULL	TokenNameIdentifier	 NULL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
ORACLE	TokenNameIdentifier	 ORACLE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
MYSQL	TokenNameIdentifier	 MYSQL
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// keys used in properties. 	TokenNameCOMMENT_LINE	keys used in properties. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DRIVER	TokenNameIdentifier	 DRIVER
=	TokenNameEQUAL	
"driver"	TokenNameStringLiteral	driver
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
USER	TokenNameIdentifier	 USER
=	TokenNameEQUAL	
"user"	TokenNameStringLiteral	user
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PASSWORD	TokenNameIdentifier	 PASSWORD
=	TokenNameEQUAL	
"password"	TokenNameStringLiteral	password
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
URL	TokenNameIdentifier	 URL
=	TokenNameEQUAL	
"url"	TokenNameStringLiteral	url
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PATH	TokenNameIdentifier	 PATH
=	TokenNameEQUAL	
"path"	TokenNameStringLiteral	path
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
SQL	TokenNameIdentifier	 SQL
=	TokenNameEQUAL	
"sql"	TokenNameStringLiteral	sql
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SQLExecTest	TokenNameIdentifier	 SQL Exec Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// make sure the cache is cleared. 	TokenNameCOMMENT_LINE	make sure the cache is cleared. 
JDBCTask	TokenNameIdentifier	 JDBC Task
.	TokenNameDOT	
getLoaderMap	TokenNameIdentifier	 get Loader Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// simple test to ensure that the caching does work... 	TokenNameCOMMENT_LINE	simple test to ensure that the caching does work... 
public	TokenNamepublic	
void	TokenNamevoid	
testDriverCaching	TokenNameIdentifier	 test Driver Caching
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SQLExec	TokenNameIdentifier	 SQL Exec
sql	TokenNameIdentifier	 sql
=	TokenNameEQUAL	
createTask	TokenNameIdentifier	 create Task
(	TokenNameLPAREN	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
SQLExec	TokenNameIdentifier	 SQL Exec
.	TokenNameDOT	
getLoaderMap	TokenNameIdentifier	 get Loader Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
NULL_DRIVER	TokenNameIdentifier	 NULL  DRIVER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No suitable Driver"	TokenNameStringLiteral	No suitable Driver
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
SQLExec	TokenNameIdentifier	 SQL Exec
.	TokenNameDOT	
getLoaderMap	TokenNameIdentifier	 get Loader Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
NULL_DRIVER	TokenNameIdentifier	 NULL  DRIVER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
getLoader	TokenNameIdentifier	 get Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
JDBCTask	TokenNameIdentifier	 JDBC Task
.	TokenNameDOT	
getLoaderMap	TokenNameIdentifier	 get Loader Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
NULL_DRIVER	TokenNameIdentifier	 NULL  DRIVER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLoader	TokenNameIdentifier	 Class Loader
loader1	TokenNameIdentifier	 loader1
=	TokenNameEQUAL	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
getLoader	TokenNameIdentifier	 get Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2nd run.. 	TokenNameCOMMENT_LINE	2nd run.. 
sql	TokenNameIdentifier	 sql
=	TokenNameEQUAL	
createTask	TokenNameIdentifier	 create Task
(	TokenNameLPAREN	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the driver must still be cached. 	TokenNameCOMMENT_LINE	the driver must still be cached. 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
JDBCTask	TokenNameIdentifier	 JDBC Task
.	TokenNameDOT	
getLoaderMap	TokenNameIdentifier	 get Loader Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
NULL_DRIVER	TokenNameIdentifier	 NULL  DRIVER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"No suitable Driver"	TokenNameStringLiteral	No suitable Driver
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
JDBCTask	TokenNameIdentifier	 JDBC Task
.	TokenNameDOT	
getLoaderMap	TokenNameIdentifier	 get Loader Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
NULL_DRIVER	TokenNameIdentifier	 NULL  DRIVER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
getLoader	TokenNameIdentifier	 get Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
JDBCTask	TokenNameIdentifier	 JDBC Task
.	TokenNameDOT	
getLoaderMap	TokenNameIdentifier	 get Loader Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
NULL_DRIVER	TokenNameIdentifier	 NULL  DRIVER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
loader1	TokenNameIdentifier	 loader1
,	TokenNameCOMMA	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
getLoader	TokenNameIdentifier	 get Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNull	TokenNameIdentifier	 test Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
doMultipleCalls	TokenNameIdentifier	 do Multiple Calls
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public void testOracle(){ doMultipleCalls(1000, ORACLE, true, false); }*/	TokenNameCOMMENT_BLOCK	 public void testOracle(){ doMultipleCalls(1000, ORACLE, true, false); }
/* public void testMySQL(){ doMultipleCalls(1000, MYSQL, true, false); }*/	TokenNameCOMMENT_BLOCK	 public void testMySQL(){ doMultipleCalls(1000, MYSQL, true, false); }
/** * run a sql tasks multiple times. * @param calls number of times to execute the task * @param database the database to execute on. * @param caching should caching be enabled ? * @param catchexception true to catch exception for each call, false if not. */	TokenNameCOMMENT_JAVADOC	 run a sql tasks multiple times. @param calls number of times to execute the task @param database the database to execute on. @param caching should caching be enabled ? @param catchexception true to catch exception for each call, false if not. 
protected	TokenNameprotected	
void	TokenNamevoid	
doMultipleCalls	TokenNameIdentifier	 do Multiple Calls
(	TokenNameLPAREN	
int	TokenNameint	
calls	TokenNameIdentifier	 calls
,	TokenNameCOMMA	
int	TokenNameint	
database	TokenNameIdentifier	 database
,	TokenNameCOMMA	
boolean	TokenNameboolean	
caching	TokenNameIdentifier	 caching
,	TokenNameCOMMA	
boolean	TokenNameboolean	
catchexception	TokenNameIdentifier	 catchexception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
database	TokenNameIdentifier	 database
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
calls	TokenNameIdentifier	 calls
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SQLExec	TokenNameIdentifier	 SQL Exec
sql	TokenNameIdentifier	 sql
=	TokenNameEQUAL	
createTask	TokenNameIdentifier	 create Task
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
setCaching	TokenNameIdentifier	 set Caching
(	TokenNameLPAREN	
caching	TokenNameIdentifier	 caching
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
catchexception	TokenNameIdentifier	 catchexception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a task from a set of properties * @see #getProperties(int) */	TokenNameCOMMENT_JAVADOC	 Create a task from a set of properties @see #getProperties(int) 
protected	TokenNameprotected	
SQLExec	TokenNameIdentifier	 SQL Exec
createTask	TokenNameIdentifier	 create Task
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SQLExec	TokenNameIdentifier	 SQL Exec
sql	TokenNameIdentifier	 sql
=	TokenNameEQUAL	
new	TokenNamenew	
SQLExec	TokenNameIdentifier	 SQL Exec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
setDriver	TokenNameIdentifier	 set Driver
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
DRIVER	TokenNameIdentifier	 DRIVER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
setUserid	TokenNameIdentifier	 set Userid
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
USER	TokenNameIdentifier	 USER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
PASSWORD	TokenNameIdentifier	 PASSWORD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
PATH	TokenNameIdentifier	 PATH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
SQL	TokenNameIdentifier	 SQL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sql	TokenNameIdentifier	 sql
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * try to find the path from a resource (jar file or directory name) * so that it can be used as a classpath to load the resource. */	TokenNameCOMMENT_JAVADOC	 try to find the path from a resource (jar file or directory name) so that it can be used as a classpath to load the resource. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
findResourcePath	TokenNameIdentifier	 find Resource Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"jar:file:"	TokenNameStringLiteral	jar:file:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pling	TokenNameIdentifier	 pling
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
"jar:file:"	TokenNameStringLiteral	jar:file:
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pling	TokenNameIdentifier	 pling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:"	TokenNameStringLiteral	file:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tail	TokenNameIdentifier	 tail
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
"file:"	TokenNameStringLiteral	file:
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tail	TokenNameIdentifier	 tail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns a configuration associated to a specific database. * If you want to test on your specific base, you'd better * tweak this to make it run or add your own database. * The driver lib should be dropped into the system classloader. */	TokenNameCOMMENT_JAVADOC	 returns a configuration associated to a specific database. If you want to test on your specific base, you'd better tweak this to make it run or add your own database. The driver lib should be dropped into the system classloader. 
protected	TokenNameprotected	
Properties	TokenNameIdentifier	 Properties
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
int	TokenNameint	
database	TokenNameIdentifier	 database
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
database	TokenNameIdentifier	 database
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ORACLE	TokenNameIdentifier	 ORACLE
:	TokenNameCOLON	
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
"oracle.jdbc.driver.OracleDriver"	TokenNameStringLiteral	oracle.jdbc.driver.OracleDriver
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"jdbc:oracle:thin:@127.0.0.1:1521:orcl"	TokenNameStringLiteral	jdbc:oracle:thin:@127.0.0.1:1521:orcl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MYSQL	TokenNameIdentifier	 MYSQL
:	TokenNameCOLON	
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
"org.gjt.mm.mysql.Driver"	TokenNameStringLiteral	org.gjt.mm.mysql.Driver
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"jdbc:mysql://127.0.0.1:3306/test"	TokenNameStringLiteral	jdbc:mysql://127.0.0.1:3306/test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NULL	TokenNameIdentifier	 NULL
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
NULL_DRIVER	TokenNameIdentifier	 NULL  DRIVER
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"jdbc:database://hostname:port/name"	TokenNameStringLiteral	jdbc:database://hostname:port/name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// look for the driver path... 	TokenNameCOMMENT_LINE	look for the driver path... 
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
findResourcePath	TokenNameIdentifier	 find Resource Path
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
DRIVER	TokenNameIdentifier	 DRIVER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
PATH	TokenNameIdentifier	 PATH
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SQL	TokenNameIdentifier	 SQL
,	TokenNameCOMMA	
"create table OOME_TEST(X INTEGER NOT NULL); drop table if exists OOME_TEST;"	TokenNameStringLiteral	create table OOME_TEST(X INTEGER NOT NULL); drop table if exists OOME_TEST;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
props	TokenNameIdentifier	 props
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** helper method to build properties */	TokenNameCOMMENT_JAVADOC	 helper method to build properties 
protected	TokenNameprotected	
Properties	TokenNameIdentifier	 Properties
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
driver	TokenNameIdentifier	 driver
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
user	TokenNameIdentifier	 user
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pwd	TokenNameIdentifier	 pwd
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DRIVER	TokenNameIdentifier	 DRIVER
,	TokenNameCOMMA	
driver	TokenNameIdentifier	 driver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
USER	TokenNameIdentifier	 USER
,	TokenNameCOMMA	
user	TokenNameIdentifier	 user
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
PASSWORD	TokenNameIdentifier	 PASSWORD
,	TokenNameCOMMA	
pwd	TokenNameIdentifier	 pwd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
props	TokenNameIdentifier	 props
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//--- NULL JDBC driver just for simple test since there are no db driver 	TokenNameCOMMENT_LINE	--- NULL JDBC driver just for simple test since there are no db driver 
// available as a default in Ant :) 	TokenNameCOMMENT_LINE	available as a default in Ant :) 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
NULL_DRIVER	TokenNameIdentifier	 NULL  DRIVER
=	TokenNameEQUAL	
NullDriver	TokenNameIdentifier	 Null Driver
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
NullDriver	TokenNameIdentifier	 Null Driver
implements	TokenNameimplements	
Driver	TokenNameIdentifier	 Driver
{	TokenNameLBRACE	
public	TokenNamepublic	
Connection	TokenNameIdentifier	 Connection
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
acceptsURL	TokenNameIdentifier	 accepts URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DriverPropertyInfo	TokenNameIdentifier	 Driver Property Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPropertyInfo	TokenNameIdentifier	 get Property Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DriverPropertyInfo	TokenNameIdentifier	 Driver Property Info
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMajorVersion	TokenNameIdentifier	 get Major Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMinorVersion	TokenNameIdentifier	 get Minor Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
jdbcCompliant	TokenNameIdentifier	 jdbc Compliant
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
getParentLogger	TokenNameIdentifier	 get Parent Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/*throws SQLFeatureNotSupportedException*/	TokenNameCOMMENT_BLOCK	throws SQLFeatureNotSupportedException
{	TokenNameLBRACE	
return	TokenNamereturn	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getAnonymousLogger	TokenNameIdentifier	 get Anonymous Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLastDelimiterPositionNormalModeStrict	TokenNameIdentifier	 test Last Delimiter Position Normal Mode Strict
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SQLExec	TokenNameIdentifier	 SQL Exec
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
SQLExec	TokenNameIdentifier	 SQL Exec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"GO"	TokenNameStringLiteral	GO
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"ab;"	TokenNameStringLiteral	ab;
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDelimiter	TokenNameIdentifier	 set Delimiter
(	TokenNameLPAREN	
"GO"	TokenNameStringLiteral	GO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"GO "	TokenNameStringLiteral	GO 
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"go"	TokenNameStringLiteral	go
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"GO"	TokenNameStringLiteral	GO
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLastDelimiterPositionNormalModeNonStrict	TokenNameIdentifier	 test Last Delimiter Position Normal Mode Non Strict
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SQLExec	TokenNameIdentifier	 SQL Exec
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
SQLExec	TokenNameIdentifier	 SQL Exec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setStrictDelimiterMatching	TokenNameIdentifier	 set Strict Delimiter Matching
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"GO"	TokenNameStringLiteral	GO
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"ab;"	TokenNameStringLiteral	ab;
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDelimiter	TokenNameIdentifier	 set Delimiter
(	TokenNameLPAREN	
"GO"	TokenNameStringLiteral	GO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"GO "	TokenNameStringLiteral	GO 
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"go"	TokenNameStringLiteral	go
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"GO"	TokenNameStringLiteral	GO
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLastDelimiterPositionRowModeStrict	TokenNameIdentifier	 test Last Delimiter Position Row Mode Strict
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SQLExec	TokenNameIdentifier	 SQL Exec
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
SQLExec	TokenNameIdentifier	 SQL Exec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SQLExec	TokenNameIdentifier	 SQL Exec
.	TokenNameDOT	
DelimiterType	TokenNameIdentifier	 Delimiter Type
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
SQLExec	TokenNameIdentifier	 SQL Exec
.	TokenNameDOT	
DelimiterType	TokenNameIdentifier	 Delimiter Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"row"	TokenNameStringLiteral	row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDelimiterType	TokenNameIdentifier	 set Delimiter Type
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"GO"	TokenNameStringLiteral	GO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"ab"	TokenNameStringLiteral	ab
)	TokenNameRPAREN	
,	TokenNameCOMMA	
";"	TokenNameStringLiteral	;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDelimiter	TokenNameIdentifier	 set Delimiter
(	TokenNameLPAREN	
"GO"	TokenNameStringLiteral	GO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"GO "	TokenNameStringLiteral	GO 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"go"	TokenNameStringLiteral	go
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"ab"	TokenNameStringLiteral	ab
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"GO"	TokenNameStringLiteral	GO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLastDelimiterPositionRowModeNonStrict	TokenNameIdentifier	 test Last Delimiter Position Row Mode Non Strict
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SQLExec	TokenNameIdentifier	 SQL Exec
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
SQLExec	TokenNameIdentifier	 SQL Exec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SQLExec	TokenNameIdentifier	 SQL Exec
.	TokenNameDOT	
DelimiterType	TokenNameIdentifier	 Delimiter Type
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
SQLExec	TokenNameIdentifier	 SQL Exec
.	TokenNameDOT	
DelimiterType	TokenNameIdentifier	 Delimiter Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"row"	TokenNameStringLiteral	row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDelimiterType	TokenNameIdentifier	 set Delimiter Type
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setStrictDelimiterMatching	TokenNameIdentifier	 set Strict Delimiter Matching
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"GO"	TokenNameStringLiteral	GO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"ab"	TokenNameStringLiteral	ab
)	TokenNameRPAREN	
,	TokenNameCOMMA	
";"	TokenNameStringLiteral	;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDelimiter	TokenNameIdentifier	 set Delimiter
(	TokenNameLPAREN	
"GO"	TokenNameStringLiteral	GO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"abcd"	TokenNameStringLiteral	abcd
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"GO "	TokenNameStringLiteral	GO 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"go"	TokenNameStringLiteral	go
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"go"	TokenNameStringLiteral	go
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastDelimiterPosition	TokenNameIdentifier	 last Delimiter Position
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"ab"	TokenNameStringLiteral	ab
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"GO"	TokenNameStringLiteral	GO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
