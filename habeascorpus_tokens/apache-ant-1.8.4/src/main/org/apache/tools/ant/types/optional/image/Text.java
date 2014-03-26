/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
media	TokenNameIdentifier	 media
.	TokenNameDOT	
jai	TokenNameIdentifier	 jai
.	TokenNameDOT	
PlanarImage	TokenNameIdentifier	 Planar Image
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
Font	TokenNameIdentifier	 Font
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
FontMetrics	TokenNameIdentifier	 Font Metrics
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics2D	TokenNameIdentifier	 Graphics2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
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
/** * * @see org.apache.tools.ant.taskdefs.optional.image.Image */	TokenNameCOMMENT_JAVADOC	 * @see org.apache.tools.ant.taskdefs.optional.image.Image 
public	TokenNamepublic	
class	TokenNameclass	
Text	TokenNameIdentifier	 Text
extends	TokenNameextends	
ImageOperation	TokenNameIdentifier	 Image Operation
implements	TokenNameimplements	
DrawOperation	TokenNameIdentifier	 Draw Operation
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_POINT	TokenNameIdentifier	 DEFAULT  POINT
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
strText	TokenNameIdentifier	 str Text
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
"Arial"	TokenNameStringLiteral	Arial
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
point	TokenNameIdentifier	 point
=	TokenNameEQUAL	
DEFAULT_POINT	TokenNameIdentifier	 DEFAULT  POINT
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
bold	TokenNameIdentifier	 bold
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
italic	TokenNameIdentifier	 italic
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
color	TokenNameIdentifier	 color
=	TokenNameEQUAL	
"black"	TokenNameStringLiteral	black
;	TokenNameSEMICOLON	
/** * Set the string to be used as text. * @param str the string to be used. */	TokenNameCOMMENT_JAVADOC	 Set the string to be used as text. @param str the string to be used. 
public	TokenNamepublic	
void	TokenNamevoid	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
strText	TokenNameIdentifier	 str Text
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the font to be used to draw the text. * @param f the font to be used. */	TokenNameCOMMENT_JAVADOC	 Set the font to be used to draw the text. @param f the font to be used. 
public	TokenNamepublic	
void	TokenNamevoid	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the number of points to be used. * @param p an integer value as a string. */	TokenNameCOMMENT_JAVADOC	 Set the number of points to be used. @param p an integer value as a string. 
public	TokenNamepublic	
void	TokenNamevoid	
setPoint	TokenNameIdentifier	 set Point
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
point	TokenNameIdentifier	 point
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the color of the text. * @param c the color name. */	TokenNameCOMMENT_JAVADOC	 Set the color of the text. @param c the color name. 
public	TokenNamepublic	
void	TokenNamevoid	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
color	TokenNameIdentifier	 color
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @todo is this used? * @param state not used at the moment. */	TokenNameCOMMENT_JAVADOC	 @todo is this used? @param state not used at the moment. 
public	TokenNamepublic	
void	TokenNamevoid	
setBold	TokenNameIdentifier	 set Bold
(	TokenNameLPAREN	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bold	TokenNameIdentifier	 bold
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @todo is this used? * @param state not used at the moment. */	TokenNameCOMMENT_JAVADOC	 @todo is this used? @param state not used at the moment. 
public	TokenNamepublic	
void	TokenNamevoid	
setItalic	TokenNameIdentifier	 set Italic
(	TokenNameLPAREN	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
italic	TokenNameIdentifier	 italic
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Draw the text. * @return the resultant image. */	TokenNameCOMMENT_JAVADOC	 Draw the text. @return the resultant image. 
public	TokenNamepublic	
PlanarImage	TokenNameIdentifier	 Planar Image
executeDrawOperation	TokenNameIdentifier	 execute Draw Operation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
" Creating Text ""	TokenNameStringLiteral	 Creating Text "
+	TokenNamePLUS	
strText	TokenNameIdentifier	 str Text
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Color	TokenNameIdentifier	 Color
couloir	TokenNameIdentifier	 couloir
=	TokenNameEQUAL	
ColorMapper	TokenNameIdentifier	 Color Mapper
.	TokenNameDOT	
getColorByName	TokenNameIdentifier	 get Color By Name
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
BufferedImage	TokenNameIdentifier	 Buffered Image
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
BufferedImage	TokenNameIdentifier	 Buffered Image
.	TokenNameDOT	
TYPE_4BYTE_ABGR_PRE	TokenNameIdentifier	 TYPE 4 BYTE  ABGR  PRE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Graphics2D	TokenNameIdentifier	 Graphics2 D
graphics	TokenNameIdentifier	 graphics
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
)	TokenNameRPAREN	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getGraphics	TokenNameIdentifier	 get Graphics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
setRenderingHint	TokenNameIdentifier	 set Rendering Hint
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_ANTIALIASING	TokenNameIdentifier	 KEY  ANTIALIASING
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_ANTIALIAS_ON	TokenNameIdentifier	 VALUE  ANTIALIAS  ON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
setRenderingHint	TokenNameIdentifier	 set Rendering Hint
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_FRACTIONALMETRICS	TokenNameIdentifier	 KEY  FRACTIONALMETRICS
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_FRACTIONALMETRICS_ON	TokenNameIdentifier	 VALUE  FRACTIONALMETRICS  ON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Font	TokenNameIdentifier	 Font
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
Font	TokenNameIdentifier	 Font
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
,	TokenNameCOMMA	
Font	TokenNameIdentifier	 Font
.	TokenNameDOT	
PLAIN	TokenNameIdentifier	 PLAIN
,	TokenNameCOMMA	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FontMetrics	TokenNameIdentifier	 Font Metrics
fmetrics	TokenNameIdentifier	 fmetrics
=	TokenNameEQUAL	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
getFontMetrics	TokenNameIdentifier	 get Font Metrics
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
fmetrics	TokenNameIdentifier	 fmetrics
.	TokenNameDOT	
getMaxAscent	TokenNameIdentifier	 get Max Ascent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
fmetrics	TokenNameIdentifier	 fmetrics
.	TokenNameDOT	
getMaxDescent	TokenNameIdentifier	 get Max Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
fmetrics	TokenNameIdentifier	 fmetrics
.	TokenNameDOT	
stringWidth	TokenNameIdentifier	 string Width
(	TokenNameLPAREN	
strText	TokenNameIdentifier	 str Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedImage	TokenNameIdentifier	 Buffered Image
(	TokenNameLPAREN	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
BufferedImage	TokenNameIdentifier	 Buffered Image
.	TokenNameDOT	
TYPE_4BYTE_ABGR_PRE	TokenNameIdentifier	 TYPE 4 BYTE  ABGR  PRE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
)	TokenNameRPAREN	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getGraphics	TokenNameIdentifier	 get Graphics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
setRenderingHint	TokenNameIdentifier	 set Rendering Hint
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_ANTIALIASING	TokenNameIdentifier	 KEY  ANTIALIASING
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_ANTIALIAS_ON	TokenNameIdentifier	 VALUE  ANTIALIAS  ON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
setRenderingHint	TokenNameIdentifier	 set Rendering Hint
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
KEY_FRACTIONALMETRICS	TokenNameIdentifier	 KEY  FRACTIONALMETRICS
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
VALUE_FRACTIONALMETRICS_ON	TokenNameIdentifier	 VALUE  FRACTIONALMETRICS  ON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
couloir	TokenNameIdentifier	 couloir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
drawString	TokenNameIdentifier	 draw String
(	TokenNameLPAREN	
strText	TokenNameIdentifier	 str Text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
fmetrics	TokenNameIdentifier	 fmetrics
.	TokenNameDOT	
getMaxDescent	TokenNameIdentifier	 get Max Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PlanarImage	TokenNameIdentifier	 Planar Image
image	TokenNameIdentifier	 image
=	TokenNameEQUAL	
PlanarImage	TokenNameIdentifier	 Planar Image
.	TokenNameDOT	
wrapRenderedImage	TokenNameIdentifier	 wrap Rendered Image
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
