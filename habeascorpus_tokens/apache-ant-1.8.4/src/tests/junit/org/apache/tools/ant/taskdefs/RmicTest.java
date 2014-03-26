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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Testcase for <rmic>. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Testcase for <rmic>. * @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
RmicTest	TokenNameIdentifier	 Rmic Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Rmic	TokenNameIdentifier	 Rmic
rmic	TokenNameIdentifier	 rmic
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RmicTest	TokenNameIdentifier	 Rmic Test
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
rmic	TokenNameIdentifier	 rmic
=	TokenNameEQUAL	
new	TokenNamenew	
Rmic	TokenNameIdentifier	 Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rmic	TokenNameIdentifier	 rmic
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
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
rmic	TokenNameIdentifier	 rmic
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
Rmic	TokenNameIdentifier	 Rmic
.	TokenNameDOT	
ImplementationSpecificArgument	TokenNameIdentifier	 Implementation Specific Argument
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
rmic	TokenNameIdentifier	 rmic
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
rmic	TokenNameIdentifier	 rmic
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
"weblogic"	TokenNameStringLiteral	weblogic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
rmic	TokenNameIdentifier	 rmic
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
"implementation is weblogic but build.rmic is null"	TokenNameStringLiteral	implementation is weblogic but build.rmic is null
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
"build.rmic"	TokenNameStringLiteral	build.rmic
,	TokenNameCOMMA	
"sun"	TokenNameStringLiteral	sun
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
rmic	TokenNameIdentifier	 rmic
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
"implementation is weblogic but build.rmic is sun"	TokenNameStringLiteral	implementation is weblogic but build.rmic is sun
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
"build.rmic"	TokenNameStringLiteral	build.rmic
,	TokenNameCOMMA	
"weblogic"	TokenNameStringLiteral	weblogic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
rmic	TokenNameIdentifier	 rmic
.	TokenNameDOT	
getCurrentCompilerArgs	TokenNameIdentifier	 get Current Compiler Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"both are weblogic"	TokenNameStringLiteral	both are weblogic
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
rmic	TokenNameIdentifier	 rmic
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
"expected sun or kaffe, but found "	TokenNameStringLiteral	expected sun or kaffe, but found 
+	TokenNamePLUS	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
"default"	TokenNameStringLiteral	default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
"build.rmic"	TokenNameStringLiteral	build.rmic
,	TokenNameCOMMA	
"weblogic"	TokenNameStringLiteral	weblogic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compiler	TokenNameIdentifier	 compiler
=	TokenNameEQUAL	
rmic	TokenNameIdentifier	 rmic
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
"weblogic"	TokenNameStringLiteral	weblogic
,	TokenNameCOMMA	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check attribute overrides build.compiler 	TokenNameCOMMENT_LINE	check attribute overrides build.compiler 
rmic	TokenNameIdentifier	 rmic
.	TokenNameDOT	
setCompiler	TokenNameIdentifier	 set Compiler
(	TokenNameLPAREN	
"kaffe"	TokenNameStringLiteral	kaffe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compiler	TokenNameIdentifier	 compiler
=	TokenNameEQUAL	
rmic	TokenNameIdentifier	 rmic
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
"kaffe"	TokenNameStringLiteral	kaffe
,	TokenNameCOMMA	
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
