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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Paint	TokenNameIdentifier	 Paint
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
AffineTransform	TokenNameIdentifier	 Affine Transform
;	TokenNameSEMICOLON	
/** This is the superclass for Paints which use a multiple color * gradient to fill in their raster. It provides storage for variables and * enumerated values common to LinearGradientPaint and RadialGradientPaint. * * * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: MultipleGradientPaint.java 479573 2006-11-27 10:13:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This is the superclass for Paints which use a multiple color gradient to fill in their raster. It provides storage for variables and enumerated values common to LinearGradientPaint and RadialGradientPaint. * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: MultipleGradientPaint.java 479573 2006-11-27 10:13:36Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
implements	TokenNameimplements	
Paint	TokenNameIdentifier	 Paint
{	TokenNameLBRACE	
/** Transparency. */	TokenNameCOMMENT_JAVADOC	 Transparency. 
protected	TokenNameprotected	
int	TokenNameint	
transparency	TokenNameIdentifier	 transparency
;	TokenNameSEMICOLON	
/** Gradient keyframe values in the range 0 to 1. */	TokenNameCOMMENT_JAVADOC	 Gradient keyframe values in the range 0 to 1. 
protected	TokenNameprotected	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fractions	TokenNameIdentifier	 fractions
;	TokenNameSEMICOLON	
/** Gradient colors. */	TokenNameCOMMENT_JAVADOC	 Gradient colors. 
protected	TokenNameprotected	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
;	TokenNameSEMICOLON	
/** Transform to apply to gradient. */	TokenNameCOMMENT_JAVADOC	 Transform to apply to gradient. 
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
gradientTransform	TokenNameIdentifier	 gradient Transform
;	TokenNameSEMICOLON	
/** The method to use when painting out of the gradient bounds. */	TokenNameCOMMENT_JAVADOC	 The method to use when painting out of the gradient bounds. 
protected	TokenNameprotected	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
cycleMethod	TokenNameIdentifier	 cycle Method
;	TokenNameSEMICOLON	
/** The colorSpace in which to perform the interpolation. */	TokenNameCOMMENT_JAVADOC	 The colorSpace in which to perform the interpolation. 
protected	TokenNameprotected	
ColorSpaceEnum	TokenNameIdentifier	 Color Space Enum
colorSpace	TokenNameIdentifier	 color Space
;	TokenNameSEMICOLON	
/** Inner class to allow for typesafe enumerated ColorSpace values. */	TokenNameCOMMENT_JAVADOC	 Inner class to allow for typesafe enumerated ColorSpace values. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ColorSpaceEnum	TokenNameIdentifier	 Color Space Enum
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Inner class to allow for typesafe enumerated CycleMethod values. */	TokenNameCOMMENT_JAVADOC	 Inner class to allow for typesafe enumerated CycleMethod values. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Indicates (if the gradient starts or ends inside the target region) * to use the terminal colors to fill the remaining area. (default) */	TokenNameCOMMENT_JAVADOC	 Indicates (if the gradient starts or ends inside the target region) to use the terminal colors to fill the remaining area. (default) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
NO_CYCLE	TokenNameIdentifier	 NO  CYCLE
=	TokenNameEQUAL	
new	TokenNamenew	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Indicates (if the gradient starts or ends inside the target region), * to cycle the gradient colors start-to-end, end-to-start to fill the * remaining area. */	TokenNameCOMMENT_JAVADOC	 Indicates (if the gradient starts or ends inside the target region), to cycle the gradient colors start-to-end, end-to-start to fill the remaining area. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
REFLECT	TokenNameIdentifier	 REFLECT
=	TokenNameEQUAL	
new	TokenNamenew	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Indicates (if the gradient starts or ends inside the target region), * to cycle the gradient colors start-to-end, start-to-end to fill the * remaining area. */	TokenNameCOMMENT_JAVADOC	 Indicates (if the gradient starts or ends inside the target region), to cycle the gradient colors start-to-end, start-to-end to fill the remaining area. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
REPEAT	TokenNameIdentifier	 REPEAT
=	TokenNameEQUAL	
new	TokenNamenew	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Indicates that the color interpolation should occur in sRGB space. * (default) */	TokenNameCOMMENT_JAVADOC	 Indicates that the color interpolation should occur in sRGB space. (default) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ColorSpaceEnum	TokenNameIdentifier	 Color Space Enum
SRGB	TokenNameIdentifier	 SRGB
=	TokenNameEQUAL	
new	TokenNamenew	
ColorSpaceEnum	TokenNameIdentifier	 Color Space Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Indicates that the color interpolation should occur in linearized * RGB space. */	TokenNameCOMMENT_JAVADOC	 Indicates that the color interpolation should occur in linearized RGB space. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ColorSpaceEnum	TokenNameIdentifier	 Color Space Enum
LINEAR_RGB	TokenNameIdentifier	 LINEAR  RGB
=	TokenNameEQUAL	
new	TokenNamenew	
ColorSpaceEnum	TokenNameIdentifier	 Color Space Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Superclass constructor, typical user should never have to call this. * * @param fractions numbers ranging from 0.0 to 1.0 specifying the * distribution of colors along the gradient * * @param colors array of colors corresponding to each fractional value * * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * * @param colorSpace which colorspace to use for interpolation, * either SRGB or LINEAR_RGB * * @param gradientTransform transform to apply to the gradient * * @throws NullPointerException if arrays are null, or * gradientTransform is null * * @throws IllegalArgumentException if fractions.length != colors.length, * or if colors is less than 2 in size, or if an enumerated value is bad. */	TokenNameCOMMENT_JAVADOC	 Superclass constructor, typical user should never have to call this. * @param fractions numbers ranging from 0.0 to 1.0 specifying the distribution of colors along the gradient * @param colors array of colors corresponding to each fractional value * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * @param colorSpace which colorspace to use for interpolation, either SRGB or LINEAR_RGB * @param gradientTransform transform to apply to the gradient * @throws NullPointerException if arrays are null, or gradientTransform is null * @throws IllegalArgumentException if fractions.length != colors.length, or if colors is less than 2 in size, or if an enumerated value is bad. 
public	TokenNamepublic	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
cycleMethod	TokenNameIdentifier	 cycle Method
,	TokenNameCOMMA	
ColorSpaceEnum	TokenNameIdentifier	 Color Space Enum
colorSpace	TokenNameIdentifier	 color Space
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
gradientTransform	TokenNameIdentifier	 gradient Transform
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fractions	TokenNameIdentifier	 fractions
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Fractions array cannot be "	TokenNameStringLiteral	Fractions array cannot be 
+	TokenNamePLUS	
"null"	TokenNameStringLiteral	null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
colors	TokenNameIdentifier	 colors
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Colors array cannot be null"	TokenNameStringLiteral	Colors array cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fractions	TokenNameIdentifier	 fractions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
colors	TokenNameIdentifier	 colors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Colors and fractions must "	TokenNameStringLiteral	Colors and fractions must 
+	TokenNamePLUS	
"have equal size"	TokenNameStringLiteral	have equal size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
colors	TokenNameIdentifier	 colors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"User must specify at least "	TokenNameStringLiteral	User must specify at least 
+	TokenNamePLUS	
"2 colors"	TokenNameStringLiteral	2 colors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
colorSpace	TokenNameIdentifier	 color Space
!=	TokenNameNOT_EQUAL	
LINEAR_RGB	TokenNameIdentifier	 LINEAR  RGB
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
colorSpace	TokenNameIdentifier	 color Space
!=	TokenNameNOT_EQUAL	
SRGB	TokenNameIdentifier	 SRGB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Invalid colorspace for "	TokenNameStringLiteral	Invalid colorspace for 
+	TokenNamePLUS	
"interpolation."	TokenNameStringLiteral	interpolation.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cycleMethod	TokenNameIdentifier	 cycle Method
!=	TokenNameNOT_EQUAL	
NO_CYCLE	TokenNameIdentifier	 NO  CYCLE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
cycleMethod	TokenNameIdentifier	 cycle Method
!=	TokenNameNOT_EQUAL	
REFLECT	TokenNameIdentifier	 REFLECT
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
cycleMethod	TokenNameIdentifier	 cycle Method
!=	TokenNameNOT_EQUAL	
REPEAT	TokenNameIdentifier	 REPEAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Invalid cycle method."	TokenNameStringLiteral	Invalid cycle method.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gradientTransform	TokenNameIdentifier	 gradient Transform
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Gradient transform cannot be "	TokenNameStringLiteral	Gradient transform cannot be 
+	TokenNamePLUS	
"null."	TokenNameStringLiteral	null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//copy the fractions array 	TokenNameCOMMENT_LINE	copy the fractions array 
this	TokenNamethis	
.	TokenNameDOT	
fractions	TokenNameIdentifier	 fractions
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
fractions	TokenNameIdentifier	 fractions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fractions	TokenNameIdentifier	 fractions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//copy the colors array 	TokenNameCOMMENT_LINE	copy the colors array 
this	TokenNamethis	
.	TokenNameDOT	
colors	TokenNameIdentifier	 colors
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
colors	TokenNameIdentifier	 colors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//copy some flags 	TokenNameCOMMENT_LINE	copy some flags 
this	TokenNamethis	
.	TokenNameDOT	
colorSpace	TokenNameIdentifier	 color Space
=	TokenNameEQUAL	
colorSpace	TokenNameIdentifier	 color Space
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cycleMethod	TokenNameIdentifier	 cycle Method
=	TokenNameEQUAL	
cycleMethod	TokenNameIdentifier	 cycle Method
;	TokenNameSEMICOLON	
//copy the gradient transform 	TokenNameCOMMENT_LINE	copy the gradient transform 
this	TokenNamethis	
.	TokenNameDOT	
gradientTransform	TokenNameIdentifier	 gradient Transform
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
gradientTransform	TokenNameIdentifier	 gradient Transform
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Process transparency 	TokenNameCOMMENT_LINE	Process transparency 
boolean	TokenNameboolean	
opaque	TokenNameIdentifier	 opaque
=	TokenNameEQUAL	
true	TokenNametrue	
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
colors	TokenNameIdentifier	 colors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
opaque	TokenNameIdentifier	 opaque
=	TokenNameEQUAL	
opaque	TokenNameIdentifier	 opaque
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
colors	TokenNameIdentifier	 colors
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getAlpha	TokenNameIdentifier	 get Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
opaque	TokenNameIdentifier	 opaque
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transparency	TokenNameIdentifier	 transparency
=	TokenNameEQUAL	
OPAQUE	TokenNameIdentifier	 OPAQUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
transparency	TokenNameIdentifier	 transparency
=	TokenNameEQUAL	
TRANSLUCENT	TokenNameIdentifier	 TRANSLUCENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a copy of the array of colors used by this gradient. * @return a copy of the array of colors used by this gradient * */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the array of colors used by this gradient. @return a copy of the array of colors used by this gradient 
public	TokenNamepublic	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getColors	TokenNameIdentifier	 get Colors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
colors	TokenNameIdentifier	 colors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
colors	TokenNameIdentifier	 colors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
colors	TokenNameIdentifier	 colors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a copy of the array of floats used by this gradient * to calculate color distribution. * @return a copy of the array of floats used by this gradient to * calculate color distribution * */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the array of floats used by this gradient to calculate color distribution. @return a copy of the array of floats used by this gradient to calculate color distribution 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFractions	TokenNameIdentifier	 get Fractions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fractions	TokenNameIdentifier	 fractions
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
fractions	TokenNameIdentifier	 fractions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
fractions	TokenNameIdentifier	 fractions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fractions	TokenNameIdentifier	 fractions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the transparency mode for this LinearGradientPaint. * @return an integer value representing this LinearGradientPaint object's * transparency mode. */	TokenNameCOMMENT_JAVADOC	 Returns the transparency mode for this LinearGradientPaint. @return an integer value representing this LinearGradientPaint object's transparency mode. 
public	TokenNamepublic	
int	TokenNameint	
getTransparency	TokenNameIdentifier	 get Transparency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
transparency	TokenNameIdentifier	 transparency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the enumerated type which specifies cycling behavior. * @return the enumerated type which specifies cycling behavior */	TokenNameCOMMENT_JAVADOC	 Returns the enumerated type which specifies cycling behavior. @return the enumerated type which specifies cycling behavior 
public	TokenNamepublic	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
getCycleMethod	TokenNameIdentifier	 get Cycle Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cycleMethod	TokenNameIdentifier	 cycle Method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the enumerated type which specifies color space for * interpolation. * @return the enumerated type which specifies color space for * interpolation */	TokenNameCOMMENT_JAVADOC	 Returns the enumerated type which specifies color space for interpolation. @return the enumerated type which specifies color space for interpolation 
public	TokenNamepublic	
ColorSpaceEnum	TokenNameIdentifier	 Color Space Enum
getColorSpace	TokenNameIdentifier	 get Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
colorSpace	TokenNameIdentifier	 color Space
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a copy of the transform applied to the gradient. * @return a copy of the transform applied to the gradient. */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the transform applied to the gradient. @return a copy of the transform applied to the gradient. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
gradientTransform	TokenNameIdentifier	 gradient Transform
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
