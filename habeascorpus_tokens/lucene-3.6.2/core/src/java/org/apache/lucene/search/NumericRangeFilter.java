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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NumericUtils	TokenNameIdentifier	 Numeric Utils
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
/** * A {@link Filter} that only accepts numeric values within * a specified range. To use this, you must first index the * numeric values using {@link NumericField} (expert: {@link * NumericTokenStream}). * * <p>You create a new NumericRangeFilter with the static * factory methods, eg: * * <pre> * Filter f = NumericRangeFilter.newFloatRange("weight", 0.03f, 0.10f, true, true); * </pre> * * accepts all documents whose float valued "weight" field * ranges from 0.03 to 0.10, inclusive. * See {@link NumericRangeQuery} for details on how Lucene * indexes and searches numeric valued fields. * * @since 2.9 **/	TokenNameCOMMENT_JAVADOC	 A {@link Filter} that only accepts numeric values within a specified range. To use this, you must first index the numeric values using {@link NumericField} (expert: {@link NumericTokenStream}). * <p>You create a new NumericRangeFilter with the static factory methods, eg: * <pre> Filter f = NumericRangeFilter.newFloatRange("weight", 0.03f, 0.10f, true, true); </pre> * accepts all documents whose float valued "weight" field ranges from 0.03 to 0.10, inclusive. See {@link NumericRangeQuery} for details on how Lucene indexes and searches numeric valued fields. * @since 2.9 *
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Number	TokenNameIdentifier	 Number
>	TokenNameGREATER	
extends	TokenNameextends	
MultiTermQueryWrapperFilter	TokenNameIdentifier	 Multi Term Query Wrapper Filter
<	TokenNameLESS	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
private	TokenNameprivate	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
(	TokenNameLPAREN	
final	TokenNamefinal	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeFilter</code>, that filters a <code>long</code> * range using the given <a href="NumericRangeQuery.html#precisionStepDesc"><code>precisionStep</code></a>. * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeFilter</code>, that filters a <code>long</code> range using the given <a href="NumericRangeQuery.html#precisionStepDesc"><code>precisionStep</code></a>. You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
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
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeFilter</code>, that queries a <code>long</code> * range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeFilter</code>, that queries a <code>long</code> range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
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
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
.	TokenNameDOT	
newLongRange	TokenNameIdentifier	 new Long Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeFilter</code>, that filters a <code>int</code> * range using the given <a href="NumericRangeQuery.html#precisionStepDesc"><code>precisionStep</code></a>. * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeFilter</code>, that filters a <code>int</code> range using the given <a href="NumericRangeQuery.html#precisionStepDesc"><code>precisionStep</code></a>. You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
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
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeFilter</code>, that queries a <code>int</code> * range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeFilter</code>, that queries a <code>int</code> range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
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
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
.	TokenNameDOT	
newIntRange	TokenNameIdentifier	 new Int Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeFilter</code>, that filters a <code>double</code> * range using the given <a href="NumericRangeQuery.html#precisionStepDesc"><code>precisionStep</code></a>. * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. * {@link Double#NaN} will never match a half-open range, to hit {@code NaN} use a query * with {@code min == max == Double.NaN}. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeFilter</code>, that filters a <code>double</code> range using the given <a href="NumericRangeQuery.html#precisionStepDesc"><code>precisionStep</code></a>. You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. {@link Double#NaN} will never match a half-open range, to hit {@code NaN} use a query with {@code min == max == Double.NaN}. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
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
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
.	TokenNameDOT	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeFilter</code>, that queries a <code>double</code> * range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. * {@link Double#NaN} will never match a half-open range, to hit {@code NaN} use a query * with {@code min == max == Double.NaN}. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeFilter</code>, that queries a <code>double</code> range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. {@link Double#NaN} will never match a half-open range, to hit {@code NaN} use a query with {@code min == max == Double.NaN}. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
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
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
.	TokenNameDOT	
newDoubleRange	TokenNameIdentifier	 new Double Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeFilter</code>, that filters a <code>float</code> * range using the given <a href="NumericRangeQuery.html#precisionStepDesc"><code>precisionStep</code></a>. * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. * {@link Float#NaN} will never match a half-open range, to hit {@code NaN} use a query * with {@code min == max == Float.NaN}. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeFilter</code>, that filters a <code>float</code> range using the given <a href="NumericRangeQuery.html#precisionStepDesc"><code>precisionStep</code></a>. You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. {@link Float#NaN} will never match a half-open range, to hit {@code NaN} use a query with {@code min == max == Float.NaN}. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
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
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
<	TokenNameLESS	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
.	TokenNameDOT	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory that creates a <code>NumericRangeFilter</code>, that queries a <code>float</code> * range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). * You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) * by setting the min or max value to <code>null</code>. * {@link Float#NaN} will never match a half-open range, to hit {@code NaN} use a query * with {@code min == max == Float.NaN}. By setting inclusive to false, it will * match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. */	TokenNameCOMMENT_JAVADOC	 Factory that creates a <code>NumericRangeFilter</code>, that queries a <code>float</code> range using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). You can have half-open ranges (which are in fact &lt;/&le; or &gt;/&ge; queries) by setting the min or max value to <code>null</code>. {@link Float#NaN} will never match a half-open range, to hit {@code NaN} use a query with {@code min == max == Float.NaN}. By setting inclusive to false, it will match all documents excluding the bounds, with inclusive on, the boundaries are hits, too. 
public	TokenNamepublic	
static	TokenNamestatic	
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
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
NumericRangeFilter	TokenNameIdentifier	 Numeric Range Filter
<	TokenNameLESS	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
(	TokenNameLPAREN	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
.	TokenNameDOT	
newFloatRange	TokenNameIdentifier	 new Float Range
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
minInclusive	TokenNameIdentifier	 min Inclusive
,	TokenNameCOMMA	
maxInclusive	TokenNameIdentifier	 max Inclusive
)	TokenNameRPAREN	
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
/** Returns <code>true</code> if the lower endpoint is inclusive */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the lower endpoint is inclusive 
public	TokenNamepublic	
boolean	TokenNameboolean	
includesMin	TokenNameIdentifier	 includes Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
includesMin	TokenNameIdentifier	 includes Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
query	TokenNameIdentifier	 query
.	TokenNameDOT	
includesMax	TokenNameIdentifier	 includes Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the lower value of this range filter */	TokenNameCOMMENT_JAVADOC	 Returns the lower value of this range filter 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the upper value of this range filter */	TokenNameCOMMENT_JAVADOC	 Returns the upper value of this range filter 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getPrecisionStep	TokenNameIdentifier	 get Precision Step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
