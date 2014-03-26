package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ComponentDependency	TokenNameIdentifier	 Component Dependency
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ComponentRequirement	TokenNameIdentifier	 Component Requirement
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
.	TokenNameDOT	
PlexusConfigurationException	TokenNameIdentifier	 Plexus Configuration Exception
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
ReaderFactory	TokenNameIdentifier	 Reader Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Tests {@link PluginDescriptorBuilder}. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Tests {@link PluginDescriptorBuilder}. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
PluginDescriptorBuilderTest	TokenNameIdentifier	 Plugin Descriptor Builder Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
PlexusConfigurationException	TokenNameIdentifier	 Plexus Configuration Exception
{	TokenNameLBRACE	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
ReaderFactory	TokenNameIdentifier	 Reader Factory
.	TokenNameDOT	
newXmlReader	TokenNameIdentifier	 new Xml Reader
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
PluginDescriptorBuilder	TokenNameIdentifier	 Plugin Descriptor Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBuildReader	TokenNameIdentifier	 test Build Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pd	TokenNameIdentifier	 pd
=	TokenNameEQUAL	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
"/plugin.xml"	TokenNameStringLiteral	/plugin.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"org.apache.maven.plugins"	TokenNameStringLiteral	org.apache.maven.plugins
,	TokenNameCOMMA	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"maven-jar-plugin"	TokenNameStringLiteral	maven-jar-plugin
,	TokenNameCOMMA	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2.3-SNAPSHOT"	TokenNameStringLiteral	2.3-SNAPSHOT
,	TokenNameCOMMA	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"jar"	TokenNameStringLiteral	jar
,	TokenNameCOMMA	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getGoalPrefix	TokenNameIdentifier	 get Goal Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"plugin-description"	TokenNameStringLiteral	plugin-description
,	TokenNameCOMMA	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
isIsolatedRealm	TokenNameIdentifier	 is Isolated Realm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
isInheritedByDefault	TokenNameIdentifier	 is Inherited By Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getMojos	TokenNameIdentifier	 get Mojos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
md	TokenNameIdentifier	 md
=	TokenNameEQUAL	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getMojos	TokenNameIdentifier	 get Mojos
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
"jar"	TokenNameStringLiteral	jar
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"mojo-description"	TokenNameStringLiteral	mojo-description
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"runtime"	TokenNameStringLiteral	runtime
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getDependencyResolutionRequired	TokenNameIdentifier	 get Dependency Resolution Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getDependencyCollectionRequired	TokenNameIdentifier	 get Dependency Collection Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
isAggregator	TokenNameIdentifier	 is Aggregator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
isDirectInvocationOnly	TokenNameIdentifier	 is Direct Invocation Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
isInheritedByDefault	TokenNameIdentifier	 is Inherited By Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
isOnlineRequired	TokenNameIdentifier	 is Online Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
isProjectRequired	TokenNameIdentifier	 is Project Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
isThreadSafe	TokenNameIdentifier	 is Thread Safe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"package"	TokenNameStringLiteral	package
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"org.apache.maven.plugin.jar.JarMojo"	TokenNameStringLiteral	org.apache.maven.plugin.jar.JarMojo
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"antrun"	TokenNameStringLiteral	antrun
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getComponentConfigurator	TokenNameIdentifier	 get Component Configurator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"java"	TokenNameStringLiteral	java
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"per-lookup"	TokenNameStringLiteral	per-lookup
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getInstantiationStrategy	TokenNameIdentifier	 get Instantiation Strategy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"some-goal"	TokenNameStringLiteral	some-goal
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getExecuteGoal	TokenNameIdentifier	 get Execute Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"generate-sources"	TokenNameStringLiteral	generate-sources
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getExecutePhase	TokenNameIdentifier	 get Execute Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"cobertura"	TokenNameStringLiteral	cobertura
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getExecuteLifecycle	TokenNameIdentifier	 get Execute Lifecycle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2.2"	TokenNameStringLiteral	2.2
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getSince	TokenNameIdentifier	 get Since
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"deprecated-mojo"	TokenNameStringLiteral	deprecated-mojo
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getDeprecated	TokenNameIdentifier	 get Deprecated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getRequirements	TokenNameIdentifier	 get Requirements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getMojoConfiguration	TokenNameIdentifier	 get Mojo Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getMojoConfiguration	TokenNameIdentifier	 get Mojo Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getChildCount	TokenNameIdentifier	 get Child Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getMojoConfiguration	TokenNameIdentifier	 get Mojo Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"${jar.finalName}"	TokenNameStringLiteral	${jar.finalName}
,	TokenNameCOMMA	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"${project.build.finalName}"	TokenNameStringLiteral	${project.build.finalName}
,	TokenNameCOMMA	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"default-value"	TokenNameStringLiteral	default-value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"java.lang.String"	TokenNameStringLiteral	java.lang.String
,	TokenNameCOMMA	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"implementation"	TokenNameStringLiteral	implementation
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Parameter	TokenNameIdentifier	 Parameter
mp	TokenNameIdentifier	 mp
=	TokenNameEQUAL	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getParameters	TokenNameIdentifier	 get Parameters
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
"finalName"	TokenNameStringLiteral	finalName
,	TokenNameCOMMA	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"jarName"	TokenNameStringLiteral	jarName
,	TokenNameCOMMA	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
getAlias	TokenNameIdentifier	 get Alias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"java.lang.String"	TokenNameStringLiteral	java.lang.String
,	TokenNameCOMMA	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"java.lang.String"	TokenNameStringLiteral	java.lang.String
,	TokenNameCOMMA	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
isEditable	TokenNameIdentifier	 is Editable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
isRequired	TokenNameIdentifier	 is Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"parameter-description"	TokenNameStringLiteral	parameter-description
,	TokenNameCOMMA	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"deprecated-parameter"	TokenNameStringLiteral	deprecated-parameter
,	TokenNameCOMMA	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
getDeprecated	TokenNameIdentifier	 get Deprecated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"${jar.finalName}"	TokenNameStringLiteral	${jar.finalName}
,	TokenNameCOMMA	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"${project.build.finalName}"	TokenNameStringLiteral	${project.build.finalName}
,	TokenNameCOMMA	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
getDefaultValue	TokenNameIdentifier	 get Default Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ComponentRequirement	TokenNameIdentifier	 Component Requirement
cr	TokenNameIdentifier	 cr
=	TokenNameEQUAL	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getRequirements	TokenNameIdentifier	 get Requirements
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
"org.codehaus.plexus.archiver.Archiver"	TokenNameStringLiteral	org.codehaus.plexus.archiver.Archiver
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getRole	TokenNameIdentifier	 get Role
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"jar"	TokenNameStringLiteral	jar
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getRoleHint	TokenNameIdentifier	 get Role Hint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"jarArchiver"	TokenNameStringLiteral	jarArchiver
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getFieldName	TokenNameIdentifier	 get Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ComponentDependency	TokenNameIdentifier	 Component Dependency
cd	TokenNameIdentifier	 cd
=	TokenNameEQUAL	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getDependencies	TokenNameIdentifier	 get Dependencies
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
"org.apache.maven"	TokenNameStringLiteral	org.apache.maven
,	TokenNameCOMMA	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"maven-plugin-api"	TokenNameStringLiteral	maven-plugin-api
,	TokenNameCOMMA	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2.0.6"	TokenNameStringLiteral	2.0.6
,	TokenNameCOMMA	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"jar"	TokenNameStringLiteral	jar
,	TokenNameCOMMA	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
md	TokenNameIdentifier	 md
=	TokenNameEQUAL	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getMojos	TokenNameIdentifier	 get Mojos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"war"	TokenNameStringLiteral	war
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getDependencyResolutionRequired	TokenNameIdentifier	 get Dependency Resolution Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getDependencyCollectionRequired	TokenNameIdentifier	 get Dependency Collection Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
isThreadSafe	TokenNameIdentifier	 is Thread Safe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
