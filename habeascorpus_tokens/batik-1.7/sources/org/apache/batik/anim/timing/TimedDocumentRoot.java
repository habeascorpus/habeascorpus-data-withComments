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
Calendar	TokenNameIdentifier	 Calendar
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DoublyIndexedSet	TokenNameIdentifier	 Doubly Indexed Set
;	TokenNameSEMICOLON	
/** * An abstract base class for the root time container element * for a document. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: TimedDocumentRoot.java 580685 2007-09-30 09:07:29Z cam $ */	TokenNameCOMMENT_JAVADOC	 An abstract base class for the root time container element for a document. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: TimedDocumentRoot.java 580685 2007-09-30 09:07:29Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TimedDocumentRoot	TokenNameIdentifier	 Timed Document Root
extends	TokenNameextends	
TimeContainer	TokenNameIdentifier	 Time Container
{	TokenNameLBRACE	
/** * The wallclock time that the document began. */	TokenNameCOMMENT_JAVADOC	 The wallclock time that the document began. 
protected	TokenNameprotected	
Calendar	TokenNameIdentifier	 Calendar
documentBeginTime	TokenNameIdentifier	 document Begin Time
;	TokenNameSEMICOLON	
/** * Allows the use of accessKey() timing specifiers with a single * character, as specified in SVG 1.1. */	TokenNameCOMMENT_JAVADOC	 Allows the use of accessKey() timing specifiers with a single character, as specified in SVG 1.1. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
useSVG11AccessKeys	TokenNameIdentifier	 use SV G11 Access Keys
;	TokenNameSEMICOLON	
/** * Allows the use of accessKey() timing specifiers with a DOM 3 * key name, as specified in SVG 1.2. */	TokenNameCOMMENT_JAVADOC	 Allows the use of accessKey() timing specifiers with a DOM 3 key name, as specified in SVG 1.2. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
useSVG12AccessKeys	TokenNameIdentifier	 use SV G12 Access Keys
;	TokenNameSEMICOLON	
/** * A set to determine when propagation of new Instance times should * be stopped. */	TokenNameCOMMENT_JAVADOC	 A set to determine when propagation of new Instance times should be stopped. 
protected	TokenNameprotected	
DoublyIndexedSet	TokenNameIdentifier	 Doubly Indexed Set
propagationFlags	TokenNameIdentifier	 propagation Flags
=	TokenNameEQUAL	
new	TokenNamenew	
DoublyIndexedSet	TokenNameIdentifier	 Doubly Indexed Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * List of {link TimegraphListener}s to be notified of changes to the * timed elements in this document. */	TokenNameCOMMENT_JAVADOC	 List of {link TimegraphListener}s to be notified of changes to the timed elements in this document. 
protected	TokenNameprotected	
LinkedList	TokenNameIdentifier	 Linked List
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Whether the document is currently being sampled. */	TokenNameCOMMENT_JAVADOC	 Whether the document is currently being sampled. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isSampling	TokenNameIdentifier	 is Sampling
;	TokenNameSEMICOLON	
/** * Whether the document is currently being sampled for a hyperlink. */	TokenNameCOMMENT_JAVADOC	 Whether the document is currently being sampled for a hyperlink. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isHyperlinking	TokenNameIdentifier	 is Hyperlinking
;	TokenNameSEMICOLON	
/** * Creates a new TimedDocumentRoot. * @param useSVG11AccessKeys allows the use of accessKey() timing * specifiers with a single character * @param useSVG12AccessKeys allows the use of accessKey() with a * DOM 3 key name */	TokenNameCOMMENT_JAVADOC	 Creates a new TimedDocumentRoot. @param useSVG11AccessKeys allows the use of accessKey() timing specifiers with a single character @param useSVG12AccessKeys allows the use of accessKey() with a DOM 3 key name 
public	TokenNamepublic	
TimedDocumentRoot	TokenNameIdentifier	 Timed Document Root
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useSVG11AccessKeys	TokenNameIdentifier	 use SV G11 Access Keys
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useSVG12AccessKeys	TokenNameIdentifier	 use SV G12 Access Keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
useSVG11AccessKeys	TokenNameIdentifier	 use SV G11 Access Keys
=	TokenNameEQUAL	
useSVG11AccessKeys	TokenNameIdentifier	 use SV G11 Access Keys
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
useSVG12AccessKeys	TokenNameIdentifier	 use SV G12 Access Keys
=	TokenNameEQUAL	
useSVG12AccessKeys	TokenNameIdentifier	 use SV G12 Access Keys
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the implicit duration of the element. The document root * has an {@link #INDEFINITE} implicit duration. */	TokenNameCOMMENT_JAVADOC	 Returns the implicit duration of the element. The document root has an {@link #INDEFINITE} implicit duration. 
protected	TokenNameprotected	
float	TokenNamefloat	
getImplicitDur	TokenNameIdentifier	 get Implicit Dur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the default begin time for the given child * timed element. In SVG, this is always 0, since the * only time container is the root SVG element, which acts * like a 'par'. */	TokenNameCOMMENT_JAVADOC	 Returns the default begin time for the given child timed element. In SVG, this is always 0, since the only time container is the root SVG element, which acts like a 'par'. 
public	TokenNamepublic	
float	TokenNamefloat	
getDefaultBegin	TokenNameIdentifier	 get Default Begin
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the last sampled document time. */	TokenNameCOMMENT_JAVADOC	 Returns the last sampled document time. 
public	TokenNamepublic	
float	TokenNamefloat	
getCurrentTime	TokenNameIdentifier	 get Current Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastSampleTime	TokenNameIdentifier	 last Sample Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the document is currently being sampled. */	TokenNameCOMMENT_JAVADOC	 Returns whether the document is currently being sampled. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSampling	TokenNameIdentifier	 is Sampling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isSampling	TokenNameIdentifier	 is Sampling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the document is currently being sampled for a hyperlink. */	TokenNameCOMMENT_JAVADOC	 Returns whether the document is currently being sampled for a hyperlink. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isHyperlinking	TokenNameIdentifier	 is Hyperlinking
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isHyperlinking	TokenNameIdentifier	 is Hyperlinking
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Samples the entire timegraph at the given time. */	TokenNameCOMMENT_JAVADOC	 Samples the entire timegraph at the given time. 
public	TokenNamepublic	
float	TokenNamefloat	
seekTo	TokenNameIdentifier	 seek To
(	TokenNameLPAREN	
float	TokenNamefloat	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hyperlinking	TokenNameIdentifier	 hyperlinking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "seekTo", new Object[] { new Float(time) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "seekTo", new Object[] { new Float(time) } ); try { 
isSampling	TokenNameIdentifier	 is Sampling
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
lastSampleTime	TokenNameIdentifier	 last Sample Time
=	TokenNameEQUAL	
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
isHyperlinking	TokenNameIdentifier	 is Hyperlinking
=	TokenNameEQUAL	
hyperlinking	TokenNameIdentifier	 hyperlinking
;	TokenNameSEMICOLON	
propagationFlags	TokenNameIdentifier	 propagation Flags
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// No time containers in SVG, so we don't have to worry 	TokenNameCOMMENT_LINE	No time containers in SVG, so we don't have to worry 
// about a partial ordering of timed elements to sample. 	TokenNameCOMMENT_LINE	about a partial ordering of timed elements to sample. 
float	TokenNamefloat	
mint	TokenNameIdentifier	 mint
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
TimedElement	TokenNameIdentifier	 Timed Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
es	TokenNameIdentifier	 es
=	TokenNameEQUAL	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
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
es	TokenNameIdentifier	 es
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
es	TokenNameIdentifier	 es
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
sampleAt	TokenNameIdentifier	 sample At
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
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
boolean	TokenNameboolean	
needsUpdates	TokenNameIdentifier	 needs Updates
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
needsUpdates	TokenNameIdentifier	 needs Updates
=	TokenNameEQUAL	
false	TokenNamefalse	
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
es	TokenNameIdentifier	 es
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
es	TokenNameIdentifier	 es
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
shouldUpdateCurrentInterval	TokenNameIdentifier	 should Update Current Interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
needsUpdates	TokenNameIdentifier	 needs Updates
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// System.err.print("{" + ((Test.AnimateElement) es[i]).id + "} "); 	TokenNameCOMMENT_LINE	System.err.print("{" + ((Test.AnimateElement) es[i]).id + "} "); 
float	TokenNamefloat	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
es	TokenNameIdentifier	 es
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
sampleAt	TokenNameIdentifier	 sample At
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
needsUpdates	TokenNameIdentifier	 needs Updates
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isSampling	TokenNameIdentifier	 is Sampling
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hyperlinking	TokenNameIdentifier	 hyperlinking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
currentIntervalWillUpdate	TokenNameIdentifier	 current Interval Will Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
mint	TokenNameIdentifier	 mint
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Resets the entire timegraph. */	TokenNameCOMMENT_JAVADOC	 Resets the entire timegraph. 
public	TokenNamepublic	
void	TokenNamevoid	
resetDocument	TokenNameIdentifier	 reset Document
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
documentBeginTime	TokenNameIdentifier	 document Begin Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
documentBeginTime	TokenNameIdentifier	 document Begin Time
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
documentBeginTime	TokenNameIdentifier	 document Begin Time
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
documentBeginTime	TokenNameIdentifier	 document Begin Time
=	TokenNameEQUAL	
documentBeginTime	TokenNameIdentifier	 document Begin Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the wallclock time that the document began. */	TokenNameCOMMENT_JAVADOC	 Returns the wallclock time that the document began. 
public	TokenNamepublic	
Calendar	TokenNameIdentifier	 Calendar
getDocumentBeginTime	TokenNameIdentifier	 get Document Begin Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
documentBeginTime	TokenNameIdentifier	 document Begin Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts an epoch time to document time. */	TokenNameCOMMENT_JAVADOC	 Converts an epoch time to document time. 
public	TokenNamepublic	
float	TokenNamefloat	
convertEpochTime	TokenNameIdentifier	 convert Epoch Time
(	TokenNameLPAREN	
long	TokenNamelong	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
documentBeginTime	TokenNameIdentifier	 document Begin Time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
-	TokenNameMINUS	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a wallclock time to document time. */	TokenNameCOMMENT_JAVADOC	 Converts a wallclock time to document time. 
public	TokenNamepublic	
float	TokenNamefloat	
convertWallclockTime	TokenNameIdentifier	 convert Wallclock Time
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
documentBeginTime	TokenNameIdentifier	 document Begin Time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
time	TokenNameIdentifier	 time
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
-	TokenNameMINUS	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
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
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
add	TokenNameIdentifier	 add
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
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fires an {@link TimegraphListener#elementAdded} event on all * timegraph listeners. */	TokenNameCOMMENT_JAVADOC	 Fires an {@link TimegraphListener#elementAdded} event on all timegraph listeners. 
void	TokenNamevoid	
fireElementAdded	TokenNameIdentifier	 fire Element Added
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
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
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TimegraphListener	TokenNameIdentifier	 Timegraph Listener
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
elementAdded	TokenNameIdentifier	 element Added
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires an {@link TimegraphListener#elementRemoved} event on all * timegraph listeners. */	TokenNameCOMMENT_JAVADOC	 Fires an {@link TimegraphListener#elementRemoved} event on all timegraph listeners. 
void	TokenNamevoid	
fireElementRemoved	TokenNameIdentifier	 fire Element Removed
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
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
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TimegraphListener	TokenNameIdentifier	 Timegraph Listener
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
elementRemoved	TokenNameIdentifier	 element Removed
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// XXX Add fire* methods for the other events in TimegraphListener, and make 	TokenNameCOMMENT_LINE	XXX Add fire* methods for the other events in TimegraphListener, and make 
// TimedElement fire them. 	TokenNameCOMMENT_LINE	TimedElement fire them. 
/** * Returns whether the specified newly created {@link Interval} should * propagate its times to the given {@link TimingSpecifier}. * @param i the Interval that has just been created * @param ts the TimingSpecifier that is a dependent of the Interval * @param isBegin whether the dependency is on the begin or end time of * the Interval */	TokenNameCOMMENT_JAVADOC	 Returns whether the specified newly created {@link Interval} should propagate its times to the given {@link TimingSpecifier}. @param i the Interval that has just been created @param ts the TimingSpecifier that is a dependent of the Interval @param isBegin whether the dependency is on the begin or end time of the Interval 
boolean	TokenNameboolean	
shouldPropagate	TokenNameIdentifier	 should Propagate
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstanceTime	TokenNameIdentifier	 Instance Time
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
isBegin	TokenNameIdentifier	 is Begin
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
getBeginInstanceTime	TokenNameIdentifier	 get Begin Instance Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
getEndInstanceTime	TokenNameIdentifier	 get End Instance Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propagationFlags	TokenNameIdentifier	 propagation Flags
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
,	TokenNameCOMMA	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
propagationFlags	TokenNameIdentifier	 propagation Flags
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
,	TokenNameCOMMA	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked by timed elements in this document to indicate that the current * interval will be re-evaluated at the next sample. This should be * overridden in a concrete class so that ticks can be scheduled immediately * if they are currently paused due to no animations being active. */	TokenNameCOMMENT_JAVADOC	 Invoked by timed elements in this document to indicate that the current interval will be re-evaluated at the next sample. This should be overridden in a concrete class so that ticks can be scheduled immediately if they are currently paused due to no animations being active. 
protected	TokenNameprotected	
void	TokenNamevoid	
currentIntervalWillUpdate	TokenNameIdentifier	 current Interval Will Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the namespace URI of the event that corresponds to the given * animation event name. */	TokenNameCOMMENT_JAVADOC	 Returns the namespace URI of the event that corresponds to the given animation event name. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getEventNamespaceURI	TokenNameIdentifier	 get Event Namespace URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eventName	TokenNameIdentifier	 event Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the type of the event that corresponds to the given * animation event name. */	TokenNameCOMMENT_JAVADOC	 Returns the type of the event that corresponds to the given animation event name. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getEventType	TokenNameIdentifier	 get Event Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eventName	TokenNameIdentifier	 event Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the name of the repeat event. * @return either "repeat" or "repeatEvent" */	TokenNameCOMMENT_JAVADOC	 Returns the name of the repeat event. @return either "repeat" or "repeatEvent" 
protected	TokenNameprotected	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getRepeatEventName	TokenNameIdentifier	 get Repeat Event Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
