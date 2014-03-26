package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
/** * This interface forms the contract required for <code>Mojos</code> to interact with the <code>Maven</code> * infrastructure. * <br/> * It features an <code>execute()</code> method, which triggers the Mojo's build-process behavior, and can throw * a MojoExecutionException or MojoFailureException if error conditions occur. * <br/> * Also included is the <code>setLog(...)</code> method, which simply allows Maven to inject a logging mechanism which * will allow the Mojo to communicate to the outside world through standard Maven channels. * * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 This interface forms the contract required for <code>Mojos</code> to interact with the <code>Maven</code> infrastructure. <br/> It features an <code>execute()</code> method, which triggers the Mojo's build-process behavior, and can throw a MojoExecutionException or MojoFailureException if error conditions occur. <br/> Also included is the <code>setLog(...)</code> method, which simply allows Maven to inject a logging mechanism which will allow the Mojo to communicate to the outside world through standard Maven channels. * @author Jason van Zyl 
public	TokenNamepublic	
interface	TokenNameinterface	
Mojo	TokenNameIdentifier	 Mojo
{	TokenNameLBRACE	
/** The component <code>role</code> hint for Plexus container */	TokenNameCOMMENT_JAVADOC	 The component <code>role</code> hint for Plexus container 
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
Mojo	TokenNameIdentifier	 Mojo
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Perform whatever build-process behavior this <code>Mojo</code> implements. * <br/> * This is the main trigger for the <code>Mojo</code> inside the <code>Maven</code> system, and allows * the <code>Mojo</code> to communicate errors. * * @throws MojoExecutionException if an unexpected problem occurs. * Throwing this exception causes a "BUILD ERROR" message to be displayed. * @throws MojoFailureException if an expected problem (such as a compilation failure) occurs. * Throwing this exception causes a "BUILD FAILURE" message to be displayed. */	TokenNameCOMMENT_JAVADOC	 Perform whatever build-process behavior this <code>Mojo</code> implements. <br/> This is the main trigger for the <code>Mojo</code> inside the <code>Maven</code> system, and allows the <code>Mojo</code> to communicate errors. * @throws MojoExecutionException if an unexpected problem occurs. Throwing this exception causes a "BUILD ERROR" message to be displayed. @throws MojoFailureException if an expected problem (such as a compilation failure) occurs. Throwing this exception causes a "BUILD FAILURE" message to be displayed. 
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
MojoExecutionException	TokenNameIdentifier	 Mojo Execution Exception
,	TokenNameCOMMA	
MojoFailureException	TokenNameIdentifier	 Mojo Failure Exception
;	TokenNameSEMICOLON	
/** * Inject a standard <code>Maven</code> logging mechanism to allow this <code>Mojo</code> to communicate events * and feedback to the user. * * @param log a new logger */	TokenNameCOMMENT_JAVADOC	 Inject a standard <code>Maven</code> logging mechanism to allow this <code>Mojo</code> to communicate events and feedback to the user. * @param log a new logger 
// TODO: not sure about this here, and may want a getLog on here as well/instead 	TokenNameCOMMENT_LINE	TODO: not sure about this here, and may want a getLog on here as well/instead 
void	TokenNamevoid	
setLog	TokenNameIdentifier	 set Log
(	TokenNameLPAREN	
Log	TokenNameIdentifier	 Log
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Furnish access to the standard Maven logging mechanism which is managed in this base class. * * @return a log4j-like logger object which allows plugins to create messages at levels of <code>"debug"</code>, * <code>"info"</code>, <code>"warn"</code>, and <code>"error"</code>. This logger is the accepted means to display * information to the user. */	TokenNameCOMMENT_JAVADOC	 Furnish access to the standard Maven logging mechanism which is managed in this base class. * @return a log4j-like logger object which allows plugins to create messages at levels of <code>"debug"</code>, <code>"info"</code>, <code>"warn"</code>, and <code>"error"</code>. This logger is the accepted means to display information to the user. 
Log	TokenNameIdentifier	 Log
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
