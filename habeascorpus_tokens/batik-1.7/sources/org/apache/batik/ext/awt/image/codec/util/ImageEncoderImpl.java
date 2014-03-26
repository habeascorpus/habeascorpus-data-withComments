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
ColorModel	TokenNameIdentifier	 Color Model
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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
/** * A partial implementation of the ImageEncoder interface useful for * subclassing. * * <p><b> This class is not a committed part of the JAI API. It may * be removed or changed in future releases of JAI.</b> * * @version $Id: ImageEncoderImpl.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A partial implementation of the ImageEncoder interface useful for subclassing. * <p><b> This class is not a committed part of the JAI API. It may be removed or changed in future releases of JAI.</b> * @version $Id: ImageEncoderImpl.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ImageEncoderImpl	TokenNameIdentifier	 Image Encoder Impl
implements	TokenNameimplements	
ImageEncoder	TokenNameIdentifier	 Image Encoder
{	TokenNameLBRACE	
/** The OutputStream associcted with this ImageEncoder. */	TokenNameCOMMENT_JAVADOC	 The OutputStream associcted with this ImageEncoder. 
protected	TokenNameprotected	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
/** The ImageEncodeParam object associcted with this ImageEncoder. */	TokenNameCOMMENT_JAVADOC	 The ImageEncodeParam object associcted with this ImageEncoder. 
protected	TokenNameprotected	
ImageEncodeParam	TokenNameIdentifier	 Image Encode Param
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
/** * Constructs an ImageEncoderImpl with a given OutputStream * and ImageEncoderParam instance. */	TokenNameCOMMENT_JAVADOC	 Constructs an ImageEncoderImpl with a given OutputStream and ImageEncoderParam instance. 
public	TokenNamepublic	
ImageEncoderImpl	TokenNameIdentifier	 Image Encoder Impl
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
ImageEncodeParam	TokenNameIdentifier	 Image Encode Param
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current parameters as an instance of the * ImageEncodeParam interface. Concrete implementations of this * interface will return corresponding concrete implementations of * the ImageEncodeParam interface. For example, a JPEGImageEncoder * will return an instance of JPEGEncodeParam. */	TokenNameCOMMENT_JAVADOC	 Returns the current parameters as an instance of the ImageEncodeParam interface. Concrete implementations of this interface will return corresponding concrete implementations of the ImageEncodeParam interface. For example, a JPEGImageEncoder will return an instance of JPEGEncodeParam. 
public	TokenNamepublic	
ImageEncodeParam	TokenNameIdentifier	 Image Encode Param
getParam	TokenNameIdentifier	 get Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the current parameters to an instance of the * ImageEncodeParam interface. Concrete implementations * of ImageEncoder may throw a RuntimeException if the * params argument is not an instance of the appropriate * subclass or subinterface. For example, a JPEGImageEncoder * will expect param to be an instance of JPEGEncodeParam. */	TokenNameCOMMENT_JAVADOC	 Sets the current parameters to an instance of the ImageEncodeParam interface. Concrete implementations of ImageEncoder may throw a RuntimeException if the params argument is not an instance of the appropriate subclass or subinterface. For example, a JPEGImageEncoder will expect param to be an instance of JPEGEncodeParam. 
public	TokenNamepublic	
void	TokenNamevoid	
setParam	TokenNameIdentifier	 set Param
(	TokenNameLPAREN	
ImageEncodeParam	TokenNameIdentifier	 Image Encode Param
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
/** Returns the OutputStream associated with this ImageEncoder. */	TokenNameCOMMENT_JAVADOC	 Returns the OutputStream associated with this ImageEncoder. 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Encodes a Raster with a given ColorModel and writes the output * to the OutputStream associated with this ImageEncoder. */	TokenNameCOMMENT_JAVADOC	 Encodes a Raster with a given ColorModel and writes the output to the OutputStream associated with this ImageEncoder. 
public	TokenNamepublic	
void	TokenNamevoid	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
ras	TokenNameIdentifier	 ras
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
RenderedImage	TokenNameIdentifier	 Rendered Image
im	TokenNameIdentifier	 im
=	TokenNameEQUAL	
new	TokenNamenew	
SingleTileRenderedImage	TokenNameIdentifier	 Single Tile Rendered Image
(	TokenNameLPAREN	
ras	TokenNameIdentifier	 ras
,	TokenNameCOMMA	
cm	TokenNameIdentifier	 cm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
im	TokenNameIdentifier	 im
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Encodes a RenderedImage and writes the output to the * OutputStream associated with this ImageEncoder. */	TokenNameCOMMENT_JAVADOC	 Encodes a RenderedImage and writes the output to the OutputStream associated with this ImageEncoder. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
im	TokenNameIdentifier	 im
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
