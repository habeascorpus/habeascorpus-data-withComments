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
svg12	TokenNameIdentifier	 svg12
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
AttributeInitializer	TokenNameIdentifier	 Attribute Initializer
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGGraphicsElement	TokenNameIdentifier	 SVG Graphics Element
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
/** * This class implements foreign namespace elements that can be * bound with XBL. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: BindableElement.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements foreign namespace elements that can be bound with XBL. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: BindableElement.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
BindableElement	TokenNameIdentifier	 Bindable Element
extends	TokenNameextends	
SVGGraphicsElement	TokenNameIdentifier	 SVG Graphics Element
{	TokenNameLBRACE	
/** * The namespace URI of the custom element. */	TokenNameCOMMENT_JAVADOC	 The namespace URI of the custom element. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
/** * The local name of the custom element. */	TokenNameCOMMENT_JAVADOC	 The local name of the custom element. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
/** * The shadow tree. */	TokenNameCOMMENT_JAVADOC	 The shadow tree. 
protected	TokenNameprotected	
XBLOMShadowTreeElement	TokenNameIdentifier	 XBLOM Shadow Tree Element
xblShadowTree	TokenNameIdentifier	 xbl Shadow Tree
;	TokenNameSEMICOLON	
/** * Creates a new BindableElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new BindableElement object. 
protected	TokenNameprotected	
BindableElement	TokenNameIdentifier	 Bindable Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new BindableElement object. * @param prefix The namespace prefix. * @param owner The owner document. * @param ns The namespace of the custom element. * @param ln The local name of the custom element. */	TokenNameCOMMENT_JAVADOC	 Creates a new BindableElement object. @param prefix The namespace prefix. @param owner The owner document. @param ns The namespace of the custom element. @param ln The local name of the custom element. 
public	TokenNamepublic	
BindableElement	TokenNameIdentifier	 Bindable Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
ns	TokenNameIdentifier	 ns
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
ln	TokenNameIdentifier	 ln
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link Node#getNamespaceURI()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link Node#getNamespaceURI()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link Node#getLocalName()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link Node#getLocalName()}. 
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
/** * Returns a new uninitialized instance of this object's class. */	TokenNameCOMMENT_JAVADOC	 Returns a new uninitialized instance of this object's class. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BindableElement	TokenNameIdentifier	 Bindable Element
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the shadow tree for this bindable element. */	TokenNameCOMMENT_JAVADOC	 Sets the shadow tree for this bindable element. 
public	TokenNamepublic	
void	TokenNamevoid	
setShadowTree	TokenNameIdentifier	 set Shadow Tree
(	TokenNameLPAREN	
XBLOMShadowTreeElement	TokenNameIdentifier	 XBLOM Shadow Tree Element
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xblShadowTree	TokenNameIdentifier	 xbl Shadow Tree
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the shadow tree for this bindable element. */	TokenNameCOMMENT_JAVADOC	 Returns the shadow tree for this bindable element. 
public	TokenNamepublic	
XBLOMShadowTreeElement	TokenNameIdentifier	 XBLOM Shadow Tree Element
getShadowTree	TokenNameIdentifier	 get Shadow Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xblShadowTree	TokenNameIdentifier	 xbl Shadow Tree
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSSNavigableNode /////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	CSSNavigableNode /////////////////////////////////////////////// 
/** * Returns the shadow tree. */	TokenNameCOMMENT_JAVADOC	 Returns the shadow tree. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCSSFirstChild	TokenNameIdentifier	 get CSS First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xblShadowTree	TokenNameIdentifier	 xbl Shadow Tree
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xblShadowTree	TokenNameIdentifier	 xbl Shadow Tree
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the shadow tree. */	TokenNameCOMMENT_JAVADOC	 Returns the shadow tree. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCSSLastChild	TokenNameIdentifier	 get CSS Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCSSFirstChild	TokenNameIdentifier	 get CSS First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
