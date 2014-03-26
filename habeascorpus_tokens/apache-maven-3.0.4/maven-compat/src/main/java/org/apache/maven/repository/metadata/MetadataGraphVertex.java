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
/** * metadata graph vertice - just a wrapper around artifact's metadata * * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> */	TokenNameCOMMENT_JAVADOC	 metadata graph vertice - just a wrapper around artifact's metadata * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> 
public	TokenNamepublic	
class	TokenNameclass	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
>	TokenNameGREATER	
{	TokenNameLBRACE	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
md	TokenNameIdentifier	 md
;	TokenNameSEMICOLON	
// indications to use these in comparrison 	TokenNameCOMMENT_LINE	indications to use these in comparrison 
private	TokenNameprivate	
boolean	TokenNameboolean	
compareVersion	TokenNameIdentifier	 compare Version
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
compareScope	TokenNameIdentifier	 compare Scope
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
md	TokenNameIdentifier	 md
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
md	TokenNameIdentifier	 md
=	TokenNameEQUAL	
md	TokenNameIdentifier	 md
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
md	TokenNameIdentifier	 md
,	TokenNameCOMMA	
boolean	TokenNameboolean	
compareVersion	TokenNameIdentifier	 compare Version
,	TokenNameCOMMA	
boolean	TokenNameboolean	
compareScope	TokenNameIdentifier	 compare Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
compareVersion	TokenNameIdentifier	 compare Version
=	TokenNameEQUAL	
compareVersion	TokenNameIdentifier	 compare Version
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
compareScope	TokenNameIdentifier	 compare Scope
=	TokenNameEQUAL	
compareScope	TokenNameIdentifier	 compare Scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompareVersion	TokenNameIdentifier	 is Compare Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compareVersion	TokenNameIdentifier	 compare Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCompareVersion	TokenNameIdentifier	 set Compare Version
(	TokenNameLPAREN	
boolean	TokenNameboolean	
compareVersion	TokenNameIdentifier	 compare Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
compareVersion	TokenNameIdentifier	 compare Version
=	TokenNameEQUAL	
compareVersion	TokenNameIdentifier	 compare Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompareScope	TokenNameIdentifier	 is Compare Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compareScope	TokenNameIdentifier	 compare Scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCompareScope	TokenNameIdentifier	 set Compare Scope
(	TokenNameLPAREN	
boolean	TokenNameboolean	
compareScope	TokenNameIdentifier	 compare Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
compareScope	TokenNameIdentifier	 compare Scope
=	TokenNameEQUAL	
compareScope	TokenNameIdentifier	 compare Scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
(	TokenNameLPAREN	
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
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
s2	TokenNameIdentifier	 s2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
s2	TokenNameIdentifier	 s2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
s2	TokenNameIdentifier	 s2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
vertex	TokenNameIdentifier	 vertex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vertex	TokenNameIdentifier	 vertex
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
vertex	TokenNameIdentifier	 vertex
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
vmd	TokenNameIdentifier	 vmd
=	TokenNameEQUAL	
vertex	TokenNameIdentifier	 vertex
.	TokenNameDOT	
getMd	TokenNameIdentifier	 get Md
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
vmd	TokenNameIdentifier	 vmd
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
vmd	TokenNameIdentifier	 vmd
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
vmd	TokenNameIdentifier	 vmd
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compareVersion	TokenNameIdentifier	 compare Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
compareStrings	TokenNameIdentifier	 compare Strings
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
vmd	TokenNameIdentifier	 vmd
.	TokenNameDOT	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compareScope	TokenNameIdentifier	 compare Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
checkScope	TokenNameIdentifier	 check Scope
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
artifactScope	TokenNameIdentifier	 artifact Scope
)	TokenNameRPAREN	
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
checkScope	TokenNameIdentifier	 check Scope
(	TokenNameLPAREN	
vmd	TokenNameIdentifier	 vmd
.	TokenNameDOT	
artifactScope	TokenNameIdentifier	 artifact Scope
)	TokenNameRPAREN	
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
vo	TokenNameIdentifier	 vo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vo	TokenNameIdentifier	 vo
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
vo	TokenNameIdentifier	 vo
instanceof	TokenNameinstanceof	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MetadataGraphVertex	TokenNameIdentifier	 Metadata Graph Vertex
)	TokenNameRPAREN	
vo	TokenNameIdentifier	 vo
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
hashString	TokenNameIdentifier	 hash String
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hashString	TokenNameIdentifier	 hash String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hashString	TokenNameIdentifier	 hash String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
+	TokenNamePLUS	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compareVersion	TokenNameIdentifier	 compare Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hashString	TokenNameIdentifier	 hash String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compareScope	TokenNameIdentifier	 compare Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hashString	TokenNameIdentifier	 hash String
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
md	TokenNameIdentifier	 md
.	TokenNameDOT	
getArtifactScope	TokenNameIdentifier	 get Artifact Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hashString	TokenNameIdentifier	 hash String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// BASE64Encoder b64 = new BASE64Encoder(); 	TokenNameCOMMENT_LINE	BASE64Encoder b64 = new BASE64Encoder(); 
// return b64.encode( hashString.toString().getBytes() ).hashCode(); 	TokenNameCOMMENT_LINE	return b64.encode( hashString.toString().getBytes() ).hashCode(); 
}	TokenNameRBRACE	
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
}	TokenNameRBRACE	
