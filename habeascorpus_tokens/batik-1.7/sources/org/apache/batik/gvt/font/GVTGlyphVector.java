/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
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
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
FontRenderContext	TokenNameIdentifier	 Font Render Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GlyphJustificationInfo	TokenNameIdentifier	 Glyph Justification Info
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
Point2D	TokenNameIdentifier	 Point2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
;	TokenNameSEMICOLON	
/** * An interface for all GVT GlyphVector classes. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: GVTGlyphVector.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An interface for all GVT GlyphVector classes. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: GVTGlyphVector.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
{	TokenNameLBRACE	
/** * Returns the Font associated with this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the Font associated with this GlyphVector. 
GVTFont	TokenNameIdentifier	 GVT Font
getFont	TokenNameIdentifier	 get Font
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the FontRenderContext associated with this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the FontRenderContext associated with this GlyphVector. 
FontRenderContext	TokenNameIdentifier	 Font Render Context
getFontRenderContext	TokenNameIdentifier	 get Font Render Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the glyphcode of the specified glyph. */	TokenNameCOMMENT_JAVADOC	 Returns the glyphcode of the specified glyph. 
int	TokenNameint	
getGlyphCode	TokenNameIdentifier	 get Glyph Code
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns an array of glyphcodes for the specified glyphs. */	TokenNameCOMMENT_JAVADOC	 Returns an array of glyphcodes for the specified glyphs. 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getGlyphCodes	TokenNameIdentifier	 get Glyph Codes
(	TokenNameLPAREN	
int	TokenNameint	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
,	TokenNameCOMMA	
int	TokenNameint	
numEntries	TokenNameIdentifier	 num Entries
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
codeReturn	TokenNameIdentifier	 code Return
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the justification information for the glyph at the specified * index into this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the justification information for the glyph at the specified index into this GlyphVector. 
GlyphJustificationInfo	TokenNameIdentifier	 Glyph Justification Info
getGlyphJustificationInfo	TokenNameIdentifier	 get Glyph Justification Info
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the logical bounds of the specified glyph within this * GlyphVector. This is a good bound for hit detection and * highlighting it is not tight in any sense, and in some (rare) * cases may exclude parts of the glyph. */	TokenNameCOMMENT_JAVADOC	 Returns the logical bounds of the specified glyph within this GlyphVector. This is a good bound for hit detection and highlighting it is not tight in any sense, and in some (rare) cases may exclude parts of the glyph. 
Shape	TokenNameIdentifier	 Shape
getGlyphLogicalBounds	TokenNameIdentifier	 get Glyph Logical Bounds
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the metrics of the glyph at the specified index into this * GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the metrics of the glyph at the specified index into this GlyphVector. 
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a Shape whose interior corresponds to the visual representation * of the specified glyph within this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns a Shape whose interior corresponds to the visual representation of the specified glyph within this GlyphVector. 
Shape	TokenNameIdentifier	 Shape
getGlyphOutline	TokenNameIdentifier	 get Glyph Outline
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the bounding box of the specified glyph, considering only the * glyph's metrics (ascent, descent, advance) rather than the actual glyph * shape. */	TokenNameCOMMENT_JAVADOC	 Returns the bounding box of the specified glyph, considering only the glyph's metrics (ascent, descent, advance) rather than the actual glyph shape. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGlyphCellBounds	TokenNameIdentifier	 get Glyph Cell Bounds
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the position of the specified glyph within this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the position of the specified glyph within this GlyphVector. 
Point2D	TokenNameIdentifier	 Point2 D
getGlyphPosition	TokenNameIdentifier	 get Glyph Position
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns an array of glyph positions for the specified glyphs */	TokenNameCOMMENT_JAVADOC	 Returns an array of glyph positions for the specified glyphs 
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getGlyphPositions	TokenNameIdentifier	 get Glyph Positions
(	TokenNameLPAREN	
int	TokenNameint	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
,	TokenNameCOMMA	
int	TokenNameint	
numEntries	TokenNameIdentifier	 num Entries
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positionReturn	TokenNameIdentifier	 position Return
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the transform of the specified glyph within this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Gets the transform of the specified glyph within this GlyphVector. 
AffineTransform	TokenNameIdentifier	 Affine Transform
getGlyphTransform	TokenNameIdentifier	 get Glyph Transform
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the visual bounds of the specified glyph within the GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the visual bounds of the specified glyph within the GlyphVector. 
Shape	TokenNameIdentifier	 Shape
getGlyphVisualBounds	TokenNameIdentifier	 get Glyph Visual Bounds
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the logical bounds of this GlyphVector. This is a * good bound for hit detection and highlighting it is not tight * in any sense, and in some (rare) cases may exclude parts of * the glyph. */	TokenNameCOMMENT_JAVADOC	 Returns the logical bounds of this GlyphVector. This is a good bound for hit detection and highlighting it is not tight in any sense, and in some (rare) cases may exclude parts of the glyph. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getLogicalBounds	TokenNameIdentifier	 get Logical Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the number of glyphs in this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the number of glyphs in this GlyphVector. 
int	TokenNameint	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a Shape whose interior corresponds to the visual representation * of this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns a Shape whose interior corresponds to the visual representation of this GlyphVector. 
Shape	TokenNameIdentifier	 Shape
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a Shape whose interior corresponds to the visual representation * of this GlyphVector, offset to x, y. */	TokenNameCOMMENT_JAVADOC	 Returns a Shape whose interior corresponds to the visual representation of this GlyphVector, offset to x, y. 
Shape	TokenNameIdentifier	 Shape
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the visual bounds of this GlyphVector The visual bounds is the * tightest rectangle enclosing all non-background pixels in the rendered * representation of this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the visual bounds of this GlyphVector The visual bounds is the tightest rectangle enclosing all non-background pixels in the rendered representation of this GlyphVector. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGeometricBounds	TokenNameIdentifier	 get Geometric Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a tight bounds on the GylphVector including stroking. * @param aci Required to get painting attributes of glyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns a tight bounds on the GylphVector including stroking. @param aci Required to get painting attributes of glyphVector. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Assigns default positions to each glyph in this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Assigns default positions to each glyph in this GlyphVector. 
void	TokenNamevoid	
performDefaultLayout	TokenNameIdentifier	 perform Default Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the position of the specified glyph within this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Sets the position of the specified glyph within this GlyphVector. 
void	TokenNamevoid	
setGlyphPosition	TokenNameIdentifier	 set Glyph Position
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
newPos	TokenNameIdentifier	 new Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the transform of the specified glyph within this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Sets the transform of the specified glyph within this GlyphVector. 
void	TokenNamevoid	
setGlyphTransform	TokenNameIdentifier	 set Glyph Transform
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
newTX	TokenNameIdentifier	 new TX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tells the glyph vector whether or not to draw the specified glyph. */	TokenNameCOMMENT_JAVADOC	 Tells the glyph vector whether or not to draw the specified glyph. 
void	TokenNamevoid	
setGlyphVisible	TokenNameIdentifier	 set Glyph Visible
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
visible	TokenNameIdentifier	 visible
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if specified glyph will be drawn. */	TokenNameCOMMENT_JAVADOC	 Returns true if specified glyph will be drawn. 
boolean	TokenNameboolean	
isGlyphVisible	TokenNameIdentifier	 is Glyph Visible
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the number of chars represented by the glyphs within the * specified range. * * @param startGlyphIndex The index of the first glyph in the range. * @param endGlyphIndex The index of the last glyph in the range. * @return The number of chars. */	TokenNameCOMMENT_JAVADOC	 Returns the number of chars represented by the glyphs within the specified range. * @param startGlyphIndex The index of the first glyph in the range. @param endGlyphIndex The index of the last glyph in the range. @return The number of chars. 
int	TokenNameint	
getCharacterCount	TokenNameIdentifier	 get Character Count
(	TokenNameLPAREN	
int	TokenNameint	
startGlyphIndex	TokenNameIdentifier	 start Glyph Index
,	TokenNameCOMMA	
int	TokenNameint	
endGlyphIndex	TokenNameIdentifier	 end Glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Draws the glyph vector. */	TokenNameCOMMENT_JAVADOC	 Draws the glyph vector. 
void	TokenNamevoid	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
graphics2D	TokenNameIdentifier	 graphics2 D
,	TokenNameCOMMA	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
