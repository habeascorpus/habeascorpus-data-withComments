package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * An interface for implementations that support 2-phase commit. You can use * {@link TwoPhaseCommitTool} to execute a 2-phase commit algorithm over several * {@link TwoPhaseCommit}s. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An interface for implementations that support 2-phase commit. You can use {@link TwoPhaseCommitTool} to execute a 2-phase commit algorithm over several {@link TwoPhaseCommit}s. * @lucene.experimental 
public	TokenNamepublic	
interface	TokenNameinterface	
TwoPhaseCommit	TokenNameIdentifier	 Two Phase Commit
{	TokenNameLBRACE	
/** * The first stage of a 2-phase commit. Implementations should do as much work * as possible in this method, but avoid actual committing changes. If the * 2-phase commit fails, {@link #rollback()} is called to discard all changes * since last successful commit. */	TokenNameCOMMENT_JAVADOC	 The first stage of a 2-phase commit. Implementations should do as much work as possible in this method, but avoid actual committing changes. If the 2-phase commit fails, {@link #rollback()} is called to discard all changes since last successful commit. 
public	TokenNamepublic	
void	TokenNamevoid	
prepareCommit	TokenNameIdentifier	 prepare Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Like {@link #commit()}, but takes an additional commit data to be included * w/ the commit. * <p> * <b>NOTE:</b> some implementations may not support any custom data to be * included w/ the commit and may discard it altogether. Consult the actual * implementation documentation for verifying if this is supported. * * @see #prepareCommit() */	TokenNameCOMMENT_JAVADOC	 Like {@link #commit()}, but takes an additional commit data to be included w/ the commit. <p> <b>NOTE:</b> some implementations may not support any custom data to be included w/ the commit and may discard it altogether. Consult the actual implementation documentation for verifying if this is supported. * @see #prepareCommit() 
public	TokenNamepublic	
void	TokenNamevoid	
prepareCommit	TokenNameIdentifier	 prepare Commit
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
commitData	TokenNameIdentifier	 commit Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * The second phase of a 2-phase commit. Implementations should ideally do * very little work in this method (following {@link #prepareCommit()}, and * after it returns, the caller can assume that the changes were successfully * committed to the underlying storage. */	TokenNameCOMMENT_JAVADOC	 The second phase of a 2-phase commit. Implementations should ideally do very little work in this method (following {@link #prepareCommit()}, and after it returns, the caller can assume that the changes were successfully committed to the underlying storage. 
public	TokenNamepublic	
void	TokenNamevoid	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Like {@link #commit()}, but takes an additional commit data to be included * w/ the commit. * * @see #commit() * @see #prepareCommit(Map) */	TokenNameCOMMENT_JAVADOC	 Like {@link #commit()}, but takes an additional commit data to be included w/ the commit. * @see #commit() @see #prepareCommit(Map) 
public	TokenNamepublic	
void	TokenNamevoid	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
commitData	TokenNameIdentifier	 commit Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Discards any changes that have occurred since the last commit. In a 2-phase * commit algorithm, where one of the objects failed to {@link #commit()} or * {@link #prepareCommit()}, this method is used to roll all other objects * back to their previous state. */	TokenNameCOMMENT_JAVADOC	 Discards any changes that have occurred since the last commit. In a 2-phase commit algorithm, where one of the objects failed to {@link #commit()} or {@link #prepareCommit()}, this method is used to roll all other objects back to their previous state. 
public	TokenNamepublic	
void	TokenNamevoid	
rollback	TokenNameIdentifier	 rollback
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
