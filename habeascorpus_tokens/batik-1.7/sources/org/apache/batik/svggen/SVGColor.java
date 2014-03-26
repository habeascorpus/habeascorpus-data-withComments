/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
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
Paint	TokenNameIdentifier	 Paint
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
GraphicContext	TokenNameIdentifier	 Graphic Context
;	TokenNameSEMICOLON	
/** * Utility class that converts a Color object into a set of * corresponding SVG attributes. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGColor.java 511565 2007-02-25 18:04:46Z dvholten $ * @see org.apache.batik.svggen.DOMTreeManager */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a Color object into a set of corresponding SVG attributes. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGColor.java 511565 2007-02-25 18:04:46Z dvholten $ @see org.apache.batik.svggen.DOMTreeManager 
public	TokenNamepublic	
class	TokenNameclass	
SVGColor	TokenNameIdentifier	 SVG Color
extends	TokenNameextends	
AbstractSVGConverter	TokenNameIdentifier	 Abstract SVG Converter
{	TokenNameLBRACE	
/** * Predefined CSS colors */	TokenNameCOMMENT_JAVADOC	 Predefined CSS colors 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
aqua	TokenNameIdentifier	 aqua
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
cyan	TokenNameIdentifier	 cyan
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
black	TokenNameIdentifier	 black
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
black	TokenNameIdentifier	 black
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
blue	TokenNameIdentifier	 blue
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
fuchsia	TokenNameIdentifier	 fuchsia
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
magenta	TokenNameIdentifier	 magenta
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
gray	TokenNameIdentifier	 gray
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
gray	TokenNameIdentifier	 gray
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
green	TokenNameIdentifier	 green
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
0x00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOT Color.green! 	TokenNameCOMMENT_LINE	NOT Color.green! 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
lime	TokenNameIdentifier	 lime
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
green	TokenNameIdentifier	 green
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
maroon	TokenNameIdentifier	 maroon
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
navy	TokenNameIdentifier	 navy
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
0x00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
olive	TokenNameIdentifier	 olive
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
purple	TokenNameIdentifier	 purple
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
red	TokenNameIdentifier	 red
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
red	TokenNameIdentifier	 red
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
silver	TokenNameIdentifier	 silver
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
0xc0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xc0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xc0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
teal	TokenNameIdentifier	 teal
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
0x00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
white	TokenNameIdentifier	 white
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
white	TokenNameIdentifier	 white
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
yellow	TokenNameIdentifier	 yellow
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
yellow	TokenNameIdentifier	 yellow
;	TokenNameSEMICOLON	
/** * Color map maps Color values to HTML 4.0 color names */	TokenNameCOMMENT_JAVADOC	 Color map maps Color values to HTML 4.0 color names 
private	TokenNameprivate	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
colorMap	TokenNameIdentifier	 color Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
black	TokenNameIdentifier	 black
,	TokenNameCOMMA	
"black"	TokenNameStringLiteral	black
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
silver	TokenNameIdentifier	 silver
,	TokenNameCOMMA	
"silver"	TokenNameStringLiteral	silver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
gray	TokenNameIdentifier	 gray
,	TokenNameCOMMA	
"gray"	TokenNameStringLiteral	gray
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
white	TokenNameIdentifier	 white
,	TokenNameCOMMA	
"white"	TokenNameStringLiteral	white
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
maroon	TokenNameIdentifier	 maroon
,	TokenNameCOMMA	
"maroon"	TokenNameStringLiteral	maroon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
red	TokenNameIdentifier	 red
,	TokenNameCOMMA	
"red"	TokenNameStringLiteral	red
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
purple	TokenNameIdentifier	 purple
,	TokenNameCOMMA	
"purple"	TokenNameStringLiteral	purple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fuchsia	TokenNameIdentifier	 fuchsia
,	TokenNameCOMMA	
"fuchsia"	TokenNameStringLiteral	fuchsia
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
green	TokenNameIdentifier	 green
,	TokenNameCOMMA	
"green"	TokenNameStringLiteral	green
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
lime	TokenNameIdentifier	 lime
,	TokenNameCOMMA	
"lime"	TokenNameStringLiteral	lime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
olive	TokenNameIdentifier	 olive
,	TokenNameCOMMA	
"olive"	TokenNameStringLiteral	olive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
yellow	TokenNameIdentifier	 yellow
,	TokenNameCOMMA	
"yellow"	TokenNameStringLiteral	yellow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
navy	TokenNameIdentifier	 navy
,	TokenNameCOMMA	
"navy"	TokenNameStringLiteral	navy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
blue	TokenNameIdentifier	 blue
,	TokenNameCOMMA	
"blue"	TokenNameStringLiteral	blue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
teal	TokenNameIdentifier	 teal
,	TokenNameCOMMA	
"teal"	TokenNameStringLiteral	teal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
aqua	TokenNameIdentifier	 aqua
,	TokenNameCOMMA	
"aqua"	TokenNameStringLiteral	aqua
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param generatorContext used by converter to handle precision * or to create elements. */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used by converter to handle precision or to create elements. 
public	TokenNamepublic	
SVGColor	TokenNameIdentifier	 SVG Color
(	TokenNameLPAREN	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts part or all of the input GraphicContext into * a set of attribute/value pairs and related definitions * * @param gc GraphicContext to be converted * @return descriptor of the attributes required to represent * some or all of the GraphicContext state, along * with the related definitions * @see org.apache.batik.svggen.SVGDescriptor */	TokenNameCOMMENT_JAVADOC	 Converts part or all of the input GraphicContext into a set of attribute/value pairs and related definitions * @param gc GraphicContext to be converted @return descriptor of the attributes required to represent some or all of the GraphicContext state, along with the related definitions @see org.apache.batik.svggen.SVGDescriptor 
public	TokenNamepublic	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
GraphicContext	TokenNameIdentifier	 Graphic Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
=	TokenNameEQUAL	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getPaint	TokenNameIdentifier	 get Paint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
)	TokenNameRPAREN	
paint	TokenNameIdentifier	 paint
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a Color object to a set of two corresponding * values: a CSS color string and an opacity value. */	TokenNameCOMMENT_JAVADOC	 Converts a Color object to a set of two corresponding values: a CSS color string and an opacity value. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGPaintDescriptor	TokenNameIdentifier	 SVG Paint Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// First, convert the color value 	TokenNameCOMMENT_LINE	First, convert the color value 
// 	TokenNameCOMMENT_LINE	 
String	TokenNameIdentifier	 String
cssColor	TokenNameIdentifier	 css Color
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
colorMap	TokenNameIdentifier	 color Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cssColor	TokenNameIdentifier	 css Color
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// color is not one of the predefined colors 	TokenNameCOMMENT_LINE	color is not one of the predefined colors 
StringBuffer	TokenNameIdentifier	 String Buffer
cssColorBuffer	TokenNameIdentifier	 css Color Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
RGB_PREFIX	TokenNameIdentifier	 RGB  PREFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cssColorBuffer	TokenNameIdentifier	 css Color Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cssColorBuffer	TokenNameIdentifier	 css Color Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cssColorBuffer	TokenNameIdentifier	 css Color Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cssColorBuffer	TokenNameIdentifier	 css Color Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
COMMA	TokenNameIdentifier	 COMMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cssColorBuffer	TokenNameIdentifier	 css Color Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cssColorBuffer	TokenNameIdentifier	 css Color Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
RGB_SUFFIX	TokenNameIdentifier	 RGB  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cssColor	TokenNameIdentifier	 css Color
=	TokenNameEQUAL	
cssColorBuffer	TokenNameIdentifier	 css Color Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Now, convert the alpha value, if needed 	TokenNameCOMMENT_LINE	Now, convert the alpha value, if needed 
// 	TokenNameCOMMENT_LINE	 
float	TokenNamefloat	
alpha	TokenNameIdentifier	 alpha
=	TokenNameEQUAL	
color	TokenNameIdentifier	 color
.	TokenNameDOT	
getAlpha	TokenNameIdentifier	 get Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
alphaString	TokenNameIdentifier	 alpha String
=	TokenNameEQUAL	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
alpha	TokenNameIdentifier	 alpha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGPaintDescriptor	TokenNameIdentifier	 SVG Paint Descriptor
(	TokenNameLPAREN	
cssColor	TokenNameIdentifier	 css Color
,	TokenNameCOMMA	
alphaString	TokenNameIdentifier	 alpha String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
