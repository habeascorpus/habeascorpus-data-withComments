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
SVGTransform	TokenNameIdentifier	 SVG Transform
;	TokenNameSEMICOLON	
/** * Abstract implementation of {@link SVGTransform}. * * @author nicolas.socheleau@bitflash.com * @version $Id: AbstractSVGTransform.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Abstract implementation of {@link SVGTransform}. * @author nicolas.socheleau@bitflash.com @version $Id: AbstractSVGTransform.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
implements	TokenNameimplements	
SVGTransform	TokenNameIdentifier	 SVG Transform
{	TokenNameLBRACE	
/** * Type of the transformation. Before any values are set, the type * is unknown. */	TokenNameCOMMENT_JAVADOC	 Type of the transformation. Before any values are set, the type is unknown. 
protected	TokenNameprotected	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVG_TRANSFORM_UNKNOWN	TokenNameIdentifier	 SVG  TRANSFORM  UNKNOWN
;	TokenNameSEMICOLON	
/** * The transformation as a Java2D {link AffineTransform}. */	TokenNameCOMMENT_JAVADOC	 The transformation as a Java2D {link AffineTransform}. 
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
affineTransform	TokenNameIdentifier	 affine Transform
;	TokenNameSEMICOLON	
/** * The angle of the transformation, if this transformation is a rotation * or a skew. This is stored to avoid extracting the angle from the * transformation matrix. */	TokenNameCOMMENT_JAVADOC	 The angle of the transformation, if this transformation is a rotation or a skew. This is stored to avoid extracting the angle from the transformation matrix. 
protected	TokenNameprotected	
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
;	TokenNameSEMICOLON	
/** * The x coordinate of the center of the rotation, if this transformation * is a rotation. */	TokenNameCOMMENT_JAVADOC	 The x coordinate of the center of the rotation, if this transformation is a rotation. 
protected	TokenNameprotected	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
/** * The y coordinate of the center of the rotation, if this transformation * is a rotation. */	TokenNameCOMMENT_JAVADOC	 The y coordinate of the center of the rotation, if this transformation is a rotation. 
protected	TokenNameprotected	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
/** * Creates and returns a new {@link SVGMatrix} for exposing the * transformation as a matrix. * @return SVGMatrix representing the transformation */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new {@link SVGMatrix} for exposing the transformation as a matrix. @return SVGMatrix representing the transformation 
protected	TokenNameprotected	
abstract	TokenNameabstract	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
createMatrix	TokenNameIdentifier	 create Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the type of transformation. */	TokenNameCOMMENT_JAVADOC	 Sets the type of transformation. 
protected	TokenNameprotected	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the x coordinate of the center of the rotation, if this * transformation is a rotation. */	TokenNameCOMMENT_JAVADOC	 Returns the x coordinate of the center of the rotation, if this transformation is a rotation. 
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
/** * Returns the y coordinate of the center of the rotation, if this * transformation is a rotation. */	TokenNameCOMMENT_JAVADOC	 Returns the y coordinate of the center of the rotation, if this transformation is a rotation. 
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
/** * Copies the value of the specified transformation into this object. */	TokenNameCOMMENT_JAVADOC	 Copies the value of the specified transformation into this object. 
public	TokenNamepublic	
void	TokenNamevoid	
assign	TokenNameIdentifier	 assign
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
affineTransform	TokenNameIdentifier	 affine Transform
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
affineTransform	TokenNameIdentifier	 affine Transform
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
angle	TokenNameIdentifier	 angle
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
angle	TokenNameIdentifier	 angle
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#getType()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#getType()}. 
public	TokenNamepublic	
short	TokenNameshort	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#getMatrix()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#getMatrix()}. 
public	TokenNamepublic	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createMatrix	TokenNameIdentifier	 create Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#getAngle()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#getAngle()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
angle	TokenNameIdentifier	 angle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#setMatrix(SVGMatrix)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#setMatrix(SVGMatrix)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setMatrix	TokenNameIdentifier	 set Matrix
(	TokenNameLPAREN	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
;	TokenNameSEMICOLON	
affineTransform	TokenNameIdentifier	 affine Transform
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getB	TokenNameIdentifier	 get B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getC	TokenNameIdentifier	 get C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#setTranslate(float,float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#setTranslate(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setTranslate	TokenNameIdentifier	 set Translate
(	TokenNameLPAREN	
float	TokenNamefloat	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
float	TokenNamefloat	
ty	TokenNameIdentifier	 ty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
;	TokenNameSEMICOLON	
affineTransform	TokenNameIdentifier	 affine Transform
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getTranslateInstance	TokenNameIdentifier	 get Translate Instance
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
ty	TokenNameIdentifier	 ty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#setScale(float,float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#setScale(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
float	TokenNamefloat	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
float	TokenNamefloat	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
;	TokenNameSEMICOLON	
affineTransform	TokenNameIdentifier	 affine Transform
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getScaleInstance	TokenNameIdentifier	 get Scale Instance
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#setRotate(float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#setRotate(float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setRotate	TokenNameIdentifier	 set Rotate
(	TokenNameLPAREN	
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
,	TokenNameCOMMA	
float	TokenNamefloat	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
float	TokenNamefloat	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
;	TokenNameSEMICOLON	
affineTransform	TokenNameIdentifier	 affine Transform
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getRotateInstance	TokenNameIdentifier	 get Rotate Instance
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
angle	TokenNameIdentifier	 angle
=	TokenNameEQUAL	
angle	TokenNameIdentifier	 angle
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
cx	TokenNameIdentifier	 cx
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
cy	TokenNameIdentifier	 cy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#setSkewX(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#setSkewX(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setSkewX	TokenNameIdentifier	 set Skew X
(	TokenNameLPAREN	
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVG_TRANSFORM_SKEWX	TokenNameIdentifier	 SVG  TRANSFORM  SKEWX
;	TokenNameSEMICOLON	
affineTransform	TokenNameIdentifier	 affine Transform
=	TokenNameEQUAL	
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
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
angle	TokenNameIdentifier	 angle
=	TokenNameEQUAL	
angle	TokenNameIdentifier	 angle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#setSkewY(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#setSkewY(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setSkewY	TokenNameIdentifier	 set Skew Y
(	TokenNameLPAREN	
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVG_TRANSFORM_SKEWY	TokenNameIdentifier	 SVG  TRANSFORM  SKEWY
;	TokenNameSEMICOLON	
affineTransform	TokenNameIdentifier	 affine Transform
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getShearInstance	TokenNameIdentifier	 get Shear Instance
(	TokenNameLPAREN	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
tan	TokenNameIdentifier	 tan
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
angle	TokenNameIdentifier	 angle
=	TokenNameEQUAL	
angle	TokenNameIdentifier	 angle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
