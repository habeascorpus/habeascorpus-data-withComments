/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
Kern	TokenNameIdentifier	 Kern
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
UnicodeRange	TokenNameIdentifier	 Unicode Range
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * A base Bridge class for the kerning elements. * * @author <a href="mailto:dean.jackson@cmis.csiro.au">Dean Jackson</a> * @version $Id: SVGKernElementBridge.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A base Bridge class for the kerning elements. * @author <a href="mailto:dean.jackson@cmis.csiro.au">Dean Jackson</a> @version $Id: SVGKernElementBridge.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SVGKernElementBridge	TokenNameIdentifier	 SVG Kern Element Bridge
extends	TokenNameextends	
AbstractSVGBridge	TokenNameIdentifier	 Abstract SVG Bridge
{	TokenNameLBRACE	
/** * Creates a Kern object that repesents the specified kerning element. * * @param ctx The bridge context. * @param kernElement The kerning element. Should be either a &lt;hkern> * or &lt;vkern> element. * @param font The font the kerning is related to. * * @return kern The new Kern object */	TokenNameCOMMENT_JAVADOC	 Creates a Kern object that repesents the specified kerning element. * @param ctx The bridge context. @param kernElement The kerning element. Should be either a &lt;hkern> or &lt;vkern> element. @param font The font the kerning is related to. * @return kern The new Kern object 
public	TokenNamepublic	
Kern	TokenNameIdentifier	 Kern
createKern	TokenNameIdentifier	 create Kern
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
kernElement	TokenNameIdentifier	 kern Element
,	TokenNameCOMMA	
SVGGVTFont	TokenNameIdentifier	 SVGGVT Font
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// read all of the kern attributes 	TokenNameCOMMENT_LINE	read all of the kern attributes 
String	TokenNameIdentifier	 String
u1	TokenNameIdentifier	 u1
=	TokenNameEQUAL	
kernElement	TokenNameIdentifier	 kern Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_U1_ATTRIBUTE	TokenNameIdentifier	 SVG  U1  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
u2	TokenNameIdentifier	 u2
=	TokenNameEQUAL	
kernElement	TokenNameIdentifier	 kern Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_U2_ATTRIBUTE	TokenNameIdentifier	 SVG  U2  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
g1	TokenNameIdentifier	 g1
=	TokenNameEQUAL	
kernElement	TokenNameIdentifier	 kern Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_G1_ATTRIBUTE	TokenNameIdentifier	 SVG  G1  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
g2	TokenNameIdentifier	 g2
=	TokenNameEQUAL	
kernElement	TokenNameIdentifier	 kern Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_G2_ATTRIBUTE	TokenNameIdentifier	 SVG  G2  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
kernElement	TokenNameIdentifier	 kern Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_K_ATTRIBUTE	TokenNameIdentifier	 SVG  K  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
SVG_KERN_K_DEFAULT_VALUE	TokenNameIdentifier	 SVG  KERN  K  DEFAULT  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get the kern float value 	TokenNameCOMMENT_LINE	get the kern float value 
float	TokenNamefloat	
kernValue	TokenNameIdentifier	 kern Value
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set up the first and second glyph sets and unicode ranges 	TokenNameCOMMENT_LINE	set up the first and second glyph sets and unicode ranges 
int	TokenNameint	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
firstUnicodeRanges	TokenNameIdentifier	 first Unicode Ranges
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
secondUnicodeRanges	TokenNameIdentifier	 second Unicode Ranges
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// process the u1 attribute 	TokenNameCOMMENT_LINE	process the u1 attribute 
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
u1	TokenNameIdentifier	 u1
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"U+"	TokenNameStringLiteral	U+
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// its a unicode range 	TokenNameCOMMENT_LINE	its a unicode range 
firstUnicodeRanges	TokenNameIdentifier	 first Unicode Ranges
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
UnicodeRange	TokenNameIdentifier	 Unicode Range
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphCodes	TokenNameIdentifier	 glyph Codes
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getGlyphCodesForUnicode	TokenNameIdentifier	 get Glyph Codes For Unicode
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
=	TokenNameEQUAL	
glyphCodes	TokenNameIdentifier	 glyph Codes
;	TokenNameSEMICOLON	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
=	TokenNameEQUAL	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
+	TokenNamePLUS	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
>	TokenNameGREATER	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
<	TokenNameLESS	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
+	TokenNamePLUS	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
+	TokenNamePLUS	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
sz	TokenNameIdentifier	 sz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
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
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
[	TokenNameLBRACKET	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyphCodes	TokenNameIdentifier	 glyph Codes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// process the u2 attrbute 	TokenNameCOMMENT_LINE	process the u2 attrbute 
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"U+"	TokenNameStringLiteral	U+
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// its a unicode range 	TokenNameCOMMENT_LINE	its a unicode range 
secondUnicodeRanges	TokenNameIdentifier	 second Unicode Ranges
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
UnicodeRange	TokenNameIdentifier	 Unicode Range
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphCodes	TokenNameIdentifier	 glyph Codes
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getGlyphCodesForUnicode	TokenNameIdentifier	 get Glyph Codes For Unicode
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
=	TokenNameEQUAL	
glyphCodes	TokenNameIdentifier	 glyph Codes
;	TokenNameSEMICOLON	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
=	TokenNameEQUAL	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
+	TokenNamePLUS	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
>	TokenNameGREATER	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
<	TokenNameLESS	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
+	TokenNamePLUS	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
+	TokenNamePLUS	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
sz	TokenNameIdentifier	 sz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
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
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
[	TokenNameLBRACKET	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyphCodes	TokenNameIdentifier	 glyph Codes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// process the g1 attribute 	TokenNameCOMMENT_LINE	process the g1 attribute 
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
g1	TokenNameIdentifier	 g1
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphCodes	TokenNameIdentifier	 glyph Codes
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getGlyphCodesForName	TokenNameIdentifier	 get Glyph Codes For Name
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
=	TokenNameEQUAL	
glyphCodes	TokenNameIdentifier	 glyph Codes
;	TokenNameSEMICOLON	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
=	TokenNameEQUAL	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
+	TokenNamePLUS	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
>	TokenNameGREATER	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
<	TokenNameLESS	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
+	TokenNamePLUS	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
+	TokenNamePLUS	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
sz	TokenNameIdentifier	 sz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
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
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
[	TokenNameLBRACKET	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyphCodes	TokenNameIdentifier	 glyph Codes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// process the g2 attribute 	TokenNameCOMMENT_LINE	process the g2 attribute 
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
g2	TokenNameIdentifier	 g2
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphCodes	TokenNameIdentifier	 glyph Codes
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
getGlyphCodesForName	TokenNameIdentifier	 get Glyph Codes For Name
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
=	TokenNameEQUAL	
glyphCodes	TokenNameIdentifier	 glyph Codes
;	TokenNameSEMICOLON	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
=	TokenNameEQUAL	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
+	TokenNamePLUS	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
>	TokenNameGREATER	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
<	TokenNameLESS	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
+	TokenNamePLUS	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
+	TokenNamePLUS	
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
sz	TokenNameIdentifier	 sz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
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
glyphCodes	TokenNameIdentifier	 glyph Codes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
[	TokenNameLBRACKET	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
glyphCodes	TokenNameIdentifier	 glyph Codes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// construct the arrays 	TokenNameCOMMENT_LINE	construct the arrays 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
firstGlyphs	TokenNameIdentifier	 first Glyphs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
==	TokenNameEQUAL_EQUAL	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstGlyphs	TokenNameIdentifier	 first Glyphs
=	TokenNameEQUAL	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
firstGlyphs	TokenNameIdentifier	 first Glyphs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
firstGlyphSet	TokenNameIdentifier	 first Glyph Set
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
firstGlyphs	TokenNameIdentifier	 first Glyphs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
firstGlyphLen	TokenNameIdentifier	 first Glyph Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
secondGlyphs	TokenNameIdentifier	 second Glyphs
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
==	TokenNameEQUAL_EQUAL	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
secondGlyphs	TokenNameIdentifier	 second Glyphs
=	TokenNameEQUAL	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
secondGlyphs	TokenNameIdentifier	 second Glyphs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
secondGlyphSet	TokenNameIdentifier	 second Glyph Set
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
secondGlyphs	TokenNameIdentifier	 second Glyphs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
secondGlyphLen	TokenNameIdentifier	 second Glyph Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
UnicodeRange	TokenNameIdentifier	 Unicode Range
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
firstRanges	TokenNameIdentifier	 first Ranges
;	TokenNameSEMICOLON	
firstRanges	TokenNameIdentifier	 first Ranges
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeRange	TokenNameIdentifier	 Unicode Range
[	TokenNameLBRACKET	
firstUnicodeRanges	TokenNameIdentifier	 first Unicode Ranges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
firstUnicodeRanges	TokenNameIdentifier	 first Unicode Ranges
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
firstRanges	TokenNameIdentifier	 first Ranges
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeRange	TokenNameIdentifier	 Unicode Range
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
secondRanges	TokenNameIdentifier	 second Ranges
;	TokenNameSEMICOLON	
secondRanges	TokenNameIdentifier	 second Ranges
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeRange	TokenNameIdentifier	 Unicode Range
[	TokenNameLBRACKET	
secondUnicodeRanges	TokenNameIdentifier	 second Unicode Ranges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
secondUnicodeRanges	TokenNameIdentifier	 second Unicode Ranges
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
secondRanges	TokenNameIdentifier	 second Ranges
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return the new Kern object 	TokenNameCOMMENT_LINE	return the new Kern object 
return	TokenNamereturn	
new	TokenNamenew	
Kern	TokenNameIdentifier	 Kern
(	TokenNameLPAREN	
firstGlyphs	TokenNameIdentifier	 first Glyphs
,	TokenNameCOMMA	
secondGlyphs	TokenNameIdentifier	 second Glyphs
,	TokenNameCOMMA	
firstRanges	TokenNameIdentifier	 first Ranges
,	TokenNameCOMMA	
secondRanges	TokenNameIdentifier	 second Ranges
,	TokenNameCOMMA	
kernValue	TokenNameIdentifier	 kern Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
