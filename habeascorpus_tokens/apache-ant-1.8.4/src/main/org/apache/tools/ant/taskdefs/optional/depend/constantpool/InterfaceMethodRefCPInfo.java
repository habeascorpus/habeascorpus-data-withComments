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
/** * A InterfaceMethodRef CP Info * */	TokenNameCOMMENT_JAVADOC	 A InterfaceMethodRef CP Info 
public	TokenNamepublic	
class	TokenNameclass	
InterfaceMethodRefCPInfo	TokenNameIdentifier	 Interface Method Ref CP Info
extends	TokenNameextends	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
{	TokenNameLBRACE	
/** the class name of the class defining the interface method */	TokenNameCOMMENT_JAVADOC	 the class name of the class defining the interface method 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
interfaceMethodClassName	TokenNameIdentifier	 interface Method Class Name
;	TokenNameSEMICOLON	
/** the name of the interface nmethod */	TokenNameCOMMENT_JAVADOC	 the name of the interface nmethod 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
interfaceMethodName	TokenNameIdentifier	 interface Method Name
;	TokenNameSEMICOLON	
/** the method signature of the interface method */	TokenNameCOMMENT_JAVADOC	 the method signature of the interface method 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
interfaceMethodType	TokenNameIdentifier	 interface Method Type
;	TokenNameSEMICOLON	
/** * the index into the constant pool of the class entry for the interface * class */	TokenNameCOMMENT_JAVADOC	 the index into the constant pool of the class entry for the interface class 
private	TokenNameprivate	
int	TokenNameint	
classIndex	TokenNameIdentifier	 class Index
;	TokenNameSEMICOLON	
/** * the index into the constant pool of the name and type entry * describing the method */	TokenNameCOMMENT_JAVADOC	 the index into the constant pool of the name and type entry describing the method 
private	TokenNameprivate	
int	TokenNameint	
nameAndTypeIndex	TokenNameIdentifier	 name And Type Index
;	TokenNameSEMICOLON	
/** Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
InterfaceMethodRefCPInfo	TokenNameIdentifier	 Interface Method Ref CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
CONSTANT_INTERFACEMETHODREF	TokenNameIdentifier	 CONSTANT  INTERFACEMETHODREF
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * read a constant pool entry from a class stream. * * @param cpStream the DataInputStream which contains the constant pool * entry to be read. * @exception IOException if there is a problem reading the entry from * the stream. */	TokenNameCOMMENT_JAVADOC	 read a constant pool entry from a class stream. * @param cpStream the DataInputStream which contains the constant pool entry to be read. @exception IOException if there is a problem reading the entry from the stream. 
public	TokenNamepublic	
void	TokenNamevoid	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
cpStream	TokenNameIdentifier	 cp Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
classIndex	TokenNameIdentifier	 class Index
=	TokenNameEQUAL	
cpStream	TokenNameIdentifier	 cp Stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nameAndTypeIndex	TokenNameIdentifier	 name And Type Index
=	TokenNameEQUAL	
cpStream	TokenNameIdentifier	 cp Stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
ClassCPInfo	TokenNameIdentifier	 Class CP Info
interfaceMethodClass	TokenNameIdentifier	 interface Method Class
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ClassCPInfo	TokenNameIdentifier	 Class CP Info
)	TokenNameRPAREN	
constantPool	TokenNameIdentifier	 constant Pool
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
classIndex	TokenNameIdentifier	 class Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interfaceMethodClass	TokenNameIdentifier	 interface Method Class
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
constantPool	TokenNameIdentifier	 constant Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interfaceMethodClassName	TokenNameIdentifier	 interface Method Class Name
=	TokenNameEQUAL	
interfaceMethodClass	TokenNameIdentifier	 interface Method Class
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NameAndTypeCPInfo	TokenNameIdentifier	 Name And Type CP Info
nt	TokenNameIdentifier	 nt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NameAndTypeCPInfo	TokenNameIdentifier	 Name And Type CP Info
)	TokenNameRPAREN	
constantPool	TokenNameIdentifier	 constant Pool
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
nameAndTypeIndex	TokenNameIdentifier	 name And Type Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nt	TokenNameIdentifier	 nt
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
constantPool	TokenNameIdentifier	 constant Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interfaceMethodName	TokenNameIdentifier	 interface Method Name
=	TokenNameEQUAL	
nt	TokenNameIdentifier	 nt
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interfaceMethodType	TokenNameIdentifier	 interface Method Type
=	TokenNameEQUAL	
nt	TokenNameIdentifier	 nt
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
constantPool	TokenNameIdentifier	 constant Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Print a readable version of the constant pool entry. * * @return the string representation of this constant pool entry. */	TokenNameCOMMENT_JAVADOC	 Print a readable version of the constant pool entry. * @return the string representation of this constant pool entry. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isResolved	TokenNameIdentifier	 is Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"InterfaceMethod : Class = "	TokenNameStringLiteral	InterfaceMethod : Class = 
+	TokenNamePLUS	
interfaceMethodClassName	TokenNameIdentifier	 interface Method Class Name
+	TokenNamePLUS	
", name = "	TokenNameStringLiteral	, name = 
+	TokenNamePLUS	
interfaceMethodName	TokenNameIdentifier	 interface Method Name
+	TokenNamePLUS	
", type = "	TokenNameStringLiteral	, type = 
+	TokenNamePLUS	
interfaceMethodType	TokenNameIdentifier	 interface Method Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"InterfaceMethod : Class index = "	TokenNameStringLiteral	InterfaceMethod : Class index = 
+	TokenNamePLUS	
classIndex	TokenNameIdentifier	 class Index
+	TokenNamePLUS	
", name and type index = "	TokenNameStringLiteral	, name and type index = 
+	TokenNamePLUS	
nameAndTypeIndex	TokenNameIdentifier	 name And Type Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the name of the class defining the interface method * * @return the name of the class defining the interface method */	TokenNameCOMMENT_JAVADOC	 Gets the name of the class defining the interface method * @return the name of the class defining the interface method 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInterfaceMethodClassName	TokenNameIdentifier	 get Interface Method Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
interfaceMethodClassName	TokenNameIdentifier	 interface Method Class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of the interface method * * @return the name of the interface method */	TokenNameCOMMENT_JAVADOC	 Get the name of the interface method * @return the name of the interface method 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInterfaceMethodName	TokenNameIdentifier	 get Interface Method Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
interfaceMethodName	TokenNameIdentifier	 interface Method Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the type of the interface method * * @return the interface method's type signature */	TokenNameCOMMENT_JAVADOC	 Gets the type of the interface method * @return the interface method's type signature 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInterfaceMethodType	TokenNameIdentifier	 get Interface Method Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
interfaceMethodType	TokenNameIdentifier	 interface Method Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
