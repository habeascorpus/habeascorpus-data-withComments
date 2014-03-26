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
/** * A class that represents an instance time created from a timing * specification. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: InstanceTime.java 580338 2007-09-28 13:13:46Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class that represents an instance time created from a timing specification. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: InstanceTime.java 580338 2007-09-28 13:13:46Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
InstanceTime	TokenNameIdentifier	 Instance Time
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
{	TokenNameLBRACE	
/** * The time. */	TokenNameCOMMENT_JAVADOC	 The time. 
protected	TokenNameprotected	
float	TokenNamefloat	
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
/** * The {@link TimingSpecifier} that created this InstanceTime. */	TokenNameCOMMENT_JAVADOC	 The {@link TimingSpecifier} that created this InstanceTime. 
protected	TokenNameprotected	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
creator	TokenNameIdentifier	 creator
;	TokenNameSEMICOLON	
/** * Whether this InstanceTime should be removed from an element's * begin or end instance time lists upon reset. */	TokenNameCOMMENT_JAVADOC	 Whether this InstanceTime should be removed from an element's begin or end instance time lists upon reset. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
clearOnReset	TokenNameIdentifier	 clear On Reset
;	TokenNameSEMICOLON	
/** * Creates a new InstanceTime. * @param creator the TimingSpecifier that created this InstanceTime * @param time the new time, in parent simple time * @param clearOnReset whether this InstanceTime should be removed from * an instance time list upon element reset */	TokenNameCOMMENT_JAVADOC	 Creates a new InstanceTime. @param creator the TimingSpecifier that created this InstanceTime @param time the new time, in parent simple time @param clearOnReset whether this InstanceTime should be removed from an instance time list upon element reset 
public	TokenNamepublic	
InstanceTime	TokenNameIdentifier	 Instance Time
(	TokenNameLPAREN	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
creator	TokenNameIdentifier	 creator
,	TokenNameCOMMA	
float	TokenNamefloat	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
boolean	TokenNameboolean	
clearOnReset	TokenNameIdentifier	 clear On Reset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, null, new Object[] { creator, new Float(time), timebase, new Boolean(clearOnReset) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, null, new Object[] { creator, new Float(time), timebase, new Boolean(clearOnReset) } ); try { 
this	TokenNamethis	
.	TokenNameDOT	
creator	TokenNameIdentifier	 creator
=	TokenNameEQUAL	
creator	TokenNameIdentifier	 creator
;	TokenNameSEMICOLON	
// XXX Convert time from the creator's syncbase's 	TokenNameCOMMENT_LINE	XXX Convert time from the creator's syncbase's 
// time system into this time system. Not 	TokenNameCOMMENT_LINE	time system into this time system. Not 
// strictly necessary in SVG. 	TokenNameCOMMENT_LINE	strictly necessary in SVG. 
this	TokenNamethis	
.	TokenNameDOT	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clearOnReset	TokenNameIdentifier	 clear On Reset
=	TokenNameEQUAL	
clearOnReset	TokenNameIdentifier	 clear On Reset
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Returns whether the InstanceTime should be removed from the * element's begin or end instance time list when it is reset. */	TokenNameCOMMENT_JAVADOC	 Returns whether the InstanceTime should be removed from the element's begin or end instance time list when it is reset. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getClearOnReset	TokenNameIdentifier	 get Clear On Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clearOnReset	TokenNameIdentifier	 clear On Reset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the time of this instance time. */	TokenNameCOMMENT_JAVADOC	 Returns the time of this instance time. 
public	TokenNamepublic	
float	TokenNamefloat	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by the dependent Interval to indicate that its time * has changed. * @param newTime the new time, in parent simple time */	TokenNameCOMMENT_JAVADOC	 Called by the dependent Interval to indicate that its time has changed. @param newTime the new time, in parent simple time 
float	TokenNamefloat	
dependentUpdate	TokenNameIdentifier	 dependent Update
(	TokenNameLPAREN	
float	TokenNamefloat	
newTime	TokenNameIdentifier	 new Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "dependentUpdate", new Object[] { new Float(newTime) } ); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "dependentUpdate", new Object[] { new Float(newTime) } ); try { 
// XXX Convert time from the creator's syncbase's 	TokenNameCOMMENT_LINE	XXX Convert time from the creator's syncbase's 
// time system into this time system. Not 	TokenNameCOMMENT_LINE	time system into this time system. Not 
// strictly necessary in SVG. 	TokenNameCOMMENT_LINE	strictly necessary in SVG. 
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
newTime	TokenNameIdentifier	 new Time
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
creator	TokenNameIdentifier	 creator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
creator	TokenNameIdentifier	 creator
.	TokenNameDOT	
handleTimebaseUpdate	TokenNameIdentifier	 handle Timebase Update
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Returns a string representation of this InstanceTime. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this InstanceTime. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Comparable //////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	Comparable //////////////////////////////////////////////////////////// 
/** * Compares this InstanceTime with another. */	TokenNameCOMMENT_JAVADOC	 Compares this InstanceTime with another. 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstanceTime	TokenNameIdentifier	 Instance Time
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstanceTime	TokenNameIdentifier	 Instance Time
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
==	TokenNameEQUAL_EQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
