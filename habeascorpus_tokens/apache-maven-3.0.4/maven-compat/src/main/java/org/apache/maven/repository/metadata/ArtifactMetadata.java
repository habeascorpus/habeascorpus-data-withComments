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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
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
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
;	TokenNameSEMICOLON	
/** * Artifact Metadata that is resolved independent of Artifact itself. * * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> * */	TokenNameCOMMENT_JAVADOC	 Artifact Metadata that is resolved independent of Artifact itself. * @author <a href="oleg@codehaus.org">Oleg Gusakov</a> 
public	TokenNamepublic	
class	TokenNameclass	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
{	TokenNameLBRACE	
/** * standard glorified artifact coordinates */	TokenNameCOMMENT_JAVADOC	 standard glorified artifact coordinates 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
artifactScope	TokenNameIdentifier	 artifact Scope
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
;	TokenNameSEMICOLON	
/** * explanation: why this MD was chosen over it's siblings * in the resulting structure (classpath for now) */	TokenNameCOMMENT_JAVADOC	 explanation: why this MD was chosen over it's siblings in the resulting structure (classpath for now) 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
why	TokenNameIdentifier	 why
;	TokenNameSEMICOLON	
/** dependencies of the artifact behind this metadata */	TokenNameCOMMENT_JAVADOC	 dependencies of the artifact behind this metadata 
protected	TokenNameprotected	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
>	TokenNameGREATER	
dependencies	TokenNameIdentifier	 dependencies
;	TokenNameSEMICOLON	
/** metadata URI */	TokenNameCOMMENT_JAVADOC	 metadata URI 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
/** is metadata found anywhere */	TokenNameCOMMENT_JAVADOC	 is metadata found anywhere 
protected	TokenNameprotected	
boolean	TokenNameboolean	
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** does the actual artifact for this metadata exists */	TokenNameCOMMENT_JAVADOC	 does the actual artifact for this metadata exists 
protected	TokenNameprotected	
boolean	TokenNameboolean	
artifactExists	TokenNameIdentifier	 artifact Exists
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** artifact URI */	TokenNameCOMMENT_JAVADOC	 artifact URI 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
artifactUri	TokenNameIdentifier	 artifact Uri
;	TokenNameSEMICOLON	
/** error message */	TokenNameCOMMENT_JAVADOC	 error message 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ind1	TokenNameIdentifier	 ind1
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ind2	TokenNameIdentifier	 ind2
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ind1	TokenNameIdentifier	 ind1
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ind2	TokenNameIdentifier	 ind2
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ind1	TokenNameIdentifier	 ind1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ind1	TokenNameIdentifier	 ind1
==	TokenNameEQUAL_EQUAL	
ind2	TokenNameIdentifier	 ind2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
ind1	TokenNameIdentifier	 ind1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
ind1	TokenNameIdentifier	 ind1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ind2	TokenNameIdentifier	 ind2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
ind2	TokenNameIdentifier	 ind2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
public	TokenNamepublic	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
public	TokenNamepublic	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
public	TokenNamepublic	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
artifactScope	TokenNameIdentifier	 artifact Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
artifactScope	TokenNameIdentifier	 artifact Scope
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
public	TokenNamepublic	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
artifactScope	TokenNameIdentifier	 artifact Scope
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
artifactScope	TokenNameIdentifier	 artifact Scope
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
public	TokenNamepublic	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
artifactScope	TokenNameIdentifier	 artifact Scope
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactUri	TokenNameIdentifier	 artifact Uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
artifactScope	TokenNameIdentifier	 artifact Scope
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
artifactUri	TokenNameIdentifier	 artifact Uri
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
public	TokenNamepublic	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
artifactScope	TokenNameIdentifier	 artifact Scope
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactUri	TokenNameIdentifier	 artifact Uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
why	TokenNameIdentifier	 why
,	TokenNameCOMMA	
boolean	TokenNameboolean	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifactScope	TokenNameIdentifier	 artifact Scope
=	TokenNameEQUAL	
artifactScope	TokenNameIdentifier	 artifact Scope
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
classifier	TokenNameIdentifier	 classifier
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifactUri	TokenNameIdentifier	 artifact Uri
=	TokenNameEQUAL	
artifactUri	TokenNameIdentifier	 artifact Uri
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
why	TokenNameIdentifier	 why
=	TokenNameEQUAL	
why	TokenNameIdentifier	 why
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
resolved	TokenNameIdentifier	 resolved
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
public	TokenNamepublic	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scopeString	TokenNameIdentifier	 scope String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactUri	TokenNameIdentifier	 artifact Uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
why	TokenNameIdentifier	 why
,	TokenNameCOMMA	
boolean	TokenNameboolean	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
scopeString	TokenNameIdentifier	 scope String
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
DEFAULT_SCOPE	TokenNameIdentifier	 DEFAULT  SCOPE
:	TokenNameCOLON	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
scopeString	TokenNameIdentifier	 scope String
)	TokenNameRPAREN	
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
artifactUri	TokenNameIdentifier	 artifact Uri
,	TokenNameCOMMA	
why	TokenNameIdentifier	 why
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
public	TokenNamepublic	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
af	TokenNameIdentifier	 af
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* if ( af != null ) { init( af ); } */	TokenNameCOMMENT_BLOCK	 if ( af != null ) { init( af ); } 
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
// public void init( ArtifactMetadata af ) 	TokenNameCOMMENT_LINE	public void init( ArtifactMetadata af ) 
// { 	TokenNameCOMMENT_LINE	{ 
// setGroupId( af.getGroupId() ); 	TokenNameCOMMENT_LINE	setGroupId( af.getGroupId() ); 
// setArtifactId( af.getArtifactId() ); 	TokenNameCOMMENT_LINE	setArtifactId( af.getArtifactId() ); 
// setVersion( af.getVersion() ); 	TokenNameCOMMENT_LINE	setVersion( af.getVersion() ); 
// setType( af.getType() ); 	TokenNameCOMMENT_LINE	setType( af.getType() ); 
// setScope( af.getScope() ); 	TokenNameCOMMENT_LINE	setScope( af.getScope() ); 
// setClassifier( af.getClassifier() ); 	TokenNameCOMMENT_LINE	setClassifier( af.getClassifier() ); 
// //setUri( af.getDownloadUrl() ); 	TokenNameCOMMENT_LINE	//setUri( af.getDownloadUrl() ); 
// 	TokenNameCOMMENT_LINE	 
// this.resolved = af.isResolved(); 	TokenNameCOMMENT_LINE	this.resolved = af.isResolved(); 
// } 	TokenNameCOMMENT_LINE	} 
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
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toDomainString	TokenNameIdentifier	 to Domain String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupId	TokenNameIdentifier	 group Id
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
this	TokenNamethis	
.	TokenNameDOT	
groupId	TokenNameIdentifier	 group Id
=	TokenNameEQUAL	
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCheckedType	TokenNameIdentifier	 get Checked Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"jar"	TokenNameStringLiteral	jar
:	TokenNameCOLON	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
getArtifactScope	TokenNameIdentifier	 get Artifact Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifactScope	TokenNameIdentifier	 artifact Scope
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
DEFAULT_SCOPE	TokenNameIdentifier	 DEFAULT  SCOPE
:	TokenNameCOLON	
artifactScope	TokenNameIdentifier	 artifact Scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setArtifactScope	TokenNameIdentifier	 set Artifact Scope
(	TokenNameLPAREN	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
artifactScope	TokenNameIdentifier	 artifact Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifactScope	TokenNameIdentifier	 artifact Scope
=	TokenNameEQUAL	
artifactScope	TokenNameIdentifier	 artifact Scope
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
this	TokenNamethis	
.	TokenNameDOT	
artifactScope	TokenNameIdentifier	 artifact Scope
=	TokenNameEQUAL	
scope	TokenNameIdentifier	 scope
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
DEFAULT_SCOPE	TokenNameIdentifier	 DEFAULT  SCOPE
:	TokenNameCOLON	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
scope	TokenNameIdentifier	 scope
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
classifier	TokenNameIdentifier	 classifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setClassifier	TokenNameIdentifier	 set Classifier
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
classifier	TokenNameIdentifier	 classifier
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
String	TokenNameIdentifier	 String
getUri	TokenNameIdentifier	 get Uri
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUri	TokenNameIdentifier	 set Uri
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getArtifactScope	TokenNameIdentifier	 get Artifact Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
getScopeAsEnum	TokenNameIdentifier	 get Scope As Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifactScope	TokenNameIdentifier	 artifact Scope
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
ArtifactScopeEnum	TokenNameIdentifier	 Artifact Scope Enum
.	TokenNameDOT	
DEFAULT_SCOPE	TokenNameIdentifier	 DEFAULT  SCOPE
:	TokenNameCOLON	
artifactScope	TokenNameIdentifier	 artifact Scope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isArtifactExists	TokenNameIdentifier	 is Artifact Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifactExists	TokenNameIdentifier	 artifact Exists
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setArtifactExists	TokenNameIdentifier	 set Artifact Exists
(	TokenNameLPAREN	
boolean	TokenNameboolean	
artifactExists	TokenNameIdentifier	 artifact Exists
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifactExists	TokenNameIdentifier	 artifact Exists
=	TokenNameEQUAL	
artifactExists	TokenNameIdentifier	 artifact Exists
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
>	TokenNameGREATER	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dependencies	TokenNameIdentifier	 dependencies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDependencies	TokenNameIdentifier	 set Dependencies
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
ArtifactMetadata	TokenNameIdentifier	 Artifact Metadata
>	TokenNameGREATER	
dependencies	TokenNameIdentifier	 dependencies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dependencies	TokenNameIdentifier	 dependencies
=	TokenNameEQUAL	
dependencies	TokenNameIdentifier	 dependencies
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
String	TokenNameIdentifier	 String
getWhy	TokenNameIdentifier	 get Why
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
why	TokenNameIdentifier	 why
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setWhy	TokenNameIdentifier	 set Why
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
why	TokenNameIdentifier	 why
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
why	TokenNameIdentifier	 why
=	TokenNameEQUAL	
why	TokenNameIdentifier	 why
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------------------- 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isError	TokenNameIdentifier	 is Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
error	TokenNameIdentifier	 error
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDependencyConflictId	TokenNameIdentifier	 get Dependency Conflict Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupId	TokenNameIdentifier	 group Id
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
//------------------------------------------------------------------ 	TokenNameCOMMENT_LINE	------------------------------------------------------------------ 
}	TokenNameRBRACE	
