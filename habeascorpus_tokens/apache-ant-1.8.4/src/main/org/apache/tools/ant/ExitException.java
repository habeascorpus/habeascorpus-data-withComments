/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
/** * Used to report exit status of classes which call System.exit(). * * @see org.apache.tools.ant.util.optional.NoExitSecurityManager * @see org.apache.tools.ant.types.Permissions * */	TokenNameCOMMENT_JAVADOC	 Used to report exit status of classes which call System.exit(). * @see org.apache.tools.ant.util.optional.NoExitSecurityManager @see org.apache.tools.ant.types.Permissions 
public	TokenNamepublic	
class	TokenNameclass	
ExitException	TokenNameIdentifier	 Exit Exception
extends	TokenNameextends	
SecurityException	TokenNameIdentifier	 Security Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
2772487854280543363L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Status code */	TokenNameCOMMENT_JAVADOC	 Status code 
private	TokenNameprivate	
int	TokenNameint	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
/** * Constructs an exit exception. * @param status the status code returned via System.exit() */	TokenNameCOMMENT_JAVADOC	 Constructs an exit exception. @param status the status code returned via System.exit() 
public	TokenNamepublic	
ExitException	TokenNameIdentifier	 Exit Exception
(	TokenNameLPAREN	
int	TokenNameint	
status	TokenNameIdentifier	 status
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"ExitException: status "	TokenNameStringLiteral	ExitException: status 
+	TokenNamePLUS	
status	TokenNameIdentifier	 status
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an exit exception. * @param msg the message to be displayed. * @param status the status code returned via System.exit() */	TokenNameCOMMENT_JAVADOC	 Constructs an exit exception. @param msg the message to be displayed. @param status the status code returned via System.exit() 
public	TokenNamepublic	
ExitException	TokenNameIdentifier	 Exit Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
int	TokenNameint	
status	TokenNameIdentifier	 status
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The status code returned by System.exit() * * @return the status code returned by System.exit() */	TokenNameCOMMENT_JAVADOC	 The status code returned by System.exit() * @return the status code returned by System.exit() 
public	TokenNamepublic	
int	TokenNameint	
getStatus	TokenNameIdentifier	 get Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
