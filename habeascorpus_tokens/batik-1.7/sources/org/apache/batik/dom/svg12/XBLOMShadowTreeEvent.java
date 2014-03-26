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
svg12	TokenNameIdentifier	 svg12
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
events	TokenNameIdentifier	 events
.	TokenNameDOT	
AbstractEvent	TokenNameIdentifier	 Abstract Event
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
xbl	TokenNameIdentifier	 xbl
.	TokenNameDOT	
ShadowTreeEvent	TokenNameIdentifier	 Shadow Tree Event
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
xbl	TokenNameIdentifier	 xbl
.	TokenNameDOT	
XBLShadowTreeElement	TokenNameIdentifier	 XBL Shadow Tree Element
;	TokenNameSEMICOLON	
/** * This class implements the {@link ShadowTreeEvent} event class. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: XBLOMShadowTreeEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link ShadowTreeEvent} event class. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: XBLOMShadowTreeEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
XBLOMShadowTreeEvent	TokenNameIdentifier	 XBLOM Shadow Tree Event
extends	TokenNameextends	
AbstractEvent	TokenNameIdentifier	 Abstract Event
implements	TokenNameimplements	
ShadowTreeEvent	TokenNameIdentifier	 Shadow Tree Event
{	TokenNameLBRACE	
/** * The shadow tree that is the object of this event. */	TokenNameCOMMENT_JAVADOC	 The shadow tree that is the object of this event. 
protected	TokenNameprotected	
XBLShadowTreeElement	TokenNameIdentifier	 XBL Shadow Tree Element
xblShadowTree	TokenNameIdentifier	 xbl Shadow Tree
;	TokenNameSEMICOLON	
/** * Returns the shadow tree that is the object of this event. */	TokenNameCOMMENT_JAVADOC	 Returns the shadow tree that is the object of this event. 
public	TokenNamepublic	
XBLShadowTreeElement	TokenNameIdentifier	 XBL Shadow Tree Element
getXblShadowTree	TokenNameIdentifier	 get Xbl Shadow Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xblShadowTree	TokenNameIdentifier	 xbl Shadow Tree
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this event object. */	TokenNameCOMMENT_JAVADOC	 Initializes this event object. 
public	TokenNamepublic	
void	TokenNamevoid	
initShadowTreeEvent	TokenNameIdentifier	 init Shadow Tree Event
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
XBLShadowTreeElement	TokenNameIdentifier	 XBL Shadow Tree Element
xblShadowTreeArg	TokenNameIdentifier	 xbl Shadow Tree Arg
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
xblShadowTree	TokenNameIdentifier	 xbl Shadow Tree
=	TokenNameEQUAL	
xblShadowTreeArg	TokenNameIdentifier	 xbl Shadow Tree Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this event object with a namespaced event type. */	TokenNameCOMMENT_JAVADOC	 Initializes this event object with a namespaced event type. 
public	TokenNamepublic	
void	TokenNamevoid	
initShadowTreeEventNS	TokenNameIdentifier	 init Shadow Tree Event NS
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
XBLShadowTreeElement	TokenNameIdentifier	 XBL Shadow Tree Element
xblShadowTreeArg	TokenNameIdentifier	 xbl Shadow Tree Arg
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
xblShadowTree	TokenNameIdentifier	 xbl Shadow Tree
=	TokenNameEQUAL	
xblShadowTreeArg	TokenNameIdentifier	 xbl Shadow Tree Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
