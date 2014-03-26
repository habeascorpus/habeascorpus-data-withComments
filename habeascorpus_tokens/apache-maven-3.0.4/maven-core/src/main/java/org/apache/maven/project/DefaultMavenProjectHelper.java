package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
List	TokenNameIdentifier	 List
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
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
ArtifactHandlerManager	TokenNameIdentifier	 Artifact Handler Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Resource	TokenNameIdentifier	 Resource
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
AttachedArtifact	TokenNameIdentifier	 Attached Artifact
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
Requirement	TokenNameIdentifier	 Requirement
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
AbstractLogEnabled	TokenNameIdentifier	 Abstract Log Enabled
;	TokenNameSEMICOLON	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"deprecation"	TokenNameStringLiteral	deprecation
)	TokenNameRPAREN	
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
MavenProjectHelper	TokenNameIdentifier	 Maven Project Helper
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultMavenProjectHelper	TokenNameIdentifier	 Default Maven Project Helper
extends	TokenNameextends	
AbstractLogEnabled	TokenNameIdentifier	 Abstract Log Enabled
implements	TokenNameimplements	
MavenProjectHelper	TokenNameIdentifier	 Maven Project Helper
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
ArtifactHandlerManager	TokenNameIdentifier	 Artifact Handler Manager
artifactHandlerManager	TokenNameIdentifier	 artifact Handler Manager
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
attachArtifact	TokenNameIdentifier	 attach Artifact
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactType	TokenNameIdentifier	 artifact Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactClassifier	TokenNameIdentifier	 artifact Classifier
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
artifactFile	TokenNameIdentifier	 artifact File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
artifactType	TokenNameIdentifier	 artifact Type
;	TokenNameSEMICOLON	
ArtifactHandler	TokenNameIdentifier	 Artifact Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
artifactHandlerManager	TokenNameIdentifier	 artifact Handler Manager
.	TokenNameDOT	
getArtifactHandler	TokenNameIdentifier	 get Artifact Handler
(	TokenNameLPAREN	
artifactType	TokenNameIdentifier	 artifact Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
artifactHandlerManager	TokenNameIdentifier	 artifact Handler Manager
.	TokenNameDOT	
getArtifactHandler	TokenNameIdentifier	 get Artifact Handler
(	TokenNameLPAREN	
"jar"	TokenNameStringLiteral	jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
new	TokenNamenew	
AttachedArtifact	TokenNameIdentifier	 Attached Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifactType	TokenNameIdentifier	 artifact Type
,	TokenNameCOMMA	
artifactClassifier	TokenNameIdentifier	 artifact Classifier
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
artifactFile	TokenNameIdentifier	 artifact File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setResolved	TokenNameIdentifier	 set Resolved
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attachArtifact	TokenNameIdentifier	 attach Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
attachArtifact	TokenNameIdentifier	 attach Artifact
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactType	TokenNameIdentifier	 artifact Type
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
artifactFile	TokenNameIdentifier	 artifact File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArtifactHandler	TokenNameIdentifier	 Artifact Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
artifactHandlerManager	TokenNameIdentifier	 artifact Handler Manager
.	TokenNameDOT	
getArtifactHandler	TokenNameIdentifier	 get Artifact Handler
(	TokenNameLPAREN	
artifactType	TokenNameIdentifier	 artifact Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
new	TokenNamenew	
AttachedArtifact	TokenNameIdentifier	 Attached Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifactType	TokenNameIdentifier	 artifact Type
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
artifactFile	TokenNameIdentifier	 artifact File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setResolved	TokenNameIdentifier	 set Resolved
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attachArtifact	TokenNameIdentifier	 attach Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
attachArtifact	TokenNameIdentifier	 attach Artifact
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
artifactFile	TokenNameIdentifier	 artifact File
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactClassifier	TokenNameIdentifier	 artifact Classifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
projectArtifact	TokenNameIdentifier	 project Artifact
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getArtifact	TokenNameIdentifier	 get Artifact
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
new	TokenNamenew	
AttachedArtifact	TokenNameIdentifier	 Attached Artifact
(	TokenNameLPAREN	
projectArtifact	TokenNameIdentifier	 project Artifact
,	TokenNameCOMMA	
projectArtifact	TokenNameIdentifier	 project Artifact
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifactClassifier	TokenNameIdentifier	 artifact Classifier
,	TokenNameCOMMA	
projectArtifact	TokenNameIdentifier	 project Artifact
.	TokenNameDOT	
getArtifactHandler	TokenNameIdentifier	 get Artifact Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
artifactFile	TokenNameIdentifier	 artifact File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
setResolved	TokenNameIdentifier	 set Resolved
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attachArtifact	TokenNameIdentifier	 attach Artifact
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
attachArtifact	TokenNameIdentifier	 attach Artifact
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addAttachedArtifact	TokenNameIdentifier	 add Attached Artifact
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
DuplicateArtifactAttachmentException	TokenNameIdentifier	 Duplicate Artifact Attachment Exception
dae	TokenNameIdentifier	 dae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
dae	TokenNameIdentifier	 dae
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We can throw this because it's unchecked, and won't change the MavenProjectHelper API, which would break 	TokenNameCOMMENT_LINE	We can throw this because it's unchecked, and won't change the MavenProjectHelper API, which would break 
// backward compat if it did. 	TokenNameCOMMENT_LINE	backward compat if it did. 
throw	TokenNamethrow	
dae	TokenNameIdentifier	 dae
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addResource	TokenNameIdentifier	 add Resource
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
resourceDirectory	TokenNameIdentifier	 resource Directory
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
includes	TokenNameIdentifier	 includes
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Resource	TokenNameIdentifier	 Resource
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
new	TokenNamenew	
Resource	TokenNameIdentifier	 Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
resourceDirectory	TokenNameIdentifier	 resource Directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
includes	TokenNameIdentifier	 includes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addResource	TokenNameIdentifier	 add Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addTestResource	TokenNameIdentifier	 add Test Resource
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
resourceDirectory	TokenNameIdentifier	 resource Directory
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
includes	TokenNameIdentifier	 includes
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Resource	TokenNameIdentifier	 Resource
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
new	TokenNamenew	
Resource	TokenNameIdentifier	 Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
resourceDirectory	TokenNameIdentifier	 resource Directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
includes	TokenNameIdentifier	 includes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addTestResource	TokenNameIdentifier	 add Test Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
