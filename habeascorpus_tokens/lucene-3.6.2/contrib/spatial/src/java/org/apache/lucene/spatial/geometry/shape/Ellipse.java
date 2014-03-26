/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
spatial	TokenNameIdentifier	 spatial
.	TokenNameDOT	
geometry	TokenNameIdentifier	 geometry
.	TokenNameDOT	
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
/** * Ellipse shape. From C++ gl. * * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 Ellipse shape. From C++ gl. * <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
Ellipse	TokenNameIdentifier	 Ellipse
implements	TokenNameimplements	
Geometry2D	TokenNameIdentifier	 Geometry2 D
{	TokenNameLBRACE	
private	TokenNameprivate	
Point2D	TokenNameIdentifier	 Point2 D
center	TokenNameIdentifier	 center
;	TokenNameSEMICOLON	
/** * Half length of major axis */	TokenNameCOMMENT_JAVADOC	 Half length of major axis 
private	TokenNameprivate	
double	TokenNamedouble	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
/** * Half length of minor axis */	TokenNameCOMMENT_JAVADOC	 Half length of minor axis 
private	TokenNameprivate	
double	TokenNamedouble	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
k3	TokenNameIdentifier	 k3
;	TokenNameSEMICOLON	
/** * sin of rotation angle */	TokenNameCOMMENT_JAVADOC	 sin of rotation angle 
private	TokenNameprivate	
double	TokenNamedouble	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
/** * cos of rotation angle */	TokenNameCOMMENT_JAVADOC	 cos of rotation angle 
private	TokenNameprivate	
double	TokenNamedouble	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Ellipse	TokenNameIdentifier	 Ellipse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
center	TokenNameIdentifier	 center
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
*	TokenNameMULTIPLY	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor given bounding rectangle and a rotation. */	TokenNameCOMMENT_JAVADOC	 Constructor given bounding rectangle and a rotation. 
public	TokenNamepublic	
Ellipse	TokenNameIdentifier	 Ellipse
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
double	TokenNamedouble	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
center	TokenNameIdentifier	 center
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the center 	TokenNameCOMMENT_LINE	Set the center 
center	TokenNameIdentifier	 center
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Find sin and cos of the angle 	TokenNameCOMMENT_LINE	Find sin and cos of the angle 
double	TokenNamedouble	
angleRad	TokenNameIdentifier	 angle Rad
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
angleRad	TokenNameIdentifier	 angle Rad
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
angleRad	TokenNameIdentifier	 angle Rad
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Find the half lengths of the semi-major and semi-minor axes 	TokenNameCOMMENT_LINE	Find the half lengths of the semi-major and semi-minor axes 
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>=	TokenNameGREATER_EQUAL	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Find k1, k2, k3 - define when a point x,y is on the ellipse 	TokenNameCOMMENT_LINE	Find k1, k2, k3 - define when a point x,y is on the ellipse 
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
/	TokenNameDIVIDE	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
+	TokenNamePLUS	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
/	TokenNameDIVIDE	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
*	TokenNameMULTIPLY	
c	TokenNameIdentifier	 c
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k3	TokenNameIdentifier	 k3
=	TokenNameEQUAL	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
/	TokenNameDIVIDE	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
+	TokenNamePLUS	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
/	TokenNameDIVIDE	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if a line segment intersects the ellipse and if so finds the * point(s) of intersection. * * @param seg * Line segment to test for intersection * @param pt0 * OUT - intersection point (if it exists) * @param pt1 * OUT - second intersection point (if it exists) * * @return Returns the number of intersection points (0, 1, or 2). */	TokenNameCOMMENT_JAVADOC	 Determines if a line segment intersects the ellipse and if so finds the point(s) of intersection. * @param seg Line segment to test for intersection @param pt0 OUT - intersection point (if it exists) @param pt1 OUT - second intersection point (if it exists) * @return Returns the number of intersection points (0, 1, or 2). 
public	TokenNamepublic	
int	TokenNameint	
intersect	TokenNameIdentifier	 intersect
(	TokenNameLPAREN	
LineSegment	TokenNameIdentifier	 Line Segment
seg	TokenNameIdentifier	 seg
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
pt0	TokenNameIdentifier	 pt0
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
pt1	TokenNameIdentifier	 pt1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pt0	TokenNameIdentifier	 pt0
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
pt0	TokenNameIdentifier	 pt0
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pt1	TokenNameIdentifier	 pt1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
pt1	TokenNameIdentifier	 pt1
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Solution is found by parameterizing the line segment and 	TokenNameCOMMENT_LINE	Solution is found by parameterizing the line segment and 
// substituting those values into the ellipse equation. 	TokenNameCOMMENT_LINE	substituting those values into the ellipse equation. 
// Results in a quadratic equation. 	TokenNameCOMMENT_LINE	Results in a quadratic equation. 
double	TokenNamedouble	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
u1	TokenNameIdentifier	 u1
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
A	TokenNameIdentifier	 A
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
A	TokenNameIdentifier	 A
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
u2	TokenNameIdentifier	 u2
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
B	TokenNameIdentifier	 B
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
B	TokenNameIdentifier	 B
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
u2	TokenNameIdentifier	 u2
-	TokenNameMINUS	
u1	TokenNameIdentifier	 u1
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
v2	TokenNameIdentifier	 v2
-	TokenNameMINUS	
v1	TokenNameIdentifier	 v1
;	TokenNameSEMICOLON	
double	TokenNamedouble	
q0	TokenNameIdentifier	 q0
=	TokenNameEQUAL	
k1	TokenNameIdentifier	 k1
*	TokenNameMULTIPLY	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
-	TokenNameMINUS	
x1	TokenNameIdentifier	 x1
)	TokenNameRPAREN	
+	TokenNamePLUS	
k2	TokenNameIdentifier	 k2
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
-	TokenNameMINUS	
x1	TokenNameIdentifier	 x1
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
-	TokenNameMINUS	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
+	TokenNamePLUS	
k3	TokenNameIdentifier	 k3
*	TokenNameMULTIPLY	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
-	TokenNameMINUS	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
k1	TokenNameIdentifier	 k1
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
-	TokenNameMINUS	
x1	TokenNameIdentifier	 x1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
-	TokenNameMINUS	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
-	TokenNameMINUS	
x1	TokenNameIdentifier	 x1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
k3	TokenNameIdentifier	 k3
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
-	TokenNameMINUS	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
*	TokenNameMULTIPLY	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
k3	TokenNameIdentifier	 k3
*	TokenNameMULTIPLY	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compare q1^2 to 4*q0*q2 to see how quadratic solves 	TokenNameCOMMENT_LINE	Compare q1^2 to 4*q0*q2 to see how quadratic solves 
double	TokenNamedouble	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
q0	TokenNameIdentifier	 q0
*	TokenNameMULTIPLY	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Roots are complex valued. Line containing the segment does 	TokenNameCOMMENT_LINE	Roots are complex valued. Line containing the segment does 
// not intersect the ellipse 	TokenNameCOMMENT_LINE	not intersect the ellipse 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// One real-valued root - line is tangent to the ellipse 	TokenNameCOMMENT_LINE	One real-valued root - line is tangent to the ellipse 
double	TokenNamedouble	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
-	TokenNameMINUS	
q1	TokenNameIdentifier	 q1
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
t	TokenNameIdentifier	 t
&&	TokenNameAND_AND	
t	TokenNameIdentifier	 t
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Intersection occurs along line segment 	TokenNameCOMMENT_LINE	Intersection occurs along line segment 
pt0	TokenNameIdentifier	 pt0
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pt0	TokenNameIdentifier	 pt0
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Two distinct real-valued roots. Solve for the roots and see if 	TokenNameCOMMENT_LINE	Two distinct real-valued roots. Solve for the roots and see if 
// they fall along the line segment 	TokenNameCOMMENT_LINE	they fall along the line segment 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
-	TokenNameMINUS	
q1	TokenNameIdentifier	 q1
-	TokenNameMINUS	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
t	TokenNameIdentifier	 t
&&	TokenNameAND_AND	
t	TokenNameIdentifier	 t
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Intersection occurs along line segment 	TokenNameCOMMENT_LINE	Intersection occurs along line segment 
pt0	TokenNameIdentifier	 pt0
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pt0	TokenNameIdentifier	 pt0
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 2nd root 	TokenNameCOMMENT_LINE	2nd root 
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
-	TokenNameMINUS	
q1	TokenNameIdentifier	 q1
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
t	TokenNameIdentifier	 t
&&	TokenNameAND_AND	
t	TokenNameIdentifier	 t
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pt0	TokenNameIdentifier	 pt0
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pt0	TokenNameIdentifier	 pt0
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pt1	TokenNameIdentifier	 pt1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pt1	TokenNameIdentifier	 pt1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
IntersectCase	TokenNameIdentifier	 Intersect Case
intersect	TokenNameIdentifier	 intersect
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Test if all 4 corners of the rectangle are inside the ellipse 	TokenNameCOMMENT_LINE	Test if all 4 corners of the rectangle are inside the ellipse 
Point2D	TokenNameIdentifier	 Point2 D
ul	TokenNameIdentifier	 ul
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
MinPt	TokenNameIdentifier	 Min Pt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
MaxPt	TokenNameIdentifier	 Max Pt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
ur	TokenNameIdentifier	 ur
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
MaxPt	TokenNameIdentifier	 Max Pt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
MaxPt	TokenNameIdentifier	 Max Pt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
MinPt	TokenNameIdentifier	 Min Pt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
MinPt	TokenNameIdentifier	 Min Pt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
lr	TokenNameIdentifier	 lr
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
MaxPt	TokenNameIdentifier	 Max Pt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
MinPt	TokenNameIdentifier	 Min Pt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ul	TokenNameIdentifier	 ul
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ur	TokenNameIdentifier	 ur
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
lr	TokenNameIdentifier	 lr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
IntersectCase	TokenNameIdentifier	 Intersect Case
.	TokenNameDOT	
CONTAINS	TokenNameIdentifier	 CONTAINS
;	TokenNameSEMICOLON	
// Test if any of the rectangle edges intersect 	TokenNameCOMMENT_LINE	Test if any of the rectangle edges intersect 
Point2D	TokenNameIdentifier	 Point2 D
pt0	TokenNameIdentifier	 pt0
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pt1	TokenNameIdentifier	 pt1
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LineSegment	TokenNameIdentifier	 Line Segment
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
new	TokenNamenew	
LineSegment	TokenNameIdentifier	 Line Segment
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
,	TokenNameCOMMA	
lr	TokenNameIdentifier	 lr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
intersect	TokenNameIdentifier	 intersect
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
,	TokenNameCOMMA	
pt0	TokenNameIdentifier	 pt0
,	TokenNameCOMMA	
pt1	TokenNameIdentifier	 pt1
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
IntersectCase	TokenNameIdentifier	 Intersect Case
.	TokenNameDOT	
INTERSECTS	TokenNameIdentifier	 INTERSECTS
;	TokenNameSEMICOLON	
LineSegment	TokenNameIdentifier	 Line Segment
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
new	TokenNamenew	
LineSegment	TokenNameIdentifier	 Line Segment
(	TokenNameLPAREN	
ul	TokenNameIdentifier	 ul
,	TokenNameCOMMA	
ur	TokenNameIdentifier	 ur
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
intersect	TokenNameIdentifier	 intersect
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
,	TokenNameCOMMA	
pt0	TokenNameIdentifier	 pt0
,	TokenNameCOMMA	
pt1	TokenNameIdentifier	 pt1
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
IntersectCase	TokenNameIdentifier	 Intersect Case
.	TokenNameDOT	
INTERSECTS	TokenNameIdentifier	 INTERSECTS
;	TokenNameSEMICOLON	
LineSegment	TokenNameIdentifier	 Line Segment
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
new	TokenNamenew	
LineSegment	TokenNameIdentifier	 Line Segment
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
,	TokenNameCOMMA	
ul	TokenNameIdentifier	 ul
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
intersect	TokenNameIdentifier	 intersect
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
pt0	TokenNameIdentifier	 pt0
,	TokenNameCOMMA	
pt1	TokenNameIdentifier	 pt1
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
IntersectCase	TokenNameIdentifier	 Intersect Case
.	TokenNameDOT	
INTERSECTS	TokenNameIdentifier	 INTERSECTS
;	TokenNameSEMICOLON	
LineSegment	TokenNameIdentifier	 Line Segment
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
new	TokenNamenew	
LineSegment	TokenNameIdentifier	 Line Segment
(	TokenNameLPAREN	
lr	TokenNameIdentifier	 lr
,	TokenNameCOMMA	
ur	TokenNameIdentifier	 ur
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
intersect	TokenNameIdentifier	 intersect
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
pt0	TokenNameIdentifier	 pt0
,	TokenNameCOMMA	
pt1	TokenNameIdentifier	 pt1
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
IntersectCase	TokenNameIdentifier	 Intersect Case
.	TokenNameDOT	
INTERSECTS	TokenNameIdentifier	 INTERSECTS
;	TokenNameSEMICOLON	
// Ellipse does not intersect any edge : since the case for the ellipse 	TokenNameCOMMENT_LINE	Ellipse does not intersect any edge : since the case for the ellipse 
// containing the rectangle was considered above then if the center 	TokenNameCOMMENT_LINE	containing the rectangle was considered above then if the center 
// is inside the ellipse is fully inside and if center is outside 	TokenNameCOMMENT_LINE	is inside the ellipse is fully inside and if center is outside 
// the ellipse is fully outside 	TokenNameCOMMENT_LINE	the ellipse is fully outside 
return	TokenNamereturn	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
center	TokenNameIdentifier	 center
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
IntersectCase	TokenNameIdentifier	 Intersect Case
.	TokenNameDOT	
WITHIN	TokenNameIdentifier	 WITHIN
:	TokenNameCOLON	
IntersectCase	TokenNameIdentifier	 Intersect Case
.	TokenNameDOT	
OUTSIDE	TokenNameIdentifier	 OUTSIDE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
area	TokenNameIdentifier	 area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
centroid	TokenNameIdentifier	 centroid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Plug in equation for ellipse, If evaluates to <= 0 then the 	TokenNameCOMMENT_LINE	Plug in equation for ellipse, If evaluates to <= 0 then the 
// point is in or on the ellipse. 	TokenNameCOMMENT_LINE	point is in or on the ellipse. 
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
eq	TokenNameIdentifier	 eq
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
*	TokenNameMULTIPLY	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
k3	TokenNameIdentifier	 k3
*	TokenNameMULTIPLY	
SQR	TokenNameIdentifier	 SQR
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
eq	TokenNameIdentifier	 eq
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
Vector2D	TokenNameIdentifier	 Vector2 D
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
