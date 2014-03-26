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
listener	TokenNameIdentifier	 listener
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
BuildEvent	TokenNameIdentifier	 Build Event
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
NoBannerLogger	TokenNameIdentifier	 No Banner Logger
;	TokenNameSEMICOLON	
/** * Displays subproject names like {@link BigProjectLogger} * but is otherwise as quiet as {@link NoBannerLogger}. * @since Ant1.8.1 */	TokenNameCOMMENT_JAVADOC	 Displays subproject names like {@link BigProjectLogger} but is otherwise as quiet as {@link NoBannerLogger}. @since Ant1.8.1 
public	TokenNamepublic	
class	TokenNameclass	
SimpleBigProjectLogger	TokenNameIdentifier	 Simple Big Project Logger
extends	TokenNameextends	
NoBannerLogger	TokenNameIdentifier	 No Banner Logger
{	TokenNameLBRACE	
/** * Override point, extract the target name * * @param event the event to work on * @return the target name -including the owning project name (if non-null) */	TokenNameCOMMENT_JAVADOC	 Override point, extract the target name * @param event the event to work on @return the target name -including the owning project name (if non-null) 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
extractTargetName	TokenNameIdentifier	 extract Target Name
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
targetName	TokenNameIdentifier	 target Name
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
extractTargetName	TokenNameIdentifier	 extract Target Name
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
projectName	TokenNameIdentifier	 project Name
=	TokenNameEQUAL	
extractProjectName	TokenNameIdentifier	 extract Project Name
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
projectName	TokenNameIdentifier	 project Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
targetName	TokenNameIdentifier	 target Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectName	TokenNameIdentifier	 project Name
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
targetName	TokenNameIdentifier	 target Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
targetName	TokenNameIdentifier	 target Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
