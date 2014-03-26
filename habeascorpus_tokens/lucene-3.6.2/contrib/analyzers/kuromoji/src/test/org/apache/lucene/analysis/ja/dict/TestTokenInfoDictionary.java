package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
dict	TokenNameIdentifier	 dict
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ToStringUtil	TokenNameIdentifier	 To String Util
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
IntsRef	TokenNameIdentifier	 Ints Ref
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
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
UnicodeUtil	TokenNameIdentifier	 Unicode Util
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
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
FST	TokenNameIdentifier	 FST
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
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
IntsRefFSTEnum	TokenNameIdentifier	 Ints Ref FST Enum
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
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
IntsRefFSTEnum	TokenNameIdentifier	 Ints Ref FST Enum
.	TokenNameDOT	
InputOutput	TokenNameIdentifier	 Input Output
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestTokenInfoDictionary	TokenNameIdentifier	 Test Token Info Dictionary
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
/** enumerates the entire FST/lookup data and just does basic sanity checks */	TokenNameCOMMENT_JAVADOC	 enumerates the entire FST/lookup data and just does basic sanity checks 
public	TokenNamepublic	
void	TokenNamevoid	
testEnumerateAll	TokenNameIdentifier	 test Enumerate All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// just for debugging 	TokenNameCOMMENT_LINE	just for debugging 
int	TokenNameint	
numTerms	TokenNameIdentifier	 num Terms
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
numWords	TokenNameIdentifier	 num Words
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastWordId	TokenNameIdentifier	 last Word Id
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastSourceId	TokenNameIdentifier	 last Source Id
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
TokenInfoDictionary	TokenNameIdentifier	 Token Info Dictionary
tid	TokenNameIdentifier	 tid
=	TokenNameEQUAL	
TokenInfoDictionary	TokenNameIdentifier	 Token Info Dictionary
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ConnectionCosts	TokenNameIdentifier	 Connection Costs
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
ConnectionCosts	TokenNameIdentifier	 Connection Costs
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
=	TokenNameEQUAL	
tid	TokenNameIdentifier	 tid
.	TokenNameDOT	
getFST	TokenNameIdentifier	 get FST
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getInternalFST	TokenNameIdentifier	 get Internal FST
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntsRefFSTEnum	TokenNameIdentifier	 Ints Ref FST Enum
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
fstEnum	TokenNameIdentifier	 fst Enum
=	TokenNameEQUAL	
new	TokenNamenew	
IntsRefFSTEnum	TokenNameIdentifier	 Ints Ref FST Enum
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
fst	TokenNameIdentifier	 fst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputOutput	TokenNameIdentifier	 Input Output
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
mapping	TokenNameIdentifier	 mapping
;	TokenNameSEMICOLON	
IntsRef	TokenNameIdentifier	 Ints Ref
scratch	TokenNameIdentifier	 scratch
=	TokenNameEQUAL	
new	TokenNamenew	
IntsRef	TokenNameIdentifier	 Ints Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
mapping	TokenNameIdentifier	 mapping
=	TokenNameEQUAL	
fstEnum	TokenNameIdentifier	 fst Enum
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numTerms	TokenNameIdentifier	 num Terms
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
IntsRef	TokenNameIdentifier	 Ints Ref
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
mapping	TokenNameIdentifier	 mapping
.	TokenNameDOT	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
char	TokenNamechar	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
validUTF16String	TokenNameIdentifier	 valid UT F16 String
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Long	TokenNameIdentifier	 Long
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
mapping	TokenNameIdentifier	 mapping
.	TokenNameDOT	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
int	TokenNameint	
sourceId	TokenNameIdentifier	 source Id
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we walk in order, terms, sourceIds, and wordIds should always be increasing 	TokenNameCOMMENT_LINE	we walk in order, terms, sourceIds, and wordIds should always be increasing 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
sourceId	TokenNameIdentifier	 source Id
>	TokenNameGREATER	
lastSourceId	TokenNameIdentifier	 last Source Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastSourceId	TokenNameIdentifier	 last Source Id
=	TokenNameEQUAL	
sourceId	TokenNameIdentifier	 source Id
;	TokenNameSEMICOLON	
tid	TokenNameIdentifier	 tid
.	TokenNameDOT	
lookupWordIds	TokenNameIdentifier	 lookup Word Ids
(	TokenNameLPAREN	
sourceId	TokenNameIdentifier	 source Id
,	TokenNameCOMMA	
scratch	TokenNameIdentifier	 scratch
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
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numWords	TokenNameIdentifier	 num Words
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
=	TokenNameEQUAL	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
>	TokenNameGREATER	
lastWordId	TokenNameIdentifier	 last Word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastWordId	TokenNameIdentifier	 last Word Id
=	TokenNameEQUAL	
wordId	TokenNameIdentifier	 word Id
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
baseForm	TokenNameIdentifier	 base Form
=	TokenNameEQUAL	
tid	TokenNameIdentifier	 tid
.	TokenNameDOT	
getBaseForm	TokenNameIdentifier	 get Base Form
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
baseForm	TokenNameIdentifier	 base Form
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
validUTF16String	TokenNameIdentifier	 valid UT F16 String
(	TokenNameLPAREN	
baseForm	TokenNameIdentifier	 base Form
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
inflectionForm	TokenNameIdentifier	 inflection Form
=	TokenNameEQUAL	
tid	TokenNameIdentifier	 tid
.	TokenNameDOT	
getInflectionForm	TokenNameIdentifier	 get Inflection Form
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
inflectionForm	TokenNameIdentifier	 inflection Form
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
validUTF16String	TokenNameIdentifier	 valid UT F16 String
(	TokenNameLPAREN	
inflectionForm	TokenNameIdentifier	 inflection Form
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inflectionForm	TokenNameIdentifier	 inflection Form
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check that its actually an ipadic inflection form 	TokenNameCOMMENT_LINE	check that its actually an ipadic inflection form 
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
ToStringUtil	TokenNameIdentifier	 To String Util
.	TokenNameDOT	
getInflectedFormTranslation	TokenNameIdentifier	 get Inflected Form Translation
(	TokenNameLPAREN	
inflectionForm	TokenNameIdentifier	 inflection Form
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
inflectionType	TokenNameIdentifier	 inflection Type
=	TokenNameEQUAL	
tid	TokenNameIdentifier	 tid
.	TokenNameDOT	
getInflectionType	TokenNameIdentifier	 get Inflection Type
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
inflectionType	TokenNameIdentifier	 inflection Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
validUTF16String	TokenNameIdentifier	 valid UT F16 String
(	TokenNameLPAREN	
inflectionType	TokenNameIdentifier	 inflection Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inflectionType	TokenNameIdentifier	 inflection Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check that its actually an ipadic inflection type 	TokenNameCOMMENT_LINE	check that its actually an ipadic inflection type 
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
ToStringUtil	TokenNameIdentifier	 To String Util
.	TokenNameDOT	
getInflectionTypeTranslation	TokenNameIdentifier	 get Inflection Type Translation
(	TokenNameLPAREN	
inflectionType	TokenNameIdentifier	 inflection Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
leftId	TokenNameIdentifier	 left Id
=	TokenNameEQUAL	
tid	TokenNameIdentifier	 tid
.	TokenNameDOT	
getLeftId	TokenNameIdentifier	 get Left Id
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
rightId	TokenNameIdentifier	 right Id
=	TokenNameEQUAL	
tid	TokenNameIdentifier	 tid
.	TokenNameDOT	
getRightId	TokenNameIdentifier	 get Right Id
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
rightId	TokenNameIdentifier	 right Id
,	TokenNameCOMMA	
leftId	TokenNameIdentifier	 left Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tid	TokenNameIdentifier	 tid
.	TokenNameDOT	
getWordCost	TokenNameIdentifier	 get Word Cost
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
tid	TokenNameIdentifier	 tid
.	TokenNameDOT	
getPartOfSpeech	TokenNameIdentifier	 get Part Of Speech
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
validUTF16String	TokenNameIdentifier	 valid UT F16 String
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check that its actually an ipadic pos tag 	TokenNameCOMMENT_LINE	check that its actually an ipadic pos tag 
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
ToStringUtil	TokenNameIdentifier	 To String Util
.	TokenNameDOT	
getPOSTranslation	TokenNameIdentifier	 get POS Translation
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pronunciation	TokenNameIdentifier	 pronunciation
=	TokenNameEQUAL	
tid	TokenNameIdentifier	 tid
.	TokenNameDOT	
getPronunciation	TokenNameIdentifier	 get Pronunciation
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
pronunciation	TokenNameIdentifier	 pronunciation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
validUTF16String	TokenNameIdentifier	 valid UT F16 String
(	TokenNameLPAREN	
pronunciation	TokenNameIdentifier	 pronunciation
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
reading	TokenNameIdentifier	 reading
=	TokenNameEQUAL	
tid	TokenNameIdentifier	 tid
.	TokenNameDOT	
getReading	TokenNameIdentifier	 get Reading
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
reading	TokenNameIdentifier	 reading
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
validUTF16String	TokenNameIdentifier	 valid UT F16 String
(	TokenNameLPAREN	
reading	TokenNameIdentifier	 reading
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"checked "	TokenNameStringLiteral	checked 
+	TokenNamePLUS	
numTerms	TokenNameIdentifier	 num Terms
+	TokenNamePLUS	
" terms, "	TokenNameStringLiteral	 terms, 
+	TokenNamePLUS	
numWords	TokenNameIdentifier	 num Words
+	TokenNamePLUS	
" words."	TokenNameStringLiteral	 words.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
