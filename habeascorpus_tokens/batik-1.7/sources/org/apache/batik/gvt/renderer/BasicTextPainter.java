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
renderer	TokenNameIdentifier	 renderer
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
AffineTransform	TokenNameIdentifier	 Affine Transform
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
TextNode	TokenNameIdentifier	 Text Node
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
TextPainter	TokenNameIdentifier	 Text Painter
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
ConcreteTextLayoutFactory	TokenNameIdentifier	 Concrete Text Layout Factory
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
TextHit	TokenNameIdentifier	 Text Hit
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
TextLayoutFactory	TokenNameIdentifier	 Text Layout Factory
;	TokenNameSEMICOLON	
/** * Basic implementation of TextPainter which * renders the attributed character iterator of a <tt>TextNode</tt>. * Suitable for use with "standard" java.awt.font.TextAttributes only. * @see java.awt.font.TextAttribute * * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> * @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> * @version $Id: BasicTextPainter.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 Basic implementation of TextPainter which renders the attributed character iterator of a <tt>TextNode</tt>. Suitable for use with "standard" java.awt.font.TextAttributes only. @see java.awt.font.TextAttribute * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> @version $Id: BasicTextPainter.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BasicTextPainter	TokenNameIdentifier	 Basic Text Painter
implements	TokenNameimplements	
TextPainter	TokenNameIdentifier	 Text Painter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
TextLayoutFactory	TokenNameIdentifier	 Text Layout Factory
textLayoutFactory	TokenNameIdentifier	 text Layout Factory
=	TokenNameEQUAL	
new	TokenNamenew	
ConcreteTextLayoutFactory	TokenNameIdentifier	 Concrete Text Layout Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The font render context to use. */	TokenNameCOMMENT_JAVADOC	 The font render context to use. 
protected	TokenNameprotected	
FontRenderContext	TokenNameIdentifier	 Font Render Context
fontRenderContext	TokenNameIdentifier	 font Render Context
=	TokenNameEQUAL	
new	TokenNamenew	
FontRenderContext	TokenNameIdentifier	 Font Render Context
(	TokenNameLPAREN	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
FontRenderContext	TokenNameIdentifier	 Font Render Context
aaOffFontRenderContext	TokenNameIdentifier	 aa Off Font Render Context
=	TokenNameEQUAL	
new	TokenNamenew	
FontRenderContext	TokenNameIdentifier	 Font Render Context
(	TokenNameLPAREN	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
TextLayoutFactory	TokenNameIdentifier	 Text Layout Factory
getTextLayoutFactory	TokenNameIdentifier	 get Text Layout Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
textLayoutFactory	TokenNameIdentifier	 text Layout Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an X, y coordinate, AttributedCharacterIterator, * return a Mark which encapsulates a "selection start" action. * The standard order of method calls for selection is: * selectAt(); [selectTo(),...], selectTo(); getSelection(). */	TokenNameCOMMENT_JAVADOC	 Given an X, y coordinate, AttributedCharacterIterator, return a Mark which encapsulates a "selection start" action. The standard order of method calls for selection is: selectAt(); [selectTo(),...], selectTo(); getSelection(). 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
hitTest	TokenNameIdentifier	 hit Test
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an X, y coordinate, starting Mark, AttributedCharacterIterator, * return a Mark which encapsulates a "selection continued" action. * The standard order of method calls for selection is: * selectAt(); [selectTo(),...], selectTo(); getSelection(). */	TokenNameCOMMENT_JAVADOC	 Given an X, y coordinate, starting Mark, AttributedCharacterIterator, return a Mark which encapsulates a "selection continued" action. The standard order of method calls for selection is: selectAt(); [selectTo(),...], selectTo(); getSelection(). 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
beginMark	TokenNameIdentifier	 begin Mark
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
hitTest	TokenNameIdentifier	 hit Test
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
beginMark	TokenNameIdentifier	 begin Mark
.	TokenNameDOT	
getTextNode	TokenNameIdentifier	 get Text Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get a Rectangle2D in userspace coords which encloses the textnode * glyphs just including the geometry info. * @param node the TextNode to measure */	TokenNameCOMMENT_JAVADOC	 Get a Rectangle2D in userspace coords which encloses the textnode glyphs just including the geometry info. @param node the TextNode to measure 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
(	TokenNameLPAREN	
TextNode	TokenNameIdentifier	 Text Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the mark for the specified parameters. */	TokenNameCOMMENT_JAVADOC	 Returns the mark for the specified parameters. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
Mark	TokenNameIdentifier	 Mark
hitTest	TokenNameIdentifier	 hit Test
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
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
// Inner class - implementation of the Mark interface 	TokenNameCOMMENT_LINE	Inner class - implementation of the Mark interface 
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
/** * This TextPainter's implementation of the Mark interface. */	TokenNameCOMMENT_JAVADOC	 This TextPainter's implementation of the Mark interface. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
BasicMark	TokenNameIdentifier	 Basic Mark
implements	TokenNameimplements	
Mark	TokenNameIdentifier	 Mark
{	TokenNameLBRACE	
private	TokenNameprivate	
TextNode	TokenNameIdentifier	 Text Node
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TextHit	TokenNameIdentifier	 Text Hit
hit	TokenNameIdentifier	 hit
;	TokenNameSEMICOLON	
/** * Constructs a new Mark with the specified parameters. */	TokenNameCOMMENT_JAVADOC	 Constructs a new Mark with the specified parameters. 
protected	TokenNameprotected	
BasicMark	TokenNameIdentifier	 Basic Mark
(	TokenNameLPAREN	
TextNode	TokenNameIdentifier	 Text Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
TextHit	TokenNameIdentifier	 Text Hit
hit	TokenNameIdentifier	 hit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hit	TokenNameIdentifier	 hit
=	TokenNameEQUAL	
hit	TokenNameIdentifier	 hit
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextHit	TokenNameIdentifier	 Text Hit
getHit	TokenNameIdentifier	 get Hit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hit	TokenNameIdentifier	 hit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextNode	TokenNameIdentifier	 Text Node
getTextNode	TokenNameIdentifier	 get Text Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index of the character that has been hit. * * @return The character index. */	TokenNameCOMMENT_JAVADOC	 Returns the index of the character that has been hit. * @return The character index. 
public	TokenNamepublic	
int	TokenNameint	
getCharIndex	TokenNameIdentifier	 get Char Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hit	TokenNameIdentifier	 hit
.	TokenNameDOT	
getCharIndex	TokenNameIdentifier	 get Char Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
