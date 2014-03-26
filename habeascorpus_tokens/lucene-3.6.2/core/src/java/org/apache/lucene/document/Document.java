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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
// for javadoc 	TokenNameCOMMENT_LINE	for javadoc 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
ScoreDoc	TokenNameIdentifier	 Score Doc
;	TokenNameSEMICOLON	
// for javadoc 	TokenNameCOMMENT_LINE	for javadoc 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Searcher	TokenNameIdentifier	 Searcher
;	TokenNameSEMICOLON	
// for javadoc 	TokenNameCOMMENT_LINE	for javadoc 
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
// for javadoc 	TokenNameCOMMENT_LINE	for javadoc 
/** Documents are the unit of indexing and search. * * A Document is a set of fields. Each field has a name and a textual value. * A field may be {@link Fieldable#isStored() stored} with the document, in which * case it is returned with search hits on the document. Thus each document * should typically contain one or more stored fields which uniquely identify * it. * * <p>Note that fields which are <i>not</i> {@link Fieldable#isStored() stored} are * <i>not</i> available in documents retrieved from the index, e.g. with {@link * ScoreDoc#doc}, {@link Searcher#doc(int)} or {@link * IndexReader#document(int)}. */	TokenNameCOMMENT_JAVADOC	 Documents are the unit of indexing and search. * A Document is a set of fields. Each field has a name and a textual value. A field may be {@link Fieldable#isStored() stored} with the document, in which case it is returned with search hits on the document. Thus each document should typically contain one or more stored fields which uniquely identify it. * <p>Note that fields which are <i>not</i> {@link Fieldable#isStored() stored} are <i>not</i> available in documents retrieved from the index, e.g. with {@link ScoreDoc#doc}, {@link Searcher#doc(int)} or {@link IndexReader#document(int)}. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Document	TokenNameIdentifier	 Document
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Fieldable	TokenNameIdentifier	 Fieldable
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Fieldable	TokenNameIdentifier	 Fieldable
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
/** Constructs a new document with no fields. */	TokenNameCOMMENT_JAVADOC	 Constructs a new document with no fields. 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Sets a boost factor for hits on any field of this document. This value * will be multiplied into the score of all hits on this document. * * <p>The default value is 1.0. * * <p>Values are multiplied into the value of {@link Fieldable#getBoost()} of * each field in this document. Thus, this method in effect sets a default * boost for the fields of this document. * * @see Fieldable#setBoost(float) */	TokenNameCOMMENT_JAVADOC	 Sets a boost factor for hits on any field of this document. This value will be multiplied into the score of all hits on this document. * <p>The default value is 1.0. * <p>Values are multiplied into the value of {@link Fieldable#getBoost()} of each field in this document. Thus, this method in effect sets a default boost for the fields of this document. * @see Fieldable#setBoost(float) 
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
/** Returns, at indexing time, the boost factor as set by {@link #setBoost(float)}. * * <p>Note that once a document is indexed this value is no longer available * from the index. At search time, for retrieved documents, this method always * returns 1. This however does not mean that the boost value set at indexing * time was ignored - it was just combined with other indexing time factors and * stored elsewhere, for better indexing and search performance. (For more * information see the "norm(t,d)" part of the scoring formula in * {@link org.apache.lucene.search.Similarity Similarity}.) * * @see #setBoost(float) */	TokenNameCOMMENT_JAVADOC	 Returns, at indexing time, the boost factor as set by {@link #setBoost(float)}. * <p>Note that once a document is indexed this value is no longer available from the index. At search time, for retrieved documents, this method always returns 1. This however does not mean that the boost value set at indexing time was ignored - it was just combined with other indexing time factors and stored elsewhere, for better indexing and search performance. (For more information see the "norm(t,d)" part of the scoring formula in {@link org.apache.lucene.search.Similarity Similarity}.) * @see #setBoost(float) 
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
/** * <p>Adds a field to a document. Several fields may be added with * the same name. In this case, if the fields are indexed, their text is * treated as though appended for the purposes of search.</p> * <p> Note that add like the removeField(s) methods only makes sense * prior to adding a document to an index. These methods cannot * be used to change the content of an existing index! In order to achieve this, * a document has to be deleted from an index and a new changed version of that * document has to be added.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Adds a field to a document. Several fields may be added with the same name. In this case, if the fields are indexed, their text is treated as though appended for the purposes of search.</p> <p> Note that add like the removeField(s) methods only makes sense prior to adding a document to an index. These methods cannot be used to change the content of an existing index! In order to achieve this, a document has to be deleted from an index and a new changed version of that document has to be added.</p> 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Removes field with the specified name from the document. * If multiple fields exist with this name, this method removes the first field that has been added. * If there is no field with the specified name, the document remains unchanged.</p> * <p> Note that the removeField(s) methods like the add method only make sense * prior to adding a document to an index. These methods cannot * be used to change the content of an existing index! In order to achieve this, * a document has to be deleted from an index and a new changed version of that * document has to be added.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Removes field with the specified name from the document. If multiple fields exist with this name, this method removes the first field that has been added. If there is no field with the specified name, the document remains unchanged.</p> <p> Note that the removeField(s) methods like the add method only make sense prior to adding a document to an index. These methods cannot be used to change the content of an existing index! In order to achieve this, a document has to be deleted from an index and a new changed version of that document has to be added.</p> 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
removeField	TokenNameIdentifier	 remove Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Fieldable	TokenNameIdentifier	 Fieldable
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Removes all fields with the given name from the document. * If there is no field with the specified name, the document remains unchanged.</p> * <p> Note that the removeField(s) methods like the add method only make sense * prior to adding a document to an index. These methods cannot * be used to change the content of an existing index! In order to achieve this, * a document has to be deleted from an index and a new changed version of that * document has to be added.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Removes all fields with the given name from the document. If there is no field with the specified name, the document remains unchanged.</p> <p> Note that the removeField(s) methods like the add method only make sense prior to adding a document to an index. These methods cannot be used to change the content of an existing index! In order to achieve this, a document has to be deleted from an index and a new changed version of that document has to be added.</p> 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
removeFields	TokenNameIdentifier	 remove Fields
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Fieldable	TokenNameIdentifier	 Fieldable
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns a field with the given name if any exist in this document, or * null. If multiple fields exists with this name, this method returns the * first value added. * Do not use this method with lazy loaded fields or {@link NumericField}. * @deprecated use {@link #getFieldable} instead and cast depending on * data type. * @throws ClassCastException if you try to retrieve a numerical or * lazy loaded field. */	TokenNameCOMMENT_JAVADOC	 Returns a field with the given name if any exist in this document, or null. If multiple fields exists with this name, this method returns the first value added. Do not use this method with lazy loaded fields or {@link NumericField}. @deprecated use {@link #getFieldable} instead and cast depending on data type. @throws ClassCastException if you try to retrieve a numerical or lazy loaded field. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Field	TokenNameIdentifier	 Field
)	TokenNameRPAREN	
getFieldable	TokenNameIdentifier	 get Fieldable
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a field with the given name if any exist in this document, or * null. If multiple fields exists with this name, this method returns the * first value added. */	TokenNameCOMMENT_JAVADOC	 Returns a field with the given name if any exist in this document, or null. If multiple fields exists with this name, this method returns the first value added. 
public	TokenNamepublic	
Fieldable	TokenNameIdentifier	 Fieldable
getFieldable	TokenNameIdentifier	 get Fieldable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the string value of the field with the given name if any exist in * this document, or null. If multiple fields exist with this name, this * method returns the first value added. If only binary fields with this name * exist, returns null. * For {@link NumericField} it returns the string value of the number. If you want * the actual {@code NumericField} instance back, use {@link #getFieldable}. */	TokenNameCOMMENT_JAVADOC	 Returns the string value of the field with the given name if any exist in this document, or null. If multiple fields exist with this name, this method returns the first value added. If only binary fields with this name exist, returns null. For {@link NumericField} it returns the string value of the number. If you want the actual {@code NumericField} instance back, use {@link #getFieldable}. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isBinary	TokenNameIdentifier	 is Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a List of all the fields in a document. * <p>Note that fields which are <i>not</i> {@link Fieldable#isStored() stored} are * <i>not</i> available in documents retrieved from the * index, e.g. {@link Searcher#doc(int)} or {@link * IndexReader#document(int)}. */	TokenNameCOMMENT_JAVADOC	 Returns a List of all the fields in a document. <p>Note that fields which are <i>not</i> {@link Fieldable#isStored() stored} are <i>not</i> available in documents retrieved from the index, e.g. {@link Searcher#doc(int)} or {@link IndexReader#document(int)}. 
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Fieldable	TokenNameIdentifier	 Fieldable
>	TokenNameGREATER	
getFields	TokenNameIdentifier	 get Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NO_FIELDS	TokenNameIdentifier	 NO  FIELDS
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Returns an array of {@link Field}s with the given name. * This method returns an empty array when there are no * matching fields. It never returns null. * Do not use this method with lazy loaded fields or {@link NumericField}. * * @param name the name of the field * @return a <code>Field[]</code> array * @deprecated use {@link #getFieldable} instead and cast depending on * data type. * @throws ClassCastException if you try to retrieve a numerical or * lazy loaded field. */	TokenNameCOMMENT_JAVADOC	 Returns an array of {@link Field}s with the given name. This method returns an empty array when there are no matching fields. It never returns null. Do not use this method with lazy loaded fields or {@link NumericField}. * @param name the name of the field @return a <code>Field[]</code> array @deprecated use {@link #getFieldable} instead and cast depending on data type. @throws ClassCastException if you try to retrieve a numerical or lazy loaded field. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFields	TokenNameIdentifier	 get Fields
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Field	TokenNameIdentifier	 Field
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Field	TokenNameIdentifier	 Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Field	TokenNameIdentifier	 Field
)	TokenNameRPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
NO_FIELDS	TokenNameIdentifier	 NO  FIELDS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Fieldable	TokenNameIdentifier	 Fieldable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NO_FIELDABLES	TokenNameIdentifier	 NO  FIELDABLES
=	TokenNameEQUAL	
new	TokenNamenew	
Fieldable	TokenNameIdentifier	 Fieldable
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Returns an array of {@link Fieldable}s with the given name. * This method returns an empty array when there are no * matching fields. It never returns null. * * @param name the name of the field * @return a <code>Fieldable[]</code> array */	TokenNameCOMMENT_JAVADOC	 Returns an array of {@link Fieldable}s with the given name. This method returns an empty array when there are no matching fields. It never returns null. * @param name the name of the field @return a <code>Fieldable[]</code> array 
public	TokenNamepublic	
Fieldable	TokenNameIdentifier	 Fieldable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFieldables	TokenNameIdentifier	 get Fieldables
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Fieldable	TokenNameIdentifier	 Fieldable
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Fieldable	TokenNameIdentifier	 Fieldable
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
NO_FIELDABLES	TokenNameIdentifier	 NO  FIELDABLES
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Fieldable	TokenNameIdentifier	 Fieldable
[	TokenNameLBRACKET	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NO_STRINGS	TokenNameIdentifier	 NO  STRINGS
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Returns an array of values of the field specified as the method parameter. * This method returns an empty array when there are no * matching fields. It never returns null. * For {@link NumericField}s it returns the string value of the number. If you want * the actual {@code NumericField} instances back, use {@link #getFieldables}. * @param name the name of the field * @return a <code>String[]</code> of field values */	TokenNameCOMMENT_JAVADOC	 Returns an array of values of the field specified as the method parameter. This method returns an empty array when there are no matching fields. It never returns null. For {@link NumericField}s it returns the string value of the number. If you want the actual {@code NumericField} instances back, use {@link #getFieldables}. @param name the name of the field @return a <code>String[]</code> of field values 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isBinary	TokenNameIdentifier	 is Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
NO_STRINGS	TokenNameIdentifier	 NO  STRINGS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
NO_BYTES	TokenNameIdentifier	 NO  BYTES
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Returns an array of byte arrays for of the fields that have the name specified * as the method parameter. This method returns an empty * array when there are no matching fields. It never * returns null. * * @param name the name of the field * @return a <code>byte[][]</code> of binary field values */	TokenNameCOMMENT_JAVADOC	 Returns an array of byte arrays for of the fields that have the name specified as the method parameter. This method returns an empty array when there are no matching fields. It never returns null. * @param name the name of the field @return a <code>byte[][]</code> of binary field values 
public	TokenNamepublic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBinaryValues	TokenNameIdentifier	 get Binary Values
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isBinary	TokenNameIdentifier	 is Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getBinaryValue	TokenNameIdentifier	 get Binary Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
NO_BYTES	TokenNameIdentifier	 NO  BYTES
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array of bytes for the first (or only) field that has the name * specified as the method parameter. This method will return <code>null</code> * if no binary fields with the specified name are available. * There may be non-binary fields with the same name. * * @param name the name of the field. * @return a <code>byte[]</code> containing the binary field value or <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Returns an array of bytes for the first (or only) field that has the name specified as the method parameter. This method will return <code>null</code> if no binary fields with the specified name are available. There may be non-binary fields with the same name. * @param name the name of the field. @return a <code>byte[]</code> containing the binary field value or <code>null</code> 
public	TokenNamepublic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBinaryValue	TokenNameIdentifier	 get Binary Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isBinary	TokenNameIdentifier	 is Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getBinaryValue	TokenNameIdentifier	 get Binary Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Prints the fields of a document for human consumption. */	TokenNameCOMMENT_JAVADOC	 Prints the fields of a document for human consumption. 
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
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Document<"	TokenNameStringLiteral	Document<
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
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
}	TokenNameRBRACE	
