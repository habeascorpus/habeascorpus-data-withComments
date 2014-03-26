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
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
;	TokenNameSEMICOLON	
/** * This class is used to run scripts using JSR 223. * @since Ant 1.7.0 */	TokenNameCOMMENT_JAVADOC	 This class is used to run scripts using JSR 223. @since Ant 1.7.0 
public	TokenNamepublic	
class	TokenNameclass	
JavaxScriptRunner	TokenNameIdentifier	 Javax Script Runner
extends	TokenNameextends	
ScriptRunnerBase	TokenNameIdentifier	 Script Runner Base
{	TokenNameLBRACE	
private	TokenNameprivate	
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
engine	TokenNameIdentifier	 engine
;	TokenNameSEMICOLON	
/** * Get the name of the manager prefix. * @return "javax" */	TokenNameCOMMENT_JAVADOC	 Get the name of the manager prefix. @return "javax" 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getManagerName	TokenNameIdentifier	 get Manager Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"javax"	TokenNameStringLiteral	javax
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
supportsLanguage	TokenNameIdentifier	 supports Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
engine	TokenNameIdentifier	 engine
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
createEngine	TokenNameIdentifier	 create Engine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
/** * Do the work to run the script. * * @param execName the name that will be passed to the * scripting engine for this script execution. * * @exception BuildException if someting goes wrong exectuing the script. */	TokenNameCOMMENT_JAVADOC	 Do the work to run the script. * @param execName the name that will be passed to the scripting engine for this script execution. * @exception BuildException if someting goes wrong exectuing the script. 
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
evaluateScript	TokenNameIdentifier	 evaluate Script
(	TokenNameLPAREN	
execName	TokenNameIdentifier	 exec Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do the work to eval the script. * * @param execName the name that will be passed to the * scripting engine for this script execution. * @return the result of the evaluation * @exception BuildException if something goes wrong executing the script. */	TokenNameCOMMENT_JAVADOC	 Do the work to eval the script. * @param execName the name that will be passed to the scripting engine for this script execution. @return the result of the evaluation @exception BuildException if something goes wrong executing the script. 
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
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
engine	TokenNameIdentifier	 engine
=	TokenNameEQUAL	
createEngine	TokenNameIdentifier	 create Engine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
engine	TokenNameIdentifier	 engine
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to create javax script engine for "	TokenNameStringLiteral	Unable to create javax script engine for 
+	TokenNamePLUS	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
"FX"	TokenNameStringLiteral	FX
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
"put"	TokenNameStringLiteral	put
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
"put"	TokenNameStringLiteral	put
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// execute the script 	TokenNameCOMMENT_LINE	execute the script 
return	TokenNamereturn	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
"eval"	TokenNameStringLiteral	eval
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
getScript	TokenNameIdentifier	 get Script
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//catch and rethrow build exceptions 	TokenNameCOMMENT_LINE	catch and rethrow build exceptions 
// this may be a BuildException wrapping a ScriptException 	TokenNameCOMMENT_LINE	this may be a BuildException wrapping a ScriptException 
// deeply wrapping yet another BuildException - for 	TokenNameCOMMENT_LINE	deeply wrapping yet another BuildException - for 
// example because of self.fail() - see 	TokenNameCOMMENT_LINE	example because of self.fail() - see 
// https://issues.apache.org/bugzilla/show_bug.cgi?id=47509 	TokenNameCOMMENT_LINE	https://issues.apache.org/bugzilla/show_bug.cgi?id=47509 
throw	TokenNamethrow	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//any other exception? Get its cause 	TokenNameCOMMENT_LINE	any other exception? Get its cause 
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
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
instanceof	TokenNameinstanceof	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
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
private	TokenNameprivate	
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
createEngine	TokenNameIdentifier	 create Engine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
engine	TokenNameIdentifier	 engine
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
engine	TokenNameIdentifier	 engine
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
manager	TokenNameIdentifier	 manager
=	TokenNameEQUAL	
new	TokenNamenew	
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"javax.script.ScriptEngineManager"	TokenNameStringLiteral	javax.script.ScriptEngineManager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
"getEngineByName"	TokenNameStringLiteral	getEngineByName
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
ReflectWrapper	TokenNameIdentifier	 Reflect Wrapper
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getKeepEngine	TokenNameIdentifier	 get Keep Engine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse a Throwable's cause(s) and return the BuildException * most deeply nested into it - if any. */	TokenNameCOMMENT_JAVADOC	 Traverse a Throwable's cause(s) and return the BuildException most deeply nested into it - if any. 
private	TokenNameprivate	
static	TokenNamestatic	
BuildException	TokenNameIdentifier	 Build Exception
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BuildException	TokenNameIdentifier	 Build Exception
deepest	TokenNameIdentifier	 deepest
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
BuildException	TokenNameIdentifier	 Build Exception
?	TokenNameQUESTION	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
instanceof	TokenNameinstanceof	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deepest	TokenNameIdentifier	 deepest
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
deepest	TokenNameIdentifier	 deepest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
