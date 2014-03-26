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
anim	TokenNameIdentifier	 anim
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGLength	TokenNameIdentifier	 SVG Length
;	TokenNameSEMICOLON	
/** * An interface for targets of animation to provide context information. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimationTarget.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An interface for targets of animation to provide context information. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimationTarget.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
AnimationTarget	TokenNameIdentifier	 Animation Target
{	TokenNameLBRACE	
// Constants for percentage interpretation. 	TokenNameCOMMENT_LINE	Constants for percentage interpretation. 
short	TokenNameshort	
PERCENTAGE_FONT_SIZE	TokenNameIdentifier	 PERCENTAGE  FONT  SIZE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
PERCENTAGE_VIEWPORT_WIDTH	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  WIDTH
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
PERCENTAGE_VIEWPORT_HEIGHT	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  HEIGHT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
PERCENTAGE_VIEWPORT_SIZE	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  SIZE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Returns the element. */	TokenNameCOMMENT_JAVADOC	 Returns the element. 
Element	TokenNameIdentifier	 Element
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Updates a property value in this target. */	TokenNameCOMMENT_JAVADOC	 Updates a property value in this target. 
void	TokenNamevoid	
updatePropertyValue	TokenNameIdentifier	 update Property Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pn	TokenNameIdentifier	 pn
,	TokenNameCOMMA	
AnimatableValue	TokenNameIdentifier	 Animatable Value
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Updates an attribute value in this target. */	TokenNameCOMMENT_JAVADOC	 Updates an attribute value in this target. 
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
;	TokenNameSEMICOLON	
/** * Updates a 'other' animation value in this target. */	TokenNameCOMMENT_JAVADOC	 Updates a 'other' animation value in this target. 
void	TokenNamevoid	
updateOtherValue	TokenNameIdentifier	 update Other Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
AnimatableValue	TokenNameIdentifier	 Animatable Value
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the underlying value of an animatable XML attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the underlying value of an animatable XML attribute. 
AnimatableValue	TokenNameIdentifier	 Animatable Value
getUnderlyingValue	TokenNameIdentifier	 get Underlying Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets how percentage values are interpreted by the given attribute * or property. */	TokenNameCOMMENT_JAVADOC	 Gets how percentage values are interpreted by the given attribute or property. 
short	TokenNameshort	
getPercentageInterpretation	TokenNameIdentifier	 get Percentage Interpretation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
an	TokenNameIdentifier	 an
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCSS	TokenNameIdentifier	 is CSS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether color interpolations should be done in linear RGB * color space rather than sRGB. */	TokenNameCOMMENT_JAVADOC	 Returns whether color interpolations should be done in linear RGB color space rather than sRGB. 
boolean	TokenNameboolean	
useLinearRGBColorInterpolation	TokenNameIdentifier	 use Linear RGB Color Interpolation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Converts the given SVG length into user units. * @param v the SVG length value * @param type the SVG length units (one of the * {@link SVGLength}.SVG_LENGTH_* constants) * @param pcInterp how to interpretet percentage values (one of the * {@link AnimationTarget}.PERCENTAGE_* constants) * @return the SVG value in user units */	TokenNameCOMMENT_JAVADOC	 Converts the given SVG length into user units. @param v the SVG length value @param type the SVG length units (one of the {@link SVGLength}.SVG_LENGTH_* constants) @param pcInterp how to interpretet percentage values (one of the {@link AnimationTarget}.PERCENTAGE_* constants) @return the SVG value in user units 
float	TokenNamefloat	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
short	TokenNameshort	
pcInterp	TokenNameIdentifier	 pc Interp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Listeners 	TokenNameCOMMENT_LINE	Listeners 
/** * Adds a listener for changes to the given attribute value. */	TokenNameCOMMENT_JAVADOC	 Adds a listener for changes to the given attribute value. 
void	TokenNamevoid	
addTargetListener	TokenNameIdentifier	 add Target Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
an	TokenNameIdentifier	 an
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCSS	TokenNameIdentifier	 is CSS
,	TokenNameCOMMA	
AnimationTargetListener	TokenNameIdentifier	 Animation Target Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes a listener for changes to the given attribute value. */	TokenNameCOMMENT_JAVADOC	 Removes a listener for changes to the given attribute value. 
void	TokenNamevoid	
removeTargetListener	TokenNameIdentifier	 remove Target Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
an	TokenNameIdentifier	 an
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCSS	TokenNameIdentifier	 is CSS
,	TokenNameCOMMA	
AnimationTargetListener	TokenNameIdentifier	 Animation Target Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
