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
ejb	TokenNameIdentifier	 ejb
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
Task	TokenNameIdentifier	 Task
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
ExecTask	TokenNameIdentifier	 Exec Task
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
/** * Generates a Borland Application Server 4.5 client JAR using as * input the EJB JAR file. * * Two mode are available: java mode (default) and fork mode. With the fork mode, * it is impossible to add classpath to the command line. * * @ant.task name="blgenclient" category="ejb" */	TokenNameCOMMENT_JAVADOC	 Generates a Borland Application Server 4.5 client JAR using as input the EJB JAR file. * Two mode are available: java mode (default) and fork mode. With the fork mode, it is impossible to add classpath to the command line. * @ant.task name="blgenclient" category="ejb" 
public	TokenNamepublic	
class	TokenNameclass	
BorlandGenerateClient	TokenNameIdentifier	 Borland Generate Client
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_MODE	TokenNameIdentifier	 JAVA  MODE
=	TokenNameEQUAL	
"java"	TokenNameStringLiteral	java
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FORK_MODE	TokenNameIdentifier	 FORK  MODE
=	TokenNameEQUAL	
"fork"	TokenNameStringLiteral	fork
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** debug the generateclient task */	TokenNameCOMMENT_JAVADOC	 debug the generateclient task 
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** hold the ejbjar file name */	TokenNameCOMMENT_JAVADOC	 hold the ejbjar file name 
File	TokenNameIdentifier	 File
ejbjarfile	TokenNameIdentifier	 ejbjarfile
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** hold the client jar file name */	TokenNameCOMMENT_JAVADOC	 hold the client jar file name 
File	TokenNameIdentifier	 File
clientjarfile	TokenNameIdentifier	 clientjarfile
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** hold the classpath */	TokenNameCOMMENT_JAVADOC	 hold the classpath 
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
/** hold the mode (java|fork) */	TokenNameCOMMENT_JAVADOC	 hold the mode (java|fork) 
String	TokenNameIdentifier	 String
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
FORK_MODE	TokenNameIdentifier	 FORK  MODE
;	TokenNameSEMICOLON	
/** hold the version */	TokenNameCOMMENT_JAVADOC	 hold the version 
int	TokenNameint	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
BorlandDeploymentTool	TokenNameIdentifier	 Borland Deployment Tool
.	TokenNameDOT	
BAS	TokenNameIdentifier	 BAS
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Set the version attribute. * @param version the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the version attribute. @param version the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Command launching mode: java or fork. * @param s the mode to use. */	TokenNameCOMMENT_JAVADOC	 Command launching mode: java or fork. @param s the mode to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, turn on the debug mode for each of the Borland tools launched. * @param debug a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 If true, turn on the debug mode for each of the Borland tools launched. @param debug a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setDebug	TokenNameIdentifier	 set Debug
(	TokenNameLPAREN	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
debug	TokenNameIdentifier	 debug
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * EJB JAR file. * @param ejbfile the file to use. */	TokenNameCOMMENT_JAVADOC	 EJB JAR file. @param ejbfile the file to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setEjbjar	TokenNameIdentifier	 set Ejbjar
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
ejbfile	TokenNameIdentifier	 ejbfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ejbjarfile	TokenNameIdentifier	 ejbjarfile
=	TokenNameEQUAL	
ejbfile	TokenNameIdentifier	 ejbfile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Client JAR file name. * @param clientjar the file to use. */	TokenNameCOMMENT_JAVADOC	 Client JAR file name. @param clientjar the file to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setClientjar	TokenNameIdentifier	 set Clientjar
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
clientjar	TokenNameIdentifier	 clientjar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clientjarfile	TokenNameIdentifier	 clientjarfile
=	TokenNameEQUAL	
clientjar	TokenNameIdentifier	 clientjar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Path to use for classpath. * @param classpath the path to use. */	TokenNameCOMMENT_JAVADOC	 Path to use for classpath. @param classpath the path to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds path to the classpath. * @return a path to be configured as a nested element. */	TokenNameCOMMENT_JAVADOC	 Adds path to the classpath. @return a path to be configured as a nested element. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reference to existing path, to use as a classpath. * @param r the reference to use. */	TokenNameCOMMENT_JAVADOC	 Reference to existing path, to use as a classpath. @param r the reference to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspathRef	TokenNameIdentifier	 set Classpath Ref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do the work. * * The work is actually done by creating a separate JVM to run a java task. * * @exception BuildException if something goes wrong with the build */	TokenNameCOMMENT_JAVADOC	 Do the work. * The work is actually done by creating a separate JVM to run a java task. * @exception BuildException if something goes wrong with the build 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ejbjarfile	TokenNameIdentifier	 ejbjarfile
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
ejbjarfile	TokenNameIdentifier	 ejbjarfile
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"invalid ejb jar file."	TokenNameStringLiteral	invalid ejb jar file.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clientjarfile	TokenNameIdentifier	 clientjarfile
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
clientjarfile	TokenNameIdentifier	 clientjarfile
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"invalid or missing client jar file."	TokenNameStringLiteral	invalid or missing client jar file.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ejbjarname	TokenNameIdentifier	 ejbjarname
=	TokenNameEQUAL	
ejbjarfile	TokenNameIdentifier	 ejbjarfile
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//clientname = ejbjarfile+client.jar 	TokenNameCOMMENT_LINE	clientname = ejbjarfile+client.jar 
String	TokenNameIdentifier	 String
clientname	TokenNameIdentifier	 clientname
=	TokenNameEQUAL	
ejbjarname	TokenNameIdentifier	 ejbjarname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ejbjarname	TokenNameIdentifier	 ejbjarname
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clientname	TokenNameIdentifier	 clientname
=	TokenNameEQUAL	
clientname	TokenNameIdentifier	 clientname
+	TokenNamePLUS	
"client.jar"	TokenNameStringLiteral	client.jar
;	TokenNameSEMICOLON	
clientjarfile	TokenNameIdentifier	 clientjarfile
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
clientname	TokenNameIdentifier	 clientname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"mode is null default mode is java"	TokenNameStringLiteral	mode is null default mode is java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
JAVA_MODE	TokenNameIdentifier	 JAVA  MODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
BorlandDeploymentTool	TokenNameIdentifier	 Borland Deployment Tool
.	TokenNameDOT	
BES	TokenNameIdentifier	 BES
||	TokenNameOR_OR	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
BorlandDeploymentTool	TokenNameIdentifier	 Borland Deployment Tool
.	TokenNameDOT	
BAS	TokenNameIdentifier	 BAS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"version "	TokenNameStringLiteral	version 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
" is not supported"	TokenNameStringLiteral	 is not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"client jar file is "	TokenNameStringLiteral	client jar file is 
+	TokenNamePLUS	
clientjarfile	TokenNameIdentifier	 clientjarfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
FORK_MODE	TokenNameIdentifier	 FORK  MODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeFork	TokenNameIdentifier	 execute Fork
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
executeJava	TokenNameIdentifier	 execute Java
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end of else 	TokenNameCOMMENT_LINE	end of else 
}	TokenNameRBRACE	
/** * launch the generate client using java api. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 launch the generate client using java api. @throws BuildException if there is an error. 
protected	TokenNameprotected	
void	TokenNamevoid	
executeJava	TokenNameIdentifier	 execute Java
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
BorlandDeploymentTool	TokenNameIdentifier	 Borland Deployment Tool
.	TokenNameDOT	
BES	TokenNameIdentifier	 BES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"java mode is supported only for "	TokenNameStringLiteral	java mode is supported only for 
+	TokenNamePLUS	
"previous version <="	TokenNameStringLiteral	previous version <=
+	TokenNamePLUS	
BorlandDeploymentTool	TokenNameIdentifier	 Borland Deployment Tool
.	TokenNameDOT	
BAS	TokenNameIdentifier	 BAS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"mode : java"	TokenNameStringLiteral	mode : java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Java	TokenNameIdentifier	 Java
execTask	TokenNameIdentifier	 exec Task
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
=	TokenNameEQUAL	
new	TokenNamenew	
Java	TokenNameIdentifier	 Java
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
"com.inprise.server.commandline.EJBUtilities"	TokenNameStringLiteral	com.inprise.server.commandline.EJBUtilities
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//classpath 	TokenNameCOMMENT_LINE	classpath 
//add at the end of the classpath 	TokenNameCOMMENT_LINE	add at the end of the classpath 
//the system classpath in order to find the tools.jar file 	TokenNameCOMMENT_LINE	the system classpath in order to find the tools.jar file 
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
concatSystemClasspath	TokenNameIdentifier	 concat System Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"generateclient"	TokenNameStringLiteral	generateclient
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-trace"	TokenNameStringLiteral	-trace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-short"	TokenNameStringLiteral	-short
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-jarfile"	TokenNameStringLiteral	-jarfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ejb jar file 	TokenNameCOMMENT_LINE	ejb jar file 
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
ejbjarfile	TokenNameIdentifier	 ejbjarfile
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//client jar file 	TokenNameCOMMENT_LINE	client jar file 
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-single"	TokenNameStringLiteral	-single
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-clientjarfile"	TokenNameStringLiteral	-clientjarfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
clientjarfile	TokenNameIdentifier	 clientjarfile
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Calling EJBUtilities"	TokenNameStringLiteral	Calling EJBUtilities
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Have to catch this because of the semantics of calling main() 	TokenNameCOMMENT_LINE	Have to catch this because of the semantics of calling main() 
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Exception while calling generateclient Details: "	TokenNameStringLiteral	Exception while calling generateclient Details: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * launch the generate client using system api. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 launch the generate client using system api. @throws BuildException if there is an error. 
protected	TokenNameprotected	
void	TokenNamevoid	
executeFork	TokenNameIdentifier	 execute Fork
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
BorlandDeploymentTool	TokenNameIdentifier	 Borland Deployment Tool
.	TokenNameDOT	
BAS	TokenNameIdentifier	 BAS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeForkV4	TokenNameIdentifier	 execute Fork V4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
BorlandDeploymentTool	TokenNameIdentifier	 Borland Deployment Tool
.	TokenNameDOT	
BES	TokenNameIdentifier	 BES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeForkV5	TokenNameIdentifier	 execute Fork V5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * launch the generate client using system api. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 launch the generate client using system api. @throws BuildException if there is an error. 
protected	TokenNameprotected	
void	TokenNamevoid	
executeForkV4	TokenNameIdentifier	 execute Fork V4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"mode : fork "	TokenNameStringLiteral	mode : fork 
+	TokenNamePLUS	
BorlandDeploymentTool	TokenNameIdentifier	 Borland Deployment Tool
.	TokenNameDOT	
BAS	TokenNameIdentifier	 BAS
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExecTask	TokenNameIdentifier	 Exec Task
execTask	TokenNameIdentifier	 exec Task
=	TokenNameEQUAL	
new	TokenNamenew	
ExecTask	TokenNameIdentifier	 Exec Task
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
"iastool"	TokenNameStringLiteral	iastool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"generateclient"	TokenNameStringLiteral	generateclient
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-trace"	TokenNameStringLiteral	-trace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-short"	TokenNameStringLiteral	-short
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-jarfile"	TokenNameStringLiteral	-jarfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ejb jar file 	TokenNameCOMMENT_LINE	ejb jar file 
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
ejbjarfile	TokenNameIdentifier	 ejbjarfile
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//client jar file 	TokenNameCOMMENT_LINE	client jar file 
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-single"	TokenNameStringLiteral	-single
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-clientjarfile"	TokenNameStringLiteral	-clientjarfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
clientjarfile	TokenNameIdentifier	 clientjarfile
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Calling iastool"	TokenNameStringLiteral	Calling iastool
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Have to catch this because of the semantics of calling main() 	TokenNameCOMMENT_LINE	Have to catch this because of the semantics of calling main() 
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Exception while calling generateclient Details: "	TokenNameStringLiteral	Exception while calling generateclient Details: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * launch the generate client using system api. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 launch the generate client using system api. @throws BuildException if there is an error. 
protected	TokenNameprotected	
void	TokenNamevoid	
executeForkV5	TokenNameIdentifier	 execute Fork V5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"mode : fork "	TokenNameStringLiteral	mode : fork 
+	TokenNamePLUS	
BorlandDeploymentTool	TokenNameIdentifier	 Borland Deployment Tool
.	TokenNameDOT	
BES	TokenNameIdentifier	 BES
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExecTask	TokenNameIdentifier	 Exec Task
execTask	TokenNameIdentifier	 exec Task
=	TokenNameEQUAL	
new	TokenNamenew	
ExecTask	TokenNameIdentifier	 Exec Task
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
"iastool"	TokenNameStringLiteral	iastool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-debug"	TokenNameStringLiteral	-debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-genclient"	TokenNameStringLiteral	-genclient
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-jars"	TokenNameStringLiteral	-jars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ejb jar file 	TokenNameCOMMENT_LINE	ejb jar file 
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
ejbjarfile	TokenNameIdentifier	 ejbjarfile
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//client jar file 	TokenNameCOMMENT_LINE	client jar file 
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-target"	TokenNameStringLiteral	-target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
clientjarfile	TokenNameIdentifier	 clientjarfile
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//classpath 	TokenNameCOMMENT_LINE	classpath 
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-cp"	TokenNameStringLiteral	-cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Calling iastool"	TokenNameStringLiteral	Calling iastool
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execTask	TokenNameIdentifier	 exec Task
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Have to catch this because of the semantics of calling main() 	TokenNameCOMMENT_LINE	Have to catch this because of the semantics of calling main() 
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Exception while calling generateclient Details: "	TokenNameStringLiteral	Exception while calling generateclient Details: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
