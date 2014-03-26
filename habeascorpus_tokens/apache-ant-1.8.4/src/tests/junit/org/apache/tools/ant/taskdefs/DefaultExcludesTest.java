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
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
DefaultExcludesTest	TokenNameIdentifier	 Default Excludes Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
DefaultExcludesTest	TokenNameIdentifier	 Default Excludes Test
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
"src/etc/testcases/taskdefs/defaultexcludes.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/defaultexcludes.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"cleanup"	TokenNameStringLiteral	cleanup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Output the default excludes 	TokenNameCOMMENT_LINE	Output the default excludes 
public	TokenNamepublic	
void	TokenNamevoid	
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"**/*~"	TokenNameStringLiteral	**/*~
,	TokenNameCOMMA	
"**/#*#"	TokenNameStringLiteral	**/#*#
,	TokenNameCOMMA	
"**/.#*"	TokenNameStringLiteral	**/.#*
,	TokenNameCOMMA	
"**/%*%"	TokenNameStringLiteral	**/%*%
,	TokenNameCOMMA	
"**/._*"	TokenNameStringLiteral	**/._*
,	TokenNameCOMMA	
"**/CVS"	TokenNameStringLiteral	**/CVS
,	TokenNameCOMMA	
"**/CVS/**"	TokenNameStringLiteral	**/CVS/**
,	TokenNameCOMMA	
"**/.cvsignore"	TokenNameStringLiteral	**/.cvsignore
,	TokenNameCOMMA	
"**/SCCS"	TokenNameStringLiteral	**/SCCS
,	TokenNameCOMMA	
"**/SCCS/**"	TokenNameStringLiteral	**/SCCS/**
,	TokenNameCOMMA	
"**/vssver.scc"	TokenNameStringLiteral	**/vssver.scc
,	TokenNameCOMMA	
"**/.svn"	TokenNameStringLiteral	**/.svn
,	TokenNameCOMMA	
"**/.svn/**"	TokenNameStringLiteral	**/.svn/**
,	TokenNameCOMMA	
"**/.git"	TokenNameStringLiteral	**/.git
,	TokenNameCOMMA	
"**/.git/**"	TokenNameStringLiteral	**/.git/**
,	TokenNameCOMMA	
"**/.gitattributes"	TokenNameStringLiteral	**/.gitattributes
,	TokenNameCOMMA	
"**/.gitignore"	TokenNameStringLiteral	**/.gitignore
,	TokenNameCOMMA	
"**/.gitmodules"	TokenNameStringLiteral	**/.gitmodules
,	TokenNameCOMMA	
"**/.hg"	TokenNameStringLiteral	**/.hg
,	TokenNameCOMMA	
"**/.hg/**"	TokenNameStringLiteral	**/.hg/**
,	TokenNameCOMMA	
"**/.hgignore"	TokenNameStringLiteral	**/.hgignore
,	TokenNameCOMMA	
"**/.hgsub"	TokenNameStringLiteral	**/.hgsub
,	TokenNameCOMMA	
"**/.hgsubstate"	TokenNameStringLiteral	**/.hgsubstate
,	TokenNameCOMMA	
"**/.hgtags"	TokenNameStringLiteral	**/.hgtags
,	TokenNameCOMMA	
"**/.bzr"	TokenNameStringLiteral	**/.bzr
,	TokenNameCOMMA	
"**/.bzr/**"	TokenNameStringLiteral	**/.bzr/**
,	TokenNameCOMMA	
"**/.bzrignore"	TokenNameStringLiteral	**/.bzrignore
,	TokenNameCOMMA	
"**/.DS_Store"	TokenNameStringLiteral	**/.DS_Store
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"current default excludes"	TokenNameStringLiteral	current default excludes
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
.	TokenNameDOT	
getDefaultExcludes	TokenNameIdentifier	 get Default Excludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// adding something to the excludes' 	TokenNameCOMMENT_LINE	adding something to the excludes' 
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"**/*~"	TokenNameStringLiteral	**/*~
,	TokenNameCOMMA	
"**/#*#"	TokenNameStringLiteral	**/#*#
,	TokenNameCOMMA	
"**/.#*"	TokenNameStringLiteral	**/.#*
,	TokenNameCOMMA	
"**/%*%"	TokenNameStringLiteral	**/%*%
,	TokenNameCOMMA	
"**/._*"	TokenNameStringLiteral	**/._*
,	TokenNameCOMMA	
"**/CVS"	TokenNameStringLiteral	**/CVS
,	TokenNameCOMMA	
"**/CVS/**"	TokenNameStringLiteral	**/CVS/**
,	TokenNameCOMMA	
"**/.cvsignore"	TokenNameStringLiteral	**/.cvsignore
,	TokenNameCOMMA	
"**/SCCS"	TokenNameStringLiteral	**/SCCS
,	TokenNameCOMMA	
"**/SCCS/**"	TokenNameStringLiteral	**/SCCS/**
,	TokenNameCOMMA	
"**/vssver.scc"	TokenNameStringLiteral	**/vssver.scc
,	TokenNameCOMMA	
"**/.svn"	TokenNameStringLiteral	**/.svn
,	TokenNameCOMMA	
"**/.svn/**"	TokenNameStringLiteral	**/.svn/**
,	TokenNameCOMMA	
"**/.git"	TokenNameStringLiteral	**/.git
,	TokenNameCOMMA	
"**/.git/**"	TokenNameStringLiteral	**/.git/**
,	TokenNameCOMMA	
"**/.gitattributes"	TokenNameStringLiteral	**/.gitattributes
,	TokenNameCOMMA	
"**/.gitignore"	TokenNameStringLiteral	**/.gitignore
,	TokenNameCOMMA	
"**/.gitmodules"	TokenNameStringLiteral	**/.gitmodules
,	TokenNameCOMMA	
"**/.hg"	TokenNameStringLiteral	**/.hg
,	TokenNameCOMMA	
"**/.hg/**"	TokenNameStringLiteral	**/.hg/**
,	TokenNameCOMMA	
"**/.hgignore"	TokenNameStringLiteral	**/.hgignore
,	TokenNameCOMMA	
"**/.hgsub"	TokenNameStringLiteral	**/.hgsub
,	TokenNameCOMMA	
"**/.hgsubstate"	TokenNameStringLiteral	**/.hgsubstate
,	TokenNameCOMMA	
"**/.hgtags"	TokenNameStringLiteral	**/.hgtags
,	TokenNameCOMMA	
"**/.bzr"	TokenNameStringLiteral	**/.bzr
,	TokenNameCOMMA	
"**/.bzr/**"	TokenNameStringLiteral	**/.bzr/**
,	TokenNameCOMMA	
"**/.bzrignore"	TokenNameStringLiteral	**/.bzrignore
,	TokenNameCOMMA	
"**/.DS_Store"	TokenNameStringLiteral	**/.DS_Store
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"current default excludes"	TokenNameStringLiteral	current default excludes
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
.	TokenNameDOT	
getDefaultExcludes	TokenNameIdentifier	 get Default Excludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// removing something from the defaults 	TokenNameCOMMENT_LINE	removing something from the defaults 
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"**/*~"	TokenNameStringLiteral	**/*~
,	TokenNameCOMMA	
"**/#*#"	TokenNameStringLiteral	**/#*#
,	TokenNameCOMMA	
"**/.#*"	TokenNameStringLiteral	**/.#*
,	TokenNameCOMMA	
"**/%*%"	TokenNameStringLiteral	**/%*%
,	TokenNameCOMMA	
"**/._*"	TokenNameStringLiteral	**/._*
,	TokenNameCOMMA	
//CVS missing 	TokenNameCOMMENT_LINE	CVS missing 
"**/CVS/**"	TokenNameStringLiteral	**/CVS/**
,	TokenNameCOMMA	
"**/.cvsignore"	TokenNameStringLiteral	**/.cvsignore
,	TokenNameCOMMA	
"**/SCCS"	TokenNameStringLiteral	**/SCCS
,	TokenNameCOMMA	
"**/SCCS/**"	TokenNameStringLiteral	**/SCCS/**
,	TokenNameCOMMA	
"**/vssver.scc"	TokenNameStringLiteral	**/vssver.scc
,	TokenNameCOMMA	
"**/.svn"	TokenNameStringLiteral	**/.svn
,	TokenNameCOMMA	
"**/.svn/**"	TokenNameStringLiteral	**/.svn/**
,	TokenNameCOMMA	
"**/.git"	TokenNameStringLiteral	**/.git
,	TokenNameCOMMA	
"**/.git/**"	TokenNameStringLiteral	**/.git/**
,	TokenNameCOMMA	
"**/.gitattributes"	TokenNameStringLiteral	**/.gitattributes
,	TokenNameCOMMA	
"**/.gitignore"	TokenNameStringLiteral	**/.gitignore
,	TokenNameCOMMA	
"**/.gitmodules"	TokenNameStringLiteral	**/.gitmodules
,	TokenNameCOMMA	
"**/.hg"	TokenNameStringLiteral	**/.hg
,	TokenNameCOMMA	
"**/.hg/**"	TokenNameStringLiteral	**/.hg/**
,	TokenNameCOMMA	
"**/.hgignore"	TokenNameStringLiteral	**/.hgignore
,	TokenNameCOMMA	
"**/.hgsub"	TokenNameStringLiteral	**/.hgsub
,	TokenNameCOMMA	
"**/.hgsubstate"	TokenNameStringLiteral	**/.hgsubstate
,	TokenNameCOMMA	
"**/.hgtags"	TokenNameStringLiteral	**/.hgtags
,	TokenNameCOMMA	
"**/.bzr"	TokenNameStringLiteral	**/.bzr
,	TokenNameCOMMA	
"**/.bzr/**"	TokenNameStringLiteral	**/.bzr/**
,	TokenNameCOMMA	
"**/.bzrignore"	TokenNameStringLiteral	**/.bzrignore
,	TokenNameCOMMA	
"**/.DS_Store"	TokenNameStringLiteral	**/.DS_Store
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test3"	TokenNameStringLiteral	test3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"current default excludes"	TokenNameStringLiteral	current default excludes
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
.	TokenNameDOT	
getDefaultExcludes	TokenNameIdentifier	 get Default Excludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check that both arrays have the same size 	TokenNameCOMMENT_LINE	check that both arrays have the same size 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
+	TokenNamePLUS	
" : string array length match"	TokenNameStringLiteral	 : string array length match
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
<	TokenNameLESS	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
found	TokenNameIdentifier	 found
|=	TokenNameOR_EQUAL	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
counter	TokenNameIdentifier	 counter
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
actual	TokenNameIdentifier	 actual
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
+	TokenNamePLUS	
" : didn't find element "	TokenNameStringLiteral	 : didn't find element 
+	TokenNamePLUS	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
counter	TokenNameIdentifier	 counter
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" in array match"	TokenNameStringLiteral	 in array match
,	TokenNameCOMMA	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
