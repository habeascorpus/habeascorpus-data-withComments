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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedString	TokenNameIdentifier	 Attributed String
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * GVTAttributedCharacterIterator * * Used to implement SVG &lt;tspan&gt; and &lt;text&gt; * attributes. This implementation is designed for efficient support * of per-character attributes (i.e. single character attribute spans). * It supports an extended set of TextAttributes, via inner class * SVGAttributedCharacterIterator.TextAttributes. * * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> * @version $Id: GVTAttributedCharacterIterator.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 GVTAttributedCharacterIterator * Used to implement SVG &lt;tspan&gt; and &lt;text&gt; attributes. This implementation is designed for efficient support of per-character attributes (i.e. single character attribute spans). It supports an extended set of TextAttributes, via inner class SVGAttributedCharacterIterator.TextAttributes. * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> @version $Id: GVTAttributedCharacterIterator.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
extends	TokenNameextends	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
{	TokenNameLBRACE	
/** * Sets this iterator's contents to an unattributed copy of String s. */	TokenNameCOMMENT_JAVADOC	 Sets this iterator's contents to an unattributed copy of String s. 
void	TokenNamevoid	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Assigns this iterator's contents to be equivalent to AttributedString s. */	TokenNameCOMMENT_JAVADOC	 Assigns this iterator's contents to be equivalent to AttributedString s. 
void	TokenNamevoid	
setString	TokenNameIdentifier	 set String
(	TokenNameLPAREN	
AttributedString	TokenNameIdentifier	 Attributed String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets values of a per-character attribute associated with the content * string. * Characters from <tt>beginIndex</tt> to <tt>endIndex</tt> * (zero-offset) are assigned values for attribute key <tt>attr</tt> * from the array <tt>attValues.</tt> * If the length of attValues is less than character span * <tt>(endIndex-beginIndex)</tt> the last value is duplicated; * if attValues is longer than the character span * the extra values are ignored. * Note that if either beginIndex or endIndex are outside the bounds * of the current character array they are clipped accordingly. */	TokenNameCOMMENT_JAVADOC	 Sets values of a per-character attribute associated with the content string. Characters from <tt>beginIndex</tt> to <tt>endIndex</tt> (zero-offset) are assigned values for attribute key <tt>attr</tt> from the array <tt>attValues.</tt> If the length of attValues is less than character span <tt>(endIndex-beginIndex)</tt> the last value is duplicated; if attValues is longer than the character span the extra values are ignored. Note that if either beginIndex or endIndex are outside the bounds of the current character array they are clipped accordingly. 
void	TokenNamevoid	
setAttributeArray	TokenNameIdentifier	 set Attribute Array
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attValues	TokenNameIdentifier	 att Values
,	TokenNameCOMMA	
int	TokenNameint	
beginIndex	TokenNameIdentifier	 begin Index
,	TokenNameCOMMA	
int	TokenNameint	
endIndex	TokenNameIdentifier	 end Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//From java.text.AttributedCharacterIterator 	TokenNameCOMMENT_LINE	From java.text.AttributedCharacterIterator 
/** * Get the keys of all attributes defined on the iterator's text range. */	TokenNameCOMMENT_JAVADOC	 Get the keys of all attributes defined on the iterator's text range. 
Set	TokenNameIdentifier	 Set
getAllAttributeKeys	TokenNameIdentifier	 get All Attribute Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the value of the named attribute for the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the value of the named attribute for the current character. 
Object	TokenNameIdentifier	 Object
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a map with the attributes defined on the current * character. */	TokenNameCOMMENT_JAVADOC	 Returns a map with the attributes defined on the current character. 
Map	TokenNameIdentifier	 Map
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the index of the first character following the * run with respect to all attributes containing the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character following the run with respect to all attributes containing the current character. 
int	TokenNameint	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the index of the first character following the * run with respect to the given attribute containing the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character following the run with respect to the given attribute containing the current character. 
int	TokenNameint	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the index of the first character following the * run with respect to the given attributes containing the current * character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character following the run with respect to the given attributes containing the current character. 
int	TokenNameint	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the index of the first character of the run with * respect to all attributes containing the current character. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character of the run with respect to all attributes containing the current character. 
int	TokenNameint	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the index of the first character of the run with * respect to the given attribute containing the current character. * @param attribute The attribute for whose appearance the first offset * is requested. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character of the run with respect to the given attribute containing the current character. @param attribute The attribute for whose appearance the first offset is requested. 
int	TokenNameint	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the index of the first character of the run with * respect to the given attributes containing the current character. * @param attributes the Set of attributes which begins at the returned index. */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character of the run with respect to the given attributes containing the current character. @param attributes the Set of attributes which begins at the returned index. 
int	TokenNameint	
getRunStart	TokenNameIdentifier	 get Run Start
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//From CharacterIterator 	TokenNameCOMMENT_LINE	From CharacterIterator 
/** * Create a copy of this iterator */	TokenNameCOMMENT_JAVADOC	 Create a copy of this iterator 
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the character at the current position (as returned * by getIndex()). * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Get the character at the current position (as returned by getIndex()). <br><b>Specified by:</b> java.text.CharacterIterator. 
char	TokenNamechar	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the position to getBeginIndex(). * @return the character at the start index of the text. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Sets the position to getBeginIndex(). @return the character at the start index of the text. <br><b>Specified by:</b> java.text.CharacterIterator. 
char	TokenNamechar	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the start index of the text. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Get the start index of the text. <br><b>Specified by:</b> java.text.CharacterIterator. 
int	TokenNameint	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the end index of the text. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Get the end index of the text. <br><b>Specified by:</b> java.text.CharacterIterator. 
int	TokenNameint	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current index. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Get the current index. <br><b>Specified by:</b> java.text.CharacterIterator. 
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the position to getEndIndex()-1 (getEndIndex() if * the text is empty) and returns the character at that position. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Sets the position to getEndIndex()-1 (getEndIndex() if the text is empty) and returns the character at that position. <br><b>Specified by:</b> java.text.CharacterIterator. 
char	TokenNamechar	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Increments the iterator's index by one, returning the next character. * @return the character at the new index. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Increments the iterator's index by one, returning the next character. @return the character at the new index. <br><b>Specified by:</b> java.text.CharacterIterator. 
char	TokenNamechar	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Decrements the iterator's index by one and returns * the character at the new index. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Decrements the iterator's index by one and returns the character at the new index. <br><b>Specified by:</b> java.text.CharacterIterator. 
char	TokenNamechar	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the position to the specified position in the text. * @param position The new (current) index into the text. * @return the character at new index <em>position</em>. * <br><b>Specified by:</b> java.text.CharacterIterator. */	TokenNameCOMMENT_JAVADOC	 Sets the position to the specified position in the text. @param position The new (current) index into the text. @return the character at new index <em>position</em>. <br><b>Specified by:</b> java.text.CharacterIterator. 
char	TokenNamechar	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Inner classes: 	TokenNameCOMMENT_LINE	Inner classes: 
/** * Attribute keys that identify SVG text attributes. Anchor point for * attribute values of X, Y, and ROTATION is determined by the character's * font and other attributes. * We duplicate the features of java.awt.font.TextAttribute rather than * subclassing because java.awt.font.TextAttribute is <em>final</em>. */	TokenNameCOMMENT_JAVADOC	 Attribute keys that identify SVG text attributes. Anchor point for attribute values of X, Y, and ROTATION is determined by the character's font and other attributes. We duplicate the features of java.awt.font.TextAttribute rather than subclassing because java.awt.font.TextAttribute is <em>final</em>. 
class	TokenNameclass	
TextAttribute	TokenNameIdentifier	 Text Attribute
extends	TokenNameextends	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
{	TokenNameLBRACE	
/** Construct a TextAttribute key with name s */	TokenNameCOMMENT_JAVADOC	 Construct a TextAttribute key with name s 
public	TokenNamepublic	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
FLOW_PARAGRAPH	TokenNameIdentifier	 FLOW  PARAGRAPH
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"FLOW_PARAGRAPH"	TokenNameStringLiteral	FLOW_PARAGRAPH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
FLOW_EMPTY_PARAGRAPH	TokenNameIdentifier	 FLOW  EMPTY  PARAGRAPH
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"FLOW_EMPTY_PARAGRAPH"	TokenNameStringLiteral	FLOW_EMPTY_PARAGRAPH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
FLOW_LINE_BREAK	TokenNameIdentifier	 FLOW  LINE  BREAK
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"FLOW_LINE_BREAK"	TokenNameStringLiteral	FLOW_LINE_BREAK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
FLOW_REGIONS	TokenNameIdentifier	 FLOW  REGIONS
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"FLOW_REGIONS"	TokenNameStringLiteral	FLOW_REGIONS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
LINE_HEIGHT	TokenNameIdentifier	 LINE  HEIGHT
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"LINE_HEIGHT"	TokenNameStringLiteral	LINE_HEIGHT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
PREFORMATTED	TokenNameIdentifier	 PREFORMATTED
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"PREFORMATTED"	TokenNameStringLiteral	PREFORMATTED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Attribute span delimiter - new tspan, tref, or textelement.*/	TokenNameCOMMENT_JAVADOC	 Attribute span delimiter - new tspan, tref, or textelement.
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
TEXT_COMPOUND_DELIMITER	TokenNameIdentifier	 TEXT  COMPOUND  DELIMITER
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"TEXT_COMPOUND_DELIMITER"	TokenNameStringLiteral	TEXT_COMPOUND_DELIMITER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Element identifier all chars from same element will share an * ID. */	TokenNameCOMMENT_JAVADOC	 Element identifier all chars from same element will share an ID. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
TEXT_COMPOUND_ID	TokenNameIdentifier	 TEXT  COMPOUND  ID
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"TEXT_COMPOUND_ID"	TokenNameStringLiteral	TEXT_COMPOUND_ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Anchor type.*/	TokenNameCOMMENT_JAVADOC	 Anchor type.
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
ANCHOR_TYPE	TokenNameIdentifier	 ANCHOR  TYPE
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"ANCHOR_TYPE"	TokenNameStringLiteral	ANCHOR_TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Marker attribute indicating explicit glyph layout.*/	TokenNameCOMMENT_JAVADOC	 Marker attribute indicating explicit glyph layout.
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
EXPLICIT_LAYOUT	TokenNameIdentifier	 EXPLICIT  LAYOUT
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"EXPLICIT_LAYOUT"	TokenNameStringLiteral	EXPLICIT_LAYOUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** User-space X coordinate for character.*/	TokenNameCOMMENT_JAVADOC	 User-space X coordinate for character.
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
X	TokenNameIdentifier	 X
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"X"	TokenNameStringLiteral	X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** User-space Y coordinate for character.*/	TokenNameCOMMENT_JAVADOC	 User-space Y coordinate for character.
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
Y	TokenNameIdentifier	 Y
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"Y"	TokenNameStringLiteral	Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** User-space relative X coordinate for character.*/	TokenNameCOMMENT_JAVADOC	 User-space relative X coordinate for character.
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
DX	TokenNameIdentifier	 DX
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"DX"	TokenNameStringLiteral	DX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** User-space relative Y coordinate for character.*/	TokenNameCOMMENT_JAVADOC	 User-space relative Y coordinate for character.
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
DY	TokenNameIdentifier	 DY
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"DY"	TokenNameStringLiteral	DY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Rotation for character, in degrees.*/	TokenNameCOMMENT_JAVADOC	 Rotation for character, in degrees.
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
ROTATION	TokenNameIdentifier	 ROTATION
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"ROTATION"	TokenNameStringLiteral	ROTATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** All the paint attributes for the text.*/	TokenNameCOMMENT_JAVADOC	 All the paint attributes for the text.
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
PAINT_INFO	TokenNameIdentifier	 PAINT  INFO
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"PAINT_INFO"	TokenNameStringLiteral	PAINT_INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Author-expected width for bounding box containing * all text string glyphs. */	TokenNameCOMMENT_JAVADOC	 Author-expected width for bounding box containing all text string glyphs. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
BBOX_WIDTH	TokenNameIdentifier	 BBOX  WIDTH
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"BBOX_WIDTH"	TokenNameStringLiteral	BBOX_WIDTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Method specified for adjusting text element layout size. */	TokenNameCOMMENT_JAVADOC	 Method specified for adjusting text element layout size. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
LENGTH_ADJUST	TokenNameIdentifier	 LENGTH  ADJUST
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"LENGTH_ADJUST"	TokenNameStringLiteral	LENGTH_ADJUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Convenience flag indicating that non-default glyph spacing is needed. */	TokenNameCOMMENT_JAVADOC	 Convenience flag indicating that non-default glyph spacing is needed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
CUSTOM_SPACING	TokenNameIdentifier	 CUSTOM  SPACING
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"CUSTOM_SPACING"	TokenNameStringLiteral	CUSTOM_SPACING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** User-specified inter-glyph kerning value. */	TokenNameCOMMENT_JAVADOC	 User-specified inter-glyph kerning value. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
KERNING	TokenNameIdentifier	 KERNING
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"KERNING"	TokenNameStringLiteral	KERNING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** User-specified inter-glyph spacing value. */	TokenNameCOMMENT_JAVADOC	 User-specified inter-glyph spacing value. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
LETTER_SPACING	TokenNameIdentifier	 LETTER  SPACING
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"LETTER_SPACING"	TokenNameStringLiteral	LETTER_SPACING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** User-specified width for whitespace characters. */	TokenNameCOMMENT_JAVADOC	 User-specified width for whitespace characters. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
WORD_SPACING	TokenNameIdentifier	 WORD  SPACING
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"WORD_SPACING"	TokenNameStringLiteral	WORD_SPACING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Path along which text is to be laid out */	TokenNameCOMMENT_JAVADOC	 Path along which text is to be laid out 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
TEXTPATH	TokenNameIdentifier	 TEXTPATH
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"TEXTPATH"	TokenNameStringLiteral	TEXTPATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Font variant to be used for this character span. * @see org.apache.batik.gvt.text.GVTAttributedCharacterIterator.TextAttribute#SMALL_CAPS */	TokenNameCOMMENT_JAVADOC	 Font variant to be used for this character span. @see org.apache.batik.gvt.text.GVTAttributedCharacterIterator.TextAttribute#SMALL_CAPS 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
FONT_VARIANT	TokenNameIdentifier	 FONT  VARIANT
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"FONT_VARIANT"	TokenNameStringLiteral	FONT_VARIANT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Baseline adjustment to be applied to this character span. */	TokenNameCOMMENT_JAVADOC	 Baseline adjustment to be applied to this character span. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
BASELINE_SHIFT	TokenNameIdentifier	 BASELINE  SHIFT
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"BASELINE_SHIFT"	TokenNameStringLiteral	BASELINE_SHIFT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Directional writing mode applied to this character span. */	TokenNameCOMMENT_JAVADOC	 Directional writing mode applied to this character span. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
WRITING_MODE	TokenNameIdentifier	 WRITING  MODE
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"WRITING_MODE"	TokenNameStringLiteral	WRITING_MODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
VERTICAL_ORIENTATION	TokenNameIdentifier	 VERTICAL  ORIENTATION
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"VERTICAL_ORIENTATION"	TokenNameStringLiteral	VERTICAL_ORIENTATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
VERTICAL_ORIENTATION_ANGLE	TokenNameIdentifier	 VERTICAL  ORIENTATION  ANGLE
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"VERTICAL_ORIENTATION_ANGLE"	TokenNameStringLiteral	VERTICAL_ORIENTATION_ANGLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
HORIZONTAL_ORIENTATION_ANGLE	TokenNameIdentifier	 HORIZONTAL  ORIENTATION  ANGLE
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"HORIZONTAL_ORIENTATION_ANGLE"	TokenNameStringLiteral	HORIZONTAL_ORIENTATION_ANGLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
GVT_FONT_FAMILIES	TokenNameIdentifier	 GVT  FONT  FAMILIES
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"GVT_FONT_FAMILIES"	TokenNameStringLiteral	GVT_FONT_FAMILIES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
GVT_FONTS	TokenNameIdentifier	 GVT  FONTS
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"GVT_FONTS"	TokenNameStringLiteral	GVT_FONTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
GVT_FONT	TokenNameIdentifier	 GVT  FONT
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"GVT_FONT"	TokenNameStringLiteral	GVT_FONT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
ALT_GLYPH_HANDLER	TokenNameIdentifier	 ALT  GLYPH  HANDLER
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"ALT_GLYPH_HANDLER"	TokenNameStringLiteral	ALT_GLYPH_HANDLER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
BIDI_LEVEL	TokenNameIdentifier	 BIDI  LEVEL
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"BIDI_LEVEL"	TokenNameStringLiteral	BIDI_LEVEL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
CHAR_INDEX	TokenNameIdentifier	 CHAR  INDEX
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"CHAR_INDEX"	TokenNameStringLiteral	CHAR_INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TextAttribute	TokenNameIdentifier	 Text Attribute
ARABIC_FORM	TokenNameIdentifier	 ARABIC  FORM
=	TokenNameEQUAL	
new	TokenNamenew	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"ARABIC_FORM"	TokenNameStringLiteral	ARABIC_FORM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// VALUES 	TokenNameCOMMENT_LINE	VALUES 
/** Value for WRITING_MODE indicating left-to-right */	TokenNameCOMMENT_JAVADOC	 Value for WRITING_MODE indicating left-to-right 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
WRITING_MODE_LTR	TokenNameIdentifier	 WRITING  MODE  LTR
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Value for WRITING_MODE indicating right-to-left */	TokenNameCOMMENT_JAVADOC	 Value for WRITING_MODE indicating right-to-left 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
WRITING_MODE_RTL	TokenNameIdentifier	 WRITING  MODE  RTL
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Value for WRITING_MODE indicating top-to-botton */	TokenNameCOMMENT_JAVADOC	 Value for WRITING_MODE indicating top-to-botton 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
WRITING_MODE_TTB	TokenNameIdentifier	 WRITING  MODE  TTB
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Value for VERTICAL_ORIENTATION indicating an angle */	TokenNameCOMMENT_JAVADOC	 Value for VERTICAL_ORIENTATION indicating an angle 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ORIENTATION_ANGLE	TokenNameIdentifier	 ORIENTATION  ANGLE
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Value for VERTICAL_ORIENTATION indicating auto */	TokenNameCOMMENT_JAVADOC	 Value for VERTICAL_ORIENTATION indicating auto 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ORIENTATION_AUTO	TokenNameIdentifier	 ORIENTATION  AUTO
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Value for FONT_VARIANT specifying small caps */	TokenNameCOMMENT_JAVADOC	 Value for FONT_VARIANT specifying small caps 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
SMALL_CAPS	TokenNameIdentifier	 SMALL  CAPS
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Value for UNDERLINE specifying underlining-on */	TokenNameCOMMENT_JAVADOC	 Value for UNDERLINE specifying underlining-on 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
UNDERLINE_ON	TokenNameIdentifier	 UNDERLINE  ON
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
UNDERLINE_ON	TokenNameIdentifier	 UNDERLINE  ON
;	TokenNameSEMICOLON	
/** Value for OVERLINE specifying overlining-on */	TokenNameCOMMENT_JAVADOC	 Value for OVERLINE specifying overlining-on 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Boolean	TokenNameIdentifier	 Boolean
OVERLINE_ON	TokenNameIdentifier	 OVERLINE  ON
=	TokenNameEQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
;	TokenNameSEMICOLON	
/** Value for STRIKETHROUGH specifying strikethrough-on */	TokenNameCOMMENT_JAVADOC	 Value for STRIKETHROUGH specifying strikethrough-on 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Boolean	TokenNameIdentifier	 Boolean
STRIKETHROUGH_ON	TokenNameIdentifier	 STRIKETHROUGH  ON
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
STRIKETHROUGH_ON	TokenNameIdentifier	 STRIKETHROUGH  ON
;	TokenNameSEMICOLON	
/** Value for LENGTH_ADJUST specifying adjustment to inter-glyph spacing */	TokenNameCOMMENT_JAVADOC	 Value for LENGTH_ADJUST specifying adjustment to inter-glyph spacing 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ADJUST_SPACING	TokenNameIdentifier	 ADJUST  SPACING
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Value for LENGTH_ADJUST specifying overall scaling of layout outlines */	TokenNameCOMMENT_JAVADOC	 Value for LENGTH_ADJUST specifying overall scaling of layout outlines 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ADJUST_ALL	TokenNameIdentifier	 ADJUST  ALL
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x01	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// constant values for the arabic glyph forms 	TokenNameCOMMENT_LINE	constant values for the arabic glyph forms 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ARABIC_NONE	TokenNameIdentifier	 ARABIC  NONE
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ARABIC_ISOLATED	TokenNameIdentifier	 ARABIC  ISOLATED
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ARABIC_TERMINAL	TokenNameIdentifier	 ARABIC  TERMINAL
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ARABIC_INITIAL	TokenNameIdentifier	 ARABIC  INITIAL
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ARABIC_MEDIAL	TokenNameIdentifier	 ARABIC  MEDIAL
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0x4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Interface for helper class which mutates the attributes of an * AttributedCharacterIterator. * Typically used to convert location and rotation attributes to * TextAttribute.TRANSFORM attributes, or convert between implementations * of AttributedCharacterIterator.Attribute. */	TokenNameCOMMENT_JAVADOC	 Interface for helper class which mutates the attributes of an AttributedCharacterIterator. Typically used to convert location and rotation attributes to TextAttribute.TRANSFORM attributes, or convert between implementations of AttributedCharacterIterator.Attribute. 
interface	TokenNameinterface	
AttributeFilter	TokenNameIdentifier	 Attribute Filter
{	TokenNameLBRACE	
/** * Modify an AttributedCharacterIterator's attributes systematically. * Usually returns a copy since AttributedCharacterIterator instances * are often immutable. The effect of the attribute modification * is implementation dependent. * @param aci an AttributedCharacterIterator whose attributes are * to be modified. * @return an instance of AttributedCharacterIterator with mutated * attributes. */	TokenNameCOMMENT_JAVADOC	 Modify an AttributedCharacterIterator's attributes systematically. Usually returns a copy since AttributedCharacterIterator instances are often immutable. The effect of the attribute modification is implementation dependent. @param aci an AttributedCharacterIterator whose attributes are to be modified. @return an instance of AttributedCharacterIterator with mutated attributes. 
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
mutateAttributes	TokenNameIdentifier	 mutate Attributes
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
