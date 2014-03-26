/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * Since the initial version of this file was deveolped on the clock on * an NSF grant I should say the following boilerplate: * * This material is based upon work supported by the National Science * Foundaton under Grant No. EIA-0196404. Any opinions, findings, and * conclusions or recommendations expressed in this material are those * of the author and do not necessarily reflect the views of the * National Science Foundation. */	TokenNameCOMMENT_BLOCK	 Since the initial version of this file was deveolped on the clock on an NSF grant I should say the following boilerplate: * This material is based upon work supported by the National Science Foundaton under Grant No. EIA-0196404. Any opinions, findings, and conclusions or recommendations expressed in this material are those of the author and do not necessarily reflect the views of the National Science Foundation. 
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
unix	TokenNameIdentifier	 unix
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
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
FileSet	TokenNameIdentifier	 File Set
;	TokenNameSEMICOLON	
/** * @since Ant 1.6 * * @ant.task category="filesystem" */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.6 * @ant.task category="filesystem" 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractAccessTask	TokenNameIdentifier	 Abstract Access Task
extends	TokenNameextends	
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
ExecuteOn	TokenNameIdentifier	 Execute On
{	TokenNameLBRACE	
/** * Chmod task for setting file and directory permissions. */	TokenNameCOMMENT_JAVADOC	 Chmod task for setting file and directory permissions. 
public	TokenNamepublic	
AbstractAccessTask	TokenNameIdentifier	 Abstract Access Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setParallel	TokenNameIdentifier	 set Parallel
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setSkipEmptyFilesets	TokenNameIdentifier	 set Skip Empty Filesets
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the file which should have its access attributes modified. * @param src the file to modify */	TokenNameCOMMENT_JAVADOC	 Set the file which should have its access attributes modified. @param src the file to modify 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileSet	TokenNameIdentifier	 File Set
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
new	TokenNamenew	
FileSet	TokenNameIdentifier	 File Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prevent the user from specifying a different command. * * @ant.attribute ignore="true" * @param cmdl A user supplied command line that we won't accept. */	TokenNameCOMMENT_JAVADOC	 Prevent the user from specifying a different command. * @ant.attribute ignore="true" @param cmdl A user supplied command line that we won't accept. 
public	TokenNamepublic	
void	TokenNamevoid	
setCommand	TokenNameIdentifier	 set Command
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmdl	TokenNameIdentifier	 cmdl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the command attribute"	TokenNameStringLiteral	 doesn't support the command attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prevent the skipping of empty filesets * * @ant.attribute ignore="true" * @param skip A user supplied boolean we won't accept. */	TokenNameCOMMENT_JAVADOC	 Prevent the skipping of empty filesets * @ant.attribute ignore="true" @param skip A user supplied boolean we won't accept. 
public	TokenNamepublic	
void	TokenNamevoid	
setSkipEmptyFilesets	TokenNameIdentifier	 set Skip Empty Filesets
(	TokenNameLPAREN	
boolean	TokenNameboolean	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the "	TokenNameStringLiteral	 doesn't support the 
+	TokenNamePLUS	
"skipemptyfileset attribute"	TokenNameStringLiteral	skipemptyfileset attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prevent the use of the addsourcefile atribute. * * @ant.attribute ignore="true" * @param b A user supplied boolean we won't accept. */	TokenNameCOMMENT_JAVADOC	 Prevent the use of the addsourcefile atribute. * @ant.attribute ignore="true" @param b A user supplied boolean we won't accept. 
public	TokenNamepublic	
void	TokenNamevoid	
setAddsourcefile	TokenNameIdentifier	 set Addsourcefile
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the addsourcefile attribute"	TokenNameStringLiteral	 doesn't support the addsourcefile attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Automatically approve Unix OS's. * @return true if a valid OS, for unix this is always true, otherwise * use the superclasses' test (user set). */	TokenNameCOMMENT_JAVADOC	 Automatically approve Unix OS's. @return true if a valid OS, for unix this is always true, otherwise use the superclasses' test (user set). 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isValidOs	TokenNameIdentifier	 is Valid Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getOs	TokenNameIdentifier	 get Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
getOsFamily	TokenNameIdentifier	 get Os Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
FAMILY_UNIX	TokenNameIdentifier	 FAMILY  UNIX
)	TokenNameRPAREN	
:	TokenNameCOLON	
super	TokenNamesuper	
.	TokenNameDOT	
isValidOs	TokenNameIdentifier	 is Valid Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
