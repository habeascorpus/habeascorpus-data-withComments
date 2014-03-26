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
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GlyphVector	TokenNameIdentifier	 Glyph Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
AffineTransform	TokenNameIdentifier	 Affine Transform
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
GeneralPath	TokenNameIdentifier	 General Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Point2D	TokenNameIdentifier	 Point2 D
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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
PathLength	TokenNameIdentifier	 Path Length
;	TokenNameSEMICOLON	
/** * PathLayout can layout text along a Shape, usually a Path object. * <p> * There are a number of improvements that could be made to this class. * I'll try to list some of them: * <ul> * <li> The layout should really only modify the GlyphVector, rather * than converting to a Shape. * <li> Maybe the functions should take a AttributedCharacterIterator * or something? Should this class do the entire layout? * <li> The layout code works, but it's definitely not perfect. * </ul> * @author <a href="mailto:dean.jackson@cmis.csiro.au">Dean Jackson</a> * @version $Id: TextPathLayout.java 522271 2007-03-25 14:42:45Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 PathLayout can layout text along a Shape, usually a Path object. <p> There are a number of improvements that could be made to this class. I'll try to list some of them: <ul> <li> The layout should really only modify the GlyphVector, rather than converting to a Shape. <li> Maybe the functions should take a AttributedCharacterIterator or something? Should this class do the entire layout? <li> The layout code works, but it's definitely not perfect. </ul> @author <a href="mailto:dean.jackson@cmis.csiro.au">Dean Jackson</a> @version $Id: TextPathLayout.java 522271 2007-03-25 14:42:45Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TextPathLayout	TokenNameIdentifier	 Text Path Layout
{	TokenNameLBRACE	
/** * Align the text at the start of the path. */	TokenNameCOMMENT_JAVADOC	 Align the text at the start of the path. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ALIGN_START	TokenNameIdentifier	 ALIGN  START
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Align the text at the middle of the path. */	TokenNameCOMMENT_JAVADOC	 Align the text at the middle of the path. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ALIGN_MIDDLE	TokenNameIdentifier	 ALIGN  MIDDLE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Align the text at the end of the path. */	TokenNameCOMMENT_JAVADOC	 Align the text at the end of the path. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ALIGN_END	TokenNameIdentifier	 ALIGN  END
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Use the spacing between the glyphs to adjust for textLength. */	TokenNameCOMMENT_JAVADOC	 Use the spacing between the glyphs to adjust for textLength. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ADJUST_SPACING	TokenNameIdentifier	 ADJUST  SPACING
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Use the entire glyph to adjust for textLength. */	TokenNameCOMMENT_JAVADOC	 Use the entire glyph to adjust for textLength. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ADJUST_GLYPHS	TokenNameIdentifier	 ADJUST  GLYPHS
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Wraps the GlyphVector around the given path. The results * are mostly quite nice but you need to be careful choosing * the size of the font that created the GlyphVector, as * well as the "curvyness" of the path (really dynamic curves * don't look so great, abrupt changes/vertices look worse). * * @param glyphs The GlyphVector to layout. * @param path The path (or shape) to wrap around * @param align The text alignment to use. Should be one * of ALIGN_START, ALIGN_MIDDLE or ALIGN_END. * @param startOffset The offset from the start of the path for the initial * text position. * @param textLength The length that the text should fill. * @param lengthAdjustMode The method used to expand or contract * the text to meet the textLength. * @return A shape that is the outline of the glyph vector * wrapped along the path */	TokenNameCOMMENT_JAVADOC	 Wraps the GlyphVector around the given path. The results are mostly quite nice but you need to be careful choosing the size of the font that created the GlyphVector, as well as the "curvyness" of the path (really dynamic curves don't look so great, abrupt changes/vertices look worse). * @param glyphs The GlyphVector to layout. @param path The path (or shape) to wrap around @param align The text alignment to use. Should be one of ALIGN_START, ALIGN_MIDDLE or ALIGN_END. @param startOffset The offset from the start of the path for the initial text position. @param textLength The length that the text should fill. @param lengthAdjustMode The method used to expand or contract the text to meet the textLength. @return A shape that is the outline of the glyph vector wrapped along the path 
public	TokenNamepublic	
static	TokenNamestatic	
Shape	TokenNameIdentifier	 Shape
layoutGlyphVector	TokenNameIdentifier	 layout Glyph Vector
(	TokenNameLPAREN	
GlyphVector	TokenNameIdentifier	 Glyph Vector
glyphs	TokenNameIdentifier	 glyphs
,	TokenNameCOMMA	
Shape	TokenNameIdentifier	 Shape
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
int	TokenNameint	
align	TokenNameIdentifier	 align
,	TokenNameCOMMA	
float	TokenNamefloat	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
float	TokenNamefloat	
textLength	TokenNameIdentifier	 text Length
,	TokenNameCOMMA	
int	TokenNameint	
lengthAdjustMode	TokenNameIdentifier	 length Adjust Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GeneralPath	TokenNameIdentifier	 General Path
newPath	TokenNameIdentifier	 new Path
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PathLength	TokenNameIdentifier	 Path Length
pl	TokenNameIdentifier	 pl
=	TokenNameEQUAL	
new	TokenNamenew	
PathLength	TokenNameIdentifier	 Path Length
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
pathLength	TokenNameIdentifier	 path Length
=	TokenNameEQUAL	
pl	TokenNameIdentifier	 pl
.	TokenNameDOT	
lengthOfPath	TokenNameIdentifier	 length Of Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newPath	TokenNameIdentifier	 new Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
glyphsLength	TokenNameIdentifier	 glyphs Length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
getVisualBounds	TokenNameIdentifier	 get Visual Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return from the ugly cases 	TokenNameCOMMENT_LINE	return from the ugly cases 
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
pl	TokenNameIdentifier	 pl
.	TokenNameDOT	
lengthOfPath	TokenNameIdentifier	 length Of Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0f	TokenNameFloatingPointLiteral	
||	TokenNameOR_OR	
glyphsLength	TokenNameIdentifier	 glyphs Length
==	TokenNameEQUAL_EQUAL	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newPath	TokenNameIdentifier	 new Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// work out the expansion/contraction per character 	TokenNameCOMMENT_LINE	work out the expansion/contraction per character 
float	TokenNamefloat	
lengthRatio	TokenNameIdentifier	 length Ratio
=	TokenNameEQUAL	
textLength	TokenNameIdentifier	 text Length
/	TokenNameDIVIDE	
glyphsLength	TokenNameIdentifier	 glyphs Length
;	TokenNameSEMICOLON	
// the current start point of the character on the path 	TokenNameCOMMENT_LINE	the current start point of the character on the path 
float	TokenNamefloat	
currentPosition	TokenNameIdentifier	 current Position
=	TokenNameEQUAL	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
// if align is START then a currentPosition of 0f 	TokenNameCOMMENT_LINE	if align is START then a currentPosition of 0f 
// is correct. 	TokenNameCOMMENT_LINE	is correct. 
// if align is END then the currentPosition should 	TokenNameCOMMENT_LINE	if align is END then the currentPosition should 
// be enough to place the last character on the end 	TokenNameCOMMENT_LINE	be enough to place the last character on the end 
// of the path 	TokenNameCOMMENT_LINE	of the path 
// if align is MIDDLE then the currentPosition should 	TokenNameCOMMENT_LINE	if align is MIDDLE then the currentPosition should 
// be enough to center the glyphs on the path 	TokenNameCOMMENT_LINE	be enough to center the glyphs on the path 
if	TokenNameif	
(	TokenNameLPAREN	
align	TokenNameIdentifier	 align
==	TokenNameEQUAL_EQUAL	
ALIGN_END	TokenNameIdentifier	 ALIGN  END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentPosition	TokenNameIdentifier	 current Position
+=	TokenNamePLUS_EQUAL	
pathLength	TokenNameIdentifier	 path Length
-	TokenNameMINUS	
textLength	TokenNameIdentifier	 text Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
align	TokenNameIdentifier	 align
==	TokenNameEQUAL_EQUAL	
ALIGN_MIDDLE	TokenNameIdentifier	 ALIGN  MIDDLE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentPosition	TokenNameIdentifier	 current Position
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
pathLength	TokenNameIdentifier	 path Length
-	TokenNameMINUS	
textLength	TokenNameIdentifier	 text Length
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// iterate through the GlyphVector placing each glyph 	TokenNameCOMMENT_LINE	iterate through the GlyphVector placing each glyph 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
gm	TokenNameIdentifier	 gm
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
charAdvance	TokenNameIdentifier	 char Advance
=	TokenNameEQUAL	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
getAdvance	TokenNameIdentifier	 get Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Shape	TokenNameIdentifier	 Shape
glyph	TokenNameIdentifier	 glyph
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
getGlyphOutline	TokenNameIdentifier	 get Glyph Outline
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if lengthAdjust was GLYPHS, then scale the glyph 	TokenNameCOMMENT_LINE	if lengthAdjust was GLYPHS, then scale the glyph 
// by the lengthRatio in the X direction 	TokenNameCOMMENT_LINE	by the lengthRatio in the X direction 
// FIXME: for vertical text this will be the Y direction 	TokenNameCOMMENT_LINE	FIXME: for vertical text this will be the Y direction 
if	TokenNameif	
(	TokenNameLPAREN	
lengthAdjustMode	TokenNameIdentifier	 length Adjust Mode
==	TokenNameEQUAL_EQUAL	
ADJUST_GLYPHS	TokenNameIdentifier	 ADJUST  GLYPHS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getScaleInstance	TokenNameIdentifier	 get Scale Instance
(	TokenNameLPAREN	
lengthRatio	TokenNameIdentifier	 length Ratio
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyph	TokenNameIdentifier	 glyph
=	TokenNameEQUAL	
scale	TokenNameIdentifier	 scale
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
glyph	TokenNameIdentifier	 glyph
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// charAdvance has to scale accordingly 	TokenNameCOMMENT_LINE	charAdvance has to scale accordingly 
charAdvance	TokenNameIdentifier	 char Advance
*=	TokenNameMULTIPLY_EQUAL	
lengthRatio	TokenNameIdentifier	 length Ratio
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
glyphWidth	TokenNameIdentifier	 glyph Width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
glyph	TokenNameIdentifier	 glyph
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use either of these to calculate the mid point 	TokenNameCOMMENT_LINE	Use either of these to calculate the mid point 
// of the character along the path. 	TokenNameCOMMENT_LINE	of the character along the path. 
// If you change this, you must also change the 	TokenNameCOMMENT_LINE	If you change this, you must also change the 
// transform on the glyph down below 	TokenNameCOMMENT_LINE	transform on the glyph down below 
// In some case this gives better layout, but 	TokenNameCOMMENT_LINE	In some case this gives better layout, but 
// the way it is at the moment is a closer match 	TokenNameCOMMENT_LINE	the way it is at the moment is a closer match 
// to the textPath layout from the SVG spec 	TokenNameCOMMENT_LINE	to the textPath layout from the SVG spec 
//float charMidPos = currentPosition + charAdvance / 2f; 	TokenNameCOMMENT_LINE	float charMidPos = currentPosition + charAdvance / 2f; 
float	TokenNamefloat	
charMidPos	TokenNameIdentifier	 char Mid Pos
=	TokenNameEQUAL	
currentPosition	TokenNameIdentifier	 current Position
+	TokenNamePLUS	
glyphWidth	TokenNameIdentifier	 glyph Width
/	TokenNameDIVIDE	
2f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// Calculate the actual point to place the glyph around 	TokenNameCOMMENT_LINE	Calculate the actual point to place the glyph around 
Point2D	TokenNameIdentifier	 Point2 D
charMidPoint	TokenNameIdentifier	 char Mid Point
=	TokenNameEQUAL	
pl	TokenNameIdentifier	 pl
.	TokenNameDOT	
pointAtLength	TokenNameIdentifier	 point At Length
(	TokenNameLPAREN	
charMidPos	TokenNameIdentifier	 char Mid Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if the glyph is actually on the path 	TokenNameCOMMENT_LINE	Check if the glyph is actually on the path 
if	TokenNameif	
(	TokenNameLPAREN	
charMidPoint	TokenNameIdentifier	 char Mid Point
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Calculate the normal to the path (midline of glyph) 	TokenNameCOMMENT_LINE	Calculate the normal to the path (midline of glyph) 
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
=	TokenNameEQUAL	
pl	TokenNameIdentifier	 pl
.	TokenNameDOT	
angleAtLength	TokenNameIdentifier	 angle At Length
(	TokenNameLPAREN	
charMidPos	TokenNameIdentifier	 char Mid Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Define the transform of the glyph 	TokenNameCOMMENT_LINE	Define the transform of the glyph 
AffineTransform	TokenNameIdentifier	 Affine Transform
glyphTrans	TokenNameIdentifier	 glyph Trans
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// translate to the point on the path 	TokenNameCOMMENT_LINE	translate to the point on the path 
glyphTrans	TokenNameIdentifier	 glyph Trans
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
charMidPoint	TokenNameIdentifier	 char Mid Point
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
charMidPoint	TokenNameIdentifier	 char Mid Point
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// rotate midline of glyph to be normal to path 	TokenNameCOMMENT_LINE	rotate midline of glyph to be normal to path 
glyphTrans	TokenNameIdentifier	 glyph Trans
.	TokenNameDOT	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// translate glyph backwards so we rotate about the 	TokenNameCOMMENT_LINE	translate glyph backwards so we rotate about the 
// center of the glyph 	TokenNameCOMMENT_LINE	center of the glyph 
// Choose one of these translations - see the comments 	TokenNameCOMMENT_LINE	Choose one of these translations - see the comments 
// in the charMidPos calculation above 	TokenNameCOMMENT_LINE	in the charMidPos calculation above 
glyphTrans	TokenNameIdentifier	 glyph Trans
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
charAdvance	TokenNameIdentifier	 char Advance
/	TokenNameDIVIDE	
-	TokenNameMINUS	
2f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//glyphTrans.translate(glyphWidth / -2f, 0f); 	TokenNameCOMMENT_LINE	glyphTrans.translate(glyphWidth / -2f, 0f); 
glyph	TokenNameIdentifier	 glyph
=	TokenNameEQUAL	
glyphTrans	TokenNameIdentifier	 glyph Trans
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
glyph	TokenNameIdentifier	 glyph
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newPath	TokenNameIdentifier	 new Path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
glyph	TokenNameIdentifier	 glyph
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// move along by the advance value 	TokenNameCOMMENT_LINE	move along by the advance value 
// if the lengthAdjustMode was SPACING then 	TokenNameCOMMENT_LINE	if the lengthAdjustMode was SPACING then 
// we have to take this into account here 	TokenNameCOMMENT_LINE	we have to take this into account here 
if	TokenNameif	
(	TokenNameLPAREN	
lengthAdjustMode	TokenNameIdentifier	 length Adjust Mode
==	TokenNameEQUAL_EQUAL	
ADJUST_SPACING	TokenNameIdentifier	 ADJUST  SPACING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentPosition	TokenNameIdentifier	 current Position
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
charAdvance	TokenNameIdentifier	 char Advance
*	TokenNameMULTIPLY	
lengthRatio	TokenNameIdentifier	 length Ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currentPosition	TokenNameIdentifier	 current Position
+=	TokenNamePLUS_EQUAL	
charAdvance	TokenNameIdentifier	 char Advance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
newPath	TokenNameIdentifier	 new Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wraps the GlyphVector around the given path. * * @param glyphs The GlyphVector to layout. * @param path The path (or shape) to wrap around * @param align The text alignment to use. Should be one * of ALIGN_START, ALIGN_MIDDLE or ALIGN_END. * @return A shape that is the outline of the glyph vector * wrapped along the path */	TokenNameCOMMENT_JAVADOC	 Wraps the GlyphVector around the given path. * @param glyphs The GlyphVector to layout. @param path The path (or shape) to wrap around @param align The text alignment to use. Should be one of ALIGN_START, ALIGN_MIDDLE or ALIGN_END. @return A shape that is the outline of the glyph vector wrapped along the path 
public	TokenNamepublic	
static	TokenNamestatic	
Shape	TokenNameIdentifier	 Shape
layoutGlyphVector	TokenNameIdentifier	 layout Glyph Vector
(	TokenNameLPAREN	
GlyphVector	TokenNameIdentifier	 Glyph Vector
glyphs	TokenNameIdentifier	 glyphs
,	TokenNameCOMMA	
Shape	TokenNameIdentifier	 Shape
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
int	TokenNameint	
align	TokenNameIdentifier	 align
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
layoutGlyphVector	TokenNameIdentifier	 layout Glyph Vector
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
align	TokenNameIdentifier	 align
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
getVisualBounds	TokenNameIdentifier	 get Visual Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ADJUST_SPACING	TokenNameIdentifier	 ADJUST  SPACING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wraps the GlyphVector around the given path. * * @param glyphs The GlyphVector to layout. * @param path The path (or shape) to wrap around * @return A shape that is the outline of the glyph vector * wrapped along the path */	TokenNameCOMMENT_JAVADOC	 Wraps the GlyphVector around the given path. * @param glyphs The GlyphVector to layout. @param path The path (or shape) to wrap around @return A shape that is the outline of the glyph vector wrapped along the path 
public	TokenNamepublic	
static	TokenNamestatic	
Shape	TokenNameIdentifier	 Shape
layoutGlyphVector	TokenNameIdentifier	 layout Glyph Vector
(	TokenNameLPAREN	
GlyphVector	TokenNameIdentifier	 Glyph Vector
glyphs	TokenNameIdentifier	 glyphs
,	TokenNameCOMMA	
Shape	TokenNameIdentifier	 Shape
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
layoutGlyphVector	TokenNameIdentifier	 layout Glyph Vector
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
ALIGN_START	TokenNameIdentifier	 ALIGN  START
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// TextPathLayout 	TokenNameCOMMENT_LINE	TextPathLayout 
