/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SymbolHash	TokenNameIdentifier	 Symbol Hash
;	TokenNameSEMICOLON	
/** * the factory to create/return built-in schema 1.0 DVs and create user-defined DVs * * @xerces.internal * * @author Neeraj Bajaj, Sun Microsystems, inc. * @author Sandy Gao, IBM * @author Khaled Noaman, IBM * * @version $Id: SchemaDVFactoryImpl.java 710089 2008-11-03 16:01:16Z knoaman $ */	TokenNameCOMMENT_JAVADOC	 the factory to create/return built-in schema 1.0 DVs and create user-defined DVs * @xerces.internal * @author Neeraj Bajaj, Sun Microsystems, inc. @author Sandy Gao, IBM @author Khaled Noaman, IBM * @version $Id: SchemaDVFactoryImpl.java 710089 2008-11-03 16:01:16Z knoaman $ 
public	TokenNamepublic	
class	TokenNameclass	
SchemaDVFactoryImpl	TokenNameIdentifier	 Schema DV Factory Impl
extends	TokenNameextends	
BaseSchemaDVFactory	TokenNameIdentifier	 Base Schema DV Factory
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
SymbolHash	TokenNameIdentifier	 Symbol Hash
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
=	TokenNameEQUAL	
new	TokenNamenew	
SymbolHash	TokenNameIdentifier	 Symbol Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
createBuiltInTypes	TokenNameIdentifier	 create Built In Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create all built-in types 	TokenNameCOMMENT_LINE	create all built-in types 
static	TokenNamestatic	
void	TokenNamevoid	
createBuiltInTypes	TokenNameIdentifier	 create Built In Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createBuiltInTypes	TokenNameIdentifier	 create Built In Types
(	TokenNameLPAREN	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
fAnySimpleType	TokenNameIdentifier	 f Any Simple Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: move specific 1.0 DV implementation from base 	TokenNameCOMMENT_LINE	TODO: move specific 1.0 DV implementation from base 
}	TokenNameRBRACE	
//createBuiltInTypes() 	TokenNameCOMMENT_LINE	createBuiltInTypes() 
/** * Get a built-in simple type of the given name * REVISIT: its still not decided within the Schema WG how to define the * ur-types and if all simple types should be derived from a * complex type, so as of now we ignore the fact that anySimpleType * is derived from anyType, and pass 'null' as the base of * anySimpleType. It needs to be changed as per the decision taken. * * @param name the name of the datatype * @return the datatype validator of the given name */	TokenNameCOMMENT_JAVADOC	 Get a built-in simple type of the given name REVISIT: its still not decided within the Schema WG how to define the ur-types and if all simple types should be derived from a complex type, so as of now we ignore the fact that anySimpleType is derived from anyType, and pass 'null' as the base of anySimpleType. It needs to be changed as per the decision taken. * @param name the name of the datatype @return the datatype validator of the given name 
public	TokenNamepublic	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
getBuiltInType	TokenNameIdentifier	 get Built In Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
)	TokenNameRPAREN	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get all built-in simple types, which are stored in a hashtable keyed by * the name * * @return a hashtable which contains all built-in simple types */	TokenNameCOMMENT_JAVADOC	 get all built-in simple types, which are stored in a hashtable keyed by the name * @return a hashtable which contains all built-in simple types 
public	TokenNamepublic	
SymbolHash	TokenNameIdentifier	 Symbol Hash
getBuiltInTypes	TokenNameIdentifier	 get Built In Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SymbolHash	TokenNameIdentifier	 Symbol Hash
)	TokenNameRPAREN	
fBuiltInTypes	TokenNameIdentifier	 f Built In Types
.	TokenNameDOT	
makeClone	TokenNameIdentifier	 make Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//SchemaDVFactoryImpl 	TokenNameCOMMENT_LINE	SchemaDVFactoryImpl 
