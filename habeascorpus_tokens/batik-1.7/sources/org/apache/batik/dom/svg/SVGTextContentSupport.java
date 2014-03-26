/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGPoint	TokenNameIdentifier	 SVG Point
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGRect	TokenNameIdentifier	 SVG Rect
;	TokenNameSEMICOLON	
/** * This class provides support for the SVGTextContentElement interface. * * @author nicolas.socheleau@bitflash.com * @version $Id: SVGTextContentSupport.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides support for the SVGTextContentElement interface. * @author nicolas.socheleau@bitflash.com @version $Id: SVGTextContentSupport.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGTextContentSupport	TokenNameIdentifier	 SVG Text Content Support
{	TokenNameLBRACE	
/** * To implement {@link * org.w3c.dom.svg.SVGTextContentElement#getNumberOfChars()}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGTextContentElement#getNumberOfChars()}. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getNumberOfChars	TokenNameIdentifier	 get Number Of Chars
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
svgelt	TokenNameIdentifier	 svgelt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
elt	TokenNameIdentifier	 elt
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
)	TokenNameRPAREN	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNumberOfChars	TokenNameIdentifier	 get Number Of Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link * org.w3c.dom.svg.SVGTextContentElement#getExtentOfChar(int charnum)}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGTextContentElement#getExtentOfChar(int charnum)}. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGRect	TokenNameIdentifier	 SVG Rect
getExtentOfChar	TokenNameIdentifier	 get Extent Of Char
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
svgelt	TokenNameIdentifier	 svgelt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
elt	TokenNameIdentifier	 elt
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
>=	TokenNameGREATER_EQUAL	
getNumberOfChars	TokenNameIdentifier	 get Number Of Chars
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
)	TokenNameRPAREN	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGRect	TokenNameIdentifier	 SVG Rect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
SVGTextContentSupport	TokenNameIdentifier	 SVG Text Content Support
.	TokenNameDOT	
getExtent	TokenNameIdentifier	 get Extent
(	TokenNameLPAREN	
svgelt	TokenNameIdentifier	 svgelt
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setX	TokenNameIdentifier	 set X
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.rect"	TokenNameStringLiteral	readonly.rect
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
SVGTextContentSupport	TokenNameIdentifier	 SVG Text Content Support
.	TokenNameDOT	
getExtent	TokenNameIdentifier	 get Extent
(	TokenNameLPAREN	
svgelt	TokenNameIdentifier	 svgelt
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setY	TokenNameIdentifier	 set Y
(	TokenNameLPAREN	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.rect"	TokenNameStringLiteral	readonly.rect
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
SVGTextContentSupport	TokenNameIdentifier	 SVG Text Content Support
.	TokenNameDOT	
getExtent	TokenNameIdentifier	 get Extent
(	TokenNameLPAREN	
svgelt	TokenNameIdentifier	 svgelt
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setWidth	TokenNameIdentifier	 set Width
(	TokenNameLPAREN	
float	TokenNamefloat	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.rect"	TokenNameStringLiteral	readonly.rect
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
SVGTextContentSupport	TokenNameIdentifier	 SVG Text Content Support
.	TokenNameDOT	
getExtent	TokenNameIdentifier	 get Extent
(	TokenNameLPAREN	
svgelt	TokenNameIdentifier	 svgelt
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setHeight	TokenNameIdentifier	 set Height
(	TokenNameLPAREN	
float	TokenNamefloat	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.rect"	TokenNameStringLiteral	readonly.rect
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getExtent	TokenNameIdentifier	 get Extent
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
svgelt	TokenNameIdentifier	 svgelt
,	TokenNameCOMMA	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r2d	TokenNameIdentifier	 r2d
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getExtentOfChar	TokenNameIdentifier	 get Extent Of Char
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r2d	TokenNameIdentifier	 r2d
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r2d	TokenNameIdentifier	 r2d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link * org.w3c.dom.svg.SVGTextContentElement#getStartPositionOfChar(int charnum)}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGTextContentElement#getStartPositionOfChar(int charnum)}. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGPoint	TokenNameIdentifier	 SVG Point
getStartPositionOfChar	TokenNameIdentifier	 get Start Position Of Char
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
svgelt	TokenNameIdentifier	 svgelt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
elt	TokenNameIdentifier	 elt
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
>=	TokenNameGREATER_EQUAL	
getNumberOfChars	TokenNameIdentifier	 get Number Of Chars
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
)	TokenNameRPAREN	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGTextPoint	TokenNameIdentifier	 SVG Text Point
(	TokenNameLPAREN	
svgelt	TokenNameIdentifier	 svgelt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
SVGTextContentSupport	TokenNameIdentifier	 SVG Text Content Support
.	TokenNameDOT	
getStartPos	TokenNameIdentifier	 get Start Pos
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
svgelt	TokenNameIdentifier	 svgelt
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
SVGTextContentSupport	TokenNameIdentifier	 SVG Text Content Support
.	TokenNameDOT	
getStartPos	TokenNameIdentifier	 get Start Pos
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
svgelt	TokenNameIdentifier	 svgelt
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
Point2D	TokenNameIdentifier	 Point2 D
getStartPos	TokenNameIdentifier	 get Start Pos
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
svgelt	TokenNameIdentifier	 svgelt
,	TokenNameCOMMA	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Point2D	TokenNameIdentifier	 Point2 D
p2d	TokenNameIdentifier	 p2d
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getStartPositionOfChar	TokenNameIdentifier	 get Start Position Of Char
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p2d	TokenNameIdentifier	 p2d
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p2d	TokenNameIdentifier	 p2d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link * org.w3c.dom.svg.SVGTextContentElement#getEndPositionOfChar(int charnum)}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGTextContentElement#getEndPositionOfChar(int charnum)}. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGPoint	TokenNameIdentifier	 SVG Point
getEndPositionOfChar	TokenNameIdentifier	 get End Position Of Char
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
svgelt	TokenNameIdentifier	 svgelt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
elt	TokenNameIdentifier	 elt
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
>=	TokenNameGREATER_EQUAL	
getNumberOfChars	TokenNameIdentifier	 get Number Of Chars
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
)	TokenNameRPAREN	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGTextPoint	TokenNameIdentifier	 SVG Text Point
(	TokenNameLPAREN	
svgelt	TokenNameIdentifier	 svgelt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
SVGTextContentSupport	TokenNameIdentifier	 SVG Text Content Support
.	TokenNameDOT	
getEndPos	TokenNameIdentifier	 get End Pos
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
svgelt	TokenNameIdentifier	 svgelt
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
SVGTextContentSupport	TokenNameIdentifier	 SVG Text Content Support
.	TokenNameDOT	
getEndPos	TokenNameIdentifier	 get End Pos
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
svgelt	TokenNameIdentifier	 svgelt
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
Point2D	TokenNameIdentifier	 Point2 D
getEndPos	TokenNameIdentifier	 get End Pos
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
svgelt	TokenNameIdentifier	 svgelt
,	TokenNameCOMMA	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Point2D	TokenNameIdentifier	 Point2 D
p2d	TokenNameIdentifier	 p2d
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getEndPositionOfChar	TokenNameIdentifier	 get End Position Of Char
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p2d	TokenNameIdentifier	 p2d
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p2d	TokenNameIdentifier	 p2d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link * org.w3c.dom.svg.SVGTextContentElement#selectSubString(int charnum, int nchars)}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGTextContentElement#selectSubString(int charnum, int nchars)}. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
selectSubString	TokenNameIdentifier	 select Sub String
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
,	TokenNameCOMMA	
int	TokenNameint	
nchars	TokenNameIdentifier	 nchars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
svgelt	TokenNameIdentifier	 svgelt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
elt	TokenNameIdentifier	 elt
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
>=	TokenNameGREATER_EQUAL	
getNumberOfChars	TokenNameIdentifier	 get Number Of Chars
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
)	TokenNameRPAREN	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
selectSubString	TokenNameIdentifier	 select Sub String
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
,	TokenNameCOMMA	
nchars	TokenNameIdentifier	 nchars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link * org.w3c.dom.svg.SVGTextContentElement#getRotationOfChar(int charnum)}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGTextContentElement#getRotationOfChar(int charnum)}. 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
getRotationOfChar	TokenNameIdentifier	 get Rotation Of Char
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
svgelt	TokenNameIdentifier	 svgelt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
elt	TokenNameIdentifier	 elt
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
>=	TokenNameGREATER_EQUAL	
getNumberOfChars	TokenNameIdentifier	 get Number Of Chars
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
)	TokenNameRPAREN	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getRotationOfChar	TokenNameIdentifier	 get Rotation Of Char
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link * org.w3c.dom.svg.SVGTextContentElement#selectSubString(int charnum, int nchars)}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGTextContentElement#selectSubString(int charnum, int nchars)}. 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
getComputedTextLength	TokenNameIdentifier	 get Computed Text Length
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
svgelt	TokenNameIdentifier	 svgelt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
elt	TokenNameIdentifier	 elt
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
)	TokenNameRPAREN	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getComputedTextLength	TokenNameIdentifier	 get Computed Text Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link * org.w3c.dom.svg.SVGTextContentElement#selectSubString(int charnum, int nchars)}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGTextContentElement#selectSubString(int charnum, int nchars)}. 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
getSubStringLength	TokenNameIdentifier	 get Sub String Length
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
int	TokenNameint	
charnum	TokenNameIdentifier	 charnum
,	TokenNameCOMMA	
int	TokenNameint	
nchars	TokenNameIdentifier	 nchars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
svgelt	TokenNameIdentifier	 svgelt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
elt	TokenNameIdentifier	 elt
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
>=	TokenNameGREATER_EQUAL	
getNumberOfChars	TokenNameIdentifier	 get Number Of Chars
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
)	TokenNameRPAREN	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getSubStringLength	TokenNameIdentifier	 get Sub String Length
(	TokenNameLPAREN	
charnum	TokenNameIdentifier	 charnum
,	TokenNameCOMMA	
nchars	TokenNameIdentifier	 nchars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link * org.w3c.dom.svg.SVGTextContentElement#getCharNumAtPosition(SVGPoint point)}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGTextContentElement#getCharNumAtPosition(SVGPoint point)}. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getCharNumAtPosition	TokenNameIdentifier	 get Char Num At Position
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
svgelt	TokenNameIdentifier	 svgelt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
elt	TokenNameIdentifier	 elt
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGTextContent	TokenNameIdentifier	 SVG Text Content
)	TokenNameRPAREN	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getCharNumAtPosition	TokenNameIdentifier	 get Char Num At Position
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SVGTextPoint	TokenNameIdentifier	 SVG Text Point
extends	TokenNameextends	
SVGOMPoint	TokenNameIdentifier	 SVGOM Point
{	TokenNameLBRACE	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
svgelt	TokenNameIdentifier	 svgelt
;	TokenNameSEMICOLON	
SVGTextPoint	TokenNameIdentifier	 SVG Text Point
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
svgelt	TokenNameIdentifier	 svgelt
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setX	TokenNameIdentifier	 set X
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.point"	TokenNameStringLiteral	readonly.point
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setY	TokenNameIdentifier	 set Y
(	TokenNameLPAREN	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
"readonly.point"	TokenNameStringLiteral	readonly.point
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
