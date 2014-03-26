/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
/** * This class provides an implementation of the PathHandler that initializes * an AffineTransform from the value of a 'transform' attribute. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AWTTransformProducer.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation of the PathHandler that initializes an AffineTransform from the value of a 'transform' attribute. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AWTTransformProducer.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
AWTTransformProducer	TokenNameIdentifier	 AWT Transform Producer
implements	TokenNameimplements	
TransformListHandler	TokenNameIdentifier	 Transform List Handler
{	TokenNameLBRACE	
/** * The value of the current affine transform. */	TokenNameCOMMENT_JAVADOC	 The value of the current affine transform. 
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
affineTransform	TokenNameIdentifier	 affine Transform
;	TokenNameSEMICOLON	
/** * Utility method for creating an AffineTransform. * @param r The reader used to read the transform specification. */	TokenNameCOMMENT_JAVADOC	 Utility method for creating an AffineTransform. @param r The reader used to read the transform specification. 
public	TokenNamepublic	
static	TokenNamestatic	
AffineTransform	TokenNameIdentifier	 Affine Transform
createAffineTransform	TokenNameIdentifier	 create Affine Transform
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
TransformListParser	TokenNameIdentifier	 Transform List Parser
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
TransformListParser	TokenNameIdentifier	 Transform List Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AWTTransformProducer	TokenNameIdentifier	 AWT Transform Producer
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
new	TokenNamenew	
AWTTransformProducer	TokenNameIdentifier	 AWT Transform Producer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setTransformListHandler	TokenNameIdentifier	 set Transform List Handler
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
th	TokenNameIdentifier	 th
.	TokenNameDOT	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility method for creating an AffineTransform. * @param s The transform specification. */	TokenNameCOMMENT_JAVADOC	 Utility method for creating an AffineTransform. @param s The transform specification. 
public	TokenNamepublic	
static	TokenNamestatic	
AffineTransform	TokenNameIdentifier	 Affine Transform
createAffineTransform	TokenNameIdentifier	 create Affine Transform
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
TransformListParser	TokenNameIdentifier	 Transform List Parser
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
TransformListParser	TokenNameIdentifier	 Transform List Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AWTTransformProducer	TokenNameIdentifier	 AWT Transform Producer
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
new	TokenNamenew	
AWTTransformProducer	TokenNameIdentifier	 AWT Transform Producer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setTransformListHandler	TokenNameIdentifier	 set Transform List Handler
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
th	TokenNameIdentifier	 th
.	TokenNameDOT	
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the AffineTransform object initialized during the last parsing. * @return the transform or null if this handler has not been used by * a parser. */	TokenNameCOMMENT_JAVADOC	 Returns the AffineTransform object initialized during the last parsing. @return the transform or null if this handler has not been used by a parser. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
affineTransform	TokenNameIdentifier	 affine Transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#startTransformList()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#startTransformList()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startTransformList	TokenNameIdentifier	 start Transform List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
affineTransform	TokenNameIdentifier	 affine Transform
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * TransformListHandler#matrix(float,float,float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#matrix(float,float,float,float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
matrix	TokenNameIdentifier	 matrix
(	TokenNameLPAREN	
float	TokenNamefloat	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
float	TokenNamefloat	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
float	TokenNamefloat	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
float	TokenNamefloat	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
float	TokenNamefloat	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
affineTransform	TokenNameIdentifier	 affine Transform
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#rotate(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#rotate(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
float	TokenNamefloat	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
affineTransform	TokenNameIdentifier	 affine Transform
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getRotateInstance	TokenNameIdentifier	 get Rotate Instance
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#rotate(float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#rotate(float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
float	TokenNamefloat	
theta	TokenNameIdentifier	 theta
,	TokenNameCOMMA	
float	TokenNamefloat	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
float	TokenNamefloat	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getRotateInstance	TokenNameIdentifier	 get Rotate Instance
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
affineTransform	TokenNameIdentifier	 affine Transform
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#translate(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#translate(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
float	TokenNamefloat	
tx	TokenNameIdentifier	 tx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getTranslateInstance	TokenNameIdentifier	 get Translate Instance
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
affineTransform	TokenNameIdentifier	 affine Transform
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#translate(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#translate(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
float	TokenNamefloat	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
float	TokenNamefloat	
ty	TokenNameIdentifier	 ty
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
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
affineTransform	TokenNameIdentifier	 affine Transform
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#scale(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#scale(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
float	TokenNamefloat	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
affineTransform	TokenNameIdentifier	 affine Transform
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getScaleInstance	TokenNameIdentifier	 get Scale Instance
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#scale(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#scale(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
float	TokenNamefloat	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
float	TokenNamefloat	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
affineTransform	TokenNameIdentifier	 affine Transform
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getScaleInstance	TokenNameIdentifier	 get Scale Instance
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#skewX(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#skewX(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
skewX	TokenNameIdentifier	 skew X
(	TokenNameLPAREN	
float	TokenNamefloat	
skx	TokenNameIdentifier	 skx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
affineTransform	TokenNameIdentifier	 affine Transform
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
skx	TokenNameIdentifier	 skx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#skewY(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#skewY(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
skewY	TokenNameIdentifier	 skew Y
(	TokenNameLPAREN	
float	TokenNamefloat	
sky	TokenNameIdentifier	 sky
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
affineTransform	TokenNameIdentifier	 affine Transform
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
sky	TokenNameIdentifier	 sky
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#endTransformList()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#endTransformList()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endTransformList	TokenNameIdentifier	 end Transform List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
