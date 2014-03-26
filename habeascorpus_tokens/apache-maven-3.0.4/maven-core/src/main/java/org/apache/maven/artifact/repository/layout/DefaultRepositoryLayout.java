package	TokenNamepackage	
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
layout	TokenNameIdentifier	 layout
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
/** * @author jdcasey */	TokenNameCOMMENT_JAVADOC	 @author jdcasey 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
hint	TokenNameIdentifier	 hint
=	TokenNameEQUAL	
"default"	TokenNameStringLiteral	default
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultRepositoryLayout	TokenNameIdentifier	 Default Repository Layout
implements	TokenNameimplements	
ArtifactRepositoryLayout	TokenNameIdentifier	 Artifact Repository Layout
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
PATH_SEPARATOR	TokenNameIdentifier	 PATH  SEPARATOR
=	TokenNameEQUAL	
'/'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
GROUP_SEPARATOR	TokenNameIdentifier	 GROUP  SEPARATOR
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
ARTIFACT_SEPARATOR	TokenNameIdentifier	 ARTIFACT  SEPARATOR
=	TokenNameEQUAL	
'-'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"default"	TokenNameStringLiteral	default
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
pathOf	TokenNameIdentifier	 path Of
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArtifactHandler	TokenNameIdentifier	 Artifact Handler
artifactHandler	TokenNameIdentifier	 artifact Handler
=	TokenNameEQUAL	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactHandler	TokenNameIdentifier	 get Artifact Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatAsDirectory	TokenNameIdentifier	 format As Directory
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
PATH_SEPARATOR	TokenNameIdentifier	 PATH  SEPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
PATH_SEPARATOR	TokenNameIdentifier	 PATH  SEPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
PATH_SEPARATOR	TokenNameIdentifier	 PATH  SEPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ARTIFACT_SEPARATOR	TokenNameIdentifier	 ARTIFACT  SEPARATOR
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
hasClassifier	TokenNameIdentifier	 has Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ARTIFACT_SEPARATOR	TokenNameIdentifier	 ARTIFACT  SEPARATOR
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
artifactHandler	TokenNameIdentifier	 artifact Handler
.	TokenNameDOT	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
artifactHandler	TokenNameIdentifier	 artifact Handler
.	TokenNameDOT	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
GROUP_SEPARATOR	TokenNameIdentifier	 GROUP  SEPARATOR
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
artifactHandler	TokenNameIdentifier	 artifact Handler
.	TokenNameDOT	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
pathOfLocalRepositoryMetadata	TokenNameIdentifier	 path Of Local Repository Metadata
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pathOfRepositoryMetadata	TokenNameIdentifier	 path Of Repository Metadata
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getLocalFilename	TokenNameIdentifier	 get Local Filename
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
pathOfRepositoryMetadata	TokenNameIdentifier	 path Of Repository Metadata
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
formatAsDirectory	TokenNameIdentifier	 format As Directory
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
PATH_SEPARATOR	TokenNameIdentifier	 PATH  SEPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
storedInGroupDirectory	TokenNameIdentifier	 stored In Group Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
PATH_SEPARATOR	TokenNameIdentifier	 PATH  SEPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
storedInArtifactVersionDirectory	TokenNameIdentifier	 stored In Artifact Version Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getBaseVersion	TokenNameIdentifier	 get Base Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
PATH_SEPARATOR	TokenNameIdentifier	 PATH  SEPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
pathOfRemoteRepositoryMetadata	TokenNameIdentifier	 path Of Remote Repository Metadata
(	TokenNameLPAREN	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pathOfRepositoryMetadata	TokenNameIdentifier	 path Of Repository Metadata
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getRemoteFilename	TokenNameIdentifier	 get Remote Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
formatAsDirectory	TokenNameIdentifier	 format As Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
GROUP_SEPARATOR	TokenNameIdentifier	 GROUP  SEPARATOR
,	TokenNameCOMMA	
PATH_SEPARATOR	TokenNameIdentifier	 PATH  SEPARATOR
)	TokenNameRPAREN	
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
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
