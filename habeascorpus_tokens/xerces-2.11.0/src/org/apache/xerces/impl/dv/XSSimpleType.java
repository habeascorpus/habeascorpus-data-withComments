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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
;	TokenNameSEMICOLON	
/** * This interface <code>XSSimpleType</code> represents the simple type * definition of schema component and defines methods to query the information * contained. * Any simple type (atomic, list or union) will implement this interface. * It inherits from <code>XSTypeDecl</code>. * * @xerces.internal * * @author Sandy Gao, IBM * * @version $Id: XSSimpleType.java 446751 2006-09-15 21:54:06Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This interface <code>XSSimpleType</code> represents the simple type definition of schema component and defines methods to query the information contained. Any simple type (atomic, list or union) will implement this interface. It inherits from <code>XSTypeDecl</code>. * @xerces.internal * @author Sandy Gao, IBM * @version $Id: XSSimpleType.java 446751 2006-09-15 21:54:06Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
extends	TokenNameextends	
XSSimpleTypeDefinition	TokenNameIdentifier	 XS Simple Type Definition
{	TokenNameLBRACE	
/** * constants defined for the values of 'whitespace' facet. * see <a href='http://www.w3.org/TR/xmlschema-2/#dt-whiteSpace'> XML Schema * Part 2: Datatypes </a> */	TokenNameCOMMENT_JAVADOC	 constants defined for the values of 'whitespace' facet. see <a href='http://www.w3.org/TR/xmlschema-2/#dt-whiteSpace'> XML Schema Part 2: Datatypes </a> 
/** preserve the white spaces */	TokenNameCOMMENT_JAVADOC	 preserve the white spaces 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
WS_PRESERVE	TokenNameIdentifier	 WS  PRESERVE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** replace the white spaces */	TokenNameCOMMENT_JAVADOC	 replace the white spaces 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
WS_REPLACE	TokenNameIdentifier	 WS  REPLACE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** collapse the white spaces */	TokenNameCOMMENT_JAVADOC	 collapse the white spaces 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
WS_COLLAPSE	TokenNameIdentifier	 WS  COLLAPSE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Constant defined for the primitive built-in simple tpyes. * see <a href='http://www.w3.org/TR/xmlschema-2/#built-in-primitive-datatypes'> * XML Schema Part 2: Datatypes </a> */	TokenNameCOMMENT_JAVADOC	 Constant defined for the primitive built-in simple tpyes. see <a href='http://www.w3.org/TR/xmlschema-2/#built-in-primitive-datatypes'> XML Schema Part 2: Datatypes </a> 
/** "string" type */	TokenNameCOMMENT_JAVADOC	 "string" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_STRING	TokenNameIdentifier	 PRIMITIVE  STRING
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "boolean" type */	TokenNameCOMMENT_JAVADOC	 "boolean" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_BOOLEAN	TokenNameIdentifier	 PRIMITIVE  BOOLEAN
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "decimal" type */	TokenNameCOMMENT_JAVADOC	 "decimal" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_DECIMAL	TokenNameIdentifier	 PRIMITIVE  DECIMAL
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "float" type */	TokenNameCOMMENT_JAVADOC	 "float" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_FLOAT	TokenNameIdentifier	 PRIMITIVE  FLOAT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "double" type */	TokenNameCOMMENT_JAVADOC	 "double" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_DOUBLE	TokenNameIdentifier	 PRIMITIVE  DOUBLE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "duration" type */	TokenNameCOMMENT_JAVADOC	 "duration" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_DURATION	TokenNameIdentifier	 PRIMITIVE  DURATION
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "dataTime" type */	TokenNameCOMMENT_JAVADOC	 "dataTime" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_DATETIME	TokenNameIdentifier	 PRIMITIVE  DATETIME
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "time" type */	TokenNameCOMMENT_JAVADOC	 "time" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_TIME	TokenNameIdentifier	 PRIMITIVE  TIME
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "date" type */	TokenNameCOMMENT_JAVADOC	 "date" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_DATE	TokenNameIdentifier	 PRIMITIVE  DATE
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "gYearMonth" type */	TokenNameCOMMENT_JAVADOC	 "gYearMonth" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_GYEARMONTH	TokenNameIdentifier	 PRIMITIVE  GYEARMONTH
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "gYear" type */	TokenNameCOMMENT_JAVADOC	 "gYear" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_GYEAR	TokenNameIdentifier	 PRIMITIVE  GYEAR
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "gMonthDay" type */	TokenNameCOMMENT_JAVADOC	 "gMonthDay" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_GMONTHDAY	TokenNameIdentifier	 PRIMITIVE  GMONTHDAY
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "gDay" type */	TokenNameCOMMENT_JAVADOC	 "gDay" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_GDAY	TokenNameIdentifier	 PRIMITIVE  GDAY
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "gMonth" type */	TokenNameCOMMENT_JAVADOC	 "gMonth" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_GMONTH	TokenNameIdentifier	 PRIMITIVE  GMONTH
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "hexBinary" type */	TokenNameCOMMENT_JAVADOC	 "hexBinary" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_HEXBINARY	TokenNameIdentifier	 PRIMITIVE  HEXBINARY
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "base64Binary" type */	TokenNameCOMMENT_JAVADOC	 "base64Binary" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_BASE64BINARY	TokenNameIdentifier	 PRIMITIVE  BAS E64 BINARY
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "anyURI" type */	TokenNameCOMMENT_JAVADOC	 "anyURI" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_ANYURI	TokenNameIdentifier	 PRIMITIVE  ANYURI
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "QName" type */	TokenNameCOMMENT_JAVADOC	 "QName" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_QNAME	TokenNameIdentifier	 PRIMITIVE  QNAME
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "precisionDecimal" type */	TokenNameCOMMENT_JAVADOC	 "precisionDecimal" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_PRECISIONDECIMAL	TokenNameIdentifier	 PRIMITIVE  PRECISIONDECIMAL
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** "NOTATION" type */	TokenNameCOMMENT_JAVADOC	 "NOTATION" type 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PRIMITIVE_NOTATION	TokenNameIdentifier	 PRIMITIVE  NOTATION
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * return an ID representing the built-in primitive base type. * REVISIT: This method is (currently) for internal use only. * the constants returned from this method are not finalized yet. * the names and values might change in the further. * * @return an ID representing the built-in primitive base type */	TokenNameCOMMENT_JAVADOC	 return an ID representing the built-in primitive base type. REVISIT: This method is (currently) for internal use only. the constants returned from this method are not finalized yet. the names and values might change in the further. * @return an ID representing the built-in primitive base type 
public	TokenNamepublic	
short	TokenNameshort	
getPrimitiveKind	TokenNameIdentifier	 get Primitive Kind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * validate a given string against this simple type. * * @param content the string value that needs to be validated * @param context the validation context * @param validatedInfo used to store validation result * * @return the actual value (QName, Boolean) of the string value */	TokenNameCOMMENT_JAVADOC	 validate a given string against this simple type. * @param content the string value that needs to be validated @param context the validation context @param validatedInfo used to store validation result * @return the actual value (QName, Boolean) of the string value 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
ValidationContext	TokenNameIdentifier	 Validation Context
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
ValidatedInfo	TokenNameIdentifier	 Validated Info
validatedInfo	TokenNameIdentifier	 validated Info
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
;	TokenNameSEMICOLON	
/** * validate a given string value, represented by content.toString(). * note that if content is a StringBuffer, for performance reasons, * it's possible that the content of the string buffer is modified. * * @param content the string value that needs to be validated * @param context the validation context * @param validatedInfo used to store validation result * * @return the actual value (QName, Boolean) of the string value */	TokenNameCOMMENT_JAVADOC	 validate a given string value, represented by content.toString(). note that if content is a StringBuffer, for performance reasons, it's possible that the content of the string buffer is modified. * @param content the string value that needs to be validated @param context the validation context @param validatedInfo used to store validation result * @return the actual value (QName, Boolean) of the string value 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
ValidationContext	TokenNameIdentifier	 Validation Context
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
ValidatedInfo	TokenNameIdentifier	 Validated Info
validatedInfo	TokenNameIdentifier	 validated Info
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
;	TokenNameSEMICOLON	
/** * Validate an actual value against this simple type. * * @param context the validation context * @param validatedInfo used to provide the actual value and member types * @exception InvalidDatatypeValueException exception for invalid values. */	TokenNameCOMMENT_JAVADOC	 Validate an actual value against this simple type. * @param context the validation context @param validatedInfo used to provide the actual value and member types @exception InvalidDatatypeValueException exception for invalid values. 
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ValidationContext	TokenNameIdentifier	 Validation Context
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
ValidatedInfo	TokenNameIdentifier	 Validated Info
validatedInfo	TokenNameIdentifier	 validated Info
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
;	TokenNameSEMICOLON	
/** * If this type is created from restriction, then some facets can be applied * to the simple type. <code>XSFacets</code> is used to pass the value of * different facets. * * @param facets the value of all the facets * @param presentFacet bit combination value of the costraining facet * constants which are present. * @param fixedFacet bit combination value of the costraining facet * constants which are fixed. * @param context the validation context * @exception InvalidDatatypeFacetException exception for invalid facet values. */	TokenNameCOMMENT_JAVADOC	 If this type is created from restriction, then some facets can be applied to the simple type. <code>XSFacets</code> is used to pass the value of different facets. * @param facets the value of all the facets @param presentFacet bit combination value of the costraining facet constants which are present. @param fixedFacet bit combination value of the costraining facet constants which are fixed. @param context the validation context @exception InvalidDatatypeFacetException exception for invalid facet values. 
public	TokenNamepublic	
void	TokenNamevoid	
applyFacets	TokenNameIdentifier	 apply Facets
(	TokenNameLPAREN	
XSFacets	TokenNameIdentifier	 XS Facets
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
short	TokenNameshort	
presentFacet	TokenNameIdentifier	 present Facet
,	TokenNameCOMMA	
short	TokenNameshort	
fixedFacet	TokenNameIdentifier	 fixed Facet
,	TokenNameCOMMA	
ValidationContext	TokenNameIdentifier	 Validation Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidDatatypeFacetException	TokenNameIdentifier	 Invalid Datatype Facet Exception
;	TokenNameSEMICOLON	
/** * Check whether two actual values are equal. * * @param value1 the first value * @param value2 the second value * @return true if the two value are equal */	TokenNameCOMMENT_JAVADOC	 Check whether two actual values are equal. * @param value1 the first value @param value2 the second value @return true if the two value are equal 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEqual	TokenNameIdentifier	 is Equal
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value1	TokenNameIdentifier	 value1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value2	TokenNameIdentifier	 value2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Check the order of the two actual values. (May not be supported by all * simple types. * REVISIT: Andy believes that a compare() method is necessary. * I don't see the necessity for schema (the only place where we * need to compare two values is to check min/maxIn/Exclusive * facets, but we only need a private method for this case.) * But Andy thinks XPATH potentially needs this compare() method. * * @param value1 the first value * @prarm value2 the second value * @return > 0 if value1 > value2 * = 0 if value1 == value2 * < = if value1 < value2 */	TokenNameCOMMENT_JAVADOC	 Check the order of the two actual values. (May not be supported by all simple types. REVISIT: Andy believes that a compare() method is necessary. I don't see the necessity for schema (the only place where we need to compare two values is to check min/maxIn/Exclusive facets, but we only need a private method for this case.) But Andy thinks XPATH potentially needs this compare() method. * @param value1 the first value @prarm value2 the second value @return > 0 if value1 > value2 = 0 if value1 == value2 < = if value1 < value2 
//public short compare(Object value1, Object value2); 	TokenNameCOMMENT_LINE	public short compare(Object value1, Object value2); 
/** * Check whether this type is or is derived from ID. * REVISIT: this method makes ID special, which is not a good design. * but since ID is not a primitive, there doesn't seem to be a * clean way of doing it except to define special method like this. * * @return whether this simple type is or is derived from ID. */	TokenNameCOMMENT_JAVADOC	 Check whether this type is or is derived from ID. REVISIT: this method makes ID special, which is not a good design. but since ID is not a primitive, there doesn't seem to be a clean way of doing it except to define special method like this. * @return whether this simple type is or is derived from ID. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isIDType	TokenNameIdentifier	 is ID Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the whitespace corresponding to this datatype. * * @return valid values are WS_PRESERVE, WS_REPLACE, WS_COLLAPSE. * @exception DatatypeException * union datatypes don't have whitespace facet associated with them */	TokenNameCOMMENT_JAVADOC	 Return the whitespace corresponding to this datatype. * @return valid values are WS_PRESERVE, WS_REPLACE, WS_COLLAPSE. @exception DatatypeException union datatypes don't have whitespace facet associated with them 
public	TokenNamepublic	
short	TokenNameshort	
getWhitespace	TokenNameIdentifier	 get Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DatatypeException	TokenNameIdentifier	 Datatype Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
