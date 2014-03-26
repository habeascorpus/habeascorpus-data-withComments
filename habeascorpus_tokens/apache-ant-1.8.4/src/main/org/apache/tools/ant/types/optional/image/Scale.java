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
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
BufferedImage	TokenNameIdentifier	 Buffered Image
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
/** * * @see org.apache.tools.ant.taskdefs.optional.image.Image */	TokenNameCOMMENT_JAVADOC	 * @see org.apache.tools.ant.taskdefs.optional.image.Image 
public	TokenNamepublic	
class	TokenNameclass	
Scale	TokenNameIdentifier	 Scale
extends	TokenNameextends	
TransformOperation	TokenNameIdentifier	 Transform Operation
implements	TokenNameimplements	
DrawOperation	TokenNameIdentifier	 Draw Operation
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HUNDRED	TokenNameIdentifier	 HUNDRED
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
widthStr	TokenNameIdentifier	 width Str
=	TokenNameEQUAL	
"100%"	TokenNameStringLiteral	100%
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
heightStr	TokenNameIdentifier	 height Str
=	TokenNameEQUAL	
"100%"	TokenNameStringLiteral	100%
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
xPercent	TokenNameIdentifier	 x Percent
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
yPercent	TokenNameIdentifier	 y Percent
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
proportions	TokenNameIdentifier	 proportions
=	TokenNameEQUAL	
"ignore"	TokenNameStringLiteral	ignore
;	TokenNameSEMICOLON	
/** Enumerated class for proportions attribute. */	TokenNameCOMMENT_JAVADOC	 Enumerated class for proportions attribute. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ProportionsAttribute	TokenNameIdentifier	 Proportions Attribute
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ignore"	TokenNameStringLiteral	ignore
,	TokenNameCOMMA	
"width"	TokenNameStringLiteral	width
,	TokenNameCOMMA	
"height"	TokenNameStringLiteral	height
,	TokenNameCOMMA	
"cover"	TokenNameStringLiteral	cover
,	TokenNameCOMMA	
"fit"	TokenNameStringLiteral	fit
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the behaviour regarding the image proportions. * @param pa the enumerated value. */	TokenNameCOMMENT_JAVADOC	 Sets the behaviour regarding the image proportions. @param pa the enumerated value. 
public	TokenNamepublic	
void	TokenNamevoid	
setProportions	TokenNameIdentifier	 set Proportions
(	TokenNameLPAREN	
ProportionsAttribute	TokenNameIdentifier	 Proportions Attribute
pa	TokenNameIdentifier	 pa
)	TokenNameRPAREN	
{	TokenNameLBRACE	
proportions	TokenNameIdentifier	 proportions
=	TokenNameEQUAL	
pa	TokenNameIdentifier	 pa
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the width of the image, either as an integer or a %. * Defaults to 100%. * @param width the value to use. */	TokenNameCOMMENT_JAVADOC	 Sets the width of the image, either as an integer or a %. Defaults to 100%. @param width the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setWidth	TokenNameIdentifier	 set Width
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
widthStr	TokenNameIdentifier	 width Str
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the height of the image, either as an integer or a %. Defaults to 100%. * @param height the value to use. */	TokenNameCOMMENT_JAVADOC	 Sets the height of the image, either as an integer or a %. Defaults to 100%. @param height the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setHeight	TokenNameIdentifier	 set Height
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heightStr	TokenNameIdentifier	 height Str
=	TokenNameEQUAL	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the width. * @return the value converted from the width string. */	TokenNameCOMMENT_JAVADOC	 Get the width. @return the value converted from the width string. 
public	TokenNamepublic	
float	TokenNamefloat	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
0.0F	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
percIndex	TokenNameIdentifier	 perc Index
=	TokenNameEQUAL	
widthStr	TokenNameIdentifier	 width Str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
percIndex	TokenNameIdentifier	 perc Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
widthStr	TokenNameIdentifier	 width Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
percIndex	TokenNameIdentifier	 perc Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xPercent	TokenNameIdentifier	 x Percent
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
width	TokenNameIdentifier	 width
/	TokenNameDIVIDE	
HUNDRED	TokenNameIdentifier	 HUNDRED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
xPercent	TokenNameIdentifier	 x Percent
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
widthStr	TokenNameIdentifier	 width Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the height. * @return the value converted from the height string. */	TokenNameCOMMENT_JAVADOC	 Get the height. @return the value converted from the height string. 
public	TokenNamepublic	
float	TokenNamefloat	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
percIndex	TokenNameIdentifier	 perc Index
=	TokenNameEQUAL	
heightStr	TokenNameIdentifier	 height Str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
percIndex	TokenNameIdentifier	 perc Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
heightStr	TokenNameIdentifier	 height Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
percIndex	TokenNameIdentifier	 perc Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yPercent	TokenNameIdentifier	 y Percent
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
height	TokenNameIdentifier	 height
/	TokenNameDIVIDE	
HUNDRED	TokenNameIdentifier	 HUNDRED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
yPercent	TokenNameIdentifier	 y Percent
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
heightStr	TokenNameIdentifier	 height Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Scale an image. * @param image the image to scale. * @return the scaled image. */	TokenNameCOMMENT_JAVADOC	 Scale an image. @param image the image to scale. @return the scaled image. 
public	TokenNamepublic	
PlanarImage	TokenNameIdentifier	 Planar Image
performScale	TokenNameIdentifier	 perform Scale
(	TokenNameLPAREN	
PlanarImage	TokenNameIdentifier	 Planar Image
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
float	TokenNamefloat	
xFl	TokenNameIdentifier	 x Fl
=	TokenNameEQUAL	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
yFl	TokenNameIdentifier	 y Fl
=	TokenNameEQUAL	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
xPercent	TokenNameIdentifier	 x Percent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xFl	TokenNameIdentifier	 x Fl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
xFl	TokenNameIdentifier	 x Fl
/	TokenNameDIVIDE	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
yPercent	TokenNameIdentifier	 y Percent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yFl	TokenNameIdentifier	 y Fl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
yFl	TokenNameIdentifier	 y Fl
/	TokenNameDIVIDE	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"width"	TokenNameStringLiteral	width
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
proportions	TokenNameIdentifier	 proportions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yFl	TokenNameIdentifier	 y Fl
=	TokenNameEQUAL	
xFl	TokenNameIdentifier	 x Fl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"height"	TokenNameStringLiteral	height
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
proportions	TokenNameIdentifier	 proportions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xFl	TokenNameIdentifier	 x Fl
=	TokenNameEQUAL	
yFl	TokenNameIdentifier	 y Fl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"fit"	TokenNameStringLiteral	fit
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
proportions	TokenNameIdentifier	 proportions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yFl	TokenNameIdentifier	 y Fl
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
xFl	TokenNameIdentifier	 x Fl
,	TokenNameCOMMA	
yFl	TokenNameIdentifier	 y Fl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xFl	TokenNameIdentifier	 x Fl
=	TokenNameEQUAL	
yFl	TokenNameIdentifier	 y Fl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"cover"	TokenNameStringLiteral	cover
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
proportions	TokenNameIdentifier	 proportions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yFl	TokenNameIdentifier	 y Fl
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
xFl	TokenNameIdentifier	 x Fl
,	TokenNameCOMMA	
yFl	TokenNameIdentifier	 y Fl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xFl	TokenNameIdentifier	 x Fl
=	TokenNameEQUAL	
yFl	TokenNameIdentifier	 y Fl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
xFl	TokenNameIdentifier	 x Fl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
yFl	TokenNameIdentifier	 y Fl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
" Scaling to "	TokenNameStringLiteral	 Scaling to 
+	TokenNamePLUS	
(	TokenNameLPAREN	
xFl	TokenNameIdentifier	 x Fl
*	TokenNameMULTIPLY	
HUNDRED	TokenNameIdentifier	 HUNDRED
)	TokenNameRPAREN	
+	TokenNamePLUS	
"% x "	TokenNameStringLiteral	% x 
+	TokenNamePLUS	
(	TokenNameLPAREN	
yFl	TokenNameIdentifier	 y Fl
*	TokenNameMULTIPLY	
HUNDRED	TokenNameIdentifier	 HUNDRED
)	TokenNameRPAREN	
+	TokenNamePLUS	
"%"	TokenNameStringLiteral	%
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
JAI	TokenNameIdentifier	 JAI
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
"scale"	TokenNameStringLiteral	scale
,	TokenNameCOMMA	
pb	TokenNameIdentifier	 pb
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
return	TokenNamereturn	
performScale	TokenNameIdentifier	 perform Scale
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
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
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getAsBufferedImage	TokenNameIdentifier	 get As Buffered Image
(	TokenNameLPAREN	
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
return	TokenNamereturn	
performScale	TokenNameIdentifier	 perform Scale
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
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
PlanarImage	TokenNameIdentifier	 Planar Image
image	TokenNameIdentifier	 image
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// If this TransformOperation has DrawOperation children 	TokenNameCOMMENT_LINE	If this TransformOperation has DrawOperation children 
// then Rotate the first child and return. 	TokenNameCOMMENT_LINE	then Rotate the first child and return. 
performScale	TokenNameIdentifier	 perform Scale
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
