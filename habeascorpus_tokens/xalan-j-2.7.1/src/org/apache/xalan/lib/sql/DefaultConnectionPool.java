/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DefaultConnectionPool.java 468638 2006-10-28 06:52:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DefaultConnectionPool.java 468638 2006-10-28 06:52:06Z minchau $ 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
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
Properties	TokenNameIdentifier	 Properties
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
;	TokenNameSEMICOLON	
/** * For internal connectiones, i.e. Connection information supplies in the * Stylesheet. The Default Connection Pool will be used. */	TokenNameCOMMENT_JAVADOC	 For internal connectiones, i.e. Connection information supplies in the Stylesheet. The Default Connection Pool will be used. 
public	TokenNamepublic	
class	TokenNameclass	
DefaultConnectionPool	TokenNameIdentifier	 Default Connection Pool
implements	TokenNameimplements	
ConnectionPool	TokenNameIdentifier	 Connection Pool
{	TokenNameLBRACE	
/** * A placeholder thast will keep the driver loaded * between calls. */	TokenNameCOMMENT_JAVADOC	 A placeholder thast will keep the driver loaded between calls. 
private	TokenNameprivate	
Driver	TokenNameIdentifier	 Driver
m_Driver	TokenNameIdentifier	 m  Driver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The basic information to make a JDBC Connection */	TokenNameCOMMENT_JAVADOC	 The basic information to make a JDBC Connection 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_driver	TokenNameIdentifier	 m driver
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_url	TokenNameIdentifier	 m url
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The mimimum size of the connection pool, if the * number of available connections falls below this * mark, min connections will be allocated. The Connection * Pool will always be somewhere between MinSize and MinSize*2 */	TokenNameCOMMENT_JAVADOC	 The mimimum size of the connection pool, if the number of available connections falls below this mark, min connections will be allocated. The Connection Pool will always be somewhere between MinSize and MinSize*2 
private	TokenNameprivate	
int	TokenNameint	
m_PoolMinSize	TokenNameIdentifier	 m  Pool Min Size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Always implement the properties mechinism, if the Password * or Username is set seperatly then we will add them to the * property manually. */	TokenNameCOMMENT_JAVADOC	 Always implement the properties mechinism, if the Password or Username is set seperatly then we will add them to the property manually. 
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
m_ConnectionProtocol	TokenNameIdentifier	 m  Connection Protocol
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Storage for the PooledConnections */	TokenNameCOMMENT_JAVADOC	 Storage for the PooledConnections 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_pool	TokenNameIdentifier	 m pool
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Are we active ?? */	TokenNameCOMMENT_JAVADOC	 Are we active ?? 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_IsActive	TokenNameIdentifier	 m  Is Active
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
DefaultConnectionPool	TokenNameIdentifier	 Default Connection Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Return our current Active state * */	TokenNameCOMMENT_JAVADOC	 Return our current Active state 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_IsActive	TokenNameIdentifier	 m  Is Active
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the driver call to be used to create connections * @param d * */	TokenNameCOMMENT_JAVADOC	 Set the driver call to be used to create connections @param d 
public	TokenNamepublic	
void	TokenNamevoid	
setDriver	TokenNameIdentifier	 set Driver
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_driver	TokenNameIdentifier	 m driver
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the url used to connect to the database * @param url * */	TokenNameCOMMENT_JAVADOC	 Set the url used to connect to the database @param url 
public	TokenNamepublic	
void	TokenNamevoid	
setURL	TokenNameIdentifier	 set URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_url	TokenNameIdentifier	 m url
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Go through the connection pool and release any connections * that are not InUse; * */	TokenNameCOMMENT_JAVADOC	 Go through the connection pool and release any connections that are not InUse; 
public	TokenNamepublic	
void	TokenNamevoid	
freeUnused	TokenNameIdentifier	 free Unused
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Iterate over the entire pool closing the 	TokenNameCOMMENT_LINE	Iterate over the entire pool closing the 
// JDBC Connections. 	TokenNameCOMMENT_LINE	JDBC Connections. 
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PooledConnection	TokenNameIdentifier	 Pooled Connection
pcon	TokenNameIdentifier	 pcon
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PooledConnection	TokenNameIdentifier	 Pooled Connection
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the PooledConnection is not in use, close it 	TokenNameCOMMENT_LINE	If the PooledConnection is not in use, close it 
if	TokenNameif	
(	TokenNameLPAREN	
pcon	TokenNameIdentifier	 pcon
.	TokenNameDOT	
inUse	TokenNameIdentifier	 in Use
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Closing JDBC Connection "	TokenNameStringLiteral	Closing JDBC Connection 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pcon	TokenNameIdentifier	 pcon
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Is our ConnectionPool have any connections that are still in Use ?? * */	TokenNameCOMMENT_JAVADOC	 Is our ConnectionPool have any connections that are still in Use ?? 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasActiveConnections	TokenNameIdentifier	 has Active Connections
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the password in the property set. * @param p * */	TokenNameCOMMENT_JAVADOC	 Set the password in the property set. @param p 
public	TokenNamepublic	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ConnectionProtocol	TokenNameIdentifier	 m  Connection Protocol
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"password"	TokenNameStringLiteral	password
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the user name in the property set * @param u * */	TokenNameCOMMENT_JAVADOC	 Set the user name in the property set @param u 
public	TokenNamepublic	
void	TokenNamevoid	
setUser	TokenNameIdentifier	 set User
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ConnectionProtocol	TokenNameIdentifier	 m  Connection Protocol
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"user"	TokenNameStringLiteral	user
,	TokenNameCOMMA	
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The Protocol string is used to pass in other connection * properties. A properties file is a general purpose container * * @param p * */	TokenNameCOMMENT_JAVADOC	 The Protocol string is used to pass in other connection properties. A properties file is a general purpose container * @param p 
public	TokenNamepublic	
void	TokenNamevoid	
setProtocol	TokenNameIdentifier	 set Protocol
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ConnectionProtocol	TokenNameIdentifier	 m  Connection Protocol
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Override the current number of connections to keep in the pool. This * setting will only have effect on a new pool or when a new connection * is requested and there is less connections that this setting. * @param n * */	TokenNameCOMMENT_JAVADOC	 Override the current number of connections to keep in the pool. This setting will only have effect on a new pool or when a new connection is requested and there is less connections that this setting. @param n 
public	TokenNamepublic	
void	TokenNamevoid	
setMinConnections	TokenNameIdentifier	 set Min Connections
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_PoolMinSize	TokenNameIdentifier	 m  Pool Min Size
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Try to aquire a new connection, if it succeeds then return * true, else return false. * Note: This method will cause the connection pool to be built. * */	TokenNameCOMMENT_JAVADOC	 Try to aquire a new connection, if it succeeds then return true, else return false. Note: This method will cause the connection pool to be built. 
public	TokenNamepublic	
boolean	TokenNameboolean	
testConnection	TokenNameIdentifier	 test Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
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
"Testing Connection"	TokenNameStringLiteral	Testing Connection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Connection	TokenNameIdentifier	 Connection
conn	TokenNameIdentifier	 conn
=	TokenNameEQUAL	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DatabaseMetaData	TokenNameIdentifier	 Database Meta Data
dma	TokenNameIdentifier	 dma
=	TokenNameEQUAL	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
getMetaData	TokenNameIdentifier	 get Meta Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Connected to "	TokenNameStringLiteral	 Connected to 
+	TokenNamePLUS	
dma	TokenNameIdentifier	 dma
.	TokenNameDOT	
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Driver "	TokenNameStringLiteral	Driver 
+	TokenNamePLUS	
dma	TokenNameIdentifier	 dma
.	TokenNameDOT	
getDriverName	TokenNameIdentifier	 get Driver Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Version "	TokenNameStringLiteral	Version 
+	TokenNamePLUS	
dma	TokenNameIdentifier	 dma
.	TokenNameDOT	
getDriverVersion	TokenNameIdentifier	 get Driver Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
conn	TokenNameIdentifier	 conn
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
releaseConnection	TokenNameIdentifier	 release Connection
(	TokenNameLPAREN	
conn	TokenNameIdentifier	 conn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"Testing Connection, SUCCESS"	TokenNameStringLiteral	Testing Connection, SUCCESS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
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
"Testing Connection, FAILED"	TokenNameStringLiteral	Testing Connection, FAILED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Find an available connection 	TokenNameCOMMENT_LINE	Find an available connection 
/** * @return Connection * @throws SQLException * @throws IllegalArgumentException */	TokenNameCOMMENT_JAVADOC	 @return Connection @throws SQLException @throws IllegalArgumentException 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Connection	TokenNameIdentifier	 Connection
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
,	TokenNameCOMMA	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
PooledConnection	TokenNameIdentifier	 Pooled Connection
pcon	TokenNameIdentifier	 pcon
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// We will fill up the pool any time it is less than the 	TokenNameCOMMENT_LINE	We will fill up the pool any time it is less than the 
// Minimum. THis could be cause by the enableing and disabling 	TokenNameCOMMENT_LINE	Minimum. THis could be cause by the enableing and disabling 
// or the pool. 	TokenNameCOMMENT_LINE	or the pool. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
m_PoolMinSize	TokenNameIdentifier	 m  Pool Min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initializePool	TokenNameIdentifier	 initialize Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// find a connection not in use 	TokenNameCOMMENT_LINE	find a connection not in use 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pcon	TokenNameIdentifier	 pcon
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PooledConnection	TokenNameIdentifier	 Pooled Connection
)	TokenNameRPAREN	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check to see if the Connection is in use 	TokenNameCOMMENT_LINE	Check to see if the Connection is in use 
if	TokenNameif	
(	TokenNameLPAREN	
pcon	TokenNameIdentifier	 pcon
.	TokenNameDOT	
inUse	TokenNameIdentifier	 in Use
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Mark it as in use 	TokenNameCOMMENT_LINE	Mark it as in use 
pcon	TokenNameIdentifier	 pcon
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return the JDBC Connection stored in the 	TokenNameCOMMENT_LINE	return the JDBC Connection stored in the 
// PooledConnection object 	TokenNameCOMMENT_LINE	PooledConnection object 
return	TokenNamereturn	
pcon	TokenNameIdentifier	 pcon
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Could not find a free connection, 	TokenNameCOMMENT_LINE	Could not find a free connection, 
// create and add a new one 	TokenNameCOMMENT_LINE	create and add a new one 
// Create a new JDBC Connection 	TokenNameCOMMENT_LINE	Create a new JDBC Connection 
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
createConnection	TokenNameIdentifier	 create Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create a new PooledConnection, passing it the JDBC 	TokenNameCOMMENT_LINE	Create a new PooledConnection, passing it the JDBC 
// Connection 	TokenNameCOMMENT_LINE	Connection 
pcon	TokenNameIdentifier	 pcon
=	TokenNameEQUAL	
new	TokenNamenew	
PooledConnection	TokenNameIdentifier	 Pooled Connection
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Mark the connection as in use 	TokenNameCOMMENT_LINE	Mark the connection as in use 
pcon	TokenNameIdentifier	 pcon
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the new PooledConnection object to the pool 	TokenNameCOMMENT_LINE	Add the new PooledConnection object to the pool 
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
pcon	TokenNameIdentifier	 pcon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return the new Connection 	TokenNameCOMMENT_LINE	return the new Connection 
return	TokenNamereturn	
pcon	TokenNameIdentifier	 pcon
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param con * * @throws SQLException */	TokenNameCOMMENT_JAVADOC	 @param con * @throws SQLException 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
releaseConnection	TokenNameIdentifier	 release Connection
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
// find the PooledConnection Object 	TokenNameCOMMENT_LINE	find the PooledConnection Object 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PooledConnection	TokenNameIdentifier	 Pooled Connection
pcon	TokenNameIdentifier	 pcon
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PooledConnection	TokenNameIdentifier	 Pooled Connection
)	TokenNameRPAREN	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check for correct Connection 	TokenNameCOMMENT_LINE	Check for correct Connection 
if	TokenNameif	
(	TokenNameLPAREN	
pcon	TokenNameIdentifier	 pcon
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
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
"Releasing Connection "	TokenNameStringLiteral	Releasing Connection 
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
removeElementAt	TokenNameIdentifier	 remove Element At
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"-->Inactive Pool, Closing connection"	TokenNameStringLiteral	-->Inactive Pool, Closing connection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Set it's inuse attribute to false, which 	TokenNameCOMMENT_LINE	Set it's inuse attribute to false, which 
// releases it for use 	TokenNameCOMMENT_LINE	releases it for use 
pcon	TokenNameIdentifier	 pcon
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param con * * @throws SQLException */	TokenNameCOMMENT_JAVADOC	 @param con * @throws SQLException 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
releaseConnectionOnError	TokenNameIdentifier	 release Connection On Error
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
// find the PooledConnection Object 	TokenNameCOMMENT_LINE	find the PooledConnection Object 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PooledConnection	TokenNameIdentifier	 Pooled Connection
pcon	TokenNameIdentifier	 pcon
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PooledConnection	TokenNameIdentifier	 Pooled Connection
)	TokenNameRPAREN	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check for correct Connection 	TokenNameCOMMENT_LINE	Check for correct Connection 
if	TokenNameif	
(	TokenNameLPAREN	
pcon	TokenNameIdentifier	 pcon
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
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
"Releasing Connection On Error"	TokenNameStringLiteral	Releasing Connection On Error
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
removeElementAt	TokenNameIdentifier	 remove Element At
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"-->Inactive Pool, Closing connection"	TokenNameStringLiteral	-->Inactive Pool, Closing connection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * @throws SQLException */	TokenNameCOMMENT_JAVADOC	 * @throws SQLException 
private	TokenNameprivate	
Connection	TokenNameIdentifier	 Connection
createConnection	TokenNameIdentifier	 create Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Create a Connection directly from the Driver that was loaded 	TokenNameCOMMENT_LINE	Create a Connection directly from the Driver that was loaded 
// with the context class loader. This is to support JDK1.4 	TokenNameCOMMENT_LINE	with the context class loader. This is to support JDK1.4 
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
m_Driver	TokenNameIdentifier	 m  Driver
.	TokenNameDOT	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
m_url	TokenNameIdentifier	 m url
,	TokenNameCOMMA	
m_ConnectionProtocol	TokenNameIdentifier	 m  Connection Protocol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
con	TokenNameIdentifier	 con
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Initialize the pool 	TokenNameCOMMENT_LINE	Initialize the pool 
/** * * @throws IllegalArgumentException * @throws SQLException */	TokenNameCOMMENT_JAVADOC	 * @throws IllegalArgumentException @throws SQLException 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
initializePool	TokenNameIdentifier	 initialize Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
,	TokenNameCOMMA	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
// Check our initial values 	TokenNameCOMMENT_LINE	Check our initial values 
if	TokenNameif	
(	TokenNameLPAREN	
m_driver	TokenNameIdentifier	 m driver
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NO_DRIVER_NAME_SPECIFIED	TokenNameIdentifier	 ER  NO  DRIVER  NAME  SPECIFIED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "No Driver Name Specified!"); 	TokenNameCOMMENT_LINE	"No Driver Name Specified!"); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_url	TokenNameIdentifier	 m url
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NO_URL_SPECIFIED	TokenNameIdentifier	 ER  NO  URL  SPECIFIED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "No URL Specified!"); 	TokenNameCOMMENT_LINE	"No URL Specified!"); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_PoolMinSize	TokenNameIdentifier	 m  Pool Min Size
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_POOLSIZE_LESS_THAN_ONE	TokenNameIdentifier	 ER  POOLSIZE  LESS  THAN  ONE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "Pool size is less than 1!"); 	TokenNameCOMMENT_LINE	"Pool size is less than 1!"); 
}	TokenNameRBRACE	
// Create the Connections 	TokenNameCOMMENT_LINE	Create the Connections 
// Load the Driver class file 	TokenNameCOMMENT_LINE	Load the Driver class file 
try	TokenNametry	
{	TokenNameLBRACE	
// We have also had problems with drivers unloading 	TokenNameCOMMENT_LINE	We have also had problems with drivers unloading 
// load an instance that will get freed with the class. 	TokenNameCOMMENT_LINE	load an instance that will get freed with the class. 
m_Driver	TokenNameIdentifier	 m  Driver
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Driver	TokenNameIdentifier	 Driver
)	TokenNameRPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
m_driver	TokenNameIdentifier	 m driver
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Register the Driver that was loaded with the Context Classloader 	TokenNameCOMMENT_LINE	Register the Driver that was loaded with the Context Classloader 
// but we will ask for connections directly from the Driver 	TokenNameCOMMENT_LINE	but we will ask for connections directly from the Driver 
// instance 	TokenNameCOMMENT_LINE	instance 
DriverManager	TokenNameIdentifier	 Driver Manager
.	TokenNameDOT	
registerDriver	TokenNameIdentifier	 register Driver
(	TokenNameLPAREN	
m_Driver	TokenNameIdentifier	 m  Driver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
ConfigurationError	TokenNameIdentifier	 Configuration Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_INVALID_DRIVER_NAME	TokenNameIdentifier	 ER  INVALID  DRIVER  NAME
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "Invalid Driver Name Specified!"); 	TokenNameCOMMENT_LINE	"Invalid Driver Name Specified!"); 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_INVALID_DRIVER_NAME	TokenNameIdentifier	 ER  INVALID  DRIVER  NAME
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// IF we are not active, don't actuall build a pool yet 	TokenNameCOMMENT_LINE	IF we are not active, don't actuall build a pool yet 
// Just set up the driver and periphal items. 	TokenNameCOMMENT_LINE	Just set up the driver and periphal items. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_IsActive	TokenNameIdentifier	 m  Is Active
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Create Connections based on the size member 	TokenNameCOMMENT_LINE	Create Connections based on the size member 
do	TokenNamedo	
{	TokenNameLBRACE	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
createConnection	TokenNameIdentifier	 create Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Create a PooledConnection to encapsulate the 	TokenNameCOMMENT_LINE	Create a PooledConnection to encapsulate the 
// real JDBC Connection 	TokenNameCOMMENT_LINE	real JDBC Connection 
PooledConnection	TokenNameIdentifier	 Pooled Connection
pcon	TokenNameIdentifier	 pcon
=	TokenNameEQUAL	
new	TokenNamenew	
PooledConnection	TokenNameIdentifier	 Pooled Connection
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the Connection the pool. 	TokenNameCOMMENT_LINE	Add the Connection the pool. 
addConnection	TokenNameIdentifier	 add Connection
(	TokenNameLPAREN	
pcon	TokenNameIdentifier	 pcon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"Adding DB Connection to the Pool"	TokenNameStringLiteral	Adding DB Connection to the Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
m_PoolMinSize	TokenNameIdentifier	 m  Pool Min Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Adds the PooledConnection to the pool 	TokenNameCOMMENT_LINE	Adds the PooledConnection to the pool 
/** * @param value * */	TokenNameCOMMENT_JAVADOC	 @param value 
private	TokenNameprivate	
void	TokenNamevoid	
addConnection	TokenNameIdentifier	 add Connection
(	TokenNameLPAREN	
PooledConnection	TokenNameIdentifier	 Pooled Connection
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Add the PooledConnection Object to the vector 	TokenNameCOMMENT_LINE	Add the PooledConnection Object to the vector 
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @throws Throwable */	TokenNameCOMMENT_JAVADOC	 * @throws Throwable 
protected	TokenNameprotected	
void	TokenNamevoid	
finalize	TokenNameIdentifier	 finalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
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
"In Default Connection Pool, Finalize"	TokenNameStringLiteral	In Default Connection Pool, Finalize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Iterate over the entire pool closing the 	TokenNameCOMMENT_LINE	Iterate over the entire pool closing the 
// JDBC Connections. 	TokenNameCOMMENT_LINE	JDBC Connections. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
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
"Closing JDBC Connection "	TokenNameStringLiteral	Closing JDBC Connection 
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PooledConnection	TokenNameIdentifier	 Pooled Connection
pcon	TokenNameIdentifier	 pcon
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PooledConnection	TokenNameIdentifier	 Pooled Connection
)	TokenNameRPAREN	
m_pool	TokenNameIdentifier	 m pool
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the PooledConnection is not in use, close it 	TokenNameCOMMENT_LINE	If the PooledConnection is not in use, close it 
if	TokenNameif	
(	TokenNameLPAREN	
pcon	TokenNameIdentifier	 pcon
.	TokenNameDOT	
inUse	TokenNameIdentifier	 in Use
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pcon	TokenNameIdentifier	 pcon
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
"--> Force close"	TokenNameStringLiteral	--> Force close
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If it still in use, sleep for 30 seconds and 	TokenNameCOMMENT_LINE	If it still in use, sleep for 30 seconds and 
// force close. 	TokenNameCOMMENT_LINE	force close. 
try	TokenNametry	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
30000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pcon	TokenNameIdentifier	 pcon
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
ie	TokenNameIdentifier	 ie
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
"Exit Default Connection Pool, Finalize"	TokenNameStringLiteral	Exit Default Connection Pool, Finalize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
finalize	TokenNameIdentifier	 finalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The Pool can be Enabled and Disabled. Disabling the pool * closes all the outstanding Unused connections and any new * connections will be closed upon release. * * @param flag Control the Connection Pool. * If it is enabled then Connections will actuall be held * around. If disabled then all unused connections will be instantly * closed and as connections are released they are closed and removed * from the pool. * * */	TokenNameCOMMENT_JAVADOC	 The Pool can be Enabled and Disabled. Disabling the pool closes all the outstanding Unused connections and any new connections will be closed upon release. * @param flag Control the Connection Pool. If it is enabled then Connections will actuall be held around. If disabled then all unused connections will be instantly closed and as connections are released they are closed and removed from the pool. * 
public	TokenNamepublic	
void	TokenNamevoid	
setPoolEnabled	TokenNameIdentifier	 set Pool Enabled
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_IsActive	TokenNameIdentifier	 m  Is Active
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
freeUnused	TokenNameIdentifier	 free Unused
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
