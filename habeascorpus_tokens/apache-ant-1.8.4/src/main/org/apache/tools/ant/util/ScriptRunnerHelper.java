/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
ProjectComponent	TokenNameIdentifier	 Project Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Path	TokenNameIdentifier	 Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Reference	TokenNameIdentifier	 Reference
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
ResourceCollection	TokenNameIdentifier	 Resource Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
Union	TokenNameIdentifier	 Union
;	TokenNameSEMICOLON	
/** * A class to help in creating, setting and getting script runners. */	TokenNameCOMMENT_JAVADOC	 A class to help in creating, setting and getting script runners. 
public	TokenNamepublic	
class	TokenNameclass	
ScriptRunnerHelper	TokenNameIdentifier	 Script Runner Helper
{	TokenNameLBRACE	
private	TokenNameprivate	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
.	TokenNameDOT	
Delegate	TokenNameIdentifier	 Delegate
cpDelegate	TokenNameIdentifier	 cp Delegate
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
srcFile	TokenNameIdentifier	 src File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
manager	TokenNameIdentifier	 manager
=	TokenNameEQUAL	
"auto"	TokenNameStringLiteral	auto
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
setBeans	TokenNameIdentifier	 set Beans
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ProjectComponent	TokenNameIdentifier	 Project Component
projectComponent	TokenNameIdentifier	 project Component
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ClassLoader	TokenNameIdentifier	 Class Loader
scriptLoader	TokenNameIdentifier	 script Loader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Union	TokenNameIdentifier	 Union
resources	TokenNameIdentifier	 resources
=	TokenNameEQUAL	
new	TokenNamenew	
Union	TokenNameIdentifier	 Union
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the project component associated with this helper. * @param component the project component that owns this helper. */	TokenNameCOMMENT_JAVADOC	 Set the project component associated with this helper. @param component the project component that owns this helper. 
public	TokenNamepublic	
void	TokenNamevoid	
setProjectComponent	TokenNameIdentifier	 set Project Component
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
projectComponent	TokenNameIdentifier	 project Component
=	TokenNameEQUAL	
component	TokenNameIdentifier	 component
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create and set text on a script. * @return the created or reused script runner. */	TokenNameCOMMENT_JAVADOC	 Create and set text on a script. @return the created or reused script runner. 
public	TokenNamepublic	
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
getScriptRunner	TokenNameIdentifier	 get Script Runner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
runner	TokenNameIdentifier	 runner
=	TokenNameEQUAL	
getRunner	TokenNameIdentifier	 get Runner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcFile	TokenNameIdentifier	 src File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
srcFile	TokenNameIdentifier	 src File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resources	TokenNameIdentifier	 resources
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
loadResources	TokenNameIdentifier	 load Resources
(	TokenNameLPAREN	
resources	TokenNameIdentifier	 resources
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
setBeans	TokenNameIdentifier	 set Beans
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
bindToComponent	TokenNameIdentifier	 bind To Component
(	TokenNameLPAREN	
projectComponent	TokenNameIdentifier	 project Component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
bindToComponentMinimum	TokenNameIdentifier	 bind To Component Minimum
(	TokenNameLPAREN	
projectComponent	TokenNameIdentifier	 project Component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
runner	TokenNameIdentifier	 runner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Classpath to be used when searching for classes and resources. * * @return an empty Path instance to be configured by Ant. */	TokenNameCOMMENT_JAVADOC	 Classpath to be used when searching for classes and resources. * @return an empty Path instance to be configured by Ant. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClassPathDelegate	TokenNameIdentifier	 get Class Path Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the classpath to be used when searching for classes and resources. * * @param classpath an Ant Path object containing the search path. */	TokenNameCOMMENT_JAVADOC	 Set the classpath to be used when searching for classes and resources. * @param classpath an Ant Path object containing the search path. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getClassPathDelegate	TokenNameIdentifier	 get Class Path Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the classpath by reference. * * @param r a Reference to a Path instance to be used as the classpath * value. */	TokenNameCOMMENT_JAVADOC	 Set the classpath by reference. * @param r a Reference to a Path instance to be used as the classpath value. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspathRef	TokenNameIdentifier	 set Classpath Ref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getClassPathDelegate	TokenNameIdentifier	 get Class Path Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setClasspathref	TokenNameIdentifier	 set Classpathref
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Load the script from an external file ; optional. * * @param file the file containing the script source. */	TokenNameCOMMENT_JAVADOC	 Load the script from an external file ; optional. * @param file the file containing the script source. 
public	TokenNamepublic	
void	TokenNamevoid	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
srcFile	TokenNameIdentifier	 src File
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add script text. * * @param text a component of the script text to be added. */	TokenNameCOMMENT_JAVADOC	 Add script text. * @param text a component of the script text to be added. 
public	TokenNamepublic	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Defines the script manager - defaults to "auto". * * @param manager the scripting manager - "bsf" or "javax" or "auto" */	TokenNameCOMMENT_JAVADOC	 Defines the script manager - defaults to "auto". * @param manager the scripting manager - "bsf" or "javax" or "auto" 
public	TokenNamepublic	
void	TokenNamevoid	
setManager	TokenNameIdentifier	 set Manager
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
manager	TokenNameIdentifier	 manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
manager	TokenNameIdentifier	 manager
=	TokenNameEQUAL	
manager	TokenNameIdentifier	 manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Defines the language (required). * * @param language the scripting language name for the script. */	TokenNameCOMMENT_JAVADOC	 Defines the language (required). * @param language the scripting language name for the script. 
public	TokenNamepublic	
void	TokenNamevoid	
setLanguage	TokenNameIdentifier	 set Language
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
language	TokenNameIdentifier	 language
=	TokenNameEQUAL	
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the language. * @return the scripting language. */	TokenNameCOMMENT_JAVADOC	 Get the language. @return the scripting language. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the setbeans attribute. * If this is true, &lt;script&gt; will create variables in the * script instance for all * properties, targets and references of the current project. * It this is false, only the project and self variables will * be set. * The default is true. * @param setBeans the value to set. */	TokenNameCOMMENT_JAVADOC	 Set the setbeans attribute. If this is true, &lt;script&gt; will create variables in the script instance for all properties, targets and references of the current project. It this is false, only the project and self variables will be set. The default is true. @param setBeans the value to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setSetBeans	TokenNameIdentifier	 set Set Beans
(	TokenNameLPAREN	
boolean	TokenNameboolean	
setBeans	TokenNameIdentifier	 set Beans
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setBeans	TokenNameIdentifier	 set Beans
=	TokenNameEQUAL	
setBeans	TokenNameIdentifier	 set Beans
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used when called by scriptdef. * @param loader the loader used by scriptdef. */	TokenNameCOMMENT_JAVADOC	 Used when called by scriptdef. @param loader the loader used by scriptdef. 
public	TokenNamepublic	
void	TokenNamevoid	
setClassLoader	TokenNameIdentifier	 set Class Loader
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scriptLoader	TokenNameIdentifier	 script Loader
=	TokenNameEQUAL	
loader	TokenNameIdentifier	 loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
ClassLoader	TokenNameIdentifier	 Class Loader
generateClassLoader	TokenNameIdentifier	 generate Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scriptLoader	TokenNameIdentifier	 script Loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scriptLoader	TokenNameIdentifier	 script Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cpDelegate	TokenNameIdentifier	 cp Delegate
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scriptLoader	TokenNameIdentifier	 script Loader
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
scriptLoader	TokenNameIdentifier	 script Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scriptLoader	TokenNameIdentifier	 script Loader
=	TokenNameEQUAL	
cpDelegate	TokenNameIdentifier	 cp Delegate
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
scriptLoader	TokenNameIdentifier	 script Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
.	TokenNameDOT	
Delegate	TokenNameIdentifier	 Delegate
getClassPathDelegate	TokenNameIdentifier	 get Class Path Delegate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cpDelegate	TokenNameIdentifier	 cp Delegate
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cpDelegate	TokenNameIdentifier	 cp Delegate
=	TokenNameEQUAL	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
.	TokenNameDOT	
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
projectComponent	TokenNameIdentifier	 project Component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cpDelegate	TokenNameIdentifier	 cp Delegate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a script runner. */	TokenNameCOMMENT_JAVADOC	 Get a script runner. 
private	TokenNameprivate	
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
getRunner	TokenNameIdentifier	 get Runner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ScriptRunnerCreator	TokenNameIdentifier	 Script Runner Creator
(	TokenNameLPAREN	
projectComponent	TokenNameIdentifier	 project Component
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createRunner	TokenNameIdentifier	 create Runner
(	TokenNameLPAREN	
manager	TokenNameIdentifier	 manager
,	TokenNameCOMMA	
language	TokenNameIdentifier	 language
,	TokenNameCOMMA	
generateClassLoader	TokenNameIdentifier	 generate Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add any source resource. * * @param resource source of script * @since Ant 1.7.1 */	TokenNameCOMMENT_JAVADOC	 Add any source resource. * @param resource source of script @since Ant 1.7.1 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
