/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
spatial	TokenNameIdentifier	 spatial
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
DistanceUnits	TokenNameIdentifier	 Distance Units
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
LatLng	TokenNameIdentifier	 Lat Lng
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
LLRect	TokenNameIdentifier	 LL Rect
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
Rectangle	TokenNameIdentifier	 Rectangle
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
spatial	TokenNameIdentifier	 spatial
.	TokenNameDOT	
tier	TokenNameIdentifier	 tier
.	TokenNameDOT	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
;	TokenNameSEMICOLON	
/** * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
DistanceUtils	TokenNameIdentifier	 Distance Utils
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
/	TokenNameDIVIDE	
180.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
RADIANS_TO_DEGREES	TokenNameIdentifier	 RADIANS  TO  DEGREES
=	TokenNameEQUAL	
180.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
;	TokenNameSEMICOLON	
//pre-compute some angles that are commonly used 	TokenNameCOMMENT_LINE	pre-compute some angles that are commonly used 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEG_45_AS_RADS	TokenNameIdentifier	 DEG 45  AS  RADS
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
/	TokenNameDIVIDE	
4.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
SIN_45_AS_RADS	TokenNameIdentifier	 SIN 45  AS  RADS
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
DEG_45_AS_RADS	TokenNameIdentifier	 DEG 45  AS  RADS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEG_90_AS_RADS	TokenNameIdentifier	 DEG 90  AS  RADS
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEG_180_AS_RADS	TokenNameIdentifier	 DEG 180  AS  RADS
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEG_225_AS_RADS	TokenNameIdentifier	 DEG 225  AS  RADS
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DEG_45_AS_RADS	TokenNameIdentifier	 DEG 45  AS  RADS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEG_270_AS_RADS	TokenNameIdentifier	 DEG 270  AS  RADS
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DEG_90_AS_RADS	TokenNameIdentifier	 DEG 90  AS  RADS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
KM_TO_MILES	TokenNameIdentifier	 KM  TO  MILES
=	TokenNameEQUAL	
0.621371192	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
MILES_TO_KM	TokenNameIdentifier	 MILES  TO  KM
=	TokenNameEQUAL	
1.609344	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** * The International Union of Geodesy and Geophysics says the Earth's mean radius in KM is: * * [1] http://en.wikipedia.org/wiki/Earth_radius */	TokenNameCOMMENT_JAVADOC	 The International Union of Geodesy and Geophysics says the Earth's mean radius in KM is: * [1] http://en.wikipedia.org/wiki/Earth_radius 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
=	TokenNameEQUAL	
6371.009	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
EARTH_MEAN_RADIUS_MI	TokenNameIdentifier	 EARTH  MEAN  RADIUS  MI
=	TokenNameEQUAL	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
/	TokenNameDIVIDE	
MILES_TO_KM	TokenNameIdentifier	 MILES  TO  KM
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
EARTH_EQUATORIAL_RADIUS_MI	TokenNameIdentifier	 EARTH  EQUATORIAL  RADIUS  MI
=	TokenNameEQUAL	
3963.205	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
EARTH_EQUATORIAL_RADIUS_KM	TokenNameIdentifier	 EARTH  EQUATORIAL  RADIUS  KM
=	TokenNameEQUAL	
EARTH_EQUATORIAL_RADIUS_MI	TokenNameIdentifier	 EARTH  EQUATORIAL  RADIUS  MI
*	TokenNameMULTIPLY	
MILES_TO_KM	TokenNameIdentifier	 MILES  TO  KM
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
getDistanceMi	TokenNameIdentifier	 get Distance Mi
(	TokenNameLPAREN	
double	TokenNamedouble	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
double	TokenNamedouble	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
double	TokenNamedouble	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
double	TokenNamedouble	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLLMDistance	TokenNameIdentifier	 get LLM Distance
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
}	TokenNameRBRACE	
/** * * @param x1 * @param y1 * @param miles * @return boundary rectangle where getY/getX is top left, getMinY/getMinX is bottom right */	TokenNameCOMMENT_JAVADOC	 * @param x1 @param y1 @param miles @return boundary rectangle where getY/getX is top left, getMinY/getMinX is bottom right 
public	TokenNamepublic	
static	TokenNamestatic	
Rectangle	TokenNameIdentifier	 Rectangle
getBoundary	TokenNameIdentifier	 get Boundary
(	TokenNameLPAREN	
double	TokenNamedouble	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
double	TokenNamedouble	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
double	TokenNamedouble	
miles	TokenNameIdentifier	 miles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LLRect	TokenNameIdentifier	 LL Rect
box	TokenNameIdentifier	 box
=	TokenNameEQUAL	
LLRect	TokenNameIdentifier	 LL Rect
.	TokenNameDOT	
createBox	TokenNameIdentifier	 create Box
(	TokenNameLPAREN	
new	TokenNamenew	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
miles	TokenNameIdentifier	 miles
,	TokenNameCOMMA	
miles	TokenNameIdentifier	 miles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("Box: "+maxX+" | "+ maxY+" | "+ minX + " | "+ minY); 	TokenNameCOMMENT_LINE	System.out.println("Box: "+maxX+" | "+ maxY+" | "+ minX + " | "+ minY); 
return	TokenNamereturn	
box	TokenNameIdentifier	 box
.	TokenNameDOT	
toRectangle	TokenNameIdentifier	 to Rectangle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
getLLMDistance	TokenNameIdentifier	 get LLM Distance
(	TokenNameLPAREN	
double	TokenNamedouble	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
double	TokenNamedouble	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
double	TokenNamedouble	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
double	TokenNamedouble	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LatLng	TokenNameIdentifier	 Lat Lng
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
new	TokenNamenew	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LatLng	TokenNameIdentifier	 Lat Lng
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
new	TokenNamenew	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
(	TokenNameLPAREN	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
arcDistance	TokenNameIdentifier	 arc Distance
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
MILES	TokenNameIdentifier	 MILES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * distance/radius. * @param distance The distance travelled * @param radius The radius of the sphere * @return The angular distance, in radians */	TokenNameCOMMENT_JAVADOC	 distance/radius. @param distance The distance travelled @param radius The radius of the sphere @return The angular distance, in radians 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
angularDistance	TokenNameIdentifier	 angular Distance
(	TokenNameLPAREN	
double	TokenNamedouble	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
double	TokenNamedouble	
radius	TokenNameIdentifier	 radius
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
distance	TokenNameIdentifier	 distance
/	TokenNameDIVIDE	
radius	TokenNameIdentifier	 radius
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculate the p-norm (i.e. length) beteen two vectors * * @param vec1 The first vector * @param vec2 The second vector * @param power The power (2 for Euclidean distance, 1 for manhattan, etc.) * @return The length. * <p/> * See http://en.wikipedia.org/wiki/Lp_space * @see #vectorDistance(double[], double[], double, double) */	TokenNameCOMMENT_JAVADOC	 Calculate the p-norm (i.e. length) beteen two vectors * @param vec1 The first vector @param vec2 The second vector @param power The power (2 for Euclidean distance, 1 for manhattan, etc.) @return The length. <p/> See http://en.wikipedia.org/wiki/Lp_space @see #vectorDistance(double[], double[], double, double) 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
vectorDistance	TokenNameIdentifier	 vector Distance
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vec1	TokenNameIdentifier	 vec1
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vec2	TokenNameIdentifier	 vec2
,	TokenNameCOMMA	
double	TokenNamedouble	
power	TokenNameIdentifier	 power
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vectorDistance	TokenNameIdentifier	 vector Distance
(	TokenNameLPAREN	
vec1	TokenNameIdentifier	 vec1
,	TokenNameCOMMA	
vec2	TokenNameIdentifier	 vec2
,	TokenNameCOMMA	
power	TokenNameIdentifier	 power
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
power	TokenNameIdentifier	 power
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculate the p-norm (i.e. length) between two vectors * * @param vec1 The first vector * @param vec2 The second vector * @param power The power (2 for Euclidean distance, 1 for manhattan, etc.) * @param oneOverPower If you've precalculated oneOverPower and cached it, use this method to save one division operation over {@link #vectorDistance(double[], double[], double)}. * @return The length. */	TokenNameCOMMENT_JAVADOC	 Calculate the p-norm (i.e. length) between two vectors * @param vec1 The first vector @param vec2 The second vector @param power The power (2 for Euclidean distance, 1 for manhattan, etc.) @param oneOverPower If you've precalculated oneOverPower and cached it, use this method to save one division operation over {@link #vectorDistance(double[], double[], double)}. @return The length. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
vectorDistance	TokenNameIdentifier	 vector Distance
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vec1	TokenNameIdentifier	 vec1
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vec2	TokenNameIdentifier	 vec2
,	TokenNameCOMMA	
double	TokenNamedouble	
power	TokenNameIdentifier	 power
,	TokenNameCOMMA	
double	TokenNamedouble	
oneOverPower	TokenNameIdentifier	 one Over Power
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
power	TokenNameIdentifier	 power
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
vec1	TokenNameIdentifier	 vec1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
vec1	TokenNameIdentifier	 vec1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
vec2	TokenNameIdentifier	 vec2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
power	TokenNameIdentifier	 power
==	TokenNameEQUAL_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
vec1	TokenNameIdentifier	 vec1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
vec1	TokenNameIdentifier	 vec1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
vec2	TokenNameIdentifier	 vec2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
power	TokenNameIdentifier	 power
==	TokenNameEQUAL_EQUAL	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
squaredEuclideanDistance	TokenNameIdentifier	 squared Euclidean Distance
(	TokenNameLPAREN	
vec1	TokenNameIdentifier	 vec1
,	TokenNameCOMMA	
vec2	TokenNameIdentifier	 vec2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
power	TokenNameIdentifier	 power
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
||	TokenNameOR_OR	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isInfinite	TokenNameIdentifier	 is Infinite
(	TokenNameLPAREN	
power	TokenNameIdentifier	 power
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//infinite norm? 	TokenNameCOMMENT_LINE	infinite norm? 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
vec1	TokenNameIdentifier	 vec1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
vec1	TokenNameIdentifier	 vec1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vec2	TokenNameIdentifier	 vec2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
vec1	TokenNameIdentifier	 vec1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
vec1	TokenNameIdentifier	 vec1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
vec2	TokenNameIdentifier	 vec2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
power	TokenNameIdentifier	 power
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
oneOverPower	TokenNameIdentifier	 one Over Power
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the coordinates of a vector that is the corner of a box (upper right or lower left), assuming a Rectangular * coordinate system. Note, this does not apply for points on a sphere or ellipse (although it could be used as an approximatation). * * @param center The center point * @param result Holds the result, potentially resizing if needed. * @param distance The d from the center to the corner * @param upperRight If true, return the coords for the upper right corner, else return the lower left. * @return The point, either the upperLeft or the lower right */	TokenNameCOMMENT_JAVADOC	 Return the coordinates of a vector that is the corner of a box (upper right or lower left), assuming a Rectangular coordinate system. Note, this does not apply for points on a sphere or ellipse (although it could be used as an approximatation). * @param center The center point @param result Holds the result, potentially resizing if needed. @param distance The d from the center to the corner @param upperRight If true, return the coords for the upper right corner, else return the lower left. @return The point, either the upperLeft or the lower right 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vectorBoxCorner	TokenNameIdentifier	 vector Box Corner
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
double	TokenNamedouble	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
boolean	TokenNameboolean	
upperRight	TokenNameIdentifier	 upper Right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upperRight	TokenNameIdentifier	 upper Right
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
-	TokenNameMINUS	
distance	TokenNameIdentifier	 distance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//We don't care about the power here, 	TokenNameCOMMENT_LINE	We don't care about the power here, 
// b/c we are always in a rectangular coordinate system, so any norm can be used by 	TokenNameCOMMENT_LINE	b/c we are always in a rectangular coordinate system, so any norm can be used by 
//using the definition of sine 	TokenNameCOMMENT_LINE	using the definition of sine 
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
SIN_45_AS_RADS	TokenNameIdentifier	 SIN 45  AS  RADS
*	TokenNameMULTIPLY	
distance	TokenNameIdentifier	 distance
;	TokenNameSEMICOLON	
// sin(Pi/4) == (2^0.5)/2 == opp/hyp == opp/distance, solve for opp, similarily for cosine 	TokenNameCOMMENT_LINE	sin(Pi/4) == (2^0.5)/2 == opp/hyp == opp/distance, solve for opp, similarily for cosine 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
center	TokenNameIdentifier	 center
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
distance	TokenNameIdentifier	 distance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param latCenter In degrees * @param lonCenter In degrees * @param distance The distance * @param result A preallocated array to hold the results. If null, a new one is constructed. * @param upperRight If true, calculate the upper right corner, else the lower left * @param sphereRadius The radius of the sphere to use. * @return The Lat/Lon in degrees * * @see #latLonCorner(double, double, double, double[], boolean, double) */	TokenNameCOMMENT_JAVADOC	 @param latCenter In degrees @param lonCenter In degrees @param distance The distance @param result A preallocated array to hold the results. If null, a new one is constructed. @param upperRight If true, calculate the upper right corner, else the lower left @param sphereRadius The radius of the sphere to use. @return The Lat/Lon in degrees * @see #latLonCorner(double, double, double, double[], boolean, double) 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
latLonCornerDegs	TokenNameIdentifier	 lat Lon Corner Degs
(	TokenNameLPAREN	
double	TokenNamedouble	
latCenter	TokenNameIdentifier	 lat Center
,	TokenNameCOMMA	
double	TokenNamedouble	
lonCenter	TokenNameIdentifier	 lon Center
,	TokenNameCOMMA	
double	TokenNamedouble	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
boolean	TokenNameboolean	
upperRight	TokenNameIdentifier	 upper Right
,	TokenNameCOMMA	
double	TokenNamedouble	
sphereRadius	TokenNameIdentifier	 sphere Radius
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
latLonCorner	TokenNameIdentifier	 lat Lon Corner
(	TokenNameLPAREN	
latCenter	TokenNameIdentifier	 lat Center
*	TokenNameMULTIPLY	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
lonCenter	TokenNameIdentifier	 lon Center
*	TokenNameMULTIPLY	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
upperRight	TokenNameIdentifier	 upper Right
,	TokenNameCOMMA	
sphereRadius	TokenNameIdentifier	 sphere Radius
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
RADIANS_TO_DEGREES	TokenNameIdentifier	 RADIANS  TO  DEGREES
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
RADIANS_TO_DEGREES	TokenNameIdentifier	 RADIANS  TO  DEGREES
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Uses Haversine to calculate the corner of a box (upper right or lower left) that is the <i>distance</i> away, given a sphere of the specified <i>radius</i>. * * NOTE: This is not the same as calculating a box that transcribes a circle of the given distance. * * @param latCenter In radians * @param lonCenter In radians * @param distance The distance * @param result A preallocated array to hold the results. If null, a new one is constructed. * @param upperRight If true, give lat/lon for the upper right corner, else lower left * @param sphereRadius The radius to use for the calculation * @return The Lat/Lon in Radians */	TokenNameCOMMENT_JAVADOC	 Uses Haversine to calculate the corner of a box (upper right or lower left) that is the <i>distance</i> away, given a sphere of the specified <i>radius</i>. * NOTE: This is not the same as calculating a box that transcribes a circle of the given distance. * @param latCenter In radians @param lonCenter In radians @param distance The distance @param result A preallocated array to hold the results. If null, a new one is constructed. @param upperRight If true, give lat/lon for the upper right corner, else lower left @param sphereRadius The radius to use for the calculation @return The Lat/Lon in Radians 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
latLonCorner	TokenNameIdentifier	 lat Lon Corner
(	TokenNameLPAREN	
double	TokenNamedouble	
latCenter	TokenNameIdentifier	 lat Center
,	TokenNameCOMMA	
double	TokenNamedouble	
lonCenter	TokenNameIdentifier	 lon Center
,	TokenNameCOMMA	
double	TokenNamedouble	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
boolean	TokenNameboolean	
upperRight	TokenNameIdentifier	 upper Right
,	TokenNameCOMMA	
double	TokenNamedouble	
sphereRadius	TokenNameIdentifier	 sphere Radius
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Haversine formula 	TokenNameCOMMENT_LINE	Haversine formula 
double	TokenNamedouble	
brng	TokenNameIdentifier	 brng
=	TokenNameEQUAL	
upperRight	TokenNameIdentifier	 upper Right
?	TokenNameQUESTION	
DEG_45_AS_RADS	TokenNameIdentifier	 DEG 45  AS  RADS
:	TokenNameCOLON	
DEG_225_AS_RADS	TokenNameIdentifier	 DEG 225  AS  RADS
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
pointOnBearing	TokenNameIdentifier	 point On Bearing
(	TokenNameLPAREN	
latCenter	TokenNameIdentifier	 lat Center
,	TokenNameCOMMA	
lonCenter	TokenNameIdentifier	 lon Center
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
brng	TokenNameIdentifier	 brng
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
sphereRadius	TokenNameIdentifier	 sphere Radius
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a start point (startLat, startLon) and a bearing on a sphere of radius <i>sphereRadius</i>, return the destination point. * @param startLat The starting point latitude, in radians * @param startLon The starting point longitude, in radians * @param distance The distance to travel along the bearing. The units are assumed to be the same as the sphereRadius units, both of which is up to the caller to know * @param bearing The bearing, in radians. North is a 0 deg. bearing, east is 90 deg, south is 180 deg, west is 270 deg. * @param result A preallocated array to hold the results. If null, a new one is constructed. * @param sphereRadius The radius of the sphere to use for the calculation. * @return The destination point, in radians. First entry is latitude, second is longitude */	TokenNameCOMMENT_JAVADOC	 Given a start point (startLat, startLon) and a bearing on a sphere of radius <i>sphereRadius</i>, return the destination point. @param startLat The starting point latitude, in radians @param startLon The starting point longitude, in radians @param distance The distance to travel along the bearing. The units are assumed to be the same as the sphereRadius units, both of which is up to the caller to know @param bearing The bearing, in radians. North is a 0 deg. bearing, east is 90 deg, south is 180 deg, west is 270 deg. @param result A preallocated array to hold the results. If null, a new one is constructed. @param sphereRadius The radius of the sphere to use for the calculation. @return The destination point, in radians. First entry is latitude, second is longitude 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pointOnBearing	TokenNameIdentifier	 point On Bearing
(	TokenNameLPAREN	
double	TokenNamedouble	
startLat	TokenNameIdentifier	 start Lat
,	TokenNameCOMMA	
double	TokenNamedouble	
startLon	TokenNameIdentifier	 start Lon
,	TokenNameCOMMA	
double	TokenNamedouble	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
double	TokenNamedouble	
bearing	TokenNameIdentifier	 bearing
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
double	TokenNamedouble	
sphereRadius	TokenNameIdentifier	 sphere Radius
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* lat2 = asin(sin(lat1)*cos(d/R) + cos(lat1)*sin(d/R)*cos(θ)) lon2 = lon1 + atan2(sin(θ)*sin(d/R)*cos(lat1), cos(d/R)−sin(lat1)*sin(lat2)) */	TokenNameCOMMENT_BLOCK	 lat2 = asin(sin(lat1)*cos(d/R) + cos(lat1)*sin(d/R)*cos(θ)) lon2 = lon1 + atan2(sin(θ)*sin(d/R)*cos(lat1), cos(d/R)−sin(lat1)*sin(lat2)) 
double	TokenNamedouble	
cosAngDist	TokenNameIdentifier	 cos Ang Dist
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
distance	TokenNameIdentifier	 distance
/	TokenNameDIVIDE	
sphereRadius	TokenNameIdentifier	 sphere Radius
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cosStartLat	TokenNameIdentifier	 cos Start Lat
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
startLat	TokenNameIdentifier	 start Lat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sinAngDist	TokenNameIdentifier	 sin Ang Dist
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
distance	TokenNameIdentifier	 distance
/	TokenNameDIVIDE	
sphereRadius	TokenNameIdentifier	 sphere Radius
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
lat2	TokenNameIdentifier	 lat2
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
asin	TokenNameIdentifier	 asin
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
startLat	TokenNameIdentifier	 start Lat
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
cosAngDist	TokenNameIdentifier	 cos Ang Dist
+	TokenNamePLUS	
cosStartLat	TokenNameIdentifier	 cos Start Lat
*	TokenNameMULTIPLY	
sinAngDist	TokenNameIdentifier	 sin Ang Dist
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
bearing	TokenNameIdentifier	 bearing
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
lon2	TokenNameIdentifier	 lon2
=	TokenNameEQUAL	
startLon	TokenNameIdentifier	 start Lon
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
atan2	TokenNameIdentifier	 atan2
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
bearing	TokenNameIdentifier	 bearing
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
sinAngDist	TokenNameIdentifier	 sin Ang Dist
*	TokenNameMULTIPLY	
cosStartLat	TokenNameIdentifier	 cos Start Lat
,	TokenNameCOMMA	
cosAngDist	TokenNameIdentifier	 cos Ang Dist
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
startLat	TokenNameIdentifier	 start Lat
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
lat2	TokenNameIdentifier	 lat2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*lat2 = (lat2*180)/Math.PI; lon2 = (lon2*180)/Math.PI;*/	TokenNameCOMMENT_BLOCK	lat2 = (lat2*180)/Math.PI; lon2 = (lon2*180)/Math.PI;
//From Lucene. Move back to Lucene when synced 	TokenNameCOMMENT_LINE	From Lucene. Move back to Lucene when synced 
// normalize long first 	TokenNameCOMMENT_LINE	normalize long first 
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lat2	TokenNameIdentifier	 lat2
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lon2	TokenNameIdentifier	 lon2
;	TokenNameSEMICOLON	
normLng	TokenNameIdentifier	 norm Lng
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// normalize lat - could flip poles 	TokenNameCOMMENT_LINE	normalize lat - could flip poles 
normLat	TokenNameIdentifier	 norm Lat
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param latLng The lat/lon, in radians. lat in position 0, long in position 1 */	TokenNameCOMMENT_JAVADOC	 @param latLng The lat/lon, in radians. lat in position 0, long in position 1 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
normLat	TokenNameIdentifier	 norm Lat
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
latLng	TokenNameIdentifier	 lat Lng
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
DEG_90_AS_RADS	TokenNameIdentifier	 DEG 90  AS  RADS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DEG_90_AS_RADS	TokenNameIdentifier	 DEG 90  AS  RADS
-	TokenNameMINUS	
(	TokenNameLPAREN	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
DEG_90_AS_RADS	TokenNameIdentifier	 DEG 90  AS  RADS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
DEG_180_AS_RADS	TokenNameIdentifier	 DEG 180  AS  RADS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
DEG_180_AS_RADS	TokenNameIdentifier	 DEG 180  AS  RADS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
-	TokenNameMINUS	
DEG_90_AS_RADS	TokenNameIdentifier	 DEG 90  AS  RADS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
DEG_90_AS_RADS	TokenNameIdentifier	 DEG 90  AS  RADS
-	TokenNameMINUS	
(	TokenNameLPAREN	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
DEG_90_AS_RADS	TokenNameIdentifier	 DEG 90  AS  RADS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
DEG_180_AS_RADS	TokenNameIdentifier	 DEG 180  AS  RADS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
DEG_180_AS_RADS	TokenNameIdentifier	 DEG 180  AS  RADS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a normalized Lng rectangle shape for the bounding box * * @param latLng The lat/lon, in radians, lat in position 0, long in position 1 */	TokenNameCOMMENT_JAVADOC	 Returns a normalized Lng rectangle shape for the bounding box * @param latLng The lat/lon, in radians, lat in position 0, long in position 1 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
normLng	TokenNameIdentifier	 norm Lng
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
latLng	TokenNameIdentifier	 lat Lng
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
DEG_180_AS_RADS	TokenNameIdentifier	 DEG 180  AS  RADS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
DEG_180_AS_RADS	TokenNameIdentifier	 DEG 180  AS  RADS
-	TokenNameMINUS	
(	TokenNameLPAREN	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
DEG_180_AS_RADS	TokenNameIdentifier	 DEG 180  AS  RADS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
-	TokenNameMINUS	
DEG_180_AS_RADS	TokenNameIdentifier	 DEG 180  AS  RADS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
latLng	TokenNameIdentifier	 lat Lng
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
DEG_180_AS_RADS	TokenNameIdentifier	 DEG 180  AS  RADS
)	TokenNameRPAREN	
+	TokenNamePLUS	
DEG_180_AS_RADS	TokenNameIdentifier	 DEG 180  AS  RADS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The square of the Euclidean Distance. Not really a distance, but useful if all that matters is * comparing the result to another one. * * @param vec1 The first point * @param vec2 The second point * @return The squared Euclidean distance */	TokenNameCOMMENT_JAVADOC	 The square of the Euclidean Distance. Not really a distance, but useful if all that matters is comparing the result to another one. * @param vec1 The first point @param vec2 The second point @return The squared Euclidean distance 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
squaredEuclideanDistance	TokenNameIdentifier	 squared Euclidean Distance
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vec1	TokenNameIdentifier	 vec1
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vec2	TokenNameIdentifier	 vec2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
vec1	TokenNameIdentifier	 vec1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
vec1	TokenNameIdentifier	 vec1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
vec2	TokenNameIdentifier	 vec2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Computes the haversine distance between two points. The arguments are in radians and provided in lat,lon order. * @param y1 The y coordinate of the first point, in radians * @param x1 The x coordinate of the first point, in radians * @param y2 The y coordinate of the second point, in radians * @param x2 The x coordinate of the second point, in radians * @param radius The radius of the sphere * @return The distance between the two points, as determined by the haversine formula. */	TokenNameCOMMENT_JAVADOC	 Computes the haversine distance between two points. The arguments are in radians and provided in lat,lon order. @param y1 The y coordinate of the first point, in radians @param x1 The x coordinate of the first point, in radians @param y2 The y coordinate of the second point, in radians @param x2 The x coordinate of the second point, in radians @param radius The radius of the sphere @return The distance between the two points, as determined by the haversine formula. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
haversine	TokenNameIdentifier	 haversine
(	TokenNameLPAREN	
double	TokenNamedouble	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
double	TokenNamedouble	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
double	TokenNamedouble	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
double	TokenNamedouble	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
double	TokenNamedouble	
radius	TokenNameIdentifier	 radius
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//make sure they aren't all the same, as then we can just return 0 	TokenNameCOMMENT_LINE	make sure they aren't all the same, as then we can just return 0 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
!=	TokenNameNOT_EQUAL	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
!=	TokenNameNOT_EQUAL	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
diffX	TokenNameIdentifier	 diff X
=	TokenNameEQUAL	
x1	TokenNameIdentifier	 x1
-	TokenNameMINUS	
x2	TokenNameIdentifier	 x2
;	TokenNameSEMICOLON	
double	TokenNamedouble	
diffY	TokenNameIdentifier	 diff Y
=	TokenNameEQUAL	
y1	TokenNameIdentifier	 y1
-	TokenNameMINUS	
y2	TokenNameIdentifier	 y2
;	TokenNameSEMICOLON	
double	TokenNamedouble	
hsinX	TokenNameIdentifier	 hsin X
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
diffX	TokenNameIdentifier	 diff X
*	TokenNameMULTIPLY	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
hsinY	TokenNameIdentifier	 hsin Y
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
diffY	TokenNameIdentifier	 diff Y
*	TokenNameMULTIPLY	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
hsinY	TokenNameIdentifier	 hsin Y
*	TokenNameMULTIPLY	
hsinY	TokenNameIdentifier	 hsin Y
+	TokenNamePLUS	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
hsinX	TokenNameIdentifier	 hsin X
*	TokenNameMULTIPLY	
hsinX	TokenNameIdentifier	 hsin X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
radius	TokenNameIdentifier	 radius
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
atan2	TokenNameIdentifier	 atan2
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a string containing <i>dimension</i> values encoded in it, separated by commas, return a String array of length <i>dimension</i> * containing the values. * * @param out A preallocated array. Must be size dimension. If it is not it will be resized. * @param externalVal The value to parse * @param dimension The expected number of values for the point * @return An array of the values that make up the point (aka vector) * @throws org.apache.lucene.spatial.tier.InvalidGeoException if the dimension specified does not match the number of values in the externalValue. */	TokenNameCOMMENT_JAVADOC	 Given a string containing <i>dimension</i> values encoded in it, separated by commas, return a String array of length <i>dimension</i> containing the values. * @param out A preallocated array. Must be size dimension. If it is not it will be resized. @param externalVal The value to parse @param dimension The expected number of values for the point @return An array of the values that make up the point (aka vector) @throws org.apache.lucene.spatial.tier.InvalidGeoException if the dimension specified does not match the number of values in the externalValue. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parsePoint	TokenNameIdentifier	 parse Point
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
externalVal	TokenNameIdentifier	 external Val
,	TokenNameCOMMA	
int	TokenNameint	
dimension	TokenNameIdentifier	 dimension
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
{	TokenNameLBRACE	
//TODO: Should we support sparse vectors? 	TokenNameCOMMENT_LINE	TODO: Should we support sparse vectors? 
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
dimension	TokenNameIdentifier	 dimension
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
dimension	TokenNameIdentifier	 dimension
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
dimension	TokenNameIdentifier	 dimension
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//we have a single point, dimension better be 1 	TokenNameCOMMENT_LINE	we have a single point, dimension better be 1 
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//if it is zero, that is an error 	TokenNameCOMMENT_LINE	if it is zero, that is an error 
//Parse out a comma separated list of point values, as in: 73.5,89.2,7773.4 	TokenNameCOMMENT_LINE	Parse out a comma separated list of point values, as in: 73.5,89.2,7773.4 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
dimension	TokenNameIdentifier	 dimension
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
end	TokenNameIdentifier	 end
&&	TokenNameAND_AND	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
>	TokenNameGREATER	
start	TokenNameIdentifier	 start
&&	TokenNameAND_AND	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
end	TokenNameIdentifier	 end
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
dimension	TokenNameIdentifier	 dimension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
(	TokenNameLPAREN	
"incompatible dimension ("	TokenNameStringLiteral	incompatible dimension (
+	TokenNamePLUS	
dimension	TokenNameIdentifier	 dimension
+	TokenNamePLUS	
") and values ("	TokenNameStringLiteral	) and values (
+	TokenNamePLUS	
externalVal	TokenNameIdentifier	 external Val
+	TokenNamePLUS	
"). Only "	TokenNameStringLiteral	). Only 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" values specified"	TokenNameStringLiteral	 values specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a string containing <i>dimension</i> values encoded in it, separated by commas, return a double array of length <i>dimension</i> * containing the values. * * @param out A preallocated array. Must be size dimension. If it is not it will be resized. * @param externalVal The value to parse * @param dimension The expected number of values for the point * @return An array of the values that make up the point (aka vector) * @throws InvalidGeoException if the dimension specified does not match the number of values in the externalValue. */	TokenNameCOMMENT_JAVADOC	 Given a string containing <i>dimension</i> values encoded in it, separated by commas, return a double array of length <i>dimension</i> containing the values. * @param out A preallocated array. Must be size dimension. If it is not it will be resized. @param externalVal The value to parse @param dimension The expected number of values for the point @return An array of the values that make up the point (aka vector) @throws InvalidGeoException if the dimension specified does not match the number of values in the externalValue. 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parsePointDouble	TokenNameIdentifier	 parse Point Double
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
externalVal	TokenNameIdentifier	 external Val
,	TokenNameCOMMA	
int	TokenNameint	
dimension	TokenNameIdentifier	 dimension
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
dimension	TokenNameIdentifier	 dimension
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
dimension	TokenNameIdentifier	 dimension
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
dimension	TokenNameIdentifier	 dimension
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//we have a single point, dimension better be 1 	TokenNameCOMMENT_LINE	we have a single point, dimension better be 1 
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
parseDouble	TokenNameIdentifier	 parse Double
(	TokenNameLPAREN	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//if it is zero, that is an error 	TokenNameCOMMENT_LINE	if it is zero, that is an error 
//Parse out a comma separated list of point values, as in: 73.5,89.2,7773.4 	TokenNameCOMMENT_LINE	Parse out a comma separated list of point values, as in: 73.5,89.2,7773.4 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
dimension	TokenNameIdentifier	 dimension
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//TODO: abstract common code with other parsePoint 	TokenNameCOMMENT_LINE	TODO: abstract common code with other parsePoint 
while	TokenNamewhile	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
end	TokenNameIdentifier	 end
&&	TokenNameAND_AND	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
>	TokenNameGREATER	
start	TokenNameIdentifier	 start
&&	TokenNameAND_AND	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
end	TokenNameIdentifier	 end
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
parseDouble	TokenNameIdentifier	 parse Double
(	TokenNameLPAREN	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
externalVal	TokenNameIdentifier	 external Val
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
dimension	TokenNameIdentifier	 dimension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
(	TokenNameLPAREN	
"incompatible dimension ("	TokenNameStringLiteral	incompatible dimension (
+	TokenNamePLUS	
dimension	TokenNameIdentifier	 dimension
+	TokenNamePLUS	
") and values ("	TokenNameStringLiteral	) and values (
+	TokenNamePLUS	
externalVal	TokenNameIdentifier	 external Val
+	TokenNamePLUS	
"). Only "	TokenNameStringLiteral	). Only 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" values specified"	TokenNameStringLiteral	 values specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseLatitudeLongitude	TokenNameIdentifier	 parse Latitude Longitude
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
latLonStr	TokenNameIdentifier	 lat Lon Str
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
parseLatitudeLongitude	TokenNameIdentifier	 parse Latitude Longitude
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
latLonStr	TokenNameIdentifier	 lat Lon Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * extract (by calling {@link #parsePoint(String[], String, int)} and validate the latitude and longitude contained * in the String by making sure the latitude is between 90 & -90 and longitude is between -180 and 180. * <p/> * The latitude is assumed to be the first part of the string and the longitude the second part. * * @param latLon A preallocated array to hold the result * @param latLonStr The string to parse. Latitude is the first value, longitude is the second. * @return The lat long * @throws InvalidGeoException if there was an error parsing */	TokenNameCOMMENT_JAVADOC	 extract (by calling {@link #parsePoint(String[], String, int)} and validate the latitude and longitude contained in the String by making sure the latitude is between 90 & -90 and longitude is between -180 and 180. <p/> The latitude is assumed to be the first part of the string and the longitude the second part. * @param latLon A preallocated array to hold the result @param latLonStr The string to parse. Latitude is the first value, longitude is the second. @return The lat long @throws InvalidGeoException if there was an error parsing 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseLatitudeLongitude	TokenNameIdentifier	 parse Latitude Longitude
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
latLon	TokenNameIdentifier	 lat Lon
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
latLonStr	TokenNameIdentifier	 lat Lon Str
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
latLon	TokenNameIdentifier	 lat Lon
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
latLon	TokenNameIdentifier	 lat Lon
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toks	TokenNameIdentifier	 toks
=	TokenNameEQUAL	
parsePointDouble	TokenNameIdentifier	 parse Point Double
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
latLonStr	TokenNameIdentifier	 lat Lon Str
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toks	TokenNameIdentifier	 toks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
-	TokenNameMINUS	
90.0	TokenNameDoubleLiteral	
||	TokenNameOR_OR	
toks	TokenNameIdentifier	 toks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
90.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
(	TokenNameLPAREN	
"Invalid latitude: latitudes are range -90 to 90: provided lat: ["	TokenNameStringLiteral	Invalid latitude: latitudes are range -90 to 90: provided lat: [
+	TokenNamePLUS	
toks	TokenNameIdentifier	 toks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
latLon	TokenNameIdentifier	 lat Lon
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
toks	TokenNameIdentifier	 toks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
toks	TokenNameIdentifier	 toks
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
-	TokenNameMINUS	
180.0	TokenNameDoubleLiteral	
||	TokenNameOR_OR	
toks	TokenNameIdentifier	 toks
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
180.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
(	TokenNameLPAREN	
"Invalid longitude: longitudes are range -180 to 180: provided lon: ["	TokenNameStringLiteral	Invalid longitude: longitudes are range -180 to 180: provided lon: [
+	TokenNamePLUS	
toks	TokenNameIdentifier	 toks
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
latLon	TokenNameIdentifier	 lat Lon
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
toks	TokenNameIdentifier	 toks
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
latLon	TokenNameIdentifier	 lat Lon
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
