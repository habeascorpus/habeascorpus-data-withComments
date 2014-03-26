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
/** * A light source which emits a light of constant intensity in all directions. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SpotLight.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A light source which emits a light of constant intensity in all directions. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SpotLight.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SpotLight	TokenNameIdentifier	 Spot Light
extends	TokenNameextends	
AbstractLight	TokenNameIdentifier	 Abstract Light
{	TokenNameLBRACE	
/** * The light position, in user space */	TokenNameCOMMENT_JAVADOC	 The light position, in user space 
private	TokenNameprivate	
double	TokenNamedouble	
lightX	TokenNameIdentifier	 light X
,	TokenNameCOMMA	
lightY	TokenNameIdentifier	 light Y
,	TokenNameCOMMA	
lightZ	TokenNameIdentifier	 light Z
;	TokenNameSEMICOLON	
/** * Point where the light points to */	TokenNameCOMMENT_JAVADOC	 Point where the light points to 
private	TokenNameprivate	
double	TokenNamedouble	
pointAtX	TokenNameIdentifier	 point At X
,	TokenNameCOMMA	
pointAtY	TokenNameIdentifier	 point At Y
,	TokenNameCOMMA	
pointAtZ	TokenNameIdentifier	 point At Z
;	TokenNameSEMICOLON	
/** * Specular exponent (light focus) */	TokenNameCOMMENT_JAVADOC	 Specular exponent (light focus) 
private	TokenNameprivate	
double	TokenNamedouble	
specularExponent	TokenNameIdentifier	 specular Exponent
;	TokenNameSEMICOLON	
/** * Limiting cone angle */	TokenNameCOMMENT_JAVADOC	 Limiting cone angle 
private	TokenNameprivate	
double	TokenNamedouble	
limitingConeAngle	TokenNameIdentifier	 limiting Cone Angle
,	TokenNameCOMMA	
limitingCos	TokenNameIdentifier	 limiting Cos
;	TokenNameSEMICOLON	
/** * Light direction vector */	TokenNameCOMMENT_JAVADOC	 Light direction vector 
private	TokenNameprivate	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
S	TokenNameIdentifier	 S
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * @return the light's x position */	TokenNameCOMMENT_JAVADOC	 @return the light's x position 
public	TokenNamepublic	
double	TokenNamedouble	
getLightX	TokenNameIdentifier	 get Light X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lightX	TokenNameIdentifier	 light X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the light's y position */	TokenNameCOMMENT_JAVADOC	 @return the light's y position 
public	TokenNamepublic	
double	TokenNamedouble	
getLightY	TokenNameIdentifier	 get Light Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lightY	TokenNameIdentifier	 light Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the light's z position */	TokenNameCOMMENT_JAVADOC	 @return the light's z position 
public	TokenNamepublic	
double	TokenNamedouble	
getLightZ	TokenNameIdentifier	 get Light Z
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lightZ	TokenNameIdentifier	 light Z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return x-axis coordinate where the light points to */	TokenNameCOMMENT_JAVADOC	 @return x-axis coordinate where the light points to 
public	TokenNamepublic	
double	TokenNamedouble	
getPointAtX	TokenNameIdentifier	 get Point At X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pointAtX	TokenNameIdentifier	 point At X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return y-axis coordinate where the light points to */	TokenNameCOMMENT_JAVADOC	 @return y-axis coordinate where the light points to 
public	TokenNamepublic	
double	TokenNamedouble	
getPointAtY	TokenNameIdentifier	 get Point At Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pointAtY	TokenNameIdentifier	 point At Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return z-axis coordinate where the light points to */	TokenNameCOMMENT_JAVADOC	 @return z-axis coordinate where the light points to 
public	TokenNamepublic	
double	TokenNamedouble	
getPointAtZ	TokenNameIdentifier	 get Point At Z
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pointAtZ	TokenNameIdentifier	 point At Z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return light's specular exponent (focus) */	TokenNameCOMMENT_JAVADOC	 @return light's specular exponent (focus) 
public	TokenNamepublic	
double	TokenNamedouble	
getSpecularExponent	TokenNameIdentifier	 get Specular Exponent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
specularExponent	TokenNameIdentifier	 specular Exponent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return light's limiting cone angle */	TokenNameCOMMENT_JAVADOC	 @return light's limiting cone angle 
public	TokenNamepublic	
double	TokenNamedouble	
getLimitingConeAngle	TokenNameIdentifier	 get Limiting Cone Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
limitingConeAngle	TokenNameIdentifier	 limiting Cone Angle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SpotLight	TokenNameIdentifier	 Spot Light
(	TokenNameLPAREN	
double	TokenNamedouble	
lightX	TokenNameIdentifier	 light X
,	TokenNameCOMMA	
double	TokenNamedouble	
lightY	TokenNameIdentifier	 light Y
,	TokenNameCOMMA	
double	TokenNamedouble	
lightZ	TokenNameIdentifier	 light Z
,	TokenNameCOMMA	
double	TokenNamedouble	
pointAtX	TokenNameIdentifier	 point At X
,	TokenNameCOMMA	
double	TokenNamedouble	
pointAtY	TokenNameIdentifier	 point At Y
,	TokenNameCOMMA	
double	TokenNamedouble	
pointAtZ	TokenNameIdentifier	 point At Z
,	TokenNameCOMMA	
double	TokenNamedouble	
specularExponent	TokenNameIdentifier	 specular Exponent
,	TokenNameCOMMA	
double	TokenNamedouble	
limitingConeAngle	TokenNameIdentifier	 limiting Cone Angle
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
lightColor	TokenNameIdentifier	 light Color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
lightColor	TokenNameIdentifier	 light Color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lightX	TokenNameIdentifier	 light X
=	TokenNameEQUAL	
lightX	TokenNameIdentifier	 light X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lightY	TokenNameIdentifier	 light Y
=	TokenNameEQUAL	
lightY	TokenNameIdentifier	 light Y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lightZ	TokenNameIdentifier	 light Z
=	TokenNameEQUAL	
lightZ	TokenNameIdentifier	 light Z
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pointAtX	TokenNameIdentifier	 point At X
=	TokenNameEQUAL	
pointAtX	TokenNameIdentifier	 point At X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pointAtY	TokenNameIdentifier	 point At Y
=	TokenNameEQUAL	
pointAtY	TokenNameIdentifier	 point At Y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pointAtZ	TokenNameIdentifier	 point At Z
=	TokenNameEQUAL	
pointAtZ	TokenNameIdentifier	 point At Z
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
specularExponent	TokenNameIdentifier	 specular Exponent
=	TokenNameEQUAL	
specularExponent	TokenNameIdentifier	 specular Exponent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
limitingConeAngle	TokenNameIdentifier	 limiting Cone Angle
=	TokenNameEQUAL	
limitingConeAngle	TokenNameIdentifier	 limiting Cone Angle
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
limitingCos	TokenNameIdentifier	 limiting Cos
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
limitingConeAngle	TokenNameIdentifier	 limiting Cone Angle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pointAtX	TokenNameIdentifier	 point At X
-	TokenNameMINUS	
lightX	TokenNameIdentifier	 light X
;	TokenNameSEMICOLON	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pointAtY	TokenNameIdentifier	 point At Y
-	TokenNameMINUS	
lightY	TokenNameIdentifier	 light Y
;	TokenNameSEMICOLON	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pointAtZ	TokenNameIdentifier	 point At Z
-	TokenNameMINUS	
lightZ	TokenNameIdentifier	 light Z
;	TokenNameSEMICOLON	
double	TokenNamedouble	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
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
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Computes the light vector in (x, y, z) * * @param x x-axis coordinate where the light should be computed * @param y y-axis coordinate where the light should be computed * @param z z-axis coordinate where the light should be computed * @param L array of length 3 where the result is stored * @return the intensity factor for this light vector. */	TokenNameCOMMENT_JAVADOC	 Computes the light vector in (x, y, z) * @param x x-axis coordinate where the light should be computed @param y y-axis coordinate where the light should be computed @param z z-axis coordinate where the light should be computed @param L array of length 3 where the result is stored @return the intensity factor for this light vector. 
public	TokenNamepublic	
final	TokenNamefinal	
double	TokenNamedouble	
getLightBase	TokenNameIdentifier	 get Light Base
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
// Light Vector, L 	TokenNameCOMMENT_LINE	Light Vector, L 
double	TokenNamedouble	
L0	TokenNameIdentifier	 L0
=	TokenNameEQUAL	
lightX	TokenNameIdentifier	 light X
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
double	TokenNamedouble	
L1	TokenNameIdentifier	 L1
=	TokenNameEQUAL	
lightY	TokenNameIdentifier	 light Y
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
double	TokenNamedouble	
L2	TokenNameIdentifier	 L2
=	TokenNameEQUAL	
lightZ	TokenNameIdentifier	 light Z
-	TokenNameMINUS	
z	TokenNameIdentifier	 z
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
L0	TokenNameIdentifier	 L0
*	TokenNameMULTIPLY	
L0	TokenNameIdentifier	 L0
+	TokenNamePLUS	
L1	TokenNameIdentifier	 L1
*	TokenNameMULTIPLY	
L1	TokenNameIdentifier	 L1
+	TokenNamePLUS	
L2	TokenNameIdentifier	 L2
*	TokenNameMULTIPLY	
L2	TokenNameIdentifier	 L2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
L0	TokenNameIdentifier	 L0
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
L1	TokenNameIdentifier	 L1
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
L2	TokenNameIdentifier	 L2
*=	TokenNameMULTIPLY_EQUAL	
invNorm	TokenNameIdentifier	 inv Norm
;	TokenNameSEMICOLON	
double	TokenNamedouble	
LS	TokenNameIdentifier	 LS
=	TokenNameEQUAL	
-	TokenNameMINUS	
(	TokenNameLPAREN	
L0	TokenNameIdentifier	 L0
*	TokenNameMULTIPLY	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
L1	TokenNameIdentifier	 L1
*	TokenNameMULTIPLY	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
L2	TokenNameIdentifier	 L2
*	TokenNameMULTIPLY	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// copy the work-variables into return-array 	TokenNameCOMMENT_LINE	copy the work-variables into return-array 
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
L0	TokenNameIdentifier	 L0
;	TokenNameSEMICOLON	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
L1	TokenNameIdentifier	 L1
;	TokenNameSEMICOLON	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
L2	TokenNameIdentifier	 L2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
LS	TokenNameIdentifier	 LS
<=	TokenNameLESS_EQUAL	
limitingCos	TokenNameIdentifier	 limiting Cos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
double	TokenNamedouble	
Iatt	TokenNameIdentifier	 Iatt
=	TokenNameEQUAL	
limitingCos	TokenNameIdentifier	 limiting Cos
/	TokenNameDIVIDE	
LS	TokenNameIdentifier	 LS
;	TokenNameSEMICOLON	
Iatt	TokenNameIdentifier	 Iatt
*=	TokenNameMULTIPLY_EQUAL	
Iatt	TokenNameIdentifier	 Iatt
;	TokenNameSEMICOLON	
Iatt	TokenNameIdentifier	 Iatt
*=	TokenNameMULTIPLY_EQUAL	
Iatt	TokenNameIdentifier	 Iatt
;	TokenNameSEMICOLON	
Iatt	TokenNameIdentifier	 Iatt
*=	TokenNameMULTIPLY_EQUAL	
Iatt	TokenNameIdentifier	 Iatt
;	TokenNameSEMICOLON	
Iatt	TokenNameIdentifier	 Iatt
*=	TokenNameMULTIPLY_EQUAL	
Iatt	TokenNameIdentifier	 Iatt
;	TokenNameSEMICOLON	
Iatt	TokenNameIdentifier	 Iatt
*=	TokenNameMULTIPLY_EQUAL	
Iatt	TokenNameIdentifier	 Iatt
;	TokenNameSEMICOLON	
Iatt	TokenNameIdentifier	 Iatt
*=	TokenNameMULTIPLY_EQUAL	
Iatt	TokenNameIdentifier	 Iatt
;	TokenNameSEMICOLON	
// akin Math.pow(Iatt, 64) 	TokenNameCOMMENT_LINE	akin Math.pow(Iatt, 64) 
Iatt	TokenNameIdentifier	 Iatt
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
Iatt	TokenNameIdentifier	 Iatt
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Iatt	TokenNameIdentifier	 Iatt
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
LS	TokenNameIdentifier	 LS
,	TokenNameCOMMA	
specularExponent	TokenNameIdentifier	 specular Exponent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Computes the light vector in (x, y, z) * * @param x x-axis coordinate where the light should be computed * @param y y-axis coordinate where the light should be computed * @param z z-axis coordinate where the light should be computed * @param L array of length 3 where the result is stored, * x,y,z are scaled by light intensity. */	TokenNameCOMMENT_JAVADOC	 Computes the light vector in (x, y, z) * @param x x-axis coordinate where the light should be computed @param y y-axis coordinate where the light should be computed @param z z-axis coordinate where the light should be computed @param L array of length 3 where the result is stored, x,y,z are scaled by light intensity. 
public	TokenNamepublic	
final	TokenNamefinal	
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
final	TokenNamefinal	
double	TokenNamedouble	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getLightBase	TokenNameIdentifier	 get Light Base
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
z	TokenNameIdentifier	 z
,	TokenNameCOMMA	
L	TokenNameIdentifier	 L
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * computes light vector in (x, y, z). * * @param x x-axis coordinate where the light should be computed * @param y y-axis coordinate where the light should be computed * @param z z-axis coordinate where the light should be computed * @param L array of length 4 where result is stored. * 0,1,2 are x,y,z respectively of light vector (normalized). * 3 is the intensity of the light at this point. */	TokenNameCOMMENT_JAVADOC	 computes light vector in (x, y, z). * @param x x-axis coordinate where the light should be computed @param y y-axis coordinate where the light should be computed @param z z-axis coordinate where the light should be computed @param L array of length 4 where result is stored. 0,1,2 are x,y,z respectively of light vector (normalized). 3 is the intensity of the light at this point. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
getLight4	TokenNameIdentifier	 get Light4
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
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
getLightBase	TokenNameIdentifier	 get Light Base
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
z	TokenNameIdentifier	 z
,	TokenNameCOMMA	
L	TokenNameIdentifier	 L
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLightRow4	TokenNameIdentifier	 get Light Row4
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
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
width	TokenNameIdentifier	 width
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
getLight4	TokenNameIdentifier	 get Light4
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
z	TokenNameIdentifier	 z
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
+=	TokenNamePLUS_EQUAL	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
