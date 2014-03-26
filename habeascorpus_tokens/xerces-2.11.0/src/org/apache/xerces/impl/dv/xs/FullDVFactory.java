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
/** * the factory to create/return built-in schema DVs and create user-defined DVs * * @xerces.internal * * @author Neeraj Bajaj, Sun Microsystems, inc. * @author Sandy Gao, IBM * * @version $Id: FullDVFactory.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 the factory to create/return built-in schema DVs and create user-defined DVs * @xerces.internal * @author Neeraj Bajaj, Sun Microsystems, inc. @author Sandy Gao, IBM * @version $Id: FullDVFactory.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
FullDVFactory	TokenNameIdentifier	 Full DV Factory
extends	TokenNameextends	
BaseDVFactory	TokenNameIdentifier	 Base DV Factory
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
URI_SCHEMAFORSCHEMA	TokenNameIdentifier	 URI  SCHEMAFORSCHEMA
=	TokenNameEQUAL	
"http://www.w3.org/2001/XMLSchema"	TokenNameStringLiteral	http://www.w3.org/2001/XMLSchema
;	TokenNameSEMICOLON	
// there are 45 types. 89 is the closest prime number to 45*2=90. 	TokenNameCOMMENT_LINE	there are 45 types. 89 is the closest prime number to 45*2=90. 
static	TokenNamestatic	
SymbolHash	TokenNameIdentifier	 Symbol Hash
fFullTypes	TokenNameIdentifier	 f Full Types
=	TokenNameEQUAL	
new	TokenNamenew	
SymbolHash	TokenNameIdentifier	 Symbol Hash
(	TokenNameLPAREN	
89	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
createBuiltInTypes	TokenNameIdentifier	 create Built In Types
(	TokenNameLPAREN	
fFullTypes	TokenNameIdentifier	 f Full Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a built-in simple type of the given name * REVISIT: its still not decided within the Schema WG how to define the * ur-types and if all simple types should be derived from a * complex type, so as of now we ignore the fact that anySimpleType * is derived from anyType, and pass 'null' as the base of * anySimpleType. It needs to be changed as per the decision taken. * * @param name the name of the datatype * @return the datatype validator of the given name */	TokenNameCOMMENT_JAVADOC	 Get a built-in simple type of the given name REVISIT: its still not decided within the Schema WG how to define the ur-types and if all simple types should be derived from a complex type, so as of now we ignore the fact that anySimpleType is derived from anyType, and pass 'null' as the base of anySimpleType. It needs to be changed as per the decision taken. * @param name the name of the datatype @return the datatype validator of the given name 
public	TokenNamepublic	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
getBuiltInType	TokenNameIdentifier	 get Built In Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XSSimpleType	TokenNameIdentifier	 XS Simple Type
)	TokenNameRPAREN	
fFullTypes	TokenNameIdentifier	 f Full Types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get all built-in simple types, which are stored in a hashtable keyed by * the name * * @return a hashtable which contains all built-in simple types */	TokenNameCOMMENT_JAVADOC	 get all built-in simple types, which are stored in a hashtable keyed by the name * @return a hashtable which contains all built-in simple types 
public	TokenNamepublic	
SymbolHash	TokenNameIdentifier	 Symbol Hash
getBuiltInTypes	TokenNameIdentifier	 get Built In Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SymbolHash	TokenNameIdentifier	 Symbol Hash
)	TokenNameRPAREN	
fFullTypes	TokenNameIdentifier	 f Full Types
.	TokenNameDOT	
makeClone	TokenNameIdentifier	 make Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create all built-in types 	TokenNameCOMMENT_LINE	create all built-in types 
static	TokenNamestatic	
void	TokenNamevoid	
createBuiltInTypes	TokenNameIdentifier	 create Built In Types
(	TokenNameLPAREN	
SymbolHash	TokenNameIdentifier	 Symbol Hash
types	TokenNameIdentifier	 types
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create base types first 	TokenNameCOMMENT_LINE	create base types first 
BaseDVFactory	TokenNameIdentifier	 Base DV Factory
.	TokenNameDOT	
createBuiltInTypes	TokenNameIdentifier	 create Built In Types
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// full schema simple type names 	TokenNameCOMMENT_LINE	full schema simple type names 
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
NAME	TokenNameIdentifier	 NAME
=	TokenNameEQUAL	
"Name"	TokenNameStringLiteral	Name
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
QNAME	TokenNameIdentifier	 QNAME
=	TokenNameEQUAL	
"QName"	TokenNameStringLiteral	QName
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STRING	TokenNameIdentifier	 STRING
=	TokenNameEQUAL	
"string"	TokenNameStringLiteral	string
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TOKEN	TokenNameIdentifier	 TOKEN
=	TokenNameEQUAL	
"token"	TokenNameStringLiteral	token
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
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
anySimpleType	TokenNameIdentifier	 any Simple Type
=	TokenNameEQUAL	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
fAnySimpleType	TokenNameIdentifier	 f Any Simple Type
;	TokenNameSEMICOLON	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
stringDV	TokenNameIdentifier	 string DV
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
)	TokenNameRPAREN	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
anySimpleType	TokenNameIdentifier	 any Simple Type
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DOUBLE	TokenNameIdentifier	 DOUBLE
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
anySimpleType	TokenNameIdentifier	 any Simple Type
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DURATION	TokenNameIdentifier	 DURATION
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
anySimpleType	TokenNameIdentifier	 any Simple Type
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
HEXBINARY	TokenNameIdentifier	 HEXBINARY
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
anySimpleType	TokenNameIdentifier	 any Simple Type
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
QNAME	TokenNameIdentifier	 QNAME
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
anySimpleType	TokenNameIdentifier	 any Simple Type
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NOTATION	TokenNameIdentifier	 NOTATION
,	TokenNameCOMMA	
new	TokenNamenew	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
(	TokenNameLPAREN	
anySimpleType	TokenNameIdentifier	 any Simple Type
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
types	TokenNameIdentifier	 types
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
types	TokenNameIdentifier	 types
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
types	TokenNameIdentifier	 types
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
types	TokenNameIdentifier	 types
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NCNAME	TokenNameIdentifier	 NCNAME
,	TokenNameCOMMA	
ncnameDV	TokenNameIdentifier	 ncname DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
types	TokenNameIdentifier	 types
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
types	TokenNameIdentifier	 types
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
types	TokenNameIdentifier	 types
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
types	TokenNameIdentifier	 types
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
types	TokenNameIdentifier	 types
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
types	TokenNameIdentifier	 types
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
NMTOKENS	TokenNameIdentifier	 NMTOKENS
,	TokenNameCOMMA	
nmtokensDV	TokenNameIdentifier	 nmtokens DV
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//createBuiltInTypes(SymbolHash) 	TokenNameCOMMENT_LINE	createBuiltInTypes(SymbolHash) 
}	TokenNameRBRACE	
//XFormsDVFactory 	TokenNameCOMMENT_LINE	XFormsDVFactory 
