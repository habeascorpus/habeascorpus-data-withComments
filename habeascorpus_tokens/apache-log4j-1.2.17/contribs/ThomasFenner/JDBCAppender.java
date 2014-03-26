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
/** The JDBCAppender, writes messages into a database <p><b>The JDBCAppender is configurable at runtime by setting options in two alternatives : </b></p> <dir> <p><b>1. Use a configuration-file</b></p> <p>Define the options in a file (<A HREF="configfile_example.txt">example</A>) and call a <code>PropertyConfigurator.configure(filename)</code> in your code.</p> <p><b>2. Use the methods of JDBCAppender to do it</b></p> <p>Call <code>JDBCAppender::setOption(JDBCAppender.xxx_OPTION, String value)</code> to do it analogically without a configuration-file (<A HREF="code_example2.java">example</A>)</p> </dir> <p>All available options are defined as static String-constants in JDBCAppender named xxx_OPTION.</p> <p><b>Here is a description of all available options :</b></p> <dir> <p><b>1. Database-options to connect to the database</b></p> <p>- <b>URL_OPTION</b> : a database url of the form jdbc:subprotocol:subname</p> <p>- <b>USERNAME_OPTION</b> : the database user on whose behalf the connection is being made</p> <p>- <b>PASSWORD_OPTION</b> : the user's password</p> <p><b>2. Connector-option to specify your own JDBCConnectionHandler</b></p> <p>- <b>CONNECTOR_OPTION</b> : a classname which is implementing the JDBCConnectionHandler-interface</p> <p>This interface is used to get a customized connection.</p> <p>If in addition the database-options are given, these options will be used as arguments for the JDBCConnectionHandler-interface to get a connection.</p> <p>Else if no database-options are given, the JDBCConnectionHandler-interface is called without them.</p> <p>Else if this option is not defined, the database-options are required to open a connection by the JDBCAppender.</p> <p><b>3. SQL-option to specify a static sql-statement which will be performed with every occuring message-event</b></p> <p>- <b>SQL_OPTION</b> : a sql-statement which will be used to write to the database</p> <p>Use the variable <b>@MSG@</b> on a location in the statement, which has to be dynamically replaced by the message-text.</p> <p>If you give this option, the table-option and columns-option will be ignored !</p> <p><b>4. Table-option to specify a table contained by the database</b></p> <p>- <b>TABLE_OPTION</b> : the table in which the logging will be done</p> <p><b>5. Columns-option to describe the important columns of the table (Not nullable columns are mandatory to describe!)</b></p> <p>- <b>COLUMNS_OPTION</b> : a formatted list of column-descriptions</p> <p>Each column description consists of</p> <dir> <p>- the <b><i>name</i></b> of the column (required)</p> <p>- a <b><i>logtype</i></b> which is a static constant of class LogType (required)</p> <p>- and a <b><i>value</i></b> which depends by the LogType (optional/required, depending by logtype)</p> </dir> <p>Here is a description of the available logtypes of class <b>{@link LogType}</b> and how to handle the <b><i>value</i></b>:</p> <dir> <p>o <b>MSG</b> = a value will be ignored, the column will get the message. (One columns need to be of this type!)</p> <p>o <b>STATIC</b> = the value will be filled into the column with every logged message. (Ensure that the type of value can be casted into the sql-type of the column!)</p> <p>o <b>ID</b> = value must be a classname, which implements the JDBCIDHandler-interface.</p> <p>o <b>TIMESTAMP</b> = a value will be ignored, the column will be filled with a actually timestamp with every logged message.</p> <p>o <b>EMPTY</b> = a value will be ignored, the column will be ignored when writing to the database (Ensure to fill not nullable columns by a database trigger!)</p> </dir> <p>If there are more than one column to describe, the columns must be separated by a Tabulator-delimiter (unicode0008) !</p> <p>The arguments of a column-description must be separated by the delimiter '~' !</p> <p><i>(Example : name1~logtype1~value1 name2~logtype2~value2...)</i></p> <p><b>6. Layout-options to define the layout of the messages (optional)</b></p> <p>- <b>_</b> : the layout wont be set by a xxx_OPTION</p> <p>See the configuration-file and code examples below...</p> <p>The default is a layout of the class {@link org.apache.log4j.PatternLayout} with the pattern=%m which representate only the message.</p> <p><b>7. Buffer-option to define the size of the message-event-buffer (optional)</b></p> <p>- <b>BUFFER_OPTION</b> : define how many messages will be buffered until they will be updated to the database.</p> <p>The default is buffer=1, which will do a update with every happened message-event.</p> <p><b>8. Commit-option to define a auto-commitment</b></p> <p>- <b>COMMIT_OPTION</b> : define whether updated messages should be committed to the database (Y) or not (N).</p> <p>The default is commit=Y.</p> </dir> <p><b>The sequence of some options is important :</b></p> <dir> <p><b>1. Connector-option OR/AND Database-options</b></p> <p>Any database connection is required !</p> <p><b>2. (Table-option AND Columns-option) OR SQL-option</b></p> <p>Anything of that is required ! Whether where to write something OR what to write somewhere...;-)</p> <p><b>3. All other options can be set at any time...</b></p> <p>The other options are optional and have a default initialization, which can be customized.</p> </dir> <p><b>Here is a <b>configuration-file example</b>, which can be used as argument for the <b>PropertyConfigurator</b> : </b><A HREF="configfile_example.txt"> configfile_example.txt</A></p> <p><b>Here is a <b>code-example</b> to configure the JDBCAppender <b>with a configuration-file</b> : </b><A HREF="code_example1.java"> code_example1.java</A></p> <p><b>Here is a <b>another code-example</b> to configure the JDBCAppender <b>without a configuration-file</b> : </b><A HREF="code_example2.java"> code_example2.java</A></p> <p><b>Author : </b><A HREF="mailto:t.fenner@klopotek.de">Thomas Fenner</A></p> @since 1.0 */	TokenNameCOMMENT_JAVADOC	 The JDBCAppender, writes messages into a database <p><b>The JDBCAppender is configurable at runtime by setting options in two alternatives : </b></p> <dir> <p><b>1. Use a configuration-file</b></p> <p>Define the options in a file (<A HREF="configfile_example.txt">example</A>) and call a <code>PropertyConfigurator.configure(filename)</code> in your code.</p> <p><b>2. Use the methods of JDBCAppender to do it</b></p> <p>Call <code>JDBCAppender::setOption(JDBCAppender.xxx_OPTION, String value)</code> to do it analogically without a configuration-file (<A HREF="code_example2.java">example</A>)</p> </dir> <p>All available options are defined as static String-constants in JDBCAppender named xxx_OPTION.</p> <p><b>Here is a description of all available options :</b></p> <dir> <p><b>1. Database-options to connect to the database</b></p> <p>- <b>URL_OPTION</b> : a database url of the form jdbc:subprotocol:subname</p> <p>- <b>USERNAME_OPTION</b> : the database user on whose behalf the connection is being made</p> <p>- <b>PASSWORD_OPTION</b> : the user's password</p> <p><b>2. Connector-option to specify your own JDBCConnectionHandler</b></p> <p>- <b>CONNECTOR_OPTION</b> : a classname which is implementing the JDBCConnectionHandler-interface</p> <p>This interface is used to get a customized connection.</p> <p>If in addition the database-options are given, these options will be used as arguments for the JDBCConnectionHandler-interface to get a connection.</p> <p>Else if no database-options are given, the JDBCConnectionHandler-interface is called without them.</p> <p>Else if this option is not defined, the database-options are required to open a connection by the JDBCAppender.</p> <p><b>3. SQL-option to specify a static sql-statement which will be performed with every occuring message-event</b></p> <p>- <b>SQL_OPTION</b> : a sql-statement which will be used to write to the database</p> <p>Use the variable <b>@MSG@</b> on a location in the statement, which has to be dynamically replaced by the message-text.</p> <p>If you give this option, the table-option and columns-option will be ignored !</p> <p><b>4. Table-option to specify a table contained by the database</b></p> <p>- <b>TABLE_OPTION</b> : the table in which the logging will be done</p> <p><b>5. Columns-option to describe the important columns of the table (Not nullable columns are mandatory to describe!)</b></p> <p>- <b>COLUMNS_OPTION</b> : a formatted list of column-descriptions</p> <p>Each column description consists of</p> <dir> <p>- the <b><i>name</i></b> of the column (required)</p> <p>- a <b><i>logtype</i></b> which is a static constant of class LogType (required)</p> <p>- and a <b><i>value</i></b> which depends by the LogType (optional/required, depending by logtype)</p> </dir> <p>Here is a description of the available logtypes of class <b>{@link LogType}</b> and how to handle the <b><i>value</i></b>:</p> <dir> <p>o <b>MSG</b> = a value will be ignored, the column will get the message. (One columns need to be of this type!)</p> <p>o <b>STATIC</b> = the value will be filled into the column with every logged message. (Ensure that the type of value can be casted into the sql-type of the column!)</p> <p>o <b>ID</b> = value must be a classname, which implements the JDBCIDHandler-interface.</p> <p>o <b>TIMESTAMP</b> = a value will be ignored, the column will be filled with a actually timestamp with every logged message.</p> <p>o <b>EMPTY</b> = a value will be ignored, the column will be ignored when writing to the database (Ensure to fill not nullable columns by a database trigger!)</p> </dir> <p>If there are more than one column to describe, the columns must be separated by a Tabulator-delimiter (unicode0008) !</p> <p>The arguments of a column-description must be separated by the delimiter '~' !</p> <p><i>(Example : name1~logtype1~value1 name2~logtype2~value2...)</i></p> <p><b>6. Layout-options to define the layout of the messages (optional)</b></p> <p>- <b>_</b> : the layout wont be set by a xxx_OPTION</p> <p>See the configuration-file and code examples below...</p> <p>The default is a layout of the class {@link org.apache.log4j.PatternLayout} with the pattern=%m which representate only the message.</p> <p><b>7. Buffer-option to define the size of the message-event-buffer (optional)</b></p> <p>- <b>BUFFER_OPTION</b> : define how many messages will be buffered until they will be updated to the database.</p> <p>The default is buffer=1, which will do a update with every happened message-event.</p> <p><b>8. Commit-option to define a auto-commitment</b></p> <p>- <b>COMMIT_OPTION</b> : define whether updated messages should be committed to the database (Y) or not (N).</p> <p>The default is commit=Y.</p> </dir> <p><b>The sequence of some options is important :</b></p> <dir> <p><b>1. Connector-option OR/AND Database-options</b></p> <p>Any database connection is required !</p> <p><b>2. (Table-option AND Columns-option) OR SQL-option</b></p> <p>Anything of that is required ! Whether where to write something OR what to write somewhere...;-)</p> <p><b>3. All other options can be set at any time...</b></p> <p>The other options are optional and have a default initialization, which can be customized.</p> </dir> <p><b>Here is a <b>configuration-file example</b>, which can be used as argument for the <b>PropertyConfigurator</b> : </b><A HREF="configfile_example.txt"> configfile_example.txt</A></p> <p><b>Here is a <b>code-example</b> to configure the JDBCAppender <b>with a configuration-file</b> : </b><A HREF="code_example1.java"> code_example1.java</A></p> <p><b>Here is a <b>another code-example</b> to configure the JDBCAppender <b>without a configuration-file</b> : </b><A HREF="code_example2.java"> code_example2.java</A></p> <p><b>Author : </b><A HREF="mailto:t.fenner@klopotek.de">Thomas Fenner</A></p> @since 1.0 
public	TokenNamepublic	
class	TokenNameclass	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
{	TokenNameLBRACE	
/** A database-option to to set a database url of the form jdbc:subprotocol:subname. */	TokenNameCOMMENT_JAVADOC	 A database-option to to set a database url of the form jdbc:subprotocol:subname. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
URL_OPTION	TokenNameIdentifier	 URL  OPTION
=	TokenNameEQUAL	
"url"	TokenNameStringLiteral	url
;	TokenNameSEMICOLON	
/** A database-option to set the database user on whose behalf the connection is being made. */	TokenNameCOMMENT_JAVADOC	 A database-option to set the database user on whose behalf the connection is being made. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USERNAME_OPTION	TokenNameIdentifier	 USERNAME  OPTION
=	TokenNameEQUAL	
"username"	TokenNameStringLiteral	username
;	TokenNameSEMICOLON	
/** A database-option to set the user's password. */	TokenNameCOMMENT_JAVADOC	 A database-option to set the user's password. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PASSWORD_OPTION	TokenNameIdentifier	 PASSWORD  OPTION
=	TokenNameEQUAL	
"password"	TokenNameStringLiteral	password
;	TokenNameSEMICOLON	
/** A table-option to specify a table contained by the database */	TokenNameCOMMENT_JAVADOC	 A table-option to specify a table contained by the database 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TABLE_OPTION	TokenNameIdentifier	 TABLE  OPTION
=	TokenNameEQUAL	
"table"	TokenNameStringLiteral	table
;	TokenNameSEMICOLON	
/** A connector-option to specify your own JDBCConnectionHandler */	TokenNameCOMMENT_JAVADOC	 A connector-option to specify your own JDBCConnectionHandler 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CONNECTOR_OPTION	TokenNameIdentifier	 CONNECTOR  OPTION
=	TokenNameEQUAL	
"connector"	TokenNameStringLiteral	connector
;	TokenNameSEMICOLON	
/** A columns-option to describe the important columns of the table */	TokenNameCOMMENT_JAVADOC	 A columns-option to describe the important columns of the table 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COLUMNS_OPTION	TokenNameIdentifier	 COLUMNS  OPTION
=	TokenNameEQUAL	
"columns"	TokenNameStringLiteral	columns
;	TokenNameSEMICOLON	
/** A sql-option to specify a static sql-statement which will be performed with every occuring message-event */	TokenNameCOMMENT_JAVADOC	 A sql-option to specify a static sql-statement which will be performed with every occuring message-event 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SQL_OPTION	TokenNameIdentifier	 SQL  OPTION
=	TokenNameEQUAL	
"sql"	TokenNameStringLiteral	sql
;	TokenNameSEMICOLON	
/** A buffer-option to define the size of the message-event-buffer */	TokenNameCOMMENT_JAVADOC	 A buffer-option to define the size of the message-event-buffer 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUFFER_OPTION	TokenNameIdentifier	 BUFFER  OPTION
=	TokenNameEQUAL	
"buffer"	TokenNameStringLiteral	buffer
;	TokenNameSEMICOLON	
/** A commit-option to define a auto-commitment */	TokenNameCOMMENT_JAVADOC	 A commit-option to define a auto-commitment 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMIT_OPTION	TokenNameIdentifier	 COMMIT  OPTION
=	TokenNameEQUAL	
"commit"	TokenNameStringLiteral	commit
;	TokenNameSEMICOLON	
//Variables to store the options values setted by setOption() : 	TokenNameCOMMENT_LINE	Variables to store the options values setted by setOption() : 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
connection_class	TokenNameIdentifier	 connection class
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
sql	TokenNameIdentifier	 sql
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
docommit	TokenNameIdentifier	 docommit
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
buffer_size	TokenNameIdentifier	 buffer size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JDBCConnectionHandler	TokenNameIdentifier	 JDBC Connection Handler
connectionHandler	TokenNameIdentifier	 connection Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//This buffer stores message-events. 	TokenNameCOMMENT_LINE	This buffer stores message-events. 
//When the buffer_size is reached, the buffer will be flushed and the messages will updated to the database. 	TokenNameCOMMENT_LINE	When the buffer_size is reached, the buffer will be flushed and the messages will updated to the database. 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Database-connection 	TokenNameCOMMENT_LINE	Database-connection 
private	TokenNameprivate	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//This class encapsulate the logic which is necessary to log into a table 	TokenNameCOMMENT_LINE	This class encapsulate the logic which is necessary to log into a table 
private	TokenNameprivate	
JDBCLogger	TokenNameIdentifier	 JDBC Logger
jlogger	TokenNameIdentifier	 jlogger
=	TokenNameEQUAL	
new	TokenNamenew	
JDBCLogger	TokenNameIdentifier	 JDBC Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Flags : 	TokenNameCOMMENT_LINE	Flags : 
//A flag to indicate a established database connection 	TokenNameCOMMENT_LINE	A flag to indicate a established database connection 
private	TokenNameprivate	
boolean	TokenNameboolean	
connected	TokenNameIdentifier	 connected
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//A flag to indicate configuration status 	TokenNameCOMMENT_LINE	A flag to indicate configuration status 
private	TokenNameprivate	
boolean	TokenNameboolean	
configured	TokenNameIdentifier	 configured
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//A flag to indicate that everything is ready to get append()-commands. 	TokenNameCOMMENT_LINE	A flag to indicate that everything is ready to get append()-commands. 
private	TokenNameprivate	
boolean	TokenNameboolean	
ready	TokenNameIdentifier	 ready
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** If program terminates close the database-connection and flush the buffer */	TokenNameCOMMENT_JAVADOC	 If program terminates close the database-connection and flush the buffer 
public	TokenNamepublic	
void	TokenNamevoid	
finalize	TokenNameIdentifier	 finalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
finalize	TokenNameIdentifier	 finalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Internal method. Returns a array of strings containing the available options which can be set with method setOption() */	TokenNameCOMMENT_JAVADOC	 Internal method. Returns a array of strings containing the available options which can be set with method setOption() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getOptionStrings	TokenNameIdentifier	 get Option Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The sequence of options in this string is important, because setOption() is called this way ... 	TokenNameCOMMENT_LINE	The sequence of options in this string is important, because setOption() is called this way ... 
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
CONNECTOR_OPTION	TokenNameIdentifier	 CONNECTOR  OPTION
,	TokenNameCOMMA	
URL_OPTION	TokenNameIdentifier	 URL  OPTION
,	TokenNameCOMMA	
USERNAME_OPTION	TokenNameIdentifier	 USERNAME  OPTION
,	TokenNameCOMMA	
PASSWORD_OPTION	TokenNameIdentifier	 PASSWORD  OPTION
,	TokenNameCOMMA	
SQL_OPTION	TokenNameIdentifier	 SQL  OPTION
,	TokenNameCOMMA	
TABLE_OPTION	TokenNameIdentifier	 TABLE  OPTION
,	TokenNameCOMMA	
COLUMNS_OPTION	TokenNameIdentifier	 COLUMNS  OPTION
,	TokenNameCOMMA	
BUFFER_OPTION	TokenNameIdentifier	 BUFFER  OPTION
,	TokenNameCOMMA	
COMMIT_OPTION	TokenNameIdentifier	 COMMIT  OPTION
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets all necessary options */	TokenNameCOMMENT_JAVADOC	 Sets all necessary options 
public	TokenNamepublic	
void	TokenNamevoid	
setOption	TokenNameIdentifier	 set Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
_option	TokenNameIdentifier	 option
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_option	TokenNameIdentifier	 option
=	TokenNameEQUAL	
_option	TokenNameIdentifier	 option
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
_value	TokenNameIdentifier	 value
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_option	TokenNameIdentifier	 option
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
_value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_option	TokenNameIdentifier	 option
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
_value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
_value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
_value	TokenNameIdentifier	 value
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
CONNECTOR_OPTION	TokenNameIdentifier	 CONNECTOR  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
connected	TokenNameIdentifier	 connected
)	TokenNameRPAREN	
connection_class	TokenNameIdentifier	 connection class
=	TokenNameEQUAL	
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
URL_OPTION	TokenNameIdentifier	 URL  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
connected	TokenNameIdentifier	 connected
)	TokenNameRPAREN	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
USERNAME_OPTION	TokenNameIdentifier	 USERNAME  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
connected	TokenNameIdentifier	 connected
)	TokenNameRPAREN	
username	TokenNameIdentifier	 username
=	TokenNameEQUAL	
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
PASSWORD_OPTION	TokenNameIdentifier	 PASSWORD  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
connected	TokenNameIdentifier	 connected
)	TokenNameRPAREN	
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SQL_OPTION	TokenNameIdentifier	 SQL  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sql	TokenNameIdentifier	 sql
=	TokenNameEQUAL	
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TABLE_OPTION	TokenNameIdentifier	 TABLE  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
COLUMNS_OPTION	TokenNameIdentifier	 COLUMNS  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
logtype	TokenNameIdentifier	 logtype
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
num_args	TokenNameIdentifier	 num args
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
num_columns	TokenNameIdentifier	 num columns
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st_col	TokenNameIdentifier	 st col
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st_arg	TokenNameIdentifier	 st arg
;	TokenNameSEMICOLON	
//Columns are TAB-separated 	TokenNameCOMMENT_LINE	Columns are TAB-separated 
st_col	TokenNameIdentifier	 st col
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
num_columns	TokenNameIdentifier	 num columns
=	TokenNameEQUAL	
st_col	TokenNameIdentifier	 st col
.	TokenNameDOT	
countTokens	TokenNameIdentifier	 count Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
num_columns	TokenNameIdentifier	 num columns
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"JDBCAppender::setOption(), Invalid COLUMN_OPTION value : "	TokenNameStringLiteral	JDBCAppender::setOption(), Invalid COLUMN_OPTION value : 
+	TokenNamePLUS	
_value	TokenNameIdentifier	 value
+	TokenNamePLUS	
" !"	TokenNameStringLiteral	 !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
num_columns	TokenNameIdentifier	 num columns
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
st_col	TokenNameIdentifier	 st col
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Arguments are ~-separated 	TokenNameCOMMENT_LINE	Arguments are ~-separated 
st_arg	TokenNameIdentifier	 st arg
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
"~"	TokenNameStringLiteral	~
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
num_args	TokenNameIdentifier	 num args
=	TokenNameEQUAL	
st_arg	TokenNameIdentifier	 st arg
.	TokenNameDOT	
countTokens	TokenNameIdentifier	 count Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
num_args	TokenNameIdentifier	 num args
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"JDBCAppender::setOption(), Invalid COLUMN_OPTION value : "	TokenNameStringLiteral	JDBCAppender::setOption(), Invalid COLUMN_OPTION value : 
+	TokenNamePLUS	
_value	TokenNameIdentifier	 value
+	TokenNamePLUS	
" !"	TokenNameStringLiteral	 !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
num_args	TokenNameIdentifier	 num args
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
st_arg	TokenNameIdentifier	 st arg
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
logtype	TokenNameIdentifier	 logtype
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logtype	TokenNameIdentifier	 logtype
=	TokenNameEQUAL	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
parseLogType	TokenNameIdentifier	 parse Log Type
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
LogType	TokenNameIdentifier	 Log Type
.	TokenNameDOT	
isLogType	TokenNameIdentifier	 is Log Type
(	TokenNameLPAREN	
logtype	TokenNameIdentifier	 logtype
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"JDBCAppender::setOption(), Invalid COLUMN_OPTION LogType : "	TokenNameStringLiteral	JDBCAppender::setOption(), Invalid COLUMN_OPTION LogType : 
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
+	TokenNamePLUS	
" !"	TokenNameStringLiteral	 !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
setLogType	TokenNameIdentifier	 set Log Type
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
logtype	TokenNameIdentifier	 logtype
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
BUFFER_OPTION	TokenNameIdentifier	 BUFFER  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
buffer_size	TokenNameIdentifier	 buffer size
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"JDBCAppender::setOption(), Invalid BUFFER_OPTION value : "	TokenNameStringLiteral	JDBCAppender::setOption(), Invalid BUFFER_OPTION value : 
+	TokenNamePLUS	
_value	TokenNameIdentifier	 value
+	TokenNamePLUS	
" !"	TokenNameStringLiteral	 !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
COMMIT_OPTION	TokenNameIdentifier	 COMMIT  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docommit	TokenNameIdentifier	 docommit
=	TokenNameEQUAL	
_value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Y"	TokenNameStringLiteral	Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SQL_OPTION	TokenNameIdentifier	 SQL  OPTION
)	TokenNameRPAREN	
||	TokenNameOR_OR	
_option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TABLE_OPTION	TokenNameIdentifier	 TABLE  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
configured	TokenNameIdentifier	 configured
)	TokenNameRPAREN	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Internal method. Returns true, you may define your own layout... */	TokenNameCOMMENT_JAVADOC	 Internal method. Returns true, you may define your own layout... 
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Internal method. Close the database connection & flush the buffer. */	TokenNameCOMMENT_JAVADOC	 Internal method. Close the database connection & flush the buffer. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flush_buffer	TokenNameIdentifier	 flush buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
connection_class	TokenNameIdentifier	 connection class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"JDBCAppender::close(), "	TokenNameStringLiteral	JDBCAppender::close(), 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** You have to call this function for all provided columns of your log-table ! */	TokenNameCOMMENT_JAVADOC	 You have to call this function for all provided columns of your log-table ! 
public	TokenNamepublic	
boolean	TokenNameboolean	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
configured	TokenNameIdentifier	 configured
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
jlogger	TokenNameIdentifier	 jlogger
.	TokenNameDOT	
setLogType	TokenNameIdentifier	 set Log Type
(	TokenNameLPAREN	
_name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
_logtype	TokenNameIdentifier	 logtype
,	TokenNameCOMMA	
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"JDBCAppender::setLogType(), "	TokenNameStringLiteral	JDBCAppender::setLogType(), 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
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
/** Internal method. Appends the message to the database table. */	TokenNameCOMMENT_JAVADOC	 Internal method. Appends the message to the database table. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ready	TokenNameIdentifier	 ready
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ready	TokenNameIdentifier	 ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"JDBCAppender::append(), Not ready to append !"	TokenNameStringLiteral	JDBCAppender::append(), Not ready to append !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
buffer_size	TokenNameIdentifier	 buffer size
)	TokenNameRPAREN	
flush_buffer	TokenNameIdentifier	 flush buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Internal method. Flushes the buffer. */	TokenNameCOMMENT_JAVADOC	 Internal method. Flushes the buffer. 
public	TokenNamepublic	
void	TokenNamevoid	
flush_buffer	TokenNameIdentifier	 flush buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Insert message into database 	TokenNameCOMMENT_LINE	Insert message into database 
jlogger	TokenNameIdentifier	 jlogger
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docommit	TokenNameIdentifier	 docommit
)	TokenNameRPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"JDBCAppender::flush_buffer(), "	TokenNameStringLiteral	JDBCAppender::flush_buffer(), 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
+	TokenNamePLUS	
" : "	TokenNameStringLiteral	 : 
+	TokenNamePLUS	
jlogger	TokenNameIdentifier	 jlogger
.	TokenNameDOT	
getErrorMsg	TokenNameIdentifier	 get Error Msg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
rollback	TokenNameIdentifier	 rollback
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Internal method. Returns true, when the JDBCAppender is ready to append messages to the database, else false. */	TokenNameCOMMENT_JAVADOC	 Internal method. Returns true, when the JDBCAppender is ready to append messages to the database, else false. 
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
configured	TokenNameIdentifier	 configured
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ready	TokenNameIdentifier	 ready
=	TokenNameEQUAL	
jlogger	TokenNameIdentifier	 jlogger
.	TokenNameDOT	
ready	TokenNameIdentifier	 ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ready	TokenNameIdentifier	 ready
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
jlogger	TokenNameIdentifier	 jlogger
.	TokenNameDOT	
getErrorMsg	TokenNameIdentifier	 get Error Msg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ready	TokenNameIdentifier	 ready
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Internal method. Connect to the database. */	TokenNameCOMMENT_JAVADOC	 Internal method. Connect to the database. 
protected	TokenNameprotected	
void	TokenNamevoid	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
connected	TokenNameIdentifier	 connected
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
connection_class	TokenNameIdentifier	 connection class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCAppender::connect(), No URL defined."	TokenNameStringLiteral	JDBCAppender::connect(), No URL defined.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
username	TokenNameIdentifier	 username
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCAppender::connect(), No USERNAME defined."	TokenNameStringLiteral	JDBCAppender::connect(), No USERNAME defined.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
password	TokenNameIdentifier	 password
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCAppender::connect(), No PASSWORD defined."	TokenNameStringLiteral	JDBCAppender::connect(), No PASSWORD defined.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connectionHandler	TokenNameIdentifier	 connection Handler
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultConnectionHandler	TokenNameIdentifier	 Default Connection Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
connectionHandler	TokenNameIdentifier	 connection Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JDBCConnectionHandler	TokenNameIdentifier	 JDBC Connection Handler
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
connection_class	TokenNameIdentifier	 connection class
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
username	TokenNameIdentifier	 username
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
password	TokenNameIdentifier	 password
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
connectionHandler	TokenNameIdentifier	 connection Handler
.	TokenNameDOT	
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
else	TokenNameelse	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
connectionHandler	TokenNameIdentifier	 connection Handler
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
isClosed	TokenNameIdentifier	 is Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCAppender::connect(), JDBCConnectionHandler returns no connected Connection !"	TokenNameStringLiteral	JDBCAppender::connect(), JDBCConnectionHandler returns no connected Connection !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"JDBCAppender::connect(), "	TokenNameStringLiteral	JDBCAppender::connect(), 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
connected	TokenNameIdentifier	 connected
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Internal method. Configures for appending... */	TokenNameCOMMENT_JAVADOC	 Internal method. Configures for appending... 
protected	TokenNameprotected	
boolean	TokenNameboolean	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
configured	TokenNameIdentifier	 configured
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
connected	TokenNameIdentifier	 connected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
connection_class	TokenNameIdentifier	 connection class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
username	TokenNameIdentifier	 username
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
password	TokenNameIdentifier	 password
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"JDBCAppender::configure(), Missing database-options or connector-option !"	TokenNameStringLiteral	JDBCAppender::configure(), Missing database-options or connector-option !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
connection_class	TokenNameIdentifier	 connection class
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"JDBCAppender::configure(), "	TokenNameStringLiteral	JDBCAppender::configure(), 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
table	TokenNameIdentifier	 table
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"JDBCAppender::configure(), No SQL_OPTION or TABLE_OPTION given !"	TokenNameStringLiteral	JDBCAppender::configure(), No SQL_OPTION or TABLE_OPTION given !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
jlogger	TokenNameIdentifier	 jlogger
.	TokenNameDOT	
isConfigured	TokenNameIdentifier	 is Configured
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
jlogger	TokenNameIdentifier	 jlogger
.	TokenNameDOT	
setConnection	TokenNameIdentifier	 set Connection
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jlogger	TokenNameIdentifier	 jlogger
.	TokenNameDOT	
configureTable	TokenNameIdentifier	 configure Table
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
jlogger	TokenNameIdentifier	 jlogger
.	TokenNameDOT	
configureSQL	TokenNameIdentifier	 configure SQL
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"JDBCAppender::configure(), "	TokenNameStringLiteral	JDBCAppender::configure(), 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//Default Message-Layout 	TokenNameCOMMENT_LINE	Default Message-Layout 
if	TokenNameif	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%m"	TokenNameStringLiteral	%m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
configured	TokenNameIdentifier	 configured
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This is a default JDBCConnectionHandler used by JDBCAppender */	TokenNameCOMMENT_JAVADOC	 This is a default JDBCConnectionHandler used by JDBCAppender 
class	TokenNameclass	
DefaultConnectionHandler	TokenNameIdentifier	 Default Connection Handler
implements	TokenNameimplements	
JDBCConnectionHandler	TokenNameIdentifier	 JDBC Connection Handler
{	TokenNameLBRACE	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Connection	TokenNameIdentifier	 Connection
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
con	TokenNameIdentifier	 con
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
