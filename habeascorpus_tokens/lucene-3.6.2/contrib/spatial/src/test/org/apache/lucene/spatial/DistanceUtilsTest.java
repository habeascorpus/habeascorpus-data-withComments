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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * * **/	TokenNameCOMMENT_JAVADOC	 * *
public	TokenNamepublic	
class	TokenNameclass	
DistanceUtilsTest	TokenNameIdentifier	 Distance Utils Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBoxCorner	TokenNameIdentifier	 test Box Corner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
zero	TokenNameIdentifier	 zero
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
zeroOne	TokenNameIdentifier	 zero One
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oneOne	TokenNameIdentifier	 one One
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pt1	TokenNameIdentifier	 pt1
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
110.3	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
vectorBoxCorner	TokenNameIdentifier	 vector Box Corner
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
vectorBoxCorner	TokenNameIdentifier	 vector Box Corner
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
vectorBoxCorner	TokenNameIdentifier	 vector Box Corner
(	TokenNameLPAREN	
oneOne	TokenNameIdentifier	 one One
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
vectorBoxCorner	TokenNameIdentifier	 vector Box Corner
(	TokenNameLPAREN	
zeroOne	TokenNameIdentifier	 zero One
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
vectorBoxCorner	TokenNameIdentifier	 vector Box Corner
(	TokenNameLPAREN	
pt1	TokenNameIdentifier	 pt1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.1	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
111.3	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.1	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
vectorBoxCorner	TokenNameIdentifier	 vector Box Corner
(	TokenNameLPAREN	
pt1	TokenNameIdentifier	 pt1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.1	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
109.3	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.1	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNormLatLon	TokenNameIdentifier	 test Norm Lat Lon
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLatLonCorner	TokenNameIdentifier	 test Lat Lon Corner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
zero	TokenNameIdentifier	 zero
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
zero45	TokenNameIdentifier	 zero45
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEG_45_AS_RADS	TokenNameIdentifier	 DEG 45  AS  RADS
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
// 00°38′09″N, 000°38′09″E 	TokenNameCOMMENT_LINE	00°38′09″N, 000°38′09″E 
//Verify at http://www.movable-type.co.uk/scripts/latlong.html 	TokenNameCOMMENT_LINE	Verify at http://www.movable-type.co.uk/scripts/latlong.html 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
latLonCorner	TokenNameIdentifier	 lat Lon Corner
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0.63583	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0.63583	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
latLonCornerDegs	TokenNameIdentifier	 lat Lon Corner Degs
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 00°38′09″N, 000°38′09″E 	TokenNameCOMMENT_LINE	00°38′09″N, 000°38′09″E 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0.63583	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0.63583	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
latLonCornerDegs	TokenNameIdentifier	 lat Lon Corner Degs
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 00°38′09″N, 000°38′09″E 	TokenNameCOMMENT_LINE	00°38′09″N, 000°38′09″E 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
0.63583	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
0.63583	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//test some edge cases 	TokenNameCOMMENT_LINE	test some edge cases 
//89°16′02″N, 060°12′35″E 	TokenNameCOMMENT_LINE	89°16′02″N, 060°12′35″E 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
latLonCornerDegs	TokenNameIdentifier	 lat Lon Corner Degs
(	TokenNameLPAREN	
89.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
89.26722	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
60.20972	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
latLonCornerDegs	TokenNameIdentifier	 lat Lon Corner Degs
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
179.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0.63583	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
178.36417	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPointBearing	TokenNameIdentifier	 test Point Bearing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
zero	TokenNameIdentifier	 zero
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
zero45	TokenNameIdentifier	 zero45
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
40	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEG_45_AS_RADS	TokenNameIdentifier	 DEG 45  AS  RADS
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
// 00°38′09″N, 000°38′09″E 	TokenNameCOMMENT_LINE	00°38′09″N, 000°38′09″E 
//Verify at http://www.movable-type.co.uk/scripts/latlong.html 	TokenNameCOMMENT_LINE	Verify at http://www.movable-type.co.uk/scripts/latlong.html 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
pointOnBearing	TokenNameIdentifier	 point On Bearing
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEG_45_AS_RADS	TokenNameIdentifier	 DEG 45  AS  RADS
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0.63583	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0.63583	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//should be above the current point at 0.8994°,0.0000° 	TokenNameCOMMENT_LINE	should be above the current point at 0.8994°,0.0000° 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
pointOnBearing	TokenNameIdentifier	 point On Bearing
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0.8994	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//directly below 	TokenNameCOMMENT_LINE	directly below 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
pointOnBearing	TokenNameIdentifier	 point On Bearing
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEG_180_AS_RADS	TokenNameIdentifier	 DEG 180  AS  RADS
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
0.8994	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//0.7183°,0.5414° -- 37 deg bearing 	TokenNameCOMMENT_LINE	0.7183°,0.5414° -- 37 deg bearing 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
pointOnBearing	TokenNameIdentifier	 point On Bearing
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
zero	TokenNameIdentifier	 zero
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0.7183	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0.5414	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
pointOnBearing	TokenNameIdentifier	 point On Bearing
(	TokenNameLPAREN	
zero45	TokenNameIdentifier	 zero45
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
zero45	TokenNameIdentifier	 zero45
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEG_45_AS_RADS	TokenNameIdentifier	 DEG 45  AS  RADS
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//40.6328°,45.8381° 	TokenNameCOMMENT_LINE	40.6328°,45.8381° 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
40.6328	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
45.8381	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
pointOnBearing	TokenNameIdentifier	 point On Bearing
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEG_90_AS_RADS	TokenNameIdentifier	 DEG 90  AS  RADS
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//0.9997°,1.8994° 	TokenNameCOMMENT_LINE	0.9997°,1.8994° 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0.9997	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.8994	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
pointOnBearing	TokenNameIdentifier	 point On Bearing
(	TokenNameLPAREN	
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
-	TokenNameMINUS	
150	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
205	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//-10.1222°,-150.0578° 	TokenNameCOMMENT_LINE	-10.1222°,-150.0578° 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
10.1222	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
150.0578	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
pointOnBearing	TokenNameIdentifier	 point On Bearing
(	TokenNameLPAREN	
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
-	TokenNameMINUS	
150	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
63	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//-9.1797°,-148.3767° 	TokenNameCOMMENT_LINE	-9.1797°,-148.3767° 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
9.1797	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
148.3767	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
pointOnBearing	TokenNameIdentifier	 point On Bearing
(	TokenNameLPAREN	
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
-	TokenNameMINUS	
150	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
3000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
63	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//2.7561°,-126.1281° 	TokenNameCOMMENT_LINE	2.7561°,-126.1281° 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2.7561	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
126.1281	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
DEGREES_TO_RADIANS	TokenNameIdentifier	 DEGREES  TO  RADIANS
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVectorDistance	TokenNameIdentifier	 test Vector Distance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
zero	TokenNameIdentifier	 zero
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
zeroOne	TokenNameIdentifier	 zero One
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oneZero	TokenNameIdentifier	 one Zero
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oneOne	TokenNameIdentifier	 one One
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
distance	TokenNameIdentifier	 distance
;	TokenNameSEMICOLON	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
vectorDistance	TokenNameIdentifier	 vector Distance
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
,	TokenNameCOMMA	
zeroOne	TokenNameIdentifier	 zero One
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
vectorDistance	TokenNameIdentifier	 vector Distance
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
,	TokenNameCOMMA	
oneZero	TokenNameIdentifier	 one Zero
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
vectorDistance	TokenNameIdentifier	 vector Distance
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
,	TokenNameCOMMA	
oneOne	TokenNameIdentifier	 one One
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
squaredEuclideanDistance	TokenNameIdentifier	 squared Euclidean Distance
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
,	TokenNameCOMMA	
oneOne	TokenNameIdentifier	 one One
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHaversine	TokenNameIdentifier	 test Haversine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
double	TokenNamedouble	
distance	TokenNameIdentifier	 distance
;	TokenNameSEMICOLON	
//compare to http://www.movable-type.co.uk/scripts/latlong.html 	TokenNameCOMMENT_LINE	compare to http://www.movable-type.co.uk/scripts/latlong.html 
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
haversine	TokenNameIdentifier	 haversine
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
/	TokenNameDIVIDE	
4.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
/	TokenNameDIVIDE	
4.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
6672.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
haversine	TokenNameIdentifier	 haversine
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3112	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
haversine	TokenNameIdentifier	 haversine
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
157.2	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Try some around stuff 	TokenNameCOMMENT_LINE	Try some around stuff 
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
haversine	TokenNameIdentifier	 haversine
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
222.4	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
haversine	TokenNameIdentifier	 haversine
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
89	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
89	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
179	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
222.4	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
haversine	TokenNameIdentifier	 haversine
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
89	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
49	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
179	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4670	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
haversine	TokenNameIdentifier	 haversine
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
-	TokenNameMINUS	
179	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
179	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
EARTH_MEAN_RADIUS_KM	TokenNameIdentifier	 EARTH  MEAN  RADIUS  KM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
222.4	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testParse	TokenNameIdentifier	 test Parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parse	TokenNameIdentifier	 parse
;	TokenNameSEMICOLON	
parse	TokenNameIdentifier	 parse
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
parsePoint	TokenNameIdentifier	 parse Point
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"89.0,73.2"	TokenNameStringLiteral	89.0,73.2
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"89.0"	TokenNameStringLiteral	89.0
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"73.2"	TokenNameStringLiteral	73.2
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parse	TokenNameIdentifier	 parse
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
parsePoint	TokenNameIdentifier	 parse Point
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"89.0,73.2,-92.3"	TokenNameStringLiteral	89.0,73.2,-92.3
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"89.0"	TokenNameStringLiteral	89.0
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"73.2"	TokenNameStringLiteral	73.2
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"-92.3"	TokenNameStringLiteral	-92.3
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parse	TokenNameIdentifier	 parse
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
parsePoint	TokenNameIdentifier	 parse Point
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
" 89.0 , 73.2 , -92.3 "	TokenNameStringLiteral	 89.0 , 73.2 , -92.3 
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"89.0"	TokenNameStringLiteral	89.0
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"73.2"	TokenNameStringLiteral	73.2
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"-92.3"	TokenNameStringLiteral	-92.3
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
foo	TokenNameIdentifier	 foo
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
parsePoint	TokenNameIdentifier	 parse Point
(	TokenNameLPAREN	
parse	TokenNameIdentifier	 parse
,	TokenNameCOMMA	
"89.0 , 73.2 , -92.3"	TokenNameStringLiteral	89.0 , 73.2 , -92.3
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//should be same piece of memory 	TokenNameCOMMENT_LINE	should be same piece of memory 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
foo	TokenNameIdentifier	 foo
==	TokenNameEQUAL_EQUAL	
parse	TokenNameIdentifier	 parse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"89.0"	TokenNameStringLiteral	89.0
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"73.2"	TokenNameStringLiteral	73.2
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"-92.3"	TokenNameStringLiteral	-92.3
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//array should get automatically resized 	TokenNameCOMMENT_LINE	array should get automatically resized 
parse	TokenNameIdentifier	 parse
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
parsePoint	TokenNameIdentifier	 parse Point
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
"89.0 , 73.2 , -92.3"	TokenNameStringLiteral	89.0 , 73.2 , -92.3
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"89.0"	TokenNameStringLiteral	89.0
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"73.2"	TokenNameStringLiteral	73.2
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"-92.3"	TokenNameStringLiteral	-92.3
,	TokenNameCOMMA	
parse	TokenNameIdentifier	 parse
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
parse	TokenNameIdentifier	 parse
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
parsePoint	TokenNameIdentifier	 parse Point
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"89.0 , "	TokenNameStringLiteral	89.0 , 
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parse	TokenNameIdentifier	 parse
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
parsePoint	TokenNameIdentifier	 parse Point
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
" , 89.0 "	TokenNameStringLiteral	 , 89.0 
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parse	TokenNameIdentifier	 parse
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
parsePoint	TokenNameIdentifier	 parse Point
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dbls	TokenNameIdentifier	 dbls
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
parsePointDouble	TokenNameIdentifier	 parse Point Double
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"89.0 , 73.2 , -92.3"	TokenNameStringLiteral	89.0 , 73.2 , -92.3
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dbls	TokenNameIdentifier	 dbls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
89.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
dbls	TokenNameIdentifier	 dbls
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
73.2	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
dbls	TokenNameIdentifier	 dbls
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.1	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
-	TokenNameMINUS	
92.3	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
dbls	TokenNameIdentifier	 dbls
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.1	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
dbls	TokenNameIdentifier	 dbls
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
parsePointDouble	TokenNameIdentifier	 parse Point Double
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"89.0 , foo , -92.3"	TokenNameStringLiteral	89.0 , foo , -92.3
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
dbls	TokenNameIdentifier	 dbls
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
parseLatitudeLongitude	TokenNameIdentifier	 parse Latitude Longitude
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"89.0 , 73.2 "	TokenNameStringLiteral	89.0 , 73.2 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dbls	TokenNameIdentifier	 dbls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
89.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
dbls	TokenNameIdentifier	 dbls
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.1	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
73.2	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
dbls	TokenNameIdentifier	 dbls
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.1	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//test some bad lat/long pairs 	TokenNameCOMMENT_LINE	test some bad lat/long pairs 
try	TokenNametry	
{	TokenNameLBRACE	
dbls	TokenNameIdentifier	 dbls
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
parseLatitudeLongitude	TokenNameIdentifier	 parse Latitude Longitude
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"189.0 , 73.2 "	TokenNameStringLiteral	189.0 , 73.2 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
dbls	TokenNameIdentifier	 dbls
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
parseLatitudeLongitude	TokenNameIdentifier	 parse Latitude Longitude
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"89.0 , 273.2 "	TokenNameStringLiteral	89.0 , 273.2 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvalidGeoException	TokenNameIdentifier	 Invalid Geo Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
