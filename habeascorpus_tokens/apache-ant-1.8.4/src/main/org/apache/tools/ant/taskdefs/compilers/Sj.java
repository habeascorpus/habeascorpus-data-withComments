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
compilers	TokenNameIdentifier	 compilers
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Commandline	TokenNameIdentifier	 Commandline
;	TokenNameSEMICOLON	
/** * The implementation of the sj compiler. * Uses the defaults for DefaultCompilerAdapter * * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 The implementation of the sj compiler. Uses the defaults for DefaultCompilerAdapter * @since Ant 1.4 
public	TokenNamepublic	
class	TokenNameclass	
Sj	TokenNameIdentifier	 Sj
extends	TokenNameextends	
DefaultCompilerAdapter	TokenNameIdentifier	 Default Compiler Adapter
{	TokenNameLBRACE	
/** * Performs a compile using the sj compiler from Symantec. * @return true if the compilation succeeded * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Performs a compile using the sj compiler from Symantec. @return true if the compilation succeeded @throws BuildException on error 
public	TokenNamepublic	
boolean	TokenNameboolean	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Using symantec java compiler"	TokenNameStringLiteral	Using symantec java compiler
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
setupJavacCommand	TokenNameIdentifier	 setup Javac Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
exec	TokenNameIdentifier	 exec
=	TokenNameEQUAL	
getJavac	TokenNameIdentifier	 get Javac
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExecutable	TokenNameIdentifier	 get Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
exec	TokenNameIdentifier	 exec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"sj"	TokenNameStringLiteral	sj
:	TokenNameCOLON	
exec	TokenNameIdentifier	 exec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstFileName	TokenNameIdentifier	 first File Name
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
compileList	TokenNameIdentifier	 compile List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
executeExternalCompile	TokenNameIdentifier	 execute External Compile
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
firstFileName	TokenNameIdentifier	 first File Name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns null since sj either has -g for debug=true or no * argument at all. * @return null. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Returns null since sj either has -g for debug=true or no argument at all. @return null. @since Ant 1.6.3 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getNoDebugArgument	TokenNameIdentifier	 get No Debug Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
