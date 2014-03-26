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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringListImpl	TokenNameIdentifier	 String List Impl
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
ElementPSVI	TokenNameIdentifier	 Element PSVI
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
ShortList	TokenNameIdentifier	 Short List
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
StringList	TokenNameIdentifier	 String List
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
XSElementDeclaration	TokenNameIdentifier	 XS Element Declaration
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
XSModel	TokenNameIdentifier	 XS Model
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
XSNotationDeclaration	TokenNameIdentifier	 XS Notation Declaration
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
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSValue	TokenNameIdentifier	 XS Value
;	TokenNameSEMICOLON	
/** * Element PSV infoset augmentations implementation. * The following information will be available at the startElement call: * name, namespace, type, notation, validation context * * The following information will be available at the endElement call: * nil, specified, normalized value, member type, validity, error codes, * default * * @xerces.internal * * @author Elena Litani IBM * @version $Id: ElementPSVImpl.java 1024038 2010-10-18 22:06:35Z sandygao $ */	TokenNameCOMMENT_JAVADOC	 Element PSV infoset augmentations implementation. The following information will be available at the startElement call: name, namespace, type, notation, validation context * The following information will be available at the endElement call: nil, specified, normalized value, member type, validity, error codes, default * @xerces.internal * @author Elena Litani IBM @version $Id: ElementPSVImpl.java 1024038 2010-10-18 22:06:35Z sandygao $ 
public	TokenNamepublic	
class	TokenNameclass	
ElementPSVImpl	TokenNameIdentifier	 Element PSV Impl
implements	TokenNameimplements	
ElementPSVI	TokenNameIdentifier	 Element PSVI
{	TokenNameLBRACE	
/** element declaration */	TokenNameCOMMENT_JAVADOC	 element declaration 
protected	TokenNameprotected	
XSElementDeclaration	TokenNameIdentifier	 XS Element Declaration
fDeclaration	TokenNameIdentifier	 f Declaration
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** type of element, could be xsi:type */	TokenNameCOMMENT_JAVADOC	 type of element, could be xsi:type 
protected	TokenNameprotected	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
fTypeDecl	TokenNameIdentifier	 f Type Decl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** true if clause 3.2 of Element Locally Valid (Element) (3.3.4) * is satisfied, otherwise false */	TokenNameCOMMENT_JAVADOC	 true if clause 3.2 of Element Locally Valid (Element) (3.3.4) is satisfied, otherwise false 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fNil	TokenNameIdentifier	 f Nil
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** true if the element value was provided by the schema; false otherwise. */	TokenNameCOMMENT_JAVADOC	 true if the element value was provided by the schema; false otherwise. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fSpecified	TokenNameIdentifier	 f Specified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Schema value */	TokenNameCOMMENT_JAVADOC	 Schema value 
protected	TokenNameprotected	
ValidatedInfo	TokenNameIdentifier	 Validated Info
fValue	TokenNameIdentifier	 f Value
=	TokenNameEQUAL	
new	TokenNamenew	
ValidatedInfo	TokenNameIdentifier	 Validated Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** http://www.w3.org/TR/xmlschema-1/#e-notation*/	TokenNameCOMMENT_JAVADOC	 http://www.w3.org/TR/xmlschema-1/#e-notation
protected	TokenNameprotected	
XSNotationDeclaration	TokenNameIdentifier	 XS Notation Declaration
fNotation	TokenNameIdentifier	 f Notation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** validation attempted: none, partial, full */	TokenNameCOMMENT_JAVADOC	 validation attempted: none, partial, full 
protected	TokenNameprotected	
short	TokenNameshort	
fValidationAttempted	TokenNameIdentifier	 f Validation Attempted
=	TokenNameEQUAL	
ElementPSVI	TokenNameIdentifier	 Element PSVI
.	TokenNameDOT	
VALIDATION_NONE	TokenNameIdentifier	 VALIDATION  NONE
;	TokenNameSEMICOLON	
/** validity: valid, invalid, unknown */	TokenNameCOMMENT_JAVADOC	 validity: valid, invalid, unknown 
protected	TokenNameprotected	
short	TokenNameshort	
fValidity	TokenNameIdentifier	 f Validity
=	TokenNameEQUAL	
ElementPSVI	TokenNameIdentifier	 Element PSVI
.	TokenNameDOT	
VALIDITY_NOTKNOWN	TokenNameIdentifier	 VALIDITY  NOTKNOWN
;	TokenNameSEMICOLON	
/** error codes and error messages */	TokenNameCOMMENT_JAVADOC	 error codes and error messages 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fErrors	TokenNameIdentifier	 f Errors
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** validation context: could be QName or XPath expression*/	TokenNameCOMMENT_JAVADOC	 validation context: could be QName or XPath expression
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fValidationContext	TokenNameIdentifier	 f Validation Context
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** deferred XSModel **/	TokenNameCOMMENT_JAVADOC	 deferred XSModel *
protected	TokenNameprotected	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fGrammars	TokenNameIdentifier	 f Grammars
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** the schema information property */	TokenNameCOMMENT_JAVADOC	 the schema information property 
protected	TokenNameprotected	
XSModel	TokenNameIdentifier	 XS Model
fSchemaInformation	TokenNameIdentifier	 f Schema Information
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// ElementPSVI methods 	TokenNameCOMMENT_LINE	ElementPSVI methods 
// 	TokenNameCOMMENT_LINE	 
/** * [schema default] * * @return The canonical lexical representation of the declaration's {value constraint} value. * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_default>XML Schema Part 1: Structures [schema default]</a> */	TokenNameCOMMENT_JAVADOC	 [schema default] * @return The canonical lexical representation of the declaration's {value constraint} value. @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_default>XML Schema Part 1: Structures [schema default]</a> 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemaDefault	TokenNameIdentifier	 get Schema Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fDeclaration	TokenNameIdentifier	 f Declaration
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
fDeclaration	TokenNameIdentifier	 f Declaration
.	TokenNameDOT	
getConstraintValue	TokenNameIdentifier	 get Constraint Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * [schema normalized value] * * * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_normalized_value>XML Schema Part 1: Structures [schema normalized value]</a> * @return the normalized value of this item after validation */	TokenNameCOMMENT_JAVADOC	 [schema normalized value] * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_normalized_value>XML Schema Part 1: Structures [schema normalized value]</a> @return the normalized value of this item after validation 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemaNormalizedValue	TokenNameIdentifier	 get Schema Normalized Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
getNormalizedValue	TokenNameIdentifier	 get Normalized Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * [schema specified] * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_specified">XML Schema Part 1: Structures [schema specified]</a> * @return true - value was specified in schema, false - value comes from the infoset */	TokenNameCOMMENT_JAVADOC	 [schema specified] @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_specified">XML Schema Part 1: Structures [schema specified]</a> @return true - value was specified in schema, false - value comes from the infoset 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIsSchemaSpecified	TokenNameIdentifier	 get Is Schema Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSpecified	TokenNameIdentifier	 f Specified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines the extent to which the document has been validated * * @return return the [validation attempted] property. The possible values are * NO_VALIDATION, PARTIAL_VALIDATION and FULL_VALIDATION */	TokenNameCOMMENT_JAVADOC	 Determines the extent to which the document has been validated * @return return the [validation attempted] property. The possible values are NO_VALIDATION, PARTIAL_VALIDATION and FULL_VALIDATION 
public	TokenNamepublic	
short	TokenNameshort	
getValidationAttempted	TokenNameIdentifier	 get Validation Attempted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fValidationAttempted	TokenNameIdentifier	 f Validation Attempted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine the validity of the node with respect * to the validation being attempted * * @return return the [validity] property. Possible values are: * UNKNOWN_VALIDITY, INVALID_VALIDITY, VALID_VALIDITY */	TokenNameCOMMENT_JAVADOC	 Determine the validity of the node with respect to the validation being attempted * @return return the [validity] property. Possible values are: UNKNOWN_VALIDITY, INVALID_VALIDITY, VALID_VALIDITY 
public	TokenNamepublic	
short	TokenNameshort	
getValidity	TokenNameIdentifier	 get Validity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fValidity	TokenNameIdentifier	 f Validity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A list of error codes generated from validation attempts. * Need to find all the possible subclause reports that need reporting * * @return Array of error codes */	TokenNameCOMMENT_JAVADOC	 A list of error codes generated from validation attempts. Need to find all the possible subclause reports that need reporting * @return Array of error codes 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getErrorCodes	TokenNameIdentifier	 get Error Codes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fErrors	TokenNameIdentifier	 f Errors
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
fErrors	TokenNameIdentifier	 f Errors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
StringListImpl	TokenNameIdentifier	 String List Impl
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PSVIErrorList	TokenNameIdentifier	 PSVI Error List
(	TokenNameLPAREN	
fErrors	TokenNameIdentifier	 f Errors
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A list of error messages generated from the validation attempt or * an empty <code>StringList</code> if no errors occurred during the * validation attempt. The indices of error messages in this list are * aligned with those in the <code>[schema error code]</code> list. */	TokenNameCOMMENT_JAVADOC	 A list of error messages generated from the validation attempt or an empty <code>StringList</code> if no errors occurred during the validation attempt. The indices of error messages in this list are aligned with those in the <code>[schema error code]</code> list. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getErrorMessages	TokenNameIdentifier	 get Error Messages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fErrors	TokenNameIdentifier	 f Errors
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
fErrors	TokenNameIdentifier	 f Errors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
StringListImpl	TokenNameIdentifier	 String List Impl
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PSVIErrorList	TokenNameIdentifier	 PSVI Error List
(	TokenNameLPAREN	
fErrors	TokenNameIdentifier	 f Errors
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This is the only information we can provide in a pipeline. 	TokenNameCOMMENT_LINE	This is the only information we can provide in a pipeline. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValidationContext	TokenNameIdentifier	 get Validation Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fValidationContext	TokenNameIdentifier	 f Validation Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * [nil] * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-nil>XML Schema Part 1: Structures [nil]</a> * @return true if clause 3.2 of Element Locally Valid (Element) (3.3.4) above is satisfied, otherwise false */	TokenNameCOMMENT_JAVADOC	 [nil] @see <a href="http://www.w3.org/TR/xmlschema-1/#e-nil>XML Schema Part 1: Structures [nil]</a> @return true if clause 3.2 of Element Locally Valid (Element) (3.3.4) above is satisfied, otherwise false 
public	TokenNamepublic	
boolean	TokenNameboolean	
getNil	TokenNameIdentifier	 get Nil
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNil	TokenNameIdentifier	 f Nil
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * [notation] * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-notation>XML Schema Part 1: Structures [notation]</a> * @return The notation declaration. */	TokenNameCOMMENT_JAVADOC	 [notation] @see <a href="http://www.w3.org/TR/xmlschema-1/#e-notation>XML Schema Part 1: Structures [notation]</a> @return The notation declaration. 
public	TokenNamepublic	
XSNotationDeclaration	TokenNameIdentifier	 XS Notation Declaration
getNotation	TokenNameIdentifier	 get Notation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNotation	TokenNameIdentifier	 f Notation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An item isomorphic to the type definition used to validate this element. * * @return a type declaration */	TokenNameCOMMENT_JAVADOC	 An item isomorphic to the type definition used to validate this element. * @return a type declaration 
public	TokenNamepublic	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
getTypeDefinition	TokenNameIdentifier	 get Type Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fTypeDecl	TokenNameIdentifier	 f Type Decl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If and only if that type definition is a simple type definition * with {variety} union, or a complex type definition whose {content type} * is a simple thype definition with {variety} union, then an item isomorphic * to that member of the union's {member type definitions} which actually * validated the element item's normalized value. * * @return a simple type declaration */	TokenNameCOMMENT_JAVADOC	 If and only if that type definition is a simple type definition with {variety} union, or a complex type definition whose {content type} is a simple thype definition with {variety} union, then an item isomorphic to that member of the union's {member type definitions} which actually validated the element item's normalized value. * @return a simple type declaration 
public	TokenNamepublic	
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
getMemberTypeDefinition	TokenNameIdentifier	 get Member Type Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
getMemberTypeDefinition	TokenNameIdentifier	 get Member Type Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An item isomorphic to the element declaration used to validate * this element. * * @return an element declaration */	TokenNameCOMMENT_JAVADOC	 An item isomorphic to the element declaration used to validate this element. * @return an element declaration 
public	TokenNamepublic	
XSElementDeclaration	TokenNameIdentifier	 XS Element Declaration
getElementDeclaration	TokenNameIdentifier	 get Element Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fDeclaration	TokenNameIdentifier	 f Declaration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * [schema information] * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_information">XML Schema Part 1: Structures [schema information]</a> * @return The schema information property if it's the validation root, * null otherwise. */	TokenNameCOMMENT_JAVADOC	 [schema information] @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_information">XML Schema Part 1: Structures [schema information]</a> @return The schema information property if it's the validation root, null otherwise. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
XSModel	TokenNameIdentifier	 XS Model
getSchemaInformation	TokenNameIdentifier	 get Schema Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fSchemaInformation	TokenNameIdentifier	 f Schema Information
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fGrammars	TokenNameIdentifier	 f Grammars
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSchemaInformation	TokenNameIdentifier	 f Schema Information
=	TokenNameEQUAL	
new	TokenNamenew	
XSModelImpl	TokenNameIdentifier	 XS Model Impl
(	TokenNameLPAREN	
fGrammars	TokenNameIdentifier	 f Grammars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fSchemaInformation	TokenNameIdentifier	 f Schema Information
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.ItemPSVI#getActualNormalizedValue() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.ItemPSVI#getActualNormalizedValue() 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getActualNormalizedValue	TokenNameIdentifier	 get Actual Normalized Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
getActualValue	TokenNameIdentifier	 get Actual Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.ItemPSVI#getActualNormalizedValueType() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.ItemPSVI#getActualNormalizedValueType() 
public	TokenNamepublic	
short	TokenNameshort	
getActualNormalizedValueType	TokenNameIdentifier	 get Actual Normalized Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
getActualValueType	TokenNameIdentifier	 get Actual Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.ItemPSVI#getItemValueTypes() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.ItemPSVI#getItemValueTypes() 
public	TokenNamepublic	
ShortList	TokenNameIdentifier	 Short List
getItemValueTypes	TokenNameIdentifier	 get Item Value Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
getListValueTypes	TokenNameIdentifier	 get List Value Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.xerces.xs.ItemPSVI#getSchemaValue() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.xerces.xs.ItemPSVI#getSchemaValue() 
public	TokenNamepublic	
XSValue	TokenNameIdentifier	 XS Value
getSchemaValue	TokenNameIdentifier	 get Schema Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fValue	TokenNameIdentifier	 f Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset() should be called in validator startElement(..) method. */	TokenNameCOMMENT_JAVADOC	 Reset() should be called in validator startElement(..) method. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDeclaration	TokenNameIdentifier	 f Declaration
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fTypeDecl	TokenNameIdentifier	 f Type Decl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fNil	TokenNameIdentifier	 f Nil
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fSpecified	TokenNameIdentifier	 f Specified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fNotation	TokenNameIdentifier	 f Notation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fValidationAttempted	TokenNameIdentifier	 f Validation Attempted
=	TokenNameEQUAL	
ElementPSVI	TokenNameIdentifier	 Element PSVI
.	TokenNameDOT	
VALIDATION_NONE	TokenNameIdentifier	 VALIDATION  NONE
;	TokenNameSEMICOLON	
fValidity	TokenNameIdentifier	 f Validity
=	TokenNameEQUAL	
ElementPSVI	TokenNameIdentifier	 Element PSVI
.	TokenNameDOT	
VALIDITY_NOTKNOWN	TokenNameIdentifier	 VALIDITY  NOTKNOWN
;	TokenNameSEMICOLON	
fErrors	TokenNameIdentifier	 f Errors
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fValidationContext	TokenNameIdentifier	 f Validation Context
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
copySchemaInformationTo	TokenNameIdentifier	 copy Schema Information To
(	TokenNameLPAREN	
ElementPSVImpl	TokenNameIdentifier	 Element PSV Impl
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
fGrammars	TokenNameIdentifier	 f Grammars
=	TokenNameEQUAL	
fGrammars	TokenNameIdentifier	 f Grammars
;	TokenNameSEMICOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
fSchemaInformation	TokenNameIdentifier	 f Schema Information
=	TokenNameEQUAL	
fSchemaInformation	TokenNameIdentifier	 f Schema Information
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
