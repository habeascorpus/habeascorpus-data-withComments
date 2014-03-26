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
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
RenderedImage	TokenNameIdentifier	 Rendered Image
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
RenderContext	TokenNameIdentifier	 Render Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
rendered	TokenNameIdentifier	 rendered
.	TokenNameDOT	
ColorMatrixRed	TokenNameIdentifier	 Color Matrix Red
;	TokenNameSEMICOLON	
/** * Implements the interface expected from a color matrix * operation * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: ColorMatrixRable8Bit.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Implements the interface expected from a color matrix operation * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: ColorMatrixRable8Bit.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
extends	TokenNameextends	
AbstractColorInterpolationRable	TokenNameIdentifier	 Abstract Color Interpolation Rable
implements	TokenNameimplements	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
{	TokenNameLBRACE	
/** * Predefined luminanceToAlpha matrix */	TokenNameCOMMENT_JAVADOC	 Predefined luminanceToAlpha matrix 
private	TokenNameprivate	
static	TokenNamestatic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
MATRIX_LUMINANCE_TO_ALPHA	TokenNameIdentifier	 MATRIX  LUMINANCE  TO  ALPHA
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
0.2125f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.7154f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.0721f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * This matrix type */	TokenNameCOMMENT_JAVADOC	 This matrix type 
private	TokenNameprivate	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * The matrix */	TokenNameCOMMENT_JAVADOC	 The matrix 
private	TokenNameprivate	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrix	TokenNameIdentifier	 matrix
;	TokenNameSEMICOLON	
/** * Sets the source of the blur operation */	TokenNameCOMMENT_JAVADOC	 Sets the source of the blur operation 
public	TokenNamepublic	
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the source of the blur operation */	TokenNameCOMMENT_JAVADOC	 Returns the source of the blur operation 
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
)	TokenNameRPAREN	
getSources	TokenNameIdentifier	 get Sources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the type of this color matrix. * @return one of TYPE_MATRIX, TYPE_SATURATE, TYPE_HUE_ROTATE, * TYPE_LUMINANCE_TO_ALPHA */	TokenNameCOMMENT_JAVADOC	 Returns the type of this color matrix. @return one of TYPE_MATRIX, TYPE_SATURATE, TYPE_HUE_ROTATE, TYPE_LUMINANCE_TO_ALPHA 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the rows of the color matrix. This uses * the same convention as BandCombineOp. */	TokenNameCOMMENT_JAVADOC	 Returns the rows of the color matrix. This uses the same convention as BandCombineOp. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matrix	TokenNameIdentifier	 matrix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Instances should be built through the static * factory methods */	TokenNameCOMMENT_JAVADOC	 Instances should be built through the static factory methods 
private	TokenNameprivate	
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Builds a TYPE_MATRIX instance */	TokenNameCOMMENT_JAVADOC	 Builds a TYPE_MATRIX instance 
public	TokenNamepublic	
static	TokenNamestatic	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
buildMatrix	TokenNameIdentifier	 build Matrix
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newMatrix	TokenNameIdentifier	 new Matrix
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
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
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
newMatrix	TokenNameIdentifier	 new Matrix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newMatrix	TokenNameIdentifier	 new Matrix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/*for(int i=0; i<4; i++){ for(int j=0; j<5; j++) System.out.print(newMatrix[i][j] + " "); System.out.println(); }*/	TokenNameCOMMENT_BLOCK	for(int i=0; i<4; i++){ for(int j=0; j<5; j++) System.out.print(newMatrix[i][j] + " "); System.out.println(); }
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
TYPE_MATRIX	TokenNameIdentifier	 TYPE  MATRIX
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
newMatrix	TokenNameIdentifier	 new Matrix
;	TokenNameSEMICOLON	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a TYPE_SATURATE instance */	TokenNameCOMMENT_JAVADOC	 Builds a TYPE_SATURATE instance 
public	TokenNamepublic	
static	TokenNamestatic	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
buildSaturate	TokenNameIdentifier	 build Saturate
(	TokenNameLPAREN	
float	TokenNamefloat	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
TYPE_SATURATE	TokenNameIdentifier	 TYPE  SATURATE
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
0.213f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
0.787f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
0.715f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
0.715f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
0.072f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
0.072f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
0.213f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
0.213f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
0.715f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
0.285f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
0.072f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
0.072f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
0.213f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
0.213f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
0.715f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
0.715f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
0.072f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
0.928f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a TYPE_HUE_ROTATE instance. * @param a angle, in radian */	TokenNameCOMMENT_JAVADOC	 Builds a TYPE_HUE_ROTATE instance. @param a angle, in radian 
public	TokenNamepublic	
static	TokenNamestatic	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
buildHueRotate	TokenNameIdentifier	 build Hue Rotate
(	TokenNameLPAREN	
float	TokenNamefloat	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
TYPE_HUE_ROTATE	TokenNameIdentifier	 TYPE  HUE  ROTATE
;	TokenNameSEMICOLON	
float	TokenNamefloat	
cos	TokenNameIdentifier	 cos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
sin	TokenNameIdentifier	 sin
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("sin : " + sin + " cos : " + cos); 	TokenNameCOMMENT_LINE	System.out.println("sin : " + sin + " cos : " + cos); 
float	TokenNamefloat	
a00	TokenNameIdentifier	 a00
=	TokenNameEQUAL	
0.213f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
cos	TokenNameIdentifier	 cos
*	TokenNameMULTIPLY	
0.787f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
sin	TokenNameIdentifier	 sin
*	TokenNameMULTIPLY	
0.213f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
a10	TokenNameIdentifier	 a10
=	TokenNameEQUAL	
0.213f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
cos	TokenNameIdentifier	 cos
*	TokenNameMULTIPLY	
0.212f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
sin	TokenNameIdentifier	 sin
*	TokenNameMULTIPLY	
0.143f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
a20	TokenNameIdentifier	 a20
=	TokenNameEQUAL	
0.213f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
cos	TokenNameIdentifier	 cos
*	TokenNameMULTIPLY	
0.213f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
sin	TokenNameIdentifier	 sin
*	TokenNameMULTIPLY	
0.787f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
a01	TokenNameIdentifier	 a01
=	TokenNameEQUAL	
0.715f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
cos	TokenNameIdentifier	 cos
*	TokenNameMULTIPLY	
0.715f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
sin	TokenNameIdentifier	 sin
*	TokenNameMULTIPLY	
0.715f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
a11	TokenNameIdentifier	 a11
=	TokenNameEQUAL	
0.715f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
cos	TokenNameIdentifier	 cos
*	TokenNameMULTIPLY	
0.285f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
sin	TokenNameIdentifier	 sin
*	TokenNameMULTIPLY	
0.140f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
a21	TokenNameIdentifier	 a21
=	TokenNameEQUAL	
0.715f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
cos	TokenNameIdentifier	 cos
*	TokenNameMULTIPLY	
0.715f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
sin	TokenNameIdentifier	 sin
*	TokenNameMULTIPLY	
0.715f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
a02	TokenNameIdentifier	 a02
=	TokenNameEQUAL	
0.072f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
cos	TokenNameIdentifier	 cos
*	TokenNameMULTIPLY	
0.072f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
sin	TokenNameIdentifier	 sin
*	TokenNameMULTIPLY	
0.928f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
a12	TokenNameIdentifier	 a12
=	TokenNameEQUAL	
0.072f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
cos	TokenNameIdentifier	 cos
*	TokenNameMULTIPLY	
0.072f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
sin	TokenNameIdentifier	 sin
*	TokenNameMULTIPLY	
0.283f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
a22	TokenNameIdentifier	 a22
=	TokenNameEQUAL	
0.072f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
cos	TokenNameIdentifier	 cos
*	TokenNameMULTIPLY	
0.928f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
sin	TokenNameIdentifier	 sin
*	TokenNameMULTIPLY	
0.072f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
a00	TokenNameIdentifier	 a00
,	TokenNameCOMMA	
a01	TokenNameIdentifier	 a01
,	TokenNameCOMMA	
a02	TokenNameIdentifier	 a02
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
a10	TokenNameIdentifier	 a10
,	TokenNameCOMMA	
a11	TokenNameIdentifier	 a11
,	TokenNameCOMMA	
a12	TokenNameIdentifier	 a12
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
a20	TokenNameIdentifier	 a20
,	TokenNameCOMMA	
a21	TokenNameIdentifier	 a21
,	TokenNameCOMMA	
a22	TokenNameIdentifier	 a22
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/*for(int i=0; i<4; i++){ for(int j=0; j<5; j++) System.out.print(filter.matrix[i][j] + " "); System.out.println(); }*/	TokenNameCOMMENT_BLOCK	for(int i=0; i<4; i++){ for(int j=0; j<5; j++) System.out.print(filter.matrix[i][j] + " "); System.out.println(); }
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a TYPE_LUMINANCE_TO_ALPHA instance */	TokenNameCOMMENT_JAVADOC	 Builds a TYPE_LUMINANCE_TO_ALPHA instance 
public	TokenNamepublic	
static	TokenNamestatic	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
buildLuminanceToAlpha	TokenNameIdentifier	 build Luminance To Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
TYPE_LUMINANCE_TO_ALPHA	TokenNameIdentifier	 TYPE  LUMINANCE  TO  ALPHA
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
MATRIX_LUMINANCE_TO_ALPHA	TokenNameIdentifier	 MATRIX  LUMINANCE  TO  ALPHA
;	TokenNameSEMICOLON	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RenderedImage	TokenNameIdentifier	 Rendered Image
createRendering	TokenNameIdentifier	 create Rendering
(	TokenNameLPAREN	
RenderContext	TokenNameIdentifier	 Render Context
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Get source's rendered image 	TokenNameCOMMENT_LINE	Get source's rendered image 
// 	TokenNameCOMMENT_LINE	 
RenderedImage	TokenNameIdentifier	 Rendered Image
srcRI	TokenNameIdentifier	 src RI
=	TokenNameEQUAL	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createRendering	TokenNameIdentifier	 create Rendering
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcRI	TokenNameIdentifier	 src RI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ColorMatrixRed	TokenNameIdentifier	 Color Matrix Red
(	TokenNameLPAREN	
convertSourceCS	TokenNameIdentifier	 convert Source CS
(	TokenNameLPAREN	
srcRI	TokenNameIdentifier	 src RI
)	TokenNameRPAREN	
,	TokenNameCOMMA	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
