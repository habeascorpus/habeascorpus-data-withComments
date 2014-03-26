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
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
GraphicsNode	TokenNameIdentifier	 Graphics Node
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
/** * A Glyph describes a graphics node with some specific glyph rendering * attributes. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: Glyph.java 501844 2007-01-31 13:54:05Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A Glyph describes a graphics node with some specific glyph rendering attributes. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: Glyph.java 501844 2007-01-31 13:54:05Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
Glyph	TokenNameIdentifier	 Glyph
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
unicode	TokenNameIdentifier	 unicode
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
names	TokenNameIdentifier	 names
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
orientation	TokenNameIdentifier	 orientation
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
arabicForm	TokenNameIdentifier	 arabic Form
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
lang	TokenNameIdentifier	 lang
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Point2D	TokenNameIdentifier	 Point2 D
horizOrigin	TokenNameIdentifier	 horiz Origin
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Point2D	TokenNameIdentifier	 Point2 D
vertOrigin	TokenNameIdentifier	 vert Origin
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
horizAdvX	TokenNameIdentifier	 horiz Adv X
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
vertAdvY	TokenNameIdentifier	 vert Adv Y
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
glyphCode	TokenNameIdentifier	 glyph Code
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AffineTransform	TokenNameIdentifier	 Affine Transform
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
metrics	TokenNameIdentifier	 metrics
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Shape	TokenNameIdentifier	 Shape
outline	TokenNameIdentifier	 outline
;	TokenNameSEMICOLON	
// cache the glyph outline 	TokenNameCOMMENT_LINE	cache the glyph outline 
private	TokenNameprivate	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
// cache the glyph bounds 	TokenNameCOMMENT_LINE	cache the glyph bounds 
private	TokenNameprivate	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
tpi	TokenNameIdentifier	 tpi
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
cacheTPI	TokenNameIdentifier	 cache TPI
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Shape	TokenNameIdentifier	 Shape
dShape	TokenNameIdentifier	 d Shape
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GraphicsNode	TokenNameIdentifier	 Graphics Node
glyphChildrenNode	TokenNameIdentifier	 glyph Children Node
;	TokenNameSEMICOLON	
/** * Constructs a Glyph with the specified parameters. */	TokenNameCOMMENT_JAVADOC	 Constructs a Glyph with the specified parameters. 
public	TokenNamepublic	
Glyph	TokenNameIdentifier	 Glyph
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
unicode	TokenNameIdentifier	 unicode
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
names	TokenNameIdentifier	 names
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
orientation	TokenNameIdentifier	 orientation
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arabicForm	TokenNameIdentifier	 arabic Form
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
horizOrigin	TokenNameIdentifier	 horiz Origin
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
vertOrigin	TokenNameIdentifier	 vert Origin
,	TokenNameCOMMA	
float	TokenNamefloat	
horizAdvX	TokenNameIdentifier	 horiz Adv X
,	TokenNameCOMMA	
float	TokenNamefloat	
vertAdvY	TokenNameIdentifier	 vert Adv Y
,	TokenNameCOMMA	
int	TokenNameint	
glyphCode	TokenNameIdentifier	 glyph Code
,	TokenNameCOMMA	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
tpi	TokenNameIdentifier	 tpi
,	TokenNameCOMMA	
Shape	TokenNameIdentifier	 Shape
dShape	TokenNameIdentifier	 d Shape
,	TokenNameCOMMA	
GraphicsNode	TokenNameIdentifier	 Graphics Node
glyphChildrenNode	TokenNameIdentifier	 glyph Children Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
unicode	TokenNameIdentifier	 unicode
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
horizOrigin	TokenNameIdentifier	 horiz Origin
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vertOrigin	TokenNameIdentifier	 vert Origin
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unicode	TokenNameIdentifier	 unicode
=	TokenNameEQUAL	
unicode	TokenNameIdentifier	 unicode
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
orientation	TokenNameIdentifier	 orientation
=	TokenNameEQUAL	
orientation	TokenNameIdentifier	 orientation
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
arabicForm	TokenNameIdentifier	 arabic Form
=	TokenNameEQUAL	
arabicForm	TokenNameIdentifier	 arabic Form
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
=	TokenNameEQUAL	
lang	TokenNameIdentifier	 lang
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
horizOrigin	TokenNameIdentifier	 horiz Origin
=	TokenNameEQUAL	
horizOrigin	TokenNameIdentifier	 horiz Origin
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
vertOrigin	TokenNameIdentifier	 vert Origin
=	TokenNameEQUAL	
vertOrigin	TokenNameIdentifier	 vert Origin
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
horizAdvX	TokenNameIdentifier	 horiz Adv X
=	TokenNameEQUAL	
horizAdvX	TokenNameIdentifier	 horiz Adv X
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
vertAdvY	TokenNameIdentifier	 vert Adv Y
=	TokenNameEQUAL	
vertAdvY	TokenNameIdentifier	 vert Adv Y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
glyphCode	TokenNameIdentifier	 glyph Code
=	TokenNameEQUAL	
glyphCode	TokenNameIdentifier	 glyph Code
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
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
this	TokenNamethis	
.	TokenNameDOT	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tpi	TokenNameIdentifier	 tpi
=	TokenNameEQUAL	
tpi	TokenNameIdentifier	 tpi
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dShape	TokenNameIdentifier	 d Shape
=	TokenNameEQUAL	
dShape	TokenNameIdentifier	 d Shape
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
glyphChildrenNode	TokenNameIdentifier	 glyph Children Node
=	TokenNameEQUAL	
glyphChildrenNode	TokenNameIdentifier	 glyph Children Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the unicode char or chars this glyph represents. * * @return The glyphs unicode value. */	TokenNameCOMMENT_JAVADOC	 Returns the unicode char or chars this glyph represents. * @return The glyphs unicode value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUnicode	TokenNameIdentifier	 get Unicode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
unicode	TokenNameIdentifier	 unicode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the names of this glyph. * * @return The glyph names. */	TokenNameCOMMENT_JAVADOC	 Returns the names of this glyph. * @return The glyph names. 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getNames	TokenNameIdentifier	 get Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
names	TokenNameIdentifier	 names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the orientation of this glyph. * Indicates what inline-progression-direction this glyph * can be used in. Should be either "h" for horizontal only, "v" for vertical * only, or empty which indicates that the glyph can be used in both. * * @return The glyph orientation. */	TokenNameCOMMENT_JAVADOC	 Returns the orientation of this glyph. Indicates what inline-progression-direction this glyph can be used in. Should be either "h" for horizontal only, "v" for vertical only, or empty which indicates that the glyph can be used in both. * @return The glyph orientation. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOrientation	TokenNameIdentifier	 get Orientation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
orientation	TokenNameIdentifier	 orientation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns which of the four possible arabic forms this glyph represents. * This is only used for arabic glyphs. * * @return The glyphs arabic form. */	TokenNameCOMMENT_JAVADOC	 Returns which of the four possible arabic forms this glyph represents. This is only used for arabic glyphs. * @return The glyphs arabic form. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getArabicForm	TokenNameIdentifier	 get Arabic Form
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arabicForm	TokenNameIdentifier	 arabic Form
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a comma separated list of languages this glyph can be used in. * * @return The glyph languages. */	TokenNameCOMMENT_JAVADOC	 Returns a comma separated list of languages this glyph can be used in. * @return The glyph languages. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLang	TokenNameIdentifier	 get Lang
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lang	TokenNameIdentifier	 lang
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the horizontal origin of this glyph. * * @return The horizontal origin. */	TokenNameCOMMENT_JAVADOC	 Returns the horizontal origin of this glyph. * @return The horizontal origin. 
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
getHorizOrigin	TokenNameIdentifier	 get Horiz Origin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
horizOrigin	TokenNameIdentifier	 horiz Origin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the vertical origin of this glyph. * * @return The vertical origin. */	TokenNameCOMMENT_JAVADOC	 Returns the vertical origin of this glyph. * @return The vertical origin. 
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
getVertOrigin	TokenNameIdentifier	 get Vert Origin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vertOrigin	TokenNameIdentifier	 vert Origin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the horizontal advance value. * * @return This glyph's horizontal advance. */	TokenNameCOMMENT_JAVADOC	 Returns the horizontal advance value. * @return This glyph's horizontal advance. 
public	TokenNamepublic	
float	TokenNamefloat	
getHorizAdvX	TokenNameIdentifier	 get Horiz Adv X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
horizAdvX	TokenNameIdentifier	 horiz Adv X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the vertical advance value. * * @return the glyph's vertical advance. */	TokenNameCOMMENT_JAVADOC	 Returns the vertical advance value. * @return the glyph's vertical advance. 
public	TokenNamepublic	
float	TokenNamefloat	
getVertAdvY	TokenNameIdentifier	 get Vert Adv Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vertAdvY	TokenNameIdentifier	 vert Adv Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the glyphs unique code with resect to its font. This will be * the index into the font's list of glyphs. * * @return The glyph's unique code. */	TokenNameCOMMENT_JAVADOC	 Returns the glyphs unique code with resect to its font. This will be the index into the font's list of glyphs. * @return The glyph's unique code. 
public	TokenNamepublic	
int	TokenNameint	
getGlyphCode	TokenNameIdentifier	 get Glyph Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
glyphCode	TokenNameIdentifier	 glyph Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the glpyh's transform. * * @return The glyph's transform. */	TokenNameCOMMENT_JAVADOC	 Returns the glpyh's transform. * @return The glyph's transform. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the transform to be applied to this glyph. * * @param transform The transform to set. */	TokenNameCOMMENT_JAVADOC	 Sets the transform to be applied to this glyph. * @param transform The transform to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position of this glyph. * * @return The glyph's position. */	TokenNameCOMMENT_JAVADOC	 Returns the position of this glyph. * @return The glyph's position. 
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the position of the glyph. * * @param position The new glyph position. */	TokenNameCOMMENT_JAVADOC	 Sets the position of the glyph. * @param position The new glyph position. 
public	TokenNamepublic	
void	TokenNamevoid	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the metrics of this Glyph if it is used in a horizontal layout. * * @return The glyph metrics. */	TokenNameCOMMENT_JAVADOC	 Returns the metrics of this Glyph if it is used in a horizontal layout. * @return The glyph metrics. 
public	TokenNamepublic	
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
metrics	TokenNameIdentifier	 metrics
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
gb	TokenNameIdentifier	 gb
=	TokenNameEQUAL	
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
metrics	TokenNameIdentifier	 metrics
=	TokenNameEQUAL	
new	TokenNamenew	
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
(	TokenNameLPAREN	
getHorizAdvX	TokenNameIdentifier	 get Horiz Adv X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getVertAdvY	TokenNameIdentifier	 get Vert Adv Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
gb	TokenNameIdentifier	 gb
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
gb	TokenNameIdentifier	 gb
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
gb	TokenNameIdentifier	 gb
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
gb	TokenNameIdentifier	 gb
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
.	TokenNameDOT	
COMPONENT	TokenNameIdentifier	 COMPONENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
metrics	TokenNameIdentifier	 metrics
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the metics of this Glyph with the specified kerning value * applied. * * @param hkern The horizontal kerning value to apply when calculating * the glyph metrics. * @param vkern The horizontal vertical value to apply when calculating * the glyph metrics. * @return The kerned glyph metics */	TokenNameCOMMENT_JAVADOC	 Returns the metics of this Glyph with the specified kerning value applied. * @param hkern The horizontal kerning value to apply when calculating the glyph metrics. @param vkern The horizontal vertical value to apply when calculating the glyph metrics. @return The kerned glyph metics 
public	TokenNamepublic	
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
float	TokenNamefloat	
hkern	TokenNameIdentifier	 hkern
,	TokenNameCOMMA	
float	TokenNamefloat	
vkern	TokenNameIdentifier	 vkern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
(	TokenNameLPAREN	
getHorizAdvX	TokenNameIdentifier	 get Horiz Adv X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
hkern	TokenNameIdentifier	 hkern
,	TokenNameCOMMA	
getVertAdvY	TokenNameIdentifier	 get Vert Adv Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
vkern	TokenNameIdentifier	 vkern
,	TokenNameCOMMA	
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
.	TokenNameDOT	
COMPONENT	TokenNameIdentifier	 COMPONENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
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
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check if the TextPaintInfo has changed... 	TokenNameCOMMENT_LINE	Check if the TextPaintInfo has changed... 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
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
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getTranslateInstance	TokenNameIdentifier	 get Translate Instance
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dShape	TokenNameIdentifier	 d Shape
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
.	TokenNameDOT	
fillPaint	TokenNameIdentifier	 fill Paint
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
dShape	TokenNameIdentifier	 d Shape
)	TokenNameRPAREN	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
.	TokenNameDOT	
strokeStroke	TokenNameIdentifier	 stroke Stroke
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
.	TokenNameDOT	
strokePaint	TokenNameIdentifier	 stroke Paint
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
tpi	TokenNameIdentifier	 tpi
.	TokenNameDOT	
strokeStroke	TokenNameIdentifier	 stroke Stroke
.	TokenNameDOT	
createStrokedShape	TokenNameIdentifier	 create Stroked Shape
(	TokenNameLPAREN	
dShape	TokenNameIdentifier	 d Shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
//else bounds = r.createUnion(bounds); 	TokenNameCOMMENT_LINE	else bounds = r.createUnion(bounds); 
else	TokenNameelse	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glyphChildrenNode	TokenNameIdentifier	 glyph Children Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
glyphChildrenNode	TokenNameIdentifier	 glyph Children Node
.	TokenNameDOT	
getTransformedBounds	TokenNameIdentifier	 get Transformed Bounds
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
// else bounds = r.createUnion(bounds); 	TokenNameCOMMENT_LINE	else bounds = r.createUnion(bounds); 
else	TokenNameelse	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cacheTPI	TokenNameIdentifier	 cache TPI
=	TokenNameEQUAL	
new	TokenNamenew	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the outline of this glyph. This will be positioned correctly and * any glyph transforms will have been applied. * * @return the outline of this glyph. */	TokenNameCOMMENT_JAVADOC	 Returns the outline of this glyph. This will be positioned correctly and any glyph transforms will have been applied. * @return the outline of this glyph. 
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
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getTranslateInstance	TokenNameIdentifier	 get Translate Instance
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Shape	TokenNameIdentifier	 Shape
glyphChildrenOutline	TokenNameIdentifier	 glyph Children Outline
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyphChildrenNode	TokenNameIdentifier	 glyph Children Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glyphChildrenOutline	TokenNameIdentifier	 glyph Children Outline
=	TokenNameEQUAL	
glyphChildrenNode	TokenNameIdentifier	 glyph Children Node
.	TokenNameDOT	
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GeneralPath	TokenNameIdentifier	 General Path
glyphOutline	TokenNameIdentifier	 glyph Outline
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dShape	TokenNameIdentifier	 d Shape
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
glyphChildrenOutline	TokenNameIdentifier	 glyph Children Outline
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glyphOutline	TokenNameIdentifier	 glyph Outline
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
dShape	TokenNameIdentifier	 d Shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphOutline	TokenNameIdentifier	 glyph Outline
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
glyphChildrenOutline	TokenNameIdentifier	 glyph Children Outline
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dShape	TokenNameIdentifier	 d Shape
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
glyphChildrenOutline	TokenNameIdentifier	 glyph Children Outline
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glyphOutline	TokenNameIdentifier	 glyph Outline
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
dShape	TokenNameIdentifier	 d Shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dShape	TokenNameIdentifier	 d Shape
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
glyphChildrenOutline	TokenNameIdentifier	 glyph Children Outline
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glyphOutline	TokenNameIdentifier	 glyph Outline
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
glyphChildrenOutline	TokenNameIdentifier	 glyph Children Outline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// must be a whitespace glyph, return an empty shape 	TokenNameCOMMENT_LINE	must be a whitespace glyph, return an empty shape 
glyphOutline	TokenNameIdentifier	 glyph Outline
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
glyphOutline	TokenNameIdentifier	 glyph Outline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
outline	TokenNameIdentifier	 outline
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Draws this glyph. * * @param graphics2D The Graphics2D object to draw to. */	TokenNameCOMMENT_JAVADOC	 Draws this glyph. * @param graphics2D The Graphics2D object to draw to. 
public	TokenNamepublic	
void	TokenNamevoid	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
graphics2D	TokenNameIdentifier	 graphics2 D
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getTranslateInstance	TokenNameIdentifier	 get Translate Instance
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// paint the dShape first 	TokenNameCOMMENT_LINE	paint the dShape first 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dShape	TokenNameIdentifier	 d Shape
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
tShape	TokenNameIdentifier	 t Shape
=	TokenNameEQUAL	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
dShape	TokenNameIdentifier	 d Shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
.	TokenNameDOT	
fillPaint	TokenNameIdentifier	 fill Paint
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
graphics2D	TokenNameIdentifier	 graphics2 D
.	TokenNameDOT	
setPaint	TokenNameIdentifier	 set Paint
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
.	TokenNameDOT	
fillPaint	TokenNameIdentifier	 fill Paint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics2D	TokenNameIdentifier	 graphics2 D
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
tShape	TokenNameIdentifier	 t Shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check if we need to draw the outline of this glyph 	TokenNameCOMMENT_LINE	check if we need to draw the outline of this glyph 
if	TokenNameif	
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
.	TokenNameDOT	
strokeStroke	TokenNameIdentifier	 stroke Stroke
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
tpi	TokenNameIdentifier	 tpi
.	TokenNameDOT	
strokePaint	TokenNameIdentifier	 stroke Paint
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
graphics2D	TokenNameIdentifier	 graphics2 D
.	TokenNameDOT	
setStroke	TokenNameIdentifier	 set Stroke
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
.	TokenNameDOT	
strokeStroke	TokenNameIdentifier	 stroke Stroke
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics2D	TokenNameIdentifier	 graphics2 D
.	TokenNameDOT	
setPaint	TokenNameIdentifier	 set Paint
(	TokenNameLPAREN	
tpi	TokenNameIdentifier	 tpi
.	TokenNameDOT	
strokePaint	TokenNameIdentifier	 stroke Paint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphics2D	TokenNameIdentifier	 graphics2 D
.	TokenNameDOT	
draw	TokenNameIdentifier	 draw
(	TokenNameLPAREN	
tShape	TokenNameIdentifier	 t Shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// paint the glyph children nodes 	TokenNameCOMMENT_LINE	paint the glyph children nodes 
if	TokenNameif	
(	TokenNameLPAREN	
glyphChildrenNode	TokenNameIdentifier	 glyph Children Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glyphChildrenNode	TokenNameIdentifier	 glyph Children Node
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphChildrenNode	TokenNameIdentifier	 glyph Children Node
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
graphics2D	TokenNameIdentifier	 graphics2 D
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
