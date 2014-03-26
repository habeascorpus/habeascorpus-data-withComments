package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
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
*	TokenNameMULTIPLY	
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * Filters {@link StandardTokenizer} with {@link StandardFilter}, {@link * LowerCaseFilter} and {@link StopFilter}, using a list of * English stop words. * * <a name="version"/> * <p>You must specify the required {@link Version} * compatibility when creating StandardAnalyzer: * <ul> * <li> As of 3.4, Hiragana and Han characters are no longer wrongly split * from their combining characters. If you use a previous version number, * you get the exact broken behavior for backwards compatibility. * <li> As of 3.1, StandardTokenizer implements Unicode text segmentation, * and StopFilter correctly handles Unicode 4.0 supplementary characters * in stopwords. {@link ClassicTokenizer} and {@link ClassicAnalyzer} * are the pre-3.1 implementations of StandardTokenizer and * StandardAnalyzer. * <li> As of 2.9, StopFilter preserves position increments * <li> As of 2.4, Tokens incorrectly identified as acronyms * are corrected (see <a href="https://issues.apache.org/jira/browse/LUCENE-1068">LUCENE-1068</a>) * </ul> */	TokenNameCOMMENT_JAVADOC	 Filters {@link StandardTokenizer} with {@link StandardFilter}, {@link LowerCaseFilter} and {@link StopFilter}, using a list of English stop words. * <a name="version"/> <p>You must specify the required {@link Version} compatibility when creating StandardAnalyzer: <ul> <li> As of 3.4, Hiragana and Han characters are no longer wrongly split from their combining characters. If you use a previous version number, you get the exact broken behavior for backwards compatibility. <li> As of 3.1, StandardTokenizer implements Unicode text segmentation, and StopFilter correctly handles Unicode 4.0 supplementary characters in stopwords. {@link ClassicTokenizer} and {@link ClassicAnalyzer} are the pre-3.1 implementations of StandardTokenizer and StandardAnalyzer. <li> As of 2.9, StopFilter preserves position increments <li> As of 2.4, Tokens incorrectly identified as acronyms are corrected (see <a href="https://issues.apache.org/jira/browse/LUCENE-1068">LUCENE-1068</a>) </ul> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
extends	TokenNameextends	
StopwordAnalyzerBase	TokenNameIdentifier	 Stopword Analyzer Base
{	TokenNameLBRACE	
/** Default maximum allowed token length */	TokenNameCOMMENT_JAVADOC	 Default maximum allowed token length 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_TOKEN_LENGTH	TokenNameIdentifier	 DEFAULT  MAX  TOKEN  LENGTH
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxTokenLength	TokenNameIdentifier	 max Token Length
=	TokenNameEQUAL	
DEFAULT_MAX_TOKEN_LENGTH	TokenNameIdentifier	 DEFAULT  MAX  TOKEN  LENGTH
;	TokenNameSEMICOLON	
/** * Specifies whether deprecated acronyms should be replaced with HOST type. * See {@linkplain "https://issues.apache.org/jira/browse/LUCENE-1068"} */	TokenNameCOMMENT_JAVADOC	 Specifies whether deprecated acronyms should be replaced with HOST type. See {@linkplain "https://issues.apache.org/jira/browse/LUCENE-1068"} 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
replaceInvalidAcronym	TokenNameIdentifier	 replace Invalid Acronym
;	TokenNameSEMICOLON	
/** An unmodifiable set containing some common English words that are usually not useful for searching. */	TokenNameCOMMENT_JAVADOC	 An unmodifiable set containing some common English words that are usually not useful for searching. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
STOP_WORDS_SET	TokenNameIdentifier	 STOP  WORDS  SET
=	TokenNameEQUAL	
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
.	TokenNameDOT	
ENGLISH_STOP_WORDS_SET	TokenNameIdentifier	 ENGLISH  STOP  WORDS  SET
;	TokenNameSEMICOLON	
/** Builds an analyzer with the given stop words. * @param matchVersion Lucene version to match See {@link * <a href="#version">above</a>} * @param stopWords stop words */	TokenNameCOMMENT_JAVADOC	 Builds an analyzer with the given stop words. @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} @param stopWords stop words 
public	TokenNamepublic	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
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
replaceInvalidAcronym	TokenNameIdentifier	 replace Invalid Acronym
=	TokenNameEQUAL	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_24	TokenNameIdentifier	 LUCENE 24
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Builds an analyzer with the default stop words ({@link * #STOP_WORDS_SET}). * @param matchVersion Lucene version to match See {@link * <a href="#version">above</a>} */	TokenNameCOMMENT_JAVADOC	 Builds an analyzer with the default stop words ({@link #STOP_WORDS_SET}). @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} 
public	TokenNamepublic	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
STOP_WORDS_SET	TokenNameIdentifier	 STOP  WORDS  SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Builds an analyzer with the stop words from the given file. * @see WordlistLoader#getWordSet(Reader, Version) * @param matchVersion Lucene version to match See {@link * <a href="#version">above</a>} * @param stopwords File to read stop words from * @deprecated Use {@link #StandardAnalyzer(Version, Reader)} instead. */	TokenNameCOMMENT_JAVADOC	 Builds an analyzer with the stop words from the given file. @see WordlistLoader#getWordSet(Reader, Version) @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} @param stopwords File to read stop words from @deprecated Use {@link #StandardAnalyzer(Version, Reader)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
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
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
getDecodingReader	TokenNameIdentifier	 get Decoding Reader
(	TokenNameLPAREN	
stopwords	TokenNameIdentifier	 stopwords
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
/** Builds an analyzer with the stop words from the given reader. * @see WordlistLoader#getWordSet(Reader, Version) * @param matchVersion Lucene version to match See {@link * <a href="#version">above</a>} * @param stopwords Reader to read stop words from */	TokenNameCOMMENT_JAVADOC	 Builds an analyzer with the stop words from the given reader. @see WordlistLoader#getWordSet(Reader, Version) @param matchVersion Lucene version to match See {@link <a href="#version">above</a>} @param stopwords Reader to read stop words from 
public	TokenNamepublic	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
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
/** * Set maximum allowed token length. If a token is seen * that exceeds this length then it is discarded. This * setting only takes effect the next time tokenStream or * reusableTokenStream is called. */	TokenNameCOMMENT_JAVADOC	 Set maximum allowed token length. If a token is seen that exceeds this length then it is discarded. This setting only takes effect the next time tokenStream or reusableTokenStream is called. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxTokenLength	TokenNameIdentifier	 set Max Token Length
(	TokenNameLPAREN	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxTokenLength	TokenNameIdentifier	 max Token Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see #setMaxTokenLength */	TokenNameCOMMENT_JAVADOC	 @see #setMaxTokenLength 
public	TokenNamepublic	
int	TokenNameint	
getMaxTokenLength	TokenNameIdentifier	 get Max Token Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxTokenLength	TokenNameIdentifier	 max Token Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
setMaxTokenLength	TokenNameIdentifier	 set Max Token Length
(	TokenNameLPAREN	
maxTokenLength	TokenNameIdentifier	 max Token Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
setReplaceInvalidAcronym	TokenNameIdentifier	 set Replace Invalid Acronym
(	TokenNameLPAREN	
replaceInvalidAcronym	TokenNameIdentifier	 replace Invalid Acronym
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenStream	TokenNameIdentifier	 Token Stream
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StandardFilter	TokenNameIdentifier	 Standard Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
LowerCaseFilter	TokenNameIdentifier	 Lower Case Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
stopwords	TokenNameIdentifier	 stopwords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
setMaxTokenLength	TokenNameIdentifier	 set Max Token Length
(	TokenNameLPAREN	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
maxTokenLength	TokenNameIdentifier	 max Token Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
