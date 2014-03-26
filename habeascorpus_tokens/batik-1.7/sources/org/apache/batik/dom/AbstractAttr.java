/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
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
Element	TokenNameIdentifier	 Element
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
TypeInfo	TokenNameIdentifier	 Type Info
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
/** * This class implements the {@link org.w3c.dom.Attr} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractAttr.java 479349 2006-11-26 11:54:23Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link org.w3c.dom.Attr} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractAttr.java 479349 2006-11-26 11:54:23Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
extends	TokenNameextends	
AbstractParentNode	TokenNameIdentifier	 Abstract Parent Node
implements	TokenNameimplements	
Attr	TokenNameIdentifier	 Attr
{	TokenNameLBRACE	
/** * The name of this node. */	TokenNameCOMMENT_JAVADOC	 The name of this node. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
;	TokenNameSEMICOLON	
/** * Whether this attribute was not specified in the original document. */	TokenNameCOMMENT_JAVADOC	 Whether this attribute was not specified in the original document. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
unspecified	TokenNameIdentifier	 unspecified
;	TokenNameSEMICOLON	
/** * Whether this attribute is an ID attribute */	TokenNameCOMMENT_JAVADOC	 Whether this attribute is an ID attribute 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isIdAttr	TokenNameIdentifier	 is Id Attr
;	TokenNameSEMICOLON	
/** * The owner element. */	TokenNameCOMMENT_JAVADOC	 The owner element. 
protected	TokenNameprotected	
AbstractElement	TokenNameIdentifier	 Abstract Element
ownerElement	TokenNameIdentifier	 owner Element
;	TokenNameSEMICOLON	
/** * The attribute type information. */	TokenNameCOMMENT_JAVADOC	 The attribute type information. 
protected	TokenNameprotected	
TypeInfo	TokenNameIdentifier	 Type Info
typeInfo	TokenNameIdentifier	 type Info
;	TokenNameSEMICOLON	
/** * Creates a new Attr object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Attr object. 
protected	TokenNameprotected	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new Attr object. * @param name The attribute name for validation purposes. * @param owner The owner document. * @exception DOMException * INVALID_CHARACTER_ERR: if name contains invalid characters, */	TokenNameCOMMENT_JAVADOC	 Creates a new Attr object. @param name The attribute name for validation purposes. @param owner The owner document. @exception DOMException INVALID_CHARACTER_ERR: if name contains invalid characters, 
protected	TokenNameprotected	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getStrictErrorChecking	TokenNameIdentifier	 get Strict Error Checking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
.	TokenNameDOT	
isValidName	TokenNameIdentifier	 is Valid Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_CHARACTER_ERR	TokenNameIdentifier	 INVALID  CHARACTER  ERR
,	TokenNameCOMMA	
"xml.name"	TokenNameStringLiteral	xml.name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the node name. */	TokenNameCOMMENT_JAVADOC	 Sets the node name. 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeName	TokenNameIdentifier	 set Node Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
isIdAttr	TokenNameIdentifier	 is Id Attr
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
isId	TokenNameIdentifier	 is Id
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNodeName()}. * @return {@link #nodeName}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNodeName()}. @return {@link #nodeName}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodeName	TokenNameIdentifier	 node Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNodeType()}. * @return {@link org.w3c.dom.Node#ATTRIBUTE_NODE} */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNodeType()}. @return {@link org.w3c.dom.Node#ATTRIBUTE_NODE} 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNodeValue()}. * @return The content of the attribute. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNodeValue()}. @return The content of the attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#setNodeValue(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#setNodeValue(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nodeValue	TokenNameIdentifier	 node Value
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
"readonly.node"	TokenNameStringLiteral	readonly.node
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Remove all the children 	TokenNameCOMMENT_LINE	Remove all the children 
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
nodeValue	TokenNameIdentifier	 node Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
nodeValue	TokenNameIdentifier	 node Value
;	TokenNameSEMICOLON	
// Create and append a new child. 	TokenNameCOMMENT_LINE	Create and append a new child. 
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ownerElement	TokenNameIdentifier	 owner Element
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerElement	TokenNameIdentifier	 owner Element
.	TokenNameDOT	
fireDOMAttrModifiedEvent	TokenNameIdentifier	 fire DOM Attr Modified Event
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
MutationEvent	TokenNameIdentifier	 Mutation Event
.	TokenNameDOT	
MODIFICATION	TokenNameIdentifier	 MODIFICATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Attr#getName()}. * @return {@link #getNodeName()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Attr#getName()}. @return {@link #getNodeName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Attr#getSpecified()}. * @return !{@link #unspecified}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Attr#getSpecified()}. @return !{@link #unspecified}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getSpecified	TokenNameIdentifier	 get Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
unspecified	TokenNameIdentifier	 unspecified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the specified attribute. */	TokenNameCOMMENT_JAVADOC	 Sets the specified attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setSpecified	TokenNameIdentifier	 set Specified
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unspecified	TokenNameIdentifier	 unspecified
=	TokenNameEQUAL	
!	TokenNameNOT	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Attr#getValue()}. * @return {@link #getNodeValue()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Attr#getValue()}. @return {@link #getNodeValue()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Attr#setValue(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Attr#setValue(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the owner element. */	TokenNameCOMMENT_JAVADOC	 Sets the owner element. 
public	TokenNamepublic	
void	TokenNamevoid	
setOwnerElement	TokenNameIdentifier	 set Owner Element
(	TokenNameLPAREN	
AbstractElement	TokenNameIdentifier	 Abstract Element
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerElement	TokenNameIdentifier	 owner Element
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Attr#getOwnerElement()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Attr#getOwnerElement()}. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ownerElement	TokenNameIdentifier	 owner Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Attr#getSchemaTypeInfo()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Attr#getSchemaTypeInfo()}. 
public	TokenNamepublic	
TypeInfo	TokenNameIdentifier	 Type Info
getSchemaTypeInfo	TokenNameIdentifier	 get Schema Type Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
typeInfo	TokenNameIdentifier	 type Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
typeInfo	TokenNameIdentifier	 type Info
=	TokenNameEQUAL	
new	TokenNamenew	
AttrTypeInfo	TokenNameIdentifier	 Attr Type Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
typeInfo	TokenNameIdentifier	 type Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Attr#isId()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Attr#isId()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isId	TokenNameIdentifier	 is Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isIdAttr	TokenNameIdentifier	 is Id Attr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets whether this attribute is an ID attribute. */	TokenNameCOMMENT_JAVADOC	 Sets whether this attribute is an ID attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setIsId	TokenNameIdentifier	 set Is Id
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isId	TokenNameIdentifier	 is Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isIdAttr	TokenNameIdentifier	 is Id Attr
=	TokenNameEQUAL	
isId	TokenNameIdentifier	 is Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when a child node has been added. */	TokenNameCOMMENT_JAVADOC	 Called when a child node has been added. 
protected	TokenNameprotected	
void	TokenNamevoid	
nodeAdded	TokenNameIdentifier	 node Added
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSpecified	TokenNameIdentifier	 set Specified
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when a child node is going to be removed. */	TokenNameCOMMENT_JAVADOC	 Called when a child node is going to be removed. 
protected	TokenNameprotected	
void	TokenNamevoid	
nodeToBeRemoved	TokenNameIdentifier	 node To Be Removed
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSpecified	TokenNameIdentifier	 set Specified
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
AbstractAttr	TokenNameIdentifier	 Abstract Attr
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
nodeName	TokenNameIdentifier	 node Name
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
unspecified	TokenNameIdentifier	 unspecified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
isIdAttr	TokenNameIdentifier	 is Id Attr
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
isId	TokenNameIdentifier	 is Id
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
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
deepExport	TokenNameIdentifier	 deep Export
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
nodeName	TokenNameIdentifier	 node Name
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
unspecified	TokenNameIdentifier	 unspecified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
isIdAttr	TokenNameIdentifier	 is Id Attr
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
isId	TokenNameIdentifier	 is Id
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy the fields of the current node into the given node. * @param n a node of the type of this. */	TokenNameCOMMENT_JAVADOC	 Copy the fields of the current node into the given node. @param n a node of the type of this. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
nodeName	TokenNameIdentifier	 node Name
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
unspecified	TokenNameIdentifier	 unspecified
=	TokenNameEQUAL	
unspecified	TokenNameIdentifier	 unspecified
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
isIdAttr	TokenNameIdentifier	 is Id Attr
=	TokenNameEQUAL	
isIdAttr	TokenNameIdentifier	 is Id Attr
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deeply copy the fields of the current node into the given node. * @param n a node of the type of this. */	TokenNameCOMMENT_JAVADOC	 Deeply copy the fields of the current node into the given node. @param n a node of the type of this. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
deepCopyInto	TokenNameIdentifier	 deep Copy Into
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
deepCopyInto	TokenNameIdentifier	 deep Copy Into
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractAttr	TokenNameIdentifier	 Abstract Attr
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
nodeName	TokenNameIdentifier	 node Name
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
unspecified	TokenNameIdentifier	 unspecified
=	TokenNameEQUAL	
unspecified	TokenNameIdentifier	 unspecified
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
isIdAttr	TokenNameIdentifier	 is Id Attr
=	TokenNameEQUAL	
isIdAttr	TokenNameIdentifier	 is Id Attr
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks the validity of a node to be inserted. */	TokenNameCOMMENT_JAVADOC	 Checks the validity of a node to be inserted. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkChildType	TokenNameIdentifier	 check Child Type
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
boolean	TokenNameboolean	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
HIERARCHY_REQUEST_ERR	TokenNameIdentifier	 HIERARCHY  REQUEST  ERR
,	TokenNameCOMMA	
"child.type"	TokenNameStringLiteral	child.type
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires a DOMSubtreeModified event. */	TokenNameCOMMENT_JAVADOC	 Fires a DOMSubtreeModified event. 
protected	TokenNameprotected	
void	TokenNamevoid	
fireDOMSubtreeModifiedEvent	TokenNameIdentifier	 fire DOM Subtree Modified Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractDocument	TokenNameIdentifier	 Abstract Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getCurrentDocument	TokenNameIdentifier	 get Current Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getEventsEnabled	TokenNameIdentifier	 get Events Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
fireDOMSubtreeModifiedEvent	TokenNameIdentifier	 fire DOM Subtree Modified Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractElement	TokenNameIdentifier	 Abstract Element
)	TokenNameRPAREN	
getOwnerElement	TokenNameIdentifier	 get Owner Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireDOMSubtreeModifiedEvent	TokenNameIdentifier	 fire DOM Subtree Modified Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Inner class to hold type information about this attribute. */	TokenNameCOMMENT_JAVADOC	 Inner class to hold type information about this attribute. 
public	TokenNamepublic	
class	TokenNameclass	
AttrTypeInfo	TokenNameIdentifier	 Attr Type Info
implements	TokenNameimplements	
TypeInfo	TokenNameIdentifier	 Type Info
{	TokenNameLBRACE	
/** * Type namespace. */	TokenNameCOMMENT_JAVADOC	 Type namespace. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeNamespace	TokenNameIdentifier	 get Type Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Type name. */	TokenNameCOMMENT_JAVADOC	 Type name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTypeName	TokenNameIdentifier	 get Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this type derives from the given type. */	TokenNameCOMMENT_JAVADOC	 Returns whether this type derives from the given type. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDerivedFrom	TokenNameIdentifier	 is Derived From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
