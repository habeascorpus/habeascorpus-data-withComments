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
AnimatableRectValue	TokenNameIdentifier	 Animatable Rect Value
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
DefaultNumberListHandler	TokenNameIdentifier	 Default Number List Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
NumberListParser	TokenNameIdentifier	 Number List Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
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
SVGRect	TokenNameIdentifier	 SVG Rect
;	TokenNameSEMICOLON	
/** * Implementation of {@link SVGAnimatedRect}. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVGOMAnimatedRect.java 579487 2007-09-26 06:40:16Z cam $ */	TokenNameCOMMENT_JAVADOC	 Implementation of {@link SVGAnimatedRect}. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVGOMAnimatedRect.java 579487 2007-09-26 06:40:16Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMAnimatedRect	TokenNameIdentifier	 SVGOM Animated Rect
extends	TokenNameextends	
AbstractSVGAnimatedValue	TokenNameIdentifier	 Abstract SVG Animated Value
implements	TokenNameimplements	
SVGAnimatedRect	TokenNameIdentifier	 SVG Animated Rect
{	TokenNameLBRACE	
/** * The base value. */	TokenNameCOMMENT_JAVADOC	 The base value. 
protected	TokenNameprotected	
BaseSVGRect	TokenNameIdentifier	 Base SVG Rect
baseVal	TokenNameIdentifier	 base Val
;	TokenNameSEMICOLON	
/** * The animated value. */	TokenNameCOMMENT_JAVADOC	 The animated value. 
protected	TokenNameprotected	
AnimSVGRect	TokenNameIdentifier	 Anim SVG Rect
animVal	TokenNameIdentifier	 anim Val
;	TokenNameSEMICOLON	
/** * Whether the value is changing. */	TokenNameCOMMENT_JAVADOC	 Whether the value is changing. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
changing	TokenNameIdentifier	 changing
;	TokenNameSEMICOLON	
/** * Default value. */	TokenNameCOMMENT_JAVADOC	 Default value. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMAnimatedRect. * @param elt The associated element. * @param ns The attribute's namespace URI. * @param ln The attribute's local name. * @param def The default value for the attribute. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMAnimatedRect. @param elt The associated element. @param ns The attribute's namespace URI. @param ln The attribute's local name. @param def The default value for the attribute. 
public	TokenNamepublic	
SVGOMAnimatedRect	TokenNameIdentifier	 SVGOM Animated Rect
(	TokenNameLPAREN	
AbstractElement	TokenNameIdentifier	 Abstract Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
def	TokenNameIdentifier	 def
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
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimatedRect#getBaseVal()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimatedRect#getBaseVal()}. 
public	TokenNamepublic	
SVGRect	TokenNameIdentifier	 SVG Rect
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
BaseSVGRect	TokenNameIdentifier	 Base SVG Rect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
baseVal	TokenNameIdentifier	 base Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimatedRect#getAnimVal()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimatedRect#getAnimVal()}. 
public	TokenNamepublic	
SVGRect	TokenNameIdentifier	 SVG Rect
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
AnimSVGRect	TokenNameIdentifier	 Anim SVG Rect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
animVal	TokenNameIdentifier	 anim Val
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
AnimatableRectValue	TokenNameIdentifier	 Animatable Rect Value
animRect	TokenNameIdentifier	 anim Rect
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableRectValue	TokenNameIdentifier	 Animatable Rect Value
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
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
AnimSVGRect	TokenNameIdentifier	 Anim SVG Rect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
animVal	TokenNameIdentifier	 anim Val
.	TokenNameDOT	
setAnimatedValue	TokenNameIdentifier	 set Animated Value
(	TokenNameLPAREN	
animRect	TokenNameIdentifier	 anim Rect
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
animRect	TokenNameIdentifier	 anim Rect
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
animRect	TokenNameIdentifier	 anim Rect
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
animRect	TokenNameIdentifier	 anim Rect
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
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
/** * Returns the base value of the attribute as an {@link AnimatableValue}. */	TokenNameCOMMENT_JAVADOC	 Returns the base value of the attribute as an {@link AnimatableValue}. 
public	TokenNamepublic	
AnimatableValue	TokenNameIdentifier	 Animatable Value
getUnderlyingValue	TokenNameIdentifier	 get Underlying Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGRect	TokenNameIdentifier	 SVG Rect
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
AnimatableRectValue	TokenNameIdentifier	 Animatable Rect Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
/** * This class represents the SVGRect returned by getBaseVal(). */	TokenNameCOMMENT_JAVADOC	 This class represents the SVGRect returned by getBaseVal(). 
protected	TokenNameprotected	
class	TokenNameclass	
BaseSVGRect	TokenNameIdentifier	 Base SVG Rect
extends	TokenNameextends	
SVGOMRect	TokenNameIdentifier	 SVGOM Rect
{	TokenNameLBRACE	
/** * Whether this rect is valid. */	TokenNameCOMMENT_JAVADOC	 Whether this rect is valid. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
valid	TokenNameIdentifier	 valid
;	TokenNameSEMICOLON	
/** * Invalidates this length. */	TokenNameCOMMENT_JAVADOC	 Invalidates this length. 
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
element	TokenNameIdentifier	 element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
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
/** * Initializes the length, if needed. */	TokenNameCOMMENT_JAVADOC	 Initializes the length, if needed. 
protected	TokenNameprotected	
void	TokenNamevoid	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
valid	TokenNameIdentifier	 valid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
defaultValue	TokenNameIdentifier	 default Value
:	TokenNameCOLON	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
numbers	TokenNameIdentifier	 numbers
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
NumberListParser	TokenNameIdentifier	 Number List Parser
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
NumberListParser	TokenNameIdentifier	 Number List Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setNumberListHandler	TokenNameIdentifier	 set Number List Handler
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultNumberListHandler	TokenNameIdentifier	 Default Number List Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
endNumberList	TokenNameIdentifier	 end Number List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
!=	TokenNameNOT_EQUAL	
4	TokenNameIntegerLiteral	
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
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
numberValue	TokenNameIdentifier	 number Value
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numbers	TokenNameIdentifier	 numbers
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
numbers	TokenNameIdentifier	 numbers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
numbers	TokenNameIdentifier	 numbers
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
numbers	TokenNameIdentifier	 numbers
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
numbers	TokenNameIdentifier	 numbers
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#getX()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#getX()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#setX(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#setX(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setX	TokenNameIdentifier	 set X
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#getY()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#getY()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#setY(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#setY(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setY	TokenNameIdentifier	 set Y
(	TokenNameLPAREN	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#getWidth()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#getWidth()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#setWidth(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#setWidth(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setWidth	TokenNameIdentifier	 set Width
(	TokenNameLPAREN	
float	TokenNamefloat	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#getHeight()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#getHeight()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#setHeight(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#setHeight(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setHeight	TokenNameIdentifier	 set Height
(	TokenNameLPAREN	
float	TokenNamefloat	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class represents the SVGRect returned by getAnimVal(). */	TokenNameCOMMENT_JAVADOC	 This class represents the SVGRect returned by getAnimVal(). 
protected	TokenNameprotected	
class	TokenNameclass	
AnimSVGRect	TokenNameIdentifier	 Anim SVG Rect
extends	TokenNameextends	
SVGOMRect	TokenNameIdentifier	 SVGOM Rect
{	TokenNameLBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#getX()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#getX()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getX	TokenNameIdentifier	 get X
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
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#getY()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#getY()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getY	TokenNameIdentifier	 get Y
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
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#getWidth()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#getWidth()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getWidth	TokenNameIdentifier	 get Width
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
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#getHeight()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#getHeight()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getHeight	TokenNameIdentifier	 get Height
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
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#setX(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#setX(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setX	TokenNameIdentifier	 set X
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
"readonly.length"	TokenNameStringLiteral	readonly.length
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#setY(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#setY(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setY	TokenNameIdentifier	 set Y
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
"readonly.length"	TokenNameStringLiteral	readonly.length
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#setWidth(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#setWidth(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setWidth	TokenNameIdentifier	 set Width
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
"readonly.length"	TokenNameStringLiteral	readonly.length
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#setHeight(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#setHeight(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setHeight	TokenNameIdentifier	 set Height
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
"readonly.length"	TokenNameStringLiteral	readonly.length
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
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
float	TokenNamefloat	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
float	TokenNamefloat	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
