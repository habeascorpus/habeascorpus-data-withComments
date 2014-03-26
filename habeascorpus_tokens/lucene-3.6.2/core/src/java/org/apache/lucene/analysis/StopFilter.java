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
IOException	TokenNameIdentifier	 IO Exception
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
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
QueryParser	TokenNameIdentifier	 Query Parser
;	TokenNameSEMICOLON	
// for javadoc 	TokenNameCOMMENT_LINE	for javadoc 
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
/** * Removes stop words from a token stream. * * <a name="version"/> * <p>You must specify the required {@link Version} * compatibility when creating StopFilter: * <ul> * <li> As of 3.1, StopFilter correctly handles Unicode 4.0 * supplementary characters in stopwords and position * increments are preserved * </ul> */	TokenNameCOMMENT_JAVADOC	 Removes stop words from a token stream. * <a name="version"/> <p>You must specify the required {@link Version} compatibility when creating StopFilter: <ul> <li> As of 3.1, StopFilter correctly handles Unicode 4.0 supplementary characters in stopwords and position increments are preserved </ul> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
StopFilter	TokenNameIdentifier	 Stop Filter
extends	TokenNameextends	
FilteringTokenFilter	TokenNameIdentifier	 Filtering Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CharArraySet	TokenNameIdentifier	 Char Array Set
stopWords	TokenNameIdentifier	 stop Words
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
/** * Construct a token stream filtering the given input. * If <code>stopWords</code> is an instance of {@link CharArraySet} (true if * <code>makeStopSet()</code> was used to construct the set) it will be directly used * and <code>ignoreCase</code> will be ignored since <code>CharArraySet</code> * directly controls case sensitivity. * <p/> * If <code>stopWords</code> is not an instance of {@link CharArraySet}, * a new CharArraySet will be constructed and <code>ignoreCase</code> will be * used to specify the case sensitivity of that set. * * @param enablePositionIncrements true if token positions should record the removed stop words * @param input Input TokenStream * @param stopWords A Set of Strings or char[] or any other toString()-able set representing the stopwords * @param ignoreCase if true, all words are lower cased first * @deprecated Use {@link #StopFilter(Version, TokenStream, Set)} instead */	TokenNameCOMMENT_JAVADOC	 Construct a token stream filtering the given input. If <code>stopWords</code> is an instance of {@link CharArraySet} (true if <code>makeStopSet()</code> was used to construct the set) it will be directly used and <code>ignoreCase</code> will be ignored since <code>CharArraySet</code> directly controls case sensitivity. <p/> If <code>stopWords</code> is not an instance of {@link CharArraySet}, a new CharArraySet will be constructed and <code>ignoreCase</code> will be used to specify the case sensitivity of that set. * @param enablePositionIncrements true if token positions should record the removed stop words @param input Input TokenStream @param stopWords A Set of Strings or char[] or any other toString()-able set representing the stopwords @param ignoreCase if true, all words are lower cased first @deprecated Use {@link #StopFilter(Version, TokenStream, Set)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a token stream filtering the given input. If * <code>stopWords</code> is an instance of {@link CharArraySet} (true if * <code>makeStopSet()</code> was used to construct the set) it will be * directly used and <code>ignoreCase</code> will be ignored since * <code>CharArraySet</code> directly controls case sensitivity. * <p/> * If <code>stopWords</code> is not an instance of {@link CharArraySet}, a new * CharArraySet will be constructed and <code>ignoreCase</code> will be used * to specify the case sensitivity of that set. * * @param matchVersion * Lucene version to enable correct Unicode 4.0 behavior in the stop * set if Version > 3.0. See <a href="#version">above</a> for details. * @param input * Input TokenStream * @param stopWords * A Set of Strings or char[] or any other toString()-able set * representing the stopwords * @param ignoreCase * if true, all words are lower cased first * @deprecated Use {@link #StopFilter(Version, TokenStream, Set)} instead */	TokenNameCOMMENT_JAVADOC	 Construct a token stream filtering the given input. If <code>stopWords</code> is an instance of {@link CharArraySet} (true if <code>makeStopSet()</code> was used to construct the set) it will be directly used and <code>ignoreCase</code> will be ignored since <code>CharArraySet</code> directly controls case sensitivity. <p/> If <code>stopWords</code> is not an instance of {@link CharArraySet}, a new CharArraySet will be constructed and <code>ignoreCase</code> will be used to specify the case sensitivity of that set. * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the stop set if Version > 3.0. See <a href="#version">above</a> for details. @param input Input TokenStream @param stopWords A Set of Strings or char[] or any other toString()-able set representing the stopwords @param ignoreCase if true, all words are lower cased first @deprecated Use {@link #StopFilter(Version, TokenStream, Set)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
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
LUCENE_29	TokenNameIdentifier	 LUCENE 29
)	TokenNameRPAREN	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * convenience ctor to enable deprecated ctors to set posInc explicitly */	TokenNameCOMMENT_BLOCK	 convenience ctor to enable deprecated ctors to set posInc explicitly 
private	TokenNameprivate	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
boolean	TokenNameboolean	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
stopWords	TokenNameIdentifier	 stop Words
=	TokenNameEQUAL	
stopWords	TokenNameIdentifier	 stop Words
instanceof	TokenNameinstanceof	
CharArraySet	TokenNameIdentifier	 Char Array Set
?	TokenNameQUESTION	
(	TokenNameLPAREN	
CharArraySet	TokenNameIdentifier	 Char Array Set
)	TokenNameRPAREN	
stopWords	TokenNameIdentifier	 stop Words
:	TokenNameCOLON	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a filter which removes words from the input * TokenStream that are named in the Set. * * @param enablePositionIncrements true if token positions should record the removed stop words * @param in Input stream * @param stopWords A Set of Strings or char[] or any other toString()-able set representing the stopwords * @see #makeStopSet(Version, java.lang.String[]) * @deprecated use {@link #StopFilter(Version, TokenStream, Set)} instead */	TokenNameCOMMENT_JAVADOC	 Constructs a filter which removes words from the input TokenStream that are named in the Set. * @param enablePositionIncrements true if token positions should record the removed stop words @param in Input stream @param stopWords A Set of Strings or char[] or any other toString()-able set representing the stopwords @see #makeStopSet(Version, java.lang.String[]) @deprecated use {@link #StopFilter(Version, TokenStream, Set)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
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
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
enablePositionIncrements	TokenNameIdentifier	 enable Position Increments
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a filter which removes words from the input TokenStream that are * named in the Set. * * @param matchVersion * Lucene version to enable correct Unicode 4.0 behavior in the stop * set if Version > 3.0. See <a href="#version">above</a> for details. * @param in * Input stream * @param stopWords * A Set of Strings or char[] or any other toString()-able set * representing the stopwords * @see #makeStopSet(Version, java.lang.String[]) */	TokenNameCOMMENT_JAVADOC	 Constructs a filter which removes words from the input TokenStream that are named in the Set. * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the stop set if Version > 3.0. See <a href="#version">above</a> for details. @param in Input stream @param stopWords A Set of Strings or char[] or any other toString()-able set representing the stopwords @see #makeStopSet(Version, java.lang.String[]) 
public	TokenNamepublic	
StopFilter	TokenNameIdentifier	 Stop Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
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
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a Set from an array of stop words, * appropriate for passing into the StopFilter constructor. * This permits this stopWords construction to be cached once when * an Analyzer is constructed. * * @see #makeStopSet(Version, java.lang.String[], boolean) passing false to ignoreCase * @deprecated use {@link #makeStopSet(Version, String...)} instead */	TokenNameCOMMENT_JAVADOC	 Builds a Set from an array of stop words, appropriate for passing into the StopFilter constructor. This permits this stopWords construction to be cached once when an Analyzer is constructed. * @see #makeStopSet(Version, java.lang.String[], boolean) passing false to ignoreCase @deprecated use {@link #makeStopSet(Version, String...)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a Set from an array of stop words, * appropriate for passing into the StopFilter constructor. * This permits this stopWords construction to be cached once when * an Analyzer is constructed. * * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the returned set if Version > 3.0 * @param stopWords An array of stopwords * @see #makeStopSet(Version, java.lang.String[], boolean) passing false to ignoreCase */	TokenNameCOMMENT_JAVADOC	 Builds a Set from an array of stop words, appropriate for passing into the StopFilter constructor. This permits this stopWords construction to be cached once when an Analyzer is constructed. * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the returned set if Version > 3.0 @param stopWords An array of stopwords @see #makeStopSet(Version, java.lang.String[], boolean) passing false to ignoreCase 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a Set from an array of stop words, * appropriate for passing into the StopFilter constructor. * This permits this stopWords construction to be cached once when * an Analyzer is constructed. * @param stopWords A List of Strings or char[] or any other toString()-able list representing the stopwords * @return A Set ({@link CharArraySet}) containing the words * @see #makeStopSet(Version, java.lang.String[], boolean) passing false to ignoreCase * @deprecated use {@link #makeStopSet(Version, List)} instead */	TokenNameCOMMENT_JAVADOC	 Builds a Set from an array of stop words, appropriate for passing into the StopFilter constructor. This permits this stopWords construction to be cached once when an Analyzer is constructed. @param stopWords A List of Strings or char[] or any other toString()-able list representing the stopwords @return A Set ({@link CharArraySet}) containing the words @see #makeStopSet(Version, java.lang.String[], boolean) passing false to ignoreCase @deprecated use {@link #makeStopSet(Version, List)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds a Set from an array of stop words, * appropriate for passing into the StopFilter constructor. * This permits this stopWords construction to be cached once when * an Analyzer is constructed. * * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the returned set if Version > 3.0 * @param stopWords A List of Strings or char[] or any other toString()-able list representing the stopwords * @return A Set ({@link CharArraySet}) containing the words * @see #makeStopSet(Version, java.lang.String[], boolean) passing false to ignoreCase */	TokenNameCOMMENT_JAVADOC	 Builds a Set from an array of stop words, appropriate for passing into the StopFilter constructor. This permits this stopWords construction to be cached once when an Analyzer is constructed. * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the returned set if Version > 3.0 @param stopWords A List of Strings or char[] or any other toString()-able list representing the stopwords @return A Set ({@link CharArraySet}) containing the words @see #makeStopSet(Version, java.lang.String[], boolean) passing false to ignoreCase 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a stopword set from the given stopword array. * @param stopWords An array of stopwords * @param ignoreCase If true, all words are lower cased first. * @return a Set containing the words * @deprecated use {@link #makeStopSet(Version, String[], boolean)} instead; */	TokenNameCOMMENT_JAVADOC	 Creates a stopword set from the given stopword array. @param stopWords An array of stopwords @param ignoreCase If true, all words are lower cased first. @return a Set containing the words @deprecated use {@link #makeStopSet(Version, String[], boolean)} instead; 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a stopword set from the given stopword array. * * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the returned set if Version > 3.0 * @param stopWords An array of stopwords * @param ignoreCase If true, all words are lower cased first. * @return a Set containing the words */	TokenNameCOMMENT_JAVADOC	 Creates a stopword set from the given stopword array. * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the returned set if Version > 3.0 @param stopWords An array of stopwords @param ignoreCase If true, all words are lower cased first. @return a Set containing the words 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharArraySet	TokenNameIdentifier	 Char Array Set
stopSet	TokenNameIdentifier	 stop Set
=	TokenNameEQUAL	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stopSet	TokenNameIdentifier	 stop Set
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
stopSet	TokenNameIdentifier	 stop Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a stopword set from the given stopword list. * @param stopWords A List of Strings or char[] or any other toString()-able list representing the stopwords * @param ignoreCase if true, all words are lower cased first * @return A Set ({@link CharArraySet}) containing the words * @deprecated use {@link #makeStopSet(Version, List, boolean)} instead */	TokenNameCOMMENT_JAVADOC	 Creates a stopword set from the given stopword list. @param stopWords A List of Strings or char[] or any other toString()-able list representing the stopwords @param ignoreCase if true, all words are lower cased first @return A Set ({@link CharArraySet}) containing the words @deprecated use {@link #makeStopSet(Version, List, boolean)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a stopword set from the given stopword list. * @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the returned set if Version > 3.0 * @param stopWords A List of Strings or char[] or any other toString()-able list representing the stopwords * @param ignoreCase if true, all words are lower cased first * @return A Set ({@link CharArraySet}) containing the words */	TokenNameCOMMENT_JAVADOC	 Creates a stopword set from the given stopword list. @param matchVersion Lucene version to enable correct Unicode 4.0 behavior in the returned set if Version > 3.0 @param stopWords A List of Strings or char[] or any other toString()-able list representing the stopwords @param ignoreCase if true, all words are lower cased first @return A Set ({@link CharArraySet}) containing the words 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
makeStopSet	TokenNameIdentifier	 make Stop Set
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stopWords	TokenNameIdentifier	 stop Words
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharArraySet	TokenNameIdentifier	 Char Array Set
stopSet	TokenNameIdentifier	 stop Set
=	TokenNameEQUAL	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
stopWords	TokenNameIdentifier	 stop Words
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stopSet	TokenNameIdentifier	 stop Set
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
stopWords	TokenNameIdentifier	 stop Words
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
stopSet	TokenNameIdentifier	 stop Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next input Token whose term() is not a stop word. */	TokenNameCOMMENT_JAVADOC	 Returns the next input Token whose term() is not a stop word. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
stopWords	TokenNameIdentifier	 stop Words
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
/** * Returns version-dependent default for * enablePositionIncrements. Analyzers that embed * StopFilter use this method when creating the * StopFilter. Prior to 2.9, this returns false. On 2.9 * or later, it returns true. * @deprecated use {@link #StopFilter(Version, TokenStream, Set)} instead */	TokenNameCOMMENT_JAVADOC	 Returns version-dependent default for enablePositionIncrements. Analyzers that embed StopFilter use this method when creating the StopFilter. Prior to 2.9, this returns false. On 2.9 or later, it returns true. @deprecated use {@link #StopFilter(Version, TokenStream, Set)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
getEnablePositionIncrementsVersionDefault	TokenNameIdentifier	 get Enable Position Increments Version Default
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_29	TokenNameIdentifier	 LUCENE 29
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
