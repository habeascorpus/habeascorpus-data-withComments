/** * */	TokenNameCOMMENT_JAVADOC	 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
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
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ProjectBuilder	TokenNameIdentifier	 Project Builder
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
hint	TokenNameIdentifier	 hint
=	TokenNameEQUAL	
"classpath"	TokenNameStringLiteral	classpath
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
TestProjectBuilder	TokenNameIdentifier	 Test Project Builder
extends	TokenNameextends	
DefaultProjectBuilder	TokenNameIdentifier	 Default Project Builder
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ProjectBuildingResult	TokenNameIdentifier	 Project Building Result
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"maven-test"	TokenNameStringLiteral	maven-test
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
=	TokenNameEQUAL	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
"scope-"	TokenNameStringLiteral	scope-
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
ProjectClasspathTest	TokenNameIdentifier	 Project Classpath Test
.	TokenNameDOT	
getFileForClasspathResource	TokenNameIdentifier	 get File For Classpath Resource
(	TokenNameLPAREN	
ProjectClasspathTest	TokenNameIdentifier	 Project Classpath Test
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
"transitive-"	TokenNameStringLiteral	transitive-
+	TokenNamePLUS	
scope	TokenNameIdentifier	 scope
+	TokenNamePLUS	
"-dep.xml"	TokenNameStringLiteral	-dep.xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Missing test POM for "	TokenNameStringLiteral	Missing test POM for 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
new	TokenNamenew	
MavenProject	TokenNameIdentifier	 Maven Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setArtifact	TokenNameIdentifier	 set Artifact
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DefaultProjectBuildingResult	TokenNameIdentifier	 Default Project Building Result
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ProjectBuildingResult	TokenNameIdentifier	 Project Building Result
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
,	TokenNameCOMMA	
ProjectBuildingRequest	TokenNameIdentifier	 Project Building Request
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
throws	TokenNamethrows	
ProjectBuildingException	TokenNameIdentifier	 Project Building Exception
{	TokenNameLBRACE	
ProjectBuildingResult	TokenNameIdentifier	 Project Building Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
pomFile	TokenNameIdentifier	 pom File
,	TokenNameCOMMA	
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setRemoteArtifactRepositories	TokenNameIdentifier	 set Remote Artifact Repositories
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
