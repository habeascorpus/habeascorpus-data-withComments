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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
media	TokenNameIdentifier	 media
.	TokenNameDOT	
jai	TokenNameIdentifier	 jai
.	TokenNameDOT	
InterpolationNearest	TokenNameIdentifier	 Interpolation Nearest
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
media	TokenNameIdentifier	 media
.	TokenNameDOT	
jai	TokenNameIdentifier	 jai
.	TokenNameDOT	
JAI	TokenNameIdentifier	 JAI
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
ParameterBlock	TokenNameIdentifier	 Parameter Block
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics2D	TokenNameIdentifier	 Graphics2 D
;	TokenNameSEMICOLON	
/** * ImageOperation to rotate an image by a certain degree * * @see org.apache.tools.ant.taskdefs.optional.image.Image */	TokenNameCOMMENT_JAVADOC	 ImageOperation to rotate an image by a certain degree * @see org.apache.tools.ant.taskdefs.optional.image.Image 
public	TokenNamepublic	
class	TokenNameclass	
Rotate	TokenNameIdentifier	 Rotate
extends	TokenNameextends	
TransformOperation	TokenNameIdentifier	 Transform Operation
implements	TokenNameimplements	
DrawOperation	TokenNameIdentifier	 Draw Operation
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
HALF_CIRCLE	TokenNameIdentifier	 HALF  CIRCLE
=	TokenNameEQUAL	
180.0F	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
=	TokenNameEQUAL	
0.0F	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Sets the angle of rotation in degrees. * @param ang The angle at which to rotate the image */	TokenNameCOMMENT_JAVADOC	 Sets the angle of rotation in degrees. @param ang The angle at which to rotate the image 
public	TokenNamepublic	
void	TokenNamevoid	
setAngle	TokenNameIdentifier	 set Angle
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ang	TokenNameIdentifier	 ang
)	TokenNameRPAREN	
{	TokenNameLBRACE	
angle	TokenNameIdentifier	 angle
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
ang	TokenNameIdentifier	 ang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Rotate an image. * @param image the image to rotate. * @return the rotated image. */	TokenNameCOMMENT_JAVADOC	 Rotate an image. @param image the image to rotate. @return the rotated image. 
public	TokenNamepublic	
PlanarImage	TokenNameIdentifier	 Planar Image
performRotate	TokenNameIdentifier	 perform Rotate
(	TokenNameLPAREN	
PlanarImage	TokenNameIdentifier	 Planar Image
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
tAngle	TokenNameIdentifier	 t Angle
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
/	TokenNameDIVIDE	
HALF_CIRCLE	TokenNameIdentifier	 HALF  CIRCLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParameterBlock	TokenNameIdentifier	 Parameter Block
pb	TokenNameIdentifier	 pb
=	TokenNameEQUAL	
new	TokenNamenew	
ParameterBlock	TokenNameIdentifier	 Parameter Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
addSource	TokenNameIdentifier	 add Source
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0.0F	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0.0F	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tAngle	TokenNameIdentifier	 t Angle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
InterpolationNearest	TokenNameIdentifier	 Interpolation Nearest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
JAI	TokenNameIdentifier	 JAI
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"Rotate"	TokenNameStringLiteral	Rotate
,	TokenNameCOMMA	
pb	TokenNameIdentifier	 pb
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs the image rotation when being handled as a TransformOperation. * @param image The image to perform the transformation on. * @return the transformed image. */	TokenNameCOMMENT_JAVADOC	 Performs the image rotation when being handled as a TransformOperation. @param image The image to perform the transformation on. @return the transformed image. 
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
Graphics2D	TokenNameIdentifier	 Graphics2 D
graphics	TokenNameIdentifier	 graphics
=	TokenNameEQUAL	
null	TokenNamenull	
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
// If this TransformOperation has DrawOperation children 	TokenNameCOMMENT_LINE	If this TransformOperation has DrawOperation children 
// then Rotate the first child and return. 	TokenNameCOMMENT_LINE	then Rotate the first child and return. 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Execing Draws"	TokenNameStringLiteral	Execing Draws
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
image	TokenNameIdentifier	 image
=	TokenNameEQUAL	
performRotate	TokenNameIdentifier	 perform Rotate
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
image	TokenNameIdentifier	 image
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
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getAsBufferedImage	TokenNameIdentifier	 get As Buffered Image
(	TokenNameLPAREN	
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Execing Transforms"	TokenNameStringLiteral	Execing Transforms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Execing as TransformOperation"	TokenNameStringLiteral	Execing as TransformOperation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
image	TokenNameIdentifier	 image
=	TokenNameEQUAL	
performRotate	TokenNameIdentifier	 perform Rotate
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs the image rotation when being handled as a DrawOperation. * It absolutely requires that there be a DrawOperation nested beneath it, * but only the FIRST DrawOperation will be handled since it can only return * ONE image. * @return the image. */	TokenNameCOMMENT_JAVADOC	 Performs the image rotation when being handled as a DrawOperation. It absolutely requires that there be a DrawOperation nested beneath it, but only the FIRST DrawOperation will be handled since it can only return ONE image. @return the image. 
public	TokenNamepublic	
PlanarImage	TokenNameIdentifier	 Planar Image
executeDrawOperation	TokenNameIdentifier	 execute Draw Operation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
// If this TransformOperation has DrawOperation children 	TokenNameCOMMENT_LINE	If this TransformOperation has DrawOperation children 
// then Rotate the first child and return. 	TokenNameCOMMENT_LINE	then Rotate the first child and return. 
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
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
performRotate	TokenNameIdentifier	 perform Rotate
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
