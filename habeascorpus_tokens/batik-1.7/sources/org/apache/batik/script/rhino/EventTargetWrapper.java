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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
SoftReference	TokenNameIdentifier	 Soft Reference
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
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
AbstractNode	TokenNameIdentifier	 Abstract Node
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
ScriptEventWrapper	TokenNameIdentifier	 Script Event Wrapper
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
ContextAction	TokenNameIdentifier	 Context Action
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
NativeObject	TokenNameIdentifier	 Native Object
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
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
Undefined	TokenNameIdentifier	 Undefined
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
/** * A class that wraps an <code>EventTarget</code> instance to expose * it in the Rhino engine. Then calling <code>addEventListener</code> * with a Rhino function as parameter should redirect the call to * <code>addEventListener</code> with a Java function object calling * the Rhino function. * This class also allows to pass an ECMAScript (Rhino) object as * a parameter instead of a function provided the fact that this object * has a <code>handleEvent</code> method. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: EventTargetWrapper.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class that wraps an <code>EventTarget</code> instance to expose it in the Rhino engine. Then calling <code>addEventListener</code> with a Rhino function as parameter should redirect the call to <code>addEventListener</code> with a Java function object calling the Rhino function. This class also allows to pass an ECMAScript (Rhino) object as a parameter instead of a function provided the fact that this object has a <code>handleEvent</code> method. @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: EventTargetWrapper.java 489226 2006-12-21 00:05:36Z cam $ 
class	TokenNameclass	
EventTargetWrapper	TokenNameIdentifier	 Event Target Wrapper
extends	TokenNameextends	
NativeJavaObject	TokenNameIdentifier	 Native Java Object
{	TokenNameLBRACE	
/** * The Java function object calling the Rhino function. */	TokenNameCOMMENT_JAVADOC	 The Java function object calling the Rhino function. 
static	TokenNamestatic	
class	TokenNameclass	
FunctionEventListener	TokenNameIdentifier	 Function Event Listener
implements	TokenNameimplements	
EventListener	TokenNameIdentifier	 Event Listener
{	TokenNameLBRACE	
protected	TokenNameprotected	
Function	TokenNameIdentifier	 Function
function	TokenNameIdentifier	 function
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
FunctionEventListener	TokenNameIdentifier	 Function Event Listener
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleEvent	TokenNameIdentifier	 handle Event
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
event	TokenNameIdentifier	 event
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
instanceof	TokenNameinstanceof	
ScriptEventWrapper	TokenNameIdentifier	 Script Event Wrapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ScriptEventWrapper	TokenNameIdentifier	 Script Event Wrapper
)	TokenNameRPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
.	TokenNameDOT	
getEventObject	TokenNameIdentifier	 get Event Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
interpreter	TokenNameIdentifier	 interpreter
.	TokenNameDOT	
callHandler	TokenNameIdentifier	 call Handler
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
HandleEventListener	TokenNameIdentifier	 Handle Event Listener
implements	TokenNameimplements	
EventListener	TokenNameIdentifier	 Event Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HANDLE_EVENT	TokenNameIdentifier	 HANDLE  EVENT
=	TokenNameEQUAL	
"handleEvent"	TokenNameStringLiteral	handleEvent
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Scriptable	TokenNameIdentifier	 Scriptable
scriptable	TokenNameIdentifier	 scriptable
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
HandleEventListener	TokenNameIdentifier	 Handle Event Listener
(	TokenNameLPAREN	
Scriptable	TokenNameIdentifier	 Scriptable
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scriptable	TokenNameIdentifier	 scriptable
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleEvent	TokenNameIdentifier	 handle Event
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
instanceof	TokenNameinstanceof	
ScriptEventWrapper	TokenNameIdentifier	 Script Event Wrapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ScriptEventWrapper	TokenNameIdentifier	 Script Event Wrapper
)	TokenNameRPAREN	
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
.	TokenNameDOT	
getEventObject	TokenNameIdentifier	 get Event Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
evt	TokenNameIdentifier	 evt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ContextAction	TokenNameIdentifier	 Context Action
handleEventAction	TokenNameIdentifier	 handle Event Action
=	TokenNameEQUAL	
new	TokenNamenew	
ContextAction	TokenNameIdentifier	 Context Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
cx	TokenNameIdentifier	 cx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScriptableObject	TokenNameIdentifier	 Scriptable Object
.	TokenNameDOT	
callMethod	TokenNameIdentifier	 call Method
(	TokenNameLPAREN	
scriptable	TokenNameIdentifier	 scriptable
,	TokenNameCOMMA	
HANDLE_EVENT	TokenNameIdentifier	 HANDLE  EVENT
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
interpreter	TokenNameIdentifier	 interpreter
.	TokenNameDOT	
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
handleEventAction	TokenNameIdentifier	 handle Event Action
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
FunctionProxy	TokenNameIdentifier	 Function Proxy
implements	TokenNameimplements	
Function	TokenNameIdentifier	 Function
{	TokenNameLBRACE	
protected	TokenNameprotected	
Function	TokenNameIdentifier	 Function
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FunctionProxy	TokenNameIdentifier	 Function Proxy
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Scriptable	TokenNameIdentifier	 Scriptable
construct	TokenNameIdentifier	 construct
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
construct	TokenNameIdentifier	 construct
(	TokenNameLPAREN	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
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
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
has	TokenNameIdentifier	 has
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
has	TokenNameIdentifier	 has
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
has	TokenNameIdentifier	 has
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
has	TokenNameIdentifier	 has
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Scriptable	TokenNameIdentifier	 Scriptable
getPrototype	TokenNameIdentifier	 get Prototype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
getPrototype	TokenNameIdentifier	 get Prototype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPrototype	TokenNameIdentifier	 set Prototype
(	TokenNameLPAREN	
Scriptable	TokenNameIdentifier	 Scriptable
prototype	TokenNameIdentifier	 prototype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
setPrototype	TokenNameIdentifier	 set Prototype
(	TokenNameLPAREN	
prototype	TokenNameIdentifier	 prototype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Scriptable	TokenNameIdentifier	 Scriptable
getParentScope	TokenNameIdentifier	 get Parent Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
getParentScope	TokenNameIdentifier	 get Parent Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setParentScope	TokenNameIdentifier	 set Parent Scope
(	TokenNameLPAREN	
Scriptable	TokenNameIdentifier	 Scriptable
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
setParentScope	TokenNameIdentifier	 set Parent Scope
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getIds	TokenNameIdentifier	 get Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
getIds	TokenNameIdentifier	 get Ids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getDefaultValue	TokenNameIdentifier	 get Default Value
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
hint	TokenNameIdentifier	 hint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
getDefaultValue	TokenNameIdentifier	 get Default Value
(	TokenNameLPAREN	
hint	TokenNameIdentifier	 hint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasInstance	TokenNameIdentifier	 has Instance
(	TokenNameLPAREN	
Scriptable	TokenNameIdentifier	 Scriptable
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
hasInstance	TokenNameIdentifier	 has Instance
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This function proxy is delegating most of the job * to the underlying NativeJavaMethod object through * the FunctionProxy. However to allow user to specify * "Function" or objects with an "handleEvent" method * as parameter of "addEventListener" * it redefines the call method to deal with these * cases. */	TokenNameCOMMENT_JAVADOC	 This function proxy is delegating most of the job to the underlying NativeJavaMethod object through the FunctionProxy. However to allow user to specify "Function" or objects with an "handleEvent" method as parameter of "addEventListener" it redefines the call method to deal with these cases. 
static	TokenNamestatic	
class	TokenNameclass	
FunctionAddProxy	TokenNameIdentifier	 Function Add Proxy
extends	TokenNameextends	
FunctionProxy	TokenNameIdentifier	 Function Proxy
{	TokenNameLBRACE	
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
listenerMap	TokenNameIdentifier	 listener Map
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
FunctionAddProxy	TokenNameIdentifier	 Function Add Proxy
(	TokenNameLPAREN	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
listenerMap	TokenNameIdentifier	 listener Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
listenerMap	TokenNameIdentifier	 listener Map
=	TokenNameEQUAL	
listenerMap	TokenNameIdentifier	 listener Map
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NativeJavaObject	TokenNameIdentifier	 Native Java Object
njo	TokenNameIdentifier	 njo
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NativeJavaObject	TokenNameIdentifier	 Native Java Object
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventListener	TokenNameIdentifier	 Event Listener
evtListener	TokenNameIdentifier	 evt Listener
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
SoftReference	TokenNameIdentifier	 Soft Reference
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SoftReference	TokenNameIdentifier	 Soft Reference
)	TokenNameRPAREN	
listenerMap	TokenNameIdentifier	 listener Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
evtListener	TokenNameIdentifier	 evt Listener
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventListener	TokenNameIdentifier	 Event Listener
)	TokenNameRPAREN	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
evtListener	TokenNameIdentifier	 evt Listener
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
evtListener	TokenNameIdentifier	 evt Listener
=	TokenNameEQUAL	
new	TokenNamenew	
FunctionEventListener	TokenNameIdentifier	 Function Event Listener
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
interpreter	TokenNameIdentifier	 interpreter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listenerMap	TokenNameIdentifier	 listener Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
new	TokenNamenew	
SoftReference	TokenNameIdentifier	 Soft Reference
(	TokenNameLPAREN	
evtListener	TokenNameIdentifier	 evt Listener
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we need to marshall args 	TokenNameCOMMENT_LINE	we need to marshall args 
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
)	TokenNameRPAREN	
njo	TokenNameIdentifier	 njo
.	TokenNameDOT	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addEventListener	TokenNameIdentifier	 add Event Listener
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
evtListener	TokenNameIdentifier	 evt Listener
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
NativeObject	TokenNameIdentifier	 Native Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventListener	TokenNameIdentifier	 Event Listener
evtListener	TokenNameIdentifier	 evt Listener
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
SoftReference	TokenNameIdentifier	 Soft Reference
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SoftReference	TokenNameIdentifier	 Soft Reference
)	TokenNameRPAREN	
listenerMap	TokenNameIdentifier	 listener Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
evtListener	TokenNameIdentifier	 evt Listener
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventListener	TokenNameIdentifier	 Event Listener
)	TokenNameRPAREN	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
evtListener	TokenNameIdentifier	 evt Listener
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
evtListener	TokenNameIdentifier	 evt Listener
=	TokenNameEQUAL	
new	TokenNamenew	
HandleEventListener	TokenNameIdentifier	 Handle Event Listener
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Scriptable	TokenNameIdentifier	 Scriptable
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
interpreter	TokenNameIdentifier	 interpreter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listenerMap	TokenNameIdentifier	 listener Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
new	TokenNamenew	
SoftReference	TokenNameIdentifier	 Soft Reference
(	TokenNameLPAREN	
evtListener	TokenNameIdentifier	 evt Listener
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we need to marshall args 	TokenNameCOMMENT_LINE	we need to marshall args 
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
)	TokenNameRPAREN	
njo	TokenNameIdentifier	 njo
.	TokenNameDOT	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addEventListener	TokenNameIdentifier	 add Event Listener
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
evtListener	TokenNameIdentifier	 evt Listener
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
FunctionRemoveProxy	TokenNameIdentifier	 Function Remove Proxy
extends	TokenNameextends	
FunctionProxy	TokenNameIdentifier	 Function Proxy
{	TokenNameLBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
listenerMap	TokenNameIdentifier	 listener Map
;	TokenNameSEMICOLON	
FunctionRemoveProxy	TokenNameIdentifier	 Function Remove Proxy
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
listenerMap	TokenNameIdentifier	 listener Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
listenerMap	TokenNameIdentifier	 listener Map
=	TokenNameEQUAL	
listenerMap	TokenNameIdentifier	 listener Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NativeJavaObject	TokenNameIdentifier	 Native Java Object
njo	TokenNameIdentifier	 njo
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NativeJavaObject	TokenNameIdentifier	 Native Java Object
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SoftReference	TokenNameIdentifier	 Soft Reference
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SoftReference	TokenNameIdentifier	 Soft Reference
)	TokenNameRPAREN	
listenerMap	TokenNameIdentifier	 listener Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
EventListener	TokenNameIdentifier	 Event Listener
el	TokenNameIdentifier	 el
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventListener	TokenNameIdentifier	 Event Listener
)	TokenNameRPAREN	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
el	TokenNameIdentifier	 el
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
// we need to marshall args 	TokenNameCOMMENT_LINE	we need to marshall args 
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
)	TokenNameRPAREN	
njo	TokenNameIdentifier	 njo
.	TokenNameDOT	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeEventListener	TokenNameIdentifier	 remove Event Listener
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
el	TokenNameIdentifier	 el
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
NativeObject	TokenNameIdentifier	 Native Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SoftReference	TokenNameIdentifier	 Soft Reference
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SoftReference	TokenNameIdentifier	 Soft Reference
)	TokenNameRPAREN	
listenerMap	TokenNameIdentifier	 listener Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
EventListener	TokenNameIdentifier	 Event Listener
el	TokenNameIdentifier	 el
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventListener	TokenNameIdentifier	 Event Listener
)	TokenNameRPAREN	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
el	TokenNameIdentifier	 el
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
// we need to marshall args 	TokenNameCOMMENT_LINE	we need to marshall args 
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
EventTarget	TokenNameIdentifier	 Event Target
)	TokenNameRPAREN	
njo	TokenNameIdentifier	 njo
.	TokenNameDOT	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeEventListener	TokenNameIdentifier	 remove Event Listener
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
el	TokenNameIdentifier	 el
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
FunctionAddNSProxy	TokenNameIdentifier	 Function Add NS Proxy
extends	TokenNameextends	
FunctionProxy	TokenNameIdentifier	 Function Proxy
{	TokenNameLBRACE	
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
listenerMap	TokenNameIdentifier	 listener Map
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
FunctionAddNSProxy	TokenNameIdentifier	 Function Add NS Proxy
(	TokenNameLPAREN	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
listenerMap	TokenNameIdentifier	 listener Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
listenerMap	TokenNameIdentifier	 listener Map
=	TokenNameEQUAL	
listenerMap	TokenNameIdentifier	 listener Map
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NativeJavaObject	TokenNameIdentifier	 Native Java Object
njo	TokenNameIdentifier	 njo
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NativeJavaObject	TokenNameIdentifier	 Native Java Object
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventListener	TokenNameIdentifier	 Event Listener
evtListener	TokenNameIdentifier	 evt Listener
=	TokenNameEQUAL	
new	TokenNamenew	
FunctionEventListener	TokenNameIdentifier	 Function Event Listener
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
interpreter	TokenNameIdentifier	 interpreter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listenerMap	TokenNameIdentifier	 listener Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
new	TokenNamenew	
SoftReference	TokenNameIdentifier	 Soft Reference
(	TokenNameLPAREN	
evtListener	TokenNameIdentifier	 evt Listener
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we need to marshall args 	TokenNameCOMMENT_LINE	we need to marshall args 
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractNode	TokenNameIdentifier	 Abstract Node
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
njo	TokenNameIdentifier	 njo
.	TokenNameDOT	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
addEventListenerNS	TokenNameIdentifier	 add Event Listener NS
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
evtListener	TokenNameIdentifier	 evt Listener
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
NativeObject	TokenNameIdentifier	 Native Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventListener	TokenNameIdentifier	 Event Listener
evtListener	TokenNameIdentifier	 evt Listener
=	TokenNameEQUAL	
new	TokenNamenew	
HandleEventListener	TokenNameIdentifier	 Handle Event Listener
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Scriptable	TokenNameIdentifier	 Scriptable
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
interpreter	TokenNameIdentifier	 interpreter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listenerMap	TokenNameIdentifier	 listener Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
new	TokenNamenew	
SoftReference	TokenNameIdentifier	 Soft Reference
(	TokenNameLPAREN	
evtListener	TokenNameIdentifier	 evt Listener
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we need to marshall args 	TokenNameCOMMENT_LINE	we need to marshall args 
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractNode	TokenNameIdentifier	 Abstract Node
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
njo	TokenNameIdentifier	 njo
.	TokenNameDOT	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
addEventListenerNS	TokenNameIdentifier	 add Event Listener NS
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
evtListener	TokenNameIdentifier	 evt Listener
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
FunctionRemoveNSProxy	TokenNameIdentifier	 Function Remove NS Proxy
extends	TokenNameextends	
FunctionProxy	TokenNameIdentifier	 Function Proxy
{	TokenNameLBRACE	
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
listenerMap	TokenNameIdentifier	 listener Map
;	TokenNameSEMICOLON	
FunctionRemoveNSProxy	TokenNameIdentifier	 Function Remove NS Proxy
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
listenerMap	TokenNameIdentifier	 listener Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
listenerMap	TokenNameIdentifier	 listener Map
=	TokenNameEQUAL	
listenerMap	TokenNameIdentifier	 listener Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NativeJavaObject	TokenNameIdentifier	 Native Java Object
njo	TokenNameIdentifier	 njo
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NativeJavaObject	TokenNameIdentifier	 Native Java Object
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SoftReference	TokenNameIdentifier	 Soft Reference
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SoftReference	TokenNameIdentifier	 Soft Reference
)	TokenNameRPAREN	
listenerMap	TokenNameIdentifier	 listener Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
EventListener	TokenNameIdentifier	 Event Listener
el	TokenNameIdentifier	 el
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventListener	TokenNameIdentifier	 Event Listener
)	TokenNameRPAREN	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
el	TokenNameIdentifier	 el
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
// we need to marshall args 	TokenNameCOMMENT_LINE	we need to marshall args 
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractNode	TokenNameIdentifier	 Abstract Node
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
njo	TokenNameIdentifier	 njo
.	TokenNameDOT	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
removeEventListenerNS	TokenNameIdentifier	 remove Event Listener NS
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
el	TokenNameIdentifier	 el
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
NativeObject	TokenNameIdentifier	 Native Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SoftReference	TokenNameIdentifier	 Soft Reference
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SoftReference	TokenNameIdentifier	 Soft Reference
)	TokenNameRPAREN	
listenerMap	TokenNameIdentifier	 listener Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
EventListener	TokenNameIdentifier	 Event Listener
el	TokenNameIdentifier	 el
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventListener	TokenNameIdentifier	 Event Listener
)	TokenNameRPAREN	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
el	TokenNameIdentifier	 el
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
// we need to marshall args 	TokenNameCOMMENT_LINE	we need to marshall args 
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramTypes	TokenNameIdentifier	 param Types
=	TokenNameEQUAL	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
paramTypes	TokenNameIdentifier	 param Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractNode	TokenNameIdentifier	 Abstract Node
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
njo	TokenNameIdentifier	 njo
.	TokenNameDOT	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
removeEventListenerNS	TokenNameIdentifier	 remove Event Listener NS
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
el	TokenNameIdentifier	 el
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Undefined	TokenNameIdentifier	 Undefined
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// the keys are the underlying Java object, in order 	TokenNameCOMMENT_LINE	the keys are the underlying Java object, in order 
// to remove potential memory leaks use a WeakHashMap to allow 	TokenNameCOMMENT_LINE	to remove potential memory leaks use a WeakHashMap to allow 
// to collect entries as soon as the underlying Java object is 	TokenNameCOMMENT_LINE	to collect entries as soon as the underlying Java object is 
// not available anymore. 	TokenNameCOMMENT_LINE	not available anymore. 
protected	TokenNameprotected	
static	TokenNamestatic	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
mapOfListenerMap	TokenNameIdentifier	 map Of Listener Map
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ADD_NAME	TokenNameIdentifier	 ADD  NAME
=	TokenNameEQUAL	
"addEventListener"	TokenNameStringLiteral	addEventListener
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ADDNS_NAME	TokenNameIdentifier	 ADDNS  NAME
=	TokenNameEQUAL	
"addEventListenerNS"	TokenNameStringLiteral	addEventListenerNS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REMOVE_NAME	TokenNameIdentifier	 REMOVE  NAME
=	TokenNameEQUAL	
"removeEventListener"	TokenNameStringLiteral	removeEventListener
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REMOVENS_NAME	TokenNameIdentifier	 REMOVENS  NAME
=	TokenNameEQUAL	
"removeEventListenerNS"	TokenNameStringLiteral	removeEventListenerNS
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
EventTargetWrapper	TokenNameIdentifier	 Event Target Wrapper
(	TokenNameLPAREN	
Scriptable	TokenNameIdentifier	 Scriptable
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
EventTarget	TokenNameIdentifier	 Event Target
object	TokenNameIdentifier	 object
,	TokenNameCOMMA	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
object	TokenNameIdentifier	 object
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overriden Rhino method. */	TokenNameCOMMENT_JAVADOC	 Overriden Rhino method. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ADD_NAME	TokenNameIdentifier	 ADD  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// prevent creating a Map for all JavaScript objects 	TokenNameCOMMENT_LINE	prevent creating a Map for all JavaScript objects 
// when we need it only from time to time... 	TokenNameCOMMENT_LINE	when we need it only from time to time... 
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
new	TokenNamenew	
FunctionAddProxy	TokenNameIdentifier	 Function Add Proxy
(	TokenNameLPAREN	
interpreter	TokenNameIdentifier	 interpreter
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
initMap	TokenNameIdentifier	 init Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
REMOVE_NAME	TokenNameIdentifier	 REMOVE  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// prevent creating a Map for all JavaScript objects 	TokenNameCOMMENT_LINE	prevent creating a Map for all JavaScript objects 
// when we need it only from time to time... 	TokenNameCOMMENT_LINE	when we need it only from time to time... 
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
new	TokenNamenew	
FunctionRemoveProxy	TokenNameIdentifier	 Function Remove Proxy
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
initMap	TokenNameIdentifier	 init Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ADDNS_NAME	TokenNameIdentifier	 ADDNS  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
new	TokenNamenew	
FunctionAddNSProxy	TokenNameIdentifier	 Function Add NS Proxy
(	TokenNameLPAREN	
interpreter	TokenNameIdentifier	 interpreter
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
initMap	TokenNameIdentifier	 init Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
REMOVENS_NAME	TokenNameIdentifier	 REMOVENS  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
new	TokenNamenew	
FunctionRemoveNSProxy	TokenNameIdentifier	 Function Remove NS Proxy
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
initMap	TokenNameIdentifier	 init Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we have to store the listenerMap in a Map because 	TokenNameCOMMENT_LINE	we have to store the listenerMap in a Map because 
// several EventTargetWrapper may be created for the exact 	TokenNameCOMMENT_LINE	several EventTargetWrapper may be created for the exact 
// same underlying Java object. 	TokenNameCOMMENT_LINE	same underlying Java object. 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
initMap	TokenNameIdentifier	 init Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mapOfListenerMap	TokenNameIdentifier	 map Of Listener Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
mapOfListenerMap	TokenNameIdentifier	 map Of Listener Map
=	TokenNameEQUAL	
new	TokenNamenew	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
mapOfListenerMap	TokenNameIdentifier	 map Of Listener Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mapOfListenerMap	TokenNameIdentifier	 map Of Listener Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
