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
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
MojoExecution	TokenNameIdentifier	 Mojo Execution
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
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
CountDownLatch	TokenNameIdentifier	 Count Down Latch
;	TokenNameSEMICOLON	
/** * Wraps individual MojoExecutions, containing information about completion status and scheduling. * <p/> * NOTE: This class is not part of any public api and can be changed or deleted without prior notice. * * @since 3.0 * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 Wraps individual MojoExecutions, containing information about completion status and scheduling. <p/> NOTE: This class is not part of any public api and can be changed or deleted without prior notice. * @since 3.0 @author Kristian Rosenvold 
public	TokenNamepublic	
class	TokenNameclass	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Schedule	TokenNameIdentifier	 Schedule
schedule	TokenNameIdentifier	 schedule
;	TokenNameSEMICOLON	
// Completeness just indicates that it has been run or failed 	TokenNameCOMMENT_LINE	Completeness just indicates that it has been run or failed 
private	TokenNameprivate	
final	TokenNamefinal	
CountDownLatch	TokenNameIdentifier	 Count Down Latch
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
new	TokenNamenew	
CountDownLatch	TokenNameIdentifier	 Count Down Latch
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ExecutionPlanItem	TokenNameIdentifier	 Execution Plan Item
(	TokenNameLPAREN	
MojoExecution	TokenNameIdentifier	 Mojo Execution
mojoExecution	TokenNameIdentifier	 mojo Execution
,	TokenNameCOMMA	
Schedule	TokenNameIdentifier	 Schedule
schedule	TokenNameIdentifier	 schedule
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mojoExecution	TokenNameIdentifier	 mojo Execution
=	TokenNameEQUAL	
mojoExecution	TokenNameIdentifier	 mojo Execution
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
schedule	TokenNameIdentifier	 schedule
=	TokenNameEQUAL	
schedule	TokenNameIdentifier	 schedule
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MojoExecution	TokenNameIdentifier	 Mojo Execution
getMojoExecution	TokenNameIdentifier	 get Mojo Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mojoExecution	TokenNameIdentifier	 mojo Execution
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLifecyclePhase	TokenNameIdentifier	 get Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mojoExecution	TokenNameIdentifier	 mojo Execution
.	TokenNameDOT	
getLifecyclePhase	TokenNameIdentifier	 get Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setComplete	TokenNameIdentifier	 set Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
done	TokenNameIdentifier	 done
.	TokenNameDOT	
countDown	TokenNameIdentifier	 count Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
done	TokenNameIdentifier	 done
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
forceComplete	TokenNameIdentifier	 force Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setComplete	TokenNameIdentifier	 set Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
waitUntilDone	TokenNameIdentifier	 wait Until Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
done	TokenNameIdentifier	 done
.	TokenNameDOT	
await	TokenNameIdentifier	 await
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Schedule	TokenNameIdentifier	 Schedule
getSchedule	TokenNameIdentifier	 get Schedule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
schedule	TokenNameIdentifier	 schedule
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Plugin	TokenNameIdentifier	 Plugin
getPlugin	TokenNameIdentifier	 get Plugin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
=	TokenNameEQUAL	
getMojoExecution	TokenNameIdentifier	 get Mojo Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMojoDescriptor	TokenNameIdentifier	 get Mojo Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPlugin	TokenNameIdentifier	 get Plugin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"ExecutionPlanItem{"	TokenNameStringLiteral	ExecutionPlanItem{
+	TokenNamePLUS	
", mojoExecution="	TokenNameStringLiteral	, mojoExecution=
+	TokenNamePLUS	
mojoExecution	TokenNameIdentifier	 mojo Execution
+	TokenNamePLUS	
", schedule="	TokenNameStringLiteral	, schedule=
+	TokenNamePLUS	
schedule	TokenNameIdentifier	 schedule
+	TokenNamePLUS	
'}'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
