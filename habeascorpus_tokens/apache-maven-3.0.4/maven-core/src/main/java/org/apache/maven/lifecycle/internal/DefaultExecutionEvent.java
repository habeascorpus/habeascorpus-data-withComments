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
ExecutionEvent	TokenNameIdentifier	 Execution Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
MavenSession	TokenNameIdentifier	 Maven Session
;	TokenNameSEMICOLON	
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
/** * Holds data relevant for an execution event. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Holds data relevant for an execution event. * @author Benjamin Bentmann 
class	TokenNameclass	
DefaultExecutionEvent	TokenNameIdentifier	 Default Execution Event
implements	TokenNameimplements	
ExecutionEvent	TokenNameIdentifier	 Execution Event
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultExecutionEvent	TokenNameIdentifier	 Default Execution Event
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mojoExecution	TokenNameIdentifier	 mojo Execution
=	TokenNameEQUAL	
mojoExecution	TokenNameIdentifier	 mojo Execution
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Type	TokenNameIdentifier	 Type
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenSession	TokenNameIdentifier	 Maven Session
getSession	TokenNameIdentifier	 get Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenProject	TokenNameIdentifier	 Maven Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getCurrentProject	TokenNameIdentifier	 get Current Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MojoExecution	TokenNameIdentifier	 Mojo Execution
getMojoExecution	TokenNameIdentifier	 get Mojo Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mojoExecution	TokenNameIdentifier	 mojo Execution
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Exception	TokenNameIdentifier	 Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
