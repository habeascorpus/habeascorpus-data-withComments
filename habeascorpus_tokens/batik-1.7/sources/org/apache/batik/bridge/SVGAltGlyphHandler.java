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
font	TokenNameIdentifier	 font
.	TokenNameDOT	
AltGlyphHandler	TokenNameIdentifier	 Alt Glyph Handler
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
Glyph	TokenNameIdentifier	 Glyph
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
SVGGVTGlyphVector	TokenNameIdentifier	 SVGGVT Glyph Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SVGConstants	TokenNameIdentifier	 SVG Constants
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
/** * SVG font altGlyph handler. This class handles the creation of an alternate * GVTGlyphVector for the altGlyph element. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: SVGAltGlyphHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 SVG font altGlyph handler. This class handles the creation of an alternate GVTGlyphVector for the altGlyph element. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: SVGAltGlyphHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGAltGlyphHandler	TokenNameIdentifier	 SVG Alt Glyph Handler
implements	TokenNameimplements	
AltGlyphHandler	TokenNameIdentifier	 Alt Glyph Handler
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
{	TokenNameLBRACE	
private	TokenNameprivate	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Element	TokenNameIdentifier	 Element
textElement	TokenNameIdentifier	 text Element
;	TokenNameSEMICOLON	
/** * Constructs an SVGAltGlyphHandler. * * @param ctx The bridge context, this is needed during rendering to find * any referenced glyph elements. * @param textElement The element that contains text to be replaced by the * alternate glyphs. This should be an altGlyph element. */	TokenNameCOMMENT_JAVADOC	 Constructs an SVGAltGlyphHandler. * @param ctx The bridge context, this is needed during rendering to find any referenced glyph elements. @param textElement The element that contains text to be replaced by the alternate glyphs. This should be an altGlyph element. 
public	TokenNamepublic	
SVGAltGlyphHandler	TokenNameIdentifier	 SVG Alt Glyph Handler
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
textElement	TokenNameIdentifier	 text Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
textElement	TokenNameIdentifier	 text Element
=	TokenNameEQUAL	
textElement	TokenNameIdentifier	 text Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a glyph vector containing the alternate glyphs. * * @param frc The current font render context. * @param fontSize The required font size. * @return The GVTGlyphVector containing the alternate glyphs, or null if * the alternate glyphs could not be found. */	TokenNameCOMMENT_JAVADOC	 Creates a glyph vector containing the alternate glyphs. * @param frc The current font render context. @param fontSize The required font size. @return The GVTGlyphVector containing the alternate glyphs, or null if the alternate glyphs could not be found. 
public	TokenNamepublic	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
createGlyphVector	TokenNameIdentifier	 create Glyph Vector
(	TokenNameLPAREN	
FontRenderContext	TokenNameIdentifier	 Font Render Context
frc	TokenNameIdentifier	 frc
,	TokenNameCOMMA	
float	TokenNamefloat	
fontSize	TokenNameIdentifier	 font Size
,	TokenNameCOMMA	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
textElement	TokenNameIdentifier	 text Element
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
SVG_ALT_GLYPH_TAG	TokenNameIdentifier	 SVG  ALT  GLYPH  TAG
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
textElement	TokenNameIdentifier	 text Element
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGAltGlyphElementBridge	TokenNameIdentifier	 SVG Alt Glyph Element Bridge
altGlyphBridge	TokenNameIdentifier	 alt Glyph Bridge
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGAltGlyphElementBridge	TokenNameIdentifier	 SVG Alt Glyph Element Bridge
)	TokenNameRPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getBridge	TokenNameIdentifier	 get Bridge
(	TokenNameLPAREN	
textElement	TokenNameIdentifier	 text Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Glyph	TokenNameIdentifier	 Glyph
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphArray	TokenNameIdentifier	 glyph Array
=	TokenNameEQUAL	
altGlyphBridge	TokenNameIdentifier	 alt Glyph Bridge
.	TokenNameDOT	
createAltGlyphArray	TokenNameIdentifier	 create Alt Glyph Array
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
textElement	TokenNameIdentifier	 text Element
,	TokenNameCOMMA	
fontSize	TokenNameIdentifier	 font Size
,	TokenNameCOMMA	
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyphArray	TokenNameIdentifier	 glyph Array
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGGVTGlyphVector	TokenNameIdentifier	 SVGGVT Glyph Vector
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
glyphArray	TokenNameIdentifier	 glyph Array
,	TokenNameCOMMA	
frc	TokenNameIdentifier	 frc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
displayError	TokenNameIdentifier	 display Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Throw exception because we do not want to continue 	TokenNameCOMMENT_LINE	Throw exception because we do not want to continue 
// processing. In the case of a SecurityException, the 	TokenNameCOMMENT_LINE	processing. In the case of a SecurityException, the 
// end user would get a lot of exception like this one. 	TokenNameCOMMENT_LINE	end user would get a lot of exception like this one. 
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
