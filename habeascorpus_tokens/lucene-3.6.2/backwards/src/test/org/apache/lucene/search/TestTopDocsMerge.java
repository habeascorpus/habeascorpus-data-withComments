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
ArrayList	TokenNameIdentifier	 Array List
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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
NumericField	TokenNameIdentifier	 Numeric Field
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ReaderUtil	TokenNameIdentifier	 Reader Util
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
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestTopDocsMerge	TokenNameIdentifier	 Test Top Docs Merge
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ShardSearcher	TokenNameIdentifier	 Shard Searcher
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
IndexSearcher	TokenNameIdentifier	 Index Searcher
subSearcher	TokenNameIdentifier	 sub Searcher
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ShardSearcher	TokenNameIdentifier	 Shard Searcher
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
subReader	TokenNameIdentifier	 sub Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
subSearcher	TokenNameIdentifier	 sub Searcher
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
subReader	TokenNameIdentifier	 sub Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Collector	TokenNameIdentifier	 Collector
collector	TokenNameIdentifier	 collector
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
subSearcher	TokenNameIdentifier	 sub Searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
collector	TokenNameIdentifier	 collector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
int	TokenNameint	
topN	TokenNameIdentifier	 top N
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
subSearcher	TokenNameIdentifier	 sub Searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
topN	TokenNameIdentifier	 top N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"ShardSearcher("	TokenNameStringLiteral	ShardSearcher(
+	TokenNamePLUS	
subSearcher	TokenNameIdentifier	 sub Searcher
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSort	TokenNameIdentifier	 test Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//final int numDocs = atLeast(50); 	TokenNameCOMMENT_LINE	final int numDocs = atLeast(50); 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"d"	TokenNameStringLiteral	d
,	TokenNameCOMMA	
"e"	TokenNameStringLiteral	e
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: make index"	TokenNameStringLiteral	TEST: make index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// w.setDoRandomForceMerge(false); 	TokenNameCOMMENT_LINE	w.setDoRandomForceMerge(false); 
// w.w.getConfig().setMaxBufferedDocs(atLeast(100)); 	TokenNameCOMMENT_LINE	w.w.getConfig().setMaxBufferedDocs(atLeast(100)); 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
contentIDX	TokenNameIdentifier	 content IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
contentIDX	TokenNameIdentifier	 content IDX
<	TokenNameLESS	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
contentIDX	TokenNameIdentifier	 content IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numTokens	TokenNameIdentifier	 num Tokens
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
tokenIDX	TokenNameIdentifier	 token IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tokenIDX	TokenNameIdentifier	 token IDX
<	TokenNameLESS	
numTokens	TokenNameIdentifier	 num Tokens
;	TokenNameSEMICOLON	
tokenIDX	TokenNameIdentifier	 token IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
[	TokenNameLBRACKET	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
content	TokenNameIdentifier	 content
[	TokenNameLBRACKET	
contentIDX	TokenNameIdentifier	 content IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
docIDX	TokenNameIdentifier	 doc IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
docIDX	TokenNameIdentifier	 doc IDX
<	TokenNameLESS	
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
docIDX	TokenNameIdentifier	 doc IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
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
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
randomRealisticUnicodeString	TokenNameIdentifier	 random Realistic Unicode String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
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
"text"	TokenNameStringLiteral	text
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
[	TokenNameLBRACKET	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
new	TokenNamenew	
NumericField	TokenNameIdentifier	 Numeric Field
(	TokenNameLPAREN	
"float"	TokenNameStringLiteral	float
)	TokenNameRPAREN	
.	TokenNameDOT	
setFloatValue	TokenNameIdentifier	 set Float Value
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextFloat	TokenNameIdentifier	 next Float
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
intValue	TokenNameIdentifier	 int Value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
intValue	TokenNameIdentifier	 int Value
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
intValue	TokenNameIdentifier	 int Value
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
intValue	TokenNameIdentifier	 int Value
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
NumericField	TokenNameIdentifier	 Numeric Field
(	TokenNameLPAREN	
"int"	TokenNameStringLiteral	int
)	TokenNameRPAREN	
.	TokenNameDOT	
setIntValue	TokenNameIdentifier	 set Int Value
(	TokenNameLPAREN	
intValue	TokenNameIdentifier	 int Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" doc="	TokenNameStringLiteral	 doc=
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// NOTE: sometimes reader has just one segment, which is 	TokenNameCOMMENT_LINE	NOTE: sometimes reader has just one segment, which is 
// important to test 	TokenNameCOMMENT_LINE	important to test 
final	TokenNamefinal	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subReaders	TokenNameIdentifier	 sub Readers
=	TokenNameEQUAL	
new	TokenNamenew	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ShardSearcher	TokenNameIdentifier	 Shard Searcher
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subSearchers	TokenNameIdentifier	 sub Searchers
=	TokenNameEQUAL	
new	TokenNamenew	
ShardSearcher	TokenNameIdentifier	 Shard Searcher
[	TokenNameLBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
searcherIDX	TokenNameIdentifier	 searcher IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
searcherIDX	TokenNameIdentifier	 searcher IDX
<	TokenNameLESS	
subSearchers	TokenNameIdentifier	 sub Searchers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
searcherIDX	TokenNameIdentifier	 searcher IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subSearchers	TokenNameIdentifier	 sub Searchers
[	TokenNameLBRACKET	
searcherIDX	TokenNameIdentifier	 searcher IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
ShardSearcher	TokenNameIdentifier	 Shard Searcher
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
searcherIDX	TokenNameIdentifier	 searcher IDX
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SortField	TokenNameIdentifier	 Sort Field
>	TokenNameGREATER	
sortFields	TokenNameIdentifier	 sort Fields
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SortField	TokenNameIdentifier	 Sort Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
"int"	TokenNameStringLiteral	int
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
"int"	TokenNameStringLiteral	int
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
"float"	TokenNameStringLiteral	float
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
"float"	TokenNameStringLiteral	float
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
SCORE	TokenNameIdentifier	 SCORE
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
SCORE	TokenNameIdentifier	 SCORE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
DOC	TokenNameIdentifier	 DOC
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
DOC	TokenNameIdentifier	 DOC
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docStarts	TokenNameIdentifier	 doc Starts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
subSearchers	TokenNameIdentifier	 sub Searchers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
subIDX	TokenNameIdentifier	 sub IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
subIDX	TokenNameIdentifier	 sub IDX
<	TokenNameLESS	
docStarts	TokenNameIdentifier	 doc Starts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
subIDX	TokenNameIdentifier	 sub IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docStarts	TokenNameIdentifier	 doc Starts
[	TokenNameLBRACKET	
subIDX	TokenNameIdentifier	 sub IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
docBase	TokenNameIdentifier	 doc Base
+=	TokenNamePLUS_EQUAL	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
subIDX	TokenNameIdentifier	 sub IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"docStarts["	TokenNameStringLiteral	docStarts[
+	TokenNamePLUS	
subIDX	TokenNameIdentifier	 sub IDX
+	TokenNamePLUS	
"]="	TokenNameStringLiteral	]=
+	TokenNamePLUS	
docStarts	TokenNameIdentifier	 doc Starts
[	TokenNameLBRACKET	
subIDX	TokenNameIdentifier	 sub IDX
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
1000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: custom FieldComp... 	TokenNameCOMMENT_LINE	TODO: custom FieldComp... 
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"text"	TokenNameStringLiteral	text
,	TokenNameCOMMA	
tokens	TokenNameIdentifier	 tokens
[	TokenNameLBRACKET	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Sort by score 	TokenNameCOMMENT_LINE	Sort by score 
sort	TokenNameIdentifier	 sort
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
randomSortFields	TokenNameIdentifier	 random Sort Fields
=	TokenNameEQUAL	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
sortIDX	TokenNameIdentifier	 sort IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sortIDX	TokenNameIdentifier	 sort IDX
<	TokenNameLESS	
randomSortFields	TokenNameIdentifier	 random Sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
sortIDX	TokenNameIdentifier	 sort IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
randomSortFields	TokenNameIdentifier	 random Sort Fields
[	TokenNameLBRACKET	
sortIDX	TokenNameIdentifier	 sort IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sort	TokenNameIdentifier	 sort
=	TokenNameEQUAL	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
randomSortFields	TokenNameIdentifier	 random Sort Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numDocs	TokenNameIdentifier	 num Docs
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//final int numHits = 5; 	TokenNameCOMMENT_LINE	final int numHits = 5; 
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: search query="	TokenNameStringLiteral	TEST: search query=
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
+	TokenNamePLUS	
" sort="	TokenNameStringLiteral	 sort=
+	TokenNamePLUS	
sort	TokenNameIdentifier	 sort
+	TokenNamePLUS	
" numHits="	TokenNameStringLiteral	 numHits=
+	TokenNamePLUS	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// First search on whole index: 	TokenNameCOMMENT_LINE	First search on whole index: 
final	TokenNamefinal	
TopDocs	TokenNameIdentifier	 Top Docs
topHits	TokenNameIdentifier	 top Hits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sort	TokenNameIdentifier	 sort
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
topHits	TokenNameIdentifier	 top Hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
TopFieldCollector	TokenNameIdentifier	 Top Field Collector
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
TopFieldCollector	TokenNameIdentifier	 Top Field Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
sort	TokenNameIdentifier	 sort
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
topHits	TokenNameIdentifier	 top Hits
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" top search: "	TokenNameStringLiteral	 top search: 
+	TokenNamePLUS	
topHits	TokenNameIdentifier	 top Hits
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
+	TokenNamePLUS	
" totalHits; hits="	TokenNameStringLiteral	 totalHits; hits=
+	TokenNamePLUS	
(	TokenNameLPAREN	
topHits	TokenNameIdentifier	 top Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"null"	TokenNameStringLiteral	null
:	TokenNameCOLON	
topHits	TokenNameIdentifier	 top Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
topHits	TokenNameIdentifier	 top Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
hitIDX	TokenNameIdentifier	 hit IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hitIDX	TokenNameIdentifier	 hit IDX
<	TokenNameLESS	
topHits	TokenNameIdentifier	 top Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
hitIDX	TokenNameIdentifier	 hit IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
topHits	TokenNameIdentifier	 top Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
hitIDX	TokenNameIdentifier	 hit IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" doc="	TokenNameStringLiteral	 doc=
+	TokenNamePLUS	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
" score="	TokenNameStringLiteral	 score=
+	TokenNamePLUS	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ... then all shards: 	TokenNameCOMMENT_LINE	... then all shards: 
final	TokenNamefinal	
Weight	TokenNameIdentifier	 Weight
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
createNormalizedWeight	TokenNameIdentifier	 create Normalized Weight
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TopDocs	TokenNameIdentifier	 Top Docs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shardHits	TokenNameIdentifier	 shard Hits
=	TokenNameEQUAL	
new	TokenNamenew	
TopDocs	TokenNameIdentifier	 Top Docs
[	TokenNameLBRACKET	
subSearchers	TokenNameIdentifier	 sub Searchers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
shardIDX	TokenNameIdentifier	 shard IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
shardIDX	TokenNameIdentifier	 shard IDX
<	TokenNameLESS	
subSearchers	TokenNameIdentifier	 sub Searchers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
shardIDX	TokenNameIdentifier	 shard IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
TopDocs	TokenNameIdentifier	 Top Docs
subHits	TokenNameIdentifier	 sub Hits
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ShardSearcher	TokenNameIdentifier	 Shard Searcher
subSearcher	TokenNameIdentifier	 sub Searcher
=	TokenNameEQUAL	
subSearchers	TokenNameIdentifier	 sub Searchers
[	TokenNameLBRACKET	
shardIDX	TokenNameIdentifier	 shard IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sort	TokenNameIdentifier	 sort
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subHits	TokenNameIdentifier	 sub Hits
=	TokenNameEQUAL	
subSearcher	TokenNameIdentifier	 sub Searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
TopFieldCollector	TokenNameIdentifier	 Top Field Collector
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
TopFieldCollector	TokenNameIdentifier	 Top Field Collector
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
sort	TokenNameIdentifier	 sort
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subSearcher	TokenNameIdentifier	 sub Searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subHits	TokenNameIdentifier	 sub Hits
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
topDocs	TokenNameIdentifier	 top Docs
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rebaseDocIDs	TokenNameIdentifier	 rebase Doc I Ds
(	TokenNameLPAREN	
docStarts	TokenNameIdentifier	 doc Starts
[	TokenNameLBRACKET	
shardIDX	TokenNameIdentifier	 shard IDX
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
subHits	TokenNameIdentifier	 sub Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shardHits	TokenNameIdentifier	 shard Hits
[	TokenNameLBRACKET	
shardIDX	TokenNameIdentifier	 shard IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
subHits	TokenNameIdentifier	 sub Hits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" shard="	TokenNameStringLiteral	 shard=
+	TokenNamePLUS	
shardIDX	TokenNameIdentifier	 shard IDX
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
subHits	TokenNameIdentifier	 sub Hits
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
+	TokenNamePLUS	
" totalHits hits="	TokenNameStringLiteral	 totalHits hits=
+	TokenNamePLUS	
(	TokenNameLPAREN	
subHits	TokenNameIdentifier	 sub Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"null"	TokenNameStringLiteral	null
:	TokenNameCOLON	
subHits	TokenNameIdentifier	 sub Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subHits	TokenNameIdentifier	 sub Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ScoreDoc	TokenNameIdentifier	 Score Doc
sd	TokenNameIdentifier	 sd
:	TokenNameCOLON	
subHits	TokenNameIdentifier	 sub Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" doc="	TokenNameStringLiteral	 doc=
+	TokenNamePLUS	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
" score="	TokenNameStringLiteral	 score=
+	TokenNamePLUS	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Merge: 	TokenNameCOMMENT_LINE	Merge: 
final	TokenNamefinal	
TopDocs	TokenNameIdentifier	 Top Docs
mergedHits	TokenNameIdentifier	 merged Hits
=	TokenNameEQUAL	
TopDocs	TokenNameIdentifier	 Top Docs
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
sort	TokenNameIdentifier	 sort
,	TokenNameCOMMA	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
shardHits	TokenNameIdentifier	 shard Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" mergedHits: "	TokenNameStringLiteral	 mergedHits: 
+	TokenNamePLUS	
mergedHits	TokenNameIdentifier	 merged Hits
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
+	TokenNamePLUS	
" totalHits; hits="	TokenNameStringLiteral	 totalHits; hits=
+	TokenNamePLUS	
(	TokenNameLPAREN	
mergedHits	TokenNameIdentifier	 merged Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"null"	TokenNameStringLiteral	null
:	TokenNameCOLON	
mergedHits	TokenNameIdentifier	 merged Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mergedHits	TokenNameIdentifier	 merged Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
hitIDX	TokenNameIdentifier	 hit IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hitIDX	TokenNameIdentifier	 hit IDX
<	TokenNameLESS	
mergedHits	TokenNameIdentifier	 merged Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
hitIDX	TokenNameIdentifier	 hit IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
mergedHits	TokenNameIdentifier	 merged Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
hitIDX	TokenNameIdentifier	 hit IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" doc="	TokenNameStringLiteral	 doc=
+	TokenNamePLUS	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
" score="	TokenNameStringLiteral	 score=
+	TokenNamePLUS	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mergedHits	TokenNameIdentifier	 merged Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Make sure the returned shards are correct: 	TokenNameCOMMENT_LINE	Make sure the returned shards are correct: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
hitIDX	TokenNameIdentifier	 hit IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hitIDX	TokenNameIdentifier	 hit IDX
<	TokenNameLESS	
mergedHits	TokenNameIdentifier	 merged Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
hitIDX	TokenNameIdentifier	 hit IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
mergedHits	TokenNameIdentifier	 merged Hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
hitIDX	TokenNameIdentifier	 hit IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"doc="	TokenNameStringLiteral	doc=
+	TokenNamePLUS	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
" wrong shard"	TokenNameStringLiteral	 wrong shard
,	TokenNameCOMMA	
ReaderUtil	TokenNameIdentifier	 Reader Util
.	TokenNameDOT	
subIndex	TokenNameIdentifier	 sub Index
(	TokenNameLPAREN	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
docStarts	TokenNameIdentifier	 doc Starts
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
topHits	TokenNameIdentifier	 top Hits
,	TokenNameCOMMA	
mergedHits	TokenNameIdentifier	 merged Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
rebaseDocIDs	TokenNameIdentifier	 rebase Doc I Ds
(	TokenNameLPAREN	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
,	TokenNameCOMMA	
TopDocs	TokenNameIdentifier	 Top Docs
hits	TokenNameIdentifier	 hits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
docFieldLocs	TokenNameIdentifier	 doc Field Locs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
instanceof	TokenNameinstanceof	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
fieldHits	TokenNameIdentifier	 field Hits
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
)	TokenNameRPAREN	
hits	TokenNameIdentifier	 hits
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
fieldIDX	TokenNameIdentifier	 field IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fieldIDX	TokenNameIdentifier	 field IDX
<	TokenNameLESS	
fieldHits	TokenNameIdentifier	 field Hits
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
fieldIDX	TokenNameIdentifier	 field IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldHits	TokenNameIdentifier	 field Hits
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
fieldIDX	TokenNameIdentifier	 field IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
DOC	TokenNameIdentifier	 DOC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docFieldLocs	TokenNameIdentifier	 doc Field Locs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fieldIDX	TokenNameIdentifier	 field IDX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
hitIDX	TokenNameIdentifier	 hit IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hitIDX	TokenNameIdentifier	 hit IDX
<	TokenNameLESS	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
hitIDX	TokenNameIdentifier	 hit IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
hitIDX	TokenNameIdentifier	 hit IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
+=	TokenNamePLUS_EQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sd	TokenNameIdentifier	 sd
instanceof	TokenNameinstanceof	
FieldDoc	TokenNameIdentifier	 Field Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FieldDoc	TokenNameIdentifier	 Field Doc
fd	TokenNameIdentifier	 fd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldDoc	TokenNameIdentifier	 Field Doc
)	TokenNameRPAREN	
sd	TokenNameIdentifier	 sd
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
:	TokenNameCOLON	
docFieldLocs	TokenNameIdentifier	 doc Field Locs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fd	TokenNameIdentifier	 fd
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
fd	TokenNameIdentifier	 fd
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
