package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
DefaultMavenExecutionTest	TokenNameIdentifier	 Default Maven Execution Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCopyDefault	TokenNameIdentifier	 test Copy Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MavenExecutionRequest	TokenNameIdentifier	 Maven Execution Request
original	TokenNameIdentifier	 original
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultMavenExecutionRequest	TokenNameIdentifier	 Default Maven Execution Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenExecutionRequest	TokenNameIdentifier	 Maven Execution Request
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
DefaultMavenExecutionRequest	TokenNameIdentifier	 Default Maven Execution Request
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
copy	TokenNameIdentifier	 copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
copy	TokenNameIdentifier	 copy
,	TokenNameCOMMA	
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResultWithNullTopologicallySortedProjectsIsEmptyList	TokenNameIdentifier	 test Result With Null Topologically Sorted Projects Is Empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultMavenExecutionResult	TokenNameIdentifier	 Default Maven Execution Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setTopologicallySortedProjects	TokenNameIdentifier	 set Topologically Sorted Projects
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MavenProject	TokenNameIdentifier	 Maven Project
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getTopologicallySortedProjects	TokenNameIdentifier	 get Topologically Sorted Projects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
