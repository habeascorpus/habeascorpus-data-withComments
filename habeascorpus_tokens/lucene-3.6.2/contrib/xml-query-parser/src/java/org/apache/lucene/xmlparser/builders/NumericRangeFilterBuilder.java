package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
builders	TokenNameIdentifier	 builders
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DocIdSet	TokenNameIdentifier	 Doc Id Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NumericUtils	TokenNameIdentifier	 Numeric Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
DOMUtils	TokenNameIdentifier	 DOM Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
FilterBuilder	TokenNameIdentifier	 Filter Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
ParserException	TokenNameIdentifier	 Parser Exception
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
/** * Creates a {@link NumericRangeFilter}. The table below specifies the required * attributes and the defaults if optional attributes are omitted. For more * detail on what each of the attributes actually do, consult the documentation * for {@link NumericRangeFilter}: * <table> * <tr> * <th>Attribute name</th> * <th>Values</th> * <th>Required</th> * <th>Default</th> * </tr> * <tr> * <td>fieldName</td> * <td>String</td> * <td>Yes</td> * <td>N/A</td> * </tr> * <tr> * <td>lowerTerm</td> * <td>Specified by <tt>type</tt></td> * <td>Yes</td> * <td>N/A</td> * </tr> * <tr> * <td>upperTerm</td> * <td>Specified by <tt>type</tt></td> * <td>Yes</td> * <td>N/A</td> * </tr> * <tr> * <td>type</td> * <td>int, long, float, double</td> * <td>No</td> * <td>int</td> * </tr> * <tr> * <td>includeLower</td> * <td>true, false</td> * <td>No</td> * <td>true</td> * </tr> * <tr> * <td>includeUpper</td> * <td>true, false</td> * <td>No</td> * <td>true</td> * </tr> * <tr> * <td>precisionStep</td> * <td>Integer</td> * <td>No</td> * <td>4</td> * </tr> * </table> * <p> * If an error occurs parsing the supplied <tt>lowerTerm</tt> or * <tt>upperTerm</tt> into the numeric type specified by <tt>type</tt>, then the * error will be silently ignored and the resulting filter will not match any * documents. */	TokenNameCOMMENT_JAVADOC	 Creates a {@link NumericRangeFilter}. The table below specifies the required attributes and the defaults if optional attributes are omitted. For more detail on what each of the attributes actually do, consult the documentation for {@link NumericRangeFilter}: <table> <tr> <th>Attribute name</th> <th>Values</th> <th>Required</th> <th>Default</th> </tr> <tr> <td>fieldName</td> <td>String</td> <td>Yes</td> <td>N/A</td> </tr> <tr> <td>lowerTerm</td> <td>Specified by <tt>type</tt></td> <td>Yes</td> <td>N/A</td> </tr> <tr> <td>upperTerm</td> <td>Specified by <tt>type</tt></td> <td>Yes</td> <td>N/A</td> </tr> <tr> <td>type</td> <td>int, long, float, double</td> <td>No</td> <td>int</td> </tr> <tr> <td>includeLower</td> <td>true, false</td> <td>No</td> <td>true</td> </tr> <tr> <td>includeUpper</td> <td>true, false</td> <td>No</td> <td>true</td> </tr> <tr> <td>precisionStep</td> <td>Integer</td> <td>No</td> <td>4</td> </tr> </table> <p> If an error occurs parsing the supplied <tt>lowerTerm</tt> or <tt>upperTerm</tt> into the numeric type specified by <tt>type</tt>, then the error will be silently ignored and the resulting filter will not match any documents. 
public	TokenNamepublic	
class	TokenNameclass	
NumericRangeFilterBuilder	TokenNameIdentifier	 Numeric Range Filter Builder
implements	TokenNameimplements	
FilterBuilder	TokenNameIdentifier	 Filter Builder
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
NoMatchFilter	TokenNameIdentifier	 No Match Filter
NO_MATCH_FILTER	TokenNameIdentifier	 NO  MATCH  FILTER
=	TokenNameEQUAL	
new	TokenNamenew	
NoMatchFilter	TokenNameIdentifier	 No Match Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
strictMode	TokenNameIdentifier	 strict Mode
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Specifies how this {@link NumericRangeFilterBuilder} will handle errors. * <p> * If this is set to true, {@link #getFilter(Element)} will throw a * {@link ParserException} if it is unable to parse the lowerTerm or upperTerm * into the appropriate numeric type. If this is set to false, then this * exception will be silently ignored and the resulting filter will not match * any documents. * <p> * Defaults to false. * * @param strictMode */	TokenNameCOMMENT_JAVADOC	 Specifies how this {@link NumericRangeFilterBuilder} will handle errors. <p> If this is set to true, {@link #getFilter(Element)} will throw a {@link ParserException} if it is unable to parse the lowerTerm or upperTerm into the appropriate numeric type. If this is set to false, then this exception will be silently ignored and the resulting filter will not match any documents. <p> Defaults to false. * @param strictMode 
public	TokenNamepublic	
void	TokenNamevoid	
setStrictMode	TokenNameIdentifier	 set Strict Mode
(	TokenNameLPAREN	
boolean	TokenNameboolean	
strictMode	TokenNameIdentifier	 strict Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
strictMode	TokenNameIdentifier	 strict Mode
=	TokenNameEQUAL	
strictMode	TokenNameIdentifier	 strict Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttributeWithInheritanceOrFail	TokenNameIdentifier	 get Attribute With Inheritance Or Fail
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"fieldName"	TokenNameStringLiteral	fieldName
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lowerTerm	TokenNameIdentifier	 lower Term
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttributeOrFail	TokenNameIdentifier	 get Attribute Or Fail
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"lowerTerm"	TokenNameStringLiteral	lowerTerm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
upperTerm	TokenNameIdentifier	 upper Term
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttributeOrFail	TokenNameIdentifier	 get Attribute Or Fail
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"upperTerm"	TokenNameStringLiteral	upperTerm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"includeLower"	TokenNameStringLiteral	includeLower
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
upperInclusive	TokenNameIdentifier	 upper Inclusive
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"includeUpper"	TokenNameStringLiteral	includeUpper
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"precisionStep"	TokenNameStringLiteral	precisionStep
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
PRECISION_STEP_DEFAULT	TokenNameIdentifier	 PRECISION  STEP  DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
"int"	TokenNameStringLiteral	int
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"int"	TokenNameStringLiteral	int
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
lowerTerm	TokenNameIdentifier	 lower Term
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
upperTerm	TokenNameIdentifier	 upper Term
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
upperInclusive	TokenNameIdentifier	 upper Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"long"	TokenNameStringLiteral	long
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
lowerTerm	TokenNameIdentifier	 lower Term
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
upperTerm	TokenNameIdentifier	 upper Term
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
upperInclusive	TokenNameIdentifier	 upper Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"double"	TokenNameStringLiteral	double
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
.	TokenNameDOT	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
lowerTerm	TokenNameIdentifier	 lower Term
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
upperTerm	TokenNameIdentifier	 upper Term
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
upperInclusive	TokenNameIdentifier	 upper Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"float"	TokenNameStringLiteral	float
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
.	TokenNameDOT	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
lowerTerm	TokenNameIdentifier	 lower Term
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
upperTerm	TokenNameIdentifier	 upper Term
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
upperInclusive	TokenNameIdentifier	 upper Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserException	TokenNameIdentifier	 Parser Exception
(	TokenNameLPAREN	
"type attribute must be one of: [long, int, double, float]"	TokenNameStringLiteral	type attribute must be one of: [long, int, double, float]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
strictMode	TokenNameIdentifier	 strict Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserException	TokenNameIdentifier	 Parser Exception
(	TokenNameLPAREN	
"Could not parse lowerTerm or upperTerm into a number"	TokenNameStringLiteral	Could not parse lowerTerm or upperTerm into a number
,	TokenNameCOMMA	
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NO_MATCH_FILTER	TokenNameIdentifier	 NO  MATCH  FILTER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
NoMatchFilter	TokenNameIdentifier	 No Match Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
