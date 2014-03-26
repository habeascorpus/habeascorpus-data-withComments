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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * The Kern class describes an entry in the "kerning table". It provides * a kerning value to be used when laying out characters side * by side. It may be used for either horizontal or vertical kerning. * * @author <a href="mailto:dean.jackson@cmis.csiro.au">Dean Jackson</a> * @version $Id: Kern.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 The Kern class describes an entry in the "kerning table". It provides a kerning value to be used when laying out characters side by side. It may be used for either horizontal or vertical kerning. * @author <a href="mailto:dean.jackson@cmis.csiro.au">Dean Jackson</a> @version $Id: Kern.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
Kern	TokenNameIdentifier	 Kern
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
firstGlyphCodes	TokenNameIdentifier	 first Glyph Codes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
secondGlyphCodes	TokenNameIdentifier	 second Glyph Codes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
UnicodeRange	TokenNameIdentifier	 Unicode Range
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
firstUnicodeRanges	TokenNameIdentifier	 first Unicode Ranges
;	TokenNameSEMICOLON	
private	TokenNameprivate	
UnicodeRange	TokenNameIdentifier	 Unicode Range
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
secondUnicodeRanges	TokenNameIdentifier	 second Unicode Ranges
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
kerningAdjust	TokenNameIdentifier	 kerning Adjust
;	TokenNameSEMICOLON	
/** * Creates a Kern object with the given glyph arrays * and kerning value. The first and second sets of glyphs for this kerning * entry consist of the union of glyphs in the glyph code arrays and the * unicode ranges. * * @param firstGlyphCodes An array of glyph codes that are part of the first * set of glyphs in this kerning entry. * @param secondGlyphCodes An array of glyph codes that are part of the * second set of glyphs in this kerning entry. * @param firstUnicodeRanges An array of unicode ranges that are part of the * first set of glyphs in this kerning entry. * @param secondUnicodeRanges An array of unicode ranges that are part of * the second set of glyphs in this kerning entry. * @param adjustValue The kerning adjustment (positive value means the space * between glyphs should decrease). */	TokenNameCOMMENT_JAVADOC	 Creates a Kern object with the given glyph arrays and kerning value. The first and second sets of glyphs for this kerning entry consist of the union of glyphs in the glyph code arrays and the unicode ranges. * @param firstGlyphCodes An array of glyph codes that are part of the first set of glyphs in this kerning entry. @param secondGlyphCodes An array of glyph codes that are part of the second set of glyphs in this kerning entry. @param firstUnicodeRanges An array of unicode ranges that are part of the first set of glyphs in this kerning entry. @param secondUnicodeRanges An array of unicode ranges that are part of the second set of glyphs in this kerning entry. @param adjustValue The kerning adjustment (positive value means the space between glyphs should decrease). 
public	TokenNamepublic	
Kern	TokenNameIdentifier	 Kern
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
firstGlyphCodes	TokenNameIdentifier	 first Glyph Codes
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
secondGlyphCodes	TokenNameIdentifier	 second Glyph Codes
,	TokenNameCOMMA	
UnicodeRange	TokenNameIdentifier	 Unicode Range
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
firstUnicodeRanges	TokenNameIdentifier	 first Unicode Ranges
,	TokenNameCOMMA	
UnicodeRange	TokenNameIdentifier	 Unicode Range
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
secondUnicodeRanges	TokenNameIdentifier	 second Unicode Ranges
,	TokenNameCOMMA	
float	TokenNamefloat	
adjustValue	TokenNameIdentifier	 adjust Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
firstGlyphCodes	TokenNameIdentifier	 first Glyph Codes
=	TokenNameEQUAL	
firstGlyphCodes	TokenNameIdentifier	 first Glyph Codes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
secondGlyphCodes	TokenNameIdentifier	 second Glyph Codes
=	TokenNameEQUAL	
secondGlyphCodes	TokenNameIdentifier	 second Glyph Codes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
firstUnicodeRanges	TokenNameIdentifier	 first Unicode Ranges
=	TokenNameEQUAL	
firstUnicodeRanges	TokenNameIdentifier	 first Unicode Ranges
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
secondUnicodeRanges	TokenNameIdentifier	 second Unicode Ranges
=	TokenNameEQUAL	
secondUnicodeRanges	TokenNameIdentifier	 second Unicode Ranges
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
kerningAdjust	TokenNameIdentifier	 kerning Adjust
=	TokenNameEQUAL	
adjustValue	TokenNameIdentifier	 adjust Value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstGlyphCodes	TokenNameIdentifier	 first Glyph Codes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
firstGlyphCodes	TokenNameIdentifier	 first Glyph Codes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
secondGlyphCodes	TokenNameIdentifier	 second Glyph Codes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
secondGlyphCodes	TokenNameIdentifier	 second Glyph Codes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the specified glyph is one of the glyphs considered * as first by this kerning entry. Returns false otherwise. * * @param glyphCode The id of the glyph to test. * @param glyphUnicode The unicode value of the glyph to test. * @return True if this glyph is in the list of first glyphs for * the kerning entry */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified glyph is one of the glyphs considered as first by this kerning entry. Returns false otherwise. * @param glyphCode The id of the glyph to test. @param glyphUnicode The unicode value of the glyph to test. @return True if this glyph is in the list of first glyphs for the kerning entry 
public	TokenNamepublic	
boolean	TokenNameboolean	
matchesFirstGlyph	TokenNameIdentifier	 matches First Glyph
(	TokenNameLPAREN	
int	TokenNameint	
glyphCode	TokenNameIdentifier	 glyph Code
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
glyphUnicode	TokenNameIdentifier	 glyph Unicode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstGlyphCodes	TokenNameIdentifier	 first Glyph Codes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
firstGlyphCodes	TokenNameIdentifier	 first Glyph Codes
,	TokenNameCOMMA	
glyphCode	TokenNameIdentifier	 glyph Code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glyphUnicode	TokenNameIdentifier	 glyph Unicode
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
char	TokenNamechar	
glyphChar	TokenNameIdentifier	 glyph Char
=	TokenNameEQUAL	
glyphUnicode	TokenNameIdentifier	 glyph Unicode
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
firstUnicodeRanges	TokenNameIdentifier	 first Unicode Ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstUnicodeRanges	TokenNameIdentifier	 first Unicode Ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
glyphChar	TokenNameIdentifier	 glyph Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the specified glyph is one of the glyphs considered * as first by this kerning entry. Returns false otherwise. * * @param glyphCode The id of the glyph to test. * @param glyphUnicode The unicode value of the glyph to test. * @return True if this glyph is in the list of first glyphs for * the kerning entry */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified glyph is one of the glyphs considered as first by this kerning entry. Returns false otherwise. * @param glyphCode The id of the glyph to test. @param glyphUnicode The unicode value of the glyph to test. @return True if this glyph is in the list of first glyphs for the kerning entry 
public	TokenNamepublic	
boolean	TokenNameboolean	
matchesFirstGlyph	TokenNameIdentifier	 matches First Glyph
(	TokenNameLPAREN	
int	TokenNameint	
glyphCode	TokenNameIdentifier	 glyph Code
,	TokenNameCOMMA	
char	TokenNamechar	
glyphUnicode	TokenNameIdentifier	 glyph Unicode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstGlyphCodes	TokenNameIdentifier	 first Glyph Codes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
firstGlyphCodes	TokenNameIdentifier	 first Glyph Codes
,	TokenNameCOMMA	
glyphCode	TokenNameIdentifier	 glyph Code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
firstUnicodeRanges	TokenNameIdentifier	 first Unicode Ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstUnicodeRanges	TokenNameIdentifier	 first Unicode Ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
glyphUnicode	TokenNameIdentifier	 glyph Unicode
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the specified glyph is one of the glyphs considered * as second by this kerning entry. Returns false otherwise. * * @param glyphCode The id of the glyph to test. * @param glyphUnicode The unicode value of the glyph to test. * @return True if this glyph is in the list of second glyphs for the * kerning entry */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified glyph is one of the glyphs considered as second by this kerning entry. Returns false otherwise. * @param glyphCode The id of the glyph to test. @param glyphUnicode The unicode value of the glyph to test. @return True if this glyph is in the list of second glyphs for the kerning entry 
public	TokenNamepublic	
boolean	TokenNameboolean	
matchesSecondGlyph	TokenNameIdentifier	 matches Second Glyph
(	TokenNameLPAREN	
int	TokenNameint	
glyphCode	TokenNameIdentifier	 glyph Code
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
glyphUnicode	TokenNameIdentifier	 glyph Unicode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
secondGlyphCodes	TokenNameIdentifier	 second Glyph Codes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
secondGlyphCodes	TokenNameIdentifier	 second Glyph Codes
,	TokenNameCOMMA	
glyphCode	TokenNameIdentifier	 glyph Code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glyphUnicode	TokenNameIdentifier	 glyph Unicode
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
char	TokenNamechar	
glyphChar	TokenNameIdentifier	 glyph Char
=	TokenNameEQUAL	
glyphUnicode	TokenNameIdentifier	 glyph Unicode
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
secondUnicodeRanges	TokenNameIdentifier	 second Unicode Ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
secondUnicodeRanges	TokenNameIdentifier	 second Unicode Ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
glyphChar	TokenNameIdentifier	 glyph Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the specified glyph is one of the glyphs considered * as second by this kerning entry. Returns false otherwise. * * @param glyphCode The id of the glyph to test. * @param glyphUnicode The unicode value of the glyph to test. * @return True if this glyph is in the list of second glyphs for the * kerning entry */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified glyph is one of the glyphs considered as second by this kerning entry. Returns false otherwise. * @param glyphCode The id of the glyph to test. @param glyphUnicode The unicode value of the glyph to test. @return True if this glyph is in the list of second glyphs for the kerning entry 
public	TokenNamepublic	
boolean	TokenNameboolean	
matchesSecondGlyph	TokenNameIdentifier	 matches Second Glyph
(	TokenNameLPAREN	
int	TokenNameint	
glyphCode	TokenNameIdentifier	 glyph Code
,	TokenNameCOMMA	
char	TokenNamechar	
glyphUnicode	TokenNameIdentifier	 glyph Unicode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
secondGlyphCodes	TokenNameIdentifier	 second Glyph Codes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
secondGlyphCodes	TokenNameIdentifier	 second Glyph Codes
,	TokenNameCOMMA	
glyphCode	TokenNameIdentifier	 glyph Code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
secondUnicodeRanges	TokenNameIdentifier	 second Unicode Ranges
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
secondUnicodeRanges	TokenNameIdentifier	 second Unicode Ranges
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
glyphUnicode	TokenNameIdentifier	 glyph Unicode
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the kerning adjustment value for this kerning entry (a positive * value means the space between characters should decrease). * * @return The kerning adjustment for this kerning entry. */	TokenNameCOMMENT_JAVADOC	 Returns the kerning adjustment value for this kerning entry (a positive value means the space between characters should decrease). * @return The kerning adjustment for this kerning entry. 
public	TokenNamepublic	
float	TokenNamefloat	
getAdjustValue	TokenNameIdentifier	 get Adjust Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
kerningAdjust	TokenNameIdentifier	 kerning Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
