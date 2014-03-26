/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
wmf	TokenNameIdentifier	 wmf
.	TokenNameDOT	
tosvg	TokenNameIdentifier	 tosvg
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
wmf	TokenNameIdentifier	 wmf
.	TokenNameDOT	
WMFConstants	TokenNameIdentifier	 WMF Constants
;	TokenNameSEMICOLON	
/** This class holds various utilies for importing WMF files that can be used either for * {@link org.apache.batik.transcoder.wmf.tosvg.AbstractWMFReader}s and * {@link org.apache.batik.transcoder.wmf.tosvg.AbstractWMFPainter}s * * @version $Id: WMFUtilities.java 582434 2007-10-06 02:11:51Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class holds various utilies for importing WMF files that can be used either for {@link org.apache.batik.transcoder.wmf.tosvg.AbstractWMFReader}s and {@link org.apache.batik.transcoder.wmf.tosvg.AbstractWMFPainter}s * @version $Id: WMFUtilities.java 582434 2007-10-06 02:11:51Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
WMFUtilities	TokenNameIdentifier	 WMF Utilities
{	TokenNameLBRACE	
/** * Decode a byte array in a string, using the charset of the given font. * * @param wmfFont the font to use the charset of. * @param bstr the encoded bytes of the string. */	TokenNameCOMMENT_JAVADOC	 Decode a byte array in a string, using the charset of the given font. * @param wmfFont the font to use the charset of. @param bstr the encoded bytes of the string. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
decodeString	TokenNameIdentifier	 decode String
(	TokenNameLPAREN	
WMFFont	TokenNameIdentifier	 WMF Font
wmfFont	TokenNameIdentifier	 wmf Font
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bstr	TokenNameIdentifier	 bstr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// manage the charset encoding 	TokenNameCOMMENT_LINE	manage the charset encoding 
try	TokenNametry	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
wmfFont	TokenNameIdentifier	 wmf Font
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_ANSI	TokenNameIdentifier	 META  CHARSET  ANSI
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_ANSI	TokenNameIdentifier	 CHARSET  ANSI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_DEFAULT	TokenNameIdentifier	 META  CHARSET  DEFAULT
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_DEFAULT	TokenNameIdentifier	 CHARSET  DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_SHIFTJIS	TokenNameIdentifier	 META  CHARSET  SHIFTJIS
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_SHIFTJIS	TokenNameIdentifier	 CHARSET  SHIFTJIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_HANGUL	TokenNameIdentifier	 META  CHARSET  HANGUL
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_HANGUL	TokenNameIdentifier	 CHARSET  HANGUL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_JOHAB	TokenNameIdentifier	 META  CHARSET  JOHAB
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_JOHAB	TokenNameIdentifier	 CHARSET  JOHAB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_GB2312	TokenNameIdentifier	 META  CHARSET  G B2312
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_GB2312	TokenNameIdentifier	 CHARSET  G B2312
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_CHINESEBIG5	TokenNameIdentifier	 META  CHARSET  CHINESEBI G5
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_CHINESEBIG5	TokenNameIdentifier	 CHARSET  CHINESEBI G5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_GREEK	TokenNameIdentifier	 META  CHARSET  GREEK
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_GREEK	TokenNameIdentifier	 CHARSET  GREEK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_TURKISH	TokenNameIdentifier	 META  CHARSET  TURKISH
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_TURKISH	TokenNameIdentifier	 CHARSET  TURKISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_VIETNAMESE	TokenNameIdentifier	 META  CHARSET  VIETNAMESE
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_VIETNAMESE	TokenNameIdentifier	 CHARSET  VIETNAMESE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_HEBREW	TokenNameIdentifier	 META  CHARSET  HEBREW
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_HEBREW	TokenNameIdentifier	 CHARSET  HEBREW
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_ARABIC	TokenNameIdentifier	 META  CHARSET  ARABIC
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_ARABIC	TokenNameIdentifier	 CHARSET  ARABIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_RUSSIAN	TokenNameIdentifier	 META  CHARSET  RUSSIAN
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_CYRILLIC	TokenNameIdentifier	 CHARSET  CYRILLIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_THAI	TokenNameIdentifier	 META  CHARSET  THAI
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_THAI	TokenNameIdentifier	 CHARSET  THAI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_EASTEUROPE	TokenNameIdentifier	 META  CHARSET  EASTEUROPE
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_EASTEUROPE	TokenNameIdentifier	 CHARSET  EASTEUROPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
META_CHARSET_OEM	TokenNameIdentifier	 META  CHARSET  OEM
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
,	TokenNameCOMMA	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
CHARSET_OEM	TokenNameIdentifier	 CHARSET  OEM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Fall through to use default. 	TokenNameCOMMENT_LINE	Fall through to use default. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fall through to use default. 	TokenNameCOMMENT_LINE	Fall through to use default. 
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bstr	TokenNameIdentifier	 bstr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the Horizontal Alignement for the Alignment property. */	TokenNameCOMMENT_JAVADOC	 Get the Horizontal Alignement for the Alignment property. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getHorizontalAlignment	TokenNameIdentifier	 get Horizontal Alignment
(	TokenNameLPAREN	
int	TokenNameint	
align	TokenNameIdentifier	 align
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
%	TokenNameREMAINDER	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
TA_BASELINE	TokenNameIdentifier	 TA  BASELINE
;	TokenNameSEMICOLON	
// skip baseline alignment (24) 	TokenNameCOMMENT_LINE	skip baseline alignment (24) 
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
%	TokenNameREMAINDER	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
TA_BOTTOM	TokenNameIdentifier	 TA  BOTTOM
;	TokenNameSEMICOLON	
// skip bottom aligment (8) 	TokenNameCOMMENT_LINE	skip bottom aligment (8) 
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
>=	TokenNameGREATER_EQUAL	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
TA_CENTER	TokenNameIdentifier	 TA  CENTER
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
TA_RIGHT	TokenNameIdentifier	 TA  RIGHT
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
TA_LEFT	TokenNameIdentifier	 TA  LEFT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the Vertical Alignement for the Alignment property. */	TokenNameCOMMENT_JAVADOC	 Get the Vertical Alignement for the Alignment property. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getVerticalAlignment	TokenNameIdentifier	 get Vertical Alignment
(	TokenNameLPAREN	
int	TokenNameint	
align	TokenNameIdentifier	 align
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
/	TokenNameDIVIDE	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
TA_BASELINE	TokenNameIdentifier	 TA  BASELINE
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
TA_BASELINE	TokenNameIdentifier	 TA  BASELINE
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
%	TokenNameREMAINDER	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
TA_BASELINE	TokenNameIdentifier	 TA  BASELINE
;	TokenNameSEMICOLON	
// skip baseline alignment (24) 	TokenNameCOMMENT_LINE	skip baseline alignment (24) 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
/	TokenNameDIVIDE	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
TA_BOTTOM	TokenNameIdentifier	 TA  BOTTOM
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
TA_BOTTOM	TokenNameIdentifier	 TA  BOTTOM
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
WMFConstants	TokenNameIdentifier	 WMF Constants
.	TokenNameDOT	
TA_TOP	TokenNameIdentifier	 TA  TOP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
