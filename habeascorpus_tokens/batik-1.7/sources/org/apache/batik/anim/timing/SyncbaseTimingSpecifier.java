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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
WeakReference	TokenNameIdentifier	 Weak Reference
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
/** * A class to handle syncbase SMIL timing specifiers. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SyncbaseTimingSpecifier.java 580338 2007-09-28 13:13:46Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class to handle syncbase SMIL timing specifiers. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SyncbaseTimingSpecifier.java 580338 2007-09-28 13:13:46Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SyncbaseTimingSpecifier	TokenNameIdentifier	 Syncbase Timing Specifier
extends	TokenNameextends	
OffsetTimingSpecifier	TokenNameIdentifier	 Offset Timing Specifier
{	TokenNameLBRACE	
/** * The ID of the syncbase element. */	TokenNameCOMMENT_JAVADOC	 The ID of the syncbase element. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
syncbaseID	TokenNameIdentifier	 syncbase ID
;	TokenNameSEMICOLON	
/** * The syncbase element. */	TokenNameCOMMENT_JAVADOC	 The syncbase element. 
protected	TokenNameprotected	
TimedElement	TokenNameIdentifier	 Timed Element
syncbaseElement	TokenNameIdentifier	 syncbase Element
;	TokenNameSEMICOLON	
/** * Whether this specifier specifies a sync to the begin or the end * of the syncbase element. */	TokenNameCOMMENT_JAVADOC	 Whether this specifier specifies a sync to the begin or the end of the syncbase element. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
syncBegin	TokenNameIdentifier	 sync Begin
;	TokenNameSEMICOLON	
/** * Map of {@link Interval}s to <!--a {@link WeakReference} to -->an * {@link InstanceTime}. */	TokenNameCOMMENT_JAVADOC	 Map of {@link Interval}s to <!--a {@link WeakReference} to -->an {@link InstanceTime}. 
protected	TokenNameprotected	
HashMap	TokenNameIdentifier	 Hash Map
instances	TokenNameIdentifier	 instances
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new SyncbaseTimingSpecifier object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SyncbaseTimingSpecifier object. 
public	TokenNamepublic	
SyncbaseTimingSpecifier	TokenNameIdentifier	 Syncbase Timing Specifier
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
syncbaseID	TokenNameIdentifier	 syncbase ID
,	TokenNameCOMMA	
boolean	TokenNameboolean	
syncBegin	TokenNameIdentifier	 sync Begin
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
// Trace.enter(this, null, new Object[] { owner, new Boolean(isBegin), new Float(offset), syncbaseID, new Boolean(syncBegin) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, null, new Object[] { owner, new Boolean(isBegin), new Float(offset), syncbaseID, new Boolean(syncBegin) } ); try { 
this	TokenNamethis	
.	TokenNameDOT	
syncbaseID	TokenNameIdentifier	 syncbase ID
=	TokenNameEQUAL	
syncbaseID	TokenNameIdentifier	 syncbase ID
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
syncBegin	TokenNameIdentifier	 sync Begin
=	TokenNameEQUAL	
syncBegin	TokenNameIdentifier	 sync Begin
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
syncbaseElement	TokenNameIdentifier	 syncbase Element
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getTimedElementById	TokenNameIdentifier	 get Timed Element By Id
(	TokenNameLPAREN	
syncbaseID	TokenNameIdentifier	 syncbase ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syncbaseElement	TokenNameIdentifier	 syncbase Element
.	TokenNameDOT	
addDependent	TokenNameIdentifier	 add Dependent
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
syncBegin	TokenNameIdentifier	 sync Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Returns a string representation of this timing specifier. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this timing specifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
syncbaseID	TokenNameIdentifier	 syncbase ID
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
(	TokenNameLPAREN	
syncBegin	TokenNameIdentifier	 sync Begin
?	TokenNameQUESTION	
"begin"	TokenNameStringLiteral	begin
:	TokenNameCOLON	
"end"	TokenNameStringLiteral	end
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
/** * Returns whether this timing specifier is event-like (i.e., if it is * an eventbase, accesskey or a repeat timing specifier). */	TokenNameCOMMENT_JAVADOC	 Returns whether this timing specifier is event-like (i.e., if it is an eventbase, accesskey or a repeat timing specifier). 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEventCondition	TokenNameIdentifier	 is Event Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by the timebase element when it creates a new Interval. */	TokenNameCOMMENT_JAVADOC	 Called by the timebase element when it creates a new Interval. 
float	TokenNamefloat	
newInterval	TokenNameIdentifier	 new Interval
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "newInterval", new Object[] { interval } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "newInterval", new Object[] { interval } ); try { 
if	TokenNameif	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
hasPropagated	TokenNameIdentifier	 has Propagated
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
InstanceTime	TokenNameIdentifier	 Instance Time
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
InstanceTime	TokenNameIdentifier	 Instance Time
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
syncBegin	TokenNameIdentifier	 sync Begin
?	TokenNameQUESTION	
interval	TokenNameIdentifier	 interval
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
interval	TokenNameIdentifier	 interval
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
interval	TokenNameIdentifier	 interval
,	TokenNameCOMMA	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interval	TokenNameIdentifier	 interval
.	TokenNameDOT	
addDependent	TokenNameIdentifier	 add Dependent
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
syncBegin	TokenNameIdentifier	 sync Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
addInstanceTime	TokenNameIdentifier	 add Instance Time
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Called by the timebase element when it deletes an Interval. */	TokenNameCOMMENT_JAVADOC	 Called by the timebase element when it deletes an Interval. 
float	TokenNamefloat	
removeInterval	TokenNameIdentifier	 remove Interval
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "removeInterval", new Object[] { interval } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "removeInterval", new Object[] { interval } ); try { 
if	TokenNameif	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
hasPropagated	TokenNameIdentifier	 has Propagated
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
InstanceTime	TokenNameIdentifier	 Instance Time
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
)	TokenNameRPAREN	
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interval	TokenNameIdentifier	 interval
.	TokenNameDOT	
removeDependent	TokenNameIdentifier	 remove Dependent
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
syncBegin	TokenNameIdentifier	 sync Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
removeInstanceTime	TokenNameIdentifier	 remove Instance Time
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Called by an {@link InstanceTime} created by this TimingSpecifier * to indicate that its value has changed. */	TokenNameCOMMENT_JAVADOC	 Called by an {@link InstanceTime} created by this TimingSpecifier to indicate that its value has changed. 
float	TokenNamefloat	
handleTimebaseUpdate	TokenNameIdentifier	 handle Timebase Update
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
instanceTime	TokenNameIdentifier	 instance Time
,	TokenNameCOMMA	
float	TokenNamefloat	
newTime	TokenNameIdentifier	 new Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "handleTimebaseUpdate", new Object[] { instanceTime, new Float(newTime) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "handleTimebaseUpdate", new Object[] { instanceTime, new Float(newTime) } ); try { 
if	TokenNameif	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
hasPropagated	TokenNameIdentifier	 has Propagated
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
instanceTimeChanged	TokenNameIdentifier	 instance Time Changed
(	TokenNameLPAREN	
instanceTime	TokenNameIdentifier	 instance Time
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
