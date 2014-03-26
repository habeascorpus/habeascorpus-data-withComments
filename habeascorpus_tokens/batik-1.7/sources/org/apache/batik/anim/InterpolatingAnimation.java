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
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AnimatableElement	TokenNameIdentifier	 Animatable Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Cubic	TokenNameIdentifier	 Cubic
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
SMILConstants	TokenNameIdentifier	 SMIL Constants
;	TokenNameSEMICOLON	
/** * An abstract animation class for those animations that interpolate * values. Specifically, this is for animations that have the 'calcMode', * 'keyTimes', 'keySplines', 'additive' and 'cumulative' attributes. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: InterpolatingAnimation.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An abstract animation class for those animations that interpolate values. Specifically, this is for animations that have the 'calcMode', 'keyTimes', 'keySplines', 'additive' and 'cumulative' attributes. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: InterpolatingAnimation.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
InterpolatingAnimation	TokenNameIdentifier	 Interpolating Animation
extends	TokenNameextends	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
{	TokenNameLBRACE	
/** * The interpolation mode of this animator. This should take one * of the CALC_MODE_* constants defined in {@link AbstractAnimation}. */	TokenNameCOMMENT_JAVADOC	 The interpolation mode of this animator. This should take one of the CALC_MODE_* constants defined in {@link AbstractAnimation}. 
protected	TokenNameprotected	
int	TokenNameint	
calcMode	TokenNameIdentifier	 calc Mode
;	TokenNameSEMICOLON	
/** * Time values to control the pacing of the animation. */	TokenNameCOMMENT_JAVADOC	 Time values to control the pacing of the animation. 
protected	TokenNameprotected	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keyTimes	TokenNameIdentifier	 key Times
;	TokenNameSEMICOLON	
/** * Bezier control points that control the pacing of the animation. */	TokenNameCOMMENT_JAVADOC	 Bezier control points that control the pacing of the animation. 
protected	TokenNameprotected	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keySplines	TokenNameIdentifier	 key Splines
;	TokenNameSEMICOLON	
/** * Cubics built from the bezier control points in {@link #keySplines}. */	TokenNameCOMMENT_JAVADOC	 Cubics built from the bezier control points in {@link #keySplines}. 
protected	TokenNameprotected	
Cubic	TokenNameIdentifier	 Cubic
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keySplineCubics	TokenNameIdentifier	 key Spline Cubics
;	TokenNameSEMICOLON	
/** * Whether this animation adds to ones below it in the animation sandwich * or replaces them. */	TokenNameCOMMENT_JAVADOC	 Whether this animation adds to ones below it in the animation sandwich or replaces them. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
additive	TokenNameIdentifier	 additive
;	TokenNameSEMICOLON	
/** * Whether this animation accumulates from previous iterations. */	TokenNameCOMMENT_JAVADOC	 Whether this animation accumulates from previous iterations. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
cumulative	TokenNameIdentifier	 cumulative
;	TokenNameSEMICOLON	
/** * Creates a new InterpolatingAnimation. */	TokenNameCOMMENT_JAVADOC	 Creates a new InterpolatingAnimation. 
public	TokenNamepublic	
InterpolatingAnimation	TokenNameIdentifier	 Interpolating Animation
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
timedElement	TokenNameIdentifier	 timed Element
,	TokenNameCOMMA	
AnimatableElement	TokenNameIdentifier	 Animatable Element
animatableElement	TokenNameIdentifier	 animatable Element
,	TokenNameCOMMA	
int	TokenNameint	
calcMode	TokenNameIdentifier	 calc Mode
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keyTimes	TokenNameIdentifier	 key Times
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keySplines	TokenNameIdentifier	 key Splines
,	TokenNameCOMMA	
boolean	TokenNameboolean	
additive	TokenNameIdentifier	 additive
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cumulative	TokenNameIdentifier	 cumulative
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
timedElement	TokenNameIdentifier	 timed Element
,	TokenNameCOMMA	
animatableElement	TokenNameIdentifier	 animatable Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
calcMode	TokenNameIdentifier	 calc Mode
=	TokenNameEQUAL	
calcMode	TokenNameIdentifier	 calc Mode
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keyTimes	TokenNameIdentifier	 key Times
=	TokenNameEQUAL	
keyTimes	TokenNameIdentifier	 key Times
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keySplines	TokenNameIdentifier	 key Splines
=	TokenNameEQUAL	
keySplines	TokenNameIdentifier	 key Splines
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
additive	TokenNameIdentifier	 additive
=	TokenNameEQUAL	
additive	TokenNameIdentifier	 additive
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cumulative	TokenNameIdentifier	 cumulative
=	TokenNameEQUAL	
cumulative	TokenNameIdentifier	 cumulative
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
calcMode	TokenNameIdentifier	 calc Mode
==	TokenNameEQUAL_EQUAL	
CALC_MODE_SPLINE	TokenNameIdentifier	 CALC  MODE  SPLINE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keySplines	TokenNameIdentifier	 key Splines
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
keySplines	TokenNameIdentifier	 key Splines
.	TokenNameDOT	
length	TokenNameIdentifier	 length
%	TokenNameREMAINDER	
4	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
timedElement	TokenNameIdentifier	 timed Element
.	TokenNameDOT	
createException	TokenNameIdentifier	 create Exception
(	TokenNameLPAREN	
"attribute.malformed"	TokenNameStringLiteral	attribute.malformed
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
SMILConstants	TokenNameIdentifier	 SMIL Constants
.	TokenNameDOT	
SMIL_KEY_SPLINES_ATTRIBUTE	TokenNameIdentifier	 SMIL  KEY  SPLINES  ATTRIBUTE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
keySplineCubics	TokenNameIdentifier	 key Spline Cubics
=	TokenNameEQUAL	
new	TokenNamenew	
Cubic	TokenNameIdentifier	 Cubic
[	TokenNameLBRACKET	
keySplines	TokenNameIdentifier	 key Splines
.	TokenNameDOT	
length	TokenNameIdentifier	 length
/	TokenNameDIVIDE	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
keySplines	TokenNameIdentifier	 key Splines
.	TokenNameDOT	
length	TokenNameIdentifier	 length
/	TokenNameDIVIDE	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keySplineCubics	TokenNameIdentifier	 key Spline Cubics
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Cubic	TokenNameIdentifier	 Cubic
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
keySplines	TokenNameIdentifier	 key Splines
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
keySplines	TokenNameIdentifier	 key Splines
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
keySplines	TokenNameIdentifier	 key Splines
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
keySplines	TokenNameIdentifier	 key Splines
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keyTimes	TokenNameIdentifier	 key Times
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
invalidKeyTimes	TokenNameIdentifier	 invalid Key Times
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
calcMode	TokenNameIdentifier	 calc Mode
==	TokenNameEQUAL_EQUAL	
CALC_MODE_LINEAR	TokenNameIdentifier	 CALC  MODE  LINEAR
||	TokenNameOR_OR	
calcMode	TokenNameIdentifier	 calc Mode
==	TokenNameEQUAL_EQUAL	
CALC_MODE_SPLINE	TokenNameIdentifier	 CALC  MODE  SPLINE
||	TokenNameOR_OR	
calcMode	TokenNameIdentifier	 calc Mode
==	TokenNameEQUAL_EQUAL	
CALC_MODE_PACED	TokenNameIdentifier	 CALC  MODE  PACED
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
keyTimes	TokenNameIdentifier	 key Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
keyTimes	TokenNameIdentifier	 key Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
calcMode	TokenNameIdentifier	 calc Mode
==	TokenNameEQUAL_EQUAL	
CALC_MODE_DISCRETE	TokenNameIdentifier	 CALC  MODE  DISCRETE
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
keyTimes	TokenNameIdentifier	 key Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalidKeyTimes	TokenNameIdentifier	 invalid Key Times
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
invalidKeyTimes	TokenNameIdentifier	 invalid Key Times
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
keyTimes	TokenNameIdentifier	 key Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<	TokenNameLESS	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalidKeyTimes	TokenNameIdentifier	 invalid Key Times
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
invalidKeyTimes	TokenNameIdentifier	 invalid Key Times
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
timedElement	TokenNameIdentifier	 timed Element
.	TokenNameDOT	
createException	TokenNameIdentifier	 create Exception
(	TokenNameLPAREN	
"attribute.malformed"	TokenNameStringLiteral	attribute.malformed
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
SMILConstants	TokenNameIdentifier	 SMIL Constants
.	TokenNameDOT	
SMIL_KEY_TIMES_ATTRIBUTE	TokenNameIdentifier	 SMIL  KEY  TIMES  ATTRIBUTE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns whether this animation will replace values on animations * lower in the sandwich. */	TokenNameCOMMENT_JAVADOC	 Returns whether this animation will replace values on animations lower in the sandwich. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
willReplace	TokenNameIdentifier	 will Replace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
additive	TokenNameIdentifier	 additive
;	TokenNameSEMICOLON	
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
sampledAtUnitTime	TokenNameIdentifier	 sampled At Unit Time
(	TokenNameLPAREN	
1f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when the element is sampled at the given time. */	TokenNameCOMMENT_JAVADOC	 Called when the element is sampled at the given time. 
protected	TokenNameprotected	
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
{	TokenNameLBRACE	
float	TokenNamefloat	
unitTime	TokenNameIdentifier	 unit Time
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
simpleDur	TokenNameIdentifier	 simple Dur
==	TokenNameEQUAL_EQUAL	
TimedElement	TokenNameIdentifier	 Timed Element
.	TokenNameDOT	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unitTime	TokenNameIdentifier	 unit Time
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
unitTime	TokenNameIdentifier	 unit Time
=	TokenNameEQUAL	
simpleTime	TokenNameIdentifier	 simple Time
/	TokenNameDIVIDE	
simpleDur	TokenNameIdentifier	 simple Dur
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sampledAtUnitTime	TokenNameIdentifier	 sampled At Unit Time
(	TokenNameLPAREN	
unitTime	TokenNameIdentifier	 unit Time
,	TokenNameCOMMA	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when the element is sampled at the given unit time. This updates * the {@link #value} of the animation if active. */	TokenNameCOMMENT_JAVADOC	 Called when the element is sampled at the given unit time. This updates the {@link #value} of the animation if active. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
sampledAtUnitTime	TokenNameIdentifier	 sampled At Unit Time
(	TokenNameLPAREN	
float	TokenNamefloat	
unitTime	TokenNameIdentifier	 unit Time
,	TokenNameCOMMA	
int	TokenNameint	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
