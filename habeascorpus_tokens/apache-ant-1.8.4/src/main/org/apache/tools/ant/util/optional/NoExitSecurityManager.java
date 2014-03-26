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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
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
ExitException	TokenNameIdentifier	 Exit Exception
;	TokenNameSEMICOLON	
/** * This is intended as a replacement for the default system manager. * The goal is to intercept System.exit calls and make it throw an * exception instead so that a System.exit in a task does not * fully terminate Ant. * * @see ExitException */	TokenNameCOMMENT_JAVADOC	 This is intended as a replacement for the default system manager. The goal is to intercept System.exit calls and make it throw an exception instead so that a System.exit in a task does not fully terminate Ant. * @see ExitException 
public	TokenNamepublic	
class	TokenNameclass	
NoExitSecurityManager	TokenNameIdentifier	 No Exit Security Manager
extends	TokenNameextends	
SecurityManager	TokenNameIdentifier	 Security Manager
{	TokenNameLBRACE	
/** * Override SecurityManager#checkExit. * This throws an ExitException(status) exception. * @param status the exit status */	TokenNameCOMMENT_JAVADOC	 Override SecurityManager#checkExit. This throws an ExitException(status) exception. @param status the exit status 
public	TokenNamepublic	
void	TokenNamevoid	
checkExit	TokenNameIdentifier	 check Exit
(	TokenNameLPAREN	
int	TokenNameint	
status	TokenNameIdentifier	 status
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ExitException	TokenNameIdentifier	 Exit Exception
(	TokenNameLPAREN	
status	TokenNameIdentifier	 status
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override SecurityManager#checkPermission. * This does nothing. * @param perm the requested permission. */	TokenNameCOMMENT_JAVADOC	 Override SecurityManager#checkPermission. This does nothing. @param perm the requested permission. 
public	TokenNamepublic	
void	TokenNamevoid	
checkPermission	TokenNameIdentifier	 check Permission
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no permission here 	TokenNameCOMMENT_LINE	no permission here 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
