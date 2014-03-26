/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
timing	TokenNameIdentifier	 timing
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
DOMKeyEvent	TokenNameIdentifier	 DOM Key Event
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
NodeEventTarget	TokenNameIdentifier	 Node Event Target
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
events	TokenNameIdentifier	 events
.	TokenNameDOT	
Event	TokenNameIdentifier	 Event
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
EventListener	TokenNameIdentifier	 Event Listener
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
events	TokenNameIdentifier	 events
.	TokenNameDOT	
KeyboardEvent	TokenNameIdentifier	 Keyboard Event
;	TokenNameSEMICOLON	
/** * A class to handle SMIL access key timing specifiers. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AccesskeyTimingSpecifier.java 580338 2007-09-28 13:13:46Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class to handle SMIL access key timing specifiers. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AccesskeyTimingSpecifier.java 580338 2007-09-28 13:13:46Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AccesskeyTimingSpecifier	TokenNameIdentifier	 Accesskey Timing Specifier
extends	TokenNameextends	
EventLikeTimingSpecifier	TokenNameIdentifier	 Event Like Timing Specifier
implements	TokenNameimplements	
EventListener	TokenNameIdentifier	 Event Listener
{	TokenNameLBRACE	
/** * The accesskey. */	TokenNameCOMMENT_JAVADOC	 The accesskey. 
protected	TokenNameprotected	
char	TokenNamechar	
accesskey	TokenNameIdentifier	 accesskey
;	TokenNameSEMICOLON	
/** * Whether this access key specifier uses SVG 1.2 syntax. */	TokenNameCOMMENT_JAVADOC	 Whether this access key specifier uses SVG 1.2 syntax. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isSVG12AccessKey	TokenNameIdentifier	 is SV G12 Access Key
;	TokenNameSEMICOLON	
/** * The DOM 3 key name for SVG 1.2 access key specifiers. */	TokenNameCOMMENT_JAVADOC	 The DOM 3 key name for SVG 1.2 access key specifiers. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
keyName	TokenNameIdentifier	 key Name
;	TokenNameSEMICOLON	
/** * Creates a new AccesskeyTimingSpecifier object using SVG 1.1 * or SMIL syntax. */	TokenNameCOMMENT_JAVADOC	 Creates a new AccesskeyTimingSpecifier object using SVG 1.1 or SMIL syntax. 
public	TokenNamepublic	
AccesskeyTimingSpecifier	TokenNameIdentifier	 Accesskey Timing Specifier
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
char	TokenNamechar	
accesskey	TokenNameIdentifier	 accesskey
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
accesskey	TokenNameIdentifier	 accesskey
=	TokenNameEQUAL	
accesskey	TokenNameIdentifier	 accesskey
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AccesskeyTimingSpecifier object using SVG 1.2 syntax. */	TokenNameCOMMENT_JAVADOC	 Creates a new AccesskeyTimingSpecifier object using SVG 1.2 syntax. 
public	TokenNamepublic	
AccesskeyTimingSpecifier	TokenNameIdentifier	 Accesskey Timing Specifier
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
keyName	TokenNameIdentifier	 key Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isSVG12AccessKey	TokenNameIdentifier	 is SV G12 Access Key
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keyName	TokenNameIdentifier	 key Name
=	TokenNameEQUAL	
keyName	TokenNameIdentifier	 key Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representation of this timing specifier. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this timing specifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSVG12AccessKey	TokenNameIdentifier	 is SV G12 Access Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"accessKey("	TokenNameStringLiteral	accessKey(
+	TokenNamePLUS	
keyName	TokenNameIdentifier	 key Name
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
"accesskey("	TokenNameStringLiteral	accesskey(
+	TokenNamePLUS	
accesskey	TokenNameIdentifier	 accesskey
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this timing specifier by adding the initial instance time * to the owner's instance time list or setting up any event listeners. */	TokenNameCOMMENT_JAVADOC	 Initializes this timing specifier by adding the initial instance time to the owner's instance time list or setting up any event listeners. 
public	TokenNamepublic	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSVG12AccessKey	TokenNameIdentifier	 is SV G12 Access Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
eventTarget	TokenNameIdentifier	 event Target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
)	TokenNameRPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getRootEventTarget	TokenNameIdentifier	 get Root Event Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventTarget	TokenNameIdentifier	 event Target
.	TokenNameDOT	
addEventListenerNS	TokenNameIdentifier	 add Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"keydown"	TokenNameStringLiteral	keydown
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
EventTarget	TokenNameIdentifier	 Event Target
eventTarget	TokenNameIdentifier	 event Target
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getRootEventTarget	TokenNameIdentifier	 get Root Event Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventTarget	TokenNameIdentifier	 event Target
.	TokenNameDOT	
addEventListener	TokenNameIdentifier	 add Event Listener
(	TokenNameLPAREN	
"keypress"	TokenNameStringLiteral	keypress
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Deinitializes this timing specifier by removing any event listeners. */	TokenNameCOMMENT_JAVADOC	 Deinitializes this timing specifier by removing any event listeners. 
public	TokenNamepublic	
void	TokenNamevoid	
deinitialize	TokenNameIdentifier	 deinitialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSVG12AccessKey	TokenNameIdentifier	 is SV G12 Access Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
eventTarget	TokenNameIdentifier	 event Target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeEventTarget	TokenNameIdentifier	 Node Event Target
)	TokenNameRPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getRootEventTarget	TokenNameIdentifier	 get Root Event Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventTarget	TokenNameIdentifier	 event Target
.	TokenNameDOT	
removeEventListenerNS	TokenNameIdentifier	 remove Event Listener NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_EVENTS_NAMESPACE_URI	TokenNameIdentifier	 XML  EVENTS  NAMESPACE  URI
,	TokenNameCOMMA	
"keydown"	TokenNameStringLiteral	keydown
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
EventTarget	TokenNameIdentifier	 Event Target
eventTarget	TokenNameIdentifier	 event Target
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getRootEventTarget	TokenNameIdentifier	 get Root Event Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eventTarget	TokenNameIdentifier	 event Target
.	TokenNameDOT	
removeEventListener	TokenNameIdentifier	 remove Event Listener
(	TokenNameLPAREN	
"keypress"	TokenNameStringLiteral	keypress
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// EventListener ///////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	EventListener ///////////////////////////////////////////////////////// 
/** * Handles key events fired by the eventbase element. */	TokenNameCOMMENT_JAVADOC	 Handles key events fired by the eventbase element. 
public	TokenNamepublic	
void	TokenNamevoid	
handleEvent	TokenNameIdentifier	 handle Event
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
matched	TokenNameIdentifier	 matched
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'p'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// DOM 2 key draft keypress 	TokenNameCOMMENT_LINE	DOM 2 key draft keypress 
DOMKeyEvent	TokenNameIdentifier	 DOM Key Event
evt	TokenNameIdentifier	 evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMKeyEvent	TokenNameIdentifier	 DOM Key Event
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
matched	TokenNameIdentifier	 matched
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getCharCode	TokenNameIdentifier	 get Char Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
accesskey	TokenNameIdentifier	 accesskey
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// DOM 3 keydown 	TokenNameCOMMENT_LINE	DOM 3 keydown 
KeyboardEvent	TokenNameIdentifier	 Keyboard Event
evt	TokenNameIdentifier	 evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeyboardEvent	TokenNameIdentifier	 Keyboard Event
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
matched	TokenNameIdentifier	 matched
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getKeyIdentifier	TokenNameIdentifier	 get Key Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyName	TokenNameIdentifier	 key Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
)	TokenNameRPAREN	
{	TokenNameLBRACE	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
eventOccurred	TokenNameIdentifier	 event Occurred
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Invoked to resolve an event-like timing specifier into an instance time. */	TokenNameCOMMENT_JAVADOC	 Invoked to resolve an event-like timing specifier into an instance time. 
public	TokenNamepublic	
void	TokenNamevoid	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
convertEpochTime	TokenNameIdentifier	 convert Epoch Time
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTimeStamp	TokenNameIdentifier	 get Time Stamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstanceTime	TokenNameIdentifier	 Instance Time
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
InstanceTime	TokenNameIdentifier	 Instance Time
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
addInstanceTime	TokenNameIdentifier	 add Instance Time
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
