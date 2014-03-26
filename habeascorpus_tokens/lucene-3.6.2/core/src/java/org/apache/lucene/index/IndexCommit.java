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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
;	TokenNameSEMICOLON	
/** * <p>Expert: represents a single commit into an index as seen by the * {@link IndexDeletionPolicy} or {@link IndexReader}.</p> * * <p> Changes to the content of an index are made visible * only after the writer who made that change commits by * writing a new segments file * (<code>segments_N</code>). This point in time, when the * action of writing of a new segments file to the directory * is completed, is an index commit.</p> * * <p>Each index commit point has a unique segments file * associated with it. The segments file associated with a * later index commit point would have a larger N.</p> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 <p>Expert: represents a single commit into an index as seen by the {@link IndexDeletionPolicy} or {@link IndexReader}.</p> * <p> Changes to the content of an index are made visible only after the writer who made that change commits by writing a new segments file (<code>segments_N</code>). This point in time, when the action of writing of a new segments file to the directory is completed, is an index commit.</p> * <p>Each index commit point has a unique segments file associated with it. The segments file associated with a later index commit point would have a larger N.</p> * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
IndexCommit	TokenNameIdentifier	 Index Commit
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * Get the segments file (<code>segments_N</code>) associated * with this commit point. */	TokenNameCOMMENT_JAVADOC	 Get the segments file (<code>segments_N</code>) associated with this commit point. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns all index files referenced by this commit point. */	TokenNameCOMMENT_JAVADOC	 Returns all index files referenced by this commit point. 
public	TokenNamepublic	
abstract	TokenNameabstract	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getFileNames	TokenNameIdentifier	 get File Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Returns the {@link Directory} for the index. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link Directory} for the index. 
public	TokenNamepublic	
abstract	TokenNameabstract	
Directory	TokenNameIdentifier	 Directory
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Delete this commit point. This only applies when using * the commit point in the context of IndexWriter's * IndexDeletionPolicy. * <p> * Upon calling this, the writer is notified that this commit * point should be deleted. * <p> * Decision that a commit-point should be deleted is taken by the {@link IndexDeletionPolicy} in effect * and therefore this should only be called by its {@link IndexDeletionPolicy#onInit onInit()} or * {@link IndexDeletionPolicy#onCommit onCommit()} methods. */	TokenNameCOMMENT_JAVADOC	 Delete this commit point. This only applies when using the commit point in the context of IndexWriter's IndexDeletionPolicy. <p> Upon calling this, the writer is notified that this commit point should be deleted. <p> Decision that a commit-point should be deleted is taken by the {@link IndexDeletionPolicy} in effect and therefore this should only be called by its {@link IndexDeletionPolicy#onInit onInit()} or {@link IndexDeletionPolicy#onCommit onCommit()} methods. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns number of segments referenced by this commit. */	TokenNameCOMMENT_JAVADOC	 Returns number of segments referenced by this commit. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
getSegmentCount	TokenNameIdentifier	 get Segment Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Two IndexCommits are equal if both their Directory and versions are equal. */	TokenNameCOMMENT_JAVADOC	 Two IndexCommits are equal if both their Directory and versions are equal. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
IndexCommit	TokenNameIdentifier	 Index Commit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexCommit	TokenNameIdentifier	 Index Commit
otherCommit	TokenNameIdentifier	 other Commit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexCommit	TokenNameIdentifier	 Index Commit
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
return	TokenNamereturn	
otherCommit	TokenNameIdentifier	 other Commit
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
otherCommit	TokenNameIdentifier	 other Commit
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the version for this IndexCommit. This is the * same value that {@link IndexReader#getVersion} would * return if it were opened on this commit. * @deprecated use {@link #getGeneration} instead */	TokenNameCOMMENT_JAVADOC	 Returns the version for this IndexCommit. This is the same value that {@link IndexReader#getVersion} would return if it were opened on this commit. @deprecated use {@link #getGeneration} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the generation (the _N in segments_N) for this * IndexCommit */	TokenNameCOMMENT_JAVADOC	 Returns the generation (the _N in segments_N) for this IndexCommit 
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Convenience method that returns the last modified time * of the segments_N file corresponding to this index * commit, equivalent to * getDirectory().fileModified(getSegmentsFileName()). * @deprecated If you need to track commit time of * an index, you can store it in the commit data (see * {@link IndexWriter#commit(Map)} */	TokenNameCOMMENT_JAVADOC	 Convenience method that returns the last modified time of the segments_N file corresponding to this index commit, equivalent to getDirectory().fileModified(getSegmentsFileName()). @deprecated If you need to track commit time of an index, you can store it in the commit data (see {@link IndexWriter#commit(Map)} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getTimestamp	TokenNameIdentifier	 get Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fileModified	TokenNameIdentifier	 file Modified
(	TokenNameLPAREN	
getSegmentsFileName	TokenNameIdentifier	 get Segments File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns userData, previously passed to {@link * IndexWriter#commit(Map)} for this commit. Map is * String -> String. */	TokenNameCOMMENT_JAVADOC	 Returns userData, previously passed to {@link IndexWriter#commit(Map)} for this commit. Map is String -> String. 
public	TokenNamepublic	
abstract	TokenNameabstract	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getUserData	TokenNameIdentifier	 get User Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
IndexCommit	TokenNameIdentifier	 Index Commit
commit	TokenNameIdentifier	 commit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
commit	TokenNameIdentifier	 commit
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"cannot compare IndexCommits from different Directory instances"	TokenNameStringLiteral	cannot compare IndexCommits from different Directory instances
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
gen	TokenNameIdentifier	 gen
=	TokenNameEQUAL	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
comgen	TokenNameIdentifier	 comgen
=	TokenNameEQUAL	
commit	TokenNameIdentifier	 commit
.	TokenNameDOT	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gen	TokenNameIdentifier	 gen
<	TokenNameLESS	
comgen	TokenNameIdentifier	 comgen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
gen	TokenNameIdentifier	 gen
>	TokenNameGREATER	
comgen	TokenNameIdentifier	 comgen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
