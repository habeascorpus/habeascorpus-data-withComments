/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Point2D	TokenNameIdentifier	 Point2 D
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
MultiGlyphVector	TokenNameIdentifier	 Multi Glyph Vector
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
GlyphLayout	TokenNameIdentifier	 Glyph Layout
;	TokenNameSEMICOLON	
/** * A GlyphLayout class for SVG 1.2 flowing text. * * @author <a href="mailto:deweese@apache.org">deweese</a> * @version $Id: FlowExtGlyphLayout.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A GlyphLayout class for SVG 1.2 flowing text. * @author <a href="mailto:deweese@apache.org">deweese</a> @version $Id: FlowExtGlyphLayout.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
FlowExtGlyphLayout	TokenNameIdentifier	 Flow Ext Glyph Layout
extends	TokenNameextends	
GlyphLayout	TokenNameIdentifier	 Glyph Layout
{	TokenNameLBRACE	
public	TokenNamepublic	
FlowExtGlyphLayout	TokenNameIdentifier	 Flow Ext Glyph Layout
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charMap	TokenNameIdentifier	 char Map
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
,	TokenNameCOMMA	
charMap	TokenNameIdentifier	 char Map
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Issues: 	TokenNameCOMMENT_LINE	Issues: 
// Should the font size of non-printing chars affect line spacing? 	TokenNameCOMMENT_LINE	Should the font size of non-printing chars affect line spacing? 
// Does line breaking get done before/after ligatures? 	TokenNameCOMMENT_LINE	Does line breaking get done before/after ligatures? 
// What should be done if the next glyph does not fit in the 	TokenNameCOMMENT_LINE	What should be done if the next glyph does not fit in the 
// flow rect (very narrow flow rect). 	TokenNameCOMMENT_LINE	flow rect (very narrow flow rect). 
// Print the one char anyway. 	TokenNameCOMMENT_LINE	Print the one char anyway. 
// Go to the next flow rect. 	TokenNameCOMMENT_LINE	Go to the next flow rect. 
// Should dy be considered for line offsets? (super scripts) 	TokenNameCOMMENT_LINE	Should dy be considered for line offsets? (super scripts) 
// Should p's & br's carry over from flow rect to flow rect if 	TokenNameCOMMENT_LINE	Should p's & br's carry over from flow rect to flow rect if 
// so how much???? 	TokenNameCOMMENT_LINE	so how much???? 
// In cases where 1/2 leading is negative (lineBox is smaller than 	TokenNameCOMMENT_LINE	In cases where 1/2 leading is negative (lineBox is smaller than 
// lineAscent+lineDescent) do we use the lineBox (some glyphs will 	TokenNameCOMMENT_LINE	lineAscent+lineDescent) do we use the lineBox (some glyphs will 
// go outside flowRegion) or the visual box. My feeling is that 	TokenNameCOMMENT_LINE	go outside flowRegion) or the visual box. My feeling is that 
// we should use the larger of the two. 	TokenNameCOMMENT_LINE	we should use the larger of the two. 
// We stated that for empty para elements it moves to the new flow 	TokenNameCOMMENT_LINE	We stated that for empty para elements it moves to the new flow 
// region if the zero-height line is outside the flow region. In 	TokenNameCOMMENT_LINE	region if the zero-height line is outside the flow region. In 
// this case the para elements top-margin is used in the new flow 	TokenNameCOMMENT_LINE	this case the para elements top-margin is used in the new flow 
// region (and it's bottom-margin is collapsed with the next 	TokenNameCOMMENT_LINE	region (and it's bottom-margin is collapsed with the next 
// flowPara element if any). What happens when the first line of 	TokenNameCOMMENT_LINE	flowPara element if any). What happens when the first line of 
// a non-empty flowPara doesn't fit (so the top margin does fit 	TokenNameCOMMENT_LINE	a non-empty flowPara doesn't fit (so the top margin does fit 
// but the first line of text doesn't). I think the para should 	TokenNameCOMMENT_LINE	but the first line of text doesn't). I think the para should 
// move to the next flow region and the top margin should apply in 	TokenNameCOMMENT_LINE	move to the next flow region and the top margin should apply in 
// the new flow region. The top margin does not apply if 	TokenNameCOMMENT_LINE	the new flow region. The top margin does not apply if 
// subsequint lines move to a new flow region. 	TokenNameCOMMENT_LINE	subsequint lines move to a new flow region. 
// Note that line wrapping is done on visual bounds of glyph 	TokenNameCOMMENT_LINE	Note that line wrapping is done on visual bounds of glyph 
// not the glyph advance (which often includes some whitespace 	TokenNameCOMMENT_LINE	not the glyph advance (which often includes some whitespace 
// after the right edge of the glyph char). 	TokenNameCOMMENT_LINE	after the right edge of the glyph char). 
// 	TokenNameCOMMENT_LINE	 
// How are Margins done? Can't figure out Box size until 	TokenNameCOMMENT_LINE	How are Margins done? Can't figure out Box size until 
// after we know the margins. 	TokenNameCOMMENT_LINE	after we know the margins. 
// Should 'A' element be allowed in 'flowPara'. 	TokenNameCOMMENT_LINE	Should 'A' element be allowed in 'flowPara'. 
// 	TokenNameCOMMENT_LINE	 
// For Full justification: 	TokenNameCOMMENT_LINE	For Full justification: 
// Streach glyphs to fill line? (attribute?) 	TokenNameCOMMENT_LINE	Streach glyphs to fill line? (attribute?) 
// What to do with partial line (last line in 'p', 'line' 	TokenNameCOMMENT_LINE	What to do with partial line (last line in 'p', 'line' 
// element, or 'div' element), still full justify, just left 	TokenNameCOMMENT_LINE	element, or 'div' element), still full justify, just left 
// justify, attribute? 	TokenNameCOMMENT_LINE	justify, attribute? 
// What to do when only one glyph on line? left or center or stretch? 	TokenNameCOMMENT_LINE	What to do when only one glyph on line? left or center or stretch? 
// For full to look good I think the line must be able to squeeze a 	TokenNameCOMMENT_LINE	For full to look good I think the line must be able to squeeze a 
// bit as well as grow (pretty easy to add). 	TokenNameCOMMENT_LINE	bit as well as grow (pretty easy to add). 
// 	TokenNameCOMMENT_LINE	 
// This Only does horizontal languages. 	TokenNameCOMMENT_LINE	This Only does horizontal languages. 
// Supports Zero Width Spaces (0x200B) Zero Width Joiner( 0x200D), 	TokenNameCOMMENT_LINE	Supports Zero Width Spaces (0x200B) Zero Width Joiner( 0x200D), 
// and soft hyphens (0x00AD). 	TokenNameCOMMENT_LINE	and soft hyphens (0x00AD). 
// 	TokenNameCOMMENT_LINE	 
// Does not properly handle Bi-DI languages (does text wrapping on 	TokenNameCOMMENT_LINE	Does not properly handle Bi-DI languages (does text wrapping on 
// display order not logical order). 	TokenNameCOMMENT_LINE	display order not logical order). 
/** * This will wrap the text associated with <tt>aci</tt> and * <tt>layouts</tt>. * @param acis An array of Attributed Charater Iterators containing the * text to wrap. There is one aci per text chunk * (which maps to flowPara elements. Used to access * font, paragraph, and line break info. * @param chunkLayouts A List of List of GlyphLayout objects. There * is a List of GlyphLayout objects for each * flowPara element. There is a GlyphLayout * for approximately each sub element in the * flowPara element. * @param flowRects A List of Rectangle2D representing the regions * to flow text into. */	TokenNameCOMMENT_JAVADOC	 This will wrap the text associated with <tt>aci</tt> and <tt>layouts</tt>. @param acis An array of Attributed Charater Iterators containing the text to wrap. There is one aci per text chunk (which maps to flowPara elements. Used to access font, paragraph, and line break info. @param chunkLayouts A List of List of GlyphLayout objects. There is a List of GlyphLayout objects for each flowPara element. There is a GlyphLayout for approximately each sub element in the flowPara element. @param flowRects A List of Rectangle2D representing the regions to flow text into. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
textWrapTextChunk	TokenNameIdentifier	 text Wrap Text Chunk
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
acis	TokenNameIdentifier	 acis
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
chunkLayouts	TokenNameIdentifier	 chunk Layouts
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
flowRects	TokenNameIdentifier	 flow Rects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Len: " + acis.length + " Size: " + 	TokenNameCOMMENT_LINE	System.out.println("Len: " + acis.length + " Size: " + 
// chunkLayouts.size()); 	TokenNameCOMMENT_LINE	chunkLayouts.size()); 
// Make a list of the GlyphVectors so we can construct a 	TokenNameCOMMENT_LINE	Make a list of the GlyphVectors so we can construct a 
// multiGlyphVector that makes them all look like one big 	TokenNameCOMMENT_LINE	multiGlyphVector that makes them all look like one big 
// glyphVector 	TokenNameCOMMENT_LINE	glyphVector 
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gvs	TokenNameIdentifier	 gvs
=	TokenNameEQUAL	
new	TokenNamenew	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
[	TokenNameLBRACKET	
acis	TokenNameIdentifier	 acis
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunkLineInfos	TokenNameIdentifier	 chunk Line Infos
=	TokenNameEQUAL	
new	TokenNamenew	
List	TokenNameIdentifier	 List
[	TokenNameLBRACKET	
acis	TokenNameIdentifier	 acis
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
GlyphIterator	TokenNameIdentifier	 Glyph Iterator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gis	TokenNameIdentifier	 gis
=	TokenNameEQUAL	
new	TokenNamenew	
GlyphIterator	TokenNameIdentifier	 Glyph Iterator
[	TokenNameLBRACKET	
acis	TokenNameIdentifier	 acis
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
clIter	TokenNameIdentifier	 cl Iter
=	TokenNameEQUAL	
chunkLayouts	TokenNameIdentifier	 chunk Layouts
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get an iterator for the flow rects. 	TokenNameCOMMENT_LINE	Get an iterator for the flow rects. 
Iterator	TokenNameIdentifier	 Iterator
flowRectsIter	TokenNameIdentifier	 flow Rects Iter
=	TokenNameEQUAL	
flowRects	TokenNameIdentifier	 flow Rects
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get info for new flow rect. 	TokenNameCOMMENT_LINE	Get info for new flow rect. 
RegionInfo	TokenNameIdentifier	 Region Info
currentRegion	TokenNameIdentifier	 current Region
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
y0	TokenNameIdentifier	 y0
,	TokenNameCOMMA	
x0	TokenNameIdentifier	 x0
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
flowRectsIter	TokenNameIdentifier	 flow Rects Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentRegion	TokenNameIdentifier	 current Region
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RegionInfo	TokenNameIdentifier	 Region Info
)	TokenNameRPAREN	
flowRectsIter	TokenNameIdentifier	 flow Rects Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
lineHeightRelative	TokenNameIdentifier	 line Height Relative
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
lineHeight	TokenNameIdentifier	 line Height
=	TokenNameEQUAL	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
nextLineMult	TokenNameIdentifier	 next Line Mult
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("Chunks: " + numChunks); 	TokenNameCOMMENT_LINE	System.out.println("Chunks: " + numChunks); 
float	TokenNamefloat	
prevBotMargin	TokenNameIdentifier	 prev Bot Margin
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
clIter	TokenNameIdentifier	 cl Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Chunk: " + chunk); 	TokenNameCOMMENT_LINE	System.out.println("Chunk: " + chunk); 
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
=	TokenNameEQUAL	
acis	TokenNameIdentifier	 acis
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentRegion	TokenNameIdentifier	 current Region
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
extraP	TokenNameIdentifier	 extra P
=	TokenNameEQUAL	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
)	TokenNameRPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
FLOW_EMPTY_PARAGRAPH	TokenNameIdentifier	 FLOW  EMPTY  PARAGRAPH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extraP	TokenNameIdentifier	 extra P
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
epi	TokenNameIdentifier	 epi
=	TokenNameEQUAL	
extraP	TokenNameIdentifier	 extra P
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
epi	TokenNameIdentifier	 epi
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MarginInfo	TokenNameIdentifier	 Margin Info
emi	TokenNameIdentifier	 emi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MarginInfo	TokenNameIdentifier	 Margin Info
)	TokenNameRPAREN	
epi	TokenNameIdentifier	 epi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prevBotMargin	TokenNameIdentifier	 prev Bot Margin
>	TokenNameGREATER	
emi	TokenNameIdentifier	 emi
.	TokenNameDOT	
getTopMargin	TokenNameIdentifier	 get Top Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
prevBotMargin	TokenNameIdentifier	 prev Bot Margin
:	TokenNameCOLON	
emi	TokenNameIdentifier	 emi
.	TokenNameDOT	
getTopMargin	TokenNameIdentifier	 get Top Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
+	TokenNamePLUS	
inc	TokenNameIdentifier	 inc
<=	TokenNameLESS_EQUAL	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
emi	TokenNameIdentifier	 emi
.	TokenNameDOT	
isFlowRegionBreak	TokenNameIdentifier	 is Flow Region Break
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dy	TokenNameIdentifier	 dy
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
prevBotMargin	TokenNameIdentifier	 prev Bot Margin
=	TokenNameEQUAL	
emi	TokenNameIdentifier	 emi
.	TokenNameDOT	
getBottomMargin	TokenNameIdentifier	 get Bottom Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Move to next flow region.. 	TokenNameCOMMENT_LINE	Move to next flow region.. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
flowRectsIter	TokenNameIdentifier	 flow Rects Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentRegion	TokenNameIdentifier	 current Region
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// No flow rect stop layout here... 	TokenNameCOMMENT_LINE	No flow rect stop layout here... 
}	TokenNameRBRACE	
// NEXT FLOW REGION 	TokenNameCOMMENT_LINE	NEXT FLOW REGION 
currentRegion	TokenNameIdentifier	 current Region
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RegionInfo	TokenNameIdentifier	 Region Info
)	TokenNameRPAREN	
flowRectsIter	TokenNameIdentifier	 flow Rects Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// start a new alignment offset for this flow rect. 	TokenNameCOMMENT_LINE	start a new alignment offset for this flow rect. 
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Don't use this paragraph info in next 	TokenNameCOMMENT_LINE	Don't use this paragraph info in next 
// flow region! 	TokenNameCOMMENT_LINE	flow region! 
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
prevBotMargin	TokenNameIdentifier	 prev Bot Margin
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentRegion	TokenNameIdentifier	 current Region
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
gvl	TokenNameIdentifier	 gvl
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
layouts	TokenNameIdentifier	 layouts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
)	TokenNameRPAREN	
clIter	TokenNameIdentifier	 cl Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
layouts	TokenNameIdentifier	 layouts
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyphLayout	TokenNameIdentifier	 Glyph Layout
gl	TokenNameIdentifier	 gl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GlyphLayout	TokenNameIdentifier	 Glyph Layout
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gvl	TokenNameIdentifier	 gvl
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
gl	TokenNameIdentifier	 gl
.	TokenNameDOT	
getGlyphVector	TokenNameIdentifier	 get Glyph Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
gv	TokenNameIdentifier	 gv
=	TokenNameEQUAL	
new	TokenNamenew	
MultiGlyphVector	TokenNameIdentifier	 Multi Glyph Vector
(	TokenNameLPAREN	
gvl	TokenNameIdentifier	 gvl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
;	TokenNameSEMICOLON	
int	TokenNameint	
numGlyphs	TokenNameIdentifier	 num Glyphs
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Glyphs: " + numGlyphs); 	TokenNameCOMMENT_LINE	System.out.println("Glyphs: " + numGlyphs); 
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MarginInfo	TokenNameIdentifier	 Margin Info
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MarginInfo	TokenNameIdentifier	 Margin Info
)	TokenNameRPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
FLOW_PARAGRAPH	TokenNameIdentifier	 FLOW  PARAGRAPH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// int justification = mi.getJustification(); 	TokenNameCOMMENT_LINE	int justification = mi.getJustification(); 
if	TokenNameif	
(	TokenNameLPAREN	
currentRegion	TokenNameIdentifier	 current Region
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
numGlyphs	TokenNameIdentifier	 num Glyphs
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
setGlyphVisible	TokenNameIdentifier	 set Glyph Visible
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
prevBotMargin	TokenNameIdentifier	 prev Bot Margin
>	TokenNameGREATER	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getTopMargin	TokenNameIdentifier	 get Top Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
prevBotMargin	TokenNameIdentifier	 prev Bot Margin
:	TokenNameCOLON	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getTopMargin	TokenNameIdentifier	 get Top Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
+	TokenNamePLUS	
inc	TokenNameIdentifier	 inc
<=	TokenNameLESS_EQUAL	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dy	TokenNameIdentifier	 dy
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Move to next flow region.. 	TokenNameCOMMENT_LINE	Move to next flow region.. 
// NEXT FLOW REGION 	TokenNameCOMMENT_LINE	NEXT FLOW REGION 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
flowRectsIter	TokenNameIdentifier	 flow Rects Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentRegion	TokenNameIdentifier	 current Region
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// No flow rect stop layout here... 	TokenNameCOMMENT_LINE	No flow rect stop layout here... 
}	TokenNameRBRACE	
// NEXT FLOW REGION 	TokenNameCOMMENT_LINE	NEXT FLOW REGION 
currentRegion	TokenNameIdentifier	 current Region
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RegionInfo	TokenNameIdentifier	 Region Info
)	TokenNameRPAREN	
flowRectsIter	TokenNameIdentifier	 flow Rects Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// start a new alignment offset for this flow rect.. 	TokenNameCOMMENT_LINE	start a new alignment offset for this flow rect.. 
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// New rect so no previous row to consider... 	TokenNameCOMMENT_LINE	New rect so no previous row to consider... 
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getTopMargin	TokenNameIdentifier	 get Top Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prevBotMargin	TokenNameIdentifier	 prev Bot Margin
=	TokenNameEQUAL	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getBottomMargin	TokenNameIdentifier	 get Bottom Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
leftMargin	TokenNameIdentifier	 left Margin
=	TokenNameEQUAL	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getLeftMargin	TokenNameIdentifier	 get Left Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
rightMargin	TokenNameIdentifier	 right Margin
=	TokenNameEQUAL	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getRightMargin	TokenNameIdentifier	 get Right Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GlyphLayout	TokenNameIdentifier	 Glyph Layout
)	TokenNameRPAREN	
layouts	TokenNameIdentifier	 layouts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isLeftToRight	TokenNameIdentifier	 is Left To Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
leftMargin	TokenNameIdentifier	 left Margin
+=	TokenNamePLUS_EQUAL	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getIndent	TokenNameIdentifier	 get Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rightMargin	TokenNameIdentifier	 right Margin
+=	TokenNamePLUS_EQUAL	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getIndent	TokenNameIdentifier	 get Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
leftMargin	TokenNameIdentifier	 left Margin
;	TokenNameSEMICOLON	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
leftMargin	TokenNameIdentifier	 left Margin
+	TokenNamePLUS	
rightMargin	TokenNameIdentifier	 right Margin
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
lineInfos	TokenNameIdentifier	 line Infos
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunkLineInfos	TokenNameIdentifier	 chunk Line Infos
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lineInfos	TokenNameIdentifier	 line Infos
;	TokenNameSEMICOLON	
float	TokenNamefloat	
prevDesc	TokenNameIdentifier	 prev Desc
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
GlyphIterator	TokenNameIdentifier	 Glyph Iterator
gi	TokenNameIdentifier	 gi
=	TokenNameEQUAL	
new	TokenNamenew	
GlyphIterator	TokenNameIdentifier	 Glyph Iterator
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
,	TokenNameCOMMA	
gv	TokenNameIdentifier	 gv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gis	TokenNameIdentifier	 gis
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gi	TokenNameIdentifier	 gi
;	TokenNameSEMICOLON	
GlyphIterator	TokenNameIdentifier	 Glyph Iterator
breakGI	TokenNameIdentifier	 break GI
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
newBreakGI	TokenNameIdentifier	 new Break GI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
done	TokenNameIdentifier	 done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
isPrinting	TokenNameIdentifier	 is Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This will place any preceeding whitespace on an 	TokenNameCOMMENT_LINE	This will place any preceeding whitespace on an 
// imaginary line that preceeds the real first line of 	TokenNameCOMMENT_LINE	imaginary line that preceeds the real first line of 
// the paragraph, also calculate the vertical 	TokenNameCOMMENT_LINE	the paragraph, also calculate the vertical 
// alignment offset, this will be repeated until the 	TokenNameCOMMENT_LINE	alignment offset, this will be repeated until the 
// last line in the flow rect. 	TokenNameCOMMENT_LINE	last line in the flow rect. 
updateVerticalAlignOffset	TokenNameIdentifier	 update Vertical Align Offset
(	TokenNameLPAREN	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
,	TokenNameCOMMA	
currentRegion	TokenNameIdentifier	 current Region
,	TokenNameCOMMA	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineInfos	TokenNameIdentifier	 line Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GlyphIterator	TokenNameIdentifier	 Glyph Iterator
lineGI	TokenNameIdentifier	 line GI
=	TokenNameEQUAL	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
firstLine	TokenNameIdentifier	 first Line
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
done	TokenNameIdentifier	 done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
doBreak	TokenNameIdentifier	 do Break
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
partial	TokenNameIdentifier	 partial
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
isPrinting	TokenNameIdentifier	 is Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
getAdv	TokenNameIdentifier	 get Adv
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
breakGI	TokenNameIdentifier	 break GI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first char on line didn't fit. 	TokenNameCOMMENT_LINE	first char on line didn't fit. 
// move to next flow rect. 	TokenNameCOMMENT_LINE	move to next flow rect. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
flowRectsIter	TokenNameIdentifier	 flow Rects Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentRegion	TokenNameIdentifier	 current Region
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
gi	TokenNameIdentifier	 gi
=	TokenNameEQUAL	
lineGI	TokenNameIdentifier	 line GI
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// No flow rect stop layout here... 	TokenNameCOMMENT_LINE	No flow rect stop layout here... 
}	TokenNameRBRACE	
// NEXT FLOW REGION 	TokenNameCOMMENT_LINE	NEXT FLOW REGION 
currentRegion	TokenNameIdentifier	 current Region
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RegionInfo	TokenNameIdentifier	 Region Info
)	TokenNameRPAREN	
flowRectsIter	TokenNameIdentifier	 flow Rects Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
leftMargin	TokenNameIdentifier	 left Margin
;	TokenNameSEMICOLON	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
leftMargin	TokenNameIdentifier	 left Margin
+	TokenNamePLUS	
rightMargin	TokenNameIdentifier	 right Margin
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// start a new alignment offset for this flow rect.. 	TokenNameCOMMENT_LINE	start a new alignment offset for this flow rect.. 
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// New rect so no previous row to consider... 	TokenNameCOMMENT_LINE	New rect so no previous row to consider... 
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
firstLine	TokenNameIdentifier	 first Line
?	TokenNameQUESTION	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getTopMargin	TokenNameIdentifier	 get Top Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
prevDesc	TokenNameIdentifier	 prev Desc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gi	TokenNameIdentifier	 gi
=	TokenNameEQUAL	
lineGI	TokenNameIdentifier	 line GI
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
gi	TokenNameIdentifier	 gi
=	TokenNameEQUAL	
breakGI	TokenNameIdentifier	 break GI
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Back up to break loc... 	TokenNameCOMMENT_LINE	Back up to break loc... 
nextLineMult	TokenNameIdentifier	 next Line Mult
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
doBreak	TokenNameIdentifier	 do Break
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
partial	TokenNameIdentifier	 partial
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
isLastChar	TokenNameIdentifier	 is Last Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextLineMult	TokenNameIdentifier	 next Line Mult
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
doBreak	TokenNameIdentifier	 do Break
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
partial	TokenNameIdentifier	 partial
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
lnBreaks	TokenNameIdentifier	 ln Breaks
=	TokenNameEQUAL	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
getLineBreaks	TokenNameIdentifier	 get Line Breaks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lnBreaks	TokenNameIdentifier	 ln Breaks
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doBreak	TokenNameIdentifier	 do Break
)	TokenNameRPAREN	
nextLineMult	TokenNameIdentifier	 next Line Mult
-=	TokenNameMINUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nextLineMult	TokenNameIdentifier	 next Line Mult
+=	TokenNamePLUS_EQUAL	
lnBreaks	TokenNameIdentifier	 ln Breaks
;	TokenNameSEMICOLON	
doBreak	TokenNameIdentifier	 do Break
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
partial	TokenNameIdentifier	 partial
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
doBreak	TokenNameIdentifier	 do Break
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("No Brk Adv: " + gi.getAdv()); 	TokenNameCOMMENT_LINE	System.out.println("No Brk Adv: " + gi.getAdv()); 
// We don't need to break the line because of this glyph 	TokenNameCOMMENT_LINE	We don't need to break the line because of this glyph 
// So we just check if we need to update our break loc. 	TokenNameCOMMENT_LINE	So we just check if we need to update our break loc. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
isBreakChar	TokenNameIdentifier	 is Break Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
breakGI	TokenNameIdentifier	 break GI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
breakGI	TokenNameIdentifier	 break GI
.	TokenNameDOT	
isBreakChar	TokenNameIdentifier	 is Break Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Make this the new break if curr char is a 	TokenNameCOMMENT_LINE	Make this the new break if curr char is a 
// break char or we don't have any break chars 	TokenNameCOMMENT_LINE	break char or we don't have any break chars 
// yet, or our current break char is also not 	TokenNameCOMMENT_LINE	yet, or our current break char is also not 
// a break char. 	TokenNameCOMMENT_LINE	a break char. 
newBreakGI	TokenNameIdentifier	 new Break GI
=	TokenNameEQUAL	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
newBreakGI	TokenNameIdentifier	 new Break GI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
getChar	TokenNameIdentifier	 get Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
GlyphIterator	TokenNameIdentifier	 Glyph Iterator
.	TokenNameDOT	
ZERO_WIDTH_JOINER	TokenNameIdentifier	 ZERO  WIDTH  JOINER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyphIterator	TokenNameIdentifier	 Glyph Iterator
tmpGI	TokenNameIdentifier	 tmp GI
=	TokenNameEQUAL	
breakGI	TokenNameIdentifier	 break GI
;	TokenNameSEMICOLON	
breakGI	TokenNameIdentifier	 break GI
=	TokenNameEQUAL	
newBreakGI	TokenNameIdentifier	 new Break GI
;	TokenNameSEMICOLON	
newBreakGI	TokenNameIdentifier	 new Break GI
=	TokenNameEQUAL	
tmpGI	TokenNameIdentifier	 tmp GI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println(" Brk Adv: " + gi.getAdv()); 	TokenNameCOMMENT_LINE	System.out.println(" Brk Adv: " + gi.getAdv()); 
// We will now attempt to break the line just 	TokenNameCOMMENT_LINE	We will now attempt to break the line just 
// after 'gi'. 	TokenNameCOMMENT_LINE	after 'gi'. 
// Note we are trying to figure out where the current 	TokenNameCOMMENT_LINE	Note we are trying to figure out where the current 
// line is going to be placed (not the next line). We 	TokenNameCOMMENT_LINE	line is going to be placed (not the next line). We 
// must wait until we have a potential line break so 	TokenNameCOMMENT_LINE	must wait until we have a potential line break so 
// we know how tall the line is. 	TokenNameCOMMENT_LINE	we know how tall the line is. 
// Get the nomial line advance based on the 	TokenNameCOMMENT_LINE	Get the nomial line advance based on the 
// largest font we encountered on line... 	TokenNameCOMMENT_LINE	largest font we encountered on line... 
float	TokenNamefloat	
lineSize	TokenNameIdentifier	 line Size
=	TokenNameEQUAL	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
getMaxAscent	TokenNameIdentifier	 get Max Ascent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
getMaxDescent	TokenNameIdentifier	 get Max Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
lineBoxHeight	TokenNameIdentifier	 line Box Height
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lineHeightRelative	TokenNameIdentifier	 line Height Relative
)	TokenNameRPAREN	
lineBoxHeight	TokenNameIdentifier	 line Box Height
=	TokenNameEQUAL	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
getMaxFontSize	TokenNameIdentifier	 get Max Font Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
lineHeight	TokenNameIdentifier	 line Height
;	TokenNameSEMICOLON	
else	TokenNameelse	
lineBoxHeight	TokenNameIdentifier	 line Box Height
=	TokenNameEQUAL	
lineHeight	TokenNameIdentifier	 line Height
;	TokenNameSEMICOLON	
float	TokenNamefloat	
halfLeading	TokenNameIdentifier	 half Leading
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lineBoxHeight	TokenNameIdentifier	 line Box Height
-	TokenNameMINUS	
lineSize	TokenNameIdentifier	 line Size
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
ladv	TokenNameIdentifier	 ladv
=	TokenNameEQUAL	
prevDesc	TokenNameIdentifier	 prev Desc
+	TokenNamePLUS	
halfLeading	TokenNameIdentifier	 half Leading
+	TokenNamePLUS	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
getMaxAscent	TokenNameIdentifier	 get Max Ascent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
newDesc	TokenNameIdentifier	 new Desc
=	TokenNameEQUAL	
halfLeading	TokenNameIdentifier	 half Leading
+	TokenNamePLUS	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
getMaxDescent	TokenNameIdentifier	 get Max Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
+=	TokenNamePLUS_EQUAL	
ladv	TokenNameIdentifier	 ladv
;	TokenNameSEMICOLON	
float	TokenNamefloat	
bottomEdge	TokenNameIdentifier	 bottom Edge
=	TokenNameEQUAL	
newDesc	TokenNameIdentifier	 new Desc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newDesc	TokenNameIdentifier	 new Desc
<	TokenNameLESS	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
getMaxDescent	TokenNameIdentifier	 get Max Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
bottomEdge	TokenNameIdentifier	 bottom Edge
=	TokenNameEQUAL	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
getMaxDescent	TokenNameIdentifier	 get Max Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
+	TokenNamePLUS	
bottomEdge	TokenNameIdentifier	 bottom Edge
)	TokenNameRPAREN	
>	TokenNameGREATER	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The current Line doesn't fit in the 	TokenNameCOMMENT_LINE	The current Line doesn't fit in the 
// current flow rectangle so we need to 	TokenNameCOMMENT_LINE	current flow rectangle so we need to 
// move line to the next flow rect. 	TokenNameCOMMENT_LINE	move line to the next flow rect. 
// System.out.println("Doesn't Fit: " + dy); 	TokenNameCOMMENT_LINE	System.out.println("Doesn't Fit: " + dy); 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
flowRectsIter	TokenNameIdentifier	 flow Rects Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentRegion	TokenNameIdentifier	 current Region
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
gi	TokenNameIdentifier	 gi
=	TokenNameEQUAL	
lineGI	TokenNameIdentifier	 line GI
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// No flow rect stop layout here... 	TokenNameCOMMENT_LINE	No flow rect stop layout here... 
}	TokenNameRBRACE	
// Remember how wide this rectangle is... 	TokenNameCOMMENT_LINE	Remember how wide this rectangle is... 
float	TokenNamefloat	
oldWidth	TokenNameIdentifier	 old Width
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
// Get info for new flow rect. 	TokenNameCOMMENT_LINE	Get info for new flow rect. 
currentRegion	TokenNameIdentifier	 current Region
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RegionInfo	TokenNameIdentifier	 Region Info
)	TokenNameRPAREN	
flowRectsIter	TokenNameIdentifier	 flow Rects Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
leftMargin	TokenNameIdentifier	 left Margin
;	TokenNameSEMICOLON	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
leftMargin	TokenNameIdentifier	 left Margin
+	TokenNamePLUS	
rightMargin	TokenNameIdentifier	 right Margin
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// start a new alignment offset for this flow rect.. 	TokenNameCOMMENT_LINE	start a new alignment offset for this flow rect.. 
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// New rect so no previous row to consider... 	TokenNameCOMMENT_LINE	New rect so no previous row to consider... 
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
firstLine	TokenNameIdentifier	 first Line
?	TokenNameQUESTION	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getTopMargin	TokenNameIdentifier	 get Top Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
prevDesc	TokenNameIdentifier	 prev Desc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// previous flows? 	TokenNameCOMMENT_LINE	previous flows? 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
oldWidth	TokenNameIdentifier	 old Width
>	TokenNameGREATER	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
lnBreaks	TokenNameIdentifier	 ln Breaks
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// need to back up to start of line... 	TokenNameCOMMENT_LINE	need to back up to start of line... 
gi	TokenNameIdentifier	 gi
=	TokenNameEQUAL	
lineGI	TokenNameIdentifier	 line GI
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prevDesc	TokenNameIdentifier	 prev Desc
=	TokenNameEQUAL	
newDesc	TokenNameIdentifier	 new Desc
+	TokenNamePLUS	
(	TokenNameLPAREN	
nextLineMult	TokenNameIdentifier	 next Line Mult
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
lineBoxHeight	TokenNameIdentifier	 line Box Height
;	TokenNameSEMICOLON	
nextLineMult	TokenNameIdentifier	 next Line Mult
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
updateVerticalAlignOffset	TokenNameIdentifier	 update Vertical Align Offset
(	TokenNameLPAREN	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
,	TokenNameCOMMA	
currentRegion	TokenNameIdentifier	 current Region
,	TokenNameCOMMA	
dy	TokenNameIdentifier	 dy
+	TokenNamePLUS	
bottomEdge	TokenNameIdentifier	 bottom Edge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineInfos	TokenNameIdentifier	 line Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
partial	TokenNameIdentifier	 partial
,	TokenNameCOMMA	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Fit: " + dy); 	TokenNameCOMMENT_LINE	System.out.println("Fit: " + dy); 
x0	TokenNameIdentifier	 x0
-=	TokenNameMINUS_EQUAL	
leftMargin	TokenNameIdentifier	 left Margin
;	TokenNameSEMICOLON	
width	TokenNameIdentifier	 width
+=	TokenNamePLUS_EQUAL	
leftMargin	TokenNameIdentifier	 left Margin
+	TokenNamePLUS	
rightMargin	TokenNameIdentifier	 right Margin
;	TokenNameSEMICOLON	
leftMargin	TokenNameIdentifier	 left Margin
=	TokenNameEQUAL	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getLeftMargin	TokenNameIdentifier	 get Left Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rightMargin	TokenNameIdentifier	 right Margin
=	TokenNameEQUAL	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getRightMargin	TokenNameIdentifier	 get Right Margin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x0	TokenNameIdentifier	 x0
+=	TokenNamePLUS_EQUAL	
leftMargin	TokenNameIdentifier	 left Margin
;	TokenNameSEMICOLON	
width	TokenNameIdentifier	 width
-=	TokenNameMINUS_EQUAL	
leftMargin	TokenNameIdentifier	 left Margin
+	TokenNamePLUS	
rightMargin	TokenNameIdentifier	 right Margin
;	TokenNameSEMICOLON	
firstLine	TokenNameIdentifier	 first Line
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// The line fits in the current flow rectangle. 	TokenNameCOMMENT_LINE	The line fits in the current flow rectangle. 
lineGI	TokenNameIdentifier	 line GI
=	TokenNameEQUAL	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
lineGI	TokenNameIdentifier	 line GI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
breakGI	TokenNameIdentifier	 break GI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dy	TokenNameIdentifier	 dy
+=	TokenNamePLUS_EQUAL	
prevDesc	TokenNameIdentifier	 prev Desc
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
getGlyphIndex	TokenNameIdentifier	 get Glyph Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
numGlyphs	TokenNameIdentifier	 num Glyphs
)	TokenNameRPAREN	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
setGlyphVisible	TokenNameIdentifier	 set Glyph Visible
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
isFlowRegionBreak	TokenNameIdentifier	 is Flow Region Break
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Move to next flow region.. 	TokenNameCOMMENT_LINE	Move to next flow region.. 
currentRegion	TokenNameIdentifier	 current Region
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
flowRectsIter	TokenNameIdentifier	 flow Rects Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentRegion	TokenNameIdentifier	 current Region
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RegionInfo	TokenNameIdentifier	 Region Info
)	TokenNameRPAREN	
flowRectsIter	TokenNameIdentifier	 flow Rects Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
currentRegion	TokenNameIdentifier	 current Region
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Don't use this paragraph's info in next 	TokenNameCOMMENT_LINE	Don't use this paragraph's info in next 
// flow region! 	TokenNameCOMMENT_LINE	flow region! 
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
prevBotMargin	TokenNameIdentifier	 prev Bot Margin
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
<	TokenNameLESS	
acis	TokenNameIdentifier	 acis
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
chunk	TokenNameIdentifier	 chunk
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
lineInfos	TokenNameIdentifier	 line Infos
=	TokenNameEQUAL	
chunkLineInfos	TokenNameIdentifier	 chunk Line Infos
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lineInfos	TokenNameIdentifier	 line Infos
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
=	TokenNameEQUAL	
acis	TokenNameIdentifier	 acis
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MarginInfo	TokenNameIdentifier	 Margin Info
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MarginInfo	TokenNameIdentifier	 Margin Info
)	TokenNameRPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
FLOW_PARAGRAPH	TokenNameIdentifier	 FLOW  PARAGRAPH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
justification	TokenNameIdentifier	 justification
=	TokenNameEQUAL	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getJustification	TokenNameIdentifier	 get Justification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
gv	TokenNameIdentifier	 gv
=	TokenNameEQUAL	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gv	TokenNameIdentifier	 gv
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
GlyphIterator	TokenNameIdentifier	 Glyph Iterator
gi	TokenNameIdentifier	 gi
=	TokenNameEQUAL	
gis	TokenNameIdentifier	 gis
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
layoutChunk	TokenNameIdentifier	 layout Chunk
(	TokenNameLPAREN	
gv	TokenNameIdentifier	 gv
,	TokenNameCOMMA	
gi	TokenNameIdentifier	 gi
.	TokenNameDOT	
getOrigin	TokenNameIdentifier	 get Origin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
justification	TokenNameIdentifier	 justification
,	TokenNameCOMMA	
lineInfos	TokenNameIdentifier	 line Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Updates the specified verticalAlignmentOffset using the current * alignment rule and the heights of the flow rect and the maximum * descent of the text. This method gets for called every line, * but only the value that is calculated for the last line of the * flow rect is used by the glyph rendering. This is achieved by * creating a new verticalAlignOffset object everytime a new flow * rect is encountered, thus a single verticalAlignmentOffset is * shared for all {@link LineInfo} objects created for a given * flow rect. The value is calculated by determining the left * over space in the flow rect and scaling that value by 1.0 to * align to the bottom, 0.5 for middle and 0.0 for top. * * @param verticalAlignOffset the {@link java.awt.geom.Point2D.Float} * object that is storing the alignment offset. * @param region the {@link RegionInfo} object that we are rendering into. * @param maxDescent the very lowest point this line reaches. */	TokenNameCOMMENT_JAVADOC	 Updates the specified verticalAlignmentOffset using the current alignment rule and the heights of the flow rect and the maximum descent of the text. This method gets for called every line, but only the value that is calculated for the last line of the flow rect is used by the glyph rendering. This is achieved by creating a new verticalAlignOffset object everytime a new flow rect is encountered, thus a single verticalAlignmentOffset is shared for all {@link LineInfo} objects created for a given flow rect. The value is calculated by determining the left over space in the flow rect and scaling that value by 1.0 to align to the bottom, 0.5 for middle and 0.0 for top. * @param verticalAlignOffset the {@link java.awt.geom.Point2D.Float} object that is storing the alignment offset. @param region the {@link RegionInfo} object that we are rendering into. @param maxDescent the very lowest point this line reaches. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
updateVerticalAlignOffset	TokenNameIdentifier	 update Vertical Align Offset
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
,	TokenNameCOMMA	
RegionInfo	TokenNameIdentifier	 Region Info
region	TokenNameIdentifier	 region
,	TokenNameCOMMA	
float	TokenNamefloat	
maxDescent	TokenNameIdentifier	 max Descent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
freeSpace	TokenNameIdentifier	 free Space
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
region	TokenNameIdentifier	 region
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
maxDescent	TokenNameIdentifier	 max Descent
;	TokenNameSEMICOLON	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
region	TokenNameIdentifier	 region
.	TokenNameDOT	
getVerticalAlignment	TokenNameIdentifier	 get Vertical Alignment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
freeSpace	TokenNameIdentifier	 free Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
layoutChunk	TokenNameIdentifier	 layout Chunk
(	TokenNameLPAREN	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
gv	TokenNameIdentifier	 gv
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
origin	TokenNameIdentifier	 origin
,	TokenNameCOMMA	
int	TokenNameint	
justification	TokenNameIdentifier	 justification
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
lineInfos	TokenNameIdentifier	 line Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
lInfoIter	TokenNameIdentifier	 l Info Iter
=	TokenNameEQUAL	
lineInfos	TokenNameIdentifier	 line Infos
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numGlyphs	TokenNameIdentifier	 num Glyphs
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gp	TokenNameIdentifier	 gp
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getGlyphPositions	TokenNameIdentifier	 get Glyph Positions
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numGlyphs	TokenNameIdentifier	 num Glyphs
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
lineLoc	TokenNameIdentifier	 line Loc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
lineAdv	TokenNameIdentifier	 line Adv
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
lineVAdv	TokenNameIdentifier	 line V Adv
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
xOrig	TokenNameIdentifier	 x Orig
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
origin	TokenNameIdentifier	 origin
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
yOrig	TokenNameIdentifier	 y Orig
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
origin	TokenNameIdentifier	 origin
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
xScale	TokenNameIdentifier	 x Scale
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
xAdj	TokenNameIdentifier	 x Adj
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
charW	TokenNameIdentifier	 char W
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
lineWidth	TokenNameIdentifier	 line Width
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
partial	TokenNameIdentifier	 partial
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// This loop goes through and puts glyphs where they belong 	TokenNameCOMMENT_LINE	This loop goes through and puts glyphs where they belong 
// based on info collected in first trip through glyphVector... 	TokenNameCOMMENT_LINE	based on info collected in first trip through glyphVector... 
int	TokenNameint	
lineEnd	TokenNameIdentifier	 line End
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numGlyphs	TokenNameIdentifier	 num Glyphs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
lineEnd	TokenNameIdentifier	 line End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Always comes through here on first char... 	TokenNameCOMMENT_LINE	Always comes through here on first char... 
// Update offset for new line based on last line length 	TokenNameCOMMENT_LINE	Update offset for new line based on last line length 
xOrig	TokenNameIdentifier	 x Orig
+=	TokenNamePLUS_EQUAL	
lineAdv	TokenNameIdentifier	 line Adv
;	TokenNameSEMICOLON	
// Get new values for everything... 	TokenNameCOMMENT_LINE	Get new values for everything... 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
lInfoIter	TokenNameIdentifier	 l Info Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
LineInfo	TokenNameIdentifier	 Line Info
li	TokenNameIdentifier	 li
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LineInfo	TokenNameIdentifier	 Line Info
)	TokenNameRPAREN	
lInfoIter	TokenNameIdentifier	 l Info Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println(li.toString()); 	TokenNameCOMMENT_LINE	System.out.println(li.toString()); 
lineEnd	TokenNameIdentifier	 line End
=	TokenNameEQUAL	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
getEndIdx	TokenNameIdentifier	 get End Idx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineLoc	TokenNameIdentifier	 line Loc
=	TokenNameEQUAL	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineAdv	TokenNameIdentifier	 line Adv
=	TokenNameEQUAL	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
getAdvance	TokenNameIdentifier	 get Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineVAdv	TokenNameIdentifier	 line V Adv
=	TokenNameEQUAL	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
getVisualAdvance	TokenNameIdentifier	 get Visual Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charW	TokenNameIdentifier	 char W
=	TokenNameEQUAL	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
getLastCharWidth	TokenNameIdentifier	 get Last Char Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineWidth	TokenNameIdentifier	 line Width
=	TokenNameEQUAL	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
getLineWidth	TokenNameIdentifier	 get Line Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
partial	TokenNameIdentifier	 partial
=	TokenNameEQUAL	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
isPartialLine	TokenNameIdentifier	 is Partial Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
=	TokenNameEQUAL	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
getVerticalAlignOffset	TokenNameIdentifier	 get Vertical Align Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
xAdj	TokenNameIdentifier	 x Adj
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
xScale	TokenNameIdentifier	 x Scale
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Recalc justification info. 	TokenNameCOMMENT_LINE	Recalc justification info. 
switch	TokenNameswitch	
(	TokenNameLPAREN	
justification	TokenNameIdentifier	 justification
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Left 	TokenNameCOMMENT_LINE	Left 
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// Center 	TokenNameCOMMENT_LINE	Center 
xAdj	TokenNameIdentifier	 x Adj
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lineWidth	TokenNameIdentifier	 line Width
-	TokenNameMINUS	
lineVAdv	TokenNameIdentifier	 line V Adv
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// Right 	TokenNameCOMMENT_LINE	Right 
xAdj	TokenNameIdentifier	 x Adj
=	TokenNameEQUAL	
lineWidth	TokenNameIdentifier	 line Width
-	TokenNameMINUS	
lineVAdv	TokenNameIdentifier	 line V Adv
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// Full 	TokenNameCOMMENT_LINE	Full 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
!	TokenNameNOT	
partial	TokenNameIdentifier	 partial
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
lineEnd	TokenNameIdentifier	 line End
!=	TokenNameNOT_EQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// More than one char on line... 	TokenNameCOMMENT_LINE	More than one char on line... 
// Scale char spacing to fill line. 	TokenNameCOMMENT_LINE	Scale char spacing to fill line. 
xScale	TokenNameIdentifier	 x Scale
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lineWidth	TokenNameIdentifier	 line Width
-	TokenNameMINUS	
charW	TokenNameIdentifier	 char W
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
lineVAdv	TokenNameIdentifier	 line V Adv
-	TokenNameMINUS	
charW	TokenNameIdentifier	 char W
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
lineLoc	TokenNameIdentifier	 line Loc
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
(	TokenNameLPAREN	
gp	TokenNameIdentifier	 gp
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
xOrig	TokenNameIdentifier	 x Orig
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xScale	TokenNameIdentifier	 x Scale
+	TokenNamePLUS	
xAdj	TokenNameIdentifier	 x Adj
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
lineLoc	TokenNameIdentifier	 line Loc
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
gp	TokenNameIdentifier	 gp
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
yOrig	TokenNameIdentifier	 y Orig
)	TokenNameRPAREN	
+	TokenNamePLUS	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
setGlyphPosition	TokenNameIdentifier	 set Glyph Position
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
xOrig	TokenNameIdentifier	 x Orig
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
yOrig	TokenNameIdentifier	 y Orig
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lineLoc	TokenNameIdentifier	 line Loc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
lineLoc	TokenNameIdentifier	 line Loc
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
(	TokenNameLPAREN	
gp	TokenNameIdentifier	 gp
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
xOrig	TokenNameIdentifier	 x Orig
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
xScale	TokenNameIdentifier	 x Scale
+	TokenNamePLUS	
xAdj	TokenNameIdentifier	 x Adj
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
lineLoc	TokenNameIdentifier	 line Loc
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
(	TokenNameLPAREN	
gp	TokenNameIdentifier	 gp
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
yOrig	TokenNameIdentifier	 y Orig
)	TokenNameRPAREN	
+	TokenNamePLUS	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
setGlyphPosition	TokenNameIdentifier	 set Glyph Position
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
