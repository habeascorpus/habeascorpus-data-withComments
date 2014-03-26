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
/** * A point value in the animation system from a motion animation. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatableMotionPointValue.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A point value in the animation system from a motion animation. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatableMotionPointValue.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AnimatableMotionPointValue	TokenNameIdentifier	 Animatable Motion Point Value
extends	TokenNameextends	
AnimatableValue	TokenNameIdentifier	 Animatable Value
{	TokenNameLBRACE	
/** * The x coordinate. */	TokenNameCOMMENT_JAVADOC	 The x coordinate. 
protected	TokenNameprotected	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
/** * The y coordinate. */	TokenNameCOMMENT_JAVADOC	 The y coordinate. 
protected	TokenNameprotected	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
/** * The rotation angle in radians. */	TokenNameCOMMENT_JAVADOC	 The rotation angle in radians. 
protected	TokenNameprotected	
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
;	TokenNameSEMICOLON	
/** * Creates a new, uninitialized AnimatableMotionPointValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new, uninitialized AnimatableMotionPointValue. 
protected	TokenNameprotected	
AnimatableMotionPointValue	TokenNameIdentifier	 Animatable Motion Point Value
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
/** * Creates a new AnimatableMotionPointValue with one x. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableMotionPointValue with one x. 
public	TokenNamepublic	
AnimatableMotionPointValue	TokenNameIdentifier	 Animatable Motion Point Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
angle	TokenNameIdentifier	 angle
=	TokenNameEQUAL	
angle	TokenNameIdentifier	 angle
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
AnimatableMotionPointValue	TokenNameIdentifier	 Animatable Motion Point Value
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
AnimatableMotionPointValue	TokenNameIdentifier	 Animatable Motion Point Value
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
AnimatableMotionPointValue	TokenNameIdentifier	 Animatable Motion Point Value
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
newX	TokenNameIdentifier	 new X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
newY	TokenNameIdentifier	 new Y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
newAngle	TokenNameIdentifier	 new Angle
=	TokenNameEQUAL	
angle	TokenNameIdentifier	 angle
;	TokenNameSEMICOLON	
int	TokenNameint	
angleCount	TokenNameIdentifier	 angle Count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableMotionPointValue	TokenNameIdentifier	 Animatable Motion Point Value
toValue	TokenNameIdentifier	 to Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableMotionPointValue	TokenNameIdentifier	 Animatable Motion Point Value
)	TokenNameRPAREN	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
newX	TokenNameIdentifier	 new X
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newY	TokenNameIdentifier	 new Y
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newAngle	TokenNameIdentifier	 new Angle
+=	TokenNamePLUS_EQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
angle	TokenNameIdentifier	 angle
;	TokenNameSEMICOLON	
angleCount	TokenNameIdentifier	 angle Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
accumulation	TokenNameIdentifier	 accumulation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
multiplier	TokenNameIdentifier	 multiplier
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableMotionPointValue	TokenNameIdentifier	 Animatable Motion Point Value
accValue	TokenNameIdentifier	 acc Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableMotionPointValue	TokenNameIdentifier	 Animatable Motion Point Value
)	TokenNameRPAREN	
accumulation	TokenNameIdentifier	 accumulation
;	TokenNameSEMICOLON	
newX	TokenNameIdentifier	 new X
+=	TokenNamePLUS_EQUAL	
multiplier	TokenNameIdentifier	 multiplier
*	TokenNameMULTIPLY	
accValue	TokenNameIdentifier	 acc Value
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
newY	TokenNameIdentifier	 new Y
+=	TokenNamePLUS_EQUAL	
multiplier	TokenNameIdentifier	 multiplier
*	TokenNameMULTIPLY	
accValue	TokenNameIdentifier	 acc Value
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
newAngle	TokenNameIdentifier	 new Angle
+=	TokenNamePLUS_EQUAL	
accValue	TokenNameIdentifier	 acc Value
.	TokenNameDOT	
angle	TokenNameIdentifier	 angle
;	TokenNameSEMICOLON	
angleCount	TokenNameIdentifier	 angle Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
newAngle	TokenNameIdentifier	 new Angle
/=	TokenNameDIVIDE_EQUAL	
angleCount	TokenNameIdentifier	 angle Count
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
newX	TokenNameIdentifier	 new X
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
y	TokenNameIdentifier	 y
!=	TokenNameNOT_EQUAL	
newY	TokenNameIdentifier	 new Y
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
angle	TokenNameIdentifier	 angle
!=	TokenNameNOT_EQUAL	
newAngle	TokenNameIdentifier	 new Angle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
newX	TokenNameIdentifier	 new X
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
newY	TokenNameIdentifier	 new Y
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
angle	TokenNameIdentifier	 angle
=	TokenNameEQUAL	
newAngle	TokenNameIdentifier	 new Angle
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
/** * Returns the x coordinate. */	TokenNameCOMMENT_JAVADOC	 Returns the x coordinate. 
public	TokenNamepublic	
float	TokenNamefloat	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the y coordinate. */	TokenNameCOMMENT_JAVADOC	 Returns the y coordinate. 
public	TokenNamepublic	
float	TokenNamefloat	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the rotation angle. */	TokenNameCOMMENT_JAVADOC	 Returns the rotation angle. 
public	TokenNamepublic	
float	TokenNamefloat	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
angle	TokenNameIdentifier	 angle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether two values of this type can have their distance * computed, as needed by paced animation. */	TokenNameCOMMENT_JAVADOC	 Returns whether two values of this type can have their distance computed, as needed by paced animation. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canPace	TokenNameIdentifier	 can Pace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
AnimatableMotionPointValue	TokenNameIdentifier	 Animatable Motion Point Value
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableMotionPointValue	TokenNameIdentifier	 Animatable Motion Point Value
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
float	TokenNamefloat	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
float	TokenNamefloat	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
+	TokenNamePLUS	
dy	TokenNameIdentifier	 dy
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
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
AnimatableMotionPointValue	TokenNameIdentifier	 Animatable Motion Point Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toStringRep	TokenNameIdentifier	 to String Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatNumber	TokenNameIdentifier	 format Number
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatNumber	TokenNameIdentifier	 format Number
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatNumber	TokenNameIdentifier	 format Number
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"rad"	TokenNameStringLiteral	rad
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
