/** * Copyright 2004 The Apache Software Foundation. * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2004 The Apache Software Foundation. * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
similar	TokenNameIdentifier	 similar
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
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
BooleanClause	TokenNameIdentifier	 Boolean Clause
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
BooleanQuery	TokenNameIdentifier	 Boolean Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
IndexSearcher	TokenNameIdentifier	 Index Searcher
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Query	TokenNameIdentifier	 Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
TermQuery	TokenNameIdentifier	 Term Query
;	TokenNameSEMICOLON	
/** * Simple similarity measures. * * @see MoreLikeThis */	TokenNameCOMMENT_JAVADOC	 Simple similarity measures. * @see MoreLikeThis 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SimilarityQueries	TokenNameIdentifier	 Similarity Queries
{	TokenNameLBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
SimilarityQueries	TokenNameIdentifier	 Similarity Queries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Simple similarity query generators. * Takes every unique word and forms a boolean query where all words are optional. * After you get this you'll use to to query your {@link IndexSearcher} for similar docs. * The only caveat is the first hit returned <b>should be</b> your source document - you'll * need to then ignore that. * * <p> * So, if you have a code fragment like this: * <br> * <code> * Query q = formSimilaryQuery( "I use Lucene to search fast. Fast searchers are good", new StandardAnalyzer(), "contents", null); * </code> * * <p> * The query returned, in string form, will be <code>'(i use lucene to search fast searchers are good')</code>. * * <p> * The philosophy behind this method is "two documents are similar if they share lots of words". * Note that behind the scenes, Lucene's scoring algorithm will tend to give two documents a higher similarity score if the share more uncommon words. * * <P> * This method is fail-safe in that if a long 'body' is passed in and * {@link BooleanQuery#add BooleanQuery.add()} (used internally) * throws * {@link org.apache.lucene.search.BooleanQuery.TooManyClauses BooleanQuery.TooManyClauses}, the * query as it is will be returned. * * @param body the body of the document you want to find similar documents to * @param a the analyzer to use to parse the body * @param field the field you want to search on, probably something like "contents" or "body" * @param stop optional set of stop words to ignore * @return a query with all unique words in 'body' * @throws IOException this can't happen... */	TokenNameCOMMENT_JAVADOC	 Simple similarity query generators. Takes every unique word and forms a boolean query where all words are optional. After you get this you'll use to to query your {@link IndexSearcher} for similar docs. The only caveat is the first hit returned <b>should be</b> your source document - you'll need to then ignore that. * <p> So, if you have a code fragment like this: <br> <code> Query q = formSimilaryQuery( "I use Lucene to search fast. Fast searchers are good", new StandardAnalyzer(), "contents", null); </code> * <p> The query returned, in string form, will be <code>'(i use lucene to search fast searchers are good')</code>. * <p> The philosophy behind this method is "two documents are similar if they share lots of words". Note that behind the scenes, Lucene's scoring algorithm will tend to give two documents a higher similarity score if the share more uncommon words. * <P> This method is fail-safe in that if a long 'body' is passed in and {@link BooleanQuery#add BooleanQuery.add()} (used internally) throws {@link org.apache.lucene.search.BooleanQuery.TooManyClauses BooleanQuery.TooManyClauses}, the query as it is will be returned. * @param body the body of the document you want to find similar documents to @param a the analyzer to use to parse the body @param field the field you want to search on, probably something like "contents" or "body" @param stop optional set of stop words to ignore @return a query with all unique words in 'body' @throws IOException this can't happen... 
public	TokenNamepublic	
static	TokenNamestatic	
Query	TokenNameIdentifier	 Query
formSimilarQuery	TokenNameIdentifier	 form Similar Query
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
body	TokenNameIdentifier	 body
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
stop	TokenNameIdentifier	 stop
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
already	TokenNameIdentifier	 already
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ignore dups 	TokenNameCOMMENT_LINE	ignore dups 
while	TokenNamewhile	
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ignore opt stop words 	TokenNameCOMMENT_LINE	ignore opt stop words 
if	TokenNameif	
(	TokenNameLPAREN	
stop	TokenNameIdentifier	 stop
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
stop	TokenNameIdentifier	 stop
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// ignore dups 	TokenNameCOMMENT_LINE	ignore dups 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
already	TokenNameIdentifier	 already
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// add to query 	TokenNameCOMMENT_LINE	add to query 
TermQuery	TokenNameIdentifier	 Term Query
tq	TokenNameIdentifier	 tq
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
.	TokenNameDOT	
TooManyClauses	TokenNameIdentifier	 Too Many Clauses
too	TokenNameIdentifier	 too
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// fail-safe, just return what we have, not the end of the world 	TokenNameCOMMENT_LINE	fail-safe, just return what we have, not the end of the world 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
