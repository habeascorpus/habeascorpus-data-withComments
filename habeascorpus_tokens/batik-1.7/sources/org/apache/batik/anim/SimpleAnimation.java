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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Point2D	TokenNameIdentifier	 Point2 D
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
/** * An animation class for 'animate' animations. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SimpleAnimation.java 492528 2007-01-04 11:45:47Z cam $ */	TokenNameCOMMENT_JAVADOC	 An animation class for 'animate' animations. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SimpleAnimation.java 492528 2007-01-04 11:45:47Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SimpleAnimation	TokenNameIdentifier	 Simple Animation
extends	TokenNameextends	
InterpolatingAnimation	TokenNameIdentifier	 Interpolating Animation
{	TokenNameLBRACE	
/** * Values between which to interpolate. */	TokenNameCOMMENT_JAVADOC	 Values between which to interpolate. 
protected	TokenNameprotected	
AnimatableValue	TokenNameIdentifier	 Animatable Value
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
/** * Starting value of the animation. */	TokenNameCOMMENT_JAVADOC	 Starting value of the animation. 
protected	TokenNameprotected	
AnimatableValue	TokenNameIdentifier	 Animatable Value
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
/** * Ending value of the animation. */	TokenNameCOMMENT_JAVADOC	 Ending value of the animation. 
protected	TokenNameprotected	
AnimatableValue	TokenNameIdentifier	 Animatable Value
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
/** * Relative offset value for the animation. */	TokenNameCOMMENT_JAVADOC	 Relative offset value for the animation. 
protected	TokenNameprotected	
AnimatableValue	TokenNameIdentifier	 Animatable Value
by	TokenNameIdentifier	 by
;	TokenNameSEMICOLON	
/** * Creates a new SimpleAnimation. */	TokenNameCOMMENT_JAVADOC	 Creates a new SimpleAnimation. 
public	TokenNamepublic	
SimpleAnimation	TokenNameIdentifier	 Simple Animation
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
timedElement	TokenNameIdentifier	 timed Element
,	TokenNameCOMMA	
animatableElement	TokenNameIdentifier	 animatable Element
,	TokenNameCOMMA	
calcMode	TokenNameIdentifier	 calc Mode
,	TokenNameCOMMA	
keyTimes	TokenNameIdentifier	 key Times
,	TokenNameCOMMA	
keySplines	TokenNameIdentifier	 key Splines
,	TokenNameCOMMA	
additive	TokenNameIdentifier	 additive
,	TokenNameCOMMA	
cumulative	TokenNameIdentifier	 cumulative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
by	TokenNameIdentifier	 by
=	TokenNameEQUAL	
by	TokenNameIdentifier	 by
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatableValue	TokenNameIdentifier	 Animatable Value
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
by	TokenNameIdentifier	 by
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
.	TokenNameDOT	
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
by	TokenNameIdentifier	 by
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
timedElement	TokenNameIdentifier	 timed Element
.	TokenNameDOT	
createException	TokenNameIdentifier	 create Exception
(	TokenNameLPAREN	
"values.to.by.missing"	TokenNameStringLiteral	values.to.by.missing
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatableValue	TokenNameIdentifier	 Animatable Value
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
animatableElement	TokenNameIdentifier	 animatable Element
.	TokenNameDOT	
getUnderlyingValue	TokenNameIdentifier	 get Underlying Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cumulative	TokenNameIdentifier	 cumulative
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
toAnimation	TokenNameIdentifier	 to Animation
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
by	TokenNameIdentifier	 by
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
additive	TokenNameIdentifier	 additive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatableValue	TokenNameIdentifier	 Animatable Value
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
by	TokenNameIdentifier	 by
.	TokenNameDOT	
getZeroValue	TokenNameIdentifier	 get Zero Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
by	TokenNameIdentifier	 by
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
timedElement	TokenNameIdentifier	 timed Element
.	TokenNameDOT	
createException	TokenNameIdentifier	 create Exception
(	TokenNameLPAREN	
"values.to.by.missing"	TokenNameStringLiteral	values.to.by.missing
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
keyTimes	TokenNameIdentifier	 key Times
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
calcMode	TokenNameIdentifier	 calc Mode
!=	TokenNameNOT_EQUAL	
CALC_MODE_PACED	TokenNameIdentifier	 CALC  MODE  PACED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
keyTimes	TokenNameIdentifier	 key Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
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
&&	TokenNameAND_AND	
!	TokenNameNOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
canPace	TokenNameIdentifier	 can Pace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
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
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
calcMode	TokenNameIdentifier	 calc Mode
==	TokenNameEQUAL_EQUAL	
CALC_MODE_DISCRETE	TokenNameIdentifier	 CALC  MODE  DISCRETE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
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
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// CALC_MODE_PACED 	TokenNameCOMMENT_LINE	CALC_MODE_PACED 
// This corrects the keyTimes to be paced, so from now on 	TokenNameCOMMENT_LINE	This corrects the keyTimes to be paced, so from now on 
// it can be considered the same as CALC_MODE_LINEAR. 	TokenNameCOMMENT_LINE	it can be considered the same as CALC_MODE_LINEAR. 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cumulativeDistances	TokenNameIdentifier	 cumulative Distances
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cumulativeDistances	TokenNameIdentifier	 cumulative Distances
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cumulativeDistances	TokenNameIdentifier	 cumulative Distances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cumulativeDistances	TokenNameIdentifier	 cumulative Distances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
distanceTo	TokenNameIdentifier	 distance To
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
totalLength	TokenNameIdentifier	 total Length
=	TokenNameEQUAL	
cumulativeDistances	TokenNameIdentifier	 cumulative Distances
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
0	TokenNameIntegerLiteral	
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
cumulativeDistances	TokenNameIdentifier	 cumulative Distances
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
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
calcMode	TokenNameIdentifier	 calc Mode
==	TokenNameEQUAL_EQUAL	
CALC_MODE_SPLINE	TokenNameIdentifier	 CALC  MODE  SPLINE
&&	TokenNameAND_AND	
keySplines	TokenNameIdentifier	 key Splines
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
keyTimes	TokenNameIdentifier	 key Times
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
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
AnimatableValue	TokenNameIdentifier	 Animatable Value
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
accumulation	TokenNameIdentifier	 accumulation
,	TokenNameCOMMA	
nextValue	TokenNameIdentifier	 next Value
;	TokenNameSEMICOLON	
float	TokenNamefloat	
interpolation	TokenNameIdentifier	 interpolation
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
unitTime	TokenNameIdentifier	 unit Time
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
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
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
calcMode	TokenNameIdentifier	 calc Mode
==	TokenNameEQUAL_EQUAL	
CALC_MODE_LINEAR	TokenNameIdentifier	 CALC  MODE  LINEAR
||	TokenNameOR_OR	
calcMode	TokenNameIdentifier	 calc Mode
==	TokenNameEQUAL_EQUAL	
CALC_MODE_PACED	TokenNameIdentifier	 CALC  MODE  PACED
||	TokenNameOR_OR	
calcMode	TokenNameIdentifier	 calc Mode
==	TokenNameEQUAL_EQUAL	
CALC_MODE_SPLINE	TokenNameIdentifier	 CALC  MODE  SPLINE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextValue	TokenNameIdentifier	 next Value
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
interpolation	TokenNameIdentifier	 interpolation
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
if	TokenNameif	
(	TokenNameLPAREN	
calcMode	TokenNameIdentifier	 calc Mode
==	TokenNameEQUAL_EQUAL	
CALC_MODE_SPLINE	TokenNameIdentifier	 CALC  MODE  SPLINE
&&	TokenNameAND_AND	
unitTime	TokenNameIdentifier	 unit Time
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XXX This could be done better, e.g. with 	TokenNameCOMMENT_LINE	XXX This could be done better, e.g. with 
// Newton-Raphson. 	TokenNameCOMMENT_LINE	Newton-Raphson. 
Cubic	TokenNameIdentifier	 Cubic
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
keySplineCubics	TokenNameIdentifier	 key Spline Cubics
[	TokenNameLBRACKET	
keyTimeIndex	TokenNameIdentifier	 key Time Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
tolerance	TokenNameIdentifier	 tolerance
=	TokenNameEQUAL	
0.001f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
+	TokenNamePLUS	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
interpolation	TokenNameIdentifier	 interpolation
)	TokenNameRPAREN	
<	TokenNameLESS	
tolerance	TokenNameIdentifier	 tolerance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
interpolation	TokenNameIdentifier	 interpolation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
interpolation	TokenNameIdentifier	 interpolation
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nextValue	TokenNameIdentifier	 next Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
nextValue	TokenNameIdentifier	 next Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cumulative	TokenNameIdentifier	 cumulative
)	TokenNameRPAREN	
{	TokenNameLBRACE	
accumulation	TokenNameIdentifier	 accumulation
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
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
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
nextValue	TokenNameIdentifier	 next Value
,	TokenNameCOMMA	
interpolation	TokenNameIdentifier	 interpolation
,	TokenNameCOMMA	
accumulation	TokenNameIdentifier	 accumulation
,	TokenNameCOMMA	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
