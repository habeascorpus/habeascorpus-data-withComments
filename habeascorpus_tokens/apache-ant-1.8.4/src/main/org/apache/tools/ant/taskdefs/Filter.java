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
Task	TokenNameIdentifier	 Task
;	TokenNameSEMICOLON	
/** * Sets a token filter that is used by the file copy tasks * to do token substitution. Sets multiple tokens by * reading these from a file. * * @since Ant 1.1 * * @ant.task category="filesystem" */	TokenNameCOMMENT_JAVADOC	 Sets a token filter that is used by the file copy tasks to do token substitution. Sets multiple tokens by reading these from a file. * @since Ant 1.1 * @ant.task category="filesystem" 
public	TokenNamepublic	
class	TokenNameclass	
Filter	TokenNameIdentifier	 Filter
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
filtersFile	TokenNameIdentifier	 filters File
;	TokenNameSEMICOLON	
/** * The token string without @ delimiters. * @param token token to set */	TokenNameCOMMENT_JAVADOC	 The token string without @ delimiters. @param token token to set 
public	TokenNamepublic	
void	TokenNamevoid	
setToken	TokenNameIdentifier	 set Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The string that should replace the token during filtered copies. * @param value token replace value */	TokenNameCOMMENT_JAVADOC	 The string that should replace the token during filtered copies. @param value token replace value 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The file from which the filters must be read. * This file must be a formatted as a property file. * * @param filtersFile filter file */	TokenNameCOMMENT_JAVADOC	 The file from which the filters must be read. This file must be a formatted as a property file. * @param filtersFile filter file 
public	TokenNamepublic	
void	TokenNamevoid	
setFiltersfile	TokenNameIdentifier	 set Filtersfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
filtersFile	TokenNameIdentifier	 filters File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
filtersFile	TokenNameIdentifier	 filters File
=	TokenNameEQUAL	
filtersFile	TokenNameIdentifier	 filters File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the task. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Execute the task. @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isFiltersFromFile	TokenNameIdentifier	 is Filters From File
=	TokenNameEQUAL	
filtersFile	TokenNameIdentifier	 filters File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isSingleFilter	TokenNameIdentifier	 is Single Filter
=	TokenNameEQUAL	
filtersFile	TokenNameIdentifier	 filters File
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
token	TokenNameIdentifier	 token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isFiltersFromFile	TokenNameIdentifier	 is Filters From File
&&	TokenNameAND_AND	
!	TokenNameNOT	
isSingleFilter	TokenNameIdentifier	 is Single Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"both token and value parameters, or "	TokenNameStringLiteral	both token and value parameters, or 
+	TokenNamePLUS	
"only a filtersFile parameter is "	TokenNameStringLiteral	only a filtersFile parameter is 
+	TokenNamePLUS	
"required"	TokenNameStringLiteral	required
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSingleFilter	TokenNameIdentifier	 is Single Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGlobalFilterSet	TokenNameIdentifier	 get Global Filter Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isFiltersFromFile	TokenNameIdentifier	 is Filters From File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readFilters	TokenNameIdentifier	 read Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Read the filters. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Read the filters. @throws BuildException on error 
protected	TokenNameprotected	
void	TokenNamevoid	
readFilters	TokenNameIdentifier	 read Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Reading filters from "	TokenNameStringLiteral	Reading filters from 
+	TokenNamePLUS	
filtersFile	TokenNameIdentifier	 filters File
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGlobalFilterSet	TokenNameIdentifier	 get Global Filter Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
readFiltersFromFile	TokenNameIdentifier	 read Filters From File
(	TokenNameLPAREN	
filtersFile	TokenNameIdentifier	 filters File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
