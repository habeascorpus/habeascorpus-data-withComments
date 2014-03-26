package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
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
TestNRTReaderWithThreads	TokenNameIdentifier	 Test NRT Reader With Threads
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
seq	TokenNameIdentifier	 seq
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testIndexing	TokenNameIdentifier	 test Indexing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
mainDir	TokenNameIdentifier	 main Dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
mainDir	TokenNameIdentifier	 main Dir
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
setMaxBufferedDocs	TokenNameIdentifier	 set Max Buffered Docs
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
newLogMergePolicy	TokenNameIdentifier	 new Log Merge Policy
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
setInfoStream	TokenNameIdentifier	 set Info Stream
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
?	TokenNameQUESTION	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
:	TokenNameCOLON	
null	TokenNamenull	
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
// start pooling readers 	TokenNameCOMMENT_LINE	start pooling readers 
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RunThread	TokenNameIdentifier	 Run Thread
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
indexThreads	TokenNameIdentifier	 index Threads
=	TokenNameEQUAL	
new	TokenNamenew	
RunThread	TokenNameIdentifier	 Run Thread
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
indexThreads	TokenNameIdentifier	 index Threads
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexThreads	TokenNameIdentifier	 index Threads
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
RunThread	TokenNameIdentifier	 Run Thread
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
%	TokenNameREMAINDER	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexThreads	TokenNameIdentifier	 index Threads
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"Thread "	TokenNameStringLiteral	Thread 
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexThreads	TokenNameIdentifier	 index Threads
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
duration	TokenNameIdentifier	 duration
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
<	TokenNameLESS	
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
addCount	TokenNameIdentifier	 add Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
indexThreads	TokenNameIdentifier	 index Threads
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexThreads	TokenNameIdentifier	 index Threads
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
run	TokenNameIdentifier	 run
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Exception thrown: "	TokenNameStringLiteral	Exception thrown: 
+	TokenNamePLUS	
indexThreads	TokenNameIdentifier	 index Threads
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
,	TokenNameCOMMA	
indexThreads	TokenNameIdentifier	 index Threads
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCount	TokenNameIdentifier	 add Count
+=	TokenNamePLUS_EQUAL	
indexThreads	TokenNameIdentifier	 index Threads
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
addCount	TokenNameIdentifier	 add Count
;	TokenNameSEMICOLON	
delCount	TokenNameIdentifier	 del Count
+=	TokenNamePLUS_EQUAL	
indexThreads	TokenNameIdentifier	 index Threads
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
delCount	TokenNameIdentifier	 del Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
indexThreads	TokenNameIdentifier	 index Threads
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexThreads	TokenNameIdentifier	 index Threads
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
indexThreads	TokenNameIdentifier	 index Threads
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Exception thrown: "	TokenNameStringLiteral	Exception thrown: 
+	TokenNamePLUS	
indexThreads	TokenNameIdentifier	 index Threads
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
,	TokenNameCOMMA	
indexThreads	TokenNameIdentifier	 index Threads
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println("addCount:"+addCount); 	TokenNameCOMMENT_LINE	System.out.println("addCount:"+addCount); 
//System.out.println("delCount:"+delCount); 	TokenNameCOMMENT_LINE	System.out.println("delCount:"+delCount); 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mainDir	TokenNameIdentifier	 main Dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
class	TokenNameclass	
RunThread	TokenNameIdentifier	 Run Thread
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
run	TokenNameIdentifier	 run
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
volatile	TokenNamevolatile	
Throwable	TokenNameIdentifier	 Throwable
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
int	TokenNameint	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
addCount	TokenNameIdentifier	 add Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Random	TokenNameIdentifier	 Random
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RunThread	TokenNameIdentifier	 Run Thread
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
while	TokenNamewhile	
(	TokenNameLPAREN	
run	TokenNameIdentifier	 run
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//int n = random.nextInt(2); 	TokenNameCOMMENT_LINE	int n = random.nextInt(2); 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
seq	TokenNameIdentifier	 seq
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
createDocument	TokenNameIdentifier	 create Document
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
"index1"	TokenNameStringLiteral	index1
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCount	TokenNameIdentifier	 add Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we may or may not delete because the term may not exist, 	TokenNameCOMMENT_LINE	we may or may not delete because the term may not exist, 
// however we're opening and closing the reader rapidly 	TokenNameCOMMENT_LINE	however we're opening and closing the reader rapidly 
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
seq	TokenNameIdentifier	 seq
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
TestIndexWriterReader	TokenNameIdentifier	 Test Index Writer Reader
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
deleteDocuments	TokenNameIdentifier	 delete Documents
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delCount	TokenNameIdentifier	 del Count
+=	TokenNamePLUS_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
run	TokenNameIdentifier	 run
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
