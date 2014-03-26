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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GraphicsEnvironment	TokenNameIdentifier	 Graphics Environment
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
/** * The is a utility class that is used for resolving UnresolvedFontFamilies. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: FontFamilyResolver.java 582434 2007-10-06 02:11:51Z cam $ */	TokenNameCOMMENT_JAVADOC	 The is a utility class that is used for resolving UnresolvedFontFamilies. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: FontFamilyResolver.java 582434 2007-10-06 02:11:51Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
FontFamilyResolver	TokenNameIdentifier	 Font Family Resolver
{	TokenNameLBRACE	
/** * The default font. This will be used when no font families can * be resolved for a particular text chunk/run. */	TokenNameCOMMENT_JAVADOC	 The default font. This will be used when no font families can be resolved for a particular text chunk/run. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AWTFontFamily	TokenNameIdentifier	 AWT Font Family
defaultFont	TokenNameIdentifier	 default Font
=	TokenNameEQUAL	
new	TokenNamenew	
AWTFontFamily	TokenNameIdentifier	 AWT Font Family
(	TokenNameLPAREN	
"SansSerif"	TokenNameStringLiteral	SansSerif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * List of all available fonts on the current system, plus a few common * alternatives. */	TokenNameCOMMENT_JAVADOC	 List of all available fonts on the current system, plus a few common alternatives. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
fonts	TokenNameIdentifier	 fonts
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
awtFontFamilies	TokenNameIdentifier	 awt Font Families
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
awtFonts	TokenNameIdentifier	 awt Fonts
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This sets up the list of available fonts. */	TokenNameCOMMENT_JAVADOC	 This sets up the list of available fonts. 
static	TokenNamestatic	
{	TokenNameLBRACE	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"sans-serif"	TokenNameStringLiteral	sans-serif
,	TokenNameCOMMA	
"SansSerif"	TokenNameStringLiteral	SansSerif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"serif"	TokenNameStringLiteral	serif
,	TokenNameCOMMA	
"Serif"	TokenNameStringLiteral	Serif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"times"	TokenNameStringLiteral	times
,	TokenNameCOMMA	
"Serif"	TokenNameStringLiteral	Serif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"times new roman"	TokenNameStringLiteral	times new roman
,	TokenNameCOMMA	
"Serif"	TokenNameStringLiteral	Serif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"cursive"	TokenNameStringLiteral	cursive
,	TokenNameCOMMA	
"Dialog"	TokenNameStringLiteral	Dialog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"fantasy"	TokenNameStringLiteral	fantasy
,	TokenNameCOMMA	
"Symbol"	TokenNameStringLiteral	Symbol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"monospace"	TokenNameStringLiteral	monospace
,	TokenNameCOMMA	
"Monospaced"	TokenNameStringLiteral	Monospaced
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"monospaced"	TokenNameStringLiteral	monospaced
,	TokenNameCOMMA	
"Monospaced"	TokenNameStringLiteral	Monospaced
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"courier"	TokenNameStringLiteral	courier
,	TokenNameCOMMA	
"Monospaced"	TokenNameStringLiteral	Monospaced
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Load all fonts. Work around 	TokenNameCOMMENT_LINE	Load all fonts. Work around 
// 	TokenNameCOMMENT_LINE	 
GraphicsEnvironment	TokenNameIdentifier	 Graphics Environment
env	TokenNameIdentifier	 env
;	TokenNameSEMICOLON	
env	TokenNameIdentifier	 env
=	TokenNameEQUAL	
GraphicsEnvironment	TokenNameIdentifier	 Graphics Environment
.	TokenNameDOT	
getLocalGraphicsEnvironment	TokenNameIdentifier	 get Local Graphics Environment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fontNames	TokenNameIdentifier	 font Names
=	TokenNameEQUAL	
env	TokenNameIdentifier	 env
.	TokenNameDOT	
getAvailableFontFamilyNames	TokenNameIdentifier	 get Available Font Family Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nFonts	TokenNameIdentifier	 n Fonts
=	TokenNameEQUAL	
fontNames	TokenNameIdentifier	 font Names
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
fontNames	TokenNameIdentifier	 font Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nFonts	TokenNameIdentifier	 n Fonts
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fontNames	TokenNameIdentifier	 font Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fontNames	TokenNameIdentifier	 font Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// also add the font name with the spaces removed 	TokenNameCOMMENT_LINE	also add the font name with the spaces removed 
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
fontNames	TokenNameIdentifier	 font Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fontNameWithoutSpaces	TokenNameIdentifier	 font Name Without Spaces
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fontNameWithoutSpaces	TokenNameIdentifier	 font Name Without Spaces
+=	TokenNamePLUS_EQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fontNameWithoutSpaces	TokenNameIdentifier	 font Name Without Spaces
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fontNames	TokenNameIdentifier	 font Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// also add the font name with spaces replaced by dashes 	TokenNameCOMMENT_LINE	also add the font name with spaces replaced by dashes 
String	TokenNameIdentifier	 String
fontNameWithDashes	TokenNameIdentifier	 font Name With Dashes
=	TokenNameEQUAL	
fontNames	TokenNameIdentifier	 font Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fontNameWithDashes	TokenNameIdentifier	 font Name With Dashes
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fontNames	TokenNameIdentifier	 font Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fontNameWithDashes	TokenNameIdentifier	 font Name With Dashes
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fontNames	TokenNameIdentifier	 font Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// first add the default font 	TokenNameCOMMENT_LINE	first add the default font 
awtFontFamilies	TokenNameIdentifier	 awt Font Families
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
defaultFont	TokenNameIdentifier	 default Font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
awtFonts	TokenNameIdentifier	 awt Fonts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
(	TokenNameLPAREN	
defaultFont	TokenNameIdentifier	 default Font
.	TokenNameDOT	
getFamilyName	TokenNameIdentifier	 get Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collection	TokenNameIdentifier	 Collection
fontValues	TokenNameIdentifier	 font Values
=	TokenNameEQUAL	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
fontValues	TokenNameIdentifier	 font Values
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fontFamily	TokenNameIdentifier	 font Family
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AWTFontFamily	TokenNameIdentifier	 AWT Font Family
awtFontFamily	TokenNameIdentifier	 awt Font Family
=	TokenNameEQUAL	
new	TokenNamenew	
AWTFontFamily	TokenNameIdentifier	 AWT Font Family
(	TokenNameLPAREN	
fontFamily	TokenNameIdentifier	 font Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
awtFontFamilies	TokenNameIdentifier	 awt Font Families
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
awtFontFamily	TokenNameIdentifier	 awt Font Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
new	TokenNamenew	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
(	TokenNameLPAREN	
fontFamily	TokenNameIdentifier	 font Family
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
awtFonts	TokenNameIdentifier	 awt Fonts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This keeps track of all the resolved font families. This is to hopefully * reduce the number of font family objects used. */	TokenNameCOMMENT_JAVADOC	 This keeps track of all the resolved font families. This is to hopefully reduce the number of font family objects used. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
resolvedFontFamilies	TokenNameIdentifier	 resolved Font Families
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Looks up a font family name and returns the platform name * for the font. * * @param familyName The Font Family name to resolve * * @return The platform name for the font or null if it can't be found. */	TokenNameCOMMENT_JAVADOC	 Looks up a font family name and returns the platform name for the font. * @param familyName The Font Family name to resolve * @return The platform name for the font or null if it can't be found. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
familyName	TokenNameIdentifier	 family Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
familyName	TokenNameIdentifier	 family Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resolves a font family name into a GVTFontFamily. If the font * family cannot be resolved then null will be returned. * * @param familyName The Font Family name to resolve * * @return A resolved GVTFontFamily or null if the font family could not * be resolved. */	TokenNameCOMMENT_JAVADOC	 Resolves a font family name into a GVTFontFamily. If the font family cannot be resolved then null will be returned. * @param familyName The Font Family name to resolve * @return A resolved GVTFontFamily or null if the font family could not be resolved. 
public	TokenNamepublic	
static	TokenNamestatic	
GVTFontFamily	TokenNameIdentifier	 GVT Font Family
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
familyName	TokenNameIdentifier	 family Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
familyName	TokenNameIdentifier	 family Name
=	TokenNameEQUAL	
familyName	TokenNameIdentifier	 family Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// first see if this font family has already been resolved 	TokenNameCOMMENT_LINE	first see if this font family has already been resolved 
GVTFontFamily	TokenNameIdentifier	 GVT Font Family
resolvedFF	TokenNameIdentifier	 resolved FF
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GVTFontFamily	TokenNameIdentifier	 GVT Font Family
)	TokenNameRPAREN	
resolvedFontFamilies	TokenNameIdentifier	 resolved Font Families
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
familyName	TokenNameIdentifier	 family Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resolvedFF	TokenNameIdentifier	 resolved FF
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// hasn't been resolved yet 	TokenNameCOMMENT_LINE	hasn't been resolved yet 
// try to find a matching family name in the list of 	TokenNameCOMMENT_LINE	try to find a matching family name in the list of 
// available fonts 	TokenNameCOMMENT_LINE	available fonts 
String	TokenNameIdentifier	 String
awtFamilyName	TokenNameIdentifier	 awt Family Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fonts	TokenNameIdentifier	 fonts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
familyName	TokenNameIdentifier	 family Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
awtFamilyName	TokenNameIdentifier	 awt Family Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resolvedFF	TokenNameIdentifier	 resolved FF
=	TokenNameEQUAL	
new	TokenNamenew	
AWTFontFamily	TokenNameIdentifier	 AWT Font Family
(	TokenNameLPAREN	
awtFamilyName	TokenNameIdentifier	 awt Family Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
resolvedFontFamilies	TokenNameIdentifier	 resolved Font Families
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
familyName	TokenNameIdentifier	 family Name
,	TokenNameCOMMA	
resolvedFF	TokenNameIdentifier	 resolved FF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if (resolvedFF != null) { 	TokenNameCOMMENT_LINE	if (resolvedFF != null) { 
// System.out.println("resolved " + fontFamily.getFamilyName() + 	TokenNameCOMMENT_LINE	System.out.println("resolved " + fontFamily.getFamilyName() + 
// " to " + resolvedFF.getFamilyName()); 	TokenNameCOMMENT_LINE	" to " + resolvedFF.getFamilyName()); 
// } else { 	TokenNameCOMMENT_LINE	} else { 
// System.out.println("could not resolve " + 	TokenNameCOMMENT_LINE	System.out.println("could not resolve " + 
// fontFamily.getFamilyName()); 	TokenNameCOMMENT_LINE	fontFamily.getFamilyName()); 
// } 	TokenNameCOMMENT_LINE	} 
return	TokenNamereturn	
resolvedFF	TokenNameIdentifier	 resolved FF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resolves an UnresolvedFontFamily into a GVTFontFamily. If the font * family cannot be resolved then null will be returned. * * @param fontFamily The UnresolvedFontFamily to resolve * * @return A resolved GVTFontFamily or null if the font family could not * be resolved. */	TokenNameCOMMENT_JAVADOC	 Resolves an UnresolvedFontFamily into a GVTFontFamily. If the font family cannot be resolved then null will be returned. * @param fontFamily The UnresolvedFontFamily to resolve * @return A resolved GVTFontFamily or null if the font family could not be resolved. 
public	TokenNamepublic	
static	TokenNamestatic	
GVTFontFamily	TokenNameIdentifier	 GVT Font Family
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
UnresolvedFontFamily	TokenNameIdentifier	 Unresolved Font Family
fontFamily	TokenNameIdentifier	 font Family
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
fontFamily	TokenNameIdentifier	 font Family
.	TokenNameDOT	
getFamilyName	TokenNameIdentifier	 get Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
GVTFontFamily	TokenNameIdentifier	 GVT Font Family
getFamilyThatCanDisplay	TokenNameIdentifier	 get Family That Can Display
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
awtFontFamilies	TokenNameIdentifier	 awt Font Families
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AWTFontFamily	TokenNameIdentifier	 AWT Font Family
fontFamily	TokenNameIdentifier	 font Family
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AWTFontFamily	TokenNameIdentifier	 AWT Font Family
)	TokenNameRPAREN	
awtFontFamilies	TokenNameIdentifier	 awt Font Families
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
)	TokenNameRPAREN	
awtFonts	TokenNameIdentifier	 awt Fonts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
canDisplay	TokenNameIdentifier	 can Display
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fontFamily	TokenNameIdentifier	 font Family
.	TokenNameDOT	
getFamilyName	TokenNameIdentifier	 get Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Song"	TokenNameStringLiteral	Song
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the awt font for "MS Song" doesn't display chinese glyphs correctly 	TokenNameCOMMENT_LINE	the awt font for "MS Song" doesn't display chinese glyphs correctly 
return	TokenNamereturn	
fontFamily	TokenNameIdentifier	 font Family
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
