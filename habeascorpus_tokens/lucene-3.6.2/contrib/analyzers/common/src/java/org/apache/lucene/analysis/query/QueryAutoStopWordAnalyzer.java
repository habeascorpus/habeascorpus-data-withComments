package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
query	TokenNameIdentifier	 query
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
StopFilter	TokenNameIdentifier	 Stop Filter
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
TermEnum	TokenNameIdentifier	 Term Enum
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
ReaderUtil	TokenNameIdentifier	 Reader Util
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
StringHelper	TokenNameIdentifier	 String Helper
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
/** * An {@link Analyzer} used primarily at query time to wrap another analyzer and provide a layer of protection * which prevents very common words from being passed into queries. * <p> * For very large indexes the cost * of reading TermDocs for a very common word can be high. This analyzer was created after experience with * a 38 million doc index which had a term in around 50% of docs and was causing TermQueries for * this term to take 2 seconds. * </p> * <p> * Use the various "addStopWords" methods in this class to automate the identification and addition of * stop words found in an already existing index. * </p> */	TokenNameCOMMENT_JAVADOC	 An {@link Analyzer} used primarily at query time to wrap another analyzer and provide a layer of protection which prevents very common words from being passed into queries. <p> For very large indexes the cost of reading TermDocs for a very common word can be high. This analyzer was created after experience with a 38 million doc index which had a term in around 50% of docs and was causing TermQueries for this term to take 2 seconds. </p> <p> Use the various "addStopWords" methods in this class to automate the identification and addition of stop words found in an already existing index. </p> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
QueryAutoStopWordAnalyzer	TokenNameIdentifier	 Query Auto Stop Word Analyzer
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
stopWordsPerField	TokenNameIdentifier	 stop Words Per Field
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//The default maximum percentage (40%) of index documents which 	TokenNameCOMMENT_LINE	The default maximum percentage (40%) of index documents which 
//can contain a term, after which the term is considered to be a stop word. 	TokenNameCOMMENT_LINE	can contain a term, after which the term is considered to be a stop word. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
defaultMaxDocFreqPercent	TokenNameIdentifier	 default Max Doc Freq Percent
=	TokenNameEQUAL	
0.4f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
;	TokenNameSEMICOLON	
/** * Initializes this analyzer with the Analyzer object that actually produces the tokens * * @param delegate The choice of {@link Analyzer} that is used to produce the token stream which needs filtering * @deprecated Stopwords should be calculated at instantiation using one of the other constructors */	TokenNameCOMMENT_JAVADOC	 Initializes this analyzer with the Analyzer object that actually produces the tokens * @param delegate The choice of {@link Analyzer} that is used to produce the token stream which needs filtering @deprecated Stopwords should be calculated at instantiation using one of the other constructors 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
QueryAutoStopWordAnalyzer	TokenNameIdentifier	 Query Auto Stop Word Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
matchVersion	TokenNameIdentifier	 match Version
=	TokenNameEQUAL	
matchVersion	TokenNameIdentifier	 match Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new QueryAutoStopWordAnalyzer with stopwords calculated for all * indexed fields from terms with a document frequency percentage greater than * {@link #defaultMaxDocFreqPercent} * * @param matchVersion Version to be used in {@link StopFilter} * @param delegate Analyzer whose TokenStream will be filtered * @param indexReader IndexReader to identify the stopwords from * @throws IOException Can be thrown while reading from the IndexReader */	TokenNameCOMMENT_JAVADOC	 Creates a new QueryAutoStopWordAnalyzer with stopwords calculated for all indexed fields from terms with a document frequency percentage greater than {@link #defaultMaxDocFreqPercent} * @param matchVersion Version to be used in {@link StopFilter} @param delegate Analyzer whose TokenStream will be filtered @param indexReader IndexReader to identify the stopwords from @throws IOException Can be thrown while reading from the IndexReader 
public	TokenNamepublic	
QueryAutoStopWordAnalyzer	TokenNameIdentifier	 Query Auto Stop Word Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
defaultMaxDocFreqPercent	TokenNameIdentifier	 default Max Doc Freq Percent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new QueryAutoStopWordAnalyzer with stopwords calculated for all * indexed fields from terms with a document frequency greater than the given * maxDocFreq * * @param matchVersion Version to be used in {@link StopFilter} * @param delegate Analyzer whose TokenStream will be filtered * @param indexReader IndexReader to identify the stopwords from * @param maxDocFreq Document frequency terms should be above in order to be stopwords * @throws IOException Can be thrown while reading from the IndexReader */	TokenNameCOMMENT_JAVADOC	 Creates a new QueryAutoStopWordAnalyzer with stopwords calculated for all indexed fields from terms with a document frequency greater than the given maxDocFreq * @param matchVersion Version to be used in {@link StopFilter} @param delegate Analyzer whose TokenStream will be filtered @param indexReader IndexReader to identify the stopwords from @param maxDocFreq Document frequency terms should be above in order to be stopwords @throws IOException Can be thrown while reading from the IndexReader 
public	TokenNamepublic	
QueryAutoStopWordAnalyzer	TokenNameIdentifier	 Query Auto Stop Word Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
int	TokenNameint	
maxDocFreq	TokenNameIdentifier	 max Doc Freq
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
ReaderUtil	TokenNameIdentifier	 Reader Util
.	TokenNameDOT	
getIndexedFields	TokenNameIdentifier	 get Indexed Fields
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
)	TokenNameRPAREN	
,	TokenNameCOMMA	
maxDocFreq	TokenNameIdentifier	 max Doc Freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new QueryAutoStopWordAnalyzer with stopwords calculated for all * indexed fields from terms with a document frequency percentage greater than * the given maxPercentDocs * * @param matchVersion Version to be used in {@link StopFilter} * @param delegate Analyzer whose TokenStream will be filtered * @param indexReader IndexReader to identify the stopwords from * @param maxPercentDocs The maximum percentage (between 0.0 and 1.0) of index documents which * contain a term, after which the word is considered to be a stop word * @throws IOException Can be thrown while reading from the IndexReader */	TokenNameCOMMENT_JAVADOC	 Creates a new QueryAutoStopWordAnalyzer with stopwords calculated for all indexed fields from terms with a document frequency percentage greater than the given maxPercentDocs * @param matchVersion Version to be used in {@link StopFilter} @param delegate Analyzer whose TokenStream will be filtered @param indexReader IndexReader to identify the stopwords from @param maxPercentDocs The maximum percentage (between 0.0 and 1.0) of index documents which contain a term, after which the word is considered to be a stop word @throws IOException Can be thrown while reading from the IndexReader 
public	TokenNamepublic	
QueryAutoStopWordAnalyzer	TokenNameIdentifier	 Query Auto Stop Word Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
float	TokenNamefloat	
maxPercentDocs	TokenNameIdentifier	 max Percent Docs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
ReaderUtil	TokenNameIdentifier	 Reader Util
.	TokenNameDOT	
getIndexedFields	TokenNameIdentifier	 get Indexed Fields
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
)	TokenNameRPAREN	
,	TokenNameCOMMA	
maxPercentDocs	TokenNameIdentifier	 max Percent Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new QueryAutoStopWordAnalyzer with stopwords calculated for the * given selection of fields from terms with a document frequency percentage * greater than the given maxPercentDocs * * @param matchVersion Version to be used in {@link StopFilter} * @param delegate Analyzer whose TokenStream will be filtered * @param indexReader IndexReader to identify the stopwords from * @param fields Selection of fields to calculate stopwords for * @param maxPercentDocs The maximum percentage (between 0.0 and 1.0) of index documents which * contain a term, after which the word is considered to be a stop word * @throws IOException Can be thrown while reading from the IndexReader */	TokenNameCOMMENT_JAVADOC	 Creates a new QueryAutoStopWordAnalyzer with stopwords calculated for the given selection of fields from terms with a document frequency percentage greater than the given maxPercentDocs * @param matchVersion Version to be used in {@link StopFilter} @param delegate Analyzer whose TokenStream will be filtered @param indexReader IndexReader to identify the stopwords from @param fields Selection of fields to calculate stopwords for @param maxPercentDocs The maximum percentage (between 0.0 and 1.0) of index documents which contain a term, after which the word is considered to be a stop word @throws IOException Can be thrown while reading from the IndexReader 
public	TokenNamepublic	
QueryAutoStopWordAnalyzer	TokenNameIdentifier	 Query Auto Stop Word Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
float	TokenNamefloat	
maxPercentDocs	TokenNameIdentifier	 max Percent Docs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
maxPercentDocs	TokenNameIdentifier	 max Percent Docs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new QueryAutoStopWordAnalyzer with stopwords calculated for the * given selection of fields from terms with a document frequency greater than * the given maxDocFreq * * @param matchVersion Version to be used in {@link StopFilter} * @param delegate Analyzer whose TokenStream will be filtered * @param indexReader IndexReader to identify the stopwords from * @param fields Selection of fields to calculate stopwords for * @param maxDocFreq Document frequency terms should be above in order to be stopwords * @throws IOException Can be thrown while reading from the IndexReader */	TokenNameCOMMENT_JAVADOC	 Creates a new QueryAutoStopWordAnalyzer with stopwords calculated for the given selection of fields from terms with a document frequency greater than the given maxDocFreq * @param matchVersion Version to be used in {@link StopFilter} @param delegate Analyzer whose TokenStream will be filtered @param indexReader IndexReader to identify the stopwords from @param fields Selection of fields to calculate stopwords for @param maxDocFreq Document frequency terms should be above in order to be stopwords @throws IOException Can be thrown while reading from the IndexReader 
public	TokenNamepublic	
QueryAutoStopWordAnalyzer	TokenNameIdentifier	 Query Auto Stop Word Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
delegate	TokenNameIdentifier	 delegate
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
int	TokenNameint	
maxDocFreq	TokenNameIdentifier	 max Doc Freq
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
matchVersion	TokenNameIdentifier	 match Version
=	TokenNameEQUAL	
matchVersion	TokenNameIdentifier	 match Version
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
internedFieldName	TokenNameIdentifier	 interned Field Name
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermEnum	TokenNameIdentifier	 Term Enum
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
internedFieldName	TokenNameIdentifier	 interned Field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxDocFreq	TokenNameIdentifier	 max Doc Freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stopWords	TokenNameIdentifier	 stop Words
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stopWordsPerField	TokenNameIdentifier	 stop Words Per Field
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Automatically adds stop words for all fields with terms exceeding the defaultMaxDocFreqPercent * * @param reader The {@link IndexReader} which will be consulted to identify potential stop words that * exceed the required document frequency * @return The number of stop words identified. * @throws IOException * @deprecated Stopwords should be calculated at instantiation using * {@link #QueryAutoStopWordAnalyzer(Version, Analyzer, IndexReader)} */	TokenNameCOMMENT_JAVADOC	 Automatically adds stop words for all fields with terms exceeding the defaultMaxDocFreqPercent * @param reader The {@link IndexReader} which will be consulted to identify potential stop words that exceed the required document frequency @return The number of stop words identified. @throws IOException @deprecated Stopwords should be calculated at instantiation using {@link #QueryAutoStopWordAnalyzer(Version, Analyzer, IndexReader)} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
int	TokenNameint	
addStopWords	TokenNameIdentifier	 add Stop Words
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
addStopWords	TokenNameIdentifier	 add Stop Words
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
defaultMaxDocFreqPercent	TokenNameIdentifier	 default Max Doc Freq Percent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Automatically adds stop words for all fields with terms exceeding the maxDocFreqPercent * * @param reader The {@link IndexReader} which will be consulted to identify potential stop words that * exceed the required document frequency * @param maxDocFreq The maximum number of index documents which can contain a term, after which * the term is considered to be a stop word * @return The number of stop words identified. * @throws IOException * @deprecated Stopwords should be calculated at instantiation using * {@link #QueryAutoStopWordAnalyzer(Version, Analyzer, IndexReader, int)} */	TokenNameCOMMENT_JAVADOC	 Automatically adds stop words for all fields with terms exceeding the maxDocFreqPercent * @param reader The {@link IndexReader} which will be consulted to identify potential stop words that exceed the required document frequency @param maxDocFreq The maximum number of index documents which can contain a term, after which the term is considered to be a stop word @return The number of stop words identified. @throws IOException @deprecated Stopwords should be calculated at instantiation using {@link #QueryAutoStopWordAnalyzer(Version, Analyzer, IndexReader, int)} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
int	TokenNameint	
addStopWords	TokenNameIdentifier	 add Stop Words
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
maxDocFreq	TokenNameIdentifier	 max Doc Freq
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
numStopWords	TokenNameIdentifier	 num Stop Words
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fieldNames	TokenNameIdentifier	 field Names
=	TokenNameEQUAL	
ReaderUtil	TokenNameIdentifier	 Reader Util
.	TokenNameDOT	
getIndexedFields	TokenNameIdentifier	 get Indexed Fields
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
fieldNames	TokenNameIdentifier	 field Names
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numStopWords	TokenNameIdentifier	 num Stop Words
+=	TokenNamePLUS_EQUAL	
addStopWords	TokenNameIdentifier	 add Stop Words
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
maxDocFreq	TokenNameIdentifier	 max Doc Freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
numStopWords	TokenNameIdentifier	 num Stop Words
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Automatically adds stop words for all fields with terms exceeding the maxDocFreqPercent * * @param reader The {@link IndexReader} which will be consulted to identify potential stop words that * exceed the required document frequency * @param maxPercentDocs The maximum percentage (between 0.0 and 1.0) of index documents which * contain a term, after which the word is considered to be a stop word. * @return The number of stop words identified. * @throws IOException * @deprecated Stowords should be calculated at instantiation using * {@link #QueryAutoStopWordAnalyzer(Version, Analyzer, IndexReader, float)} */	TokenNameCOMMENT_JAVADOC	 Automatically adds stop words for all fields with terms exceeding the maxDocFreqPercent * @param reader The {@link IndexReader} which will be consulted to identify potential stop words that exceed the required document frequency @param maxPercentDocs The maximum percentage (between 0.0 and 1.0) of index documents which contain a term, after which the word is considered to be a stop word. @return The number of stop words identified. @throws IOException @deprecated Stowords should be calculated at instantiation using {@link #QueryAutoStopWordAnalyzer(Version, Analyzer, IndexReader, float)} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
int	TokenNameint	
addStopWords	TokenNameIdentifier	 add Stop Words
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
float	TokenNamefloat	
maxPercentDocs	TokenNameIdentifier	 max Percent Docs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
numStopWords	TokenNameIdentifier	 num Stop Words
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fieldNames	TokenNameIdentifier	 field Names
=	TokenNameEQUAL	
ReaderUtil	TokenNameIdentifier	 Reader Util
.	TokenNameDOT	
getIndexedFields	TokenNameIdentifier	 get Indexed Fields
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
fieldNames	TokenNameIdentifier	 field Names
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numStopWords	TokenNameIdentifier	 num Stop Words
+=	TokenNamePLUS_EQUAL	
addStopWords	TokenNameIdentifier	 add Stop Words
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
maxPercentDocs	TokenNameIdentifier	 max Percent Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
numStopWords	TokenNameIdentifier	 num Stop Words
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Automatically adds stop words for the given field with terms exceeding the maxPercentDocs * * @param reader The {@link IndexReader} which will be consulted to identify potential stop words that * exceed the required document frequency * @param fieldName The field for which stopwords will be added * @param maxPercentDocs The maximum percentage (between 0.0 and 1.0) of index documents which * contain a term, after which the word is considered to be a stop word. * @return The number of stop words identified. * @throws IOException * @deprecated Stowords should be calculated at instantiation using * {@link #QueryAutoStopWordAnalyzer(Version, Analyzer, IndexReader, Collection, float)} */	TokenNameCOMMENT_JAVADOC	 Automatically adds stop words for the given field with terms exceeding the maxPercentDocs * @param reader The {@link IndexReader} which will be consulted to identify potential stop words that exceed the required document frequency @param fieldName The field for which stopwords will be added @param maxPercentDocs The maximum percentage (between 0.0 and 1.0) of index documents which contain a term, after which the word is considered to be a stop word. @return The number of stop words identified. @throws IOException @deprecated Stowords should be calculated at instantiation using {@link #QueryAutoStopWordAnalyzer(Version, Analyzer, IndexReader, Collection, float)} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
int	TokenNameint	
addStopWords	TokenNameIdentifier	 add Stop Words
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
float	TokenNamefloat	
maxPercentDocs	TokenNameIdentifier	 max Percent Docs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
addStopWords	TokenNameIdentifier	 add Stop Words
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
maxPercentDocs	TokenNameIdentifier	 max Percent Docs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Automatically adds stop words for the given field with terms exceeding the maxPercentDocs * * @param reader The {@link IndexReader} which will be consulted to identify potential stop words that * exceed the required document frequency * @param fieldName The field for which stopwords will be added * @param maxDocFreq The maximum number of index documents which * can contain a term, after which the term is considered to be a stop word. * @return The number of stop words identified. * @throws IOException * @deprecated Stowords should be calculated at instantiation using * {@link #QueryAutoStopWordAnalyzer(Version, Analyzer, IndexReader, Collection, int)} */	TokenNameCOMMENT_JAVADOC	 Automatically adds stop words for the given field with terms exceeding the maxPercentDocs * @param reader The {@link IndexReader} which will be consulted to identify potential stop words that exceed the required document frequency @param fieldName The field for which stopwords will be added @param maxDocFreq The maximum number of index documents which can contain a term, after which the term is considered to be a stop word. @return The number of stop words identified. @throws IOException @deprecated Stowords should be calculated at instantiation using {@link #QueryAutoStopWordAnalyzer(Version, Analyzer, IndexReader, Collection, int)} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
int	TokenNameint	
addStopWords	TokenNameIdentifier	 add Stop Words
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
int	TokenNameint	
maxDocFreq	TokenNameIdentifier	 max Doc Freq
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
internedFieldName	TokenNameIdentifier	 interned Field Name
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermEnum	TokenNameIdentifier	 Term Enum
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
internedFieldName	TokenNameIdentifier	 interned Field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxDocFreq	TokenNameIdentifier	 max Doc Freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stopWords	TokenNameIdentifier	 stop Words
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stopWordsPerField	TokenNameIdentifier	 stop Words Per Field
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* if the stopwords for a field are changed, * then saved streams for that field are erased. */	TokenNameCOMMENT_BLOCK	 if the stopwords for a field are changed, then saved streams for that field are erased. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SavedStreams	TokenNameIdentifier	 Saved Streams
>	TokenNameGREATER	
streamMap	TokenNameIdentifier	 stream Map
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SavedStreams	TokenNameIdentifier	 Saved Streams
>	TokenNameGREATER	
)	TokenNameRPAREN	
getPreviousTokenStream	TokenNameIdentifier	 get Previous Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
streamMap	TokenNameIdentifier	 stream Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
streamMap	TokenNameIdentifier	 stream Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
stopWords	TokenNameIdentifier	 stop Words
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
=	TokenNameEQUAL	
stopWordsPerField	TokenNameIdentifier	 stop Words Per Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stopWords	TokenNameIdentifier	 stop Words
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
SavedStreams	TokenNameIdentifier	 Saved Streams
{	TokenNameLBRACE	
/* the underlying stream */	TokenNameCOMMENT_BLOCK	 the underlying stream 
TokenStream	TokenNameIdentifier	 Token Stream
wrapped	TokenNameIdentifier	 wrapped
;	TokenNameSEMICOLON	
/* * when there are no stopwords for the field, refers to wrapped. * if there stopwords, it is a StopFilter around wrapped. */	TokenNameCOMMENT_BLOCK	 when there are no stopwords for the field, refers to wrapped. if there stopwords, it is a StopFilter around wrapped. 
TokenStream	TokenNameIdentifier	 Token Stream
withStopFilter	TokenNameIdentifier	 with Stop Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
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
/* map of SavedStreams for each field */	TokenNameCOMMENT_BLOCK	 map of SavedStreams for each field 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SavedStreams	TokenNameIdentifier	 Saved Streams
>	TokenNameGREATER	
streamMap	TokenNameIdentifier	 stream Map
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SavedStreams	TokenNameIdentifier	 Saved Streams
>	TokenNameGREATER	
)	TokenNameRPAREN	
getPreviousTokenStream	TokenNameIdentifier	 get Previous Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
streamMap	TokenNameIdentifier	 stream Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
streamMap	TokenNameIdentifier	 stream Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SavedStreams	TokenNameIdentifier	 Saved Streams
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPreviousTokenStream	TokenNameIdentifier	 set Previous Token Stream
(	TokenNameLPAREN	
streamMap	TokenNameIdentifier	 stream Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SavedStreams	TokenNameIdentifier	 Saved Streams
streams	TokenNameIdentifier	 streams
=	TokenNameEQUAL	
streamMap	TokenNameIdentifier	 stream Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
streams	TokenNameIdentifier	 streams
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* an entry for this field does not exist, create one */	TokenNameCOMMENT_BLOCK	 an entry for this field does not exist, create one 
streams	TokenNameIdentifier	 streams
=	TokenNameEQUAL	
new	TokenNamenew	
SavedStreams	TokenNameIdentifier	 Saved Streams
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streamMap	TokenNameIdentifier	 stream Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
streams	TokenNameIdentifier	 streams
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
wrapped	TokenNameIdentifier	 wrapped
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* if there are any stopwords for the field, save the stopfilter */	TokenNameCOMMENT_BLOCK	 if there are any stopwords for the field, save the stopfilter 
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
=	TokenNameEQUAL	
stopWordsPerField	TokenNameIdentifier	 stop Words Per Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stopWords	TokenNameIdentifier	 stop Words
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
withStopFilter	TokenNameIdentifier	 with Stop Filter
=	TokenNameEQUAL	
new	TokenNamenew	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
wrapped	TokenNameIdentifier	 wrapped
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
withStopFilter	TokenNameIdentifier	 with Stop Filter
=	TokenNameEQUAL	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
wrapped	TokenNameIdentifier	 wrapped
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* * an entry for this field exists, verify the wrapped stream has not * changed. if it has not, reuse it, otherwise wrap the new stream. */	TokenNameCOMMENT_BLOCK	 an entry for this field exists, verify the wrapped stream has not changed. if it has not, reuse it, otherwise wrap the new stream. 
TokenStream	TokenNameIdentifier	 Token Stream
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
wrapped	TokenNameIdentifier	 wrapped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* the wrapped analyzer reused the stream */	TokenNameCOMMENT_BLOCK	 the wrapped analyzer reused the stream 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* * the wrapped analyzer did not. if there are any stopwords for the * field, create a new StopFilter around the new stream */	TokenNameCOMMENT_BLOCK	 the wrapped analyzer did not. if there are any stopwords for the field, create a new StopFilter around the new stream 
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
wrapped	TokenNameIdentifier	 wrapped
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
=	TokenNameEQUAL	
stopWordsPerField	TokenNameIdentifier	 stop Words Per Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stopWords	TokenNameIdentifier	 stop Words
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
withStopFilter	TokenNameIdentifier	 with Stop Filter
=	TokenNameEQUAL	
new	TokenNamenew	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
wrapped	TokenNameIdentifier	 wrapped
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
withStopFilter	TokenNameIdentifier	 with Stop Filter
=	TokenNameEQUAL	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
wrapped	TokenNameIdentifier	 wrapped
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
withStopFilter	TokenNameIdentifier	 with Stop Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Provides information on which stop words have been identified for a field * * @param fieldName The field for which stop words identified in "addStopWords" * method calls will be returned * @return the stop words identified for a field */	TokenNameCOMMENT_JAVADOC	 Provides information on which stop words have been identified for a field * @param fieldName The field for which stop words identified in "addStopWords" method calls will be returned @return the stop words identified for a field 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getStopWords	TokenNameIdentifier	 get Stop Words
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
=	TokenNameEQUAL	
stopWordsPerField	TokenNameIdentifier	 stop Words Per Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
stopWords	TokenNameIdentifier	 stop Words
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
stopWords	TokenNameIdentifier	 stop Words
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
stopWords	TokenNameIdentifier	 stop Words
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Provides information on which stop words have been identified for all fields * * @return the stop words (as terms) */	TokenNameCOMMENT_JAVADOC	 Provides information on which stop words have been identified for all fields * @return the stop words (as terms) 
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getStopWords	TokenNameIdentifier	 get Stop Words
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
allStopWords	TokenNameIdentifier	 all Stop Words
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
:	TokenNameCOLON	
stopWordsPerField	TokenNameIdentifier	 stop Words Per Field
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
=	TokenNameEQUAL	
stopWordsPerField	TokenNameIdentifier	 stop Words Per Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
:	TokenNameCOLON	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allStopWords	TokenNameIdentifier	 all Stop Words
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
allStopWords	TokenNameIdentifier	 all Stop Words
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
allStopWords	TokenNameIdentifier	 all Stop Words
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
