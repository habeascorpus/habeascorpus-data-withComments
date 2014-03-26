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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
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
/** * An abstract base class for the <code>SVGAnimated*</code> classes, that * implements an {@link AnimatedAttributeListener} list. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AbstractSVGAnimatedValue.java 490655 2006-12-28 05:19:44Z cam $ */	TokenNameCOMMENT_JAVADOC	 An abstract base class for the <code>SVGAnimated*</code> classes, that implements an {@link AnimatedAttributeListener} list. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AbstractSVGAnimatedValue.java 490655 2006-12-28 05:19:44Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSVGAnimatedValue	TokenNameIdentifier	 Abstract SVG Animated Value
implements	TokenNameimplements	
AnimatedLiveAttributeValue	TokenNameIdentifier	 Animated Live Attribute Value
{	TokenNameLBRACE	
/** * The associated element. */	TokenNameCOMMENT_JAVADOC	 The associated element. 
protected	TokenNameprotected	
AbstractElement	TokenNameIdentifier	 Abstract Element
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
/** * The namespace URI of the attribute. */	TokenNameCOMMENT_JAVADOC	 The namespace URI of the attribute. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
/** * The local name of the attribute. */	TokenNameCOMMENT_JAVADOC	 The local name of the attribute. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
/** * Whether there is a current animated value. */	TokenNameCOMMENT_JAVADOC	 Whether there is a current animated value. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
hasAnimVal	TokenNameIdentifier	 has Anim Val
;	TokenNameSEMICOLON	
/** * Listener list. */	TokenNameCOMMENT_JAVADOC	 Listener list. 
protected	TokenNameprotected	
LinkedList	TokenNameIdentifier	 Linked List
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new AbstractSVGAnimatedValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new AbstractSVGAnimatedValue. 
public	TokenNamepublic	
AbstractSVGAnimatedValue	TokenNameIdentifier	 Abstract SVG Animated Value
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
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
elt	TokenNameIdentifier	 elt
;	TokenNameSEMICOLON	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
ns	TokenNameIdentifier	 ns
;	TokenNameSEMICOLON	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
ln	TokenNameIdentifier	 ln
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the namespace URI of the attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the namespace URI of the attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the local name of the attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the local name of the attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this animated value has a specified value. * @return true if the DOM attribute is specified or if the attribute has * an animated value, false otherwise */	TokenNameCOMMENT_JAVADOC	 Returns whether this animated value has a specified value. @return true if the DOM attribute is specified or if the attribute has an animated value, false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSpecified	TokenNameIdentifier	 is Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hasAnimVal	TokenNameIdentifier	 has Anim Val
||	TokenNameOR_OR	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
hasAttributeNS	TokenNameIdentifier	 has Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Updates the animated value with the given {@link AnimatableValue}. */	TokenNameCOMMENT_JAVADOC	 Updates the animated value with the given {@link AnimatableValue}. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
updateAnimatedValue	TokenNameIdentifier	 update Animated Value
(	TokenNameLPAREN	
AnimatableValue	TokenNameIdentifier	 Animatable Value
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Adds a listener for changes to the animated value. */	TokenNameCOMMENT_JAVADOC	 Adds a listener for changes to the animated value. 
public	TokenNamepublic	
void	TokenNamevoid	
addAnimatedAttributeListener	TokenNameIdentifier	 add Animated Attribute Listener
(	TokenNameLPAREN	
AnimatedAttributeListener	TokenNameIdentifier	 Animated Attribute Listener
aal	TokenNameIdentifier	 aal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
aal	TokenNameIdentifier	 aal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
aal	TokenNameIdentifier	 aal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Removes a listener for changes to the animated value. */	TokenNameCOMMENT_JAVADOC	 Removes a listener for changes to the animated value. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAnimatedAttributeListener	TokenNameIdentifier	 remove Animated Attribute Listener
(	TokenNameLPAREN	
AnimatedAttributeListener	TokenNameIdentifier	 Animated Attribute Listener
aal	TokenNameIdentifier	 aal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
aal	TokenNameIdentifier	 aal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fires the listeners for the base value. */	TokenNameCOMMENT_JAVADOC	 Fires the listeners for the base value. 
protected	TokenNameprotected	
void	TokenNamevoid	
fireBaseAttributeListeners	TokenNameIdentifier	 fire Base Attribute Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
instanceof	TokenNameinstanceof	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
.	TokenNameDOT	
fireBaseAttributeListeners	TokenNameIdentifier	 fire Base Attribute Listeners
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires the listeners for the animated value. */	TokenNameCOMMENT_JAVADOC	 Fires the listeners for the animated value. 
protected	TokenNameprotected	
void	TokenNamevoid	
fireAnimatedAttributeListeners	TokenNameIdentifier	 fire Animated Attribute Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatedAttributeListener	TokenNameIdentifier	 Animated Attribute Listener
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatedAttributeListener	TokenNameIdentifier	 Animated Attribute Listener
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
animatedAttributeChanged	TokenNameIdentifier	 animated Attribute Changed
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
