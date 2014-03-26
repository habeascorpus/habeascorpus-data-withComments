/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
CSSNavigableNode	TokenNameIdentifier	 CSS Navigable Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractDocument	TokenNameIdentifier	 Abstract Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SVGConstants	TokenNameIdentifier	 SVG Constants
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
DOMException	TokenNameIdentifier	 DOM Exception
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
MutationEvent	TokenNameIdentifier	 Mutation Event
;	TokenNameSEMICOLON	
/** * This class provides a superclass to implement an SVG element, or * an element interoperable with the SVG elements. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides a superclass to implement an SVG element, or an element interoperable with the SVG elements. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractElement	TokenNameIdentifier	 Abstract Element
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractElement	TokenNameIdentifier	 Abstract Element
implements	TokenNameimplements	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
,	TokenNameCOMMA	
CSSNavigableNode	TokenNameIdentifier	 CSS Navigable Node
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
{	TokenNameLBRACE	
/** * The live attribute values. */	TokenNameCOMMENT_JAVADOC	 The live attribute values. 
protected	TokenNameprotected	
transient	TokenNametransient	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
liveAttributeValues	TokenNameIdentifier	 live Attribute Values
=	TokenNameEQUAL	
new	TokenNamenew	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new Element object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Element object. 
protected	TokenNameprotected	
AbstractElement	TokenNameIdentifier	 Abstract Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new Element object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new Element object. @param prefix The namespace prefix. @param owner The owner document. 
protected	TokenNameprotected	
AbstractElement	TokenNameIdentifier	 Abstract Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeAttributes	TokenNameIdentifier	 initialize Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSSNavigableNode /////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	CSSNavigableNode /////////////////////////////////////////////////// 
/** * Returns the CSS parent node of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS parent node of this node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCSSParentNode	TokenNameIdentifier	 get CSS Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getXblParentNode	TokenNameIdentifier	 get Xbl Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS previous sibling node of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS previous sibling node of this node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCSSPreviousSibling	TokenNameIdentifier	 get CSS Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getXblPreviousSibling	TokenNameIdentifier	 get Xbl Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS next sibling node of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS next sibling node of this node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCSSNextSibling	TokenNameIdentifier	 get CSS Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getXblNextSibling	TokenNameIdentifier	 get Xbl Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS first child node of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS first child node of this node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCSSFirstChild	TokenNameIdentifier	 get CSS First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getXblFirstChild	TokenNameIdentifier	 get Xbl First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS last child of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS last child of this node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCSSLastChild	TokenNameIdentifier	 get CSS Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getXblLastChild	TokenNameIdentifier	 get Xbl Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this node is the root of a (conceptual) hidden tree * that selectors will not work across. */	TokenNameCOMMENT_JAVADOC	 Returns whether this node is the root of a (conceptual) hidden tree that selectors will not work across. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isHiddenFromSelectors	TokenNameIdentifier	 is Hidden From Selectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Attributes ///////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	Attributes ///////////////////////////////////////////////////////// 
public	TokenNamepublic	
void	TokenNamevoid	
fireDOMAttrModifiedEvent	TokenNameIdentifier	 fire DOM Attr Modified Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Attr	TokenNameIdentifier	 Attr
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
oldv	TokenNameIdentifier	 oldv
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newv	TokenNameIdentifier	 newv
,	TokenNameCOMMA	
short	TokenNameshort	
change	TokenNameIdentifier	 change
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
fireDOMAttrModifiedEvent	TokenNameIdentifier	 fire DOM Attr Modified Event
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
oldv	TokenNameIdentifier	 oldv
,	TokenNameCOMMA	
newv	TokenNameIdentifier	 newv
,	TokenNameCOMMA	
change	TokenNameIdentifier	 change
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This handles the SVG 1.2 behaviour where setting the value of 	TokenNameCOMMENT_LINE	This handles the SVG 1.2 behaviour where setting the value of 
// 'id' must also change 'xml:id', and vice versa. 	TokenNameCOMMENT_LINE	'id' must also change 'xml:id', and vice versa. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
)	TokenNameRPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
)	TokenNameRPAREN	
.	TokenNameDOT	
isSVG12	TokenNameIdentifier	 is SV G12
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
change	TokenNameIdentifier	 change
==	TokenNameEQUAL_EQUAL	
MutationEvent	TokenNameIdentifier	 Mutation Event
.	TokenNameDOT	
ADDITION	TokenNameIdentifier	 ADDITION
||	TokenNameOR_OR	
change	TokenNameIdentifier	 change
==	TokenNameEQUAL_EQUAL	
MutationEvent	TokenNameIdentifier	 Mutation Event
.	TokenNameDOT	
MODIFICATION	TokenNameIdentifier	 MODIFICATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
XML_NAMESPACE_URI	TokenNameIdentifier	 XML  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XML_NAMESPACE_URI	TokenNameIdentifier	 XML  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
,	TokenNameCOMMA	
newv	TokenNameIdentifier	 newv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
newv	TokenNameIdentifier	 newv
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
newv	TokenNameIdentifier	 newv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XML_ID_QNAME	TokenNameIdentifier	 XML  ID  QNAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
,	TokenNameCOMMA	
newv	TokenNameIdentifier	 newv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
newv	TokenNameIdentifier	 newv
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
newv	TokenNameIdentifier	 newv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the live attribute value associated with given * attribute, if any. * @param ns The attribute's namespace. * @param ln The attribute's local name. */	TokenNameCOMMENT_JAVADOC	 Returns the live attribute value associated with given attribute, if any. @param ns The attribute's namespace. @param ln The attribute's local name. 
public	TokenNamepublic	
LiveAttributeValue	TokenNameIdentifier	 Live Attribute Value
getLiveAttributeValue	TokenNameIdentifier	 get Live Attribute Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if (liveAttributeValues == null) { 	TokenNameCOMMENT_LINE	if (liveAttributeValues == null) { 
// return null; 	TokenNameCOMMENT_LINE	return null; 
// } 	TokenNameCOMMENT_LINE	} 
return	TokenNamereturn	
(	TokenNameLPAREN	
LiveAttributeValue	TokenNameIdentifier	 Live Attribute Value
)	TokenNameRPAREN	
liveAttributeValues	TokenNameIdentifier	 live Attribute Values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Associates a live attribute value to this element. * @param ns The attribute's namespace. * @param ln The attribute's local name. * @param val The live value. */	TokenNameCOMMENT_JAVADOC	 Associates a live attribute value to this element. @param ns The attribute's namespace. @param ln The attribute's local name. @param val The live value. 
public	TokenNamepublic	
void	TokenNamevoid	
putLiveAttributeValue	TokenNameIdentifier	 put Live Attribute Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
,	TokenNameCOMMA	
LiveAttributeValue	TokenNameIdentifier	 Live Attribute Value
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if (liveAttributeValues == null) { 	TokenNameCOMMENT_LINE	if (liveAttributeValues == null) { 
// liveAttributeValues = new SoftDoublyIndexedTable(); 	TokenNameCOMMENT_LINE	liveAttributeValues = new SoftDoublyIndexedTable(); 
// } 	TokenNameCOMMENT_LINE	} 
liveAttributeValues	TokenNameIdentifier	 live Attribute Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
ln	TokenNameIdentifier	 ln
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the AttributeInitializer for this element type. * @return null if this element has no attribute with a default value. */	TokenNameCOMMENT_JAVADOC	 Returns the AttributeInitializer for this element type. @return null if this element has no attribute with a default value. 
protected	TokenNameprotected	
AttributeInitializer	TokenNameIdentifier	 Attribute Initializer
getAttributeInitializer	TokenNameIdentifier	 get Attribute Initializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the attributes of this element to their default value. */	TokenNameCOMMENT_JAVADOC	 Initializes the attributes of this element to their default value. 
protected	TokenNameprotected	
void	TokenNamevoid	
initializeAttributes	TokenNameIdentifier	 initialize Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributeInitializer	TokenNameIdentifier	 Attribute Initializer
ai	TokenNameIdentifier	 ai
=	TokenNameEQUAL	
getAttributeInitializer	TokenNameIdentifier	 get Attribute Initializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
initializeAttributes	TokenNameIdentifier	 initialize Attributes
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Resets an attribute to the default value. * @return true if a default value is known for the given attribute. */	TokenNameCOMMENT_JAVADOC	 Resets an attribute to the default value. @return true if a default value is known for the given attribute. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributeInitializer	TokenNameIdentifier	 Attribute Initializer
ai	TokenNameIdentifier	 ai
=	TokenNameEQUAL	
getAttributeInitializer	TokenNameIdentifier	 get Attribute Initializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ai	TokenNameIdentifier	 ai
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ai	TokenNameIdentifier	 ai
.	TokenNameDOT	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the attribute list. */	TokenNameCOMMENT_JAVADOC	 Creates the attribute list. 
protected	TokenNameprotected	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
createAttributes	TokenNameIdentifier	 create Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ExtendedNamedNodeHashMap	TokenNameIdentifier	 Extended Named Node Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets an unspecified attribute. * @param nsURI The attribute namespace URI. * @param name The attribute's qualified name. * @param value The attribute's default value. */	TokenNameCOMMENT_JAVADOC	 Sets an unspecified attribute. @param nsURI The attribute namespace URI. @param name The attribute's qualified name. @param value The attribute's default value. 
public	TokenNamepublic	
void	TokenNamevoid	
setUnspecifiedAttribute	TokenNameIdentifier	 set Unspecified Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nsURI	TokenNameIdentifier	 ns URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
createAttributes	TokenNameIdentifier	 create Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtendedNamedNodeHashMap	TokenNameIdentifier	 Extended Named Node Hash Map
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
.	TokenNameDOT	
setUnspecifiedAttribute	TokenNameIdentifier	 set Unspecified Attribute
(	TokenNameLPAREN	
nsURI	TokenNameIdentifier	 ns URI
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when an attribute has been added. */	TokenNameCOMMENT_JAVADOC	 Called when an attribute has been added. 
protected	TokenNameprotected	
void	TokenNamevoid	
attrAdded	TokenNameIdentifier	 attr Added
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newv	TokenNameIdentifier	 newv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LiveAttributeValue	TokenNameIdentifier	 Live Attribute Value
lav	TokenNameIdentifier	 lav
=	TokenNameEQUAL	
getLiveAttributeValue	TokenNameIdentifier	 get Live Attribute Value
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lav	TokenNameIdentifier	 lav
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lav	TokenNameIdentifier	 lav
.	TokenNameDOT	
attrAdded	TokenNameIdentifier	 attr Added
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
newv	TokenNameIdentifier	 newv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when an attribute has been modified. */	TokenNameCOMMENT_JAVADOC	 Called when an attribute has been modified. 
protected	TokenNameprotected	
void	TokenNamevoid	
attrModified	TokenNameIdentifier	 attr Modified
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
oldv	TokenNameIdentifier	 oldv
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newv	TokenNameIdentifier	 newv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LiveAttributeValue	TokenNameIdentifier	 Live Attribute Value
lav	TokenNameIdentifier	 lav
=	TokenNameEQUAL	
getLiveAttributeValue	TokenNameIdentifier	 get Live Attribute Value
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lav	TokenNameIdentifier	 lav
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lav	TokenNameIdentifier	 lav
.	TokenNameDOT	
attrModified	TokenNameIdentifier	 attr Modified
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
oldv	TokenNameIdentifier	 oldv
,	TokenNameCOMMA	
newv	TokenNameIdentifier	 newv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when an attribute has been removed. */	TokenNameCOMMENT_JAVADOC	 Called when an attribute has been removed. 
protected	TokenNameprotected	
void	TokenNamevoid	
attrRemoved	TokenNameIdentifier	 attr Removed
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
oldv	TokenNameIdentifier	 oldv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LiveAttributeValue	TokenNameIdentifier	 Live Attribute Value
lav	TokenNameIdentifier	 lav
=	TokenNameEQUAL	
getLiveAttributeValue	TokenNameIdentifier	 get Live Attribute Value
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lav	TokenNameIdentifier	 lav
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lav	TokenNameIdentifier	 lav
.	TokenNameDOT	
attrRemoved	TokenNameIdentifier	 attr Removed
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
oldv	TokenNameIdentifier	 oldv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets Returns the live attribute value associated with given * attribute, if any. */	TokenNameCOMMENT_JAVADOC	 Gets Returns the live attribute value associated with given attribute, if any. 
private	TokenNameprivate	
LiveAttributeValue	TokenNameIdentifier	 Live Attribute Value
getLiveAttributeValue	TokenNameIdentifier	 get Live Attribute Value
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getLiveAttributeValue	TokenNameIdentifier	 get Live Attribute Value
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Importation //////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	Importation //////////////////////////////////////////////////// 
/** * Exports this node to the given document. */	TokenNameCOMMENT_JAVADOC	 Exports this node to the given document. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
export	TokenNameIdentifier	 export
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
export	TokenNameIdentifier	 export
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractElement	TokenNameIdentifier	 Abstract Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
.	TokenNameDOT	
initializeAttributes	TokenNameIdentifier	 initialize Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
export	TokenNameIdentifier	 export
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deeply exports this node to the given document. */	TokenNameCOMMENT_JAVADOC	 Deeply exports this node to the given document. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
deepExport	TokenNameIdentifier	 deep Export
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
export	TokenNameIdentifier	 export
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractElement	TokenNameIdentifier	 Abstract Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
.	TokenNameDOT	
initializeAttributes	TokenNameIdentifier	 initialize Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
deepExport	TokenNameIdentifier	 deep Export
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An implementation of the {@link NamedNodeMap}. */	TokenNameCOMMENT_JAVADOC	 An implementation of the {@link NamedNodeMap}. 
protected	TokenNameprotected	
class	TokenNameclass	
ExtendedNamedNodeHashMap	TokenNameIdentifier	 Extended Named Node Hash Map
extends	TokenNameextends	
NamedNodeHashMap	TokenNameIdentifier	 Named Node Hash Map
{	TokenNameLBRACE	
/** * Creates a new ExtendedNamedNodeHashMap object. */	TokenNameCOMMENT_JAVADOC	 Creates a new ExtendedNamedNodeHashMap object. 
public	TokenNamepublic	
ExtendedNamedNodeHashMap	TokenNameIdentifier	 Extended Named Node Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Adds an unspecified attribute to the map. * * @param nsURI The attribute namespace URI. * @param name The attribute's qualified name. * @param value The attribute's default value. */	TokenNameCOMMENT_JAVADOC	 Adds an unspecified attribute to the map. * @param nsURI The attribute namespace URI. @param name The attribute's qualified name. @param value The attribute's default value. 
public	TokenNamepublic	
void	TokenNamevoid	
setUnspecifiedAttribute	TokenNameIdentifier	 set Unspecified Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nsURI	TokenNameIdentifier	 ns URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createAttributeNS	TokenNameIdentifier	 create Attribute NS
(	TokenNameLPAREN	
nsURI	TokenNameIdentifier	 ns URI
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
)	TokenNameRPAREN	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
.	TokenNameDOT	
setSpecified	TokenNameIdentifier	 set Specified
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setNamedItemNS	TokenNameIdentifier	 set Named Item NS
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link NamedNodeMap#removeNamedItemNS(String,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link NamedNodeMap#removeNamedItemNS(String,String)}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
removeNamedItemNS	TokenNameIdentifier	 remove Named Item NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReadonly	TokenNameIdentifier	 is Readonly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.node.map"	TokenNameStringLiteral	readonly.node.map
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
"attribute.missing"	TokenNameStringLiteral	attribute.missing
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
)	TokenNameRPAREN	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_FOUND_ERR	TokenNameIdentifier	 NOT  FOUND  ERR
,	TokenNameCOMMA	
"attribute.missing"	TokenNameStringLiteral	attribute.missing
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
localName	TokenNameIdentifier	 local Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setOwnerElement	TokenNameIdentifier	 set Owner Element
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Reset the attribute to its default value 	TokenNameCOMMENT_LINE	Reset the attribute to its default value 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Mutation event 	TokenNameCOMMENT_LINE	Mutation event 
fireDOMAttrModifiedEvent	TokenNameIdentifier	 fire DOM Attr Modified Event
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
MutationEvent	TokenNameIdentifier	 Mutation Event
.	TokenNameDOT	
REMOVAL	TokenNameIdentifier	 REMOVAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
