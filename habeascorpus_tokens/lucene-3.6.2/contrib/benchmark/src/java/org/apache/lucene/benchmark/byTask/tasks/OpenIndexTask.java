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
IndexWriter	TokenNameIdentifier	 Index Writer
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
IndexWriter	TokenNameIdentifier	 Index Writer
.	TokenNameDOT	
MaxFieldLength	TokenNameIdentifier	 Max Field Length
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
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
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
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
OpenMode	TokenNameIdentifier	 Open Mode
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
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
;	TokenNameSEMICOLON	
/** * Open an index writer. * <br>Other side effects: index writer object in perfRunData is set. * <br>Relevant properties: <code>merge.factor, max.buffered, * max.field.length, ram.flush.mb [default 0]</code>. * * <p> Accepts a param specifying the commit point as * previously saved with CommitIndexTask. If you specify * this, it rolls the index back to that commit on opening * the IndexWriter. */	TokenNameCOMMENT_JAVADOC	 Open an index writer. <br>Other side effects: index writer object in perfRunData is set. <br>Relevant properties: <code>merge.factor, max.buffered, max.field.length, ram.flush.mb [default 0]</code>. * <p> Accepts a param specifying the commit point as previously saved with CommitIndexTask. If you specify this, it rolls the index back to that commit on opening the IndexWriter. 
public	TokenNamepublic	
class	TokenNameclass	
OpenIndexTask	TokenNameIdentifier	 Open Index Task
extends	TokenNameextends	
PerfTask	TokenNameIdentifier	 Perf Task
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_BUFFERED	TokenNameIdentifier	 DEFAULT  MAX  BUFFERED
=	TokenNameEQUAL	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
DEFAULT_MAX_BUFFERED_DOCS	TokenNameIdentifier	 DEFAULT  MAX  BUFFERED  DOCS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_FIELD_LENGTH	TokenNameIdentifier	 DEFAULT  MAX  FIELD  LENGTH
=	TokenNameEQUAL	
MaxFieldLength	TokenNameIdentifier	 Max Field Length
.	TokenNameDOT	
UNLIMITED	TokenNameIdentifier	 UNLIMITED
.	TokenNameDOT	
getLimit	TokenNameIdentifier	 get Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MERGE_PFACTOR	TokenNameIdentifier	 DEFAULT  MERGE  PFACTOR
=	TokenNameEQUAL	
LogMergePolicy	TokenNameIdentifier	 Log Merge Policy
.	TokenNameDOT	
DEFAULT_MERGE_FACTOR	TokenNameIdentifier	 DEFAULT  MERGE  FACTOR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
DEFAULT_RAM_FLUSH_MB	TokenNameIdentifier	 DEFAULT  RAM  FLUSH  MB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
DEFAULT_RAM_BUFFER_SIZE_MB	TokenNameIdentifier	 DEFAULT  RAM  BUFFER  SIZE  MB
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
commitUserData	TokenNameIdentifier	 commit User Data
;	TokenNameSEMICOLON	
public	TokenNamepublic	
OpenIndexTask	TokenNameIdentifier	 Open Index Task
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
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
=	TokenNameEQUAL	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
runData	TokenNameIdentifier	 run Data
.	TokenNameDOT	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexCommit	TokenNameIdentifier	 Index Commit
ic	TokenNameIdentifier	 ic
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
commitUserData	TokenNameIdentifier	 commit User Data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ic	TokenNameIdentifier	 ic
=	TokenNameEQUAL	
OpenReaderTask	TokenNameIdentifier	 Open Reader Task
.	TokenNameDOT	
findIndexCommit	TokenNameIdentifier	 find Index Commit
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
commitUserData	TokenNameIdentifier	 commit User Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ic	TokenNameIdentifier	 ic
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
CreateIndexTask	TokenNameIdentifier	 Create Index Task
.	TokenNameDOT	
configureWriter	TokenNameIdentifier	 configure Writer
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
,	TokenNameCOMMA	
runData	TokenNameIdentifier	 run Data
,	TokenNameCOMMA	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
APPEND	TokenNameIdentifier	 APPEND
,	TokenNameCOMMA	
ic	TokenNameIdentifier	 ic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runData	TokenNameIdentifier	 run Data
.	TokenNameDOT	
setIndexWriter	TokenNameIdentifier	 set Index Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
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
// specifies which commit point to open 	TokenNameCOMMENT_LINE	specifies which commit point to open 
commitUserData	TokenNameIdentifier	 commit User Data
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
