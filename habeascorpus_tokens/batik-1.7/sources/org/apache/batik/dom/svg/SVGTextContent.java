/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Point2D	TokenNameIdentifier	 Point2 D
;	TokenNameSEMICOLON	
/** * This class provides the interface for the SVGTextContentElement * for the bridge to implement. * * @author nicolas.socheleau@bitflash.com * @version $Id: SVGTextContent.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides the interface for the SVGTextContentElement for the bridge to implement. * @author nicolas.socheleau@bitflash.com @version $Id: SVGTextContent.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
{	TokenNameLBRACE	
/** * Returns the total number of characters to be * rendered within the current element. * Includes characters which are included * via a &lt;tref&gt; reference. * * @return Total number of characters. */	TokenNameCOMMENT_JAVADOC	 Returns the total number of characters to be rendered within the current element. Includes characters which are included via a &lt;tref&gt; reference. * @return Total number of characters. 
int	TokenNameint	
getNumberOfChars	TokenNameIdentifier	 get Number Of Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a tightest rectangle which defines the * minimum and maximum X and Y values in the user * coordinate system for rendering the glyph(s) * that correspond to the specified character. * The calculations assume that all glyphs occupy * the full standard glyph cell for the font. If * multiple consecutive characters are rendered * inseparably (e.g., as a single glyph or a * sequence of glyphs), then each of the inseparable * characters will return the same extent. * * @param charnum The index of the character, where the * first character has an index of 0. * @return The rectangle which encloses all of * the rendered glyph(s). */	TokenNameCOMMENT_JAVADOC	 Returns a tightest rectangle which defines the minimum and maximum X and Y values in the user coordinate system for rendering the glyph(s) that correspond to the specified character. The calculations assume that all glyphs occupy the full standard glyph cell for the font. If multiple consecutive characters are rendered inseparably (e.g., as a single glyph or a sequence of glyphs), then each of the inseparable characters will return the same extent. * @param charnum The index of the character, where the first character has an index of 0. @return The rectangle which encloses all of the rendered glyph(s). 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getExtentOfChar	TokenNameIdentifier	 get Extent Of Char
(	TokenNameLPAREN	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the current text position before rendering * the character in the user coordinate system for * rendering the glyph(s) that correspond to the * specified character. The current text position has * already taken into account the effects of any inter- * character adjustments due to properties 'kerning', * 'letter-spacing' and 'word-spacing' and adjustments * due to attributes x, y, dx and dy. If multiple * consecutive characters are rendered inseparably * (e.g., as a single glyph or a sequence of glyphs), * then each of the inseparable characters will return * the start position for the first glyph. * * @param charnum The index of the character, where the * first character has an index of 0. * @return The character's start position. */	TokenNameCOMMENT_JAVADOC	 Returns the current text position before rendering the character in the user coordinate system for rendering the glyph(s) that correspond to the specified character. The current text position has already taken into account the effects of any inter- character adjustments due to properties 'kerning', 'letter-spacing' and 'word-spacing' and adjustments due to attributes x, y, dx and dy. If multiple consecutive characters are rendered inseparably (e.g., as a single glyph or a sequence of glyphs), then each of the inseparable characters will return the start position for the first glyph. * @param charnum The index of the character, where the first character has an index of 0. @return The character's start position. 
Point2D	TokenNameIdentifier	 Point2 D
getStartPositionOfChar	TokenNameIdentifier	 get Start Position Of Char
(	TokenNameLPAREN	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the current text position after rendering * the character in the user coordinate system for * rendering the glyph(s) that correspond to the * specified character. This current text position * does not take into account the effects of any inter- * character adjustments to prepare for the next * character, such as properties 'kerning', * 'letter-spacing' and 'word-spacing' and adjustments * due to attributes x, y, dx and dy. If multiple * consecutive characters are rendered inseparably * (e.g., as a single glyph or a sequence of glyphs), * then each of the inseparable characters will return * the end position for the last glyph. * * @param charnum The index of the character, where the * first character has an index of 0. * @return The character's end position. */	TokenNameCOMMENT_JAVADOC	 Returns the current text position after rendering the character in the user coordinate system for rendering the glyph(s) that correspond to the specified character. This current text position does not take into account the effects of any inter- character adjustments to prepare for the next character, such as properties 'kerning', 'letter-spacing' and 'word-spacing' and adjustments due to attributes x, y, dx and dy. If multiple consecutive characters are rendered inseparably (e.g., as a single glyph or a sequence of glyphs), then each of the inseparable characters will return the end position for the last glyph. * @param charnum The index of the character, where the first character has an index of 0. @return The character's end position. 
Point2D	TokenNameIdentifier	 Point2 D
getEndPositionOfChar	TokenNameIdentifier	 get End Position Of Char
(	TokenNameLPAREN	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the rotation value relative to the current * user coordinate system used to render the glyph(s) * corresponding to the specified character. If * multiple glyph(s) are used to render the given * character and the glyphs each have different * rotations (e.g., due to text-on-a-path), the user * agent shall return an average value (e.g., the * rotation angle at the midpoint along the path for * all glyphs used to render this character). The * rotation value represents the rotation that is * supplemental to any rotation due to properties * 'glyph-orientation-horizontal' and * 'glyph-orientation-vertical'; thus, any glyph * rotations due to these properties are not included * into the returned rotation value. If multiple * consecutive characters are rendered inseparably * (e.g., as a single glyph or a sequence of glyphs), * then each of the inseparable characters will * return the same rotation value. * * @param charnum The index of the character, where the * first character has an index of 0. * @return The character's rotation angle. */	TokenNameCOMMENT_JAVADOC	 Returns the rotation value relative to the current user coordinate system used to render the glyph(s) corresponding to the specified character. If multiple glyph(s) are used to render the given character and the glyphs each have different rotations (e.g., due to text-on-a-path), the user agent shall return an average value (e.g., the rotation angle at the midpoint along the path for all glyphs used to render this character). The rotation value represents the rotation that is supplemental to any rotation due to properties 'glyph-orientation-horizontal' and 'glyph-orientation-vertical'; thus, any glyph rotations due to these properties are not included into the returned rotation value. If multiple consecutive characters are rendered inseparably (e.g., as a single glyph or a sequence of glyphs), then each of the inseparable characters will return the same rotation value. * @param charnum The index of the character, where the first character has an index of 0. @return The character's rotation angle. 
float	TokenNamefloat	
getRotationOfChar	TokenNameIdentifier	 get Rotation Of Char
(	TokenNameLPAREN	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Causes the specified substring to be selected * just as if the user selected the substring interactively. * * @param charnum : The index of the start character * which is at the given point, where the first * character has an index of 0. * @param nchars : The number of characters in the * substring. If nchars specifies more characters * than are available, then the substring will * consist of all characters starting with charnum * until the end of the list of characters. */	TokenNameCOMMENT_JAVADOC	 Causes the specified substring to be selected just as if the user selected the substring interactively. * @param charnum : The index of the start character which is at the given point, where the first character has an index of 0. @param nchars : The number of characters in the substring. If nchars specifies more characters than are available, then the substring will consist of all characters starting with charnum until the end of the list of characters. 
void	TokenNamevoid	
selectSubString	TokenNameIdentifier	 select Sub String
(	TokenNameLPAREN	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
,	TokenNameCOMMA	
int	TokenNameint	
nchars	TokenNameIdentifier	 nchars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
getComputedTextLength	TokenNameIdentifier	 get Computed Text Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
getSubStringLength	TokenNameIdentifier	 get Sub String Length
(	TokenNameLPAREN	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
,	TokenNameCOMMA	
int	TokenNameint	
nchars	TokenNameIdentifier	 nchars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
getCharNumAtPosition	TokenNameIdentifier	 get Char Num At Position
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
