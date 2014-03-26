/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
/** Checkout files for deletion. * * Example Usage:<br> * &lt;p4delete change="${p4.change}" view="//depot/project/foo.txt" /&gt;<br> * * Simple re-write of P4Edit changing 'edit' to 'delete'.<br> * * @todo What to do if file is already open in one of our changelists perhaps * (See also {@link P4Edit P4Edit})?<br> * * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 Checkout files for deletion. * Example Usage:<br> &lt;p4delete change="${p4.change}" view="//depot/project/foo.txt" /&gt;<br> * Simple re-write of P4Edit changing 'edit' to 'delete'.<br> * @todo What to do if file is already open in one of our changelists perhaps (See also {@link P4Edit P4Edit})?<br> * @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
P4Delete	TokenNameIdentifier	 P4 Delete
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
/** * An existing changelist number for the deletion; optional * but strongly recommended. * @param change the number of a change list */	TokenNameCOMMENT_JAVADOC	 An existing changelist number for the deletion; optional but strongly recommended. @param change the number of a change list 
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
/** * executes the p4 delete task * @throws BuildException if there is no view specified */	TokenNameCOMMENT_JAVADOC	 executes the p4 delete task @throws BuildException if there is no view specified 
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
"No view specified to delete"	TokenNameStringLiteral	No view specified to delete
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"-s delete "	TokenNameStringLiteral	-s delete 
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
