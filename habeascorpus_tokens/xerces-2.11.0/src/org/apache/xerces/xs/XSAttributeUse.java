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
/** * This interface represents the Attribute Use schema component. */	TokenNameCOMMENT_JAVADOC	 This interface represents the Attribute Use schema component. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSAttributeUse	TokenNameIdentifier	 XS Attribute Use
extends	TokenNameextends	
XSObject	TokenNameIdentifier	 XS Object
{	TokenNameLBRACE	
/** * [required]: determines whether this use of an attribute declaration * requires an appropriate attribute information item to be present, or * merely allows it. */	TokenNameCOMMENT_JAVADOC	 [required]: determines whether this use of an attribute declaration requires an appropriate attribute information item to be present, or merely allows it. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getRequired	TokenNameIdentifier	 get Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [attribute declaration]: provides the attribute declaration itself, * which will in turn determine the simple type definition used. */	TokenNameCOMMENT_JAVADOC	 [attribute declaration]: provides the attribute declaration itself, which will in turn determine the simple type definition used. 
public	TokenNamepublic	
XSAttributeDeclaration	TokenNameIdentifier	 XS Attribute Declaration
getAttrDeclaration	TokenNameIdentifier	 get Attr Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Value Constraint: one of default, fixed, or none. */	TokenNameCOMMENT_JAVADOC	 Value Constraint: one of default, fixed, or none. 
public	TokenNamepublic	
short	TokenNameshort	
getConstraintType	TokenNameIdentifier	 get Constraint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Value Constraint: The constraint value, otherwise <code>null</code>. * * @deprecated Use getValueConstraintValue().getNormalizedValue() instead */	TokenNameCOMMENT_JAVADOC	 Value Constraint: The constraint value, otherwise <code>null</code>. * @deprecated Use getValueConstraintValue().getNormalizedValue() instead 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getConstraintValue	TokenNameIdentifier	 get Constraint Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Value Constraint: Binding specific actual constraint value or * <code>null</code> if the value is in error or there is no value * constraint. * @exception XSException * NOT_SUPPORTED_ERR: Raised if the implementation does not support this * method. * * @deprecated Use getValueConstraintValue().getActualValue() instead */	TokenNameCOMMENT_JAVADOC	 Value Constraint: Binding specific actual constraint value or <code>null</code> if the value is in error or there is no value constraint. @exception XSException NOT_SUPPORTED_ERR: Raised if the implementation does not support this method. * @deprecated Use getValueConstraintValue().getActualValue() instead 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getActualVC	TokenNameIdentifier	 get Actual VC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XSException	TokenNameIdentifier	 XS Exception
;	TokenNameSEMICOLON	
/** * The actual constraint value built-in datatype, e.g. * <code>STRING_DT, SHORT_DT</code>. If the type definition of this * value is a list type definition, this method returns * <code>LIST_DT</code>. If the type definition of this value is a list * type definition whose item type is a union type definition, this * method returns <code>LISTOFUNION_DT</code>. To query the actual * constraint value of the list or list of union type definitions use * <code>itemValueTypes</code>. If the <code>actualNormalizedValue</code> * is <code>null</code>, this method returns <code>UNAVAILABLE_DT</code>. * @exception XSException * NOT_SUPPORTED_ERR: Raised if the implementation does not support this * method. * * @deprecated Use getValueConstraintValue().getActualValueType() instead */	TokenNameCOMMENT_JAVADOC	 The actual constraint value built-in datatype, e.g. <code>STRING_DT, SHORT_DT</code>. If the type definition of this value is a list type definition, this method returns <code>LIST_DT</code>. If the type definition of this value is a list type definition whose item type is a union type definition, this method returns <code>LISTOFUNION_DT</code>. To query the actual constraint value of the list or list of union type definitions use <code>itemValueTypes</code>. If the <code>actualNormalizedValue</code> is <code>null</code>, this method returns <code>UNAVAILABLE_DT</code>. @exception XSException NOT_SUPPORTED_ERR: Raised if the implementation does not support this method. * @deprecated Use getValueConstraintValue().getActualValueType() instead 
public	TokenNamepublic	
short	TokenNameshort	
getActualVCType	TokenNameIdentifier	 get Actual VC Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XSException	TokenNameIdentifier	 XS Exception
;	TokenNameSEMICOLON	
/** * In the case the actual constraint value represents a list, i.e. the * <code>actualValueType</code> is <code>LIST_DT</code>, the returned * array consists of one type kind which represents the itemType. If the * actual constraint value represents a list type definition whose item * type is a union type definition, i.e. <code>LISTOFUNION_DT</code>, * for each actual constraint value in the list the array contains the * corresponding memberType kind. For examples, see * <code>ItemPSVI.itemValueTypes</code>. * @exception XSException * NOT_SUPPORTED_ERR: Raised if the implementation does not support this * method. * * @deprecated Use getValueConstraintValue().getListValueTypes() instead */	TokenNameCOMMENT_JAVADOC	 In the case the actual constraint value represents a list, i.e. the <code>actualValueType</code> is <code>LIST_DT</code>, the returned array consists of one type kind which represents the itemType. If the actual constraint value represents a list type definition whose item type is a union type definition, i.e. <code>LISTOFUNION_DT</code>, for each actual constraint value in the list the array contains the corresponding memberType kind. For examples, see <code>ItemPSVI.itemValueTypes</code>. @exception XSException NOT_SUPPORTED_ERR: Raised if the implementation does not support this method. * @deprecated Use getValueConstraintValue().getListValueTypes() instead 
public	TokenNamepublic	
ShortList	TokenNameIdentifier	 Short List
getItemValueTypes	TokenNameIdentifier	 get Item Value Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XSException	TokenNameIdentifier	 XS Exception
;	TokenNameSEMICOLON	
/** * The actual value of the default or fixed value constraint. */	TokenNameCOMMENT_JAVADOC	 The actual value of the default or fixed value constraint. 
public	TokenNamepublic	
XSValue	TokenNameIdentifier	 XS Value
getValueConstraintValue	TokenNameIdentifier	 get Value Constraint Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A sequence of [annotations] or an empty <code>XSObjectList</code>. */	TokenNameCOMMENT_JAVADOC	 A sequence of [annotations] or an empty <code>XSObjectList</code>. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getAnnotations	TokenNameIdentifier	 get Annotations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
