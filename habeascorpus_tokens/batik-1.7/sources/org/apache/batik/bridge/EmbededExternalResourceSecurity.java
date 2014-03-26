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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ParsedURL	TokenNameIdentifier	 Parsed URL
;	TokenNameSEMICOLON	
/** * This implementation of the <tt>ExternalResourceSecurity</tt> interface only * allows external resources embeded in the document, i.e., externalResources * embeded with the data protocol. * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: EmbededExternalResourceSecurity.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This implementation of the <tt>ExternalResourceSecurity</tt> interface only allows external resources embeded in the document, i.e., externalResources embeded with the data protocol. * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: EmbededExternalResourceSecurity.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
EmbededExternalResourceSecurity	TokenNameIdentifier	 Embeded External Resource Security
implements	TokenNameimplements	
ExternalResourceSecurity	TokenNameIdentifier	 External Resource Security
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATA_PROTOCOL	TokenNameIdentifier	 DATA  PROTOCOL
=	TokenNameEQUAL	
"data"	TokenNameStringLiteral	data
;	TokenNameSEMICOLON	
/** * Message when trying to load a external resource that is not embeded * in the document. */	TokenNameCOMMENT_JAVADOC	 Message when trying to load a external resource that is not embeded in the document. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_EXTERNAL_RESOURCE_NOT_EMBEDED	TokenNameIdentifier	 ERROR  EXTERNAL  RESOURCE  NOT  EMBEDED
=	TokenNameEQUAL	
"EmbededExternalResourceSecurity.error.external.esource.not.embeded"	TokenNameStringLiteral	EmbededExternalResourceSecurity.error.external.esource.not.embeded
;	TokenNameSEMICOLON	
/** * The exception is built in the constructor and thrown if * not null and the checkLoadExternalResource method is called. */	TokenNameCOMMENT_JAVADOC	 The exception is built in the constructor and thrown if not null and the checkLoadExternalResource method is called. 
protected	TokenNameprotected	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
;	TokenNameSEMICOLON	
/** * Controls whether the externalResource should be loaded or not. * * @throws SecurityException if the externalResource should not be loaded. */	TokenNameCOMMENT_JAVADOC	 Controls whether the externalResource should be loaded or not. * @throws SecurityException if the externalResource should not be loaded. 
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
throw	TokenNamethrow	
se	TokenNameIdentifier	 se
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param externalResourceURL url for the externalResource, as defined in * the externalResource's xlink:href attribute. If that * attribute was empty, then this parameter should * be null */	TokenNameCOMMENT_JAVADOC	 @param externalResourceURL url for the externalResource, as defined in the externalResource's xlink:href attribute. If that attribute was empty, then this parameter should be null 
public	TokenNamepublic	
EmbededExternalResourceSecurity	TokenNameIdentifier	 Embeded External Resource Security
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
externalResourceURL	TokenNameIdentifier	 external Resource URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
externalResourceURL	TokenNameIdentifier	 external Resource URL
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
DATA_PROTOCOL	TokenNameIdentifier	 DATA  PROTOCOL
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
externalResourceURL	TokenNameIdentifier	 external Resource URL
.	TokenNameDOT	
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
ERROR_EXTERNAL_RESOURCE_NOT_EMBEDED	TokenNameIdentifier	 ERROR  EXTERNAL  RESOURCE  NOT  EMBEDED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
externalResourceURL	TokenNameIdentifier	 external Resource URL
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
