package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Type safe reincarnation of Artifact scope. Also supplies the <code>DEFAULT_SCOPE<code> as well * as convenience method to deal with scope relationships. * * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> * */	TokenNameCOMMENT_JAVADOC	 Type safe reincarnation of Artifact scope. Also supplies the <code>DEFAULT_SCOPE<code> as well as convenience method to deal with scope relationships. * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> 
public	TokenNamepublic	
enum	TokenNameenum	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
{	TokenNameLBRACE	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
runtime	TokenNameIdentifier	 runtime
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
provided	TokenNameIdentifier	 provided
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
system	TokenNameIdentifier	 system
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
runtime_plus_system	TokenNameIdentifier	 runtime plus system
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
DEFAULT_SCOPE	TokenNameIdentifier	 DEFAULT  SCOPE
=	TokenNameEQUAL	
compile	TokenNameIdentifier	 compile
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
// Constructor 	TokenNameCOMMENT_LINE	Constructor 
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
(	TokenNameLPAREN	
int	TokenNameint	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper method to simplify null processing * * @return */	TokenNameCOMMENT_JAVADOC	 Helper method to simplify null processing * @return 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
checkScope	TokenNameIdentifier	 check Scope
(	TokenNameLPAREN	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scope	TokenNameIdentifier	 scope
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
DEFAULT_SCOPE	TokenNameIdentifier	 DEFAULT  SCOPE
:	TokenNameCOLON	
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @return unsafe String representation of this scope. */	TokenNameCOMMENT_JAVADOC	 * @return unsafe String representation of this scope. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_TEST	TokenNameIdentifier	 SCOPE  TEST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME	TokenNameIdentifier	 SCOPE  RUNTIME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_PROVIDED	TokenNameIdentifier	 SCOPE  PROVIDED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_SYSTEM	TokenNameIdentifier	 SCOPE  SYSTEM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME_PLUS_SYSTEM	TokenNameIdentifier	 SCOPE  RUNTIME  PLUS  SYSTEM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_compliancySets	TokenNameIdentifier	 compliancy Sets
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
compile	TokenNameIdentifier	 compile
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
compile	TokenNameIdentifier	 compile
,	TokenNameCOMMA	
provided	TokenNameIdentifier	 provided
,	TokenNameCOMMA	
system	TokenNameIdentifier	 system
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
test	TokenNameIdentifier	 test
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
compile	TokenNameIdentifier	 compile
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
provided	TokenNameIdentifier	 provided
,	TokenNameCOMMA	
system	TokenNameIdentifier	 system
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
runtime	TokenNameIdentifier	 runtime
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
compile	TokenNameIdentifier	 compile
,	TokenNameCOMMA	
runtime	TokenNameIdentifier	 runtime
,	TokenNameCOMMA	
system	TokenNameIdentifier	 system
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
provided	TokenNameIdentifier	 provided
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
compile	TokenNameIdentifier	 compile
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
provided	TokenNameIdentifier	 provided
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * scope relationship function. Used by the graph conflict resolution policies * * @param scope * @return true is supplied scope is an inclusive sub-scope of current one. */	TokenNameCOMMENT_JAVADOC	 scope relationship function. Used by the graph conflict resolution policies * @param scope @return true is supplied scope is an inclusive sub-scope of current one. 
public	TokenNamepublic	
boolean	TokenNameboolean	
encloses	TokenNameIdentifier	 encloses
(	TokenNameLPAREN	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
checkScope	TokenNameIdentifier	 check Scope
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// system scope is historic only - and simple 	TokenNameCOMMENT_LINE	system scope is historic only - and simple 
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
system	TokenNameIdentifier	 system
.	TokenNameDOT	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scope	TokenNameIdentifier	 scope
.	TokenNameDOT	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
system	TokenNameIdentifier	 system
.	TokenNameDOT	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
set	TokenNameIdentifier	 set
:	TokenNameCOLON	
_compliancySets	TokenNameIdentifier	 compliancy Sets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
set	TokenNameIdentifier	 set
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
ase	TokenNameIdentifier	 ase
:	TokenNameCOLON	
set	TokenNameIdentifier	 set
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
id	TokenNameIdentifier	 id
==	TokenNameEQUAL_EQUAL	
ase	TokenNameIdentifier	 ase
.	TokenNameDOT	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
