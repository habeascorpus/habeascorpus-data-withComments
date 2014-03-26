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
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
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
/** * GVTGlyphMetrics is essentially a wrapper class for java.awt.font.GlyphMetrics * with the addition of horizontal and vertical advance values. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: GVTGlyphMetrics.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 GVTGlyphMetrics is essentially a wrapper class for java.awt.font.GlyphMetrics with the addition of horizontal and vertical advance values. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: GVTGlyphMetrics.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
{	TokenNameLBRACE	
private	TokenNameprivate	
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
gm	TokenNameIdentifier	 gm
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
verticalAdvance	TokenNameIdentifier	 vertical Advance
;	TokenNameSEMICOLON	
/** * Constructs a new GVTGlyphMetrics object based upon the specified * GlyphMetrics object and an additional vertical advance value. * * @param gm The glyph metrics. * @param verticalAdvance The vertical advance of the glyph. */	TokenNameCOMMENT_JAVADOC	 Constructs a new GVTGlyphMetrics object based upon the specified GlyphMetrics object and an additional vertical advance value. * @param gm The glyph metrics. @param verticalAdvance The vertical advance of the glyph. 
public	TokenNamepublic	
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
(	TokenNameLPAREN	
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
gm	TokenNameIdentifier	 gm
,	TokenNameCOMMA	
float	TokenNamefloat	
verticalAdvance	TokenNameIdentifier	 vertical Advance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
gm	TokenNameIdentifier	 gm
=	TokenNameEQUAL	
gm	TokenNameIdentifier	 gm
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
verticalAdvance	TokenNameIdentifier	 vertical Advance
=	TokenNameEQUAL	
verticalAdvance	TokenNameIdentifier	 vertical Advance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new GVTGlyphMetrics object using the specified parameters. * * @param horizontalAdvance The horizontal advance of the glyph. * @param verticalAdvance The vertical advance of the glyph. * @param bounds The black box bounds of the glyph. * @param glyphType The type of the glyph. */	TokenNameCOMMENT_JAVADOC	 Constructs a new GVTGlyphMetrics object using the specified parameters. * @param horizontalAdvance The horizontal advance of the glyph. @param verticalAdvance The vertical advance of the glyph. @param bounds The black box bounds of the glyph. @param glyphType The type of the glyph. 
public	TokenNamepublic	
GVTGlyphMetrics	TokenNameIdentifier	 GVT Glyph Metrics
(	TokenNameLPAREN	
float	TokenNamefloat	
horizontalAdvance	TokenNameIdentifier	 horizontal Advance
,	TokenNameCOMMA	
float	TokenNamefloat	
verticalAdvance	TokenNameIdentifier	 vertical Advance
,	TokenNameCOMMA	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
byte	TokenNamebyte	
glyphType	TokenNameIdentifier	 glyph Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
gm	TokenNameIdentifier	 gm
=	TokenNameEQUAL	
new	TokenNamenew	
GlyphMetrics	TokenNameIdentifier	 Glyph Metrics
(	TokenNameLPAREN	
horizontalAdvance	TokenNameIdentifier	 horizontal Advance
,	TokenNameCOMMA	
bounds	TokenNameIdentifier	 bounds
,	TokenNameCOMMA	
glyphType	TokenNameIdentifier	 glyph Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
verticalAdvance	TokenNameIdentifier	 vertical Advance
=	TokenNameEQUAL	
verticalAdvance	TokenNameIdentifier	 vertical Advance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the horizontal advance of the glyph. */	TokenNameCOMMENT_JAVADOC	 Returns the horizontal advance of the glyph. 
public	TokenNamepublic	
float	TokenNamefloat	
getHorizontalAdvance	TokenNameIdentifier	 get Horizontal Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
getAdvance	TokenNameIdentifier	 get Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the vertical advance of the glyph. */	TokenNameCOMMENT_JAVADOC	 Returns the vertical advance of the glyph. 
public	TokenNamepublic	
float	TokenNamefloat	
getVerticalAdvance	TokenNameIdentifier	 get Vertical Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
verticalAdvance	TokenNameIdentifier	 vertical Advance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the black box bounds of the glyph. */	TokenNameCOMMENT_JAVADOC	 Returns the black box bounds of the glyph. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the left (top) side bearing of the glyph. */	TokenNameCOMMENT_JAVADOC	 Returns the left (top) side bearing of the glyph. 
public	TokenNamepublic	
float	TokenNamefloat	
getLSB	TokenNameIdentifier	 get LSB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
getLSB	TokenNameIdentifier	 get LSB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the right (bottom) side bearing of the glyph. */	TokenNameCOMMENT_JAVADOC	 Returns the right (bottom) side bearing of the glyph. 
public	TokenNamepublic	
float	TokenNamefloat	
getRSB	TokenNameIdentifier	 get RSB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
getRSB	TokenNameIdentifier	 get RSB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the raw glyph type code. */	TokenNameCOMMENT_JAVADOC	 Returns the raw glyph type code. 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this is a combining glyph. */	TokenNameCOMMENT_JAVADOC	 Returns true if this is a combining glyph. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCombining	TokenNameIdentifier	 is Combining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
isCombining	TokenNameIdentifier	 is Combining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this is a component glyph. */	TokenNameCOMMENT_JAVADOC	 Returns true if this is a component glyph. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isComponent	TokenNameIdentifier	 is Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
isComponent	TokenNameIdentifier	 is Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this is a ligature glyph. */	TokenNameCOMMENT_JAVADOC	 Returns true if this is a ligature glyph. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLigature	TokenNameIdentifier	 is Ligature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
isLigature	TokenNameIdentifier	 is Ligature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this is a standard glyph. */	TokenNameCOMMENT_JAVADOC	 Returns true if this is a standard glyph. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isStandard	TokenNameIdentifier	 is Standard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
isStandard	TokenNameIdentifier	 is Standard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this is a whitespace glyph. */	TokenNameCOMMENT_JAVADOC	 Returns true if this is a whitespace glyph. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
