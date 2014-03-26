/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
g2d	TokenNameIdentifier	 g2d
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
/** * Contains a description of an elementary transform stack element, * such as a rotate or translate. A transform stack element has a * type and a value, which is an array of double values.<br> * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @author <a href="mailto:paul_evenblij@compuware.com">Paul Evenblij</a> * @version $Id: TransformStackElement.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Contains a description of an elementary transform stack element, such as a rotate or translate. A transform stack element has a type and a value, which is an array of double values.<br> * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @author <a href="mailto:paul_evenblij@compuware.com">Paul Evenblij</a> @version $Id: TransformStackElement.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** * Transform type */	TokenNameCOMMENT_JAVADOC	 Transform type 
private	TokenNameprivate	
TransformType	TokenNameIdentifier	 Transform Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * Value */	TokenNameCOMMENT_JAVADOC	 Value 
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transformParameters	TokenNameIdentifier	 transform Parameters
;	TokenNameSEMICOLON	
/** * @param type transform type * @param transformParameters parameters for transform */	TokenNameCOMMENT_JAVADOC	 @param type transform type @param transformParameters parameters for transform 
protected	TokenNameprotected	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
(	TokenNameLPAREN	
TransformType	TokenNameIdentifier	 Transform Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transformParameters	TokenNameIdentifier	 transform Parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
transformParameters	TokenNameIdentifier	 transform Parameters
=	TokenNameEQUAL	
transformParameters	TokenNameIdentifier	 transform Parameters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return an object which is a deep copy of this one */	TokenNameCOMMENT_JAVADOC	 @return an object which is a deep copy of this one 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
newElement	TokenNameIdentifier	 new Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// start with a shallow copy to get our implementations right 	TokenNameCOMMENT_LINE	start with a shallow copy to get our implementations right 
try	TokenNametry	
{	TokenNameLBRACE	
newElement	TokenNameIdentifier	 new Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// now deep copy the parameter array 	TokenNameCOMMENT_LINE	now deep copy the parameter array 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transformParameters	TokenNameIdentifier	 transform Parameters
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
transformParameters	TokenNameIdentifier	 transform Parameters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
transformParameters	TokenNameIdentifier	 transform Parameters
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
transformParameters	TokenNameIdentifier	 transform Parameters
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
transformParameters	TokenNameIdentifier	 transform Parameters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newElement	TokenNameIdentifier	 new Element
.	TokenNameDOT	
transformParameters	TokenNameIdentifier	 transform Parameters
=	TokenNameEQUAL	
transformParameters	TokenNameIdentifier	 transform Parameters
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newElement	TokenNameIdentifier	 new Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Factory methods */	TokenNameCOMMENT_BLOCK	 Factory methods 
public	TokenNamepublic	
static	TokenNamestatic	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
createTranslateElement	TokenNameIdentifier	 create Translate Element
(	TokenNameLPAREN	
double	TokenNamedouble	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
double	TokenNamedouble	
ty	TokenNameIdentifier	 ty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
(	TokenNameLPAREN	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
TRANSLATE	TokenNameIdentifier	 TRANSLATE
,	TokenNameCOMMA	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
ty	TokenNameIdentifier	 ty
}	TokenNameRBRACE	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
createRotateElement	TokenNameIdentifier	 create Rotate Element
(	TokenNameLPAREN	
double	TokenNamedouble	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
(	TokenNameLPAREN	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
ROTATE	TokenNameIdentifier	 ROTATE
,	TokenNameCOMMA	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
theta	TokenNameIdentifier	 theta
}	TokenNameRBRACE	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
createScaleElement	TokenNameIdentifier	 create Scale Element
(	TokenNameLPAREN	
double	TokenNamedouble	
scaleX	TokenNameIdentifier	 scale X
,	TokenNameCOMMA	
double	TokenNamedouble	
scaleY	TokenNameIdentifier	 scale Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
(	TokenNameLPAREN	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
SCALE	TokenNameIdentifier	 SCALE
,	TokenNameCOMMA	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
scaleX	TokenNameIdentifier	 scale X
,	TokenNameCOMMA	
scaleY	TokenNameIdentifier	 scale Y
}	TokenNameRBRACE	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
createShearElement	TokenNameIdentifier	 create Shear Element
(	TokenNameLPAREN	
double	TokenNamedouble	
shearX	TokenNameIdentifier	 shear X
,	TokenNameCOMMA	
double	TokenNamedouble	
shearY	TokenNameIdentifier	 shear Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
(	TokenNameLPAREN	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
SHEAR	TokenNameIdentifier	 SHEAR
,	TokenNameCOMMA	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
shearX	TokenNameIdentifier	 shear X
,	TokenNameCOMMA	
shearY	TokenNameIdentifier	 shear Y
}	TokenNameRBRACE	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
parameters	TokenNameIdentifier	 parameters
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
createGeneralTransformElement	TokenNameIdentifier	 create General Transform Element
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
txf	TokenNameIdentifier	 txf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
txf	TokenNameIdentifier	 txf
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
(	TokenNameLPAREN	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
GENERAL	TokenNameIdentifier	 GENERAL
,	TokenNameCOMMA	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m	TokenNameIdentifier	 m
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implementation should determine if the parameter list represents * an identity transform, for the instance transform type. */	TokenNameCOMMENT_JAVADOC	 Implementation should determine if the parameter list represents an identity transform, for the instance transform type. 
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return true iff this transform is the identity transform */	TokenNameCOMMENT_JAVADOC	 @return true iff this transform is the identity transform 
public	TokenNamepublic	
boolean	TokenNameboolean	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return array of values containing this transform element's parameters */	TokenNameCOMMENT_JAVADOC	 @return array of values containing this transform element's parameters 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTransformParameters	TokenNameIdentifier	 get Transform Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
transformParameters	TokenNameIdentifier	 transform Parameters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return this transform type */	TokenNameCOMMENT_JAVADOC	 @return this transform type 
public	TokenNamepublic	
TransformType	TokenNameIdentifier	 Transform Type
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Concatenation utility. Requests this transform stack element * to concatenate with the input stack element. Only elements * of the same types are concatenated. For example, if this * element represents a translation, it will concatenate with * another translation, but not with any other kind of * stack element. * @param stackElement element to be concatenated with this one. * @return true if the input stackElement was concatenated with * this one. False otherwise. */	TokenNameCOMMENT_BLOCK	 Concatenation utility. Requests this transform stack element to concatenate with the input stack element. Only elements of the same types are concatenated. For example, if this element represents a translation, it will concatenate with another translation, but not with any other kind of stack element. @param stackElement element to be concatenated with this one. @return true if the input stackElement was concatenated with this one. False otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
stackElement	TokenNameIdentifier	 stack Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
canConcatenate	TokenNameIdentifier	 can Concatenate
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
stackElement	TokenNameIdentifier	 stack Element
.	TokenNameDOT	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
canConcatenate	TokenNameIdentifier	 can Concatenate
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
TRANSFORM_TRANSLATE	TokenNameIdentifier	 TRANSFORM  TRANSLATE
:	TokenNameCOLON	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
stackElement	TokenNameIdentifier	 stack Element
.	TokenNameDOT	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
stackElement	TokenNameIdentifier	 stack Element
.	TokenNameDOT	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
TRANSFORM_ROTATE	TokenNameIdentifier	 TRANSFORM  ROTATE
:	TokenNameCOLON	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
stackElement	TokenNameIdentifier	 stack Element
.	TokenNameDOT	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
TRANSFORM_SCALE	TokenNameIdentifier	 TRANSFORM  SCALE
:	TokenNameCOLON	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
stackElement	TokenNameIdentifier	 stack Element
.	TokenNameDOT	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
stackElement	TokenNameIdentifier	 stack Element
.	TokenNameDOT	
transformParameters	TokenNameIdentifier	 transform Parameters
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TransformType	TokenNameIdentifier	 Transform Type
.	TokenNameDOT	
TRANSFORM_GENERAL	TokenNameIdentifier	 TRANSFORM  GENERAL
:	TokenNameCOLON	
transformParameters	TokenNameIdentifier	 transform Parameters
=	TokenNameEQUAL	
matrixMultiply	TokenNameIdentifier	 matrix Multiply
(	TokenNameLPAREN	
transformParameters	TokenNameIdentifier	 transform Parameters
,	TokenNameCOMMA	
stackElement	TokenNameIdentifier	 stack Element
.	TokenNameDOT	
transformParameters	TokenNameIdentifier	 transform Parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
canConcatenate	TokenNameIdentifier	 can Concatenate
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
canConcatenate	TokenNameIdentifier	 can Concatenate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Multiplies two 2x3 matrices of double precision values */	TokenNameCOMMENT_JAVADOC	 Multiplies two 2x3 matrices of double precision values 
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrixMultiply	TokenNameIdentifier	 matrix Multiply
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrix1	TokenNameIdentifier	 matrix1
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrix2	TokenNameIdentifier	 matrix2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
product	TokenNameIdentifier	 product
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
transform1	TokenNameIdentifier	 transform1
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
matrix1	TokenNameIdentifier	 matrix1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transform1	TokenNameIdentifier	 transform1
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
matrix2	TokenNameIdentifier	 matrix2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transform1	TokenNameIdentifier	 transform1
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
product	TokenNameIdentifier	 product
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
product	TokenNameIdentifier	 product
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
