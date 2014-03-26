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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
ComponentLookupException	TokenNameIdentifier	 Component Lookup Exception
;	TokenNameSEMICOLON	
/** * Exception which is meant to occur when a layout specified for a particular * repository doesn't have a corresponding {@link ArtifactRepositoryLayout} * component in the current container. * * @author jdcasey */	TokenNameCOMMENT_JAVADOC	 Exception which is meant to occur when a layout specified for a particular repository doesn't have a corresponding {@link ArtifactRepositoryLayout} component in the current container. * @author jdcasey 
public	TokenNamepublic	
class	TokenNameclass	
UnknownRepositoryLayoutException	TokenNameIdentifier	 Unknown Repository Layout Exception
extends	TokenNameextends	
InvalidRepositoryException	TokenNameIdentifier	 Invalid Repository Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
layoutId	TokenNameIdentifier	 layout Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UnknownRepositoryLayoutException	TokenNameIdentifier	 Unknown Repository Layout Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
repositoryId	TokenNameIdentifier	 repository Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
layoutId	TokenNameIdentifier	 layout Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Cannot find ArtifactRepositoryLayout instance for: "	TokenNameStringLiteral	Cannot find ArtifactRepositoryLayout instance for: 
+	TokenNamePLUS	
layoutId	TokenNameIdentifier	 layout Id
,	TokenNameCOMMA	
repositoryId	TokenNameIdentifier	 repository Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
layoutId	TokenNameIdentifier	 layout Id
=	TokenNameEQUAL	
layoutId	TokenNameIdentifier	 layout Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
UnknownRepositoryLayoutException	TokenNameIdentifier	 Unknown Repository Layout Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
repositoryId	TokenNameIdentifier	 repository Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
layoutId	TokenNameIdentifier	 layout Id
,	TokenNameCOMMA	
ComponentLookupException	TokenNameIdentifier	 Component Lookup Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Cannot find ArtifactRepositoryLayout instance for: "	TokenNameStringLiteral	Cannot find ArtifactRepositoryLayout instance for: 
+	TokenNamePLUS	
layoutId	TokenNameIdentifier	 layout Id
,	TokenNameCOMMA	
repositoryId	TokenNameIdentifier	 repository Id
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
layoutId	TokenNameIdentifier	 layout Id
=	TokenNameEQUAL	
layoutId	TokenNameIdentifier	 layout Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLayoutId	TokenNameIdentifier	 get Layout Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
layoutId	TokenNameIdentifier	 layout Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
