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
File	TokenNameIdentifier	 File
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
.	TokenNameDOT	
Jasper41Mangler	TokenNameIdentifier	 Jasper41 Mangler
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
.	TokenNameDOT	
JspMangler	TokenNameIdentifier	 Jsp Mangler
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
.	TokenNameDOT	
JspNameMangler	TokenNameIdentifier	 Jsp Name Mangler
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
.	TokenNameDOT	
compilers	TokenNameIdentifier	 compilers
.	TokenNameDOT	
JspCompilerAdapter	TokenNameIdentifier	 Jsp Compiler Adapter
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
jsp	TokenNameIdentifier	 jsp
.	TokenNameDOT	
compilers	TokenNameIdentifier	 compilers
.	TokenNameDOT	
JspCompilerAdapterFactory	TokenNameIdentifier	 Jsp Compiler Adapter Factory
;	TokenNameSEMICOLON	
/** * Tests the Jspc task. * * @created 07 March 2002 * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Tests the Jspc task. * @created 07 March 2002 @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
JspcTest	TokenNameIdentifier	 Jspc Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
/** * Description of the Field */	TokenNameCOMMENT_JAVADOC	 Description of the Field 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
baseDir	TokenNameIdentifier	 base Dir
;	TokenNameSEMICOLON	
/** * Description of the Field */	TokenNameCOMMENT_JAVADOC	 Description of the Field 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
outDir	TokenNameIdentifier	 out Dir
;	TokenNameSEMICOLON	
/** * Description of the Field */	TokenNameCOMMENT_JAVADOC	 Description of the Field 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/
;	TokenNameSEMICOLON	
/** * Constructor for the JspcTest object * * @param name Description of Parameter */	TokenNameCOMMENT_JAVADOC	 Constructor for the JspcTest object * @param name Description of Parameter 
public	TokenNamepublic	
JspcTest	TokenNameIdentifier	 Jspc Test
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
/** * The JUnit setup method */	TokenNameCOMMENT_JAVADOC	 The JUnit setup method 
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
"jspc.xml"	TokenNameStringLiteral	jspc.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
baseDir	TokenNameIdentifier	 base Dir
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outDir	TokenNameIdentifier	 out Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
baseDir	TokenNameIdentifier	 base Dir
,	TokenNameCOMMA	
"jsp/java"	TokenNameStringLiteral	jsp/java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The teardown method for JUnit */	TokenNameCOMMENT_JAVADOC	 The teardown method for JUnit 
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
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testSimple	TokenNameIdentifier	 test Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeJspCompile	TokenNameIdentifier	 execute Jsp Compile
(	TokenNameLPAREN	
"testSimple"	TokenNameStringLiteral	testSimple
,	TokenNameCOMMA	
"simple_jsp.java"	TokenNameStringLiteral	simple_jsp.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testUriroot	TokenNameIdentifier	 test Uriroot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeJspCompile	TokenNameIdentifier	 execute Jsp Compile
(	TokenNameLPAREN	
"testUriroot"	TokenNameStringLiteral	testUriroot
,	TokenNameCOMMA	
"uriroot_jsp.java"	TokenNameStringLiteral	uriroot_jsp.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testXml	TokenNameIdentifier	 test Xml
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeJspCompile	TokenNameIdentifier	 execute Jsp Compile
(	TokenNameLPAREN	
"testXml"	TokenNameStringLiteral	testXml
,	TokenNameCOMMA	
"xml_jsp.java"	TokenNameStringLiteral	xml_jsp.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * try a keyword in a file */	TokenNameCOMMENT_JAVADOC	 try a keyword in a file 
public	TokenNamepublic	
void	TokenNamevoid	
testKeyword	TokenNameIdentifier	 test Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeJspCompile	TokenNameIdentifier	 execute Jsp Compile
(	TokenNameLPAREN	
"testKeyword"	TokenNameStringLiteral	testKeyword
,	TokenNameCOMMA	
"default_jsp.java"	TokenNameStringLiteral	default_jsp.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * what happens to 1nvalid-classname */	TokenNameCOMMENT_JAVADOC	 what happens to 1nvalid-classname 
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidClassname	TokenNameIdentifier	 test Invalid Classname
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeJspCompile	TokenNameIdentifier	 execute Jsp Compile
(	TokenNameLPAREN	
"testInvalidClassname"	TokenNameStringLiteral	testInvalidClassname
,	TokenNameCOMMA	
"_1nvalid_0002dclassname_jsp.java"	TokenNameStringLiteral	_1nvalid_0002dclassname_jsp.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testNoTld	TokenNameIdentifier	 test No Tld
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// expectBuildExceptionContaining("testNoTld", 	TokenNameCOMMENT_LINE	expectBuildExceptionContaining("testNoTld", 
// "Jasper found an error in a file", 	TokenNameCOMMENT_LINE	"Jasper found an error in a file", 
// "Java returned: 9"); 	TokenNameCOMMENT_LINE	"Java returned: 9"); 
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testNoTld"	TokenNameStringLiteral	testNoTld
,	TokenNameCOMMA	
"not found"	TokenNameStringLiteral	not found
,	TokenNameCOMMA	
"Java returned: 9"	TokenNameStringLiteral	Java returned: 9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
testNotAJspFile	TokenNameIdentifier	 test Not A Jsp File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testNotAJspFile"	TokenNameStringLiteral	testNotAJspFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * webapp test is currently broken, because it picks up * on the missing_tld file, and bails. */	TokenNameCOMMENT_JAVADOC	 webapp test is currently broken, because it picks up on the missing_tld file, and bails. 
/* public void testWebapp() throws Exception { executeTarget("testWebapp"); } */	TokenNameCOMMENT_BLOCK	 public void testWebapp() throws Exception { executeTarget("testWebapp"); } 
/** * run a target then verify the named file gets created * * @param target Description of Parameter * @param javafile Description of Parameter * @exception Exception trouble */	TokenNameCOMMENT_JAVADOC	 run a target then verify the named file gets created * @param target Description of Parameter @param javafile Description of Parameter @exception Exception trouble 
protected	TokenNameprotected	
void	TokenNamevoid	
executeJspCompile	TokenNameIdentifier	 execute Jsp Compile
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
javafile	TokenNameIdentifier	 javafile
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertJavaFileCreated	TokenNameIdentifier	 assert Java File Created
(	TokenNameLPAREN	
javafile	TokenNameIdentifier	 javafile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verify that a named file was created * * @param filename Description of Parameter * @exception Exception trouble */	TokenNameCOMMENT_JAVADOC	 verify that a named file was created * @param filename Description of Parameter @exception Exception trouble 
protected	TokenNameprotected	
void	TokenNamevoid	
assertJavaFileCreated	TokenNameIdentifier	 assert Java File Created
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
getOutputFile	TokenNameIdentifier	 get Output File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"file "	TokenNameStringLiteral	file 
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
" not found"	TokenNameStringLiteral	 not found
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"file "	TokenNameStringLiteral	file 
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
" is empty"	TokenNameStringLiteral	 is empty
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the OutputFile attribute of the JspcTest object * * @param subpath Description of Parameter * @return The OutputFile value */	TokenNameCOMMENT_JAVADOC	 Gets the OutputFile attribute of the JspcTest object * @param subpath Description of Parameter @return The OutputFile value 
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
getOutputFile	TokenNameIdentifier	 get Output File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
subpath	TokenNameIdentifier	 subpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
outDir	TokenNameIdentifier	 out Dir
,	TokenNameCOMMA	
subpath	TokenNameIdentifier	 subpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verify that we select the appropriate mangler */	TokenNameCOMMENT_JAVADOC	 verify that we select the appropriate mangler 
public	TokenNamepublic	
void	TokenNamevoid	
testJasperNameManglerSelection	TokenNameIdentifier	 test Jasper Name Mangler Selection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JspCompilerAdapter	TokenNameIdentifier	 Jsp Compiler Adapter
adapter	TokenNameIdentifier	 adapter
=	TokenNameEQUAL	
JspCompilerAdapterFactory	TokenNameIdentifier	 Jsp Compiler Adapter Factory
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
"jasper"	TokenNameStringLiteral	jasper
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JspMangler	TokenNameIdentifier	 Jsp Mangler
mangler	TokenNameIdentifier	 mangler
=	TokenNameEQUAL	
adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
createMangler	TokenNameIdentifier	 create Mangler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
mangler	TokenNameIdentifier	 mangler
instanceof	TokenNameinstanceof	
JspNameMangler	TokenNameIdentifier	 Jsp Name Mangler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
adapter	TokenNameIdentifier	 adapter
=	TokenNameEQUAL	
JspCompilerAdapterFactory	TokenNameIdentifier	 Jsp Compiler Adapter Factory
.	TokenNameDOT	
getCompiler	TokenNameIdentifier	 get Compiler
(	TokenNameLPAREN	
"jasper41"	TokenNameStringLiteral	jasper41
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mangler	TokenNameIdentifier	 mangler
=	TokenNameEQUAL	
adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
createMangler	TokenNameIdentifier	 create Mangler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
mangler	TokenNameIdentifier	 mangler
instanceof	TokenNameinstanceof	
Jasper41Mangler	TokenNameIdentifier	 Jasper41 Mangler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJasper41	TokenNameIdentifier	 test Jasper41
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JspMangler	TokenNameIdentifier	 Jsp Mangler
mangler	TokenNameIdentifier	 mangler
=	TokenNameEQUAL	
new	TokenNamenew	
Jasper41Mangler	TokenNameIdentifier	 Jasper41 Mangler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//java keywords are not special 	TokenNameCOMMENT_LINE	java keywords are not special 
assertMapped	TokenNameIdentifier	 assert Mapped
(	TokenNameLPAREN	
mangler	TokenNameIdentifier	 mangler
,	TokenNameCOMMA	
"for.jsp"	TokenNameStringLiteral	for.jsp
,	TokenNameCOMMA	
"for_jsp"	TokenNameStringLiteral	for_jsp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//underscores go in front of invalid start chars 	TokenNameCOMMENT_LINE	underscores go in front of invalid start chars 
assertMapped	TokenNameIdentifier	 assert Mapped
(	TokenNameLPAREN	
mangler	TokenNameIdentifier	 mangler
,	TokenNameCOMMA	
"0.jsp"	TokenNameStringLiteral	0.jsp
,	TokenNameCOMMA	
"_0_jsp"	TokenNameStringLiteral	_0_jsp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//underscores at the front get an underscore too 	TokenNameCOMMENT_LINE	underscores at the front get an underscore too 
assertMapped	TokenNameIdentifier	 assert Mapped
(	TokenNameLPAREN	
mangler	TokenNameIdentifier	 mangler
,	TokenNameCOMMA	
"_.jsp"	TokenNameStringLiteral	_.jsp
,	TokenNameCOMMA	
"___jsp"	TokenNameStringLiteral	___jsp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//non java char at start => underscore then the the _hex value 	TokenNameCOMMENT_LINE	non java char at start => underscore then the the _hex value 
assertMapped	TokenNameIdentifier	 assert Mapped
(	TokenNameLPAREN	
mangler	TokenNameIdentifier	 mangler
,	TokenNameCOMMA	
"-.jsp"	TokenNameStringLiteral	-.jsp
,	TokenNameCOMMA	
"__0002d_jsp"	TokenNameStringLiteral	__0002d_jsp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//and paths are stripped 	TokenNameCOMMENT_LINE	and paths are stripped 
char	TokenNamechar	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
;	TokenNameSEMICOLON	
assertMapped	TokenNameIdentifier	 assert Mapped
(	TokenNameLPAREN	
mangler	TokenNameIdentifier	 mangler
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
"somewhere"	TokenNameStringLiteral	somewhere
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
"file"	TokenNameStringLiteral	file
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
"index.jsp"	TokenNameStringLiteral	index.jsp
,	TokenNameCOMMA	
"index_jsp"	TokenNameStringLiteral	index_jsp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * assert our mapping rules * @param mangler * @param filename * @param classname */	TokenNameCOMMENT_JAVADOC	 assert our mapping rules @param mangler @param filename @param classname 
protected	TokenNameprotected	
void	TokenNamevoid	
assertMapped	TokenNameIdentifier	 assert Mapped
(	TokenNameLPAREN	
JspMangler	TokenNameIdentifier	 Jsp Mangler
mangler	TokenNameIdentifier	 mangler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
mappedname	TokenNameIdentifier	 mappedname
=	TokenNameEQUAL	
mangler	TokenNameIdentifier	 mangler
.	TokenNameDOT	
mapJspToJavaName	TokenNameIdentifier	 map Jsp To Java Name
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
" should have mapped to "	TokenNameStringLiteral	 should have mapped to 
+	TokenNamePLUS	
classname	TokenNameIdentifier	 classname
+	TokenNamePLUS	
" but instead mapped to "	TokenNameStringLiteral	 but instead mapped to 
+	TokenNamePLUS	
mappedname	TokenNameIdentifier	 mappedname
,	TokenNameCOMMA	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
mappedname	TokenNameIdentifier	 mappedname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
