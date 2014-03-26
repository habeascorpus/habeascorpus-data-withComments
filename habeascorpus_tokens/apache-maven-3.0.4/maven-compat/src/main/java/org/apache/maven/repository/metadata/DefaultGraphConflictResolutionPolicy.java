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
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
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
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Configuration	TokenNameIdentifier	 Configuration
;	TokenNameSEMICOLON	
/** * @author <a href="mailto:oleg@codehaus.org">Oleg Gusakov</a> * */	TokenNameCOMMENT_JAVADOC	 @author <a href="mailto:oleg@codehaus.org">Oleg Gusakov</a> 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
GraphConflictResolutionPolicy	TokenNameIdentifier	 Graph Conflict Resolution Policy
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultGraphConflictResolutionPolicy	TokenNameIdentifier	 Default Graph Conflict Resolution Policy
implements	TokenNameimplements	
GraphConflictResolutionPolicy	TokenNameIdentifier	 Graph Conflict Resolution Policy
{	TokenNameLBRACE	
/** * artifact, closer to the entry point, is selected */	TokenNameCOMMENT_JAVADOC	 artifact, closer to the entry point, is selected 
@	TokenNameAT	
Configuration	TokenNameIdentifier	 Configuration
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
"closer-first"	TokenNameStringLiteral	closer-first
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
private	TokenNameprivate	
boolean	TokenNameboolean	
closerFirst	TokenNameIdentifier	 closer First
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * newer artifact is selected */	TokenNameCOMMENT_JAVADOC	 newer artifact is selected 
@	TokenNameAT	
Configuration	TokenNameIdentifier	 Configuration
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
"newer-first"	TokenNameStringLiteral	newer-first
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
private	TokenNameprivate	
boolean	TokenNameboolean	
newerFirst	TokenNameIdentifier	 newer First
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e1	TokenNameIdentifier	 e1
,	TokenNameCOMMA	
MetadataGraphEdge	TokenNameIdentifier	 Metadata Graph Edge
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
depth1	TokenNameIdentifier	 depth1
=	TokenNameEQUAL	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
depth2	TokenNameIdentifier	 depth2
=	TokenNameEQUAL	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
depth1	TokenNameIdentifier	 depth1
==	TokenNameEQUAL_EQUAL	
depth2	TokenNameIdentifier	 depth2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newerFirst	TokenNameIdentifier	 newer First
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
e1	TokenNameIdentifier	 e1
:	TokenNameCOLON	
e2	TokenNameIdentifier	 e2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
e2	TokenNameIdentifier	 e2
:	TokenNameCOLON	
e1	TokenNameIdentifier	 e1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
closerFirst	TokenNameIdentifier	 closer First
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
depth1	TokenNameIdentifier	 depth1
<	TokenNameLESS	
depth2	TokenNameIdentifier	 depth2
?	TokenNameQUESTION	
e1	TokenNameIdentifier	 e1
:	TokenNameCOLON	
e2	TokenNameIdentifier	 e2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
depth1	TokenNameIdentifier	 depth1
<	TokenNameLESS	
depth2	TokenNameIdentifier	 depth2
?	TokenNameQUESTION	
e2	TokenNameIdentifier	 e2
:	TokenNameCOLON	
e1	TokenNameIdentifier	 e1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
