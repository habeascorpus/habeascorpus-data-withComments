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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
TokenFilter	TokenNameIdentifier	 Token Filter
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
/** * Most of this is CAP (Cut And Paste) from the Script task * ScriptFilter class, implements TokenFilter.Filter * for scripts to use. * This provides the same beans as the Script Task * to a script. * The script is meant to use get self.token and * set self.token in the reply. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Most of this is CAP (Cut And Paste) from the Script task ScriptFilter class, implements TokenFilter.Filter for scripts to use. This provides the same beans as the Script Task to a script. The script is meant to use get self.token and set self.token in the reply. * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
ScriptFilter	TokenNameIdentifier	 Script Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
.	TokenNameDOT	
ChainableReaderFilter	TokenNameIdentifier	 Chainable Reader Filter
{	TokenNameLBRACE	
/** script runner helper */	TokenNameCOMMENT_JAVADOC	 script runner helper 
private	TokenNameprivate	
ScriptRunnerHelper	TokenNameIdentifier	 Script Runner Helper
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
new	TokenNamenew	
ScriptRunnerHelper	TokenNameIdentifier	 Script Runner Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** script runner. */	TokenNameCOMMENT_JAVADOC	 script runner. 
private	TokenNameprivate	
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
runner	TokenNameIdentifier	 runner
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** the token used by the script */	TokenNameCOMMENT_JAVADOC	 the token used by the script 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
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
/** * Initialize. * * @exception BuildException if someting goes wrong */	TokenNameCOMMENT_JAVADOC	 Initialize. * @exception BuildException if someting goes wrong 
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
/** * The current token * * @param token the string filtered by the script */	TokenNameCOMMENT_JAVADOC	 The current token * @param token the string filtered by the script 
public	TokenNamepublic	
void	TokenNamevoid	
setToken	TokenNameIdentifier	 set Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The current token * * @return the string filtered by the script */	TokenNameCOMMENT_JAVADOC	 The current token * @return the string filtered by the script 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called filter the token. * This sets the token in this object, calls * the script and returns the token. * * @param token the token to be filtered * @return the filtered token */	TokenNameCOMMENT_JAVADOC	 Called filter the token. This sets the token in this object, calls the script and returns the token. * @param token the token to be filtered @return the filtered token 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setToken	TokenNameIdentifier	 set Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
executeScript	TokenNameIdentifier	 execute Script
(	TokenNameLPAREN	
"ant_filter"	TokenNameStringLiteral	ant_filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getToken	TokenNameIdentifier	 get Token
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
/** * Set the setbeans attribute. * If this is true, &lt;script&gt; will create variables in the * script instance for all * properties, targets and references of the current project. * It this is false, only the project and self variables will * be set. * The default is true. * @param setBeans the value to set. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Set the setbeans attribute. If this is true, &lt;script&gt; will create variables in the script instance for all properties, targets and references of the current project. It this is false, only the project and self variables will be set. The default is true. @param setBeans the value to set. @since Ant 1.8.0 
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
}	TokenNameRBRACE	
