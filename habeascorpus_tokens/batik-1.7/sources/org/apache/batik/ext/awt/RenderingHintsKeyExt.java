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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
;	TokenNameSEMICOLON	
/** * Contains additional RenderingHints Keys, such as * KEY_AREA_OF_INTEREST * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: RenderingHintsKeyExt.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 Contains additional RenderingHints Keys, such as KEY_AREA_OF_INTEREST * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: RenderingHintsKeyExt.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
RenderingHintsKeyExt	TokenNameIdentifier	 Rendering Hints Key Ext
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KEY_BASE	TokenNameIdentifier	 KEY  BASE
;	TokenNameSEMICOLON	
/** * Hint as to the transcoding destination. */	TokenNameCOMMENT_JAVADOC	 Hint as to the transcoding destination. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
KEY_TRANSCODING	TokenNameIdentifier	 KEY  TRANSCODING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALUE_TRANSCODING_PRINTING	TokenNameIdentifier	 VALUE  TRANSCODING  PRINTING
=	TokenNameEQUAL	
"Printing"	TokenNameStringLiteral	Printing
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALUE_TRANSCODING_VECTOR	TokenNameIdentifier	 VALUE  TRANSCODING  VECTOR
=	TokenNameEQUAL	
"Vector"	TokenNameStringLiteral	Vector
;	TokenNameSEMICOLON	
/** * Key for the AOI hint. This hint is used to propagate the AOI to Paint * and PaintContext instances. */	TokenNameCOMMENT_JAVADOC	 Key for the AOI hint. This hint is used to propagate the AOI to Paint and PaintContext instances. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
KEY_AREA_OF_INTEREST	TokenNameIdentifier	 KEY  AREA  OF  INTEREST
;	TokenNameSEMICOLON	
/** * Hint for the destination of the rendering when it is a BufferedImage * This works around the fact that Java 2D sometimes lies about the * attributes of the Graphics2D device, when it is an image. * * It is strongly suggested that you use * org.apache.batik.ext.awt.image.GraphicsUtil.createGraphics to * create a Graphics2D from a BufferedImage, this will ensure that * the proper things are done in the processes of creating the * Graphics. */	TokenNameCOMMENT_JAVADOC	 Hint for the destination of the rendering when it is a BufferedImage This works around the fact that Java 2D sometimes lies about the attributes of the Graphics2D device, when it is an image. * It is strongly suggested that you use org.apache.batik.ext.awt.image.GraphicsUtil.createGraphics to create a Graphics2D from a BufferedImage, this will ensure that the proper things are done in the processes of creating the Graphics. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
KEY_BUFFERED_IMAGE	TokenNameIdentifier	 KEY  BUFFERED  IMAGE
;	TokenNameSEMICOLON	
/** * Hint to source that we only want an alpha channel. * The source should follow the SVG spec for how to * convert ARGB, RGB, Grey and AGrey to just an Alpha channel. */	TokenNameCOMMENT_JAVADOC	 Hint to source that we only want an alpha channel. The source should follow the SVG spec for how to convert ARGB, RGB, Grey and AGrey to just an Alpha channel. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
KEY_COLORSPACE	TokenNameIdentifier	 KEY  COLORSPACE
;	TokenNameSEMICOLON	
/** * Hint for the org.apache.batik.ext.awt.image.GraphicsUtil class that * tiling of a bitmap during rendering is undesired. This is primarily * for the PDF and PostScript transcoders where tiling can lead to * suboptimal results due to overlaps in transparency and filter effects. */	TokenNameCOMMENT_JAVADOC	 Hint for the org.apache.batik.ext.awt.image.GraphicsUtil class that tiling of a bitmap during rendering is undesired. This is primarily for the PDF and PostScript transcoders where tiling can lead to suboptimal results due to overlaps in transparency and filter effects. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
KEY_AVOID_TILE_PAINTING	TokenNameIdentifier	 KEY  AVOID  TILE  PAINTING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
VALUE_AVOID_TILE_PAINTING_ON	TokenNameIdentifier	 VALUE  AVOID  TILE  PAINTING  ON
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
VALUE_AVOID_TILE_PAINTING_OFF	TokenNameIdentifier	 VALUE  AVOID  TILE  PAINTING  OFF
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
VALUE_AVOID_TILE_PAINTING_DEFAULT	TokenNameIdentifier	 VALUE  AVOID  TILE  PAINTING  DEFAULT
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
int	TokenNameint	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
10100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
trans	TokenNameIdentifier	 trans
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
aoi	TokenNameIdentifier	 aoi
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
atp	TokenNameIdentifier	 atp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
trans	TokenNameIdentifier	 trans
=	TokenNameEQUAL	
new	TokenNamenew	
TranscodingHintKey	TokenNameIdentifier	 Transcoding Hint Key
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aoi	TokenNameIdentifier	 aoi
=	TokenNameEQUAL	
new	TokenNamenew	
AreaOfInterestHintKey	TokenNameIdentifier	 Area Of Interest Hint Key
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImageHintKey	TokenNameIdentifier	 Buffered Image Hint Key
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
new	TokenNamenew	
ColorSpaceHintKey	TokenNameIdentifier	 Color Space Hint Key
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
atp	TokenNameIdentifier	 atp
=	TokenNameEQUAL	
new	TokenNamenew	
AvoidTilingHintKey	TokenNameIdentifier	 Avoid Tiling Hint Key
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"You have loaded the Batik jar files more than once "	TokenNameStringLiteral	You have loaded the Batik jar files more than once 
+	TokenNamePLUS	
"in the same JVM this is likely a problem with the "	TokenNameStringLiteral	in the same JVM this is likely a problem with the 
+	TokenNamePLUS	
"way you are loading the Batik jar files."	TokenNameStringLiteral	way you are loading the Batik jar files.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
KEY_BASE	TokenNameIdentifier	 KEY  BASE
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
KEY_TRANSCODING	TokenNameIdentifier	 KEY  TRANSCODING
=	TokenNameEQUAL	
trans	TokenNameIdentifier	 trans
;	TokenNameSEMICOLON	
KEY_AREA_OF_INTEREST	TokenNameIdentifier	 KEY  AREA  OF  INTEREST
=	TokenNameEQUAL	
aoi	TokenNameIdentifier	 aoi
;	TokenNameSEMICOLON	
KEY_BUFFERED_IMAGE	TokenNameIdentifier	 KEY  BUFFERED  IMAGE
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
KEY_COLORSPACE	TokenNameIdentifier	 KEY  COLORSPACE
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
;	TokenNameSEMICOLON	
KEY_AVOID_TILE_PAINTING	TokenNameIdentifier	 KEY  AVOID  TILE  PAINTING
=	TokenNameEQUAL	
atp	TokenNameIdentifier	 atp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do not authorize creation of instances of that class */	TokenNameCOMMENT_JAVADOC	 Do not authorize creation of instances of that class 
private	TokenNameprivate	
RenderingHintsKeyExt	TokenNameIdentifier	 Rendering Hints Key Ext
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
