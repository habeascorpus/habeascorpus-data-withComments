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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
BuildFileTest	TokenNameIdentifier	 Build File Test
;	TokenNameSEMICOLON	
/** * If you want to run tests, it is highly recommended * to download ANTLR (www.antlr.org), build the 'antlrall.jar' jar * with <code>make antlr-all.jar</code> and drop the jar (about 300KB) into * Ant lib. * - Running w/ the default antlr.jar (70KB) does not work (missing class) * * Unless of course you specify the ANTLR classpath in your * system classpath. (see ANTLR install.html) * */	TokenNameCOMMENT_JAVADOC	 If you want to run tests, it is highly recommended to download ANTLR (www.antlr.org), build the 'antlrall.jar' jar with <code>make antlr-all.jar</code> and drop the jar (about 300KB) into Ant lib. - Running w/ the default antlr.jar (70KB) does not work (missing class) * Unless of course you specify the ANTLR classpath in your system classpath. (see ANTLR install.html) 
public	TokenNamepublic	
class	TokenNameclass	
ANTLRTest	TokenNameIdentifier	 ANTLR Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/antlr/"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/antlr/
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ANTLRTest	TokenNameIdentifier	 ANTLR Test
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
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
+	TokenNamePLUS	
"antlr.xml"	TokenNameStringLiteral	antlr.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"cleanup"	TokenNameStringLiteral	cleanup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"required argument, target, missing"	TokenNameStringLiteral	required argument, target, missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
,	TokenNameCOMMA	
"Invalid output directory"	TokenNameStringLiteral	Invalid output directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test3"	TokenNameStringLiteral	test3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test4	TokenNameIdentifier	 test4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test4"	TokenNameStringLiteral	test4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test5	TokenNameIdentifier	 test5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should print "panic: Cannot find importVocab file 'JavaTokenTypes.txt'" 	TokenNameCOMMENT_LINE	should print "panic: Cannot find importVocab file 'JavaTokenTypes.txt'" 
// since it needs to run java.g first before java.tree.g 	TokenNameCOMMENT_LINE	since it needs to run java.g first before java.tree.g 
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test5"	TokenNameStringLiteral	test5
,	TokenNameCOMMA	
"ANTLR returned: 1"	TokenNameStringLiteral	ANTLR returned: 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test6	TokenNameIdentifier	 test6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test6"	TokenNameStringLiteral	test6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test7	TokenNameIdentifier	 test7
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test7"	TokenNameStringLiteral	test7
,	TokenNameCOMMA	
"Unable to determine generated class"	TokenNameStringLiteral	Unable to determine generated class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is a negative test for the super grammar (glib) option. */	TokenNameCOMMENT_JAVADOC	 This is a negative test for the super grammar (glib) option. 
public	TokenNamepublic	
void	TokenNamevoid	
test8	TokenNameIdentifier	 test8
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"test8"	TokenNameStringLiteral	test8
,	TokenNameCOMMA	
"Invalid super grammar file"	TokenNameStringLiteral	Invalid super grammar file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is a positive test for the super grammar (glib) option. ANTLR * will throw an error if everything is not correct. */	TokenNameCOMMENT_JAVADOC	 This is a positive test for the super grammar (glib) option. ANTLR will throw an error if everything is not correct. 
public	TokenNamepublic	
void	TokenNamevoid	
test9	TokenNameIdentifier	 test9
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test9"	TokenNameStringLiteral	test9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This test creates an html-ized version of the calculator grammar. * The sanity check is simply whether or not an html file was generated. */	TokenNameCOMMENT_JAVADOC	 This test creates an html-ized version of the calculator grammar. The sanity check is simply whether or not an html file was generated. 
public	TokenNamepublic	
void	TokenNamevoid	
test10	TokenNameIdentifier	 test10
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test10"	TokenNameStringLiteral	test10
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
outputDirectory	TokenNameIdentifier	 output Directory
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
+	TokenNamePLUS	
"antlr.tmp"	TokenNameStringLiteral	antlr.tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
calcFiles	TokenNameIdentifier	 calc Files
=	TokenNameEQUAL	
outputDirectory	TokenNameIdentifier	 output Directory
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
new	TokenNamenew	
HTMLFilter	TokenNameIdentifier	 HTML Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
calcFiles	TokenNameIdentifier	 calc Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is just a quick sanity check to run the diagnostic option and * make sure that it doesn't throw any funny exceptions. */	TokenNameCOMMENT_JAVADOC	 This is just a quick sanity check to run the diagnostic option and make sure that it doesn't throw any funny exceptions. 
public	TokenNamepublic	
void	TokenNamevoid	
test11	TokenNameIdentifier	 test11
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test11"	TokenNameStringLiteral	test11
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is just a quick sanity check to run the trace option and * make sure that it doesn't throw any funny exceptions. */	TokenNameCOMMENT_JAVADOC	 This is just a quick sanity check to run the trace option and make sure that it doesn't throw any funny exceptions. 
public	TokenNamepublic	
void	TokenNamevoid	
test12	TokenNameIdentifier	 test12
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test12"	TokenNameStringLiteral	test12
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is just a quick sanity check to run all the rest of the * trace options (traceLexer, traceParser, and traceTreeWalker) to * make sure that they don't throw any funny exceptions. */	TokenNameCOMMENT_JAVADOC	 This is just a quick sanity check to run all the rest of the trace options (traceLexer, traceParser, and traceTreeWalker) to make sure that they don't throw any funny exceptions. 
public	TokenNamepublic	
void	TokenNamevoid	
test13	TokenNameIdentifier	 test13
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test13"	TokenNameStringLiteral	test13
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoRecompile	TokenNameIdentifier	 test No Recompile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test9"	TokenNameStringLiteral	test9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Skipped grammar file."	TokenNameStringLiteral	Skipped grammar file.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"noRecompile"	TokenNameStringLiteral	noRecompile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Skipped grammar file."	TokenNameStringLiteral	Skipped grammar file.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNormalRecompile	TokenNameIdentifier	 test Normal Recompile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test9"	TokenNameStringLiteral	test9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Skipped grammar file."	TokenNameStringLiteral	Skipped grammar file.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"normalRecompile"	TokenNameStringLiteral	normalRecompile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Skipped grammar file."	TokenNameStringLiteral	Skipped grammar file.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Bugzilla Report 12961 	TokenNameCOMMENT_LINE	Bugzilla Report 12961 
public	TokenNamepublic	
void	TokenNamevoid	
testSupergrammarChangeRecompile	TokenNameIdentifier	 test Supergrammar Change Recompile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test9"	TokenNameStringLiteral	test9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Skipped grammar file."	TokenNameStringLiteral	Skipped grammar file.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"supergrammarChangeRecompile"	TokenNameStringLiteral	supergrammarChangeRecompile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Skipped grammar file."	TokenNameStringLiteral	Skipped grammar file.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
CalcFileFilter	TokenNameIdentifier	 Calc File Filter
implements	TokenNameimplements	
FilenameFilter	TokenNameIdentifier	 Filename Filter
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Calc"	TokenNameStringLiteral	Calc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
HTMLFilter	TokenNameIdentifier	 HTML Filter
implements	TokenNameimplements	
FilenameFilter	TokenNameIdentifier	 Filename Filter
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"html"	TokenNameStringLiteral	html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
