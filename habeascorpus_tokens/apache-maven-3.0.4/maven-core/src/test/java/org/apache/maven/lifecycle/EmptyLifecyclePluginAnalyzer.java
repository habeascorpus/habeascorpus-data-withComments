package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
/** * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
EmptyLifecyclePluginAnalyzer	TokenNameIdentifier	 Empty Lifecycle Plugin Analyzer
implements	TokenNameimplements	
LifeCyclePluginAnalyzer	TokenNameIdentifier	 Life Cycle Plugin Analyzer
{	TokenNameLBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Plugin	TokenNameIdentifier	 Plugin
>	TokenNameGREATER	
getPluginsBoundByDefaultToAllLifecycles	TokenNameIdentifier	 get Plugins Bound By Default To All Lifecycles
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
packaging	TokenNameIdentifier	 packaging
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Plugin	TokenNameIdentifier	 Plugin
>	TokenNameGREATER	
plugins	TokenNameIdentifier	 plugins
;	TokenNameSEMICOLON	
// NOTE: The upper-case packaging name is intentional, that's a special hinting mode used for certain tests 	TokenNameCOMMENT_LINE	NOTE: The upper-case packaging name is intentional, that's a special hinting mode used for certain tests 
if	TokenNameif	
(	TokenNameLPAREN	
"JAR"	TokenNameStringLiteral	JAR
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
packaging	TokenNameIdentifier	 packaging
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
plugins	TokenNameIdentifier	 plugins
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
Plugin	TokenNameIdentifier	 Plugin
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugins	TokenNameIdentifier	 plugins
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newPlugin	TokenNameIdentifier	 new Plugin
(	TokenNameLPAREN	
"maven-compiler-plugin"	TokenNameStringLiteral	maven-compiler-plugin
,	TokenNameCOMMA	
"compile"	TokenNameStringLiteral	compile
,	TokenNameCOMMA	
"testCompile"	TokenNameStringLiteral	testCompile
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugins	TokenNameIdentifier	 plugins
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newPlugin	TokenNameIdentifier	 new Plugin
(	TokenNameLPAREN	
"maven-resources-plugin"	TokenNameStringLiteral	maven-resources-plugin
,	TokenNameCOMMA	
"resources"	TokenNameStringLiteral	resources
,	TokenNameCOMMA	
"testResources"	TokenNameStringLiteral	testResources
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugins	TokenNameIdentifier	 plugins
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newPlugin	TokenNameIdentifier	 new Plugin
(	TokenNameLPAREN	
"maven-surefire-plugin"	TokenNameStringLiteral	maven-surefire-plugin
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugins	TokenNameIdentifier	 plugins
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newPlugin	TokenNameIdentifier	 new Plugin
(	TokenNameLPAREN	
"maven-jar-plugin"	TokenNameStringLiteral	maven-jar-plugin
,	TokenNameCOMMA	
"jar"	TokenNameStringLiteral	jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugins	TokenNameIdentifier	 plugins
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newPlugin	TokenNameIdentifier	 new Plugin
(	TokenNameLPAREN	
"maven-install-plugin"	TokenNameStringLiteral	maven-install-plugin
,	TokenNameCOMMA	
"install"	TokenNameStringLiteral	install
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugins	TokenNameIdentifier	 plugins
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newPlugin	TokenNameIdentifier	 new Plugin
(	TokenNameLPAREN	
"maven-deploy-plugin"	TokenNameStringLiteral	maven-deploy-plugin
,	TokenNameCOMMA	
"deploy"	TokenNameStringLiteral	deploy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
plugins	TokenNameIdentifier	 plugins
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
plugins	TokenNameIdentifier	 plugins
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Plugin	TokenNameIdentifier	 Plugin
newPlugin	TokenNameIdentifier	 new Plugin
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
goals	TokenNameIdentifier	 goals
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
new	TokenNamenew	
Plugin	TokenNameIdentifier	 Plugin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
"org.apache.maven.plugins"	TokenNameStringLiteral	org.apache.maven.plugins
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
goal	TokenNameIdentifier	 goal
:	TokenNameCOLON	
goals	TokenNameIdentifier	 goals
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PluginExecution	TokenNameIdentifier	 Plugin Execution
pluginExecution	TokenNameIdentifier	 plugin Execution
=	TokenNameEQUAL	
new	TokenNamenew	
PluginExecution	TokenNameIdentifier	 Plugin Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginExecution	TokenNameIdentifier	 plugin Execution
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
"default-"	TokenNameStringLiteral	default-
+	TokenNamePLUS	
goal	TokenNameIdentifier	 goal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pluginExecution	TokenNameIdentifier	 plugin Execution
.	TokenNameDOT	
addGoal	TokenNameIdentifier	 add Goal
(	TokenNameLPAREN	
goal	TokenNameIdentifier	 goal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
addExecution	TokenNameIdentifier	 add Execution
(	TokenNameLPAREN	
pluginExecution	TokenNameIdentifier	 plugin Execution
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
