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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
compilers	TokenNameIdentifier	 compilers
.	TokenNameDOT	
AptExternalCompilerAdapter	TokenNameIdentifier	 Apt External Compiler Adapter
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
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Apt Task for running the Annotation processing tool for JDK 1.5. It derives * from the existing Javac task, and forces the compiler based on whether we're * executing internally, or externally. * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Apt Task for running the Annotation processing tool for JDK 1.5. It derives from the existing Javac task, and forces the compiler based on whether we're executing internally, or externally. * @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
Apt	TokenNameIdentifier	 Apt
extends	TokenNameextends	
Javac	TokenNameIdentifier	 Javac
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
compile	TokenNameIdentifier	 compile
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
factoryPath	TokenNameIdentifier	 factory Path
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
preprocessDir	TokenNameIdentifier	 preprocess Dir
;	TokenNameSEMICOLON	
/** The name of the apt tool. */	TokenNameCOMMENT_JAVADOC	 The name of the apt tool. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXECUTABLE_NAME	TokenNameIdentifier	 EXECUTABLE  NAME
=	TokenNameEQUAL	
"apt"	TokenNameStringLiteral	apt
;	TokenNameSEMICOLON	
/** An warning message when ignoring compiler attribute. */	TokenNameCOMMENT_JAVADOC	 An warning message when ignoring compiler attribute. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_IGNORING_COMPILER_OPTION	TokenNameIdentifier	 ERROR  IGNORING  COMPILER  OPTION
=	TokenNameEQUAL	
"Ignoring compiler attribute for the APT task, as it is fixed"	TokenNameStringLiteral	Ignoring compiler attribute for the APT task, as it is fixed
;	TokenNameSEMICOLON	
/** A warning message if used with java < 1.5. */	TokenNameCOMMENT_JAVADOC	 A warning message if used with java < 1.5. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_WRONG_JAVA_VERSION	TokenNameIdentifier	 ERROR  WRONG  JAVA  VERSION
=	TokenNameEQUAL	
"Apt task requires Java 1.5+"	TokenNameStringLiteral	Apt task requires Java 1.5+
;	TokenNameSEMICOLON	
/** * exposed for debug messages */	TokenNameCOMMENT_JAVADOC	 exposed for debug messages 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARNING_IGNORING_FORK	TokenNameIdentifier	 WARNING  IGNORING  FORK
=	TokenNameEQUAL	
"Apt only runs in its own JVM; fork=false option ignored"	TokenNameStringLiteral	Apt only runs in its own JVM; fork=false option ignored
;	TokenNameSEMICOLON	
/** * The nested option element. */	TokenNameCOMMENT_JAVADOC	 The nested option element. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Option	TokenNameIdentifier	 Option
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** Constructor for Option */	TokenNameCOMMENT_JAVADOC	 Constructor for Option 
public	TokenNamepublic	
Option	TokenNameIdentifier	 Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//default 	TokenNameCOMMENT_LINE	default 
}	TokenNameRBRACE	
/** * Get the name attribute. * @return the name attribute. */	TokenNameCOMMENT_JAVADOC	 Get the name attribute. @return the name attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the name attribute. * @param name the name of the option. */	TokenNameCOMMENT_JAVADOC	 Set the name attribute. @param name the name of the option. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the value attribute. * @return the value attribute. */	TokenNameCOMMENT_JAVADOC	 Get the value attribute. @return the value attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the value attribute. * @param value the value of the option. */	TokenNameCOMMENT_JAVADOC	 Set the value attribute. @param value the value of the option. 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Construtor for Apt task. * This sets the apt compiler adapter as the compiler in the super class. */	TokenNameCOMMENT_JAVADOC	 Construtor for Apt task. This sets the apt compiler adapter as the compiler in the super class. 
public	TokenNamepublic	
Apt	TokenNameIdentifier	 Apt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setCompiler	TokenNameIdentifier	 set Compiler
(	TokenNameLPAREN	
AptExternalCompilerAdapter	TokenNameIdentifier	 Apt External Compiler Adapter
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of the apt executable. * * @return the name of the executable. */	TokenNameCOMMENT_JAVADOC	 Get the name of the apt executable. * @return the name of the executable. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAptExecutable	TokenNameIdentifier	 get Apt Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
exe	TokenNameIdentifier	 exe
=	TokenNameEQUAL	
getExecutable	TokenNameIdentifier	 get Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
exe	TokenNameIdentifier	 exe
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
exe	TokenNameIdentifier	 exe
:	TokenNameCOLON	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
getJdkExecutable	TokenNameIdentifier	 get Jdk Executable
(	TokenNameLPAREN	
EXECUTABLE_NAME	TokenNameIdentifier	 EXECUTABLE  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the compiler. * This is not allowed and a warning log message is made. * @param compiler not used. */	TokenNameCOMMENT_JAVADOC	 Set the compiler. This is not allowed and a warning log message is made. @param compiler not used. 
public	TokenNamepublic	
void	TokenNamevoid	
setCompiler	TokenNameIdentifier	 set Compiler
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
ERROR_IGNORING_COMPILER_OPTION	TokenNameIdentifier	 ERROR  IGNORING  COMPILER  OPTION
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the fork attribute. * Non-forking APT is highly classpath dependent and appears to be too * brittle to work. The sole reason this attribute is retained * is the superclass does it * @param fork if false; warn the option is ignored. */	TokenNameCOMMENT_JAVADOC	 Set the fork attribute. Non-forking APT is highly classpath dependent and appears to be too brittle to work. The sole reason this attribute is retained is the superclass does it @param fork if false; warn the option is ignored. 
public	TokenNamepublic	
void	TokenNamevoid	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
boolean	TokenNameboolean	
fork	TokenNameIdentifier	 fork
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fork	TokenNameIdentifier	 fork
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
WARNING_IGNORING_FORK	TokenNameIdentifier	 WARNING  IGNORING  FORK
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the compiler class name. * @return the compiler class name. */	TokenNameCOMMENT_JAVADOC	 Get the compiler class name. @return the compiler class name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the compile option for the apt compiler. * If this is false the "-nocompile" argument will be used. * @return the value of the compile option. */	TokenNameCOMMENT_JAVADOC	 Get the compile option for the apt compiler. If this is false the "-nocompile" argument will be used. @return the value of the compile option. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompile	TokenNameIdentifier	 is Compile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compile	TokenNameIdentifier	 compile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the compile option for the apt compiler. * Default value is true. * @param compile if true set the compile option. */	TokenNameCOMMENT_JAVADOC	 Set the compile option for the apt compiler. Default value is true. @param compile if true set the compile option. 
public	TokenNamepublic	
void	TokenNamevoid	
setCompile	TokenNameIdentifier	 set Compile
(	TokenNameLPAREN	
boolean	TokenNameboolean	
compile	TokenNameIdentifier	 compile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
=	TokenNameEQUAL	
compile	TokenNameIdentifier	 compile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the factory option for the apt compiler. * If this is non-null the "-factory" argument will be used. * @return the value of the factory option. */	TokenNameCOMMENT_JAVADOC	 Get the factory option for the apt compiler. If this is non-null the "-factory" argument will be used. @return the value of the factory option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFactory	TokenNameIdentifier	 get Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the factory option for the apt compiler. * Default value is null. * @param factory the classname of the factory. */	TokenNameCOMMENT_JAVADOC	 Set the factory option for the apt compiler. Default value is null. @param factory the classname of the factory. 
public	TokenNamepublic	
void	TokenNamevoid	
setFactory	TokenNameIdentifier	 set Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a reference to a path to the factoryPath attribute. * @param ref a reference to a path. */	TokenNameCOMMENT_JAVADOC	 Add a reference to a path to the factoryPath attribute. @param ref a reference to a path. 
public	TokenNamepublic	
void	TokenNamevoid	
setFactoryPathRef	TokenNameIdentifier	 set Factory Path Ref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createFactoryPath	TokenNameIdentifier	 create Factory Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a path to the factoryPath attribute. * @return a path to be configured. */	TokenNameCOMMENT_JAVADOC	 Add a path to the factoryPath attribute. @return a path to be configured. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createFactoryPath	TokenNameIdentifier	 create Factory Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
factoryPath	TokenNameIdentifier	 factory Path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
factoryPath	TokenNameIdentifier	 factory Path
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
factoryPath	TokenNameIdentifier	 factory Path
.	TokenNameDOT	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the factory path attribute. * If this is not null, the "-factorypath" argument will be used. * The default value is null. * @return the factory path attribute. */	TokenNameCOMMENT_JAVADOC	 Get the factory path attribute. If this is not null, the "-factorypath" argument will be used. The default value is null. @return the factory path attribute. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
getFactoryPath	TokenNameIdentifier	 get Factory Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
factoryPath	TokenNameIdentifier	 factory Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a nested option. * @return an option to be configured. */	TokenNameCOMMENT_JAVADOC	 Create a nested option. @return an option to be configured. 
public	TokenNamepublic	
Option	TokenNameIdentifier	 Option
createOption	TokenNameIdentifier	 create Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Option	TokenNameIdentifier	 Option
opt	TokenNameIdentifier	 opt
=	TokenNameEQUAL	
new	TokenNamenew	
Option	TokenNameIdentifier	 Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
opt	TokenNameIdentifier	 opt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
opt	TokenNameIdentifier	 opt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the options to the compiler. * Each option will use '"-E" name ["=" value]' argument. * @return the options. */	TokenNameCOMMENT_JAVADOC	 Get the options to the compiler. Each option will use '"-E" name ["=" value]' argument. @return the options. 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getOptions	TokenNameIdentifier	 get Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the preprocessdir attribute. * This corresponds to the "-s" argument. * The default value is null. * @return the preprocessdir attribute. */	TokenNameCOMMENT_JAVADOC	 Get the preprocessdir attribute. This corresponds to the "-s" argument. The default value is null. @return the preprocessdir attribute. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getPreprocessDir	TokenNameIdentifier	 get Preprocess Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
preprocessDir	TokenNameIdentifier	 preprocess Dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the preprocessdir attribute. * @param preprocessDir where to place processor generated source files. */	TokenNameCOMMENT_JAVADOC	 Set the preprocessdir attribute. @param preprocessDir where to place processor generated source files. 
public	TokenNamepublic	
void	TokenNamevoid	
setPreprocessDir	TokenNameIdentifier	 set Preprocess Dir
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
preprocessDir	TokenNameIdentifier	 preprocess Dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
preprocessDir	TokenNameIdentifier	 preprocess Dir
=	TokenNameEQUAL	
preprocessDir	TokenNameIdentifier	 preprocess Dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do the compilation. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Do the compilation. @throws BuildException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
