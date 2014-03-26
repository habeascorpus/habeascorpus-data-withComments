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
MutationNameEvent	TokenNameIdentifier	 Mutation Name Event
;	TokenNameSEMICOLON	
/** * Class to implement DOM 3 MutationName events. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: DOMMutationNameEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Class to implement DOM 3 MutationName events. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: DOMMutationNameEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMMutationNameEvent	TokenNameIdentifier	 DOM Mutation Name Event
extends	TokenNameextends	
DOMMutationEvent	TokenNameIdentifier	 DOM Mutation Event
implements	TokenNameimplements	
MutationNameEvent	TokenNameIdentifier	 Mutation Name Event
{	TokenNameLBRACE	
/** * The node's previous namespace URI. */	TokenNameCOMMENT_JAVADOC	 The node's previous namespace URI. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
prevNamespaceURI	TokenNameIdentifier	 prev Namespace URI
;	TokenNameSEMICOLON	
/** * The node's previous name. */	TokenNameCOMMENT_JAVADOC	 The node's previous name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
prevNodeName	TokenNameIdentifier	 prev Node Name
;	TokenNameSEMICOLON	
/** * Initializes this MutationNameEvent. */	TokenNameCOMMENT_JAVADOC	 Initializes this MutationNameEvent. 
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
{	TokenNameLBRACE	
initMutationEvent	TokenNameIdentifier	 init Mutation Event
(	TokenNameLPAREN	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
relatedNodeArg	TokenNameIdentifier	 related Node Arg
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prevNamespaceURI	TokenNameIdentifier	 prev Namespace URI
=	TokenNameEQUAL	
prevNamespaceURIArg	TokenNameIdentifier	 prev Namespace URI Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prevNodeName	TokenNameIdentifier	 prev Node Name
=	TokenNameEQUAL	
prevNodeNameArg	TokenNameIdentifier	 prev Node Name Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this MutationNameEvent. */	TokenNameCOMMENT_JAVADOC	 Initializes this MutationNameEvent. 
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
{	TokenNameLBRACE	
initMutationEventNS	TokenNameIdentifier	 init Mutation Event NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
relatedNodeArg	TokenNameIdentifier	 related Node Arg
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prevNamespaceURI	TokenNameIdentifier	 prev Namespace URI
=	TokenNameEQUAL	
prevNamespaceURIArg	TokenNameIdentifier	 prev Namespace URI Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prevNodeName	TokenNameIdentifier	 prev Node Name
=	TokenNameEQUAL	
prevNodeNameArg	TokenNameIdentifier	 prev Node Name Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the node's previous namespace URI. */	TokenNameCOMMENT_JAVADOC	 Gets the node's previous namespace URI. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrevNamespaceURI	TokenNameIdentifier	 get Prev Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prevNamespaceURI	TokenNameIdentifier	 prev Namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the node's previous node name. */	TokenNameCOMMENT_JAVADOC	 Gets the node's previous node name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrevNodeName	TokenNameIdentifier	 get Prev Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prevNodeName	TokenNameIdentifier	 prev Node Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
