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
/** * Open file(s) for edit. * P4Change should be used to obtain a new changelist for P4Edit as, * although P4Edit can open files to the default change, * P4Submit cannot yet submit to it. * Example Usage:<br> * &lt;p4edit change="${p4.change}" view="//depot/project/foo.txt" /&gt; * * @todo Should call reopen if file is already open in one of our changelists perhaps? * * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 Open file(s) for edit. P4Change should be used to obtain a new changelist for P4Edit as, although P4Edit can open files to the default change, P4Submit cannot yet submit to it. Example Usage:<br> &lt;p4edit change="${p4.change}" view="//depot/project/foo.txt" /&gt; * @todo Should call reopen if file is already open in one of our changelists perhaps? * @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
P4Edit	TokenNameIdentifier	 P4 Edit
extends	TokenNameextends	
P4Base	TokenNameIdentifier	 P4 Base
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * number of the change list to work on */	TokenNameCOMMENT_JAVADOC	 number of the change list to work on 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
change	TokenNameIdentifier	 change
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * An existing changelist number to assign files to; optional * but strongly recommended. * @param change the change list number */	TokenNameCOMMENT_JAVADOC	 An existing changelist number to assign files to; optional but strongly recommended. @param change the change list number 
public	TokenNamepublic	
void	TokenNamevoid	
setChange	TokenNameIdentifier	 set Change
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
change	TokenNameIdentifier	 change
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
change	TokenNameIdentifier	 change
=	TokenNameEQUAL	
change	TokenNameIdentifier	 change
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Run the p4 edit command * @throws BuildException if there is no view specified */	TokenNameCOMMENT_JAVADOC	 Run the p4 edit command @throws BuildException if there is no view specified 
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
change	TokenNameIdentifier	 change
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
=	TokenNameEQUAL	
"-c "	TokenNameStringLiteral	-c 
+	TokenNamePLUS	
change	TokenNameIdentifier	 change
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
P4View	TokenNameIdentifier	 P4 View
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No view specified to edit"	TokenNameStringLiteral	No view specified to edit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"-s edit "	TokenNameStringLiteral	-s edit 
+	TokenNamePLUS	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
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
