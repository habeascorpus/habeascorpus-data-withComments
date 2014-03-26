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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CSSConstants	TokenNameIdentifier	 CSS Constants
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
/** * This class provides a manager for the property with support for * rect values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: RectManager.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides a manager for the property with support for rect values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: RectManager.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
RectManager	TokenNameIdentifier	 Rect Manager
extends	TokenNameextends	
LengthManager	TokenNameIdentifier	 Length Manager
{	TokenNameLBRACE	
/** * The current orientation. */	TokenNameCOMMENT_JAVADOC	 The current orientation. 
protected	TokenNameprotected	
int	TokenNameint	
orientation	TokenNameIdentifier	 orientation
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
SAC_FUNCTION	TokenNameIdentifier	 SAC  FUNCTION
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFunctionName	TokenNameIdentifier	 get Function Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"rect"	TokenNameStringLiteral	rect
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_RECT_FUNCTION	TokenNameIdentifier	 SAC  RECT  FUNCTION
:	TokenNameCOLON	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Value	TokenNameIdentifier	 Value
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
createRectComponent	TokenNameIdentifier	 create Rect Component
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_OPERATOR_COMMA	TokenNameIdentifier	 SAC  OPERATOR  COMMA
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createMalformedRectDOMException	TokenNameIdentifier	 create Malformed Rect DOM Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Value	TokenNameIdentifier	 Value
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
createRectComponent	TokenNameIdentifier	 create Rect Component
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_OPERATOR_COMMA	TokenNameIdentifier	 SAC  OPERATOR  COMMA
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createMalformedRectDOMException	TokenNameIdentifier	 create Malformed Rect DOM Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Value	TokenNameIdentifier	 Value
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
createRectComponent	TokenNameIdentifier	 create Rect Component
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_OPERATOR_COMMA	TokenNameIdentifier	 SAC  OPERATOR  COMMA
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createMalformedRectDOMException	TokenNameIdentifier	 create Malformed Rect DOM Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Value	TokenNameIdentifier	 Value
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
createRectComponent	TokenNameIdentifier	 create Rect Component
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
RectValue	TokenNameIdentifier	 Rect Value
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
bottom	TokenNameIdentifier	 bottom
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
createMalformedRectDOMException	TokenNameIdentifier	 create Malformed Rect DOM Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Value	TokenNameIdentifier	 Value
createRectComponent	TokenNameIdentifier	 create Rect Component
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
lu	TokenNameIdentifier	 lu
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
SAC_IDENT	TokenNameIdentifier	 SAC  IDENT
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_AUTO_VALUE	TokenNameIdentifier	 CSS  AUTO  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
AUTO_VALUE	TokenNameIdentifier	 AUTO  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
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
createMalformedRectDOMException	TokenNameIdentifier	 create Malformed Rect DOM Exception
(	TokenNameLPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_RECT	TokenNameIdentifier	 CSS  RECT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RectValue	TokenNameIdentifier	 Rect Value
rect	TokenNameIdentifier	 rect
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RectValue	TokenNameIdentifier	 Rect Value
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
orientation	TokenNameIdentifier	 orientation
=	TokenNameEQUAL	
VERTICAL_ORIENTATION	TokenNameIdentifier	 VERTICAL  ORIENTATION
;	TokenNameSEMICOLON	
Value	TokenNameIdentifier	 Value
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
computeValue	TokenNameIdentifier	 compute Value
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
pseudo	TokenNameIdentifier	 pseudo
,	TokenNameCOMMA	
engine	TokenNameIdentifier	 engine
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getTop	TokenNameIdentifier	 get Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Value	TokenNameIdentifier	 Value
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
computeValue	TokenNameIdentifier	 compute Value
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
pseudo	TokenNameIdentifier	 pseudo
,	TokenNameCOMMA	
engine	TokenNameIdentifier	 engine
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getBottom	TokenNameIdentifier	 get Bottom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
orientation	TokenNameIdentifier	 orientation
=	TokenNameEQUAL	
HORIZONTAL_ORIENTATION	TokenNameIdentifier	 HORIZONTAL  ORIENTATION
;	TokenNameSEMICOLON	
Value	TokenNameIdentifier	 Value
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
computeValue	TokenNameIdentifier	 compute Value
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
pseudo	TokenNameIdentifier	 pseudo
,	TokenNameCOMMA	
engine	TokenNameIdentifier	 engine
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Value	TokenNameIdentifier	 Value
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
computeValue	TokenNameIdentifier	 compute Value
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
pseudo	TokenNameIdentifier	 pseudo
,	TokenNameCOMMA	
engine	TokenNameIdentifier	 engine
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
!=	TokenNameNOT_EQUAL	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getTop	TokenNameIdentifier	 get Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
right	TokenNameIdentifier	 right
!=	TokenNameNOT_EQUAL	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
bottom	TokenNameIdentifier	 bottom
!=	TokenNameNOT_EQUAL	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getBottom	TokenNameIdentifier	 get Bottom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
left	TokenNameIdentifier	 left
!=	TokenNameNOT_EQUAL	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RectValue	TokenNameIdentifier	 Rect Value
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
bottom	TokenNameIdentifier	 bottom
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Indicates the orientation of the property associated with * this manager. */	TokenNameCOMMENT_JAVADOC	 Indicates the orientation of the property associated with this manager. 
protected	TokenNameprotected	
int	TokenNameint	
getOrientation	TokenNameIdentifier	 get Orientation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
orientation	TokenNameIdentifier	 orientation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
DOMException	TokenNameIdentifier	 DOM Exception
createMalformedRectDOMException	TokenNameIdentifier	 create Malformed Rect DOM Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getPropertyName	TokenNameIdentifier	 get Property Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"malformed.rect"	TokenNameStringLiteral	malformed.rect
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
SYNTAX_ERR	TokenNameIdentifier	 SYNTAX  ERR
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
