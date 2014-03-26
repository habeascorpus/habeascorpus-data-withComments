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
SVGPoint	TokenNameIdentifier	 SVG Point
;	TokenNameSEMICOLON	
/** * An implementation of {@link SVGPoint} that is not associated with any * attribute. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMPoint.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An implementation of {@link SVGPoint} that is not associated with any attribute. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMPoint.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMPoint	TokenNameIdentifier	 SVGOM Point
implements	TokenNameimplements	
SVGPoint	TokenNameIdentifier	 SVG Point
{	TokenNameLBRACE	
/** * The x coordinate. */	TokenNameCOMMENT_JAVADOC	 The x coordinate. 
protected	TokenNameprotected	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
/** * The y coordinate. */	TokenNameCOMMENT_JAVADOC	 The y coordinate. 
protected	TokenNameprotected	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMPoint with coordinates set to <code>0</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMPoint with coordinates set to <code>0</code>. 
public	TokenNamepublic	
SVGOMPoint	TokenNameIdentifier	 SVGOM Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMPoint with coordinates set to the specified values. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMPoint with coordinates set to the specified values. 
public	TokenNamepublic	
SVGOMPoint	TokenNameIdentifier	 SVGOM Point
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPoint#getX()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPoint#getX()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPoint#setX(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPoint#setX(float)}. 
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
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPoint#getY()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPoint#getY()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPoint#setY(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPoint#setY(float)}. 
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
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPoint#matrixTransform(SVGMatrix)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPoint#matrixTransform(SVGMatrix)}. 
public	TokenNamepublic	
SVGPoint	TokenNameIdentifier	 SVG Point
matrixTransform	TokenNameIdentifier	 matrix Transform
(	TokenNameLPAREN	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matrixTransform	TokenNameIdentifier	 matrix Transform
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Transforms an {@link SVGPoint} by an {@link SVGMatrix} and returns * the new point. */	TokenNameCOMMENT_JAVADOC	 Transforms an {@link SVGPoint} by an {@link SVGMatrix} and returns the new point. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGPoint	TokenNameIdentifier	 SVG Point
matrixTransform	TokenNameIdentifier	 matrix Transform
(	TokenNameLPAREN	
SVGPoint	TokenNameIdentifier	 SVG Point
point	TokenNameIdentifier	 point
,	TokenNameCOMMA	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
newX	TokenNameIdentifier	 new X
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getC	TokenNameIdentifier	 get C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
newY	TokenNameIdentifier	 new Y
=	TokenNameEQUAL	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getB	TokenNameIdentifier	 get B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMPoint	TokenNameIdentifier	 SVGOM Point
(	TokenNameLPAREN	
newX	TokenNameIdentifier	 new X
,	TokenNameCOMMA	
newY	TokenNameIdentifier	 new Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
