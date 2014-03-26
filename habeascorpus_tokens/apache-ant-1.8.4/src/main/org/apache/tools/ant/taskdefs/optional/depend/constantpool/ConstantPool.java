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
.	TokenNameDOT	
constantpool	TokenNameIdentifier	 constantpool
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
/** * The constant pool of a Java class. The constant pool is a collection of * constants used in a Java class file. It stores strings, constant values, * class names, method names, field names etc. * * @see <a href="http://java.sun.com/docs/books/vmspec/">The Java Virtual * Machine Specification</a> */	TokenNameCOMMENT_JAVADOC	 The constant pool of a Java class. The constant pool is a collection of constants used in a Java class file. It stores strings, constant values, class names, method names, field names etc. * @see <a href="http://java.sun.com/docs/books/vmspec/">The Java Virtual Machine Specification</a> 
public	TokenNamepublic	
class	TokenNameclass	
ConstantPool	TokenNameIdentifier	 Constant Pool
{	TokenNameLBRACE	
/** The entries in the constant pool. */	TokenNameCOMMENT_JAVADOC	 The entries in the constant pool. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
/** * A Hashtable of UTF8 entries - used to get constant pool indexes of * the UTF8 values quickly */	TokenNameCOMMENT_JAVADOC	 A Hashtable of UTF8 entries - used to get constant pool indexes of the UTF8 values quickly 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
utf8Indexes	TokenNameIdentifier	 utf8 Indexes
;	TokenNameSEMICOLON	
/** Initialise the constant pool. */	TokenNameCOMMENT_JAVADOC	 Initialise the constant pool. 
public	TokenNamepublic	
ConstantPool	TokenNameIdentifier	 Constant Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The zero index is never present in the constant pool itself so 	TokenNameCOMMENT_LINE	The zero index is never present in the constant pool itself so 
// we add a null entry for it 	TokenNameCOMMENT_LINE	we add a null entry for it 
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
utf8Indexes	TokenNameIdentifier	 utf8 Indexes
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read the constant pool from a class input stream. * * @param classStream the DataInputStream of a class file. * @exception IOException if there is a problem reading the constant pool * from the stream */	TokenNameCOMMENT_JAVADOC	 Read the constant pool from a class input stream. * @param classStream the DataInputStream of a class file. @exception IOException if there is a problem reading the constant pool from the stream 
public	TokenNamepublic	
void	TokenNamevoid	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
classStream	TokenNameIdentifier	 class Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
numEntries	TokenNameIdentifier	 num Entries
=	TokenNameEQUAL	
classStream	TokenNameIdentifier	 class Stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numEntries	TokenNameIdentifier	 num Entries
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
nextEntry	TokenNameIdentifier	 next Entry
=	TokenNameEQUAL	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
.	TokenNameDOT	
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
classStream	TokenNameIdentifier	 class Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
nextEntry	TokenNameIdentifier	 next Entry
.	TokenNameDOT	
getNumEntries	TokenNameIdentifier	 get Num Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addEntry	TokenNameIdentifier	 add Entry
(	TokenNameLPAREN	
nextEntry	TokenNameIdentifier	 next Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the size of the constant pool. * * @return the size of the constant pool */	TokenNameCOMMENT_JAVADOC	 Get the size of the constant pool. * @return the size of the constant pool 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an entry to the constant pool. * * @param entry the new entry to be added to the constant pool. * @return the index into the constant pool at which the entry is * stored. */	TokenNameCOMMENT_JAVADOC	 Add an entry to the constant pool. * @param entry the new entry to be added to the constant pool. @return the index into the constant pool at which the entry is stored. 
public	TokenNamepublic	
int	TokenNameint	
addEntry	TokenNameIdentifier	 add Entry
(	TokenNameLPAREN	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numSlots	TokenNameIdentifier	 num Slots
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getNumEntries	TokenNameIdentifier	 get Num Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add null entries for any additional slots required. 	TokenNameCOMMENT_LINE	add null entries for any additional slots required. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numSlots	TokenNameIdentifier	 num Slots
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
instanceof	TokenNameinstanceof	
Utf8CPInfo	TokenNameIdentifier	 Utf8 CP Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Utf8CPInfo	TokenNameIdentifier	 Utf8 CP Info
utf8Info	TokenNameIdentifier	 utf8 Info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Utf8CPInfo	TokenNameIdentifier	 Utf8 CP Info
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
utf8Indexes	TokenNameIdentifier	 utf8 Indexes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
utf8Info	TokenNameIdentifier	 utf8 Info
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resolve the entries in the constant pool. Resolution of the constant * pool involves transforming indexes to other constant pool entries * into the actual data for that entry. */	TokenNameCOMMENT_JAVADOC	 Resolve the entries in the constant pool. Resolution of the constant pool involves transforming indexes to other constant pool entries into the actual data for that entry. 
public	TokenNamepublic	
void	TokenNamevoid	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
poolInfo	TokenNameIdentifier	 pool Info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
poolInfo	TokenNameIdentifier	 pool Info
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
poolInfo	TokenNameIdentifier	 pool Info
.	TokenNameDOT	
isResolved	TokenNameIdentifier	 is Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
poolInfo	TokenNameIdentifier	 pool Info
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get an constant pool entry at a particular index. * * @param index the index into the constant pool. * @return the constant pool entry at that index. */	TokenNameCOMMENT_JAVADOC	 Get an constant pool entry at a particular index. * @param index the index into the constant pool. @return the constant pool entry at that index. 
public	TokenNamepublic	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
)	TokenNameRPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of a given UTF8 constant pool entry. * * @param value the string value of the UTF8 entry. * @return the index at which the given string occurs in the constant * pool or -1 if the value does not occur. */	TokenNameCOMMENT_JAVADOC	 Get the index of a given UTF8 constant pool entry. * @param value the string value of the UTF8 entry. @return the index at which the given string occurs in the constant pool or -1 if the value does not occur. 
public	TokenNamepublic	
int	TokenNameint	
getUTF8Entry	TokenNameIdentifier	 get UT F8 Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
indexInteger	TokenNameIdentifier	 index Integer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
utf8Indexes	TokenNameIdentifier	 utf8 Indexes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexInteger	TokenNameIdentifier	 index Integer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
indexInteger	TokenNameIdentifier	 index Integer
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of a given CONSTANT_CLASS entry in the constant pool. * * @param className the name of the class for which the class entry * index is required. * @return the index at which the given class entry occurs in the * constant pool or -1 if the value does not occur. */	TokenNameCOMMENT_JAVADOC	 Get the index of a given CONSTANT_CLASS entry in the constant pool. * @param className the name of the class for which the class entry index is required. @return the index at which the given class entry occurs in the constant pool or -1 if the value does not occur. 
public	TokenNamepublic	
int	TokenNameint	
getClassEntry	TokenNameIdentifier	 get Class Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
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
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
instanceof	TokenNameinstanceof	
ClassCPInfo	TokenNameIdentifier	 Class CP Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassCPInfo	TokenNameIdentifier	 Class CP Info
classinfo	TokenNameIdentifier	 classinfo
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ClassCPInfo	TokenNameIdentifier	 Class CP Info
)	TokenNameRPAREN	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classinfo	TokenNameIdentifier	 classinfo
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
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of a given constant value entry in the constant pool. * * @param constantValue the constant value for which the index is * required. * @return the index at which the given value entry occurs in the * constant pool or -1 if the value does not occur. */	TokenNameCOMMENT_JAVADOC	 Get the index of a given constant value entry in the constant pool. * @param constantValue the constant value for which the index is required. @return the index at which the given value entry occurs in the constant pool or -1 if the value does not occur. 
public	TokenNamepublic	
int	TokenNameint	
getConstantEntry	TokenNameIdentifier	 get Constant Entry
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
constantValue	TokenNameIdentifier	 constant Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
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
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
instanceof	TokenNameinstanceof	
ConstantCPInfo	TokenNameIdentifier	 Constant CP Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ConstantCPInfo	TokenNameIdentifier	 Constant CP Info
constantEntry	TokenNameIdentifier	 constant Entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ConstantCPInfo	TokenNameIdentifier	 Constant CP Info
)	TokenNameRPAREN	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
constantEntry	TokenNameIdentifier	 constant Entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
constantValue	TokenNameIdentifier	 constant Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of a given CONSTANT_METHODREF entry in the constant * pool. * * @param methodClassName the name of the class which contains the * method being referenced. * @param methodName the name of the method being referenced. * @param methodType the type descriptor of the method being referenced. * @return the index at which the given method ref entry occurs in the * constant pool or -1 if the value does not occur. */	TokenNameCOMMENT_JAVADOC	 Get the index of a given CONSTANT_METHODREF entry in the constant pool. * @param methodClassName the name of the class which contains the method being referenced. @param methodName the name of the method being referenced. @param methodType the type descriptor of the method being referenced. @return the index at which the given method ref entry occurs in the constant pool or -1 if the value does not occur. 
public	TokenNamepublic	
int	TokenNameint	
getMethodRefEntry	TokenNameIdentifier	 get Method Ref Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
methodClassName	TokenNameIdentifier	 method Class Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
methodType	TokenNameIdentifier	 method Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
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
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
instanceof	TokenNameinstanceof	
MethodRefCPInfo	TokenNameIdentifier	 Method Ref CP Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MethodRefCPInfo	TokenNameIdentifier	 Method Ref CP Info
methodRefEntry	TokenNameIdentifier	 method Ref Entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MethodRefCPInfo	TokenNameIdentifier	 Method Ref CP Info
)	TokenNameRPAREN	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methodRefEntry	TokenNameIdentifier	 method Ref Entry
.	TokenNameDOT	
getMethodClassName	TokenNameIdentifier	 get Method Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
methodClassName	TokenNameIdentifier	 method Class Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
methodRefEntry	TokenNameIdentifier	 method Ref Entry
.	TokenNameDOT	
getMethodName	TokenNameIdentifier	 get Method Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
methodName	TokenNameIdentifier	 method Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
methodRefEntry	TokenNameIdentifier	 method Ref Entry
.	TokenNameDOT	
getMethodType	TokenNameIdentifier	 get Method Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
methodType	TokenNameIdentifier	 method Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of a given CONSTANT_INTERFACEMETHODREF entry in the * constant pool. * * @param interfaceMethodClassName the name of the interface which * contains the method being referenced. * @param interfaceMethodName the name of the method being referenced. * @param interfaceMethodType the type descriptor of the method being * referenced. * @return the index at which the given method ref entry occurs in the * constant pool or -1 if the value does not occur. */	TokenNameCOMMENT_JAVADOC	 Get the index of a given CONSTANT_INTERFACEMETHODREF entry in the constant pool. * @param interfaceMethodClassName the name of the interface which contains the method being referenced. @param interfaceMethodName the name of the method being referenced. @param interfaceMethodType the type descriptor of the method being referenced. @return the index at which the given method ref entry occurs in the constant pool or -1 if the value does not occur. 
public	TokenNamepublic	
int	TokenNameint	
getInterfaceMethodRefEntry	TokenNameIdentifier	 get Interface Method Ref Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
interfaceMethodClassName	TokenNameIdentifier	 interface Method Class Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
interfaceMethodName	TokenNameIdentifier	 interface Method Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
interfaceMethodType	TokenNameIdentifier	 interface Method Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
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
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
instanceof	TokenNameinstanceof	
InterfaceMethodRefCPInfo	TokenNameIdentifier	 Interface Method Ref CP Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InterfaceMethodRefCPInfo	TokenNameIdentifier	 Interface Method Ref CP Info
interfaceMethodRefEntry	TokenNameIdentifier	 interface Method Ref Entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InterfaceMethodRefCPInfo	TokenNameIdentifier	 Interface Method Ref CP Info
)	TokenNameRPAREN	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
interfaceMethodRefEntry	TokenNameIdentifier	 interface Method Ref Entry
.	TokenNameDOT	
getInterfaceMethodClassName	TokenNameIdentifier	 get Interface Method Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
interfaceMethodClassName	TokenNameIdentifier	 interface Method Class Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
interfaceMethodRefEntry	TokenNameIdentifier	 interface Method Ref Entry
.	TokenNameDOT	
getInterfaceMethodName	TokenNameIdentifier	 get Interface Method Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
interfaceMethodName	TokenNameIdentifier	 interface Method Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
interfaceMethodRefEntry	TokenNameIdentifier	 interface Method Ref Entry
.	TokenNameDOT	
getInterfaceMethodType	TokenNameIdentifier	 get Interface Method Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
interfaceMethodType	TokenNameIdentifier	 interface Method Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of a given CONSTANT_FIELDREF entry in the constant * pool. * * @param fieldClassName the name of the class which contains the field * being referenced. * @param fieldName the name of the field being referenced. * @param fieldType the type descriptor of the field being referenced. * @return the index at which the given field ref entry occurs in the * constant pool or -1 if the value does not occur. */	TokenNameCOMMENT_JAVADOC	 Get the index of a given CONSTANT_FIELDREF entry in the constant pool. * @param fieldClassName the name of the class which contains the field being referenced. @param fieldName the name of the field being referenced. @param fieldType the type descriptor of the field being referenced. @return the index at which the given field ref entry occurs in the constant pool or -1 if the value does not occur. 
public	TokenNamepublic	
int	TokenNameint	
getFieldRefEntry	TokenNameIdentifier	 get Field Ref Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldClassName	TokenNameIdentifier	 field Class Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldType	TokenNameIdentifier	 field Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
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
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
instanceof	TokenNameinstanceof	
FieldRefCPInfo	TokenNameIdentifier	 Field Ref CP Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldRefCPInfo	TokenNameIdentifier	 Field Ref CP Info
fieldRefEntry	TokenNameIdentifier	 field Ref Entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldRefCPInfo	TokenNameIdentifier	 Field Ref CP Info
)	TokenNameRPAREN	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldRefEntry	TokenNameIdentifier	 field Ref Entry
.	TokenNameDOT	
getFieldClassName	TokenNameIdentifier	 get Field Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fieldClassName	TokenNameIdentifier	 field Class Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fieldRefEntry	TokenNameIdentifier	 field Ref Entry
.	TokenNameDOT	
getFieldName	TokenNameIdentifier	 get Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fieldRefEntry	TokenNameIdentifier	 field Ref Entry
.	TokenNameDOT	
getFieldType	TokenNameIdentifier	 get Field Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fieldType	TokenNameIdentifier	 field Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of a given CONSTANT_NAMEANDTYPE entry in the constant * pool. * * @param name the name * @param type the type * @return the index at which the given NameAndType entry occurs in the * constant pool or -1 if the value does not occur. */	TokenNameCOMMENT_JAVADOC	 Get the index of a given CONSTANT_NAMEANDTYPE entry in the constant pool. * @param name the name @param type the type @return the index at which the given NameAndType entry occurs in the constant pool or -1 if the value does not occur. 
public	TokenNamepublic	
int	TokenNameint	
getNameAndTypeEntry	TokenNameIdentifier	 get Name And Type Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
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
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
instanceof	TokenNameinstanceof	
NameAndTypeCPInfo	TokenNameIdentifier	 Name And Type CP Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NameAndTypeCPInfo	TokenNameIdentifier	 Name And Type CP Info
nameAndTypeEntry	TokenNameIdentifier	 name And Type Entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NameAndTypeCPInfo	TokenNameIdentifier	 Name And Type CP Info
)	TokenNameRPAREN	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nameAndTypeEntry	TokenNameIdentifier	 name And Type Entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
nameAndTypeEntry	TokenNameIdentifier	 name And Type Entry
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dump the constant pool to a string. * * @return the constant pool entries as strings */	TokenNameCOMMENT_JAVADOC	 Dump the constant pool to a string. * @return the constant pool entries as strings 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
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
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"] = "	TokenNameStringLiteral	] = 
+	TokenNamePLUS	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
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
}	TokenNameRBRACE	
