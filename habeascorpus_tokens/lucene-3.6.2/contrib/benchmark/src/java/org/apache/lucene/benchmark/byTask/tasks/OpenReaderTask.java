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
tasks	TokenNameIdentifier	 tasks
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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Config	TokenNameIdentifier	 Config
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
IndexCommit	TokenNameIdentifier	 Index Commit
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
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
;	TokenNameSEMICOLON	
/** * Open an index reader. * <br>Other side effects: index reader object in perfRunData is set. * <br> Optional params readOnly,commitUserData eg. OpenReader(false,commit1) */	TokenNameCOMMENT_JAVADOC	 Open an index reader. <br>Other side effects: index reader object in perfRunData is set. <br> Optional params readOnly,commitUserData eg. OpenReader(false,commit1) 
public	TokenNamepublic	
class	TokenNameclass	
OpenReaderTask	TokenNameIdentifier	 Open Reader Task
extends	TokenNameextends	
PerfTask	TokenNameIdentifier	 Perf Task
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USER_DATA	TokenNameIdentifier	 USER  DATA
=	TokenNameEQUAL	
"userData"	TokenNameStringLiteral	userData
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
commitUserData	TokenNameIdentifier	 commit User Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
OpenReaderTask	TokenNameIdentifier	 Open Reader Task
(	TokenNameLPAREN	
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
deletionPolicy	TokenNameIdentifier	 deletion Policy
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deletionPolicy	TokenNameIdentifier	 deletion Policy
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
deletionPolicy	TokenNameIdentifier	 deletion Policy
=	TokenNameEQUAL	
CreateIndexTask	TokenNameIdentifier	 Create Index Task
.	TokenNameDOT	
getIndexDeletionPolicy	TokenNameIdentifier	 get Index Deletion Policy
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
commitUserData	TokenNameIdentifier	 commit User Data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
OpenReaderTask	TokenNameIdentifier	 Open Reader Task
.	TokenNameDOT	
findIndexCommit	TokenNameIdentifier	 find Index Commit
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
commitUserData	TokenNameIdentifier	 commit User Data
)	TokenNameRPAREN	
,	TokenNameCOMMA	
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
deletionPolicy	TokenNameIdentifier	 deletion Policy
,	TokenNameCOMMA	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setIndexReader	TokenNameIdentifier	 set Index Reader
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We transfer reference to the run data 	TokenNameCOMMENT_LINE	We transfer reference to the run data 
r	TokenNameIdentifier	 r
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setParams	TokenNameIdentifier	 set Params
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setParams	TokenNameIdentifier	 set Params
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
split	TokenNameIdentifier	 split
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
split	TokenNameIdentifier	 split
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readOnly	TokenNameIdentifier	 read Only
=	TokenNameEQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
split	TokenNameIdentifier	 split
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
split	TokenNameIdentifier	 split
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commitUserData	TokenNameIdentifier	 commit User Data
=	TokenNameEQUAL	
split	TokenNameIdentifier	 split
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
supportsParams	TokenNameIdentifier	 supports Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
IndexCommit	TokenNameIdentifier	 Index Commit
findIndexCommit	TokenNameIdentifier	 find Index Commit
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
userData	TokenNameIdentifier	 user Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
commits	TokenNameIdentifier	 commits
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
listCommits	TokenNameIdentifier	 list Commits
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexCommit	TokenNameIdentifier	 Index Commit
ic	TokenNameIdentifier	 ic
:	TokenNameCOLON	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
ic	TokenNameIdentifier	 ic
.	TokenNameDOT	
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ud	TokenNameIdentifier	 ud
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ud	TokenNameIdentifier	 ud
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
USER_DATA	TokenNameIdentifier	 USER  DATA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ud	TokenNameIdentifier	 ud
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
ud	TokenNameIdentifier	 ud
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
userData	TokenNameIdentifier	 user Data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ic	TokenNameIdentifier	 ic
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"index does not contain commit with userData: "	TokenNameStringLiteral	index does not contain commit with userData: 
+	TokenNamePLUS	
userData	TokenNameIdentifier	 user Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
