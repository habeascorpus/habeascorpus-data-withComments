package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AttributeSource	TokenNameIdentifier	 Attribute Source
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
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
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
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
TypeAttribute	TokenNameIdentifier	 Type Attribute
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
;	TokenNameSEMICOLON	
/** * <b>Expert:</b> This class provides a {@link TokenStream} * for indexing numeric values that can be used by {@link * NumericRangeQuery} or {@link NumericRangeFilter}. * * <p>Note that for simple usage, {@link NumericField} is * recommended. {@link NumericField} disables norms and * term freqs, as they are not usually needed during * searching. If you need to change these settings, you * should use this class. * * <p>See {@link NumericField} for capabilities of fields * indexed numerically.</p> * * <p>Here's an example usage, for an <code>int</code> field: * * <pre> * Field field = new Field(name, new NumericTokenStream(precisionStep).setIntValue(value)); * field.setOmitNorms(true); * field.setIndexOptions(IndexOptions.DOCS_ONLY); * document.add(field); * </pre> * * <p>For optimal performance, re-use the TokenStream and Field instance * for more than one document: * * <pre> * NumericTokenStream stream = new NumericTokenStream(precisionStep); * Field field = new Field(name, stream); * field.setOmitNorms(true); * field.setIndexOptions(IndexOptions.DOCS_ONLY); * Document document = new Document(); * document.add(field); * * for(all documents) { * stream.setIntValue(value) * writer.addDocument(document); * } * </pre> * * <p>This stream is not intended to be used in analyzers; * it's more for iterating the different precisions during * indexing a specific numeric value.</p> * <p><b>NOTE</b>: as token streams are only consumed once * the document is added to the index, if you index more * than one numeric field, use a separate <code>NumericTokenStream</code> * instance for each.</p> * * <p>See {@link NumericRangeQuery} for more details on the * <a * href="../search/NumericRangeQuery.html#precisionStepDesc"><code>precisionStep</code></a> * parameter as well as how numeric fields work under the hood.</p> * * @since 2.9 */	TokenNameCOMMENT_JAVADOC	 <b>Expert:</b> This class provides a {@link TokenStream} for indexing numeric values that can be used by {@link NumericRangeQuery} or {@link NumericRangeFilter}. * <p>Note that for simple usage, {@link NumericField} is recommended. {@link NumericField} disables norms and term freqs, as they are not usually needed during searching. If you need to change these settings, you should use this class. * <p>See {@link NumericField} for capabilities of fields indexed numerically.</p> * <p>Here's an example usage, for an <code>int</code> field: * <pre> Field field = new Field(name, new NumericTokenStream(precisionStep).setIntValue(value)); field.setOmitNorms(true); field.setIndexOptions(IndexOptions.DOCS_ONLY); document.add(field); </pre> * <p>For optimal performance, re-use the TokenStream and Field instance for more than one document: * <pre> NumericTokenStream stream = new NumericTokenStream(precisionStep); Field field = new Field(name, stream); field.setOmitNorms(true); field.setIndexOptions(IndexOptions.DOCS_ONLY); Document document = new Document(); document.add(field); * for(all documents) { stream.setIntValue(value) writer.addDocument(document); } </pre> * <p>This stream is not intended to be used in analyzers; it's more for iterating the different precisions during indexing a specific numeric value.</p> <p><b>NOTE</b>: as token streams are only consumed once the document is added to the index, if you index more than one numeric field, use a separate <code>NumericTokenStream</code> instance for each.</p> * <p>See {@link NumericRangeQuery} for more details on the <a href="../search/NumericRangeQuery.html#precisionStepDesc"><code>precisionStep</code></a> parameter as well as how numeric fields work under the hood.</p> * @since 2.9 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
extends	TokenNameextends	
TokenStream	TokenNameIdentifier	 Token Stream
{	TokenNameLBRACE	
/** The full precision token gets this token type assigned. */	TokenNameCOMMENT_JAVADOC	 The full precision token gets this token type assigned. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TOKEN_TYPE_FULL_PREC	TokenNameIdentifier	 TOKEN  TYPE  FULL  PREC
=	TokenNameEQUAL	
"fullPrecNumeric"	TokenNameStringLiteral	fullPrecNumeric
;	TokenNameSEMICOLON	
/** The lower precision tokens gets this token type assigned. */	TokenNameCOMMENT_JAVADOC	 The lower precision tokens gets this token type assigned. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TOKEN_TYPE_LOWER_PREC	TokenNameIdentifier	 TOKEN  TYPE  LOWER  PREC
=	TokenNameEQUAL	
"lowerPrecNumeric"	TokenNameStringLiteral	lowerPrecNumeric
;	TokenNameSEMICOLON	
/** * Creates a token stream for numeric values using the default <code>precisionStep</code> * {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). The stream is not yet initialized, * before using set a value using the various set<em>???</em>Value() methods. */	TokenNameCOMMENT_JAVADOC	 Creates a token stream for numeric values using the default <code>precisionStep</code> {@link NumericUtils#PRECISION_STEP_DEFAULT} (4). The stream is not yet initialized, before using set a value using the various set<em>???</em>Value() methods. 
public	TokenNamepublic	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
PRECISION_STEP_DEFAULT	TokenNameIdentifier	 PRECISION  STEP  DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a token stream for numeric values with the specified * <code>precisionStep</code>. The stream is not yet initialized, * before using set a value using the various set<em>???</em>Value() methods. */	TokenNameCOMMENT_JAVADOC	 Creates a token stream for numeric values with the specified <code>precisionStep</code>. The stream is not yet initialized, before using set a value using the various set<em>???</em>Value() methods. 
public	TokenNamepublic	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
precisionStep	TokenNameIdentifier	 precision Step
=	TokenNameEQUAL	
precisionStep	TokenNameIdentifier	 precision Step
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
}	TokenNameRBRACE	
/** * Expert: Creates a token stream for numeric values with the specified * <code>precisionStep</code> using the given {@link AttributeSource}. * The stream is not yet initialized, * before using set a value using the various set<em>???</em>Value() methods. */	TokenNameCOMMENT_JAVADOC	 Expert: Creates a token stream for numeric values with the specified <code>precisionStep</code> using the given {@link AttributeSource}. The stream is not yet initialized, before using set a value using the various set<em>???</em>Value() methods. 
public	TokenNamepublic	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
precisionStep	TokenNameIdentifier	 precision Step
=	TokenNameEQUAL	
precisionStep	TokenNameIdentifier	 precision Step
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
}	TokenNameRBRACE	
/** * Expert: Creates a token stream for numeric values with the specified * <code>precisionStep</code> using the given * {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. * The stream is not yet initialized, * before using set a value using the various set<em>???</em>Value() methods. */	TokenNameCOMMENT_JAVADOC	 Expert: Creates a token stream for numeric values with the specified <code>precisionStep</code> using the given {@link org.apache.lucene.util.AttributeSource.AttributeFactory}. The stream is not yet initialized, before using set a value using the various set<em>???</em>Value() methods. 
public	TokenNamepublic	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
precisionStep	TokenNameIdentifier	 precision Step
=	TokenNameEQUAL	
precisionStep	TokenNameIdentifier	 precision Step
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
}	TokenNameRBRACE	
/** * Initializes the token stream with the supplied <code>long</code> value. * @param value the value, for which this TokenStream should enumerate tokens. * @return this instance, because of this you can use it the following way: * <code>new Field(name, new NumericTokenStream(precisionStep).setLongValue(value))</code> */	TokenNameCOMMENT_JAVADOC	 Initializes the token stream with the supplied <code>long</code> value. @param value the value, for which this TokenStream should enumerate tokens. @return this instance, because of this you can use it the following way: <code>new Field(name, new NumericTokenStream(precisionStep).setLongValue(value))</code> 
public	TokenNamepublic	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
setLongValue	TokenNameIdentifier	 set Long Value
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
valSize	TokenNameIdentifier	 val Size
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the token stream with the supplied <code>int</code> value. * @param value the value, for which this TokenStream should enumerate tokens. * @return this instance, because of this you can use it the following way: * <code>new Field(name, new NumericTokenStream(precisionStep).setIntValue(value))</code> */	TokenNameCOMMENT_JAVADOC	 Initializes the token stream with the supplied <code>int</code> value. @param value the value, for which this TokenStream should enumerate tokens. @return this instance, because of this you can use it the following way: <code>new Field(name, new NumericTokenStream(precisionStep).setIntValue(value))</code> 
public	TokenNamepublic	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
setIntValue	TokenNameIdentifier	 set Int Value
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
valSize	TokenNameIdentifier	 val Size
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the token stream with the supplied <code>double</code> value. * @param value the value, for which this TokenStream should enumerate tokens. * @return this instance, because of this you can use it the following way: * <code>new Field(name, new NumericTokenStream(precisionStep).setDoubleValue(value))</code> */	TokenNameCOMMENT_JAVADOC	 Initializes the token stream with the supplied <code>double</code> value. @param value the value, for which this TokenStream should enumerate tokens. @return this instance, because of this you can use it the following way: <code>new Field(name, new NumericTokenStream(precisionStep).setDoubleValue(value))</code> 
public	TokenNamepublic	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
setDoubleValue	TokenNameIdentifier	 set Double Value
(	TokenNameLPAREN	
final	TokenNamefinal	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
doubleToSortableLong	TokenNameIdentifier	 double To Sortable Long
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
valSize	TokenNameIdentifier	 val Size
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the token stream with the supplied <code>float</code> value. * @param value the value, for which this TokenStream should enumerate tokens. * @return this instance, because of this you can use it the following way: * <code>new Field(name, new NumericTokenStream(precisionStep).setFloatValue(value))</code> */	TokenNameCOMMENT_JAVADOC	 Initializes the token stream with the supplied <code>float</code> value. @param value the value, for which this TokenStream should enumerate tokens. @return this instance, because of this you can use it the following way: <code>new Field(name, new NumericTokenStream(precisionStep).setFloatValue(value))</code> 
public	TokenNamepublic	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
setFloatValue	TokenNameIdentifier	 set Float Value
(	TokenNameLPAREN	
final	TokenNamefinal	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
floatToSortableInt	TokenNameIdentifier	 float To Sortable Int
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
valSize	TokenNameIdentifier	 val Size
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
valSize	TokenNameIdentifier	 val Size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"call set???Value() before usage"	TokenNameStringLiteral	call set???Value() before usage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
valSize	TokenNameIdentifier	 val Size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"call set???Value() before usage"	TokenNameStringLiteral	call set???Value() before usage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
>=	TokenNameGREATER_EQUAL	
valSize	TokenNameIdentifier	 val Size
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
valSize	TokenNameIdentifier	 val Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
64	TokenNameIntegerLiteral	
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
BUF_SIZE_LONG	TokenNameIdentifier	 BUF  SIZE  LONG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
longToPrefixCoded	TokenNameIdentifier	 long To Prefix Coded
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
32	TokenNameIntegerLiteral	
:	TokenNameCOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
BUF_SIZE_INT	TokenNameIdentifier	 BUF  SIZE  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
intToPrefixCoded	TokenNameIdentifier	 int To Prefix Coded
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// should not happen 	TokenNameCOMMENT_LINE	should not happen 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"valSize must be 32 or 64"	TokenNameStringLiteral	valSize must be 32 or 64
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
TOKEN_TYPE_FULL_PREC	TokenNameIdentifier	 TOKEN  TYPE  FULL  PREC
:	TokenNameCOLON	
TOKEN_TYPE_LOWER_PREC	TokenNameIdentifier	 TOKEN  TYPE  LOWER  PREC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shift	TokenNameIdentifier	 shift
+=	TokenNamePLUS_EQUAL	
precisionStep	TokenNameIdentifier	 precision Step
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
"(numeric,valSize="	TokenNameStringLiteral	(numeric,valSize=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
valSize	TokenNameIdentifier	 val Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
",precisionStep="	TokenNameStringLiteral	,precisionStep=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
precisionStep	TokenNameIdentifier	 precision Step
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
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
precisionStep	TokenNameIdentifier	 precision Step
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// members 	TokenNameCOMMENT_LINE	members 
private	TokenNameprivate	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
valSize	TokenNameIdentifier	 val Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// valSize==0 means not initialized 	TokenNameCOMMENT_LINE	valSize==0 means not initialized 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
