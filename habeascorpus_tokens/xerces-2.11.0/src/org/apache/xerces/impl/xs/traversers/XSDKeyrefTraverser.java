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
.	TokenNameDOT	
traversers	TokenNameIdentifier	 traversers
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
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
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
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
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
XSElementDecl	TokenNameIdentifier	 XS Element Decl
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
identity	TokenNameIdentifier	 identity
.	TokenNameDOT	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
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
identity	TokenNameIdentifier	 identity
.	TokenNameDOT	
KeyRef	TokenNameIdentifier	 Key Ref
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
identity	TokenNameIdentifier	 identity
.	TokenNameDOT	
UniqueOrKey	TokenNameIdentifier	 Unique Or Key
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * This class contains code that is used to traverse <keyref>s. * * @xerces.internal * * @author Neil Graham, IBM * @version $Id: XSDKeyrefTraverser.java 819653 2009-09-28 17:29:56Z knoaman $ */	TokenNameCOMMENT_JAVADOC	 This class contains code that is used to traverse <keyref>s. * @xerces.internal * @author Neil Graham, IBM @version $Id: XSDKeyrefTraverser.java 819653 2009-09-28 17:29:56Z knoaman $ 
class	TokenNameclass	
XSDKeyrefTraverser	TokenNameIdentifier	 XSD Keyref Traverser
extends	TokenNameextends	
XSDAbstractIDConstraintTraverser	TokenNameIdentifier	 XSD Abstract ID Constraint Traverser
{	TokenNameLBRACE	
public	TokenNamepublic	
XSDKeyrefTraverser	TokenNameIdentifier	 XSD Keyref Traverser
(	TokenNameLPAREN	
XSDHandler	TokenNameIdentifier	 XSD Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
gAttrCheck	TokenNameIdentifier	 g Attr Check
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
gAttrCheck	TokenNameIdentifier	 g Attr Check
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
traverse	TokenNameIdentifier	 traverse
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
krElem	TokenNameIdentifier	 kr Elem
,	TokenNameCOMMA	
XSElementDecl	TokenNameIdentifier	 XS Element Decl
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XSDocumentInfo	TokenNameIdentifier	 XS Document Info
schemaDoc	TokenNameIdentifier	 schema Doc
,	TokenNameCOMMA	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// General Attribute Checking 	TokenNameCOMMENT_LINE	General Attribute Checking 
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrValues	TokenNameIdentifier	 attr Values
=	TokenNameEQUAL	
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
checkAttributes	TokenNameIdentifier	 check Attributes
(	TokenNameLPAREN	
krElem	TokenNameIdentifier	 kr Elem
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create identity constraint 	TokenNameCOMMENT_LINE	create identity constraint 
String	TokenNameIdentifier	 String
krName	TokenNameIdentifier	 kr Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attrValues	TokenNameIdentifier	 attr Values
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_NAME	TokenNameIdentifier	 ATTIDX  NAME
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
krName	TokenNameIdentifier	 kr Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"s4s-att-must-appear"	TokenNameStringLiteral	s4s-att-must-appear
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_KEYREF	TokenNameIdentifier	 ELT  KEYREF
,	TokenNameCOMMA	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ATT_NAME	TokenNameIdentifier	 ATT  NAME
}	TokenNameRBRACE	
,	TokenNameCOMMA	
krElem	TokenNameIdentifier	 kr Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//return this array back to pool 	TokenNameCOMMENT_LINE	return this array back to pool 
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
returnAttrArray	TokenNameIdentifier	 return Attr Array
(	TokenNameLPAREN	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
QName	TokenNameIdentifier	 Q Name
kName	TokenNameIdentifier	 k Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
attrValues	TokenNameIdentifier	 attr Values
[	TokenNameLBRACKET	
XSAttributeChecker	TokenNameIdentifier	 XS Attribute Checker
.	TokenNameDOT	
ATTIDX_REFER	TokenNameIdentifier	 ATTIDX  REFER
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
kName	TokenNameIdentifier	 k Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"s4s-att-must-appear"	TokenNameStringLiteral	s4s-att-must-appear
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_KEYREF	TokenNameIdentifier	 ELT  KEYREF
,	TokenNameCOMMA	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ATT_REFER	TokenNameIdentifier	 ATT  REFER
}	TokenNameRBRACE	
,	TokenNameCOMMA	
krElem	TokenNameIdentifier	 kr Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//return this array back to pool 	TokenNameCOMMENT_LINE	return this array back to pool 
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
returnAttrArray	TokenNameIdentifier	 return Attr Array
(	TokenNameLPAREN	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
UniqueOrKey	TokenNameIdentifier	 Unique Or Key
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
)	TokenNameRPAREN	
fSchemaHandler	TokenNameIdentifier	 f Schema Handler
.	TokenNameDOT	
getGlobalDecl	TokenNameIdentifier	 get Global Decl
(	TokenNameLPAREN	
schemaDoc	TokenNameIdentifier	 schema Doc
,	TokenNameCOMMA	
XSDHandler	TokenNameIdentifier	 XSD Handler
.	TokenNameDOT	
IDENTITYCONSTRAINT_TYPE	TokenNameIdentifier	 IDENTITYCONSTRAINT  TYPE
,	TokenNameCOMMA	
kName	TokenNameIdentifier	 k Name
,	TokenNameCOMMA	
krElem	TokenNameIdentifier	 kr Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if ret == null, we've already reported an error in getGlobalDecl 	TokenNameCOMMENT_LINE	if ret == null, we've already reported an error in getGlobalDecl 
// we report an error only when ret != null, and the return type keyref 	TokenNameCOMMENT_LINE	we report an error only when ret != null, and the return type keyref 
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
getCategory	TokenNameIdentifier	 get Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
.	TokenNameDOT	
IC_KEY	TokenNameIdentifier	 IC  KEY
||	TokenNameOR_OR	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
getCategory	TokenNameIdentifier	 get Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
.	TokenNameDOT	
IC_UNIQUE	TokenNameIdentifier	 IC  UNIQUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UniqueOrKey	TokenNameIdentifier	 Unique Or Key
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"src-resolve"	TokenNameStringLiteral	src-resolve
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
kName	TokenNameIdentifier	 k Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
"identity constraint key/unique"	TokenNameStringLiteral	identity constraint key/unique
}	TokenNameRBRACE	
,	TokenNameCOMMA	
krElem	TokenNameIdentifier	 kr Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
returnAttrArray	TokenNameIdentifier	 return Attr Array
(	TokenNameLPAREN	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
KeyRef	TokenNameIdentifier	 Key Ref
keyRef	TokenNameIdentifier	 key Ref
=	TokenNameEQUAL	
new	TokenNamenew	
KeyRef	TokenNameIdentifier	 Key Ref
(	TokenNameLPAREN	
schemaDoc	TokenNameIdentifier	 schema Doc
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
,	TokenNameCOMMA	
krName	TokenNameIdentifier	 kr Name
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If errors occurred in traversing the identity constraint, then don't 	TokenNameCOMMENT_LINE	If errors occurred in traversing the identity constraint, then don't 
// add it to the schema, to avoid errors when processing the instance. 	TokenNameCOMMENT_LINE	add it to the schema, to avoid errors when processing the instance. 
if	TokenNameif	
(	TokenNameLPAREN	
traverseIdentityConstraint	TokenNameIdentifier	 traverse Identity Constraint
(	TokenNameLPAREN	
keyRef	TokenNameIdentifier	 key Ref
,	TokenNameCOMMA	
krElem	TokenNameIdentifier	 kr Elem
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
,	TokenNameCOMMA	
attrValues	TokenNameIdentifier	 attr Values
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Schema Component Constraint: Identity-constraint Definition Properties Correct 	TokenNameCOMMENT_LINE	Schema Component Constraint: Identity-constraint Definition Properties Correct 
//2 If the {identity-constraint category} is keyref, the cardinality of the {fields} must equal that of the {fields} of the {referenced key}. 	TokenNameCOMMENT_LINE	2 If the {identity-constraint category} is keyref, the cardinality of the {fields} must equal that of the {fields} of the {referenced key}. 
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
getFieldCount	TokenNameIdentifier	 get Field Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
keyRef	TokenNameIdentifier	 key Ref
.	TokenNameDOT	
getFieldCount	TokenNameIdentifier	 get Field Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportSchemaError	TokenNameIdentifier	 report Schema Error
(	TokenNameLPAREN	
"c-props-correct.2"	TokenNameStringLiteral	c-props-correct.2
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
krName	TokenNameIdentifier	 kr Name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
getIdentityConstraintName	TokenNameIdentifier	 get Identity Constraint Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
krElem	TokenNameIdentifier	 kr Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// add key reference to element decl 	TokenNameCOMMENT_LINE	add key reference to element decl 
// and stuff this in the grammar 	TokenNameCOMMENT_LINE	and stuff this in the grammar 
if	TokenNameif	
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getIDConstraintDecl	TokenNameIdentifier	 get ID Constraint Decl
(	TokenNameLPAREN	
keyRef	TokenNameIdentifier	 key Ref
.	TokenNameDOT	
getIdentityConstraintName	TokenNameIdentifier	 get Identity Constraint Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
addIDConstraintDecl	TokenNameIdentifier	 add ID Constraint Decl
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
keyRef	TokenNameIdentifier	 key Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// also add it to extended map 	TokenNameCOMMENT_LINE	also add it to extended map 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
fSchemaHandler	TokenNameIdentifier	 f Schema Handler
.	TokenNameDOT	
schemaDocument2SystemId	TokenNameIdentifier	 schema Document2 System Id
(	TokenNameLPAREN	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
idc	TokenNameIdentifier	 idc
=	TokenNameEQUAL	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getIDConstraintDecl	TokenNameIdentifier	 get ID Constraint Decl
(	TokenNameLPAREN	
keyRef	TokenNameIdentifier	 key Ref
.	TokenNameDOT	
getIdentityConstraintName	TokenNameIdentifier	 get Identity Constraint Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idc	TokenNameIdentifier	 idc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
addIDConstraintDecl	TokenNameIdentifier	 add ID Constraint Decl
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
keyRef	TokenNameIdentifier	 key Ref
,	TokenNameCOMMA	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// handle duplicates 	TokenNameCOMMENT_LINE	handle duplicates 
if	TokenNameif	
(	TokenNameLPAREN	
fSchemaHandler	TokenNameIdentifier	 f Schema Handler
.	TokenNameDOT	
fTolerateDuplicates	TokenNameIdentifier	 f Tolerate Duplicates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idc	TokenNameIdentifier	 idc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idc	TokenNameIdentifier	 idc
instanceof	TokenNameinstanceof	
KeyRef	TokenNameIdentifier	 Key Ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keyRef	TokenNameIdentifier	 key Ref
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeyRef	TokenNameIdentifier	 Key Ref
)	TokenNameRPAREN	
idc	TokenNameIdentifier	 idc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fSchemaHandler	TokenNameIdentifier	 f Schema Handler
.	TokenNameDOT	
addIDConstraintDecl	TokenNameIdentifier	 add ID Constraint Decl
(	TokenNameLPAREN	
keyRef	TokenNameIdentifier	 key Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// and put back attributes 	TokenNameCOMMENT_LINE	and put back attributes 
fAttrChecker	TokenNameIdentifier	 f Attr Checker
.	TokenNameDOT	
returnAttrArray	TokenNameIdentifier	 return Attr Array
(	TokenNameLPAREN	
attrValues	TokenNameIdentifier	 attr Values
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// traverse(Element,int,XSDocumentInfo, SchemaGrammar) 	TokenNameCOMMENT_LINE	traverse(Element,int,XSDocumentInfo, SchemaGrammar) 
}	TokenNameRBRACE	
// XSDKeyrefTraverser 	TokenNameCOMMENT_LINE	XSDKeyrefTraverser 
