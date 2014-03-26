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
/** * This class is a container for parser settings that relate to * security, or more specifically, it is intended to be used to prevent denial-of-service * attacks from being launched against a system running Xerces. * Any component that is aware of a denial-of-service attack that can arise * from its processing of a certain kind of document may query its Component Manager * for the property (http://apache.org/xml/properties/security-manager) * whose value will be an instance of this class. * If no value has been set for the property, the component should proceed in the "usual" (spec-compliant) * manner. If a value has been set, then it must be the case that the component in * question needs to know what method of this class to query. This class * will provide defaults for all known security issues, but will also provide * setters so that those values can be tailored by applications that care. * * @author Neil Graham, IBM * * @version $Id: SecurityManager.java 447241 2006-09-18 05:12:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class is a container for parser settings that relate to security, or more specifically, it is intended to be used to prevent denial-of-service attacks from being launched against a system running Xerces. Any component that is aware of a denial-of-service attack that can arise from its processing of a certain kind of document may query its Component Manager for the property (http://apache.org/xml/properties/security-manager) whose value will be an instance of this class. If no value has been set for the property, the component should proceed in the "usual" (spec-compliant) manner. If a value has been set, then it must be the case that the component in question needs to know what method of this class to query. This class will provide defaults for all known security issues, but will also provide setters so that those values can be tailored by applications that care. * @author Neil Graham, IBM * @version $Id: SecurityManager.java 447241 2006-09-18 05:12:57Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SecurityManager	TokenNameIdentifier	 Security Manager
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Default value for entity expansion limit. **/	TokenNameCOMMENT_JAVADOC	 Default value for entity expansion limit. *
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
DEFAULT_ENTITY_EXPANSION_LIMIT	TokenNameIdentifier	 DEFAULT  ENTITY  EXPANSION  LIMIT
=	TokenNameEQUAL	
100000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Default value of number of nodes created. **/	TokenNameCOMMENT_JAVADOC	 Default value of number of nodes created. *
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
DEFAULT_MAX_OCCUR_NODE_LIMIT	TokenNameIdentifier	 DEFAULT  MAX  OCCUR  NODE  LIMIT
=	TokenNameEQUAL	
3000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Entity expansion limit. **/	TokenNameCOMMENT_JAVADOC	 Entity expansion limit. *
private	TokenNameprivate	
int	TokenNameint	
entityExpansionLimit	TokenNameIdentifier	 entity Expansion Limit
;	TokenNameSEMICOLON	
/** W3C XML Schema maxOccurs limit. **/	TokenNameCOMMENT_JAVADOC	 W3C XML Schema maxOccurs limit. *
private	TokenNameprivate	
int	TokenNameint	
maxOccurLimit	TokenNameIdentifier	 max Occur Limit
;	TokenNameSEMICOLON	
/** * Default constructor. Establishes default values * for known security vulnerabilities. */	TokenNameCOMMENT_JAVADOC	 Default constructor. Establishes default values for known security vulnerabilities. 
public	TokenNamepublic	
SecurityManager	TokenNameIdentifier	 Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entityExpansionLimit	TokenNameIdentifier	 entity Expansion Limit
=	TokenNameEQUAL	
DEFAULT_ENTITY_EXPANSION_LIMIT	TokenNameIdentifier	 DEFAULT  ENTITY  EXPANSION  LIMIT
;	TokenNameSEMICOLON	
maxOccurLimit	TokenNameIdentifier	 max Occur Limit
=	TokenNameEQUAL	
DEFAULT_MAX_OCCUR_NODE_LIMIT	TokenNameIdentifier	 DEFAULT  MAX  OCCUR  NODE  LIMIT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Sets the number of entity expansions that the * parser should permit in a document.</p> * * @param limit the number of entity expansions * permitted in a document */	TokenNameCOMMENT_JAVADOC	 <p>Sets the number of entity expansions that the parser should permit in a document.</p> * @param limit the number of entity expansions permitted in a document 
public	TokenNamepublic	
void	TokenNamevoid	
setEntityExpansionLimit	TokenNameIdentifier	 set Entity Expansion Limit
(	TokenNameLPAREN	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entityExpansionLimit	TokenNameIdentifier	 entity Expansion Limit
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Returns the number of entity expansions * that the parser permits in a document.</p> * * @return the number of entity expansions * permitted in a document */	TokenNameCOMMENT_JAVADOC	 <p>Returns the number of entity expansions that the parser permits in a document.</p> * @return the number of entity expansions permitted in a document 
public	TokenNamepublic	
int	TokenNameint	
getEntityExpansionLimit	TokenNameIdentifier	 get Entity Expansion Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entityExpansionLimit	TokenNameIdentifier	 entity Expansion Limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Sets the limit of the number of content model nodes * that may be created when building a grammar for a W3C * XML Schema that contains maxOccurs attributes with values * other than "unbounded".</p> * * @param limit the maximum value for maxOccurs other * than "unbounded" */	TokenNameCOMMENT_JAVADOC	 <p>Sets the limit of the number of content model nodes that may be created when building a grammar for a W3C XML Schema that contains maxOccurs attributes with values other than "unbounded".</p> * @param limit the maximum value for maxOccurs other than "unbounded" 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxOccurNodeLimit	TokenNameIdentifier	 set Max Occur Node Limit
(	TokenNameLPAREN	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxOccurLimit	TokenNameIdentifier	 max Occur Limit
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Returns the limit of the number of content model nodes * that may be created when building a grammar for a W3C * XML Schema that contains maxOccurs attributes with values * other than "unbounded".</p> * * @return the maximum value for maxOccurs other * than "unbounded" */	TokenNameCOMMENT_JAVADOC	 <p>Returns the limit of the number of content model nodes that may be created when building a grammar for a W3C XML Schema that contains maxOccurs attributes with values other than "unbounded".</p> * @return the maximum value for maxOccurs other than "unbounded" 
public	TokenNamepublic	
int	TokenNameint	
getMaxOccurNodeLimit	TokenNameIdentifier	 get Max Occur Node Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxOccurLimit	TokenNameIdentifier	 max Occur Limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class SecurityManager 	TokenNameCOMMENT_LINE	class SecurityManager 
