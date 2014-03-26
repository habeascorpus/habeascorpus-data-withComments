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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
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
LogOutputStream	TokenNameIdentifier	 Log Output Stream
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
/** * The implementation of the rmic for SUN's JDK. * * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 The implementation of the rmic for SUN's JDK. * @since Ant 1.4 
public	TokenNamepublic	
class	TokenNameclass	
SunRmic	TokenNameIdentifier	 Sun Rmic
extends	TokenNameextends	
DefaultRmicAdapter	TokenNameIdentifier	 Default Rmic Adapter
{	TokenNameLBRACE	
/** * name of the class */	TokenNameCOMMENT_JAVADOC	 name of the class 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RMIC_CLASSNAME	TokenNameIdentifier	 RMIC  CLASSNAME
=	TokenNameEQUAL	
"sun.rmi.rmic.Main"	TokenNameStringLiteral	sun.rmi.rmic.Main
;	TokenNameSEMICOLON	
/** * the name of this adapter for users to select */	TokenNameCOMMENT_JAVADOC	 the name of this adapter for users to select 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPILER_NAME	TokenNameIdentifier	 COMPILER  NAME
=	TokenNameEQUAL	
"sun"	TokenNameStringLiteral	sun
;	TokenNameSEMICOLON	
/** * name of the executable */	TokenNameCOMMENT_JAVADOC	 name of the executable 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RMIC_EXECUTABLE	TokenNameIdentifier	 RMIC  EXECUTABLE
=	TokenNameEQUAL	
"rmic"	TokenNameStringLiteral	rmic
;	TokenNameSEMICOLON	
/** Error message to use with the sun rmic is not the classpath. */	TokenNameCOMMENT_JAVADOC	 Error message to use with the sun rmic is not the classpath. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_RMIC_ON_CLASSPATH	TokenNameIdentifier	 ERROR  NO  RMIC  ON  CLASSPATH
=	TokenNameEQUAL	
"Cannot use SUN rmic, as it is not "	TokenNameStringLiteral	Cannot use SUN rmic, as it is not 
+	TokenNamePLUS	
"available. A common solution is to "	TokenNameStringLiteral	available. A common solution is to 
+	TokenNamePLUS	
"set the environment variable "	TokenNameStringLiteral	set the environment variable 
+	TokenNamePLUS	
"JAVA_HOME"	TokenNameStringLiteral	JAVA_HOME
;	TokenNameSEMICOLON	
/** Error message to use when there is an error starting the sun rmic compiler */	TokenNameCOMMENT_JAVADOC	 Error message to use when there is an error starting the sun rmic compiler 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_RMIC_FAILED	TokenNameIdentifier	 ERROR  RMIC  FAILED
=	TokenNameEQUAL	
"Error starting SUN rmic: "	TokenNameStringLiteral	Error starting SUN rmic: 
;	TokenNameSEMICOLON	
/** * Run the rmic compiler. * @return true if the compilation succeeded * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Run the rmic compiler. @return true if the compilation succeeded @throws BuildException on error 
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
"Using SUN rmic compiler"	TokenNameStringLiteral	Using SUN rmic compiler
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create an instance of the rmic, redirecting output to 	TokenNameCOMMENT_LINE	Create an instance of the rmic, redirecting output to 
// the project log 	TokenNameCOMMENT_LINE	the project log 
LogOutputStream	TokenNameIdentifier	 Log Output Stream
logstr	TokenNameIdentifier	 logstr
=	TokenNameEQUAL	
new	TokenNamenew	
LogOutputStream	TokenNameIdentifier	 Log Output Stream
(	TokenNameLPAREN	
getRmic	TokenNameIdentifier	 get Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
RMIC_CLASSNAME	TokenNameIdentifier	 RMIC  CLASSNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Constructor	TokenNameIdentifier	 Constructor
cons	TokenNameIdentifier	 cons
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
rmic	TokenNameIdentifier	 rmic
=	TokenNameEQUAL	
cons	TokenNameIdentifier	 cons
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
logstr	TokenNameIdentifier	 logstr
,	TokenNameCOMMA	
"rmic"	TokenNameStringLiteral	rmic
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
doRmic	TokenNameIdentifier	 do Rmic
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"compile"	TokenNameStringLiteral	compile
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
Boolean	TokenNameIdentifier	 Boolean
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
doRmic	TokenNameIdentifier	 do Rmic
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
rmic	TokenNameIdentifier	 rmic
,	TokenNameCOMMA	
(	TokenNameLPAREN	
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
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ok	TokenNameIdentifier	 ok
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
ERROR_NO_RMIC_ON_CLASSPATH	TokenNameIdentifier	 ERROR  NO  RMIC  ON  CLASSPATH
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
ERROR_RMIC_FAILED	TokenNameIdentifier	 ERROR  RMIC  FAILED
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
try	TokenNametry	
{	TokenNameLBRACE	
logstr	TokenNameIdentifier	 logstr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Strip out all -J args from the command list. * @param compilerArgs the original compiler arguments * @return the filtered set. */	TokenNameCOMMENT_JAVADOC	 Strip out all -J args from the command list. @param compilerArgs the original compiler arguments @return the filtered set. 
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
}	TokenNameRBRACE	
