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
AnimatableStringValue	TokenNameIdentifier	 Animatable String Value
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
SVGAnimatedEnumeration	TokenNameIdentifier	 SVG Animated Enumeration
;	TokenNameSEMICOLON	
/** * This class provides an implementation of the {@link * SVGAnimatedEnumeration} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMAnimatedEnumeration.java 527382 2007-04-11 04:31:58Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation of the {@link SVGAnimatedEnumeration} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMAnimatedEnumeration.java 527382 2007-04-11 04:31:58Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMAnimatedEnumeration	TokenNameIdentifier	 SVGOM Animated Enumeration
extends	TokenNameextends	
AbstractSVGAnimatedValue	TokenNameIdentifier	 Abstract SVG Animated Value
implements	TokenNameimplements	
SVGAnimatedEnumeration	TokenNameIdentifier	 SVG Animated Enumeration
{	TokenNameLBRACE	
/** * The values in this enumeration. */	TokenNameCOMMENT_JAVADOC	 The values in this enumeration. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
/** * The default value, if the attribute is not specified. */	TokenNameCOMMENT_JAVADOC	 The default value, if the attribute is not specified. 
protected	TokenNameprotected	
short	TokenNameshort	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
/** * Whether the current base value is valid. */	TokenNameCOMMENT_JAVADOC	 Whether the current base value is valid. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
valid	TokenNameIdentifier	 valid
;	TokenNameSEMICOLON	
/** * The current base value. */	TokenNameCOMMENT_JAVADOC	 The current base value. 
protected	TokenNameprotected	
short	TokenNameshort	
baseVal	TokenNameIdentifier	 base Val
;	TokenNameSEMICOLON	
/** * The current animated value. */	TokenNameCOMMENT_JAVADOC	 The current animated value. 
protected	TokenNameprotected	
short	TokenNameshort	
animVal	TokenNameIdentifier	 anim Val
;	TokenNameSEMICOLON	
/** * Whether the value is changing. */	TokenNameCOMMENT_JAVADOC	 Whether the value is changing. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
changing	TokenNameIdentifier	 changing
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMAnimatedEnumeration. * @param elt The associated element. * @param ns The attribute's namespace URI. * @param ln The attribute's local name. * @param val The values in this enumeration. * @param def The default value to use. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMAnimatedEnumeration. @param elt The associated element. @param ns The attribute's namespace URI. @param ln The attribute's local name. @param val The values in this enumeration. @param def The default value to use. 
public	TokenNamepublic	
SVGOMAnimatedEnumeration	TokenNameIdentifier	 SVGOM Animated Enumeration
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
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
short	TokenNameshort	
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
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimatedEnumeration#getBaseVal()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimatedEnumeration#getBaseVal()}. 
public	TokenNamepublic	
short	TokenNameshort	
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
valid	TokenNameIdentifier	 valid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
baseVal	TokenNameIdentifier	 base Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the base value as a string. */	TokenNameCOMMENT_JAVADOC	 Returns the base value as a string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseValAsString	TokenNameIdentifier	 get Base Val As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
valid	TokenNameIdentifier	 valid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
baseVal	TokenNameIdentifier	 base Val
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Updates the base value from the attribute. */	TokenNameCOMMENT_JAVADOC	 Updates the base value from the attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseVal	TokenNameIdentifier	 base Val
=	TokenNameEQUAL	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
baseVal	TokenNameIdentifier	 base Val
=	TokenNameEQUAL	
getEnumerationNumber	TokenNameIdentifier	 get Enumeration Number
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the enumeration number of the specified string. */	TokenNameCOMMENT_JAVADOC	 Returns the enumeration number of the specified string. 
protected	TokenNameprotected	
short	TokenNameshort	
getEnumerationNumber	TokenNameIdentifier	 get Enumeration Number
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
short	TokenNameshort	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
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
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
baseVal	TokenNameIdentifier	 base Val
<	TokenNameLESS	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
baseVal	TokenNameIdentifier	 base Val
=	TokenNameEQUAL	
baseVal	TokenNameIdentifier	 base Val
;	TokenNameSEMICOLON	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
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
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
baseVal	TokenNameIdentifier	 base Val
]	TokenNameRBRACKET	
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
animVal	TokenNameIdentifier	 anim Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
valid	TokenNameIdentifier	 valid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
baseVal	TokenNameIdentifier	 base Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the current animated value, throwing an exception if the attribute * is malformed. */	TokenNameCOMMENT_JAVADOC	 Gets the current animated value, throwing an exception if the attribute is malformed. 
public	TokenNamepublic	
short	TokenNameshort	
getCheckedVal	TokenNameIdentifier	 get Checked Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasAnimVal	TokenNameIdentifier	 has Anim Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
animVal	TokenNameIdentifier	 anim Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
valid	TokenNameIdentifier	 valid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
baseVal	TokenNameIdentifier	 base Val
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
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
getBaseValAsString	TokenNameIdentifier	 get Base Val As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
baseVal	TokenNameIdentifier	 base Val
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
return	TokenNamereturn	
new	TokenNamenew	
AnimatableStringValue	TokenNameIdentifier	 Animatable String Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
getBaseValAsString	TokenNameIdentifier	 get Base Val As String
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
this	TokenNamethis	
.	TokenNameDOT	
animVal	TokenNameIdentifier	 anim Val
=	TokenNameEQUAL	
getEnumerationNumber	TokenNameIdentifier	 get Enumeration Number
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AnimatableStringValue	TokenNameIdentifier	 Animatable String Value
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireAnimatedAttributeListeners	TokenNameIdentifier	 fire Animated Attribute Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fireAnimatedAttributeListeners	TokenNameIdentifier	 fire Animated Attribute Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
