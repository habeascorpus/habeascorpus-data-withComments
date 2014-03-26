/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @version $Id: FilePathToURI.java 937829 2010-04-25 17:11:12Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @version $Id: FilePathToURI.java 937829 2010-04-25 17:11:12Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
FilePathToURI	TokenNameIdentifier	 File Path To URI
{	TokenNameLBRACE	
// which ASCII characters need to be escaped 	TokenNameCOMMENT_LINE	which ASCII characters need to be escaped 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
gNeedEscaping	TokenNameIdentifier	 g Need Escaping
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
128	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// the first hex character if a character needs to be escaped 	TokenNameCOMMENT_LINE	the first hex character if a character needs to be escaped 
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
gAfterEscaping1	TokenNameIdentifier	 g After Escaping1
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
128	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// the second hex character if a character needs to be escaped 	TokenNameCOMMENT_LINE	the second hex character if a character needs to be escaped 
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
gAfterEscaping2	TokenNameIdentifier	 g After Escaping2
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
128	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gHexChs	TokenNameIdentifier	 g Hex Chs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
'0'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'1'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'2'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'3'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'4'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'5'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'6'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'7'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'8'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'9'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'A'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'B'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'C'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'D'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'E'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'F'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// initialize the above 3 arrays 	TokenNameCOMMENT_LINE	initialize the above 3 arrays 
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
<=	TokenNameLESS_EQUAL	
0x1f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gNeedEscaping	TokenNameIdentifier	 g Need Escaping
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
gAfterEscaping1	TokenNameIdentifier	 g After Escaping1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gHexChs	TokenNameIdentifier	 g Hex Chs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
gAfterEscaping2	TokenNameIdentifier	 g After Escaping2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gHexChs	TokenNameIdentifier	 g Hex Chs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
gNeedEscaping	TokenNameIdentifier	 g Need Escaping
[	TokenNameLBRACKET	
0x7f	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
gAfterEscaping1	TokenNameIdentifier	 g After Escaping1
[	TokenNameLBRACKET	
0x7f	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'7'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
gAfterEscaping2	TokenNameIdentifier	 g After Escaping2
[	TokenNameLBRACKET	
0x7f	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'F'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
escChs	TokenNameIdentifier	 esc Chs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'<'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'>'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'#'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'%'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'"'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'{'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'}'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'|'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'^'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'~'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'['	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
']'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'`'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
escChs	TokenNameIdentifier	 esc Chs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
escChs	TokenNameIdentifier	 esc Chs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
gNeedEscaping	TokenNameIdentifier	 g Need Escaping
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
gAfterEscaping1	TokenNameIdentifier	 g After Escaping1
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gHexChs	TokenNameIdentifier	 g Hex Chs
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
gAfterEscaping2	TokenNameIdentifier	 g After Escaping2
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
gHexChs	TokenNameIdentifier	 g Hex Chs
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
FilePathToURI	TokenNameIdentifier	 File Path To URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// To escape a file path to a URI, by using %HH to represent 	TokenNameCOMMENT_LINE	To escape a file path to a URI, by using %HH to represent 
// special ASCII characters: 0x00~0x1F, 0x7F, ' ', '<', '>', '#', '%' 	TokenNameCOMMENT_LINE	special ASCII characters: 0x00~0x1F, 0x7F, ' ', '<', '>', '#', '%' 
// and '"' and non-ASCII characters (whose value >= 128). 	TokenNameCOMMENT_LINE	and '"' and non-ASCII characters (whose value >= 128). 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
filepath2URI	TokenNameIdentifier	 filepath2 URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// return null if path is null. 	TokenNameCOMMENT_LINE	return null if path is null. 
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
separator	TokenNameIdentifier	 separator
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
separator	TokenNameIdentifier	 separator
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
*	TokenNameMULTIPLY	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"file://"	TokenNameStringLiteral	file://
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// change C:/blah to /C:/blah 	TokenNameCOMMENT_LINE	change C:/blah to /C:/blah 
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// for each character in the path 	TokenNameCOMMENT_LINE	for each character in the path 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if it's not an ASCII character, break here, and use UTF-8 encoding 	TokenNameCOMMENT_LINE	if it's not an ASCII character, break here, and use UTF-8 encoding 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gNeedEscaping	TokenNameIdentifier	 g Need Escaping
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gAfterEscaping1	TokenNameIdentifier	 g After Escaping1
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gAfterEscaping2	TokenNameIdentifier	 g After Escaping2
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// record the fact that it's escaped 	TokenNameCOMMENT_LINE	record the fact that it's escaped 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// we saw some non-ascii character 	TokenNameCOMMENT_LINE	we saw some non-ascii character 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get UTF-8 bytes for the remaining sub-string 	TokenNameCOMMENT_LINE	get UTF-8 bytes for the remaining sub-string 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should never happen 	TokenNameCOMMENT_LINE	should never happen 
return	TokenNamereturn	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// for each byte 	TokenNameCOMMENT_LINE	for each byte 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// for non-ascii character: make it positive, then escape 	TokenNameCOMMENT_LINE	for non-ascii character: make it positive, then escape 
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
+	TokenNamePLUS	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gHexChs	TokenNameIdentifier	 g Hex Chs
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gHexChs	TokenNameIdentifier	 g Hex Chs
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
0xf	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
gNeedEscaping	TokenNameIdentifier	 g Need Escaping
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gAfterEscaping1	TokenNameIdentifier	 g After Escaping1
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gAfterEscaping2	TokenNameIdentifier	 g After Escaping2
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//FilePathToURI 	TokenNameCOMMENT_LINE	FilePathToURI 
