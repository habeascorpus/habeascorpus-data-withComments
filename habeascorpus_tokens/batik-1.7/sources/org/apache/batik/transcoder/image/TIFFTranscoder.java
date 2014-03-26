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
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
UserAgent	TokenNameIdentifier	 User Agent
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
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
StringKey	TokenNameIdentifier	 String Key
;	TokenNameSEMICOLON	
/** * This class is an <tt>ImageTranscoder</tt> that produces a TIFF image. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: TIFFTranscoder.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class is an <tt>ImageTranscoder</tt> that produces a TIFF image. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: TIFFTranscoder.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TIFFTranscoder	TokenNameIdentifier	 TIFF Transcoder
extends	TokenNameextends	
ImageTranscoder	TokenNameIdentifier	 Image Transcoder
{	TokenNameLBRACE	
/** * Constructs a new transcoder that produces tiff images. */	TokenNameCOMMENT_JAVADOC	 Constructs a new transcoder that produces tiff images. 
public	TokenNamepublic	
TIFFTranscoder	TokenNameIdentifier	 TIFF Transcoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
KEY_FORCE_TRANSPARENT_WHITE	TokenNameIdentifier	 KEY  FORCE  TRANSPARENT  WHITE
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return the transcoder's user agent */	TokenNameCOMMENT_JAVADOC	 @return the transcoder's user agent 
public	TokenNamepublic	
UserAgent	TokenNameIdentifier	 User Agent
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
userAgent	TokenNameIdentifier	 user Agent
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
TYPE_INT_ARGB	TokenNameIdentifier	 TYPE  INT  ARGB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
WriteAdapter	TokenNameIdentifier	 Write Adapter
getWriteAdapter	TokenNameIdentifier	 get Write Adapter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WriteAdapter	TokenNameIdentifier	 Write Adapter
adapter	TokenNameIdentifier	 adapter
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
adapter	TokenNameIdentifier	 adapter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WriteAdapter	TokenNameIdentifier	 Write Adapter
)	TokenNameRPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
adapter	TokenNameIdentifier	 adapter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// 	TokenNameCOMMENT_LINE	 
// This is a trick so that viewers which do not support the alpha 	TokenNameCOMMENT_LINE	This is a trick so that viewers which do not support the alpha 
// channel will see a white background (and not a black one). 	TokenNameCOMMENT_LINE	channel will see a white background (and not a black one). 
// 	TokenNameCOMMENT_LINE	 
boolean	TokenNameboolean	
forceTransparentWhite	TokenNameIdentifier	 force Transparent White
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
PNGTranscoder	TokenNameIdentifier	 PNG Transcoder
.	TokenNameDOT	
KEY_FORCE_TRANSPARENT_WHITE	TokenNameIdentifier	 KEY  FORCE  TRANSPARENT  WHITE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
forceTransparentWhite	TokenNameIdentifier	 force Transparent White
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
PNGTranscoder	TokenNameIdentifier	 PNG Transcoder
.	TokenNameDOT	
KEY_FORCE_TRANSPARENT_WHITE	TokenNameIdentifier	 KEY  FORCE  TRANSPARENT  WHITE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
forceTransparentWhite	TokenNameIdentifier	 force Transparent White
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
img	TokenNameIdentifier	 img
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
forceTransparentWhite	TokenNameIdentifier	 force Transparent White
(	TokenNameLPAREN	
img	TokenNameIdentifier	 img
,	TokenNameCOMMA	
sppsm	TokenNameIdentifier	 sppsm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
WriteAdapter	TokenNameIdentifier	 Write Adapter
adapter	TokenNameIdentifier	 adapter
=	TokenNameEQUAL	
getWriteAdapter	TokenNameIdentifier	 get Write Adapter
(	TokenNameLPAREN	
"org.apache.batik.ext.awt.image.codec.tiff.TIFFTranscoderInternalCodecWriteAdapter"	TokenNameStringLiteral	org.apache.batik.ext.awt.image.codec.tiff.TIFFTranscoderInternalCodecWriteAdapter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
adapter	TokenNameIdentifier	 adapter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
adapter	TokenNameIdentifier	 adapter
=	TokenNameEQUAL	
getWriteAdapter	TokenNameIdentifier	 get Write Adapter
(	TokenNameLPAREN	
"org.apache.batik.transcoder.image.TIFFTranscoderImageIOWriteAdapter"	TokenNameStringLiteral	org.apache.batik.transcoder.image.TIFFTranscoderImageIOWriteAdapter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
adapter	TokenNameIdentifier	 adapter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
"Could not write TIFF file because no WriteAdapter is availble"	TokenNameStringLiteral	Could not write TIFF file because no WriteAdapter is availble
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
writeImage	TokenNameIdentifier	 write Image
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
img	TokenNameIdentifier	 img
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------- 
// TIFF specific interfaces 	TokenNameCOMMENT_LINE	TIFF specific interfaces 
// -------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------- 
/** * This interface is used by <tt>TIFFTranscoder</tt> to write TIFF images * through different codecs. * * @version $Id: TIFFTranscoder.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface is used by <tt>TIFFTranscoder</tt> to write TIFF images through different codecs. * @version $Id: TIFFTranscoder.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
WriteAdapter	TokenNameIdentifier	 Write Adapter
{	TokenNameLBRACE	
/** * Writes the specified image to the specified output. * @param transcoder the calling PNGTranscoder * @param img the image to write * @param output the output where to store the image * @throws TranscoderException if an error occured while storing the image */	TokenNameCOMMENT_JAVADOC	 Writes the specified image to the specified output. @param transcoder the calling PNGTranscoder @param img the image to write @param output the output where to store the image @throws TranscoderException if an error occured while storing the image 
void	TokenNamevoid	
writeImage	TokenNameIdentifier	 write Image
(	TokenNameLPAREN	
TIFFTranscoder	TokenNameIdentifier	 TIFF Transcoder
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------- 
// Keys definition 	TokenNameCOMMENT_LINE	Keys definition 
// -------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------- 
/** * The forceTransparentWhite key. * * <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> * <TD VALIGN="TOP">KEY_FORCE_TRANSPARENT_WHITE</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> * <TD VALIGN="TOP">Boolean</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> * <TD VALIGN="TOP">false</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> * <TD VALIGN="TOP">No</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> * <TD VALIGN="TOP">It controls whether the encoder should * force the image's fully transparent pixels to be fully transparent * white instead of fully transparent black. This is usefull when the * encoded TIFF is displayed in a viewer which does not support TIFF * transparency and lets the image display with a white background instead * of a black background. <br /> * * However, note that the modified image will display differently * over a white background in a viewer that supports * transparency.</TD></TR> * </TABLE> */	TokenNameCOMMENT_JAVADOC	 The forceTransparentWhite key. * <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> <TD VALIGN="TOP">KEY_FORCE_TRANSPARENT_WHITE</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> <TD VALIGN="TOP">Boolean</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> <TD VALIGN="TOP">false</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> <TD VALIGN="TOP">No</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> <TD VALIGN="TOP">It controls whether the encoder should force the image's fully transparent pixels to be fully transparent white instead of fully transparent black. This is usefull when the encoded TIFF is displayed in a viewer which does not support TIFF transparency and lets the image display with a white background instead of a black background. <br /> * However, note that the modified image will display differently over a white background in a viewer that supports transparency.</TD></TR> </TABLE> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
KEY_FORCE_TRANSPARENT_WHITE	TokenNameIdentifier	 KEY  FORCE  TRANSPARENT  WHITE
=	TokenNameEQUAL	
ImageTranscoder	TokenNameIdentifier	 Image Transcoder
.	TokenNameDOT	
KEY_FORCE_TRANSPARENT_WHITE	TokenNameIdentifier	 KEY  FORCE  TRANSPARENT  WHITE
;	TokenNameSEMICOLON	
/** * The compression method for the image. * <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> * <TD VALIGN="TOP">KEY_COMPRESSION_METHOD</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> * <TD VALIGN="TOP">String ("none", "packbits", "jpeg" etc.)</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> * <TD VALIGN="TOP">"none" (no compression)</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> * <TD VALIGN="TOP">Recommended</TD></TR> * <TR> * <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> * <TD VALIGN="TOP">Specify the compression method used to encode the image.</TD></TR> * </TABLE> */	TokenNameCOMMENT_JAVADOC	 The compression method for the image. <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1"> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Key: </TH> <TD VALIGN="TOP">KEY_COMPRESSION_METHOD</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Value: </TH> <TD VALIGN="TOP">String ("none", "packbits", "jpeg" etc.)</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Default: </TH> <TD VALIGN="TOP">"none" (no compression)</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Required: </TH> <TD VALIGN="TOP">Recommended</TD></TR> <TR> <TH VALIGN="TOP" ALIGN="RIGHT"><P ALIGN="RIGHT">Description: </TH> <TD VALIGN="TOP">Specify the compression method used to encode the image.</TD></TR> </TABLE> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TranscodingHints	TokenNameIdentifier	 Transcoding Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
KEY_COMPRESSION_METHOD	TokenNameIdentifier	 KEY  COMPRESSION  METHOD
=	TokenNameEQUAL	
new	TokenNamenew	
StringKey	TokenNameIdentifier	 String Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
