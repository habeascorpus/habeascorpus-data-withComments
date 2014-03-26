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
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
;	TokenNameSEMICOLON	
/** * Context that is fixed for the entire reactor build. * * @since 3.0 * @author Jason van Zyl * @author Kristian Rosenvold * NOTE: This class is not part of any public api and can be changed or deleted without prior notice. */	TokenNameCOMMENT_JAVADOC	 Context that is fixed for the entire reactor build. * @since 3.0 @author Jason van Zyl @author Kristian Rosenvold NOTE: This class is not part of any public api and can be changed or deleted without prior notice. 
public	TokenNamepublic	
class	TokenNameclass	
ReactorContext	TokenNameIdentifier	 Reactor Context
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ProjectIndex	TokenNameIdentifier	 Project Index
projectIndex	TokenNameIdentifier	 project Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ClassLoader	TokenNameIdentifier	 Class Loader
originalContextClassLoader	TokenNameIdentifier	 original Context Class Loader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ReactorBuildStatus	TokenNameIdentifier	 Reactor Build Status
reactorBuildStatus	TokenNameIdentifier	 reactor Build Status
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ReactorContext	TokenNameIdentifier	 Reactor Context
(	TokenNameLPAREN	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
ProjectIndex	TokenNameIdentifier	 Project Index
projectIndex	TokenNameIdentifier	 project Index
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
originalContextClassLoader	TokenNameIdentifier	 original Context Class Loader
,	TokenNameCOMMA	
ReactorBuildStatus	TokenNameIdentifier	 Reactor Build Status
reactorBuildStatus	TokenNameIdentifier	 reactor Build Status
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
projectIndex	TokenNameIdentifier	 project Index
=	TokenNameEQUAL	
projectIndex	TokenNameIdentifier	 project Index
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
originalContextClassLoader	TokenNameIdentifier	 original Context Class Loader
=	TokenNameEQUAL	
originalContextClassLoader	TokenNameIdentifier	 original Context Class Loader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reactorBuildStatus	TokenNameIdentifier	 reactor Build Status
=	TokenNameEQUAL	
reactorBuildStatus	TokenNameIdentifier	 reactor Build Status
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ReactorBuildStatus	TokenNameIdentifier	 Reactor Build Status
getReactorBuildStatus	TokenNameIdentifier	 get Reactor Build Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reactorBuildStatus	TokenNameIdentifier	 reactor Build Status
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
getResult	TokenNameIdentifier	 get Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ProjectIndex	TokenNameIdentifier	 Project Index
getProjectIndex	TokenNameIdentifier	 get Project Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectIndex	TokenNameIdentifier	 project Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ClassLoader	TokenNameIdentifier	 Class Loader
getOriginalContextClassLoader	TokenNameIdentifier	 get Original Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
originalContextClassLoader	TokenNameIdentifier	 original Context Class Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
