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
SVGAnimatedString	TokenNameIdentifier	 SVG Animated String
;	TokenNameSEMICOLON	
/** * This class implements the {@link SVGAnimatedString} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMAnimatedString.java 490655 2006-12-28 05:19:44Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link SVGAnimatedString} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMAnimatedString.java 490655 2006-12-28 05:19:44Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMAnimatedString	TokenNameIdentifier	 SVGOM Animated String
extends	TokenNameextends	
AbstractSVGAnimatedValue	TokenNameIdentifier	 Abstract SVG Animated Value
implements	TokenNameimplements	
SVGAnimatedString	TokenNameIdentifier	 SVG Animated String
{	TokenNameLBRACE	
/** * The current animated value. */	TokenNameCOMMENT_JAVADOC	 The current animated value. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
animVal	TokenNameIdentifier	 anim Val
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMAnimatedString. * @param elt The associated element. * @param ns The attribute's namespace URI. * @param ln The attribute's local name. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMAnimatedString. @param elt The associated element. @param ns The attribute's namespace URI. @param ln The attribute's local name. 
public	TokenNamepublic	
SVGOMAnimatedString	TokenNameIdentifier	 SVGOM Animated String
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
/** * <b>DOM</b>: Implements {@link SVGAnimatedString#getBaseVal()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimatedString#getBaseVal()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseVal	TokenNameIdentifier	 get Base Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimatedString#setBaseVal(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimatedString#setBaseVal(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setBaseVal	TokenNameIdentifier	 set Base Val
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseVal	TokenNameIdentifier	 base Val
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
baseVal	TokenNameIdentifier	 base Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimatedString#getAnimVal()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimatedString#getAnimVal()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
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
return	TokenNamereturn	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
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
return	TokenNamereturn	
new	TokenNamenew	
AnimatableStringValue	TokenNameIdentifier	 Animatable String Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
getBaseVal	TokenNameIdentifier	 get Base Val
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
this	TokenNamethis	
.	TokenNameDOT	
animVal	TokenNameIdentifier	 anim Val
=	TokenNameEQUAL	
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
