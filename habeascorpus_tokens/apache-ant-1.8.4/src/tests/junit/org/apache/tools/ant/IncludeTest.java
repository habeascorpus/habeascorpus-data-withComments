/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
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
/** * Test the build file inclusion using XML entities. * */	TokenNameCOMMENT_JAVADOC	 Test the build file inclusion using XML entities. 
public	TokenNamepublic	
class	TokenNameclass	
IncludeTest	TokenNameIdentifier	 Include Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
IncludeTest	TokenNameIdentifier	 Include Test
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
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/include/basic/include.xml"	TokenNameStringLiteral	src/etc/testcases/core/include/basic/include.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"from included entity"	TokenNameStringLiteral	from included entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/include/frag#ment/include.xml"	TokenNameStringLiteral	src/etc/testcases/core/include/frag#ment/include.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"from included entity"	TokenNameStringLiteral	from included entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/include/frag#ment/simple.xml"	TokenNameStringLiteral	src/etc/testcases/core/include/frag#ment/simple.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"from simple buildfile"	TokenNameStringLiteral	from simple buildfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test4	TokenNameIdentifier	 test4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/include/basic/relative.xml"	TokenNameStringLiteral	src/etc/testcases/core/include/basic/relative.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"from included entity"	TokenNameStringLiteral	from included entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test5	TokenNameIdentifier	 test5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/include/frag#ment/relative.xml"	TokenNameStringLiteral	src/etc/testcases/core/include/frag#ment/relative.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"from included entity"	TokenNameStringLiteral	from included entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testParseErrorInIncluding	TokenNameIdentifier	 test Parse Error In Including
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/include/including_file_parse_error/build.xml"	TokenNameStringLiteral	src/etc/testcases/core/include/including_file_parse_error/build.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"should have caused a parser exception"	TokenNameStringLiteral	should have caused a parser exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" should refer to build.xml"	TokenNameStringLiteral	 should refer to build.xml
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"build.xml:"	TokenNameStringLiteral	build.xml:
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTaskErrorInIncluding	TokenNameIdentifier	 test Task Error In Including
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/include/including_file_task_error/build.xml"	TokenNameStringLiteral	src/etc/testcases/core/include/including_file_task_error/build.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"should have cause a build failure"	TokenNameStringLiteral	should have cause a build failure
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" should start with 'Warning: Could not find"	TokenNameStringLiteral	 should start with 'Warning: Could not find
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Warning: Could not find file "	TokenNameStringLiteral	Warning: Could not find file 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" should end with build.xml:14: "	TokenNameStringLiteral	 should end with build.xml:14: 
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"build.xml:14: "	TokenNameStringLiteral	build.xml:14: 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testParseErrorInIncluded	TokenNameIdentifier	 test Parse Error In Included
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/include/included_file_parse_error/build.xml"	TokenNameStringLiteral	src/etc/testcases/core/include/included_file_parse_error/build.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"should have caused a parser exception"	TokenNameStringLiteral	should have caused a parser exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" should refer to included_file.xml"	TokenNameStringLiteral	 should refer to included_file.xml
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"included_file.xml:"	TokenNameStringLiteral	included_file.xml:
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTaskErrorInIncluded	TokenNameIdentifier	 test Task Error In Included
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/include/included_file_task_error/build.xml"	TokenNameStringLiteral	src/etc/testcases/core/include/included_file_task_error/build.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"should have cause a build failure"	TokenNameStringLiteral	should have cause a build failure
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" should start with 'Warning: Could not find"	TokenNameStringLiteral	 should start with 'Warning: Could not find
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Warning: Could not find file "	TokenNameStringLiteral	Warning: Could not find file 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" should end with included_file.xml:2: "	TokenNameStringLiteral	 should end with included_file.xml:2: 
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"included_file.xml:2: "	TokenNameStringLiteral	included_file.xml:2: 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithSpaceInclude	TokenNameIdentifier	 test With Space Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/include/with space/include.xml"	TokenNameStringLiteral	src/etc/testcases/core/include/with space/include.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"from included entity in 'with space'"	TokenNameStringLiteral	from included entity in 'with space'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"; log= "	TokenNameStringLiteral	; log= 
+	TokenNamePLUS	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithSpaceSimple	TokenNameIdentifier	 test With Space Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/include/with space/simple.xml"	TokenNameStringLiteral	src/etc/testcases/core/include/with space/simple.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"from simple buildfile in 'with space'"	TokenNameStringLiteral	from simple buildfile in 'with space'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithSpaceRelative	TokenNameIdentifier	 test With Space Relative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/include/with space/relative.xml"	TokenNameStringLiteral	src/etc/testcases/core/include/with space/relative.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"from included entity in 'with space'"	TokenNameStringLiteral	from included entity in 'with space'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
