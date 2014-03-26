/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
.	TokenNameDOT	
rhino	TokenNameIdentifier	 rhino
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
svg12	TokenNameIdentifier	 svg12
.	TokenNameDOT	
SVGGlobal	TokenNameIdentifier	 SVG Global
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
.	TokenNameDOT	
rhino	TokenNameIdentifier	 rhino
.	TokenNameDOT	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
Context	TokenNameIdentifier	 Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
Function	TokenNameIdentifier	 Function
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
NativeJavaObject	TokenNameIdentifier	 Native Java Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
Scriptable	TokenNameIdentifier	 Scriptable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
ScriptableObject	TokenNameIdentifier	 Scriptable Object
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
/** * Wrapper class for the SVGGlobal object. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: GlobalWrapper.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Wrapper class for the SVGGlobal object. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: GlobalWrapper.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GlobalWrapper	TokenNameIdentifier	 Global Wrapper
extends	TokenNameextends	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
{	TokenNameLBRACE	
/** * Creates a new GlobalWrapper. */	TokenNameCOMMENT_JAVADOC	 Creates a new GlobalWrapper. 
public	TokenNamepublic	
GlobalWrapper	TokenNameIdentifier	 Global Wrapper
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"startMouseCapture"	TokenNameStringLiteral	startMouseCapture
,	TokenNameCOMMA	
"stopMouseCapture"	TokenNameStringLiteral	stopMouseCapture
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
defineFunctionProperties	TokenNameIdentifier	 define Function Properties
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
,	TokenNameCOMMA	
GlobalWrapper	TokenNameIdentifier	 Global Wrapper
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
ScriptableObject	TokenNameIdentifier	 Scriptable Object
.	TokenNameDOT	
DONTENUM	TokenNameIdentifier	 DONTENUM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"SVGGlobal"	TokenNameStringLiteral	SVGGlobal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[object SVGGlobal]"	TokenNameStringLiteral	[object SVGGlobal]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wraps the 'startMouseCapture' method of the SVGGlobal interface. */	TokenNameCOMMENT_JAVADOC	 Wraps the 'startMouseCapture' method of the SVGGlobal interface. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
startMouseCapture	TokenNameIdentifier	 start Mouse Capture
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
funObj	TokenNameIdentifier	 fun Obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
GlobalWrapper	TokenNameIdentifier	 Global Wrapper
gw	TokenNameIdentifier	 gw
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GlobalWrapper	TokenNameIdentifier	 Global Wrapper
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
SVGGlobal	TokenNameIdentifier	 SVG Global
global	TokenNameIdentifier	 global
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGGlobal	TokenNameIdentifier	 SVG Global
)	TokenNameRPAREN	
gw	TokenNameIdentifier	 gw
.	TokenNameDOT	
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>=	TokenNameGREATER_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventTarget	TokenNameIdentifier	 Event Target
et	TokenNameIdentifier	 et
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
NativeJavaObject	TokenNameIdentifier	 Native Java Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NativeJavaObject	TokenNameIdentifier	 Native Java Object
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
EventTarget	TokenNameIdentifier	 Event Target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
et	TokenNameIdentifier	 et
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
et	TokenNameIdentifier	 et
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
reportRuntimeError	TokenNameIdentifier	 report Runtime Error
(	TokenNameLPAREN	
"First argument to startMouseCapture must be an EventTarget"	TokenNameStringLiteral	First argument to startMouseCapture must be an EventTarget
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
sendAll	TokenNameIdentifier	 send All
=	TokenNameEQUAL	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
autoRelease	TokenNameIdentifier	 auto Release
=	TokenNameEQUAL	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
global	TokenNameIdentifier	 global
.	TokenNameDOT	
startMouseCapture	TokenNameIdentifier	 start Mouse Capture
(	TokenNameLPAREN	
et	TokenNameIdentifier	 et
,	TokenNameCOMMA	
sendAll	TokenNameIdentifier	 send All
,	TokenNameCOMMA	
autoRelease	TokenNameIdentifier	 auto Release
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Wraps the 'stopMouseCapture' method of the SVGGlobal interface. */	TokenNameCOMMENT_JAVADOC	 Wraps the 'stopMouseCapture' method of the SVGGlobal interface. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
stopMouseCapture	TokenNameIdentifier	 stop Mouse Capture
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
funObj	TokenNameIdentifier	 fun Obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlobalWrapper	TokenNameIdentifier	 Global Wrapper
gw	TokenNameIdentifier	 gw
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GlobalWrapper	TokenNameIdentifier	 Global Wrapper
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
SVGGlobal	TokenNameIdentifier	 SVG Global
global	TokenNameIdentifier	 global
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGGlobal	TokenNameIdentifier	 SVG Global
)	TokenNameRPAREN	
gw	TokenNameIdentifier	 gw
.	TokenNameDOT	
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
global	TokenNameIdentifier	 global
.	TokenNameDOT	
stopMouseCapture	TokenNameIdentifier	 stop Mouse Capture
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
