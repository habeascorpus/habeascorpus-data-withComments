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
AffineTransform	TokenNameIdentifier	 Affine Transform
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
NoninvertibleTransformException	TokenNameIdentifier	 Noninvertible Transform Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
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
SVGElement	TokenNameIdentifier	 SVG Element
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
SVGException	TokenNameIdentifier	 SVG Exception
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
SVGFitToViewBox	TokenNameIdentifier	 SVG Fit To View Box
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
SVGMatrix	TokenNameIdentifier	 SVG Matrix
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
/** * This class provides support for the SVGLocatable interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGLocatableSupport.java 489964 2006-12-24 01:30:23Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides support for the SVGLocatable interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGLocatableSupport.java 489964 2006-12-24 01:30:23Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGLocatableSupport	TokenNameIdentifier	 SVG Locatable Support
{	TokenNameLBRACE	
/** * Creates a new SVGLocatable element. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGLocatable element. 
public	TokenNamepublic	
SVGLocatableSupport	TokenNameIdentifier	 SVG Locatable Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * To implement {@link * org.w3c.dom.svg.SVGLocatable#getNearestViewportElement()}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGLocatable#getNearestViewportElement()}. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGElement	TokenNameIdentifier	 SVG Element
getNearestViewportElement	TokenNameIdentifier	 get Nearest Viewport Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elt	TokenNameIdentifier	 elt
=	TokenNameEQUAL	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
getParentCSSStylableElement	TokenNameIdentifier	 get Parent CSS Stylable Element
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
instanceof	TokenNameinstanceof	
SVGFitToViewBox	TokenNameIdentifier	 SVG Fit To View Box
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SVGElement	TokenNameIdentifier	 SVG Element
)	TokenNameRPAREN	
elt	TokenNameIdentifier	 elt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link * org.w3c.dom.svg.SVGLocatable#getFarthestViewportElement()}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGLocatable#getFarthestViewportElement()}. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGElement	TokenNameIdentifier	 SVG Element
getFarthestViewportElement	TokenNameIdentifier	 get Farthest Viewport Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SVGElement	TokenNameIdentifier	 SVG Element
)	TokenNameRPAREN	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link org.w3c.dom.svg.SVGLocatable#getBBox()}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGLocatable#getBBox()}. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGRect	TokenNameIdentifier	 SVG Rect
getBBox	TokenNameIdentifier	 get B Box
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
SVGContext	TokenNameIdentifier	 SVG Context
svgctx	TokenNameIdentifier	 svgctx
=	TokenNameEQUAL	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
svgctx	TokenNameIdentifier	 svgctx
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
svgctx	TokenNameIdentifier	 svgctx
.	TokenNameDOT	
getBBox	TokenNameIdentifier	 get B Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
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
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBBox	TokenNameIdentifier	 get B Box
(	TokenNameLPAREN	
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
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBBox	TokenNameIdentifier	 get B Box
(	TokenNameLPAREN	
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
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBBox	TokenNameIdentifier	 get B Box
(	TokenNameLPAREN	
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
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBBox	TokenNameIdentifier	 get B Box
(	TokenNameLPAREN	
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
/** * To implement {@link org.w3c.dom.svg.SVGLocatable#getCTM()}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGLocatable#getCTM()}. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
getCTM	TokenNameIdentifier	 get CTM
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
new	TokenNamenew	
AbstractSVGMatrix	TokenNameIdentifier	 Abstract SVG Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCTM	TokenNameIdentifier	 get CTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link org.w3c.dom.svg.SVGLocatable#getScreenCTM()}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGLocatable#getScreenCTM()}. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
getScreenCTM	TokenNameIdentifier	 get Screen CTM
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
new	TokenNamenew	
AbstractSVGMatrix	TokenNameIdentifier	 Abstract SVG Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGContext	TokenNameIdentifier	 SVG Context
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
svgelt	TokenNameIdentifier	 svgelt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getGlobalTransform	TokenNameIdentifier	 get Global Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
scrnTrans	TokenNameIdentifier	 scrn Trans
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getScreenTransform	TokenNameIdentifier	 get Screen Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scrnTrans	TokenNameIdentifier	 scrn Trans
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
preConcatenate	TokenNameIdentifier	 pre Concatenate
(	TokenNameLPAREN	
scrnTrans	TokenNameIdentifier	 scrn Trans
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link * org.w3c.dom.svg.SVGLocatable#getTransformToElement(SVGElement)}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGLocatable#getTransformToElement(SVGElement)}. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
getTransformToElement	TokenNameIdentifier	 get Transform To Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
SVGElement	TokenNameIdentifier	 SVG Element
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
currentElt	TokenNameIdentifier	 current Elt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
elt	TokenNameIdentifier	 elt
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
targetElt	TokenNameIdentifier	 target Elt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
)	TokenNameRPAREN	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
AbstractSVGMatrix	TokenNameIdentifier	 Abstract SVG Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
currentElt	TokenNameIdentifier	 current Elt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGlobalTransform	TokenNameIdentifier	 get Global Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cat	TokenNameIdentifier	 cat
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tat	TokenNameIdentifier	 tat
=	TokenNameEQUAL	
targetElt	TokenNameIdentifier	 target Elt
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGlobalTransform	TokenNameIdentifier	 get Global Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tat	TokenNameIdentifier	 tat
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tat	TokenNameIdentifier	 tat
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
cat	TokenNameIdentifier	 cat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
preConcatenate	TokenNameIdentifier	 pre Concatenate
(	TokenNameLPAREN	
tat	TokenNameIdentifier	 tat
.	TokenNameDOT	
createInverse	TokenNameIdentifier	 create Inverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
at	TokenNameIdentifier	 at
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoninvertibleTransformException	TokenNameIdentifier	 Noninvertible Transform Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
currentElt	TokenNameIdentifier	 current Elt
.	TokenNameDOT	
createSVGException	TokenNameIdentifier	 create SVG Exception
(	TokenNameLPAREN	
SVGException	TokenNameIdentifier	 SVG Exception
.	TokenNameDOT	
SVG_MATRIX_NOT_INVERTABLE	TokenNameIdentifier	 SVG  MATRIX  NOT  INVERTABLE
,	TokenNameCOMMA	
"noninvertiblematrix"	TokenNameStringLiteral	noninvertiblematrix
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
