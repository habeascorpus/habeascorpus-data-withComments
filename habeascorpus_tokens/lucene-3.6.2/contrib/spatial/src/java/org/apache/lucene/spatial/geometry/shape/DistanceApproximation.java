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
/** * Imported from mq java client. No changes made. * * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> * * @deprecated This has been replaced with more accurate * math in {@link LLRect}. This class will be removed in a future release. */	TokenNameCOMMENT_JAVADOC	 Imported from mq java client. No changes made. * <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> * @deprecated This has been replaced with more accurate math in {@link LLRect}. This class will be removed in a future release. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
DistanceApproximation	TokenNameIdentifier	 Distance Approximation
{	TokenNameLBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
m_testLat	TokenNameIdentifier	 m test Lat
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
m_testLng	TokenNameIdentifier	 m test Lng
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
m_mpd	TokenNameIdentifier	 m mpd
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
m_milesPerLngDeg	TokenNameIdentifier	 m miles Per Lng Deg
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
69.170976f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
69.160441f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
69.128838f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
69.076177f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
69.002475f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
68.907753f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
68.792041f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
68.655373f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
68.497792f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
68.319345f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
68.120088f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
67.900079f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
67.659387f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
67.398085f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
67.116253f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
66.813976f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
66.491346f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
66.148462f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
65.785428f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
65.402355f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
64.999359f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
64.576564f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
64.134098f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
63.672096f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
63.190698f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
62.690052f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
62.170310f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
61.631630f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
61.074176f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
60.498118f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
59.903632f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
59.290899f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
58.660106f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
58.011443f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
57.345111f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
56.661310f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
55.960250f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
55.242144f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
54.507211f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
53.755675f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
52.987764f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
52.203713f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
51.403761f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
50.588151f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
49.757131f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
48.910956f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
48.049882f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
47.174172f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
46.284093f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
45.379915f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
44.461915f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
43.530372f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
42.585570f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
41.627796f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
40.657342f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
39.674504f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
38.679582f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
37.672877f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
36.654698f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
35.625354f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
34.585159f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
33.534429f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
32.473485f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
31.402650f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
30.322249f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
29.232613f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
28.134073f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
27.026963f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
25.911621f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
24.788387f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
23.657602f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
22.519612f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
21.374762f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
20.223401f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
19.065881f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
17.902554f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
16.733774f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
15.559897f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
14.381280f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
13.198283f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
12.011266f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
10.820591f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
9.626619f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
8.429716f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
7.230245f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
6.028572f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
4.825062f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
3.620083f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
2.414002f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1.207185f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1.000000f	TokenNameFloatingPointLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
MILES_PER_LATITUDE	TokenNameIdentifier	 MILES  PER  LATITUDE
=	TokenNameEQUAL	
69.170976f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
KILOMETERS_PER_MILE	TokenNameIdentifier	 KILOMETERS  PER  MILE
=	TokenNameEQUAL	
1.609347f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DistanceApproximation	TokenNameIdentifier	 Distance Approximation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTestPoint	TokenNameIdentifier	 set Test Point
(	TokenNameLPAREN	
double	TokenNamedouble	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
double	TokenNamedouble	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_testLat	TokenNameIdentifier	 m test Lat
=	TokenNameEQUAL	
lat	TokenNameIdentifier	 lat
;	TokenNameSEMICOLON	
m_testLng	TokenNameIdentifier	 m test Lng
=	TokenNameEQUAL	
lng	TokenNameIdentifier	 lng
;	TokenNameSEMICOLON	
m_mpd	TokenNameIdentifier	 m mpd
=	TokenNameEQUAL	
m_milesPerLngDeg	TokenNameIdentifier	 m miles Per Lng Deg
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
+	TokenNamePLUS	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Approximate arc distance between 2 lat,lng positions using miles per 	TokenNameCOMMENT_LINE	Approximate arc distance between 2 lat,lng positions using miles per 
// latitude and longitude degree 	TokenNameCOMMENT_LINE	latitude and longitude degree 
public	TokenNamepublic	
double	TokenNamedouble	
getDistanceSq	TokenNameIdentifier	 get Distance Sq
(	TokenNameLPAREN	
double	TokenNamedouble	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
double	TokenNamedouble	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
latMiles	TokenNameIdentifier	 lat Miles
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
-	TokenNameMINUS	
m_testLat	TokenNameIdentifier	 m test Lat
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
MILES_PER_LATITUDE	TokenNameIdentifier	 MILES  PER  LATITUDE
;	TokenNameSEMICOLON	
// Approximate longitude miles using the miles per degree assuming the 	TokenNameCOMMENT_LINE	Approximate longitude miles using the miles per degree assuming the 
// middle latitude/longitude. This is less accurate at high (near 	TokenNameCOMMENT_LINE	middle latitude/longitude. This is less accurate at high (near 
// polar) latitudes but no road network is present at the poles! 	TokenNameCOMMENT_LINE	polar) latitudes but no road network is present at the poles! 
// If we ever have any roads crossing the international date we will 	TokenNameCOMMENT_LINE	If we ever have any roads crossing the international date we will 
// have to worry about that case. 	TokenNameCOMMENT_LINE	have to worry about that case. 
double	TokenNamedouble	
lngMiles	TokenNameIdentifier	 lng Miles
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
-	TokenNameMINUS	
m_testLng	TokenNameIdentifier	 m test Lng
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
m_mpd	TokenNameIdentifier	 m mpd
;	TokenNameSEMICOLON	
// Find the squared distance by the Pythagorean theorem (without sqrt) 	TokenNameCOMMENT_LINE	Find the squared distance by the Pythagorean theorem (without sqrt) 
return	TokenNamereturn	
(	TokenNameLPAREN	
latMiles	TokenNameIdentifier	 lat Miles
*	TokenNameMULTIPLY	
latMiles	TokenNameIdentifier	 lat Miles
+	TokenNamePLUS	
lngMiles	TokenNameIdentifier	 lng Miles
*	TokenNameMULTIPLY	
lngMiles	TokenNameIdentifier	 lng Miles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Approximate arc distance between a segment (with lat,lng endpoints) and 	TokenNameCOMMENT_LINE	Approximate arc distance between a segment (with lat,lng endpoints) and 
// the test position 	TokenNameCOMMENT_LINE	the test position 
public	TokenNamepublic	
double	TokenNamedouble	
getDistanceSq	TokenNameIdentifier	 get Distance Sq
(	TokenNameLPAREN	
double	TokenNamedouble	
lat1	TokenNameIdentifier	 lat1
,	TokenNameCOMMA	
double	TokenNamedouble	
lng1	TokenNameIdentifier	 lng1
,	TokenNameCOMMA	
double	TokenNamedouble	
lat2	TokenNameIdentifier	 lat2
,	TokenNameCOMMA	
double	TokenNamedouble	
lng2	TokenNameIdentifier	 lng2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check if lat1,lng1 is closest point. Construct a vector from point1 	TokenNameCOMMENT_LINE	Check if lat1,lng1 is closest point. Construct a vector from point1 
// to point2 (v1) and another from point 1 to the test point (v2). 	TokenNameCOMMENT_LINE	to point2 (v1) and another from point 1 to the test point (v2). 
// If dot product is negative then point 1 is the closest point 	TokenNameCOMMENT_LINE	If dot product is negative then point 1 is the closest point 
double	TokenNamedouble	
v1y	TokenNameIdentifier	 v1y
=	TokenNameEQUAL	
lat2	TokenNameIdentifier	 lat2
-	TokenNameMINUS	
lat1	TokenNameIdentifier	 lat1
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v1x	TokenNameIdentifier	 v1x
=	TokenNameEQUAL	
lng2	TokenNameIdentifier	 lng2
-	TokenNameMINUS	
lng1	TokenNameIdentifier	 lng1
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v2y	TokenNameIdentifier	 v2y
=	TokenNameEQUAL	
m_testLat	TokenNameIdentifier	 m test Lat
-	TokenNameMINUS	
lat1	TokenNameIdentifier	 lat1
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v2x	TokenNameIdentifier	 v2x
=	TokenNameEQUAL	
m_testLng	TokenNameIdentifier	 m test Lng
-	TokenNameMINUS	
lng1	TokenNameIdentifier	 lng1
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dot	TokenNameIdentifier	 dot
=	TokenNameEQUAL	
v1x	TokenNameIdentifier	 v1x
*	TokenNameMULTIPLY	
v2x	TokenNameIdentifier	 v2x
+	TokenNamePLUS	
v1y	TokenNameIdentifier	 v1y
*	TokenNameMULTIPLY	
v2y	TokenNameIdentifier	 v2y
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dot	TokenNameIdentifier	 dot
<=	TokenNameLESS_EQUAL	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
getDistanceSq	TokenNameIdentifier	 get Distance Sq
(	TokenNameLPAREN	
lat1	TokenNameIdentifier	 lat1
,	TokenNameCOMMA	
lng1	TokenNameIdentifier	 lng1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the component of vector v2 along v1. If component is greater 	TokenNameCOMMENT_LINE	Get the component of vector v2 along v1. If component is greater 
// than 1 then the endpoint is the closest point. 	TokenNameCOMMENT_LINE	than 1 then the endpoint is the closest point. 
double	TokenNamedouble	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
dot	TokenNameIdentifier	 dot
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
v1x	TokenNameIdentifier	 v1x
*	TokenNameMULTIPLY	
v1x	TokenNameIdentifier	 v1x
+	TokenNamePLUS	
v1y	TokenNameIdentifier	 v1y
*	TokenNameMULTIPLY	
v1y	TokenNameIdentifier	 v1y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
getDistanceSq	TokenNameIdentifier	 get Distance Sq
(	TokenNameLPAREN	
lat2	TokenNameIdentifier	 lat2
,	TokenNameCOMMA	
lng2	TokenNameIdentifier	 lng2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Since we are working io lat,lng space we need to find the point 	TokenNameCOMMENT_LINE	Since we are working io lat,lng space we need to find the point 
// along p1->p2 such that q->pt is perpendicular to p1->p2. We 	TokenNameCOMMENT_LINE	along p1->p2 such that q->pt is perpendicular to p1->p2. We 
// then find the distance squared between Q and pt. 	TokenNameCOMMENT_LINE	then find the distance squared between Q and pt. 
return	TokenNamereturn	
getDistanceSq	TokenNameIdentifier	 get Distance Sq
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lat1	TokenNameIdentifier	 lat1
+	TokenNamePLUS	
v1y	TokenNameIdentifier	 v1y
*	TokenNameMULTIPLY	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
lng1	TokenNameIdentifier	 lng1
+	TokenNamePLUS	
v1x	TokenNameIdentifier	 v1x
*	TokenNameMULTIPLY	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Return the number of miles per degree of longitude 	TokenNameCOMMENT_LINE	Return the number of miles per degree of longitude 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
getMilesPerLngDeg	TokenNameIdentifier	 get Miles Per Lng Deg
(	TokenNameLPAREN	
double	TokenNamedouble	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
90.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_milesPerLngDeg	TokenNameIdentifier	 m miles Per Lng Deg
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
+	TokenNamePLUS	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
:	TokenNameCOLON	
69.170976f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
getMilesPerLatDeg	TokenNameIdentifier	 get Miles Per Lat Deg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MILES_PER_LATITUDE	TokenNameIdentifier	 MILES  PER  LATITUDE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
