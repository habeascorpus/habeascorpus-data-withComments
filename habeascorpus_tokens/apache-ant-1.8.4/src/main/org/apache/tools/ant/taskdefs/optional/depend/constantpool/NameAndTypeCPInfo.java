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
/** * A NameAndType CP Info * */	TokenNameCOMMENT_JAVADOC	 A NameAndType CP Info 
public	TokenNamepublic	
class	TokenNameclass	
NameAndTypeCPInfo	TokenNameIdentifier	 Name And Type CP Info
extends	TokenNameextends	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
{	TokenNameLBRACE	
/** Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
NameAndTypeCPInfo	TokenNameIdentifier	 Name And Type CP Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
CONSTANT_NAMEANDTYPE	TokenNameIdentifier	 CONSTANT  NAMEANDTYPE
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
nameIndex	TokenNameIdentifier	 name Index
=	TokenNameEQUAL	
cpStream	TokenNameIdentifier	 cp Stream
.	TokenNameDOT	
readUnsignedShort	TokenNameIdentifier	 read Unsigned Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
descriptorIndex	TokenNameIdentifier	 descriptor Index
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
"Name = "	TokenNameStringLiteral	Name = 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
", type = "	TokenNameStringLiteral	, type = 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"Name index = "	TokenNameStringLiteral	Name index = 
+	TokenNamePLUS	
nameIndex	TokenNameIdentifier	 name Index
+	TokenNamePLUS	
", descriptor index = "	TokenNameStringLiteral	, descriptor index = 
+	TokenNamePLUS	
descriptorIndex	TokenNameIdentifier	 descriptor Index
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
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Utf8CPInfo	TokenNameIdentifier	 Utf8 CP Info
)	TokenNameRPAREN	
constantPool	TokenNameIdentifier	 constant Pool
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
nameIndex	TokenNameIdentifier	 name Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Utf8CPInfo	TokenNameIdentifier	 Utf8 CP Info
)	TokenNameRPAREN	
constantPool	TokenNameIdentifier	 constant Pool
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
descriptorIndex	TokenNameIdentifier	 descriptor Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
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
/** * Get the name component of this entry * * @return the name of this name and type entry */	TokenNameCOMMENT_JAVADOC	 Get the name component of this entry * @return the name of this name and type entry 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the type signature of this entry * * @return the type signature of this entry */	TokenNameCOMMENT_JAVADOC	 Get the type signature of this entry * @return the type signature of this entry 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** the name component of this entry */	TokenNameCOMMENT_JAVADOC	 the name component of this entry 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** the type component of this entry */	TokenNameCOMMENT_JAVADOC	 the type component of this entry 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * the index into the constant pool at which the name component's string * value is stored */	TokenNameCOMMENT_JAVADOC	 the index into the constant pool at which the name component's string value is stored 
private	TokenNameprivate	
int	TokenNameint	
nameIndex	TokenNameIdentifier	 name Index
;	TokenNameSEMICOLON	
/** * the index into the constant pool where the type descriptor string is * stored. */	TokenNameCOMMENT_JAVADOC	 the index into the constant pool where the type descriptor string is stored. 
private	TokenNameprivate	
int	TokenNameint	
descriptorIndex	TokenNameIdentifier	 descriptor Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
