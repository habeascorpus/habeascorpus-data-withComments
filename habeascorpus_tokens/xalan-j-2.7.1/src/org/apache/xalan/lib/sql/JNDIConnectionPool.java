/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
naming	TokenNameIdentifier	 naming
.	TokenNameDOT	
InitialContext	TokenNameIdentifier	 Initial Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
naming	TokenNameIdentifier	 naming
.	TokenNameDOT	
NamingException	TokenNameIdentifier	 Naming Exception
;	TokenNameSEMICOLON	
/** * A Connection Pool that wraps a JDBC datasource to provide connections. * * An instance of this class is created by <code>XConnection</code> when it * attempts to resolves a <code>ConnectionPool</code> name as a JNDI data source. * * Most methods in this implementation do nothing since configuration is handled * by the underlying JDBC datasource. Users should always call * <code>XConnection.close()</code> from their stylsheet to explicitely close * their connection. However, since there is no way to enforce this * (Yikes!), it is recommended that a relatively short datasource timeout * be used to prevent dangling connections. */	TokenNameCOMMENT_JAVADOC	 A Connection Pool that wraps a JDBC datasource to provide connections. * An instance of this class is created by <code>XConnection</code> when it attempts to resolves a <code>ConnectionPool</code> name as a JNDI data source. * Most methods in this implementation do nothing since configuration is handled by the underlying JDBC datasource. Users should always call <code>XConnection.close()</code> from their stylsheet to explicitely close their connection. However, since there is no way to enforce this (Yikes!), it is recommended that a relatively short datasource timeout be used to prevent dangling connections. 
public	TokenNamepublic	
class	TokenNameclass	
JNDIConnectionPool	TokenNameIdentifier	 JNDI Connection Pool
implements	TokenNameimplements	
ConnectionPool	TokenNameIdentifier	 Connection Pool
{	TokenNameLBRACE	
/** * Reference to the datasource */	TokenNameCOMMENT_JAVADOC	 Reference to the datasource 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
jdbcSource	TokenNameIdentifier	 jdbc Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * To maintain Java 1.3 compatibility, we need to work with the * DataSource class through Reflection. The getConnection method * is one of the methods used, and there are two different flavors. * */	TokenNameCOMMENT_JAVADOC	 To maintain Java 1.3 compatibility, we need to work with the DataSource class through Reflection. The getConnection method is one of the methods used, and there are two different flavors. 
private	TokenNameprivate	
Method	TokenNameIdentifier	 Method
getConnectionWithArgs	TokenNameIdentifier	 get Connection With Args
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Method	TokenNameIdentifier	 Method
getConnection	TokenNameIdentifier	 get Connection
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The unique jndi path for this datasource. */	TokenNameCOMMENT_JAVADOC	 The unique jndi path for this datasource. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
jndiPath	TokenNameIdentifier	 jndi Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * User name for protected datasources. */	TokenNameCOMMENT_JAVADOC	 User name for protected datasources. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
user	TokenNameIdentifier	 user
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Password for protected datasources. */	TokenNameCOMMENT_JAVADOC	 Password for protected datasources. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
pwd	TokenNameIdentifier	 pwd
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Use of the default constructor requires the jndi path to be set via * setJndiPath(). */	TokenNameCOMMENT_JAVADOC	 Use of the default constructor requires the jndi path to be set via setJndiPath(). 
public	TokenNamepublic	
JNDIConnectionPool	TokenNameIdentifier	 JNDI Connection Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a connection pool with a specified JNDI path. * @param jndiDatasourcePath Complete path to the JNDI datasource */	TokenNameCOMMENT_JAVADOC	 Creates a connection pool with a specified JNDI path. @param jndiDatasourcePath Complete path to the JNDI datasource 
public	TokenNamepublic	
JNDIConnectionPool	TokenNameIdentifier	 JNDI Connection Pool
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
jndiDatasourcePath	TokenNameIdentifier	 jndi Datasource Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jndiPath	TokenNameIdentifier	 jndi Path
=	TokenNameEQUAL	
jndiDatasourcePath	TokenNameIdentifier	 jndi Datasource Path
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the path for the jndi datasource * @param jndiPath */	TokenNameCOMMENT_JAVADOC	 Sets the path for the jndi datasource @param jndiPath 
public	TokenNamepublic	
void	TokenNamevoid	
setJndiPath	TokenNameIdentifier	 set Jndi Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
jndiPath	TokenNameIdentifier	 jndi Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
jndiPath	TokenNameIdentifier	 jndi Path
=	TokenNameEQUAL	
jndiPath	TokenNameIdentifier	 jndi Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the path for the jndi datasource * @param jndiPath */	TokenNameCOMMENT_JAVADOC	 Returns the path for the jndi datasource @param jndiPath 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getJndiPath	TokenNameIdentifier	 get Jndi Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
jndiPath	TokenNameIdentifier	 jndi Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Always returns true. * This method was intended to indicate if the pool was enabled, however, in * this implementation that is not relavant. * @return */	TokenNameCOMMENT_JAVADOC	 Always returns true. This method was intended to indicate if the pool was enabled, however, in this implementation that is not relavant. @return 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Not implemented and will throw an Error if called. * * Connection configuration is handled by the underlying JNDI DataSource. * @param d */	TokenNameCOMMENT_JAVADOC	 Not implemented and will throw an Error if called. * Connection configuration is handled by the underlying JNDI DataSource. @param d 
public	TokenNamepublic	
void	TokenNamevoid	
setDriver	TokenNameIdentifier	 set Driver
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"This method is not supported. "	TokenNameStringLiteral	This method is not supported. 
+	TokenNamePLUS	
"All connection information is handled by the JDBC datasource provider"	TokenNameStringLiteral	All connection information is handled by the JDBC datasource provider
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Not implemented and will throw an Error if called. * * Connection configuration is handled by the underlying JNDI DataSource. * @param d */	TokenNameCOMMENT_JAVADOC	 Not implemented and will throw an Error if called. * Connection configuration is handled by the underlying JNDI DataSource. @param d 
public	TokenNamepublic	
void	TokenNamevoid	
setURL	TokenNameIdentifier	 set URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"This method is not supported. "	TokenNameStringLiteral	This method is not supported. 
+	TokenNamePLUS	
"All connection information is handled by the JDBC datasource provider"	TokenNameStringLiteral	All connection information is handled by the JDBC datasource provider
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Intended to release unused connections from the pool. * Does nothing in this implementation. */	TokenNameCOMMENT_JAVADOC	 Intended to release unused connections from the pool. Does nothing in this implementation. 
public	TokenNamepublic	
void	TokenNamevoid	
freeUnused	TokenNameIdentifier	 free Unused
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Do nothing - not an error to call this method 	TokenNameCOMMENT_LINE	Do nothing - not an error to call this method 
}	TokenNameRBRACE	
/** * Always returns false, indicating that this wrapper has no idea of what * connections the underlying JNDI source is maintaining. * @return */	TokenNameCOMMENT_JAVADOC	 Always returns false, indicating that this wrapper has no idea of what connections the underlying JNDI source is maintaining. @return 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasActiveConnections	TokenNameIdentifier	 has Active Connections
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the password for the connection. * If the jndi datasource does not require a password (which is typical), * this can be left null. * @param p the password */	TokenNameCOMMENT_JAVADOC	 Sets the password for the connection. If the jndi datasource does not require a password (which is typical), this can be left null. @param p the password 
public	TokenNamepublic	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
pwd	TokenNameIdentifier	 pwd
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the user name for the connection. * If the jndi datasource does not require a user name (which is typical), * this can be left null. * @param u the user name */	TokenNameCOMMENT_JAVADOC	 Sets the user name for the connection. If the jndi datasource does not require a user name (which is typical), this can be left null. @param u the user name 
public	TokenNamepublic	
void	TokenNamevoid	
setUser	TokenNameIdentifier	 set User
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
user	TokenNameIdentifier	 user
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a connection from the JDNI DataSource found at the JNDI Datasource * path. * * @return * @throws SQLException */	TokenNameCOMMENT_JAVADOC	 Returns a connection from the JDNI DataSource found at the JNDI Datasource path. * @return @throws SQLException 
public	TokenNamepublic	
Connection	TokenNameIdentifier	 Connection
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
jdbcSource	TokenNameIdentifier	 jdbc Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
findDatasource	TokenNameIdentifier	 find Datasource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NamingException	TokenNameIdentifier	 Naming Exception
ne	TokenNameIdentifier	 ne
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SQLException	TokenNameIdentifier	 SQL Exception
(	TokenNameLPAREN	
"Could not create jndi context for "	TokenNameStringLiteral	Could not create jndi context for 
+	TokenNamePLUS	
jndiPath	TokenNameIdentifier	 jndi Path
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
ne	TokenNameIdentifier	 ne
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
user	TokenNameIdentifier	 user
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
pwd	TokenNameIdentifier	 pwd
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
arglist	TokenNameIdentifier	 arglist
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
user	TokenNameIdentifier	 user
,	TokenNameCOMMA	
pwd	TokenNameIdentifier	 pwd
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
)	TokenNameRPAREN	
getConnectionWithArgs	TokenNameIdentifier	 get Connection With Args
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
jdbcSource	TokenNameIdentifier	 jdbc Source
,	TokenNameCOMMA	
arglist	TokenNameIdentifier	 arglist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
arglist	TokenNameIdentifier	 arglist
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
)	TokenNameRPAREN	
getConnection	TokenNameIdentifier	 get Connection
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
jdbcSource	TokenNameIdentifier	 jdbc Source
,	TokenNameCOMMA	
arglist	TokenNameIdentifier	 arglist
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
SQLException	TokenNameIdentifier	 SQL Exception
(	TokenNameLPAREN	
"Could not create jndi connection for "	TokenNameStringLiteral	Could not create jndi connection for 
+	TokenNamePLUS	
jndiPath	TokenNameIdentifier	 jndi Path
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Internal method used to look up the datasource. * @throws NamingException */	TokenNameCOMMENT_JAVADOC	 Internal method used to look up the datasource. @throws NamingException 
protected	TokenNameprotected	
void	TokenNamevoid	
findDatasource	TokenNameIdentifier	 find Datasource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NamingException	TokenNameIdentifier	 Naming Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
InitialContext	TokenNameIdentifier	 Initial Context
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
new	TokenNamenew	
InitialContext	TokenNameIdentifier	 Initial Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jdbcSource	TokenNameIdentifier	 jdbc Source
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
jndiPath	TokenNameIdentifier	 jndi Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
withArgs	TokenNameIdentifier	 with Args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
getConnectionWithArgs	TokenNameIdentifier	 get Connection With Args
=	TokenNameEQUAL	
jdbcSource	TokenNameIdentifier	 jdbc Source
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDeclaredMethod	TokenNameIdentifier	 get Declared Method
(	TokenNameLPAREN	
"getConnection"	TokenNameStringLiteral	getConnection
,	TokenNameCOMMA	
withArgs	TokenNameIdentifier	 with Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
noArgs	TokenNameIdentifier	 no Args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
getConnection	TokenNameIdentifier	 get Connection
=	TokenNameEQUAL	
jdbcSource	TokenNameIdentifier	 jdbc Source
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDeclaredMethod	TokenNameIdentifier	 get Declared Method
(	TokenNameLPAREN	
"getConnection"	TokenNameStringLiteral	getConnection
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NamingException	TokenNameIdentifier	 Naming Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For simpleification, we will just throw a NamingException. We will only 	TokenNameCOMMENT_LINE	For simpleification, we will just throw a NamingException. We will only 
// use the message part of the exception anyway. 	TokenNameCOMMENT_LINE	use the message part of the exception anyway. 
throw	TokenNamethrow	
new	TokenNamenew	
NamingException	TokenNameIdentifier	 Naming Exception
(	TokenNameLPAREN	
"Unable to resolve JNDI DataSource - "	TokenNameStringLiteral	Unable to resolve JNDI DataSource - 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
releaseConnection	TokenNameIdentifier	 release Connection
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
releaseConnectionOnError	TokenNameIdentifier	 release Connection On Error
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Releases the reference to the jndi datasource. * The original intention of this method was to actually turn the pool *off*. * Since we are not managing the pool, we simply release our reference to * the datasource. Future calls to the getConnection will simply recreate * the datasource. * @param flag If false, the reference to the datasource is released. */	TokenNameCOMMENT_JAVADOC	 Releases the reference to the jndi datasource. The original intention of this method was to actually turn the pool *off*. Since we are not managing the pool, we simply release our reference to the datasource. Future calls to the getConnection will simply recreate the datasource. @param flag If false, the reference to the datasource is released. 
public	TokenNamepublic	
void	TokenNamevoid	
setPoolEnabled	TokenNameIdentifier	 set Pool Enabled
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
jdbcSource	TokenNameIdentifier	 jdbc Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ignored in this implementation b/c the pooling is determined by the jndi dataosource. * @param p */	TokenNameCOMMENT_JAVADOC	 Ignored in this implementation b/c the pooling is determined by the jndi dataosource. @param p 
public	TokenNamepublic	
void	TokenNamevoid	
setProtocol	TokenNameIdentifier	 set Protocol
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* ignore - properties are determined by datasource */	TokenNameCOMMENT_BLOCK	 ignore - properties are determined by datasource 
}	TokenNameRBRACE	
/** * Ignored in this implementation b/c the pooling is determined by the jndi dataosource. * @param n */	TokenNameCOMMENT_JAVADOC	 Ignored in this implementation b/c the pooling is determined by the jndi dataosource. @param n 
public	TokenNamepublic	
void	TokenNamevoid	
setMinConnections	TokenNameIdentifier	 set Min Connections
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* ignore - pooling is determined by datasource */	TokenNameCOMMENT_BLOCK	 ignore - pooling is determined by datasource 
}	TokenNameRBRACE	
/** * A simple test to see if the jndi datasource exists. * * Note that this test does not ensure that the datasource will return valid * connections. */	TokenNameCOMMENT_JAVADOC	 A simple test to see if the jndi datasource exists. * Note that this test does not ensure that the datasource will return valid connections. 
public	TokenNamepublic	
boolean	TokenNameboolean	
testConnection	TokenNameIdentifier	 test Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
jdbcSource	TokenNameIdentifier	 jdbc Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
findDatasource	TokenNameIdentifier	 find Datasource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NamingException	TokenNameIdentifier	 Naming Exception
ne	TokenNameIdentifier	 ne
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
