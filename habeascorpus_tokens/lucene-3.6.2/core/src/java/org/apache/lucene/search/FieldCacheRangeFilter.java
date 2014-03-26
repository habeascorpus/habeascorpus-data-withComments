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
NumericUtils	TokenNameIdentifier	 Numeric Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
NumericField	TokenNameIdentifier	 Numeric Field
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
/** * A range filter built on top of a cached single term field (in {@link FieldCache}). * * <p>{@code FieldCacheRangeFilter} builds a single cache for the field the first time it is used. * Each subsequent {@code FieldCacheRangeFilter} on the same field then reuses this cache, * even if the range itself changes. * * <p>This means that {@code FieldCacheRangeFilter} is much faster (sometimes more than 100x as fast) * as building a {@link TermRangeFilter}, if using a {@link #newStringRange}. * However, if the range never changes it is slower (around 2x as slow) than building * a CachingWrapperFilter on top of a single {@link TermRangeFilter}. * * For numeric data types, this filter may be significantly faster than {@link NumericRangeFilter}. * Furthermore, it does not need the numeric values encoded by {@link NumericField}. But * it has the problem that it only works with exact one value/document (see below). * * <p>As with all {@link FieldCache} based functionality, {@code FieldCacheRangeFilter} is only valid for * fields which exact one term for each document (except for {@link #newStringRange} * where 0 terms are also allowed). Due to a restriction of {@link FieldCache}, for numeric ranges * all terms that do not have a numeric value, 0 is assumed. * * <p>Thus it works on dates, prices and other single value fields but will not work on * regular text fields. It is preferable to use a <code>NOT_ANALYZED</code> field to ensure that * there is only a single term. * * <p>This class does not have an constructor, use one of the static factory methods available, * that create a correct instance for different data types supported by {@link FieldCache}. */	TokenNameCOMMENT_JAVADOC	 A range filter built on top of a cached single term field (in {@link FieldCache}). * <p>{@code FieldCacheRangeFilter} builds a single cache for the field the first time it is used. Each subsequent {@code FieldCacheRangeFilter} on the same field then reuses this cache, even if the range itself changes. * <p>This means that {@code FieldCacheRangeFilter} is much faster (sometimes more than 100x as fast) as building a {@link TermRangeFilter}, if using a {@link #newStringRange}. However, if the range never changes it is slower (around 2x as slow) than building a CachingWrapperFilter on top of a single {@link TermRangeFilter}. * For numeric data types, this filter may be significantly faster than {@link NumericRangeFilter}. Furthermore, it does not need the numeric values encoded by {@link NumericField}. But it has the problem that it only works with exact one value/document (see below). * <p>As with all {@link FieldCache} based functionality, {@code FieldCacheRangeFilter} is only valid for fields which exact one term for each document (except for {@link #newStringRange} where 0 terms are also allowed). Due to a restriction of {@link FieldCache}, for numeric ranges all terms that do not have a numeric value, 0 is assumed. * <p>Thus it works on dates, prices and other single value fields but will not work on regular text fields. It is preferable to use a <code>NOT_ANALYZED</code> field to ensure that there is only a single term. * <p>This class does not have an constructor, use one of the static factory methods available, that create a correct instance for different data types supported by {@link FieldCache}. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
lowerVal	TokenNameIdentifier	 lower Val
;	TokenNameSEMICOLON	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
upperVal	TokenNameIdentifier	 upper Val
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
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
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lowerVal	TokenNameIdentifier	 lower Val
=	TokenNameEQUAL	
lowerVal	TokenNameIdentifier	 lower Val
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
upperVal	TokenNameIdentifier	 upper Val
=	TokenNameEQUAL	
upperVal	TokenNameIdentifier	 upper Val
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
}	TokenNameRBRACE	
/** This method is implemented for each data type */	TokenNameCOMMENT_JAVADOC	 This method is implemented for each data type 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Creates a string range filter using {@link FieldCache#getStringIndex}. This works with all * fields containing zero or one term in the field. The range can be half-open by setting one * of the values to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a string range filter using {@link FieldCache#getStringIndex}. This works with all fields containing zero or one term in the field. The range can be half-open by setting one of the values to <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
newStringRange	TokenNameIdentifier	 new String Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
final	TokenNamefinal	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
StringIndex	TokenNameIdentifier	 String Index
fcsi	TokenNameIdentifier	 fcsi
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getStringIndex	TokenNameIdentifier	 get String Index
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
lowerPoint	TokenNameIdentifier	 lower Point
=	TokenNameEQUAL	
fcsi	TokenNameIdentifier	 fcsi
.	TokenNameDOT	
binarySearchLookup	TokenNameIdentifier	 binary Search Lookup
(	TokenNameLPAREN	
lowerVal	TokenNameIdentifier	 lower Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
upperPoint	TokenNameIdentifier	 upper Point
=	TokenNameEQUAL	
fcsi	TokenNameIdentifier	 fcsi
.	TokenNameDOT	
binarySearchLookup	TokenNameIdentifier	 binary Search Lookup
(	TokenNameLPAREN	
upperVal	TokenNameIdentifier	 upper Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
,	TokenNameCOMMA	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
// Hints: 	TokenNameCOMMENT_LINE	Hints: 
// * binarySearchLookup returns 0, if value was null. 	TokenNameCOMMENT_LINE	* binarySearchLookup returns 0, if value was null. 
// * the value is <0 if no exact hit was found, the returned value 	TokenNameCOMMENT_LINE	* the value is <0 if no exact hit was found, the returned value 
// is (-(insertion point) - 1) 	TokenNameCOMMENT_LINE	is (-(insertion point) - 1) 
if	TokenNameif	
(	TokenNameLPAREN	
lowerPoint	TokenNameIdentifier	 lower Point
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
lowerVal	TokenNameIdentifier	 lower Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
includeLower	TokenNameIdentifier	 include Lower
&&	TokenNameAND_AND	
lowerPoint	TokenNameIdentifier	 lower Point
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
lowerPoint	TokenNameIdentifier	 lower Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lowerPoint	TokenNameIdentifier	 lower Point
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
lowerPoint	TokenNameIdentifier	 lower Point
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
lowerPoint	TokenNameIdentifier	 lower Point
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upperPoint	TokenNameIdentifier	 upper Point
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
upperVal	TokenNameIdentifier	 upper Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
includeUpper	TokenNameIdentifier	 include Upper
&&	TokenNameAND_AND	
upperPoint	TokenNameIdentifier	 upper Point
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
upperPoint	TokenNameIdentifier	 upper Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
upperPoint	TokenNameIdentifier	 upper Point
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
upperPoint	TokenNameIdentifier	 upper Point
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
-	TokenNameMINUS	
upperPoint	TokenNameIdentifier	 upper Point
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
>	TokenNameGREATER	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
assert	TokenNameassert	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheDocIdSet	TokenNameIdentifier	 Field Cache Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
matchDoc	TokenNameIdentifier	 match Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fcsi	TokenNameIdentifier	 fcsi
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
&&	TokenNameAND_AND	
fcsi	TokenNameIdentifier	 fcsi
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a numeric range filter using {@link FieldCache#getBytes(IndexReader,String)}. This works with all * byte fields containing exactly one numeric term in the field. The range can be half-open by setting one * of the values to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a numeric range filter using {@link FieldCache#getBytes(IndexReader,String)}. This works with all byte fields containing exactly one numeric term in the field. The range can be half-open by setting one of the values to <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Byte	TokenNameIdentifier	 Byte
>	TokenNameGREATER	
newByteRange	TokenNameIdentifier	 new Byte Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newByteRange	TokenNameIdentifier	 new Byte Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a numeric range filter using {@link FieldCache#getBytes(IndexReader,String,FieldCache.ByteParser)}. This works with all * byte fields containing exactly one numeric term in the field. The range can be half-open by setting one * of the values to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a numeric range filter using {@link FieldCache#getBytes(IndexReader,String,FieldCache.ByteParser)}. This works with all byte fields containing exactly one numeric term in the field. The range can be half-open by setting one of the values to <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Byte	TokenNameIdentifier	 Byte
>	TokenNameGREATER	
newByteRange	TokenNameIdentifier	 new Byte Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
ByteParser	TokenNameIdentifier	 Byte Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Byte	TokenNameIdentifier	 Byte
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
final	TokenNamefinal	
byte	TokenNamebyte	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
,	TokenNameCOMMA	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowerVal	TokenNameIdentifier	 lower Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lowerVal	TokenNameIdentifier	 lower Val
.	TokenNameDOT	
byteValue	TokenNameIdentifier	 byte Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeLower	TokenNameIdentifier	 include Lower
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
includeLower	TokenNameIdentifier	 include Lower
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upperVal	TokenNameIdentifier	 upper Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
upperVal	TokenNameIdentifier	 upper Val
.	TokenNameDOT	
byteValue	TokenNameIdentifier	 byte Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeUpper	TokenNameIdentifier	 include Upper
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
includeUpper	TokenNameIdentifier	 include Upper
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
>	TokenNameGREATER	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
(	TokenNameLPAREN	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
ByteParser	TokenNameIdentifier	 Byte Parser
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheDocIdSet	TokenNameIdentifier	 Field Cache Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
matchDoc	TokenNameIdentifier	 match Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
&&	TokenNameAND_AND	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a numeric range filter using {@link FieldCache#getShorts(IndexReader,String)}. This works with all * short fields containing exactly one numeric term in the field. The range can be half-open by setting one * of the values to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a numeric range filter using {@link FieldCache#getShorts(IndexReader,String)}. This works with all short fields containing exactly one numeric term in the field. The range can be half-open by setting one of the values to <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Short	TokenNameIdentifier	 Short
>	TokenNameGREATER	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Short	TokenNameIdentifier	 Short
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
Short	TokenNameIdentifier	 Short
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a numeric range filter using {@link FieldCache#getShorts(IndexReader,String,FieldCache.ShortParser)}. This works with all * short fields containing exactly one numeric term in the field. The range can be half-open by setting one * of the values to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a numeric range filter using {@link FieldCache#getShorts(IndexReader,String,FieldCache.ShortParser)}. This works with all short fields containing exactly one numeric term in the field. The range can be half-open by setting one of the values to <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Short	TokenNameIdentifier	 Short
>	TokenNameGREATER	
newShortRange	TokenNameIdentifier	 new Short Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
ShortParser	TokenNameIdentifier	 Short Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
Short	TokenNameIdentifier	 Short
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
Short	TokenNameIdentifier	 Short
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Short	TokenNameIdentifier	 Short
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
final	TokenNamefinal	
short	TokenNameshort	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
,	TokenNameCOMMA	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowerVal	TokenNameIdentifier	 lower Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lowerVal	TokenNameIdentifier	 lower Val
.	TokenNameDOT	
shortValue	TokenNameIdentifier	 short Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeLower	TokenNameIdentifier	 include Lower
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
includeLower	TokenNameIdentifier	 include Lower
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upperVal	TokenNameIdentifier	 upper Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
upperVal	TokenNameIdentifier	 upper Val
.	TokenNameDOT	
shortValue	TokenNameIdentifier	 short Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeUpper	TokenNameIdentifier	 include Upper
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
includeUpper	TokenNameIdentifier	 include Upper
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
>	TokenNameGREATER	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getShorts	TokenNameIdentifier	 get Shorts
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
(	TokenNameLPAREN	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
ShortParser	TokenNameIdentifier	 Short Parser
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheDocIdSet	TokenNameIdentifier	 Field Cache Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
matchDoc	TokenNameIdentifier	 match Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
&&	TokenNameAND_AND	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a numeric range filter using {@link FieldCache#getInts(IndexReader,String)}. This works with all * int fields containing exactly one numeric term in the field. The range can be half-open by setting one * of the values to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a numeric range filter using {@link FieldCache#getInts(IndexReader,String)}. This works with all int fields containing exactly one numeric term in the field. The range can be half-open by setting one of the values to <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a numeric range filter using {@link FieldCache#getInts(IndexReader,String,FieldCache.IntParser)}. This works with all * int fields containing exactly one numeric term in the field. The range can be half-open by setting one * of the values to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a numeric range filter using {@link FieldCache#getInts(IndexReader,String,FieldCache.IntParser)}. This works with all int fields containing exactly one numeric term in the field. The range can be half-open by setting one of the values to <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
IntParser	TokenNameIdentifier	 Int Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
final	TokenNamefinal	
int	TokenNameint	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
,	TokenNameCOMMA	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowerVal	TokenNameIdentifier	 lower Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lowerVal	TokenNameIdentifier	 lower Val
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeLower	TokenNameIdentifier	 include Lower
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
includeLower	TokenNameIdentifier	 include Lower
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upperVal	TokenNameIdentifier	 upper Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
upperVal	TokenNameIdentifier	 upper Val
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeUpper	TokenNameIdentifier	 include Upper
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
includeUpper	TokenNameIdentifier	 include Upper
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
>	TokenNameGREATER	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getInts	TokenNameIdentifier	 get Ints
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
(	TokenNameLPAREN	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
IntParser	TokenNameIdentifier	 Int Parser
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheDocIdSet	TokenNameIdentifier	 Field Cache Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
matchDoc	TokenNameIdentifier	 match Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
&&	TokenNameAND_AND	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a numeric range filter using {@link FieldCache#getLongs(IndexReader,String)}. This works with all * long fields containing exactly one numeric term in the field. The range can be half-open by setting one * of the values to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a numeric range filter using {@link FieldCache#getLongs(IndexReader,String)}. This works with all long fields containing exactly one numeric term in the field. The range can be half-open by setting one of the values to <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a numeric range filter using {@link FieldCache#getLongs(IndexReader,String,FieldCache.LongParser)}. This works with all * long fields containing exactly one numeric term in the field. The range can be half-open by setting one * of the values to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a numeric range filter using {@link FieldCache#getLongs(IndexReader,String,FieldCache.LongParser)}. This works with all long fields containing exactly one numeric term in the field. The range can be half-open by setting one of the values to <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
LongParser	TokenNameIdentifier	 Long Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
final	TokenNamefinal	
long	TokenNamelong	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
,	TokenNameCOMMA	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowerVal	TokenNameIdentifier	 lower Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lowerVal	TokenNameIdentifier	 lower Val
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeLower	TokenNameIdentifier	 include Lower
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
includeLower	TokenNameIdentifier	 include Lower
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upperVal	TokenNameIdentifier	 upper Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
upperVal	TokenNameIdentifier	 upper Val
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeUpper	TokenNameIdentifier	 include Upper
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
includeUpper	TokenNameIdentifier	 include Upper
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
>	TokenNameGREATER	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getLongs	TokenNameIdentifier	 get Longs
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
(	TokenNameLPAREN	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
LongParser	TokenNameIdentifier	 Long Parser
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheDocIdSet	TokenNameIdentifier	 Field Cache Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
matchDoc	TokenNameIdentifier	 match Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
&&	TokenNameAND_AND	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a numeric range filter using {@link FieldCache#getFloats(IndexReader,String)}. This works with all * float fields containing exactly one numeric term in the field. The range can be half-open by setting one * of the values to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a numeric range filter using {@link FieldCache#getFloats(IndexReader,String)}. This works with all float fields containing exactly one numeric term in the field. The range can be half-open by setting one of the values to <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a numeric range filter using {@link FieldCache#getFloats(IndexReader,String,FieldCache.FloatParser)}. This works with all * float fields containing exactly one numeric term in the field. The range can be half-open by setting one * of the values to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a numeric range filter using {@link FieldCache#getFloats(IndexReader,String,FieldCache.FloatParser)}. This works with all float fields containing exactly one numeric term in the field. The range can be half-open by setting one of the values to <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
FloatParser	TokenNameIdentifier	 Float Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
// we transform the floating point numbers to sortable integers 	TokenNameCOMMENT_LINE	we transform the floating point numbers to sortable integers 
// using NumericUtils to easier find the next bigger/lower value 	TokenNameCOMMENT_LINE	using NumericUtils to easier find the next bigger/lower value 
final	TokenNamefinal	
float	TokenNamefloat	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
,	TokenNameCOMMA	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowerVal	TokenNameIdentifier	 lower Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
lowerVal	TokenNameIdentifier	 lower Val
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeUpper	TokenNameIdentifier	 include Upper
&&	TokenNameAND_AND	
f	TokenNameIdentifier	 f
>	TokenNameGREATER	
0.0f	TokenNameFloatingPointLiteral	
&&	TokenNameAND_AND	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isInfinite	TokenNameIdentifier	 is Infinite
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
floatToSortableInt	TokenNameIdentifier	 float To Sortable Int
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
sortableIntToFloat	TokenNameIdentifier	 sortable Int To Float
(	TokenNameLPAREN	
includeLower	TokenNameIdentifier	 include Lower
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upperVal	TokenNameIdentifier	 upper Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
upperVal	TokenNameIdentifier	 upper Val
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeUpper	TokenNameIdentifier	 include Upper
&&	TokenNameAND_AND	
f	TokenNameIdentifier	 f
<	TokenNameLESS	
0.0f	TokenNameFloatingPointLiteral	
&&	TokenNameAND_AND	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isInfinite	TokenNameIdentifier	 is Infinite
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
floatToSortableInt	TokenNameIdentifier	 float To Sortable Int
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
sortableIntToFloat	TokenNameIdentifier	 sortable Int To Float
(	TokenNameLPAREN	
includeUpper	TokenNameIdentifier	 include Upper
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
>	TokenNameGREATER	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getFloats	TokenNameIdentifier	 get Floats
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
(	TokenNameLPAREN	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
FloatParser	TokenNameIdentifier	 Float Parser
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheDocIdSet	TokenNameIdentifier	 Field Cache Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
matchDoc	TokenNameIdentifier	 match Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
&&	TokenNameAND_AND	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a numeric range filter using {@link FieldCache#getDoubles(IndexReader,String)}. This works with all * double fields containing exactly one numeric term in the field. The range can be half-open by setting one * of the values to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a numeric range filter using {@link FieldCache#getDoubles(IndexReader,String)}. This works with all double fields containing exactly one numeric term in the field. The range can be half-open by setting one of the values to <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a numeric range filter using {@link FieldCache#getDoubles(IndexReader,String,FieldCache.DoubleParser)}. This works with all * double fields containing exactly one numeric term in the field. The range can be half-open by setting one * of the values to <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates a numeric range filter using {@link FieldCache#getDoubles(IndexReader,String,FieldCache.DoubleParser)}. This works with all double fields containing exactly one numeric term in the field. The range can be half-open by setting one of the values to <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DoubleParser	TokenNameIdentifier	 Double Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
lowerVal	TokenNameIdentifier	 lower Val
,	TokenNameCOMMA	
upperVal	TokenNameIdentifier	 upper Val
,	TokenNameCOMMA	
includeLower	TokenNameIdentifier	 include Lower
,	TokenNameCOMMA	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
// we transform the floating point numbers to sortable integers 	TokenNameCOMMENT_LINE	we transform the floating point numbers to sortable integers 
// using NumericUtils to easier find the next bigger/lower value 	TokenNameCOMMENT_LINE	using NumericUtils to easier find the next bigger/lower value 
final	TokenNamefinal	
double	TokenNamedouble	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
,	TokenNameCOMMA	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowerVal	TokenNameIdentifier	 lower Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
lowerVal	TokenNameIdentifier	 lower Val
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeUpper	TokenNameIdentifier	 include Upper
&&	TokenNameAND_AND	
f	TokenNameIdentifier	 f
>	TokenNameGREATER	
0.0	TokenNameDoubleLiteral	
&&	TokenNameAND_AND	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isInfinite	TokenNameIdentifier	 is Infinite
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
doubleToSortableLong	TokenNameIdentifier	 double To Sortable Long
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
sortableLongToDouble	TokenNameIdentifier	 sortable Long To Double
(	TokenNameLPAREN	
includeLower	TokenNameIdentifier	 include Lower
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upperVal	TokenNameIdentifier	 upper Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
upperVal	TokenNameIdentifier	 upper Val
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
includeUpper	TokenNameIdentifier	 include Upper
&&	TokenNameAND_AND	
f	TokenNameIdentifier	 f
<	TokenNameLESS	
0.0	TokenNameDoubleLiteral	
&&	TokenNameAND_AND	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isInfinite	TokenNameIdentifier	 is Infinite
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
doubleToSortableLong	TokenNameIdentifier	 double To Sortable Long
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
sortableLongToDouble	TokenNameIdentifier	 sortable Long To Double
(	TokenNameLPAREN	
includeUpper	TokenNameIdentifier	 include Upper
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
>	TokenNameGREATER	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getDoubles	TokenNameIdentifier	 get Doubles
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
(	TokenNameLPAREN	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DoubleParser	TokenNameIdentifier	 Double Parser
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheDocIdSet	TokenNameIdentifier	 Field Cache Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
matchDoc	TokenNameIdentifier	 match Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
inclusiveLowerPoint	TokenNameIdentifier	 inclusive Lower Point
&&	TokenNameAND_AND	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
inclusiveUpperPoint	TokenNameIdentifier	 inclusive Upper Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
includeLower	TokenNameIdentifier	 include Lower
?	TokenNameQUESTION	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lowerVal	TokenNameIdentifier	 lower Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"*"	TokenNameStringLiteral	*
:	TokenNameCOLON	
lowerVal	TokenNameIdentifier	 lower Val
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" TO "	TokenNameStringLiteral	 TO 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
upperVal	TokenNameIdentifier	 upper Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"*"	TokenNameStringLiteral	*
:	TokenNameCOLON	
upperVal	TokenNameIdentifier	 upper Val
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
includeUpper	TokenNameIdentifier	 include Upper
?	TokenNameQUESTION	
']'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldCacheRangeFilter	TokenNameIdentifier	 Field Cache Range Filter
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
includeLower	TokenNameIdentifier	 include Lower
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
includeLower	TokenNameIdentifier	 include Lower
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
includeUpper	TokenNameIdentifier	 include Upper
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
includeUpper	TokenNameIdentifier	 include Upper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
lowerVal	TokenNameIdentifier	 lower Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
lowerVal	TokenNameIdentifier	 lower Val
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
lowerVal	TokenNameIdentifier	 lower Val
)	TokenNameRPAREN	
:	TokenNameCOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
lowerVal	TokenNameIdentifier	 lower Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
upperVal	TokenNameIdentifier	 upper Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
upperVal	TokenNameIdentifier	 upper Val
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
upperVal	TokenNameIdentifier	 upper Val
)	TokenNameRPAREN	
:	TokenNameCOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
upperVal	TokenNameIdentifier	 upper Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
:	TokenNameCOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
lowerVal	TokenNameIdentifier	 lower Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
lowerVal	TokenNameIdentifier	 lower Val
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
550356204	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// rotate to distinguish lower from upper 	TokenNameCOMMENT_LINE	rotate to distinguish lower from upper 
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
upperVal	TokenNameIdentifier	 upper Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
upperVal	TokenNameIdentifier	 upper Val
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
-	TokenNameMINUS	
1674416163	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
-	TokenNameMINUS	
1572457324	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
includeLower	TokenNameIdentifier	 include Lower
?	TokenNameQUESTION	
1549299360	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
365038026	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
includeUpper	TokenNameIdentifier	 include Upper
?	TokenNameQUESTION	
1721088258	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1948649653	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
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
field	TokenNameIdentifier	 field
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
/** Returns the lower value of this range filter */	TokenNameCOMMENT_JAVADOC	 Returns the lower value of this range filter 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
getLowerVal	TokenNameIdentifier	 get Lower Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lowerVal	TokenNameIdentifier	 lower Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the upper value of this range filter */	TokenNameCOMMENT_JAVADOC	 Returns the upper value of this range filter 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
getUpperVal	TokenNameIdentifier	 get Upper Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
upperVal	TokenNameIdentifier	 upper Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the current numeric parser ({@code null} for {@code T} is {@code String}} */	TokenNameCOMMENT_JAVADOC	 Returns the current numeric parser ({@code null} for {@code T} is {@code String}} 
public	TokenNamepublic	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
