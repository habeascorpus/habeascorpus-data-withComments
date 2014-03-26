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
/** * Default implementation for the <tt>ScriptSecurity</tt> interface. * It allows all types of scripts to be loaded, but only if they * come from the same server as the document they are included into. * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: DefaultScriptSecurity.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Default implementation for the <tt>ScriptSecurity</tt> interface. It allows all types of scripts to be loaded, but only if they come from the same server as the document they are included into. * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: DefaultScriptSecurity.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultScriptSecurity	TokenNameIdentifier	 Default Script Security
implements	TokenNameimplements	
ScriptSecurity	TokenNameIdentifier	 Script Security
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATA_PROTOCOL	TokenNameIdentifier	 DATA  PROTOCOL
=	TokenNameEQUAL	
"data"	TokenNameStringLiteral	data
;	TokenNameSEMICOLON	
/** * Message when trying to load a script file and the Document * does not have a URL */	TokenNameCOMMENT_JAVADOC	 Message when trying to load a script file and the Document does not have a URL 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_CANNOT_ACCESS_DOCUMENT_URL	TokenNameIdentifier	 ERROR  CANNOT  ACCESS  DOCUMENT  URL
=	TokenNameEQUAL	
"DefaultScriptSecurity.error.cannot.access.document.url"	TokenNameStringLiteral	DefaultScriptSecurity.error.cannot.access.document.url
;	TokenNameSEMICOLON	
/** * Message when trying to load a script file from a server * different than the one of the document. */	TokenNameCOMMENT_JAVADOC	 Message when trying to load a script file from a server different than the one of the document. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_SCRIPT_FROM_DIFFERENT_URL	TokenNameIdentifier	 ERROR  SCRIPT  FROM  DIFFERENT  URL
=	TokenNameEQUAL	
"DefaultScriptSecurity.error.script.from.different.url"	TokenNameStringLiteral	DefaultScriptSecurity.error.script.from.different.url
;	TokenNameSEMICOLON	
/** * The exception is built in the constructor and thrown if * not null and the checkLoadScript method is called. */	TokenNameCOMMENT_JAVADOC	 The exception is built in the constructor and thrown if not null and the checkLoadScript method is called. 
protected	TokenNameprotected	
SecurityException	TokenNameIdentifier	 Security Exception
se	TokenNameIdentifier	 se
;	TokenNameSEMICOLON	
/** * Controls whether the script should be loaded or not. * * @throws SecurityException if the script should not be loaded. */	TokenNameCOMMENT_JAVADOC	 Controls whether the script should be loaded or not. * @throws SecurityException if the script should not be loaded. 
public	TokenNamepublic	
void	TokenNamevoid	
checkLoadScript	TokenNameIdentifier	 check Load Script
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
/** * @param scriptType type of script, as found in the * type attribute of the &lt;script&gt; element. * @param scriptURL url for the script, as defined in * the script's xlink:href attribute. If that * attribute was empty, then this parameter should * be null * @param docURL url for the document into which the * script was found. */	TokenNameCOMMENT_JAVADOC	 @param scriptType type of script, as found in the type attribute of the &lt;script&gt; element. @param scriptURL url for the script, as defined in the script's xlink:href attribute. If that attribute was empty, then this parameter should be null @param docURL url for the document into which the script was found. 
public	TokenNamepublic	
DefaultScriptSecurity	TokenNameIdentifier	 Default Script Security
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
scriptType	TokenNameIdentifier	 script Type
,	TokenNameCOMMA	
ParsedURL	TokenNameIdentifier	 Parsed URL
scriptURL	TokenNameIdentifier	 script URL
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
scriptURL	TokenNameIdentifier	 script URL
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
scriptHost	TokenNameIdentifier	 script Host
=	TokenNameEQUAL	
scriptURL	TokenNameIdentifier	 script URL
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
scriptHost	TokenNameIdentifier	 script Host
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
scriptHost	TokenNameIdentifier	 script Host
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
docURL	TokenNameIdentifier	 doc URL
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scriptURL	TokenNameIdentifier	 script URL
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
scriptURL	TokenNameIdentifier	 script URL
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
DATA_PROTOCOL	TokenNameIdentifier	 DATA  PROTOCOL
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
scriptURL	TokenNameIdentifier	 script URL
.	TokenNameDOT	
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
ERROR_SCRIPT_FROM_DIFFERENT_URL	TokenNameIdentifier	 ERROR  SCRIPT  FROM  DIFFERENT  URL
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
scriptURL	TokenNameIdentifier	 script URL
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
