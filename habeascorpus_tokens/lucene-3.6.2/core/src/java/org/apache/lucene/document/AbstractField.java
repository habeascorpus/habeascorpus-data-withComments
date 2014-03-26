package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** * Copyright 2006 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2006 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
PhraseQuery	TokenNameIdentifier	 Phrase Query
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
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanQuery	TokenNameIdentifier	 Span Query
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
TokenStream	TokenNameIdentifier	 Token Stream
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
FieldInvertState	TokenNameIdentifier	 Field Invert State
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
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
FieldInvertState	TokenNameIdentifier	 Field Invert State
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
/** * Base class for Field implementations * **/	TokenNameCOMMENT_JAVADOC	 Base class for Field implementations *
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractField	TokenNameIdentifier	 Abstract Field
implements	TokenNameimplements	
Fieldable	TokenNameIdentifier	 Fieldable
{	TokenNameLBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
"body"	TokenNameStringLiteral	body
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
storeTermVector	TokenNameIdentifier	 store Term Vector
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
storeOffsetWithTermVector	TokenNameIdentifier	 store Offset With Term Vector
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
storePositionWithTermVector	TokenNameIdentifier	 store Position With Term Vector
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isStored	TokenNameIdentifier	 is Stored
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isTokenized	TokenNameIdentifier	 is Tokenized
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isBinary	TokenNameIdentifier	 is Binary
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
lazy	TokenNameIdentifier	 lazy
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
IndexOptions	TokenNameIdentifier	 Index Options
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
// the data object for all different kind of field values 	TokenNameCOMMENT_LINE	the data object for all different kind of field values 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
fieldsData	TokenNameIdentifier	 fields Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// pre-analyzed tokenStream for indexed fields 	TokenNameCOMMENT_LINE	pre-analyzed tokenStream for indexed fields 
protected	TokenNameprotected	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
;	TokenNameSEMICOLON	
// length/offset for all primitive types 	TokenNameCOMMENT_LINE	length/offset for all primitive types 
protected	TokenNameprotected	
int	TokenNameint	
binaryLength	TokenNameIdentifier	 binary Length
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
binaryOffset	TokenNameIdentifier	 binary Offset
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
AbstractField	TokenNameIdentifier	 Abstract Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
AbstractField	TokenNameIdentifier	 Abstract Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
store	TokenNameIdentifier	 store
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
termVector	TokenNameIdentifier	 term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"name cannot be null"	TokenNameStringLiteral	name cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// field names are interned 	TokenNameCOMMENT_LINE	field names are interned 
this	TokenNamethis	
.	TokenNameDOT	
isStored	TokenNameIdentifier	 is Stored
=	TokenNameEQUAL	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isTokenized	TokenNameIdentifier	 is Tokenized
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
isAnalyzed	TokenNameIdentifier	 is Analyzed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isBinary	TokenNameIdentifier	 is Binary
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
setStoreTermVector	TokenNameIdentifier	 set Store Term Vector
(	TokenNameLPAREN	
termVector	TokenNameIdentifier	 term Vector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the boost factor hits on this field. This value will be * multiplied into the score of all hits on this this field of this * document. * * <p>The boost is multiplied by {@link org.apache.lucene.document.Document#getBoost()} of the document * containing this field. If a document has multiple fields with the same * name, all such values are multiplied together. This product is then * used to compute the norm factor for the field. By * default, in the {@link * org.apache.lucene.search.Similarity#computeNorm(String, * FieldInvertState)} method, the boost value is multiplied * by the {@link * org.apache.lucene.search.Similarity#lengthNorm(String, * int)} and then * rounded by {@link org.apache.lucene.search.Similarity#encodeNormValue(float)} before it is stored in the * index. One should attempt to ensure that this product does not overflow * the range of that encoding. * * @see org.apache.lucene.document.Document#setBoost(float) * @see org.apache.lucene.search.Similarity#computeNorm(String, FieldInvertState) * @see org.apache.lucene.search.Similarity#encodeNormValue(float) */	TokenNameCOMMENT_JAVADOC	 Sets the boost factor hits on this field. This value will be multiplied into the score of all hits on this this field of this document. * <p>The boost is multiplied by {@link org.apache.lucene.document.Document#getBoost()} of the document containing this field. If a document has multiple fields with the same name, all such values are multiplied together. This product is then used to compute the norm factor for the field. By default, in the {@link org.apache.lucene.search.Similarity#computeNorm(String, FieldInvertState)} method, the boost value is multiplied by the {@link org.apache.lucene.search.Similarity#lengthNorm(String, int)} and then rounded by {@link org.apache.lucene.search.Similarity#encodeNormValue(float)} before it is stored in the index. One should attempt to ensure that this product does not overflow the range of that encoding. * @see org.apache.lucene.document.Document#setBoost(float) @see org.apache.lucene.search.Similarity#computeNorm(String, FieldInvertState) @see org.apache.lucene.search.Similarity#encodeNormValue(float) 
public	TokenNamepublic	
void	TokenNamevoid	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the boost factor for hits for this field. * * <p>The default value is 1.0. * * <p>Note: this value is not stored directly with the document in the index. * Documents returned from {@link org.apache.lucene.index.IndexReader#document(int)} and * {@link org.apache.lucene.search.Searcher#doc(int)} may thus not have the same value present as when * this field was indexed. * * @see #setBoost(float) */	TokenNameCOMMENT_JAVADOC	 Returns the boost factor for hits for this field. * <p>The default value is 1.0. * <p>Note: this value is not stored directly with the document in the index. Documents returned from {@link org.apache.lucene.index.IndexReader#document(int)} and {@link org.apache.lucene.search.Searcher#doc(int)} may thus not have the same value present as when this field was indexed. * @see #setBoost(float) 
public	TokenNamepublic	
float	TokenNamefloat	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the name of the field as an interned string. * For example "date", "title", "body", ... */	TokenNameCOMMENT_JAVADOC	 Returns the name of the field as an interned string. For example "date", "title", "body", ... 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
setStoreTermVector	TokenNameIdentifier	 set Store Term Vector
(	TokenNameLPAREN	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
termVector	TokenNameIdentifier	 term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
=	TokenNameEQUAL	
termVector	TokenNameIdentifier	 term Vector
.	TokenNameDOT	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
storePositionWithTermVector	TokenNameIdentifier	 store Position With Term Vector
=	TokenNameEQUAL	
termVector	TokenNameIdentifier	 term Vector
.	TokenNameDOT	
withPositions	TokenNameIdentifier	 with Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
storeOffsetWithTermVector	TokenNameIdentifier	 store Offset With Term Vector
=	TokenNameEQUAL	
termVector	TokenNameIdentifier	 term Vector
.	TokenNameDOT	
withOffsets	TokenNameIdentifier	 with Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** True iff the value of the field is to be stored in the index for return with search hits. It is an error for this to be true if a field is Reader-valued. */	TokenNameCOMMENT_JAVADOC	 True iff the value of the field is to be stored in the index for return with search hits. It is an error for this to be true if a field is Reader-valued. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isStored	TokenNameIdentifier	 is Stored
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** True iff the value of the field is to be indexed, so that it may be searched on. */	TokenNameCOMMENT_JAVADOC	 True iff the value of the field is to be indexed, so that it may be searched on. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isIndexed	TokenNameIdentifier	 is Indexed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** True iff the value of the field should be tokenized as text prior to indexing. Un-tokenized fields are indexed as a single word and may not be Reader-valued. */	TokenNameCOMMENT_JAVADOC	 True iff the value of the field should be tokenized as text prior to indexing. Un-tokenized fields are indexed as a single word and may not be Reader-valued. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isTokenized	TokenNameIdentifier	 is Tokenized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isTokenized	TokenNameIdentifier	 is Tokenized
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** True iff the term or terms used to index this field are stored as a term * vector, available from {@link org.apache.lucene.index.IndexReader#getTermFreqVector(int,String)}. * These methods do not provide access to the original content of the field, * only to terms used to index it. If the original content must be * preserved, use the <code>stored</code> attribute instead. * * @see org.apache.lucene.index.IndexReader#getTermFreqVector(int, String) */	TokenNameCOMMENT_JAVADOC	 True iff the term or terms used to index this field are stored as a term vector, available from {@link org.apache.lucene.index.IndexReader#getTermFreqVector(int,String)}. These methods do not provide access to the original content of the field, only to terms used to index it. If the original content must be preserved, use the <code>stored</code> attribute instead. * @see org.apache.lucene.index.IndexReader#getTermFreqVector(int, String) 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isTermVectorStored	TokenNameIdentifier	 is Term Vector Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
storeTermVector	TokenNameIdentifier	 store Term Vector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * True iff terms are stored as term vector together with their offsets * (start and end position in source text). */	TokenNameCOMMENT_JAVADOC	 True iff terms are stored as term vector together with their offsets (start and end position in source text). 
public	TokenNamepublic	
boolean	TokenNameboolean	
isStoreOffsetWithTermVector	TokenNameIdentifier	 is Store Offset With Term Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
storeOffsetWithTermVector	TokenNameIdentifier	 store Offset With Term Vector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * True iff terms are stored as term vector together with their token positions. */	TokenNameCOMMENT_JAVADOC	 True iff terms are stored as term vector together with their token positions. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isStorePositionWithTermVector	TokenNameIdentifier	 is Store Position With Term Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
storePositionWithTermVector	TokenNameIdentifier	 store Position With Term Vector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** True iff the value of the filed is stored as binary */	TokenNameCOMMENT_JAVADOC	 True iff the value of the filed is stored as binary 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isBinary	TokenNameIdentifier	 is Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isBinary	TokenNameIdentifier	 is Binary
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the raw byte[] for the binary field. Note that * you must also call {@link #getBinaryLength} and {@link * #getBinaryOffset} to know which range of bytes in this * returned array belong to the field. * @return reference to the Field value as byte[]. */	TokenNameCOMMENT_JAVADOC	 Return the raw byte[] for the binary field. Note that you must also call {@link #getBinaryLength} and {@link #getBinaryOffset} to know which range of bytes in this returned array belong to the field. @return reference to the Field value as byte[]. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBinaryValue	TokenNameIdentifier	 get Binary Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getBinaryValue	TokenNameIdentifier	 get Binary Value
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
isBinary	TokenNameIdentifier	 is Binary
||	TokenNameOR_OR	
fieldsData	TokenNameIdentifier	 fields Data
instanceof	TokenNameinstanceof	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
fieldsData	TokenNameIdentifier	 fields Data
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns length of byte[] segment that is used as value, if Field is not binary * returned value is undefined * @return length of byte[] segment that represents this Field value */	TokenNameCOMMENT_JAVADOC	 Returns length of byte[] segment that is used as value, if Field is not binary returned value is undefined @return length of byte[] segment that represents this Field value 
public	TokenNamepublic	
int	TokenNameint	
getBinaryLength	TokenNameIdentifier	 get Binary Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBinary	TokenNameIdentifier	 is Binary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
binaryLength	TokenNameIdentifier	 binary Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fieldsData	TokenNameIdentifier	 fields Data
instanceof	TokenNameinstanceof	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
fieldsData	TokenNameIdentifier	 fields Data
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns offset into byte[] segment that is used as value, if Field is not binary * returned value is undefined * @return index of the first character in byte[] segment that represents this Field value */	TokenNameCOMMENT_JAVADOC	 Returns offset into byte[] segment that is used as value, if Field is not binary returned value is undefined @return index of the first character in byte[] segment that represents this Field value 
public	TokenNamepublic	
int	TokenNameint	
getBinaryOffset	TokenNameIdentifier	 get Binary Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
binaryOffset	TokenNameIdentifier	 binary Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** True if norms are omitted for this indexed field */	TokenNameCOMMENT_JAVADOC	 True if norms are omitted for this indexed field 
public	TokenNamepublic	
boolean	TokenNameboolean	
getOmitNorms	TokenNameIdentifier	 get Omit Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
omitNorms	TokenNameIdentifier	 omit Norms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated use {@link #getIndexOptions()} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #getIndexOptions()} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
boolean	TokenNameboolean	
getOmitTermFreqAndPositions	TokenNameIdentifier	 get Omit Term Freq And Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_ONLY	TokenNameIdentifier	 DOCS  ONLY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see #setIndexOptions */	TokenNameCOMMENT_JAVADOC	 @see #setIndexOptions 
public	TokenNamepublic	
IndexOptions	TokenNameIdentifier	 Index Options
getIndexOptions	TokenNameIdentifier	 get Index Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
indexOptions	TokenNameIdentifier	 index Options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: * * If set, omit normalization factors associated with this indexed field. * This effectively disables indexing boosts and length normalization for this field. */	TokenNameCOMMENT_JAVADOC	 Expert: * If set, omit normalization factors associated with this indexed field. This effectively disables indexing boosts and length normalization for this field. 
public	TokenNamepublic	
void	TokenNamevoid	
setOmitNorms	TokenNameIdentifier	 set Omit Norms
(	TokenNameLPAREN	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
=	TokenNameEQUAL	
omitNorms	TokenNameIdentifier	 omit Norms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated use {@link #setIndexOptions(FieldInfo.IndexOptions)} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #setIndexOptions(FieldInfo.IndexOptions)} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
setOmitTermFreqAndPositions	TokenNameIdentifier	 set Omit Term Freq And Positions
(	TokenNameLPAREN	
boolean	TokenNameboolean	
omitTermFreqAndPositions	TokenNameIdentifier	 omit Term Freq And Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
omitTermFreqAndPositions	TokenNameIdentifier	 omit Term Freq And Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_ONLY	TokenNameIdentifier	 DOCS  ONLY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Expert: * * If set, omit term freq, and optionally also positions and payloads from * postings for this field. * * <p><b>NOTE</b>: While this option reduces storage space * required in the index, it also means any query * requiring positional information, such as {@link * PhraseQuery} or {@link SpanQuery} subclasses will * silently fail to find results. */	TokenNameCOMMENT_JAVADOC	 Expert: * If set, omit term freq, and optionally also positions and payloads from postings for this field. * <p><b>NOTE</b>: While this option reduces storage space required in the index, it also means any query requiring positional information, such as {@link PhraseQuery} or {@link SpanQuery} subclasses will silently fail to find results. 
public	TokenNamepublic	
void	TokenNamevoid	
setIndexOptions	TokenNameIdentifier	 set Index Options
(	TokenNameLPAREN	
IndexOptions	TokenNameIdentifier	 Index Options
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
indexOptions	TokenNameIdentifier	 index Options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isLazy	TokenNameIdentifier	 is Lazy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lazy	TokenNameIdentifier	 lazy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Prints a Field for human consumption. */	TokenNameCOMMENT_JAVADOC	 Prints a Field for human consumption. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isStored	TokenNameIdentifier	 is Stored
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"stored"	TokenNameStringLiteral	stored
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isIndexed	TokenNameIdentifier	 is Indexed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"indexed"	TokenNameStringLiteral	indexed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTokenized	TokenNameIdentifier	 is Tokenized
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"tokenized"	TokenNameStringLiteral	tokenized
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
storeTermVector	TokenNameIdentifier	 store Term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"termVector"	TokenNameStringLiteral	termVector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
storeOffsetWithTermVector	TokenNameIdentifier	 store Offset With Term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"termVectorOffsets"	TokenNameStringLiteral	termVectorOffsets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
storePositionWithTermVector	TokenNameIdentifier	 store Position With Term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"termVectorPosition"	TokenNameStringLiteral	termVectorPosition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBinary	TokenNameIdentifier	 is Binary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"binary"	TokenNameStringLiteral	binary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
omitNorms	TokenNameIdentifier	 omit Norms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
",omitNorms"	TokenNameStringLiteral	,omitNorms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
indexOptions	TokenNameIdentifier	 index Options
!=	TokenNameNOT_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
",indexOptions="	TokenNameStringLiteral	,indexOptions=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lazy	TokenNameIdentifier	 lazy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
",lazy"	TokenNameStringLiteral	,lazy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldsData	TokenNameIdentifier	 fields Data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
lazy	TokenNameIdentifier	 lazy
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fieldsData	TokenNameIdentifier	 fields Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
