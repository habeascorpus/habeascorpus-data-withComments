/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * Task to rename files based on extension. This task has the following * properties which can be set: * <ul> * <li>fromExtension: </li> * <li>toExtension: </li> * <li>srcDir: </li> * <li>replace: </li> * </ul> */	TokenNameCOMMENT_BLOCK	 Task to rename files based on extension. This task has the following properties which can be set: <ul> <li>fromExtension: </li> <li>toExtension: </li> <li>srcDir: </li> <li>replace: </li> </ul> 
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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
MatchingTask	TokenNameIdentifier	 Matching Task
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
Move	TokenNameIdentifier	 Move
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
Mapper	TokenNameIdentifier	 Mapper
;	TokenNameSEMICOLON	
/** * * @version 1.2 * * @deprecated since 1.5.x. * Use &lt;move&gt; instead */	TokenNameCOMMENT_JAVADOC	 * @version 1.2 * @deprecated since 1.5.x. Use &lt;move&gt; instead 
public	TokenNamepublic	
class	TokenNameclass	
RenameExtensions	TokenNameIdentifier	 Rename Extensions
extends	TokenNameextends	
MatchingTask	TokenNameIdentifier	 Matching Task
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fromExtension	TokenNameIdentifier	 from Extension
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toExtension	TokenNameIdentifier	 to Extension
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
replace	TokenNameIdentifier	 replace
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
srcDir	TokenNameIdentifier	 src Dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
globType	TokenNameIdentifier	 glob Type
;	TokenNameSEMICOLON	
/** Creates new RenameExtensions */	TokenNameCOMMENT_JAVADOC	 Creates new RenameExtensions 
public	TokenNamepublic	
RenameExtensions	TokenNameIdentifier	 Rename Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
globType	TokenNameIdentifier	 glob Type
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
globType	TokenNameIdentifier	 glob Type
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"glob"	TokenNameStringLiteral	glob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The string that files must end in to be renamed * * @param from the extension of files being renamed. */	TokenNameCOMMENT_JAVADOC	 The string that files must end in to be renamed * @param from the extension of files being renamed. 
public	TokenNamepublic	
void	TokenNamevoid	
setFromExtension	TokenNameIdentifier	 set From Extension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fromExtension	TokenNameIdentifier	 from Extension
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The string that renamed files will end with on * completion * * @param to the extension of the renamed files. */	TokenNameCOMMENT_JAVADOC	 The string that renamed files will end with on completion * @param to the extension of the renamed files. 
public	TokenNamepublic	
void	TokenNamevoid	
setToExtension	TokenNameIdentifier	 set To Extension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toExtension	TokenNameIdentifier	 to Extension
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * store replace attribute - this determines whether the target file * should be overwritten if present * * @param replace if true overwrite any target files that exist. */	TokenNameCOMMENT_JAVADOC	 store replace attribute - this determines whether the target file should be overwritten if present * @param replace if true overwrite any target files that exist. 
public	TokenNamepublic	
void	TokenNamevoid	
setReplace	TokenNameIdentifier	 set Replace
(	TokenNameLPAREN	
boolean	TokenNameboolean	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
=	TokenNameEQUAL	
replace	TokenNameIdentifier	 replace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the source dir to find the files to be renamed. * * @param srcDir the source directory. */	TokenNameCOMMENT_JAVADOC	 Set the source dir to find the files to be renamed. * @param srcDir the source directory. 
public	TokenNamepublic	
void	TokenNamevoid	
setSrcDir	TokenNameIdentifier	 set Src Dir
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
srcDir	TokenNameIdentifier	 src Dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
srcDir	TokenNameIdentifier	 src Dir
=	TokenNameEQUAL	
srcDir	TokenNameIdentifier	 src Dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Executes the task. * * @throws BuildException is there is a problem in the task execution. */	TokenNameCOMMENT_JAVADOC	 Executes the task. * @throws BuildException is there is a problem in the task execution. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
// first off, make sure that we've got a from and to extension 	TokenNameCOMMENT_LINE	first off, make sure that we've got a from and to extension 
if	TokenNameif	
(	TokenNameLPAREN	
fromExtension	TokenNameIdentifier	 from Extension
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
toExtension	TokenNameIdentifier	 to Extension
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
srcDir	TokenNameIdentifier	 src Dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"srcDir, fromExtension and toExtension "	TokenNameStringLiteral	srcDir, fromExtension and toExtension 
+	TokenNamePLUS	
"attributes must be set!"	TokenNameStringLiteral	attributes must be set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"DEPRECATED - The renameext task is deprecated. Use move instead."	TokenNameStringLiteral	DEPRECATED - The renameext task is deprecated. Use move instead.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Replace this with:"	TokenNameStringLiteral	Replace this with:
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"<move todir=""	TokenNameStringLiteral	<move todir="
+	TokenNamePLUS	
srcDir	TokenNameIdentifier	 src Dir
+	TokenNamePLUS	
"" overwrite=""	TokenNameStringLiteral	" overwrite="
+	TokenNamePLUS	
replace	TokenNameIdentifier	 replace
+	TokenNamePLUS	
"">"	TokenNameStringLiteral	">
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
" <fileset dir=""	TokenNameStringLiteral	 <fileset dir="
+	TokenNamePLUS	
srcDir	TokenNameIdentifier	 src Dir
+	TokenNamePLUS	
"" />"	TokenNameStringLiteral	" />
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
" <mapper type="glob""	TokenNameStringLiteral	 <mapper type="glob"
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
" from="*"	TokenNameStringLiteral	 from="*
+	TokenNamePLUS	
fromExtension	TokenNameIdentifier	 from Extension
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
" to="*"	TokenNameStringLiteral	 to="*
+	TokenNamePLUS	
toExtension	TokenNameIdentifier	 to Extension
+	TokenNamePLUS	
"" />"	TokenNameStringLiteral	" />
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"</move>"	TokenNameStringLiteral	</move>
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"using the same patterns on <fileset> as you've used here"	TokenNameStringLiteral	using the same patterns on <fileset> as you've used here
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Move	TokenNameIdentifier	 Move
move	TokenNameIdentifier	 move
=	TokenNameEQUAL	
new	TokenNamenew	
Move	TokenNameIdentifier	 Move
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
move	TokenNameIdentifier	 move
.	TokenNameDOT	
bindToOwner	TokenNameIdentifier	 bind To Owner
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
move	TokenNameIdentifier	 move
.	TokenNameDOT	
setOwningTarget	TokenNameIdentifier	 set Owning Target
(	TokenNameLPAREN	
getOwningTarget	TokenNameIdentifier	 get Owning Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
move	TokenNameIdentifier	 move
.	TokenNameDOT	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
move	TokenNameIdentifier	 move
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
move	TokenNameIdentifier	 move
.	TokenNameDOT	
setTodir	TokenNameIdentifier	 set Todir
(	TokenNameLPAREN	
srcDir	TokenNameIdentifier	 src Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
move	TokenNameIdentifier	 move
.	TokenNameDOT	
setOverwrite	TokenNameIdentifier	 set Overwrite
(	TokenNameLPAREN	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
srcDir	TokenNameIdentifier	 src Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
move	TokenNameIdentifier	 move
.	TokenNameDOT	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mapper	TokenNameIdentifier	 Mapper
me	TokenNameIdentifier	 me
=	TokenNameEQUAL	
move	TokenNameIdentifier	 move
.	TokenNameDOT	
createMapper	TokenNameIdentifier	 create Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
me	TokenNameIdentifier	 me
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
globType	TokenNameIdentifier	 glob Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
me	TokenNameIdentifier	 me
.	TokenNameDOT	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
+	TokenNamePLUS	
fromExtension	TokenNameIdentifier	 from Extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
me	TokenNameIdentifier	 me
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
+	TokenNamePLUS	
toExtension	TokenNameIdentifier	 to Extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
move	TokenNameIdentifier	 move
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
