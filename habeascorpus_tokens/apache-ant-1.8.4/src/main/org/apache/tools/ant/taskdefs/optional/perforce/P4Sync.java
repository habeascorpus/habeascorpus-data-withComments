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
/** Synchronize client space to a Perforce depot view. * * The API allows additional functionality of the "p4 sync" command * (such as "p4 sync -f //...#have" or other exotic invocations).</P> * * <b>Example Usage:</b> * <table border="1"> * <th>Function</th><th>Command</th> * <tr><td>Sync to head using P4USER, P4PORT and P4CLIENT settings specified</td> * <td>&lt;P4Sync <br>P4view="//projects/foo/main/source/..." <br> * P4User="fbloggs" <br>P4Port="km01:1666" <br>P4Client="fbloggsclient" /&gt;</td></tr> * <tr><td>Sync to head using P4USER, P4PORT and P4CLIENT settings defined in environment</td> * <td>&lt;P4Sync P4view="//projects/foo/main/source/..." /&gt;</td></tr> * <tr><td>Force a re-sync to head, refreshing all files</td> * <td>&lt;P4Sync force="yes" P4view="//projects/foo/main/source/..." /&gt;</td></tr> * <tr><td>Sync to a label</td><td>&lt;P4Sync label="myPerforceLabel" /&gt;</td></tr> * </table> * * @todo Add decent label error handling for non-exsitant labels * * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 Synchronize client space to a Perforce depot view. * The API allows additional functionality of the "p4 sync" command (such as "p4 sync -f //...#have" or other exotic invocations).</P> * <b>Example Usage:</b> <table border="1"> <th>Function</th><th>Command</th> <tr><td>Sync to head using P4USER, P4PORT and P4CLIENT settings specified</td> <td>&lt;P4Sync <br>P4view="//projects/foo/main/source/..." <br> P4User="fbloggs" <br>P4Port="km01:1666" <br>P4Client="fbloggsclient" /&gt;</td></tr> <tr><td>Sync to head using P4USER, P4PORT and P4CLIENT settings defined in environment</td> <td>&lt;P4Sync P4view="//projects/foo/main/source/..." /&gt;</td></tr> <tr><td>Force a re-sync to head, refreshing all files</td> <td>&lt;P4Sync force="yes" P4view="//projects/foo/main/source/..." /&gt;</td></tr> <tr><td>Sync to a label</td><td>&lt;P4Sync label="myPerforceLabel" /&gt;</td></tr> </table> * @todo Add decent label error handling for non-exsitant labels * @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
P4Sync	TokenNameIdentifier	 P4 Sync
extends	TokenNameextends	
P4Base	TokenNameIdentifier	 P4 Base
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
syncCmd	TokenNameIdentifier	 sync Cmd
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Label to sync client to; optional. * @param label name of a label against which one want to sync * @throws BuildException if label is null or empty string */	TokenNameCOMMENT_JAVADOC	 Label to sync client to; optional. @param label name of a label against which one want to sync @throws BuildException if label is null or empty string 
public	TokenNamepublic	
void	TokenNamevoid	
setLabel	TokenNameIdentifier	 set Label
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"P4Sync: Labels cannot be Null or Empty"	TokenNameStringLiteral	P4Sync: Labels cannot be Null or Empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * force a refresh of files, if this attribute is set; false by default. * @param force sync all files, whether they are supposed to be already uptodate or not. * @throws BuildException if a label is set and force is null */	TokenNameCOMMENT_JAVADOC	 force a refresh of files, if this attribute is set; false by default. @param force sync all files, whether they are supposed to be already uptodate or not. @throws BuildException if a label is set and force is null 
public	TokenNamepublic	
void	TokenNamevoid	
setForce	TokenNameIdentifier	 set Force
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
force	TokenNameIdentifier	 force
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
force	TokenNameIdentifier	 force
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"P4Sync: If you want to force, set force to non-null string!"	TokenNameStringLiteral	P4Sync: If you want to force, set force to non-null string!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
"-f"	TokenNameStringLiteral	-f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * do the work * @throws BuildException if an error occurs during the execution of the Perforce command * and failOnError is set to true */	TokenNameCOMMENT_JAVADOC	 do the work @throws BuildException if an error occurs during the execution of the Perforce command and failOnError is set to true 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
P4View	TokenNameIdentifier	 P4 View
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
syncCmd	TokenNameIdentifier	 sync Cmd
=	TokenNameEQUAL	
P4View	TokenNameIdentifier	 P4 View
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
syncCmd	TokenNameIdentifier	 sync Cmd
=	TokenNameEQUAL	
syncCmd	TokenNameIdentifier	 sync Cmd
+	TokenNamePLUS	
"@"	TokenNameStringLiteral	@
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Execing sync "	TokenNameStringLiteral	Execing sync 
+	TokenNamePLUS	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
syncCmd	TokenNameIdentifier	 sync Cmd
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"-s sync "	TokenNameStringLiteral	-s sync 
+	TokenNamePLUS	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
syncCmd	TokenNameIdentifier	 sync Cmd
,	TokenNameCOMMA	
new	TokenNamenew	
SimpleP4OutputHandler	TokenNameIdentifier	 Simple P4 Output Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
