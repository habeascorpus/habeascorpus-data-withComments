/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
GraphicsNode	TokenNameIdentifier	 Graphics Node
;	TokenNameSEMICOLON	
/** * An event which indicates that a mouse whwel action occurred in a graphics * node. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: GraphicsNodeMouseWheelEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An event which indicates that a mouse whwel action occurred in a graphics node. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: GraphicsNodeMouseWheelEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GraphicsNodeMouseWheelEvent	TokenNameIdentifier	 Graphics Node Mouse Wheel Event
extends	TokenNameextends	
GraphicsNodeInputEvent	TokenNameIdentifier	 Graphics Node Input Event
{	TokenNameLBRACE	
/** * The id for the "mouseWheelMoved" event. */	TokenNameCOMMENT_JAVADOC	 The id for the "mouseWheelMoved" event. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MOUSE_WHEEL	TokenNameIdentifier	 MOUSE  WHEEL
=	TokenNameEQUAL	
600	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates the number of wheel notches have been moved. * Positive for scrolling up/left, negative for down/right. */	TokenNameCOMMENT_JAVADOC	 Indicates the number of wheel notches have been moved. Positive for scrolling up/left, negative for down/right. 
protected	TokenNameprotected	
int	TokenNameint	
wheelDelta	TokenNameIdentifier	 wheel Delta
;	TokenNameSEMICOLON	
/** * Constructs a new graphics node mouse wheel event. * @param source the graphics node where the event originated * @param id the id of this event * @param when the time the event occurred * @param wheelDelta the number of clicks */	TokenNameCOMMENT_JAVADOC	 Constructs a new graphics node mouse wheel event. @param source the graphics node where the event originated @param id the id of this event @param when the time the event occurred @param wheelDelta the number of clicks 
public	TokenNamepublic	
GraphicsNodeMouseWheelEvent	TokenNameIdentifier	 Graphics Node Mouse Wheel Event
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
int	TokenNameint	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
long	TokenNamelong	
when	TokenNameIdentifier	 when
,	TokenNameCOMMA	
int	TokenNameint	
modifiers	TokenNameIdentifier	 modifiers
,	TokenNameCOMMA	
int	TokenNameint	
lockState	TokenNameIdentifier	 lock State
,	TokenNameCOMMA	
int	TokenNameint	
wheelDelta	TokenNameIdentifier	 wheel Delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
when	TokenNameIdentifier	 when
,	TokenNameCOMMA	
modifiers	TokenNameIdentifier	 modifiers
,	TokenNameCOMMA	
lockState	TokenNameIdentifier	 lock State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
wheelDelta	TokenNameIdentifier	 wheel Delta
=	TokenNameEQUAL	
wheelDelta	TokenNameIdentifier	 wheel Delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of clicks the wheel has been moved. */	TokenNameCOMMENT_JAVADOC	 Returns the number of clicks the wheel has been moved. 
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
}	TokenNameRBRACE	
