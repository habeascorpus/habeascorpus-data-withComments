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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
Java	TokenNameIdentifier	 Java
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
.	TokenNameDOT	
JspMangler	TokenNameIdentifier	 Jsp Mangler
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
/** * The implementation of the jasper compiler. * This is a cut-and-paste of the original Jspc task. * * @since ant1.5 */	TokenNameCOMMENT_JAVADOC	 The implementation of the jasper compiler. This is a cut-and-paste of the original Jspc task. * @since ant1.5 
public	TokenNamepublic	
class	TokenNameclass	
JasperC	TokenNameIdentifier	 Jasper C
extends	TokenNameextends	
DefaultJspCompilerAdapter	TokenNameIdentifier	 Default Jsp Compiler Adapter
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * what produces java classes from .jsp files */	TokenNameCOMMENT_JAVADOC	 what produces java classes from .jsp files 
JspMangler	TokenNameIdentifier	 Jsp Mangler
mangler	TokenNameIdentifier	 mangler
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Constructor for JasperC. * @param mangler a filename converter */	TokenNameCOMMENT_JAVADOC	 Constructor for JasperC. @param mangler a filename converter 
public	TokenNamepublic	
JasperC	TokenNameIdentifier	 Jasper C
(	TokenNameLPAREN	
JspMangler	TokenNameIdentifier	 Jsp Mangler
mangler	TokenNameIdentifier	 mangler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mangler	TokenNameIdentifier	 mangler
=	TokenNameEQUAL	
mangler	TokenNameIdentifier	 mangler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Our execute method. * @return true if successful * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Our execute method. @return true if successful @throws BuildException on error 
public	TokenNamepublic	
boolean	TokenNameboolean	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
getJspc	TokenNameIdentifier	 get Jspc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Using jasper compiler"	TokenNameStringLiteral	Using jasper compiler
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommandlineJava	TokenNameIdentifier	 Commandline Java
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
setupJasperCommand	TokenNameIdentifier	 setup Jasper Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Create an instance of the compiler, redirecting output to 	TokenNameCOMMENT_LINE	Create an instance of the compiler, redirecting output to 
// the project log 	TokenNameCOMMENT_LINE	the project log 
Java	TokenNameIdentifier	 Java
java	TokenNameIdentifier	 java
=	TokenNameEQUAL	
new	TokenNamenew	
Java	TokenNameIdentifier	 Java
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Path	TokenNameIdentifier	 Path
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getJspc	TokenNameIdentifier	 get Jspc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"using user supplied classpath: "	TokenNameStringLiteral	using user supplied classpath: 
+	TokenNamePLUS	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"using system classpath: "	TokenNameStringLiteral	using system classpath: 
+	TokenNamePLUS	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
"org.apache.jasper.JspC"	TokenNameStringLiteral	org.apache.jasper.JspC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//this is really irritating; we need a way to set stuff 	TokenNameCOMMENT_LINE	this is really irritating; we need a way to set stuff 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getJavaCommand	TokenNameIdentifier	 get Java Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getArguments	TokenNameIdentifier	 get Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
setFailonerror	TokenNameIdentifier	 set Failonerror
(	TokenNameLPAREN	
getJspc	TokenNameIdentifier	 get Jspc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFailonerror	TokenNameIdentifier	 get Failonerror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//we are forking here to be sure that if JspC calls 	TokenNameCOMMENT_LINE	we are forking here to be sure that if JspC calls 
//System.exit() it doesn't halt the build 	TokenNameCOMMENT_LINE	System.exit() it doesn't halt the build 
java	TokenNameIdentifier	 java
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
"jasperc"	TokenNameStringLiteral	jasperc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
instanceof	TokenNameinstanceof	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
)	TokenNameRPAREN	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Error running jsp compiler: "	TokenNameStringLiteral	Error running jsp compiler: 
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
,	TokenNameCOMMA	
getJspc	TokenNameIdentifier	 get Jspc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
getJspc	TokenNameIdentifier	 get Jspc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
deleteEmptyJavaFiles	TokenNameIdentifier	 delete Empty Java Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * build up a command line * @return a command line for jasper */	TokenNameCOMMENT_JAVADOC	 build up a command line @return a command line for jasper 
private	TokenNameprivate	
CommandlineJava	TokenNameIdentifier	 Commandline Java
setupJasperCommand	TokenNameIdentifier	 setup Jasper Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CommandlineJava	TokenNameIdentifier	 Commandline Java
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
new	TokenNamenew	
CommandlineJava	TokenNameIdentifier	 Commandline Java
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JspC	TokenNameIdentifier	 Jsp C
jspc	TokenNameIdentifier	 jspc
=	TokenNameEQUAL	
getJspc	TokenNameIdentifier	 get Jspc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-d"	TokenNameStringLiteral	-d
,	TokenNameCOMMA	
jspc	TokenNameIdentifier	 jspc
.	TokenNameDOT	
getDestdir	TokenNameIdentifier	 get Destdir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-p"	TokenNameStringLiteral	-p
,	TokenNameCOMMA	
jspc	TokenNameIdentifier	 jspc
.	TokenNameDOT	
getPackage	TokenNameIdentifier	 get Package
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isTomcat5x	TokenNameIdentifier	 is Tomcat5x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-v"	TokenNameStringLiteral	-v
+	TokenNamePLUS	
jspc	TokenNameIdentifier	 jspc
.	TokenNameDOT	
getVerbose	TokenNameIdentifier	 get Verbose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"this task doesn't support Tomcat 5.x properly, "	TokenNameStringLiteral	this task doesn't support Tomcat 5.x properly, 
+	TokenNamePLUS	
"please use the Tomcat provided jspc task "	TokenNameStringLiteral	please use the Tomcat provided jspc task 
+	TokenNamePLUS	
"instead"	TokenNameStringLiteral	instead
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-uriroot"	TokenNameStringLiteral	-uriroot
,	TokenNameCOMMA	
jspc	TokenNameIdentifier	 jspc
.	TokenNameDOT	
getUriroot	TokenNameIdentifier	 get Uriroot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-uribase"	TokenNameStringLiteral	-uribase
,	TokenNameCOMMA	
jspc	TokenNameIdentifier	 jspc
.	TokenNameDOT	
getUribase	TokenNameIdentifier	 get Uribase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-ieplugin"	TokenNameStringLiteral	-ieplugin
,	TokenNameCOMMA	
jspc	TokenNameIdentifier	 jspc
.	TokenNameDOT	
getIeplugin	TokenNameIdentifier	 get Ieplugin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-webinc"	TokenNameStringLiteral	-webinc
,	TokenNameCOMMA	
jspc	TokenNameIdentifier	 jspc
.	TokenNameDOT	
getWebinc	TokenNameIdentifier	 get Webinc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-webxml"	TokenNameStringLiteral	-webxml
,	TokenNameCOMMA	
jspc	TokenNameIdentifier	 jspc
.	TokenNameDOT	
getWebxml	TokenNameIdentifier	 get Webxml
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-die9"	TokenNameStringLiteral	-die9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
jspc	TokenNameIdentifier	 jspc
.	TokenNameDOT	
isMapped	TokenNameIdentifier	 is Mapped
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-mapped"	TokenNameStringLiteral	-mapped
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
jspc	TokenNameIdentifier	 jspc
.	TokenNameDOT	
getWebApp	TokenNameIdentifier	 get Web App
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
jspc	TokenNameIdentifier	 jspc
.	TokenNameDOT	
getWebApp	TokenNameIdentifier	 get Web App
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-webapp"	TokenNameStringLiteral	-webapp
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logAndAddFilesToCompile	TokenNameIdentifier	 log And Add Files To Compile
(	TokenNameLPAREN	
getJspc	TokenNameIdentifier	 get Jspc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getJspc	TokenNameIdentifier	 get Jspc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCompileList	TokenNameIdentifier	 get Compile List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cmd	TokenNameIdentifier	 cmd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return an instance of the mangler this compiler uses */	TokenNameCOMMENT_JAVADOC	 @return an instance of the mangler this compiler uses 
public	TokenNamepublic	
JspMangler	TokenNameIdentifier	 Jsp Mangler
createMangler	TokenNameIdentifier	 create Mangler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mangler	TokenNameIdentifier	 mangler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.6.2 
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getJspc	TokenNameIdentifier	 get Jspc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
concatSystemClasspath	TokenNameIdentifier	 concat System Classpath
(	TokenNameLPAREN	
"only"	TokenNameStringLiteral	only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
concatSystemClasspath	TokenNameIdentifier	 concat System Classpath
(	TokenNameLPAREN	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.6.2 
private	TokenNameprivate	
boolean	TokenNameboolean	
isTomcat5x	TokenNameIdentifier	 is Tomcat5x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
"org.apache.jasper.tagplugins.jstl.If"	TokenNameStringLiteral	org.apache.jasper.tagplugins.jstl.If
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
