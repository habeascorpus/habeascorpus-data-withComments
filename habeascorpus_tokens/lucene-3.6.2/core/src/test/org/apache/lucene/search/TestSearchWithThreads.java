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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicLong	TokenNameIdentifier	 Atomic Long
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
IndexSearcher	TokenNameIdentifier	 Index Searcher
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
TestSearchWithThreads	TokenNameIdentifier	 Test Search With Threads
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
NUM_SEARCH_THREADS	TokenNameIdentifier	 NUM  SEARCH  THREADS
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
RUN_TIME_MSEC	TokenNameIdentifier	 RUN  TIME  MSEC
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
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
final	TokenNamefinal	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: replace w/ the @nightly test data; make this 	TokenNameCOMMENT_LINE	TODO: replace w/ the @nightly test data; make this 
// into an optional @nightly stress test 	TokenNameCOMMENT_LINE	into an optional @nightly stress test 
final	TokenNamefinal	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
body	TokenNameIdentifier	 body
=	TokenNameEQUAL	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
docCount	TokenNameIdentifier	 doc Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
docCount	TokenNameIdentifier	 doc Count
<	TokenNameLESS	
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
;	TokenNameSEMICOLON	
docCount	TokenNameIdentifier	 doc Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
numTerms	TokenNameIdentifier	 num Terms
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
termCount	TokenNameIdentifier	 term Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
termCount	TokenNameIdentifier	 term Count
<	TokenNameLESS	
numTerms	TokenNameIdentifier	 num Terms
;	TokenNameSEMICOLON	
termCount	TokenNameIdentifier	 term Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"aaa"	TokenNameStringLiteral	aaa
:	TokenNameCOLON	
"bbb"	TokenNameStringLiteral	bbb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
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
final	TokenNamefinal	
long	TokenNamelong	
endTime	TokenNameIdentifier	 end Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"BUILD took "	TokenNameStringLiteral	BUILD took 
+	TokenNamePLUS	
(	TokenNameLPAREN	
endTime	TokenNameIdentifier	 end Time
-	TokenNameMINUS	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
failed	TokenNameIdentifier	 failed
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
netSearch	TokenNameIdentifier	 net Search
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
threads	TokenNameIdentifier	 threads
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
[	TokenNameLBRACKET	
NUM_SEARCH_THREADS	TokenNameIdentifier	 NUM  SEARCH  THREADS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
threadID	TokenNameIdentifier	 thread ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
threadID	TokenNameIdentifier	 thread ID
<	TokenNameLESS	
NUM_SEARCH_THREADS	TokenNameIdentifier	 NUM  SEARCH  THREADS
;	TokenNameSEMICOLON	
threadID	TokenNameIdentifier	 thread ID
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
threads	TokenNameIdentifier	 threads
[	TokenNameLBRACKET	
threadID	TokenNameIdentifier	 thread ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TotalHitCountCollector	TokenNameIdentifier	 Total Hit Count Collector
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
new	TokenNamenew	
TotalHitCountCollector	TokenNameIdentifier	 Total Hit Count Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
long	TokenNamelong	
totHits	TokenNameIdentifier	 tot Hits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
totSearch	TokenNameIdentifier	 tot Search
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
stopAt	TokenNameIdentifier	 stop At
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
RUN_TIME_MSEC	TokenNameIdentifier	 RUN  TIME  MSEC
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
stopAt	TokenNameIdentifier	 stop At
&&	TokenNameAND_AND	
!	TokenNameNOT	
failed	TokenNameIdentifier	 failed
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"aaa"	TokenNameStringLiteral	aaa
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totHits	TokenNameIdentifier	 tot Hits
+=	TokenNamePLUS_EQUAL	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
getTotalHits	TokenNameIdentifier	 get Total Hits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
"bbb"	TokenNameStringLiteral	bbb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totHits	TokenNameIdentifier	 tot Hits
+=	TokenNamePLUS_EQUAL	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
getTotalHits	TokenNameIdentifier	 get Total Hits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totSearch	TokenNameIdentifier	 tot Search
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
totSearch	TokenNameIdentifier	 tot Search
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
totHits	TokenNameIdentifier	 tot Hits
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
netSearch	TokenNameIdentifier	 net Search
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
totSearch	TokenNameIdentifier	 tot Search
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
failed	TokenNameIdentifier	 failed
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
threads	TokenNameIdentifier	 threads
[	TokenNameLBRACKET	
threadID	TokenNameIdentifier	 thread ID
]	TokenNameRBRACKET	
.	TokenNameDOT	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
threads	TokenNameIdentifier	 threads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
threads	TokenNameIdentifier	 threads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
NUM_SEARCH_THREADS	TokenNameIdentifier	 NUM  SEARCH  THREADS
+	TokenNamePLUS	
" threads did "	TokenNameStringLiteral	 threads did 
+	TokenNamePLUS	
netSearch	TokenNameIdentifier	 net Search
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" searches"	TokenNameStringLiteral	 searches
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
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
}	TokenNameRBRACE	
