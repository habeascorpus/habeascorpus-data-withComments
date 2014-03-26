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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
compilers	TokenNameIdentifier	 compilers
.	TokenNameDOT	
CompilerAdapter	TokenNameIdentifier	 Compiler Adapter
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
CompilerAdapterFactory	TokenNameIdentifier	 Compiler Adapter Factory
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
Javac13	TokenNameIdentifier	 Javac13
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
JavacExternal	TokenNameIdentifier	 Javac External
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Testcase for <javac>. * */	TokenNameCOMMENT_JAVADOC	 Testcase for <javac>. 
public	TokenNamepublic	
class	TokenNameclass	
JavacTest	TokenNameIdentifier	 Javac Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Javac	TokenNameIdentifier	 Javac
javac	TokenNameIdentifier	 javac
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JavacTest	TokenNameIdentifier	 Javac Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
=	TokenNameEQUAL	
new	TokenNamenew	
Javac	TokenNameIdentifier	 Javac
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test setting the name of the javac executable. */	TokenNameCOMMENT_JAVADOC	 Test setting the name of the javac executable. 
public	TokenNamepublic	
void	TokenNamevoid	
testForkedExecutableName	TokenNameIdentifier	 test Forked Executable Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"no fork means no executable"	TokenNameStringLiteral	no fork means no executable
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getJavacExecutable	TokenNameIdentifier	 get Javac Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"build.compiler"	TokenNameStringLiteral	build.compiler
,	TokenNameCOMMA	
"modern"	TokenNameStringLiteral	modern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"no fork means no executable"	TokenNameStringLiteral	no fork means no executable
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getJavacExecutable	TokenNameIdentifier	 get Javac Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"normal fork"	TokenNameStringLiteral	normal fork
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getJavacExecutable	TokenNameIdentifier	 get Javac Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"name should contain "javac""	TokenNameStringLiteral	name should contain "javac"
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getJavacExecutable	TokenNameIdentifier	 get Javac Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"javac"	TokenNameStringLiteral	javac
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"build.compiler"	TokenNameStringLiteral	build.compiler
,	TokenNameCOMMA	
"extJavac"	TokenNameStringLiteral	extJavac
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"fork via property"	TokenNameStringLiteral	fork via property
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getJavacExecutable	TokenNameIdentifier	 get Javac Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"name should contain "javac""	TokenNameStringLiteral	name should contain "javac"
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getJavacExecutable	TokenNameIdentifier	 get Javac Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"javac"	TokenNameStringLiteral	javac
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"build.compiler"	TokenNameStringLiteral	build.compiler
,	TokenNameCOMMA	
"whatever"	TokenNameStringLiteral	whatever
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"no fork and not extJavac means no executable"	TokenNameStringLiteral	no fork and not extJavac means no executable
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getJavacExecutable	TokenNameIdentifier	 get Javac Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
myJavac	TokenNameIdentifier	 my Javac
=	TokenNameEQUAL	
"Slartibartfast"	TokenNameStringLiteral	Slartibartfast
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
myJavac	TokenNameIdentifier	 my Javac
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
myJavac	TokenNameIdentifier	 my Javac
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getJavacExecutable	TokenNameIdentifier	 get Javac Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test nested compiler args. */	TokenNameCOMMENT_JAVADOC	 Test nested compiler args. 
public	TokenNamepublic	
void	TokenNamevoid	
testCompilerArg	TokenNameIdentifier	 test Compiler Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCurrentCompilerArgs	TokenNameIdentifier	 get Current Compiler Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"no args"	TokenNameStringLiteral	no args
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Javac	TokenNameIdentifier	 Javac
.	TokenNameDOT	
ImplementationSpecificArgument	TokenNameIdentifier	 Implementation Specific Argument
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
createCompilerArg	TokenNameIdentifier	 create Compiler Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ford	TokenNameIdentifier	 ford
=	TokenNameEQUAL	
"Ford"	TokenNameStringLiteral	Ford
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefect	TokenNameIdentifier	 prefect
=	TokenNameEQUAL	
"Prefect"	TokenNameStringLiteral	Prefect
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
testArg	TokenNameIdentifier	 test Arg
=	TokenNameEQUAL	
ford	TokenNameIdentifier	 ford
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
prefect	TokenNameIdentifier	 prefect
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
testArg	TokenNameIdentifier	 test Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCurrentCompilerArgs	TokenNameIdentifier	 get Current Compiler Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"unconditional single arg"	TokenNameStringLiteral	unconditional single arg
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
testArg	TokenNameIdentifier	 test Arg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
setCompiler	TokenNameIdentifier	 set Compiler
(	TokenNameLPAREN	
"jikes"	TokenNameStringLiteral	jikes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCurrentCompilerArgs	TokenNameIdentifier	 get Current Compiler Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"implementation is jikes but build.compiler is null"	TokenNameStringLiteral	implementation is jikes but build.compiler is null
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"build.compiler"	TokenNameStringLiteral	build.compiler
,	TokenNameCOMMA	
"jvc"	TokenNameStringLiteral	jvc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCurrentCompilerArgs	TokenNameIdentifier	 get Current Compiler Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"implementation is jikes but build.compiler is jvc"	TokenNameStringLiteral	implementation is jikes but build.compiler is jvc
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"build.compiler"	TokenNameStringLiteral	build.compiler
,	TokenNameCOMMA	
"jikes"	TokenNameStringLiteral	jikes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCurrentCompilerArgs	TokenNameIdentifier	 get Current Compiler Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"both are jikes"	TokenNameStringLiteral	both are jikes
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
testArg	TokenNameIdentifier	 test Arg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
setLine	TokenNameIdentifier	 set Line
(	TokenNameLPAREN	
testArg	TokenNameIdentifier	 test Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCurrentCompilerArgs	TokenNameIdentifier	 get Current Compiler Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"split at space"	TokenNameStringLiteral	split at space
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ford	TokenNameIdentifier	 ford
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
prefect	TokenNameIdentifier	 prefect
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test nested compiler args in the fork="true" and * implementation="extJavac" case. */	TokenNameCOMMENT_JAVADOC	 Test nested compiler args in the fork="true" and implementation="extJavac" case. 
public	TokenNamepublic	
void	TokenNamevoid	
testCompilerArgForForkAndExtJavac	TokenNameIdentifier	 test Compiler Arg For Fork And Ext Javac
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Javac	TokenNameIdentifier	 Javac
.	TokenNameDOT	
ImplementationSpecificArgument	TokenNameIdentifier	 Implementation Specific Argument
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
createCompilerArg	TokenNameIdentifier	 create Compiler Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ford	TokenNameIdentifier	 ford
=	TokenNameEQUAL	
"Ford"	TokenNameStringLiteral	Ford
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefect	TokenNameIdentifier	 prefect
=	TokenNameEQUAL	
"Prefect"	TokenNameStringLiteral	Prefect
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
testArg	TokenNameIdentifier	 test Arg
=	TokenNameEQUAL	
ford	TokenNameIdentifier	 ford
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
prefect	TokenNameIdentifier	 prefect
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
testArg	TokenNameIdentifier	 test Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
setCompiler	TokenNameIdentifier	 set Compiler
(	TokenNameLPAREN	
"extJavac"	TokenNameStringLiteral	extJavac
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCurrentCompilerArgs	TokenNameIdentifier	 get Current Compiler Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"both are forked javac"	TokenNameStringLiteral	both are forked javac
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
testArg	TokenNameIdentifier	 test Arg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test compiler attribute. */	TokenNameCOMMENT_JAVADOC	 Test compiler attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
testCompilerAttribute	TokenNameIdentifier	 test Compiler Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check defaults 	TokenNameCOMMENT_LINE	check defaults 
String	TokenNameIdentifier	 String
compiler	TokenNameIdentifier	 compiler
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"build.compiler"	TokenNameStringLiteral	build.compiler
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"build.compiler"	TokenNameStringLiteral	build.compiler
)	TokenNameRPAREN	
,	TokenNameCOMMA	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"default value"	TokenNameStringLiteral	default value
,	TokenNameCOMMA	
"javac1.1"	TokenNameStringLiteral	javac1.1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"javac1.2"	TokenNameStringLiteral	javac1.2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"javac1.3"	TokenNameStringLiteral	javac1.3
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"javac1.4"	TokenNameStringLiteral	javac1.4
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"javac1.5"	TokenNameStringLiteral	javac1.5
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"classic"	TokenNameStringLiteral	classic
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"extJavac"	TokenNameStringLiteral	extJavac
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCompilerVersion	TokenNameIdentifier	 get Compiler Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check build.compiler provides defaults 	TokenNameCOMMENT_LINE	check build.compiler provides defaults 
javac	TokenNameIdentifier	 javac
=	TokenNameEQUAL	
new	TokenNamenew	
Javac	TokenNameIdentifier	 Javac
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// setUserProperty to override system properties 	TokenNameCOMMENT_LINE	setUserProperty to override system properties 
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"build.compiler"	TokenNameStringLiteral	build.compiler
,	TokenNameCOMMA	
"jikes"	TokenNameStringLiteral	jikes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compiler	TokenNameIdentifier	 compiler
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"jikes"	TokenNameStringLiteral	jikes
,	TokenNameCOMMA	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compiler	TokenNameIdentifier	 compiler
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"jikes"	TokenNameStringLiteral	jikes
,	TokenNameCOMMA	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check attribute overrides build.compiler 	TokenNameCOMMENT_LINE	check attribute overrides build.compiler 
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setCompiler	TokenNameIdentifier	 set Compiler
(	TokenNameLPAREN	
"jvc"	TokenNameStringLiteral	jvc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compiler	TokenNameIdentifier	 compiler
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"jvc"	TokenNameStringLiteral	jvc
,	TokenNameCOMMA	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compiler	TokenNameIdentifier	 compiler
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"jvc"	TokenNameStringLiteral	jvc
,	TokenNameCOMMA	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCompilerAdapter	TokenNameIdentifier	 test Compiler Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setCompiler	TokenNameIdentifier	 set Compiler
(	TokenNameLPAREN	
"javac1.4"	TokenNameStringLiteral	javac1.4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setDepend	TokenNameIdentifier	 set Depend
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompilerAdapter	TokenNameIdentifier	 Compiler Adapter
adapter	TokenNameIdentifier	 adapter
=	TokenNameEQUAL	
CompilerAdapterFactory	TokenNameIdentifier	 Compiler Adapter Factory
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
adapter	TokenNameIdentifier	 adapter
instanceof	TokenNameinstanceof	
Javac13	TokenNameIdentifier	 Javac13
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
adapter	TokenNameIdentifier	 adapter
=	TokenNameEQUAL	
CompilerAdapterFactory	TokenNameIdentifier	 Compiler Adapter Factory
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
adapter	TokenNameIdentifier	 adapter
instanceof	TokenNameinstanceof	
JavacExternal	TokenNameIdentifier	 Javac External
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSourceNoDefault	TokenNameIdentifier	 test Source No Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSourceWithDefault	TokenNameIdentifier	 test Source With Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
"ant.build.javac.source"	TokenNameStringLiteral	ant.build.javac.source
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1.4"	TokenNameStringLiteral	1.4
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSourceOverridesDefault	TokenNameIdentifier	 test Source Overrides Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
"ant.build.javac.source"	TokenNameStringLiteral	ant.build.javac.source
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTargetNoDefault	TokenNameIdentifier	 test Target No Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTargetWithDefault	TokenNameIdentifier	 test Target With Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
"ant.build.javac.target"	TokenNameStringLiteral	ant.build.javac.target
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1.4"	TokenNameStringLiteral	1.4
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTargetOverridesDefault	TokenNameIdentifier	 test Target Overrides Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
"ant.build.javac.target"	TokenNameStringLiteral	ant.build.javac.target
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
