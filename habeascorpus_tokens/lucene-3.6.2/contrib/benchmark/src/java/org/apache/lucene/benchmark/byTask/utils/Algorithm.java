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
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StreamTokenizer	TokenNameIdentifier	 Stream Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
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
Arrays	TokenNameIdentifier	 Arrays
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
PerfTask	TokenNameIdentifier	 Perf Task
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
RepSumByPrefTask	TokenNameIdentifier	 Rep Sum By Pref Task
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
/** * Test algorithm, as read from file */	TokenNameCOMMENT_JAVADOC	 Test algorithm, as read from file 
public	TokenNamepublic	
class	TokenNameclass	
Algorithm	TokenNameIdentifier	 Algorithm
{	TokenNameLBRACE	
private	TokenNameprivate	
TaskSequence	TokenNameIdentifier	 Task Sequence
sequence	TokenNameIdentifier	 sequence
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
taskPackages	TokenNameIdentifier	 task Packages
;	TokenNameSEMICOLON	
/** * Read algorithm from file * Property examined: alt.tasks.packages == comma separated list of * alternate package names where tasks would be searched for, when not found * in the default package (that of {@link PerfTask}{@link #getClass()}). * If the same task class appears in more than one package, the package * indicated first in this list will be used. * @param runData perf-run-data used at running the tasks. * @throws Exception if errors while parsing the algorithm */	TokenNameCOMMENT_JAVADOC	 Read algorithm from file Property examined: alt.tasks.packages == comma separated list of alternate package names where tasks would be searched for, when not found in the default package (that of {@link PerfTask}{@link #getClass()}). If the same task class appears in more than one package, the package indicated first in this list will be used. @param runData perf-run-data used at running the tasks. @throws Exception if errors while parsing the algorithm 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"fallthrough"	TokenNameStringLiteral	fallthrough
)	TokenNameRPAREN	
public	TokenNamepublic	
Algorithm	TokenNameIdentifier	 Algorithm
(	TokenNameLPAREN	
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
runData	TokenNameIdentifier	 run Data
.	TokenNameDOT	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
taskPackages	TokenNameIdentifier	 task Packages
=	TokenNameEQUAL	
initTasksPackages	TokenNameIdentifier	 init Tasks Packages
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
algTxt	TokenNameIdentifier	 alg Txt
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
getAlgorithmText	TokenNameIdentifier	 get Algorithm Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sequence	TokenNameIdentifier	 sequence
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
TaskSequence	TokenNameIdentifier	 Task Sequence
currSequence	TokenNameIdentifier	 curr Sequence
=	TokenNameEQUAL	
sequence	TokenNameIdentifier	 sequence
;	TokenNameSEMICOLON	
PerfTask	TokenNameIdentifier	 Perf Task
prevTask	TokenNameIdentifier	 prev Task
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
StreamTokenizer	TokenNameIdentifier	 Stream Tokenizer
stok	TokenNameIdentifier	 stok
=	TokenNameEQUAL	
new	TokenNamenew	
StreamTokenizer	TokenNameIdentifier	 Stream Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
algTxt	TokenNameIdentifier	 alg Txt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
commentChar	TokenNameIdentifier	 comment Char
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
eolIsSignificant	TokenNameIdentifier	 eol Is Significant
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ordinaryChar	TokenNameIdentifier	 ordinary Char
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ordinaryChar	TokenNameIdentifier	 ordinary Char
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ordinaryChar	TokenNameIdentifier	 ordinary Char
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ordinaryChar	TokenNameIdentifier	 ordinary Char
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
colonOk	TokenNameIdentifier	 colon Ok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isDisableCountNextTask	TokenNameIdentifier	 is Disable Count Next Task
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// only for primitive tasks 	TokenNameCOMMENT_LINE	only for primitive tasks 
currSequence	TokenNameIdentifier	 curr Sequence
.	TokenNameDOT	
setDepth	TokenNameIdentifier	 set Depth
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
StreamTokenizer	TokenNameIdentifier	 Stream Tokenizer
.	TokenNameDOT	
TT_EOF	TokenNameIdentifier	 TT  EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
StreamTokenizer	TokenNameIdentifier	 Stream Tokenizer
.	TokenNameDOT	
TT_WORD	TokenNameIdentifier	 TT  WORD
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
sval	TokenNameIdentifier	 sval
;	TokenNameSEMICOLON	
Constructor	TokenNameIdentifier	 Constructor
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
PerfTask	TokenNameIdentifier	 Perf Task
>	TokenNameGREATER	
cnstr	TokenNameIdentifier	 cnstr
=	TokenNameEQUAL	
taskClass	TokenNameIdentifier	 task Class
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
asSubclass	TokenNameIdentifier	 as Subclass
(	TokenNameLPAREN	
PerfTask	TokenNameIdentifier	 Perf Task
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
PerfRunData	TokenNameIdentifier	 Perf Run Data
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PerfTask	TokenNameIdentifier	 Perf Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
cnstr	TokenNameIdentifier	 cnstr
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
setDisableCounting	TokenNameIdentifier	 set Disable Counting
(	TokenNameLPAREN	
isDisableCountNextTask	TokenNameIdentifier	 is Disable Count Next Task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isDisableCountNextTask	TokenNameIdentifier	 is Disable Count Next Task
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
currSequence	TokenNameIdentifier	 curr Sequence
.	TokenNameDOT	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
instanceof	TokenNameinstanceof	
RepSumByPrefTask	TokenNameIdentifier	 Rep Sum By Pref Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
sval	TokenNameIdentifier	 sval
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"named report prefix problem - "	TokenNameStringLiteral	named report prefix problem - 
+	TokenNamePLUS	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RepSumByPrefTask	TokenNameIdentifier	 Rep Sum By Pref Task
)	TokenNameRPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
.	TokenNameDOT	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check for task param: '(' someParam ')' 	TokenNameCOMMENT_LINE	check for task param: '(' someParam ')' 
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
!=	TokenNameNOT_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
pushBack	TokenNameIdentifier	 push Back
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// get params, for tasks that supports them, - anything until next ')' 	TokenNameCOMMENT_LINE	get params, for tasks that supports them, - anything until next ')' 
StringBuilder	TokenNameIdentifier	 String Builder
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
!=	TokenNameNOT_EQUAL	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
StreamTokenizer	TokenNameIdentifier	 Stream Tokenizer
.	TokenNameDOT	
TT_NUMBER	TokenNameIdentifier	 TT  NUMBER
:	TokenNameCOLON	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nval	TokenNameIdentifier	 nval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
StreamTokenizer	TokenNameIdentifier	 Stream Tokenizer
.	TokenNameDOT	
TT_WORD	TokenNameIdentifier	 TT  WORD
:	TokenNameCOLON	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
sval	TokenNameIdentifier	 sval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
StreamTokenizer	TokenNameIdentifier	 Stream Tokenizer
.	TokenNameDOT	
TT_EOF	TokenNameIdentifier	 TT  EOF
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"unexpexted EOF: - "	TokenNameStringLiteral	unexpexted EOF: - 
+	TokenNamePLUS	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
prm	TokenNameIdentifier	 prm
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prm	TokenNameIdentifier	 prm
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
setParams	TokenNameIdentifier	 set Params
(	TokenNameLPAREN	
prm	TokenNameIdentifier	 prm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// --------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------- 
colonOk	TokenNameIdentifier	 colon Ok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
prevTask	TokenNameIdentifier	 prev Task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
':'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
colonOk	TokenNameIdentifier	 colon Ok
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"colon unexpexted: - "	TokenNameStringLiteral	colon unexpexted: - 
+	TokenNamePLUS	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colonOk	TokenNameIdentifier	 colon Ok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// get repetitions number 	TokenNameCOMMENT_LINE	get repetitions number 
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
==	TokenNameEQUAL_EQUAL	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
prevTask	TokenNameIdentifier	 prev Task
)	TokenNameRPAREN	
.	TokenNameDOT	
setRepetitions	TokenNameIdentifier	 set Repetitions
(	TokenNameLPAREN	
TaskSequence	TokenNameIdentifier	 Task Sequence
.	TokenNameDOT	
REPEAT_EXHAUST	TokenNameIdentifier	 REPEAT  EXHAUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
!=	TokenNameNOT_EQUAL	
StreamTokenizer	TokenNameIdentifier	 Stream Tokenizer
.	TokenNameDOT	
TT_NUMBER	TokenNameIdentifier	 TT  NUMBER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"expected repetitions number or XXXs: - "	TokenNameStringLiteral	expected repetitions number or XXXs: - 
+	TokenNamePLUS	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nval	TokenNameIdentifier	 nval
;	TokenNameSEMICOLON	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
==	TokenNameEQUAL_EQUAL	
StreamTokenizer	TokenNameIdentifier	 Stream Tokenizer
.	TokenNameDOT	
TT_WORD	TokenNameIdentifier	 TT  WORD
&&	TokenNameAND_AND	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
sval	TokenNameIdentifier	 sval
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"s"	TokenNameStringLiteral	s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
prevTask	TokenNameIdentifier	 prev Task
)	TokenNameRPAREN	
.	TokenNameDOT	
setRunTime	TokenNameIdentifier	 set Run Time
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
pushBack	TokenNameIdentifier	 push Back
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
prevTask	TokenNameIdentifier	 prev Task
)	TokenNameRPAREN	
.	TokenNameDOT	
setRepetitions	TokenNameIdentifier	 set Repetitions
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// check for rate specification (ops/min) 	TokenNameCOMMENT_LINE	check for rate specification (ops/min) 
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
!=	TokenNameNOT_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
pushBack	TokenNameIdentifier	 push Back
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// get rate number 	TokenNameCOMMENT_LINE	get rate number 
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
!=	TokenNameNOT_EQUAL	
StreamTokenizer	TokenNameIdentifier	 Stream Tokenizer
.	TokenNameDOT	
TT_NUMBER	TokenNameIdentifier	 TT  NUMBER
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"expected rate number: - "	TokenNameStringLiteral	expected rate number: - 
+	TokenNamePLUS	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check for unit - min or sec, sec is default 	TokenNameCOMMENT_LINE	check for unit - min or sec, sec is default 
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
!=	TokenNameNOT_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
pushBack	TokenNameIdentifier	 push Back
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
prevTask	TokenNameIdentifier	 prev Task
)	TokenNameRPAREN	
.	TokenNameDOT	
setRate	TokenNameIdentifier	 set Rate
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nval	TokenNameIdentifier	 nval
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set rate per sec 	TokenNameCOMMENT_LINE	set rate per sec 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
!=	TokenNameNOT_EQUAL	
StreamTokenizer	TokenNameIdentifier	 Stream Tokenizer
.	TokenNameDOT	
TT_WORD	TokenNameIdentifier	 TT  WORD
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"expected rate unit: 'min' or 'sec' - "	TokenNameStringLiteral	expected rate unit: 'min' or 'sec' - 
+	TokenNamePLUS	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
sval	TokenNameIdentifier	 sval
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"min"	TokenNameStringLiteral	min
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
prevTask	TokenNameIdentifier	 prev Task
)	TokenNameRPAREN	
.	TokenNameDOT	
setRate	TokenNameIdentifier	 set Rate
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nval	TokenNameIdentifier	 nval
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set rate per min 	TokenNameCOMMENT_LINE	set rate per min 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"sec"	TokenNameStringLiteral	sec
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
prevTask	TokenNameIdentifier	 prev Task
)	TokenNameRPAREN	
.	TokenNameDOT	
setRate	TokenNameIdentifier	 set Rate
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nval	TokenNameIdentifier	 nval
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set rate per sec 	TokenNameCOMMENT_LINE	set rate per sec 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"expected rate unit: 'min' or 'sec' - "	TokenNameStringLiteral	expected rate unit: 'min' or 'sec' - 
+	TokenNamePLUS	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
colonOk	TokenNameIdentifier	 colon Ok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'{'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// a sequence 	TokenNameCOMMENT_LINE	a sequence 
// check for sequence name 	TokenNameCOMMENT_LINE	check for sequence name 
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
!=	TokenNameNOT_EQUAL	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
pushBack	TokenNameIdentifier	 push Back
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
sval	TokenNameIdentifier	 sval
;	TokenNameSEMICOLON	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
!=	TokenNameNOT_EQUAL	
'"'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"sequence name problem - "	TokenNameStringLiteral	sequence name problem - 
+	TokenNamePLUS	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// start the sequence 	TokenNameCOMMENT_LINE	start the sequence 
TaskSequence	TokenNameIdentifier	 Task Sequence
seq2	TokenNameIdentifier	 seq2
=	TokenNameEQUAL	
new	TokenNamenew	
TaskSequence	TokenNameIdentifier	 Task Sequence
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
currSequence	TokenNameIdentifier	 curr Sequence
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currSequence	TokenNameIdentifier	 curr Sequence
.	TokenNameDOT	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
seq2	TokenNameIdentifier	 seq2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currSequence	TokenNameIdentifier	 curr Sequence
=	TokenNameEQUAL	
seq2	TokenNameIdentifier	 seq2
;	TokenNameSEMICOLON	
colonOk	TokenNameIdentifier	 colon Ok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currSequence	TokenNameIdentifier	 curr Sequence
.	TokenNameDOT	
isParallel	TokenNameIdentifier	 is Parallel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"Can only create background tasks within a serial task"	TokenNameStringLiteral	Can only create background tasks within a serial task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
deltaPri	TokenNameIdentifier	 delta Pri
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
ttype	TokenNameIdentifier	 ttype
!=	TokenNameNOT_EQUAL	
StreamTokenizer	TokenNameIdentifier	 Stream Tokenizer
.	TokenNameDOT	
TT_NUMBER	TokenNameIdentifier	 TT  NUMBER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
pushBack	TokenNameIdentifier	 push Back
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deltaPri	TokenNameIdentifier	 delta Pri
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// priority 	TokenNameCOMMENT_LINE	priority 
deltaPri	TokenNameIdentifier	 delta Pri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
stok	TokenNameIdentifier	 stok
.	TokenNameDOT	
nval	TokenNameIdentifier	 nval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prevTask	TokenNameIdentifier	 prev Task
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"& was unexpected"	TokenNameStringLiteral	& was unexpected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prevTask	TokenNameIdentifier	 prev Task
.	TokenNameDOT	
getRunInBackground	TokenNameIdentifier	 get Run In Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"double & was unexpected"	TokenNameStringLiteral	double & was unexpected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prevTask	TokenNameIdentifier	 prev Task
.	TokenNameDOT	
setRunInBackground	TokenNameIdentifier	 set Run In Background
(	TokenNameLPAREN	
deltaPri	TokenNameIdentifier	 delta Pri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
currSequence	TokenNameIdentifier	 curr Sequence
.	TokenNameDOT	
setNoChildReport	TokenNameIdentifier	 set No Child Report
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* intentional fallthrough */	TokenNameCOMMENT_BLOCK	 intentional fallthrough 
case	TokenNamecase	
'}'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
']'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// end sequence 	TokenNameCOMMENT_LINE	end sequence 
colonOk	TokenNameIdentifier	 colon Ok
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
prevTask	TokenNameIdentifier	 prev Task
=	TokenNameEQUAL	
currSequence	TokenNameIdentifier	 curr Sequence
;	TokenNameSEMICOLON	
currSequence	TokenNameIdentifier	 curr Sequence
=	TokenNameEQUAL	
currSequence	TokenNameIdentifier	 curr Sequence
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
isDisableCountNextTask	TokenNameIdentifier	 is Disable Count Next Task
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//switch(c) 	TokenNameCOMMENT_LINE	switch(c) 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//switch(stok.ttype) 	TokenNameCOMMENT_LINE	switch(stok.ttype) 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
!=	TokenNameNOT_EQUAL	
currSequence	TokenNameIdentifier	 curr Sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"Unmatched sequences"	TokenNameStringLiteral	Unmatched sequences
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// remove redundant top level enclosing sequences 	TokenNameCOMMENT_LINE	remove redundant top level enclosing sequences 
while	TokenNamewhile	
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
isCollapsable	TokenNameIdentifier	 is Collapsable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
getRepetitions	TokenNameIdentifier	 get Repetitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
getRate	TokenNameIdentifier	 get Rate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PerfTask	TokenNameIdentifier	 Perf Task
>	TokenNameGREATER	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
getTasks	TokenNameIdentifier	 get Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PerfTask	TokenNameIdentifier	 Perf Task
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
instanceof	TokenNameinstanceof	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sequence	TokenNameIdentifier	 sequence
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
initTasksPackages	TokenNameIdentifier	 init Tasks Packages
(	TokenNameLPAREN	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
alts	TokenNameIdentifier	 alts
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"alt.tasks.packages"	TokenNameStringLiteral	alt.tasks.packages
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dfltPkg	TokenNameIdentifier	 dflt Pkg
=	TokenNameEQUAL	
PerfTask	TokenNameIdentifier	 Perf Task
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getPackage	TokenNameIdentifier	 get Package
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
alts	TokenNameIdentifier	 alts
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
dfltPkg	TokenNameIdentifier	 dflt Pkg
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
pkgs	TokenNameIdentifier	 pkgs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pkgs	TokenNameIdentifier	 pkgs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dfltPkg	TokenNameIdentifier	 dflt Pkg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
alt	TokenNameIdentifier	 alt
:	TokenNameCOLON	
alts	TokenNameIdentifier	 alts
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pkgs	TokenNameIdentifier	 pkgs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
alt	TokenNameIdentifier	 alt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pkgs	TokenNameIdentifier	 pkgs
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
taskClass	TokenNameIdentifier	 task Class
(	TokenNameLPAREN	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
taskName	TokenNameIdentifier	 task Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pkg	TokenNameIdentifier	 pkg
:	TokenNameCOLON	
taskPackages	TokenNameIdentifier	 task Packages
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
pkg	TokenNameIdentifier	 pkg
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
taskName	TokenNameIdentifier	 task Name
+	TokenNamePLUS	
"Task"	TokenNameStringLiteral	Task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// failed in this package, might succeed in the next one... 	TokenNameCOMMENT_LINE	failed in this package, might succeed in the next one... 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// can only get here if failed to instantiate 	TokenNameCOMMENT_LINE	can only get here if failed to instantiate 
throw	TokenNamethrow	
new	TokenNamenew	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
(	TokenNameLPAREN	
taskName	TokenNameIdentifier	 task Name
+	TokenNamePLUS	
" not found in packages "	TokenNameStringLiteral	 not found in packages 
+	TokenNamePLUS	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
taskPackages	TokenNameIdentifier	 task Packages
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
newline	TokenNameIdentifier	 newline
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newline	TokenNameIdentifier	 newline
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute this algorithm * @throws Exception */	TokenNameCOMMENT_JAVADOC	 Execute this algorithm @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
runAndMaybeStats	TokenNameIdentifier	 run And Maybe Stats
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Expert: for test purposes, return all tasks participating in this algorithm. * @return all tasks participating in this algorithm. */	TokenNameCOMMENT_JAVADOC	 Expert: for test purposes, return all tasks participating in this algorithm. @return all tasks participating in this algorithm. 
public	TokenNamepublic	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PerfTask	TokenNameIdentifier	 Perf Task
>	TokenNameGREATER	
extractTasks	TokenNameIdentifier	 extract Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PerfTask	TokenNameIdentifier	 Perf Task
>	TokenNameGREATER	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PerfTask	TokenNameIdentifier	 Perf Task
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extractTasks	TokenNameIdentifier	 extract Tasks
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
extractTasks	TokenNameIdentifier	 extract Tasks
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PerfTask	TokenNameIdentifier	 Perf Task
>	TokenNameGREATER	
extrct	TokenNameIdentifier	 extrct
,	TokenNameCOMMA	
TaskSequence	TokenNameIdentifier	 Task Sequence
seq	TokenNameIdentifier	 seq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
seq	TokenNameIdentifier	 seq
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
extrct	TokenNameIdentifier	 extrct
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
seq	TokenNameIdentifier	 seq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PerfTask	TokenNameIdentifier	 Perf Task
>	TokenNameGREATER	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
getTasks	TokenNameIdentifier	 get Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
PerfTask	TokenNameIdentifier	 Perf Task
p	TokenNameIdentifier	 p
:	TokenNameCOLON	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
instanceof	TokenNameinstanceof	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extractTasks	TokenNameIdentifier	 extract Tasks
(	TokenNameLPAREN	
extrct	TokenNameIdentifier	 extrct
,	TokenNameCOMMA	
(	TokenNameLPAREN	
TaskSequence	TokenNameIdentifier	 Task Sequence
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
extrct	TokenNameIdentifier	 extrct
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
