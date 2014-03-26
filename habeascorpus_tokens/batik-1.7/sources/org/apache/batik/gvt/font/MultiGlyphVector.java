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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedCharacterSpanIterator	TokenNameIdentifier	 Attributed Character Span Iterator
;	TokenNameSEMICOLON	
/** * * @version $Id: MultiGlyphVector.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 * @version $Id: MultiGlyphVector.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
MultiGlyphVector	TokenNameIdentifier	 Multi Glyph Vector
implements	TokenNameimplements	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
{	TokenNameLBRACE	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gvs	TokenNameIdentifier	 gvs
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nGlyphs	TokenNameIdentifier	 n Glyphs
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
int	TokenNameint	
nGlyph	TokenNameIdentifier	 n Glyph
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultiGlyphVector	TokenNameIdentifier	 Multi Glyph Vector
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
gvs	TokenNameIdentifier	 gvs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nSlots	TokenNameIdentifier	 n Slots
=	TokenNameEQUAL	
gvs	TokenNameIdentifier	 gvs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
gvs	TokenNameIdentifier	 gvs
=	TokenNameEQUAL	
new	TokenNamenew	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
[	TokenNameLBRACKET	
nSlots	TokenNameIdentifier	 n Slots
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nGlyphs	TokenNameIdentifier	 n Glyphs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
nSlots	TokenNameIdentifier	 n Slots
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
off	TokenNameIdentifier	 off
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
nSlots	TokenNameIdentifier	 n Slots
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
gvs	TokenNameIdentifier	 gvs
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
nGlyph	TokenNameIdentifier	 n Glyph
;	TokenNameSEMICOLON	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
gv	TokenNameIdentifier	 gv
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
;	TokenNameSEMICOLON	
nGlyphs	TokenNameIdentifier	 n Glyphs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nGlyph	TokenNameIdentifier	 n Glyph
+=	TokenNamePLUS_EQUAL	
nGlyphs	TokenNameIdentifier	 n Glyphs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nGlyphs	TokenNameIdentifier	 n Glyphs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of glyphs in this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the number of glyphs in this GlyphVector. 
public	TokenNamepublic	
int	TokenNameint	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nGlyph	TokenNameIdentifier	 n Glyph
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
int	TokenNameint	
glyphIdx	TokenNameIdentifier	 glyph Idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glyphIdx	TokenNameIdentifier	 glyph Idx
>	TokenNameGREATER	
nGlyph	TokenNameIdentifier	 n Glyph
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyphIdx	TokenNameIdentifier	 glyph Idx
==	TokenNameEQUAL_EQUAL	
nGlyph	TokenNameIdentifier	 n Glyph
)	TokenNameRPAREN	
return	TokenNamereturn	
gvs	TokenNameIdentifier	 gvs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
nGlyphs	TokenNameIdentifier	 n Glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
glyphIdx	TokenNameIdentifier	 glyph Idx
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<	TokenNameLESS	
nGlyphs	TokenNameIdentifier	 n Glyphs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Font associated with this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the Font associated with this GlyphVector. 
public	TokenNamepublic	
GVTFont	TokenNameIdentifier	 GVT Font
getFont	TokenNameIdentifier	 get Font
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Can't be correctly Implemented"	TokenNameStringLiteral	Can't be correctly Implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the FontRenderContext associated with this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the FontRenderContext associated with this GlyphVector. 
public	TokenNamepublic	
FontRenderContext	TokenNameIdentifier	 Font Render Context
getFontRenderContext	TokenNameIdentifier	 get Font Render Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getFontRenderContext	TokenNameIdentifier	 get Font Render Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the glyphcode of the specified glyph. */	TokenNameCOMMENT_JAVADOC	 Returns the glyphcode of the specified glyph. 
public	TokenNamepublic	
int	TokenNameint	
getGlyphCode	TokenNameIdentifier	 get Glyph Code
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphCode	TokenNameIdentifier	 get Glyph Code
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the justification information for the glyph at the specified * index into this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the justification information for the glyph at the specified index into this GlyphVector. 
public	TokenNamepublic	
GlyphJustificationInfo	TokenNameIdentifier	 Glyph Justification Info
getGlyphJustificationInfo	TokenNameIdentifier	 get Glyph Justification Info
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphJustificationInfo	TokenNameIdentifier	 get Glyph Justification Info
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the logical bounds of the specified glyph within this * GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the logical bounds of the specified glyph within this GlyphVector. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getGlyphLogicalBounds	TokenNameIdentifier	 get Glyph Logical Bounds
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphLogicalBounds	TokenNameIdentifier	 get Glyph Logical Bounds
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the metrics of the glyph at the specified index into this * GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the metrics of the glyph at the specified index into this GlyphVector. 
public	TokenNamepublic	
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Shape whose interior corresponds to the visual representation * of the specified glyph within this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns a Shape whose interior corresponds to the visual representation of the specified glyph within this GlyphVector. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getGlyphOutline	TokenNameIdentifier	 get Glyph Outline
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphOutline	TokenNameIdentifier	 get Glyph Outline
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounding box of the specified glyph, considering only the * glyph's metrics (ascent, descent, advance) rather than the actual glyph * shape. */	TokenNameCOMMENT_JAVADOC	 Returns the bounding box of the specified glyph, considering only the glyph's metrics (ascent, descent, advance) rather than the actual glyph shape. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGlyphCellBounds	TokenNameIdentifier	 get Glyph Cell Bounds
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getGlyphLogicalBounds	TokenNameIdentifier	 get Glyph Logical Bounds
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position of the specified glyph within this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the position of the specified glyph within this GlyphVector. 
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
getGlyphPosition	TokenNameIdentifier	 get Glyph Position
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphPosition	TokenNameIdentifier	 get Glyph Position
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the transform of the specified glyph within this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Gets the transform of the specified glyph within this GlyphVector. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getGlyphTransform	TokenNameIdentifier	 get Glyph Transform
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphTransform	TokenNameIdentifier	 get Glyph Transform
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the visual bounds of the specified glyph within the GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the visual bounds of the specified glyph within the GlyphVector. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getGlyphVisualBounds	TokenNameIdentifier	 get Glyph Visual Bounds
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphVisualBounds	TokenNameIdentifier	 get Glyph Visual Bounds
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the position of the specified glyph within this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Sets the position of the specified glyph within this GlyphVector. 
public	TokenNamepublic	
void	TokenNamevoid	
setGlyphPosition	TokenNameIdentifier	 set Glyph Position
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
newPos	TokenNameIdentifier	 new Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("setting: " + idx + " - " + (glyphIndex-off[idx]) + 	TokenNameCOMMENT_LINE	System.out.println("setting: " + idx + " - " + (glyphIndex-off[idx]) + 
// " -> " + newPos); 	TokenNameCOMMENT_LINE	" -> " + newPos); 
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
setGlyphPosition	TokenNameIdentifier	 set Glyph Position
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
newPos	TokenNameIdentifier	 new Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the transform of the specified glyph within this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Sets the transform of the specified glyph within this GlyphVector. 
public	TokenNamepublic	
void	TokenNamevoid	
setGlyphTransform	TokenNameIdentifier	 set Glyph Transform
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
newTX	TokenNameIdentifier	 new TX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
setGlyphTransform	TokenNameIdentifier	 set Glyph Transform
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
newTX	TokenNameIdentifier	 new TX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells the glyph vector whether or not to draw the specified glyph. */	TokenNameCOMMENT_JAVADOC	 Tells the glyph vector whether or not to draw the specified glyph. 
public	TokenNamepublic	
void	TokenNamevoid	
setGlyphVisible	TokenNameIdentifier	 set Glyph Visible
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
visible	TokenNameIdentifier	 visible
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
setGlyphVisible	TokenNameIdentifier	 set Glyph Visible
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
visible	TokenNameIdentifier	 visible
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if specified glyph will be drawn. */	TokenNameCOMMENT_JAVADOC	 Returns true if specified glyph will be drawn. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isGlyphVisible	TokenNameIdentifier	 is Glyph Visible
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
isGlyphVisible	TokenNameIdentifier	 is Glyph Visible
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array of glyphcodes for the specified glyphs. */	TokenNameCOMMENT_JAVADOC	 Returns an array of glyphcodes for the specified glyphs. 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
codeReturn	TokenNameIdentifier	 code Return
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numEntries	TokenNameIdentifier	 num Entries
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
gvIdx	TokenNameIdentifier	 gv Idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
gi	TokenNameIdentifier	 gi
=	TokenNameEQUAL	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
gvIdx	TokenNameIdentifier	 gv Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
gv	TokenNameIdentifier	 gv
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
numEntries	TokenNameIdentifier	 num Entries
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
numEntries	TokenNameIdentifier	 num Entries
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
nGlyphs	TokenNameIdentifier	 n Glyphs
[	TokenNameLBRACKET	
gvIdx	TokenNameIdentifier	 gv Idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
nGlyphs	TokenNameIdentifier	 n Glyphs
[	TokenNameLBRACKET	
gvIdx	TokenNameIdentifier	 gv Idx
]	TokenNameRBRACKET	
-	TokenNameMINUS	
gi	TokenNameIdentifier	 gi
;	TokenNameSEMICOLON	
gv	TokenNameIdentifier	 gv
=	TokenNameEQUAL	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
gvIdx	TokenNameIdentifier	 gv Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getGlyphCodes	TokenNameIdentifier	 get Glyph Codes
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getGlyphCodes	TokenNameIdentifier	 get Glyph Codes
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
gi	TokenNameIdentifier	 gi
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gvIdx	TokenNameIdentifier	 gv Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
numEntries	TokenNameIdentifier	 num Entries
-=	TokenNameMINUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array of glyph positions for the specified glyphs */	TokenNameCOMMENT_JAVADOC	 Returns an array of glyph positions for the specified glyphs 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
positionReturn	TokenNameIdentifier	 position Return
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
numEntries	TokenNameIdentifier	 num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
gvIdx	TokenNameIdentifier	 gv Idx
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
gi	TokenNameIdentifier	 gi
=	TokenNameEQUAL	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
gvIdx	TokenNameIdentifier	 gv Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
gv	TokenNameIdentifier	 gv
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
numEntries	TokenNameIdentifier	 num Entries
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
numEntries	TokenNameIdentifier	 num Entries
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
nGlyphs	TokenNameIdentifier	 n Glyphs
[	TokenNameLBRACKET	
gvIdx	TokenNameIdentifier	 gv Idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
nGlyphs	TokenNameIdentifier	 n Glyphs
[	TokenNameLBRACKET	
gvIdx	TokenNameIdentifier	 gv Idx
]	TokenNameRBRACKET	
-	TokenNameMINUS	
gi	TokenNameIdentifier	 gi
;	TokenNameSEMICOLON	
gv	TokenNameIdentifier	 gv
=	TokenNameEQUAL	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
gvIdx	TokenNameIdentifier	 gv Idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getGlyphPositions	TokenNameIdentifier	 get Glyph Positions
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
len	TokenNameIdentifier	 len
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getGlyphPositions	TokenNameIdentifier	 get Glyph Positions
(	TokenNameLPAREN	
gi	TokenNameIdentifier	 gi
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
gi	TokenNameIdentifier	 gi
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gvIdx	TokenNameIdentifier	 gv Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
numEntries	TokenNameIdentifier	 num Entries
-=	TokenNameMINUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the logical bounds of this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the logical bounds of this GlyphVector. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getLogicalBounds	TokenNameIdentifier	 get Logical Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
gvs	TokenNameIdentifier	 gvs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLogicalBounds	TokenNameIdentifier	 get Logical Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
//else ret = ret.createUnion(b); 	TokenNameCOMMENT_LINE	else ret = ret.createUnion(b); 
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same as union 	TokenNameCOMMENT_LINE	same as union 
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Shape whose interior corresponds to the visual representation * of this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns a Shape whose interior corresponds to the visual representation of this GlyphVector. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GeneralPath	TokenNameIdentifier	 General Path
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
gvs	TokenNameIdentifier	 gvs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Shape whose interior corresponds to the visual representation * of this GlyphVector, offset to x, y. */	TokenNameCOMMENT_JAVADOC	 Returns a Shape whose interior corresponds to the visual representation of this GlyphVector, offset to x, y. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getTranslateInstance	TokenNameIdentifier	 get Translate Instance
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
outline	TokenNameIdentifier	 outline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
outline	TokenNameIdentifier	 outline
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of this GlyphVector. This includes * stroking effects. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of this GlyphVector. This includes stroking effects. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
gvs	TokenNameIdentifier	 gvs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
gv	TokenNameIdentifier	 gv
=	TokenNameEQUAL	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getCharacterCount	TokenNameIdentifier	 get Character Count
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
new	TokenNamenew	
AttributedCharacterSpanIterator	TokenNameIdentifier	 Attributed Character Span Iterator
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
//else ret = ret.createUnion(b); 	TokenNameCOMMENT_LINE	else ret = ret.createUnion(b); 
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the geometric bounds of this GlyphVector. The geometric * bounds is the bounds of the geometry of the glyph vector, * disregarding stroking. */	TokenNameCOMMENT_JAVADOC	 Returns the geometric bounds of this GlyphVector. The geometric bounds is the bounds of the geometry of the glyph vector, disregarding stroking. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGeometricBounds	TokenNameIdentifier	 get Geometric Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
gvs	TokenNameIdentifier	 gvs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGeometricBounds	TokenNameIdentifier	 get Geometric Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
//else ret = ret.createUnion(b); 	TokenNameCOMMENT_LINE	else ret = ret.createUnion(b); 
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
performDefaultLayout	TokenNameIdentifier	 perform Default Layout
(	TokenNameLPAREN	
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
gvs	TokenNameIdentifier	 gvs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
performDefaultLayout	TokenNameIdentifier	 perform Default Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the number of chars represented by the glyphs within the * specified range. * * @param startGlyphIndex The index of the first glyph in the range. * @param endGlyphIndex The index of the last glyph in the range. * @return The number of chars. */	TokenNameCOMMENT_JAVADOC	 Returns the number of chars represented by the glyphs within the specified range. * @param startGlyphIndex The index of the first glyph in the range. @param endGlyphIndex The index of the last glyph in the range. @return The number of chars. 
public	TokenNamepublic	
int	TokenNameint	
getCharacterCount	TokenNameIdentifier	 get Character Count
(	TokenNameLPAREN	
int	TokenNameint	
startGlyphIndex	TokenNameIdentifier	 start Glyph Index
,	TokenNameCOMMA	
int	TokenNameint	
endGlyphIndex	TokenNameIdentifier	 end Glyph Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx1	TokenNameIdentifier	 idx1
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
startGlyphIndex	TokenNameIdentifier	 start Glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx2	TokenNameIdentifier	 idx2
=	TokenNameEQUAL	
getGVIdx	TokenNameIdentifier	 get GV Idx
(	TokenNameLPAREN	
endGlyphIndex	TokenNameIdentifier	 end Glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
idx1	TokenNameIdentifier	 idx1
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<=	TokenNameLESS_EQUAL	
idx2	TokenNameIdentifier	 idx2
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
gi1	TokenNameIdentifier	 gi1
=	TokenNameEQUAL	
startGlyphIndex	TokenNameIdentifier	 start Glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
gi2	TokenNameIdentifier	 gi2
=	TokenNameEQUAL	
endGlyphIndex	TokenNameIdentifier	 end Glyph Index
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gi2	TokenNameIdentifier	 gi2
>=	TokenNameGREATER_EQUAL	
nGlyphs	TokenNameIdentifier	 n Glyphs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gi2	TokenNameIdentifier	 gi2
=	TokenNameEQUAL	
nGlyphs	TokenNameIdentifier	 n Glyphs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCharacterCount	TokenNameIdentifier	 get Character Count
(	TokenNameLPAREN	
gi1	TokenNameIdentifier	 gi1
,	TokenNameCOMMA	
gi2	TokenNameIdentifier	 gi2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startGlyphIndex	TokenNameIdentifier	 start Glyph Index
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
gi2	TokenNameIdentifier	 gi2
-	TokenNameMINUS	
gi1	TokenNameIdentifier	 gi1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Draws the glyph vector. */	TokenNameCOMMENT_JAVADOC	 Draws the glyph vector. 
public	TokenNamepublic	
void	TokenNamevoid	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
,	TokenNameCOMMA	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
gvs	TokenNameIdentifier	 gvs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
gv	TokenNameIdentifier	 gv
=	TokenNameEQUAL	
gvs	TokenNameIdentifier	 gvs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getCharacterCount	TokenNameIdentifier	 get Character Count
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
,	TokenNameCOMMA	
new	TokenNamenew	
AttributedCharacterSpanIterator	TokenNameIdentifier	 Attributed Character Span Iterator
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
