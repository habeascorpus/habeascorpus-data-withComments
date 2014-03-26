/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Rectangle	TokenNameIdentifier	 Rectangle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
AffineTransform	TokenNameIdentifier	 Affine Transform
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
NoninvertibleTransformException	TokenNameIdentifier	 Noninvertible Transform Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
ColorModel	TokenNameIdentifier	 Color Model
;	TokenNameSEMICOLON	
/** * Provides the actual implementation for the RadialGradientPaint. * This is where the pixel processing is done. A RadialGradienPaint * only supports circular gradients, but it should be possible to scale * the circle to look approximately elliptical, by means of a * gradient transform passed into the RadialGradientPaint constructor. * * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: RadialGradientPaintContext.java 516969 2007-03-11 17:39:37Z dvholten $ * */	TokenNameCOMMENT_JAVADOC	 Provides the actual implementation for the RadialGradientPaint. This is where the pixel processing is done. A RadialGradienPaint only supports circular gradients, but it should be possible to scale the circle to look approximately elliptical, by means of a gradient transform passed into the RadialGradientPaint constructor. * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: RadialGradientPaintContext.java 516969 2007-03-11 17:39:37Z dvholten $ 
final	TokenNamefinal	
class	TokenNameclass	
RadialGradientPaintContext	TokenNameIdentifier	 Radial Gradient Paint Context
extends	TokenNameextends	
MultipleGradientPaintContext	TokenNameIdentifier	 Multiple Gradient Paint Context
{	TokenNameLBRACE	
/** True when (focus == center) */	TokenNameCOMMENT_JAVADOC	 True when (focus == center) 
private	TokenNameprivate	
boolean	TokenNameboolean	
isSimpleFocus	TokenNameIdentifier	 is Simple Focus
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** True when (cycleMethod == NO_CYCLE) */	TokenNameCOMMENT_JAVADOC	 True when (cycleMethod == NO_CYCLE) 
private	TokenNameprivate	
boolean	TokenNameboolean	
isNonCyclic	TokenNameIdentifier	 is Non Cyclic
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Radius of the outermost circle defining the 100% gradient stop. */	TokenNameCOMMENT_JAVADOC	 Radius of the outermost circle defining the 100% gradient stop. 
private	TokenNameprivate	
float	TokenNamefloat	
radius	TokenNameIdentifier	 radius
;	TokenNameSEMICOLON	
/** Variables representing center and focus points. */	TokenNameCOMMENT_JAVADOC	 Variables representing center and focus points. 
private	TokenNameprivate	
float	TokenNamefloat	
centerX	TokenNameIdentifier	 center X
,	TokenNameCOMMA	
centerY	TokenNameIdentifier	 center Y
,	TokenNameCOMMA	
focusX	TokenNameIdentifier	 focus X
,	TokenNameCOMMA	
focusY	TokenNameIdentifier	 focus Y
;	TokenNameSEMICOLON	
/** Radius of the gradient circle squared. */	TokenNameCOMMENT_JAVADOC	 Radius of the gradient circle squared. 
private	TokenNameprivate	
float	TokenNamefloat	
radiusSq	TokenNameIdentifier	 radius Sq
;	TokenNameSEMICOLON	
/** Constant part of X, Y user space coordinates. */	TokenNameCOMMENT_JAVADOC	 Constant part of X, Y user space coordinates. 
private	TokenNameprivate	
float	TokenNamefloat	
constA	TokenNameIdentifier	 const A
,	TokenNameCOMMA	
constB	TokenNameIdentifier	 const B
;	TokenNameSEMICOLON	
/** This value represents the solution when focusX == X. It is called * trivial because it is easier to calculate than the general case. */	TokenNameCOMMENT_JAVADOC	 This value represents the solution when focusX == X. It is called trivial because it is easier to calculate than the general case. 
private	TokenNameprivate	
float	TokenNamefloat	
trivial	TokenNameIdentifier	 trivial
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FIXED_POINT_IMPL	TokenNameIdentifier	 FIXED  POINT  IMPL
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_IMPL	TokenNameIdentifier	 DEFAULT  IMPL
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ANTI_ALIAS_IMPL	TokenNameIdentifier	 ANTI  ALIAS  IMPL
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fillMethod	TokenNameIdentifier	 fill Method
;	TokenNameSEMICOLON	
/** Amount for offset when clamping focus. */	TokenNameCOMMENT_JAVADOC	 Amount for offset when clamping focus. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
SCALEBACK	TokenNameIdentifier	 SCALEBACK
=	TokenNameEQUAL	
0.999f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
/** * Constructor for RadialGradientPaintContext. * * @param cm {@link ColorModel} that receives * the <code>Paint</code> data. This is used only as a hint. * * @param deviceBounds the device space bounding box of the * graphics primitive being rendered * * @param userBounds the user space bounding box of the * graphics primitive being rendered * * @param t the {@link AffineTransform} from user * space into device space (gradientTransform should be * concatenated with this) * * @param hints the hints that the context object uses to choose * between rendering alternatives * * @param cx the center point in user space of the circle defining * the gradient. The last color of the gradient is mapped to the * perimeter of this circle X coordinate * * @param cy the center point in user space of the circle defining * the gradient. The last color of the gradient is mapped to the * perimeter of this circle Y coordinate * * @param r the radius of the circle defining the extents of the * color gradient * * @param fx the point in user space to which the first color is mapped * X coordinate * * @param fy the point in user space to which the first color is mapped * Y coordinate * * @param fractions the fractions specifying the gradient distribution * * @param colors the gradient colors * * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * * @param colorSpace which colorspace to use for interpolation, * either SRGB or LINEAR_RGB * */	TokenNameCOMMENT_JAVADOC	 Constructor for RadialGradientPaintContext. * @param cm {@link ColorModel} that receives the <code>Paint</code> data. This is used only as a hint. * @param deviceBounds the device space bounding box of the graphics primitive being rendered * @param userBounds the user space bounding box of the graphics primitive being rendered * @param t the {@link AffineTransform} from user space into device space (gradientTransform should be concatenated with this) * @param hints the hints that the context object uses to choose between rendering alternatives * @param cx the center point in user space of the circle defining the gradient. The last color of the gradient is mapped to the perimeter of this circle X coordinate * @param cy the center point in user space of the circle defining the gradient. The last color of the gradient is mapped to the perimeter of this circle Y coordinate * @param r the radius of the circle defining the extents of the color gradient * @param fx the point in user space to which the first color is mapped X coordinate * @param fy the point in user space to which the first color is mapped Y coordinate * @param fractions the fractions specifying the gradient distribution * @param colors the gradient colors * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * @param colorSpace which colorspace to use for interpolation, either SRGB or LINEAR_RGB 
public	TokenNamepublic	
RadialGradientPaintContext	TokenNameIdentifier	 Radial Gradient Paint Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
deviceBounds	TokenNameIdentifier	 device Bounds
,	TokenNameCOMMA	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
userBounds	TokenNameIdentifier	 user Bounds
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
,	TokenNameCOMMA	
float	TokenNamefloat	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
float	TokenNamefloat	
cy	TokenNameIdentifier	 cy
,	TokenNameCOMMA	
float	TokenNamefloat	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
float	TokenNamefloat	
fx	TokenNameIdentifier	 fx
,	TokenNameCOMMA	
float	TokenNamefloat	
fy	TokenNameIdentifier	 fy
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
cycleMethod	TokenNameIdentifier	 cycle Method
,	TokenNameCOMMA	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
ColorSpaceEnum	TokenNameIdentifier	 Color Space Enum
colorSpace	TokenNameIdentifier	 color Space
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoninvertibleTransformException	TokenNameIdentifier	 Noninvertible Transform Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
deviceBounds	TokenNameIdentifier	 device Bounds
,	TokenNameCOMMA	
userBounds	TokenNameIdentifier	 user Bounds
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
hints	TokenNameIdentifier	 hints
,	TokenNameCOMMA	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
cycleMethod	TokenNameIdentifier	 cycle Method
,	TokenNameCOMMA	
colorSpace	TokenNameIdentifier	 color Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//copy some parameters. 	TokenNameCOMMENT_LINE	copy some parameters. 
centerX	TokenNameIdentifier	 center X
=	TokenNameEQUAL	
cx	TokenNameIdentifier	 cx
;	TokenNameSEMICOLON	
centerY	TokenNameIdentifier	 center Y
=	TokenNameEQUAL	
cy	TokenNameIdentifier	 cy
;	TokenNameSEMICOLON	
focusX	TokenNameIdentifier	 focus X
=	TokenNameEQUAL	
fx	TokenNameIdentifier	 fx
;	TokenNameSEMICOLON	
focusY	TokenNameIdentifier	 focus Y
=	TokenNameEQUAL	
fy	TokenNameIdentifier	 fy
;	TokenNameSEMICOLON	
radius	TokenNameIdentifier	 radius
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isSimpleFocus	TokenNameIdentifier	 is Simple Focus
=	TokenNameEQUAL	
(	TokenNameLPAREN	
focusX	TokenNameIdentifier	 focus X
==	TokenNameEQUAL_EQUAL	
centerX	TokenNameIdentifier	 center X
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
focusY	TokenNameIdentifier	 focus Y
==	TokenNameEQUAL_EQUAL	
centerY	TokenNameIdentifier	 center Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isNonCyclic	TokenNameIdentifier	 is Non Cyclic
=	TokenNameEQUAL	
(	TokenNameLPAREN	
cycleMethod	TokenNameIdentifier	 cycle Method
==	TokenNameEQUAL_EQUAL	
RadialGradientPaint	TokenNameIdentifier	 Radial Gradient Paint
.	TokenNameDOT	
NO_CYCLE	TokenNameIdentifier	 NO  CYCLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//for use in the quadractic equation 	TokenNameCOMMENT_LINE	for use in the quadractic equation 
radiusSq	TokenNameIdentifier	 radius Sq
=	TokenNameEQUAL	
radius	TokenNameIdentifier	 radius
*	TokenNameMULTIPLY	
radius	TokenNameIdentifier	 radius
;	TokenNameSEMICOLON	
float	TokenNamefloat	
dX	TokenNameIdentifier	 d X
=	TokenNameEQUAL	
focusX	TokenNameIdentifier	 focus X
-	TokenNameMINUS	
centerX	TokenNameIdentifier	 center X
;	TokenNameSEMICOLON	
float	TokenNamefloat	
dY	TokenNameIdentifier	 d Y
=	TokenNameEQUAL	
focusY	TokenNameIdentifier	 focus Y
-	TokenNameMINUS	
centerY	TokenNameIdentifier	 center Y
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dist	TokenNameIdentifier	 dist
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dX	TokenNameIdentifier	 d X
*	TokenNameMULTIPLY	
dX	TokenNameIdentifier	 d X
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
dY	TokenNameIdentifier	 d Y
*	TokenNameMULTIPLY	
dY	TokenNameIdentifier	 d Y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//test if distance from focus to center is greater than the radius 	TokenNameCOMMENT_LINE	test if distance from focus to center is greater than the radius 
if	TokenNameif	
(	TokenNameLPAREN	
dist	TokenNameIdentifier	 dist
>	TokenNameGREATER	
radius	TokenNameIdentifier	 radius
*	TokenNameMULTIPLY	
SCALEBACK	TokenNameIdentifier	 SCALEBACK
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//clamp focus to radius 	TokenNameCOMMENT_LINE	clamp focus to radius 
double	TokenNamedouble	
angle	TokenNameIdentifier	 angle
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
atan2	TokenNameIdentifier	 atan2
(	TokenNameLPAREN	
dY	TokenNameIdentifier	 d Y
,	TokenNameCOMMA	
dX	TokenNameIdentifier	 d X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//x = r cos theta, y = r sin theta 	TokenNameCOMMENT_LINE	x = r cos theta, y = r sin theta 
focusX	TokenNameIdentifier	 focus X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
SCALEBACK	TokenNameIdentifier	 SCALEBACK
*	TokenNameMULTIPLY	
radius	TokenNameIdentifier	 radius
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
centerX	TokenNameIdentifier	 center X
;	TokenNameSEMICOLON	
focusY	TokenNameIdentifier	 focus Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
SCALEBACK	TokenNameIdentifier	 SCALEBACK
*	TokenNameMULTIPLY	
radius	TokenNameIdentifier	 radius
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
centerY	TokenNameIdentifier	 center Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//calculate the solution to be used in the case where X == focusX 	TokenNameCOMMENT_LINE	calculate the solution to be used in the case where X == focusX 
//in cyclicCircularGradientFillRaster 	TokenNameCOMMENT_LINE	in cyclicCircularGradientFillRaster 
dX	TokenNameIdentifier	 d X
=	TokenNameEQUAL	
focusX	TokenNameIdentifier	 focus X
-	TokenNameMINUS	
centerX	TokenNameIdentifier	 center X
;	TokenNameSEMICOLON	
trivial	TokenNameIdentifier	 trivial
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
radiusSq	TokenNameIdentifier	 radius Sq
-	TokenNameMINUS	
(	TokenNameLPAREN	
dX	TokenNameIdentifier	 d X
*	TokenNameMULTIPLY	
dX	TokenNameIdentifier	 d X
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// constant parts of X, Y user space coordinates 	TokenNameCOMMENT_LINE	constant parts of X, Y user space coordinates 
constA	TokenNameIdentifier	 const A
=	TokenNameEQUAL	
a02	TokenNameIdentifier	 a02
-	TokenNameMINUS	
centerX	TokenNameIdentifier	 center X
;	TokenNameSEMICOLON	
constB	TokenNameIdentifier	 const B
=	TokenNameEQUAL	
a12	TokenNameIdentifier	 a12
-	TokenNameMINUS	
centerY	TokenNameIdentifier	 center Y
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
colorRend	TokenNameIdentifier	 color Rend
=	TokenNameEQUAL	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_COLOR_RENDERING	TokenNameIdentifier	 KEY  COLOR  RENDERING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
rend	TokenNameIdentifier	 rend
=	TokenNameEQUAL	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_RENDERING	TokenNameIdentifier	 KEY  RENDERING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fillMethod	TokenNameIdentifier	 fill Method
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rend	TokenNameIdentifier	 rend
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_RENDER_QUALITY	TokenNameIdentifier	 VALUE  RENDER  QUALITY
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
colorRend	TokenNameIdentifier	 color Rend
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_COLOR_RENDER_QUALITY	TokenNameIdentifier	 VALUE  COLOR  RENDER  QUALITY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("AAHints set: " + rend + ", " + colorRend); 	TokenNameCOMMENT_LINE	System.out.println("AAHints set: " + rend + ", " + colorRend); 
fillMethod	TokenNameIdentifier	 fill Method
=	TokenNameEQUAL	
ANTI_ALIAS_IMPL	TokenNameIdentifier	 ANTI  ALIAS  IMPL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rend	TokenNameIdentifier	 rend
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_RENDER_SPEED	TokenNameIdentifier	 VALUE  RENDER  SPEED
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
colorRend	TokenNameIdentifier	 color Rend
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_COLOR_RENDER_SPEED	TokenNameIdentifier	 VALUE  COLOR  RENDER  SPEED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("SPHints set: " + rend + ", " + colorRend); 	TokenNameCOMMENT_LINE	System.out.println("SPHints set: " + rend + ", " + colorRend); 
fillMethod	TokenNameIdentifier	 fill Method
=	TokenNameEQUAL	
DEFAULT_IMPL	TokenNameIdentifier	 DEFAULT  IMPL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We are in the 'default' case, no hint or hint set to 	TokenNameCOMMENT_LINE	We are in the 'default' case, no hint or hint set to 
// DEFAULT values... 	TokenNameCOMMENT_LINE	DEFAULT values... 
if	TokenNameif	
(	TokenNameLPAREN	
fillMethod	TokenNameIdentifier	 fill Method
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For now we will always use the 'default' impl if 	TokenNameCOMMENT_LINE	For now we will always use the 'default' impl if 
// one is not specified. 	TokenNameCOMMENT_LINE	one is not specified. 
fillMethod	TokenNameIdentifier	 fill Method
=	TokenNameEQUAL	
DEFAULT_IMPL	TokenNameIdentifier	 DEFAULT  IMPL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This could be used for a 'smart' choice in 	TokenNameCOMMENT_LINE	This could be used for a 'smart' choice in 
// the default case, if the gradient has obvious 	TokenNameCOMMENT_LINE	the default case, if the gradient has obvious 
// discontinuites use AA, otherwise default 	TokenNameCOMMENT_LINE	discontinuites use AA, otherwise default 
if	TokenNameif	
(	TokenNameLPAREN	
hasDiscontinuity	TokenNameIdentifier	 has Discontinuity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fillMethod	TokenNameIdentifier	 fill Method
=	TokenNameEQUAL	
ANTI_ALIAS_IMPL	TokenNameIdentifier	 ANTI  ALIAS  IMPL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fillMethod	TokenNameIdentifier	 fill Method
=	TokenNameEQUAL	
DEFAULT_IMPL	TokenNameIdentifier	 DEFAULT  IMPL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fillMethod	TokenNameIdentifier	 fill Method
==	TokenNameEQUAL_EQUAL	
DEFAULT_IMPL	TokenNameIdentifier	 DEFAULT  IMPL
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
isSimpleFocus	TokenNameIdentifier	 is Simple Focus
&&	TokenNameAND_AND	
isNonCyclic	TokenNameIdentifier	 is Non Cyclic
&&	TokenNameAND_AND	
isSimpleLookup	TokenNameIdentifier	 is Simple Lookup
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
calculateFixedPointSqrtLookupTable	TokenNameIdentifier	 calculate Fixed Point Sqrt Lookup Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fillMethod	TokenNameIdentifier	 fill Method
=	TokenNameEQUAL	
FIXED_POINT_IMPL	TokenNameIdentifier	 FIXED  POINT  IMPL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return a Raster containing the colors generated for the graphics * operation. * * @param x The x coordinate of the area in device space for which colors * are generated. * @param y The y coordinate of the area in device space for which colors * are generated. * @param w The width of the area in device space for which colors * are generated. * @param h The height of the area in device space for which colors * are generated. */	TokenNameCOMMENT_JAVADOC	 Return a Raster containing the colors generated for the graphics operation. * @param x The x coordinate of the area in device space for which colors are generated. @param y The y coordinate of the area in device space for which colors are generated. @param w The width of the area in device space for which colors are generated. @param h The height of the area in device space for which colors are generated. 
protected	TokenNameprotected	
void	TokenNamevoid	
fillRaster	TokenNameIdentifier	 fill Raster
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pixels	TokenNameIdentifier	 pixels
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
adjust	TokenNameIdentifier	 adjust
,	TokenNameCOMMA	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
int	TokenNameint	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
int	TokenNameint	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
fillMethod	TokenNameIdentifier	 fill Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
FIXED_POINT_IMPL	TokenNameIdentifier	 FIXED  POINT  IMPL
:	TokenNameCOLON	
// System.out.println("Calling FP"); 	TokenNameCOMMENT_LINE	System.out.println("Calling FP"); 
fixedPointSimplestCaseNonCyclicFillRaster	TokenNameIdentifier	 fixed Point Simplest Case Non Cyclic Fill Raster
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
adjust	TokenNameIdentifier	 adjust
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ANTI_ALIAS_IMPL	TokenNameIdentifier	 ANTI  ALIAS  IMPL
:	TokenNameCOLON	
// System.out.println("Calling AA"); 	TokenNameCOMMENT_LINE	System.out.println("Calling AA"); 
antiAliasFillRaster	TokenNameIdentifier	 anti Alias Fill Raster
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
adjust	TokenNameIdentifier	 adjust
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DEFAULT_IMPL	TokenNameIdentifier	 DEFAULT  IMPL
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// System.out.println("Calling Default"); 	TokenNameCOMMENT_LINE	System.out.println("Calling Default"); 
cyclicCircularGradientFillRaster	TokenNameIdentifier	 cyclic Circular Gradient Fill Raster
(	TokenNameLPAREN	
pixels	TokenNameIdentifier	 pixels
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
adjust	TokenNameIdentifier	 adjust
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This code works in the simplest of cases, where the focus == center * point, the gradient is noncyclic, and the gradient lookup method is * fast (single array index, no conversion necessary). * */	TokenNameCOMMENT_JAVADOC	 This code works in the simplest of cases, where the focus == center point, the gradient is noncyclic, and the gradient lookup method is fast (single array index, no conversion necessary). 
private	TokenNameprivate	
void	TokenNamevoid	
fixedPointSimplestCaseNonCyclicFillRaster	TokenNameIdentifier	 fixed Point Simplest Case Non Cyclic Fill Raster
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pixels	TokenNameIdentifier	 pixels
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
adjust	TokenNameIdentifier	 adjust
,	TokenNameCOMMA	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
int	TokenNameint	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
int	TokenNameint	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
iSq	TokenNameIdentifier	 i Sq
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Square distance index 	TokenNameCOMMENT_LINE	Square distance index 
final	TokenNamefinal	
float	TokenNamefloat	
indexFactor	TokenNameIdentifier	 index Factor
=	TokenNameEQUAL	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
/	TokenNameDIVIDE	
radius	TokenNameIdentifier	 radius
;	TokenNameSEMICOLON	
//constant part of X and Y coordinates for the entire raster 	TokenNameCOMMENT_LINE	constant part of X and Y coordinates for the entire raster 
final	TokenNamefinal	
float	TokenNamefloat	
constX	TokenNameIdentifier	 const X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a00	TokenNameIdentifier	 a00
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
a01	TokenNameIdentifier	 a01
*	TokenNameMULTIPLY	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
+	TokenNamePLUS	
constA	TokenNameIdentifier	 const A
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
constY	TokenNameIdentifier	 const Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a10	TokenNameIdentifier	 a10
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
a11	TokenNameIdentifier	 a11
*	TokenNameMULTIPLY	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
+	TokenNamePLUS	
constB	TokenNameIdentifier	 const B
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
deltaX	TokenNameIdentifier	 delta X
=	TokenNameEQUAL	
indexFactor	TokenNameIdentifier	 index Factor
*	TokenNameMULTIPLY	
a00	TokenNameIdentifier	 a00
;	TokenNameSEMICOLON	
//incremental change in dX 	TokenNameCOMMENT_LINE	incremental change in dX 
final	TokenNamefinal	
float	TokenNamefloat	
deltaY	TokenNameIdentifier	 delta Y
=	TokenNameEQUAL	
indexFactor	TokenNameIdentifier	 index Factor
*	TokenNameMULTIPLY	
a10	TokenNameIdentifier	 a10
;	TokenNameSEMICOLON	
//incremental change in dY 	TokenNameCOMMENT_LINE	incremental change in dY 
float	TokenNamefloat	
dX	TokenNameIdentifier	 d X
,	TokenNameCOMMA	
dY	TokenNameIdentifier	 d Y
;	TokenNameSEMICOLON	
//the current distance from center 	TokenNameCOMMENT_LINE	the current distance from center 
final	TokenNamefinal	
int	TokenNameint	
fixedArraySizeSq	TokenNameIdentifier	 fixed Array Size Sq
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
*	TokenNameMULTIPLY	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
gDelta	TokenNameIdentifier	 g Delta
,	TokenNameCOMMA	
gDeltaDelta	TokenNameIdentifier	 g Delta Delta
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
//gradient square value 	TokenNameCOMMENT_LINE	gradient square value 
int	TokenNameint	
gIndex	TokenNameIdentifier	 g Index
;	TokenNameSEMICOLON	
// integer number used to index gradient array 	TokenNameCOMMENT_LINE	integer number used to index gradient array 
int	TokenNameint	
iSqInt	TokenNameIdentifier	 i Sq Int
;	TokenNameSEMICOLON	
// Square distance index 	TokenNameCOMMENT_LINE	Square distance index 
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
//indexing variables 	TokenNameCOMMENT_LINE	indexing variables 
int	TokenNameint	
indexer	TokenNameIdentifier	 indexer
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
//used to index pixels array 	TokenNameCOMMENT_LINE	used to index pixels array 
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
deltaX	TokenNameIdentifier	 delta X
*	TokenNameMULTIPLY	
deltaX	TokenNameIdentifier	 delta X
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
deltaY	TokenNameIdentifier	 delta Y
*	TokenNameMULTIPLY	
deltaY	TokenNameIdentifier	 delta Y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gDeltaDelta	TokenNameIdentifier	 g Delta Delta
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
>	TokenNameGREATER	
fixedArraySizeSq	TokenNameIdentifier	 fixed Array Size Sq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This combination of scale and circle radius means 	TokenNameCOMMENT_LINE	This combination of scale and circle radius means 
// essentially no pixels will be anything but the end 	TokenNameCOMMENT_LINE	essentially no pixels will be anything but the end 
// stop color. This also avoids math problems. 	TokenNameCOMMENT_LINE	stop color. This also avoids math problems. 
final	TokenNamefinal	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
gradientOverflow	TokenNameIdentifier	 gradient Overflow
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//for every row 	TokenNameCOMMENT_LINE	for every row 
//for every column (inner loop begins here) 	TokenNameCOMMENT_LINE	for every column (inner loop begins here) 
for	TokenNamefor	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
indexer	TokenNameIdentifier	 indexer
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
indexer	TokenNameIdentifier	 indexer
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
indexer	TokenNameIdentifier	 indexer
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
indexer	TokenNameIdentifier	 indexer
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
indexer	TokenNameIdentifier	 indexer
+=	TokenNamePLUS_EQUAL	
adjust	TokenNameIdentifier	 adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// For every point in the raster, calculate the color at that point 	TokenNameCOMMENT_LINE	For every point in the raster, calculate the color at that point 
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//for every row 	TokenNameCOMMENT_LINE	for every row 
//x and y (in user space) of the first pixel of this row 	TokenNameCOMMENT_LINE	x and y (in user space) of the first pixel of this row 
dX	TokenNameIdentifier	 d X
=	TokenNameEQUAL	
indexFactor	TokenNameIdentifier	 index Factor
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a01	TokenNameIdentifier	 a01
*	TokenNameMULTIPLY	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
+	TokenNamePLUS	
constX	TokenNameIdentifier	 const X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dY	TokenNameIdentifier	 d Y
=	TokenNameEQUAL	
indexFactor	TokenNameIdentifier	 index Factor
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a11	TokenNameIdentifier	 a11
*	TokenNameMULTIPLY	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
+	TokenNamePLUS	
constY	TokenNameIdentifier	 const Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// these values below here allow for an incremental calculation 	TokenNameCOMMENT_LINE	these values below here allow for an incremental calculation 
// of dX^2 + dY^2 	TokenNameCOMMENT_LINE	of dX^2 + dY^2 
//initialize to be equal to distance squared 	TokenNameCOMMENT_LINE	initialize to be equal to distance squared 
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dY	TokenNameIdentifier	 d Y
*	TokenNameMULTIPLY	
dY	TokenNameIdentifier	 d Y
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
dX	TokenNameIdentifier	 d X
*	TokenNameMULTIPLY	
dX	TokenNameIdentifier	 d X
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gDelta	TokenNameIdentifier	 g Delta
=	TokenNameEQUAL	
(	TokenNameLPAREN	
deltaY	TokenNameIdentifier	 delta Y
*	TokenNameMULTIPLY	
dY	TokenNameIdentifier	 d Y
+	TokenNamePLUS	
deltaX	TokenNameIdentifier	 delta X
*	TokenNameMULTIPLY	
dX	TokenNameIdentifier	 d X
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
//for every column (inner loop begins here) 	TokenNameCOMMENT_LINE	for every column (inner loop begins here) 
for	TokenNamefor	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
indexer	TokenNameIdentifier	 indexer
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
indexer	TokenNameIdentifier	 indexer
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
indexer	TokenNameIdentifier	 indexer
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//determine the distance to the center 	TokenNameCOMMENT_LINE	determine the distance to the center 
//since this is a non cyclic fill raster, crop at "1" and 0 	TokenNameCOMMENT_LINE	since this is a non cyclic fill raster, crop at "1" and 0 
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
>=	TokenNameGREATER_EQUAL	
fixedArraySizeSq	TokenNameIdentifier	 fixed Array Size Sq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
indexer	TokenNameIdentifier	 indexer
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gradientOverflow	TokenNameIdentifier	 gradient Overflow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This should not happen as gIndex is a square 	TokenNameCOMMENT_LINE	This should not happen as gIndex is a square 
// quantity. Code commented out on purpose, can't underflow. 	TokenNameCOMMENT_LINE	quantity. Code commented out on purpose, can't underflow. 
// else if (g < 0) { 	TokenNameCOMMENT_LINE	else if (g < 0) { 
// gIndex = 0; 	TokenNameCOMMENT_LINE	gIndex = 0; 
// } 	TokenNameCOMMENT_LINE	} 
else	TokenNameelse	
{	TokenNameLBRACE	
iSq	TokenNameIdentifier	 i Sq
=	TokenNameEQUAL	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
*	TokenNameMULTIPLY	
invSqStepFloat	TokenNameIdentifier	 inv Sq Step Float
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iSqInt	TokenNameIdentifier	 i Sq Int
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
iSq	TokenNameIdentifier	 i Sq
;	TokenNameSEMICOLON	
//chop off fractional part 	TokenNameCOMMENT_LINE	chop off fractional part 
iSq	TokenNameIdentifier	 i Sq
-=	TokenNameMINUS_EQUAL	
iSqInt	TokenNameIdentifier	 i Sq Int
;	TokenNameSEMICOLON	
gIndex	TokenNameIdentifier	 g Index
=	TokenNameEQUAL	
sqrtLutFixed	TokenNameIdentifier	 sqrt Lut Fixed
[	TokenNameLBRACKET	
iSqInt	TokenNameIdentifier	 i Sq Int
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
gIndex	TokenNameIdentifier	 g Index
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
iSq	TokenNameIdentifier	 i Sq
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
sqrtLutFixed	TokenNameIdentifier	 sqrt Lut Fixed
[	TokenNameLBRACKET	
iSqInt	TokenNameIdentifier	 i Sq Int
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
gIndex	TokenNameIdentifier	 g Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
indexer	TokenNameIdentifier	 indexer
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gradient	TokenNameIdentifier	 gradient
[	TokenNameLBRACKET	
gIndex	TokenNameIdentifier	 g Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//incremental calculation 	TokenNameCOMMENT_LINE	incremental calculation 
g	TokenNameIdentifier	 g
+=	TokenNamePLUS_EQUAL	
gDelta	TokenNameIdentifier	 g Delta
;	TokenNameSEMICOLON	
gDelta	TokenNameIdentifier	 g Delta
+=	TokenNamePLUS_EQUAL	
gDeltaDelta	TokenNameIdentifier	 g Delta Delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
indexer	TokenNameIdentifier	 indexer
+=	TokenNamePLUS_EQUAL	
adjust	TokenNameIdentifier	 adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Length of a square distance intervale in the lookup table */	TokenNameCOMMENT_JAVADOC	 Length of a square distance intervale in the lookup table 
private	TokenNameprivate	
float	TokenNamefloat	
invSqStepFloat	TokenNameIdentifier	 inv Sq Step Float
;	TokenNameSEMICOLON	
/** Used to limit the size of the square root lookup table */	TokenNameCOMMENT_JAVADOC	 Used to limit the size of the square root lookup table 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_PRECISION	TokenNameIdentifier	 MAX  PRECISION
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Square root lookup table */	TokenNameCOMMENT_JAVADOC	 Square root lookup table 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sqrtLutFixed	TokenNameIdentifier	 sqrt Lut Fixed
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
MAX_PRECISION	TokenNameIdentifier	 MAX  PRECISION
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Build square root lookup table */	TokenNameCOMMENT_JAVADOC	 Build square root lookup table 
private	TokenNameprivate	
void	TokenNamevoid	
calculateFixedPointSqrtLookupTable	TokenNameIdentifier	 calculate Fixed Point Sqrt Lookup Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
sqStepFloat	TokenNameIdentifier	 sq Step Float
;	TokenNameSEMICOLON	
sqStepFloat	TokenNameIdentifier	 sq Step Float
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
*	TokenNameMULTIPLY	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
MAX_PRECISION	TokenNameIdentifier	 MAX  PRECISION
-	TokenNameMINUS	
2.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The last two values are the same so that linear square root 	TokenNameCOMMENT_LINE	The last two values are the same so that linear square root 
// interpolation can happen on the maximum reachable element in the 	TokenNameCOMMENT_LINE	interpolation can happen on the maximum reachable element in the 
// lookup table (precision-2) 	TokenNameCOMMENT_LINE	lookup table (precision-2) 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
workTbl	TokenNameIdentifier	 work Tbl
=	TokenNameEQUAL	
sqrtLutFixed	TokenNameIdentifier	 sqrt Lut Fixed
;	TokenNameSEMICOLON	
// local is cheaper 	TokenNameCOMMENT_LINE	local is cheaper 
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
MAX_PRECISION	TokenNameIdentifier	 MAX  PRECISION
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
workTbl	TokenNameIdentifier	 work Tbl
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
sqStepFloat	TokenNameIdentifier	 sq Step Float
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
workTbl	TokenNameIdentifier	 work Tbl
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
workTbl	TokenNameIdentifier	 work Tbl
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
invSqStepFloat	TokenNameIdentifier	 inv Sq Step Float
=	TokenNameEQUAL	
1.0f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
sqStepFloat	TokenNameIdentifier	 sq Step Float
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Fill the raster, cycling the gradient colors when a point falls outside * of the perimeter of the 100% stop circle. * * This calculation first computes the intersection point of the line * from the focus through the current point in the raster, and the * perimeter of the gradient circle. * * Then it determines the percentage distance of the current point along * that line (focus is 0%, perimeter is 100%). * * Equation of a circle centered at (a,b) with radius r: * (x-a)^2 + (y-b)^2 = r^2 * Equation of a line with slope m and y-intercept b * y = mx + b * replacing y in the cirlce equation and solving using the quadratic * formula produces the following set of equations. Constant factors have * been extracted out of the inner loop. * */	TokenNameCOMMENT_JAVADOC	 Fill the raster, cycling the gradient colors when a point falls outside of the perimeter of the 100% stop circle. * This calculation first computes the intersection point of the line from the focus through the current point in the raster, and the perimeter of the gradient circle. * Then it determines the percentage distance of the current point along that line (focus is 0%, perimeter is 100%). * Equation of a circle centered at (a,b) with radius r: (x-a)^2 + (y-b)^2 = r^2 Equation of a line with slope m and y-intercept b y = mx + b replacing y in the cirlce equation and solving using the quadratic formula produces the following set of equations. Constant factors have been extracted out of the inner loop. 
private	TokenNameprivate	
void	TokenNamevoid	
cyclicCircularGradientFillRaster	TokenNameIdentifier	 cyclic Circular Gradient Fill Raster
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pixels	TokenNameIdentifier	 pixels
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
adjust	TokenNameIdentifier	 adjust
,	TokenNameCOMMA	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
int	TokenNameint	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
int	TokenNameint	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Constant part of the C factor of the quadratic equation 	TokenNameCOMMENT_LINE	Constant part of the C factor of the quadratic equation 
final	TokenNamefinal	
double	TokenNamedouble	
constC	TokenNameIdentifier	 const C
=	TokenNameEQUAL	
-	TokenNameMINUS	
(	TokenNameLPAREN	
radiusSq	TokenNameIdentifier	 radius Sq
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
centerX	TokenNameIdentifier	 center X
*	TokenNameMULTIPLY	
centerX	TokenNameIdentifier	 center X
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
centerY	TokenNameIdentifier	 center Y
*	TokenNameMULTIPLY	
centerY	TokenNameIdentifier	 center Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
A	TokenNameIdentifier	 A
;	TokenNameSEMICOLON	
//coefficient of the quadratic equation (Ax^2 + Bx + C = 0) 	TokenNameCOMMENT_LINE	coefficient of the quadratic equation (Ax^2 + Bx + C = 0) 
double	TokenNamedouble	
B	TokenNameIdentifier	 B
;	TokenNameSEMICOLON	
//coefficient of the quadratic equation 	TokenNameCOMMENT_LINE	coefficient of the quadratic equation 
double	TokenNamedouble	
C	TokenNameIdentifier	 C
;	TokenNameSEMICOLON	
//coefficient of the quadratic equation 	TokenNameCOMMENT_LINE	coefficient of the quadratic equation 
double	TokenNamedouble	
slope	TokenNameIdentifier	 slope
;	TokenNameSEMICOLON	
//slope of the focus-perimeter line 	TokenNameCOMMENT_LINE	slope of the focus-perimeter line 
double	TokenNamedouble	
yintcpt	TokenNameIdentifier	 yintcpt
;	TokenNameSEMICOLON	
//y-intercept of the focus-perimeter line 	TokenNameCOMMENT_LINE	y-intercept of the focus-perimeter line 
double	TokenNamedouble	
solutionX	TokenNameIdentifier	 solution X
;	TokenNameSEMICOLON	
//intersection with circle X coordinate 	TokenNameCOMMENT_LINE	intersection with circle X coordinate 
double	TokenNamedouble	
solutionY	TokenNameIdentifier	 solution Y
;	TokenNameSEMICOLON	
//intersection with circle Y coordinate 	TokenNameCOMMENT_LINE	intersection with circle Y coordinate 
final	TokenNamefinal	
float	TokenNamefloat	
constX	TokenNameIdentifier	 const X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a00	TokenNameIdentifier	 a00
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
a01	TokenNameIdentifier	 a01
*	TokenNameMULTIPLY	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
+	TokenNamePLUS	
a02	TokenNameIdentifier	 a02
;	TokenNameSEMICOLON	
//const part of X coord 	TokenNameCOMMENT_LINE	const part of X coord 
final	TokenNamefinal	
float	TokenNamefloat	
constY	TokenNameIdentifier	 const Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a10	TokenNameIdentifier	 a10
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
a11	TokenNameIdentifier	 a11
*	TokenNameMULTIPLY	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
+	TokenNamePLUS	
a12	TokenNameIdentifier	 a12
;	TokenNameSEMICOLON	
//const part of Y coord 	TokenNameCOMMENT_LINE	const part of Y coord 
final	TokenNamefinal	
float	TokenNamefloat	
precalc2	TokenNameIdentifier	 precalc2
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
centerY	TokenNameIdentifier	 center Y
;	TokenNameSEMICOLON	
//const in inner loop quad. formula 	TokenNameCOMMENT_LINE	const in inner loop quad. formula 
final	TokenNamefinal	
float	TokenNamefloat	
precalc3	TokenNameIdentifier	 precalc3
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
centerX	TokenNameIdentifier	 center X
;	TokenNameSEMICOLON	
//const in inner loop quad. formula 	TokenNameCOMMENT_LINE	const in inner loop quad. formula 
float	TokenNamefloat	
X	TokenNameIdentifier	 X
;	TokenNameSEMICOLON	
// User space point X coordinate 	TokenNameCOMMENT_LINE	User space point X coordinate 
float	TokenNamefloat	
Y	TokenNameIdentifier	 Y
;	TokenNameSEMICOLON	
// User space point Y coordinate 	TokenNameCOMMENT_LINE	User space point Y coordinate 
float	TokenNamefloat	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
//value between 0 and 1 specifying position in the gradient 	TokenNameCOMMENT_LINE	value between 0 and 1 specifying position in the gradient 
float	TokenNamefloat	
det	TokenNameIdentifier	 det
;	TokenNameSEMICOLON	
//determinant of quadratic formula (should always be >0) 	TokenNameCOMMENT_LINE	determinant of quadratic formula (should always be >0) 
float	TokenNamefloat	
currentToFocusSq	TokenNameIdentifier	 current To Focus Sq
;	TokenNameSEMICOLON	
//sq distance from the current pt. to focus 	TokenNameCOMMENT_LINE	sq distance from the current pt. to focus 
float	TokenNamefloat	
intersectToFocusSq	TokenNameIdentifier	 intersect To Focus Sq
;	TokenNameSEMICOLON	
//sq distance from the intersect pt. to focus 	TokenNameCOMMENT_LINE	sq distance from the intersect pt. to focus 
float	TokenNamefloat	
deltaXSq	TokenNameIdentifier	 delta X Sq
;	TokenNameSEMICOLON	
//temp variable for a change in X squared. 	TokenNameCOMMENT_LINE	temp variable for a change in X squared. 
float	TokenNamefloat	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
//temp variable for a change in Y squared. 	TokenNameCOMMENT_LINE	temp variable for a change in Y squared. 
int	TokenNameint	
indexer	TokenNameIdentifier	 indexer
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
//index variable for pixels array 	TokenNameCOMMENT_LINE	index variable for pixels array 
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
//indexing variables for FOR loops 	TokenNameCOMMENT_LINE	indexing variables for FOR loops 
int	TokenNameint	
pixInc	TokenNameIdentifier	 pix Inc
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
adjust	TokenNameIdentifier	 adjust
;	TokenNameSEMICOLON	
//incremental index change for pixels array 	TokenNameCOMMENT_LINE	incremental index change for pixels array 
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//for every row 	TokenNameCOMMENT_LINE	for every row 
X	TokenNameIdentifier	 X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a01	TokenNameIdentifier	 a01
*	TokenNameMULTIPLY	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
+	TokenNamePLUS	
constX	TokenNameIdentifier	 const X
;	TokenNameSEMICOLON	
//constants from column to column 	TokenNameCOMMENT_LINE	constants from column to column 
Y	TokenNameIdentifier	 Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a11	TokenNameIdentifier	 a11
*	TokenNameMULTIPLY	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
+	TokenNamePLUS	
constY	TokenNameIdentifier	 const Y
;	TokenNameSEMICOLON	
//for every column (inner loop begins here) 	TokenNameCOMMENT_LINE	for every column (inner loop begins here) 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// special case to avoid divide by zero or very near zero 	TokenNameCOMMENT_LINE	special case to avoid divide by zero or very near zero 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
0.000001f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
)	TokenNameRPAREN	
<	TokenNameLESS	
0.000001f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
solutionX	TokenNameIdentifier	 solution X
=	TokenNameEQUAL	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
solutionY	TokenNameIdentifier	 solution Y
=	TokenNameEQUAL	
centerY	TokenNameIdentifier	 center Y
;	TokenNameSEMICOLON	
solutionY	TokenNameIdentifier	 solution Y
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
>	TokenNameGREATER	
focusY	TokenNameIdentifier	 focus Y
)	TokenNameRPAREN	
?	TokenNameQUESTION	
trivial	TokenNameIdentifier	 trivial
:	TokenNameCOLON	
-	TokenNameMINUS	
trivial	TokenNameIdentifier	 trivial
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//slope of the focus-current line 	TokenNameCOMMENT_LINE	slope of the focus-current line 
slope	TokenNameIdentifier	 slope
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
-	TokenNameMINUS	
focusY	TokenNameIdentifier	 focus Y
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yintcpt	TokenNameIdentifier	 yintcpt
=	TokenNameEQUAL	
Y	TokenNameIdentifier	 Y
-	TokenNameMINUS	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
X	TokenNameIdentifier	 X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//y-intercept of that same line 	TokenNameCOMMENT_LINE	y-intercept of that same line 
//use the quadratic formula to calculate the intersection 	TokenNameCOMMENT_LINE	use the quadratic formula to calculate the intersection 
//point 	TokenNameCOMMENT_LINE	point 
A	TokenNameIdentifier	 A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
slope	TokenNameIdentifier	 slope
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
B	TokenNameIdentifier	 B
=	TokenNameEQUAL	
precalc3	TokenNameIdentifier	 precalc3
+	TokenNamePLUS	
(	TokenNameLPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
centerY	TokenNameIdentifier	 center Y
-	TokenNameMINUS	
yintcpt	TokenNameIdentifier	 yintcpt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
C	TokenNameIdentifier	 C
=	TokenNameEQUAL	
constC	TokenNameIdentifier	 const C
+	TokenNamePLUS	
(	TokenNameLPAREN	
yintcpt	TokenNameIdentifier	 yintcpt
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
yintcpt	TokenNameIdentifier	 yintcpt
-	TokenNameMINUS	
precalc2	TokenNameIdentifier	 precalc2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
det	TokenNameIdentifier	 det
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
(	TokenNameLPAREN	
B	TokenNameIdentifier	 B
*	TokenNameMULTIPLY	
B	TokenNameIdentifier	 B
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
A	TokenNameIdentifier	 A
*	TokenNameMULTIPLY	
C	TokenNameIdentifier	 C
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
solutionX	TokenNameIdentifier	 solution X
=	TokenNameEQUAL	
-	TokenNameMINUS	
B	TokenNameIdentifier	 B
;	TokenNameSEMICOLON	
//choose the positive or negative root depending 	TokenNameCOMMENT_LINE	choose the positive or negative root depending 
//on where the X coord lies with respect to the focus. 	TokenNameCOMMENT_LINE	on where the X coord lies with respect to the focus. 
solutionX	TokenNameIdentifier	 solution X
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
<	TokenNameLESS	
focusX	TokenNameIdentifier	 focus X
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
det	TokenNameIdentifier	 det
:	TokenNameCOLON	
det	TokenNameIdentifier	 det
;	TokenNameSEMICOLON	
solutionX	TokenNameIdentifier	 solution X
=	TokenNameEQUAL	
solutionX	TokenNameIdentifier	 solution X
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
A	TokenNameIdentifier	 A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//divisor 	TokenNameCOMMENT_LINE	divisor 
solutionY	TokenNameIdentifier	 solution Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
solutionX	TokenNameIdentifier	 solution X
)	TokenNameRPAREN	
+	TokenNamePLUS	
yintcpt	TokenNameIdentifier	 yintcpt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//calculate the square of the distance from the current point 	TokenNameCOMMENT_LINE	calculate the square of the distance from the current point 
//to the focus and the square of the distance from the 	TokenNameCOMMENT_LINE	to the focus and the square of the distance from the 
//intersection point to the focus. Want the squares so we can 	TokenNameCOMMENT_LINE	intersection point to the focus. Want the squares so we can 
//do 1 square root after division instead of 2 before. 	TokenNameCOMMENT_LINE	do 1 square root after division instead of 2 before. 
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
solutionX	TokenNameIdentifier	 solution X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
*	TokenNameMULTIPLY	
deltaXSq	TokenNameIdentifier	 delta X Sq
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
solutionY	TokenNameIdentifier	 solution Y
-	TokenNameMINUS	
focusY	TokenNameIdentifier	 focus Y
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
deltaYSq	TokenNameIdentifier	 delta Y Sq
*	TokenNameMULTIPLY	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
intersectToFocusSq	TokenNameIdentifier	 intersect To Focus Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
+	TokenNamePLUS	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
X	TokenNameIdentifier	 X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
*	TokenNameMULTIPLY	
deltaXSq	TokenNameIdentifier	 delta X Sq
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
Y	TokenNameIdentifier	 Y
-	TokenNameMINUS	
focusY	TokenNameIdentifier	 focus Y
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
deltaYSq	TokenNameIdentifier	 delta Y Sq
*	TokenNameMULTIPLY	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
currentToFocusSq	TokenNameIdentifier	 current To Focus Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
+	TokenNamePLUS	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
//want the percentage (0-1) of the current point along the 	TokenNameCOMMENT_LINE	want the percentage (0-1) of the current point along the 
//focus-circumference line 	TokenNameCOMMENT_LINE	focus-circumference line 
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
currentToFocusSq	TokenNameIdentifier	 current To Focus Sq
/	TokenNameDIVIDE	
intersectToFocusSq	TokenNameIdentifier	 intersect To Focus Sq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Get the color at this point 	TokenNameCOMMENT_LINE	Get the color at this point 
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
indexer	TokenNameIdentifier	 indexer
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
indexIntoGradientsArrays	TokenNameIdentifier	 index Into Gradients Arrays
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
X	TokenNameIdentifier	 X
+=	TokenNamePLUS_EQUAL	
a00	TokenNameIdentifier	 a00
;	TokenNameSEMICOLON	
//incremental change in X, Y 	TokenNameCOMMENT_LINE	incremental change in X, Y 
Y	TokenNameIdentifier	 Y
+=	TokenNamePLUS_EQUAL	
a10	TokenNameIdentifier	 a10
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//end inner loop 	TokenNameCOMMENT_LINE	end inner loop 
indexer	TokenNameIdentifier	 indexer
+=	TokenNamePLUS_EQUAL	
pixInc	TokenNameIdentifier	 pix Inc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//end outer loop 	TokenNameCOMMENT_LINE	end outer loop 
}	TokenNameRBRACE	
/** Fill the raster, cycling the gradient colors when a point * falls outside of the perimeter of the 100% stop circle. Use * the anti-aliased gradient lookup. * * This calculation first computes the intersection point of the line * from the focus through the current point in the raster, and the * perimeter of the gradient circle. * * Then it determines the percentage distance of the current point along * that line (focus is 0%, perimeter is 100%). * * Equation of a circle centered at (a,b) with radius r: * (x-a)^2 + (y-b)^2 = r^2 * Equation of a line with slope m and y-intercept b * y = mx + b * replacing y in the cirlce equation and solving using the quadratic * formula produces the following set of equations. Constant factors have * been extracted out of the inner loop. * */	TokenNameCOMMENT_JAVADOC	 Fill the raster, cycling the gradient colors when a point falls outside of the perimeter of the 100% stop circle. Use the anti-aliased gradient lookup. * This calculation first computes the intersection point of the line from the focus through the current point in the raster, and the perimeter of the gradient circle. * Then it determines the percentage distance of the current point along that line (focus is 0%, perimeter is 100%). * Equation of a circle centered at (a,b) with radius r: (x-a)^2 + (y-b)^2 = r^2 Equation of a line with slope m and y-intercept b y = mx + b replacing y in the cirlce equation and solving using the quadratic formula produces the following set of equations. Constant factors have been extracted out of the inner loop. 
private	TokenNameprivate	
void	TokenNamevoid	
antiAliasFillRaster	TokenNameIdentifier	 anti Alias Fill Raster
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pixels	TokenNameIdentifier	 pixels
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
adjust	TokenNameIdentifier	 adjust
,	TokenNameCOMMA	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
int	TokenNameint	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
int	TokenNameint	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Constant part of the C factor of the quadratic equation 	TokenNameCOMMENT_LINE	Constant part of the C factor of the quadratic equation 
final	TokenNamefinal	
double	TokenNamedouble	
constC	TokenNameIdentifier	 const C
=	TokenNameEQUAL	
-	TokenNameMINUS	
(	TokenNameLPAREN	
radiusSq	TokenNameIdentifier	 radius Sq
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
centerX	TokenNameIdentifier	 center X
*	TokenNameMULTIPLY	
centerX	TokenNameIdentifier	 center X
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
centerY	TokenNameIdentifier	 center Y
*	TokenNameMULTIPLY	
centerY	TokenNameIdentifier	 center Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//coefficients of the quadratic equation (Ax^2 + Bx + C = 0) 	TokenNameCOMMENT_LINE	coefficients of the quadratic equation (Ax^2 + Bx + C = 0) 
final	TokenNamefinal	
float	TokenNamefloat	
precalc2	TokenNameIdentifier	 precalc2
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
centerY	TokenNameIdentifier	 center Y
;	TokenNameSEMICOLON	
//const in inner loop quad. formula 	TokenNameCOMMENT_LINE	const in inner loop quad. formula 
final	TokenNamefinal	
float	TokenNamefloat	
precalc3	TokenNameIdentifier	 precalc3
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
centerX	TokenNameIdentifier	 center X
;	TokenNameSEMICOLON	
//const in inner loop quad. formula 	TokenNameCOMMENT_LINE	const in inner loop quad. formula 
//const part of X,Y coord (shifted to bottom left corner of pixel. 	TokenNameCOMMENT_LINE	const part of X,Y coord (shifted to bottom left corner of pixel. 
final	TokenNamefinal	
float	TokenNamefloat	
constX	TokenNameIdentifier	 const X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a00	TokenNameIdentifier	 a00
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
a01	TokenNameIdentifier	 a01
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
a02	TokenNameIdentifier	 a02
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
constY	TokenNameIdentifier	 const Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a10	TokenNameIdentifier	 a10
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
a11	TokenNameIdentifier	 a11
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
a12	TokenNameIdentifier	 a12
;	TokenNameSEMICOLON	
float	TokenNamefloat	
X	TokenNameIdentifier	 X
;	TokenNameSEMICOLON	
// User space point X coordinate 	TokenNameCOMMENT_LINE	User space point X coordinate 
float	TokenNamefloat	
Y	TokenNameIdentifier	 Y
;	TokenNameSEMICOLON	
// User space point Y coordinate 	TokenNameCOMMENT_LINE	User space point Y coordinate 
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
//indexing variables for FOR loops 	TokenNameCOMMENT_LINE	indexing variables for FOR loops 
int	TokenNameint	
indexer	TokenNameIdentifier	 indexer
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//index variable for pixels array 	TokenNameCOMMENT_LINE	index variable for pixels array 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prevGs	TokenNameIdentifier	 prev Gs
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
deltaXSq	TokenNameIdentifier	 delta X Sq
,	TokenNameCOMMA	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
double	TokenNamedouble	
solutionX	TokenNameIdentifier	 solution X
,	TokenNameCOMMA	
solutionY	TokenNameIdentifier	 solution Y
;	TokenNameSEMICOLON	
double	TokenNamedouble	
slope	TokenNameIdentifier	 slope
,	TokenNameCOMMA	
yintcpt	TokenNameIdentifier	 yintcpt
,	TokenNameCOMMA	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
,	TokenNameCOMMA	
C	TokenNameIdentifier	 C
,	TokenNameCOMMA	
det	TokenNameIdentifier	 det
;	TokenNameSEMICOLON	
double	TokenNamedouble	
intersectToFocusSq	TokenNameIdentifier	 intersect To Focus Sq
,	TokenNameCOMMA	
currentToFocusSq	TokenNameIdentifier	 current To Focus Sq
;	TokenNameSEMICOLON	
double	TokenNamedouble	
g00	TokenNameIdentifier	 g00
,	TokenNameCOMMA	
g01	TokenNameIdentifier	 g01
,	TokenNameCOMMA	
g10	TokenNameIdentifier	 g10
,	TokenNameCOMMA	
g11	TokenNameIdentifier	 g11
;	TokenNameSEMICOLON	
// Set X,Y to top left corner of first pixel of first row. 	TokenNameCOMMENT_LINE	Set X,Y to top left corner of first pixel of first row. 
X	TokenNameIdentifier	 X
=	TokenNameEQUAL	
constX	TokenNameIdentifier	 const X
-	TokenNameMINUS	
a01	TokenNameIdentifier	 a01
;	TokenNameSEMICOLON	
Y	TokenNameIdentifier	 Y
=	TokenNameEQUAL	
constY	TokenNameIdentifier	 const Y
-	TokenNameMINUS	
a11	TokenNameIdentifier	 a11
;	TokenNameSEMICOLON	
// Calc top row of g's. 	TokenNameCOMMENT_LINE	Calc top row of g's. 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
float	TokenNamefloat	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
X	TokenNameIdentifier	 X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
// special case to avoid divide by zero or very near zero 	TokenNameCOMMENT_LINE	special case to avoid divide by zero or very near zero 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>	TokenNameGREATER	
-	TokenNameMINUS	
0.000001f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
<	TokenNameLESS	
0.000001f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
solutionX	TokenNameIdentifier	 solution X
=	TokenNameEQUAL	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
solutionY	TokenNameIdentifier	 solution Y
=	TokenNameEQUAL	
centerY	TokenNameIdentifier	 center Y
;	TokenNameSEMICOLON	
solutionY	TokenNameIdentifier	 solution Y
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
>	TokenNameGREATER	
focusY	TokenNameIdentifier	 focus Y
)	TokenNameRPAREN	
?	TokenNameQUESTION	
trivial	TokenNameIdentifier	 trivial
:	TokenNameCOLON	
-	TokenNameMINUS	
trivial	TokenNameIdentifier	 trivial
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Formula for Circle: (X-Xc)^2 + (Y-Yc)^2 - R^2 = 0 	TokenNameCOMMENT_LINE	Formula for Circle: (X-Xc)^2 + (Y-Yc)^2 - R^2 = 0 
// Formula line: Y = Slope*x + Y0; 	TokenNameCOMMENT_LINE	Formula line: Y = Slope*x + Y0; 
// 	TokenNameCOMMENT_LINE	 
// So you substitue line into Circle and apply 	TokenNameCOMMENT_LINE	So you substitue line into Circle and apply 
// Quadradic formula. 	TokenNameCOMMENT_LINE	Quadradic formula. 
//slope of the focus-current line 	TokenNameCOMMENT_LINE	slope of the focus-current line 
slope	TokenNameIdentifier	 slope
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
-	TokenNameMINUS	
focusY	TokenNameIdentifier	 focus Y
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yintcpt	TokenNameIdentifier	 yintcpt
=	TokenNameEQUAL	
Y	TokenNameIdentifier	 Y
-	TokenNameMINUS	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
X	TokenNameIdentifier	 X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//y-intercept of that same line 	TokenNameCOMMENT_LINE	y-intercept of that same line 
//use the quadratic formula to calculate the intersection 	TokenNameCOMMENT_LINE	use the quadratic formula to calculate the intersection 
//point 	TokenNameCOMMENT_LINE	point 
A	TokenNameIdentifier	 A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
slope	TokenNameIdentifier	 slope
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
B	TokenNameIdentifier	 B
=	TokenNameEQUAL	
precalc3	TokenNameIdentifier	 precalc3
+	TokenNamePLUS	
(	TokenNameLPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
centerY	TokenNameIdentifier	 center Y
-	TokenNameMINUS	
yintcpt	TokenNameIdentifier	 yintcpt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
C	TokenNameIdentifier	 C
=	TokenNameEQUAL	
constC	TokenNameIdentifier	 const C
+	TokenNamePLUS	
(	TokenNameLPAREN	
yintcpt	TokenNameIdentifier	 yintcpt
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
yintcpt	TokenNameIdentifier	 yintcpt
-	TokenNameMINUS	
precalc2	TokenNameIdentifier	 precalc2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
det	TokenNameIdentifier	 det
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
(	TokenNameLPAREN	
B	TokenNameIdentifier	 B
*	TokenNameMULTIPLY	
B	TokenNameIdentifier	 B
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
A	TokenNameIdentifier	 A
*	TokenNameMULTIPLY	
C	TokenNameIdentifier	 C
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
solutionX	TokenNameIdentifier	 solution X
=	TokenNameEQUAL	
-	TokenNameMINUS	
B	TokenNameIdentifier	 B
;	TokenNameSEMICOLON	
//choose the positive or negative root depending 	TokenNameCOMMENT_LINE	choose the positive or negative root depending 
//on where the X coord lies with respect to the focus. 	TokenNameCOMMENT_LINE	on where the X coord lies with respect to the focus. 
solutionX	TokenNameIdentifier	 solution X
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
<	TokenNameLESS	
focusX	TokenNameIdentifier	 focus X
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
det	TokenNameIdentifier	 det
:	TokenNameCOLON	
det	TokenNameIdentifier	 det
;	TokenNameSEMICOLON	
solutionX	TokenNameIdentifier	 solution X
=	TokenNameEQUAL	
solutionX	TokenNameIdentifier	 solution X
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
A	TokenNameIdentifier	 A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//divisor 	TokenNameCOMMENT_LINE	divisor 
solutionY	TokenNameIdentifier	 solution Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
solutionX	TokenNameIdentifier	 solution X
)	TokenNameRPAREN	
+	TokenNamePLUS	
yintcpt	TokenNameIdentifier	 yintcpt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//calculate the square of the distance from the current point 	TokenNameCOMMENT_LINE	calculate the square of the distance from the current point 
//to the focus and the square of the distance from the 	TokenNameCOMMENT_LINE	to the focus and the square of the distance from the 
//intersection point to the focus. Want the squares so we can 	TokenNameCOMMENT_LINE	intersection point to the focus. Want the squares so we can 
//do 1 square root after division instead of 2 before. 	TokenNameCOMMENT_LINE	do 1 square root after division instead of 2 before. 
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
solutionX	TokenNameIdentifier	 solution X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
*	TokenNameMULTIPLY	
deltaXSq	TokenNameIdentifier	 delta X Sq
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
solutionY	TokenNameIdentifier	 solution Y
-	TokenNameMINUS	
focusY	TokenNameIdentifier	 focus Y
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
deltaYSq	TokenNameIdentifier	 delta Y Sq
*	TokenNameMULTIPLY	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
intersectToFocusSq	TokenNameIdentifier	 intersect To Focus Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
+	TokenNamePLUS	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
X	TokenNameIdentifier	 X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
*	TokenNameMULTIPLY	
deltaXSq	TokenNameIdentifier	 delta X Sq
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
Y	TokenNameIdentifier	 Y
-	TokenNameMINUS	
focusY	TokenNameIdentifier	 focus Y
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
deltaYSq	TokenNameIdentifier	 delta Y Sq
*	TokenNameMULTIPLY	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
currentToFocusSq	TokenNameIdentifier	 current To Focus Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
+	TokenNamePLUS	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
//want the percentage (0-1) of the current point along the 	TokenNameCOMMENT_LINE	want the percentage (0-1) of the current point along the 
//focus-circumference line 	TokenNameCOMMENT_LINE	focus-circumference line 
prevGs	TokenNameIdentifier	 prev Gs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
currentToFocusSq	TokenNameIdentifier	 current To Focus Sq
/	TokenNameDIVIDE	
intersectToFocusSq	TokenNameIdentifier	 intersect To Focus Sq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
X	TokenNameIdentifier	 X
+=	TokenNamePLUS_EQUAL	
a00	TokenNameIdentifier	 a00
;	TokenNameSEMICOLON	
//incremental change in X, Y 	TokenNameCOMMENT_LINE	incremental change in X, Y 
Y	TokenNameIdentifier	 Y
+=	TokenNamePLUS_EQUAL	
a10	TokenNameIdentifier	 a10
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//for every row 	TokenNameCOMMENT_LINE	for every row 
// Set X,Y to bottom edge of pixel row. 	TokenNameCOMMENT_LINE	Set X,Y to bottom edge of pixel row. 
X	TokenNameIdentifier	 X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a01	TokenNameIdentifier	 a01
*	TokenNameMULTIPLY	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
+	TokenNamePLUS	
constX	TokenNameIdentifier	 const X
;	TokenNameSEMICOLON	
//constants from row to row 	TokenNameCOMMENT_LINE	constants from row to row 
Y	TokenNameIdentifier	 Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a11	TokenNameIdentifier	 a11
*	TokenNameMULTIPLY	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
+	TokenNamePLUS	
constY	TokenNameIdentifier	 const Y
;	TokenNameSEMICOLON	
g10	TokenNameIdentifier	 g10
=	TokenNameEQUAL	
prevGs	TokenNameIdentifier	 prev Gs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
X	TokenNameIdentifier	 X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
// special case to avoid divide by zero or very near zero 	TokenNameCOMMENT_LINE	special case to avoid divide by zero or very near zero 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>	TokenNameGREATER	
-	TokenNameMINUS	
0.000001f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
<	TokenNameLESS	
0.000001f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
solutionX	TokenNameIdentifier	 solution X
=	TokenNameEQUAL	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
solutionY	TokenNameIdentifier	 solution Y
=	TokenNameEQUAL	
centerY	TokenNameIdentifier	 center Y
;	TokenNameSEMICOLON	
solutionY	TokenNameIdentifier	 solution Y
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
>	TokenNameGREATER	
focusY	TokenNameIdentifier	 focus Y
)	TokenNameRPAREN	
?	TokenNameQUESTION	
trivial	TokenNameIdentifier	 trivial
:	TokenNameCOLON	
-	TokenNameMINUS	
trivial	TokenNameIdentifier	 trivial
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Formula for Circle: (X-Xc)^2 + (Y-Yc)^2 - R^2 = 0 	TokenNameCOMMENT_LINE	Formula for Circle: (X-Xc)^2 + (Y-Yc)^2 - R^2 = 0 
// Formula line: Y = Slope*x + Y0; 	TokenNameCOMMENT_LINE	Formula line: Y = Slope*x + Y0; 
// 	TokenNameCOMMENT_LINE	 
// So you substitue line into Circle and apply 	TokenNameCOMMENT_LINE	So you substitue line into Circle and apply 
// Quadradic formula. 	TokenNameCOMMENT_LINE	Quadradic formula. 
//slope of the focus-current line 	TokenNameCOMMENT_LINE	slope of the focus-current line 
slope	TokenNameIdentifier	 slope
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
-	TokenNameMINUS	
focusY	TokenNameIdentifier	 focus Y
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yintcpt	TokenNameIdentifier	 yintcpt
=	TokenNameEQUAL	
Y	TokenNameIdentifier	 Y
-	TokenNameMINUS	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
X	TokenNameIdentifier	 X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//y-intercept of that same line 	TokenNameCOMMENT_LINE	y-intercept of that same line 
//use the quadratic formula to calculate the intersection 	TokenNameCOMMENT_LINE	use the quadratic formula to calculate the intersection 
//point 	TokenNameCOMMENT_LINE	point 
A	TokenNameIdentifier	 A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
slope	TokenNameIdentifier	 slope
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
B	TokenNameIdentifier	 B
=	TokenNameEQUAL	
precalc3	TokenNameIdentifier	 precalc3
+	TokenNamePLUS	
(	TokenNameLPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
centerY	TokenNameIdentifier	 center Y
-	TokenNameMINUS	
yintcpt	TokenNameIdentifier	 yintcpt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
C	TokenNameIdentifier	 C
=	TokenNameEQUAL	
constC	TokenNameIdentifier	 const C
+	TokenNamePLUS	
(	TokenNameLPAREN	
yintcpt	TokenNameIdentifier	 yintcpt
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
yintcpt	TokenNameIdentifier	 yintcpt
-	TokenNameMINUS	
precalc2	TokenNameIdentifier	 precalc2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
det	TokenNameIdentifier	 det
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
(	TokenNameLPAREN	
B	TokenNameIdentifier	 B
*	TokenNameMULTIPLY	
B	TokenNameIdentifier	 B
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
A	TokenNameIdentifier	 A
*	TokenNameMULTIPLY	
C	TokenNameIdentifier	 C
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
solutionX	TokenNameIdentifier	 solution X
=	TokenNameEQUAL	
-	TokenNameMINUS	
B	TokenNameIdentifier	 B
;	TokenNameSEMICOLON	
//choose the positive or negative root depending 	TokenNameCOMMENT_LINE	choose the positive or negative root depending 
//on where the X coord lies with respect to the focus. 	TokenNameCOMMENT_LINE	on where the X coord lies with respect to the focus. 
solutionX	TokenNameIdentifier	 solution X
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
<	TokenNameLESS	
focusX	TokenNameIdentifier	 focus X
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
det	TokenNameIdentifier	 det
:	TokenNameCOLON	
det	TokenNameIdentifier	 det
;	TokenNameSEMICOLON	
solutionX	TokenNameIdentifier	 solution X
=	TokenNameEQUAL	
solutionX	TokenNameIdentifier	 solution X
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
A	TokenNameIdentifier	 A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//divisor 	TokenNameCOMMENT_LINE	divisor 
solutionY	TokenNameIdentifier	 solution Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
solutionX	TokenNameIdentifier	 solution X
)	TokenNameRPAREN	
+	TokenNamePLUS	
yintcpt	TokenNameIdentifier	 yintcpt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//calculate the square of the distance from the current point 	TokenNameCOMMENT_LINE	calculate the square of the distance from the current point 
//to the focus and the square of the distance from the 	TokenNameCOMMENT_LINE	to the focus and the square of the distance from the 
//intersection point to the focus. Want the squares so we can 	TokenNameCOMMENT_LINE	intersection point to the focus. Want the squares so we can 
//do 1 square root after division instead of 2 before. 	TokenNameCOMMENT_LINE	do 1 square root after division instead of 2 before. 
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
solutionX	TokenNameIdentifier	 solution X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
*	TokenNameMULTIPLY	
deltaXSq	TokenNameIdentifier	 delta X Sq
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
solutionY	TokenNameIdentifier	 solution Y
-	TokenNameMINUS	
focusY	TokenNameIdentifier	 focus Y
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
deltaYSq	TokenNameIdentifier	 delta Y Sq
*	TokenNameMULTIPLY	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
intersectToFocusSq	TokenNameIdentifier	 intersect To Focus Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
+	TokenNamePLUS	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
X	TokenNameIdentifier	 X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
*	TokenNameMULTIPLY	
deltaXSq	TokenNameIdentifier	 delta X Sq
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
Y	TokenNameIdentifier	 Y
-	TokenNameMINUS	
focusY	TokenNameIdentifier	 focus Y
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
deltaYSq	TokenNameIdentifier	 delta Y Sq
*	TokenNameMULTIPLY	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
currentToFocusSq	TokenNameIdentifier	 current To Focus Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
+	TokenNamePLUS	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
g11	TokenNameIdentifier	 g11
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
currentToFocusSq	TokenNameIdentifier	 current To Focus Sq
/	TokenNameDIVIDE	
intersectToFocusSq	TokenNameIdentifier	 intersect To Focus Sq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevGs	TokenNameIdentifier	 prev Gs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
g11	TokenNameIdentifier	 g11
;	TokenNameSEMICOLON	
X	TokenNameIdentifier	 X
+=	TokenNamePLUS_EQUAL	
a00	TokenNameIdentifier	 a00
;	TokenNameSEMICOLON	
//incremental change in X, Y 	TokenNameCOMMENT_LINE	incremental change in X, Y 
Y	TokenNameIdentifier	 Y
+=	TokenNamePLUS_EQUAL	
a10	TokenNameIdentifier	 a10
;	TokenNameSEMICOLON	
//for every column (inner loop begins here) 	TokenNameCOMMENT_LINE	for every column (inner loop begins here) 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g00	TokenNameIdentifier	 g00
=	TokenNameEQUAL	
g10	TokenNameIdentifier	 g10
;	TokenNameSEMICOLON	
g01	TokenNameIdentifier	 g01
=	TokenNameEQUAL	
g11	TokenNameIdentifier	 g11
;	TokenNameSEMICOLON	
g10	TokenNameIdentifier	 g10
=	TokenNameEQUAL	
prevGs	TokenNameIdentifier	 prev Gs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
X	TokenNameIdentifier	 X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
// special case to avoid divide by zero or very near zero 	TokenNameCOMMENT_LINE	special case to avoid divide by zero or very near zero 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>	TokenNameGREATER	
-	TokenNameMINUS	
0.000001f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
<	TokenNameLESS	
0.000001f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
solutionX	TokenNameIdentifier	 solution X
=	TokenNameEQUAL	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
solutionY	TokenNameIdentifier	 solution Y
=	TokenNameEQUAL	
centerY	TokenNameIdentifier	 center Y
;	TokenNameSEMICOLON	
solutionY	TokenNameIdentifier	 solution Y
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
>	TokenNameGREATER	
focusY	TokenNameIdentifier	 focus Y
)	TokenNameRPAREN	
?	TokenNameQUESTION	
trivial	TokenNameIdentifier	 trivial
:	TokenNameCOLON	
-	TokenNameMINUS	
trivial	TokenNameIdentifier	 trivial
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Formula for Circle: (X-Xc)^2 + (Y-Yc)^2 - R^2 = 0 	TokenNameCOMMENT_LINE	Formula for Circle: (X-Xc)^2 + (Y-Yc)^2 - R^2 = 0 
// Formula line: Y = Slope*x + Y0; 	TokenNameCOMMENT_LINE	Formula line: Y = Slope*x + Y0; 
// 	TokenNameCOMMENT_LINE	 
// So you substitue line into Circle and apply 	TokenNameCOMMENT_LINE	So you substitue line into Circle and apply 
// Quadradic formula. 	TokenNameCOMMENT_LINE	Quadradic formula. 
//slope of the focus-current line 	TokenNameCOMMENT_LINE	slope of the focus-current line 
slope	TokenNameIdentifier	 slope
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
-	TokenNameMINUS	
focusY	TokenNameIdentifier	 focus Y
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yintcpt	TokenNameIdentifier	 yintcpt
=	TokenNameEQUAL	
Y	TokenNameIdentifier	 Y
-	TokenNameMINUS	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
X	TokenNameIdentifier	 X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//y-intercept of that same line 	TokenNameCOMMENT_LINE	y-intercept of that same line 
//use the quadratic formula to calculate the intersection 	TokenNameCOMMENT_LINE	use the quadratic formula to calculate the intersection 
//point 	TokenNameCOMMENT_LINE	point 
A	TokenNameIdentifier	 A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
slope	TokenNameIdentifier	 slope
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
B	TokenNameIdentifier	 B
=	TokenNameEQUAL	
precalc3	TokenNameIdentifier	 precalc3
+	TokenNamePLUS	
(	TokenNameLPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
centerY	TokenNameIdentifier	 center Y
-	TokenNameMINUS	
yintcpt	TokenNameIdentifier	 yintcpt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
C	TokenNameIdentifier	 C
=	TokenNameEQUAL	
constC	TokenNameIdentifier	 const C
+	TokenNamePLUS	
(	TokenNameLPAREN	
yintcpt	TokenNameIdentifier	 yintcpt
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
yintcpt	TokenNameIdentifier	 yintcpt
-	TokenNameMINUS	
precalc2	TokenNameIdentifier	 precalc2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
det	TokenNameIdentifier	 det
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
(	TokenNameLPAREN	
B	TokenNameIdentifier	 B
*	TokenNameMULTIPLY	
B	TokenNameIdentifier	 B
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
A	TokenNameIdentifier	 A
*	TokenNameMULTIPLY	
C	TokenNameIdentifier	 C
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
solutionX	TokenNameIdentifier	 solution X
=	TokenNameEQUAL	
-	TokenNameMINUS	
B	TokenNameIdentifier	 B
;	TokenNameSEMICOLON	
//choose the positive or negative root depending 	TokenNameCOMMENT_LINE	choose the positive or negative root depending 
//on where the X coord lies with respect to the focus. 	TokenNameCOMMENT_LINE	on where the X coord lies with respect to the focus. 
solutionX	TokenNameIdentifier	 solution X
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
<	TokenNameLESS	
focusX	TokenNameIdentifier	 focus X
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
det	TokenNameIdentifier	 det
:	TokenNameCOLON	
det	TokenNameIdentifier	 det
;	TokenNameSEMICOLON	
solutionX	TokenNameIdentifier	 solution X
=	TokenNameEQUAL	
solutionX	TokenNameIdentifier	 solution X
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
A	TokenNameIdentifier	 A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//divisor 	TokenNameCOMMENT_LINE	divisor 
solutionY	TokenNameIdentifier	 solution Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
solutionX	TokenNameIdentifier	 solution X
)	TokenNameRPAREN	
+	TokenNamePLUS	
yintcpt	TokenNameIdentifier	 yintcpt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//calculate the square of the distance from the current point 	TokenNameCOMMENT_LINE	calculate the square of the distance from the current point 
//to the focus and the square of the distance from the 	TokenNameCOMMENT_LINE	to the focus and the square of the distance from the 
//intersection point to the focus. Want the squares so we can 	TokenNameCOMMENT_LINE	intersection point to the focus. Want the squares so we can 
//do 1 square root after division instead of 2 before. 	TokenNameCOMMENT_LINE	do 1 square root after division instead of 2 before. 
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
solutionX	TokenNameIdentifier	 solution X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
*	TokenNameMULTIPLY	
deltaXSq	TokenNameIdentifier	 delta X Sq
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
solutionY	TokenNameIdentifier	 solution Y
-	TokenNameMINUS	
focusY	TokenNameIdentifier	 focus Y
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
deltaYSq	TokenNameIdentifier	 delta Y Sq
*	TokenNameMULTIPLY	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
intersectToFocusSq	TokenNameIdentifier	 intersect To Focus Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
+	TokenNamePLUS	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
X	TokenNameIdentifier	 X
-	TokenNameMINUS	
focusX	TokenNameIdentifier	 focus X
;	TokenNameSEMICOLON	
deltaXSq	TokenNameIdentifier	 delta X Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
*	TokenNameMULTIPLY	
deltaXSq	TokenNameIdentifier	 delta X Sq
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
Y	TokenNameIdentifier	 Y
-	TokenNameMINUS	
focusY	TokenNameIdentifier	 focus Y
;	TokenNameSEMICOLON	
deltaYSq	TokenNameIdentifier	 delta Y Sq
=	TokenNameEQUAL	
deltaYSq	TokenNameIdentifier	 delta Y Sq
*	TokenNameMULTIPLY	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
currentToFocusSq	TokenNameIdentifier	 current To Focus Sq
=	TokenNameEQUAL	
deltaXSq	TokenNameIdentifier	 delta X Sq
+	TokenNamePLUS	
deltaYSq	TokenNameIdentifier	 delta Y Sq
;	TokenNameSEMICOLON	
g11	TokenNameIdentifier	 g11
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
currentToFocusSq	TokenNameIdentifier	 current To Focus Sq
/	TokenNameDIVIDE	
intersectToFocusSq	TokenNameIdentifier	 intersect To Focus Sq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevGs	TokenNameIdentifier	 prev Gs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
g11	TokenNameIdentifier	 g11
;	TokenNameSEMICOLON	
//Get the color at this point 	TokenNameCOMMENT_LINE	Get the color at this point 
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
indexer	TokenNameIdentifier	 indexer
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
indexGradientAntiAlias	TokenNameIdentifier	 index Gradient Anti Alias
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
g00	TokenNameIdentifier	 g00
+	TokenNamePLUS	
g01	TokenNameIdentifier	 g01
+	TokenNamePLUS	
g10	TokenNameIdentifier	 g10
+	TokenNamePLUS	
g11	TokenNameIdentifier	 g11
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
g11	TokenNameIdentifier	 g11
-	TokenNameMINUS	
g00	TokenNameIdentifier	 g00
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
g10	TokenNameIdentifier	 g10
-	TokenNameMINUS	
g01	TokenNameIdentifier	 g01
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
X	TokenNameIdentifier	 X
+=	TokenNamePLUS_EQUAL	
a00	TokenNameIdentifier	 a00
;	TokenNameSEMICOLON	
//incremental change in X, Y 	TokenNameCOMMENT_LINE	incremental change in X, Y 
Y	TokenNameIdentifier	 Y
+=	TokenNamePLUS_EQUAL	
a10	TokenNameIdentifier	 a10
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//end inner loop 	TokenNameCOMMENT_LINE	end inner loop 
indexer	TokenNameIdentifier	 indexer
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
adjust	TokenNameIdentifier	 adjust
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//end outer loop 	TokenNameCOMMENT_LINE	end outer loop 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
