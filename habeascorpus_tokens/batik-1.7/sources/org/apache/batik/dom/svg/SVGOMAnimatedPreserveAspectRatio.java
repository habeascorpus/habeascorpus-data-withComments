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
AnimatablePreserveAspectRatioValue	TokenNameIdentifier	 Animatable Preserve Aspect Ratio Value
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
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
;	TokenNameSEMICOLON	
/** * This class implements the {@link SVGAnimatedPreserveAspectRatio} interface. * * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> * @version $Id: SVGOMAnimatedPreserveAspectRatio.java 527382 2007-04-11 04:31:58Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link SVGAnimatedPreserveAspectRatio} interface. * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> @version $Id: SVGOMAnimatedPreserveAspectRatio.java 527382 2007-04-11 04:31:58Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMAnimatedPreserveAspectRatio	TokenNameIdentifier	 SVGOM Animated Preserve Aspect Ratio
extends	TokenNameextends	
AbstractSVGAnimatedValue	TokenNameIdentifier	 Abstract SVG Animated Value
implements	TokenNameimplements	
SVGAnimatedPreserveAspectRatio	TokenNameIdentifier	 SVG Animated Preserve Aspect Ratio
{	TokenNameLBRACE	
/** * The base value. */	TokenNameCOMMENT_JAVADOC	 The base value. 
protected	TokenNameprotected	
BaseSVGPARValue	TokenNameIdentifier	 Base SVGPAR Value
baseVal	TokenNameIdentifier	 base Val
;	TokenNameSEMICOLON	
/** * The animated value. */	TokenNameCOMMENT_JAVADOC	 The animated value. 
protected	TokenNameprotected	
AnimSVGPARValue	TokenNameIdentifier	 Anim SVGPAR Value
animVal	TokenNameIdentifier	 anim Val
;	TokenNameSEMICOLON	
/** * Whether the value is changing. */	TokenNameCOMMENT_JAVADOC	 Whether the value is changing. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
changing	TokenNameIdentifier	 changing
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMAnimatedPreserveAspectRatio. * @param elt The associated element. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMAnimatedPreserveAspectRatio. @param elt The associated element. 
public	TokenNamepublic	
SVGOMAnimatedPreserveAspectRatio	TokenNameIdentifier	 SVGOM Animated Preserve Aspect Ratio
(	TokenNameLPAREN	
AbstractElement	TokenNameIdentifier	 Abstract Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_PRESERVE_ASPECT_RATIO_ATTRIBUTE	TokenNameIdentifier	 SVG  PRESERVE  ASPECT  RATIO  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimatedPreserveAspectRatio#getBaseVal()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimatedPreserveAspectRatio#getBaseVal()}. 
public	TokenNamepublic	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseVal	TokenNameIdentifier	 base Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseVal	TokenNameIdentifier	 base Val
=	TokenNameEQUAL	
new	TokenNamenew	
BaseSVGPARValue	TokenNameIdentifier	 Base SVGPAR Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
baseVal	TokenNameIdentifier	 base Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimatedPreserveAspectRatio#getAnimVal()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimatedPreserveAspectRatio#getAnimVal()}. 
public	TokenNamepublic	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
getAnimVal	TokenNameIdentifier	 get Anim Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
animVal	TokenNameIdentifier	 anim Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
animVal	TokenNameIdentifier	 anim Val
=	TokenNameEQUAL	
new	TokenNamenew	
AnimSVGPARValue	TokenNameIdentifier	 Anim SVGPAR Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
animVal	TokenNameIdentifier	 anim Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Throws an exception if the points list value is malformed. */	TokenNameCOMMENT_JAVADOC	 Throws an exception if the points list value is malformed. 
public	TokenNamepublic	
void	TokenNamevoid	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasAnimVal	TokenNameIdentifier	 has Anim Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseVal	TokenNameIdentifier	 base Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseVal	TokenNameIdentifier	 base Val
=	TokenNameEQUAL	
new	TokenNamenew	
BaseSVGPARValue	TokenNameIdentifier	 Base SVGPAR Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseVal	TokenNameIdentifier	 base Val
.	TokenNameDOT	
malformed	TokenNameIdentifier	 malformed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
LiveAttributeException	TokenNameIdentifier	 Live Attribute Exception
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
LiveAttributeException	TokenNameIdentifier	 Live Attribute Exception
.	TokenNameDOT	
ERR_ATTRIBUTE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  MALFORMED
,	TokenNameCOMMA	
baseVal	TokenNameIdentifier	 base Val
.	TokenNameDOT	
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
par	TokenNameIdentifier	 par
=	TokenNameEQUAL	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
AnimatablePreserveAspectRatioValue	TokenNameIdentifier	 Animatable Preserve Aspect Ratio Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
par	TokenNameIdentifier	 par
.	TokenNameDOT	
getAlign	TokenNameIdentifier	 get Align
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
par	TokenNameIdentifier	 par
.	TokenNameDOT	
getMeetOrSlice	TokenNameIdentifier	 get Meet Or Slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasAnimVal	TokenNameIdentifier	 has Anim Val
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
hasAnimVal	TokenNameIdentifier	 has Anim Val
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
animVal	TokenNameIdentifier	 anim Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
animVal	TokenNameIdentifier	 anim Val
=	TokenNameEQUAL	
new	TokenNamenew	
AnimSVGPARValue	TokenNameIdentifier	 Anim SVGPAR Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AnimatablePreserveAspectRatioValue	TokenNameIdentifier	 Animatable Preserve Aspect Ratio Value
animPAR	TokenNameIdentifier	 anim PAR
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatablePreserveAspectRatioValue	TokenNameIdentifier	 Animatable Preserve Aspect Ratio Value
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
animVal	TokenNameIdentifier	 anim Val
.	TokenNameDOT	
setAnimatedValue	TokenNameIdentifier	 set Animated Value
(	TokenNameLPAREN	
animPAR	TokenNameIdentifier	 anim PAR
.	TokenNameDOT	
getAlign	TokenNameIdentifier	 get Align
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
animPAR	TokenNameIdentifier	 anim PAR
.	TokenNameDOT	
getMeetOrSlice	TokenNameIdentifier	 get Meet Or Slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fireAnimatedAttributeListeners	TokenNameIdentifier	 fire Animated Attribute Listeners
(	TokenNameLPAREN	
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
&&	TokenNameAND_AND	
baseVal	TokenNameIdentifier	 base Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseVal	TokenNameIdentifier	 base Val
.	TokenNameDOT	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
&&	TokenNameAND_AND	
baseVal	TokenNameIdentifier	 base Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseVal	TokenNameIdentifier	 base Val
.	TokenNameDOT	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
&&	TokenNameAND_AND	
baseVal	TokenNameIdentifier	 base Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseVal	TokenNameIdentifier	 base Val
.	TokenNameDOT	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
/** * This class represents the SVGPreserveAspectRatio returned by {@link * #getBaseVal()}. */	TokenNameCOMMENT_JAVADOC	 This class represents the SVGPreserveAspectRatio returned by {@link #getBaseVal()}. 
public	TokenNamepublic	
class	TokenNameclass	
BaseSVGPARValue	TokenNameIdentifier	 Base SVGPAR Value
extends	TokenNameextends	
AbstractSVGPreserveAspectRatio	TokenNameIdentifier	 Abstract SVG Preserve Aspect Ratio
{	TokenNameLBRACE	
/** * Whether the attribute is malformed. */	TokenNameCOMMENT_JAVADOC	 Whether the attribute is malformed. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
malformed	TokenNameIdentifier	 malformed
;	TokenNameSEMICOLON	
/** * Creates a new BaseSVGPARValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new BaseSVGPARValue. 
public	TokenNamepublic	
BaseSVGPARValue	TokenNameIdentifier	 Base SVGPAR Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a DOMException. */	TokenNameCOMMENT_JAVADOC	 Create a DOMException. 
protected	TokenNameprotected	
DOMException	TokenNameIdentifier	 DOM Exception
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the associated DOM attribute. */	TokenNameCOMMENT_JAVADOC	 Sets the associated DOM attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
setAttributeValue	TokenNameIdentifier	 set Attribute Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
changing	TokenNameIdentifier	 changing
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_PRESERVE_ASPECT_RATIO_ATTRIBUTE	TokenNameIdentifier	 SVG  PRESERVE  ASPECT  RATIO  ATTRIBUTE
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
malformed	TokenNameIdentifier	 malformed
=	TokenNameEQUAL	
false	TokenNamefalse	
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
/** * Re-reads the DOM attribute value. */	TokenNameCOMMENT_JAVADOC	 Re-reads the DOM attribute value. 
protected	TokenNameprotected	
void	TokenNamevoid	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_PRESERVE_ASPECT_RATIO_ATTRIBUTE	TokenNameIdentifier	 SVG  PRESERVE  ASPECT  RATIO  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setValueAsString	TokenNameIdentifier	 set Value As String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class represents the SVGPreserveAspectRatio returned by {@link * #getAnimVal()}. */	TokenNameCOMMENT_JAVADOC	 This class represents the SVGPreserveAspectRatio returned by {@link #getAnimVal()}. 
public	TokenNamepublic	
class	TokenNameclass	
AnimSVGPARValue	TokenNameIdentifier	 Anim SVGPAR Value
extends	TokenNameextends	
AbstractSVGPreserveAspectRatio	TokenNameIdentifier	 Abstract SVG Preserve Aspect Ratio
{	TokenNameLBRACE	
/** * Create a DOMException. */	TokenNameCOMMENT_JAVADOC	 Create a DOMException. 
protected	TokenNameprotected	
DOMException	TokenNameIdentifier	 DOM Exception
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the associated DOM attribute. Does nothing, since animated * values aren't reflected in the DOM. */	TokenNameCOMMENT_JAVADOC	 Sets the associated DOM attribute. Does nothing, since animated values aren't reflected in the DOM. 
protected	TokenNameprotected	
void	TokenNamevoid	
setAttributeValue	TokenNameIdentifier	 set Attribute Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPreserveAspectRatio#getAlign()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPreserveAspectRatio#getAlign()}. 
public	TokenNamepublic	
short	TokenNameshort	
getAlign	TokenNameIdentifier	 get Align
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
getAlign	TokenNameIdentifier	 get Align
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAlign	TokenNameIdentifier	 get Align
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPreserveAspectRatio#getMeetOrSlice()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPreserveAspectRatio#getMeetOrSlice()}. 
public	TokenNamepublic	
short	TokenNameshort	
getMeetOrSlice	TokenNameIdentifier	 get Meet Or Slice
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
getMeetOrSlice	TokenNameIdentifier	 get Meet Or Slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMeetOrSlice	TokenNameIdentifier	 get Meet Or Slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPreserveAspectRatio#setAlign(short)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPreserveAspectRatio#setAlign(short)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setAlign	TokenNameIdentifier	 set Align
(	TokenNameLPAREN	
short	TokenNameshort	
align	TokenNameIdentifier	 align
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
"readonly.preserve.aspect.ratio"	TokenNameStringLiteral	readonly.preserve.aspect.ratio
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPreserveAspectRatio#setMeetOrSlice(short)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPreserveAspectRatio#setMeetOrSlice(short)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setMeetOrSlice	TokenNameIdentifier	 set Meet Or Slice
(	TokenNameLPAREN	
short	TokenNameshort	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
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
"readonly.preserve.aspect.ratio"	TokenNameStringLiteral	readonly.preserve.aspect.ratio
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Updates the animated value. */	TokenNameCOMMENT_JAVADOC	 Updates the animated value. 
protected	TokenNameprotected	
void	TokenNamevoid	
setAnimatedValue	TokenNameIdentifier	 set Animated Value
(	TokenNameLPAREN	
short	TokenNameshort	
align	TokenNameIdentifier	 align
,	TokenNameCOMMA	
short	TokenNameshort	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
=	TokenNameEQUAL	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
