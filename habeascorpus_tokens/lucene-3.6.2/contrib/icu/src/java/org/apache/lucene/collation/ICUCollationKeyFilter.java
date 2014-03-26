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
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Collator	TokenNameIdentifier	 Collator
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
RawCollationKey	TokenNameIdentifier	 Raw Collation Key
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
collation	TokenNameIdentifier	 collation
.	TokenNameDOT	
CollationKeyFilter	TokenNameIdentifier	 Collation Key Filter
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * <p> * Converts each token into its {@link com.ibm.icu.text.CollationKey}, and * then encodes the CollationKey with {@link IndexableBinaryStringTools}, to * allow it to be stored as an index term. * </p> * <p> * <strong>WARNING:</strong> Make sure you use exactly the same Collator at * index and query time -- CollationKeys are only comparable when produced by * the same Collator. {@link com.ibm.icu.text.RuleBasedCollator}s are * independently versioned, so it is safe to search against stored * CollationKeys if the following are exactly the same (best practice is * to store this information with the index and check that they remain the * same at query time): * </p> * <ol> * <li> * Collator version - see {@link Collator#getVersion()} * </li> * <li> * The collation strength used - see {@link Collator#setStrength(int)} * </li> * </ol> * <p> * CollationKeys generated by ICU Collators are not compatible with those * generated by java.text.Collators. Specifically, if you use * ICUCollationKeyFilter to generate index terms, do not use * {@link CollationKeyFilter} on the query side, or vice versa. * </p> * <p> * ICUCollationKeyFilter is significantly faster and generates significantly * shorter keys than CollationKeyFilter. See * <a href="http://site.icu-project.org/charts/collation-icu4j-sun" * >http://site.icu-project.org/charts/collation-icu4j-sun</a> for key * generation timing and key length comparisons between ICU4J and * java.text.Collator over several languages. * </p> */	TokenNameCOMMENT_JAVADOC	 <p> Converts each token into its {@link com.ibm.icu.text.CollationKey}, and then encodes the CollationKey with {@link IndexableBinaryStringTools}, to allow it to be stored as an index term. </p> <p> <strong>WARNING:</strong> Make sure you use exactly the same Collator at index and query time -- CollationKeys are only comparable when produced by the same Collator. {@link com.ibm.icu.text.RuleBasedCollator}s are independently versioned, so it is safe to search against stored CollationKeys if the following are exactly the same (best practice is to store this information with the index and check that they remain the same at query time): </p> <ol> <li> Collator version - see {@link Collator#getVersion()} </li> <li> The collation strength used - see {@link Collator#setStrength(int)} </li> </ol> <p> CollationKeys generated by ICU Collators are not compatible with those generated by java.text.Collators. Specifically, if you use ICUCollationKeyFilter to generate index terms, do not use {@link CollationKeyFilter} on the query side, or vice versa. </p> <p> ICUCollationKeyFilter is significantly faster and generates significantly shorter keys than CollationKeyFilter. See <a href="http://site.icu-project.org/charts/collation-icu4j-sun" >http://site.icu-project.org/charts/collation-icu4j-sun</a> for key generation timing and key length comparisons between ICU4J and java.text.Collator over several languages. </p> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ICUCollationKeyFilter	TokenNameIdentifier	 ICU Collation Key Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RawCollationKey	TokenNameIdentifier	 Raw Collation Key
reusableKey	TokenNameIdentifier	 reusable Key
=	TokenNameEQUAL	
new	TokenNamenew	
RawCollationKey	TokenNameIdentifier	 Raw Collation Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
/** * * @param input Source token stream * @param collator CollationKey generator */	TokenNameCOMMENT_JAVADOC	 * @param input Source token stream @param collator CollationKey generator 
public	TokenNamepublic	
ICUCollationKeyFilter	TokenNameIdentifier	 ICU Collation Key Filter
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
// clone the collator: see http://userguide.icu-project.org/collation/architecture 	TokenNameCOMMENT_LINE	clone the collator: see http://userguide.icu-project.org/collation/architecture 
try	TokenNametry	
{	TokenNameLBRACE	
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termBuffer	TokenNameIdentifier	 term Buffer
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
termText	TokenNameIdentifier	 term Text
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
termBuffer	TokenNameIdentifier	 term Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
getRawCollationKey	TokenNameIdentifier	 get Raw Collation Key
(	TokenNameLPAREN	
termText	TokenNameIdentifier	 term Text
,	TokenNameCOMMA	
reusableKey	TokenNameIdentifier	 reusable Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
encodedLength	TokenNameIdentifier	 encoded Length
=	TokenNameEQUAL	
IndexableBinaryStringTools	TokenNameIdentifier	 Indexable Binary String Tools
.	TokenNameDOT	
getEncodedLength	TokenNameIdentifier	 get Encoded Length
(	TokenNameLPAREN	
reusableKey	TokenNameIdentifier	 reusable Key
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reusableKey	TokenNameIdentifier	 reusable Key
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
encodedLength	TokenNameIdentifier	 encoded Length
>	TokenNameGREATER	
termBuffer	TokenNameIdentifier	 term Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
encodedLength	TokenNameIdentifier	 encoded Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
reusableKey	TokenNameIdentifier	 reusable Key
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reusableKey	TokenNameIdentifier	 reusable Key
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
