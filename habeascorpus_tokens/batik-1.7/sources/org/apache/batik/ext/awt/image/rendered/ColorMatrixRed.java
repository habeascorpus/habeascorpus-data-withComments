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
rendered	TokenNameIdentifier	 rendered
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
color	TokenNameIdentifier	 color
.	TokenNameDOT	
ColorSpace	TokenNameIdentifier	 Color Space
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
ColorModel	TokenNameIdentifier	 Color Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
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
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
WritableRaster	TokenNameIdentifier	 Writable Raster
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
GraphicsUtil	TokenNameIdentifier	 Graphics Util
;	TokenNameSEMICOLON	
/** * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: ColorMatrixRed.java 479564 2006-11-27 09:56:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: ColorMatrixRed.java 479564 2006-11-27 09:56:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ColorMatrixRed	TokenNameIdentifier	 Color Matrix Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
/** * Matrix to apply to color components */	TokenNameCOMMENT_JAVADOC	 Matrix to apply to color components 
private	TokenNameprivate	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrix	TokenNameIdentifier	 matrix
;	TokenNameSEMICOLON	
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
copyMatrix	TokenNameIdentifier	 copy Matrix
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMatrix	TokenNameIdentifier	 set Matrix
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
copyMatrix	TokenNameIdentifier	 copy Matrix
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
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
tmp	TokenNameIdentifier	 tmp
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
if	TokenNameif	
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
" : "	TokenNameStringLiteral	 : 
+	TokenNamePLUS	
tmp	TokenNameIdentifier	 tmp
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
copyMatrix	TokenNameIdentifier	 copy Matrix
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
m	TokenNameIdentifier	 m
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cm	TokenNameIdentifier	 cm
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
cm	TokenNameIdentifier	 cm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColorMatrixRed	TokenNameIdentifier	 Color Matrix Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setMatrix	TokenNameIdentifier	 set Matrix
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorSpace	TokenNameIdentifier	 Color Space
srcCS	TokenNameIdentifier	 src CS
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
srcCS	TokenNameIdentifier	 src CS
=	TokenNameEQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
getColorSpace	TokenNameIdentifier	 get Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcCS	TokenNameIdentifier	 src CS
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
Linear_sRGB_Unpre	TokenNameIdentifier	 Linear s RGB  Unpre
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
srcCS	TokenNameIdentifier	 src CS
==	TokenNameEQUAL_EQUAL	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
CS_LINEAR_RGB	TokenNameIdentifier	 CS  LINEAR  RGB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
Linear_sRGB_Unpre	TokenNameIdentifier	 Linear s RGB  Unpre
;	TokenNameSEMICOLON	
else	TokenNameelse	
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
sRGB_Unpre	TokenNameIdentifier	 s RGB  Unpre
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
createCompatibleSampleModel	TokenNameIdentifier	 create Compatible Sample Model
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getTileGridXOffset	TokenNameIdentifier	 get Tile Grid X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getTileGridYOffset	TokenNameIdentifier	 get Tile Grid Y Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
WritableRaster	TokenNameIdentifier	 Writable Raster
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("Getting data for : " + wr.getWidth() + "/" + wr.getHeight() + "/" + wr.getMinX() + "/" + wr.getMinY()); 	TokenNameCOMMENT_LINE	System.out.println("Getting data for : " + wr.getWidth() + "/" + wr.getHeight() + "/" + wr.getMinX() + "/" + wr.getMinY()); 
// 	TokenNameCOMMENT_LINE	 
// First, get source data 	TokenNameCOMMENT_LINE	First, get source data 
// 	TokenNameCOMMENT_LINE	 
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
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
// System.out.println("Hello"); 	TokenNameCOMMENT_LINE	System.out.println("Hello"); 
// System.out.println("src class : " + src.getClass().getName()); 	TokenNameCOMMENT_LINE	System.out.println("src class : " + src.getClass().getName()); 
// System.out.println("this : " + this); 	TokenNameCOMMENT_LINE	System.out.println("this : " + this); 
wr	TokenNameIdentifier	 wr
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Hi"); 	TokenNameCOMMENT_LINE	System.out.println("Hi"); 
//System.out.println("Source was : " + wr.getWidth() + "/" + wr.getHeight()+ "/" + wr.getMinX() + "/" + wr.getMinY()); 	TokenNameCOMMENT_LINE	System.out.println("Source was : " + wr.getWidth() + "/" + wr.getHeight()+ "/" + wr.getMinX() + "/" + wr.getMinY()); 
// Unpremultiply data if required 	TokenNameCOMMENT_LINE	Unpremultiply data if required 
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Now, process pixel values 	TokenNameCOMMENT_LINE	Now, process pixel values 
// 	TokenNameCOMMENT_LINE	 
final	TokenNamefinal	
int	TokenNameint	
minX	TokenNameIdentifier	 min X
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
minY	TokenNameIdentifier	 min Y
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
dbf	TokenNameIdentifier	 dbf
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pixels	TokenNameIdentifier	 pixels
=	TokenNameEQUAL	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
sppsm	TokenNameIdentifier	 sppsm
;	TokenNameSEMICOLON	
sppsm	TokenNameIdentifier	 sppsm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dbf	TokenNameIdentifier	 dbf
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
sppsm	TokenNameIdentifier	 sppsm
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
minX	TokenNameIdentifier	 min X
-	TokenNameMINUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
minY	TokenNameIdentifier	 min Y
-	TokenNameMINUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// final int offset = dbf.getOffset(); 	TokenNameCOMMENT_LINE	final int offset = dbf.getOffset(); 
final	TokenNamefinal	
int	TokenNameint	
scanStride	TokenNameIdentifier	 scan Stride
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
adjust	TokenNameIdentifier	 adjust
=	TokenNameEQUAL	
scanStride	TokenNameIdentifier	 scan Stride
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
a00	TokenNameIdentifier	 a00
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a01	TokenNameIdentifier	 a01
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a02	TokenNameIdentifier	 a02
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a03	TokenNameIdentifier	 a03
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a04	TokenNameIdentifier	 a04
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
a10	TokenNameIdentifier	 a10
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a11	TokenNameIdentifier	 a11
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a12	TokenNameIdentifier	 a12
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a13	TokenNameIdentifier	 a13
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a14	TokenNameIdentifier	 a14
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
a20	TokenNameIdentifier	 a20
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a21	TokenNameIdentifier	 a21
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a22	TokenNameIdentifier	 a22
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a23	TokenNameIdentifier	 a23
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a24	TokenNameIdentifier	 a24
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
a30	TokenNameIdentifier	 a30
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a31	TokenNameIdentifier	 a31
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a32	TokenNameIdentifier	 a32
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a33	TokenNameIdentifier	 a33
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
a34	TokenNameIdentifier	 a34
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pel	TokenNameIdentifier	 pel
=	TokenNameEQUAL	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
pel	TokenNameIdentifier	 pel
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel	TokenNameIdentifier	 pel
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pel	TokenNameIdentifier	 pel
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
pel	TokenNameIdentifier	 pel
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
dr	TokenNameIdentifier	 dr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a00	TokenNameIdentifier	 a00
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
a01	TokenNameIdentifier	 a01
*	TokenNameMULTIPLY	
g	TokenNameIdentifier	 g
+	TokenNamePLUS	
a02	TokenNameIdentifier	 a02
*	TokenNameMULTIPLY	
b	TokenNameIdentifier	 b
+	TokenNamePLUS	
a03	TokenNameIdentifier	 a03
*	TokenNameMULTIPLY	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
a04	TokenNameIdentifier	 a04
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
255.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dg	TokenNameIdentifier	 dg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a10	TokenNameIdentifier	 a10
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
a11	TokenNameIdentifier	 a11
*	TokenNameMULTIPLY	
g	TokenNameIdentifier	 g
+	TokenNamePLUS	
a12	TokenNameIdentifier	 a12
*	TokenNameMULTIPLY	
b	TokenNameIdentifier	 b
+	TokenNamePLUS	
a13	TokenNameIdentifier	 a13
*	TokenNameMULTIPLY	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
a14	TokenNameIdentifier	 a14
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
255.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a20	TokenNameIdentifier	 a20
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
a21	TokenNameIdentifier	 a21
*	TokenNameMULTIPLY	
g	TokenNameIdentifier	 g
+	TokenNamePLUS	
a22	TokenNameIdentifier	 a22
*	TokenNameMULTIPLY	
b	TokenNameIdentifier	 b
+	TokenNamePLUS	
a23	TokenNameIdentifier	 a23
*	TokenNameMULTIPLY	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
a24	TokenNameIdentifier	 a24
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
255.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
da	TokenNameIdentifier	 da
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a30	TokenNameIdentifier	 a30
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
a31	TokenNameIdentifier	 a31
*	TokenNameMULTIPLY	
g	TokenNameIdentifier	 g
+	TokenNamePLUS	
a32	TokenNameIdentifier	 a32
*	TokenNameMULTIPLY	
b	TokenNameIdentifier	 b
+	TokenNamePLUS	
a33	TokenNameIdentifier	 a33
*	TokenNameMULTIPLY	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
a34	TokenNameIdentifier	 a34
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
255.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*dr = dr > 255 ? 255 : dr < 0 ? 0 : dr; dg = dg > 255 ? 255 : dg < 0 ? 0 : dg; db = db > 255 ? 255 : db < 0 ? 0 : db; da = da > 255 ? 255 : da < 0 ? 0 : da;*/	TokenNameCOMMENT_BLOCK	dr = dr > 255 ? 255 : dr < 0 ? 0 : dr; dg = dg > 255 ? 255 : dg < 0 ? 0 : dg; db = db > 255 ? 255 : db < 0 ? 0 : db; da = da > 255 ? 255 : da < 0 ? 0 : da;
// If any high bits are set we are not in range. 	TokenNameCOMMENT_LINE	If any high bits are set we are not in range. 
// If the highest bit is set then we are negative so 	TokenNameCOMMENT_LINE	If the highest bit is set then we are negative so 
// clamp to zero else we are > 255 so clamp to 255. 	TokenNameCOMMENT_LINE	clamp to zero else we are > 255 so clamp to 255. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
dr	TokenNameIdentifier	 dr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dg	TokenNameIdentifier	 dg
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
dg	TokenNameIdentifier	 dg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dg	TokenNameIdentifier	 dg
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
db	TokenNameIdentifier	 db
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
db	TokenNameIdentifier	 db
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
da	TokenNameIdentifier	 da
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
da	TokenNameIdentifier	 da
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
da	TokenNameIdentifier	 da
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
da	TokenNameIdentifier	 da
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
|	TokenNameOR	
dr	TokenNameIdentifier	 dr
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
|	TokenNameOR	
dg	TokenNameIdentifier	 dg
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
db	TokenNameIdentifier	 db
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
p	TokenNameIdentifier	 p
+=	TokenNamePLUS_EQUAL	
adjust	TokenNameIdentifier	 adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println("Result is : " + wr.getWidth() + "/" + wr.getHeight()+ "/" + wr.getMinX() + "/" + wr.getMinY()); 	TokenNameCOMMENT_LINE	System.out.println("Result is : " + wr.getWidth() + "/" + wr.getHeight()+ "/" + wr.getMinX() + "/" + wr.getMinY()); 
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
