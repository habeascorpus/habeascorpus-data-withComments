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
/** * This implementation for the <tt>ScriptSecurity</tt> interface. * allows the script to be loaded and does not impose constraints * on the urls. * Note that this only means there is no check on the script's * origin, not that it will run without security checks. * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: RelaxedScriptSecurity.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This implementation for the <tt>ScriptSecurity</tt> interface. allows the script to be loaded and does not impose constraints on the urls. Note that this only means there is no check on the script's origin, not that it will run without security checks. * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: RelaxedScriptSecurity.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
RelaxedScriptSecurity	TokenNameIdentifier	 Relaxed Script Security
implements	TokenNameimplements	
ScriptSecurity	TokenNameIdentifier	 Script Security
{	TokenNameLBRACE	
/** * Controls whether the script should be loaded or not. * * @throws SecurityException if the script should not be loaded. */	TokenNameCOMMENT_JAVADOC	 Controls whether the script should be loaded or not. * @throws SecurityException if the script should not be loaded. 
public	TokenNamepublic	
void	TokenNamevoid	
checkLoadScript	TokenNameIdentifier	 check Load Script
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* do nothing */	TokenNameCOMMENT_BLOCK	 do nothing 
}	TokenNameRBRACE	
/** * @param scriptType type of script, as found in the * type attribute of the &lt;script&gt; element. * @param scriptURL url for the script, as defined in * the script's xlink:href attribute. If that * attribute was empty, then this parameter should * be null * @param docURL url for the document into which the * script was found. */	TokenNameCOMMENT_JAVADOC	 @param scriptType type of script, as found in the type attribute of the &lt;script&gt; element. @param scriptURL url for the script, as defined in the script's xlink:href attribute. If that attribute was empty, then this parameter should be null @param docURL url for the document into which the script was found. 
public	TokenNamepublic	
RelaxedScriptSecurity	TokenNameIdentifier	 Relaxed Script Security
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
/* do nothing */	TokenNameCOMMENT_BLOCK	 do nothing 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
