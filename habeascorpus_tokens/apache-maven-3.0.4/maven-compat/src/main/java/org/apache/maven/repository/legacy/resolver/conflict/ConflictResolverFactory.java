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
/** * A factory that produces conflict resolvers of various types. * * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> * @see ConflictResolver * @since 3.0 */	TokenNameCOMMENT_JAVADOC	 A factory that produces conflict resolvers of various types. * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> @see ConflictResolver @since 3.0 
public	TokenNamepublic	
interface	TokenNameinterface	
ConflictResolverFactory	TokenNameIdentifier	 Conflict Resolver Factory
{	TokenNameLBRACE	
// constants -------------------------------------------------------------- 	TokenNameCOMMENT_LINE	constants -------------------------------------------------------------- 
/** The plexus role for this component. */	TokenNameCOMMENT_JAVADOC	 The plexus role for this component. 
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
ConflictResolverFactory	TokenNameIdentifier	 Conflict Resolver Factory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// methods ---------------------------------------------------------------- 	TokenNameCOMMENT_LINE	methods ---------------------------------------------------------------- 
/** * Gets a conflict resolver of the specified type. * * @param type the type of conflict resolver to obtain * @return the conflict resolver * @throws ConflictResolverNotFoundException * if the specified type was not found */	TokenNameCOMMENT_JAVADOC	 Gets a conflict resolver of the specified type. * @param type the type of conflict resolver to obtain @return the conflict resolver @throws ConflictResolverNotFoundException if the specified type was not found 
ConflictResolver	TokenNameIdentifier	 Conflict Resolver
getConflictResolver	TokenNameIdentifier	 get Conflict Resolver
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConflictResolverNotFoundException	TokenNameIdentifier	 Conflict Resolver Not Found Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
