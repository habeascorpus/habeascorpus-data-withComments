package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
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
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
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
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
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
TestSearchForDuplicates	TokenNameIdentifier	 Test Search For Duplicates
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PRIORITY_FIELD	TokenNameIdentifier	 PRIORITY  FIELD
=	TokenNameEQUAL	
"priority"	TokenNameStringLiteral	priority
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ID_FIELD	TokenNameIdentifier	 ID  FIELD
=	TokenNameEQUAL	
"id"	TokenNameStringLiteral	id
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HIGH_PRIORITY	TokenNameIdentifier	 HIGH  PRIORITY
=	TokenNameEQUAL	
"high"	TokenNameStringLiteral	high
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MED_PRIORITY	TokenNameIdentifier	 MED  PRIORITY
=	TokenNameEQUAL	
"medium"	TokenNameStringLiteral	medium
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOW_PRIORITY	TokenNameIdentifier	 LOW  PRIORITY
=	TokenNameEQUAL	
"low"	TokenNameStringLiteral	low
;	TokenNameSEMICOLON	
/** This test compares search results when using and not using compound * files. * * TODO: There is rudimentary search result validation as well, but it is * simply based on asserting the output observed in the old test case, * without really knowing if the output is correct. Someone needs to * validate this output and make any changes to the checkHits method. */	TokenNameCOMMENT_JAVADOC	 This test compares search results when using and not using compound files. * TODO: There is rudimentary search result validation as well, but it is simply based on asserting the output observed in the old test case, without really knowing if the output is correct. Someone needs to validate this output and make any changes to the checkHits method. 
public	TokenNamepublic	
void	TokenNamevoid	
testRun	TokenNameIdentifier	 test Run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
MAX_DOCS	TokenNameIdentifier	 MAX  DOCS
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
225	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
MAX_DOCS	TokenNameIdentifier	 MAX  DOCS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
multiFileOutput	TokenNameIdentifier	 multi File Output
=	TokenNameEQUAL	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(multiFileOutput); 	TokenNameCOMMENT_LINE	System.out.println(multiFileOutput); 
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
pw	TokenNameIdentifier	 pw
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
MAX_DOCS	TokenNameIdentifier	 MAX  DOCS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
singleFileOutput	TokenNameIdentifier	 single File Output
=	TokenNameEQUAL	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
multiFileOutput	TokenNameIdentifier	 multi File Output
,	TokenNameCOMMA	
singleFileOutput	TokenNameIdentifier	 single File Output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useCompoundFiles	TokenNameIdentifier	 use Compound Files
,	TokenNameCOMMA	
int	TokenNameint	
MAX_DOCS	TokenNameIdentifier	 MAX  DOCS
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
MergePolicy	TokenNameIdentifier	 Merge Policy
mp	TokenNameIdentifier	 mp
=	TokenNameEQUAL	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
getMergePolicy	TokenNameIdentifier	 get Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mp	TokenNameIdentifier	 mp
instanceof	TokenNameinstanceof	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
)	TokenNameRPAREN	
mp	TokenNameIdentifier	 mp
)	TokenNameRPAREN	
.	TokenNameDOT	
setUseCompoundFile	TokenNameIdentifier	 set Use Compound File
(	TokenNameLPAREN	
useCompoundFiles	TokenNameIdentifier	 use Compound Files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
conf	TokenNameIdentifier	 conf
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
"TEST: now build index"	TokenNameStringLiteral	TEST: now build index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
setInfoStream	TokenNameIdentifier	 set Info Stream
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
MAX_DOCS	TokenNameIdentifier	 MAX  DOCS
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
PRIORITY_FIELD	TokenNameIdentifier	 PRIORITY  FIELD
,	TokenNameCOMMA	
HIGH_PRIORITY	TokenNameIdentifier	 HIGH  PRIORITY
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
d	TokenNameIdentifier	 d
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
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
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// try a search without OR 	TokenNameCOMMENT_LINE	try a search without OR 
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryParser	TokenNameIdentifier	 Query Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
QueryParser	TokenNameIdentifier	 Query Parser
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
PRIORITY_FIELD	TokenNameIdentifier	 PRIORITY  FIELD
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
HIGH_PRIORITY	TokenNameIdentifier	 HIGH  PRIORITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Query: "	TokenNameStringLiteral	Query: 
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
PRIORITY_FIELD	TokenNameIdentifier	 PRIORITY  FIELD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
=	TokenNameEQUAL	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
FIELD_SCORE	TokenNameIdentifier	 FIELD  SCORE
,	TokenNameCOMMA	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
,	TokenNameCOMMA	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
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
null	TokenNamenull	
,	TokenNameCOMMA	
MAX_DOCS	TokenNameIdentifier	 MAX  DOCS
,	TokenNameCOMMA	
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkHits	TokenNameIdentifier	 check Hits
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
,	TokenNameCOMMA	
MAX_DOCS	TokenNameIdentifier	 MAX  DOCS
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// try a new search with OR 	TokenNameCOMMENT_LINE	try a new search with OR 
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
QueryParser	TokenNameIdentifier	 Query Parser
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
PRIORITY_FIELD	TokenNameIdentifier	 PRIORITY  FIELD
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
HIGH_PRIORITY	TokenNameIdentifier	 HIGH  PRIORITY
+	TokenNamePLUS	
" OR "	TokenNameStringLiteral	 OR 
+	TokenNamePLUS	
MED_PRIORITY	TokenNameIdentifier	 MED  PRIORITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Query: "	TokenNameStringLiteral	Query: 
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
PRIORITY_FIELD	TokenNameIdentifier	 PRIORITY  FIELD
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
null	TokenNamenull	
,	TokenNameCOMMA	
MAX_DOCS	TokenNameIdentifier	 MAX  DOCS
,	TokenNameCOMMA	
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkHits	TokenNameIdentifier	 check Hits
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
,	TokenNameCOMMA	
MAX_DOCS	TokenNameIdentifier	 MAX  DOCS
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
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
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
printHits	TokenNameIdentifier	 print Hits
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
,	TokenNameCOMMA	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
" total results "	TokenNameStringLiteral	 total results 
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
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
94	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
105	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkHits	TokenNameIdentifier	 check Hits
(	TokenNameLPAREN	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
,	TokenNameCOMMA	
int	TokenNameint	
expectedCount	TokenNameIdentifier	 expected Count
,	TokenNameCOMMA	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"total results"	TokenNameStringLiteral	total results
,	TokenNameCOMMA	
expectedCount	TokenNameIdentifier	 expected Count
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
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
hits	TokenNameIdentifier	 hits
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
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
94	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
105	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"check "	TokenNameStringLiteral	check 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
