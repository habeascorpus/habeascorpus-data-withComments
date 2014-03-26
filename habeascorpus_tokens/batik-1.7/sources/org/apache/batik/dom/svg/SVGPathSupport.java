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
SVGMatrix	TokenNameIdentifier	 SVG Matrix
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
/** * The class provides support for the SVGPath interface. * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: SVGPathSupport.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 The class provides support for the SVGPath interface. * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: SVGPathSupport.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGPathSupport	TokenNameIdentifier	 SVG Path Support
{	TokenNameLBRACE	
/** * To implement {@link org.w3c.dom.svg.SVGPathElement#getTotalLength()}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGPathElement#getTotalLength()}. 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
getTotalLength	TokenNameIdentifier	 get Total Length
(	TokenNameLPAREN	
SVGOMPathElement	TokenNameIdentifier	 SVGOM Path Element
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGPathContext	TokenNameIdentifier	 SVG Path Context
pathCtx	TokenNameIdentifier	 path Ctx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGPathContext	TokenNameIdentifier	 SVG Path Context
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pathCtx	TokenNameIdentifier	 path Ctx
.	TokenNameDOT	
getTotalLength	TokenNameIdentifier	 get Total Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link * org.w3c.dom.svg.SVGPathElement#getPathSegAtLength(float)}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGPathElement#getPathSegAtLength(float)}. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getPathSegAtLength	TokenNameIdentifier	 get Path Seg At Length
(	TokenNameLPAREN	
SVGOMPathElement	TokenNameIdentifier	 SVGOM Path Element
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGPathContext	TokenNameIdentifier	 SVG Path Context
pathCtx	TokenNameIdentifier	 path Ctx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGPathContext	TokenNameIdentifier	 SVG Path Context
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pathCtx	TokenNameIdentifier	 path Ctx
.	TokenNameDOT	
getPathSegAtLength	TokenNameIdentifier	 get Path Seg At Length
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To implement {@link org.w3c.dom.svg.SVGPathElement#getPointAtLength(float)}. */	TokenNameCOMMENT_JAVADOC	 To implement {@link org.w3c.dom.svg.SVGPathElement#getPointAtLength(float)}. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGPoint	TokenNameIdentifier	 SVG Point
getPointAtLength	TokenNameIdentifier	 get Point At Length
(	TokenNameLPAREN	
final	TokenNamefinal	
SVGOMPathElement	TokenNameIdentifier	 SVGOM Path Element
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
final	TokenNamefinal	
float	TokenNamefloat	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SVGPathContext	TokenNameIdentifier	 SVG Path Context
pathCtx	TokenNameIdentifier	 path Ctx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGPathContext	TokenNameIdentifier	 SVG Path Context
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pathCtx	TokenNameIdentifier	 path Ctx
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGPoint	TokenNameIdentifier	 SVG Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Point2D	TokenNameIdentifier	 Point2 D
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
pathCtx	TokenNameIdentifier	 path Ctx
.	TokenNameDOT	
getPointAtLength	TokenNameIdentifier	 get Point At Length
(	TokenNameLPAREN	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
pt	TokenNameIdentifier	 pt
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
Point2D	TokenNameIdentifier	 Point2 D
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
pathCtx	TokenNameIdentifier	 path Ctx
.	TokenNameDOT	
getPointAtLength	TokenNameIdentifier	 get Point At Length
(	TokenNameLPAREN	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
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
path	TokenNameIdentifier	 path
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
path	TokenNameIdentifier	 path
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
SVGPoint	TokenNameIdentifier	 SVG Point
matrixTransform	TokenNameIdentifier	 matrix Transform
(	TokenNameLPAREN	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
path	TokenNameIdentifier	 path
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
