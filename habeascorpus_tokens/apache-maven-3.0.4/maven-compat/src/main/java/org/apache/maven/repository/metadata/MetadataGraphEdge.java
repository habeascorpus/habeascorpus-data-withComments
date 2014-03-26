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
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
;	TokenNameSEMICOLON	
/** * metadata graph edge - combination of version, scope and depth define * an edge in the graph * * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> * */	TokenNameCOMMENT_JAVADOC	 metadata graph edge - combination of version, scope and depth define an edge in the graph * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> 
public	TokenNamepublic	
class	TokenNameclass	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
pomOrder	TokenNameIdentifier	 pom Order
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
artifactUri	TokenNameIdentifier	 artifact Uri
;	TokenNameSEMICOLON	
/** * capturing where this link came from * and where it is linked to. * * In the first implementation only source used for explanatory function */	TokenNameCOMMENT_JAVADOC	 capturing where this link came from and where it is linked to. * In the first implementation only source used for explanatory function 
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
public	TokenNamepublic	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
boolean	TokenNameboolean	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactUri	TokenNameIdentifier	 artifact Uri
,	TokenNameCOMMA	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
,	TokenNameCOMMA	
int	TokenNameint	
pomOrder	TokenNameIdentifier	 pom Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scope	TokenNameIdentifier	 scope
=	TokenNameEQUAL	
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifactUri	TokenNameIdentifier	 artifact Uri
=	TokenNameEQUAL	
artifactUri	TokenNameIdentifier	 artifact Uri
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
resolved	TokenNameIdentifier	 resolved
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pomOrder	TokenNameIdentifier	 pom Order
=	TokenNameEQUAL	
pomOrder	TokenNameIdentifier	 pom Order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
/** * helper for equals */	TokenNameCOMMENT_JAVADOC	 helper for equals 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
objectsEqual	TokenNameIdentifier	 objects Equal
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
o2	TokenNameIdentifier	 o2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
o2	TokenNameIdentifier	 o2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
o2	TokenNameIdentifier	 o2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
/** * used to eliminate exact duplicates in the edge list */	TokenNameCOMMENT_JAVADOC	 used to eliminate exact duplicates in the edge list 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
objectsEqual	TokenNameIdentifier	 objects Equal
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
checkScope	TokenNameIdentifier	 check Scope
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
checkScope	TokenNameIdentifier	 check Scope
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
depth	TokenNameIdentifier	 depth
==	TokenNameEQUAL_EQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setScope	TokenNameIdentifier	 set Scope
(	TokenNameLPAREN	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scope	TokenNameIdentifier	 scope
=	TokenNameEQUAL	
scope	TokenNameIdentifier	 scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDepth	TokenNameIdentifier	 set Depth
(	TokenNameLPAREN	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isResolved	TokenNameIdentifier	 is Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resolved	TokenNameIdentifier	 resolved
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setResolved	TokenNameIdentifier	 set Resolved
(	TokenNameLPAREN	
boolean	TokenNameboolean	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
resolved	TokenNameIdentifier	 resolved
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPomOrder	TokenNameIdentifier	 get Pom Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pomOrder	TokenNameIdentifier	 pom Order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPomOrder	TokenNameIdentifier	 set Pom Order
(	TokenNameLPAREN	
int	TokenNameint	
pomOrder	TokenNameIdentifier	 pom Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pomOrder	TokenNameIdentifier	 pom Order
=	TokenNameEQUAL	
pomOrder	TokenNameIdentifier	 pom Order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getArtifactUri	TokenNameIdentifier	 get Artifact Uri
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifactUri	TokenNameIdentifier	 artifact Uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setArtifactUri	TokenNameIdentifier	 set Artifact Uri
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
artifactUri	TokenNameIdentifier	 artifact Uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifactUri	TokenNameIdentifier	 artifact Uri
=	TokenNameEQUAL	
artifactUri	TokenNameIdentifier	 artifact Uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[ "	TokenNameStringLiteral	[ 
+	TokenNamePLUS	
"FROM:("	TokenNameStringLiteral	FROM:(
+	TokenNamePLUS	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"no source"	TokenNameStringLiteral	no source
:	TokenNameCOLON	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
md	TokenNameIdentifier	 md
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"no source MD"	TokenNameStringLiteral	no source MD
:	TokenNameCOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
"TO:("	TokenNameStringLiteral	TO:(
+	TokenNamePLUS	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"no target"	TokenNameStringLiteral	no target
:	TokenNameCOLON	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
md	TokenNameIdentifier	 md
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"no target MD"	TokenNameStringLiteral	no target MD
:	TokenNameCOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
"version="	TokenNameStringLiteral	version=
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
", scope="	TokenNameStringLiteral	, scope=
+	TokenNamePLUS	
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"null"	TokenNameStringLiteral	null
:	TokenNameCOLON	
scope	TokenNameIdentifier	 scope
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", depth="	TokenNameStringLiteral	, depth=
+	TokenNamePLUS	
depth	TokenNameIdentifier	 depth
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
//---------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------------- 
}	TokenNameRBRACE	
