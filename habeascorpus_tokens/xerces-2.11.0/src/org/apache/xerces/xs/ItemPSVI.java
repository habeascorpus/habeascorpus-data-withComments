/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
/** * Represents an abstract PSVI item for an element or an attribute * information item. */	TokenNameCOMMENT_JAVADOC	 Represents an abstract PSVI item for an element or an attribute information item. 
public	TokenNamepublic	
interface	TokenNameinterface	
ItemPSVI	TokenNameIdentifier	 Item PSVI
{	TokenNameLBRACE	
/** * Validity value indicating that validation has either not been performed * or that a strict assessment of validity could not be performed. */	TokenNameCOMMENT_JAVADOC	 Validity value indicating that validation has either not been performed or that a strict assessment of validity could not be performed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VALIDITY_NOTKNOWN	TokenNameIdentifier	 VALIDITY  NOTKNOWN
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Validity value indicating that validation has been strictly assessed * and the item in question is invalid according to the rules of schema * validation. */	TokenNameCOMMENT_JAVADOC	 Validity value indicating that validation has been strictly assessed and the item in question is invalid according to the rules of schema validation. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VALIDITY_INVALID	TokenNameIdentifier	 VALIDITY  INVALID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Validation status indicating that schema validation has been performed * and the item in question is valid according to the rules of schema * validation. */	TokenNameCOMMENT_JAVADOC	 Validation status indicating that schema validation has been performed and the item in question is valid according to the rules of schema validation. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VALIDITY_VALID	TokenNameIdentifier	 VALIDITY  VALID
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Validation status indicating that schema validation has been performed * and the item in question has specifically been skipped. */	TokenNameCOMMENT_JAVADOC	 Validation status indicating that schema validation has been performed and the item in question has specifically been skipped. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VALIDATION_NONE	TokenNameIdentifier	 VALIDATION  NONE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Validation status indicating that schema validation has been performed * on the item in question under the rules of lax validation. */	TokenNameCOMMENT_JAVADOC	 Validation status indicating that schema validation has been performed on the item in question under the rules of lax validation. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VALIDATION_PARTIAL	TokenNameIdentifier	 VALIDATION  PARTIAL
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Validation status indicating that full schema validation has been * performed on the item. */	TokenNameCOMMENT_JAVADOC	 Validation status indicating that full schema validation has been performed on the item. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VALIDATION_FULL	TokenNameIdentifier	 VALIDATION  FULL
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The nearest ancestor element information item with a * <code>[schema information]</code> property (or this element item * itself if it has such a property). For more information refer to * element validation context and attribute validation context . */	TokenNameCOMMENT_JAVADOC	 The nearest ancestor element information item with a <code>[schema information]</code> property (or this element item itself if it has such a property). For more information refer to element validation context and attribute validation context . 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValidationContext	TokenNameIdentifier	 get Validation Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>[validity]</code>: determines the validity of the schema item * with respect to the validation being attempted. The value will be one * of the constants: <code>VALIDITY_NOTKNOWN</code>, * <code>VALIDITY_INVALID</code> or <code>VALIDITY_VALID</code>. */	TokenNameCOMMENT_JAVADOC	 <code>[validity]</code>: determines the validity of the schema item with respect to the validation being attempted. The value will be one of the constants: <code>VALIDITY_NOTKNOWN</code>, <code>VALIDITY_INVALID</code> or <code>VALIDITY_VALID</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getValidity	TokenNameIdentifier	 get Validity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>[validation attempted]</code>: determines the extent to which * the schema item has been validated. The value will be one of the * constants: <code>VALIDATION_NONE</code>, * <code>VALIDATION_PARTIAL</code> or <code>VALIDATION_FULL</code>. */	TokenNameCOMMENT_JAVADOC	 <code>[validation attempted]</code>: determines the extent to which the schema item has been validated. The value will be one of the constants: <code>VALIDATION_NONE</code>, <code>VALIDATION_PARTIAL</code> or <code>VALIDATION_FULL</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getValidationAttempted	TokenNameIdentifier	 get Validation Attempted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>[schema error code]</code>: a list of error codes generated from * the validation attempt or an empty <code>StringList</code> if no * errors occurred during the validation attempt. */	TokenNameCOMMENT_JAVADOC	 <code>[schema error code]</code>: a list of error codes generated from the validation attempt or an empty <code>StringList</code> if no errors occurred during the validation attempt. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getErrorCodes	TokenNameIdentifier	 get Error Codes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A list of error messages generated from the validation attempt or * an empty <code>StringList</code> if no errors occurred during the * validation attempt. The indices of error messages in this list are * aligned with those in the <code>[schema error code]</code> list. */	TokenNameCOMMENT_JAVADOC	 A list of error messages generated from the validation attempt or an empty <code>StringList</code> if no errors occurred during the validation attempt. The indices of error messages in this list are aligned with those in the <code>[schema error code]</code> list. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getErrorMessages	TokenNameIdentifier	 get Error Messages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>[schema normalized value]</code>: the normalized value of this * item after validation. * * @deprecated Use getSchemaValue().getNormalizedValue() instead */	TokenNameCOMMENT_JAVADOC	 <code>[schema normalized value]</code>: the normalized value of this item after validation. * @deprecated Use getSchemaValue().getNormalizedValue() instead 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemaNormalizedValue	TokenNameIdentifier	 get Schema Normalized Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>[schema normalized value]</code>: Binding specific actual value * or <code>null</code> if the value is in error. * @exception XSException * NOT_SUPPORTED_ERR: Raised if the implementation does not support this * method. * * @deprecated Use getSchemaValue().getActualValue() instead */	TokenNameCOMMENT_JAVADOC	 <code>[schema normalized value]</code>: Binding specific actual value or <code>null</code> if the value is in error. @exception XSException NOT_SUPPORTED_ERR: Raised if the implementation does not support this method. * @deprecated Use getSchemaValue().getActualValue() instead 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getActualNormalizedValue	TokenNameIdentifier	 get Actual Normalized Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XSException	TokenNameIdentifier	 XS Exception
;	TokenNameSEMICOLON	
/** * The actual value built-in datatype, e.g. * <code>STRING_DT, SHORT_DT</code>. If the type definition of this * value is a list type definition, this method returns * <code>LIST_DT</code>. If the type definition of this value is a list * type definition whose item type is a union type definition, this * method returns <code>LISTOFUNION_DT</code>. To query the actual value * of the list or list of union type definitions use * <code>itemValueTypes</code>. If the <code>actualNormalizedValue</code> * is <code>null</code>, this method returns <code>UNAVAILABLE_DT</code>. * @exception XSException * NOT_SUPPORTED_ERR: Raised if the implementation does not support this * method. * * @deprecated Use getSchemaValue().getActualValueType() instead */	TokenNameCOMMENT_JAVADOC	 The actual value built-in datatype, e.g. <code>STRING_DT, SHORT_DT</code>. If the type definition of this value is a list type definition, this method returns <code>LIST_DT</code>. If the type definition of this value is a list type definition whose item type is a union type definition, this method returns <code>LISTOFUNION_DT</code>. To query the actual value of the list or list of union type definitions use <code>itemValueTypes</code>. If the <code>actualNormalizedValue</code> is <code>null</code>, this method returns <code>UNAVAILABLE_DT</code>. @exception XSException NOT_SUPPORTED_ERR: Raised if the implementation does not support this method. * @deprecated Use getSchemaValue().getActualValueType() instead 
public	TokenNamepublic	
short	TokenNameshort	
getActualNormalizedValueType	TokenNameIdentifier	 get Actual Normalized Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XSException	TokenNameIdentifier	 XS Exception
;	TokenNameSEMICOLON	
/** * In the case the actual value represents a list, i.e. the * <code>actualNormalizedValueType</code> is <code>LIST_DT</code>, the * returned array consists of one type kind which represents the itemType * . For example: * <pre> &lt;simpleType name="listtype"&gt; &lt;list * itemType="positiveInteger"/&gt; &lt;/simpleType&gt; &lt;element * name="list" type="listtype"/&gt; ... &lt;list&gt;1 2 3&lt;/list&gt; </pre> * * The <code>schemaNormalizedValue</code> value is "1 2 3", the * <code>actualNormalizedValueType</code> value is <code>LIST_DT</code>, * and the <code>itemValueTypes</code> is an array of size 1 with the * value <code>POSITIVEINTEGER_DT</code>. * <br> If the actual value represents a list type definition whose item * type is a union type definition, i.e. <code>LISTOFUNION_DT</code>, * for each actual value in the list the array contains the * corresponding memberType kind. For example: * <pre> &lt;simpleType * name='union_type' memberTypes="integer string"/&gt; &lt;simpleType * name='listOfUnion'&gt; &lt;list itemType='union_type'/&gt; * &lt;/simpleType&gt; &lt;element name="list" type="listOfUnion"/&gt; * ... &lt;list&gt;1 2 foo&lt;/list&gt; </pre> * The * <code>schemaNormalizedValue</code> value is "1 2 foo", the * <code>actualNormalizedValueType</code> is <code>LISTOFUNION_DT</code> * , and the <code>itemValueTypes</code> is an array of size 3 with the * following values: <code>INTEGER_DT, INTEGER_DT, STRING_DT</code>. * @exception XSException * NOT_SUPPORTED_ERR: Raised if the implementation does not support this * method. * * @deprecated Use getSchemaValue().getListValueTypes() instead */	TokenNameCOMMENT_JAVADOC	 In the case the actual value represents a list, i.e. the <code>actualNormalizedValueType</code> is <code>LIST_DT</code>, the returned array consists of one type kind which represents the itemType . For example: <pre> &lt;simpleType name="listtype"&gt; &lt;list itemType="positiveInteger"/&gt; &lt;/simpleType&gt; &lt;element name="list" type="listtype"/&gt; ... &lt;list&gt;1 2 3&lt;/list&gt; </pre> * The <code>schemaNormalizedValue</code> value is "1 2 3", the <code>actualNormalizedValueType</code> value is <code>LIST_DT</code>, and the <code>itemValueTypes</code> is an array of size 1 with the value <code>POSITIVEINTEGER_DT</code>. <br> If the actual value represents a list type definition whose item type is a union type definition, i.e. <code>LISTOFUNION_DT</code>, for each actual value in the list the array contains the corresponding memberType kind. For example: <pre> &lt;simpleType name='union_type' memberTypes="integer string"/&gt; &lt;simpleType name='listOfUnion'&gt; &lt;list itemType='union_type'/&gt; &lt;/simpleType&gt; &lt;element name="list" type="listOfUnion"/&gt; ... &lt;list&gt;1 2 foo&lt;/list&gt; </pre> The <code>schemaNormalizedValue</code> value is "1 2 foo", the <code>actualNormalizedValueType</code> is <code>LISTOFUNION_DT</code> , and the <code>itemValueTypes</code> is an array of size 3 with the following values: <code>INTEGER_DT, INTEGER_DT, STRING_DT</code>. @exception XSException NOT_SUPPORTED_ERR: Raised if the implementation does not support this method. * @deprecated Use getSchemaValue().getListValueTypes() instead 
public	TokenNamepublic	
ShortList	TokenNameIdentifier	 Short List
getItemValueTypes	TokenNameIdentifier	 get Item Value Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XSException	TokenNameIdentifier	 XS Exception
;	TokenNameSEMICOLON	
/** * If this item has a simple type definition or a complex type with simple * content, then return the value with respect to the simple type. If * this item doesn't have a simple-typed value, the behavior of this method * is not specified. */	TokenNameCOMMENT_JAVADOC	 If this item has a simple type definition or a complex type with simple content, then return the value with respect to the simple type. If this item doesn't have a simple-typed value, the behavior of this method is not specified. 
public	TokenNamepublic	
XSValue	TokenNameIdentifier	 XS Value
getSchemaValue	TokenNameIdentifier	 get Schema Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>[type definition]</code>: an item isomorphic to the type * definition used to validate the schema item. */	TokenNameCOMMENT_JAVADOC	 <code>[type definition]</code>: an item isomorphic to the type definition used to validate the schema item. 
public	TokenNamepublic	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
getTypeDefinition	TokenNameIdentifier	 get Type Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>[member type definition]</code>: if and only if that type * definition is a simple type definition with {variety} union, or a * complex type definition whose {content type} is a simple type * definition with {variety} union, then an item isomorphic to that * member of the union's {member type definitions} which actually * validated the schema item's normalized value. */	TokenNameCOMMENT_JAVADOC	 <code>[member type definition]</code>: if and only if that type definition is a simple type definition with {variety} union, or a complex type definition whose {content type} is a simple type definition with {variety} union, then an item isomorphic to that member of the union's {member type definitions} which actually validated the schema item's normalized value. 
public	TokenNamepublic	
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
getMemberTypeDefinition	TokenNameIdentifier	 get Member Type Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>[schema default]</code>: the canonical lexical representation of * the declaration's {value constraint} value. For more information * refer to element schema default and attribute schema default. */	TokenNameCOMMENT_JAVADOC	 <code>[schema default]</code>: the canonical lexical representation of the declaration's {value constraint} value. For more information refer to element schema default and attribute schema default. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemaDefault	TokenNameIdentifier	 get Schema Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <code>[schema specified]</code>: if true, the value was specified in * the schema. If false, the value comes from the infoset. For more * information refer to element specified and attribute specified. */	TokenNameCOMMENT_JAVADOC	 <code>[schema specified]</code>: if true, the value was specified in the schema. If false, the value comes from the infoset. For more information refer to element specified and attribute specified. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIsSchemaSpecified	TokenNameIdentifier	 get Is Schema Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
