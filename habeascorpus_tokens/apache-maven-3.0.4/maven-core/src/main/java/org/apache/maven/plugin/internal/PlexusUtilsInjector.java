package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
RepositoryException	TokenNameIdentifier	 Repository Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
Artifact	TokenNameIdentifier	 Artifact
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
collection	TokenNameIdentifier	 collection
.	TokenNameDOT	
DependencyGraphTransformationContext	TokenNameIdentifier	 Dependency Graph Transformation Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
collection	TokenNameIdentifier	 collection
.	TokenNameDOT	
DependencyGraphTransformer	TokenNameIdentifier	 Dependency Graph Transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
Dependency	TokenNameIdentifier	 Dependency
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
DependencyNode	TokenNameIdentifier	 Dependency Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
JavaScopes	TokenNameIdentifier	 Java Scopes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
DefaultDependencyNode	TokenNameIdentifier	 Default Dependency Node
;	TokenNameSEMICOLON	
/** * Injects plexus-utils:1.1 into a plugin's class path if it doesn't already declare a dependency on plexus-utils. This * is another legacy bit to provide backward-compat with Maven 2.x. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Injects plexus-utils:1.1 into a plugin's class path if it doesn't already declare a dependency on plexus-utils. This is another legacy bit to provide backward-compat with Maven 2.x. * @author Benjamin Bentmann 
class	TokenNameclass	
PlexusUtilsInjector	TokenNameIdentifier	 Plexus Utils Injector
implements	TokenNameimplements	
DependencyGraphTransformer	TokenNameIdentifier	 Dependency Graph Transformer
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GID	TokenNameIdentifier	 GID
=	TokenNameEQUAL	
"org.codehaus.plexus"	TokenNameStringLiteral	org.codehaus.plexus
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
AID	TokenNameIdentifier	 AID
=	TokenNameEQUAL	
"plexus-utils"	TokenNameStringLiteral	plexus-utils
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VER	TokenNameIdentifier	 VER
=	TokenNameEQUAL	
"1.1"	TokenNameStringLiteral	1.1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXT	TokenNameIdentifier	 EXT
=	TokenNameEQUAL	
"jar"	TokenNameStringLiteral	jar
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DependencyNode	TokenNameIdentifier	 Dependency Node
transformGraph	TokenNameIdentifier	 transform Graph
(	TokenNameLPAREN	
DependencyNode	TokenNameIdentifier	 Dependency Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
DependencyGraphTransformationContext	TokenNameIdentifier	 Dependency Graph Transformation Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
RepositoryException	TokenNameIdentifier	 Repository Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
findPlexusUtils	TokenNameIdentifier	 find Plexus Utils
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
pu	TokenNameIdentifier	 pu
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifact	TokenNameIdentifier	 Default Artifact
(	TokenNameLPAREN	
GID	TokenNameIdentifier	 GID
,	TokenNameCOMMA	
AID	TokenNameIdentifier	 AID
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
EXT	TokenNameIdentifier	 EXT
,	TokenNameCOMMA	
VER	TokenNameIdentifier	 VER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultDependencyNode	TokenNameIdentifier	 Default Dependency Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultDependencyNode	TokenNameIdentifier	 Default Dependency Node
(	TokenNameLPAREN	
new	TokenNamenew	
Dependency	TokenNameIdentifier	 Dependency
(	TokenNameLPAREN	
pu	TokenNameIdentifier	 pu
,	TokenNameCOMMA	
JavaScopes	TokenNameIdentifier	 Java Scopes
.	TokenNameDOT	
RUNTIME	TokenNameIdentifier	 RUNTIME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setRepositories	TokenNameIdentifier	 set Repositories
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getRepositories	TokenNameIdentifier	 get Repositories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setRequestContext	TokenNameIdentifier	 set Request Context
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getRequestContext	TokenNameIdentifier	 get Request Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
DependencyNode	TokenNameIdentifier	 Dependency Node
findPlexusUtils	TokenNameIdentifier	 find Plexus Utils
(	TokenNameLPAREN	
DependencyNode	TokenNameIdentifier	 Dependency Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getDependency	TokenNameIdentifier	 get Dependency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
AID	TokenNameIdentifier	 AID
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
GID	TokenNameIdentifier	 GID
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
EXT	TokenNameIdentifier	 EXT
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
DependencyNode	TokenNameIdentifier	 Dependency Node
child	TokenNameIdentifier	 child
:	TokenNameCOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DependencyNode	TokenNameIdentifier	 Dependency Node
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
findPlexusUtils	TokenNameIdentifier	 find Plexus Utils
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
