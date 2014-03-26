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
util	TokenNameIdentifier	 util
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
RenderedImage	TokenNameIdentifier	 Rendered Image
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
/** * A partial implementation of the <code>ImageDecoder</code> interface * useful for subclassing. * * @version $Id: ImageDecoderImpl.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A partial implementation of the <code>ImageDecoder</code> interface useful for subclassing. * @version $Id: ImageDecoderImpl.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ImageDecoderImpl	TokenNameIdentifier	 Image Decoder Impl
implements	TokenNameimplements	
ImageDecoder	TokenNameIdentifier	 Image Decoder
{	TokenNameLBRACE	
/** * The <code>SeekableStream</code> associcted with this * <code>ImageEncoder</code>. */	TokenNameCOMMENT_JAVADOC	 The <code>SeekableStream</code> associcted with this <code>ImageEncoder</code>. 
protected	TokenNameprotected	
SeekableStream	TokenNameIdentifier	 Seekable Stream
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
/** * The <code>ImageDecodeParam</code> object associated with this * <code>ImageEncoder</code>. */	TokenNameCOMMENT_JAVADOC	 The <code>ImageDecodeParam</code> object associated with this <code>ImageEncoder</code>. 
protected	TokenNameprotected	
ImageDecodeParam	TokenNameIdentifier	 Image Decode Param
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
/** * Constructs an <code>ImageDecoderImpl</code> with a given * <code>SeekableStream</code> and <code>ImageDecodeParam</code> * instance. */	TokenNameCOMMENT_JAVADOC	 Constructs an <code>ImageDecoderImpl</code> with a given <code>SeekableStream</code> and <code>ImageDecodeParam</code> instance. 
public	TokenNamepublic	
ImageDecoderImpl	TokenNameIdentifier	 Image Decoder Impl
(	TokenNameLPAREN	
SeekableStream	TokenNameIdentifier	 Seekable Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
ImageDecodeParam	TokenNameIdentifier	 Image Decode Param
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an <code>ImageDecoderImpl</code> with a given * <code>InputStream</code> and <code>ImageDecodeParam</code> * instance. The <code>input</code> parameter will be used to * construct a <code>ForwardSeekableStream</code>; if the ability * to seek backwards is required, the caller should construct * an instance of <code>SeekableStream</code> and * make use of the other contructor. */	TokenNameCOMMENT_JAVADOC	 Constructs an <code>ImageDecoderImpl</code> with a given <code>InputStream</code> and <code>ImageDecodeParam</code> instance. The <code>input</code> parameter will be used to construct a <code>ForwardSeekableStream</code>; if the ability to seek backwards is required, the caller should construct an instance of <code>SeekableStream</code> and make use of the other contructor. 
public	TokenNamepublic	
ImageDecoderImpl	TokenNameIdentifier	 Image Decoder Impl
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
ImageDecodeParam	TokenNameIdentifier	 Image Decode Param
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
ForwardSeekableStream	TokenNameIdentifier	 Forward Seekable Stream
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current parameters as an instance of the * <code>ImageDecodeParam</code> interface. Concrete * implementations of this interface will return corresponding * concrete implementations of the <code>ImageDecodeParam</code> * interface. For example, a <code>JPEGImageDecoder</code> will * return an instance of <code>JPEGDecodeParam</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the current parameters as an instance of the <code>ImageDecodeParam</code> interface. Concrete implementations of this interface will return corresponding concrete implementations of the <code>ImageDecodeParam</code> interface. For example, a <code>JPEGImageDecoder</code> will return an instance of <code>JPEGDecodeParam</code>. 
public	TokenNamepublic	
ImageDecodeParam	TokenNameIdentifier	 Image Decode Param
getParam	TokenNameIdentifier	 get Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the current parameters to an instance of the * <code>ImageDecodeParam</code> interface. Concrete * implementations of <code>ImageDecoder</code> may throw a * <code>RuntimeException</code> if the <code>param</code> * argument is not an instance of the appropriate subclass or * subinterface. For example, a <code>JPEGImageDecoder</code> * will expect <code>param</code> to be an instance of * <code>JPEGDecodeParam</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the current parameters to an instance of the <code>ImageDecodeParam</code> interface. Concrete implementations of <code>ImageDecoder</code> may throw a <code>RuntimeException</code> if the <code>param</code> argument is not an instance of the appropriate subclass or subinterface. For example, a <code>JPEGImageDecoder</code> will expect <code>param</code> to be an instance of <code>JPEGDecodeParam</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setParam	TokenNameIdentifier	 set Param
(	TokenNameLPAREN	
ImageDecodeParam	TokenNameIdentifier	 Image Decode Param
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <code>SeekableStream</code> associated with * this <code>ImageDecoder</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>SeekableStream</code> associated with this <code>ImageDecoder</code>. 
public	TokenNamepublic	
SeekableStream	TokenNameIdentifier	 Seekable Stream
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of pages present in the current stream. * By default, the return value is 1. Subclasses that deal with * multi-page formats should override this method. */	TokenNameCOMMENT_JAVADOC	 Returns the number of pages present in the current stream. By default, the return value is 1. Subclasses that deal with multi-page formats should override this method. 
public	TokenNamepublic	
int	TokenNameint	
getNumPages	TokenNameIdentifier	 get Num Pages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a <code>Raster</code> that contains the decoded * contents of the <code>SeekableStream</code> associated * with this <code>ImageDecoder</code>. Only * the first page of a multi-page image is decoded. */	TokenNameCOMMENT_JAVADOC	 Returns a <code>Raster</code> that contains the decoded contents of the <code>SeekableStream</code> associated with this <code>ImageDecoder</code>. Only the first page of a multi-page image is decoded. 
public	TokenNamepublic	
Raster	TokenNameIdentifier	 Raster
decodeAsRaster	TokenNameIdentifier	 decode As Raster
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
decodeAsRaster	TokenNameIdentifier	 decode As Raster
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a <code>Raster</code> that contains the decoded * contents of the <code>SeekableStream</code> associated * with this <code>ImageDecoder</code>. * The given page of a multi-page image is decoded. If * the page does not exist, an IOException will be thrown. * Page numbering begins at zero. * * @param page The page to be decoded. */	TokenNameCOMMENT_JAVADOC	 Returns a <code>Raster</code> that contains the decoded contents of the <code>SeekableStream</code> associated with this <code>ImageDecoder</code>. The given page of a multi-page image is decoded. If the page does not exist, an IOException will be thrown. Page numbering begins at zero. * @param page The page to be decoded. 
public	TokenNamepublic	
Raster	TokenNameIdentifier	 Raster
decodeAsRaster	TokenNameIdentifier	 decode As Raster
(	TokenNameLPAREN	
int	TokenNameint	
page	TokenNameIdentifier	 page
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
RenderedImage	TokenNameIdentifier	 Rendered Image
im	TokenNameIdentifier	 im
=	TokenNameEQUAL	
decodeAsRenderedImage	TokenNameIdentifier	 decode As Rendered Image
(	TokenNameLPAREN	
page	TokenNameIdentifier	 page
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
im	TokenNameIdentifier	 im
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a <code>RenderedImage</code> that contains the decoded * contents of the <code>SeekableStream</code> associated * with this <code>ImageDecoder</code>. Only * the first page of a multi-page image is decoded. */	TokenNameCOMMENT_JAVADOC	 Returns a <code>RenderedImage</code> that contains the decoded contents of the <code>SeekableStream</code> associated with this <code>ImageDecoder</code>. Only the first page of a multi-page image is decoded. 
public	TokenNamepublic	
RenderedImage	TokenNameIdentifier	 Rendered Image
decodeAsRenderedImage	TokenNameIdentifier	 decode As Rendered Image
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
decodeAsRenderedImage	TokenNameIdentifier	 decode As Rendered Image
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a <code>RenderedImage</code> that contains the decoded * contents of the <code>SeekableStream</code> associated * with this <code>ImageDecoder</code>. * The given page of a multi-page image is decoded. If * the page does not exist, an IOException will be thrown. * Page numbering begins at zero. * * @param page The page to be decoded. */	TokenNameCOMMENT_JAVADOC	 Returns a <code>RenderedImage</code> that contains the decoded contents of the <code>SeekableStream</code> associated with this <code>ImageDecoder</code>. The given page of a multi-page image is decoded. If the page does not exist, an IOException will be thrown. Page numbering begins at zero. * @param page The page to be decoded. 
public	TokenNamepublic	
abstract	TokenNameabstract	
RenderedImage	TokenNameIdentifier	 Rendered Image
decodeAsRenderedImage	TokenNameIdentifier	 decode As Rendered Image
(	TokenNameLPAREN	
int	TokenNameint	
page	TokenNameIdentifier	 page
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
