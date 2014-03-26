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
/** * A MethodRef CP Info * */	TokenNameCOMMENT_JAVADOC	 A MethodRef CP Info 
public	TokenNamepublic	
class	TokenNameclass	
MethodRefCPInfo	TokenNameIdentifier	 Method Ref CP Info
extends	TokenNameextends	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
{	TokenNameLBRACE	
/** the name of the class defining this method */	TokenNameCOMMENT_JAVADOC	 the name of the class defining this method 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
methodClassName	TokenNameIdentifier	 method Class Name
;	TokenNameSEMICOLON	
/** the name of the method */	TokenNameCOMMENT_JAVADOC	 the name of the method 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
;	TokenNameSEMICOLON	
/** the method's type descriptor */	TokenNameCOMMENT_JAVADOC	 the method's type descriptor 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
methodType	TokenNameIdentifier	 method Type
;	TokenNameSEMICOLON	
/** The index into the constant pool which defines the class of this method. */	TokenNameCOMMENT_JAVADOC	 The index into the constant pool which defines the class of this method. 
private	TokenNameprivate	
int	TokenNameint	
classIndex	TokenNameIdentifier	 class Index
;	TokenNameSEMICOLON	
/** * the index into the constant pool which defined the name and type * signature of the method */	TokenNameCOMMENT_JAVADOC	 the index into the constant pool which defined the name and type signature of the method 
private	TokenNameprivate	
int	TokenNameint	
nameAndTypeIndex	TokenNameIdentifier	 name And Type Index
;	TokenNameSEMICOLON	
/** Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
MethodRefCPInfo	TokenNameIdentifier	 Method Ref CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
CONSTANT_METHODREF	TokenNameIdentifier	 CONSTANT  METHODREF
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
"Method : Class = "	TokenNameStringLiteral	Method : Class = 
+	TokenNamePLUS	
methodClassName	TokenNameIdentifier	 method Class Name
+	TokenNamePLUS	
", name = "	TokenNameStringLiteral	, name = 
+	TokenNamePLUS	
methodName	TokenNameIdentifier	 method Name
+	TokenNamePLUS	
", type = "	TokenNameStringLiteral	, type = 
+	TokenNamePLUS	
methodType	TokenNameIdentifier	 method Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"Method : Class index = "	TokenNameStringLiteral	Method : Class index = 
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
methodClass	TokenNameIdentifier	 method Class
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
methodClass	TokenNameIdentifier	 method Class
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
constantPool	TokenNameIdentifier	 constant Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
methodClassName	TokenNameIdentifier	 method Class Name
=	TokenNameEQUAL	
methodClass	TokenNameIdentifier	 method Class
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
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
nt	TokenNameIdentifier	 nt
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
methodType	TokenNameIdentifier	 method Type
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
/** * Get the name of the class defining the method * * @return the name of the class defining this method */	TokenNameCOMMENT_JAVADOC	 Get the name of the class defining the method * @return the name of the class defining this method 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMethodClassName	TokenNameIdentifier	 get Method Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
methodClassName	TokenNameIdentifier	 method Class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of the method. * * @return the name of the method. */	TokenNameCOMMENT_JAVADOC	 Get the name of the method. * @return the name of the method. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMethodName	TokenNameIdentifier	 get Method Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
methodName	TokenNameIdentifier	 method Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the type signature of the method. * * @return the type signature of the method. */	TokenNameCOMMENT_JAVADOC	 Get the type signature of the method. * @return the type signature of the method. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMethodType	TokenNameIdentifier	 get Method Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
methodType	TokenNameIdentifier	 method Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
