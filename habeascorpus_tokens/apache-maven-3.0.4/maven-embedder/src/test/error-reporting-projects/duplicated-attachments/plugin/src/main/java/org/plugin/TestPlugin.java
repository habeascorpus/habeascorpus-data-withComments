package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
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
Mojo	TokenNameIdentifier	 Mojo
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
MojoExecutionException	TokenNameIdentifier	 Mojo Execution Exception
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
MojoFailureException	TokenNameIdentifier	 Mojo Failure Exception
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
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Log	TokenNameIdentifier	 Log
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
MavenProjectHelper	TokenNameIdentifier	 Maven Project Helper
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
/** * @goal test * * @author jdcasey */	TokenNameCOMMENT_JAVADOC	 @goal test * @author jdcasey 
public	TokenNamepublic	
class	TokenNameclass	
TestPlugin	TokenNameIdentifier	 Test Plugin
implements	TokenNameimplements	
Mojo	TokenNameIdentifier	 Mojo
{	TokenNameLBRACE	
private	TokenNameprivate	
Log	TokenNameIdentifier	 Log
log	TokenNameIdentifier	 log
;	TokenNameSEMICOLON	
/** * @component */	TokenNameCOMMENT_JAVADOC	 @component 
private	TokenNameprivate	
MavenProjectHelper	TokenNameIdentifier	 Maven Project Helper
mavenProjectHelper	TokenNameIdentifier	 maven Project Helper
;	TokenNameSEMICOLON	
/** * @parameter default-value="${project}" * @required * @readonly */	TokenNameCOMMENT_JAVADOC	 @parameter default-value="${project}" @required @readonly 
private	TokenNameprivate	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
MojoExecutionException	TokenNameIdentifier	 Mojo Execution Exception
,	TokenNameCOMMA	
MojoFailureException	TokenNameIdentifier	 Mojo Failure Exception
{	TokenNameLBRACE	
mavenProjectHelper	TokenNameIdentifier	 maven Project Helper
.	TokenNameDOT	
attachArtifact	TokenNameIdentifier	 attach Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"pom"	TokenNameStringLiteral	pom
,	TokenNameCOMMA	
"classifier"	TokenNameStringLiteral	classifier
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mavenProjectHelper	TokenNameIdentifier	 maven Project Helper
.	TokenNameDOT	
attachArtifact	TokenNameIdentifier	 attach Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"pom"	TokenNameStringLiteral	pom
,	TokenNameCOMMA	
"classifier"	TokenNameStringLiteral	classifier
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Log	TokenNameIdentifier	 Log
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
log	TokenNameIdentifier	 log
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLog	TokenNameIdentifier	 set Log
(	TokenNameLPAREN	
Log	TokenNameIdentifier	 Log
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
log	TokenNameIdentifier	 log
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
