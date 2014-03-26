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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
TokenFilter	TokenNameIdentifier	 Token Filter
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
TokenStream	TokenNameIdentifier	 Token Stream
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
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
Normalizer	TokenNameIdentifier	 Normalizer
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
Normalizer2	TokenNameIdentifier	 Normalizer2
;	TokenNameSEMICOLON	
/** * Normalize token text with ICU's {@link com.ibm.icu.text.Normalizer2} * <p> * With this filter, you can normalize text in the following ways: * <ul> * <li> NFKC Normalization, Case Folding, and removing Ignorables (the default) * <li> Using a standard Normalization mode (NFC, NFD, NFKC, NFKD) * <li> Based on rules from a custom normalization mapping. * </ul> * <p> * If you use the defaults, this filter is a simple way to standardize Unicode text * in a language-independent way for search: * <ul> * <li> The case folding that it does can be seen as a replacement for * LowerCaseFilter: For example, it handles cases such as the Greek sigma, so that * "Μάϊος" and "ΜΆΪΟΣ" will match correctly. * <li> The normalization will standardizes different forms of the same * character in Unicode. For example, CJK full-width numbers will be standardized * to their ASCII forms. * <li> Ignorables such as Zero-Width Joiner and Variation Selectors are removed. * These are typically modifier characters that affect display. * </ul> * * @see com.ibm.icu.text.Normalizer2 * @see com.ibm.icu.text.FilteredNormalizer2 */	TokenNameCOMMENT_JAVADOC	 Normalize token text with ICU's {@link com.ibm.icu.text.Normalizer2} <p> With this filter, you can normalize text in the following ways: <ul> <li> NFKC Normalization, Case Folding, and removing Ignorables (the default) <li> Using a standard Normalization mode (NFC, NFD, NFKC, NFKD) <li> Based on rules from a custom normalization mapping. </ul> <p> If you use the defaults, this filter is a simple way to standardize Unicode text in a language-independent way for search: <ul> <li> The case folding that it does can be seen as a replacement for LowerCaseFilter: For example, it handles cases such as the Greek sigma, so that "Μάϊος" and "ΜΆΪΟΣ" will match correctly. <li> The normalization will standardizes different forms of the same character in Unicode. For example, CJK full-width numbers will be standardized to their ASCII forms. <li> Ignorables such as Zero-Width Joiner and Variation Selectors are removed. These are typically modifier characters that affect display. </ul> * @see com.ibm.icu.text.Normalizer2 @see com.ibm.icu.text.FilteredNormalizer2 
public	TokenNamepublic	
class	TokenNameclass	
ICUNormalizer2Filter	TokenNameIdentifier	 ICU Normalizer2 Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Normalizer2	TokenNameIdentifier	 Normalizer2
normalizer	TokenNameIdentifier	 normalizer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new Normalizer2Filter that combines NFKC normalization, Case * Folding, and removes Default Ignorables (NFKC_Casefold) */	TokenNameCOMMENT_JAVADOC	 Create a new Normalizer2Filter that combines NFKC normalization, Case Folding, and removes Default Ignorables (NFKC_Casefold) 
public	TokenNamepublic	
ICUNormalizer2Filter	TokenNameIdentifier	 ICU Normalizer2 Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Normalizer2	TokenNameIdentifier	 Normalizer2
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"nfkc_cf"	TokenNameStringLiteral	nfkc_cf
,	TokenNameCOMMA	
Normalizer2	TokenNameIdentifier	 Normalizer2
.	TokenNameDOT	
Mode	TokenNameIdentifier	 Mode
.	TokenNameDOT	
COMPOSE	TokenNameIdentifier	 COMPOSE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new Normalizer2Filter with the specified Normalizer2 * @param input stream * @param normalizer normalizer to use */	TokenNameCOMMENT_JAVADOC	 Create a new Normalizer2Filter with the specified Normalizer2 @param input stream @param normalizer normalizer to use 
public	TokenNamepublic	
ICUNormalizer2Filter	TokenNameIdentifier	 ICU Normalizer2 Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Normalizer2	TokenNameIdentifier	 Normalizer2
normalizer	TokenNameIdentifier	 normalizer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
normalizer	TokenNameIdentifier	 normalizer
=	TokenNameEQUAL	
normalizer	TokenNameIdentifier	 normalizer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
normalizer	TokenNameIdentifier	 normalizer
.	TokenNameDOT	
quickCheck	TokenNameIdentifier	 quick Check
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Normalizer	TokenNameIdentifier	 Normalizer
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
normalizer	TokenNameIdentifier	 normalizer
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
