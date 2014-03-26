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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
datatypes	TokenNameIdentifier	 datatypes
.	TokenNameDOT	
ObjectList	TokenNameIdentifier	 Object List
;	TokenNameSEMICOLON	
/** * Describes a multi-value constraining facets: pattern and enumeration. */	TokenNameCOMMENT_JAVADOC	 Describes a multi-value constraining facets: pattern and enumeration. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSMultiValueFacet	TokenNameIdentifier	 XS Multi Value Facet
extends	TokenNameextends	
XSObject	TokenNameIdentifier	 XS Object
{	TokenNameLBRACE	
/** * The name of the facet, i.e. <code>FACET_ENUMERATION</code> and * <code>FACET_PATTERN</code> (see <code>XSSimpleTypeDefinition</code>). */	TokenNameCOMMENT_JAVADOC	 The name of the facet, i.e. <code>FACET_ENUMERATION</code> and <code>FACET_PATTERN</code> (see <code>XSSimpleTypeDefinition</code>). 
public	TokenNamepublic	
short	TokenNameshort	
getFacetKind	TokenNameIdentifier	 get Facet Kind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Values of this facet. */	TokenNameCOMMENT_JAVADOC	 Values of this facet. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getLexicalFacetValues	TokenNameIdentifier	 get Lexical Facet Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A list of XSValue objects. The actual enumeration values. */	TokenNameCOMMENT_JAVADOC	 A list of XSValue objects. The actual enumeration values. 
public	TokenNamepublic	
ObjectList	TokenNameIdentifier	 Object List
getEnumerationValues	TokenNameIdentifier	 get Enumeration Values
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
