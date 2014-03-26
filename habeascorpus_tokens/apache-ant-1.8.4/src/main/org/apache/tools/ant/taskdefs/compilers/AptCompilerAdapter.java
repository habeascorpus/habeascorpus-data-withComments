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
compilers	TokenNameIdentifier	 compilers
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
Apt	TokenNameIdentifier	 Apt
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
Commandline	TokenNameIdentifier	 Commandline
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
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
/** * The implementation of the apt compiler for JDK 1.5 * <p/> * As usual, the low level entry points for Java tools are neither documented or * stable; this entry point may change from that of 1.5.0_01-b08 without any * warning at all. The IDE decompile of the tool entry points is as follows: * <pre> * public class Main { * public Main() ; * <p/> * public static transient void main(String... strings) ; * <p/> * public static transient int process(String... strings); * <p/> * public static transient int process(PrintWriter printWriter, * String... strings) ; * public static transient int process( * AnnotationProcessorFactory annotationProcessorFactory, * String... strings) ; * <p/> * public static transient int process( * AnnotationProcessorFactory annotationProcessorFactory, * PrintWriter printWriter, * String... strings); * private static transient int processing( * AnnotationProcessorFactory annotationProcessorFactory, * PrintWriter printWriter, * String... strings) ; * } * </pre> * * This Adapter is designed to run Apt in-JVM, an option that is not actually * exposed to end-users, because it was too brittle during beta testing; classpath * problems being the core issue. * * * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 The implementation of the apt compiler for JDK 1.5 <p/> As usual, the low level entry points for Java tools are neither documented or stable; this entry point may change from that of 1.5.0_01-b08 without any warning at all. The IDE decompile of the tool entry points is as follows: <pre> public class Main { public Main() ; <p/> public static transient void main(String... strings) ; <p/> public static transient int process(String... strings); <p/> public static transient int process(PrintWriter printWriter, String... strings) ; public static transient int process( AnnotationProcessorFactory annotationProcessorFactory, String... strings) ; <p/> public static transient int process( AnnotationProcessorFactory annotationProcessorFactory, PrintWriter printWriter, String... strings); private static transient int processing( AnnotationProcessorFactory annotationProcessorFactory, PrintWriter printWriter, String... strings) ; } </pre> * This Adapter is designed to run Apt in-JVM, an option that is not actually exposed to end-users, because it was too brittle during beta testing; classpath problems being the core issue. * * @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
AptCompilerAdapter	TokenNameIdentifier	 Apt Compiler Adapter
extends	TokenNameextends	
DefaultCompilerAdapter	TokenNameIdentifier	 Default Compiler Adapter
{	TokenNameLBRACE	
/** * Integer returned by the Apt compiler to indicate success. */	TokenNameCOMMENT_JAVADOC	 Integer returned by the Apt compiler to indicate success. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
APT_COMPILER_SUCCESS	TokenNameIdentifier	 APT  COMPILER  SUCCESS
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * class in tools.jar that implements APT */	TokenNameCOMMENT_JAVADOC	 class in tools.jar that implements APT 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
APT_ENTRY_POINT	TokenNameIdentifier	 APT  ENTRY  POINT
=	TokenNameEQUAL	
"com.sun.tools.apt.Main"	TokenNameStringLiteral	com.sun.tools.apt.Main
;	TokenNameSEMICOLON	
/** * method used to compile. */	TokenNameCOMMENT_JAVADOC	 method used to compile. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
APT_METHOD_NAME	TokenNameIdentifier	 APT  METHOD  NAME
=	TokenNameEQUAL	
"process"	TokenNameStringLiteral	process
;	TokenNameSEMICOLON	
/** * Get the facade task that fronts this adapter * * @return task instance * @see DefaultCompilerAdapter#getJavac() */	TokenNameCOMMENT_JAVADOC	 Get the facade task that fronts this adapter * @return task instance @see DefaultCompilerAdapter#getJavac() 
protected	TokenNameprotected	
Apt	TokenNameIdentifier	 Apt
getApt	TokenNameIdentifier	 get Apt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Apt	TokenNameIdentifier	 Apt
)	TokenNameRPAREN	
getJavac	TokenNameIdentifier	 get Javac
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Using the front end arguments, set up the command line to run Apt * * @param apt task * @param cmd command that is set up with the various switches from the task * options */	TokenNameCOMMENT_JAVADOC	 Using the front end arguments, set up the command line to run Apt * @param apt task @param cmd command that is set up with the various switches from the task options 
static	TokenNamestatic	
void	TokenNamevoid	
setAptCommandlineSwitches	TokenNameIdentifier	 set Apt Commandline Switches
(	TokenNameLPAREN	
Apt	TokenNameIdentifier	 Apt
apt	TokenNameIdentifier	 apt
,	TokenNameCOMMA	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
apt	TokenNameIdentifier	 apt
.	TokenNameDOT	
isCompile	TokenNameIdentifier	 is Compile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
"-nocompile"	TokenNameStringLiteral	-nocompile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Process the factory class 	TokenNameCOMMENT_LINE	Process the factory class 
String	TokenNameIdentifier	 String
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
apt	TokenNameIdentifier	 apt
.	TokenNameDOT	
getFactory	TokenNameIdentifier	 get Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
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
"-factory"	TokenNameStringLiteral	-factory
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
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Process the factory path 	TokenNameCOMMENT_LINE	Process the factory path 
Path	TokenNameIdentifier	 Path
factoryPath	TokenNameIdentifier	 factory Path
=	TokenNameEQUAL	
apt	TokenNameIdentifier	 apt
.	TokenNameDOT	
getFactoryPath	TokenNameIdentifier	 get Factory Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
factoryPath	TokenNameIdentifier	 factory Path
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
"-factorypath"	TokenNameStringLiteral	-factorypath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setPath	TokenNameIdentifier	 set Path
(	TokenNameLPAREN	
factoryPath	TokenNameIdentifier	 factory Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
preprocessDir	TokenNameIdentifier	 preprocess Dir
=	TokenNameEQUAL	
apt	TokenNameIdentifier	 apt
.	TokenNameDOT	
getPreprocessDir	TokenNameIdentifier	 get Preprocess Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
preprocessDir	TokenNameIdentifier	 preprocess Dir
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
"-s"	TokenNameStringLiteral	-s
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
preprocessDir	TokenNameIdentifier	 preprocess Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Process the processor options 	TokenNameCOMMENT_LINE	Process the processor options 
Vector	TokenNameIdentifier	 Vector
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
apt	TokenNameIdentifier	 apt
.	TokenNameDOT	
getOptions	TokenNameIdentifier	 get Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Apt	TokenNameIdentifier	 Apt
.	TokenNameDOT	
Option	TokenNameIdentifier	 Option
opt	TokenNameIdentifier	 opt
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
opt	TokenNameIdentifier	 opt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Apt	TokenNameIdentifier	 Apt
.	TokenNameDOT	
Option	TokenNameIdentifier	 Option
)	TokenNameRPAREN	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-A"	TokenNameStringLiteral	-A
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * using our front end task, set up the command line switches * * @param cmd command line to set up */	TokenNameCOMMENT_JAVADOC	 using our front end task, set up the command line switches * @param cmd command line to set up 
protected	TokenNameprotected	
void	TokenNamevoid	
setAptCommandlineSwitches	TokenNameIdentifier	 set Apt Commandline Switches
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Apt	TokenNameIdentifier	 Apt
apt	TokenNameIdentifier	 apt
=	TokenNameEQUAL	
getApt	TokenNameIdentifier	 get Apt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setAptCommandlineSwitches	TokenNameIdentifier	 set Apt Commandline Switches
(	TokenNameLPAREN	
apt	TokenNameIdentifier	 apt
,	TokenNameCOMMA	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Run the compilation. * @return true on success. * @throws BuildException if the compilation has problems. */	TokenNameCOMMENT_JAVADOC	 Run the compilation. @return true on success. @throws BuildException if the compilation has problems. 
public	TokenNamepublic	
boolean	TokenNameboolean	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Using apt compiler"	TokenNameStringLiteral	Using apt compiler
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//set up the javac options 	TokenNameCOMMENT_LINE	set up the javac options 
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
setupModernJavacCommand	TokenNameIdentifier	 setup Modern Javac Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//then add the Apt options 	TokenNameCOMMENT_LINE	then add the Apt options 
setAptCommandlineSwitches	TokenNameIdentifier	 set Apt Commandline Switches
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//finally invoke APT 	TokenNameCOMMENT_LINE	finally invoke APT 
// Use reflection to be able to build on all JDKs: 	TokenNameCOMMENT_LINE	Use reflection to be able to build on all JDKs: 
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
APT_ENTRY_POINT	TokenNameIdentifier	 APT  ENTRY  POINT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
compiler	TokenNameIdentifier	 compiler
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
compile	TokenNameIdentifier	 compile
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
APT_METHOD_NAME	TokenNameIdentifier	 APT  METHOD  NAME
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
compile	TokenNameIdentifier	 compile
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getArguments	TokenNameIdentifier	 get Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
APT_COMPILER_SUCCESS	TokenNameIdentifier	 APT  COMPILER  SUCCESS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//rethrow build exceptions 	TokenNameCOMMENT_LINE	rethrow build exceptions 
throw	TokenNamethrow	
be	TokenNameIdentifier	 be
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//cast everything else to a build exception 	TokenNameCOMMENT_LINE	cast everything else to a build exception 
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Error starting apt compiler"	TokenNameStringLiteral	Error starting apt compiler
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
