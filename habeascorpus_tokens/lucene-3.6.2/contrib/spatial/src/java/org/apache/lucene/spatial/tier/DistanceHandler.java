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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
spatial	TokenNameIdentifier	 spatial
.	TokenNameDOT	
DistanceUtils	TokenNameIdentifier	 Distance Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Provide a high level access point to distances * Used by DistanceSortSource and DistanceQuery * * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> * */	TokenNameCOMMENT_JAVADOC	 Provide a high level access point to distances Used by DistanceSortSource and DistanceQuery * <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
DistanceHandler	TokenNameIdentifier	 Distance Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
enum	TokenNameenum	
Precision	TokenNameIdentifier	 Precision
{	TokenNameLBRACE	
EXACT	TokenNameIdentifier	 EXACT
,	TokenNameCOMMA	
TWOFEET	TokenNameIdentifier	 TWOFEET
,	TokenNameCOMMA	
TWENTYFEET	TokenNameIdentifier	 TWENTYFEET
,	TokenNameCOMMA	
TWOHUNDREDFEET	TokenNameIdentifier	 TWOHUNDREDFEET
}	TokenNameRBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
distances	TokenNameIdentifier	 distances
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
distanceLookupCache	TokenNameIdentifier	 distance Lookup Cache
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Precision	TokenNameIdentifier	 Precision
precise	TokenNameIdentifier	 precise
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DistanceHandler	TokenNameIdentifier	 Distance Handler
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
distances	TokenNameIdentifier	 distances
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
distanceLookupCache	TokenNameIdentifier	 distance Lookup Cache
,	TokenNameCOMMA	
Precision	TokenNameIdentifier	 Precision
precise	TokenNameIdentifier	 precise
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
distances	TokenNameIdentifier	 distances
=	TokenNameEQUAL	
distances	TokenNameIdentifier	 distances
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
distanceLookupCache	TokenNameIdentifier	 distance Lookup Cache
=	TokenNameEQUAL	
distanceLookupCache	TokenNameIdentifier	 distance Lookup Cache
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
precise	TokenNameIdentifier	 precise
=	TokenNameEQUAL	
precise	TokenNameIdentifier	 precise
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
getPrecision	TokenNameIdentifier	 get Precision
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
Precision	TokenNameIdentifier	 Precision
thisPrecise	TokenNameIdentifier	 this Precise
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
thisPrecise	TokenNameIdentifier	 this Precise
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
dif	TokenNameIdentifier	 dif
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
thisPrecise	TokenNameIdentifier	 this Precise
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
EXACT	TokenNameIdentifier	 EXACT
:	TokenNameCOLON	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
case	TokenNamecase	
TWOFEET	TokenNameIdentifier	 TWOFEET
:	TokenNameCOLON	
dif	TokenNameIdentifier	 dif
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
%	TokenNameREMAINDER	
0.0001	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TWENTYFEET	TokenNameIdentifier	 TWENTYFEET
:	TokenNameCOLON	
dif	TokenNameIdentifier	 dif
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
%	TokenNameREMAINDER	
0.001	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TWOHUNDREDFEET	TokenNameIdentifier	 TWOHUNDREDFEET
:	TokenNameCOLON	
dif	TokenNameIdentifier	 dif
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
%	TokenNameREMAINDER	
0.01	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
dif	TokenNameIdentifier	 dif
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Precision	TokenNameIdentifier	 Precision
getPrecision	TokenNameIdentifier	 get Precision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
precise	TokenNameIdentifier	 precise
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
int	TokenNameint	
docid	TokenNameIdentifier	 docid
,	TokenNameCOMMA	
double	TokenNamedouble	
centerLat	TokenNameIdentifier	 center Lat
,	TokenNameCOMMA	
double	TokenNamedouble	
centerLng	TokenNameIdentifier	 center Lng
,	TokenNameCOMMA	
double	TokenNamedouble	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
double	TokenNamedouble	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check to see if we have distances 	TokenNameCOMMENT_LINE	check to see if we have distances 
// if not calculate the distance 	TokenNameCOMMENT_LINE	if not calculate the distance 
if	TokenNameif	
(	TokenNameLPAREN	
distances	TokenNameIdentifier	 distances
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
getDistanceMi	TokenNameIdentifier	 get Distance Mi
(	TokenNameLPAREN	
centerLat	TokenNameIdentifier	 center Lat
,	TokenNameCOMMA	
centerLng	TokenNameIdentifier	 center Lng
,	TokenNameCOMMA	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check to see if the doc id has a cached distance 	TokenNameCOMMENT_LINE	check to see if the doc id has a cached distance 
Double	TokenNameIdentifier	 Double
docd	TokenNameIdentifier	 docd
=	TokenNameEQUAL	
distances	TokenNameIdentifier	 distances
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
docid	TokenNameIdentifier	 docid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docd	TokenNameIdentifier	 docd
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docd	TokenNameIdentifier	 docd
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//check to see if we have a precision code 	TokenNameCOMMENT_LINE	check to see if we have a precision code 
// and if another lat/long has been calculated at 	TokenNameCOMMENT_LINE	and if another lat/long has been calculated at 
// that rounded location 	TokenNameCOMMENT_LINE	that rounded location 
if	TokenNameif	
(	TokenNameLPAREN	
precise	TokenNameIdentifier	 precise
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
xLat	TokenNameIdentifier	 x Lat
=	TokenNameEQUAL	
getPrecision	TokenNameIdentifier	 get Precision
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
precise	TokenNameIdentifier	 precise
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
xLng	TokenNameIdentifier	 x Lng
=	TokenNameEQUAL	
getPrecision	TokenNameIdentifier	 get Precision
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
,	TokenNameCOMMA	
precise	TokenNameIdentifier	 precise
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
xLat	TokenNameIdentifier	 x Lat
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
xLng	TokenNameIdentifier	 x Lng
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Double	TokenNameIdentifier	 Double
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
distanceLookupCache	TokenNameIdentifier	 distance Lookup Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//all else fails calculate the distances 	TokenNameCOMMENT_LINE	all else fails calculate the distances 
return	TokenNamereturn	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
getDistanceMi	TokenNameIdentifier	 get Distance Mi
(	TokenNameLPAREN	
centerLat	TokenNameIdentifier	 center Lat
,	TokenNameCOMMA	
centerLng	TokenNameIdentifier	 center Lng
,	TokenNameCOMMA	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
