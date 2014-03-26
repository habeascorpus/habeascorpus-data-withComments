/* * Copyright (c) 2006 World Wide Web Consortium, * * (Massachusetts Institute of Technology, European Research Consortium for * Informatics and Mathematics, Keio University). All Rights Reserved. This * work is distributed under the W3C(r) Software License [1] in the hope that * it will be useful, but WITHOUT ANY WARRANTY; without even the implied * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. * * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231 */	TokenNameCOMMENT_BLOCK	 Copyright (c) 2006 World Wide Web Consortium, * (Massachusetts Institute of Technology, European Research Consortium for Informatics and Mathematics, Keio University). All Rights Reserved. This work is distributed under the W3C(r) Software License [1] in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
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
/** * The <code>MutationEvent</code> interface provides specific contextual * information associated with Mutation events. * <p> To create an instance of the <code>MutationEvent</code> interface, use * the <code>DocumentEvent.createEvent("MutationEvent")</code> method call. * <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. * @since DOM Level 2 */	TokenNameCOMMENT_JAVADOC	 The <code>MutationEvent</code> interface provides specific contextual information associated with Mutation events. <p> To create an instance of the <code>MutationEvent</code> interface, use the <code>DocumentEvent.createEvent("MutationEvent")</code> method call. <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. @since DOM Level 2 
public	TokenNamepublic	
interface	TokenNameinterface	
MutationEvent	TokenNameIdentifier	 Mutation Event
extends	TokenNameextends	
Event	TokenNameIdentifier	 Event
{	TokenNameLBRACE	
// attrChangeType 	TokenNameCOMMENT_LINE	attrChangeType 
/** * The <code>Attr</code> was modified in place. */	TokenNameCOMMENT_JAVADOC	 The <code>Attr</code> was modified in place. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
MODIFICATION	TokenNameIdentifier	 MODIFICATION
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The <code>Attr</code> was just added. */	TokenNameCOMMENT_JAVADOC	 The <code>Attr</code> was just added. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ADDITION	TokenNameIdentifier	 ADDITION
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The <code>Attr</code> was just removed. */	TokenNameCOMMENT_JAVADOC	 The <code>Attr</code> was just removed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
REMOVAL	TokenNameIdentifier	 REMOVAL
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * <code>relatedNode</code> is used to identify a secondary node related * to a mutation event. For example, if a mutation event is dispatched * to a node indicating that its parent has changed, the * <code>relatedNode</code> is the changed parent. If an event is * instead dispatched to a subtree indicating a node was changed within * it, the <code>relatedNode</code> is the changed node. In the case of * the DOMAttrModified event it indicates the <code>Attr</code> node * which was modified, added, or removed. */	TokenNameCOMMENT_JAVADOC	 <code>relatedNode</code> is used to identify a secondary node related to a mutation event. For example, if a mutation event is dispatched to a node indicating that its parent has changed, the <code>relatedNode</code> is the changed parent. If an event is instead dispatched to a subtree indicating a node was changed within it, the <code>relatedNode</code> is the changed node. In the case of the DOMAttrModified event it indicates the <code>Attr</code> node which was modified, added, or removed. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getRelatedNode	TokenNameIdentifier	 get Related Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>prevValue</code> indicates the previous value of the * <code>Attr</code> node in DOMAttrModified events, and of the * <code>CharacterData</code> node in DOMCharacterDataModified events. */	TokenNameCOMMENT_JAVADOC	 <code>prevValue</code> indicates the previous value of the <code>Attr</code> node in DOMAttrModified events, and of the <code>CharacterData</code> node in DOMCharacterDataModified events. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrevValue	TokenNameIdentifier	 get Prev Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>newValue</code> indicates the new value of the <code>Attr</code> * node in DOMAttrModified events, and of the <code>CharacterData</code> * node in DOMCharacterDataModified events. */	TokenNameCOMMENT_JAVADOC	 <code>newValue</code> indicates the new value of the <code>Attr</code> node in DOMAttrModified events, and of the <code>CharacterData</code> node in DOMCharacterDataModified events. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNewValue	TokenNameIdentifier	 get New Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>attrName</code> indicates the name of the changed * <code>Attr</code> node in a DOMAttrModified event. */	TokenNameCOMMENT_JAVADOC	 <code>attrName</code> indicates the name of the changed <code>Attr</code> node in a DOMAttrModified event. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAttrName	TokenNameIdentifier	 get Attr Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>attrChange</code> indicates the type of change which triggered * the DOMAttrModified event. The values can be <code>MODIFICATION</code> * , <code>ADDITION</code>, or <code>REMOVAL</code>. */	TokenNameCOMMENT_JAVADOC	 <code>attrChange</code> indicates the type of change which triggered the DOMAttrModified event. The values can be <code>MODIFICATION</code> , <code>ADDITION</code>, or <code>REMOVAL</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getAttrChange	TokenNameIdentifier	 get Attr Change
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>initMutationEvent</code> method is used to initialize the * value of a <code>MutationEvent</code> object and has the same * behavior as <code>Event.initEvent()</code>. * @param typeArg Refer to the <code>Event.initEvent()</code> method for * a description of this parameter. * @param canBubbleArg Refer to the <code>Event.initEvent()</code> * method for a description of this parameter. * @param cancelableArg Refer to the <code>Event.initEvent()</code> * method for a description of this parameter. * @param relatedNodeArg Specifies <code>MutationEvent.relatedNode</code> * . * @param prevValueArg Specifies <code>MutationEvent.prevValue</code>. * This value may be null. * @param newValueArg Specifies <code>MutationEvent.newValue</code>. * This value may be null. * @param attrNameArg Specifies <code>MutationEvent.attrname</code>. * This value may be null. * @param attrChangeArg Specifies <code>MutationEvent.attrChange</code>. * This value may be null. */	TokenNameCOMMENT_JAVADOC	 The <code>initMutationEvent</code> method is used to initialize the value of a <code>MutationEvent</code> object and has the same behavior as <code>Event.initEvent()</code>. @param typeArg Refer to the <code>Event.initEvent()</code> method for a description of this parameter. @param canBubbleArg Refer to the <code>Event.initEvent()</code> method for a description of this parameter. @param cancelableArg Refer to the <code>Event.initEvent()</code> method for a description of this parameter. @param relatedNodeArg Specifies <code>MutationEvent.relatedNode</code> . @param prevValueArg Specifies <code>MutationEvent.prevValue</code>. This value may be null. @param newValueArg Specifies <code>MutationEvent.newValue</code>. This value may be null. @param attrNameArg Specifies <code>MutationEvent.attrname</code>. This value may be null. @param attrChangeArg Specifies <code>MutationEvent.attrChange</code>. This value may be null. 
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
;	TokenNameSEMICOLON	
/** * The <code>initMutationEventNS</code> method is used to initialize the * value of a <code>MutationEvent</code> object and has the same * behavior as <code>Event.initEventNS()</code>. * @param namespaceURI Refer to the <code>Event.initEventNS()</code> * method for a description of this parameter. * @param typeArg Refer to the <code>Event.initEventNS()</code> method * for a description of this parameter. * @param canBubbleArg Refer to the <code>Event.initEventNS()</code> * method for a description of this parameter. * @param cancelableArg Refer to the <code>Event.initEventNS()</code> * method for a description of this parameter. * @param relatedNodeArg Refer to the * <code>MutationEvent.initMutationEvent()</code> method for a * description of this parameter. * @param prevValueArg Refer to the * <code>MutationEvent.initMutationEvent()</code> method for a * description of this parameter. * @param newValueArg Refer to the * <code>MutationEvent.initMutationEvent()</code> method for a * description of this parameter. * @param attrNameArg Refer to the * <code>MutationEvent.initMutationEvent()</code> method for a * description of this parameter. * @param attrChangeArg Refer to the * <code>MutationEvent.initMutationEvent()</code> method for a * description of this parameter. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 The <code>initMutationEventNS</code> method is used to initialize the value of a <code>MutationEvent</code> object and has the same behavior as <code>Event.initEventNS()</code>. @param namespaceURI Refer to the <code>Event.initEventNS()</code> method for a description of this parameter. @param typeArg Refer to the <code>Event.initEventNS()</code> method for a description of this parameter. @param canBubbleArg Refer to the <code>Event.initEventNS()</code> method for a description of this parameter. @param cancelableArg Refer to the <code>Event.initEventNS()</code> method for a description of this parameter. @param relatedNodeArg Refer to the <code>MutationEvent.initMutationEvent()</code> method for a description of this parameter. @param prevValueArg Refer to the <code>MutationEvent.initMutationEvent()</code> method for a description of this parameter. @param newValueArg Refer to the <code>MutationEvent.initMutationEvent()</code> method for a description of this parameter. @param attrNameArg Refer to the <code>MutationEvent.initMutationEvent()</code> method for a description of this parameter. @param attrChangeArg Refer to the <code>MutationEvent.initMutationEvent()</code> method for a description of this parameter. @since DOM Level 3 
public	TokenNamepublic	
void	TokenNamevoid	
initMutationEventNS	TokenNameIdentifier	 init Mutation Event NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
