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
/** * A TokenFilter that applies search term folding to Unicode text, * applying foldings from UTR#30 Character Foldings. * <p> * This filter applies the following foldings from the report to unicode text: * <ul> * <li>Accent removal * <li>Case folding * <li>Canonical duplicates folding * <li>Dashes folding * <li>Diacritic removal (including stroke, hook, descender) * <li>Greek letterforms folding * <li>Han Radical folding * <li>Hebrew Alternates folding * <li>Jamo folding * <li>Letterforms folding * <li>Math symbol folding * <li>Multigraph Expansions: All * <li>Native digit folding * <li>No-break folding * <li>Overline folding * <li>Positional forms folding * <li>Small forms folding * <li>Space folding * <li>Spacing Accents folding * <li>Subscript folding * <li>Superscript folding * <li>Suzhou Numeral folding * <li>Symbol folding * <li>Underline folding * <li>Vertical forms folding * <li>Width folding * </ul> * <p> * Additionally, Default Ignorables are removed, and text is normalized to NFKC. * All foldings, case folding, and normalization mappings are applied recursively * to ensure a fully folded and normalized result. * </p> */	TokenNameCOMMENT_JAVADOC	 A TokenFilter that applies search term folding to Unicode text, applying foldings from UTR#30 Character Foldings. <p> This filter applies the following foldings from the report to unicode text: <ul> <li>Accent removal <li>Case folding <li>Canonical duplicates folding <li>Dashes folding <li>Diacritic removal (including stroke, hook, descender) <li>Greek letterforms folding <li>Han Radical folding <li>Hebrew Alternates folding <li>Jamo folding <li>Letterforms folding <li>Math symbol folding <li>Multigraph Expansions: All <li>Native digit folding <li>No-break folding <li>Overline folding <li>Positional forms folding <li>Small forms folding <li>Space folding <li>Spacing Accents folding <li>Subscript folding <li>Superscript folding <li>Suzhou Numeral folding <li>Symbol folding <li>Underline folding <li>Vertical forms folding <li>Width folding </ul> <p> Additionally, Default Ignorables are removed, and text is normalized to NFKC. All foldings, case folding, and normalization mappings are applied recursively to ensure a fully folded and normalized result. </p> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ICUFoldingFilter	TokenNameIdentifier	 ICU Folding Filter
extends	TokenNameextends	
ICUNormalizer2Filter	TokenNameIdentifier	 ICU Normalizer2 Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Normalizer2	TokenNameIdentifier	 Normalizer2
normalizer	TokenNameIdentifier	 normalizer
=	TokenNameEQUAL	
Normalizer2	TokenNameIdentifier	 Normalizer2
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
ICUFoldingFilter	TokenNameIdentifier	 ICU Folding Filter
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"utr30.nrm"	TokenNameStringLiteral	utr30.nrm
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"utr30"	TokenNameStringLiteral	utr30
,	TokenNameCOMMA	
Normalizer2	TokenNameIdentifier	 Normalizer2
.	TokenNameDOT	
Mode	TokenNameIdentifier	 Mode
.	TokenNameDOT	
COMPOSE	TokenNameIdentifier	 COMPOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new ICUFoldingFilter on the specified input */	TokenNameCOMMENT_JAVADOC	 Create a new ICUFoldingFilter on the specified input 
public	TokenNamepublic	
ICUFoldingFilter	TokenNameIdentifier	 ICU Folding Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
normalizer	TokenNameIdentifier	 normalizer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
