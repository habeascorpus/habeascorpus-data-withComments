/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
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
/** * An implementation of the DOM Level 2 <code>MutationEvent</code> interface. * * @xerces.internal * * @version $Id: MutationEventImpl.java 533531 2007-04-29 17:24:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 An implementation of the DOM Level 2 <code>MutationEvent</code> interface. * @xerces.internal * @version $Id: MutationEventImpl.java 533531 2007-04-29 17:24:58Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
MutationEventImpl	TokenNameIdentifier	 Mutation Event Impl
extends	TokenNameextends	
EventImpl	TokenNameIdentifier	 Event Impl
implements	TokenNameimplements	
MutationEvent	TokenNameIdentifier	 Mutation Event
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
relatedNode	TokenNameIdentifier	 related Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prevValue	TokenNameIdentifier	 prev Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// REVISIT: The DOM Level 2 PR has a bug: the init method should let this 	TokenNameCOMMENT_LINE	REVISIT: The DOM Level 2 PR has a bug: the init method should let this 
// attribute be specified. Since it doesn't we have to give write access. 	TokenNameCOMMENT_LINE	attribute be specified. Since it doesn't we have to give write access. 
public	TokenNamepublic	
short	TokenNameshort	
attrChange	TokenNameIdentifier	 attr Change
;	TokenNameSEMICOLON	
// NON-DOM CONSTANTS: Storage efficiency, avoid risk of typos. 	TokenNameCOMMENT_LINE	NON-DOM CONSTANTS: Storage efficiency, avoid risk of typos. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_SUBTREE_MODIFIED	TokenNameIdentifier	 DOM  SUBTREE  MODIFIED
=	TokenNameEQUAL	
"DOMSubtreeModified"	TokenNameStringLiteral	DOMSubtreeModified
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_NODE_INSERTED	TokenNameIdentifier	 DOM  NODE  INSERTED
=	TokenNameEQUAL	
"DOMNodeInserted"	TokenNameStringLiteral	DOMNodeInserted
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_NODE_REMOVED	TokenNameIdentifier	 DOM  NODE  REMOVED
=	TokenNameEQUAL	
"DOMNodeRemoved"	TokenNameStringLiteral	DOMNodeRemoved
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_NODE_REMOVED_FROM_DOCUMENT	TokenNameIdentifier	 DOM  NODE  REMOVED  FROM  DOCUMENT
=	TokenNameEQUAL	
"DOMNodeRemovedFromDocument"	TokenNameStringLiteral	DOMNodeRemovedFromDocument
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_NODE_INSERTED_INTO_DOCUMENT	TokenNameIdentifier	 DOM  NODE  INSERTED  INTO  DOCUMENT
=	TokenNameEQUAL	
"DOMNodeInsertedIntoDocument"	TokenNameStringLiteral	DOMNodeInsertedIntoDocument
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_ATTR_MODIFIED	TokenNameIdentifier	 DOM  ATTR  MODIFIED
=	TokenNameEQUAL	
"DOMAttrModified"	TokenNameStringLiteral	DOMAttrModified
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOM_CHARACTER_DATA_MODIFIED	TokenNameIdentifier	 DOM  CHARACTER  DATA  MODIFIED
=	TokenNameEQUAL	
"DOMCharacterDataModified"	TokenNameStringLiteral	DOMCharacterDataModified
;	TokenNameSEMICOLON	
/** * @return the name of the Attr which * changed, for DOMAttrModified events. * Undefined for others. */	TokenNameCOMMENT_JAVADOC	 @return the name of the Attr which changed, for DOMAttrModified events. Undefined for others. 
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
/** * <code>attrChange</code> indicates the type of change which triggered * the DOMAttrModified event. The values can be <code>MODIFICATION</code> * , <code>ADDITION</code>, or <code>REMOVAL</code>. */	TokenNameCOMMENT_JAVADOC	 <code>attrChange</code> indicates the type of change which triggered the DOMAttrModified event. The values can be <code>MODIFICATION</code> , <code>ADDITION</code>, or <code>REMOVAL</code>. 
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
/** * @return the new string value of the Attr for DOMAttrModified events, or * of the CharacterData node for DOMCharDataModifed events. * Undefined for others. */	TokenNameCOMMENT_JAVADOC	 @return the new string value of the Attr for DOMAttrModified events, or of the CharacterData node for DOMCharDataModifed events. Undefined for others. 
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
/** * @return the previous string value of the Attr for DOMAttrModified events, or * of the CharacterData node for DOMCharDataModifed events. * Undefined for others. */	TokenNameCOMMENT_JAVADOC	 @return the previous string value of the Attr for DOMAttrModified events, or of the CharacterData node for DOMCharDataModifed events. Undefined for others. 
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
/** * @return a Node related to this event, other than the target that the * node was dispatched to. For DOMNodeRemoved, it is the node which * was removed. * No other uses are currently defined. */	TokenNameCOMMENT_JAVADOC	 @return a Node related to this event, other than the target that the node was dispatched to. For DOMNodeRemoved, it is the node which was removed. No other uses are currently defined. 
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
/** * Initialize a mutation event, or overwrite the event's current * settings with new values of the parameters. */	TokenNameCOMMENT_JAVADOC	 Initialize a mutation event, or overwrite the event's current settings with new values of the parameters. 
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
relatedNode	TokenNameIdentifier	 related Node
=	TokenNameEQUAL	
relatedNodeArg	TokenNameIdentifier	 related Node Arg
;	TokenNameSEMICOLON	
prevValue	TokenNameIdentifier	 prev Value
=	TokenNameEQUAL	
prevValueArg	TokenNameIdentifier	 prev Value Arg
;	TokenNameSEMICOLON	
newValue	TokenNameIdentifier	 new Value
=	TokenNameEQUAL	
newValueArg	TokenNameIdentifier	 new Value Arg
;	TokenNameSEMICOLON	
attrName	TokenNameIdentifier	 attr Name
=	TokenNameEQUAL	
attrNameArg	TokenNameIdentifier	 attr Name Arg
;	TokenNameSEMICOLON	
attrChange	TokenNameIdentifier	 attr Change
=	TokenNameEQUAL	
attrChangeArg	TokenNameIdentifier	 attr Change Arg
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
initEvent	TokenNameIdentifier	 init Event
(	TokenNameLPAREN	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
