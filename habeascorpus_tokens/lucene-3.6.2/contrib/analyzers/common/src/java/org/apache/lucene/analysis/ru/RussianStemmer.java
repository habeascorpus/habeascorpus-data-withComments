package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ru	TokenNameIdentifier	 ru
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Russian stemming algorithm implementation (see http://snowball.sourceforge.net for detailed description). * @deprecated Use {@link org.tartarus.snowball.ext.RussianStemmer} instead, * which has the same functionality. This filter will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 Russian stemming algorithm implementation (see http://snowball.sourceforge.net for detailed description). @deprecated Use {@link org.tartarus.snowball.ext.RussianStemmer} instead, which has the same functionality. This filter will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
class	TokenNameclass	
RussianStemmer	TokenNameIdentifier	 Russian Stemmer
{	TokenNameLBRACE	
// positions of RV, R1 and R2 respectively 	TokenNameCOMMENT_LINE	positions of RV, R1 and R2 respectively 
private	TokenNameprivate	
int	TokenNameint	
RV	TokenNameIdentifier	 RV
,	TokenNameCOMMA	
/*R1,*/	TokenNameCOMMENT_BLOCK	R1,
R2	TokenNameIdentifier	 R2
;	TokenNameSEMICOLON	
// letters (currently unused letters are commented out) 	TokenNameCOMMENT_LINE	letters (currently unused letters are commented out) 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
A	TokenNameIdentifier	 A
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
//private final static char B = '?	TokenNameCOMMENT_LINE	private final static char B = '?
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
V	TokenNameIdentifier	 V
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
G	TokenNameIdentifier	 G
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
//private final static char D = '?	TokenNameCOMMENT_LINE	private final static char D = '?
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
E	TokenNameIdentifier	 E
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
//private final static char ZH = '?	TokenNameCOMMENT_LINE	private final static char ZH = '?
//private final static char Z = '?	TokenNameCOMMENT_LINE	private final static char Z = '?
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
I	TokenNameIdentifier	 I
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
I_	TokenNameIdentifier	 I
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
//private final static char K = '?	TokenNameCOMMENT_LINE	private final static char K = '?
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
L	TokenNameIdentifier	 L
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
M	TokenNameIdentifier	 M
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
O	TokenNameIdentifier	 O
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
//private final static char P = '?	TokenNameCOMMENT_LINE	private final static char P = '?
//private final static char R = '?	TokenNameCOMMENT_LINE	private final static char R = '?
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
S	TokenNameIdentifier	 S
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
T	TokenNameIdentifier	 T
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
U	TokenNameIdentifier	 U
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
//private final static char F = '?	TokenNameCOMMENT_LINE	private final static char F = '?
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
X	TokenNameIdentifier	 X
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
//private final static char TS = '?	TokenNameCOMMENT_LINE	private final static char TS = '?
//private final static char CH = '?	TokenNameCOMMENT_LINE	private final static char CH = '?
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
SH	TokenNameIdentifier	 SH
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
SHCH	TokenNameIdentifier	 SHCH
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
//private final static char HARD = '?	TokenNameCOMMENT_LINE	private final static char HARD = '?
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
Y	TokenNameIdentifier	 Y
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
SOFT	TokenNameIdentifier	 SOFT
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
AE	TokenNameIdentifier	 AE
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
IU	TokenNameIdentifier	 IU
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
IA	TokenNameIdentifier	 IA
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
// stem definitions 	TokenNameCOMMENT_LINE	stem definitions 
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vowels	TokenNameIdentifier	 vowels
=	TokenNameEQUAL	
{	TokenNameLBRACE	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
O	TokenNameIdentifier	 O
,	TokenNameCOMMA	
U	TokenNameIdentifier	 U
,	TokenNameCOMMA	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
AE	TokenNameIdentifier	 AE
,	TokenNameCOMMA	
IU	TokenNameIdentifier	 IU
,	TokenNameCOMMA	
IA	TokenNameIdentifier	 IA
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
perfectiveGerundEndings1	TokenNameIdentifier	 perfective Gerund Endings1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
V	TokenNameIdentifier	 V
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
V	TokenNameIdentifier	 V
,	TokenNameCOMMA	
SH	TokenNameIdentifier	 SH
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
V	TokenNameIdentifier	 V
,	TokenNameCOMMA	
SH	TokenNameIdentifier	 SH
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
S	TokenNameIdentifier	 S
,	TokenNameCOMMA	
SOFT	TokenNameIdentifier	 SOFT
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
perfectiveGerund1Predessors	TokenNameIdentifier	 perfective Gerund1 Predessors
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
A	TokenNameIdentifier	 A
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
IA	TokenNameIdentifier	 IA
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
perfectiveGerundEndings2	TokenNameIdentifier	 perfective Gerund Endings2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
,	TokenNameCOMMA	
SH	TokenNameIdentifier	 SH
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
,	TokenNameCOMMA	
SH	TokenNameIdentifier	 SH
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
,	TokenNameCOMMA	
SH	TokenNameIdentifier	 SH
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
S	TokenNameIdentifier	 S
,	TokenNameCOMMA	
SOFT	TokenNameIdentifier	 SOFT
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
,	TokenNameCOMMA	
SH	TokenNameIdentifier	 SH
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
S	TokenNameIdentifier	 S
,	TokenNameCOMMA	
SOFT	TokenNameIdentifier	 SOFT
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
adjectiveEndings	TokenNameIdentifier	 adjective Endings
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
O	TokenNameIdentifier	 O
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
O	TokenNameIdentifier	 O
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
O	TokenNameIdentifier	 O
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
X	TokenNameIdentifier	 X
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
X	TokenNameIdentifier	 X
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
U	TokenNameIdentifier	 U
,	TokenNameCOMMA	
IU	TokenNameIdentifier	 IU
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
IU	TokenNameIdentifier	 IU
,	TokenNameCOMMA	
IU	TokenNameIdentifier	 IU
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
IA	TokenNameIdentifier	 IA
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
IA	TokenNameIdentifier	 IA
,	TokenNameCOMMA	
IA	TokenNameIdentifier	 IA
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
O	TokenNameIdentifier	 O
,	TokenNameCOMMA	
IU	TokenNameIdentifier	 IU
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
IU	TokenNameIdentifier	 IU
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
G	TokenNameIdentifier	 G
,	TokenNameCOMMA	
O	TokenNameIdentifier	 O
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
O	TokenNameIdentifier	 O
,	TokenNameCOMMA	
G	TokenNameIdentifier	 G
,	TokenNameCOMMA	
O	TokenNameIdentifier	 O
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
,	TokenNameCOMMA	
U	TokenNameIdentifier	 U
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
O	TokenNameIdentifier	 O
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
,	TokenNameCOMMA	
U	TokenNameIdentifier	 U
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
participleEndings1	TokenNameIdentifier	 participle Endings1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
SHCH	TokenNameIdentifier	 SHCH
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
N	TokenNameIdentifier	 N
,	TokenNameCOMMA	
N	TokenNameIdentifier	 N
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
V	TokenNameIdentifier	 V
,	TokenNameCOMMA	
SH	TokenNameIdentifier	 SH
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
IU	TokenNameIdentifier	 IU
,	TokenNameCOMMA	
SHCH	TokenNameIdentifier	 SHCH
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
participleEndings2	TokenNameIdentifier	 participle Endings2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
,	TokenNameCOMMA	
SH	TokenNameIdentifier	 SH
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
,	TokenNameCOMMA	
SH	TokenNameIdentifier	 SH
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
U	TokenNameIdentifier	 U
,	TokenNameCOMMA	
IU	TokenNameIdentifier	 IU
,	TokenNameCOMMA	
SHCH	TokenNameIdentifier	 SHCH
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
participle1Predessors	TokenNameIdentifier	 participle1 Predessors
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
A	TokenNameIdentifier	 A
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
IA	TokenNameIdentifier	 IA
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
reflexiveEndings	TokenNameIdentifier	 reflexive Endings
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
S	TokenNameIdentifier	 S
,	TokenNameCOMMA	
IA	TokenNameIdentifier	 IA
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
S	TokenNameIdentifier	 S
,	TokenNameCOMMA	
SOFT	TokenNameIdentifier	 SOFT
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
verbEndings1	TokenNameIdentifier	 verb Endings1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
I_	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
L	TokenNameIdentifier	 L
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
N	TokenNameIdentifier	 N
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
L	TokenNameIdentifier	 L
,	TokenNameCOMMA	
O	TokenNameIdentifier	 O
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
N	TokenNameIdentifier	 N
,	TokenNameCOMMA	
O	TokenNameIdentifier	 O
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
IU	TokenNameIdentifier	 IU
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
L	TokenNameIdentifier	 L
,	TokenNameCOMMA	
A	TokenNameIdentifier	 A
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
N	TokenNameIdentifier	 N
,	TokenNameCOMMA	
A	TokenNameIdentifier	 A
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
L	TokenNameIdentifier	 L
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
N	TokenNameIdentifier	 N
,	TokenNameCOMMA	
Y	TokenNameIdentifier	 Y
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I_	TokenNameIdentifier	 I
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
SOFT	TokenNameIdentifier	 SOFT
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
SH	TokenNameIdentifier	 SH
,	TokenNameCOMMA	
SOFT	TokenNameIdentifier	 SOFT
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
N	TokenNameIdentifier	 N
,	TokenNameCOMMA	
N	TokenNameIdentifier	 N
,	TokenNameCOMMA	
O	TokenNameIdentifier	 O
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
verbEndings2	TokenNameIdentifier	 verb Endings2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
IU	TokenNameIdentifier	 IU
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
U	TokenNameIdentifier	 U
,	TokenNameCOMMA	
IU	TokenNameIdentifier	 IU
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
N	TokenNameIdentifier	 N
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
IA	TokenNameIdentifier	 IA
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
U	TokenNameIdentifier	 U
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
L	TokenNameIdentifier	 L
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
L	TokenNameIdentifier	 L
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
L	TokenNameIdentifier	 L
,	TokenNameCOMMA	
A	TokenNameIdentifier	 A
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
L	TokenNameIdentifier	 L
,	TokenNameCOMMA	
A	TokenNameIdentifier	 A
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
N	TokenNameIdentifier	 N
,	TokenNameCOMMA	
A	TokenNameIdentifier	 A
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
L	TokenNameIdentifier	 L
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
L	TokenNameIdentifier	 L
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
L	TokenNameIdentifier	 L
,	TokenNameCOMMA	
O	TokenNameIdentifier	 O
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
L	TokenNameIdentifier	 L
,	TokenNameCOMMA	
O	TokenNameIdentifier	 O
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
N	TokenNameIdentifier	 N
,	TokenNameCOMMA	
O	TokenNameIdentifier	 O
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
U	TokenNameIdentifier	 U
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
U	TokenNameIdentifier	 U
,	TokenNameCOMMA	
IU	TokenNameIdentifier	 IU
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
N	TokenNameIdentifier	 N
,	TokenNameCOMMA	
Y	TokenNameIdentifier	 Y
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
SOFT	TokenNameIdentifier	 SOFT
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
SOFT	TokenNameIdentifier	 SOFT
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
SH	TokenNameIdentifier	 SH
,	TokenNameCOMMA	
SOFT	TokenNameIdentifier	 SOFT
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
U	TokenNameIdentifier	 U
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
verb1Predessors	TokenNameIdentifier	 verb1 Predessors
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
A	TokenNameIdentifier	 A
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
IA	TokenNameIdentifier	 IA
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nounEndings	TokenNameIdentifier	 noun Endings
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
A	TokenNameIdentifier	 A
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
U	TokenNameIdentifier	 U
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I_	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
O	TokenNameIdentifier	 O
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
U	TokenNameIdentifier	 U
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
Y	TokenNameIdentifier	 Y
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
SOFT	TokenNameIdentifier	 SOFT
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
IA	TokenNameIdentifier	 IA
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
O	TokenNameIdentifier	 O
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
SOFT	TokenNameIdentifier	 SOFT
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
IA	TokenNameIdentifier	 IA
,	TokenNameCOMMA	
X	TokenNameIdentifier	 X
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
IU	TokenNameIdentifier	 IU
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
O	TokenNameIdentifier	 O
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
O	TokenNameIdentifier	 O
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
X	TokenNameIdentifier	 X
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
SOFT	TokenNameIdentifier	 SOFT
,	TokenNameCOMMA	
IU	TokenNameIdentifier	 IU
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
IA	TokenNameIdentifier	 IA
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
SOFT	TokenNameIdentifier	 SOFT
,	TokenNameCOMMA	
IA	TokenNameIdentifier	 IA
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
IA	TokenNameIdentifier	 IA
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
IA	TokenNameIdentifier	 IA
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
IA	TokenNameIdentifier	 IA
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
IA	TokenNameIdentifier	 IA
,	TokenNameCOMMA	
X	TokenNameIdentifier	 X
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
I	TokenNameIdentifier	 I
,	TokenNameCOMMA	
IA	TokenNameIdentifier	 IA
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
,	TokenNameCOMMA	
I	TokenNameIdentifier	 I
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
superlativeEndings	TokenNameIdentifier	 superlative Endings
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
,	TokenNameCOMMA	
SH	TokenNameIdentifier	 SH
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
I_	TokenNameIdentifier	 I
,	TokenNameCOMMA	
SH	TokenNameIdentifier	 SH
,	TokenNameCOMMA	
E	TokenNameIdentifier	 E
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
derivationalEndings	TokenNameIdentifier	 derivational Endings
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
O	TokenNameIdentifier	 O
,	TokenNameCOMMA	
S	TokenNameIdentifier	 S
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
O	TokenNameIdentifier	 O
,	TokenNameCOMMA	
S	TokenNameIdentifier	 S
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
SOFT	TokenNameIdentifier	 SOFT
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * RussianStemmer constructor comment. */	TokenNameCOMMENT_JAVADOC	 RussianStemmer constructor comment. 
public	TokenNamepublic	
RussianStemmer	TokenNameIdentifier	 Russian Stemmer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adjectival ending is an adjective ending, * optionally preceded by participle ending. * Creation date: (17/03/2002 12:14:58 AM) * @param stemmingZone java.lang.StringBuilder */	TokenNameCOMMENT_JAVADOC	 Adjectival ending is an adjective ending, optionally preceded by participle ending. Creation date: (17/03/2002 12:14:58 AM) @param stemmingZone java.lang.StringBuilder 
private	TokenNameprivate	
boolean	TokenNameboolean	
adjectival	TokenNameIdentifier	 adjectival
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// look for adjective ending in a stemming zone 	TokenNameCOMMENT_LINE	look for adjective ending in a stemming zone 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
findAndRemoveEnding	TokenNameIdentifier	 find And Remove Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
adjectiveEndings	TokenNameIdentifier	 adjective Endings
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// if adjective ending was found, try for participle ending. 	TokenNameCOMMENT_LINE	if adjective ending was found, try for participle ending. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
findAndRemoveEnding	TokenNameIdentifier	 find And Remove Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
participleEndings1	TokenNameIdentifier	 participle Endings1
,	TokenNameCOMMA	
participle1Predessors	TokenNameIdentifier	 participle1 Predessors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
findAndRemoveEnding	TokenNameIdentifier	 find And Remove Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
participleEndings2	TokenNameIdentifier	 participle Endings2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Derivational endings * Creation date: (17/03/2002 12:14:58 AM) * @param stemmingZone java.lang.StringBuilder */	TokenNameCOMMENT_JAVADOC	 Derivational endings Creation date: (17/03/2002 12:14:58 AM) @param stemmingZone java.lang.StringBuilder 
private	TokenNameprivate	
boolean	TokenNameboolean	
derivational	TokenNameIdentifier	 derivational
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
endingLength	TokenNameIdentifier	 ending Length
=	TokenNameEQUAL	
findEnding	TokenNameIdentifier	 find Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
derivationalEndings	TokenNameIdentifier	 derivational Endings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endingLength	TokenNameIdentifier	 ending Length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// no derivational ending found 	TokenNameCOMMENT_LINE	no derivational ending found 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// Ensure that the ending locates in R2 	TokenNameCOMMENT_LINE	Ensure that the ending locates in R2 
if	TokenNameif	
(	TokenNameLPAREN	
R2	TokenNameIdentifier	 R2
-	TokenNameMINUS	
RV	TokenNameIdentifier	 RV
<=	TokenNameLESS_EQUAL	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
endingLength	TokenNameIdentifier	 ending Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
endingLength	TokenNameIdentifier	 ending Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Finds ending among given ending class and returns the length of ending found(0, if not found). * Creation date: (17/03/2002 8:18:34 PM) */	TokenNameCOMMENT_JAVADOC	 Finds ending among given ending class and returns the length of ending found(0, if not found). Creation date: (17/03/2002 8:18:34 PM) 
private	TokenNameprivate	
int	TokenNameint	
findEnding	TokenNameIdentifier	 find Ending
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
theEndingClass	TokenNameIdentifier	 the Ending Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
theEndingClass	TokenNameIdentifier	 the Ending Class
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
theEnding	TokenNameIdentifier	 the Ending
=	TokenNameEQUAL	
theEndingClass	TokenNameIdentifier	 the Ending Class
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// check if the ending is bigger than stemming zone 	TokenNameCOMMENT_LINE	check if the ending is bigger than stemming zone 
if	TokenNameif	
(	TokenNameLPAREN	
startIndex	TokenNameIdentifier	 start Index
<	TokenNameLESS	
theEnding	TokenNameIdentifier	 the Ending
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
stemmingIndex	TokenNameIdentifier	 stemming Index
=	TokenNameEQUAL	
startIndex	TokenNameIdentifier	 start Index
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
theEnding	TokenNameIdentifier	 the Ending
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
stemmingIndex	TokenNameIdentifier	 stemming Index
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
theEnding	TokenNameIdentifier	 the Ending
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// check if ending was found 	TokenNameCOMMENT_LINE	check if ending was found 
if	TokenNameif	
(	TokenNameLPAREN	
match	TokenNameIdentifier	 match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
theEndingClass	TokenNameIdentifier	 the Ending Class
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// cut ending 	TokenNameCOMMENT_LINE	cut ending 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
findEnding	TokenNameIdentifier	 find Ending
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
theEndingClass	TokenNameIdentifier	 the Ending Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
findEnding	TokenNameIdentifier	 find Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
theEndingClass	TokenNameIdentifier	 the Ending Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finds the ending among the given class of endings and removes it from stemming zone. * Creation date: (17/03/2002 8:18:34 PM) */	TokenNameCOMMENT_JAVADOC	 Finds the ending among the given class of endings and removes it from stemming zone. Creation date: (17/03/2002 8:18:34 PM) 
private	TokenNameprivate	
boolean	TokenNameboolean	
findAndRemoveEnding	TokenNameIdentifier	 find And Remove Ending
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
theEndingClass	TokenNameIdentifier	 the Ending Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
endingLength	TokenNameIdentifier	 ending Length
=	TokenNameEQUAL	
findEnding	TokenNameIdentifier	 find Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
theEndingClass	TokenNameIdentifier	 the Ending Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endingLength	TokenNameIdentifier	 ending Length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
endingLength	TokenNameIdentifier	 ending Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// cut the ending found 	TokenNameCOMMENT_LINE	cut the ending found 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Finds the ending among the given class of endings, then checks if this ending was * preceded by any of given predecessors, and if so, removes it from stemming zone. * Creation date: (17/03/2002 8:18:34 PM) */	TokenNameCOMMENT_JAVADOC	 Finds the ending among the given class of endings, then checks if this ending was preceded by any of given predecessors, and if so, removes it from stemming zone. Creation date: (17/03/2002 8:18:34 PM) 
private	TokenNameprivate	
boolean	TokenNameboolean	
findAndRemoveEnding	TokenNameIdentifier	 find And Remove Ending
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
theEndingClass	TokenNameIdentifier	 the Ending Class
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
thePredessors	TokenNameIdentifier	 the Predessors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
endingLength	TokenNameIdentifier	 ending Length
=	TokenNameEQUAL	
findEnding	TokenNameIdentifier	 find Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
theEndingClass	TokenNameIdentifier	 the Ending Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endingLength	TokenNameIdentifier	 ending Length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
predessorLength	TokenNameIdentifier	 predessor Length
=	TokenNameEQUAL	
findEnding	TokenNameIdentifier	 find Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
endingLength	TokenNameIdentifier	 ending Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
thePredessors	TokenNameIdentifier	 the Predessors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
predessorLength	TokenNameIdentifier	 predessor Length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
endingLength	TokenNameIdentifier	 ending Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// cut the ending found 	TokenNameCOMMENT_LINE	cut the ending found 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Marks positions of RV, R1 and R2 in a given word. * Creation date: (16/03/2002 3:40:11 PM) */	TokenNameCOMMENT_JAVADOC	 Marks positions of RV, R1 and R2 in a given word. Creation date: (16/03/2002 3:40:11 PM) 
private	TokenNameprivate	
void	TokenNamevoid	
markPositions	TokenNameIdentifier	 mark Positions
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RV	TokenNameIdentifier	 RV
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// R1 = 0; 	TokenNameCOMMENT_LINE	R1 = 0; 
R2	TokenNameIdentifier	 R2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// find RV 	TokenNameCOMMENT_LINE	find RV 
while	TokenNamewhile	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
&&	TokenNameAND_AND	
!	TokenNameNOT	
isVowel	TokenNameIdentifier	 is Vowel
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// RV zone is empty 	TokenNameCOMMENT_LINE	RV zone is empty 
RV	TokenNameIdentifier	 RV
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// find R1 	TokenNameCOMMENT_LINE	find R1 
while	TokenNamewhile	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
&&	TokenNameAND_AND	
isVowel	TokenNameIdentifier	 is Vowel
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// R1 zone is empty 	TokenNameCOMMENT_LINE	R1 zone is empty 
// R1 = i; 	TokenNameCOMMENT_LINE	R1 = i; 
// find R2 	TokenNameCOMMENT_LINE	find R2 
while	TokenNamewhile	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
&&	TokenNameAND_AND	
!	TokenNameNOT	
isVowel	TokenNameIdentifier	 is Vowel
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// R2 zone is empty 	TokenNameCOMMENT_LINE	R2 zone is empty 
while	TokenNamewhile	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
&&	TokenNameAND_AND	
isVowel	TokenNameIdentifier	 is Vowel
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// R2 zone is empty 	TokenNameCOMMENT_LINE	R2 zone is empty 
R2	TokenNameIdentifier	 R2
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if character is a vowel.. * Creation date: (16/03/2002 10:47:03 PM) * @return boolean * @param letter char */	TokenNameCOMMENT_JAVADOC	 Checks if character is a vowel.. Creation date: (16/03/2002 10:47:03 PM) @return boolean @param letter char 
private	TokenNameprivate	
boolean	TokenNameboolean	
isVowel	TokenNameIdentifier	 is Vowel
(	TokenNameLPAREN	
char	TokenNamechar	
letter	TokenNameIdentifier	 letter
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
vowels	TokenNameIdentifier	 vowels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
letter	TokenNameIdentifier	 letter
==	TokenNameEQUAL_EQUAL	
vowels	TokenNameIdentifier	 vowels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Noun endings. * Creation date: (17/03/2002 12:14:58 AM) * @param stemmingZone java.lang.StringBuilder */	TokenNameCOMMENT_JAVADOC	 Noun endings. Creation date: (17/03/2002 12:14:58 AM) @param stemmingZone java.lang.StringBuilder 
private	TokenNameprivate	
boolean	TokenNameboolean	
noun	TokenNameIdentifier	 noun
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
findAndRemoveEnding	TokenNameIdentifier	 find And Remove Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
nounEndings	TokenNameIdentifier	 noun Endings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Perfective gerund endings. * Creation date: (17/03/2002 12:14:58 AM) * @param stemmingZone java.lang.StringBuilder */	TokenNameCOMMENT_JAVADOC	 Perfective gerund endings. Creation date: (17/03/2002 12:14:58 AM) @param stemmingZone java.lang.StringBuilder 
private	TokenNameprivate	
boolean	TokenNameboolean	
perfectiveGerund	TokenNameIdentifier	 perfective Gerund
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
findAndRemoveEnding	TokenNameIdentifier	 find And Remove Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
perfectiveGerundEndings1	TokenNameIdentifier	 perfective Gerund Endings1
,	TokenNameCOMMA	
perfectiveGerund1Predessors	TokenNameIdentifier	 perfective Gerund1 Predessors
)	TokenNameRPAREN	
||	TokenNameOR_OR	
findAndRemoveEnding	TokenNameIdentifier	 find And Remove Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
perfectiveGerundEndings2	TokenNameIdentifier	 perfective Gerund Endings2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reflexive endings. * Creation date: (17/03/2002 12:14:58 AM) * @param stemmingZone java.lang.StringBuilder */	TokenNameCOMMENT_JAVADOC	 Reflexive endings. Creation date: (17/03/2002 12:14:58 AM) @param stemmingZone java.lang.StringBuilder 
private	TokenNameprivate	
boolean	TokenNameboolean	
reflexive	TokenNameIdentifier	 reflexive
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
findAndRemoveEnding	TokenNameIdentifier	 find And Remove Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
reflexiveEndings	TokenNameIdentifier	 reflexive Endings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Insert the method's description here. * Creation date: (17/03/2002 12:14:58 AM) * @param stemmingZone java.lang.StringBuilder */	TokenNameCOMMENT_JAVADOC	 Insert the method's description here. Creation date: (17/03/2002 12:14:58 AM) @param stemmingZone java.lang.StringBuilder 
private	TokenNameprivate	
boolean	TokenNameboolean	
removeI	TokenNameIdentifier	 remove I
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
I	TokenNameIdentifier	 I
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Insert the method's description here. * Creation date: (17/03/2002 12:14:58 AM) * @param stemmingZone java.lang.StringBuilder */	TokenNameCOMMENT_JAVADOC	 Insert the method's description here. Creation date: (17/03/2002 12:14:58 AM) @param stemmingZone java.lang.StringBuilder 
private	TokenNameprivate	
boolean	TokenNameboolean	
removeSoft	TokenNameIdentifier	 remove Soft
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SOFT	TokenNameIdentifier	 SOFT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Finds the stem for given Russian word. * Creation date: (16/03/2002 3:36:48 PM) * @return java.lang.String * @param input java.lang.String */	TokenNameCOMMENT_JAVADOC	 Finds the stem for given Russian word. Creation date: (16/03/2002 3:36:48 PM) @return java.lang.String @param input java.lang.String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
markPositions	TokenNameIdentifier	 mark Positions
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
RV	TokenNameIdentifier	 RV
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
//RV wasn't detected, nothing to stem 	TokenNameCOMMENT_LINE	RV wasn't detected, nothing to stem 
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
RV	TokenNameIdentifier	 RV
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// stemming goes on in RV 	TokenNameCOMMENT_LINE	stemming goes on in RV 
// Step 1 	TokenNameCOMMENT_LINE	Step 1 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
perfectiveGerund	TokenNameIdentifier	 perfective Gerund
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reflexive	TokenNameIdentifier	 reflexive
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
adjectival	TokenNameIdentifier	 adjectival
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
verb	TokenNameIdentifier	 verb
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
)	TokenNameRPAREN	
noun	TokenNameIdentifier	 noun
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Step 2 	TokenNameCOMMENT_LINE	Step 2 
removeI	TokenNameIdentifier	 remove I
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Step 3 	TokenNameCOMMENT_LINE	Step 3 
derivational	TokenNameIdentifier	 derivational
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Step 4 	TokenNameCOMMENT_LINE	Step 4 
superlative	TokenNameIdentifier	 superlative
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
undoubleN	TokenNameIdentifier	 undouble N
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeSoft	TokenNameIdentifier	 remove Soft
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return result 	TokenNameCOMMENT_LINE	return result 
return	TokenNamereturn	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
RV	TokenNameIdentifier	 RV
)	TokenNameRPAREN	
+	TokenNamePLUS	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Superlative endings. * Creation date: (17/03/2002 12:14:58 AM) * @param stemmingZone java.lang.StringBuilder */	TokenNameCOMMENT_JAVADOC	 Superlative endings. Creation date: (17/03/2002 12:14:58 AM) @param stemmingZone java.lang.StringBuilder 
private	TokenNameprivate	
boolean	TokenNameboolean	
superlative	TokenNameIdentifier	 superlative
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
findAndRemoveEnding	TokenNameIdentifier	 find And Remove Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
superlativeEndings	TokenNameIdentifier	 superlative Endings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Undoubles N. * Creation date: (17/03/2002 12:14:58 AM) * @param stemmingZone java.lang.StringBuilder */	TokenNameCOMMENT_JAVADOC	 Undoubles N. Creation date: (17/03/2002 12:14:58 AM) @param stemmingZone java.lang.StringBuilder 
private	TokenNameprivate	
boolean	TokenNameboolean	
undoubleN	TokenNameIdentifier	 undouble N
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
doubleN	TokenNameIdentifier	 double N
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
N	TokenNameIdentifier	 N
,	TokenNameCOMMA	
N	TokenNameIdentifier	 N
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
findEnding	TokenNameIdentifier	 find Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
doubleN	TokenNameIdentifier	 double N
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Verb endings. * Creation date: (17/03/2002 12:14:58 AM) * @param stemmingZone java.lang.StringBuilder */	TokenNameCOMMENT_JAVADOC	 Verb endings. Creation date: (17/03/2002 12:14:58 AM) @param stemmingZone java.lang.StringBuilder 
private	TokenNameprivate	
boolean	TokenNameboolean	
verb	TokenNameIdentifier	 verb
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
stemmingZone	TokenNameIdentifier	 stemming Zone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
findAndRemoveEnding	TokenNameIdentifier	 find And Remove Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
verbEndings1	TokenNameIdentifier	 verb Endings1
,	TokenNameCOMMA	
verb1Predessors	TokenNameIdentifier	 verb1 Predessors
)	TokenNameRPAREN	
||	TokenNameOR_OR	
findAndRemoveEnding	TokenNameIdentifier	 find And Remove Ending
(	TokenNameLPAREN	
stemmingZone	TokenNameIdentifier	 stemming Zone
,	TokenNameCOMMA	
verbEndings2	TokenNameIdentifier	 verb Endings2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Static method for stemming. */	TokenNameCOMMENT_JAVADOC	 Static method for stemming. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
stemWord	TokenNameIdentifier	 stem Word
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
theWord	TokenNameIdentifier	 the Word
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RussianStemmer	TokenNameIdentifier	 Russian Stemmer
stemmer	TokenNameIdentifier	 stemmer
=	TokenNameEQUAL	
new	TokenNamenew	
RussianStemmer	TokenNameIdentifier	 Russian Stemmer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
theWord	TokenNameIdentifier	 the Word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
