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
/** * ImageWriter implementation that uses Batik's PNG codec to * write PNG files. * * @version $Id: PNGImageWriter.java 502538 2007-02-02 08:52:56Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 ImageWriter implementation that uses Batik's PNG codec to write PNG files. * @version $Id: PNGImageWriter.java 502538 2007-02-02 08:52:56Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
PNGImageWriter	TokenNameIdentifier	 PNG Image Writer
implements	TokenNameimplements	
ImageWriter	TokenNameIdentifier	 Image Writer
{	TokenNameLBRACE	
/** * @see ImageWriter#writeImage(java.awt.image.RenderedImage, java.io.OutputStream) */	TokenNameCOMMENT_JAVADOC	 @see ImageWriter#writeImage(java.awt.image.RenderedImage, java.io.OutputStream) 
public	TokenNamepublic	
void	TokenNamevoid	
writeImage	TokenNameIdentifier	 write Image
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
writeImage	TokenNameIdentifier	 write Image
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ImageWriter#writeImage(java.awt.image.RenderedImage, java.io.OutputStream, org.apache.batik.ext.awt.image.spi.ImageWriterParams) */	TokenNameCOMMENT_JAVADOC	 @see ImageWriter#writeImage(java.awt.image.RenderedImage, java.io.OutputStream, org.apache.batik.ext.awt.image.spi.ImageWriterParams) 
public	TokenNamepublic	
void	TokenNamevoid	
writeImage	TokenNameIdentifier	 write Image
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
ImageWriterParams	TokenNameIdentifier	 Image Writer Params
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
PNGImageEncoder	TokenNameIdentifier	 PNG Image Encoder
encoder	TokenNameIdentifier	 encoder
=	TokenNameEQUAL	
new	TokenNamenew	
PNGImageEncoder	TokenNameIdentifier	 PNG Image Encoder
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ImageWriter#getMIMEType() */	TokenNameCOMMENT_JAVADOC	 @see ImageWriter#getMIMEType() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMIMEType	TokenNameIdentifier	 get MIME Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"image/png"	TokenNameStringLiteral	image/png
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
