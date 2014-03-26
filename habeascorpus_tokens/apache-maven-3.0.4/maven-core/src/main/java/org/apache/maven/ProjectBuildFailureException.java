package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
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
/** * Exception which occurs when a normal (i.e. non-aggregator) mojo fails to * execute. In this case, the mojo failed while executing against a particular * project instance, so we can wrap the {@link MojoFailureException} with context * information including projectId and the {@link MojoBinding} that caused the * failure. * * @author jdcasey * */	TokenNameCOMMENT_JAVADOC	 Exception which occurs when a normal (i.e. non-aggregator) mojo fails to execute. In this case, the mojo failed while executing against a particular project instance, so we can wrap the {@link MojoFailureException} with context information including projectId and the {@link MojoBinding} that caused the failure. * @author jdcasey 
public	TokenNamepublic	
class	TokenNameclass	
ProjectBuildFailureException	TokenNameIdentifier	 Project Build Failure Exception
extends	TokenNameextends	
BuildFailureException	TokenNameIdentifier	 Build Failure Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ProjectBuildFailureException	TokenNameIdentifier	 Project Build Failure Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
projectId	TokenNameIdentifier	 project Id
,	TokenNameCOMMA	
MojoFailureException	TokenNameIdentifier	 Mojo Failure Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Build for project: "	TokenNameStringLiteral	Build for project: 
+	TokenNamePLUS	
projectId	TokenNameIdentifier	 project Id
+	TokenNamePLUS	
" failed during execution of mojo."	TokenNameStringLiteral	 failed during execution of mojo.
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
projectId	TokenNameIdentifier	 project Id
=	TokenNameEQUAL	
projectId	TokenNameIdentifier	 project Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MojoFailureException	TokenNameIdentifier	 Mojo Failure Exception
getMojoFailureException	TokenNameIdentifier	 get Mojo Failure Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
MojoFailureException	TokenNameIdentifier	 Mojo Failure Exception
)	TokenNameRPAREN	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProjectId	TokenNameIdentifier	 get Project Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectId	TokenNameIdentifier	 project Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
