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
/** * An abstract implementation of the Light interface. * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: AbstractLight.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An abstract implementation of the Light interface. * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: AbstractLight.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractLight	TokenNameIdentifier	 Abstract Light
implements	TokenNameimplements	
Light	TokenNameIdentifier	 Light
{	TokenNameLBRACE	
/** * Conversion function for light values. */	TokenNameCOMMENT_JAVADOC	 Conversion function for light values. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
sRGBToLsRGB	TokenNameIdentifier	 s RGB To Ls RGB
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<=	TokenNameLESS_EQUAL	
0.003928	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
/	TokenNameDIVIDE	
12.92	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
0.055	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1.055	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.4	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Light color in linear sRGB */	TokenNameCOMMENT_JAVADOC	 Light color in linear sRGB 
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
color	TokenNameIdentifier	 color
;	TokenNameSEMICOLON	
/** * @param linear if true the color is returned in the Linear sRGB * colorspace otherwise the color is in the gamma * corrected sRGB color space. * @return the light's color */	TokenNameCOMMENT_JAVADOC	 @param linear if true the color is returned in the Linear sRGB colorspace otherwise the color is in the gamma corrected sRGB color space. @return the light's color 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
boolean	TokenNameboolean	
linear	TokenNameIdentifier	 linear
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
linear	TokenNameIdentifier	 linear
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sRGBToLsRGB	TokenNameIdentifier	 s RGB To Ls RGB
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sRGBToLsRGB	TokenNameIdentifier	 s RGB To Ls RGB
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sRGBToLsRGB	TokenNameIdentifier	 s RGB To Ls RGB
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
color	TokenNameIdentifier	 color
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
color	TokenNameIdentifier	 color
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
color	TokenNameIdentifier	 color
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractLight	TokenNameIdentifier	 Abstract Light
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the new light color, <tt>newColor</tt> should be in sRGB. */	TokenNameCOMMENT_JAVADOC	 Sets the new light color, <tt>newColor</tt> should be in sRGB. 
public	TokenNamepublic	
void	TokenNamevoid	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
newColor	TokenNameIdentifier	 new Color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
color	TokenNameIdentifier	 color
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
color	TokenNameIdentifier	 color
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newColor	TokenNameIdentifier	 new Color
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255.	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
color	TokenNameIdentifier	 color
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newColor	TokenNameIdentifier	 new Color
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255.	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
color	TokenNameIdentifier	 color
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newColor	TokenNameIdentifier	 new Color
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255.	TokenNameDoubleLiteral	
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
/** * Returns a light map, starting in (x, y) with dx, dy increments, a given * width and height, and z elevations stored in the fourth component on the * N array. * * @param x x-axis coordinate where the light should be computed * @param y y-axis coordinate where the light should be computed * @param dx delta x for computing light vectors in user space * @param dy delta y for computing light vectors in user space * @param width number of samples to compute on the x axis * @param height number of samples to compute on the y axis * @param z array containing the z elevation for all the points */	TokenNameCOMMENT_JAVADOC	 Returns a light map, starting in (x, y) with dx, dy increments, a given width and height, and z elevations stored in the fourth component on the N array. * @param x x-axis coordinate where the light should be computed @param y y-axis coordinate where the light should be computed @param dx delta x for computing light vectors in user space @param dy delta y for computing light vectors in user space @param width number of samples to compute on the x axis @param height number of samples to compute on the y axis @param z array containing the z elevation for all the points 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLightMap	TokenNameIdentifier	 get Light Map
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
double	TokenNamedouble	
dy	TokenNameIdentifier	 dy
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
z	TokenNameIdentifier	 z
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
L	TokenNameIdentifier	 L
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
height	TokenNameIdentifier	 height
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
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
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
L	TokenNameIdentifier	 L
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
getLightRow	TokenNameIdentifier	 get Light Row
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
dx	TokenNameIdentifier	 dx
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
z	TokenNameIdentifier	 z
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
+=	TokenNamePLUS_EQUAL	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
L	TokenNameIdentifier	 L
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
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
width	TokenNameIdentifier	 width
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
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
getLight	TokenNameIdentifier	 get Light
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
