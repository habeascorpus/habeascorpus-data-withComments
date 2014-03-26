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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
FSDirectory	TokenNameIdentifier	 FS Directory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
/** * This is an easy-to-use tool that upgrades all segments of an index from previous Lucene versions * to the current segment file format. It can be used from command line: * <pre> * java -cp lucene-core.jar org.apache.lucene.index.IndexUpgrader [-delete-prior-commits] [-verbose] indexDir * </pre> * Alternatively this class can be instantiated and {@link #upgrade} invoked. It uses {@link UpgradeIndexMergePolicy} * and triggers the upgrade via an forceMerge request to {@link IndexWriter}. * <p>This tool keeps only the last commit in an index; for this * reason, if the incoming index has more than one commit, the tool * refuses to run by default. Specify {@code -delete-prior-commits} * to override this, allowing the tool to delete all but the last commit. * From Java code this can be enabled by passing {@code true} to * {@link #IndexUpgrader(Directory,Version,PrintStream,boolean)}. * <p><b>Warning:</b> This tool may reorder documents if the index was partially * upgraded before execution (e.g., documents were added). If your application relies * on &quot;monotonicity&quot; of doc IDs (which means that the order in which the documents * were added to the index is preserved), do a full forceMerge instead. * The {@link MergePolicy} set by {@link IndexWriterConfig} may also reorder * documents. */	TokenNameCOMMENT_JAVADOC	 This is an easy-to-use tool that upgrades all segments of an index from previous Lucene versions to the current segment file format. It can be used from command line: <pre> java -cp lucene-core.jar org.apache.lucene.index.IndexUpgrader [-delete-prior-commits] [-verbose] indexDir </pre> Alternatively this class can be instantiated and {@link #upgrade} invoked. It uses {@link UpgradeIndexMergePolicy} and triggers the upgrade via an forceMerge request to {@link IndexWriter}. <p>This tool keeps only the last commit in an index; for this reason, if the incoming index has more than one commit, the tool refuses to run by default. Specify {@code -delete-prior-commits} to override this, allowing the tool to delete all but the last commit. From Java code this can be enabled by passing {@code true} to {@link #IndexUpgrader(Directory,Version,PrintStream,boolean)}. <p><b>Warning:</b> This tool may reorder documents if the index was partially upgraded before execution (e.g., documents were added). If your application relies on &quot;monotonicity&quot; of doc IDs (which means that the order in which the documents were added to the index is preserved), do a full forceMerge instead. The {@link MergePolicy} set by {@link IndexWriterConfig} may also reorder documents. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
IndexUpgrader	TokenNameIdentifier	 Index Upgrader
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Upgrades an index so all segments created with a previous Lucene version are rewritten."	TokenNameStringLiteral	Upgrades an index so all segments created with a previous Lucene version are rewritten.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage:"	TokenNameStringLiteral	Usage:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" java "	TokenNameStringLiteral	 java 
+	TokenNamePLUS	
IndexUpgrader	TokenNameIdentifier	 Index Upgrader
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" [-delete-prior-commits] [-verbose] [-dir-impl X] indexDir"	TokenNameStringLiteral	 [-delete-prior-commits] [-verbose] [-dir-impl X] indexDir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"This tool keeps only the last commit in an index; for this"	TokenNameStringLiteral	This tool keeps only the last commit in an index; for this
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"reason, if the incoming index has more than one commit, the tool"	TokenNameStringLiteral	reason, if the incoming index has more than one commit, the tool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"refuses to run by default. Specify -delete-prior-commits to override"	TokenNameStringLiteral	refuses to run by default. Specify -delete-prior-commits to override
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"this, allowing the tool to delete all but the last commit."	TokenNameStringLiteral	this, allowing the tool to delete all but the last commit.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Specify a "	TokenNameStringLiteral	Specify a 
+	TokenNamePLUS	
FSDirectory	TokenNameIdentifier	 FS Directory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" implementation through the -dir-impl option to force its use. If no package is specified the "	TokenNameStringLiteral	 implementation through the -dir-impl option to force its use. If no package is specified the 
+	TokenNamePLUS	
FSDirectory	TokenNameIdentifier	 FS Directory
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
+	TokenNamePLUS	
" package will be used."	TokenNameStringLiteral	 package will be used.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WARNING: This tool may reorder document IDs!"	TokenNameStringLiteral	WARNING: This tool may reorder document IDs!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"deprecation"	TokenNameStringLiteral	deprecation
)	TokenNameRPAREN	
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
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
deletePriorCommits	TokenNameIdentifier	 delete Prior Commits
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dirImpl	TokenNameIdentifier	 dir Impl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"-delete-prior-commits"	TokenNameStringLiteral	-delete-prior-commits
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deletePriorCommits	TokenNameIdentifier	 delete Prior Commits
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"-verbose"	TokenNameStringLiteral	-verbose
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"-dir-impl"	TokenNameStringLiteral	-dir-impl
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ERROR: missing value for -dir-impl option"	TokenNameStringLiteral	ERROR: missing value for -dir-impl option
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
dirImpl	TokenNameIdentifier	 dir Impl
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dirImpl	TokenNameIdentifier	 dir Impl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
FSDirectory	TokenNameIdentifier	 FS Directory
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
newFSDirectory	TokenNameIdentifier	 new FS Directory
(	TokenNameLPAREN	
dirImpl	TokenNameIdentifier	 dir Impl
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
new	TokenNamenew	
IndexUpgrader	TokenNameIdentifier	 Index Upgrader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
deletePriorCommits	TokenNameIdentifier	 delete Prior Commits
)	TokenNameRPAREN	
.	TokenNameDOT	
upgrade	TokenNameIdentifier	 upgrade
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
infoStream	TokenNameIdentifier	 info Stream
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
iwc	TokenNameIdentifier	 iwc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
deletePriorCommits	TokenNameIdentifier	 delete Prior Commits
;	TokenNameSEMICOLON	
/** Creates index upgrader on the given directory, using an {@link IndexWriter} using the given * {@code matchVersion}. The tool refuses to upgrade indexes with multiple commit points. */	TokenNameCOMMENT_JAVADOC	 Creates index upgrader on the given directory, using an {@link IndexWriter} using the given {@code matchVersion}. The tool refuses to upgrade indexes with multiple commit points. 
public	TokenNamepublic	
IndexUpgrader	TokenNameIdentifier	 Index Upgrader
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
new	TokenNamenew	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates index upgrader on the given directory, using an {@link IndexWriter} using the given * {@code matchVersion}. You have the possibility to upgrade indexes with multiple commit points by removing * all older ones. If {@code infoStream} is not {@code null}, all logging output will be sent to this stream. */	TokenNameCOMMENT_JAVADOC	 Creates index upgrader on the given directory, using an {@link IndexWriter} using the given {@code matchVersion}. You have the possibility to upgrade indexes with multiple commit points by removing all older ones. If {@code infoStream} is not {@code null}, all logging output will be sent to this stream. 
public	TokenNamepublic	
IndexUpgrader	TokenNameIdentifier	 Index Upgrader
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
PrintStream	TokenNameIdentifier	 Print Stream
infoStream	TokenNameIdentifier	 info Stream
,	TokenNameCOMMA	
boolean	TokenNameboolean	
deletePriorCommits	TokenNameIdentifier	 delete Prior Commits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
new	TokenNamenew	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
matchVersion	TokenNameIdentifier	 match Version
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
infoStream	TokenNameIdentifier	 info Stream
,	TokenNameCOMMA	
deletePriorCommits	TokenNameIdentifier	 delete Prior Commits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates index upgrader on the given directory, using an {@link IndexWriter} using the given * config. You have the possibility to upgrade indexes with multiple commit points by removing * all older ones. If {@code infoStream} is not {@code null}, all logging output will be sent to this stream. */	TokenNameCOMMENT_JAVADOC	 Creates index upgrader on the given directory, using an {@link IndexWriter} using the given config. You have the possibility to upgrade indexes with multiple commit points by removing all older ones. If {@code infoStream} is not {@code null}, all logging output will be sent to this stream. 
public	TokenNamepublic	
IndexUpgrader	TokenNameIdentifier	 Index Upgrader
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
iwc	TokenNameIdentifier	 iwc
,	TokenNameCOMMA	
PrintStream	TokenNameIdentifier	 Print Stream
infoStream	TokenNameIdentifier	 info Stream
,	TokenNameCOMMA	
boolean	TokenNameboolean	
deletePriorCommits	TokenNameIdentifier	 delete Prior Commits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
iwc	TokenNameIdentifier	 iwc
=	TokenNameEQUAL	
iwc	TokenNameIdentifier	 iwc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
infoStream	TokenNameIdentifier	 info Stream
=	TokenNameEQUAL	
infoStream	TokenNameIdentifier	 info Stream
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
deletePriorCommits	TokenNameIdentifier	 delete Prior Commits
=	TokenNameEQUAL	
deletePriorCommits	TokenNameIdentifier	 delete Prior Commits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
upgrade	TokenNameIdentifier	 upgrade
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
indexExists	TokenNameIdentifier	 index Exists
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexNotFoundException	TokenNameIdentifier	 Index Not Found Exception
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
deletePriorCommits	TokenNameIdentifier	 delete Prior Commits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
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
if	TokenNameif	
(	TokenNameLPAREN	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"This tool was invoked to not delete prior commit points, but the following commits were found: "	TokenNameStringLiteral	This tool was invoked to not delete prior commit points, but the following commits were found: 
+	TokenNamePLUS	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
)	TokenNameRPAREN	
iwc	TokenNameIdentifier	 iwc
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
new	TokenNamenew	
UpgradeIndexMergePolicy	TokenNameIdentifier	 Upgrade Index Merge Policy
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getMergePolicy	TokenNameIdentifier	 get Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setIndexDeletionPolicy	TokenNameIdentifier	 set Index Deletion Policy
(	TokenNameLPAREN	
new	TokenNamenew	
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier	 Keep Only Last Commit Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexWriter	TokenNameIdentifier	 Index Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
setInfoStream	TokenNameIdentifier	 set Info Stream
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"Upgrading all pre-"	TokenNameStringLiteral	Upgrading all pre-
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
LUCENE_MAIN_VERSION	TokenNameIdentifier	 LUCENE  MAIN  VERSION
+	TokenNamePLUS	
" segments of index directory '"	TokenNameStringLiteral	 segments of index directory '
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
+	TokenNamePLUS	
"' to version "	TokenNameStringLiteral	' to version 
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
LUCENE_MAIN_VERSION	TokenNameIdentifier	 LUCENE  MAIN  VERSION
+	TokenNamePLUS	
"..."	TokenNameStringLiteral	...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"All segments upgraded to version "	TokenNameStringLiteral	All segments upgraded to version 
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
LUCENE_MAIN_VERSION	TokenNameIdentifier	 LUCENE  MAIN  VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
