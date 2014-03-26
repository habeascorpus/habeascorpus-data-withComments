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
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractNode	TokenNameIdentifier	 Abstract Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XLinkSupport	TokenNameIdentifier	 X Link Support
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
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
Node	TokenNameIdentifier	 Node
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
/** * Bridge class for the &lt;altGlyph> element. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: SVGAltGlyphElementBridge.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;altGlyph> element. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: SVGAltGlyphElementBridge.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGAltGlyphElementBridge	TokenNameIdentifier	 SVG Alt Glyph Element Bridge
extends	TokenNameextends	
AbstractSVGBridge	TokenNameIdentifier	 Abstract SVG Bridge
implements	TokenNameimplements	
ErrorConstants	TokenNameIdentifier	 Error Constants
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
/** * Constructs a new bridge for the &lt;altGlyph> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;altGlyph> element. 
public	TokenNamepublic	
SVGAltGlyphElementBridge	TokenNameIdentifier	 SVG Alt Glyph Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'altGlyph'. */	TokenNameCOMMENT_JAVADOC	 Returns 'altGlyph'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_ALT_GLYPH_TAG	TokenNameIdentifier	 SVG  ALT  GLYPH  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an array of Glyphs that represents the specified * &lt;altGlyph> element at the requested size. * * @param ctx The current bridge context. * @param altGlyphElement The altGlyph element to base the SVGGVTGlyphVector * construction on. * @param fontSize The font size of the Glyphs to create. * * @return The new SVGGVTGlyphVector or null if any of the glyphs are * unavailable. */	TokenNameCOMMENT_JAVADOC	 Constructs an array of Glyphs that represents the specified &lt;altGlyph> element at the requested size. * @param ctx The current bridge context. @param altGlyphElement The altGlyph element to base the SVGGVTGlyphVector construction on. @param fontSize The font size of the Glyphs to create. * @return The new SVGGVTGlyphVector or null if any of the glyphs are unavailable. 
public	TokenNamepublic	
Glyph	TokenNameIdentifier	 Glyph
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
createAltGlyphArray	TokenNameIdentifier	 create Alt Glyph Array
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
altGlyphElement	TokenNameIdentifier	 alt Glyph Element
,	TokenNameCOMMA	
float	TokenNamefloat	
fontSize	TokenNameIdentifier	 font Size
,	TokenNameCOMMA	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the referenced element 	TokenNameCOMMENT_LINE	get the referenced element 
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
getXLinkHref	TokenNameIdentifier	 get X Link Href
(	TokenNameLPAREN	
altGlyphElement	TokenNameIdentifier	 alt Glyph Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
refElement	TokenNameIdentifier	 ref Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
refElement	TokenNameIdentifier	 ref Element
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getReferencedElement	TokenNameIdentifier	 get Referenced Element
(	TokenNameLPAREN	
altGlyphElement	TokenNameIdentifier	 alt Glyph Element
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BridgeException	TokenNameIdentifier	 Bridge Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ERR_URI_UNSECURE	TokenNameIdentifier	 ERR  URI  UNSECURE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCode	TokenNameIdentifier	 get Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
refElement	TokenNameIdentifier	 ref Element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// couldn't find the referenced element 	TokenNameCOMMENT_LINE	couldn't find the referenced element 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
refElement	TokenNameIdentifier	 ref Element
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Not an SVG element. 	TokenNameCOMMENT_LINE	Not an SVG element. 
// if the referenced element is a glyph 	TokenNameCOMMENT_LINE	if the referenced element is a glyph 
if	TokenNameif	
(	TokenNameLPAREN	
refElement	TokenNameIdentifier	 ref Element
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_GLYPH_TAG	TokenNameIdentifier	 SVG  GLYPH  TAG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Glyph	TokenNameIdentifier	 Glyph
glyph	TokenNameIdentifier	 glyph
=	TokenNameEQUAL	
getGlyph	TokenNameIdentifier	 get Glyph
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
altGlyphElement	TokenNameIdentifier	 alt Glyph Element
,	TokenNameCOMMA	
fontSize	TokenNameIdentifier	 font Size
,	TokenNameCOMMA	
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyph	TokenNameIdentifier	 glyph
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// failed to create a glyph for the specified glyph uri 	TokenNameCOMMENT_LINE	failed to create a glyph for the specified glyph uri 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Glyph	TokenNameIdentifier	 Glyph
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphArray	TokenNameIdentifier	 glyph Array
=	TokenNameEQUAL	
new	TokenNamenew	
Glyph	TokenNameIdentifier	 Glyph
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
glyphArray	TokenNameIdentifier	 glyph Array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyph	TokenNameIdentifier	 glyph
;	TokenNameSEMICOLON	
return	TokenNamereturn	
glyphArray	TokenNameIdentifier	 glyph Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// else should be an altGlyphDef element 	TokenNameCOMMENT_LINE	else should be an altGlyphDef element 
if	TokenNameif	
(	TokenNameLPAREN	
refElement	TokenNameIdentifier	 ref Element
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_ALT_GLYPH_DEF_TAG	TokenNameIdentifier	 SVG  ALT  GLYPH  DEF  TAG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if not local import the referenced altGlyphDef 	TokenNameCOMMENT_LINE	if not local import the referenced altGlyphDef 
// into the current document 	TokenNameCOMMENT_LINE	into the current document 
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
)	TokenNameRPAREN	
altGlyphElement	TokenNameIdentifier	 alt Glyph Element
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
refDocument	TokenNameIdentifier	 ref Document
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
)	TokenNameRPAREN	
refElement	TokenNameIdentifier	 ref Element
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isLocal	TokenNameIdentifier	 is Local
=	TokenNameEQUAL	
(	TokenNameLPAREN	
refDocument	TokenNameIdentifier	 ref Document
==	TokenNameEQUAL_EQUAL	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
localRefElement	TokenNameIdentifier	 local Ref Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
isLocal	TokenNameIdentifier	 is Local
)	TokenNameRPAREN	
?	TokenNameQUESTION	
refElement	TokenNameIdentifier	 ref Element
:	TokenNameCOLON	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
importNode	TokenNameIdentifier	 import Node
(	TokenNameLPAREN	
refElement	TokenNameIdentifier	 ref Element
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isLocal	TokenNameIdentifier	 is Local
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// need to attach the imported element to the document and 	TokenNameCOMMENT_LINE	need to attach the imported element to the document and 
// then compute the styles and uris 	TokenNameCOMMENT_LINE	then compute the styles and uris 
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
AbstractNode	TokenNameIdentifier	 Abstract Node
.	TokenNameDOT	
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
altGlyphElement	TokenNameIdentifier	 alt Glyph Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_G_TAG	TokenNameIdentifier	 SVG  G  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
localRefElement	TokenNameIdentifier	 local Ref Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_NAMESPACE_URI	TokenNameIdentifier	 XML  NAMESPACE  URI
,	TokenNameCOMMA	
"xml:base"	TokenNameStringLiteral	xml:base
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
computeStyleAndURIs	TokenNameIdentifier	 compute Style And UR Is
(	TokenNameLPAREN	
refElement	TokenNameIdentifier	 ref Element
,	TokenNameCOMMA	
localRefElement	TokenNameIdentifier	 local Ref Element
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// look for glyphRef children 	TokenNameCOMMENT_LINE	look for glyphRef children 
NodeList	TokenNameIdentifier	 Node List
altGlyphDefChildren	TokenNameIdentifier	 alt Glyph Def Children
=	TokenNameEQUAL	
localRefElement	TokenNameIdentifier	 local Ref Element
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
containsGlyphRefNodes	TokenNameIdentifier	 contains Glyph Ref Nodes
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
numAltGlyphDefChildren	TokenNameIdentifier	 num Alt Glyph Def Children
=	TokenNameEQUAL	
altGlyphDefChildren	TokenNameIdentifier	 alt Glyph Def Children
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
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
numAltGlyphDefChildren	TokenNameIdentifier	 num Alt Glyph Def Children
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
altGlyphChild	TokenNameIdentifier	 alt Glyph Child
=	TokenNameEQUAL	
altGlyphDefChildren	TokenNameIdentifier	 alt Glyph Def Children
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
altGlyphChild	TokenNameIdentifier	 alt Glyph Child
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
agc	TokenNameIdentifier	 agc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
altGlyphChild	TokenNameIdentifier	 alt Glyph Child
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
agc	TokenNameIdentifier	 agc
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
SVG_GLYPH_REF_TAG	TokenNameIdentifier	 SVG  GLYPH  REF  TAG
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
agc	TokenNameIdentifier	 agc
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
containsGlyphRefNodes	TokenNameIdentifier	 contains Glyph Ref Nodes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
containsGlyphRefNodes	TokenNameIdentifier	 contains Glyph Ref Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// process the glyphRef children 	TokenNameCOMMENT_LINE	process the glyphRef children 
NodeList	TokenNameIdentifier	 Node List
glyphRefNodes	TokenNameIdentifier	 glyph Ref Nodes
=	TokenNameEQUAL	
localRefElement	TokenNameIdentifier	 local Ref Element
.	TokenNameDOT	
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_GLYPH_REF_TAG	TokenNameIdentifier	 SVG  GLYPH  REF  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numGlyphRefNodes	TokenNameIdentifier	 num Glyph Ref Nodes
=	TokenNameEQUAL	
glyphRefNodes	TokenNameIdentifier	 glyph Ref Nodes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Glyph	TokenNameIdentifier	 Glyph
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphArray	TokenNameIdentifier	 glyph Array
=	TokenNameEQUAL	
new	TokenNamenew	
Glyph	TokenNameIdentifier	 Glyph
[	TokenNameLBRACKET	
numGlyphRefNodes	TokenNameIdentifier	 num Glyph Ref Nodes
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
numGlyphRefNodes	TokenNameIdentifier	 num Glyph Ref Nodes
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the referenced glyph element 	TokenNameCOMMENT_LINE	get the referenced glyph element 
Element	TokenNameIdentifier	 Element
glyphRefElement	TokenNameIdentifier	 glyph Ref Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
glyphRefNodes	TokenNameIdentifier	 glyph Ref Nodes
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
glyphUri	TokenNameIdentifier	 glyph Uri
=	TokenNameEQUAL	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
getXLinkHref	TokenNameIdentifier	 get X Link Href
(	TokenNameLPAREN	
glyphRefElement	TokenNameIdentifier	 glyph Ref Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Glyph	TokenNameIdentifier	 Glyph
glyph	TokenNameIdentifier	 glyph
=	TokenNameEQUAL	
getGlyph	TokenNameIdentifier	 get Glyph
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
glyphUri	TokenNameIdentifier	 glyph Uri
,	TokenNameCOMMA	
glyphRefElement	TokenNameIdentifier	 glyph Ref Element
,	TokenNameCOMMA	
fontSize	TokenNameIdentifier	 font Size
,	TokenNameCOMMA	
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyph	TokenNameIdentifier	 glyph
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// failed to create a glyph for the specified glyph uri 	TokenNameCOMMENT_LINE	failed to create a glyph for the specified glyph uri 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
glyphArray	TokenNameIdentifier	 glyph Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyph	TokenNameIdentifier	 glyph
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
glyphArray	TokenNameIdentifier	 glyph Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// try looking for altGlyphItem children 	TokenNameCOMMENT_LINE	try looking for altGlyphItem children 
NodeList	TokenNameIdentifier	 Node List
altGlyphItemNodes	TokenNameIdentifier	 alt Glyph Item Nodes
=	TokenNameEQUAL	
localRefElement	TokenNameIdentifier	 local Ref Element
.	TokenNameDOT	
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_ALT_GLYPH_ITEM_TAG	TokenNameIdentifier	 SVG  ALT  GLYPH  ITEM  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numAltGlyphItemNodes	TokenNameIdentifier	 num Alt Glyph Item Nodes
=	TokenNameEQUAL	
altGlyphItemNodes	TokenNameIdentifier	 alt Glyph Item Nodes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numAltGlyphItemNodes	TokenNameIdentifier	 num Alt Glyph Item Nodes
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
foundMatchingGlyph	TokenNameIdentifier	 found Matching Glyph
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Glyph	TokenNameIdentifier	 Glyph
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphArray	TokenNameIdentifier	 glyph Array
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//look through all altGlyphItem to find the one 	TokenNameCOMMENT_LINE	look through all altGlyphItem to find the one 
//that have all its glyphs available 	TokenNameCOMMENT_LINE	that have all its glyphs available 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numAltGlyphItemNodes	TokenNameIdentifier	 num Alt Glyph Item Nodes
&&	TokenNameAND_AND	
!	TokenNameNOT	
foundMatchingGlyph	TokenNameIdentifier	 found Matching Glyph
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// try to find a resolvable glyphRef 	TokenNameCOMMENT_LINE	try to find a resolvable glyphRef 
Element	TokenNameIdentifier	 Element
altGlyphItemElement	TokenNameIdentifier	 alt Glyph Item Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
altGlyphItemNodes	TokenNameIdentifier	 alt Glyph Item Nodes
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeList	TokenNameIdentifier	 Node List
altGlyphRefNodes	TokenNameIdentifier	 alt Glyph Ref Nodes
=	TokenNameEQUAL	
altGlyphItemElement	TokenNameIdentifier	 alt Glyph Item Element
.	TokenNameDOT	
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_GLYPH_REF_TAG	TokenNameIdentifier	 SVG  GLYPH  REF  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numAltGlyphRefNodes	TokenNameIdentifier	 num Alt Glyph Ref Nodes
=	TokenNameEQUAL	
altGlyphRefNodes	TokenNameIdentifier	 alt Glyph Ref Nodes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glyphArray	TokenNameIdentifier	 glyph Array
=	TokenNameEQUAL	
new	TokenNamenew	
Glyph	TokenNameIdentifier	 Glyph
[	TokenNameLBRACKET	
numAltGlyphRefNodes	TokenNameIdentifier	 num Alt Glyph Ref Nodes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// consider that all glyphs are available 	TokenNameCOMMENT_LINE	consider that all glyphs are available 
// and check if they can be found 	TokenNameCOMMENT_LINE	and check if they can be found 
foundMatchingGlyph	TokenNameIdentifier	 found Matching Glyph
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numAltGlyphRefNodes	TokenNameIdentifier	 num Alt Glyph Ref Nodes
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the referenced glyph element 	TokenNameCOMMENT_LINE	get the referenced glyph element 
Element	TokenNameIdentifier	 Element
glyphRefElement	TokenNameIdentifier	 glyph Ref Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
altGlyphRefNodes	TokenNameIdentifier	 alt Glyph Ref Nodes
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
glyphUri	TokenNameIdentifier	 glyph Uri
=	TokenNameEQUAL	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
getXLinkHref	TokenNameIdentifier	 get X Link Href
(	TokenNameLPAREN	
glyphRefElement	TokenNameIdentifier	 glyph Ref Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Glyph	TokenNameIdentifier	 Glyph
glyph	TokenNameIdentifier	 glyph
=	TokenNameEQUAL	
getGlyph	TokenNameIdentifier	 get Glyph
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
glyphUri	TokenNameIdentifier	 glyph Uri
,	TokenNameCOMMA	
glyphRefElement	TokenNameIdentifier	 glyph Ref Element
,	TokenNameCOMMA	
fontSize	TokenNameIdentifier	 font Size
,	TokenNameCOMMA	
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
glyph	TokenNameIdentifier	 glyph
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// found a matching glyph for this altGlyphItem 	TokenNameCOMMENT_LINE	found a matching glyph for this altGlyphItem 
glyphArray	TokenNameIdentifier	 glyph Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyph	TokenNameIdentifier	 glyph
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//this altGlyphItem is not good 	TokenNameCOMMENT_LINE	this altGlyphItem is not good 
//seek for the next one 	TokenNameCOMMENT_LINE	seek for the next one 
foundMatchingGlyph	TokenNameIdentifier	 found Matching Glyph
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundMatchingGlyph	TokenNameIdentifier	 found Matching Glyph
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// couldn't find a alGlyphItem 	TokenNameCOMMENT_LINE	couldn't find a alGlyphItem 
// with all its glyphs available 	TokenNameCOMMENT_LINE	with all its glyphs available 
// so stop and return null 	TokenNameCOMMENT_LINE	so stop and return null 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
glyphArray	TokenNameIdentifier	 glyph Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* // reference is not to a valid element type, throw an exception throw new BridgeException(altGlyphElement, ERR_URI_BAD_TARGET, new Object[] {uri}); */	TokenNameCOMMENT_BLOCK	 // reference is not to a valid element type, throw an exception throw new BridgeException(altGlyphElement, ERR_URI_BAD_TARGET, new Object[] {uri}); 
//reference not valid, no altGlyph created 	TokenNameCOMMENT_LINE	reference not valid, no altGlyph created 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a Glyph object that represents the glyph at the specified URI * scaled to the required font size. * * @param ctx The bridge context. * @param glyphUri The URI of the glyph to retreive. * @param altGlyphElement The element that references the glyph. * @param fontSize Indicates the required size of the glyph. * @return The Glyph or null if the glyph URI is not available. */	TokenNameCOMMENT_JAVADOC	 Returns a Glyph object that represents the glyph at the specified URI scaled to the required font size. * @param ctx The bridge context. @param glyphUri The URI of the glyph to retreive. @param altGlyphElement The element that references the glyph. @param fontSize Indicates the required size of the glyph. @return The Glyph or null if the glyph URI is not available. 
private	TokenNameprivate	
Glyph	TokenNameIdentifier	 Glyph
getGlyph	TokenNameIdentifier	 get Glyph
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
glyphUri	TokenNameIdentifier	 glyph Uri
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
altGlyphElement	TokenNameIdentifier	 alt Glyph Element
,	TokenNameCOMMA	
float	TokenNamefloat	
fontSize	TokenNameIdentifier	 font Size
,	TokenNameCOMMA	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
refGlyphElement	TokenNameIdentifier	 ref Glyph Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
refGlyphElement	TokenNameIdentifier	 ref Glyph Element
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getReferencedElement	TokenNameIdentifier	 get Referenced Element
(	TokenNameLPAREN	
altGlyphElement	TokenNameIdentifier	 alt Glyph Element
,	TokenNameCOMMA	
glyphUri	TokenNameIdentifier	 glyph Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BridgeException	TokenNameIdentifier	 Bridge Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this is ok, it is possible that the glyph at the given 	TokenNameCOMMENT_LINE	this is ok, it is possible that the glyph at the given 
// uri is not available. 	TokenNameCOMMENT_LINE	uri is not available. 
// Display an error message if a security exception occured 	TokenNameCOMMENT_LINE	Display an error message if a security exception occured 
if	TokenNameif	
(	TokenNameLPAREN	
ERR_URI_UNSECURE	TokenNameIdentifier	 ERR  URI  UNSECURE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCode	TokenNameIdentifier	 get Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
refGlyphElement	TokenNameIdentifier	 ref Glyph Element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
refGlyphElement	TokenNameIdentifier	 ref Glyph Element
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
SVG_GLYPH_TAG	TokenNameIdentifier	 SVG  GLYPH  TAG
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
refGlyphElement	TokenNameIdentifier	 ref Glyph Element
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// couldn't find the referenced glyph element, 	TokenNameCOMMENT_LINE	couldn't find the referenced glyph element, 
// or referenced element not a glyph 	TokenNameCOMMENT_LINE	or referenced element not a glyph 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// see if the referenced glyph element is local 	TokenNameCOMMENT_LINE	see if the referenced glyph element is local 
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
)	TokenNameRPAREN	
altGlyphElement	TokenNameIdentifier	 alt Glyph Element
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
refDocument	TokenNameIdentifier	 ref Document
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
)	TokenNameRPAREN	
refGlyphElement	TokenNameIdentifier	 ref Glyph Element
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isLocal	TokenNameIdentifier	 is Local
=	TokenNameEQUAL	
(	TokenNameLPAREN	
refDocument	TokenNameIdentifier	 ref Document
==	TokenNameEQUAL_EQUAL	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if not local, import both the glyph and its font-face element 	TokenNameCOMMENT_LINE	if not local, import both the glyph and its font-face element 
Element	TokenNameIdentifier	 Element
localGlyphElement	TokenNameIdentifier	 local Glyph Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
localFontFaceElement	TokenNameIdentifier	 local Font Face Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
localFontElement	TokenNameIdentifier	 local Font Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isLocal	TokenNameIdentifier	 is Local
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localGlyphElement	TokenNameIdentifier	 local Glyph Element
=	TokenNameEQUAL	
refGlyphElement	TokenNameIdentifier	 ref Glyph Element
;	TokenNameSEMICOLON	
localFontElement	TokenNameIdentifier	 local Font Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
localGlyphElement	TokenNameIdentifier	 local Glyph Element
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeList	TokenNameIdentifier	 Node List
fontFaceElements	TokenNameIdentifier	 font Face Elements
=	TokenNameEQUAL	
localFontElement	TokenNameIdentifier	 local Font Element
.	TokenNameDOT	
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FONT_FACE_TAG	TokenNameIdentifier	 SVG  FONT  FACE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fontFaceElements	TokenNameIdentifier	 font Face Elements
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localFontFaceElement	TokenNameIdentifier	 local Font Face Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
fontFaceElements	TokenNameIdentifier	 font Face Elements
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// import the whole font 	TokenNameCOMMENT_LINE	import the whole font 
localFontElement	TokenNameIdentifier	 local Font Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
importNode	TokenNameIdentifier	 import Node
(	TokenNameLPAREN	
refGlyphElement	TokenNameIdentifier	 ref Glyph Element
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
AbstractNode	TokenNameIdentifier	 Abstract Node
.	TokenNameDOT	
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
altGlyphElement	TokenNameIdentifier	 alt Glyph Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_G_TAG	TokenNameIdentifier	 SVG  G  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
localFontElement	TokenNameIdentifier	 local Font Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_NAMESPACE_URI	TokenNameIdentifier	 XML  NAMESPACE  URI
,	TokenNameCOMMA	
"xml:base"	TokenNameStringLiteral	xml:base
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
computeStyleAndURIs	TokenNameIdentifier	 compute Style And UR Is
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
refGlyphElement	TokenNameIdentifier	 ref Glyph Element
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
localFontElement	TokenNameIdentifier	 local Font Element
,	TokenNameCOMMA	
glyphUri	TokenNameIdentifier	 glyph Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get the local glyph element 	TokenNameCOMMENT_LINE	get the local glyph element 
String	TokenNameIdentifier	 String
glyphId	TokenNameIdentifier	 glyph Id
=	TokenNameEQUAL	
refGlyphElement	TokenNameIdentifier	 ref Glyph Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeList	TokenNameIdentifier	 Node List
glyphElements	TokenNameIdentifier	 glyph Elements
=	TokenNameEQUAL	
localFontElement	TokenNameIdentifier	 local Font Element
.	TokenNameDOT	
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_GLYPH_TAG	TokenNameIdentifier	 SVG  GLYPH  TAG
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
glyphElements	TokenNameIdentifier	 glyph Elements
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
glyphElem	TokenNameIdentifier	 glyph Elem
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
if	TokenNameif	
(	TokenNameLPAREN	
glyphElem	TokenNameIdentifier	 glyph Elem
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
glyphId	TokenNameIdentifier	 glyph Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localGlyphElement	TokenNameIdentifier	 local Glyph Element
=	TokenNameEQUAL	
glyphElem	TokenNameIdentifier	 glyph Elem
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// get the local font-face element 	TokenNameCOMMENT_LINE	get the local font-face element 
NodeList	TokenNameIdentifier	 Node List
fontFaceElements	TokenNameIdentifier	 font Face Elements
=	TokenNameEQUAL	
localFontElement	TokenNameIdentifier	 local Font Element
.	TokenNameDOT	
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FONT_FACE_TAG	TokenNameIdentifier	 SVG  FONT  FACE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fontFaceElements	TokenNameIdentifier	 font Face Elements
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localFontFaceElement	TokenNameIdentifier	 local Font Face Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
fontFaceElements	TokenNameIdentifier	 font Face Elements
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if couldn't find the glyph or its font-face return null 	TokenNameCOMMENT_LINE	if couldn't find the glyph or its font-face return null 
if	TokenNameif	
(	TokenNameLPAREN	
localGlyphElement	TokenNameIdentifier	 local Glyph Element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
localFontFaceElement	TokenNameIdentifier	 local Font Face Element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SVGFontFaceElementBridge	TokenNameIdentifier	 SVG Font Face Element Bridge
fontFaceBridge	TokenNameIdentifier	 font Face Bridge
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGFontFaceElementBridge	TokenNameIdentifier	 SVG Font Face Element Bridge
)	TokenNameRPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getBridge	TokenNameIdentifier	 get Bridge
(	TokenNameLPAREN	
localFontFaceElement	TokenNameIdentifier	 local Font Face Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGFontFace	TokenNameIdentifier	 SVG Font Face
fontFace	TokenNameIdentifier	 font Face
=	TokenNameEQUAL	
fontFaceBridge	TokenNameIdentifier	 font Face Bridge
.	TokenNameDOT	
createFontFace	TokenNameIdentifier	 create Font Face
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
localFontFaceElement	TokenNameIdentifier	 local Font Face Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGGlyphElementBridge	TokenNameIdentifier	 SVG Glyph Element Bridge
glyphBridge	TokenNameIdentifier	 glyph Bridge
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGGlyphElementBridge	TokenNameIdentifier	 SVG Glyph Element Bridge
)	TokenNameRPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getBridge	TokenNameIdentifier	 get Bridge
(	TokenNameLPAREN	
localGlyphElement	TokenNameIdentifier	 local Glyph Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
glyphBridge	TokenNameIdentifier	 glyph Bridge
.	TokenNameDOT	
createGlyph	TokenNameIdentifier	 create Glyph
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
localGlyphElement	TokenNameIdentifier	 local Glyph Element
,	TokenNameCOMMA	
altGlyphElement	TokenNameIdentifier	 alt Glyph Element
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fontSize	TokenNameIdentifier	 font Size
,	TokenNameCOMMA	
fontFace	TokenNameIdentifier	 font Face
,	TokenNameCOMMA	
tpi	TokenNameIdentifier	 tpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
