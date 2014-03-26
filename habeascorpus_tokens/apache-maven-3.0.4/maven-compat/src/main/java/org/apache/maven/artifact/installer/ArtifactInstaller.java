package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
installer	TokenNameIdentifier	 installer
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
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
;	TokenNameSEMICOLON	
/** * @author <a href="michal@codehaus.org">Michal Maczka</a> */	TokenNameCOMMENT_JAVADOC	 @author <a href="michal@codehaus.org">Michal Maczka</a> 
public	TokenNamepublic	
interface	TokenNameinterface	
ArtifactInstaller	TokenNameIdentifier	 Artifact Installer
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
ArtifactInstaller	TokenNameIdentifier	 Artifact Installer
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Install an artifact from a particular directory. The artifact handler is used to determine * the filename of the source file. * * @param basedir the directory where the artifact is stored * @param finalName the name of the artifact sans extension * @param artifact the artifact definition * @param localRepository the local repository to install into * @throws ArtifactInstallationException if an error occurred installing the artifact * @deprecated to be removed before 2.0 after the instlal/deploy plugins use the alternate * method */	TokenNameCOMMENT_JAVADOC	 Install an artifact from a particular directory. The artifact handler is used to determine the filename of the source file. * @param basedir the directory where the artifact is stored @param finalName the name of the artifact sans extension @param artifact the artifact definition @param localRepository the local repository to install into @throws ArtifactInstallationException if an error occurred installing the artifact @deprecated to be removed before 2.0 after the instlal/deploy plugins use the alternate method 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
void	TokenNamevoid	
install	TokenNameIdentifier	 install
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
finalName	TokenNameIdentifier	 final Name
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactInstallationException	TokenNameIdentifier	 Artifact Installation Exception
;	TokenNameSEMICOLON	
/** * Install an artifact from a particular file. * * @param source the file to install * @param artifact the artifact definition * @param localRepository the local repository to install into * @throws ArtifactInstallationException if an error occurred installing the artifact */	TokenNameCOMMENT_JAVADOC	 Install an artifact from a particular file. * @param source the file to install @param artifact the artifact definition @param localRepository the local repository to install into @throws ArtifactInstallationException if an error occurred installing the artifact 
void	TokenNamevoid	
install	TokenNameIdentifier	 install
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
,	TokenNameCOMMA	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
localRepository	TokenNameIdentifier	 local Repository
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArtifactInstallationException	TokenNameIdentifier	 Artifact Installation Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
