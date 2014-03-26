/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
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
SampleModel	TokenNameIdentifier	 Sample Model
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
LinearTransfer	TokenNameIdentifier	 Linear Transfer
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
TransferFunction	TokenNameIdentifier	 Transfer Function
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
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
AbstractColorInterpolationRable	TokenNameIdentifier	 Abstract Color Interpolation Rable
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
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
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
ComponentTransferRed	TokenNameIdentifier	 Component Transfer Red
;	TokenNameSEMICOLON	
/** * * @version $Id: BatikHistogramNormalizationFilter8Bit.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 * @version $Id: BatikHistogramNormalizationFilter8Bit.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
BatikHistogramNormalizationFilter8Bit	TokenNameIdentifier	 Batik Histogram Normalization Filter8 Bit
extends	TokenNameextends	
AbstractColorInterpolationRable	TokenNameIdentifier	 Abstract Color Interpolation Rable
implements	TokenNameimplements	
BatikHistogramNormalizationFilter	TokenNameIdentifier	 Batik Histogram Normalization Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
float	TokenNamefloat	
trim	TokenNameIdentifier	 trim
=	TokenNameEQUAL	
0.01f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
/** * Sets the source of the operation */	TokenNameCOMMENT_JAVADOC	 Sets the source of the operation 
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
/** * Returns the source of the operation */	TokenNameCOMMENT_JAVADOC	 Returns the source of the operation 
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
/** * Returns the trim percent for this normalization. */	TokenNameCOMMENT_JAVADOC	 Returns the trim percent for this normalization. 
public	TokenNamepublic	
float	TokenNamefloat	
getTrim	TokenNameIdentifier	 get Trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
trim	TokenNameIdentifier	 trim
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the trim percent for this normalization. */	TokenNameCOMMENT_JAVADOC	 Sets the trim percent for this normalization. 
public	TokenNamepublic	
void	TokenNamevoid	
setTrim	TokenNameIdentifier	 set Trim
(	TokenNameLPAREN	
float	TokenNamefloat	
trim	TokenNameIdentifier	 trim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
=	TokenNameEQUAL	
trim	TokenNameIdentifier	 trim
;	TokenNameSEMICOLON	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BatikHistogramNormalizationFilter8Bit	TokenNameIdentifier	 Batik Histogram Normalization Filter8 Bit
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
float	TokenNamefloat	
trim	TokenNameIdentifier	 trim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTrim	TokenNameIdentifier	 set Trim
(	TokenNameLPAREN	
trim	TokenNameIdentifier	 trim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
histo	TokenNameIdentifier	 histo
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
slope	TokenNameIdentifier	 slope
,	TokenNameCOMMA	
intercept	TokenNameIdentifier	 intercept
;	TokenNameSEMICOLON	
/** * This method computes the histogram of the image and * from that the appropriate clipping points, which leads * to a slope and intercept for a LinearTransfer function * * @param rc We get the set of rendering hints from rc. */	TokenNameCOMMENT_JAVADOC	 This method computes the histogram of the image and from that the appropriate clipping points, which leads to a slope and intercept for a LinearTransfer function * @param rc We get the set of rendering hints from rc. 
public	TokenNamepublic	
void	TokenNamevoid	
computeHistogram	TokenNameIdentifier	 compute Histogram
(	TokenNameLPAREN	
RenderContext	TokenNameIdentifier	 Render Context
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
histo	TokenNameIdentifier	 histo
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
Filter	TokenNameIdentifier	 Filter
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
100.0f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
yscale	TokenNameIdentifier	 yscale
=	TokenNameEQUAL	
100.0f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scale	TokenNameIdentifier	 scale
>	TokenNameGREATER	
yscale	TokenNameIdentifier	 yscale
)	TokenNameRPAREN	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
yscale	TokenNameIdentifier	 yscale
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getScaleInstance	TokenNameIdentifier	 get Scale Instance
(	TokenNameLPAREN	
scale	TokenNameIdentifier	 scale
,	TokenNameCOMMA	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
new	TokenNamenew	
RenderContext	TokenNameIdentifier	 Render Context
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
,	TokenNameCOMMA	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
getRenderingHints	TokenNameIdentifier	 get Rendering Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RenderedImage	TokenNameIdentifier	 Rendered Image
histRI	TokenNameIdentifier	 hist RI
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
histo	TokenNameIdentifier	 histo
=	TokenNameEQUAL	
new	TokenNamenew	
HistogramRed	TokenNameIdentifier	 Histogram Red
(	TokenNameLPAREN	
convertSourceCS	TokenNameIdentifier	 convert Source CS
(	TokenNameLPAREN	
histRI	TokenNameIdentifier	 hist RI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHistogram	TokenNameIdentifier	 get Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
histRI	TokenNameIdentifier	 hist RI
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
histRI	TokenNameIdentifier	 hist RI
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
trim	TokenNameIdentifier	 trim
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
+=	TokenNamePLUS_EQUAL	
histo	TokenNameIdentifier	 histo
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// System.out.println("C[" + i + "] = " + c + " T: " + t); 	TokenNameCOMMENT_LINE	System.out.println("C[" + i + "] = " + c + " T: " + t); 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
+=	TokenNamePLUS_EQUAL	
histo	TokenNameIdentifier	 histo
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// System.out.println("C[" + i + "] = " + c + " T: " + t); 	TokenNameCOMMENT_LINE	System.out.println("C[" + i + "] = " + c + " T: " + t); 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
slope	TokenNameIdentifier	 slope
=	TokenNameEQUAL	
255f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intercept	TokenNameIdentifier	 intercept
=	TokenNameEQUAL	
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
*	TokenNameMULTIPLY	
-	TokenNameMINUS	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
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
computeHistogram	TokenNameIdentifier	 compute Histogram
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
srcRI	TokenNameIdentifier	 src RI
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bands	TokenNameIdentifier	 bands
=	TokenNameEQUAL	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Slope, Intercept: " + slope + ", " + intercept); 	TokenNameCOMMENT_LINE	System.out.println("Slope, Intercept: " + slope + ", " + intercept); 
TransferFunction	TokenNameIdentifier	 Transfer Function
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tfs	TokenNameIdentifier	 tfs
=	TokenNameEQUAL	
new	TokenNamenew	
TransferFunction	TokenNameIdentifier	 Transfer Function
[	TokenNameLBRACKET	
bands	TokenNameIdentifier	 bands
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
TransferFunction	TokenNameIdentifier	 Transfer Function
tf	TokenNameIdentifier	 tf
=	TokenNameEQUAL	
new	TokenNamenew	
LinearTransfer	TokenNameIdentifier	 Linear Transfer
(	TokenNameLPAREN	
slope	TokenNameIdentifier	 slope
,	TokenNameCOMMA	
intercept	TokenNameIdentifier	 intercept
)	TokenNameRPAREN	
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
tfs	TokenNameIdentifier	 tfs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
tfs	TokenNameIdentifier	 tfs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tf	TokenNameIdentifier	 tf
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ComponentTransferRed	TokenNameIdentifier	 Component Transfer Red
(	TokenNameLPAREN	
convertSourceCS	TokenNameIdentifier	 convert Source CS
(	TokenNameLPAREN	
srcRI	TokenNameIdentifier	 src RI
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tfs	TokenNameIdentifier	 tfs
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
