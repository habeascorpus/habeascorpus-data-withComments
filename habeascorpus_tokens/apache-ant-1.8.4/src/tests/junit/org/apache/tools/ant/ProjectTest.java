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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
DefaultInputHandler	TokenNameIdentifier	 Default Input Handler
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
InputHandler	TokenNameIdentifier	 Input Handler
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
PropertyFileInputHandler	TokenNameIdentifier	 Property File Input Handler
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
*	TokenNameMULTIPLY	
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
/** * Very limited test class for Project. Waiting to be extended. * */	TokenNameCOMMENT_JAVADOC	 Very limited test class for Project. Waiting to be extended. 
public	TokenNamepublic	
class	TokenNameclass	
ProjectTest	TokenNameIdentifier	 Project Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MockBuildListener	TokenNameIdentifier	 Mock Build Listener
mbl	TokenNameIdentifier	 mbl
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ProjectTest	TokenNameIdentifier	 Project Test
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
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
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
;	TokenNameSEMICOLON	
mbl	TokenNameIdentifier	 mbl
=	TokenNameEQUAL	
new	TokenNamenew	
MockBuildListener	TokenNameIdentifier	 Mock Build Listener
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDataTypes	TokenNameIdentifier	 test Data Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"dummy is not a known data type"	TokenNameStringLiteral	dummy is not a known data type
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
createDataType	TokenNameIdentifier	 create Data Type
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
createDataType	TokenNameIdentifier	 create Data Type
(	TokenNameLPAREN	
"fileset"	TokenNameStringLiteral	fileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"fileset is a known type"	TokenNameStringLiteral	fileset is a known type
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"fileset creates FileSet"	TokenNameStringLiteral	fileset creates FileSet
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"PatternSet"	TokenNameStringLiteral	PatternSet
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
createDataType	TokenNameIdentifier	 create Data Type
(	TokenNameLPAREN	
"patternset"	TokenNameStringLiteral	patternset
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
PatternSet	TokenNameIdentifier	 Pattern Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Path"	TokenNameStringLiteral	Path
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
createDataType	TokenNameIdentifier	 create Data Type
(	TokenNameLPAREN	
"path"	TokenNameStringLiteral	path
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
Path	TokenNameIdentifier	 Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This test has been a starting point for moving the code to FileUtils. */	TokenNameCOMMENT_JAVADOC	 This test has been a starting point for moving the code to FileUtils. 
public	TokenNamepublic	
void	TokenNamevoid	
testResolveFile	TokenNameIdentifier	 test Resolve File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"dos"	TokenNameStringLiteral	dos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * throw in drive letters */	TokenNameCOMMENT_BLOCK	 throw in drive letters 
String	TokenNameIdentifier	 String
driveSpec	TokenNameIdentifier	 drive Spec
=	TokenNameEQUAL	
"C:"	TokenNameStringLiteral	C:
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
=	TokenNameEQUAL	
"c:"	TokenNameStringLiteral	c:
;	TokenNameSEMICOLON	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * promised to eliminate consecutive slashes after drive letter. */	TokenNameCOMMENT_BLOCK	 promised to eliminate consecutive slashes after drive letter. 
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"/////"	TokenNameStringLiteral	/////
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\\\\\\"	TokenNameStringLiteral	\\\\\\
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* * Start with simple absolute file names. */	TokenNameCOMMENT_BLOCK	 Start with simple absolute file names. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * drive letters are not used, just to be considered as normal * part of a name */	TokenNameCOMMENT_BLOCK	 drive letters are not used, just to be considered as normal part of a name 
String	TokenNameIdentifier	 String
driveSpec	TokenNameIdentifier	 drive Spec
=	TokenNameEQUAL	
"C:"	TokenNameStringLiteral	C:
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
udir	TokenNameIdentifier	 udir
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.dir"	TokenNameStringLiteral	user.dir
)	TokenNameRPAREN	
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
udir	TokenNameIdentifier	 udir
+	TokenNamePLUS	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
udir	TokenNameIdentifier	 udir
+	TokenNamePLUS	
driveSpec	TokenNameIdentifier	 drive Spec
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
driveSpec	TokenNameIdentifier	 drive Spec
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
=	TokenNameEQUAL	
"c:"	TokenNameStringLiteral	c:
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
udir	TokenNameIdentifier	 udir
+	TokenNamePLUS	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
udir	TokenNameIdentifier	 udir
+	TokenNamePLUS	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
driveSpecLower	TokenNameIdentifier	 drive Spec Lower
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Now test some relative file name magic. */	TokenNameCOMMENT_BLOCK	 Now test some relative file name magic. 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"4"	TokenNameStringLiteral	4
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"./4"	TokenNameStringLiteral	./4
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
".\4"	TokenNameStringLiteral	.\4
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"./.\4"	TokenNameStringLiteral	./.\4
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"../3/4"	TokenNameStringLiteral	../3/4
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"..\3\4"	TokenNameStringLiteral	..\3\4
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"../../5/.././2/./3/6/../4"	TokenNameStringLiteral	../../5/.././2/./3/6/../4
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3/4"	TokenNameStringLiteral	/1/2/3/4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"..\../5/..\./2/./3/6\../4"	TokenNameStringLiteral	..\../5/..\./2/./3/6\../4
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
"/1/2/3"	TokenNameStringLiteral	/1/2/3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * adapt file separators to local conventions */	TokenNameCOMMENT_JAVADOC	 adapt file separators to local conventions 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
localize	TokenNameIdentifier	 localize
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
/** * convenience method * the drive letter is in lower case under cygwin * calling this method allows tests where FileUtils.normalize * is called via resolveFile to pass under cygwin */	TokenNameCOMMENT_JAVADOC	 convenience method the drive letter is in lower case under cygwin calling this method allows tests where FileUtils.normalize is called via resolveFile to pass under cygwin 
private	TokenNameprivate	
void	TokenNamevoid	
assertEqualsIgnoreDriveCase	TokenNameIdentifier	 assert Equals Ignore Drive Case
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
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
&&	TokenNameAND_AND	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb1	TokenNameIdentifier	 sb1
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb2	TokenNameIdentifier	 sb2
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb1	TokenNameIdentifier	 sb1
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb2	TokenNameIdentifier	 sb2
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
sb1	TokenNameIdentifier	 sb1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sb2	TokenNameIdentifier	 sb2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertTaskDefFails	TokenNameIdentifier	 assert Task Def Fails
(	TokenNameLPAREN	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
taskClass	TokenNameIdentifier	 task Class
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
dummyName	TokenNameIdentifier	 dummy Name
=	TokenNameEQUAL	
"testTaskDefinitionDummy"	TokenNameStringLiteral	testTaskDefinitionDummy
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
mbl	TokenNameIdentifier	 mbl
.	TokenNameDOT	
addBuildEvent	TokenNameIdentifier	 add Build Event
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addTaskDefinition	TokenNameIdentifier	 add Task Definition
(	TokenNameLPAREN	
dummyName	TokenNameIdentifier	 dummy Name
,	TokenNameCOMMA	
taskClass	TokenNameIdentifier	 task Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"expected BuildException(""	TokenNameStringLiteral	expected BuildException("
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
+	TokenNamePLUS	
"", Project.MSG_ERR) when adding task "	TokenNameStringLiteral	", Project.MSG_ERR) when adding task 
+	TokenNamePLUS	
taskClass	TokenNameIdentifier	 task Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mbl	TokenNameIdentifier	 mbl
.	TokenNameDOT	
assertEmpty	TokenNameIdentifier	 assert Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getTaskDefinitions	TokenNameIdentifier	 get Task Definitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
dummyName	TokenNameIdentifier	 dummy Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAddTaskDefinition	TokenNameIdentifier	 test Add Task Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
mbl	TokenNameIdentifier	 mbl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addTaskDefinition	TokenNameIdentifier	 add Task Definition
(	TokenNameLPAREN	
"Ok"	TokenNameStringLiteral	Ok
,	TokenNameCOMMA	
DummyTaskOk	TokenNameIdentifier	 Dummy Task Ok
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
DummyTaskOk	TokenNameIdentifier	 Dummy Task Ok
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getTaskDefinitions	TokenNameIdentifier	 get Task Definitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Ok"	TokenNameStringLiteral	Ok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addTaskDefinition	TokenNameIdentifier	 add Task Definition
(	TokenNameLPAREN	
"OkNonTask"	TokenNameStringLiteral	OkNonTask
,	TokenNameCOMMA	
DummyTaskOkNonTask	TokenNameIdentifier	 Dummy Task Ok Non Task
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
DummyTaskOkNonTask	TokenNameIdentifier	 Dummy Task Ok Non Task
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getTaskDefinitions	TokenNameIdentifier	 get Task Definitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"OkNonTask"	TokenNameStringLiteral	OkNonTask
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mbl	TokenNameIdentifier	 mbl
.	TokenNameDOT	
assertEmpty	TokenNameIdentifier	 assert Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTaskDefFails	TokenNameIdentifier	 assert Task Def Fails
(	TokenNameLPAREN	
DummyTaskPrivate	TokenNameIdentifier	 Dummy Task Private
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
DummyTaskPrivate	TokenNameIdentifier	 Dummy Task Private
.	TokenNameDOT	
class	TokenNameclass	
+	TokenNamePLUS	
" is not public"	TokenNameStringLiteral	 is not public
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTaskDefFails	TokenNameIdentifier	 assert Task Def Fails
(	TokenNameLPAREN	
DummyTaskProtected	TokenNameIdentifier	 Dummy Task Protected
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
DummyTaskProtected	TokenNameIdentifier	 Dummy Task Protected
.	TokenNameDOT	
class	TokenNameclass	
+	TokenNamePLUS	
" is not public"	TokenNameStringLiteral	 is not public
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTaskDefFails	TokenNameIdentifier	 assert Task Def Fails
(	TokenNameLPAREN	
DummyTaskPackage	TokenNameIdentifier	 Dummy Task Package
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
DummyTaskPackage	TokenNameIdentifier	 Dummy Task Package
.	TokenNameDOT	
class	TokenNameclass	
+	TokenNamePLUS	
" is not public"	TokenNameStringLiteral	 is not public
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTaskDefFails	TokenNameIdentifier	 assert Task Def Fails
(	TokenNameLPAREN	
DummyTaskAbstract	TokenNameIdentifier	 Dummy Task Abstract
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
DummyTaskAbstract	TokenNameIdentifier	 Dummy Task Abstract
.	TokenNameDOT	
class	TokenNameclass	
+	TokenNamePLUS	
" is abstract"	TokenNameStringLiteral	 is abstract
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTaskDefFails	TokenNameIdentifier	 assert Task Def Fails
(	TokenNameLPAREN	
DummyTaskInterface	TokenNameIdentifier	 Dummy Task Interface
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
DummyTaskInterface	TokenNameIdentifier	 Dummy Task Interface
.	TokenNameDOT	
class	TokenNameclass	
+	TokenNamePLUS	
" is abstract"	TokenNameStringLiteral	 is abstract
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTaskDefFails	TokenNameIdentifier	 assert Task Def Fails
(	TokenNameLPAREN	
DummyTaskWithoutDefaultConstructor	TokenNameIdentifier	 Dummy Task Without Default Constructor
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"No public no-arg constructor in "	TokenNameStringLiteral	No public no-arg constructor in 
+	TokenNamePLUS	
DummyTaskWithoutDefaultConstructor	TokenNameIdentifier	 Dummy Task Without Default Constructor
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTaskDefFails	TokenNameIdentifier	 assert Task Def Fails
(	TokenNameLPAREN	
DummyTaskWithoutPublicConstructor	TokenNameIdentifier	 Dummy Task Without Public Constructor
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"No public no-arg constructor in "	TokenNameStringLiteral	No public no-arg constructor in 
+	TokenNamePLUS	
DummyTaskWithoutPublicConstructor	TokenNameIdentifier	 Dummy Task Without Public Constructor
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTaskDefFails	TokenNameIdentifier	 assert Task Def Fails
(	TokenNameLPAREN	
DummyTaskWithoutExecute	TokenNameIdentifier	 Dummy Task Without Execute
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"No public execute() in "	TokenNameStringLiteral	No public execute() in 
+	TokenNamePLUS	
DummyTaskWithoutExecute	TokenNameIdentifier	 Dummy Task Without Execute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTaskDefFails	TokenNameIdentifier	 assert Task Def Fails
(	TokenNameLPAREN	
DummyTaskWithNonPublicExecute	TokenNameIdentifier	 Dummy Task With Non Public Execute
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"No public execute() in "	TokenNameStringLiteral	No public execute() in 
+	TokenNamePLUS	
DummyTaskWithNonPublicExecute	TokenNameIdentifier	 Dummy Task With Non Public Execute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mbl	TokenNameIdentifier	 mbl
.	TokenNameDOT	
addBuildEvent	TokenNameIdentifier	 add Build Event
(	TokenNameLPAREN	
"return type of execute() should be void but was "int" in "	TokenNameStringLiteral	return type of execute() should be void but was "int" in 
+	TokenNamePLUS	
DummyTaskWithNonVoidExecute	TokenNameIdentifier	 Dummy Task With Non Void Execute
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addTaskDefinition	TokenNameIdentifier	 add Task Definition
(	TokenNameLPAREN	
"NonVoidExecute"	TokenNameStringLiteral	NonVoidExecute
,	TokenNameCOMMA	
DummyTaskWithNonVoidExecute	TokenNameIdentifier	 Dummy Task With Non Void Execute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mbl	TokenNameIdentifier	 mbl
.	TokenNameDOT	
assertEmpty	TokenNameIdentifier	 assert Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
DummyTaskWithNonVoidExecute	TokenNameIdentifier	 Dummy Task With Non Void Execute
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getTaskDefinitions	TokenNameIdentifier	 get Task Definitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"NonVoidExecute"	TokenNameStringLiteral	NonVoidExecute
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInputHandler	TokenNameIdentifier	 test Input Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InputHandler	TokenNameIdentifier	 Input Handler
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getInputHandler	TokenNameIdentifier	 get Input Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
instanceof	TokenNameinstanceof	
DefaultInputHandler	TokenNameIdentifier	 Default Input Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputHandler	TokenNameIdentifier	 Input Handler
pfih	TokenNameIdentifier	 pfih
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyFileInputHandler	TokenNameIdentifier	 Property File Input Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setInputHandler	TokenNameIdentifier	 set Input Handler
(	TokenNameLPAREN	
pfih	TokenNameIdentifier	 pfih
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
pfih	TokenNameIdentifier	 pfih
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getInputHandler	TokenNameIdentifier	 get Input Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTaskDefinitionContainsKey	TokenNameIdentifier	 test Task Definition Contains Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getTaskDefinitions	TokenNameIdentifier	 get Task Definitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
"echo"	TokenNameStringLiteral	echo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTaskDefinitionContains	TokenNameIdentifier	 test Task Definition Contains
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getTaskDefinitions	TokenNameIdentifier	 get Task Definitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
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
Echo	TokenNameIdentifier	 Echo
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDuplicateTargets	TokenNameIdentifier	 test Duplicate Targets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// fail, because buildfile contains two targets with the same name 	TokenNameCOMMENT_LINE	fail, because buildfile contains two targets with the same name 
try	TokenNametry	
{	TokenNameLBRACE	
BFT	TokenNameIdentifier	 BFT
bft	TokenNameIdentifier	 bft
=	TokenNameEQUAL	
new	TokenNamenew	
BFT	TokenNameIdentifier	 BFT
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"core/duplicate-target.xml"	TokenNameStringLiteral	core/duplicate-target.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"specific message"	TokenNameStringLiteral	specific message
,	TokenNameCOMMA	
"Duplicate target 'twice'"	TokenNameStringLiteral	Duplicate target 'twice'
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw BuildException about duplicate target"	TokenNameStringLiteral	Should throw BuildException about duplicate target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDuplicateTargetsImport	TokenNameIdentifier	 test Duplicate Targets Import
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// overriding target from imported buildfile is allowed 	TokenNameCOMMENT_LINE	overriding target from imported buildfile is allowed 
BFT	TokenNameIdentifier	 BFT
bft	TokenNameIdentifier	 bft
=	TokenNameEQUAL	
new	TokenNamenew	
BFT	TokenNameIdentifier	 BFT
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"core/duplicate-target2.xml"	TokenNameStringLiteral	core/duplicate-target2.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"once"	TokenNameStringLiteral	once
,	TokenNameCOMMA	
"once from buildfile"	TokenNameStringLiteral	once from buildfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOutputDuringMessageLoggedIsSwallowed	TokenNameIdentifier	 test Output During Message Logged Is Swallowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FOO	TokenNameIdentifier	 FOO
=	TokenNameEQUAL	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
BAR	TokenNameIdentifier	 BAR
=	TokenNameEQUAL	
"bar"	TokenNameStringLiteral	bar
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
new	TokenNamenew	
BuildListener	TokenNameIdentifier	 Build Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
buildStarted	TokenNameIdentifier	 build Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
buildFinished	TokenNameIdentifier	 build Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
targetStarted	TokenNameIdentifier	 target Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
targetFinished	TokenNameIdentifier	 target Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
taskStarted	TokenNameIdentifier	 task Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
taskFinished	TokenNameIdentifier	 task Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
messageLogged	TokenNameIdentifier	 message Logged
(	TokenNameLPAREN	
final	TokenNamefinal	
BuildEvent	TokenNameIdentifier	 Build Event
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
FOO	TokenNameIdentifier	 FOO
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// each of the following lines would cause an 	TokenNameCOMMENT_LINE	each of the following lines would cause an 
// infinite loop if the message wasn't swallowed 	TokenNameCOMMENT_LINE	infinite loop if the message wasn't swallowed 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
BAR	TokenNameIdentifier	 BAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
BAR	TokenNameIdentifier	 BAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
BAR	TokenNameIdentifier	 BAR
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
false	TokenNamefalse	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
FOO	TokenNameIdentifier	 FOO
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
done	TokenNameIdentifier	 done
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
2000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expected logging thread to finish successfully"	TokenNameStringLiteral	Expected logging thread to finish successfully
,	TokenNameCOMMA	
done	TokenNameIdentifier	 done
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see https://issues.apache.org/bugzilla/show_bug.cgi?id=47623 */	TokenNameCOMMENT_JAVADOC	 @see https://issues.apache.org/bugzilla/show_bug.cgi?id=47623 
public	TokenNamepublic	
void	TokenNamevoid	
testNullThrowableMessageLog	TokenNameIdentifier	 test Null Throwable Message Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
new	TokenNamenew	
Task	TokenNameIdentifier	 Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
Throwable	TokenNameIdentifier	 Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// be content if no exception has been thrown 	TokenNameCOMMENT_LINE	be content if no exception has been thrown 
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
DummyTaskPrivate	TokenNameIdentifier	 Dummy Task Private
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
public	TokenNamepublic	
DummyTaskPrivate	TokenNameIdentifier	 Dummy Task Private
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
class	TokenNameclass	
DummyTaskProtected	TokenNameIdentifier	 Dummy Task Protected
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
public	TokenNamepublic	
DummyTaskProtected	TokenNameIdentifier	 Dummy Task Protected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
BFT	TokenNameIdentifier	 BFT
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
BFT	TokenNameIdentifier	 BFT
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
buildfile	TokenNameIdentifier	 buildfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
buildfile	TokenNameIdentifier	 buildfile
=	TokenNameEQUAL	
buildfile	TokenNameIdentifier	 buildfile
;	TokenNameSEMICOLON	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// avoid multiple configurations 	TokenNameCOMMENT_LINE	avoid multiple configurations 
boolean	TokenNameboolean	
isConfigured	TokenNameIdentifier	 is Configured
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// the buildfile to use 	TokenNameCOMMENT_LINE	the buildfile to use 
String	TokenNameIdentifier	 String
buildfile	TokenNameIdentifier	 buildfile
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isConfigured	TokenNameIdentifier	 is Configured
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/"	TokenNameStringLiteral	src/etc/testcases/
+	TokenNamePLUS	
buildfile	TokenNameIdentifier	 buildfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isConfigured	TokenNameIdentifier	 is Configured
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// call a target 	TokenNameCOMMENT_LINE	call a target 
public	TokenNamepublic	
void	TokenNamevoid	
doTarget	TokenNameIdentifier	 do Target
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isConfigured	TokenNameIdentifier	 is Configured
)	TokenNameRPAREN	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//class-BFT 	TokenNameCOMMENT_LINE	class-BFT 
}	TokenNameRBRACE	
class	TokenNameclass	
DummyTaskPackage	TokenNameIdentifier	 Dummy Task Package
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
public	TokenNamepublic	
DummyTaskPackage	TokenNameIdentifier	 Dummy Task Package
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
