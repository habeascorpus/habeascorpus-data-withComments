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
/** * Indicates that a specified conflict resolver implementation could not be found. * * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> * @since 3.0 */	TokenNameCOMMENT_JAVADOC	 Indicates that a specified conflict resolver implementation could not be found. * @author <a href="mailto:markhobson@gmail.com">Mark Hobson</a> @since 3.0 
public	TokenNamepublic	
class	TokenNameclass	
ConflictResolverNotFoundException	TokenNameIdentifier	 Conflict Resolver Not Found Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// constants -------------------------------------------------------------- 	TokenNameCOMMENT_LINE	constants -------------------------------------------------------------- 
/** The serial version ID. */	TokenNameCOMMENT_JAVADOC	 The serial version ID. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3372412184339653914L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// constructors ----------------------------------------------------------- 	TokenNameCOMMENT_LINE	constructors ----------------------------------------------------------- 
/** * Creates a new <code>ConflictResolverNotFoundException</code> with the specified message. * * @param message the message */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>ConflictResolverNotFoundException</code> with the specified message. * @param message the message 
public	TokenNamepublic	
ConflictResolverNotFoundException	TokenNameIdentifier	 Conflict Resolver Not Found Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
