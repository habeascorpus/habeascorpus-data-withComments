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
Text	TokenNameIdentifier	 Text
;	TokenNameSEMICOLON	
/** * The <code>Text</code> interface inherits from <code>CharacterData</code> * and represents the textual content (termed character data in XML) of an * <code>Element</code> or <code>Attr</code>. If there is no markup inside * an element's content, the text is contained in a single object * implementing the <code>Text</code> interface that is the only child of * the element. If there is markup, it is parsed into the information items * (elements, comments, etc.) and <code>Text</code> nodes that form the list * of children of the element. * <p>When a document is first made available via the DOM, there is only one * <code>Text</code> node for each block of text. Users may create adjacent * <code>Text</code> nodes that represent the contents of a given element * without any intervening markup, but should be aware that there is no way * to represent the separations between these nodes in XML or HTML, so they * will not (in general) persist between DOM editing sessions. The * <code>normalize()</code> method on <code>Node</code> merges any such * adjacent <code>Text</code> objects into a single node for each block of * text. * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113'>Document Object Model (DOM) Level 2 Core Specification</a>. * * This is an empty implementation. * * @xerces.internal * * @author Neil Graham, IBM * * @version $Id: DefaultText.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The <code>Text</code> interface inherits from <code>CharacterData</code> and represents the textual content (termed character data in XML) of an <code>Element</code> or <code>Attr</code>. If there is no markup inside an element's content, the text is contained in a single object implementing the <code>Text</code> interface that is the only child of the element. If there is markup, it is parsed into the information items (elements, comments, etc.) and <code>Text</code> nodes that form the list of children of the element. <p>When a document is first made available via the DOM, there is only one <code>Text</code> node for each block of text. Users may create adjacent <code>Text</code> nodes that represent the contents of a given element without any intervening markup, but should be aware that there is no way to represent the separations between these nodes in XML or HTML, so they will not (in general) persist between DOM editing sessions. The <code>normalize()</code> method on <code>Node</code> merges any such adjacent <code>Text</code> objects into a single node for each block of text. <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113'>Document Object Model (DOM) Level 2 Core Specification</a>. * This is an empty implementation. * @xerces.internal * @author Neil Graham, IBM * @version $Id: DefaultText.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultText	TokenNameIdentifier	 Default Text
extends	TokenNameextends	
NodeImpl	TokenNameIdentifier	 Node Impl
implements	TokenNameimplements	
Text	TokenNameIdentifier	 Text
{	TokenNameLBRACE	
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The character data of the node that implements this interface. The DOM * implementation may not put arbitrary limits on the amount of data * that may be stored in a <code>CharacterData</code> node. However, * implementation limits may mean that the entirety of a node's data may * not fit into a single <code>DOMString</code>. In such cases, the user * may call <code>substringData</code> to retrieve the data in * appropriately sized pieces. * @exception DOMException * NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. * @exception DOMException * DOMSTRING_SIZE_ERR: Raised when it would return more characters than * fit in a <code>DOMString</code> variable on the implementation * platform. */	TokenNameCOMMENT_JAVADOC	 The character data of the node that implements this interface. The DOM implementation may not put arbitrary limits on the amount of data that may be stored in a <code>CharacterData</code> node. However, implementation limits may mean that the entirety of a node's data may not fit into a single <code>DOMString</code>. In such cases, the user may call <code>substringData</code> to retrieve the data in appropriately sized pieces. @exception DOMException NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. @exception DOMException DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a <code>DOMString</code> variable on the implementation platform. 
public	TokenNamepublic	
void	TokenNamevoid	
setData	TokenNameIdentifier	 set Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"Method not supported"	TokenNameStringLiteral	Method not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of 16-bit units that are available through <code>data</code> * and the <code>substringData</code> method below. This may have the * value zero, i.e., <code>CharacterData</code> nodes may be empty. */	TokenNameCOMMENT_JAVADOC	 The number of 16-bit units that are available through <code>data</code> and the <code>substringData</code> method below. This may have the value zero, i.e., <code>CharacterData</code> nodes may be empty. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
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
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"Method not supported"	TokenNameStringLiteral	Method not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append the string to the end of the character data of the node. Upon * success, <code>data</code> provides access to the concatenation of * <code>data</code> and the <code>DOMString</code> specified. * @param arg The <code>DOMString</code> to append. * @exception DOMException * NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. */	TokenNameCOMMENT_JAVADOC	 Append the string to the end of the character data of the node. Upon success, <code>data</code> provides access to the concatenation of <code>data</code> and the <code>DOMString</code> specified. @param arg The <code>DOMString</code> to append. @exception DOMException NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. 
public	TokenNamepublic	
void	TokenNamevoid	
appendData	TokenNameIdentifier	 append Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"Method not supported"	TokenNameStringLiteral	Method not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Insert a string at the specified 16-bit unit offset. * @param offset The character offset at which to insert. * @param arg The <code>DOMString</code> to insert. * @exception DOMException * INDEX_SIZE_ERR: Raised if the specified <code>offset</code> is * negative or greater than the number of 16-bit units in * <code>data</code>. * <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. */	TokenNameCOMMENT_JAVADOC	 Insert a string at the specified 16-bit unit offset. @param offset The character offset at which to insert. @param arg The <code>DOMString</code> to insert. @exception DOMException INDEX_SIZE_ERR: Raised if the specified <code>offset</code> is negative or greater than the number of 16-bit units in <code>data</code>. <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. 
public	TokenNamepublic	
void	TokenNamevoid	
insertData	TokenNameIdentifier	 insert Data
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"Method not supported"	TokenNameStringLiteral	Method not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove a range of 16-bit units from the node. Upon success, * <code>data</code> and <code>length</code> reflect the change. * @param offset The offset from which to start removing. * @param count The number of 16-bit units to delete. If the sum of * <code>offset</code> and <code>count</code> exceeds * <code>length</code> then all 16-bit units from <code>offset</code> * to the end of the data are deleted. * @exception DOMException * INDEX_SIZE_ERR: Raised if the specified <code>offset</code> is * negative or greater than the number of 16-bit units in * <code>data</code>, or if the specified <code>count</code> is * negative. * <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. */	TokenNameCOMMENT_JAVADOC	 Remove a range of 16-bit units from the node. Upon success, <code>data</code> and <code>length</code> reflect the change. @param offset The offset from which to start removing. @param count The number of 16-bit units to delete. If the sum of <code>offset</code> and <code>count</code> exceeds <code>length</code> then all 16-bit units from <code>offset</code> to the end of the data are deleted. @exception DOMException INDEX_SIZE_ERR: Raised if the specified <code>offset</code> is negative or greater than the number of 16-bit units in <code>data</code>, or if the specified <code>count</code> is negative. <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. 
public	TokenNamepublic	
void	TokenNamevoid	
deleteData	TokenNameIdentifier	 delete Data
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
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"Method not supported"	TokenNameStringLiteral	Method not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replace the characters starting at the specified 16-bit unit offset * with the specified string. * @param offset The offset from which to start replacing. * @param count The number of 16-bit units to replace. If the sum of * <code>offset</code> and <code>count</code> exceeds * <code>length</code>, then all 16-bit units to the end of the data * are replaced; (i.e., the effect is the same as a <code>remove</code> * method call with the same range, followed by an <code>append</code> * method invocation). * @param arg The <code>DOMString</code> with which the range must be * replaced. * @exception DOMException * INDEX_SIZE_ERR: Raised if the specified <code>offset</code> is * negative or greater than the number of 16-bit units in * <code>data</code>, or if the specified <code>count</code> is * negative. * <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. */	TokenNameCOMMENT_JAVADOC	 Replace the characters starting at the specified 16-bit unit offset with the specified string. @param offset The offset from which to start replacing. @param count The number of 16-bit units to replace. If the sum of <code>offset</code> and <code>count</code> exceeds <code>length</code>, then all 16-bit units to the end of the data are replaced; (i.e., the effect is the same as a <code>remove</code> method call with the same range, followed by an <code>append</code> method invocation). @param arg The <code>DOMString</code> with which the range must be replaced. @exception DOMException INDEX_SIZE_ERR: Raised if the specified <code>offset</code> is negative or greater than the number of 16-bit units in <code>data</code>, or if the specified <code>count</code> is negative. <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. 
public	TokenNamepublic	
void	TokenNamevoid	
replaceData	TokenNameIdentifier	 replace Data
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"Method not supported"	TokenNameStringLiteral	Method not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Text node methods 	TokenNameCOMMENT_LINE	Text node methods 
/** * Breaks this node into two nodes at the specified <code>offset</code>, * keeping both in the tree as siblings. After being split, this node * will contain all the content up to the <code>offset</code> point. A * new node of the same type, which contains all the content at and * after the <code>offset</code> point, is returned. If the original * node had a parent node, the new node is inserted as the next sibling * of the original node. When the <code>offset</code> is equal to the * length of this node, the new node has no data. * @param offset The 16-bit unit offset at which to split, starting from * <code>0</code>. * @return The new node, of the same type as this node. * @exception DOMException * INDEX_SIZE_ERR: Raised if the specified offset is negative or greater * than the number of 16-bit units in <code>data</code>. * <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. */	TokenNameCOMMENT_JAVADOC	 Breaks this node into two nodes at the specified <code>offset</code>, keeping both in the tree as siblings. After being split, this node will contain all the content up to the <code>offset</code> point. A new node of the same type, which contains all the content at and after the <code>offset</code> point, is returned. If the original node had a parent node, the new node is inserted as the next sibling of the original node. When the <code>offset</code> is equal to the length of this node, the new node has no data. @param offset The 16-bit unit offset at which to split, starting from <code>0</code>. @return The new node, of the same type as this node. @exception DOMException INDEX_SIZE_ERR: Raised if the specified offset is negative or greater than the number of 16-bit units in <code>data</code>. <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly. 
public	TokenNamepublic	
Text	TokenNameIdentifier	 Text
splitText	TokenNameIdentifier	 split Text
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"Method not supported"	TokenNameStringLiteral	Method not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** DOM Level 3 CR */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 CR 
public	TokenNamepublic	
boolean	TokenNameboolean	
isElementContentWhitespace	TokenNameIdentifier	 is Element Content Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"Method not supported"	TokenNameStringLiteral	Method not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getWholeText	TokenNameIdentifier	 get Whole Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"Method not supported"	TokenNameStringLiteral	Method not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Text	TokenNameIdentifier	 Text
replaceWholeText	TokenNameIdentifier	 replace Whole Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"Method not supported"	TokenNameStringLiteral	Method not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
