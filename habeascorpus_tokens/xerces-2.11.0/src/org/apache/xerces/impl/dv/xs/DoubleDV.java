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
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
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
ValidationContext	TokenNameIdentifier	 Validation Context
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
XSDouble	TokenNameIdentifier	 XS Double
;	TokenNameSEMICOLON	
/** * Represent the schema type "double" * * @xerces.internal * * @author Neeraj Bajaj, Sun Microsystems, inc. * @author Sandy Gao, IBM * * @version $Id: DoubleDV.java 572095 2007-09-02 18:32:43Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Represent the schema type "double" * @xerces.internal * @author Neeraj Bajaj, Sun Microsystems, inc. @author Sandy Gao, IBM * @version $Id: DoubleDV.java 572095 2007-09-02 18:32:43Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DoubleDV	TokenNameIdentifier	 Double DV
extends	TokenNameextends	
TypeValidator	TokenNameIdentifier	 Type Validator
{	TokenNameLBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getAllowedFacets	TokenNameIdentifier	 get Allowed Facets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_PATTERN	TokenNameIdentifier	 FACET  PATTERN
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_WHITESPACE	TokenNameIdentifier	 FACET  WHITESPACE
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_ENUMERATION	TokenNameIdentifier	 FACET  ENUMERATION
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_MAXINCLUSIVE	TokenNameIdentifier	 FACET  MAXINCLUSIVE
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_MININCLUSIVE	TokenNameIdentifier	 FACET  MININCLUSIVE
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_MAXEXCLUSIVE	TokenNameIdentifier	 FACET  MAXEXCLUSIVE
|	TokenNameOR	
XSSimpleTypeDecl	TokenNameIdentifier	 XS Simple Type Decl
.	TokenNameDOT	
FACET_MINEXCLUSIVE	TokenNameIdentifier	 FACET  MINEXCLUSIVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//getAllowedFacets() 	TokenNameCOMMENT_LINE	getAllowedFacets() 
//convert a String to Double form, we have to take care of cases specified in spec like INF, -INF and NaN 	TokenNameCOMMENT_LINE	convert a String to Double form, we have to take care of cases specified in spec like INF, -INF and NaN 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getActualValue	TokenNameIdentifier	 get Actual Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
ValidationContext	TokenNameIdentifier	 Validation Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XDouble	TokenNameIdentifier	 X Double
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
(	TokenNameLPAREN	
"cvc-datatype-valid.1.2.1"	TokenNameStringLiteral	cvc-datatype-valid.1.2.1
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
"double"	TokenNameStringLiteral	double
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//getActualValue() 	TokenNameCOMMENT_LINE	getActualValue() 
// Can't call Double#compareTo method, because it's introduced in jdk 1.2 	TokenNameCOMMENT_LINE	Can't call Double#compareTo method, because it's introduced in jdk 1.2 
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value1	TokenNameIdentifier	 value1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value2	TokenNameIdentifier	 value2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XDouble	TokenNameIdentifier	 X Double
)	TokenNameRPAREN	
value1	TokenNameIdentifier	 value1
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XDouble	TokenNameIdentifier	 X Double
)	TokenNameRPAREN	
value2	TokenNameIdentifier	 value2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//compare() 	TokenNameCOMMENT_LINE	compare() 
//distinguishes between identity and equality for double datatype 	TokenNameCOMMENT_LINE	distinguishes between identity and equality for double datatype 
//0.0 is equal but not identical to -0.0 	TokenNameCOMMENT_LINE	0.0 is equal but not identical to -0.0 
public	TokenNamepublic	
boolean	TokenNameboolean	
isIdentical	TokenNameIdentifier	 is Identical
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value1	TokenNameIdentifier	 value1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value2	TokenNameIdentifier	 value2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value2	TokenNameIdentifier	 value2
instanceof	TokenNameinstanceof	
XDouble	TokenNameIdentifier	 X Double
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XDouble	TokenNameIdentifier	 X Double
)	TokenNameRPAREN	
value1	TokenNameIdentifier	 value1
)	TokenNameRPAREN	
.	TokenNameDOT	
isIdentical	TokenNameIdentifier	 is Identical
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XDouble	TokenNameIdentifier	 X Double
)	TokenNameRPAREN	
value2	TokenNameIdentifier	 value2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//isIdentical() 	TokenNameCOMMENT_LINE	isIdentical() 
/** * Returns true if it's possible that the given * string represents a valid floating point value * (excluding NaN, INF and -INF). */	TokenNameCOMMENT_JAVADOC	 Returns true if it's possible that the given string represents a valid floating point value (excluding NaN, INF and -INF). 
static	TokenNamestatic	
boolean	TokenNameboolean	
isPossibleFP	TokenNameIdentifier	 is Possible FP
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'E'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
XDouble	TokenNameIdentifier	 X Double
implements	TokenNameimplements	
XSDouble	TokenNameIdentifier	 XS Double
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XDouble	TokenNameIdentifier	 X Double
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isPossibleFP	TokenNameIdentifier	 is Possible FP
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
parseDouble	TokenNameIdentifier	 parse Double
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"INF"	TokenNameStringLiteral	INF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-INF"	TokenNameStringLiteral	-INF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"NaN"	TokenNameStringLiteral	NaN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
instanceof	TokenNameinstanceof	
XDouble	TokenNameIdentifier	 X Double
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
XDouble	TokenNameIdentifier	 X Double
oval	TokenNameIdentifier	 oval
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XDouble	TokenNameIdentifier	 X Double
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
// NOTE: we don't distinguish 0.0 from -0.0 	TokenNameCOMMENT_LINE	NOTE: we don't distinguish 0.0 from -0.0 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
oval	TokenNameIdentifier	 oval
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
value	TokenNameIdentifier	 value
&&	TokenNameAND_AND	
oval	TokenNameIdentifier	 oval
.	TokenNameDOT	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
oval	TokenNameIdentifier	 oval
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This check is necessary because doubleToLongBits(+0) != doubleToLongBits(-0) 	TokenNameCOMMENT_LINE	This check is necessary because doubleToLongBits(+0) != doubleToLongBits(-0) 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
0d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
^	TokenNameXOR	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// NOTE: 0.0 is equal but not identical to -0.0 	TokenNameCOMMENT_LINE	NOTE: 0.0 is equal but not identical to -0.0 
public	TokenNamepublic	
boolean	TokenNameboolean	
isIdentical	TokenNameIdentifier	 is Identical
(	TokenNameLPAREN	
XDouble	TokenNameIdentifier	 X Double
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
0.0d	TokenNameDoubleLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
doubleToLongBits	TokenNameIdentifier	 double To Long Bits
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
value	TokenNameIdentifier	 value
&&	TokenNameAND_AND	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
XDouble	TokenNameIdentifier	 X Double
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
oval	TokenNameIdentifier	 oval
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
// this < other 	TokenNameCOMMENT_LINE	this < other 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
oval	TokenNameIdentifier	 oval
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// this > other 	TokenNameCOMMENT_LINE	this > other 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
>	TokenNameGREATER	
oval	TokenNameIdentifier	 oval
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// this == other 	TokenNameCOMMENT_LINE	this == other 
// NOTE: we don't distinguish 0.0 from -0.0 	TokenNameCOMMENT_LINE	NOTE: we don't distinguish 0.0 from -0.0 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
oval	TokenNameIdentifier	 oval
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// one of the 2 values or both is/are NaN(s) 	TokenNameCOMMENT_LINE	one of the 2 values or both is/are NaN(s) 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this = NaN = other 	TokenNameCOMMENT_LINE	this = NaN = other 
if	TokenNameif	
(	TokenNameLPAREN	
oval	TokenNameIdentifier	 oval
!=	TokenNameNOT_EQUAL	
oval	TokenNameIdentifier	 oval
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// this is NaN <> other 	TokenNameCOMMENT_LINE	this is NaN <> other 
return	TokenNamereturn	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// other is NaN <> this 	TokenNameCOMMENT_LINE	other is NaN <> this 
return	TokenNamereturn	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
canonical	TokenNameIdentifier	 canonical
;	TokenNameSEMICOLON	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
canonical	TokenNameIdentifier	 canonical
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
)	TokenNameRPAREN	
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
"INF"	TokenNameStringLiteral	INF
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
)	TokenNameRPAREN	
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
"-INF"	TokenNameStringLiteral	-INF
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
"NaN"	TokenNameStringLiteral	NaN
;	TokenNameSEMICOLON	
// NOTE: we don't distinguish 0.0 from -0.0 	TokenNameCOMMENT_LINE	NOTE: we don't distinguish 0.0 from -0.0 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
"0.0E1"	TokenNameStringLiteral	0.0E1
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// REVISIT: use the java algorithm for now, because we 	TokenNameCOMMENT_LINE	REVISIT: use the java algorithm for now, because we 
// don't know what to output for 1.1d (which is no 	TokenNameCOMMENT_LINE	don't know what to output for 1.1d (which is no 
// actually 1.1) 	TokenNameCOMMENT_LINE	actually 1.1) 
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if it contains 'E', then it should be a valid schema 	TokenNameCOMMENT_LINE	if it contains 'E', then it should be a valid schema 
// canonical representation 	TokenNameCOMMENT_LINE	canonical representation 
if	TokenNameif	
(	TokenNameLPAREN	
canonical	TokenNameIdentifier	 canonical
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'E'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
canonical	TokenNameIdentifier	 canonical
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// at most 3 longer: E, -, 9 	TokenNameCOMMENT_LINE	at most 3 longer: E, -, 9 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
canonical	TokenNameIdentifier	 canonical
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// expected decimal point position 	TokenNameCOMMENT_LINE	expected decimal point position 
int	TokenNameint	
edp	TokenNameIdentifier	 edp
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
?	TokenNameQUESTION	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// for non-zero integer part 	TokenNameCOMMENT_LINE	for non-zero integer part 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
value	TokenNameIdentifier	 value
<=	TokenNameLESS_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// decimal point position 	TokenNameCOMMENT_LINE	decimal point position 
int	TokenNameint	
dp	TokenNameIdentifier	 dp
=	TokenNameEQUAL	
canonical	TokenNameIdentifier	 canonical
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// move the digits: ddd.d --> d.ddd 	TokenNameCOMMENT_LINE	move the digits: ddd.d --> d.ddd 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dp	TokenNameIdentifier	 dp
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
edp	TokenNameIdentifier	 edp
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
edp	TokenNameIdentifier	 edp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
// trim trailing zeros: d00.0 --> d.000 --> d. 	TokenNameCOMMENT_LINE	trim trailing zeros: d00.0 --> d.000 --> d. 
while	TokenNamewhile	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// add the last zero if necessary: d. --> d.0 	TokenNameCOMMENT_LINE	add the last zero if necessary: d. --> d.0 
if	TokenNameif	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// append E: d.dd --> d.ddE 	TokenNameCOMMENT_LINE	append E: d.dd --> d.ddE 
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'E'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
// how far we shifted the decimal point 	TokenNameCOMMENT_LINE	how far we shifted the decimal point 
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
dp	TokenNameIdentifier	 dp
-	TokenNameMINUS	
edp	TokenNameIdentifier	 edp
;	TokenNameSEMICOLON	
// append the exponent --> d.ddEd 	TokenNameCOMMENT_LINE	append the exponent --> d.ddEd 
// the exponent is at most 7 	TokenNameCOMMENT_LINE	the exponent is at most 7 
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
+	TokenNamePLUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// non-zero digit point 	TokenNameCOMMENT_LINE	non-zero digit point 
int	TokenNameint	
nzp	TokenNameIdentifier	 nzp
=	TokenNameEQUAL	
edp	TokenNameIdentifier	 edp
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// skip zeros: 0.003 	TokenNameCOMMENT_LINE	skip zeros: 0.003 
while	TokenNamewhile	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
nzp	TokenNameIdentifier	 nzp
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
nzp	TokenNameIdentifier	 nzp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// put the first non-zero digit to the left of '.' 	TokenNameCOMMENT_LINE	put the first non-zero digit to the left of '.' 
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
edp	TokenNameIdentifier	 edp
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
nzp	TokenNameIdentifier	 nzp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
edp	TokenNameIdentifier	 edp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
// move other digits (non-zero) to the right of '.' 	TokenNameCOMMENT_LINE	move other digits (non-zero) to the right of '.' 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
nzp	TokenNameIdentifier	 nzp
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
edp	TokenNameIdentifier	 edp
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// adjust the length 	TokenNameCOMMENT_LINE	adjust the length 
len	TokenNameIdentifier	 len
-=	TokenNameMINUS_EQUAL	
nzp	TokenNameIdentifier	 nzp
-	TokenNameMINUS	
edp	TokenNameIdentifier	 edp
;	TokenNameSEMICOLON	
// append 0 if nessary: 0.03 --> 3. --> 3.0 	TokenNameCOMMENT_LINE	append 0 if nessary: 0.03 --> 3. --> 3.0 
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
edp	TokenNameIdentifier	 edp
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
// append E-: d.dd --> d.ddE- 	TokenNameCOMMENT_LINE	append E-: d.dd --> d.ddE- 
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'E'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'-'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
// how far we shifted the decimal point 	TokenNameCOMMENT_LINE	how far we shifted the decimal point 
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
nzp	TokenNameIdentifier	 nzp
-	TokenNameMINUS	
edp	TokenNameIdentifier	 edp
;	TokenNameSEMICOLON	
// append the exponent --> d.ddEd 	TokenNameCOMMENT_LINE	append the exponent --> d.ddEd 
// the exponent is at most 3 	TokenNameCOMMENT_LINE	the exponent is at most 3 
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
+	TokenNamePLUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
canonical	TokenNameIdentifier	 canonical
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class DoubleDV 	TokenNameCOMMENT_LINE	class DoubleDV 
