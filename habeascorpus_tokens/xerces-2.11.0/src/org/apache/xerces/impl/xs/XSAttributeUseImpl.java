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
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
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
XSAttributeUse	TokenNameIdentifier	 XS Attribute Use
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
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
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
XSValue	TokenNameIdentifier	 XS Value
;	TokenNameSEMICOLON	
/** * The XML representation for an attribute use * schema component is a local &lt;attribute&gt; element information item * * @xerces.internal * * @author Sandy Gao, IBM * @version $Id: XSAttributeUseImpl.java 1024038 2010-10-18 22:06:35Z sandygao $ */	TokenNameCOMMENT_JAVADOC	 The XML representation for an attribute use schema component is a local &lt;attribute&gt; element information item * @xerces.internal * @author Sandy Gao, IBM @version $Id: XSAttributeUseImpl.java 1024038 2010-10-18 22:06:35Z sandygao $ 
public	TokenNamepublic	
class	TokenNameclass	
XSAttributeUseImpl	TokenNameIdentifier	 XS Attribute Use Impl
implements	TokenNameimplements	
XSAttributeUse	TokenNameIdentifier	 XS Attribute Use
{	TokenNameLBRACE	
// the referred attribute decl 	TokenNameCOMMENT_LINE	the referred attribute decl 
public	TokenNamepublic	
XSAttributeDecl	TokenNameIdentifier	 XS Attribute Decl
fAttrDecl	TokenNameIdentifier	 f Attr Decl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// use information: SchemaSymbols.USE_OPTIONAL, REQUIRED, PROHIBITED 	TokenNameCOMMENT_LINE	use information: SchemaSymbols.USE_OPTIONAL, REQUIRED, PROHIBITED 
public	TokenNamepublic	
short	TokenNameshort	
fUse	TokenNameIdentifier	 f Use
=	TokenNameEQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
USE_OPTIONAL	TokenNameIdentifier	 USE  OPTIONAL
;	TokenNameSEMICOLON	
// value constraint type: default, fixed or !specified 	TokenNameCOMMENT_LINE	value constraint type: default, fixed or !specified 
public	TokenNamepublic	
short	TokenNameshort	
fConstraintType	TokenNameIdentifier	 f Constraint Type
=	TokenNameEQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
VC_NONE	TokenNameIdentifier	 VC  NONE
;	TokenNameSEMICOLON	
// value constraint value 	TokenNameCOMMENT_LINE	value constraint value 
public	TokenNamepublic	
ValidatedInfo	TokenNameIdentifier	 Validated Info
fDefault	TokenNameIdentifier	 f Default
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// optional annotation 	TokenNameCOMMENT_LINE	optional annotation 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDefault	TokenNameIdentifier	 f Default
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fUse	TokenNameIdentifier	 f Use
=	TokenNameEQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
USE_OPTIONAL	TokenNameIdentifier	 USE  OPTIONAL
;	TokenNameSEMICOLON	
fConstraintType	TokenNameIdentifier	 f Constraint Type
=	TokenNameEQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
VC_NONE	TokenNameIdentifier	 VC  NONE
;	TokenNameSEMICOLON	
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the type of the object, i.e ELEMENT_DECLARATION. */	TokenNameCOMMENT_JAVADOC	 Get the type of the object, i.e ELEMENT_DECLARATION. 
public	TokenNamepublic	
short	TokenNameshort	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
ATTRIBUTE_USE	TokenNameIdentifier	 ATTRIBUTE  USE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The <code>name</code> of this <code>XSObject</code> depending on the * <code>XSObject</code> type. */	TokenNameCOMMENT_JAVADOC	 The <code>name</code> of this <code>XSObject</code> depending on the <code>XSObject</code> type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The namespace URI of this node, or <code>null</code> if it is * unspecified. defines how a namespace URI is attached to schema * components. */	TokenNameCOMMENT_JAVADOC	 The namespace URI of this node, or <code>null</code> if it is unspecified. defines how a namespace URI is attached to schema components. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {required} determines whether this use of an attribute declaration * requires an appropriate attribute information item to be present, or * merely allows it. */	TokenNameCOMMENT_JAVADOC	 {required} determines whether this use of an attribute declaration requires an appropriate attribute information item to be present, or merely allows it. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getRequired	TokenNameIdentifier	 get Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fUse	TokenNameIdentifier	 f Use
==	TokenNameEQUAL_EQUAL	
SchemaSymbols	TokenNameIdentifier	 Schema Symbols
.	TokenNameDOT	
USE_REQUIRED	TokenNameIdentifier	 USE  REQUIRED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {attribute declaration} provides the attribute declaration itself, * which will in turn determine the simple type definition used. */	TokenNameCOMMENT_JAVADOC	 {attribute declaration} provides the attribute declaration itself, which will in turn determine the simple type definition used. 
public	TokenNamepublic	
XSAttributeDeclaration	TokenNameIdentifier	 XS Attribute Declaration
getAttrDeclaration	TokenNameIdentifier	 get Attr Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAttrDecl	TokenNameIdentifier	 f Attr Decl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Value Constraint: one of default, fixed. */	TokenNameCOMMENT_JAVADOC	 Value Constraint: one of default, fixed. 
public	TokenNamepublic	
short	TokenNameshort	
getConstraintType	TokenNameIdentifier	 get Constraint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fConstraintType	TokenNameIdentifier	 f Constraint Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Value Constraint: The actual value (with respect to the {type * definition}). */	TokenNameCOMMENT_JAVADOC	 Value Constraint: The actual value (with respect to the {type definition}). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getConstraintValue	TokenNameIdentifier	 get Constraint Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: SCAPI: what's the proper representation 	TokenNameCOMMENT_LINE	REVISIT: SCAPI: what's the proper representation 
return	TokenNamereturn	
getConstraintType	TokenNameIdentifier	 get Constraint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
VC_NONE	TokenNameIdentifier	 VC  NONE
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
fDefault	TokenNameIdentifier	 f Default
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xerces.xs.XSObject#getNamespaceItem() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xs.XSObject#getNamespaceItem() 
public	TokenNamepublic	
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
getNamespaceItem	TokenNameIdentifier	 get Namespace Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getActualVC	TokenNameIdentifier	 get Actual VC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getConstraintType	TokenNameIdentifier	 get Constraint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
VC_NONE	TokenNameIdentifier	 VC  NONE
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
fDefault	TokenNameIdentifier	 f Default
.	TokenNameDOT	
actualValue	TokenNameIdentifier	 actual Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getActualVCType	TokenNameIdentifier	 get Actual VC Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getConstraintType	TokenNameIdentifier	 get Constraint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
VC_NONE	TokenNameIdentifier	 VC  NONE
?	TokenNameQUESTION	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
UNAVAILABLE_DT	TokenNameIdentifier	 UNAVAILABLE  DT
:	TokenNameCOLON	
fDefault	TokenNameIdentifier	 f Default
.	TokenNameDOT	
actualValueType	TokenNameIdentifier	 actual Value Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ShortList	TokenNameIdentifier	 Short List
getItemValueTypes	TokenNameIdentifier	 get Item Value Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getConstraintType	TokenNameIdentifier	 get Constraint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
VC_NONE	TokenNameIdentifier	 VC  NONE
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
fDefault	TokenNameIdentifier	 f Default
.	TokenNameDOT	
itemValueTypes	TokenNameIdentifier	 item Value Types
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XSValue	TokenNameIdentifier	 XS Value
getValueConstraintValue	TokenNameIdentifier	 get Value Constraint Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fDefault	TokenNameIdentifier	 f Default
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Optional. Annotations. */	TokenNameCOMMENT_JAVADOC	 Optional. Annotations. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getAnnotations	TokenNameIdentifier	 get Annotations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fAnnotations	TokenNameIdentifier	 f Annotations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fAnnotations	TokenNameIdentifier	 f Annotations
:	TokenNameCOLON	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XSAttributeUseImpl 	TokenNameCOMMENT_LINE	class XSAttributeUseImpl 
