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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DOMParser	TokenNameIdentifier	 DOM Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParser	TokenNameIdentifier	 SAX Parser
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
XSAnnotation	TokenNameIdentifier	 XS Annotation
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
XSConstants	TokenNameIdentifier	 XS Constants
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
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This is an implementation of the XSAnnotation schema component. * * @xerces.internal * * @version $Id: XSAnnotationImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This is an implementation of the XSAnnotation schema component. * @xerces.internal * @version $Id: XSAnnotationImpl.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XSAnnotationImpl	TokenNameIdentifier	 XS Annotation Impl
implements	TokenNameimplements	
XSAnnotation	TokenNameIdentifier	 XS Annotation
{	TokenNameLBRACE	
// Data 	TokenNameCOMMENT_LINE	Data 
// the content of the annotation node, including all children, along 	TokenNameCOMMENT_LINE	the content of the annotation node, including all children, along 
// with any non-schema attributes from its parent 	TokenNameCOMMENT_LINE	with any non-schema attributes from its parent 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fData	TokenNameIdentifier	 f Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// the grammar which owns this annotation; we get parsers 	TokenNameCOMMENT_LINE	the grammar which owns this annotation; we get parsers 
// from here when we need them 	TokenNameCOMMENT_LINE	from here when we need them 
private	TokenNameprivate	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
fGrammar	TokenNameIdentifier	 f Grammar
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// constructors 	TokenNameCOMMENT_LINE	constructors 
public	TokenNamepublic	
XSAnnotationImpl	TokenNameIdentifier	 XS Annotation Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
,	TokenNameCOMMA	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fData	TokenNameIdentifier	 f Data
=	TokenNameEQUAL	
contents	TokenNameIdentifier	 contents
;	TokenNameSEMICOLON	
fGrammar	TokenNameIdentifier	 f Grammar
=	TokenNameEQUAL	
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write contents of the annotation to the specified DOM object. If the * specified <code>target</code> object is a DOM in-scope namespace * declarations for <code>annotation</code> element are added as * attributes nodes of the serialized <code>annotation</code>, otherwise * the corresponding events for all in-scope namespace declaration are * sent via specified document handler. * @param target A target pointer to the annotation target object, i.e. * <code>org.w3c.dom.Document</code>, * <code>org.xml.sax.ContentHandler</code>. * @param targetType A target type. * @return If the <code>target</code> is recognized type and supported by * this implementation return true, otherwise return false. */	TokenNameCOMMENT_JAVADOC	 Write contents of the annotation to the specified DOM object. If the specified <code>target</code> object is a DOM in-scope namespace declarations for <code>annotation</code> element are added as attributes nodes of the serialized <code>annotation</code>, otherwise the corresponding events for all in-scope namespace declaration are sent via specified document handler. @param target A target pointer to the annotation target object, i.e. <code>org.w3c.dom.Document</code>, <code>org.xml.sax.ContentHandler</code>. @param targetType A target type. @return If the <code>target</code> is recognized type and supported by this implementation return true, otherwise return false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
writeAnnotation	TokenNameIdentifier	 write Annotation
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
short	TokenNameshort	
targetType	TokenNameIdentifier	 target Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
targetType	TokenNameIdentifier	 target Type
==	TokenNameEQUAL_EQUAL	
XSAnnotation	TokenNameIdentifier	 XS Annotation
.	TokenNameDOT	
W3C_DOM_ELEMENT	TokenNameIdentifier	 W3 C  DOM  ELEMENT
||	TokenNameOR_OR	
targetType	TokenNameIdentifier	 target Type
==	TokenNameEQUAL_EQUAL	
XSAnnotation	TokenNameIdentifier	 XS Annotation
.	TokenNameDOT	
W3C_DOM_DOCUMENT	TokenNameIdentifier	 W3 C  DOM  DOCUMENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeToDOM	TokenNameIdentifier	 write To DOM
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
targetType	TokenNameIdentifier	 target Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
targetType	TokenNameIdentifier	 target Type
==	TokenNameEQUAL_EQUAL	
SAX_CONTENTHANDLER	TokenNameIdentifier	 SAX  CONTENTHANDLER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeToSAX	TokenNameIdentifier	 write To SAX
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A text representation of annotation. */	TokenNameCOMMENT_JAVADOC	 A text representation of annotation. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAnnotationString	TokenNameIdentifier	 get Annotation String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fData	TokenNameIdentifier	 f Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XSObject methods 	TokenNameCOMMENT_LINE	XSObject methods 
/** * The <code>type</code> of this object, i.e. * <code>ELEMENT_DECLARATION</code>. */	TokenNameCOMMENT_JAVADOC	 The <code>type</code> of this object, i.e. <code>ELEMENT_DECLARATION</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
ANNOTATION	TokenNameIdentifier	 ANNOTATION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The name of type <code>NCName</code> of this declaration as defined in * XML Namespaces. */	TokenNameCOMMENT_JAVADOC	 The name of type <code>NCName</code> of this declaration as defined in XML Namespaces. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The [target namespace] of this object, or <code>null</code> if it is * unspecified. */	TokenNameCOMMENT_JAVADOC	 The [target namespace] of this object, or <code>null</code> if it is unspecified. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A namespace schema information item corresponding to the target * namespace of the component, if it's globally declared; or null * otherwise. */	TokenNameCOMMENT_JAVADOC	 A namespace schema information item corresponding to the target namespace of the component, if it's globally declared; or null otherwise. 
public	TokenNamepublic	
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
getNamespaceItem	TokenNameIdentifier	 get Namespace Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// private methods 	TokenNameCOMMENT_LINE	private methods 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
writeToSAX	TokenNameIdentifier	 write To SAX
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// nothing must go wrong with this parse... 	TokenNameCOMMENT_LINE	nothing must go wrong with this parse... 
SAXParser	TokenNameIdentifier	 SAX Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
fGrammar	TokenNameIdentifier	 f Grammar
.	TokenNameDOT	
getSAXParser	TokenNameIdentifier	 get SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringReader	TokenNameIdentifier	 String Reader
aReader	TokenNameIdentifier	 a Reader
=	TokenNameEQUAL	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
fData	TokenNameIdentifier	 f Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputSource	TokenNameIdentifier	 Input Source
aSource	TokenNameIdentifier	 a Source
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
aReader	TokenNameIdentifier	 a Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
aSource	TokenNameIdentifier	 a Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this should never happen! 	TokenNameCOMMENT_LINE	this should never happen! 
// REVISIT: what to do with this?; should really not 	TokenNameCOMMENT_LINE	REVISIT: what to do with this?; should really not 
// eat it... 	TokenNameCOMMENT_LINE	eat it... 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ditto with above 	TokenNameCOMMENT_LINE	ditto with above 
}	TokenNameRBRACE	
// Release the reference to the user's ContentHandler. 	TokenNameCOMMENT_LINE	Release the reference to the user's ContentHandler. 
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this creates the new Annotation element as the first child 	TokenNameCOMMENT_LINE	this creates the new Annotation element as the first child 
// of the Node 	TokenNameCOMMENT_LINE	of the Node 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
writeToDOM	TokenNameIdentifier	 write To DOM
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
futureOwner	TokenNameIdentifier	 future Owner
=	TokenNameEQUAL	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XSAnnotation	TokenNameIdentifier	 XS Annotation
.	TokenNameDOT	
W3C_DOM_ELEMENT	TokenNameIdentifier	 W3 C  DOM  ELEMENT
)	TokenNameRPAREN	
?	TokenNameQUESTION	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
DOMParser	TokenNameIdentifier	 DOM Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
fGrammar	TokenNameIdentifier	 f Grammar
.	TokenNameDOT	
getDOMParser	TokenNameIdentifier	 get DOM Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringReader	TokenNameIdentifier	 String Reader
aReader	TokenNameIdentifier	 a Reader
=	TokenNameEQUAL	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
fData	TokenNameIdentifier	 f Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputSource	TokenNameIdentifier	 Input Source
aSource	TokenNameIdentifier	 a Source
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
aReader	TokenNameIdentifier	 a Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
aSource	TokenNameIdentifier	 a Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this should never happen! 	TokenNameCOMMENT_LINE	this should never happen! 
// REVISIT: what to do with this?; should really not 	TokenNameCOMMENT_LINE	REVISIT: what to do with this?; should really not 
// eat it... 	TokenNameCOMMENT_LINE	eat it... 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ditto with above 	TokenNameCOMMENT_LINE	ditto with above 
}	TokenNameRBRACE	
Document	TokenNameIdentifier	 Document
aDocument	TokenNameIdentifier	 a Document
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
dropDocumentReferences	TokenNameIdentifier	 drop Document References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
annotation	TokenNameIdentifier	 annotation
=	TokenNameEQUAL	
aDocument	TokenNameIdentifier	 a Document
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
newElem	TokenNameIdentifier	 new Elem
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
futureOwner	TokenNameIdentifier	 future Owner
instanceof	TokenNameinstanceof	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newElem	TokenNameIdentifier	 new Elem
=	TokenNameEQUAL	
futureOwner	TokenNameIdentifier	 future Owner
.	TokenNameDOT	
adoptNode	TokenNameIdentifier	 adopt Node
(	TokenNameLPAREN	
annotation	TokenNameIdentifier	 annotation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// adoptNode will return null when the DOM implementations are not compatible. 	TokenNameCOMMENT_LINE	adoptNode will return null when the DOM implementations are not compatible. 
if	TokenNameif	
(	TokenNameLPAREN	
newElem	TokenNameIdentifier	 new Elem
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newElem	TokenNameIdentifier	 new Elem
=	TokenNameEQUAL	
futureOwner	TokenNameIdentifier	 future Owner
.	TokenNameDOT	
importNode	TokenNameIdentifier	 import Node
(	TokenNameLPAREN	
annotation	TokenNameIdentifier	 annotation
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newElem	TokenNameIdentifier	 new Elem
=	TokenNameEQUAL	
futureOwner	TokenNameIdentifier	 future Owner
.	TokenNameDOT	
importNode	TokenNameIdentifier	 import Node
(	TokenNameLPAREN	
annotation	TokenNameIdentifier	 annotation
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
newElem	TokenNameIdentifier	 new Elem
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
