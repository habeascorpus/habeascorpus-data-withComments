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
t12scm	TokenNameIdentifier	 t12scm
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
/** * Verifies SCM inheritance uses modules statement from parent. * * @author jdcasey */	TokenNameCOMMENT_JAVADOC	 Verifies SCM inheritance uses modules statement from parent. * @author jdcasey 
public	TokenNamepublic	
class	TokenNameclass	
ProjectInheritanceTest	TokenNameIdentifier	 Project Inheritance Test
extends	TokenNameextends	
AbstractProjectInheritanceTestCase	TokenNameIdentifier	 Abstract Project Inheritance Test Case
{	TokenNameLBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// p1 inherits from p0 	TokenNameCOMMENT_LINE	p1 inherits from p0 
// p0 inhertis from super model 	TokenNameCOMMENT_LINE	p0 inhertis from super model 
// 	TokenNameCOMMENT_LINE	 
// or we can show it graphically as: 	TokenNameCOMMENT_LINE	or we can show it graphically as: 
// 	TokenNameCOMMENT_LINE	 
// p1 ---> p0 --> super model 	TokenNameCOMMENT_LINE	p1 ---> p0 --> super model 
// 	TokenNameCOMMENT_LINE	 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
public	TokenNamepublic	
void	TokenNamevoid	
testScmInfoCalculatedCorrectlyOnParentAndChildRead	TokenNameIdentifier	 test Scm Info Calculated Correctly On Parent And Child Read
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
pom0Basedir	TokenNameIdentifier	 pom0 Basedir
=	TokenNameEQUAL	
pom0	TokenNameIdentifier	 pom0
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
pom1	TokenNameIdentifier	 pom1
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
pom0Basedir	TokenNameIdentifier	 pom0 Basedir
,	TokenNameCOMMA	
"modules/p1/pom.xml"	TokenNameStringLiteral	modules/p1/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// load the child project, which inherits from p0... 	TokenNameCOMMENT_LINE	load the child project, which inherits from p0... 
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parent SCM URL is: "	TokenNameStringLiteral	Parent SCM URL is: 
+	TokenNamePLUS	
project0	TokenNameIdentifier	 project0
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Child SCM URL is: "	TokenNameStringLiteral	Child SCM URL is: 
+	TokenNamePLUS	
project1	TokenNameIdentifier	 project1
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parent SCM connection is: "	TokenNameStringLiteral	Parent SCM connection is: 
+	TokenNamePLUS	
project0	TokenNameIdentifier	 project0
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Child SCM connection is: "	TokenNameStringLiteral	Child SCM connection is: 
+	TokenNamePLUS	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Parent SCM developer connection is: "	TokenNameStringLiteral	Parent SCM developer connection is: 
+	TokenNamePLUS	
project0	TokenNameIdentifier	 project0
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDeveloperConnection	TokenNameIdentifier	 get Developer Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Child SCM developer connection is: "	TokenNameStringLiteral	Child SCM developer connection is: 
+	TokenNamePLUS	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDeveloperConnection	TokenNameIdentifier	 get Developer Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project0	TokenNameIdentifier	 project0
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/modules/p1"	TokenNameStringLiteral	/modules/p1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project0	TokenNameIdentifier	 project0
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/modules/p1"	TokenNameStringLiteral	/modules/p1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDeveloperConnection	TokenNameIdentifier	 get Developer Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
project0	TokenNameIdentifier	 project0
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDeveloperConnection	TokenNameIdentifier	 get Developer Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/modules/p1"	TokenNameStringLiteral	/modules/p1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testScmInfoCalculatedCorrectlyOnChildOnlyRead	TokenNameIdentifier	 test Scm Info Calculated Correctly On Child Only Read
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
File	TokenNameIdentifier	 File
pom1	TokenNameIdentifier	 pom1
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localRepo	TokenNameIdentifier	 local Repo
,	TokenNameCOMMA	
"p0/modules/p1/pom.xml"	TokenNameStringLiteral	p0/modules/p1/pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// load the child project, which inherits from p0... 	TokenNameCOMMENT_LINE	load the child project, which inherits from p0... 
MavenProject	TokenNameIdentifier	 Maven Project
project1	TokenNameIdentifier	 project1
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
pom1	TokenNameIdentifier	 pom1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Child SCM URL is: "	TokenNameStringLiteral	Child SCM URL is: 
+	TokenNamePLUS	
project1	TokenNameIdentifier	 project1
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Child SCM connection is: "	TokenNameStringLiteral	Child SCM connection is: 
+	TokenNamePLUS	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Child SCM developer connection is: "	TokenNameStringLiteral	Child SCM developer connection is: 
+	TokenNamePLUS	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDeveloperConnection	TokenNameIdentifier	 get Developer Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"http://host/viewer?path=/p0/modules/p1"	TokenNameStringLiteral	http://host/viewer?path=/p0/modules/p1
,	TokenNameCOMMA	
project1	TokenNameIdentifier	 project1
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"scm:svn:http://host/p0/modules/p1"	TokenNameStringLiteral	scm:svn:http://host/p0/modules/p1
,	TokenNameCOMMA	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"scm:svn:https://host/p0/modules/p1"	TokenNameStringLiteral	scm:svn:https://host/p0/modules/p1
,	TokenNameCOMMA	
project1	TokenNameIdentifier	 project1
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDeveloperConnection	TokenNameIdentifier	 get Developer Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// public void testScmInfoCalculatedCorrectlyOnChildReadFromLocalRepository() 	TokenNameCOMMENT_LINE	public void testScmInfoCalculatedCorrectlyOnChildReadFromLocalRepository() 
// throws Exception 	TokenNameCOMMENT_LINE	throws Exception 
// { 	TokenNameCOMMENT_LINE	{ 
// File localRepo = getLocalRepositoryPath(); 	TokenNameCOMMENT_LINE	File localRepo = getLocalRepositoryPath(); 
// 	TokenNameCOMMENT_LINE	 
// ArtifactFactory factory = (ArtifactFactory) lookup( ArtifactFactory.class ); 	TokenNameCOMMENT_LINE	ArtifactFactory factory = (ArtifactFactory) lookup( ArtifactFactory.class ); 
// Artifact artifact = factory.createProjectArtifact( "maven", "p1", "1.0" ); 	TokenNameCOMMENT_LINE	Artifact artifact = factory.createProjectArtifact( "maven", "p1", "1.0" ); 
// 	TokenNameCOMMENT_LINE	 
// ArtifactRepositoryFactory repoFactory = (ArtifactRepositoryFactory) lookup( ArtifactRepositoryFactory.class ); 	TokenNameCOMMENT_LINE	ArtifactRepositoryFactory repoFactory = (ArtifactRepositoryFactory) lookup( ArtifactRepositoryFactory.class ); 
// ArtifactRepository localArtifactRepo = repoFactory.createLocalRepository( localRepo ); 	TokenNameCOMMENT_LINE	ArtifactRepository localArtifactRepo = repoFactory.createLocalRepository( localRepo ); 
// 	TokenNameCOMMENT_LINE	 
// MavenProject project1 = getProjectBuilder().buildFromRepository( artifact, Collections.EMPTY_LIST, localArtifactRepo ); 	TokenNameCOMMENT_LINE	MavenProject project1 = getProjectBuilder().buildFromRepository( artifact, Collections.EMPTY_LIST, localArtifactRepo ); 
// 	TokenNameCOMMENT_LINE	 
// System.out.println( "\n\n" ); 	TokenNameCOMMENT_LINE	System.out.println( "\n\n" ); 
// System.out.println( "Child SCM URL is: " + project1.getScm().getUrl() ); 	TokenNameCOMMENT_LINE	System.out.println( "Child SCM URL is: " + project1.getScm().getUrl() ); 
// System.out.println( "Child SCM connection is: " + project1.getScm().getConnection() ); 	TokenNameCOMMENT_LINE	System.out.println( "Child SCM connection is: " + project1.getScm().getConnection() ); 
// System.out.println( "Child SCM developer connection is: " 	TokenNameCOMMENT_LINE	System.out.println( "Child SCM developer connection is: " 
// + project1.getScm().getDeveloperConnection() ); 	TokenNameCOMMENT_LINE	+ project1.getScm().getDeveloperConnection() ); 
// 	TokenNameCOMMENT_LINE	 
// assertEquals( project1.getScm().getUrl(), "http://host/viewer?path=/p0/modules/p1" ); 	TokenNameCOMMENT_LINE	assertEquals( project1.getScm().getUrl(), "http://host/viewer?path=/p0/modules/p1" ); 
// assertEquals( project1.getScm().getConnection(), "scm:svn:http://host/p0/modules/p1" ); 	TokenNameCOMMENT_LINE	assertEquals( project1.getScm().getConnection(), "scm:svn:http://host/p0/modules/p1" ); 
// assertEquals( project1.getScm().getDeveloperConnection(), 	TokenNameCOMMENT_LINE	assertEquals( project1.getScm().getDeveloperConnection(), 
// "scm:svn:https://host/p0/modules/p1" ); 	TokenNameCOMMENT_LINE	"scm:svn:https://host/p0/modules/p1" ); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
