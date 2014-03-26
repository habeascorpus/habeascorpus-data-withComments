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
Font	TokenNameIdentifier	 Font
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
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GlyphVector	TokenNameIdentifier	 Glyph Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CharacterIterator	TokenNameIdentifier	 Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
StringCharacterIterator	TokenNameIdentifier	 String Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
/** * This is a wrapper class for a java.awt.Font instance. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: AWTGVTFont.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This is a wrapper class for a java.awt.Font instance. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: AWTGVTFont.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
implements	TokenNameimplements	
GVTFont	TokenNameIdentifier	 GVT Font
{	TokenNameLBRACE	
protected	TokenNameprotected	
Font	TokenNameIdentifier	 Font
awtFont	TokenNameIdentifier	 awt Font
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
scale	TokenNameIdentifier	 scale
;	TokenNameSEMICOLON	
/** * Creates a new AWTGVTFont that wraps the given Font. * * @param font The font object to wrap. */	TokenNameCOMMENT_JAVADOC	 Creates a new AWTGVTFont that wraps the given Font. * @param font The font object to wrap. 
public	TokenNamepublic	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getSize2D	TokenNameIdentifier	 get Size2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
awtFont	TokenNameIdentifier	 awt Font
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
deriveFont	TokenNameIdentifier	 derive Font
(	TokenNameLPAREN	
FONT_SIZE	TokenNameIdentifier	 FONT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
/	TokenNameDIVIDE	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
getSize2D	TokenNameIdentifier	 get Size2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeFontCache	TokenNameIdentifier	 initialize Font Cache
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AWTGVTFont that wraps the given Font. * * @param font The font object to wrap. * @param scale The scale factor to apply to font... */	TokenNameCOMMENT_JAVADOC	 Creates a new AWTGVTFont that wraps the given Font. * @param font The font object to wrap. @param scale The scale factor to apply to font... 
public	TokenNamepublic	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
,	TokenNameCOMMA	
float	TokenNamefloat	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getSize2D	TokenNameIdentifier	 get Size2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scale	TokenNameIdentifier	 scale
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
awtFont	TokenNameIdentifier	 awt Font
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
deriveFont	TokenNameIdentifier	 derive Font
(	TokenNameLPAREN	
FONT_SIZE	TokenNameIdentifier	 FONT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
/	TokenNameDIVIDE	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
getSize2D	TokenNameIdentifier	 get Size2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeFontCache	TokenNameIdentifier	 initialize Font Cache
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AWTGVTFont with the specified attributes. * * @param attributes Contains attributes of the font to create. */	TokenNameCOMMENT_JAVADOC	 Creates a new AWTGVTFont with the specified attributes. * @param attributes Contains attributes of the font to create. 
public	TokenNamepublic	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Float	TokenNameIdentifier	 Float
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
SIZE	TokenNameIdentifier	 SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
sz	TokenNameIdentifier	 sz
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
SIZE	TokenNameIdentifier	 SIZE
,	TokenNameCOMMA	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
FONT_SIZE	TokenNameIdentifier	 FONT  SIZE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
awtFont	TokenNameIdentifier	 awt Font
=	TokenNameEQUAL	
new	TokenNamenew	
Font	TokenNameIdentifier	 Font
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
awtFont	TokenNameIdentifier	 awt Font
=	TokenNameEQUAL	
new	TokenNamenew	
Font	TokenNameIdentifier	 Font
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
getSize2D	TokenNameIdentifier	 get Size2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
/	TokenNameDIVIDE	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
getSize2D	TokenNameIdentifier	 get Size2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeFontCache	TokenNameIdentifier	 initialize Font Cache
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AWTGVTFont from the specified name, style and point size. * * @param name The name of the new font. * @param style The required font style. * @param size The required font size. */	TokenNameCOMMENT_JAVADOC	 Creates a new AWTGVTFont from the specified name, style and point size. * @param name The name of the new font. @param style The required font style. @param size The required font size. 
public	TokenNamepublic	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
style	TokenNameIdentifier	 style
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
awtFont	TokenNameIdentifier	 awt Font
=	TokenNameEQUAL	
new	TokenNamenew	
Font	TokenNameIdentifier	 Font
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
style	TokenNameIdentifier	 style
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
FONT_SIZE	TokenNameIdentifier	 FONT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
/	TokenNameDIVIDE	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
getSize2D	TokenNameIdentifier	 get Size2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeFontCache	TokenNameIdentifier	 initialize Font Cache
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if this font can display the specified character. * * @param c The character to check. * @return Whether or not the character can be displayed. */	TokenNameCOMMENT_JAVADOC	 Checks if this font can display the specified character. * @param c The character to check. @return Whether or not the character can be displayed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canDisplay	TokenNameIdentifier	 can Display
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
canDisplay	TokenNameIdentifier	 can Display
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates whether or not this font can display the characters in the * specified text starting at start and ending at limit. * * @param text An array containing the characters to check. * @param start The index of the first character to check. * @param limit The index of the last character to check. * * @return The index of the first char this font cannot display. Will be * -1 if it can display all characters in the specified range. */	TokenNameCOMMENT_JAVADOC	 Indicates whether or not this font can display the characters in the specified text starting at start and ending at limit. * @param text An array containing the characters to check. @param start The index of the first character to check. @param limit The index of the last character to check. * @return The index of the first char this font cannot display. Will be -1 if it can display all characters in the specified range. 
public	TokenNamepublic	
int	TokenNameint	
canDisplayUpTo	TokenNameIdentifier	 can Display Up To
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
canDisplayUpTo	TokenNameIdentifier	 can Display Up To
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates whether or not this font can display the the characters in * the specified CharacterIterator starting at start and ending at limit. */	TokenNameCOMMENT_JAVADOC	 Indicates whether or not this font can display the the characters in the specified CharacterIterator starting at start and ending at limit. 
public	TokenNamepublic	
int	TokenNameint	
canDisplayUpTo	TokenNameIdentifier	 can Display Up To
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
canDisplayUpTo	TokenNameIdentifier	 can Display Up To
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates whether or not this font can display a specified String. */	TokenNameCOMMENT_JAVADOC	 Indicates whether or not this font can display a specified String. 
public	TokenNamepublic	
int	TokenNameint	
canDisplayUpTo	TokenNameIdentifier	 can Display Up To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
canDisplayUpTo	TokenNameIdentifier	 can Display Up To
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new GlyphVector object created with the specified array of * characters and the specified FontRenderContext. */	TokenNameCOMMENT_JAVADOC	 Returns a new GlyphVector object created with the specified array of characters and the specified FontRenderContext. 
public	TokenNamepublic	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringCharacterIterator	TokenNameIdentifier	 String Character Iterator
sci	TokenNameIdentifier	 sci
=	TokenNameEQUAL	
new	TokenNamenew	
StringCharacterIterator	TokenNameIdentifier	 String Character Iterator
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GlyphVector	TokenNameIdentifier	 Glyph Vector
gv	TokenNameIdentifier	 gv
=	TokenNameEQUAL	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
AWTGVTGlyphVector	TokenNameIdentifier	 AWTGVT Glyph Vector
(	TokenNameLPAREN	
gv	TokenNameIdentifier	 gv
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
scale	TokenNameIdentifier	 scale
,	TokenNameCOMMA	
sci	TokenNameIdentifier	 sci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new GlyphVector object created with the specified * CharacterIterator and the specified FontRenderContext. */	TokenNameCOMMENT_JAVADOC	 Returns a new GlyphVector object created with the specified CharacterIterator and the specified FontRenderContext. 
public	TokenNamepublic	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
CharacterIterator	TokenNameIdentifier	 Character Iterator
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
instanceof	TokenNameinstanceof	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
)	TokenNameRPAREN	
ci	TokenNameIdentifier	 ci
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ArabicTextHandler	TokenNameIdentifier	 Arabic Text Handler
.	TokenNameDOT	
containsArabic	TokenNameIdentifier	 contains Arabic
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
ArabicTextHandler	TokenNameIdentifier	 Arabic Text Handler
.	TokenNameDOT	
createSubstituteString	TokenNameIdentifier	 create Substitute String
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
GlyphVector	TokenNameIdentifier	 Glyph Vector
gv	TokenNameIdentifier	 gv
=	TokenNameEQUAL	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
AWTGVTGlyphVector	TokenNameIdentifier	 AWTGVT Glyph Vector
(	TokenNameLPAREN	
gv	TokenNameIdentifier	 gv
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
scale	TokenNameIdentifier	 scale
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new GlyphVector object created with the specified integer * array and the specified FontRenderContext. */	TokenNameCOMMENT_JAVADOC	 Returns a new GlyphVector object created with the specified integer array and the specified FontRenderContext. 
public	TokenNamepublic	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphCodes	TokenNameIdentifier	 glyph Codes
,	TokenNameCOMMA	
CharacterIterator	TokenNameIdentifier	 Character Iterator
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AWTGVTGlyphVector	TokenNameIdentifier	 AWTGVT Glyph Vector
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
glyphCodes	TokenNameIdentifier	 glyph Codes
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
scale	TokenNameIdentifier	 scale
,	TokenNameCOMMA	
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new GlyphVector object created with the specified String and * the specified FontRenderContext. */	TokenNameCOMMENT_JAVADOC	 Returns a new GlyphVector object created with the specified String and the specified FontRenderContext. 
public	TokenNamepublic	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringCharacterIterator	TokenNameIdentifier	 String Character Iterator
sci	TokenNameIdentifier	 sci
=	TokenNameEQUAL	
new	TokenNamenew	
StringCharacterIterator	TokenNameIdentifier	 String Character Iterator
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
AWTGVTGlyphVector	TokenNameIdentifier	 AWTGVT Glyph Vector
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
scale	TokenNameIdentifier	 scale
,	TokenNameCOMMA	
sci	TokenNameIdentifier	 sci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new Font object by replicating the current Font object and * applying a new size to it. */	TokenNameCOMMENT_JAVADOC	 Creates a new Font object by replicating the current Font object and applying a new size to it. 
public	TokenNamepublic	
GVTFont	TokenNameIdentifier	 GVT Font
deriveFont	TokenNameIdentifier	 derive Font
(	TokenNameLPAREN	
float	TokenNamefloat	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
/	TokenNameDIVIDE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFamilyName	TokenNameIdentifier	 get Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
getFamily	TokenNameIdentifier	 get Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a LineMetrics object created with the specified arguments. */	TokenNameCOMMENT_JAVADOC	 Returns a LineMetrics object created with the specified arguments. 
public	TokenNamepublic	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
getLineMetrics	TokenNameIdentifier	 get Line Metrics
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
beginIndex	TokenNameIdentifier	 begin Index
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
getLineMetrics	TokenNameIdentifier	 get Line Metrics
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
beginIndex	TokenNameIdentifier	 begin Index
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a GVTLineMetrics object created with the specified arguments. */	TokenNameCOMMENT_JAVADOC	 Returns a GVTLineMetrics object created with the specified arguments. 
public	TokenNamepublic	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
getLineMetrics	TokenNameIdentifier	 get Line Metrics
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
ci	TokenNameIdentifier	 ci
,	TokenNameCOMMA	
int	TokenNameint	
beginIndex	TokenNameIdentifier	 begin Index
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
getLineMetrics	TokenNameIdentifier	 get Line Metrics
(	TokenNameLPAREN	
ci	TokenNameIdentifier	 ci
,	TokenNameCOMMA	
beginIndex	TokenNameIdentifier	 begin Index
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a GVTLineMetrics object created with the specified String and * FontRenderContext. */	TokenNameCOMMENT_JAVADOC	 Returns a GVTLineMetrics object created with the specified String and FontRenderContext. 
public	TokenNamepublic	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
getLineMetrics	TokenNameIdentifier	 get Line Metrics
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
getLineMetrics	TokenNameIdentifier	 get Line Metrics
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a GVTLineMetrics object created with the specified arguments. */	TokenNameCOMMENT_JAVADOC	 Returns a GVTLineMetrics object created with the specified arguments. 
public	TokenNamepublic	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
getLineMetrics	TokenNameIdentifier	 get Line Metrics
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
int	TokenNameint	
beginIndex	TokenNameIdentifier	 begin Index
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
.	TokenNameDOT	
getLineMetrics	TokenNameIdentifier	 get Line Metrics
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
beginIndex	TokenNameIdentifier	 begin Index
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the size of this font. */	TokenNameCOMMENT_JAVADOC	 Returns the size of this font. 
public	TokenNamepublic	
float	TokenNamefloat	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the horizontal kerning value for this glyph pair. */	TokenNameCOMMENT_JAVADOC	 Returns the horizontal kerning value for this glyph pair. 
public	TokenNamepublic	
float	TokenNamefloat	
getHKern	TokenNameIdentifier	 get H Kern
(	TokenNameLPAREN	
int	TokenNameint	
glyphCode1	TokenNameIdentifier	 glyph Code1
,	TokenNameCOMMA	
int	TokenNameint	
glyphCode2	TokenNameIdentifier	 glyph Code2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the vertical kerning value for this glyph pair. */	TokenNameCOMMENT_JAVADOC	 Returns the vertical kerning value for this glyph pair. 
public	TokenNamepublic	
float	TokenNamefloat	
getVKern	TokenNameIdentifier	 get V Kern
(	TokenNameLPAREN	
int	TokenNameint	
glyphCode1	TokenNameIdentifier	 glyph Code1
,	TokenNameCOMMA	
int	TokenNameint	
glyphCode2	TokenNameIdentifier	 glyph Code2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
FONT_SIZE	TokenNameIdentifier	 FONT  SIZE
=	TokenNameEQUAL	
48f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
/** * Returns the geometry of the specified character. This method also put * the in cache the geometry associated to the specified character if * needed. */	TokenNameCOMMENT_JAVADOC	 Returns the geometry of the specified character. This method also put the in cache the geometry associated to the specified character if needed. 
public	TokenNamepublic	
static	TokenNamestatic	
AWTGlyphGeometryCache	TokenNameIdentifier	 AWT Glyph Geometry Cache
.	TokenNameDOT	
Value	TokenNameIdentifier	 Value
getGlyphGeometry	TokenNameIdentifier	 get Glyph Geometry
(	TokenNameLPAREN	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
font	TokenNameIdentifier	 font
,	TokenNameCOMMA	
char	TokenNamechar	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
GlyphVector	TokenNameIdentifier	 Glyph Vector
gv	TokenNameIdentifier	 gv
,	TokenNameCOMMA	
int	TokenNameint	
glyphIndex	TokenNameIdentifier	 glyph Index
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
glyphPos	TokenNameIdentifier	 glyph Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AWTGlyphGeometryCache	TokenNameIdentifier	 AWT Glyph Geometry Cache
glyphCache	TokenNameIdentifier	 glyph Cache
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AWTGlyphGeometryCache	TokenNameIdentifier	 AWT Glyph Geometry Cache
)	TokenNameRPAREN	
fontCache	TokenNameIdentifier	 font Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
awtFont	TokenNameIdentifier	 awt Font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AWTGlyphGeometryCache	TokenNameIdentifier	 AWT Glyph Geometry Cache
.	TokenNameDOT	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
glyphCache	TokenNameIdentifier	 glyph Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getGlyphOutline	TokenNameIdentifier	 get Glyph Outline
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
metrics	TokenNameIdentifier	 metrics
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
.	TokenNameDOT	
getGlyphMetrics	TokenNameIdentifier	 get Glyph Metrics
(	TokenNameLPAREN	
glyphIndex	TokenNameIdentifier	 glyph Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
gmB	TokenNameIdentifier	 gm B
=	TokenNameEQUAL	
metrics	TokenNameIdentifier	 metrics
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
AWTGVTGlyphVector	TokenNameIdentifier	 AWTGVT Glyph Vector
.	TokenNameDOT	
outlinesPositioned	TokenNameIdentifier	 outlines Positioned
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getTranslateInstance	TokenNameIdentifier	 get Translate Instance
(	TokenNameLPAREN	
-	TokenNameMINUS	
glyphPos	TokenNameIdentifier	 glyph Pos
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
glyphPos	TokenNameIdentifier	 glyph Pos
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
AWTGlyphGeometryCache	TokenNameIdentifier	 AWT Glyph Geometry Cache
.	TokenNameDOT	
Value	TokenNameIdentifier	 Value
(	TokenNameLPAREN	
outline	TokenNameIdentifier	 outline
,	TokenNameCOMMA	
gmB	TokenNameIdentifier	 gm B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("put "+font.awtFont+" "+c); 	TokenNameCOMMENT_LINE	System.out.println("put "+font.awtFont+" "+c); 
glyphCache	TokenNameIdentifier	 glyph Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// static cache for AWTGVTFont 	TokenNameCOMMENT_LINE	static cache for AWTGVTFont 
// 	TokenNameCOMMENT_LINE	 
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
fontCache	TokenNameIdentifier	 font Cache
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
void	TokenNamevoid	
initializeFontCache	TokenNameIdentifier	 initialize Font Cache
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
awtFont	TokenNameIdentifier	 awt Font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fontCache	TokenNameIdentifier	 font Cache
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontCache	TokenNameIdentifier	 font Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
,	TokenNameCOMMA	
new	TokenNamenew	
AWTGlyphGeometryCache	TokenNameIdentifier	 AWT Glyph Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
putAWTGVTFont	TokenNameIdentifier	 put AWTGVT Font
(	TokenNameLPAREN	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontCache	TokenNameIdentifier	 font Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
awtFont	TokenNameIdentifier	 awt Font
,	TokenNameCOMMA	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
getAWTGVTFont	TokenNameIdentifier	 get AWTGVT Font
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
awtFont	TokenNameIdentifier	 awt Font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
)	TokenNameRPAREN	
fontCache	TokenNameIdentifier	 font Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
awtFont	TokenNameIdentifier	 awt Font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
