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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
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
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * An iterator which iterates through the contents of a java directory. The * iterator should be created with the directory at the root of the Java * namespace. * */	TokenNameCOMMENT_JAVADOC	 An iterator which iterates through the contents of a java directory. The iterator should be created with the directory at the root of the Java namespace. 
public	TokenNamepublic	
class	TokenNameclass	
DirectoryIterator	TokenNameIdentifier	 Directory Iterator
implements	TokenNameimplements	
ClassFileIterator	TokenNameIdentifier	 Class File Iterator
{	TokenNameLBRACE	
/** * This is a stack of current iterators supporting the depth first * traversal of the directory tree. */	TokenNameCOMMENT_JAVADOC	 This is a stack of current iterators supporting the depth first traversal of the directory tree. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
enumStack	TokenNameIdentifier	 enum Stack
;	TokenNameSEMICOLON	
/** * The current directory iterator. As directories encounter lower level * directories, the current iterator is pushed onto the iterator stack * and a new iterator over the sub directory becomes the current * directory. This implements a depth first traversal of the directory * namespace. */	TokenNameCOMMENT_JAVADOC	 The current directory iterator. As directories encounter lower level directories, the current iterator is pushed onto the iterator stack and a new iterator over the sub directory becomes the current directory. This implements a depth first traversal of the directory namespace. 
private	TokenNameprivate	
Enumeration	TokenNameIdentifier	 Enumeration
currentEnum	TokenNameIdentifier	 current Enum
;	TokenNameSEMICOLON	
/** * Creates a directory iterator. The directory iterator is created to * scan the root directory. If the changeInto flag is given, then the * entries returned will be relative to this directory and not the * current directory. * * @param rootDirectory the root if the directory namespace which is to * be iterated over * @param changeInto if true then the returned entries will be relative * to the rootDirectory and not the current directory. * @exception IOException if there is a problem reading the directory * information. */	TokenNameCOMMENT_JAVADOC	 Creates a directory iterator. The directory iterator is created to scan the root directory. If the changeInto flag is given, then the entries returned will be relative to this directory and not the current directory. * @param rootDirectory the root if the directory namespace which is to be iterated over @param changeInto if true then the returned entries will be relative to the rootDirectory and not the current directory. @exception IOException if there is a problem reading the directory information. 
public	TokenNamepublic	
DirectoryIterator	TokenNameIdentifier	 Directory Iterator
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
rootDirectory	TokenNameIdentifier	 root Directory
,	TokenNameCOMMA	
boolean	TokenNameboolean	
changeInto	TokenNameIdentifier	 change Into
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
enumStack	TokenNameIdentifier	 enum Stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
filesInRoot	TokenNameIdentifier	 files In Root
=	TokenNameEQUAL	
getDirectoryEntries	TokenNameIdentifier	 get Directory Entries
(	TokenNameLPAREN	
rootDirectory	TokenNameIdentifier	 root Directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentEnum	TokenNameIdentifier	 current Enum
=	TokenNameEQUAL	
filesInRoot	TokenNameIdentifier	 files In Root
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a vector covering all the entries (files and subdirectories in a * directory). * * @param directory the directory to be scanned. * @return a vector containing File objects for each entry in the * directory. */	TokenNameCOMMENT_JAVADOC	 Get a vector covering all the entries (files and subdirectories in a directory). * @param directory the directory to be scanned. @return a vector containing File objects for each entry in the directory. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
getDirectoryEntries	TokenNameIdentifier	 get Directory Entries
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// File[] filesInDir = directory.listFiles(); 	TokenNameCOMMENT_LINE	File[] filesInDir = directory.listFiles(); 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
filesInDir	TokenNameIdentifier	 files In Dir
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filesInDir	TokenNameIdentifier	 files In Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
filesInDir	TokenNameIdentifier	 files In Dir
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
filesInDir	TokenNameIdentifier	 files In Dir
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Template method to allow subclasses to supply elements for the * iteration. The directory iterator maintains a stack of iterators * covering each level in the directory hierarchy. The current iterator * covers the current directory being scanned. If the next entry in that * directory is a subdirectory, the current iterator is pushed onto the * stack and a new iterator is created for the subdirectory. If the * entry is a file, it is returned as the next element and the iterator * remains valid. If there are no more entries in the current directory, * the topmost iterator on the stack is popped off to become the * current iterator. * * @return the next ClassFile in the iteration. */	TokenNameCOMMENT_JAVADOC	 Template method to allow subclasses to supply elements for the iteration. The directory iterator maintains a stack of iterators covering each level in the directory hierarchy. The current iterator covers the current directory being scanned. If the next entry in that directory is a subdirectory, the current iterator is pushed onto the stack and a new iterator is created for the subdirectory. If the entry is a file, it is returned as the next element and the iterator remains valid. If there are no more entries in the current directory, the topmost iterator on the stack is popped off to become the current iterator. * @return the next ClassFile in the iteration. 
public	TokenNamepublic	
ClassFile	TokenNameIdentifier	 Class File
getNextClassFile	TokenNameIdentifier	 get Next Class File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassFile	TokenNameIdentifier	 Class File
nextElement	TokenNameIdentifier	 next Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
nextElement	TokenNameIdentifier	 next Element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentEnum	TokenNameIdentifier	 current Enum
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
currentEnum	TokenNameIdentifier	 current Enum
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// push the current iterator onto the stack and then 	TokenNameCOMMENT_LINE	push the current iterator onto the stack and then 
// iterate through this directory. 	TokenNameCOMMENT_LINE	iterate through this directory. 
enumStack	TokenNameIdentifier	 enum Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
currentEnum	TokenNameIdentifier	 current Enum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
getDirectoryEntries	TokenNameIdentifier	 get Directory Entries
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentEnum	TokenNameIdentifier	 current Enum
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// we have a file. create a stream for it 	TokenNameCOMMENT_LINE	we have a file. create a stream for it 
FileInputStream	TokenNameIdentifier	 File Input Stream
inFileStream	TokenNameIdentifier	 in File Stream
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create a data input stream from the jar 	TokenNameCOMMENT_LINE	create a data input stream from the jar 
// input stream 	TokenNameCOMMENT_LINE	input stream 
ClassFile	TokenNameIdentifier	 Class File
javaClass	TokenNameIdentifier	 java Class
=	TokenNameEQUAL	
new	TokenNamenew	
ClassFile	TokenNameIdentifier	 Class File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
inFileStream	TokenNameIdentifier	 in File Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextElement	TokenNameIdentifier	 next Element
=	TokenNameEQUAL	
javaClass	TokenNameIdentifier	 java Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// this iterator is exhausted. Can we pop one off the stack 	TokenNameCOMMENT_LINE	this iterator is exhausted. Can we pop one off the stack 
if	TokenNameif	
(	TokenNameLPAREN	
enumStack	TokenNameIdentifier	 enum Stack
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currentEnum	TokenNameIdentifier	 current Enum
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
)	TokenNameRPAREN	
enumStack	TokenNameIdentifier	 enum Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextElement	TokenNameIdentifier	 next Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nextElement	TokenNameIdentifier	 next Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
