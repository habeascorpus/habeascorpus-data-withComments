package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
MojoExecution	TokenNameIdentifier	 Mojo Execution
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
MavenProject	TokenNameIdentifier	 Maven Project
;	TokenNameSEMICOLON	
/** * @since 3.0 * @author Benjamin Bentmann * @author Kristian Rosenvold * <p/> * NOTE: This class is not part of any public api and can be changed or deleted without prior notice. */	TokenNameCOMMENT_JAVADOC	 @since 3.0 @author Benjamin Bentmann @author Kristian Rosenvold <p/> NOTE: This class is not part of any public api and can be changed or deleted without prior notice. 
public	TokenNamepublic	
class	TokenNameclass	
PhaseRecorder	TokenNameIdentifier	 Phase Recorder
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
lastLifecyclePhase	TokenNameIdentifier	 last Lifecycle Phase
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PhaseRecorder	TokenNameIdentifier	 Phase Recorder
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
observeExecution	TokenNameIdentifier	 observe Execution
(	TokenNameLPAREN	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
=	TokenNameEQUAL	
mojoExecution	TokenNameIdentifier	 mojo Execution
.	TokenNameDOT	
getLifecyclePhase	TokenNameIdentifier	 get Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastLifecyclePhase	TokenNameIdentifier	 last Lifecycle Phase
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastLifecyclePhase	TokenNameIdentifier	 last Lifecycle Phase
=	TokenNameEQUAL	
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
lastLifecyclePhase	TokenNameIdentifier	 last Lifecycle Phase
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addLifecyclePhase	TokenNameIdentifier	 add Lifecycle Phase
(	TokenNameLPAREN	
lastLifecyclePhase	TokenNameIdentifier	 last Lifecycle Phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastLifecyclePhase	TokenNameIdentifier	 last Lifecycle Phase
=	TokenNameEQUAL	
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastLifecyclePhase	TokenNameIdentifier	 last Lifecycle Phase
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addLifecyclePhase	TokenNameIdentifier	 add Lifecycle Phase
(	TokenNameLPAREN	
lastLifecyclePhase	TokenNameIdentifier	 last Lifecycle Phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDifferentPhase	TokenNameIdentifier	 is Different Phase
(	TokenNameLPAREN	
MojoExecution	TokenNameIdentifier	 Mojo Execution
nextMojoExecution	TokenNameIdentifier	 next Mojo Execution
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
=	TokenNameEQUAL	
nextMojoExecution	TokenNameIdentifier	 next Mojo Execution
.	TokenNameDOT	
getLifecyclePhase	TokenNameIdentifier	 get Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastLifecyclePhase	TokenNameIdentifier	 last Lifecycle Phase
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
lastLifecyclePhase	TokenNameIdentifier	 last Lifecycle Phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
