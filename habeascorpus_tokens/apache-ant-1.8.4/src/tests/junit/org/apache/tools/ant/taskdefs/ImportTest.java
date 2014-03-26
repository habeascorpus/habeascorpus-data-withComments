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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
Location	TokenNameIdentifier	 Location
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
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
ImportTest	TokenNameIdentifier	 Import Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
ImportTest	TokenNameIdentifier	 Import Test
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimpleImport	TokenNameIdentifier	 test Simple Import
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/import/import.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/import.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogContaining	TokenNameIdentifier	 assert Log Containing
(	TokenNameLPAREN	
"Before importIn imported topAfter import"	TokenNameStringLiteral	Before importIn imported topAfter import
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUnnamedNesting	TokenNameIdentifier	 test Unnamed Nesting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/import/unnamedImport.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/unnamedImport.xml
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
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
"Warnings logged when not expected: "	TokenNameStringLiteral	Warnings logged when not expected: 
+	TokenNamePLUS	
log	TokenNameIdentifier	 log
,	TokenNameCOMMA	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSerial	TokenNameIdentifier	 test Serial
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/import/subdir/serial.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/subdir/serial.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogContaining	TokenNameIdentifier	 assert Log Containing
(	TokenNameLPAREN	
"Unnamed2.xmlUnnamed1.xml"	TokenNameStringLiteral	Unnamed2.xmlUnnamed1.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fullLog	TokenNameIdentifier	 full Log
=	TokenNameEQUAL	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
substring	TokenNameIdentifier	 substring
=	TokenNameEQUAL	
"Skipped already imported file"	TokenNameStringLiteral	Skipped already imported file
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expecting full log to contain ""	TokenNameStringLiteral	expecting full log to contain "
+	TokenNamePLUS	
substring	TokenNameIdentifier	 substring
+	TokenNamePLUS	
"" full log was ""	TokenNameStringLiteral	" full log was "
+	TokenNamePLUS	
fullLog	TokenNameIdentifier	 full Log
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
fullLog	TokenNameIdentifier	 full Log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// allow this as imported in targets are only tested when a target is run 	TokenNameCOMMENT_LINE	allow this as imported in targets are only tested when a target is run 
public	TokenNamepublic	
void	TokenNamevoid	
testImportInTargetNoEffect	TokenNameIdentifier	 test Import In Target No Effect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/import/subdir/importintarget.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/subdir/importintarget.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"no-import"	TokenNameStringLiteral	no-import
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
"baz"	TokenNameStringLiteral	baz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// deactivate this test as imports within targets are not allowed 	TokenNameCOMMENT_LINE	deactivate this test as imports within targets are not allowed 
public	TokenNamepublic	
void	TokenNamevoid	
notTestImportInTargetWithEffect	TokenNameIdentifier	 not Test Import In Target With Effect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/import/subdir/importintarget.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/subdir/importintarget.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"do-import"	TokenNameStringLiteral	do-import
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
"baz"	TokenNameStringLiteral	baz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testImportInTargetNotAllowed	TokenNameIdentifier	 test Import In Target Not Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/import/subdir/importintarget.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/subdir/importintarget.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"do-import"	TokenNameStringLiteral	do-import
,	TokenNameCOMMA	
"not a top level task"	TokenNameStringLiteral	not a top level task
,	TokenNameCOMMA	
"import only allowed as a top-level task"	TokenNameStringLiteral	import only allowed as a top-level task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testImportInSequential	TokenNameIdentifier	 test Import In Sequential
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/import/subdir/importinsequential.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/subdir/importinsequential.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"within-imported"	TokenNameStringLiteral	within-imported
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
"baz"	TokenNameStringLiteral	baz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testImportSameTargets	TokenNameIdentifier	 test Import Same Targets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/import/same_target.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/same_target.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Duplicate target"	TokenNameStringLiteral	Duplicate target
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Did not see 'Duplicate target' in '"	TokenNameStringLiteral	Did not see 'Duplicate target' in '
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Did not see build exception"	TokenNameStringLiteral	Did not see build exception
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testImportError	TokenNameIdentifier	 test Import Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/import/import_bad_import.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/import_bad_import.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Location	TokenNameIdentifier	 Location
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected location of build exception to be set"	TokenNameStringLiteral	expected location of build exception to be set
,	TokenNameCOMMA	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected location to contain calling file"	TokenNameStringLiteral	expected location to contain calling file
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
.	TokenNameDOT	
getFileName	TokenNameIdentifier	 get File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"import_bad_import.xml"	TokenNameStringLiteral	import_bad_import.xml
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected message of ex to contain called file"	TokenNameStringLiteral	expected message of ex to contain called file
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"bad.xml"	TokenNameStringLiteral	bad.xml
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Did not see build exception"	TokenNameStringLiteral	Did not see build exception
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSymlinkedImports	TokenNameIdentifier	 test Symlinked Imports
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
=	TokenNameEQUAL	
"/usr/bin/ln"	TokenNameStringLiteral	/usr/bin/ln
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ln	TokenNameIdentifier	 ln
=	TokenNameEQUAL	
"/bin/ln"	TokenNameStringLiteral	/bin/ln
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Running on Windows or something, so skip it. 	TokenNameCOMMENT_LINE	Running on Windows or something, so skip it. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
symlink	TokenNameIdentifier	 symlink
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/import/symlinks/d3b"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/symlinks/d3b
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
symlinkFile	TokenNameIdentifier	 symlink File
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
symlink	TokenNameIdentifier	 symlink
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
exec	TokenNameIdentifier	 exec
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
ln	TokenNameIdentifier	 ln
,	TokenNameCOMMA	
"-s"	TokenNameStringLiteral	-s
,	TokenNameCOMMA	
"d3a"	TokenNameStringLiteral	d3a
,	TokenNameCOMMA	
symlinkFile	TokenNameIdentifier	 symlink File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
.	TokenNameDOT	
waitFor	TokenNameIdentifier	 wait For
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
ln	TokenNameIdentifier	 ln
+	TokenNamePLUS	
" -s d3a "	TokenNameStringLiteral	 -s d3a 
+	TokenNamePLUS	
symlink	TokenNameIdentifier	 symlink
+	TokenNamePLUS	
"' failed"	TokenNameStringLiteral	' failed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/import/symlinks/d1/p1.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/symlinks/d1/p1.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyEquals	TokenNameIdentifier	 assert Property Equals
(	TokenNameLPAREN	
"ant.file.p2"	TokenNameStringLiteral	ant.file.p2
,	TokenNameCOMMA	
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
"src/etc/testcases/taskdefs/import/symlinks/d2/p2.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/symlinks/d2/p2.xml
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyEquals	TokenNameIdentifier	 assert Property Equals
(	TokenNameLPAREN	
"ant.file.p3"	TokenNameStringLiteral	ant.file.p3
,	TokenNameCOMMA	
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
"src/etc/testcases/taskdefs/import/symlinks/d3b/p3.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/symlinks/d3b/p3.xml
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
symlinkFile	TokenNameIdentifier	 symlink File
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTargetFirst	TokenNameIdentifier	 test Target First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/import/importtargetfirst.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/importtargetfirst.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogContaining	TokenNameIdentifier	 assert Log Containing
(	TokenNameLPAREN	
"Importing targetfirstAfter target firstAfter importing"	TokenNameStringLiteral	Importing targetfirstAfter target firstAfter importing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTargetName	TokenNameIdentifier	 test Target Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/import/c.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/import/c.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
