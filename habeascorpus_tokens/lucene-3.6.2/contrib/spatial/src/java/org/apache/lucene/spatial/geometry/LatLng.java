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
;	TokenNameSEMICOLON	
/** * Abstract base lat-lng class which can manipulate fixed point or floating * point based coordinates. Instances are immutable. * * @see FloatLatLng * * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 Abstract base lat-lng class which can manipulate fixed point or floating point based coordinates. Instances are immutable. * @see FloatLatLng * <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LatLng	TokenNameIdentifier	 Lat Lng
{	TokenNameLBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isFixedPoint	TokenNameIdentifier	 is Fixed Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
LatLng	TokenNameIdentifier	 Lat Lng
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
getFixedLat	TokenNameIdentifier	 get Fixed Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
getFixedLng	TokenNameIdentifier	 get Fixed Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
double	TokenNamedouble	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
double	TokenNamedouble	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
LatLng	TokenNameIdentifier	 Lat Lng
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
toFixed	TokenNameIdentifier	 to Fixed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
toFloat	TokenNameIdentifier	 to Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convert the lat/lng into the cartesian coordinate plane such that all * world coordinates are represented in the first quadrant. * The x dimension corresponds to latitude and y corresponds to longitude. * The translation starts with the normalized latlng and adds 180 to the latitude and * 90 to the longitude (subject to fixed point scaling). */	TokenNameCOMMENT_JAVADOC	 Convert the lat/lng into the cartesian coordinate plane such that all world coordinates are represented in the first quadrant. The x dimension corresponds to latitude and y corresponds to longitude. The translation starts with the normalized latlng and adds 180 to the latitude and 90 to the longitude (subject to fixed point scaling). 
public	TokenNamepublic	
CartesianPoint	TokenNameIdentifier	 Cartesian Point
toCartesian	TokenNameIdentifier	 to Cartesian
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LatLng	TokenNameIdentifier	 Lat Lng
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lat	TokenNameIdentifier	 lat
=	TokenNameEQUAL	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getFixedLat	TokenNameIdentifier	 get Fixed Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getFixedLng	TokenNameIdentifier	 get Fixed Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CartesianPoint	TokenNameIdentifier	 Cartesian Point
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
+	TokenNamePLUS	
180	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
.	TokenNameDOT	
SCALE_FACTOR_INT	TokenNameIdentifier	 SCALE  FACTOR  INT
,	TokenNameCOMMA	
lat	TokenNameIdentifier	 lat
+	TokenNamePLUS	
90	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
.	TokenNameDOT	
SCALE_FACTOR_INT	TokenNameIdentifier	 SCALE  FACTOR  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The inverse of toCartesian(). Always returns a FixedLatLng. * @param pt */	TokenNameCOMMENT_JAVADOC	 The inverse of toCartesian(). Always returns a FixedLatLng. @param pt 
public	TokenNamepublic	
static	TokenNamestatic	
LatLng	TokenNameIdentifier	 Lat Lng
fromCartesian	TokenNameIdentifier	 from Cartesian
(	TokenNameLPAREN	
CartesianPoint	TokenNameIdentifier	 Cartesian Point
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lat	TokenNameIdentifier	 lat
=	TokenNameEQUAL	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
90	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
.	TokenNameDOT	
SCALE_FACTOR_INT	TokenNameIdentifier	 SCALE  FACTOR  INT
;	TokenNameSEMICOLON	
int	TokenNameint	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
180	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
.	TokenNameDOT	
SCALE_FACTOR_INT	TokenNameIdentifier	 SCALE  FACTOR  INT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculates the distance between two lat/lng's in miles. * Imported from mq java client. * * @param ll2 * Second lat,lng position to calculate distance to. * * @return Returns the distance in miles. */	TokenNameCOMMENT_JAVADOC	 Calculates the distance between two lat/lng's in miles. Imported from mq java client. * @param ll2 Second lat,lng position to calculate distance to. * @return Returns the distance in miles. 
public	TokenNamepublic	
double	TokenNamedouble	
arcDistance	TokenNameIdentifier	 arc Distance
(	TokenNameLPAREN	
LatLng	TokenNameIdentifier	 Lat Lng
ll2	TokenNameIdentifier	 ll2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arcDistance	TokenNameIdentifier	 arc Distance
(	TokenNameLPAREN	
ll2	TokenNameIdentifier	 ll2
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
MILES	TokenNameIdentifier	 MILES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculates the distance between two lat/lng's in miles or meters. * Imported from mq java client. Variable references changed to match. * * @param ll2 * Second lat,lng position to calculate distance to. * @param lUnits * Units to calculate distance, defaults to miles * * @return Returns the distance in meters or miles. */	TokenNameCOMMENT_JAVADOC	 Calculates the distance between two lat/lng's in miles or meters. Imported from mq java client. Variable references changed to match. * @param ll2 Second lat,lng position to calculate distance to. @param lUnits Units to calculate distance, defaults to miles * @return Returns the distance in meters or miles. 
public	TokenNamepublic	
double	TokenNamedouble	
arcDistance	TokenNameIdentifier	 arc Distance
(	TokenNameLPAREN	
LatLng	TokenNameIdentifier	 Lat Lng
ll2	TokenNameIdentifier	 ll2
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
lUnits	TokenNameIdentifier	 l Units
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LatLng	TokenNameIdentifier	 Lat Lng
ll1	TokenNameIdentifier	 ll1
=	TokenNameEQUAL	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ll2	TokenNameIdentifier	 ll2
=	TokenNameEQUAL	
ll2	TokenNameIdentifier	 ll2
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
lat1	TokenNameIdentifier	 lat1
=	TokenNameEQUAL	
ll1	TokenNameIdentifier	 ll1
.	TokenNameDOT	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lng1	TokenNameIdentifier	 lng1
=	TokenNameEQUAL	
ll1	TokenNameIdentifier	 ll1
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
lat2	TokenNameIdentifier	 lat2
=	TokenNameEQUAL	
ll2	TokenNameIdentifier	 ll2
.	TokenNameDOT	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lng2	TokenNameIdentifier	 lng2
=	TokenNameEQUAL	
ll2	TokenNameIdentifier	 ll2
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check for same position 	TokenNameCOMMENT_LINE	Check for same position 
if	TokenNameif	
(	TokenNameLPAREN	
lat1	TokenNameIdentifier	 lat1
==	TokenNameEQUAL_EQUAL	
lat2	TokenNameIdentifier	 lat2
&&	TokenNameAND_AND	
lng1	TokenNameIdentifier	 lng1
==	TokenNameEQUAL_EQUAL	
lng2	TokenNameIdentifier	 lng2
)	TokenNameRPAREN	
return	TokenNamereturn	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// Get the m_dLongitude difference. Don't need to worry about 	TokenNameCOMMENT_LINE	Get the m_dLongitude difference. Don't need to worry about 
// crossing 180 since cos(x) = cos(-x) 	TokenNameCOMMENT_LINE	crossing 180 since cos(x) = cos(-x) 
double	TokenNamedouble	
dLon	TokenNameIdentifier	 d Lon
=	TokenNameEQUAL	
lng2	TokenNameIdentifier	 lng2
-	TokenNameMINUS	
lng1	TokenNameIdentifier	 lng1
;	TokenNameSEMICOLON	
double	TokenNamedouble	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
radians	TokenNameIdentifier	 radians
(	TokenNameLPAREN	
90.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
lat1	TokenNameIdentifier	 lat1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
radians	TokenNameIdentifier	 radians
(	TokenNameLPAREN	
90.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
lat2	TokenNameIdentifier	 lat2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cosB	TokenNameIdentifier	 cos B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
radians	TokenNameIdentifier	 radians
(	TokenNameLPAREN	
dLon	TokenNameIdentifier	 d Lon
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
radius	TokenNameIdentifier	 radius
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lUnits	TokenNameIdentifier	 l Units
==	TokenNameEQUAL_EQUAL	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
MILES	TokenNameIdentifier	 MILES
)	TokenNameRPAREN	
?	TokenNameQUESTION	
3963.205	TokenNameDoubleLiteral	
/* MILERADIUSOFEARTH */	TokenNameCOMMENT_BLOCK	 MILERADIUSOFEARTH 
:	TokenNameCOLON	
6378.160187	TokenNameDoubleLiteral	
/* KMRADIUSOFEARTH */	TokenNameCOMMENT_BLOCK	 KMRADIUSOFEARTH 
;	TokenNameSEMICOLON	
// Find angle subtended (with some bounds checking) in radians and 	TokenNameCOMMENT_LINE	Find angle subtended (with some bounds checking) in radians and 
// multiply by earth radius to find the arc distance 	TokenNameCOMMENT_LINE	multiply by earth radius to find the arc distance 
if	TokenNameif	
(	TokenNameLPAREN	
cosB	TokenNameIdentifier	 cos B
<	TokenNameLESS	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
3.14159265358979323846	TokenNameDoubleLiteral	
/* PI */	TokenNameCOMMENT_BLOCK	 PI 
*	TokenNameMULTIPLY	
radius	TokenNameIdentifier	 radius
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cosB	TokenNameIdentifier	 cos B
>=	TokenNameGREATER_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
acos	TokenNameIdentifier	 acos
(	TokenNameLPAREN	
cosB	TokenNameIdentifier	 cos B
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
radius	TokenNameIdentifier	 radius
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
radians	TokenNameIdentifier	 radians
(	TokenNameLPAREN	
double	TokenNamedouble	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
*	TokenNameMULTIPLY	
0.01745329251994	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculate the midpoint between this point an another. Respects fixed vs floating point * @param other */	TokenNameCOMMENT_JAVADOC	 Calculate the midpoint between this point an another. Respects fixed vs floating point @param other 
public	TokenNamepublic	
abstract	TokenNameabstract	
LatLng	TokenNameIdentifier	 Lat Lng
calculateMidpoint	TokenNameIdentifier	 calculate Midpoint
(	TokenNameLPAREN	
LatLng	TokenNameIdentifier	 Lat Lng
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
