package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
resolution	TokenNameIdentifier	 resolution
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
;	TokenNameSEMICOLON	
/** * Signals an error when adding a repository to the model resolver. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Signals an error when adding a repository to the model resolver. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
InvalidRepositoryException	TokenNameIdentifier	 Invalid Repository Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
/** * The repository that raised this error, can be {@code null}. */	TokenNameCOMMENT_JAVADOC	 The repository that raised this error, can be {@code null}. 
private	TokenNameprivate	
Repository	TokenNameIdentifier	 Repository
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
/** * Creates a new exception with specified detail message and cause for the given repository. * * @param message The detail message, may be {@code null}. * @param repository The repository that caused the error, may be {@code null}. * @param cause The cause, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new exception with specified detail message and cause for the given repository. * @param message The detail message, may be {@code null}. @param repository The repository that caused the error, may be {@code null}. @param cause The cause, may be {@code null}. 
public	TokenNamepublic	
InvalidRepositoryException	TokenNameIdentifier	 Invalid Repository Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Repository	TokenNameIdentifier	 Repository
repository	TokenNameIdentifier	 repository
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
=	TokenNameEQUAL	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new exception with specified detail message for the given repository. * * @param message The detail message, may be {@code null}. * @param repository The repository that caused the error, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new exception with specified detail message for the given repository. * @param message The detail message, may be {@code null}. @param repository The repository that caused the error, may be {@code null}. 
public	TokenNamepublic	
InvalidRepositoryException	TokenNameIdentifier	 Invalid Repository Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Repository	TokenNameIdentifier	 Repository
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
=	TokenNameEQUAL	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the repository that causes this error (if any). * * @return The repository that causes this error or {@code null} if not known. */	TokenNameCOMMENT_JAVADOC	 Gets the repository that causes this error (if any). * @return The repository that causes this error or {@code null} if not known. 
public	TokenNamepublic	
Repository	TokenNameIdentifier	 Repository
getRepository	TokenNameIdentifier	 get Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
