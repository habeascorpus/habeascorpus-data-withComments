/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: AttList.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: AttList.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Attr	TokenNameIdentifier	 Attr
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
/** * Wraps a DOM attribute list in a SAX Attributes. * * This class is a copy of the one in org.apache.xml.utils. * It exists to cut the serializers dependancy on that package. * A minor changes from that package are: * DOMHelper reference changed to DOM2Helper, class is not "public" * * This class is not a public API, it is only public because it is * used in org.apache.xml.serializer. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Wraps a DOM attribute list in a SAX Attributes. * This class is a copy of the one in org.apache.xml.utils. It exists to cut the serializers dependancy on that package. A minor changes from that package are: DOMHelper reference changed to DOM2Helper, class is not "public" * This class is not a public API, it is only public because it is used in org.apache.xml.serializer. * @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
AttList	TokenNameIdentifier	 Att List
implements	TokenNameimplements	
Attributes	TokenNameIdentifier	 Attributes
{	TokenNameLBRACE	
/** List of attribute nodes */	TokenNameCOMMENT_JAVADOC	 List of attribute nodes 
NamedNodeMap	TokenNameIdentifier	 Named Node Map
m_attrs	TokenNameIdentifier	 m attrs
;	TokenNameSEMICOLON	
/** Index of last attribute node */	TokenNameCOMMENT_JAVADOC	 Index of last attribute node 
int	TokenNameint	
m_lastIndex	TokenNameIdentifier	 m last Index
;	TokenNameSEMICOLON	
// ARGHH!! JAXP Uses Xerces without setting the namespace processing to ON! 	TokenNameCOMMENT_LINE	ARGHH!! JAXP Uses Xerces without setting the namespace processing to ON! 
// DOM2Helper m_dh = new DOM2Helper(); 	TokenNameCOMMENT_LINE	DOM2Helper m_dh = new DOM2Helper(); 
/** Local reference to DOMHelper */	TokenNameCOMMENT_JAVADOC	 Local reference to DOMHelper 
DOM2Helper	TokenNameIdentifier	 DO M2 Helper
m_dh	TokenNameIdentifier	 m dh
;	TokenNameSEMICOLON	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Constructor AttList 	TokenNameCOMMENT_LINE	* Constructor AttList 
// * 	TokenNameCOMMENT_LINE	* 
// * 	TokenNameCOMMENT_LINE	* 
// * @param attrs List of attributes this will contain 	TokenNameCOMMENT_LINE	* @param attrs List of attributes this will contain 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public AttList(NamedNodeMap attrs) 	TokenNameCOMMENT_LINE	public AttList(NamedNodeMap attrs) 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// m_attrs = attrs; 	TokenNameCOMMENT_LINE	m_attrs = attrs; 
// m_lastIndex = m_attrs.getLength() - 1; 	TokenNameCOMMENT_LINE	m_lastIndex = m_attrs.getLength() - 1; 
// m_dh = new DOM2Helper(); 	TokenNameCOMMENT_LINE	m_dh = new DOM2Helper(); 
// } 	TokenNameCOMMENT_LINE	} 
/** * Constructor AttList * * * @param attrs List of attributes this will contain * @param dh DOMHelper */	TokenNameCOMMENT_JAVADOC	 Constructor AttList * @param attrs List of attributes this will contain @param dh DOMHelper 
public	TokenNamepublic	
AttList	TokenNameIdentifier	 Att List
(	TokenNameLPAREN	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
attrs	TokenNameIdentifier	 attrs
,	TokenNameCOMMA	
DOM2Helper	TokenNameIdentifier	 DO M2 Helper
dh	TokenNameIdentifier	 dh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_attrs	TokenNameIdentifier	 m attrs
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
;	TokenNameSEMICOLON	
m_lastIndex	TokenNameIdentifier	 m last Index
=	TokenNameEQUAL	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_dh	TokenNameIdentifier	 m dh
=	TokenNameEQUAL	
dh	TokenNameIdentifier	 dh
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of attribute nodes in the list * * * @return number of attribute nodes */	TokenNameCOMMENT_JAVADOC	 Get the number of attribute nodes in the list * @return number of attribute nodes 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up an attribute's Namespace URI by index. * * @param index The attribute index (zero-based). * @return The Namespace URI, or the empty string if none * is available, or null if the index is out of * range. */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's Namespace URI by index. * @param index The attribute index (zero-based). @return The Namespace URI, or the empty string if none is available, or null if the index is out of range. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
m_dh	TokenNameIdentifier	 m dh
.	TokenNameDOT	
getNamespaceOfNode	TokenNameIdentifier	 get Namespace Of Node
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ns	TokenNameIdentifier	 ns
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up an attribute's local name by index. * * @param index The attribute index (zero-based). * @return The local name, or the empty string if Namespace * processing is not being performed, or null * if the index is out of range. */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's local name by index. * @param index The attribute index (zero-based). @return The local name, or the empty string if Namespace processing is not being performed, or null if the index is out of range. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dh	TokenNameIdentifier	 m dh
.	TokenNameDOT	
getLocalNameOfNode	TokenNameIdentifier	 get Local Name Of Node
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up an attribute's qualified name by index. * * * @param i The attribute index (zero-based). * * @return The attribute's qualified name */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's qualified name by index. * @param i The attribute index (zero-based). * @return The attribute's qualified name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the attribute's node type by index * * * @param i The attribute index (zero-based) * * @return the attribute's node type */	TokenNameCOMMENT_JAVADOC	 Get the attribute's node type by index * @param i The attribute index (zero-based) * @return the attribute's node type 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"CDATA"	TokenNameStringLiteral	CDATA
;	TokenNameSEMICOLON	
// for the moment 	TokenNameCOMMENT_LINE	for the moment 
}	TokenNameRBRACE	
/** * Get the attribute's node value by index * * * @param i The attribute index (zero-based) * * @return the attribute's node value */	TokenNameCOMMENT_JAVADOC	 Get the attribute's node value by index * @param i The attribute index (zero-based) * @return the attribute's node value 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the attribute's node type by name * * * @param name Attribute name * * @return the attribute's node type */	TokenNameCOMMENT_JAVADOC	 Get the attribute's node type by name * @param name Attribute name * @return the attribute's node type 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"CDATA"	TokenNameStringLiteral	CDATA
;	TokenNameSEMICOLON	
// for the moment 	TokenNameCOMMENT_LINE	for the moment 
}	TokenNameRBRACE	
/** * Look up an attribute's type by Namespace name. * * @param uri The Namespace URI, or the empty String if the * name has no Namespace URI. * @param localName The local name of the attribute. * @return The attribute type as a string, or null if the * attribute is not in the list or if Namespace * processing is not being performed. */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's type by Namespace name. * @param uri The Namespace URI, or the empty String if the name has no Namespace URI. @param localName The local name of the attribute. @return The attribute type as a string, or null if the attribute is not in the list or if Namespace processing is not being performed. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"CDATA"	TokenNameStringLiteral	CDATA
;	TokenNameSEMICOLON	
// for the moment 	TokenNameCOMMENT_LINE	for the moment 
}	TokenNameRBRACE	
/** * Look up an attribute's value by name. * * * @param name The attribute node's name * * @return The attribute node's value */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's value by name. * @param name The attribute node's name * @return The attribute node's value 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
getNamedItem	TokenNameIdentifier	 get Named Item
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
?	TokenNameQUESTION	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up an attribute's value by Namespace name. * * @param uri The Namespace URI, or the empty String if the * name has no Namespace URI. * @param localName The local name of the attribute. * @return The attribute value as a string, or null if the * attribute is not in the list. */	TokenNameCOMMENT_JAVADOC	 Look up an attribute's value by Namespace name. * @param uri The Namespace URI, or the empty String if the name has no Namespace URI. @param localName The local name of the attribute. @return The attribute value as a string, or null if the attribute is not in the list. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
getNamedItemNS	TokenNameIdentifier	 get Named Item NS
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up the index of an attribute by Namespace name. * * @param uri The Namespace URI, or the empty string if * the name has no Namespace URI. * @param localPart The attribute's local name. * @return The index of the attribute, or -1 if it does not * appear in the list. */	TokenNameCOMMENT_JAVADOC	 Look up the index of an attribute by Namespace name. * @param uri The Namespace URI, or the empty string if the name has no Namespace URI. @param localPart The attribute's local name. @return The index of the attribute, or -1 if it does not appear in the list. 
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localPart	TokenNameIdentifier	 local Part
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localPart	TokenNameIdentifier	 local Part
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up the index of an attribute by raw XML 1.0 name. * * @param qName The qualified (prefixed) name. * @return The index of the attribute, or -1 if it does not * appear in the list. */	TokenNameCOMMENT_JAVADOC	 Look up the index of an attribute by raw XML 1.0 name. * @param qName The qualified (prefixed) name. @return The index of the attribute, or -1 if it does not appear in the list. 
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
m_attrs	TokenNameIdentifier	 m attrs
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
