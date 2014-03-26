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
/** * Lat-long rect. Instances are mutable. * * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 Lat-long rect. Instances are mutable. * <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
LLRect	TokenNameIdentifier	 LL Rect
{	TokenNameLBRACE	
private	TokenNameprivate	
LatLng	TokenNameIdentifier	 Lat Lng
ll	TokenNameIdentifier	 ll
,	TokenNameCOMMA	
ur	TokenNameIdentifier	 ur
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LLRect	TokenNameIdentifier	 LL Rect
(	TokenNameLPAREN	
LatLng	TokenNameIdentifier	 Lat Lng
ll	TokenNameIdentifier	 ll
,	TokenNameCOMMA	
LatLng	TokenNameIdentifier	 Lat Lng
ur	TokenNameIdentifier	 ur
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
ll	TokenNameIdentifier	 ll
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ur	TokenNameIdentifier	 ur
=	TokenNameEQUAL	
ur	TokenNameIdentifier	 ur
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LLRect	TokenNameIdentifier	 LL Rect
(	TokenNameLPAREN	
LLRect	TokenNameIdentifier	 LL Rect
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ll	TokenNameIdentifier	 ll
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ur	TokenNameIdentifier	 ur
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ur	TokenNameIdentifier	 ur
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the area in units of lat-lng squared. This is a contrived unit * that only has value when comparing to something else. */	TokenNameCOMMENT_JAVADOC	 Return the area in units of lat-lng squared. This is a contrived unit that only has value when comparing to something else. 
public	TokenNamepublic	
double	TokenNamedouble	
area	TokenNameIdentifier	 area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
ur	TokenNameIdentifier	 ur
.	TokenNameDOT	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
ur	TokenNameIdentifier	 ur
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LatLng	TokenNameIdentifier	 Lat Lng
getLowerLeft	TokenNameIdentifier	 get Lower Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ll	TokenNameIdentifier	 ll
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LatLng	TokenNameIdentifier	 Lat Lng
getUpperRight	TokenNameIdentifier	 get Upper Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ur	TokenNameIdentifier	 ur
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
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
ll	TokenNameIdentifier	 ll
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
ur	TokenNameIdentifier	 ur
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LatLng	TokenNameIdentifier	 Lat Lng
getMidpoint	TokenNameIdentifier	 get Midpoint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
calculateMidpoint	TokenNameIdentifier	 calculate Midpoint
(	TokenNameLPAREN	
ur	TokenNameIdentifier	 ur
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Approximates a box centered at the given point with the given width and height in miles. * @param center * @param widthMi * @param heightMi */	TokenNameCOMMENT_JAVADOC	 Approximates a box centered at the given point with the given width and height in miles. @param center @param widthMi @param heightMi 
public	TokenNamepublic	
static	TokenNamestatic	
LLRect	TokenNameIdentifier	 LL Rect
createBox	TokenNameIdentifier	 create Box
(	TokenNameLPAREN	
LatLng	TokenNameIdentifier	 Lat Lng
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
double	TokenNamedouble	
widthMi	TokenNameIdentifier	 width Mi
,	TokenNameCOMMA	
double	TokenNamedouble	
heightMi	TokenNameIdentifier	 height Mi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
widthMi	TokenNameIdentifier	 width Mi
;	TokenNameSEMICOLON	
LatLng	TokenNameIdentifier	 Lat Lng
ur	TokenNameIdentifier	 ur
=	TokenNameEQUAL	
boxCorners	TokenNameIdentifier	 box Corners
(	TokenNameLPAREN	
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
45.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// assume right angles 	TokenNameCOMMENT_LINE	assume right angles 
LatLng	TokenNameIdentifier	 Lat Lng
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
boxCorners	TokenNameIdentifier	 box Corners
(	TokenNameLPAREN	
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
225.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.err.println("boxCorners: ur " + ur.getLat() + ',' + ur.getLng()); 	TokenNameCOMMENT_LINE	System.err.println("boxCorners: ur " + ur.getLat() + ',' + ur.getLng()); 
//System.err.println("boxCorners: cnt " + center.getLat() + ',' + center.getLng()); 	TokenNameCOMMENT_LINE	System.err.println("boxCorners: cnt " + center.getLat() + ',' + center.getLng()); 
//System.err.println("boxCorners: ll " + ll.getLat() + ',' + ll.getLng()); 	TokenNameCOMMENT_LINE	System.err.println("boxCorners: ll " + ll.getLat() + ',' + ll.getLng()); 
return	TokenNamereturn	
new	TokenNamenew	
LLRect	TokenNameIdentifier	 LL Rect
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
,	TokenNameCOMMA	
ur	TokenNameIdentifier	 ur
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a rectangle shape for the bounding box */	TokenNameCOMMENT_JAVADOC	 Returns a rectangle shape for the bounding box 
public	TokenNamepublic	
Rectangle	TokenNameIdentifier	 Rectangle
toRectangle	TokenNameIdentifier	 to Rectangle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ur	TokenNameIdentifier	 ur
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ur	TokenNameIdentifier	 ur
.	TokenNameDOT	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
LatLng	TokenNameIdentifier	 Lat Lng
boxCorners	TokenNameIdentifier	 box Corners
(	TokenNameLPAREN	
LatLng	TokenNameIdentifier	 Lat Lng
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
double	TokenNamedouble	
brngdeg	TokenNameIdentifier	 brngdeg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
R	TokenNameIdentifier	 R
=	TokenNameEQUAL	
3963.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// radius of earth in miles 	TokenNameCOMMENT_LINE	radius of earth in miles 
double	TokenNamedouble	
brng	TokenNameIdentifier	 brng
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
*	TokenNameMULTIPLY	
brngdeg	TokenNameIdentifier	 brngdeg
/	TokenNameDIVIDE	
180	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
lat1	TokenNameIdentifier	 lat1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
*	TokenNameMULTIPLY	
a	TokenNameIdentifier	 a
/	TokenNameDIVIDE	
180	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
lon1	TokenNameIdentifier	 lon1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
*	TokenNameMULTIPLY	
b	TokenNameIdentifier	 b
/	TokenNameDIVIDE	
180	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Haversine formula 	TokenNameCOMMENT_LINE	Haversine formula 
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
lat1	TokenNameIdentifier	 lat1
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
/	TokenNameDIVIDE	
R	TokenNameIdentifier	 R
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
lat1	TokenNameIdentifier	 lat1
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
/	TokenNameDIVIDE	
R	TokenNameIdentifier	 R
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
brng	TokenNameIdentifier	 brng
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
lon2	TokenNameIdentifier	 lon2
=	TokenNameEQUAL	
lon1	TokenNameIdentifier	 lon1
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
atan2	TokenNameIdentifier	 atan2
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
brng	TokenNameIdentifier	 brng
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
/	TokenNameDIVIDE	
R	TokenNameIdentifier	 R
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
lat1	TokenNameIdentifier	 lat1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
/	TokenNameDIVIDE	
R	TokenNameIdentifier	 R
)	TokenNameRPAREN	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
lat1	TokenNameIdentifier	 lat1
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
lat2	TokenNameIdentifier	 lat2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lat2	TokenNameIdentifier	 lat2
*	TokenNameMULTIPLY	
180	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
;	TokenNameSEMICOLON	
lon2	TokenNameIdentifier	 lon2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lon2	TokenNameIdentifier	 lon2
*	TokenNameMULTIPLY	
180	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
;	TokenNameSEMICOLON	
// normalize long first 	TokenNameCOMMENT_LINE	normalize long first 
LatLng	TokenNameIdentifier	 Lat Lng
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
normLng	TokenNameIdentifier	 norm Lng
(	TokenNameLPAREN	
lat2	TokenNameIdentifier	 lat2
,	TokenNameCOMMA	
lon2	TokenNameIdentifier	 lon2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// normalize lat - could flip poles 	TokenNameCOMMENT_LINE	normalize lat - could flip poles 
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
normLat	TokenNameIdentifier	 norm Lat
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ll	TokenNameIdentifier	 ll
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a normalized Lat rectangle shape for the bounding box * If you go over the poles, you need to flip the lng value too */	TokenNameCOMMENT_JAVADOC	 Returns a normalized Lat rectangle shape for the bounding box If you go over the poles, you need to flip the lng value too 
private	TokenNameprivate	
static	TokenNamestatic	
LatLng	TokenNameIdentifier	 Lat Lng
normLat	TokenNameIdentifier	 norm Lat
(	TokenNameLPAREN	
double	TokenNamedouble	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
double	TokenNamedouble	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
>	TokenNameGREATER	
90.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lat	TokenNameIdentifier	 lat
=	TokenNameEQUAL	
90.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
-	TokenNameMINUS	
90.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
lng	TokenNameIdentifier	 lng
+	TokenNamePLUS	
180	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
lng	TokenNameIdentifier	 lng
-	TokenNameMINUS	
180	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
<	TokenNameLESS	
-	TokenNameMINUS	
90.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lat	TokenNameIdentifier	 lat
=	TokenNameEQUAL	
-	TokenNameMINUS	
90.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
+	TokenNamePLUS	
90.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
lng	TokenNameIdentifier	 lng
+	TokenNamePLUS	
180	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
lng	TokenNameIdentifier	 lng
-	TokenNameMINUS	
180	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
LatLng	TokenNameIdentifier	 Lat Lng
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
new	TokenNamenew	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ll	TokenNameIdentifier	 ll
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a normalized Lng rectangle shape for the bounding box */	TokenNameCOMMENT_JAVADOC	 Returns a normalized Lng rectangle shape for the bounding box 
private	TokenNameprivate	
static	TokenNamestatic	
LatLng	TokenNameIdentifier	 Lat Lng
normLng	TokenNameIdentifier	 norm Lng
(	TokenNameLPAREN	
double	TokenNamedouble	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
double	TokenNamedouble	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
>	TokenNameGREATER	
180.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
180.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
-	TokenNameMINUS	
180.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
<	TokenNameLESS	
-	TokenNameMINUS	
180.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
+	TokenNamePLUS	
180.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
180.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LatLng	TokenNameIdentifier	 Lat Lng
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
new	TokenNamenew	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ll	TokenNameIdentifier	 ll
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
ll	TokenNameIdentifier	 ll
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
ll	TokenNameIdentifier	 ll
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
ur	TokenNameIdentifier	 ur
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
ur	TokenNameIdentifier	 ur
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
LLRect	TokenNameIdentifier	 LL Rect
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LLRect	TokenNameIdentifier	 LL Rect
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ll	TokenNameIdentifier	 ll
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ll	TokenNameIdentifier	 ll
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
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ll	TokenNameIdentifier	 ll
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ur	TokenNameIdentifier	 ur
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ur	TokenNameIdentifier	 ur
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
ur	TokenNameIdentifier	 ur
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ur	TokenNameIdentifier	 ur
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
