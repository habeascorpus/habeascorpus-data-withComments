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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
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
BuildException	TokenNameIdentifier	 Build Exception
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
Project	TokenNameIdentifier	 Project
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
selectors	TokenNameIdentifier	 selectors
.	TokenNameDOT	
BaseSelector	TokenNameIdentifier	 Base Selector
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ScriptRunnerHelper	TokenNameIdentifier	 Script Runner Helper
;	TokenNameSEMICOLON	
/** * Selector that lets you run a script with selection logic inline * @since Ant1.7 */	TokenNameCOMMENT_JAVADOC	 Selector that lets you run a script with selection logic inline @since Ant1.7 
public	TokenNamepublic	
class	TokenNameclass	
ScriptSelector	TokenNameIdentifier	 Script Selector
extends	TokenNameextends	
BaseSelector	TokenNameIdentifier	 Base Selector
{	TokenNameLBRACE	
/** * script runner helper */	TokenNameCOMMENT_JAVADOC	 script runner helper 
private	TokenNameprivate	
ScriptRunnerHelper	TokenNameIdentifier	 Script Runner Helper
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
new	TokenNamenew	
ScriptRunnerHelper	TokenNameIdentifier	 Script Runner Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * script runner */	TokenNameCOMMENT_JAVADOC	 script runner 
private	TokenNameprivate	
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
runner	TokenNameIdentifier	 runner
;	TokenNameSEMICOLON	
/** * fields updated for every selection */	TokenNameCOMMENT_JAVADOC	 fields updated for every selection 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
/** * selected flag */	TokenNameCOMMENT_JAVADOC	 selected flag 
private	TokenNameprivate	
boolean	TokenNameboolean	
selected	TokenNameIdentifier	 selected
;	TokenNameSEMICOLON	
/** * Set the project. * @param project the owner of this component. */	TokenNameCOMMENT_JAVADOC	 Set the project. @param project the owner of this component. 
public	TokenNamepublic	
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
setProjectComponent	TokenNameIdentifier	 set Project Component
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Defines the manager. * * @param manager the scripting manager. */	TokenNameCOMMENT_JAVADOC	 Defines the manager. * @param manager the scripting manager. 
public	TokenNamepublic	
void	TokenNamevoid	
setManager	TokenNameIdentifier	 set Manager
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
manager	TokenNameIdentifier	 manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
setManager	TokenNameIdentifier	 set Manager
(	TokenNameLPAREN	
manager	TokenNameIdentifier	 manager
)	TokenNameRPAREN	
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
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
setLanguage	TokenNameIdentifier	 set Language
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize on demand. * * @throws org.apache.tools.ant.BuildException * if someting goes wrong */	TokenNameCOMMENT_JAVADOC	 Initialize on demand. * @throws org.apache.tools.ant.BuildException if someting goes wrong 
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
runner	TokenNameIdentifier	 runner
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
runner	TokenNameIdentifier	 runner
=	TokenNameEQUAL	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
getScriptRunner	TokenNameIdentifier	 get Script Runner
(	TokenNameLPAREN	
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
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The script text. * * @param text a component of the script text to be added. */	TokenNameCOMMENT_JAVADOC	 The script text. * @param text a component of the script text to be added. 
public	TokenNamepublic	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
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
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
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
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
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
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
setClasspathRef	TokenNameIdentifier	 set Classpath Ref
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
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
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
setSetBeans	TokenNameIdentifier	 set Set Beans
(	TokenNameLPAREN	
setBeans	TokenNameIdentifier	 set Beans
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method that each selector will implement to create their selection * behaviour. If there is a problem with the setup of a selector, it can * throw a BuildException to indicate the problem. * * @param basedir A java.io.File object for the base directory * @param filename The name of the file to check * @param file A File object for this filename * * @return whether the file should be selected or not */	TokenNameCOMMENT_JAVADOC	 Method that each selector will implement to create their selection behaviour. If there is a problem with the setup of a selector, it can throw a BuildException to indicate the problem. * @param basedir A java.io.File object for the base directory @param filename The name of the file to check @param file A File object for this filename * @return whether the file should be selected or not 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
basedir	TokenNameIdentifier	 basedir
=	TokenNameEQUAL	
basedir	TokenNameIdentifier	 basedir
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
addBean	TokenNameIdentifier	 add Bean
(	TokenNameLPAREN	
"basedir"	TokenNameStringLiteral	basedir
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
addBean	TokenNameIdentifier	 add Bean
(	TokenNameLPAREN	
"filename"	TokenNameStringLiteral	filename
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
addBean	TokenNameIdentifier	 add Bean
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
executeScript	TokenNameIdentifier	 execute Script
(	TokenNameLPAREN	
"ant_selector"	TokenNameStringLiteral	ant_selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the base directory * @return the base directory */	TokenNameCOMMENT_JAVADOC	 get the base directory @return the base directory 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
basedir	TokenNameIdentifier	 basedir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the filename of the file * @return the filename of the file that is currently been tested */	TokenNameCOMMENT_JAVADOC	 get the filename of the file @return the filename of the file that is currently been tested 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFilename	TokenNameIdentifier	 get Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the file that is currently to be tested * @return the file that is currently been tested */	TokenNameCOMMENT_JAVADOC	 get the file that is currently to be tested @return the file that is currently been tested 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get state of selected flag * @return the selected flag */	TokenNameCOMMENT_JAVADOC	 get state of selected flag @return the selected flag 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
selected	TokenNameIdentifier	 selected
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set the selected state * Intended for script use, not as an Ant attribute * @param selected the selected state */	TokenNameCOMMENT_JAVADOC	 set the selected state Intended for script use, not as an Ant attribute @param selected the selected state 
public	TokenNamepublic	
void	TokenNamevoid	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
boolean	TokenNameboolean	
selected	TokenNameIdentifier	 selected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
selected	TokenNameIdentifier	 selected
=	TokenNameEQUAL	
selected	TokenNameIdentifier	 selected
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
