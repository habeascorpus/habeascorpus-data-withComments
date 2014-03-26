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
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
extends	TokenNameextends	
LatLng	TokenNameIdentifier	 Lat Lng
{	TokenNameLBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
lat	TokenNameIdentifier	 lat
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
lng	TokenNameIdentifier	 lng
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
normalized	TokenNameIdentifier	 normalized
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
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
||	TokenNameOR_OR	
lat	TokenNameIdentifier	 lat
<	TokenNameLESS	
-	TokenNameMINUS	
90.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Illegal latitude value "	TokenNameStringLiteral	Illegal latitude value 
+	TokenNamePLUS	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lat	TokenNameIdentifier	 lat
=	TokenNameEQUAL	
lat	TokenNameIdentifier	 lat
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
lng	TokenNameIdentifier	 lng
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
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
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
ll	TokenNameIdentifier	 ll
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
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
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
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
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
.	TokenNameDOT	
doubleToFixed	TokenNameIdentifier	 double To Fixed
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
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
FixedLatLng	TokenNameIdentifier	 Fixed Lat Lng
.	TokenNameDOT	
doubleToFixed	TokenNameIdentifier	 double To Fixed
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
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
this	TokenNamethis	
.	TokenNameDOT	
lat	TokenNameIdentifier	 lat
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
this	TokenNamethis	
.	TokenNameDOT	
lng	TokenNameIdentifier	 lng
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
false	TokenNamefalse	
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
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
toFloat	TokenNameIdentifier	 to Float
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
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
<=	TokenNameLESS_EQUAL	
180	TokenNameIntegerLiteral	
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
double	TokenNamedouble	
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
;	TokenNameSEMICOLON	
double	TokenNamedouble	
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
||	TokenNameOR_OR	
newLng	TokenNameIdentifier	 new Lng
>=	TokenNameGREATER_EQUAL	
180	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newLng	TokenNameIdentifier	 new Lng
+=	TokenNamePLUS_EQUAL	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
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
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
+	TokenNamePLUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
+	TokenNamePLUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
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
long	TokenNamelong	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
+	TokenNamePLUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
^	TokenNameXOR	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
^	TokenNameXOR	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
32	TokenNameIntegerLiteral	
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
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FloatLatLng	TokenNameIdentifier	 Float Lat Lng
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
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
