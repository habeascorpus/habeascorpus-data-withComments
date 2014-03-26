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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Collator	TokenNameIdentifier	 Collator
;	TokenNameSEMICOLON	
/** * A Filter that restricts search results to a range of term * values in a given field. * * <p>This filter matches the documents looking for terms that fall into the * supplied range according to {@link * String#compareTo(String)}, unless a <code>Collator</code> is provided. It is not intended * for numerical ranges; use {@link NumericRangeFilter} instead. * * <p>If you construct a large number of range filters with different ranges but on the * same field, {@link FieldCacheRangeFilter} may have significantly better performance. * @since 2.9 */	TokenNameCOMMENT_JAVADOC	 A Filter that restricts search results to a range of term values in a given field. * <p>This filter matches the documents looking for terms that fall into the supplied range according to {@link String#compareTo(String)}, unless a <code>Collator</code> is provided. It is not intended for numerical ranges; use {@link NumericRangeFilter} instead. * <p>If you construct a large number of range filters with different ranges but on the same field, {@link FieldCacheRangeFilter} may have significantly better performance. @since 2.9 
public	TokenNamepublic	
class	TokenNameclass	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
extends	TokenNameextends	
MultiTermQueryWrapperFilter	TokenNameIdentifier	 Multi Term Query Wrapper Filter
<	TokenNameLESS	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * @param fieldName The field this range applies to * @param lowerTerm The lower bound on this range * @param upperTerm The upper bound on this range * @param includeLower Does this range include the lower bound? * @param includeUpper Does this range include the upper bound? * @throws IllegalArgumentException if both terms are null or if * lowerTerm is null and includeLower is true (similar for upperTerm * and includeUpper) */	TokenNameCOMMENT_JAVADOC	 @param fieldName The field this range applies to @param lowerTerm The lower bound on this range @param upperTerm The upper bound on this range @param includeLower Does this range include the lower bound? @param includeUpper Does this range include the upper bound? @throws IllegalArgumentException if both terms are null or if lowerTerm is null and includeLower is true (similar for upperTerm and includeUpper) 
public	TokenNamepublic	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
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
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
lowerTerm	TokenNameIdentifier	 lower Term
,	TokenNameCOMMA	
upperTerm	TokenNameIdentifier	 upper Term
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <strong>WARNING:</strong> Using this constructor and supplying a non-null * value in the <code>collator</code> parameter will cause every single * index Term in the Field referenced by lowerTerm and/or upperTerm to be * examined. Depending on the number of index Terms in this Field, the * operation could be very slow. * * @param lowerTerm The lower bound on this range * @param upperTerm The upper bound on this range * @param includeLower Does this range include the lower bound? * @param includeUpper Does this range include the upper bound? * @param collator The collator to use when determining range inclusion; set * to null to use Unicode code point ordering instead of collation. * @throws IllegalArgumentException if both terms are null or if * lowerTerm is null and includeLower is true (similar for upperTerm * and includeUpper) */	TokenNameCOMMENT_JAVADOC	 <strong>WARNING:</strong> Using this constructor and supplying a non-null value in the <code>collator</code> parameter will cause every single index Term in the Field referenced by lowerTerm and/or upperTerm to be examined. Depending on the number of index Terms in this Field, the operation could be very slow. * @param lowerTerm The lower bound on this range @param upperTerm The upper bound on this range @param includeLower Does this range include the lower bound? @param includeUpper Does this range include the upper bound? @param collator The collator to use when determining range inclusion; set to null to use Unicode code point ordering instead of collation. @throws IllegalArgumentException if both terms are null or if lowerTerm is null and includeLower is true (similar for upperTerm and includeUpper) 
public	TokenNamepublic	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
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
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
TermRangeQuery	TokenNameIdentifier	 Term Range Query
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a filter for field <code>fieldName</code> matching * less than or equal to <code>upperTerm</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs a filter for field <code>fieldName</code> matching less than or equal to <code>upperTerm</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
Less	TokenNameIdentifier	 Less
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
upperTerm	TokenNameIdentifier	 upper Term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
upperTerm	TokenNameIdentifier	 upper Term
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a filter for field <code>fieldName</code> matching * greater than or equal to <code>lowerTerm</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs a filter for field <code>fieldName</code> matching greater than or equal to <code>lowerTerm</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
More	TokenNameIdentifier	 More
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lowerTerm	TokenNameIdentifier	 lower Term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
lowerTerm	TokenNameIdentifier	 lower Term
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the field name for this filter */	TokenNameCOMMENT_JAVADOC	 Returns the field name for this filter 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the lower value of this range filter */	TokenNameCOMMENT_JAVADOC	 Returns the lower value of this range filter 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLowerTerm	TokenNameIdentifier	 get Lower Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getLowerTerm	TokenNameIdentifier	 get Lower Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the upper value of this range filter */	TokenNameCOMMENT_JAVADOC	 Returns the upper value of this range filter 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUpperTerm	TokenNameIdentifier	 get Upper Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getUpperTerm	TokenNameIdentifier	 get Upper Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
query	TokenNameIdentifier	 query
.	TokenNameDOT	
includesLower	TokenNameIdentifier	 includes Lower
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
query	TokenNameIdentifier	 query
.	TokenNameDOT	
includesUpper	TokenNameIdentifier	 includes Upper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getCollator	TokenNameIdentifier	 get Collator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
