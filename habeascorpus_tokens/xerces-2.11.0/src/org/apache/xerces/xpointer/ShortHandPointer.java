/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xpointer	TokenNameIdentifier	 xpointer
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
Constants	TokenNameIdentifier	 Constants
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
XSSimpleType	TokenNameIdentifier	 XS Simple Type
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
SymbolTable	TokenNameIdentifier	 Symbol Table
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
Augmentations	TokenNameIdentifier	 Augmentations
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
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLAttributes	TokenNameIdentifier	 XML Attributes
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
XNIException	TokenNameIdentifier	 XNI Exception
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
AttributePSVI	TokenNameIdentifier	 Attribute PSVI
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
/** * <p> * Implements the XPointerPart interface and handles processing of * ShortHand Pointers. It identifies at most one element in the * resource's information set; specifically, the first one (if any) * in document order that has a matching NCName as an identifier. * </p> * * @version $Id: ShortHandPointer.java 603808 2007-12-13 03:44:48Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p> Implements the XPointerPart interface and handles processing of ShortHand Pointers. It identifies at most one element in the resource's information set; specifically, the first one (if any) in document order that has a matching NCName as an identifier. </p> * @version $Id: ShortHandPointer.java 603808 2007-12-13 03:44:48Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
ShortHandPointer	TokenNameIdentifier	 Short Hand Pointer
implements	TokenNameimplements	
XPointerPart	TokenNameIdentifier	 X Pointer Part
{	TokenNameLBRACE	
// The name of the ShortHand pointer 	TokenNameCOMMENT_LINE	The name of the ShortHand pointer 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fShortHandPointer	TokenNameIdentifier	 f Short Hand Pointer
;	TokenNameSEMICOLON	
// The name of the ShortHand pointer 	TokenNameCOMMENT_LINE	The name of the ShortHand pointer 
private	TokenNameprivate	
boolean	TokenNameboolean	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// SymbolTable 	TokenNameCOMMENT_LINE	SymbolTable 
private	TokenNameprivate	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
ShortHandPointer	TokenNameIdentifier	 Short Hand Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ShortHandPointer	TokenNameIdentifier	 Short Hand Pointer
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The XPointerProcessor takes care of this. Simply set the ShortHand Pointer here. * * @see org.apache.xerces.xpointer.XPointerPart#parseXPointer(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 The XPointerProcessor takes care of this. Simply set the ShortHand Pointer here. * @see org.apache.xerces.xpointer.XPointerPart#parseXPointer(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
parseXPointer	TokenNameIdentifier	 parse X Pointer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
fShortHandPointer	TokenNameIdentifier	 f Short Hand Pointer
=	TokenNameEQUAL	
part	TokenNameIdentifier	 part
;	TokenNameSEMICOLON	
// reset fIsFragmentResolved 	TokenNameCOMMENT_LINE	reset fIsFragmentResolved 
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resolves the XPointer ShortHand pointer based on the rules defined in * Section 3.2 of the XPointer Framework Recommendation. * Note that in the current implementation only supports DTD determined ID's. * * @see org.apache.xerces.xpointer.XPointerPart#resolveXPointer(org.apache.xerces.xni.QName, org.apache.xerces.xni.XMLAttributes, org.apache.xerces.xni.Augmentations, int event) */	TokenNameCOMMENT_JAVADOC	 Resolves the XPointer ShortHand pointer based on the rules defined in Section 3.2 of the XPointer Framework Recommendation. Note that in the current implementation only supports DTD determined ID's. * @see org.apache.xerces.xpointer.XPointerPart#resolveXPointer(org.apache.xerces.xni.QName, org.apache.xerces.xni.XMLAttributes, org.apache.xerces.xni.Augmentations, int event) 
int	TokenNameint	
fMatchingChildCount	TokenNameIdentifier	 f Matching Child Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
resolveXPointer	TokenNameIdentifier	 resolve X Pointer
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
,	TokenNameCOMMA	
int	TokenNameint	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// reset fIsFragmentResolved 	TokenNameCOMMENT_LINE	reset fIsFragmentResolved 
if	TokenNameif	
(	TokenNameLPAREN	
fMatchingChildCount	TokenNameIdentifier	 f Matching Child Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// On startElement or emptyElement, if no matching elements or parent 	TokenNameCOMMENT_LINE	On startElement or emptyElement, if no matching elements or parent 
// elements were found, check for a matching idenfitier. 	TokenNameCOMMENT_LINE	elements were found, check for a matching idenfitier. 
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
==	TokenNameEQUAL_EQUAL	
XPointerPart	TokenNameIdentifier	 X Pointer Part
.	TokenNameDOT	
EVENT_ELEMENT_START	TokenNameIdentifier	 EVENT  ELEMENT  START
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fMatchingChildCount	TokenNameIdentifier	 f Matching Child Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
=	TokenNameEQUAL	
hasMatchingIdentifier	TokenNameIdentifier	 has Matching Identifier
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fMatchingChildCount	TokenNameIdentifier	 f Matching Child Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
==	TokenNameEQUAL_EQUAL	
XPointerPart	TokenNameIdentifier	 X Pointer Part
.	TokenNameDOT	
EVENT_ELEMENT_EMPTY	TokenNameIdentifier	 EVENT  ELEMENT  EMPTY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fMatchingChildCount	TokenNameIdentifier	 f Matching Child Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
=	TokenNameEQUAL	
hasMatchingIdentifier	TokenNameIdentifier	 has Matching Identifier
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// On endElement, decrease the matching child count if the child or 	TokenNameCOMMENT_LINE	On endElement, decrease the matching child count if the child or 
// its parent was resolved. 	TokenNameCOMMENT_LINE	its parent was resolved. 
if	TokenNameif	
(	TokenNameLPAREN	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fMatchingChildCount	TokenNameIdentifier	 f Matching Child Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @param element * @param attributes * @param augs * @param event * @return * @throws XNIException */	TokenNameCOMMENT_JAVADOC	 * @param element @param attributes @param augs @param event @return @throws XNIException 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasMatchingIdentifier	TokenNameIdentifier	 has Matching Identifier
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
,	TokenNameCOMMA	
int	TokenNameint	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
normalizedValue	TokenNameIdentifier	 normalized Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// The identifiers of an element are determined by the 	TokenNameCOMMENT_LINE	The identifiers of an element are determined by the 
// ShortHand Pointer as follows: 	TokenNameCOMMENT_LINE	ShortHand Pointer as follows: 
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 1. If an element information item has an attribute information item 	TokenNameCOMMENT_LINE	1. If an element information item has an attribute information item 
// among its [attributes] that is a schema-determined ID, then it is 	TokenNameCOMMENT_LINE	among its [attributes] that is a schema-determined ID, then it is 
// identified by the value of that attribute information item's 	TokenNameCOMMENT_LINE	identified by the value of that attribute information item's 
// [schema normalized value] property; 	TokenNameCOMMENT_LINE	[schema normalized value] property; 
normalizedValue	TokenNameIdentifier	 normalized Value
=	TokenNameEQUAL	
getSchemaDeterminedID	TokenNameIdentifier	 get Schema Determined ID
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
normalizedValue	TokenNameIdentifier	 normalized Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 2. If an element information item has an element information item among 	TokenNameCOMMENT_LINE	2. If an element information item has an element information item among 
// its [children] that is a schema-determined ID, then it is identified by 	TokenNameCOMMENT_LINE	its [children] that is a schema-determined ID, then it is identified by 
// the value of that element information item's [schema normalized value] property; 	TokenNameCOMMENT_LINE	the value of that element information item's [schema normalized value] property; 
// ??? 	TokenNameCOMMENT_LINE	??? 
normalizedValue	TokenNameIdentifier	 normalized Value
=	TokenNameEQUAL	
getChildrenSchemaDeterminedID	TokenNameIdentifier	 get Children Schema Determined ID
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
normalizedValue	TokenNameIdentifier	 normalized Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 3. If an element information item has an attribute information item among 	TokenNameCOMMENT_LINE	3. If an element information item has an attribute information item among 
// its [attributes] that is a DTD-determined ID, then it is identified by the 	TokenNameCOMMENT_LINE	its [attributes] that is a DTD-determined ID, then it is identified by the 
// value of that attribute information item's [normalized value] property. 	TokenNameCOMMENT_LINE	value of that attribute information item's [normalized value] property. 
// An attribute information item is a DTD-determined ID if and only if it has 	TokenNameCOMMENT_LINE	An attribute information item is a DTD-determined ID if and only if it has 
// a [type definition] property whose value is equal to ID. 	TokenNameCOMMENT_LINE	a [type definition] property whose value is equal to ID. 
normalizedValue	TokenNameIdentifier	 normalized Value
=	TokenNameEQUAL	
getDTDDeterminedID	TokenNameIdentifier	 get DTD Determined ID
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
normalizedValue	TokenNameIdentifier	 normalized Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 4. No externally determined ID's 	TokenNameCOMMENT_LINE	4. No externally determined ID's 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
normalizedValue	TokenNameIdentifier	 normalized Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
normalizedValue	TokenNameIdentifier	 normalized Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fShortHandPointer	TokenNameIdentifier	 f Short Hand Pointer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Rerturns the DTD determine-ID * * @param attributes * @param index * @return String * @throws XNIException */	TokenNameCOMMENT_JAVADOC	 Rerturns the DTD determine-ID * @param attributes @param index @return String @throws XNIException 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDTDDeterminedID	TokenNameIdentifier	 get DTD Determined ID
(	TokenNameLPAREN	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ID"	TokenNameStringLiteral	ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the schema-determined-ID. * * * @param attributes * @param index * @return A String containing the schema-determined ID. * @throws XNIException */	TokenNameCOMMENT_JAVADOC	 Returns the schema-determined-ID. * @param attributes @param index @return A String containing the schema-determined ID. @throws XNIException 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemaDeterminedID	TokenNameIdentifier	 get Schema Determined ID
(	TokenNameLPAREN	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getAugmentations	TokenNameIdentifier	 get Augmentations
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AttributePSVI	TokenNameIdentifier	 Attribute PSVI
attrPSVI	TokenNameIdentifier	 attr PSVI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AttributePSVI	TokenNameIdentifier	 Attribute PSVI
)	TokenNameRPAREN	
augs	TokenNameIdentifier	 augs
.	TokenNameDOT	
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRIBUTE_PSVI	TokenNameIdentifier	 ATTRIBUTE  PSVI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrPSVI	TokenNameIdentifier	 attr PSVI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// An element or attribute information item is a schema-determined 	TokenNameCOMMENT_LINE	An element or attribute information item is a schema-determined 
// ID if and only if one of the following is true:] 	TokenNameCOMMENT_LINE	ID if and only if one of the following is true:] 
// 1. It has a [member type definition] or [type definition] property 	TokenNameCOMMENT_LINE	1. It has a [member type definition] or [type definition] property 
// whose value in turn has [name] equal to ID and [target namespace] 	TokenNameCOMMENT_LINE	whose value in turn has [name] equal to ID and [target namespace] 
// equal to http://www.w3.org/2001/XMLSchema; 	TokenNameCOMMENT_LINE	equal to http://www.w3.org/2001/XMLSchema; 
// 2. It has a [base type definition] whose value has that [name] and [target namespace]; 	TokenNameCOMMENT_LINE	2. It has a [base type definition] whose value has that [name] and [target namespace]; 
// 3. It has a [base type definition] whose value has a [base type definition] 	TokenNameCOMMENT_LINE	3. It has a [base type definition] whose value has a [base type definition] 
// whose value has that [name] and [target namespace], and so on following 	TokenNameCOMMENT_LINE	whose value has that [name] and [target namespace], and so on following 
// the [base type definition] property recursively; 	TokenNameCOMMENT_LINE	the [base type definition] property recursively; 
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
typeDef	TokenNameIdentifier	 type Def
=	TokenNameEQUAL	
attrPSVI	TokenNameIdentifier	 attr PSVI
.	TokenNameDOT	
getMemberTypeDefinition	TokenNameIdentifier	 get Member Type Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
typeDef	TokenNameIdentifier	 type Def
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
typeDef	TokenNameIdentifier	 type Def
=	TokenNameEQUAL	
attrPSVI	TokenNameIdentifier	 attr PSVI
.	TokenNameDOT	
getTypeDefinition	TokenNameIdentifier	 get Type Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
typeDef	TokenNameIdentifier	 type Def
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
)	TokenNameRPAREN	
typeDef	TokenNameIdentifier	 type Def
)	TokenNameRPAREN	
.	TokenNameDOT	
isIDType	TokenNameIdentifier	 is ID Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attrPSVI	TokenNameIdentifier	 attr PSVI
.	TokenNameDOT	
getSchemaNormalizedValue	TokenNameIdentifier	 get Schema Normalized Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 4 & 5 NA 	TokenNameCOMMENT_LINE	4 & 5 NA 
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Not quite sure how this can be correctly implemented. * * @param attributes * @param index * @return String - We return null since we currenly do not supprt this. * @throws XNIException */	TokenNameCOMMENT_JAVADOC	 Not quite sure how this can be correctly implemented. * @param attributes @param index @return String - We return null since we currenly do not supprt this. @throws XNIException 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getChildrenSchemaDeterminedID	TokenNameIdentifier	 get Children Schema Determined ID
(	TokenNameLPAREN	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @see org.apache.xerces.xpointer.XPointerPart#isFragmentResolved() */	TokenNameCOMMENT_JAVADOC	 * @see org.apache.xerces.xpointer.XPointerPart#isFragmentResolved() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFragmentResolved	TokenNameIdentifier	 is Fragment Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @see org.apache.xerces.xpointer.XPointerPart#isChildFragmentResolved() */	TokenNameCOMMENT_JAVADOC	 * @see org.apache.xerces.xpointer.XPointerPart#isChildFragmentResolved() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isChildFragmentResolved	TokenNameIdentifier	 is Child Fragment Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fIsFragmentResolved	TokenNameIdentifier	 f Is Fragment Resolved
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fMatchingChildCount	TokenNameIdentifier	 f Matching Child Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the name of the ShortHand pointer * * @see org.apache.xerces.xpointer.XPointerPart#getSchemeName() */	TokenNameCOMMENT_JAVADOC	 Returns the name of the ShortHand pointer * @see org.apache.xerces.xpointer.XPointerPart#getSchemeName() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemeName	TokenNameIdentifier	 get Scheme Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fShortHandPointer	TokenNameIdentifier	 f Short Hand Pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xerces.xpointer.XPointerPart#getSchemeData() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xpointer.XPointerPart#getSchemeData() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemeData	TokenNameIdentifier	 get Scheme Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xerces.xpointer.XPointerPart#setSchemeName(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xpointer.XPointerPart#setSchemeName(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
setSchemeName	TokenNameIdentifier	 set Scheme Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
schemeName	TokenNameIdentifier	 scheme Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fShortHandPointer	TokenNameIdentifier	 f Short Hand Pointer
=	TokenNameEQUAL	
schemeName	TokenNameIdentifier	 scheme Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xerces.xpointer.XPointerPart#setSchemeData(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xpointer.XPointerPart#setSchemeData(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
setSchemeData	TokenNameIdentifier	 set Scheme Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
schemeData	TokenNameIdentifier	 scheme Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NA 	TokenNameCOMMENT_LINE	NA 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
