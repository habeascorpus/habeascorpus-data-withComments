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
tier	TokenNameIdentifier	 tier
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
math	TokenNameIdentifier	 math
.	TokenNameDOT	
BigDecimal	TokenNameIdentifier	 Big Decimal
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
math	TokenNameIdentifier	 math
.	TokenNameDOT	
RoundingMode	TokenNameIdentifier	 Rounding Mode
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
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
projections	TokenNameIdentifier	 projections
.	TokenNameDOT	
CartesianTierPlotter	TokenNameIdentifier	 Cartesian Tier Plotter
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
projections	TokenNameIdentifier	 projections
.	TokenNameDOT	
IProjector	TokenNameIdentifier	 I Projector
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
projections	TokenNameIdentifier	 projections
.	TokenNameDOT	
SinusoidalProjector	TokenNameIdentifier	 Sinusoidal Projector
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
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
LLRect	TokenNameIdentifier	 LL Rect
;	TokenNameSEMICOLON	
/** * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
CartesianPolyFilterBuilder	TokenNameIdentifier	 Cartesian Poly Filter Builder
{	TokenNameLBRACE	
// Finer granularity than 1 mile isn't accurate with 	TokenNameCOMMENT_LINE	Finer granularity than 1 mile isn't accurate with 
// standard java math. Also, there's already a 2nd 	TokenNameCOMMENT_LINE	standard java math. Also, there's already a 2nd 
// precise filter, if needed, in DistanceQueryBuilder, 	TokenNameCOMMENT_LINE	precise filter, if needed, in DistanceQueryBuilder, 
// that will make the filtering exact. 	TokenNameCOMMENT_LINE	that will make the filtering exact. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
MILES_FLOOR	TokenNameIdentifier	 MILES  FLOOR
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IProjector	TokenNameIdentifier	 I Projector
projector	TokenNameIdentifier	 projector
=	TokenNameEQUAL	
new	TokenNamenew	
SinusoidalProjector	TokenNameIdentifier	 Sinusoidal Projector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
tierPrefix	TokenNameIdentifier	 tier Prefix
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minTier	TokenNameIdentifier	 min Tier
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxTier	TokenNameIdentifier	 max Tier
;	TokenNameSEMICOLON	
/** * * @param tierPrefix The prefix for the name of the fields containing the tier info * @param minTierIndexed The minimum tier level indexed * @param maxTierIndexed The maximum tier level indexed */	TokenNameCOMMENT_JAVADOC	 * @param tierPrefix The prefix for the name of the fields containing the tier info @param minTierIndexed The minimum tier level indexed @param maxTierIndexed The maximum tier level indexed 
public	TokenNamepublic	
CartesianPolyFilterBuilder	TokenNameIdentifier	 Cartesian Poly Filter Builder
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tierPrefix	TokenNameIdentifier	 tier Prefix
,	TokenNameCOMMA	
int	TokenNameint	
minTierIndexed	TokenNameIdentifier	 min Tier Indexed
,	TokenNameCOMMA	
int	TokenNameint	
maxTierIndexed	TokenNameIdentifier	 max Tier Indexed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tierPrefix	TokenNameIdentifier	 tier Prefix
=	TokenNameEQUAL	
tierPrefix	TokenNameIdentifier	 tier Prefix
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minTier	TokenNameIdentifier	 min Tier
=	TokenNameEQUAL	
minTierIndexed	TokenNameIdentifier	 min Tier Indexed
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxTier	TokenNameIdentifier	 max Tier
=	TokenNameEQUAL	
maxTierIndexed	TokenNameIdentifier	 max Tier Indexed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getBoxShape	TokenNameIdentifier	 get Box Shape
(	TokenNameLPAREN	
double	TokenNamedouble	
latitude	TokenNameIdentifier	 latitude
,	TokenNameCOMMA	
double	TokenNamedouble	
longitude	TokenNameIdentifier	 longitude
,	TokenNameCOMMA	
double	TokenNamedouble	
miles	TokenNameIdentifier	 miles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
miles	TokenNameIdentifier	 miles
<	TokenNameLESS	
MILES_FLOOR	TokenNameIdentifier	 MILES  FLOOR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
miles	TokenNameIdentifier	 miles
=	TokenNameEQUAL	
MILES_FLOOR	TokenNameIdentifier	 MILES  FLOOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LLRect	TokenNameIdentifier	 LL Rect
box1	TokenNameIdentifier	 box1
=	TokenNameEQUAL	
LLRect	TokenNameIdentifier	 LL Rect
.	TokenNameDOT	
createBox	TokenNameIdentifier	 create Box
(	TokenNameLPAREN	
new	TokenNamenew	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
(	TokenNameLPAREN	
latitude	TokenNameIdentifier	 latitude
,	TokenNameCOMMA	
longitude	TokenNameIdentifier	 longitude
)	TokenNameRPAREN	
,	TokenNameCOMMA	
miles	TokenNameIdentifier	 miles
,	TokenNameCOMMA	
miles	TokenNameIdentifier	 miles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LatLng	TokenNameIdentifier	 Lat Lng
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
box1	TokenNameIdentifier	 box1
.	TokenNameDOT	
getLowerLeft	TokenNameIdentifier	 get Lower Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LatLng	TokenNameIdentifier	 Lat Lng
ur	TokenNameIdentifier	 ur
=	TokenNameEQUAL	
box1	TokenNameIdentifier	 box1
.	TokenNameDOT	
getUpperRight	TokenNameIdentifier	 get Upper Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
latY	TokenNameIdentifier	 lat Y
=	TokenNameEQUAL	
ur	TokenNameIdentifier	 ur
.	TokenNameDOT	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
latX	TokenNameIdentifier	 lat X
=	TokenNameEQUAL	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
longY	TokenNameIdentifier	 long Y
=	TokenNameEQUAL	
ur	TokenNameIdentifier	 ur
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
longX	TokenNameIdentifier	 long X
=	TokenNameEQUAL	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
longX2	TokenNameIdentifier	 long X2
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
//These two if checks setup us up to deal with issues around the prime meridian and the 180th meridian 	TokenNameCOMMENT_LINE	These two if checks setup us up to deal with issues around the prime meridian and the 180th meridian 
//In these two cases, we need to get tiles (tiers) from the lower left up to the meridian and then 	TokenNameCOMMENT_LINE	In these two cases, we need to get tiles (tiers) from the lower left up to the meridian and then 
//from the meridan to the upper right 	TokenNameCOMMENT_LINE	from the meridan to the upper right 
//Are we crossing the 180 deg. longitude, if so, we need to do some special things 	TokenNameCOMMENT_LINE	Are we crossing the 180 deg. longitude, if so, we need to do some special things 
if	TokenNameif	
(	TokenNameLPAREN	
ur	TokenNameIdentifier	 ur
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0.0	TokenNameDoubleLiteral	
&&	TokenNameAND_AND	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
longX2	TokenNameIdentifier	 long X2
=	TokenNameEQUAL	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
longX	TokenNameIdentifier	 long X
=	TokenNameEQUAL	
-	TokenNameMINUS	
180.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//are we crossing the prime meridian (0 degrees)? If so, we need to account for it and boxes on both sides 	TokenNameCOMMENT_LINE	are we crossing the prime meridian (0 degrees)? If so, we need to account for it and boxes on both sides 
if	TokenNameif	
(	TokenNameLPAREN	
ur	TokenNameIdentifier	 ur
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0.0	TokenNameDoubleLiteral	
&&	TokenNameAND_AND	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
longX2	TokenNameIdentifier	 long X2
=	TokenNameEQUAL	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
longX	TokenNameIdentifier	 long X
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.err.println("getBoxShape:"+latY+"," + longY); 	TokenNameCOMMENT_LINE	System.err.println("getBoxShape:"+latY+"," + longY); 
//System.err.println("getBoxShape:"+latX+"," + longX); 	TokenNameCOMMENT_LINE	System.err.println("getBoxShape:"+latX+"," + longX); 
CartesianTierPlotter	TokenNameIdentifier	 Cartesian Tier Plotter
ctp	TokenNameIdentifier	 ctp
=	TokenNameEQUAL	
new	TokenNamenew	
CartesianTierPlotter	TokenNameIdentifier	 Cartesian Tier Plotter
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
projector	TokenNameIdentifier	 projector
,	TokenNameCOMMA	
tierPrefix	TokenNameIdentifier	 tier Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bestFit	TokenNameIdentifier	 best Fit
=	TokenNameEQUAL	
ctp	TokenNameIdentifier	 ctp
.	TokenNameDOT	
bestFit	TokenNameIdentifier	 best Fit
(	TokenNameLPAREN	
miles	TokenNameIdentifier	 miles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bestFit	TokenNameIdentifier	 best Fit
<	TokenNameLESS	
minTier	TokenNameIdentifier	 min Tier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bestFit	TokenNameIdentifier	 best Fit
=	TokenNameEQUAL	
minTier	TokenNameIdentifier	 min Tier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bestFit	TokenNameIdentifier	 best Fit
>	TokenNameGREATER	
maxTier	TokenNameIdentifier	 max Tier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bestFit	TokenNameIdentifier	 best Fit
=	TokenNameEQUAL	
maxTier	TokenNameIdentifier	 max Tier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ctp	TokenNameIdentifier	 ctp
=	TokenNameEQUAL	
new	TokenNamenew	
CartesianTierPlotter	TokenNameIdentifier	 Cartesian Tier Plotter
(	TokenNameLPAREN	
bestFit	TokenNameIdentifier	 best Fit
,	TokenNameCOMMA	
projector	TokenNameIdentifier	 projector
,	TokenNameCOMMA	
tierPrefix	TokenNameIdentifier	 tier Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
new	TokenNamenew	
Shape	TokenNameIdentifier	 Shape
(	TokenNameLPAREN	
ctp	TokenNameIdentifier	 ctp
.	TokenNameDOT	
getTierFieldName	TokenNameIdentifier	 get Tier Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// generate shape 	TokenNameCOMMENT_LINE	generate shape 
// iterate from startX->endX 	TokenNameCOMMENT_LINE	iterate from startX->endX 
// iterate from startY -> endY 	TokenNameCOMMENT_LINE	iterate from startY -> endY 
// shape.add(currentLat.currentLong); 	TokenNameCOMMENT_LINE	shape.add(currentLat.currentLong); 
//for the edge cases (prime meridian and the 180th meridian), this call handles all tiles East of the meridian 	TokenNameCOMMENT_LINE	for the edge cases (prime meridian and the 180th meridian), this call handles all tiles East of the meridian 
//for all other cases, it handles the whole set of tiles 	TokenNameCOMMENT_LINE	for all other cases, it handles the whole set of tiles 
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
getShapeLoop	TokenNameIdentifier	 get Shape Loop
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
,	TokenNameCOMMA	
ctp	TokenNameIdentifier	 ctp
,	TokenNameCOMMA	
latX	TokenNameIdentifier	 lat X
,	TokenNameCOMMA	
longX	TokenNameIdentifier	 long X
,	TokenNameCOMMA	
latY	TokenNameIdentifier	 lat Y
,	TokenNameCOMMA	
longY	TokenNameIdentifier	 long Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
longX2	TokenNameIdentifier	 long X2
!=	TokenNameNOT_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
longX	TokenNameIdentifier	 long X
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
longX	TokenNameIdentifier	 long X
=	TokenNameEQUAL	
longX2	TokenNameIdentifier	 long X2
;	TokenNameSEMICOLON	
longY	TokenNameIdentifier	 long Y
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
//handles the lower left longitude to the prime meridian 	TokenNameCOMMENT_LINE	handles the lower left longitude to the prime meridian 
//shape = getShapeLoop(shape, ctp, latX, longX, latY, longY); 	TokenNameCOMMENT_LINE	shape = getShapeLoop(shape, ctp, latX, longX, latY, longY); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//this clause handles the lower left longitude up to the 180 meridian 	TokenNameCOMMENT_LINE	this clause handles the lower left longitude up to the 180 meridian 
longX	TokenNameIdentifier	 long X
=	TokenNameEQUAL	
longX2	TokenNameIdentifier	 long X2
;	TokenNameSEMICOLON	
longY	TokenNameIdentifier	 long Y
=	TokenNameEQUAL	
180.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
getShapeLoop	TokenNameIdentifier	 get Shape Loop
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
,	TokenNameCOMMA	
ctp	TokenNameIdentifier	 ctp
,	TokenNameCOMMA	
latX	TokenNameIdentifier	 lat X
,	TokenNameCOMMA	
longX	TokenNameIdentifier	 long X
,	TokenNameCOMMA	
latY	TokenNameIdentifier	 lat Y
,	TokenNameCOMMA	
longY	TokenNameIdentifier	 long Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.err.println("getBoxShape2:"+latY+"," + longY); 	TokenNameCOMMENT_LINE	System.err.println("getBoxShape2:"+latY+"," + longY); 
//System.err.println("getBoxShape2:"+latX+"," + longX); 	TokenNameCOMMENT_LINE	System.err.println("getBoxShape2:"+latX+"," + longX); 
}	TokenNameRBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getShapeLoop	TokenNameIdentifier	 get Shape Loop
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
,	TokenNameCOMMA	
CartesianTierPlotter	TokenNameIdentifier	 Cartesian Tier Plotter
ctp	TokenNameIdentifier	 ctp
,	TokenNameCOMMA	
double	TokenNamedouble	
latX	TokenNameIdentifier	 lat X
,	TokenNameCOMMA	
double	TokenNamedouble	
longX	TokenNameIdentifier	 long X
,	TokenNameCOMMA	
double	TokenNamedouble	
latY	TokenNameIdentifier	 lat Y
,	TokenNameCOMMA	
double	TokenNamedouble	
longY	TokenNameIdentifier	 long Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("getShapeLoop:"+latY+"," + longY); 	TokenNameCOMMENT_LINE	System.err.println("getShapeLoop:"+latY+"," + longY); 
//System.err.println("getShapeLoop:"+latX+"," + longX); 	TokenNameCOMMENT_LINE	System.err.println("getShapeLoop:"+latX+"," + longX); 
double	TokenNamedouble	
beginAt	TokenNameIdentifier	 begin At
=	TokenNameEQUAL	
ctp	TokenNameIdentifier	 ctp
.	TokenNameDOT	
getTierBoxId	TokenNameIdentifier	 get Tier Box Id
(	TokenNameLPAREN	
latX	TokenNameIdentifier	 lat X
,	TokenNameCOMMA	
longX	TokenNameIdentifier	 long X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
endAt	TokenNameIdentifier	 end At
=	TokenNameEQUAL	
ctp	TokenNameIdentifier	 ctp
.	TokenNameDOT	
getTierBoxId	TokenNameIdentifier	 get Tier Box Id
(	TokenNameLPAREN	
latY	TokenNameIdentifier	 lat Y
,	TokenNameCOMMA	
longY	TokenNameIdentifier	 long Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
beginAt	TokenNameIdentifier	 begin At
>	TokenNameGREATER	
endAt	TokenNameIdentifier	 end At
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
beginAt	TokenNameIdentifier	 begin At
;	TokenNameSEMICOLON	
beginAt	TokenNameIdentifier	 begin At
=	TokenNameEQUAL	
endAt	TokenNameIdentifier	 end At
;	TokenNameSEMICOLON	
endAt	TokenNameIdentifier	 end At
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
tierVert	TokenNameIdentifier	 tier Vert
=	TokenNameEQUAL	
ctp	TokenNameIdentifier	 ctp
.	TokenNameDOT	
getTierVerticalPosDivider	TokenNameIdentifier	 get Tier Vertical Pos Divider
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.err.println(" | "+ beginAt+" | "+ endAt); 	TokenNameCOMMENT_LINE	System.err.println(" | "+ beginAt+" | "+ endAt); 
double	TokenNamedouble	
startX	TokenNameIdentifier	 start X
=	TokenNameEQUAL	
beginAt	TokenNameIdentifier	 begin At
-	TokenNameMINUS	
(	TokenNameLPAREN	
beginAt	TokenNameIdentifier	 begin At
%	TokenNameREMAINDER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
startY	TokenNameIdentifier	 start Y
=	TokenNameEQUAL	
beginAt	TokenNameIdentifier	 begin At
-	TokenNameMINUS	
startX	TokenNameIdentifier	 start X
;	TokenNameSEMICOLON	
//should give a whole number 	TokenNameCOMMENT_LINE	should give a whole number 
double	TokenNamedouble	
endX	TokenNameIdentifier	 end X
=	TokenNameEQUAL	
endAt	TokenNameIdentifier	 end At
-	TokenNameMINUS	
(	TokenNameLPAREN	
endAt	TokenNameIdentifier	 end At
%	TokenNameREMAINDER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
endY	TokenNameIdentifier	 end Y
=	TokenNameEQUAL	
endAt	TokenNameIdentifier	 end At
-	TokenNameMINUS	
endX	TokenNameIdentifier	 end X
;	TokenNameSEMICOLON	
//should give a whole number 	TokenNameCOMMENT_LINE	should give a whole number 
int	TokenNameint	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log10	TokenNameIdentifier	 log10
(	TokenNameLPAREN	
tierVert	TokenNameIdentifier	 tier Vert
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endY	TokenNameIdentifier	 end Y
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
endY	TokenNameIdentifier	 end Y
)	TokenNameRPAREN	
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
scale	TokenNameIdentifier	 scale
,	TokenNameCOMMA	
RoundingMode	TokenNameIdentifier	 Rounding Mode
.	TokenNameDOT	
HALF_EVEN	TokenNameIdentifier	 HALF  EVEN
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startY	TokenNameIdentifier	 start Y
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
startY	TokenNameIdentifier	 start Y
)	TokenNameRPAREN	
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
scale	TokenNameIdentifier	 scale
,	TokenNameCOMMA	
RoundingMode	TokenNameIdentifier	 Rounding Mode
.	TokenNameDOT	
HALF_EVEN	TokenNameIdentifier	 HALF  EVEN
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
xInc	TokenNameIdentifier	 x Inc
=	TokenNameEQUAL	
1.0d	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
tierVert	TokenNameIdentifier	 tier Vert
;	TokenNameSEMICOLON	
xInc	TokenNameIdentifier	 x Inc
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
xInc	TokenNameIdentifier	 x Inc
)	TokenNameRPAREN	
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
scale	TokenNameIdentifier	 scale
,	TokenNameCOMMA	
RoundingMode	TokenNameIdentifier	 Rounding Mode
.	TokenNameDOT	
HALF_EVEN	TokenNameIdentifier	 HALF  EVEN
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.err.println("go from startX:"+startX+" to:" + endX); 	TokenNameCOMMENT_LINE	System.err.println("go from startX:"+startX+" to:" + endX); 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
startX	TokenNameIdentifier	 start X
<=	TokenNameLESS_EQUAL	
endX	TokenNameIdentifier	 end X
;	TokenNameSEMICOLON	
startX	TokenNameIdentifier	 start X
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
itY	TokenNameIdentifier	 it Y
=	TokenNameEQUAL	
startY	TokenNameIdentifier	 start Y
;	TokenNameSEMICOLON	
//System.err.println("go from startY:"+startY+" to:" + endY); 	TokenNameCOMMENT_LINE	System.err.println("go from startY:"+startY+" to:" + endY); 
while	TokenNamewhile	
(	TokenNameLPAREN	
itY	TokenNameIdentifier	 it Y
<=	TokenNameLESS_EQUAL	
endY	TokenNameIdentifier	 end Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//create a boxId 	TokenNameCOMMENT_LINE	create a boxId 
// startX.startY 	TokenNameCOMMENT_LINE	startX.startY 
double	TokenNamedouble	
boxId	TokenNameIdentifier	 box Id
=	TokenNameEQUAL	
startX	TokenNameIdentifier	 start X
+	TokenNamePLUS	
itY	TokenNameIdentifier	 it Y
;	TokenNameSEMICOLON	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
addBox	TokenNameIdentifier	 add Box
(	TokenNameLPAREN	
boxId	TokenNameIdentifier	 box Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.err.println("----"+startX+" and "+itY); 	TokenNameCOMMENT_LINE	System.err.println("----"+startX+" and "+itY); 
//System.err.println("----"+boxId); 	TokenNameCOMMENT_LINE	System.err.println("----"+boxId); 
itY	TokenNameIdentifier	 it Y
+=	TokenNamePLUS_EQUAL	
xInc	TokenNameIdentifier	 x Inc
;	TokenNameSEMICOLON	
// java keeps 0.0001 as 1.0E-1 	TokenNameCOMMENT_LINE	java keeps 0.0001 as 1.0E-1 
// which ends up as 0.00011111 	TokenNameCOMMENT_LINE	which ends up as 0.00011111 
itY	TokenNameIdentifier	 it Y
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
itY	TokenNameIdentifier	 it Y
)	TokenNameRPAREN	
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
scale	TokenNameIdentifier	 scale
,	TokenNameCOMMA	
RoundingMode	TokenNameIdentifier	 Rounding Mode
.	TokenNameDOT	
HALF_EVEN	TokenNameIdentifier	 HALF  EVEN
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
getBoundingArea	TokenNameIdentifier	 get Bounding Area
(	TokenNameLPAREN	
double	TokenNamedouble	
latitude	TokenNameIdentifier	 latitude
,	TokenNameCOMMA	
double	TokenNamedouble	
longitude	TokenNameIdentifier	 longitude
,	TokenNameCOMMA	
double	TokenNamedouble	
miles	TokenNameIdentifier	 miles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
getBoxShape	TokenNameIdentifier	 get Box Shape
(	TokenNameLPAREN	
latitude	TokenNameIdentifier	 latitude
,	TokenNameCOMMA	
longitude	TokenNameIdentifier	 longitude
,	TokenNameCOMMA	
miles	TokenNameIdentifier	 miles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CartesianShapeFilter	TokenNameIdentifier	 Cartesian Shape Filter
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
,	TokenNameCOMMA	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
getTierId	TokenNameIdentifier	 get Tier Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
