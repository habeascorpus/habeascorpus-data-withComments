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
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
/** * A collection of utility functions for a CSS scanner. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ScannerUtilities.java 478283 2006-11-22 18:53:40Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A collection of utility functions for a CSS scanner. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ScannerUtilities.java 478283 2006-11-22 18:53:40Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
{	TokenNameLBRACE	
/** * The set of the valid identifier start characters. */	TokenNameCOMMENT_JAVADOC	 The set of the valid identifier start characters. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
IDENTIFIER_START	TokenNameIdentifier	 IDENTIFIER  START
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87FFFFFE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7FFFFFE	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The set of the valid name characters. */	TokenNameCOMMENT_JAVADOC	 The set of the valid name characters. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NAME	TokenNameIdentifier	 NAME
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3FF2000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87FFFFFE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7FFFFFE	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The set of the valid hexadecimal characters. */	TokenNameCOMMENT_JAVADOC	 The set of the valid hexadecimal characters. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
HEXADECIMAL	TokenNameIdentifier	 HEXADECIMAL
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3FF0000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7E	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The set of the valid string characters. */	TokenNameCOMMENT_JAVADOC	 The set of the valid string characters. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
STRING	TokenNameIdentifier	 STRING
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFFFFF7B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFFFFFFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7FFFFFFF	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The set of the valid uri characters. */	TokenNameCOMMENT_JAVADOC	 The set of the valid uri characters. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
URI	TokenNameIdentifier	 URI
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFFFFC7A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFFFFFFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7FFFFFFF	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * This class does not need to be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class does not need to be instantiated. 
protected	TokenNameprotected	
ScannerUtilities	TokenNameIdentifier	 Scanner Utilities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Tests whether the given character is a valid space. */	TokenNameCOMMENT_JAVADOC	 Tests whether the given character is a valid space. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isCSSSpace	TokenNameIdentifier	 is CSS Space
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0x0020	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
'\f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
0x0020	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
&	TokenNameAND	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether the given character is a valid identifier start character. */	TokenNameCOMMENT_JAVADOC	 Tests whether the given character is a valid identifier start character. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isCSSIdentifierStartCharacter	TokenNameIdentifier	 is CSS Identifier Start Character
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
128	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
IDENTIFIER_START	TokenNameIdentifier	 IDENTIFIER  START
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x1F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether the given character is a valid name character. */	TokenNameCOMMENT_JAVADOC	 Tests whether the given character is a valid name character. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isCSSNameCharacter	TokenNameIdentifier	 is CSS Name Character
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
128	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NAME	TokenNameIdentifier	 NAME
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x1F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether the given character is a valid hexadecimal character. */	TokenNameCOMMENT_JAVADOC	 Tests whether the given character is a valid hexadecimal character. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isCSSHexadecimalCharacter	TokenNameIdentifier	 is CSS Hexadecimal Character
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
128	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HEXADECIMAL	TokenNameIdentifier	 HEXADECIMAL
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x1F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether the given character is a valid string character. */	TokenNameCOMMENT_JAVADOC	 Tests whether the given character is a valid string character. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isCSSStringCharacter	TokenNameIdentifier	 is CSS String Character
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
128	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
STRING	TokenNameIdentifier	 STRING
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x1F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether the given character is a valid URI character. */	TokenNameCOMMENT_JAVADOC	 Tests whether the given character is a valid URI character. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isCSSURICharacter	TokenNameIdentifier	 is CSSURI Character
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
128	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
URI	TokenNameIdentifier	 URI
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
>>	TokenNameRIGHT_SHIFT	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
&	TokenNameAND	
0x1F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
