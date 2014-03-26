package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
toolchain	TokenNameIdentifier	 toolchain
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
toolchain	TokenNameIdentifier	 toolchain
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
/** * * @author mkleint */	TokenNameCOMMENT_JAVADOC	 * @author mkleint 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DefaultToolchain	TokenNameIdentifier	 Default Toolchain
implements	TokenNameimplements	
Toolchain	TokenNameIdentifier	 Toolchain
,	TokenNameCOMMA	
ToolchainPrivate	TokenNameIdentifier	 Toolchain Private
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
RequirementMatcher	TokenNameIdentifier	 Requirement Matcher
>	TokenNameGREATER	
provides	TokenNameIdentifier	 provides
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
RequirementMatcher	TokenNameIdentifier	 Requirement Matcher
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEY_TYPE	TokenNameIdentifier	 KEY  TYPE
=	TokenNameEQUAL	
"type"	TokenNameStringLiteral	type
;	TokenNameSEMICOLON	
//NOI18N 	TokenNameCOMMENT_LINE	NOI18N 
private	TokenNameprivate	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
DefaultToolchain	TokenNameIdentifier	 Default Toolchain
(	TokenNameLPAREN	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
DefaultToolchain	TokenNameIdentifier	 Default Toolchain
(	TokenNameLPAREN	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
type	TokenNameIdentifier	 type
:	TokenNameCOLON	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
ToolchainModel	TokenNameIdentifier	 Toolchain Model
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addProvideToken	TokenNameIdentifier	 add Provide Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
RequirementMatcher	TokenNameIdentifier	 Requirement Matcher
matcher	TokenNameIdentifier	 matcher
)	TokenNameRPAREN	
{	TokenNameLBRACE	
provides	TokenNameIdentifier	 provides
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
matcher	TokenNameIdentifier	 matcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
matchesRequirements	TokenNameIdentifier	 matches Requirements
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
requirements	TokenNameIdentifier	 requirements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
requirements	TokenNameIdentifier	 requirements
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RequirementMatcher	TokenNameIdentifier	 Requirement Matcher
matcher	TokenNameIdentifier	 matcher
=	TokenNameEQUAL	
provides	TokenNameIdentifier	 provides
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Toolchain "	TokenNameStringLiteral	Toolchain 
+	TokenNamePLUS	
this	TokenNamethis	
+	TokenNamePLUS	
" is missing required property: "	TokenNameStringLiteral	 is missing required property: 
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
requirements	TokenNameIdentifier	 requirements
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Toolchain "	TokenNameStringLiteral	Toolchain 
+	TokenNamePLUS	
this	TokenNamethis	
+	TokenNamePLUS	
" doesn't match required property: "	TokenNameStringLiteral	 doesn't match required property: 
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Logger	TokenNameIdentifier	 Logger
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
