/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
/** * Interface for a field activator. The field activator is responsible * for activating fields within a specific scope; the caller merely * requests the fields to be activated. * * @xerces.internal * * @author Andy Clark, IBM * * @version $Id: FieldActivator.java 520039 2007-03-19 18:34:38Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Interface for a field activator. The field activator is responsible for activating fields within a specific scope; the caller merely requests the fields to be activated. * @xerces.internal * @author Andy Clark, IBM * @version $Id: FieldActivator.java 520039 2007-03-19 18:34:38Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
FieldActivator	TokenNameIdentifier	 Field Activator
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// FieldActivator methods 	TokenNameCOMMENT_LINE	FieldActivator methods 
// 	TokenNameCOMMENT_LINE	 
/** * Start the value scope for the specified identity constraint. This * method is called when the selector matches in order to initialize * the value store. * * @param identityConstraint The identity constraint. * @param initialDepth the depth at which the selector began matching */	TokenNameCOMMENT_JAVADOC	 Start the value scope for the specified identity constraint. This method is called when the selector matches in order to initialize the value store. * @param identityConstraint The identity constraint. @param initialDepth the depth at which the selector began matching 
public	TokenNamepublic	
void	TokenNamevoid	
startValueScopeFor	TokenNameIdentifier	 start Value Scope For
(	TokenNameLPAREN	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
identityConstraint	TokenNameIdentifier	 identity Constraint
,	TokenNameCOMMA	
int	TokenNameint	
initialDepth	TokenNameIdentifier	 initial Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Request to activate the specified field. This method returns the * matcher for the field. * * @param field The field to activate. * @param initialDepth the 0-indexed depth in the instance document at which the Selector began to match. */	TokenNameCOMMENT_JAVADOC	 Request to activate the specified field. This method returns the matcher for the field. * @param field The field to activate. @param initialDepth the 0-indexed depth in the instance document at which the Selector began to match. 
public	TokenNamepublic	
XPathMatcher	TokenNameIdentifier	 X Path Matcher
activateField	TokenNameIdentifier	 activate Field
(	TokenNameLPAREN	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
int	TokenNameint	
initialDepth	TokenNameIdentifier	 initial Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Ends the value scope for the specified identity constraint. * * @param identityConstraint The identity constraint. * @param initialDepth the 0-indexed depth where the Selector began to match. */	TokenNameCOMMENT_JAVADOC	 Ends the value scope for the specified identity constraint. * @param identityConstraint The identity constraint. @param initialDepth the 0-indexed depth where the Selector began to match. 
public	TokenNamepublic	
void	TokenNamevoid	
endValueScopeFor	TokenNameIdentifier	 end Value Scope For
(	TokenNameLPAREN	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
identityConstraint	TokenNameIdentifier	 identity Constraint
,	TokenNameCOMMA	
int	TokenNameint	
initialDepth	TokenNameIdentifier	 initial Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface FieldActivator 	TokenNameCOMMENT_LINE	interface FieldActivator 
