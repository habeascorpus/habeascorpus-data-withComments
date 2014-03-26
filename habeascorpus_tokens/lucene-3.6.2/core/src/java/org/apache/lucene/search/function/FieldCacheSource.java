package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
function	TokenNameIdentifier	 function
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
FieldCache	TokenNameIdentifier	 Field Cache
;	TokenNameSEMICOLON	
/** * Expert: A base class for ValueSource implementations that retrieve values for * a single field from the {@link org.apache.lucene.search.FieldCache FieldCache}. * <p> * Fields used herein must be indexed (doesn't matter if these fields are stored or not). * <p> * It is assumed that each such indexed field is untokenized, or at least has a single token in a document. * For documents with multiple tokens of the same field, behavior is undefined (It is likely that current * code would use the value of one of these tokens, but this is not guaranteed). * <p> * Document with no tokens in this field are assigned the <code>Zero</code> value. * * @lucene.experimental * * <p><b>NOTE</b>: with the switch in 2.9 to segment-based * searching, if {@link #getValues} is invoked with a * composite (multi-segment) reader, this can easily cause * double RAM usage for the values in the FieldCache. It's * best to switch your application to pass only atomic * (single segment) readers to this API.</p> */	TokenNameCOMMENT_JAVADOC	 Expert: A base class for ValueSource implementations that retrieve values for a single field from the {@link org.apache.lucene.search.FieldCache FieldCache}. <p> Fields used herein must be indexed (doesn't matter if these fields are stored or not). <p> It is assumed that each such indexed field is untokenized, or at least has a single token in a document. For documents with multiple tokens of the same field, behavior is undefined (It is likely that current code would use the value of one of these tokens, but this is not guaranteed). <p> Document with no tokens in this field are assigned the <code>Zero</code> value. * @lucene.experimental * <p><b>NOTE</b>: with the switch in 2.9 to segment-based searching, if {@link #getValues} is invoked with a composite (multi-segment) reader, this can easily cause double RAM usage for the values in the FieldCache. It's best to switch your application to pass only atomic (single segment) readers to this API.</p> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FieldCacheSource	TokenNameIdentifier	 Field Cache Source
extends	TokenNameextends	
ValueSource	TokenNameIdentifier	 Value Source
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
/** * Create a cached field source for the input field. */	TokenNameCOMMENT_JAVADOC	 Create a cached field source for the input field. 
public	TokenNamepublic	
FieldCacheSource	TokenNameIdentifier	 Field Cache Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) @see org.apache.lucene.search.function.ValueSource#getValues(org.apache.lucene.index.IndexReader) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.search.function.ValueSource#getValues(org.apache.lucene.index.IndexReader) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
DocValues	TokenNameIdentifier	 Doc Values
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getCachedFieldValues	TokenNameIdentifier	 get Cached Field Values
(	TokenNameLPAREN	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) @see org.apache.lucene.search.function.ValueSource#description() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.search.function.ValueSource#description() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return cached DocValues for input field and reader. * @param cache FieldCache so that values of a field are loaded once per reader (RAM allowing) * @param field Field for which values are required. * @see ValueSource */	TokenNameCOMMENT_JAVADOC	 Return cached DocValues for input field and reader. @param cache FieldCache so that values of a field are loaded once per reader (RAM allowing) @param field Field for which values are required. @see ValueSource 
public	TokenNamepublic	
abstract	TokenNameabstract	
DocValues	TokenNameIdentifier	 Doc Values
getCachedFieldValues	TokenNameIdentifier	 get Cached Field Values
(	TokenNameLPAREN	
FieldCache	TokenNameIdentifier	 Field Cache
cache	TokenNameIdentifier	 cache
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/*(non-Javadoc) @see java.lang.Object#equals(java.lang.Object) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see java.lang.Object#equals(java.lang.Object) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
FieldCacheSource	TokenNameIdentifier	 Field Cache Source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FieldCacheSource	TokenNameIdentifier	 Field Cache Source
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldCacheSource	TokenNameIdentifier	 Field Cache Source
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
&&	TokenNameAND_AND	
cachedFieldSourceEquals	TokenNameIdentifier	 cached Field Source Equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see java.lang.Object#hashCode() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see java.lang.Object#hashCode() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
cachedFieldSourceHashCode	TokenNameIdentifier	 cached Field Source Hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if equals to another {@link FieldCacheSource}, already knowing that cache and field are equal. * @see Object#equals(java.lang.Object) */	TokenNameCOMMENT_JAVADOC	 Check if equals to another {@link FieldCacheSource}, already knowing that cache and field are equal. @see Object#equals(java.lang.Object) 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
cachedFieldSourceEquals	TokenNameIdentifier	 cached Field Source Equals
(	TokenNameLPAREN	
FieldCacheSource	TokenNameIdentifier	 Field Cache Source
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return a hash code of a {@link FieldCacheSource}, without the hash-codes of the field * and the cache (those are taken care of elsewhere). * @see Object#hashCode() */	TokenNameCOMMENT_JAVADOC	 Return a hash code of a {@link FieldCacheSource}, without the hash-codes of the field and the cache (those are taken care of elsewhere). @see Object#hashCode() 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
cachedFieldSourceHashCode	TokenNameIdentifier	 cached Field Source Hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
