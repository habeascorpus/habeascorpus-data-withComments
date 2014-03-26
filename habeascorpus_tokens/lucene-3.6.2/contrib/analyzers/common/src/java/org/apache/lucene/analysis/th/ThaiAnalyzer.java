package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
/** * Copyright 2006 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2006 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
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
LowerCaseFilter	TokenNameIdentifier	 Lower Case Filter
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
Tokenizer	TokenNameIdentifier	 Tokenizer
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
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
StandardFilter	TokenNameIdentifier	 Standard Filter
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
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
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
StopwordAnalyzerBase	TokenNameIdentifier	 Stopword Analyzer Base
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
/** * {@link Analyzer} for Thai language. It uses {@link java.text.BreakIterator} to break words. * <p> * <a name="version"/> * <p>You must specify the required {@link Version} * compatibility when creating ThaiAnalyzer: * <ul> * <li> As of 3.6, a set of Thai stopwords is used by default * </ul> */	TokenNameCOMMENT_JAVADOC	 {@link Analyzer} for Thai language. It uses {@link java.text.BreakIterator} to break words. <p> <a name="version"/> <p>You must specify the required {@link Version} compatibility when creating ThaiAnalyzer: <ul> <li> As of 3.6, a set of Thai stopwords is used by default </ul> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
extends	TokenNameextends	
StopwordAnalyzerBase	TokenNameIdentifier	 Stopword Analyzer Base
{	TokenNameLBRACE	
/** File containing default Thai stopwords. */	TokenNameCOMMENT_JAVADOC	 File containing default Thai stopwords. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DEFAULT_STOPWORD_FILE	TokenNameIdentifier	 DEFAULT  STOPWORD  FILE
=	TokenNameEQUAL	
"stopwords.txt"	TokenNameStringLiteral	stopwords.txt
;	TokenNameSEMICOLON	
/** * The comment character in the stopwords file. * All lines prefixed with this will be ignored. */	TokenNameCOMMENT_JAVADOC	 The comment character in the stopwords file. All lines prefixed with this will be ignored. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STOPWORDS_COMMENT	TokenNameIdentifier	 STOPWORDS  COMMENT
=	TokenNameEQUAL	
"#"	TokenNameStringLiteral	#
;	TokenNameSEMICOLON	
/** * Returns an unmodifiable instance of the default stop words set. * @return default stop words set. */	TokenNameCOMMENT_JAVADOC	 Returns an unmodifiable instance of the default stop words set. @return default stop words set. 
public	TokenNamepublic	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getDefaultStopSet	TokenNameIdentifier	 get Default Stop Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DefaultSetHolder	TokenNameIdentifier	 Default Set Holder
.	TokenNameDOT	
DEFAULT_STOP_SET	TokenNameIdentifier	 DEFAULT  STOP  SET
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Atomically loads the DEFAULT_STOP_SET in a lazy fashion once the outer class * accesses the static final set the first time.; */	TokenNameCOMMENT_JAVADOC	 Atomically loads the DEFAULT_STOP_SET in a lazy fashion once the outer class accesses the static final set the first time.; 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DefaultSetHolder	TokenNameIdentifier	 Default Set Holder
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
DEFAULT_STOP_SET	TokenNameIdentifier	 DEFAULT  STOP  SET
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DEFAULT_STOP_SET	TokenNameIdentifier	 DEFAULT  STOP  SET
=	TokenNameEQUAL	
loadStopwordSet	TokenNameIdentifier	 load Stopword Set
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
DEFAULT_STOPWORD_FILE	TokenNameIdentifier	 DEFAULT  STOPWORD  FILE
,	TokenNameCOMMA	
STOPWORDS_COMMENT	TokenNameIdentifier	 STOPWORDS  COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default set should always be present as it is part of the 	TokenNameCOMMENT_LINE	default set should always be present as it is part of the 
// distribution (JAR) 	TokenNameCOMMENT_LINE	distribution (JAR) 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Unable to load default stopword set"	TokenNameStringLiteral	Unable to load default stopword set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Builds an analyzer with the default stop words. * * @param matchVersion lucene compatibility version */	TokenNameCOMMENT_JAVADOC	 Builds an analyzer with the default stop words. * @param matchVersion lucene compatibility version 
public	TokenNamepublic	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_36	TokenNameIdentifier	 LUCENE 36
)	TokenNameRPAREN	
?	TokenNameQUESTION	
DefaultSetHolder	TokenNameIdentifier	 Default Set Holder
.	TokenNameDOT	
DEFAULT_STOP_SET	TokenNameIdentifier	 DEFAULT  STOP  SET
:	TokenNameCOLON	
StopAnalyzer	TokenNameIdentifier	 Stop Analyzer
.	TokenNameDOT	
ENGLISH_STOP_WORDS_SET	TokenNameIdentifier	 ENGLISH  STOP  WORDS  SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds an analyzer with the given stop words. * * @param matchVersion lucene compatibility version * @param stopwords a stopword set */	TokenNameCOMMENT_JAVADOC	 Builds an analyzer with the given stop words. * @param matchVersion lucene compatibility version @param stopwords a stopword set 
public	TokenNamepublic	
ThaiAnalyzer	TokenNameIdentifier	 Thai Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopwords	TokenNameIdentifier	 stopwords
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
stopwords	TokenNameIdentifier	 stopwords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates * {@link org.apache.lucene.analysis.ReusableAnalyzerBase.TokenStreamComponents} * used to tokenize all the text in the provided {@link Reader}. * * @return {@link org.apache.lucene.analysis.ReusableAnalyzerBase.TokenStreamComponents} * built from a {@link StandardTokenizer} filtered with * {@link StandardFilter}, {@link LowerCaseFilter}, {@link ThaiWordFilter}, and * {@link StopFilter} */	TokenNameCOMMENT_JAVADOC	 Creates {@link org.apache.lucene.analysis.ReusableAnalyzerBase.TokenStreamComponents} used to tokenize all the text in the provided {@link Reader}. * @return {@link org.apache.lucene.analysis.ReusableAnalyzerBase.TokenStreamComponents} built from a {@link StandardTokenizer} filtered with {@link StandardFilter}, {@link LowerCaseFilter}, {@link ThaiWordFilter}, and {@link StopFilter} 
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
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenStream	TokenNameIdentifier	 Token Stream
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StandardFilter	TokenNameIdentifier	 Standard Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
LowerCaseFilter	TokenNameIdentifier	 Lower Case Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ThaiWordFilter	TokenNameIdentifier	 Thai Word Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
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
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
stopwords	TokenNameIdentifier	 stopwords
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
