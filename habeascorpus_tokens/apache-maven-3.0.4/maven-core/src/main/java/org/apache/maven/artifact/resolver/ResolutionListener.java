package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
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
versioning	TokenNameIdentifier	 versioning
.	TokenNameDOT	
VersionRange	TokenNameIdentifier	 Version Range
;	TokenNameSEMICOLON	
/** * Listens to the resolution process and handles events. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Listens to the resolution process and handles events. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
interface	TokenNameinterface	
ResolutionListener	TokenNameIdentifier	 Resolution Listener
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
ResolutionListener	TokenNameIdentifier	 Resolution Listener
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
TEST_ARTIFACT	TokenNameIdentifier	 TEST  ARTIFACT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
PROCESS_CHILDREN	TokenNameIdentifier	 PROCESS  CHILDREN
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
FINISH_PROCESSING_CHILDREN	TokenNameIdentifier	 FINISH  PROCESSING  CHILDREN
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
INCLUDE_ARTIFACT	TokenNameIdentifier	 INCLUDE  ARTIFACT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
OMIT_FOR_NEARER	TokenNameIdentifier	 OMIT  FOR  NEARER
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
UPDATE_SCOPE	TokenNameIdentifier	 UPDATE  SCOPE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
int	TokenNameint	
MANAGE_ARTIFACT	TokenNameIdentifier	 MANAGE  ARTIFACT
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
OMIT_FOR_CYCLE	TokenNameIdentifier	 OMIT  FOR  CYCLE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * this event means that the artifactScope has NOT been updated to a farther node artifactScope because current * node is in the first level pom */	TokenNameCOMMENT_JAVADOC	 this event means that the artifactScope has NOT been updated to a farther node artifactScope because current node is in the first level pom 
int	TokenNameint	
UPDATE_SCOPE_CURRENT_POM	TokenNameIdentifier	 UPDATE  SCOPE  CURRENT  POM
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
SELECT_VERSION_FROM_RANGE	TokenNameIdentifier	 SELECT  VERSION  FROM  RANGE
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
RESTRICT_RANGE	TokenNameIdentifier	 RESTRICT  RANGE
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
MANAGE_ARTIFACT_VERSION	TokenNameIdentifier	 MANAGE  ARTIFACT  VERSION
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
MANAGE_ARTIFACT_SCOPE	TokenNameIdentifier	 MANAGE  ARTIFACT  SCOPE
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
MANAGE_ARTIFACT_SYSTEM_PATH	TokenNameIdentifier	 MANAGE  ARTIFACT  SYSTEM  PATH
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
testArtifact	TokenNameIdentifier	 test Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
startProcessChildren	TokenNameIdentifier	 start Process Children
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
endProcessChildren	TokenNameIdentifier	 end Process Children
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
includeArtifact	TokenNameIdentifier	 include Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
omitForNearer	TokenNameIdentifier	 omit For Nearer
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
omitted	TokenNameIdentifier	 omitted
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
kept	TokenNameIdentifier	 kept
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
updateScope	TokenNameIdentifier	 update Scope
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scope	TokenNameIdentifier	 scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
void	TokenNamevoid	
manageArtifact	TokenNameIdentifier	 manage Artifact
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
replacement	TokenNameIdentifier	 replacement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO Use the following two instead of manageArtifact 	TokenNameCOMMENT_LINE	TODO Use the following two instead of manageArtifact 
// TODO Remove ResolutionListenerDM interface 	TokenNameCOMMENT_LINE	TODO Remove ResolutionListenerDM interface 
//void manageArtifactVersion( Artifact artifact, Artifact replacement ); 	TokenNameCOMMENT_LINE	void manageArtifactVersion( Artifact artifact, Artifact replacement ); 
//void manageArtifactScope( Artifact artifact, Artifact replacement ); 	TokenNameCOMMENT_LINE	void manageArtifactScope( Artifact artifact, Artifact replacement ); 
void	TokenNamevoid	
omitForCycle	TokenNameIdentifier	 omit For Cycle
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This event means that the artifactScope has NOT been updated to a farther node artifactScope because current * node is in the first level pom * * @param artifact current node artifact, the one in the first level pom * @param ignoredScope artifactScope that was ignored because artifact was in first level pom */	TokenNameCOMMENT_JAVADOC	 This event means that the artifactScope has NOT been updated to a farther node artifactScope because current node is in the first level pom * @param artifact current node artifact, the one in the first level pom @param ignoredScope artifactScope that was ignored because artifact was in first level pom 
void	TokenNamevoid	
updateScopeCurrentPom	TokenNameIdentifier	 update Scope Current Pom
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ignoredScope	TokenNameIdentifier	 ignored Scope
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
selectVersionFromRange	TokenNameIdentifier	 select Version From Range
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
restrictRange	TokenNameIdentifier	 restrict Range
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
replacement	TokenNameIdentifier	 replacement
,	TokenNameCOMMA	
VersionRange	TokenNameIdentifier	 Version Range
newRange	TokenNameIdentifier	 new Range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
