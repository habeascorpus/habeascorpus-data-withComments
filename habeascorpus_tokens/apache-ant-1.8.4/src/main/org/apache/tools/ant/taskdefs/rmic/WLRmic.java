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
rmic	TokenNameIdentifier	 rmic
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Commandline	TokenNameIdentifier	 Commandline
;	TokenNameSEMICOLON	
/** * The implementation of the rmic for WebLogic * * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 The implementation of the rmic for WebLogic * @since Ant 1.4 
public	TokenNamepublic	
class	TokenNameclass	
WLRmic	TokenNameIdentifier	 WL Rmic
extends	TokenNameextends	
DefaultRmicAdapter	TokenNameIdentifier	 Default Rmic Adapter
{	TokenNameLBRACE	
/** The classname of the weblogic rmic */	TokenNameCOMMENT_JAVADOC	 The classname of the weblogic rmic 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WLRMIC_CLASSNAME	TokenNameIdentifier	 WLRMIC  CLASSNAME
=	TokenNameEQUAL	
"weblogic.rmic"	TokenNameStringLiteral	weblogic.rmic
;	TokenNameSEMICOLON	
/** * the name of this adapter for users to select */	TokenNameCOMMENT_JAVADOC	 the name of this adapter for users to select 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPILER_NAME	TokenNameIdentifier	 COMPILER  NAME
=	TokenNameEQUAL	
"weblogic"	TokenNameStringLiteral	weblogic
;	TokenNameSEMICOLON	
/** The error string to use if not able to find the weblogic rmic */	TokenNameCOMMENT_JAVADOC	 The error string to use if not able to find the weblogic rmic 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_WLRMIC_ON_CLASSPATH	TokenNameIdentifier	 ERROR  NO  WLRMIC  ON  CLASSPATH
=	TokenNameEQUAL	
"Cannot use WebLogic rmic, as it is not "	TokenNameStringLiteral	Cannot use WebLogic rmic, as it is not 
+	TokenNamePLUS	
"available. Add it to Ant's classpath with the -lib option"	TokenNameStringLiteral	available. Add it to Ant's classpath with the -lib option
;	TokenNameSEMICOLON	
/** The error string to use if not able to start the weblogic rmic */	TokenNameCOMMENT_JAVADOC	 The error string to use if not able to start the weblogic rmic 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_WLRMIC_FAILED	TokenNameIdentifier	 ERROR  WLRMIC  FAILED
=	TokenNameEQUAL	
"Error starting WebLogic rmic: "	TokenNameStringLiteral	Error starting WebLogic rmic: 
;	TokenNameSEMICOLON	
/** The stub suffix */	TokenNameCOMMENT_JAVADOC	 The stub suffix 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WL_RMI_STUB_SUFFIX	TokenNameIdentifier	 WL  RMI  STUB  SUFFIX
=	TokenNameEQUAL	
"_WLStub"	TokenNameStringLiteral	_WLStub
;	TokenNameSEMICOLON	
/** The skeleton suffix */	TokenNameCOMMENT_JAVADOC	 The skeleton suffix 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WL_RMI_SKEL_SUFFIX	TokenNameIdentifier	 WL  RMI  SKEL  SUFFIX
=	TokenNameEQUAL	
"_WLSkel"	TokenNameStringLiteral	_WLSkel
;	TokenNameSEMICOLON	
/** upsupported error message */	TokenNameCOMMENT_JAVADOC	 upsupported error message 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNSUPPORTED_STUB_OPTION	TokenNameIdentifier	 UNSUPPORTED  STUB  OPTION
=	TokenNameEQUAL	
"Unsupported stub option: "	TokenNameStringLiteral	Unsupported stub option: 
;	TokenNameSEMICOLON	
/** * Carry out the rmic compilation. * @return true if the compilation succeeded * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Carry out the rmic compilation. @return true if the compilation succeeded @throws BuildException on error 
public	TokenNamepublic	
boolean	TokenNameboolean	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
getRmic	TokenNameIdentifier	 get Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Using WebLogic rmic"	TokenNameStringLiteral	Using WebLogic rmic
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
setupRmicCommand	TokenNameIdentifier	 setup Rmic Command
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"-noexit"	TokenNameStringLiteral	-noexit
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Create an instance of the rmic 	TokenNameCOMMENT_LINE	Create an instance of the rmic 
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getRmic	TokenNameIdentifier	 get Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
WLRMIC_CLASSNAME	TokenNameIdentifier	 WLRMIC  CLASSNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
getRmic	TokenNameIdentifier	 get Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
getRmic	TokenNameIdentifier	 get Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
WLRMIC_CLASSNAME	TokenNameIdentifier	 WLRMIC  CLASSNAME
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Method	TokenNameIdentifier	 Method
doRmic	TokenNameIdentifier	 do Rmic
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"main"	TokenNameStringLiteral	main
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doRmic	TokenNameIdentifier	 do Rmic
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
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
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_WLRMIC_ON_CLASSPATH	TokenNameIdentifier	 ERROR  NO  WLRMIC  ON  CLASSPATH
,	TokenNameCOMMA	
getRmic	TokenNameIdentifier	 get Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
ERROR_WLRMIC_FAILED	TokenNameIdentifier	 ERROR  WLRMIC  FAILED
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
,	TokenNameCOMMA	
getRmic	TokenNameIdentifier	 get Rmic
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
if	TokenNameif	
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the suffix for the rmic stub classes * @return the stub suffix */	TokenNameCOMMENT_JAVADOC	 Get the suffix for the rmic stub classes @return the stub suffix 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStubClassSuffix	TokenNameIdentifier	 get Stub Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
WL_RMI_STUB_SUFFIX	TokenNameIdentifier	 WL  RMI  STUB  SUFFIX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the suffix for the rmic skeleton classes * @return the skeleton suffix */	TokenNameCOMMENT_JAVADOC	 Get the suffix for the rmic skeleton classes @return the skeleton suffix 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSkelClassSuffix	TokenNameIdentifier	 get Skel Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
WL_RMI_SKEL_SUFFIX	TokenNameIdentifier	 WL  RMI  SKEL  SUFFIX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Strip out all -J args from the command list. * * @param compilerArgs the original compiler arguments * @return the filtered set. */	TokenNameCOMMENT_JAVADOC	 Strip out all -J args from the command list. * @param compilerArgs the original compiler arguments @return the filtered set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
preprocessCompilerArgs	TokenNameIdentifier	 preprocess Compiler Args
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
compilerArgs	TokenNameIdentifier	 compiler Args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filterJvmCompilerArgs	TokenNameIdentifier	 filter Jvm Compiler Args
(	TokenNameLPAREN	
compilerArgs	TokenNameIdentifier	 compiler Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is an override point; no stub version is returned. If any * stub option is set, a warning is printed. * @return null, for no stub version */	TokenNameCOMMENT_JAVADOC	 This is an override point; no stub version is returned. If any stub option is set, a warning is printed. @return null, for no stub version 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
addStubVersionOptions	TokenNameIdentifier	 add Stub Version Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//handle the many different stub options. 	TokenNameCOMMENT_LINE	handle the many different stub options. 
String	TokenNameIdentifier	 String
stubVersion	TokenNameIdentifier	 stub Version
=	TokenNameEQUAL	
getRmic	TokenNameIdentifier	 get Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStubVersion	TokenNameIdentifier	 get Stub Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
stubVersion	TokenNameIdentifier	 stub Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getRmic	TokenNameIdentifier	 get Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
UNSUPPORTED_STUB_OPTION	TokenNameIdentifier	 UNSUPPORTED  STUB  OPTION
+	TokenNamePLUS	
stubVersion	TokenNameIdentifier	 stub Version
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
