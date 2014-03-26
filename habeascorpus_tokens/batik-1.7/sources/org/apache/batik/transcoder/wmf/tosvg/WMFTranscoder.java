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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Dimension	TokenNameIdentifier	 Dimension
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInputStream	TokenNameIdentifier	 Data Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
.	TokenNameDOT	
SVGGraphics2D	TokenNameIdentifier	 SVG Graphics2 D
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
ToSVGAbstractTranscoder	TokenNameIdentifier	 To SVG Abstract Transcoder
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
TranscoderInput	TokenNameIdentifier	 Transcoder Input
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** This class implements the <tt>Transcoder</tt> interface and * can convert a WMF input document into an SVG document. * <p>This class is copied from * batik org.apache.batik.transcoder.wmf.tosvg.WMFTranscoder class.</p> * <p>It can use <tt>TranscoderInput</tt> that are either a URI * or a <tt>InputStream</tt> or a <tt>Reader</tt>. The * <tt>XMLReader</tt> and <tt>Document</tt> <tt>TranscoderInput</tt> * types are not supported.</p> * * <p>This transcoder can use <tt>TranscoderOutputs</tt> that are * of any type except the <tt>XMLFilter</tt> type.</p> * * <p>Corrected bugs from the original class:</p> * <ul> * <li> Manage images size</li> * </ul> * <p>Exemple of use :</p> * <pre> * WMFTranscoder transcoder = new WMFTranscoder(); * try { * TranscoderInput wmf = new TranscoderInput(wmffile.toURL().toString()); * FileOutputStream fos = new FileOutputStream(svgFile); * TranscoderOutput svg = * new TranscoderOutput(new OutputStreamWriter(fos, "UTF-8")); * transcoder.transcode(wmf, svg); * } catch (MalformedURLException e){ * throw new TranscoderException(e); * } catch (IOException e){ * throw new TranscoderException(e); * } * </pre> * <p>Several transcoding hints are available for this transcoder :</p> * <ul> * <li>KEY_INPUT_WIDTH, KEY_INPUT_HEIGHT, KEY_XOFFSET, KEY_YOFFSET : this Integer values allows to * set the portion of the image to transcode, defined by the width, height, and offset * of this portion in Metafile units. * </ul> * <pre> * transcoder.addTranscodingHint(FromWMFTranscoder.KEY_INPUT_WIDTH, new Integer(input_width)); * </pre> * </li> * <li>KEY_WIDTH, KEY_HEIGHT : this Float values allows to force the width and height of the output: * </ul> * <pre> * transcoder.addTranscodingHint(FromWMFTranscoder.KEY_WIDTH, new Float(width)); * </pre> * </li> * </ul> * * @version $Id: WMFTranscoder.java 577540 2007-09-20 04:26:59Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the <tt>Transcoder</tt> interface and can convert a WMF input document into an SVG document. <p>This class is copied from batik org.apache.batik.transcoder.wmf.tosvg.WMFTranscoder class.</p> <p>It can use <tt>TranscoderInput</tt> that are either a URI or a <tt>InputStream</tt> or a <tt>Reader</tt>. The <tt>XMLReader</tt> and <tt>Document</tt> <tt>TranscoderInput</tt> types are not supported.</p> * <p>This transcoder can use <tt>TranscoderOutputs</tt> that are of any type except the <tt>XMLFilter</tt> type.</p> * <p>Corrected bugs from the original class:</p> <ul> <li> Manage images size</li> </ul> <p>Exemple of use :</p> <pre> WMFTranscoder transcoder = new WMFTranscoder(); try { TranscoderInput wmf = new TranscoderInput(wmffile.toURL().toString()); FileOutputStream fos = new FileOutputStream(svgFile); TranscoderOutput svg = new TranscoderOutput(new OutputStreamWriter(fos, "UTF-8")); transcoder.transcode(wmf, svg); } catch (MalformedURLException e){ throw new TranscoderException(e); } catch (IOException e){ throw new TranscoderException(e); } </pre> <p>Several transcoding hints are available for this transcoder :</p> <ul> <li>KEY_INPUT_WIDTH, KEY_INPUT_HEIGHT, KEY_XOFFSET, KEY_YOFFSET : this Integer values allows to set the portion of the image to transcode, defined by the width, height, and offset of this portion in Metafile units. </ul> <pre> transcoder.addTranscodingHint(FromWMFTranscoder.KEY_INPUT_WIDTH, new Integer(input_width)); </pre> </li> <li>KEY_WIDTH, KEY_HEIGHT : this Float values allows to force the width and height of the output: </ul> <pre> transcoder.addTranscodingHint(FromWMFTranscoder.KEY_WIDTH, new Float(width)); </pre> </li> </ul> * @version $Id: WMFTranscoder.java 577540 2007-09-20 04:26:59Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
WMFTranscoder	TokenNameIdentifier	 WMF Transcoder
extends	TokenNameextends	
ToSVGAbstractTranscoder	TokenNameIdentifier	 To SVG Abstract Transcoder
{	TokenNameLBRACE	
/** * Default constructor */	TokenNameCOMMENT_JAVADOC	 Default constructor 
public	TokenNamepublic	
WMFTranscoder	TokenNameIdentifier	 WMF Transcoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Transcodes the specified input in the specified output. * @param input the input to transcode * @param output the ouput where to transcode * @exception TranscoderException if an error occured while transcoding */	TokenNameCOMMENT_JAVADOC	 Transcodes the specified input in the specified output. @param input the input to transcode @param output the ouput where to transcode @exception TranscoderException if an error occured while transcoding 
public	TokenNamepublic	
void	TokenNamevoid	
transcode	TokenNameIdentifier	 transcode
(	TokenNameLPAREN	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Extract the input 	TokenNameCOMMENT_LINE	Extract the input 
// 	TokenNameCOMMENT_LINE	 
DataInputStream	TokenNameIdentifier	 Data Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
getCompatibleInput	TokenNameIdentifier	 get Compatible Input
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Build a RecordStore from the input 	TokenNameCOMMENT_LINE	Build a RecordStore from the input 
// 	TokenNameCOMMENT_LINE	 
WMFRecordStore	TokenNameIdentifier	 WMF Record Store
currentStore	TokenNameIdentifier	 current Store
=	TokenNameEQUAL	
new	TokenNamenew	
WMFRecordStore	TokenNameIdentifier	 WMF Record Store
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
currentStore	TokenNameIdentifier	 current Store
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// determines the width and height of output image 	TokenNameCOMMENT_LINE	determines the width and height of output image 
float	TokenNamefloat	
wmfwidth	TokenNameIdentifier	 wmfwidth
;	TokenNameSEMICOLON	
// width in pixels 	TokenNameCOMMENT_LINE	width in pixels 
float	TokenNamefloat	
wmfheight	TokenNameIdentifier	 wmfheight
;	TokenNameSEMICOLON	
// height in pixels 	TokenNameCOMMENT_LINE	height in pixels 
float	TokenNamefloat	
conv	TokenNameIdentifier	 conv
=	TokenNameEQUAL	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// conversion factor 	TokenNameCOMMENT_LINE	conversion factor 
if	TokenNameif	
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
KEY_INPUT_WIDTH	TokenNameIdentifier	 KEY  INPUT  WIDTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wmfwidth	TokenNameIdentifier	 wmfwidth
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_INPUT_WIDTH	TokenNameIdentifier	 KEY  INPUT  WIDTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wmfheight	TokenNameIdentifier	 wmfheight
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_INPUT_HEIGHT	TokenNameIdentifier	 KEY  INPUT  HEIGHT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
wmfwidth	TokenNameIdentifier	 wmfwidth
=	TokenNameEQUAL	
currentStore	TokenNameIdentifier	 current Store
.	TokenNameDOT	
getWidthPixels	TokenNameIdentifier	 get Width Pixels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wmfheight	TokenNameIdentifier	 wmfheight
=	TokenNameEQUAL	
currentStore	TokenNameIdentifier	 current Store
.	TokenNameDOT	
getHeightPixels	TokenNameIdentifier	 get Height Pixels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
wmfwidth	TokenNameIdentifier	 wmfwidth
;	TokenNameSEMICOLON	
float	TokenNamefloat	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
wmfheight	TokenNameIdentifier	 wmfheight
;	TokenNameSEMICOLON	
// change the output width and height if required 	TokenNameCOMMENT_LINE	change the output width and height if required 
if	TokenNameif	
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
KEY_WIDTH	TokenNameIdentifier	 KEY  WIDTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_WIDTH	TokenNameIdentifier	 KEY  WIDTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conv	TokenNameIdentifier	 conv
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
/	TokenNameDIVIDE	
wmfwidth	TokenNameIdentifier	 wmfwidth
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
width	TokenNameIdentifier	 width
/	TokenNameDIVIDE	
wmfwidth	TokenNameIdentifier	 wmfwidth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// determine the offset values 	TokenNameCOMMENT_LINE	determine the offset values 
int	TokenNameint	
xOffset	TokenNameIdentifier	 x Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
yOffset	TokenNameIdentifier	 y Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
KEY_XOFFSET	TokenNameIdentifier	 KEY  XOFFSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xOffset	TokenNameIdentifier	 x Offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_XOFFSET	TokenNameIdentifier	 KEY  XOFFSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
KEY_YOFFSET	TokenNameIdentifier	 KEY  YOFFSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yOffset	TokenNameIdentifier	 y Offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_YOFFSET	TokenNameIdentifier	 KEY  YOFFSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Set the size and viewBox on the output document 	TokenNameCOMMENT_LINE	Set the size and viewBox on the output document 
float	TokenNamefloat	
sizeFactor	TokenNameIdentifier	 size Factor
=	TokenNameEQUAL	
currentStore	TokenNameIdentifier	 current Store
.	TokenNameDOT	
getUnitsToPixels	TokenNameIdentifier	 get Units To Pixels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
conv	TokenNameIdentifier	 conv
;	TokenNameSEMICOLON	
int	TokenNameint	
vpX	TokenNameIdentifier	 vp X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
currentStore	TokenNameIdentifier	 current Store
.	TokenNameDOT	
getVpX	TokenNameIdentifier	 get Vp X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
sizeFactor	TokenNameIdentifier	 size Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
vpY	TokenNameIdentifier	 vp Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
currentStore	TokenNameIdentifier	 current Store
.	TokenNameDOT	
getVpY	TokenNameIdentifier	 get Vp Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
sizeFactor	TokenNameIdentifier	 size Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
vpW	TokenNameIdentifier	 vp W
;	TokenNameSEMICOLON	
int	TokenNameint	
vpH	TokenNameIdentifier	 vp H
;	TokenNameSEMICOLON	
// if we took only a part of the image, we use its dimension for computing 	TokenNameCOMMENT_LINE	if we took only a part of the image, we use its dimension for computing 
if	TokenNameif	
(	TokenNameLPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
KEY_INPUT_WIDTH	TokenNameIdentifier	 KEY  INPUT  WIDTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vpW	TokenNameIdentifier	 vp W
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_INPUT_WIDTH	TokenNameIdentifier	 KEY  INPUT  WIDTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
conv	TokenNameIdentifier	 conv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vpH	TokenNameIdentifier	 vp H
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
hints	TokenNameIdentifier	 hints
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_INPUT_HEIGHT	TokenNameIdentifier	 KEY  INPUT  HEIGHT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
conv	TokenNameIdentifier	 conv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// else we took the whole image dimension 	TokenNameCOMMENT_LINE	else we took the whole image dimension 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
vpW	TokenNameIdentifier	 vp W
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
currentStore	TokenNameIdentifier	 current Store
.	TokenNameDOT	
getWidthUnits	TokenNameIdentifier	 get Width Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
sizeFactor	TokenNameIdentifier	 size Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vpH	TokenNameIdentifier	 vp H
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
currentStore	TokenNameIdentifier	 current Store
.	TokenNameDOT	
getHeightUnits	TokenNameIdentifier	 get Height Units
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
sizeFactor	TokenNameIdentifier	 size Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Build a painter for the RecordStore 	TokenNameCOMMENT_LINE	Build a painter for the RecordStore 
WMFPainter	TokenNameIdentifier	 WMF Painter
painter	TokenNameIdentifier	 painter
=	TokenNameEQUAL	
new	TokenNamenew	
WMFPainter	TokenNameIdentifier	 WMF Painter
(	TokenNameLPAREN	
currentStore	TokenNameIdentifier	 current Store
,	TokenNameCOMMA	
xOffset	TokenNameIdentifier	 x Offset
,	TokenNameCOMMA	
yOffset	TokenNameIdentifier	 y Offset
,	TokenNameCOMMA	
conv	TokenNameIdentifier	 conv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use SVGGraphics2D to generate SVG content 	TokenNameCOMMENT_LINE	Use SVGGraphics2D to generate SVG content 
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgGenerator	TokenNameIdentifier	 svg Generator
=	TokenNameEQUAL	
new	TokenNamenew	
SVGGraphics2D	TokenNameIdentifier	 SVG Graphics2 D
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** set precision ** otherwise Ellipses aren't working (for example) (because of Decimal format * modifications ins SVGGenerator Context */	TokenNameCOMMENT_JAVADOC	 set precision ** otherwise Ellipses aren't working (for example) (because of Decimal format modifications ins SVGGenerator Context 
svgGenerator	TokenNameIdentifier	 svg Generator
.	TokenNameDOT	
getGeneratorContext	TokenNameIdentifier	 get Generator Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setPrecision	TokenNameIdentifier	 set Precision
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
painter	TokenNameIdentifier	 painter
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
svgGenerator	TokenNameIdentifier	 svg Generator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgGenerator	TokenNameIdentifier	 svg Generator
.	TokenNameDOT	
setSVGCanvasSize	TokenNameIdentifier	 set SVG Canvas Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
vpW	TokenNameIdentifier	 vp W
,	TokenNameCOMMA	
vpH	TokenNameIdentifier	 vp H
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
svgRoot	TokenNameIdentifier	 svg Root
=	TokenNameEQUAL	
svgGenerator	TokenNameIdentifier	 svg Generator
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgRoot	TokenNameIdentifier	 svg Root
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_VIEW_BOX_ATTRIBUTE	TokenNameIdentifier	 SVG  VIEW  BOX  ATTRIBUTE
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
vpX	TokenNameIdentifier	 vp X
)	TokenNameRPAREN	
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
vpY	TokenNameIdentifier	 vp Y
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
vpW	TokenNameIdentifier	 vp W
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
vpH	TokenNameIdentifier	 vp H
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now, write the SVG content to the output 	TokenNameCOMMENT_LINE	Now, write the SVG content to the output 
writeSVGToOutput	TokenNameIdentifier	 write SVG To Output
(	TokenNameLPAREN	
svgGenerator	TokenNameIdentifier	 svg Generator
,	TokenNameCOMMA	
svgRoot	TokenNameIdentifier	 svg Root
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks that the input is one of URI or an <tt>InputStream</tt> * returns it as a DataInputStream */	TokenNameCOMMENT_JAVADOC	 Checks that the input is one of URI or an <tt>InputStream</tt> returns it as a DataInputStream 
private	TokenNameprivate	
DataInputStream	TokenNameIdentifier	 Data Input Stream
getCompatibleInput	TokenNameIdentifier	 get Compatible Input
(	TokenNameLPAREN	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
{	TokenNameLBRACE	
// Cannot deal with null input 	TokenNameCOMMENT_LINE	Cannot deal with null input 
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
ERROR_NULL_INPUT	TokenNameIdentifier	 ERROR  NULL  INPUT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Can deal with InputStream 	TokenNameCOMMENT_LINE	Can deal with InputStream 
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Can deal with URI 	TokenNameCOMMENT_LINE	Can deal with URI 
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
ERROR_INCOMPATIBLE_INPUT_TYPE	TokenNameIdentifier	 ERROR  INCOMPATIBLE  INPUT  TYPE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WMF_EXTENSION	TokenNameIdentifier	 WMF  EXTENSION
=	TokenNameEQUAL	
".wmf"	TokenNameStringLiteral	.wmf
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SVG_EXTENSION	TokenNameIdentifier	 SVG  EXTENSION
=	TokenNameEQUAL	
".svg"	TokenNameStringLiteral	.svg
;	TokenNameSEMICOLON	
/** * Unit testing : Illustrates how the transcoder might be used. */	TokenNameCOMMENT_JAVADOC	 Unit testing : Illustrates how the transcoder might be used. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage : WMFTranscoder.main <file 1> ... <file n>"	TokenNameStringLiteral	Usage : WMFTranscoder.main <file 1> ... <file n>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
WMFTranscoder	TokenNameIdentifier	 WMF Transcoder
transcoder	TokenNameIdentifier	 transcoder
=	TokenNameEQUAL	
new	TokenNamenew	
WMFTranscoder	TokenNameIdentifier	 WMF Transcoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nFiles	TokenNameIdentifier	 n Files
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
nFiles	TokenNameIdentifier	 n Files
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
WMF_EXTENSION	TokenNameIdentifier	 WMF  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" does not have the "	TokenNameStringLiteral	 does not have the 
+	TokenNamePLUS	
WMF_EXTENSION	TokenNameIdentifier	 WMF  EXTENSION
+	TokenNamePLUS	
" extension. It is ignored"	TokenNameStringLiteral	 extension. It is ignored
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Processing : "	TokenNameStringLiteral	Processing : 
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"..."	TokenNameStringLiteral	...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
outputFileName	TokenNameIdentifier	 output File Name
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fileName	TokenNameIdentifier	 file Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
WMF_EXTENSION	TokenNameIdentifier	 WMF  EXTENSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
SVG_EXTENSION	TokenNameIdentifier	 SVG  EXTENSION
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
inputFile	TokenNameIdentifier	 input File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
outputFile	TokenNameIdentifier	 output File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
outputFileName	TokenNameIdentifier	 output File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
(	TokenNameLPAREN	
inputFile	TokenNameIdentifier	 input File
.	TokenNameDOT	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
outputFile	TokenNameIdentifier	 output File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
transcode	TokenNameIdentifier	 transcode
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TranscoderException	TokenNameIdentifier	 Transcoder Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
".... Done"	TokenNameStringLiteral	.... Done
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
