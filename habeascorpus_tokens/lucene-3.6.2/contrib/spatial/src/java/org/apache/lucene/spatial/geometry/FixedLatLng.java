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
/** * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
extends	TokenNameextends	
LatLng	TokenNameIdentifier	 Lat Lng
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
SCALE_FACTOR	TokenNameIdentifier	 SCALE  FACTOR
=	TokenNameEQUAL	
1000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SCALE_FACTOR_INT	TokenNameIdentifier	 SCALE  FACTOR  INT
=	TokenNameEQUAL	
1000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
lng	TokenNameIdentifier	 lng
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
normalized	TokenNameIdentifier	 normalized
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
(	TokenNameLPAREN	
int	TokenNameint	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
int	TokenNameint	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setLat	TokenNameIdentifier	 set Lat
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLng	TokenNameIdentifier	 set Lng
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
(	TokenNameLPAREN	
LatLng	TokenNameIdentifier	 Lat Lng
ll	TokenNameIdentifier	 ll
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lat	TokenNameIdentifier	 lat
=	TokenNameEQUAL	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getFixedLat	TokenNameIdentifier	 get Fixed Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getFixedLng	TokenNameIdentifier	 get Fixed Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
setLat	TokenNameIdentifier	 set Lat
(	TokenNameLPAREN	
int	TokenNameint	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
>	TokenNameGREATER	
90	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
SCALE_FACTOR	TokenNameIdentifier	 SCALE  FACTOR
||	TokenNameOR_OR	
lat	TokenNameIdentifier	 lat
<	TokenNameLESS	
-	TokenNameMINUS	
90	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
SCALE_FACTOR	TokenNameIdentifier	 SCALE  FACTOR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Illegal lattitude"	TokenNameStringLiteral	Illegal lattitude
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lat	TokenNameIdentifier	 lat
=	TokenNameEQUAL	
lat	TokenNameIdentifier	 lat
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
setLng	TokenNameIdentifier	 set Lng
(	TokenNameLPAREN	
int	TokenNameint	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
lng	TokenNameIdentifier	 lng
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
fixedToDouble	TokenNameIdentifier	 fixed To Double
(	TokenNameLPAREN	
int	TokenNameint	
fixed	TokenNameIdentifier	 fixed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fixed	TokenNameIdentifier	 fixed
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
SCALE_FACTOR	TokenNameIdentifier	 SCALE  FACTOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
doubleToFixed	TokenNameIdentifier	 double To Fixed
(	TokenNameLPAREN	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
*	TokenNameMULTIPLY	
SCALE_FACTOR	TokenNameIdentifier	 SCALE  FACTOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
LatLng	TokenNameIdentifier	 Lat Lng
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getFixedLat	TokenNameIdentifier	 get Fixed Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lat	TokenNameIdentifier	 lat
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getFixedLng	TokenNameIdentifier	 get Fixed Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lng	TokenNameIdentifier	 lng
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
double	TokenNamedouble	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fixedToDouble	TokenNameIdentifier	 fixed To Double
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
double	TokenNamedouble	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fixedToDouble	TokenNameIdentifier	 fixed To Double
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isFixedPoint	TokenNameIdentifier	 is Fixed Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
toFixed	TokenNameIdentifier	 to Fixed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
toFloat	TokenNameIdentifier	 to Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
normalized	TokenNameIdentifier	 normalized
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
>=	TokenNameGREATER_EQUAL	
-	TokenNameMINUS	
180	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
SCALE_FACTOR_INT	TokenNameIdentifier	 SCALE  FACTOR  INT
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
<=	TokenNameLESS_EQUAL	
180	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
SCALE_FACTOR_INT	TokenNameIdentifier	 SCALE  FACTOR  INT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
LatLng	TokenNameIdentifier	 Lat Lng
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isNormalized	TokenNameIdentifier	 is Normalized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
int	TokenNameint	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
360	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
SCALE_FACTOR_INT	TokenNameIdentifier	 SCALE  FACTOR  INT
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
-	TokenNameMINUS	
360	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
SCALE_FACTOR_INT	TokenNameIdentifier	 SCALE  FACTOR  INT
;	TokenNameSEMICOLON	
int	TokenNameint	
newLng	TokenNameIdentifier	 new Lng
=	TokenNameEQUAL	
lng	TokenNameIdentifier	 lng
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
newLng	TokenNameIdentifier	 new Lng
<=	TokenNameLESS_EQUAL	
-	TokenNameMINUS	
180	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
SCALE_FACTOR_INT	TokenNameIdentifier	 SCALE  FACTOR  INT
||	TokenNameOR_OR	
newLng	TokenNameIdentifier	 new Lng
>=	TokenNameGREATER_EQUAL	
180	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
SCALE_FACTOR_INT	TokenNameIdentifier	 SCALE  FACTOR  INT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newLng	TokenNameIdentifier	 new Lng
+=	TokenNamePLUS_EQUAL	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
newLng	TokenNameIdentifier	 new Lng
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
normalized	TokenNameIdentifier	 normalized
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
LatLng	TokenNameIdentifier	 Lat Lng
calculateMidpoint	TokenNameIdentifier	 calculate Midpoint
(	TokenNameLPAREN	
LatLng	TokenNameIdentifier	 Lat Lng
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
+	TokenNamePLUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getFixedLat	TokenNameIdentifier	 get Fixed Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
+	TokenNamePLUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getFixedLng	TokenNameIdentifier	 get Fixed Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
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
prime	TokenNameIdentifier	 prime
+	TokenNamePLUS	
lat	TokenNameIdentifier	 lat
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
lng	TokenNameIdentifier	 lng
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
normalized	TokenNameIdentifier	 normalized
?	TokenNameQUESTION	
1231	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1237	TokenNameIntegerLiteral	
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
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
normalized	TokenNameIdentifier	 normalized
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
normalized	TokenNameIdentifier	 normalized
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
