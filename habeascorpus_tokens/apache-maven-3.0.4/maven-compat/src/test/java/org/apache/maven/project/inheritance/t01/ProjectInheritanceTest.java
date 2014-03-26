package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
inheritance	TokenNameIdentifier	 inheritance
.	TokenNameDOT	
t01	TokenNameIdentifier	 t01
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
inheritance	TokenNameIdentifier	 inheritance
.	TokenNameDOT	
AbstractProjectInheritanceTestCase	TokenNameIdentifier	 Abstract Project Inheritance Test Case
;	TokenNameSEMICOLON	
/** * A test which demonstrates maven's recursive inheritance where * we are testing to make sure that elements stated in a model are * not clobbered by the same elements elsewhere in the lineage. * * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 A test which demonstrates maven's recursive inheritance where we are testing to make sure that elements stated in a model are not clobbered by the same elements elsewhere in the lineage. * @author Jason van Zyl 
public	TokenNamepublic	
class	TokenNameclass	
ProjectInheritanceTest	TokenNameIdentifier	 Project Inheritance Test
extends	TokenNameextends	
AbstractProjectInheritanceTestCase	TokenNameIdentifier	 Abstract Project Inheritance Test Case
{	TokenNameLBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// p4 inherits from p3 	TokenNameCOMMENT_LINE	p4 inherits from p3 
// p3 inherits from p2 	TokenNameCOMMENT_LINE	p3 inherits from p2 
// p2 inherits from p1 	TokenNameCOMMENT_LINE	p2 inherits from p1 
// p1 inherits from p0 	TokenNameCOMMENT_LINE	p1 inherits from p0 
// p0 inhertis from super model 	TokenNameCOMMENT_LINE	p0 inhertis from super model 
// 	TokenNameCOMMENT_LINE	 
// or we can show it graphically as: 	TokenNameCOMMENT_LINE	or we can show it graphically as: 
// 	TokenNameCOMMENT_LINE	 
// p4 ---> p3 ---> p2 ---> p1 ---> p0 --> super model 	TokenNameCOMMENT_LINE	p4 ---> p3 ---> p2 ---> p1 ---> p0 --> super model 
// 	TokenNameCOMMENT_LINE	 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
public	TokenNamepublic	
void	TokenNamevoid	
testProjectInheritance	TokenNameIdentifier	 test Project Inheritance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Check p0 value for org name 	TokenNameCOMMENT_LINE	Check p0 value for org name 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
MavenProject	TokenNameIdentifier	 Maven Project
p0	TokenNameIdentifier	 p0
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
projectFile	TokenNameIdentifier	 project File
(	TokenNameLPAREN	
"maven.t01"	TokenNameStringLiteral	maven.t01
,	TokenNameCOMMA	
"p0"	TokenNameStringLiteral	p0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"p0-org"	TokenNameStringLiteral	p0-org
,	TokenNameCOMMA	
p0	TokenNameIdentifier	 p0
.	TokenNameDOT	
getOrganization	TokenNameIdentifier	 get Organization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Check p1 value for org name 	TokenNameCOMMENT_LINE	Check p1 value for org name 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
MavenProject	TokenNameIdentifier	 Maven Project
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
projectFile	TokenNameIdentifier	 project File
(	TokenNameLPAREN	
"maven.t01"	TokenNameStringLiteral	maven.t01
,	TokenNameCOMMA	
"p1"	TokenNameStringLiteral	p1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"p1-org"	TokenNameStringLiteral	p1-org
,	TokenNameCOMMA	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
getOrganization	TokenNameIdentifier	 get Organization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Check p2 value for org name 	TokenNameCOMMENT_LINE	Check p2 value for org name 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
MavenProject	TokenNameIdentifier	 Maven Project
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
projectFile	TokenNameIdentifier	 project File
(	TokenNameLPAREN	
"maven.t01"	TokenNameStringLiteral	maven.t01
,	TokenNameCOMMA	
"p2"	TokenNameStringLiteral	p2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"p2-org"	TokenNameStringLiteral	p2-org
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
getOrganization	TokenNameIdentifier	 get Organization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Check p2 value for org name 	TokenNameCOMMENT_LINE	Check p2 value for org name 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
MavenProject	TokenNameIdentifier	 Maven Project
p3	TokenNameIdentifier	 p3
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
projectFile	TokenNameIdentifier	 project File
(	TokenNameLPAREN	
"maven.t01"	TokenNameStringLiteral	maven.t01
,	TokenNameCOMMA	
"p3"	TokenNameStringLiteral	p3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"p3-org"	TokenNameStringLiteral	p3-org
,	TokenNameCOMMA	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
getOrganization	TokenNameIdentifier	 get Organization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Check p4 value for org name 	TokenNameCOMMENT_LINE	Check p4 value for org name 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
MavenProject	TokenNameIdentifier	 Maven Project
p4	TokenNameIdentifier	 p4
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
projectFile	TokenNameIdentifier	 project File
(	TokenNameLPAREN	
"maven.t01"	TokenNameStringLiteral	maven.t01
,	TokenNameCOMMA	
"p4"	TokenNameStringLiteral	p4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"p4-org"	TokenNameStringLiteral	p4-org
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
getOrganization	TokenNameIdentifier	 get Organization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
