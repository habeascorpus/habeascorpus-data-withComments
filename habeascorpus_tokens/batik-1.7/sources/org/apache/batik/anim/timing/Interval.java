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
/** * A class that represents an interval for a timed element. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: Interval.java 492528 2007-01-04 11:45:47Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class that represents an interval for a timed element. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: Interval.java 492528 2007-01-04 11:45:47Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
Interval	TokenNameIdentifier	 Interval
{	TokenNameLBRACE	
/** * The begin time for the interval. */	TokenNameCOMMENT_JAVADOC	 The begin time for the interval. 
protected	TokenNameprotected	
float	TokenNamefloat	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
/** * The end time for the interval. */	TokenNameCOMMENT_JAVADOC	 The end time for the interval. 
protected	TokenNameprotected	
float	TokenNamefloat	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
/** * The InstanceTime that defined the begin time of the current interval. */	TokenNameCOMMENT_JAVADOC	 The InstanceTime that defined the begin time of the current interval. 
protected	TokenNameprotected	
InstanceTime	TokenNameIdentifier	 Instance Time
beginInstanceTime	TokenNameIdentifier	 begin Instance Time
;	TokenNameSEMICOLON	
/** * The InstanceTime that defined the end time of the current interval. */	TokenNameCOMMENT_JAVADOC	 The InstanceTime that defined the end time of the current interval. 
protected	TokenNameprotected	
InstanceTime	TokenNameIdentifier	 Instance Time
endInstanceTime	TokenNameIdentifier	 end Instance Time
;	TokenNameSEMICOLON	
/** * The list of {@link InstanceTime} objects that are dependent * on the begin time of this Interval. */	TokenNameCOMMENT_JAVADOC	 The list of {@link InstanceTime} objects that are dependent on the begin time of this Interval. 
protected	TokenNameprotected	
LinkedList	TokenNameIdentifier	 Linked List
beginDependents	TokenNameIdentifier	 begin Dependents
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The list of {@link InstanceTime} objects that are dependent * on the end time of this Interval. */	TokenNameCOMMENT_JAVADOC	 The list of {@link InstanceTime} objects that are dependent on the end time of this Interval. 
protected	TokenNameprotected	
LinkedList	TokenNameIdentifier	 Linked List
endDependents	TokenNameIdentifier	 end Dependents
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new Interval. * @param begin the begin time of the Interval * @param end the end time of the Interval * @param beginInstanceTime the {@link InstanceTime} object that defined * the begin time of the Interval * @param endInstanceTime the {@link InstanceTime} object that defined * the end time of the Interval */	TokenNameCOMMENT_JAVADOC	 Creates a new Interval. @param begin the begin time of the Interval @param end the end time of the Interval @param beginInstanceTime the {@link InstanceTime} object that defined the begin time of the Interval @param endInstanceTime the {@link InstanceTime} object that defined the end time of the Interval 
public	TokenNamepublic	
Interval	TokenNameIdentifier	 Interval
(	TokenNameLPAREN	
float	TokenNamefloat	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
float	TokenNamefloat	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
InstanceTime	TokenNameIdentifier	 Instance Time
beginInstanceTime	TokenNameIdentifier	 begin Instance Time
,	TokenNameCOMMA	
InstanceTime	TokenNameIdentifier	 Instance Time
endInstanceTime	TokenNameIdentifier	 end Instance Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, null, new Object[] { new Float(begin), new Float(end), beginInstanceTime, endInstanceTime } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, null, new Object[] { new Float(begin), new Float(end), beginInstanceTime, endInstanceTime } ); try { 
this	TokenNamethis	
.	TokenNameDOT	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
beginInstanceTime	TokenNameIdentifier	 begin Instance Time
=	TokenNameEQUAL	
beginInstanceTime	TokenNameIdentifier	 begin Instance Time
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endInstanceTime	TokenNameIdentifier	 end Instance Time
=	TokenNameEQUAL	
endInstanceTime	TokenNameIdentifier	 end Instance Time
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Returns a string representation of this Interval. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this Interval. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TimedElement	TokenNameIdentifier	 Timed Element
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
+	TokenNamePLUS	
".."	TokenNameStringLiteral	..
+	TokenNamePLUS	
TimedElement	TokenNameIdentifier	 Timed Element
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the begin time of this interval. */	TokenNameCOMMENT_JAVADOC	 Returns the begin time of this interval. 
public	TokenNamepublic	
float	TokenNamefloat	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the end time of this interval. */	TokenNameCOMMENT_JAVADOC	 Returns the end time of this interval. 
public	TokenNamepublic	
float	TokenNamefloat	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link InstanceTime} that defined the begin time of this * interval. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link InstanceTime} that defined the begin time of this interval. 
public	TokenNamepublic	
InstanceTime	TokenNameIdentifier	 Instance Time
getBeginInstanceTime	TokenNameIdentifier	 get Begin Instance Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
beginInstanceTime	TokenNameIdentifier	 begin Instance Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link InstanceTime} that defined the end time of this * interval. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link InstanceTime} that defined the end time of this interval. 
public	TokenNamepublic	
InstanceTime	TokenNameIdentifier	 Instance Time
getEndInstanceTime	TokenNameIdentifier	 get End Instance Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
endInstanceTime	TokenNameIdentifier	 end Instance Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a dependent InstanceTime for this Interval. */	TokenNameCOMMENT_JAVADOC	 Adds a dependent InstanceTime for this Interval. 
void	TokenNamevoid	
addDependent	TokenNameIdentifier	 add Dependent
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
dependent	TokenNameIdentifier	 dependent
,	TokenNameCOMMA	
boolean	TokenNameboolean	
forBegin	TokenNameIdentifier	 for Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "addDependent", new Object[] { dependent, new Boolean(forBegin) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "addDependent", new Object[] { dependent, new Boolean(forBegin) } ); try { 
if	TokenNameif	
(	TokenNameLPAREN	
forBegin	TokenNameIdentifier	 for Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beginDependents	TokenNameIdentifier	 begin Dependents
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dependent	TokenNameIdentifier	 dependent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
endDependents	TokenNameIdentifier	 end Dependents
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dependent	TokenNameIdentifier	 dependent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Removes a dependent InstanceTime for this Interval. */	TokenNameCOMMENT_JAVADOC	 Removes a dependent InstanceTime for this Interval. 
void	TokenNamevoid	
removeDependent	TokenNameIdentifier	 remove Dependent
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
dependent	TokenNameIdentifier	 dependent
,	TokenNameCOMMA	
boolean	TokenNameboolean	
forBegin	TokenNameIdentifier	 for Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "removeDependent", new Object[] { dependent, new Boolean(forBegin) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "removeDependent", new Object[] { dependent, new Boolean(forBegin) } ); try { 
if	TokenNameif	
(	TokenNameLPAREN	
forBegin	TokenNameIdentifier	 for Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
beginDependents	TokenNameIdentifier	 begin Dependents
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
dependent	TokenNameIdentifier	 dependent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
endDependents	TokenNameIdentifier	 end Dependents
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
dependent	TokenNameIdentifier	 dependent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Updates the begin time for this interval. */	TokenNameCOMMENT_JAVADOC	 Updates the begin time for this interval. 
float	TokenNamefloat	
setBegin	TokenNameIdentifier	 set Begin
(	TokenNameLPAREN	
float	TokenNamefloat	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "setBegin", new Object[] { new Float(begin) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "setBegin", new Object[] { new Float(begin) } ); try { 
float	TokenNamefloat	
minTime	TokenNameIdentifier	 min Time
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
beginDependents	TokenNameIdentifier	 begin Dependents
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
InstanceTime	TokenNameIdentifier	 Instance Time
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
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
it	TokenNameIdentifier	 it
.	TokenNameDOT	
dependentUpdate	TokenNameIdentifier	 dependent Update
(	TokenNameLPAREN	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
minTime	TokenNameIdentifier	 min Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minTime	TokenNameIdentifier	 min Time
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
minTime	TokenNameIdentifier	 min Time
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Updates the end time for this interval. */	TokenNameCOMMENT_JAVADOC	 Updates the end time for this interval. 
float	TokenNamefloat	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
float	TokenNamefloat	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
InstanceTime	TokenNameIdentifier	 Instance Time
endInstanceTime	TokenNameIdentifier	 end Instance Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "setEnd", new Object[] { new Float(end) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "setEnd", new Object[] { new Float(end) } ); try { 
float	TokenNamefloat	
minTime	TokenNameIdentifier	 min Time
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endInstanceTime	TokenNameIdentifier	 end Instance Time
=	TokenNameEQUAL	
endInstanceTime	TokenNameIdentifier	 end Instance Time
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
endDependents	TokenNameIdentifier	 end Dependents
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
InstanceTime	TokenNameIdentifier	 Instance Time
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
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
it	TokenNameIdentifier	 it
.	TokenNameDOT	
dependentUpdate	TokenNameIdentifier	 dependent Update
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
<	TokenNameLESS	
minTime	TokenNameIdentifier	 min Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minTime	TokenNameIdentifier	 min Time
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
minTime	TokenNameIdentifier	 min Time
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
