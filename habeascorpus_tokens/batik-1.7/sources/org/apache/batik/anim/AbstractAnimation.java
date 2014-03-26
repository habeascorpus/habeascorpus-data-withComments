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
AnimatableElement	TokenNameIdentifier	 Animatable Element
;	TokenNameSEMICOLON	
// import org.apache.batik.anim.timing.Trace; 	TokenNameCOMMENT_LINE	import org.apache.batik.anim.timing.Trace; 
/** * An abstract base class for the different types of animation. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AbstractAnimation.java 478283 2006-11-22 18:53:40Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An abstract base class for the different types of animation. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AbstractAnimation.java 478283 2006-11-22 18:53:40Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
{	TokenNameLBRACE	
// Constants for calcMode. 	TokenNameCOMMENT_LINE	Constants for calcMode. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CALC_MODE_DISCRETE	TokenNameIdentifier	 CALC  MODE  DISCRETE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CALC_MODE_LINEAR	TokenNameIdentifier	 CALC  MODE  LINEAR
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CALC_MODE_PACED	TokenNameIdentifier	 CALC  MODE  PACED
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CALC_MODE_SPLINE	TokenNameIdentifier	 CALC  MODE  SPLINE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The TimedElement that controls the timing of this animation. */	TokenNameCOMMENT_JAVADOC	 The TimedElement that controls the timing of this animation. 
protected	TokenNameprotected	
TimedElement	TokenNameIdentifier	 Timed Element
timedElement	TokenNameIdentifier	 timed Element
;	TokenNameSEMICOLON	
/** * The AnimatableElement that gives access to underlying values in the * document. */	TokenNameCOMMENT_JAVADOC	 The AnimatableElement that gives access to underlying values in the document. 
protected	TokenNameprotected	
AnimatableElement	TokenNameIdentifier	 Animatable Element
animatableElement	TokenNameIdentifier	 animatable Element
;	TokenNameSEMICOLON	
/** * The animation that is lower in the sandwich. */	TokenNameCOMMENT_JAVADOC	 The animation that is lower in the sandwich. 
protected	TokenNameprotected	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
lowerAnimation	TokenNameIdentifier	 lower Animation
;	TokenNameSEMICOLON	
/** * The animation that is higher in the sandwich. */	TokenNameCOMMENT_JAVADOC	 The animation that is higher in the sandwich. 
protected	TokenNameprotected	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
higherAnimation	TokenNameIdentifier	 higher Animation
;	TokenNameSEMICOLON	
/** * Whether this animation needs recomputing. */	TokenNameCOMMENT_JAVADOC	 Whether this animation needs recomputing. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isDirty	TokenNameIdentifier	 is Dirty
;	TokenNameSEMICOLON	
/** * Whether this animation is active. */	TokenNameCOMMENT_JAVADOC	 Whether this animation is active. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isActive	TokenNameIdentifier	 is Active
;	TokenNameSEMICOLON	
/** * Whether this animation is frozen. */	TokenNameCOMMENT_JAVADOC	 Whether this animation is frozen. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isFrozen	TokenNameIdentifier	 is Frozen
;	TokenNameSEMICOLON	
/** * The time at which this animation became active. Used for ensuring the * sandwich order is correct when multiple animations become active * simultaneously. */	TokenNameCOMMENT_JAVADOC	 The time at which this animation became active. Used for ensuring the sandwich order is correct when multiple animations become active simultaneously. 
protected	TokenNameprotected	
float	TokenNamefloat	
beginTime	TokenNameIdentifier	 begin Time
;	TokenNameSEMICOLON	
/** * The value of this animation. */	TokenNameCOMMENT_JAVADOC	 The value of this animation. 
protected	TokenNameprotected	
AnimatableValue	TokenNameIdentifier	 Animatable Value
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * The value of this animation composed with any others. */	TokenNameCOMMENT_JAVADOC	 The value of this animation composed with any others. 
protected	TokenNameprotected	
AnimatableValue	TokenNameIdentifier	 Animatable Value
composedValue	TokenNameIdentifier	 composed Value
;	TokenNameSEMICOLON	
/** * Whether this animation depends on the underlying value. */	TokenNameCOMMENT_JAVADOC	 Whether this animation depends on the underlying value. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
usesUnderlyingValue	TokenNameIdentifier	 uses Underlying Value
;	TokenNameSEMICOLON	
/** * Whether this animation is a 'to-animation'. */	TokenNameCOMMENT_JAVADOC	 Whether this animation is a 'to-animation'. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
toAnimation	TokenNameIdentifier	 to Animation
;	TokenNameSEMICOLON	
/** * Creates a new Animation. */	TokenNameCOMMENT_JAVADOC	 Creates a new Animation. 
protected	TokenNameprotected	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
timedElement	TokenNameIdentifier	 timed Element
,	TokenNameCOMMA	
AnimatableElement	TokenNameIdentifier	 Animatable Element
animatableElement	TokenNameIdentifier	 animatable Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timedElement	TokenNameIdentifier	 timed Element
=	TokenNameEQUAL	
timedElement	TokenNameIdentifier	 timed Element
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
animatableElement	TokenNameIdentifier	 animatable Element
=	TokenNameEQUAL	
animatableElement	TokenNameIdentifier	 animatable Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the TimedElement for this animation. */	TokenNameCOMMENT_JAVADOC	 Returns the TimedElement for this animation. 
public	TokenNamepublic	
TimedElement	TokenNameIdentifier	 Timed Element
getTimedElement	TokenNameIdentifier	 get Timed Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timedElement	TokenNameIdentifier	 timed Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of this animation, or null if it isn't active. */	TokenNameCOMMENT_JAVADOC	 Returns the value of this animation, or null if it isn't active. 
public	TokenNamepublic	
AnimatableValue	TokenNameIdentifier	 Animatable Value
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isActive	TokenNameIdentifier	 is Active
&&	TokenNameAND_AND	
!	TokenNameNOT	
isFrozen	TokenNameIdentifier	 is Frozen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the composed value of this animation, or null if it isn't active. */	TokenNameCOMMENT_JAVADOC	 Returns the composed value of this animation, or null if it isn't active. 
public	TokenNamepublic	
AnimatableValue	TokenNameIdentifier	 Animatable Value
getComposedValue	TokenNameIdentifier	 get Composed Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.enter(this, "getComposedValue", null); try { 	TokenNameCOMMENT_LINE	Trace.enter(this, "getComposedValue", null); try { 
// Trace.print("isActive == " + isActive + ", isFrozen == " + isFrozen + ", isDirty == " + isDirty); 	TokenNameCOMMENT_LINE	Trace.print("isActive == " + isActive + ", isFrozen == " + isFrozen + ", isDirty == " + isDirty); 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isActive	TokenNameIdentifier	 is Active
&&	TokenNameAND_AND	
!	TokenNameNOT	
isFrozen	TokenNameIdentifier	 is Frozen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isDirty	TokenNameIdentifier	 is Dirty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.print("willReplace() == " + willReplace()); 	TokenNameCOMMENT_LINE	Trace.print("willReplace() == " + willReplace()); 
// Trace.print("value == " + value); 	TokenNameCOMMENT_LINE	Trace.print("value == " + value); 
AnimatableValue	TokenNameIdentifier	 Animatable Value
lowerValue	TokenNameIdentifier	 lower Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
willReplace	TokenNameIdentifier	 will Replace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trace.print("lowerAnimation == " + lowerAnimation); 	TokenNameCOMMENT_LINE	Trace.print("lowerAnimation == " + lowerAnimation); 
if	TokenNameif	
(	TokenNameLPAREN	
lowerAnimation	TokenNameIdentifier	 lower Animation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lowerValue	TokenNameIdentifier	 lower Value
=	TokenNameEQUAL	
animatableElement	TokenNameIdentifier	 animatable Element
.	TokenNameDOT	
getUnderlyingValue	TokenNameIdentifier	 get Underlying Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usesUnderlyingValue	TokenNameIdentifier	 uses Underlying Value
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lowerValue	TokenNameIdentifier	 lower Value
=	TokenNameEQUAL	
lowerAnimation	TokenNameIdentifier	 lower Animation
.	TokenNameDOT	
getComposedValue	TokenNameIdentifier	 get Composed Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usesUnderlyingValue	TokenNameIdentifier	 uses Underlying Value
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Trace.print("lowerValue == " + lowerValue); 	TokenNameCOMMENT_LINE	Trace.print("lowerValue == " + lowerValue); 
}	TokenNameRBRACE	
composedValue	TokenNameIdentifier	 composed Value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
composedValue	TokenNameIdentifier	 composed Value
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
lowerValue	TokenNameIdentifier	 lower Value
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Trace.print("composedValue == " + composedValue); 	TokenNameCOMMENT_LINE	Trace.print("composedValue == " + composedValue); 
isDirty	TokenNameIdentifier	 is Dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
composedValue	TokenNameIdentifier	 composed Value
;	TokenNameSEMICOLON	
// } finally { Trace.exit(); } 	TokenNameCOMMENT_LINE	} finally { Trace.exit(); } 
}	TokenNameRBRACE	
/** * Returns a string representation of this animation. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this animation. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timedElement	TokenNameIdentifier	 timed Element
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this animation depends on the underlying value. */	TokenNameCOMMENT_JAVADOC	 Returns whether this animation depends on the underlying value. 
public	TokenNamepublic	
boolean	TokenNameboolean	
usesUnderlyingValue	TokenNameIdentifier	 uses Underlying Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
usesUnderlyingValue	TokenNameIdentifier	 uses Underlying Value
||	TokenNameOR_OR	
toAnimation	TokenNameIdentifier	 to Animation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this animation will replace values on animations * lower in the sandwich. */	TokenNameCOMMENT_JAVADOC	 Returns whether this animation will replace values on animations lower in the sandwich. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
willReplace	TokenNameIdentifier	 will Replace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Marks this animation and any animation that depends on it * as dirty. */	TokenNameCOMMENT_JAVADOC	 Marks this animation and any animation that depends on it as dirty. 
protected	TokenNameprotected	
void	TokenNamevoid	
markDirty	TokenNameIdentifier	 mark Dirty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isDirty	TokenNameIdentifier	 is Dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
higherAnimation	TokenNameIdentifier	 higher Animation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
higherAnimation	TokenNameIdentifier	 higher Animation
.	TokenNameDOT	
willReplace	TokenNameIdentifier	 will Replace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
higherAnimation	TokenNameIdentifier	 higher Animation
.	TokenNameDOT	
isDirty	TokenNameIdentifier	 is Dirty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
higherAnimation	TokenNameIdentifier	 higher Animation
.	TokenNameDOT	
markDirty	TokenNameIdentifier	 mark Dirty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when the element is sampled for its "last" value. */	TokenNameCOMMENT_JAVADOC	 Called when the element is sampled for its "last" value. 
protected	TokenNameprotected	
void	TokenNamevoid	
sampledLastValue	TokenNameIdentifier	 sampled Last Value
(	TokenNameLPAREN	
int	TokenNameint	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when the element is sampled at the given time. This updates * the {@link #value} of the animation if active. */	TokenNameCOMMENT_JAVADOC	 Called when the element is sampled at the given time. This updates the {@link #value} of the animation if active. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
sampledAt	TokenNameIdentifier	 sampled At
(	TokenNameLPAREN	
float	TokenNamefloat	
simpleTime	TokenNameIdentifier	 simple Time
,	TokenNameCOMMA	
float	TokenNamefloat	
simpleDur	TokenNameIdentifier	 simple Dur
,	TokenNameCOMMA	
int	TokenNameint	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
