/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
wmf	TokenNameIdentifier	 wmf
.	TokenNameDOT	
tosvg	TokenNameIdentifier	 tosvg
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Font	TokenNameIdentifier	 Font
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Dimension	TokenNameIdentifier	 Dimension
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics2D	TokenNameIdentifier	 Graphics2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedString	TokenNameIdentifier	 Attributed String
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
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
WritableRaster	TokenNameIdentifier	 Writable Raster
;	TokenNameSEMICOLON	
/** * This class provides generic methods that must be used by a particular WMFPainter. * * @version $Id: AbstractWMFPainter.java 577132 2007-09-19 02:16:15Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides generic methods that must be used by a particular WMFPainter. * @version $Id: AbstractWMFPainter.java 577132 2007-09-19 02:16:15Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AbstractWMFPainter	TokenNameIdentifier	 Abstract WMF Painter
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WMF_FILE_EXTENSION	TokenNameIdentifier	 WMF  FILE  EXTENSION
=	TokenNameEQUAL	
".wmf"	TokenNameStringLiteral	.wmf
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
WMFFont	TokenNameIdentifier	 WMF Font
wmfFont	TokenNameIdentifier	 wmf Font
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
currentHorizAlign	TokenNameIdentifier	 current Horiz Align
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
currentVertAlign	TokenNameIdentifier	 current Vert Align
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PEN	TokenNameIdentifier	 PEN
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BRUSH	TokenNameIdentifier	 BRUSH
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FONT	TokenNameIdentifier	 FONT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NULL_PEN	TokenNameIdentifier	 NULL  PEN
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NULL_BRUSH	TokenNameIdentifier	 NULL  BRUSH
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PALETTE	TokenNameIdentifier	 PALETTE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OBJ_BITMAP	TokenNameIdentifier	 OBJ  BITMAP
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OBJ_REGION	TokenNameIdentifier	 OBJ  REGION
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
WMFRecordStore	TokenNameIdentifier	 WMF Record Store
currentStore	TokenNameIdentifier	 current Store
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
transient	TokenNametransient	
boolean	TokenNameboolean	
bReadingWMF	TokenNameIdentifier	 b Reading WMF
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
transient	TokenNametransient	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
bufStream	TokenNameIdentifier	 buf Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Return the image associated with a bitmap in a Metafile. * 24 bits and 8 bits bitmaps are handled. * @param bit the bitmap byte array * @param width the bitmap assumed width * @param height the bitmap assumed height * @return the Image associated with the bitmap (null if the dimensions detected in the * header are not consistent with the assumed dimensions) */	TokenNameCOMMENT_JAVADOC	 Return the image associated with a bitmap in a Metafile. 24 bits and 8 bits bitmaps are handled. @param bit the bitmap byte array @param width the bitmap assumed width @param height the bitmap assumed height @return the Image associated with the bitmap (null if the dimensions detected in the header are not consistent with the assumed dimensions) 
protected	TokenNameprotected	
BufferedImage	TokenNameIdentifier	 Buffered Image
getImage	TokenNameIdentifier	 get Image
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bit	TokenNameIdentifier	 bit
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the header of the bitmap, first the width and height 	TokenNameCOMMENT_LINE	get the header of the bitmap, first the width and height 
int	TokenNameint	
_width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
_height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
11	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
9	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// if width and height of the bitmap are different from advertised, we abort 	TokenNameCOMMENT_LINE	if width and height of the bitmap are different from advertised, we abort 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
!=	TokenNameNOT_EQUAL	
_width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
height	TokenNameIdentifier	 height
!=	TokenNameNOT_EQUAL	
_height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getImage	TokenNameIdentifier	 get Image
(	TokenNameLPAREN	
bit	TokenNameIdentifier	 bit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Dimension	TokenNameIdentifier	 Dimension
getImageDimension	TokenNameIdentifier	 get Image Dimension
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bit	TokenNameIdentifier	 bit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the header of the bitmap, first the width and height 	TokenNameCOMMENT_LINE	get the header of the bitmap, first the width and height 
int	TokenNameint	
_width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
_height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
11	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
9	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
_width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
_height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the image associated with a bitmap in a Metafile. * 24 bits and 8 bits bitmaps are handled. * @param bit the bitmap byte array * @return the Image associated with the bitmap (null if the dimensions detected in the * header are not consistent with the assumed dimensions) */	TokenNameCOMMENT_JAVADOC	 Return the image associated with a bitmap in a Metafile. 24 bits and 8 bits bitmaps are handled. @param bit the bitmap byte array @return the Image associated with the bitmap (null if the dimensions detected in the header are not consistent with the assumed dimensions) 
protected	TokenNameprotected	
BufferedImage	TokenNameIdentifier	 Buffered Image
getImage	TokenNameIdentifier	 get Image
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bit	TokenNameIdentifier	 bit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the header of the bitmap, first the width and height 	TokenNameCOMMENT_LINE	get the header of the bitmap, first the width and height 
int	TokenNameint	
_width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
_height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
11	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
9	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// OK, we can safely create the data array now 	TokenNameCOMMENT_LINE	OK, we can safely create the data array now 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bitI	TokenNameIdentifier	 bit I
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
_width	TokenNameIdentifier	 width
*	TokenNameMULTIPLY	
_height	TokenNameIdentifier	 height
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
BufferedImage	TokenNameIdentifier	 Buffered Image
img	TokenNameIdentifier	 img
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
_width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
_height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
BufferedImage	TokenNameIdentifier	 Buffered Image
.	TokenNameDOT	
TYPE_INT_RGB	TokenNameIdentifier	 TYPE  INT  RGB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WritableRaster	TokenNameIdentifier	 Writable Raster
raster	TokenNameIdentifier	 raster
=	TokenNameEQUAL	
img	TokenNameIdentifier	 img
.	TokenNameDOT	
getRaster	TokenNameIdentifier	 get Raster
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// retrieve useful informations in bitmap header 	TokenNameCOMMENT_LINE	retrieve useful informations in bitmap header 
// size of header 	TokenNameCOMMENT_LINE	size of header 
int	TokenNameint	
_headerSize	TokenNameIdentifier	 header Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// number of planes 	TokenNameCOMMENT_LINE	number of planes 
int	TokenNameint	
_planes	TokenNameIdentifier	 planes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
13	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
12	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// number of bits per pixel 	TokenNameCOMMENT_LINE	number of bits per pixel 
int	TokenNameint	
_nbit	TokenNameIdentifier	 nbit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
15	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
14	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// compression factor : unused 	TokenNameCOMMENT_LINE	compression factor : unused 
// size of the image 	TokenNameCOMMENT_LINE	size of the image 
int	TokenNameint	
_size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
23	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
22	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
21	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
20	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// infer the size of image if it is not given in the file 	TokenNameCOMMENT_LINE	infer the size of image if it is not given in the file 
if	TokenNameif	
(	TokenNameLPAREN	
_size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
_size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_width	TokenNameIdentifier	 width
*	TokenNameMULTIPLY	
_nbit	TokenNameIdentifier	 nbit
)	TokenNameRPAREN	
+	TokenNamePLUS	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
~	TokenNameTWIDDLE	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
_height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
// number of used colors 	TokenNameCOMMENT_LINE	number of used colors 
int	TokenNameint	
_clrused	TokenNameIdentifier	 clrused
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
35	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
34	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
33	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
32	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 24 bit image 	TokenNameCOMMENT_LINE	24 bit image 
if	TokenNameif	
(	TokenNameLPAREN	
_nbit	TokenNameIdentifier	 nbit
==	TokenNameEQUAL_EQUAL	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// read the scan lines 	TokenNameCOMMENT_LINE	read the scan lines 
int	TokenNameint	
pad	TokenNameIdentifier	 pad
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_size	TokenNameIdentifier	 size
/	TokenNameDIVIDE	
_height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
-	TokenNameMINUS	
_width	TokenNameIdentifier	 width
*	TokenNameMULTIPLY	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
_headerSize	TokenNameIdentifier	 header Size
;	TokenNameSEMICOLON	
// begin to read data after header 	TokenNameCOMMENT_LINE	begin to read data after header 
// populate the int array 	TokenNameCOMMENT_LINE	populate the int array 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
_height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
_width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitI	TokenNameIdentifier	 bit I
[	TokenNameLBRACKET	
_width	TokenNameIdentifier	 width
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
_height	TokenNameIdentifier	 height
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
pad	TokenNameIdentifier	 pad
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 8 bit image 	TokenNameCOMMENT_LINE	8 bit image 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_nbit	TokenNameIdentifier	 nbit
==	TokenNameEQUAL_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Determine the number of colors 	TokenNameCOMMENT_LINE	Determine the number of colors 
int	TokenNameint	
nbColors	TokenNameIdentifier	 nb Colors
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_clrused	TokenNameIdentifier	 clrused
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
nbColors	TokenNameIdentifier	 nb Colors
=	TokenNameEQUAL	
_clrused	TokenNameIdentifier	 clrused
;	TokenNameSEMICOLON	
else	TokenNameelse	
nbColors	TokenNameIdentifier	 nb Colors
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Read the palette colors. 	TokenNameCOMMENT_LINE	Read the palette colors. 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
_headerSize	TokenNameIdentifier	 header Size
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
palette	TokenNameIdentifier	 palette
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
nbColors	TokenNameIdentifier	 nb Colors
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
nbColors	TokenNameIdentifier	 nb Colors
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
palette	TokenNameIdentifier	 palette
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// populate the int array 	TokenNameCOMMENT_LINE	populate the int array 
/* need to recalculate size because the offset used for palette must be substracted * to overall size, else we will go after the end of the byte array... */	TokenNameCOMMENT_BLOCK	 need to recalculate size because the offset used for palette must be substracted to overall size, else we will go after the end of the byte array... 
_size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
bit	TokenNameIdentifier	 bit
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
pad	TokenNameIdentifier	 pad
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_size	TokenNameIdentifier	 size
/	TokenNameDIVIDE	
_height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
-	TokenNameMINUS	
_width	TokenNameIdentifier	 width
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
_height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
_width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bitI	TokenNameIdentifier	 bit I
[	TokenNameLBRACKET	
_width	TokenNameIdentifier	 width
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
_height	TokenNameIdentifier	 height
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
palette	TokenNameIdentifier	 palette
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
pad	TokenNameIdentifier	 pad
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// black and white image 	TokenNameCOMMENT_LINE	black and white image 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_nbit	TokenNameIdentifier	 nbit
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 2 colors only (black and white image) 	TokenNameCOMMENT_LINE	2 colors only (black and white image) 
int	TokenNameint	
nbColors	TokenNameIdentifier	 nb Colors
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Read the palette colors. 	TokenNameCOMMENT_LINE	Read the palette colors. 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
_headerSize	TokenNameIdentifier	 header Size
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
palette	TokenNameIdentifier	 palette
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
nbColors	TokenNameIdentifier	 nb Colors
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
nbColors	TokenNameIdentifier	 nb Colors
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
palette	TokenNameIdentifier	 palette
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
&	TokenNameAND	
0x00ff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// populate the int array : each pixel correspond to a bit in the byte array 	TokenNameCOMMENT_LINE	populate the int array : each pixel correspond to a bit in the byte array 
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
currentByte	TokenNameIdentifier	 current Byte
=	TokenNameEQUAL	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// padded to long words 	TokenNameCOMMENT_LINE	padded to long words 
int	TokenNameint	
pad	TokenNameIdentifier	 pad
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_size	TokenNameIdentifier	 size
/	TokenNameDIVIDE	
_height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
-	TokenNameMINUS	
_width	TokenNameIdentifier	 width
/	TokenNameDIVIDE	
8	TokenNameIntegerLiteral	
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
_height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
_width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currentByte	TokenNameIdentifier	 current Byte
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
bitI	TokenNameIdentifier	 bit I
[	TokenNameLBRACKET	
_width	TokenNameIdentifier	 width
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
_height	TokenNameIdentifier	 height
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
palette	TokenNameIdentifier	 palette
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
bitI	TokenNameIdentifier	 bit I
[	TokenNameLBRACKET	
_width	TokenNameIdentifier	 width
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
_height	TokenNameIdentifier	 height
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
palette	TokenNameIdentifier	 palette
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
currentByte	TokenNameIdentifier	 current Byte
=	TokenNameEQUAL	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
pad	TokenNameIdentifier	 pad
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
bit	TokenNameIdentifier	 bit
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
currentByte	TokenNameIdentifier	 current Byte
=	TokenNameEQUAL	
bit	TokenNameIdentifier	 bit
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
raster	TokenNameIdentifier	 raster
.	TokenNameDOT	
setDataElements	TokenNameIdentifier	 set Data Elements
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
_width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
_height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
bitI	TokenNameIdentifier	 bit I
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
img	TokenNameIdentifier	 img
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create an AttributedCharacterIterator with the current definition of the WMF Font, and * the input String. */	TokenNameCOMMENT_JAVADOC	 Create an AttributedCharacterIterator with the current definition of the WMF Font, and the input String. 
protected	TokenNameprotected	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
getCharacterIterator	TokenNameIdentifier	 get Character Iterator
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
sr	TokenNameIdentifier	 sr
,	TokenNameCOMMA	
WMFFont	TokenNameIdentifier	 WMF Font
wmffont	TokenNameIdentifier	 wmffont
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttributedString	TokenNameIdentifier	 get Attributed String
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
,	TokenNameCOMMA	
sr	TokenNameIdentifier	 sr
,	TokenNameCOMMA	
wmffont	TokenNameIdentifier	 wmffont
)	TokenNameRPAREN	
.	TokenNameDOT	
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create an AttributedCharacterIterator with the current definition of the WMF Font, and * the input String. */	TokenNameCOMMENT_JAVADOC	 Create an AttributedCharacterIterator with the current definition of the WMF Font, and the input String. 
protected	TokenNameprotected	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
getCharacterIterator	TokenNameIdentifier	 get Character Iterator
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
sr	TokenNameIdentifier	 sr
,	TokenNameCOMMA	
WMFFont	TokenNameIdentifier	 WMF Font
wmffont	TokenNameIdentifier	 wmffont
,	TokenNameCOMMA	
int	TokenNameint	
align	TokenNameIdentifier	 align
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributedString	TokenNameIdentifier	 Attributed String
ats	TokenNameIdentifier	 ats
=	TokenNameEQUAL	
getAttributedString	TokenNameIdentifier	 get Attributed String
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
,	TokenNameCOMMA	
sr	TokenNameIdentifier	 sr
,	TokenNameCOMMA	
wmffont	TokenNameIdentifier	 wmffont
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ats	TokenNameIdentifier	 ats
.	TokenNameDOT	
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
AttributedString	TokenNameIdentifier	 Attributed String
getAttributedString	TokenNameIdentifier	 get Attributed String
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
sr	TokenNameIdentifier	 sr
,	TokenNameCOMMA	
WMFFont	TokenNameIdentifier	 WMF Font
wmffont	TokenNameIdentifier	 wmffont
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributedString	TokenNameIdentifier	 Attributed String
ats	TokenNameIdentifier	 ats
=	TokenNameEQUAL	
new	TokenNamenew	
AttributedString	TokenNameIdentifier	 Attributed String
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
getFont	TokenNameIdentifier	 get Font
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ats	TokenNameIdentifier	 ats
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
SIZE	TokenNameIdentifier	 SIZE
,	TokenNameCOMMA	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getSize2D	TokenNameIdentifier	 get Size2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ats	TokenNameIdentifier	 ats
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
FONT	TokenNameIdentifier	 FONT
,	TokenNameCOMMA	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wmfFont	TokenNameIdentifier	 wmf Font
.	TokenNameDOT	
underline	TokenNameIdentifier	 underline
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ats	TokenNameIdentifier	 ats
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
UNDERLINE	TokenNameIdentifier	 UNDERLINE
,	TokenNameCOMMA	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
UNDERLINE_ON	TokenNameIdentifier	 UNDERLINE  ON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wmfFont	TokenNameIdentifier	 wmf Font
.	TokenNameDOT	
italic	TokenNameIdentifier	 italic
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ats	TokenNameIdentifier	 ats
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
POSTURE	TokenNameIdentifier	 POSTURE
,	TokenNameCOMMA	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
POSTURE_OBLIQUE	TokenNameIdentifier	 POSTURE  OBLIQUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ats	TokenNameIdentifier	 ats
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
POSTURE	TokenNameIdentifier	 POSTURE
,	TokenNameCOMMA	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
POSTURE_REGULAR	TokenNameIdentifier	 POSTURE  REGULAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wmfFont	TokenNameIdentifier	 wmf Font
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
>	TokenNameGREATER	
400	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ats	TokenNameIdentifier	 ats
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT	TokenNameIdentifier	 WEIGHT
,	TokenNameCOMMA	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_BOLD	TokenNameIdentifier	 WEIGHT  BOLD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ats	TokenNameIdentifier	 ats
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT	TokenNameIdentifier	 WEIGHT
,	TokenNameCOMMA	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_REGULAR	TokenNameIdentifier	 WEIGHT  REGULAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ats	TokenNameIdentifier	 ats
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the WMFRecordStore this WMFPainter should use to render */	TokenNameCOMMENT_JAVADOC	 Sets the WMFRecordStore this WMFPainter should use to render 
public	TokenNamepublic	
void	TokenNamevoid	
setRecordStore	TokenNameIdentifier	 set Record Store
(	TokenNameLPAREN	
WMFRecordStore	TokenNameIdentifier	 WMF Record Store
currentStore	TokenNameIdentifier	 current Store
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentStore	TokenNameIdentifier	 current Store
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
this	TokenNamethis	
.	TokenNameDOT	
currentStore	TokenNameIdentifier	 current Store
=	TokenNameEQUAL	
currentStore	TokenNameIdentifier	 current Store
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the WMFRecordStore this WMFPainter renders */	TokenNameCOMMENT_JAVADOC	 Returns the WMFRecordStore this WMFPainter renders 
public	TokenNamepublic	
WMFRecordStore	TokenNameIdentifier	 WMF Record Store
getRecordStore	TokenNameIdentifier	 get Record Store
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentStore	TokenNameIdentifier	 current Store
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
addObject	TokenNameIdentifier	 add Object
(	TokenNameLPAREN	
WMFRecordStore	TokenNameIdentifier	 WMF Record Store
store	TokenNameIdentifier	 store
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentStore	TokenNameIdentifier	 current Store
.	TokenNameDOT	
addObject	TokenNameIdentifier	 add Object
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
addObjectAt	TokenNameIdentifier	 add Object At
(	TokenNameLPAREN	
WMFRecordStore	TokenNameIdentifier	 WMF Record Store
store	TokenNameIdentifier	 store
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentStore	TokenNameIdentifier	 current Store
.	TokenNameDOT	
addObjectAt	TokenNameIdentifier	 add Object At
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
