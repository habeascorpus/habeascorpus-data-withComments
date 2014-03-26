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
/** * Reopen Perforce checkout files between changelists. * * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 Reopen Perforce checkout files between changelists. * @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
P4Reopen	TokenNameIdentifier	 P4 Reopen
extends	TokenNameextends	
P4Base	TokenNameIdentifier	 P4 Base
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toChange	TokenNameIdentifier	 to Change
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * The changelist to move files to; required. * @param toChange new change list number * @throws BuildException if the change parameter is null or empty */	TokenNameCOMMENT_JAVADOC	 The changelist to move files to; required. @param toChange new change list number @throws BuildException if the change parameter is null or empty 
public	TokenNamepublic	
void	TokenNamevoid	
setToChange	TokenNameIdentifier	 set To Change
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
toChange	TokenNameIdentifier	 to Change
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toChange	TokenNameIdentifier	 to Change
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
toChange	TokenNameIdentifier	 to Change
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
"P4Reopen: tochange cannot be null or empty"	TokenNameStringLiteral	P4Reopen: tochange cannot be null or empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
toChange	TokenNameIdentifier	 to Change
=	TokenNameEQUAL	
toChange	TokenNameIdentifier	 to Change
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * do the work * @throws BuildException if P4View is null */	TokenNameCOMMENT_JAVADOC	 do the work @throws BuildException if P4View is null 
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
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No view specified to reopen"	TokenNameStringLiteral	No view specified to reopen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
"-s reopen -c "	TokenNameStringLiteral	-s reopen -c 
+	TokenNamePLUS	
toChange	TokenNameIdentifier	 to Change
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
