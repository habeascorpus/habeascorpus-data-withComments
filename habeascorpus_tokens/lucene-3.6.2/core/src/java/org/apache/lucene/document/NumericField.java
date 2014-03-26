package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
TokenStream	TokenNameIdentifier	 Token Stream
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
FieldInfo	TokenNameIdentifier	 Field Info
.	TokenNameDOT	
IndexOptions	TokenNameIdentifier	 Index Options
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
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
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
SortField	TokenNameIdentifier	 Sort Field
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
FieldCache	TokenNameIdentifier	 Field Cache
;	TokenNameSEMICOLON	
// javadocs 	TokenNameCOMMENT_LINE	javadocs 
/** * <p>This class provides a {@link Field} that enables indexing * of numeric values for efficient range filtering and * sorting. Here's an example usage, adding an int value: * <pre> * document.add(new NumericField(name).setIntValue(value)); * </pre> * * For optimal performance, re-use the * <code>NumericField</code> and {@link Document} instance for more than * one document: * * <pre> * NumericField field = new NumericField(name); * Document document = new Document(); * document.add(field); * * for(all documents) { * ... * field.setIntValue(value) * writer.addDocument(document); * ... * } * </pre> * * <p>The java native types <code>int</code>, <code>long</code>, * <code>float</code> and <code>double</code> are * directly supported. However, any value that can be * converted into these native types can also be indexed. * For example, date/time values represented by a * {@link java.util.Date} can be translated into a long * value using the {@link java.util.Date#getTime} method. If you * don't need millisecond precision, you can quantize the * value, either by dividing the result of * {@link java.util.Date#getTime} or using the separate getters * (for year, month, etc.) to construct an <code>int</code> or * <code>long</code> value.</p> * * <p>To perform range querying or filtering against a * <code>NumericField</code>, use {@link NumericRangeQuery} or {@link * NumericRangeFilter}. To sort according to a * <code>NumericField</code>, use the normal numeric sort types, eg * {@link SortField#INT}. <code>NumericField</code> values * can also be loaded directly from {@link FieldCache}.</p> * * <p>By default, a <code>NumericField</code>'s value is not stored but * is indexed for range filtering and sorting. You can use * the {@link #NumericField(String,Field.Store,boolean)} * constructor if you need to change these defaults.</p> * * <p>You may add the same field name as a <code>NumericField</code> to * the same document more than once. Range querying and * filtering will be the logical OR of all values; so a range query * will hit all documents that have at least one value in * the range. However sort behavior is not defined. If you need to sort, * you should separately index a single-valued <code>NumericField</code>.</p> * * <p>A <code>NumericField</code> will consume somewhat more disk space * in the index than an ordinary single-valued field. * However, for a typical index that includes substantial * textual content per document, this increase will likely * be in the noise. </p> * * <p>Within Lucene, each numeric value is indexed as a * <em>trie</em> structure, where each term is logically * assigned to larger and larger pre-defined brackets (which * are simply lower-precision representations of the value). * The step size between each successive bracket is called the * <code>precisionStep</code>, measured in bits. Smaller * <code>precisionStep</code> values result in larger number * of brackets, which consumes more disk space in the index * but may result in faster range search performance. The * default value, 4, was selected for a reasonable tradeoff * of disk space consumption versus performance. You can * use the expert constructor {@link * #NumericField(String,int,Field.Store,boolean)} if you'd * like to change the value. Note that you must also * specify a congruent value when creating {@link * NumericRangeQuery} or {@link NumericRangeFilter}. * For low cardinality fields larger precision steps are good. * If the cardinality is &lt; 100, it is fair * to use {@link Integer#MAX_VALUE}, which produces one * term per value. * * <p>For more information on the internals of numeric trie * indexing, including the <a * href="../search/NumericRangeQuery.html#precisionStepDesc"><code>precisionStep</code></a> * configuration, see {@link NumericRangeQuery}. The format of * indexed values is described in {@link NumericUtils}. * * <p>If you only need to sort by numeric value, and never * run range querying/filtering, you can index using a * <code>precisionStep</code> of {@link Integer#MAX_VALUE}. * This will minimize disk space consumed. </p> * * <p>More advanced users can instead use {@link * NumericTokenStream} directly, when indexing numbers. This * class is a wrapper around this token stream type for * easier, more intuitive usage.</p> * * @since 2.9 */	TokenNameCOMMENT_JAVADOC	 <p>This class provides a {@link Field} that enables indexing of numeric values for efficient range filtering and sorting. Here's an example usage, adding an int value: <pre> document.add(new NumericField(name).setIntValue(value)); </pre> * For optimal performance, re-use the <code>NumericField</code> and {@link Document} instance for more than one document: * <pre> NumericField field = new NumericField(name); Document document = new Document(); document.add(field); * for(all documents) { ... field.setIntValue(value) writer.addDocument(document); ... } </pre> * <p>The java native types <code>int</code>, <code>long</code>, <code>float</code> and <code>double</code> are directly supported. However, any value that can be converted into these native types can also be indexed. For example, date/time values represented by a {@link java.util.Date} can be translated into a long value using the {@link java.util.Date#getTime} method. If you don't need millisecond precision, you can quantize the value, either by dividing the result of {@link java.util.Date#getTime} or using the separate getters (for year, month, etc.) to construct an <code>int</code> or <code>long</code> value.</p> * <p>To perform range querying or filtering against a <code>NumericField</code>, use {@link NumericRangeQuery} or {@link NumericRangeFilter}. To sort according to a <code>NumericField</code>, use the normal numeric sort types, eg {@link SortField#INT}. <code>NumericField</code> values can also be loaded directly from {@link FieldCache}.</p> * <p>By default, a <code>NumericField</code>'s value is not stored but is indexed for range filtering and sorting. You can use the {@link #NumericField(String,Field.Store,boolean)} constructor if you need to change these defaults.</p> * <p>You may add the same field name as a <code>NumericField</code> to the same document more than once. Range querying and filtering will be the logical OR of all values; so a range query will hit all documents that have at least one value in the range. However sort behavior is not defined. If you need to sort, you should separately index a single-valued <code>NumericField</code>.</p> * <p>A <code>NumericField</code> will consume somewhat more disk space in the index than an ordinary single-valued field. However, for a typical index that includes substantial textual content per document, this increase will likely be in the noise. </p> * <p>Within Lucene, each numeric value is indexed as a <em>trie</em> structure, where each term is logically assigned to larger and larger pre-defined brackets (which are simply lower-precision representations of the value). The step size between each successive bracket is called the <code>precisionStep</code>, measured in bits. Smaller <code>precisionStep</code> values result in larger number of brackets, which consumes more disk space in the index but may result in faster range search performance. The default value, 4, was selected for a reasonable tradeoff of disk space consumption versus performance. You can use the expert constructor {@link #NumericField(String,int,Field.Store,boolean)} if you'd like to change the value. Note that you must also specify a congruent value when creating {@link NumericRangeQuery} or {@link NumericRangeFilter}. For low cardinality fields larger precision steps are good. If the cardinality is &lt; 100, it is fair to use {@link Integer#MAX_VALUE}, which produces one term per value. * <p>For more information on the internals of numeric trie indexing, including the <a href="../search/NumericRangeQuery.html#precisionStepDesc"><code>precisionStep</code></a> configuration, see {@link NumericRangeQuery}. The format of indexed values is described in {@link NumericUtils}. * <p>If you only need to sort by numeric value, and never run range querying/filtering, you can index using a <code>precisionStep</code> of {@link Integer#MAX_VALUE}. This will minimize disk space consumed. </p> * <p>More advanced users can instead use {@link NumericTokenStream} directly, when indexing numbers. This class is a wrapper around this token stream type for easier, more intuitive usage.</p> * @since 2.9 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NumericField	TokenNameIdentifier	 Numeric Field
extends	TokenNameextends	
AbstractField	TokenNameIdentifier	 Abstract Field
{	TokenNameLBRACE	
/** Data type of the value in {@link NumericField}. * @since 3.2 */	TokenNameCOMMENT_JAVADOC	 Data type of the value in {@link NumericField}. @since 3.2 
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
DataType	TokenNameIdentifier	 Data Type
{	TokenNameLBRACE	
INT	TokenNameIdentifier	 INT
,	TokenNameCOMMA	
LONG	TokenNameIdentifier	 LONG
,	TokenNameCOMMA	
FLOAT	TokenNameIdentifier	 FLOAT
,	TokenNameCOMMA	
DOUBLE	TokenNameIdentifier	 DOUBLE
}	TokenNameRBRACE	
private	TokenNameprivate	
transient	TokenNametransient	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
numericTS	TokenNameIdentifier	 numeric TS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DataType	TokenNameIdentifier	 Data Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
;	TokenNameSEMICOLON	
/** * Creates a field for numeric values using the default <code>precisionStep</code> * {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). The instance is not yet initialized with * a numeric value, before indexing a document containing this field, * set a value using the various set<em>???</em>Value() methods. * This constructor creates an indexed, but not stored field. * @param name the field name */	TokenNameCOMMENT_JAVADOC	 Creates a field for numeric values using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). The instance is not yet initialized with a numeric value, before indexing a document containing this field, set a value using the various set<em>???</em>Value() methods. This constructor creates an indexed, but not stored field. @param name the field name 
public	TokenNamepublic	
NumericField	TokenNameIdentifier	 Numeric Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
PRECISION_STEP_DEFAULT	TokenNameIdentifier	 PRECISION  STEP  DEFAULT
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a field for numeric values using the default <code>precisionStep</code> * {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). The instance is not yet initialized with * a numeric value, before indexing a document containing this field, * set a value using the various set<em>???</em>Value() methods. * @param name the field name * @param store if the field should be stored, {@link Document#getFieldable} * then returns {@code NumericField} instances on search results. * @param index if the field should be indexed using {@link NumericTokenStream} */	TokenNameCOMMENT_JAVADOC	 Creates a field for numeric values using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). The instance is not yet initialized with a numeric value, before indexing a document containing this field, set a value using the various set<em>???</em>Value() methods. @param name the field name @param store if the field should be stored, {@link Document#getFieldable} then returns {@code NumericField} instances on search results. @param index if the field should be indexed using {@link NumericTokenStream} 
public	TokenNamepublic	
NumericField	TokenNameIdentifier	 Numeric Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
store	TokenNameIdentifier	 store
,	TokenNameCOMMA	
boolean	TokenNameboolean	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
PRECISION_STEP_DEFAULT	TokenNameIdentifier	 PRECISION  STEP  DEFAULT
,	TokenNameCOMMA	
store	TokenNameIdentifier	 store
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a field for numeric values with the specified * <code>precisionStep</code>. The instance is not yet initialized with * a numeric value, before indexing a document containing this field, * set a value using the various set<em>???</em>Value() methods. * This constructor creates an indexed, but not stored field. * @param name the field name * @param precisionStep the used <a href="../search/NumericRangeQuery.html#precisionStepDesc">precision step</a> */	TokenNameCOMMENT_JAVADOC	 Creates a field for numeric values with the specified <code>precisionStep</code>. The instance is not yet initialized with a numeric value, before indexing a document containing this field, set a value using the various set<em>???</em>Value() methods. This constructor creates an indexed, but not stored field. @param name the field name @param precisionStep the used <a href="../search/NumericRangeQuery.html#precisionStepDesc">precision step</a> 
public	TokenNamepublic	
NumericField	TokenNameIdentifier	 Numeric Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a field for numeric values with the specified * <code>precisionStep</code>. The instance is not yet initialized with * a numeric value, before indexing a document containing this field, * set a value using the various set<em>???</em>Value() methods. * @param name the field name * @param precisionStep the used <a href="../search/NumericRangeQuery.html#precisionStepDesc">precision step</a> * @param store if the field should be stored, {@link Document#getFieldable} * then returns {@code NumericField} instances on search results. * @param index if the field should be indexed using {@link NumericTokenStream} */	TokenNameCOMMENT_JAVADOC	 Creates a field for numeric values with the specified <code>precisionStep</code>. The instance is not yet initialized with a numeric value, before indexing a document containing this field, set a value using the various set<em>???</em>Value() methods. @param name the field name @param precisionStep the used <a href="../search/NumericRangeQuery.html#precisionStepDesc">precision step</a> @param store if the field should be stored, {@link Document#getFieldable} then returns {@code NumericField} instances on search results. @param index if the field should be indexed using {@link NumericTokenStream} 
public	TokenNamepublic	
NumericField	TokenNameIdentifier	 Numeric Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
store	TokenNameIdentifier	 store
,	TokenNameCOMMA	
boolean	TokenNameboolean	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
store	TokenNameIdentifier	 store
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
?	TokenNameQUESTION	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED_NO_NORMS	TokenNameIdentifier	 ANALYZED  NO  NORMS
:	TokenNameCOLON	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
precisionStep	TokenNameIdentifier	 precision Step
=	TokenNameEQUAL	
precisionStep	TokenNameIdentifier	 precision Step
;	TokenNameSEMICOLON	
setIndexOptions	TokenNameIdentifier	 set Index Options
(	TokenNameLPAREN	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_ONLY	TokenNameIdentifier	 DOCS  ONLY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a {@link NumericTokenStream} for indexing the numeric value. */	TokenNameCOMMENT_JAVADOC	 Returns a {@link NumericTokenStream} for indexing the numeric value. 
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStreamValue	TokenNameIdentifier	 token Stream Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numericTS	TokenNameIdentifier	 numeric TS
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// lazy init the TokenStream as it is heavy to instantiate (attributes,...), 	TokenNameCOMMENT_LINE	lazy init the TokenStream as it is heavy to instantiate (attributes,...), 
// if not needed (stored field loading) 	TokenNameCOMMENT_LINE	if not needed (stored field loading) 
numericTS	TokenNameIdentifier	 numeric TS
=	TokenNameEQUAL	
new	TokenNamenew	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
(	TokenNameLPAREN	
precisionStep	TokenNameIdentifier	 precision Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// initialize value in TokenStream 	TokenNameCOMMENT_LINE	initialize value in TokenStream 
if	TokenNameif	
(	TokenNameLPAREN	
fieldsData	TokenNameIdentifier	 fields Data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Number	TokenNameIdentifier	 Number
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
)	TokenNameRPAREN	
fieldsData	TokenNameIdentifier	 fields Data
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
INT	TokenNameIdentifier	 INT
:	TokenNameCOLON	
numericTS	TokenNameIdentifier	 numeric TS
.	TokenNameDOT	
setIntValue	TokenNameIdentifier	 set Int Value
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LONG	TokenNameIdentifier	 LONG
:	TokenNameCOLON	
numericTS	TokenNameIdentifier	 numeric TS
.	TokenNameDOT	
setLongValue	TokenNameIdentifier	 set Long Value
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FLOAT	TokenNameIdentifier	 FLOAT
:	TokenNameCOLON	
numericTS	TokenNameIdentifier	 numeric TS
.	TokenNameDOT	
setFloatValue	TokenNameIdentifier	 set Float Value
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DOUBLE	TokenNameIdentifier	 DOUBLE
:	TokenNameCOLON	
numericTS	TokenNameIdentifier	 numeric TS
.	TokenNameDOT	
setDoubleValue	TokenNameIdentifier	 set Double Value
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
assert	TokenNameassert	
false	TokenNamefalse	
:	TokenNameCOLON	
"Should never get here"	TokenNameStringLiteral	Should never get here
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
numericTS	TokenNameIdentifier	 numeric TS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns always <code>null</code> for numeric fields */	TokenNameCOMMENT_JAVADOC	 Returns always <code>null</code> for numeric fields 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBinaryValue	TokenNameIdentifier	 get Binary Value
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns always <code>null</code> for numeric fields */	TokenNameCOMMENT_JAVADOC	 Returns always <code>null</code> for numeric fields 
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
readerValue	TokenNameIdentifier	 reader Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the numeric value as a string. This format is also returned if you call {@link Document#get(String)} * on search results. It is recommended to use {@link Document#getFieldable} instead * that returns {@code NumericField} instances. You can then use {@link #getNumericValue} * to return the stored value. */	TokenNameCOMMENT_JAVADOC	 Returns the numeric value as a string. This format is also returned if you call {@link Document#get(String)} on search results. It is recommended to use {@link Document#getFieldable} instead that returns {@code NumericField} instances. You can then use {@link #getNumericValue} to return the stored value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fieldsData	TokenNameIdentifier	 fields Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
fieldsData	TokenNameIdentifier	 fields Data
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the current numeric value as a subclass of {@link Number}, <code>null</code> if not yet initialized. */	TokenNameCOMMENT_JAVADOC	 Returns the current numeric value as a subclass of {@link Number}, <code>null</code> if not yet initialized. 
public	TokenNamepublic	
Number	TokenNameIdentifier	 Number
getNumericValue	TokenNameIdentifier	 get Numeric Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
)	TokenNameRPAREN	
fieldsData	TokenNameIdentifier	 fields Data
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
/** Returns the data type of the current value, {@code null} if not yet set. * @since 3.2 */	TokenNameCOMMENT_JAVADOC	 Returns the data type of the current value, {@code null} if not yet set. @since 3.2 
public	TokenNamepublic	
DataType	TokenNameIdentifier	 Data Type
getDataType	TokenNameIdentifier	 get Data Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the field with the supplied <code>long</code> value. * @param value the numeric value * @return this instance, because of this you can use it the following way: * <code>document.add(new NumericField(name, precisionStep).setLongValue(value))</code> */	TokenNameCOMMENT_JAVADOC	 Initializes the field with the supplied <code>long</code> value. @param value the numeric value @return this instance, because of this you can use it the following way: <code>document.add(new NumericField(name, precisionStep).setLongValue(value))</code> 
public	TokenNamepublic	
NumericField	TokenNameIdentifier	 Numeric Field
setLongValue	TokenNameIdentifier	 set Long Value
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numericTS	TokenNameIdentifier	 numeric TS
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
numericTS	TokenNameIdentifier	 numeric TS
.	TokenNameDOT	
setLongValue	TokenNameIdentifier	 set Long Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsData	TokenNameIdentifier	 fields Data
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
LONG	TokenNameIdentifier	 LONG
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the field with the supplied <code>int</code> value. * @param value the numeric value * @return this instance, because of this you can use it the following way: * <code>document.add(new NumericField(name, precisionStep).setIntValue(value))</code> */	TokenNameCOMMENT_JAVADOC	 Initializes the field with the supplied <code>int</code> value. @param value the numeric value @return this instance, because of this you can use it the following way: <code>document.add(new NumericField(name, precisionStep).setIntValue(value))</code> 
public	TokenNamepublic	
NumericField	TokenNameIdentifier	 Numeric Field
setIntValue	TokenNameIdentifier	 set Int Value
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numericTS	TokenNameIdentifier	 numeric TS
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
numericTS	TokenNameIdentifier	 numeric TS
.	TokenNameDOT	
setIntValue	TokenNameIdentifier	 set Int Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsData	TokenNameIdentifier	 fields Data
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the field with the supplied <code>double</code> value. * @param value the numeric value * @return this instance, because of this you can use it the following way: * <code>document.add(new NumericField(name, precisionStep).setDoubleValue(value))</code> */	TokenNameCOMMENT_JAVADOC	 Initializes the field with the supplied <code>double</code> value. @param value the numeric value @return this instance, because of this you can use it the following way: <code>document.add(new NumericField(name, precisionStep).setDoubleValue(value))</code> 
public	TokenNamepublic	
NumericField	TokenNameIdentifier	 Numeric Field
setDoubleValue	TokenNameIdentifier	 set Double Value
(	TokenNameLPAREN	
final	TokenNamefinal	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numericTS	TokenNameIdentifier	 numeric TS
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
numericTS	TokenNameIdentifier	 numeric TS
.	TokenNameDOT	
setDoubleValue	TokenNameIdentifier	 set Double Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsData	TokenNameIdentifier	 fields Data
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
DOUBLE	TokenNameIdentifier	 DOUBLE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the field with the supplied <code>float</code> value. * @param value the numeric value * @return this instance, because of this you can use it the following way: * <code>document.add(new NumericField(name, precisionStep).setFloatValue(value))</code> */	TokenNameCOMMENT_JAVADOC	 Initializes the field with the supplied <code>float</code> value. @param value the numeric value @return this instance, because of this you can use it the following way: <code>document.add(new NumericField(name, precisionStep).setFloatValue(value))</code> 
public	TokenNamepublic	
NumericField	TokenNameIdentifier	 Numeric Field
setFloatValue	TokenNameIdentifier	 set Float Value
(	TokenNameLPAREN	
final	TokenNamefinal	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numericTS	TokenNameIdentifier	 numeric TS
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
numericTS	TokenNameIdentifier	 numeric TS
.	TokenNameDOT	
setFloatValue	TokenNameIdentifier	 set Float Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsData	TokenNameIdentifier	 fields Data
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
