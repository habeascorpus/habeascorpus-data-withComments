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
Transparency	TokenNameIdentifier	 Transparency
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
ComponentColorModel	TokenNameIdentifier	 Component Color Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
DataBuffer	TokenNameIdentifier	 Data Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
DataBufferByte	TokenNameIdentifier	 Data Buffer Byte
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
PixelInterleavedSampleModel	TokenNameIdentifier	 Pixel Interleaved Sample Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
Raster	TokenNameIdentifier	 Raster
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
ColorSpaceHintKey	TokenNameIdentifier	 Color Space Hint Key
;	TokenNameSEMICOLON	
/** * This converts any source into a mask according to the SVG masking rules. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: FilterAsAlphaRed.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This converts any source into a mask according to the SVG masking rules. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: FilterAsAlphaRed.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
FilterAsAlphaRed	TokenNameIdentifier	 Filter As Alpha Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
/** * Construct an alpah channel from the given src, according to * the SVG masking rules. * * @param src The image to convert to an alpha channel (mask image) */	TokenNameCOMMENT_JAVADOC	 Construct an alpah channel from the given src, according to the SVG masking rules. * @param src The image to convert to an alpha channel (mask image) 
public	TokenNamepublic	
FilterAsAlphaRed	TokenNameIdentifier	 Filter As Alpha Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
Any2LumRed	TokenNameIdentifier	 Any2 Lum Red
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ComponentColorModel	TokenNameIdentifier	 Component Color Model
(	TokenNameLPAREN	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
CS_GRAY	TokenNameIdentifier	 CS  GRAY
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
8	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Transparency	TokenNameIdentifier	 Transparency
.	TokenNameDOT	
OPAQUE	TokenNameIdentifier	 OPAQUE
,	TokenNameCOMMA	
DataBuffer	TokenNameIdentifier	 Data Buffer
.	TokenNameDOT	
TYPE_BYTE	TokenNameIdentifier	 TYPE  BYTE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
PixelInterleavedSampleModel	TokenNameIdentifier	 Pixel Interleaved Sample Model
(	TokenNameLPAREN	
DataBuffer	TokenNameIdentifier	 Data Buffer
.	TokenNameDOT	
TYPE_BYTE	TokenNameIdentifier	 TYPE  BYTE
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
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
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ColorSpaceHintKey	TokenNameIdentifier	 Color Space Hint Key
.	TokenNameDOT	
PROPERTY_COLORSPACE	TokenNameIdentifier	 PROPERTY  COLORSPACE
,	TokenNameCOMMA	
ColorSpaceHintKey	TokenNameIdentifier	 Color Space Hint Key
.	TokenNameDOT	
VALUE_COLORSPACE_ALPHA	TokenNameIdentifier	 VALUE  COLORSPACE  ALPHA
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
// Get my source. 	TokenNameCOMMENT_LINE	Get my source. 
CachableRed	TokenNameIdentifier	 Cachable Red
srcRed	TokenNameIdentifier	 src Red
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
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
srcRed	TokenNameIdentifier	 src Red
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// Already one band of data so we just use it... 	TokenNameCOMMENT_LINE	Already one band of data so we just use it... 
return	TokenNamereturn	
srcRed	TokenNameIdentifier	 src Red
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Two band case so we need to multiply them... 	TokenNameCOMMENT_LINE	Two band case so we need to multiply them... 
// Note: Our source will always have either one or two bands 	TokenNameCOMMENT_LINE	Note: Our source will always have either one or two bands 
// since we insert an Any2Lum transform before ourself in the 	TokenNameCOMMENT_LINE	since we insert an Any2Lum transform before ourself in the 
// rendering chain. 	TokenNameCOMMENT_LINE	rendering chain. 
Raster	TokenNameIdentifier	 Raster
srcRas	TokenNameIdentifier	 src Ras
=	TokenNameEQUAL	
srcRed	TokenNameIdentifier	 src Red
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PixelInterleavedSampleModel	TokenNameIdentifier	 Pixel Interleaved Sample Model
srcSM	TokenNameIdentifier	 src SM
;	TokenNameSEMICOLON	
srcSM	TokenNameIdentifier	 src SM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PixelInterleavedSampleModel	TokenNameIdentifier	 Pixel Interleaved Sample Model
)	TokenNameRPAREN	
srcRas	TokenNameIdentifier	 src Ras
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataBufferByte	TokenNameIdentifier	 Data Buffer Byte
srcDB	TokenNameIdentifier	 src DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferByte	TokenNameIdentifier	 Data Buffer Byte
)	TokenNameRPAREN	
srcRas	TokenNameIdentifier	 src Ras
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
srcDB	TokenNameIdentifier	 src DB
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PixelInterleavedSampleModel	TokenNameIdentifier	 Pixel Interleaved Sample Model
dstSM	TokenNameIdentifier	 dst SM
;	TokenNameSEMICOLON	
dstSM	TokenNameIdentifier	 dst SM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PixelInterleavedSampleModel	TokenNameIdentifier	 Pixel Interleaved Sample Model
)	TokenNameRPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataBufferByte	TokenNameIdentifier	 Data Buffer Byte
dstDB	TokenNameIdentifier	 dst DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferByte	TokenNameIdentifier	 Data Buffer Byte
)	TokenNameRPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dst	TokenNameIdentifier	 dst
=	TokenNameEQUAL	
dstDB	TokenNameIdentifier	 dst DB
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcX0	TokenNameIdentifier	 src X0
=	TokenNameEQUAL	
srcRas	TokenNameIdentifier	 src Ras
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
srcRas	TokenNameIdentifier	 src Ras
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcY0	TokenNameIdentifier	 src Y0
=	TokenNameEQUAL	
srcRas	TokenNameIdentifier	 src Ras
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
srcRas	TokenNameIdentifier	 src Ras
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dstX0	TokenNameIdentifier	 dst X0
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dstX1	TokenNameIdentifier	 dst X1
=	TokenNameEQUAL	
dstX0	TokenNameIdentifier	 dst X0
+	TokenNamePLUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
dstY0	TokenNameIdentifier	 dst Y0
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcStep	TokenNameIdentifier	 src Step
=	TokenNameEQUAL	
srcSM	TokenNameIdentifier	 src SM
.	TokenNameDOT	
getPixelStride	TokenNameIdentifier	 get Pixel Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
srcSM	TokenNameIdentifier	 src SM
.	TokenNameDOT	
getBandOffsets	TokenNameIdentifier	 get Band Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcLOff	TokenNameIdentifier	 src L Off
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcAOff	TokenNameIdentifier	 src A Off
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcRed	TokenNameIdentifier	 src Red
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Lum is already multiplied by alpha so we just copy lum channel. 	TokenNameCOMMENT_LINE	Lum is already multiplied by alpha so we just copy lum channel. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
srcRas	TokenNameIdentifier	 src Ras
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
srcI	TokenNameIdentifier	 src I
=	TokenNameEQUAL	
srcDB	TokenNameIdentifier	 src DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcSM	TokenNameIdentifier	 src SM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
srcX0	TokenNameIdentifier	 src X0
,	TokenNameCOMMA	
srcY0	TokenNameIdentifier	 src Y0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dstI	TokenNameIdentifier	 dst I
=	TokenNameEQUAL	
dstDB	TokenNameIdentifier	 dst DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstSM	TokenNameIdentifier	 dst SM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
dstX0	TokenNameIdentifier	 dst X0
,	TokenNameCOMMA	
dstY0	TokenNameIdentifier	 dst Y0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dstE	TokenNameIdentifier	 dst E
=	TokenNameEQUAL	
dstDB	TokenNameIdentifier	 dst DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstSM	TokenNameIdentifier	 dst SM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
dstX1	TokenNameIdentifier	 dst X1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstY0	TokenNameIdentifier	 dst Y0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcI	TokenNameIdentifier	 src I
+=	TokenNamePLUS_EQUAL	
srcLOff	TokenNameIdentifier	 src L Off
;	TokenNameSEMICOLON	
// Go to Lum Channel (already mult by alpha). 	TokenNameCOMMENT_LINE	Go to Lum Channel (already mult by alpha). 
while	TokenNamewhile	
(	TokenNameLPAREN	
dstI	TokenNameIdentifier	 dst I
<	TokenNameLESS	
dstE	TokenNameIdentifier	 dst E
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dst	TokenNameIdentifier	 dst
[	TokenNameLBRACKET	
dstI	TokenNameIdentifier	 dst I
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
[	TokenNameLBRACKET	
srcI	TokenNameIdentifier	 src I
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
srcI	TokenNameIdentifier	 src I
+=	TokenNamePLUS_EQUAL	
srcStep	TokenNameIdentifier	 src Step
;	TokenNameSEMICOLON	
// Go to next pixel 	TokenNameCOMMENT_LINE	Go to next pixel 
}	TokenNameRBRACE	
srcY0	TokenNameIdentifier	 src Y0
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
dstY0	TokenNameIdentifier	 dst Y0
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// This allows me to pre-adjust my index by srcLOff 	TokenNameCOMMENT_LINE	This allows me to pre-adjust my index by srcLOff 
// Then only add the offset for srcAOff 	TokenNameCOMMENT_LINE	Then only add the offset for srcAOff 
srcAOff	TokenNameIdentifier	 src A Off
=	TokenNameEQUAL	
srcAOff	TokenNameIdentifier	 src A Off
-	TokenNameMINUS	
srcLOff	TokenNameIdentifier	 src L Off
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
srcRas	TokenNameIdentifier	 src Ras
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
srcI	TokenNameIdentifier	 src I
=	TokenNameEQUAL	
srcDB	TokenNameIdentifier	 src DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcSM	TokenNameIdentifier	 src SM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
srcX0	TokenNameIdentifier	 src X0
,	TokenNameCOMMA	
srcY0	TokenNameIdentifier	 src Y0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dstI	TokenNameIdentifier	 dst I
=	TokenNameEQUAL	
dstDB	TokenNameIdentifier	 dst DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstSM	TokenNameIdentifier	 dst SM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
dstX0	TokenNameIdentifier	 dst X0
,	TokenNameCOMMA	
dstY0	TokenNameIdentifier	 dst Y0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dstE	TokenNameIdentifier	 dst E
=	TokenNameEQUAL	
dstDB	TokenNameIdentifier	 dst DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstSM	TokenNameIdentifier	 dst SM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
dstX1	TokenNameIdentifier	 dst X1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstY0	TokenNameIdentifier	 dst Y0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcI	TokenNameIdentifier	 src I
+=	TokenNamePLUS_EQUAL	
srcLOff	TokenNameIdentifier	 src L Off
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstI	TokenNameIdentifier	 dst I
<	TokenNameLESS	
dstE	TokenNameIdentifier	 dst E
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sl	TokenNameIdentifier	 sl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
[	TokenNameLBRACKET	
srcI	TokenNameIdentifier	 src I
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// LOff already included 	TokenNameCOMMENT_LINE	LOff already included 
int	TokenNameint	
sa	TokenNameIdentifier	 sa
=	TokenNameEQUAL	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
[	TokenNameLBRACKET	
srcI	TokenNameIdentifier	 src I
+	TokenNamePLUS	
srcAOff	TokenNameIdentifier	 src A Off
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// the + 0x80 forces proper rounding. 	TokenNameCOMMENT_LINE	the + 0x80 forces proper rounding. 
dst	TokenNameIdentifier	 dst
[	TokenNameLBRACKET	
dstI	TokenNameIdentifier	 dst I
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sl	TokenNameIdentifier	 sl
*	TokenNameMULTIPLY	
sa	TokenNameIdentifier	 sa
+	TokenNamePLUS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcI	TokenNameIdentifier	 src I
+=	TokenNamePLUS_EQUAL	
srcStep	TokenNameIdentifier	 src Step
;	TokenNameSEMICOLON	
// next pixel 	TokenNameCOMMENT_LINE	next pixel 
}	TokenNameRBRACE	
srcY0	TokenNameIdentifier	 src Y0
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
dstY0	TokenNameIdentifier	 dst Y0
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
