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
spi	TokenNameIdentifier	 spi
;	TokenNameSEMICOLON	
/** * Parameters for the encoder which is accessed through the * ImageWriter interface. * * @version $Id: ImageWriterParams.java 582434 2007-10-06 02:11:51Z cam $ */	TokenNameCOMMENT_JAVADOC	 Parameters for the encoder which is accessed through the ImageWriter interface. * @version $Id: ImageWriterParams.java 582434 2007-10-06 02:11:51Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ImageWriterParams	TokenNameIdentifier	 Image Writer Params
{	TokenNameLBRACE	
private	TokenNameprivate	
Integer	TokenNameIdentifier	 Integer
resolution	TokenNameIdentifier	 resolution
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Float	TokenNameIdentifier	 Float
jpegQuality	TokenNameIdentifier	 jpeg Quality
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Boolean	TokenNameIdentifier	 Boolean
jpegForceBaseline	TokenNameIdentifier	 jpeg Force Baseline
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
compressionMethod	TokenNameIdentifier	 compression Method
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
ImageWriterParams	TokenNameIdentifier	 Image Writer Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//nop 	TokenNameCOMMENT_LINE	nop 
}	TokenNameRBRACE	
/** * @return the image resolution in dpi, or null if undefined */	TokenNameCOMMENT_JAVADOC	 @return the image resolution in dpi, or null if undefined 
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
getResolution	TokenNameIdentifier	 get Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
resolution	TokenNameIdentifier	 resolution
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the quality value for encoding a JPEG image * (0.0-1.0), or null if undefined */	TokenNameCOMMENT_JAVADOC	 @return the quality value for encoding a JPEG image (0.0-1.0), or null if undefined 
public	TokenNamepublic	
Float	TokenNameIdentifier	 Float
getJPEGQuality	TokenNameIdentifier	 get JPEG Quality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
jpegQuality	TokenNameIdentifier	 jpeg Quality
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if the baseline quantization table is forced, * or null if undefined. */	TokenNameCOMMENT_JAVADOC	 @return true if the baseline quantization table is forced, or null if undefined. 
public	TokenNamepublic	
Boolean	TokenNameIdentifier	 Boolean
getJPEGForceBaseline	TokenNameIdentifier	 get JPEG Force Baseline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
jpegForceBaseline	TokenNameIdentifier	 jpeg Force Baseline
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return the compression method for encoding the image */	TokenNameCOMMENT_JAVADOC	 @return the compression method for encoding the image 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCompressionMethod	TokenNameIdentifier	 get Compression Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
compressionMethod	TokenNameIdentifier	 compression Method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the target resolution of the bitmap image to be written. * @param dpi the resolution in dpi */	TokenNameCOMMENT_JAVADOC	 Sets the target resolution of the bitmap image to be written. @param dpi the resolution in dpi 
public	TokenNamepublic	
void	TokenNamevoid	
setResolution	TokenNameIdentifier	 set Resolution
(	TokenNameLPAREN	
int	TokenNameint	
dpi	TokenNameIdentifier	 dpi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resolution	TokenNameIdentifier	 resolution
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
dpi	TokenNameIdentifier	 dpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the quality setting for encoding JPEG images. * @param quality the quality setting (0.0-1.0) * @param forceBaseline force baseline quantization table */	TokenNameCOMMENT_JAVADOC	 Sets the quality setting for encoding JPEG images. @param quality the quality setting (0.0-1.0) @param forceBaseline force baseline quantization table 
public	TokenNamepublic	
void	TokenNamevoid	
setJPEGQuality	TokenNameIdentifier	 set JPEG Quality
(	TokenNameLPAREN	
float	TokenNamefloat	
quality	TokenNameIdentifier	 quality
,	TokenNameCOMMA	
boolean	TokenNameboolean	
forceBaseline	TokenNameIdentifier	 force Baseline
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
jpegQuality	TokenNameIdentifier	 jpeg Quality
=	TokenNameEQUAL	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
quality	TokenNameIdentifier	 quality
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
jpegForceBaseline	TokenNameIdentifier	 jpeg Force Baseline
=	TokenNameEQUAL	
forceBaseline	TokenNameIdentifier	 force Baseline
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the compression method that shall be used to encode the image. * @param method the compression method */	TokenNameCOMMENT_JAVADOC	 Set the compression method that shall be used to encode the image. @param method the compression method 
public	TokenNamepublic	
void	TokenNamevoid	
setCompressionMethod	TokenNameIdentifier	 set Compression Method
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
compressionMethod	TokenNameIdentifier	 compression Method
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
