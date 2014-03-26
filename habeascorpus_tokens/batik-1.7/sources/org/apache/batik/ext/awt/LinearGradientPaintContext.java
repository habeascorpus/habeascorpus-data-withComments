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
Point2D	TokenNameIdentifier	 Point2 D
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
/** * Provides the actual implementation for the LinearGradientPaint * This is where the pixel processing is done. * * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: LinearGradientPaintContext.java 475685 2006-11-16 11:16:05Z cam $ * @see java.awt.PaintContext * @see java.awt.Paint * @see java.awt.GradientPaint */	TokenNameCOMMENT_JAVADOC	 Provides the actual implementation for the LinearGradientPaint This is where the pixel processing is done. * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: LinearGradientPaintContext.java 475685 2006-11-16 11:16:05Z cam $ @see java.awt.PaintContext @see java.awt.Paint @see java.awt.GradientPaint 
final	TokenNamefinal	
class	TokenNameclass	
LinearGradientPaintContext	TokenNameIdentifier	 Linear Gradient Paint Context
extends	TokenNameextends	
MultipleGradientPaintContext	TokenNameIdentifier	 Multiple Gradient Paint Context
{	TokenNameLBRACE	
/** * The following invariants are used to process the gradient value from * a device space coordinate, (X, Y): * g(X, Y) = dgdX*X + dgdY*Y + gc */	TokenNameCOMMENT_JAVADOC	 The following invariants are used to process the gradient value from a device space coordinate, (X, Y): g(X, Y) = dgdX*X + dgdY*Y + gc 
private	TokenNameprivate	
float	TokenNamefloat	
dgdX	TokenNameIdentifier	 dgd X
,	TokenNameCOMMA	
dgdY	TokenNameIdentifier	 dgd Y
,	TokenNameCOMMA	
gc	TokenNameIdentifier	 gc
,	TokenNameCOMMA	
pixSz	TokenNameIdentifier	 pix Sz
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_IMPL	TokenNameIdentifier	 DEFAULT  IMPL
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
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
/** * Constructor for LinearGradientPaintContext. * * @param cm {@link ColorModel} that receives * the <code>Paint</code> data. This is used only as a hint. * * @param deviceBounds the device space bounding box of the * graphics primitive being rendered * * @param userBounds the user space bounding box of the * graphics primitive being rendered * * @param t the {@link AffineTransform} from user * space into device space (gradientTransform should be * concatenated with this) * * @param hints the hints that the context object uses to choose * between rendering alternatives * * @param dStart gradient start point, in user space * * @param dEnd gradient end point, in user space * * @param fractions the fractions specifying the gradient distribution * * @param colors the gradient colors * * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * * @param colorSpace which colorspace to use for interpolation, * either SRGB or LINEAR_RGB * */	TokenNameCOMMENT_JAVADOC	 Constructor for LinearGradientPaintContext. * @param cm {@link ColorModel} that receives the <code>Paint</code> data. This is used only as a hint. * @param deviceBounds the device space bounding box of the graphics primitive being rendered * @param userBounds the user space bounding box of the graphics primitive being rendered * @param t the {@link AffineTransform} from user space into device space (gradientTransform should be concatenated with this) * @param hints the hints that the context object uses to choose between rendering alternatives * @param dStart gradient start point, in user space * @param dEnd gradient end point, in user space * @param fractions the fractions specifying the gradient distribution * @param colors the gradient colors * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * @param colorSpace which colorspace to use for interpolation, either SRGB or LINEAR_RGB 
public	TokenNamepublic	
LinearGradientPaintContext	TokenNameIdentifier	 Linear Gradient Paint Context
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
Point2D	TokenNameIdentifier	 Point2 D
dStart	TokenNameIdentifier	 d Start
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
dEnd	TokenNameIdentifier	 d End
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
// Use single precision floating points 	TokenNameCOMMENT_LINE	Use single precision floating points 
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
dStart	TokenNameIdentifier	 d Start
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
dStart	TokenNameIdentifier	 d Start
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
dEnd	TokenNameIdentifier	 d End
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
dEnd	TokenNameIdentifier	 d End
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// A given point in the raster should take on the same color as its 	TokenNameCOMMENT_LINE	A given point in the raster should take on the same color as its 
// projection onto the gradient vector. 	TokenNameCOMMENT_LINE	projection onto the gradient vector. 
// Thus, we want the projection of the current position vector 	TokenNameCOMMENT_LINE	Thus, we want the projection of the current position vector 
// onto the gradient vector, then normalized with respect to the 	TokenNameCOMMENT_LINE	onto the gradient vector, then normalized with respect to the 
// length of the gradient vector, giving a value which can be mapped into 	TokenNameCOMMENT_LINE	length of the gradient vector, giving a value which can be mapped into 
// the range 0-1. 	TokenNameCOMMENT_LINE	the range 0-1. 
// projection = currentVector dot gradientVector / length(gradientVector) 	TokenNameCOMMENT_LINE	projection = currentVector dot gradientVector / length(gradientVector) 
// normalized = projection / length(gradientVector) 	TokenNameCOMMENT_LINE	normalized = projection / length(gradientVector) 
float	TokenNamefloat	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
// change in x from start to end 	TokenNameCOMMENT_LINE	change in x from start to end 
float	TokenNamefloat	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
// change in y from start to end 	TokenNameCOMMENT_LINE	change in y from start to end 
float	TokenNamefloat	
dSq	TokenNameIdentifier	 d Sq
=	TokenNameEQUAL	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
+	TokenNamePLUS	
dy	TokenNameIdentifier	 dy
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
// total distance squared 	TokenNameCOMMENT_LINE	total distance squared 
//avoid repeated calculations by doing these divides once. 	TokenNameCOMMENT_LINE	avoid repeated calculations by doing these divides once. 
float	TokenNamefloat	
constX	TokenNameIdentifier	 const X
=	TokenNameEQUAL	
dx	TokenNameIdentifier	 dx
/	TokenNameDIVIDE	
dSq	TokenNameIdentifier	 d Sq
;	TokenNameSEMICOLON	
float	TokenNamefloat	
constY	TokenNameIdentifier	 const Y
=	TokenNameEQUAL	
dy	TokenNameIdentifier	 dy
/	TokenNameDIVIDE	
dSq	TokenNameIdentifier	 d Sq
;	TokenNameSEMICOLON	
//incremental change along gradient for +x 	TokenNameCOMMENT_LINE	incremental change along gradient for +x 
dgdX	TokenNameIdentifier	 dgd X
=	TokenNameEQUAL	
a00	TokenNameIdentifier	 a00
*	TokenNameMULTIPLY	
constX	TokenNameIdentifier	 const X
+	TokenNamePLUS	
a10	TokenNameIdentifier	 a10
*	TokenNameMULTIPLY	
constY	TokenNameIdentifier	 const Y
;	TokenNameSEMICOLON	
//incremental change along gradient for +y 	TokenNameCOMMENT_LINE	incremental change along gradient for +y 
dgdY	TokenNameIdentifier	 dgd Y
=	TokenNameEQUAL	
a01	TokenNameIdentifier	 a01
*	TokenNameMULTIPLY	
constX	TokenNameIdentifier	 const X
+	TokenNamePLUS	
a11	TokenNameIdentifier	 a11
*	TokenNameMULTIPLY	
constY	TokenNameIdentifier	 const Y
;	TokenNameSEMICOLON	
float	TokenNamefloat	
dgdXAbs	TokenNameIdentifier	 dgd X Abs
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
dgdX	TokenNameIdentifier	 dgd X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
dgdYAbs	TokenNameIdentifier	 dgd Y Abs
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
dgdY	TokenNameIdentifier	 dgd Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dgdXAbs	TokenNameIdentifier	 dgd X Abs
>	TokenNameGREATER	
dgdYAbs	TokenNameIdentifier	 dgd Y Abs
)	TokenNameRPAREN	
pixSz	TokenNameIdentifier	 pix Sz
=	TokenNameEQUAL	
dgdXAbs	TokenNameIdentifier	 dgd X Abs
;	TokenNameSEMICOLON	
else	TokenNameelse	
pixSz	TokenNameIdentifier	 pix Sz
=	TokenNameEQUAL	
dgdYAbs	TokenNameIdentifier	 dgd Y Abs
;	TokenNameSEMICOLON	
//constant, incorporates the translation components from the matrix 	TokenNameCOMMENT_LINE	constant, incorporates the translation components from the matrix 
gc	TokenNameIdentifier	 gc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a02	TokenNameIdentifier	 a02
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
constX	TokenNameIdentifier	 const X
+	TokenNamePLUS	
(	TokenNameLPAREN	
a12	TokenNameIdentifier	 a12
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
constY	TokenNameIdentifier	 const Y
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
DEFAULT_IMPL	TokenNameIdentifier	 DEFAULT  IMPL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cycleMethod	TokenNameIdentifier	 cycle Method
==	TokenNameEQUAL_EQUAL	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
REPEAT	TokenNameIdentifier	 REPEAT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
hasDiscontinuity	TokenNameIdentifier	 has Discontinuity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rend	TokenNameIdentifier	 rend
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_RENDER_QUALITY	TokenNameIdentifier	 VALUE  RENDER  QUALITY
)	TokenNameRPAREN	
fillMethod	TokenNameIdentifier	 fill Method
=	TokenNameEQUAL	
ANTI_ALIAS_IMPL	TokenNameIdentifier	 ANTI  ALIAS  IMPL
;	TokenNameSEMICOLON	
// ColorRend overrides rend. 	TokenNameCOMMENT_LINE	ColorRend overrides rend. 
if	TokenNameif	
(	TokenNameLPAREN	
colorRend	TokenNameIdentifier	 color Rend
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_COLOR_RENDER_SPEED	TokenNameIdentifier	 VALUE  COLOR  RENDER  SPEED
)	TokenNameRPAREN	
fillMethod	TokenNameIdentifier	 fill Method
=	TokenNameEQUAL	
DEFAULT_IMPL	TokenNameIdentifier	 DEFAULT  IMPL
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
colorRend	TokenNameIdentifier	 color Rend
==	TokenNameEQUAL_EQUAL	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_COLOR_RENDER_QUALITY	TokenNameIdentifier	 VALUE  COLOR  RENDER  QUALITY
)	TokenNameRPAREN	
fillMethod	TokenNameIdentifier	 fill Method
=	TokenNameEQUAL	
ANTI_ALIAS_IMPL	TokenNameIdentifier	 ANTI  ALIAS  IMPL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
fillHardNoCycle	TokenNameIdentifier	 fill Hard No Cycle
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
//constant which can be pulled out of the inner loop 	TokenNameCOMMENT_LINE	constant which can be pulled out of the inner loop 
final	TokenNamefinal	
float	TokenNamefloat	
initConst	TokenNameIdentifier	 init Const
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dgdX	TokenNameIdentifier	 dgd X
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
gc	TokenNameIdentifier	 gc
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
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//for every row 	TokenNameCOMMENT_LINE	for every row 
//initialize current value to be start. 	TokenNameCOMMENT_LINE	initialize current value to be start. 
float	TokenNamefloat	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
initConst	TokenNameIdentifier	 init Const
+	TokenNamePLUS	
dgdY	TokenNameIdentifier	 dgd Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
rowLimit	TokenNameIdentifier	 row Limit
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
// end of row iteration 	TokenNameCOMMENT_LINE	end of row iteration 
if	TokenNameif	
(	TokenNameLPAREN	
dgdX	TokenNameIdentifier	 dgd X
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("In fillHard: " + g); 	TokenNameCOMMENT_LINE	System.out.println("In fillHard: " + g); 
final	TokenNamefinal	
int	TokenNameint	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
gradientUnderflow	TokenNameIdentifier	 gradient Underflow
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
gradientOverflow	TokenNameIdentifier	 gradient Overflow
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// Could be a binary search... 	TokenNameCOMMENT_LINE	Could be a binary search... 
int	TokenNameint	
gradIdx	TokenNameIdentifier	 grad Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
gradIdx	TokenNameIdentifier	 grad Idx
<	TokenNameLESS	
gradientsLength	TokenNameIdentifier	 gradients Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
<	TokenNameLESS	
fractions	TokenNameIdentifier	 fractions
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
gradIdx	TokenNameIdentifier	 grad Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
-	TokenNameMINUS	
fractions	TokenNameIdentifier	 fractions
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
*	TokenNameMULTIPLY	
GRADIENT_SIZE_INDEX	TokenNameIdentifier	 GRADIENT  SIZE  INDEX
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
normalizedIntervals	TokenNameIdentifier	 normalized Intervals
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0.5f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
gradients	TokenNameIdentifier	 gradients
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
rowLimit	TokenNameIdentifier	 row Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// System.out.println("In fillHard2: " + g); 	TokenNameCOMMENT_LINE	System.out.println("In fillHard2: " + g); 
int	TokenNameint	
gradSteps	TokenNameIdentifier	 grad Steps
;	TokenNameSEMICOLON	
int	TokenNameint	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
preVal	TokenNameIdentifier	 pre Val
,	TokenNameCOMMA	
postVal	TokenNameIdentifier	 post Val
;	TokenNameSEMICOLON	
float	TokenNamefloat	
gradStepsF	TokenNameIdentifier	 grad Steps F
;	TokenNameSEMICOLON	
float	TokenNamefloat	
preGradStepsF	TokenNameIdentifier	 pre Grad Steps F
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dgdX	TokenNameIdentifier	 dgd X
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gradStepsF	TokenNameIdentifier	 grad Steps F
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
dgdX	TokenNameIdentifier	 dgd X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preGradStepsF	TokenNameIdentifier	 pre Grad Steps F
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
-	TokenNameMINUS	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
dgdX	TokenNameIdentifier	 dgd X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preVal	TokenNameIdentifier	 pre Val
=	TokenNameEQUAL	
gradientUnderflow	TokenNameIdentifier	 gradient Underflow
;	TokenNameSEMICOLON	
postVal	TokenNameIdentifier	 post Val
=	TokenNameEQUAL	
gradientOverflow	TokenNameIdentifier	 gradient Overflow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// dgdX < 0 	TokenNameCOMMENT_LINE	dgdX < 0 
gradStepsF	TokenNameIdentifier	 grad Steps F
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
-	TokenNameMINUS	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
dgdX	TokenNameIdentifier	 dgd X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preGradStepsF	TokenNameIdentifier	 pre Grad Steps F
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
dgdX	TokenNameIdentifier	 dgd X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preVal	TokenNameIdentifier	 pre Val
=	TokenNameEQUAL	
gradientOverflow	TokenNameIdentifier	 gradient Overflow
;	TokenNameSEMICOLON	
postVal	TokenNameIdentifier	 post Val
=	TokenNameEQUAL	
gradientUnderflow	TokenNameIdentifier	 gradient Underflow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gradStepsF	TokenNameIdentifier	 grad Steps F
>	TokenNameGREATER	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
gradSteps	TokenNameIdentifier	 grad Steps
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
else	TokenNameelse	
gradSteps	TokenNameIdentifier	 grad Steps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
gradStepsF	TokenNameIdentifier	 grad Steps F
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
preGradStepsF	TokenNameIdentifier	 pre Grad Steps F
>	TokenNameGREATER	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
else	TokenNameelse	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
preGradStepsF	TokenNameIdentifier	 pre Grad Steps F
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
gradLimit	TokenNameIdentifier	 grad Limit
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
gradSteps	TokenNameIdentifier	 grad Steps
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
preGradLimit	TokenNameIdentifier	 pre Grad Limit
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
preGradLimit	TokenNameIdentifier	 pre Grad Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
preVal	TokenNameIdentifier	 pre Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
g	TokenNameIdentifier	 g
+=	TokenNamePLUS_EQUAL	
dgdX	TokenNameIdentifier	 dgd X
*	TokenNameMULTIPLY	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dgdX	TokenNameIdentifier	 dgd X
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Could be a binary search... 	TokenNameCOMMENT_LINE	Could be a binary search... 
int	TokenNameint	
gradIdx	TokenNameIdentifier	 grad Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
gradIdx	TokenNameIdentifier	 grad Idx
<	TokenNameLESS	
gradientsLength	TokenNameIdentifier	 gradients Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
<	TokenNameLESS	
fractions	TokenNameIdentifier	 fractions
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
gradIdx	TokenNameIdentifier	 grad Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
gradLimit	TokenNameIdentifier	 grad Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
-	TokenNameMINUS	
fractions	TokenNameIdentifier	 fractions
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grad	TokenNameIdentifier	 grad
=	TokenNameEQUAL	
gradients	TokenNameIdentifier	 gradients
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
stepsD	TokenNameIdentifier	 steps D
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fractions	TokenNameIdentifier	 fractions
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
dgdX	TokenNameIdentifier	 dgd X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
steps	TokenNameIdentifier	 steps
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stepsD	TokenNameIdentifier	 steps D
>	TokenNameGREATER	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
steps	TokenNameIdentifier	 steps
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
else	TokenNameelse	
steps	TokenNameIdentifier	 steps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
stepsD	TokenNameIdentifier	 steps D
;	TokenNameSEMICOLON	
int	TokenNameint	
subGradLimit	TokenNameIdentifier	 sub Grad Limit
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
steps	TokenNameIdentifier	 steps
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subGradLimit	TokenNameIdentifier	 sub Grad Limit
>	TokenNameGREATER	
gradLimit	TokenNameIdentifier	 grad Limit
)	TokenNameRPAREN	
subGradLimit	TokenNameIdentifier	 sub Grad Limit
=	TokenNameEQUAL	
gradLimit	TokenNameIdentifier	 grad Limit
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
*	TokenNameMULTIPLY	
GRADIENT_SIZE_INDEX	TokenNameIdentifier	 GRADIENT  SIZE  INDEX
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
normalizedIntervals	TokenNameIdentifier	 normalized Intervals
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dgdX	TokenNameIdentifier	 dgd X
*	TokenNameMULTIPLY	
GRADIENT_SIZE_INDEX	TokenNameIdentifier	 GRADIENT  SIZE  INDEX
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
normalizedIntervals	TokenNameIdentifier	 normalized Intervals
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
subGradLimit	TokenNameIdentifier	 sub Grad Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
grad	TokenNameIdentifier	 grad
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
+=	TokenNamePLUS_EQUAL	
step	TokenNameIdentifier	 step
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
g	TokenNameIdentifier	 g
+=	TokenNamePLUS_EQUAL	
dgdX	TokenNameIdentifier	 dgd X
*	TokenNameMULTIPLY	
stepsD	TokenNameIdentifier	 steps D
;	TokenNameSEMICOLON	
gradIdx	TokenNameIdentifier	 grad Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Could be a binary search... 	TokenNameCOMMENT_LINE	Could be a binary search... 
int	TokenNameint	
gradIdx	TokenNameIdentifier	 grad Idx
=	TokenNameEQUAL	
gradientsLength	TokenNameIdentifier	 gradients Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
gradIdx	TokenNameIdentifier	 grad Idx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
>	TokenNameGREATER	
fractions	TokenNameIdentifier	 fractions
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
gradIdx	TokenNameIdentifier	 grad Idx
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
gradLimit	TokenNameIdentifier	 grad Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
-	TokenNameMINUS	
fractions	TokenNameIdentifier	 fractions
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grad	TokenNameIdentifier	 grad
=	TokenNameEQUAL	
gradients	TokenNameIdentifier	 gradients
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
stepsD	TokenNameIdentifier	 steps D
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
/	TokenNameDIVIDE	
-	TokenNameMINUS	
dgdX	TokenNameIdentifier	 dgd X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
steps	TokenNameIdentifier	 steps
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stepsD	TokenNameIdentifier	 steps D
>	TokenNameGREATER	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
steps	TokenNameIdentifier	 steps
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
else	TokenNameelse	
steps	TokenNameIdentifier	 steps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
stepsD	TokenNameIdentifier	 steps D
;	TokenNameSEMICOLON	
int	TokenNameint	
subGradLimit	TokenNameIdentifier	 sub Grad Limit
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
steps	TokenNameIdentifier	 steps
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subGradLimit	TokenNameIdentifier	 sub Grad Limit
>	TokenNameGREATER	
gradLimit	TokenNameIdentifier	 grad Limit
)	TokenNameRPAREN	
subGradLimit	TokenNameIdentifier	 sub Grad Limit
=	TokenNameEQUAL	
gradLimit	TokenNameIdentifier	 grad Limit
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
*	TokenNameMULTIPLY	
GRADIENT_SIZE_INDEX	TokenNameIdentifier	 GRADIENT  SIZE  INDEX
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
normalizedIntervals	TokenNameIdentifier	 normalized Intervals
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dgdX	TokenNameIdentifier	 dgd X
*	TokenNameMULTIPLY	
GRADIENT_SIZE_INDEX	TokenNameIdentifier	 GRADIENT  SIZE  INDEX
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
normalizedIntervals	TokenNameIdentifier	 normalized Intervals
[	TokenNameLBRACKET	
gradIdx	TokenNameIdentifier	 grad Idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
subGradLimit	TokenNameIdentifier	 sub Grad Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
grad	TokenNameIdentifier	 grad
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
+=	TokenNamePLUS_EQUAL	
step	TokenNameIdentifier	 step
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
g	TokenNameIdentifier	 g
+=	TokenNamePLUS_EQUAL	
dgdX	TokenNameIdentifier	 dgd X
*	TokenNameMULTIPLY	
stepsD	TokenNameIdentifier	 steps D
;	TokenNameSEMICOLON	
gradIdx	TokenNameIdentifier	 grad Idx
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
rowLimit	TokenNameIdentifier	 row Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
postVal	TokenNameIdentifier	 post Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
adjust	TokenNameIdentifier	 adjust
;	TokenNameSEMICOLON	
//change in off from row to row 	TokenNameCOMMENT_LINE	change in off from row to row 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
fillSimpleNoCycle	TokenNameIdentifier	 fill Simple No Cycle
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
//constant which can be pulled out of the inner loop 	TokenNameCOMMENT_LINE	constant which can be pulled out of the inner loop 
final	TokenNamefinal	
float	TokenNamefloat	
initConst	TokenNameIdentifier	 init Const
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dgdX	TokenNameIdentifier	 dgd X
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
gc	TokenNameIdentifier	 gc
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
dgdX	TokenNameIdentifier	 dgd X
*	TokenNameMULTIPLY	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
fpStep	TokenNameIdentifier	 fp Step
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
step	TokenNameIdentifier	 step
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fix point step 	TokenNameCOMMENT_LINE	fix point step 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grad	TokenNameIdentifier	 grad
=	TokenNameEQUAL	
gradient	TokenNameIdentifier	 gradient
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
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//for every row 	TokenNameCOMMENT_LINE	for every row 
//initialize current value to be start. 	TokenNameCOMMENT_LINE	initialize current value to be start. 
float	TokenNamefloat	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
initConst	TokenNameIdentifier	 init Const
+	TokenNamePLUS	
dgdY	TokenNameIdentifier	 dgd Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
*=	TokenNameMULTIPLY_EQUAL	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
+=	TokenNamePLUS_EQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// rounding factor... 	TokenNameCOMMENT_LINE	rounding factor... 
final	TokenNamefinal	
int	TokenNameint	
rowLimit	TokenNameIdentifier	 row Limit
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
// end of row iteration 	TokenNameCOMMENT_LINE	end of row iteration 
float	TokenNamefloat	
check	TokenNameIdentifier	 check
=	TokenNameEQUAL	
dgdX	TokenNameIdentifier	 dgd X
*	TokenNameMULTIPLY	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
*	TokenNameMULTIPLY	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
check	TokenNameIdentifier	 check
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
check	TokenNameIdentifier	 check
=	TokenNameEQUAL	
-	TokenNameMINUS	
check	TokenNameIdentifier	 check
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
check	TokenNameIdentifier	 check
<	TokenNameLESS	
.3	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("In fillSimpleNC: " + g); 	TokenNameCOMMENT_LINE	System.out.println("In fillSimpleNC: " + g); 
final	TokenNamefinal	
int	TokenNameint	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
gradientUnderflow	TokenNameIdentifier	 gradient Underflow
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
>=	TokenNameGREATER_EQUAL	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
gradientOverflow	TokenNameIdentifier	 gradient Overflow
;	TokenNameSEMICOLON	
else	TokenNameelse	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
grad	TokenNameIdentifier	 grad
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
g	TokenNameIdentifier	 g
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
rowLimit	TokenNameIdentifier	 row Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// System.out.println("In fillSimpleNC2: " + g); 	TokenNameCOMMENT_LINE	System.out.println("In fillSimpleNC2: " + g); 
int	TokenNameint	
gradSteps	TokenNameIdentifier	 grad Steps
;	TokenNameSEMICOLON	
int	TokenNameint	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
preVal	TokenNameIdentifier	 pre Val
,	TokenNameCOMMA	
postVal	TokenNameIdentifier	 post Val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dgdX	TokenNameIdentifier	 dgd X
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gradSteps	TokenNameIdentifier	 grad Steps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
-	TokenNameMINUS	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
step	TokenNameIdentifier	 step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
-	TokenNameMINUS	
g	TokenNameIdentifier	 g
/	TokenNameDIVIDE	
step	TokenNameIdentifier	 step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preVal	TokenNameIdentifier	 pre Val
=	TokenNameEQUAL	
gradientUnderflow	TokenNameIdentifier	 gradient Underflow
;	TokenNameSEMICOLON	
postVal	TokenNameIdentifier	 post Val
=	TokenNameEQUAL	
gradientOverflow	TokenNameIdentifier	 gradient Overflow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// dgdX < 0 	TokenNameCOMMENT_LINE	dgdX < 0 
gradSteps	TokenNameIdentifier	 grad Steps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
-	TokenNameMINUS	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
step	TokenNameIdentifier	 step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
-	TokenNameMINUS	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
step	TokenNameIdentifier	 step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preVal	TokenNameIdentifier	 pre Val
=	TokenNameEQUAL	
gradientOverflow	TokenNameIdentifier	 gradient Overflow
;	TokenNameSEMICOLON	
postVal	TokenNameIdentifier	 post Val
=	TokenNameEQUAL	
gradientUnderflow	TokenNameIdentifier	 gradient Underflow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gradSteps	TokenNameIdentifier	 grad Steps
>	TokenNameGREATER	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
gradSteps	TokenNameIdentifier	 grad Steps
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
gradLimit	TokenNameIdentifier	 grad Limit
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
gradSteps	TokenNameIdentifier	 grad Steps
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
>	TokenNameGREATER	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
preGradLimit	TokenNameIdentifier	 pre Grad Limit
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
preGradLimit	TokenNameIdentifier	 pre Grad Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
preVal	TokenNameIdentifier	 pre Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
g	TokenNameIdentifier	 g
+=	TokenNamePLUS_EQUAL	
step	TokenNameIdentifier	 step
*	TokenNameMULTIPLY	
preGradSteps	TokenNameIdentifier	 pre Grad Steps
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
fpG	TokenNameIdentifier	 fp G
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
gradLimit	TokenNameIdentifier	 grad Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
grad	TokenNameIdentifier	 grad
[	TokenNameLBRACKET	
fpG	TokenNameIdentifier	 fp G
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fpG	TokenNameIdentifier	 fp G
+=	TokenNamePLUS_EQUAL	
fpStep	TokenNameIdentifier	 fp Step
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
rowLimit	TokenNameIdentifier	 row Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
postVal	TokenNameIdentifier	 post Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
adjust	TokenNameIdentifier	 adjust
;	TokenNameSEMICOLON	
//change in off from row to row 	TokenNameCOMMENT_LINE	change in off from row to row 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
fillSimpleRepeat	TokenNameIdentifier	 fill Simple Repeat
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
final	TokenNamefinal	
float	TokenNamefloat	
initConst	TokenNameIdentifier	 init Const
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dgdX	TokenNameIdentifier	 dgd X
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
gc	TokenNameIdentifier	 gc
;	TokenNameSEMICOLON	
// Limit step to fractional part of 	TokenNameCOMMENT_LINE	Limit step to fractional part of 
// fastGradientArraySize (the non fractional part has 	TokenNameCOMMENT_LINE	fastGradientArraySize (the non fractional part has 
// no affect anyways, and would mess up lots of stuff 	TokenNameCOMMENT_LINE	no affect anyways, and would mess up lots of stuff 
// below). 	TokenNameCOMMENT_LINE	below). 
float	TokenNamefloat	
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dgdX	TokenNameIdentifier	 dgd X
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
dgdX	TokenNameIdentifier	 dgd X
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
;	TokenNameSEMICOLON	
// Make it a Positive step (a small negative step is 	TokenNameCOMMENT_LINE	Make it a Positive step (a small negative step is 
// the same as a positive step slightly less than 	TokenNameCOMMENT_LINE	the same as a positive step slightly less than 
// fastGradientArraySize. 	TokenNameCOMMENT_LINE	fastGradientArraySize. 
if	TokenNameif	
(	TokenNameLPAREN	
step	TokenNameIdentifier	 step
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
step	TokenNameIdentifier	 step
+=	TokenNamePLUS_EQUAL	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grad	TokenNameIdentifier	 grad
=	TokenNameEQUAL	
gradient	TokenNameIdentifier	 gradient
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
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//for every row 	TokenNameCOMMENT_LINE	for every row 
//initialize current value to be start. 	TokenNameCOMMENT_LINE	initialize current value to be start. 
float	TokenNamefloat	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
initConst	TokenNameIdentifier	 init Const
+	TokenNamePLUS	
dgdY	TokenNameIdentifier	 dgd Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now Limited between -1 and 1. 	TokenNameCOMMENT_LINE	now Limited between -1 and 1. 
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
// put in the positive side. 	TokenNameCOMMENT_LINE	put in the positive side. 
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
g	TokenNameIdentifier	 g
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// scale for gradient array... 	TokenNameCOMMENT_LINE	scale for gradient array... 
g	TokenNameIdentifier	 g
*=	TokenNameMULTIPLY_EQUAL	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
+=	TokenNamePLUS_EQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// rounding factor 	TokenNameCOMMENT_LINE	rounding factor 
final	TokenNamefinal	
int	TokenNameint	
rowLimit	TokenNameIdentifier	 row Limit
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
// end of row iteration 	TokenNameCOMMENT_LINE	end of row iteration 
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
rowLimit	TokenNameIdentifier	 row Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g	TokenNameIdentifier	 g
-=	TokenNameMINUS_EQUAL	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
-=	TokenNameMINUS_EQUAL	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
grad	TokenNameIdentifier	 grad
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
+=	TokenNamePLUS_EQUAL	
step	TokenNameIdentifier	 step
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
adjust	TokenNameIdentifier	 adjust
;	TokenNameSEMICOLON	
//change in off from row to row 	TokenNameCOMMENT_LINE	change in off from row to row 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
fillSimpleReflect	TokenNameIdentifier	 fill Simple Reflect
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
final	TokenNamefinal	
float	TokenNamefloat	
initConst	TokenNameIdentifier	 init Const
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dgdX	TokenNameIdentifier	 dgd X
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
gc	TokenNameIdentifier	 gc
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grad	TokenNameIdentifier	 grad
=	TokenNameEQUAL	
gradient	TokenNameIdentifier	 gradient
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
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//for every row 	TokenNameCOMMENT_LINE	for every row 
//initialize current value to be start. 	TokenNameCOMMENT_LINE	initialize current value to be start. 
float	TokenNamefloat	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
initConst	TokenNameIdentifier	 init Const
+	TokenNamePLUS	
dgdY	TokenNameIdentifier	 dgd Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now limited g to -2<->2 	TokenNameCOMMENT_LINE	now limited g to -2<->2 
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
/	TokenNameDIVIDE	
2.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
dgdX	TokenNameIdentifier	 dgd X
;	TokenNameSEMICOLON	
// Pull it into the positive half 	TokenNameCOMMENT_LINE	Pull it into the positive half 
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
-	TokenNameMINUS	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
//take absolute value 	TokenNameCOMMENT_LINE	take absolute value 
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
-	TokenNameMINUS	
step	TokenNameIdentifier	 step
;	TokenNameSEMICOLON	
// Change direction.. 	TokenNameCOMMENT_LINE	Change direction.. 
}	TokenNameRBRACE	
// Now do the same for dgdX. This is safe because 	TokenNameCOMMENT_LINE	Now do the same for dgdX. This is safe because 
// any step that is a multiple of 2.0 has no 	TokenNameCOMMENT_LINE	any step that is a multiple of 2.0 has no 
// affect, hence we can remove it which the first 	TokenNameCOMMENT_LINE	affect, hence we can remove it which the first 
// part does. The second part simply adds 2.0 	TokenNameCOMMENT_LINE	part does. The second part simply adds 2.0 
// (which has no affect due to the cylcle) to move 	TokenNameCOMMENT_LINE	(which has no affect due to the cylcle) to move 
// all negative step values into the positive 	TokenNameCOMMENT_LINE	all negative step values into the positive 
// side. 	TokenNameCOMMENT_LINE	side. 
step	TokenNameIdentifier	 step
=	TokenNameEQUAL	
step	TokenNameIdentifier	 step
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
step	TokenNameIdentifier	 step
/	TokenNameDIVIDE	
2.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
step	TokenNameIdentifier	 step
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
step	TokenNameIdentifier	 step
+=	TokenNamePLUS_EQUAL	
2.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
reflectMax	TokenNameIdentifier	 reflect Max
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
;	TokenNameSEMICOLON	
// Scale for gradient array. 	TokenNameCOMMENT_LINE	Scale for gradient array. 
g	TokenNameIdentifier	 g
*=	TokenNameMULTIPLY_EQUAL	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
+=	TokenNamePLUS_EQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
step	TokenNameIdentifier	 step
*=	TokenNameMULTIPLY_EQUAL	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
rowLimit	TokenNameIdentifier	 row Limit
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
// end of row iteration 	TokenNameCOMMENT_LINE	end of row iteration 
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
rowLimit	TokenNameIdentifier	 row Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
reflectMax	TokenNameIdentifier	 reflect Max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g	TokenNameIdentifier	 g
-=	TokenNameMINUS_EQUAL	
reflectMax	TokenNameIdentifier	 reflect Max
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
-=	TokenNameMINUS_EQUAL	
reflectMax	TokenNameIdentifier	 reflect Max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<=	TokenNameLESS_EQUAL	
fastGradientArraySize	TokenNameIdentifier	 fast Gradient Array Size
)	TokenNameRPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
grad	TokenNameIdentifier	 grad
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
grad	TokenNameIdentifier	 grad
[	TokenNameLBRACKET	
reflectMax	TokenNameIdentifier	 reflect Max
-	TokenNameMINUS	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
+=	TokenNamePLUS_EQUAL	
step	TokenNameIdentifier	 step
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
adjust	TokenNameIdentifier	 adjust
;	TokenNameSEMICOLON	
//change in off from row to row 	TokenNameCOMMENT_LINE	change in off from row to row 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return a Raster containing the colors generated for the graphics * operation. This is where the area is filled with colors distributed * linearly. * * @param x The x coordinate of the area in device space for which colors * are generated. * @param y The y coordinate of the area in device space for which colors * are generated. * @param w The width of the area in device space for which colors * are generated. * @param h The height of the area in device space for which colors * are generated. */	TokenNameCOMMENT_JAVADOC	 Return a Raster containing the colors generated for the graphics operation. This is where the area is filled with colors distributed linearly. * @param x The x coordinate of the area in device space for which colors are generated. @param y The y coordinate of the area in device space for which colors are generated. @param w The width of the area in device space for which colors are generated. @param h The height of the area in device space for which colors are generated. 
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
//constant which can be pulled out of the inner loop 	TokenNameCOMMENT_LINE	constant which can be pulled out of the inner loop 
final	TokenNamefinal	
float	TokenNamefloat	
initConst	TokenNameIdentifier	 init Const
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dgdX	TokenNameIdentifier	 dgd X
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
gc	TokenNameIdentifier	 gc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fillMethod	TokenNameIdentifier	 fill Method
==	TokenNameEQUAL_EQUAL	
ANTI_ALIAS_IMPL	TokenNameIdentifier	 ANTI  ALIAS  IMPL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//initialize current value to be start. 	TokenNameCOMMENT_LINE	initialize current value to be start. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//for every row 	TokenNameCOMMENT_LINE	for every row 
float	TokenNamefloat	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
initConst	TokenNameIdentifier	 init Const
+	TokenNamePLUS	
dgdY	TokenNameIdentifier	 dgd Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
rowLimit	TokenNameIdentifier	 row Limit
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
// end of row iteration 	TokenNameCOMMENT_LINE	end of row iteration 
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
rowLimit	TokenNameIdentifier	 row Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//for every pixel in this row. 	TokenNameCOMMENT_LINE	for every pixel in this row. 
//get the color 	TokenNameCOMMENT_LINE	get the color 
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
indexGradientAntiAlias	TokenNameIdentifier	 index Gradient Anti Alias
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
pixSz	TokenNameIdentifier	 pix Sz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
+=	TokenNamePLUS_EQUAL	
dgdX	TokenNameIdentifier	 dgd X
;	TokenNameSEMICOLON	
//incremental change in g 	TokenNameCOMMENT_LINE	incremental change in g 
}	TokenNameRBRACE	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
adjust	TokenNameIdentifier	 adjust
;	TokenNameSEMICOLON	
//change in off from row to row 	TokenNameCOMMENT_LINE	change in off from row to row 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSimpleLookup	TokenNameIdentifier	 is Simple Lookup
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cycleMethod	TokenNameIdentifier	 cycle Method
==	TokenNameEQUAL_EQUAL	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
NO_CYCLE	TokenNameIdentifier	 NO  CYCLE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fillHardNoCycle	TokenNameIdentifier	 fill Hard No Cycle
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
else	TokenNameelse	
{	TokenNameLBRACE	
//initialize current value to be start. 	TokenNameCOMMENT_LINE	initialize current value to be start. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//for every row 	TokenNameCOMMENT_LINE	for every row 
float	TokenNamefloat	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
initConst	TokenNameIdentifier	 init Const
+	TokenNamePLUS	
dgdY	TokenNameIdentifier	 dgd Y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
rowLimit	TokenNameIdentifier	 row Limit
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
// end of row iteration 	TokenNameCOMMENT_LINE	end of row iteration 
while	TokenNamewhile	
(	TokenNameLPAREN	
off	TokenNameIdentifier	 off
<	TokenNameLESS	
rowLimit	TokenNameIdentifier	 row Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//for every pixel in this row. 	TokenNameCOMMENT_LINE	for every pixel in this row. 
//get the color 	TokenNameCOMMENT_LINE	get the color 
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
indexIntoGradientsArrays	TokenNameIdentifier	 index Into Gradients Arrays
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
+=	TokenNamePLUS_EQUAL	
dgdX	TokenNameIdentifier	 dgd X
;	TokenNameSEMICOLON	
//incremental change in g 	TokenNameCOMMENT_LINE	incremental change in g 
}	TokenNameRBRACE	
off	TokenNameIdentifier	 off
+=	TokenNamePLUS_EQUAL	
adjust	TokenNameIdentifier	 adjust
;	TokenNameSEMICOLON	
//change in off from row to row 	TokenNameCOMMENT_LINE	change in off from row to row 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Simple implementations: just scale index by array size 	TokenNameCOMMENT_LINE	Simple implementations: just scale index by array size 
if	TokenNameif	
(	TokenNameLPAREN	
cycleMethod	TokenNameIdentifier	 cycle Method
==	TokenNameEQUAL_EQUAL	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
NO_CYCLE	TokenNameIdentifier	 NO  CYCLE
)	TokenNameRPAREN	
fillSimpleNoCycle	TokenNameIdentifier	 fill Simple No Cycle
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
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cycleMethod	TokenNameIdentifier	 cycle Method
==	TokenNameEQUAL_EQUAL	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
.	TokenNameDOT	
REPEAT	TokenNameIdentifier	 REPEAT
)	TokenNameRPAREN	
fillSimpleRepeat	TokenNameIdentifier	 fill Simple Repeat
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
else	TokenNameelse	
//cycleMethod == MultipleGradientPaint.REFLECT 	TokenNameCOMMENT_LINE	cycleMethod == MultipleGradientPaint.REFLECT 
fillSimpleReflect	TokenNameIdentifier	 fill Simple Reflect
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
}	TokenNameRBRACE	
