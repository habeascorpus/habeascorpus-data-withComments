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
/** * A light source which emits a light of constant intensity in all directions. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: PointLight.java 478363 2006-11-22 23:01:13Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A light source which emits a light of constant intensity in all directions. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: PointLight.java 478363 2006-11-22 23:01:13Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
PointLight	TokenNameIdentifier	 Point Light
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
public	TokenNamepublic	
PointLight	TokenNameIdentifier	 Point Light
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
/** * Computes the light vector in (x, y, z) * * @param x x-axis coordinate where the light should be computed * @param y y-axis coordinate where the light should be computed * @param z z-axis coordinate where the light should be computed * @param L array of length 3 where the result is stored */	TokenNameCOMMENT_JAVADOC	 Computes the light vector in (x, y, z) * @param x x-axis coordinate where the light should be computed @param y y-axis coordinate where the light should be computed @param z z-axis coordinate where the light should be computed @param L array of length 3 where the result is stored 
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
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
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
if	TokenNameif	
(	TokenNameLPAREN	
norm	TokenNameIdentifier	 norm
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
invNorm	TokenNameIdentifier	 inv Norm
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
norm	TokenNameIdentifier	 norm
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
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
