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
/** * Describes a constraining facet. Enumeration and pattern facets are exposed * via <code>XSMultiValueFacet</code> interface. */	TokenNameCOMMENT_JAVADOC	 Describes a constraining facet. Enumeration and pattern facets are exposed via <code>XSMultiValueFacet</code> interface. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSFacet	TokenNameIdentifier	 XS Facet
extends	TokenNameextends	
XSObject	TokenNameIdentifier	 XS Object
{	TokenNameLBRACE	
/** * The name of the facet, e.g. <code>FACET_LENGTH, FACET_TOTALDIGITS</code> * (see <code>XSSimpleTypeDefinition</code>). */	TokenNameCOMMENT_JAVADOC	 The name of the facet, e.g. <code>FACET_LENGTH, FACET_TOTALDIGITS</code> (see <code>XSSimpleTypeDefinition</code>). 
public	TokenNamepublic	
short	TokenNameshort	
getFacetKind	TokenNameIdentifier	 get Facet Kind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A value of this facet. */	TokenNameCOMMENT_JAVADOC	 A value of this facet. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLexicalFacetValue	TokenNameIdentifier	 get Lexical Facet Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If this facet is length, minLength, maxLength, totalDigits, or * fractionDigits, and if the value can fit in "int", then return the value * of the facet as an int. If the value can't fit, return -1. Use * getActualFacetValue() to get the BigInteger representation. For all other * facets, return 0. */	TokenNameCOMMENT_JAVADOC	 If this facet is length, minLength, maxLength, totalDigits, or fractionDigits, and if the value can fit in "int", then return the value of the facet as an int. If the value can't fit, return -1. Use getActualFacetValue() to get the BigInteger representation. For all other facets, return 0. 
public	TokenNamepublic	
int	TokenNameint	
getIntFacetValue	TokenNameIdentifier	 get Int Facet Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If this facet is minInclusive, maxInclusive, minExclusive, or * maxExclusive, then return the actual value of the facet. If this facet * is length, minLength, maxLength, totalDigits, or fractionDigits, then * return a BigInteger representation of the value. If this facet is * whiteSpace, then return the String representation of the facet. */	TokenNameCOMMENT_JAVADOC	 If this facet is minInclusive, maxInclusive, minExclusive, or maxExclusive, then return the actual value of the facet. If this facet is length, minLength, maxLength, totalDigits, or fractionDigits, then return a BigInteger representation of the value. If this facet is whiteSpace, then return the String representation of the facet. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getActualFacetValue	TokenNameIdentifier	 get Actual Facet Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * [Facets]: check whether a facet is fixed. */	TokenNameCOMMENT_JAVADOC	 [Facets]: check whether a facet is fixed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFixed	TokenNameIdentifier	 get Fixed
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
