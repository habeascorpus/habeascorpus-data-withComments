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
/** * This interface represents the Simple Type Definition schema component. This * interface provides several query operations for facet components. Users * can either retrieve the defined facets as XML Schema components, using * the <code>facets</code> and the <code>multiValueFacets</code> attributes; * or users can separately query a facet's properties using methods such as * <code>getLexicalFacetValue</code>, <code>isFixedFacet</code>, etc. */	TokenNameCOMMENT_JAVADOC	 This interface represents the Simple Type Definition schema component. This interface provides several query operations for facet components. Users can either retrieve the defined facets as XML Schema components, using the <code>facets</code> and the <code>multiValueFacets</code> attributes; or users can separately query a facet's properties using methods such as <code>getLexicalFacetValue</code>, <code>isFixedFacet</code>, etc. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
extends	TokenNameextends	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
{	TokenNameLBRACE	
// Variety definitions 	TokenNameCOMMENT_LINE	Variety definitions 
/** * The variety is absent for the anySimpleType definition. */	TokenNameCOMMENT_JAVADOC	 The variety is absent for the anySimpleType definition. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VARIETY_ABSENT	TokenNameIdentifier	 VARIETY  ABSENT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * <code>Atomic</code> type. */	TokenNameCOMMENT_JAVADOC	 <code>Atomic</code> type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VARIETY_ATOMIC	TokenNameIdentifier	 VARIETY  ATOMIC
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * <code>List</code> type. */	TokenNameCOMMENT_JAVADOC	 <code>List</code> type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VARIETY_LIST	TokenNameIdentifier	 VARIETY  LIST
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * <code>Union</code> type. */	TokenNameCOMMENT_JAVADOC	 <code>Union</code> type. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
VARIETY_UNION	TokenNameIdentifier	 VARIETY  UNION
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Facets 	TokenNameCOMMENT_LINE	Facets 
/** * No facets defined. */	TokenNameCOMMENT_JAVADOC	 No facets defined. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FACET_NONE	TokenNameIdentifier	 FACET  NONE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * 4.3.1 Length */	TokenNameCOMMENT_JAVADOC	 4.3.1 Length 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FACET_LENGTH	TokenNameIdentifier	 FACET  LENGTH
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * 4.3.2 minLength. */	TokenNameCOMMENT_JAVADOC	 4.3.2 minLength. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FACET_MINLENGTH	TokenNameIdentifier	 FACET  MINLENGTH
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * 4.3.3 maxLength. */	TokenNameCOMMENT_JAVADOC	 4.3.3 maxLength. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FACET_MAXLENGTH	TokenNameIdentifier	 FACET  MAXLENGTH
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * 4.3.4 pattern. */	TokenNameCOMMENT_JAVADOC	 4.3.4 pattern. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FACET_PATTERN	TokenNameIdentifier	 FACET  PATTERN
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * 4.3.5 whitespace. */	TokenNameCOMMENT_JAVADOC	 4.3.5 whitespace. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FACET_WHITESPACE	TokenNameIdentifier	 FACET  WHITESPACE
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * 4.3.7 maxInclusive. */	TokenNameCOMMENT_JAVADOC	 4.3.7 maxInclusive. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * 4.3.9 maxExclusive. */	TokenNameCOMMENT_JAVADOC	 4.3.9 maxExclusive. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FACET_MAXEXCLUSIVE	TokenNameIdentifier	 FACET  MAXEXCLUSIVE
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * 4.3.9 minExclusive. */	TokenNameCOMMENT_JAVADOC	 4.3.9 minExclusive. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FACET_MINEXCLUSIVE	TokenNameIdentifier	 FACET  MINEXCLUSIVE
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * 4.3.10 minInclusive. */	TokenNameCOMMENT_JAVADOC	 4.3.10 minInclusive. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FACET_MININCLUSIVE	TokenNameIdentifier	 FACET  MININCLUSIVE
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * 4.3.11 totalDigits . */	TokenNameCOMMENT_JAVADOC	 4.3.11 totalDigits . 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FACET_TOTALDIGITS	TokenNameIdentifier	 FACET  TOTALDIGITS
=	TokenNameEQUAL	
512	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * 4.3.12 fractionDigits. */	TokenNameCOMMENT_JAVADOC	 4.3.12 fractionDigits. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FACET_FRACTIONDIGITS	TokenNameIdentifier	 FACET  FRACTIONDIGITS
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * 4.3.5 enumeration. */	TokenNameCOMMENT_JAVADOC	 4.3.5 enumeration. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FACET_ENUMERATION	TokenNameIdentifier	 FACET  ENUMERATION
=	TokenNameEQUAL	
2048	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A constant defined for the 'ordered' fundamental facet: not ordered. */	TokenNameCOMMENT_JAVADOC	 A constant defined for the 'ordered' fundamental facet: not ordered. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ORDERED_FALSE	TokenNameIdentifier	 ORDERED  FALSE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A constant defined for the 'ordered' fundamental facet: partially * ordered. */	TokenNameCOMMENT_JAVADOC	 A constant defined for the 'ordered' fundamental facet: partially ordered. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A constant defined for the 'ordered' fundamental facet: total ordered. */	TokenNameCOMMENT_JAVADOC	 A constant defined for the 'ordered' fundamental facet: total ordered. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ORDERED_TOTAL	TokenNameIdentifier	 ORDERED  TOTAL
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * [variety]: one of {atomic, list, union} or absent. */	TokenNameCOMMENT_JAVADOC	 [variety]: one of {atomic, list, union} or absent. 
public	TokenNamepublic	
short	TokenNameshort	
getVariety	TokenNameIdentifier	 get Variety
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If variety is <code>atomic</code> the primitive type definition (a * built-in primitive datatype definition or the simple ur-type * definition) is available, otherwise <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 If variety is <code>atomic</code> the primitive type definition (a built-in primitive datatype definition or the simple ur-type definition) is available, otherwise <code>null</code>. 
public	TokenNamepublic	
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the closest built-in type category this type represents or * derived from. For example, if this simple type is a built-in derived * type integer the <code>INTEGER_DV</code> is returned. */	TokenNameCOMMENT_JAVADOC	 Returns the closest built-in type category this type represents or derived from. For example, if this simple type is a built-in derived type integer the <code>INTEGER_DV</code> is returned. 
public	TokenNamepublic	
short	TokenNameshort	
getBuiltInKind	TokenNameIdentifier	 get Built In Kind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If variety is <code>list</code> the item type definition (an atomic or * union simple type definition) is available, otherwise * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 If variety is <code>list</code> the item type definition (an atomic or union simple type definition) is available, otherwise <code>null</code>. 
public	TokenNamepublic	
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
getItemType	TokenNameIdentifier	 get Item Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If variety is <code>union</code> the list of member type definitions (a * non-empty sequence of simple type definitions) is available, * otherwise an empty <code>XSObjectList</code>. */	TokenNameCOMMENT_JAVADOC	 If variety is <code>union</code> the list of member type definitions (a non-empty sequence of simple type definitions) is available, otherwise an empty <code>XSObjectList</code>. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getMemberTypes	TokenNameIdentifier	 get Member Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [facets]: all facets defined on this type. The value is a bit * combination of FACET_XXX constants of all defined facets. */	TokenNameCOMMENT_JAVADOC	 [facets]: all facets defined on this type. The value is a bit combination of FACET_XXX constants of all defined facets. 
public	TokenNamepublic	
short	TokenNameshort	
getDefinedFacets	TokenNameIdentifier	 get Defined Facets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. [Facets]: check whether a facet is defined on this * type. * @param facetName The name of the facet. * @return True if the facet is defined, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Convenience method. [Facets]: check whether a facet is defined on this type. @param facetName The name of the facet. @return True if the facet is defined, false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDefinedFacet	TokenNameIdentifier	 is Defined Facet
(	TokenNameLPAREN	
short	TokenNameshort	
facetName	TokenNameIdentifier	 facet Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [facets]: all defined facets for this type which are fixed. */	TokenNameCOMMENT_JAVADOC	 [facets]: all defined facets for this type which are fixed. 
public	TokenNamepublic	
short	TokenNameshort	
getFixedFacets	TokenNameIdentifier	 get Fixed Facets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. [Facets]: check whether a facet is defined and * fixed on this type. * @param facetName The name of the facet. * @return True if the facet is fixed, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Convenience method. [Facets]: check whether a facet is defined and fixed on this type. @param facetName The name of the facet. @return True if the facet is fixed, false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFixedFacet	TokenNameIdentifier	 is Fixed Facet
(	TokenNameLPAREN	
short	TokenNameshort	
facetName	TokenNameIdentifier	 facet Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method. Returns a value of a single constraining facet for * this simple type definition. This method must not be used to retrieve * values for <code>enumeration</code> and <code>pattern</code> facets. * @param facetName The name of the facet, i.e. * <code>FACET_LENGTH, FACET_TOTALDIGITS</code>. * To retrieve the value for a pattern or * an enumeration, see <code>enumeration</code> and * <code>pattern</code>. * @return A value of the facet specified in <code>facetName</code> for * this simple type definition or <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Convenience method. Returns a value of a single constraining facet for this simple type definition. This method must not be used to retrieve values for <code>enumeration</code> and <code>pattern</code> facets. @param facetName The name of the facet, i.e. <code>FACET_LENGTH, FACET_TOTALDIGITS</code>. To retrieve the value for a pattern or an enumeration, see <code>enumeration</code> and <code>pattern</code>. @return A value of the facet specified in <code>facetName</code> for this simple type definition or <code>null</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLexicalFacetValue	TokenNameIdentifier	 get Lexical Facet Value
(	TokenNameLPAREN	
short	TokenNameshort	
facetName	TokenNameIdentifier	 facet Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A list of enumeration values if it exists, otherwise an empty * <code>StringList</code>. */	TokenNameCOMMENT_JAVADOC	 A list of enumeration values if it exists, otherwise an empty <code>StringList</code>. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getLexicalEnumeration	TokenNameIdentifier	 get Lexical Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A list of pattern values if it exists, otherwise an empty * <code>StringList</code>. */	TokenNameCOMMENT_JAVADOC	 A list of pattern values if it exists, otherwise an empty <code>StringList</code>. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getLexicalPattern	TokenNameIdentifier	 get Lexical Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fundamental Facet: ordered. */	TokenNameCOMMENT_JAVADOC	 Fundamental Facet: ordered. 
public	TokenNamepublic	
short	TokenNameshort	
getOrdered	TokenNameIdentifier	 get Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fundamental Facet: cardinality. */	TokenNameCOMMENT_JAVADOC	 Fundamental Facet: cardinality. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFinite	TokenNameIdentifier	 get Finite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fundamental Facet: bounded. */	TokenNameCOMMENT_JAVADOC	 Fundamental Facet: bounded. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getBounded	TokenNameIdentifier	 get Bounded
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fundamental Facet: numeric. */	TokenNameCOMMENT_JAVADOC	 Fundamental Facet: numeric. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getNumeric	TokenNameIdentifier	 get Numeric
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A list of constraining facets if it exists, otherwise an empty * <code>XSObjectList</code>. Note: This method must not be used to * retrieve values for <code>enumeration</code> and <code>pattern</code> * facets. */	TokenNameCOMMENT_JAVADOC	 A list of constraining facets if it exists, otherwise an empty <code>XSObjectList</code>. Note: This method must not be used to retrieve values for <code>enumeration</code> and <code>pattern</code> facets. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getFacets	TokenNameIdentifier	 get Facets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A list of enumeration and pattern constraining facets if it exists, * otherwise an empty <code>XSObjectList</code>. */	TokenNameCOMMENT_JAVADOC	 A list of enumeration and pattern constraining facets if it exists, otherwise an empty <code>XSObjectList</code>. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getMultiValueFacets	TokenNameIdentifier	 get Multi Value Facets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A constraining facet object. An instance of XSFacet or XSMultiValueFacet. */	TokenNameCOMMENT_JAVADOC	 A constraining facet object. An instance of XSFacet or XSMultiValueFacet. 
public	TokenNamepublic	
XSObject	TokenNameIdentifier	 XS Object
getFacet	TokenNameIdentifier	 get Facet
(	TokenNameLPAREN	
int	TokenNameint	
facetType	TokenNameIdentifier	 facet Type
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
