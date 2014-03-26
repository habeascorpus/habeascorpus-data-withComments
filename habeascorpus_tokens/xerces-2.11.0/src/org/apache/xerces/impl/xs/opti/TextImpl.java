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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
opti	TokenNameIdentifier	 opti
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @author Neil Graham, IBM * @version $Id: TextImpl.java 705596 2008-10-17 13:05:10Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @author Neil Graham, IBM @version $Id: TextImpl.java 705596 2008-10-17 13:05:10Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
TextImpl	TokenNameIdentifier	 Text Impl
extends	TokenNameextends	
DefaultText	TokenNameIdentifier	 Default Text
{	TokenNameLBRACE	
// Data 	TokenNameCOMMENT_LINE	Data 
String	TokenNameIdentifier	 String
fData	TokenNameIdentifier	 f Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
SchemaDOM	TokenNameIdentifier	 Schema DOM
fSchemaDOM	TokenNameIdentifier	 f Schema DOM
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
fRow	TokenNameIdentifier	 f Row
;	TokenNameSEMICOLON	
int	TokenNameint	
fCol	TokenNameIdentifier	 f Col
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TextImpl	TokenNameIdentifier	 Text Impl
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
SchemaDOM	TokenNameIdentifier	 Schema DOM
sDOM	TokenNameIdentifier	 s DOM
,	TokenNameCOMMA	
int	TokenNameint	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
int	TokenNameint	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fData	TokenNameIdentifier	 f Data
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSchemaDOM	TokenNameIdentifier	 f Schema DOM
=	TokenNameEQUAL	
sDOM	TokenNameIdentifier	 s DOM
;	TokenNameSEMICOLON	
fRow	TokenNameIdentifier	 f Row
=	TokenNameEQUAL	
row	TokenNameIdentifier	 row
;	TokenNameSEMICOLON	
fCol	TokenNameIdentifier	 f Col
=	TokenNameEQUAL	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
rawname	TokenNameIdentifier	 rawname
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// org.w3c.dom.Node methods 	TokenNameCOMMENT_LINE	org.w3c.dom.Node methods 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#text"	TokenNameStringLiteral	#text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSchemaDOM	TokenNameIdentifier	 f Schema DOM
.	TokenNameDOT	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
fRow	TokenNameIdentifier	 f Row
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCol	TokenNameIdentifier	 f Col
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fSchemaDOM	TokenNameIdentifier	 f Schema DOM
.	TokenNameDOT	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
fRow	TokenNameIdentifier	 f Row
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
fCol	TokenNameIdentifier	 f Col
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCol	TokenNameIdentifier	 f Col
==	TokenNameEQUAL_EQUAL	
fSchemaDOM	TokenNameIdentifier	 f Schema DOM
.	TokenNameDOT	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
fRow	TokenNameIdentifier	 f Row
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fSchemaDOM	TokenNameIdentifier	 f Schema DOM
.	TokenNameDOT	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
fRow	TokenNameIdentifier	 f Row
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
fCol	TokenNameIdentifier	 f Col
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CharacterData methods 	TokenNameCOMMENT_LINE	CharacterData methods 
/** * The character data of the node that implements this interface. The DOM * implementation may not put arbitrary limits on the amount of data * that may be stored in a <code>CharacterData</code> node. However, * implementation limits may mean that the entirety of a node's data may * not fit into a single <code>DOMString</code>. In such cases, the user * may call <code>substringData</code> to retrieve the data in * appropriately sized pieces. * @exception DOMException * NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. * @exception DOMException * DOMSTRING_SIZE_ERR: Raised when it would return more characters than * fit in a <code>DOMString</code> variable on the implementation * platform. */	TokenNameCOMMENT_JAVADOC	 The character data of the node that implements this interface. The DOM implementation may not put arbitrary limits on the amount of data that may be stored in a <code>CharacterData</code> node. However, implementation limits may mean that the entirety of a node's data may not fit into a single <code>DOMString</code>. In such cases, the user may call <code>substringData</code> to retrieve the data in appropriately sized pieces. @exception DOMException NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. @exception DOMException DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a <code>DOMString</code> variable on the implementation platform. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
fData	TokenNameIdentifier	 f Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of 16-bit units that are available through <code>data</code> * and the <code>substringData</code> method below. This may have the * value zero, i.e., <code>CharacterData</code> nodes may be empty. */	TokenNameCOMMENT_JAVADOC	 The number of 16-bit units that are available through <code>data</code> and the <code>substringData</code> method below. This may have the value zero, i.e., <code>CharacterData</code> nodes may be empty. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fData	TokenNameIdentifier	 f Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fData	TokenNameIdentifier	 f Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extracts a range of data from the node. * @param offset Start offset of substring to extract. * @param count The number of 16-bit units to extract. * @return The specified substring. If the sum of <code>offset</code> and * <code>count</code> exceeds the <code>length</code>, then all 16-bit * units to the end of the data are returned. * @exception DOMException * INDEX_SIZE_ERR: Raised if the specified <code>offset</code> is * negative or greater than the number of 16-bit units in * <code>data</code>, or if the specified <code>count</code> is * negative. * <br>DOMSTRING_SIZE_ERR: Raised if the specified range of text does * not fit into a <code>DOMString</code>. */	TokenNameCOMMENT_JAVADOC	 Extracts a range of data from the node. @param offset Start offset of substring to extract. @param count The number of 16-bit units to extract. @return The specified substring. If the sum of <code>offset</code> and <code>count</code> exceeds the <code>length</code>, then all 16-bit units to the end of the data are returned. @exception DOMException INDEX_SIZE_ERR: Raised if the specified <code>offset</code> is negative or greater than the number of 16-bit units in <code>data</code>, or if the specified <code>count</code> is negative. <br>DOMSTRING_SIZE_ERR: Raised if the specified range of text does not fit into a <code>DOMString</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
substringData	TokenNameIdentifier	 substring Data
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fData	TokenNameIdentifier	 f Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
fData	TokenNameIdentifier	 f Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
"parameter error"	TokenNameStringLiteral	parameter error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
>=	TokenNameGREATER_EQUAL	
fData	TokenNameIdentifier	 f Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
fData	TokenNameIdentifier	 f Data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fData	TokenNameIdentifier	 f Data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
