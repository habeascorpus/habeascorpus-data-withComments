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
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
AnimatableValue	TokenNameIdentifier	 Animatable Value
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
Attr	TokenNameIdentifier	 Attr
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
SVGRectElement	TokenNameIdentifier	 SVG Rect Element
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGRectElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMRectElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGRectElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMRectElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMRectElement	TokenNameIdentifier	 SVGOM Rect Element
extends	TokenNameextends	
SVGGraphicsElement	TokenNameIdentifier	 SVG Graphics Element
implements	TokenNameimplements	
SVGRectElement	TokenNameIdentifier	 SVG Rect Element
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
SVGGraphicsElement	TokenNameIdentifier	 SVG Graphics Element
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
SVG_X_ATTRIBUTE	TokenNameIdentifier	 SVG  X  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_LENGTH	TokenNameIdentifier	 TYPE  LENGTH
,	TokenNameCOMMA	
PERCENTAGE_VIEWPORT_WIDTH	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  WIDTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  Y  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_LENGTH	TokenNameIdentifier	 TYPE  LENGTH
,	TokenNameCOMMA	
PERCENTAGE_VIEWPORT_HEIGHT	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  HEIGHT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RX_ATTRIBUTE	TokenNameIdentifier	 SVG  RX  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_LENGTH	TokenNameIdentifier	 TYPE  LENGTH
,	TokenNameCOMMA	
PERCENTAGE_VIEWPORT_WIDTH	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  WIDTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RY_ATTRIBUTE	TokenNameIdentifier	 SVG  RY  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_LENGTH	TokenNameIdentifier	 TYPE  LENGTH
,	TokenNameCOMMA	
PERCENTAGE_VIEWPORT_HEIGHT	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  HEIGHT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  WIDTH  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_LENGTH	TokenNameIdentifier	 TYPE  LENGTH
,	TokenNameCOMMA	
PERCENTAGE_VIEWPORT_WIDTH	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  WIDTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  HEIGHT  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_LENGTH	TokenNameIdentifier	 TYPE  LENGTH
,	TokenNameCOMMA	
PERCENTAGE_VIEWPORT_HEIGHT	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  HEIGHT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The 'x' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'x' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
/** * The 'y' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'y' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
/** * The 'rx' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'rx' attribute value. 
protected	TokenNameprotected	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
rx	TokenNameIdentifier	 rx
;	TokenNameSEMICOLON	
/** * The 'ry' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'ry' attribute value. 
protected	TokenNameprotected	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
ry	TokenNameIdentifier	 ry
;	TokenNameSEMICOLON	
/** * The 'width' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'width' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
/** * The 'height' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'height' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMRectElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMRectElement object. 
protected	TokenNameprotected	
SVGOMRectElement	TokenNameIdentifier	 SVGOM Rect Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMRectElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMRectElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMRectElement	TokenNameIdentifier	 SVGOM Rect Element
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
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
createLiveAnimatedLength	TokenNameIdentifier	 create Live Animated Length
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X_ATTRIBUTE	TokenNameIdentifier	 SVG  X  ATTRIBUTE
,	TokenNameCOMMA	
SVG_RECT_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  RECT  X  DEFAULT  VALUE
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
HORIZONTAL_LENGTH	TokenNameIdentifier	 HORIZONTAL  LENGTH
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
createLiveAnimatedLength	TokenNameIdentifier	 create Live Animated Length
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  Y  ATTRIBUTE
,	TokenNameCOMMA	
SVG_RECT_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  RECT  Y  DEFAULT  VALUE
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
VERTICAL_LENGTH	TokenNameIdentifier	 VERTICAL  LENGTH
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
createLiveAnimatedLength	TokenNameIdentifier	 create Live Animated Length
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  WIDTH  ATTRIBUTE
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
HORIZONTAL_LENGTH	TokenNameIdentifier	 HORIZONTAL  LENGTH
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
createLiveAnimatedLength	TokenNameIdentifier	 create Live Animated Length
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  HEIGHT  ATTRIBUTE
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
VERTICAL_LENGTH	TokenNameIdentifier	 VERTICAL  LENGTH
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rx	TokenNameIdentifier	 rx
=	TokenNameEQUAL	
new	TokenNamenew	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RX_ATTRIBUTE	TokenNameIdentifier	 SVG  RX  ATTRIBUTE
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
HORIZONTAL_LENGTH	TokenNameIdentifier	 HORIZONTAL  LENGTH
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getDefaultValue	TokenNameIdentifier	 get Default Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RY_ATTRIBUTE	TokenNameIdentifier	 SVG  RY  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
attrChanged	TokenNameIdentifier	 attr Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
attrChanged	TokenNameIdentifier	 attr Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
ry	TokenNameIdentifier	 ry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
getRy	TokenNameIdentifier	 get Ry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
ry	TokenNameIdentifier	 ry
.	TokenNameDOT	
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ry	TokenNameIdentifier	 ry
.	TokenNameDOT	
attrChanged	TokenNameIdentifier	 attr Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
ry	TokenNameIdentifier	 ry
=	TokenNameEQUAL	
new	TokenNamenew	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RY_ATTRIBUTE	TokenNameIdentifier	 SVG  RY  ATTRIBUTE
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
VERTICAL_LENGTH	TokenNameIdentifier	 VERTICAL  LENGTH
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getDefaultValue	TokenNameIdentifier	 get Default Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RX_ATTRIBUTE	TokenNameIdentifier	 SVG  RX  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
attrChanged	TokenNameIdentifier	 attr Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
attrChanged	TokenNameIdentifier	 attr Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
rx	TokenNameIdentifier	 rx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
getRx	TokenNameIdentifier	 get Rx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
rx	TokenNameIdentifier	 rx
.	TokenNameDOT	
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rx	TokenNameIdentifier	 rx
.	TokenNameDOT	
attrChanged	TokenNameIdentifier	 attr Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
liveAttributeValues	TokenNameIdentifier	 live Attribute Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RX_ATTRIBUTE	TokenNameIdentifier	 SVG  RX  ATTRIBUTE
,	TokenNameCOMMA	
rx	TokenNameIdentifier	 rx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
liveAttributeValues	TokenNameIdentifier	 live Attribute Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RY_ATTRIBUTE	TokenNameIdentifier	 SVG  RY  ATTRIBUTE
,	TokenNameCOMMA	
ry	TokenNameIdentifier	 ry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AnimatedAttributeListener	TokenNameIdentifier	 Animated Attribute Listener
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
)	TokenNameRPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
)	TokenNameRPAREN	
.	TokenNameDOT	
getAnimatedAttributeListener	TokenNameIdentifier	 get Animated Attribute Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rx	TokenNameIdentifier	 rx
.	TokenNameDOT	
addAnimatedAttributeListener	TokenNameIdentifier	 add Animated Attribute Listener
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ry	TokenNameIdentifier	 ry
.	TokenNameDOT	
addAnimatedAttributeListener	TokenNameIdentifier	 add Animated Attribute Listener
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
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
SVG_RECT_TAG	TokenNameIdentifier	 SVG  RECT  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRectElement#getX()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRectElement#getX()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRectElement#getY()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRectElement#getY()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRectElement#getWidth()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRectElement#getWidth()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRectElement#getHeight()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRectElement#getHeight()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRectElement#getRx()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRectElement#getRx()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getRx	TokenNameIdentifier	 get Rx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rx	TokenNameIdentifier	 rx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRectElement#getRy()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRectElement#getRy()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getRy	TokenNameIdentifier	 get Ry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ry	TokenNameIdentifier	 ry
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
SVGOMRectElement	TokenNameIdentifier	 SVGOM Rect Element
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
// AnimationTarget /////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	AnimationTarget /////////////////////////////////////////////////////// 
/** * Updates an attribute value in this target. */	TokenNameCOMMENT_JAVADOC	 Updates an attribute value in this target. 
public	TokenNamepublic	
void	TokenNamevoid	
updateAttributeValue	TokenNameIdentifier	 update Attribute Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
,	TokenNameCOMMA	
AnimatableValue	TokenNameIdentifier	 Animatable Value
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_RX_ATTRIBUTE	TokenNameIdentifier	 SVG  RX  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
updateAttributeValue	TokenNameIdentifier	 update Attribute Value
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
ln	TokenNameIdentifier	 ln
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
ry	TokenNameIdentifier	 ry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
getRy	TokenNameIdentifier	 get Ry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ry	TokenNameIdentifier	 ry
.	TokenNameDOT	
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
updateAttributeValue	TokenNameIdentifier	 update Attribute Value
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
SVG_RY_ATTRIBUTE	TokenNameIdentifier	 SVG  RY  ATTRIBUTE
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_RY_ATTRIBUTE	TokenNameIdentifier	 SVG  RY  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
updateAttributeValue	TokenNameIdentifier	 update Attribute Value
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
ln	TokenNameIdentifier	 ln
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
rx	TokenNameIdentifier	 rx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGAnimatedLength	TokenNameIdentifier	 Abstract SVG Animated Length
)	TokenNameRPAREN	
getRx	TokenNameIdentifier	 get Rx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
rx	TokenNameIdentifier	 rx
.	TokenNameDOT	
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
updateAttributeValue	TokenNameIdentifier	 update Attribute Value
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
SVG_RX_ATTRIBUTE	TokenNameIdentifier	 SVG  RX  ATTRIBUTE
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
updateAttributeValue	TokenNameIdentifier	 update Attribute Value
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
ln	TokenNameIdentifier	 ln
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
