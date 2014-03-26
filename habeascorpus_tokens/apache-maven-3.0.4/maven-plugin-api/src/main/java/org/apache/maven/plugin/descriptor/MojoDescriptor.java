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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ComponentDescriptor	TokenNameIdentifier	 Component Descriptor
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XmlPlexusConfiguration	TokenNameIdentifier	 Xml Plexus Configuration
;	TokenNameSEMICOLON	
/** * The bean containing the Mojo descriptor. * <br/> * For more information about the usage tag, have a look to: * <a href="http://maven.apache.org/developers/mojo-api-specification.html"> * http://maven.apache.org/developers/mojo-api-specification.html</a> * * @todo is there a need for the delegation of MavenMojoDescriptor to this? * Why not just extend ComponentDescriptor here? */	TokenNameCOMMENT_JAVADOC	 The bean containing the Mojo descriptor. <br/> For more information about the usage tag, have a look to: <a href="http://maven.apache.org/developers/mojo-api-specification.html"> http://maven.apache.org/developers/mojo-api-specification.html</a> * @todo is there a need for the delegation of MavenMojoDescriptor to this? Why not just extend ComponentDescriptor here? 
public	TokenNamepublic	
class	TokenNameclass	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
extends	TokenNameextends	
ComponentDescriptor	TokenNameIdentifier	 Component Descriptor
<	TokenNameLESS	
Mojo	TokenNameIdentifier	 Mojo
>	TokenNameGREATER	
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** The Plexus component type */	TokenNameCOMMENT_JAVADOC	 The Plexus component type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MAVEN_PLUGIN	TokenNameIdentifier	 MAVEN  PLUGIN
=	TokenNameEQUAL	
"maven-plugin"	TokenNameStringLiteral	maven-plugin
;	TokenNameSEMICOLON	
/** "once-per-session" execution strategy */	TokenNameCOMMENT_JAVADOC	 "once-per-session" execution strategy 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SINGLE_PASS_EXEC_STRATEGY	TokenNameIdentifier	 SINGLE  PASS  EXEC  STRATEGY
=	TokenNameEQUAL	
"once-per-session"	TokenNameStringLiteral	once-per-session
;	TokenNameSEMICOLON	
/** "always" execution strategy */	TokenNameCOMMENT_JAVADOC	 "always" execution strategy 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MULTI_PASS_EXEC_STRATEGY	TokenNameIdentifier	 MULTI  PASS  EXEC  STRATEGY
=	TokenNameEQUAL	
"always"	TokenNameStringLiteral	always
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_INSTANTIATION_STRATEGY	TokenNameIdentifier	 DEFAULT  INSTANTIATION  STRATEGY
=	TokenNameEQUAL	
"per-lookup"	TokenNameStringLiteral	per-lookup
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_LANGUAGE	TokenNameIdentifier	 DEFAULT  LANGUAGE
=	TokenNameEQUAL	
"java"	TokenNameStringLiteral	java
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
parameterMap	TokenNameIdentifier	 parameter Map
;	TokenNameSEMICOLON	
/** By default, the execution strategy is "once-per-session" */	TokenNameCOMMENT_JAVADOC	 By default, the execution strategy is "once-per-session" 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
executionStrategy	TokenNameIdentifier	 execution Strategy
=	TokenNameEQUAL	
SINGLE_PASS_EXEC_STRATEGY	TokenNameIdentifier	 SINGLE  PASS  EXEC  STRATEGY
;	TokenNameSEMICOLON	
/** The goal name of the Mojo */	TokenNameCOMMENT_JAVADOC	 The goal name of the Mojo 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
goal	TokenNameIdentifier	 goal
;	TokenNameSEMICOLON	
/** Reference the binded phase name of the Mojo */	TokenNameCOMMENT_JAVADOC	 Reference the binded phase name of the Mojo 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
phase	TokenNameIdentifier	 phase
;	TokenNameSEMICOLON	
/** Specify the version when the Mojo was added to the API. Similar to Javadoc since. */	TokenNameCOMMENT_JAVADOC	 Specify the version when the Mojo was added to the API. Similar to Javadoc since. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
since	TokenNameIdentifier	 since
;	TokenNameSEMICOLON	
/** Reference the invocation phase of the Mojo */	TokenNameCOMMENT_JAVADOC	 Reference the invocation phase of the Mojo 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
executePhase	TokenNameIdentifier	 execute Phase
;	TokenNameSEMICOLON	
/** Reference the invocation goal of the Mojo */	TokenNameCOMMENT_JAVADOC	 Reference the invocation goal of the Mojo 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
executeGoal	TokenNameIdentifier	 execute Goal
;	TokenNameSEMICOLON	
/** Reference the invocation lifecycle of the Mojo */	TokenNameCOMMENT_JAVADOC	 Reference the invocation lifecycle of the Mojo 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
executeLifecycle	TokenNameIdentifier	 execute Lifecycle
;	TokenNameSEMICOLON	
/** Specify the version when the Mojo was deprecated to the API. Similar to Javadoc deprecated. */	TokenNameCOMMENT_JAVADOC	 Specify the version when the Mojo was deprecated to the API. Similar to Javadoc deprecated. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
deprecated	TokenNameIdentifier	 deprecated
;	TokenNameSEMICOLON	
/** By default, no need to aggregate the Maven project and its child modules */	TokenNameCOMMENT_JAVADOC	 By default, no need to aggregate the Maven project and its child modules 
private	TokenNameprivate	
boolean	TokenNameboolean	
aggregator	TokenNameIdentifier	 aggregator
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
/** Specify the required dependencies in a specified scope */	TokenNameCOMMENT_JAVADOC	 Specify the required dependencies in a specified scope 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
dependencyResolutionRequired	TokenNameIdentifier	 dependency Resolution Required
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The scope of (transitive) dependencies that should be collected but not resolved. */	TokenNameCOMMENT_JAVADOC	 The scope of (transitive) dependencies that should be collected but not resolved. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
dependencyCollectionRequired	TokenNameIdentifier	 dependency Collection Required
;	TokenNameSEMICOLON	
/** By default, the Mojo needs a Maven project to be executed */	TokenNameCOMMENT_JAVADOC	 By default, the Mojo needs a Maven project to be executed 
private	TokenNameprivate	
boolean	TokenNameboolean	
projectRequired	TokenNameIdentifier	 project Required
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** By default, the Mojo is assumed to work offline as well */	TokenNameCOMMENT_JAVADOC	 By default, the Mojo is assumed to work offline as well 
private	TokenNameprivate	
boolean	TokenNameboolean	
onlineRequired	TokenNameIdentifier	 online Required
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Plugin configuration */	TokenNameCOMMENT_JAVADOC	 Plugin configuration 
private	TokenNameprivate	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
mojoConfiguration	TokenNameIdentifier	 mojo Configuration
;	TokenNameSEMICOLON	
/** Plugin descriptor */	TokenNameCOMMENT_JAVADOC	 Plugin descriptor 
private	TokenNameprivate	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
;	TokenNameSEMICOLON	
/** By default, the Mojo is inherited */	TokenNameCOMMENT_JAVADOC	 By default, the Mojo is inherited 
private	TokenNameprivate	
boolean	TokenNameboolean	
inheritedByDefault	TokenNameIdentifier	 inherited By Default
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** By default, the Mojo could not be invoke directly */	TokenNameCOMMENT_JAVADOC	 By default, the Mojo could not be invoke directly 
private	TokenNameprivate	
boolean	TokenNameboolean	
directInvocationOnly	TokenNameIdentifier	 direct Invocation Only
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** By default, the Mojo don't need reports to run */	TokenNameCOMMENT_JAVADOC	 By default, the Mojo don't need reports to run 
private	TokenNameprivate	
boolean	TokenNameboolean	
requiresReports	TokenNameIdentifier	 requires Reports
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** By default, mojos are not threadsafe */	TokenNameCOMMENT_JAVADOC	 By default, mojos are not threadsafe 
private	TokenNameprivate	
boolean	TokenNameboolean	
threadSafe	TokenNameIdentifier	 thread Safe
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setInstantiationStrategy	TokenNameIdentifier	 set Instantiation Strategy
(	TokenNameLPAREN	
DEFAULT_INSTANTIATION_STRATEGY	TokenNameIdentifier	 DEFAULT  INSTANTIATION  STRATEGY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setComponentFactory	TokenNameIdentifier	 set Component Factory
(	TokenNameLPAREN	
DEFAULT_LANGUAGE	TokenNameIdentifier	 DEFAULT  LANGUAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
/** * @return the language of this Mojo, i.e. <code>java</code> */	TokenNameCOMMENT_JAVADOC	 @return the language of this Mojo, i.e. <code>java</code> 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getComponentFactory	TokenNameIdentifier	 get Component Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param language the new language */	TokenNameCOMMENT_JAVADOC	 @param language the new language 
public	TokenNamepublic	
void	TokenNamevoid	
setLanguage	TokenNameIdentifier	 set Language
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setComponentFactory	TokenNameIdentifier	 set Component Factory
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return <code>true</code> if the Mojo is deprecated, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @return <code>true</code> if the Mojo is deprecated, <code>false</code> otherwise. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDeprecated	TokenNameIdentifier	 get Deprecated
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deprecated	TokenNameIdentifier	 deprecated
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param deprecated <code>true</code> to deprecate the Mojo, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @param deprecated <code>true</code> to deprecate the Mojo, <code>false</code> otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
setDeprecated	TokenNameIdentifier	 set Deprecated
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
deprecated	TokenNameIdentifier	 deprecated
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
deprecated	TokenNameIdentifier	 deprecated
=	TokenNameEQUAL	
deprecated	TokenNameIdentifier	 deprecated
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the list of parameters */	TokenNameCOMMENT_JAVADOC	 @return the list of parameters 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param parameters the new list of parameters * @throws DuplicateParameterException if any */	TokenNameCOMMENT_JAVADOC	 @param parameters the new list of parameters @throws DuplicateParameterException if any 
public	TokenNamepublic	
void	TokenNamevoid	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
throws	TokenNamethrows	
DuplicateParameterException	TokenNameIdentifier	 Duplicate Parameter Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Parameter	TokenNameIdentifier	 Parameter
parameter	TokenNameIdentifier	 parameter
:	TokenNameCOLON	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addParameter	TokenNameIdentifier	 add Parameter
(	TokenNameLPAREN	
parameter	TokenNameIdentifier	 parameter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param parameter add a new parameter * @throws DuplicateParameterException if any */	TokenNameCOMMENT_JAVADOC	 @param parameter add a new parameter @throws DuplicateParameterException if any 
public	TokenNamepublic	
void	TokenNamevoid	
addParameter	TokenNameIdentifier	 add Parameter
(	TokenNameLPAREN	
Parameter	TokenNameIdentifier	 Parameter
parameter	TokenNameIdentifier	 parameter
)	TokenNameRPAREN	
throws	TokenNamethrows	
DuplicateParameterException	TokenNameIdentifier	 Duplicate Parameter Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
parameter	TokenNameIdentifier	 parameter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DuplicateParameterException	TokenNameIdentifier	 Duplicate Parameter Exception
(	TokenNameLPAREN	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" has been declared multiple times in mojo with goal: "	TokenNameStringLiteral	 has been declared multiple times in mojo with goal: 
+	TokenNamePLUS	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" (implementation: "	TokenNameStringLiteral	 (implementation: 
+	TokenNamePLUS	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
parameter	TokenNameIdentifier	 parameter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the list parameters as a Map */	TokenNameCOMMENT_JAVADOC	 @return the list parameters as a Map 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
getParameterMap	TokenNameIdentifier	 get Parameter Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parameterMap	TokenNameIdentifier	 parameter Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameterMap	TokenNameIdentifier	 parameter Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Parameter	TokenNameIdentifier	 Parameter
pd	TokenNameIdentifier	 pd
:	TokenNameCOLON	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameterMap	TokenNameIdentifier	 parameter Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pd	TokenNameIdentifier	 pd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
parameterMap	TokenNameIdentifier	 parameter Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Dependency requirement 	TokenNameCOMMENT_LINE	Dependency requirement 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
/** * @param requiresDependencyResolution the new required dependencies in a specified scope */	TokenNameCOMMENT_JAVADOC	 @param requiresDependencyResolution the new required dependencies in a specified scope 
public	TokenNamepublic	
void	TokenNamevoid	
setDependencyResolutionRequired	TokenNameIdentifier	 set Dependency Resolution Required
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
requiresDependencyResolution	TokenNameIdentifier	 requires Dependency Resolution
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dependencyResolutionRequired	TokenNameIdentifier	 dependency Resolution Required
=	TokenNameEQUAL	
requiresDependencyResolution	TokenNameIdentifier	 requires Dependency Resolution
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDependencyResolutionRequired	TokenNameIdentifier	 get Dependency Resolution Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dependencyResolutionRequired	TokenNameIdentifier	 dependency Resolution Required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the required dependencies in a specified scope * @TODO the name is not intelligible */	TokenNameCOMMENT_JAVADOC	 @return the required dependencies in a specified scope @TODO the name is not intelligible 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
String	TokenNameIdentifier	 String
isDependencyResolutionRequired	TokenNameIdentifier	 is Dependency Resolution Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dependencyResolutionRequired	TokenNameIdentifier	 dependency Resolution Required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDependencyCollectionRequired	TokenNameIdentifier	 set Dependency Collection Required
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
requiresDependencyCollection	TokenNameIdentifier	 requires Dependency Collection
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dependencyCollectionRequired	TokenNameIdentifier	 dependency Collection Required
=	TokenNameEQUAL	
requiresDependencyCollection	TokenNameIdentifier	 requires Dependency Collection
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the scope of (transitive) dependencies that should be collected. Dependency collection refers to the process * of calculating the complete dependency tree in terms of artifact coordinates. In contrast to dependency * resolution, this does not include the download of the files for the dependency artifacts. * * @return The scope of (transitive) dependencies that should be collected or {@code null} if none. */	TokenNameCOMMENT_JAVADOC	 Gets the scope of (transitive) dependencies that should be collected. Dependency collection refers to the process of calculating the complete dependency tree in terms of artifact coordinates. In contrast to dependency resolution, this does not include the download of the files for the dependency artifacts. * @return The scope of (transitive) dependencies that should be collected or {@code null} if none. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDependencyCollectionRequired	TokenNameIdentifier	 get Dependency Collection Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dependencyCollectionRequired	TokenNameIdentifier	 dependency Collection Required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Project requirement 	TokenNameCOMMENT_LINE	Project requirement 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
/** * @param requiresProject <code>true</code> if the Mojo needs a Maven project to be executed, <code>false</code> * otherwise. */	TokenNameCOMMENT_JAVADOC	 @param requiresProject <code>true</code> if the Mojo needs a Maven project to be executed, <code>false</code> otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
setProjectRequired	TokenNameIdentifier	 set Project Required
(	TokenNameLPAREN	
boolean	TokenNameboolean	
requiresProject	TokenNameIdentifier	 requires Project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
projectRequired	TokenNameIdentifier	 project Required
=	TokenNameEQUAL	
requiresProject	TokenNameIdentifier	 requires Project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return <code>true</code> if the Mojo needs a Maven project to be executed, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @return <code>true</code> if the Mojo needs a Maven project to be executed, <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isProjectRequired	TokenNameIdentifier	 is Project Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectRequired	TokenNameIdentifier	 project Required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
// Online vs. Offline requirement 	TokenNameCOMMENT_LINE	Online vs. Offline requirement 
// ---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
/** * @param requiresOnline <code>true</code> if the Mojo is online, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @param requiresOnline <code>true</code> if the Mojo is online, <code>false</code> otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
setOnlineRequired	TokenNameIdentifier	 set Online Required
(	TokenNameLPAREN	
boolean	TokenNameboolean	
requiresOnline	TokenNameIdentifier	 requires Online
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
onlineRequired	TokenNameIdentifier	 online Required
=	TokenNameEQUAL	
requiresOnline	TokenNameIdentifier	 requires Online
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return <code>true</code> if the Mojo is online, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @return <code>true</code> if the Mojo is online, <code>false</code> otherwise. 
// blech! this isn't even intelligible as a method name. provided for 	TokenNameCOMMENT_LINE	blech! this isn't even intelligible as a method name. provided for 
// consistency... 	TokenNameCOMMENT_LINE	consistency... 
public	TokenNamepublic	
boolean	TokenNameboolean	
isOnlineRequired	TokenNameIdentifier	 is Online Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
onlineRequired	TokenNameIdentifier	 online Required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return <code>true</code> if the Mojo is online, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @return <code>true</code> if the Mojo is online, <code>false</code> otherwise. 
// more english-friendly method...keep the code clean! :) 	TokenNameCOMMENT_LINE	more english-friendly method...keep the code clean! :) 
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresOnline	TokenNameIdentifier	 requires Online
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
onlineRequired	TokenNameIdentifier	 online Required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the binded phase name of the Mojo */	TokenNameCOMMENT_JAVADOC	 @return the binded phase name of the Mojo 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
phase	TokenNameIdentifier	 phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param phase the new binded phase name of the Mojo */	TokenNameCOMMENT_JAVADOC	 @param phase the new binded phase name of the Mojo 
public	TokenNamepublic	
void	TokenNamevoid	
setPhase	TokenNameIdentifier	 set Phase
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
phase	TokenNameIdentifier	 phase
=	TokenNameEQUAL	
phase	TokenNameIdentifier	 phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the version when the Mojo was added to the API */	TokenNameCOMMENT_JAVADOC	 @return the version when the Mojo was added to the API 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSince	TokenNameIdentifier	 get Since
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
since	TokenNameIdentifier	 since
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param since the new version when the Mojo was added to the API */	TokenNameCOMMENT_JAVADOC	 @param since the new version when the Mojo was added to the API 
public	TokenNamepublic	
void	TokenNamevoid	
setSince	TokenNameIdentifier	 set Since
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
since	TokenNameIdentifier	 since
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
since	TokenNameIdentifier	 since
=	TokenNameEQUAL	
since	TokenNameIdentifier	 since
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The goal name of the Mojo */	TokenNameCOMMENT_JAVADOC	 @return The goal name of the Mojo 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
goal	TokenNameIdentifier	 goal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param goal The new goal name of the Mojo */	TokenNameCOMMENT_JAVADOC	 @param goal The new goal name of the Mojo 
public	TokenNamepublic	
void	TokenNamevoid	
setGoal	TokenNameIdentifier	 set Goal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
goal	TokenNameIdentifier	 goal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
goal	TokenNameIdentifier	 goal
=	TokenNameEQUAL	
goal	TokenNameIdentifier	 goal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the invocation phase of the Mojo */	TokenNameCOMMENT_JAVADOC	 @return the invocation phase of the Mojo 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExecutePhase	TokenNameIdentifier	 get Execute Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
executePhase	TokenNameIdentifier	 execute Phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param executePhase the new invocation phase of the Mojo */	TokenNameCOMMENT_JAVADOC	 @param executePhase the new invocation phase of the Mojo 
public	TokenNamepublic	
void	TokenNamevoid	
setExecutePhase	TokenNameIdentifier	 set Execute Phase
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
executePhase	TokenNameIdentifier	 execute Phase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
executePhase	TokenNameIdentifier	 execute Phase
=	TokenNameEQUAL	
executePhase	TokenNameIdentifier	 execute Phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return <code>true</code> if the Mojo uses <code>always</code> for the <code>executionStrategy</code> */	TokenNameCOMMENT_JAVADOC	 @return <code>true</code> if the Mojo uses <code>always</code> for the <code>executionStrategy</code> 
public	TokenNamepublic	
boolean	TokenNameboolean	
alwaysExecute	TokenNameIdentifier	 always Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MULTI_PASS_EXEC_STRATEGY	TokenNameIdentifier	 MULTI  PASS  EXEC  STRATEGY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
executionStrategy	TokenNameIdentifier	 execution Strategy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the execution strategy */	TokenNameCOMMENT_JAVADOC	 @return the execution strategy 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExecutionStrategy	TokenNameIdentifier	 get Execution Strategy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
executionStrategy	TokenNameIdentifier	 execution Strategy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param executionStrategy the new execution strategy */	TokenNameCOMMENT_JAVADOC	 @param executionStrategy the new execution strategy 
public	TokenNamepublic	
void	TokenNamevoid	
setExecutionStrategy	TokenNameIdentifier	 set Execution Strategy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
executionStrategy	TokenNameIdentifier	 execution Strategy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
executionStrategy	TokenNameIdentifier	 execution Strategy
=	TokenNameEQUAL	
executionStrategy	TokenNameIdentifier	 execution Strategy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the mojo configuration */	TokenNameCOMMENT_JAVADOC	 @return the mojo configuration 
public	TokenNamepublic	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
getMojoConfiguration	TokenNameIdentifier	 get Mojo Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mojoConfiguration	TokenNameIdentifier	 mojo Configuration
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mojoConfiguration	TokenNameIdentifier	 mojo Configuration
=	TokenNameEQUAL	
new	TokenNamenew	
XmlPlexusConfiguration	TokenNameIdentifier	 Xml Plexus Configuration
(	TokenNameLPAREN	
"configuration"	TokenNameStringLiteral	configuration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
mojoConfiguration	TokenNameIdentifier	 mojo Configuration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param mojoConfiguration a new mojo configuration */	TokenNameCOMMENT_JAVADOC	 @param mojoConfiguration a new mojo configuration 
public	TokenNamepublic	
void	TokenNamevoid	
setMojoConfiguration	TokenNameIdentifier	 set Mojo Configuration
(	TokenNameLPAREN	
PlexusConfiguration	TokenNameIdentifier	 Plexus Configuration
mojoConfiguration	TokenNameIdentifier	 mojo Configuration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mojoConfiguration	TokenNameIdentifier	 mojo Configuration
=	TokenNameEQUAL	
mojoConfiguration	TokenNameIdentifier	 mojo Configuration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRole	TokenNameIdentifier	 get Role
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Mojo	TokenNameIdentifier	 Mojo
.	TokenNameDOT	
ROLE	TokenNameIdentifier	 ROLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRoleHint	TokenNameIdentifier	 get Role Hint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the id of the mojo, based on the goal name */	TokenNameCOMMENT_JAVADOC	 @return the id of the mojo, based on the goal name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the full goal name * @see PluginDescriptor#getGoalPrefix() * @see #getGoal() */	TokenNameCOMMENT_JAVADOC	 @return the full goal name @see PluginDescriptor#getGoalPrefix() @see #getGoal() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFullGoalName	TokenNameIdentifier	 get Full Goal Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGoalPrefix	TokenNameIdentifier	 get Goal Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getComponentType	TokenNameIdentifier	 get Component Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MAVEN_PLUGIN	TokenNameIdentifier	 MAVEN  PLUGIN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the plugin descriptor */	TokenNameCOMMENT_JAVADOC	 @return the plugin descriptor 
public	TokenNamepublic	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param pluginDescriptor the new plugin descriptor */	TokenNameCOMMENT_JAVADOC	 @param pluginDescriptor the new plugin descriptor 
public	TokenNamepublic	
void	TokenNamevoid	
setPluginDescriptor	TokenNameIdentifier	 set Plugin Descriptor
(	TokenNameLPAREN	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
=	TokenNameEQUAL	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return <code>true</code> if the Mojo is herited, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @return <code>true</code> if the Mojo is herited, <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInheritedByDefault	TokenNameIdentifier	 is Inherited By Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inheritedByDefault	TokenNameIdentifier	 inherited By Default
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param inheritedByDefault <code>true</code> if the Mojo is herited, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @param inheritedByDefault <code>true</code> if the Mojo is herited, <code>false</code> otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
setInheritedByDefault	TokenNameIdentifier	 set Inherited By Default
(	TokenNameLPAREN	
boolean	TokenNameboolean	
inheritedByDefault	TokenNameIdentifier	 inherited By Default
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inheritedByDefault	TokenNameIdentifier	 inherited By Default
=	TokenNameEQUAL	
inheritedByDefault	TokenNameIdentifier	 inherited By Default
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
instanceof	TokenNameinstanceof	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
)	TokenNameRPAREN	
object	TokenNameIdentifier	 object
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
compareObjects	TokenNameIdentifier	 compare Objects
(	TokenNameLPAREN	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
compareObjects	TokenNameIdentifier	 compare Objects
(	TokenNameLPAREN	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
compareObjects	TokenNameIdentifier	 compare Objects
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
second	TokenNameIdentifier	 second
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
goal	TokenNameIdentifier	 goal
=	TokenNameEQUAL	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
goal	TokenNameIdentifier	 goal
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
goal	TokenNameIdentifier	 goal
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pd	TokenNameIdentifier	 pd
=	TokenNameEQUAL	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pd	TokenNameIdentifier	 pd
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
-=	TokenNameMINUS_EQUAL	
pd	TokenNameIdentifier	 pd
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the invocation lifecycle of the Mojo */	TokenNameCOMMENT_JAVADOC	 @return the invocation lifecycle of the Mojo 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExecuteLifecycle	TokenNameIdentifier	 get Execute Lifecycle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
executeLifecycle	TokenNameIdentifier	 execute Lifecycle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param executeLifecycle the new invocation lifecycle of the Mojo */	TokenNameCOMMENT_JAVADOC	 @param executeLifecycle the new invocation lifecycle of the Mojo 
public	TokenNamepublic	
void	TokenNamevoid	
setExecuteLifecycle	TokenNameIdentifier	 set Execute Lifecycle
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
executeLifecycle	TokenNameIdentifier	 execute Lifecycle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
executeLifecycle	TokenNameIdentifier	 execute Lifecycle
=	TokenNameEQUAL	
executeLifecycle	TokenNameIdentifier	 execute Lifecycle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param aggregator <code>true</code> if the Mojo uses the Maven project and its child modules, * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @param aggregator <code>true</code> if the Mojo uses the Maven project and its child modules, <code>false</code> otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
setAggregator	TokenNameIdentifier	 set Aggregator
(	TokenNameLPAREN	
boolean	TokenNameboolean	
aggregator	TokenNameIdentifier	 aggregator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
aggregator	TokenNameIdentifier	 aggregator
=	TokenNameEQUAL	
aggregator	TokenNameIdentifier	 aggregator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return <code>true</code> if the Mojo uses the Maven project and its child modules, * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @return <code>true</code> if the Mojo uses the Maven project and its child modules, <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAggregator	TokenNameIdentifier	 is Aggregator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aggregator	TokenNameIdentifier	 aggregator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return <code>true</code> if the Mojo could not be invoke directly, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @return <code>true</code> if the Mojo could not be invoke directly, <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDirectInvocationOnly	TokenNameIdentifier	 is Direct Invocation Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
directInvocationOnly	TokenNameIdentifier	 direct Invocation Only
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param directInvocationOnly <code>true</code> if the Mojo could not be invoke directly, * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @param directInvocationOnly <code>true</code> if the Mojo could not be invoke directly, <code>false</code> otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
setDirectInvocationOnly	TokenNameIdentifier	 set Direct Invocation Only
(	TokenNameLPAREN	
boolean	TokenNameboolean	
directInvocationOnly	TokenNameIdentifier	 direct Invocation Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
directInvocationOnly	TokenNameIdentifier	 direct Invocation Only
=	TokenNameEQUAL	
directInvocationOnly	TokenNameIdentifier	 direct Invocation Only
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return <code>true</code> if the Mojo needs reports to run, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @return <code>true</code> if the Mojo needs reports to run, <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isRequiresReports	TokenNameIdentifier	 is Requires Reports
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
requiresReports	TokenNameIdentifier	 requires Reports
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param requiresReports <code>true</code> if the Mojo needs reports to run, <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 @param requiresReports <code>true</code> if the Mojo needs reports to run, <code>false</code> otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
setRequiresReports	TokenNameIdentifier	 set Requires Reports
(	TokenNameLPAREN	
boolean	TokenNameboolean	
requiresReports	TokenNameIdentifier	 requires Reports
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
requiresReports	TokenNameIdentifier	 requires Reports
=	TokenNameEQUAL	
requiresReports	TokenNameIdentifier	 requires Reports
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param executeGoal the new invocation goal of the Mojo */	TokenNameCOMMENT_JAVADOC	 @param executeGoal the new invocation goal of the Mojo 
public	TokenNamepublic	
void	TokenNamevoid	
setExecuteGoal	TokenNameIdentifier	 set Execute Goal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
executeGoal	TokenNameIdentifier	 execute Goal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
executeGoal	TokenNameIdentifier	 execute Goal
=	TokenNameEQUAL	
executeGoal	TokenNameIdentifier	 execute Goal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the invocation goal of the Mojo */	TokenNameCOMMENT_JAVADOC	 @return the invocation goal of the Mojo 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExecuteGoal	TokenNameIdentifier	 get Execute Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
executeGoal	TokenNameIdentifier	 execute Goal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return True if the <code>Mojo</code> is thread-safe and can be run safely in parallel */	TokenNameCOMMENT_JAVADOC	 @return True if the <code>Mojo</code> is thread-safe and can be run safely in parallel 
public	TokenNamepublic	
boolean	TokenNameboolean	
isThreadSafe	TokenNameIdentifier	 is Thread Safe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
threadSafe	TokenNameIdentifier	 thread Safe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param threadSafe indicates that the mojo is thread-safe and can be run safely in parallel */	TokenNameCOMMENT_JAVADOC	 @param threadSafe indicates that the mojo is thread-safe and can be run safely in parallel 
public	TokenNamepublic	
void	TokenNamevoid	
setThreadSafe	TokenNameIdentifier	 set Thread Safe
(	TokenNameLPAREN	
boolean	TokenNameboolean	
threadSafe	TokenNameIdentifier	 thread Safe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
threadSafe	TokenNameIdentifier	 thread Safe
=	TokenNameEQUAL	
threadSafe	TokenNameIdentifier	 thread Safe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return {@code true} if this mojo forks either a goal or the lifecycle, {@code false} otherwise. */	TokenNameCOMMENT_JAVADOC	 @return {@code true} if this mojo forks either a goal or the lifecycle, {@code false} otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isForking	TokenNameIdentifier	 is Forking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
getExecuteGoal	TokenNameIdentifier	 get Execute Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
getExecuteGoal	TokenNameIdentifier	 get Execute Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
getExecutePhase	TokenNameIdentifier	 get Execute Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
getExecutePhase	TokenNameIdentifier	 get Execute Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a shallow copy of this mojo descriptor. */	TokenNameCOMMENT_JAVADOC	 Creates a shallow copy of this mojo descriptor. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
