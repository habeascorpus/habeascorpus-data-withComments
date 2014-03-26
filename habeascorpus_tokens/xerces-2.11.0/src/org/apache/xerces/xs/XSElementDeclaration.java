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
/** * The interface represents the Element Declaration schema component. */	TokenNameCOMMENT_JAVADOC	 The interface represents the Element Declaration schema component. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSElementDeclaration	TokenNameIdentifier	 XS Element Declaration
extends	TokenNameextends	
XSTerm	TokenNameIdentifier	 XS Term
{	TokenNameLBRACE	
/** * [type definition]: either a simple type definition or a complex type * definition. */	TokenNameCOMMENT_JAVADOC	 [type definition]: either a simple type definition or a complex type definition. 
public	TokenNamepublic	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
getTypeDefinition	TokenNameIdentifier	 get Type Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [scope]. One of <code>SCOPE_GLOBAL</code>, <code>SCOPE_LOCAL</code>, or * <code>SCOPE_ABSENT</code>. If the scope is local, then the * <code>enclosingCTDefinition</code> is present. */	TokenNameCOMMENT_JAVADOC	 [scope]. One of <code>SCOPE_GLOBAL</code>, <code>SCOPE_LOCAL</code>, or <code>SCOPE_ABSENT</code>. If the scope is local, then the <code>enclosingCTDefinition</code> is present. 
public	TokenNamepublic	
short	TokenNameshort	
getScope	TokenNameIdentifier	 get Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The complex type definition for locally scoped declarations (see * <code>scope</code>), otherwise <code>null</code> if no such * definition exists. */	TokenNameCOMMENT_JAVADOC	 The complex type definition for locally scoped declarations (see <code>scope</code>), otherwise <code>null</code> if no such definition exists. 
public	TokenNamepublic	
XSComplexTypeDefinition	TokenNameIdentifier	 XS Complex Type Definition
getEnclosingCTDefinition	TokenNameIdentifier	 get Enclosing CT Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [Value constraint]: one of <code>VC_NONE, VC_DEFAULT, VC_FIXED</code>. */	TokenNameCOMMENT_JAVADOC	 [Value constraint]: one of <code>VC_NONE, VC_DEFAULT, VC_FIXED</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getConstraintType	TokenNameIdentifier	 get Constraint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [Value constraint]: the constraint value with respect to the [type * definition], otherwise <code>null</code>. * * @deprecated Use getValueConstraintValue().getNormalizedValue() instead */	TokenNameCOMMENT_JAVADOC	 [Value constraint]: the constraint value with respect to the [type definition], otherwise <code>null</code>. * @deprecated Use getValueConstraintValue().getNormalizedValue() instead 
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
/** * If nillable is true, then an element may also be valid if it carries * the namespace qualified attribute with local name <code>nil</code> * from namespace <code>http://www.w3.org/2001/XMLSchema-instance</code> * and value <code>true</code> (xsi:nil) even if it has no text or * element content despite a <code>content type</code> which would * otherwise require content. */	TokenNameCOMMENT_JAVADOC	 If nillable is true, then an element may also be valid if it carries the namespace qualified attribute with local name <code>nil</code> from namespace <code>http://www.w3.org/2001/XMLSchema-instance</code> and value <code>true</code> (xsi:nil) even if it has no text or element content despite a <code>content type</code> which would otherwise require content. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getNillable	TokenNameIdentifier	 get Nillable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * identity-constraint definitions: a set of constraint definitions if it * exists, otherwise an empty <code>XSNamedMap</code>. */	TokenNameCOMMENT_JAVADOC	 identity-constraint definitions: a set of constraint definitions if it exists, otherwise an empty <code>XSNamedMap</code>. 
public	TokenNamepublic	
XSNamedMap	TokenNameIdentifier	 XS Named Map
getIdentityConstraints	TokenNameIdentifier	 get Identity Constraints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [substitution group affiliation]: a top-level element definition if it * exists, otherwise <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 [substitution group affiliation]: a top-level element definition if it exists, otherwise <code>null</code>. 
public	TokenNamepublic	
XSElementDeclaration	TokenNameIdentifier	 XS Element Declaration
getSubstitutionGroupAffiliation	TokenNameIdentifier	 get Substitution Group Affiliation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method that checks if <code>exclusion</code> is a * substitution group exclusion for this element declaration. * @param exclusion * <code>DERIVATION_EXTENSION, DERIVATION_RESTRICTION</code> or * <code>DERIVATION_NONE</code>. Represents final set for the element. * @return True if <code>exclusion</code> is a part of the substitution * group exclusion subset. */	TokenNameCOMMENT_JAVADOC	 Convenience method that checks if <code>exclusion</code> is a substitution group exclusion for this element declaration. @param exclusion <code>DERIVATION_EXTENSION, DERIVATION_RESTRICTION</code> or <code>DERIVATION_NONE</code>. Represents final set for the element. @return True if <code>exclusion</code> is a part of the substitution group exclusion subset. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSubstitutionGroupExclusion	TokenNameIdentifier	 is Substitution Group Exclusion
(	TokenNameLPAREN	
short	TokenNameshort	
exclusion	TokenNameIdentifier	 exclusion
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [substitution group exclusions]: the returned value is a bit * combination of the subset of { * <code>DERIVATION_EXTENSION, DERIVATION_RESTRICTION</code>} or * <code>DERIVATION_NONE</code>. */	TokenNameCOMMENT_JAVADOC	 [substitution group exclusions]: the returned value is a bit combination of the subset of { <code>DERIVATION_EXTENSION, DERIVATION_RESTRICTION</code>} or <code>DERIVATION_NONE</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getSubstitutionGroupExclusions	TokenNameIdentifier	 get Substitution Group Exclusions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method that checks if <code>disallowed</code> is a * disallowed substitution for this element declaration. * @param disallowed { * <code>DERIVATION_SUBSTITUTION, DERIVATION_EXTENSION, DERIVATION_RESTRICTION</code> * } or <code>DERIVATION_NONE</code>. Represents a block set for the * element. * @return True if <code>disallowed</code> is a part of the substitution * group exclusion subset. */	TokenNameCOMMENT_JAVADOC	 Convenience method that checks if <code>disallowed</code> is a disallowed substitution for this element declaration. @param disallowed { <code>DERIVATION_SUBSTITUTION, DERIVATION_EXTENSION, DERIVATION_RESTRICTION</code> } or <code>DERIVATION_NONE</code>. Represents a block set for the element. @return True if <code>disallowed</code> is a part of the substitution group exclusion subset. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDisallowedSubstitution	TokenNameIdentifier	 is Disallowed Substitution
(	TokenNameLPAREN	
short	TokenNameshort	
disallowed	TokenNameIdentifier	 disallowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [disallowed substitutions]: the returned value is a bit combination of * the subset of { * <code>DERIVATION_SUBSTITUTION, DERIVATION_EXTENSION, DERIVATION_RESTRICTION</code> * } corresponding to substitutions disallowed by this * <code>XSElementDeclaration</code> or <code>DERIVATION_NONE</code>. */	TokenNameCOMMENT_JAVADOC	 [disallowed substitutions]: the returned value is a bit combination of the subset of { <code>DERIVATION_SUBSTITUTION, DERIVATION_EXTENSION, DERIVATION_RESTRICTION</code> } corresponding to substitutions disallowed by this <code>XSElementDeclaration</code> or <code>DERIVATION_NONE</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getDisallowedSubstitutions	TokenNameIdentifier	 get Disallowed Substitutions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * {abstract} A boolean. */	TokenNameCOMMENT_JAVADOC	 {abstract} A boolean. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getAbstract	TokenNameIdentifier	 get Abstract
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * An annotation if it exists, otherwise <code>null</code>. If not null * then the first [annotation] from the sequence of annotations. */	TokenNameCOMMENT_JAVADOC	 An annotation if it exists, otherwise <code>null</code>. If not null then the first [annotation] from the sequence of annotations. 
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
getAnnotation	TokenNameIdentifier	 get Annotation
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