/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * Portions of this software are based upon public domain software * originally written at the National Center for Supercomputing Applications, * University of Illinois, Urbana-Champaign. */	TokenNameCOMMENT_BLOCK	 Portions of this software are based upon public domain software originally written at the National Center for Supercomputing Applications, University of Illinois, Urbana-Champaign. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
perforce	TokenNameIdentifier	 perforce
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
FileSet	TokenNameIdentifier	 File Set
;	TokenNameSEMICOLON	
/** * P4Fstat--find out which files are under Perforce control and which are not. * * <br><b>Example Usage:</b><br> * <pre> * &lt;project name=&quot;p4fstat&quot; default=&quot;p4fstat&quot; * basedir=&quot;C:\dev\gnu&quot;&gt; * &lt;target name=&quot;p4fstat&quot; &gt; * &lt;p4fstat showfilter=&quot;all&quot;&gt; * &lt;fileset dir=&quot;depot&quot; includes=&quot;**\/*&quot;/&gt; * &lt;/p4fstat&gt; * &lt;/target&gt; * &lt;/project&gt; * </pre> * * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 P4Fstat--find out which files are under Perforce control and which are not. * <br><b>Example Usage:</b><br> <pre> &lt;project name=&quot;p4fstat&quot; default=&quot;p4fstat&quot; basedir=&quot;C:\dev\gnu&quot;&gt; &lt;target name=&quot;p4fstat&quot; &gt; &lt;p4fstat showfilter=&quot;all&quot;&gt; &lt;fileset dir=&quot;depot&quot; includes=&quot;**\/*&quot;/&gt; &lt;/p4fstat&gt; &lt;/target&gt; &lt;/project&gt; </pre> * @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
P4Fstat	TokenNameIdentifier	 P4 Fstat
extends	TokenNameextends	
P4Base	TokenNameIdentifier	 P4 Base
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
changelist	TokenNameIdentifier	 changelist
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
addCmd	TokenNameIdentifier	 add Cmd
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
filesets	TokenNameIdentifier	 filesets
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_CMD_LENGTH	TokenNameIdentifier	 DEFAULT  CMD  LENGTH
=	TokenNameEQUAL	
300	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
cmdLength	TokenNameIdentifier	 cmd Length
=	TokenNameEQUAL	
DEFAULT_CMD_LENGTH	TokenNameIdentifier	 DEFAULT  CMD  LENGTH
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_EXISTING	TokenNameIdentifier	 SHOW  EXISTING
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHOW_NON_EXISTING	TokenNameIdentifier	 SHOW  NON  EXISTING
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
show	TokenNameIdentifier	 show
=	TokenNameEQUAL	
SHOW_NON_EXISTING	TokenNameIdentifier	 SHOW  NON  EXISTING
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FStatP4OutputHandler	TokenNameIdentifier	 F Stat P4 Output Handler
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
filelist	TokenNameIdentifier	 filelist
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fileNum	TokenNameIdentifier	 file Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
doneFileNum	TokenNameIdentifier	 done File Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXISTING_HEADER	TokenNameIdentifier	 EXISTING  HEADER
=	TokenNameEQUAL	
"Following files exist in perforce"	TokenNameStringLiteral	Following files exist in perforce
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NONEXISTING_HEADER	TokenNameIdentifier	 NONEXISTING  HEADER
=	TokenNameEQUAL	
"Following files do not exist in perforce"	TokenNameStringLiteral	Following files do not exist in perforce
;	TokenNameSEMICOLON	
/** * Sets the filter that one wants applied. * <table> * <tr><th>Option</th><th>Meaning</th></tr> * <tr><td>all</td><td>all files under Perforce control or not</td></tr> * <tr><td>existing</td><td>only files under Perforce control</td></tr> * <tr><td>non-existing</td><td>only files not under Perforce control or not</td></tr> * </table> * @param filter should be one of all|existing|non-existing. */	TokenNameCOMMENT_JAVADOC	 Sets the filter that one wants applied. <table> <tr><th>Option</th><th>Meaning</th></tr> <tr><td>all</td><td>all files under Perforce control or not</td></tr> <tr><td>existing</td><td>only files under Perforce control</td></tr> <tr><td>non-existing</td><td>only files not under Perforce control or not</td></tr> </table> @param filter should be one of all|existing|non-existing. 
public	TokenNamepublic	
void	TokenNamevoid	
setShowFilter	TokenNameIdentifier	 set Show Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"all"	TokenNameStringLiteral	all
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
show	TokenNameIdentifier	 show
=	TokenNameEQUAL	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"existing"	TokenNameStringLiteral	existing
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
show	TokenNameIdentifier	 show
=	TokenNameEQUAL	
SHOW_EXISTING	TokenNameIdentifier	 SHOW  EXISTING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"non-existing"	TokenNameStringLiteral	non-existing
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
show	TokenNameIdentifier	 show
=	TokenNameEQUAL	
SHOW_NON_EXISTING	TokenNameIdentifier	 SHOW  NON  EXISTING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"P4Fstat: ShowFilter should be one of: "	TokenNameStringLiteral	P4Fstat: ShowFilter should be one of: 
+	TokenNamePLUS	
"all, existing, non-existing"	TokenNameStringLiteral	all, existing, non-existing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets optionally a change list number. * @param changelist change list that one wants information about. * @throws BuildException if the change list number is negative. */	TokenNameCOMMENT_JAVADOC	 Sets optionally a change list number. @param changelist change list that one wants information about. @throws BuildException if the change list number is negative. 
public	TokenNamepublic	
void	TokenNamevoid	
setChangelist	TokenNameIdentifier	 set Changelist
(	TokenNameLPAREN	
int	TokenNameint	
changelist	TokenNameIdentifier	 changelist
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
changelist	TokenNameIdentifier	 changelist
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"P4FStat: Changelist# should be a "	TokenNameStringLiteral	P4FStat: Changelist# should be a 
+	TokenNamePLUS	
"positive number"	TokenNameStringLiteral	positive number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
changelist	TokenNameIdentifier	 changelist
=	TokenNameEQUAL	
changelist	TokenNameIdentifier	 changelist
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a fileset to be examined by p4fstat. * @param set the fileset to add. */	TokenNameCOMMENT_JAVADOC	 Adds a fileset to be examined by p4fstat. @param set the fileset to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Executes the p4fstat task. * @throws BuildException if no files are specified. */	TokenNameCOMMENT_JAVADOC	 Executes the p4fstat task. @throws BuildException if no files are specified. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
new	TokenNamenew	
FStatP4OutputHandler	TokenNameIdentifier	 F Stat P4 Output Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
P4View	TokenNameIdentifier	 P4 View
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addCmd	TokenNameIdentifier	 add Cmd
=	TokenNameEQUAL	
P4View	TokenNameIdentifier	 P4 View
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
changelist	TokenNameIdentifier	 changelist
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
"-c "	TokenNameStringLiteral	-c 
+	TokenNamePLUS	
changelist	TokenNameIdentifier	 changelist
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
filelist	TokenNameIdentifier	 filelist
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileSet	TokenNameIdentifier	 File Set
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
getDirectoryScanner	TokenNameIdentifier	 get Directory Scanner
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcFiles	TokenNameIdentifier	 src Files
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcFiles	TokenNameIdentifier	 src Files
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileNum	TokenNameIdentifier	 file Num
=	TokenNameEQUAL	
srcFiles	TokenNameIdentifier	 src Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
srcFiles	TokenNameIdentifier	 src Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
srcFiles	TokenNameIdentifier	 src Files
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filelist	TokenNameIdentifier	 filelist
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doneFileNum	TokenNameIdentifier	 done File Num
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filelist	TokenNameIdentifier	 filelist
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
cmdLength	TokenNameIdentifier	 cmd Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
execP4Fstat	TokenNameIdentifier	 exec P4 Fstat
(	TokenNameLPAREN	
filelist	TokenNameIdentifier	 filelist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filelist	TokenNameIdentifier	 filelist
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filelist	TokenNameIdentifier	 filelist
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
execP4Fstat	TokenNameIdentifier	 exec P4 Fstat
(	TokenNameLPAREN	
filelist	TokenNameIdentifier	 filelist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"No files specified to query status on!"	TokenNameStringLiteral	No files specified to query status on!
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
show	TokenNameIdentifier	 show
==	TokenNameEQUAL_EQUAL	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
||	TokenNameOR_OR	
show	TokenNameIdentifier	 show
==	TokenNameEQUAL_EQUAL	
SHOW_EXISTING	TokenNameIdentifier	 SHOW  EXISTING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printRes	TokenNameIdentifier	 print Res
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getExisting	TokenNameIdentifier	 get Existing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
EXISTING_HEADER	TokenNameIdentifier	 EXISTING  HEADER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
show	TokenNameIdentifier	 show
==	TokenNameEQUAL_EQUAL	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
||	TokenNameOR_OR	
show	TokenNameIdentifier	 show
==	TokenNameEQUAL_EQUAL	
SHOW_NON_EXISTING	TokenNameIdentifier	 SHOW  NON  EXISTING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printRes	TokenNameIdentifier	 print Res
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getNonExisting	TokenNameIdentifier	 get Non Existing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
NONEXISTING_HEADER	TokenNameIdentifier	 NONEXISTING  HEADER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the number of files seen. * @return the number of files seen. */	TokenNameCOMMENT_JAVADOC	 Return the number of files seen. @return the number of files seen. 
public	TokenNamepublic	
int	TokenNameint	
getLengthOfTask	TokenNameIdentifier	 get Length Of Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fileNum	TokenNameIdentifier	 file Num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the number of passes to make. * IS THIS BEING USED? * @return number of passes (how many filesets). */	TokenNameCOMMENT_JAVADOC	 Return the number of passes to make. IS THIS BEING USED? @return number of passes (how many filesets). 
int	TokenNameint	
getPasses	TokenNameIdentifier	 get Passes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
printRes	TokenNameIdentifier	 print Res
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
ar	TokenNameIdentifier	 ar
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
execP4Fstat	TokenNameIdentifier	 exec P4 Fstat
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Executing fstat "	TokenNameStringLiteral	Executing fstat 
+	TokenNamePLUS	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
addCmd	TokenNameIdentifier	 add Cmd
+	TokenNamePLUS	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"fstat "	TokenNameStringLiteral	fstat 
+	TokenNamePLUS	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
addCmd	TokenNameIdentifier	 add Cmd
+	TokenNamePLUS	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
