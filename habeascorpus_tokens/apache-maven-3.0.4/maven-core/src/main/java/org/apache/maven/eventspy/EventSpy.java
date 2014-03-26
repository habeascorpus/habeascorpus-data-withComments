package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
eventspy	TokenNameIdentifier	 eventspy
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * A core extension to monitor Maven's execution. Typically, such an extension gets loaded into Maven by specifying the * system property {@code maven.ext.class.path} on the command line. As soon as dependency injection is setup, Maven * looks up all implementators of this interface and calls their {@link #init(Context)} method. <em>Note:</em> * Implementors are strongly advised to inherit from {@link AbstractEventSpy} instead of directly implementing this * interface. */	TokenNameCOMMENT_JAVADOC	 A core extension to monitor Maven's execution. Typically, such an extension gets loaded into Maven by specifying the system property {@code maven.ext.class.path} on the command line. As soon as dependency injection is setup, Maven looks up all implementators of this interface and calls their {@link #init(Context)} method. <em>Note:</em> Implementors are strongly advised to inherit from {@link AbstractEventSpy} instead of directly implementing this interface. 
public	TokenNamepublic	
interface	TokenNameinterface	
EventSpy	TokenNameIdentifier	 Event Spy
{	TokenNameLBRACE	
interface	TokenNameinterface	
Context	TokenNameIdentifier	 Context
{	TokenNameLBRACE	
/** * Gets key-value pairs providing information about the Maven runtime. * * @return The key-value pairs, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets key-value pairs providing information about the Maven runtime. * @return The key-value pairs, never {@code null}. 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the spy. * * @param context The event spy context, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Initializes the spy. * @param context The event spy context, never {@code null}. 
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
/** * Notifies the spy of some build event/operation. * * @param event The event, never {@@code null}. * @see org.apache.maven.settings.building.SettingsBuildingRequest * @see org.apache.maven.settings.building.SettingsBuildingResult * @see org.apache.maven.execution.MavenExecutionRequest * @see org.apache.maven.execution.MavenExecutionResult * @see org.apache.maven.project.DependencyResolutionRequest * @see org.apache.maven.project.DependencyResolutionResultt * @see org.apache.maven.execution.ExecutionEvent * @see org.sonatype.aether.RepositoryEvent */	TokenNameCOMMENT_JAVADOC	 Notifies the spy of some build event/operation. * @param event The event, never {@@code null}. @see org.apache.maven.settings.building.SettingsBuildingRequest @see org.apache.maven.settings.building.SettingsBuildingResult @see org.apache.maven.execution.MavenExecutionRequest @see org.apache.maven.execution.MavenExecutionResult @see org.apache.maven.project.DependencyResolutionRequest @see org.apache.maven.project.DependencyResolutionResultt @see org.apache.maven.execution.ExecutionEvent @see org.sonatype.aether.RepositoryEvent 
void	TokenNamevoid	
onEvent	TokenNameIdentifier	 on Event
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
/** * Notifies the spy of Maven's termination, allowing it to free any resources allocated by it. */	TokenNameCOMMENT_JAVADOC	 Notifies the spy of Maven's termination, allowing it to free any resources allocated by it. 
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
