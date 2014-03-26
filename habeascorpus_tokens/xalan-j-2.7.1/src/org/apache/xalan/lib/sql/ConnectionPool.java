/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ConnectionPool.java 468638 2006-10-28 06:52:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ConnectionPool.java 468638 2006-10-28 06:52:06Z minchau $ 
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
SQLException	TokenNameIdentifier	 SQL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** * An interface used to build wrapper classes around existing * Connection Pool libraries. * Title: ConnectionPool<p> * @author John Gentilin * @version 1.0 */	TokenNameCOMMENT_JAVADOC	 An interface used to build wrapper classes around existing Connection Pool libraries. Title: ConnectionPool<p> @author John Gentilin @version 1.0 
public	TokenNamepublic	
interface	TokenNameinterface	
ConnectionPool	TokenNameIdentifier	 Connection Pool
{	TokenNameLBRACE	
/** * Determine if a Connection Pool has been disabled. If a Connection pool * is disabled, then it will only manage connections that are in use. * */	TokenNameCOMMENT_JAVADOC	 Determine if a Connection Pool has been disabled. If a Connection pool is disabled, then it will only manage connections that are in use. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The Driver and URL are the only required parmeters. * @param d * */	TokenNameCOMMENT_JAVADOC	 The Driver and URL are the only required parmeters. @param d 
public	TokenNamepublic	
void	TokenNamevoid	
setDriver	TokenNameIdentifier	 set Driver
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @param url * */	TokenNameCOMMENT_JAVADOC	 @param url 
public	TokenNamepublic	
void	TokenNamevoid	
setURL	TokenNameIdentifier	 set URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Start downsizeing the pool, this usally happens right after the * pool has been marked as Inactive and we are removing connections * that are not currently inuse. * */	TokenNameCOMMENT_JAVADOC	 Start downsizeing the pool, this usally happens right after the pool has been marked as Inactive and we are removing connections that are not currently inuse. 
public	TokenNamepublic	
void	TokenNamevoid	
freeUnused	TokenNameIdentifier	 free Unused
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Provide an indicator to the PoolManager when the Pool can be removed * from the Pool Table. * */	TokenNameCOMMENT_JAVADOC	 Provide an indicator to the PoolManager when the Pool can be removed from the Pool Table. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasActiveConnections	TokenNameIdentifier	 has Active Connections
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The rest of the protocol parameters can eiter be passed in as * just Username and Password or as a property collection. If the * property collection is used, then the sperate username and password * may be ignored, it is up to the wrapper implementation to handle * the situation. If the connection information changes while after the * pool has been established, the wrapper implementation should ignore * the change and throw an error. * @param p * */	TokenNameCOMMENT_JAVADOC	 The rest of the protocol parameters can eiter be passed in as just Username and Password or as a property collection. If the property collection is used, then the sperate username and password may be ignored, it is up to the wrapper implementation to handle the situation. If the connection information changes while after the pool has been established, the wrapper implementation should ignore the change and throw an error. @param p 
public	TokenNamepublic	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @param u * */	TokenNameCOMMENT_JAVADOC	 @param u 
public	TokenNamepublic	
void	TokenNamevoid	
setUser	TokenNameIdentifier	 set User
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set tne minimum number of connections that are to be maintained in the * pool. * @param n * */	TokenNameCOMMENT_JAVADOC	 Set tne minimum number of connections that are to be maintained in the pool. @param n 
public	TokenNamepublic	
void	TokenNamevoid	
setMinConnections	TokenNameIdentifier	 set Min Connections
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Test to see if the connection info is valid to make a real connection * to the database. This method may cause the pool to be crated and filled * with min connections. * */	TokenNameCOMMENT_JAVADOC	 Test to see if the connection info is valid to make a real connection to the database. This method may cause the pool to be crated and filled with min connections. 
public	TokenNamepublic	
boolean	TokenNameboolean	
testConnection	TokenNameIdentifier	 test Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Retrive a database connection from the pool * * @throws SQLException */	TokenNameCOMMENT_JAVADOC	 Retrive a database connection from the pool * @throws SQLException 
public	TokenNamepublic	
Connection	TokenNameIdentifier	 Connection
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
;	TokenNameSEMICOLON	
/** * Return a connection to the pool, the connection may be closed if the * pool is inactive or has exceeded the max number of free connections * @param con * * @throws SQLException */	TokenNameCOMMENT_JAVADOC	 Return a connection to the pool, the connection may be closed if the pool is inactive or has exceeded the max number of free connections @param con * @throws SQLException 
public	TokenNamepublic	
void	TokenNamevoid	
releaseConnection	TokenNameIdentifier	 release Connection
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
;	TokenNameSEMICOLON	
/** * Provide a mechinism to return a connection to the pool on Error. * A good default behaviour is to close this connection and build * a new one to replace it. Some JDBC impl's won't allow you to * reuse a connection after an error occurs. * @param con * * @throws SQLException */	TokenNameCOMMENT_JAVADOC	 Provide a mechinism to return a connection to the pool on Error. A good default behaviour is to close this connection and build a new one to replace it. Some JDBC impl's won't allow you to reuse a connection after an error occurs. @param con * @throws SQLException 
public	TokenNamepublic	
void	TokenNamevoid	
releaseConnectionOnError	TokenNameIdentifier	 release Connection On Error
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
con	TokenNameIdentifier	 con
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
;	TokenNameSEMICOLON	
/** * The Pool can be Enabled and Disabled. Disabling the pool * closes all the outstanding Unused connections and any new * connections will be closed upon release. * @param flag Control the Connection Pool. If it is enabled * then Connections will actuall be held around. If disabled * then all unused connections will be instantly closed and as * connections are released they are closed and removed from the pool. * */	TokenNameCOMMENT_JAVADOC	 The Pool can be Enabled and Disabled. Disabling the pool closes all the outstanding Unused connections and any new connections will be closed upon release. @param flag Control the Connection Pool. If it is enabled then Connections will actuall be held around. If disabled then all unused connections will be instantly closed and as connections are released they are closed and removed from the pool. 
public	TokenNamepublic	
void	TokenNamevoid	
setPoolEnabled	TokenNameIdentifier	 set Pool Enabled
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to pass in extra configuration options during the * database connect phase. */	TokenNameCOMMENT_JAVADOC	 Used to pass in extra configuration options during the database connect phase. 
public	TokenNamepublic	
void	TokenNamevoid	
setProtocol	TokenNameIdentifier	 set Protocol
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
