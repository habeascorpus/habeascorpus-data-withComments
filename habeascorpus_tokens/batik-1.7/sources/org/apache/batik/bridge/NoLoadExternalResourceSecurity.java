/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
/** * This implementation does not allow any external resources to be * referenced from an SVG document. * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: NoLoadExternalResourceSecurity.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This implementation does not allow any external resources to be referenced from an SVG document. * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: NoLoadExternalResourceSecurity.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
NoLoadExternalResourceSecurity	TokenNameIdentifier	 No Load External Resource Security
implements	TokenNameimplements	
ExternalResourceSecurity	TokenNameIdentifier	 External Resource Security
{	TokenNameLBRACE	
/** * Message when trying to load an external resource */	TokenNameCOMMENT_JAVADOC	 Message when trying to load an external resource 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_EXTERNAL_RESOURCE_ALLOWED	TokenNameIdentifier	 ERROR  NO  EXTERNAL  RESOURCE  ALLOWED
=	TokenNameEQUAL	
"NoLoadExternalResourceSecurity.error.no.external.resource.allowed"	TokenNameStringLiteral	NoLoadExternalResourceSecurity.error.no.external.resource.allowed
;	TokenNameSEMICOLON	
/** * The exception is built in the constructor and thrown if * not null and the checkLoadExternalResource method is called. */	TokenNameCOMMENT_JAVADOC	 The exception is built in the constructor and thrown if not null and the checkLoadExternalResource method is called. 
protected	TokenNameprotected	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
;	TokenNameSEMICOLON	
/** * Controls whether the external resource should be loaded or not. * * @throws SecurityException if the externalResource should not be loaded. */	TokenNameCOMMENT_JAVADOC	 Controls whether the external resource should be loaded or not. * @throws SecurityException if the externalResource should not be loaded. 
public	TokenNamepublic	
void	TokenNamevoid	
checkLoadExternalResource	TokenNameIdentifier	 check Load External Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
fillInStackTrace	TokenNameIdentifier	 fill In Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
se	TokenNameIdentifier	 se
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
NoLoadExternalResourceSecurity	TokenNameIdentifier	 No Load External Resource Security
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
se	TokenNameIdentifier	 se
=	TokenNameEQUAL	
new	TokenNamenew	
SecurityException	TokenNameIdentifier	 Security Exception
(	TokenNameLPAREN	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
ERROR_NO_EXTERNAL_RESOURCE_ALLOWED	TokenNameIdentifier	 ERROR  NO  EXTERNAL  RESOURCE  ALLOWED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
