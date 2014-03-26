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
/** * A utility for executing 2-phase commit on several objects. * * @see TwoPhaseCommit * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A utility for executing 2-phase commit on several objects. * @see TwoPhaseCommit @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TwoPhaseCommitTool	TokenNameIdentifier	 Two Phase Commit Tool
{	TokenNameLBRACE	
/** * A wrapper of a {@link TwoPhaseCommit}, which delegates all calls to the * wrapped object, passing the specified commitData. This object is useful for * use with {@link TwoPhaseCommitTool#execute(TwoPhaseCommit...)} if one would * like to store commitData as part of the commit. */	TokenNameCOMMENT_JAVADOC	 A wrapper of a {@link TwoPhaseCommit}, which delegates all calls to the wrapped object, passing the specified commitData. This object is useful for use with {@link TwoPhaseCommitTool#execute(TwoPhaseCommit...)} if one would like to store commitData as part of the commit. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
TwoPhaseCommitWrapper	TokenNameIdentifier	 Two Phase Commit Wrapper
implements	TokenNameimplements	
TwoPhaseCommit	TokenNameIdentifier	 Two Phase Commit
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
TwoPhaseCommit	TokenNameIdentifier	 Two Phase Commit
tpc	TokenNameIdentifier	 tpc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
commitData	TokenNameIdentifier	 commit Data
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TwoPhaseCommitWrapper	TokenNameIdentifier	 Two Phase Commit Wrapper
(	TokenNameLPAREN	
TwoPhaseCommit	TokenNameIdentifier	 Two Phase Commit
tpc	TokenNameIdentifier	 tpc
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
commitData	TokenNameIdentifier	 commit Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tpc	TokenNameIdentifier	 tpc
=	TokenNameEQUAL	
tpc	TokenNameIdentifier	 tpc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
commitData	TokenNameIdentifier	 commit Data
=	TokenNameEQUAL	
commitData	TokenNameIdentifier	 commit Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
prepareCommit	TokenNameIdentifier	 prepare Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
prepareCommit	TokenNameIdentifier	 prepare Commit
(	TokenNameLPAREN	
commitData	TokenNameIdentifier	 commit Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
tpc	TokenNameIdentifier	 tpc
.	TokenNameDOT	
prepareCommit	TokenNameIdentifier	 prepare Commit
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
commitData	TokenNameIdentifier	 commit Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
commitData	TokenNameIdentifier	 commit Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
tpc	TokenNameIdentifier	 tpc
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
commitData	TokenNameIdentifier	 commit Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
rollback	TokenNameIdentifier	 rollback
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
tpc	TokenNameIdentifier	 tpc
.	TokenNameDOT	
rollback	TokenNameIdentifier	 rollback
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Thrown by {@link TwoPhaseCommitTool#execute(TwoPhaseCommit...)} when an * object fails to prepareCommit(). */	TokenNameCOMMENT_JAVADOC	 Thrown by {@link TwoPhaseCommitTool#execute(TwoPhaseCommit...)} when an object fails to prepareCommit(). 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
PrepareCommitFailException	TokenNameIdentifier	 Prepare Commit Fail Exception
extends	TokenNameextends	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
PrepareCommitFailException	TokenNameIdentifier	 Prepare Commit Fail Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
TwoPhaseCommit	TokenNameIdentifier	 Two Phase Commit
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"prepareCommit() failed on "	TokenNameStringLiteral	prepareCommit() failed on 
+	TokenNamePLUS	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Thrown by {@link TwoPhaseCommitTool#execute(TwoPhaseCommit...)} when an * object fails to commit(). */	TokenNameCOMMENT_JAVADOC	 Thrown by {@link TwoPhaseCommitTool#execute(TwoPhaseCommit...)} when an object fails to commit(). 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
CommitFailException	TokenNameIdentifier	 Commit Fail Exception
extends	TokenNameextends	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
CommitFailException	TokenNameIdentifier	 Commit Fail Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
TwoPhaseCommit	TokenNameIdentifier	 Two Phase Commit
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"commit() failed on "	TokenNameStringLiteral	commit() failed on 
+	TokenNamePLUS	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** rollback all objects, discarding any exceptions that occur. */	TokenNameCOMMENT_JAVADOC	 rollback all objects, discarding any exceptions that occur. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
rollback	TokenNameIdentifier	 rollback
(	TokenNameLPAREN	
TwoPhaseCommit	TokenNameIdentifier	 Two Phase Commit
...	TokenNameELLIPSIS	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
TwoPhaseCommit	TokenNameIdentifier	 Two Phase Commit
tpc	TokenNameIdentifier	 tpc
:	TokenNameCOLON	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore any exception that occurs during rollback - we want to ensure 	TokenNameCOMMENT_LINE	ignore any exception that occurs during rollback - we want to ensure 
// all objects are rolled-back. 	TokenNameCOMMENT_LINE	all objects are rolled-back. 
if	TokenNameif	
(	TokenNameLPAREN	
tpc	TokenNameIdentifier	 tpc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
tpc	TokenNameIdentifier	 tpc
.	TokenNameDOT	
rollback	TokenNameIdentifier	 rollback
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Executes a 2-phase commit algorithm by first * {@link TwoPhaseCommit#prepareCommit()} all objects and only if all succeed, * it proceeds with {@link TwoPhaseCommit#commit()}. If any of the objects * fail on either the preparation or actual commit, it terminates and * {@link TwoPhaseCommit#rollback()} all of them. * <p> * <b>NOTE:</b> it may happen that an object fails to commit, after few have * already successfully committed. This tool will still issue a rollback * instruction on them as well, but depending on the implementation, it may * not have any effect. * <p> * <b>NOTE:</b> if any of the objects are {@code null}, this method simply * skips over them. * * @throws PrepareCommitFailException * if any of the objects fail to * {@link TwoPhaseCommit#prepareCommit()} * @throws CommitFailException * if any of the objects fail to {@link TwoPhaseCommit#commit()} */	TokenNameCOMMENT_JAVADOC	 Executes a 2-phase commit algorithm by first {@link TwoPhaseCommit#prepareCommit()} all objects and only if all succeed, it proceeds with {@link TwoPhaseCommit#commit()}. If any of the objects fail on either the preparation or actual commit, it terminates and {@link TwoPhaseCommit#rollback()} all of them. <p> <b>NOTE:</b> it may happen that an object fails to commit, after few have already successfully committed. This tool will still issue a rollback instruction on them as well, but depending on the implementation, it may not have any effect. <p> <b>NOTE:</b> if any of the objects are {@code null}, this method simply skips over them. * @throws PrepareCommitFailException if any of the objects fail to {@link TwoPhaseCommit#prepareCommit()} @throws CommitFailException if any of the objects fail to {@link TwoPhaseCommit#commit()} 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
TwoPhaseCommit	TokenNameIdentifier	 Two Phase Commit
...	TokenNameELLIPSIS	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
throws	TokenNamethrows	
PrepareCommitFailException	TokenNameIdentifier	 Prepare Commit Fail Exception
,	TokenNameCOMMA	
CommitFailException	TokenNameIdentifier	 Commit Fail Exception
{	TokenNameLBRACE	
TwoPhaseCommit	TokenNameIdentifier	 Two Phase Commit
tpc	TokenNameIdentifier	 tpc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// first, all should successfully prepareCommit() 	TokenNameCOMMENT_LINE	first, all should successfully prepareCommit() 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tpc	TokenNameIdentifier	 tpc
=	TokenNameEQUAL	
objects	TokenNameIdentifier	 objects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tpc	TokenNameIdentifier	 tpc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tpc	TokenNameIdentifier	 tpc
.	TokenNameDOT	
prepareCommit	TokenNameIdentifier	 prepare Commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first object that fails results in rollback all of them and 	TokenNameCOMMENT_LINE	first object that fails results in rollback all of them and 
// throwing an exception. 	TokenNameCOMMENT_LINE	throwing an exception. 
rollback	TokenNameIdentifier	 rollback
(	TokenNameLPAREN	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
PrepareCommitFailException	TokenNameIdentifier	 Prepare Commit Fail Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
tpc	TokenNameIdentifier	 tpc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If all successfully prepareCommit(), attempt the actual commit() 	TokenNameCOMMENT_LINE	If all successfully prepareCommit(), attempt the actual commit() 
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tpc	TokenNameIdentifier	 tpc
=	TokenNameEQUAL	
objects	TokenNameIdentifier	 objects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tpc	TokenNameIdentifier	 tpc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tpc	TokenNameIdentifier	 tpc
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first object that fails results in rollback all of them and 	TokenNameCOMMENT_LINE	first object that fails results in rollback all of them and 
// throwing an exception. 	TokenNameCOMMENT_LINE	throwing an exception. 
rollback	TokenNameIdentifier	 rollback
(	TokenNameLPAREN	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
CommitFailException	TokenNameIdentifier	 Commit Fail Exception
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
tpc	TokenNameIdentifier	 tpc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
