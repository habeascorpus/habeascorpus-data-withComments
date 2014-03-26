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
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * Encapsulates sort criteria for returned hits. * * <p>The fields used to determine sort order must be carefully chosen. * Documents must contain a single term in such a field, * and the value of the term should indicate the document's relative position in * a given sort order. The field must be indexed, but should not be tokenized, * and does not need to be stored (unless you happen to want it back with the * rest of your document data). In other words: * * <p><code>document.add (new Field ("byNumber", Integer.toString(x), Field.Store.NO, Field.Index.NOT_ANALYZED));</code></p> * * * <p><h3>Valid Types of Values</h3> * * <p>There are four possible kinds of term values which may be put into * sorting fields: Integers, Longs, Floats, or Strings. Unless * {@link SortField SortField} objects are specified, the type of value * in the field is determined by parsing the first term in the field. * * <p>Integer term values should contain only digits and an optional * preceding negative sign. Values must be base 10 and in the range * <code>Integer.MIN_VALUE</code> and <code>Integer.MAX_VALUE</code> inclusive. * Documents which should appear first in the sort * should have low value integers, later documents high values * (i.e. the documents should be numbered <code>1..n</code> where * <code>1</code> is the first and <code>n</code> the last). * * <p>Long term values should contain only digits and an optional * preceding negative sign. Values must be base 10 and in the range * <code>Long.MIN_VALUE</code> and <code>Long.MAX_VALUE</code> inclusive. * Documents which should appear first in the sort * should have low value integers, later documents high values. * * <p>Float term values should conform to values accepted by * {@link Float Float.valueOf(String)} (except that <code>NaN</code> * and <code>Infinity</code> are not supported). * Documents which should appear first in the sort * should have low values, later documents high values. * * <p>String term values can contain any valid String, but should * not be tokenized. The values are sorted according to their * {@link Comparable natural order}. Note that using this type * of term value has higher memory requirements than the other * two types. * * <p><h3>Object Reuse</h3> * * <p>One of these objects can be * used multiple times and the sort order changed between usages. * * <p>This class is thread safe. * * <p><h3>Memory Usage</h3> * * <p>Sorting uses of caches of term values maintained by the * internal HitQueue(s). The cache is static and contains an integer * or float array of length <code>IndexReader.maxDoc()</code> for each field * name for which a sort is performed. In other words, the size of the * cache in bytes is: * * <p><code>4 * IndexReader.maxDoc() * (# of different fields actually used to sort)</code> * * <p>For String fields, the cache is larger: in addition to the * above array, the value of every term in the field is kept in memory. * If there are many unique terms in the field, this could * be quite large. * * <p>Note that the size of the cache is not affected by how many * fields are in the index and <i>might</i> be used to sort - only by * the ones actually used to sort a result set. * * <p>Created: Feb 12, 2004 10:53:57 AM * * @since lucene 1.4 */	TokenNameCOMMENT_JAVADOC	 Encapsulates sort criteria for returned hits. * <p>The fields used to determine sort order must be carefully chosen. Documents must contain a single term in such a field, and the value of the term should indicate the document's relative position in a given sort order. The field must be indexed, but should not be tokenized, and does not need to be stored (unless you happen to want it back with the rest of your document data). In other words: * <p><code>document.add (new Field ("byNumber", Integer.toString(x), Field.Store.NO, Field.Index.NOT_ANALYZED));</code></p> * <p><h3>Valid Types of Values</h3> * <p>There are four possible kinds of term values which may be put into sorting fields: Integers, Longs, Floats, or Strings. Unless {@link SortField SortField} objects are specified, the type of value in the field is determined by parsing the first term in the field. * <p>Integer term values should contain only digits and an optional preceding negative sign. Values must be base 10 and in the range <code>Integer.MIN_VALUE</code> and <code>Integer.MAX_VALUE</code> inclusive. Documents which should appear first in the sort should have low value integers, later documents high values (i.e. the documents should be numbered <code>1..n</code> where <code>1</code> is the first and <code>n</code> the last). * <p>Long term values should contain only digits and an optional preceding negative sign. Values must be base 10 and in the range <code>Long.MIN_VALUE</code> and <code>Long.MAX_VALUE</code> inclusive. Documents which should appear first in the sort should have low value integers, later documents high values. * <p>Float term values should conform to values accepted by {@link Float Float.valueOf(String)} (except that <code>NaN</code> and <code>Infinity</code> are not supported). Documents which should appear first in the sort should have low values, later documents high values. * <p>String term values can contain any valid String, but should not be tokenized. The values are sorted according to their {@link Comparable natural order}. Note that using this type of term value has higher memory requirements than the other two types. * <p><h3>Object Reuse</h3> * <p>One of these objects can be used multiple times and the sort order changed between usages. * <p>This class is thread safe. * <p><h3>Memory Usage</h3> * <p>Sorting uses of caches of term values maintained by the internal HitQueue(s). The cache is static and contains an integer or float array of length <code>IndexReader.maxDoc()</code> for each field name for which a sort is performed. In other words, the size of the cache in bytes is: * <p><code>4 IndexReader.maxDoc() (# of different fields actually used to sort)</code> * <p>For String fields, the cache is larger: in addition to the above array, the value of every term in the field is kept in memory. If there are many unique terms in the field, this could be quite large. * <p>Note that the size of the cache is not affected by how many fields are in the index and <i>might</i> be used to sort - only by the ones actually used to sort a result set. * <p>Created: Feb 12, 2004 10:53:57 AM * @since lucene 1.4 
public	TokenNamepublic	
class	TokenNameclass	
Sort	TokenNameIdentifier	 Sort
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * Represents sorting by computed relevance. Using this sort criteria returns * the same results as calling * {@link Searcher#search(Query,int) Searcher#search()}without a sort criteria, * only with slightly more overhead. */	TokenNameCOMMENT_JAVADOC	 Represents sorting by computed relevance. Using this sort criteria returns the same results as calling {@link Searcher#search(Query,int) Searcher#search()}without a sort criteria, only with slightly more overhead. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Sort	TokenNameIdentifier	 Sort
RELEVANCE	TokenNameIdentifier	 RELEVANCE
=	TokenNameEQUAL	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Represents sorting by index order. */	TokenNameCOMMENT_JAVADOC	 Represents sorting by index order. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Sort	TokenNameIdentifier	 Sort
INDEXORDER	TokenNameIdentifier	 INDEXORDER
=	TokenNameEQUAL	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
FIELD_DOC	TokenNameIdentifier	 FIELD  DOC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// internal representation of the sort criteria 	TokenNameCOMMENT_LINE	internal representation of the sort criteria 
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
/** * Sorts by computed relevance. This is the same sort criteria as calling * {@link Searcher#search(Query,int) Searcher#search()}without a sort criteria, * only with slightly more overhead. */	TokenNameCOMMENT_JAVADOC	 Sorts by computed relevance. This is the same sort criteria as calling {@link Searcher#search(Query,int) Searcher#search()}without a sort criteria, only with slightly more overhead. 
public	TokenNamepublic	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
FIELD_SCORE	TokenNameIdentifier	 FIELD  SCORE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sorts by the criteria in the given SortField. */	TokenNameCOMMENT_JAVADOC	 Sorts by the criteria in the given SortField. 
public	TokenNamepublic	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSort	TokenNameIdentifier	 set Sort
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sorts in succession by the criteria in each SortField. */	TokenNameCOMMENT_JAVADOC	 Sorts in succession by the criteria in each SortField. 
public	TokenNamepublic	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
...	TokenNameELLIPSIS	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSort	TokenNameIdentifier	 set Sort
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the sort to the given criteria. */	TokenNameCOMMENT_JAVADOC	 Sets the sort to the given criteria. 
public	TokenNamepublic	
void	TokenNamevoid	
setSort	TokenNameIdentifier	 set Sort
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the sort to the given criteria in succession. */	TokenNameCOMMENT_JAVADOC	 Sets the sort to the given criteria in succession. 
public	TokenNamepublic	
void	TokenNamevoid	
setSort	TokenNameIdentifier	 set Sort
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
...	TokenNameELLIPSIS	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Representation of the sort criteria. * @return Array of SortField objects used in this sort criteria */	TokenNameCOMMENT_JAVADOC	 Representation of the sort criteria. @return Array of SortField objects used in this sort criteria 
public	TokenNamepublic	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fields	TokenNameIdentifier	 fields
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
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<	TokenNameLESS	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if <code>o</code> is equal to this. */	TokenNameCOMMENT_JAVADOC	 Returns true if <code>o</code> is equal to this. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
Sort	TokenNameIdentifier	 Sort
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Sort	TokenNameIdentifier	 Sort
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Sort	TokenNameIdentifier	 Sort
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a hash code value for this object. */	TokenNameCOMMENT_JAVADOC	 Returns a hash code value for this object. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0x45aaf665	TokenNameIntegerLiteral	
+	TokenNamePLUS	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
