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
/** * An SVG paint value in the animation system. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatablePaintValue.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An SVG paint value in the animation system. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatablePaintValue.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
extends	TokenNameextends	
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
{	TokenNameLBRACE	
// Constants for paintType. 	TokenNameCOMMENT_LINE	Constants for paintType. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PAINT_NONE	TokenNameIdentifier	 PAINT  NONE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PAINT_CURRENT_COLOR	TokenNameIdentifier	 PAINT  CURRENT  COLOR
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PAINT_COLOR	TokenNameIdentifier	 PAINT  COLOR
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PAINT_URI	TokenNameIdentifier	 PAINT  URI
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PAINT_URI_NONE	TokenNameIdentifier	 PAINT  URI  NONE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PAINT_URI_CURRENT_COLOR	TokenNameIdentifier	 PAINT  URI  CURRENT  COLOR
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PAINT_URI_COLOR	TokenNameIdentifier	 PAINT  URI  COLOR
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PAINT_INHERIT	TokenNameIdentifier	 PAINT  INHERIT
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The type of paint. */	TokenNameCOMMENT_JAVADOC	 The type of paint. 
protected	TokenNameprotected	
int	TokenNameint	
paintType	TokenNameIdentifier	 paint Type
;	TokenNameSEMICOLON	
/** * The URI of the referenced paint server. */	TokenNameCOMMENT_JAVADOC	 The URI of the referenced paint server. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
/** * Creates a new, uninitialized AnimatablePaintValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new, uninitialized AnimatablePaintValue. 
protected	TokenNameprotected	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
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
/** * Creates a new AnimatablePaintValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatablePaintValue. 
protected	TokenNameprotected	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
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
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatablePaintValue for a 'none' value. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatablePaintValue for a 'none' value. 
public	TokenNamepublic	
static	TokenNamestatic	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
createNonePaintValue	TokenNameIdentifier	 create None Paint Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
=	TokenNameEQUAL	
PAINT_NONE	TokenNameIdentifier	 PAINT  NONE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatablePaintValue for a 'currentColor' value. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatablePaintValue for a 'currentColor' value. 
public	TokenNamepublic	
static	TokenNamestatic	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
createCurrentColorPaintValue	TokenNameIdentifier	 create Current Color Paint Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
=	TokenNameEQUAL	
PAINT_CURRENT_COLOR	TokenNameIdentifier	 PAINT  CURRENT  COLOR
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatablePaintValue for a color value. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatablePaintValue for a color value. 
public	TokenNamepublic	
static	TokenNamestatic	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
createColorPaintValue	TokenNameIdentifier	 create Color Paint Value
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
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
=	TokenNameEQUAL	
PAINT_COLOR	TokenNameIdentifier	 PAINT  COLOR
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatablePaintValue for a URI reference. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatablePaintValue for a URI reference. 
public	TokenNamepublic	
static	TokenNamestatic	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
createURIPaintValue	TokenNameIdentifier	 create URI Paint Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
=	TokenNameEQUAL	
PAINT_URI	TokenNameIdentifier	 PAINT  URI
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatablePaintValue for a URI reference with a * 'none' fallback. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatablePaintValue for a URI reference with a 'none' fallback. 
public	TokenNamepublic	
static	TokenNamestatic	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
createURINonePaintValue	TokenNameIdentifier	 create URI None Paint Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
=	TokenNameEQUAL	
PAINT_URI_NONE	TokenNameIdentifier	 PAINT  URI  NONE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatablePaintValue for a URI reference with a * 'currentColor' fallback. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatablePaintValue for a URI reference with a 'currentColor' fallback. 
public	TokenNamepublic	
static	TokenNamestatic	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
createURICurrentColorPaintValue	TokenNameIdentifier	 create URI Current Color Paint Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
=	TokenNameEQUAL	
PAINT_URI_CURRENT_COLOR	TokenNameIdentifier	 PAINT  URI  CURRENT  COLOR
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatablePaintValue for a URI reference with a * color fallback. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatablePaintValue for a URI reference with a color fallback. 
public	TokenNamepublic	
static	TokenNamestatic	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
createURIColorPaintValue	TokenNameIdentifier	 create URI Color Paint Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
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
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
=	TokenNameEQUAL	
PAINT_URI_COLOR	TokenNameIdentifier	 PAINT  URI  COLOR
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AnimatablePaintValue for a 'inherit' value. */	TokenNameCOMMENT_JAVADOC	 Creates a new AnimatablePaintValue for a 'inherit' value. 
public	TokenNamepublic	
static	TokenNamestatic	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
createInheritPaintValue	TokenNameIdentifier	 create Inherit Paint Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
=	TokenNameEQUAL	
PAINT_INHERIT	TokenNameIdentifier	 PAINT  INHERIT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
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
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
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
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
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
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
paintType	TokenNameIdentifier	 paint Type
==	TokenNameEQUAL_EQUAL	
PAINT_COLOR	TokenNameIdentifier	 PAINT  COLOR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
canInterpolate	TokenNameIdentifier	 can Interpolate
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
toPaint	TokenNameIdentifier	 to Paint
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
)	TokenNameRPAREN	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
canInterpolate	TokenNameIdentifier	 can Interpolate
=	TokenNameEQUAL	
toPaint	TokenNameIdentifier	 to Paint
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
==	TokenNameEQUAL_EQUAL	
PAINT_COLOR	TokenNameIdentifier	 PAINT  COLOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
accumulation	TokenNameIdentifier	 accumulation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
accPaint	TokenNameIdentifier	 acc Paint
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
)	TokenNameRPAREN	
accumulation	TokenNameIdentifier	 accumulation
;	TokenNameSEMICOLON	
canInterpolate	TokenNameIdentifier	 can Interpolate
=	TokenNameEQUAL	
canInterpolate	TokenNameIdentifier	 can Interpolate
&&	TokenNameAND_AND	
accPaint	TokenNameIdentifier	 acc Paint
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
==	TokenNameEQUAL_EQUAL	
PAINT_COLOR	TokenNameIdentifier	 PAINT  COLOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
canInterpolate	TokenNameIdentifier	 can Interpolate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
=	TokenNameEQUAL	
PAINT_COLOR	TokenNameIdentifier	 PAINT  COLOR
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
interpolation	TokenNameIdentifier	 interpolation
,	TokenNameCOMMA	
accumulation	TokenNameIdentifier	 accumulation
,	TokenNameCOMMA	
multiplier	TokenNameIdentifier	 multiplier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
newPaintType	TokenNameIdentifier	 new Paint Type
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newURI	TokenNameIdentifier	 new URI
;	TokenNameSEMICOLON	
float	TokenNamefloat	
newRed	TokenNameIdentifier	 new Red
,	TokenNameCOMMA	
newGreen	TokenNameIdentifier	 new Green
,	TokenNameCOMMA	
newBlue	TokenNameIdentifier	 new Blue
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
interpolation	TokenNameIdentifier	 interpolation
>=	TokenNameGREATER_EQUAL	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
toValue	TokenNameIdentifier	 to Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
)	TokenNameRPAREN	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
newPaintType	TokenNameIdentifier	 new Paint Type
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
;	TokenNameSEMICOLON	
newURI	TokenNameIdentifier	 new URI
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
newRed	TokenNameIdentifier	 new Red
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
red	TokenNameIdentifier	 red
;	TokenNameSEMICOLON	
newGreen	TokenNameIdentifier	 new Green
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
green	TokenNameIdentifier	 green
;	TokenNameSEMICOLON	
newBlue	TokenNameIdentifier	 new Blue
=	TokenNameEQUAL	
toValue	TokenNameIdentifier	 to Value
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newPaintType	TokenNameIdentifier	 new Paint Type
=	TokenNameEQUAL	
paintType	TokenNameIdentifier	 paint Type
;	TokenNameSEMICOLON	
newURI	TokenNameIdentifier	 new URI
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
newRed	TokenNameIdentifier	 new Red
=	TokenNameEQUAL	
red	TokenNameIdentifier	 red
;	TokenNameSEMICOLON	
newGreen	TokenNameIdentifier	 new Green
=	TokenNameEQUAL	
green	TokenNameIdentifier	 green
;	TokenNameSEMICOLON	
newBlue	TokenNameIdentifier	 new Blue
=	TokenNameEQUAL	
blue	TokenNameIdentifier	 blue
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
!=	TokenNameNOT_EQUAL	
newPaintType	TokenNameIdentifier	 new Paint Type
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
newURI	TokenNameIdentifier	 new URI
)	TokenNameRPAREN	
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
red	TokenNameIdentifier	 red
!=	TokenNameNOT_EQUAL	
newRed	TokenNameIdentifier	 new Red
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
green	TokenNameIdentifier	 green
!=	TokenNameNOT_EQUAL	
newGreen	TokenNameIdentifier	 new Green
||	TokenNameOR_OR	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
!=	TokenNameNOT_EQUAL	
newBlue	TokenNameIdentifier	 new Blue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
paintType	TokenNameIdentifier	 paint Type
=	TokenNameEQUAL	
newPaintType	TokenNameIdentifier	 new Paint Type
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
newURI	TokenNameIdentifier	 new URI
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
red	TokenNameIdentifier	 red
=	TokenNameEQUAL	
newRed	TokenNameIdentifier	 new Red
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
green	TokenNameIdentifier	 green
=	TokenNameEQUAL	
newGreen	TokenNameIdentifier	 new Green
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
=	TokenNameEQUAL	
newBlue	TokenNameIdentifier	 new Blue
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
/** * Returns the type of paint this value represents. */	TokenNameCOMMENT_JAVADOC	 Returns the type of paint this value represents. 
public	TokenNamepublic	
int	TokenNameint	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
paintType	TokenNameIdentifier	 paint Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the paint server URI. */	TokenNameCOMMENT_JAVADOC	 Returns the paint server URI. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
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
false	TokenNamefalse	
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
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
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
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
.	TokenNameDOT	
createColorPaintValue	TokenNameIdentifier	 create Color Paint Value
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
switch	TokenNameswitch	
(	TokenNameLPAREN	
paintType	TokenNameIdentifier	 paint Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PAINT_NONE	TokenNameIdentifier	 PAINT  NONE
:	TokenNameCOLON	
return	TokenNamereturn	
"none"	TokenNameStringLiteral	none
;	TokenNameSEMICOLON	
case	TokenNamecase	
PAINT_CURRENT_COLOR	TokenNameIdentifier	 PAINT  CURRENT  COLOR
:	TokenNameCOLON	
return	TokenNamereturn	
"currentColor"	TokenNameStringLiteral	currentColor
;	TokenNameSEMICOLON	
case	TokenNamecase	
PAINT_COLOR	TokenNameIdentifier	 PAINT  COLOR
:	TokenNameCOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PAINT_URI	TokenNameIdentifier	 PAINT  URI
:	TokenNameCOLON	
return	TokenNamereturn	
"url("	TokenNameStringLiteral	url(
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
case	TokenNamecase	
PAINT_URI_NONE	TokenNameIdentifier	 PAINT  URI  NONE
:	TokenNameCOLON	
return	TokenNamereturn	
"url("	TokenNameStringLiteral	url(
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
") none"	TokenNameStringLiteral	) none
;	TokenNameSEMICOLON	
case	TokenNamecase	
PAINT_URI_CURRENT_COLOR	TokenNameIdentifier	 PAINT  URI  CURRENT  COLOR
:	TokenNameCOLON	
return	TokenNamereturn	
"url("	TokenNameStringLiteral	url(
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
") currentColor"	TokenNameStringLiteral	) currentColor
;	TokenNameSEMICOLON	
case	TokenNamecase	
PAINT_URI_COLOR	TokenNameIdentifier	 PAINT  URI  COLOR
:	TokenNameCOLON	
return	TokenNamereturn	
"url("	TokenNameStringLiteral	url(
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
super	TokenNamesuper	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// PAINT_INHERIT 	TokenNameCOMMENT_LINE	PAINT_INHERIT 
return	TokenNamereturn	
"inherit"	TokenNameStringLiteral	inherit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
