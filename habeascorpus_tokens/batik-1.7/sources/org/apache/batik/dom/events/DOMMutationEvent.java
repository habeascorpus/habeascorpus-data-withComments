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
events	TokenNameIdentifier	 events
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
events	TokenNameIdentifier	 events
.	TokenNameDOT	
MutationEvent	TokenNameIdentifier	 Mutation Event
;	TokenNameSEMICOLON	
/** * The MutationEvent class provides specific contextual information * associated with Mutation events. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: DOMMutationEvent.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 The MutationEvent class provides specific contextual information associated with Mutation events. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: DOMMutationEvent.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMMutationEvent	TokenNameIdentifier	 DOM Mutation Event
extends	TokenNameextends	
AbstractEvent	TokenNameIdentifier	 Abstract Event
implements	TokenNameimplements	
MutationEvent	TokenNameIdentifier	 Mutation Event
{	TokenNameLBRACE	
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
relatedNode	TokenNameIdentifier	 related Node
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
prevValue	TokenNameIdentifier	 prev Value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
attrChange	TokenNameIdentifier	 attr Change
;	TokenNameSEMICOLON	
/** * DOM: <code>relatedNode</code> is used to identify a secondary * node related to a mutation event. For example, if a mutation * event is dispatched to a node indicating that its parent has * changed, the <code>relatedNode</code> is the changed parent. * If an event is instead dispatch to a subtree indicating a node * was changed within it, the <code>relatedNode</code> is the * changed node. */	TokenNameCOMMENT_JAVADOC	 DOM: <code>relatedNode</code> is used to identify a secondary node related to a mutation event. For example, if a mutation event is dispatched to a node indicating that its parent has changed, the <code>relatedNode</code> is the changed parent. If an event is instead dispatch to a subtree indicating a node was changed within it, the <code>relatedNode</code> is the changed node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getRelatedNode	TokenNameIdentifier	 get Related Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
relatedNode	TokenNameIdentifier	 related Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: <code>prevValue</code> indicates the previous value of the * <code>Attr</code> node in DOMAttrModified events, and of the * <code>CharacterData</code> node in DOMCharDataModified events. */	TokenNameCOMMENT_JAVADOC	 DOM: <code>prevValue</code> indicates the previous value of the <code>Attr</code> node in DOMAttrModified events, and of the <code>CharacterData</code> node in DOMCharDataModified events. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrevValue	TokenNameIdentifier	 get Prev Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prevValue	TokenNameIdentifier	 prev Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: <code>newValue</code> indicates the new value of the * <code>Attr</code> node in DOMAttrModified events, and of the * <code>CharacterData</code> node in DOMCharDataModified events. */	TokenNameCOMMENT_JAVADOC	 DOM: <code>newValue</code> indicates the new value of the <code>Attr</code> node in DOMAttrModified events, and of the <code>CharacterData</code> node in DOMCharDataModified events. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNewValue	TokenNameIdentifier	 get New Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: <code>attrName</code> indicates the name of the changed * <code>Attr</code> node in a DOMAttrModified event. */	TokenNameCOMMENT_JAVADOC	 DOM: <code>attrName</code> indicates the name of the changed <code>Attr</code> node in a DOMAttrModified event. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAttrName	TokenNameIdentifier	 get Attr Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attrName	TokenNameIdentifier	 attr Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.w3c.dom.events.MutationEvent#getAttrChange()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.w3c.dom.events.MutationEvent#getAttrChange()}. 
public	TokenNamepublic	
short	TokenNameshort	
getAttrChange	TokenNameIdentifier	 get Attr Change
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attrChange	TokenNameIdentifier	 attr Change
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM: The <code>initMutationEvent</code> method is used to * initialize the value of a <code>MutationEvent</code> created * through the <code>DocumentEvent</code> interface. This method * may only be called before the <code>MutationEvent</code> has * been dispatched via the <code>dispatchEvent</code> method, * though it may be called multiple times during that phase if * necessary. If called multiple times, the final invocation * takes precedence. * * @param typeArg Specifies the event type. * @param canBubbleArg Specifies whether or not the event can bubble. * @param cancelableArg Specifies whether or not the event's default * action can be prevented. * @param relatedNodeArg Specifies the <code>Event</code>'s related Node * @param prevValueArg Specifies the <code>Event</code>'s * <code>prevValue</code> property * @param newValueArg Specifies the <code>Event</code>'s * <code>newValue</code> property * @param attrNameArg Specifies the <code>Event</code>'s * <code>attrName</code> property */	TokenNameCOMMENT_JAVADOC	 DOM: The <code>initMutationEvent</code> method is used to initialize the value of a <code>MutationEvent</code> created through the <code>DocumentEvent</code> interface. This method may only be called before the <code>MutationEvent</code> has been dispatched via the <code>dispatchEvent</code> method, though it may be called multiple times during that phase if necessary. If called multiple times, the final invocation takes precedence. * @param typeArg Specifies the event type. @param canBubbleArg Specifies whether or not the event can bubble. @param cancelableArg Specifies whether or not the event's default action can be prevented. @param relatedNodeArg Specifies the <code>Event</code>'s related Node @param prevValueArg Specifies the <code>Event</code>'s <code>prevValue</code> property @param newValueArg Specifies the <code>Event</code>'s <code>newValue</code> property @param attrNameArg Specifies the <code>Event</code>'s <code>attrName</code> property 
public	TokenNamepublic	
void	TokenNamevoid	
initMutationEvent	TokenNameIdentifier	 init Mutation Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
relatedNodeArg	TokenNameIdentifier	 related Node Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prevValueArg	TokenNameIdentifier	 prev Value Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newValueArg	TokenNameIdentifier	 new Value Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrNameArg	TokenNameIdentifier	 attr Name Arg
,	TokenNameCOMMA	
short	TokenNameshort	
attrChangeArg	TokenNameIdentifier	 attr Change Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initEvent	TokenNameIdentifier	 init Event
(	TokenNameLPAREN	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
relatedNode	TokenNameIdentifier	 related Node
=	TokenNameEQUAL	
relatedNodeArg	TokenNameIdentifier	 related Node Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prevValue	TokenNameIdentifier	 prev Value
=	TokenNameEQUAL	
prevValueArg	TokenNameIdentifier	 prev Value Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
newValue	TokenNameIdentifier	 new Value
=	TokenNameEQUAL	
newValueArg	TokenNameIdentifier	 new Value Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
attrName	TokenNameIdentifier	 attr Name
=	TokenNameEQUAL	
attrNameArg	TokenNameIdentifier	 attr Name Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
attrChange	TokenNameIdentifier	 attr Change
=	TokenNameEQUAL	
attrChangeArg	TokenNameIdentifier	 attr Change Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Initializes this event object. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Initializes this event object. 
public	TokenNamepublic	
void	TokenNamevoid	
initMutationEventNS	TokenNameIdentifier	 init Mutation Event NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
relatedNodeArg	TokenNameIdentifier	 related Node Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prevValueArg	TokenNameIdentifier	 prev Value Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newValueArg	TokenNameIdentifier	 new Value Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrNameArg	TokenNameIdentifier	 attr Name Arg
,	TokenNameCOMMA	
short	TokenNameshort	
attrChangeArg	TokenNameIdentifier	 attr Change Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initEventNS	TokenNameIdentifier	 init Event NS
(	TokenNameLPAREN	
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
relatedNode	TokenNameIdentifier	 related Node
=	TokenNameEQUAL	
relatedNodeArg	TokenNameIdentifier	 related Node Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prevValue	TokenNameIdentifier	 prev Value
=	TokenNameEQUAL	
prevValueArg	TokenNameIdentifier	 prev Value Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
newValue	TokenNameIdentifier	 new Value
=	TokenNameEQUAL	
newValueArg	TokenNameIdentifier	 new Value Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
attrName	TokenNameIdentifier	 attr Name
=	TokenNameEQUAL	
attrNameArg	TokenNameIdentifier	 attr Name Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
attrChange	TokenNameIdentifier	 attr Change
=	TokenNameEQUAL	
attrChangeArg	TokenNameIdentifier	 attr Change Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
