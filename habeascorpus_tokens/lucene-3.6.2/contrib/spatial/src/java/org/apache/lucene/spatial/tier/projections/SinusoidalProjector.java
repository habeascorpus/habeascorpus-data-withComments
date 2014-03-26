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
/** * Based on Sinusoidal Projections * Project a latitude / longitude on a 2D cartesian map * <p/> * THIS PROJECTION IS WRONG, but it's not going to be fixed b/c it will break a lot of existing tests, plus we are deprecating * most of the existing spatial and replacing with a more reliable approach. * * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> * * @deprecated Until we can put in place proper tests and a proper fix. */	TokenNameCOMMENT_JAVADOC	 Based on Sinusoidal Projections Project a latitude / longitude on a 2D cartesian map <p/> THIS PROJECTION IS WRONG, but it's not going to be fixed b/c it will break a lot of existing tests, plus we are deprecating most of the existing spatial and replacing with a more reliable approach. * <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> * @deprecated Until we can put in place proper tests and a proper fix. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
SinusoidalProjector	TokenNameIdentifier	 Sinusoidal Projector
implements	TokenNameimplements	
IProjector	TokenNameIdentifier	 I Projector
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
coordsAsString	TokenNameIdentifier	 coords As String
(	TokenNameLPAREN	
double	TokenNamedouble	
latitude	TokenNameIdentifier	 latitude
,	TokenNameCOMMA	
double	TokenNamedouble	
longitude	TokenNameIdentifier	 longitude
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
coords	TokenNameIdentifier	 coords
(	TokenNameLPAREN	
double	TokenNamedouble	
latitude	TokenNameIdentifier	 latitude
,	TokenNameCOMMA	
double	TokenNamedouble	
longitude	TokenNameIdentifier	 longitude
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
rlat	TokenNameIdentifier	 rlat
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
latitude	TokenNameIdentifier	 latitude
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
rlong	TokenNameIdentifier	 rlong
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
longitude	TokenNameIdentifier	 longitude
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
nlat	TokenNameIdentifier	 nlat
=	TokenNameEQUAL	
rlong	TokenNameIdentifier	 rlong
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
rlat	TokenNameIdentifier	 rlat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
r	TokenNameIdentifier	 r
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
nlat	TokenNameIdentifier	 nlat
,	TokenNameCOMMA	
rlong	TokenNameIdentifier	 rlong
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* This whole file should really be:*/	TokenNameCOMMENT_BLOCK	 This whole file should really be:
/** * Based on Sinusoidal Projections * Project a latitude / longitude on a 2D cartesian map using the Prime Meridian as the "central meridian" * * See http://en.wikipedia.org/wiki/Sinusoidal_projection * * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 Based on Sinusoidal Projections Project a latitude / longitude on a 2D cartesian map using the Prime Meridian as the "central meridian" * See http://en.wikipedia.org/wiki/Sinusoidal_projection * <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
/* public class SinusoidalProjector implements IProjector { public String coordsAsString(double latitude, double longitude) { double [] coords = coords(latitude, longitude); return coords[0] + "," + coords[1]; } public double[] coords(double latitude, double longitude) { double rlat = latitude * DistanceUtils.DEGREES_TO_RADIANS; double rlong = longitude * DistanceUtils.DEGREES_TO_RADIANS; double x = rlong * Math.cos(rlat); return new double[]{x, rlat}; } } */	TokenNameCOMMENT_BLOCK	 public class SinusoidalProjector implements IProjector { public String coordsAsString(double latitude, double longitude) { double [] coords = coords(latitude, longitude); return coords[0] + "," + coords[1]; } public double[] coords(double latitude, double longitude) { double rlat = latitude DistanceUtils.DEGREES_TO_RADIANS; double rlong = longitude DistanceUtils.DEGREES_TO_RADIANS; double x = rlong Math.cos(rlat); return new double[]{x, rlat}; } } 
