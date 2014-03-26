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
selectors	TokenNameIdentifier	 selectors
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
/** * Base test case for Selectors. Provides a shared test as well as * a test bed for selecting on, and a helper method for determining * whether selections are correct. * */	TokenNameCOMMENT_JAVADOC	 Base test case for Selectors. Provides a shared test as well as a test bed for selecting on, and a helper method for determining whether selections are correct. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BaseSelectorTest	TokenNameIdentifier	 Base Selector Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TaskdefForMakingBed	TokenNameIdentifier	 Taskdef For Making Bed
tbed	TokenNameIdentifier	 tbed
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
basedirname	TokenNameIdentifier	 basedirname
=	TokenNameEQUAL	
"src/etc/testcases/types"	TokenNameStringLiteral	src/etc/testcases/types
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
beddirname	TokenNameIdentifier	 beddirname
=	TokenNameEQUAL	
basedirname	TokenNameIdentifier	 basedirname
+	TokenNamePLUS	
"/selectortest"	TokenNameStringLiteral	/selectortest
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
mirrordirname	TokenNameIdentifier	 mirrordirname
=	TokenNameEQUAL	
basedirname	TokenNameIdentifier	 basedirname
+	TokenNamePLUS	
"/selectortest2"	TokenNameStringLiteral	/selectortest2
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
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
basedirname	TokenNameIdentifier	 basedirname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
beddir	TokenNameIdentifier	 beddir
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
beddirname	TokenNameIdentifier	 beddirname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
mirrordir	TokenNameIdentifier	 mirrordir
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
mirrordirname	TokenNameIdentifier	 mirrordirname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
filenames	TokenNameIdentifier	 filenames
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
"asf-logo.gif.md5"	TokenNameStringLiteral	asf-logo.gif.md5
,	TokenNameCOMMA	
"asf-logo.gif.bz2"	TokenNameStringLiteral	asf-logo.gif.bz2
,	TokenNameCOMMA	
"asf-logo.gif.gz"	TokenNameStringLiteral	asf-logo.gif.gz
,	TokenNameCOMMA	
"copy.filterset.filtered"	TokenNameStringLiteral	copy.filterset.filtered
,	TokenNameCOMMA	
"zip/asf-logo.gif.zip"	TokenNameStringLiteral	zip/asf-logo.gif.zip
,	TokenNameCOMMA	
"tar/asf-logo.gif.tar"	TokenNameStringLiteral	tar/asf-logo.gif.tar
,	TokenNameCOMMA	
"tar/asf-logo-huge.tar.gz"	TokenNameStringLiteral	tar/asf-logo-huge.tar.gz
,	TokenNameCOMMA	
"tar/gz/asf-logo.gif.tar.gz"	TokenNameStringLiteral	tar/gz/asf-logo.gif.tar.gz
,	TokenNameCOMMA	
"tar/bz2/asf-logo.gif.tar.bz2"	TokenNameStringLiteral	tar/bz2/asf-logo.gif.tar.bz2
,	TokenNameCOMMA	
"tar/bz2/asf-logo-huge.tar.bz2"	TokenNameStringLiteral	tar/bz2/asf-logo-huge.tar.bz2
,	TokenNameCOMMA	
"tar/bz2"	TokenNameStringLiteral	tar/bz2
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
filenames	TokenNameIdentifier	 filenames
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mirrorfiles	TokenNameIdentifier	 mirrorfiles
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
filenames	TokenNameIdentifier	 filenames
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BaseSelectorTest	TokenNameIdentifier	 Base Selector Test
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
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setBaseDir	TokenNameIdentifier	 set Base Dir
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
beddir	TokenNameIdentifier	 beddir
,	TokenNameCOMMA	
filenames	TokenNameIdentifier	 filenames
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mirrorfiles	TokenNameIdentifier	 mirrorfiles
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
mirrordir	TokenNameIdentifier	 mirrordir
,	TokenNameCOMMA	
filenames	TokenNameIdentifier	 filenames
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Override this in child classes to return a specific Selector */	TokenNameCOMMENT_JAVADOC	 Override this in child classes to return a specific Selector 
public	TokenNamepublic	
abstract	TokenNameabstract	
BaseSelector	TokenNameIdentifier	 Base Selector
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return a preconfigured selector (with a set reference to * project instance). * @return the selector */	TokenNameCOMMENT_JAVADOC	 Return a preconfigured selector (with a set reference to project instance). @return the selector 
public	TokenNamepublic	
BaseSelector	TokenNameIdentifier	 Base Selector
getSelector	TokenNameIdentifier	 get Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BaseSelector	TokenNameIdentifier	 Base Selector
selector	TokenNameIdentifier	 selector
=	TokenNameEQUAL	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selector	TokenNameIdentifier	 selector
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
selector	TokenNameIdentifier	 selector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Project	TokenNameIdentifier	 Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is a test that all Selectors derived from BaseSelector can * use. It calls the setError() method and checks to ensure that a * BuildException is thrown as a result. */	TokenNameCOMMENT_JAVADOC	 This is a test that all Selectors derived from BaseSelector can use. It calls the setError() method and checks to ensure that a BuildException is thrown as a result. 
public	TokenNamepublic	
void	TokenNamevoid	
testRespondsToError	TokenNameIdentifier	 test Responds To Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BaseSelector	TokenNameIdentifier	 Base Selector
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"test error"	TokenNameStringLiteral	test error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
beddir	TokenNameIdentifier	 beddir
,	TokenNameCOMMA	
filenames	TokenNameIdentifier	 filenames
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Cannot cause BuildException when setError() is called"	TokenNameStringLiteral	Cannot cause BuildException when setError() is called
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"test error"	TokenNameStringLiteral	test error
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This is a helper method that takes a selector and calls its * isSelected() method on each file in the testbed. It returns * a string of "T"s amd "F"s */	TokenNameCOMMENT_JAVADOC	 This is a helper method that takes a selector and calls its isSelected() method on each file in the testbed. It returns a string of "T"s amd "F"s 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
selectionString	TokenNameIdentifier	 selection String
(	TokenNameLPAREN	
FileSelector	TokenNameIdentifier	 File Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
selectionString	TokenNameIdentifier	 selection String
(	TokenNameLPAREN	
beddir	TokenNameIdentifier	 beddir
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is a helper method that takes a selector and calls its * isSelected() method on each file in the mirror testbed. This * variation is used for dependency checks and to get around the * limitations in the touch task when running JDK 1.1. It returns * a string of "T"s amd "F"s. */	TokenNameCOMMENT_JAVADOC	 This is a helper method that takes a selector and calls its isSelected() method on each file in the mirror testbed. This variation is used for dependency checks and to get around the limitations in the touch task when running JDK 1.1. It returns a string of "T"s amd "F"s. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
mirrorSelectionString	TokenNameIdentifier	 mirror Selection String
(	TokenNameLPAREN	
FileSelector	TokenNameIdentifier	 File Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
selectionString	TokenNameIdentifier	 selection String
(	TokenNameLPAREN	
mirrordir	TokenNameIdentifier	 mirrordir
,	TokenNameCOMMA	
mirrorfiles	TokenNameIdentifier	 mirrorfiles
,	TokenNameCOMMA	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Worker method for the two convenience methods above. Applies a * selector on a set of files passed in and returns a string of * "T"s amd "F"s from applying the selector to each file. */	TokenNameCOMMENT_JAVADOC	 Worker method for the two convenience methods above. Applies a selector on a set of files passed in and returns a string of "T"s amd "F"s from applying the selector to each file. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
selectionString	TokenNameIdentifier	 selection String
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
FileSelector	TokenNameIdentifier	 File Selector
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
filenames	TokenNameIdentifier	 filenames
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'T'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'F'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does the selection test for a given selector and prints the * filenames of the differing files (selected but shouldn't, * not selected but should). * @param selector The selector to test * @param expected The expected result */	TokenNameCOMMENT_JAVADOC	 Does the selection test for a given selector and prints the filenames of the differing files (selected but shouldn't, not selected but should). @param selector The selector to test @param expected The expected result 
public	TokenNamepublic	
void	TokenNamevoid	
performTests	TokenNameIdentifier	 perform Tests
(	TokenNameLPAREN	
FileSelector	TokenNameIdentifier	 File Selector
selector	TokenNameIdentifier	 selector
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
selectionString	TokenNameIdentifier	 selection String
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Differing files: "	TokenNameStringLiteral	Differing files: 
+	TokenNamePLUS	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks which files are selected and shouldn't be or which * are not selected but should. * @param expected String containing 'F's and 'T's * @param result String containing 'F's and 'T's * @return Difference as String containing '-' (equal) and * 'X' (difference). */	TokenNameCOMMENT_JAVADOC	 Checks which files are selected and shouldn't be or which are not selected but should. @param expected String containing 'F's and 'T's @param result String containing 'F's and 'T's @return Difference as String containing '-' (equal) and 'X' (difference). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length1	TokenNameIdentifier	 length1
=	TokenNameEQUAL	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length2	TokenNameIdentifier	 length2
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
(	TokenNameLPAREN	
length1	TokenNameIdentifier	 length1
>	TokenNameGREATER	
length2	TokenNameIdentifier	 length2
)	TokenNameRPAREN	
?	TokenNameQUESTION	
length2	TokenNameIdentifier	 length2
:	TokenNameCOLON	
length1	TokenNameIdentifier	 length1
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
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
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"-"	TokenNameStringLiteral	-
:	TokenNameCOLON	
"X"	TokenNameStringLiteral	X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resolves a diff-String (@see diff()) against the (inherited) filenames- * and files arrays. * @param filelist Diff-String * @return String containing the filenames for all differing files, * separated with semicolons ';' */	TokenNameCOMMENT_JAVADOC	 Resolves a diff-String (@see diff()) against the (inherited) filenames- and files arrays. @param filelist Diff-String @return String containing the filenames for all differing files, separated with semicolons ';' 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filelist	TokenNameIdentifier	 filelist
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
(	TokenNameLPAREN	
filenames	TokenNameIdentifier	 filenames
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
filelist	TokenNameIdentifier	 filelist
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
filelist	TokenNameIdentifier	 filelist
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
filenames	TokenNameIdentifier	 filenames
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
'X'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
filelist	TokenNameIdentifier	 filelist
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
filenames	TokenNameIdentifier	 filenames
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
";"	TokenNameStringLiteral	;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Creates a testbed. We avoid the dreaded "test" word so that we * don't falsely identify this as a test to be run. The actual * setting up of the testbed is done in the * <code>src/etc/testcases/types/selectors.xml</code> build file.</p> * * <p>Note that the right way to call this is within a try block, * with a finally clause that calls cleanupBed(). You place tests of * the isSelected() method within the try block.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Creates a testbed. We avoid the dreaded "test" word so that we don't falsely identify this as a test to be run. The actual setting up of the testbed is done in the <code>src/etc/testcases/types/selectors.xml</code> build file.</p> * <p>Note that the right way to call this is within a try block, with a finally clause that calls cleanupBed(). You place tests of the isSelected() method within the try block.</p> 
protected	TokenNameprotected	
void	TokenNamevoid	
makeBed	TokenNameIdentifier	 make Bed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tbed	TokenNameIdentifier	 tbed
=	TokenNameEQUAL	
new	TokenNamenew	
TaskdefForMakingBed	TokenNameIdentifier	 Taskdef For Making Bed
(	TokenNameLPAREN	
"setupfiles"	TokenNameStringLiteral	setupfiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tbed	TokenNameIdentifier	 tbed
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tbed	TokenNameIdentifier	 tbed
.	TokenNameDOT	
makeTestbed	TokenNameIdentifier	 make Testbed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cleans up the testbed by calling a target in the * <code>src/etc/testcases/types/selectors.xml</code> file. */	TokenNameCOMMENT_JAVADOC	 Cleans up the testbed by calling a target in the <code>src/etc/testcases/types/selectors.xml</code> file. 
protected	TokenNameprotected	
void	TokenNamevoid	
cleanupBed	TokenNameIdentifier	 cleanup Bed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tbed	TokenNameIdentifier	 tbed
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tbed	TokenNameIdentifier	 tbed
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tbed	TokenNameIdentifier	 tbed
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Creates a mirror of the testbed for use in dependency checks.</p> * * <p>Note that the right way to call this is within a try block, * with a finally clause that calls cleanupMirror(). You place tests of * the isSelected() method within the try block.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Creates a mirror of the testbed for use in dependency checks.</p> * <p>Note that the right way to call this is within a try block, with a finally clause that calls cleanupMirror(). You place tests of the isSelected() method within the try block.</p> 
protected	TokenNameprotected	
void	TokenNamevoid	
makeMirror	TokenNameIdentifier	 make Mirror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tbed	TokenNameIdentifier	 tbed
=	TokenNameEQUAL	
new	TokenNamenew	
TaskdefForMakingBed	TokenNameIdentifier	 Taskdef For Making Bed
(	TokenNameLPAREN	
"mirrorfiles"	TokenNameStringLiteral	mirrorfiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tbed	TokenNameIdentifier	 tbed
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tbed	TokenNameIdentifier	 tbed
.	TokenNameDOT	
makeMirror	TokenNameIdentifier	 make Mirror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cleans up the mirror testbed by calling a target in the * <code>src/etc/testcases/types/selectors.xml</code> file. */	TokenNameCOMMENT_JAVADOC	 Cleans up the mirror testbed by calling a target in the <code>src/etc/testcases/types/selectors.xml</code> file. 
protected	TokenNameprotected	
void	TokenNamevoid	
cleanupMirror	TokenNameIdentifier	 cleanup Mirror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tbed	TokenNameIdentifier	 tbed
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tbed	TokenNameIdentifier	 tbed
.	TokenNameDOT	
deleteMirror	TokenNameIdentifier	 delete Mirror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tbed	TokenNameIdentifier	 tbed
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
TaskdefForMakingBed	TokenNameIdentifier	 Taskdef For Making Bed
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
TaskdefForMakingBed	TokenNameIdentifier	 Taskdef For Making Bed
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
"src/etc/testcases/types/selectors.xml"	TokenNameStringLiteral	src/etc/testcases/types/selectors.xml
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
makeTestbed	TokenNameIdentifier	 make Testbed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"setupfiles"	TokenNameStringLiteral	setupfiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
makeMirror	TokenNameIdentifier	 make Mirror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"mirrorfiles"	TokenNameStringLiteral	mirrorfiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
deleteMirror	TokenNameIdentifier	 delete Mirror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"cleanup.mirrorfiles"	TokenNameStringLiteral	cleanup.mirrorfiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
