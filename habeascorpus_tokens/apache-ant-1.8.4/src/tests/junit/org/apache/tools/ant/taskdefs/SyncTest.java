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
BuildFileTest	TokenNameIdentifier	 Build File Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SyncTest	TokenNameIdentifier	 Sync Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
SyncTest	TokenNameIdentifier	 Sync Test
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
"src/etc/testcases/taskdefs/sync.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/sync.xml
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
testSimpleCopy	TokenNameIdentifier	 test Simple Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"simplecopy"	TokenNameStringLiteral	simplecopy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/a/b/c/d"	TokenNameStringLiteral	/a/b/c/d
;	TokenNameSEMICOLON	
assertFileIsPresent	TokenNameIdentifier	 assert File Is Present
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"dangling"	TokenNameStringLiteral	dangling
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyCopy	TokenNameIdentifier	 test Empty Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"emptycopy"	TokenNameStringLiteral	emptycopy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/a/b/c/d"	TokenNameStringLiteral	/a/b/c/d
;	TokenNameSEMICOLON	
assertFileIsNotPresent	TokenNameIdentifier	 assert File Is Not Present
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/a/b/c"	TokenNameStringLiteral	/a/b/c
;	TokenNameSEMICOLON	
assertFileIsNotPresent	TokenNameIdentifier	 assert File Is Not Present
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"dangling"	TokenNameStringLiteral	dangling
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyDirCopy	TokenNameIdentifier	 test Empty Dir Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"emptydircopy"	TokenNameStringLiteral	emptydircopy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/a/b/c/d"	TokenNameStringLiteral	/a/b/c/d
;	TokenNameSEMICOLON	
assertFileIsNotPresent	TokenNameIdentifier	 assert File Is Not Present
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/a/b/c"	TokenNameStringLiteral	/a/b/c
;	TokenNameSEMICOLON	
assertFileIsPresent	TokenNameIdentifier	 assert File Is Present
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"dangling"	TokenNameStringLiteral	dangling
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCopyAndRemove	TokenNameIdentifier	 test Copy And Remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testCopyAndRemove	TokenNameIdentifier	 test Copy And Remove
(	TokenNameLPAREN	
"copyandremove"	TokenNameStringLiteral	copyandremove
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCopyAndRemoveWithFileList	TokenNameIdentifier	 test Copy And Remove With File List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testCopyAndRemove	TokenNameIdentifier	 test Copy And Remove
(	TokenNameLPAREN	
"copyandremove-with-filelist"	TokenNameStringLiteral	copyandremove-with-filelist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCopyAndRemoveWithZipfileset	TokenNameIdentifier	 test Copy And Remove With Zipfileset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testCopyAndRemove	TokenNameIdentifier	 test Copy And Remove
(	TokenNameLPAREN	
"copyandremove-with-zipfileset"	TokenNameStringLiteral	copyandremove-with-zipfileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testCopyAndRemove	TokenNameIdentifier	 test Copy And Remove
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/a/b/c/d"	TokenNameStringLiteral	/a/b/c/d
;	TokenNameSEMICOLON	
assertFileIsPresent	TokenNameIdentifier	 assert File Is Present
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/e/f"	TokenNameStringLiteral	/e/f
;	TokenNameSEMICOLON	
assertFileIsNotPresent	TokenNameIdentifier	 assert File Is Not Present
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Removing orphan file:"	TokenNameStringLiteral	Removing orphan file:
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDebuglogContaining	TokenNameIdentifier	 assert Debuglog Containing
(	TokenNameLPAREN	
"Removed 1 dangling file from"	TokenNameStringLiteral	Removed 1 dangling file from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDebuglogContaining	TokenNameIdentifier	 assert Debuglog Containing
(	TokenNameLPAREN	
"Removed 1 dangling directory from"	TokenNameStringLiteral	Removed 1 dangling directory from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCopyAndRemoveEmptyPreserve	TokenNameIdentifier	 test Copy And Remove Empty Preserve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"copyandremove-emptypreserve"	TokenNameStringLiteral	copyandremove-emptypreserve
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/a/b/c/d"	TokenNameStringLiteral	/a/b/c/d
;	TokenNameSEMICOLON	
assertFileIsPresent	TokenNameIdentifier	 assert File Is Present
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/e/f"	TokenNameStringLiteral	/e/f
;	TokenNameSEMICOLON	
assertFileIsNotPresent	TokenNameIdentifier	 assert File Is Not Present
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Removing orphan file:"	TokenNameStringLiteral	Removing orphan file:
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDebuglogContaining	TokenNameIdentifier	 assert Debuglog Containing
(	TokenNameLPAREN	
"Removed 1 dangling file from"	TokenNameStringLiteral	Removed 1 dangling file from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDebuglogContaining	TokenNameIdentifier	 assert Debuglog Containing
(	TokenNameLPAREN	
"Removed 1 dangling directory from"	TokenNameStringLiteral	Removed 1 dangling directory from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyDirCopyAndRemove	TokenNameIdentifier	 test Empty Dir Copy And Remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"emptydircopyandremove"	TokenNameStringLiteral	emptydircopyandremove
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/a/b/c/d"	TokenNameStringLiteral	/a/b/c/d
;	TokenNameSEMICOLON	
assertFileIsNotPresent	TokenNameIdentifier	 assert File Is Not Present
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/a/b/c"	TokenNameStringLiteral	/a/b/c
;	TokenNameSEMICOLON	
assertFileIsPresent	TokenNameIdentifier	 assert File Is Present
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/e/f"	TokenNameStringLiteral	/e/f
;	TokenNameSEMICOLON	
assertFileIsNotPresent	TokenNameIdentifier	 assert File Is Not Present
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Removing orphan directory:"	TokenNameStringLiteral	Removing orphan directory:
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDebuglogContaining	TokenNameIdentifier	 assert Debuglog Containing
(	TokenNameLPAREN	
"NO dangling file to remove from"	TokenNameStringLiteral	NO dangling file to remove from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDebuglogContaining	TokenNameIdentifier	 assert Debuglog Containing
(	TokenNameLPAREN	
"Removed 2 dangling directories from"	TokenNameStringLiteral	Removed 2 dangling directories from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCopyNoRemove	TokenNameIdentifier	 test Copy No Remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"copynoremove"	TokenNameStringLiteral	copynoremove
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/a/b/c/d"	TokenNameStringLiteral	/a/b/c/d
;	TokenNameSEMICOLON	
assertFileIsPresent	TokenNameIdentifier	 assert File Is Present
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/e/f"	TokenNameStringLiteral	/e/f
;	TokenNameSEMICOLON	
assertFileIsPresent	TokenNameIdentifier	 assert File Is Present
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Removing orphan file:"	TokenNameStringLiteral	Removing orphan file:
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCopyNoRemoveSelectors	TokenNameIdentifier	 test Copy No Remove Selectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"copynoremove-selectors"	TokenNameStringLiteral	copynoremove-selectors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/a/b/c/d"	TokenNameStringLiteral	/a/b/c/d
;	TokenNameSEMICOLON	
assertFileIsPresent	TokenNameIdentifier	 assert File Is Present
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dest"	TokenNameStringLiteral	dest
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/e/f"	TokenNameStringLiteral	/e/f
;	TokenNameSEMICOLON	
assertFileIsPresent	TokenNameIdentifier	 assert File Is Present
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Removing orphan file:"	TokenNameStringLiteral	Removing orphan file:
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
assertFileIsPresent	TokenNameIdentifier	 assert File Is Present
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expected file "	TokenNameStringLiteral	Expected file 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
assertFileIsNotPresent	TokenNameIdentifier	 assert File Is Not Present
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Didn't expect file "	TokenNameStringLiteral	Didn't expect file 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
!	TokenNameNOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
