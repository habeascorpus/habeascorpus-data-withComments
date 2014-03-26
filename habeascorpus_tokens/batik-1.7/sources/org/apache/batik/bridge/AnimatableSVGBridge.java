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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AnimationTargetListener	TokenNameIdentifier	 Animation Target Listener
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
SVGAnimationTargetContext	TokenNameIdentifier	 SVG Animation Target Context
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
/** * Abstract bridge class for those elements that can be animated. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatableSVGBridge.java 490655 2006-12-28 05:19:44Z cam $ */	TokenNameCOMMENT_JAVADOC	 Abstract bridge class for those elements that can be animated. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatableSVGBridge.java 490655 2006-12-28 05:19:44Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AnimatableSVGBridge	TokenNameIdentifier	 Animatable SVG Bridge
extends	TokenNameextends	
AbstractSVGBridge	TokenNameIdentifier	 Abstract SVG Bridge
implements	TokenNameimplements	
SVGAnimationTargetContext	TokenNameIdentifier	 SVG Animation Target Context
{	TokenNameLBRACE	
/** * The element that has been handled by this bridge. */	TokenNameCOMMENT_JAVADOC	 The element that has been handled by this bridge. 
protected	TokenNameprotected	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
/** * The bridge context to use for dynamic updates. */	TokenNameCOMMENT_JAVADOC	 The bridge context to use for dynamic updates. 
protected	TokenNameprotected	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
/** * Map of CSS property names to {@link LinkedList}s of * {@link AnimationTargetListener}s. */	TokenNameCOMMENT_JAVADOC	 Map of CSS property names to {@link LinkedList}s of {@link AnimationTargetListener}s. 
protected	TokenNameprotected	
HashMap	TokenNameIdentifier	 Hash Map
targetListeners	TokenNameIdentifier	 target Listeners
;	TokenNameSEMICOLON	
// SVGAnimationTargetContext ///////////////////////////////////////////// 	TokenNameCOMMENT_LINE	SVGAnimationTargetContext ///////////////////////////////////////////// 
/** * Adds a listener for changes to the given attribute value. */	TokenNameCOMMENT_JAVADOC	 Adds a listener for changes to the given attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
addTargetListener	TokenNameIdentifier	 add Target Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pn	TokenNameIdentifier	 pn
,	TokenNameCOMMA	
AnimationTargetListener	TokenNameIdentifier	 Animation Target Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
targetListeners	TokenNameIdentifier	 target Listeners
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
targetListeners	TokenNameIdentifier	 target Listeners
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LinkedList	TokenNameIdentifier	 Linked List
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LinkedList	TokenNameIdentifier	 Linked List
)	TokenNameRPAREN	
targetListeners	TokenNameIdentifier	 target Listeners
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pn	TokenNameIdentifier	 pn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetListeners	TokenNameIdentifier	 target Listeners
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
pn	TokenNameIdentifier	 pn
,	TokenNameCOMMA	
ll	TokenNameIdentifier	 ll
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes a listener for changes to the given attribute value. */	TokenNameCOMMENT_JAVADOC	 Removes a listener for changes to the given attribute value. 
public	TokenNamepublic	
void	TokenNamevoid	
removeTargetListener	TokenNameIdentifier	 remove Target Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pn	TokenNameIdentifier	 pn
,	TokenNameCOMMA	
AnimationTargetListener	TokenNameIdentifier	 Animation Target Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LinkedList	TokenNameIdentifier	 Linked List
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LinkedList	TokenNameIdentifier	 Linked List
)	TokenNameRPAREN	
targetListeners	TokenNameIdentifier	 target Listeners
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pn	TokenNameIdentifier	 pn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fires the listeners registered for changes to the base value of the * given CSS property. */	TokenNameCOMMENT_JAVADOC	 Fires the listeners registered for changes to the base value of the given CSS property. 
protected	TokenNameprotected	
void	TokenNamevoid	
fireBaseAttributeListeners	TokenNameIdentifier	 fire Base Attribute Listeners
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pn	TokenNameIdentifier	 pn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
targetListeners	TokenNameIdentifier	 target Listeners
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LinkedList	TokenNameIdentifier	 Linked List
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LinkedList	TokenNameIdentifier	 Linked List
)	TokenNameRPAREN	
targetListeners	TokenNameIdentifier	 target Listeners
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pn	TokenNameIdentifier	 pn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimationTargetListener	TokenNameIdentifier	 Animation Target Listener
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimationTargetListener	TokenNameIdentifier	 Animation Target Listener
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
baseValueChanged	TokenNameIdentifier	 base Value Changed
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
pn	TokenNameIdentifier	 pn
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
