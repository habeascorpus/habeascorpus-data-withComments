/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Mark	TokenNameIdentifier	 Mark
;	TokenNameSEMICOLON	
/** * Renders the attributed character iterator of a <tt>TextNode</tt>. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: TextPainter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Renders the attributed character iterator of a <tt>TextNode</tt>. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: TextPainter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
TextPainter	TokenNameIdentifier	 Text Painter
{	TokenNameLBRACE	
/** * Paints the specified attributed character iterator using the specified * Graphics2D and context and font context. * * @param node the TextNode to paint * @param g2d the Graphics2D to use */	TokenNameCOMMENT_JAVADOC	 Paints the specified attributed character iterator using the specified Graphics2D and context and font context. * @param node the TextNode to paint @param g2d the Graphics2D to use 
void	TokenNamevoid	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
TextNode	TokenNameIdentifier	 Text Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Initiates a text selection on a particular AttributedCharacterIterator, * using the text/font metrics employed by this TextPainter instance. */	TokenNameCOMMENT_JAVADOC	 Initiates a text selection on a particular AttributedCharacterIterator, using the text/font metrics employed by this TextPainter instance. 
Mark	TokenNameIdentifier	 Mark
selectAt	TokenNameIdentifier	 select At
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
TextNode	TokenNameIdentifier	 Text Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Continues a text selection on a particular AttributedCharacterIterator, * using the text/font metrics employed by this TextPainter instance. */	TokenNameCOMMENT_JAVADOC	 Continues a text selection on a particular AttributedCharacterIterator, using the text/font metrics employed by this TextPainter instance. 
Mark	TokenNameIdentifier	 Mark
selectTo	TokenNameIdentifier	 select To
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
Mark	TokenNameIdentifier	 Mark
beginMark	TokenNameIdentifier	 begin Mark
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Selects the first glyph in the text node. */	TokenNameCOMMENT_JAVADOC	 Selects the first glyph in the text node. 
Mark	TokenNameIdentifier	 Mark
selectFirst	TokenNameIdentifier	 select First
(	TokenNameLPAREN	
TextNode	TokenNameIdentifier	 Text Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Selects the last glyph in the text node. */	TokenNameCOMMENT_JAVADOC	 Selects the last glyph in the text node. 
Mark	TokenNameIdentifier	 Mark
selectLast	TokenNameIdentifier	 select Last
(	TokenNameLPAREN	
TextNode	TokenNameIdentifier	 Text Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a mark for the char at index in node's * AttributedCharacterIterator. Leading edge indicates if the * mark should be considered immediately 'before' glyph or * after */	TokenNameCOMMENT_JAVADOC	 Returns a mark for the char at index in node's AttributedCharacterIterator. Leading edge indicates if the mark should be considered immediately 'before' glyph or after 
Mark	TokenNameIdentifier	 Mark
getMark	TokenNameIdentifier	 get Mark
(	TokenNameLPAREN	
TextNode	TokenNameIdentifier	 Text Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
beforeGlyph	TokenNameIdentifier	 before Glyph
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get an array of index pairs corresponding to the indices within an * AttributedCharacterIterator regions bounded by two Marks. * * Note that the instances of Mark passed to this function <em>must * come</em> from the same TextPainter that generated them via selectAt() * and selectTo(), since the TextPainter implementation may rely on hidden * implementation details of its own Mark implementation. */	TokenNameCOMMENT_JAVADOC	 Get an array of index pairs corresponding to the indices within an AttributedCharacterIterator regions bounded by two Marks. * Note that the instances of Mark passed to this function <em>must come</em> from the same TextPainter that generated them via selectAt() and selectTo(), since the TextPainter implementation may rely on hidden implementation details of its own Mark implementation. 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSelected	TokenNameIdentifier	 get Selected
(	TokenNameLPAREN	
Mark	TokenNameIdentifier	 Mark
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
Mark	TokenNameIdentifier	 Mark
finish	TokenNameIdentifier	 finish
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get a Shape in userspace coords which encloses the textnode * glyphs bounded by two Marks. * Note that the instances of Mark passed to this function * <em>must come</em> * from the same TextPainter that generated them via selectAt() and * selectTo(), since the TextPainter implementation may rely on hidden * implementation details of its own Mark implementation. */	TokenNameCOMMENT_JAVADOC	 Get a Shape in userspace coords which encloses the textnode glyphs bounded by two Marks. Note that the instances of Mark passed to this function <em>must come</em> from the same TextPainter that generated them via selectAt() and selectTo(), since the TextPainter implementation may rely on hidden implementation details of its own Mark implementation. 
Shape	TokenNameIdentifier	 Shape
getHighlightShape	TokenNameIdentifier	 get Highlight Shape
(	TokenNameLPAREN	
Mark	TokenNameIdentifier	 Mark
beginMark	TokenNameIdentifier	 begin Mark
,	TokenNameCOMMA	
Mark	TokenNameIdentifier	 Mark
endMark	TokenNameIdentifier	 end Mark
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get a Shape in userspace coords which defines the textnode * glyph outlines. * @param node the TextNode to measure */	TokenNameCOMMENT_JAVADOC	 Get a Shape in userspace coords which defines the textnode glyph outlines. @param node the TextNode to measure 
Shape	TokenNameIdentifier	 Shape
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
TextNode	TokenNameIdentifier	 Text Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get a Rectangle2D in userspace coords which encloses the textnode * glyphs rendered bounds (includes stroke etc). * @param node the TextNode to measure */	TokenNameCOMMENT_JAVADOC	 Get a Rectangle2D in userspace coords which encloses the textnode glyphs rendered bounds (includes stroke etc). @param node the TextNode to measure 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
TextNode	TokenNameIdentifier	 Text Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get a Rectangle2D in userspace coords which encloses the textnode * glyphs just including the geometry info. * @param node the TextNode to measure */	TokenNameCOMMENT_JAVADOC	 Get a Rectangle2D in userspace coords which encloses the textnode glyphs just including the geometry info. @param node the TextNode to measure 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
(	TokenNameLPAREN	
TextNode	TokenNameIdentifier	 Text Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
