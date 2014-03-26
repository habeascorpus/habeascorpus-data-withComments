/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
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
SVGConstants	TokenNameIdentifier	 SVG Constants
;	TokenNameSEMICOLON	
/** * One line Class Desc * * Complete Class Desc * * @author <a href="mailto:deweese@apache.org">l449433</a> * @version $Id: GVTFontFace.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 One line Class Desc * Complete Class Desc * @author <a href="mailto:deweese@apache.org">l449433</a> @version $Id: GVTFontFace.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GVTFontFace	TokenNameIdentifier	 GVT Font Face
implements	TokenNameimplements	
SVGConstants	TokenNameIdentifier	 SVG Constants
{	TokenNameLBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
familyName	TokenNameIdentifier	 family Name
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
unitsPerEm	TokenNameIdentifier	 units Per Em
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fontWeight	TokenNameIdentifier	 font Weight
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fontStyle	TokenNameIdentifier	 font Style
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fontVariant	TokenNameIdentifier	 font Variant
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fontStretch	TokenNameIdentifier	 font Stretch
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
slope	TokenNameIdentifier	 slope
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
panose1	TokenNameIdentifier	 panose1
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
ascent	TokenNameIdentifier	 ascent
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
descent	TokenNameIdentifier	 descent
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
strikethroughPosition	TokenNameIdentifier	 strikethrough Position
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
underlinePosition	TokenNameIdentifier	 underline Position
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
underlineThickness	TokenNameIdentifier	 underline Thickness
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
overlinePosition	TokenNameIdentifier	 overline Position
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
overlineThickness	TokenNameIdentifier	 overline Thickness
;	TokenNameSEMICOLON	
/** * Constructes an GVTFontFace with the specfied font-face attributes. */	TokenNameCOMMENT_JAVADOC	 Constructes an GVTFontFace with the specfied font-face attributes. 
public	TokenNamepublic	
GVTFontFace	TokenNameIdentifier	 GVT Font Face
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
familyName	TokenNameIdentifier	 family Name
,	TokenNameCOMMA	
float	TokenNamefloat	
unitsPerEm	TokenNameIdentifier	 units Per Em
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fontWeight	TokenNameIdentifier	 font Weight
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fontStyle	TokenNameIdentifier	 font Style
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fontVariant	TokenNameIdentifier	 font Variant
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fontStretch	TokenNameIdentifier	 font Stretch
,	TokenNameCOMMA	
float	TokenNamefloat	
slope	TokenNameIdentifier	 slope
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
panose1	TokenNameIdentifier	 panose1
,	TokenNameCOMMA	
float	TokenNamefloat	
ascent	TokenNameIdentifier	 ascent
,	TokenNameCOMMA	
float	TokenNamefloat	
descent	TokenNameIdentifier	 descent
,	TokenNameCOMMA	
float	TokenNamefloat	
strikethroughPosition	TokenNameIdentifier	 strikethrough Position
,	TokenNameCOMMA	
float	TokenNamefloat	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
,	TokenNameCOMMA	
float	TokenNamefloat	
underlinePosition	TokenNameIdentifier	 underline Position
,	TokenNameCOMMA	
float	TokenNamefloat	
underlineThickness	TokenNameIdentifier	 underline Thickness
,	TokenNameCOMMA	
float	TokenNamefloat	
overlinePosition	TokenNameIdentifier	 overline Position
,	TokenNameCOMMA	
float	TokenNamefloat	
overlineThickness	TokenNameIdentifier	 overline Thickness
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
familyName	TokenNameIdentifier	 family Name
=	TokenNameEQUAL	
familyName	TokenNameIdentifier	 family Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
unitsPerEm	TokenNameIdentifier	 units Per Em
=	TokenNameEQUAL	
unitsPerEm	TokenNameIdentifier	 units Per Em
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fontWeight	TokenNameIdentifier	 font Weight
=	TokenNameEQUAL	
fontWeight	TokenNameIdentifier	 font Weight
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fontStyle	TokenNameIdentifier	 font Style
=	TokenNameEQUAL	
fontStyle	TokenNameIdentifier	 font Style
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fontVariant	TokenNameIdentifier	 font Variant
=	TokenNameEQUAL	
fontVariant	TokenNameIdentifier	 font Variant
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fontStretch	TokenNameIdentifier	 font Stretch
=	TokenNameEQUAL	
fontStretch	TokenNameIdentifier	 font Stretch
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
slope	TokenNameIdentifier	 slope
=	TokenNameEQUAL	
slope	TokenNameIdentifier	 slope
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
panose1	TokenNameIdentifier	 panose1
=	TokenNameEQUAL	
panose1	TokenNameIdentifier	 panose1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ascent	TokenNameIdentifier	 ascent
=	TokenNameEQUAL	
ascent	TokenNameIdentifier	 ascent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
descent	TokenNameIdentifier	 descent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughPosition	TokenNameIdentifier	 strikethrough Position
=	TokenNameEQUAL	
strikethroughPosition	TokenNameIdentifier	 strikethrough Position
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
=	TokenNameEQUAL	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlinePosition	TokenNameIdentifier	 underline Position
=	TokenNameEQUAL	
underlinePosition	TokenNameIdentifier	 underline Position
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlineThickness	TokenNameIdentifier	 underline Thickness
=	TokenNameEQUAL	
underlineThickness	TokenNameIdentifier	 underline Thickness
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlinePosition	TokenNameIdentifier	 overline Position
=	TokenNameEQUAL	
overlinePosition	TokenNameIdentifier	 overline Position
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlineThickness	TokenNameIdentifier	 overline Thickness
=	TokenNameEQUAL	
overlineThickness	TokenNameIdentifier	 overline Thickness
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an SVGFontFace with default values for all the * font-face attributes other than familyName */	TokenNameCOMMENT_JAVADOC	 Constructs an SVGFontFace with default values for all the font-face attributes other than familyName 
public	TokenNamepublic	
GVTFontFace	TokenNameIdentifier	 GVT Font Face
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
familyName	TokenNameIdentifier	 family Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
familyName	TokenNameIdentifier	 family Name
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SVG_FONT_FACE_FONT_WEIGHT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  FONT  WEIGHT  DEFAULT  VALUE
,	TokenNameCOMMA	
SVG_FONT_FACE_FONT_STYLE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  FONT  STYLE  DEFAULT  VALUE
,	TokenNameCOMMA	
SVG_FONT_FACE_FONT_VARIANT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  FONT  VARIANT  DEFAULT  VALUE
,	TokenNameCOMMA	
SVG_FONT_FACE_FONT_STRETCH_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  FONT  STRETCH  DEFAULT  VALUE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SVG_FONT_FACE_PANOSE_1_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  PANOSE 1  DEFAULT  VALUE
,	TokenNameCOMMA	
800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
300	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
75	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the family name of this font, it may contain more than one. */	TokenNameCOMMENT_JAVADOC	 Returns the family name of this font, it may contain more than one. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFamilyName	TokenNameIdentifier	 get Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
familyName	TokenNameIdentifier	 family Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasFamilyName	TokenNameIdentifier	 has Family Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
family	TokenNameIdentifier	 family
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ffname	TokenNameIdentifier	 ffname
=	TokenNameEQUAL	
familyName	TokenNameIdentifier	 family Name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ffname	TokenNameIdentifier	 ffname
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ffname	TokenNameIdentifier	 ffname
=	TokenNameEQUAL	
ffname	TokenNameIdentifier	 ffname
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
ffname	TokenNameIdentifier	 ffname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// see if the family name is not the part of a bigger family name. 	TokenNameCOMMENT_LINE	see if the family name is not the part of a bigger family name. 
if	TokenNameif	
(	TokenNameLPAREN	
ffname	TokenNameIdentifier	 ffname
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
quote	TokenNameIdentifier	 quote
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
ffname	TokenNameIdentifier	 ffname
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ffname	TokenNameIdentifier	 ffname
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
quote	TokenNameIdentifier	 quote
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
quote	TokenNameIdentifier	 quote
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
','	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
ffname	TokenNameIdentifier	 ffname
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
ffname	TokenNameIdentifier	 ffname
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ffname	TokenNameIdentifier	 ffname
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ffname	TokenNameIdentifier	 ffname
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
quote	TokenNameIdentifier	 quote
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\''	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
quote	TokenNameIdentifier	 quote
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
','	TokenNameCharacterLiteral	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the font-weight. */	TokenNameCOMMENT_JAVADOC	 Returns the font-weight. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFontWeight	TokenNameIdentifier	 get Font Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fontWeight	TokenNameIdentifier	 font Weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the font-style. */	TokenNameCOMMENT_JAVADOC	 Returns the font-style. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFontStyle	TokenNameIdentifier	 get Font Style
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fontStyle	TokenNameIdentifier	 font Style
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of coordinate units on the em square for this font. */	TokenNameCOMMENT_JAVADOC	 The number of coordinate units on the em square for this font. 
public	TokenNamepublic	
float	TokenNamefloat	
getUnitsPerEm	TokenNameIdentifier	 get Units Per Em
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
unitsPerEm	TokenNameIdentifier	 units Per Em
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the maximum unaccented height of the font within the font * coordinate system. */	TokenNameCOMMENT_JAVADOC	 Returns the maximum unaccented height of the font within the font coordinate system. 
public	TokenNamepublic	
float	TokenNamefloat	
getAscent	TokenNameIdentifier	 get Ascent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ascent	TokenNameIdentifier	 ascent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the maximum unaccented depth of the font within the font * coordinate system. */	TokenNameCOMMENT_JAVADOC	 Returns the maximum unaccented depth of the font within the font coordinate system. 
public	TokenNamepublic	
float	TokenNamefloat	
getDescent	TokenNameIdentifier	 get Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
descent	TokenNameIdentifier	 descent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position of the strikethrough decoration. */	TokenNameCOMMENT_JAVADOC	 Returns the position of the strikethrough decoration. 
public	TokenNamepublic	
float	TokenNamefloat	
getStrikethroughPosition	TokenNameIdentifier	 get Strikethrough Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
strikethroughPosition	TokenNameIdentifier	 strikethrough Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the stroke thickness to use when drawing a strikethrough. */	TokenNameCOMMENT_JAVADOC	 Returns the stroke thickness to use when drawing a strikethrough. 
public	TokenNamepublic	
float	TokenNamefloat	
getStrikethroughThickness	TokenNameIdentifier	 get Strikethrough Thickness
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position of the underline decoration. */	TokenNameCOMMENT_JAVADOC	 Returns the position of the underline decoration. 
public	TokenNamepublic	
float	TokenNamefloat	
getUnderlinePosition	TokenNameIdentifier	 get Underline Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
underlinePosition	TokenNameIdentifier	 underline Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the stroke thickness to use when drawing a underline. */	TokenNameCOMMENT_JAVADOC	 Returns the stroke thickness to use when drawing a underline. 
public	TokenNamepublic	
float	TokenNamefloat	
getUnderlineThickness	TokenNameIdentifier	 get Underline Thickness
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
underlineThickness	TokenNameIdentifier	 underline Thickness
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position of the overline decoration. */	TokenNameCOMMENT_JAVADOC	 Returns the position of the overline decoration. 
public	TokenNamepublic	
float	TokenNamefloat	
getOverlinePosition	TokenNameIdentifier	 get Overline Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
overlinePosition	TokenNameIdentifier	 overline Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the stroke thickness to use when drawing a overline. */	TokenNameCOMMENT_JAVADOC	 Returns the stroke thickness to use when drawing a overline. 
public	TokenNamepublic	
float	TokenNamefloat	
getOverlineThickness	TokenNameIdentifier	 get Overline Thickness
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
overlineThickness	TokenNameIdentifier	 overline Thickness
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
