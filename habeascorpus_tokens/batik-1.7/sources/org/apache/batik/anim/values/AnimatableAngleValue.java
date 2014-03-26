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
values	TokenNameIdentifier	 values
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
AnimationTarget	TokenNameIdentifier	 Animation Target
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
SVGAngle	TokenNameIdentifier	 SVG Angle
;	TokenNameSEMICOLON	
/** * An SVG angle value in the animation system. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatableAngleValue.java 532986 2007-04-27 06:30:58Z cam $ */	TokenNameCOMMENT_JAVADOC	 An SVG angle value in the animation system. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatableAngleValue.java 532986 2007-04-27 06:30:58Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AnimatableAngleValue	TokenNameIdentifier	 Animatable Angle Value
extends	TokenNameextends	
AnimatableNumberValue	TokenNameIdentifier	 Animatable Number Value
{	TokenNameLBRACE	
/** * The unit string representations. */	TokenNameCOMMENT_JAVADOC	 The unit string representations. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
UNITS	TokenNameIdentifier	 UNITS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"deg"	TokenNameStringLiteral	deg
,	TokenNameCOMMA	
"rad"	TokenNameStringLiteral	rad
,	TokenNameCOMMA	
"grad"	TokenNameStringLiteral	grad
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The angle unit. */	TokenNameCOMMENT_JAVADOC	 The angle unit. 
protected	TokenNameprotected	
short	TokenNameshort	
unit	TokenNameIdentifier	 unit
;	TokenNameSEMICOLON	
/** * Creates a new, uninitialized AnimatableAngleValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new, uninitialized AnimatableAngleValue. 
public	TokenNamepublic	
AnimatableAngleValue	TokenNameIdentifier	 Animatable Angle Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatableAngleValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableAngleValue. 
public	TokenNamepublic	
AnimatableAngleValue	TokenNameIdentifier	 Animatable Angle Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
short	TokenNameshort	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
unit	TokenNameIdentifier	 unit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs interpolation to the given value. */	TokenNameCOMMENT_JAVADOC	 Performs interpolation to the given value. 
public	TokenNamepublic	
AnimatableValue	TokenNameIdentifier	 Animatable Value
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
AnimatableValue	TokenNameIdentifier	 Animatable Value
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
AnimatableValue	TokenNameIdentifier	 Animatable Value
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
float	TokenNamefloat	
interpolation	TokenNameIdentifier	 interpolation
,	TokenNameCOMMA	
AnimatableValue	TokenNameIdentifier	 Animatable Value
accumulation	TokenNameIdentifier	 accumulation
,	TokenNameCOMMA	
int	TokenNameint	
multiplier	TokenNameIdentifier	 multiplier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableAngleValue	TokenNameIdentifier	 Animatable Angle Value
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatableAngleValue	TokenNameIdentifier	 Animatable Angle Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableAngleValue	TokenNameIdentifier	 Animatable Angle Value
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
short	TokenNameshort	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
unit	TokenNameIdentifier	 unit
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableAngleValue	TokenNameIdentifier	 Animatable Angle Value
toAngle	TokenNameIdentifier	 to Angle
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableAngleValue	TokenNameIdentifier	 Animatable Angle Value
)	TokenNameRPAREN	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toAngle	TokenNameIdentifier	 to Angle
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
!=	TokenNameNOT_EQUAL	
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
rad	TokenNameIdentifier	 rad
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
rad	TokenNameIdentifier	 rad
(	TokenNameLPAREN	
toAngle	TokenNameIdentifier	 to Angle
.	TokenNameDOT	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
toAngle	TokenNameIdentifier	 to Angle
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
-	TokenNameMINUS	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
SVGAngle	TokenNameIdentifier	 SVG Angle
.	TokenNameDOT	
SVG_ANGLETYPE_RAD	TokenNameIdentifier	 SVG  ANGLETYPE  RAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
toAngle	TokenNameIdentifier	 to Angle
.	TokenNameDOT	
value	TokenNameIdentifier	 value
-	TokenNameMINUS	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
accumulation	TokenNameIdentifier	 accumulation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableAngleValue	TokenNameIdentifier	 Animatable Angle Value
accAngle	TokenNameIdentifier	 acc Angle
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableAngleValue	TokenNameIdentifier	 Animatable Angle Value
)	TokenNameRPAREN	
accumulation	TokenNameIdentifier	 accumulation
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
accAngle	TokenNameIdentifier	 acc Angle
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
!=	TokenNameNOT_EQUAL	
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
+=	TokenNamePLUS_EQUAL	
multiplier	TokenNameIdentifier	 multiplier
*	TokenNameMULTIPLY	
rad	TokenNameIdentifier	 rad
(	TokenNameLPAREN	
accAngle	TokenNameIdentifier	 acc Angle
.	TokenNameDOT	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
accAngle	TokenNameIdentifier	 acc Angle
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
SVGAngle	TokenNameIdentifier	 SVG Angle
.	TokenNameDOT	
SVG_ANGLETYPE_RAD	TokenNameIdentifier	 SVG  ANGLETYPE  RAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
+=	TokenNamePLUS_EQUAL	
multiplier	TokenNameIdentifier	 multiplier
*	TokenNameMULTIPLY	
accAngle	TokenNameIdentifier	 acc Angle
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
v	TokenNameIdentifier	 v
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
!=	TokenNameNOT_EQUAL	
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
hasChanged	TokenNameIdentifier	 has Changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the angle unit. */	TokenNameCOMMENT_JAVADOC	 Returns the angle unit. 
public	TokenNamepublic	
short	TokenNameshort	
getUnit	TokenNameIdentifier	 get Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
unit	TokenNameIdentifier	 unit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the absolute distance between this value and the specified other * value. */	TokenNameCOMMENT_JAVADOC	 Returns the absolute distance between this value and the specified other value. 
public	TokenNamepublic	
float	TokenNamefloat	
distanceTo	TokenNameIdentifier	 distance To
(	TokenNameLPAREN	
AnimatableValue	TokenNameIdentifier	 Animatable Value
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableAngleValue	TokenNameIdentifier	 Animatable Angle Value
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableAngleValue	TokenNameIdentifier	 Animatable Angle Value
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
rad	TokenNameIdentifier	 rad
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
-	TokenNameMINUS	
rad	TokenNameIdentifier	 rad
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a zero value of this AnimatableValue's type. */	TokenNameCOMMENT_JAVADOC	 Returns a zero value of this AnimatableValue's type. 
public	TokenNamepublic	
AnimatableValue	TokenNameIdentifier	 Animatable Value
getZeroValue	TokenNameIdentifier	 get Zero Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AnimatableAngleValue	TokenNameIdentifier	 Animatable Angle Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SVGAngle	TokenNameIdentifier	 SVG Angle
.	TokenNameDOT	
SVG_ANGLETYPE_UNSPECIFIED	TokenNameIdentifier	 SVG  ANGLETYPE  UNSPECIFIED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS text representation of the value. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS text representation of the value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
UNITS	TokenNameIdentifier	 UNITS
[	TokenNameLBRACKET	
unit	TokenNameIdentifier	 unit
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts an angle value to radians. */	TokenNameCOMMENT_JAVADOC	 Converts an angle value to radians. 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
rad	TokenNameIdentifier	 rad
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
short	TokenNameshort	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGAngle	TokenNameIdentifier	 SVG Angle
.	TokenNameDOT	
SVG_ANGLETYPE_RAD	TokenNameIdentifier	 SVG  ANGLETYPE  RAD
:	TokenNameCOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGAngle	TokenNameIdentifier	 SVG Angle
.	TokenNameDOT	
SVG_ANGLETYPE_GRAD	TokenNameIdentifier	 SVG  ANGLETYPE  GRAD
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
/	TokenNameDIVIDE	
200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
/	TokenNameDIVIDE	
180	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
