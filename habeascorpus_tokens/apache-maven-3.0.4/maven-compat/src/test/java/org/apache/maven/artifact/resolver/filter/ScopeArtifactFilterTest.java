package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
Artifact	TokenNameIdentifier	 Artifact
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Tests {@link ScopeArtifactFilter}. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Tests {@link ScopeArtifactFilter}. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
ScopeArtifactFilterTest	TokenNameIdentifier	 Scope Artifact Filter Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Artifact	TokenNameIdentifier	 Artifact
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
"g"	TokenNameStringLiteral	g
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
"jar"	TokenNameStringLiteral	jar
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInclude_Compile	TokenNameIdentifier	 test Include  Compile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScopeArtifactFilter	TokenNameIdentifier	 Scope Artifact Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ScopeArtifactFilter	TokenNameIdentifier	 Scope Artifact Filter
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_SYSTEM	TokenNameIdentifier	 SCOPE  SYSTEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_PROVIDED	TokenNameIdentifier	 SCOPE  PROVIDED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME	TokenNameIdentifier	 SCOPE  RUNTIME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_TEST	TokenNameIdentifier	 SCOPE  TEST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInclude_CompilePlusRuntime	TokenNameIdentifier	 test Include  Compile Plus Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScopeArtifactFilter	TokenNameIdentifier	 Scope Artifact Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ScopeArtifactFilter	TokenNameIdentifier	 Scope Artifact Filter
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE_PLUS_RUNTIME	TokenNameIdentifier	 SCOPE  COMPILE  PLUS  RUNTIME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_SYSTEM	TokenNameIdentifier	 SCOPE  SYSTEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_PROVIDED	TokenNameIdentifier	 SCOPE  PROVIDED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME	TokenNameIdentifier	 SCOPE  RUNTIME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_TEST	TokenNameIdentifier	 SCOPE  TEST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInclude_Runtime	TokenNameIdentifier	 test Include  Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScopeArtifactFilter	TokenNameIdentifier	 Scope Artifact Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ScopeArtifactFilter	TokenNameIdentifier	 Scope Artifact Filter
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME	TokenNameIdentifier	 SCOPE  RUNTIME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_SYSTEM	TokenNameIdentifier	 SCOPE  SYSTEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_PROVIDED	TokenNameIdentifier	 SCOPE  PROVIDED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME	TokenNameIdentifier	 SCOPE  RUNTIME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_TEST	TokenNameIdentifier	 SCOPE  TEST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInclude_RuntimePlusSystem	TokenNameIdentifier	 test Include  Runtime Plus System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScopeArtifactFilter	TokenNameIdentifier	 Scope Artifact Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ScopeArtifactFilter	TokenNameIdentifier	 Scope Artifact Filter
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME_PLUS_SYSTEM	TokenNameIdentifier	 SCOPE  RUNTIME  PLUS  SYSTEM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_SYSTEM	TokenNameIdentifier	 SCOPE  SYSTEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_PROVIDED	TokenNameIdentifier	 SCOPE  PROVIDED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME	TokenNameIdentifier	 SCOPE  RUNTIME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_TEST	TokenNameIdentifier	 SCOPE  TEST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInclude_Test	TokenNameIdentifier	 test Include  Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScopeArtifactFilter	TokenNameIdentifier	 Scope Artifact Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ScopeArtifactFilter	TokenNameIdentifier	 Scope Artifact Filter
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_TEST	TokenNameIdentifier	 SCOPE  TEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_SYSTEM	TokenNameIdentifier	 SCOPE  SYSTEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_PROVIDED	TokenNameIdentifier	 SCOPE  PROVIDED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_RUNTIME	TokenNameIdentifier	 SCOPE  RUNTIME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
include	TokenNameIdentifier	 include
(	TokenNameLPAREN	
newArtifact	TokenNameIdentifier	 new Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_TEST	TokenNameIdentifier	 SCOPE  TEST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
