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
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
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
SVGFESpecularLightingElement	TokenNameIdentifier	 SVGFE Specular Lighting Element
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGFESpecularLightingElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMFESpecularLightingElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGFESpecularLightingElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMFESpecularLightingElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMFESpecularLightingElement	TokenNameIdentifier	 SVGOMFE Specular Lighting Element
extends	TokenNameextends	
SVGOMFilterPrimitiveStandardAttributes	TokenNameIdentifier	 SVGOM Filter Primitive Standard Attributes
implements	TokenNameimplements	
SVGFESpecularLightingElement	TokenNameIdentifier	 SVGFE Specular Lighting Element
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
SVGOMFilterPrimitiveStandardAttributes	TokenNameIdentifier	 SVGOM Filter Primitive Standard Attributes
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
SVG_IN_ATTRIBUTE	TokenNameIdentifier	 SVG  IN  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_CDATA	TokenNameIdentifier	 TYPE  CDATA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SURFACE_SCALE_ATTRIBUTE	TokenNameIdentifier	 SVG  SURFACE  SCALE  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_NUMBER	TokenNameIdentifier	 TYPE  NUMBER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SPECULAR_CONSTANT_ATTRIBUTE	TokenNameIdentifier	 SVG  SPECULAR  CONSTANT  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_NUMBER	TokenNameIdentifier	 TYPE  NUMBER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SPECULAR_EXPONENT_ATTRIBUTE	TokenNameIdentifier	 SVG  SPECULAR  EXPONENT  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_NUMBER	TokenNameIdentifier	 TYPE  NUMBER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The 'in' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'in' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedString	TokenNameIdentifier	 SVGOM Animated String
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
/** * The 'surfaceScale' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'surfaceScale' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
/** * The 'specularConstant' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'specularConstant' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
specularConstant	TokenNameIdentifier	 specular Constant
;	TokenNameSEMICOLON	
/** * The 'specularExponent' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'specularExponent' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
specularExponent	TokenNameIdentifier	 specular Exponent
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMFESpecularLightingElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFESpecularLightingElement object. 
protected	TokenNameprotected	
SVGOMFESpecularLightingElement	TokenNameIdentifier	 SVGOMFE Specular Lighting Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMFESpecularLightingElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFESpecularLightingElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMFESpecularLightingElement	TokenNameIdentifier	 SVGOMFE Specular Lighting Element
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
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
createLiveAnimatedString	TokenNameIdentifier	 create Live Animated String
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_IN_ATTRIBUTE	TokenNameIdentifier	 SVG  IN  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
surfaceScale	TokenNameIdentifier	 surface Scale
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SURFACE_SCALE_ATTRIBUTE	TokenNameIdentifier	 SVG  SURFACE  SCALE  ATTRIBUTE
,	TokenNameCOMMA	
1f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
specularConstant	TokenNameIdentifier	 specular Constant
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SPECULAR_CONSTANT_ATTRIBUTE	TokenNameIdentifier	 SVG  SPECULAR  CONSTANT  ATTRIBUTE
,	TokenNameCOMMA	
1f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
specularExponent	TokenNameIdentifier	 specular Exponent
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_SPECULAR_EXPONENT_ATTRIBUTE	TokenNameIdentifier	 SVG  SPECULAR  EXPONENT  ATTRIBUTE
,	TokenNameCOMMA	
1f	TokenNameFloatingPointLiteral	
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
SVG_FE_SPECULAR_LIGHTING_TAG	TokenNameIdentifier	 SVG  FE  SPECULAR  LIGHTING  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFESpecularLightingElement#getIn1()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFESpecularLightingElement#getIn1()}. 
public	TokenNamepublic	
SVGAnimatedString	TokenNameIdentifier	 SVG Animated String
getIn1	TokenNameIdentifier	 get In1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGFESpecularLightingElement#getSurfaceScale()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFESpecularLightingElement#getSurfaceScale()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getSurfaceScale	TokenNameIdentifier	 get Surface Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
surfaceScale	TokenNameIdentifier	 surface Scale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGFESpecularLightingElement#getSpecularConstant()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFESpecularLightingElement#getSpecularConstant()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getSpecularConstant	TokenNameIdentifier	 get Specular Constant
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
specularConstant	TokenNameIdentifier	 specular Constant
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGFESpecularLightingElement#getSpecularExponent()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFESpecularLightingElement#getSpecularExponent()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getSpecularExponent	TokenNameIdentifier	 get Specular Exponent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
specularExponent	TokenNameIdentifier	 specular Exponent
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
SVGOMFESpecularLightingElement	TokenNameIdentifier	 SVGOMFE Specular Lighting Element
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
