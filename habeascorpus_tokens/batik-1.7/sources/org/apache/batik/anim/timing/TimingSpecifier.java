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
/** * An abstract class for SMIL timing specifiers. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: TimingSpecifier.java 485485 2006-12-11 04:04:53Z cam $ */	TokenNameCOMMENT_JAVADOC	 An abstract class for SMIL timing specifiers. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: TimingSpecifier.java 485485 2006-12-11 04:04:53Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
{	TokenNameLBRACE	
/** * The element that owns this timing specifier. */	TokenNameCOMMENT_JAVADOC	 The element that owns this timing specifier. 
protected	TokenNameprotected	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
/** * Whether this timing specifier is for a begin time or an end time. */	TokenNameCOMMENT_JAVADOC	 Whether this timing specifier is for a begin time or an end time. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
;	TokenNameSEMICOLON	
/** * Creates a new TimingSpecifier object. */	TokenNameCOMMENT_JAVADOC	 Creates a new TimingSpecifier object. 
protected	TokenNameprotected	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
owner	TokenNameIdentifier	 owner
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isBegin	TokenNameIdentifier	 is Begin
=	TokenNameEQUAL	
isBegin	TokenNameIdentifier	 is Begin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the element that owns this timing specifier. */	TokenNameCOMMENT_JAVADOC	 Returns the element that owns this timing specifier. 
public	TokenNamepublic	
TimedElement	TokenNameIdentifier	 Timed Element
getOwner	TokenNameIdentifier	 get Owner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this timing specifier is in the owner's begin list, * false if it is in the owner's end list. */	TokenNameCOMMENT_JAVADOC	 Returns true if this timing specifier is in the owner's begin list, false if it is in the owner's end list. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isBegin	TokenNameIdentifier	 is Begin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this timing specifier by adding the initial instance time * to the owner's instance time list or setting up any event listeners. * This should be overriden in descendant classes. */	TokenNameCOMMENT_JAVADOC	 Initializes this timing specifier by adding the initial instance time to the owner's instance time list or setting up any event listeners. This should be overriden in descendant classes. 
public	TokenNamepublic	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Deinitializes this timing specifier by removing any event listeners. * This should be overriden in descendant classes. */	TokenNameCOMMENT_JAVADOC	 Deinitializes this timing specifier by removing any event listeners. This should be overriden in descendant classes. 
public	TokenNamepublic	
void	TokenNamevoid	
deinitialize	TokenNameIdentifier	 deinitialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns whether this timing specifier is event-like (i.e., if it is * an eventbase, accesskey or a repeat timing specifier). */	TokenNameCOMMENT_JAVADOC	 Returns whether this timing specifier is event-like (i.e., if it is an eventbase, accesskey or a repeat timing specifier). 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isEventCondition	TokenNameIdentifier	 is Event Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called by the timebase element when it creates a new Interval. * This should be overridden in descendant classes that generate * time instances based on the interval of a timebase element. */	TokenNameCOMMENT_JAVADOC	 Called by the timebase element when it creates a new Interval. This should be overridden in descendant classes that generate time instances based on the interval of a timebase element. 
float	TokenNamefloat	
newInterval	TokenNameIdentifier	 new Interval
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by the timebase element when it deletes an Interval. * This should be overridden in descendant classes that generate * time instances based on the interval of a timebase element. */	TokenNameCOMMENT_JAVADOC	 Called by the timebase element when it deletes an Interval. This should be overridden in descendant classes that generate time instances based on the interval of a timebase element. 
float	TokenNamefloat	
removeInterval	TokenNameIdentifier	 remove Interval
(	TokenNameLPAREN	
Interval	TokenNameIdentifier	 Interval
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by an {@link InstanceTime} created by this TimingSpecifier * to indicate that its value has changed. This should be overriden * in descendant classes that generate time instances based on the * interval of a timebase element. */	TokenNameCOMMENT_JAVADOC	 Called by an {@link InstanceTime} created by this TimingSpecifier to indicate that its value has changed. This should be overriden in descendant classes that generate time instances based on the interval of a timebase element. 
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
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
