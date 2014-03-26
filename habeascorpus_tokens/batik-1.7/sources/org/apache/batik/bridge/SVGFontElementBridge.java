/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
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
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GVTFontFace	TokenNameIdentifier	 GVT Font Face
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
/** * Bridge class for the &lt;font> element. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: SVGFontElementBridge.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;font> element. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: SVGFontElementBridge.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGFontElementBridge	TokenNameIdentifier	 SVG Font Element Bridge
extends	TokenNameextends	
AbstractSVGBridge	TokenNameIdentifier	 Abstract SVG Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for the &lt;font> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;font> element. 
public	TokenNamepublic	
SVGFontElementBridge	TokenNameIdentifier	 SVG Font Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'font'. */	TokenNameCOMMENT_JAVADOC	 Returns 'font'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_FONT_TAG	TokenNameIdentifier	 SVG  FONT  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new SVGGVTFont that represents the specified &lt;font> element * at the requested size. * * @param ctx The current bridge context. * @param fontElement The font element to base the SVGGVTFont construction on. * @param textElement The text element that will use the new font. * @param size The size of the new font. * @param fontFace The font face object that contains the font attributes. * * @return The new SVGGVTFont. */	TokenNameCOMMENT_JAVADOC	 Constructs a new SVGGVTFont that represents the specified &lt;font> element at the requested size. * @param ctx The current bridge context. @param fontElement The font element to base the SVGGVTFont construction on. @param textElement The text element that will use the new font. @param size The size of the new font. @param fontFace The font face object that contains the font attributes. * @return The new SVGGVTFont. 
public	TokenNamepublic	
SVGGVTFont	TokenNameIdentifier	 SVGGVT Font
createFont	TokenNameIdentifier	 create Font
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
fontElement	TokenNameIdentifier	 font Element
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
textElement	TokenNameIdentifier	 text Element
,	TokenNameCOMMA	
float	TokenNamefloat	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
GVTFontFace	TokenNameIdentifier	 GVT Font Face
fontFace	TokenNameIdentifier	 font Face
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// construct a list of glyph codes that this font can display and 	TokenNameCOMMENT_LINE	construct a list of glyph codes that this font can display and 
// a list of the glyph elements 	TokenNameCOMMENT_LINE	a list of the glyph elements 
NodeList	TokenNameIdentifier	 Node List
glyphElements	TokenNameIdentifier	 glyph Elements
=	TokenNameEQUAL	
fontElement	TokenNameIdentifier	 font Element
.	TokenNameDOT	
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_GLYPH_TAG	TokenNameIdentifier	 SVG  GLYPH  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numGlyphs	TokenNameIdentifier	 num Glyphs
=	TokenNameEQUAL	
glyphElements	TokenNameIdentifier	 glyph Elements
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphCodes	TokenNameIdentifier	 glyph Codes
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
numGlyphs	TokenNameIdentifier	 num Glyphs
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphNames	TokenNameIdentifier	 glyph Names
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
numGlyphs	TokenNameIdentifier	 num Glyphs
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphLangs	TokenNameIdentifier	 glyph Langs
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
numGlyphs	TokenNameIdentifier	 num Glyphs
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphOrientations	TokenNameIdentifier	 glyph Orientations
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
numGlyphs	TokenNameIdentifier	 num Glyphs
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphForms	TokenNameIdentifier	 glyph Forms
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
numGlyphs	TokenNameIdentifier	 num Glyphs
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphElementArray	TokenNameIdentifier	 glyph Element Array
=	TokenNameEQUAL	
new	TokenNamenew	
Element	TokenNameIdentifier	 Element
[	TokenNameLBRACKET	
numGlyphs	TokenNameIdentifier	 num Glyphs
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
numGlyphs	TokenNameIdentifier	 num Glyphs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
glyphElement	TokenNameIdentifier	 glyph Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
glyphElements	TokenNameIdentifier	 glyph Elements
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphCodes	TokenNameIdentifier	 glyph Codes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyphElement	TokenNameIdentifier	 glyph Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_UNICODE_ATTRIBUTE	TokenNameIdentifier	 SVG  UNICODE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyphCodes	TokenNameIdentifier	 glyph Codes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ligature, may need to reverse if arabic so that it is in visual order 	TokenNameCOMMENT_LINE	ligature, may need to reverse if arabic so that it is in visual order 
if	TokenNameif	
(	TokenNameLPAREN	
ArabicTextHandler	TokenNameIdentifier	 Arabic Text Handler
.	TokenNameDOT	
arabicChar	TokenNameIdentifier	 arabic Char
(	TokenNameLPAREN	
glyphCodes	TokenNameIdentifier	 glyph Codes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
glyphCodes	TokenNameIdentifier	 glyph Codes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
glyphCodes	TokenNameIdentifier	 glyph Codes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
glyphNames	TokenNameIdentifier	 glyph Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyphElement	TokenNameIdentifier	 glyph Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_GLYPH_NAME_ATTRIBUTE	TokenNameIdentifier	 SVG  GLYPH  NAME  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphLangs	TokenNameIdentifier	 glyph Langs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyphElement	TokenNameIdentifier	 glyph Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_LANG_ATTRIBUTE	TokenNameIdentifier	 SVG  LANG  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphOrientations	TokenNameIdentifier	 glyph Orientations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyphElement	TokenNameIdentifier	 glyph Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ORIENTATION_ATTRIBUTE	TokenNameIdentifier	 SVG  ORIENTATION  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphForms	TokenNameIdentifier	 glyph Forms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyphElement	TokenNameIdentifier	 glyph Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ARABIC_FORM_ATTRIBUTE	TokenNameIdentifier	 SVG  ARABIC  FORM  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphElementArray	TokenNameIdentifier	 glyph Element Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyphElement	TokenNameIdentifier	 glyph Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get the missing glyph element 	TokenNameCOMMENT_LINE	get the missing glyph element 
NodeList	TokenNameIdentifier	 Node List
missingGlyphElements	TokenNameIdentifier	 missing Glyph Elements
=	TokenNameEQUAL	
fontElement	TokenNameIdentifier	 font Element
.	TokenNameDOT	
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_MISSING_GLYPH_TAG	TokenNameIdentifier	 SVG  MISSING  GLYPH  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
missingGlyphElement	TokenNameIdentifier	 missing Glyph Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
missingGlyphElements	TokenNameIdentifier	 missing Glyph Elements
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
missingGlyphElement	TokenNameIdentifier	 missing Glyph Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
missingGlyphElements	TokenNameIdentifier	 missing Glyph Elements
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get the hkern elements 	TokenNameCOMMENT_LINE	get the hkern elements 
NodeList	TokenNameIdentifier	 Node List
hkernElements	TokenNameIdentifier	 hkern Elements
=	TokenNameEQUAL	
fontElement	TokenNameIdentifier	 font Element
.	TokenNameDOT	
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_HKERN_TAG	TokenNameIdentifier	 SVG  HKERN  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hkernElementArray	TokenNameIdentifier	 hkern Element Array
=	TokenNameEQUAL	
new	TokenNamenew	
Element	TokenNameIdentifier	 Element
[	TokenNameLBRACKET	
hkernElements	TokenNameIdentifier	 hkern Elements
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
hkernElementArray	TokenNameIdentifier	 hkern Element Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
hkernElement	TokenNameIdentifier	 hkern Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
hkernElements	TokenNameIdentifier	 hkern Elements
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hkernElementArray	TokenNameIdentifier	 hkern Element Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
hkernElement	TokenNameIdentifier	 hkern Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get the vkern elements 	TokenNameCOMMENT_LINE	get the vkern elements 
NodeList	TokenNameIdentifier	 Node List
vkernElements	TokenNameIdentifier	 vkern Elements
=	TokenNameEQUAL	
fontElement	TokenNameIdentifier	 font Element
.	TokenNameDOT	
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_VKERN_TAG	TokenNameIdentifier	 SVG  VKERN  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vkernElementArray	TokenNameIdentifier	 vkern Element Array
=	TokenNameEQUAL	
new	TokenNamenew	
Element	TokenNameIdentifier	 Element
[	TokenNameLBRACKET	
vkernElements	TokenNameIdentifier	 vkern Elements
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
vkernElementArray	TokenNameIdentifier	 vkern Element Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
vkernElement	TokenNameIdentifier	 vkern Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
vkernElements	TokenNameIdentifier	 vkern Elements
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vkernElementArray	TokenNameIdentifier	 vkern Element Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
vkernElement	TokenNameIdentifier	 vkern Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return the new SVGGVTFont 	TokenNameCOMMENT_LINE	return the new SVGGVTFont 
return	TokenNamereturn	
new	TokenNamenew	
SVGGVTFont	TokenNameIdentifier	 SVGGVT Font
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
fontFace	TokenNameIdentifier	 font Face
,	TokenNameCOMMA	
glyphCodes	TokenNameIdentifier	 glyph Codes
,	TokenNameCOMMA	
glyphNames	TokenNameIdentifier	 glyph Names
,	TokenNameCOMMA	
glyphLangs	TokenNameIdentifier	 glyph Langs
,	TokenNameCOMMA	
glyphOrientations	TokenNameIdentifier	 glyph Orientations
,	TokenNameCOMMA	
glyphForms	TokenNameIdentifier	 glyph Forms
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
glyphElementArray	TokenNameIdentifier	 glyph Element Array
,	TokenNameCOMMA	
missingGlyphElement	TokenNameIdentifier	 missing Glyph Element
,	TokenNameCOMMA	
hkernElementArray	TokenNameIdentifier	 hkern Element Array
,	TokenNameCOMMA	
vkernElementArray	TokenNameIdentifier	 vkern Element Array
,	TokenNameCOMMA	
textElement	TokenNameIdentifier	 text Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
