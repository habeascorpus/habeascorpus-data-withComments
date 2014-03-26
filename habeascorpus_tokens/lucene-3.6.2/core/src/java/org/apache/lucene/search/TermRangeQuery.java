package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Collator	TokenNameIdentifier	 Collator
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ToStringUtils	TokenNameIdentifier	 To String Utils
;	TokenNameSEMICOLON	
/** * A Query that matches documents within an range of terms. * * <p>This query matches the documents looking for terms that fall into the * supplied range according to {@link * String#compareTo(String)}, unless a <code>Collator</code> is provided. It is not intended * for numerical ranges; use {@link NumericRangeQuery} instead. * * <p>This query uses the {@link * MultiTermQuery#CONSTANT_SCORE_AUTO_REWRITE_DEFAULT} * rewrite method. * @since 2.9 */	TokenNameCOMMENT_JAVADOC	 A Query that matches documents within an range of terms. * <p>This query matches the documents looking for terms that fall into the supplied range according to {@link String#compareTo(String)}, unless a <code>Collator</code> is provided. It is not intended for numerical ranges; use {@link NumericRangeQuery} instead. * <p>This query uses the {@link MultiTermQuery#CONSTANT_SCORE_AUTO_REWRITE_DEFAULT} rewrite method. @since 2.9 
public	TokenNamepublic	
class	TokenNameclass	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
extends	TokenNameextends	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
lowerTerm	TokenNameIdentifier	 lower Term
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
upperTerm	TokenNameIdentifier	 upper Term
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
;	TokenNameSEMICOLON	
/** * Constructs a query selecting all terms greater/equal than <code>lowerTerm</code> * but less/equal than <code>upperTerm</code>. * * <p> * If an endpoint is null, it is said * to be "open". Either or both endpoints may be open. Open endpoints may not * be exclusive (you can't select all but the first or last term without * explicitly specifying the term to exclude.) * * @param field The field that holds both lower and upper terms. * @param lowerTerm * The term text at the lower end of the range * @param upperTerm * The term text at the upper end of the range * @param includeLower * If true, the <code>lowerTerm</code> is * included in the range. * @param includeUpper * If true, the <code>upperTerm</code> is * included in the range. */	TokenNameCOMMENT_JAVADOC	 Constructs a query selecting all terms greater/equal than <code>lowerTerm</code> but less/equal than <code>upperTerm</code>. * <p> If an endpoint is null, it is said to be "open". Either or both endpoints may be open. Open endpoints may not be exclusive (you can't select all but the first or last term without explicitly specifying the term to exclude.) * @param field The field that holds both lower and upper terms. @param lowerTerm The term text at the lower end of the range @param upperTerm The term text at the upper end of the range @param includeLower If true, the <code>lowerTerm</code> is included in the range. @param includeUpper If true, the <code>upperTerm</code> is included in the range. 
public	TokenNamepublic	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lowerTerm	TokenNameIdentifier	 lower Term
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
upperTerm	TokenNameIdentifier	 upper Term
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
lowerTerm	TokenNameIdentifier	 lower Term
,	TokenNameCOMMA	
upperTerm	TokenNameIdentifier	 upper Term
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructs a query selecting all terms greater/equal than * <code>lowerTerm</code> but less/equal than <code>upperTerm</code>. * <p> * If an endpoint is null, it is said * to be "open". Either or both endpoints may be open. Open endpoints may not * be exclusive (you can't select all but the first or last term without * explicitly specifying the term to exclude.) * <p> * If <code>collator</code> is not null, it will be used to decide whether * index terms are within the given range, rather than using the Unicode code * point order in which index terms are stored. * <p> * <strong>WARNING:</strong> Using this constructor and supplying a non-null * value in the <code>collator</code> parameter will cause every single * index Term in the Field referenced by lowerTerm and/or upperTerm to be * examined. Depending on the number of index Terms in this Field, the * operation could be very slow. * * @param lowerTerm The Term text at the lower end of the range * @param upperTerm The Term text at the upper end of the range * @param includeLower * If true, the <code>lowerTerm</code> is * included in the range. * @param includeUpper * If true, the <code>upperTerm</code> is * included in the range. * @param collator The collator to use to collate index Terms, to determine * their membership in the range bounded by <code>lowerTerm</code> and * <code>upperTerm</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs a query selecting all terms greater/equal than <code>lowerTerm</code> but less/equal than <code>upperTerm</code>. <p> If an endpoint is null, it is said to be "open". Either or both endpoints may be open. Open endpoints may not be exclusive (you can't select all but the first or last term without explicitly specifying the term to exclude.) <p> If <code>collator</code> is not null, it will be used to decide whether index terms are within the given range, rather than using the Unicode code point order in which index terms are stored. <p> <strong>WARNING:</strong> Using this constructor and supplying a non-null value in the <code>collator</code> parameter will cause every single index Term in the Field referenced by lowerTerm and/or upperTerm to be examined. Depending on the number of index Terms in this Field, the operation could be very slow. * @param lowerTerm The Term text at the lower end of the range @param upperTerm The Term text at the upper end of the range @param includeLower If true, the <code>lowerTerm</code> is included in the range. @param includeUpper If true, the <code>upperTerm</code> is included in the range. @param collator The collator to use to collate index Terms, to determine their membership in the range bounded by <code>lowerTerm</code> and <code>upperTerm</code>. 
public	TokenNamepublic	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lowerTerm	TokenNameIdentifier	 lower Term
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
upperTerm	TokenNameIdentifier	 upper Term
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
,	TokenNameCOMMA	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lowerTerm	TokenNameIdentifier	 lower Term
=	TokenNameEQUAL	
lowerTerm	TokenNameIdentifier	 lower Term
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
upperTerm	TokenNameIdentifier	 upper Term
=	TokenNameEQUAL	
upperTerm	TokenNameIdentifier	 upper Term
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
includeLower	TokenNameIdentifier	 include Lower
=	TokenNameEQUAL	
includeLower	TokenNameIdentifier	 include Lower
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
includeUpper	TokenNameIdentifier	 include Upper
=	TokenNameEQUAL	
includeUpper	TokenNameIdentifier	 include Upper
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the field name for this query */	TokenNameCOMMENT_JAVADOC	 Returns the field name for this query 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the lower value of this range query */	TokenNameCOMMENT_JAVADOC	 Returns the lower value of this range query 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLowerTerm	TokenNameIdentifier	 get Lower Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lowerTerm	TokenNameIdentifier	 lower Term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the upper value of this range query */	TokenNameCOMMENT_JAVADOC	 Returns the upper value of this range query 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUpperTerm	TokenNameIdentifier	 get Upper Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
upperTerm	TokenNameIdentifier	 upper Term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns <code>true</code> if the lower endpoint is inclusive */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the lower endpoint is inclusive 
public	TokenNamepublic	
boolean	TokenNameboolean	
includesLower	TokenNameIdentifier	 includes Lower
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
includeLower	TokenNameIdentifier	 include Lower
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns <code>true</code> if the upper endpoint is inclusive */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the upper endpoint is inclusive 
public	TokenNamepublic	
boolean	TokenNameboolean	
includesUpper	TokenNameIdentifier	 includes Upper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
includeUpper	TokenNameIdentifier	 include Upper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the collator used to determine range inclusion, if any. */	TokenNameCOMMENT_JAVADOC	 Returns the collator used to determine range inclusion, if any. 
public	TokenNamepublic	
Collator	TokenNameIdentifier	 Collator
getCollator	TokenNameIdentifier	 get Collator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
FilteredTermEnum	TokenNameIdentifier	 Filtered Term Enum
getEnum	TokenNameIdentifier	 get Enum
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermRangeTermEnum	TokenNameIdentifier	 Term Range Term Enum
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
lowerTerm	TokenNameIdentifier	 lower Term
,	TokenNameCOMMA	
upperTerm	TokenNameIdentifier	 upper Term
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
,	TokenNameCOMMA	
collator	TokenNameIdentifier	 collator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Prints a user-readable version of this query. */	TokenNameCOMMENT_JAVADOC	 Prints a user-readable version of this query. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
includeLower	TokenNameIdentifier	 include Lower
?	TokenNameQUESTION	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lowerTerm	TokenNameIdentifier	 lower Term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
lowerTerm	TokenNameIdentifier	 lower Term
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"\*"	TokenNameStringLiteral	\*
:	TokenNameCOLON	
lowerTerm	TokenNameIdentifier	 lower Term
)	TokenNameRPAREN	
:	TokenNameCOLON	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" TO "	TokenNameStringLiteral	 TO 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
upperTerm	TokenNameIdentifier	 upper Term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
upperTerm	TokenNameIdentifier	 upper Term
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"\*"	TokenNameStringLiteral	\*
:	TokenNameCOLON	
upperTerm	TokenNameIdentifier	 upper Term
)	TokenNameRPAREN	
:	TokenNameCOLON	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
includeUpper	TokenNameIdentifier	 include Upper
?	TokenNameQUESTION	
']'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ToStringUtils	TokenNameIdentifier	 To String Utils
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
collator	TokenNameIdentifier	 collator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
includeLower	TokenNameIdentifier	 include Lower
?	TokenNameQUESTION	
1231	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
includeUpper	TokenNameIdentifier	 include Upper
?	TokenNameQUESTION	
1231	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lowerTerm	TokenNameIdentifier	 lower Term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
lowerTerm	TokenNameIdentifier	 lower Term
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
upperTerm	TokenNameIdentifier	 upper Term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
upperTerm	TokenNameIdentifier	 upper Term
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
super	TokenNamesuper	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
collator	TokenNameIdentifier	 collator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
collator	TokenNameIdentifier	 collator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
collator	TokenNameIdentifier	 collator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
field	TokenNameIdentifier	 field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
includeLower	TokenNameIdentifier	 include Lower
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
includeLower	TokenNameIdentifier	 include Lower
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
includeUpper	TokenNameIdentifier	 include Upper
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowerTerm	TokenNameIdentifier	 lower Term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
lowerTerm	TokenNameIdentifier	 lower Term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
lowerTerm	TokenNameIdentifier	 lower Term
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
lowerTerm	TokenNameIdentifier	 lower Term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upperTerm	TokenNameIdentifier	 upper Term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
upperTerm	TokenNameIdentifier	 upper Term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
upperTerm	TokenNameIdentifier	 upper Term
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
upperTerm	TokenNameIdentifier	 upper Term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
