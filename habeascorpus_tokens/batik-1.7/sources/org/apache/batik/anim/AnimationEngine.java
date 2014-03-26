/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
TimedDocumentRoot	TokenNameIdentifier	 Timed Document Root
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
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
timing	TokenNameIdentifier	 timing
.	TokenNameDOT	
TimegraphListener	TokenNameIdentifier	 Timegraph Listener
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
values	TokenNameIdentifier	 values
.	TokenNameDOT	
AnimatableValue	TokenNameIdentifier	 Animatable Value
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
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AnimationTarget	TokenNameIdentifier	 Animation Target
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
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AnimationTargetListener	TokenNameIdentifier	 Animation Target Listener
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
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
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
/** * An abstract base class for managing animation in a document. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimationEngine.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 An abstract base class for managing animation in a document. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimationEngine.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AnimationEngine	TokenNameIdentifier	 Animation Engine
{	TokenNameLBRACE	
// Constants to identify the type of animation. 	TokenNameCOMMENT_LINE	Constants to identify the type of animation. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ANIM_TYPE_XML	TokenNameIdentifier	 ANIM  TYPE  XML
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ANIM_TYPE_CSS	TokenNameIdentifier	 ANIM  TYPE  CSS
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ANIM_TYPE_OTHER	TokenNameIdentifier	 ANIM  TYPE  OTHER
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The document this AnimationEngine is managing animation for. */	TokenNameCOMMENT_JAVADOC	 The document this AnimationEngine is managing animation for. 
protected	TokenNameprotected	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** * The root time container for the document. */	TokenNameCOMMENT_JAVADOC	 The root time container for the document. 
protected	TokenNameprotected	
TimedDocumentRoot	TokenNameIdentifier	 Timed Document Root
timedDocumentRoot	TokenNameIdentifier	 timed Document Root
;	TokenNameSEMICOLON	
/** * The time at which the document was paused, or 0 if the document is not * paused. */	TokenNameCOMMENT_JAVADOC	 The time at which the document was paused, or 0 if the document is not paused. 
protected	TokenNameprotected	
long	TokenNamelong	
pauseTime	TokenNameIdentifier	 pause Time
;	TokenNameSEMICOLON	
/** * Map of AnimationTargets to TargetInfo objects. */	TokenNameCOMMENT_JAVADOC	 Map of AnimationTargets to TargetInfo objects. 
protected	TokenNameprotected	
HashMap	TokenNameIdentifier	 Hash Map
targets	TokenNameIdentifier	 targets
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Map of AbstractAnimations to AnimationInfo objects. */	TokenNameCOMMENT_JAVADOC	 Map of AbstractAnimations to AnimationInfo objects. 
protected	TokenNameprotected	
HashMap	TokenNameIdentifier	 Hash Map
animations	TokenNameIdentifier	 animations
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The listener object for animation target base value changes. */	TokenNameCOMMENT_JAVADOC	 The listener object for animation target base value changes. 
protected	TokenNameprotected	
Listener	TokenNameIdentifier	 Listener
targetListener	TokenNameIdentifier	 target Listener
=	TokenNameEQUAL	
new	TokenNamenew	
Listener	TokenNameIdentifier	 Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new AnimationEngine for the given document. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimationEngine for the given document. 
public	TokenNamepublic	
AnimationEngine	TokenNameIdentifier	 Animation Engine
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
timedDocumentRoot	TokenNameIdentifier	 timed Document Root
=	TokenNameEQUAL	
createDocumentRoot	TokenNameIdentifier	 create Document Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Disposes this animation engine. */	TokenNameCOMMENT_JAVADOC	 Disposes this animation engine. 
public	TokenNamepublic	
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Remove any target listeners that are registered. 	TokenNameCOMMENT_LINE	Remove any target listeners that are registered. 
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
targets	TokenNameIdentifier	 targets
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TargetInfo	TokenNameIdentifier	 Target Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TargetInfo	TokenNameIdentifier	 Target Info
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
xmlAnimations	TokenNameIdentifier	 xml Animations
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
e2	TokenNameIdentifier	 e2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getKey1	TokenNameIdentifier	 get Key1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getKey2	TokenNameIdentifier	 get Key2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Sandwich	TokenNameIdentifier	 Sandwich
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Sandwich	TokenNameIdentifier	 Sandwich
)	TokenNameRPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
listenerRegistered	TokenNameIdentifier	 listener Registered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
removeTargetListener	TokenNameIdentifier	 remove Target Listener
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
targetListener	TokenNameIdentifier	 target Listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
cssAnimations	TokenNameIdentifier	 css Animations
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
e2	TokenNameIdentifier	 e2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Sandwich	TokenNameIdentifier	 Sandwich
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Sandwich	TokenNameIdentifier	 Sandwich
)	TokenNameRPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
listenerRegistered	TokenNameIdentifier	 listener Registered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
removeTargetListener	TokenNameIdentifier	 remove Target Listener
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
propertyName	TokenNameIdentifier	 property Name
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
targetListener	TokenNameIdentifier	 target Listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Pauses the animations. */	TokenNameCOMMENT_JAVADOC	 Pauses the animations. 
public	TokenNamepublic	
void	TokenNamevoid	
pause	TokenNameIdentifier	 pause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pauseTime	TokenNameIdentifier	 pause Time
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pauseTime	TokenNameIdentifier	 pause Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Unpauses the animations. */	TokenNameCOMMENT_JAVADOC	 Unpauses the animations. 
public	TokenNamepublic	
void	TokenNamevoid	
unpause	TokenNameIdentifier	 unpause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pauseTime	TokenNameIdentifier	 pause Time
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Calendar	TokenNameIdentifier	 Calendar
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
timedDocumentRoot	TokenNameIdentifier	 timed Document Root
.	TokenNameDOT	
getDocumentBeginTime	TokenNameIdentifier	 get Document Begin Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dt	TokenNameIdentifier	 dt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
pauseTime	TokenNameIdentifier	 pause Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
begin	TokenNameIdentifier	 begin
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
dt	TokenNameIdentifier	 dt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pauseTime	TokenNameIdentifier	 pause Time
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns whether animations are currently paused. */	TokenNameCOMMENT_JAVADOC	 Returns whether animations are currently paused. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPaused	TokenNameIdentifier	 is Paused
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pauseTime	TokenNameIdentifier	 pause Time
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current document time. */	TokenNameCOMMENT_JAVADOC	 Returns the current document time. 
public	TokenNamepublic	
float	TokenNamefloat	
getCurrentTime	TokenNameIdentifier	 get Current Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timedDocumentRoot	TokenNameIdentifier	 timed Document Root
.	TokenNameDOT	
getCurrentTime	TokenNameIdentifier	 get Current Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the current document time. */	TokenNameCOMMENT_JAVADOC	 Sets the current document time. 
public	TokenNamepublic	
float	TokenNamefloat	
setCurrentTime	TokenNameIdentifier	 set Current Time
(	TokenNameLPAREN	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
pauseTime	TokenNameIdentifier	 pause Time
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
unpause	TokenNameIdentifier	 unpause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
timedDocumentRoot	TokenNameIdentifier	 timed Document Root
.	TokenNameDOT	
getDocumentBeginTime	TokenNameIdentifier	 get Document Begin Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
timedDocumentRoot	TokenNameIdentifier	 timed Document Root
.	TokenNameDOT	
convertEpochTime	TokenNameIdentifier	 convert Epoch Time
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
begin	TokenNameIdentifier	 begin
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pause	TokenNameIdentifier	 pause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tick	TokenNameIdentifier	 tick
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds an animation to the document. * @param target the target element of the animation * @param type the type of animation (must be one of the * <code>ANIM_TYPE_*</code> constants defined in this class * @param ns the namespace URI of the attribute being animated, if * <code>type == </code>{@link #ANIM_TYPE_XML} * @param an the attribute name if <code>type == </code>{@link * #ANIM_TYPE_XML}, the property name if <code>type == </code> * {@link #ANIM_TYPE_CSS}, and the animation type otherwise * @param anim the animation */	TokenNameCOMMENT_JAVADOC	 Adds an animation to the document. @param target the target element of the animation @param type the type of animation (must be one of the <code>ANIM_TYPE_*</code> constants defined in this class @param ns the namespace URI of the attribute being animated, if <code>type == </code>{@link #ANIM_TYPE_XML} @param an the attribute name if <code>type == </code>{@link #ANIM_TYPE_XML}, the property name if <code>type == </code> {@link #ANIM_TYPE_CSS}, and the animation type otherwise @param anim the animation 
public	TokenNamepublic	
void	TokenNamevoid	
addAnimation	TokenNameIdentifier	 add Animation
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
an	TokenNameIdentifier	 an
,	TokenNameCOMMA	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// org.apache.batik.anim.timing.Trace.enter(this, "addAnimation", new Object[] { target, new Short[type], ns, an, anim } ); try { 	TokenNameCOMMENT_LINE	org.apache.batik.anim.timing.Trace.enter(this, "addAnimation", new Object[] { target, new Short[type], ns, an, anim } ); try { 
timedDocumentRoot	TokenNameIdentifier	 timed Document Root
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
getTimedElement	TokenNameIdentifier	 get Timed Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AnimationInfo	TokenNameIdentifier	 Animation Info
animInfo	TokenNameIdentifier	 anim Info
=	TokenNameEQUAL	
getAnimationInfo	TokenNameIdentifier	 get Animation Info
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
attributeNamespaceURI	TokenNameIdentifier	 attribute Namespace URI
=	TokenNameEQUAL	
ns	TokenNameIdentifier	 ns
;	TokenNameSEMICOLON	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
attributeLocalName	TokenNameIdentifier	 attribute Local Name
=	TokenNameEQUAL	
an	TokenNameIdentifier	 an
;	TokenNameSEMICOLON	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
animations	TokenNameIdentifier	 animations
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
,	TokenNameCOMMA	
animInfo	TokenNameIdentifier	 anim Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Sandwich	TokenNameIdentifier	 Sandwich
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
getSandwich	TokenNameIdentifier	 get Sandwich
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
an	TokenNameIdentifier	 an
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
=	TokenNameEQUAL	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
lowestAnimation	TokenNameIdentifier	 lowest Animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// } finally { org.apache.batik.anim.timing.Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { org.apache.batik.anim.timing.Trace.exit(); } 
}	TokenNameRBRACE	
/** * Removes an animation from the document. */	TokenNameCOMMENT_JAVADOC	 Removes an animation from the document. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAnimation	TokenNameIdentifier	 remove Animation
(	TokenNameLPAREN	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// org.apache.batik.anim.timing.Trace.enter(this, "removeAnimation", new Object[] { anim } ); try { 	TokenNameCOMMENT_LINE	org.apache.batik.anim.timing.Trace.enter(this, "removeAnimation", new Object[] { anim } ); try { 
timedDocumentRoot	TokenNameIdentifier	 timed Document Root
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
getTimedElement	TokenNameIdentifier	 get Timed Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
nextHigher	TokenNameIdentifier	 next Higher
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextHigher	TokenNameIdentifier	 next Higher
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextHigher	TokenNameIdentifier	 next Higher
.	TokenNameDOT	
markDirty	TokenNameIdentifier	 mark Dirty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
moveToBottom	TokenNameIdentifier	 move To Bottom
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AnimationInfo	TokenNameIdentifier	 Animation Info
animInfo	TokenNameIdentifier	 anim Info
=	TokenNameEQUAL	
getAnimationInfo	TokenNameIdentifier	 get Animation Info
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Sandwich	TokenNameIdentifier	 Sandwich
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
getSandwich	TokenNameIdentifier	 get Sandwich
(	TokenNameLPAREN	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
attributeNamespaceURI	TokenNameIdentifier	 attribute Namespace URI
,	TokenNameCOMMA	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
attributeLocalName	TokenNameIdentifier	 attribute Local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
==	TokenNameEQUAL_EQUAL	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
lowestAnimation	TokenNameIdentifier	 lowest Animation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
shouldUpdate	TokenNameIdentifier	 should Update
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// } finally { org.apache.batik.anim.timing.Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { org.apache.batik.anim.timing.Trace.exit(); } 
}	TokenNameRBRACE	
/** * Returns the Sandwich for the given animation type/attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the Sandwich for the given animation type/attribute. 
protected	TokenNameprotected	
Sandwich	TokenNameIdentifier	 Sandwich
getSandwich	TokenNameIdentifier	 get Sandwich
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
an	TokenNameIdentifier	 an
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TargetInfo	TokenNameIdentifier	 Target Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
getTargetInfo	TokenNameIdentifier	 get Target Info
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Sandwich	TokenNameIdentifier	 Sandwich
sandwich	TokenNameIdentifier	 sandwich
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ANIM_TYPE_XML	TokenNameIdentifier	 ANIM  TYPE  XML
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Sandwich	TokenNameIdentifier	 Sandwich
)	TokenNameRPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
xmlAnimations	TokenNameIdentifier	 xml Animations
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
an	TokenNameIdentifier	 an
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sandwich	TokenNameIdentifier	 sandwich
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
new	TokenNamenew	
Sandwich	TokenNameIdentifier	 Sandwich
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
xmlAnimations	TokenNameIdentifier	 xml Animations
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
an	TokenNameIdentifier	 an
,	TokenNameCOMMA	
sandwich	TokenNameIdentifier	 sandwich
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
ANIM_TYPE_CSS	TokenNameIdentifier	 ANIM  TYPE  CSS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Sandwich	TokenNameIdentifier	 Sandwich
)	TokenNameRPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
cssAnimations	TokenNameIdentifier	 css Animations
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
an	TokenNameIdentifier	 an
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sandwich	TokenNameIdentifier	 sandwich
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
new	TokenNamenew	
Sandwich	TokenNameIdentifier	 Sandwich
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
cssAnimations	TokenNameIdentifier	 css Animations
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
an	TokenNameIdentifier	 an
,	TokenNameCOMMA	
sandwich	TokenNameIdentifier	 sandwich
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Sandwich	TokenNameIdentifier	 Sandwich
)	TokenNameRPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
otherAnimations	TokenNameIdentifier	 other Animations
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
an	TokenNameIdentifier	 an
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sandwich	TokenNameIdentifier	 sandwich
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
new	TokenNamenew	
Sandwich	TokenNameIdentifier	 Sandwich
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
otherAnimations	TokenNameIdentifier	 other Animations
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
an	TokenNameIdentifier	 an
,	TokenNameCOMMA	
sandwich	TokenNameIdentifier	 sandwich
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sandwich	TokenNameIdentifier	 sandwich
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the TargetInfo for the given AnimationTarget. */	TokenNameCOMMENT_JAVADOC	 Returns the TargetInfo for the given AnimationTarget. 
protected	TokenNameprotected	
TargetInfo	TokenNameIdentifier	 Target Info
getTargetInfo	TokenNameIdentifier	 get Target Info
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TargetInfo	TokenNameIdentifier	 Target Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TargetInfo	TokenNameIdentifier	 Target Info
)	TokenNameRPAREN	
targets	TokenNameIdentifier	 targets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
new	TokenNamenew	
TargetInfo	TokenNameIdentifier	 Target Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targets	TokenNameIdentifier	 targets
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the AnimationInfo for the given AbstractAnimation. */	TokenNameCOMMENT_JAVADOC	 Returns the AnimationInfo for the given AbstractAnimation. 
protected	TokenNameprotected	
AnimationInfo	TokenNameIdentifier	 Animation Info
getAnimationInfo	TokenNameIdentifier	 get Animation Info
(	TokenNameLPAREN	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimationInfo	TokenNameIdentifier	 Animation Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimationInfo	TokenNameIdentifier	 Animation Info
)	TokenNameRPAREN	
animations	TokenNameIdentifier	 animations
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
new	TokenNamenew	
AnimationInfo	TokenNameIdentifier	 Animation Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
animations	TokenNameIdentifier	 animations
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
MAP_ENTRY_ARRAY	TokenNameIdentifier	 MAP  ENTRY  ARRAY
=	TokenNameEQUAL	
new	TokenNamenew	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Updates the animations in the document to the given document time. * @param time the document time to sample at * @param hyperlinking whether the document should be seeked to the given * time, as with hyperlinking */	TokenNameCOMMENT_JAVADOC	 Updates the animations in the document to the given document time. @param time the document time to sample at @param hyperlinking whether the document should be seeked to the given time, as with hyperlinking 
protected	TokenNameprotected	
float	TokenNamefloat	
tick	TokenNameIdentifier	 tick
(	TokenNameLPAREN	
float	TokenNamefloat	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hyperlinking	TokenNameIdentifier	 hyperlinking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
waitTime	TokenNameIdentifier	 wait Time
=	TokenNameEQUAL	
timedDocumentRoot	TokenNameIdentifier	 timed Document Root
.	TokenNameDOT	
seekTo	TokenNameIdentifier	 seek To
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
hyperlinking	TokenNameIdentifier	 hyperlinking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targetEntries	TokenNameIdentifier	 target Entries
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
targets	TokenNameIdentifier	 targets
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
MAP_ENTRY_ARRAY	TokenNameIdentifier	 MAP  ENTRY  ARRAY
)	TokenNameRPAREN	
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
targetEntries	TokenNameIdentifier	 target Entries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
targetEntries	TokenNameIdentifier	 target Entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TargetInfo	TokenNameIdentifier	 Target Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TargetInfo	TokenNameIdentifier	 Target Info
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Update the XML animations. 	TokenNameCOMMENT_LINE	Update the XML animations. 
Iterator	TokenNameIdentifier	 Iterator
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
xmlAnimations	TokenNameIdentifier	 xml Animations
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
e2	TokenNameIdentifier	 e2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getKey1	TokenNameIdentifier	 get Key1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getKey2	TokenNameIdentifier	 get Key2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Sandwich	TokenNameIdentifier	 Sandwich
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Sandwich	TokenNameIdentifier	 Sandwich
)	TokenNameRPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
shouldUpdate	TokenNameIdentifier	 should Update
||	TokenNameOR_OR	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
.	TokenNameDOT	
isDirty	TokenNameIdentifier	 is Dirty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableValue	TokenNameIdentifier	 Animatable Value
av	TokenNameIdentifier	 av
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
usesUnderlying	TokenNameIdentifier	 uses Underlying
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
=	TokenNameEQUAL	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
av	TokenNameIdentifier	 av
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
getComposedValue	TokenNameIdentifier	 get Composed Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usesUnderlying	TokenNameIdentifier	 uses Underlying
=	TokenNameEQUAL	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
lowestAnimation	TokenNameIdentifier	 lowest Animation
.	TokenNameDOT	
usesUnderlyingValue	TokenNameIdentifier	 uses Underlying Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
isDirty	TokenNameIdentifier	 is Dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
usesUnderlying	TokenNameIdentifier	 uses Underlying
&&	TokenNameAND_AND	
!	TokenNameNOT	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
listenerRegistered	TokenNameIdentifier	 listener Registered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
addTargetListener	TokenNameIdentifier	 add Target Listener
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
targetListener	TokenNameIdentifier	 target Listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
listenerRegistered	TokenNameIdentifier	 listener Registered
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
usesUnderlying	TokenNameIdentifier	 uses Underlying
&&	TokenNameAND_AND	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
listenerRegistered	TokenNameIdentifier	 listener Registered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
removeTargetListener	TokenNameIdentifier	 remove Target Listener
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
targetListener	TokenNameIdentifier	 target Listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
listenerRegistered	TokenNameIdentifier	 listener Registered
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
updateAttributeValue	TokenNameIdentifier	 update Attribute Value
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
av	TokenNameIdentifier	 av
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
shouldUpdate	TokenNameIdentifier	 should Update
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Update the CSS animations. 	TokenNameCOMMENT_LINE	Update the CSS animations. 
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
cssAnimations	TokenNameIdentifier	 css Animations
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
e2	TokenNameIdentifier	 e2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Sandwich	TokenNameIdentifier	 Sandwich
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Sandwich	TokenNameIdentifier	 Sandwich
)	TokenNameRPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
shouldUpdate	TokenNameIdentifier	 should Update
||	TokenNameOR_OR	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
.	TokenNameDOT	
isDirty	TokenNameIdentifier	 is Dirty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableValue	TokenNameIdentifier	 Animatable Value
av	TokenNameIdentifier	 av
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
usesUnderlying	TokenNameIdentifier	 uses Underlying
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
=	TokenNameEQUAL	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
av	TokenNameIdentifier	 av
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
getComposedValue	TokenNameIdentifier	 get Composed Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usesUnderlying	TokenNameIdentifier	 uses Underlying
=	TokenNameEQUAL	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
lowestAnimation	TokenNameIdentifier	 lowest Animation
.	TokenNameDOT	
usesUnderlyingValue	TokenNameIdentifier	 uses Underlying Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
isDirty	TokenNameIdentifier	 is Dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
usesUnderlying	TokenNameIdentifier	 uses Underlying
&&	TokenNameAND_AND	
!	TokenNameNOT	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
listenerRegistered	TokenNameIdentifier	 listener Registered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
addTargetListener	TokenNameIdentifier	 add Target Listener
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
propertyName	TokenNameIdentifier	 property Name
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
targetListener	TokenNameIdentifier	 target Listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
listenerRegistered	TokenNameIdentifier	 listener Registered
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
usesUnderlying	TokenNameIdentifier	 uses Underlying
&&	TokenNameAND_AND	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
listenerRegistered	TokenNameIdentifier	 listener Registered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
removeTargetListener	TokenNameIdentifier	 remove Target Listener
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
propertyName	TokenNameIdentifier	 property Name
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
targetListener	TokenNameIdentifier	 target Listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
listenerRegistered	TokenNameIdentifier	 listener Registered
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
usesUnderlying	TokenNameIdentifier	 uses Underlying
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
updatePropertyValue	TokenNameIdentifier	 update Property Value
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
usesUnderlying	TokenNameIdentifier	 uses Underlying
&&	TokenNameAND_AND	
av	TokenNameIdentifier	 av
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
updatePropertyValue	TokenNameIdentifier	 update Property Value
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
,	TokenNameCOMMA	
av	TokenNameIdentifier	 av
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
shouldUpdate	TokenNameIdentifier	 should Update
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Update the other animations. 	TokenNameCOMMENT_LINE	Update the other animations. 
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
otherAnimations	TokenNameIdentifier	 other Animations
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
e2	TokenNameIdentifier	 e2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Sandwich	TokenNameIdentifier	 Sandwich
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Sandwich	TokenNameIdentifier	 Sandwich
)	TokenNameRPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
shouldUpdate	TokenNameIdentifier	 should Update
||	TokenNameOR_OR	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
.	TokenNameDOT	
isDirty	TokenNameIdentifier	 is Dirty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableValue	TokenNameIdentifier	 Animatable Value
av	TokenNameIdentifier	 av
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
=	TokenNameEQUAL	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
av	TokenNameIdentifier	 av
=	TokenNameEQUAL	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
.	TokenNameDOT	
getComposedValue	TokenNameIdentifier	 get Composed Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
isDirty	TokenNameIdentifier	 is Dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
updateOtherValue	TokenNameIdentifier	 update Other Value
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
av	TokenNameIdentifier	 av
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
shouldUpdate	TokenNameIdentifier	 should Update
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
waitTime	TokenNameIdentifier	 wait Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked to indicate an animation became active at the specified time. * * @param anim the animation * @param begin the time the element became active, in document simple time */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate an animation became active at the specified time. * @param anim the animation @param begin the time the element became active, in document simple time 
public	TokenNamepublic	
void	TokenNamevoid	
toActive	TokenNameIdentifier	 to Active
(	TokenNameLPAREN	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
,	TokenNameCOMMA	
float	TokenNamefloat	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
moveToTop	TokenNameIdentifier	 move To Top
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
isActive	TokenNameIdentifier	 is Active
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
beginTime	TokenNameIdentifier	 begin Time
=	TokenNameEQUAL	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
isFrozen	TokenNameIdentifier	 is Frozen
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Move the animation down, in case it began at the same time as another 	TokenNameCOMMENT_LINE	Move the animation down, in case it began at the same time as another 
// animation in the sandwich and it's earlier in document order. 	TokenNameCOMMENT_LINE	animation in the sandwich and it's earlier in document order. 
pushDown	TokenNameIdentifier	 push Down
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
markDirty	TokenNameIdentifier	 mark Dirty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Moves the animation down the sandwich such that it is in the right * position according to begin time and document order. */	TokenNameCOMMENT_JAVADOC	 Moves the animation down the sandwich such that it is in the right position according to begin time and document order. 
protected	TokenNameprotected	
void	TokenNamevoid	
pushDown	TokenNameIdentifier	 push Down
(	TokenNameLPAREN	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
getTimedElement	TokenNameIdentifier	 get Timed Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
moved	TokenNameIdentifier	 moved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
.	TokenNameDOT	
isActive	TokenNameIdentifier	 is Active
||	TokenNameOR_OR	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
.	TokenNameDOT	
isFrozen	TokenNameIdentifier	 is Frozen
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
.	TokenNameDOT	
beginTime	TokenNameIdentifier	 begin Time
>	TokenNameGREATER	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
beginTime	TokenNameIdentifier	 begin Time
||	TokenNameOR_OR	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
.	TokenNameDOT	
beginTime	TokenNameIdentifier	 begin Time
==	TokenNameEQUAL_EQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
beginTime	TokenNameIdentifier	 begin Time
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
isBefore	TokenNameIdentifier	 is Before
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
.	TokenNameDOT	
getTimedElement	TokenNameIdentifier	 get Timed Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
higher	TokenNameIdentifier	 higher
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
;	TokenNameSEMICOLON	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
;	TokenNameSEMICOLON	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
lowerLower	TokenNameIdentifier	 lower Lower
=	TokenNameEQUAL	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
higher	TokenNameIdentifier	 higher
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
higher	TokenNameIdentifier	 higher
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
=	TokenNameEQUAL	
lower	TokenNameIdentifier	 lower
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lowerLower	TokenNameIdentifier	 lower Lower
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lowerLower	TokenNameIdentifier	 lower Lower
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
;	TokenNameSEMICOLON	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
=	TokenNameEQUAL	
higher	TokenNameIdentifier	 higher
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
=	TokenNameEQUAL	
lowerLower	TokenNameIdentifier	 lower Lower
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
=	TokenNameEQUAL	
lower	TokenNameIdentifier	 lower
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
moved	TokenNameIdentifier	 moved
)	TokenNameRPAREN	
{	TokenNameLBRACE	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
lower	TokenNameIdentifier	 lower
;	TokenNameSEMICOLON	
moved	TokenNameIdentifier	 moved
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
moved	TokenNameIdentifier	 moved
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimationInfo	TokenNameIdentifier	 Animation Info
animInfo	TokenNameIdentifier	 anim Info
=	TokenNameEQUAL	
getAnimationInfo	TokenNameIdentifier	 get Animation Info
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Sandwich	TokenNameIdentifier	 Sandwich
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
getSandwich	TokenNameIdentifier	 get Sandwich
(	TokenNameLPAREN	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
attributeNamespaceURI	TokenNameIdentifier	 attribute Namespace URI
,	TokenNameCOMMA	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
attributeLocalName	TokenNameIdentifier	 attribute Local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
==	TokenNameEQUAL_EQUAL	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
=	TokenNameEQUAL	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
lowestAnimation	TokenNameIdentifier	 lowest Animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Invoked to indicate that this timed element became inactive. * * @param anim the animation * @param isFrozen whether the element is frozen or not */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that this timed element became inactive. * @param anim the animation @param isFrozen whether the element is frozen or not 
public	TokenNamepublic	
void	TokenNamevoid	
toInactive	TokenNameIdentifier	 to Inactive
(	TokenNameLPAREN	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isFrozen	TokenNameIdentifier	 is Frozen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
isActive	TokenNameIdentifier	 is Active
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
isFrozen	TokenNameIdentifier	 is Frozen
=	TokenNameEQUAL	
isFrozen	TokenNameIdentifier	 is Frozen
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
beginTime	TokenNameIdentifier	 begin Time
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
markDirty	TokenNameIdentifier	 mark Dirty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isFrozen	TokenNameIdentifier	 is Frozen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
moveToBottom	TokenNameIdentifier	 move To Bottom
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pushDown	TokenNameIdentifier	 push Down
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Invoked to indicate that this timed element has had its fill removed. */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that this timed element has had its fill removed. 
public	TokenNamepublic	
void	TokenNamevoid	
removeFill	TokenNameIdentifier	 remove Fill
(	TokenNameLPAREN	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
isActive	TokenNameIdentifier	 is Active
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
isFrozen	TokenNameIdentifier	 is Frozen
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
markDirty	TokenNameIdentifier	 mark Dirty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
moveToBottom	TokenNameIdentifier	 move To Bottom
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Moves the given animation to the top of the sandwich. */	TokenNameCOMMENT_JAVADOC	 Moves the given animation to the top of the sandwich. 
protected	TokenNameprotected	
void	TokenNamevoid	
moveToTop	TokenNameIdentifier	 move To Top
(	TokenNameLPAREN	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimationInfo	TokenNameIdentifier	 Animation Info
animInfo	TokenNameIdentifier	 anim Info
=	TokenNameEQUAL	
getAnimationInfo	TokenNameIdentifier	 get Animation Info
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Sandwich	TokenNameIdentifier	 Sandwich
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
getSandwich	TokenNameIdentifier	 get Sandwich
(	TokenNameLPAREN	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
attributeNamespaceURI	TokenNameIdentifier	 attribute Namespace URI
,	TokenNameCOMMA	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
attributeLocalName	TokenNameIdentifier	 attribute Local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
shouldUpdate	TokenNameIdentifier	 should Update
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
lowestAnimation	TokenNameIdentifier	 lowest Animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
=	TokenNameEQUAL	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Moves the given animation to the bottom of the sandwich. */	TokenNameCOMMENT_JAVADOC	 Moves the given animation to the bottom of the sandwich. 
protected	TokenNameprotected	
void	TokenNamevoid	
moveToBottom	TokenNameIdentifier	 move To Bottom
(	TokenNameLPAREN	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AnimationInfo	TokenNameIdentifier	 Animation Info
animInfo	TokenNameIdentifier	 anim Info
=	TokenNameEQUAL	
getAnimationInfo	TokenNameIdentifier	 get Animation Info
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Sandwich	TokenNameIdentifier	 Sandwich
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
getSandwich	TokenNameIdentifier	 get Sandwich
(	TokenNameLPAREN	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
attributeNamespaceURI	TokenNameIdentifier	 attribute Namespace URI
,	TokenNameCOMMA	
animInfo	TokenNameIdentifier	 anim Info
.	TokenNameDOT	
attributeLocalName	TokenNameIdentifier	 attribute Local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
nextLower	TokenNameIdentifier	 next Lower
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
;	TokenNameSEMICOLON	
nextLower	TokenNameIdentifier	 next Lower
.	TokenNameDOT	
markDirty	TokenNameIdentifier	 mark Dirty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
=	TokenNameEQUAL	
nextLower	TokenNameIdentifier	 next Lower
;	TokenNameSEMICOLON	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
shouldUpdate	TokenNameIdentifier	 should Update
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
lowestAnimation	TokenNameIdentifier	 lowest Animation
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
higherAnimation	TokenNameIdentifier	 higher Animation
=	TokenNameEQUAL	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
lowestAnimation	TokenNameIdentifier	 lowest Animation
;	TokenNameSEMICOLON	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
lowestAnimation	TokenNameIdentifier	 lowest Animation
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
.	TokenNameDOT	
isDirty	TokenNameIdentifier	 is Dirty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
shouldUpdate	TokenNameIdentifier	 should Update
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds a {@link TimegraphListener} to the document. */	TokenNameCOMMENT_JAVADOC	 Adds a {@link TimegraphListener} to the document. 
public	TokenNamepublic	
void	TokenNamevoid	
addTimegraphListener	TokenNameIdentifier	 add Timegraph Listener
(	TokenNameLPAREN	
TimegraphListener	TokenNameIdentifier	 Timegraph Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timedDocumentRoot	TokenNameIdentifier	 timed Document Root
.	TokenNameDOT	
addTimegraphListener	TokenNameIdentifier	 add Timegraph Listener
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes a {@link TimegraphListener} from the document. */	TokenNameCOMMENT_JAVADOC	 Removes a {@link TimegraphListener} from the document. 
public	TokenNamepublic	
void	TokenNamevoid	
removeTimegraphListener	TokenNameIdentifier	 remove Timegraph Listener
(	TokenNameLPAREN	
TimegraphListener	TokenNameIdentifier	 Timegraph Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
timedDocumentRoot	TokenNameIdentifier	 timed Document Root
.	TokenNameDOT	
removeTimegraphListener	TokenNameIdentifier	 remove Timegraph Listener
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked to indicate that this timed element has been sampled at the given * time. * * @param anim the animation * @param simpleTime the sample time in local simple time * @param simpleDur the simple duration of the element * @param repeatIteration the repeat iteration during which the element was * sampled */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that this timed element has been sampled at the given time. * @param anim the animation @param simpleTime the sample time in local simple time @param simpleDur the simple duration of the element @param repeatIteration the repeat iteration during which the element was sampled 
public	TokenNamepublic	
void	TokenNamevoid	
sampledAt	TokenNameIdentifier	 sampled At
(	TokenNameLPAREN	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
,	TokenNameCOMMA	
float	TokenNamefloat	
simpleTime	TokenNameIdentifier	 simple Time
,	TokenNameCOMMA	
float	TokenNamefloat	
simpleDur	TokenNameIdentifier	 simple Dur
,	TokenNameCOMMA	
int	TokenNameint	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
sampledAt	TokenNameIdentifier	 sampled At
(	TokenNameLPAREN	
simpleTime	TokenNameIdentifier	 simple Time
,	TokenNameCOMMA	
simpleDur	TokenNameIdentifier	 simple Dur
,	TokenNameCOMMA	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked to indicate that this timed element has been sampled at the end * of its active time, at an integer multiple of the simple duration. This * is the "last" value that will be used for filling, which cannot be * sampled normally. */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that this timed element has been sampled at the end of its active time, at an integer multiple of the simple duration. This is the "last" value that will be used for filling, which cannot be sampled normally. 
public	TokenNamepublic	
void	TokenNamevoid	
sampledLastValue	TokenNameIdentifier	 sampled Last Value
(	TokenNameLPAREN	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
,	TokenNameCOMMA	
int	TokenNameint	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
sampledLastValue	TokenNameIdentifier	 sampled Last Value
(	TokenNameLPAREN	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new returns a new TimedDocumentRoot object for the document. */	TokenNameCOMMENT_JAVADOC	 Creates a new returns a new TimedDocumentRoot object for the document. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
TimedDocumentRoot	TokenNameIdentifier	 Timed Document Root
createDocumentRoot	TokenNameIdentifier	 create Document Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Listener class for changes to base values on a target element. */	TokenNameCOMMENT_JAVADOC	 Listener class for changes to base values on a target element. 
protected	TokenNameprotected	
class	TokenNameclass	
Listener	TokenNameIdentifier	 Listener
implements	TokenNameimplements	
AnimationTargetListener	TokenNameIdentifier	 Animation Target Listener
{	TokenNameLBRACE	
/** * Invoked to indicate that base value of the specified attribute * or property has changed. */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that base value of the specified attribute or property has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
baseValueChanged	TokenNameIdentifier	 base Value Changed
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCSS	TokenNameIdentifier	 is CSS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
isCSS	TokenNameIdentifier	 is CSS
?	TokenNameQUESTION	
ANIM_TYPE_CSS	TokenNameIdentifier	 ANIM  TYPE  CSS
:	TokenNameCOLON	
ANIM_TYPE_XML	TokenNameIdentifier	 ANIM  TYPE  XML
;	TokenNameSEMICOLON	
Sandwich	TokenNameIdentifier	 Sandwich
sandwich	TokenNameIdentifier	 sandwich
=	TokenNameEQUAL	
getSandwich	TokenNameIdentifier	 get Sandwich
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
shouldUpdate	TokenNameIdentifier	 should Update
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
anim	TokenNameIdentifier	 anim
=	TokenNameEQUAL	
sandwich	TokenNameIdentifier	 sandwich
.	TokenNameDOT	
animation	TokenNameIdentifier	 animation
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
anim	TokenNameIdentifier	 anim
=	TokenNameEQUAL	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
lowerAnimation	TokenNameIdentifier	 lower Animation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
markDirty	TokenNameIdentifier	 mark Dirty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Class to hold XML and CSS animations for a target element. */	TokenNameCOMMENT_JAVADOC	 Class to hold XML and CSS animations for a target element. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
TargetInfo	TokenNameIdentifier	 Target Info
{	TokenNameLBRACE	
/** * Map of XML attribute names to the corresponding {@link Sandwich} * objects. */	TokenNameCOMMENT_JAVADOC	 Map of XML attribute names to the corresponding {@link Sandwich} objects. 
public	TokenNamepublic	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
xmlAnimations	TokenNameIdentifier	 xml Animations
=	TokenNameEQUAL	
new	TokenNamenew	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Map of CSS attribute names to the corresponding {@link Sandwich} * objects. */	TokenNameCOMMENT_JAVADOC	 Map of CSS attribute names to the corresponding {@link Sandwich} objects. 
public	TokenNamepublic	
HashMap	TokenNameIdentifier	 Hash Map
cssAnimations	TokenNameIdentifier	 css Animations
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Map of other animation types to the corresponding {@link Sandwich} * objects. */	TokenNameCOMMENT_JAVADOC	 Map of other animation types to the corresponding {@link Sandwich} objects. 
public	TokenNamepublic	
HashMap	TokenNameIdentifier	 Hash Map
otherAnimations	TokenNameIdentifier	 other Animations
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Class to hold an animation sandwich for a particular attribute. */	TokenNameCOMMENT_JAVADOC	 Class to hold an animation sandwich for a particular attribute. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
Sandwich	TokenNameIdentifier	 Sandwich
{	TokenNameLBRACE	
/** * The top-most animation in the sandwich. */	TokenNameCOMMENT_JAVADOC	 The top-most animation in the sandwich. 
public	TokenNamepublic	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
animation	TokenNameIdentifier	 animation
;	TokenNameSEMICOLON	
/** * The bottom-most animation in the sandwich. */	TokenNameCOMMENT_JAVADOC	 The bottom-most animation in the sandwich. 
public	TokenNamepublic	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
lowestAnimation	TokenNameIdentifier	 lowest Animation
;	TokenNameSEMICOLON	
/** * Whether the animation needs to have its value copied into the * document. */	TokenNameCOMMENT_JAVADOC	 Whether the animation needs to have its value copied into the document. 
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldUpdate	TokenNameIdentifier	 should Update
;	TokenNameSEMICOLON	
/** * Whether an {@link AnimationTargetListener} has been registered to * listen for changes to the base value. */	TokenNameCOMMENT_JAVADOC	 Whether an {@link AnimationTargetListener} has been registered to listen for changes to the base value. 
public	TokenNamepublic	
boolean	TokenNameboolean	
listenerRegistered	TokenNameIdentifier	 listener Registered
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Class to hold target information of an animation. */	TokenNameCOMMENT_JAVADOC	 Class to hold target information of an animation. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
AnimationInfo	TokenNameIdentifier	 Animation Info
{	TokenNameLBRACE	
/** * The target of the animation. */	TokenNameCOMMENT_JAVADOC	 The target of the animation. 
public	TokenNamepublic	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
/** * The type of animation. Must be one of the <code>ANIM_TYPE_*</code> * constants defined in {@link AnimationEngine}. */	TokenNameCOMMENT_JAVADOC	 The type of animation. Must be one of the <code>ANIM_TYPE_*</code> constants defined in {@link AnimationEngine}. 
public	TokenNamepublic	
short	TokenNameshort	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * The namespace URI of the attribute to animate, if this is an XML * attribute animation. */	TokenNameCOMMENT_JAVADOC	 The namespace URI of the attribute to animate, if this is an XML attribute animation. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
attributeNamespaceURI	TokenNameIdentifier	 attribute Namespace URI
;	TokenNameSEMICOLON	
/** * The local name of the attribute or the name of the CSS property to * animate. */	TokenNameCOMMENT_JAVADOC	 The local name of the attribute or the name of the CSS property to animate. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
attributeLocalName	TokenNameIdentifier	 attribute Local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
