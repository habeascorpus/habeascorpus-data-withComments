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
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * An abstract base class for time container elements. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: TimeContainer.java 579456 2007-09-26 03:58:47Z cam $ */	TokenNameCOMMENT_JAVADOC	 An abstract base class for time container elements. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: TimeContainer.java 579456 2007-09-26 03:58:47Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TimeContainer	TokenNameIdentifier	 Time Container
extends	TokenNameextends	
TimedElement	TokenNameIdentifier	 Timed Element
{	TokenNameLBRACE	
/** * The child {@link TimedElement}s of this time container. */	TokenNameCOMMENT_JAVADOC	 The child {@link TimedElement}s of this time container. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Adds a {@link TimedElement} to this container. */	TokenNameCOMMENT_JAVADOC	 Adds a {@link TimedElement} to this container. 
public	TokenNamepublic	
void	TokenNamevoid	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"recursive datastructure not allowed here!"	TokenNameStringLiteral	recursive datastructure not allowed here!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
fireElementAdded	TokenNameIdentifier	 fire Element Added
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
currentIntervalWillUpdate	TokenNameIdentifier	 current Interval Will Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Recursively sets the {@link TimedDocumentRoot} of the given * {@link TimedElement} and any of its descendants. */	TokenNameCOMMENT_JAVADOC	 Recursively sets the {@link TimedDocumentRoot} of the given {@link TimedElement} and any of its descendants. 
protected	TokenNameprotected	
void	TokenNamevoid	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
TimedDocumentRoot	TokenNameIdentifier	 Timed Document Root
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
TimeContainer	TokenNameIdentifier	 Time Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimeContainer	TokenNameIdentifier	 Time Container
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TimeContainer	TokenNameIdentifier	 Time Container
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimedElement	TokenNameIdentifier	 Timed Element
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Removes a {@link TimedElement} from this container. */	TokenNameCOMMENT_JAVADOC	 Removes a {@link TimedElement} from this container. 
public	TokenNamepublic	
void	TokenNamevoid	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
fireElementRemoved	TokenNameIdentifier	 fire Element Removed
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
currentIntervalWillUpdate	TokenNameIdentifier	 current Interval Will Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array of the children of this container. */	TokenNameCOMMENT_JAVADOC	 Returns an array of the children of this container. 
public	TokenNamepublic	
TimedElement	TokenNameIdentifier	 Timed Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
TimedElement	TokenNameIdentifier	 Timed Element
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculates the local simple time. Currently the hyperlinking parameter * is ignored, so DOM timing events are fired during hyperlinking seeks. * If we were following SMIL 2.1 rather than SMIL Animation, then these * events would have to be surpressed. * * @return the number of seconds until this element becomes active again * if it currently is not, {@link Float#POSITIVE_INFINITY} if this * element will become active at some undetermined point in the * future (because of unresolved begin times, for example) or * will never become active again, or <code>0f</code> if the * element is currently active. */	TokenNameCOMMENT_JAVADOC	 Calculates the local simple time. Currently the hyperlinking parameter is ignored, so DOM timing events are fired during hyperlinking seeks. If we were following SMIL 2.1 rather than SMIL Animation, then these events would have to be surpressed. * @return the number of seconds until this element becomes active again if it currently is not, {@link Float#POSITIVE_INFINITY} if this element will become active at some undetermined point in the future (because of unresolved begin times, for example) or will never become active again, or <code>0f</code> if the element is currently active. 
protected	TokenNameprotected	
float	TokenNamefloat	
sampleAt	TokenNameIdentifier	 sample At
(	TokenNameLPAREN	
float	TokenNamefloat	
parentSimpleTime	TokenNameIdentifier	 parent Simple Time
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hyperlinking	TokenNameIdentifier	 hyperlinking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
sampleAt	TokenNameIdentifier	 sample At
(	TokenNameLPAREN	
parentSimpleTime	TokenNameIdentifier	 parent Simple Time
,	TokenNameCOMMA	
hyperlinking	TokenNameIdentifier	 hyperlinking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Maybe check the return value of the previous statement. 	TokenNameCOMMENT_LINE	Maybe check the return value of the previous statement. 
return	TokenNamereturn	
sampleChildren	TokenNameIdentifier	 sample Children
(	TokenNameLPAREN	
parentSimpleTime	TokenNameIdentifier	 parent Simple Time
,	TokenNameCOMMA	
hyperlinking	TokenNameIdentifier	 hyperlinking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Samples all the child timed elements. */	TokenNameCOMMENT_JAVADOC	 Samples all the child timed elements. 
protected	TokenNameprotected	
float	TokenNamefloat	
sampleChildren	TokenNameIdentifier	 sample Children
(	TokenNameLPAREN	
float	TokenNamefloat	
parentSimpleTime	TokenNameIdentifier	 parent Simple Time
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hyperlinking	TokenNameIdentifier	 hyperlinking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
mint	TokenNameIdentifier	 mint
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
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
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
sampleAt	TokenNameIdentifier	 sample At
(	TokenNameLPAREN	
parentSimpleTime	TokenNameIdentifier	 parent Simple Time
,	TokenNameCOMMA	
hyperlinking	TokenNameIdentifier	 hyperlinking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
mint	TokenNameIdentifier	 mint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mint	TokenNameIdentifier	 mint
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
mint	TokenNameIdentifier	 mint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets this element. */	TokenNameCOMMENT_JAVADOC	 Resets this element. 
protected	TokenNameprotected	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
boolean	TokenNameboolean	
clearCurrentBegin	TokenNameIdentifier	 clear Current Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
clearCurrentBegin	TokenNameIdentifier	 clear Current Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
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
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
clearCurrentBegin	TokenNameIdentifier	 clear Current Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns whether this timed element is for a constant animation (i.e., a * 'set' animation. */	TokenNameCOMMENT_JAVADOC	 Returns whether this timed element is for a constant animation (i.e., a 'set' animation. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isConstantAnimation	TokenNameIdentifier	 is Constant Animation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the default begin time for the given child * timed element. */	TokenNameCOMMENT_JAVADOC	 Returns the default begin time for the given child timed element. 
public	TokenNamepublic	
abstract	TokenNameabstract	
float	TokenNamefloat	
getDefaultBegin	TokenNameIdentifier	 get Default Begin
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
