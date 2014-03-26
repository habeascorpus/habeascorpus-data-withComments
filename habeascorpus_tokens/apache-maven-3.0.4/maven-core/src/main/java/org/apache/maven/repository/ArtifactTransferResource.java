package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Describes a resource being uploaded or downloaded by the repository system. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Describes a resource being uploaded or downloaded by the repository system. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ArtifactTransferResource	TokenNameIdentifier	 Artifact Transfer Resource
{	TokenNameLBRACE	
/** * The base URL of the repository, e.g. "http://repo1.maven.org/maven2/". Unless the URL is unknown, it will be * terminated by a trailing slash. * * @return The base URL of the repository or an empty string if unknown, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 The base URL of the repository, e.g. "http://repo1.maven.org/maven2/". Unless the URL is unknown, it will be terminated by a trailing slash. * @return The base URL of the repository or an empty string if unknown, never {@code null}. 
String	TokenNameIdentifier	 String
getRepositoryUrl	TokenNameIdentifier	 get Repository Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The path of the artifact relative to the repository's base URL. * * @return The path of the artifact, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 The path of the artifact relative to the repository's base URL. * @return The path of the artifact, never {@code null}. 
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the full URL of the artifact. * * @return The full URL of the artifact, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the full URL of the artifact. * @return The full URL of the artifact, never {@code null}. 
String	TokenNameIdentifier	 String
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The size of the artifact in bytes. * * @return The of the artifact in bytes or a negative value if unknown. */	TokenNameCOMMENT_JAVADOC	 The size of the artifact in bytes. * @return The of the artifact in bytes or a negative value if unknown. 
long	TokenNamelong	
getContentLength	TokenNameIdentifier	 get Content Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the timestamp when the transfer of this artifact was started. * * @return The timestamp when the transfer of this artifact was started. */	TokenNameCOMMENT_JAVADOC	 Gets the timestamp when the transfer of this artifact was started. * @return The timestamp when the transfer of this artifact was started. 
long	TokenNamelong	
getTransferStartTime	TokenNameIdentifier	 get Transfer Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
