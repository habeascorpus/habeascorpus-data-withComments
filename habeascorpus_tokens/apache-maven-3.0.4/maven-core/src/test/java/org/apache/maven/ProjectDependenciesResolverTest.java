package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
;	TokenNameSEMICOLON	
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
Collections	TokenNameIdentifier	 Collections
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
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
Artifact	TokenNameIdentifier	 Artifact
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
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Exclusion	TokenNameIdentifier	 Exclusion
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
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Requirement	TokenNameIdentifier	 Requirement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ProjectDependenciesResolverTest	TokenNameIdentifier	 Project Dependencies Resolver Test
extends	TokenNameextends	
AbstractCoreMavenComponentTestCase	TokenNameIdentifier	 Abstract Core Maven Component Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
ProjectDependenciesResolver	TokenNameIdentifier	 Project Dependencies Resolver
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resolver	TokenNameIdentifier	 resolver
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ProjectDependenciesResolver	TokenNameIdentifier	 Project Dependencies Resolver
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
resolver	TokenNameIdentifier	 resolver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getProjectsDirectory	TokenNameIdentifier	 get Projects Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"src/test/projects/project-dependencies-resolver"	TokenNameStringLiteral	src/test/projects/project-dependencies-resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public void testExclusionsInDependencies() throws Exception { MavenSession session = createMavenSession( null ); MavenProject project = session.getCurrentProject(); Exclusion exclusion = new Exclusion(); exclusion.setGroupId( "org.apache.maven.its" ); exclusion.setArtifactId( "a" ); new ProjectBuilder( project ).addDependency( "org.apache.maven.its", "b", "0.1", Artifact.SCOPE_RUNTIME, exclusion ); Set<Artifact> artifactDependencies = resolver.resolve( project, Collections.singleton( Artifact.SCOPE_COMPILE ), session ); assertEquals( 0, artifactDependencies.size() ); artifactDependencies = resolver.resolve( project, Collections.singleton( Artifact.SCOPE_RUNTIME ), session ); assertEquals( 1, artifactDependencies.size() ); assertEquals( "b", artifactDependencies.iterator().next().getArtifactId() ); } */	TokenNameCOMMENT_BLOCK	 public void testExclusionsInDependencies() throws Exception { MavenSession session = createMavenSession( null ); MavenProject project = session.getCurrentProject(); Exclusion exclusion = new Exclusion(); exclusion.setGroupId( "org.apache.maven.its" ); exclusion.setArtifactId( "a" ); new ProjectBuilder( project ).addDependency( "org.apache.maven.its", "b", "0.1", Artifact.SCOPE_RUNTIME, exclusion ); Set<Artifact> artifactDependencies = resolver.resolve( project, Collections.singleton( Artifact.SCOPE_COMPILE ), session ); assertEquals( 0, artifactDependencies.size() ); artifactDependencies = resolver.resolve( project, Collections.singleton( Artifact.SCOPE_RUNTIME ), session ); assertEquals( 1, artifactDependencies.size() ); assertEquals( "b", artifactDependencies.iterator().next().getArtifactId() ); } 
public	TokenNamepublic	
void	TokenNamevoid	
testSystemScopeDependencies	TokenNameIdentifier	 test System Scope Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
createMavenSession	TokenNameIdentifier	 create Maven Session
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getCurrentProject	TokenNameIdentifier	 get Current Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ProjectBuilder	TokenNameIdentifier	 Project Builder
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
.	TokenNameDOT	
addDependency	TokenNameIdentifier	 add Dependency
(	TokenNameLPAREN	
"com.mycompany"	TokenNameStringLiteral	com.mycompany
,	TokenNameCOMMA	
"system-dependency"	TokenNameStringLiteral	system-dependency
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_SYSTEM	TokenNameIdentifier	 SCOPE  SYSTEM
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"pom.xml"	TokenNameStringLiteral	pom.xml
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
artifactDependencies	TokenNameIdentifier	 artifact Dependencies
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSystemScopeDependencyIsPresentInTheCompileClasspathElements	TokenNameIdentifier	 test System Scope Dependency Is Present In The Compile Classpath Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
pom	TokenNameIdentifier	 pom
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
"it0063"	TokenNameStringLiteral	it0063
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
eps	TokenNameIdentifier	 eps
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eps	TokenNameIdentifier	 eps
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"jre.home"	TokenNameStringLiteral	jre.home
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"jdk/jre"	TokenNameStringLiteral	jdk/jre
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
createMavenSession	TokenNameIdentifier	 create Maven Session
(	TokenNameLPAREN	
pom	TokenNameIdentifier	 pom
,	TokenNameCOMMA	
eps	TokenNameIdentifier	 eps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
session	TokenNameIdentifier	 session
.	TokenNameDOT	
getCurrentProject	TokenNameIdentifier	 get Current Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setArtifacts	TokenNameIdentifier	 set Artifacts
(	TokenNameLPAREN	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
.	TokenNameDOT	
SCOPE_COMPILE	TokenNameIdentifier	 SCOPE  COMPILE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getCompileClasspathElements	TokenNameIdentifier	 get Compile Classpath Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Artifact	TokenNameIdentifier	 Artifact
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getCompileArtifacts	TokenNameIdentifier	 get Compile Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"tools.jar"	TokenNameStringLiteral	tools.jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
