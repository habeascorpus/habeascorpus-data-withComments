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
UniqueOrKey	TokenNameIdentifier	 Unique Or Key
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DOMUtil	TokenNameIdentifier	 DOM Util
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
/** * This class contains code that is used to traverse both <key>s and * <unique>s. * * @xerces.internal * * @author Neil Graham, IBM * @version $Id: XSDUniqueOrKeyTraverser.java 819653 2009-09-28 17:29:56Z knoaman $ */	TokenNameCOMMENT_JAVADOC	 This class contains code that is used to traverse both <key>s and <unique>s. * @xerces.internal * @author Neil Graham, IBM @version $Id: XSDUniqueOrKeyTraverser.java 819653 2009-09-28 17:29:56Z knoaman $ 
class	TokenNameclass	
XSDUniqueOrKeyTraverser	TokenNameIdentifier	 XSD Unique Or Key Traverser
extends	TokenNameextends	
XSDAbstractIDConstraintTraverser	TokenNameIdentifier	 XSD Abstract ID Constraint Traverser
{	TokenNameLBRACE	
public	TokenNamepublic	
XSDUniqueOrKeyTraverser	TokenNameIdentifier	 XSD Unique Or Key Traverser
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
uElem	TokenNameIdentifier	 u Elem
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
uElem	TokenNameIdentifier	 u Elem
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create identity constraint 	TokenNameCOMMENT_LINE	create identity constraint 
String	TokenNameIdentifier	 String
uName	TokenNameIdentifier	 u Name
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
uName	TokenNameIdentifier	 u Name
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
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
uElem	TokenNameIdentifier	 u Elem
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ATT_NAME	TokenNameIdentifier	 ATT  NAME
}	TokenNameRBRACE	
,	TokenNameCOMMA	
uElem	TokenNameIdentifier	 u Elem
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
uniqueOrKey	TokenNameIdentifier	 unique Or Key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DOMUtil	TokenNameIdentifier	 DOM Util
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
uElem	TokenNameIdentifier	 u Elem
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
ELT_UNIQUE	TokenNameIdentifier	 ELT  UNIQUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uniqueOrKey	TokenNameIdentifier	 unique Or Key
=	TokenNameEQUAL	
new	TokenNamenew	
UniqueOrKey	TokenNameIdentifier	 Unique Or Key
(	TokenNameLPAREN	
schemaDoc	TokenNameIdentifier	 schema Doc
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
,	TokenNameCOMMA	
uName	TokenNameIdentifier	 u Name
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
,	TokenNameCOMMA	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
.	TokenNameDOT	
IC_UNIQUE	TokenNameIdentifier	 IC  UNIQUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
uniqueOrKey	TokenNameIdentifier	 unique Or Key
=	TokenNameEQUAL	
new	TokenNamenew	
UniqueOrKey	TokenNameIdentifier	 Unique Or Key
(	TokenNameLPAREN	
schemaDoc	TokenNameIdentifier	 schema Doc
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
,	TokenNameCOMMA	
uName	TokenNameIdentifier	 u Name
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
fName	TokenNameIdentifier	 f Name
,	TokenNameCOMMA	
IdentityConstraint	TokenNameIdentifier	 Identity Constraint
.	TokenNameDOT	
IC_KEY	TokenNameIdentifier	 IC  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// it's XSDElementTraverser's job to ensure that there's no 	TokenNameCOMMENT_LINE	it's XSDElementTraverser's job to ensure that there's no 
// duplication (or if there is that restriction is involved 	TokenNameCOMMENT_LINE	duplication (or if there is that restriction is involved 
// and there's identity). 	TokenNameCOMMENT_LINE	and there's identity). 
// If errors occurred in traversing the identity constraint, then don't 	TokenNameCOMMENT_LINE	If errors occurred in traversing the identity constraint, then don't 
// add it to the schema, to avoid errors when processing the instance. 	TokenNameCOMMENT_LINE	add it to the schema, to avoid errors when processing the instance. 
if	TokenNameif	
(	TokenNameLPAREN	
traverseIdentityConstraint	TokenNameIdentifier	 traverse Identity Constraint
(	TokenNameLPAREN	
uniqueOrKey	TokenNameIdentifier	 unique Or Key
,	TokenNameCOMMA	
uElem	TokenNameIdentifier	 u Elem
,	TokenNameCOMMA	
schemaDoc	TokenNameIdentifier	 schema Doc
,	TokenNameCOMMA	
attrValues	TokenNameIdentifier	 attr Values
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// and stuff this in the grammar 	TokenNameCOMMENT_LINE	and stuff this in the grammar 
if	TokenNameif	
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getIDConstraintDecl	TokenNameIdentifier	 get ID Constraint Decl
(	TokenNameLPAREN	
uniqueOrKey	TokenNameIdentifier	 unique Or Key
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
uniqueOrKey	TokenNameIdentifier	 unique Or Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
uniqueOrKey	TokenNameIdentifier	 unique Or Key
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
uniqueOrKey	TokenNameIdentifier	 unique Or Key
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
UniqueOrKey	TokenNameIdentifier	 Unique Or Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uniqueOrKey	TokenNameIdentifier	 unique Or Key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UniqueOrKey	TokenNameIdentifier	 Unique Or Key
)	TokenNameRPAREN	
uniqueOrKey	TokenNameIdentifier	 unique Or Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fSchemaHandler	TokenNameIdentifier	 f Schema Handler
.	TokenNameDOT	
addIDConstraintDecl	TokenNameIdentifier	 add ID Constraint Decl
(	TokenNameLPAREN	
uniqueOrKey	TokenNameIdentifier	 unique Or Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// and fix up attributeChecker 	TokenNameCOMMENT_LINE	and fix up attributeChecker 
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
// traverse(Element,XSDElementDecl,XSDocumentInfo, SchemaGrammar) 	TokenNameCOMMENT_LINE	traverse(Element,XSDElementDecl,XSDocumentInfo, SchemaGrammar) 
}	TokenNameRBRACE	
// XSDUniqueOrKeyTraverser 	TokenNameCOMMENT_LINE	XSDUniqueOrKeyTraverser 
