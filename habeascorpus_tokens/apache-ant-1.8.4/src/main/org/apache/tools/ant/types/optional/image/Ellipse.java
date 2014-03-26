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
BasicStroke	TokenNameIdentifier	 Basic Stroke
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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Ellipse2D	TokenNameIdentifier	 Ellipse2 D
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
/** * Draw an ellipse. * @see org.apache.tools.ant.taskdefs.optional.image.Image */	TokenNameCOMMENT_JAVADOC	 Draw an ellipse. @see org.apache.tools.ant.taskdefs.optional.image.Image 
public	TokenNamepublic	
class	TokenNameclass	
Ellipse	TokenNameIdentifier	 Ellipse
extends	TokenNameextends	
BasicShape	TokenNameIdentifier	 Basic Shape
implements	TokenNameimplements	
DrawOperation	TokenNameIdentifier	 Draw Operation
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
int	TokenNameint	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Set the width. * @param width the width of the elipse. */	TokenNameCOMMENT_JAVADOC	 Set the width. @param width the width of the elipse. 
public	TokenNamepublic	
void	TokenNamevoid	
setWidth	TokenNameIdentifier	 set Width
(	TokenNameLPAREN	
int	TokenNameint	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the height. * @param height the height of the elipse. */	TokenNameCOMMENT_JAVADOC	 Set the height. @param height the height of the elipse. 
public	TokenNamepublic	
void	TokenNamevoid	
setHeight	TokenNameIdentifier	 set Height
(	TokenNameLPAREN	
int	TokenNameint	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
PlanarImage	TokenNameIdentifier	 Planar Image
executeDrawOperation	TokenNameIdentifier	 execute Draw Operation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
stroke	TokenNameIdentifier	 stroke
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"transparent"	TokenNameStringLiteral	transparent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BasicStroke	TokenNameIdentifier	 Basic Stroke
bStroke	TokenNameIdentifier	 b Stroke
=	TokenNameEQUAL	
new	TokenNamenew	
BasicStroke	TokenNameIdentifier	 Basic Stroke
(	TokenNameLPAREN	
stroke_width	TokenNameIdentifier	 stroke width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
ColorMapper	TokenNameIdentifier	 Color Mapper
.	TokenNameDOT	
getColorByName	TokenNameIdentifier	 get Color By Name
(	TokenNameLPAREN	
stroke	TokenNameIdentifier	 stroke
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
setStroke	TokenNameIdentifier	 set Stroke
(	TokenNameLPAREN	
bStroke	TokenNameIdentifier	 b Stroke
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
new	TokenNamenew	
Ellipse2D	TokenNameIdentifier	 Ellipse2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fill	TokenNameIdentifier	 fill
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"transparent"	TokenNameStringLiteral	transparent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
ColorMapper	TokenNameIdentifier	 Color Mapper
.	TokenNameDOT	
getColorByName	TokenNameIdentifier	 get Color By Name
(	TokenNameLPAREN	
fill	TokenNameIdentifier	 fill
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
new	TokenNamenew	
Ellipse2D	TokenNameIdentifier	 Ellipse2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
instructions	TokenNameIdentifier	 instructions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ImageOperation	TokenNameIdentifier	 Image Operation
instr	TokenNameIdentifier	 instr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ImageOperation	TokenNameIdentifier	 Image Operation
)	TokenNameRPAREN	
instructions	TokenNameIdentifier	 instructions
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
instr	TokenNameIdentifier	 instr
instanceof	TokenNameinstanceof	
DrawOperation	TokenNameIdentifier	 Draw Operation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PlanarImage	TokenNameIdentifier	 Planar Image
img	TokenNameIdentifier	 img
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DrawOperation	TokenNameIdentifier	 Draw Operation
)	TokenNameRPAREN	
instr	TokenNameIdentifier	 instr
)	TokenNameRPAREN	
.	TokenNameDOT	
executeDrawOperation	TokenNameIdentifier	 execute Draw Operation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
drawImage	TokenNameIdentifier	 draw Image
(	TokenNameLPAREN	
img	TokenNameIdentifier	 img
.	TokenNameDOT	
getAsBufferedImage	TokenNameIdentifier	 get As Buffered Image
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
instr	TokenNameIdentifier	 instr
instanceof	TokenNameinstanceof	
TransformOperation	TokenNameIdentifier	 Transform Operation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
PlanarImage	TokenNameIdentifier	 Planar Image
image	TokenNameIdentifier	 image
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformOperation	TokenNameIdentifier	 Transform Operation
)	TokenNameRPAREN	
instr	TokenNameIdentifier	 instr
)	TokenNameRPAREN	
.	TokenNameDOT	
executeTransformOperation	TokenNameIdentifier	 execute Transform Operation
(	TokenNameLPAREN	
PlanarImage	TokenNameIdentifier	 Planar Image
.	TokenNameDOT	
wrapRenderedImage	TokenNameIdentifier	 wrap Rendered Image
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getAsBufferedImage	TokenNameIdentifier	 get As Buffered Image
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
PlanarImage	TokenNameIdentifier	 Planar Image
.	TokenNameDOT	
wrapRenderedImage	TokenNameIdentifier	 wrap Rendered Image
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
