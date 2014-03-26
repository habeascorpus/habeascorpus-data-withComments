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
helper	TokenNameIdentifier	 helper
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
Executor	TokenNameIdentifier	 Executor
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
/** * Default Target executor implementation. Runs each target individually * (including all of its dependencies). If an error occurs, behavior is * determined by the Project's "keep-going" mode. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Default Target executor implementation. Runs each target individually (including all of its dependencies). If an error occurs, behavior is determined by the Project's "keep-going" mode. @since Ant 1.6.3 
public	TokenNamepublic	
class	TokenNameclass	
DefaultExecutor	TokenNameIdentifier	 Default Executor
implements	TokenNameimplements	
Executor	TokenNameIdentifier	 Executor
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
SingleCheckExecutor	TokenNameIdentifier	 Single Check Executor
SUB_EXECUTOR	TokenNameIdentifier	 SUB  EXECUTOR
=	TokenNameEQUAL	
new	TokenNamenew	
SingleCheckExecutor	TokenNameIdentifier	 Single Check Executor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
executeTargets	TokenNameIdentifier	 execute Targets
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targetNames	TokenNameIdentifier	 target Names
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
BuildException	TokenNameIdentifier	 Build Exception
thrownException	TokenNameIdentifier	 thrown Exception
=	TokenNameEQUAL	
null	TokenNamenull	
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
targetNames	TokenNameIdentifier	 target Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
targetNames	TokenNameIdentifier	 target Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
isKeepGoingMode	TokenNameIdentifier	 is Keep Going Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thrownException	TokenNameIdentifier	 thrown Exception
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
thrownException	TokenNameIdentifier	 thrown Exception
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
thrownException	TokenNameIdentifier	 thrown Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
Executor	TokenNameIdentifier	 Executor
getSubProjectExecutor	TokenNameIdentifier	 get Sub Project Executor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SUB_EXECUTOR	TokenNameIdentifier	 SUB  EXECUTOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
