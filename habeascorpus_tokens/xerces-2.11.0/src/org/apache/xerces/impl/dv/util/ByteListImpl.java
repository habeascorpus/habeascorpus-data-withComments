/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AbstractList	TokenNameIdentifier	 Abstract List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSException	TokenNameIdentifier	 XS Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
datatypes	TokenNameIdentifier	 datatypes
.	TokenNameDOT	
ByteList	TokenNameIdentifier	 Byte List
;	TokenNameSEMICOLON	
/** * Implementation of <code>org.apache.xerces.xs.datatypes.ByteList</code>. * * @xerces.internal * * @author Ankit Pasricha, IBM * * @version $Id: ByteListImpl.java 1024038 2010-10-18 22:06:35Z sandygao $ */	TokenNameCOMMENT_JAVADOC	 Implementation of <code>org.apache.xerces.xs.datatypes.ByteList</code>. * @xerces.internal * @author Ankit Pasricha, IBM * @version $Id: ByteListImpl.java 1024038 2010-10-18 22:06:35Z sandygao $ 
public	TokenNamepublic	
class	TokenNameclass	
ByteListImpl	TokenNameIdentifier	 Byte List Impl
extends	TokenNameextends	
AbstractList	TokenNameIdentifier	 Abstract List
implements	TokenNameimplements	
ByteList	TokenNameIdentifier	 Byte List
{	TokenNameLBRACE	
// actually data stored in a byte array 	TokenNameCOMMENT_LINE	actually data stored in a byte array 
protected	TokenNameprotected	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
// canonical representation of the data 	TokenNameCOMMENT_LINE	canonical representation of the data 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
canonical	TokenNameIdentifier	 canonical
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ByteListImpl	TokenNameIdentifier	 Byte List Impl
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of <code>byte</code>s in the list. The range of * valid child object indices is 0 to <code>length-1</code> inclusive. */	TokenNameCOMMENT_JAVADOC	 The number of <code>byte</code>s in the list. The range of valid child object indices is 0 to <code>length-1</code> inclusive. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if the <code>byte</code> <code>item</code> is a * member of this list. * @param item <code>byte</code> whose presence in this list * is to be tested. * @return True if this list contains the <code>byte</code> * <code>item</code>. */	TokenNameCOMMENT_JAVADOC	 Checks if the <code>byte</code> <code>item</code> is a member of this list. @param item <code>byte</code> whose presence in this list is to be tested. @return True if this list contains the <code>byte</code> <code>item</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
byte	TokenNamebyte	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <code>index</code>th item in the collection. The index * starts at 0. * @param index index into the collection. * @return The <code>byte</code> at the <code>index</code>th * position in the <code>ByteList</code>. * @exception XSException * INDEX_SIZE_ERR: if <code>index</code> is greater than or equal to the * number of objects in the list. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>index</code>th item in the collection. The index starts at 0. @param index index into the collection. @return The <code>byte</code> at the <code>index</code>th position in the <code>ByteList</code>. @exception XSException INDEX_SIZE_ERR: if <code>index</code> is greater than or equal to the number of objects in the list. 
public	TokenNamepublic	
byte	TokenNamebyte	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
XSException	TokenNameIdentifier	 XS Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XSException	TokenNameIdentifier	 XS Exception
(	TokenNameLPAREN	
XSException	TokenNameIdentifier	 XS Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * List methods */	TokenNameCOMMENT_BLOCK	 List methods 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Byte	TokenNameIdentifier	 Byte
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"Index: "	TokenNameStringLiteral	Index: 
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
