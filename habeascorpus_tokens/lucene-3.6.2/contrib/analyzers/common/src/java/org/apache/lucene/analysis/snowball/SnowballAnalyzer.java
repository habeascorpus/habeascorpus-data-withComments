package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
snowball	TokenNameIdentifier	 snowball
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
en	TokenNameIdentifier	 en
.	TokenNameDOT	
EnglishPossessiveFilter	TokenNameIdentifier	 English Possessive Filter
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
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
TurkishLowerCaseFilter	TokenNameIdentifier	 Turkish Lower Case Filter
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
/** Filters {@link StandardTokenizer} with {@link StandardFilter}, {@link * LowerCaseFilter}, {@link StopFilter} and {@link SnowballFilter}. * * Available stemmers are listed in org.tartarus.snowball.ext. The name of a * stemmer is the part of the class name before "Stemmer", e.g., the stemmer in * {@link org.tartarus.snowball.ext.EnglishStemmer} is named "English". * * <p><b>NOTE</b>: This class uses the same {@link Version} * dependent settings as {@link StandardAnalyzer}, with the following addition: * <ul> * <li> As of 3.1, uses {@link TurkishLowerCaseFilter} for Turkish language. * </ul> * </p> * @deprecated Use the language-specific analyzer in contrib/analyzers instead. * This analyzer will be removed in Lucene 5.0 */	TokenNameCOMMENT_JAVADOC	 Filters {@link StandardTokenizer} with {@link StandardFilter}, {@link LowerCaseFilter}, {@link StopFilter} and {@link SnowballFilter}. * Available stemmers are listed in org.tartarus.snowball.ext. The name of a stemmer is the part of the class name before "Stemmer", e.g., the stemmer in {@link org.tartarus.snowball.ext.EnglishStemmer} is named "English". * <p><b>NOTE</b>: This class uses the same {@link Version} dependent settings as {@link StandardAnalyzer}, with the following addition: <ul> <li> As of 3.1, uses {@link TurkishLowerCaseFilter} for Turkish language. </ul> </p> @deprecated Use the language-specific analyzer in contrib/analyzers instead. This analyzer will be removed in Lucene 5.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SnowballAnalyzer	TokenNameIdentifier	 Snowball Analyzer
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopSet	TokenNameIdentifier	 stop Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
;	TokenNameSEMICOLON	
/** Builds the named analyzer with no stop words. */	TokenNameCOMMENT_JAVADOC	 Builds the named analyzer with no stop words. 
public	TokenNamepublic	
SnowballAnalyzer	TokenNameIdentifier	 Snowball Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
matchVersion	TokenNameIdentifier	 match Version
=	TokenNameEQUAL	
matchVersion	TokenNameIdentifier	 match Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds the named analyzer with the given stop words. * @deprecated Use {@link #SnowballAnalyzer(Version, String, Set)} instead. */	TokenNameCOMMENT_JAVADOC	 Builds the named analyzer with the given stop words. @deprecated Use {@link #SnowballAnalyzer(Version, String, Set)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
SnowballAnalyzer	TokenNameIdentifier	 Snowball Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stopSet	TokenNameIdentifier	 stop Set
=	TokenNameEQUAL	
StopFilter	TokenNameIdentifier	 Stop Filter
.	TokenNameDOT	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Builds the named analyzer with the given stop words. */	TokenNameCOMMENT_JAVADOC	 Builds the named analyzer with the given stop words. 
public	TokenNamepublic	
SnowballAnalyzer	TokenNameIdentifier	 Snowball Analyzer
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stopSet	TokenNameIdentifier	 stop Set
=	TokenNameEQUAL	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
unmodifiableSet	TokenNameIdentifier	 unmodifiable Set
(	TokenNameLPAREN	
CharArraySet	TokenNameIdentifier	 Char Array Set
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructs a {@link StandardTokenizer} filtered by a {@link StandardFilter}, a {@link LowerCaseFilter}, a {@link StopFilter}, and a {@link SnowballFilter} */	TokenNameCOMMENT_JAVADOC	 Constructs a {@link StandardTokenizer} filtered by a {@link StandardFilter}, a {@link LowerCaseFilter}, a {@link StopFilter}, and a {@link SnowballFilter} 
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
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StandardFilter	TokenNameIdentifier	 Standard Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remove the possessive 's for english stemmers 	TokenNameCOMMENT_LINE	remove the possessive 's for english stemmers 
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
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"English"	TokenNameStringLiteral	English
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Porter"	TokenNameStringLiteral	Porter
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Lovins"	TokenNameStringLiteral	Lovins
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
EnglishPossessiveFilter	TokenNameIdentifier	 English Possessive Filter
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use a special lowercase filter for turkish, the stemmer expects it. 	TokenNameCOMMENT_LINE	Use a special lowercase filter for turkish, the stemmer expects it. 
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
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Turkish"	TokenNameStringLiteral	Turkish
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
TurkishLowerCaseFilter	TokenNameIdentifier	 Turkish Lower Case Filter
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
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
if	TokenNameif	
(	TokenNameLPAREN	
stopSet	TokenNameIdentifier	 stop Set
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
stopSet	TokenNameIdentifier	 stop Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
SnowballFilter	TokenNameIdentifier	 Snowball Filter
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
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
/** Returns a (possibly reused) {@link StandardTokenizer} filtered by a * {@link StandardFilter}, a {@link LowerCaseFilter}, * a {@link StopFilter}, and a {@link SnowballFilter} */	TokenNameCOMMENT_JAVADOC	 Returns a (possibly reused) {@link StandardTokenizer} filtered by a {@link StandardFilter}, a {@link LowerCaseFilter}, a {@link StopFilter}, and a {@link SnowballFilter} 
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
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StandardFilter	TokenNameIdentifier	 Standard Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use a special lowercase filter for turkish, the stemmer expects it. 	TokenNameCOMMENT_LINE	Use a special lowercase filter for turkish, the stemmer expects it. 
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
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Turkish"	TokenNameStringLiteral	Turkish
)	TokenNameRPAREN	
)	TokenNameRPAREN	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
TurkishLowerCaseFilter	TokenNameIdentifier	 Turkish Lower Case Filter
(	TokenNameLPAREN	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
LowerCaseFilter	TokenNameIdentifier	 Lower Case Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stopSet	TokenNameIdentifier	 stop Set
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
stopSet	TokenNameIdentifier	 stop Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
SnowballFilter	TokenNameIdentifier	 Snowball Filter
(	TokenNameLPAREN	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
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
