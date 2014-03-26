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
Javac	TokenNameIdentifier	 Javac
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DefaultCompilerAdapterTest	TokenNameIdentifier	 Default Compiler Adapter Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
LogCapturingJavac	TokenNameIdentifier	 Log Capturing Javac
extends	TokenNameextends	
Javac	TokenNameIdentifier	 Javac
{	TokenNameLBRACE	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
int	TokenNameint	
msgLevel	TokenNameIdentifier	 msg Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SourceTargetHelper	TokenNameIdentifier	 Source Target Helper
extends	TokenNameextends	
DefaultCompilerAdapter	TokenNameIdentifier	 Default Compiler Adapter
{	TokenNameLBRACE	
/** * Overridden to have no effect. */	TokenNameCOMMENT_JAVADOC	 Overridden to have no effect. 
protected	TokenNameprotected	
Commandline	TokenNameIdentifier	 Commandline
setupJavacCommandlineSwitches	TokenNameIdentifier	 setup Javac Commandline Switches
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cmd	TokenNameIdentifier	 cmd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * public to avoid classloader issues. */	TokenNameCOMMENT_JAVADOC	 public to avoid classloader issues. 
public	TokenNamepublic	
Commandline	TokenNameIdentifier	 Commandline
setupModernJavacCommandlineSwitches	TokenNameIdentifier	 setup Modern Javac Commandline Switches
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
setupModernJavacCommandlineSwitches	TokenNameIdentifier	 setup Modern Javac Commandline Switches
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSourceIsIgnoredForJavac13	TokenNameIdentifier	 test Source Is Ignored For Javac13
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.3"	TokenNameStringLiteral	javac1.3
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.3"	TokenNameStringLiteral	javac1.3
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.3"	TokenNameStringLiteral	javac1.3
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.3"	TokenNameStringLiteral	javac1.3
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSource11IsUpgradedTo13	TokenNameIdentifier	 test Source11 Is Upgraded To13
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
"javac1.4"	TokenNameStringLiteral	javac1.4
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
"javac1.5"	TokenNameStringLiteral	javac1.5
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
"javac1.6"	TokenNameStringLiteral	javac1.6
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
"javac1.7"	TokenNameStringLiteral	javac1.7
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
"javac1.8"	TokenNameStringLiteral	javac1.8
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSource12IsUpgradedTo13	TokenNameIdentifier	 test Source12 Is Upgraded To13
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
"javac1.4"	TokenNameStringLiteral	javac1.4
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
"javac1.5"	TokenNameStringLiteral	javac1.5
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
"javac1.6"	TokenNameStringLiteral	javac1.6
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
"javac1.7"	TokenNameStringLiteral	javac1.7
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
"javac1.8"	TokenNameStringLiteral	javac1.8
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testImplicitSourceForJava15	TokenNameIdentifier	 test Implicit Source For Java15
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commonSourceDowngrades	TokenNameIdentifier	 common Source Downgrades
(	TokenNameLPAREN	
"javac1.5"	TokenNameStringLiteral	javac1.5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.5"	TokenNameStringLiteral	javac1.5
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"1.5"	TokenNameStringLiteral	1.5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.5"	TokenNameStringLiteral	javac1.5
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testImplicitSourceForJava16	TokenNameIdentifier	 test Implicit Source For Java16
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commonSourceDowngrades	TokenNameIdentifier	 common Source Downgrades
(	TokenNameLPAREN	
"javac1.6"	TokenNameStringLiteral	javac1.6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.6"	TokenNameStringLiteral	javac1.6
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"1.5"	TokenNameStringLiteral	1.5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.6"	TokenNameStringLiteral	javac1.6
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.6"	TokenNameStringLiteral	javac1.6
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"1.6"	TokenNameStringLiteral	1.6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.6"	TokenNameStringLiteral	javac1.6
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testImplicitSourceForJava17	TokenNameIdentifier	 test Implicit Source For Java17
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commonSourceDowngrades	TokenNameIdentifier	 common Source Downgrades
(	TokenNameLPAREN	
"javac1.7"	TokenNameStringLiteral	javac1.7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
,	TokenNameCOMMA	
"javac1.7"	TokenNameStringLiteral	javac1.7
,	TokenNameCOMMA	
"If you specify -target 1.5 you now must also specify"	TokenNameStringLiteral	If you specify -target 1.5 you now must also specify
+	TokenNamePLUS	
" -source 1.5"	TokenNameStringLiteral	 -source 1.5
,	TokenNameCOMMA	
"1.5"	TokenNameStringLiteral	1.5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.6"	TokenNameStringLiteral	1.6
,	TokenNameCOMMA	
"javac1.7"	TokenNameStringLiteral	javac1.7
,	TokenNameCOMMA	
"If you specify -target 1.6 you now must also specify"	TokenNameStringLiteral	If you specify -target 1.6 you now must also specify
+	TokenNamePLUS	
" -source 1.6"	TokenNameStringLiteral	 -source 1.6
,	TokenNameCOMMA	
"1.6"	TokenNameStringLiteral	1.6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"5"	TokenNameStringLiteral	5
,	TokenNameCOMMA	
"javac1.7"	TokenNameStringLiteral	javac1.7
,	TokenNameCOMMA	
"If you specify -target 5 you now must also specify"	TokenNameStringLiteral	If you specify -target 5 you now must also specify
+	TokenNamePLUS	
" -source 5"	TokenNameStringLiteral	 -source 5
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"6"	TokenNameStringLiteral	6
,	TokenNameCOMMA	
"javac1.7"	TokenNameStringLiteral	javac1.7
,	TokenNameCOMMA	
"If you specify -target 6 you now must also specify"	TokenNameStringLiteral	If you specify -target 6 you now must also specify
+	TokenNamePLUS	
" -source 6"	TokenNameStringLiteral	 -source 6
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.7"	TokenNameStringLiteral	javac1.7
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"1.7"	TokenNameStringLiteral	1.7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.7"	TokenNameStringLiteral	javac1.7
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"7"	TokenNameStringLiteral	7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testImplicitSourceForJava18	TokenNameIdentifier	 test Implicit Source For Java18
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commonSourceDowngrades	TokenNameIdentifier	 common Source Downgrades
(	TokenNameLPAREN	
"javac1.8"	TokenNameStringLiteral	javac1.8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
,	TokenNameCOMMA	
"javac1.8"	TokenNameStringLiteral	javac1.8
,	TokenNameCOMMA	
"If you specify -target 1.5 you now must also specify"	TokenNameStringLiteral	If you specify -target 1.5 you now must also specify
+	TokenNamePLUS	
" -source 1.5"	TokenNameStringLiteral	 -source 1.5
,	TokenNameCOMMA	
"1.5"	TokenNameStringLiteral	1.5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.6"	TokenNameStringLiteral	1.6
,	TokenNameCOMMA	
"javac1.8"	TokenNameStringLiteral	javac1.8
,	TokenNameCOMMA	
"If you specify -target 1.6 you now must also specify"	TokenNameStringLiteral	If you specify -target 1.6 you now must also specify
+	TokenNamePLUS	
" -source 1.6"	TokenNameStringLiteral	 -source 1.6
,	TokenNameCOMMA	
"1.6"	TokenNameStringLiteral	1.6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.7"	TokenNameStringLiteral	1.7
,	TokenNameCOMMA	
"javac1.8"	TokenNameStringLiteral	javac1.8
,	TokenNameCOMMA	
"If you specify -target 1.7 you now must also specify"	TokenNameStringLiteral	If you specify -target 1.7 you now must also specify
+	TokenNamePLUS	
" -source 1.7"	TokenNameStringLiteral	 -source 1.7
,	TokenNameCOMMA	
"1.7"	TokenNameStringLiteral	1.7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"5"	TokenNameStringLiteral	5
,	TokenNameCOMMA	
"javac1.8"	TokenNameStringLiteral	javac1.8
,	TokenNameCOMMA	
"If you specify -target 5 you now must also specify"	TokenNameStringLiteral	If you specify -target 5 you now must also specify
+	TokenNamePLUS	
" -source 5"	TokenNameStringLiteral	 -source 5
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"6"	TokenNameStringLiteral	6
,	TokenNameCOMMA	
"javac1.8"	TokenNameStringLiteral	javac1.8
,	TokenNameCOMMA	
"If you specify -target 6 you now must also specify"	TokenNameStringLiteral	If you specify -target 6 you now must also specify
+	TokenNamePLUS	
" -source 6"	TokenNameStringLiteral	 -source 6
,	TokenNameCOMMA	
"6"	TokenNameStringLiteral	6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"7"	TokenNameStringLiteral	7
,	TokenNameCOMMA	
"javac1.8"	TokenNameStringLiteral	javac1.8
,	TokenNameCOMMA	
"If you specify -target 7 you now must also specify"	TokenNameStringLiteral	If you specify -target 7 you now must also specify
+	TokenNamePLUS	
" -source 7"	TokenNameStringLiteral	 -source 7
,	TokenNameCOMMA	
"7"	TokenNameStringLiteral	7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.8"	TokenNameStringLiteral	javac1.8
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"1.8"	TokenNameStringLiteral	1.8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"javac1.8"	TokenNameStringLiteral	javac1.8
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"8"	TokenNameStringLiteral	8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
commonSourceDowngrades	TokenNameIdentifier	 common Source Downgrades
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
javaVersion	TokenNameIdentifier	 java Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
javaVersion	TokenNameIdentifier	 java Version
,	TokenNameCOMMA	
"If you specify -target 1.1 you now must also specify"	TokenNameStringLiteral	If you specify -target 1.1 you now must also specify
+	TokenNamePLUS	
" -source 1.3"	TokenNameStringLiteral	 -source 1.3
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
javaVersion	TokenNameIdentifier	 java Version
,	TokenNameCOMMA	
"If you specify -target 1.2 you now must also specify"	TokenNameStringLiteral	If you specify -target 1.2 you now must also specify
+	TokenNamePLUS	
" -source 1.3"	TokenNameStringLiteral	 -source 1.3
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
javaVersion	TokenNameIdentifier	 java Version
,	TokenNameCOMMA	
"If you specify -target 1.3 you now must also specify"	TokenNameStringLiteral	If you specify -target 1.3 you now must also specify
+	TokenNamePLUS	
" -source 1.3"	TokenNameStringLiteral	 -source 1.3
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
"1.4"	TokenNameStringLiteral	1.4
,	TokenNameCOMMA	
javaVersion	TokenNameIdentifier	 java Version
,	TokenNameCOMMA	
"If you specify -target 1.4 you now must also specify"	TokenNameStringLiteral	If you specify -target 1.4 you now must also specify
+	TokenNamePLUS	
" -source 1.4"	TokenNameStringLiteral	 -source 1.4
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expectedSource	TokenNameIdentifier	 expected Source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
javaVersion	TokenNameIdentifier	 java Version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expectedLog	TokenNameIdentifier	 expected Log
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
configuredTarget	TokenNameIdentifier	 configured Target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
expectedSource	TokenNameIdentifier	 expected Source
,	TokenNameCOMMA	
javaVersion	TokenNameIdentifier	 java Version
,	TokenNameCOMMA	
expectedLog	TokenNameIdentifier	 expected Log
,	TokenNameCOMMA	
configuredTarget	TokenNameIdentifier	 configured Target
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testSource	TokenNameIdentifier	 test Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expectedSource	TokenNameIdentifier	 expected Source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
javaVersion	TokenNameIdentifier	 java Version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expectedLog	TokenNameIdentifier	 expected Log
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
configuredTarget	TokenNameIdentifier	 configured Target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
configuredSource	TokenNameIdentifier	 configured Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogCapturingJavac	TokenNameIdentifier	 Log Capturing Javac
javac	TokenNameIdentifier	 javac
=	TokenNameEQUAL	
new	TokenNamenew	
LogCapturingJavac	TokenNameIdentifier	 Log Capturing Javac
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setCompiler	TokenNameIdentifier	 set Compiler
(	TokenNameLPAREN	
javaVersion	TokenNameIdentifier	 java Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
configuredSource	TokenNameIdentifier	 configured Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
configuredTarget	TokenNameIdentifier	 configured Target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SourceTargetHelper	TokenNameIdentifier	 Source Target Helper
sth	TokenNameIdentifier	 sth
=	TokenNameEQUAL	
new	TokenNamenew	
SourceTargetHelper	TokenNameIdentifier	 Source Target Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sth	TokenNameIdentifier	 sth
.	TokenNameDOT	
setJavac	TokenNameIdentifier	 set Javac
(	TokenNameLPAREN	
javac	TokenNameIdentifier	 javac
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
new	TokenNamenew	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sth	TokenNameIdentifier	 sth
.	TokenNameDOT	
setupModernJavacCommandlineSwitches	TokenNameIdentifier	 setup Modern Javac Commandline Switches
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
expectedLog	TokenNameIdentifier	 expected Log
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
javac	TokenNameIdentifier	 javac
.	TokenNameDOT	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected to find '"	TokenNameStringLiteral	expected to find '
+	TokenNamePLUS	
expectedLog	TokenNameIdentifier	 expected Log
+	TokenNamePLUS	
"' in '"	TokenNameStringLiteral	' in '
+	TokenNamePLUS	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
expectedLog	TokenNameIdentifier	 expected Log
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedSource	TokenNameIdentifier	 expected Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectedSource	TokenNameIdentifier	 expected Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"-source"	TokenNameStringLiteral	-source
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedSource	TokenNameIdentifier	 expected Source
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
