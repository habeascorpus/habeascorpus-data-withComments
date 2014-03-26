/* * Licensed to the Apache Software Foundation (ASF) under one or more contributor license * agreements. See the NOTICE file distributed with this work for additional information regarding * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. You may obtain a * copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software distributed under the License * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express * or implied. See the License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
Schedule	TokenNameIdentifier	 Schedule
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
stub	TokenNameIdentifier	 stub
.	TokenNameDOT	
MojoExecutorStub	TokenNameIdentifier	 Mojo Executor Stub
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
MojoExecution	TokenNameIdentifier	 Mojo Execution
;	TokenNameSEMICOLON	
/** * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 @author Kristian Rosenvold 
public	TokenNamepublic	
class	TokenNameclass	
ExecutionPlanItemTest	TokenNameIdentifier	 Execution Plan Item Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSetComplete	TokenNameIdentifier	 test Set Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
createExecutionPlanItem	TokenNameIdentifier	 create Execution Plan Item
(	TokenNameLPAREN	
"testMojo"	TokenNameStringLiteral	testMojo
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setComplete	TokenNameIdentifier	 set Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This itself is a valid test 	TokenNameCOMMENT_LINE	This itself is a valid test 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWaitUntilDone	TokenNameIdentifier	 test Wait Until Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
createExecutionPlanItem	TokenNameIdentifier	 create Execution Plan Item
(	TokenNameLPAREN	
"testMojo"	TokenNameStringLiteral	testMojo
,	TokenNameCOMMA	
createExecutionPlanItem	TokenNameIdentifier	 create Execution Plan Item
(	TokenNameLPAREN	
"testMojo2"	TokenNameStringLiteral	testMojo2
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
new	TokenNamenew	
Runnable	TokenNameIdentifier	 Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setComplete	TokenNameIdentifier	 set Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
waitUntilDone	TokenNameIdentifier	 wait Until Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
createExecutionPlanItem	TokenNameIdentifier	 create Execution Plan Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mojoDescription	TokenNameIdentifier	 mojo Description
,	TokenNameCOMMA	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
downStream	TokenNameIdentifier	 down Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createExecutionPlanItem	TokenNameIdentifier	 create Execution Plan Item
(	TokenNameLPAREN	
mojoDescription	TokenNameIdentifier	 mojo Description
,	TokenNameCOMMA	
downStream	TokenNameIdentifier	 down Stream
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
createExecutionPlanItem	TokenNameIdentifier	 create Execution Plan Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mojoDescription	TokenNameIdentifier	 mojo Description
,	TokenNameCOMMA	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
downStream	TokenNameIdentifier	 down Stream
,	TokenNameCOMMA	
Schedule	TokenNameIdentifier	 Schedule
schedule	TokenNameIdentifier	 schedule
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
(	TokenNameLPAREN	
new	TokenNamenew	
MojoExecution	TokenNameIdentifier	 Mojo Execution
(	TokenNameLPAREN	
MojoExecutorStub	TokenNameIdentifier	 Mojo Executor Stub
.	TokenNameDOT	
createMojoDescriptor	TokenNameIdentifier	 create Mojo Descriptor
(	TokenNameLPAREN	
mojoDescription	TokenNameIdentifier	 mojo Description
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
schedule	TokenNameIdentifier	 schedule
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
