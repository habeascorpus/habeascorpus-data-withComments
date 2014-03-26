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
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AnimationTarget	TokenNameIdentifier	 Animation Target
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
SVGConstants	TokenNameIdentifier	 SVG Constants
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
DOMException	TokenNameIdentifier	 DOM Exception
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
SVGAnimatedAngle	TokenNameIdentifier	 SVG Animated Angle
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
SVGAngle	TokenNameIdentifier	 SVG Angle
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
SVGMarkerElement	TokenNameIdentifier	 SVG Marker Element
;	TokenNameSEMICOLON	
/** * A class that handles an {@link SVGAnimatedAngle} and an * {@link SVGAnimatedEnumeration} for the 'marker' element's * 'orient' attribute. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVGOMAnimatedMarkerOrientValue.java 591550 2007-11-03 04:46:27Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class that handles an {@link SVGAnimatedAngle} and an {@link SVGAnimatedEnumeration} for the 'marker' element's 'orient' attribute. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVGOMAnimatedMarkerOrientValue.java 591550 2007-11-03 04:46:27Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMAnimatedMarkerOrientValue	TokenNameIdentifier	 SVGOM Animated Marker Orient Value
extends	TokenNameextends	
AbstractSVGAnimatedValue	TokenNameIdentifier	 Abstract SVG Animated Value
{	TokenNameLBRACE	
/** * Whether the base value is valid. */	TokenNameCOMMENT_JAVADOC	 Whether the base value is valid. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
valid	TokenNameIdentifier	 valid
;	TokenNameSEMICOLON	
/** * The SVGAnimatedAngle. */	TokenNameCOMMENT_JAVADOC	 The SVGAnimatedAngle. 
protected	TokenNameprotected	
AnimatedAngle	TokenNameIdentifier	 Animated Angle
animatedAngle	TokenNameIdentifier	 animated Angle
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatedAngle	TokenNameIdentifier	 Animated Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The SVGAnimatedEnumeration. */	TokenNameCOMMENT_JAVADOC	 The SVGAnimatedEnumeration. 
protected	TokenNameprotected	
AnimatedEnumeration	TokenNameIdentifier	 Animated Enumeration
animatedEnumeration	TokenNameIdentifier	 animated Enumeration
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatedEnumeration	TokenNameIdentifier	 Animated Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The current base angle value. */	TokenNameCOMMENT_JAVADOC	 The current base angle value. 
protected	TokenNameprotected	
BaseSVGAngle	TokenNameIdentifier	 Base SVG Angle
baseAngleVal	TokenNameIdentifier	 base Angle Val
;	TokenNameSEMICOLON	
/** * The current base enumeration value. */	TokenNameCOMMENT_JAVADOC	 The current base enumeration value. 
protected	TokenNameprotected	
short	TokenNameshort	
baseEnumerationVal	TokenNameIdentifier	 base Enumeration Val
;	TokenNameSEMICOLON	
/** * The current animated angle value. */	TokenNameCOMMENT_JAVADOC	 The current animated angle value. 
protected	TokenNameprotected	
AnimSVGAngle	TokenNameIdentifier	 Anim SVG Angle
animAngleVal	TokenNameIdentifier	 anim Angle Val
;	TokenNameSEMICOLON	
/** * The current animated enumeration value. */	TokenNameCOMMENT_JAVADOC	 The current animated enumeration value. 
protected	TokenNameprotected	
short	TokenNameshort	
animEnumerationVal	TokenNameIdentifier	 anim Enumeration Val
;	TokenNameSEMICOLON	
/** * Whether the value is changing. */	TokenNameCOMMENT_JAVADOC	 Whether the value is changing. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
changing	TokenNameIdentifier	 changing
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMAnimatedMarkerOrientValue. * @param elt The associated element. * @param ns The attribute's namespace URI. * @param ln The attribute's local name. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMAnimatedMarkerOrientValue. @param elt The associated element. @param ns The attribute's namespace URI. @param ln The attribute's local name. 
public	TokenNamepublic	
SVGOMAnimatedMarkerOrientValue	TokenNameIdentifier	 SVGOM Animated Marker Orient Value
(	TokenNameLPAREN	
AbstractElement	TokenNameIdentifier	 Abstract Element
elt	TokenNameIdentifier	 elt
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
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Updates the animated value with the given {@link AnimatableValue}. */	TokenNameCOMMENT_JAVADOC	 Updates the animated value with the given {@link AnimatableValue}. 
protected	TokenNameprotected	
void	TokenNamevoid	
updateAnimatedValue	TokenNameIdentifier	 update Animated Value
(	TokenNameLPAREN	
AnimatableValue	TokenNameIdentifier	 Animatable Value
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XXX TODO 	TokenNameCOMMENT_LINE	XXX TODO 
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Animation of marker orient value is not implemented"	TokenNameStringLiteral	Animation of marker orient value is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the base value of the attribute as an {@link AnimatableValue}. */	TokenNameCOMMENT_JAVADOC	 Returns the base value of the attribute as an {@link AnimatableValue}. 
public	TokenNamepublic	
AnimatableValue	TokenNameIdentifier	 Animatable Value
getUnderlyingValue	TokenNameIdentifier	 get Underlying Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XXX TODO 	TokenNameCOMMENT_LINE	XXX TODO 
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Animation of marker orient value is not implemented"	TokenNameStringLiteral	Animation of marker orient value is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when an Attr node has been added. */	TokenNameCOMMENT_JAVADOC	 Called when an Attr node has been added. 
public	TokenNamepublic	
void	TokenNamevoid	
attrAdded	TokenNameIdentifier	 attr Added
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newv	TokenNameIdentifier	 newv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
changing	TokenNameIdentifier	 changing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fireBaseAttributeListeners	TokenNameIdentifier	 fire Base Attribute Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasAnimVal	TokenNameIdentifier	 has Anim Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireAnimatedAttributeListeners	TokenNameIdentifier	 fire Animated Attribute Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when an Attr node has been modified. */	TokenNameCOMMENT_JAVADOC	 Called when an Attr node has been modified. 
public	TokenNamepublic	
void	TokenNamevoid	
attrModified	TokenNameIdentifier	 attr Modified
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
oldv	TokenNameIdentifier	 oldv
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newv	TokenNameIdentifier	 newv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
changing	TokenNameIdentifier	 changing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fireBaseAttributeListeners	TokenNameIdentifier	 fire Base Attribute Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasAnimVal	TokenNameIdentifier	 has Anim Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireAnimatedAttributeListeners	TokenNameIdentifier	 fire Animated Attribute Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when an Attr node has been removed. */	TokenNameCOMMENT_JAVADOC	 Called when an Attr node has been removed. 
public	TokenNamepublic	
void	TokenNamevoid	
attrRemoved	TokenNameIdentifier	 attr Removed
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
oldv	TokenNameIdentifier	 oldv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
changing	TokenNameIdentifier	 changing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fireBaseAttributeListeners	TokenNameIdentifier	 fire Base Attribute Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasAnimVal	TokenNameIdentifier	 has Anim Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireAnimatedAttributeListeners	TokenNameIdentifier	 fire Animated Attribute Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the animated value to the given angle. */	TokenNameCOMMENT_JAVADOC	 Sets the animated value to the given angle. 
public	TokenNamepublic	
void	TokenNamevoid	
setAnimatedValueToAngle	TokenNameIdentifier	 set Animated Value To Angle
(	TokenNameLPAREN	
short	TokenNameshort	
unitType	TokenNameIdentifier	 unit Type
,	TokenNameCOMMA	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasAnimVal	TokenNameIdentifier	 has Anim Val
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
animAngleVal	TokenNameIdentifier	 anim Angle Val
.	TokenNameDOT	
setAnimatedValue	TokenNameIdentifier	 set Animated Value
(	TokenNameLPAREN	
unitType	TokenNameIdentifier	 unit Type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
animEnumerationVal	TokenNameIdentifier	 anim Enumeration Val
=	TokenNameEQUAL	
SVGMarkerElement	TokenNameIdentifier	 SVG Marker Element
.	TokenNameDOT	
SVG_MARKER_ORIENT_ANGLE	TokenNameIdentifier	 SVG  MARKER  ORIENT  ANGLE
;	TokenNameSEMICOLON	
fireAnimatedAttributeListeners	TokenNameIdentifier	 fire Animated Attribute Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the animated value to the "auto" value. */	TokenNameCOMMENT_JAVADOC	 Sets the animated value to the "auto" value. 
public	TokenNamepublic	
void	TokenNamevoid	
setAnimatedValueToAuto	TokenNameIdentifier	 set Animated Value To Auto
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasAnimVal	TokenNameIdentifier	 has Anim Val
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
animAngleVal	TokenNameIdentifier	 anim Angle Val
.	TokenNameDOT	
setAnimatedValue	TokenNameIdentifier	 set Animated Value
(	TokenNameLPAREN	
SVGAngle	TokenNameIdentifier	 SVG Angle
.	TokenNameDOT	
SVG_ANGLETYPE_UNSPECIFIED	TokenNameIdentifier	 SVG  ANGLETYPE  UNSPECIFIED
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
animEnumerationVal	TokenNameIdentifier	 anim Enumeration Val
=	TokenNameEQUAL	
SVGMarkerElement	TokenNameIdentifier	 SVG Marker Element
.	TokenNameDOT	
SVG_MARKER_ORIENT_AUTO	TokenNameIdentifier	 SVG  MARKER  ORIENT  AUTO
;	TokenNameSEMICOLON	
fireAnimatedAttributeListeners	TokenNameIdentifier	 fire Animated Attribute Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the animated value. */	TokenNameCOMMENT_JAVADOC	 Resets the animated value. 
public	TokenNamepublic	
void	TokenNamevoid	
resetAnimatedValue	TokenNameIdentifier	 reset Animated Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasAnimVal	TokenNameIdentifier	 has Anim Val
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fireAnimatedAttributeListeners	TokenNameIdentifier	 fire Animated Attribute Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link SVGAnimatedAngle} component of the orient value. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link SVGAnimatedAngle} component of the orient value. 
public	TokenNamepublic	
SVGAnimatedAngle	TokenNameIdentifier	 SVG Animated Angle
getAnimatedAngle	TokenNameIdentifier	 get Animated Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
animatedAngle	TokenNameIdentifier	 animated Angle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link SVGAnimatedEnumeration} component of the orient value. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link SVGAnimatedEnumeration} component of the orient value. 
public	TokenNamepublic	
SVGAnimatedEnumeration	TokenNameIdentifier	 SVG Animated Enumeration
getAnimatedEnumeration	TokenNameIdentifier	 get Animated Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
animatedEnumeration	TokenNameIdentifier	 animated Enumeration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class represents the SVGAngle returned by * {@link AnimatedAngle#getBaseVal()}. */	TokenNameCOMMENT_JAVADOC	 This class represents the SVGAngle returned by {@link AnimatedAngle#getBaseVal()}. 
protected	TokenNameprotected	
class	TokenNameclass	
BaseSVGAngle	TokenNameIdentifier	 Base SVG Angle
extends	TokenNameextends	
SVGOMAngle	TokenNameIdentifier	 SVGOM Angle
{	TokenNameLBRACE	
/** * Invalidates this angle. */	TokenNameCOMMENT_JAVADOC	 Invalidates this angle. 
public	TokenNamepublic	
void	TokenNamevoid	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the value of the associated attribute. */	TokenNameCOMMENT_JAVADOC	 Resets the value of the associated attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
changing	TokenNameIdentifier	 changing
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseEnumerationVal	TokenNameIdentifier	 base Enumeration Val
==	TokenNameEQUAL_EQUAL	
SVGMarkerElement	TokenNameIdentifier	 SVG Marker Element
.	TokenNameDOT	
SVG_MARKER_ORIENT_ANGLE	TokenNameIdentifier	 SVG  MARKER  ORIENT  ANGLE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
baseEnumerationVal	TokenNameIdentifier	 base Enumeration Val
==	TokenNameEQUAL_EQUAL	
SVGMarkerElement	TokenNameIdentifier	 SVG Marker Element
.	TokenNameDOT	
SVG_MARKER_ORIENT_AUTO	TokenNameIdentifier	 SVG  MARKER  ORIENT  AUTO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
changing	TokenNameIdentifier	 changing
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Initializes the angle, if needed. */	TokenNameCOMMENT_JAVADOC	 Initializes the angle, if needed. 
protected	TokenNameprotected	
void	TokenNamevoid	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
valid	TokenNameIdentifier	 valid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unitType	TokenNameIdentifier	 unit Type
=	TokenNameEQUAL	
SVGAngle	TokenNameIdentifier	 SVG Angle
.	TokenNameDOT	
SVG_ANGLETYPE_UNSPECIFIED	TokenNameIdentifier	 SVG  ANGLETYPE  UNSPECIFIED
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parse a String value as an SVGAngle. If orient="auto", the * method will parse the value "0" instead. */	TokenNameCOMMENT_JAVADOC	 Parse a String value as an SVGAngle. If orient="auto", the method will parse the value "0" instead. 
protected	TokenNameprotected	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unitType	TokenNameIdentifier	 unit Type
=	TokenNameEQUAL	
SVGAngle	TokenNameIdentifier	 SVG Angle
.	TokenNameDOT	
SVG_ANGLETYPE_UNSPECIFIED	TokenNameIdentifier	 SVG  ANGLETYPE  UNSPECIFIED
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
baseEnumerationVal	TokenNameIdentifier	 base Enumeration Val
=	TokenNameEQUAL	
SVGMarkerElement	TokenNameIdentifier	 SVG Marker Element
.	TokenNameDOT	
SVG_MARKER_ORIENT_AUTO	TokenNameIdentifier	 SVG  MARKER  ORIENT  AUTO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
unitType	TokenNameIdentifier	 unit Type
==	TokenNameEQUAL_EQUAL	
SVGAngle	TokenNameIdentifier	 SVG Angle
.	TokenNameDOT	
SVG_ANGLETYPE_UNKNOWN	TokenNameIdentifier	 SVG  ANGLETYPE  UNKNOWN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseEnumerationVal	TokenNameIdentifier	 base Enumeration Val
=	TokenNameEQUAL	
SVGMarkerElement	TokenNameIdentifier	 SVG Marker Element
.	TokenNameDOT	
SVG_MARKER_ORIENT_UNKNOWN	TokenNameIdentifier	 SVG  MARKER  ORIENT  UNKNOWN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
baseEnumerationVal	TokenNameIdentifier	 base Enumeration Val
=	TokenNameEQUAL	
SVGMarkerElement	TokenNameIdentifier	 SVG Marker Element
.	TokenNameDOT	
SVG_MARKER_ORIENT_ANGLE	TokenNameIdentifier	 SVG  MARKER  ORIENT  ANGLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class represents the SVGAngle returned by {@link AnimatedAngle#getAnimVal()}. */	TokenNameCOMMENT_JAVADOC	 This class represents the SVGAngle returned by {@link AnimatedAngle#getAnimVal()}. 
protected	TokenNameprotected	
class	TokenNameclass	
AnimSVGAngle	TokenNameIdentifier	 Anim SVG Angle
extends	TokenNameextends	
SVGOMAngle	TokenNameIdentifier	 SVGOM Angle
{	TokenNameLBRACE	
/** * <b>DOM</b>: Implements {@link SVGAngle#getUnitType()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#getUnitType()}. 
public	TokenNamepublic	
short	TokenNameshort	
getUnitType	TokenNameIdentifier	 get Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasAnimVal	TokenNameIdentifier	 has Anim Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getUnitType	TokenNameIdentifier	 get Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
animatedAngle	TokenNameIdentifier	 animated Angle
.	TokenNameDOT	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUnitType	TokenNameIdentifier	 get Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAngle#getValue()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#getValue()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasAnimVal	TokenNameIdentifier	 has Anim Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
animatedAngle	TokenNameIdentifier	 animated Angle
.	TokenNameDOT	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAngle#getValueInSpecifiedUnits()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#getValueInSpecifiedUnits()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getValueInSpecifiedUnits	TokenNameIdentifier	 get Value In Specified Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasAnimVal	TokenNameIdentifier	 has Anim Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getValueInSpecifiedUnits	TokenNameIdentifier	 get Value In Specified Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
animatedAngle	TokenNameIdentifier	 animated Angle
.	TokenNameDOT	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValueInSpecifiedUnits	TokenNameIdentifier	 get Value In Specified Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAngle#getValueAsString()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#getValueAsString()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasAnimVal	TokenNameIdentifier	 has Anim Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
animatedAngle	TokenNameIdentifier	 animated Angle
.	TokenNameDOT	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAngle#setValue(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#setValue(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.angle"	TokenNameStringLiteral	readonly.angle
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGAngle#setValueInSpecifiedUnits(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#setValueInSpecifiedUnits(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setValueInSpecifiedUnits	TokenNameIdentifier	 set Value In Specified Units
(	TokenNameLPAREN	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.angle"	TokenNameStringLiteral	readonly.angle
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAngle#setValueAsString(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#setValueAsString(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setValueAsString	TokenNameIdentifier	 set Value As String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.angle"	TokenNameStringLiteral	readonly.angle
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGAngle#newValueSpecifiedUnits(short,float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#newValueSpecifiedUnits(short,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
newValueSpecifiedUnits	TokenNameIdentifier	 new Value Specified Units
(	TokenNameLPAREN	
short	TokenNameshort	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.angle"	TokenNameStringLiteral	readonly.angle
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGAngle#convertToSpecifiedUnits(short)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAngle#convertToSpecifiedUnits(short)}. 
public	TokenNamepublic	
void	TokenNamevoid	
convertToSpecifiedUnits	TokenNameIdentifier	 convert To Specified Units
(	TokenNameLPAREN	
short	TokenNameshort	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.angle"	TokenNameStringLiteral	readonly.angle
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the animated value. */	TokenNameCOMMENT_JAVADOC	 Sets the animated value. 
protected	TokenNameprotected	
void	TokenNamevoid	
setAnimatedValue	TokenNameIdentifier	 set Animated Value
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
newValueSpecifiedUnits	TokenNameIdentifier	 new Value Specified Units
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The {@link SVGAnimatedAngle} component of the marker orient value. */	TokenNameCOMMENT_JAVADOC	 The {@link SVGAnimatedAngle} component of the marker orient value. 
protected	TokenNameprotected	
class	TokenNameclass	
AnimatedAngle	TokenNameIdentifier	 Animated Angle
implements	TokenNameimplements	
SVGAnimatedAngle	TokenNameIdentifier	 SVG Animated Angle
{	TokenNameLBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimatedAngle#getBaseVal()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimatedAngle#getBaseVal()}. 
public	TokenNamepublic	
SVGAngle	TokenNameIdentifier	 SVG Angle
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseAngleVal	TokenNameIdentifier	 base Angle Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseAngleVal	TokenNameIdentifier	 base Angle Val
=	TokenNameEQUAL	
new	TokenNamenew	
BaseSVGAngle	TokenNameIdentifier	 Base SVG Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
baseAngleVal	TokenNameIdentifier	 base Angle Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimatedAngle#getAnimVal()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimatedAngle#getAnimVal()}. 
public	TokenNamepublic	
SVGAngle	TokenNameIdentifier	 SVG Angle
getAnimVal	TokenNameIdentifier	 get Anim Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
animAngleVal	TokenNameIdentifier	 anim Angle Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
animAngleVal	TokenNameIdentifier	 anim Angle Val
=	TokenNameEQUAL	
new	TokenNamenew	
AnimSVGAngle	TokenNameIdentifier	 Anim SVG Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
animAngleVal	TokenNameIdentifier	 anim Angle Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The {@link SVGAnimatedEnumeration} component of the marker orient value. */	TokenNameCOMMENT_JAVADOC	 The {@link SVGAnimatedEnumeration} component of the marker orient value. 
protected	TokenNameprotected	
class	TokenNameclass	
AnimatedEnumeration	TokenNameIdentifier	 Animated Enumeration
implements	TokenNameimplements	
SVGAnimatedEnumeration	TokenNameIdentifier	 SVG Animated Enumeration
{	TokenNameLBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimatedEnumeration#getBaseVal()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimatedEnumeration#getBaseVal()}. 
public	TokenNamepublic	
short	TokenNameshort	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseAngleVal	TokenNameIdentifier	 base Angle Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseAngleVal	TokenNameIdentifier	 base Angle Val
=	TokenNameEQUAL	
new	TokenNamenew	
BaseSVGAngle	TokenNameIdentifier	 Base SVG Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
baseAngleVal	TokenNameIdentifier	 base Angle Val
.	TokenNameDOT	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
baseEnumerationVal	TokenNameIdentifier	 base Enumeration Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGAnimatedEnumeration#setBaseVal(short)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimatedEnumeration#setBaseVal(short)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setBaseVal	TokenNameIdentifier	 set Base Val
(	TokenNameLPAREN	
short	TokenNameshort	
baseVal	TokenNameIdentifier	 base Val
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseVal	TokenNameIdentifier	 base Val
==	TokenNameEQUAL_EQUAL	
SVGMarkerElement	TokenNameIdentifier	 SVG Marker Element
.	TokenNameDOT	
SVG_MARKER_ORIENT_AUTO	TokenNameIdentifier	 SVG  MARKER  ORIENT  AUTO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseEnumerationVal	TokenNameIdentifier	 base Enumeration Val
=	TokenNameEQUAL	
baseVal	TokenNameIdentifier	 base Val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseAngleVal	TokenNameIdentifier	 base Angle Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseAngleVal	TokenNameIdentifier	 base Angle Val
=	TokenNameEQUAL	
new	TokenNamenew	
BaseSVGAngle	TokenNameIdentifier	 Base SVG Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
baseAngleVal	TokenNameIdentifier	 base Angle Val
.	TokenNameDOT	
unitType	TokenNameIdentifier	 unit Type
=	TokenNameEQUAL	
SVGAngle	TokenNameIdentifier	 SVG Angle
.	TokenNameDOT	
SVG_ANGLETYPE_UNSPECIFIED	TokenNameIdentifier	 SVG  ANGLETYPE  UNSPECIFIED
;	TokenNameSEMICOLON	
baseAngleVal	TokenNameIdentifier	 base Angle Val
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
baseAngleVal	TokenNameIdentifier	 base Angle Val
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
baseVal	TokenNameIdentifier	 base Val
==	TokenNameEQUAL_EQUAL	
SVGMarkerElement	TokenNameIdentifier	 SVG Marker Element
.	TokenNameDOT	
SVG_MARKER_ORIENT_ANGLE	TokenNameIdentifier	 SVG  MARKER  ORIENT  ANGLE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseEnumerationVal	TokenNameIdentifier	 base Enumeration Val
=	TokenNameEQUAL	
baseVal	TokenNameIdentifier	 base Val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseAngleVal	TokenNameIdentifier	 base Angle Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseAngleVal	TokenNameIdentifier	 base Angle Val
=	TokenNameEQUAL	
new	TokenNamenew	
BaseSVGAngle	TokenNameIdentifier	 Base SVG Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
baseAngleVal	TokenNameIdentifier	 base Angle Val
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimatedEnumeration#getAnimVal()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimatedEnumeration#getAnimVal()}. 
public	TokenNamepublic	
short	TokenNameshort	
getAnimVal	TokenNameIdentifier	 get Anim Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasAnimVal	TokenNameIdentifier	 has Anim Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
animEnumerationVal	TokenNameIdentifier	 anim Enumeration Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseAngleVal	TokenNameIdentifier	 base Angle Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseAngleVal	TokenNameIdentifier	 base Angle Val
=	TokenNameEQUAL	
new	TokenNamenew	
BaseSVGAngle	TokenNameIdentifier	 Base SVG Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
baseAngleVal	TokenNameIdentifier	 base Angle Val
.	TokenNameDOT	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
baseEnumerationVal	TokenNameIdentifier	 base Enumeration Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
