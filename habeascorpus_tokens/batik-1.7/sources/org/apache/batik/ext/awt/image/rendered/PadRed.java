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
Rectangle	TokenNameIdentifier	 Rectangle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
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
PadMode	TokenNameIdentifier	 Pad Mode
;	TokenNameSEMICOLON	
/** * This is an implementation of a Pad operation as a RenderedImage. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: PadRed.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This is an implementation of a Pad operation as a RenderedImage. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: PadRed.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
PadRed	TokenNameIdentifier	 Pad Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
PadMode	TokenNameIdentifier	 Pad Mode
padMode	TokenNameIdentifier	 pad Mode
;	TokenNameSEMICOLON	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
;	TokenNameSEMICOLON	
/** * Construct A Rendered Pad operation. If the pad is smaller than * the original image size then this devolves to a Crop. * * @param src The image to pad/crop * @param bounds The bounds of the result (same coord system as src). * @param padMode The pad mode to use (currently ignored). * @param hints The hints to use for drawing 'pad' area. */	TokenNameCOMMENT_JAVADOC	 Construct A Rendered Pad operation. If the pad is smaller than the original image size then this devolves to a Crop. * @param src The image to pad/crop @param bounds The bounds of the result (same coord system as src). @param padMode The pad mode to use (currently ignored). @param hints The hints to use for drawing 'pad' area. 
public	TokenNamepublic	
PadRed	TokenNameIdentifier	 Pad Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
PadMode	TokenNameIdentifier	 Pad Mode
padMode	TokenNameIdentifier	 pad Mode
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fixSampleModel	TokenNameIdentifier	 fix Sample Model
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
padMode	TokenNameIdentifier	 pad Mode
=	TokenNameEQUAL	
padMode	TokenNameIdentifier	 pad Mode
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Src: "	TokenNameStringLiteral	Src: 
+	TokenNamePLUS	
src	TokenNameIdentifier	 src
+	TokenNamePLUS	
" Bounds: "	TokenNameStringLiteral	 Bounds: 
+	TokenNamePLUS	
bounds	TokenNameIdentifier	 bounds
+	TokenNamePLUS	
" Off: "	TokenNameStringLiteral	 Off: 
+	TokenNamePLUS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getTileGridXOffset	TokenNameIdentifier	 get Tile Grid X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getTileGridYOffset	TokenNameIdentifier	 get Tile Grid Y Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
hints	TokenNameIdentifier	 hints
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
Rectangle	TokenNameIdentifier	 Rectangle
srcR	TokenNameIdentifier	 src R
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
wrR	TokenNameIdentifier	 wr R
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
intersection	TokenNameIdentifier	 intersection
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Limit the raster I send to my source to his rect. 	TokenNameCOMMENT_LINE	Limit the raster I send to my source to his rect. 
WritableRaster	TokenNameIdentifier	 Writable Raster
srcWR	TokenNameIdentifier	 src WR
;	TokenNameSEMICOLON	
srcWR	TokenNameIdentifier	 src WR
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
createWritableChild	TokenNameIdentifier	 create Writable Child
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
srcWR	TokenNameIdentifier	 src WR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
padMode	TokenNameIdentifier	 pad Mode
==	TokenNameEQUAL_EQUAL	
PadMode	TokenNameIdentifier	 Pad Mode
.	TokenNameDOT	
ZERO_PAD	TokenNameIdentifier	 ZERO  PAD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleZero	TokenNameIdentifier	 handle Zero
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
padMode	TokenNameIdentifier	 pad Mode
==	TokenNameEQUAL_EQUAL	
PadMode	TokenNameIdentifier	 Pad Mode
.	TokenNameDOT	
REPLICATE	TokenNameIdentifier	 REPLICATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleReplicate	TokenNameIdentifier	 handle Replicate
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
padMode	TokenNameIdentifier	 pad Mode
==	TokenNameEQUAL_EQUAL	
PadMode	TokenNameIdentifier	 Pad Mode
.	TokenNameDOT	
WRAP	TokenNameIdentifier	 WRAP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleWrap	TokenNameIdentifier	 handle Wrap
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
ZeroRecter	TokenNameIdentifier	 Zero Recter
{	TokenNameLBRACE	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
int	TokenNameint	
bands	TokenNameIdentifier	 bands
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
zeros	TokenNameIdentifier	 zeros
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ZeroRecter	TokenNameIdentifier	 Zero Recter
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
wr	TokenNameIdentifier	 wr
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bands	TokenNameIdentifier	 bands
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
zeroRect	TokenNameIdentifier	 zero Rect
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
zeros	TokenNameIdentifier	 zeros
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
zeros	TokenNameIdentifier	 zeros
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
*	TokenNameMULTIPLY	
bands	TokenNameIdentifier	 bands
)	TokenNameRPAREN	
)	TokenNameRPAREN	
zeros	TokenNameIdentifier	 zeros
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
*	TokenNameMULTIPLY	
bands	TokenNameIdentifier	 bands
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
zeros	TokenNameIdentifier	 zeros
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ZeroRecter	TokenNameIdentifier	 Zero Recter
getZeroRecter	TokenNameIdentifier	 get Zero Recter
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
is_INT_PACK_Data	TokenNameIdentifier	 is  INT  PACK  Data
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
ZeroRecter_INT_PACK	TokenNameIdentifier	 Zero Recter  INT  PACK
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
ZeroRecter	TokenNameIdentifier	 Zero Recter
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
zeroRect	TokenNameIdentifier	 zero Rect
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZeroRecter	TokenNameIdentifier	 Zero Recter
zr	TokenNameIdentifier	 zr
=	TokenNameEQUAL	
getZeroRecter	TokenNameIdentifier	 get Zero Recter
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zr	TokenNameIdentifier	 zr
.	TokenNameDOT	
zeroRect	TokenNameIdentifier	 zero Rect
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
ZeroRecter_INT_PACK	TokenNameIdentifier	 Zero Recter  INT  PACK
extends	TokenNameextends	
ZeroRecter	TokenNameIdentifier	 Zero Recter
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
scanStride	TokenNameIdentifier	 scan Stride
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pixels	TokenNameIdentifier	 pixels
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
zeros	TokenNameIdentifier	 zeros
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
x0	TokenNameIdentifier	 x0
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ZeroRecter_INT_PACK	TokenNameIdentifier	 Zero Recter  INT  PACK
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
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
scanStride	TokenNameIdentifier	 scan Stride
=	TokenNameEQUAL	
sppsm	TokenNameIdentifier	 sppsm
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
db	TokenNameIdentifier	 db
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
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
(	TokenNameLPAREN	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
sppsm	TokenNameIdentifier	 sppsm
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
-	TokenNameMINUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
-	TokenNameMINUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pixels	TokenNameIdentifier	 pixels
=	TokenNameEQUAL	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
zeros	TokenNameIdentifier	 zeros
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
zeros	TokenNameIdentifier	 zeros
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
zeroRect	TokenNameIdentifier	 zero Rect
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
rbase	TokenNameIdentifier	 rbase
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
x0	TokenNameIdentifier	 x0
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
y0	TokenNameIdentifier	 y0
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scanStride	TokenNameIdentifier	 scan Stride
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
>	TokenNameGREATER	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Longer runs use arraycopy... 	TokenNameCOMMENT_LINE	Longer runs use arraycopy... 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
rbase	TokenNameIdentifier	 rbase
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
scanStride	TokenNameIdentifier	 scan Stride
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
zeros	TokenNameIdentifier	 zeros
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pixels	TokenNameIdentifier	 pixels
,	TokenNameCOMMA	
sp	TokenNameIdentifier	 sp
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Small runs quicker to avoid func call. 	TokenNameCOMMENT_LINE	Small runs quicker to avoid func call. 
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
rbase	TokenNameIdentifier	 rbase
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
int	TokenNameint	
adj	TokenNameIdentifier	 adj
=	TokenNameEQUAL	
scanStride	TokenNameIdentifier	 scan Stride
-	TokenNameMINUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
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
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
pixels	TokenNameIdentifier	 pixels
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
+=	TokenNamePLUS_EQUAL	
adj	TokenNameIdentifier	 adj
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
+=	TokenNamePLUS_EQUAL	
scanStride	TokenNameIdentifier	 scan Stride
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
handleZero	TokenNameIdentifier	 handle Zero
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get my source. 	TokenNameCOMMENT_LINE	Get my source. 
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
Rectangle	TokenNameIdentifier	 Rectangle
srcR	TokenNameIdentifier	 src R
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
wrR	TokenNameIdentifier	 wr R
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZeroRecter	TokenNameIdentifier	 Zero Recter
zr	TokenNameIdentifier	 zr
=	TokenNameEQUAL	
ZeroRecter	TokenNameIdentifier	 Zero Recter
.	TokenNameDOT	
getZeroRecter	TokenNameIdentifier	 get Zero Recter
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// area rect (covers the area left to handle). 	TokenNameCOMMENT_LINE	area rect (covers the area left to handle). 
Rectangle	TokenNameIdentifier	 Rectangle
ar	TokenNameIdentifier	 ar
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// draw rect (used for calls to zeroRect); 	TokenNameCOMMENT_LINE	draw rect (used for calls to zeroRect); 
Rectangle	TokenNameIdentifier	 Rectangle
dr	TokenNameIdentifier	 dr
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We split the edge drawing up into four parts. 	TokenNameCOMMENT_LINE	We split the edge drawing up into four parts. 
// 	TokenNameCOMMENT_LINE	 
// +-----------------------------+ 	TokenNameCOMMENT_LINE	+-----------------------------+ 
// | 1 | 2 | 	TokenNameCOMMENT_LINE	| 1 | 2 | 
// | +---------------+------| 	TokenNameCOMMENT_LINE	| +---------------+------| 
// / / /4 / 	TokenNameCOMMENT_LINE	/ / /4 / 
// / / / / 	TokenNameCOMMENT_LINE	/ / / / 
// / / / / 	TokenNameCOMMENT_LINE	/ / / / 
// / / / / 	TokenNameCOMMENT_LINE	/ / / / 
// | +---------------+------| 	TokenNameCOMMENT_LINE	| +---------------+------| 
// | | 3 | 	TokenNameCOMMENT_LINE	| | 3 | 
// +-----------------------------+ 	TokenNameCOMMENT_LINE	+-----------------------------+ 
// 	TokenNameCOMMENT_LINE	 
// We update our x,y, width, height as we go along so 	TokenNameCOMMENT_LINE	We update our x,y, width, height as we go along so 
// we 'forget' about the parts we have already painted... 	TokenNameCOMMENT_LINE	we 'forget' about the parts we have already painted... 
// Draw #1 	TokenNameCOMMENT_LINE	Draw #1 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WrR: "	TokenNameStringLiteral	WrR: 
+	TokenNamePLUS	
wrR	TokenNameIdentifier	 wr R
+	TokenNamePLUS	
" srcR: "	TokenNameStringLiteral	 srcR: 
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// g2d.setColor(new Color(255,0,0,128)); 	TokenNameCOMMENT_LINE	g2d.setColor(new Color(255,0,0,128)); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
>	TokenNameGREATER	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
// g2d.fillRect(x, y, w, height); 	TokenNameCOMMENT_LINE	g2d.fillRect(x, y, w, height); 
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
zr	TokenNameIdentifier	 zr
.	TokenNameDOT	
zeroRect	TokenNameIdentifier	 zero Rect
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+=	TokenNamePLUS_EQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-=	TokenNameMINUS_EQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Draw #2 	TokenNameCOMMENT_LINE	Draw #2 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WrR: ["	TokenNameStringLiteral	WrR: [
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
height	TokenNameIdentifier	 height
+	TokenNamePLUS	
"] s rcR: "	TokenNameStringLiteral	] s rcR: 
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// g2d.setColor(new Color(0,0,255,128)); 	TokenNameCOMMENT_LINE	g2d.setColor(new Color(0,0,255,128)); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
>	TokenNameGREATER	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
// g2d.fillRect(x, y, width, h); 	TokenNameCOMMENT_LINE	g2d.fillRect(x, y, width, h); 
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
zr	TokenNameIdentifier	 zr
.	TokenNameDOT	
zeroRect	TokenNameIdentifier	 zero Rect
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+=	TokenNamePLUS_EQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-=	TokenNameMINUS_EQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Draw #3 	TokenNameCOMMENT_LINE	Draw #3 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WrR: ["	TokenNameStringLiteral	WrR: [
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
height	TokenNameIdentifier	 height
+	TokenNamePLUS	
"] srcR: "	TokenNameStringLiteral	] srcR: 
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// g2d.setColor(new Color(0,255,0,128)); 	TokenNameCOMMENT_LINE	g2d.setColor(new Color(0,255,0,128)); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
height	TokenNameIdentifier	 height
>	TokenNameGREATER	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
>	TokenNameGREATER	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
// the +/-1 cancel (?) 	TokenNameCOMMENT_LINE	the +/-1 cancel (?) 
// g2d.fillRect(x, y0, width, h); 	TokenNameCOMMENT_LINE	g2d.fillRect(x, y0, width, h); 
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
zr	TokenNameIdentifier	 zr
.	TokenNameDOT	
zeroRect	TokenNameIdentifier	 zero Rect
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-=	TokenNameMINUS_EQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Draw #4 	TokenNameCOMMENT_LINE	Draw #4 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WrR: ["	TokenNameStringLiteral	WrR: [
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
height	TokenNameIdentifier	 height
+	TokenNamePLUS	
"] srcR: "	TokenNameStringLiteral	] srcR: 
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// g2d.setColor(new Color(255,255,0,128)); 	TokenNameCOMMENT_LINE	g2d.setColor(new Color(255,255,0,128)); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
>	TokenNameGREATER	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
>	TokenNameGREATER	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
int	TokenNameint	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
// the +/-1 cancel (?) 	TokenNameCOMMENT_LINE	the +/-1 cancel (?) 
// g2d.fillRect(x0, y, w, height); 	TokenNameCOMMENT_LINE	g2d.fillRect(x0, y, w, height); 
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x0	TokenNameIdentifier	 x0
;	TokenNameSEMICOLON	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
dr	TokenNameIdentifier	 dr
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
zr	TokenNameIdentifier	 zr
.	TokenNameDOT	
zeroRect	TokenNameIdentifier	 zero Rect
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-=	TokenNameMINUS_EQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
handleReplicate	TokenNameIdentifier	 handle Replicate
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get my source. 	TokenNameCOMMENT_LINE	Get my source. 
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
Rectangle	TokenNameIdentifier	 Rectangle
srcR	TokenNameIdentifier	 src R
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
wrR	TokenNameIdentifier	 wr R
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
int	TokenNameint	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
int	TokenNameint	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
wrR	TokenNameIdentifier	 wr R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
// Calculate an intersection that makes some sense 	TokenNameCOMMENT_LINE	Calculate an intersection that makes some sense 
// even when the rects don't really intersect 	TokenNameCOMMENT_LINE	even when the rects don't really intersect 
// (The x and y ranges will be correct if they 	TokenNameCOMMENT_LINE	(The x and y ranges will be correct if they 
// overlap in one dimension even if they don't 	TokenNameCOMMENT_LINE	overlap in one dimension even if they don't 
// intersect in both dimensions). 	TokenNameCOMMENT_LINE	intersect in both dimensions). 
int	TokenNameint	
minX	TokenNameIdentifier	 min X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
?	TokenNameQUESTION	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
:	TokenNameCOLON	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
maxX	TokenNameIdentifier	 max X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
minY	TokenNameIdentifier	 min Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
>	TokenNameGREATER	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
?	TokenNameQUESTION	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
:	TokenNameCOLON	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
int	TokenNameint	
maxY	TokenNameIdentifier	 max Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
minX	TokenNameIdentifier	 min X
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
maxX	TokenNameIdentifier	 max X
-	TokenNameMINUS	
minX	TokenNameIdentifier	 min X
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
minY	TokenNameIdentifier	 min Y
;	TokenNameSEMICOLON	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
maxY	TokenNameIdentifier	 max Y
-	TokenNameMINUS	
minY	TokenNameIdentifier	 min Y
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We split the edge drawing up into four parts. 	TokenNameCOMMENT_LINE	We split the edge drawing up into four parts. 
// 	TokenNameCOMMENT_LINE	 
// +-----------------------------+ 	TokenNameCOMMENT_LINE	+-----------------------------+ 
// | 3 | 1 | 4 | 	TokenNameCOMMENT_LINE	| 3 | 1 | 4 | 
// | +---------------+ | 	TokenNameCOMMENT_LINE	| +---------------+ | 
// / / / / 	TokenNameCOMMENT_LINE	/ / / / 
// / / src / / 	TokenNameCOMMENT_LINE	/ / src / / 
// / / / / 	TokenNameCOMMENT_LINE	/ / / / 
// / / / / 	TokenNameCOMMENT_LINE	/ / / / 
// | +---------------+ | 	TokenNameCOMMENT_LINE	| +---------------+ | 
// | | 2 | | 	TokenNameCOMMENT_LINE	| | 2 | | 
// +-----------------------------+ 	TokenNameCOMMENT_LINE	+-----------------------------+ 
// 	TokenNameCOMMENT_LINE	 
// Draw #1 	TokenNameCOMMENT_LINE	Draw #1 
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
repW	TokenNameIdentifier	 rep W
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
int	TokenNameint	
repX	TokenNameIdentifier	 rep X
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
wrX	TokenNameIdentifier	 wr X
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
wrY	TokenNameIdentifier	 wr Y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we are off to the left of src. so set repX to the 	TokenNameCOMMENT_LINE	we are off to the left of src. so set repX to the 
// left most pixel... 	TokenNameCOMMENT_LINE	left most pixel... 
repW	TokenNameIdentifier	 rep W
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
repX	TokenNameIdentifier	 rep X
=	TokenNameEQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
wrX	TokenNameIdentifier	 wr X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>=	TokenNameGREATER_EQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we are off to the right of src, so set repX to 	TokenNameCOMMENT_LINE	we are off to the right of src, so set repX to 
// the right most pixel 	TokenNameCOMMENT_LINE	the right most pixel 
repW	TokenNameIdentifier	 rep W
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
repX	TokenNameIdentifier	 rep X
=	TokenNameEQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
wrX	TokenNameIdentifier	 wr X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This fills the top row of section 1 from src (we 	TokenNameCOMMENT_LINE	This fills the top row of section 1 from src (we 
// go to src instead of getting the data from wr because 	TokenNameCOMMENT_LINE	go to src instead of getting the data from wr because 
// in some cases wr will be completely off the top of src 	TokenNameCOMMENT_LINE	in some cases wr will be completely off the top of src 
WritableRaster	TokenNameIdentifier	 Writable Raster
wr1	TokenNameIdentifier	 wr1
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
createWritableChild	TokenNameIdentifier	 create Writable Child
(	TokenNameLPAREN	
wrX	TokenNameIdentifier	 wr X
,	TokenNameCOMMA	
wrY	TokenNameIdentifier	 wr Y
,	TokenNameCOMMA	
repW	TokenNameIdentifier	 rep W
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
repX	TokenNameIdentifier	 rep X
,	TokenNameCOMMA	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
wr1	TokenNameIdentifier	 wr1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wrY	TokenNameIdentifier	 wr Y
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
endY	TokenNameIdentifier	 end Y
=	TokenNameEQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
height	TokenNameIdentifier	 height
<	TokenNameLESS	
endY	TokenNameIdentifier	 end Y
)	TokenNameRPAREN	
endY	TokenNameIdentifier	 end Y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wrY	TokenNameIdentifier	 wr Y
<	TokenNameLESS	
endY	TokenNameIdentifier	 end Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pixels	TokenNameIdentifier	 pixels
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
wrX	TokenNameIdentifier	 wr X
,	TokenNameCOMMA	
wrY	TokenNameIdentifier	 wr Y
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
repW	TokenNameIdentifier	 rep W
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
wrY	TokenNameIdentifier	 wr Y
<	TokenNameLESS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
wrX	TokenNameIdentifier	 wr X
,	TokenNameCOMMA	
wrY	TokenNameIdentifier	 wr Y
,	TokenNameCOMMA	
repW	TokenNameIdentifier	 rep W
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pixels	TokenNameIdentifier	 pixels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wrY	TokenNameIdentifier	 wr Y
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Draw #2 	TokenNameCOMMENT_LINE	Draw #2 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
repW	TokenNameIdentifier	 rep W
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
int	TokenNameint	
repX	TokenNameIdentifier	 rep X
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
repY	TokenNameIdentifier	 rep Y
=	TokenNameEQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
wrX	TokenNameIdentifier	 wr X
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
wrY	TokenNameIdentifier	 wr Y
=	TokenNameEQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wrY	TokenNameIdentifier	 wr Y
<	TokenNameLESS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
wrY	TokenNameIdentifier	 wr Y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
<=	TokenNameLESS_EQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we are off to the left of src. so set repX to the 	TokenNameCOMMENT_LINE	we are off to the left of src. so set repX to the 
// left most pixel... 	TokenNameCOMMENT_LINE	left most pixel... 
repW	TokenNameIdentifier	 rep W
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
repX	TokenNameIdentifier	 rep X
=	TokenNameEQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
wrX	TokenNameIdentifier	 wr X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>=	TokenNameGREATER_EQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we are off to the right of src, so set repX to 	TokenNameCOMMENT_LINE	we are off to the right of src, so set repX to 
// the right most pixel 	TokenNameCOMMENT_LINE	the right most pixel 
repW	TokenNameIdentifier	 rep W
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
repX	TokenNameIdentifier	 rep X
=	TokenNameEQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
wrX	TokenNameIdentifier	 wr X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"wr: "	TokenNameStringLiteral	wr: 
+	TokenNamePLUS	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"req: ["	TokenNameStringLiteral	req: [
+	TokenNamePLUS	
wrX	TokenNameIdentifier	 wr X
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
wrY	TokenNameIdentifier	 wr Y
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
repW	TokenNameIdentifier	 rep W
+	TokenNamePLUS	
", 1]"	TokenNameStringLiteral	, 1]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// First we get the top row of pixels from src. (we 	TokenNameCOMMENT_LINE	First we get the top row of pixels from src. (we 
// go to src instead of getting the data from wr because 	TokenNameCOMMENT_LINE	go to src instead of getting the data from wr because 
// in some cases wr will be completely off the bottom of src). 	TokenNameCOMMENT_LINE	in some cases wr will be completely off the bottom of src). 
WritableRaster	TokenNameIdentifier	 Writable Raster
wr1	TokenNameIdentifier	 wr1
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
createWritableChild	TokenNameIdentifier	 create Writable Child
(	TokenNameLPAREN	
wrX	TokenNameIdentifier	 wr X
,	TokenNameCOMMA	
wrY	TokenNameIdentifier	 wr Y
,	TokenNameCOMMA	
repW	TokenNameIdentifier	 rep W
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
repX	TokenNameIdentifier	 rep X
,	TokenNameCOMMA	
repY	TokenNameIdentifier	 rep Y
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This fills the top row of section 2 from src 	TokenNameCOMMENT_LINE	This fills the top row of section 2 from src 
src	TokenNameIdentifier	 src
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
wr1	TokenNameIdentifier	 wr1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wrY	TokenNameIdentifier	 wr Y
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
endY	TokenNameIdentifier	 end Y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wrY	TokenNameIdentifier	 wr Y
<	TokenNameLESS	
endY	TokenNameIdentifier	 end Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This fills the rest of section 2 from the first line. 	TokenNameCOMMENT_LINE	This fills the rest of section 2 from the first line. 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pixels	TokenNameIdentifier	 pixels
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
wrX	TokenNameIdentifier	 wr X
,	TokenNameCOMMA	
wrY	TokenNameIdentifier	 wr Y
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
repW	TokenNameIdentifier	 rep W
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
wrY	TokenNameIdentifier	 wr Y
<	TokenNameLESS	
endY	TokenNameIdentifier	 end Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
wrX	TokenNameIdentifier	 wr X
,	TokenNameCOMMA	
wrY	TokenNameIdentifier	 wr Y
,	TokenNameCOMMA	
repW	TokenNameIdentifier	 rep W
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pixels	TokenNameIdentifier	 pixels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wrY	TokenNameIdentifier	 wr Y
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Draw #3 	TokenNameCOMMENT_LINE	Draw #3 
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We are garunteed that we have a column of pixels down 	TokenNameCOMMENT_LINE	We are garunteed that we have a column of pixels down 
// the edge of 1 and src. We simply replicate this column 	TokenNameCOMMENT_LINE	the edge of 1 and src. We simply replicate this column 
// out to the edges of 2. 	TokenNameCOMMENT_LINE	out to the edges of 2. 
int	TokenNameint	
wrX	TokenNameIdentifier	 wr X
=	TokenNameEQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
<=	TokenNameLESS_EQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wrX	TokenNameIdentifier	 wr X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
xLoc	TokenNameIdentifier	 x Loc
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pixels	TokenNameIdentifier	 pixels
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
wrX	TokenNameIdentifier	 wr X
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
xLoc	TokenNameIdentifier	 x Loc
<	TokenNameLESS	
wrX	TokenNameIdentifier	 wr X
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
xLoc	TokenNameIdentifier	 x Loc
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
pixels	TokenNameIdentifier	 pixels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xLoc	TokenNameIdentifier	 x Loc
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Draw #4 	TokenNameCOMMENT_LINE	Draw #4 
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
>	TokenNameGREATER	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We are garunteed that we have a column of pixels down 	TokenNameCOMMENT_LINE	We are garunteed that we have a column of pixels down 
// the edge of 1 and src. We simply replicate this column 	TokenNameCOMMENT_LINE	the edge of 1 and src. We simply replicate this column 
// out to the edges of 3. 	TokenNameCOMMENT_LINE	out to the edges of 3. 
int	TokenNameint	
wrX	TokenNameIdentifier	 wr X
=	TokenNameEQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>=	TokenNameGREATER_EQUAL	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wrX	TokenNameIdentifier	 wr X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
xLoc	TokenNameIdentifier	 x Loc
=	TokenNameEQUAL	
wrX	TokenNameIdentifier	 wr X
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
endX	TokenNameIdentifier	 end X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pixels	TokenNameIdentifier	 pixels
=	TokenNameEQUAL	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
wrX	TokenNameIdentifier	 wr X
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
xLoc	TokenNameIdentifier	 x Loc
<	TokenNameLESS	
endX	TokenNameIdentifier	 end X
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
xLoc	TokenNameIdentifier	 x Loc
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
pixels	TokenNameIdentifier	 pixels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xLoc	TokenNameIdentifier	 x Loc
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
handleWrap	TokenNameIdentifier	 handle Wrap
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleZero	TokenNameIdentifier	 handle Zero
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function 'fixes' the source's sample model. * right now it just ensures that the sample model isn't * much larger than my width. */	TokenNameCOMMENT_JAVADOC	 This function 'fixes' the source's sample model. right now it just ensures that the sample model isn't much larger than my width. 
protected	TokenNameprotected	
static	TokenNamestatic	
SampleModel	TokenNameIdentifier	 Sample Model
fixSampleModel	TokenNameIdentifier	 fix Sample Model
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
defSz	TokenNameIdentifier	 def Sz
=	TokenNameEQUAL	
AbstractTiledRed	TokenNameIdentifier	 Abstract Tiled Red
.	TokenNameDOT	
getDefaultTileSize	TokenNameIdentifier	 get Default Tile Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
<	TokenNameLESS	
defSz	TokenNameIdentifier	 def Sz
)	TokenNameRPAREN	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
defSz	TokenNameIdentifier	 def Sz
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
>	TokenNameGREATER	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
<	TokenNameLESS	
defSz	TokenNameIdentifier	 def Sz
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
defSz	TokenNameIdentifier	 def Sz
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
>	TokenNameGREATER	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
// System.out.println("Pad SMSz: " + w + "x" + h); 	TokenNameCOMMENT_LINE	System.out.println("Pad SMSz: " + w + "x" + h); 
return	TokenNamereturn	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
createCompatibleSampleModel	TokenNameIdentifier	 create Compatible Sample Model
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
