package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
Artifact	TokenNameIdentifier	 Artifact
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
;	TokenNameSEMICOLON	
/** * metadata [dirty] Tree * * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> * */	TokenNameCOMMENT_JAVADOC	 metadata [dirty] Tree * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> 
public	TokenNamepublic	
class	TokenNameclass	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
{	TokenNameLBRACE	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
md	TokenNameIdentifier	 md
;	TokenNameSEMICOLON	
// this node 	TokenNameCOMMENT_LINE	this node 
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
// papa 	TokenNameCOMMENT_LINE	papa 
/** default # of children. Used for tree creation optimization only */	TokenNameCOMMENT_JAVADOC	 default # of children. Used for tree creation optimization only 
int	TokenNameint	
nChildren	TokenNameIdentifier	 n Children
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
// of cause 	TokenNameCOMMENT_LINE	of cause 
public	TokenNamepublic	
int	TokenNameint	
getNChildren	TokenNameIdentifier	 get N Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nChildren	TokenNameIdentifier	 n Children
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNChildren	TokenNameIdentifier	 set N Children
(	TokenNameLPAREN	
int	TokenNameint	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nChildren	TokenNameIdentifier	 n Children
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
md	TokenNameIdentifier	 md
,	TokenNameCOMMA	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
boolean	TokenNameboolean	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
setArtifactScope	TokenNameIdentifier	 set Artifact Scope
(	TokenNameLPAREN	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
checkScope	TokenNameIdentifier	 check Scope
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
setResolved	TokenNameIdentifier	 set Resolved
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
md	TokenNameIdentifier	 md
=	TokenNameEQUAL	
md	TokenNameIdentifier	 md
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
af	TokenNameIdentifier	 af
,	TokenNameCOMMA	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
boolean	TokenNameboolean	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
af	TokenNameIdentifier	 af
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
void	TokenNamevoid	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
new	TokenNamenew	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
[	TokenNameLBRACKET	
nChildren	TokenNameIdentifier	 n Children
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
%	TokenNameREMAINDER	
nChildren	TokenNameIdentifier	 n Children
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
md	TokenNameIdentifier	 md
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"no metadata"	TokenNameStringLiteral	no metadata
:	TokenNameCOLON	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
graphHash	TokenNameIdentifier	 graph Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MetadataResolutionException	TokenNameIdentifier	 Metadata Resolution Exception
(	TokenNameLPAREN	
"treenode without metadata, parent: "	TokenNameStringLiteral	treenode without metadata, parent: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"null"	TokenNameStringLiteral	null
:	TokenNameCOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasChildren	TokenNameIdentifier	 has Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
children	TokenNameIdentifier	 children
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
public	TokenNamepublic	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
md	TokenNameIdentifier	 md
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMd	TokenNameIdentifier	 set Md
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
md	TokenNameIdentifier	 md
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
md	TokenNameIdentifier	 md
=	TokenNameEQUAL	
md	TokenNameIdentifier	 md
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setChildren	TokenNameIdentifier	 set Children
(	TokenNameLPAREN	
MetadataTreeNode	TokenNameIdentifier	 Metadata Tree Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
//------------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------------ 
}	TokenNameRBRACE	
