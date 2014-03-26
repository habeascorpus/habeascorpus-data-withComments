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
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
png	TokenNameIdentifier	 png
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
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
IndexImage	TokenNameIdentifier	 Index Image
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
PNGTranscoder	TokenNameIdentifier	 PNG Transcoder
;	TokenNameSEMICOLON	
/** * This class is a helper to <tt>PNGTranscoder</tt> that writes PNG images * through the internal PNG codec. * * @version $Id: PNGTranscoderInternalCodecWriteAdapter.java 502538 2007-02-02 08:52:56Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class is a helper to <tt>PNGTranscoder</tt> that writes PNG images through the internal PNG codec. * @version $Id: PNGTranscoderInternalCodecWriteAdapter.java 502538 2007-02-02 08:52:56Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
PNGTranscoderInternalCodecWriteAdapter	TokenNameIdentifier	 PNG Transcoder Internal Codec Write Adapter
implements	TokenNameimplements	
PNGTranscoder	TokenNameIdentifier	 PNG Transcoder
.	TokenNameDOT	
WriteAdapter	TokenNameIdentifier	 Write Adapter
{	TokenNameLBRACE	
/** * @throws TranscoderException * @see org.apache.batik.transcoder.image.PNGTranscoder.WriteAdapter#writeImage(org.apache.batik.transcoder.image.PNGTranscoder, java.awt.image.BufferedImage, org.apache.batik.transcoder.TranscoderOutput) */	TokenNameCOMMENT_JAVADOC	 @throws TranscoderException @see org.apache.batik.transcoder.image.PNGTranscoder.WriteAdapter#writeImage(org.apache.batik.transcoder.image.PNGTranscoder, java.awt.image.BufferedImage, org.apache.batik.transcoder.TranscoderOutput) 
public	TokenNamepublic	
void	TokenNamevoid	
writeImage	TokenNameIdentifier	 write Image
(	TokenNameLPAREN	
PNGTranscoder	TokenNameIdentifier	 PNG Transcoder
transcoder	TokenNameIdentifier	 transcoder
,	TokenNameCOMMA	
BufferedImage	TokenNameIdentifier	 Buffered Image
img	TokenNameIdentifier	 img
,	TokenNameCOMMA	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
{	TokenNameLBRACE	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
hints	TokenNameIdentifier	 hints
=	TokenNameEQUAL	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
getTranscodingHints	TokenNameIdentifier	 get Transcoding Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
PNGTranscoder	TokenNameIdentifier	 PNG Transcoder
.	TokenNameDOT	
KEY_INDEXED	TokenNameIdentifier	 KEY  INDEXED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
PNGTranscoder	TokenNameIdentifier	 PNG Transcoder
.	TokenNameDOT	
KEY_INDEXED	TokenNameIdentifier	 KEY  INDEXED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
//PNGEncodeParam.Palette can handle these numbers only. 	TokenNameCOMMENT_LINE	PNGEncodeParam.Palette can handle these numbers only. 
img	TokenNameIdentifier	 img
=	TokenNameEQUAL	
IndexImage	TokenNameIdentifier	 Index Image
.	TokenNameDOT	
getIndexedImage	TokenNameIdentifier	 get Indexed Image
(	TokenNameLPAREN	
img	TokenNameIdentifier	 img
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PNGEncodeParam	TokenNameIdentifier	 PNG Encode Param
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
PNGEncodeParam	TokenNameIdentifier	 PNG Encode Param
.	TokenNameDOT	
getDefaultEncodeParam	TokenNameIdentifier	 get Default Encode Param
(	TokenNameLPAREN	
img	TokenNameIdentifier	 img
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
instanceof	TokenNameinstanceof	
PNGEncodeParam	TokenNameIdentifier	 PNG Encode Param
.	TokenNameDOT	
RGB	TokenNameIdentifier	 RGB
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PNGEncodeParam	TokenNameIdentifier	 PNG Encode Param
.	TokenNameDOT	
RGB	TokenNameIdentifier	 RGB
)	TokenNameRPAREN	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
.	TokenNameDOT	
setBackgroundRGB	TokenNameIdentifier	 set Background RGB
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If they specify GAMMA key with a value of '0' then omit 	TokenNameCOMMENT_LINE	If they specify GAMMA key with a value of '0' then omit 
// gamma chunk. If they do not provide a GAMMA then just 	TokenNameCOMMENT_LINE	gamma chunk. If they do not provide a GAMMA then just 
// generate an sRGB chunk. Otherwise supress the sRGB chunk 	TokenNameCOMMENT_LINE	generate an sRGB chunk. Otherwise supress the sRGB chunk 
// and just generate gamma and chroma chunks. 	TokenNameCOMMENT_LINE	and just generate gamma and chroma chunks. 
if	TokenNameif	
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
PNGTranscoder	TokenNameIdentifier	 PNG Transcoder
.	TokenNameDOT	
KEY_GAMMA	TokenNameIdentifier	 KEY  GAMMA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
gamma	TokenNameIdentifier	 gamma
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
PNGTranscoder	TokenNameIdentifier	 PNG Transcoder
.	TokenNameDOT	
KEY_GAMMA	TokenNameIdentifier	 KEY  GAMMA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gamma	TokenNameIdentifier	 gamma
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
setGamma	TokenNameIdentifier	 set Gamma
(	TokenNameLPAREN	
gamma	TokenNameIdentifier	 gamma
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
setChromaticity	TokenNameIdentifier	 set Chromaticity
(	TokenNameLPAREN	
PNGTranscoder	TokenNameIdentifier	 PNG Transcoder
.	TokenNameDOT	
DEFAULT_CHROMA	TokenNameIdentifier	 DEFAULT  CHROMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// We generally want an sRGB chunk and our encoding intent 	TokenNameCOMMENT_LINE	We generally want an sRGB chunk and our encoding intent 
// is perceptual 	TokenNameCOMMENT_LINE	is perceptual 
params	TokenNameIdentifier	 params
.	TokenNameDOT	
setSRGBIntent	TokenNameIdentifier	 set SRGB Intent
(	TokenNameLPAREN	
PNGEncodeParam	TokenNameIdentifier	 PNG Encode Param
.	TokenNameDOT	
INTENT_PERCEPTUAL	TokenNameIdentifier	 INTENT  PERCEPTUAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
PixSzMM	TokenNameIdentifier	 Pix Sz MM
=	TokenNameEQUAL	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// num Pixs in 1 Meter 	TokenNameCOMMENT_LINE	num Pixs in 1 Meter 
int	TokenNameint	
numPix	TokenNameIdentifier	 num Pix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
PixSzMM	TokenNameIdentifier	 Pix Sz MM
)	TokenNameRPAREN	
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
setPhysicalDimension	TokenNameIdentifier	 set Physical Dimension
(	TokenNameLPAREN	
numPix	TokenNameIdentifier	 num Pix
,	TokenNameCOMMA	
numPix	TokenNameIdentifier	 num Pix
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 1 means 'pix/meter' 	TokenNameCOMMENT_LINE	1 means 'pix/meter' 
try	TokenNametry	
{	TokenNameLBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PNGImageEncoder	TokenNameIdentifier	 PNG Image Encoder
pngEncoder	TokenNameIdentifier	 png Encoder
=	TokenNameEQUAL	
new	TokenNamenew	
PNGImageEncoder	TokenNameIdentifier	 PNG Image Encoder
(	TokenNameLPAREN	
ostream	TokenNameIdentifier	 ostream
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pngEncoder	TokenNameIdentifier	 png Encoder
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
img	TokenNameIdentifier	 img
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ostream	TokenNameIdentifier	 ostream
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
