package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
ArtifactHandlerMock	TokenNameIdentifier	 Artifact Handler Mock
implements	TokenNameimplements	
ArtifactHandler	TokenNameIdentifier	 Artifact Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
extension	TokenNameIdentifier	 extension
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
packaging	TokenNameIdentifier	 packaging
,	TokenNameCOMMA	
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
includesDependencies	TokenNameIdentifier	 includes Dependencies
,	TokenNameCOMMA	
addedToClasspath	TokenNameIdentifier	 added To Classpath
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setExtension	TokenNameIdentifier	 set Extension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
directory	TokenNameIdentifier	 directory
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
setPackaging	TokenNameIdentifier	 set Packaging
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
packaging	TokenNameIdentifier	 packaging
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
packaging	TokenNameIdentifier	 packaging
=	TokenNameEQUAL	
packaging	TokenNameIdentifier	 packaging
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPackaging	TokenNameIdentifier	 get Packaging
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
packaging	TokenNameIdentifier	 packaging
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setIncludesDependencies	TokenNameIdentifier	 set Includes Dependencies
(	TokenNameLPAREN	
boolean	TokenNameboolean	
includesDependencies	TokenNameIdentifier	 includes Dependencies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
includesDependencies	TokenNameIdentifier	 includes Dependencies
=	TokenNameEQUAL	
includesDependencies	TokenNameIdentifier	 includes Dependencies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isIncludesDependencies	TokenNameIdentifier	 is Includes Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
includesDependencies	TokenNameIdentifier	 includes Dependencies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLanguage	TokenNameIdentifier	 set Language
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
language	TokenNameIdentifier	 language
=	TokenNameEQUAL	
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAddedToClasspath	TokenNameIdentifier	 set Added To Classpath
(	TokenNameLPAREN	
boolean	TokenNameboolean	
addedToClasspath	TokenNameIdentifier	 added To Classpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
addedToClasspath	TokenNameIdentifier	 added To Classpath
=	TokenNameEQUAL	
addedToClasspath	TokenNameIdentifier	 added To Classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isAddedToClasspath	TokenNameIdentifier	 is Added To Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
addedToClasspath	TokenNameIdentifier	 added To Classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
