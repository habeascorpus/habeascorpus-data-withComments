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
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
depend	TokenNameIdentifier	 depend
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
FileSet	TokenNameIdentifier	 File Set
;	TokenNameSEMICOLON	
/** * Testcase for the Classfileset optional type. * */	TokenNameCOMMENT_JAVADOC	 Testcase for the Classfileset optional type. 
public	TokenNamepublic	
class	TokenNameclass	
ClassFileSetTest	TokenNameIdentifier	 Class File Set Test
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
ClassFileSetTest	TokenNameIdentifier	 Class File Set Test
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
// share the setup for testing the depend task 	TokenNameCOMMENT_LINE	share the setup for testing the depend task 
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/optional/depend/depend.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/depend/depend.xml
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
/** * Test basic classfileset */	TokenNameCOMMENT_JAVADOC	 Test basic classfileset 
public	TokenNamepublic	
void	TokenNamevoid	
testBasicSet	TokenNameIdentifier	 test Basic Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testbasicset"	TokenNameStringLiteral	testbasicset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileSet	TokenNameIdentifier	 File Set
resultFileSet	TokenNameIdentifier	 result File Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
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
p	TokenNameIdentifier	 p
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Classfileset did not pick up expected number of "	TokenNameStringLiteral	Classfileset did not pick up expected number of 
+	TokenNamePLUS	
"class files"	TokenNameStringLiteral	class files
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
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
"Result did not contain B.class"	TokenNameStringLiteral	Result did not contain B.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"B.class"	TokenNameStringLiteral	B.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Result did not contain C.class"	TokenNameStringLiteral	Result did not contain C.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"C.class"	TokenNameStringLiteral	C.class
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
/** * Test small classfileset */	TokenNameCOMMENT_JAVADOC	 Test small classfileset 
public	TokenNamepublic	
void	TokenNamevoid	
testSmallSet	TokenNameIdentifier	 test Small Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testsmallset"	TokenNameStringLiteral	testsmallset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileSet	TokenNameIdentifier	 File Set
resultFileSet	TokenNameIdentifier	 result File Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
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
p	TokenNameIdentifier	 p
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Classfileset did not pick up expected number of "	TokenNameStringLiteral	Classfileset did not pick up expected number of 
+	TokenNamePLUS	
"class files"	TokenNameStringLiteral	class files
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
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
"Result did not contain B.class"	TokenNameStringLiteral	Result did not contain B.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"B.class"	TokenNameStringLiteral	B.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Result did not contain C.class"	TokenNameStringLiteral	Result did not contain C.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"C.class"	TokenNameStringLiteral	C.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test combo classfileset */	TokenNameCOMMENT_JAVADOC	 Test combo classfileset 
public	TokenNamepublic	
void	TokenNamevoid	
testComboSet	TokenNameIdentifier	 test Combo Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testcomboset"	TokenNameStringLiteral	testcomboset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileSet	TokenNameIdentifier	 File Set
resultFileSet	TokenNameIdentifier	 result File Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
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
p	TokenNameIdentifier	 p
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Classfileset did not pick up expected number of "	TokenNameStringLiteral	Classfileset did not pick up expected number of 
+	TokenNamePLUS	
"class files"	TokenNameStringLiteral	class files
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
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
"Result did not contain C.class"	TokenNameStringLiteral	Result did not contain C.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"C.class"	TokenNameStringLiteral	C.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that you can pass a classfileset by reference to a fileset. */	TokenNameCOMMENT_JAVADOC	 Test that you can pass a classfileset by reference to a fileset. 
public	TokenNamepublic	
void	TokenNamevoid	
testByReference	TokenNameIdentifier	 test By Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testbyreference"	TokenNameStringLiteral	testbyreference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that classes included in a method "System.out.println(MyClass.class)" are included. */	TokenNameCOMMENT_JAVADOC	 Test that classes included in a method "System.out.println(MyClass.class)" are included. 
public	TokenNamepublic	
void	TokenNamevoid	
testMethodParam	TokenNameIdentifier	 test Method Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testmethodparam"	TokenNameStringLiteral	testmethodparam
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileSet	TokenNameIdentifier	 File Set
resultFileSet	TokenNameIdentifier	 result File Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
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
p	TokenNameIdentifier	 p
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Classfileset did not pick up expected number of "	TokenNameStringLiteral	Classfileset did not pick up expected number of 
+	TokenNamePLUS	
"class files"	TokenNameStringLiteral	class files
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
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
"Result did not contain B.class"	TokenNameStringLiteral	Result did not contain B.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"B.class"	TokenNameStringLiteral	B.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Result did not contain C.class"	TokenNameStringLiteral	Result did not contain C.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"C.class"	TokenNameStringLiteral	C.class
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
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Result did not contain E.class"	TokenNameStringLiteral	Result did not contain E.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"E.class"	TokenNameStringLiteral	E.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that classes included in a method "System.out.println(Outer.Inner.class)" are included. */	TokenNameCOMMENT_JAVADOC	 Test that classes included in a method "System.out.println(Outer.Inner.class)" are included. 
public	TokenNamepublic	
void	TokenNamevoid	
testMethodParamInner	TokenNameIdentifier	 test Method Param Inner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testmethodparaminner"	TokenNameStringLiteral	testmethodparaminner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileSet	TokenNameIdentifier	 File Set
resultFileSet	TokenNameIdentifier	 result File Set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
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
p	TokenNameIdentifier	 p
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Classfileset did not pick up expected number of "	TokenNameStringLiteral	Classfileset did not pick up expected number of 
+	TokenNamePLUS	
"class files"	TokenNameStringLiteral	class files
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
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
"Result did not contain test"	TokenNameStringLiteral	Result did not contain test
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"Outer$Inner.class"	TokenNameStringLiteral	Outer$Inner.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"Outer$Inner.class"	TokenNameStringLiteral	Outer$Inner.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Result did not contain test"	TokenNameStringLiteral	Result did not contain test
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"Outer.class"	TokenNameStringLiteral	Outer.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"Outer.class"	TokenNameStringLiteral	Outer.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Result did not contain test"	TokenNameStringLiteral	Result did not contain test
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"ContainsOnlyInner.class"	TokenNameStringLiteral	ContainsOnlyInner.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"ContainsOnlyInner.class"	TokenNameStringLiteral	ContainsOnlyInner.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Result did not contain test"	TokenNameStringLiteral	Result did not contain test
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"ContainsOnlyInner.class"	TokenNameStringLiteral	ContainsOnlyInner.class
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"MethodParam.class"	TokenNameStringLiteral	MethodParam.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResourceCollection	TokenNameIdentifier	 test Resource Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testresourcecollection"	TokenNameStringLiteral	testresourcecollection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
