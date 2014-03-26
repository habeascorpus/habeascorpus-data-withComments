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
dv	TokenNameIdentifier	 dv
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
ShortListImpl	TokenNameIdentifier	 Short List Impl
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
XSValue	TokenNameIdentifier	 XS Value
;	TokenNameSEMICOLON	
/** * Class to get the information back after content is validated. This info * would be filled by validate(). * * @xerces.internal * * @author Neeraj Bajaj, Sun Microsystems, inc. * * @version $Id: ValidatedInfo.java 1026362 2010-10-22 15:15:18Z sandygao $ */	TokenNameCOMMENT_JAVADOC	 Class to get the information back after content is validated. This info would be filled by validate(). * @xerces.internal * @author Neeraj Bajaj, Sun Microsystems, inc. * @version $Id: ValidatedInfo.java 1026362 2010-10-22 15:15:18Z sandygao $ 
public	TokenNamepublic	
class	TokenNameclass	
ValidatedInfo	TokenNameIdentifier	 Validated Info
implements	TokenNameimplements	
XSValue	TokenNameIdentifier	 XS Value
{	TokenNameLBRACE	
/** * The normalized value of a string value */	TokenNameCOMMENT_JAVADOC	 The normalized value of a string value 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
normalizedValue	TokenNameIdentifier	 normalized Value
;	TokenNameSEMICOLON	
/** * The actual value from a string value (QName, Boolean, etc.) * An array of Objects if the type is a list. */	TokenNameCOMMENT_JAVADOC	 The actual value from a string value (QName, Boolean, etc.) An array of Objects if the type is a list. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
actualValue	TokenNameIdentifier	 actual Value
;	TokenNameSEMICOLON	
/** * The type of the actual value. It's one of the _DT constants * defined in XSConstants.java. The value is used to indicate * the most specific built-in type. * (i.e. short instead of decimal or integer). */	TokenNameCOMMENT_JAVADOC	 The type of the actual value. It's one of the _DT constants defined in XSConstants.java. The value is used to indicate the most specific built-in type. (i.e. short instead of decimal or integer). 
public	TokenNamepublic	
short	TokenNameshort	
actualValueType	TokenNameIdentifier	 actual Value Type
;	TokenNameSEMICOLON	
/** * The declared type of the value. */	TokenNameCOMMENT_JAVADOC	 The declared type of the value. 
public	TokenNamepublic	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
actualType	TokenNameIdentifier	 actual Type
;	TokenNameSEMICOLON	
/** * If the type is a union type, then the member type which * actually validated the string value. */	TokenNameCOMMENT_JAVADOC	 If the type is a union type, then the member type which actually validated the string value. 
public	TokenNamepublic	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
memberType	TokenNameIdentifier	 member Type
;	TokenNameSEMICOLON	
/** * If * 1. the type is a union type where one of the member types is a list, or * if the type is a list; and * 2. the item type of the list is a union type * then an array of member types used to validate the values. */	TokenNameCOMMENT_JAVADOC	 If 1. the type is a union type where one of the member types is a list, or if the type is a list; and 2. the item type of the list is a union type then an array of member types used to validate the values. 
public	TokenNamepublic	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
memberTypes	TokenNameIdentifier	 member Types
;	TokenNameSEMICOLON	
/** * In the case the value is a list or a list of unions, this value * indicates the type(s) of the items in the list. * For a normal list, the length of the array is 1; for list of unions, * the length of the array is the same as the length of the list. */	TokenNameCOMMENT_JAVADOC	 In the case the value is a list or a list of unions, this value indicates the type(s) of the items in the list. For a normal list, the length of the array is 1; for list of unions, the length of the array is the same as the length of the list. 
public	TokenNamepublic	
ShortList	TokenNameIdentifier	 Short List
itemValueTypes	TokenNameIdentifier	 item Value Types
;	TokenNameSEMICOLON	
/** * reset the state of this object */	TokenNameCOMMENT_JAVADOC	 reset the state of this object 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
normalizedValue	TokenNameIdentifier	 normalized Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
actualValue	TokenNameIdentifier	 actual Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
actualValueType	TokenNameIdentifier	 actual Value Type
=	TokenNameEQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
UNAVAILABLE_DT	TokenNameIdentifier	 UNAVAILABLE  DT
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
actualType	TokenNameIdentifier	 actual Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
memberType	TokenNameIdentifier	 member Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
memberTypes	TokenNameIdentifier	 member Types
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
itemValueTypes	TokenNameIdentifier	 item Value Types
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a string representation of the value. If there is an actual * value, use toString; otherwise, use the normalized value. */	TokenNameCOMMENT_JAVADOC	 Return a string representation of the value. If there is an actual value, use toString; otherwise, use the normalized value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
actualValue	TokenNameIdentifier	 actual Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
normalizedValue	TokenNameIdentifier	 normalized Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
actualValue	TokenNameIdentifier	 actual Value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if the two ValidatedInfo objects can be compared in the same * value space. */	TokenNameCOMMENT_JAVADOC	 Returns true if the two ValidatedInfo objects can be compared in the same value space. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isComparable	TokenNameIdentifier	 is Comparable
(	TokenNameLPAREN	
ValidatedInfo	TokenNameIdentifier	 Validated Info
info1	TokenNameIdentifier	 info1
,	TokenNameCOMMA	
ValidatedInfo	TokenNameIdentifier	 Validated Info
info2	TokenNameIdentifier	 info2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
short	TokenNameshort	
primitiveType1	TokenNameIdentifier	 primitive Type1
=	TokenNameEQUAL	
convertToPrimitiveKind	TokenNameIdentifier	 convert To Primitive Kind
(	TokenNameLPAREN	
info1	TokenNameIdentifier	 info1
.	TokenNameDOT	
actualValueType	TokenNameIdentifier	 actual Value Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
short	TokenNameshort	
primitiveType2	TokenNameIdentifier	 primitive Type2
=	TokenNameEQUAL	
convertToPrimitiveKind	TokenNameIdentifier	 convert To Primitive Kind
(	TokenNameLPAREN	
info2	TokenNameIdentifier	 info2
.	TokenNameDOT	
actualValueType	TokenNameIdentifier	 actual Value Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
primitiveType1	TokenNameIdentifier	 primitive Type1
!=	TokenNameNOT_EQUAL	
primitiveType2	TokenNameIdentifier	 primitive Type2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
primitiveType1	TokenNameIdentifier	 primitive Type1
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
ANYSIMPLETYPE_DT	TokenNameIdentifier	 ANYSIMPLETYPE  DT
&&	TokenNameAND_AND	
primitiveType2	TokenNameIdentifier	 primitive Type2
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
STRING_DT	TokenNameIdentifier	 STRING  DT
||	TokenNameOR_OR	
primitiveType1	TokenNameIdentifier	 primitive Type1
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
STRING_DT	TokenNameIdentifier	 STRING  DT
&&	TokenNameAND_AND	
primitiveType2	TokenNameIdentifier	 primitive Type2
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
ANYSIMPLETYPE_DT	TokenNameIdentifier	 ANYSIMPLETYPE  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
primitiveType1	TokenNameIdentifier	 primitive Type1
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
LIST_DT	TokenNameIdentifier	 LIST  DT
||	TokenNameOR_OR	
primitiveType1	TokenNameIdentifier	 primitive Type1
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
LISTOFUNION_DT	TokenNameIdentifier	 LISTOFUNION  DT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ShortList	TokenNameIdentifier	 Short List
typeList1	TokenNameIdentifier	 type List1
=	TokenNameEQUAL	
info1	TokenNameIdentifier	 info1
.	TokenNameDOT	
itemValueTypes	TokenNameIdentifier	 item Value Types
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ShortList	TokenNameIdentifier	 Short List
typeList2	TokenNameIdentifier	 type List2
=	TokenNameEQUAL	
info2	TokenNameIdentifier	 info2
.	TokenNameDOT	
itemValueTypes	TokenNameIdentifier	 item Value Types
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
typeList1Length	TokenNameIdentifier	 type List1 Length
=	TokenNameEQUAL	
typeList1	TokenNameIdentifier	 type List1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
typeList1	TokenNameIdentifier	 type List1
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
typeList2Length	TokenNameIdentifier	 type List2 Length
=	TokenNameEQUAL	
typeList2	TokenNameIdentifier	 type List2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
typeList2	TokenNameIdentifier	 type List2
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
typeList1Length	TokenNameIdentifier	 type List1 Length
!=	TokenNameNOT_EQUAL	
typeList2Length	TokenNameIdentifier	 type List2 Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
typeList1Length	TokenNameIdentifier	 type List1 Length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
short	TokenNameshort	
primitiveItem1	TokenNameIdentifier	 primitive Item1
=	TokenNameEQUAL	
convertToPrimitiveKind	TokenNameIdentifier	 convert To Primitive Kind
(	TokenNameLPAREN	
typeList1	TokenNameIdentifier	 type List1
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
short	TokenNameshort	
primitiveItem2	TokenNameIdentifier	 primitive Item2
=	TokenNameEQUAL	
convertToPrimitiveKind	TokenNameIdentifier	 convert To Primitive Kind
(	TokenNameLPAREN	
typeList2	TokenNameIdentifier	 type List2
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
primitiveItem1	TokenNameIdentifier	 primitive Item1
!=	TokenNameNOT_EQUAL	
primitiveItem2	TokenNameIdentifier	 primitive Item2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
primitiveItem1	TokenNameIdentifier	 primitive Item1
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
ANYSIMPLETYPE_DT	TokenNameIdentifier	 ANYSIMPLETYPE  DT
&&	TokenNameAND_AND	
primitiveItem2	TokenNameIdentifier	 primitive Item2
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
STRING_DT	TokenNameIdentifier	 STRING  DT
||	TokenNameOR_OR	
primitiveItem1	TokenNameIdentifier	 primitive Item1
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
STRING_DT	TokenNameIdentifier	 STRING  DT
&&	TokenNameAND_AND	
primitiveItem2	TokenNameIdentifier	 primitive Item2
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
ANYSIMPLETYPE_DT	TokenNameIdentifier	 ANYSIMPLETYPE  DT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the primitive type of the given type. * @param valueType A value type as defined in XSConstants. * @return The primitive type from which valueType was derived. */	TokenNameCOMMENT_JAVADOC	 Returns the primitive type of the given type. @param valueType A value type as defined in XSConstants. @return The primitive type from which valueType was derived. 
private	TokenNameprivate	
static	TokenNamestatic	
short	TokenNameshort	
convertToPrimitiveKind	TokenNameIdentifier	 convert To Primitive Kind
(	TokenNameLPAREN	
short	TokenNameshort	
valueType	TokenNameIdentifier	 value Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/** Primitive datatypes. */	TokenNameCOMMENT_JAVADOC	 Primitive datatypes. 
if	TokenNameif	
(	TokenNameLPAREN	
valueType	TokenNameIdentifier	 value Type
<=	TokenNameLESS_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
NOTATION_DT	TokenNameIdentifier	 NOTATION  DT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
valueType	TokenNameIdentifier	 value Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Types derived from string. */	TokenNameCOMMENT_JAVADOC	 Types derived from string. 
if	TokenNameif	
(	TokenNameLPAREN	
valueType	TokenNameIdentifier	 value Type
<=	TokenNameLESS_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
ENTITY_DT	TokenNameIdentifier	 ENTITY  DT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
STRING_DT	TokenNameIdentifier	 STRING  DT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Types derived from decimal. */	TokenNameCOMMENT_JAVADOC	 Types derived from decimal. 
if	TokenNameif	
(	TokenNameLPAREN	
valueType	TokenNameIdentifier	 value Type
<=	TokenNameLESS_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
POSITIVEINTEGER_DT	TokenNameIdentifier	 POSITIVEINTEGER  DT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DECIMAL_DT	TokenNameIdentifier	 DECIMAL  DT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Other types. */	TokenNameCOMMENT_JAVADOC	 Other types. 
return	TokenNamereturn	
valueType	TokenNameIdentifier	 value Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XSValue methods 	TokenNameCOMMENT_LINE	XSValue methods 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getActualValue	TokenNameIdentifier	 get Actual Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
actualValue	TokenNameIdentifier	 actual Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getActualValueType	TokenNameIdentifier	 get Actual Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
actualValueType	TokenNameIdentifier	 actual Value Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ShortList	TokenNameIdentifier	 Short List
getListValueTypes	TokenNameIdentifier	 get List Value Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
itemValueTypes	TokenNameIdentifier	 item Value Types
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
ShortListImpl	TokenNameIdentifier	 Short List Impl
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
:	TokenNameCOLON	
itemValueTypes	TokenNameIdentifier	 item Value Types
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getMemberTypeDefinitions	TokenNameIdentifier	 get Member Type Definitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
memberTypes	TokenNameIdentifier	 member Types
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
(	TokenNameLPAREN	
memberTypes	TokenNameIdentifier	 member Types
,	TokenNameCOMMA	
memberTypes	TokenNameIdentifier	 member Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNormalizedValue	TokenNameIdentifier	 get Normalized Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
normalizedValue	TokenNameIdentifier	 normalized Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
getTypeDefinition	TokenNameIdentifier	 get Type Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
actualType	TokenNameIdentifier	 actual Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
getMemberTypeDefinition	TokenNameIdentifier	 get Member Type Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
memberType	TokenNameIdentifier	 member Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
XSValue	TokenNameIdentifier	 XS Value
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
ValidatedInfo	TokenNameIdentifier	 Validated Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ValidatedInfo	TokenNameIdentifier	 Validated Info
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ValidatedInfo	TokenNameIdentifier	 Validated Info
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
normalizedValue	TokenNameIdentifier	 normalized Value
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
normalizedValue	TokenNameIdentifier	 normalized Value
;	TokenNameSEMICOLON	
actualValue	TokenNameIdentifier	 actual Value
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
actualValue	TokenNameIdentifier	 actual Value
;	TokenNameSEMICOLON	
actualValueType	TokenNameIdentifier	 actual Value Type
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
actualValueType	TokenNameIdentifier	 actual Value Type
;	TokenNameSEMICOLON	
actualType	TokenNameIdentifier	 actual Type
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
actualType	TokenNameIdentifier	 actual Type
;	TokenNameSEMICOLON	
memberType	TokenNameIdentifier	 member Type
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
memberType	TokenNameIdentifier	 member Type
;	TokenNameSEMICOLON	
memberTypes	TokenNameIdentifier	 member Types
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
memberTypes	TokenNameIdentifier	 member Types
;	TokenNameSEMICOLON	
itemValueTypes	TokenNameIdentifier	 item Value Types
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
itemValueTypes	TokenNameIdentifier	 item Value Types
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
normalizedValue	TokenNameIdentifier	 normalized Value
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getNormalizedValue	TokenNameIdentifier	 get Normalized Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
actualValue	TokenNameIdentifier	 actual Value
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getActualValue	TokenNameIdentifier	 get Actual Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
actualValueType	TokenNameIdentifier	 actual Value Type
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getActualValueType	TokenNameIdentifier	 get Actual Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
actualType	TokenNameIdentifier	 actual Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getTypeDefinition	TokenNameIdentifier	 get Type Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
memberType	TokenNameIdentifier	 member Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getMemberTypeDefinition	TokenNameIdentifier	 get Member Type Definition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
realType	TokenNameIdentifier	 real Type
=	TokenNameEQUAL	
memberType	TokenNameIdentifier	 member Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
actualType	TokenNameIdentifier	 actual Type
:	TokenNameCOLON	
memberType	TokenNameIdentifier	 member Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
realType	TokenNameIdentifier	 real Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
realType	TokenNameIdentifier	 real Type
.	TokenNameDOT	
getBuiltInKind	TokenNameIdentifier	 get Built In Kind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
LISTOFUNION_DT	TokenNameIdentifier	 LISTOFUNION  DT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSObjectList	TokenNameIdentifier	 XS Object List
members	TokenNameIdentifier	 members
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getMemberTypeDefinitions	TokenNameIdentifier	 get Member Type Definitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
memberTypes	TokenNameIdentifier	 member Types
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
[	TokenNameLBRACKET	
members	TokenNameIdentifier	 members
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
members	TokenNameIdentifier	 members
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
memberTypes	TokenNameIdentifier	 member Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
)	TokenNameRPAREN	
members	TokenNameIdentifier	 members
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
memberTypes	TokenNameIdentifier	 member Types
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
itemValueTypes	TokenNameIdentifier	 item Value Types
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getListValueTypes	TokenNameIdentifier	 get List Value Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
