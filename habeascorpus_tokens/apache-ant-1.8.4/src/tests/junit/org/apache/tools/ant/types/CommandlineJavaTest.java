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
types	TokenNameIdentifier	 types
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
MagicNames	TokenNameIdentifier	 Magic Names
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
/** * JUnit 3 testcases for org.apache.tools.ant.CommandlineJava * */	TokenNameCOMMENT_JAVADOC	 JUnit 3 testcases for org.apache.tools.ant.CommandlineJava 
public	TokenNamepublic	
class	TokenNameclass	
CommandlineJavaTest	TokenNameIdentifier	 Commandline Java Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
cloneVm	TokenNameIdentifier	 clone Vm
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CommandlineJavaTest	TokenNameIdentifier	 Commandline Java Test
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
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
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
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"build.sysclasspath"	TokenNameStringLiteral	build.sysclasspath
,	TokenNameCOMMA	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cloneVm	TokenNameIdentifier	 clone Vm
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"ant.build.clonevm"	TokenNameStringLiteral	ant.build.clonevm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cloneVm	TokenNameIdentifier	 clone Vm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"ant.build.clonevm"	TokenNameStringLiteral	ant.build.clonevm
,	TokenNameCOMMA	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cloneVm	TokenNameIdentifier	 clone Vm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"ant.build.clonevm"	TokenNameStringLiteral	ant.build.clonevm
,	TokenNameCOMMA	
cloneVm	TokenNameIdentifier	 clone Vm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetCommandline	TokenNameIdentifier	 test Get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CommandlineJava	TokenNameIdentifier	 Commandline Java
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
CommandlineJava	TokenNameIdentifier	 Commandline Java
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"org.apache.tools.ant.CommandlineJavaTest"	TokenNameStringLiteral	org.apache.tools.ant.CommandlineJavaTest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
"junit.textui.TestRunner"	TokenNameStringLiteral	junit.textui.TestRunner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
createVmArgument	TokenNameIdentifier	 create Vm Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Djava.compiler=NONE"	TokenNameStringLiteral	-Djava.compiler=NONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"no classpath"	TokenNameStringLiteral	no classpath
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * After changing CommandlineJava to search for the java * executable, I don't know, how to tests the value returned * here without using the same logic as applied in the class * itself. * * assertTrue("no classpath", "java", s[0]); */	TokenNameCOMMENT_BLOCK	 After changing CommandlineJava to search for the java executable, I don't know, how to tests the value returned here without using the same logic as applied in the class itself. * assertTrue("no classpath", "java", s[0]); 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"no classpath"	TokenNameStringLiteral	no classpath
,	TokenNameCOMMA	
"-Djava.compiler=NONE"	TokenNameStringLiteral	-Djava.compiler=NONE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"no classpath"	TokenNameStringLiteral	no classpath
,	TokenNameCOMMA	
"junit.textui.TestRunner"	TokenNameStringLiteral	junit.textui.TestRunner
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"no classpath"	TokenNameStringLiteral	no classpath
,	TokenNameCOMMA	
"org.apache.tools.ant.CommandlineJavaTest"	TokenNameStringLiteral	org.apache.tools.ant.CommandlineJavaTest
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
CommandlineJava	TokenNameIdentifier	 Commandline Java
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CommandlineJava	TokenNameIdentifier	 Commandline Java
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"cloning should work without classpath specified"	TokenNameStringLiteral	cloning should work without classpath specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"build.xml"	TokenNameStringLiteral	build.xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
ANT_HOME	TokenNameIdentifier	 ANT  HOME
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/lib/ant.jar"	TokenNameStringLiteral	/lib/ant.jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"with classpath"	TokenNameStringLiteral	with classpath
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// assertEquals("with classpath", "java", s[0]); 	TokenNameCOMMENT_LINE	assertEquals("with classpath", "java", s[0]); 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"with classpath"	TokenNameStringLiteral	with classpath
,	TokenNameCOMMA	
"-Djava.compiler=NONE"	TokenNameStringLiteral	-Djava.compiler=NONE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"with classpath"	TokenNameStringLiteral	with classpath
,	TokenNameCOMMA	
"-classpath"	TokenNameStringLiteral	-classpath
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"build.xml contained"	TokenNameStringLiteral	build.xml contained
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"build.xml"	TokenNameStringLiteral	build.xml
+	TokenNamePLUS	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparator	TokenNameIdentifier	 path Separator
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"ant.jar contained"	TokenNameStringLiteral	ant.jar contained
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"ant.jar"	TokenNameStringLiteral	ant.jar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"with classpath"	TokenNameStringLiteral	with classpath
,	TokenNameCOMMA	
"junit.textui.TestRunner"	TokenNameStringLiteral	junit.textui.TestRunner
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"with classpath"	TokenNameStringLiteral	with classpath
,	TokenNameCOMMA	
"org.apache.tools.ant.CommandlineJavaTest"	TokenNameStringLiteral	org.apache.tools.ant.CommandlineJavaTest
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJarOption	TokenNameIdentifier	 test Jar Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CommandlineJava	TokenNameIdentifier	 Commandline Java
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
CommandlineJava	TokenNameIdentifier	 Commandline Java
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"arg1"	TokenNameStringLiteral	arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setJar	TokenNameIdentifier	 set Jar
(	TokenNameLPAREN	
"myfile.jar"	TokenNameStringLiteral	myfile.jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
createVmArgument	TokenNameIdentifier	 create Vm Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-classic"	TokenNameStringLiteral	-classic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
createVmArgument	TokenNameIdentifier	 create Vm Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Dx=y"	TokenNameStringLiteral	-Dx=y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"-classic"	TokenNameStringLiteral	-classic
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"-Dx=y"	TokenNameStringLiteral	-Dx=y
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"-jar"	TokenNameStringLiteral	-jar
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"myfile.jar"	TokenNameStringLiteral	myfile.jar
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"arg1"	TokenNameStringLiteral	arg1
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSysproperties	TokenNameIdentifier	 test Sysproperties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
currentClasspath	TokenNameIdentifier	 current Classpath
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.class.path"	TokenNameStringLiteral	java.class.path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
currentClasspath	TokenNameIdentifier	 current Classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommandlineJava	TokenNameIdentifier	 Commandline Java
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
CommandlineJava	TokenNameIdentifier	 Commandline Java
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Environment	TokenNameIdentifier	 Environment
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Environment	TokenNameIdentifier	 Environment
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setKey	TokenNameIdentifier	 set Key
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
addSysproperty	TokenNameIdentifier	 add Sysproperty
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"key2"	TokenNameStringLiteral	key2
,	TokenNameCOMMA	
"value2"	TokenNameStringLiteral	value2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertySet	TokenNameIdentifier	 Property Set
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
new	TokenNamenew	
PropertySet	TokenNameIdentifier	 Property Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
appendName	TokenNameIdentifier	 append Name
(	TokenNameLPAREN	
"key2"	TokenNameStringLiteral	key2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
addSyspropertyset	TokenNameIdentifier	 add Syspropertyset
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newClasspath	TokenNameIdentifier	 new Classpath
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.class.path"	TokenNameStringLiteral	java.class.path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
newClasspath	TokenNameIdentifier	 new Classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
currentClasspath	TokenNameIdentifier	 current Classpath
,	TokenNameCOMMA	
newClasspath	TokenNameIdentifier	 new Classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"value"	TokenNameStringLiteral	value
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"java.class.path"	TokenNameStringLiteral	java.class.path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"key2"	TokenNameStringLiteral	key2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"value2"	TokenNameStringLiteral	value2
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"key2"	TokenNameStringLiteral	key2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
restoreSystemProperties	TokenNameIdentifier	 restore System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"key2"	TokenNameStringLiteral	key2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAssertions	TokenNameIdentifier	 test Assertions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CommandlineJava	TokenNameIdentifier	 Commandline Java
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
CommandlineJava	TokenNameIdentifier	 Commandline Java
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"org.apache.tools.ant.CommandlineJavaTest"	TokenNameStringLiteral	org.apache.tools.ant.CommandlineJavaTest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
"junit.textui.TestRunner"	TokenNameStringLiteral	junit.textui.TestRunner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
createVmArgument	TokenNameIdentifier	 create Vm Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Djava.compiler=NONE"	TokenNameStringLiteral	-Djava.compiler=NONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assertions	TokenNameIdentifier	 Assertions
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
Assertions	TokenNameIdentifier	 Assertions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assertions	TokenNameIdentifier	 Assertions
.	TokenNameDOT	
EnabledAssertion	TokenNameIdentifier	 Enabled Assertion
ea	TokenNameIdentifier	 ea
=	TokenNameEQUAL	
new	TokenNamenew	
Assertions	TokenNameIdentifier	 Assertions
.	TokenNameDOT	
EnabledAssertion	TokenNameIdentifier	 Enabled Assertion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ea	TokenNameIdentifier	 ea
.	TokenNameDOT	
setClass	TokenNameIdentifier	 set Class
(	TokenNameLPAREN	
"junit.textui.TestRunner"	TokenNameStringLiteral	junit.textui.TestRunner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
addEnable	TokenNameIdentifier	 add Enable
(	TokenNameLPAREN	
ea	TokenNameIdentifier	 ea
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setAssertions	TokenNameIdentifier	 set Assertions
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
"-Djava.compiler=NONE"	TokenNameStringLiteral	-Djava.compiler=NONE
,	TokenNameCOMMA	
"-ea:junit.textui.TestRunner"	TokenNameStringLiteral	-ea:junit.textui.TestRunner
,	TokenNameCOMMA	
"junit.textui.TestRunner"	TokenNameStringLiteral	junit.textui.TestRunner
,	TokenNameCOMMA	
"org.apache.tools.ant.CommandlineJavaTest"	TokenNameStringLiteral	org.apache.tools.ant.CommandlineJavaTest
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// only the second iteration would pass because of PR 27218 	TokenNameCOMMENT_LINE	only the second iteration would pass because of PR 27218 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
CommandlineJava	TokenNameIdentifier	 Commandline Java
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CommandlineJava	TokenNameIdentifier	 Commandline Java
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
c2	TokenNameIdentifier	 c2
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
