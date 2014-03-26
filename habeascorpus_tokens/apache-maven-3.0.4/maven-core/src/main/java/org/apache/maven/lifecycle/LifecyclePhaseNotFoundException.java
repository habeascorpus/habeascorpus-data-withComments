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
/** * Signals a failure to locate the lifecycle for some phase. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Signals a failure to locate the lifecycle for some phase. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
LifecyclePhaseNotFoundException	TokenNameIdentifier	 Lifecycle Phase Not Found Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
;	TokenNameSEMICOLON	
/** * Creates a new exception to indicate that the specified lifecycle phase is not defined by any known lifecycle. * * @param message The detail message, may be {@code null}. * @param lifecyclePhase The name of the lifecycle phase that could not be located, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new exception to indicate that the specified lifecycle phase is not defined by any known lifecycle. * @param message The detail message, may be {@code null}. @param lifecyclePhase The name of the lifecycle phase that could not be located, may be {@code null}. 
public	TokenNamepublic	
LifecyclePhaseNotFoundException	TokenNameIdentifier	 Lifecycle Phase Not Found Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the lifecycle phase that was not found. * * @return The lifecycle phase that was not found, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the lifecycle phase that was not found. * @return The lifecycle phase that was not found, never {@code null}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLifecyclePhase	TokenNameIdentifier	 get Lifecycle Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lifecyclePhase	TokenNameIdentifier	 lifecycle Phase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
