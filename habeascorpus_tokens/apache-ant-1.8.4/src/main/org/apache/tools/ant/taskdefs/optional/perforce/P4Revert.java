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
/** * Revert Perforce open files or files in a changelist * * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 Revert Perforce open files or files in a changelist * @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
P4Revert	TokenNameIdentifier	 P4 Revert
extends	TokenNameextends	
P4Base	TokenNameIdentifier	 P4 Base
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
revertChange	TokenNameIdentifier	 revert Change
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
onlyUnchanged	TokenNameIdentifier	 only Unchanged
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The changelist to revert; optional. * @param revertChange : the change list to revert * @throws BuildException if the change list is null or empty string */	TokenNameCOMMENT_JAVADOC	 The changelist to revert; optional. @param revertChange : the change list to revert @throws BuildException if the change list is null or empty string 
public	TokenNamepublic	
void	TokenNamevoid	
setChange	TokenNameIdentifier	 set Change
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
revertChange	TokenNameIdentifier	 revert Change
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
revertChange	TokenNameIdentifier	 revert Change
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
revertChange	TokenNameIdentifier	 revert Change
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
"P4Revert: change cannot be null or empty"	TokenNameStringLiteral	P4Revert: change cannot be null or empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
revertChange	TokenNameIdentifier	 revert Change
=	TokenNameEQUAL	
revertChange	TokenNameIdentifier	 revert Change
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * flag to revert only unchanged files (p4 revert -a); optional, default false. * @param onlyUnchanged if set to true revert only unchanged files */	TokenNameCOMMENT_JAVADOC	 flag to revert only unchanged files (p4 revert -a); optional, default false. @param onlyUnchanged if set to true revert only unchanged files 
public	TokenNamepublic	
void	TokenNamevoid	
setRevertOnlyUnchanged	TokenNameIdentifier	 set Revert Only Unchanged
(	TokenNameLPAREN	
boolean	TokenNameboolean	
onlyUnchanged	TokenNameIdentifier	 only Unchanged
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
onlyUnchanged	TokenNameIdentifier	 only Unchanged
=	TokenNameEQUAL	
onlyUnchanged	TokenNameIdentifier	 only Unchanged
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * do the work * @throws BuildException if an error occurs during the execution of the Perforce command * and failonError is set to true */	TokenNameCOMMENT_JAVADOC	 do the work @throws BuildException if an error occurs during the execution of the Perforce command and failonError is set to true 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
/* Here we can either revert any unchanged files in a changelist * or * any files regardless of whether they have been changed or not * * * The whole process also accepts a p4 filespec */	TokenNameCOMMENT_BLOCK	 Here we can either revert any unchanged files in a changelist or any files regardless of whether they have been changed or not * The whole process also accepts a p4 filespec 
String	TokenNameIdentifier	 String
p4cmd	TokenNameIdentifier	 p4cmd
=	TokenNameEQUAL	
"-s revert"	TokenNameStringLiteral	-s revert
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
onlyUnchanged	TokenNameIdentifier	 only Unchanged
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p4cmd	TokenNameIdentifier	 p4cmd
+=	TokenNamePLUS_EQUAL	
" -a"	TokenNameStringLiteral	 -a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
revertChange	TokenNameIdentifier	 revert Change
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p4cmd	TokenNameIdentifier	 p4cmd
+=	TokenNamePLUS_EQUAL	
" -c "	TokenNameStringLiteral	 -c 
+	TokenNamePLUS	
revertChange	TokenNameIdentifier	 revert Change
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
p4cmd	TokenNameIdentifier	 p4cmd
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
P4View	TokenNameIdentifier	 P4 View
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
