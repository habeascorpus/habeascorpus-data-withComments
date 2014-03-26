package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * DateFilter JUnit tests. * * * @version $Revision: 1066722 $ */	TokenNameCOMMENT_JAVADOC	 DateFilter JUnit tests. * @version $Revision: 1066722 $ 
public	TokenNamepublic	
class	TokenNameclass	
TestDateFilter	TokenNameIdentifier	 Test Date Filter
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
void	TokenNamevoid	
testBefore	TokenNameIdentifier	 test Before
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// create an index 	TokenNameCOMMENT_LINE	create an index 
Directory	TokenNameIdentifier	 Directory
indexStore	TokenNameIdentifier	 index Store
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
indexStore	TokenNameIdentifier	 index Store
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add time that is in the past 	TokenNameCOMMENT_LINE	add time that is in the past 
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"datefield"	TokenNameStringLiteral	datefield
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
-	TokenNameMINUS	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
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
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"Today is a very sunny day in New York City"	TokenNameStringLiteral	Today is a very sunny day in New York City
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
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
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
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// filter that should preserve matches 	TokenNameCOMMENT_LINE	filter that should preserve matches 
// DateFilter df1 = DateFilter.Before("datefield", now); 	TokenNameCOMMENT_LINE	DateFilter df1 = DateFilter.Before("datefield", now); 
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
df1	TokenNameIdentifier	 df1
=	TokenNameEQUAL	
new	TokenNamenew	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
(	TokenNameLPAREN	
"datefield"	TokenNameStringLiteral	datefield
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
-	TokenNameMINUS	
2000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// filter that should discard matches 	TokenNameCOMMENT_LINE	filter that should discard matches 
// DateFilter df2 = DateFilter.Before("datefield", now - 999999); 	TokenNameCOMMENT_LINE	DateFilter df2 = DateFilter.Before("datefield", now - 999999); 
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
df2	TokenNameIdentifier	 df2
=	TokenNameEQUAL	
new	TokenNamenew	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
(	TokenNameLPAREN	
"datefield"	TokenNameStringLiteral	datefield
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
-	TokenNameMINUS	
2000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// search something that doesn't exist with DateFilter 	TokenNameCOMMENT_LINE	search something that doesn't exist with DateFilter 
Query	TokenNameIdentifier	 Query
query1	TokenNameIdentifier	 query1
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"NoMatchForThis"	TokenNameStringLiteral	NoMatchForThis
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// search for something that does exists 	TokenNameCOMMENT_LINE	search for something that does exists 
Query	TokenNameIdentifier	 Query
query2	TokenNameIdentifier	 query2
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"sunny"	TokenNameStringLiteral	sunny
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
// ensure that queries return expected results without DateFilter first 	TokenNameCOMMENT_LINE	ensure that queries return expected results without DateFilter first 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query1	TokenNameIdentifier	 query1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query2	TokenNameIdentifier	 query2
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// run queries with DateFilter 	TokenNameCOMMENT_LINE	run queries with DateFilter 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query1	TokenNameIdentifier	 query1
,	TokenNameCOMMA	
df1	TokenNameIdentifier	 df1
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query1	TokenNameIdentifier	 query1
,	TokenNameCOMMA	
df2	TokenNameIdentifier	 df2
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query2	TokenNameIdentifier	 query2
,	TokenNameCOMMA	
df1	TokenNameIdentifier	 df1
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query2	TokenNameIdentifier	 query2
,	TokenNameCOMMA	
df2	TokenNameIdentifier	 df2
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexStore	TokenNameIdentifier	 index Store
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
void	TokenNamevoid	
testAfter	TokenNameIdentifier	 test After
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// create an index 	TokenNameCOMMENT_LINE	create an index 
Directory	TokenNameIdentifier	 Directory
indexStore	TokenNameIdentifier	 index Store
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
indexStore	TokenNameIdentifier	 index Store
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add time that is in the future 	TokenNameCOMMENT_LINE	add time that is in the future 
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"datefield"	TokenNameStringLiteral	datefield
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
+	TokenNamePLUS	
888888	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
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
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"Today is a very sunny day in New York City"	TokenNameStringLiteral	Today is a very sunny day in New York City
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
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
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
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// filter that should preserve matches 	TokenNameCOMMENT_LINE	filter that should preserve matches 
// DateFilter df1 = DateFilter.After("datefield", now); 	TokenNameCOMMENT_LINE	DateFilter df1 = DateFilter.After("datefield", now); 
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
df1	TokenNameIdentifier	 df1
=	TokenNameEQUAL	
new	TokenNamenew	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
(	TokenNameLPAREN	
"datefield"	TokenNameStringLiteral	datefield
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
+	TokenNamePLUS	
999999	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// filter that should discard matches 	TokenNameCOMMENT_LINE	filter that should discard matches 
// DateFilter df2 = DateFilter.After("datefield", now + 999999); 	TokenNameCOMMENT_LINE	DateFilter df2 = DateFilter.After("datefield", now + 999999); 
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
df2	TokenNameIdentifier	 df2
=	TokenNameEQUAL	
new	TokenNamenew	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
(	TokenNameLPAREN	
"datefield"	TokenNameStringLiteral	datefield
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
+	TokenNamePLUS	
999999	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
timeToString	TokenNameIdentifier	 time To String
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
+	TokenNamePLUS	
999999999	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// search something that doesn't exist with DateFilter 	TokenNameCOMMENT_LINE	search something that doesn't exist with DateFilter 
Query	TokenNameIdentifier	 Query
query1	TokenNameIdentifier	 query1
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"NoMatchForThis"	TokenNameStringLiteral	NoMatchForThis
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// search for something that does exists 	TokenNameCOMMENT_LINE	search for something that does exists 
Query	TokenNameIdentifier	 Query
query2	TokenNameIdentifier	 query2
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"sunny"	TokenNameStringLiteral	sunny
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
// ensure that queries return expected results without DateFilter first 	TokenNameCOMMENT_LINE	ensure that queries return expected results without DateFilter first 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query1	TokenNameIdentifier	 query1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query2	TokenNameIdentifier	 query2
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// run queries with DateFilter 	TokenNameCOMMENT_LINE	run queries with DateFilter 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query1	TokenNameIdentifier	 query1
,	TokenNameCOMMA	
df1	TokenNameIdentifier	 df1
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query1	TokenNameIdentifier	 query1
,	TokenNameCOMMA	
df2	TokenNameIdentifier	 df2
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query2	TokenNameIdentifier	 query2
,	TokenNameCOMMA	
df1	TokenNameIdentifier	 df1
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query2	TokenNameIdentifier	 query2
,	TokenNameCOMMA	
df2	TokenNameIdentifier	 df2
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexStore	TokenNameIdentifier	 index Store
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
