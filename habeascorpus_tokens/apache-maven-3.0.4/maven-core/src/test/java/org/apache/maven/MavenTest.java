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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
ExceptionHandler	TokenNameIdentifier	 Exception Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
ExceptionSummary	TokenNameIdentifier	 Exception Summary
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
MavenExecutionRequest	TokenNameIdentifier	 Maven Execution Request
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
MavenExecutionResult	TokenNameIdentifier	 Maven Execution Result
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
MavenTest	TokenNameIdentifier	 Maven Test
extends	TokenNameextends	
AbstractCoreMavenComponentTestCase	TokenNameIdentifier	 Abstract Core Maven Component Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
Maven	TokenNameIdentifier	 Maven
maven	TokenNameIdentifier	 maven
;	TokenNameSEMICOLON	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
ExceptionHandler	TokenNameIdentifier	 Exception Handler
exceptionHandler	TokenNameIdentifier	 exception Handler
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
maven	TokenNameIdentifier	 maven
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
Maven	TokenNameIdentifier	 Maven
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exceptionHandler	TokenNameIdentifier	 exception Handler
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ExceptionHandler	TokenNameIdentifier	 Exception Handler
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
maven	TokenNameIdentifier	 maven
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
exceptionHandler	TokenNameIdentifier	 exception Handler
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
"src/test/projects/lifecycle-executor"	TokenNameStringLiteral	src/test/projects/lifecycle-executor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLifecycleExecutionUsingADefaultLifecyclePhase	TokenNameIdentifier	 test Lifecycle Execution Using A Default Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/* File pom = getProject( "project-with-additional-lifecycle-elements" ); MavenExecutionRequest request = createMavenExecutionRequest( pom ); MavenExecutionResult result = maven.execute( request ); if ( result.hasExceptions() ) { ExceptionSummary es = exceptionHandler.handleException( result.getExceptions().get( 0 ) ); System.out.println( es.getMessage() ); es.getException().printStackTrace(); fail( "Maven did not execute correctly." ); } */	TokenNameCOMMENT_BLOCK	 File pom = getProject( "project-with-additional-lifecycle-elements" ); MavenExecutionRequest request = createMavenExecutionRequest( pom ); MavenExecutionResult result = maven.execute( request ); if ( result.hasExceptions() ) { ExceptionSummary es = exceptionHandler.handleException( result.getExceptions().get( 0 ) ); System.out.println( es.getMessage() ); es.getException().printStackTrace(); fail( "Maven did not execute correctly." ); } 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
