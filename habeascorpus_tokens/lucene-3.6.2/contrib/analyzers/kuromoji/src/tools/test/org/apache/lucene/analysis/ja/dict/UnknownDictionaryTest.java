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
CSVUtil	TokenNameIdentifier	 CSV Util
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
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UnknownDictionaryWriter	TokenNameIdentifier	 Unknown Dictionary Writer
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
UnknownDictionaryTest	TokenNameIdentifier	 Unknown Dictionary Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILENAME	TokenNameIdentifier	 FILENAME
=	TokenNameEQUAL	
"unk-tokeninfo-dict.obj"	TokenNameStringLiteral	unk-tokeninfo-dict.obj
;	TokenNameSEMICOLON	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testPutCharacterCategory	TokenNameIdentifier	 test Put Character Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnknownDictionaryWriter	TokenNameIdentifier	 Unknown Dictionary Writer
unkDic	TokenNameIdentifier	 unk Dic
=	TokenNameEQUAL	
new	TokenNamenew	
UnknownDictionaryWriter	TokenNameIdentifier	 Unknown Dictionary Writer
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
putCharacterCategory	TokenNameIdentifier	 put Character Category
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"DUMMY_NAME"	TokenNameStringLiteral	DUMMY_NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
putCharacterCategory	TokenNameIdentifier	 put Character Category
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"KATAKANA"	TokenNameStringLiteral	KATAKANA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
putCharacterCategory	TokenNameIdentifier	 put Character Category
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"DEFAULT"	TokenNameStringLiteral	DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
putCharacterCategory	TokenNameIdentifier	 put Character Category
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"GREEK"	TokenNameStringLiteral	GREEK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
putCharacterCategory	TokenNameIdentifier	 put Character Category
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"HIRAGANA"	TokenNameStringLiteral	HIRAGANA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
putCharacterCategory	TokenNameIdentifier	 put Character Category
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"KATAKANA"	TokenNameStringLiteral	KATAKANA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
putCharacterCategory	TokenNameIdentifier	 put Character Category
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"KANJI"	TokenNameStringLiteral	KANJI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testPut	TokenNameIdentifier	 test Put
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnknownDictionaryWriter	TokenNameIdentifier	 Unknown Dictionary Writer
unkDic	TokenNameIdentifier	 unk Dic
=	TokenNameEQUAL	
new	TokenNamenew	
UnknownDictionaryWriter	TokenNameIdentifier	 Unknown Dictionary Writer
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSVUtil	TokenNameIdentifier	 CSV Util
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"KANJI,1285,11426,名詞,一般,*,*,*,*,*,*,*"	TokenNameStringLiteral	KANJI,1285,11426,名詞,一般,*,*,*,*,*,*,*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
entry1	TokenNameIdentifier	 entry1
=	TokenNameEQUAL	
"ALPHA,1285,1285,13398,名詞,一般,*,*,*,*,*,*,*"	TokenNameStringLiteral	ALPHA,1285,1285,13398,名詞,一般,*,*,*,*,*,*,*
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
entry2	TokenNameIdentifier	 entry2
=	TokenNameEQUAL	
"HIRAGANA,1285,1285,13069,名詞,一般,*,*,*,*,*,*,*"	TokenNameStringLiteral	HIRAGANA,1285,1285,13069,名詞,一般,*,*,*,*,*,*,*
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
entry3	TokenNameIdentifier	 entry3
=	TokenNameEQUAL	
"KANJI,1285,1285,11426,名詞,一般,*,*,*,*,*,*,*"	TokenNameStringLiteral	KANJI,1285,1285,11426,名詞,一般,*,*,*,*,*,*,*
;	TokenNameSEMICOLON	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
putCharacterCategory	TokenNameIdentifier	 put Character Category
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"ALPHA"	TokenNameStringLiteral	ALPHA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
putCharacterCategory	TokenNameIdentifier	 put Character Category
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"HIRAGANA"	TokenNameStringLiteral	HIRAGANA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
putCharacterCategory	TokenNameIdentifier	 put Character Category
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"KANJI"	TokenNameStringLiteral	KANJI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSVUtil	TokenNameIdentifier	 CSV Util
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
entry1	TokenNameIdentifier	 entry1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSVUtil	TokenNameIdentifier	 CSV Util
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
entry2	TokenNameIdentifier	 entry2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unkDic	TokenNameIdentifier	 unk Dic
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSVUtil	TokenNameIdentifier	 CSV Util
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
entry3	TokenNameIdentifier	 entry3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
