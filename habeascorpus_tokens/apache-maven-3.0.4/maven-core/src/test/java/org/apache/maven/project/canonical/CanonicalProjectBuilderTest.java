package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
canonical	TokenNameIdentifier	 canonical
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
model	TokenNameIdentifier	 model
.	TokenNameDOT	
PluginExecution	TokenNameIdentifier	 Plugin Execution
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
AbstractMavenProjectTestCase	TokenNameIdentifier	 Abstract Maven Project Test Case
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
;	TokenNameSEMICOLON	
/** * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl 
public	TokenNamepublic	
class	TokenNameclass	
CanonicalProjectBuilderTest	TokenNameIdentifier	 Canonical Project Builder Test
extends	TokenNameextends	
AbstractMavenProjectTestCase	TokenNameIdentifier	 Abstract Maven Project Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testProjectBuilder	TokenNameIdentifier	 test Project Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
getFileForClasspathResource	TokenNameIdentifier	 get File For Classpath Resource
(	TokenNameLPAREN	
"canonical-pom.xml"	TokenNameStringLiteral	canonical-pom.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Top-level elements 	TokenNameCOMMENT_LINE	Top-level elements 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"4.0.0"	TokenNameStringLiteral	4.0.0
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getModelVersion	TokenNameIdentifier	 get Model Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Plugins 	TokenNameCOMMENT_LINE	Plugins 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
List	TokenNameIdentifier	 List
plugins	TokenNameIdentifier	 plugins
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBuildPlugins	TokenNameIdentifier	 get Build Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Plugin0 [plexus] 	TokenNameCOMMENT_LINE	Plugin0 [plexus] 
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
"org.apache.maven.plugins:maven-plexus-plugin"	TokenNameStringLiteral	org.apache.maven.plugins:maven-plexus-plugin
;	TokenNameSEMICOLON	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
plugins	TokenNameIdentifier	 plugins
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Plugin	TokenNameIdentifier	 Plugin
check	TokenNameIdentifier	 check
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
check	TokenNameIdentifier	 check
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
check	TokenNameIdentifier	 check
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
configuration	TokenNameIdentifier	 configuration
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"src/conf/plexus.conf"	TokenNameStringLiteral	src/conf/plexus.conf
,	TokenNameCOMMA	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"plexusConfiguration"	TokenNameStringLiteral	plexusConfiguration
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"src/conf/plexus.properties"	TokenNameStringLiteral	src/conf/plexus.properties
,	TokenNameCOMMA	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"plexusConfigurationPropertiesFile"	TokenNameStringLiteral	plexusConfigurationPropertiesFile
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Continuum"	TokenNameStringLiteral	Continuum
,	TokenNameCOMMA	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"plexusApplicationName"	TokenNameStringLiteral	plexusApplicationName
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Goal specific configuration 	TokenNameCOMMENT_LINE	Goal specific configuration 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
List	TokenNameIdentifier	 List
executions	TokenNameIdentifier	 executions
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getExecutions	TokenNameIdentifier	 get Executions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PluginExecution	TokenNameIdentifier	 Plugin Execution
execution	TokenNameIdentifier	 execution
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PluginExecution	TokenNameIdentifier	 Plugin Execution
)	TokenNameRPAREN	
executions	TokenNameIdentifier	 executions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
g0	TokenNameIdentifier	 g0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
getGoals	TokenNameIdentifier	 get Goals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"plexus:runtime"	TokenNameStringLiteral	plexus:runtime
,	TokenNameCOMMA	
g0	TokenNameIdentifier	 g0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configuration	TokenNameIdentifier	 configuration
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"ContinuumPro"	TokenNameStringLiteral	ContinuumPro
,	TokenNameCOMMA	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
"plexusApplicationName"	TokenNameStringLiteral	plexusApplicationName
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Plugin1 [antlr] 	TokenNameCOMMENT_LINE	Plugin1 [antlr] 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
