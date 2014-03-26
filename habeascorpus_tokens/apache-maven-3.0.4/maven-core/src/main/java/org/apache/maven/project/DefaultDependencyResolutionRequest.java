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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
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
DependencyFilter	TokenNameIdentifier	 Dependency Filter
;	TokenNameSEMICOLON	
/** * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
DefaultDependencyResolutionRequest	TokenNameIdentifier	 Default Dependency Resolution Request
implements	TokenNameimplements	
DependencyResolutionRequest	TokenNameIdentifier	 Dependency Resolution Request
{	TokenNameLBRACE	
private	TokenNameprivate	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DependencyFilter	TokenNameIdentifier	 Dependency Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultDependencyResolutionRequest	TokenNameIdentifier	 Default Dependency Resolution Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// enables default constructor 	TokenNameCOMMENT_LINE	enables default constructor 
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultDependencyResolutionRequest	TokenNameIdentifier	 Default Dependency Resolution Request
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setMavenProject	TokenNameIdentifier	 set Maven Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setRepositorySession	TokenNameIdentifier	 set Repository Session
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DependencyFilter	TokenNameIdentifier	 Dependency Filter
getResolutionFilter	TokenNameIdentifier	 get Resolution Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenProject	TokenNameIdentifier	 Maven Project
getMavenProject	TokenNameIdentifier	 get Maven Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
getRepositorySession	TokenNameIdentifier	 get Repository Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
session	TokenNameIdentifier	 session
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DependencyResolutionRequest	TokenNameIdentifier	 Dependency Resolution Request
setResolutionFilter	TokenNameIdentifier	 set Resolution Filter
(	TokenNameLPAREN	
DependencyFilter	TokenNameIdentifier	 Dependency Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DependencyResolutionRequest	TokenNameIdentifier	 Dependency Resolution Request
setMavenProject	TokenNameIdentifier	 set Maven Project
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DependencyResolutionRequest	TokenNameIdentifier	 Dependency Resolution Request
setRepositorySession	TokenNameIdentifier	 set Repository Session
(	TokenNameLPAREN	
RepositorySystemSession	TokenNameIdentifier	 Repository System Session
repositorySession	TokenNameIdentifier	 repository Session
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
repositorySession	TokenNameIdentifier	 repository Session
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
