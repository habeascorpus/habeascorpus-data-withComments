package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BitSet	TokenNameIdentifier	 Bit Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StemmerUtil	TokenNameIdentifier	 Stemmer Util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Normalizes the Unicode representation of text in Indian languages. * <p> * Follows guidelines from Unicode 5.2, chapter 6, South Asian Scripts I * and graphical decompositions from http://ldc.upenn.edu/myl/IndianScriptsUnicode.html * </p> */	TokenNameCOMMENT_JAVADOC	 Normalizes the Unicode representation of text in Indian languages. <p> Follows guidelines from Unicode 5.2, chapter 6, South Asian Scripts I and graphical decompositions from http://ldc.upenn.edu/myl/IndianScriptsUnicode.html </p> 
public	TokenNamepublic	
class	TokenNameclass	
IndicNormalizer	TokenNameIdentifier	 Indic Normalizer
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ScriptData	TokenNameIdentifier	 Script Data
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
BitSet	TokenNameIdentifier	 Bit Set
decompMask	TokenNameIdentifier	 decomp Mask
;	TokenNameSEMICOLON	
ScriptData	TokenNameIdentifier	 Script Data
(	TokenNameLPAREN	
int	TokenNameint	
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
int	TokenNameint	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
flag	TokenNameIdentifier	 flag
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
,	TokenNameCOMMA	
ScriptData	TokenNameIdentifier	 Script Data
>	TokenNameGREATER	
scripts	TokenNameIdentifier	 scripts
=	TokenNameEQUAL	
new	TokenNamenew	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
,	TokenNameCOMMA	
ScriptData	TokenNameIdentifier	 Script Data
>	TokenNameGREATER	
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
ub	TokenNameIdentifier	 ub
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scripts	TokenNameIdentifier	 scripts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ub	TokenNameIdentifier	 ub
)	TokenNameRPAREN	
.	TokenNameDOT	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
{	TokenNameLBRACE	
scripts	TokenNameIdentifier	 scripts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
,	TokenNameCOMMA	
new	TokenNamenew	
ScriptData	TokenNameIdentifier	 Script Data
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0900	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scripts	TokenNameIdentifier	 scripts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
BENGALI	TokenNameIdentifier	 BENGALI
,	TokenNameCOMMA	
new	TokenNamenew	
ScriptData	TokenNameIdentifier	 Script Data
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0980	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scripts	TokenNameIdentifier	 scripts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
,	TokenNameCOMMA	
new	TokenNamenew	
ScriptData	TokenNameIdentifier	 Script Data
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scripts	TokenNameIdentifier	 scripts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
,	TokenNameCOMMA	
new	TokenNamenew	
ScriptData	TokenNameIdentifier	 Script Data
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scripts	TokenNameIdentifier	 scripts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ORIYA	TokenNameIdentifier	 ORIYA
,	TokenNameCOMMA	
new	TokenNamenew	
ScriptData	TokenNameIdentifier	 Script Data
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scripts	TokenNameIdentifier	 scripts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
TAMIL	TokenNameIdentifier	 TAMIL
,	TokenNameCOMMA	
new	TokenNamenew	
ScriptData	TokenNameIdentifier	 Script Data
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scripts	TokenNameIdentifier	 scripts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
TELUGU	TokenNameIdentifier	 TELUGU
,	TokenNameCOMMA	
new	TokenNamenew	
ScriptData	TokenNameIdentifier	 Script Data
(	TokenNameLPAREN	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scripts	TokenNameIdentifier	 scripts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
KANNADA	TokenNameIdentifier	 KANNADA
,	TokenNameCOMMA	
new	TokenNamenew	
ScriptData	TokenNameIdentifier	 Script Data
(	TokenNameLPAREN	
128	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scripts	TokenNameIdentifier	 scripts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
,	TokenNameCOMMA	
new	TokenNamenew	
ScriptData	TokenNameIdentifier	 Script Data
(	TokenNameLPAREN	
256	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Decompositions according to Unicode 5.2, * and http://ldc.upenn.edu/myl/IndianScriptsUnicode.html * * Most of these are not handled by unicode normalization anyway. * * The numbers here represent offsets into the respective codepages, * with -1 representing null and 0xFF representing zero-width joiner. * * the columns are: ch1, ch2, ch3, res, flags * ch1, ch2, and ch3 are the decomposition * res is the composition, and flags are the scripts to which it applies. */	TokenNameCOMMENT_JAVADOC	 Decompositions according to Unicode 5.2, and http://ldc.upenn.edu/myl/IndianScriptsUnicode.html * Most of these are not handled by unicode normalization anyway. * The numbers here represent offsets into the respective codepages, with -1 representing null and 0xFF representing zero-width joiner. * the columns are: ch1, ch2, ch3, res, flags ch1, ch2, and ch3 are the decomposition res is the composition, and flags are the scripts to which it applies. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
decompositions	TokenNameIdentifier	 decompositions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
/* devanagari, gujarati vowel candra O */	TokenNameCOMMENT_BLOCK	 devanagari, gujarati vowel candra O 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari short O */	TokenNameCOMMENT_BLOCK	 devanagari short O 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, gujarati letter O */	TokenNameCOMMENT_BLOCK	 devanagari, gujarati letter O 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari letter AI, gujarati letter AU */	TokenNameCOMMENT_BLOCK	 devanagari letter AI, gujarati letter AU 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, bengali, gurmukhi, gujarati, oriya AA */	TokenNameCOMMENT_BLOCK	 devanagari, bengali, gurmukhi, gujarati, oriya AA 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
BENGALI	TokenNameIdentifier	 BENGALI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
ORIYA	TokenNameIdentifier	 ORIYA
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari letter candra A */	TokenNameCOMMENT_BLOCK	 devanagari letter candra A 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* gujarati vowel candra E */	TokenNameCOMMENT_BLOCK	 gujarati vowel candra E 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari letter short A */	TokenNameCOMMENT_BLOCK	 devanagari letter short A 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x04	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* gujarati letter E */	TokenNameCOMMENT_BLOCK	 gujarati letter E 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* gurmukhi, gujarati letter AI */	TokenNameCOMMENT_BLOCK	 gurmukhi, gujarati letter AI 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, gujarati vowel candra O */	TokenNameCOMMENT_BLOCK	 devanagari, gujarati vowel candra O 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari short O */	TokenNameCOMMENT_BLOCK	 devanagari short O 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, gujarati letter O */	TokenNameCOMMENT_BLOCK	 devanagari, gujarati letter O 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari letter AI, gurmukhi letter AU, gujarati letter AU */	TokenNameCOMMENT_BLOCK	 devanagari letter AI, gurmukhi letter AU, gujarati letter AU 
{	TokenNameLBRACE	
0x05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, gujarati vowel candra O */	TokenNameCOMMENT_BLOCK	 devanagari, gujarati vowel candra O 
{	TokenNameLBRACE	
0x06	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari short O */	TokenNameCOMMENT_BLOCK	 devanagari short O 
{	TokenNameLBRACE	
0x06	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, gujarati letter O */	TokenNameCOMMENT_BLOCK	 devanagari, gujarati letter O 
{	TokenNameLBRACE	
0x06	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari letter AI, gujarati letter AU */	TokenNameCOMMENT_BLOCK	 devanagari letter AI, gujarati letter AU 
{	TokenNameLBRACE	
0x06	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* malayalam letter II */	TokenNameCOMMENT_BLOCK	 malayalam letter II 
{	TokenNameLBRACE	
0x07	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x08	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari letter UU */	TokenNameCOMMENT_BLOCK	 devanagari letter UU 
{	TokenNameLBRACE	
0x09	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* tamil, malayalam letter UU (some styles) */	TokenNameCOMMENT_BLOCK	 tamil, malayalam letter UU (some styles) 
{	TokenNameLBRACE	
0x09	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
TAMIL	TokenNameIdentifier	 TAMIL
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* malayalam letter AI */	TokenNameCOMMENT_BLOCK	 malayalam letter AI 
{	TokenNameLBRACE	
0x0E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari candra E */	TokenNameCOMMENT_BLOCK	 devanagari candra E 
{	TokenNameLBRACE	
0x0F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari short E */	TokenNameCOMMENT_BLOCK	 devanagari short E 
{	TokenNameLBRACE	
0x0F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari AI */	TokenNameCOMMENT_BLOCK	 devanagari AI 
{	TokenNameLBRACE	
0x0F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* oriya AI */	TokenNameCOMMENT_BLOCK	 oriya AI 
{	TokenNameLBRACE	
0x0F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
ORIYA	TokenNameIdentifier	 ORIYA
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* malayalam letter OO */	TokenNameCOMMENT_BLOCK	 malayalam letter OO 
{	TokenNameLBRACE	
0x12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* telugu, kannada letter AU */	TokenNameCOMMENT_BLOCK	 telugu, kannada letter AU 
{	TokenNameLBRACE	
0x12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
TELUGU	TokenNameIdentifier	 TELUGU
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
KANNADA	TokenNameIdentifier	 KANNADA
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* telugu letter OO */	TokenNameCOMMENT_BLOCK	 telugu letter OO 
{	TokenNameLBRACE	
0x12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x55	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
TELUGU	TokenNameIdentifier	 TELUGU
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* tamil, malayalam letter AU */	TokenNameCOMMENT_BLOCK	 tamil, malayalam letter AU 
{	TokenNameLBRACE	
0x12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
TAMIL	TokenNameIdentifier	 TAMIL
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* oriya letter AU */	TokenNameCOMMENT_BLOCK	 oriya letter AU 
{	TokenNameLBRACE	
0x13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
ORIYA	TokenNameIdentifier	 ORIYA
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari qa */	TokenNameCOMMENT_BLOCK	 devanagari qa 
{	TokenNameLBRACE	
0x15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x58	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, gurmukhi khha */	TokenNameCOMMENT_BLOCK	 devanagari, gurmukhi khha 
{	TokenNameLBRACE	
0x16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, gurmukhi ghha */	TokenNameCOMMENT_BLOCK	 devanagari, gurmukhi ghha 
{	TokenNameLBRACE	
0x17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, gurmukhi za */	TokenNameCOMMENT_BLOCK	 devanagari, gurmukhi za 
{	TokenNameLBRACE	
0x1C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari dddha, bengali, oriya rra */	TokenNameCOMMENT_BLOCK	 devanagari dddha, bengali, oriya rra 
{	TokenNameLBRACE	
0x21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
BENGALI	TokenNameIdentifier	 BENGALI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
ORIYA	TokenNameIdentifier	 ORIYA
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, bengali, oriya rha */	TokenNameCOMMENT_BLOCK	 devanagari, bengali, oriya rha 
{	TokenNameLBRACE	
0x22	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
BENGALI	TokenNameIdentifier	 BENGALI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
ORIYA	TokenNameIdentifier	 ORIYA
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* malayalam chillu nn */	TokenNameCOMMENT_BLOCK	 malayalam chillu nn 
{	TokenNameLBRACE	
0x23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* bengali khanda ta */	TokenNameCOMMENT_BLOCK	 bengali khanda ta 
{	TokenNameLBRACE	
0x24	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
BENGALI	TokenNameIdentifier	 BENGALI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari nnna */	TokenNameCOMMENT_BLOCK	 devanagari nnna 
{	TokenNameLBRACE	
0x28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* malayalam chillu n */	TokenNameCOMMENT_BLOCK	 malayalam chillu n 
{	TokenNameLBRACE	
0x28	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, gurmukhi fa */	TokenNameCOMMENT_BLOCK	 devanagari, gurmukhi fa 
{	TokenNameLBRACE	
0x2B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, bengali yya */	TokenNameCOMMENT_BLOCK	 devanagari, bengali yya 
{	TokenNameLBRACE	
0x2F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
BENGALI	TokenNameIdentifier	 BENGALI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* telugu letter vocalic R */	TokenNameCOMMENT_BLOCK	 telugu letter vocalic R 
{	TokenNameLBRACE	
0x2C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
TELUGU	TokenNameIdentifier	 TELUGU
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari rra */	TokenNameCOMMENT_BLOCK	 devanagari rra 
{	TokenNameLBRACE	
0x30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* malayalam chillu rr */	TokenNameCOMMENT_BLOCK	 malayalam chillu rr 
{	TokenNameLBRACE	
0x30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* malayalam chillu l */	TokenNameCOMMENT_BLOCK	 malayalam chillu l 
{	TokenNameLBRACE	
0x32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari llla */	TokenNameCOMMENT_BLOCK	 devanagari llla 
{	TokenNameLBRACE	
0x33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* malayalam chillu ll */	TokenNameCOMMENT_BLOCK	 malayalam chillu ll 
{	TokenNameLBRACE	
0x33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* telugu letter MA */	TokenNameCOMMENT_BLOCK	 telugu letter MA 
{	TokenNameLBRACE	
0x35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
TELUGU	TokenNameIdentifier	 TELUGU
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, gujarati vowel sign candra O */	TokenNameCOMMENT_BLOCK	 devanagari, gujarati vowel sign candra O 
{	TokenNameLBRACE	
0x3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari vowel sign short O */	TokenNameCOMMENT_BLOCK	 devanagari vowel sign short O 
{	TokenNameLBRACE	
0x3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, gujarati vowel sign O */	TokenNameCOMMENT_BLOCK	 devanagari, gujarati vowel sign O 
{	TokenNameLBRACE	
0x3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* devanagari, gujarati vowel sign AU */	TokenNameCOMMENT_BLOCK	 devanagari, gujarati vowel sign AU 
{	TokenNameLBRACE	
0x3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
DEVANAGARI	TokenNameIdentifier	 DEVANAGARI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GUJARATI	TokenNameIdentifier	 GUJARATI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* kannada vowel sign II */	TokenNameCOMMENT_BLOCK	 kannada vowel sign II 
{	TokenNameLBRACE	
0x3F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x55	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
KANNADA	TokenNameIdentifier	 KANNADA
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* gurmukhi vowel sign UU (when stacking) */	TokenNameCOMMENT_BLOCK	 gurmukhi vowel sign UU (when stacking) 
{	TokenNameLBRACE	
0x41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* tamil, malayalam vowel sign O */	TokenNameCOMMENT_BLOCK	 tamil, malayalam vowel sign O 
{	TokenNameLBRACE	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
TAMIL	TokenNameIdentifier	 TAMIL
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* kannada vowel sign OO */	TokenNameCOMMENT_BLOCK	 kannada vowel sign OO 
{	TokenNameLBRACE	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x55	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
KANNADA	TokenNameIdentifier	 KANNADA
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* kannada vowel sign O */	TokenNameCOMMENT_BLOCK	 kannada vowel sign O 
{	TokenNameLBRACE	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
KANNADA	TokenNameIdentifier	 KANNADA
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* malayalam vowel sign AI (if reordered twice) */	TokenNameCOMMENT_BLOCK	 malayalam vowel sign AI (if reordered twice) 
{	TokenNameLBRACE	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* telugu, kannada vowel sign EE */	TokenNameCOMMENT_BLOCK	 telugu, kannada vowel sign EE 
{	TokenNameLBRACE	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x55	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
TELUGU	TokenNameIdentifier	 TELUGU
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
KANNADA	TokenNameIdentifier	 KANNADA
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* telugu, kannada vowel sign AI */	TokenNameCOMMENT_BLOCK	 telugu, kannada vowel sign AI 
{	TokenNameLBRACE	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x48	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
TELUGU	TokenNameIdentifier	 TELUGU
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
KANNADA	TokenNameIdentifier	 KANNADA
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* tamil, malayalam vowel sign AU */	TokenNameCOMMENT_BLOCK	 tamil, malayalam vowel sign AU 
{	TokenNameLBRACE	
0x46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
TAMIL	TokenNameIdentifier	 TAMIL
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* bengali, oriya vowel sign O, tamil, malayalam vowel sign OO */	TokenNameCOMMENT_BLOCK	 bengali, oriya vowel sign O, tamil, malayalam vowel sign OO 
{	TokenNameLBRACE	
0x47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
BENGALI	TokenNameIdentifier	 BENGALI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
ORIYA	TokenNameIdentifier	 ORIYA
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
TAMIL	TokenNameIdentifier	 TAMIL
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
MALAYALAM	TokenNameIdentifier	 MALAYALAM
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* bengali, oriya vowel sign AU */	TokenNameCOMMENT_BLOCK	 bengali, oriya vowel sign AU 
{	TokenNameLBRACE	
0x47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
BENGALI	TokenNameIdentifier	 BENGALI
)	TokenNameRPAREN	
|	TokenNameOR	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
ORIYA	TokenNameIdentifier	 ORIYA
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* kannada vowel sign OO */	TokenNameCOMMENT_BLOCK	 kannada vowel sign OO 
{	TokenNameLBRACE	
0x4A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x55	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
KANNADA	TokenNameIdentifier	 KANNADA
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* gurmukhi letter I */	TokenNameCOMMENT_BLOCK	 gurmukhi letter I 
{	TokenNameLBRACE	
0x72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x07	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* gurmukhi letter II */	TokenNameCOMMENT_BLOCK	 gurmukhi letter II 
{	TokenNameLBRACE	
0x72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x08	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* gurmukhi letter EE */	TokenNameCOMMENT_BLOCK	 gurmukhi letter EE 
{	TokenNameLBRACE	
0x72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* gurmukhi letter U */	TokenNameCOMMENT_BLOCK	 gurmukhi letter U 
{	TokenNameLBRACE	
0x73	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* gurmukhi letter UU */	TokenNameCOMMENT_BLOCK	 gurmukhi letter UU 
{	TokenNameLBRACE	
0x73	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* gurmukhi letter OO */	TokenNameCOMMENT_BLOCK	 gurmukhi letter OO 
{	TokenNameLBRACE	
0x73	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
(	TokenNameLPAREN	
GURMUKHI	TokenNameIdentifier	 GURMUKHI
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ScriptData	TokenNameIdentifier	 Script Data
sd	TokenNameIdentifier	 sd
:	TokenNameCOLON	
scripts	TokenNameIdentifier	 scripts
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
decompMask	TokenNameIdentifier	 decomp Mask
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
0x7F	TokenNameIntegerLiteral	
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
decompositions	TokenNameIdentifier	 decompositions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
decompositions	TokenNameIdentifier	 decompositions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
decompositions	TokenNameIdentifier	 decompositions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
&	TokenNameAND	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
decompMask	TokenNameIdentifier	 decomp Mask
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Normalizes input text, and returns the new length. * The length will always be less than or equal to the existing length. * * @param text input text * @param len valid length * @return normalized length */	TokenNameCOMMENT_JAVADOC	 Normalizes input text, and returns the new length. The length will always be less than or equal to the existing length. * @param text input text @param len valid length @return normalized length 
public	TokenNamepublic	
int	TokenNameint	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
.	TokenNameDOT	
of	TokenNameIdentifier	 of
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ScriptData	TokenNameIdentifier	 Script Data
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
scripts	TokenNameIdentifier	 scripts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sd	TokenNameIdentifier	 sd
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
decompMask	TokenNameIdentifier	 decomp Mask
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
block	TokenNameIdentifier	 block
,	TokenNameCOMMA	
sd	TokenNameIdentifier	 sd
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compose into standard form any compositions in the decompositions table. */	TokenNameCOMMENT_JAVADOC	 Compose into standard form any compositions in the decompositions table. 
private	TokenNameprivate	
int	TokenNameint	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
int	TokenNameint	
ch0	TokenNameIdentifier	 ch0
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
block0	TokenNameIdentifier	 block0
,	TokenNameCOMMA	
ScriptData	TokenNameIdentifier	 Script Data
sd	TokenNameIdentifier	 sd
,	TokenNameCOMMA	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
/* need at least 2 chars! */	TokenNameCOMMENT_BLOCK	 need at least 2 chars! 
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
block1	TokenNameIdentifier	 block1
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
.	TokenNameDOT	
of	TokenNameIdentifier	 of
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
block1	TokenNameIdentifier	 block1
!=	TokenNameNOT_EQUAL	
block0	TokenNameIdentifier	 block0
)	TokenNameRPAREN	
/* needs to be the same writing system */	TokenNameCOMMENT_BLOCK	 needs to be the same writing system 
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
int	TokenNameint	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
block2	TokenNameIdentifier	 block2
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UnicodeBlock	TokenNameIdentifier	 Unicode Block
.	TokenNameDOT	
of	TokenNameIdentifier	 of
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
// ZWJ 	TokenNameCOMMENT_LINE	ZWJ 
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
block2	TokenNameIdentifier	 block2
!=	TokenNameNOT_EQUAL	
block1	TokenNameIdentifier	 block1
)	TokenNameRPAREN	
// still allow a 2-char match 	TokenNameCOMMENT_LINE	still allow a 2-char match 
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
decompositions	TokenNameIdentifier	 decompositions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
decompositions	TokenNameIdentifier	 decompositions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
ch0	TokenNameIdentifier	 ch0
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
decompositions	TokenNameIdentifier	 decompositions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
decompositions	TokenNameIdentifier	 decompositions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
ch1	TokenNameIdentifier	 ch1
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
decompositions	TokenNameIdentifier	 decompositions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
decompositions	TokenNameIdentifier	 decompositions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
decompositions	TokenNameIdentifier	 decompositions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
decompositions	TokenNameIdentifier	 decompositions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
