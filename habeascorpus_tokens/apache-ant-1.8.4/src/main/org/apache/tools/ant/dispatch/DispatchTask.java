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
dispatch	TokenNameIdentifier	 dispatch
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
Task	TokenNameIdentifier	 Task
;	TokenNameSEMICOLON	
/** * Tasks extending this class may contain multiple actions. * The method that is invoked for execution depends upon the * value of the action attribute of the task. * <br/> * Example:<br/> * &lt;mytask action=&quot;list&quot;/&gt; will invoke the method * with the signature public void list() in mytask's class. * If the action attribute is not defined in the task or is empty, * the execute() method will be called. */	TokenNameCOMMENT_JAVADOC	 Tasks extending this class may contain multiple actions. The method that is invoked for execution depends upon the value of the action attribute of the task. <br/> Example:<br/> &lt;mytask action=&quot;list&quot;/&gt; will invoke the method with the signature public void list() in mytask's class. If the action attribute is not defined in the task or is empty, the execute() method will be called. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DispatchTask	TokenNameIdentifier	 Dispatch Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
implements	TokenNameimplements	
Dispatchable	TokenNameIdentifier	 Dispatchable
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
action	TokenNameIdentifier	 action
;	TokenNameSEMICOLON	
/** * Get the action parameter name. * @return the <code>String</code> "action" by default (can be overridden). */	TokenNameCOMMENT_JAVADOC	 Get the action parameter name. @return the <code>String</code> "action" by default (can be overridden). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getActionParameterName	TokenNameIdentifier	 get Action Parameter Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"action"	TokenNameStringLiteral	action
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the action. * @param action the method name. */	TokenNameCOMMENT_JAVADOC	 Set the action. @param action the method name. 
public	TokenNamepublic	
void	TokenNamevoid	
setAction	TokenNameIdentifier	 set Action
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
action	TokenNameIdentifier	 action
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
action	TokenNameIdentifier	 action
=	TokenNameEQUAL	
action	TokenNameIdentifier	 action
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the action. * @return the action. */	TokenNameCOMMENT_JAVADOC	 Get the action. @return the action. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
action	TokenNameIdentifier	 action
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
