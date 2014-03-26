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
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
LifecycleNotFoundException	TokenNameIdentifier	 Lifecycle Not Found Exception
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
LifecyclePhaseNotFoundException	TokenNameIdentifier	 Lifecycle Phase Not Found Exception
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
InvalidPluginDescriptorException	TokenNameIdentifier	 Invalid Plugin Descriptor Exception
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
MojoNotFoundException	TokenNameIdentifier	 Mojo Not Found Exception
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
PluginDescriptorParsingException	TokenNameIdentifier	 Plugin Descriptor Parsing Exception
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
PluginNotFoundException	TokenNameIdentifier	 Plugin Not Found Exception
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
PluginResolutionException	TokenNameIdentifier	 Plugin Resolution Exception
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
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
NoPluginFoundForPrefixException	TokenNameIdentifier	 No Plugin Found For Prefix Exception
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
version	TokenNameIdentifier	 version
.	TokenNameDOT	
PluginVersionResolutionException	TokenNameIdentifier	 Plugin Version Resolution Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * Calculates the task segments in the build * * @since 3.0 * @author Benjamin Bentmann * @author Jason van Zyl * @author jdcasey * @author Kristian Rosenvold (extracted interface) * <p/> * NOTE: This interface is not part of any public api and can be changed or deleted without prior notice. */	TokenNameCOMMENT_JAVADOC	 Calculates the task segments in the build * @since 3.0 @author Benjamin Bentmann @author Jason van Zyl @author jdcasey @author Kristian Rosenvold (extracted interface) <p/> NOTE: This interface is not part of any public api and can be changed or deleted without prior notice. 
public	TokenNamepublic	
interface	TokenNameinterface	
LifecycleTaskSegmentCalculator	TokenNameIdentifier	 Lifecycle Task Segment Calculator
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TaskSegment	TokenNameIdentifier	 Task Segment
>	TokenNameGREATER	
calculateTaskSegments	TokenNameIdentifier	 calculate Task Segments
(	TokenNameLPAREN	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
throws	TokenNamethrows	
PluginNotFoundException	TokenNameIdentifier	 Plugin Not Found Exception
,	TokenNameCOMMA	
PluginResolutionException	TokenNameIdentifier	 Plugin Resolution Exception
,	TokenNameCOMMA	
PluginDescriptorParsingException	TokenNameIdentifier	 Plugin Descriptor Parsing Exception
,	TokenNameCOMMA	
MojoNotFoundException	TokenNameIdentifier	 Mojo Not Found Exception
,	TokenNameCOMMA	
NoPluginFoundForPrefixException	TokenNameIdentifier	 No Plugin Found For Prefix Exception
,	TokenNameCOMMA	
InvalidPluginDescriptorException	TokenNameIdentifier	 Invalid Plugin Descriptor Exception
,	TokenNameCOMMA	
PluginVersionResolutionException	TokenNameIdentifier	 Plugin Version Resolution Exception
,	TokenNameCOMMA	
LifecyclePhaseNotFoundException	TokenNameIdentifier	 Lifecycle Phase Not Found Exception
,	TokenNameCOMMA	
LifecycleNotFoundException	TokenNameIdentifier	 Lifecycle Not Found Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TaskSegment	TokenNameIdentifier	 Task Segment
>	TokenNameGREATER	
calculateTaskSegments	TokenNameIdentifier	 calculate Task Segments
(	TokenNameLPAREN	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
tasks	TokenNameIdentifier	 tasks
)	TokenNameRPAREN	
throws	TokenNamethrows	
PluginNotFoundException	TokenNameIdentifier	 Plugin Not Found Exception
,	TokenNameCOMMA	
PluginResolutionException	TokenNameIdentifier	 Plugin Resolution Exception
,	TokenNameCOMMA	
PluginDescriptorParsingException	TokenNameIdentifier	 Plugin Descriptor Parsing Exception
,	TokenNameCOMMA	
MojoNotFoundException	TokenNameIdentifier	 Mojo Not Found Exception
,	TokenNameCOMMA	
NoPluginFoundForPrefixException	TokenNameIdentifier	 No Plugin Found For Prefix Exception
,	TokenNameCOMMA	
InvalidPluginDescriptorException	TokenNameIdentifier	 Invalid Plugin Descriptor Exception
,	TokenNameCOMMA	
PluginVersionResolutionException	TokenNameIdentifier	 Plugin Version Resolution Exception
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
requiresProject	TokenNameIdentifier	 requires Project
(	TokenNameLPAREN	
MavenSession	TokenNameIdentifier	 Maven Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
