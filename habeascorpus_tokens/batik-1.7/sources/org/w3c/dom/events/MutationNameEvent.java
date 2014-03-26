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
/** * The <code>MutationNameEvent</code> interface provides specific contextual * information associated with Mutation name event types. * <p> To create an instance of the <code>MutationNameEvent</code> interface, * use the <code>Document.createEvent("MutationNameEvent")</code> method * call. * <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 The <code>MutationNameEvent</code> interface provides specific contextual information associated with Mutation name event types. <p> To create an instance of the <code>MutationNameEvent</code> interface, use the <code>Document.createEvent("MutationNameEvent")</code> method call. <p>See also the <a href='http://www.w3.org/TR/2006/WD-DOM-Level-3-Events-20060413'> Document Object Model (DOM) Level 3 Events Specification </a>. @since DOM Level 3 
public	TokenNamepublic	
interface	TokenNameinterface	
MutationNameEvent	TokenNameIdentifier	 Mutation Name Event
extends	TokenNameextends	
MutationEvent	TokenNameIdentifier	 Mutation Event
{	TokenNameLBRACE	
/** * The previous value of the <code>relatedNode</code>'s * <code>namespaceURI</code>. */	TokenNameCOMMENT_JAVADOC	 The previous value of the <code>relatedNode</code>'s <code>namespaceURI</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrevNamespaceURI	TokenNameIdentifier	 get Prev Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The previous value of the <code>relatedNode</code>'s * <code>nodeName</code>. */	TokenNameCOMMENT_JAVADOC	 The previous value of the <code>relatedNode</code>'s <code>nodeName</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrevNodeName	TokenNameIdentifier	 get Prev Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>initMutationNameEvent</code> method is used to initialize * the value of a <code>MutationNameEvent</code> object and has the same * behavior as <code>MutationEvent.initMutationEvent()</code>. * @param typeArg Refer to the * <code>MutationEvent.initMutationEvent()</code> method for a * description of this parameter. * @param canBubbleArg Refer to the * <code>MutationEvent.initMutationEvent()</code> method for a * description of this parameter. * @param cancelableArg Refer to the * <code>MutationEvent.initMutationEvent()</code> method for a * description of this parameter. * @param relatedNodeArg Refer to the * <code>MutationEvent.initMutationEvent()</code> method for a * description of this parameter. * @param prevNamespaceURIArg Specifies * <code>MutationNameEvent.prevNamespaceURI</code>. This value may be * <code>null</code>. * @param prevNodeNameArg Specifies * <code>MutationNameEvent.prevNodeName</code>. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 The <code>initMutationNameEvent</code> method is used to initialize the value of a <code>MutationNameEvent</code> object and has the same behavior as <code>MutationEvent.initMutationEvent()</code>. @param typeArg Refer to the <code>MutationEvent.initMutationEvent()</code> method for a description of this parameter. @param canBubbleArg Refer to the <code>MutationEvent.initMutationEvent()</code> method for a description of this parameter. @param cancelableArg Refer to the <code>MutationEvent.initMutationEvent()</code> method for a description of this parameter. @param relatedNodeArg Refer to the <code>MutationEvent.initMutationEvent()</code> method for a description of this parameter. @param prevNamespaceURIArg Specifies <code>MutationNameEvent.prevNamespaceURI</code>. This value may be <code>null</code>. @param prevNodeNameArg Specifies <code>MutationNameEvent.prevNodeName</code>. @since DOM Level 3 
public	TokenNamepublic	
void	TokenNamevoid	
initMutationNameEvent	TokenNameIdentifier	 init Mutation Name Event
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
prevNamespaceURIArg	TokenNameIdentifier	 prev Namespace URI Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prevNodeNameArg	TokenNameIdentifier	 prev Node Name Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The <code>initMutationNameEventNS</code> method is used to initialize * the value of a <code>MutationNameEvent</code> object and has the same * behavior as <code>MutationEvent.initMutationEventNS()</code>. * @param namespaceURI Refer to the * <code>MutationEvent.initMutationEventNS()</code> method for a * description of this parameter. * @param typeArg Refer to the * <code>MutationEvent.initMutationEventNS()</code> method for a * description of this parameter. * @param canBubbleArg Refer to the * <code>MutationEvent.initMutationEventNS()</code> method for a * description of this parameter. * @param cancelableArg Refer to the * <code>MutationEvent.initMutationEventNS()</code> method for a * description of this parameter. * @param relatedNodeArg Refer to the * <code>MutationEvent.initMutationEventNS()</code> method for a * description of this parameter. * @param prevNamespaceURIArg Refer to the * <code>MutationEvent.initMutationEvent()</code> method for a * description of this parameter. * @param prevNodeNameArg Refer to the * <code>MutationEvent.initMutationEvent()</code> method for a * description of this parameter. * @since DOM Level 3 */	TokenNameCOMMENT_JAVADOC	 The <code>initMutationNameEventNS</code> method is used to initialize the value of a <code>MutationNameEvent</code> object and has the same behavior as <code>MutationEvent.initMutationEventNS()</code>. @param namespaceURI Refer to the <code>MutationEvent.initMutationEventNS()</code> method for a description of this parameter. @param typeArg Refer to the <code>MutationEvent.initMutationEventNS()</code> method for a description of this parameter. @param canBubbleArg Refer to the <code>MutationEvent.initMutationEventNS()</code> method for a description of this parameter. @param cancelableArg Refer to the <code>MutationEvent.initMutationEventNS()</code> method for a description of this parameter. @param relatedNodeArg Refer to the <code>MutationEvent.initMutationEventNS()</code> method for a description of this parameter. @param prevNamespaceURIArg Refer to the <code>MutationEvent.initMutationEvent()</code> method for a description of this parameter. @param prevNodeNameArg Refer to the <code>MutationEvent.initMutationEvent()</code> method for a description of this parameter. @since DOM Level 3 
public	TokenNamepublic	
void	TokenNamevoid	
initMutationNameEventNS	TokenNameIdentifier	 init Mutation Name Event NS
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
prevNamespaceURIArg	TokenNameIdentifier	 prev Namespace URI Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prevNodeNameArg	TokenNameIdentifier	 prev Node Name Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
