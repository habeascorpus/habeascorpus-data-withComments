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
Calendar	TokenNameIdentifier	 Calendar
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
timing	TokenNameIdentifier	 timing
.	TokenNameDOT	
TimedElement	TokenNameIdentifier	 Timed Element
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
DOMTimeEvent	TokenNameIdentifier	 DOM Time Event
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
IdContainer	TokenNameIdentifier	 Id Container
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
SVGOMAnimationElement	TokenNameIdentifier	 SVGOM Animation Element
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
SVGOMUseShadowRoot	TokenNameIdentifier	 SVGOM Use Shadow Root
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
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
DocumentEvent	TokenNameIdentifier	 Document Event
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
EventTarget	TokenNameIdentifier	 Event Target
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
smil	TokenNameIdentifier	 smil
.	TokenNameDOT	
TimeEvent	TokenNameIdentifier	 Time Event
;	TokenNameSEMICOLON	
/** * Class that provides utilities for animation support. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimationSupport.java 579494 2007-09-26 07:40:20Z cam $ */	TokenNameCOMMENT_JAVADOC	 Class that provides utilities for animation support. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimationSupport.java 579494 2007-09-26 07:40:20Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AnimationSupport	TokenNameIdentifier	 Animation Support
{	TokenNameLBRACE	
/** * Fires a {@link TimeEvent} on the given {@link EventTarget}. */	TokenNameCOMMENT_JAVADOC	 Fires a {@link TimeEvent} on the given {@link EventTarget}. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
fireTimeEvent	TokenNameIdentifier	 fire Time Event
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
int	TokenNameint	
detail	TokenNameIdentifier	 detail
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentEvent	TokenNameIdentifier	 Document Event
de	TokenNameIdentifier	 de
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMTimeEvent	TokenNameIdentifier	 DOM Time Event
evt	TokenNameIdentifier	 evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMTimeEvent	TokenNameIdentifier	 DOM Time Event
)	TokenNameRPAREN	
de	TokenNameIdentifier	 de
.	TokenNameDOT	
createEvent	TokenNameIdentifier	 create Event
(	TokenNameLPAREN	
"TimeEvent"	TokenNameStringLiteral	TimeEvent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
initTimeEventNS	TokenNameIdentifier	 init Time Event NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
detail	TokenNameIdentifier	 detail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
setTimestamp	TokenNameIdentifier	 set Timestamp
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
dispatchEvent	TokenNameIdentifier	 dispatch Event
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the timed element with the given ID, using the given node * as the context for the lookup. */	TokenNameCOMMENT_JAVADOC	 Returns the timed element with the given ID, using the given node as the context for the lookup. 
public	TokenNamepublic	
static	TokenNamestatic	
TimedElement	TokenNameIdentifier	 Timed Element
getTimedElementById	TokenNameIdentifier	 get Timed Element By Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
SVGOMAnimationElement	TokenNameIdentifier	 SVGOM Animation Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGAnimationElementBridge	TokenNameIdentifier	 SVG Animation Element Bridge
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGAnimationElementBridge	TokenNameIdentifier	 SVG Animation Element Bridge
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGOMAnimationElement	TokenNameIdentifier	 SVGOM Animation Element
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
getTimedElement	TokenNameIdentifier	 get Timed Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the event target with the given ID, using the given * node as the context for the lookup. */	TokenNameCOMMENT_JAVADOC	 Returns the event target with the given ID, using the given node as the context for the lookup. 
public	TokenNamepublic	
static	TokenNamestatic	
EventTarget	TokenNameIdentifier	 Event Target
getEventTargetById	TokenNameIdentifier	 get Event Target By Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
)	TokenNameRPAREN	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the element with the given ID, using the given node * as the context for the lookup. */	TokenNameCOMMENT_JAVADOC	 Returns the element with the given ID, using the given node as the context for the lookup. 
protected	TokenNameprotected	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
instanceof	TokenNameinstanceof	
SVGOMUseShadowRoot	TokenNameIdentifier	 SVGOM Use Shadow Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGOMUseShadowRoot	TokenNameIdentifier	 SVGOM Use Shadow Root
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
.	TokenNameDOT	
getCSSParentNode	TokenNameIdentifier	 get CSS Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
instanceof	TokenNameinstanceof	
IdContainer	TokenNameIdentifier	 Id Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
IdContainer	TokenNameIdentifier	 Id Container
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
.	TokenNameDOT	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
