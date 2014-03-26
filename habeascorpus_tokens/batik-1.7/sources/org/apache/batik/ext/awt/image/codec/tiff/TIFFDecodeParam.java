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
tiff	TokenNameIdentifier	 tiff
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
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ImageDecodeParam	TokenNameIdentifier	 Image Decode Param
;	TokenNameSEMICOLON	
/** * An instance of <code>ImageDecodeParam</code> for decoding images in * the TIFF format. * * <p> To determine the number of images present in a TIFF file, use * the <code>getNumPages()</code> method on the * <code>ImageDecoder</code> object that will be used to perform the * decoding. The desired page number may be passed as an argument to * the <code>ImageDecoder.decodeAsRaster)()</code> or * <code>decodeAsRenderedImage()</code> methods. * * <p> For TIFF Palette color images, the colorMap always has entries * of short data type, the color Black being represented by 0,0,0 and * White by 65536,65536,65536. In order to display these images, the * default behavior is to dither the short values down to 8 bits. * The dithering is done by calling the <code>decode16BitsTo8Bits</code> * method for each short value that needs to be dithered. The method has * the following implementation: * <code> * byte b; * short s; * s = s & 0xffff; * b = (byte)((s >> 8) & 0xff); * </code> * If a different algorithm is to be used for the dithering, this class * should be subclassed and an appropriate implementation should be * provided for the <code>decode16BitsTo8Bits</code> method in the subclass. * * <p>If the palette contains image data that is signed short, as specified * by the SampleFormat tag, the dithering is done by calling * <code>decodeSigned16BitsTo8Bits</code> instead. The method has the * following implementation: * <code> * byte b; * short s; * b = (byte)((s + Short.MIN_VALUE) >> 8); * </code> * In order to use a different algorithm for the dithering, this class * should be subclassed and the method overridden. * * <p> If it is desired that the Palette be decoded such that the output * image is of short data type and no dithering is performed, the * <code>setDecodePaletteAsShorts</code> method should be used. * * <p><b> This class is not a committed part of the JAI API. It may * be removed or changed in future releases of JAI.</b> * * @see TIFFDirectory * * @version $Id: TIFFDecodeParam.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An instance of <code>ImageDecodeParam</code> for decoding images in the TIFF format. * <p> To determine the number of images present in a TIFF file, use the <code>getNumPages()</code> method on the <code>ImageDecoder</code> object that will be used to perform the decoding. The desired page number may be passed as an argument to the <code>ImageDecoder.decodeAsRaster)()</code> or <code>decodeAsRenderedImage()</code> methods. * <p> For TIFF Palette color images, the colorMap always has entries of short data type, the color Black being represented by 0,0,0 and White by 65536,65536,65536. In order to display these images, the default behavior is to dither the short values down to 8 bits. The dithering is done by calling the <code>decode16BitsTo8Bits</code> method for each short value that needs to be dithered. The method has the following implementation: <code> byte b; short s; s = s & 0xffff; b = (byte)((s >> 8) & 0xff); </code> If a different algorithm is to be used for the dithering, this class should be subclassed and an appropriate implementation should be provided for the <code>decode16BitsTo8Bits</code> method in the subclass. * <p>If the palette contains image data that is signed short, as specified by the SampleFormat tag, the dithering is done by calling <code>decodeSigned16BitsTo8Bits</code> instead. The method has the following implementation: <code> byte b; short s; b = (byte)((s + Short.MIN_VALUE) >> 8); </code> In order to use a different algorithm for the dithering, this class should be subclassed and the method overridden. * <p> If it is desired that the Palette be decoded such that the output image is of short data type and no dithering is performed, the <code>setDecodePaletteAsShorts</code> method should be used. * <p><b> This class is not a committed part of the JAI API. It may be removed or changed in future releases of JAI.</b> * @see TIFFDirectory * @version $Id: TIFFDecodeParam.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TIFFDecodeParam	TokenNameIdentifier	 TIFF Decode Param
implements	TokenNameimplements	
ImageDecodeParam	TokenNameIdentifier	 Image Decode Param
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
decodePaletteAsShorts	TokenNameIdentifier	 decode Palette As Shorts
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Long	TokenNameIdentifier	 Long
ifdOffset	TokenNameIdentifier	 ifd Offset
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
convertJPEGYCbCrToRGB	TokenNameIdentifier	 convert JPEGY Cb Cr To RGB
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Constructs a default instance of <code>TIFFDecodeParam</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs a default instance of <code>TIFFDecodeParam</code>. 
public	TokenNamepublic	
TIFFDecodeParam	TokenNameIdentifier	 TIFF Decode Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * If set, the entries in the palette will be decoded as shorts * and no short to byte lookup will be applied to them. */	TokenNameCOMMENT_JAVADOC	 If set, the entries in the palette will be decoded as shorts and no short to byte lookup will be applied to them. 
public	TokenNamepublic	
void	TokenNamevoid	
setDecodePaletteAsShorts	TokenNameIdentifier	 set Decode Palette As Shorts
(	TokenNameLPAREN	
boolean	TokenNameboolean	
decodePaletteAsShorts	TokenNameIdentifier	 decode Palette As Shorts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
decodePaletteAsShorts	TokenNameIdentifier	 decode Palette As Shorts
=	TokenNameEQUAL	
decodePaletteAsShorts	TokenNameIdentifier	 decode Palette As Shorts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code> if palette entries will be decoded as * shorts, resulting in an output image with short datatype. */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if palette entries will be decoded as shorts, resulting in an output image with short datatype. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getDecodePaletteAsShorts	TokenNameIdentifier	 get Decode Palette As Shorts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
decodePaletteAsShorts	TokenNameIdentifier	 decode Palette As Shorts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an unsigned 8 bit value computed by dithering the unsigned * 16 bit value. Note that the TIFF specified short datatype is an * unsigned value, while Java's <code>short</code> datatype is a * signed value. Therefore the Java <code>short</code> datatype cannot * be used to store the TIFF specified short value. A Java * <code>int</code> is used as input instead to this method. The method * deals correctly only with 16 bit unsigned values. */	TokenNameCOMMENT_JAVADOC	 Returns an unsigned 8 bit value computed by dithering the unsigned 16 bit value. Note that the TIFF specified short datatype is an unsigned value, while Java's <code>short</code> datatype is a signed value. Therefore the Java <code>short</code> datatype cannot be used to store the TIFF specified short value. A Java <code>int</code> is used as input instead to this method. The method deals correctly only with 16 bit unsigned values. 
public	TokenNamepublic	
byte	TokenNamebyte	
decode16BitsTo8Bits	TokenNameIdentifier	 decode16 Bits To8 Bits
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an unsigned 8 bit value computed by dithering the signed * 16 bit value. This method deals correctly only with values in the * 16 bit signed range. */	TokenNameCOMMENT_JAVADOC	 Returns an unsigned 8 bit value computed by dithering the signed 16 bit value. This method deals correctly only with values in the 16 bit signed range. 
public	TokenNamepublic	
byte	TokenNamebyte	
decodeSigned16BitsTo8Bits	TokenNameIdentifier	 decode Signed16 Bits To8 Bits
(	TokenNameLPAREN	
short	TokenNameshort	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the offset in the stream from which to read the image. There * must be an Image File Directory (IFD) at that position or an error * will occur. If <code>setIFDOffset()</code> is never invoked then * the decoder will assume that the TIFF stream is at the beginning of * the 8-byte image header. If the directory offset is set and a page * number is supplied to the TIFF <code>ImageDecoder</code> then the * page will be the zero-relative index of the IFD in linked list of * IFDs beginning at the specified offset with a page of zero indicating * the directory at that offset. */	TokenNameCOMMENT_JAVADOC	 Sets the offset in the stream from which to read the image. There must be an Image File Directory (IFD) at that position or an error will occur. If <code>setIFDOffset()</code> is never invoked then the decoder will assume that the TIFF stream is at the beginning of the 8-byte image header. If the directory offset is set and a page number is supplied to the TIFF <code>ImageDecoder</code> then the page will be the zero-relative index of the IFD in linked list of IFDs beginning at the specified offset with a page of zero indicating the directory at that offset. 
public	TokenNamepublic	
void	TokenNamevoid	
setIFDOffset	TokenNameIdentifier	 set IFD Offset
(	TokenNameLPAREN	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ifdOffset	TokenNameIdentifier	 ifd Offset
=	TokenNameEQUAL	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value set by <code>setIFDOffset()</code> or * <code>null</code> if no value has been set. */	TokenNameCOMMENT_JAVADOC	 Returns the value set by <code>setIFDOffset()</code> or <code>null</code> if no value has been set. 
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
getIFDOffset	TokenNameIdentifier	 get IFD Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ifdOffset	TokenNameIdentifier	 ifd Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a flag indicating whether to convert JPEG-compressed YCbCr data * to RGB. The default value is <code>true</code>. This flag is * ignored if the image data are not JPEG-compressed. */	TokenNameCOMMENT_JAVADOC	 Sets a flag indicating whether to convert JPEG-compressed YCbCr data to RGB. The default value is <code>true</code>. This flag is ignored if the image data are not JPEG-compressed. 
public	TokenNamepublic	
void	TokenNamevoid	
setJPEGDecompressYCbCrToRGB	TokenNameIdentifier	 set JPEG Decompress Y Cb Cr To RGB
(	TokenNameLPAREN	
boolean	TokenNameboolean	
convertJPEGYCbCrToRGB	TokenNameIdentifier	 convert JPEGY Cb Cr To RGB
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
convertJPEGYCbCrToRGB	TokenNameIdentifier	 convert JPEGY Cb Cr To RGB
=	TokenNameEQUAL	
convertJPEGYCbCrToRGB	TokenNameIdentifier	 convert JPEGY Cb Cr To RGB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether JPEG-compressed YCbCr data will be converted to RGB. */	TokenNameCOMMENT_JAVADOC	 Whether JPEG-compressed YCbCr data will be converted to RGB. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getJPEGDecompressYCbCrToRGB	TokenNameIdentifier	 get JPEG Decompress Y Cb Cr To RGB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
convertJPEGYCbCrToRGB	TokenNameIdentifier	 convert JPEGY Cb Cr To RGB
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
