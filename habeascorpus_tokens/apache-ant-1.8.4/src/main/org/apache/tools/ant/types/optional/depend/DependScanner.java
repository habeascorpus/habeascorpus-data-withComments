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
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
Path	TokenNameIdentifier	 Path
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
depend	TokenNameIdentifier	 depend
.	TokenNameDOT	
DependencyAnalyzer	TokenNameIdentifier	 Dependency Analyzer
;	TokenNameSEMICOLON	
/** * DirectoryScanner for finding class dependencies. */	TokenNameCOMMENT_JAVADOC	 DirectoryScanner for finding class dependencies. 
public	TokenNamepublic	
class	TokenNameclass	
DependScanner	TokenNameIdentifier	 Depend Scanner
extends	TokenNameextends	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
{	TokenNameLBRACE	
/** * The name of the analyzer to use by default. */	TokenNameCOMMENT_JAVADOC	 The name of the analyzer to use by default. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_ANALYZER_CLASS	TokenNameIdentifier	 DEFAULT  ANALYZER  CLASS
=	TokenNameEQUAL	
"org.apache.tools.ant.util.depend.bcel.FullAnalyzer"	TokenNameStringLiteral	org.apache.tools.ant.util.depend.bcel.FullAnalyzer
;	TokenNameSEMICOLON	
/** * The root classes to drive the search for dependent classes. */	TokenNameCOMMENT_JAVADOC	 The root classes to drive the search for dependent classes. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
rootClasses	TokenNameIdentifier	 root Classes
;	TokenNameSEMICOLON	
/** * The names of the classes to include in the fileset. */	TokenNameCOMMENT_JAVADOC	 The names of the classes to include in the fileset. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
included	TokenNameIdentifier	 included
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
additionalBaseDirs	TokenNameIdentifier	 additional Base Dirs
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The parent scanner which gives the basic set of files. Only files which * are in this set and which can be reached from a root class will end * up being included in the result set. */	TokenNameCOMMENT_JAVADOC	 The parent scanner which gives the basic set of files. Only files which are in this set and which can be reached from a root class will end up being included in the result set. 
private	TokenNameprivate	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
parentScanner	TokenNameIdentifier	 parent Scanner
;	TokenNameSEMICOLON	
/** * Create a DependScanner, using the given scanner to provide the basic * set of files from which class files come. * * @param parentScanner the DirectoryScanner which returns the files from * which class files must come. */	TokenNameCOMMENT_JAVADOC	 Create a DependScanner, using the given scanner to provide the basic set of files from which class files come. * @param parentScanner the DirectoryScanner which returns the files from which class files must come. 
public	TokenNamepublic	
DependScanner	TokenNameIdentifier	 Depend Scanner
(	TokenNameLPAREN	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
parentScanner	TokenNameIdentifier	 parent Scanner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parentScanner	TokenNameIdentifier	 parent Scanner
=	TokenNameEQUAL	
parentScanner	TokenNameIdentifier	 parent Scanner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the root classes to be used to drive the scan. * * @param rootClasses the rootClasses to be used for this scan. */	TokenNameCOMMENT_JAVADOC	 Sets the root classes to be used to drive the scan. * @param rootClasses the rootClasses to be used for this scan. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setRootClasses	TokenNameIdentifier	 set Root Classes
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
rootClasses	TokenNameIdentifier	 root Classes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rootClasses	TokenNameIdentifier	 root Classes
=	TokenNameEQUAL	
rootClasses	TokenNameIdentifier	 root Classes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the names of the class files on which baseClass depends. * * @return the names of the files. */	TokenNameCOMMENT_JAVADOC	 Get the names of the class files on which baseClass depends. * @return the names of the files. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
getIncludedFilesCount	TokenNameIdentifier	 get Included Files Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
getIncludedFilesCount	TokenNameIdentifier	 get Included Files Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scans the base directory for files on which baseClass depends. * * @exception IllegalStateException when basedir was set incorrectly. */	TokenNameCOMMENT_JAVADOC	 Scans the base directory for files on which baseClass depends. * @exception IllegalStateException when basedir was set incorrectly. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
{	TokenNameLBRACE	
included	TokenNameIdentifier	 included
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
=	TokenNameEQUAL	
DEFAULT_ANALYZER_CLASS	TokenNameIdentifier	 DEFAULT  ANALYZER  CLASS
;	TokenNameSEMICOLON	
DependencyAnalyzer	TokenNameIdentifier	 Dependency Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
analyzerClass	TokenNameIdentifier	 analyzer Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DependencyAnalyzer	TokenNameIdentifier	 Dependency Analyzer
)	TokenNameRPAREN	
analyzerClass	TokenNameIdentifier	 analyzer Class
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to load dependency analyzer: "	TokenNameStringLiteral	Unable to load dependency analyzer: 
+	TokenNamePLUS	
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
addClassPath	TokenNameIdentifier	 add Class Path
(	TokenNameLPAREN	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
additionalBaseDirs	TokenNameIdentifier	 additional Base Dirs
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
additionalBaseDir	TokenNameIdentifier	 additional Base Dir
=	TokenNameEQUAL	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
addClassPath	TokenNameIdentifier	 add Class Path
(	TokenNameLPAREN	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
additionalBaseDir	TokenNameIdentifier	 additional Base Dir
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
rootClasses	TokenNameIdentifier	 root Classes
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
rootClass	TokenNameIdentifier	 root Class
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
addRootClass	TokenNameIdentifier	 add Root Class
(	TokenNameLPAREN	
rootClass	TokenNameIdentifier	 root Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
getClassDependencies	TokenNameIdentifier	 get Class Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parentFiles	TokenNameIdentifier	 parent Files
=	TokenNameEQUAL	
parentScanner	TokenNameIdentifier	 parent Scanner
.	TokenNameDOT	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
parentSet	TokenNameIdentifier	 parent Set
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
parentFiles	TokenNameIdentifier	 parent Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentSet	TokenNameIdentifier	 parent Set
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
parentFiles	TokenNameIdentifier	 parent Files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
parentFiles	TokenNameIdentifier	 parent Files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
depFile	TokenNameIdentifier	 dep File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
depFile	TokenNameIdentifier	 dep File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
parentSet	TokenNameIdentifier	 parent Set
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is included 	TokenNameCOMMENT_LINE	This is included 
included	TokenNameIdentifier	 included
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see DirectoryScanner#addDefaultExcludes */	TokenNameCOMMENT_JAVADOC	 @see DirectoryScanner#addDefaultExcludes 
public	TokenNamepublic	
void	TokenNamevoid	
addDefaultExcludes	TokenNameIdentifier	 add Default Excludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see DirectoryScanner#getExcludedDirectories */	TokenNameCOMMENT_JAVADOC	 @see DirectoryScanner#getExcludedDirectories 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getExcludedDirectories	TokenNameIdentifier	 get Excluded Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DirectoryScanner#getExcludedFiles */	TokenNameCOMMENT_JAVADOC	 @see DirectoryScanner#getExcludedFiles 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getExcludedFiles	TokenNameIdentifier	 get Excluded Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DirectoryScanner#getIncludedDirectories */	TokenNameCOMMENT_JAVADOC	 @see DirectoryScanner#getIncludedDirectories 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getIncludedDirectories	TokenNameIdentifier	 get Included Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DirectoryScanner#getIncludedDirsCount */	TokenNameCOMMENT_JAVADOC	 @see DirectoryScanner#getIncludedDirsCount 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
int	TokenNameint	
getIncludedDirsCount	TokenNameIdentifier	 get Included Dirs Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DirectoryScanner#getNotIncludedDirectories */	TokenNameCOMMENT_JAVADOC	 @see DirectoryScanner#getNotIncludedDirectories 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getNotIncludedDirectories	TokenNameIdentifier	 get Not Included Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DirectoryScanner#getNotIncludedFiles */	TokenNameCOMMENT_JAVADOC	 @see DirectoryScanner#getNotIncludedFiles 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getNotIncludedFiles	TokenNameIdentifier	 get Not Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DirectoryScanner#setExcludes */	TokenNameCOMMENT_JAVADOC	 @see DirectoryScanner#setExcludes 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see DirectoryScanner#setIncludes */	TokenNameCOMMENT_JAVADOC	 @see DirectoryScanner#setIncludes 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
includes	TokenNameIdentifier	 includes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see DirectoryScanner#setCaseSensitive */	TokenNameCOMMENT_JAVADOC	 @see DirectoryScanner#setCaseSensitive 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addBasedir	TokenNameIdentifier	 add Basedir
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
baseDir	TokenNameIdentifier	 base Dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
additionalBaseDirs	TokenNameIdentifier	 additional Base Dirs
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
baseDir	TokenNameIdentifier	 base Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
