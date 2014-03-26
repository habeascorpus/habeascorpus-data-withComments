package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Copyright 2005 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2005 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
DateTools	TokenNameIdentifier	 Date Tools
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
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
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
/** Unit test for sorting code. */	TokenNameCOMMENT_JAVADOC	 Unit test for sorting code. 
public	TokenNamepublic	
class	TokenNameclass	
TestCustomSearcherSort	TokenNameIdentifier	 Test Custom Searcher Sort
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// reduced from 20000 to 2000 to speed up test... 	TokenNameCOMMENT_LINE	reduced from 20000 to 2000 to speed up test... 
private	TokenNameprivate	
int	TokenNameint	
INDEX_SIZE	TokenNameIdentifier	 INDEX  SIZE
;	TokenNameSEMICOLON	
/** * Create index and query for test cases. */	TokenNameCOMMENT_JAVADOC	 Create index and query for test cases. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
INDEX_SIZE	TokenNameIdentifier	 INDEX  SIZE
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
2000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomGen	TokenNameIdentifier	 Random Gen
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
new	TokenNamenew	
RandomGen	TokenNameIdentifier	 Random Gen
(	TokenNameLPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
random	TokenNameIdentifier	 random
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
INDEX_SIZE	TokenNameIdentifier	 INDEX  SIZE
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// don't decrease; if to low the 	TokenNameCOMMENT_LINE	don't decrease; if to low the 
// problem doesn't show up 	TokenNameCOMMENT_LINE	problem doesn't show up 
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// some documents must not have an entry in the first 	TokenNameCOMMENT_LINE	some documents must not have an entry in the first 
// sort field 	TokenNameCOMMENT_LINE	sort field 
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"publicationDate_"	TokenNameStringLiteral	publicationDate_
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
getLuceneDate	TokenNameIdentifier	 get Lucene Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// some documents to match the query (see below) 	TokenNameCOMMENT_LINE	some documents to match the query (see below) 
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// every document has a defined 'mandant' field 	TokenNameCOMMENT_LINE	every document has a defined 'mandant' field 
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"mandant"	TokenNameStringLiteral	mandant
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"content"	TokenNameStringLiteral	content
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Run the test using two CustomSearcher instances. */	TokenNameCOMMENT_JAVADOC	 Run the test using two CustomSearcher instances. 
public	TokenNamepublic	
void	TokenNamevoid	
testFieldSortCustomSearcher	TokenNameIdentifier	 test Field Sort Custom Searcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// log("Run testFieldSortCustomSearcher"); 	TokenNameCOMMENT_LINE	log("Run testFieldSortCustomSearcher"); 
// define the sort criteria 	TokenNameCOMMENT_LINE	define the sort criteria 
Sort	TokenNameIdentifier	 Sort
custSort	TokenNameIdentifier	 cust Sort
=	TokenNameEQUAL	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
"publicationDate_"	TokenNameStringLiteral	publicationDate_
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
FIELD_SCORE	TokenNameIdentifier	 FIELD  SCORE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
new	TokenNamenew	
CustomSearcher	TokenNameIdentifier	 Custom Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// search and check hits 	TokenNameCOMMENT_LINE	search and check hits 
matchHits	TokenNameIdentifier	 match Hits
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
custSort	TokenNameIdentifier	 cust Sort
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Run the test using one CustomSearcher wrapped by a MultiSearcher. */	TokenNameCOMMENT_JAVADOC	 Run the test using one CustomSearcher wrapped by a MultiSearcher. 
public	TokenNamepublic	
void	TokenNamevoid	
testFieldSortSingleSearcher	TokenNameIdentifier	 test Field Sort Single Searcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// log("Run testFieldSortSingleSearcher"); 	TokenNameCOMMENT_LINE	log("Run testFieldSortSingleSearcher"); 
// define the sort criteria 	TokenNameCOMMENT_LINE	define the sort criteria 
Sort	TokenNameIdentifier	 Sort
custSort	TokenNameIdentifier	 cust Sort
=	TokenNameEQUAL	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
"publicationDate_"	TokenNameStringLiteral	publicationDate_
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
FIELD_SCORE	TokenNameIdentifier	 FIELD  SCORE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
new	TokenNamenew	
MultiSearcher	TokenNameIdentifier	 Multi Searcher
(	TokenNameLPAREN	
new	TokenNamenew	
Searcher	TokenNameIdentifier	 Searcher
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
CustomSearcher	TokenNameIdentifier	 Custom Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// search and check hits 	TokenNameCOMMENT_LINE	search and check hits 
matchHits	TokenNameIdentifier	 match Hits
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
custSort	TokenNameIdentifier	 cust Sort
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Run the test using two CustomSearcher instances. */	TokenNameCOMMENT_JAVADOC	 Run the test using two CustomSearcher instances. 
public	TokenNamepublic	
void	TokenNamevoid	
testFieldSortMultiCustomSearcher	TokenNameIdentifier	 test Field Sort Multi Custom Searcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// log("Run testFieldSortMultiCustomSearcher"); 	TokenNameCOMMENT_LINE	log("Run testFieldSortMultiCustomSearcher"); 
// define the sort criteria 	TokenNameCOMMENT_LINE	define the sort criteria 
Sort	TokenNameIdentifier	 Sort
custSort	TokenNameIdentifier	 cust Sort
=	TokenNameEQUAL	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
"publicationDate_"	TokenNameStringLiteral	publicationDate_
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
FIELD_SCORE	TokenNameIdentifier	 FIELD  SCORE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
new	TokenNamenew	
MultiSearcher	TokenNameIdentifier	 Multi Searcher
(	TokenNameLPAREN	
new	TokenNamenew	
Searchable	TokenNameIdentifier	 Searchable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
CustomSearcher	TokenNameIdentifier	 Custom Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CustomSearcher	TokenNameIdentifier	 Custom Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// search and check hits 	TokenNameCOMMENT_LINE	search and check hits 
matchHits	TokenNameIdentifier	 match Hits
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
custSort	TokenNameIdentifier	 cust Sort
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// make sure the documents returned by the search match the expected list 	TokenNameCOMMENT_LINE	make sure the documents returned by the search match the expected list 
private	TokenNameprivate	
void	TokenNamevoid	
matchHits	TokenNameIdentifier	 match Hits
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// make a query without sorting first 	TokenNameCOMMENT_LINE	make a query without sorting first 
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hitsByRank	TokenNameIdentifier	 hits By Rank
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
checkHits	TokenNameIdentifier	 check Hits
(	TokenNameLPAREN	
hitsByRank	TokenNameIdentifier	 hits By Rank
,	TokenNameCOMMA	
"Sort by rank: "	TokenNameStringLiteral	Sort by rank: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check for duplicates 	TokenNameCOMMENT_LINE	check for duplicates 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
resultMap	TokenNameIdentifier	 result Map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// store hits in TreeMap - TreeMap does not allow duplicates; existing 	TokenNameCOMMENT_LINE	store hits in TreeMap - TreeMap does not allow duplicates; existing 
// entries are silently overwritten 	TokenNameCOMMENT_LINE	entries are silently overwritten 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
hitid	TokenNameIdentifier	 hitid
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hitid	TokenNameIdentifier	 hitid
<	TokenNameLESS	
hitsByRank	TokenNameIdentifier	 hits By Rank
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
hitid	TokenNameIdentifier	 hitid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resultMap	TokenNameIdentifier	 result Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
hitsByRank	TokenNameIdentifier	 hits By Rank
[	TokenNameLBRACKET	
hitid	TokenNameIdentifier	 hitid
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// Key: Lucene 	TokenNameCOMMENT_LINE	Key: Lucene 
// Document ID 	TokenNameCOMMENT_LINE	Document ID 
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
hitid	TokenNameIdentifier	 hitid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Value: Hits-Objekt Index 	TokenNameCOMMENT_LINE	Value: Hits-Objekt Index 
}	TokenNameRBRACE	
// now make a query using the sort criteria 	TokenNameCOMMENT_LINE	now make a query using the sort criteria 
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
resultSort	TokenNameIdentifier	 result Sort
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
checkHits	TokenNameIdentifier	 check Hits
(	TokenNameLPAREN	
resultSort	TokenNameIdentifier	 result Sort
,	TokenNameCOMMA	
"Sort by custom criteria: "	TokenNameStringLiteral	Sort by custom criteria: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check for duplicates 	TokenNameCOMMENT_LINE	check for duplicates 
// besides the sorting both sets of hits must be identical 	TokenNameCOMMENT_LINE	besides the sorting both sets of hits must be identical 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
hitid	TokenNameIdentifier	 hitid
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hitid	TokenNameIdentifier	 hitid
<	TokenNameLESS	
resultSort	TokenNameIdentifier	 result Sort
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
hitid	TokenNameIdentifier	 hitid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
idHitDate	TokenNameIdentifier	 id Hit Date
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
resultSort	TokenNameIdentifier	 result Sort
[	TokenNameLBRACKET	
hitid	TokenNameIdentifier	 hitid
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// document ID 	TokenNameCOMMENT_LINE	document ID 
// from sorted 	TokenNameCOMMENT_LINE	from sorted 
// search 	TokenNameCOMMENT_LINE	search 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
resultMap	TokenNameIdentifier	 result Map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
idHitDate	TokenNameIdentifier	 id Hit Date
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"ID "	TokenNameStringLiteral	ID 
+	TokenNamePLUS	
idHitDate	TokenNameIdentifier	 id Hit Date
+	TokenNamePLUS	
" not found. Possibliy a duplicate."	TokenNameStringLiteral	 not found. Possibliy a duplicate.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
resultMap	TokenNameIdentifier	 result Map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
idHitDate	TokenNameIdentifier	 id Hit Date
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same ID must be in the 	TokenNameCOMMENT_LINE	same ID must be in the 
// Map from the rank-sorted 	TokenNameCOMMENT_LINE	Map from the rank-sorted 
// search 	TokenNameCOMMENT_LINE	search 
// every hit must appear once in both result sets --> remove it from the 	TokenNameCOMMENT_LINE	every hit must appear once in both result sets --> remove it from the 
// Map. 	TokenNameCOMMENT_LINE	Map. 
// At the end the Map must be empty! 	TokenNameCOMMENT_LINE	At the end the Map must be empty! 
resultMap	TokenNameIdentifier	 result Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
idHitDate	TokenNameIdentifier	 id Hit Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resultMap	TokenNameIdentifier	 result Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// log("All hits matched"); 	TokenNameCOMMENT_LINE	log("All hits matched"); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Couldn't match "	TokenNameStringLiteral	Couldn't match 
+	TokenNamePLUS	
resultMap	TokenNameIdentifier	 result Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" hits."	TokenNameStringLiteral	 hits.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
resultMap	TokenNameIdentifier	 result Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check the hits for duplicates. * * @param hits */	TokenNameCOMMENT_JAVADOC	 Check the hits for duplicates. * @param hits 
private	TokenNameprivate	
void	TokenNamevoid	
checkHits	TokenNameIdentifier	 check Hits
(	TokenNameLPAREN	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
idMap	TokenNameIdentifier	 id Map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
docnum	TokenNameIdentifier	 docnum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
docnum	TokenNameIdentifier	 docnum
<	TokenNameLESS	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
docnum	TokenNameIdentifier	 docnum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
luceneId	TokenNameIdentifier	 lucene Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
luceneId	TokenNameIdentifier	 lucene Id
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
docnum	TokenNameIdentifier	 docnum
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idMap	TokenNameIdentifier	 id Map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
luceneId	TokenNameIdentifier	 lucene Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Duplicate key for hit index = "	TokenNameStringLiteral	Duplicate key for hit index = 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
docnum	TokenNameIdentifier	 docnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", previous index = "	TokenNameStringLiteral	, previous index = 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
idMap	TokenNameIdentifier	 id Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
luceneId	TokenNameIdentifier	 lucene Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", Lucene ID = "	TokenNameStringLiteral	, Lucene ID = 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
luceneId	TokenNameIdentifier	 lucene Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
idMap	TokenNameIdentifier	 id Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
luceneId	TokenNameIdentifier	 lucene Id
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
docnum	TokenNameIdentifier	 docnum
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Simply write to console - choosen to be independant of log4j etc 	TokenNameCOMMENT_LINE	Simply write to console - choosen to be independant of log4j etc 
private	TokenNameprivate	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
class	TokenNameclass	
CustomSearcher	TokenNameIdentifier	 Custom Searcher
extends	TokenNameextends	
IndexSearcher	TokenNameIdentifier	 Index Searcher
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
switcher	TokenNameIdentifier	 switcher
;	TokenNameSEMICOLON	
/** * @param r */	TokenNameCOMMENT_JAVADOC	 @param r 
public	TokenNamepublic	
CustomSearcher	TokenNameIdentifier	 Custom Searcher
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
int	TokenNameint	
switcher	TokenNameIdentifier	 switcher
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
switcher	TokenNameIdentifier	 switcher
=	TokenNameEQUAL	
switcher	TokenNameIdentifier	 switcher
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * * @see * org.apache.lucene.search.Searchable#search(org.apache.lucene.search.Query * , org.apache.lucene.search.Filter, int, org.apache.lucene.search.Sort) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.search.Searchable#search(org.apache.lucene.search.Query , org.apache.lucene.search.Filter, int, org.apache.lucene.search.Sort) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
nDocs	TokenNameIdentifier	 n Docs
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"mandant"	TokenNameStringLiteral	mandant
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
switcher	TokenNameIdentifier	 switcher
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
nDocs	TokenNameIdentifier	 n Docs
,	TokenNameCOMMA	
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * * @see * org.apache.lucene.search.Searchable#search(org.apache.lucene.search.Query * , org.apache.lucene.search.Filter, int) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.search.Searchable#search(org.apache.lucene.search.Query , org.apache.lucene.search.Filter, int) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
nDocs	TokenNameIdentifier	 n Docs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"mandant"	TokenNameStringLiteral	mandant
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
switcher	TokenNameIdentifier	 switcher
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
nDocs	TokenNameIdentifier	 n Docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
RandomGen	TokenNameIdentifier	 Random Gen
{	TokenNameLBRACE	
RandomGen	TokenNameIdentifier	 Random Gen
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Calendar	TokenNameIdentifier	 Calendar
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
new	TokenNamenew	
GregorianCalendar	TokenNameIdentifier	 Gregorian Calendar
(	TokenNameLPAREN	
1980	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Just to generate some different Lucene Date strings 	TokenNameCOMMENT_LINE	Just to generate some different Lucene Date strings 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getLuceneDate	TokenNameIdentifier	 get Lucene Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
getTimeInMillis	TokenNameIdentifier	 get Time In Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
DAY	TokenNameIdentifier	 DAY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
