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
/** * @goal test * @aggregator * * @author jdcasey */	TokenNameCOMMENT_JAVADOC	 @goal test @aggregator * @author jdcasey 
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
throw	TokenNamethrow	
new	TokenNamenew	
MojoFailureException	TokenNameIdentifier	 Mojo Failure Exception
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
"This mojo will always fail."	TokenNameStringLiteral	This mojo will always fail.
,	TokenNameCOMMA	
"This mojo is programmed to fail at all times, to express certain error-reporting functions."	TokenNameStringLiteral	This mojo is programmed to fail at all times, to express certain error-reporting functions.
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
