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
image	TokenNameIdentifier	 image
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
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ImageWriter	TokenNameIdentifier	 Image Writer
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
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ImageWriterParams	TokenNameIdentifier	 Image Writer Params
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
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ImageWriterRegistry	TokenNameIdentifier	 Image Writer Registry
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
Messages	TokenNameIdentifier	 Messages
;	TokenNameSEMICOLON	
/** * This class is an <tt>ImageTranscoder</tt> that produces a JPEG image. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: JPEGTranscoder.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class is an <tt>ImageTranscoder</tt> that produces a JPEG image. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: JPEGTranscoder.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
JPEGTranscoder	TokenNameIdentifier	 JPEG Transcoder
extends	TokenNameextends	
ImageTranscoder	TokenNameIdentifier	 Image Transcoder
{	TokenNameLBRACE	
/** * Constructs a new transcoder that produces jpeg images. */	TokenNameCOMMENT_JAVADOC	 Constructs a new transcoder that produces jpeg images. 
public	TokenNamepublic	
JPEGTranscoder	TokenNameIdentifier	 JPEG Transcoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ImageTranscoder	TokenNameIdentifier	 Image Transcoder
.	TokenNameDOT	
KEY_BACKGROUND_COLOR	TokenNameIdentifier	 KEY  BACKGROUND  COLOR
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
white	TokenNameIdentifier	 white
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new ARGB image with the specified dimension. * @param width the image width in pixels * @param height the image height in pixels */	TokenNameCOMMENT_JAVADOC	 Creates a new ARGB image with the specified dimension. @param width the image width in pixels @param height the image height in pixels 
public	TokenNamepublic	
BufferedImage	TokenNameIdentifier	 Buffered Image
createImage	TokenNameIdentifier	 create Image
(	TokenNameLPAREN	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
BufferedImage	TokenNameIdentifier	 Buffered Image
.	TokenNameDOT	
TYPE_INT_RGB	TokenNameIdentifier	 TYPE  INT  RGB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Writes the specified image to the specified output. * @param img the image to write * @param output the output where to store the image * @throws TranscoderException if an error occured while storing the image */	TokenNameCOMMENT_JAVADOC	 Writes the specified image to the specified output. @param img the image to write @param output the output where to store the image @throws TranscoderException if an error occured while storing the image 
public	TokenNamepublic	
void	TokenNamevoid	
writeImage	TokenNameIdentifier	 write Image
(	TokenNameLPAREN	
BufferedImage	TokenNameIdentifier	 Buffered Image
img	TokenNameIdentifier	 img
,	TokenNameCOMMA	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
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
// The outputstream wrapper protects the JPEG encoder from 	TokenNameCOMMENT_LINE	The outputstream wrapper protects the JPEG encoder from 
// exceptions due to stream closings. If it gets an exception 	TokenNameCOMMENT_LINE	exceptions due to stream closings. If it gets an exception 
// it nulls out the stream and just ignores any future calls. 	TokenNameCOMMENT_LINE	it nulls out the stream and just ignores any future calls. 
ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
new	TokenNamenew	
OutputStreamWrapper	TokenNameIdentifier	 Output Stream Wrapper
(	TokenNameLPAREN	
ostream	TokenNameIdentifier	 ostream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ostream	TokenNameIdentifier	 ostream
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"jpeg.badoutput"	TokenNameStringLiteral	jpeg.badoutput
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
float	TokenNamefloat	
quality	TokenNameIdentifier	 quality
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
KEY_QUALITY	TokenNameIdentifier	 KEY  QUALITY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
quality	TokenNameIdentifier	 quality
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_QUALITY	TokenNameIdentifier	 KEY  QUALITY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
te	TokenNameIdentifier	 te
;	TokenNameSEMICOLON	
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"jpeg.unspecifiedQuality"	TokenNameStringLiteral	jpeg.unspecifiedQuality
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
quality	TokenNameIdentifier	 quality
=	TokenNameEQUAL	
0.75f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ImageWriter	TokenNameIdentifier	 Image Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
ImageWriterRegistry	TokenNameIdentifier	 Image Writer Registry
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getWriterFor	TokenNameIdentifier	 get Writer For
(	TokenNameLPAREN	
"image/jpeg"	TokenNameStringLiteral	image/jpeg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ImageWriterParams	TokenNameIdentifier	 Image Writer Params
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
new	TokenNamenew	
ImageWriterParams	TokenNameIdentifier	 Image Writer Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
setJPEGQuality	TokenNameIdentifier	 set JPEG Quality
(	TokenNameLPAREN	
quality	TokenNameIdentifier	 quality
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
PixSzMM	TokenNameIdentifier	 Pix Sz MM
=	TokenNameEQUAL	
userAgent	TokenNameIdentifier	 user Agent
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
PixSzInch	TokenNameIdentifier	 Pix Sz Inch
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
25.4	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
PixSzMM	TokenNameIdentifier	 Pix Sz MM
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
setResolution	TokenNameIdentifier	 set Resolution
(	TokenNameLPAREN	
PixSzInch	TokenNameIdentifier	 Pix Sz Inch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
writeImage	TokenNameIdentifier	 write Image
(	TokenNameLPAREN	
img	TokenNameIdentifier	 img
,	TokenNameCOMMA	
ostream	TokenNameIdentifier	 ostream
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
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
// -------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------- 
// Keys definition 	TokenNameCOMMENT_LINE	Keys definition 
// -------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------- 
/** * The encoder quality factor key. * <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> * <TD VALIGN="TOP">KEY_QUALITY</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> * <TD VALIGN="TOP">Float (between 0 and 1)</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> * <TD VALIGN="TOP">1 (no lossy)</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> * <TD VALIGN="TOP">Recommended</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> * <TD VALIGN="TOP">Specify the JPEG image encoding quality.</TD></TR> * </TABLE> */	TokenNameCOMMENT_JAVADOC	 The encoder quality factor key. <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> <TD VALIGN="TOP">KEY_QUALITY</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> <TD VALIGN="TOP">Float (between 0 and 1)</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> <TD VALIGN="TOP">1 (no lossy)</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> <TD VALIGN="TOP">Recommended</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> <TD VALIGN="TOP">Specify the JPEG image encoding quality.</TD></TR> </TABLE> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
KEY_QUALITY	TokenNameIdentifier	 KEY  QUALITY
=	TokenNameEQUAL	
new	TokenNamenew	
QualityKey	TokenNameIdentifier	 Quality Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A transcoding Key represented the JPEG image quality. */	TokenNameCOMMENT_JAVADOC	 A transcoding Key represented the JPEG image quality. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
QualityKey	TokenNameIdentifier	 Quality Key
extends	TokenNameextends	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompatibleValue	TokenNameIdentifier	 is Compatible Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
instanceof	TokenNameinstanceof	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
q	TokenNameIdentifier	 q
<=	TokenNameLESS_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class will never throw an IOException, instead it eats * them and then ignores any future calls to it's interface. */	TokenNameCOMMENT_JAVADOC	 This class will never throw an IOException, instead it eats them and then ignores any future calls to it's interface. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
OutputStreamWrapper	TokenNameIdentifier	 Output Stream Wrapper
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
/** * Constructs a wrapper around <tt>os</tt> that will not throw * IOExceptions. * <@param os>The Stream to wrap. */	TokenNameCOMMENT_JAVADOC	 Constructs a wrapper around <tt>os</tt> that will not throw IOExceptions. <@param os>The Stream to wrap. 
OutputStreamWrapper	TokenNameIdentifier	 Output Stream Wrapper
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
