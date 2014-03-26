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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
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
DocIdBitSet	TokenNameIdentifier	 Doc Id Bit Set
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BitSet	TokenNameIdentifier	 Bit Set
;	TokenNameSEMICOLON	
/** * FilteredQuery JUnit tests. * * <p>Created: Apr 21, 2004 1:21:46 PM * * * @since 1.4 */	TokenNameCOMMENT_JAVADOC	 FilteredQuery JUnit tests. * <p>Created: Apr 21, 2004 1:21:46 PM * @since 1.4 
public	TokenNamepublic	
class	TokenNameclass	
TestFilteredQuery	TokenNameIdentifier	 Test Filtered Query
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
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
directory	TokenNameIdentifier	 directory
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
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
newLogMergePolicy	TokenNameIdentifier	 new Log Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"one two three four five"	TokenNameStringLiteral	one two three four five
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
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"sorter"	TokenNameStringLiteral	sorter
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
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
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"one two three four"	TokenNameStringLiteral	one two three four
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
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"sorter"	TokenNameStringLiteral	sorter
,	TokenNameCOMMA	
"d"	TokenNameStringLiteral	d
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
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"one two three y"	TokenNameStringLiteral	one two three y
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
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"sorter"	TokenNameStringLiteral	sorter
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
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
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"one two x"	TokenNameStringLiteral	one two x
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
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"sorter"	TokenNameStringLiteral	sorter
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
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
// tests here require single segment (eg try seed 	TokenNameCOMMENT_LINE	tests here require single segment (eg try seed 
// 8239472272678419952L), because SingleDocTestFilter(x) 	TokenNameCOMMENT_LINE	8239472272678419952L), because SingleDocTestFilter(x) 
// blindly accepts that docID in any sub-segment 	TokenNameCOMMENT_LINE	blindly accepts that docID in any sub-segment 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
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
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"three"	TokenNameStringLiteral	three
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
newStaticFilterB	TokenNameIdentifier	 new Static Filter B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// must be static for serialization tests 	TokenNameCOMMENT_LINE	must be static for serialization tests 
private	TokenNameprivate	
static	TokenNamestatic	
Filter	TokenNameIdentifier	 Filter
newStaticFilterB	TokenNameIdentifier	 new Static Filter B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BitSet	TokenNameIdentifier	 Bit Set
bitset	TokenNameIdentifier	 bitset
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitset	TokenNameIdentifier	 bitset
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitset	TokenNameIdentifier	 bitset
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DocIdBitSet	TokenNameIdentifier	 Doc Id Bit Set
(	TokenNameLPAREN	
bitset	TokenNameIdentifier	 bitset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
directory	TokenNameIdentifier	 directory
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
public	TokenNamepublic	
void	TokenNamevoid	
testFilteredQuery	TokenNameIdentifier	 test Filtered Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Query	TokenNameIdentifier	 Query
filteredquery	TokenNameIdentifier	 filteredquery
=	TokenNameEQUAL	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
filteredquery	TokenNameIdentifier	 filteredquery
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
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
filteredquery	TokenNameIdentifier	 filteredquery
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
filteredquery	TokenNameIdentifier	 filteredquery
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
"sorter"	TokenNameStringLiteral	sorter
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filteredquery	TokenNameIdentifier	 filteredquery
=	TokenNameEQUAL	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"one"	TokenNameStringLiteral	one
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
filteredquery	TokenNameIdentifier	 filteredquery
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
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
filteredquery	TokenNameIdentifier	 filteredquery
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filteredquery	TokenNameIdentifier	 filteredquery
=	TokenNameEQUAL	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"x"	TokenNameStringLiteral	x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
filteredquery	TokenNameIdentifier	 filteredquery
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
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
filteredquery	TokenNameIdentifier	 filteredquery
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filteredquery	TokenNameIdentifier	 filteredquery
=	TokenNameEQUAL	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"y"	TokenNameStringLiteral	y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
filteredquery	TokenNameIdentifier	 filteredquery
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
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
filteredquery	TokenNameIdentifier	 filteredquery
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test boost 	TokenNameCOMMENT_LINE	test boost 
Filter	TokenNameIdentifier	 Filter
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
newStaticFilterA	TokenNameIdentifier	 new Static Filter A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
2.5f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq1	TokenNameIdentifier	 bq1
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermQuery	TokenNameIdentifier	 Term Query
tq	TokenNameIdentifier	 tq
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"one"	TokenNameStringLiteral	one
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tq	TokenNameIdentifier	 tq
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq1	TokenNameIdentifier	 bq1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq1	TokenNameIdentifier	 bq1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"five"	TokenNameStringLiteral	five
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq2	TokenNameIdentifier	 bq2
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tq	TokenNameIdentifier	 tq
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"one"	TokenNameStringLiteral	one
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filteredquery	TokenNameIdentifier	 filteredquery
=	TokenNameEQUAL	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filteredquery	TokenNameIdentifier	 filteredquery
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq2	TokenNameIdentifier	 bq2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
filteredquery	TokenNameIdentifier	 filteredquery
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq2	TokenNameIdentifier	 bq2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"five"	TokenNameStringLiteral	five
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertScoreEquals	TokenNameIdentifier	 assert Score Equals
(	TokenNameLPAREN	
bq1	TokenNameIdentifier	 bq1
,	TokenNameCOMMA	
bq2	TokenNameIdentifier	 bq2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
,	TokenNameCOMMA	
filteredquery	TokenNameIdentifier	 filteredquery
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
tq	TokenNameIdentifier	 tq
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the boost value of the underlying query shouldn't have changed 	TokenNameCOMMENT_LINE	the boost value of the underlying query shouldn't have changed 
}	TokenNameRBRACE	
// must be static for serialization tests 	TokenNameCOMMENT_LINE	must be static for serialization tests 
private	TokenNameprivate	
static	TokenNamestatic	
Filter	TokenNameIdentifier	 Filter
newStaticFilterA	TokenNameIdentifier	 new Static Filter A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BitSet	TokenNameIdentifier	 Bit Set
bitset	TokenNameIdentifier	 bitset
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitset	TokenNameIdentifier	 bitset
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DocIdBitSet	TokenNameIdentifier	 Doc Id Bit Set
(	TokenNameLPAREN	
bitset	TokenNameIdentifier	 bitset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether the scores of the two queries are the same. */	TokenNameCOMMENT_JAVADOC	 Tests whether the scores of the two queries are the same. 
public	TokenNamepublic	
void	TokenNamevoid	
assertScoreEquals	TokenNameIdentifier	 assert Score Equals
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits1	TokenNameIdentifier	 hits1
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits2	TokenNameIdentifier	 hits2
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
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
hits1	TokenNameIdentifier	 hits1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
hits2	TokenNameIdentifier	 hits2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
hits1	TokenNameIdentifier	 hits1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
hits1	TokenNameIdentifier	 hits1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
hits2	TokenNameIdentifier	 hits2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
0.0000001f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This tests FilteredQuery's rewrite correctness */	TokenNameCOMMENT_JAVADOC	 This tests FilteredQuery's rewrite correctness 
public	TokenNamepublic	
void	TokenNamevoid	
testRangeQuery	TokenNameIdentifier	 test Range Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
rq	TokenNameIdentifier	 rq
=	TokenNameEQUAL	
new	TokenNamenew	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
(	TokenNameLPAREN	
"sorter"	TokenNameStringLiteral	sorter
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"d"	TokenNameStringLiteral	d
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
filteredquery	TokenNameIdentifier	 filteredquery
=	TokenNameEQUAL	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
rq	TokenNameIdentifier	 rq
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
filteredquery	TokenNameIdentifier	 filteredquery
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
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
filteredquery	TokenNameIdentifier	 filteredquery
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBooleanMUST	TokenNameIdentifier	 test Boolean MUST
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
new	TokenNamenew	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SingleDocTestFilter	TokenNameIdentifier	 Single Doc Test Filter
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
new	TokenNamenew	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SingleDocTestFilter	TokenNameIdentifier	 Single Doc Test Filter
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
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
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBooleanSHOULD	TokenNameIdentifier	 test Boolean SHOULD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
new	TokenNamenew	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SingleDocTestFilter	TokenNameIdentifier	 Single Doc Test Filter
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
new	TokenNamenew	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SingleDocTestFilter	TokenNameIdentifier	 Single Doc Test Filter
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
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
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make sure BooleanQuery, which does out-of-order 	TokenNameCOMMENT_LINE	Make sure BooleanQuery, which does out-of-order 
// scoring, inside FilteredQuery, works 	TokenNameCOMMENT_LINE	scoring, inside FilteredQuery, works 
public	TokenNamepublic	
void	TokenNamevoid	
testBoolean2	TokenNameIdentifier	 test Boolean2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
new	TokenNamenew	
SingleDocTestFilter	TokenNameIdentifier	 Single Doc Test Filter
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"one"	TokenNameStringLiteral	one
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
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
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"two"	TokenNameStringLiteral	two
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
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
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testChainedFilters	TokenNameIdentifier	 test Chained Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
new	TokenNamenew	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
(	TokenNameLPAREN	
new	TokenNamenew	
QueryWrapperFilter	TokenNameIdentifier	 Query Wrapper Filter
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"three"	TokenNameStringLiteral	three
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
(	TokenNameLPAREN	
new	TokenNamenew	
QueryWrapperFilter	TokenNameIdentifier	 Query Wrapper Filter
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"four"	TokenNameStringLiteral	four
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// one more: 	TokenNameCOMMENT_LINE	one more: 
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
FilteredQuery	TokenNameIdentifier	 Filtered Query
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
new	TokenNamenew	
CachingWrapperFilter	TokenNameIdentifier	 Caching Wrapper Filter
(	TokenNameLPAREN	
new	TokenNamenew	
QueryWrapperFilter	TokenNameIdentifier	 Query Wrapper Filter
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"five"	TokenNameStringLiteral	five
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
