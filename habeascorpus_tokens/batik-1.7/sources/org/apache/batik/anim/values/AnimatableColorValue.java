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
/** * An SVG color value in the animation system. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatableColorValue.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An SVG color value in the animation system. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatableColorValue.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
extends	TokenNameextends	
AnimatableValue	TokenNameIdentifier	 Animatable Value
{	TokenNameLBRACE	
/** * The red component. */	TokenNameCOMMENT_JAVADOC	 The red component. 
protected	TokenNameprotected	
float	TokenNamefloat	
red	TokenNameIdentifier	 red
;	TokenNameSEMICOLON	
/** * The green component. */	TokenNameCOMMENT_JAVADOC	 The green component. 
protected	TokenNameprotected	
float	TokenNamefloat	
green	TokenNameIdentifier	 green
;	TokenNameSEMICOLON	
/** * The blue component. */	TokenNameCOMMENT_JAVADOC	 The blue component. 
protected	TokenNameprotected	
float	TokenNamefloat	
blue	TokenNameIdentifier	 blue
;	TokenNameSEMICOLON	
/** * Creates a new AnimatableColorValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableColorValue. 
protected	TokenNameprotected	
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
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
/** * Creates a new AnimatableColorValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatableColorValue. 
public	TokenNamepublic	
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
float	TokenNamefloat	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
float	TokenNamefloat	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
float	TokenNamefloat	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
red	TokenNameIdentifier	 red
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
green	TokenNameIdentifier	 green
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
blue	TokenNameIdentifier	 blue
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
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
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
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
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
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
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
oldRed	TokenNameIdentifier	 old Red
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
red	TokenNameIdentifier	 red
;	TokenNameSEMICOLON	
float	TokenNamefloat	
oldGreen	TokenNameIdentifier	 old Green
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
green	TokenNameIdentifier	 green
;	TokenNameSEMICOLON	
float	TokenNamefloat	
oldBlue	TokenNameIdentifier	 old Blue
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
red	TokenNameIdentifier	 red
=	TokenNameEQUAL	
red	TokenNameIdentifier	 red
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
green	TokenNameIdentifier	 green
=	TokenNameEQUAL	
green	TokenNameIdentifier	 green
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
=	TokenNameEQUAL	
blue	TokenNameIdentifier	 blue
;	TokenNameSEMICOLON	
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
toColor	TokenNameIdentifier	 to Color
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
)	TokenNameRPAREN	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
accColor	TokenNameIdentifier	 acc Color
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
)	TokenNameRPAREN	
accumulation	TokenNameIdentifier	 accumulation
;	TokenNameSEMICOLON	
// XXX Should handle non-sRGB colours and non-sRGB interpolation. 	TokenNameCOMMENT_LINE	XXX Should handle non-sRGB colours and non-sRGB interpolation. 
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
red	TokenNameIdentifier	 red
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
toColor	TokenNameIdentifier	 to Color
.	TokenNameDOT	
red	TokenNameIdentifier	 red
-	TokenNameMINUS	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
red	TokenNameIdentifier	 red
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
green	TokenNameIdentifier	 green
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
toColor	TokenNameIdentifier	 to Color
.	TokenNameDOT	
green	TokenNameIdentifier	 green
-	TokenNameMINUS	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
green	TokenNameIdentifier	 green
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
+=	TokenNamePLUS_EQUAL	
interpolation	TokenNameIdentifier	 interpolation
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
toColor	TokenNameIdentifier	 to Color
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
-	TokenNameMINUS	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
accumulation	TokenNameIdentifier	 accumulation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
red	TokenNameIdentifier	 red
+=	TokenNamePLUS_EQUAL	
multiplier	TokenNameIdentifier	 multiplier
*	TokenNameMULTIPLY	
accColor	TokenNameIdentifier	 acc Color
.	TokenNameDOT	
red	TokenNameIdentifier	 red
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
green	TokenNameIdentifier	 green
+=	TokenNamePLUS_EQUAL	
multiplier	TokenNameIdentifier	 multiplier
*	TokenNameMULTIPLY	
accColor	TokenNameIdentifier	 acc Color
.	TokenNameDOT	
green	TokenNameIdentifier	 green
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
+=	TokenNamePLUS_EQUAL	
multiplier	TokenNameIdentifier	 multiplier
*	TokenNameMULTIPLY	
accColor	TokenNameIdentifier	 acc Color
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
red	TokenNameIdentifier	 red
!=	TokenNameNOT_EQUAL	
oldRed	TokenNameIdentifier	 old Red
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
green	TokenNameIdentifier	 green
!=	TokenNameNOT_EQUAL	
oldGreen	TokenNameIdentifier	 old Green
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
!=	TokenNameNOT_EQUAL	
oldBlue	TokenNameIdentifier	 old Blue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
float	TokenNamefloat	
dr	TokenNameIdentifier	 dr
=	TokenNameEQUAL	
red	TokenNameIdentifier	 red
-	TokenNameMINUS	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
red	TokenNameIdentifier	 red
;	TokenNameSEMICOLON	
float	TokenNamefloat	
dg	TokenNameIdentifier	 dg
=	TokenNameEQUAL	
green	TokenNameIdentifier	 green
-	TokenNameMINUS	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
green	TokenNameIdentifier	 green
;	TokenNameSEMICOLON	
float	TokenNamefloat	
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
blue	TokenNameIdentifier	 blue
-	TokenNameMINUS	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
*	TokenNameMULTIPLY	
dr	TokenNameIdentifier	 dr
+	TokenNamePLUS	
dg	TokenNameIdentifier	 dg
*	TokenNameMULTIPLY	
dg	TokenNameIdentifier	 dg
+	TokenNamePLUS	
db	TokenNameIdentifier	 db
*	TokenNameMULTIPLY	
db	TokenNameIdentifier	 db
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
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
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
/** * Returns the CSS text representation of the value. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS text representation of the value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
red	TokenNameIdentifier	 red
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
','	TokenNameCharacterLiteral	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
green	TokenNameIdentifier	 green
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
','	TokenNameCharacterLiteral	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
blue	TokenNameIdentifier	 blue
*	TokenNameMULTIPLY	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
