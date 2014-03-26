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
Point	TokenNameIdentifier	 Point
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
BufferedImage	TokenNameIdentifier	 Buffered Image
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
ComponentColorModel	TokenNameIdentifier	 Component Color Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
ComponentSampleModel	TokenNameIdentifier	 Component Sample Model
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
DirectColorModel	TokenNameIdentifier	 Direct Color Model
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
/** * This allows you to specify the ColorModel, Alpha premult and/or * SampleModel to be used for output. If the input image lacks * Alpha and alpha is included in output then it is filled with * alpha=1. In all other cases bands are simply copied. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: FormatRed.java 478363 2006-11-22 23:01:13Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This allows you to specify the ColorModel, Alpha premult and/or SampleModel to be used for output. If the input image lacks Alpha and alpha is included in output then it is filled with alpha=1. In all other cases bands are simply copied. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: FormatRed.java 478363 2006-11-22 23:01:13Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
FormatRed	TokenNameIdentifier	 Format Red
extends	TokenNameextends	
AbstractRed	TokenNameIdentifier	 Abstract Red
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
CachableRed	TokenNameIdentifier	 Cachable Red
construct	TokenNameIdentifier	 construct
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
hasAlpha	TokenNameIdentifier	 has Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
hasAlpha	TokenNameIdentifier	 has Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
FormatRed	TokenNameIdentifier	 Format Red
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
getNumComponents	TokenNameIdentifier	 get Num Components
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
getNumComponents	TokenNameIdentifier	 get Num Components
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Incompatible ColorModel given"	TokenNameStringLiteral	Incompatible ColorModel given
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
instanceof	TokenNameinstanceof	
ComponentColorModel	TokenNameIdentifier	 Component Color Model
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
instanceof	TokenNameinstanceof	
ComponentColorModel	TokenNameIdentifier	 Component Color Model
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
instanceof	TokenNameinstanceof	
DirectColorModel	TokenNameIdentifier	 Direct Color Model
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
instanceof	TokenNameinstanceof	
DirectColorModel	TokenNameIdentifier	 Direct Color Model
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FormatRed	TokenNameIdentifier	 Format Red
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an instance of CachableRed around a BufferedImage. */	TokenNameCOMMENT_JAVADOC	 Construct an instance of CachableRed around a BufferedImage. 
public	TokenNamepublic	
FormatRed	TokenNameIdentifier	 Format Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
makeColorModel	TokenNameIdentifier	 make Color Model
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getTileGridXOffset	TokenNameIdentifier	 get Tile Grid X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
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
FormatRed	TokenNameIdentifier	 Format Red
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
makeSampleModel	TokenNameIdentifier	 make Sample Model
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getTileGridXOffset	TokenNameIdentifier	 get Tile Grid X Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getTileGridYOffset	TokenNameIdentifier	 get Tile Grid Y Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * fetch the source image for this node. */	TokenNameCOMMENT_JAVADOC	 fetch the source image for this node. 
public	TokenNamepublic	
CachableRed	TokenNameIdentifier	 Cachable Red
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
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
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPropertyNames	TokenNameIdentifier	 get Property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPropertyNames	TokenNameIdentifier	 get Property Names
(	TokenNameLPAREN	
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
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
=	TokenNameEQUAL	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CachableRed	TokenNameIdentifier	 Cachable Red
cr	TokenNameIdentifier	 cr
=	TokenNameEQUAL	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
=	TokenNameEQUAL	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SampleModel	TokenNameIdentifier	 Sample Model
srcSM	TokenNameIdentifier	 src SM
=	TokenNameEQUAL	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcSM	TokenNameIdentifier	 src SM
=	TokenNameEQUAL	
srcSM	TokenNameIdentifier	 src SM
.	TokenNameDOT	
createCompatibleSampleModel	TokenNameIdentifier	 create Compatible Sample Model
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WritableRaster	TokenNameIdentifier	 Writable Raster
srcWR	TokenNameIdentifier	 src WR
;	TokenNameSEMICOLON	
srcWR	TokenNameIdentifier	 src WR
=	TokenNameEQUAL	
Raster	TokenNameIdentifier	 Raster
.	TokenNameDOT	
createWritableRaster	TokenNameIdentifier	 create Writable Raster
(	TokenNameLPAREN	
srcSM	TokenNameIdentifier	 src SM
,	TokenNameCOMMA	
new	TokenNamenew	
Point	TokenNameIdentifier	 Point
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
srcWR	TokenNameIdentifier	 src WR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedImage	TokenNameIdentifier	 Buffered Image
srcBI	TokenNameIdentifier	 src BI
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
srcWR	TokenNameIdentifier	 src WR
.	TokenNameDOT	
createWritableTranslatedChild	TokenNameIdentifier	 create Writable Translated Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedImage	TokenNameIdentifier	 Buffered Image
dstBI	TokenNameIdentifier	 dst BI
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
.	TokenNameDOT	
createWritableTranslatedChild	TokenNameIdentifier	 create Writable Translated Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
copyData	TokenNameIdentifier	 copy Data
(	TokenNameLPAREN	
srcBI	TokenNameIdentifier	 src BI
,	TokenNameCOMMA	
dstBI	TokenNameIdentifier	 dst BI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wr	TokenNameIdentifier	 wr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
SampleModel	TokenNameIdentifier	 Sample Model
makeSampleModel	TokenNameIdentifier	 make Sample Model
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SampleModel	TokenNameIdentifier	 Sample Model
srcSM	TokenNameIdentifier	 src SM
=	TokenNameEQUAL	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cm	TokenNameIdentifier	 cm
.	TokenNameDOT	
createCompatibleSampleModel	TokenNameIdentifier	 create Compatible Sample Model
(	TokenNameLPAREN	
srcSM	TokenNameIdentifier	 src SM
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
srcSM	TokenNameIdentifier	 src SM
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ColorModel	TokenNameIdentifier	 Color Model
makeColorModel	TokenNameIdentifier	 make Color Model
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
SampleModel	TokenNameIdentifier	 Sample Model
sm	TokenNameIdentifier	 sm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
=	TokenNameEQUAL	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getColorModel	TokenNameIdentifier	 get Color Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorSpace	TokenNameIdentifier	 Color Space
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
getColorSpace	TokenNameIdentifier	 get Color Space
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
int	TokenNameint	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
int	TokenNameint	
dt	TokenNameIdentifier	 dt
=	TokenNameEQUAL	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
getDataType	TokenNameIdentifier	 get Data Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
dt	TokenNameIdentifier	 dt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DataBuffer	TokenNameIdentifier	 Data Buffer
.	TokenNameDOT	
TYPE_BYTE	TokenNameIdentifier	 TYPE  BYTE
:	TokenNameCOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DataBuffer	TokenNameIdentifier	 Data Buffer
.	TokenNameDOT	
TYPE_SHORT	TokenNameIdentifier	 TYPE  SHORT
:	TokenNameCOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DataBuffer	TokenNameIdentifier	 Data Buffer
.	TokenNameDOT	
TYPE_USHORT	TokenNameIdentifier	 TYPE  USHORT
:	TokenNameCOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DataBuffer	TokenNameIdentifier	 Data Buffer
.	TokenNameDOT	
TYPE_INT	TokenNameIdentifier	 TYPE  INT
:	TokenNameCOLON	
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Unsupported DataBuffer type: "	TokenNameStringLiteral	Unsupported DataBuffer type: 
+	TokenNamePLUS	
dt	TokenNameIdentifier	 dt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
hasAlpha	TokenNameIdentifier	 has Alpha
=	TokenNameEQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
hasAlpha	TokenNameIdentifier	 has Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasAlpha	TokenNameIdentifier	 has Alpha
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if Src has Alpha then our out bands must 	TokenNameCOMMENT_LINE	if Src has Alpha then our out bands must 
// either be one less than the source (no out alpha) 	TokenNameCOMMENT_LINE	either be one less than the source (no out alpha) 
// or equal (still has alpha) 	TokenNameCOMMENT_LINE	or equal (still has alpha) 
if	TokenNameif	
(	TokenNameLPAREN	
bands	TokenNameIdentifier	 bands
==	TokenNameEQUAL_EQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
getNumComponents	TokenNameIdentifier	 get Num Components
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
hasAlpha	TokenNameIdentifier	 has Alpha
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bands	TokenNameIdentifier	 bands
!=	TokenNameNOT_EQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
getNumComponents	TokenNameIdentifier	 get Num Components
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Incompatible number of bands in and out"	TokenNameStringLiteral	Incompatible number of bands in and out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bands	TokenNameIdentifier	 bands
==	TokenNameEQUAL_EQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
getNumComponents	TokenNameIdentifier	 get Num Components
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
hasAlpha	TokenNameIdentifier	 has Alpha
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bands	TokenNameIdentifier	 bands
!=	TokenNameNOT_EQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
getNumComponents	TokenNameIdentifier	 get Num Components
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Incompatible number of bands in and out"	TokenNameStringLiteral	Incompatible number of bands in and out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
preMult	TokenNameIdentifier	 pre Mult
=	TokenNameEQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasAlpha	TokenNameIdentifier	 has Alpha
)	TokenNameRPAREN	
preMult	TokenNameIdentifier	 pre Mult
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
instanceof	TokenNameinstanceof	
ComponentSampleModel	TokenNameIdentifier	 Component Sample Model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bitsPer	TokenNameIdentifier	 bits Per
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
bands	TokenNameIdentifier	 bands
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
bands	TokenNameIdentifier	 bands
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
bitsPer	TokenNameIdentifier	 bits Per
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ComponentColorModel	TokenNameIdentifier	 Component Color Model
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
,	TokenNameCOMMA	
bitsPer	TokenNameIdentifier	 bits Per
,	TokenNameCOMMA	
hasAlpha	TokenNameIdentifier	 has Alpha
,	TokenNameCOMMA	
preMult	TokenNameIdentifier	 pre Mult
,	TokenNameCOMMA	
hasAlpha	TokenNameIdentifier	 has Alpha
?	TokenNameQUESTION	
Transparency	TokenNameIdentifier	 Transparency
.	TokenNameDOT	
TRANSLUCENT	TokenNameIdentifier	 TRANSLUCENT
:	TokenNameCOLON	
Transparency	TokenNameIdentifier	 Transparency
.	TokenNameDOT	
OPAQUE	TokenNameIdentifier	 OPAQUE
,	TokenNameCOMMA	
dt	TokenNameIdentifier	 dt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
instanceof	TokenNameinstanceof	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
sppsm	TokenNameIdentifier	 sppsm
;	TokenNameSEMICOLON	
sppsm	TokenNameIdentifier	 sppsm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
sm	TokenNameIdentifier	 sm
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
masks	TokenNameIdentifier	 masks
=	TokenNameEQUAL	
sppsm	TokenNameIdentifier	 sppsm
.	TokenNameDOT	
getBitMasks	TokenNameIdentifier	 get Bit Masks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bands	TokenNameIdentifier	 bands
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
DirectColorModel	TokenNameIdentifier	 Direct Color Model
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
preMult	TokenNameIdentifier	 pre Mult
,	TokenNameCOMMA	
dt	TokenNameIdentifier	 dt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bands	TokenNameIdentifier	 bands
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
DirectColorModel	TokenNameIdentifier	 Direct Color Model
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0x0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
preMult	TokenNameIdentifier	 pre Mult
,	TokenNameCOMMA	
dt	TokenNameIdentifier	 dt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Incompatible number of bands out for ColorModel"	TokenNameStringLiteral	Incompatible number of bands out for ColorModel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Unsupported SampleModel Type"	TokenNameStringLiteral	Unsupported SampleModel Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
