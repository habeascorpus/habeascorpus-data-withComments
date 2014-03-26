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
DataInputStream	TokenNameIdentifier	 Data Input Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
depend	TokenNameIdentifier	 depend
.	TokenNameDOT	
constantpool	TokenNameIdentifier	 constantpool
.	TokenNameDOT	
ClassCPInfo	TokenNameIdentifier	 Class CP Info
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
depend	TokenNameIdentifier	 depend
.	TokenNameDOT	
constantpool	TokenNameIdentifier	 constantpool
.	TokenNameDOT	
ConstantPool	TokenNameIdentifier	 Constant Pool
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
depend	TokenNameIdentifier	 depend
.	TokenNameDOT	
constantpool	TokenNameIdentifier	 constantpool
.	TokenNameDOT	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
;	TokenNameSEMICOLON	
/** * A ClassFile object stores information about a Java class. The class may * be read from a DataInputStream.and written to a DataOutputStream. These * are usually streams from a Java class file or a class file component of a * Jar file. * */	TokenNameCOMMENT_JAVADOC	 A ClassFile object stores information about a Java class. The class may be read from a DataInputStream.and written to a DataOutputStream. These are usually streams from a Java class file or a class file component of a Jar file. 
public	TokenNamepublic	
class	TokenNameclass	
ClassFile	TokenNameIdentifier	 Class File
{	TokenNameLBRACE	
/** The Magic Value that marks the start of a Java class file */	TokenNameCOMMENT_JAVADOC	 The Magic Value that marks the start of a Java class file 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLASS_MAGIC	TokenNameIdentifier	 CLASS  MAGIC
=	TokenNameEQUAL	
0xCAFEBABE	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** This class' constant pool. */	TokenNameCOMMENT_JAVADOC	 This class' constant pool. 
private	TokenNameprivate	
ConstantPool	TokenNameIdentifier	 Constant Pool
constantPool	TokenNameIdentifier	 constant Pool
;	TokenNameSEMICOLON	
/** The class name for this class. */	TokenNameCOMMENT_JAVADOC	 The class name for this class. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
/** * Read the class from a data stream. This method takes an InputStream * as input and parses the class from the stream. <p> * * * * @param stream an InputStream from which the class will be read * @exception IOException if there is a problem reading from the given * stream. * @exception ClassFormatError if the class cannot be parsed correctly */	TokenNameCOMMENT_JAVADOC	 Read the class from a data stream. This method takes an InputStream as input and parses the class from the stream. <p> * * @param stream an InputStream from which the class will be read @exception IOException if there is a problem reading from the given stream. @exception ClassFormatError if the class cannot be parsed correctly 
public	TokenNamepublic	
void	TokenNamevoid	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassFormatError	TokenNameIdentifier	 Class Format Error
{	TokenNameLBRACE	
DataInputStream	TokenNameIdentifier	 Data Input Stream
classStream	TokenNameIdentifier	 class Stream
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classStream	TokenNameIdentifier	 class Stream
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
CLASS_MAGIC	TokenNameIdentifier	 CLASS  MAGIC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ClassFormatError	TokenNameIdentifier	 Class Format Error
(	TokenNameLPAREN	
"No Magic Code Found "	TokenNameStringLiteral	No Magic Code Found 
+	TokenNamePLUS	
"- probably not a Java class file."	TokenNameStringLiteral	- probably not a Java class file.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// right we have a good looking class file. 	TokenNameCOMMENT_LINE	right we have a good looking class file. 
/* int minorVersion = */	TokenNameCOMMENT_BLOCK	 int minorVersion = 
classStream	TokenNameIdentifier	 class Stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* int majorVersion = */	TokenNameCOMMENT_BLOCK	 int majorVersion = 
classStream	TokenNameIdentifier	 class Stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read the constant pool in and resolve it 	TokenNameCOMMENT_LINE	read the constant pool in and resolve it 
constantPool	TokenNameIdentifier	 constant Pool
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantPool	TokenNameIdentifier	 Constant Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
constantPool	TokenNameIdentifier	 constant Pool
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
classStream	TokenNameIdentifier	 class Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
constantPool	TokenNameIdentifier	 constant Pool
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* int accessFlags = */	TokenNameCOMMENT_BLOCK	 int accessFlags = 
classStream	TokenNameIdentifier	 class Stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
thisClassIndex	TokenNameIdentifier	 this Class Index
=	TokenNameEQUAL	
classStream	TokenNameIdentifier	 class Stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* int superClassIndex = */	TokenNameCOMMENT_BLOCK	 int superClassIndex = 
classStream	TokenNameIdentifier	 class Stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassCPInfo	TokenNameIdentifier	 Class CP Info
classInfo	TokenNameIdentifier	 class Info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ClassCPInfo	TokenNameIdentifier	 Class CP Info
)	TokenNameRPAREN	
constantPool	TokenNameIdentifier	 constant Pool
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
thisClassIndex	TokenNameIdentifier	 this Class Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
classInfo	TokenNameIdentifier	 class Info
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the classes which this class references. * * @return a vector of class names which this class references */	TokenNameCOMMENT_JAVADOC	 Get the classes which this class references. * @return a vector of class names which this class references 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getClassRefs	TokenNameIdentifier	 get Class Refs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
classRefs	TokenNameIdentifier	 class Refs
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
constantPool	TokenNameIdentifier	 constant Pool
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
constantPool	TokenNameIdentifier	 constant Pool
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
.	TokenNameDOT	
CONSTANT_CLASS	TokenNameIdentifier	 CONSTANT  CLASS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassCPInfo	TokenNameIdentifier	 Class CP Info
classEntry	TokenNameIdentifier	 class Entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ClassCPInfo	TokenNameIdentifier	 Class CP Info
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
classEntry	TokenNameIdentifier	 class Entry
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classRefs	TokenNameIdentifier	 class Refs
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
ClassFileUtils	TokenNameIdentifier	 Class File Utils
.	TokenNameDOT	
convertSlashName	TokenNameIdentifier	 convert Slash Name
(	TokenNameLPAREN	
classEntry	TokenNameIdentifier	 class Entry
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
classRefs	TokenNameIdentifier	 class Refs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the class' fully qualified name in dot format. * * @return the class name in dot format (eg. java.lang.Object) */	TokenNameCOMMENT_JAVADOC	 Get the class' fully qualified name in dot format. * @return the class name in dot format (eg. java.lang.Object) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFullClassName	TokenNameIdentifier	 get Full Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ClassFileUtils	TokenNameIdentifier	 Class File Utils
.	TokenNameDOT	
convertSlashName	TokenNameIdentifier	 convert Slash Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
