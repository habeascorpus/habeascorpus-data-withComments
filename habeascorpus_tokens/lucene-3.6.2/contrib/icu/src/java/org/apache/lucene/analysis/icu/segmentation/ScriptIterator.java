package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
segmentation	TokenNameIdentifier	 segmentation
;	TokenNameSEMICOLON	
/** * Copyright (C) 1999-2010, International Business Machines * Corporation and others. All Rights Reserved. * * Permission is hereby granted, free of charge, to any person obtaining a copy * of this software and associated documentation files (the "Software"), to deal * in the Software without restriction, including without limitation the rights * to use, copy, modify, merge, publish, distribute, and/or sell copies of the * Software, and to permit persons to whom the Software is furnished to do so, * provided that the above copyright notice(s) and this permission notice appear * in all copies of the Software and that both the above copyright notice(s) and * this permission notice appear in supporting documentation. * * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT OF THIRD PARTY RIGHTS. * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS NOTICE BE * LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL DAMAGES, OR * ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER * IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT * OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE. * * Except as contained in this notice, the name of a copyright holder shall not * be used in advertising or otherwise to promote the sale, use or other * dealings in this Software without prior written authorization of the * copyright holder. */	TokenNameCOMMENT_JAVADOC	 Copyright (C) 1999-2010, International Business Machines Corporation and others. All Rights Reserved. * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, provided that the above copyright notice(s) and this permission notice appear in all copies of the Software and that both the above copyright notice(s) and this permission notice appear in supporting documentation. * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT OF THIRD PARTY RIGHTS. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE. * Except as contained in this notice, the name of a copyright holder shall not be used in advertising or otherwise to promote the sale, use or other dealings in this Software without prior written authorization of the copyright holder. 
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
UCharacter	TokenNameIdentifier	 U Character
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
UCharacterEnums	TokenNameIdentifier	 U Character Enums
.	TokenNameDOT	
ECharacterCategory	TokenNameIdentifier	 E Character Category
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
UScript	TokenNameIdentifier	 U Script
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
UTF16	TokenNameIdentifier	 UT F16
;	TokenNameSEMICOLON	
/** * An iterator that locates ISO 15924 script boundaries in text. * <p> * This is not the same as simply looking at the Unicode block, or even the * Script property. Some characters are 'common' across multiple scripts, and * some 'inherit' the script value of text surrounding them. * <p> * This is similar to ICU (internal-only) UScriptRun, with the following * differences: * <ul> * <li>Doesn't attempt to match paired punctuation. For tokenization purposes, this * is not necessary. Its also quite expensive. * <li>Non-spacing marks inherit the script of their base character, following * recommendations from UTR #24. * </ul> * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An iterator that locates ISO 15924 script boundaries in text. <p> This is not the same as simply looking at the Unicode block, or even the Script property. Some characters are 'common' across multiple scripts, and some 'inherit' the script value of text surrounding them. <p> This is similar to ICU (internal-only) UScriptRun, with the following differences: <ul> <li>Doesn't attempt to match paired punctuation. For tokenization purposes, this is not necessary. Its also quite expensive. <li>Non-spacing marks inherit the script of their base character, following recommendations from UTR #24. </ul> @lucene.experimental 
final	TokenNamefinal	
class	TokenNameclass	
ScriptIterator	TokenNameIdentifier	 Script Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
scriptStart	TokenNameIdentifier	 script Start
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
scriptLimit	TokenNameIdentifier	 script Limit
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
scriptCode	TokenNameIdentifier	 script Code
;	TokenNameSEMICOLON	
/** * Get the start of this script run * * @return start position of script run */	TokenNameCOMMENT_JAVADOC	 Get the start of this script run * @return start position of script run 
int	TokenNameint	
getScriptStart	TokenNameIdentifier	 get Script Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scriptStart	TokenNameIdentifier	 script Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the first character after the end of this script run * * @return position of the first character after this script run */	TokenNameCOMMENT_JAVADOC	 Get the index of the first character after the end of this script run * @return position of the first character after this script run 
int	TokenNameint	
getScriptLimit	TokenNameIdentifier	 get Script Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scriptLimit	TokenNameIdentifier	 script Limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the UScript script code for this script run * * @return code for the script of the current run */	TokenNameCOMMENT_JAVADOC	 Get the UScript script code for this script run * @return code for the script of the current run 
int	TokenNameint	
getScriptCode	TokenNameIdentifier	 get Script Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scriptCode	TokenNameIdentifier	 script Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Iterates to the next script run, returning true if one exists. * * @return true if there is another script run, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Iterates to the next script run, returning true if one exists. * @return true if there is another script run, false otherwise. 
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scriptLimit	TokenNameIdentifier	 script Limit
>=	TokenNameGREATER_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
scriptCode	TokenNameIdentifier	 script Code
=	TokenNameEQUAL	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
COMMON	TokenNameIdentifier	 COMMON
;	TokenNameSEMICOLON	
scriptStart	TokenNameIdentifier	 script Start
=	TokenNameEQUAL	
scriptLimit	TokenNameIdentifier	 script Limit
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
UTF16	TokenNameIdentifier	 UT F16
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
sc	TokenNameIdentifier	 sc
=	TokenNameEQUAL	
getScript	TokenNameIdentifier	 get Script
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * From UTR #24: Implementations that determine the boundaries between * characters of given scripts should never break between a non-spacing * mark and its base character. Thus for boundary determinations and * similar sorts of processing, a non-spacing mark — whatever its script * value — should inherit the script value of its base character. */	TokenNameCOMMENT_BLOCK	 From UTR #24: Implementations that determine the boundaries between characters of given scripts should never break between a non-spacing mark and its base character. Thus for boundary determinations and similar sorts of processing, a non-spacing mark — whatever its script value — should inherit the script value of its base character. 
if	TokenNameif	
(	TokenNameLPAREN	
isSameScript	TokenNameIdentifier	 is Same Script
(	TokenNameLPAREN	
scriptCode	TokenNameIdentifier	 script Code
,	TokenNameCOMMA	
sc	TokenNameIdentifier	 sc
)	TokenNameRPAREN	
||	TokenNameOR_OR	
UCharacter	TokenNameIdentifier	 U Character
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ECharacterCategory	TokenNameIdentifier	 E Character Category
.	TokenNameDOT	
NON_SPACING_MARK	TokenNameIdentifier	 NON  SPACING  MARK
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
UTF16	TokenNameIdentifier	 UT F16
.	TokenNameDOT	
getCharCount	TokenNameIdentifier	 get Char Count
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Inherited or Common becomes the script code of the surrounding text. */	TokenNameCOMMENT_BLOCK	 Inherited or Common becomes the script code of the surrounding text. 
if	TokenNameif	
(	TokenNameLPAREN	
scriptCode	TokenNameIdentifier	 script Code
<=	TokenNameLESS_EQUAL	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
INHERITED	TokenNameIdentifier	 INHERITED
&&	TokenNameAND_AND	
sc	TokenNameIdentifier	 sc
>	TokenNameGREATER	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
INHERITED	TokenNameIdentifier	 INHERITED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scriptCode	TokenNameIdentifier	 script Code
=	TokenNameEQUAL	
sc	TokenNameIdentifier	 sc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
scriptLimit	TokenNameIdentifier	 script Limit
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Determine if two scripts are compatible. */	TokenNameCOMMENT_JAVADOC	 Determine if two scripts are compatible. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSameScript	TokenNameIdentifier	 is Same Script
(	TokenNameLPAREN	
int	TokenNameint	
scriptOne	TokenNameIdentifier	 script One
,	TokenNameCOMMA	
int	TokenNameint	
scriptTwo	TokenNameIdentifier	 script Two
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scriptOne	TokenNameIdentifier	 script One
<=	TokenNameLESS_EQUAL	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
INHERITED	TokenNameIdentifier	 INHERITED
||	TokenNameOR_OR	
scriptTwo	TokenNameIdentifier	 script Two
<=	TokenNameLESS_EQUAL	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
INHERITED	TokenNameIdentifier	 INHERITED
||	TokenNameOR_OR	
scriptOne	TokenNameIdentifier	 script One
==	TokenNameEQUAL_EQUAL	
scriptTwo	TokenNameIdentifier	 script Two
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a new region of text to be examined by this iterator * * @param text text buffer to examine * @param start offset into buffer * @param length maximum length to examine */	TokenNameCOMMENT_JAVADOC	 Set a new region of text to be examined by this iterator * @param text text buffer to examine @param start offset into buffer @param length maximum length to examine 
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scriptStart	TokenNameIdentifier	 script Start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scriptLimit	TokenNameIdentifier	 script Limit
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scriptCode	TokenNameIdentifier	 script Code
=	TokenNameEQUAL	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
INVALID_CODE	TokenNameIdentifier	 INVALID  CODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** linear fast-path for basic latin case */	TokenNameCOMMENT_JAVADOC	 linear fast-path for basic latin case 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
basicLatin	TokenNameIdentifier	 basic Latin
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
128	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
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
basicLatin	TokenNameIdentifier	 basic Latin
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
basicLatin	TokenNameIdentifier	 basic Latin
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
getScript	TokenNameIdentifier	 get Script
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** fast version of UScript.getScript(). Basic Latin is an array lookup */	TokenNameCOMMENT_JAVADOC	 fast version of UScript.getScript(). Basic Latin is an array lookup 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
getScript	TokenNameIdentifier	 get Script
(	TokenNameLPAREN	
int	TokenNameint	
codepoint	TokenNameIdentifier	 codepoint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
codepoint	TokenNameIdentifier	 codepoint
&&	TokenNameAND_AND	
codepoint	TokenNameIdentifier	 codepoint
<	TokenNameLESS	
basicLatin	TokenNameIdentifier	 basic Latin
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
basicLatin	TokenNameIdentifier	 basic Latin
[	TokenNameLBRACKET	
codepoint	TokenNameIdentifier	 codepoint
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
getScript	TokenNameIdentifier	 get Script
(	TokenNameLPAREN	
codepoint	TokenNameIdentifier	 codepoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
