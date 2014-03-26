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
/** * Default implementation for the <tt>ExternalResourceSecurity</tt> interface. * It allows all types of external resources to be loaded, but only if they * come from the same server as the document they are referenced from. * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: DefaultExternalResourceSecurity.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Default implementation for the <tt>ExternalResourceSecurity</tt> interface. It allows all types of external resources to be loaded, but only if they come from the same server as the document they are referenced from. * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: DefaultExternalResourceSecurity.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultExternalResourceSecurity	TokenNameIdentifier	 Default External Resource Security
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
/** * Message when trying to load a external resource file and the Document * does not have a URL */	TokenNameCOMMENT_JAVADOC	 Message when trying to load a external resource file and the Document does not have a URL 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_CANNOT_ACCESS_DOCUMENT_URL	TokenNameIdentifier	 ERROR  CANNOT  ACCESS  DOCUMENT  URL
=	TokenNameEQUAL	
"DefaultExternalResourceSecurity.error.cannot.access.document.url"	TokenNameStringLiteral	DefaultExternalResourceSecurity.error.cannot.access.document.url
;	TokenNameSEMICOLON	
/** * Message when trying to load a externalResource file from a server * different than the one of the document. */	TokenNameCOMMENT_JAVADOC	 Message when trying to load a externalResource file from a server different than the one of the document. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_EXTERNAL_RESOURCE_FROM_DIFFERENT_URL	TokenNameIdentifier	 ERROR  EXTERNAL  RESOURCE  FROM  DIFFERENT  URL
=	TokenNameEQUAL	
"DefaultExternalResourceSecurity.error.external.resource.from.different.url"	TokenNameStringLiteral	DefaultExternalResourceSecurity.error.external.resource.from.different.url
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
/** * @param externalResourceURL url for the externalResource, as defined in * the externalResource's xlink:href attribute. If that * attribute was empty, then this parameter should * be null * @param docURL url for the document into which the * externalResource was found. */	TokenNameCOMMENT_JAVADOC	 @param externalResourceURL url for the externalResource, as defined in the externalResource's xlink:href attribute. If that attribute was empty, then this parameter should be null @param docURL url for the document into which the externalResource was found. 
public	TokenNamepublic	
DefaultExternalResourceSecurity	TokenNameIdentifier	 Default External Resource Security
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
externalResourceURL	TokenNameIdentifier	 external Resource URL
,	TokenNameCOMMA	
ParsedURL	TokenNameIdentifier	 Parsed URL
docURL	TokenNameIdentifier	 doc URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Make sure that the archives comes from the same host 	TokenNameCOMMENT_LINE	Make sure that the archives comes from the same host 
// as the document itself 	TokenNameCOMMENT_LINE	as the document itself 
if	TokenNameif	
(	TokenNameLPAREN	
docURL	TokenNameIdentifier	 doc URL
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
ERROR_CANNOT_ACCESS_DOCUMENT_URL	TokenNameIdentifier	 ERROR  CANNOT  ACCESS  DOCUMENT  URL
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
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
docHost	TokenNameIdentifier	 doc Host
=	TokenNameEQUAL	
docURL	TokenNameIdentifier	 doc URL
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
externalResourceHost	TokenNameIdentifier	 external Resource Host
=	TokenNameEQUAL	
externalResourceURL	TokenNameIdentifier	 external Resource URL
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
docHost	TokenNameIdentifier	 doc Host
!=	TokenNameNOT_EQUAL	
externalResourceHost	TokenNameIdentifier	 external Resource Host
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
docHost	TokenNameIdentifier	 doc Host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
docHost	TokenNameIdentifier	 doc Host
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
externalResourceHost	TokenNameIdentifier	 external Resource Host
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
ERROR_EXTERNAL_RESOURCE_FROM_DIFFERENT_URL	TokenNameIdentifier	 ERROR  EXTERNAL  RESOURCE  FROM  DIFFERENT  URL
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
