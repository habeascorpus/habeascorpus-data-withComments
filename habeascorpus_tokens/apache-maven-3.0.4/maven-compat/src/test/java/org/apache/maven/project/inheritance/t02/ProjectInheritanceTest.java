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
t02	TokenNameIdentifier	 t02
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Build	TokenNameIdentifier	 Build
;	TokenNameSEMICOLON	
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
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Plugin	TokenNameIdentifier	 Plugin
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
File	TokenNameIdentifier	 File
localRepo	TokenNameIdentifier	 local Repo
=	TokenNameEQUAL	
getLocalRepositoryPath	TokenNameIdentifier	 get Local Repository Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Local repository is at: "	TokenNameStringLiteral	Local repository is at: 
+	TokenNamePLUS	
localRepo	TokenNameIdentifier	 local Repo
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom0	TokenNameIdentifier	 pom0
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localRepo	TokenNameIdentifier	 local Repo
,	TokenNameCOMMA	
"p0/pom.xml"	TokenNameStringLiteral	p0/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom1	TokenNameIdentifier	 pom1
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
pom0	TokenNameIdentifier	 pom0
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"p1/pom.xml"	TokenNameStringLiteral	p1/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom2	TokenNameIdentifier	 pom2
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
pom1	TokenNameIdentifier	 pom1
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"p2/pom.xml"	TokenNameStringLiteral	p2/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom3	TokenNameIdentifier	 pom3
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
pom2	TokenNameIdentifier	 pom2
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"p3/pom.xml"	TokenNameStringLiteral	p3/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom4	TokenNameIdentifier	 pom4
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
pom3	TokenNameIdentifier	 pom3
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"p4/pom.xml"	TokenNameStringLiteral	p4/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom5	TokenNameIdentifier	 pom5
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
pom4	TokenNameIdentifier	 pom4
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"p5/pom.xml"	TokenNameStringLiteral	p5/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Location of project-4's POM: "	TokenNameStringLiteral	Location of project-4's POM: 
+	TokenNamePLUS	
pom4	TokenNameIdentifier	 pom4
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// load everything... 	TokenNameCOMMENT_LINE	load everything... 
MavenProject	TokenNameIdentifier	 Maven Project
project0	TokenNameIdentifier	 project0
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
pom0	TokenNameIdentifier	 pom0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project1	TokenNameIdentifier	 project1
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
pom1	TokenNameIdentifier	 pom1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project2	TokenNameIdentifier	 project2
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
pom2	TokenNameIdentifier	 pom2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project3	TokenNameIdentifier	 project3
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
pom3	TokenNameIdentifier	 pom3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project4	TokenNameIdentifier	 project4
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
pom4	TokenNameIdentifier	 pom4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project5	TokenNameIdentifier	 project5
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
pom5	TokenNameIdentifier	 pom5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"p4"	TokenNameStringLiteral	p4
,	TokenNameCOMMA	
project4	TokenNameIdentifier	 project4
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
project4	TokenNameIdentifier	 project4
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
project4	TokenNameIdentifier	 project4
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
project4	TokenNameIdentifier	 project4
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
project4	TokenNameIdentifier	 project4
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
project4	TokenNameIdentifier	 project4
.	TokenNameDOT	
getModelVersion	TokenNameIdentifier	 get Model Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Build	TokenNameIdentifier	 Build
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
project4	TokenNameIdentifier	 project4
.	TokenNameDOT	
getBuild	TokenNameIdentifier	 get Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
plugins	TokenNameIdentifier	 plugins
=	TokenNameEQUAL	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getPlugins	TokenNameIdentifier	 get Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
validPluginCounts	TokenNameIdentifier	 valid Plugin Counts
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
testPluginArtifactId	TokenNameIdentifier	 test Plugin Artifact Id
=	TokenNameEQUAL	
"maven-compiler-plugin"	TokenNameStringLiteral	maven-compiler-plugin
;	TokenNameSEMICOLON	
// this is the plugin we're looking for. 	TokenNameCOMMENT_LINE	this is the plugin we're looking for. 
validPluginCounts	TokenNameIdentifier	 valid Plugin Counts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
testPluginArtifactId	TokenNameIdentifier	 test Plugin Artifact Id
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// these are injected if -DperformRelease=true 	TokenNameCOMMENT_LINE	these are injected if -DperformRelease=true 
validPluginCounts	TokenNameIdentifier	 valid Plugin Counts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"maven-deploy-plugin"	TokenNameStringLiteral	maven-deploy-plugin
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validPluginCounts	TokenNameIdentifier	 valid Plugin Counts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"maven-javadoc-plugin"	TokenNameStringLiteral	maven-javadoc-plugin
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validPluginCounts	TokenNameIdentifier	 valid Plugin Counts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"maven-source-plugin"	TokenNameStringLiteral	maven-source-plugin
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Plugin	TokenNameIdentifier	 Plugin
testPlugin	TokenNameIdentifier	 test Plugin
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
plugins	TokenNameIdentifier	 plugins
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
validPluginCounts	TokenNameIdentifier	 valid Plugin Counts
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Illegal plugin found: "	TokenNameStringLiteral	Illegal plugin found: 
+	TokenNamePLUS	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
testPluginArtifactId	TokenNameIdentifier	 test Plugin Artifact Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testPlugin	TokenNameIdentifier	 test Plugin
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Integer	TokenNameIdentifier	 Integer
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
validPluginCounts	TokenNameIdentifier	 valid Plugin Counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Multiple copies of plugin: "	TokenNameStringLiteral	Multiple copies of plugin: 
+	TokenNamePLUS	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
+	TokenNamePLUS	
" found in POM."	TokenNameStringLiteral	 found in POM.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validPluginCounts	TokenNameIdentifier	 valid Plugin Counts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
executions	TokenNameIdentifier	 executions
=	TokenNameEQUAL	
testPlugin	TokenNameIdentifier	 test Plugin
.	TokenNameDOT	
getExecutions	TokenNameIdentifier	 get Executions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
executions	TokenNameIdentifier	 executions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
