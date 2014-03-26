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
text	TokenNameIdentifier	 text
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
;	TokenNameSEMICOLON	
/** * Class that performs layout of attributed text strings into * glyph sets paintable by TextPainter instances. * Similar to java.awt.font.TextLayout in function and purpose. * Note that while this utility interface is provided for the convenience of * <tt>TextPainter</tt> implementations, conforming <tt>TextPainter</tt>s * are not required to use this class. * @see java.awt.font.TextLayout * @see org.apache.batik.gvt.TextPainter * * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> * @version $Id: TextSpanLayout.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Class that performs layout of attributed text strings into glyph sets paintable by TextPainter instances. Similar to java.awt.font.TextLayout in function and purpose. Note that while this utility interface is provided for the convenience of <tt>TextPainter</tt> implementations, conforming <tt>TextPainter</tt>s are not required to use this class. @see java.awt.font.TextLayout @see org.apache.batik.gvt.TextPainter * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> @version $Id: TextSpanLayout.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
TextSpanLayout	TokenNameIdentifier	 Text Span Layout
{	TokenNameLBRACE	
int	TokenNameint	
DECORATION_UNDERLINE	TokenNameIdentifier	 DECORATION  UNDERLINE
=	TokenNameEQUAL	
0x1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
DECORATION_STRIKETHROUGH	TokenNameIdentifier	 DECORATION  STRIKETHROUGH
=	TokenNameEQUAL	
0x2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
DECORATION_OVERLINE	TokenNameIdentifier	 DECORATION  OVERLINE
=	TokenNameEQUAL	
0x4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
DECORATION_ALL	TokenNameIdentifier	 DECORATION  ALL
=	TokenNameEQUAL	
DECORATION_UNDERLINE	TokenNameIdentifier	 DECORATION  UNDERLINE
|	TokenNameOR	
DECORATION_OVERLINE	TokenNameIdentifier	 DECORATION  OVERLINE
|	TokenNameOR	
DECORATION_STRIKETHROUGH	TokenNameIdentifier	 DECORATION  STRIKETHROUGH
;	TokenNameSEMICOLON	
/** * Paints the specified text layout using the * specified Graphics2D and rendering context. * @param g2d the Graphics2D to use */	TokenNameCOMMENT_JAVADOC	 Paints the specified text layout using the specified Graphics2D and rendering context. @param g2d the Graphics2D to use 
void	TokenNamevoid	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the outline of the specified decorations on the glyphs, * transformed by an AffineTransform. * @param decorationType an integer indicating the type(s) of decorations * included in this shape. May be the result of "OR-ing" several * values together: * e.g. <tt>DECORATION_UNDERLINE | DECORATION_STRIKETHROUGH</tt> */	TokenNameCOMMENT_JAVADOC	 Returns the outline of the specified decorations on the glyphs, transformed by an AffineTransform. @param decorationType an integer indicating the type(s) of decorations included in this shape. May be the result of "OR-ing" several values together: e.g. <tt>DECORATION_UNDERLINE | DECORATION_STRIKETHROUGH</tt> 
Shape	TokenNameIdentifier	 Shape
getDecorationOutline	TokenNameIdentifier	 get Decoration Outline
(	TokenNameLPAREN	
int	TokenNameint	
decorationType	TokenNameIdentifier	 decoration Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the rectangular bounds of the completed glyph layout. * This includes stroking information, this does not include * deocrations. */	TokenNameCOMMENT_JAVADOC	 Returns the rectangular bounds of the completed glyph layout. This includes stroking information, this does not include deocrations. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the bounds of the geometry (this is always the bounds * of the outline). */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the geometry (this is always the bounds of the outline). 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGeometricBounds	TokenNameIdentifier	 get Geometric Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the outline of the completed glyph layout, transformed * by an AffineTransform. */	TokenNameCOMMENT_JAVADOC	 Returns the outline of the completed glyph layout, transformed by an AffineTransform. 
Shape	TokenNameIdentifier	 Shape
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the current text position at the completion * of glyph layout. * (This is the position that should be used for positioning * adjacent layouts.) */	TokenNameCOMMENT_JAVADOC	 Returns the current text position at the completion of glyph layout. (This is the position that should be used for positioning adjacent layouts.) 
Point2D	TokenNameIdentifier	 Point2 D
getAdvance2D	TokenNameIdentifier	 get Advance2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the advance between each glyph in text progression direction. */	TokenNameCOMMENT_JAVADOC	 Returns the advance between each glyph in text progression direction. 
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getGlyphAdvances	TokenNameIdentifier	 get Glyph Advances
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the Metrics for a particular glyph. */	TokenNameCOMMENT_JAVADOC	 Returns the Metrics for a particular glyph. 
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the Line metrics for this text span. */	TokenNameCOMMENT_JAVADOC	 Returns the Line metrics for this text span. 
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
getLineMetrics	TokenNameIdentifier	 get Line Metrics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
getTextPathAdvance	TokenNameIdentifier	 get Text Path Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the current text position at the completion beginning * of glyph layout, before the application of explicit * glyph positioning attributes. */	TokenNameCOMMENT_JAVADOC	 Returns the current text position at the completion beginning of glyph layout, before the application of explicit glyph positioning attributes. 
Point2D	TokenNameIdentifier	 Point2 D
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the scaling factor to use for string. if ajdSpacing is * true then only the spacing between glyphs will be adjusted * otherwise the glyphs and the spaces between them will be * adjusted. * @param xScale Scale factor to apply in X direction. * @param yScale Scale factor to apply in Y direction. * @param adjSpacing True if only spaces should be adjusted. */	TokenNameCOMMENT_JAVADOC	 Sets the scaling factor to use for string. if ajdSpacing is true then only the spacing between glyphs will be adjusted otherwise the glyphs and the spaces between them will be adjusted. @param xScale Scale factor to apply in X direction. @param yScale Scale factor to apply in Y direction. @param adjSpacing True if only spaces should be adjusted. 
void	TokenNamevoid	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
float	TokenNamefloat	
xScale	TokenNameIdentifier	 x Scale
,	TokenNameCOMMA	
float	TokenNamefloat	
yScale	TokenNameIdentifier	 y Scale
,	TokenNameCOMMA	
boolean	TokenNameboolean	
adjSpacing	TokenNameIdentifier	 adj Spacing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the text position used for the implicit origin * of glyph layout. Ignored if multiple explicit glyph * positioning attributes are present in ACI * (e.g. if the aci has multiple X or Y values). */	TokenNameCOMMENT_JAVADOC	 Sets the text position used for the implicit origin of glyph layout. Ignored if multiple explicit glyph positioning attributes are present in ACI (e.g. if the aci has multiple X or Y values). 
void	TokenNamevoid	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a Shape which encloses the currently selected glyphs * as specified by glyph indices <tt>begin</tt> and <tt>end</tt>. * @param beginCharIndex the index of the first glyph in the contiguous * selection. * @param endCharIndex the index of the last glyph in the contiguous * selection. */	TokenNameCOMMENT_JAVADOC	 Returns a Shape which encloses the currently selected glyphs as specified by glyph indices <tt>begin</tt> and <tt>end</tt>. @param beginCharIndex the index of the first glyph in the contiguous selection. @param endCharIndex the index of the last glyph in the contiguous selection. 
Shape	TokenNameIdentifier	 Shape
getHighlightShape	TokenNameIdentifier	 get Highlight Shape
(	TokenNameLPAREN	
int	TokenNameint	
beginCharIndex	TokenNameIdentifier	 begin Char Index
,	TokenNameCOMMA	
int	TokenNameint	
endCharIndex	TokenNameIdentifier	 end Char Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Perform hit testing for coordinate at x, y. * @return a TextHit object encapsulating the character index for * successful hits and whether the hit is on the character * leading edge. * @param x the x coordinate of the point to be tested. * @param y the y coordinate of the point to be tested. */	TokenNameCOMMENT_JAVADOC	 Perform hit testing for coordinate at x, y. @return a TextHit object encapsulating the character index for successful hits and whether the hit is on the character leading edge. @param x the x coordinate of the point to be tested. @param y the y coordinate of the point to be tested. 
TextHit	TokenNameIdentifier	 Text Hit
hitTestChar	TokenNameIdentifier	 hit Test Char
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the advance direction of this text is vertical. */	TokenNameCOMMENT_JAVADOC	 Returns true if the advance direction of this text is vertical. 
boolean	TokenNameboolean	
isVertical	TokenNameIdentifier	 is Vertical
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if this layout in on a text path. */	TokenNameCOMMENT_JAVADOC	 Returns true if this layout in on a text path. 
boolean	TokenNameboolean	
isOnATextPath	TokenNameIdentifier	 is On A Text Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the number of glyphs in this layout. */	TokenNameCOMMENT_JAVADOC	 Returns the number of glyphs in this layout. 
int	TokenNameint	
getGlyphCount	TokenNameIdentifier	 get Glyph Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the number of chars represented by the glyphs within the * specified range. * @param startGlyphIndex The index of the first glyph in the range. * @param endGlyphIndex The index of the last glyph in the range. * @return The number of chars. */	TokenNameCOMMENT_JAVADOC	 Returns the number of chars represented by the glyphs within the specified range. @param startGlyphIndex The index of the first glyph in the range. @param endGlyphIndex The index of the last glyph in the range. @return The number of chars. 
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
/** * Returns the glyph index of the glyph that has the specified char index. * * @param charIndex The original index of the character in the text node's * text string. * @return The index of the matching glyph in this layout's glyph vector, * or -1 if a matching glyph could not be found. */	TokenNameCOMMENT_JAVADOC	 Returns the glyph index of the glyph that has the specified char index. * @param charIndex The original index of the character in the text node's text string. @return The index of the matching glyph in this layout's glyph vector, or -1 if a matching glyph could not be found. 
int	TokenNameint	
getGlyphIndex	TokenNameIdentifier	 get Glyph Index
(	TokenNameLPAREN	
int	TokenNameint	
charIndex	TokenNameIdentifier	 char Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the text direction in this layout is from left to right. */	TokenNameCOMMENT_JAVADOC	 Returns true if the text direction in this layout is from left to right. 
boolean	TokenNameboolean	
isLeftToRight	TokenNameIdentifier	 is Left To Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return true is the character index is represented by glyphs * in this layout. * * @param index index of the character in the ACI. * @return true if the layout represents that character. */	TokenNameCOMMENT_JAVADOC	 Return true is the character index is represented by glyphs in this layout. * @param index index of the character in the ACI. @return true if the layout represents that character. 
boolean	TokenNameboolean	
hasCharacterIndex	TokenNameIdentifier	 has Character Index
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the glyph vector asociated to this layout. * * @return glyph vector */	TokenNameCOMMENT_JAVADOC	 Return the glyph vector asociated to this layout. * @return glyph vector 
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
getGlyphVector	TokenNameIdentifier	 get Glyph Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the rotation angle applied to the * character. * * @param index index of the character in the ACI * @return rotation angle */	TokenNameCOMMENT_JAVADOC	 Return the rotation angle applied to the character. * @param index index of the character in the ACI @return rotation angle 
double	TokenNamedouble	
getComputedOrientationAngle	TokenNameIdentifier	 get Computed Orientation Angle
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return true if this text run represents * an alt glyph. */	TokenNameCOMMENT_JAVADOC	 Return true if this text run represents an alt glyph. 
boolean	TokenNameboolean	
isAltGlyph	TokenNameIdentifier	 is Alt Glyph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
