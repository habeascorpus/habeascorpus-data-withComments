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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
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
/** * To store and validate information about substitutionGroup * * @xerces.internal * * @author Sandy Gao, IBM * * @version $Id: SubstitutionGroupHandler.java 982466 2010-08-05 04:41:01Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 To store and validate information about substitutionGroup * @xerces.internal * @author Sandy Gao, IBM * @version $Id: SubstitutionGroupHandler.java 982466 2010-08-05 04:41:01Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
SubstitutionGroupHandler	TokenNameIdentifier	 Substitution Group Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_GROUP	TokenNameIdentifier	 EMPTY  GROUP
=	TokenNameEQUAL	
new	TokenNamenew	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// global element declaration resolver 	TokenNameCOMMENT_LINE	global element declaration resolver 
private	TokenNameprivate	
final	TokenNamefinal	
XSElementDeclHelper	TokenNameIdentifier	 XS Element Decl Helper
fXSElementDeclHelper	TokenNameIdentifier	 f XS Element Decl Helper
;	TokenNameSEMICOLON	
/** * Default constructor */	TokenNameCOMMENT_JAVADOC	 Default constructor 
public	TokenNamepublic	
SubstitutionGroupHandler	TokenNameIdentifier	 Substitution Group Handler
(	TokenNameLPAREN	
XSElementDeclHelper	TokenNameIdentifier	 XS Element Decl Helper
elementDeclHelper	TokenNameIdentifier	 element Decl Helper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fXSElementDeclHelper	TokenNameIdentifier	 f XS Element Decl Helper
=	TokenNameEQUAL	
elementDeclHelper	TokenNameIdentifier	 element Decl Helper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 3.9.4 Element Sequence Locally Valid (Particle) 2.3.3 	TokenNameCOMMENT_LINE	3.9.4 Element Sequence Locally Valid (Particle) 2.3.3 
// check whether one element decl matches an element with the given qname 	TokenNameCOMMENT_LINE	check whether one element decl matches an element with the given qname 
public	TokenNamepublic	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
getMatchingElemDecl	TokenNameIdentifier	 get Matching Elem Decl
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
exemplar	TokenNameIdentifier	 exemplar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
exemplar	TokenNameIdentifier	 exemplar
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
&&	TokenNameAND_AND	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
exemplar	TokenNameIdentifier	 exemplar
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exemplar	TokenNameIdentifier	 exemplar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if the exemplar is not a global element decl, then it's not possible 	TokenNameCOMMENT_LINE	if the exemplar is not a global element decl, then it's not possible 
// to be substituted by another element. 	TokenNameCOMMENT_LINE	to be substituted by another element. 
if	TokenNameif	
(	TokenNameLPAREN	
exemplar	TokenNameIdentifier	 exemplar
.	TokenNameDOT	
fScope	TokenNameIdentifier	 f Scope
!=	TokenNameNOT_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
SCOPE_GLOBAL	TokenNameIdentifier	 SCOPE  GLOBAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if the decl blocks substitution, return false 	TokenNameCOMMENT_LINE	if the decl blocks substitution, return false 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
exemplar	TokenNameIdentifier	 exemplar
.	TokenNameDOT	
fBlock	TokenNameIdentifier	 f Block
&	TokenNameAND	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DERIVATION_SUBSTITUTION	TokenNameIdentifier	 DERIVATION  SUBSTITUTION
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get the decl for the element 	TokenNameCOMMENT_LINE	get the decl for the element 
XSElementDecl	TokenNameIdentifier	 XS Element Decl
eDecl	TokenNameIdentifier	 e Decl
=	TokenNameEQUAL	
fXSElementDeclHelper	TokenNameIdentifier	 f XS Element Decl Helper
.	TokenNameDOT	
getGlobalElementDecl	TokenNameIdentifier	 get Global Element Decl
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eDecl	TokenNameIdentifier	 e Decl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// and check by using substitutionGroup information 	TokenNameCOMMENT_LINE	and check by using substitutionGroup information 
if	TokenNameif	
(	TokenNameLPAREN	
substitutionGroupOK	TokenNameIdentifier	 substitution Group OK
(	TokenNameLPAREN	
eDecl	TokenNameIdentifier	 e Decl
,	TokenNameCOMMA	
exemplar	TokenNameIdentifier	 exemplar
,	TokenNameCOMMA	
exemplar	TokenNameIdentifier	 exemplar
.	TokenNameDOT	
fBlock	TokenNameIdentifier	 f Block
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eDecl	TokenNameIdentifier	 e Decl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 3.3.6 Substitution Group OK (Transitive) 	TokenNameCOMMENT_LINE	3.3.6 Substitution Group OK (Transitive) 
// check whether element can substitute exemplar 	TokenNameCOMMENT_LINE	check whether element can substitute exemplar 
protected	TokenNameprotected	
boolean	TokenNameboolean	
substitutionGroupOK	TokenNameIdentifier	 substitution Group OK
(	TokenNameLPAREN	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
exemplar	TokenNameIdentifier	 exemplar
,	TokenNameCOMMA	
short	TokenNameshort	
blockingConstraint	TokenNameIdentifier	 blocking Constraint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For an element declaration (call it D) to be validly substitutable for another element declaration (call it C) subject to a blocking constraint (a subset of {substitution, extension, restriction}, the value of a {disallowed substitutions}) one of the following must be true: 	TokenNameCOMMENT_LINE	For an element declaration (call it D) to be validly substitutable for another element declaration (call it C) subject to a blocking constraint (a subset of {substitution, extension, restriction}, the value of a {disallowed substitutions}) one of the following must be true: 
// 1. D and C are the same element declaration. 	TokenNameCOMMENT_LINE	1. D and C are the same element declaration. 
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
==	TokenNameEQUAL_EQUAL	
exemplar	TokenNameIdentifier	 exemplar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 2 All of the following must be true: 	TokenNameCOMMENT_LINE	2 All of the following must be true: 
// 2.1 The blocking constraint does not contain substitution. 	TokenNameCOMMENT_LINE	2.1 The blocking constraint does not contain substitution. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
blockingConstraint	TokenNameIdentifier	 blocking Constraint
&	TokenNameAND	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DERIVATION_SUBSTITUTION	TokenNameIdentifier	 DERIVATION  SUBSTITUTION
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 2.2 There is a chain of {substitution group affiliation}s from D to C, that is, either D's {substitution group affiliation} is C, or D's {substitution group affiliation}'s {substitution group affiliation} is C, or . . . 	TokenNameCOMMENT_LINE	2.2 There is a chain of {substitution group affiliation}s from D to C, that is, either D's {substitution group affiliation} is C, or D's {substitution group affiliation}'s {substitution group affiliation} is C, or . . . 
XSElementDecl	TokenNameIdentifier	 XS Element Decl
subGroup	TokenNameIdentifier	 sub Group
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
fSubGroup	TokenNameIdentifier	 f Sub Group
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
subGroup	TokenNameIdentifier	 sub Group
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
subGroup	TokenNameIdentifier	 sub Group
!=	TokenNameNOT_EQUAL	
exemplar	TokenNameIdentifier	 exemplar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subGroup	TokenNameIdentifier	 sub Group
=	TokenNameEQUAL	
subGroup	TokenNameIdentifier	 sub Group
.	TokenNameDOT	
fSubGroup	TokenNameIdentifier	 f Sub Group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subGroup	TokenNameIdentifier	 sub Group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 2.3 The set of all {derivation method}s involved in the derivation of D's {type definition} from C's {type definition} does not intersect with the union of the blocking constraint, C's {prohibited substitutions} (if C is complex, otherwise the empty set) and the {prohibited substitutions} (respectively the empty set) of any intermediate {type definition}s in the derivation of D's {type definition} from C's {type definition}. 	TokenNameCOMMENT_LINE	2.3 The set of all {derivation method}s involved in the derivation of D's {type definition} from C's {type definition} does not intersect with the union of the blocking constraint, C's {prohibited substitutions} (if C is complex, otherwise the empty set) and the {prohibited substitutions} (respectively the empty set) of any intermediate {type definition}s in the derivation of D's {type definition} from C's {type definition}. 
// prepare the combination of {derivation method} and 	TokenNameCOMMENT_LINE	prepare the combination of {derivation method} and 
// {disallowed substitution} 	TokenNameCOMMENT_LINE	{disallowed substitution} 
return	TokenNamereturn	
typeDerivationOK	TokenNameIdentifier	 type Derivation OK
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
,	TokenNameCOMMA	
exemplar	TokenNameIdentifier	 exemplar
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
,	TokenNameCOMMA	
blockingConstraint	TokenNameIdentifier	 blocking Constraint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
typeDerivationOK	TokenNameIdentifier	 type Derivation OK
(	TokenNameLPAREN	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
derived	TokenNameIdentifier	 derived
,	TokenNameCOMMA	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
short	TokenNameshort	
blockingConstraint	TokenNameIdentifier	 blocking Constraint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
devMethod	TokenNameIdentifier	 dev Method
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
blockConstraint	TokenNameIdentifier	 block Constraint
=	TokenNameEQUAL	
blockingConstraint	TokenNameIdentifier	 blocking Constraint
;	TokenNameSEMICOLON	
// "derived" should be derived from "base" 	TokenNameCOMMENT_LINE	"derived" should be derived from "base" 
// add derivation methods of derived types to devMethod; 	TokenNameCOMMENT_LINE	add derivation methods of derived types to devMethod; 
// add block of base types to blockConstraint. 	TokenNameCOMMENT_LINE	add block of base types to blockConstraint. 
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
derived	TokenNameIdentifier	 derived
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
base	TokenNameIdentifier	 base
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
.	TokenNameDOT	
fAnyType	TokenNameIdentifier	 f Any Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
getTypeCategory	TokenNameIdentifier	 get Type Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
.	TokenNameDOT	
COMPLEX_TYPE	TokenNameIdentifier	 COMPLEX  TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
devMethod	TokenNameIdentifier	 dev Method
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
)	TokenNameRPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
.	TokenNameDOT	
fDerivedBy	TokenNameIdentifier	 f Derived By
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
devMethod	TokenNameIdentifier	 dev Method
|=	TokenNameOR_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DERIVATION_RESTRICTION	TokenNameIdentifier	 DERIVATION  RESTRICTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
getBaseType	TokenNameIdentifier	 get Base Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// type == null means the current type is anySimpleType, 	TokenNameCOMMENT_LINE	type == null means the current type is anySimpleType, 
// whose base type should be anyType 	TokenNameCOMMENT_LINE	whose base type should be anyType 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
.	TokenNameDOT	
fAnyType	TokenNameIdentifier	 f Any Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
getTypeCategory	TokenNameIdentifier	 get Type Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
.	TokenNameDOT	
COMPLEX_TYPE	TokenNameIdentifier	 COMPLEX  TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blockConstraint	TokenNameIdentifier	 block Constraint
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
)	TokenNameRPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
.	TokenNameDOT	
fBlock	TokenNameIdentifier	 f Block
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the base is a union, check if "derived" is allowed through any of the member types. 	TokenNameCOMMENT_LINE	If the base is a union, check if "derived" is allowed through any of the member types. 
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
getTypeCategory	TokenNameIdentifier	 get Type Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
.	TokenNameDOT	
SIMPLE_TYPE	TokenNameIdentifier	 SIMPLE  TYPE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
)	TokenNameRPAREN	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
getVariety	TokenNameIdentifier	 get Variety
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
.	TokenNameDOT	
VARIETY_UNION	TokenNameIdentifier	 VARIETY  UNION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSObjectList	TokenNameIdentifier	 XS Object List
memberTypes	TokenNameIdentifier	 member Types
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
getMemberTypes	TokenNameIdentifier	 get Member Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
memberTypes	TokenNameIdentifier	 member Types
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
typeDerivationOK	TokenNameIdentifier	 type Derivation OK
(	TokenNameLPAREN	
derived	TokenNameIdentifier	 derived
,	TokenNameCOMMA	
(	TokenNameLPAREN	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
)	TokenNameRPAREN	
memberTypes	TokenNameIdentifier	 member Types
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
blockingConstraint	TokenNameIdentifier	 blocking Constraint
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
devMethod	TokenNameIdentifier	 dev Method
&	TokenNameAND	
blockConstraint	TokenNameIdentifier	 block Constraint
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check whether element is in exemplar's substitution group 	TokenNameCOMMENT_LINE	check whether element is in exemplar's substitution group 
public	TokenNamepublic	
boolean	TokenNameboolean	
inSubstitutionGroup	TokenNameIdentifier	 in Substitution Group
(	TokenNameLPAREN	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
exemplar	TokenNameIdentifier	 exemplar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// [Definition:] Every element declaration (call this HEAD) in the {element declarations} of a schema defines a substitution group, a subset of those {element declarations}, as follows: 	TokenNameCOMMENT_LINE	[Definition:] Every element declaration (call this HEAD) in the {element declarations} of a schema defines a substitution group, a subset of those {element declarations}, as follows: 
// Define PSG, the potential substitution group for HEAD, as follows: 	TokenNameCOMMENT_LINE	Define PSG, the potential substitution group for HEAD, as follows: 
// 1 The element declaration itself is in PSG; 	TokenNameCOMMENT_LINE	1 The element declaration itself is in PSG; 
// 2 PSG is closed with respect to {substitution group affiliation}, that is, if any element declaration in the {element declarations} has a {substitution group affiliation} in PSG, then it is also in PSG itself. 	TokenNameCOMMENT_LINE	2 PSG is closed with respect to {substitution group affiliation}, that is, if any element declaration in the {element declarations} has a {substitution group affiliation} in PSG, then it is also in PSG itself. 
// HEAD's actual substitution group is then the set consisting of each member of PSG such that all of the following must be true: 	TokenNameCOMMENT_LINE	HEAD's actual substitution group is then the set consisting of each member of PSG such that all of the following must be true: 
// 1 Its {abstract} is false. 	TokenNameCOMMENT_LINE	1 Its {abstract} is false. 
// 2 It is validly substitutable for HEAD subject to an empty blocking constraint, as defined in Substitution Group OK (Transitive) (3.3.6). 	TokenNameCOMMENT_LINE	2 It is validly substitutable for HEAD subject to an empty blocking constraint, as defined in Substitution Group OK (Transitive) (3.3.6). 
return	TokenNamereturn	
substitutionGroupOK	TokenNameIdentifier	 substitution Group OK
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
exemplar	TokenNameIdentifier	 exemplar
,	TokenNameCOMMA	
exemplar	TokenNameIdentifier	 exemplar
.	TokenNameDOT	
fBlock	TokenNameIdentifier	 f Block
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// to store substitution group information 	TokenNameCOMMENT_LINE	to store substitution group information 
// the key to the hashtable is an element decl, and the value is 	TokenNameCOMMENT_LINE	the key to the hashtable is an element decl, and the value is 
// - a Vector, which contains all elements that has this element as their 	TokenNameCOMMENT_LINE	- a Vector, which contains all elements that has this element as their 
// substitution group affilication 	TokenNameCOMMENT_LINE	substitution group affilication 
// - an array of OneSubGroup, which contains its substitution group before block. 	TokenNameCOMMENT_LINE	- an array of OneSubGroup, which contains its substitution group before block. 
Hashtable	TokenNameIdentifier	 Hashtable
fSubGroupsB	TokenNameIdentifier	 f Sub Groups B
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
OneSubGroup	TokenNameIdentifier	 One Sub Group
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_VECTOR	TokenNameIdentifier	 EMPTY  VECTOR
=	TokenNameEQUAL	
new	TokenNamenew	
OneSubGroup	TokenNameIdentifier	 One Sub Group
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// The real substitution groups (after "block") 	TokenNameCOMMENT_LINE	The real substitution groups (after "block") 
Hashtable	TokenNameIdentifier	 Hashtable
fSubGroups	TokenNameIdentifier	 f Sub Groups
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * clear the internal registry of substitutionGroup information */	TokenNameCOMMENT_JAVADOC	 clear the internal registry of substitutionGroup information 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSubGroupsB	TokenNameIdentifier	 f Sub Groups B
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSubGroups	TokenNameIdentifier	 f Sub Groups
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a list of substitution group information. */	TokenNameCOMMENT_JAVADOC	 add a list of substitution group information. 
public	TokenNamepublic	
void	TokenNamevoid	
addSubstitutionGroup	TokenNameIdentifier	 add Substitution Group
(	TokenNameLPAREN	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elements	TokenNameIdentifier	 elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
subHead	TokenNameIdentifier	 sub Head
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
subGroup	TokenNameIdentifier	 sub Group
;	TokenNameSEMICOLON	
// for all elements with substitution group affiliation 	TokenNameCOMMENT_LINE	for all elements with substitution group affiliation 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
elements	TokenNameIdentifier	 elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
subHead	TokenNameIdentifier	 sub Head
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
fSubGroup	TokenNameIdentifier	 f Sub Group
;	TokenNameSEMICOLON	
// check whether this an entry for this element 	TokenNameCOMMENT_LINE	check whether this an entry for this element 
subGroup	TokenNameIdentifier	 sub Group
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
fSubGroupsB	TokenNameIdentifier	 f Sub Groups B
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subHead	TokenNameIdentifier	 sub Head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subGroup	TokenNameIdentifier	 sub Group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if not, create a new one 	TokenNameCOMMENT_LINE	if not, create a new one 
subGroup	TokenNameIdentifier	 sub Group
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSubGroupsB	TokenNameIdentifier	 f Sub Groups B
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
subHead	TokenNameIdentifier	 sub Head
,	TokenNameCOMMA	
subGroup	TokenNameIdentifier	 sub Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add to the vactor 	TokenNameCOMMENT_LINE	add to the vactor 
subGroup	TokenNameIdentifier	 sub Group
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * get all elements that can substitute the given element, * according to the spec, we shouldn't consider the {block} constraints. * * from the spec, substitution group of a given element decl also contains * the element itself. but the array returned from this method doesn't * containt this element. */	TokenNameCOMMENT_JAVADOC	 get all elements that can substitute the given element, according to the spec, we shouldn't consider the {block} constraints. * from the spec, substitution group of a given element decl also contains the element itself. but the array returned from this method doesn't containt this element. 
public	TokenNamepublic	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSubstitutionGroup	TokenNameIdentifier	 get Substitution Group
(	TokenNameLPAREN	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we already have sub group for this element, just return it. 	TokenNameCOMMENT_LINE	If we already have sub group for this element, just return it. 
Object	TokenNameIdentifier	 Object
subGroup	TokenNameIdentifier	 sub Group
=	TokenNameEQUAL	
fSubGroups	TokenNameIdentifier	 f Sub Groups
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subGroup	TokenNameIdentifier	 sub Group
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
subGroup	TokenNameIdentifier	 sub Group
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
fBlock	TokenNameIdentifier	 f Block
&	TokenNameAND	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DERIVATION_SUBSTITUTION	TokenNameIdentifier	 DERIVATION  SUBSTITUTION
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSubGroups	TokenNameIdentifier	 f Sub Groups
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
EMPTY_GROUP	TokenNameIdentifier	 EMPTY  GROUP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
EMPTY_GROUP	TokenNameIdentifier	 EMPTY  GROUP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Otherwise, get all potential sub group elements 	TokenNameCOMMENT_LINE	Otherwise, get all potential sub group elements 
// (without considering "block" on this element 	TokenNameCOMMENT_LINE	(without considering "block" on this element 
OneSubGroup	TokenNameIdentifier	 One Sub Group
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
groupB	TokenNameIdentifier	 group B
=	TokenNameEQUAL	
getSubGroupB	TokenNameIdentifier	 get Sub Group B
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
new	TokenNamenew	
OneSubGroup	TokenNameIdentifier	 One Sub Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
groupB	TokenNameIdentifier	 group B
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
rlen	TokenNameIdentifier	 rlen
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// For each of such elements, check whether the derivation methods 	TokenNameCOMMENT_LINE	For each of such elements, check whether the derivation methods 
// overlap with "block". If not, add it to the sub group 	TokenNameCOMMENT_LINE	overlap with "block". If not, add it to the sub group 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
fBlock	TokenNameIdentifier	 f Block
&	TokenNameAND	
groupB	TokenNameIdentifier	 group B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
dMethod	TokenNameIdentifier	 d Method
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
rlen	TokenNameIdentifier	 rlen
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
groupB	TokenNameIdentifier	 group B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
sub	TokenNameIdentifier	 sub
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Resize the array if necessary 	TokenNameCOMMENT_LINE	Resize the array if necessary 
if	TokenNameif	
(	TokenNameLPAREN	
rlen	TokenNameIdentifier	 rlen
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret1	TokenNameIdentifier	 ret1
=	TokenNameEQUAL	
new	TokenNamenew	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
[	TokenNameLBRACKET	
rlen	TokenNameIdentifier	 rlen
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ret1	TokenNameIdentifier	 ret1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rlen	TokenNameIdentifier	 rlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
ret1	TokenNameIdentifier	 ret1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Store the subgroup 	TokenNameCOMMENT_LINE	Store the subgroup 
fSubGroups	TokenNameIdentifier	 f Sub Groups
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Get potential sub group element (without considering "block") 	TokenNameCOMMENT_LINE	Get potential sub group element (without considering "block") 
private	TokenNameprivate	
OneSubGroup	TokenNameIdentifier	 One Sub Group
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSubGroupB	TokenNameIdentifier	 get Sub Group B
(	TokenNameLPAREN	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
OneSubGroup	TokenNameIdentifier	 One Sub Group
methods	TokenNameIdentifier	 methods
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
subGroup	TokenNameIdentifier	 sub Group
=	TokenNameEQUAL	
fSubGroupsB	TokenNameIdentifier	 f Sub Groups B
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// substitution group for this one is empty 	TokenNameCOMMENT_LINE	substitution group for this one is empty 
if	TokenNameif	
(	TokenNameLPAREN	
subGroup	TokenNameIdentifier	 sub Group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSubGroupsB	TokenNameIdentifier	 f Sub Groups B
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
EMPTY_VECTOR	TokenNameIdentifier	 EMPTY  VECTOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
EMPTY_VECTOR	TokenNameIdentifier	 EMPTY  VECTOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we've already calculated the element, just return. 	TokenNameCOMMENT_LINE	we've already calculated the element, just return. 
if	TokenNameif	
(	TokenNameLPAREN	
subGroup	TokenNameIdentifier	 sub Group
instanceof	TokenNameinstanceof	
OneSubGroup	TokenNameIdentifier	 One Sub Group
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
OneSubGroup	TokenNameIdentifier	 One Sub Group
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
subGroup	TokenNameIdentifier	 sub Group
;	TokenNameSEMICOLON	
// we only have the *direct* substitutions 	TokenNameCOMMENT_LINE	we only have the *direct* substitutions 
Vector	TokenNameIdentifier	 Vector
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
subGroup	TokenNameIdentifier	 sub Group
,	TokenNameCOMMA	
newGroup	TokenNameIdentifier	 new Group
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OneSubGroup	TokenNameIdentifier	 One Sub Group
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
group1	TokenNameIdentifier	 group1
;	TokenNameSEMICOLON	
// then for each of the direct substitutions, get its substitution 	TokenNameCOMMENT_LINE	then for each of the direct substitutions, get its substitution 
// group, and combine the groups together. 	TokenNameCOMMENT_LINE	group, and combine the groups together. 
short	TokenNameshort	
dMethod	TokenNameIdentifier	 d Method
,	TokenNameCOMMA	
bMethod	TokenNameIdentifier	 b Method
,	TokenNameCOMMA	
dSubMethod	TokenNameIdentifier	 d Sub Method
,	TokenNameCOMMA	
bSubMethod	TokenNameIdentifier	 b Sub Method
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check whether this element is blocked. If so, ignore it. 	TokenNameCOMMENT_LINE	Check whether this element is blocked. If so, ignore it. 
XSElementDecl	TokenNameIdentifier	 XS Element Decl
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
)	TokenNameRPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getDBMethods	TokenNameIdentifier	 get DB Methods
(	TokenNameLPAREN	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
fType	TokenNameIdentifier	 f Type
,	TokenNameCOMMA	
methods	TokenNameIdentifier	 methods
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// Remember derivation methods and blocks from the types 	TokenNameCOMMENT_LINE	Remember derivation methods and blocks from the types 
dMethod	TokenNameIdentifier	 d Method
=	TokenNameEQUAL	
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
dMethod	TokenNameIdentifier	 d Method
;	TokenNameSEMICOLON	
bMethod	TokenNameIdentifier	 b Method
=	TokenNameEQUAL	
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
bMethod	TokenNameIdentifier	 b Method
;	TokenNameSEMICOLON	
// Add this one to potential group 	TokenNameCOMMENT_LINE	Add this one to potential group 
newGroup	TokenNameIdentifier	 new Group
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
OneSubGroup	TokenNameIdentifier	 One Sub Group
(	TokenNameLPAREN	
sub	TokenNameIdentifier	 sub
,	TokenNameCOMMA	
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
dMethod	TokenNameIdentifier	 d Method
,	TokenNameCOMMA	
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
bMethod	TokenNameIdentifier	 b Method
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get potential group for this element 	TokenNameCOMMENT_LINE	Get potential group for this element 
group1	TokenNameIdentifier	 group1
=	TokenNameEQUAL	
getSubGroupB	TokenNameIdentifier	 get Sub Group B
(	TokenNameLPAREN	
sub	TokenNameIdentifier	 sub
,	TokenNameCOMMA	
methods	TokenNameIdentifier	 methods
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
group1	TokenNameIdentifier	 group1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For each of them, check whether it's blocked (by type) 	TokenNameCOMMENT_LINE	For each of them, check whether it's blocked (by type) 
dSubMethod	TokenNameIdentifier	 d Sub Method
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
dMethod	TokenNameIdentifier	 d Method
|	TokenNameOR	
group1	TokenNameIdentifier	 group1
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
dMethod	TokenNameIdentifier	 d Method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bSubMethod	TokenNameIdentifier	 b Sub Method
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bMethod	TokenNameIdentifier	 b Method
|	TokenNameOR	
group1	TokenNameIdentifier	 group1
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
bMethod	TokenNameIdentifier	 b Method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Ignore it if it's blocked 	TokenNameCOMMENT_LINE	Ignore it if it's blocked 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dSubMethod	TokenNameIdentifier	 d Sub Method
&	TokenNameAND	
bSubMethod	TokenNameIdentifier	 b Sub Method
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
newGroup	TokenNameIdentifier	 new Group
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
OneSubGroup	TokenNameIdentifier	 One Sub Group
(	TokenNameLPAREN	
group1	TokenNameIdentifier	 group1
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
sub	TokenNameIdentifier	 sub
,	TokenNameCOMMA	
dSubMethod	TokenNameIdentifier	 d Sub Method
,	TokenNameCOMMA	
bSubMethod	TokenNameIdentifier	 b Sub Method
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Convert to an array 	TokenNameCOMMENT_LINE	Convert to an array 
OneSubGroup	TokenNameIdentifier	 One Sub Group
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
OneSubGroup	TokenNameIdentifier	 One Sub Group
[	TokenNameLBRACKET	
newGroup	TokenNameIdentifier	 new Group
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
newGroup	TokenNameIdentifier	 new Group
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OneSubGroup	TokenNameIdentifier	 One Sub Group
)	TokenNameRPAREN	
newGroup	TokenNameIdentifier	 new Group
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Store the potential sub group 	TokenNameCOMMENT_LINE	Store the potential sub group 
fSubGroupsB	TokenNameIdentifier	 f Sub Groups B
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
getDBMethods	TokenNameIdentifier	 get DB Methods
(	TokenNameLPAREN	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
typed	TokenNameIdentifier	 typed
,	TokenNameCOMMA	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
typeb	TokenNameIdentifier	 typeb
,	TokenNameCOMMA	
OneSubGroup	TokenNameIdentifier	 One Sub Group
methods	TokenNameIdentifier	 methods
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
dMethod	TokenNameIdentifier	 d Method
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bMethod	TokenNameIdentifier	 b Method
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
typed	TokenNameIdentifier	 typed
!=	TokenNameNOT_EQUAL	
typeb	TokenNameIdentifier	 typeb
&&	TokenNameAND_AND	
typed	TokenNameIdentifier	 typed
!=	TokenNameNOT_EQUAL	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
.	TokenNameDOT	
fAnyType	TokenNameIdentifier	 f Any Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
typed	TokenNameIdentifier	 typed
.	TokenNameDOT	
getTypeCategory	TokenNameIdentifier	 get Type Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
.	TokenNameDOT	
COMPLEX_TYPE	TokenNameIdentifier	 COMPLEX  TYPE
)	TokenNameRPAREN	
dMethod	TokenNameIdentifier	 d Method
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
)	TokenNameRPAREN	
typed	TokenNameIdentifier	 typed
)	TokenNameRPAREN	
.	TokenNameDOT	
fDerivedBy	TokenNameIdentifier	 f Derived By
;	TokenNameSEMICOLON	
else	TokenNameelse	
dMethod	TokenNameIdentifier	 d Method
|=	TokenNameOR_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DERIVATION_RESTRICTION	TokenNameIdentifier	 DERIVATION  RESTRICTION
;	TokenNameSEMICOLON	
typed	TokenNameIdentifier	 typed
=	TokenNameEQUAL	
typed	TokenNameIdentifier	 typed
.	TokenNameDOT	
getBaseType	TokenNameIdentifier	 get Base Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// type == null means the current type is anySimpleType, 	TokenNameCOMMENT_LINE	type == null means the current type is anySimpleType, 
// whose base type should be anyType 	TokenNameCOMMENT_LINE	whose base type should be anyType 
if	TokenNameif	
(	TokenNameLPAREN	
typed	TokenNameIdentifier	 typed
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
typed	TokenNameIdentifier	 typed
=	TokenNameEQUAL	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
.	TokenNameDOT	
fAnyType	TokenNameIdentifier	 f Any Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
typed	TokenNameIdentifier	 typed
.	TokenNameDOT	
getTypeCategory	TokenNameIdentifier	 get Type Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
.	TokenNameDOT	
COMPLEX_TYPE	TokenNameIdentifier	 COMPLEX  TYPE
)	TokenNameRPAREN	
bMethod	TokenNameIdentifier	 b Method
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSComplexTypeDecl	TokenNameIdentifier	 XS Complex Type Decl
)	TokenNameRPAREN	
typed	TokenNameIdentifier	 typed
)	TokenNameRPAREN	
.	TokenNameDOT	
fBlock	TokenNameIdentifier	 f Block
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// No derivation relation, or blocked, return false 	TokenNameCOMMENT_LINE	No derivation relation, or blocked, return false 
if	TokenNameif	
(	TokenNameLPAREN	
typed	TokenNameIdentifier	 typed
!=	TokenNameNOT_EQUAL	
typeb	TokenNameIdentifier	 typeb
||	TokenNameOR_OR	
(	TokenNameLPAREN	
dMethod	TokenNameIdentifier	 d Method
&	TokenNameAND	
bMethod	TokenNameIdentifier	 b Method
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Remember the derivation methods and blocks, return true. 	TokenNameCOMMENT_LINE	Remember the derivation methods and blocks, return true. 
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
dMethod	TokenNameIdentifier	 d Method
=	TokenNameEQUAL	
dMethod	TokenNameIdentifier	 d Method
;	TokenNameSEMICOLON	
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
bMethod	TokenNameIdentifier	 b Method
=	TokenNameEQUAL	
bMethod	TokenNameIdentifier	 b Method
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Record the information about how one element substitute another one 	TokenNameCOMMENT_LINE	Record the information about how one element substitute another one 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
OneSubGroup	TokenNameIdentifier	 One Sub Group
{	TokenNameLBRACE	
OneSubGroup	TokenNameIdentifier	 One Sub Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
OneSubGroup	TokenNameIdentifier	 One Sub Group
(	TokenNameLPAREN	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
sub	TokenNameIdentifier	 sub
,	TokenNameCOMMA	
short	TokenNameshort	
dMethod	TokenNameIdentifier	 d Method
,	TokenNameCOMMA	
short	TokenNameshort	
bMethod	TokenNameIdentifier	 b Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
sub	TokenNameIdentifier	 sub
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dMethod	TokenNameIdentifier	 d Method
=	TokenNameEQUAL	
dMethod	TokenNameIdentifier	 d Method
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bMethod	TokenNameIdentifier	 b Method
=	TokenNameEQUAL	
bMethod	TokenNameIdentifier	 b Method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// The element that substitutes another one 	TokenNameCOMMENT_LINE	The element that substitutes another one 
XSElementDecl	TokenNameIdentifier	 XS Element Decl
sub	TokenNameIdentifier	 sub
;	TokenNameSEMICOLON	
// The combination of all derivation methods from sub's type to 	TokenNameCOMMENT_LINE	The combination of all derivation methods from sub's type to 
// the head's type 	TokenNameCOMMENT_LINE	the head's type 
short	TokenNameshort	
dMethod	TokenNameIdentifier	 d Method
;	TokenNameSEMICOLON	
// The combination of {block} of the types in the derivation chain 	TokenNameCOMMENT_LINE	The combination of {block} of the types in the derivation chain 
// excluding sub's type 	TokenNameCOMMENT_LINE	excluding sub's type 
short	TokenNameshort	
bMethod	TokenNameIdentifier	 b Method
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class SubstitutionGroupHandler 	TokenNameCOMMENT_LINE	class SubstitutionGroupHandler 
