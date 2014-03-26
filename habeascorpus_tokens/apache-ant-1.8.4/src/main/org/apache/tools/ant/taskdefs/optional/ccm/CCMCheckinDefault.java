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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
ccm	TokenNameIdentifier	 ccm
;	TokenNameSEMICOLON	
/** * Performs Continuus Checkin Default task command. * * @ant.task name="ccmcheckintask" category="scm" */	TokenNameCOMMENT_JAVADOC	 Performs Continuus Checkin Default task command. * @ant.task name="ccmcheckintask" category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
CCMCheckinDefault	TokenNameIdentifier	 CCM Checkin Default
extends	TokenNameextends	
CCMCheck	TokenNameIdentifier	 CCM Check
{	TokenNameLBRACE	
/** Constructor for CCMCheckinDefault. */	TokenNameCOMMENT_JAVADOC	 Constructor for CCMCheckinDefault. 
public	TokenNamepublic	
CCMCheckinDefault	TokenNameIdentifier	 CCM Checkin Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCcmAction	TokenNameIdentifier	 set Ccm Action
(	TokenNameLPAREN	
COMMAND_CHECKIN	TokenNameIdentifier	 COMMAND  CHECKIN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTask	TokenNameIdentifier	 set Task
(	TokenNameLPAREN	
DEFAULT_TASK	TokenNameIdentifier	 DEFAULT  TASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The default task */	TokenNameCOMMENT_JAVADOC	 The default task 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_TASK	TokenNameIdentifier	 DEFAULT  TASK
=	TokenNameEQUAL	
"default"	TokenNameStringLiteral	default
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
