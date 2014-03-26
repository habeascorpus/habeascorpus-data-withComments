package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
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
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
ArtifactHandler	TokenNameIdentifier	 Artifact Handler
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
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
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
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
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
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
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
VersionRange	TokenNameIdentifier	 Version Range
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
CountDownLatch	TokenNameIdentifier	 Count Down Latch
;	TokenNameSEMICOLON	
/** * An artifact that conditionally suspends on getFile for anything but the thread it is locked to. * * @since 3.0 */	TokenNameCOMMENT_JAVADOC	 An artifact that conditionally suspends on getFile for anything but the thread it is locked to. * @since 3.0 
class	TokenNameclass	
ThreadLockedArtifact	TokenNameIdentifier	 Thread Locked Artifact
implements	TokenNameimplements	
Artifact	TokenNameIdentifier	 Artifact
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Artifact	TokenNameIdentifier	 Artifact
real	TokenNameIdentifier	 real
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CountDownLatch	TokenNameIdentifier	 Count Down Latch
artifactLocked	TokenNameIdentifier	 artifact Locked
=	TokenNameEQUAL	
new	TokenNamenew	
CountDownLatch	TokenNameIdentifier	 Count Down Latch
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ThreadLockedArtifact	TokenNameIdentifier	 Thread Locked Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
real	TokenNameIdentifier	 real
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
real	TokenNameIdentifier	 real
=	TokenNameEQUAL	
real	TokenNameIdentifier	 real
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasReal	TokenNameIdentifier	 has Real
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
real	TokenNameIdentifier	 real
instanceof	TokenNameinstanceof	
ThreadLockedArtifact	TokenNameIdentifier	 Thread Locked Artifact
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ThreadLockedArtifact	TokenNameIdentifier	 Thread Locked Artifact
)	TokenNameRPAREN	
real	TokenNameIdentifier	 real
)	TokenNameRPAREN	
.	TokenNameDOT	
hasReal	TokenNameIdentifier	 has Real
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasClassifier	TokenNameIdentifier	 has Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
hasClassifier	TokenNameIdentifier	 has Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
InheritableThreadLocal	TokenNameIdentifier	 Inheritable Thread Local
<	TokenNameLESS	
ThreadLockedArtifact	TokenNameIdentifier	 Thread Locked Artifact
>	TokenNameGREATER	
threadArtifact	TokenNameIdentifier	 thread Artifact
=	TokenNameEQUAL	
new	TokenNamenew	
InheritableThreadLocal	TokenNameIdentifier	 Inheritable Thread Local
<	TokenNameLESS	
ThreadLockedArtifact	TokenNameIdentifier	 Thread Locked Artifact
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
attachToThread	TokenNameIdentifier	 attach To Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
threadArtifact	TokenNameIdentifier	 thread Artifact
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ThreadLockedArtifact	TokenNameIdentifier	 Thread Locked Artifact
lockedArtifact	TokenNameIdentifier	 locked Artifact
=	TokenNameEQUAL	
threadArtifact	TokenNameIdentifier	 thread Artifact
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lockedArtifact	TokenNameIdentifier	 locked Artifact
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
this	TokenNamethis	
!=	TokenNameNOT_EQUAL	
lockedArtifact	TokenNameIdentifier	 locked Artifact
&&	TokenNameAND_AND	
mustLock	TokenNameIdentifier	 must Lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
artifactLocked	TokenNameIdentifier	 artifact Locked
.	TokenNameDOT	
await	TokenNameIdentifier	 await
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore and go on to real.getFile(); 	TokenNameCOMMENT_LINE	Ignore and go on to real.getFile(); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
mustLock	TokenNameIdentifier	 must Lock
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
dontNeedLock	TokenNameIdentifier	 dont Need Lock
=	TokenNameEQUAL	
CurrentPhaseForThread	TokenNameIdentifier	 Current Phase For Thread
.	TokenNameDOT	
isPhase	TokenNameIdentifier	 is Phase
(	TokenNameLPAREN	
"compile"	TokenNameStringLiteral	compile
)	TokenNameRPAREN	
||	TokenNameOR_OR	
CurrentPhaseForThread	TokenNameIdentifier	 Current Phase For Thread
.	TokenNameDOT	
isPhase	TokenNameIdentifier	 is Phase
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
!	TokenNameNOT	
dontNeedLock	TokenNameIdentifier	 dont Need Lock
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
destination	TokenNameIdentifier	 destination
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
destination	TokenNameIdentifier	 destination
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
destination	TokenNameIdentifier	 destination
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
destination	TokenNameIdentifier	 destination
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifactLocked	TokenNameIdentifier	 artifact Locked
.	TokenNameDOT	
countDown	TokenNameIdentifier	 count Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
destination	TokenNameIdentifier	 destination
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBaseVersion	TokenNameIdentifier	 set Base Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseVersion	TokenNameIdentifier	 base Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setBaseVersion	TokenNameIdentifier	 set Base Version
(	TokenNameLPAREN	
baseVersion	TokenNameIdentifier	 base Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDependencyConflictId	TokenNameIdentifier	 get Dependency Conflict Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getDependencyConflictId	TokenNameIdentifier	 get Dependency Conflict Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addMetadata	TokenNameIdentifier	 add Metadata
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
addMetadata	TokenNameIdentifier	 add Metadata
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
>	TokenNameGREATER	
getMetadataList	TokenNameIdentifier	 get Metadata List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getMetadataList	TokenNameIdentifier	 get Metadata List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRepository	TokenNameIdentifier	 set Repository
(	TokenNameLPAREN	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
remoteRepository	TokenNameIdentifier	 remote Repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setRepository	TokenNameIdentifier	 set Repository
(	TokenNameLPAREN	
remoteRepository	TokenNameIdentifier	 remote Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getRepository	TokenNameIdentifier	 get Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getRepository	TokenNameIdentifier	 get Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
updateVersion	TokenNameIdentifier	 update Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
updateVersion	TokenNameIdentifier	 update Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDownloadUrl	TokenNameIdentifier	 get Download Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getDownloadUrl	TokenNameIdentifier	 get Download Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDownloadUrl	TokenNameIdentifier	 set Download Url
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
downloadUrl	TokenNameIdentifier	 download Url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setDownloadUrl	TokenNameIdentifier	 set Download Url
(	TokenNameLPAREN	
downloadUrl	TokenNameIdentifier	 download Url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
getDependencyFilter	TokenNameIdentifier	 get Dependency Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getDependencyFilter	TokenNameIdentifier	 get Dependency Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDependencyFilter	TokenNameIdentifier	 set Dependency Filter
(	TokenNameLPAREN	
ArtifactFilter	TokenNameIdentifier	 Artifact Filter
artifactFilter	TokenNameIdentifier	 artifact Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setDependencyFilter	TokenNameIdentifier	 set Dependency Filter
(	TokenNameLPAREN	
artifactFilter	TokenNameIdentifier	 artifact Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactHandler	TokenNameIdentifier	 Artifact Handler
getArtifactHandler	TokenNameIdentifier	 get Artifact Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getArtifactHandler	TokenNameIdentifier	 get Artifact Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getDependencyTrail	TokenNameIdentifier	 get Dependency Trail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getDependencyTrail	TokenNameIdentifier	 get Dependency Trail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDependencyTrail	TokenNameIdentifier	 set Dependency Trail
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
dependencyTrail	TokenNameIdentifier	 dependency Trail
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setDependencyTrail	TokenNameIdentifier	 set Dependency Trail
(	TokenNameLPAREN	
dependencyTrail	TokenNameIdentifier	 dependency Trail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setScope	TokenNameIdentifier	 set Scope
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setScope	TokenNameIdentifier	 set Scope
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VersionRange	TokenNameIdentifier	 Version Range
getVersionRange	TokenNameIdentifier	 get Version Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getVersionRange	TokenNameIdentifier	 get Version Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setVersionRange	TokenNameIdentifier	 set Version Range
(	TokenNameLPAREN	
VersionRange	TokenNameIdentifier	 Version Range
newRange	TokenNameIdentifier	 new Range
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setVersionRange	TokenNameIdentifier	 set Version Range
(	TokenNameLPAREN	
newRange	TokenNameIdentifier	 new Range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
selectVersion	TokenNameIdentifier	 select Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
selectVersion	TokenNameIdentifier	 select Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
isSnapshot	TokenNameIdentifier	 is Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setResolved	TokenNameIdentifier	 set Resolved
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isResolved	TokenNameIdentifier	 is Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
isResolved	TokenNameIdentifier	 is Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setResolvedVersion	TokenNameIdentifier	 set Resolved Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setResolvedVersion	TokenNameIdentifier	 set Resolved Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setArtifactHandler	TokenNameIdentifier	 set Artifact Handler
(	TokenNameLPAREN	
ArtifactHandler	TokenNameIdentifier	 Artifact Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setArtifactHandler	TokenNameIdentifier	 set Artifact Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isRelease	TokenNameIdentifier	 is Release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
isRelease	TokenNameIdentifier	 is Release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRelease	TokenNameIdentifier	 set Release
(	TokenNameLPAREN	
boolean	TokenNameboolean	
release	TokenNameIdentifier	 release
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setRelease	TokenNameIdentifier	 set Release
(	TokenNameLPAREN	
release	TokenNameIdentifier	 release
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
>	TokenNameGREATER	
getAvailableVersions	TokenNameIdentifier	 get Available Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getAvailableVersions	TokenNameIdentifier	 get Available Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAvailableVersions	TokenNameIdentifier	 set Available Versions
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
>	TokenNameGREATER	
versions	TokenNameIdentifier	 versions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setAvailableVersions	TokenNameIdentifier	 set Available Versions
(	TokenNameLPAREN	
versions	TokenNameIdentifier	 versions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isOptional	TokenNameIdentifier	 is Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
isOptional	TokenNameIdentifier	 is Optional
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOptional	TokenNameIdentifier	 set Optional
(	TokenNameLPAREN	
boolean	TokenNameboolean	
optional	TokenNameIdentifier	 optional
)	TokenNameRPAREN	
{	TokenNameLBRACE	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
setOptional	TokenNameIdentifier	 set Optional
(	TokenNameLPAREN	
optional	TokenNameIdentifier	 optional
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
getSelectedVersion	TokenNameIdentifier	 get Selected Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
getSelectedVersion	TokenNameIdentifier	 get Selected Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelectedVersionKnown	TokenNameIdentifier	 is Selected Version Known
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
isSelectedVersionKnown	TokenNameIdentifier	 is Selected Version Known
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
real	TokenNameIdentifier	 real
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
