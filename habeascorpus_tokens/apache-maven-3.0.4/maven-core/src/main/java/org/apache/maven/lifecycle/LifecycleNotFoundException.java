package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Signals a failure to locate a lifecycle. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Signals a failure to locate a lifecycle. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
LifecycleNotFoundException	TokenNameIdentifier	 Lifecycle Not Found Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
lifecycleId	TokenNameIdentifier	 lifecycle Id
;	TokenNameSEMICOLON	
/** * Creates a new exception to indicate that the specified lifecycle is unknown. * * @param lifecycleId The identifier of the lifecycle that could not be located, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new exception to indicate that the specified lifecycle is unknown. * @param lifecycleId The identifier of the lifecycle that could not be located, may be {@code null}. 
public	TokenNamepublic	
LifecycleNotFoundException	TokenNameIdentifier	 Lifecycle Not Found Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lifecycleId	TokenNameIdentifier	 lifecycle Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Unknown lifecycle "	TokenNameStringLiteral	Unknown lifecycle 
+	TokenNamePLUS	
lifecycleId	TokenNameIdentifier	 lifecycle Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lifecycleId	TokenNameIdentifier	 lifecycle Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lifecycleId	TokenNameIdentifier	 lifecycle Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
lifecycleId	TokenNameIdentifier	 lifecycle Id
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the identifier of the lifecycle that was not found. * * @return The identifier of the lifecycle that was not found, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the identifier of the lifecycle that was not found. * @return The identifier of the lifecycle that was not found, never {@code null}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLifecycleId	TokenNameIdentifier	 get Lifecycle Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lifecycleId	TokenNameIdentifier	 lifecycle Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
