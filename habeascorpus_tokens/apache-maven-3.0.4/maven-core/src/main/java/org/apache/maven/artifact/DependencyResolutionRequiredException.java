package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Exception that occurs when an artifact file is used, but has not been resolved. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> * @todo it may be better for artifact.getFile() to throw it - perhaps it is a runtime exception? */	TokenNameCOMMENT_JAVADOC	 Exception that occurs when an artifact file is used, but has not been resolved. * @author <a href="mailto:brett@apache.org">Brett Porter</a> @todo it may be better for artifact.getFile() to throw it - perhaps it is a runtime exception? 
public	TokenNamepublic	
class	TokenNameclass	
DependencyResolutionRequiredException	TokenNameIdentifier	 Dependency Resolution Required Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
DependencyResolutionRequiredException	TokenNameIdentifier	 Dependency Resolution Required Exception
(	TokenNameLPAREN	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Attempted to access the artifact "	TokenNameStringLiteral	Attempted to access the artifact 
+	TokenNamePLUS	
artifact	TokenNameIdentifier	 artifact
+	TokenNamePLUS	
"; which has not yet been resolved"	TokenNameStringLiteral	; which has not yet been resolved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
