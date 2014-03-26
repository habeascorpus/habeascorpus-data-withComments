package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Model	TokenNameIdentifier	 Model
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
Profile	TokenNameIdentifier	 Profile
;	TokenNameSEMICOLON	
/** * Holds a model along with some auxiliary information. This internal utility class assists the model builder during POM * processing by providing a means to transport information that cannot be (easily) extracted from the model itself. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Holds a model along with some auxiliary information. This internal utility class assists the model builder during POM processing by providing a means to transport information that cannot be (easily) extracted from the model itself. * @author Benjamin Bentmann 
class	TokenNameclass	
ModelData	TokenNameIdentifier	 Model Data
{	TokenNameLBRACE	
private	TokenNameprivate	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Model	TokenNameIdentifier	 Model
rawModel	TokenNameIdentifier	 raw Model
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
activeProfiles	TokenNameIdentifier	 active Profiles
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
/** * Creates a new container for the specified model. * * @param model The model to wrap, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new container for the specified model. * @param model The model to wrap, may be {@code null}. 
public	TokenNamepublic	
ModelData	TokenNameIdentifier	 Model Data
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new container for the specified model. * * @param model The model to wrap, may be {@code null}. * @param groupId The effective group identifier of the model, may be {@code null}. * @param artifactId The effective artifact identifier of the model, may be {@code null}. * @param version The effective version of the model, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new container for the specified model. * @param model The model to wrap, may be {@code null}. @param groupId The effective group identifier of the model, may be {@code null}. @param artifactId The effective artifact identifier of the model, may be {@code null}. @param version The effective version of the model, may be {@code null}. 
public	TokenNamepublic	
ModelData	TokenNameIdentifier	 Model Data
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
groupId	TokenNameIdentifier	 group Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
setGroupId	TokenNameIdentifier	 set Group Id
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the model being wrapped. * * @return The model or {@code null} if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the model being wrapped. * @return The model or {@code null} if not set. 
public	TokenNamepublic	
Model	TokenNameIdentifier	 Model
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the model being wrapped. * * @param model The model, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the model being wrapped. * @param model The model, may be {@code null}. 
public	TokenNamepublic	
void	TokenNamevoid	
setModel	TokenNameIdentifier	 set Model
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the raw model being wrapped. * * @return The raw model or {@code null} if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the raw model being wrapped. * @return The raw model or {@code null} if not set. 
public	TokenNamepublic	
Model	TokenNameIdentifier	 Model
getRawModel	TokenNameIdentifier	 get Raw Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rawModel	TokenNameIdentifier	 raw Model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the raw model being wrapped. * * @param rawModel The raw model, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the raw model being wrapped. * @param rawModel The raw model, may be {@code null}. 
public	TokenNamepublic	
void	TokenNamevoid	
setRawModel	TokenNameIdentifier	 set Raw Model
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
rawModel	TokenNameIdentifier	 raw Model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rawModel	TokenNameIdentifier	 raw Model
=	TokenNameEQUAL	
rawModel	TokenNameIdentifier	 raw Model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the active profiles from the model. * * @return The active profiles or {@code null} if not set. */	TokenNameCOMMENT_JAVADOC	 Gets the active profiles from the model. * @return The active profiles or {@code null} if not set. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
getActiveProfiles	TokenNameIdentifier	 get Active Profiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
activeProfiles	TokenNameIdentifier	 active Profiles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the active profiles from the model. * * @param activeProfiles The active profiles, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the active profiles from the model. * @param activeProfiles The active profiles, may be {@code null}. 
public	TokenNamepublic	
void	TokenNamevoid	
setActiveProfiles	TokenNameIdentifier	 set Active Profiles
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Profile	TokenNameIdentifier	 Profile
>	TokenNameGREATER	
activeProfiles	TokenNameIdentifier	 active Profiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
activeProfiles	TokenNameIdentifier	 active Profiles
=	TokenNameEQUAL	
activeProfiles	TokenNameIdentifier	 active Profiles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the effective group identifier of the model. * * @return The effective group identifier of the model or an empty string if unknown, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the effective group identifier of the model. * @return The effective group identifier of the model or an empty string if unknown, never {@code null}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
groupId	TokenNameIdentifier	 group Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
groupId	TokenNameIdentifier	 group Id
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the effective group identifier of the model. * * @param groupId The effective group identifier of the model, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the effective group identifier of the model. * @param groupId The effective group identifier of the model, may be {@code null}. 
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
/** * Gets the effective artifact identifier of the model. * * @return The effective artifact identifier of the model or an empty string if unknown, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the effective artifact identifier of the model. * @return The effective artifact identifier of the model or an empty string if unknown, never {@code null}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
artifactId	TokenNameIdentifier	 artifact Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
artifactId	TokenNameIdentifier	 artifact Id
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the effective artifact identifier of the model. * * @param artifactId The effective artifact identifier of the model, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the effective artifact identifier of the model. * @param artifactId The effective artifact identifier of the model, may be {@code null}. 
public	TokenNamepublic	
void	TokenNamevoid	
setArtifactId	TokenNameIdentifier	 set Artifact Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
artifactId	TokenNameIdentifier	 artifact Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
artifactId	TokenNameIdentifier	 artifact Id
=	TokenNameEQUAL	
artifactId	TokenNameIdentifier	 artifact Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the effective version of the model. * * @return The effective version of the model or an empty string if unknown, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the effective version of the model. * @return The effective version of the model or an empty string if unknown, never {@code null}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
version	TokenNameIdentifier	 version
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the effective version of the model. * * @param version The effective version of the model, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the effective version of the model. * @param version The effective version of the model, may be {@code null}. 
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
/** * Gets the effective identifier of the model in the form {@code <groupId>:<artifactId>:<version>}. * * @return The effective identifier of the model, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the effective identifier of the model in the form {@code <groupId>:<artifactId>:<version>}. * @return The effective identifier of the model, never {@code null}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
96	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
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
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
