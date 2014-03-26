package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
classrealm	TokenNameIdentifier	 classrealm
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Describes a constituent of a class realm. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Describes a constituent of a class realm. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
ClassRealmConstituent	TokenNameIdentifier	 Class Realm Constituent
{	TokenNameLBRACE	
/** * Gets the group id of the constituent's artifact. * * @return The group id, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the group id of the constituent's artifact. * @return The group id, never {@code null}. 
String	TokenNameIdentifier	 String
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the artifact id of the constituent's artifact. * * @return The artifact id, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the artifact id of the constituent's artifact. * @return The artifact id, never {@code null}. 
String	TokenNameIdentifier	 String
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the type of the constituent's artifact. * * @return The type, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the type of the constituent's artifact. * @return The type, never {@code null}. 
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the classifier of the constituent's artifact. * * @return The classifier or an empty string, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the classifier of the constituent's artifact. * @return The classifier or an empty string, never {@code null}. 
String	TokenNameIdentifier	 String
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the version of the constituent's artifact. * * @return The version, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the version of the constituent's artifact. * @return The version, never {@code null}. 
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the file of the constituent's artifact. * * @return The file, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the file of the constituent's artifact. * @return The file, never {@code null}. 
File	TokenNameIdentifier	 File
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
