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
/** * All primitive types plus ID/IDREF/ENTITY/INTEGER are derived from this abstract * class. It provides extra information XSSimpleTypeDecl requires from each * type: allowed facets, converting String to actual value, check equality, * comparison, etc. * * @xerces.internal * * @author Neeraj Bajaj, Sun Microsystems, inc. * @author Sandy Gao, IBM * * @version $Id: TypeValidator.java 446745 2006-09-15 21:43:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 All primitive types plus ID/IDREF/ENTITY/INTEGER are derived from this abstract class. It provides extra information XSSimpleTypeDecl requires from each type: allowed facets, converting String to actual value, check equality, comparison, etc. * @xerces.internal * @author Neeraj Bajaj, Sun Microsystems, inc. @author Sandy Gao, IBM * @version $Id: TypeValidator.java 446745 2006-09-15 21:43:58Z mrglavas $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TypeValidator	TokenNameIdentifier	 Type Validator
{	TokenNameLBRACE	
// which facets are allowed for this type 	TokenNameCOMMENT_LINE	which facets are allowed for this type 
public	TokenNamepublic	
abstract	TokenNameabstract	
short	TokenNameshort	
getAllowedFacets	TokenNameIdentifier	 get Allowed Facets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// convert a string to an actual value. for example, 	TokenNameCOMMENT_LINE	convert a string to an actual value. for example, 
// for number types (decimal, double, float, and types derived from them), 	TokenNameCOMMENT_LINE	for number types (decimal, double, float, and types derived from them), 
// get the BigDecimal, Double, Flout object. 	TokenNameCOMMENT_LINE	get the BigDecimal, Double, Flout object. 
// for some types (string and derived), they just return the string itself 	TokenNameCOMMENT_LINE	for some types (string and derived), they just return the string itself 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
// for ID/IDREF/ENTITY types, do some extra checking after the value is 	TokenNameCOMMENT_LINE	for ID/IDREF/ENTITY types, do some extra checking after the value is 
// checked to be valid with respect to both lexical representation and 	TokenNameCOMMENT_LINE	checked to be valid with respect to both lexical representation and 
// facets 	TokenNameCOMMENT_LINE	facets 
public	TokenNamepublic	
void	TokenNamevoid	
checkExtraRules	TokenNameIdentifier	 check Extra Rules
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ValidationContext	TokenNameIdentifier	 Validation Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// the following methods might not be supported by every DV. 	TokenNameCOMMENT_LINE	the following methods might not be supported by every DV. 
// but XSSimpleTypeDecl should know which type supports which methods, 	TokenNameCOMMENT_LINE	but XSSimpleTypeDecl should know which type supports which methods, 
// and it's an *internal* error if a method is called on a DV that 	TokenNameCOMMENT_LINE	and it's an *internal* error if a method is called on a DV that 
// doesn't support it. 	TokenNameCOMMENT_LINE	doesn't support it. 
//order constants 	TokenNameCOMMENT_LINE	order constants 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
EQUAL	TokenNameIdentifier	 EQUAL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
INDETERMINATE	TokenNameIdentifier	 INDETERMINATE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// where there is distinction between identity and equality, this method 	TokenNameCOMMENT_LINE	where there is distinction between identity and equality, this method 
// will be overwritten 	TokenNameCOMMENT_LINE	will be overwritten 
// checks whether the two values are identical; for ex, this distinguishes 	TokenNameCOMMENT_LINE	checks whether the two values are identical; for ex, this distinguishes 
// -0.0 from 0.0 	TokenNameCOMMENT_LINE	-0.0 from 0.0 
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
return	TokenNamereturn	
value1	TokenNameIdentifier	 value1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
value2	TokenNameIdentifier	 value2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check the order relation between the two values 	TokenNameCOMMENT_LINE	check the order relation between the two values 
// the parameters are in compiled form (from getActualValue) 	TokenNameCOMMENT_LINE	the parameters are in compiled form (from getActualValue) 
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
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get the length of the value 	TokenNameCOMMENT_LINE	get the length of the value 
// the parameters are in compiled form (from getActualValue) 	TokenNameCOMMENT_LINE	the parameters are in compiled form (from getActualValue) 
public	TokenNamepublic	
int	TokenNameint	
getDataLength	TokenNameIdentifier	 get Data Length
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get the number of digits of the value 	TokenNameCOMMENT_LINE	get the number of digits of the value 
// the parameters are in compiled form (from getActualValue) 	TokenNameCOMMENT_LINE	the parameters are in compiled form (from getActualValue) 
public	TokenNamepublic	
int	TokenNameint	
getTotalDigits	TokenNameIdentifier	 get Total Digits
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get the number of fraction digits of the value 	TokenNameCOMMENT_LINE	get the number of fraction digits of the value 
// the parameters are in compiled form (from getActualValue) 	TokenNameCOMMENT_LINE	the parameters are in compiled form (from getActualValue) 
public	TokenNamepublic	
int	TokenNameint	
getFractionDigits	TokenNameIdentifier	 get Fraction Digits
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check whether the character is in the range 0x30 ~ 0x39 	TokenNameCOMMENT_LINE	check whether the character is in the range 0x30 ~ 0x39 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if the character is in the range 0x30 ~ 0x39, return its int value (0~9), 	TokenNameCOMMENT_LINE	if the character is in the range 0x30 ~ 0x39, return its int value (0~9), 
// otherwise, return -1 	TokenNameCOMMENT_LINE	otherwise, return -1 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
getDigit	TokenNameIdentifier	 get Digit
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// interface TypeValidator 	TokenNameCOMMENT_LINE	interface TypeValidator 
