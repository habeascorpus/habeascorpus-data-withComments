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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
/** * Delete a document by docid. If no docid param is supplied, deletes doc with * <code>id = last-deleted-doc + doc.delete.step</code>. */	TokenNameCOMMENT_JAVADOC	 Delete a document by docid. If no docid param is supplied, deletes doc with <code>id = last-deleted-doc + doc.delete.step</code>. 
public	TokenNamepublic	
class	TokenNameclass	
DeleteDocTask	TokenNameIdentifier	 Delete Doc Task
extends	TokenNameextends	
PerfTask	TokenNameIdentifier	 Perf Task
{	TokenNameLBRACE	
/** * Gap between ids of deleted docs, applies when no docid param is provided. */	TokenNameCOMMENT_JAVADOC	 Gap between ids of deleted docs, applies when no docid param is provided. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_DOC_DELETE_STEP	TokenNameIdentifier	 DEFAULT  DOC  DELETE  STEP
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DeleteDocTask	TokenNameIdentifier	 Delete Doc Task
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
private	TokenNameprivate	
int	TokenNameint	
deleteStep	TokenNameIdentifier	 delete Step
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
lastDeleted	TokenNameIdentifier	 last Deleted
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
docid	TokenNameIdentifier	 docid
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
byStep	TokenNameIdentifier	 by Step
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
docid	TokenNameIdentifier	 docid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastDeleted	TokenNameIdentifier	 last Deleted
=	TokenNameEQUAL	
docid	TokenNameIdentifier	 docid
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// one work item done here 	TokenNameCOMMENT_LINE	one work item done here 
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.benchmark.byTask.tasks.PerfTask#setup() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.benchmark.byTask.tasks.PerfTask#setup() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setup	TokenNameIdentifier	 setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deleteStep	TokenNameIdentifier	 delete Step
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deleteStep	TokenNameIdentifier	 delete Step
=	TokenNameEQUAL	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"doc.delete.step"	TokenNameStringLiteral	doc.delete.step
,	TokenNameCOMMA	
DEFAULT_DOC_DELETE_STEP	TokenNameIdentifier	 DEFAULT  DOC  DELETE  STEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set the docid to be deleted 	TokenNameCOMMENT_LINE	set the docid to be deleted 
docid	TokenNameIdentifier	 docid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byStep	TokenNameIdentifier	 by Step
?	TokenNameQUESTION	
lastDeleted	TokenNameIdentifier	 last Deleted
+	TokenNamePLUS	
deleteStep	TokenNameIdentifier	 delete Step
:	TokenNameCOLON	
docid	TokenNameIdentifier	 docid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getLogMessage	TokenNameIdentifier	 get Log Message
(	TokenNameLPAREN	
int	TokenNameint	
recsCount	TokenNameIdentifier	 recs Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"deleted "	TokenNameStringLiteral	deleted 
+	TokenNamePLUS	
recsCount	TokenNameIdentifier	 recs Count
+	TokenNamePLUS	
" docs, last deleted: "	TokenNameStringLiteral	 docs, last deleted: 
+	TokenNamePLUS	
lastDeleted	TokenNameIdentifier	 last Deleted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the params (docid only) * @param params docid to delete, or -1 for deleting by delete gap settings. */	TokenNameCOMMENT_JAVADOC	 Set the params (docid only) @param params docid to delete, or -1 for deleting by delete gap settings. 
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
docid	TokenNameIdentifier	 docid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byStep	TokenNameIdentifier	 by Step
=	TokenNameEQUAL	
(	TokenNameLPAREN	
docid	TokenNameIdentifier	 docid
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.benchmark.byTask.tasks.PerfTask#supportsParams() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.benchmark.byTask.tasks.PerfTask#supportsParams() 
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
