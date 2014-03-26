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
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
views	TokenNameIdentifier	 views
.	TokenNameDOT	
AbstractView	TokenNameIdentifier	 Abstract View
;	TokenNameSEMICOLON	
/** * SVG 1.2 mouse wheel event. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVGOMWheelEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 SVG 1.2 mouse wheel event. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVGOMWheelEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMWheelEvent	TokenNameIdentifier	 SVGOM Wheel Event
extends	TokenNameextends	
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
{	TokenNameLBRACE	
/** * The number of clicks the mouse wheel has been moved. */	TokenNameCOMMENT_JAVADOC	 The number of clicks the mouse wheel has been moved. 
protected	TokenNameprotected	
int	TokenNameint	
wheelDelta	TokenNameIdentifier	 wheel Delta
;	TokenNameSEMICOLON	
/** * Returns the number of mouse wheel clicks. */	TokenNameCOMMENT_JAVADOC	 Returns the number of mouse wheel clicks. 
public	TokenNamepublic	
int	TokenNameint	
getWheelDelta	TokenNameIdentifier	 get Wheel Delta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
wheelDelta	TokenNameIdentifier	 wheel Delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this SVGOMWheelEvent object. * @param typeArg Specifies the event type. * @param canBubbleArg Specifies whether or not the event can bubble. * @param cancelableArg Specifies whether or not the event's default action * can be prevented. * @param viewArg Specifies the <code>Event</code>'s * <code>AbstractView</code>. * @param wheelDeltaArg Specifices the number of clicks the mouse wheel has * been moved. */	TokenNameCOMMENT_JAVADOC	 Initializes this SVGOMWheelEvent object. @param typeArg Specifies the event type. @param canBubbleArg Specifies whether or not the event can bubble. @param cancelableArg Specifies whether or not the event's default action can be prevented. @param viewArg Specifies the <code>Event</code>'s <code>AbstractView</code>. @param wheelDeltaArg Specifices the number of clicks the mouse wheel has been moved. 
public	TokenNamepublic	
void	TokenNamevoid	
initWheelEvent	TokenNameIdentifier	 init Wheel Event
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
AbstractView	TokenNameIdentifier	 Abstract View
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
int	TokenNameint	
wheelDeltaArg	TokenNameIdentifier	 wheel Delta Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initUIEvent	TokenNameIdentifier	 init UI Event
(	TokenNameLPAREN	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wheelDelta	TokenNameIdentifier	 wheel Delta
=	TokenNameEQUAL	
wheelDeltaArg	TokenNameIdentifier	 wheel Delta Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this KeyboardEvent object. * @param namespaceURIArg Specifies the event namespace URI. * @param typeArg Specifies the event type. * @param canBubbleArg Specifies whether or not the event can bubble. * @param cancelableArg Specifies whether or not the event's default action * can be prevented. * @param viewArg Specifies the <code>Event</code>'s * <code>AbstractView</code>. * @param wheelDeltaArg Specifices the number of clicks the mouse wheel has * been moved. */	TokenNameCOMMENT_JAVADOC	 Initializes this KeyboardEvent object. @param namespaceURIArg Specifies the event namespace URI. @param typeArg Specifies the event type. @param canBubbleArg Specifies whether or not the event can bubble. @param cancelableArg Specifies whether or not the event's default action can be prevented. @param viewArg Specifies the <code>Event</code>'s <code>AbstractView</code>. @param wheelDeltaArg Specifices the number of clicks the mouse wheel has been moved. 
public	TokenNamepublic	
void	TokenNamevoid	
initWheelEventNS	TokenNameIdentifier	 init Wheel Event NS
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
AbstractView	TokenNameIdentifier	 Abstract View
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
int	TokenNameint	
wheelDeltaArg	TokenNameIdentifier	 wheel Delta Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initUIEventNS	TokenNameIdentifier	 init UI Event NS
(	TokenNameLPAREN	
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wheelDelta	TokenNameIdentifier	 wheel Delta
=	TokenNameEQUAL	
wheelDeltaArg	TokenNameIdentifier	 wheel Delta Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
