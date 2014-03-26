/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
/** * A light source placed at the infinity, such that the light angle is * constant over the whole surface. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: DistantLight.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A light source placed at the infinity, such that the light angle is constant over the whole surface. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: DistantLight.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DistantLight	TokenNameIdentifier	 Distant Light
extends	TokenNameextends	
AbstractLight	TokenNameIdentifier	 Abstract Light
{	TokenNameLBRACE	
/** * The azimuth of the distant light, i.e., the angle of the light vector * on the (X, Y) plane */	TokenNameCOMMENT_JAVADOC	 The azimuth of the distant light, i.e., the angle of the light vector on the (X, Y) plane 
private	TokenNameprivate	
double	TokenNamedouble	
azimuth	TokenNameIdentifier	 azimuth
;	TokenNameSEMICOLON	
/** * The elevation of the distant light, i.e., the angle of the light * vector on the (X, Z) plane. */	TokenNameCOMMENT_JAVADOC	 The elevation of the distant light, i.e., the angle of the light vector on the (X, Z) plane. 
private	TokenNameprivate	
double	TokenNamedouble	
elevation	TokenNameIdentifier	 elevation
;	TokenNameSEMICOLON	
/** * Light vector */	TokenNameCOMMENT_JAVADOC	 Light vector 
private	TokenNameprivate	
double	TokenNamedouble	
Lx	TokenNameIdentifier	 Lx
,	TokenNameCOMMA	
Ly	TokenNameIdentifier	 Ly
,	TokenNameCOMMA	
Lz	TokenNameIdentifier	 Lz
;	TokenNameSEMICOLON	
/** * @return the DistantLight's azimuth */	TokenNameCOMMENT_JAVADOC	 @return the DistantLight's azimuth 
public	TokenNamepublic	
double	TokenNamedouble	
getAzimuth	TokenNameIdentifier	 get Azimuth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
azimuth	TokenNameIdentifier	 azimuth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the DistantLight's elevation */	TokenNameCOMMENT_JAVADOC	 @return the DistantLight's elevation 
public	TokenNamepublic	
double	TokenNamedouble	
getElevation	TokenNameIdentifier	 get Elevation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elevation	TokenNameIdentifier	 elevation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DistantLight	TokenNameIdentifier	 Distant Light
(	TokenNameLPAREN	
double	TokenNamedouble	
azimuth	TokenNameIdentifier	 azimuth
,	TokenNameCOMMA	
double	TokenNamedouble	
elevation	TokenNameIdentifier	 elevation
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
azimuth	TokenNameIdentifier	 azimuth
=	TokenNameEQUAL	
azimuth	TokenNameIdentifier	 azimuth
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
elevation	TokenNameIdentifier	 elevation
=	TokenNameEQUAL	
elevation	TokenNameIdentifier	 elevation
;	TokenNameSEMICOLON	
Lx	TokenNameIdentifier	 Lx
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
azimuth	TokenNameIdentifier	 azimuth
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
elevation	TokenNameIdentifier	 elevation
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Ly	TokenNameIdentifier	 Ly
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
azimuth	TokenNameIdentifier	 azimuth
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
elevation	TokenNameIdentifier	 elevation
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Lz	TokenNameIdentifier	 Lz
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
elevation	TokenNameIdentifier	 elevation
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if the light is constant over the whole surface */	TokenNameCOMMENT_JAVADOC	 @return true if the light is constant over the whole surface 
public	TokenNamepublic	
boolean	TokenNameboolean	
isConstant	TokenNameIdentifier	 is Constant
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Computes the light vector in (x, y) * * @param x x-axis coordinate where the light should be computed * @param y y-axis coordinate where the light should be computed * @param L array of length 3 where the result is stored */	TokenNameCOMMENT_JAVADOC	 Computes the light vector in (x, y) * @param x x-axis coordinate where the light should be computed @param y y-axis coordinate where the light should be computed @param L array of length 3 where the result is stored 
public	TokenNamepublic	
void	TokenNamevoid	
getLight	TokenNameIdentifier	 get Light
(	TokenNameLPAREN	
final	TokenNamefinal	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
z	TokenNameIdentifier	 z
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
L	TokenNameIdentifier	 L
)	TokenNameRPAREN	
{	TokenNameLBRACE	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Lx	TokenNameIdentifier	 Lx
;	TokenNameSEMICOLON	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Ly	TokenNameIdentifier	 Ly
;	TokenNameSEMICOLON	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Lz	TokenNameIdentifier	 Lz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a row of the light map, starting at (x, y) with dx * increments, a given width, and z elevations stored in the * fourth component on the N array. * * @param x x-axis coordinate where the light should be computed * @param y y-axis coordinate where the light should be computed * @param dx delta x for computing light vectors in user space * @param width number of samples to compute on the x axis * @param z array containing the z elevation for all the points * @param lightRow array to store the light info to, if null it will * be allocated for you and returned. * * @return an array width columns where each element * is an array of three components representing the x, y and z * components of the light vector. */	TokenNameCOMMENT_JAVADOC	 Returns a row of the light map, starting at (x, y) with dx increments, a given width, and z elevations stored in the fourth component on the N array. * @param x x-axis coordinate where the light should be computed @param y y-axis coordinate where the light should be computed @param dx delta x for computing light vectors in user space @param width number of samples to compute on the x axis @param z array containing the z elevation for all the points @param lightRow array to store the light info to, if null it will be allocated for you and returned. * @return an array width columns where each element is an array of three components representing the x, y and z components of the light vector. 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLightRow	TokenNameIdentifier	 get Light Row
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
z	TokenNameIdentifier	 z
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lightRow	TokenNameIdentifier	 light Row
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
lightRow	TokenNameIdentifier	 light Row
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we are allocating then use the same light vector for 	TokenNameCOMMENT_LINE	If we are allocating then use the same light vector for 
// all entries. 	TokenNameCOMMENT_LINE	all entries. 
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
width	TokenNameIdentifier	 width
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
CL	TokenNameIdentifier	 CL
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
CL	TokenNameIdentifier	 CL
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Lx	TokenNameIdentifier	 Lx
;	TokenNameSEMICOLON	
CL	TokenNameIdentifier	 CL
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Ly	TokenNameIdentifier	 Ly
;	TokenNameSEMICOLON	
CL	TokenNameIdentifier	 CL
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Lz	TokenNameIdentifier	 Lz
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
CL	TokenNameIdentifier	 CL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
lx	TokenNameIdentifier	 lx
=	TokenNameEQUAL	
Lx	TokenNameIdentifier	 Lx
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
ly	TokenNameIdentifier	 ly
=	TokenNameEQUAL	
Ly	TokenNameIdentifier	 Ly
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
lz	TokenNameIdentifier	 lz
=	TokenNameEQUAL	
Lz	TokenNameIdentifier	 Lz
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lx	TokenNameIdentifier	 lx
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ly	TokenNameIdentifier	 ly
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lz	TokenNameIdentifier	 lz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
