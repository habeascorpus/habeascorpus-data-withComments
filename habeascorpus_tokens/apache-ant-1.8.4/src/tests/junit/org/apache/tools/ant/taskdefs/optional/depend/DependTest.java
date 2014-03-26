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
.	TokenNameDOT	
depend	TokenNameIdentifier	 depend
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
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
FileSet	TokenNameIdentifier	 File Set
;	TokenNameSEMICOLON	
/** * Testcase for the Depend optional task. * */	TokenNameCOMMENT_JAVADOC	 Testcase for the Depend optional task. 
public	TokenNamepublic	
class	TokenNameclass	
DependTest	TokenNameIdentifier	 Depend Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RESULT_FILESET	TokenNameIdentifier	 RESULT  FILESET
=	TokenNameEQUAL	
"result"	TokenNameStringLiteral	result
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEST_BUILD_FILE	TokenNameIdentifier	 TEST  BUILD  FILE
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/depend/depend.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/depend/depend.xml
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DependTest	TokenNameIdentifier	 Depend Test
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
TEST_BUILD_FILE	TokenNameIdentifier	 TEST  BUILD  FILE
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
"clean"	TokenNameStringLiteral	clean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test direct dependency removal */	TokenNameCOMMENT_JAVADOC	 Test direct dependency removal 
public	TokenNamepublic	
void	TokenNamevoid	
testDirect	TokenNameIdentifier	 test Direct
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testdirect"	TokenNameStringLiteral	testdirect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
getResultFiles	TokenNameIdentifier	 get Result Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Depend did not leave correct number of files"	TokenNameStringLiteral	Depend did not leave correct number of files
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Result did not contain A.class"	TokenNameStringLiteral	Result did not contain A.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"A.class"	TokenNameStringLiteral	A.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Result did not contain D.class"	TokenNameStringLiteral	Result did not contain D.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"D.class"	TokenNameStringLiteral	D.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test dependency traversal (closure) */	TokenNameCOMMENT_JAVADOC	 Test dependency traversal (closure) 
public	TokenNamepublic	
void	TokenNamevoid	
testClosure	TokenNameIdentifier	 test Closure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testclosure"	TokenNameStringLiteral	testclosure
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
getResultFiles	TokenNameIdentifier	 get Result Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Depend did not leave correct number of files"	TokenNameStringLiteral	Depend did not leave correct number of files
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Result did not contain D.class"	TokenNameStringLiteral	Result did not contain D.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"D.class"	TokenNameStringLiteral	D.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that inner class dependencies trigger deletion of the outer class */	TokenNameCOMMENT_JAVADOC	 Test that inner class dependencies trigger deletion of the outer class 
public	TokenNamepublic	
void	TokenNamevoid	
testInner	TokenNameIdentifier	 test Inner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testinner"	TokenNameStringLiteral	testinner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Depend did not leave correct number of files"	TokenNameStringLiteral	Depend did not leave correct number of files
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getResultFiles	TokenNameIdentifier	 get Result Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that multi-leve inner class dependencies trigger deletion of * the outer class */	TokenNameCOMMENT_JAVADOC	 Test that multi-leve inner class dependencies trigger deletion of the outer class 
public	TokenNamepublic	
void	TokenNamevoid	
testInnerInner	TokenNameIdentifier	 test Inner Inner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testinnerinner"	TokenNameStringLiteral	testinnerinner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Depend did not leave correct number of files"	TokenNameStringLiteral	Depend did not leave correct number of files
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getResultFiles	TokenNameIdentifier	 get Result Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that an exception is thrown when there is no source */	TokenNameCOMMENT_JAVADOC	 Test that an exception is thrown when there is no source 
public	TokenNamepublic	
void	TokenNamevoid	
testNoSource	TokenNameIdentifier	 test No Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testnosource"	TokenNameStringLiteral	testnosource
,	TokenNameCOMMA	
"No source specified"	TokenNameStringLiteral	No source specified
,	TokenNameCOMMA	
"srcdir attribute must be set"	TokenNameStringLiteral	srcdir attribute must be set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that an exception is thrown when the source attribute is empty */	TokenNameCOMMENT_JAVADOC	 Test that an exception is thrown when the source attribute is empty 
public	TokenNamepublic	
void	TokenNamevoid	
testEmptySource	TokenNameIdentifier	 test Empty Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testemptysource"	TokenNameStringLiteral	testemptysource
,	TokenNameCOMMA	
"No source specified"	TokenNameStringLiteral	No source specified
,	TokenNameCOMMA	
"srcdir attribute must be non-empty"	TokenNameStringLiteral	srcdir attribute must be non-empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read the result fileset into a Hashtable * * @return a Hashtable containing the names of the files in the result * fileset */	TokenNameCOMMENT_JAVADOC	 Read the result fileset into a Hashtable * @return a Hashtable containing the names of the files in the result fileset 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
getResultFiles	TokenNameIdentifier	 get Result Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileSet	TokenNameIdentifier	 File Set
resultFileSet	TokenNameIdentifier	 result File Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
RESULT_FILESET	TokenNameIdentifier	 RESULT  FILESET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
resultFileSet	TokenNameIdentifier	 result File Set
.	TokenNameDOT	
getDirectoryScanner	TokenNameIdentifier	 get Directory Scanner
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scannedFiles	TokenNameIdentifier	 scanned Files
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
scannedFiles	TokenNameIdentifier	 scanned Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
scannedFiles	TokenNameIdentifier	 scanned Files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
scannedFiles	TokenNameIdentifier	 scanned Files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test mutual dependency between inner and outer do not cause both to be * deleted */	TokenNameCOMMENT_JAVADOC	 Test mutual dependency between inner and outer do not cause both to be deleted 
public	TokenNamepublic	
void	TokenNamevoid	
testInnerClosure	TokenNameIdentifier	 test Inner Closure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testinnerclosure"	TokenNameStringLiteral	testinnerclosure
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Depend did not leave correct number of files"	TokenNameStringLiteral	Depend did not leave correct number of files
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getResultFiles	TokenNameIdentifier	 get Result Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test the operation of the cache */	TokenNameCOMMENT_JAVADOC	 Test the operation of the cache 
public	TokenNamepublic	
void	TokenNamevoid	
testCache	TokenNameIdentifier	 test Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testcache"	TokenNameStringLiteral	testcache
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test the detection and warning of non public classes */	TokenNameCOMMENT_JAVADOC	 Test the detection and warning of non public classes 
public	TokenNamepublic	
void	TokenNamevoid	
testNonPublic	TokenNameIdentifier	 test Non Public
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testnonpublic"	TokenNameStringLiteral	testnonpublic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expected warning about APrivate"	TokenNameStringLiteral	Expected warning about APrivate
,	TokenNameCOMMA	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"The class APrivate in file"	TokenNameStringLiteral	The class APrivate in file
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"but has not been deleted because its source file "	TokenNameStringLiteral	but has not been deleted because its source file 
+	TokenNamePLUS	
"could not be determined"	TokenNameStringLiteral	could not be determined
,	TokenNameCOMMA	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"The class APrivate in file"	TokenNameStringLiteral	The class APrivate in file
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
