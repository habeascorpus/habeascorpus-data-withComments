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
SVGFESpotLightElement	TokenNameIdentifier	 SVGFE Spot Light Element
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGFESpotLightElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMFESpotLightElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGFESpotLightElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMFESpotLightElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMFESpotLightElement	TokenNameIdentifier	 SVGOMFE Spot Light Element
extends	TokenNameextends	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
implements	TokenNameimplements	
SVGFESpotLightElement	TokenNameIdentifier	 SVGFE Spot Light Element
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
SVG_X_ATTRIBUTE	TokenNameIdentifier	 SVG  X  ATTRIBUTE
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
SVG_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  Y  ATTRIBUTE
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
SVG_Z_ATTRIBUTE	TokenNameIdentifier	 SVG  Z  ATTRIBUTE
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
SVG_POINTS_AT_X_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  AT  X  ATTRIBUTE
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
SVG_POINTS_AT_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  AT  Y  ATTRIBUTE
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
SVG_POINTS_AT_Z_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  AT  Z  ATTRIBUTE
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
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_LIMITING_CONE_ANGLE_ATTRIBUTE	TokenNameIdentifier	 SVG  LIMITING  CONE  ANGLE  ATTRIBUTE
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
/** * The 'x' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'x' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
/** * The 'y' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'y' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
/** * The 'z' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'z' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
z	TokenNameIdentifier	 z
;	TokenNameSEMICOLON	
/** * The 'pointsAtX' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'pointsAtX' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
pointsAtX	TokenNameIdentifier	 points At X
;	TokenNameSEMICOLON	
/** * The 'pointsAtY' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'pointsAtY' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
pointsAtY	TokenNameIdentifier	 points At Y
;	TokenNameSEMICOLON	
/** * The 'pointsAtZ' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'pointsAtZ' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
pointsAtZ	TokenNameIdentifier	 points At Z
;	TokenNameSEMICOLON	
/** * The 'specularExponent' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'specularExponent' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
specularExponent	TokenNameIdentifier	 specular Exponent
;	TokenNameSEMICOLON	
/** * The 'limitingConeAngle' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'limitingConeAngle' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
limitingConeAngle	TokenNameIdentifier	 limiting Cone Angle
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMFESpotLightElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFESpotLightElement object. 
protected	TokenNameprotected	
SVGOMFESpotLightElement	TokenNameIdentifier	 SVGOMFE Spot Light Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMFESpotLightElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFESpotLightElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMFESpotLightElement	TokenNameIdentifier	 SVGOMFE Spot Light Element
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
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X_ATTRIBUTE	TokenNameIdentifier	 SVG  X  ATTRIBUTE
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  Y  ATTRIBUTE
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Z_ATTRIBUTE	TokenNameIdentifier	 SVG  Z  ATTRIBUTE
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pointsAtX	TokenNameIdentifier	 points At X
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_POINTS_AT_X_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  AT  X  ATTRIBUTE
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pointsAtY	TokenNameIdentifier	 points At Y
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_POINTS_AT_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  AT  Y  ATTRIBUTE
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pointsAtZ	TokenNameIdentifier	 points At Z
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_POINTS_AT_Z_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  AT  Z  ATTRIBUTE
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
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
limitingConeAngle	TokenNameIdentifier	 limiting Cone Angle
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_LIMITING_CONE_ANGLE_ATTRIBUTE	TokenNameIdentifier	 SVG  LIMITING  CONE  ANGLE  ATTRIBUTE
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
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
SVG_FE_SPOT_LIGHT_TAG	TokenNameIdentifier	 SVG  FE  SPOT  LIGHT  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFESpotLightElement#getX()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFESpotLightElement#getX()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFESpotLightElement#getY()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFESpotLightElement#getY()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFESpotLightElement#getZ()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFESpotLightElement#getZ()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getZ	TokenNameIdentifier	 get Z
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
z	TokenNameIdentifier	 z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFESpotLightElement#getPointsAtX()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFESpotLightElement#getPointsAtX()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getPointsAtX	TokenNameIdentifier	 get Points At X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pointsAtX	TokenNameIdentifier	 points At X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFESpotLightElement#getPointsAtY()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFESpotLightElement#getPointsAtY()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getPointsAtY	TokenNameIdentifier	 get Points At Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pointsAtY	TokenNameIdentifier	 points At Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFESpotLightElement#getPointsAtZ()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFESpotLightElement#getPointsAtZ()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getPointsAtZ	TokenNameIdentifier	 get Points At Z
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pointsAtZ	TokenNameIdentifier	 points At Z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGFESpotLightElement#getSpecularExponent()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFESpotLightElement#getSpecularExponent()}. 
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
/** * <b>DOM</b>: Implements {@link * SVGFESpotLightElement#getLimitingConeAngle()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFESpotLightElement#getLimitingConeAngle()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getLimitingConeAngle	TokenNameIdentifier	 get Limiting Cone Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
limitingConeAngle	TokenNameIdentifier	 limiting Cone Angle
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
SVGOMFESpotLightElement	TokenNameIdentifier	 SVGOMFE Spot Light Element
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
