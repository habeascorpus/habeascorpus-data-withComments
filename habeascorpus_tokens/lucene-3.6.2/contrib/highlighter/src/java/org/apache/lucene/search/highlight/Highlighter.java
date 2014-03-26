package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
highlight	TokenNameIdentifier	 highlight
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
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
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
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
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
PriorityQueue	TokenNameIdentifier	 Priority Queue
;	TokenNameSEMICOLON	
/** * Class used to markup highlighted terms found in the best sections of a * text, using configurable {@link Fragmenter}, {@link Scorer}, {@link Formatter}, * {@link Encoder} and tokenizers. */	TokenNameCOMMENT_JAVADOC	 Class used to markup highlighted terms found in the best sections of a text, using configurable {@link Fragmenter}, {@link Scorer}, {@link Formatter}, {@link Encoder} and tokenizers. 
public	TokenNamepublic	
class	TokenNameclass	
Highlighter	TokenNameIdentifier	 Highlighter
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_CHARS_TO_ANALYZE	TokenNameIdentifier	 DEFAULT  MAX  CHARS  TO  ANALYZE
=	TokenNameEQUAL	
50	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxDocCharsToAnalyze	TokenNameIdentifier	 max Doc Chars To Analyze
=	TokenNameEQUAL	
DEFAULT_MAX_CHARS_TO_ANALYZE	TokenNameIdentifier	 DEFAULT  MAX  CHARS  TO  ANALYZE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Formatter	TokenNameIdentifier	 Formatter
formatter	TokenNameIdentifier	 formatter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Encoder	TokenNameIdentifier	 Encoder
encoder	TokenNameIdentifier	 encoder
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Fragmenter	TokenNameIdentifier	 Fragmenter
textFragmenter	TokenNameIdentifier	 text Fragmenter
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleFragmenter	TokenNameIdentifier	 Simple Fragmenter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
fragmentScorer	TokenNameIdentifier	 fragment Scorer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Highlighter	TokenNameIdentifier	 Highlighter
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
fragmentScorer	TokenNameIdentifier	 fragment Scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
SimpleHTMLFormatter	TokenNameIdentifier	 Simple HTML Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Highlighter	TokenNameIdentifier	 Highlighter
(	TokenNameLPAREN	
Formatter	TokenNameIdentifier	 Formatter
formatter	TokenNameIdentifier	 formatter
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
fragmentScorer	TokenNameIdentifier	 fragment Scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
formatter	TokenNameIdentifier	 formatter
,	TokenNameCOMMA	
new	TokenNamenew	
DefaultEncoder	TokenNameIdentifier	 Default Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Highlighter	TokenNameIdentifier	 Highlighter
(	TokenNameLPAREN	
Formatter	TokenNameIdentifier	 Formatter
formatter	TokenNameIdentifier	 formatter
,	TokenNameCOMMA	
Encoder	TokenNameIdentifier	 Encoder
encoder	TokenNameIdentifier	 encoder
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
fragmentScorer	TokenNameIdentifier	 fragment Scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
formatter	TokenNameIdentifier	 formatter
=	TokenNameEQUAL	
formatter	TokenNameIdentifier	 formatter
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
encoder	TokenNameIdentifier	 encoder
=	TokenNameEQUAL	
encoder	TokenNameIdentifier	 encoder
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
=	TokenNameEQUAL	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Highlights chosen terms in a text, extracting the most relevant section. * This is a convenience method that calls * {@link #getBestFragment(TokenStream, String)} * * @param analyzer the analyzer that will be used to split <code>text</code> * into chunks * @param text text to highlight terms in * @param fieldName Name of field used to influence analyzer's tokenization policy * * @return highlighted text fragment or null if no terms found * @throws InvalidTokenOffsetsException thrown if any token's endOffset exceeds the provided text's length */	TokenNameCOMMENT_JAVADOC	 Highlights chosen terms in a text, extracting the most relevant section. This is a convenience method that calls {@link #getBestFragment(TokenStream, String)} * @param analyzer the analyzer that will be used to split <code>text</code> into chunks @param text text to highlight terms in @param fieldName Name of field used to influence analyzer's tokenization policy * @return highlighted text fragment or null if no terms found @throws InvalidTokenOffsetsException thrown if any token's endOffset exceeds the provided text's length 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getBestFragment	TokenNameIdentifier	 get Best Fragment
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
InvalidTokenOffsetsException	TokenNameIdentifier	 Invalid Token Offsets Exception
{	TokenNameLBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getBestFragment	TokenNameIdentifier	 get Best Fragment
(	TokenNameLPAREN	
tokenStream	TokenNameIdentifier	 token Stream
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Highlights chosen terms in a text, extracting the most relevant section. * The document text is analysed in chunks to record hit statistics * across the document. After accumulating stats, the fragment with the highest score * is returned * * @param tokenStream a stream of tokens identified in the text parameter, including offset information. * This is typically produced by an analyzer re-parsing a document's * text. Some work may be done on retrieving TokenStreams more efficiently * by adding support for storing original text position data in the Lucene * index but this support is not currently available (as of Lucene 1.4 rc2). * @param text text to highlight terms in * * @return highlighted text fragment or null if no terms found * @throws InvalidTokenOffsetsException thrown if any token's endOffset exceeds the provided text's length */	TokenNameCOMMENT_JAVADOC	 Highlights chosen terms in a text, extracting the most relevant section. The document text is analysed in chunks to record hit statistics across the document. After accumulating stats, the fragment with the highest score is returned * @param tokenStream a stream of tokens identified in the text parameter, including offset information. This is typically produced by an analyzer re-parsing a document's text. Some work may be done on retrieving TokenStreams more efficiently by adding support for storing original text position data in the Lucene index but this support is not currently available (as of Lucene 1.4 rc2). @param text text to highlight terms in * @return highlighted text fragment or null if no terms found @throws InvalidTokenOffsetsException thrown if any token's endOffset exceeds the provided text's length 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getBestFragment	TokenNameIdentifier	 get Best Fragment
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
InvalidTokenOffsetsException	TokenNameIdentifier	 Invalid Token Offsets Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
getBestFragments	TokenNameIdentifier	 get Best Fragments
(	TokenNameLPAREN	
tokenStream	TokenNameIdentifier	 token Stream
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
results	TokenNameIdentifier	 results
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Highlights chosen terms in a text, extracting the most relevant sections. * This is a convenience method that calls * {@link #getBestFragments(TokenStream, String, int)} * * @param analyzer the analyzer that will be used to split <code>text</code> * into chunks * @param fieldName the name of the field being highlighted (used by analyzer) * @param text text to highlight terms in * @param maxNumFragments the maximum number of fragments. * * @return highlighted text fragments (between 0 and maxNumFragments number of fragments) * @throws InvalidTokenOffsetsException thrown if any token's endOffset exceeds the provided text's length */	TokenNameCOMMENT_JAVADOC	 Highlights chosen terms in a text, extracting the most relevant sections. This is a convenience method that calls {@link #getBestFragments(TokenStream, String, int)} * @param analyzer the analyzer that will be used to split <code>text</code> into chunks @param fieldName the name of the field being highlighted (used by analyzer) @param text text to highlight terms in @param maxNumFragments the maximum number of fragments. * @return highlighted text fragments (between 0 and maxNumFragments number of fragments) @throws InvalidTokenOffsetsException thrown if any token's endOffset exceeds the provided text's length 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBestFragments	TokenNameIdentifier	 get Best Fragments
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
InvalidTokenOffsetsException	TokenNameIdentifier	 Invalid Token Offsets Exception
{	TokenNameLBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getBestFragments	TokenNameIdentifier	 get Best Fragments
(	TokenNameLPAREN	
tokenStream	TokenNameIdentifier	 token Stream
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Highlights chosen terms in a text, extracting the most relevant sections. * The document text is analysed in chunks to record hit statistics * across the document. After accumulating stats, the fragments with the highest scores * are returned as an array of strings in order of score (contiguous fragments are merged into * one in their original order to improve readability) * * @param text text to highlight terms in * @param maxNumFragments the maximum number of fragments. * * @return highlighted text fragments (between 0 and maxNumFragments number of fragments) * @throws InvalidTokenOffsetsException thrown if any token's endOffset exceeds the provided text's length */	TokenNameCOMMENT_JAVADOC	 Highlights chosen terms in a text, extracting the most relevant sections. The document text is analysed in chunks to record hit statistics across the document. After accumulating stats, the fragments with the highest scores are returned as an array of strings in order of score (contiguous fragments are merged into one in their original order to improve readability) * @param text text to highlight terms in @param maxNumFragments the maximum number of fragments. * @return highlighted text fragments (between 0 and maxNumFragments number of fragments) @throws InvalidTokenOffsetsException thrown if any token's endOffset exceeds the provided text's length 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBestFragments	TokenNameIdentifier	 get Best Fragments
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
InvalidTokenOffsetsException	TokenNameIdentifier	 Invalid Token Offsets Exception
{	TokenNameLBRACE	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//sanity check 	TokenNameCOMMENT_LINE	sanity check 
TextFragment	TokenNameIdentifier	 Text Fragment
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
getBestTextFragments	TokenNameIdentifier	 get Best Text Fragments
(	TokenNameLPAREN	
tokenStream	TokenNameIdentifier	 token Stream
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Get text 	TokenNameCOMMENT_LINE	Get text 
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fragTexts	TokenNameIdentifier	 frag Texts
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fragTexts	TokenNameIdentifier	 frag Texts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
fragTexts	TokenNameIdentifier	 frag Texts
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Low level api to get the most relevant (formatted) sections of the document. * This method has been made public to allow visibility of score information held in TextFragment objects. * Thanks to Jason Calabrese for help in redefining the interface. * @param tokenStream * @param text * @param maxNumFragments * @param mergeContiguousFragments * @throws IOException * @throws InvalidTokenOffsetsException thrown if any token's endOffset exceeds the provided text's length */	TokenNameCOMMENT_JAVADOC	 Low level api to get the most relevant (formatted) sections of the document. This method has been made public to allow visibility of score information held in TextFragment objects. Thanks to Jason Calabrese for help in redefining the interface. @param tokenStream @param text @param maxNumFragments @param mergeContiguousFragments @throws IOException @throws InvalidTokenOffsetsException thrown if any token's endOffset exceeds the provided text's length 
public	TokenNamepublic	
final	TokenNamefinal	
TextFragment	TokenNameIdentifier	 Text Fragment
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBestTextFragments	TokenNameIdentifier	 get Best Text Fragments
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
boolean	TokenNameboolean	
mergeContiguousFragments	TokenNameIdentifier	 merge Contiguous Fragments
,	TokenNameCOMMA	
int	TokenNameint	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
InvalidTokenOffsetsException	TokenNameIdentifier	 Invalid Token Offsets Exception
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TextFragment	TokenNameIdentifier	 Text Fragment
>	TokenNameGREATER	
docFrags	TokenNameIdentifier	 doc Frags
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TextFragment	TokenNameIdentifier	 Text Fragment
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
newText	TokenNameIdentifier	 new Text
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextFragment	TokenNameIdentifier	 Text Fragment
currentFrag	TokenNameIdentifier	 current Frag
=	TokenNameEQUAL	
new	TokenNamenew	
TextFragment	TokenNameIdentifier	 Text Fragment
(	TokenNameLPAREN	
newText	TokenNameIdentifier	 new Text
,	TokenNameCOMMA	
newText	TokenNameIdentifier	 new Text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
docFrags	TokenNameIdentifier	 doc Frags
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
instanceof	TokenNameinstanceof	
QueryScorer	TokenNameIdentifier	 Query Scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
QueryScorer	TokenNameIdentifier	 Query Scorer
)	TokenNameRPAREN	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
)	TokenNameRPAREN	
.	TokenNameDOT	
setMaxDocCharsToAnalyze	TokenNameIdentifier	 set Max Doc Chars To Analyze
(	TokenNameLPAREN	
maxDocCharsToAnalyze	TokenNameIdentifier	 max Doc Chars To Analyze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
newStream	TokenNameIdentifier	 new Stream
=	TokenNameEQUAL	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
tokenStream	TokenNameIdentifier	 token Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newStream	TokenNameIdentifier	 new Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokenStream	TokenNameIdentifier	 token Stream
=	TokenNameEQUAL	
newStream	TokenNameIdentifier	 new Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
.	TokenNameDOT	
startFragment	TokenNameIdentifier	 start Fragment
(	TokenNameLPAREN	
currentFrag	TokenNameIdentifier	 current Frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docFrags	TokenNameIdentifier	 doc Frags
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentFrag	TokenNameIdentifier	 current Frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FragmentQueue	TokenNameIdentifier	 Fragment Queue
fragQueue	TokenNameIdentifier	 frag Queue
=	TokenNameEQUAL	
new	TokenNamenew	
FragmentQueue	TokenNameIdentifier	 Fragment Queue
(	TokenNameLPAREN	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tokenText	TokenNameIdentifier	 token Text
;	TokenNameSEMICOLON	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
int	TokenNameint	
lastEndOffset	TokenNameIdentifier	 last End Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
textFragmenter	TokenNameIdentifier	 text Fragmenter
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
tokenStream	TokenNameIdentifier	 token Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenGroup	TokenNameIdentifier	 Token Group
tokenGroup	TokenNameIdentifier	 token Group
=	TokenNameEQUAL	
new	TokenNamenew	
TokenGroup	TokenNameIdentifier	 Token Group
(	TokenNameLPAREN	
tokenStream	TokenNameIdentifier	 token Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
maxDocCharsToAnalyze	TokenNameIdentifier	 max Doc Chars To Analyze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidTokenOffsetsException	TokenNameIdentifier	 Invalid Token Offsets Exception
(	TokenNameLPAREN	
"Token "	TokenNameStringLiteral	Token 
+	TokenNamePLUS	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" exceeds length of provided text sized "	TokenNameStringLiteral	 exceeds length of provided text sized 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tokenGroup	TokenNameIdentifier	 token Group
.	TokenNameDOT	
numTokens	TokenNameIdentifier	 num Tokens
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
tokenGroup	TokenNameIdentifier	 token Group
.	TokenNameDOT	
isDistinct	TokenNameIdentifier	 is Distinct
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//the current token is distinct from previous tokens - 	TokenNameCOMMENT_LINE	the current token is distinct from previous tokens - 
// markup the cached token group info 	TokenNameCOMMENT_LINE	markup the cached token group info 
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
tokenGroup	TokenNameIdentifier	 token Group
.	TokenNameDOT	
matchStartOffset	TokenNameIdentifier	 match Start Offset
;	TokenNameSEMICOLON	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
tokenGroup	TokenNameIdentifier	 token Group
.	TokenNameDOT	
matchEndOffset	TokenNameIdentifier	 match End Offset
;	TokenNameSEMICOLON	
tokenText	TokenNameIdentifier	 token Text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
markedUpText	TokenNameIdentifier	 marked Up Text
=	TokenNameEQUAL	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
highlightTerm	TokenNameIdentifier	 highlight Term
(	TokenNameLPAREN	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
encodeText	TokenNameIdentifier	 encode Text
(	TokenNameLPAREN	
tokenText	TokenNameIdentifier	 token Text
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tokenGroup	TokenNameIdentifier	 token Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//store any whitespace etc from between this and last group 	TokenNameCOMMENT_LINE	store any whitespace etc from between this and last group 
if	TokenNameif	
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
>	TokenNameGREATER	
lastEndOffset	TokenNameIdentifier	 last End Offset
)	TokenNameRPAREN	
newText	TokenNameIdentifier	 new Text
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
encodeText	TokenNameIdentifier	 encode Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
lastEndOffset	TokenNameIdentifier	 last End Offset
,	TokenNameCOMMA	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newText	TokenNameIdentifier	 new Text
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
markedUpText	TokenNameIdentifier	 marked Up Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastEndOffset	TokenNameIdentifier	 last End Offset
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
lastEndOffset	TokenNameIdentifier	 last End Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenGroup	TokenNameIdentifier	 token Group
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//check if current token marks the start of a new fragment 	TokenNameCOMMENT_LINE	check if current token marks the start of a new fragment 
if	TokenNameif	
(	TokenNameLPAREN	
textFragmenter	TokenNameIdentifier	 text Fragmenter
.	TokenNameDOT	
isNewFragment	TokenNameIdentifier	 is New Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentFrag	TokenNameIdentifier	 current Frag
.	TokenNameDOT	
setScore	TokenNameIdentifier	 set Score
(	TokenNameLPAREN	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
.	TokenNameDOT	
getFragmentScore	TokenNameIdentifier	 get Fragment Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//record stats for a new fragment 	TokenNameCOMMENT_LINE	record stats for a new fragment 
currentFrag	TokenNameIdentifier	 current Frag
.	TokenNameDOT	
textEndPos	TokenNameIdentifier	 text End Pos
=	TokenNameEQUAL	
newText	TokenNameIdentifier	 new Text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentFrag	TokenNameIdentifier	 current Frag
=	TokenNameEQUAL	
new	TokenNamenew	
TextFragment	TokenNameIdentifier	 Text Fragment
(	TokenNameLPAREN	
newText	TokenNameIdentifier	 new Text
,	TokenNameCOMMA	
newText	TokenNameIdentifier	 new Text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
docFrags	TokenNameIdentifier	 doc Frags
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
.	TokenNameDOT	
startFragment	TokenNameIdentifier	 start Fragment
(	TokenNameLPAREN	
currentFrag	TokenNameIdentifier	 current Frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docFrags	TokenNameIdentifier	 doc Frags
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentFrag	TokenNameIdentifier	 current Frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
tokenGroup	TokenNameIdentifier	 token Group
.	TokenNameDOT	
addToken	TokenNameIdentifier	 add Token
(	TokenNameLPAREN	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
.	TokenNameDOT	
getTokenScore	TokenNameIdentifier	 get Token Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if(lastEndOffset>maxDocBytesToAnalyze) 	TokenNameCOMMENT_LINE	if(lastEndOffset>maxDocBytesToAnalyze) 
// { 	TokenNameCOMMENT_LINE	{ 
// break; 	TokenNameCOMMENT_LINE	break; 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
currentFrag	TokenNameIdentifier	 current Frag
.	TokenNameDOT	
setScore	TokenNameIdentifier	 set Score
(	TokenNameLPAREN	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
.	TokenNameDOT	
getFragmentScore	TokenNameIdentifier	 get Fragment Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenGroup	TokenNameIdentifier	 token Group
.	TokenNameDOT	
numTokens	TokenNameIdentifier	 num Tokens
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//flush the accumulated text (same code as in above loop) 	TokenNameCOMMENT_LINE	flush the accumulated text (same code as in above loop) 
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
tokenGroup	TokenNameIdentifier	 token Group
.	TokenNameDOT	
matchStartOffset	TokenNameIdentifier	 match Start Offset
;	TokenNameSEMICOLON	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
tokenGroup	TokenNameIdentifier	 token Group
.	TokenNameDOT	
matchEndOffset	TokenNameIdentifier	 match End Offset
;	TokenNameSEMICOLON	
tokenText	TokenNameIdentifier	 token Text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
markedUpText	TokenNameIdentifier	 marked Up Text
=	TokenNameEQUAL	
formatter	TokenNameIdentifier	 formatter
.	TokenNameDOT	
highlightTerm	TokenNameIdentifier	 highlight Term
(	TokenNameLPAREN	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
encodeText	TokenNameIdentifier	 encode Text
(	TokenNameLPAREN	
tokenText	TokenNameIdentifier	 token Text
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tokenGroup	TokenNameIdentifier	 token Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//store any whitespace etc from between this and last group 	TokenNameCOMMENT_LINE	store any whitespace etc from between this and last group 
if	TokenNameif	
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
>	TokenNameGREATER	
lastEndOffset	TokenNameIdentifier	 last End Offset
)	TokenNameRPAREN	
newText	TokenNameIdentifier	 new Text
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
encodeText	TokenNameIdentifier	 encode Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
lastEndOffset	TokenNameIdentifier	 last End Offset
,	TokenNameCOMMA	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newText	TokenNameIdentifier	 new Text
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
markedUpText	TokenNameIdentifier	 marked Up Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastEndOffset	TokenNameIdentifier	 last End Offset
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
lastEndOffset	TokenNameIdentifier	 last End Offset
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Test what remains of the original text beyond the point where we stopped analyzing 	TokenNameCOMMENT_LINE	Test what remains of the original text beyond the point where we stopped analyzing 
if	TokenNameif	
(	TokenNameLPAREN	
// if there is text beyond the last token considered.. 	TokenNameCOMMENT_LINE	if there is text beyond the last token considered.. 
(	TokenNameLPAREN	
lastEndOffset	TokenNameIdentifier	 last End Offset
<	TokenNameLESS	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
// and that text is not too large... 	TokenNameCOMMENT_LINE	and that text is not too large... 
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
maxDocCharsToAnalyze	TokenNameIdentifier	 max Doc Chars To Analyze
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//append it to the last fragment 	TokenNameCOMMENT_LINE	append it to the last fragment 
newText	TokenNameIdentifier	 new Text
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
encodeText	TokenNameIdentifier	 encode Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
lastEndOffset	TokenNameIdentifier	 last End Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentFrag	TokenNameIdentifier	 current Frag
.	TokenNameDOT	
textEndPos	TokenNameIdentifier	 text End Pos
=	TokenNameEQUAL	
newText	TokenNameIdentifier	 new Text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//sort the most relevant sections of the text 	TokenNameCOMMENT_LINE	sort the most relevant sections of the text 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
TextFragment	TokenNameIdentifier	 Text Fragment
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
docFrags	TokenNameIdentifier	 doc Frags
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentFrag	TokenNameIdentifier	 current Frag
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//If you are running with a version of Lucene before 11th Sept 03 	TokenNameCOMMENT_LINE	If you are running with a version of Lucene before 11th Sept 03 
// you do not have PriorityQueue.insert() - so uncomment the code below 	TokenNameCOMMENT_LINE	you do not have PriorityQueue.insert() - so uncomment the code below 
/* if (currentFrag.getScore() >= minScore) { fragQueue.put(currentFrag); if (fragQueue.size() > maxNumFragments) { // if hit queue overfull fragQueue.pop(); // remove lowest in hit queue minScore = ((TextFragment) fragQueue.top()).getScore(); // reset minScore } } */	TokenNameCOMMENT_BLOCK	 if (currentFrag.getScore() >= minScore) { fragQueue.put(currentFrag); if (fragQueue.size() > maxNumFragments) { // if hit queue overfull fragQueue.pop(); // remove lowest in hit queue minScore = ((TextFragment) fragQueue.top()).getScore(); // reset minScore } } 
//The above code caused a problem as a result of Christoph Goller's 11th Sept 03 	TokenNameCOMMENT_LINE	The above code caused a problem as a result of Christoph Goller's 11th Sept 03 
//fix to PriorityQueue. The correct method to use here is the new "insert" method 	TokenNameCOMMENT_LINE	fix to PriorityQueue. The correct method to use here is the new "insert" method 
// USE ABOVE CODE IF THIS DOES NOT COMPILE! 	TokenNameCOMMENT_LINE	USE ABOVE CODE IF THIS DOES NOT COMPILE! 
fragQueue	TokenNameIdentifier	 frag Queue
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
currentFrag	TokenNameIdentifier	 current Frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//return the most relevant fragments 	TokenNameCOMMENT_LINE	return the most relevant fragments 
TextFragment	TokenNameIdentifier	 Text Fragment
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TextFragment	TokenNameIdentifier	 Text Fragment
[	TokenNameLBRACKET	
fragQueue	TokenNameIdentifier	 frag Queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fragQueue	TokenNameIdentifier	 frag Queue
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//merge any contiguous fragments to improve readability 	TokenNameCOMMENT_LINE	merge any contiguous fragments to improve readability 
if	TokenNameif	
(	TokenNameLPAREN	
mergeContiguousFragments	TokenNameIdentifier	 merge Contiguous Fragments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergeContiguousFragments	TokenNameIdentifier	 merge Contiguous Fragments
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TextFragment	TokenNameIdentifier	 Text Fragment
>	TokenNameGREATER	
fragTexts	TokenNameIdentifier	 frag Texts
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TextFragment	TokenNameIdentifier	 Text Fragment
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fragTexts	TokenNameIdentifier	 frag Texts
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
fragTexts	TokenNameIdentifier	 frag Texts
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
TextFragment	TokenNameIdentifier	 Text Fragment
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
frag	TokenNameIdentifier	 frag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenStream	TokenNameIdentifier	 token Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Improves readability of a score-sorted list of TextFragments by merging any fragments * that were contiguous in the original text into one larger fragment with the correct order. * This will leave a "null" in the array entry for the lesser scored fragment. * * @param frag An array of document fragments in descending score */	TokenNameCOMMENT_JAVADOC	 Improves readability of a score-sorted list of TextFragments by merging any fragments that were contiguous in the original text into one larger fragment with the correct order. This will leave a "null" in the array entry for the lesser scored fragment. * @param frag An array of document fragments in descending score 
private	TokenNameprivate	
void	TokenNamevoid	
mergeContiguousFragments	TokenNameIdentifier	 merge Contiguous Fragments
(	TokenNameLPAREN	
TextFragment	TokenNameIdentifier	 Text Fragment
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
frag	TokenNameIdentifier	 frag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
mergingStillBeingDone	TokenNameIdentifier	 merging Still Being Done
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
do	TokenNamedo	
{	TokenNameLBRACE	
mergingStillBeingDone	TokenNameIdentifier	 merging Still Being Done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//initialise loop control flag 	TokenNameCOMMENT_LINE	initialise loop control flag 
//for each fragment, scan other frags looking for contiguous blocks 	TokenNameCOMMENT_LINE	for each fragment, scan other frags looking for contiguous blocks 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//merge any contiguous blocks 	TokenNameCOMMENT_LINE	merge any contiguous blocks 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TextFragment	TokenNameIdentifier	 Text Fragment
frag1	TokenNameIdentifier	 frag1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
TextFragment	TokenNameIdentifier	 Text Fragment
frag2	TokenNameIdentifier	 frag2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
frag1Num	TokenNameIdentifier	 frag1 Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
frag2Num	TokenNameIdentifier	 frag2 Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bestScoringFragNum	TokenNameIdentifier	 best Scoring Frag Num
;	TokenNameSEMICOLON	
int	TokenNameint	
worstScoringFragNum	TokenNameIdentifier	 worst Scoring Frag Num
;	TokenNameSEMICOLON	
//if blocks are contiguous.... 	TokenNameCOMMENT_LINE	if blocks are contiguous.... 
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
follows	TokenNameIdentifier	 follows
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frag1	TokenNameIdentifier	 frag1
=	TokenNameEQUAL	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
frag1Num	TokenNameIdentifier	 frag1 Num
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
frag2	TokenNameIdentifier	 frag2
=	TokenNameEQUAL	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
frag2Num	TokenNameIdentifier	 frag2 Num
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
follows	TokenNameIdentifier	 follows
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frag1	TokenNameIdentifier	 frag1
=	TokenNameEQUAL	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
frag1Num	TokenNameIdentifier	 frag1 Num
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
frag2	TokenNameIdentifier	 frag2
=	TokenNameEQUAL	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
frag2Num	TokenNameIdentifier	 frag2 Num
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//merging required.. 	TokenNameCOMMENT_LINE	merging required.. 
if	TokenNameif	
(	TokenNameLPAREN	
frag1	TokenNameIdentifier	 frag1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
frag1	TokenNameIdentifier	 frag1
.	TokenNameDOT	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
frag2	TokenNameIdentifier	 frag2
.	TokenNameDOT	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bestScoringFragNum	TokenNameIdentifier	 best Scoring Frag Num
=	TokenNameEQUAL	
frag1Num	TokenNameIdentifier	 frag1 Num
;	TokenNameSEMICOLON	
worstScoringFragNum	TokenNameIdentifier	 worst Scoring Frag Num
=	TokenNameEQUAL	
frag2Num	TokenNameIdentifier	 frag2 Num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
bestScoringFragNum	TokenNameIdentifier	 best Scoring Frag Num
=	TokenNameEQUAL	
frag2Num	TokenNameIdentifier	 frag2 Num
;	TokenNameSEMICOLON	
worstScoringFragNum	TokenNameIdentifier	 worst Scoring Frag Num
=	TokenNameEQUAL	
frag1Num	TokenNameIdentifier	 frag1 Num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
frag1	TokenNameIdentifier	 frag1
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
frag2	TokenNameIdentifier	 frag2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
worstScoringFragNum	TokenNameIdentifier	 worst Scoring Frag Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
mergingStillBeingDone	TokenNameIdentifier	 merging Still Being Done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
frag	TokenNameIdentifier	 frag
[	TokenNameLBRACKET	
bestScoringFragNum	TokenNameIdentifier	 best Scoring Frag Num
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
frag1	TokenNameIdentifier	 frag1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
mergingStillBeingDone	TokenNameIdentifier	 merging Still Being Done
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Highlights terms in the text , extracting the most relevant sections * and concatenating the chosen fragments with a separator (typically "..."). * The document text is analysed in chunks to record hit statistics * across the document. After accumulating stats, the fragments with the highest scores * are returned in order as "separator" delimited strings. * * @param text text to highlight terms in * @param maxNumFragments the maximum number of fragments. * @param separator the separator used to intersperse the document fragments (typically "...") * * @return highlighted text * @throws InvalidTokenOffsetsException thrown if any token's endOffset exceeds the provided text's length */	TokenNameCOMMENT_JAVADOC	 Highlights terms in the text , extracting the most relevant sections and concatenating the chosen fragments with a separator (typically "..."). The document text is analysed in chunks to record hit statistics across the document. After accumulating stats, the fragments with the highest scores are returned in order as "separator" delimited strings. * @param text text to highlight terms in @param maxNumFragments the maximum number of fragments. @param separator the separator used to intersperse the document fragments (typically "...") * @return highlighted text @throws InvalidTokenOffsetsException thrown if any token's endOffset exceeds the provided text's length 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getBestFragments	TokenNameIdentifier	 get Best Fragments
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
InvalidTokenOffsetsException	TokenNameIdentifier	 Invalid Token Offsets Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
sections	TokenNameIdentifier	 sections
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
getBestFragments	TokenNameIdentifier	 get Best Fragments
(	TokenNameLPAREN	
tokenStream	TokenNameIdentifier	 token Stream
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
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
sections	TokenNameIdentifier	 sections
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sections	TokenNameIdentifier	 sections
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMaxDocCharsToAnalyze	TokenNameIdentifier	 get Max Doc Chars To Analyze
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxDocCharsToAnalyze	TokenNameIdentifier	 max Doc Chars To Analyze
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxDocCharsToAnalyze	TokenNameIdentifier	 set Max Doc Chars To Analyze
(	TokenNameLPAREN	
int	TokenNameint	
maxDocCharsToAnalyze	TokenNameIdentifier	 max Doc Chars To Analyze
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxDocCharsToAnalyze	TokenNameIdentifier	 max Doc Chars To Analyze
=	TokenNameEQUAL	
maxDocCharsToAnalyze	TokenNameIdentifier	 max Doc Chars To Analyze
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Fragmenter	TokenNameIdentifier	 Fragmenter
getTextFragmenter	TokenNameIdentifier	 get Text Fragmenter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
textFragmenter	TokenNameIdentifier	 text Fragmenter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param fragmenter */	TokenNameCOMMENT_JAVADOC	 @param fragmenter 
public	TokenNamepublic	
void	TokenNamevoid	
setTextFragmenter	TokenNameIdentifier	 set Text Fragmenter
(	TokenNameLPAREN	
Fragmenter	TokenNameIdentifier	 Fragmenter
fragmenter	TokenNameIdentifier	 fragmenter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textFragmenter	TokenNameIdentifier	 text Fragmenter
=	TokenNameEQUAL	
fragmenter	TokenNameIdentifier	 fragmenter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Object used to score each text fragment */	TokenNameCOMMENT_JAVADOC	 @return Object used to score each text fragment 
public	TokenNamepublic	
Scorer	TokenNameIdentifier	 Scorer
getFragmentScorer	TokenNameIdentifier	 get Fragment Scorer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param scorer */	TokenNameCOMMENT_JAVADOC	 @param scorer 
public	TokenNamepublic	
void	TokenNamevoid	
setFragmentScorer	TokenNameIdentifier	 set Fragment Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fragmentScorer	TokenNameIdentifier	 fragment Scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Encoder	TokenNameIdentifier	 Encoder
getEncoder	TokenNameIdentifier	 get Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
encoder	TokenNameIdentifier	 encoder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEncoder	TokenNameIdentifier	 set Encoder
(	TokenNameLPAREN	
Encoder	TokenNameIdentifier	 Encoder
encoder	TokenNameIdentifier	 encoder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
encoder	TokenNameIdentifier	 encoder
=	TokenNameEQUAL	
encoder	TokenNameIdentifier	 encoder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
FragmentQueue	TokenNameIdentifier	 Fragment Queue
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
TextFragment	TokenNameIdentifier	 Text Fragment
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
FragmentQueue	TokenNameIdentifier	 Fragment Queue
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
TextFragment	TokenNameIdentifier	 Text Fragment
fragA	TokenNameIdentifier	 frag A
,	TokenNameCOMMA	
TextFragment	TokenNameIdentifier	 Text Fragment
fragB	TokenNameIdentifier	 frag B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fragA	TokenNameIdentifier	 frag A
.	TokenNameDOT	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
fragB	TokenNameIdentifier	 frag B
.	TokenNameDOT	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
fragA	TokenNameIdentifier	 frag A
.	TokenNameDOT	
fragNum	TokenNameIdentifier	 frag Num
>	TokenNameGREATER	
fragB	TokenNameIdentifier	 frag B
.	TokenNameDOT	
fragNum	TokenNameIdentifier	 frag Num
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
fragA	TokenNameIdentifier	 frag A
.	TokenNameDOT	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
fragB	TokenNameIdentifier	 frag B
.	TokenNameDOT	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
