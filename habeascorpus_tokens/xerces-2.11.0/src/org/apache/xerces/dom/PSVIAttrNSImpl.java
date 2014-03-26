/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
NotSerializableException	TokenNameIdentifier	 Not Serializable Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
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
AttributePSVI	TokenNameIdentifier	 Attribute PSVI
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
XSAttributeDeclaration	TokenNameIdentifier	 XS Attribute Declaration
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
/** * Attribute namespace implementation; stores PSVI attribute items. * * @xerces.internal * * @author Sandy Gao, IBM * * @version $Id: PSVIAttrNSImpl.java 1024038 2010-10-18 22:06:35Z sandygao $ */	TokenNameCOMMENT_JAVADOC	 Attribute namespace implementation; stores PSVI attribute items. * @xerces.internal * @author Sandy Gao, IBM * @version $Id: PSVIAttrNSImpl.java 1024038 2010-10-18 22:06:35Z sandygao $ 
public	TokenNamepublic	
class	TokenNameclass	
PSVIAttrNSImpl	TokenNameIdentifier	 PSVI Attr NS Impl
extends	TokenNameextends	
AttrNSImpl	TokenNameIdentifier	 Attr NS Impl
implements	TokenNameimplements	
AttributePSVI	TokenNameIdentifier	 Attribute PSVI
{	TokenNameLBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
3241738699421018889L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Construct an attribute node. */	TokenNameCOMMENT_JAVADOC	 Construct an attribute node. 
public	TokenNamepublic	
PSVIAttrNSImpl	TokenNameIdentifier	 PSVI Attr NS Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qualifiedName	TokenNameIdentifier	 qualified Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an attribute node. */	TokenNameCOMMENT_JAVADOC	 Construct an attribute node. 
public	TokenNamepublic	
PSVIAttrNSImpl	TokenNameIdentifier	 PSVI Attr NS Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
qualifiedName	TokenNameIdentifier	 qualified Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** attribute declaration */	TokenNameCOMMENT_JAVADOC	 attribute declaration 
protected	TokenNameprotected	
XSAttributeDeclaration	TokenNameIdentifier	 XS Attribute Declaration
fDeclaration	TokenNameIdentifier	 f Declaration
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** type of attribute, simpleType */	TokenNameCOMMENT_JAVADOC	 type of attribute, simpleType 
protected	TokenNameprotected	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
fTypeDecl	TokenNameIdentifier	 f Type Decl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** If this attribute was explicitly given a * value in the original document, this is true; otherwise, it is false */	TokenNameCOMMENT_JAVADOC	 If this attribute was explicitly given a value in the original document, this is true; otherwise, it is false 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fSpecified	TokenNameIdentifier	 f Specified
=	TokenNameEQUAL	
true	TokenNametrue	
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
/** validation attempted: none, partial, full */	TokenNameCOMMENT_JAVADOC	 validation attempted: none, partial, full 
protected	TokenNameprotected	
short	TokenNameshort	
fValidationAttempted	TokenNameIdentifier	 f Validation Attempted
=	TokenNameEQUAL	
AttributePSVI	TokenNameIdentifier	 Attribute PSVI
.	TokenNameDOT	
VALIDATION_NONE	TokenNameIdentifier	 VALIDATION  NONE
;	TokenNameSEMICOLON	
/** validity: valid, invalid, unknown */	TokenNameCOMMENT_JAVADOC	 validity: valid, invalid, unknown 
protected	TokenNameprotected	
short	TokenNameshort	
fValidity	TokenNameIdentifier	 f Validity
=	TokenNameEQUAL	
AttributePSVI	TokenNameIdentifier	 Attribute PSVI
.	TokenNameDOT	
VALIDITY_NOTKNOWN	TokenNameIdentifier	 VALIDITY  NOTKNOWN
;	TokenNameSEMICOLON	
/** error codes */	TokenNameCOMMENT_JAVADOC	 error codes 
protected	TokenNameprotected	
StringList	TokenNameIdentifier	 String List
fErrorCodes	TokenNameIdentifier	 f Error Codes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** error messages */	TokenNameCOMMENT_JAVADOC	 error messages 
protected	TokenNameprotected	
StringList	TokenNameIdentifier	 String List
fErrorMessages	TokenNameIdentifier	 f Error Messages
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
// 	TokenNameCOMMENT_LINE	 
// AttributePSVI methods 	TokenNameCOMMENT_LINE	AttributePSVI methods 
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
/** * [schema specified] * @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_specified">XML Schema Part 1: Structures [schema specified]</a> * @return false value was specified in schema, true value comes from the infoset */	TokenNameCOMMENT_JAVADOC	 [schema specified] @see <a href="http://www.w3.org/TR/xmlschema-1/#e-schema_specified">XML Schema Part 1: Structures [schema specified]</a> @return false value was specified in schema, true value comes from the infoset 
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
/** * A list of error codes generated from validation attempts. * Need to find all the possible subclause reports that need reporting * * @return list of error codes */	TokenNameCOMMENT_JAVADOC	 A list of error codes generated from validation attempts. Need to find all the possible subclause reports that need reporting * @return list of error codes 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getErrorCodes	TokenNameIdentifier	 get Error Codes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fErrorCodes	TokenNameIdentifier	 f Error Codes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fErrorCodes	TokenNameIdentifier	 f Error Codes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
StringListImpl	TokenNameIdentifier	 String List Impl
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
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
fErrorMessages	TokenNameIdentifier	 f Error Messages
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fErrorMessages	TokenNameIdentifier	 f Error Messages
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
StringListImpl	TokenNameIdentifier	 String List Impl
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
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
/** * An item isomorphic to the attribute declaration used to validate * this attribute. * * @return an attribute declaration */	TokenNameCOMMENT_JAVADOC	 An item isomorphic to the attribute declaration used to validate this attribute. * @return an attribute declaration 
public	TokenNamepublic	
XSAttributeDeclaration	TokenNameIdentifier	 XS Attribute Declaration
getAttributeDeclaration	TokenNameIdentifier	 get Attribute Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fDeclaration	TokenNameIdentifier	 f Declaration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy PSVI properties from another psvi item. * * @param attr the source of attribute PSVI items */	TokenNameCOMMENT_JAVADOC	 Copy PSVI properties from another psvi item. * @param attr the source of attribute PSVI items 
public	TokenNamepublic	
void	TokenNamevoid	
setPSVI	TokenNameIdentifier	 set PSVI
(	TokenNameLPAREN	
AttributePSVI	TokenNameIdentifier	 Attribute PSVI
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fDeclaration	TokenNameIdentifier	 f Declaration
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getAttributeDeclaration	TokenNameIdentifier	 get Attribute Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fValidationContext	TokenNameIdentifier	 f Validation Context
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValidationContext	TokenNameIdentifier	 get Validation Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fValidity	TokenNameIdentifier	 f Validity
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValidity	TokenNameIdentifier	 get Validity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fValidationAttempted	TokenNameIdentifier	 f Validation Attempted
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValidationAttempted	TokenNameIdentifier	 get Validation Attempted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fErrorCodes	TokenNameIdentifier	 f Error Codes
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getErrorCodes	TokenNameIdentifier	 get Error Codes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fErrorMessages	TokenNameIdentifier	 f Error Messages
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getErrorMessages	TokenNameIdentifier	 get Error Messages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fValue	TokenNameIdentifier	 f Value
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getSchemaValue	TokenNameIdentifier	 get Schema Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fTypeDecl	TokenNameIdentifier	 f Type Decl
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getTypeDefinition	TokenNameIdentifier	 get Type Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fSpecified	TokenNameIdentifier	 f Specified
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getIsSchemaSpecified	TokenNameIdentifier	 get Is Schema Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
// REVISIT: Forbid serialization of PSVI DOM until 	TokenNameCOMMENT_LINE	REVISIT: Forbid serialization of PSVI DOM until 
// we support object serialization of grammars -- mrglavas 	TokenNameCOMMENT_LINE	we support object serialization of grammars -- mrglavas 
private	TokenNameprivate	
void	TokenNamevoid	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NotSerializableException	TokenNameIdentifier	 Not Serializable Exception
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NotSerializableException	TokenNameIdentifier	 Not Serializable Exception
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
