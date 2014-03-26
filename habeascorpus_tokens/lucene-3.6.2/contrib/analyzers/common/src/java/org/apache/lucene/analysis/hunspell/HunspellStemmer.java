package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
hunspell	TokenNameIdentifier	 hunspell
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
Scanner	TokenNameIdentifier	 Scanner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
CharArraySet	TokenNameIdentifier	 Char Array Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CharacterUtils	TokenNameIdentifier	 Character Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * HunspellStemmer uses the affix rules declared in the HunspellDictionary to generate one or more stems for a word. It * conforms to the algorithm in the original hunspell algorithm, including recursive suffix stripping. */	TokenNameCOMMENT_JAVADOC	 HunspellStemmer uses the affix rules declared in the HunspellDictionary to generate one or more stems for a word. It conforms to the algorithm in the original hunspell algorithm, including recursive suffix stripping. 
public	TokenNamepublic	
class	TokenNameclass	
HunspellStemmer	TokenNameIdentifier	 Hunspell Stemmer
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RECURSION_CAP	TokenNameIdentifier	 RECURSION  CAP
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
HunspellDictionary	TokenNameIdentifier	 Hunspell Dictionary
dictionary	TokenNameIdentifier	 dictionary
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
segment	TokenNameIdentifier	 segment
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharacterUtils	TokenNameIdentifier	 Character Utils
charUtils	TokenNameIdentifier	 char Utils
=	TokenNameEQUAL	
CharacterUtils	TokenNameIdentifier	 Character Utils
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_34	TokenNameIdentifier	 LUCENE 34
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constructs a new HunspellStemmer which will use the provided HunspellDictionary to create its stems * * @param dictionary HunspellDictionary that will be used to create the stems */	TokenNameCOMMENT_JAVADOC	 Constructs a new HunspellStemmer which will use the provided HunspellDictionary to create its stems * @param dictionary HunspellDictionary that will be used to create the stems 
public	TokenNamepublic	
HunspellStemmer	TokenNameIdentifier	 Hunspell Stemmer
(	TokenNameLPAREN	
HunspellDictionary	TokenNameIdentifier	 Hunspell Dictionary
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dictionary	TokenNameIdentifier	 dictionary
=	TokenNameEQUAL	
dictionary	TokenNameIdentifier	 dictionary
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the stem(s) of the provided word * * @param word Word to find the stems for * @return List of stems for the word */	TokenNameCOMMENT_JAVADOC	 Find the stem(s) of the provided word * @param word Word to find the stems for @return List of stems for the word 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the stem(s) of the provided word * * @param word Word to find the stems for * @return List of stems for the word */	TokenNameCOMMENT_JAVADOC	 Find the stem(s) of the provided word * @param word Word to find the stems for @return List of stems for the word 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
char	TokenNamechar	
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
stems	TokenNameIdentifier	 stems
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
lookupWord	TokenNameIdentifier	 lookup Word
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stems	TokenNameIdentifier	 stems
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Stem	TokenNameIdentifier	 Stem
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stems	TokenNameIdentifier	 stems
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
stems	TokenNameIdentifier	 stems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the unique stem(s) of the provided word * * @param word Word to find the stems for * @return List of stems for the word */	TokenNameCOMMENT_JAVADOC	 Find the unique stem(s) of the provided word * @param word Word to find the stems for @return List of stems for the word 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
uniqueStems	TokenNameIdentifier	 unique Stems
(	TokenNameLPAREN	
char	TokenNamechar	
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
stems	TokenNameIdentifier	 stems
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharArraySet	TokenNameIdentifier	 Char Array Set
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
isIgnoreCase	TokenNameIdentifier	 is Ignore Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
lookupWord	TokenNameIdentifier	 lookup Word
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stems	TokenNameIdentifier	 stems
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Stem	TokenNameIdentifier	 Stem
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
otherStems	TokenNameIdentifier	 other Stems
=	TokenNameEQUAL	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Stem	TokenNameIdentifier	 Stem
s	TokenNameIdentifier	 s
:	TokenNameCOLON	
otherStems	TokenNameIdentifier	 other Stems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
stem	TokenNameIdentifier	 stem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stems	TokenNameIdentifier	 stems
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
stem	TokenNameIdentifier	 stem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
stems	TokenNameIdentifier	 stems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================================================= Helper Methods ================================================ 	TokenNameCOMMENT_LINE	================================================= Helper Methods ================================================ 
/** * Generates a list of stems for the provided word * * @param word Word to generate the stems for * @param flags Flags from a previous stemming step that need to be cross-checked with any affixes in this recursive step * @param recursionDepth Level of recursion this stemming step is at * @return List of stems, pr an empty if no stems are found */	TokenNameCOMMENT_JAVADOC	 Generates a list of stems for the provided word * @param word Word to generate the stems for @param flags Flags from a previous stemming step that need to be cross-checked with any affixes in this recursive step @param recursionDepth Level of recursion this stemming step is at @return List of stems, pr an empty if no stems are found 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
char	TokenNamechar	
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
flags	TokenNameIdentifier	 flags
,	TokenNameCOMMA	
int	TokenNameint	
recursionDepth	TokenNameIdentifier	 recursion Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
stems	TokenNameIdentifier	 stems
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>	TokenNameGREATER	
suffixes	TokenNameIdentifier	 suffixes
=	TokenNameEQUAL	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
lookupSuffix	TokenNameIdentifier	 lookup Suffix
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
suffixes	TokenNameIdentifier	 suffixes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
suffix	TokenNameIdentifier	 suffix
:	TokenNameCOLON	
suffixes	TokenNameIdentifier	 suffixes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasCrossCheckedFlag	TokenNameIdentifier	 has Cross Checked Flag
(	TokenNameLPAREN	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
getFlag	TokenNameIdentifier	 get Flag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
deAffixedLength	TokenNameIdentifier	 de Affixed Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
getAppend	TokenNameIdentifier	 get Append
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: can we do this in-place? 	TokenNameCOMMENT_LINE	TODO: can we do this in-place? 
String	TokenNameIdentifier	 String
strippedWord	TokenNameIdentifier	 stripped Word
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
deAffixedLength	TokenNameIdentifier	 de Affixed Length
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
getStrip	TokenNameIdentifier	 get Strip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
stemList	TokenNameIdentifier	 stem List
=	TokenNameEQUAL	
applyAffix	TokenNameIdentifier	 apply Affix
(	TokenNameLPAREN	
strippedWord	TokenNameIdentifier	 stripped Word
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
strippedWord	TokenNameIdentifier	 stripped Word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
suffix	TokenNameIdentifier	 suffix
,	TokenNameCOMMA	
recursionDepth	TokenNameIdentifier	 recursion Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Stem	TokenNameIdentifier	 Stem
stem	TokenNameIdentifier	 stem
:	TokenNameCOLON	
stemList	TokenNameIdentifier	 stem List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stem	TokenNameIdentifier	 stem
.	TokenNameDOT	
addSuffix	TokenNameIdentifier	 add Suffix
(	TokenNameLPAREN	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stems	TokenNameIdentifier	 stems
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
stemList	TokenNameIdentifier	 stem List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
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
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>	TokenNameGREATER	
prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
lookupPrefix	TokenNameIdentifier	 lookup Prefix
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefixes	TokenNameIdentifier	 prefixes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
prefix	TokenNameIdentifier	 prefix
:	TokenNameCOLON	
prefixes	TokenNameIdentifier	 prefixes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasCrossCheckedFlag	TokenNameIdentifier	 has Cross Checked Flag
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
getFlag	TokenNameIdentifier	 get Flag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
deAffixedStart	TokenNameIdentifier	 de Affixed Start
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
getAppend	TokenNameIdentifier	 get Append
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
deAffixedLength	TokenNameIdentifier	 de Affixed Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
deAffixedStart	TokenNameIdentifier	 de Affixed Start
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
strippedWord	TokenNameIdentifier	 stripped Word
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
getStrip	TokenNameIdentifier	 get Strip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
deAffixedStart	TokenNameIdentifier	 de Affixed Start
,	TokenNameCOMMA	
deAffixedLength	TokenNameIdentifier	 de Affixed Length
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
stemList	TokenNameIdentifier	 stem List
=	TokenNameEQUAL	
applyAffix	TokenNameIdentifier	 apply Affix
(	TokenNameLPAREN	
strippedWord	TokenNameIdentifier	 stripped Word
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
strippedWord	TokenNameIdentifier	 stripped Word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
recursionDepth	TokenNameIdentifier	 recursion Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Stem	TokenNameIdentifier	 Stem
stem	TokenNameIdentifier	 stem
:	TokenNameCOLON	
stemList	TokenNameIdentifier	 stem List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stem	TokenNameIdentifier	 stem
.	TokenNameDOT	
addPrefix	TokenNameIdentifier	 add Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stems	TokenNameIdentifier	 stems
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
stemList	TokenNameIdentifier	 stem List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
stems	TokenNameIdentifier	 stems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Applies the affix rule to the given word, producing a list of stems if any are found * * @param strippedWord Word the affix has been removed and the strip added * @param affix HunspellAffix representing the affix rule itself * @param recursionDepth Level of recursion this stemming step is at * @return List of stems for the word, or an empty list if none are found */	TokenNameCOMMENT_JAVADOC	 Applies the affix rule to the given word, producing a list of stems if any are found * @param strippedWord Word the affix has been removed and the strip added @param affix HunspellAffix representing the affix rule itself @param recursionDepth Level of recursion this stemming step is at @return List of stems for the word, or an empty list if none are found 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
applyAffix	TokenNameIdentifier	 apply Affix
(	TokenNameLPAREN	
char	TokenNamechar	
strippedWord	TokenNameIdentifier	 stripped Word
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
affix	TokenNameIdentifier	 affix
,	TokenNameCOMMA	
int	TokenNameint	
recursionDepth	TokenNameIdentifier	 recursion Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
isIgnoreCase	TokenNameIdentifier	 is Ignore Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
strippedWord	TokenNameIdentifier	 stripped Word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toChars	TokenNameIdentifier	 to Chars
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
charUtils	TokenNameIdentifier	 char Utils
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
strippedWord	TokenNameIdentifier	 stripped Word
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
strippedWord	TokenNameIdentifier	 stripped Word
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
segment	TokenNameIdentifier	 segment
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segment	TokenNameIdentifier	 segment
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
strippedWord	TokenNameIdentifier	 stripped Word
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
checkCondition	TokenNameIdentifier	 check Condition
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
stems	TokenNameIdentifier	 stems
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellWord	TokenNameIdentifier	 Hunspell Word
>	TokenNameGREATER	
words	TokenNameIdentifier	 words
=	TokenNameEQUAL	
dictionary	TokenNameIdentifier	 dictionary
.	TokenNameDOT	
lookupWord	TokenNameIdentifier	 lookup Word
(	TokenNameLPAREN	
strippedWord	TokenNameIdentifier	 stripped Word
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
words	TokenNameIdentifier	 words
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
HunspellWord	TokenNameIdentifier	 Hunspell Word
hunspellWord	TokenNameIdentifier	 hunspell Word
:	TokenNameCOLON	
words	TokenNameIdentifier	 words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hunspellWord	TokenNameIdentifier	 hunspell Word
.	TokenNameDOT	
hasFlag	TokenNameIdentifier	 has Flag
(	TokenNameLPAREN	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
getFlag	TokenNameIdentifier	 get Flag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stems	TokenNameIdentifier	 stems
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Stem	TokenNameIdentifier	 Stem
(	TokenNameLPAREN	
strippedWord	TokenNameIdentifier	 stripped Word
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
isCrossProduct	TokenNameIdentifier	 is Cross Product
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
recursionDepth	TokenNameIdentifier	 recursion Depth
<	TokenNameLESS	
RECURSION_CAP	TokenNameIdentifier	 RECURSION  CAP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stems	TokenNameIdentifier	 stems
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
strippedWord	TokenNameIdentifier	 stripped Word
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
affix	TokenNameIdentifier	 affix
.	TokenNameDOT	
getAppendFlags	TokenNameIdentifier	 get Append Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
++	TokenNamePLUS_PLUS	
recursionDepth	TokenNameIdentifier	 recursion Depth
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
stems	TokenNameIdentifier	 stems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if the given flag cross checks with the given array of flags * * @param flag Flag to cross check with the array of flags * @param flags Array of flags to cross check against. Can be {@code null} * @return {@code true} if the flag is found in the array or the array is {@code null}, {@code false} otherwise */	TokenNameCOMMENT_JAVADOC	 Checks if the given flag cross checks with the given array of flags * @param flag Flag to cross check with the array of flags @param flags Array of flags to cross check against. Can be {@code null} @return {@code true} if the flag is found in the array or the array is {@code null}, {@code false} otherwise 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasCrossCheckedFlag	TokenNameIdentifier	 has Cross Checked Flag
(	TokenNameLPAREN	
char	TokenNamechar	
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
flags	TokenNameIdentifier	 flags
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stem represents all information known about a stem of a word. This includes the stem, and the prefixes and suffixes * that were used to change the word into the stem. */	TokenNameCOMMENT_JAVADOC	 Stem represents all information known about a stem of a word. This includes the stem, and the prefixes and suffixes that were used to change the word into the stem. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Stem	TokenNameIdentifier	 Stem
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>	TokenNameGREATER	
prefixes	TokenNameIdentifier	 prefixes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>	TokenNameGREATER	
suffixes	TokenNameIdentifier	 suffixes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
stem	TokenNameIdentifier	 stem
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
stemLength	TokenNameIdentifier	 stem Length
;	TokenNameSEMICOLON	
/** * Creates a new Stem wrapping the given word stem * * @param stem Stem of a word */	TokenNameCOMMENT_JAVADOC	 Creates a new Stem wrapping the given word stem * @param stem Stem of a word 
public	TokenNamepublic	
Stem	TokenNameIdentifier	 Stem
(	TokenNameLPAREN	
char	TokenNamechar	
stem	TokenNameIdentifier	 stem
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
stemLength	TokenNameIdentifier	 stem Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
stem	TokenNameIdentifier	 stem
=	TokenNameEQUAL	
stem	TokenNameIdentifier	 stem
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
stemLength	TokenNameIdentifier	 stem Length
=	TokenNameEQUAL	
stemLength	TokenNameIdentifier	 stem Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a prefix to the list of prefixes used to generate this stem. Because it is assumed that prefixes are added * depth first, the prefix is added to the front of the list * * @param prefix Prefix to add to the list of prefixes for this stem */	TokenNameCOMMENT_JAVADOC	 Adds a prefix to the list of prefixes used to generate this stem. Because it is assumed that prefixes are added depth first, the prefix is added to the front of the list * @param prefix Prefix to add to the list of prefixes for this stem 
public	TokenNamepublic	
void	TokenNamevoid	
addPrefix	TokenNameIdentifier	 add Prefix
(	TokenNameLPAREN	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixes	TokenNameIdentifier	 prefixes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a suffix to the list of suffixes used to generate this stem. Because it is assumed that suffixes are added * depth first, the suffix is added to the end of the list * * @param suffix Suffix to add to the list of suffixes for this stem */	TokenNameCOMMENT_JAVADOC	 Adds a suffix to the list of suffixes used to generate this stem. Because it is assumed that suffixes are added depth first, the suffix is added to the end of the list * @param suffix Suffix to add to the list of suffixes for this stem 
public	TokenNamepublic	
void	TokenNamevoid	
addSuffix	TokenNameIdentifier	 add Suffix
(	TokenNameLPAREN	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
suffixes	TokenNameIdentifier	 suffixes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the list of prefixes used to generate the stem * * @return List of prefixes used to generate the stem or an empty list if no prefixes were required */	TokenNameCOMMENT_JAVADOC	 Returns the list of prefixes used to generate the stem * @return List of prefixes used to generate the stem or an empty list if no prefixes were required 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>	TokenNameGREATER	
getPrefixes	TokenNameIdentifier	 get Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefixes	TokenNameIdentifier	 prefixes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the list of suffixes used to generate the stem * * @return List of suffixes used to generate the stem or an empty list if no suffixes were required */	TokenNameCOMMENT_JAVADOC	 Returns the list of suffixes used to generate the stem * @return List of suffixes used to generate the stem or an empty list if no suffixes were required 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
>	TokenNameGREATER	
getSuffixes	TokenNameIdentifier	 get Suffixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
suffixes	TokenNameIdentifier	 suffixes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the actual word stem itself * * @return Word stem itself */	TokenNameCOMMENT_JAVADOC	 Returns the actual word stem itself * @return Word stem itself 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getStem	TokenNameIdentifier	 get Stem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stem	TokenNameIdentifier	 stem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the stemLength */	TokenNameCOMMENT_JAVADOC	 @return the stemLength 
public	TokenNamepublic	
int	TokenNameint	
getStemLength	TokenNameIdentifier	 get Stem Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stemLength	TokenNameIdentifier	 stem Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStemString	TokenNameIdentifier	 get Stem String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
stem	TokenNameIdentifier	 stem
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stemLength	TokenNameIdentifier	 stem Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ================================================= Entry Point =================================================== 	TokenNameCOMMENT_LINE	================================================= Entry Point =================================================== 
/** * HunspellStemmer entry point. Accepts two arguments: location of affix file and location of dic file * * @param args Program arguments. Should contain location of affix file and location of dic file * @throws IOException Can be thrown while reading from the files * @throws ParseException Can be thrown while parsing the files */	TokenNameCOMMENT_JAVADOC	 HunspellStemmer entry point. Accepts two arguments: location of affix file and location of dic file * @param args Program arguments. Should contain location of affix file and location of dic file @throws IOException Can be thrown while reading from the files @throws ParseException Can be thrown while parsing the files 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage: HunspellStemmer [-i] <affix location> <dic location>"	TokenNameStringLiteral	usage: HunspellStemmer [-i] <affix location> <dic location>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-i"	TokenNameStringLiteral	-i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ignoreCase	TokenNameIdentifier	 ignore Case
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Ignoring case. All stems will be returned lowercased"	TokenNameStringLiteral	Ignoring case. All stems will be returned lowercased
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
InputStream	TokenNameIdentifier	 Input Stream
affixInputStream	TokenNameIdentifier	 affix Input Stream
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
dicInputStream	TokenNameIdentifier	 dic Input Stream
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HunspellDictionary	TokenNameIdentifier	 Hunspell Dictionary
dictionary	TokenNameIdentifier	 dictionary
=	TokenNameEQUAL	
new	TokenNamenew	
HunspellDictionary	TokenNameIdentifier	 Hunspell Dictionary
(	TokenNameLPAREN	
affixInputStream	TokenNameIdentifier	 affix Input Stream
,	TokenNameCOMMA	
dicInputStream	TokenNameIdentifier	 dic Input Stream
,	TokenNameCOMMA	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_34	TokenNameIdentifier	 LUCENE 34
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
affixInputStream	TokenNameIdentifier	 affix Input Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dicInputStream	TokenNameIdentifier	 dic Input Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HunspellStemmer	TokenNameIdentifier	 Hunspell Stemmer
stemmer	TokenNameIdentifier	 stemmer
=	TokenNameEQUAL	
new	TokenNamenew	
HunspellStemmer	TokenNameIdentifier	 Hunspell Stemmer
(	TokenNameLPAREN	
dictionary	TokenNameIdentifier	 dictionary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Scanner	TokenNameIdentifier	 Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
new	TokenNamenew	
Scanner	TokenNameIdentifier	 Scanner
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"> "	TokenNameStringLiteral	> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
hasNextLine	TokenNameIdentifier	 has Next Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
nextLine	TokenNameIdentifier	 next Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"exit"	TokenNameStringLiteral	exit
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
printStemResults	TokenNameIdentifier	 print Stem Results
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
stemmer	TokenNameIdentifier	 stemmer
.	TokenNameDOT	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"> "	TokenNameStringLiteral	> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints the results of the stemming of a word * * @param originalWord Word that has been stemmed * @param stems Stems of the word */	TokenNameCOMMENT_JAVADOC	 Prints the results of the stemming of a word * @param originalWord Word that has been stemmed @param stems Stems of the word 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
printStemResults	TokenNameIdentifier	 print Stem Results
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
originalWord	TokenNameIdentifier	 original Word
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Stem	TokenNameIdentifier	 Stem
>	TokenNameGREATER	
stems	TokenNameIdentifier	 stems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"stem("	TokenNameStringLiteral	stem(
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
originalWord	TokenNameIdentifier	 original Word
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Stem	TokenNameIdentifier	 Stem
stem	TokenNameIdentifier	 stem
:	TokenNameCOLON	
stems	TokenNameIdentifier	 stems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"- "	TokenNameStringLiteral	- 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
stem	TokenNameIdentifier	 stem
.	TokenNameDOT	
getStem	TokenNameIdentifier	 get Stem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
prefix	TokenNameIdentifier	 prefix
:	TokenNameCOLON	
stem	TokenNameIdentifier	 stem
.	TokenNameDOT	
getPrefixes	TokenNameIdentifier	 get Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
getAppend	TokenNameIdentifier	 get Append
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"+"	TokenNameStringLiteral	+
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasText	TokenNameIdentifier	 has Text
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
getStrip	TokenNameIdentifier	 get Strip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
getStrip	TokenNameIdentifier	 get Strip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
stem	TokenNameIdentifier	 stem
.	TokenNameDOT	
getStem	TokenNameIdentifier	 get Stem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
suffix	TokenNameIdentifier	 suffix
:	TokenNameCOLON	
stem	TokenNameIdentifier	 stem
.	TokenNameDOT	
getSuffixes	TokenNameIdentifier	 get Suffixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasText	TokenNameIdentifier	 has Text
(	TokenNameLPAREN	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
getStrip	TokenNameIdentifier	 get Strip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
getStrip	TokenNameIdentifier	 get Strip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"+"	TokenNameStringLiteral	+
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
getAppend	TokenNameIdentifier	 get Append
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Simple utility to check if the given String has any text * * @param str String to check if it has any text * @return {@code true} if the String has text, {@code false} otherwise */	TokenNameCOMMENT_JAVADOC	 Simple utility to check if the given String has any text * @param str String to check if it has any text @return {@code true} if the String has text, {@code false} otherwise 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
hasText	TokenNameIdentifier	 has Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
