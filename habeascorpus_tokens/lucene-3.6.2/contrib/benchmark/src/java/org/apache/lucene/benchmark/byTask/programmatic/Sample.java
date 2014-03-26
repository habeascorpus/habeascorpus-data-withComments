package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
programmatic	TokenNameIdentifier	 programmatic
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
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
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
PerfRunData	TokenNameIdentifier	 Perf Run Data
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
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
AddDocTask	TokenNameIdentifier	 Add Doc Task
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
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
CloseIndexTask	TokenNameIdentifier	 Close Index Task
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
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
CreateIndexTask	TokenNameIdentifier	 Create Index Task
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
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
RepSumByNameTask	TokenNameIdentifier	 Rep Sum By Name Task
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
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
TaskSequence	TokenNameIdentifier	 Task Sequence
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
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Config	TokenNameIdentifier	 Config
;	TokenNameSEMICOLON	
/** * Sample performance test written programmatically - no algorithm file is needed here. */	TokenNameCOMMENT_JAVADOC	 Sample performance test written programmatically - no algorithm file is needed here. 
public	TokenNamepublic	
class	TokenNameclass	
Sample	TokenNameIdentifier	 Sample
{	TokenNameLBRACE	
/** * @param args * @throws Exception * @throws IOException */	TokenNameCOMMENT_JAVADOC	 @param args @throws Exception @throws IOException 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
initProps	TokenNameIdentifier	 init Props
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Config	TokenNameIdentifier	 Config
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
new	TokenNamenew	
Config	TokenNameIdentifier	 Config
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
=	TokenNameEQUAL	
new	TokenNamenew	
PerfRunData	TokenNameIdentifier	 Perf Run Data
(	TokenNameLPAREN	
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 1. top sequence 	TokenNameCOMMENT_LINE	1. top sequence 
TaskSequence	TokenNameIdentifier	 Task Sequence
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
new	TokenNamenew	
TaskSequence	TokenNameIdentifier	 Task Sequence
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// top level, not parallel 	TokenNameCOMMENT_LINE	top level, not parallel 
// 2. task to create the index 	TokenNameCOMMENT_LINE	2. task to create the index 
CreateIndexTask	TokenNameIdentifier	 Create Index Task
create	TokenNameIdentifier	 create
=	TokenNameEQUAL	
new	TokenNamenew	
CreateIndexTask	TokenNameIdentifier	 Create Index Task
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
create	TokenNameIdentifier	 create
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 3. task seq to add 500 docs (order matters - top to bottom - add seq to top, only then add to seq) 	TokenNameCOMMENT_LINE	3. task seq to add 500 docs (order matters - top to bottom - add seq to top, only then add to seq) 
TaskSequence	TokenNameIdentifier	 Task Sequence
seq1	TokenNameIdentifier	 seq1
=	TokenNameEQUAL	
new	TokenNamenew	
TaskSequence	TokenNameIdentifier	 Task Sequence
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
,	TokenNameCOMMA	
"AddDocs"	TokenNameStringLiteral	AddDocs
,	TokenNameCOMMA	
top	TokenNameIdentifier	 top
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
seq1	TokenNameIdentifier	 seq1
.	TokenNameDOT	
setRepetitions	TokenNameIdentifier	 set Repetitions
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
seq1	TokenNameIdentifier	 seq1
.	TokenNameDOT	
setNoChildReport	TokenNameIdentifier	 set No Child Report
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
seq1	TokenNameIdentifier	 seq1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 4. task to add the doc 	TokenNameCOMMENT_LINE	4. task to add the doc 
AddDocTask	TokenNameIdentifier	 Add Doc Task
addDoc	TokenNameIdentifier	 add Doc
=	TokenNameEQUAL	
new	TokenNamenew	
AddDocTask	TokenNameIdentifier	 Add Doc Task
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//addDoc.setParams("1200"); // doc size limit if supported 	TokenNameCOMMENT_LINE	addDoc.setParams("1200"); // doc size limit if supported 
seq1	TokenNameIdentifier	 seq1
.	TokenNameDOT	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
addDoc	TokenNameIdentifier	 add Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// order matters 9see comment above) 	TokenNameCOMMENT_LINE	order matters 9see comment above) 
// 5. task to close the index 	TokenNameCOMMENT_LINE	5. task to close the index 
CloseIndexTask	TokenNameIdentifier	 Close Index Task
close	TokenNameIdentifier	 close
=	TokenNameEQUAL	
new	TokenNamenew	
CloseIndexTask	TokenNameIdentifier	 Close Index Task
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
close	TokenNameIdentifier	 close
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// task to report 	TokenNameCOMMENT_LINE	task to report 
RepSumByNameTask	TokenNameIdentifier	 Rep Sum By Name Task
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
new	TokenNamenew	
RepSumByNameTask	TokenNameIdentifier	 Rep Sum By Name Task
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
rep	TokenNameIdentifier	 rep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// print algorithm 	TokenNameCOMMENT_LINE	print algorithm 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// execute 	TokenNameCOMMENT_LINE	execute 
top	TokenNameIdentifier	 top
.	TokenNameDOT	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Sample programmatic settings. Could also read from file. 	TokenNameCOMMENT_LINE	Sample programmatic settings. Could also read from file. 
private	TokenNameprivate	
static	TokenNamestatic	
Properties	TokenNameIdentifier	 Properties
initProps	TokenNameIdentifier	 init Props
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"task.max.depth.log"	TokenNameStringLiteral	task.max.depth.log
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"max.buffered"	TokenNameStringLiteral	max.buffered
,	TokenNameCOMMA	
"buf:10:10:100:100:10:10:100:100"	TokenNameStringLiteral	buf:10:10:100:100:10:10:100:100
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"doc.maker"	TokenNameStringLiteral	doc.maker
,	TokenNameCOMMA	
"org.apache.lucene.benchmark.byTask.feeds.ReutersContentSource"	TokenNameStringLiteral	org.apache.lucene.benchmark.byTask.feeds.ReutersContentSource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"log.step"	TokenNameStringLiteral	log.step
,	TokenNameCOMMA	
"2000"	TokenNameStringLiteral	2000
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"doc.delete.step"	TokenNameStringLiteral	doc.delete.step
,	TokenNameCOMMA	
"8"	TokenNameStringLiteral	8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"analyzer"	TokenNameStringLiteral	analyzer
,	TokenNameCOMMA	
"org.apache.lucene.analysis.standard.StandardAnalyzer"	TokenNameStringLiteral	org.apache.lucene.analysis.standard.StandardAnalyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"doc.term.vector"	TokenNameStringLiteral	doc.term.vector
,	TokenNameCOMMA	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"directory"	TokenNameStringLiteral	directory
,	TokenNameCOMMA	
"FSDirectory"	TokenNameStringLiteral	FSDirectory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"query.maker"	TokenNameStringLiteral	query.maker
,	TokenNameCOMMA	
"org.apache.lucene.benchmark.byTask.feeds.ReutersQueryMaker"	TokenNameStringLiteral	org.apache.lucene.benchmark.byTask.feeds.ReutersQueryMaker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"doc.stored"	TokenNameStringLiteral	doc.stored
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"docs.dir"	TokenNameStringLiteral	docs.dir
,	TokenNameCOMMA	
"reuters-out"	TokenNameStringLiteral	reuters-out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"compound"	TokenNameStringLiteral	compound
,	TokenNameCOMMA	
"cmpnd:true:true:true:true:false:false:false:false"	TokenNameStringLiteral	cmpnd:true:true:true:true:false:false:false:false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"doc.tokenized"	TokenNameStringLiteral	doc.tokenized
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"merge.factor"	TokenNameStringLiteral	merge.factor
,	TokenNameCOMMA	
"mrg:10:100:10:100:10:100:10:100"	TokenNameStringLiteral	mrg:10:100:10:100:10:100:10:100
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
