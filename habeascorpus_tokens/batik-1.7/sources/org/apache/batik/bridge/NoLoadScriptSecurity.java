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
/** * This implementation for the <tt>ScriptSecurity</tt> interface * does not allow scripts to be loaded. * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: NoLoadScriptSecurity.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This implementation for the <tt>ScriptSecurity</tt> interface does not allow scripts to be loaded. * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: NoLoadScriptSecurity.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
NoLoadScriptSecurity	TokenNameIdentifier	 No Load Script Security
implements	TokenNameimplements	
ScriptSecurity	TokenNameIdentifier	 Script Security
{	TokenNameLBRACE	
/** * Message when trying to load a script file and the Document * does not have a URL */	TokenNameCOMMENT_JAVADOC	 Message when trying to load a script file and the Document does not have a URL 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_SCRIPT_OF_TYPE_ALLOWED	TokenNameIdentifier	 ERROR  NO  SCRIPT  OF  TYPE  ALLOWED
=	TokenNameEQUAL	
"NoLoadScriptSecurity.error.no.script.of.type.allowed"	TokenNameStringLiteral	NoLoadScriptSecurity.error.no.script.of.type.allowed
;	TokenNameSEMICOLON	
/** * The exception is built in the constructor and thrown if * the checkLoadScript method is called. */	TokenNameCOMMENT_JAVADOC	 The exception is built in the constructor and thrown if the checkLoadScript method is called. 
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
throw	TokenNamethrow	
se	TokenNameIdentifier	 se
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new NoLoadScriptSecurity object. * @param scriptType type of script, as found in the * type attribute of the &lt;script&gt; element. */	TokenNameCOMMENT_JAVADOC	 Creates a new NoLoadScriptSecurity object. @param scriptType type of script, as found in the type attribute of the &lt;script&gt; element. 
public	TokenNamepublic	
NoLoadScriptSecurity	TokenNameIdentifier	 No Load Script Security
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
scriptType	TokenNameIdentifier	 script Type
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
ERROR_NO_SCRIPT_OF_TYPE_ALLOWED	TokenNameIdentifier	 ERROR  NO  SCRIPT  OF  TYPE  ALLOWED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
scriptType	TokenNameIdentifier	 script Type
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
