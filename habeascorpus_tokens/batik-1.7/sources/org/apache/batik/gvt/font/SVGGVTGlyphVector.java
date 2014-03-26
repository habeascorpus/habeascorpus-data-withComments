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
ArabicTextHandler	TokenNameIdentifier	 Arabic Text Handler
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
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
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
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
;	TokenNameSEMICOLON	
/** * A GVTGlyphVector class for SVG fonts. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: SVGGVTGlyphVector.java 594379 2007-11-13 01:08:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A GVTGlyphVector class for SVG fonts. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: SVGGVTGlyphVector.java 594379 2007-11-13 01:08:28Z cam $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SVGGVTGlyphVector	TokenNameIdentifier	 SVGGVT Glyph Vector
implements	TokenNameimplements	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
PAINT_INFO	TokenNameIdentifier	 PAINT  INFO
=	TokenNameEQUAL	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
PAINT_INFO	TokenNameIdentifier	 PAINT  INFO
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GVTFont	TokenNameIdentifier	 GVT Font
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Glyph	TokenNameIdentifier	 Glyph
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphs	TokenNameIdentifier	 glyphs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GeneralPath	TokenNameIdentifier	 General Path
outline	TokenNameIdentifier	 outline
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
logicalBounds	TokenNameIdentifier	 logical Bounds
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
bounds2D	TokenNameIdentifier	 bounds2 D
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Shape	TokenNameIdentifier	 Shape
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphLogicalBounds	TokenNameIdentifier	 glyph Logical Bounds
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphVisible	TokenNameIdentifier	 glyph Visible
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Point2D	TokenNameIdentifier	 Point2 D
endPos	TokenNameIdentifier	 end Pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
cacheTPI	TokenNameIdentifier	 cache TPI
;	TokenNameSEMICOLON	
/** * Constructs an SVGGVTGlyphVector. * * @param font The font that is creating this glyph vector. * @param glyphs An array containing the glyphs that form the basis for this * glyph vector. * @param frc The current font render context. */	TokenNameCOMMENT_JAVADOC	 Constructs an SVGGVTGlyphVector. * @param font The font that is creating this glyph vector. @param glyphs An array containing the glyphs that form the basis for this glyph vector. @param frc The current font render context. 
public	TokenNamepublic	
SVGGVTGlyphVector	TokenNameIdentifier	 SVGGVT Glyph Vector
(	TokenNameLPAREN	
GVTFont	TokenNameIdentifier	 GVT Font
font	TokenNameIdentifier	 font
,	TokenNameCOMMA	
Glyph	TokenNameIdentifier	 Glyph
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphs	TokenNameIdentifier	 glyphs
,	TokenNameCOMMA	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
glyphs	TokenNameIdentifier	 glyphs
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
frc	TokenNameIdentifier	 frc
=	TokenNameEQUAL	
frc	TokenNameIdentifier	 frc
;	TokenNameSEMICOLON	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bounds2D	TokenNameIdentifier	 bounds2 D
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
logicalBounds	TokenNameIdentifier	 logical Bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
glyphLogicalBounds	TokenNameIdentifier	 glyph Logical Bounds
=	TokenNameEQUAL	
new	TokenNamenew	
Shape	TokenNameIdentifier	 Shape
[	TokenNameLBRACKET	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
glyphVisible	TokenNameIdentifier	 glyph Visible
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glyphVisible	TokenNameIdentifier	 glyph Visible
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
endPos	TokenNameIdentifier	 end Pos
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endPos	TokenNameIdentifier	 end Pos
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
endPos	TokenNameIdentifier	 end Pos
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getHorizAdvX	TokenNameIdentifier	 get Horiz Adv X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
endPos	TokenNameIdentifier	 end Pos
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Font associated with this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the Font associated with this GlyphVector. 
public	TokenNamepublic	
GVTFont	TokenNameIdentifier	 GVT Font
getFont	TokenNameIdentifier	 get Font
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
font	TokenNameIdentifier	 font
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
frc	TokenNameIdentifier	 frc
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
throws	TokenNamethrows	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
glyphIndex	TokenNameIdentifier	 glyph Index
>	TokenNameGREATER	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"glyphIndex "	TokenNameStringLiteral	glyphIndex 
+	TokenNamePLUS	
glyphIndex	TokenNameIdentifier	 glyph Index
+	TokenNamePLUS	
" is out of bounds, should be between 0 and "	TokenNameStringLiteral	 is out of bounds, should be between 0 and 
+	TokenNamePLUS	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphCode	TokenNameIdentifier	 get Glyph Code
(	TokenNameLPAREN	
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
throws	TokenNamethrows	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
,	TokenNameCOMMA	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numEntries	TokenNameIdentifier	 num Entries
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"numEntries argument value, "	TokenNameStringLiteral	numEntries argument value, 
+	TokenNamePLUS	
numEntries	TokenNameIdentifier	 num Entries
+	TokenNamePLUS	
", is illegal. It must be > 0."	TokenNameStringLiteral	, is illegal. It must be > 0.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"beginGlyphIndex "	TokenNameStringLiteral	beginGlyphIndex 
+	TokenNamePLUS	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
+	TokenNamePLUS	
" is out of bounds, should be between 0 and "	TokenNameStringLiteral	 is out of bounds, should be between 0 and 
+	TokenNamePLUS	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
+	TokenNamePLUS	
numEntries	TokenNameIdentifier	 num Entries
)	TokenNameRPAREN	
>	TokenNameGREATER	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"beginGlyphIndex + numEntries ("	TokenNameStringLiteral	beginGlyphIndex + numEntries (
+	TokenNamePLUS	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
+	TokenNamePLUS	
"+"	TokenNameStringLiteral	+
+	TokenNamePLUS	
numEntries	TokenNameIdentifier	 num Entries
+	TokenNamePLUS	
") exceeds the number of glpyhs in this GlyphVector"	TokenNameStringLiteral	) exceeds the number of glpyhs in this GlyphVector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
codeReturn	TokenNameIdentifier	 code Return
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
codeReturn	TokenNameIdentifier	 code Return
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numEntries	TokenNameIdentifier	 num Entries
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
(	TokenNameLPAREN	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
+	TokenNamePLUS	
numEntries	TokenNameIdentifier	 num Entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
codeReturn	TokenNameIdentifier	 code Return
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphCode	TokenNameIdentifier	 get Glyph Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
codeReturn	TokenNameIdentifier	 code Return
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
if	TokenNameif	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
>	TokenNameGREATER	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"glyphIndex: "	TokenNameStringLiteral	glyphIndex: 
+	TokenNamePLUS	
glyphIndex	TokenNameIdentifier	 glyph Index
+	TokenNamePLUS	
", is out of bounds. Should be between 0 and "	TokenNameStringLiteral	, is out of bounds. Should be between 0 and 
+	TokenNamePLUS	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
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
if	TokenNameif	
(	TokenNameLPAREN	
glyphLogicalBounds	TokenNameIdentifier	 glyph Logical Bounds
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
glyphVisible	TokenNameIdentifier	 glyph Visible
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
computeGlyphLogicalBounds	TokenNameIdentifier	 compute Glyph Logical Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
glyphLogicalBounds	TokenNameIdentifier	 glyph Logical Bounds
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
computeGlyphLogicalBounds	TokenNameIdentifier	 compute Glyph Logical Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
ascent	TokenNameIdentifier	 ascent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// font will only be null if this glyph vector is for an altGlyph 	TokenNameCOMMENT_LINE	font will only be null if this glyph vector is for an altGlyph 
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
lineMetrics	TokenNameIdentifier	 line Metrics
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getLineMetrics	TokenNameIdentifier	 get Line Metrics
(	TokenNameLPAREN	
"By"	TokenNameStringLiteral	By
,	TokenNameCOMMA	
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ascent	TokenNameIdentifier	 ascent
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getAscent	TokenNameIdentifier	 get Ascent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getDescent	TokenNameIdentifier	 get Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
descent	TokenNameIdentifier	 descent
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make descent a positive value 	TokenNameCOMMENT_LINE	make descent a positive value 
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
-	TokenNameMINUS	
descent	TokenNameIdentifier	 descent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ascent	TokenNameIdentifier	 ascent
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
maxAscent	TokenNameIdentifier	 max Ascent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
maxDescent	TokenNameIdentifier	 max Descent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
glyphVisible	TokenNameIdentifier	 glyph Visible
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
glyphMetrics	TokenNameIdentifier	 glyph Metrics
=	TokenNameEQUAL	
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
glyphBounds	TokenNameIdentifier	 glyph Bounds
=	TokenNameEQUAL	
glyphMetrics	TokenNameIdentifier	 glyph Metrics
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ascent	TokenNameIdentifier	 ascent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
-	TokenNameMINUS	
glyphBounds	TokenNameIdentifier	 glyph Bounds
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
glyphBounds	TokenNameIdentifier	 glyph Bounds
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
ascent	TokenNameIdentifier	 ascent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ascent	TokenNameIdentifier	 ascent
>	TokenNameGREATER	
maxAscent	TokenNameIdentifier	 max Ascent
)	TokenNameRPAREN	
maxAscent	TokenNameIdentifier	 max Ascent
=	TokenNameEQUAL	
ascent	TokenNameIdentifier	 ascent
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
descent	TokenNameIdentifier	 descent
>	TokenNameGREATER	
maxDescent	TokenNameIdentifier	 max Descent
)	TokenNameRPAREN	
maxDescent	TokenNameIdentifier	 max Descent
=	TokenNameEQUAL	
descent	TokenNameIdentifier	 descent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ascent	TokenNameIdentifier	 ascent
=	TokenNameEQUAL	
maxAscent	TokenNameIdentifier	 max Ascent
;	TokenNameSEMICOLON	
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
maxDescent	TokenNameIdentifier	 max Descent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Shape	TokenNameIdentifier	 Shape
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
=	TokenNameEQUAL	
new	TokenNamenew	
Shape	TokenNameIdentifier	 Shape
[	TokenNameLBRACKET	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rotated	TokenNameIdentifier	 rotated
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
maxWidth	TokenNameIdentifier	 max Width
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
maxHeight	TokenNameIdentifier	 max Height
=	TokenNameEQUAL	
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
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
glyphVisible	TokenNameIdentifier	 glyph Visible
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the glyph is not drawn 	TokenNameCOMMENT_LINE	the glyph is not drawn 
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
glyphTransform	TokenNameIdentifier	 glyph Transform
=	TokenNameEQUAL	
getGlyphTransform	TokenNameIdentifier	 get Glyph Transform
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
glyphMetrics	TokenNameIdentifier	 glyph Metrics
=	TokenNameEQUAL	
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
glyphBounds	TokenNameIdentifier	 glyph Bounds
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
ascent	TokenNameIdentifier	 ascent
,	TokenNameCOMMA	
glyphMetrics	TokenNameIdentifier	 glyph Metrics
.	TokenNameDOT	
getHorizontalAdvance	TokenNameIdentifier	 get Horizontal Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ascent	TokenNameIdentifier	 ascent
+	TokenNamePLUS	
descent	TokenNameIdentifier	 descent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyphBounds	TokenNameIdentifier	 glyph Bounds
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// can't tell if rotated or not, make it 	TokenNameCOMMENT_LINE	can't tell if rotated or not, make it 
// the same as the previous glyph, if we have one... 	TokenNameCOMMENT_LINE	the same as the previous glyph, if we have one... 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rotated	TokenNameIdentifier	 rotated
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rotated	TokenNameIdentifier	 rotated
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rotated	TokenNameIdentifier	 rotated
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// get three corner points so we can determine 	TokenNameCOMMENT_LINE	get three corner points so we can determine 
// whether the glyph is rotated 	TokenNameCOMMENT_LINE	whether the glyph is rotated 
Point2D	TokenNameIdentifier	 Point2 D
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
glyphBounds	TokenNameIdentifier	 glyph Bounds
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
glyphBounds	TokenNameIdentifier	 glyph Bounds
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
glyphBounds	TokenNameIdentifier	 glyph Bounds
.	TokenNameDOT	
getMaxX	TokenNameIdentifier	 get Max X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
glyphBounds	TokenNameIdentifier	 glyph Bounds
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
p3	TokenNameIdentifier	 p3
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
glyphBounds	TokenNameIdentifier	 glyph Bounds
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
glyphBounds	TokenNameIdentifier	 glyph Bounds
.	TokenNameDOT	
getMaxY	TokenNameIdentifier	 get Max Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
gpos	TokenNameIdentifier	 gpos
=	TokenNameEQUAL	
getGlyphPosition	TokenNameIdentifier	 get Glyph Position
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getTranslateInstance	TokenNameIdentifier	 get Translate Instance
(	TokenNameLPAREN	
gpos	TokenNameIdentifier	 gpos
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
gpos	TokenNameIdentifier	 gpos
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyphTransform	TokenNameIdentifier	 glyph Transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
glyphTransform	TokenNameIdentifier	 glyph Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
glyphBounds	TokenNameIdentifier	 glyph Bounds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
tp1	TokenNameIdentifier	 tp1
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
tp2	TokenNameIdentifier	 tp2
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
tp3	TokenNameIdentifier	 tp3
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
tp1	TokenNameIdentifier	 tp1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
tp2	TokenNameIdentifier	 tp2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
p3	TokenNameIdentifier	 p3
,	TokenNameCOMMA	
tp3	TokenNameIdentifier	 tp3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tdx12	TokenNameIdentifier	 tdx12
=	TokenNameEQUAL	
tp1	TokenNameIdentifier	 tp1
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
tp2	TokenNameIdentifier	 tp2
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tdx13	TokenNameIdentifier	 tdx13
=	TokenNameEQUAL	
tp1	TokenNameIdentifier	 tp1
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
tp3	TokenNameIdentifier	 tp3
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tdy12	TokenNameIdentifier	 tdy12
=	TokenNameEQUAL	
tp1	TokenNameIdentifier	 tp1
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
tp2	TokenNameIdentifier	 tp2
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tdy13	TokenNameIdentifier	 tdy13
=	TokenNameEQUAL	
tp1	TokenNameIdentifier	 tp1
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
tp3	TokenNameIdentifier	 tp3
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
tdx12	TokenNameIdentifier	 tdx12
)	TokenNameRPAREN	
<	TokenNameLESS	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
tdy13	TokenNameIdentifier	 tdy13
)	TokenNameRPAREN	
<	TokenNameLESS	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If these are both zero then it is axially aligned 	TokenNameCOMMENT_LINE	If these are both zero then it is axially aligned 
// on it's "side"... 	TokenNameCOMMENT_LINE	on it's "side"... 
rotated	TokenNameIdentifier	 rotated
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
tdx13	TokenNameIdentifier	 tdx13
)	TokenNameRPAREN	
<	TokenNameLESS	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
tdy12	TokenNameIdentifier	 tdy12
)	TokenNameRPAREN	
<	TokenNameLESS	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If these are both zero then it is axially aligned 	TokenNameCOMMENT_LINE	If these are both zero then it is axially aligned 
// vertically. 	TokenNameCOMMENT_LINE	vertically. 
rotated	TokenNameIdentifier	 rotated
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rotated	TokenNameIdentifier	 rotated
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
rectBounds	TokenNameIdentifier	 rect Bounds
;	TokenNameSEMICOLON	
rectBounds	TokenNameIdentifier	 rect Bounds
=	TokenNameEQUAL	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rectBounds	TokenNameIdentifier	 rect Bounds
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxWidth	TokenNameIdentifier	 max Width
)	TokenNameRPAREN	
maxWidth	TokenNameIdentifier	 max Width
=	TokenNameEQUAL	
rectBounds	TokenNameIdentifier	 rect Bounds
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rectBounds	TokenNameIdentifier	 rect Bounds
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxHeight	TokenNameIdentifier	 max Height
)	TokenNameRPAREN	
maxHeight	TokenNameIdentifier	 max Height
=	TokenNameEQUAL	
rectBounds	TokenNameIdentifier	 rect Bounds
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if appropriate, join adjacent glyph logical bounds 	TokenNameCOMMENT_LINE	if appropriate, join adjacent glyph logical bounds 
GeneralPath	TokenNameIdentifier	 General Path
logicalBoundsPath	TokenNameIdentifier	 logical Bounds Path
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
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
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logicalBoundsPath	TokenNameIdentifier	 logical Bounds Path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
fullBounds	TokenNameIdentifier	 full Bounds
=	TokenNameEQUAL	
logicalBoundsPath	TokenNameIdentifier	 logical Bounds Path
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fullBounds	TokenNameIdentifier	 full Bounds
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
maxHeight	TokenNameIdentifier	 max Height
*	TokenNameMULTIPLY	
1.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make all glyphs tops and bottoms the same as the full bounds 	TokenNameCOMMENT_LINE	make all glyphs tops and bottoms the same as the full bounds 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first make sure that the glyph logical bounds are 	TokenNameCOMMENT_LINE	first make sure that the glyph logical bounds are 
// not rotated 	TokenNameCOMMENT_LINE	not rotated 
if	TokenNameif	
(	TokenNameLPAREN	
rotated	TokenNameIdentifier	 rotated
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
glyphBounds	TokenNameIdentifier	 glyph Bounds
=	TokenNameEQUAL	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
glyphBounds	TokenNameIdentifier	 glyph Bounds
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
glyphBounds	TokenNameIdentifier	 glyph Bounds
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make this glyph extend to the start of the next one 	TokenNameCOMMENT_LINE	make this glyph extend to the start of the next one 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
ngb	TokenNameIdentifier	 ngb
=	TokenNameEQUAL	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
nw	TokenNameIdentifier	 nw
=	TokenNameEQUAL	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nw	TokenNameIdentifier	 nw
<	TokenNameLESS	
width	TokenNameIdentifier	 width
*	TokenNameMULTIPLY	
1.15	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nw	TokenNameIdentifier	 nw
>	TokenNameGREATER	
width	TokenNameIdentifier	 width
*	TokenNameMULTIPLY	
.85	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
(	TokenNameLPAREN	
nw	TokenNameIdentifier	 nw
-	TokenNameMINUS	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
width	TokenNameIdentifier	 width
+=	TokenNamePLUS_EQUAL	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
setRect	TokenNameIdentifier	 set Rect
(	TokenNameLPAREN	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
delta	TokenNameIdentifier	 delta
,	TokenNameCOMMA	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
delta	TokenNameIdentifier	 delta
,	TokenNameCOMMA	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
fullBounds	TokenNameIdentifier	 full Bounds
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
fullBounds	TokenNameIdentifier	 full Bounds
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fullBounds	TokenNameIdentifier	 full Bounds
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
maxWidth	TokenNameIdentifier	 max Width
*	TokenNameMULTIPLY	
1.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make all glyphs left and right edges the same as the full bounds 	TokenNameCOMMENT_LINE	make all glyphs left and right edges the same as the full bounds 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first make sure that the glyph logical bounds are 	TokenNameCOMMENT_LINE	first make sure that the glyph logical bounds are 
// not rotated 	TokenNameCOMMENT_LINE	not rotated 
if	TokenNameif	
(	TokenNameLPAREN	
rotated	TokenNameIdentifier	 rotated
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
glyphBounds	TokenNameIdentifier	 glyph Bounds
=	TokenNameEQUAL	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
glyphBounds	TokenNameIdentifier	 glyph Bounds
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
glyphBounds	TokenNameIdentifier	 glyph Bounds
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make this glyph extend to the start of the next one 	TokenNameCOMMENT_LINE	make this glyph extend to the start of the next one 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
ngb	TokenNameIdentifier	 ngb
=	TokenNameEQUAL	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// going top to bottom 	TokenNameCOMMENT_LINE	going top to bottom 
double	TokenNamedouble	
nh	TokenNameIdentifier	 nh
=	TokenNameEQUAL	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nh	TokenNameIdentifier	 nh
<	TokenNameLESS	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
1.15	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
nh	TokenNameIdentifier	 nh
>	TokenNameGREATER	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
.85	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
(	TokenNameLPAREN	
nh	TokenNameIdentifier	 nh
-	TokenNameMINUS	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
height	TokenNameIdentifier	 height
+=	TokenNamePLUS_EQUAL	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
setRect	TokenNameIdentifier	 set Rect
(	TokenNameLPAREN	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
delta	TokenNameIdentifier	 delta
,	TokenNameCOMMA	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ngb	TokenNameIdentifier	 ngb
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
fullBounds	TokenNameIdentifier	 full Bounds
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
fullBounds	TokenNameIdentifier	 full Bounds
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tempLogicalBounds	TokenNameIdentifier	 temp Logical Bounds
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
glyphLogicalBounds	TokenNameIdentifier	 glyph Logical Bounds
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the metrics of the glyph at the specified index into this * GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the metrics of the glyph at the specified index into this GlyphVector. 
public	TokenNamepublic	
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"idx: "	TokenNameStringLiteral	idx: 
+	TokenNamePLUS	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
", is out of bounds. Should be between 0 and "	TokenNameStringLiteral	, is out of bounds. Should be between 0 and 
+	TokenNamePLUS	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check to see if we should kern this glyph 	TokenNameCOMMENT_LINE	check to see if we should kern this glyph 
// I return the kerning information in the glyph metrics 	TokenNameCOMMENT_LINE	I return the kerning information in the glyph metrics 
// as a first pass at implementation (I don't want to 	TokenNameCOMMENT_LINE	as a first pass at implementation (I don't want to 
// fiddle with layout too much right now). 	TokenNameCOMMENT_LINE	fiddle with layout too much right now). 
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check for kerning 	TokenNameCOMMENT_LINE	check for kerning 
if	TokenNameif	
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
hkern	TokenNameIdentifier	 hkern
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getHKern	TokenNameIdentifier	 get H Kern
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphCode	TokenNameIdentifier	 get Glyph Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphCode	TokenNameIdentifier	 get Glyph Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
vkern	TokenNameIdentifier	 vkern
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getVKern	TokenNameIdentifier	 get V Kern
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphCode	TokenNameIdentifier	 get Glyph Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphCode	TokenNameIdentifier	 get Glyph Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
hkern	TokenNameIdentifier	 hkern
,	TokenNameCOMMA	
vkern	TokenNameIdentifier	 vkern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// get a normal metrics 	TokenNameCOMMENT_LINE	get a normal metrics 
return	TokenNamereturn	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
>	TokenNameGREATER	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"glyphIndex: "	TokenNameStringLiteral	glyphIndex: 
+	TokenNamePLUS	
glyphIndex	TokenNameIdentifier	 glyph Index
+	TokenNamePLUS	
", is out of bounds. Should be between 0 and "	TokenNameStringLiteral	, is out of bounds. Should be between 0 and 
+	TokenNamePLUS	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
==	TokenNameEQUAL_EQUAL	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
endPos	TokenNameIdentifier	 end Pos
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
>	TokenNameGREATER	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"glyphIndex: "	TokenNameStringLiteral	glyphIndex: 
+	TokenNamePLUS	
glyphIndex	TokenNameIdentifier	 glyph Index
+	TokenNamePLUS	
", is out of bounds. Should be between 0 and "	TokenNameStringLiteral	, is out of bounds. Should be between 0 and 
+	TokenNamePLUS	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
numEntries	TokenNameIdentifier	 num Entries
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"numEntries argument value, "	TokenNameStringLiteral	numEntries argument value, 
+	TokenNamePLUS	
numEntries	TokenNameIdentifier	 num Entries
+	TokenNamePLUS	
", is illegal. It must be > 0."	TokenNameStringLiteral	, is illegal. It must be > 0.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"beginGlyphIndex "	TokenNameStringLiteral	beginGlyphIndex 
+	TokenNamePLUS	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
+	TokenNamePLUS	
" is out of bounds, should be between 0 and "	TokenNameStringLiteral	 is out of bounds, should be between 0 and 
+	TokenNamePLUS	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
+	TokenNamePLUS	
numEntries	TokenNameIdentifier	 num Entries
)	TokenNameRPAREN	
>	TokenNameGREATER	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"beginGlyphIndex + numEntries ("	TokenNameStringLiteral	beginGlyphIndex + numEntries (
+	TokenNamePLUS	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
+	TokenNamePLUS	
'+'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
numEntries	TokenNameIdentifier	 num Entries
+	TokenNamePLUS	
") exceeds the number of glpyhs in this GlyphVector"	TokenNameStringLiteral	) exceeds the number of glpyhs in this GlyphVector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
positionReturn	TokenNameIdentifier	 position Return
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
positionReturn	TokenNameIdentifier	 position Return
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
numEntries	TokenNameIdentifier	 num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
+	TokenNamePLUS	
numEntries	TokenNameIdentifier	 num Entries
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numEntries	TokenNameIdentifier	 num Entries
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
positionReturn	TokenNameIdentifier	 position Return
[	TokenNameLBRACKET	
numEntries	TokenNameIdentifier	 num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
endPos	TokenNameIdentifier	 end Pos
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
positionReturn	TokenNameIdentifier	 position Return
[	TokenNameLBRACKET	
numEntries	TokenNameIdentifier	 num Entries
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
endPos	TokenNameIdentifier	 end Pos
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
(	TokenNameLPAREN	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
+	TokenNamePLUS	
numEntries	TokenNameIdentifier	 num Entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Point2D	TokenNameIdentifier	 Point2 D
glyphPos	TokenNameIdentifier	 glyph Pos
;	TokenNameSEMICOLON	
glyphPos	TokenNameIdentifier	 glyph Pos
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
positionReturn	TokenNameIdentifier	 position Return
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
glyphPos	TokenNameIdentifier	 glyph Pos
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
positionReturn	TokenNameIdentifier	 position Return
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
beginGlyphIndex	TokenNameIdentifier	 begin Glyph Index
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
glyphPos	TokenNameIdentifier	 glyph Pos
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
positionReturn	TokenNameIdentifier	 position Return
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
if	TokenNameif	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
>	TokenNameGREATER	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"glyphIndex: "	TokenNameStringLiteral	glyphIndex: 
+	TokenNamePLUS	
glyphIndex	TokenNameIdentifier	 glyph Index
+	TokenNamePLUS	
", is out of bounds. Should be between 0 and "	TokenNameStringLiteral	, is out of bounds. Should be between 0 and 
+	TokenNamePLUS	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
>	TokenNameGREATER	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"glyphIndex: "	TokenNameStringLiteral	glyphIndex: 
+	TokenNamePLUS	
glyphIndex	TokenNameIdentifier	 glyph Index
+	TokenNamePLUS	
", is out of bounds. Should be between 0 and "	TokenNameStringLiteral	, is out of bounds. Should be between 0 and 
+	TokenNamePLUS	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a tight bounds on the GylphVector including stroking. */	TokenNameCOMMENT_JAVADOC	 Returns a tight bounds on the GylphVector including stroking. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("GlyphVector.getBounds2D Called: " + this); 	TokenNameCOMMENT_LINE	System.out.println("GlyphVector.getBounds2D Called: " + this); 
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
tpi	TokenNameIdentifier	 tpi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
)	TokenNameRPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PAINT_INFO	TokenNameIdentifier	 PAINT  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bounds2D	TokenNameIdentifier	 bounds2 D
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
.	TokenNameDOT	
equivilent	TokenNameIdentifier	 equivilent
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
,	TokenNameCOMMA	
cacheTPI	TokenNameIdentifier	 cache TPI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
bounds2D	TokenNameIdentifier	 bounds2 D
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
.	TokenNameDOT	
visible	TokenNameIdentifier	 visible
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
glyphVisible	TokenNameIdentifier	 glyph Visible
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
glyphBounds	TokenNameIdentifier	 glyph Bounds
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("GB["+i+"]: " + glyphBounds); 	TokenNameCOMMENT_LINE	System.out.println("GB["+i+"]: " + glyphBounds); 
if	TokenNameif	
(	TokenNameLPAREN	
glyphBounds	TokenNameIdentifier	 glyph Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
glyphBounds	TokenNameIdentifier	 glyph Bounds
;	TokenNameSEMICOLON	
//else b = glyphBounds.createUnion(b); 	TokenNameCOMMENT_LINE	else b = glyphBounds.createUnion(b); 
else	TokenNameelse	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
glyphBounds	TokenNameIdentifier	 glyph Bounds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
bounds2D	TokenNameIdentifier	 bounds2 D
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bounds2D	TokenNameIdentifier	 bounds2 D
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bounds2D	TokenNameIdentifier	 bounds2 D
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cacheTPI	TokenNameIdentifier	 cache TPI
=	TokenNameEQUAL	
new	TokenNamenew	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bounds2D	TokenNameIdentifier	 bounds2 D
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the logical bounds of this GlyphVector. * This is a bound useful for hit detection and highlighting. */	TokenNameCOMMENT_JAVADOC	 Returns the logical bounds of this GlyphVector. This is a bound useful for hit detection and highlighting. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getLogicalBounds	TokenNameIdentifier	 get Logical Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logicalBounds	TokenNameIdentifier	 logical Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GeneralPath	TokenNameIdentifier	 General Path
logicalBoundsPath	TokenNameIdentifier	 logical Bounds Path
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
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
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
glyphLogicalBounds	TokenNameIdentifier	 glyph Logical Bounds
=	TokenNameEQUAL	
getGlyphLogicalBounds	TokenNameIdentifier	 get Glyph Logical Bounds
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyphLogicalBounds	TokenNameIdentifier	 glyph Logical Bounds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logicalBoundsPath	TokenNameIdentifier	 logical Bounds Path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
glyphLogicalBounds	TokenNameIdentifier	 glyph Logical Bounds
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
logicalBounds	TokenNameIdentifier	 logical Bounds
=	TokenNameEQUAL	
logicalBoundsPath	TokenNameIdentifier	 logical Bounds Path
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
logicalBounds	TokenNameIdentifier	 logical Bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of glyphs in this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns the number of glyphs in this GlyphVector. 
public	TokenNamepublic	
int	TokenNameint	
getNumGlyphs	TokenNameIdentifier	 get Num Glyphs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Shape whose interior corresponds to the visual representation * of this GlyphVector. */	TokenNameCOMMENT_JAVADOC	 Returns a Shape whose interior corresponds to the visual representation of this GlyphVector. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
outline	TokenNameIdentifier	 outline
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
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
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glyphVisible	TokenNameIdentifier	 glyph Visible
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
glyphOutline	TokenNameIdentifier	 glyph Outline
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyphOutline	TokenNameIdentifier	 glyph Outline
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outline	TokenNameIdentifier	 outline
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
glyphOutline	TokenNameIdentifier	 glyph Outline
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
outline	TokenNameIdentifier	 outline
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
Shape	TokenNameIdentifier	 Shape
translatedOutline	TokenNameIdentifier	 translated Outline
=	TokenNameEQUAL	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
outline	TokenNameIdentifier	 outline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
translatedOutline	TokenNameIdentifier	 translated Outline
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the geometric bounds of this GlyphVector. The geometric * bounds is the tightest rectangle enclosing the geometry of the * glyph vector (not including stroke). */	TokenNameCOMMENT_JAVADOC	 Returns the geometric bounds of this GlyphVector. The geometric bounds is the tightest rectangle enclosing the geometry of the glyph vector (not including stroke). 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGeometricBounds	TokenNameIdentifier	 get Geometric Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assigns default positions to each glyph in this GlyphVector. The default * layout is horizontal. */	TokenNameCOMMENT_JAVADOC	 Assigns default positions to each glyph in this GlyphVector. The default layout is horizontal. 
public	TokenNamepublic	
void	TokenNamevoid	
performDefaultLayout	TokenNameIdentifier	 perform Default Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logicalBounds	TokenNameIdentifier	 logical Bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bounds2D	TokenNameIdentifier	 bounds2 D
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Glyph	TokenNameIdentifier	 Glyph
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphLogicalBounds	TokenNameIdentifier	 glyph Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uni	TokenNameIdentifier	 uni
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getUnicode	TokenNameIdentifier	 get Unicode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
uni	TokenNameIdentifier	 uni
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
uni	TokenNameIdentifier	 uni
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ArabicTextHandler	TokenNameIdentifier	 Arabic Text Handler
.	TokenNameDOT	
arabicCharTransparent	TokenNameIdentifier	 arabic Char Transparent
(	TokenNameLPAREN	
uni	TokenNameIdentifier	 uni
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uni	TokenNameIdentifier	 uni
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getUnicode	TokenNameIdentifier	 get Unicode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
uni	TokenNameIdentifier	 uni
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
uni	TokenNameIdentifier	 uni
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
uni	TokenNameIdentifier	 uni
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ArabicTextHandler	TokenNameIdentifier	 Arabic Text Handler
.	TokenNameDOT	
arabicCharTransparent	TokenNameIdentifier	 arabic Char Transparent
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
!=	TokenNameNOT_EQUAL	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Glyph	TokenNameIdentifier	 Glyph
bg	TokenNameIdentifier	 bg
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
rEdge	TokenNameIdentifier	 r Edge
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
+	TokenNamePLUS	
bg	TokenNameIdentifier	 bg
.	TokenNameDOT	
getHorizAdvX	TokenNameIdentifier	 get Horiz Adv X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphLogicalBounds	TokenNameIdentifier	 glyph Logical Bounds
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
rEdge	TokenNameIdentifier	 r Edge
-	TokenNameMINUS	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getHorizAdvX	TokenNameIdentifier	 get Horiz Adv X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
bg	TokenNameIdentifier	 bg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
currentX	TokenNameIdentifier	 current X
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentX	TokenNameIdentifier	 current X
+=	TokenNamePLUS_EQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getHorizAdvX	TokenNameIdentifier	 get Horiz Adv X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
endPos	TokenNameIdentifier	 end Pos
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
currentX	TokenNameIdentifier	 current X
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
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
throws	TokenNamethrows	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
==	TokenNameEQUAL_EQUAL	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endPos	TokenNameIdentifier	 end Pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
)	TokenNameRPAREN	
newPos	TokenNameIdentifier	 new Pos
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
>	TokenNameGREATER	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"glyphIndex: "	TokenNameStringLiteral	glyphIndex: 
+	TokenNamePLUS	
glyphIndex	TokenNameIdentifier	 glyph Index
+	TokenNamePLUS	
", is out of bounds. Should be between 0 and "	TokenNameStringLiteral	, is out of bounds. Should be between 0 and 
+	TokenNamePLUS	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
newPos	TokenNameIdentifier	 new Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphLogicalBounds	TokenNameIdentifier	 glyph Logical Bounds
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bounds2D	TokenNameIdentifier	 bounds2 D
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
logicalBounds	TokenNameIdentifier	 logical Bounds
=	TokenNameEQUAL	
null	TokenNamenull	
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
if	TokenNameif	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
>	TokenNameGREATER	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"glyphIndex: "	TokenNameStringLiteral	glyphIndex: 
+	TokenNamePLUS	
glyphIndex	TokenNameIdentifier	 glyph Index
+	TokenNamePLUS	
", is out of bounds. Should be between 0 and "	TokenNameStringLiteral	, is out of bounds. Should be between 0 and 
+	TokenNamePLUS	
(	TokenNameLPAREN	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
newTX	TokenNameIdentifier	 new TX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphLogicalBounds	TokenNameIdentifier	 glyph Logical Bounds
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bounds2D	TokenNameIdentifier	 bounds2 D
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
logicalBounds	TokenNameIdentifier	 logical Bounds
=	TokenNameEQUAL	
null	TokenNamenull	
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
if	TokenNameif	
(	TokenNameLPAREN	
visible	TokenNameIdentifier	 visible
==	TokenNameEQUAL_EQUAL	
glyphVisible	TokenNameIdentifier	 glyph Visible
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
glyphVisible	TokenNameIdentifier	 glyph Visible
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
visible	TokenNameIdentifier	 visible
;	TokenNameSEMICOLON	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bounds2D	TokenNameIdentifier	 bounds2 D
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
logicalBounds	TokenNameIdentifier	 logical Bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
glyphLogicalBounds	TokenNameIdentifier	 glyph Logical Bounds
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if specified glyph will be rendered. */	TokenNameCOMMENT_JAVADOC	 Returns true if specified glyph will be rendered. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isGlyphVisible	TokenNameIdentifier	 is Glyph Visible
(	TokenNameLPAREN	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
glyphVisible	TokenNameIdentifier	 glyph Visible
[	TokenNameLBRACKET	
glyphIndex	TokenNameIdentifier	 glyph Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of chars represented by the glyphs within the * specified range. * @param startGlyphIndex The index of the first glyph in the range. * @param endGlyphIndex The index of the last glyph in the range. * @return The number of chars. */	TokenNameCOMMENT_JAVADOC	 Returns the number of chars represented by the glyphs within the specified range. @param startGlyphIndex The index of the first glyph in the range. @param endGlyphIndex The index of the last glyph in the range. @return The number of chars. 
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
numChars	TokenNameIdentifier	 num Chars
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startGlyphIndex	TokenNameIdentifier	 start Glyph Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startGlyphIndex	TokenNameIdentifier	 start Glyph Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endGlyphIndex	TokenNameIdentifier	 end Glyph Index
>	TokenNameGREATER	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endGlyphIndex	TokenNameIdentifier	 end Glyph Index
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
startGlyphIndex	TokenNameIdentifier	 start Glyph Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
endGlyphIndex	TokenNameIdentifier	 end Glyph Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Glyph	TokenNameIdentifier	 Glyph
glyph	TokenNameIdentifier	 glyph
=	TokenNameEQUAL	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyph	TokenNameIdentifier	 glyph
.	TokenNameDOT	
getGlyphCode	TokenNameIdentifier	 get Glyph Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Missing glyph mapps to just one char... 	TokenNameCOMMENT_LINE	Missing glyph mapps to just one char... 
numChars	TokenNameIdentifier	 num Chars
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
glyphUnicode	TokenNameIdentifier	 glyph Unicode
=	TokenNameEQUAL	
glyph	TokenNameIdentifier	 glyph
.	TokenNameDOT	
getUnicode	TokenNameIdentifier	 get Unicode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numChars	TokenNameIdentifier	 num Chars
+=	TokenNamePLUS_EQUAL	
glyphUnicode	TokenNameIdentifier	 glyph Unicode
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
numChars	TokenNameIdentifier	 num Chars
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Draws this glyph vector. */	TokenNameCOMMENT_JAVADOC	 Draws this glyph vector. 
public	TokenNamepublic	
void	TokenNamevoid	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
graphics2D	TokenNameIdentifier	 graphics2 D
,	TokenNameCOMMA	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
tpi	TokenNameIdentifier	 tpi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
)	TokenNameRPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PAINT_INFO	TokenNameIdentifier	 PAINT  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tpi	TokenNameIdentifier	 tpi
.	TokenNameDOT	
visible	TokenNameIdentifier	 visible
)	TokenNameRPAREN	
return	TokenNamereturn	
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
glyphs	TokenNameIdentifier	 glyphs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glyphVisible	TokenNameIdentifier	 glyph Visible
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glyphs	TokenNameIdentifier	 glyphs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
graphics2D	TokenNameIdentifier	 graphics2 D
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
