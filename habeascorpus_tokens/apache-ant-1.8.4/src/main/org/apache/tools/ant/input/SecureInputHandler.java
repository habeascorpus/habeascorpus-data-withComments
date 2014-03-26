/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ReflectUtil	TokenNameIdentifier	 Reflect Util
;	TokenNameSEMICOLON	
/** * Prompts and requests input. May loop until a valid input has * been entered. Doesn't echo input (requires Java6). If Java6 is not * available, falls back to the DefaultHandler (insecure). * @since Ant 1.7.1 */	TokenNameCOMMENT_JAVADOC	 Prompts and requests input. May loop until a valid input has been entered. Doesn't echo input (requires Java6). If Java6 is not available, falls back to the DefaultHandler (insecure). @since Ant 1.7.1 
public	TokenNamepublic	
class	TokenNameclass	
SecureInputHandler	TokenNameIdentifier	 Secure Input Handler
extends	TokenNameextends	
DefaultInputHandler	TokenNameIdentifier	 Default Input Handler
{	TokenNameLBRACE	
/** * Default no-args constructor */	TokenNameCOMMENT_JAVADOC	 Default no-args constructor 
public	TokenNamepublic	
SecureInputHandler	TokenNameIdentifier	 Secure Input Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Handle the input * @param request the request to handle * @throws BuildException if not possible to read from console */	TokenNameCOMMENT_JAVADOC	 Handle the input @param request the request to handle @throws BuildException if not possible to read from console 
public	TokenNamepublic	
void	TokenNamevoid	
handleInput	TokenNameIdentifier	 handle Input
(	TokenNameLPAREN	
InputRequest	TokenNameIdentifier	 Input Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prompt	TokenNameIdentifier	 prompt
=	TokenNameEQUAL	
getPrompt	TokenNameIdentifier	 get Prompt
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
system	TokenNameIdentifier	 system
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.lang.System"	TokenNameStringLiteral	java.lang.System
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
console	TokenNameIdentifier	 console
=	TokenNameEQUAL	
ReflectUtil	TokenNameIdentifier	 Reflect Util
.	TokenNameDOT	
invokeStatic	TokenNameIdentifier	 invoke Static
(	TokenNameLPAREN	
system	TokenNameIdentifier	 system
,	TokenNameCOMMA	
"console"	TokenNameStringLiteral	console
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
ReflectUtil	TokenNameIdentifier	 Reflect Util
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
console	TokenNameIdentifier	 console
,	TokenNameCOMMA	
"readPassword"	TokenNameStringLiteral	readPassword
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
prompt	TokenNameIdentifier	 prompt
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
setInput	TokenNameIdentifier	 set Input
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* for security zero char array after retrieving value */	TokenNameCOMMENT_BLOCK	 for security zero char array after retrieving value 
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
isInputValid	TokenNameIdentifier	 is Input Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Java6 not present use default handler */	TokenNameCOMMENT_BLOCK	 Java6 not present use default handler 
super	TokenNamesuper	
.	TokenNameDOT	
handleInput	TokenNameIdentifier	 handle Input
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
