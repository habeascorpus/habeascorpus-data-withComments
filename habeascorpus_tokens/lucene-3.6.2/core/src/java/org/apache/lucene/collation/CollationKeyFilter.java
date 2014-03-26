package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
collation	TokenNameIdentifier	 collation
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Collator	TokenNameIdentifier	 Collator
;	TokenNameSEMICOLON	
/** * <p> * Converts each token into its {@link java.text.CollationKey}, and then * encodes the CollationKey with {@link IndexableBinaryStringTools}, to allow * it to be stored as an index term. * </p> * <p> * <strong>WARNING:</strong> Make sure you use exactly the same Collator at * index and query time -- CollationKeys are only comparable when produced by * the same Collator. Since {@link java.text.RuleBasedCollator}s are not * independently versioned, it is unsafe to search against stored * CollationKeys unless the following are exactly the same (best practice is * to store this information with the index and check that they remain the * same at query time): * </p> * <ol> * <li>JVM vendor</li> * <li>JVM version, including patch version</li> * <li> * The language (and country and variant, if specified) of the Locale * used when constructing the collator via * {@link Collator#getInstance(java.util.Locale)}. * </li> * <li> * The collation strength used - see {@link Collator#setStrength(int)} * </li> * </ol> * <p> * The <code>ICUCollationKeyFilter</code> in the icu package of Lucene's * contrib area uses ICU4J's Collator, which makes its * version available, thus allowing collation to be versioned independently * from the JVM. ICUCollationKeyFilter is also significantly faster and * generates significantly shorter keys than CollationKeyFilter. See * <a href="http://site.icu-project.org/charts/collation-icu4j-sun" * >http://site.icu-project.org/charts/collation-icu4j-sun</a> for key * generation timing and key length comparisons between ICU4J and * java.text.Collator over several languages. * </p> * <p> * CollationKeys generated by java.text.Collators are not compatible * with those those generated by ICU Collators. Specifically, if you use * CollationKeyFilter to generate index terms, do not use * ICUCollationKeyFilter on the query side, or vice versa. * </p> */	TokenNameCOMMENT_JAVADOC	 <p> Converts each token into its {@link java.text.CollationKey}, and then encodes the CollationKey with {@link IndexableBinaryStringTools}, to allow it to be stored as an index term. </p> <p> <strong>WARNING:</strong> Make sure you use exactly the same Collator at index and query time -- CollationKeys are only comparable when produced by the same Collator. Since {@link java.text.RuleBasedCollator}s are not independently versioned, it is unsafe to search against stored CollationKeys unless the following are exactly the same (best practice is to store this information with the index and check that they remain the same at query time): </p> <ol> <li>JVM vendor</li> <li>JVM version, including patch version</li> <li> The language (and country and variant, if specified) of the Locale used when constructing the collator via {@link Collator#getInstance(java.util.Locale)}. </li> <li> The collation strength used - see {@link Collator#setStrength(int)} </li> </ol> <p> The <code>ICUCollationKeyFilter</code> in the icu package of Lucene's contrib area uses ICU4J's Collator, which makes its version available, thus allowing collation to be versioned independently from the JVM. ICUCollationKeyFilter is also significantly faster and generates significantly shorter keys than CollationKeyFilter. See <a href="http://site.icu-project.org/charts/collation-icu4j-sun" >http://site.icu-project.org/charts/collation-icu4j-sun</a> for key generation timing and key length comparisons between ICU4J and java.text.Collator over several languages. </p> <p> CollationKeys generated by java.text.Collators are not compatible with those those generated by ICU Collators. Specifically, if you use CollationKeyFilter to generate index terms, do not use ICUCollationKeyFilter on the query side, or vice versa. </p> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CollationKeyFilter	TokenNameIdentifier	 Collation Key Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
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
/** * @param input Source token stream * @param collator CollationKey generator */	TokenNameCOMMENT_JAVADOC	 @param input Source token stream @param collator CollationKey generator 
public	TokenNamepublic	
CollationKeyFilter	TokenNameIdentifier	 Collation Key Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clone in case JRE doesnt properly sync, 	TokenNameCOMMENT_LINE	clone in case JRE doesnt properly sync, 
// or to reduce contention in case they do 	TokenNameCOMMENT_LINE	or to reduce contention in case they do 
this	TokenNamethis	
.	TokenNameDOT	
collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Collator	TokenNameIdentifier	 Collator
)	TokenNameRPAREN	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
collationKey	TokenNameIdentifier	 collation Key
=	TokenNameEQUAL	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
getCollationKey	TokenNameIdentifier	 get Collation Key
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
encodedLength	TokenNameIdentifier	 encoded Length
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
collationKey	TokenNameIdentifier	 collation Key
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
collationKey	TokenNameIdentifier	 collation Key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
encodedLength	TokenNameIdentifier	 encoded Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
encodedLength	TokenNameIdentifier	 encoded Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
collationKey	TokenNameIdentifier	 collation Key
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
collationKey	TokenNameIdentifier	 collation Key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
encodedLength	TokenNameIdentifier	 encoded Length
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
