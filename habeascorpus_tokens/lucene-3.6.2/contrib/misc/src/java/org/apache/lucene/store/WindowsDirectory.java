package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with this * work for additional information regarding copyright ownership. The ASF * licenses this file to You under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the * License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
EOFException	TokenNameIdentifier	 EOF Exception
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
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
;	TokenNameSEMICOLON	
// javadoc 	TokenNameCOMMENT_LINE	javadoc 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
NativeFSLockFactory	TokenNameIdentifier	 Native FS Lock Factory
;	TokenNameSEMICOLON	
// javadoc 	TokenNameCOMMENT_LINE	javadoc 
/** * Native {@link Directory} implementation for Microsoft Windows. * <p> * Steps: * <ol> * <li>Compile the source code to create WindowsDirectory.dll: * <blockquote> * c:\mingw\bin\g++ -Wall -D_JNI_IMPLEMENTATION_ -Wl,--kill-at * -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" -static-libgcc * -static-libstdc++ -shared WindowsDirectory.cpp -o WindowsDirectory.dll * </blockquote> * For 64-bit JREs, use mingw64, with the -m64 option. * <li>Put WindowsDirectory.dll into some directory in your windows PATH * <li>Open indexes with WindowsDirectory and use it. * </p> * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Native {@link Directory} implementation for Microsoft Windows. <p> Steps: <ol> <li>Compile the source code to create WindowsDirectory.dll: <blockquote> c:\mingw\bin\g++ -Wall -D_JNI_IMPLEMENTATION_ -Wl,--kill-at -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" -static-libgcc -static-libstdc++ -shared WindowsDirectory.cpp -o WindowsDirectory.dll </blockquote> For 64-bit JREs, use mingw64, with the -m64 option. <li>Put WindowsDirectory.dll into some directory in your windows PATH <li>Open indexes with WindowsDirectory and use it. </p> @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
WindowsDirectory	TokenNameIdentifier	 Windows Directory
extends	TokenNameextends	
FSDirectory	TokenNameIdentifier	 FS Directory
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BUFFERSIZE	TokenNameIdentifier	 DEFAULT  BUFFERSIZE
=	TokenNameEQUAL	
4096	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* default pgsize on ia32/amd64 */	TokenNameCOMMENT_BLOCK	 default pgsize on ia32/amd64 
static	TokenNamestatic	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
loadLibrary	TokenNameIdentifier	 load Library
(	TokenNameLPAREN	
"WindowsDirectory"	TokenNameStringLiteral	WindowsDirectory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a new WindowsDirectory for the named location. * * @param path the path of the directory * @param lockFactory the lock factory to use, or null for the default * ({@link NativeFSLockFactory}); * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Create a new WindowsDirectory for the named location. * @param path the path of the directory @param lockFactory the lock factory to use, or null for the default ({@link NativeFSLockFactory}); @throws IOException 
public	TokenNamepublic	
WindowsDirectory	TokenNameIdentifier	 Windows Directory
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
LockFactory	TokenNameIdentifier	 Lock Factory
lockFactory	TokenNameIdentifier	 lock Factory
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
lockFactory	TokenNameIdentifier	 lock Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a new WindowsDirectory for the named location and {@link NativeFSLockFactory}. * * @param path the path of the directory * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Create a new WindowsDirectory for the named location and {@link NativeFSLockFactory}. * @param path the path of the directory @throws IOException 
public	TokenNamepublic	
WindowsDirectory	TokenNameIdentifier	 Windows Directory
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IndexInput	TokenNameIdentifier	 Index Input
openInput	TokenNameIdentifier	 open Input
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
WindowsIndexInput	TokenNameIdentifier	 Windows Index Input
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
,	TokenNameCOMMA	
DEFAULT_BUFFERSIZE	TokenNameIdentifier	 DEFAULT  BUFFERSIZE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
WindowsIndexInput	TokenNameIdentifier	 Windows Index Input
extends	TokenNameextends	
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
fd	TokenNameIdentifier	 fd
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isClone	TokenNameIdentifier	 is Clone
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isOpen	TokenNameIdentifier	 is Open
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WindowsIndexInput	TokenNameIdentifier	 Windows Index Input
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"WindowsIndexInput(path=""	TokenNameStringLiteral	WindowsIndexInput(path="
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"")"	TokenNameStringLiteral	")
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fd	TokenNameIdentifier	 fd
=	TokenNameEQUAL	
WindowsDirectory	TokenNameIdentifier	 Windows Directory
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
WindowsDirectory	TokenNameIdentifier	 Windows Directory
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isOpen	TokenNameIdentifier	 is Open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
readInternal	TokenNameIdentifier	 read Internal
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
bytesRead	TokenNameIdentifier	 bytes Read
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
bytesRead	TokenNameIdentifier	 bytes Read
=	TokenNameEQUAL	
WindowsDirectory	TokenNameIdentifier	 Windows Directory
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOException	TokenNameIdentifier	 IO Exception
newIOE	TokenNameIdentifier	 new IOE
=	TokenNameEQUAL	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newIOE	TokenNameIdentifier	 new IOE
.	TokenNameDOT	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
newIOE	TokenNameIdentifier	 new IOE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytesRead	TokenNameIdentifier	 bytes Read
!=	TokenNameNOT_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
"read past EOF: "	TokenNameStringLiteral	read past EOF: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
seekInternal	TokenNameIdentifier	 seek Internal
(	TokenNameLPAREN	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// NOTE: we synchronize and track "isOpen" because Lucene sometimes closes IIs twice! 	TokenNameCOMMENT_LINE	NOTE: we synchronize and track "isOpen" because Lucene sometimes closes IIs twice! 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isClone	TokenNameIdentifier	 is Clone
&&	TokenNameAND_AND	
isOpen	TokenNameIdentifier	 is Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WindowsDirectory	TokenNameIdentifier	 Windows Directory
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isOpen	TokenNameIdentifier	 is Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WindowsIndexInput	TokenNameIdentifier	 Windows Index Input
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WindowsIndexInput	TokenNameIdentifier	 Windows Index Input
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
isClone	TokenNameIdentifier	 is Clone
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Opens a handle to a file. */	TokenNameCOMMENT_JAVADOC	 Opens a handle to a file. 
private	TokenNameprivate	
static	TokenNamestatic	
native	TokenNamenative	
long	TokenNamelong	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Reads data from a file at pos into bytes */	TokenNameCOMMENT_JAVADOC	 Reads data from a file at pos into bytes 
private	TokenNameprivate	
static	TokenNamestatic	
native	TokenNamenative	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
long	TokenNamelong	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
byte	TokenNamebyte	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Closes a handle to a file */	TokenNameCOMMENT_JAVADOC	 Closes a handle to a file 
private	TokenNameprivate	
static	TokenNamestatic	
native	TokenNamenative	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
long	TokenNamelong	
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Returns the length of a file */	TokenNameCOMMENT_JAVADOC	 Returns the length of a file 
private	TokenNameprivate	
static	TokenNamestatic	
native	TokenNamenative	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
long	TokenNamelong	
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
