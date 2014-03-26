/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
jdbc	TokenNameIdentifier	 jdbc
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
DriverManager	TokenNameIdentifier	 Driver Manager
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
Statement	TokenNameIdentifier	 Statement
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
PatternLayout	TokenNameIdentifier	 Pattern Layout
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
ErrorCode	TokenNameIdentifier	 Error Code
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
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** The JDBCAppender provides for sending log events to a database. <p><b><font color="#FF2222">WARNING: This version of JDBCAppender is very likely to be completely replaced in the future. Moreoever, it does not log exceptions</font></b>. <p>Each append call adds to an <code>ArrayList</code> buffer. When the buffer is filled each log event is placed in a sql statement (configurable) and executed. <b>BufferSize</b>, <b>db URL</b>, <b>User</b>, & <b>Password</b> are configurable options in the standard log4j ways. <p>The <code>setSql(String sql)</code> sets the SQL statement to be used for logging -- this statement is sent to a <code>PatternLayout</code> (either created automaticly by the appender or added by the user). Therefore by default all the conversion patterns in <code>PatternLayout</code> can be used inside of the statement. (see the test cases for examples) <p>Overriding the {@link #getLogStatement} method allows more explicit control of the statement used for logging. <p>For use as a base class: <ul> <li>Override <code>getConnection()</code> to pass any connection you want. Typically this is used to enable application wide connection pooling. <li>Override <code>closeConnection(Connection con)</code> -- if you override getConnection make sure to implement <code>closeConnection</code> to handle the connection you generated. Typically this would return the connection to the pool it came from. <li>Override <code>getLogStatement(LoggingEvent event)</code> to produce specialized or dynamic statements. The default uses the sql option value. </ul> @author Kevin Steppe (<A HREF="mailto:ksteppe@pacbell.net">ksteppe@pacbell.net</A>) */	TokenNameCOMMENT_JAVADOC	 The JDBCAppender provides for sending log events to a database. <p><b><font color="#FF2222">WARNING: This version of JDBCAppender is very likely to be completely replaced in the future. Moreoever, it does not log exceptions</font></b>. <p>Each append call adds to an <code>ArrayList</code> buffer. When the buffer is filled each log event is placed in a sql statement (configurable) and executed. <b>BufferSize</b>, <b>db URL</b>, <b>User</b>, & <b>Password</b> are configurable options in the standard log4j ways. <p>The <code>setSql(String sql)</code> sets the SQL statement to be used for logging -- this statement is sent to a <code>PatternLayout</code> (either created automaticly by the appender or added by the user). Therefore by default all the conversion patterns in <code>PatternLayout</code> can be used inside of the statement. (see the test cases for examples) <p>Overriding the {@link #getLogStatement} method allows more explicit control of the statement used for logging. <p>For use as a base class: <ul> <li>Override <code>getConnection()</code> to pass any connection you want. Typically this is used to enable application wide connection pooling. <li>Override <code>closeConnection(Connection con)</code> -- if you override getConnection make sure to implement <code>closeConnection</code> to handle the connection you generated. Typically this would return the connection to the pool it came from. <li>Override <code>getLogStatement(LoggingEvent event)</code> to produce specialized or dynamic statements. The default uses the sql option value. </ul> @author Kevin Steppe (<A HREF="mailto:ksteppe@pacbell.net">ksteppe@pacbell.net</A>) 
public	TokenNamepublic	
class	TokenNameclass	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
implements	TokenNameimplements	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Appender	TokenNameIdentifier	 Appender
{	TokenNameLBRACE	
/** * URL of the DB for default connection handling */	TokenNameCOMMENT_JAVADOC	 URL of the DB for default connection handling 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
databaseURL	TokenNameIdentifier	 database URL
=	TokenNameEQUAL	
"jdbc:odbc:myDB"	TokenNameStringLiteral	jdbc:odbc:myDB
;	TokenNameSEMICOLON	
/** * User to connect as for default connection handling */	TokenNameCOMMENT_JAVADOC	 User to connect as for default connection handling 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
databaseUser	TokenNameIdentifier	 database User
=	TokenNameEQUAL	
"me"	TokenNameStringLiteral	me
;	TokenNameSEMICOLON	
/** * User to use for default connection handling */	TokenNameCOMMENT_JAVADOC	 User to use for default connection handling 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
databasePassword	TokenNameIdentifier	 database Password
=	TokenNameEQUAL	
"mypassword"	TokenNameStringLiteral	mypassword
;	TokenNameSEMICOLON	
/** * Connection used by default. The connection is opened the first time it * is needed and then held open until the appender is closed (usually at * garbage collection). This behavior is best modified by creating a * sub-class and overriding the <code>getConnection</code> and * <code>closeConnection</code> methods. */	TokenNameCOMMENT_JAVADOC	 Connection used by default. The connection is opened the first time it is needed and then held open until the appender is closed (usually at garbage collection). This behavior is best modified by creating a sub-class and overriding the <code>getConnection</code> and <code>closeConnection</code> methods. 
protected	TokenNameprotected	
Connection	TokenNameIdentifier	 Connection
connection	TokenNameIdentifier	 connection
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Stores the string given to the pattern layout for conversion into a SQL * statement, eg: insert into LogTable (Thread, Class, Message) values * ("%t", "%c", "%m"). * * Be careful of quotes in your messages! * * Also see PatternLayout. */	TokenNameCOMMENT_JAVADOC	 Stores the string given to the pattern layout for conversion into a SQL statement, eg: insert into LogTable (Thread, Class, Message) values ("%t", "%c", "%m"). * Be careful of quotes in your messages! * Also see PatternLayout. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
sqlStatement	TokenNameIdentifier	 sql Statement
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * size of LoggingEvent buffer before writting to the database. * Default is 1. */	TokenNameCOMMENT_JAVADOC	 size of LoggingEvent buffer before writting to the database. Default is 1. 
protected	TokenNameprotected	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * ArrayList holding the buffer of Logging Events. */	TokenNameCOMMENT_JAVADOC	 ArrayList holding the buffer of Logging Events. 
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
/** * Helper object for clearing out the buffer */	TokenNameCOMMENT_JAVADOC	 Helper object for clearing out the buffer 
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
removes	TokenNameIdentifier	 removes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JDBCAppender	TokenNameIdentifier	 JDBC Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removes	TokenNameIdentifier	 removes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets whether the location of the logging request call * should be captured. * * @since 1.2.16 * @return the current value of the <b>LocationInfo</b> option. */	TokenNameCOMMENT_JAVADOC	 Gets whether the location of the logging request call should be captured. * @since 1.2.16 @return the current value of the <b>LocationInfo</b> option. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getLocationInfo	TokenNameIdentifier	 get Location Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
locationInfo	TokenNameIdentifier	 location Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The <b>LocationInfo</b> option takes a boolean value. By default, it is * set to false which means there will be no effort to extract the location * information related to the event. As a result, the event that will be * ultimately logged will likely to contain the wrong location information * (if present in the log format). * <p/> * <p/> * Location information extraction is comparatively very slow and should be * avoided unless performance is not a concern. * </p> * @since 1.2.16 * @param flag true if location information should be extracted. */	TokenNameCOMMENT_JAVADOC	 The <b>LocationInfo</b> option takes a boolean value. By default, it is set to false which means there will be no effort to extract the location information related to the event. As a result, the event that will be ultimately logged will likely to contain the wrong location information (if present in the log format). <p/> <p/> Location information extraction is comparatively very slow and should be avoided unless performance is not a concern. </p> @since 1.2.16 @param flag true if location information should be extracted. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the event to the buffer. When full the buffer is flushed. */	TokenNameCOMMENT_JAVADOC	 Adds the event to the buffer. When full the buffer is flushed. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get a copy of this thread's MDC. 	TokenNameCOMMENT_LINE	Get a copy of this thread's MDC. 
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMDCCopy	TokenNameIdentifier	 get MDC Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRenderedMessage	TokenNameIdentifier	 get Rendered Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * By default getLogStatement sends the event to the required Layout object. * The layout will format the given pattern into a workable SQL string. * * Overriding this provides direct access to the LoggingEvent * when constructing the logging statement. * */	TokenNameCOMMENT_JAVADOC	 By default getLogStatement sends the event to the required Layout object. The layout will format the given pattern into a workable SQL string. * Overriding this provides direct access to the LoggingEvent when constructing the logging statement. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getLogStatement	TokenNameIdentifier	 get Log Statement
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * Override this to provide an alertnate method of getting * connections (such as caching). One method to fix this is to open * connections at the start of flushBuffer() and close them at the * end. I use a connection pool outside of JDBCAppender which is * accessed in an override of this method. * */	TokenNameCOMMENT_JAVADOC	 * Override this to provide an alertnate method of getting connections (such as caching). One method to fix this is to open connections at the start of flushBuffer() and close them at the end. I use a connection pool outside of JDBCAppender which is accessed in an override of this method. 
protected	TokenNameprotected	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sql	TokenNameIdentifier	 sql
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Statement	TokenNameIdentifier	 Statement
stmt	TokenNameIdentifier	 stmt
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
getConnection	TokenNameIdentifier	 get Connection
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
stmt	TokenNameIdentifier	 stmt
.	TokenNameDOT	
executeUpdate	TokenNameIdentifier	 execute Update
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stmt	TokenNameIdentifier	 stmt
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stmt	TokenNameIdentifier	 stmt
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
closeConnection	TokenNameIdentifier	 close Connection
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println("Execute: " + sql); 	TokenNameCOMMENT_LINE	System.out.println("Execute: " + sql); 
}	TokenNameRBRACE	
/** * Override this to return the connection to a pool, or to clean up the * resource. * * The default behavior holds a single connection open until the appender * is closed (typically when garbage collected). */	TokenNameCOMMENT_JAVADOC	 Override this to return the connection to a pool, or to clean up the resource. * The default behavior holds a single connection open until the appender is closed (typically when garbage collected). 
protected	TokenNameprotected	
void	TokenNamevoid	
closeConnection	TokenNameIdentifier	 close Connection
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Override this to link with your connection pooling system. * * By default this creates a single connection which is held open * until the object is garbage collected. */	TokenNameCOMMENT_JAVADOC	 Override this to link with your connection pooling system. * By default this creates a single connection which is held open until the object is garbage collected. 
protected	TokenNameprotected	
Connection	TokenNameIdentifier	 Connection
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
DriverManager	TokenNameIdentifier	 Driver Manager
.	TokenNameDOT	
getDrivers	TokenNameIdentifier	 get Drivers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
setDriver	TokenNameIdentifier	 set Driver
(	TokenNameLPAREN	
"sun.jdbc.odbc.JdbcOdbcDriver"	TokenNameStringLiteral	sun.jdbc.odbc.JdbcOdbcDriver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
connection	TokenNameIdentifier	 connection
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
connection	TokenNameIdentifier	 connection
=	TokenNameEQUAL	
DriverManager	TokenNameIdentifier	 Driver Manager
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
databaseURL	TokenNameIdentifier	 database URL
,	TokenNameCOMMA	
databaseUser	TokenNameIdentifier	 database User
,	TokenNameCOMMA	
databasePassword	TokenNameIdentifier	 database Password
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
connection	TokenNameIdentifier	 connection
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Closes the appender, flushing the buffer first then closing the default * connection if it is open. */	TokenNameCOMMENT_JAVADOC	 Closes the appender, flushing the buffer first then closing the default connection if it is open. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
connection	TokenNameIdentifier	 connection
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
isClosed	TokenNameIdentifier	 is Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SQLException	TokenNameIdentifier	 SQL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Error closing connection"	TokenNameStringLiteral	Error closing connection
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ErrorCode	TokenNameIdentifier	 Error Code
.	TokenNameDOT	
GENERIC_FAILURE	TokenNameIdentifier	 GENERIC  FAILURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * loops through the buffer of LoggingEvents, gets a * sql string from getLogStatement() and sends it to execute(). * Errors are sent to the errorHandler. * * If a statement fails the LoggingEvent stays in the buffer! */	TokenNameCOMMENT_JAVADOC	 loops through the buffer of LoggingEvents, gets a sql string from getLogStatement() and sends it to execute(). Errors are sent to the errorHandler. * If a statement fails the LoggingEvent stays in the buffer! 
public	TokenNamepublic	
void	TokenNamevoid	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Do the actual logging 	TokenNameCOMMENT_LINE	Do the actual logging 
removes	TokenNameIdentifier	 removes
.	TokenNameDOT	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LoggingEvent	TokenNameIdentifier	 Logging Event
logEvent	TokenNameIdentifier	 log Event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
sql	TokenNameIdentifier	 sql
=	TokenNameEQUAL	
getLogStatement	TokenNameIdentifier	 get Log Statement
(	TokenNameLPAREN	
logEvent	TokenNameIdentifier	 log Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
sql	TokenNameIdentifier	 sql
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SQLException	TokenNameIdentifier	 SQL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Failed to excute sql"	TokenNameStringLiteral	Failed to excute sql
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ErrorCode	TokenNameIdentifier	 Error Code
.	TokenNameDOT	
FLUSH_FAILURE	TokenNameIdentifier	 FLUSH  FAILURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
removes	TokenNameIdentifier	 removes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
logEvent	TokenNameIdentifier	 log Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// remove from the buffer any events that were reported 	TokenNameCOMMENT_LINE	remove from the buffer any events that were reported 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
removes	TokenNameIdentifier	 removes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clear the buffer of reported events 	TokenNameCOMMENT_LINE	clear the buffer of reported events 
removes	TokenNameIdentifier	 removes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** closes the appender before disposal */	TokenNameCOMMENT_JAVADOC	 closes the appender before disposal 
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
}	TokenNameRBRACE	
/** * JDBCAppender requires a layout. * */	TokenNameCOMMENT_JAVADOC	 JDBCAppender requires a layout. 
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
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
void	TokenNamevoid	
setSql	TokenNameIdentifier	 set Sql
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sqlStatement	TokenNameIdentifier	 sql Statement
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PatternLayout	TokenNameIdentifier	 Pattern Layout
)	TokenNameRPAREN	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setConversionPattern	TokenNameIdentifier	 set Conversion Pattern
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns pre-formated statement eg: insert into LogTable (msg) values ("%m") */	TokenNameCOMMENT_JAVADOC	 Returns pre-formated statement eg: insert into LogTable (msg) values ("%m") 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSql	TokenNameIdentifier	 get Sql
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sqlStatement	TokenNameIdentifier	 sql Statement
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUser	TokenNameIdentifier	 set User
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
user	TokenNameIdentifier	 user
)	TokenNameRPAREN	
{	TokenNameLBRACE	
databaseUser	TokenNameIdentifier	 database User
=	TokenNameEQUAL	
user	TokenNameIdentifier	 user
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setURL	TokenNameIdentifier	 set URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
databaseURL	TokenNameIdentifier	 database URL
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
databasePassword	TokenNameIdentifier	 database Password
=	TokenNameEQUAL	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
int	TokenNameint	
newBufferSize	TokenNameIdentifier	 new Buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
newBufferSize	TokenNameIdentifier	 new Buffer Size
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removes	TokenNameIdentifier	 removes
.	TokenNameDOT	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUser	TokenNameIdentifier	 get User
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
databaseUser	TokenNameIdentifier	 database User
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
databaseURL	TokenNameIdentifier	 database URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
databasePassword	TokenNameIdentifier	 database Password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getBufferSize	TokenNameIdentifier	 get Buffer Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ensures that the given driver class has been loaded for sql connection * creation. */	TokenNameCOMMENT_JAVADOC	 Ensures that the given driver class has been loaded for sql connection creation. 
public	TokenNamepublic	
void	TokenNamevoid	
setDriver	TokenNameIdentifier	 set Driver
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
driverClass	TokenNameIdentifier	 driver Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
driverClass	TokenNameIdentifier	 driver Class
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
"Failed to load driver"	TokenNameStringLiteral	Failed to load driver
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ErrorCode	TokenNameIdentifier	 Error Code
.	TokenNameDOT	
GENERIC_FAILURE	TokenNameIdentifier	 GENERIC  FAILURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
