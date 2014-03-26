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
Task	TokenNameIdentifier	 Task
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * Alters the default excludes for the <strong>entire</strong> build.. * * @since Ant 1.6 * * @ant.task category="utility" */	TokenNameCOMMENT_JAVADOC	 Alters the default excludes for the <strong>entire</strong> build.. * @since Ant 1.6 * @ant.task category="utility" 
public	TokenNamepublic	
class	TokenNameclass	
DefaultExcludes	TokenNameIdentifier	 Default Excludes
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
add	TokenNameIdentifier	 add
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
remove	TokenNameIdentifier	 remove
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
defaultrequested	TokenNameIdentifier	 defaultrequested
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
echo	TokenNameIdentifier	 echo
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// by default, messages are always displayed 	TokenNameCOMMENT_LINE	by default, messages are always displayed 
private	TokenNameprivate	
int	TokenNameint	
logLevel	TokenNameIdentifier	 log Level
=	TokenNameEQUAL	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
;	TokenNameSEMICOLON	
/** * Does the work. * * @exception BuildException if something goes wrong with the build */	TokenNameCOMMENT_JAVADOC	 Does the work. * @exception BuildException if something goes wrong with the build 
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
!	TokenNameNOT	
defaultrequested	TokenNameIdentifier	 defaultrequested
&&	TokenNameAND_AND	
add	TokenNameIdentifier	 add
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
remove	TokenNameIdentifier	 remove
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
echo	TokenNameIdentifier	 echo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"<defaultexcludes> task must set "	TokenNameStringLiteral	<defaultexcludes> task must set 
+	TokenNamePLUS	
"at least one attribute (echo="false""	TokenNameStringLiteral	at least one attribute (echo="false"
+	TokenNamePLUS	
" doesn't count since that is the default"	TokenNameStringLiteral	 doesn't count since that is the default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
defaultrequested	TokenNameIdentifier	 defaultrequested
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
.	TokenNameDOT	
resetDefaultExcludes	TokenNameIdentifier	 reset Default Excludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
add	TokenNameIdentifier	 add
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
.	TokenNameDOT	
addDefaultExclude	TokenNameIdentifier	 add Default Exclude
(	TokenNameLPAREN	
add	TokenNameIdentifier	 add
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
remove	TokenNameIdentifier	 remove
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
.	TokenNameDOT	
removeDefaultExclude	TokenNameIdentifier	 remove Default Exclude
(	TokenNameLPAREN	
remove	TokenNameIdentifier	 remove
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
echo	TokenNameIdentifier	 echo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"Current Default Excludes:"	TokenNameStringLiteral	Current Default Excludes:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
excludes	TokenNameIdentifier	 excludes
=	TokenNameEQUAL	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
.	TokenNameDOT	
getDefaultExcludes	TokenNameIdentifier	 get Default Excludes
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
excludes	TokenNameIdentifier	 excludes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
excludes	TokenNameIdentifier	 excludes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
logLevel	TokenNameIdentifier	 log Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * go back to standard default patterns * * @param def if true go back to default patterns */	TokenNameCOMMENT_JAVADOC	 go back to standard default patterns * @param def if true go back to default patterns 
public	TokenNamepublic	
void	TokenNamevoid	
setDefault	TokenNameIdentifier	 set Default
(	TokenNameLPAREN	
boolean	TokenNameboolean	
def	TokenNameIdentifier	 def
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultrequested	TokenNameIdentifier	 defaultrequested
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pattern to add to the default excludes * * @param add Sets the value for the pattern to exclude. */	TokenNameCOMMENT_JAVADOC	 Pattern to add to the default excludes * @param add Sets the value for the pattern to exclude. 
public	TokenNamepublic	
void	TokenNamevoid	
setAdd	TokenNameIdentifier	 set Add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
add	TokenNameIdentifier	 add
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
=	TokenNameEQUAL	
add	TokenNameIdentifier	 add
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pattern to remove from the default excludes. * * @param remove Sets the value for the pattern that * should no longer be excluded. */	TokenNameCOMMENT_JAVADOC	 Pattern to remove from the default excludes. * @param remove Sets the value for the pattern that should no longer be excluded. 
public	TokenNamepublic	
void	TokenNamevoid	
setRemove	TokenNameIdentifier	 set Remove
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
remove	TokenNameIdentifier	 remove
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
=	TokenNameEQUAL	
remove	TokenNameIdentifier	 remove
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, echo the default excludes. * * @param echo whether or not to echo the contents of * the default excludes. */	TokenNameCOMMENT_JAVADOC	 If true, echo the default excludes. * @param echo whether or not to echo the contents of the default excludes. 
public	TokenNamepublic	
void	TokenNamevoid	
setEcho	TokenNameIdentifier	 set Echo
(	TokenNameLPAREN	
boolean	TokenNameboolean	
echo	TokenNameIdentifier	 echo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
echo	TokenNameIdentifier	 echo
=	TokenNameEQUAL	
echo	TokenNameIdentifier	 echo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
