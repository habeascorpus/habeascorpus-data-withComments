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
SVGMatrix	TokenNameIdentifier	 SVG Matrix
;	TokenNameSEMICOLON	
/** * This class provides an abstract implementation of the {@link SVGMatrix} * interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractSVGMatrix.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides an abstract implementation of the {@link SVGMatrix} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractSVGMatrix.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSVGMatrix	TokenNameIdentifier	 Abstract SVG Matrix
implements	TokenNameimplements	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
{	TokenNameLBRACE	
/** * The transform used to implement flipX. */	TokenNameCOMMENT_JAVADOC	 The transform used to implement flipX. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
AffineTransform	TokenNameIdentifier	 Affine Transform
FLIP_X_TRANSFORM	TokenNameIdentifier	 FLIP  X  TRANSFORM
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The transform used to implement flipX. */	TokenNameCOMMENT_JAVADOC	 The transform used to implement flipX. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
AffineTransform	TokenNameIdentifier	 Affine Transform
FLIP_Y_TRANSFORM	TokenNameIdentifier	 FLIP  Y  TRANSFORM
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the associated AffineTransform. */	TokenNameCOMMENT_JAVADOC	 Returns the associated AffineTransform. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
AffineTransform	TokenNameIdentifier	 Affine Transform
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Implements {@link SVGMatrix#getA()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#getA()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getScaleX	TokenNameIdentifier	 get Scale X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#setA(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#setA(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setA	TokenNameIdentifier	 set A
(	TokenNameLPAREN	
float	TokenNamefloat	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearY	TokenNameIdentifier	 get Shear Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearX	TokenNameIdentifier	 get Shear X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleY	TokenNameIdentifier	 get Scale Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateX	TokenNameIdentifier	 get Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateY	TokenNameIdentifier	 get Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#getB()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#getB()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getB	TokenNameIdentifier	 get B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getShearY	TokenNameIdentifier	 get Shear Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#setB(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#setB(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setB	TokenNameIdentifier	 set B
(	TokenNameLPAREN	
float	TokenNamefloat	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleX	TokenNameIdentifier	 get Scale X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearX	TokenNameIdentifier	 get Shear X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleY	TokenNameIdentifier	 get Scale Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateX	TokenNameIdentifier	 get Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateY	TokenNameIdentifier	 get Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#getC()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#getC()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getC	TokenNameIdentifier	 get C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getShearX	TokenNameIdentifier	 get Shear X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#setC(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#setC(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setC	TokenNameIdentifier	 set C
(	TokenNameLPAREN	
float	TokenNamefloat	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleX	TokenNameIdentifier	 get Scale X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearY	TokenNameIdentifier	 get Shear Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleY	TokenNameIdentifier	 get Scale Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateX	TokenNameIdentifier	 get Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateY	TokenNameIdentifier	 get Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#getD()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#getD()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getScaleY	TokenNameIdentifier	 get Scale Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#setD(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#setD(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setD	TokenNameIdentifier	 set D
(	TokenNameLPAREN	
float	TokenNamefloat	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleX	TokenNameIdentifier	 get Scale X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearY	TokenNameIdentifier	 get Shear Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearX	TokenNameIdentifier	 get Shear X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateX	TokenNameIdentifier	 get Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateY	TokenNameIdentifier	 get Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#getE()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#getE()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTranslateX	TokenNameIdentifier	 get Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#setE(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#setE(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setE	TokenNameIdentifier	 set E
(	TokenNameLPAREN	
float	TokenNamefloat	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleX	TokenNameIdentifier	 get Scale X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearY	TokenNameIdentifier	 get Shear Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearX	TokenNameIdentifier	 get Shear X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleY	TokenNameIdentifier	 get Scale Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateY	TokenNameIdentifier	 get Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#getF()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#getF()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTranslateY	TokenNameIdentifier	 get Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#setF(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#setF(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setF	TokenNameIdentifier	 set F
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleX	TokenNameIdentifier	 get Scale X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearY	TokenNameIdentifier	 get Shear Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearX	TokenNameIdentifier	 get Shear X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleY	TokenNameIdentifier	 get Scale Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateX	TokenNameIdentifier	 get Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#multiply(SVGMatrix)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#multiply(SVGMatrix)}. 
public	TokenNamepublic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
secondMatrix	TokenNameIdentifier	 second Matrix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
secondMatrix	TokenNameIdentifier	 second Matrix
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
secondMatrix	TokenNameIdentifier	 second Matrix
.	TokenNameDOT	
getB	TokenNameIdentifier	 get B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
secondMatrix	TokenNameIdentifier	 second Matrix
.	TokenNameDOT	
getC	TokenNameIdentifier	 get C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
secondMatrix	TokenNameIdentifier	 second Matrix
.	TokenNameDOT	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
secondMatrix	TokenNameIdentifier	 second Matrix
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
secondMatrix	TokenNameIdentifier	 second Matrix
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#inverse()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#inverse()}. 
public	TokenNamepublic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
inverse	TokenNameIdentifier	 inverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createInverse	TokenNameIdentifier	 create Inverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoninvertibleTransformException	TokenNameIdentifier	 Noninvertible Transform Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SVGOMException	TokenNameIdentifier	 SVGOM Exception
(	TokenNameLPAREN	
SVGException	TokenNameIdentifier	 SVG Exception
.	TokenNameDOT	
SVG_MATRIX_NOT_INVERTABLE	TokenNameIdentifier	 SVG  MATRIX  NOT  INVERTABLE
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#translate(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#translate(float,float)}. 
public	TokenNamepublic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#scale(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#scale(float)}. 
public	TokenNamepublic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
float	TokenNamefloat	
scaleFactor	TokenNameIdentifier	 scale Factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
scaleFactor	TokenNameIdentifier	 scale Factor
,	TokenNameCOMMA	
scaleFactor	TokenNameIdentifier	 scale Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#scaleNonUniform(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#scaleNonUniform(float,float)}. 
public	TokenNamepublic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
scaleNonUniform	TokenNameIdentifier	 scale Non Uniform
(	TokenNameLPAREN	
float	TokenNamefloat	
scaleFactorX	TokenNameIdentifier	 scale Factor X
,	TokenNameCOMMA	
float	TokenNamefloat	
scaleFactorY	TokenNameIdentifier	 scale Factor Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
scaleFactorX	TokenNameIdentifier	 scale Factor X
,	TokenNameCOMMA	
scaleFactorY	TokenNameIdentifier	 scale Factor Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#rotate(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#rotate(float)}. 
public	TokenNamepublic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#rotateFromVector(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#rotateFromVector(float,float)}. 
public	TokenNamepublic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
rotateFromVector	TokenNameIdentifier	 rotate From Vector
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
y	TokenNameIdentifier	 y
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SVGOMException	TokenNameIdentifier	 SVGOM Exception
(	TokenNameLPAREN	
SVGException	TokenNameIdentifier	 SVG Exception
.	TokenNameDOT	
SVG_INVALID_VALUE_ERR	TokenNameIdentifier	 SVG  INVALID  VALUE  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
atan2	TokenNameIdentifier	 atan2
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#flipX()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#flipX()}. 
public	TokenNamepublic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
flipX	TokenNameIdentifier	 flip X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
FLIP_X_TRANSFORM	TokenNameIdentifier	 FLIP  X  TRANSFORM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#flipY()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#flipY()}. 
public	TokenNamepublic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
flipY	TokenNameIdentifier	 flip Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
FLIP_Y_TRANSFORM	TokenNameIdentifier	 FLIP  Y  TRANSFORM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#skewX(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#skewX(float)}. 
public	TokenNamepublic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
skewX	TokenNameIdentifier	 skew X
(	TokenNameLPAREN	
float	TokenNamefloat	
angleDeg	TokenNameIdentifier	 angle Deg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getShearInstance	TokenNameIdentifier	 get Shear Instance
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
tan	TokenNameIdentifier	 tan
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
angleDeg	TokenNameIdentifier	 angle Deg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link SVGMatrix#skewY(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link SVGMatrix#skewY(float)}. 
public	TokenNamepublic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
skewY	TokenNameIdentifier	 skew Y
(	TokenNameLPAREN	
float	TokenNamefloat	
angleDeg	TokenNameIdentifier	 angle Deg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getShearInstance	TokenNameIdentifier	 get Shear Instance
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
tan	TokenNameIdentifier	 tan
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
angleDeg	TokenNameIdentifier	 angle Deg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
