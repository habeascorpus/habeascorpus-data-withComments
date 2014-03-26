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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
.	TokenNameDOT	
compilers	TokenNameIdentifier	 compilers
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
.	TokenNameDOT	
JspC	TokenNameIdentifier	 Jsp C
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
CommandlineJava	TokenNameIdentifier	 Commandline Java
;	TokenNameSEMICOLON	
/** * This is the default implementation for the JspCompilerAdapter interface. * This is currently very light on the ground since only one compiler type is * supported. * */	TokenNameCOMMENT_JAVADOC	 This is the default implementation for the JspCompilerAdapter interface. This is currently very light on the ground since only one compiler type is supported. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DefaultJspCompilerAdapter	TokenNameIdentifier	 Default Jsp Compiler Adapter
implements	TokenNameimplements	
JspCompilerAdapter	TokenNameIdentifier	 Jsp Compiler Adapter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
lSep	TokenNameIdentifier	 l Sep
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Logs the compilation parameters, adds the files to compile and logs the * &quot;niceSourceList&quot; * @param jspc the compiler task for logging * @param compileList the list of files to compile * @param cmd the command line used */	TokenNameCOMMENT_JAVADOC	 Logs the compilation parameters, adds the files to compile and logs the &quot;niceSourceList&quot; @param jspc the compiler task for logging @param compileList the list of files to compile @param cmd the command line used 
protected	TokenNameprotected	
void	TokenNamevoid	
logAndAddFilesToCompile	TokenNameIdentifier	 log And Add Files To Compile
(	TokenNameLPAREN	
JspC	TokenNameIdentifier	 Jsp C
jspc	TokenNameIdentifier	 jspc
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
compileList	TokenNameIdentifier	 compile List
,	TokenNameCOMMA	
CommandlineJava	TokenNameIdentifier	 Commandline Java
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jspc	TokenNameIdentifier	 jspc
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Compilation "	TokenNameStringLiteral	Compilation 
+	TokenNamePLUS	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
describeJavaCommand	TokenNameIdentifier	 describe Java Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
niceSourceList	TokenNameIdentifier	 nice Source List
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"File"	TokenNameStringLiteral	File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compileList	TokenNameIdentifier	 compile List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
niceSourceList	TokenNameIdentifier	 nice Source List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"s"	TokenNameStringLiteral	s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
niceSourceList	TokenNameIdentifier	 nice Source List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" to be compiled:"	TokenNameStringLiteral	 to be compiled:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
niceSourceList	TokenNameIdentifier	 nice Source List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lSep	TokenNameIdentifier	 l Sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
compileList	TokenNameIdentifier	 compile List
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
niceSourceList	TokenNameIdentifier	 nice Source List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
niceSourceList	TokenNameIdentifier	 nice Source List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
niceSourceList	TokenNameIdentifier	 nice Source List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lSep	TokenNameIdentifier	 l Sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
jspc	TokenNameIdentifier	 jspc
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
niceSourceList	TokenNameIdentifier	 nice Source List
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * our owner */	TokenNameCOMMENT_JAVADOC	 our owner 
protected	TokenNameprotected	
JspC	TokenNameIdentifier	 Jsp C
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * set the owner * @param owner the owner JspC compiler */	TokenNameCOMMENT_JAVADOC	 set the owner @param owner the owner JspC compiler 
public	TokenNamepublic	
void	TokenNamevoid	
setJspc	TokenNameIdentifier	 set Jspc
(	TokenNameLPAREN	
JspC	TokenNameIdentifier	 Jsp C
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
owner	TokenNameIdentifier	 owner
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the owner * @return the owner; should never be null */	TokenNameCOMMENT_JAVADOC	 get the owner @return the owner; should never be null 
public	TokenNamepublic	
JspC	TokenNameIdentifier	 Jsp C
getJspc	TokenNameIdentifier	 get Jspc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add an argument oneple to the argument list, if the value aint null * @param cmd the command line * @param argument The argument */	TokenNameCOMMENT_JAVADOC	 add an argument oneple to the argument list, if the value aint null @param cmd the command line @param argument The argument 
protected	TokenNameprotected	
void	TokenNamevoid	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
CommandlineJava	TokenNameIdentifier	 Commandline Java
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * add an argument tuple to the argument list, if the value aint null * @param cmd the command line * @param argument The argument * @param value the parameter */	TokenNameCOMMENT_JAVADOC	 add an argument tuple to the argument list, if the value aint null @param cmd the command line @param argument The argument @param value the parameter 
protected	TokenNameprotected	
void	TokenNamevoid	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
CommandlineJava	TokenNameIdentifier	 Commandline Java
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
argument	TokenNameIdentifier	 argument
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * add an argument tuple to the arg list, if the file parameter aint null * @param cmd the command line * @param argument The argument * @param file the parameter */	TokenNameCOMMENT_JAVADOC	 add an argument tuple to the arg list, if the file parameter aint null @param cmd the command line @param argument The argument @param file the parameter 
protected	TokenNameprotected	
void	TokenNamevoid	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
CommandlineJava	TokenNameIdentifier	 Commandline Java
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
argument	TokenNameIdentifier	 argument
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * ask if compiler can sort out its own dependencies * @return true if the compiler wants to do its own * depends */	TokenNameCOMMENT_JAVADOC	 ask if compiler can sort out its own dependencies @return true if the compiler wants to do its own depends 
public	TokenNamepublic	
boolean	TokenNameboolean	
implementsOwnDependencyChecking	TokenNameIdentifier	 implements Own Dependency Checking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get our project * @return owner project data */	TokenNameCOMMENT_JAVADOC	 get our project @return owner project data 
public	TokenNamepublic	
Project	TokenNameIdentifier	 Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getJspc	TokenNameIdentifier	 get Jspc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
