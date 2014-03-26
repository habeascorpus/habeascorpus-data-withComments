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
/** * An interface describing objects that transform an InputStream into a * BufferedImage or Raster. * * @version $Id: ImageDecoder.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An interface describing objects that transform an InputStream into a BufferedImage or Raster. * @version $Id: ImageDecoder.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ImageDecoder	TokenNameIdentifier	 Image Decoder
{	TokenNameLBRACE	
/** * Returns the current parameters as an instance of the * ImageDecodeParam interface. Concrete implementations of this * interface will return corresponding concrete implementations of * the ImageDecodeParam interface. For example, a JPEGImageDecoder * will return an instance of JPEGDecodeParam. */	TokenNameCOMMENT_JAVADOC	 Returns the current parameters as an instance of the ImageDecodeParam interface. Concrete implementations of this interface will return corresponding concrete implementations of the ImageDecodeParam interface. For example, a JPEGImageDecoder will return an instance of JPEGDecodeParam. 
ImageDecodeParam	TokenNameIdentifier	 Image Decode Param
getParam	TokenNameIdentifier	 get Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the current parameters to an instance of the * ImageDecodeParam interface. Concrete implementations * of ImageDecoder may throw a RuntimeException if the * param argument is not an instance of the appropriate * subclass or subinterface. For example, a JPEGImageDecoder * will expect param to be an instance of JPEGDecodeParam. */	TokenNameCOMMENT_JAVADOC	 Sets the current parameters to an instance of the ImageDecodeParam interface. Concrete implementations of ImageDecoder may throw a RuntimeException if the param argument is not an instance of the appropriate subclass or subinterface. For example, a JPEGImageDecoder will expect param to be an instance of JPEGDecodeParam. 
void	TokenNamevoid	
setParam	TokenNameIdentifier	 set Param
(	TokenNameLPAREN	
ImageDecodeParam	TokenNameIdentifier	 Image Decode Param
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the SeekableStream associated with this ImageDecoder. */	TokenNameCOMMENT_JAVADOC	 Returns the SeekableStream associated with this ImageDecoder. 
SeekableStream	TokenNameIdentifier	 Seekable Stream
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the number of pages present in the current stream. */	TokenNameCOMMENT_JAVADOC	 Returns the number of pages present in the current stream. 
int	TokenNameint	
getNumPages	TokenNameIdentifier	 get Num Pages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Returns a Raster that contains the decoded contents of the * SeekableStream associated with this ImageDecoder. Only * the first page of a multi-page image is decoded. */	TokenNameCOMMENT_JAVADOC	 Returns a Raster that contains the decoded contents of the SeekableStream associated with this ImageDecoder. Only the first page of a multi-page image is decoded. 
Raster	TokenNameIdentifier	 Raster
decodeAsRaster	TokenNameIdentifier	 decode As Raster
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Returns a Raster that contains the decoded contents of the * SeekableStream associated with this ImageDecoder. * The given page of a multi-page image is decoded. If * the page does not exist, an IOException will be thrown. * Page numbering begins at zero. * * @param page The page to be decoded. */	TokenNameCOMMENT_JAVADOC	 Returns a Raster that contains the decoded contents of the SeekableStream associated with this ImageDecoder. The given page of a multi-page image is decoded. If the page does not exist, an IOException will be thrown. Page numbering begins at zero. * @param page The page to be decoded. 
Raster	TokenNameIdentifier	 Raster
decodeAsRaster	TokenNameIdentifier	 decode As Raster
(	TokenNameLPAREN	
int	TokenNameint	
page	TokenNameIdentifier	 page
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Returns a RenderedImage that contains the decoded contents of the * SeekableStream associated with this ImageDecoder. Only * the first page of a multi-page image is decoded. */	TokenNameCOMMENT_JAVADOC	 Returns a RenderedImage that contains the decoded contents of the SeekableStream associated with this ImageDecoder. Only the first page of a multi-page image is decoded. 
RenderedImage	TokenNameIdentifier	 Rendered Image
decodeAsRenderedImage	TokenNameIdentifier	 decode As Rendered Image
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Returns a RenderedImage that contains the decoded contents of the * SeekableStream associated with this ImageDecoder. * The given page of a multi-page image is decoded. If * the page does not exist, an IOException will be thrown. * Page numbering begins at zero. * * @param page The page to be decoded. */	TokenNameCOMMENT_JAVADOC	 Returns a RenderedImage that contains the decoded contents of the SeekableStream associated with this ImageDecoder. The given page of a multi-page image is decoded. If the page does not exist, an IOException will be thrown. Page numbering begins at zero. * @param page The page to be decoded. 
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
