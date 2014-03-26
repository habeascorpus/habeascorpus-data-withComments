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
/** * The implementation of the gcj compiler. * This is primarily a cut-and-paste from the jikes. * * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 The implementation of the gcj compiler. This is primarily a cut-and-paste from the jikes. * @since Ant 1.4 
public	TokenNamepublic	
class	TokenNameclass	
Gcj	TokenNameIdentifier	 Gcj
extends	TokenNameextends	
DefaultCompilerAdapter	TokenNameIdentifier	 Default Compiler Adapter
{	TokenNameLBRACE	
/** * Performs a compile using the gcj compiler. * @return true if the compilation succeeded * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Performs a compile using the gcj compiler. @return true if the compilation succeeded @throws BuildException on error 
public	TokenNamepublic	
boolean	TokenNameboolean	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Using gcj compiler"	TokenNameStringLiteral	Using gcj compiler
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
setupGCJCommand	TokenNameIdentifier	 setup GCJ Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstFileName	TokenNameIdentifier	 first File Name
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logAndAddFilesToCompile	TokenNameIdentifier	 log And Add Files To Compile
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
executeExternalCompile	TokenNameIdentifier	 execute External Compile
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
firstFileName	TokenNameIdentifier	 first File Name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set up the gcj commandline. * @return the command line */	TokenNameCOMMENT_JAVADOC	 Set up the gcj commandline. @return the command line 
protected	TokenNameprotected	
Commandline	TokenNameIdentifier	 Commandline
setupGCJCommand	TokenNameIdentifier	 setup GCJ Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
new	TokenNamenew	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// gcj doesn't support bootclasspath dir (-bootclasspath) 	TokenNameCOMMENT_LINE	gcj doesn't support bootclasspath dir (-bootclasspath) 
// so we'll emulate it for compatibility and convenience. 	TokenNameCOMMENT_LINE	so we'll emulate it for compatibility and convenience. 
Path	TokenNameIdentifier	 Path
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getBootClassPath	TokenNameIdentifier	 get Boot Class Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// gcj doesn't support an extension dir (-extdir) 	TokenNameCOMMENT_LINE	gcj doesn't support an extension dir (-extdir) 
// so we'll emulate it for compatibility and convenience. 	TokenNameCOMMENT_LINE	so we'll emulate it for compatibility and convenience. 
if	TokenNameif	
(	TokenNameLPAREN	
extdirs	TokenNameIdentifier	 extdirs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
includeJavaRuntime	TokenNameIdentifier	 include Java Runtime
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
addExtdirs	TokenNameIdentifier	 add Extdirs
(	TokenNameLPAREN	
extdirs	TokenNameIdentifier	 extdirs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getCompileClasspath	TokenNameIdentifier	 get Compile Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Gcj has no option for source-path so we 	TokenNameCOMMENT_LINE	Gcj has no option for source-path so we 
// will add it to classpath. 	TokenNameCOMMENT_LINE	will add it to classpath. 
if	TokenNameif	
(	TokenNameLPAREN	
compileSourcepath	TokenNameIdentifier	 compile Sourcepath
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
compileSourcepath	TokenNameIdentifier	 compile Sourcepath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
exec	TokenNameIdentifier	 exec
=	TokenNameEQUAL	
getJavac	TokenNameIdentifier	 get Javac
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExecutable	TokenNameIdentifier	 get Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
exec	TokenNameIdentifier	 exec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"gcj"	TokenNameStringLiteral	gcj
:	TokenNameCOLON	
exec	TokenNameIdentifier	 exec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
destDir	TokenNameIdentifier	 dest Dir
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
"-d"	TokenNameStringLiteral	-d
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
destDir	TokenNameIdentifier	 dest Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
destDir	TokenNameIdentifier	 dest Dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
destDir	TokenNameIdentifier	 dest Dir
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Can't make output directories. "	TokenNameStringLiteral	Can't make output directories. 
+	TokenNamePLUS	
"Maybe permission is wrong. "	TokenNameStringLiteral	Maybe permission is wrong. 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-classpath"	TokenNameStringLiteral	-classpath
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
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
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
"--encoding="	TokenNameStringLiteral	--encoding=
+	TokenNamePLUS	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
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
"-g1"	TokenNameStringLiteral	-g1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
optimize	TokenNameIdentifier	 optimize
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
"-O"	TokenNameStringLiteral	-O
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * gcj should be set for generate class. * ... if no 'compile to native' argument is passed */	TokenNameCOMMENT_JAVADOC	 gcj should be set for generate class. ... if no 'compile to native' argument is passed 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isNativeBuild	TokenNameIdentifier	 is Native Build
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
"-C"	TokenNameStringLiteral	-C
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
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
"-fsource="	TokenNameStringLiteral	-fsource=
+	TokenNamePLUS	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
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
"-ftarget="	TokenNameStringLiteral	-ftarget=
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addCurrentCompilerArgs	TokenNameIdentifier	 add Current Compiler Args
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cmd	TokenNameIdentifier	 cmd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether any of the arguments given via &lt;compilerarg&gt; * implies that compilation to native code is requested. * @return true if compilation to native code is requested * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Whether any of the arguments given via &lt;compilerarg&gt; implies that compilation to native code is requested. @return true if compilation to native code is requested @since Ant 1.6.2 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNativeBuild	TokenNameIdentifier	 is Native Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
nativeBuild	TokenNameIdentifier	 native Build
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
additionalArguments	TokenNameIdentifier	 additional Arguments
=	TokenNameEQUAL	
getJavac	TokenNameIdentifier	 get Javac
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCurrentCompilerArgs	TokenNameIdentifier	 get Current Compiler Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
argsLength	TokenNameIdentifier	 args Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
nativeBuild	TokenNameIdentifier	 native Build
&&	TokenNameAND_AND	
argsLength	TokenNameIdentifier	 args Length
<	TokenNameLESS	
additionalArguments	TokenNameIdentifier	 additional Arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
conflictLength	TokenNameIdentifier	 conflict Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
nativeBuild	TokenNameIdentifier	 native Build
&&	TokenNameAND_AND	
conflictLength	TokenNameIdentifier	 conflict Length
<	TokenNameLESS	
CONFLICT_WITH_DASH_C	TokenNameIdentifier	 CONFLICT  WITH  DASH  C
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nativeBuild	TokenNameIdentifier	 native Build
=	TokenNameEQUAL	
(	TokenNameLPAREN	
additionalArguments	TokenNameIdentifier	 additional Arguments
[	TokenNameLBRACKET	
argsLength	TokenNameIdentifier	 args Length
]	TokenNameRBRACKET	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
CONFLICT_WITH_DASH_C	TokenNameIdentifier	 CONFLICT  WITH  DASH  C
[	TokenNameLBRACKET	
conflictLength	TokenNameIdentifier	 conflict Length
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conflictLength	TokenNameIdentifier	 conflict Length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
argsLength	TokenNameIdentifier	 args Length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nativeBuild	TokenNameIdentifier	 native Build
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
CONFLICT_WITH_DASH_C	TokenNameIdentifier	 CONFLICT  WITH  DASH  C
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"-o"	TokenNameStringLiteral	-o
,	TokenNameCOMMA	
"--main="	TokenNameStringLiteral	--main=
,	TokenNameCOMMA	
"-D"	TokenNameStringLiteral	-D
,	TokenNameCOMMA	
"-fjni"	TokenNameStringLiteral	-fjni
,	TokenNameCOMMA	
"-L"	TokenNameStringLiteral	-L
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
