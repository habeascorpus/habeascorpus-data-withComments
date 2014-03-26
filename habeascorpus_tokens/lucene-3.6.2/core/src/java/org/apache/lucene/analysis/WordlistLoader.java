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
BufferedReader	TokenNameIdentifier	 Buffered Reader
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
/** * Loader for text files that represent a list of stopwords. * * @see IOUtils to obtain {@link Reader} instances * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Loader for text files that represent a list of stopwords. * @see IOUtils to obtain {@link Reader} instances @lucene.internal 
public	TokenNamepublic	
class	TokenNameclass	
WordlistLoader	TokenNameIdentifier	 Wordlist Loader
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INITITAL_CAPACITY	TokenNameIdentifier	 INITITAL  CAPACITY
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Reads lines from a Reader and adds every line as an entry to a CharArraySet (omitting * leading and trailing whitespace). Every line of the Reader should contain only * one word. The words need to be in lowercase if you make use of an * Analyzer which uses LowerCaseFilter (like StandardAnalyzer). * * @param reader Reader containing the wordlist * @param result the {@link CharArraySet} to fill with the readers words * @return the given {@link CharArraySet} with the reader's words */	TokenNameCOMMENT_JAVADOC	 Reads lines from a Reader and adds every line as an entry to a CharArraySet (omitting leading and trailing whitespace). Every line of the Reader should contain only one word. The words need to be in lowercase if you make use of an Analyzer which uses LowerCaseFilter (like StandardAnalyzer). * @param reader Reader containing the wordlist @param result the {@link CharArraySet} to fill with the readers words @return the given {@link CharArraySet} with the reader's words 
public	TokenNamepublic	
static	TokenNamestatic	
CharArraySet	TokenNameIdentifier	 Char Array Set
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
getBufferedReader	TokenNameIdentifier	 get Buffered Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
br	TokenNameIdentifier	 br
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads lines from a Reader and adds every line as an entry to a CharArraySet (omitting * leading and trailing whitespace). Every line of the Reader should contain only * one word. The words need to be in lowercase if you make use of an * Analyzer which uses LowerCaseFilter (like StandardAnalyzer). * * @param reader Reader containing the wordlist * @param matchVersion the Lucene {@link Version} * @return A {@link CharArraySet} with the reader's words */	TokenNameCOMMENT_JAVADOC	 Reads lines from a Reader and adds every line as an entry to a CharArraySet (omitting leading and trailing whitespace). Every line of the Reader should contain only one word. The words need to be in lowercase if you make use of an Analyzer which uses LowerCaseFilter (like StandardAnalyzer). * @param reader Reader containing the wordlist @param matchVersion the Lucene {@link Version} @return A {@link CharArraySet} with the reader's words 
public	TokenNamepublic	
static	TokenNamestatic	
CharArraySet	TokenNameIdentifier	 Char Array Set
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
INITITAL_CAPACITY	TokenNameIdentifier	 INITITAL  CAPACITY
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads lines from a Reader and adds every non-comment line as an entry to a CharArraySet (omitting * leading and trailing whitespace). Every line of the Reader should contain only * one word. The words need to be in lowercase if you make use of an * Analyzer which uses LowerCaseFilter (like StandardAnalyzer). * * @param reader Reader containing the wordlist * @param comment The string representing a comment. * @param matchVersion the Lucene {@link Version} * @return A CharArraySet with the reader's words */	TokenNameCOMMENT_JAVADOC	 Reads lines from a Reader and adds every non-comment line as an entry to a CharArraySet (omitting leading and trailing whitespace). Every line of the Reader should contain only one word. The words need to be in lowercase if you make use of an Analyzer which uses LowerCaseFilter (like StandardAnalyzer). * @param reader Reader containing the wordlist @param comment The string representing a comment. @param matchVersion the Lucene {@link Version} @return A CharArraySet with the reader's words 
public	TokenNamepublic	
static	TokenNamestatic	
CharArraySet	TokenNameIdentifier	 Char Array Set
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
,	TokenNameCOMMA	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
comment	TokenNameIdentifier	 comment
,	TokenNameCOMMA	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
INITITAL_CAPACITY	TokenNameIdentifier	 INITITAL  CAPACITY
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads lines from a Reader and adds every non-comment line as an entry to a CharArraySet (omitting * leading and trailing whitespace). Every line of the Reader should contain only * one word. The words need to be in lowercase if you make use of an * Analyzer which uses LowerCaseFilter (like StandardAnalyzer). * * @param reader Reader containing the wordlist * @param comment The string representing a comment. * @param result the {@link CharArraySet} to fill with the readers words * @return the given {@link CharArraySet} with the reader's words */	TokenNameCOMMENT_JAVADOC	 Reads lines from a Reader and adds every non-comment line as an entry to a CharArraySet (omitting leading and trailing whitespace). Every line of the Reader should contain only one word. The words need to be in lowercase if you make use of an Analyzer which uses LowerCaseFilter (like StandardAnalyzer). * @param reader Reader containing the wordlist @param comment The string representing a comment. @param result the {@link CharArraySet} to fill with the readers words @return the given {@link CharArraySet} with the reader's words 
public	TokenNamepublic	
static	TokenNamestatic	
CharArraySet	TokenNameIdentifier	 Char Array Set
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
getBufferedReader	TokenNameIdentifier	 get Buffered Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
br	TokenNameIdentifier	 br
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads stopwords from a stopword list in Snowball format. * <p> * The snowball format is the following: * <ul> * <li>Lines may contain multiple words separated by whitespace. * <li>The comment character is the vertical line (&#124;). * <li>Lines may contain trailing comments. * </ul> * </p> * * @param reader Reader containing a Snowball stopword list * @param result the {@link CharArraySet} to fill with the readers words * @return the given {@link CharArraySet} with the reader's words */	TokenNameCOMMENT_JAVADOC	 Reads stopwords from a stopword list in Snowball format. <p> The snowball format is the following: <ul> <li>Lines may contain multiple words separated by whitespace. <li>The comment character is the vertical line (&#124;). <li>Lines may contain trailing comments. </ul> </p> * @param reader Reader containing a Snowball stopword list @param result the {@link CharArraySet} to fill with the readers words @return the given {@link CharArraySet} with the reader's words 
public	TokenNamepublic	
static	TokenNamestatic	
CharArraySet	TokenNameIdentifier	 Char Array Set
getSnowballWordSet	TokenNameIdentifier	 get Snowball Word Set
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
CharArraySet	TokenNameIdentifier	 Char Array Set
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
getBufferedReader	TokenNameIdentifier	 get Buffered Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'|'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comment	TokenNameIdentifier	 comment
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
words	TokenNameIdentifier	 words
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s+"	TokenNameStringLiteral	\s+
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
words	TokenNameIdentifier	 words
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
words	TokenNameIdentifier	 words
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
words	TokenNameIdentifier	 words
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
br	TokenNameIdentifier	 br
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads stopwords from a stopword list in Snowball format. * <p> * The snowball format is the following: * <ul> * <li>Lines may contain multiple words separated by whitespace. * <li>The comment character is the vertical line (&#124;). * <li>Lines may contain trailing comments. * </ul> * </p> * * @param reader Reader containing a Snowball stopword list * @param matchVersion the Lucene {@link Version} * @return A {@link CharArraySet} with the reader's words */	TokenNameCOMMENT_JAVADOC	 Reads stopwords from a stopword list in Snowball format. <p> The snowball format is the following: <ul> <li>Lines may contain multiple words separated by whitespace. <li>The comment character is the vertical line (&#124;). <li>Lines may contain trailing comments. </ul> </p> * @param reader Reader containing a Snowball stopword list @param matchVersion the Lucene {@link Version} @return A {@link CharArraySet} with the reader's words 
public	TokenNamepublic	
static	TokenNamestatic	
CharArraySet	TokenNameIdentifier	 Char Array Set
getSnowballWordSet	TokenNameIdentifier	 get Snowball Word Set
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getSnowballWordSet	TokenNameIdentifier	 get Snowball Word Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
INITITAL_CAPACITY	TokenNameIdentifier	 INITITAL  CAPACITY
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads a stem dictionary. Each line contains: * <pre>word<b>\t</b>stem</pre> * (i.e. two tab separated words) * * @return stem dictionary that overrules the stemming algorithm * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Reads a stem dictionary. Each line contains: <pre>word<b>\t</b>stem</pre> (i.e. two tab separated words) * @return stem dictionary that overrules the stemming algorithm @throws IOException 
public	TokenNamepublic	
static	TokenNamestatic	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getStemDict	TokenNameIdentifier	 get Stem Dict
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
CharArrayMap	TokenNameIdentifier	 Char Array Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
getBufferedReader	TokenNameIdentifier	 get Buffered Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wordstem	TokenNameIdentifier	 wordstem
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
wordstem	TokenNameIdentifier	 wordstem
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
wordstem	TokenNameIdentifier	 wordstem
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
br	TokenNameIdentifier	 br
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
BufferedReader	TokenNameIdentifier	 Buffered Reader
getBufferedReader	TokenNameIdentifier	 get Buffered Reader
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
instanceof	TokenNameinstanceof	
BufferedReader	TokenNameIdentifier	 Buffered Reader
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
BufferedReader	TokenNameIdentifier	 Buffered Reader
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
