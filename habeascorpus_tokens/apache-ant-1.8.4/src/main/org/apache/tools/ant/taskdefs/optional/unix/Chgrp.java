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
/** * Chgrp equivalent for unix-like environments. * * @since Ant 1.6 * * @ant.task category="filesystem" */	TokenNameCOMMENT_JAVADOC	 Chgrp equivalent for unix-like environments. * @since Ant 1.6 * @ant.task category="filesystem" 
public	TokenNamepublic	
class	TokenNameclass	
Chgrp	TokenNameIdentifier	 Chgrp
extends	TokenNameextends	
AbstractAccessTask	TokenNameIdentifier	 Abstract Access Task
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
haveGroup	TokenNameIdentifier	 have Group
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Chgrp task for setting unix group of a file. */	TokenNameCOMMENT_JAVADOC	 Chgrp task for setting unix group of a file. 
public	TokenNamepublic	
Chgrp	TokenNameIdentifier	 Chgrp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
"chgrp"	TokenNameStringLiteral	chgrp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the group atribute. * * @param group The new group for the file(s) or directory(ies) */	TokenNameCOMMENT_JAVADOC	 Set the group atribute. * @param group The new group for the file(s) or directory(ies) 
public	TokenNamepublic	
void	TokenNamevoid	
setGroup	TokenNameIdentifier	 set Group
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
haveGroup	TokenNameIdentifier	 have Group
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ensure that all the required arguments and other conditions have * been set. */	TokenNameCOMMENT_JAVADOC	 Ensure that all the required arguments and other conditions have been set. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkConfiguration	TokenNameIdentifier	 check Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
haveGroup	TokenNameIdentifier	 have Group
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Required attribute group not set in "	TokenNameStringLiteral	Required attribute group not set in 
+	TokenNamePLUS	
"chgrp"	TokenNameStringLiteral	chgrp
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
checkConfiguration	TokenNameIdentifier	 check Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * We don't want to expose the executable atribute, so overide it. * * @param e User supplied executable that we won't accept. */	TokenNameCOMMENT_JAVADOC	 We don't want to expose the executable atribute, so overide it. * @param e User supplied executable that we won't accept. 
public	TokenNamepublic	
void	TokenNamevoid	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
e	TokenNameIdentifier	 e
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
" doesn't support the executable"	TokenNameStringLiteral	 doesn't support the executable
+	TokenNamePLUS	
" attribute"	TokenNameStringLiteral	 attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
