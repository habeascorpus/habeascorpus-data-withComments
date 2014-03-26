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
font	TokenNameIdentifier	 font
.	TokenNameDOT	
FontRenderContext	TokenNameIdentifier	 Font Render Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CharacterIterator	TokenNameIdentifier	 Character Iterator
;	TokenNameSEMICOLON	
/** * An interface for all GVT font classes. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: GVTFont.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An interface for all GVT font classes. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: GVTFont.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
GVTFont	TokenNameIdentifier	 GVT Font
{	TokenNameLBRACE	
/** * Checks if this Font has a glyph for the specified character. */	TokenNameCOMMENT_JAVADOC	 Checks if this Font has a glyph for the specified character. 
boolean	TokenNameboolean	
canDisplay	TokenNameIdentifier	 can Display
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Indicates whether or not this Font can display the characters in the * specified text starting at start and ending at limit. */	TokenNameCOMMENT_JAVADOC	 Indicates whether or not this Font can display the characters in the specified text starting at start and ending at limit. 
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
;	TokenNameSEMICOLON	
/** * Indicates whether or not this Font can display the the characters in * the specified CharacterIterator starting at start and ending at limit. */	TokenNameCOMMENT_JAVADOC	 Indicates whether or not this Font can display the the characters in the specified CharacterIterator starting at start and ending at limit. 
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
;	TokenNameSEMICOLON	
/** * Indicates whether or not this Font can display a specified String. */	TokenNameCOMMENT_JAVADOC	 Indicates whether or not this Font can display a specified String. 
int	TokenNameint	
canDisplayUpTo	TokenNameIdentifier	 can Display Up To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a new GlyphVector object created with the specified array of * characters and the specified FontRenderContext. */	TokenNameCOMMENT_JAVADOC	 Returns a new GlyphVector object created with the specified array of characters and the specified FontRenderContext. 
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
;	TokenNameSEMICOLON	
/** * Returns a new GlyphVector object created with the specified * CharacterIterator and the specified FontRenderContext. */	TokenNameCOMMENT_JAVADOC	 Returns a new GlyphVector object created with the specified CharacterIterator and the specified FontRenderContext. 
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
CharacterIterator	TokenNameIdentifier	 Character Iterator
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a new GlyphVector object created with the specified integer * array and the specified FontRenderContext. */	TokenNameCOMMENT_JAVADOC	 Returns a new GlyphVector object created with the specified integer array and the specified FontRenderContext. 
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
;	TokenNameSEMICOLON	
/** * Returns a new GlyphVector object created with the specified String and * the specified FontRenderContext. */	TokenNameCOMMENT_JAVADOC	 Returns a new GlyphVector object created with the specified String and the specified FontRenderContext. 
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new Font object by replicating the current Font object and * applying a new size to it. */	TokenNameCOMMENT_JAVADOC	 Creates a new Font object by replicating the current Font object and applying a new size to it. 
GVTFont	TokenNameIdentifier	 GVT Font
deriveFont	TokenNameIdentifier	 derive Font
(	TokenNameLPAREN	
float	TokenNamefloat	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the font family name of this font. */	TokenNameCOMMENT_JAVADOC	 Returns the font family name of this font. 
String	TokenNameIdentifier	 String
getFamilyName	TokenNameIdentifier	 get Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a GVTLineMetrics object created with the specified arguments. */	TokenNameCOMMENT_JAVADOC	 Returns a GVTLineMetrics object created with the specified arguments. 
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
;	TokenNameSEMICOLON	
/** * Returns a GVTLineMetrics object created with the specified arguments. */	TokenNameCOMMENT_JAVADOC	 Returns a GVTLineMetrics object created with the specified arguments. 
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
;	TokenNameSEMICOLON	
/** * Returns a GVTLineMetrics object created with the specified String and * FontRenderContext. */	TokenNameCOMMENT_JAVADOC	 Returns a GVTLineMetrics object created with the specified String and FontRenderContext. 
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
getLineMetrics	TokenNameIdentifier	 get Line Metrics
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a GVTLineMetrics object created with the specified arguments. */	TokenNameCOMMENT_JAVADOC	 Returns a GVTLineMetrics object created with the specified arguments. 
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
;	TokenNameSEMICOLON	
/** * Returns the size of this font. */	TokenNameCOMMENT_JAVADOC	 Returns the size of this font. 
float	TokenNamefloat	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the horizontal kerning value of this glyph pair. */	TokenNameCOMMENT_JAVADOC	 Returns the horizontal kerning value of this glyph pair. 
float	TokenNamefloat	
getVKern	TokenNameIdentifier	 get V Kern
(	TokenNameLPAREN	
int	TokenNameint	
glyphCode1	TokenNameIdentifier	 glyph Code1
,	TokenNameCOMMA	
int	TokenNameint	
glyphCode2	TokenNameIdentifier	 glyph Code2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the vertical kerning value of this glyph pair. */	TokenNameCOMMENT_JAVADOC	 Returns the vertical kerning value of this glyph pair. 
float	TokenNamefloat	
getHKern	TokenNameIdentifier	 get H Kern
(	TokenNameLPAREN	
int	TokenNameint	
glyphCode1	TokenNameIdentifier	 glyph Code1
,	TokenNameCOMMA	
int	TokenNameint	
glyphCode2	TokenNameIdentifier	 glyph Code2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
