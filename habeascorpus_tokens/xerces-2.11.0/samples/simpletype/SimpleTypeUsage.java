/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
simpletype	TokenNameIdentifier	 simpletype
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
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
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
SchemaDVFactory	TokenNameIdentifier	 Schema DV Factory
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
ValidatedInfo	TokenNameIdentifier	 Validated Info
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
ValidationContext	TokenNameIdentifier	 Validation Context
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
XSFacets	TokenNameIdentifier	 XS Facets
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
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
ValidationState	TokenNameIdentifier	 Validation State
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
XSConstants	TokenNameIdentifier	 XS Constants
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
;	TokenNameSEMICOLON	
/** * It demonstrates how to use the interfaces defined in 'org.apache.xerces.impl.dv' * package for the purpose of * 1. how to query property information of Simple Type Definition Schema Component. * 2. how to get instance of SchemaDVFactory implementation. * 3. how to get built-in type/s and create new types as derived by restriction, list * or union, using factory methods of SchemaDVFactory. * 4. how to use those simple type (built-in/created) to validate the values. * This class is useful for any application which wants to use the simple type * implementation directly as separate module. * * @author Neeraj Bajaj Sun Microsystems, inc. * @version $Id: SimpleTypeUsage.java 950355 2010-06-02 03:43:24Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 It demonstrates how to use the interfaces defined in 'org.apache.xerces.impl.dv' package for the purpose of 1. how to query property information of Simple Type Definition Schema Component. 2. how to get instance of SchemaDVFactory implementation. 3. how to get built-in type/s and create new types as derived by restriction, list or union, using factory methods of SchemaDVFactory. 4. how to use those simple type (built-in/created) to validate the values. This class is useful for any application which wants to use the simple type implementation directly as separate module. * @author Neeraj Bajaj Sun Microsystems, inc. @version $Id: SimpleTypeUsage.java 950355 2010-06-02 03:43:24Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
SimpleTypeUsage	TokenNameIdentifier	 Simple Type Usage
{	TokenNameLBRACE	
static	TokenNamestatic	
SchemaDVFactory	TokenNameIdentifier	 Schema DV Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
XSFacets	TokenNameIdentifier	 XS Facets
facets	TokenNameIdentifier	 facets
=	TokenNameEQUAL	
new	TokenNamenew	
XSFacets	TokenNameIdentifier	 XS Facets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
fPresentFacets	TokenNameIdentifier	 f Present Facets
;	TokenNameSEMICOLON	
short	TokenNameshort	
fFixedFacets	TokenNameIdentifier	 f Fixed Facets
;	TokenNameSEMICOLON	
short	TokenNameshort	
fFinalSet	TokenNameIdentifier	 f Final Set
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SimpleTypeUsage	TokenNameIdentifier	 Simple Type Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Any application willing to switch to different implementation should 	TokenNameCOMMENT_LINE	Any application willing to switch to different implementation should 
//call SchemaDVFactory#setFactoryClass() as the first step before calling 	TokenNameCOMMENT_LINE	call SchemaDVFactory#setFactoryClass() as the first step before calling 
//SchemaDVFactory#getInstance(). 	TokenNameCOMMENT_LINE	SchemaDVFactory#getInstance(). 
//Suppose application wants to use class 'MySchemaDVFactoryImpl' as SchemaDVFactory 	TokenNameCOMMENT_LINE	Suppose application wants to use class 'MySchemaDVFactoryImpl' as SchemaDVFactory 
// implementation which resides in say 'myApp.simpleType' package. 	TokenNameCOMMENT_LINE	implementation which resides in say 'myApp.simpleType' package. 
//SchemaDVFactory.setFactoryClass("myApp.simpleType.MySchemaDVFactoryImpl.class"); 	TokenNameCOMMENT_LINE	SchemaDVFactory.setFactoryClass("myApp.simpleType.MySchemaDVFactoryImpl.class"); 
//this will give the instance of default implementation (SchemaDVFactoryImpl) 	TokenNameCOMMENT_LINE	this will give the instance of default implementation (SchemaDVFactoryImpl) 
// in 'org.apache.xerces.impl.dv.xs_new' package. 	TokenNameCOMMENT_LINE	in 'org.apache.xerces.impl.dv.xs_new' package. 
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
SchemaDVFactory	TokenNameIdentifier	 Schema DV Factory
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//SimpleTypeUsage() 	TokenNameCOMMENT_LINE	SimpleTypeUsage() 
/** * Get proper validation context, it provides the information required for the validation of datatypes id, idref, * entity, notation, qname , we need to get appropriate validation context for validating the content or creating * simple type (applyFacets). * @return ValidationContext */	TokenNameCOMMENT_JAVADOC	 Get proper validation context, it provides the information required for the validation of datatypes id, idref, entity, notation, qname , we need to get appropriate validation context for validating the content or creating simple type (applyFacets). @return ValidationContext 
private	TokenNameprivate	
ValidationContext	TokenNameIdentifier	 Validation Context
getValidationContext	TokenNameIdentifier	 get Validation Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ValidationState	TokenNameIdentifier	 Validation State
validationState	TokenNameIdentifier	 validation State
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// create an instance of 'ValidationState' providing the information required for the 	TokenNameCOMMENT_LINE	create an instance of 'ValidationState' providing the information required for the 
// validation of datatypes id, idref, entity, notation, qname. 	TokenNameCOMMENT_LINE	validation of datatypes id, idref, entity, notation, qname. 
// application can also provide its own implementation of ValidationContext if required, 	TokenNameCOMMENT_LINE	application can also provide its own implementation of ValidationContext if required, 
// an implementation of 'ValidationContext' is in 'org.apache.xerces.impl.validation' package. 	TokenNameCOMMENT_LINE	an implementation of 'ValidationContext' is in 'org.apache.xerces.impl.validation' package. 
validationState	TokenNameIdentifier	 validation State
=	TokenNameEQUAL	
new	TokenNamenew	
ValidationState	TokenNameIdentifier	 Validation State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// application need to pass validation context while validating string, object or creating simple type (applyFacets) 	TokenNameCOMMENT_LINE	application need to pass validation context while validating string, object or creating simple type (applyFacets) 
// derived by restriction, should set the following information accordingly 	TokenNameCOMMENT_LINE	derived by restriction, should set the following information accordingly 
//application should provide the namespace support by calling 	TokenNameCOMMENT_LINE	application should provide the namespace support by calling 
//validationState.setNamespaceSupport(...); 	TokenNameCOMMENT_LINE	validationState.setNamespaceSupport(...); 
//application can also provide 'SymbolTable' (org.apache.xerces.util.SymbolTable) like 	TokenNameCOMMENT_LINE	application can also provide 'SymbolTable' (org.apache.xerces.util.SymbolTable) like 
//validationState.setSymbolTable(....); 	TokenNameCOMMENT_LINE	validationState.setSymbolTable(....); 
//set proper value (true/false) for the given validation context 	TokenNameCOMMENT_LINE	set proper value (true/false) for the given validation context 
//validationState.setFacetChecking(true); 	TokenNameCOMMENT_LINE	validationState.setFacetChecking(true); 
//set proper value (true/false) for the given validation context 	TokenNameCOMMENT_LINE	set proper value (true/false) for the given validation context 
//validationState.setExtraChecking(false); 	TokenNameCOMMENT_LINE	validationState.setExtraChecking(false); 
return	TokenNamereturn	
validationState	TokenNameIdentifier	 validation State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * this method shows how to validate the content against the given simple type. * * @param String content to validate * @param XSSimpleType SimpleType Definition schema component against which to validate the content. * * @return ValidatedInfo validatedInfo object. */	TokenNameCOMMENT_JAVADOC	 this method shows how to validate the content against the given simple type. * @param String content to validate @param XSSimpleType SimpleType Definition schema component against which to validate the content. * @return ValidatedInfo validatedInfo object. 
public	TokenNamepublic	
ValidatedInfo	TokenNameIdentifier	 Validated Info
validateString	TokenNameIdentifier	 validate String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
simpleType	TokenNameIdentifier	 simple Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//create an instance of 'ValidatedInfo' to get back information (like actual value, 	TokenNameCOMMENT_LINE	create an instance of 'ValidatedInfo' to get back information (like actual value, 
//normalizedValue etc..)after content is validated. 	TokenNameCOMMENT_LINE	normalizedValue etc..)after content is validated. 
ValidatedInfo	TokenNameIdentifier	 Validated Info
validatedInfo	TokenNameIdentifier	 validated Info
=	TokenNameEQUAL	
new	TokenNamenew	
ValidatedInfo	TokenNameIdentifier	 Validated Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//get proper validation context , this is very important we need to get appropriate validation context while validating content 	TokenNameCOMMENT_LINE	get proper validation context , this is very important we need to get appropriate validation context while validating content 
//validation context passed is generally different while validating content and creating simple type (applyFacets) 	TokenNameCOMMENT_LINE	validation context passed is generally different while validating content and creating simple type (applyFacets) 
ValidationContext	TokenNameIdentifier	 Validation Context
validationState	TokenNameIdentifier	 validation State
=	TokenNameEQUAL	
getValidationContext	TokenNameIdentifier	 get Validation Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
validationState	TokenNameIdentifier	 validation State
,	TokenNameCOMMA	
validatedInfo	TokenNameIdentifier	 validated Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//now 'validatedInfo' object contains information 	TokenNameCOMMENT_LINE	now 'validatedInfo' object contains information 
// for number types (decimal, double, float, and types derived from them), 	TokenNameCOMMENT_LINE	for number types (decimal, double, float, and types derived from them), 
// Object return is BigDecimal, Double, Float respectively. 	TokenNameCOMMENT_LINE	Object return is BigDecimal, Double, Float respectively. 
// for some types (string and derived), they just return the string itself 	TokenNameCOMMENT_LINE	for some types (string and derived), they just return the string itself 
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
validatedInfo	TokenNameIdentifier	 validated Info
.	TokenNameDOT	
actualValue	TokenNameIdentifier	 actual Value
;	TokenNameSEMICOLON	
//so returned Object can be casted to actual java object like.. 	TokenNameCOMMENT_LINE	so returned Object can be casted to actual java object like.. 
//Boolean booleanDT = (Boolean)value; 	TokenNameCOMMENT_LINE	Boolean booleanDT = (Boolean)value; 
//The normalized value of a string value 	TokenNameCOMMENT_LINE	The normalized value of a string value 
String	TokenNameIdentifier	 String
normalizedValue	TokenNameIdentifier	 normalized Value
=	TokenNameEQUAL	
validatedInfo	TokenNameIdentifier	 validated Info
.	TokenNameDOT	
normalizedValue	TokenNameIdentifier	 normalized Value
;	TokenNameSEMICOLON	
//If the type is a union type, then the member type which 	TokenNameCOMMENT_LINE	If the type is a union type, then the member type which 
//actually validated the string value. 	TokenNameCOMMENT_LINE	actually validated the string value. 
XSSimpleType	TokenNameIdentifier	 XS Simple Type
memberType	TokenNameIdentifier	 member Type
=	TokenNameEQUAL	
validatedInfo	TokenNameIdentifier	 validated Info
.	TokenNameDOT	
memberType	TokenNameIdentifier	 member Type
;	TokenNameSEMICOLON	
return	TokenNamereturn	
validatedInfo	TokenNameIdentifier	 validated Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//validateString() 	TokenNameCOMMENT_LINE	validateString() 
/** * this method shows how to query information about the different properties of 'Simple Type' * definiton schema component. It prints the values of properties of 'SimpleType Definition * Schema Component'. * * @param simpleType object of XSSimpleType */	TokenNameCOMMENT_JAVADOC	 this method shows how to query information about the different properties of 'Simple Type' definiton schema component. It prints the values of properties of 'SimpleType Definition Schema Component'. * @param simpleType object of XSSimpleType 
public	TokenNamepublic	
void	TokenNamevoid	
querySimpleType	TokenNameIdentifier	 query Simple Type
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
simpleType	TokenNameIdentifier	 simple Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//getting information about the different properties of 'Simple Type' definition schema component. 	TokenNameCOMMENT_LINE	getting information about the different properties of 'Simple Type' definition schema component. 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Properties information of 'Simple Type' definiton schema component"	TokenNameStringLiteral	Properties information of 'Simple Type' definiton schema component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'name' property 	TokenNameCOMMENT_LINE	'name' property 
if	TokenNameif	
(	TokenNameLPAREN	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
getAnonymous	TokenNameIdentifier	 get Anonymous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Anonymous Simple Type"	TokenNameStringLiteral	Anonymous Simple Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'name' : "	TokenNameStringLiteral	'name' : 
+	TokenNamePLUS	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//'target namespace' property 	TokenNameCOMMENT_LINE	'target namespace' property 
String	TokenNameIdentifier	 String
targetNameSpace	TokenNameIdentifier	 target Name Space
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'target namespace' : "	TokenNameStringLiteral	'target namespace' : 
+	TokenNamePLUS	
targetNameSpace	TokenNameIdentifier	 target Name Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'variety' property 	TokenNameCOMMENT_LINE	'variety' property 
short	TokenNameshort	
variety	TokenNameIdentifier	 variety
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
getVariety	TokenNameIdentifier	 get Variety
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printVariety	TokenNameIdentifier	 print Variety
(	TokenNameLPAREN	
variety	TokenNameIdentifier	 variety
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//'base type definition' property 	TokenNameCOMMENT_LINE	'base type definition' property 
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
baseType	TokenNameIdentifier	 base Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
)	TokenNameRPAREN	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
getBaseType	TokenNameIdentifier	 get Base Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'base type definition' name : "	TokenNameStringLiteral	'base type definition' name : 
+	TokenNamePLUS	
(	TokenNameLPAREN	
baseType	TokenNameIdentifier	 base Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
baseType	TokenNameIdentifier	 base Type
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"null"	TokenNameStringLiteral	null
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'base type definition' target namespace : "	TokenNameStringLiteral	'base type definition' target namespace : 
+	TokenNamePLUS	
(	TokenNameLPAREN	
baseType	TokenNameIdentifier	 base Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
baseType	TokenNameIdentifier	 base Type
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"null"	TokenNameStringLiteral	null
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//check if base type is simple or complex 	TokenNameCOMMENT_LINE	check if base type is simple or complex 
if	TokenNameif	
(	TokenNameLPAREN	
baseType	TokenNameIdentifier	 base Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
baseType	TokenNameIdentifier	 base Type
.	TokenNameDOT	
getTypeCategory	TokenNameIdentifier	 get Type Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
.	TokenNameDOT	
SIMPLE_TYPE	TokenNameIdentifier	 SIMPLE  TYPE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//now we can get all the details of base type 	TokenNameCOMMENT_LINE	now we can get all the details of base type 
XSSimpleType	TokenNameIdentifier	 XS Simple Type
simpleTypeDecl	TokenNameIdentifier	 simple Type Decl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
)	TokenNameRPAREN	
baseType	TokenNameIdentifier	 base Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 'facets' property 	TokenNameCOMMENT_LINE	'facets' property 
// gives bit combination of the constants defined in XSSimpleType interface. 	TokenNameCOMMENT_LINE	gives bit combination of the constants defined in XSSimpleType interface. 
short	TokenNameshort	
facets	TokenNameIdentifier	 facets
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
getDefinedFacets	TokenNameIdentifier	 get Defined Facets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printFacets	TokenNameIdentifier	 print Facets
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//'final' property 	TokenNameCOMMENT_LINE	'final' property 
//the explicit values of this property extension, restriction, list and union prevent further 	TokenNameCOMMENT_LINE	the explicit values of this property extension, restriction, list and union prevent further 
//derivations by extension (to yield a complex type) and restriction (to yield a simple type) 	TokenNameCOMMENT_LINE	derivations by extension (to yield a complex type) and restriction (to yield a simple type) 
//and use in constructing lists and unions respectively. 	TokenNameCOMMENT_LINE	and use in constructing lists and unions respectively. 
short	TokenNameshort	
finalSet	TokenNameIdentifier	 final Set
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
getFinal	TokenNameIdentifier	 get Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printFinal	TokenNameIdentifier	 print Final
(	TokenNameLPAREN	
finalSet	TokenNameIdentifier	 final Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//if variety is 'list' 	TokenNameCOMMENT_LINE	if variety is 'list' 
if	TokenNameif	
(	TokenNameLPAREN	
variety	TokenNameIdentifier	 variety
==	TokenNameEQUAL_EQUAL	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
VARIETY_LIST	TokenNameIdentifier	 VARIETY  LIST
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 'Item Type definition' property of List Simple Type Definition Schema Component. 	TokenNameCOMMENT_LINE	'Item Type definition' property of List Simple Type Definition Schema Component. 
XSSimpleType	TokenNameIdentifier	 XS Simple Type
listDecl	TokenNameIdentifier	 list Decl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
)	TokenNameRPAREN	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
getItemType	TokenNameIdentifier	 get Item Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
variety	TokenNameIdentifier	 variety
==	TokenNameEQUAL_EQUAL	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
VARIETY_UNION	TokenNameIdentifier	 VARIETY  UNION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 'Member Type definitions' property of Union Simple Type Definition Schema Component. 	TokenNameCOMMENT_LINE	'Member Type definitions' property of Union Simple Type Definition Schema Component. 
XSObjectList	TokenNameIdentifier	 XS Object List
memberTypes	TokenNameIdentifier	 member Types
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
getMemberTypes	TokenNameIdentifier	 get Member Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//fundamental facet information 	TokenNameCOMMENT_LINE	fundamental facet information 
//ordered schema component 	TokenNameCOMMENT_LINE	ordered schema component 
short	TokenNameshort	
ordered	TokenNameIdentifier	 ordered
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
getOrdered	TokenNameIdentifier	 get Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printOrdered	TokenNameIdentifier	 print Ordered
(	TokenNameLPAREN	
ordered	TokenNameIdentifier	 ordered
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//bounded schema component 	TokenNameCOMMENT_LINE	bounded schema component 
boolean	TokenNameboolean	
bounded	TokenNameIdentifier	 bounded
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
getBounded	TokenNameIdentifier	 get Bounded
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bounded	TokenNameIdentifier	 bounded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'bounded' : true"	TokenNameStringLiteral	'bounded' : true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'bounded' : false"	TokenNameStringLiteral	'bounded' : false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//cardinality schema component 	TokenNameCOMMENT_LINE	cardinality schema component 
boolean	TokenNameboolean	
isFinite	TokenNameIdentifier	 is Finite
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
getFinite	TokenNameIdentifier	 get Finite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printCardinality	TokenNameIdentifier	 print Cardinality
(	TokenNameLPAREN	
isFinite	TokenNameIdentifier	 is Finite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//numeric schema component 	TokenNameCOMMENT_LINE	numeric schema component 
boolean	TokenNameboolean	
numeric	TokenNameIdentifier	 numeric
=	TokenNameEQUAL	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
getNumeric	TokenNameIdentifier	 get Numeric
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numeric	TokenNameIdentifier	 numeric
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'numeric' : true"	TokenNameStringLiteral	'numeric' : true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'numeric' : false"	TokenNameStringLiteral	'numeric' : false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//getInformation() 	TokenNameCOMMENT_LINE	getInformation() 
void	TokenNamevoid	
printOrdered	TokenNameIdentifier	 print Ordered
(	TokenNameLPAREN	
short	TokenNameshort	
ordered	TokenNameIdentifier	 ordered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ordered	TokenNameIdentifier	 ordered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_FALSE	TokenNameIdentifier	 ORDERED  FALSE
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'ordered' : false"	TokenNameStringLiteral	'ordered' : false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'ordered' : partial"	TokenNameStringLiteral	'ordered' : partial
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_TOTAL	TokenNameIdentifier	 ORDERED  TOTAL
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'ordered' : total"	TokenNameStringLiteral	'ordered' : total
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//printOrdered() 	TokenNameCOMMENT_LINE	printOrdered() 
void	TokenNamevoid	
printCardinality	TokenNameIdentifier	 print Cardinality
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isFinite	TokenNameIdentifier	 is Finite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isFinite	TokenNameIdentifier	 is Finite
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'cardinality' : countably infinite"	TokenNameStringLiteral	'cardinality' : countably infinite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'cardinality' : finite"	TokenNameStringLiteral	'cardinality' : finite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//printCardinality() 	TokenNameCOMMENT_LINE	printCardinality() 
void	TokenNamevoid	
printFacets	TokenNameIdentifier	 print Facets
(	TokenNameLPAREN	
short	TokenNameshort	
facets	TokenNameIdentifier	 facets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'facets' present : "	TokenNameStringLiteral	'facets' present : 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
&	TokenNameAND	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_ENUMERATION	TokenNameIdentifier	 FACET  ENUMERATION
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" ENUMERATION"	TokenNameStringLiteral	 ENUMERATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
&	TokenNameAND	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_LENGTH	TokenNameIdentifier	 FACET  LENGTH
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" LENGTH"	TokenNameStringLiteral	 LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
&	TokenNameAND	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MINLENGTH	TokenNameIdentifier	 FACET  MINLENGTH
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" MINLENGTH"	TokenNameStringLiteral	 MINLENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
&	TokenNameAND	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MAXLENGTH	TokenNameIdentifier	 FACET  MAXLENGTH
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" MAXLENGTH"	TokenNameStringLiteral	 MAXLENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
&	TokenNameAND	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_PATTERN	TokenNameIdentifier	 FACET  PATTERN
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" PATTERN"	TokenNameStringLiteral	 PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
&	TokenNameAND	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_WHITESPACE	TokenNameIdentifier	 FACET  WHITESPACE
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" WHITESPACE"	TokenNameStringLiteral	 WHITESPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
&	TokenNameAND	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" MAXINCLUSIVE"	TokenNameStringLiteral	 MAXINCLUSIVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
&	TokenNameAND	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MAXEXCLUSIVE	TokenNameIdentifier	 FACET  MAXEXCLUSIVE
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" MAXEXCLUSIVE"	TokenNameStringLiteral	 MAXEXCLUSIVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
&	TokenNameAND	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MININCLUSIVE	TokenNameIdentifier	 FACET  MININCLUSIVE
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" MININCLUSIVE"	TokenNameStringLiteral	 MININCLUSIVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
&	TokenNameAND	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MINEXCLUSIVE	TokenNameIdentifier	 FACET  MINEXCLUSIVE
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" MINEXCLUSIVE"	TokenNameStringLiteral	 MINEXCLUSIVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
&	TokenNameAND	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_TOTALDIGITS	TokenNameIdentifier	 FACET  TOTALDIGITS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" TOTALDIGITS"	TokenNameStringLiteral	 TOTALDIGITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
&	TokenNameAND	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_FRACTIONDIGITS	TokenNameIdentifier	 FACET  FRACTIONDIGITS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" FRACTIONDIGITS"	TokenNameStringLiteral	 FRACTIONDIGITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//printFacets() 	TokenNameCOMMENT_LINE	printFacets() 
void	TokenNamevoid	
printFinal	TokenNameIdentifier	 print Final
(	TokenNameLPAREN	
short	TokenNameshort	
finalSet	TokenNameIdentifier	 final Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'final' values : "	TokenNameStringLiteral	'final' values : 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
finalSet	TokenNameIdentifier	 final Set
&	TokenNameAND	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DERIVATION_EXTENSION	TokenNameIdentifier	 DERIVATION  EXTENSION
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Extension"	TokenNameStringLiteral	 Extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
finalSet	TokenNameIdentifier	 final Set
&	TokenNameAND	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DERIVATION_RESTRICTION	TokenNameIdentifier	 DERIVATION  RESTRICTION
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Restriction"	TokenNameStringLiteral	 Restriction
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
finalSet	TokenNameIdentifier	 final Set
&	TokenNameAND	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DERIVATION_LIST	TokenNameIdentifier	 DERIVATION  LIST
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" List"	TokenNameStringLiteral	 List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
finalSet	TokenNameIdentifier	 final Set
&	TokenNameAND	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DERIVATION_UNION	TokenNameIdentifier	 DERIVATION  UNION
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Union"	TokenNameStringLiteral	 Union
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
finalSet	TokenNameIdentifier	 final Set
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DERIVATION_NONE	TokenNameIdentifier	 DERIVATION  NONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" EMPTY"	TokenNameStringLiteral	 EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
printVariety	TokenNameIdentifier	 print Variety
(	TokenNameLPAREN	
short	TokenNameshort	
variety	TokenNameIdentifier	 variety
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
variety	TokenNameIdentifier	 variety
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
VARIETY_ATOMIC	TokenNameIdentifier	 VARIETY  ATOMIC
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'variety' : ATOMIC"	TokenNameStringLiteral	'variety' : ATOMIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
VARIETY_LIST	TokenNameIdentifier	 VARIETY  LIST
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'variety' : LIST"	TokenNameStringLiteral	'variety' : LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
VARIETY_UNION	TokenNameIdentifier	 VARIETY  UNION
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"'variety' : UNION"	TokenNameStringLiteral	'variety' : UNION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Invalid value of 'Variety' property , it should be one of atomic, list or union."	TokenNameStringLiteral	Invalid value of 'Variety' property , it should be one of atomic, list or union.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//printVariety() 	TokenNameCOMMENT_LINE	printVariety() 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleTypeUsage	TokenNameIdentifier	 Simple Type Usage
usage	TokenNameIdentifier	 usage
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleTypeUsage	TokenNameIdentifier	 Simple Type Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
builtInType	TokenNameIdentifier	 built In Type
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
getBuiltInType	TokenNameIdentifier	 get Built In Type
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
builtInType	TokenNameIdentifier	 built In Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Invalid built-in Simple datatype given as argument."	TokenNameStringLiteral	Invalid built-in Simple datatype given as argument.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
.	TokenNameDOT	
querySimpleType	TokenNameIdentifier	 query Simple Type
(	TokenNameLPAREN	
builtInType	TokenNameIdentifier	 built In Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//main() 	TokenNameCOMMENT_LINE	main() 
static	TokenNamestatic	
void	TokenNamevoid	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"USAGE: java simpletype.SimpleTypeUsage 'Built-InDatatypeName' "	TokenNameStringLiteral	USAGE: java simpletype.SimpleTypeUsage 'Built-InDatatypeName' 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Built-InDatatypeName Built-In Datatype name as defined by W3C Schema Spec, "http://www.w3.org/TR/xmlschema-2/#built-in-datatypes" ."	TokenNameStringLiteral	 Built-InDatatypeName Built-In Datatype name as defined by W3C Schema Spec, "http://www.w3.org/TR/xmlschema-2/#built-in-datatypes" .
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//class SimpleTypeUsage 	TokenNameCOMMENT_LINE	class SimpleTypeUsage 
