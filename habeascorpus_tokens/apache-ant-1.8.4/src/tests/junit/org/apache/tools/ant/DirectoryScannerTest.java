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
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
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
selectors	TokenNameIdentifier	 selectors
.	TokenNameDOT	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SymbolicLinkUtils	TokenNameIdentifier	 Symbolic Link Utils
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
;	TokenNameSEMICOLON	
/** * JUnit 3 testcases for org.apache.tools.ant.DirectoryScanner * */	TokenNameCOMMENT_JAVADOC	 JUnit 3 testcases for org.apache.tools.ant.DirectoryScanner 
public	TokenNamepublic	
class	TokenNameclass	
DirectoryScannerTest	TokenNameIdentifier	 Directory Scanner Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
DirectoryScannerTest	TokenNameIdentifier	 Directory Scanner Test
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
// keep track of what operating systems are supported here. 	TokenNameCOMMENT_LINE	keep track of what operating systems are supported here. 
private	TokenNameprivate	
boolean	TokenNameboolean	
supportsSymlinks	TokenNameIdentifier	 supports Symlinks
=	TokenNameEQUAL	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"unix"	TokenNameStringLiteral	unix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/directoryscanner.xml"	TokenNameStringLiteral	src/etc/testcases/core/directoryscanner.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"setup"	TokenNameStringLiteral	setup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
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
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha"	TokenNameStringLiteral	alpha
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha"	TokenNameStringLiteral	alpha
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/"	TokenNameStringLiteral	alpha/
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/beta.xml"	TokenNameStringLiteral	alpha/beta/beta.xml
,	TokenNameCOMMA	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha"	TokenNameStringLiteral	alpha
,	TokenNameCOMMA	
"alpha/beta"	TokenNameStringLiteral	alpha/beta
,	TokenNameCOMMA	
"alpha/beta/gamma"	TokenNameStringLiteral	alpha/beta/gamma
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/beta.xml"	TokenNameStringLiteral	alpha/beta/beta.xml
,	TokenNameCOMMA	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"alpha"	TokenNameStringLiteral	alpha
,	TokenNameCOMMA	
"alpha/beta"	TokenNameStringLiteral	alpha/beta
,	TokenNameCOMMA	
"alpha/beta/gamma"	TokenNameStringLiteral	alpha/beta/gamma
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFullPathMatchesCaseSensitive	TokenNameIdentifier	 test Full Path Matches Case Sensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/gamma/GAMMA.XML"	TokenNameStringLiteral	alpha/beta/gamma/GAMMA.XML
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFullPathMatchesCaseInsensitive	TokenNameIdentifier	 test Full Path Matches Case Insensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/gamma/GAMMA.XML"	TokenNameStringLiteral	alpha/beta/gamma/GAMMA.XML
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2ButCaseInsensitive	TokenNameIdentifier	 test2 But Case Insensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ALPHA/"	TokenNameStringLiteral	ALPHA/
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/beta.xml"	TokenNameStringLiteral	alpha/beta/beta.xml
,	TokenNameCOMMA	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha"	TokenNameStringLiteral	alpha
,	TokenNameCOMMA	
"alpha/beta"	TokenNameStringLiteral	alpha/beta
,	TokenNameCOMMA	
"alpha/beta/gamma"	TokenNameStringLiteral	alpha/beta/gamma
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAllowSymlinks	TokenNameIdentifier	 test Allow Symlinks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
supportsSymlinks	TokenNameIdentifier	 supports Symlinks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"symlink-setup"	TokenNameStringLiteral	symlink-setup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/gamma/"	TokenNameStringLiteral	alpha/beta/gamma/
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/gamma"	TokenNameStringLiteral	alpha/beta/gamma
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testProhibitSymlinks	TokenNameIdentifier	 test Prohibit Symlinks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
supportsSymlinks	TokenNameIdentifier	 supports Symlinks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"symlink-setup"	TokenNameStringLiteral	symlink-setup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/gamma/"	TokenNameStringLiteral	alpha/beta/gamma/
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setFollowSymlinks	TokenNameIdentifier	 set Follow Symlinks
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// father and child pattern test 	TokenNameCOMMENT_LINE	father and child pattern test 
public	TokenNamepublic	
void	TokenNamevoid	
testOrderOfIncludePatternsIrrelevant	TokenNameIdentifier	 test Order Of Include Patterns Irrelevant
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectedFiles	TokenNameIdentifier	 expected Files
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"alpha/beta/beta.xml"	TokenNameStringLiteral	alpha/beta/beta.xml
,	TokenNameCOMMA	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectedDirectories	TokenNameIdentifier	 expected Directories
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"alpha/beta"	TokenNameStringLiteral	alpha/beta
,	TokenNameCOMMA	
"alpha/beta/gamma"	TokenNameStringLiteral	alpha/beta/gamma
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/be?a/**"	TokenNameStringLiteral	alpha/be?a/**
,	TokenNameCOMMA	
"alpha/beta/gamma/"	TokenNameStringLiteral	alpha/beta/gamma/
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
expectedFiles	TokenNameIdentifier	 expected Files
,	TokenNameCOMMA	
expectedDirectories	TokenNameIdentifier	 expected Directories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// redo the test, but the 2 include patterns are inverted 	TokenNameCOMMENT_LINE	redo the test, but the 2 include patterns are inverted 
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/gamma/"	TokenNameStringLiteral	alpha/beta/gamma/
,	TokenNameCOMMA	
"alpha/be?a/**"	TokenNameStringLiteral	alpha/be?a/**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
expectedFiles	TokenNameIdentifier	 expected Files
,	TokenNameCOMMA	
expectedDirectories	TokenNameIdentifier	 expected Directories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPatternsDifferInCaseScanningSensitive	TokenNameIdentifier	 test Patterns Differ In Case Scanning Sensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/"	TokenNameStringLiteral	alpha/
,	TokenNameCOMMA	
"ALPHA/"	TokenNameStringLiteral	ALPHA/
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/beta.xml"	TokenNameStringLiteral	alpha/beta/beta.xml
,	TokenNameCOMMA	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha"	TokenNameStringLiteral	alpha
,	TokenNameCOMMA	
"alpha/beta"	TokenNameStringLiteral	alpha/beta
,	TokenNameCOMMA	
"alpha/beta/gamma"	TokenNameStringLiteral	alpha/beta/gamma
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPatternsDifferInCaseScanningInsensitive	TokenNameIdentifier	 test Patterns Differ In Case Scanning Insensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/"	TokenNameStringLiteral	alpha/
,	TokenNameCOMMA	
"ALPHA/"	TokenNameStringLiteral	ALPHA/
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/beta.xml"	TokenNameStringLiteral	alpha/beta/beta.xml
,	TokenNameCOMMA	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha"	TokenNameStringLiteral	alpha
,	TokenNameCOMMA	
"alpha/beta"	TokenNameStringLiteral	alpha/beta
,	TokenNameCOMMA	
"alpha/beta/gamma"	TokenNameStringLiteral	alpha/beta/gamma
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFullpathDiffersInCaseScanningSensitive	TokenNameIdentifier	 test Fullpath Differs In Case Scanning Sensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
,	TokenNameCOMMA	
"alpha/beta/gamma/GAMMA.XML"	TokenNameStringLiteral	alpha/beta/gamma/GAMMA.XML
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFullpathDiffersInCaseScanningInsensitive	TokenNameIdentifier	 test Fullpath Differs In Case Scanning Insensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
,	TokenNameCOMMA	
"alpha/beta/gamma/GAMMA.XML"	TokenNameStringLiteral	alpha/beta/gamma/GAMMA.XML
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testParentDiffersInCaseScanningSensitive	TokenNameIdentifier	 test Parent Differs In Case Scanning Sensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/"	TokenNameStringLiteral	alpha/
,	TokenNameCOMMA	
"ALPHA/beta/"	TokenNameStringLiteral	ALPHA/beta/
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/beta.xml"	TokenNameStringLiteral	alpha/beta/beta.xml
,	TokenNameCOMMA	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha"	TokenNameStringLiteral	alpha
,	TokenNameCOMMA	
"alpha/beta"	TokenNameStringLiteral	alpha/beta
,	TokenNameCOMMA	
"alpha/beta/gamma"	TokenNameStringLiteral	alpha/beta/gamma
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testParentDiffersInCaseScanningInsensitive	TokenNameIdentifier	 test Parent Differs In Case Scanning Insensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/"	TokenNameStringLiteral	alpha/
,	TokenNameCOMMA	
"ALPHA/beta/"	TokenNameStringLiteral	ALPHA/beta/
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/beta.xml"	TokenNameStringLiteral	alpha/beta/beta.xml
,	TokenNameCOMMA	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha"	TokenNameStringLiteral	alpha
,	TokenNameCOMMA	
"alpha/beta"	TokenNameStringLiteral	alpha/beta
,	TokenNameCOMMA	
"alpha/beta/gamma"	TokenNameStringLiteral	alpha/beta/gamma
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test case for setFollowLinks() and associated functionality. * Only supports test on Linux at the moment because Java has * no real notion of symlinks built in, so an os-specfic call * to Runtime.exec() must be made to create a link to test against. */	TokenNameCOMMENT_JAVADOC	 Test case for setFollowLinks() and associated functionality. Only supports test on Linux at the moment because Java has no real notion of symlinks built in, so an os-specfic call to Runtime.exec() must be made to create a link to test against. 
public	TokenNamepublic	
void	TokenNamevoid	
testSetFollowLinks	TokenNameIdentifier	 test Set Follow Links
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
supportsSymlinks	TokenNameIdentifier	 supports Symlinks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
linkFile	TokenNameIdentifier	 link File
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
"src/main/org/apache/tools/ThisIsALink"	TokenNameStringLiteral	src/main/org/apache/tools/ThisIsALink
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"link exists pre-test? "	TokenNameStringLiteral	link exists pre-test? 
+	TokenNamePLUS	
linkFile	TokenNameIdentifier	 link File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// add conditions and more commands as soon as the need arises 	TokenNameCOMMENT_LINE	add conditions and more commands as soon as the need arises 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ln"	TokenNameStringLiteral	ln
,	TokenNameCOMMA	
"-s"	TokenNameStringLiteral	-s
,	TokenNameCOMMA	
"ant"	TokenNameStringLiteral	ant
,	TokenNameCOMMA	
linkFile	TokenNameIdentifier	 link File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
exec	TokenNameIdentifier	 exec
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// give ourselves some time for the system call 	TokenNameCOMMENT_LINE	give ourselves some time for the system call 
// to execute... tweak if you have a really over 	TokenNameCOMMENT_LINE	to execute... tweak if you have a really over 
// loaded system. 	TokenNameCOMMENT_LINE	loaded system. 
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"IOException making link "	TokenNameStringLiteral	IOException making link 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
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
"src/main/org/apache/tools"	TokenNameStringLiteral	src/main/org/apache/tools
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"link exists after exec? "	TokenNameStringLiteral	link exists after exec? 
+	TokenNamePLUS	
linkFile	TokenNameIdentifier	 link File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Ant knows it is a link? "	TokenNameStringLiteral	Ant knows it is a link? 
+	TokenNamePLUS	
SymbolicLinkUtils	TokenNameIdentifier	 Symbolic Link Utils
.	TokenNameDOT	
getSymbolicLinkUtils	TokenNameIdentifier	 get Symbolic Link Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isSymbolicLink	TokenNameIdentifier	 is Symbolic Link
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
"ThisIsALink"	TokenNameStringLiteral	ThisIsALink
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// followLinks should be true by default, but if this ever 	TokenNameCOMMENT_LINE	followLinks should be true by default, but if this ever 
// changes we will need this line. 	TokenNameCOMMENT_LINE	changes we will need this line. 
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setFollowSymlinks	TokenNameIdentifier	 set Follow Symlinks
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ant/**"	TokenNameStringLiteral	ant/**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
haveZipPackage	TokenNameIdentifier	 have Zip Package
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
haveTaskdefsPackage	TokenNameIdentifier	 have Taskdefs Package
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
included	TokenNameIdentifier	 included
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedDirectories	TokenNameIdentifier	 get Included Directories
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
included	TokenNameIdentifier	 included
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"zip"	TokenNameStringLiteral	zip
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
haveZipPackage	TokenNameIdentifier	 have Zip Package
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ThisIsALink"	TokenNameStringLiteral	ThisIsALink
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"taskdefs"	TokenNameStringLiteral	taskdefs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
haveTaskdefsPackage	TokenNameIdentifier	 have Taskdefs Package
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if we followed the symlink we just made we should 	TokenNameCOMMENT_LINE	if we followed the symlink we just made we should 
// bypass the excludes. 	TokenNameCOMMENT_LINE	bypass the excludes. 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"(1) zip package included"	TokenNameStringLiteral	(1) zip package included
,	TokenNameCOMMA	
haveZipPackage	TokenNameIdentifier	 have Zip Package
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"(1) taskdefs package included"	TokenNameStringLiteral	(1) taskdefs package included
,	TokenNameCOMMA	
haveTaskdefsPackage	TokenNameIdentifier	 have Taskdefs Package
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setFollowSymlinks	TokenNameIdentifier	 set Follow Symlinks
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ant/**"	TokenNameStringLiteral	ant/**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
haveZipPackage	TokenNameIdentifier	 have Zip Package
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
haveTaskdefsPackage	TokenNameIdentifier	 have Taskdefs Package
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
included	TokenNameIdentifier	 included
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedDirectories	TokenNameIdentifier	 get Included Directories
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
included	TokenNameIdentifier	 included
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"zip"	TokenNameStringLiteral	zip
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
haveZipPackage	TokenNameIdentifier	 have Zip Package
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ThisIsALink"	TokenNameStringLiteral	ThisIsALink
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"taskdefs"	TokenNameStringLiteral	taskdefs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
haveTaskdefsPackage	TokenNameIdentifier	 have Taskdefs Package
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"(2) zip package included"	TokenNameStringLiteral	(2) zip package included
,	TokenNameCOMMA	
haveZipPackage	TokenNameIdentifier	 have Zip Package
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"(2) taskdefs package not included"	TokenNameStringLiteral	(2) taskdefs package not included
,	TokenNameCOMMA	
!	TokenNameNOT	
haveTaskdefsPackage	TokenNameIdentifier	 have Taskdefs Package
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"link exists pre-delete? "	TokenNameStringLiteral	link exists pre-delete? 
+	TokenNamePLUS	
linkFile	TokenNameIdentifier	 link File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
linkFile	TokenNameIdentifier	 link File
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Failed to delete "	TokenNameStringLiteral	Failed to delete 
+	TokenNamePLUS	
linkFile	TokenNameIdentifier	 link File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"link exists post-delete? "	TokenNameStringLiteral	link exists post-delete? 
+	TokenNamePLUS	
linkFile	TokenNameIdentifier	 link File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExcludeOneFile	TokenNameIdentifier	 test Exclude One File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"**/*.xml"	TokenNameStringLiteral	**/*.xml
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/b*xml"	TokenNameStringLiteral	alpha/beta/b*xml
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExcludeHasPrecedence	TokenNameIdentifier	 test Exclude Has Precedence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/**"	TokenNameStringLiteral	alpha/**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/**"	TokenNameStringLiteral	alpha/**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAlternateIncludeExclude	TokenNameIdentifier	 test Alternate Include Exclude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/**"	TokenNameStringLiteral	alpha/**
,	TokenNameCOMMA	
"alpha/beta/gamma/**"	TokenNameStringLiteral	alpha/beta/gamma/**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/**"	TokenNameStringLiteral	alpha/beta/**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha"	TokenNameStringLiteral	alpha
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAlternateExcludeInclude	TokenNameIdentifier	 test Alternate Exclude Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/**"	TokenNameStringLiteral	alpha/**
,	TokenNameCOMMA	
"alpha/beta/gamma/**"	TokenNameStringLiteral	alpha/beta/gamma/**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/**"	TokenNameStringLiteral	alpha/beta/**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test inspired by Bug#1415. */	TokenNameCOMMENT_JAVADOC	 Test inspired by Bug#1415. 
public	TokenNamepublic	
void	TokenNamevoid	
testChildrenOfExcludedDirectory	TokenNameIdentifier	 test Children Of Excluded Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"children-of-excluded-dir-setup"	TokenNameStringLiteral	children-of-excluded-dir-setup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/**"	TokenNameStringLiteral	alpha/**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setFollowSymlinks	TokenNameIdentifier	 set Follow Symlinks
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"delta/delta.xml"	TokenNameStringLiteral	delta/delta.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"delta"	TokenNameStringLiteral	delta
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha"	TokenNameStringLiteral	alpha
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setFollowSymlinks	TokenNameIdentifier	 set Follow Symlinks
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/beta/beta.xml"	TokenNameStringLiteral	alpha/beta/beta.xml
,	TokenNameCOMMA	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
,	TokenNameCOMMA	
"delta/delta.xml"	TokenNameStringLiteral	delta/delta.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"alpha/beta"	TokenNameStringLiteral	alpha/beta
,	TokenNameCOMMA	
"alpha/beta/gamma"	TokenNameStringLiteral	alpha/beta/gamma
,	TokenNameCOMMA	
"delta"	TokenNameStringLiteral	delta
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIsExcludedDirectoryScanned	TokenNameIdentifier	 test Is Excluded Directory Scanned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
shareclassloader	TokenNameIdentifier	 shareclassloader
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"tests.and.ant.share.classloader"	TokenNameStringLiteral	tests.and.ant.share.classloader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// when the test is started by the build.xml of ant 	TokenNameCOMMENT_LINE	when the test is started by the build.xml of ant 
// if the property tests.and.ant.share.classloader is not set in the build.xml 	TokenNameCOMMENT_LINE	if the property tests.and.ant.share.classloader is not set in the build.xml 
// a sysproperty with name tests.and.ant.share.classloader and value 	TokenNameCOMMENT_LINE	a sysproperty with name tests.and.ant.share.classloader and value 
// ${tests.and.ant.share.classloader} will be set 	TokenNameCOMMENT_LINE	${tests.and.ant.share.classloader} will be set 
// we are trying to catch this here. 	TokenNameCOMMENT_LINE	we are trying to catch this here. 
if	TokenNameif	
(	TokenNameLPAREN	
shareclassloader	TokenNameIdentifier	 shareclassloader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
shareclassloader	TokenNameIdentifier	 shareclassloader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
shareclassloader	TokenNameIdentifier	 shareclassloader
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"${"	TokenNameStringLiteral	${
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"cannot execute testIsExcludedDirectoryScanned when tests are forked, "	TokenNameStringLiteral	cannot execute testIsExcludedDirectoryScanned when tests are forked, 
+	TokenNamePLUS	
"package private method called"	TokenNameStringLiteral	package private method called
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"children-of-excluded-dir-setup"	TokenNameStringLiteral	children-of-excluded-dir-setup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"**/gamma/**"	TokenNameStringLiteral	**/gamma/**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setFollowSymlinks	TokenNameIdentifier	 set Follow Symlinks
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getScannedDirs	TokenNameIdentifier	 get Scanned Dirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"empty set"	TokenNameStringLiteral	empty set
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
"alpha/beta/gamma/"	TokenNameStringLiteral	alpha/beta/gamma/
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"scanned "	TokenNameStringLiteral	scanned 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAbsolute1	TokenNameIdentifier	 test Absolute1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"extended-setup"	TokenNameStringLiteral	extended-setup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tmpdir	TokenNameIdentifier	 tmpdir
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/tmp"	TokenNameStringLiteral	/tmp
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/**/*"	TokenNameStringLiteral	/**/*
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/alpha/beta/beta.xml"	TokenNameStringLiteral	/alpha/beta/beta.xml
,	TokenNameCOMMA	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	/alpha/beta/gamma/gamma.xml
,	TokenNameCOMMA	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/delta/delta.xml"	TokenNameStringLiteral	/delta/delta.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/alpha"	TokenNameStringLiteral	/alpha
,	TokenNameCOMMA	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/alpha/beta"	TokenNameStringLiteral	/alpha/beta
,	TokenNameCOMMA	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/alpha/beta/gamma"	TokenNameStringLiteral	/alpha/beta/gamma
,	TokenNameCOMMA	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/delta"	TokenNameStringLiteral	/delta
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAbsolute2	TokenNameIdentifier	 test Absolute2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"setup"	TokenNameStringLiteral	setup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"alpha/**"	TokenNameStringLiteral	alpha/**
,	TokenNameCOMMA	
"alpha/beta/gamma/**"	TokenNameStringLiteral	alpha/beta/gamma/**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mt	TokenNameIdentifier	 mt
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
mt	TokenNameIdentifier	 mt
,	TokenNameCOMMA	
mt	TokenNameIdentifier	 mt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAbsolute3	TokenNameIdentifier	 test Absolute3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"extended-setup"	TokenNameStringLiteral	extended-setup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tmpdir	TokenNameIdentifier	 tmpdir
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/tmp"	TokenNameStringLiteral	/tmp
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/**/*"	TokenNameStringLiteral	/**/*
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"**/alpha"	TokenNameStringLiteral	**/alpha
,	TokenNameCOMMA	
"**/delta/*"	TokenNameStringLiteral	**/delta/*
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/alpha/beta/beta.xml"	TokenNameStringLiteral	/alpha/beta/beta.xml
,	TokenNameCOMMA	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	/alpha/beta/gamma/gamma.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/alpha/beta"	TokenNameStringLiteral	/alpha/beta
,	TokenNameCOMMA	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/alpha/beta/gamma"	TokenNameStringLiteral	/alpha/beta/gamma
,	TokenNameCOMMA	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/delta"	TokenNameStringLiteral	/delta
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAbsolute4	TokenNameIdentifier	 test Absolute4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"extended-setup"	TokenNameStringLiteral	extended-setup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tmpdir	TokenNameIdentifier	 tmpdir
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/tmp"	TokenNameStringLiteral	/tmp
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/alpha/beta/**/*"	TokenNameStringLiteral	/alpha/beta/**/*
,	TokenNameCOMMA	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/delta/*"	TokenNameStringLiteral	/delta/*
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"**/beta.xml"	TokenNameStringLiteral	**/beta.xml
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	/alpha/beta/gamma/gamma.xml
,	TokenNameCOMMA	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/delta/delta.xml"	TokenNameStringLiteral	/delta/delta.xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
tmpdir	TokenNameIdentifier	 tmpdir
+	TokenNamePLUS	
"/alpha/beta/gamma"	TokenNameStringLiteral	/alpha/beta/gamma
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAbsolute5	TokenNameIdentifier	 test Absolute5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//testing drive letter search from root: 	TokenNameCOMMENT_LINE	testing drive letter search from root: 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"*"	TokenNameStringLiteral	*
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//if this is our context we assume there must be something here: 	TokenNameCOMMENT_LINE	if this is our context we assume there must be something here: 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should have at least one resident file"	TokenNameStringLiteral	should have at least one resident file
,	TokenNameCOMMA	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedFilesCount	TokenNameIdentifier	 get Included Files Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedDirsCount	TokenNameIdentifier	 get Included Dirs Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectedFiles	TokenNameIdentifier	 expected Files
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectedDirectories	TokenNameIdentifier	 expected Directories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
includedFiles	TokenNameIdentifier	 included Files
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
includedDirectories	TokenNameIdentifier	 included Directories
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedDirectories	TokenNameIdentifier	 get Included Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file present: "	TokenNameStringLiteral	file present: 
,	TokenNameCOMMA	
expectedFiles	TokenNameIdentifier	 expected Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
includedFiles	TokenNameIdentifier	 included Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"directories present: "	TokenNameStringLiteral	directories present: 
,	TokenNameCOMMA	
expectedDirectories	TokenNameIdentifier	 expected Directories
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
includedDirectories	TokenNameIdentifier	 included Directories
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TreeSet	TokenNameIdentifier	 Tree Set
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
(	TokenNameLPAREN	
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
includedFiles	TokenNameIdentifier	 included Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
includedFiles	TokenNameIdentifier	 included Files
[	TokenNameLBRACKET	
counter	TokenNameIdentifier	 counter
]	TokenNameRBRACKET	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TreeSet	TokenNameIdentifier	 Tree Set
directories	TokenNameIdentifier	 directories
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
(	TokenNameLPAREN	
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
includedDirectories	TokenNameIdentifier	 included Directories
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
directories	TokenNameIdentifier	 directories
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
includedDirectories	TokenNameIdentifier	 included Directories
[	TokenNameLBRACKET	
counter	TokenNameIdentifier	 counter
]	TokenNameRBRACKET	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
currentfile	TokenNameIdentifier	 currentfile
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentfile	TokenNameIdentifier	 currentfile
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedFiles	TokenNameIdentifier	 expected Files
[	TokenNameLBRACKET	
counter	TokenNameIdentifier	 counter
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
currentfile	TokenNameIdentifier	 currentfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
currentdirectory	TokenNameIdentifier	 currentdirectory
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
dirit	TokenNameIdentifier	 dirit
=	TokenNameEQUAL	
directories	TokenNameIdentifier	 directories
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dirit	TokenNameIdentifier	 dirit
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentdirectory	TokenNameIdentifier	 currentdirectory
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
dirit	TokenNameIdentifier	 dirit
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedDirectories	TokenNameIdentifier	 expected Directories
[	TokenNameLBRACKET	
counter	TokenNameIdentifier	 counter
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
currentdirectory	TokenNameIdentifier	 currentdirectory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRecursiveExcludes	TokenNameIdentifier	 test Recursive Excludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"**/beta/**"	TokenNameStringLiteral	**/beta/**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
dirs	TokenNameIdentifier	 dirs
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getExcludedDirectories	TokenNameIdentifier	 get Excluded Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dirs	TokenNameIdentifier	 dirs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"beta is excluded"	TokenNameStringLiteral	beta is excluded
,	TokenNameCOMMA	
dirs	TokenNameIdentifier	 dirs
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"alpha/beta"	TokenNameStringLiteral	alpha/beta
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"gamma is excluded"	TokenNameStringLiteral	gamma is excluded
,	TokenNameCOMMA	
dirs	TokenNameIdentifier	 dirs
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"alpha/beta/gamma"	TokenNameStringLiteral	alpha/beta/gamma
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getExcludedFiles	TokenNameIdentifier	 get Excluded Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
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
"beta.xml is excluded"	TokenNameStringLiteral	beta.xml is excluded
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"alpha/beta/beta.xml"	TokenNameStringLiteral	alpha/beta/beta.xml
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"gamma.xml is excluded"	TokenNameStringLiteral	gamma.xml is excluded
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"alpha/beta/gamma/gamma.xml"	TokenNameStringLiteral	alpha/beta/gamma/gamma.xml
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testContentsExcluded	TokenNameIdentifier	 test Contents Excluded
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"**"	TokenNameStringLiteral	**
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
addDefaultExcludes	TokenNameIdentifier	 add Default Excludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
ensureNonPatternSetsReady	TokenNameIdentifier	 ensure Non Pattern Sets Ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
".svn"	TokenNameStringLiteral	.svn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
contentsExcluded	TokenNameIdentifier	 contents Excluded
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
