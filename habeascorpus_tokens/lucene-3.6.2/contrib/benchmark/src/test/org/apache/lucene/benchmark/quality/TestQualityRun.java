package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
quality	TokenNameIdentifier	 quality
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
BenchmarkTestCase	TokenNameIdentifier	 Benchmark Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
trec	TokenNameIdentifier	 trec
.	TokenNameDOT	
TrecJudge	TokenNameIdentifier	 Trec Judge
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
trec	TokenNameIdentifier	 trec
.	TokenNameDOT	
TrecTopicsReader	TokenNameIdentifier	 Trec Topics Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
SimpleQQParser	TokenNameIdentifier	 Simple QQ Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
SubmissionReport	TokenNameIdentifier	 Submission Report
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
/** * Test that quality run does its job. * <p> * NOTE: if the default scoring or StandardAnalyzer is changed, then * this test will not work correctly, as it does not dynamically * generate its test trec topics/qrels! */	TokenNameCOMMENT_JAVADOC	 Test that quality run does its job. <p> NOTE: if the default scoring or StandardAnalyzer is changed, then this test will not work correctly, as it does not dynamically generate its test trec topics/qrels! 
public	TokenNamepublic	
class	TokenNameclass	
TestQualityRun	TokenNameIdentifier	 Test Quality Run
extends	TokenNameextends	
BenchmarkTestCase	TokenNameIdentifier	 Benchmark Test Case
{	TokenNameLBRACE	
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
copyToWorkDir	TokenNameIdentifier	 copy To Work Dir
(	TokenNameLPAREN	
"reuters.578.lines.txt.bz2"	TokenNameStringLiteral	reuters.578.lines.txt.bz2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTrecQuality	TokenNameIdentifier	 test Trec Quality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// first create the partial reuters index 	TokenNameCOMMENT_LINE	first create the partial reuters index 
createReutersIndex	TokenNameIdentifier	 create Reuters Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxResults	TokenNameIdentifier	 max Results
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
docNameField	TokenNameIdentifier	 doc Name Field
=	TokenNameEQUAL	
"doctitle"	TokenNameStringLiteral	doctitle
;	TokenNameSEMICOLON	
// orig docID is in the linedoc format title 	TokenNameCOMMENT_LINE	orig docID is in the linedoc format title 
PrintWriter	TokenNameIdentifier	 Print Writer
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
VERBOSE	TokenNameIdentifier	 VERBOSE
?	TokenNameQUESTION	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// prepare topics 	TokenNameCOMMENT_LINE	prepare topics 
InputStream	TokenNameIdentifier	 Input Stream
topics	TokenNameIdentifier	 topics
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"trecTopics.txt"	TokenNameStringLiteral	trecTopics.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TrecTopicsReader	TokenNameIdentifier	 Trec Topics Reader
qReader	TokenNameIdentifier	 q Reader
=	TokenNameEQUAL	
new	TokenNamenew	
TrecTopicsReader	TokenNameIdentifier	 Trec Topics Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QualityQuery	TokenNameIdentifier	 Quality Query
qqs	TokenNameIdentifier	 qqs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
qReader	TokenNameIdentifier	 q Reader
.	TokenNameDOT	
readQueries	TokenNameIdentifier	 read Queries
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
topics	TokenNameIdentifier	 topics
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// prepare judge 	TokenNameCOMMENT_LINE	prepare judge 
InputStream	TokenNameIdentifier	 Input Stream
qrels	TokenNameIdentifier	 qrels
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"trecQRels.txt"	TokenNameStringLiteral	trecQRels.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Judge	TokenNameIdentifier	 Judge
judge	TokenNameIdentifier	 judge
=	TokenNameEQUAL	
new	TokenNamenew	
TrecJudge	TokenNameIdentifier	 Trec Judge
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
qrels	TokenNameIdentifier	 qrels
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// validate topics & judgments match each other 	TokenNameCOMMENT_LINE	validate topics & judgments match each other 
judge	TokenNameIdentifier	 judge
.	TokenNameDOT	
validateData	TokenNameIdentifier	 validate Data
(	TokenNameLPAREN	
qqs	TokenNameIdentifier	 qqs
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newFSDirectory	TokenNameIdentifier	 new FS Directory
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
getWorkDir	TokenNameIdentifier	 get Work Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"index"	TokenNameStringLiteral	index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QualityQueryParser	TokenNameIdentifier	 Quality Query Parser
qqParser	TokenNameIdentifier	 qq Parser
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleQQParser	TokenNameIdentifier	 Simple QQ Parser
(	TokenNameLPAREN	
"title"	TokenNameStringLiteral	title
,	TokenNameCOMMA	
"body"	TokenNameStringLiteral	body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QualityBenchmark	TokenNameIdentifier	 Quality Benchmark
qrun	TokenNameIdentifier	 qrun
=	TokenNameEQUAL	
new	TokenNamenew	
QualityBenchmark	TokenNameIdentifier	 Quality Benchmark
(	TokenNameLPAREN	
qqs	TokenNameIdentifier	 qqs
,	TokenNameCOMMA	
qqParser	TokenNameIdentifier	 qq Parser
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
docNameField	TokenNameIdentifier	 doc Name Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SubmissionReport	TokenNameIdentifier	 Submission Report
submitLog	TokenNameIdentifier	 submit Log
=	TokenNameEQUAL	
VERBOSE	TokenNameIdentifier	 VERBOSE
?	TokenNameQUESTION	
new	TokenNamenew	
SubmissionReport	TokenNameIdentifier	 Submission Report
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"TestRun"	TokenNameStringLiteral	TestRun
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
qrun	TokenNameIdentifier	 qrun
.	TokenNameDOT	
setMaxResults	TokenNameIdentifier	 set Max Results
(	TokenNameLPAREN	
maxResults	TokenNameIdentifier	 max Results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QualityStats	TokenNameIdentifier	 Quality Stats
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
qrun	TokenNameIdentifier	 qrun
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
judge	TokenNameIdentifier	 judge
,	TokenNameCOMMA	
submitLog	TokenNameIdentifier	 submit Log
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// --------- verify by the way judgments were altered for this test: 	TokenNameCOMMENT_LINE	--------- verify by the way judgments were altered for this test: 
// for some queries, depending on m = qnum % 8 	TokenNameCOMMENT_LINE	for some queries, depending on m = qnum % 8 
// m==0: avg_precision and recall are hurt, by marking fake docs as relevant 	TokenNameCOMMENT_LINE	m==0: avg_precision and recall are hurt, by marking fake docs as relevant 
// m==1: precision_at_n and avg_precision are hurt, by unmarking relevant docs 	TokenNameCOMMENT_LINE	m==1: precision_at_n and avg_precision are hurt, by unmarking relevant docs 
// m==2: all precision, precision_at_n and recall are hurt. 	TokenNameCOMMENT_LINE	m==2: all precision, precision_at_n and recall are hurt. 
// m>=3: these queries remain perfect 	TokenNameCOMMENT_LINE	m>=3: these queries remain perfect 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QualityStats	TokenNameIdentifier	 Quality Stats
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"avg-p should be hurt: "	TokenNameStringLiteral	avg-p should be hurt: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getAvp	TokenNameIdentifier	 get Avp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
>	TokenNameGREATER	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getAvp	TokenNameIdentifier	 get Avp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"recall should be hurt: "	TokenNameStringLiteral	recall should be hurt: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getRecall	TokenNameIdentifier	 get Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
>	TokenNameGREATER	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getRecall	TokenNameIdentifier	 get Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
QualityStats	TokenNameIdentifier	 Quality Stats
.	TokenNameDOT	
MAX_POINTS	TokenNameIdentifier	 MAX  POINTS
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"p_at_"	TokenNameStringLiteral	p_at_
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
" should be perfect: "	TokenNameStringLiteral	 should be perfect: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getPrecisionAt	TokenNameIdentifier	 get Precision At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getPrecisionAt	TokenNameIdentifier	 get Precision At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1E-2	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"avg-p should be hurt"	TokenNameStringLiteral	avg-p should be hurt
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
>	TokenNameGREATER	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getAvp	TokenNameIdentifier	 get Avp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"recall should be perfect: "	TokenNameStringLiteral	recall should be perfect: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getRecall	TokenNameIdentifier	 get Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getRecall	TokenNameIdentifier	 get Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1E-2	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
QualityStats	TokenNameIdentifier	 Quality Stats
.	TokenNameDOT	
MAX_POINTS	TokenNameIdentifier	 MAX  POINTS
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"p_at_"	TokenNameStringLiteral	p_at_
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
" should be hurt: "	TokenNameStringLiteral	 should be hurt: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getPrecisionAt	TokenNameIdentifier	 get Precision At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
>	TokenNameGREATER	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getPrecisionAt	TokenNameIdentifier	 get Precision At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"avg-p should be hurt: "	TokenNameStringLiteral	avg-p should be hurt: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getAvp	TokenNameIdentifier	 get Avp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
>	TokenNameGREATER	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getAvp	TokenNameIdentifier	 get Avp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"recall should be hurt: "	TokenNameStringLiteral	recall should be hurt: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getRecall	TokenNameIdentifier	 get Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
>	TokenNameGREATER	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getRecall	TokenNameIdentifier	 get Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
QualityStats	TokenNameIdentifier	 Quality Stats
.	TokenNameDOT	
MAX_POINTS	TokenNameIdentifier	 MAX  POINTS
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"p_at_"	TokenNameStringLiteral	p_at_
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
" should be hurt: "	TokenNameStringLiteral	 should be hurt: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getPrecisionAt	TokenNameIdentifier	 get Precision At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
>	TokenNameGREATER	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getPrecisionAt	TokenNameIdentifier	 get Precision At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"avg-p should be perfect: "	TokenNameStringLiteral	avg-p should be perfect: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getAvp	TokenNameIdentifier	 get Avp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getAvp	TokenNameIdentifier	 get Avp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1E-2	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"recall should be perfect: "	TokenNameStringLiteral	recall should be perfect: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getRecall	TokenNameIdentifier	 get Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getRecall	TokenNameIdentifier	 get Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1E-2	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
QualityStats	TokenNameIdentifier	 Quality Stats
.	TokenNameDOT	
MAX_POINTS	TokenNameIdentifier	 MAX  POINTS
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"p_at_"	TokenNameStringLiteral	p_at_
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
" should be perfect: "	TokenNameStringLiteral	 should be perfect: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getPrecisionAt	TokenNameIdentifier	 get Precision At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getPrecisionAt	TokenNameIdentifier	 get Precision At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1E-2	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
QualityStats	TokenNameIdentifier	 Quality Stats
avg	TokenNameIdentifier	 avg
=	TokenNameEQUAL	
QualityStats	TokenNameIdentifier	 Quality Stats
.	TokenNameDOT	
average	TokenNameIdentifier	 average
(	TokenNameLPAREN	
stats	TokenNameIdentifier	 stats
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Average statistis:"	TokenNameStringLiteral	Average statistis:
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"mean avg-p should be hurt: "	TokenNameStringLiteral	mean avg-p should be hurt: 
+	TokenNamePLUS	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
getAvp	TokenNameIdentifier	 get Avp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
>	TokenNameGREATER	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
getAvp	TokenNameIdentifier	 get Avp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"avg recall should be hurt: "	TokenNameStringLiteral	avg recall should be hurt: 
+	TokenNamePLUS	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
getRecall	TokenNameIdentifier	 get Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
>	TokenNameGREATER	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
getRecall	TokenNameIdentifier	 get Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
QualityStats	TokenNameIdentifier	 Quality Stats
.	TokenNameDOT	
MAX_POINTS	TokenNameIdentifier	 MAX  POINTS
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"avg p_at_"	TokenNameStringLiteral	avg p_at_
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
" should be hurt: "	TokenNameStringLiteral	 should be hurt: 
+	TokenNamePLUS	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
getPrecisionAt	TokenNameIdentifier	 get Precision At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
>	TokenNameGREATER	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
getPrecisionAt	TokenNameIdentifier	 get Precision At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
searcher	TokenNameIdentifier	 searcher
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
public	TokenNamepublic	
void	TokenNamevoid	
testTrecTopicsReader	TokenNameIdentifier	 test Trec Topics Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// prepare topics 	TokenNameCOMMENT_LINE	prepare topics 
InputStream	TokenNameIdentifier	 Input Stream
topicsFile	TokenNameIdentifier	 topics File
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"trecTopics.txt"	TokenNameStringLiteral	trecTopics.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TrecTopicsReader	TokenNameIdentifier	 Trec Topics Reader
qReader	TokenNameIdentifier	 q Reader
=	TokenNameEQUAL	
new	TokenNamenew	
TrecTopicsReader	TokenNameIdentifier	 Trec Topics Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QualityQuery	TokenNameIdentifier	 Quality Query
qqs	TokenNameIdentifier	 qqs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
qReader	TokenNameIdentifier	 q Reader
.	TokenNameDOT	
readQueries	TokenNameIdentifier	 read Queries
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
topicsFile	TokenNameIdentifier	 topics File
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
qqs	TokenNameIdentifier	 qqs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QualityQuery	TokenNameIdentifier	 Quality Query
qq	TokenNameIdentifier	 qq
=	TokenNameEQUAL	
qqs	TokenNameIdentifier	 qqs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"statement months total 1987"	TokenNameStringLiteral	statement months total 1987
,	TokenNameCOMMA	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"title"	TokenNameStringLiteral	title
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Topic 0 Description Line 1 Topic 0 Description Line 2"	TokenNameStringLiteral	Topic 0 Description Line 1 Topic 0 Description Line 2
,	TokenNameCOMMA	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"description"	TokenNameStringLiteral	description
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Topic 0 Narrative Line 1 Topic 0 Narrative Line 2"	TokenNameStringLiteral	Topic 0 Narrative Line 1 Topic 0 Narrative Line 2
,	TokenNameCOMMA	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"narrative"	TokenNameStringLiteral	narrative
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qq	TokenNameIdentifier	 qq
=	TokenNameEQUAL	
qqs	TokenNameIdentifier	 qqs
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"agreed 15 against five"	TokenNameStringLiteral	agreed 15 against five
,	TokenNameCOMMA	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"title"	TokenNameStringLiteral	title
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Topic 1 Description Line 1 Topic 1 Description Line 2"	TokenNameStringLiteral	Topic 1 Description Line 1 Topic 1 Description Line 2
,	TokenNameCOMMA	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"description"	TokenNameStringLiteral	description
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Topic 1 Narrative Line 1 Topic 1 Narrative Line 2"	TokenNameStringLiteral	Topic 1 Narrative Line 1 Topic 1 Narrative Line 2
,	TokenNameCOMMA	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"narrative"	TokenNameStringLiteral	narrative
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qq	TokenNameIdentifier	 qq
=	TokenNameEQUAL	
qqs	TokenNameIdentifier	 qqs
[	TokenNameLBRACKET	
19	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"20 while common week"	TokenNameStringLiteral	20 while common week
,	TokenNameCOMMA	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"title"	TokenNameStringLiteral	title
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Topic 19 Description Line 1 Topic 19 Description Line 2"	TokenNameStringLiteral	Topic 19 Description Line 1 Topic 19 Description Line 2
,	TokenNameCOMMA	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"description"	TokenNameStringLiteral	description
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Topic 19 Narrative Line 1 Topic 19 Narrative Line 2"	TokenNameStringLiteral	Topic 19 Narrative Line 1 Topic 19 Narrative Line 2
,	TokenNameCOMMA	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
"narrative"	TokenNameStringLiteral	narrative
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// use benchmark logic to create the mini Reuters index 	TokenNameCOMMENT_LINE	use benchmark logic to create the mini Reuters index 
private	TokenNameprivate	
void	TokenNamevoid	
createReutersIndex	TokenNameIdentifier	 create Reuters Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// 1. alg definition 	TokenNameCOMMENT_LINE	1. alg definition 
String	TokenNameIdentifier	 String
algLines	TokenNameIdentifier	 alg Lines
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"# ----- properties "	TokenNameStringLiteral	# ----- properties 
,	TokenNameCOMMA	
"content.source=org.apache.lucene.benchmark.byTask.feeds.LineDocSource"	TokenNameStringLiteral	content.source=org.apache.lucene.benchmark.byTask.feeds.LineDocSource
,	TokenNameCOMMA	
"analyzer=org.apache.lucene.analysis.standard.ClassicAnalyzer"	TokenNameStringLiteral	analyzer=org.apache.lucene.analysis.standard.ClassicAnalyzer
,	TokenNameCOMMA	
"docs.file="	TokenNameStringLiteral	docs.file=
+	TokenNamePLUS	
getWorkDirResourcePath	TokenNameIdentifier	 get Work Dir Resource Path
(	TokenNameLPAREN	
"reuters.578.lines.txt.bz2"	TokenNameStringLiteral	reuters.578.lines.txt.bz2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"content.source.log.step=2500"	TokenNameStringLiteral	content.source.log.step=2500
,	TokenNameCOMMA	
"doc.term.vector=false"	TokenNameStringLiteral	doc.term.vector=false
,	TokenNameCOMMA	
"content.source.forever=false"	TokenNameStringLiteral	content.source.forever=false
,	TokenNameCOMMA	
"directory=FSDirectory"	TokenNameStringLiteral	directory=FSDirectory
,	TokenNameCOMMA	
"doc.stored=true"	TokenNameStringLiteral	doc.stored=true
,	TokenNameCOMMA	
"doc.tokenized=true"	TokenNameStringLiteral	doc.tokenized=true
,	TokenNameCOMMA	
"# ----- alg "	TokenNameStringLiteral	# ----- alg 
,	TokenNameCOMMA	
"ResetSystemErase"	TokenNameStringLiteral	ResetSystemErase
,	TokenNameCOMMA	
"CreateIndex"	TokenNameStringLiteral	CreateIndex
,	TokenNameCOMMA	
"{ AddDoc } : *"	TokenNameStringLiteral	{ AddDoc } : *
,	TokenNameCOMMA	
"CloseIndex"	TokenNameStringLiteral	CloseIndex
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 2. execute the algorithm (required in every "logic" test) 	TokenNameCOMMENT_LINE	2. execute the algorithm (required in every "logic" test) 
execBenchmark	TokenNameIdentifier	 exec Benchmark
(	TokenNameLPAREN	
algLines	TokenNameIdentifier	 alg Lines
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
