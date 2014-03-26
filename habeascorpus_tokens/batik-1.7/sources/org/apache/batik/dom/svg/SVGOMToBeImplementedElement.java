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
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractDocument	TokenNameIdentifier	 Abstract Document
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
/** * This is a development only class. It is used temporarily in the * SVG DOM implementation for SVG elements whose DOM support has not * been put in. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGOMToBeImplementedElement.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This is a development only class. It is used temporarily in the SVG DOM implementation for SVG elements whose DOM support has not been put in. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGOMToBeImplementedElement.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMToBeImplementedElement	TokenNameIdentifier	 SVGOM To Be Implemented Element
extends	TokenNameextends	
SVGGraphicsElement	TokenNameIdentifier	 SVG Graphics Element
{	TokenNameLBRACE	
/** * This element's local name */	TokenNameCOMMENT_JAVADOC	 This element's local name 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMToBeImplementedElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMToBeImplementedElement object. 
protected	TokenNameprotected	
SVGOMToBeImplementedElement	TokenNameIdentifier	 SVGOM To Be Implemented Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMToBeImplementedElement object. * @param prefix The namespace prefix. * @param owner The owner document. * @param localName the local name for the element. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMToBeImplementedElement object. @param prefix The namespace prefix. @param owner The owner document. @param localName the local name for the element. 
public	TokenNamepublic	
SVGOMToBeImplementedElement	TokenNameIdentifier	 SVGOM To Be Implemented Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getLocalName()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getLocalName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new uninitialized instance of this object's class. */	TokenNameCOMMENT_JAVADOC	 Returns a new uninitialized instance of this object's class. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMToBeImplementedElement	TokenNameIdentifier	 SVGOM To Be Implemented Element
(	TokenNameLPAREN	
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
SVGOMToBeImplementedElement	TokenNameIdentifier	 SVGOM To Be Implemented Element
ae	TokenNameIdentifier	 ae
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMToBeImplementedElement	TokenNameIdentifier	 SVGOM To Be Implemented Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
ae	TokenNameIdentifier	 ae
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
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
SVGOMToBeImplementedElement	TokenNameIdentifier	 SVGOM To Be Implemented Element
ae	TokenNameIdentifier	 ae
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMToBeImplementedElement	TokenNameIdentifier	 SVGOM To Be Implemented Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
ae	TokenNameIdentifier	 ae
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
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
SVGOMToBeImplementedElement	TokenNameIdentifier	 SVGOM To Be Implemented Element
ae	TokenNameIdentifier	 ae
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMToBeImplementedElement	TokenNameIdentifier	 SVGOM To Be Implemented Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
ae	TokenNameIdentifier	 ae
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
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
SVGOMToBeImplementedElement	TokenNameIdentifier	 SVGOM To Be Implemented Element
ae	TokenNameIdentifier	 ae
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMToBeImplementedElement	TokenNameIdentifier	 SVGOM To Be Implemented Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
ae	TokenNameIdentifier	 ae
.	TokenNameDOT	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
