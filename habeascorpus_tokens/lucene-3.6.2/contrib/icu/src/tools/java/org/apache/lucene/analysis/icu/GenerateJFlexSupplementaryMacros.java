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
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DateFormat	TokenNameIdentifier	 Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
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
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeZone	TokenNameIdentifier	 Time Zone
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
UnicodeSet	TokenNameIdentifier	 Unicode Set
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
UnicodeSetIterator	TokenNameIdentifier	 Unicode Set Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
VersionInfo	TokenNameIdentifier	 Version Info
;	TokenNameSEMICOLON	
/** creates a macro to augment jflex's unicode wordbreak support for > BMP */	TokenNameCOMMENT_JAVADOC	 creates a macro to augment jflex's unicode wordbreak support for > BMP 
public	TokenNamepublic	
class	TokenNameclass	
GenerateJFlexSupplementaryMacros	TokenNameIdentifier	 Generate J Flex Supplementary Macros
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
UnicodeSet	TokenNameIdentifier	 Unicode Set
BMP	TokenNameIdentifier	 BMP
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeSet	TokenNameIdentifier	 Unicode Set
(	TokenNameLPAREN	
"[ -?]"	TokenNameStringLiteral	[ -?]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NL	TokenNameIdentifier	 NL
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
DateFormat	TokenNameIdentifier	 Date Format
DATE_FORMAT	TokenNameIdentifier	 DATE  FORMAT
=	TokenNameEQUAL	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
getDateTimeInstance	TokenNameIdentifier	 get Date Time Instance
(	TokenNameLPAREN	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
FULL	TokenNameIdentifier	 FULL
,	TokenNameCOMMA	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
FULL	TokenNameIdentifier	 FULL
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
DATE_FORMAT	TokenNameIdentifier	 DATE  FORMAT
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"UTC"	TokenNameStringLiteral	UTC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
APACHE_LICENSE	TokenNameIdentifier	 APACHE  LICENSE
=	TokenNameEQUAL	
"/*"	TokenNameStringLiteral	/*
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * Copyright 2010 The Apache Software Foundation."	TokenNameStringLiteral	 * Copyright 2010 The Apache Software Foundation.
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" *"	TokenNameStringLiteral	 *
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * Licensed under the Apache License, Version 2.0 (the "License");"	TokenNameStringLiteral	 * Licensed under the Apache License, Version 2.0 (the "License");
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * you may not use this file except in compliance with the License."	TokenNameStringLiteral	 * you may not use this file except in compliance with the License.
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * You may obtain a copy of the License at"	TokenNameStringLiteral	 * You may obtain a copy of the License at
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" *"	TokenNameStringLiteral	 *
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * http://www.apache.org/licenses/LICENSE-2.0"	TokenNameStringLiteral	 * http://www.apache.org/licenses/LICENSE-2.0
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" *"	TokenNameStringLiteral	 *
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * Unless required by applicable law or agreed to in writing, software"	TokenNameStringLiteral	 * Unless required by applicable law or agreed to in writing, software
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * distributed under the License is distributed on an "AS IS" BASIS,"	TokenNameStringLiteral	 * distributed under the License is distributed on an "AS IS" BASIS,
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied."	TokenNameStringLiteral	 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * See the License for the specific language governing permissions and"	TokenNameStringLiteral	 * See the License for the specific language governing permissions and
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" * limitations under the License."	TokenNameStringLiteral	 * limitations under the License.
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
" */"	TokenNameStringLiteral	 */
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
outputHeader	TokenNameIdentifier	 output Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
"ALetterSupp"	TokenNameStringLiteral	ALetterSupp
,	TokenNameCOMMA	
"[:WordBreak=ALetter:]"	TokenNameStringLiteral	[:WordBreak=ALetter:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
"FormatSupp"	TokenNameStringLiteral	FormatSupp
,	TokenNameCOMMA	
"[:WordBreak=Format:]"	TokenNameStringLiteral	[:WordBreak=Format:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
"ExtendSupp"	TokenNameStringLiteral	ExtendSupp
,	TokenNameCOMMA	
"[:WordBreak=Extend:]"	TokenNameStringLiteral	[:WordBreak=Extend:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
"NumericSupp"	TokenNameStringLiteral	NumericSupp
,	TokenNameCOMMA	
"[:WordBreak=Numeric:]"	TokenNameStringLiteral	[:WordBreak=Numeric:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
"KatakanaSupp"	TokenNameStringLiteral	KatakanaSupp
,	TokenNameCOMMA	
"[:WordBreak=Katakana:]"	TokenNameStringLiteral	[:WordBreak=Katakana:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
"MidLetterSupp"	TokenNameStringLiteral	MidLetterSupp
,	TokenNameCOMMA	
"[:WordBreak=MidLetter:]"	TokenNameStringLiteral	[:WordBreak=MidLetter:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
"MidNumSupp"	TokenNameStringLiteral	MidNumSupp
,	TokenNameCOMMA	
"[:WordBreak=MidNum:]"	TokenNameStringLiteral	[:WordBreak=MidNum:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
"MidNumLetSupp"	TokenNameStringLiteral	MidNumLetSupp
,	TokenNameCOMMA	
"[:WordBreak=MidNumLet:]"	TokenNameStringLiteral	[:WordBreak=MidNumLet:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
"ExtendNumLetSupp"	TokenNameStringLiteral	ExtendNumLetSupp
,	TokenNameCOMMA	
"[:WordBreak=ExtendNumLet:]"	TokenNameStringLiteral	[:WordBreak=ExtendNumLet:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
"ExtendNumLetSupp"	TokenNameStringLiteral	ExtendNumLetSupp
,	TokenNameCOMMA	
"[:WordBreak=ExtendNumLet:]"	TokenNameStringLiteral	[:WordBreak=ExtendNumLet:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
"ComplexContextSupp"	TokenNameStringLiteral	ComplexContextSupp
,	TokenNameCOMMA	
"[:LineBreak=Complex_Context:]"	TokenNameStringLiteral	[:LineBreak=Complex_Context:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
"HanSupp"	TokenNameStringLiteral	HanSupp
,	TokenNameCOMMA	
"[:Script=Han:]"	TokenNameStringLiteral	[:Script=Han:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
"HiraganaSupp"	TokenNameStringLiteral	HiraganaSupp
,	TokenNameCOMMA	
"[:Script=Hiragana:]"	TokenNameStringLiteral	[:Script=Hiragana:]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
outputHeader	TokenNameIdentifier	 output Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
APACHE_LICENSE	TokenNameIdentifier	 APACHE  LICENSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"// Generated using ICU4J "	TokenNameStringLiteral	// Generated using ICU4J 
+	TokenNamePLUS	
VersionInfo	TokenNameIdentifier	 Version Info
.	TokenNameDOT	
ICU_VERSION	TokenNameIdentifier	 ICU  VERSION
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" on "	TokenNameStringLiteral	 on 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DATE_FORMAT	TokenNameIdentifier	 DATE  FORMAT
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"// by "	TokenNameStringLiteral	// by 
+	TokenNamePLUS	
GenerateJFlexSupplementaryMacros	TokenNameIdentifier	 Generate J Flex Supplementary Macros
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
NL	TokenNameIdentifier	 NL
+	TokenNamePLUS	
NL	TokenNameIdentifier	 NL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we have to carefully output the possibilities as compact utf-16 	TokenNameCOMMENT_LINE	we have to carefully output the possibilities as compact utf-16 
// range expressions, or jflex will OOM! 	TokenNameCOMMENT_LINE	range expressions, or jflex will OOM! 
static	TokenNamestatic	
void	TokenNamevoid	
outputMacro	TokenNameIdentifier	 output Macro
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnicodeSet	TokenNameIdentifier	 Unicode Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeSet	TokenNameIdentifier	 Unicode Set
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
BMP	TokenNameIdentifier	 BMP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" = ("	TokenNameStringLiteral	 = (
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if the set is empty, we have to do this or jflex will barf 	TokenNameCOMMENT_LINE	if the set is empty, we have to do this or jflex will barf 
if	TokenNameif	
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" []"	TokenNameStringLiteral	 []
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
,	TokenNameCOMMA	
UnicodeSet	TokenNameIdentifier	 Unicode Set
>	TokenNameGREATER	
utf16ByLead	TokenNameIdentifier	 utf16 By Lead
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
,	TokenNameCOMMA	
UnicodeSet	TokenNameIdentifier	 Unicode Set
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
UnicodeSetIterator	TokenNameIdentifier	 Unicode Set Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeSetIterator	TokenNameIdentifier	 Unicode Set Iterator
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
utf16	TokenNameIdentifier	 utf16
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toChars	TokenNameIdentifier	 to Chars
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
codepoint	TokenNameIdentifier	 codepoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeSet	TokenNameIdentifier	 Unicode Set
trails	TokenNameIdentifier	 trails
=	TokenNameEQUAL	
utf16ByLead	TokenNameIdentifier	 utf16 By Lead
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
utf16	TokenNameIdentifier	 utf16
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
trails	TokenNameIdentifier	 trails
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trails	TokenNameIdentifier	 trails
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeSet	TokenNameIdentifier	 Unicode Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
utf16ByLead	TokenNameIdentifier	 utf16 By Lead
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
utf16	TokenNameIdentifier	 utf16
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
trails	TokenNameIdentifier	 trails
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
trails	TokenNameIdentifier	 trails
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
utf16	TokenNameIdentifier	 utf16
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
isFirst	TokenNameIdentifier	 is First
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
utf16ByLead	TokenNameIdentifier	 utf16 By Lead
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnicodeSet	TokenNameIdentifier	 Unicode Set
trail	TokenNameIdentifier	 trail
=	TokenNameEQUAL	
utf16ByLead	TokenNameIdentifier	 utf16 By Lead
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
isFirst	TokenNameIdentifier	 is First
?	TokenNameQUESTION	
" "	TokenNameStringLiteral	 
:	TokenNameCOLON	
" | "	TokenNameStringLiteral	 | 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isFirst	TokenNameIdentifier	 is First
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"([\u"	TokenNameStringLiteral	([\u
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
+	TokenNamePLUS	
trail	TokenNameIdentifier	 trail
.	TokenNameDOT	
getRegexEquivalent	TokenNameIdentifier	 get Regex Equivalent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
