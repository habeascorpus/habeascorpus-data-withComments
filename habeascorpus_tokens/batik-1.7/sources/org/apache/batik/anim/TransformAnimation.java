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
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGTransform	TokenNameIdentifier	 SVG Transform
;	TokenNameSEMICOLON	
/** * An animation class for 'animateTransform' animations. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: TransformAnimation.java 492528 2007-01-04 11:45:47Z cam $ */	TokenNameCOMMENT_JAVADOC	 An animation class for 'animateTransform' animations. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: TransformAnimation.java 492528 2007-01-04 11:45:47Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TransformAnimation	TokenNameIdentifier	 Transform Animation
extends	TokenNameextends	
SimpleAnimation	TokenNameIdentifier	 Simple Animation
{	TokenNameLBRACE	
/** * The transform type. This should take one of the constants defined * in {@link org.w3c.dom.svg.SVGTransform}. */	TokenNameCOMMENT_JAVADOC	 The transform type. This should take one of the constants defined in {@link org.w3c.dom.svg.SVGTransform}. 
protected	TokenNameprotected	
short	TokenNameshort	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * Time values to control the pacing of the second component of the * animation. */	TokenNameCOMMENT_JAVADOC	 Time values to control the pacing of the second component of the animation. 
protected	TokenNameprotected	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keyTimes2	TokenNameIdentifier	 key Times2
;	TokenNameSEMICOLON	
/** * Time values to control the pacing of the third component of the * animation. */	TokenNameCOMMENT_JAVADOC	 Time values to control the pacing of the third component of the animation. 
protected	TokenNameprotected	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keyTimes3	TokenNameIdentifier	 key Times3
;	TokenNameSEMICOLON	
/** * Creates a new TransformAnimation. */	TokenNameCOMMENT_JAVADOC	 Creates a new TransformAnimation. 
public	TokenNamepublic	
TransformAnimation	TokenNameIdentifier	 Transform Animation
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
,	TokenNameCOMMA	
AnimatableValue	TokenNameIdentifier	 Animatable Value
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
AnimatableValue	TokenNameIdentifier	 Animatable Value
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
AnimatableValue	TokenNameIdentifier	 Animatable Value
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
AnimatableValue	TokenNameIdentifier	 Animatable Value
by	TokenNameIdentifier	 by
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// pretend we didn't get a calcMode="paced", since we need specialised 	TokenNameCOMMENT_LINE	pretend we didn't get a calcMode="paced", since we need specialised 
// behaviour in sampledAtUnitTime. 	TokenNameCOMMENT_LINE	behaviour in sampledAtUnitTime. 
super	TokenNamesuper	
(	TokenNameLPAREN	
timedElement	TokenNameIdentifier	 timed Element
,	TokenNameCOMMA	
animatableElement	TokenNameIdentifier	 animatable Element
,	TokenNameCOMMA	
calcMode	TokenNameIdentifier	 calc Mode
==	TokenNameEQUAL_EQUAL	
CALC_MODE_PACED	TokenNameIdentifier	 CALC  MODE  PACED
?	TokenNameQUESTION	
CALC_MODE_LINEAR	TokenNameIdentifier	 CALC  MODE  LINEAR
:	TokenNameCOLON	
calcMode	TokenNameIdentifier	 calc Mode
,	TokenNameCOMMA	
calcMode	TokenNameIdentifier	 calc Mode
==	TokenNameEQUAL_EQUAL	
CALC_MODE_PACED	TokenNameIdentifier	 CALC  MODE  PACED
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
keyTimes	TokenNameIdentifier	 key Times
,	TokenNameCOMMA	
keySplines	TokenNameIdentifier	 key Splines
,	TokenNameCOMMA	
additive	TokenNameIdentifier	 additive
,	TokenNameCOMMA	
cumulative	TokenNameIdentifier	 cumulative
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
by	TokenNameIdentifier	 by
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
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
calcMode	TokenNameIdentifier	 calc Mode
!=	TokenNameNOT_EQUAL	
CALC_MODE_PACED	TokenNameIdentifier	 CALC  MODE  PACED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Determine the equivalent keyTimes for the individual components 	TokenNameCOMMENT_LINE	Determine the equivalent keyTimes for the individual components 
// of the transforms for CALC_MODE_PACED. 	TokenNameCOMMENT_LINE	of the transforms for CALC_MODE_PACED. 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cumulativeDistances1	TokenNameIdentifier	 cumulative Distances1
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cumulativeDistances2	TokenNameIdentifier	 cumulative Distances2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cumulativeDistances3	TokenNameIdentifier	 cumulative Distances3
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
cumulativeDistances3	TokenNameIdentifier	 cumulative Distances3
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cumulativeDistances3	TokenNameIdentifier	 cumulative Distances3
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
:	TokenNameCOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
:	TokenNameCOLON	
cumulativeDistances2	TokenNameIdentifier	 cumulative Distances2
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cumulativeDistances2	TokenNameIdentifier	 cumulative Distances2
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
default	TokenNamedefault	
:	TokenNameCOLON	
cumulativeDistances1	TokenNameIdentifier	 cumulative Distances1
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cumulativeDistances1	TokenNameIdentifier	 cumulative Distances1
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
cumulativeDistances3	TokenNameIdentifier	 cumulative Distances3
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cumulativeDistances3	TokenNameIdentifier	 cumulative Distances3
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
distanceTo3	TokenNameIdentifier	 distance To3
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
:	TokenNameCOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
:	TokenNameCOLON	
cumulativeDistances2	TokenNameIdentifier	 cumulative Distances2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cumulativeDistances2	TokenNameIdentifier	 cumulative Distances2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
distanceTo2	TokenNameIdentifier	 distance To2
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
default	TokenNamedefault	
:	TokenNameCOLON	
cumulativeDistances1	TokenNameIdentifier	 cumulative Distances1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cumulativeDistances1	TokenNameIdentifier	 cumulative Distances1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
distanceTo1	TokenNameIdentifier	 distance To1
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
float	TokenNamefloat	
totalLength	TokenNameIdentifier	 total Length
=	TokenNameEQUAL	
cumulativeDistances3	TokenNameIdentifier	 cumulative Distances3
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
keyTimes3	TokenNameIdentifier	 key Times3
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
keyTimes3	TokenNameIdentifier	 key Times3
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keyTimes3	TokenNameIdentifier	 key Times3
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cumulativeDistances3	TokenNameIdentifier	 cumulative Distances3
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
totalLength	TokenNameIdentifier	 total Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
keyTimes3	TokenNameIdentifier	 key Times3
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
:	TokenNameCOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
:	TokenNameCOLON	
totalLength	TokenNameIdentifier	 total Length
=	TokenNameEQUAL	
cumulativeDistances2	TokenNameIdentifier	 cumulative Distances2
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
keyTimes2	TokenNameIdentifier	 key Times2
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
keyTimes2	TokenNameIdentifier	 key Times2
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keyTimes2	TokenNameIdentifier	 key Times2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cumulativeDistances2	TokenNameIdentifier	 cumulative Distances2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
totalLength	TokenNameIdentifier	 total Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
keyTimes2	TokenNameIdentifier	 key Times2
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
default	TokenNamedefault	
:	TokenNameCOLON	
totalLength	TokenNameIdentifier	 total Length
=	TokenNameEQUAL	
cumulativeDistances1	TokenNameIdentifier	 cumulative Distances1
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keyTimes	TokenNameIdentifier	 key Times
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cumulativeDistances1	TokenNameIdentifier	 cumulative Distances1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
totalLength	TokenNameIdentifier	 total Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when the element is sampled at the given unit time. This updates * the {@link #value} of the animation if active. */	TokenNameCOMMENT_JAVADOC	 Called when the element is sampled at the given unit time. This updates the {@link #value} of the animation if active. 
protected	TokenNameprotected	
void	TokenNamevoid	
sampledAtUnitTime	TokenNameIdentifier	 sampled At Unit Time
(	TokenNameLPAREN	
float	TokenNamefloat	
unitTime	TokenNameIdentifier	 unit Time
,	TokenNameCOMMA	
int	TokenNameint	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note that skews are handled by SimpleAnimation and not here, since 	TokenNameCOMMENT_LINE	Note that skews are handled by SimpleAnimation and not here, since 
// they need just the one component of interpolation. 	TokenNameCOMMENT_LINE	they need just the one component of interpolation. 
if	TokenNameif	
(	TokenNameLPAREN	
calcMode	TokenNameIdentifier	 calc Mode
!=	TokenNameNOT_EQUAL	
CALC_MODE_PACED	TokenNameIdentifier	 CALC  MODE  PACED
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWX	TokenNameIdentifier	 SVG  TRANSFORM  SKEWX
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWY	TokenNameIdentifier	 SVG  TRANSFORM  SKEWY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
sampledAtUnitTime	TokenNameIdentifier	 sampled At Unit Time
(	TokenNameLPAREN	
unitTime	TokenNameIdentifier	 unit Time
,	TokenNameCOMMA	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
value1	TokenNameIdentifier	 value1
,	TokenNameCOMMA	
value2	TokenNameIdentifier	 value2
,	TokenNameCOMMA	
value3	TokenNameIdentifier	 value3
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
nextValue1	TokenNameIdentifier	 next Value1
,	TokenNameCOMMA	
nextValue2	TokenNameIdentifier	 next Value2
,	TokenNameCOMMA	
nextValue3	TokenNameIdentifier	 next Value3
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
accumulation	TokenNameIdentifier	 accumulation
;	TokenNameSEMICOLON	
float	TokenNamefloat	
interpolation1	TokenNameIdentifier	 interpolation1
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
interpolation2	TokenNameIdentifier	 interpolation2
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
interpolation3	TokenNameIdentifier	 interpolation3
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
unitTime	TokenNameIdentifier	 unit Time
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
int	TokenNameint	
keyTimeIndex	TokenNameIdentifier	 key Time Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keyTimeIndex	TokenNameIdentifier	 key Time Index
<	TokenNameLESS	
keyTimes3	TokenNameIdentifier	 key Times3
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
unitTime	TokenNameIdentifier	 unit Time
>=	TokenNameGREATER_EQUAL	
keyTimes3	TokenNameIdentifier	 key Times3
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keyTimeIndex	TokenNameIdentifier	 key Time Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
value3	TokenNameIdentifier	 value3
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
nextValue3	TokenNameIdentifier	 next Value3
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
interpolation3	TokenNameIdentifier	 interpolation3
=	TokenNameEQUAL	
(	TokenNameLPAREN	
unitTime	TokenNameIdentifier	 unit Time
-	TokenNameMINUS	
keyTimes3	TokenNameIdentifier	 key Times3
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
keyTimes3	TokenNameIdentifier	 key Times3
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
keyTimes3	TokenNameIdentifier	 key Times3
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
default	TokenNamedefault	
:	TokenNameCOLON	
keyTimeIndex	TokenNameIdentifier	 key Time Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keyTimeIndex	TokenNameIdentifier	 key Time Index
<	TokenNameLESS	
keyTimes2	TokenNameIdentifier	 key Times2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
unitTime	TokenNameIdentifier	 unit Time
>=	TokenNameGREATER_EQUAL	
keyTimes2	TokenNameIdentifier	 key Times2
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keyTimeIndex	TokenNameIdentifier	 key Time Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
value2	TokenNameIdentifier	 value2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
nextValue2	TokenNameIdentifier	 next Value2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
interpolation2	TokenNameIdentifier	 interpolation2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
unitTime	TokenNameIdentifier	 unit Time
-	TokenNameMINUS	
keyTimes2	TokenNameIdentifier	 key Times2
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
keyTimes2	TokenNameIdentifier	 key Times2
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
keyTimes2	TokenNameIdentifier	 key Times2
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keyTimeIndex	TokenNameIdentifier	 key Time Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keyTimeIndex	TokenNameIdentifier	 key Time Index
<	TokenNameLESS	
keyTimes	TokenNameIdentifier	 key Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
unitTime	TokenNameIdentifier	 unit Time
>=	TokenNameGREATER_EQUAL	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keyTimeIndex	TokenNameIdentifier	 key Time Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
value1	TokenNameIdentifier	 value1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
nextValue1	TokenNameIdentifier	 next Value1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
interpolation1	TokenNameIdentifier	 interpolation1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
unitTime	TokenNameIdentifier	 unit Time
-	TokenNameMINUS	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
keyTimes	TokenNameIdentifier	 key Times
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
value1	TokenNameIdentifier	 value1
=	TokenNameEQUAL	
value2	TokenNameIdentifier	 value2
=	TokenNameEQUAL	
value3	TokenNameIdentifier	 value3
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
nextValue1	TokenNameIdentifier	 next Value1
=	TokenNameEQUAL	
nextValue2	TokenNameIdentifier	 next Value2
=	TokenNameEQUAL	
nextValue3	TokenNameIdentifier	 next Value3
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
interpolation1	TokenNameIdentifier	 interpolation1
=	TokenNameEQUAL	
interpolation2	TokenNameIdentifier	 interpolation2
=	TokenNameEQUAL	
interpolation3	TokenNameIdentifier	 interpolation3
=	TokenNameEQUAL	
1f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cumulative	TokenNameIdentifier	 cumulative
)	TokenNameRPAREN	
{	TokenNameLBRACE	
accumulation	TokenNameIdentifier	 accumulation
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
accumulation	TokenNameIdentifier	 accumulation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
.	TokenNameDOT	
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
value1	TokenNameIdentifier	 value1
,	TokenNameCOMMA	
value2	TokenNameIdentifier	 value2
,	TokenNameCOMMA	
value3	TokenNameIdentifier	 value3
,	TokenNameCOMMA	
nextValue1	TokenNameIdentifier	 next Value1
,	TokenNameCOMMA	
nextValue2	TokenNameIdentifier	 next Value2
,	TokenNameCOMMA	
nextValue3	TokenNameIdentifier	 next Value3
,	TokenNameCOMMA	
interpolation1	TokenNameIdentifier	 interpolation1
,	TokenNameCOMMA	
interpolation2	TokenNameIdentifier	 interpolation2
,	TokenNameCOMMA	
interpolation3	TokenNameIdentifier	 interpolation3
,	TokenNameCOMMA	
accumulation	TokenNameIdentifier	 accumulation
,	TokenNameCOMMA	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
.	TokenNameDOT	
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AnimatableTransformListValue	TokenNameIdentifier	 Animatable Transform List Value
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
value1	TokenNameIdentifier	 value1
,	TokenNameCOMMA	
value2	TokenNameIdentifier	 value2
,	TokenNameCOMMA	
nextValue1	TokenNameIdentifier	 next Value1
,	TokenNameCOMMA	
nextValue2	TokenNameIdentifier	 next Value2
,	TokenNameCOMMA	
interpolation1	TokenNameIdentifier	 interpolation1
,	TokenNameCOMMA	
interpolation2	TokenNameIdentifier	 interpolation2
,	TokenNameCOMMA	
accumulation	TokenNameIdentifier	 accumulation
,	TokenNameCOMMA	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
markDirty	TokenNameIdentifier	 mark Dirty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
