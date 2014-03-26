package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
Reader	TokenNameIdentifier	 Reader
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
IOUtils	TokenNameIdentifier	 IO Utils
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
/** Filters {@link LetterTokenizer} with {@link LowerCaseFilter} and {@link StopFilter}. * * <a name="version"/> * <p>You must specify the required {@link Version} * compatibility when creating StopAnalyzer: * <ul> * <li> As of 3.1, StopFilter correctly handles Unicode 4.0 * supplementary characters in stopwords * <li> As of 2.9, position increments are preserved * </ul> */	TokenNameCOMMENT_JAVADOC	 Filters {@link LetterTokenizer} with {@link LowerCaseFilter} and {@link StopFilter}. * <a name="version"/> <p>You must specify the required {@link Version} compatibility when creating StopAnalyzer: <ul> <li> As of 3.1, StopFilter correctly handles Unicode 4.0 supplementary characters in stopwords <li> As of 2.9, position increments are preserved </ul> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
extends	TokenNameextends	
StopwordAnalyzerBase	TokenNameIdentifier	 Stopword Analyzer Base
{	TokenNameLBRACE	
/** An unmodifiable set containing some common English words that are not usually useful for searching.*/	TokenNameCOMMENT_JAVADOC	 An unmodifiable set containing some common English words that are not usually useful for searching.
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
ENGLISH_STOP_WORDS_SET	TokenNameIdentifier	 ENGLISH  STOP  WORDS  SET
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"an"	TokenNameStringLiteral	an
,	TokenNameCOMMA	
"and"	TokenNameStringLiteral	and
,	TokenNameCOMMA	
"are"	TokenNameStringLiteral	are
,	TokenNameCOMMA	
"as"	TokenNameStringLiteral	as
,	TokenNameCOMMA	
"at"	TokenNameStringLiteral	at
,	TokenNameCOMMA	
"be"	TokenNameStringLiteral	be
,	TokenNameCOMMA	
"but"	TokenNameStringLiteral	but
,	TokenNameCOMMA	
"by"	TokenNameStringLiteral	by
,	TokenNameCOMMA	
"for"	TokenNameStringLiteral	for
,	TokenNameCOMMA	
"if"	TokenNameStringLiteral	if
,	TokenNameCOMMA	
"in"	TokenNameStringLiteral	in
,	TokenNameCOMMA	
"into"	TokenNameStringLiteral	into
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"it"	TokenNameStringLiteral	it
,	TokenNameCOMMA	
"no"	TokenNameStringLiteral	no
,	TokenNameCOMMA	
"not"	TokenNameStringLiteral	not
,	TokenNameCOMMA	
"of"	TokenNameStringLiteral	of
,	TokenNameCOMMA	
"on"	TokenNameStringLiteral	on
,	TokenNameCOMMA	
"or"	TokenNameStringLiteral	or
,	TokenNameCOMMA	
"such"	TokenNameStringLiteral	such
,	TokenNameCOMMA	
"that"	TokenNameStringLiteral	that
,	TokenNameCOMMA	
"the"	TokenNameStringLiteral	the
,	TokenNameCOMMA	
"their"	TokenNameStringLiteral	their
,	TokenNameCOMMA	
"then"	TokenNameStringLiteral	then
,	TokenNameCOMMA	
"there"	TokenNameStringLiteral	there
,	TokenNameCOMMA	
"these"	TokenNameStringLiteral	these
,	TokenNameCOMMA	
"they"	TokenNameStringLiteral	they
,	TokenNameCOMMA	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
"to"	TokenNameStringLiteral	to
,	TokenNameCOMMA	
"was"	TokenNameStringLiteral	was
,	TokenNameCOMMA	
"will"	TokenNameStringLiteral	will
,	TokenNameCOMMA	
"with"	TokenNameStringLiteral	with
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CharArraySet	TokenNameIdentifier	 Char Array Set
stopSet	TokenNameIdentifier	 stop Set
=	TokenNameEQUAL	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stopSet	TokenNameIdentifier	 stop Set
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ENGLISH_STOP_WORDS_SET	TokenNameIdentifier	 ENGLISH  STOP  WORDS  SET
=	TokenNameEQUAL	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
unmodifiableSet	TokenNameIdentifier	 unmodifiable Set
(	TokenNameLPAREN	
stopSet	TokenNameIdentifier	 stop Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Builds an analyzer which removes words in * {@link #ENGLISH_STOP_WORDS_SET}. * @param matchVersion See <a href="#version">above</a> */	TokenNameCOMMENT_JAVADOC	 Builds an analyzer which removes words in {@link #ENGLISH_STOP_WORDS_SET}. @param matchVersion See <a href="#version">above</a> 
public	TokenNamepublic	
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
ENGLISH_STOP_WORDS_SET	TokenNameIdentifier	 ENGLISH  STOP  WORDS  SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Builds an analyzer with the stop words from the given set. * @param matchVersion See <a href="#version">above</a> * @param stopWords Set of stop words */	TokenNameCOMMENT_JAVADOC	 Builds an analyzer with the stop words from the given set. @param matchVersion See <a href="#version">above</a> @param stopWords Set of stop words 
public	TokenNamepublic	
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Builds an analyzer with the stop words from the given file. * @see WordlistLoader#getWordSet(Reader, Version) * @param matchVersion See <a href="#version">above</a> * @param stopwordsFile File to load stop words from */	TokenNameCOMMENT_JAVADOC	 Builds an analyzer with the stop words from the given file. @see WordlistLoader#getWordSet(Reader, Version) @param matchVersion See <a href="#version">above</a> @param stopwordsFile File to load stop words from 
public	TokenNamepublic	
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
stopwordsFile	TokenNameIdentifier	 stopwords File
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
WordlistLoader	TokenNameIdentifier	 Wordlist Loader
.	TokenNameDOT	
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
getDecodingReader	TokenNameIdentifier	 get Decoding Reader
(	TokenNameLPAREN	
stopwordsFile	TokenNameIdentifier	 stopwords File
,	TokenNameCOMMA	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
CHARSET_UTF_8	TokenNameIdentifier	 CHARSET  UTF 8
)	TokenNameRPAREN	
,	TokenNameCOMMA	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Builds an analyzer with the stop words from the given reader. * @see WordlistLoader#getWordSet(Reader, Version) * @param matchVersion See <a href="#version">above</a> * @param stopwords Reader to load stop words from */	TokenNameCOMMENT_JAVADOC	 Builds an analyzer with the stop words from the given reader. @see WordlistLoader#getWordSet(Reader, Version) @param matchVersion See <a href="#version">above</a> @param stopwords Reader to load stop words from 
public	TokenNamepublic	
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
stopwords	TokenNameIdentifier	 stopwords
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
WordlistLoader	TokenNameIdentifier	 Wordlist Loader
.	TokenNameDOT	
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
stopwords	TokenNameIdentifier	 stopwords
,	TokenNameCOMMA	
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates * {@link org.apache.lucene.analysis.ReusableAnalyzerBase.TokenStreamComponents} * used to tokenize all the text in the provided {@link Reader}. * * @return {@link org.apache.lucene.analysis.ReusableAnalyzerBase.TokenStreamComponents} * built from a {@link LowerCaseTokenizer} filtered with * {@link StopFilter} */	TokenNameCOMMENT_JAVADOC	 Creates {@link org.apache.lucene.analysis.ReusableAnalyzerBase.TokenStreamComponents} used to tokenize all the text in the provided {@link Reader}. * @return {@link org.apache.lucene.analysis.ReusableAnalyzerBase.TokenStreamComponents} built from a {@link LowerCaseTokenizer} filtered with {@link StopFilter} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Tokenizer	TokenNameIdentifier	 Tokenizer
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
LowerCaseTokenizer	TokenNameIdentifier	 Lower Case Tokenizer
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
new	TokenNamenew	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
stopwords	TokenNameIdentifier	 stopwords
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
