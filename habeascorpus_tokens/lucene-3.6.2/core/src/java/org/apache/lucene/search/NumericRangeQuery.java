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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
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
.	TokenNameDOT	
DataType	TokenNameIdentifier	 Data Type
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ToStringUtils	TokenNameIdentifier	 To String Utils
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
StringHelper	TokenNameIdentifier	 String Helper
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
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
TermEnum	TokenNameIdentifier	 Term Enum
;	TokenNameSEMICOLON	
/** * <p>A {@link Query} that matches numeric values within a * specified range. To use this, you must first index the * numeric values using {@link NumericField} (expert: {@link * NumericTokenStream}). If your terms are instead textual, * you should use {@link TermRangeQuery}. {@link * NumericRangeFilter} is the filter equivalent of this * query.</p> * * <p>You create a new NumericRangeQuery with the static * factory methods, eg: * * <pre> * Query q = NumericRangeQuery.newFloatRange("weight", 0.03f, 0.10f, true, true); * </pre> * * matches all documents whose float valued "weight" field * ranges from 0.03 to 0.10, inclusive. * * <p>The performance of NumericRangeQuery is much better * than the corresponding {@link TermRangeQuery} because the * number of terms that must be searched is usually far * fewer, thanks to trie indexing, described below.</p> * * <p>You can optionally specify a <a * href="#precisionStepDesc"><code>precisionStep</code></a> * when creating this query. This is necessary if you've * changed this configuration from its default (4) during * indexing. Lower values consume more disk space but speed * up searching. Suitable values are between <b>1</b> and * <b>8</b>. A good starting point to test is <b>4</b>, * which is the default value for all <code>Numeric*</code> * classes. See <a href="#precisionStepDesc">below</a> for * details. * * <p>This query defaults to {@linkplain * MultiTermQuery#CONSTANT_SCORE_AUTO_REWRITE_DEFAULT} for * 32 bit (int/float) ranges with precisionStep &le;8 and 64 * bit (long/double) ranges with precisionStep &le;6. * Otherwise it uses {@linkplain * MultiTermQuery#CONSTANT_SCORE_FILTER_REWRITE} as the * number of terms is likely to be high. With precision * steps of &le;4, this query can be run with one of the * BooleanQuery rewrite methods without changing * BooleanQuery's default max clause count. * * <br><h3>How it works</h3> * * <p>See the publication about <a target="_blank" href="http://www.panfmp.org">panFMP</a>, * where this algorithm was described (referred to as <code>TrieRangeQuery</code>): * * <blockquote><strong>Schindler, U, Diepenbroek, M</strong>, 2008. * <em>Generic XML-based Framework for Metadata Portals.</em> * Computers &amp; Geosciences 34 (12), 1947-1955. * <a href="http://dx.doi.org/10.1016/j.cageo.2008.02.023" * target="_blank">doi:10.1016/j.cageo.2008.02.023</a></blockquote> * * <p><em>A quote from this paper:</em> Because Apache Lucene is a full-text * search engine and not a conventional database, it cannot handle numerical ranges * (e.g., field value is inside user defined bounds, even dates are numerical values). * We have developed an extension to Apache Lucene that stores * the numerical values in a special string-encoded format with variable precision * (all numerical values like doubles, longs, floats, and ints are converted to * lexicographic sortable string representations and stored with different precisions * (for a more detailed description of how the values are stored, * see {@link NumericUtils}). A range is then divided recursively into multiple intervals for searching: * The center of the range is searched only with the lowest possible precision in the <em>trie</em>, * while the boundaries are matched more exactly. This reduces the number of terms dramatically.</p> * * <p>For the variant that stores long values in 8 different precisions (each reduced by 8 bits) that * uses a lowest precision of 1 byte, the index contains only a maximum of 256 distinct values in the * lowest precision. Overall, a range could consist of a theoretical maximum of * <code>7*255*2 + 255 = 3825</code> distinct terms (when there is a term for every distinct value of an * 8-byte-number in the index and the range covers almost all of them; a maximum of 255 distinct values is used * because it would always be possible to reduce the full 256 values to one term with degraded precision). * In practice, we have seen up to 300 terms in most cases (index with 500,000 metadata records * and a uniform value distribution).</p> * * <a name="precisionStepDesc"><h3>Precision Step</h3> * <p>You can choose any <code>precisionStep</code> when encoding values. * Lower step values mean more precisions and so more terms in index (and index gets larger). * On the other hand, the maximum number of terms to match reduces, which optimized query speed. * The formula to calculate the maximum term count is: * <pre> * n = [ (bitsPerValue/precisionStep - 1) * (2^precisionStep - 1 ) * 2 ] + (2^precisionStep - 1 ) * </pre> * <p><em>(this formula is only correct, when <code>bitsPerValue/precisionStep</code> is an integer; * in other cases, the value must be rounded up and the last summand must contain the modulo of the division as * precision step)</em>. * For longs stored using a precision step of 4, <code>n = 15*15*2 + 15 = 465</code>, and for a precision * step of 2, <code>n = 31*3*2 + 3 = 189</code>. But the faster search speed is reduced by more seeking * in the term enum of the index. Because of this, the ideal <code>precisionStep</code> value can only * be found out by testing. <b>Important:</b> You can index with a lower precision step value and test search speed * using a multiple of the original step value.</p> * * <p>Good values for <code>precisionStep</code> are depending on usage and data type: * <ul> * <li>The default for all data types is <b>4</b>, which is used, when no <code>precisionStep</code> is given. * <li>Ideal value in most cases for <em>64 bit</em> data types <em>(long, double)</em> is <b>6</b> or <b>8</b>. * <li>Ideal value in most cases for <em>32 bit</em> data types <em>(int, float)</em> is <b>4</b>. * <li>For low cardinality fields larger precision steps are good. If the cardinality is &lt; 100, it is * fair to use {@link Integer#MAX_VALUE} (see below). * <li>Steps <b>&ge;64</b> for <em>long/double</em> and <b>&ge;32</b> for <em>int/float</em> produces one token * per value in the index and querying is as slow as a conventional {@link TermRangeQuery}. But it can be used * to produce fields, that are solely used for sorting (in this case simply use {@link Integer#MAX_VALUE} as * <code>precisionStep</code>). Using {@link NumericField NumericFields} for sorting * is ideal, because building the field cache is much faster than with text-only numbers. * These fields have one term per value and therefore also work with term enumeration for building distinct lists * (e.g. facets / preselected values to search for). * Sorting is also possible with range query optimized fields using one of the above <code>precisionSteps</code>. * </ul> * * <p>Comparisons of the different types of RangeQueries on an index with about 500,000 docs showed * that {@link TermRangeQuery} in boolean rewrite mode (with raised {@link BooleanQuery} clause count) * took about 30-40 secs to complete, {@link TermRangeQuery} in constant score filter rewrite mode took 5 secs * and executing this class took &lt;100ms to complete (on an Opteron64 machine, Java 1.5, 8 bit * precision step). This query type was developed for a geographic portal, where the performance for * e.g. bounding boxes or exact date/time stamps is important.</p> * * @since 2.9 **/	TokenNameCOMMENT_JAVADOC	 <p>A {@link Query} that matches numeric values within a specified range. To use this, you must first index the numeric values using {@link NumericField} (expert: {@link NumericTokenStream}). If your terms are instead textual, you should use {@link TermRangeQuery}. {@link NumericRangeFilter} is the filter equivalent of this query.</p> * <p>You create a new NumericRangeQuery with the static factory methods, eg: * <pre> Query q = NumericRangeQuery.newFloatRange("weight", 0.03f, 0.10f, true, true); </pre> * matches all documents whose float valued "weight" field ranges from 0.03 to 0.10, inclusive. * <p>The performance of NumericRangeQuery is much better than the corresponding {@link TermRangeQuery} because the number of terms that must be searched is usually far fewer, thanks to trie indexing, described below.</p> * <p>You can optionally specify a <a href="#precisionStepDesc"><code>precisionStep</code></a> when creating this query. This is necessary if you've changed this configuration from its default (4) during indexing. Lower values consume more disk space but speed up searching. Suitable values are between <b>1</b> and <b>8</b>. A good starting point to test is <b>4</b>, which is the default value for all <code>Numeric*</code> classes. See <a href="#precisionStepDesc">below</a> for details. * <p>This query defaults to {@linkplain MultiTermQuery#CONSTANT_SCORE_AUTO_REWRITE_DEFAULT} for 32 bit (int/float) ranges with precisionStep &le;8 and 64 bit (long/double) ranges with precisionStep &le;6. Otherwise it uses {@linkplain MultiTermQuery#CONSTANT_SCORE_FILTER_REWRITE} as the number of terms is likely to be high. With precision steps of &le;4, this query can be run with one of the BooleanQuery rewrite methods without changing BooleanQuery's default max clause count. * <br><h3>How it works</h3> * <p>See the publication about <a target="_blank" href="http://www.panfmp.org">panFMP</a>, where this algorithm was described (referred to as <code>TrieRangeQuery</code>): * <blockquote><strong>Schindler, U, Diepenbroek, M</strong>, 2008. <em>Generic XML-based Framework for Metadata Portals.</em> Computers &amp; Geosciences 34 (12), 1947-1955. <a href="http://dx.doi.org/10.1016/j.cageo.2008.02.023" target="_blank">doi:10.1016/j.cageo.2008.02.023</a></blockquote> * <p><em>A quote from this paper:</em> Because Apache Lucene is a full-text search engine and not a conventional database, it cannot handle numerical ranges (e.g., field value is inside user defined bounds, even dates are numerical values). We have developed an extension to Apache Lucene that stores the numerical values in a special string-encoded format with variable precision (all numerical values like doubles, longs, floats, and ints are converted to lexicographic sortable string representations and stored with different precisions (for a more detailed description of how the values are stored, see {@link NumericUtils}). A range is then divided recursively into multiple intervals for searching: The center of the range is searched only with the lowest possible precision in the <em>trie</em>, while the boundaries are matched more exactly. This reduces the number of terms dramatically.</p> * <p>For the variant that stores long values in 8 different precisions (each reduced by 8 bits) that uses a lowest precision of 1 byte, the index contains only a maximum of 256 distinct values in the lowest precision. Overall, a range could consist of a theoretical maximum of <code>7*255*2 + 255 = 3825</code> distinct terms (when there is a term for every distinct value of an 8-byte-number in the index and the range covers almost all of them; a maximum of 255 distinct values is used because it would always be possible to reduce the full 256 values to one term with degraded precision). In practice, we have seen up to 300 terms in most cases (index with 500,000 metadata records and a uniform value distribution).</p> * <a name="precisionStepDesc"><h3>Precision Step</h3> <p>You can choose any <code>precisionStep</code> when encoding values. Lower step values mean more precisions and so more terms in index (and index gets larger). On the other hand, the maximum number of terms to match reduces, which optimized query speed. The formula to calculate the maximum term count is: <pre> n = [ (bitsPerValue/precisionStep - 1) (2^precisionStep - 1 ) 2 ] + (2^precisionStep - 1 ) </pre> <p><em>(this formula is only correct, when <code>bitsPerValue/precisionStep</code> is an integer; in other cases, the value must be rounded up and the last summand must contain the modulo of the division as precision step)</em>. For longs stored using a precision step of 4, <code>n = 15*15*2 + 15 = 465</code>, and for a precision step of 2, <code>n = 31*3*2 + 3 = 189</code>. But the faster search speed is reduced by more seeking in the term enum of the index. Because of this, the ideal <code>precisionStep</code> value can only be found out by testing. <b>Important:</b> You can index with a lower precision step value and test search speed using a multiple of the original step value.</p> * <p>Good values for <code>precisionStep</code> are depending on usage and data type: <ul> <li>The default for all data types is <b>4</b>, which is used, when no <code>precisionStep</code> is given. <li>Ideal value in most cases for <em>64 bit</em> data types <em>(long, double)</em> is <b>6</b> or <b>8</b>. <li>Ideal value in most cases for <em>32 bit</em> data types <em>(int, float)</em> is <b>4</b>. <li>For low cardinality fields larger precision steps are good. If the cardinality is &lt; 100, it is fair to use {@link Integer#MAX_VALUE} (see below). <li>Steps <b>&ge;64</b> for <em>long/double</em> and <b>&ge;32</b> for <em>int/float</em> produces one token per value in the index and querying is as slow as a conventional {@link TermRangeQuery}. But it can be used to produce fields, that are solely used for sorting (in this case simply use {@link Integer#MAX_VALUE} as <code>precisionStep</code>). Using {@link NumericField NumericFields} for sorting is ideal, because building the field cache is much faster than with text-only numbers. These fields have one term per value and therefore also work with term enumeration for building distinct lists (e.g. facets / preselected values to search for). Sorting is also possible with range query optimized fields using one of the above <code>precisionSteps</code>. </ul> * <p>Comparisons of the different types of RangeQueries on an index with about 500,000 docs showed that {@link TermRangeQuery} in boolean rewrite mode (with raised {@link BooleanQuery} clause count) took about 30-40 secs to complete, {@link TermRangeQuery} in constant score filter rewrite mode took 5 secs and executing this class took &lt;100ms to complete (on an Opteron64 machine, Java 1.5, 8 bit precision step). This query type was developed for a geographic portal, where the performance for e.g. bounding boxes or exact date/time stamps is important.</p> * @since 2.9 *
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Number	TokenNameIdentifier	 Number
>	TokenNameGREATER	
extends	TokenNameextends	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
{	TokenNameLBRACE	
private	TokenNameprivate	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
final	TokenNamefinal	
DataType	TokenNameIdentifier	 Data Type
dataType	TokenNameIdentifier	 data Type
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
precisionStep	TokenNameIdentifier	 precision Step
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"precisionStep must be >=1"	TokenNameStringLiteral	precisionStep must be >=1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
precisionStep	TokenNameIdentifier	 precision Step
=	TokenNameEQUAL	
precisionStep	TokenNameIdentifier	 precision Step
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dataType	TokenNameIdentifier	 data Type
=	TokenNameEQUAL	
dataType	TokenNameIdentifier	 data Type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minInclusive	TokenNameIdentifier	 min Inclusive
=	TokenNameEQUAL	
minInclusive	TokenNameIdentifier	 min Inclusive
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
=	TokenNameEQUAL	
maxInclusive	TokenNameIdentifier	 max Inclusive
;	TokenNameSEMICOLON	
// For bigger precisionSteps this query likely 	TokenNameCOMMENT_LINE	For bigger precisionSteps this query likely 
// hits too many terms, so set to CONSTANT_SCORE_FILTER right off 	TokenNameCOMMENT_LINE	hits too many terms, so set to CONSTANT_SCORE_FILTER right off 
// (especially as the FilteredTermEnum is costly if wasted only for AUTO tests because it 	TokenNameCOMMENT_LINE	(especially as the FilteredTermEnum is costly if wasted only for AUTO tests because it 
// creates new enums from IndexReader for each sub-range) 	TokenNameCOMMENT_LINE	creates new enums from IndexReader for each sub-range) 
switch	TokenNameswitch	
(	TokenNameLPAREN	
dataType	TokenNameIdentifier	 data Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LONG	TokenNameIdentifier	 LONG
:	TokenNameCOLON	
case	TokenNamecase	
DOUBLE	TokenNameIdentifier	 DOUBLE
:	TokenNameCOLON	
setRewriteMethod	TokenNameIdentifier	 set Rewrite Method
(	TokenNameLPAREN	
(	TokenNameLPAREN	
precisionStep	TokenNameIdentifier	 precision Step
>	TokenNameGREATER	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
CONSTANT_SCORE_FILTER_REWRITE	TokenNameIdentifier	 CONSTANT  SCORE  FILTER  REWRITE
:	TokenNameCOLON	
CONSTANT_SCORE_AUTO_REWRITE_DEFAULT	TokenNameIdentifier	 CONSTANT  SCORE  AUTO  REWRITE  DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
INT	TokenNameIdentifier	 INT
:	TokenNameCOLON	
case	TokenNamecase	
FLOAT	TokenNameIdentifier	 FLOAT
:	TokenNameCOLON	
setRewriteMethod	TokenNameIdentifier	 set Rewrite Method
(	TokenNameLPAREN	
(	TokenNameLPAREN	
precisionStep	TokenNameIdentifier	 precision Step
>	TokenNameGREATER	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
CONSTANT_SCORE_FILTER_REWRITE	TokenNameIdentifier	 CONSTANT  SCORE  FILTER  REWRITE
:	TokenNameCOLON	
CONSTANT_SCORE_AUTO_REWRITE_DEFAULT	TokenNameIdentifier	 CONSTANT  SCORE  AUTO  REWRITE  DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// should never happen 	TokenNameCOMMENT_LINE	should never happen 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Invalid numeric DataType"	TokenNameStringLiteral	Invalid numeric DataType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// shortcut if upper bound == lower bound 	TokenNameCOMMENT_LINE	shortcut if upper bound == lower bound 
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setRewriteMethod	TokenNameIdentifier	 set Rewrite Method
(	TokenNameLPAREN	
CONSTANT_SCORE_BOOLEAN_QUERY_REWRITE	TokenNameIdentifier	 CONSTANT  SCORE  BOOLEAN  QUERY  REWRITE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>long</code> * range using the given <a href="#precisionStepDesc"><code>precisionStep</code></a>. * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>long</code> range using the given <a href="#precisionStepDesc"><code>precisionStep</code></a>. You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
LONG	TokenNameIdentifier	 LONG
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>long</code> * range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>long</code> range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
PRECISION_STEP_DEFAULT	TokenNameIdentifier	 PRECISION  STEP  DEFAULT
,	TokenNameCOMMA	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
LONG	TokenNameIdentifier	 LONG
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>int</code> * range using the given <a href="#precisionStepDesc"><code>precisionStep</code></a>. * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>int</code> range using the given <a href="#precisionStepDesc"><code>precisionStep</code></a>. You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>int</code> * range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>int</code> range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
PRECISION_STEP_DEFAULT	TokenNameIdentifier	 PRECISION  STEP  DEFAULT
,	TokenNameCOMMA	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>double</code> * range using the given <a href="#precisionStepDesc"><code>precisionStep</code></a>. * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. * {@link Double#NaN} will never match a half-open range, to hit {@code NaN} use a query * with {@code min == max == Double.NaN}. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>double</code> range using the given <a href="#precisionStepDesc"><code>precisionStep</code></a>. You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. {@link Double#NaN} will never match a half-open range, to hit {@code NaN} use a query with {@code min == max == Double.NaN}. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
DOUBLE	TokenNameIdentifier	 DOUBLE
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>double</code> * range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. * {@link Double#NaN} will never match a half-open range, to hit {@code NaN} use a query * with {@code min == max == Double.NaN}. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>double</code> range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. {@link Double#NaN} will never match a half-open range, to hit {@code NaN} use a query with {@code min == max == Double.NaN}. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
PRECISION_STEP_DEFAULT	TokenNameIdentifier	 PRECISION  STEP  DEFAULT
,	TokenNameCOMMA	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
DOUBLE	TokenNameIdentifier	 DOUBLE
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>float</code> * range using the given <a href="#precisionStepDesc"><code>precisionStep</code></a>. * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. * {@link Float#NaN} will never match a half-open range, to hit {@code NaN} use a query * with {@code min == max == Float.NaN}. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>float</code> range using the given <a href="#precisionStepDesc"><code>precisionStep</code></a>. You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. {@link Float#NaN} will never match a half-open range, to hit {@code NaN} use a query with {@code min == max == Float.NaN}. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>float</code> * range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. * {@link Float#NaN} will never match a half-open range, to hit {@code NaN} use a query * with {@code min == max == Float.NaN}. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeQuery</code>, that queries a <code>float</code> range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. {@link Float#NaN} will never match a half-open range, to hit {@code NaN} use a query with {@code min == max == Float.NaN}. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
PRECISION_STEP_DEFAULT	TokenNameIdentifier	 PRECISION  STEP  DEFAULT
,	TokenNameCOMMA	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
FilteredTermEnum	TokenNameIdentifier	 Filtered Term Enum
getEnum	TokenNameIdentifier	 get Enum
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NumericRangeTermEnum	TokenNameIdentifier	 Numeric Range Term Enum
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
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
/** Returns <code>true</code> if the lower endpoint is inclusive */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the lower endpoint is inclusive 
public	TokenNamepublic	
boolean	TokenNameboolean	
includesMin	TokenNameIdentifier	 includes Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minInclusive	TokenNameIdentifier	 min Inclusive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns <code>true</code> if the upper endpoint is inclusive */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the upper endpoint is inclusive 
public	TokenNamepublic	
boolean	TokenNameboolean	
includesMax	TokenNameIdentifier	 includes Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxInclusive	TokenNameIdentifier	 max Inclusive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the lower value of this range query */	TokenNameCOMMENT_JAVADOC	 Returns the lower value of this range query 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the upper value of this range query */	TokenNameCOMMENT_JAVADOC	 Returns the upper value of this range query 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the precision step. */	TokenNameCOMMENT_JAVADOC	 Returns the precision step. 
public	TokenNamepublic	
int	TokenNameint	
getPrecisionStep	TokenNameIdentifier	 get Precision Step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
precisionStep	TokenNameIdentifier	 precision Step
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
minInclusive	TokenNameIdentifier	 min Inclusive
?	TokenNameQUESTION	
'['	TokenNameCharacterLiteral	
:	TokenNameCOLON	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"*"	TokenNameStringLiteral	*
:	TokenNameCOLON	
min	TokenNameIdentifier	 min
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
max	TokenNameIdentifier	 max
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"*"	TokenNameStringLiteral	*
:	TokenNameCOLON	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
maxInclusive	TokenNameIdentifier	 max Inclusive
?	TokenNameQUESTION	
']'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
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
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
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
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
field	TokenNameIdentifier	 field
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
min	TokenNameIdentifier	 min
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
min	TokenNameIdentifier	 min
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
max	TokenNameIdentifier	 max
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
max	TokenNameIdentifier	 max
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
minInclusive	TokenNameIdentifier	 min Inclusive
==	TokenNameEQUAL_EQUAL	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
minInclusive	TokenNameIdentifier	 min Inclusive
&&	TokenNameAND_AND	
maxInclusive	TokenNameIdentifier	 max Inclusive
==	TokenNameEQUAL_EQUAL	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
&&	TokenNameAND_AND	
precisionStep	TokenNameIdentifier	 precision Step
==	TokenNameEQUAL_EQUAL	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
precisionStep	TokenNameIdentifier	 precision Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
+=	TokenNamePLUS_EQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
0x4565fd66	TokenNameIntegerLiteral	
+	TokenNamePLUS	
precisionStep	TokenNameIdentifier	 precision Step
^	TokenNameXOR	
0x64365465	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
hash	TokenNameIdentifier	 hash
+=	TokenNamePLUS_EQUAL	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
0x14fa55fb	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
hash	TokenNameIdentifier	 hash
+=	TokenNamePLUS_EQUAL	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
0x733fa5fe	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
minInclusive	TokenNameIdentifier	 min Inclusive
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
0x14fa55fb	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
0x733fa5fe	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// field must be interned after reading from stream 	TokenNameCOMMENT_LINE	field must be interned after reading from stream 
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// members (package private, to be also fast accessible by NumericRangeTermEnum) 	TokenNameCOMMENT_LINE	members (package private, to be also fast accessible by NumericRangeTermEnum) 
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DataType	TokenNameIdentifier	 Data Type
dataType	TokenNameIdentifier	 data Type
;	TokenNameSEMICOLON	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
;	TokenNameSEMICOLON	
// used to handle float/double infinity correcty 	TokenNameCOMMENT_LINE	used to handle float/double infinity correcty 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
LONG_NEGATIVE_INFINITY	TokenNameIdentifier	 LONG  NEGATIVE  INFINITY
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
doubleToSortableLong	TokenNameIdentifier	 double To Sortable Long
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
LONG_POSITIVE_INFINITY	TokenNameIdentifier	 LONG  POSITIVE  INFINITY
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
doubleToSortableLong	TokenNameIdentifier	 double To Sortable Long
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INT_NEGATIVE_INFINITY	TokenNameIdentifier	 INT  NEGATIVE  INFINITY
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
floatToSortableInt	TokenNameIdentifier	 float To Sortable Int
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INT_POSITIVE_INFINITY	TokenNameIdentifier	 INT  POSITIVE  INFINITY
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
floatToSortableInt	TokenNameIdentifier	 float To Sortable Int
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Subclass of FilteredTermEnum for enumerating all terms that match the * sub-ranges for trie range queries. * <p> * WARNING: This term enumeration is not guaranteed to be always ordered by * {@link Term#compareTo}. * The ordering depends on how {@link NumericUtils#splitLongRange} and * {@link NumericUtils#splitIntRange} generates the sub-ranges. For * {@link MultiTermQuery} ordering is not relevant. */	TokenNameCOMMENT_JAVADOC	 Subclass of FilteredTermEnum for enumerating all terms that match the sub-ranges for trie range queries. <p> WARNING: This term enumeration is not guaranteed to be always ordered by {@link Term#compareTo}. The ordering depends on how {@link NumericUtils#splitLongRange} and {@link NumericUtils#splitIntRange} generates the sub-ranges. For {@link MultiTermQuery} ordering is not relevant. 
private	TokenNameprivate	
final	TokenNamefinal	
class	TokenNameclass	
NumericRangeTermEnum	TokenNameIdentifier	 Numeric Range Term Enum
extends	TokenNameextends	
FilteredTermEnum	TokenNameIdentifier	 Filtered Term Enum
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
rangeBounds	TokenNameIdentifier	 range Bounds
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
termTemplate	TokenNameIdentifier	 term Template
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
currentUpperBound	TokenNameIdentifier	 current Upper Bound
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
NumericRangeTermEnum	TokenNameIdentifier	 Numeric Range Term Enum
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
dataType	TokenNameIdentifier	 data Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LONG	TokenNameIdentifier	 LONG
:	TokenNameCOLON	
case	TokenNamecase	
DOUBLE	TokenNameIdentifier	 DOUBLE
:	TokenNameCOLON	
{	TokenNameLBRACE	
// lower 	TokenNameCOMMENT_LINE	lower 
long	TokenNamelong	
minBound	TokenNameIdentifier	 min Bound
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataType	TokenNameIdentifier	 data Type
==	TokenNameEQUAL_EQUAL	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
LONG	TokenNameIdentifier	 LONG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minBound	TokenNameIdentifier	 min Bound
=	TokenNameEQUAL	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
:	TokenNameCOLON	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
dataType	TokenNameIdentifier	 data Type
==	TokenNameEQUAL_EQUAL	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
DOUBLE	TokenNameIdentifier	 DOUBLE
;	TokenNameSEMICOLON	
minBound	TokenNameIdentifier	 min Bound
=	TokenNameEQUAL	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
LONG_NEGATIVE_INFINITY	TokenNameIdentifier	 LONG  NEGATIVE  INFINITY
:	TokenNameCOLON	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
doubleToSortableLong	TokenNameIdentifier	 double To Sortable Long
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
minInclusive	TokenNameIdentifier	 min Inclusive
&&	TokenNameAND_AND	
min	TokenNameIdentifier	 min
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minBound	TokenNameIdentifier	 min Bound
==	TokenNameEQUAL_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
minBound	TokenNameIdentifier	 min Bound
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// upper 	TokenNameCOMMENT_LINE	upper 
long	TokenNamelong	
maxBound	TokenNameIdentifier	 max Bound
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataType	TokenNameIdentifier	 data Type
==	TokenNameEQUAL_EQUAL	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
LONG	TokenNameIdentifier	 LONG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxBound	TokenNameIdentifier	 max Bound
=	TokenNameEQUAL	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
:	TokenNameCOLON	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
dataType	TokenNameIdentifier	 data Type
==	TokenNameEQUAL_EQUAL	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
DOUBLE	TokenNameIdentifier	 DOUBLE
;	TokenNameSEMICOLON	
maxBound	TokenNameIdentifier	 max Bound
=	TokenNameEQUAL	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
LONG_POSITIVE_INFINITY	TokenNameIdentifier	 LONG  POSITIVE  INFINITY
:	TokenNameCOLON	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
doubleToSortableLong	TokenNameIdentifier	 double To Sortable Long
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
&&	TokenNameAND_AND	
max	TokenNameIdentifier	 max
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxBound	TokenNameIdentifier	 max Bound
==	TokenNameEQUAL_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
maxBound	TokenNameIdentifier	 max Bound
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
splitLongRange	TokenNameIdentifier	 split Long Range
(	TokenNameLPAREN	
new	TokenNamenew	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
LongRangeBuilder	TokenNameIdentifier	 Long Range Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
minPrefixCoded	TokenNameIdentifier	 min Prefix Coded
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
maxPrefixCoded	TokenNameIdentifier	 max Prefix Coded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rangeBounds	TokenNameIdentifier	 range Bounds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
minPrefixCoded	TokenNameIdentifier	 min Prefix Coded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rangeBounds	TokenNameIdentifier	 range Bounds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
maxPrefixCoded	TokenNameIdentifier	 max Prefix Coded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
minBound	TokenNameIdentifier	 min Bound
,	TokenNameCOMMA	
maxBound	TokenNameIdentifier	 max Bound
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
INT	TokenNameIdentifier	 INT
:	TokenNameCOLON	
case	TokenNamecase	
FLOAT	TokenNameIdentifier	 FLOAT
:	TokenNameCOLON	
{	TokenNameLBRACE	
// lower 	TokenNameCOMMENT_LINE	lower 
int	TokenNameint	
minBound	TokenNameIdentifier	 min Bound
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataType	TokenNameIdentifier	 data Type
==	TokenNameEQUAL_EQUAL	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minBound	TokenNameIdentifier	 min Bound
=	TokenNameEQUAL	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
:	TokenNameCOLON	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
dataType	TokenNameIdentifier	 data Type
==	TokenNameEQUAL_EQUAL	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
;	TokenNameSEMICOLON	
minBound	TokenNameIdentifier	 min Bound
=	TokenNameEQUAL	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
INT_NEGATIVE_INFINITY	TokenNameIdentifier	 INT  NEGATIVE  INFINITY
:	TokenNameCOLON	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
floatToSortableInt	TokenNameIdentifier	 float To Sortable Int
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
minInclusive	TokenNameIdentifier	 min Inclusive
&&	TokenNameAND_AND	
min	TokenNameIdentifier	 min
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minBound	TokenNameIdentifier	 min Bound
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
minBound	TokenNameIdentifier	 min Bound
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// upper 	TokenNameCOMMENT_LINE	upper 
int	TokenNameint	
maxBound	TokenNameIdentifier	 max Bound
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataType	TokenNameIdentifier	 data Type
==	TokenNameEQUAL_EQUAL	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxBound	TokenNameIdentifier	 max Bound
=	TokenNameEQUAL	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
:	TokenNameCOLON	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
dataType	TokenNameIdentifier	 data Type
==	TokenNameEQUAL_EQUAL	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
;	TokenNameSEMICOLON	
maxBound	TokenNameIdentifier	 max Bound
=	TokenNameEQUAL	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
INT_POSITIVE_INFINITY	TokenNameIdentifier	 INT  POSITIVE  INFINITY
:	TokenNameCOLON	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
floatToSortableInt	TokenNameIdentifier	 float To Sortable Int
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
maxInclusive	TokenNameIdentifier	 max Inclusive
&&	TokenNameAND_AND	
max	TokenNameIdentifier	 max
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxBound	TokenNameIdentifier	 max Bound
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
maxBound	TokenNameIdentifier	 max Bound
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
splitIntRange	TokenNameIdentifier	 split Int Range
(	TokenNameLPAREN	
new	TokenNamenew	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
IntRangeBuilder	TokenNameIdentifier	 Int Range Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
minPrefixCoded	TokenNameIdentifier	 min Prefix Coded
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
maxPrefixCoded	TokenNameIdentifier	 max Prefix Coded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rangeBounds	TokenNameIdentifier	 range Bounds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
minPrefixCoded	TokenNameIdentifier	 min Prefix Coded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rangeBounds	TokenNameIdentifier	 range Bounds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
maxPrefixCoded	TokenNameIdentifier	 max Prefix Coded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
minBound	TokenNameIdentifier	 min Bound
,	TokenNameCOMMA	
maxBound	TokenNameIdentifier	 max Bound
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
// should never happen 	TokenNameCOMMENT_LINE	should never happen 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Invalid numeric DataType"	TokenNameStringLiteral	Invalid numeric DataType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// seek to first term 	TokenNameCOMMENT_LINE	seek to first term 
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
difference	TokenNameIdentifier	 difference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** this is a dummy, it is not used by this class. */	TokenNameCOMMENT_JAVADOC	 this is a dummy, it is not used by this class. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
endEnum	TokenNameIdentifier	 end Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"not implemented"	TokenNameStringLiteral	not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** this is a dummy, it is not used by this class. */	TokenNameCOMMENT_JAVADOC	 this is a dummy, it is not used by this class. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setEnum	TokenNameIdentifier	 set Enum
(	TokenNameLPAREN	
TermEnum	TokenNameIdentifier	 Term Enum
tenum	TokenNameIdentifier	 tenum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"not implemented"	TokenNameStringLiteral	not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares if current upper bound is reached. * In contrast to {@link FilteredTermEnum}, a return value * of <code>false</code> ends iterating the current enum * and forwards to the next sub-range. */	TokenNameCOMMENT_JAVADOC	 Compares if current upper bound is reached. In contrast to {@link FilteredTermEnum}, a return value of <code>false</code> ends iterating the current enum and forwards to the next sub-range. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
termCompare	TokenNameIdentifier	 term Compare
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
field	TokenNameIdentifier	 field
&&	TokenNameAND_AND	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
currentUpperBound	TokenNameIdentifier	 current Upper Bound
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Increments the enumeration to the next element. True if one exists. */	TokenNameCOMMENT_JAVADOC	 Increments the enumeration to the next element. True if one exists. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// if a current term exists, the actual enum is initialized: 	TokenNameCOMMENT_LINE	if a current term exists, the actual enum is initialized: 
// try change to next term, if no such term exists, fall-through 	TokenNameCOMMENT_LINE	try change to next term, if no such term exists, fall-through 
if	TokenNameif	
(	TokenNameLPAREN	
currentTerm	TokenNameIdentifier	 current Term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
actualEnum	TokenNameIdentifier	 actual Enum
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
actualEnum	TokenNameIdentifier	 actual Enum
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentTerm	TokenNameIdentifier	 current Term
=	TokenNameEQUAL	
actualEnum	TokenNameIdentifier	 actual Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termCompare	TokenNameIdentifier	 term Compare
(	TokenNameLPAREN	
currentTerm	TokenNameIdentifier	 current Term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if all above fails, we go forward to the next enum, 	TokenNameCOMMENT_LINE	if all above fails, we go forward to the next enum, 
// if one is available 	TokenNameCOMMENT_LINE	if one is available 
currentTerm	TokenNameIdentifier	 current Term
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
rangeBounds	TokenNameIdentifier	 range Bounds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
rangeBounds	TokenNameIdentifier	 range Bounds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// close the current enum and read next bounds 	TokenNameCOMMENT_LINE	close the current enum and read next bounds 
if	TokenNameif	
(	TokenNameLPAREN	
actualEnum	TokenNameIdentifier	 actual Enum
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
actualEnum	TokenNameIdentifier	 actual Enum
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
actualEnum	TokenNameIdentifier	 actual Enum
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
lowerBound	TokenNameIdentifier	 lower Bound
=	TokenNameEQUAL	
rangeBounds	TokenNameIdentifier	 range Bounds
.	TokenNameDOT	
removeFirst	TokenNameIdentifier	 remove First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentUpperBound	TokenNameIdentifier	 current Upper Bound
=	TokenNameEQUAL	
rangeBounds	TokenNameIdentifier	 range Bounds
.	TokenNameDOT	
removeFirst	TokenNameIdentifier	 remove First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create a new enum 	TokenNameCOMMENT_LINE	create a new enum 
actualEnum	TokenNameIdentifier	 actual Enum
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
termTemplate	TokenNameIdentifier	 term Template
.	TokenNameDOT	
createTerm	TokenNameIdentifier	 create Term
(	TokenNameLPAREN	
lowerBound	TokenNameIdentifier	 lower Bound
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentTerm	TokenNameIdentifier	 current Term
=	TokenNameEQUAL	
actualEnum	TokenNameIdentifier	 actual Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentTerm	TokenNameIdentifier	 current Term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
termCompare	TokenNameIdentifier	 term Compare
(	TokenNameLPAREN	
currentTerm	TokenNameIdentifier	 current Term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// clear the current term for next iteration 	TokenNameCOMMENT_LINE	clear the current term for next iteration 
currentTerm	TokenNameIdentifier	 current Term
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// no more sub-range enums available 	TokenNameCOMMENT_LINE	no more sub-range enums available 
assert	TokenNameassert	
rangeBounds	TokenNameIdentifier	 range Bounds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
currentTerm	TokenNameIdentifier	 current Term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Closes the enumeration to further activity, freeing resources. */	TokenNameCOMMENT_JAVADOC	 Closes the enumeration to further activity, freeing resources. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
rangeBounds	TokenNameIdentifier	 range Bounds
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentUpperBound	TokenNameIdentifier	 current Upper Bound
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
