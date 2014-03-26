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
Task	TokenNameIdentifier	 Task
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListIterator	TokenNameIdentifier	 List Iterator
;	TokenNameSEMICOLON	
/** * This task takes file and turns them into a URL, which it then assigns * to a property. Use when for setting up RMI codebases. * <p/> * nested filesets are supported; if present, these are turned into the * url with the given separator between them (default = " "). * * @ant.task category="core" name="makeurl" */	TokenNameCOMMENT_JAVADOC	 This task takes file and turns them into a URL, which it then assigns to a property. Use when for setting up RMI codebases. <p/> nested filesets are supported; if present, these are turned into the url with the given separator between them (default = " "). * @ant.task category="core" name="makeurl" 
public	TokenNamepublic	
class	TokenNameclass	
MakeUrl	TokenNameIdentifier	 Make Url
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * name of the property to set */	TokenNameCOMMENT_JAVADOC	 name of the property to set 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
/** * name of a file to turn into a URL */	TokenNameCOMMENT_JAVADOC	 name of a file to turn into a URL 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
/** * separator char */	TokenNameCOMMENT_JAVADOC	 separator char 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
separator	TokenNameIdentifier	 separator
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * filesets of nested files to add to this url */	TokenNameCOMMENT_JAVADOC	 filesets of nested files to add to this url 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
filesets	TokenNameIdentifier	 filesets
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * paths to add */	TokenNameCOMMENT_JAVADOC	 paths to add 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
paths	TokenNameIdentifier	 paths
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * validation flag */	TokenNameCOMMENT_JAVADOC	 validation flag 
private	TokenNameprivate	
boolean	TokenNameboolean	
validate	TokenNameIdentifier	 validate
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// error message strings 	TokenNameCOMMENT_LINE	error message strings 
/** Missing file */	TokenNameCOMMENT_JAVADOC	 Missing file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_MISSING_FILE	TokenNameIdentifier	 ERROR  MISSING  FILE
=	TokenNameEQUAL	
"A source file is missing :"	TokenNameStringLiteral	A source file is missing :
;	TokenNameSEMICOLON	
/** No property defined */	TokenNameCOMMENT_JAVADOC	 No property defined 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_PROPERTY	TokenNameIdentifier	 ERROR  NO  PROPERTY
=	TokenNameEQUAL	
"No property defined"	TokenNameStringLiteral	No property defined
;	TokenNameSEMICOLON	
/** No files defined */	TokenNameCOMMENT_JAVADOC	 No files defined 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_FILES	TokenNameIdentifier	 ERROR  NO  FILES
=	TokenNameEQUAL	
"No files defined"	TokenNameStringLiteral	No files defined
;	TokenNameSEMICOLON	
/** * set the name of a property to fill with the URL * * @param property the name of the property. */	TokenNameCOMMENT_JAVADOC	 set the name of a property to fill with the URL * @param property the name of the property. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * the name of a file to be converted into a URL * * @param file the file to be converted. */	TokenNameCOMMENT_JAVADOC	 the name of a file to be converted into a URL * @param file the file to be converted. 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * a fileset of jar files to include in the URL, each * separated by the separator * * @param fileset the fileset to be added. */	TokenNameCOMMENT_JAVADOC	 a fileset of jar files to include in the URL, each separated by the separator * @param fileset the fileset to be added. 
public	TokenNamepublic	
void	TokenNamevoid	
addFileSet	TokenNameIdentifier	 add File Set
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set the separator for the multi-url option. * * @param separator the separator to use. */	TokenNameCOMMENT_JAVADOC	 set the separator for the multi-url option. * @param separator the separator to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setSeparator	TokenNameIdentifier	 set Separator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
=	TokenNameEQUAL	
separator	TokenNameIdentifier	 separator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set this flag to trigger validation that every named file exists. * Optional: default=true * * @param validate a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 set this flag to trigger validation that every named file exists. Optional: default=true * @param validate a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setValidate	TokenNameIdentifier	 set Validate
(	TokenNameLPAREN	
boolean	TokenNameboolean	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a path to the URL. All elements in the path * will be converted to individual URL entries * * @param path a path value. */	TokenNameCOMMENT_JAVADOC	 add a path to the URL. All elements in the path will be converted to individual URL entries * @param path a path value. 
public	TokenNamepublic	
void	TokenNamevoid	
addPath	TokenNameIdentifier	 add Path
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * convert the filesets to urls. * * @return null for no files */	TokenNameCOMMENT_JAVADOC	 convert the filesets to urls. * @return null for no files 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
filesetsToURL	TokenNameIdentifier	 filesets To URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
urls	TokenNameIdentifier	 urls
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ListIterator	TokenNameIdentifier	 List Iterator
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileSet	TokenNameIdentifier	 File Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
getDirectoryScanner	TokenNameIdentifier	 get Directory Scanner
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getIncludedFiles	TokenNameIdentifier	 get Included Files
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
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateFile	TokenNameIdentifier	 validate File
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
asUrl	TokenNameIdentifier	 as Url
=	TokenNameEQUAL	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
urls	TokenNameIdentifier	 urls
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
asUrl	TokenNameIdentifier	 as Url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
asUrl	TokenNameIdentifier	 as Url
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
urls	TokenNameIdentifier	 urls
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//at this point there is one trailing space to remove, if the list is not empty. 	TokenNameCOMMENT_LINE	at this point there is one trailing space to remove, if the list is not empty. 
return	TokenNamereturn	
stripTrailingSeparator	TokenNameIdentifier	 strip Trailing Separator
(	TokenNameLPAREN	
urls	TokenNameIdentifier	 urls
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * convert the string buffer to a string, potentially stripping * out any trailing separator * * @param urls URL buffer * @param count number of URL entries * @return trimmed string, or empty string */	TokenNameCOMMENT_JAVADOC	 convert the string buffer to a string, potentially stripping out any trailing separator * @param urls URL buffer @param count number of URL entries @return trimmed string, or empty string 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
stripTrailingSeparator	TokenNameIdentifier	 strip Trailing Separator
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
urls	TokenNameIdentifier	 urls
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
urls	TokenNameIdentifier	 urls
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
urls	TokenNameIdentifier	 urls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
separator	TokenNameIdentifier	 separator
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
urls	TokenNameIdentifier	 urls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
urls	TokenNameIdentifier	 urls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * convert all paths to URLs * * @return the paths as a separated list of URLs */	TokenNameCOMMENT_JAVADOC	 convert all paths to URLs * @return the paths as a separated list of URLs 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
pathsToURL	TokenNameIdentifier	 paths To URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
urls	TokenNameIdentifier	 urls
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ListIterator	TokenNameIdentifier	 List Iterator
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
)	TokenNameRPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
list	TokenNameIdentifier	 list
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
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateFile	TokenNameIdentifier	 validate File
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
asUrl	TokenNameIdentifier	 as Url
=	TokenNameEQUAL	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
urls	TokenNameIdentifier	 urls
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
asUrl	TokenNameIdentifier	 as Url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
asUrl	TokenNameIdentifier	 as Url
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
urls	TokenNameIdentifier	 urls
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//at this point there is one trailing space to remove, if the list is not empty. 	TokenNameCOMMENT_LINE	at this point there is one trailing space to remove, if the list is not empty. 
return	TokenNamereturn	
stripTrailingSeparator	TokenNameIdentifier	 strip Trailing Separator
(	TokenNameLPAREN	
urls	TokenNameIdentifier	 urls
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verify that the file exists, if {@link #validate} is set * * @param fileToCheck file that may need to exist * @throws BuildException with text beginning {@link #ERROR_MISSING_FILE} */	TokenNameCOMMENT_JAVADOC	 verify that the file exists, if {@link #validate} is set * @param fileToCheck file that may need to exist @throws BuildException with text beginning {@link #ERROR_MISSING_FILE} 
private	TokenNameprivate	
void	TokenNamevoid	
validateFile	TokenNameIdentifier	 validate File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
fileToCheck	TokenNameIdentifier	 file To Check
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
validate	TokenNameIdentifier	 validate
&&	TokenNameAND_AND	
!	TokenNameNOT	
fileToCheck	TokenNameIdentifier	 file To Check
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_MISSING_FILE	TokenNameIdentifier	 ERROR  MISSING  FILE
+	TokenNamePLUS	
fileToCheck	TokenNameIdentifier	 file To Check
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create the url * * @throws org.apache.tools.ant.BuildException * if something goes wrong with the build */	TokenNameCOMMENT_JAVADOC	 Create the url * @throws org.apache.tools.ant.BuildException if something goes wrong with the build 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//now exit here if the property is already set 	TokenNameCOMMENT_LINE	now exit here if the property is already set 
if	TokenNameif	
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
filesetURL	TokenNameIdentifier	 fileset URL
=	TokenNameEQUAL	
filesetsToURL	TokenNameIdentifier	 filesets To URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validateFile	TokenNameIdentifier	 validate File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//and add any files if also defined 	TokenNameCOMMENT_LINE	and add any files if also defined 
if	TokenNameif	
(	TokenNameLPAREN	
filesetURL	TokenNameIdentifier	 fileset URL
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
+	TokenNamePLUS	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
filesetURL	TokenNameIdentifier	 fileset URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
filesetURL	TokenNameIdentifier	 fileset URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//add path URLs 	TokenNameCOMMENT_LINE	add path URLs 
String	TokenNameIdentifier	 String
pathURL	TokenNameIdentifier	 path URL
=	TokenNameEQUAL	
pathsToURL	TokenNameIdentifier	 paths To URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pathURL	TokenNameIdentifier	 path URL
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
+	TokenNamePLUS	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
pathURL	TokenNameIdentifier	 path URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
pathURL	TokenNameIdentifier	 path URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Setting "	TokenNameStringLiteral	Setting 
+	TokenNamePLUS	
property	TokenNameIdentifier	 property
+	TokenNamePLUS	
" to URL "	TokenNameStringLiteral	 to URL 
+	TokenNamePLUS	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * check for errors * @throws BuildException if we are not configured right */	TokenNameCOMMENT_JAVADOC	 check for errors @throws BuildException if we are not configured right 
private	TokenNameprivate	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//validation 	TokenNameCOMMENT_LINE	validation 
if	TokenNameif	
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_PROPERTY	TokenNameIdentifier	 ERROR  NO  PROPERTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ERROR_NO_FILES	TokenNameIdentifier	 ERROR  NO  FILES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * convert a file to a URL; * * @param fileToConvert * @return the file converted to a URL */	TokenNameCOMMENT_JAVADOC	 convert a file to a URL; * @param fileToConvert @return the file converted to a URL 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
fileToConvert	TokenNameIdentifier	 file To Convert
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
//create the URL 	TokenNameCOMMENT_LINE	create the URL 
//ant equivalent of fileToConvert.toURI().toURL().toExternalForm(); 	TokenNameCOMMENT_LINE	ant equivalent of fileToConvert.toURI().toURL().toExternalForm(); 
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
fileToConvert	TokenNameIdentifier	 file To Convert
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
