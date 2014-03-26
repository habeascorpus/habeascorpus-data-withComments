/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: PooledConnection.java 468638 2006-10-28 06:52:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: PooledConnection.java 468638 2006-10-28 06:52:06Z minchau $ 
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
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
PooledConnection	TokenNameIdentifier	 Pooled Connection
{	TokenNameLBRACE	
// Real JDBC Connection 	TokenNameCOMMENT_LINE	Real JDBC Connection 
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
Connection	TokenNameIdentifier	 Connection
connection	TokenNameIdentifier	 connection
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// boolean flag used to determine if connection is in use 	TokenNameCOMMENT_LINE	boolean flag used to determine if connection is in use 
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
boolean	TokenNameboolean	
inuse	TokenNameIdentifier	 inuse
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Constructor that takes the passed in JDBC Connection 	TokenNameCOMMENT_LINE	Constructor that takes the passed in JDBC Connection 
// and stores it in the connection attribute. 	TokenNameCOMMENT_LINE	and stores it in the connection attribute. 
/** * @param value */	TokenNameCOMMENT_JAVADOC	 @param value 
public	TokenNamepublic	
PooledConnection	TokenNameIdentifier	 Pooled Connection
(	TokenNameLPAREN	
Connection	TokenNameIdentifier	 Connection
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
connection	TokenNameIdentifier	 connection
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a reference to the JDBC Connection * @return Connection */	TokenNameCOMMENT_JAVADOC	 Returns a reference to the JDBC Connection @return Connection 
public	TokenNamepublic	
Connection	TokenNameIdentifier	 Connection
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the JDBC Connection 	TokenNameCOMMENT_LINE	get the JDBC Connection 
return	TokenNamereturn	
connection	TokenNameIdentifier	 connection
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the status of the PooledConnection. * * @param value * */	TokenNameCOMMENT_JAVADOC	 Set the status of the PooledConnection. * @param value 
public	TokenNamepublic	
void	TokenNamevoid	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inuse	TokenNameIdentifier	 inuse
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current status of the PooledConnection. * */	TokenNameCOMMENT_JAVADOC	 Returns the current status of the PooledConnection. 
public	TokenNamepublic	
boolean	TokenNameboolean	
inUse	TokenNameIdentifier	 in Use
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inuse	TokenNameIdentifier	 inuse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Close the real JDBC Connection * */	TokenNameCOMMENT_JAVADOC	 Close the real JDBC Connection 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
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
sqle	TokenNameIdentifier	 sqle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
sqle	TokenNameIdentifier	 sqle
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
