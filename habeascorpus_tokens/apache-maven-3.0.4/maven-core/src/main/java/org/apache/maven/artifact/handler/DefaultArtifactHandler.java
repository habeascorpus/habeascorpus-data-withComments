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
/** * @author <a href="mailto:brett@apache.org">Brett Porter</a> * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 @author <a href="mailto:brett@apache.org">Brett Porter</a> @author Jason van Zyl 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ArtifactHandler	TokenNameIdentifier	 Artifact Handler
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultArtifactHandler	TokenNameIdentifier	 Default Artifact Handler
implements	TokenNameimplements	
ArtifactHandler	TokenNameIdentifier	 Artifact Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
classifier	TokenNameIdentifier	 classifier
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
packaging	TokenNameIdentifier	 packaging
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
includesDependencies	TokenNameIdentifier	 includes Dependencies
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
language	TokenNameIdentifier	 language
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
addedToClasspath	TokenNameIdentifier	 added To Classpath
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultArtifactHandler	TokenNameIdentifier	 Default Artifact Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultArtifactHandler	TokenNameIdentifier	 Default Artifact Handler
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
String	TokenNameIdentifier	 String
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
classifier	TokenNameIdentifier	 classifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
getPackaging	TokenNameIdentifier	 get Packaging
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"s"	TokenNameStringLiteral	s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPackaging	TokenNameIdentifier	 get Packaging
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
packaging	TokenNameIdentifier	 packaging
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
packaging	TokenNameIdentifier	 packaging
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
packaging	TokenNameIdentifier	 packaging
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
String	TokenNameIdentifier	 String
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
language	TokenNameIdentifier	 language
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
language	TokenNameIdentifier	 language
=	TokenNameEQUAL	
"none"	TokenNameStringLiteral	none
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
language	TokenNameIdentifier	 language
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
boolean	TokenNameboolean	
isAddedToClasspath	TokenNameIdentifier	 is Added To Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
addedToClasspath	TokenNameIdentifier	 added To Classpath
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
}	TokenNameRBRACE	
