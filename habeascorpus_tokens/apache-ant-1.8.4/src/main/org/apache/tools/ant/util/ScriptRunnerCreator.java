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
/** * This is a helper class used by ScriptRunnerHelper to * create a ScriptRunner based on a classloader and on a language. */	TokenNameCOMMENT_JAVADOC	 This is a helper class used by ScriptRunnerHelper to create a ScriptRunner based on a classloader and on a language. 
public	TokenNamepublic	
class	TokenNameclass	
ScriptRunnerCreator	TokenNameIdentifier	 Script Runner Creator
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
AUTO	TokenNameIdentifier	 AUTO
=	TokenNameEQUAL	
"auto"	TokenNameStringLiteral	auto
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OATAU	TokenNameIdentifier	 OATAU
=	TokenNameEQUAL	
"org.apache.tools.ant.util"	TokenNameStringLiteral	org.apache.tools.ant.util
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UTIL_OPT	TokenNameIdentifier	 UTIL  OPT
=	TokenNameEQUAL	
OATAU	TokenNameIdentifier	 OATAU
+	TokenNamePLUS	
".optional"	TokenNameStringLiteral	.optional
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BSF	TokenNameIdentifier	 BSF
=	TokenNameEQUAL	
"bsf"	TokenNameStringLiteral	bsf
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BSF_PACK	TokenNameIdentifier	 BSF  PACK
=	TokenNameEQUAL	
"org.apache.bsf"	TokenNameStringLiteral	org.apache.bsf
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BSF_MANAGER	TokenNameIdentifier	 BSF  MANAGER
=	TokenNameEQUAL	
BSF_PACK	TokenNameIdentifier	 BSF  PACK
+	TokenNamePLUS	
".BSFManager"	TokenNameStringLiteral	.BSFManager
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BSF_RUNNER	TokenNameIdentifier	 BSF  RUNNER
=	TokenNameEQUAL	
UTIL_OPT	TokenNameIdentifier	 UTIL  OPT
+	TokenNamePLUS	
".ScriptRunner"	TokenNameStringLiteral	.ScriptRunner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVAX	TokenNameIdentifier	 JAVAX
=	TokenNameEQUAL	
"javax"	TokenNameStringLiteral	javax
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVAX_MANAGER	TokenNameIdentifier	 JAVAX  MANAGER
=	TokenNameEQUAL	
"javax.script.ScriptEngineManager"	TokenNameStringLiteral	javax.script.ScriptEngineManager
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVAX_RUNNER	TokenNameIdentifier	 JAVAX  RUNNER
=	TokenNameEQUAL	
UTIL_OPT	TokenNameIdentifier	 UTIL  OPT
+	TokenNamePLUS	
".JavaxScriptRunner"	TokenNameStringLiteral	.JavaxScriptRunner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
manager	TokenNameIdentifier	 manager
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ClassLoader	TokenNameIdentifier	 Class Loader
scriptLoader	TokenNameIdentifier	 script Loader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructor for creator. * @param project the current project. */	TokenNameCOMMENT_JAVADOC	 Constructor for creator. @param project the current project. 
public	TokenNamepublic	
ScriptRunnerCreator	TokenNameIdentifier	 Script Runner Creator
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a ScriptRunner. * @param manager the script manager ("auto" | "bsf" | "javax") * @param language the language. * @param classLoader the classloader to use * @return the created script runner. * @throws BuildException if unable to create the ScriptRunner. */	TokenNameCOMMENT_JAVADOC	 Create a ScriptRunner. @param manager the script manager ("auto" | "bsf" | "javax") @param language the language. @param classLoader the classloader to use @return the created script runner. @throws BuildException if unable to create the ScriptRunner. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
createRunner	TokenNameIdentifier	 create Runner
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
manager	TokenNameIdentifier	 manager
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
classLoader	TokenNameIdentifier	 class Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
manager	TokenNameIdentifier	 manager
=	TokenNameEQUAL	
manager	TokenNameIdentifier	 manager
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
language	TokenNameIdentifier	 language
=	TokenNameEQUAL	
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scriptLoader	TokenNameIdentifier	 script Loader
=	TokenNameEQUAL	
classLoader	TokenNameIdentifier	 class Loader
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"script language must be specified"	TokenNameStringLiteral	script language must be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
AUTO	TokenNameIdentifier	 AUTO
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
JAVAX	TokenNameIdentifier	 JAVAX
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
BSF	TokenNameIdentifier	 BSF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unsupported language prefix "	TokenNameStringLiteral	Unsupported language prefix 
+	TokenNamePLUS	
manager	TokenNameIdentifier	 manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check for bsf first then javax 	TokenNameCOMMENT_LINE	Check for bsf first then javax 
// This version does not check if the scriptManager 	TokenNameCOMMENT_LINE	This version does not check if the scriptManager 
// supports the language. 	TokenNameCOMMENT_LINE	supports the language. 
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
createRunner	TokenNameIdentifier	 create Runner
(	TokenNameLPAREN	
BSF	TokenNameIdentifier	 BSF
,	TokenNameCOMMA	
BSF_MANAGER	TokenNameIdentifier	 BSF  MANAGER
,	TokenNameCOMMA	
BSF_RUNNER	TokenNameIdentifier	 BSF  RUNNER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
createRunner	TokenNameIdentifier	 create Runner
(	TokenNameLPAREN	
JAVAX	TokenNameIdentifier	 JAVAX
,	TokenNameCOMMA	
JAVAX_MANAGER	TokenNameIdentifier	 JAVAX  MANAGER
,	TokenNameCOMMA	
JAVAX_RUNNER	TokenNameIdentifier	 JAVAX  RUNNER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
JAVAX	TokenNameIdentifier	 JAVAX
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
manager	TokenNameIdentifier	 manager
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to load the script engine manager "	TokenNameStringLiteral	Unable to load the script engine manager 
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
JAVAX_MANAGER	TokenNameIdentifier	 JAVAX  MANAGER
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
BSF	TokenNameIdentifier	 BSF
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
manager	TokenNameIdentifier	 manager
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to load the BSF script engine manager "	TokenNameStringLiteral	Unable to load the BSF script engine manager 
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
BSF_MANAGER	TokenNameIdentifier	 BSF  MANAGER
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to load a script engine manager "	TokenNameStringLiteral	Unable to load a script engine manager 
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
BSF_MANAGER	TokenNameIdentifier	 BSF  MANAGER
+	TokenNamePLUS	
" or "	TokenNameStringLiteral	 or 
+	TokenNamePLUS	
JAVAX_MANAGER	TokenNameIdentifier	 JAVAX  MANAGER
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a script runner if the scriptManager matches the passed * in manager. * This checks if the script manager exists in the scriptLoader * classloader and if so it creates and returns the script runner. * @param checkManager check if the manager matchs this value. * @param managerClass the name of the script manager class. * @param runnerClass the name of ant's script runner for this manager. * @return the script runner class. * @throws BuildException if there is a problem creating the runner class. */	TokenNameCOMMENT_JAVADOC	 Create a script runner if the scriptManager matches the passed in manager. This checks if the script manager exists in the scriptLoader classloader and if so it creates and returns the script runner. @param checkManager check if the manager matchs this value. @param managerClass the name of the script manager class. @param runnerClass the name of ant's script runner for this manager. @return the script runner class. @throws BuildException if there is a problem creating the runner class. 
private	TokenNameprivate	
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
createRunner	TokenNameIdentifier	 create Runner
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
checkManager	TokenNameIdentifier	 check Manager
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
managerClass	TokenNameIdentifier	 manager Class
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
runnerClass	TokenNameIdentifier	 runner Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
runner	TokenNameIdentifier	 runner
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
AUTO	TokenNameIdentifier	 AUTO
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
checkManager	TokenNameIdentifier	 check Manager
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scriptLoader	TokenNameIdentifier	 script Loader
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
LoaderUtils	TokenNameIdentifier	 Loader Utils
.	TokenNameDOT	
classNameToResource	TokenNameIdentifier	 class Name To Resource
(	TokenNameLPAREN	
managerClass	TokenNameIdentifier	 manager Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
managerClass	TokenNameIdentifier	 manager Class
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
BSF_MANAGER	TokenNameIdentifier	 BSF  MANAGER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
ScriptFixBSFPath	TokenNameIdentifier	 Script Fix BSF Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fixClassLoader	TokenNameIdentifier	 fix Class Loader
(	TokenNameLPAREN	
scriptLoader	TokenNameIdentifier	 script Loader
,	TokenNameCOMMA	
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
runner	TokenNameIdentifier	 runner
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
)	TokenNameRPAREN	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
runnerClass	TokenNameIdentifier	 runner Class
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
scriptLoader	TokenNameIdentifier	 script Loader
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ReflectUtil	TokenNameIdentifier	 Reflect Util
.	TokenNameDOT	
toBuildException	TokenNameIdentifier	 to Build Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
setLanguage	TokenNameIdentifier	 set Language
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
setScriptClassLoader	TokenNameIdentifier	 set Script Class Loader
(	TokenNameLPAREN	
scriptLoader	TokenNameIdentifier	 script Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
runner	TokenNameIdentifier	 runner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
