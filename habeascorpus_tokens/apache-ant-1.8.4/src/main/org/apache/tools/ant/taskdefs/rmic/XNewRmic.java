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
rmic	TokenNameIdentifier	 rmic
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
/** * Run rmic in a new process with -Xnew set. * This switches rmic to use a new compiler, one that doesnt work in-process * on ant on java1.6. * see: <a href="http://issues.apache.org/bugzilla/show_bug.cgi?id=38732"> * http://issues.apache.org/bugzilla/show_bug.cgi?id=38732</a> */	TokenNameCOMMENT_JAVADOC	 Run rmic in a new process with -Xnew set. This switches rmic to use a new compiler, one that doesnt work in-process on ant on java1.6. see: <a href="http://issues.apache.org/bugzilla/show_bug.cgi?id=38732"> http://issues.apache.org/bugzilla/show_bug.cgi?id=38732</a> 
public	TokenNamepublic	
class	TokenNameclass	
XNewRmic	TokenNameIdentifier	 X New Rmic
extends	TokenNameextends	
ForkingSunRmic	TokenNameIdentifier	 Forking Sun Rmic
{	TokenNameLBRACE	
/** * the name of this adapter for users to select */	TokenNameCOMMENT_JAVADOC	 the name of this adapter for users to select 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPILER_NAME	TokenNameIdentifier	 COMPILER  NAME
=	TokenNameEQUAL	
"xnew"	TokenNameStringLiteral	xnew
;	TokenNameSEMICOLON	
/** No-arg constructor. */	TokenNameCOMMENT_JAVADOC	 No-arg constructor. 
public	TokenNamepublic	
XNewRmic	TokenNameIdentifier	 X New Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Create a normal command line, then with -Xnew at the front * @return a command line that hands off to thw */	TokenNameCOMMENT_JAVADOC	 Create a normal command line, then with -Xnew at the front @return a command line that hands off to thw 
protected	TokenNameprotected	
Commandline	TokenNameIdentifier	 Commandline
setupRmicCommand	TokenNameIdentifier	 setup Rmic Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"-Xnew"	TokenNameStringLiteral	-Xnew
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Commandline	TokenNameIdentifier	 Commandline
commandline	TokenNameIdentifier	 commandline
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
setupRmicCommand	TokenNameIdentifier	 setup Rmic Command
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
commandline	TokenNameIdentifier	 commandline
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
