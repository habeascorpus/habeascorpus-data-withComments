/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
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
value	TokenNameIdentifier	 value
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
CSSContext	TokenNameIdentifier	 CSS Context
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
CSSEngine	TokenNameIdentifier	 CSS Engine
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
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
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
StyleMap	TokenNameIdentifier	 Style Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
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
css	TokenNameIdentifier	 css
.	TokenNameDOT	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
CSSValue	TokenNameIdentifier	 CSS Value
;	TokenNameSEMICOLON	
/** * This class provides a manager for the property with support for * length values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: LengthManager.java 480490 2006-11-29 09:02:20Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides a manager for the property with support for length values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: LengthManager.java 480490 2006-11-29 09:02:20Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LengthManager	TokenNameIdentifier	 Length Manager
extends	TokenNameextends	
AbstractValueManager	TokenNameIdentifier	 Abstract Value Manager
{	TokenNameLBRACE	
/** * precomputed square-root of 2.0 */	TokenNameCOMMENT_JAVADOC	 precomputed square-root of 2.0 
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
SQRT2	TokenNameIdentifier	 SQR T2
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Implements {@link ValueManager#createValue(LexicalUnit,CSSEngine)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#createValue(LexicalUnit,CSSEngine)}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
createValue	TokenNameIdentifier	 create Value
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
lu	TokenNameIdentifier	 lu
,	TokenNameCOMMA	
CSSEngine	TokenNameIdentifier	 CSS Engine
engine	TokenNameIdentifier	 engine
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_EM	TokenNameIdentifier	 SAC  EM
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_EMS	TokenNameIdentifier	 CSS  EMS
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_EX	TokenNameIdentifier	 SAC  EX
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_EXS	TokenNameIdentifier	 CSS  EXS
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_PIXEL	TokenNameIdentifier	 SAC  PIXEL
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_PX	TokenNameIdentifier	 CSS  PX
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_CENTIMETER	TokenNameIdentifier	 SAC  CENTIMETER
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_CM	TokenNameIdentifier	 CSS  CM
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_MILLIMETER	TokenNameIdentifier	 SAC  MILLIMETER
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_MM	TokenNameIdentifier	 CSS  MM
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_INCH	TokenNameIdentifier	 SAC  INCH
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IN	TokenNameIdentifier	 CSS  IN
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_POINT	TokenNameIdentifier	 SAC  POINT
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_PT	TokenNameIdentifier	 CSS  PT
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_PICA	TokenNameIdentifier	 SAC  PICA
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_PC	TokenNameIdentifier	 CSS  PC
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_INTEGER	TokenNameIdentifier	 SAC  INTEGER
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getIntegerValue	TokenNameIdentifier	 get Integer Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_REAL	TokenNameIdentifier	 SAC  REAL
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_PERCENTAGE	TokenNameIdentifier	 SAC  PERCENTAGE
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_PERCENTAGE	TokenNameIdentifier	 CSS  PERCENTAGE
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
createInvalidLexicalUnitDOMException	TokenNameIdentifier	 create Invalid Lexical Unit DOM Exception
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ValueManager#createFloatValue(short,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#createFloatValue(short,float)}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
createFloatValue	TokenNameIdentifier	 create Float Value
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
float	TokenNamefloat	
floatValue	TokenNameIdentifier	 float Value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_PERCENTAGE	TokenNameIdentifier	 CSS  PERCENTAGE
:	TokenNameCOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_EMS	TokenNameIdentifier	 CSS  EMS
:	TokenNameCOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_EXS	TokenNameIdentifier	 CSS  EXS
:	TokenNameCOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_PX	TokenNameIdentifier	 CSS  PX
:	TokenNameCOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_CM	TokenNameIdentifier	 CSS  CM
:	TokenNameCOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_MM	TokenNameIdentifier	 CSS  MM
:	TokenNameCOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IN	TokenNameIdentifier	 CSS  IN
:	TokenNameCOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_PT	TokenNameIdentifier	 CSS  PT
:	TokenNameCOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_PC	TokenNameIdentifier	 CSS  PC
:	TokenNameCOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
floatValue	TokenNameIdentifier	 float Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
createInvalidFloatTypeDOMException	TokenNameIdentifier	 create Invalid Float Type DOM Exception
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * ValueManager#computeValue(CSSStylableElement,String,CSSEngine,int,StyleMap,Value)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#computeValue(CSSStylableElement,String,CSSEngine,int,StyleMap,Value)}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
computeValue	TokenNameIdentifier	 compute Value
(	TokenNameLPAREN	
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pseudo	TokenNameIdentifier	 pseudo
,	TokenNameCOMMA	
CSSEngine	TokenNameIdentifier	 CSS Engine
engine	TokenNameIdentifier	 engine
,	TokenNameCOMMA	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
StyleMap	TokenNameIdentifier	 Style Map
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getCssValueType	TokenNameIdentifier	 get Css Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
CSSValue	TokenNameIdentifier	 CSS Value
.	TokenNameDOT	
CSS_PRIMITIVE_VALUE	TokenNameIdentifier	 CSS  PRIMITIVE  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
:	TokenNameCOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_PX	TokenNameIdentifier	 CSS  PX
:	TokenNameCOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_MM	TokenNameIdentifier	 CSS  MM
:	TokenNameCOLON	
CSSContext	TokenNameIdentifier	 CSS Context
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
getCSSContext	TokenNameIdentifier	 get CSS Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
/	TokenNameDIVIDE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_CM	TokenNameIdentifier	 CSS  CM
:	TokenNameCOLON	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
getCSSContext	TokenNameIdentifier	 get CSS Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
10f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IN	TokenNameIdentifier	 CSS  IN
:	TokenNameCOLON	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
getCSSContext	TokenNameIdentifier	 get CSS Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
25.4f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_PT	TokenNameIdentifier	 CSS  PT
:	TokenNameCOLON	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
getCSSContext	TokenNameIdentifier	 get CSS Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
25.4f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
72f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_PC	TokenNameIdentifier	 CSS  PC
:	TokenNameCOLON	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
getCSSContext	TokenNameIdentifier	 get CSS Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
25.4f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
6f	TokenNameFloatingPointLiteral	
*	TokenNameMULTIPLY	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_EMS	TokenNameIdentifier	 CSS  EMS
:	TokenNameCOLON	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
putFontSizeRelative	TokenNameIdentifier	 put Font Size Relative
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fsidx	TokenNameIdentifier	 fsidx
=	TokenNameEQUAL	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
getFontSizeIndex	TokenNameIdentifier	 get Font Size Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
fs	TokenNameIdentifier	 fs
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
pseudo	TokenNameIdentifier	 pseudo
,	TokenNameCOMMA	
fsidx	TokenNameIdentifier	 fsidx
)	TokenNameRPAREN	
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_EXS	TokenNameIdentifier	 CSS  EXS
:	TokenNameCOLON	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
putFontSizeRelative	TokenNameIdentifier	 put Font Size Relative
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fsidx	TokenNameIdentifier	 fsidx
=	TokenNameEQUAL	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
getFontSizeIndex	TokenNameIdentifier	 get Font Size Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
pseudo	TokenNameIdentifier	 pseudo
,	TokenNameCOMMA	
fsidx	TokenNameIdentifier	 fsidx
)	TokenNameRPAREN	
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
*	TokenNameMULTIPLY	
fs	TokenNameIdentifier	 fs
*	TokenNameMULTIPLY	
0.5f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_PERCENTAGE	TokenNameIdentifier	 CSS  PERCENTAGE
:	TokenNameCOLON	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
getCSSContext	TokenNameIdentifier	 get CSS Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getOrientation	TokenNameIdentifier	 get Orientation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
HORIZONTAL_ORIENTATION	TokenNameIdentifier	 HORIZONTAL  ORIENTATION
:	TokenNameCOLON	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
putBlockWidthRelative	TokenNameIdentifier	 put Block Width Relative
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getBlockWidth	TokenNameIdentifier	 get Block Width
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
100f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
VERTICAL_ORIENTATION	TokenNameIdentifier	 VERTICAL  ORIENTATION
:	TokenNameCOLON	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
putBlockHeightRelative	TokenNameIdentifier	 put Block Height Relative
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getBlockHeight	TokenNameIdentifier	 get Block Height
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
100f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Both 	TokenNameCOMMENT_LINE	Both 
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
putBlockWidthRelative	TokenNameIdentifier	 put Block Width Relative
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
putBlockHeightRelative	TokenNameIdentifier	 put Block Height Relative
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getBlockWidth	TokenNameIdentifier	 get Block Width
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getBlockHeight	TokenNameIdentifier	 get Block Height
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
*	TokenNameMULTIPLY	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
SQRT2	TokenNameIdentifier	 SQR T2
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
100.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Orientation enumeration 	TokenNameCOMMENT_LINE	Orientation enumeration 
// 	TokenNameCOMMENT_LINE	 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HORIZONTAL_ORIENTATION	TokenNameIdentifier	 HORIZONTAL  ORIENTATION
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERTICAL_ORIENTATION	TokenNameIdentifier	 VERTICAL  ORIENTATION
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BOTH_ORIENTATION	TokenNameIdentifier	 BOTH  ORIENTATION
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates the orientation of the property associated with * this manager. */	TokenNameCOMMENT_JAVADOC	 Indicates the orientation of the property associated with this manager. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
getOrientation	TokenNameIdentifier	 get Orientation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
