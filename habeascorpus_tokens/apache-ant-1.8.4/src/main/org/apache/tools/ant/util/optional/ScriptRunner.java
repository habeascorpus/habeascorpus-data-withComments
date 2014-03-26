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
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bsf	TokenNameIdentifier	 bsf
.	TokenNameDOT	
BSFException	TokenNameIdentifier	 BSF Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bsf	TokenNameIdentifier	 bsf
.	TokenNameDOT	
BSFManager	TokenNameIdentifier	 BSF Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bsf	TokenNameIdentifier	 bsf
.	TokenNameDOT	
BSFEngine	TokenNameIdentifier	 BSF Engine
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
Hashtable	TokenNameIdentifier	 Hashtable
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ReflectUtil	TokenNameIdentifier	 Reflect Util
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
/** * This class is used to run BSF scripts * */	TokenNameCOMMENT_JAVADOC	 This class is used to run BSF scripts 
public	TokenNamepublic	
class	TokenNameclass	
ScriptRunner	TokenNameIdentifier	 Script Runner
extends	TokenNameextends	
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
{	TokenNameLBRACE	
// Register Groovy ourselves, since BSF did not 	TokenNameCOMMENT_LINE	Register Groovy ourselves, since BSF did not 
// natively support it in versions previous to 1.2.4. 	TokenNameCOMMENT_LINE	natively support it in versions previous to 1.2.4. 
static	TokenNamestatic	
{	TokenNameLBRACE	
BSFManager	TokenNameIdentifier	 BSF Manager
.	TokenNameDOT	
registerScriptingEngine	TokenNameIdentifier	 register Scripting Engine
(	TokenNameLPAREN	
"groovy"	TokenNameStringLiteral	groovy
,	TokenNameCOMMA	
"org.codehaus.groovy.bsf.GroovyEngine"	TokenNameStringLiteral	org.codehaus.groovy.bsf.GroovyEngine
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"groovy"	TokenNameStringLiteral	groovy
,	TokenNameCOMMA	
"gy"	TokenNameStringLiteral	gy
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
BSFEngine	TokenNameIdentifier	 BSF Engine
engine	TokenNameIdentifier	 engine
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BSFManager	TokenNameIdentifier	 BSF Manager
manager	TokenNameIdentifier	 manager
;	TokenNameSEMICOLON	
/** * Get the name of the manager prefix. * @return "bsf" */	TokenNameCOMMENT_JAVADOC	 Get the name of the manager prefix. @return "bsf" 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getManagerName	TokenNameIdentifier	 get Manager Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"bsf"	TokenNameStringLiteral	bsf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if bsf supports the language. * @return true if bsf can create an engine for this language. */	TokenNameCOMMENT_JAVADOC	 Check if bsf supports the language. @return true if bsf can create an engine for this language. 
public	TokenNamepublic	
boolean	TokenNameboolean	
supportsLanguage	TokenNameIdentifier	 supports Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
ReflectUtil	TokenNameIdentifier	 Reflect Util
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
new	TokenNamenew	
BSFManager	TokenNameIdentifier	 BSF Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"registeredEngines"	TokenNameStringLiteral	registeredEngines
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
engineClassName	TokenNameIdentifier	 engine Class Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
engineClassName	TokenNameIdentifier	 engine Class Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"This is no BSF engine class for language '"	TokenNameStringLiteral	This is no BSF engine class for language '
+	TokenNamePLUS	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
getScriptClassLoader	TokenNameIdentifier	 get Script Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
engineClassName	TokenNameIdentifier	 engine Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"unable to create BSF engine class for language '"	TokenNameStringLiteral	unable to create BSF engine class for language '
+	TokenNamePLUS	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Do the work. * * @param execName the name that will be passed to BSF for this script execution. * @exception BuildException if something goes wrong executing the script. */	TokenNameCOMMENT_JAVADOC	 Do the work. * @param execName the name that will be passed to BSF for this script execution. @exception BuildException if something goes wrong executing the script. 
public	TokenNamepublic	
void	TokenNamevoid	
executeScript	TokenNameIdentifier	 execute Script
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
execName	TokenNameIdentifier	 exec Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
checkLanguage	TokenNameIdentifier	 check Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLoader	TokenNameIdentifier	 Class Loader
origLoader	TokenNameIdentifier	 orig Loader
=	TokenNameEQUAL	
replaceContextLoader	TokenNameIdentifier	 replace Context Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
BSFManager	TokenNameIdentifier	 BSF Manager
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
createManager	TokenNameIdentifier	 create Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
declareBeans	TokenNameIdentifier	 declare Beans
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// execute the script 	TokenNameCOMMENT_LINE	execute the script 
if	TokenNameif	
(	TokenNameLPAREN	
engine	TokenNameIdentifier	 engine
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
exec	TokenNameIdentifier	 exec
(	TokenNameLPAREN	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
execName	TokenNameIdentifier	 exec Name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getScript	TokenNameIdentifier	 get Script
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
exec	TokenNameIdentifier	 exec
(	TokenNameLPAREN	
execName	TokenNameIdentifier	 exec Name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getScript	TokenNameIdentifier	 get Script
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BSFException	TokenNameIdentifier	 BSF Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
getBuildException	TokenNameIdentifier	 get Build Exception
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
restoreContextLoader	TokenNameIdentifier	 restore Context Loader
(	TokenNameLPAREN	
origLoader	TokenNameIdentifier	 orig Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Evaluate the script. * * @param execName the name that will be passed to BSF for this script execution. * @return the result of the evaluation * @exception BuildException if something goes wrong executing the script. */	TokenNameCOMMENT_JAVADOC	 Evaluate the script. * @param execName the name that will be passed to BSF for this script execution. @return the result of the evaluation @exception BuildException if something goes wrong executing the script. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluateScript	TokenNameIdentifier	 evaluate Script
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
execName	TokenNameIdentifier	 exec Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
checkLanguage	TokenNameIdentifier	 check Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLoader	TokenNameIdentifier	 Class Loader
origLoader	TokenNameIdentifier	 orig Loader
=	TokenNameEQUAL	
replaceContextLoader	TokenNameIdentifier	 replace Context Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
BSFManager	TokenNameIdentifier	 BSF Manager
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
createManager	TokenNameIdentifier	 create Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
declareBeans	TokenNameIdentifier	 declare Beans
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// execute the script 	TokenNameCOMMENT_LINE	execute the script 
if	TokenNameif	
(	TokenNameLPAREN	
engine	TokenNameIdentifier	 engine
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
execName	TokenNameIdentifier	 exec Name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getScript	TokenNameIdentifier	 get Script
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
execName	TokenNameIdentifier	 exec Name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getScript	TokenNameIdentifier	 get Script
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BSFException	TokenNameIdentifier	 BSF Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
getBuildException	TokenNameIdentifier	 get Build Exception
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
restoreContextLoader	TokenNameIdentifier	 restore Context Loader
(	TokenNameLPAREN	
origLoader	TokenNameIdentifier	 orig Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get/create a BuildException from a BSFException. * @param be BSFException to convert. * @return BuildException the converted exception. */	TokenNameCOMMENT_JAVADOC	 Get/create a BuildException from a BSFException. @param be BSFException to convert. @return BuildException the converted exception. 
private	TokenNameprivate	
BuildException	TokenNameIdentifier	 Build Exception
getBuildException	TokenNameIdentifier	 get Build Exception
(	TokenNameLPAREN	
BSFException	TokenNameIdentifier	 BSF Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
be	TokenNameIdentifier	 be
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
instanceof	TokenNameinstanceof	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
declareBeans	TokenNameIdentifier	 declare Beans
(	TokenNameLPAREN	
BSFManager	TokenNameIdentifier	 BSF Manager
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
throws	TokenNamethrows	
BSFException	TokenNameIdentifier	 BSF Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
getBeans	TokenNameIdentifier	 get Beans
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getBeans	TokenNameIdentifier	 get Beans
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
declareBean	TokenNameIdentifier	 declare Bean
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// BSF uses a hashtable to store values 	TokenNameCOMMENT_LINE	BSF uses a hashtable to store values 
// so cannot declareBean with a null value 	TokenNameCOMMENT_LINE	so cannot declareBean with a null value 
// So need to remove any bean of this name as 	TokenNameCOMMENT_LINE	So need to remove any bean of this name as 
// that bean should not be visible 	TokenNameCOMMENT_LINE	that bean should not be visible 
m	TokenNameIdentifier	 m
.	TokenNameDOT	
undeclareBean	TokenNameIdentifier	 undeclare Bean
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
BSFManager	TokenNameIdentifier	 BSF Manager
createManager	TokenNameIdentifier	 create Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BSFException	TokenNameIdentifier	 BSF Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
manager	TokenNameIdentifier	 manager
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
manager	TokenNameIdentifier	 manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
BSFManager	TokenNameIdentifier	 BSF Manager
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
BSFManager	TokenNameIdentifier	 BSF Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setClassLoader	TokenNameIdentifier	 set Class Loader
(	TokenNameLPAREN	
getScriptClassLoader	TokenNameIdentifier	 get Script Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getKeepEngine	TokenNameIdentifier	 get Keep Engine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BSFEngine	TokenNameIdentifier	 BSF Engine
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
loadScriptingEngine	TokenNameIdentifier	 load Scripting Engine
(	TokenNameLPAREN	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
manager	TokenNameIdentifier	 manager
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
