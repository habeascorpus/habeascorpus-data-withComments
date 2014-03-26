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
/** * This implementation of the <tt>ScriptSecurity</tt> interface only * allows scripts embeded in the document, i.e., scripts whith either * the same URL as the document (as for event attributes) or scripts * embeded with the data protocol. * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: EmbededScriptSecurity.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This implementation of the <tt>ScriptSecurity</tt> interface only allows scripts embeded in the document, i.e., scripts whith either the same URL as the document (as for event attributes) or scripts embeded with the data protocol. * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: EmbededScriptSecurity.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
EmbededScriptSecurity	TokenNameIdentifier	 Embeded Script Security
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
/** * Message when trying to load a script that is not embeded * in the document. */	TokenNameCOMMENT_JAVADOC	 Message when trying to load a script that is not embeded in the document. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_SCRIPT_NOT_EMBEDED	TokenNameIdentifier	 ERROR  SCRIPT  NOT  EMBEDED
=	TokenNameEQUAL	
"EmbededScriptSecurity.error.script.not.embeded"	TokenNameStringLiteral	EmbededScriptSecurity.error.script.not.embeded
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
EmbededScriptSecurity	TokenNameIdentifier	 Embeded Script Security
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
ERROR_SCRIPT_NOT_EMBEDED	TokenNameIdentifier	 ERROR  SCRIPT  NOT  EMBEDED
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
