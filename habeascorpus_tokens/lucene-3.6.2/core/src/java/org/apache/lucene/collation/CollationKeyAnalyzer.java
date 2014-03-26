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
Analyzer	TokenNameIdentifier	 Analyzer
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
KeywordTokenizer	TokenNameIdentifier	 Keyword Tokenizer
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
Tokenizer	TokenNameIdentifier	 Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Collator	TokenNameIdentifier	 Collator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * <p> * Filters {@link KeywordTokenizer} with {@link CollationKeyFilter}. * </p> * <p> * Converts the token into its {@link java.text.CollationKey}, and then * encodes the CollationKey with * {@link org.apache.lucene.util.IndexableBinaryStringTools}, to allow * it to be stored as an index term. * </p> * <p> * <strong>WARNING:</strong> Make sure you use exactly the same Collator at * index and query time -- CollationKeys are only comparable when produced by * the same Collator. Since {@link java.text.RuleBasedCollator}s are not * independently versioned, it is unsafe to search against stored * CollationKeys unless the following are exactly the same (best practice is * to store this information with the index and check that they remain the * same at query time): * </p> * <ol> * <li>JVM vendor</li> * <li>JVM version, including patch version</li> * <li> * The language (and country and variant, if specified) of the Locale * used when constructing the collator via * {@link Collator#getInstance(java.util.Locale)}. * </li> * <li> * The collation strength used - see {@link Collator#setStrength(int)} * </li> * </ol> * <p> * The <code>ICUCollationKeyAnalyzer</code> in the icu package of Lucene's * contrib area uses ICU4J's Collator, which makes its * its version available, thus allowing collation to be versioned * independently from the JVM. ICUCollationKeyAnalyzer is also significantly * faster and generates significantly shorter keys than CollationKeyAnalyzer. * See <a href="http://site.icu-project.org/charts/collation-icu4j-sun" * >http://site.icu-project.org/charts/collation-icu4j-sun</a> for key * generation timing and key length comparisons between ICU4J and * java.text.Collator over several languages. * </p> * <p> * CollationKeys generated by java.text.Collators are not compatible * with those those generated by ICU Collators. Specifically, if you use * CollationKeyAnalyzer to generate index terms, do not use * ICUCollationKeyAnalyzer on the query side, or vice versa. * </p> */	TokenNameCOMMENT_JAVADOC	 <p> Filters {@link KeywordTokenizer} with {@link CollationKeyFilter}. </p> <p> Converts the token into its {@link java.text.CollationKey}, and then encodes the CollationKey with {@link org.apache.lucene.util.IndexableBinaryStringTools}, to allow it to be stored as an index term. </p> <p> <strong>WARNING:</strong> Make sure you use exactly the same Collator at index and query time -- CollationKeys are only comparable when produced by the same Collator. Since {@link java.text.RuleBasedCollator}s are not independently versioned, it is unsafe to search against stored CollationKeys unless the following are exactly the same (best practice is to store this information with the index and check that they remain the same at query time): </p> <ol> <li>JVM vendor</li> <li>JVM version, including patch version</li> <li> The language (and country and variant, if specified) of the Locale used when constructing the collator via {@link Collator#getInstance(java.util.Locale)}. </li> <li> The collation strength used - see {@link Collator#setStrength(int)} </li> </ol> <p> The <code>ICUCollationKeyAnalyzer</code> in the icu package of Lucene's contrib area uses ICU4J's Collator, which makes its its version available, thus allowing collation to be versioned independently from the JVM. ICUCollationKeyAnalyzer is also significantly faster and generates significantly shorter keys than CollationKeyAnalyzer. See <a href="http://site.icu-project.org/charts/collation-icu4j-sun" >http://site.icu-project.org/charts/collation-icu4j-sun</a> for key generation timing and key length comparisons between ICU4J and java.text.Collator over several languages. </p> <p> CollationKeys generated by java.text.Collators are not compatible with those those generated by ICU Collators. Specifically, if you use CollationKeyAnalyzer to generate index terms, do not use ICUCollationKeyAnalyzer on the query side, or vice versa. </p> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CollationKeyAnalyzer	TokenNameIdentifier	 Collation Key Analyzer
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
{	TokenNameLBRACE	
private	TokenNameprivate	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CollationKeyAnalyzer	TokenNameIdentifier	 Collation Key Analyzer
(	TokenNameLPAREN	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
KeywordTokenizer	TokenNameIdentifier	 Keyword Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
CollationKeyFilter	TokenNameIdentifier	 Collation Key Filter
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
collator	TokenNameIdentifier	 collator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
SavedStreams	TokenNameIdentifier	 Saved Streams
{	TokenNameLBRACE	
Tokenizer	TokenNameIdentifier	 Tokenizer
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
TokenStream	TokenNameIdentifier	 Token Stream
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SavedStreams	TokenNameIdentifier	 Saved Streams
streams	TokenNameIdentifier	 streams
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SavedStreams	TokenNameIdentifier	 Saved Streams
)	TokenNameRPAREN	
getPreviousTokenStream	TokenNameIdentifier	 get Previous Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
streams	TokenNameIdentifier	 streams
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
streams	TokenNameIdentifier	 streams
=	TokenNameEQUAL	
new	TokenNamenew	
SavedStreams	TokenNameIdentifier	 Saved Streams
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
KeywordTokenizer	TokenNameIdentifier	 Keyword Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
CollationKeyFilter	TokenNameIdentifier	 Collation Key Filter
(	TokenNameLPAREN	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
collator	TokenNameIdentifier	 collator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPreviousTokenStream	TokenNameIdentifier	 set Previous Token Stream
(	TokenNameLPAREN	
streams	TokenNameIdentifier	 streams
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
