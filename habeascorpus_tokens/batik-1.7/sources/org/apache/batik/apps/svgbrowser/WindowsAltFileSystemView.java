/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
apps	TokenNameIdentifier	 apps
.	TokenNameDOT	
svgbrowser	TokenNameIdentifier	 svgbrowser
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
filechooser	TokenNameIdentifier	 filechooser
.	TokenNameDOT	
FileSystemView	TokenNameIdentifier	 File System View
;	TokenNameSEMICOLON	
/** * Work around FileSystemView implementation bug on the Windows * platform. See: * * <a href="http://forums.java.sun.com/thread.jsp?forum=38&thread=71491"> * Using JFileChooser in WebStart-deployed application</a> * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: WindowsAltFileSystemView.java 479616 2006-11-27 13:41:44Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Work around FileSystemView implementation bug on the Windows platform. See: * <a href="http://forums.java.sun.com/thread.jsp?forum=38&thread=71491"> Using JFileChooser in WebStart-deployed application</a> * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: WindowsAltFileSystemView.java 479616 2006-11-27 13:41:44Z dvholten $ 
// This class is necessary due to an annoying bug on Windows NT where 	TokenNameCOMMENT_LINE	This class is necessary due to an annoying bug on Windows NT where 
// instantiating a JFileChooser with the default FileSystemView will 	TokenNameCOMMENT_LINE	instantiating a JFileChooser with the default FileSystemView will 
// cause a "drive A: not ready" error every time. I grabbed the 	TokenNameCOMMENT_LINE	cause a "drive A: not ready" error every time. I grabbed the 
// Windows FileSystemView impl from the 1.3 SDK and modified it so 	TokenNameCOMMENT_LINE	Windows FileSystemView impl from the 1.3 SDK and modified it so 
// as to not use java.io.File.listRoots() to get fileSystem roots. 	TokenNameCOMMENT_LINE	as to not use java.io.File.listRoots() to get fileSystem roots. 
// java.io.File.listRoots() does a SecurityManager.checkRead() which 	TokenNameCOMMENT_LINE	java.io.File.listRoots() does a SecurityManager.checkRead() which 
// causes the OS to try to access drive A: even when there is no disk, 	TokenNameCOMMENT_LINE	causes the OS to try to access drive A: even when there is no disk, 
// causing an annoying "abort, retry, ignore" popup message every time 	TokenNameCOMMENT_LINE	causing an annoying "abort, retry, ignore" popup message every time 
// we instantiate a JFileChooser! 	TokenNameCOMMENT_LINE	we instantiate a JFileChooser! 
// 	TokenNameCOMMENT_LINE	 
// Instead of calling listRoots() we use a straightforward alternate 	TokenNameCOMMENT_LINE	Instead of calling listRoots() we use a straightforward alternate 
// method of getting file system roots. 	TokenNameCOMMENT_LINE	method of getting file system roots. 
class	TokenNameclass	
WindowsAltFileSystemView	TokenNameIdentifier	 Windows Alt File System View
extends	TokenNameextends	
FileSystemView	TokenNameIdentifier	 File System View
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXCEPTION_CONTAINING_DIR_NULL	TokenNameIdentifier	 EXCEPTION  CONTAINING  DIR  NULL
=	TokenNameEQUAL	
"AltFileSystemView.exception.containing.dir.null"	TokenNameStringLiteral	AltFileSystemView.exception.containing.dir.null
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXCEPTION_DIRECTORY_ALREADY_EXISTS	TokenNameIdentifier	 EXCEPTION  DIRECTORY  ALREADY  EXISTS
=	TokenNameEQUAL	
"AltFileSystemView.exception.directory.already.exists"	TokenNameStringLiteral	AltFileSystemView.exception.directory.already.exists
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NEW_FOLDER_NAME	TokenNameIdentifier	 NEW  FOLDER  NAME
=	TokenNameEQUAL	
" AltFileSystemView.new.folder.name"	TokenNameStringLiteral	 AltFileSystemView.new.folder.name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLOPPY_DRIVE	TokenNameIdentifier	 FLOPPY  DRIVE
=	TokenNameEQUAL	
"AltFileSystemView.floppy.drive"	TokenNameStringLiteral	AltFileSystemView.floppy.drive
;	TokenNameSEMICOLON	
/** * Returns true if the given file is a root. */	TokenNameCOMMENT_JAVADOC	 Returns true if the given file is a root. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isRoot	TokenNameIdentifier	 is Root
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isAbsolute	TokenNameIdentifier	 is Absolute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
parentPath	TokenNameIdentifier	 parent Path
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parentPath	TokenNameIdentifier	 parent Path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
parentPath	TokenNameIdentifier	 parent Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * creates a new folder with a default folder name. */	TokenNameCOMMENT_JAVADOC	 creates a new folder with a default folder name. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
createNewFolder	TokenNameIdentifier	 create New Folder
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
containingDir	TokenNameIdentifier	 containing Dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
containingDir	TokenNameIdentifier	 containing Dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
Resources	TokenNameIdentifier	 Resources
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
EXCEPTION_CONTAINING_DIR_NULL	TokenNameIdentifier	 EXCEPTION  CONTAINING  DIR  NULL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
newFolder	TokenNameIdentifier	 new Folder
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Using NT's default folder name 	TokenNameCOMMENT_LINE	Using NT's default folder name 
newFolder	TokenNameIdentifier	 new Folder
=	TokenNameEQUAL	
createFileObject	TokenNameIdentifier	 create File Object
(	TokenNameLPAREN	
containingDir	TokenNameIdentifier	 containing Dir
,	TokenNameCOMMA	
Resources	TokenNameIdentifier	 Resources
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
NEW_FOLDER_NAME	TokenNameIdentifier	 NEW  FOLDER  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
newFolder	TokenNameIdentifier	 new Folder
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newFolder	TokenNameIdentifier	 new Folder
=	TokenNameEQUAL	
createFileObject	TokenNameIdentifier	 create File Object
(	TokenNameLPAREN	
containingDir	TokenNameIdentifier	 containing Dir
,	TokenNameCOMMA	
Resources	TokenNameIdentifier	 Resources
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
NEW_FOLDER_NAME	TokenNameIdentifier	 NEW  FOLDER  NAME
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newFolder	TokenNameIdentifier	 new Folder
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
Resources	TokenNameIdentifier	 Resources
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
EXCEPTION_DIRECTORY_ALREADY_EXISTS	TokenNameIdentifier	 EXCEPTION  DIRECTORY  ALREADY  EXISTS
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
newFolder	TokenNameIdentifier	 new Folder
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newFolder	TokenNameIdentifier	 new Folder
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newFolder	TokenNameIdentifier	 new Folder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether a file is hidden or not. On Windows * there is currently no way to get this information from * io.File, therefore always return false. */	TokenNameCOMMENT_JAVADOC	 Returns whether a file is hidden or not. On Windows there is currently no way to get this information from io.File, therefore always return false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isHiddenFile	TokenNameIdentifier	 is Hidden File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns all root partitians on this system. On Windows, this * will be the A: through Z: drives. */	TokenNameCOMMENT_JAVADOC	 Returns all root partitians on this system. On Windows, this will be the A: through Z: drives. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRoots	TokenNameIdentifier	 get Roots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
rootsVector	TokenNameIdentifier	 roots Vector
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create the A: drive whether it is mounted or not 	TokenNameCOMMENT_LINE	Create the A: drive whether it is mounted or not 
FileSystemRoot	TokenNameIdentifier	 File System Root
floppy	TokenNameIdentifier	 floppy
=	TokenNameEQUAL	
new	TokenNamenew	
FileSystemRoot	TokenNameIdentifier	 File System Root
(	TokenNameLPAREN	
Resources	TokenNameIdentifier	 Resources
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
FLOPPY_DRIVE	TokenNameIdentifier	 FLOPPY  DRIVE
)	TokenNameRPAREN	
+	TokenNamePLUS	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootsVector	TokenNameIdentifier	 roots Vector
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
floppy	TokenNameIdentifier	 floppy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Run through all possible mount points and check 	TokenNameCOMMENT_LINE	Run through all possible mount points and check 
// for their existance. 	TokenNameCOMMENT_LINE	for their existance. 
for	TokenNamefor	
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'C'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
device	TokenNameIdentifier	 device
=	TokenNameEQUAL	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
':'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'\\'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
deviceName	TokenNameIdentifier	 device Name
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
device	TokenNameIdentifier	 device
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
deviceFile	TokenNameIdentifier	 device File
=	TokenNameEQUAL	
new	TokenNamenew	
FileSystemRoot	TokenNameIdentifier	 File System Root
(	TokenNameLPAREN	
deviceName	TokenNameIdentifier	 device Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deviceFile	TokenNameIdentifier	 device File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
deviceFile	TokenNameIdentifier	 device File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rootsVector	TokenNameIdentifier	 roots Vector
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
deviceFile	TokenNameIdentifier	 device File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
roots	TokenNameIdentifier	 roots
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
rootsVector	TokenNameIdentifier	 roots Vector
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
rootsVector	TokenNameIdentifier	 roots Vector
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
roots	TokenNameIdentifier	 roots
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
roots	TokenNameIdentifier	 roots
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
FileSystemRoot	TokenNameIdentifier	 File System Root
extends	TokenNameextends	
File	TokenNameIdentifier	 File
{	TokenNameLBRACE	
public	TokenNamepublic	
FileSystemRoot	TokenNameIdentifier	 File System Root
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FileSystemRoot	TokenNameIdentifier	 File System Root
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
