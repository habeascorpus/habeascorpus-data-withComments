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
security	TokenNameIdentifier	 security
.	TokenNameDOT	
AccessControlContext	TokenNameIdentifier	 Access Control Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
AccessController	TokenNameIdentifier	 Access Controller
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
PrivilegedAction	TokenNameIdentifier	 Privileged Action
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
Window	TokenNameIdentifier	 Window
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
ImporterTopLevel	TokenNameIdentifier	 Importer Top Level
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
/** * This class wraps a Window object to expose it to the interpreter. * This will be the Global Object of our interpreter. * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: WindowWrapper.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class wraps a Window object to expose it to the interpreter. This will be the Global Object of our interpreter. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: WindowWrapper.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
extends	TokenNameextends	
ImporterTopLevel	TokenNameIdentifier	 Importer Top Level
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_ARGUMENTS	TokenNameIdentifier	 EMPTY  ARGUMENTS
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * The rhino interpreter. */	TokenNameCOMMENT_JAVADOC	 The rhino interpreter. 
protected	TokenNameprotected	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
/** * The wrapped window. */	TokenNameCOMMENT_JAVADOC	 The wrapped window. 
protected	TokenNameprotected	
Window	TokenNameIdentifier	 Window
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
/** * Creates a new WindowWrapper. */	TokenNameCOMMENT_JAVADOC	 Creates a new WindowWrapper. 
public	TokenNamepublic	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
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
"setInterval"	TokenNameStringLiteral	setInterval
,	TokenNameCOMMA	
"setTimeout"	TokenNameStringLiteral	setTimeout
,	TokenNameCOMMA	
"clearInterval"	TokenNameStringLiteral	clearInterval
,	TokenNameCOMMA	
"clearTimeout"	TokenNameStringLiteral	clearTimeout
,	TokenNameCOMMA	
"parseXML"	TokenNameStringLiteral	parseXML
,	TokenNameCOMMA	
"getURL"	TokenNameStringLiteral	getURL
,	TokenNameCOMMA	
"postURL"	TokenNameStringLiteral	postURL
,	TokenNameCOMMA	
"alert"	TokenNameStringLiteral	alert
,	TokenNameCOMMA	
"confirm"	TokenNameStringLiteral	confirm
,	TokenNameCOMMA	
"prompt"	TokenNameStringLiteral	prompt
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
defineFunctionProperties	TokenNameIdentifier	 define Function Properties
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
,	TokenNameCOMMA	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
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
"Window"	TokenNameStringLiteral	Window
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[object Window]"	TokenNameStringLiteral	[object Window]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wraps the 'setInterval' methods of the Window interface. */	TokenNameCOMMENT_JAVADOC	 Wraps the 'setInterval' methods of the Window interface. 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
setInterval	TokenNameIdentifier	 set Interval
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
WindowWrapper	TokenNameIdentifier	 Window Wrapper
ww	TokenNameIdentifier	 ww
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
Window	TokenNameIdentifier	 Window
window	TokenNameIdentifier	 window
=	TokenNameEQUAL	
ww	TokenNameIdentifier	 ww
.	TokenNameDOT	
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
reportRuntimeError	TokenNameIdentifier	 report Runtime Error
(	TokenNameLPAREN	
"invalid argument count"	TokenNameStringLiteral	invalid argument count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interp	TokenNameIdentifier	 interp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
)	TokenNameRPAREN	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
getInterpreter	TokenNameIdentifier	 get Interpreter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FunctionWrapper	TokenNameIdentifier	 Function Wrapper
fw	TokenNameIdentifier	 fw
;	TokenNameSEMICOLON	
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
new	TokenNamenew	
FunctionWrapper	TokenNameIdentifier	 Function Wrapper
(	TokenNameLPAREN	
interp	TokenNameIdentifier	 interp
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
EMPTY_ARGUMENTS	TokenNameIdentifier	 EMPTY  ARGUMENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
toObject	TokenNameIdentifier	 to Object
(	TokenNameLPAREN	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
setInterval	TokenNameIdentifier	 set Interval
(	TokenNameLPAREN	
fw	TokenNameIdentifier	 fw
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
script	TokenNameIdentifier	 script
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
toObject	TokenNameIdentifier	 to Object
(	TokenNameLPAREN	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
setInterval	TokenNameIdentifier	 set Interval
(	TokenNameLPAREN	
script	TokenNameIdentifier	 script
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wraps the 'setTimeout' methods of the Window interface. */	TokenNameCOMMENT_JAVADOC	 Wraps the 'setTimeout' methods of the Window interface. 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
setTimeout	TokenNameIdentifier	 set Timeout
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
WindowWrapper	TokenNameIdentifier	 Window Wrapper
ww	TokenNameIdentifier	 ww
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
Window	TokenNameIdentifier	 Window
window	TokenNameIdentifier	 window
=	TokenNameEQUAL	
ww	TokenNameIdentifier	 ww
.	TokenNameDOT	
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
reportRuntimeError	TokenNameIdentifier	 report Runtime Error
(	TokenNameLPAREN	
"invalid argument count"	TokenNameStringLiteral	invalid argument count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interp	TokenNameIdentifier	 interp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
)	TokenNameRPAREN	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
getInterpreter	TokenNameIdentifier	 get Interpreter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FunctionWrapper	TokenNameIdentifier	 Function Wrapper
fw	TokenNameIdentifier	 fw
;	TokenNameSEMICOLON	
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
new	TokenNamenew	
FunctionWrapper	TokenNameIdentifier	 Function Wrapper
(	TokenNameLPAREN	
interp	TokenNameIdentifier	 interp
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
EMPTY_ARGUMENTS	TokenNameIdentifier	 EMPTY  ARGUMENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
toObject	TokenNameIdentifier	 to Object
(	TokenNameLPAREN	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
fw	TokenNameIdentifier	 fw
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
script	TokenNameIdentifier	 script
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
toObject	TokenNameIdentifier	 to Object
(	TokenNameLPAREN	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
script	TokenNameIdentifier	 script
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wraps the 'clearInterval' method of the Window interface. */	TokenNameCOMMENT_JAVADOC	 Wraps the 'clearInterval' method of the Window interface. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
clearInterval	TokenNameIdentifier	 clear Interval
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
WindowWrapper	TokenNameIdentifier	 Window Wrapper
ww	TokenNameIdentifier	 ww
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
Window	TokenNameIdentifier	 Window
window	TokenNameIdentifier	 window
=	TokenNameEQUAL	
ww	TokenNameIdentifier	 ww
.	TokenNameDOT	
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
clearInterval	TokenNameIdentifier	 clear Interval
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Wraps the 'clearTimeout' method of the Window interface. */	TokenNameCOMMENT_JAVADOC	 Wraps the 'clearTimeout' method of the Window interface. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
clearTimeout	TokenNameIdentifier	 clear Timeout
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
WindowWrapper	TokenNameIdentifier	 Window Wrapper
ww	TokenNameIdentifier	 ww
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
Window	TokenNameIdentifier	 Window
window	TokenNameIdentifier	 window
=	TokenNameEQUAL	
ww	TokenNameIdentifier	 ww
.	TokenNameDOT	
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
clearTimeout	TokenNameIdentifier	 clear Timeout
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Wraps the 'parseXML' method of the Window interface. */	TokenNameCOMMENT_JAVADOC	 Wraps the 'parseXML' method of the Window interface. 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
parseXML	TokenNameIdentifier	 parse XML
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
final	TokenNamefinal	
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
WindowWrapper	TokenNameIdentifier	 Window Wrapper
ww	TokenNameIdentifier	 ww
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Window	TokenNameIdentifier	 Window
window	TokenNameIdentifier	 window
=	TokenNameEQUAL	
ww	TokenNameIdentifier	 ww
.	TokenNameDOT	
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
reportRuntimeError	TokenNameIdentifier	 report Runtime Error
(	TokenNameLPAREN	
"invalid argument count"	TokenNameStringLiteral	invalid argument count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AccessControlContext	TokenNameIdentifier	 Access Control Context
acc	TokenNameIdentifier	 acc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
)	TokenNameRPAREN	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
getInterpreter	TokenNameIdentifier	 get Interpreter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAccessControlContext	TokenNameIdentifier	 get Access Control Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
AccessController	TokenNameIdentifier	 Access Controller
.	TokenNameDOT	
doPrivileged	TokenNameIdentifier	 do Privileged
(	TokenNameLPAREN	
new	TokenNamenew	
PrivilegedAction	TokenNameIdentifier	 Privileged Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
parseXML	TokenNameIdentifier	 parse XML
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
acc	TokenNameIdentifier	 acc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
toObject	TokenNameIdentifier	 to Object
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wraps the 'getURL' method of the Window interface. */	TokenNameCOMMENT_JAVADOC	 Wraps the 'getURL' method of the Window interface. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
final	TokenNamefinal	
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
WindowWrapper	TokenNameIdentifier	 Window Wrapper
ww	TokenNameIdentifier	 ww
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Window	TokenNameIdentifier	 Window
window	TokenNameIdentifier	 window
=	TokenNameEQUAL	
ww	TokenNameIdentifier	 ww
.	TokenNameDOT	
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
reportRuntimeError	TokenNameIdentifier	 report Runtime Error
(	TokenNameLPAREN	
"invalid argument count"	TokenNameStringLiteral	invalid argument count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interp	TokenNameIdentifier	 interp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
)	TokenNameRPAREN	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
getInterpreter	TokenNameIdentifier	 get Interpreter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Window	TokenNameIdentifier	 Window
.	TokenNameDOT	
URLResponseHandler	TokenNameIdentifier	 URL Response Handler
urlHandler	TokenNameIdentifier	 url Handler
=	TokenNameEQUAL	
null	TokenNamenull	
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
urlHandler	TokenNameIdentifier	 url Handler
=	TokenNameEQUAL	
new	TokenNamenew	
GetURLFunctionWrapper	TokenNameIdentifier	 Get URL Function Wrapper
(	TokenNameLPAREN	
interp	TokenNameIdentifier	 interp
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ww	TokenNameIdentifier	 ww
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
urlHandler	TokenNameIdentifier	 url Handler
=	TokenNameEQUAL	
new	TokenNamenew	
GetURLObjectWrapper	TokenNameIdentifier	 Get URL Object Wrapper
(	TokenNameLPAREN	
interp	TokenNameIdentifier	 interp
,	TokenNameCOMMA	
(	TokenNameLPAREN	
NativeObject	TokenNameIdentifier	 Native Object
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ww	TokenNameIdentifier	 ww
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
Window	TokenNameIdentifier	 Window
.	TokenNameDOT	
URLResponseHandler	TokenNameIdentifier	 URL Response Handler
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
urlHandler	TokenNameIdentifier	 url Handler
;	TokenNameSEMICOLON	
AccessControlContext	TokenNameIdentifier	 Access Control Context
acc	TokenNameIdentifier	 acc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
)	TokenNameRPAREN	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
getInterpreter	TokenNameIdentifier	 get Interpreter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAccessControlContext	TokenNameIdentifier	 get Access Control Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AccessController	TokenNameIdentifier	 Access Controller
.	TokenNameDOT	
doPrivileged	TokenNameIdentifier	 do Privileged
(	TokenNameLPAREN	
new	TokenNamenew	
PrivilegedAction	TokenNameIdentifier	 Privileged Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
fw	TokenNameIdentifier	 fw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
acc	TokenNameIdentifier	 acc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
AccessController	TokenNameIdentifier	 Access Controller
.	TokenNameDOT	
doPrivileged	TokenNameIdentifier	 do Privileged
(	TokenNameLPAREN	
new	TokenNamenew	
PrivilegedAction	TokenNameIdentifier	 Privileged Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
fw	TokenNameIdentifier	 fw
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
acc	TokenNameIdentifier	 acc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Wraps the 'postURL' method of the Window interface. */	TokenNameCOMMENT_JAVADOC	 Wraps the 'postURL' method of the Window interface. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
postURL	TokenNameIdentifier	 post URL
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
Scriptable	TokenNameIdentifier	 Scriptable
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
final	TokenNamefinal	
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
WindowWrapper	TokenNameIdentifier	 Window Wrapper
ww	TokenNameIdentifier	 ww
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Window	TokenNameIdentifier	 Window
window	TokenNameIdentifier	 window
=	TokenNameEQUAL	
ww	TokenNameIdentifier	 ww
.	TokenNameDOT	
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
reportRuntimeError	TokenNameIdentifier	 report Runtime Error
(	TokenNameLPAREN	
"invalid argument count"	TokenNameStringLiteral	invalid argument count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interp	TokenNameIdentifier	 interp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
)	TokenNameRPAREN	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
getInterpreter	TokenNameIdentifier	 get Interpreter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Window	TokenNameIdentifier	 Window
.	TokenNameDOT	
URLResponseHandler	TokenNameIdentifier	 URL Response Handler
urlHandler	TokenNameIdentifier	 url Handler
=	TokenNameEQUAL	
null	TokenNamenull	
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
urlHandler	TokenNameIdentifier	 url Handler
=	TokenNameEQUAL	
new	TokenNamenew	
GetURLFunctionWrapper	TokenNameIdentifier	 Get URL Function Wrapper
(	TokenNameLPAREN	
interp	TokenNameIdentifier	 interp
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ww	TokenNameIdentifier	 ww
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
urlHandler	TokenNameIdentifier	 url Handler
=	TokenNameEQUAL	
new	TokenNamenew	
GetURLObjectWrapper	TokenNameIdentifier	 Get URL Object Wrapper
(	TokenNameLPAREN	
interp	TokenNameIdentifier	 interp
,	TokenNameCOMMA	
(	TokenNameLPAREN	
NativeObject	TokenNameIdentifier	 Native Object
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ww	TokenNameIdentifier	 ww
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
Window	TokenNameIdentifier	 Window
.	TokenNameDOT	
URLResponseHandler	TokenNameIdentifier	 URL Response Handler
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
urlHandler	TokenNameIdentifier	 url Handler
;	TokenNameSEMICOLON	
AccessControlContext	TokenNameIdentifier	 Access Control Context
acc	TokenNameIdentifier	 acc
;	TokenNameSEMICOLON	
acc	TokenNameIdentifier	 acc
=	TokenNameEQUAL	
interp	TokenNameIdentifier	 interp
.	TokenNameDOT	
getAccessControlContext	TokenNameIdentifier	 get Access Control Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
AccessController	TokenNameIdentifier	 Access Controller
.	TokenNameDOT	
doPrivileged	TokenNameIdentifier	 do Privileged
(	TokenNameLPAREN	
new	TokenNamenew	
PrivilegedAction	TokenNameIdentifier	 Privileged Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
postURL	TokenNameIdentifier	 post URL
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
fw	TokenNameIdentifier	 fw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
acc	TokenNameIdentifier	 acc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
AccessController	TokenNameIdentifier	 Access Controller
.	TokenNameDOT	
doPrivileged	TokenNameIdentifier	 do Privileged
(	TokenNameLPAREN	
new	TokenNamenew	
PrivilegedAction	TokenNameIdentifier	 Privileged Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
postURL	TokenNameIdentifier	 post URL
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
fw	TokenNameIdentifier	 fw
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
acc	TokenNameIdentifier	 acc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
AccessController	TokenNameIdentifier	 Access Controller
.	TokenNameDOT	
doPrivileged	TokenNameIdentifier	 do Privileged
(	TokenNameLPAREN	
new	TokenNamenew	
PrivilegedAction	TokenNameIdentifier	 Privileged Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
postURL	TokenNameIdentifier	 post URL
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
fw	TokenNameIdentifier	 fw
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
acc	TokenNameIdentifier	 acc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Wraps the 'alert' method of the Window interface. */	TokenNameCOMMENT_JAVADOC	 Wraps the 'alert' method of the Window interface. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
alert	TokenNameIdentifier	 alert
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
WindowWrapper	TokenNameIdentifier	 Window Wrapper
ww	TokenNameIdentifier	 ww
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
Window	TokenNameIdentifier	 Window
window	TokenNameIdentifier	 window
=	TokenNameEQUAL	
ww	TokenNameIdentifier	 ww
.	TokenNameDOT	
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
alert	TokenNameIdentifier	 alert
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Wraps the 'confirm' method of the Window interface. */	TokenNameCOMMENT_JAVADOC	 Wraps the 'confirm' method of the Window interface. 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
confirm	TokenNameIdentifier	 confirm
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
WindowWrapper	TokenNameIdentifier	 Window Wrapper
ww	TokenNameIdentifier	 ww
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
Window	TokenNameIdentifier	 Window
window	TokenNameIdentifier	 window
=	TokenNameEQUAL	
ww	TokenNameIdentifier	 ww
.	TokenNameDOT	
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
confirm	TokenNameIdentifier	 confirm
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
toObject	TokenNameIdentifier	 to Object
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
toObject	TokenNameIdentifier	 to Object
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
toObject	TokenNameIdentifier	 to Object
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wraps the 'prompt' method of the Window interface. */	TokenNameCOMMENT_JAVADOC	 Wraps the 'prompt' method of the Window interface. 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
prompt	TokenNameIdentifier	 prompt
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
WindowWrapper	TokenNameIdentifier	 Window Wrapper
ww	TokenNameIdentifier	 ww
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
)	TokenNameRPAREN	
thisObj	TokenNameIdentifier	 this Obj
;	TokenNameSEMICOLON	
Window	TokenNameIdentifier	 Window
window	TokenNameIdentifier	 window
=	TokenNameEQUAL	
ww	TokenNameIdentifier	 ww
.	TokenNameDOT	
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
prompt	TokenNameIdentifier	 prompt
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
defVal	TokenNameIdentifier	 def Val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
jsToJava	TokenNameIdentifier	 js To Java
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
prompt	TokenNameIdentifier	 prompt
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
defVal	TokenNameIdentifier	 def Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
toObject	TokenNameIdentifier	 to Object
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To wrap a function in an handler. */	TokenNameCOMMENT_JAVADOC	 To wrap a function in an handler. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FunctionWrapper	TokenNameIdentifier	 Function Wrapper
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
/** * The current interpreter. */	TokenNameCOMMENT_JAVADOC	 The current interpreter. 
protected	TokenNameprotected	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
/** * The function wrapper. */	TokenNameCOMMENT_JAVADOC	 The function wrapper. 
protected	TokenNameprotected	
Function	TokenNameIdentifier	 Function
function	TokenNameIdentifier	 function
;	TokenNameSEMICOLON	
/** * The arguments. */	TokenNameCOMMENT_JAVADOC	 The arguments. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
;	TokenNameSEMICOLON	
/** * Creates a function wrapper. */	TokenNameCOMMENT_JAVADOC	 Creates a function wrapper. 
public	TokenNamepublic	
FunctionWrapper	TokenNameIdentifier	 Function Wrapper
(	TokenNameLPAREN	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
ri	TokenNameIdentifier	 ri
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
ri	TokenNameIdentifier	 ri
;	TokenNameSEMICOLON	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
arguments	TokenNameIdentifier	 arguments
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls the function. */	TokenNameCOMMENT_JAVADOC	 Calls the function. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
interpreter	TokenNameIdentifier	 interpreter
.	TokenNameDOT	
callHandler	TokenNameIdentifier	 call Handler
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To wrap a function passed to getURL(). */	TokenNameCOMMENT_JAVADOC	 To wrap a function passed to getURL(). 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
GetURLFunctionWrapper	TokenNameIdentifier	 Get URL Function Wrapper
implements	TokenNameimplements	
Window	TokenNameIdentifier	 Window
.	TokenNameDOT	
URLResponseHandler	TokenNameIdentifier	 URL Response Handler
{	TokenNameLBRACE	
/** * The current interpreter. */	TokenNameCOMMENT_JAVADOC	 The current interpreter. 
protected	TokenNameprotected	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
/** * The function wrapper. */	TokenNameCOMMENT_JAVADOC	 The function wrapper. 
protected	TokenNameprotected	
Function	TokenNameIdentifier	 Function
function	TokenNameIdentifier	 function
;	TokenNameSEMICOLON	
/** * The WindowWrapper */	TokenNameCOMMENT_JAVADOC	 The WindowWrapper 
protected	TokenNameprotected	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
windowWrapper	TokenNameIdentifier	 window Wrapper
;	TokenNameSEMICOLON	
/** * Creates a wrapper. */	TokenNameCOMMENT_JAVADOC	 Creates a wrapper. 
public	TokenNamepublic	
GetURLFunctionWrapper	TokenNameIdentifier	 Get URL Function Wrapper
(	TokenNameLPAREN	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
ri	TokenNameIdentifier	 ri
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
fct	TokenNameIdentifier	 fct
,	TokenNameCOMMA	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
ww	TokenNameIdentifier	 ww
)	TokenNameRPAREN	
{	TokenNameLBRACE	
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
ri	TokenNameIdentifier	 ri
;	TokenNameSEMICOLON	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
fct	TokenNameIdentifier	 fct
;	TokenNameSEMICOLON	
windowWrapper	TokenNameIdentifier	 window Wrapper
=	TokenNameEQUAL	
ww	TokenNameIdentifier	 ww
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called before 'getURL()' returns. * @param success Whether the data was successfully retreived. * @param mime The data MIME type. * @param content The data. */	TokenNameCOMMENT_JAVADOC	 Called before 'getURL()' returns. @param success Whether the data was successfully retreived. @param mime The data MIME type. @param content The data. 
public	TokenNamepublic	
void	TokenNamevoid	
getURLDone	TokenNameIdentifier	 get URL Done
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
mime	TokenNameIdentifier	 mime
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
interpreter	TokenNameIdentifier	 interpreter
.	TokenNameDOT	
callHandler	TokenNameIdentifier	 call Handler
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
,	TokenNameCOMMA	
new	TokenNamenew	
GetURLDoneArgBuilder	TokenNameIdentifier	 Get URL Done Arg Builder
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
,	TokenNameCOMMA	
mime	TokenNameIdentifier	 mime
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
windowWrapper	TokenNameIdentifier	 window Wrapper
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To wrap an object passed to getURL(). */	TokenNameCOMMENT_JAVADOC	 To wrap an object passed to getURL(). 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
GetURLObjectWrapper	TokenNameIdentifier	 Get URL Object Wrapper
implements	TokenNameimplements	
Window	TokenNameIdentifier	 Window
.	TokenNameDOT	
URLResponseHandler	TokenNameIdentifier	 URL Response Handler
{	TokenNameLBRACE	
/** * The current interpreter. */	TokenNameCOMMENT_JAVADOC	 The current interpreter. 
private	TokenNameprivate	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
interpreter	TokenNameIdentifier	 interpreter
;	TokenNameSEMICOLON	
/** * The object wrapper. */	TokenNameCOMMENT_JAVADOC	 The object wrapper. 
private	TokenNameprivate	
ScriptableObject	TokenNameIdentifier	 Scriptable Object
object	TokenNameIdentifier	 object
;	TokenNameSEMICOLON	
/** * The Scope for the callback. */	TokenNameCOMMENT_JAVADOC	 The Scope for the callback. 
private	TokenNameprivate	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
windowWrapper	TokenNameIdentifier	 window Wrapper
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPLETE	TokenNameIdentifier	 COMPLETE
=	TokenNameEQUAL	
"operationComplete"	TokenNameStringLiteral	operationComplete
;	TokenNameSEMICOLON	
/** * Creates a wrapper. */	TokenNameCOMMENT_JAVADOC	 Creates a wrapper. 
public	TokenNamepublic	
GetURLObjectWrapper	TokenNameIdentifier	 Get URL Object Wrapper
(	TokenNameLPAREN	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
ri	TokenNameIdentifier	 ri
,	TokenNameCOMMA	
ScriptableObject	TokenNameIdentifier	 Scriptable Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
ww	TokenNameIdentifier	 ww
)	TokenNameRPAREN	
{	TokenNameLBRACE	
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
ri	TokenNameIdentifier	 ri
;	TokenNameSEMICOLON	
object	TokenNameIdentifier	 object
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
windowWrapper	TokenNameIdentifier	 window Wrapper
=	TokenNameEQUAL	
ww	TokenNameIdentifier	 ww
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called before 'getURL()' returns. * @param success Whether the data was successfully retreived. * @param mime The data MIME type. * @param content The data. */	TokenNameCOMMENT_JAVADOC	 Called before 'getURL()' returns. @param success Whether the data was successfully retreived. @param mime The data MIME type. @param content The data. 
public	TokenNamepublic	
void	TokenNamevoid	
getURLDone	TokenNameIdentifier	 get URL Done
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
mime	TokenNameIdentifier	 mime
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
interpreter	TokenNameIdentifier	 interpreter
.	TokenNameDOT	
callMethod	TokenNameIdentifier	 call Method
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
,	TokenNameCOMMA	
COMPLETE	TokenNameIdentifier	 COMPLETE
,	TokenNameCOMMA	
new	TokenNamenew	
GetURLDoneArgBuilder	TokenNameIdentifier	 Get URL Done Arg Builder
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
,	TokenNameCOMMA	
mime	TokenNameIdentifier	 mime
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
windowWrapper	TokenNameIdentifier	 window Wrapper
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
GetURLDoneArgBuilder	TokenNameIdentifier	 Get URL Done Arg Builder
implements	TokenNameimplements	
RhinoInterpreter	TokenNameIdentifier	 Rhino Interpreter
.	TokenNameDOT	
ArgumentsBuilder	TokenNameIdentifier	 Arguments Builder
{	TokenNameLBRACE	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
mime	TokenNameIdentifier	 mime
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
;	TokenNameSEMICOLON	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
windowWrapper	TokenNameIdentifier	 window Wrapper
;	TokenNameSEMICOLON	
public	TokenNamepublic	
GetURLDoneArgBuilder	TokenNameIdentifier	 Get URL Done Arg Builder
(	TokenNameLPAREN	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mime	TokenNameIdentifier	 mime
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
WindowWrapper	TokenNameIdentifier	 Window Wrapper
ww	TokenNameIdentifier	 ww
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
success	TokenNameIdentifier	 success
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mime	TokenNameIdentifier	 mime
=	TokenNameEQUAL	
mime	TokenNameIdentifier	 mime
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
windowWrapper	TokenNameIdentifier	 window Wrapper
=	TokenNameEQUAL	
ww	TokenNameIdentifier	 ww
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buildArguments	TokenNameIdentifier	 build Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScriptableObject	TokenNameIdentifier	 Scriptable Object
so	TokenNameIdentifier	 so
=	TokenNameEQUAL	
new	TokenNamenew	
NativeObject	TokenNameIdentifier	 Native Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
so	TokenNameIdentifier	 so
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"success"	TokenNameStringLiteral	success
,	TokenNameCOMMA	
so	TokenNameIdentifier	 so
,	TokenNameCOMMA	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mime	TokenNameIdentifier	 mime
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
so	TokenNameIdentifier	 so
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"contentType"	TokenNameStringLiteral	contentType
,	TokenNameCOMMA	
so	TokenNameIdentifier	 so
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
toObject	TokenNameIdentifier	 to Object
(	TokenNameLPAREN	
mime	TokenNameIdentifier	 mime
,	TokenNameCOMMA	
windowWrapper	TokenNameIdentifier	 window Wrapper
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
so	TokenNameIdentifier	 so
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
so	TokenNameIdentifier	 so
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
toObject	TokenNameIdentifier	 to Object
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
windowWrapper	TokenNameIdentifier	 window Wrapper
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
so	TokenNameIdentifier	 so
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
