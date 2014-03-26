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
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
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
value	TokenNameIdentifier	 value
.	TokenNameDOT	
AbstractValueManager	TokenNameIdentifier	 Abstract Value Manager
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
value	TokenNameIdentifier	 value
.	TokenNameDOT	
FloatValue	TokenNameIdentifier	 Float Value
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
value	TokenNameIdentifier	 value
.	TokenNameDOT	
Value	TokenNameIdentifier	 Value
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
value	TokenNameIdentifier	 value
.	TokenNameDOT	
ValueManager	TokenNameIdentifier	 Value Manager
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
SVGTypes	TokenNameIdentifier	 SVG Types
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
/** * This class provides a manager for the 'glyph-orientation' property values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: GlyphOrientationManager.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides a manager for the 'glyph-orientation' property values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: GlyphOrientationManager.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
GlyphOrientationManager	TokenNameIdentifier	 Glyph Orientation Manager
extends	TokenNameextends	
AbstractValueManager	TokenNameIdentifier	 Abstract Value Manager
{	TokenNameLBRACE	
/** * Implements {@link * org.apache.batik.css.engine.value.ValueManager#isInheritedProperty()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.css.engine.value.ValueManager#isInheritedProperty()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInheritedProperty	TokenNameIdentifier	 is Inherited Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ValueManager#isAnimatableProperty()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#isAnimatableProperty()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAnimatableProperty	TokenNameIdentifier	 is Animatable Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ValueManager#isAdditiveProperty()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#isAdditiveProperty()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAdditiveProperty	TokenNameIdentifier	 is Additive Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ValueManager#getPropertyType()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#getPropertyType()}. 
public	TokenNamepublic	
int	TokenNameint	
getPropertyType	TokenNameIdentifier	 get Property Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_ANGLE	TokenNameIdentifier	 TYPE  ANGLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
SAC_INHERIT	TokenNameIdentifier	 SAC  INHERIT
:	TokenNameCOLON	
return	TokenNamereturn	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
INHERIT_VALUE	TokenNameIdentifier	 INHERIT  VALUE
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_DEGREE	TokenNameIdentifier	 SAC  DEGREE
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_DEG	TokenNameIdentifier	 CSS  DEG
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
SAC_GRADIAN	TokenNameIdentifier	 SAC  GRADIAN
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_GRAD	TokenNameIdentifier	 CSS  GRAD
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
SAC_RADIAN	TokenNameIdentifier	 SAC  RADIAN
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_RAD	TokenNameIdentifier	 CSS  RAD
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For SVG angle properties unit defaults to 'deg'. 	TokenNameCOMMENT_LINE	For SVG angle properties unit defaults to 'deg'. 
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_INTEGER	TokenNameIdentifier	 SAC  INTEGER
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getIntegerValue	TokenNameIdentifier	 get Integer Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_DEG	TokenNameIdentifier	 CSS  DEG
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_REAL	TokenNameIdentifier	 SAC  REAL
:	TokenNameCOLON	
{	TokenNameLBRACE	
float	TokenNamefloat	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
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
CSS_DEG	TokenNameIdentifier	 CSS  DEG
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
CSS_DEG	TokenNameIdentifier	 CSS  DEG
:	TokenNameCOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_GRAD	TokenNameIdentifier	 CSS  GRAD
:	TokenNameCOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_RAD	TokenNameIdentifier	 CSS  RAD
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
createInvalidFloatValueDOMException	TokenNameIdentifier	 create Invalid Float Value DOM Exception
(	TokenNameLPAREN	
floatValue	TokenNameIdentifier	 float Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
