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
SVGAnimatedBoolean	TokenNameIdentifier	 SVG Animated Boolean
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
SVGAnimatedPreserveAspectRatio	TokenNameIdentifier	 SVG Animated Preserve Aspect Ratio
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
SVGAnimatedRect	TokenNameIdentifier	 SVG Animated Rect
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
SVGStringList	TokenNameIdentifier	 SVG String List
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
SVGViewElement	TokenNameIdentifier	 SVG View Element
;	TokenNameSEMICOLON	
/** * This class implements {@link org.w3c.dom.svg.SVGViewElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMViewElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link org.w3c.dom.svg.SVGViewElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMViewElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMViewElement	TokenNameIdentifier	 SVGOM View Element
extends	TokenNameextends	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
implements	TokenNameimplements	
SVGViewElement	TokenNameIdentifier	 SVG View Element
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
SVGOMElement	TokenNameIdentifier	 SVGOM Element
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
SVG_PRESERVE_ASPECT_RATIO_ATTRIBUTE	TokenNameIdentifier	 SVG  PRESERVE  ASPECT  RATIO  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_PRESERVE_ASPECT_RATIO_VALUE	TokenNameIdentifier	 TYPE  PRESERVE  ASPECT  RATIO  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_VIEW_BOX_ATTRIBUTE	TokenNameIdentifier	 SVG  VIEW  BOX  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_NUMBER_LIST	TokenNameIdentifier	 TYPE  NUMBER  LIST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_EXTERNAL_RESOURCES_REQUIRED_ATTRIBUTE	TokenNameIdentifier	 SVG  EXTERNAL  RESOURCES  REQUIRED  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_BOOLEAN	TokenNameIdentifier	 TYPE  BOOLEAN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// t.put(null, SVG_VIEW_TARGET_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_VIEW_TARGET_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_ZOOM_AND_PAN_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_ZOOM_AND_PAN_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_IDENT)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_IDENT)); 
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
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_PRESERVE_ASPECT_RATIO_ATTRIBUTE	TokenNameIdentifier	 SVG  PRESERVE  ASPECT  RATIO  ATTRIBUTE
,	TokenNameCOMMA	
"xMidYMid meet"	TokenNameStringLiteral	xMidYMid meet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ZOOM_AND_PAN_ATTRIBUTE	TokenNameIdentifier	 SVG  ZOOM  AND  PAN  ATTRIBUTE
,	TokenNameCOMMA	
SVG_MAGNIFY_VALUE	TokenNameIdentifier	 SVG  MAGNIFY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The 'externalResourcesRequired' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'externalResourcesRequired' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedBoolean	TokenNameIdentifier	 SVGOM Animated Boolean
externalResourcesRequired	TokenNameIdentifier	 external Resources Required
;	TokenNameSEMICOLON	
/** * The 'preserveAspectRatio' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'preserveAspectRatio' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedPreserveAspectRatio	TokenNameIdentifier	 SVGOM Animated Preserve Aspect Ratio
preserveAspectRatio	TokenNameIdentifier	 preserve Aspect Ratio
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMViewElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMViewElement object. 
protected	TokenNameprotected	
SVGOMViewElement	TokenNameIdentifier	 SVGOM View Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMSVGElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMSVGElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMViewElement	TokenNameIdentifier	 SVGOM View Element
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
externalResourcesRequired	TokenNameIdentifier	 external Resources Required
=	TokenNameEQUAL	
createLiveAnimatedBoolean	TokenNameIdentifier	 create Live Animated Boolean
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_EXTERNAL_RESOURCES_REQUIRED_ATTRIBUTE	TokenNameIdentifier	 SVG  EXTERNAL  RESOURCES  REQUIRED  ATTRIBUTE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preserveAspectRatio	TokenNameIdentifier	 preserve Aspect Ratio
=	TokenNameEQUAL	
createLiveAnimatedPreserveAspectRatio	TokenNameIdentifier	 create Live Animated Preserve Aspect Ratio
(	TokenNameLPAREN	
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
SVG_VIEW_TAG	TokenNameIdentifier	 SVG  VIEW  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGViewElement#getViewTarget()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGViewElement#getViewTarget()}. 
public	TokenNamepublic	
SVGStringList	TokenNameIdentifier	 SVG String List
getViewTarget	TokenNameIdentifier	 get View Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGViewElement.getViewTarget is not implemented"	TokenNameStringLiteral	SVGViewElement.getViewTarget is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
// SVGZoomAndPan support /////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	SVGZoomAndPan support /////////////////////////////////////////////// 
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGZoomAndPan#getZoomAndPan()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGZoomAndPan#getZoomAndPan()}. 
public	TokenNamepublic	
short	TokenNameshort	
getZoomAndPan	TokenNameIdentifier	 get Zoom And Pan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGZoomAndPanSupport	TokenNameIdentifier	 SVG Zoom And Pan Support
.	TokenNameDOT	
getZoomAndPan	TokenNameIdentifier	 get Zoom And Pan
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGZoomAndPan#getZoomAndPan()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGZoomAndPan#getZoomAndPan()}. 
public	TokenNamepublic	
void	TokenNamevoid	
setZoomAndPan	TokenNameIdentifier	 set Zoom And Pan
(	TokenNameLPAREN	
short	TokenNameshort	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGZoomAndPanSupport	TokenNameIdentifier	 SVG Zoom And Pan Support
.	TokenNameDOT	
setZoomAndPan	TokenNameIdentifier	 set Zoom And Pan
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// SVGFitToViewBox support //////////////////////////////////////////// 	TokenNameCOMMENT_LINE	SVGFitToViewBox support //////////////////////////////////////////// 
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGFitToViewBox#getViewBox()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGFitToViewBox#getViewBox()}. 
public	TokenNamepublic	
SVGAnimatedRect	TokenNameIdentifier	 SVG Animated Rect
getViewBox	TokenNameIdentifier	 get View Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGFitToViewBox.getViewBox is not implemented"	TokenNameStringLiteral	SVGFitToViewBox.getViewBox is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGFitToViewBox#getPreserveAspectRatio()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGFitToViewBox#getPreserveAspectRatio()}. 
public	TokenNamepublic	
SVGAnimatedPreserveAspectRatio	TokenNameIdentifier	 SVG Animated Preserve Aspect Ratio
getPreserveAspectRatio	TokenNameIdentifier	 get Preserve Aspect Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
preserveAspectRatio	TokenNameIdentifier	 preserve Aspect Ratio
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// SVGExternalResourcesRequired support ///////////////////////////// 	TokenNameCOMMENT_LINE	SVGExternalResourcesRequired support ///////////////////////////// 
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGExternalResourcesRequired#getExternalResourcesRequired()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGExternalResourcesRequired#getExternalResourcesRequired()}. 
public	TokenNamepublic	
SVGAnimatedBoolean	TokenNameIdentifier	 SVG Animated Boolean
getExternalResourcesRequired	TokenNameIdentifier	 get External Resources Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
externalResourcesRequired	TokenNameIdentifier	 external Resources Required
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
SVGOMViewElement	TokenNameIdentifier	 SVGOM View Element
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
