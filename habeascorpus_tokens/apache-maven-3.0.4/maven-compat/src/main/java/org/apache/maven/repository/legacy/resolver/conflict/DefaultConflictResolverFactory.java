package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
legacy	TokenNameIdentifier	 legacy
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
conflict	TokenNameIdentifier	 conflict
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
PlexusConstants	TokenNameIdentifier	 Plexus Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
PlexusContainer	TokenNameIdentifier	 Plexus Container
;	TokenNameSEMICOLON	
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
Requirement	TokenNameIdentifier	 Requirement
;	TokenNameSEMICOLON	
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
Context	TokenNameIdentifier	 Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
ContextException	TokenNameIdentifier	 Context Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
personality	TokenNameIdentifier	 personality
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
phase	TokenNameIdentifier	 phase
.	TokenNameDOT	
Contextualizable	TokenNameIdentifier	 Contextualizable
;	TokenNameSEMICOLON	
/** * A conflict resolver factory that obtains instances from a plexus container. * * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> * @todo you don't need the container in here with the active maps (jvz). * @since 3.0 */	TokenNameCOMMENT_JAVADOC	 A conflict resolver factory that obtains instances from a plexus container. * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> @todo you don't need the container in here with the active maps (jvz). @since 3.0 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ConflictResolverFactory	TokenNameIdentifier	 Conflict Resolver Factory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultConflictResolverFactory	TokenNameIdentifier	 Default Conflict Resolver Factory
implements	TokenNameimplements	
ConflictResolverFactory	TokenNameIdentifier	 Conflict Resolver Factory
,	TokenNameCOMMA	
Contextualizable	TokenNameIdentifier	 Contextualizable
{	TokenNameLBRACE	
// fields ----------------------------------------------------------------- 	TokenNameCOMMENT_LINE	fields ----------------------------------------------------------------- 
/** * The plexus container used to obtain instances from. */	TokenNameCOMMENT_JAVADOC	 The plexus container used to obtain instances from. 
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
PlexusContainer	TokenNameIdentifier	 Plexus Container
container	TokenNameIdentifier	 container
;	TokenNameSEMICOLON	
// ConflictResolverFactory methods ---------------------------------------- 	TokenNameCOMMENT_LINE	ConflictResolverFactory methods ---------------------------------------- 
/* * @see org.apache.maven.artifact.resolver.conflict.ConflictResolverFactory#getConflictResolver(java.lang.String) */	TokenNameCOMMENT_BLOCK	 @see org.apache.maven.artifact.resolver.conflict.ConflictResolverFactory#getConflictResolver(java.lang.String) 
public	TokenNamepublic	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
getConflictResolver	TokenNameIdentifier	 get Conflict Resolver
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConflictResolverNotFoundException	TokenNameIdentifier	 Conflict Resolver Not Found Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
)	TokenNameRPAREN	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
.	TokenNameDOT	
ROLE	TokenNameIdentifier	 ROLE
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ComponentLookupException	TokenNameIdentifier	 Component Lookup Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ConflictResolverNotFoundException	TokenNameIdentifier	 Conflict Resolver Not Found Exception
(	TokenNameLPAREN	
"Cannot find conflict resolver of type: "	TokenNameStringLiteral	Cannot find conflict resolver of type: 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Contextualizable methods ----------------------------------------------- 	TokenNameCOMMENT_LINE	Contextualizable methods ----------------------------------------------- 
/* * @see org.codehaus.plexus.personality.plexus.lifecycle.phase.Contextualizable#contextualize(org.codehaus.plexus.context.Context) */	TokenNameCOMMENT_BLOCK	 @see org.codehaus.plexus.personality.plexus.lifecycle.phase.Contextualizable#contextualize(org.codehaus.plexus.context.Context) 
public	TokenNamepublic	
void	TokenNamevoid	
contextualize	TokenNameIdentifier	 contextualize
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
ContextException	TokenNameIdentifier	 Context Exception
{	TokenNameLBRACE	
container	TokenNameIdentifier	 container
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PlexusContainer	TokenNameIdentifier	 Plexus Container
)	TokenNameRPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
PlexusConstants	TokenNameIdentifier	 Plexus Constants
.	TokenNameDOT	
PLEXUS_KEY	TokenNameIdentifier	 PLEXUS  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
