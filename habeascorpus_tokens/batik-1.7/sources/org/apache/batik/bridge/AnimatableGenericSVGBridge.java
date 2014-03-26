/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
AffineTransform	TokenNameIdentifier	 Affine Transform
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
CSSEngineEvent	TokenNameIdentifier	 CSS Engine Event
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
AnimatedLiveAttributeValue	TokenNameIdentifier	 Animated Live Attribute Value
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
SVGContext	TokenNameIdentifier	 SVG Context
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
SVGOMElement	TokenNameIdentifier	 SVGOM Element
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
events	TokenNameIdentifier	 events
.	TokenNameDOT	
MutationEvent	TokenNameIdentifier	 Mutation Event
;	TokenNameSEMICOLON	
/** * Abstract bridge class for animatable elements that do not produce * a GraphicsNode. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatableGenericSVGBridge.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Abstract bridge class for animatable elements that do not produce a GraphicsNode. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatableGenericSVGBridge.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AnimatableGenericSVGBridge	TokenNameIdentifier	 Animatable Generic SVG Bridge
extends	TokenNameextends	
AnimatableSVGBridge	TokenNameIdentifier	 Animatable SVG Bridge
implements	TokenNameimplements	
GenericBridge	TokenNameIdentifier	 Generic Bridge
,	TokenNameCOMMA	
BridgeUpdateHandler	TokenNameIdentifier	 Bridge Update Handler
,	TokenNameCOMMA	
SVGContext	TokenNameIdentifier	 SVG Context
{	TokenNameLBRACE	
/** * Invoked to handle an <tt>Element</tt> for a given <tt>BridgeContext</tt>. * For example, see the <tt>SVGTitleElementBridge</tt>. * * @param ctx the bridge context to use * @param e the element being handled */	TokenNameCOMMENT_JAVADOC	 Invoked to handle an <tt>Element</tt> for a given <tt>BridgeContext</tt>. For example, see the <tt>SVGTitleElementBridge</tt>. * @param ctx the bridge context to use @param e the element being handled 
public	TokenNamepublic	
void	TokenNamevoid	
handleElement	TokenNameIdentifier	 handle Element
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
isDynamic	TokenNameIdentifier	 is Dynamic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
setSVGContext	TokenNameIdentifier	 set SVG Context
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// SVGContext //////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	SVGContext //////////////////////////////////////////////////////////// 
/** * Returns the size of a px CSS unit in millimeters. */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. 
public	TokenNamepublic	
float	TokenNamefloat	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the size of a px CSS unit in millimeters. * This will be removed after next release. * @see #getPixelUnitToMillimeter() */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. This will be removed after next release. @see #getPixelUnitToMillimeter() 
public	TokenNamepublic	
float	TokenNamefloat	
getPixelToMM	TokenNameIdentifier	 get Pixel To MM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the tight bounding box in current user space (i.e., * after application of the transform attribute, if any) on the * geometry of all contained graphics elements, exclusive of * stroke-width and filter effects). */	TokenNameCOMMENT_JAVADOC	 Returns the tight bounding box in current user space (i.e., after application of the transform attribute, if any) on the geometry of all contained graphics elements, exclusive of stroke-width and filter effects). 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBBox	TokenNameIdentifier	 get B Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the transform from the global transform space to pixels. */	TokenNameCOMMENT_JAVADOC	 Returns the transform from the global transform space to pixels. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getScreenTransform	TokenNameIdentifier	 get Screen Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the transform to be used from the global transform space to pixels. */	TokenNameCOMMENT_JAVADOC	 Sets the transform to be used from the global transform space to pixels. 
public	TokenNamepublic	
void	TokenNamevoid	
setScreenTransform	TokenNameIdentifier	 set Screen Transform
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the transformation matrix from current user units * (i.e., after application of the transform attribute, if any) to * the viewport coordinate system for the nearestViewportElement. */	TokenNameCOMMENT_JAVADOC	 Returns the transformation matrix from current user units (i.e., after application of the transform attribute, if any) to the viewport coordinate system for the nearestViewportElement. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getCTM	TokenNameIdentifier	 get CTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the global transformation matrix from the current * element to the root. */	TokenNameCOMMENT_JAVADOC	 Returns the global transformation matrix from the current element to the root. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getGlobalTransform	TokenNameIdentifier	 get Global Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the width of the viewport which directly contains the * associated element. */	TokenNameCOMMENT_JAVADOC	 Returns the width of the viewport which directly contains the associated element. 
public	TokenNamepublic	
float	TokenNamefloat	
getViewportWidth	TokenNameIdentifier	 get Viewport Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the height of the viewport which directly contains the * associated element. */	TokenNameCOMMENT_JAVADOC	 Returns the height of the viewport which directly contains the associated element. 
public	TokenNamepublic	
float	TokenNamefloat	
getViewportHeight	TokenNameIdentifier	 get Viewport Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the font-size on the associated element. */	TokenNameCOMMENT_JAVADOC	 Returns the font-size on the associated element. 
public	TokenNamepublic	
float	TokenNamefloat	
getFontSize	TokenNameIdentifier	 get Font Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// BridgeUpdateHandler /////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	BridgeUpdateHandler /////////////////////////////////////////////////// 
public	TokenNamepublic	
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
setSVGContext	TokenNameIdentifier	 set SVG Context
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleDOMNodeInsertedEvent	TokenNameIdentifier	 handle DOM Node Inserted Event
(	TokenNameLPAREN	
MutationEvent	TokenNameIdentifier	 Mutation Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleDOMCharacterDataModified	TokenNameIdentifier	 handle DOM Character Data Modified
(	TokenNameLPAREN	
MutationEvent	TokenNameIdentifier	 Mutation Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleDOMNodeRemovedEvent	TokenNameIdentifier	 handle DOM Node Removed Event
(	TokenNameLPAREN	
MutationEvent	TokenNameIdentifier	 Mutation Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleDOMAttrModifiedEvent	TokenNameIdentifier	 handle DOM Attr Modified Event
(	TokenNameLPAREN	
MutationEvent	TokenNameIdentifier	 Mutation Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleCSSEngineEvent	TokenNameIdentifier	 handle CSS Engine Event
(	TokenNameLPAREN	
CSSEngineEvent	TokenNameIdentifier	 CSS Engine Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleAnimatedAttributeChanged	TokenNameIdentifier	 handle Animated Attribute Changed
(	TokenNameLPAREN	
AnimatedLiveAttributeValue	TokenNameIdentifier	 Animated Live Attribute Value
alav	TokenNameIdentifier	 alav
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOtherAnimationChanged	TokenNameIdentifier	 handle Other Animation Changed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
