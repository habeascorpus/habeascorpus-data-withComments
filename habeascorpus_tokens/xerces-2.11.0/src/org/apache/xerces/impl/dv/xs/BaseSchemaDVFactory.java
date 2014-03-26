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
SchemaDVFactory	TokenNameIdentifier	 Schema DV Factory
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
XSFacets	TokenNameIdentifier	 XS Facets
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
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSDeclarationPool	TokenNameIdentifier	 XS Declaration Pool
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
SymbolHash	TokenNameIdentifier	 Symbol Hash
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
/** * the base factory to create/return built-in schema DVs and create user-defined DVs * * @xerces.internal * * @author Neeraj Bajaj, Sun Microsystems, inc. * @author Sandy Gao, IBM * @author Khaled Noaman, IBM * * @version $Id: BaseSchemaDVFactory.java 805582 2009-08-18 21:13:20Z sandygao $ */	TokenNameCOMMENT_JAVADOC	 the base factory to create/return built-in schema DVs and create user-defined DVs * @xerces.internal * @author Neeraj Bajaj, Sun Microsystems, inc. @author Sandy Gao, IBM @author Khaled Noaman, IBM * @version $Id: BaseSchemaDVFactory.java 805582 2009-08-18 21:13:20Z sandygao $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BaseSchemaDVFactory	TokenNameIdentifier	 Base Schema DV Factory
extends	TokenNameextends	
SchemaDVFactory	TokenNameIdentifier	 Schema DV Factory
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
=	TokenNameEQUAL	
"http://www.w3.org/2001/XMLSchema"	TokenNameStringLiteral	http://www.w3.org/2001/XMLSchema
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
XSDeclarationPool	TokenNameIdentifier	 XS Declaration Pool
fDeclPool	TokenNameIdentifier	 f Decl Pool
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// create common built-in types 	TokenNameCOMMENT_LINE	create common built-in types 
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
createBuiltInTypes	TokenNameIdentifier	 create Built In Types
(	TokenNameLPAREN	
SymbolHash	TokenNameIdentifier	 Symbol Hash
builtInTypes	TokenNameIdentifier	 built In Types
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
baseAtomicType	TokenNameIdentifier	 base Atomic Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// all schema simple type names 	TokenNameCOMMENT_LINE	all schema simple type names 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANYSIMPLETYPE	TokenNameIdentifier	 ANYSIMPLETYPE
=	TokenNameEQUAL	
"anySimpleType"	TokenNameStringLiteral	anySimpleType
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANYURI	TokenNameIdentifier	 ANYURI
=	TokenNameEQUAL	
"anyURI"	TokenNameStringLiteral	anyURI
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BASE64BINARY	TokenNameIdentifier	 BAS E64 BINARY
=	TokenNameEQUAL	
"base64Binary"	TokenNameStringLiteral	base64Binary
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BOOLEAN	TokenNameIdentifier	 BOOLEAN
=	TokenNameEQUAL	
"boolean"	TokenNameStringLiteral	boolean
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BYTE	TokenNameIdentifier	 BYTE
=	TokenNameEQUAL	
"byte"	TokenNameStringLiteral	byte
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATE	TokenNameIdentifier	 DATE
=	TokenNameEQUAL	
"date"	TokenNameStringLiteral	date
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATETIME	TokenNameIdentifier	 DATETIME
=	TokenNameEQUAL	
"dateTime"	TokenNameStringLiteral	dateTime
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DAY	TokenNameIdentifier	 DAY
=	TokenNameEQUAL	
"gDay"	TokenNameStringLiteral	gDay
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DECIMAL	TokenNameIdentifier	 DECIMAL
=	TokenNameEQUAL	
"decimal"	TokenNameStringLiteral	decimal
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOUBLE	TokenNameIdentifier	 DOUBLE
=	TokenNameEQUAL	
"double"	TokenNameStringLiteral	double
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DURATION	TokenNameIdentifier	 DURATION
=	TokenNameEQUAL	
"duration"	TokenNameStringLiteral	duration
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTITY	TokenNameIdentifier	 ENTITY
=	TokenNameEQUAL	
"ENTITY"	TokenNameStringLiteral	ENTITY
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTITIES	TokenNameIdentifier	 ENTITIES
=	TokenNameEQUAL	
"ENTITIES"	TokenNameStringLiteral	ENTITIES
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLOAT	TokenNameIdentifier	 FLOAT
=	TokenNameEQUAL	
"float"	TokenNameStringLiteral	float
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HEXBINARY	TokenNameIdentifier	 HEXBINARY
=	TokenNameEQUAL	
"hexBinary"	TokenNameStringLiteral	hexBinary
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ID	TokenNameIdentifier	 ID
=	TokenNameEQUAL	
"ID"	TokenNameStringLiteral	ID
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
IDREF	TokenNameIdentifier	 IDREF
=	TokenNameEQUAL	
"IDREF"	TokenNameStringLiteral	IDREF
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
IDREFS	TokenNameIdentifier	 IDREFS
=	TokenNameEQUAL	
"IDREFS"	TokenNameStringLiteral	IDREFS
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INT	TokenNameIdentifier	 INT
=	TokenNameEQUAL	
"int"	TokenNameStringLiteral	int
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INTEGER	TokenNameIdentifier	 INTEGER
=	TokenNameEQUAL	
"integer"	TokenNameStringLiteral	integer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LONG	TokenNameIdentifier	 LONG
=	TokenNameEQUAL	
"long"	TokenNameStringLiteral	long
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAME	TokenNameIdentifier	 NAME
=	TokenNameEQUAL	
"Name"	TokenNameStringLiteral	Name
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NEGATIVEINTEGER	TokenNameIdentifier	 NEGATIVEINTEGER
=	TokenNameEQUAL	
"negativeInteger"	TokenNameStringLiteral	negativeInteger
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MONTH	TokenNameIdentifier	 MONTH
=	TokenNameEQUAL	
"gMonth"	TokenNameStringLiteral	gMonth
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MONTHDAY	TokenNameIdentifier	 MONTHDAY
=	TokenNameEQUAL	
"gMonthDay"	TokenNameStringLiteral	gMonthDay
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NCNAME	TokenNameIdentifier	 NCNAME
=	TokenNameEQUAL	
"NCName"	TokenNameStringLiteral	NCName
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NMTOKEN	TokenNameIdentifier	 NMTOKEN
=	TokenNameEQUAL	
"NMTOKEN"	TokenNameStringLiteral	NMTOKEN
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NMTOKENS	TokenNameIdentifier	 NMTOKENS
=	TokenNameEQUAL	
"NMTOKENS"	TokenNameStringLiteral	NMTOKENS
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LANGUAGE	TokenNameIdentifier	 LANGUAGE
=	TokenNameEQUAL	
"language"	TokenNameStringLiteral	language
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NONNEGATIVEINTEGER	TokenNameIdentifier	 NONNEGATIVEINTEGER
=	TokenNameEQUAL	
"nonNegativeInteger"	TokenNameStringLiteral	nonNegativeInteger
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NONPOSITIVEINTEGER	TokenNameIdentifier	 NONPOSITIVEINTEGER
=	TokenNameEQUAL	
"nonPositiveInteger"	TokenNameStringLiteral	nonPositiveInteger
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NORMALIZEDSTRING	TokenNameIdentifier	 NORMALIZEDSTRING
=	TokenNameEQUAL	
"normalizedString"	TokenNameStringLiteral	normalizedString
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NOTATION	TokenNameIdentifier	 NOTATION
=	TokenNameEQUAL	
"NOTATION"	TokenNameStringLiteral	NOTATION
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
POSITIVEINTEGER	TokenNameIdentifier	 POSITIVEINTEGER
=	TokenNameEQUAL	
"positiveInteger"	TokenNameStringLiteral	positiveInteger
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
QNAME	TokenNameIdentifier	 QNAME
=	TokenNameEQUAL	
"QName"	TokenNameStringLiteral	QName
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SHORT	TokenNameIdentifier	 SHORT
=	TokenNameEQUAL	
"short"	TokenNameStringLiteral	short
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING	TokenNameIdentifier	 STRING
=	TokenNameEQUAL	
"string"	TokenNameStringLiteral	string
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TIME	TokenNameIdentifier	 TIME
=	TokenNameEQUAL	
"time"	TokenNameStringLiteral	time
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TOKEN	TokenNameIdentifier	 TOKEN
=	TokenNameEQUAL	
"token"	TokenNameStringLiteral	token
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNSIGNEDBYTE	TokenNameIdentifier	 UNSIGNEDBYTE
=	TokenNameEQUAL	
"unsignedByte"	TokenNameStringLiteral	unsignedByte
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNSIGNEDINT	TokenNameIdentifier	 UNSIGNEDINT
=	TokenNameEQUAL	
"unsignedInt"	TokenNameStringLiteral	unsignedInt
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNSIGNEDLONG	TokenNameIdentifier	 UNSIGNEDLONG
=	TokenNameEQUAL	
"unsignedLong"	TokenNameStringLiteral	unsignedLong
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNSIGNEDSHORT	TokenNameIdentifier	 UNSIGNEDSHORT
=	TokenNameEQUAL	
"unsignedShort"	TokenNameStringLiteral	unsignedShort
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
YEAR	TokenNameIdentifier	 YEAR
=	TokenNameEQUAL	
"gYear"	TokenNameStringLiteral	gYear
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
YEARMONTH	TokenNameIdentifier	 YEARMONTH
=	TokenNameEQUAL	
"gYearMonth"	TokenNameStringLiteral	gYearMonth
;	TokenNameSEMICOLON	
final	TokenNamefinal	
XSFacets	TokenNameIdentifier	 XS Facets
facets	TokenNameIdentifier	 facets
=	TokenNameEQUAL	
new	TokenNamenew	
XSFacets	TokenNameIdentifier	 XS Facets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ANYSIMPLETYPE	TokenNameIdentifier	 ANYSIMPLETYPE
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
fAnySimpleType	TokenNameIdentifier	 f Any Simple Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
stringDV	TokenNameIdentifier	 string DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
STRING	TokenNameIdentifier	 STRING
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_STRING	TokenNameIdentifier	 DV  STRING
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_FALSE	TokenNameIdentifier	 ORDERED  FALSE
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
STRING_DT	TokenNameIdentifier	 STRING  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
STRING	TokenNameIdentifier	 STRING
,	TokenNameCOMMA	
stringDV	TokenNameIdentifier	 string DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
BOOLEAN	TokenNameIdentifier	 BOOLEAN
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
BOOLEAN	TokenNameIdentifier	 BOOLEAN
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_BOOLEAN	TokenNameIdentifier	 DV  BOOLEAN
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_FALSE	TokenNameIdentifier	 ORDERED  FALSE
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
BOOLEAN_DT	TokenNameIdentifier	 BOOLEAN  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
decimalDV	TokenNameIdentifier	 decimal DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
DECIMAL	TokenNameIdentifier	 DECIMAL
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_DECIMAL	TokenNameIdentifier	 DV  DECIMAL
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_TOTAL	TokenNameIdentifier	 ORDERED  TOTAL
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DECIMAL_DT	TokenNameIdentifier	 DECIMAL  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DECIMAL	TokenNameIdentifier	 DECIMAL
,	TokenNameCOMMA	
decimalDV	TokenNameIdentifier	 decimal DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ANYURI	TokenNameIdentifier	 ANYURI
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
ANYURI	TokenNameIdentifier	 ANYURI
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_ANYURI	TokenNameIdentifier	 DV  ANYURI
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_FALSE	TokenNameIdentifier	 ORDERED  FALSE
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
ANYURI_DT	TokenNameIdentifier	 ANYURI  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
BASE64BINARY	TokenNameIdentifier	 BAS E64 BINARY
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
BASE64BINARY	TokenNameIdentifier	 BAS E64 BINARY
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_BASE64BINARY	TokenNameIdentifier	 DV  BAS E64 BINARY
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_FALSE	TokenNameIdentifier	 ORDERED  FALSE
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
BASE64BINARY_DT	TokenNameIdentifier	 BAS E64 BINARY  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
durationDV	TokenNameIdentifier	 duration DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
DURATION	TokenNameIdentifier	 DURATION
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_DURATION	TokenNameIdentifier	 DV  DURATION
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DURATION_DT	TokenNameIdentifier	 DURATION  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DURATION	TokenNameIdentifier	 DURATION
,	TokenNameCOMMA	
durationDV	TokenNameIdentifier	 duration DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DATETIME	TokenNameIdentifier	 DATETIME
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
DATETIME	TokenNameIdentifier	 DATETIME
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_DATETIME	TokenNameIdentifier	 DV  DATETIME
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DATETIME_DT	TokenNameIdentifier	 DATETIME  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
TIME	TokenNameIdentifier	 TIME
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
TIME	TokenNameIdentifier	 TIME
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_TIME	TokenNameIdentifier	 DV  TIME
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
TIME_DT	TokenNameIdentifier	 TIME  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DATE	TokenNameIdentifier	 DATE
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
DATE	TokenNameIdentifier	 DATE
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_DATE	TokenNameIdentifier	 DV  DATE
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DATE_DT	TokenNameIdentifier	 DATE  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
YEARMONTH	TokenNameIdentifier	 YEARMONTH
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
YEARMONTH	TokenNameIdentifier	 YEARMONTH
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_GYEARMONTH	TokenNameIdentifier	 DV  GYEARMONTH
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
GYEARMONTH_DT	TokenNameIdentifier	 GYEARMONTH  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_GYEAR	TokenNameIdentifier	 DV  GYEAR
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
GYEAR_DT	TokenNameIdentifier	 GYEAR  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
MONTHDAY	TokenNameIdentifier	 MONTHDAY
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
MONTHDAY	TokenNameIdentifier	 MONTHDAY
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_GMONTHDAY	TokenNameIdentifier	 DV  GMONTHDAY
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
GMONTHDAY_DT	TokenNameIdentifier	 GMONTHDAY  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DAY	TokenNameIdentifier	 DAY
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
DAY	TokenNameIdentifier	 DAY
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_GDAY	TokenNameIdentifier	 DV  GDAY
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
GDAY_DT	TokenNameIdentifier	 GDAY  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_GMONTH	TokenNameIdentifier	 DV  GMONTH
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
GMONTH_DT	TokenNameIdentifier	 GMONTH  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
integerDV	TokenNameIdentifier	 integer DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
decimalDV	TokenNameIdentifier	 decimal DV
,	TokenNameCOMMA	
INTEGER	TokenNameIdentifier	 INTEGER
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_INTEGER	TokenNameIdentifier	 DV  INTEGER
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_TOTAL	TokenNameIdentifier	 ORDERED  TOTAL
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
INTEGER_DT	TokenNameIdentifier	 INTEGER  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
INTEGER	TokenNameIdentifier	 INTEGER
,	TokenNameCOMMA	
integerDV	TokenNameIdentifier	 integer DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
nonPositiveDV	TokenNameIdentifier	 non Positive DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
integerDV	TokenNameIdentifier	 integer DV
,	TokenNameCOMMA	
NONPOSITIVEINTEGER	TokenNameIdentifier	 NONPOSITIVEINTEGER
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
NONPOSITIVEINTEGER_DT	TokenNameIdentifier	 NONPOSITIVEINTEGER  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nonPositiveDV	TokenNameIdentifier	 non Positive DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NONPOSITIVEINTEGER	TokenNameIdentifier	 NONPOSITIVEINTEGER
,	TokenNameCOMMA	
nonPositiveDV	TokenNameIdentifier	 non Positive DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
=	TokenNameEQUAL	
"-1"	TokenNameStringLiteral	-1
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
negativeDV	TokenNameIdentifier	 negative DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
nonPositiveDV	TokenNameIdentifier	 non Positive DV
,	TokenNameCOMMA	
NEGATIVEINTEGER	TokenNameIdentifier	 NEGATIVEINTEGER
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
NEGATIVEINTEGER_DT	TokenNameIdentifier	 NEGATIVEINTEGER  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
negativeDV	TokenNameIdentifier	 negative DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NEGATIVEINTEGER	TokenNameIdentifier	 NEGATIVEINTEGER
,	TokenNameCOMMA	
negativeDV	TokenNameIdentifier	 negative DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
=	TokenNameEQUAL	
"9223372036854775807"	TokenNameStringLiteral	9223372036854775807
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
minInclusive	TokenNameIdentifier	 min Inclusive
=	TokenNameEQUAL	
"-9223372036854775808"	TokenNameStringLiteral	-9223372036854775808
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
longDV	TokenNameIdentifier	 long DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
integerDV	TokenNameIdentifier	 integer DV
,	TokenNameCOMMA	
LONG	TokenNameIdentifier	 LONG
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
LONG_DT	TokenNameIdentifier	 LONG  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
longDV	TokenNameIdentifier	 long DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
|	TokenNameOR	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MININCLUSIVE	TokenNameIdentifier	 FACET  MININCLUSIVE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
LONG	TokenNameIdentifier	 LONG
,	TokenNameCOMMA	
longDV	TokenNameIdentifier	 long DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
=	TokenNameEQUAL	
"2147483647"	TokenNameStringLiteral	2147483647
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
minInclusive	TokenNameIdentifier	 min Inclusive
=	TokenNameEQUAL	
"-2147483648"	TokenNameStringLiteral	-2147483648
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
intDV	TokenNameIdentifier	 int DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
longDV	TokenNameIdentifier	 long DV
,	TokenNameCOMMA	
INT	TokenNameIdentifier	 INT
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
INT_DT	TokenNameIdentifier	 INT  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intDV	TokenNameIdentifier	 int DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
|	TokenNameOR	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MININCLUSIVE	TokenNameIdentifier	 FACET  MININCLUSIVE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
INT	TokenNameIdentifier	 INT
,	TokenNameCOMMA	
intDV	TokenNameIdentifier	 int DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
=	TokenNameEQUAL	
"32767"	TokenNameStringLiteral	32767
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
minInclusive	TokenNameIdentifier	 min Inclusive
=	TokenNameEQUAL	
"-32768"	TokenNameStringLiteral	-32768
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
shortDV	TokenNameIdentifier	 short DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
intDV	TokenNameIdentifier	 int DV
,	TokenNameCOMMA	
SHORT	TokenNameIdentifier	 SHORT
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
SHORT_DT	TokenNameIdentifier	 SHORT  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shortDV	TokenNameIdentifier	 short DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
|	TokenNameOR	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MININCLUSIVE	TokenNameIdentifier	 FACET  MININCLUSIVE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SHORT	TokenNameIdentifier	 SHORT
,	TokenNameCOMMA	
shortDV	TokenNameIdentifier	 short DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
=	TokenNameEQUAL	
"127"	TokenNameStringLiteral	127
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
minInclusive	TokenNameIdentifier	 min Inclusive
=	TokenNameEQUAL	
"-128"	TokenNameStringLiteral	-128
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
byteDV	TokenNameIdentifier	 byte DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
shortDV	TokenNameIdentifier	 short DV
,	TokenNameCOMMA	
BYTE	TokenNameIdentifier	 BYTE
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
BYTE_DT	TokenNameIdentifier	 BYTE  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byteDV	TokenNameIdentifier	 byte DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
|	TokenNameOR	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MININCLUSIVE	TokenNameIdentifier	 FACET  MININCLUSIVE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
BYTE	TokenNameIdentifier	 BYTE
,	TokenNameCOMMA	
byteDV	TokenNameIdentifier	 byte DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
minInclusive	TokenNameIdentifier	 min Inclusive
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
nonNegativeDV	TokenNameIdentifier	 non Negative DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
integerDV	TokenNameIdentifier	 integer DV
,	TokenNameCOMMA	
NONNEGATIVEINTEGER	TokenNameIdentifier	 NONNEGATIVEINTEGER
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
NONNEGATIVEINTEGER_DT	TokenNameIdentifier	 NONNEGATIVEINTEGER  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nonNegativeDV	TokenNameIdentifier	 non Negative DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MININCLUSIVE	TokenNameIdentifier	 FACET  MININCLUSIVE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NONNEGATIVEINTEGER	TokenNameIdentifier	 NONNEGATIVEINTEGER
,	TokenNameCOMMA	
nonNegativeDV	TokenNameIdentifier	 non Negative DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
=	TokenNameEQUAL	
"18446744073709551615"	TokenNameStringLiteral	18446744073709551615
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
unsignedLongDV	TokenNameIdentifier	 unsigned Long DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
nonNegativeDV	TokenNameIdentifier	 non Negative DV
,	TokenNameCOMMA	
UNSIGNEDLONG	TokenNameIdentifier	 UNSIGNEDLONG
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
UNSIGNEDLONG_DT	TokenNameIdentifier	 UNSIGNEDLONG  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unsignedLongDV	TokenNameIdentifier	 unsigned Long DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
UNSIGNEDLONG	TokenNameIdentifier	 UNSIGNEDLONG
,	TokenNameCOMMA	
unsignedLongDV	TokenNameIdentifier	 unsigned Long DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
=	TokenNameEQUAL	
"4294967295"	TokenNameStringLiteral	4294967295
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
unsignedIntDV	TokenNameIdentifier	 unsigned Int DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
unsignedLongDV	TokenNameIdentifier	 unsigned Long DV
,	TokenNameCOMMA	
UNSIGNEDINT	TokenNameIdentifier	 UNSIGNEDINT
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
UNSIGNEDINT_DT	TokenNameIdentifier	 UNSIGNEDINT  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unsignedIntDV	TokenNameIdentifier	 unsigned Int DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
UNSIGNEDINT	TokenNameIdentifier	 UNSIGNEDINT
,	TokenNameCOMMA	
unsignedIntDV	TokenNameIdentifier	 unsigned Int DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
=	TokenNameEQUAL	
"65535"	TokenNameStringLiteral	65535
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
unsignedShortDV	TokenNameIdentifier	 unsigned Short DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
unsignedIntDV	TokenNameIdentifier	 unsigned Int DV
,	TokenNameCOMMA	
UNSIGNEDSHORT	TokenNameIdentifier	 UNSIGNEDSHORT
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
UNSIGNEDSHORT_DT	TokenNameIdentifier	 UNSIGNEDSHORT  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unsignedShortDV	TokenNameIdentifier	 unsigned Short DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
UNSIGNEDSHORT	TokenNameIdentifier	 UNSIGNEDSHORT
,	TokenNameCOMMA	
unsignedShortDV	TokenNameIdentifier	 unsigned Short DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
=	TokenNameEQUAL	
"255"	TokenNameStringLiteral	255
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
unsignedByteDV	TokenNameIdentifier	 unsigned Byte DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
unsignedShortDV	TokenNameIdentifier	 unsigned Short DV
,	TokenNameCOMMA	
UNSIGNEDBYTE	TokenNameIdentifier	 UNSIGNEDBYTE
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
UNSIGNEDBYTE_DT	TokenNameIdentifier	 UNSIGNEDBYTE  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unsignedByteDV	TokenNameIdentifier	 unsigned Byte DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
UNSIGNEDBYTE	TokenNameIdentifier	 UNSIGNEDBYTE
,	TokenNameCOMMA	
unsignedByteDV	TokenNameIdentifier	 unsigned Byte DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
minInclusive	TokenNameIdentifier	 min Inclusive
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
positiveIntegerDV	TokenNameIdentifier	 positive Integer DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
nonNegativeDV	TokenNameIdentifier	 non Negative DV
,	TokenNameCOMMA	
POSITIVEINTEGER	TokenNameIdentifier	 POSITIVEINTEGER
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
POSITIVEINTEGER_DT	TokenNameIdentifier	 POSITIVEINTEGER  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
positiveIntegerDV	TokenNameIdentifier	 positive Integer DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MININCLUSIVE	TokenNameIdentifier	 FACET  MININCLUSIVE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
POSITIVEINTEGER	TokenNameIdentifier	 POSITIVEINTEGER
,	TokenNameCOMMA	
positiveIntegerDV	TokenNameIdentifier	 positive Integer DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_FLOAT	TokenNameIdentifier	 DV  FLOAT
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
FLOAT_DT	TokenNameIdentifier	 FLOAT  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DOUBLE	TokenNameIdentifier	 DOUBLE
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
DOUBLE	TokenNameIdentifier	 DOUBLE
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_DOUBLE	TokenNameIdentifier	 DV  DOUBLE
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_PARTIAL	TokenNameIdentifier	 ORDERED  PARTIAL
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
DOUBLE_DT	TokenNameIdentifier	 DOUBLE  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
HEXBINARY	TokenNameIdentifier	 HEXBINARY
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
HEXBINARY	TokenNameIdentifier	 HEXBINARY
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_HEXBINARY	TokenNameIdentifier	 DV  HEXBINARY
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_FALSE	TokenNameIdentifier	 ORDERED  FALSE
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
HEXBINARY_DT	TokenNameIdentifier	 HEXBINARY  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NOTATION	TokenNameIdentifier	 NOTATION
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
NOTATION	TokenNameIdentifier	 NOTATION
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_NOTATION	TokenNameIdentifier	 DV  NOTATION
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_FALSE	TokenNameIdentifier	 ORDERED  FALSE
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
NOTATION_DT	TokenNameIdentifier	 NOTATION  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
whiteSpace	TokenNameIdentifier	 white Space
=	TokenNameEQUAL	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
WS_REPLACE	TokenNameIdentifier	 WS  REPLACE
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
normalizedDV	TokenNameIdentifier	 normalized DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
stringDV	TokenNameIdentifier	 string DV
,	TokenNameCOMMA	
NORMALIZEDSTRING	TokenNameIdentifier	 NORMALIZEDSTRING
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
NORMALIZEDSTRING_DT	TokenNameIdentifier	 NORMALIZEDSTRING  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
normalizedDV	TokenNameIdentifier	 normalized DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_WHITESPACE	TokenNameIdentifier	 FACET  WHITESPACE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NORMALIZEDSTRING	TokenNameIdentifier	 NORMALIZEDSTRING
,	TokenNameCOMMA	
normalizedDV	TokenNameIdentifier	 normalized DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
whiteSpace	TokenNameIdentifier	 white Space
=	TokenNameEQUAL	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
WS_COLLAPSE	TokenNameIdentifier	 WS  COLLAPSE
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
tokenDV	TokenNameIdentifier	 token DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
normalizedDV	TokenNameIdentifier	 normalized DV
,	TokenNameCOMMA	
TOKEN	TokenNameIdentifier	 TOKEN
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
TOKEN_DT	TokenNameIdentifier	 TOKEN  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenDV	TokenNameIdentifier	 token DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_WHITESPACE	TokenNameIdentifier	 FACET  WHITESPACE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
TOKEN	TokenNameIdentifier	 TOKEN
,	TokenNameCOMMA	
tokenDV	TokenNameIdentifier	 token DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
whiteSpace	TokenNameIdentifier	 white Space
=	TokenNameEQUAL	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
WS_COLLAPSE	TokenNameIdentifier	 WS  COLLAPSE
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
"([a-zA-Z]{1,8})(-[a-zA-Z0-9]{1,8})*"	TokenNameStringLiteral	([a-zA-Z]{1,8})(-[a-zA-Z0-9]{1,8})*
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
languageDV	TokenNameIdentifier	 language DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
tokenDV	TokenNameIdentifier	 token DV
,	TokenNameCOMMA	
LANGUAGE	TokenNameIdentifier	 LANGUAGE
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
LANGUAGE_DT	TokenNameIdentifier	 LANGUAGE  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
languageDV	TokenNameIdentifier	 language DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_WHITESPACE	TokenNameIdentifier	 FACET  WHITESPACE
|	TokenNameOR	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_PATTERN	TokenNameIdentifier	 FACET  PATTERN
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
LANGUAGE	TokenNameIdentifier	 LANGUAGE
,	TokenNameCOMMA	
languageDV	TokenNameIdentifier	 language DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
whiteSpace	TokenNameIdentifier	 white Space
=	TokenNameEQUAL	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
WS_COLLAPSE	TokenNameIdentifier	 WS  COLLAPSE
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
nameDV	TokenNameIdentifier	 name DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
tokenDV	TokenNameIdentifier	 token DV
,	TokenNameCOMMA	
NAME	TokenNameIdentifier	 NAME
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
NAME_DT	TokenNameIdentifier	 NAME  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nameDV	TokenNameIdentifier	 name DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_WHITESPACE	TokenNameIdentifier	 FACET  WHITESPACE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
SPECIAL_PATTERN_NAME	TokenNameIdentifier	 SPECIAL  PATTERN  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NAME	TokenNameIdentifier	 NAME
,	TokenNameCOMMA	
nameDV	TokenNameIdentifier	 name DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
whiteSpace	TokenNameIdentifier	 white Space
=	TokenNameEQUAL	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
WS_COLLAPSE	TokenNameIdentifier	 WS  COLLAPSE
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
ncnameDV	TokenNameIdentifier	 ncname DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
nameDV	TokenNameIdentifier	 name DV
,	TokenNameCOMMA	
NCNAME	TokenNameIdentifier	 NCNAME
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
NCNAME_DT	TokenNameIdentifier	 NCNAME  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ncnameDV	TokenNameIdentifier	 ncname DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_WHITESPACE	TokenNameIdentifier	 FACET  WHITESPACE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
SPECIAL_PATTERN_NCNAME	TokenNameIdentifier	 SPECIAL  PATTERN  NCNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NCNAME	TokenNameIdentifier	 NCNAME
,	TokenNameCOMMA	
ncnameDV	TokenNameIdentifier	 ncname DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
baseAtomicType	TokenNameIdentifier	 base Atomic Type
,	TokenNameCOMMA	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_QNAME	TokenNameIdentifier	 DV  QNAME
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_FALSE	TokenNameIdentifier	 ORDERED  FALSE
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
QNAME_DT	TokenNameIdentifier	 QNAME  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ID	TokenNameIdentifier	 ID
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
ncnameDV	TokenNameIdentifier	 ncname DV
,	TokenNameCOMMA	
ID	TokenNameIdentifier	 ID
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_ID	TokenNameIdentifier	 DV  ID
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_FALSE	TokenNameIdentifier	 ORDERED  FALSE
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
ID_DT	TokenNameIdentifier	 ID  DT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
idrefDV	TokenNameIdentifier	 idref DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
ncnameDV	TokenNameIdentifier	 ncname DV
,	TokenNameCOMMA	
IDREF	TokenNameIdentifier	 IDREF
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_IDREF	TokenNameIdentifier	 DV  IDREF
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_FALSE	TokenNameIdentifier	 ORDERED  FALSE
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
IDREF_DT	TokenNameIdentifier	 IDREF  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
IDREF	TokenNameIdentifier	 IDREF
,	TokenNameCOMMA	
idrefDV	TokenNameIdentifier	 idref DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
minLength	TokenNameIdentifier	 min Length
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
tempDV	TokenNameIdentifier	 temp DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idrefDV	TokenNameIdentifier	 idref DV
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
idrefsDV	TokenNameIdentifier	 idrefs DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
tempDV	TokenNameIdentifier	 temp DV
,	TokenNameCOMMA	
IDREFS	TokenNameIdentifier	 IDREFS
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idrefsDV	TokenNameIdentifier	 idrefs DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MINLENGTH	TokenNameIdentifier	 FACET  MINLENGTH
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
IDREFS	TokenNameIdentifier	 IDREFS
,	TokenNameCOMMA	
idrefsDV	TokenNameIdentifier	 idrefs DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
entityDV	TokenNameIdentifier	 entity DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
ncnameDV	TokenNameIdentifier	 ncname DV
,	TokenNameCOMMA	
ENTITY	TokenNameIdentifier	 ENTITY
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
DV_ENTITY	TokenNameIdentifier	 DV  ENTITY
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
ORDERED_FALSE	TokenNameIdentifier	 ORDERED  FALSE
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
ENTITY_DT	TokenNameIdentifier	 ENTITY  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ENTITY	TokenNameIdentifier	 ENTITY
,	TokenNameCOMMA	
entityDV	TokenNameIdentifier	 entity DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
minLength	TokenNameIdentifier	 min Length
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tempDV	TokenNameIdentifier	 temp DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
entityDV	TokenNameIdentifier	 entity DV
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
entitiesDV	TokenNameIdentifier	 entities DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
tempDV	TokenNameIdentifier	 temp DV
,	TokenNameCOMMA	
ENTITIES	TokenNameIdentifier	 ENTITIES
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entitiesDV	TokenNameIdentifier	 entities DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MINLENGTH	TokenNameIdentifier	 FACET  MINLENGTH
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ENTITIES	TokenNameIdentifier	 ENTITIES
,	TokenNameCOMMA	
entitiesDV	TokenNameIdentifier	 entities DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
whiteSpace	TokenNameIdentifier	 white Space
=	TokenNameEQUAL	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
WS_COLLAPSE	TokenNameIdentifier	 WS  COLLAPSE
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
nmtokenDV	TokenNameIdentifier	 nmtoken DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
tokenDV	TokenNameIdentifier	 token DV
,	TokenNameCOMMA	
NMTOKEN	TokenNameIdentifier	 NMTOKEN
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
NMTOKEN_DT	TokenNameIdentifier	 NMTOKEN  DT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nmtokenDV	TokenNameIdentifier	 nmtoken DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_WHITESPACE	TokenNameIdentifier	 FACET  WHITESPACE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
SPECIAL_PATTERN_NMTOKEN	TokenNameIdentifier	 SPECIAL  PATTERN  NMTOKEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NMTOKEN	TokenNameIdentifier	 NMTOKEN
,	TokenNameCOMMA	
nmtokenDV	TokenNameIdentifier	 nmtoken DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
facets	TokenNameIdentifier	 facets
.	TokenNameDOT	
minLength	TokenNameIdentifier	 min Length
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tempDV	TokenNameIdentifier	 temp DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nmtokenDV	TokenNameIdentifier	 nmtoken DV
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
nmtokensDV	TokenNameIdentifier	 nmtokens DV
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
tempDV	TokenNameIdentifier	 temp DV
,	TokenNameCOMMA	
NMTOKENS	TokenNameIdentifier	 NMTOKENS
,	TokenNameCOMMA	
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nmtokensDV	TokenNameIdentifier	 nmtokens DV
.	TokenNameDOT	
applyFacets1	TokenNameIdentifier	 apply Facets1
(	TokenNameLPAREN	
facets	TokenNameIdentifier	 facets
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
.	TokenNameDOT	
FACET_MINLENGTH	TokenNameIdentifier	 FACET  MINLENGTH
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builtInTypes	TokenNameIdentifier	 built In Types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NMTOKENS	TokenNameIdentifier	 NMTOKENS
,	TokenNameCOMMA	
nmtokensDV	TokenNameIdentifier	 nmtokens DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//createBuiltInTypes() 	TokenNameCOMMENT_LINE	createBuiltInTypes() 
/** * Create a new simple type which is derived by restriction from another * simple type. * * @param name name of the new type, could be null * @param targetNamespace target namespace of the new type, could be null * @param finalSet value of "final" * @param base base type of the new type * @param annotations set of annotations * @return the newly created simple type */	TokenNameCOMMENT_JAVADOC	 Create a new simple type which is derived by restriction from another simple type. * @param name name of the new type, could be null @param targetNamespace target namespace of the new type, could be null @param finalSet value of "final" @param base base type of the new type @param annotations set of annotations @return the newly created simple type 
public	TokenNamepublic	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
createTypeRestriction	TokenNameIdentifier	 create Type Restriction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
targetNamespace	TokenNameIdentifier	 target Namespace
,	TokenNameCOMMA	
short	TokenNameshort	
finalSet	TokenNameIdentifier	 final Set
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
XSObjectList	TokenNameIdentifier	 XS Object List
annotations	TokenNameIdentifier	 annotations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDeclPool	TokenNameIdentifier	 f Decl Pool
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
fDeclPool	TokenNameIdentifier	 f Decl Pool
.	TokenNameDOT	
getSimpleTypeDecl	TokenNameIdentifier	 get Simple Type Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
setRestrictionValues	TokenNameIdentifier	 set Restriction Values
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
)	TokenNameRPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
targetNamespace	TokenNameIdentifier	 target Namespace
,	TokenNameCOMMA	
finalSet	TokenNameIdentifier	 final Set
,	TokenNameCOMMA	
annotations	TokenNameIdentifier	 annotations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
)	TokenNameRPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
targetNamespace	TokenNameIdentifier	 target Namespace
,	TokenNameCOMMA	
finalSet	TokenNameIdentifier	 final Set
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
annotations	TokenNameIdentifier	 annotations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new simple type which is derived by list from another simple * type. * * @param name name of the new type, could be null * @param targetNamespace target namespace of the new type, could be null * @param finalSet value of "final" * @param itemType item type of the list type * @param annotations set of annotations * @return the newly created simple type */	TokenNameCOMMENT_JAVADOC	 Create a new simple type which is derived by list from another simple type. * @param name name of the new type, could be null @param targetNamespace target namespace of the new type, could be null @param finalSet value of "final" @param itemType item type of the list type @param annotations set of annotations @return the newly created simple type 
public	TokenNamepublic	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
createTypeList	TokenNameIdentifier	 create Type List
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
targetNamespace	TokenNameIdentifier	 target Namespace
,	TokenNameCOMMA	
short	TokenNameshort	
finalSet	TokenNameIdentifier	 final Set
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
itemType	TokenNameIdentifier	 item Type
,	TokenNameCOMMA	
XSObjectList	TokenNameIdentifier	 XS Object List
annotations	TokenNameIdentifier	 annotations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDeclPool	TokenNameIdentifier	 f Decl Pool
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
fDeclPool	TokenNameIdentifier	 f Decl Pool
.	TokenNameDOT	
getSimpleTypeDecl	TokenNameIdentifier	 get Simple Type Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
setListValues	TokenNameIdentifier	 set List Values
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
targetNamespace	TokenNameIdentifier	 target Namespace
,	TokenNameCOMMA	
finalSet	TokenNameIdentifier	 final Set
,	TokenNameCOMMA	
(	TokenNameLPAREN	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
)	TokenNameRPAREN	
itemType	TokenNameIdentifier	 item Type
,	TokenNameCOMMA	
annotations	TokenNameIdentifier	 annotations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
targetNamespace	TokenNameIdentifier	 target Namespace
,	TokenNameCOMMA	
finalSet	TokenNameIdentifier	 final Set
,	TokenNameCOMMA	
(	TokenNameLPAREN	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
)	TokenNameRPAREN	
itemType	TokenNameIdentifier	 item Type
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
annotations	TokenNameIdentifier	 annotations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new simple type which is derived by union from a list of other * simple types. * * @param name name of the new type, could be null * @param targetNamespace target namespace of the new type, could be null * @param finalSet value of "final" * @param memberTypes member types of the union type * @param annotations set of annotations * @return the newly created simple type */	TokenNameCOMMENT_JAVADOC	 Create a new simple type which is derived by union from a list of other simple types. * @param name name of the new type, could be null @param targetNamespace target namespace of the new type, could be null @param finalSet value of "final" @param memberTypes member types of the union type @param annotations set of annotations @return the newly created simple type 
public	TokenNamepublic	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
createTypeUnion	TokenNameIdentifier	 create Type Union
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
targetNamespace	TokenNameIdentifier	 target Namespace
,	TokenNameCOMMA	
short	TokenNameshort	
finalSet	TokenNameIdentifier	 final Set
,	TokenNameCOMMA	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
memberTypes	TokenNameIdentifier	 member Types
,	TokenNameCOMMA	
XSObjectList	TokenNameIdentifier	 XS Object List
annotations	TokenNameIdentifier	 annotations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
typeNum	TokenNameIdentifier	 type Num
=	TokenNameEQUAL	
memberTypes	TokenNameIdentifier	 member Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mtypes	TokenNameIdentifier	 mtypes
=	TokenNameEQUAL	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
[	TokenNameLBRACKET	
typeNum	TokenNameIdentifier	 type Num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
memberTypes	TokenNameIdentifier	 member Types
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
mtypes	TokenNameIdentifier	 mtypes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
typeNum	TokenNameIdentifier	 type Num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDeclPool	TokenNameIdentifier	 f Decl Pool
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
fDeclPool	TokenNameIdentifier	 f Decl Pool
.	TokenNameDOT	
getSimpleTypeDecl	TokenNameIdentifier	 get Simple Type Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
setUnionValues	TokenNameIdentifier	 set Union Values
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
targetNamespace	TokenNameIdentifier	 target Namespace
,	TokenNameCOMMA	
finalSet	TokenNameIdentifier	 final Set
,	TokenNameCOMMA	
mtypes	TokenNameIdentifier	 mtypes
,	TokenNameCOMMA	
annotations	TokenNameIdentifier	 annotations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
targetNamespace	TokenNameIdentifier	 target Namespace
,	TokenNameCOMMA	
finalSet	TokenNameIdentifier	 final Set
,	TokenNameCOMMA	
mtypes	TokenNameIdentifier	 mtypes
,	TokenNameCOMMA	
annotations	TokenNameIdentifier	 annotations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDeclPool	TokenNameIdentifier	 set Decl Pool
(	TokenNameLPAREN	
XSDeclarationPool	TokenNameIdentifier	 XS Declaration Pool
declPool	TokenNameIdentifier	 decl Pool
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDeclPool	TokenNameIdentifier	 f Decl Pool
=	TokenNameEQUAL	
declPool	TokenNameIdentifier	 decl Pool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Implementation internal **/	TokenNameCOMMENT_JAVADOC	 Implementation internal *
public	TokenNamepublic	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
newXSSimpleTypeDecl	TokenNameIdentifier	 new XS Simple Type Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//BaseSchemaDVFactory 	TokenNameCOMMENT_LINE	BaseSchemaDVFactory 
