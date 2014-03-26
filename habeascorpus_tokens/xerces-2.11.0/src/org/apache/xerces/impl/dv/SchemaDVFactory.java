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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSObjectList	TokenNameIdentifier	 XS Object List
;	TokenNameSEMICOLON	
/** * Defines a factory API that enables applications to <p> * 1. to get the instance of specified SchemaDVFactory implementation <p> * 2. to create/return built-in schema simple types <p> * 3. to create user defined simple types. <p> * * Implementations of this abstract class can be used to get built-in simple * types and create user-defined simle types. <p> * * The implementation should store the built-in datatypes in static data, so * that they can be shared by multiple parser instance, and multiple threads. * * @xerces.internal * * @author Sandy Gao, IBM * * @version $Id: SchemaDVFactory.java 558582 2007-07-23 02:05:04Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Defines a factory API that enables applications to <p> 1. to get the instance of specified SchemaDVFactory implementation <p> 2. to create/return built-in schema simple types <p> 3. to create user defined simple types. <p> * Implementations of this abstract class can be used to get built-in simple types and create user-defined simle types. <p> * The implementation should store the built-in datatypes in static data, so that they can be shared by multiple parser instance, and multiple threads. * @xerces.internal * @author Sandy Gao, IBM * @version $Id: SchemaDVFactory.java 558582 2007-07-23 02:05:04Z mrglavas $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SchemaDVFactory	TokenNameIdentifier	 Schema DV Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_FACTORY_CLASS	TokenNameIdentifier	 DEFAULT  FACTORY  CLASS
=	TokenNameEQUAL	
"org.apache.xerces.impl.dv.xs.SchemaDVFactoryImpl"	TokenNameStringLiteral	org.apache.xerces.impl.dv.xs.SchemaDVFactoryImpl
;	TokenNameSEMICOLON	
/** * Get a default instance of SchemaDVFactory implementation. * * @return an instance of SchemaDVFactory implementation * @exception DVFactoryException cannot create an instance of the specified * class name or the default class name */	TokenNameCOMMENT_JAVADOC	 Get a default instance of SchemaDVFactory implementation. * @return an instance of SchemaDVFactory implementation @exception DVFactoryException cannot create an instance of the specified class name or the default class name 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SchemaDVFactory	TokenNameIdentifier	 Schema DV Factory
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DVFactoryException	TokenNameIdentifier	 DV Factory Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
DEFAULT_FACTORY_CLASS	TokenNameIdentifier	 DEFAULT  FACTORY  CLASS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//getInstance(): SchemaDVFactory 	TokenNameCOMMENT_LINE	getInstance(): SchemaDVFactory 
/** * Get an instance of SchemaDVFactory implementation. * * @param factoryClass name of the schema factory implementation to instantiate. * @return an instance of SchemaDVFactory implementation * @exception DVFactoryException cannot create an instance of the specified * class name or the default class name */	TokenNameCOMMENT_JAVADOC	 Get an instance of SchemaDVFactory implementation. * @param factoryClass name of the schema factory implementation to instantiate. @return an instance of SchemaDVFactory implementation @exception DVFactoryException cannot create an instance of the specified class name or the default class name 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SchemaDVFactory	TokenNameIdentifier	 Schema DV Factory
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
factoryClass	TokenNameIdentifier	 factory Class
)	TokenNameRPAREN	
throws	TokenNamethrows	
DVFactoryException	TokenNameIdentifier	 DV Factory Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// if the class name is not specified, use the default one 	TokenNameCOMMENT_LINE	if the class name is not specified, use the default one 
return	TokenNamereturn	
(	TokenNameLPAREN	
SchemaDVFactory	TokenNameIdentifier	 Schema DV Factory
)	TokenNameRPAREN	
(	TokenNameLPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
factoryClass	TokenNameIdentifier	 factory Class
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
e4	TokenNameIdentifier	 e4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DVFactoryException	TokenNameIdentifier	 DV Factory Exception
(	TokenNameLPAREN	
"Schema factory class "	TokenNameStringLiteral	Schema factory class 
+	TokenNamePLUS	
factoryClass	TokenNameIdentifier	 factory Class
+	TokenNamePLUS	
" does not extend from SchemaDVFactory."	TokenNameStringLiteral	 does not extend from SchemaDVFactory.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// can't create a new object of this class 	TokenNameCOMMENT_LINE	can't create a new object of this class 
protected	TokenNameprotected	
SchemaDVFactory	TokenNameIdentifier	 Schema DV Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get a built-in simple type of the given name * REVISIT: its still not decided within the Schema WG how to define the * ur-types and if all simple types should be derived from a * complex type, so as of now we ignore the fact that anySimpleType * is derived from anyType, and pass 'null' as the base of * anySimpleType. It needs to be changed as per the decision taken. * * @param name the name of the datatype * @return the datatype validator of the given name */	TokenNameCOMMENT_JAVADOC	 Get a built-in simple type of the given name REVISIT: its still not decided within the Schema WG how to define the ur-types and if all simple types should be derived from a complex type, so as of now we ignore the fact that anySimpleType is derived from anyType, and pass 'null' as the base of anySimpleType. It needs to be changed as per the decision taken. * @param name the name of the datatype @return the datatype validator of the given name 
public	TokenNamepublic	
abstract	TokenNameabstract	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
getBuiltInType	TokenNameIdentifier	 get Built In Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * get all built-in simple types, which are stored in a SymbolHash keyed by * the name * * @return a SymbolHash which contains all built-in simple types */	TokenNameCOMMENT_JAVADOC	 get all built-in simple types, which are stored in a SymbolHash keyed by the name * @return a SymbolHash which contains all built-in simple types 
public	TokenNamepublic	
abstract	TokenNameabstract	
SymbolHash	TokenNameIdentifier	 Symbol Hash
getBuiltInTypes	TokenNameIdentifier	 get Built In Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new simple type which is derived by restriction from another * simple type. * * @param name name of the new type, could be null * @param targetNamespace target namespace of the new type, could be null * @param finalSet value of "final" * @param base base type of the new type * @param annotations set of annotations * @return the newly created simple type */	TokenNameCOMMENT_JAVADOC	 Create a new simple type which is derived by restriction from another simple type. * @param name name of the new type, could be null @param targetNamespace target namespace of the new type, could be null @param finalSet value of "final" @param base base type of the new type @param annotations set of annotations @return the newly created simple type 
public	TokenNamepublic	
abstract	TokenNameabstract	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
createTypeRestriction	TokenNameIdentifier	 create Type Restriction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
targetNamespace	TokenNameIdentifier	 target Namespace
,	TokenNameCOMMA	
short	TokenNameshort	
finalSet	TokenNameIdentifier	 final Set
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
XSObjectList	TokenNameIdentifier	 XS Object List
annotations	TokenNameIdentifier	 annotations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new simple type which is derived by list from another simple * type. * * @param name name of the new type, could be null * @param targetNamespace target namespace of the new type, could be null * @param finalSet value of "final" * @param itemType item type of the list type * @param annotations set of annotations * @return the newly created simple type */	TokenNameCOMMENT_JAVADOC	 Create a new simple type which is derived by list from another simple type. * @param name name of the new type, could be null @param targetNamespace target namespace of the new type, could be null @param finalSet value of "final" @param itemType item type of the list type @param annotations set of annotations @return the newly created simple type 
public	TokenNamepublic	
abstract	TokenNameabstract	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
createTypeList	TokenNameIdentifier	 create Type List
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
targetNamespace	TokenNameIdentifier	 target Namespace
,	TokenNameCOMMA	
short	TokenNameshort	
finalSet	TokenNameIdentifier	 final Set
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
itemType	TokenNameIdentifier	 item Type
,	TokenNameCOMMA	
XSObjectList	TokenNameIdentifier	 XS Object List
annotations	TokenNameIdentifier	 annotations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new simple type which is derived by union from a list of other * simple types. * * @param name name of the new type, could be null * @param targetNamespace target namespace of the new type, could be null * @param finalSet value of "final" * @param memberTypes member types of the union type * @param annotations set of annotations * @return the newly created simple type */	TokenNameCOMMENT_JAVADOC	 Create a new simple type which is derived by union from a list of other simple types. * @param name name of the new type, could be null @param targetNamespace target namespace of the new type, could be null @param finalSet value of "final" @param memberTypes member types of the union type @param annotations set of annotations @return the newly created simple type 
public	TokenNamepublic	
abstract	TokenNameabstract	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
createTypeUnion	TokenNameIdentifier	 create Type Union
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
targetNamespace	TokenNameIdentifier	 target Namespace
,	TokenNameCOMMA	
short	TokenNameshort	
finalSet	TokenNameIdentifier	 final Set
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
memberTypes	TokenNameIdentifier	 member Types
,	TokenNameCOMMA	
XSObjectList	TokenNameIdentifier	 XS Object List
annotations	TokenNameIdentifier	 annotations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
