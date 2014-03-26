/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
DocNameExtractor	TokenNameIdentifier	 Doc Name Extractor
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
ScoreDoc	TokenNameIdentifier	 Score Doc
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
TopDocs	TokenNameIdentifier	 Top Docs
;	TokenNameSEMICOLON	
/** * Main entry point for running a quality benchmark. * <p> * There are two main configurations for running a quality benchmark: <ul> * <li>Against existing judgements.</li> * <li>For submission (e.g. for a contest).</li> * </ul> * The first configuration requires a non null * {@link org.apache.lucene.benchmark.quality.Judge Judge}. * The second configuration requires a non null * {@link org.apache.lucene.benchmark.quality.utils.SubmissionReport SubmissionLogger}. */	TokenNameCOMMENT_JAVADOC	 Main entry point for running a quality benchmark. <p> There are two main configurations for running a quality benchmark: <ul> <li>Against existing judgements.</li> <li>For submission (e.g. for a contest).</li> </ul> The first configuration requires a non null {@link org.apache.lucene.benchmark.quality.Judge Judge}. The second configuration requires a non null {@link org.apache.lucene.benchmark.quality.utils.SubmissionReport SubmissionLogger}. 
public	TokenNamepublic	
class	TokenNameclass	
QualityBenchmark	TokenNameIdentifier	 Quality Benchmark
{	TokenNameLBRACE	
/** Quality Queries that this quality benchmark would execute. */	TokenNameCOMMENT_JAVADOC	 Quality Queries that this quality benchmark would execute. 
protected	TokenNameprotected	
QualityQuery	TokenNameIdentifier	 Quality Query
qualityQueries	TokenNameIdentifier	 quality Queries
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Parser for turning QualityQueries into Lucene Queries. */	TokenNameCOMMENT_JAVADOC	 Parser for turning QualityQueries into Lucene Queries. 
protected	TokenNameprotected	
QualityQueryParser	TokenNameIdentifier	 Quality Query Parser
qqParser	TokenNameIdentifier	 qq Parser
;	TokenNameSEMICOLON	
/** Index to be searched. */	TokenNameCOMMENT_JAVADOC	 Index to be searched. 
protected	TokenNameprotected	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
;	TokenNameSEMICOLON	
/** index field to extract doc name for each search result; used for judging the results. */	TokenNameCOMMENT_JAVADOC	 index field to extract doc name for each search result; used for judging the results. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
docNameField	TokenNameIdentifier	 doc Name Field
;	TokenNameSEMICOLON	
/** maximal number of queries that this quality benchmark runs. Default: maxint. Useful for debugging. */	TokenNameCOMMENT_JAVADOC	 maximal number of queries that this quality benchmark runs. Default: maxint. Useful for debugging. 
private	TokenNameprivate	
int	TokenNameint	
maxQueries	TokenNameIdentifier	 max Queries
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
/** maximal number of results to collect for each query. Default: 1000. */	TokenNameCOMMENT_JAVADOC	 maximal number of results to collect for each query. Default: 1000. 
private	TokenNameprivate	
int	TokenNameint	
maxResults	TokenNameIdentifier	 max Results
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Create a QualityBenchmark. * @param qqs quality queries to run. * @param qqParser parser for turning QualityQueries into Lucene Queries. * @param searcher index to be searched. * @param docNameField name of field containing the document name. * This allows to extract the doc name for search results, * and is important for judging the results. */	TokenNameCOMMENT_JAVADOC	 Create a QualityBenchmark. @param qqs quality queries to run. @param qqParser parser for turning QualityQueries into Lucene Queries. @param searcher index to be searched. @param docNameField name of field containing the document name. This allows to extract the doc name for search results, and is important for judging the results. 
public	TokenNamepublic	
QualityBenchmark	TokenNameIdentifier	 Quality Benchmark
(	TokenNameLPAREN	
QualityQuery	TokenNameIdentifier	 Quality Query
qqs	TokenNameIdentifier	 qqs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
QualityQueryParser	TokenNameIdentifier	 Quality Query Parser
qqParser	TokenNameIdentifier	 qq Parser
,	TokenNameCOMMA	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
docNameField	TokenNameIdentifier	 doc Name Field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
qualityQueries	TokenNameIdentifier	 quality Queries
=	TokenNameEQUAL	
qqs	TokenNameIdentifier	 qqs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
qqParser	TokenNameIdentifier	 qq Parser
=	TokenNameEQUAL	
qqParser	TokenNameIdentifier	 qq Parser
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docNameField	TokenNameIdentifier	 doc Name Field
=	TokenNameEQUAL	
docNameField	TokenNameIdentifier	 doc Name Field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Run the quality benchmark. * @param judge the judge that can tell if a certain result doc is relevant for a certain quality query. * If null, no judgements would be made. Usually null for a submission run. * @param submitRep submission report is created if non null. * @param qualityLog If not null, quality run data would be printed for each query. * @return QualityStats of each quality query that was executed. * @throws Exception if quality benchmark failed to run. */	TokenNameCOMMENT_JAVADOC	 Run the quality benchmark. @param judge the judge that can tell if a certain result doc is relevant for a certain quality query. If null, no judgements would be made. Usually null for a submission run. @param submitRep submission report is created if non null. @param qualityLog If not null, quality run data would be printed for each query. @return QualityStats of each quality query that was executed. @throws Exception if quality benchmark failed to run. 
public	TokenNamepublic	
QualityStats	TokenNameIdentifier	 Quality Stats
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
Judge	TokenNameIdentifier	 Judge
judge	TokenNameIdentifier	 judge
,	TokenNameCOMMA	
SubmissionReport	TokenNameIdentifier	 Submission Report
submitRep	TokenNameIdentifier	 submit Rep
,	TokenNameCOMMA	
PrintWriter	TokenNameIdentifier	 Print Writer
qualityLog	TokenNameIdentifier	 quality Log
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
nQueries	TokenNameIdentifier	 n Queries
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
maxQueries	TokenNameIdentifier	 max Queries
,	TokenNameCOMMA	
qualityQueries	TokenNameIdentifier	 quality Queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QualityStats	TokenNameIdentifier	 Quality Stats
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
QualityStats	TokenNameIdentifier	 Quality Stats
[	TokenNameLBRACKET	
nQueries	TokenNameIdentifier	 n Queries
]	TokenNameRBRACKET	
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
nQueries	TokenNameIdentifier	 n Queries
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QualityQuery	TokenNameIdentifier	 Quality Query
qq	TokenNameIdentifier	 qq
=	TokenNameEQUAL	
qualityQueries	TokenNameIdentifier	 quality Queries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// generate query 	TokenNameCOMMENT_LINE	generate query 
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
qqParser	TokenNameIdentifier	 qq Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
qq	TokenNameIdentifier	 qq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// search with this query 	TokenNameCOMMENT_LINE	search with this query 
long	TokenNamelong	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TopDocs	TokenNameIdentifier	 Top Docs
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
maxResults	TokenNameIdentifier	 max Results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
searchTime	TokenNameIdentifier	 search Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
//most likely we either submit or judge, but check both 	TokenNameCOMMENT_LINE	most likely we either submit or judge, but check both 
if	TokenNameif	
(	TokenNameLPAREN	
judge	TokenNameIdentifier	 judge
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
analyzeQueryResults	TokenNameIdentifier	 analyze Query Results
(	TokenNameLPAREN	
qq	TokenNameIdentifier	 qq
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
td	TokenNameIdentifier	 td
,	TokenNameCOMMA	
judge	TokenNameIdentifier	 judge
,	TokenNameCOMMA	
qualityLog	TokenNameIdentifier	 quality Log
,	TokenNameCOMMA	
searchTime	TokenNameIdentifier	 search Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
submitRep	TokenNameIdentifier	 submit Rep
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
submitRep	TokenNameIdentifier	 submit Rep
.	TokenNameDOT	
report	TokenNameIdentifier	 report
(	TokenNameLPAREN	
qq	TokenNameIdentifier	 qq
,	TokenNameCOMMA	
td	TokenNameIdentifier	 td
,	TokenNameCOMMA	
docNameField	TokenNameIdentifier	 doc Name Field
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
submitRep	TokenNameIdentifier	 submit Rep
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
submitRep	TokenNameIdentifier	 submit Rep
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
stats	TokenNameIdentifier	 stats
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Analyze/judge results for a single quality query; optionally log them. */	TokenNameCOMMENT_BLOCK	 Analyze/judge results for a single quality query; optionally log them. 
private	TokenNameprivate	
QualityStats	TokenNameIdentifier	 Quality Stats
analyzeQueryResults	TokenNameIdentifier	 analyze Query Results
(	TokenNameLPAREN	
QualityQuery	TokenNameIdentifier	 Quality Query
qq	TokenNameIdentifier	 qq
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
TopDocs	TokenNameIdentifier	 Top Docs
td	TokenNameIdentifier	 td
,	TokenNameCOMMA	
Judge	TokenNameIdentifier	 Judge
judge	TokenNameIdentifier	 judge
,	TokenNameCOMMA	
PrintWriter	TokenNameIdentifier	 Print Writer
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
long	TokenNamelong	
searchTime	TokenNameIdentifier	 search Time
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
QualityStats	TokenNameIdentifier	 Quality Stats
stts	TokenNameIdentifier	 stts
=	TokenNameEQUAL	
new	TokenNamenew	
QualityStats	TokenNameIdentifier	 Quality Stats
(	TokenNameLPAREN	
judge	TokenNameIdentifier	 judge
.	TokenNameDOT	
maxRecall	TokenNameIdentifier	 max Recall
(	TokenNameLPAREN	
qq	TokenNameIdentifier	 qq
)	TokenNameRPAREN	
,	TokenNameCOMMA	
searchTime	TokenNameIdentifier	 search Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ScoreDoc	TokenNameIdentifier	 Score Doc
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
long	TokenNamelong	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// extraction of first doc name we measure also construction of doc name extractor, just in case. 	TokenNameCOMMENT_LINE	extraction of first doc name we measure also construction of doc name extractor, just in case. 
DocNameExtractor	TokenNameIdentifier	 Doc Name Extractor
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
new	TokenNamenew	
DocNameExtractor	TokenNameIdentifier	 Doc Name Extractor
(	TokenNameLPAREN	
docNameField	TokenNameIdentifier	 doc Name Field
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
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
docName	TokenNameIdentifier	 doc Name
=	TokenNameEQUAL	
xt	TokenNameIdentifier	 xt
.	TokenNameDOT	
docName	TokenNameIdentifier	 doc Name
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
docNameExtractTime	TokenNameIdentifier	 doc Name Extract Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isRelevant	TokenNameIdentifier	 is Relevant
=	TokenNameEQUAL	
judge	TokenNameIdentifier	 judge
.	TokenNameDOT	
isRelevant	TokenNameIdentifier	 is Relevant
(	TokenNameLPAREN	
docName	TokenNameIdentifier	 doc Name
,	TokenNameCOMMA	
qq	TokenNameIdentifier	 qq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stts	TokenNameIdentifier	 stts
.	TokenNameDOT	
addResult	TokenNameIdentifier	 add Result
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
isRelevant	TokenNameIdentifier	 is Relevant
,	TokenNameCOMMA	
docNameExtractTime	TokenNameIdentifier	 doc Name Extract Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
getQueryID	TokenNameIdentifier	 get Query ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" - "	TokenNameStringLiteral	 - 
+	TokenNamePLUS	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stts	TokenNameIdentifier	 stts
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
getQueryID	TokenNameIdentifier	 get Query ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Stats:"	TokenNameStringLiteral	 Stats:
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
stts	TokenNameIdentifier	 stts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the maximum number of quality queries to run. Useful at debugging. */	TokenNameCOMMENT_JAVADOC	 @return the maximum number of quality queries to run. Useful at debugging. 
public	TokenNamepublic	
int	TokenNameint	
getMaxQueries	TokenNameIdentifier	 get Max Queries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxQueries	TokenNameIdentifier	 max Queries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the maximum number of quality queries to run. Useful at debugging. */	TokenNameCOMMENT_JAVADOC	 Set the maximum number of quality queries to run. Useful at debugging. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxQueries	TokenNameIdentifier	 set Max Queries
(	TokenNameLPAREN	
int	TokenNameint	
maxQueries	TokenNameIdentifier	 max Queries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxQueries	TokenNameIdentifier	 max Queries
=	TokenNameEQUAL	
maxQueries	TokenNameIdentifier	 max Queries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the maximum number of results to collect for each quality query. */	TokenNameCOMMENT_JAVADOC	 @return the maximum number of results to collect for each quality query. 
public	TokenNamepublic	
int	TokenNameint	
getMaxResults	TokenNameIdentifier	 get Max Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxResults	TokenNameIdentifier	 max Results
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set the maximum number of results to collect for each quality query. */	TokenNameCOMMENT_JAVADOC	 set the maximum number of results to collect for each quality query. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxResults	TokenNameIdentifier	 set Max Results
(	TokenNameLPAREN	
int	TokenNameint	
maxResults	TokenNameIdentifier	 max Results
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxResults	TokenNameIdentifier	 max Results
=	TokenNameEQUAL	
maxResults	TokenNameIdentifier	 max Results
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
