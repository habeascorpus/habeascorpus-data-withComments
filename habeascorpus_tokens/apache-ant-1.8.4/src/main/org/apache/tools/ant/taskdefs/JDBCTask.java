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
Connection	TokenNameIdentifier	 Connection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
DatabaseMetaData	TokenNameIdentifier	 Database Meta Data
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
SQLException	TokenNameIdentifier	 SQL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
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
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
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
Task	TokenNameIdentifier	 Task
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Path	TokenNameIdentifier	 Path
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Reference	TokenNameIdentifier	 Reference
;	TokenNameSEMICOLON	
/** * Handles JDBC configuration needed by SQL type tasks. * <p> * The following example class prints the contents of the first column of each row in TableName. *</p> *<code><pre> package examples; import java.sql.Connection; import java.sql.ResultSet; import java.sql.SQLException; import java.sql.Statement; import org.apache.tools.ant.BuildException; import org.apache.tools.ant.taskdefs.JDBCTask; public class SQLExampleTask extends JDBCTask { private String tableName; public void execute() throws BuildException { Connection conn = getConnection(); Statement stmt=null; try { if (tableName == null) { throw new BuildException("TableName must be specified",location); } String sql = "SELECT * FROM "+tableName; stmt= conn.createStatement(); ResultSet rs = stmt.executeQuery(sql); while (rs.next()) { log(rs.getObject(1).toString()); } } catch (SQLException e) { } finally { if (stmt != null) { try {stmt.close();}catch (SQLException ingore) {} } if (conn != null) { try {conn.close();}catch (SQLException ingore) {} } } } public void setTableName(String tableName) { this.tableName = tableName; } } </pre></code> * @since Ant 1.5 * */	TokenNameCOMMENT_JAVADOC	 Handles JDBC configuration needed by SQL type tasks. <p> The following example class prints the contents of the first column of each row in TableName. *</p> *<code><pre> package examples; import java.sql.Connection; import java.sql.ResultSet; import java.sql.SQLException; import java.sql.Statement; import org.apache.tools.ant.BuildException; import org.apache.tools.ant.taskdefs.JDBCTask; public class SQLExampleTask extends JDBCTask { private String tableName; public void execute() throws BuildException { Connection conn = getConnection(); Statement stmt=null; try { if (tableName == null) { throw new BuildException("TableName must be specified",location); } String sql = "SELECT FROM "+tableName; stmt= conn.createStatement(); ResultSet rs = stmt.executeQuery(sql); while (rs.next()) { log(rs.getObject(1).toString()); } } catch (SQLException e) { } finally { if (stmt != null) { try {stmt.close();}catch (SQLException ingore) {} } if (conn != null) { try {conn.close();}catch (SQLException ingore) {} } } } public void setTableName(String tableName) { this.tableName = tableName; } } </pre></code> @since Ant 1.5 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
JDBCTask	TokenNameIdentifier	 JDBC Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HASH_TABLE_SIZE	TokenNameIdentifier	 HASH  TABLE  SIZE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Used for caching loaders / driver. This is to avoid * getting an OutOfMemoryError when calling this task * multiple times in a row. */	TokenNameCOMMENT_JAVADOC	 Used for caching loaders / driver. This is to avoid getting an OutOfMemoryError when calling this task multiple times in a row. 
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
loaderMap	TokenNameIdentifier	 loader Map
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
HASH_TABLE_SIZE	TokenNameIdentifier	 HASH  TABLE  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
caching	TokenNameIdentifier	 caching
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
loader	TokenNameIdentifier	 loader
;	TokenNameSEMICOLON	
/** * Autocommit flag. Default value is false */	TokenNameCOMMENT_JAVADOC	 Autocommit flag. Default value is false 
private	TokenNameprivate	
boolean	TokenNameboolean	
autocommit	TokenNameIdentifier	 autocommit
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * DB driver. */	TokenNameCOMMENT_JAVADOC	 DB driver. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
driver	TokenNameIdentifier	 driver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * DB url. */	TokenNameCOMMENT_JAVADOC	 DB url. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * User name. */	TokenNameCOMMENT_JAVADOC	 User name. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
userId	TokenNameIdentifier	 user Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Password */	TokenNameCOMMENT_JAVADOC	 Password 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * RDBMS Product needed for this SQL. **/	TokenNameCOMMENT_JAVADOC	 RDBMS Product needed for this SQL. *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
rdbms	TokenNameIdentifier	 rdbms
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * RDBMS Version needed for this SQL. **/	TokenNameCOMMENT_JAVADOC	 RDBMS Version needed for this SQL. *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * whether the task fails when ant fails to connect to the database. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 whether the task fails when ant fails to connect to the database. @since Ant 1.8.0 
private	TokenNameprivate	
boolean	TokenNameboolean	
failOnConnectionError	TokenNameIdentifier	 fail On Connection Error
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Additional properties to put into the JDBC connection string. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Additional properties to put into the JDBC connection string. * @since Ant 1.8.0 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
/*<Property>*/	TokenNameCOMMENT_BLOCK	<Property>
connectionProperties	TokenNameIdentifier	 connection Properties
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the classpath for loading the driver. * @param classpath The classpath to set */	TokenNameCOMMENT_JAVADOC	 Sets the classpath for loading the driver. @param classpath The classpath to set 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Caching loaders / driver. This is to avoid * getting an OutOfMemoryError when calling this task * multiple times in a row; default: true * @param enable a <code>boolean</code> value */	TokenNameCOMMENT_JAVADOC	 Caching loaders / driver. This is to avoid getting an OutOfMemoryError when calling this task multiple times in a row; default: true @param enable a <code>boolean</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setCaching	TokenNameIdentifier	 set Caching
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enable	TokenNameIdentifier	 enable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
caching	TokenNameIdentifier	 caching
=	TokenNameEQUAL	
enable	TokenNameIdentifier	 enable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a path to the classpath for loading the driver. * @return a path to be configured */	TokenNameCOMMENT_JAVADOC	 Add a path to the classpath for loading the driver. @return a path to be configured 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the classpath for loading the driver * using the classpath reference. * @param r a reference to a classpath */	TokenNameCOMMENT_JAVADOC	 Set the classpath for loading the driver using the classpath reference. @param r a reference to a classpath 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspathRef	TokenNameIdentifier	 set Classpath Ref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Class name of the JDBC driver; required. * @param driver The driver to set */	TokenNameCOMMENT_JAVADOC	 Class name of the JDBC driver; required. @param driver The driver to set 
public	TokenNamepublic	
void	TokenNamevoid	
setDriver	TokenNameIdentifier	 set Driver
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
driver	TokenNameIdentifier	 driver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
driver	TokenNameIdentifier	 driver
=	TokenNameEQUAL	
driver	TokenNameIdentifier	 driver
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the database connection URL; required. * @param url The url to set */	TokenNameCOMMENT_JAVADOC	 Sets the database connection URL; required. @param url The url to set 
public	TokenNamepublic	
void	TokenNamevoid	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the password; required. * @param password The password to set */	TokenNameCOMMENT_JAVADOC	 Sets the password; required. @param password The password to set 
public	TokenNamepublic	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Auto commit flag for database connection; * optional, default false. * @param autocommit The autocommit to set */	TokenNameCOMMENT_JAVADOC	 Auto commit flag for database connection; optional, default false. @param autocommit The autocommit to set 
public	TokenNamepublic	
void	TokenNamevoid	
setAutocommit	TokenNameIdentifier	 set Autocommit
(	TokenNameLPAREN	
boolean	TokenNameboolean	
autocommit	TokenNameIdentifier	 autocommit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
autocommit	TokenNameIdentifier	 autocommit
=	TokenNameEQUAL	
autocommit	TokenNameIdentifier	 autocommit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute task only if the lower case product name * of the DB matches this * @param rdbms The rdbms to set */	TokenNameCOMMENT_JAVADOC	 Execute task only if the lower case product name of the DB matches this @param rdbms The rdbms to set 
public	TokenNamepublic	
void	TokenNamevoid	
setRdbms	TokenNameIdentifier	 set Rdbms
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rdbms	TokenNameIdentifier	 rdbms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rdbms	TokenNameIdentifier	 rdbms
=	TokenNameEQUAL	
rdbms	TokenNameIdentifier	 rdbms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the version string, execute task only if * rdbms version match; optional. * @param version The version to set */	TokenNameCOMMENT_JAVADOC	 Sets the version string, execute task only if rdbms version match; optional. @param version The version to set 
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * whether the task should cause the build to fail if it cannot * connect to the database. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 whether the task should cause the build to fail if it cannot connect to the database. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setFailOnConnectionError	TokenNameIdentifier	 set Fail On Connection Error
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
failOnConnectionError	TokenNameIdentifier	 fail On Connection Error
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Verify we are connected to the correct RDBMS * @param conn the jdbc connection * @return true if we are connected to the correct RDBMS */	TokenNameCOMMENT_JAVADOC	 Verify we are connected to the correct RDBMS @param conn the jdbc connection @return true if we are connected to the correct RDBMS 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isValidRdbms	TokenNameIdentifier	 is Valid Rdbms
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
conn	TokenNameIdentifier	 conn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rdbms	TokenNameIdentifier	 rdbms
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DatabaseMetaData	TokenNameIdentifier	 Database Meta Data
dmd	TokenNameIdentifier	 dmd
=	TokenNameEQUAL	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
getMetaData	TokenNameIdentifier	 get Meta Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rdbms	TokenNameIdentifier	 rdbms
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
theVendor	TokenNameIdentifier	 the Vendor
=	TokenNameEQUAL	
dmd	TokenNameIdentifier	 dmd
.	TokenNameDOT	
getDatabaseProductName	TokenNameIdentifier	 get Database Product Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"RDBMS = "	TokenNameStringLiteral	RDBMS = 
+	TokenNamePLUS	
theVendor	TokenNameIdentifier	 the Vendor
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
theVendor	TokenNameIdentifier	 the Vendor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
theVendor	TokenNameIdentifier	 the Vendor
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
rdbms	TokenNameIdentifier	 rdbms
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Not the required RDBMS: "	TokenNameStringLiteral	Not the required RDBMS: 
+	TokenNamePLUS	
rdbms	TokenNameIdentifier	 rdbms
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
theVersion	TokenNameIdentifier	 the Version
=	TokenNameEQUAL	
dmd	TokenNameIdentifier	 dmd
.	TokenNameDOT	
getDatabaseProductVersion	TokenNameIdentifier	 get Database Product Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Version = "	TokenNameStringLiteral	Version = 
+	TokenNamePLUS	
theVersion	TokenNameIdentifier	 the Version
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
theVersion	TokenNameIdentifier	 the Version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
theVersion	TokenNameIdentifier	 the Version
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
||	TokenNameOR_OR	
theVersion	TokenNameIdentifier	 the Version
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Not the required version: ""	TokenNameStringLiteral	Not the required version: "
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SQLException	TokenNameIdentifier	 SQL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Could not get the required information 	TokenNameCOMMENT_LINE	Could not get the required information 
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Failed to obtain required RDBMS information"	TokenNameStringLiteral	Failed to obtain required RDBMS information
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the cache of loaders and drivers. * @return a hashtable */	TokenNameCOMMENT_JAVADOC	 Get the cache of loaders and drivers. @return a hashtable 
protected	TokenNameprotected	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
getLoaderMap	TokenNameIdentifier	 get Loader Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
loaderMap	TokenNameIdentifier	 loader Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the classloader used to create a driver. * @return the classloader */	TokenNameCOMMENT_JAVADOC	 Get the classloader used to create a driver. @return the classloader 
protected	TokenNameprotected	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
getLoader	TokenNameIdentifier	 get Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
loader	TokenNameIdentifier	 loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Additional properties to put into the JDBC connection string. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Additional properties to put into the JDBC connection string. * @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
addConnectionProperty	TokenNameIdentifier	 add Connection Property
(	TokenNameLPAREN	
Property	TokenNameIdentifier	 Property
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
{	TokenNameLBRACE	
connectionProperties	TokenNameIdentifier	 connection Properties
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new Connection as using the driver, url, userid and password * specified. * * The calling method is responsible for closing the connection. * * @return Connection the newly created connection or null if the * connection failed and failOnConnectionError is false. * @throws BuildException if the UserId/Password/Url is not set or there * is no suitable driver or the driver fails to load. */	TokenNameCOMMENT_JAVADOC	 Creates a new Connection as using the driver, url, userid and password specified. * The calling method is responsible for closing the connection. * @return Connection the newly created connection or null if the connection failed and failOnConnectionError is false. @throws BuildException if the UserId/Password/Url is not set or there is no suitable driver or the driver fails to load. 
protected	TokenNameprotected	
Connection	TokenNameIdentifier	 Connection
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
userId	TokenNameIdentifier	 user Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"UserId attribute must be set!"	TokenNameStringLiteral	UserId attribute must be set!
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
password	TokenNameIdentifier	 password
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Password attribute must be set!"	TokenNameStringLiteral	Password attribute must be set!
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Url attribute must be set!"	TokenNameStringLiteral	Url attribute must be set!
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"connecting to "	TokenNameStringLiteral	connecting to 
+	TokenNamePLUS	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"user"	TokenNameStringLiteral	user
,	TokenNameCOMMA	
getUserId	TokenNameIdentifier	 get User Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"password"	TokenNameStringLiteral	password
,	TokenNameCOMMA	
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
connectionProperties	TokenNameIdentifier	 connection Properties
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Property	TokenNameIdentifier	 Property
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Property	TokenNameIdentifier	 Property
)	TokenNameRPAREN	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Only name/value pairs are supported as connection"	TokenNameStringLiteral	Only name/value pairs are supported as connection
+	TokenNamePLUS	
" properties."	TokenNameStringLiteral	 properties.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Setting connection property "	TokenNameStringLiteral	Setting connection property 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Connection	TokenNameIdentifier	 Connection
conn	TokenNameIdentifier	 conn
=	TokenNameEQUAL	
getDriver	TokenNameIdentifier	 get Driver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
conn	TokenNameIdentifier	 conn
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Driver doesn't understand the URL 	TokenNameCOMMENT_LINE	Driver doesn't understand the URL 
throw	TokenNamethrow	
new	TokenNamenew	
SQLException	TokenNameIdentifier	 SQL Exception
(	TokenNameLPAREN	
"No suitable Driver for "	TokenNameStringLiteral	No suitable Driver for 
+	TokenNamePLUS	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
setAutoCommit	TokenNameIdentifier	 set Auto Commit
(	TokenNameLPAREN	
autocommit	TokenNameIdentifier	 autocommit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
conn	TokenNameIdentifier	 conn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SQLException	TokenNameIdentifier	 SQL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// failed to connect 	TokenNameCOMMENT_LINE	failed to connect 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
failOnConnectionError	TokenNameIdentifier	 fail On Connection Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Failed to connect: "	TokenNameStringLiteral	Failed to connect: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets an instance of the required driver. * Uses the ant class loader and the optionally the provided classpath. * @return Driver * @throws BuildException */	TokenNameCOMMENT_JAVADOC	 Gets an instance of the required driver. Uses the ant class loader and the optionally the provided classpath. @return Driver @throws BuildException 
private	TokenNameprivate	
Driver	TokenNameIdentifier	 Driver
getDriver	TokenNameIdentifier	 get Driver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
driver	TokenNameIdentifier	 driver
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Driver attribute must be set!"	TokenNameStringLiteral	Driver attribute must be set!
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Driver	TokenNameIdentifier	 Driver
driverInstance	TokenNameIdentifier	 driver Instance
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
dc	TokenNameIdentifier	 dc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check first that it is not already loaded otherwise 	TokenNameCOMMENT_LINE	check first that it is not already loaded otherwise 
// consecutive runs seems to end into an OutOfMemoryError 	TokenNameCOMMENT_LINE	consecutive runs seems to end into an OutOfMemoryError 
// or it fails when there is a native library to load 	TokenNameCOMMENT_LINE	or it fails when there is a native library to load 
// several times. 	TokenNameCOMMENT_LINE	several times. 
// this is far from being perfect but should work 	TokenNameCOMMENT_LINE	this is far from being perfect but should work 
// in most cases. 	TokenNameCOMMENT_LINE	in most cases. 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
loaderMap	TokenNameIdentifier	 loader Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
caching	TokenNameIdentifier	 caching
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
)	TokenNameRPAREN	
loaderMap	TokenNameIdentifier	 loader Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
driver	TokenNameIdentifier	 driver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Loading "	TokenNameStringLiteral	Loading 
+	TokenNamePLUS	
driver	TokenNameIdentifier	 driver
+	TokenNamePLUS	
" using AntClassLoader with classpath "	TokenNameStringLiteral	 using AntClassLoader with classpath 
+	TokenNamePLUS	
classpath	TokenNameIdentifier	 classpath
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
caching	TokenNameIdentifier	 caching
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loaderMap	TokenNameIdentifier	 loader Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
driver	TokenNameIdentifier	 driver
,	TokenNameCOMMA	
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Loading "	TokenNameStringLiteral	Loading 
+	TokenNamePLUS	
driver	TokenNameIdentifier	 driver
+	TokenNamePLUS	
" using a cached AntClassLoader."	TokenNameStringLiteral	 using a cached AntClassLoader.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
dc	TokenNameIdentifier	 dc
=	TokenNameEQUAL	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
driver	TokenNameIdentifier	 driver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Loading "	TokenNameStringLiteral	Loading 
+	TokenNamePLUS	
driver	TokenNameIdentifier	 driver
+	TokenNamePLUS	
" using system loader."	TokenNameStringLiteral	 using system loader.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dc	TokenNameIdentifier	 dc
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
driver	TokenNameIdentifier	 driver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
driverInstance	TokenNameIdentifier	 driver Instance
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Driver	TokenNameIdentifier	 Driver
)	TokenNameRPAREN	
dc	TokenNameIdentifier	 dc
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Class Not Found: JDBC driver "	TokenNameStringLiteral	Class Not Found: JDBC driver 
+	TokenNamePLUS	
driver	TokenNameIdentifier	 driver
+	TokenNamePLUS	
" could not be loaded"	TokenNameStringLiteral	 could not be loaded
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Illegal Access: JDBC driver "	TokenNameStringLiteral	Illegal Access: JDBC driver 
+	TokenNamePLUS	
driver	TokenNameIdentifier	 driver
+	TokenNamePLUS	
" could not be loaded"	TokenNameStringLiteral	 could not be loaded
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Instantiation Exception: JDBC driver "	TokenNameStringLiteral	Instantiation Exception: JDBC driver 
+	TokenNamePLUS	
driver	TokenNameIdentifier	 driver
+	TokenNamePLUS	
" could not be loaded"	TokenNameStringLiteral	 could not be loaded
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
driverInstance	TokenNameIdentifier	 driver Instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the caching attribute. * @param value a <code>boolean</code> value */	TokenNameCOMMENT_JAVADOC	 Set the caching attribute. @param value a <code>boolean</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
isCaching	TokenNameIdentifier	 is Caching
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
caching	TokenNameIdentifier	 caching
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the classpath. * @return Returns a Path */	TokenNameCOMMENT_JAVADOC	 Gets the classpath. @return Returns a Path 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the autocommit. * @return Returns a boolean */	TokenNameCOMMENT_JAVADOC	 Gets the autocommit. @return Returns a boolean 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAutocommit	TokenNameIdentifier	 is Autocommit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
autocommit	TokenNameIdentifier	 autocommit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the url. * @return Returns a String */	TokenNameCOMMENT_JAVADOC	 Gets the url. @return Returns a String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the userId. * @return Returns a String */	TokenNameCOMMENT_JAVADOC	 Gets the userId. @return Returns a String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUserId	TokenNameIdentifier	 get User Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userId	TokenNameIdentifier	 user Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the user name for the connection; required. * @param userId The userId to set */	TokenNameCOMMENT_JAVADOC	 Set the user name for the connection; required. @param userId The userId to set 
public	TokenNamepublic	
void	TokenNamevoid	
setUserid	TokenNameIdentifier	 set Userid
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userId	TokenNameIdentifier	 user Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userId	TokenNameIdentifier	 user Id
=	TokenNameEQUAL	
userId	TokenNameIdentifier	 user Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the password. * @return Returns a String */	TokenNameCOMMENT_JAVADOC	 Gets the password. @return Returns a String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the rdbms. * @return Returns a String */	TokenNameCOMMENT_JAVADOC	 Gets the rdbms. @return Returns a String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRdbms	TokenNameIdentifier	 get Rdbms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rdbms	TokenNameIdentifier	 rdbms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the version. * @return Returns a String */	TokenNameCOMMENT_JAVADOC	 Gets the version. @return Returns a String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
