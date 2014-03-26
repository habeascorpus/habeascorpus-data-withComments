package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Build	TokenNameIdentifier	 Build
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
Model	TokenNameIdentifier	 Model
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
model	TokenNameIdentifier	 model
.	TokenNameDOT	
PluginManagement	TokenNameIdentifier	 Plugin Management
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
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * A basic bean configuration request. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 A basic bean configuration request. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
implements	TokenNameimplements	
BeanConfigurationRequest	TokenNameIdentifier	 Bean Configuration Request
{	TokenNameLBRACE	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
bean	TokenNameIdentifier	 bean
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
configuration	TokenNameIdentifier	 configuration
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
configurationElement	TokenNameIdentifier	 configuration Element
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ClassLoader	TokenNameIdentifier	 Class Loader
classLoader	TokenNameIdentifier	 class Loader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BeanConfigurationValuePreprocessor	TokenNameIdentifier	 Bean Configuration Value Preprocessor
valuePreprocessor	TokenNameIdentifier	 value Preprocessor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BeanConfigurationPathTranslator	TokenNameIdentifier	 Bean Configuration Path Translator
pathTranslator	TokenNameIdentifier	 path Translator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getBean	TokenNameIdentifier	 get Bean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bean	TokenNameIdentifier	 bean
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
setBean	TokenNameIdentifier	 set Bean
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
bean	TokenNameIdentifier	 bean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bean	TokenNameIdentifier	 bean
=	TokenNameEQUAL	
bean	TokenNameIdentifier	 bean
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
configuration	TokenNameIdentifier	 configuration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getConfigurationElement	TokenNameIdentifier	 get Configuration Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
configurationElement	TokenNameIdentifier	 configuration Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
configuration	TokenNameIdentifier	 configuration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
configuration	TokenNameIdentifier	 configuration
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
configuration	TokenNameIdentifier	 configuration
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
configuration	TokenNameIdentifier	 configuration
=	TokenNameEQUAL	
configuration	TokenNameIdentifier	 configuration
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
configurationElement	TokenNameIdentifier	 configuration Element
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the configuration to the configuration taken from the specified build plugin in the POM. First, the build * plugins will be searched for the specified plugin, if that fails, the plugin management section will be searched. * * @param model The POM to extract the plugin configuration from, may be {@code null}. * @param pluginGroupId The group id of the plugin whose configuration should be used, must not be {@code null} or * empty. * @param pluginArtifactId The artifact id of the plugin whose configuration should be used, must not be * {@code null} or empty. * @param pluginExecutionId The id of a plugin execution whose configuration should be used, may be {@code null} or * empty to use the general plugin configuration. * @return This request for chaining, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the configuration to the configuration taken from the specified build plugin in the POM. First, the build plugins will be searched for the specified plugin, if that fails, the plugin management section will be searched. * @param model The POM to extract the plugin configuration from, may be {@code null}. @param pluginGroupId The group id of the plugin whose configuration should be used, must not be {@code null} or empty. @param pluginArtifactId The artifact id of the plugin whose configuration should be used, must not be {@code null} or empty. @param pluginExecutionId The id of a plugin execution whose configuration should be used, may be {@code null} or empty to use the general plugin configuration. @return This request for chaining, never {@code null}. 
public	TokenNamepublic	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pluginGroupId	TokenNameIdentifier	 plugin Group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pluginExecutionId	TokenNameIdentifier	 plugin Execution Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
findPlugin	TokenNameIdentifier	 find Plugin
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
pluginGroupId	TokenNameIdentifier	 plugin Group Id
,	TokenNameCOMMA	
pluginArtifactId	TokenNameIdentifier	 plugin Artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isNotEmpty	TokenNameIdentifier	 is Not Empty
(	TokenNameLPAREN	
pluginExecutionId	TokenNameIdentifier	 plugin Execution Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
PluginExecution	TokenNameIdentifier	 Plugin Execution
execution	TokenNameIdentifier	 execution
:	TokenNameCOLON	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getExecutions	TokenNameIdentifier	 get Executions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pluginExecutionId	TokenNameIdentifier	 plugin Execution Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Plugin	TokenNameIdentifier	 Plugin
findPlugin	TokenNameIdentifier	 find Plugin
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"group id for plugin has not been specified"	TokenNameStringLiteral	group id for plugin has not been specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"artifact id for plugin has not been specified"	TokenNameStringLiteral	artifact id for plugin has not been specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Build	TokenNameIdentifier	 Build
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getBuild	TokenNameIdentifier	 get Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
:	TokenNameCOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getPlugins	TokenNameIdentifier	 get Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
artifactId	TokenNameIdentifier	 artifact Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
PluginManagement	TokenNameIdentifier	 Plugin Management
mngt	TokenNameIdentifier	 mngt
=	TokenNameEQUAL	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getPluginManagement	TokenNameIdentifier	 get Plugin Management
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mngt	TokenNameIdentifier	 mngt
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
:	TokenNameCOLON	
mngt	TokenNameIdentifier	 mngt
.	TokenNameDOT	
getPlugins	TokenNameIdentifier	 get Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
artifactId	TokenNameIdentifier	 artifact Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ClassLoader	TokenNameIdentifier	 Class Loader
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
classLoader	TokenNameIdentifier	 class Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
setClassLoader	TokenNameIdentifier	 set Class Loader
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
classLoader	TokenNameIdentifier	 class Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classLoader	TokenNameIdentifier	 class Loader
=	TokenNameEQUAL	
classLoader	TokenNameIdentifier	 class Loader
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BeanConfigurationValuePreprocessor	TokenNameIdentifier	 Bean Configuration Value Preprocessor
getValuePreprocessor	TokenNameIdentifier	 get Value Preprocessor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
valuePreprocessor	TokenNameIdentifier	 value Preprocessor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
setValuePreprocessor	TokenNameIdentifier	 set Value Preprocessor
(	TokenNameLPAREN	
BeanConfigurationValuePreprocessor	TokenNameIdentifier	 Bean Configuration Value Preprocessor
valuePreprocessor	TokenNameIdentifier	 value Preprocessor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
valuePreprocessor	TokenNameIdentifier	 value Preprocessor
=	TokenNameEQUAL	
valuePreprocessor	TokenNameIdentifier	 value Preprocessor
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BeanConfigurationPathTranslator	TokenNameIdentifier	 Bean Configuration Path Translator
getPathTranslator	TokenNameIdentifier	 get Path Translator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pathTranslator	TokenNameIdentifier	 path Translator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultBeanConfigurationRequest	TokenNameIdentifier	 Default Bean Configuration Request
setPathTranslator	TokenNameIdentifier	 set Path Translator
(	TokenNameLPAREN	
BeanConfigurationPathTranslator	TokenNameIdentifier	 Bean Configuration Path Translator
pathTranslator	TokenNameIdentifier	 path Translator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pathTranslator	TokenNameIdentifier	 path Translator
=	TokenNameEQUAL	
pathTranslator	TokenNameIdentifier	 path Translator
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
