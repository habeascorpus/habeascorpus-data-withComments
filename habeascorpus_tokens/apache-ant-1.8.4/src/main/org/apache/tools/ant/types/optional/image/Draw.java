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
Graphics2D	TokenNameIdentifier	 Graphics2 D
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
Draw	TokenNameIdentifier	 Draw
extends	TokenNameextends	
TransformOperation	TokenNameIdentifier	 Transform Operation
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
int	TokenNameint	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
yloc	TokenNameIdentifier	 yloc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Set the X location. * @param x the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the X location. @param x the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setXloc	TokenNameIdentifier	 set Xloc
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the Y location. * @param y the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the Y location. @param y the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setYloc	TokenNameIdentifier	 set Yloc
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yloc	TokenNameIdentifier	 yloc
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
addRectangle	TokenNameIdentifier	 add Rectangle
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
instructions	TokenNameIdentifier	 instructions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
Text	TokenNameIdentifier	 Text
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
instructions	TokenNameIdentifier	 instructions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an ellipse. * @param elip the ellipse to add. */	TokenNameCOMMENT_JAVADOC	 Add an ellipse. @param elip the ellipse to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addEllipse	TokenNameIdentifier	 add Ellipse
(	TokenNameLPAREN	
Ellipse	TokenNameIdentifier	 Ellipse
elip	TokenNameIdentifier	 elip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
instructions	TokenNameIdentifier	 instructions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
elip	TokenNameIdentifier	 elip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an arc. * @param arc the arc to add. */	TokenNameCOMMENT_JAVADOC	 Add an arc. @param arc the arc to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addArc	TokenNameIdentifier	 add Arc
(	TokenNameLPAREN	
Arc	TokenNameIdentifier	 Arc
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
instructions	TokenNameIdentifier	 instructions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
PlanarImage	TokenNameIdentifier	 Planar Image
executeTransformOperation	TokenNameIdentifier	 execute Transform Operation
(	TokenNameLPAREN	
PlanarImage	TokenNameIdentifier	 Planar Image
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BufferedImage	TokenNameIdentifier	 Buffered Image
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getAsBufferedImage	TokenNameIdentifier	 get As Buffered Image
(	TokenNameLPAREN	
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
op	TokenNameIdentifier	 op
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
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
" Drawing to x="	TokenNameStringLiteral	 Drawing to x=
+	TokenNamePLUS	
xloc	TokenNameIdentifier	 xloc
+	TokenNamePLUS	
" y="	TokenNameStringLiteral	 y=
+	TokenNamePLUS	
yloc	TokenNameIdentifier	 yloc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
drawImage	TokenNameIdentifier	 draw Image
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getAsBufferedImage	TokenNameIdentifier	 get As Buffered Image
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
xloc	TokenNameIdentifier	 xloc
,	TokenNameCOMMA	
yloc	TokenNameIdentifier	 yloc
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
PlanarImage	TokenNameIdentifier	 Planar Image
op	TokenNameIdentifier	 op
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
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedImage	TokenNameIdentifier	 Buffered Image
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getAsBufferedImage	TokenNameIdentifier	 get As Buffered Image
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
" Drawing to x="	TokenNameStringLiteral	 Drawing to x=
+	TokenNamePLUS	
xloc	TokenNameIdentifier	 xloc
+	TokenNamePLUS	
" y="	TokenNameStringLiteral	 y=
+	TokenNamePLUS	
yloc	TokenNameIdentifier	 yloc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics	TokenNameIdentifier	 graphics
.	TokenNameDOT	
drawImage	TokenNameIdentifier	 draw Image
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
xloc	TokenNameIdentifier	 xloc
,	TokenNameCOMMA	
yloc	TokenNameIdentifier	 yloc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PlanarImage	TokenNameIdentifier	 Planar Image
.	TokenNameDOT	
wrapRenderedImage	TokenNameIdentifier	 wrap Rendered Image
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
