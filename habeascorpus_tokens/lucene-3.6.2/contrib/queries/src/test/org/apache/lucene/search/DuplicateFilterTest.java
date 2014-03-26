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
HashSet	TokenNameIdentifier	 Hash Set
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
TermDocs	TokenNameIdentifier	 Term Docs
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
public	TokenNamepublic	
class	TokenNameclass	
DuplicateFilterTest	TokenNameIdentifier	 Duplicate Filter Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_FIELD	TokenNameIdentifier	 KEY  FIELD
=	TokenNameEQUAL	
"url"	TokenNameStringLiteral	url
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
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
"text"	TokenNameStringLiteral	text
,	TokenNameCOMMA	
"lucene"	TokenNameStringLiteral	lucene
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
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
//Add series of docs with filterable fields : url, text and dates flags 	TokenNameCOMMENT_LINE	Add series of docs with filterable fields : url, text and dates flags 
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"http://lucene.apache.org"	TokenNameStringLiteral	http://lucene.apache.org
,	TokenNameCOMMA	
"lucene 1.4.3 available"	TokenNameStringLiteral	lucene 1.4.3 available
,	TokenNameCOMMA	
"20040101"	TokenNameStringLiteral	20040101
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"http://lucene.apache.org"	TokenNameStringLiteral	http://lucene.apache.org
,	TokenNameCOMMA	
"New release pending"	TokenNameStringLiteral	New release pending
,	TokenNameCOMMA	
"20040102"	TokenNameStringLiteral	20040102
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"http://lucene.apache.org"	TokenNameStringLiteral	http://lucene.apache.org
,	TokenNameCOMMA	
"Lucene 1.9 out now"	TokenNameStringLiteral	Lucene 1.9 out now
,	TokenNameCOMMA	
"20050101"	TokenNameStringLiteral	20050101
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"http://www.bar.com"	TokenNameStringLiteral	http://www.bar.com
,	TokenNameCOMMA	
"Local man bites dog"	TokenNameStringLiteral	Local man bites dog
,	TokenNameCOMMA	
"20040101"	TokenNameStringLiteral	20040101
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"http://www.bar.com"	TokenNameStringLiteral	http://www.bar.com
,	TokenNameCOMMA	
"Dog bites local man"	TokenNameStringLiteral	Dog bites local man
,	TokenNameCOMMA	
"20040102"	TokenNameStringLiteral	20040102
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"http://www.bar.com"	TokenNameStringLiteral	http://www.bar.com
,	TokenNameCOMMA	
"Dog uses Lucene"	TokenNameStringLiteral	Dog uses Lucene
,	TokenNameCOMMA	
"20050101"	TokenNameStringLiteral	20050101
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"http://lucene.apache.org"	TokenNameStringLiteral	http://lucene.apache.org
,	TokenNameCOMMA	
"Lucene 2.0 out"	TokenNameStringLiteral	Lucene 2.0 out
,	TokenNameCOMMA	
"20050101"	TokenNameStringLiteral	20050101
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"http://lucene.apache.org"	TokenNameStringLiteral	http://lucene.apache.org
,	TokenNameCOMMA	
"Oops. Lucene 2.1 out"	TokenNameStringLiteral	Oops. Lucene 2.1 out
,	TokenNameCOMMA	
"20050102"	TokenNameStringLiteral	20050102
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Until we fix LUCENE-2348, the index must 	TokenNameCOMMENT_LINE	Until we fix LUCENE-2348, the index must 
// have only 1 segment: 	TokenNameCOMMENT_LINE	have only 1 segment: 
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
searcher	TokenNameIdentifier	 searcher
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
private	TokenNameprivate	
void	TokenNamevoid	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
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
KEY_FIELD	TokenNameIdentifier	 KEY  FIELD
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
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
"text"	TokenNameStringLiteral	text
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
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
"date"	TokenNameStringLiteral	date
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultFilter	TokenNameIdentifier	 test Default Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
(	TokenNameLPAREN	
KEY_FIELD	TokenNameIdentifier	 KEY  FIELD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
tq	TokenNameIdentifier	 tq
,	TokenNameCOMMA	
df	TokenNameIdentifier	 df
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
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
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_FIELD	TokenNameIdentifier	 KEY  FIELD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"No duplicate urls should be returned"	TokenNameStringLiteral	No duplicate urls should be returned
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoFilter	TokenNameIdentifier	 test No Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
tq	TokenNameIdentifier	 tq
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Default searching should have found some matches"	TokenNameStringLiteral	Default searching should have found some matches
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
dupsFound	TokenNameIdentifier	 dups Found
=	TokenNameEQUAL	
false	TokenNamefalse	
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
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_FIELD	TokenNameIdentifier	 KEY  FIELD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dupsFound	TokenNameIdentifier	 dups Found
)	TokenNameRPAREN	
dupsFound	TokenNameIdentifier	 dups Found
=	TokenNameEQUAL	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Default searching should have found duplicate urls"	TokenNameStringLiteral	Default searching should have found duplicate urls
,	TokenNameCOMMA	
dupsFound	TokenNameIdentifier	 dups Found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFastFilter	TokenNameIdentifier	 test Fast Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
(	TokenNameLPAREN	
KEY_FIELD	TokenNameIdentifier	 KEY  FIELD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
setProcessingMode	TokenNameIdentifier	 set Processing Mode
(	TokenNameLPAREN	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
.	TokenNameDOT	
PM_FAST_INVALIDATION	TokenNameIdentifier	 PM  FAST  INVALIDATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
tq	TokenNameIdentifier	 tq
,	TokenNameCOMMA	
df	TokenNameIdentifier	 df
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Filtered searching should have found some matches"	TokenNameStringLiteral	Filtered searching should have found some matches
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
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
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_FIELD	TokenNameIdentifier	 KEY  FIELD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"No duplicate urls should be returned"	TokenNameStringLiteral	No duplicate urls should be returned
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Two urls found"	TokenNameStringLiteral	Two urls found
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testKeepsLastFilter	TokenNameIdentifier	 test Keeps Last Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
(	TokenNameLPAREN	
KEY_FIELD	TokenNameIdentifier	 KEY  FIELD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
setKeepMode	TokenNameIdentifier	 set Keep Mode
(	TokenNameLPAREN	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
.	TokenNameDOT	
KM_USE_LAST_OCCURRENCE	TokenNameIdentifier	 KM  USE  LAST  OCCURRENCE
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
tq	TokenNameIdentifier	 tq
,	TokenNameCOMMA	
df	TokenNameIdentifier	 df
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Filtered searching should have found some matches"	TokenNameStringLiteral	Filtered searching should have found some matches
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
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
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_FIELD	TokenNameIdentifier	 KEY  FIELD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermDocs	TokenNameIdentifier	 Term Docs
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
KEY_FIELD	TokenNameIdentifier	 KEY  FIELD
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Duplicate urls should return last doc"	TokenNameStringLiteral	Duplicate urls should return last doc
,	TokenNameCOMMA	
lastDoc	TokenNameIdentifier	 last Doc
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testKeepsFirstFilter	TokenNameIdentifier	 test Keeps First Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
new	TokenNamenew	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
(	TokenNameLPAREN	
KEY_FIELD	TokenNameIdentifier	 KEY  FIELD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
df	TokenNameIdentifier	 df
.	TokenNameDOT	
setKeepMode	TokenNameIdentifier	 set Keep Mode
(	TokenNameLPAREN	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
.	TokenNameDOT	
KM_USE_FIRST_OCCURRENCE	TokenNameIdentifier	 KM  USE  FIRST  OCCURRENCE
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
tq	TokenNameIdentifier	 tq
,	TokenNameCOMMA	
df	TokenNameIdentifier	 df
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Filtered searching should have found some matches"	TokenNameStringLiteral	Filtered searching should have found some matches
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
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
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KEY_FIELD	TokenNameIdentifier	 KEY  FIELD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermDocs	TokenNameIdentifier	 Term Docs
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
KEY_FIELD	TokenNameIdentifier	 KEY  FIELD
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Duplicate urls should return first doc"	TokenNameStringLiteral	Duplicate urls should return first doc
,	TokenNameCOMMA	
lastDoc	TokenNameIdentifier	 last Doc
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
