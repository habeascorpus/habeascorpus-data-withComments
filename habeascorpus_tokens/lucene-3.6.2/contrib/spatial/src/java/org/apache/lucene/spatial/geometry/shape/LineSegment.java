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
/** * 2d line segment. * * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 2d line segment. * <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
LineSegment	TokenNameIdentifier	 Line Segment
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Point2D	TokenNameIdentifier	 Point2 D
A	TokenNameIdentifier	 A
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Point2D	TokenNameIdentifier	 Point2 D
B	TokenNameIdentifier	 B
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LineSegment	TokenNameIdentifier	 Line Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
A	TokenNameIdentifier	 A
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
B	TokenNameIdentifier	 B
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LineSegment	TokenNameIdentifier	 Line Segment
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
p2	TokenNameIdentifier	 p2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
A	TokenNameIdentifier	 A
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
B	TokenNameIdentifier	 B
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finds the distance of a specified point from the line segment and the * closest point on the segment to the specified point. * * @param P * Test point. * @param closestPt * (Return) Closest point on the segment to c. * * @return Returns the distance from P to the closest point on the segment. */	TokenNameCOMMENT_JAVADOC	 Finds the distance of a specified point from the line segment and the closest point on the segment to the specified point. * @param P Test point. @param closestPt (Return) Closest point on the segment to c. * @return Returns the distance from P to the closest point on the segment. 
public	TokenNamepublic	
double	TokenNamedouble	
distance	TokenNameIdentifier	 distance
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
P	TokenNameIdentifier	 P
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
/* out */	TokenNameCOMMENT_BLOCK	 out 
closestPt	TokenNameIdentifier	 closest Pt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
closestPt	TokenNameIdentifier	 closest Pt
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
closestPt	TokenNameIdentifier	 closest Pt
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Construct vector v (AB) and w (AP) 	TokenNameCOMMENT_LINE	Construct vector v (AB) and w (AP) 
Vector2D	TokenNameIdentifier	 Vector2 D
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Vector2D	TokenNameIdentifier	 Vector2 D
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
B	TokenNameIdentifier	 B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector2D	TokenNameIdentifier	 Vector2 D
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
Vector2D	TokenNameIdentifier	 Vector2 D
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
P	TokenNameIdentifier	 P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Numerator of the component of w onto v. If <= 0 then A 	TokenNameCOMMENT_LINE	Numerator of the component of w onto v. If <= 0 then A 
// is the closest point. By separating into the numerator 	TokenNameCOMMENT_LINE	is the closest point. By separating into the numerator 
// and denominator of the component we avoid a division unless 	TokenNameCOMMENT_LINE	and denominator of the component we avoid a division unless 
// it is necessary. 	TokenNameCOMMENT_LINE	it is necessary. 
double	TokenNamedouble	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
dot	TokenNameIdentifier	 dot
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<=	TokenNameLESS_EQUAL	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closestPt	TokenNameIdentifier	 closest Pt
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
norm	TokenNameIdentifier	 norm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Get the denominator of the component. If the component >= 1 	TokenNameCOMMENT_LINE	Get the denominator of the component. If the component >= 1 
// (d <= n) then point B is the closest point 	TokenNameCOMMENT_LINE	(d <= n) then point B is the closest point 
double	TokenNamedouble	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
dot	TokenNameIdentifier	 dot
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closestPt	TokenNameIdentifier	 closest Pt
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
B	TokenNameIdentifier	 B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Vector2D	TokenNameIdentifier	 Vector2 D
(	TokenNameLPAREN	
B	TokenNameIdentifier	 B
,	TokenNameCOMMA	
P	TokenNameIdentifier	 P
)	TokenNameRPAREN	
.	TokenNameDOT	
norm	TokenNameIdentifier	 norm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Closest point is along the segment. The point is the projection of 	TokenNameCOMMENT_LINE	Closest point is along the segment. The point is the projection of 
// w onto v. 	TokenNameCOMMENT_LINE	w onto v. 
closestPt	TokenNameIdentifier	 closest Pt
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
mult	TokenNameIdentifier	 mult
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
/	TokenNameDIVIDE	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closestPt	TokenNameIdentifier	 closest Pt
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Vector2D	TokenNameIdentifier	 Vector2 D
(	TokenNameLPAREN	
closestPt	TokenNameIdentifier	 closest Pt
,	TokenNameCOMMA	
P	TokenNameIdentifier	 P
)	TokenNameRPAREN	
.	TokenNameDOT	
norm	TokenNameIdentifier	 norm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
A	TokenNameIdentifier	 A
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
B	TokenNameIdentifier	 B
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
B	TokenNameIdentifier	 B
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
LineSegment	TokenNameIdentifier	 Line Segment
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LineSegment	TokenNameIdentifier	 Line Segment
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
A	TokenNameIdentifier	 A
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
A	TokenNameIdentifier	 A
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
A	TokenNameIdentifier	 A
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
A	TokenNameIdentifier	 A
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
B	TokenNameIdentifier	 B
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
B	TokenNameIdentifier	 B
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
B	TokenNameIdentifier	 B
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
B	TokenNameIdentifier	 B
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
