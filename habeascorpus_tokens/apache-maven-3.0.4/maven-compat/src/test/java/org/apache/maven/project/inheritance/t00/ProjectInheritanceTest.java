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
t00	TokenNameIdentifier	 t00
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
MailingList	TokenNameIdentifier	 Mailing List
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
/** * A test which demonstrates maven's recursive inheritance where * a distinct value is taken from each parent contributing to the * the final model of the project being assembled. There is no * overriding going on amongst the models being used in this test: * each model in the lineage is providing a value that is not present * anywhere else in the lineage. We are just making sure that values * down in the lineage are bubbling up where they should. * * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 A test which demonstrates maven's recursive inheritance where a distinct value is taken from each parent contributing to the the final model of the project being assembled. There is no overriding going on amongst the models being used in this test: each model in the lineage is providing a value that is not present anywhere else in the lineage. We are just making sure that values down in the lineage are bubbling up where they should. * @author Jason van Zyl 
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
MavenProject	TokenNameIdentifier	 Maven Project
p4	TokenNameIdentifier	 p4
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
projectFile	TokenNameIdentifier	 project File
(	TokenNameLPAREN	
"p4"	TokenNameStringLiteral	p4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"p4"	TokenNameStringLiteral	p4
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Value inherited from p3 	TokenNameCOMMENT_LINE	Value inherited from p3 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2000"	TokenNameStringLiteral	2000
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
getInceptionYear	TokenNameIdentifier	 get Inception Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Value taken from p2 	TokenNameCOMMENT_LINE	Value taken from p2 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"mailing-list"	TokenNameStringLiteral	mailing-list
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MailingList	TokenNameIdentifier	 Mailing List
)	TokenNameRPAREN	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
getMailingLists	TokenNameIdentifier	 get Mailing Lists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Value taken from p1 	TokenNameCOMMENT_LINE	Value taken from p1 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"scm-url/p2/p3/p4"	TokenNameStringLiteral	scm-url/p2/p3/p4
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Value taken from p4 	TokenNameCOMMENT_LINE	Value taken from p4 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Codehaus"	TokenNameStringLiteral	Codehaus
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
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Value taken from super model 	TokenNameCOMMENT_LINE	Value taken from super model 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"4.0.0"	TokenNameStringLiteral	4.0.0
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
getModelVersion	TokenNameIdentifier	 get Model Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"4.0.0"	TokenNameStringLiteral	4.0.0
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
getModelVersion	TokenNameIdentifier	 get Model Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
