/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ConnectionPoolManager.java 468638 2006-10-28 06:52:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ConnectionPoolManager.java 468638 2006-10-28 06:52:06Z minchau $ 
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
Hashtable	TokenNameIdentifier	 Hashtable
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
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
ConnectionPoolManager	TokenNameIdentifier	 Connection Pool Manager
{	TokenNameLBRACE	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
m_poolTable	TokenNameIdentifier	 m pool Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
ConnectionPoolManager	TokenNameIdentifier	 Connection Pool Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the internal structures of the Pool Manager * */	TokenNameCOMMENT_JAVADOC	 Initialize the internal structures of the Pool Manager 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/** * Only do this process once * Initialize the pool table */	TokenNameCOMMENT_JAVADOC	 Only do this process once Initialize the pool table 
if	TokenNameif	
(	TokenNameLPAREN	
m_poolTable	TokenNameIdentifier	 m pool Table
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_poolTable	TokenNameIdentifier	 m pool Table
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Register a nuew connection pool to the global pool table. * If a pool by that name currently exists, then throw an * IllegalArgumentException stating that the pool already * exist. * @param name * @param pool * * @link org.apache.xalan.lib.sql.ConnectionPool} * * @throws <code>IllegalArgumentException</code>, throw this exception * if a pool with the same name currently exists. */	TokenNameCOMMENT_JAVADOC	 Register a nuew connection pool to the global pool table. If a pool by that name currently exists, then throw an IllegalArgumentException stating that the pool already exist. @param name @param pool * @link org.apache.xalan.lib.sql.ConnectionPool} * @throws <code>IllegalArgumentException</code>, throw this exception if a pool with the same name currently exists. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
registerPool	TokenNameIdentifier	 register Pool
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ConnectionPool	TokenNameIdentifier	 Connection Pool
pool	TokenNameIdentifier	 pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_poolTable	TokenNameIdentifier	 m pool Table
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
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
ER_POOL_EXISTS	TokenNameIdentifier	 ER  POOL  EXISTS
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Pool already exists"); 	TokenNameCOMMENT_LINE	"Pool already exists"); 
}	TokenNameRBRACE	
m_poolTable	TokenNameIdentifier	 m pool Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
pool	TokenNameIdentifier	 pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove a pool from the global table. If the pool still has * active connections, then only mark this pool as inactive and * leave it around until all the existing connections are closed. * @param name * */	TokenNameCOMMENT_JAVADOC	 Remove a pool from the global table. If the pool still has active connections, then only mark this pool as inactive and leave it around until all the existing connections are closed. @param name 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
removePool	TokenNameIdentifier	 remove Pool
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ConnectionPool	TokenNameIdentifier	 Connection Pool
pool	TokenNameIdentifier	 pool
=	TokenNameEQUAL	
getPool	TokenNameIdentifier	 get Pool
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
pool	TokenNameIdentifier	 pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Disable future use of this pool under the Xalan 	TokenNameCOMMENT_LINE	Disable future use of this pool under the Xalan 
// extension only. This flag should only exist in the 	TokenNameCOMMENT_LINE	extension only. This flag should only exist in the 
// wrapper and not in the actual pool implementation. 	TokenNameCOMMENT_LINE	wrapper and not in the actual pool implementation. 
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
setPoolEnabled	TokenNameIdentifier	 set Pool Enabled
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Remove the pool from the Hashtable if we don'd have 	TokenNameCOMMENT_LINE	Remove the pool from the Hashtable if we don'd have 
// any active connections. 	TokenNameCOMMENT_LINE	any active connections. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
hasActiveConnections	TokenNameIdentifier	 has Active Connections
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_poolTable	TokenNameIdentifier	 m pool Table
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the connection pool referenced by the name * @param name * * @return <code>ConnectionPool</code> a reference to the ConnectionPool * object stored in the Pool Table. If the named pool does not exist, return * null */	TokenNameCOMMENT_JAVADOC	 Return the connection pool referenced by the name @param name * @return <code>ConnectionPool</code> a reference to the ConnectionPool object stored in the Pool Table. If the named pool does not exist, return null 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
ConnectionPool	TokenNameIdentifier	 Connection Pool
getPool	TokenNameIdentifier	 get Pool
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ConnectionPool	TokenNameIdentifier	 Connection Pool
)	TokenNameRPAREN	
m_poolTable	TokenNameIdentifier	 m pool Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
