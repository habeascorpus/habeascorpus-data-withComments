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
/** * An entry in the constant pool. This class contains a representation of the * constant pool entries. It is an abstract base class for all the different * forms of constant pool entry. * * @see ConstantPool */	TokenNameCOMMENT_JAVADOC	 An entry in the constant pool. This class contains a representation of the constant pool entries. It is an abstract base class for all the different forms of constant pool entry. * @see ConstantPool 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
{	TokenNameLBRACE	
/** Tag value for UTF8 entries. */	TokenNameCOMMENT_JAVADOC	 Tag value for UTF8 entries. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONSTANT_UTF8	TokenNameIdentifier	 CONSTANT  UT F8
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Tag value for Integer entries. */	TokenNameCOMMENT_JAVADOC	 Tag value for Integer entries. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONSTANT_INTEGER	TokenNameIdentifier	 CONSTANT  INTEGER
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Tag value for Float entries. */	TokenNameCOMMENT_JAVADOC	 Tag value for Float entries. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONSTANT_FLOAT	TokenNameIdentifier	 CONSTANT  FLOAT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Tag value for Long entries. */	TokenNameCOMMENT_JAVADOC	 Tag value for Long entries. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONSTANT_LONG	TokenNameIdentifier	 CONSTANT  LONG
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Tag value for Double entries. */	TokenNameCOMMENT_JAVADOC	 Tag value for Double entries. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONSTANT_DOUBLE	TokenNameIdentifier	 CONSTANT  DOUBLE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Tag value for Class entries. */	TokenNameCOMMENT_JAVADOC	 Tag value for Class entries. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONSTANT_CLASS	TokenNameIdentifier	 CONSTANT  CLASS
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Tag value for String entries. */	TokenNameCOMMENT_JAVADOC	 Tag value for String entries. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONSTANT_STRING	TokenNameIdentifier	 CONSTANT  STRING
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Tag value for Field Reference entries. */	TokenNameCOMMENT_JAVADOC	 Tag value for Field Reference entries. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONSTANT_FIELDREF	TokenNameIdentifier	 CONSTANT  FIELDREF
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Tag value for Method Reference entries. */	TokenNameCOMMENT_JAVADOC	 Tag value for Method Reference entries. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONSTANT_METHODREF	TokenNameIdentifier	 CONSTANT  METHODREF
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Tag value for Interface Method Reference entries. */	TokenNameCOMMENT_JAVADOC	 Tag value for Interface Method Reference entries. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONSTANT_INTERFACEMETHODREF	TokenNameIdentifier	 CONSTANT  INTERFACEMETHODREF
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Tag value for Name and Type entries. */	TokenNameCOMMENT_JAVADOC	 Tag value for Name and Type entries. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONSTANT_NAMEANDTYPE	TokenNameIdentifier	 CONSTANT  NAMEANDTYPE
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This entry's tag which identifies the type of this constant pool * entry. */	TokenNameCOMMENT_JAVADOC	 This entry's tag which identifies the type of this constant pool entry. 
private	TokenNameprivate	
int	TokenNameint	
tag	TokenNameIdentifier	 tag
;	TokenNameSEMICOLON	
/** * The number of slots in the constant pool, occupied by this entry. */	TokenNameCOMMENT_JAVADOC	 The number of slots in the constant pool, occupied by this entry. 
private	TokenNameprivate	
int	TokenNameint	
numEntries	TokenNameIdentifier	 num Entries
;	TokenNameSEMICOLON	
/** * A flag which indicates if this entry has been resolved or not. */	TokenNameCOMMENT_JAVADOC	 A flag which indicates if this entry has been resolved or not. 
private	TokenNameprivate	
boolean	TokenNameboolean	
resolved	TokenNameIdentifier	 resolved
;	TokenNameSEMICOLON	
/** * Initialise the constant pool entry. * * @param tagValue the tag value which identifies which type of constant * pool entry this is. * @param entries the number of constant pool entry slots this entry * occupies. */	TokenNameCOMMENT_JAVADOC	 Initialise the constant pool entry. * @param tagValue the tag value which identifies which type of constant pool entry this is. @param entries the number of constant pool entry slots this entry occupies. 
public	TokenNamepublic	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
(	TokenNameLPAREN	
int	TokenNameint	
tagValue	TokenNameIdentifier	 tag Value
,	TokenNameCOMMA	
int	TokenNameint	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tag	TokenNameIdentifier	 tag
=	TokenNameEQUAL	
tagValue	TokenNameIdentifier	 tag Value
;	TokenNameSEMICOLON	
numEntries	TokenNameIdentifier	 num Entries
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read a constant pool entry from a stream. This is a factory method * which reads a constant pool entry form a stream and returns the * appropriate subclass for the entry. * * @param cpStream the stream from which the constant pool entry is to * be read. * @return the appropriate ConstantPoolEntry subclass representing the * constant pool entry from the stream. * @exception IOException if the constant pool entry cannot be read * from the stream */	TokenNameCOMMENT_JAVADOC	 Read a constant pool entry from a stream. This is a factory method which reads a constant pool entry form a stream and returns the appropriate subclass for the entry. * @param cpStream the stream from which the constant pool entry is to be read. @return the appropriate ConstantPoolEntry subclass representing the constant pool entry from the stream. @exception IOException if the constant pool entry cannot be read from the stream 
public	TokenNamepublic	
static	TokenNamestatic	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
readEntry	TokenNameIdentifier	 read Entry
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
cpStream	TokenNameIdentifier	 cp Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
cpInfo	TokenNameIdentifier	 cp Info
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
cpTag	TokenNameIdentifier	 cp Tag
=	TokenNameEQUAL	
cpStream	TokenNameIdentifier	 cp Stream
.	TokenNameDOT	
readUnsignedByte	TokenNameIdentifier	 read Unsigned Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
cpTag	TokenNameIdentifier	 cp Tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CONSTANT_UTF8	TokenNameIdentifier	 CONSTANT  UT F8
:	TokenNameCOLON	
cpInfo	TokenNameIdentifier	 cp Info
=	TokenNameEQUAL	
new	TokenNamenew	
Utf8CPInfo	TokenNameIdentifier	 Utf8 CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONSTANT_INTEGER	TokenNameIdentifier	 CONSTANT  INTEGER
:	TokenNameCOLON	
cpInfo	TokenNameIdentifier	 cp Info
=	TokenNameEQUAL	
new	TokenNamenew	
IntegerCPInfo	TokenNameIdentifier	 Integer CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONSTANT_FLOAT	TokenNameIdentifier	 CONSTANT  FLOAT
:	TokenNameCOLON	
cpInfo	TokenNameIdentifier	 cp Info
=	TokenNameEQUAL	
new	TokenNamenew	
FloatCPInfo	TokenNameIdentifier	 Float CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONSTANT_LONG	TokenNameIdentifier	 CONSTANT  LONG
:	TokenNameCOLON	
cpInfo	TokenNameIdentifier	 cp Info
=	TokenNameEQUAL	
new	TokenNamenew	
LongCPInfo	TokenNameIdentifier	 Long CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONSTANT_DOUBLE	TokenNameIdentifier	 CONSTANT  DOUBLE
:	TokenNameCOLON	
cpInfo	TokenNameIdentifier	 cp Info
=	TokenNameEQUAL	
new	TokenNamenew	
DoubleCPInfo	TokenNameIdentifier	 Double CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONSTANT_CLASS	TokenNameIdentifier	 CONSTANT  CLASS
:	TokenNameCOLON	
cpInfo	TokenNameIdentifier	 cp Info
=	TokenNameEQUAL	
new	TokenNamenew	
ClassCPInfo	TokenNameIdentifier	 Class CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONSTANT_STRING	TokenNameIdentifier	 CONSTANT  STRING
:	TokenNameCOLON	
cpInfo	TokenNameIdentifier	 cp Info
=	TokenNameEQUAL	
new	TokenNamenew	
StringCPInfo	TokenNameIdentifier	 String CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONSTANT_FIELDREF	TokenNameIdentifier	 CONSTANT  FIELDREF
:	TokenNameCOLON	
cpInfo	TokenNameIdentifier	 cp Info
=	TokenNameEQUAL	
new	TokenNamenew	
FieldRefCPInfo	TokenNameIdentifier	 Field Ref CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONSTANT_METHODREF	TokenNameIdentifier	 CONSTANT  METHODREF
:	TokenNameCOLON	
cpInfo	TokenNameIdentifier	 cp Info
=	TokenNameEQUAL	
new	TokenNamenew	
MethodRefCPInfo	TokenNameIdentifier	 Method Ref CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONSTANT_INTERFACEMETHODREF	TokenNameIdentifier	 CONSTANT  INTERFACEMETHODREF
:	TokenNameCOLON	
cpInfo	TokenNameIdentifier	 cp Info
=	TokenNameEQUAL	
new	TokenNamenew	
InterfaceMethodRefCPInfo	TokenNameIdentifier	 Interface Method Ref CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CONSTANT_NAMEANDTYPE	TokenNameIdentifier	 CONSTANT  NAMEANDTYPE
:	TokenNameCOLON	
cpInfo	TokenNameIdentifier	 cp Info
=	TokenNameEQUAL	
new	TokenNamenew	
NameAndTypeCPInfo	TokenNameIdentifier	 Name And Type CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ClassFormatError	TokenNameIdentifier	 Class Format Error
(	TokenNameLPAREN	
"Invalid Constant Pool entry Type "	TokenNameStringLiteral	Invalid Constant Pool entry Type 
+	TokenNamePLUS	
cpTag	TokenNameIdentifier	 cp Tag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cpInfo	TokenNameIdentifier	 cp Info
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
cpStream	TokenNameIdentifier	 cp Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cpInfo	TokenNameIdentifier	 cp Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates whether this entry has been resolved. In general a constant * pool entry can reference another constant pool entry by its index * value. Resolution involves replacing this index value with the * constant pool entry at that index. * * @return true if this entry has been resolved. */	TokenNameCOMMENT_JAVADOC	 Indicates whether this entry has been resolved. In general a constant pool entry can reference another constant pool entry by its index value. Resolution involves replacing this index value with the constant pool entry at that index. * @return true if this entry has been resolved. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isResolved	TokenNameIdentifier	 is Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resolved	TokenNameIdentifier	 resolved
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resolve this constant pool entry with respect to its dependents in * the constant pool. * * @param constantPool the constant pool of which this entry is a member * and against which this entry is to be resolved. */	TokenNameCOMMENT_JAVADOC	 Resolve this constant pool entry with respect to its dependents in the constant pool. * @param constantPool the constant pool of which this entry is a member and against which this entry is to be resolved. 
public	TokenNamepublic	
void	TokenNamevoid	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
ConstantPool	TokenNameIdentifier	 Constant Pool
constantPool	TokenNameIdentifier	 constant Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * read a constant pool entry from a class stream. * * @param cpStream the DataInputStream which contains the constant pool * entry to be read. * @exception IOException if there is a problem reading the entry from * the stream. */	TokenNameCOMMENT_JAVADOC	 read a constant pool entry from a class stream. * @param cpStream the DataInputStream which contains the constant pool entry to be read. @exception IOException if there is a problem reading the entry from the stream. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
cpStream	TokenNameIdentifier	 cp Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Get the Entry's type tag. * * @return The Tag value of this entry */	TokenNameCOMMENT_JAVADOC	 Get the Entry's type tag. * @return The Tag value of this entry 
public	TokenNamepublic	
int	TokenNameint	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tag	TokenNameIdentifier	 tag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of Constant Pool Entry slots within the constant pool * occupied by this entry. * * @return the number of slots used. */	TokenNameCOMMENT_JAVADOC	 Get the number of Constant Pool Entry slots within the constant pool occupied by this entry. * @return the number of slots used. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getNumEntries	TokenNameIdentifier	 get Num Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numEntries	TokenNameIdentifier	 num Entries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
