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
css2	TokenNameIdentifier	 css2
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
ValueManager	TokenNameIdentifier	 Value Manager
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
IdentifierManager	TokenNameIdentifier	 Identifier Manager
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
AbstractValueFactory	TokenNameIdentifier	 Abstract Value Factory
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
ShorthandManager	TokenNameIdentifier	 Shorthand Manager
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
StringMap	TokenNameIdentifier	 String Map
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
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
/** * This class provides support for the CSS2 'font' shorthand property. * * The form of this property is: * [ [ <font-style> || <font-variant> || <font-weight> ]? * <font-size> [ / <line-height> ]? <font-family> ] | * caption | icon | menu | message-box | small-caption | * status-bar | inherit * * It is worth noting that there is a potential ambiguity * between font-size and font-weight since in SVG they can both * be unitless. This is solved by considering the 'last' number * before an 'ident' or '/' to be font-size and any preceeding * number to be font-weight. * * @author <a href="mailto:deweese@apache.org">deweese</a> * @version $Id: FontShorthandManager.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides support for the CSS2 'font' shorthand property. * The form of this property is: [ [ <font-style> || <font-variant> || <font-weight> ]? <font-size> [ / <line-height> ]? <font-family> ] | caption | icon | menu | message-box | small-caption | status-bar | inherit * It is worth noting that there is a potential ambiguity between font-size and font-weight since in SVG they can both be unitless. This is solved by considering the 'last' number before an 'ident' or '/' to be font-size and any preceeding number to be font-weight. * @author <a href="mailto:deweese@apache.org">deweese</a> @version $Id: FontShorthandManager.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
FontShorthandManager	TokenNameIdentifier	 Font Shorthand Manager
extends	TokenNameextends	
AbstractValueFactory	TokenNameIdentifier	 Abstract Value Factory
implements	TokenNameimplements	
ShorthandManager	TokenNameIdentifier	 Shorthand Manager
{	TokenNameLBRACE	
public	TokenNamepublic	
FontShorthandManager	TokenNameIdentifier	 Font Shorthand Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link ValueManager#getPropertyName()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#getPropertyName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPropertyName	TokenNameIdentifier	 get Property Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_PROPERTY	TokenNameIdentifier	 CSS  FONT  PROPERTY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ShorthandManager#isAnimatableProperty()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ShorthandManager#isAnimatableProperty()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAnimatableProperty	TokenNameIdentifier	 is Animatable Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
static	TokenNamestatic	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
NORMAL_LU	TokenNameIdentifier	 NORMAL  LU
=	TokenNameEQUAL	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
.	TokenNameDOT	
createString	TokenNameIdentifier	 create String
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_IDENT	TokenNameIdentifier	 SAC  IDENT
,	TokenNameCOMMA	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_NORMAL_VALUE	TokenNameIdentifier	 CSS  NORMAL  VALUE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
BOLD_LU	TokenNameIdentifier	 BOLD  LU
=	TokenNameEQUAL	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
.	TokenNameDOT	
createString	TokenNameIdentifier	 create String
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_IDENT	TokenNameIdentifier	 SAC  IDENT
,	TokenNameCOMMA	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BOLD_VALUE	TokenNameIdentifier	 CSS  BOLD  VALUE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
MEDIUM_LU	TokenNameIdentifier	 MEDIUM  LU
=	TokenNameEQUAL	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
.	TokenNameDOT	
createString	TokenNameIdentifier	 create String
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_IDENT	TokenNameIdentifier	 SAC  IDENT
,	TokenNameCOMMA	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MEDIUM_VALUE	TokenNameIdentifier	 CSS  MEDIUM  VALUE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
SZ_10PT_LU	TokenNameIdentifier	 SZ 10 PT  LU
=	TokenNameEQUAL	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
.	TokenNameDOT	
createFloat	TokenNameIdentifier	 create Float
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_POINT	TokenNameIdentifier	 SAC  POINT
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
SZ_8PT_LU	TokenNameIdentifier	 SZ 8 PT  LU
=	TokenNameEQUAL	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
.	TokenNameDOT	
createFloat	TokenNameIdentifier	 create Float
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_POINT	TokenNameIdentifier	 SAC  POINT
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
FONT_FAMILY_LU	TokenNameIdentifier	 FONT  FAMILY  LU
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
lu	TokenNameIdentifier	 lu
;	TokenNameSEMICOLON	
FONT_FAMILY_LU	TokenNameIdentifier	 FONT  FAMILY  LU
=	TokenNameEQUAL	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
.	TokenNameDOT	
createString	TokenNameIdentifier	 create String
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_IDENT	TokenNameIdentifier	 SAC  IDENT
,	TokenNameCOMMA	
"Dialog"	TokenNameStringLiteral	Dialog
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
.	TokenNameDOT	
createString	TokenNameIdentifier	 create String
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_IDENT	TokenNameIdentifier	 SAC  IDENT
,	TokenNameCOMMA	
"Helvetica"	TokenNameStringLiteral	Helvetica
,	TokenNameCOMMA	
FONT_FAMILY_LU	TokenNameIdentifier	 FONT  FAMILY  LU
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
.	TokenNameDOT	
createString	TokenNameIdentifier	 create String
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_IDENT	TokenNameIdentifier	 SAC  IDENT
,	TokenNameCOMMA	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SANS_SERIF_VALUE	TokenNameIdentifier	 CSS  SANS  SERIF  VALUE
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CAPTION_VALUE	TokenNameIdentifier	 CSS  CAPTION  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ICON_VALUE	TokenNameIdentifier	 CSS  ICON  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MENU_VALUE	TokenNameIdentifier	 CSS  MENU  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MESSAGE_BOX_VALUE	TokenNameIdentifier	 CSS  MESSAGE  BOX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SMALL_CAPTION_VALUE	TokenNameIdentifier	 CSS  SMALL  CAPTION  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_STATUS_BAR_VALUE	TokenNameIdentifier	 CSS  STATUS  BAR  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleSystemFont	TokenNameIdentifier	 handle System Font
(	TokenNameLPAREN	
CSSEngine	TokenNameIdentifier	 CSS Engine
eng	TokenNameIdentifier	 eng
,	TokenNameCOMMA	
ShorthandManager	TokenNameIdentifier	 Shorthand Manager
.	TokenNameDOT	
PropertyHandler	TokenNameIdentifier	 Property Handler
ph	TokenNameIdentifier	 ph
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
boolean	TokenNameboolean	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
fontStyle	TokenNameIdentifier	 font Style
=	TokenNameEQUAL	
NORMAL_LU	TokenNameIdentifier	 NORMAL  LU
;	TokenNameSEMICOLON	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
fontVariant	TokenNameIdentifier	 font Variant
=	TokenNameEQUAL	
NORMAL_LU	TokenNameIdentifier	 NORMAL  LU
;	TokenNameSEMICOLON	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
fontWeight	TokenNameIdentifier	 font Weight
=	TokenNameEQUAL	
NORMAL_LU	TokenNameIdentifier	 NORMAL  LU
;	TokenNameSEMICOLON	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
lineHeight	TokenNameIdentifier	 line Height
=	TokenNameEQUAL	
NORMAL_LU	TokenNameIdentifier	 NORMAL  LU
;	TokenNameSEMICOLON	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
fontFamily	TokenNameIdentifier	 font Family
=	TokenNameEQUAL	
FONT_FAMILY_LU	TokenNameIdentifier	 FONT  FAMILY  LU
;	TokenNameSEMICOLON	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
fontSize	TokenNameIdentifier	 font Size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SMALL_CAPTION_VALUE	TokenNameIdentifier	 CSS  SMALL  CAPTION  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontSize	TokenNameIdentifier	 font Size
=	TokenNameEQUAL	
SZ_8PT_LU	TokenNameIdentifier	 SZ 8 PT  LU
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fontSize	TokenNameIdentifier	 font Size
=	TokenNameEQUAL	
SZ_10PT_LU	TokenNameIdentifier	 SZ 10 PT  LU
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_FAMILY_PROPERTY	TokenNameIdentifier	 CSS  FONT  FAMILY  PROPERTY
,	TokenNameCOMMA	
fontFamily	TokenNameIdentifier	 font Family
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_STYLE_PROPERTY	TokenNameIdentifier	 CSS  FONT  STYLE  PROPERTY
,	TokenNameCOMMA	
fontStyle	TokenNameIdentifier	 font Style
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_VARIANT_PROPERTY	TokenNameIdentifier	 CSS  FONT  VARIANT  PROPERTY
,	TokenNameCOMMA	
fontVariant	TokenNameIdentifier	 font Variant
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_WEIGHT_PROPERTY	TokenNameIdentifier	 CSS  FONT  WEIGHT  PROPERTY
,	TokenNameCOMMA	
fontWeight	TokenNameIdentifier	 font Weight
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_SIZE_PROPERTY	TokenNameIdentifier	 CSS  FONT  SIZE  PROPERTY
,	TokenNameCOMMA	
fontSize	TokenNameIdentifier	 font Size
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LINE_HEIGHT_PROPERTY	TokenNameIdentifier	 CSS  LINE  HEIGHT  PROPERTY
,	TokenNameCOMMA	
lineHeight	TokenNameIdentifier	 line Height
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ShorthandManager#setValues(CSSEngine,ShorthandManager.PropertyHandler,LexicalUnit,boolean)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ShorthandManager#setValues(CSSEngine,ShorthandManager.PropertyHandler,LexicalUnit,boolean)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
CSSEngine	TokenNameIdentifier	 CSS Engine
eng	TokenNameIdentifier	 eng
,	TokenNameCOMMA	
ShorthandManager	TokenNameIdentifier	 Shorthand Manager
.	TokenNameDOT	
PropertyHandler	TokenNameIdentifier	 Property Handler
ph	TokenNameIdentifier	 ph
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
lu	TokenNameIdentifier	 lu
,	TokenNameCOMMA	
boolean	TokenNameboolean	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
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
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_IDENT	TokenNameIdentifier	 SAC  IDENT
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleSystemFont	TokenNameIdentifier	 handle System Font
(	TokenNameLPAREN	
eng	TokenNameIdentifier	 eng
,	TokenNameCOMMA	
ph	TokenNameIdentifier	 ph
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
fontStyle	TokenNameIdentifier	 font Style
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
fontVariant	TokenNameIdentifier	 font Variant
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
fontWeight	TokenNameIdentifier	 font Weight
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
fontSize	TokenNameIdentifier	 font Size
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
lineHeight	TokenNameIdentifier	 line Height
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
fontFamily	TokenNameIdentifier	 font Family
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ValueManager	TokenNameIdentifier	 Value Manager
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vMgrs	TokenNameIdentifier	 v Mgrs
=	TokenNameEQUAL	
eng	TokenNameIdentifier	 eng
.	TokenNameDOT	
getValueManagers	TokenNameIdentifier	 get Value Managers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fst	TokenNameIdentifier	 fst
,	TokenNameCOMMA	
fv	TokenNameIdentifier	 fv
,	TokenNameCOMMA	
fw	TokenNameIdentifier	 fw
,	TokenNameCOMMA	
fsz	TokenNameIdentifier	 fsz
,	TokenNameCOMMA	
lh	TokenNameIdentifier	 lh
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
=	TokenNameEQUAL	
eng	TokenNameIdentifier	 eng
.	TokenNameDOT	
getPropertyIndex	TokenNameIdentifier	 get Property Index
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_STYLE_PROPERTY	TokenNameIdentifier	 CSS  FONT  STYLE  PROPERTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fv	TokenNameIdentifier	 fv
=	TokenNameEQUAL	
eng	TokenNameIdentifier	 eng
.	TokenNameDOT	
getPropertyIndex	TokenNameIdentifier	 get Property Index
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_VARIANT_PROPERTY	TokenNameIdentifier	 CSS  FONT  VARIANT  PROPERTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
eng	TokenNameIdentifier	 eng
.	TokenNameDOT	
getPropertyIndex	TokenNameIdentifier	 get Property Index
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_WEIGHT_PROPERTY	TokenNameIdentifier	 CSS  FONT  WEIGHT  PROPERTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fsz	TokenNameIdentifier	 fsz
=	TokenNameEQUAL	
eng	TokenNameIdentifier	 eng
.	TokenNameDOT	
getPropertyIndex	TokenNameIdentifier	 get Property Index
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_SIZE_PROPERTY	TokenNameIdentifier	 CSS  FONT  SIZE  PROPERTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lh	TokenNameIdentifier	 lh
=	TokenNameEQUAL	
eng	TokenNameIdentifier	 eng
.	TokenNameDOT	
getPropertyIndex	TokenNameIdentifier	 get Property Index
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LINE_HEIGHT_PROPERTY	TokenNameIdentifier	 CSS  LINE  HEIGHT  PROPERTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IdentifierManager	TokenNameIdentifier	 Identifier Manager
fstVM	TokenNameIdentifier	 fst VM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IdentifierManager	TokenNameIdentifier	 Identifier Manager
)	TokenNameRPAREN	
vMgrs	TokenNameIdentifier	 v Mgrs
[	TokenNameLBRACKET	
fst	TokenNameIdentifier	 fst
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
IdentifierManager	TokenNameIdentifier	 Identifier Manager
fvVM	TokenNameIdentifier	 fv VM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IdentifierManager	TokenNameIdentifier	 Identifier Manager
)	TokenNameRPAREN	
vMgrs	TokenNameIdentifier	 v Mgrs
[	TokenNameLBRACKET	
fv	TokenNameIdentifier	 fv
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
IdentifierManager	TokenNameIdentifier	 Identifier Manager
fwVM	TokenNameIdentifier	 fw VM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IdentifierManager	TokenNameIdentifier	 Identifier Manager
)	TokenNameRPAREN	
vMgrs	TokenNameIdentifier	 v Mgrs
[	TokenNameLBRACKET	
fw	TokenNameIdentifier	 fw
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
FontSizeManager	TokenNameIdentifier	 Font Size Manager
fszVM	TokenNameIdentifier	 fsz VM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FontSizeManager	TokenNameIdentifier	 Font Size Manager
)	TokenNameRPAREN	
vMgrs	TokenNameIdentifier	 v Mgrs
[	TokenNameLBRACKET	
fsz	TokenNameIdentifier	 fsz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
StringMap	TokenNameIdentifier	 String Map
fstSM	TokenNameIdentifier	 fst SM
=	TokenNameEQUAL	
fstVM	TokenNameIdentifier	 fst VM
.	TokenNameDOT	
getIdentifiers	TokenNameIdentifier	 get Identifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringMap	TokenNameIdentifier	 String Map
fvSM	TokenNameIdentifier	 fv SM
=	TokenNameEQUAL	
fvVM	TokenNameIdentifier	 fv VM
.	TokenNameDOT	
getIdentifiers	TokenNameIdentifier	 get Identifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringMap	TokenNameIdentifier	 String Map
fwSM	TokenNameIdentifier	 fw SM
=	TokenNameEQUAL	
fwVM	TokenNameIdentifier	 fw VM
.	TokenNameDOT	
getIdentifiers	TokenNameIdentifier	 get Identifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringMap	TokenNameIdentifier	 String Map
fszSM	TokenNameIdentifier	 fsz SM
=	TokenNameEQUAL	
fszVM	TokenNameIdentifier	 fsz VM
.	TokenNameDOT	
getIdentifiers	TokenNameIdentifier	 get Identifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check for font-style, font-variant, & font-weight 	TokenNameCOMMENT_LINE	Check for font-style, font-variant, & font-weight 
// These are all optional. 	TokenNameCOMMENT_LINE	These are all optional. 
boolean	TokenNameboolean	
svwDone	TokenNameIdentifier	 svw Done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
intLU	TokenNameIdentifier	 int LU
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
svwDone	TokenNameIdentifier	 svw Done
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fontStyle	TokenNameIdentifier	 font Style
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fstSM	TokenNameIdentifier	 fst SM
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontStyle	TokenNameIdentifier	 font Style
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
intLU	TokenNameIdentifier	 int LU
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fontWeight	TokenNameIdentifier	 font Weight
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontWeight	TokenNameIdentifier	 font Weight
=	TokenNameEQUAL	
intLU	TokenNameIdentifier	 int LU
;	TokenNameSEMICOLON	
intLU	TokenNameIdentifier	 int LU
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createInvalidLexicalUnitDOMException	TokenNameIdentifier	 create Invalid Lexical Unit DOM Exception
(	TokenNameLPAREN	
intLU	TokenNameIdentifier	 int LU
.	TokenNameDOT	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fontVariant	TokenNameIdentifier	 font Variant
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fvSM	TokenNameIdentifier	 fv SM
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontVariant	TokenNameIdentifier	 font Variant
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
intLU	TokenNameIdentifier	 int LU
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fontWeight	TokenNameIdentifier	 font Weight
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontWeight	TokenNameIdentifier	 font Weight
=	TokenNameEQUAL	
intLU	TokenNameIdentifier	 int LU
;	TokenNameSEMICOLON	
intLU	TokenNameIdentifier	 int LU
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createInvalidLexicalUnitDOMException	TokenNameIdentifier	 create Invalid Lexical Unit DOM Exception
(	TokenNameLPAREN	
intLU	TokenNameIdentifier	 int LU
.	TokenNameDOT	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
intLU	TokenNameIdentifier	 int LU
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fontWeight	TokenNameIdentifier	 font Weight
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fwSM	TokenNameIdentifier	 fw SM
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontWeight	TokenNameIdentifier	 font Weight
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
svwDone	TokenNameIdentifier	 svw Done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_INTEGER	TokenNameIdentifier	 SAC  INTEGER
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
intLU	TokenNameIdentifier	 int LU
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fontWeight	TokenNameIdentifier	 font Weight
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
intLU	TokenNameIdentifier	 int LU
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
svwDone	TokenNameIdentifier	 svw Done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// All other must be size,'/line-height', family 	TokenNameCOMMENT_LINE	All other must be size,'/line-height', family 
svwDone	TokenNameIdentifier	 svw Done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
svwDone	TokenNameIdentifier	 svw Done
)	TokenNameRPAREN	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Must have font-size. 	TokenNameCOMMENT_LINE	Must have font-size. 
if	TokenNameif	
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
createMalformedLexicalUnitDOMException	TokenNameIdentifier	 create Malformed Lexical Unit DOM Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now we need to get font-size 	TokenNameCOMMENT_LINE	Now we need to get font-size 
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
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fszSM	TokenNameIdentifier	 fsz SM
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontSize	TokenNameIdentifier	 font Size
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
;	TokenNameSEMICOLON	
// This is a font-size ident. 	TokenNameCOMMENT_LINE	This is a font-size ident. 
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_EM	TokenNameIdentifier	 SAC  EM
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_EX	TokenNameIdentifier	 SAC  EX
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_PIXEL	TokenNameIdentifier	 SAC  PIXEL
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_CENTIMETER	TokenNameIdentifier	 SAC  CENTIMETER
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_MILLIMETER	TokenNameIdentifier	 SAC  MILLIMETER
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_INCH	TokenNameIdentifier	 SAC  INCH
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_POINT	TokenNameIdentifier	 SAC  POINT
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_PICA	TokenNameIdentifier	 SAC  PICA
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_INTEGER	TokenNameIdentifier	 SAC  INTEGER
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_REAL	TokenNameIdentifier	 SAC  REAL
:	TokenNameCOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_PERCENTAGE	TokenNameIdentifier	 SAC  PERCENTAGE
:	TokenNameCOLON	
fontSize	TokenNameIdentifier	 font Size
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
;	TokenNameSEMICOLON	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fontSize	TokenNameIdentifier	 font Size
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We must have a font-size so see if we can use intLU... 	TokenNameCOMMENT_LINE	We must have a font-size so see if we can use intLU... 
if	TokenNameif	
(	TokenNameLPAREN	
intLU	TokenNameIdentifier	 int LU
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontSize	TokenNameIdentifier	 font Size
=	TokenNameEQUAL	
intLU	TokenNameIdentifier	 int LU
;	TokenNameSEMICOLON	
// Yup! 	TokenNameCOMMENT_LINE	Yup! 
intLU	TokenNameIdentifier	 int LU
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
intLU	TokenNameIdentifier	 int LU
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We have a intLU left see if we can use it as font-weight 	TokenNameCOMMENT_LINE	We have a intLU left see if we can use it as font-weight 
if	TokenNameif	
(	TokenNameLPAREN	
fontWeight	TokenNameIdentifier	 font Weight
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontWeight	TokenNameIdentifier	 font Weight
=	TokenNameEQUAL	
intLU	TokenNameIdentifier	 int LU
;	TokenNameSEMICOLON	
// use intLU as font-weight. 	TokenNameCOMMENT_LINE	use intLU as font-weight. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// we have an 'extra' integer in property. 	TokenNameCOMMENT_LINE	we have an 'extra' integer in property. 
throw	TokenNamethrow	
createInvalidLexicalUnitDOMException	TokenNameIdentifier	 create Invalid Lexical Unit DOM Exception
(	TokenNameLPAREN	
intLU	TokenNameIdentifier	 int LU
.	TokenNameDOT	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Must have Font-Family, so if it's null now we are done! 	TokenNameCOMMENT_LINE	Must have Font-Family, so if it's null now we are done! 
if	TokenNameif	
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
createMalformedLexicalUnitDOMException	TokenNameIdentifier	 create Malformed Lexical Unit DOM Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now at this point we want to look for 	TokenNameCOMMENT_LINE	Now at this point we want to look for 
// line-height. 	TokenNameCOMMENT_LINE	line-height. 
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
SAC_OPERATOR_SLASH	TokenNameIdentifier	 SAC  OPERATOR  SLASH
:	TokenNameCOLON	
// we have line-height 	TokenNameCOMMENT_LINE	we have line-height 
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
)	TokenNameRPAREN	
// OOPS! 	TokenNameCOMMENT_LINE	OOPS! 
throw	TokenNamethrow	
createMalformedLexicalUnitDOMException	TokenNameIdentifier	 create Malformed Lexical Unit DOM Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineHeight	TokenNameIdentifier	 line Height
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
;	TokenNameSEMICOLON	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Must have Font-Family, so if it's null now we are done! 	TokenNameCOMMENT_LINE	Must have Font-Family, so if it's null now we are done! 
if	TokenNameif	
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
createMalformedLexicalUnitDOMException	TokenNameIdentifier	 create Malformed Lexical Unit DOM Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontFamily	TokenNameIdentifier	 font Family
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fontStyle	TokenNameIdentifier	 font Style
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fontStyle	TokenNameIdentifier	 font Style
=	TokenNameEQUAL	
NORMAL_LU	TokenNameIdentifier	 NORMAL  LU
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fontVariant	TokenNameIdentifier	 font Variant
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fontVariant	TokenNameIdentifier	 font Variant
=	TokenNameEQUAL	
NORMAL_LU	TokenNameIdentifier	 NORMAL  LU
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fontWeight	TokenNameIdentifier	 font Weight
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fontWeight	TokenNameIdentifier	 font Weight
=	TokenNameEQUAL	
NORMAL_LU	TokenNameIdentifier	 NORMAL  LU
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lineHeight	TokenNameIdentifier	 line Height
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
lineHeight	TokenNameIdentifier	 line Height
=	TokenNameEQUAL	
NORMAL_LU	TokenNameIdentifier	 NORMAL  LU
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_FAMILY_PROPERTY	TokenNameIdentifier	 CSS  FONT  FAMILY  PROPERTY
,	TokenNameCOMMA	
fontFamily	TokenNameIdentifier	 font Family
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_STYLE_PROPERTY	TokenNameIdentifier	 CSS  FONT  STYLE  PROPERTY
,	TokenNameCOMMA	
fontStyle	TokenNameIdentifier	 font Style
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_VARIANT_PROPERTY	TokenNameIdentifier	 CSS  FONT  VARIANT  PROPERTY
,	TokenNameCOMMA	
fontVariant	TokenNameIdentifier	 font Variant
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_WEIGHT_PROPERTY	TokenNameIdentifier	 CSS  FONT  WEIGHT  PROPERTY
,	TokenNameCOMMA	
fontWeight	TokenNameIdentifier	 font Weight
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FONT_SIZE_PROPERTY	TokenNameIdentifier	 CSS  FONT  SIZE  PROPERTY
,	TokenNameCOMMA	
fontSize	TokenNameIdentifier	 font Size
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lh	TokenNameIdentifier	 lh
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LINE_HEIGHT_PROPERTY	TokenNameIdentifier	 CSS  LINE  HEIGHT  PROPERTY
,	TokenNameCOMMA	
lineHeight	TokenNameIdentifier	 line Height
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
