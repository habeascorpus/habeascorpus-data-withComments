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
SVGCircleElement	TokenNameIdentifier	 SVG Circle Element
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGCircleElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMCircleElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGCircleElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMCircleElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMCircleElement	TokenNameIdentifier	 SVGOM Circle Element
extends	TokenNameextends	
SVGGraphicsElement	TokenNameIdentifier	 SVG Graphics Element
implements	TokenNameimplements	
SVGCircleElement	TokenNameIdentifier	 SVG Circle Element
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
SVG_CX_ATTRIBUTE	TokenNameIdentifier	 SVG  CX  ATTRIBUTE
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
TraitInformation	TokenNameIdentifier	 Trait Information
.	TokenNameDOT	
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
SVG_CY_ATTRIBUTE	TokenNameIdentifier	 SVG  CY  ATTRIBUTE
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
TraitInformation	TokenNameIdentifier	 Trait Information
.	TokenNameDOT	
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
SVG_R_ATTRIBUTE	TokenNameIdentifier	 SVG  R  ATTRIBUTE
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
TraitInformation	TokenNameIdentifier	 Trait Information
.	TokenNameDOT	
PERCENTAGE_VIEWPORT_SIZE	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  SIZE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The 'cx' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'cx' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
cx	TokenNameIdentifier	 cx
;	TokenNameSEMICOLON	
/** * The 'cy' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'cy' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
cy	TokenNameIdentifier	 cy
;	TokenNameSEMICOLON	
/** * The 'r' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'r' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMCircleElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMCircleElement object. 
protected	TokenNameprotected	
SVGOMCircleElement	TokenNameIdentifier	 SVGOM Circle Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMCircleElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMCircleElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMCircleElement	TokenNameIdentifier	 SVGOM Circle Element
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
cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
createLiveAnimatedLength	TokenNameIdentifier	 create Live Animated Length
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_CX_ATTRIBUTE	TokenNameIdentifier	 SVG  CX  ATTRIBUTE
,	TokenNameCOMMA	
SVG_CIRCLE_CX_DEFAULT_VALUE	TokenNameIdentifier	 SVG  CIRCLE  CX  DEFAULT  VALUE
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
HORIZONTAL_LENGTH	TokenNameIdentifier	 HORIZONTAL  LENGTH
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cy	TokenNameIdentifier	 cy
=	TokenNameEQUAL	
createLiveAnimatedLength	TokenNameIdentifier	 create Live Animated Length
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_CY_ATTRIBUTE	TokenNameIdentifier	 SVG  CY  ATTRIBUTE
,	TokenNameCOMMA	
SVG_CIRCLE_CY_DEFAULT_VALUE	TokenNameIdentifier	 SVG  CIRCLE  CY  DEFAULT  VALUE
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
VERTICAL_LENGTH	TokenNameIdentifier	 VERTICAL  LENGTH
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
createLiveAnimatedLength	TokenNameIdentifier	 create Live Animated Length
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_R_ATTRIBUTE	TokenNameIdentifier	 SVG  R  ATTRIBUTE
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
OTHER_LENGTH	TokenNameIdentifier	 OTHER  LENGTH
,	TokenNameCOMMA	
true	TokenNametrue	
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
SVG_CIRCLE_TAG	TokenNameIdentifier	 SVG  CIRCLE  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGCircleElement#getCx()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGCircleElement#getCx()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getCx	TokenNameIdentifier	 get Cx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cx	TokenNameIdentifier	 cx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGCircleElement#getCy()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGCircleElement#getCy()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getCy	TokenNameIdentifier	 get Cy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cy	TokenNameIdentifier	 cy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGCircleElement#getR()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGCircleElement#getR()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getR	TokenNameIdentifier	 get R
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
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
SVGOMCircleElement	TokenNameIdentifier	 SVGOM Circle Element
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
