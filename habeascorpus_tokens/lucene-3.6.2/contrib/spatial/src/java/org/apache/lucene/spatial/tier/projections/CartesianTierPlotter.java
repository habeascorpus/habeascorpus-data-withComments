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
.	TokenNameDOT	
projections	TokenNameIdentifier	 projections
;	TokenNameSEMICOLON	
/** * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
CartesianTierPlotter	TokenNameIdentifier	 Cartesian Tier Plotter
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFALT_FIELD_PREFIX	TokenNameIdentifier	 DEFALT  FIELD  PREFIX
=	TokenNameEQUAL	
"_tier_"	TokenNameStringLiteral	_tier_
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
tierLevel	TokenNameIdentifier	 tier Level
;	TokenNameSEMICOLON	
int	TokenNameint	
tierLength	TokenNameIdentifier	 tier Length
;	TokenNameSEMICOLON	
int	TokenNameint	
tierBoxes	TokenNameIdentifier	 tier Boxes
;	TokenNameSEMICOLON	
int	TokenNameint	
tierVerticalPosDivider	TokenNameIdentifier	 tier Vertical Pos Divider
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IProjector	TokenNameIdentifier	 I Projector
projector	TokenNameIdentifier	 projector
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fieldPrefix	TokenNameIdentifier	 field Prefix
;	TokenNameSEMICOLON	
Double	TokenNameIdentifier	 Double
idd	TokenNameIdentifier	 idd
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
180	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CartesianTierPlotter	TokenNameIdentifier	 Cartesian Tier Plotter
(	TokenNameLPAREN	
int	TokenNameint	
tierLevel	TokenNameIdentifier	 tier Level
,	TokenNameCOMMA	
IProjector	TokenNameIdentifier	 I Projector
projector	TokenNameIdentifier	 projector
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldPrefix	TokenNameIdentifier	 field Prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tierLevel	TokenNameIdentifier	 tier Level
=	TokenNameEQUAL	
tierLevel	TokenNameIdentifier	 tier Level
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
projector	TokenNameIdentifier	 projector
=	TokenNameEQUAL	
projector	TokenNameIdentifier	 projector
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldPrefix	TokenNameIdentifier	 field Prefix
=	TokenNameEQUAL	
fieldPrefix	TokenNameIdentifier	 field Prefix
;	TokenNameSEMICOLON	
setTierLength	TokenNameIdentifier	 set Tier Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTierBoxes	TokenNameIdentifier	 set Tier Boxes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTierVerticalPosDivider	TokenNameIdentifier	 set Tier Vertical Pos Divider
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setTierLength	TokenNameIdentifier	 set Tier Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tierLength	TokenNameIdentifier	 tier Length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
tierLevel	TokenNameIdentifier	 tier Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setTierBoxes	TokenNameIdentifier	 set Tier Boxes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tierBoxes	TokenNameIdentifier	 tier Boxes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
tierLength	TokenNameIdentifier	 tier Length
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get nearest max power of 10 greater than * the tierlen * e.g * tierId of 13 has tierLen 8192 * nearest max power of 10 greater than tierLen * would be 10,000 */	TokenNameCOMMENT_JAVADOC	 Get nearest max power of 10 greater than the tierlen e.g tierId of 13 has tierLen 8192 nearest max power of 10 greater than tierLen would be 10,000 
private	TokenNameprivate	
void	TokenNamevoid	
setTierVerticalPosDivider	TokenNameIdentifier	 set Tier Vertical Pos Divider
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ceiling of log base 10 of tierLen 	TokenNameCOMMENT_LINE	ceiling of log base 10 of tierLen 
tierVerticalPosDivider	TokenNameIdentifier	 tier Vertical Pos Divider
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log10	TokenNameIdentifier	 log10
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
tierLength	TokenNameIdentifier	 tier Length
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
tierVerticalPosDivider	TokenNameIdentifier	 tier Vertical Pos Divider
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tierVerticalPosDivider	TokenNameIdentifier	 tier Vertical Pos Divider
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getTierVerticalPosDivider	TokenNameIdentifier	 get Tier Vertical Pos Divider
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tierVerticalPosDivider	TokenNameIdentifier	 tier Vertical Pos Divider
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * TierBoxId is latitude box id + longitude box id * where latitude box id, and longitude box id are transposed in to position * coordinates. * * @param latitude * @param longitude */	TokenNameCOMMENT_JAVADOC	 TierBoxId is latitude box id + longitude box id where latitude box id, and longitude box id are transposed in to position coordinates. * @param latitude @param longitude 
public	TokenNamepublic	
double	TokenNamedouble	
getTierBoxId	TokenNameIdentifier	 get Tier Box Id
(	TokenNameLPAREN	
double	TokenNamedouble	
latitude	TokenNameIdentifier	 latitude
,	TokenNameCOMMA	
double	TokenNamedouble	
longitude	TokenNameIdentifier	 longitude
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
coords	TokenNameIdentifier	 coords
=	TokenNameEQUAL	
projector	TokenNameIdentifier	 projector
.	TokenNameDOT	
coords	TokenNameIdentifier	 coords
(	TokenNameLPAREN	
latitude	TokenNameIdentifier	 latitude
,	TokenNameCOMMA	
longitude	TokenNameIdentifier	 longitude
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
getBoxId	TokenNameIdentifier	 get Box Id
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
getBoxId	TokenNameIdentifier	 get Box Id
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
tierVerticalPosDivider	TokenNameIdentifier	 tier Vertical Pos Divider
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
getBoxId	TokenNameIdentifier	 get Box Id
(	TokenNameLPAREN	
double	TokenNamedouble	
coord	TokenNameIdentifier	 coord
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
coord	TokenNameIdentifier	 coord
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
idd	TokenNameIdentifier	 idd
/	TokenNameDIVIDE	
this	TokenNamethis	
.	TokenNameDOT	
tierLength	TokenNameIdentifier	 tier Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unused"	TokenNameStringLiteral	unused
)	TokenNameRPAREN	
private	TokenNameprivate	
double	TokenNamedouble	
getBoxId	TokenNameIdentifier	 get Box Id
(	TokenNameLPAREN	
double	TokenNamedouble	
coord	TokenNameIdentifier	 coord
,	TokenNameCOMMA	
int	TokenNameint	
tierLen	TokenNameIdentifier	 tier Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
coord	TokenNameIdentifier	 coord
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
idd	TokenNameIdentifier	 idd
/	TokenNameDIVIDE	
tierLen	TokenNameIdentifier	 tier Len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the string name representing current tier * _localTier&lt;tiedId&gt; */	TokenNameCOMMENT_JAVADOC	 get the string name representing current tier _localTier&lt;tiedId&gt; 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTierFieldName	TokenNameIdentifier	 get Tier Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldPrefix	TokenNameIdentifier	 field Prefix
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
tierLevel	TokenNameIdentifier	 tier Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the string name representing tierId * _localTier&lt;tierId&gt; * @param tierId */	TokenNameCOMMENT_JAVADOC	 get the string name representing tierId _localTier&lt;tierId&gt; @param tierId 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTierFieldName	TokenNameIdentifier	 get Tier Field Name
(	TokenNameLPAREN	
int	TokenNameint	
tierId	TokenNameIdentifier	 tier Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldPrefix	TokenNameIdentifier	 field Prefix
+	TokenNamePLUS	
tierId	TokenNameIdentifier	 tier Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the tier with the best fit for a bounding box * Best fit is defined as the ceiling of * log2 (circumference of earth / distance) * distance is defined as the smallest box fitting * the corner between a radius and a bounding box. * * Distances less than a mile return 15, finer granularity is * in accurate */	TokenNameCOMMENT_JAVADOC	 Find the tier with the best fit for a bounding box Best fit is defined as the ceiling of log2 (circumference of earth / distance) distance is defined as the smallest box fitting the corner between a radius and a bounding box. * Distances less than a mile return 15, finer granularity is in accurate 
public	TokenNamepublic	
int	TokenNameint	
bestFit	TokenNameIdentifier	 best Fit
(	TokenNameLPAREN	
double	TokenNamedouble	
miles	TokenNameIdentifier	 miles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//28,892 a rough circumference of the earth 	TokenNameCOMMENT_LINE	28,892 a rough circumference of the earth 
int	TokenNameint	
circ	TokenNameIdentifier	 circ
=	TokenNameEQUAL	
28892	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
miles	TokenNameIdentifier	 miles
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
corner	TokenNameIdentifier	 corner
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
times	TokenNameIdentifier	 times
=	TokenNameEQUAL	
circ	TokenNameIdentifier	 circ
/	TokenNameDIVIDE	
corner	TokenNameIdentifier	 corner
;	TokenNameSEMICOLON	
int	TokenNameint	
bestFit	TokenNameIdentifier	 best Fit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
log2	TokenNameIdentifier	 log2
(	TokenNameLPAREN	
times	TokenNameIdentifier	 times
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bestFit	TokenNameIdentifier	 best Fit
>	TokenNameGREATER	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 15 is the granularity of about 1 mile 	TokenNameCOMMENT_LINE	15 is the granularity of about 1 mile 
// finer granularity isn't accurate with standard java math 	TokenNameCOMMENT_LINE	finer granularity isn't accurate with standard java math 
return	TokenNamereturn	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bestFit	TokenNameIdentifier	 best Fit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * a log to the base 2 formula * <code>Math.log(value) / Math.log(2)</code> * @param value */	TokenNameCOMMENT_JAVADOC	 a log to the base 2 formula <code>Math.log(value) / Math.log(2)</code> @param value 
public	TokenNamepublic	
double	TokenNamedouble	
log2	TokenNameIdentifier	 log2
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
