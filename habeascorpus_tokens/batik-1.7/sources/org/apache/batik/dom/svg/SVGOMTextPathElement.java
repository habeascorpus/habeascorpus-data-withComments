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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XLinkSupport	TokenNameIdentifier	 X Link Support
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
XMLSupport	TokenNameIdentifier	 XML Support
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
SVGTypes	TokenNameIdentifier	 SVG Types
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGAnimatedEnumeration	TokenNameIdentifier	 SVG Animated Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGAnimatedString	TokenNameIdentifier	 SVG Animated String
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGTextPathElement	TokenNameIdentifier	 SVG Text Path Element
;	TokenNameSEMICOLON	
/** * This class implements {@link org.w3c.dom.svg.SVGTextPathElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMTextPathElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link org.w3c.dom.svg.SVGTextPathElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMTextPathElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMTextPathElement	TokenNameIdentifier	 SVGOM Text Path Element
extends	TokenNameextends	
SVGOMTextContentElement	TokenNameIdentifier	 SVGOM Text Content Element
implements	TokenNameimplements	
SVGTextPathElement	TokenNameIdentifier	 SVG Text Path Element
{	TokenNameLBRACE	
/** * Table mapping XML attribute names to TraitInformation objects. */	TokenNameCOMMENT_JAVADOC	 Table mapping XML attribute names to TraitInformation objects. 
protected	TokenNameprotected	
static	TokenNamestatic	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
(	TokenNameLPAREN	
SVGOMTextContentElement	TokenNameIdentifier	 SVGOM Text Content Element
.	TokenNameDOT	
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_METHOD_ATTRIBUTE	TokenNameIdentifier	 SVG  METHOD  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_IDENT	TokenNameIdentifier	 TYPE  IDENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SPACING_ATTRIBUTE	TokenNameIdentifier	 SVG  SPACING  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_IDENT	TokenNameIdentifier	 TYPE  IDENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_START_OFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  START  OFFSET  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_LENGTH	TokenNameIdentifier	 TYPE  LENGTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
XLINK_HREF_ATTRIBUTE	TokenNameIdentifier	 XLINK  HREF  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_URI	TokenNameIdentifier	 TYPE  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The attribute initializer. */	TokenNameCOMMENT_JAVADOC	 The attribute initializer. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
AttributeInitializer	TokenNameIdentifier	 Attribute Initializer
attributeInitializer	TokenNameIdentifier	 attribute Initializer
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeInitializer	TokenNameIdentifier	 Attribute Initializer
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
XMLSupport	TokenNameIdentifier	 XML Support
.	TokenNameDOT	
XMLNS_NAMESPACE_URI	TokenNameIdentifier	 XMLNS  NAMESPACE  URI
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"xmlns:xlink"	TokenNameStringLiteral	xmlns:xlink
,	TokenNameCOMMA	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"xlink"	TokenNameStringLiteral	xlink
,	TokenNameCOMMA	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
"simple"	TokenNameStringLiteral	simple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"xlink"	TokenNameStringLiteral	xlink
,	TokenNameCOMMA	
"show"	TokenNameStringLiteral	show
,	TokenNameCOMMA	
"other"	TokenNameStringLiteral	other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"xlink"	TokenNameStringLiteral	xlink
,	TokenNameCOMMA	
"actuate"	TokenNameStringLiteral	actuate
,	TokenNameCOMMA	
"onLoad"	TokenNameStringLiteral	onLoad
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The 'method' attribute values. */	TokenNameCOMMENT_JAVADOC	 The 'method' attribute values. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
METHOD_VALUES	TokenNameIdentifier	 METHOD  VALUES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
SVG_ALIGN_VALUE	TokenNameIdentifier	 SVG  ALIGN  VALUE
,	TokenNameCOMMA	
SVG_STRETCH_VALUE	TokenNameIdentifier	 SVG  STRETCH  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The 'spacing' attribute values. */	TokenNameCOMMENT_JAVADOC	 The 'spacing' attribute values. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SPACING_VALUES	TokenNameIdentifier	 SPACING  VALUES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
,	TokenNameCOMMA	
SVG_EXACT_VALUE	TokenNameIdentifier	 SVG  EXACT  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The 'method' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'method' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedEnumeration	TokenNameIdentifier	 SVGOM Animated Enumeration
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
/** * The 'spacing' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'spacing' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedEnumeration	TokenNameIdentifier	 SVGOM Animated Enumeration
spacing	TokenNameIdentifier	 spacing
;	TokenNameSEMICOLON	
/** * The 'startOffset' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'startOffset' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
/** * The 'xlink:href' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'xlink:href' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedString	TokenNameIdentifier	 SVGOM Animated String
href	TokenNameIdentifier	 href
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMTextPathElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMTextPathElement object. 
protected	TokenNameprotected	
SVGOMTextPathElement	TokenNameIdentifier	 SVGOM Text Path Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMTextPathElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMTextPathElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMTextPathElement	TokenNameIdentifier	 SVGOM Text Path Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeLiveAttributes	TokenNameIdentifier	 initialize Live Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes all live attributes for this element. */	TokenNameCOMMENT_JAVADOC	 Initializes all live attributes for this element. 
protected	TokenNameprotected	
void	TokenNamevoid	
initializeAllLiveAttributes	TokenNameIdentifier	 initialize All Live Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
initializeAllLiveAttributes	TokenNameIdentifier	 initialize All Live Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeLiveAttributes	TokenNameIdentifier	 initialize Live Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the live attribute values of this element. */	TokenNameCOMMENT_JAVADOC	 Initializes the live attribute values of this element. 
private	TokenNameprivate	
void	TokenNamevoid	
initializeLiveAttributes	TokenNameIdentifier	 initialize Live Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
createLiveAnimatedEnumeration	TokenNameIdentifier	 create Live Animated Enumeration
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_METHOD_ATTRIBUTE	TokenNameIdentifier	 SVG  METHOD  ATTRIBUTE
,	TokenNameCOMMA	
METHOD_VALUES	TokenNameIdentifier	 METHOD  VALUES
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spacing	TokenNameIdentifier	 spacing
=	TokenNameEQUAL	
createLiveAnimatedEnumeration	TokenNameIdentifier	 create Live Animated Enumeration
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SPACING_ATTRIBUTE	TokenNameIdentifier	 SVG  SPACING  ATTRIBUTE
,	TokenNameCOMMA	
SPACING_VALUES	TokenNameIdentifier	 SPACING  VALUES
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
createLiveAnimatedLength	TokenNameIdentifier	 create Live Animated Length
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_START_OFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  START  OFFSET  ATTRIBUTE
,	TokenNameCOMMA	
SVG_TEXT_PATH_START_OFFSET_DEFAULT_VALUE	TokenNameIdentifier	 SVG  TEXT  PATH  START  OFFSET  DEFAULT  VALUE
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
OTHER_LENGTH	TokenNameIdentifier	 OTHER  LENGTH
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
createLiveAnimatedString	TokenNameIdentifier	 create Live Animated String
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
XLINK_HREF_ATTRIBUTE	TokenNameIdentifier	 XLINK  HREF  ATTRIBUTE
)	TokenNameRPAREN	
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
SVG_TEXT_PATH_TAG	TokenNameIdentifier	 SVG  TEXT  PATH  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTextPathElement#getStartOffset()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTextPathElement#getStartOffset()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTextPathElement#getMethod()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTextPathElement#getMethod()}. 
public	TokenNamepublic	
SVGAnimatedEnumeration	TokenNameIdentifier	 SVG Animated Enumeration
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTextPathElement#getSpacing()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTextPathElement#getSpacing()}. 
public	TokenNamepublic	
SVGAnimatedEnumeration	TokenNameIdentifier	 SVG Animated Enumeration
getSpacing	TokenNameIdentifier	 get Spacing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
spacing	TokenNameIdentifier	 spacing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XLink support ////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	XLink support ////////////////////////////////////////////////////// 
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGURIReference#getHref()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGURIReference#getHref()}. 
public	TokenNamepublic	
SVGAnimatedString	TokenNameIdentifier	 SVG Animated String
getHref	TokenNameIdentifier	 get Href
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
href	TokenNameIdentifier	 href
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
attributeInitializer	TokenNameIdentifier	 attribute Initializer
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
SVGOMTextPathElement	TokenNameIdentifier	 SVGOM Text Path Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the table of TraitInformation objects for this element. */	TokenNameCOMMENT_JAVADOC	 Returns the table of TraitInformation objects for this element. 
protected	TokenNameprotected	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
getTraitInformationTable	TokenNameIdentifier	 get Trait Information Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
