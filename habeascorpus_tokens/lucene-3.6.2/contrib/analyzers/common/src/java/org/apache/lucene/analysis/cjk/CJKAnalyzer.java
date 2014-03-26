package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cjk	TokenNameIdentifier	 cjk
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
CharArraySet	TokenNameIdentifier	 Char Array Set
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
StopwordAnalyzerBase	TokenNameIdentifier	 Stopword Analyzer Base
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
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
/** * An {@link Analyzer} that tokenizes text with {@link StandardTokenizer}, * normalizes content with {@link CJKWidthFilter}, folds case with * {@link LowerCaseFilter}, forms bigrams of CJK with {@link CJKBigramFilter}, * and filters stopwords with {@link StopFilter} */	TokenNameCOMMENT_JAVADOC	 An {@link Analyzer} that tokenizes text with {@link StandardTokenizer}, normalizes content with {@link CJKWidthFilter}, folds case with {@link LowerCaseFilter}, forms bigrams of CJK with {@link CJKBigramFilter}, and filters stopwords with {@link StopFilter} 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CJKAnalyzer	TokenNameIdentifier	 CJK Analyzer
extends	TokenNameextends	
StopwordAnalyzerBase	TokenNameIdentifier	 Stopword Analyzer Base
{	TokenNameLBRACE	
//~ Static fields/initializers --------------------------------------------- 	TokenNameCOMMENT_LINE	~ Static fields/initializers --------------------------------------------- 
/** * An array containing some common English words that are not usually * useful for searching and some double-byte interpunctions. * @deprecated use {@link #getDefaultStopSet()} instead */	TokenNameCOMMENT_JAVADOC	 An array containing some common English words that are not usually useful for searching and some double-byte interpunctions. @deprecated use {@link #getDefaultStopSet()} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
STOP_WORDS	TokenNameIdentifier	 STOP  WORDS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"a"	TokenNameStringLiteral	a
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
"s"	TokenNameStringLiteral	s
,	TokenNameCOMMA	
"such"	TokenNameStringLiteral	such
,	TokenNameCOMMA	
"t"	TokenNameStringLiteral	t
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
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"www"	TokenNameStringLiteral	www
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
//~ Instance fields -------------------------------------------------------- 	TokenNameCOMMENT_LINE	~ Instance fields -------------------------------------------------------- 
/** * Returns an unmodifiable instance of the default stop-words set. * @return an unmodifiable instance of the default stop-words set. */	TokenNameCOMMENT_JAVADOC	 Returns an unmodifiable instance of the default stop-words set. @return an unmodifiable instance of the default stop-words set. 
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
=	TokenNameEQUAL	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
unmodifiableSet	TokenNameIdentifier	 unmodifiable Set
(	TokenNameLPAREN	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
STOP_WORDS	TokenNameIdentifier	 STOP  WORDS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//~ Constructors ----------------------------------------------------------- 	TokenNameCOMMENT_LINE	~ Constructors ----------------------------------------------------------- 
/** * Builds an analyzer which removes words in {@link #getDefaultStopSet()}. */	TokenNameCOMMENT_JAVADOC	 Builds an analyzer which removes words in {@link #getDefaultStopSet()}. 
public	TokenNamepublic	
CJKAnalyzer	TokenNameIdentifier	 CJK Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
DefaultSetHolder	TokenNameIdentifier	 Default Set Holder
.	TokenNameDOT	
DEFAULT_STOP_SET	TokenNameIdentifier	 DEFAULT  STOP  SET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds an analyzer with the given stop words * * @param matchVersion * lucene compatibility version * @param stopwords * a stopword set */	TokenNameCOMMENT_JAVADOC	 Builds an analyzer with the given stop words * @param matchVersion lucene compatibility version @param stopwords a stopword set 
public	TokenNamepublic	
CJKAnalyzer	TokenNameIdentifier	 CJK Analyzer
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
/** * Builds an analyzer which removes words in the provided array. * * @param stopWords stop word array * @deprecated use {@link #CJKAnalyzer(Version, Set)} instead */	TokenNameCOMMENT_JAVADOC	 Builds an analyzer which removes words in the provided array. * @param stopWords stop word array @deprecated use {@link #CJKAnalyzer(Version, Set)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
CJKAnalyzer	TokenNameIdentifier	 CJK Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
StopFilter	TokenNameIdentifier	 Stop Filter
.	TokenNameDOT	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//~ Methods ---------------------------------------------------------------- 	TokenNameCOMMENT_LINE	~ Methods ---------------------------------------------------------------- 
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
if	TokenNameif	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_36	TokenNameIdentifier	 LUCENE 36
)	TokenNameRPAREN	
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
// run the widthfilter first before bigramming, it sometimes combines characters. 	TokenNameCOMMENT_LINE	run the widthfilter first before bigramming, it sometimes combines characters. 
TokenStream	TokenNameIdentifier	 Token Stream
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
CJKWidthFilter	TokenNameIdentifier	 CJK Width Filter
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
CJKBigramFilter	TokenNameIdentifier	 CJK Bigram Filter
(	TokenNameLPAREN	
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
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
Tokenizer	TokenNameIdentifier	 Tokenizer
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
CJKTokenizer	TokenNameIdentifier	 CJK Tokenizer
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	
