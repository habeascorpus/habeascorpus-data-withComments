/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * <p>A structure that represents an error code, characterized by * a domain and a message key.</p> * * @author Naela Nissar, IBM * * @version $Id: XMLErrorCode.java 447241 2006-09-18 05:12:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>A structure that represents an error code, characterized by a domain and a message key.</p> * @author Naela Nissar, IBM * @version $Id: XMLErrorCode.java 447241 2006-09-18 05:12:57Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** error domain **/	TokenNameCOMMENT_JAVADOC	 error domain *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fDomain	TokenNameIdentifier	 f Domain
;	TokenNameSEMICOLON	
/** message key **/	TokenNameCOMMENT_JAVADOC	 message key *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fKey	TokenNameIdentifier	 f Key
;	TokenNameSEMICOLON	
/** * <p>Constructs an XMLErrorCode with the given domain and key.</p> * * @param domain The error domain. * @param key The key of the error message. */	TokenNameCOMMENT_JAVADOC	 <p>Constructs an XMLErrorCode with the given domain and key.</p> * @param domain The error domain. @param key The key of the error message. 
public	TokenNamepublic	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDomain	TokenNameIdentifier	 f Domain
=	TokenNameEQUAL	
domain	TokenNameIdentifier	 domain
;	TokenNameSEMICOLON	
fKey	TokenNameIdentifier	 f Key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Convenience method to set the values of an XMLErrorCode.</p> * * @param domain The error domain. * @param key The key of the error message. */	TokenNameCOMMENT_JAVADOC	 <p>Convenience method to set the values of an XMLErrorCode.</p> * @param domain The error domain. @param key The key of the error message. 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDomain	TokenNameIdentifier	 f Domain
=	TokenNameEQUAL	
domain	TokenNameIdentifier	 domain
;	TokenNameSEMICOLON	
fKey	TokenNameIdentifier	 f Key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Indicates whether some other object is equal to this XMLErrorCode.</p> * * @param obj the object with which to compare. */	TokenNameCOMMENT_JAVADOC	 <p>Indicates whether some other object is equal to this XMLErrorCode.</p> * @param obj the object with which to compare. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLErrorCode	TokenNameIdentifier	 XML Error Code
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
fDomain	TokenNameIdentifier	 f Domain
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
fDomain	TokenNameIdentifier	 f Domain
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fKey	TokenNameIdentifier	 f Key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
fKey	TokenNameIdentifier	 f Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Returns a hash code value for this XMLErrorCode.</p> * * @return a hash code value for this XMLErrorCode. */	TokenNameCOMMENT_JAVADOC	 <p>Returns a hash code value for this XMLErrorCode.</p> * @return a hash code value for this XMLErrorCode. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fDomain	TokenNameIdentifier	 f Domain
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
fKey	TokenNameIdentifier	 f Key
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
