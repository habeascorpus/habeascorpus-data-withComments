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
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
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
Arc2D	TokenNameIdentifier	 Arc2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
GeneralPath	TokenNameIdentifier	 General Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
PathIterator	TokenNameIdentifier	 Path Iterator
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * The <code>ExtendedGeneralPath</code> class represents a geometric * path constructed from straight lines, quadratic and cubic (Bezier) * curves and elliptical arc. This class delegates lines and curves to * an enclosed <code>GeneralPath</code>. Elliptical arc is implemented * using an <code>Arc2D</code> in float precision. * * <p><b>Warning</b> : An elliptical arc may be composed of several * path segments. For futher details, see the SVG Appendix&nbsp;F.6 * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: ExtendedGeneralPath.java 594018 2007-11-12 04:17:41Z cam $ */	TokenNameCOMMENT_JAVADOC	 The <code>ExtendedGeneralPath</code> class represents a geometric path constructed from straight lines, quadratic and cubic (Bezier) curves and elliptical arc. This class delegates lines and curves to an enclosed <code>GeneralPath</code>. Elliptical arc is implemented using an <code>Arc2D</code> in float precision. * <p><b>Warning</b> : An elliptical arc may be composed of several path segments. For futher details, see the SVG Appendix&nbsp;F.6 * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: ExtendedGeneralPath.java 594018 2007-11-12 04:17:41Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
implements	TokenNameimplements	
ExtendedShape	TokenNameIdentifier	 Extended Shape
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** The enclosed general path. */	TokenNameCOMMENT_JAVADOC	 The enclosed general path. 
protected	TokenNameprotected	
GeneralPath	TokenNameIdentifier	 General Path
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
int	TokenNameint	
numVals	TokenNameIdentifier	 num Vals
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
numSeg	TokenNameIdentifier	 num Seg
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
mx	TokenNameIdentifier	 mx
,	TokenNameCOMMA	
my	TokenNameIdentifier	 my
,	TokenNameCOMMA	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
cy	TokenNameIdentifier	 cy
;	TokenNameSEMICOLON	
/** * Constructs a new <code>ExtendedGeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new <code>ExtendedGeneralPath</code>. 
public	TokenNamepublic	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <code>ExtendedGeneralPath</code> with the * specified winding rule to control operations that require the * interior of the path to be defined. */	TokenNameCOMMENT_JAVADOC	 Constructs a new <code>ExtendedGeneralPath</code> with the specified winding rule to control operations that require the interior of the path to be defined. 
public	TokenNamepublic	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
(	TokenNameLPAREN	
int	TokenNameint	
rule	TokenNameIdentifier	 rule
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
rule	TokenNameIdentifier	 rule
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <code>ExtendedGeneralPath</code> object with * the specified winding rule and the specified initial capacity * to store path coordinates. */	TokenNameCOMMENT_JAVADOC	 Constructs a new <code>ExtendedGeneralPath</code> object with the specified winding rule and the specified initial capacity to store path coordinates. 
public	TokenNamepublic	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
(	TokenNameLPAREN	
int	TokenNameint	
rule	TokenNameIdentifier	 rule
,	TokenNameCOMMA	
int	TokenNameint	
initialCapacity	TokenNameIdentifier	 initial Capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
rule	TokenNameIdentifier	 rule
,	TokenNameCOMMA	
initialCapacity	TokenNameIdentifier	 initial Capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <code>ExtendedGeneralPath</code> object from * an arbitrary <code>Shape</code> object. */	TokenNameCOMMENT_JAVADOC	 Constructs a new <code>ExtendedGeneralPath</code> object from an arbitrary <code>Shape</code> object. 
public	TokenNamepublic	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds an elliptical arc, defined by two radii, an angle from the * x-axis, a flag to choose the large arc or not, a flag to * indicate if we increase or decrease the angles and the final * point of the arc. * * @param rx the x radius of the ellipse * @param ry the y radius of the ellipse * * @param angle the angle from the x-axis of the current * coordinate system to the x-axis of the ellipse in degrees. * * @param largeArcFlag the large arc flag. If true the arc * spanning less than or equal to 180 degrees is chosen, otherwise * the arc spanning greater than 180 degrees is chosen * * @param sweepFlag the sweep flag. If true the line joining * center to arc sweeps through decreasing angles otherwise it * sweeps through increasing angles * * @param x the absolute x coordinate of the final point of the arc. * @param y the absolute y coordinate of the final point of the arc. */	TokenNameCOMMENT_JAVADOC	 Adds an elliptical arc, defined by two radii, an angle from the x-axis, a flag to choose the large arc or not, a flag to indicate if we increase or decrease the angles and the final point of the arc. * @param rx the x radius of the ellipse @param ry the y radius of the ellipse * @param angle the angle from the x-axis of the current coordinate system to the x-axis of the ellipse in degrees. * @param largeArcFlag the large arc flag. If true the arc spanning less than or equal to 180 degrees is chosen, otherwise the arc spanning greater than 180 degrees is chosen * @param sweepFlag the sweep flag. If true the line joining center to arc sweeps through decreasing angles otherwise it sweeps through increasing angles * @param x the absolute x coordinate of the final point of the arc. @param y the absolute y coordinate of the final point of the arc. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
arcTo	TokenNameIdentifier	 arc To
(	TokenNameLPAREN	
float	TokenNamefloat	
rx	TokenNameIdentifier	 rx
,	TokenNameCOMMA	
float	TokenNamefloat	
ry	TokenNameIdentifier	 ry
,	TokenNameCOMMA	
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
,	TokenNameCOMMA	
boolean	TokenNameboolean	
largeArcFlag	TokenNameIdentifier	 large Arc Flag
,	TokenNameCOMMA	
boolean	TokenNameboolean	
sweepFlag	TokenNameIdentifier	 sweep Flag
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ensure radii are valid 	TokenNameCOMMENT_LINE	Ensure radii are valid 
if	TokenNameif	
(	TokenNameLPAREN	
rx	TokenNameIdentifier	 rx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ry	TokenNameIdentifier	 ry
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkMoveTo	TokenNameIdentifier	 check Move To
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check if prev command was moveto 	TokenNameCOMMENT_LINE	check if prev command was moveto 
// Get the current (x, y) coordinates of the path 	TokenNameCOMMENT_LINE	Get the current (x, y) coordinates of the path 
double	TokenNamedouble	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
cx	TokenNameIdentifier	 cx
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
cy	TokenNameIdentifier	 cy
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
==	TokenNameEQUAL_EQUAL	
x	TokenNameIdentifier	 x
&&	TokenNameAND_AND	
y0	TokenNameIdentifier	 y0
==	TokenNameEQUAL_EQUAL	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the endpoints (x, y) and (x0, y0) are identical, then this 	TokenNameCOMMENT_LINE	If the endpoints (x, y) and (x0, y0) are identical, then this 
// is equivalent to omitting the elliptical arc segment entirely. 	TokenNameCOMMENT_LINE	is equivalent to omitting the elliptical arc segment entirely. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Arc2D	TokenNameIdentifier	 Arc2 D
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
computeArc	TokenNameIdentifier	 compute Arc
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
,	TokenNameCOMMA	
rx	TokenNameIdentifier	 rx
,	TokenNameCOMMA	
ry	TokenNameIdentifier	 ry
,	TokenNameCOMMA	
angle	TokenNameIdentifier	 angle
,	TokenNameCOMMA	
largeArcFlag	TokenNameIdentifier	 large Arc Flag
,	TokenNameCOMMA	
sweepFlag	TokenNameIdentifier	 sweep Flag
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getRotateInstance	TokenNameIdentifier	 get Rotate Instance
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
getCenterX	TokenNameIdentifier	 get Center X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
getCenterY	TokenNameIdentifier	 get Center Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
makeRoom	TokenNameIdentifier	 make Room
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
numSeg	TokenNameIdentifier	 num Seg
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
.	TokenNameDOT	
SEG_ARCTO	TokenNameIdentifier	 SEG  ARCTO
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rx	TokenNameIdentifier	 rx
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ry	TokenNameIdentifier	 ry
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
angle	TokenNameIdentifier	 angle
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
largeArcFlag	TokenNameIdentifier	 large Arc Flag
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sweepFlag	TokenNameIdentifier	 sweep Flag
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
cy	TokenNameIdentifier	 cy
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This constructs an unrotated Arc2D from the SVG specification of an * Elliptical arc. To get the final arc you need to apply a rotation * transform such as: * * AffineTransform.getRotateInstance * (angle, arc.getX()+arc.getWidth()/2, arc.getY()+arc.getHeight()/2); */	TokenNameCOMMENT_JAVADOC	 This constructs an unrotated Arc2D from the SVG specification of an Elliptical arc. To get the final arc you need to apply a rotation transform such as: * AffineTransform.getRotateInstance (angle, arc.getX()+arc.getWidth()/2, arc.getY()+arc.getHeight()/2); 
public	TokenNamepublic	
static	TokenNamestatic	
Arc2D	TokenNameIdentifier	 Arc2 D
computeArc	TokenNameIdentifier	 compute Arc
(	TokenNameLPAREN	
double	TokenNamedouble	
x0	TokenNameIdentifier	 x0
,	TokenNameCOMMA	
double	TokenNamedouble	
y0	TokenNameIdentifier	 y0
,	TokenNameCOMMA	
double	TokenNamedouble	
rx	TokenNameIdentifier	 rx
,	TokenNameCOMMA	
double	TokenNamedouble	
ry	TokenNameIdentifier	 ry
,	TokenNameCOMMA	
double	TokenNamedouble	
angle	TokenNameIdentifier	 angle
,	TokenNameCOMMA	
boolean	TokenNameboolean	
largeArcFlag	TokenNameIdentifier	 large Arc Flag
,	TokenNameCOMMA	
boolean	TokenNameboolean	
sweepFlag	TokenNameIdentifier	 sweep Flag
,	TokenNameCOMMA	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Elliptical arc implementation based on the SVG specification notes 	TokenNameCOMMENT_LINE	Elliptical arc implementation based on the SVG specification notes 
// 	TokenNameCOMMENT_LINE	 
// Compute the half distance between the current and the final point 	TokenNameCOMMENT_LINE	Compute the half distance between the current and the final point 
double	TokenNamedouble	
dx2	TokenNameIdentifier	 dx2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dy2	TokenNameIdentifier	 dy2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
y0	TokenNameIdentifier	 y0
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// Convert angle from degrees to radians 	TokenNameCOMMENT_LINE	Convert angle from degrees to radians 
angle	TokenNameIdentifier	 angle
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
%	TokenNameREMAINDER	
360.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cosAngle	TokenNameIdentifier	 cos Angle
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sinAngle	TokenNameIdentifier	 sin Angle
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Step 1 : Compute (x1, y1) 	TokenNameCOMMENT_LINE	Step 1 : Compute (x1, y1) 
// 	TokenNameCOMMENT_LINE	 
double	TokenNamedouble	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
cosAngle	TokenNameIdentifier	 cos Angle
*	TokenNameMULTIPLY	
dx2	TokenNameIdentifier	 dx2
+	TokenNamePLUS	
sinAngle	TokenNameIdentifier	 sin Angle
*	TokenNameMULTIPLY	
dy2	TokenNameIdentifier	 dy2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
-	TokenNameMINUS	
sinAngle	TokenNameIdentifier	 sin Angle
*	TokenNameMULTIPLY	
dx2	TokenNameIdentifier	 dx2
+	TokenNamePLUS	
cosAngle	TokenNameIdentifier	 cos Angle
*	TokenNameMULTIPLY	
dy2	TokenNameIdentifier	 dy2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Ensure radii are large enough 	TokenNameCOMMENT_LINE	Ensure radii are large enough 
rx	TokenNameIdentifier	 rx
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
rx	TokenNameIdentifier	 rx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ry	TokenNameIdentifier	 ry
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
ry	TokenNameIdentifier	 ry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
Prx	TokenNameIdentifier	 Prx
=	TokenNameEQUAL	
rx	TokenNameIdentifier	 rx
*	TokenNameMULTIPLY	
rx	TokenNameIdentifier	 rx
;	TokenNameSEMICOLON	
double	TokenNamedouble	
Pry	TokenNameIdentifier	 Pry
=	TokenNameEQUAL	
ry	TokenNameIdentifier	 ry
*	TokenNameMULTIPLY	
ry	TokenNameIdentifier	 ry
;	TokenNameSEMICOLON	
double	TokenNamedouble	
Px1	TokenNameIdentifier	 Px1
=	TokenNameEQUAL	
x1	TokenNameIdentifier	 x1
*	TokenNameMULTIPLY	
x1	TokenNameIdentifier	 x1
;	TokenNameSEMICOLON	
double	TokenNamedouble	
Py1	TokenNameIdentifier	 Py1
=	TokenNameEQUAL	
y1	TokenNameIdentifier	 y1
*	TokenNameMULTIPLY	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
// check that radii are large enough 	TokenNameCOMMENT_LINE	check that radii are large enough 
double	TokenNamedouble	
radiiCheck	TokenNameIdentifier	 radii Check
=	TokenNameEQUAL	
Px1	TokenNameIdentifier	 Px1
/	TokenNameDIVIDE	
Prx	TokenNameIdentifier	 Prx
+	TokenNamePLUS	
Py1	TokenNameIdentifier	 Py1
/	TokenNameDIVIDE	
Pry	TokenNameIdentifier	 Pry
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
radiiCheck	TokenNameIdentifier	 radii Check
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rx	TokenNameIdentifier	 rx
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
radiiCheck	TokenNameIdentifier	 radii Check
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
rx	TokenNameIdentifier	 rx
;	TokenNameSEMICOLON	
ry	TokenNameIdentifier	 ry
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
radiiCheck	TokenNameIdentifier	 radii Check
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ry	TokenNameIdentifier	 ry
;	TokenNameSEMICOLON	
Prx	TokenNameIdentifier	 Prx
=	TokenNameEQUAL	
rx	TokenNameIdentifier	 rx
*	TokenNameMULTIPLY	
rx	TokenNameIdentifier	 rx
;	TokenNameSEMICOLON	
Pry	TokenNameIdentifier	 Pry
=	TokenNameEQUAL	
ry	TokenNameIdentifier	 ry
*	TokenNameMULTIPLY	
ry	TokenNameIdentifier	 ry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Step 2 : Compute (cx1, cy1) 	TokenNameCOMMENT_LINE	Step 2 : Compute (cx1, cy1) 
// 	TokenNameCOMMENT_LINE	 
double	TokenNamedouble	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
(	TokenNameLPAREN	
largeArcFlag	TokenNameIdentifier	 large Arc Flag
==	TokenNameEQUAL_EQUAL	
sweepFlag	TokenNameIdentifier	 sweep Flag
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sq	TokenNameIdentifier	 sq
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Prx	TokenNameIdentifier	 Prx
*	TokenNameMULTIPLY	
Pry	TokenNameIdentifier	 Pry
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
Prx	TokenNameIdentifier	 Prx
*	TokenNameMULTIPLY	
Py1	TokenNameIdentifier	 Py1
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
Pry	TokenNameIdentifier	 Pry
*	TokenNameMULTIPLY	
Px1	TokenNameIdentifier	 Px1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Prx	TokenNameIdentifier	 Prx
*	TokenNameMULTIPLY	
Py1	TokenNameIdentifier	 Py1
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
Pry	TokenNameIdentifier	 Pry
*	TokenNameMULTIPLY	
Px1	TokenNameIdentifier	 Px1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sq	TokenNameIdentifier	 sq
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sq	TokenNameIdentifier	 sq
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
sq	TokenNameIdentifier	 sq
;	TokenNameSEMICOLON	
double	TokenNamedouble	
coef	TokenNameIdentifier	 coef
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
sq	TokenNameIdentifier	 sq
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cx1	TokenNameIdentifier	 cx1
=	TokenNameEQUAL	
coef	TokenNameIdentifier	 coef
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rx	TokenNameIdentifier	 rx
*	TokenNameMULTIPLY	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
ry	TokenNameIdentifier	 ry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cy1	TokenNameIdentifier	 cy1
=	TokenNameEQUAL	
coef	TokenNameIdentifier	 coef
*	TokenNameMULTIPLY	
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ry	TokenNameIdentifier	 ry
*	TokenNameMULTIPLY	
x1	TokenNameIdentifier	 x1
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
rx	TokenNameIdentifier	 rx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Step 3 : Compute (cx, cy) from (cx1, cy1) 	TokenNameCOMMENT_LINE	Step 3 : Compute (cx, cy) from (cx1, cy1) 
// 	TokenNameCOMMENT_LINE	 
double	TokenNamedouble	
sx2	TokenNameIdentifier	 sx2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sy2	TokenNameIdentifier	 sy2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
sx2	TokenNameIdentifier	 sx2
+	TokenNamePLUS	
(	TokenNameLPAREN	
cosAngle	TokenNameIdentifier	 cos Angle
*	TokenNameMULTIPLY	
cx1	TokenNameIdentifier	 cx1
-	TokenNameMINUS	
sinAngle	TokenNameIdentifier	 sin Angle
*	TokenNameMULTIPLY	
cy1	TokenNameIdentifier	 cy1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cy	TokenNameIdentifier	 cy
=	TokenNameEQUAL	
sy2	TokenNameIdentifier	 sy2
+	TokenNamePLUS	
(	TokenNameLPAREN	
sinAngle	TokenNameIdentifier	 sin Angle
*	TokenNameMULTIPLY	
cx1	TokenNameIdentifier	 cx1
+	TokenNamePLUS	
cosAngle	TokenNameIdentifier	 cos Angle
*	TokenNameMULTIPLY	
cy1	TokenNameIdentifier	 cy1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Step 4 : Compute the angleStart (angle1) and the angleExtent (dangle) 	TokenNameCOMMENT_LINE	Step 4 : Compute the angleStart (angle1) and the angleExtent (dangle) 
// 	TokenNameCOMMENT_LINE	 
double	TokenNamedouble	
ux	TokenNameIdentifier	 ux
=	TokenNameEQUAL	
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
-	TokenNameMINUS	
cx1	TokenNameIdentifier	 cx1
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
rx	TokenNameIdentifier	 rx
;	TokenNameSEMICOLON	
double	TokenNamedouble	
uy	TokenNameIdentifier	 uy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
-	TokenNameMINUS	
cy1	TokenNameIdentifier	 cy1
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
ry	TokenNameIdentifier	 ry
;	TokenNameSEMICOLON	
double	TokenNamedouble	
vx	TokenNameIdentifier	 vx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
-	TokenNameMINUS	
x1	TokenNameIdentifier	 x1
-	TokenNameMINUS	
cx1	TokenNameIdentifier	 cx1
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
rx	TokenNameIdentifier	 rx
;	TokenNameSEMICOLON	
double	TokenNamedouble	
vy	TokenNameIdentifier	 vy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
-	TokenNameMINUS	
y1	TokenNameIdentifier	 y1
-	TokenNameMINUS	
cy1	TokenNameIdentifier	 cy1
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
ry	TokenNameIdentifier	 ry
;	TokenNameSEMICOLON	
double	TokenNamedouble	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
// Compute the angle start 	TokenNameCOMMENT_LINE	Compute the angle start 
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ux	TokenNameIdentifier	 ux
*	TokenNameMULTIPLY	
ux	TokenNameIdentifier	 ux
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
uy	TokenNameIdentifier	 uy
*	TokenNameMULTIPLY	
uy	TokenNameIdentifier	 uy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
ux	TokenNameIdentifier	 ux
;	TokenNameSEMICOLON	
// (1 * ux) + (0 * uy) 	TokenNameCOMMENT_LINE	(1 * ux) + (0 * uy) 
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
(	TokenNameLPAREN	
uy	TokenNameIdentifier	 uy
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
:	TokenNameCOLON	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
angleStart	TokenNameIdentifier	 angle Start
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toDegrees	TokenNameIdentifier	 to Degrees
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
acos	TokenNameIdentifier	 acos
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
/	TokenNameDIVIDE	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compute the angle extent 	TokenNameCOMMENT_LINE	Compute the angle extent 
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ux	TokenNameIdentifier	 ux
*	TokenNameMULTIPLY	
ux	TokenNameIdentifier	 ux
+	TokenNamePLUS	
uy	TokenNameIdentifier	 uy
*	TokenNameMULTIPLY	
uy	TokenNameIdentifier	 uy
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
vx	TokenNameIdentifier	 vx
*	TokenNameMULTIPLY	
vx	TokenNameIdentifier	 vx
+	TokenNamePLUS	
vy	TokenNameIdentifier	 vy
*	TokenNameMULTIPLY	
vy	TokenNameIdentifier	 vy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
ux	TokenNameIdentifier	 ux
*	TokenNameMULTIPLY	
vx	TokenNameIdentifier	 vx
+	TokenNamePLUS	
uy	TokenNameIdentifier	 uy
*	TokenNameMULTIPLY	
vy	TokenNameIdentifier	 vy
;	TokenNameSEMICOLON	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ux	TokenNameIdentifier	 ux
*	TokenNameMULTIPLY	
vy	TokenNameIdentifier	 vy
-	TokenNameMINUS	
uy	TokenNameIdentifier	 uy
*	TokenNameMULTIPLY	
vx	TokenNameIdentifier	 vx
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
:	TokenNameCOLON	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
angleExtent	TokenNameIdentifier	 angle Extent
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toDegrees	TokenNameIdentifier	 to Degrees
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
acos	TokenNameIdentifier	 acos
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
/	TokenNameDIVIDE	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sweepFlag	TokenNameIdentifier	 sweep Flag
&&	TokenNameAND_AND	
angleExtent	TokenNameIdentifier	 angle Extent
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
angleExtent	TokenNameIdentifier	 angle Extent
-=	TokenNameMINUS_EQUAL	
360f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sweepFlag	TokenNameIdentifier	 sweep Flag
&&	TokenNameAND_AND	
angleExtent	TokenNameIdentifier	 angle Extent
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
angleExtent	TokenNameIdentifier	 angle Extent
+=	TokenNamePLUS_EQUAL	
360f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
angleExtent	TokenNameIdentifier	 angle Extent
%=	TokenNameREMAINDER_EQUAL	
360f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
angleStart	TokenNameIdentifier	 angle Start
%=	TokenNameREMAINDER_EQUAL	
360f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// We can now build the resulting Arc2D in double precision 	TokenNameCOMMENT_LINE	We can now build the resulting Arc2D in double precision 
// 	TokenNameCOMMENT_LINE	 
Arc2D	TokenNameIdentifier	 Arc2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
new	TokenNamenew	
Arc2D	TokenNameIdentifier	 Arc2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
cx	TokenNameIdentifier	 cx
-	TokenNameMINUS	
rx	TokenNameIdentifier	 rx
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
cy	TokenNameIdentifier	 cy
-	TokenNameMINUS	
ry	TokenNameIdentifier	 ry
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
rx	TokenNameIdentifier	 rx
*	TokenNameMULTIPLY	
2.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
ry	TokenNameIdentifier	 ry
*	TokenNameMULTIPLY	
2.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
-	TokenNameMINUS	
angleStart	TokenNameIdentifier	 angle Start
;	TokenNameSEMICOLON	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
extent	TokenNameIdentifier	 extent
=	TokenNameEQUAL	
-	TokenNameMINUS	
angleExtent	TokenNameIdentifier	 angle Extent
;	TokenNameSEMICOLON	
return	TokenNamereturn	
arc	TokenNameIdentifier	 arc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
moveTo	TokenNameIdentifier	 move To
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't add moveto to general path unless there is a reason. 	TokenNameCOMMENT_LINE	Don't add moveto to general path unless there is a reason. 
makeRoom	TokenNameIdentifier	 make Room
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
numSeg	TokenNameIdentifier	 num Seg
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
;	TokenNameSEMICOLON	
cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
mx	TokenNameIdentifier	 mx
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
cy	TokenNameIdentifier	 cy
=	TokenNameEQUAL	
my	TokenNameIdentifier	 my
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkMoveTo	TokenNameIdentifier	 check Move To
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check if prev command was moveto 	TokenNameCOMMENT_LINE	check if prev command was moveto 
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
makeRoom	TokenNameIdentifier	 make Room
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
numSeg	TokenNameIdentifier	 num Seg
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
;	TokenNameSEMICOLON	
cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
cy	TokenNameIdentifier	 cy
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
quadTo	TokenNameIdentifier	 quad To
(	TokenNameLPAREN	
float	TokenNamefloat	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
float	TokenNamefloat	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
float	TokenNamefloat	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
float	TokenNamefloat	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkMoveTo	TokenNameIdentifier	 check Move To
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check if prev command was moveto 	TokenNameCOMMENT_LINE	check if prev command was moveto 
path	TokenNameIdentifier	 path
.	TokenNameDOT	
quadTo	TokenNameIdentifier	 quad To
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
makeRoom	TokenNameIdentifier	 make Room
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
numSeg	TokenNameIdentifier	 num Seg
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_QUADTO	TokenNameIdentifier	 SEG  QUADTO
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
x1	TokenNameIdentifier	 x1
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
x2	TokenNameIdentifier	 x2
;	TokenNameSEMICOLON	
cy	TokenNameIdentifier	 cy
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
y2	TokenNameIdentifier	 y2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
curveTo	TokenNameIdentifier	 curve To
(	TokenNameLPAREN	
float	TokenNamefloat	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
float	TokenNamefloat	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
float	TokenNamefloat	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
float	TokenNamefloat	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
float	TokenNamefloat	
x3	TokenNameIdentifier	 x3
,	TokenNameCOMMA	
float	TokenNamefloat	
y3	TokenNameIdentifier	 y3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkMoveTo	TokenNameIdentifier	 check Move To
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check if prev command was moveto 	TokenNameCOMMENT_LINE	check if prev command was moveto 
path	TokenNameIdentifier	 path
.	TokenNameDOT	
curveTo	TokenNameIdentifier	 curve To
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
x3	TokenNameIdentifier	 x3
,	TokenNameCOMMA	
y3	TokenNameIdentifier	 y3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
makeRoom	TokenNameIdentifier	 make Room
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
numSeg	TokenNameIdentifier	 num Seg
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CUBICTO	TokenNameIdentifier	 SEG  CUBICTO
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
x1	TokenNameIdentifier	 x1
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
x2	TokenNameIdentifier	 x2
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
y2	TokenNameIdentifier	 y2
;	TokenNameSEMICOLON	
cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
x3	TokenNameIdentifier	 x3
;	TokenNameSEMICOLON	
cy	TokenNameIdentifier	 cy
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
y3	TokenNameIdentifier	 y3
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
closePath	TokenNameIdentifier	 close Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't double close path. 	TokenNameCOMMENT_LINE	Don't double close path. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
numSeg	TokenNameIdentifier	 num Seg
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
numSeg	TokenNameIdentifier	 num Seg
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Only close path if the previous command wasn't a moveto 	TokenNameCOMMENT_LINE	Only close path if the previous command wasn't a moveto 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
numSeg	TokenNameIdentifier	 num Seg
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
numSeg	TokenNameIdentifier	 num Seg
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
closePath	TokenNameIdentifier	 close Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
makeRoom	TokenNameIdentifier	 make Room
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
numSeg	TokenNameIdentifier	 num Seg
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
;	TokenNameSEMICOLON	
cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
mx	TokenNameIdentifier	 mx
;	TokenNameSEMICOLON	
cy	TokenNameIdentifier	 cy
=	TokenNameEQUAL	
my	TokenNameIdentifier	 my
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if previous command was a moveto command, * skipping a close command (if present). */	TokenNameCOMMENT_JAVADOC	 Checks if previous command was a moveto command, skipping a close command (if present). 
protected	TokenNameprotected	
void	TokenNamevoid	
checkMoveTo	TokenNameIdentifier	 check Move To
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numSeg	TokenNameIdentifier	 num Seg
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
numSeg	TokenNameIdentifier	 num Seg
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
:	TokenNameCOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
moveTo	TokenNameIdentifier	 move To
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numSeg	TokenNameIdentifier	 num Seg
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
numSeg	TokenNameIdentifier	 num Seg
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
moveTo	TokenNameIdentifier	 move To
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
numVals	TokenNameIdentifier	 num Vals
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
boolean	TokenNameboolean	
connect	TokenNameIdentifier	 connect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
connect	TokenNameIdentifier	 connect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
PathIterator	TokenNameIdentifier	 Path Iterator
pi	TokenNameIdentifier	 pi
,	TokenNameCOMMA	
boolean	TokenNameboolean	
connect	TokenNameIdentifier	 connect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
connect	TokenNameIdentifier	 connect
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
numVals	TokenNameIdentifier	 num Vals
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
cx	TokenNameIdentifier	 cx
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
!=	TokenNameNOT_EQUAL	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Change MOVETO to LINETO. 	TokenNameCOMMENT_LINE	Change MOVETO to LINETO. 
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Redundent segment (move to current loc) drop it... 	TokenNameCOMMENT_LINE	Redundent segment (move to current loc) drop it... 
if	TokenNameif	
(	TokenNameLPAREN	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Nothing interesting 	TokenNameCOMMENT_LINE	Nothing interesting 
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
connect	TokenNameIdentifier	 connect
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
:	TokenNameCOLON	
closePath	TokenNameIdentifier	 close Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
:	TokenNameCOLON	
moveTo	TokenNameIdentifier	 move To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
:	TokenNameCOLON	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_QUADTO	TokenNameIdentifier	 SEG  QUADTO
:	TokenNameCOLON	
quadTo	TokenNameIdentifier	 quad To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CUBICTO	TokenNameIdentifier	 SEG  CUBICTO
:	TokenNameCOLON	
curveTo	TokenNameIdentifier	 curve To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
epi	TokenNameIdentifier	 epi
,	TokenNameCOMMA	
boolean	TokenNameboolean	
connect	TokenNameIdentifier	 connect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
epi	TokenNameIdentifier	 epi
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
epi	TokenNameIdentifier	 epi
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
epi	TokenNameIdentifier	 epi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
connect	TokenNameIdentifier	 connect
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
numVals	TokenNameIdentifier	 num Vals
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
cx	TokenNameIdentifier	 cx
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
!=	TokenNameNOT_EQUAL	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Change MOVETO to LINETO. 	TokenNameCOMMENT_LINE	Change MOVETO to LINETO. 
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Redundant segment (move to current loc) drop it... 	TokenNameCOMMENT_LINE	Redundant segment (move to current loc) drop it... 
if	TokenNameif	
(	TokenNameLPAREN	
epi	TokenNameIdentifier	 epi
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Nothing interesting 	TokenNameCOMMENT_LINE	Nothing interesting 
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
epi	TokenNameIdentifier	 epi
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
epi	TokenNameIdentifier	 epi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
connect	TokenNameIdentifier	 connect
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
:	TokenNameCOLON	
closePath	TokenNameIdentifier	 close Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
:	TokenNameCOLON	
moveTo	TokenNameIdentifier	 move To
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
:	TokenNameCOLON	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_QUADTO	TokenNameIdentifier	 SEG  QUADTO
:	TokenNameCOLON	
quadTo	TokenNameIdentifier	 quad To
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CUBICTO	TokenNameIdentifier	 SEG  CUBICTO
:	TokenNameCOLON	
curveTo	TokenNameIdentifier	 curve To
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
.	TokenNameDOT	
SEG_ARCTO	TokenNameIdentifier	 SEG  ARCTO
:	TokenNameCOLON	
arcTo	TokenNameIdentifier	 arc To
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
getWindingRule	TokenNameIdentifier	 get Winding Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getWindingRule	TokenNameIdentifier	 get Winding Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setWindingRule	TokenNameIdentifier	 set Winding Rule
(	TokenNameLPAREN	
int	TokenNameint	
rule	TokenNameIdentifier	 rule
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
setWindingRule	TokenNameIdentifier	 set Winding Rule
(	TokenNameLPAREN	
rule	TokenNameIdentifier	 rule
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the current position or <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 get the current position or <code>null</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Point2D	TokenNameIdentifier	 Point2 D
getCurrentPoint	TokenNameIdentifier	 get Current Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numVals	TokenNameIdentifier	 num Vals
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numSeg	TokenNameIdentifier	 num Seg
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numVals	TokenNameIdentifier	 num Vals
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
TYPE_IDENTITY	TokenNameIdentifier	 TYPE  IDENTITY
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"ExtendedGeneralPaths can not be transformed"	TokenNameStringLiteral	ExtendedGeneralPaths can not be transformed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Shape	TokenNameIdentifier	 Shape
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Rectangle	TokenNameIdentifier	 Rectangle
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
double	TokenNamedouble	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
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
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
double	TokenNamedouble	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
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
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
PathIterator	TokenNameIdentifier	 Path Iterator
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
PathIterator	TokenNameIdentifier	 Path Iterator
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
,	TokenNameCOMMA	
double	TokenNamedouble	
flatness	TokenNameIdentifier	 flatness
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
,	TokenNameCOMMA	
flatness	TokenNameIdentifier	 flatness
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
getExtendedPathIterator	TokenNameIdentifier	 get Extended Path Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
EPI	TokenNameIdentifier	 EPI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
EPI	TokenNameIdentifier	 EPI
implements	TokenNameimplements	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
{	TokenNameLBRACE	
int	TokenNameint	
segNum	TokenNameIdentifier	 seg Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
valsIdx	TokenNameIdentifier	 vals Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
segNum	TokenNameIdentifier	 seg Num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
coords	TokenNameIdentifier	 coords
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
segNum	TokenNameIdentifier	 seg Num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
:	TokenNameCOLON	
case	TokenNamecase	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
:	TokenNameCOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SEG_QUADTO	TokenNameIdentifier	 SEG  QUADTO
:	TokenNameCOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SEG_CUBICTO	TokenNameIdentifier	 SEG  CUBICTO
:	TokenNameCOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SEG_ARCTO	TokenNameIdentifier	 SEG  ARCTO
:	TokenNameCOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("Seg: [" + segNum + "] type: " + ret + 	TokenNameCOMMENT_LINE	System.out.println("Seg: [" + segNum + "] type: " + ret + 
// " vals: [" + coords[0] + ", " + coords[1] + 	TokenNameCOMMENT_LINE	" vals: [" + coords[0] + ", " + coords[1] + 
// "]"); 	TokenNameCOMMENT_LINE	"]"); 
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
coords	TokenNameIdentifier	 coords
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
segNum	TokenNameIdentifier	 seg Num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
:	TokenNameCOLON	
case	TokenNamecase	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
:	TokenNameCOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
valsIdx	TokenNameIdentifier	 vals Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SEG_QUADTO	TokenNameIdentifier	 SEG  QUADTO
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
valsIdx	TokenNameIdentifier	 vals Idx
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SEG_CUBICTO	TokenNameIdentifier	 SEG  CUBICTO
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
valsIdx	TokenNameIdentifier	 vals Idx
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SEG_ARCTO	TokenNameIdentifier	 SEG  ARCTO
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
valsIdx	TokenNameIdentifier	 vals Idx
,	TokenNameCOMMA	
coords	TokenNameIdentifier	 coords
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getWindingRule	TokenNameIdentifier	 get Winding Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getWindingRule	TokenNameIdentifier	 get Winding Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
segNum	TokenNameIdentifier	 seg Num
==	TokenNameEQUAL_EQUAL	
numSeg	TokenNameIdentifier	 num Seg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
types	TokenNameIdentifier	 types
[	TokenNameLBRACKET	
segNum	TokenNameIdentifier	 seg Num
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
:	TokenNameCOLON	
// fallthrough is intended 	TokenNameCOMMENT_LINE	fallthrough is intended 
case	TokenNamecase	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
:	TokenNameCOLON	
valsIdx	TokenNameIdentifier	 vals Idx
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SEG_QUADTO	TokenNameIdentifier	 SEG  QUADTO
:	TokenNameCOLON	
valsIdx	TokenNameIdentifier	 vals Idx
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SEG_CUBICTO	TokenNameIdentifier	 SEG  CUBICTO
:	TokenNameCOLON	
valsIdx	TokenNameIdentifier	 vals Idx
+=	TokenNamePLUS_EQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SEG_ARCTO	TokenNameIdentifier	 SEG  ARCTO
:	TokenNameCOLON	
valsIdx	TokenNameIdentifier	 vals Idx
+=	TokenNamePLUS_EQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Delegates to the enclosed <code>GeneralPath</code>. */	TokenNameCOMMENT_JAVADOC	 Delegates to the enclosed <code>GeneralPath</code>. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GeneralPath	TokenNameIdentifier	 General Path
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
numVals	TokenNameIdentifier	 num Vals
=	TokenNameEQUAL	
numVals	TokenNameIdentifier	 num Vals
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
types	TokenNameIdentifier	 types
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
numSeg	TokenNameIdentifier	 num Seg
=	TokenNameEQUAL	
numSeg	TokenNameIdentifier	 num Seg
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Make sure, that the requested number of slots in vales[] are available. * Must be called even for numValues = 0, because it is also * used for initialization of those arrays. * * @param numValues number of requested coordinates */	TokenNameCOMMENT_JAVADOC	 Make sure, that the requested number of slots in vales[] are available. Must be called even for numValues = 0, because it is also used for initialization of those arrays. * @param numValues number of requested coordinates 
private	TokenNameprivate	
void	TokenNamevoid	
makeRoom	TokenNameIdentifier	 make Room
(	TokenNameLPAREN	
int	TokenNameint	
numValues	TokenNameIdentifier	 num Values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
numValues	TokenNameIdentifier	 num Values
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
numVals	TokenNameIdentifier	 num Vals
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numSeg	TokenNameIdentifier	 num Seg
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
numVals	TokenNameIdentifier	 num Vals
+	TokenNamePLUS	
numValues	TokenNameIdentifier	 num Values
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
>	TokenNameGREATER	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nlen	TokenNameIdentifier	 nlen
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nlen	TokenNameIdentifier	 nlen
<	TokenNameLESS	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
nlen	TokenNameIdentifier	 nlen
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nvals	TokenNameIdentifier	 nvals
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
nlen	TokenNameIdentifier	 nlen
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nvals	TokenNameIdentifier	 nvals
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numVals	TokenNameIdentifier	 num Vals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
nvals	TokenNameIdentifier	 nvals
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numSeg	TokenNameIdentifier	 num Seg
==	TokenNameEQUAL_EQUAL	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ntypes	TokenNameIdentifier	 ntypes
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ntypes	TokenNameIdentifier	 ntypes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
=	TokenNameEQUAL	
ntypes	TokenNameIdentifier	 ntypes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
