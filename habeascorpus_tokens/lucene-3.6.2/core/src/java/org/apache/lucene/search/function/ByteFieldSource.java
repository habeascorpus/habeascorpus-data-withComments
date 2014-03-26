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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
function	TokenNameIdentifier	 function
.	TokenNameDOT	
DocValues	TokenNameIdentifier	 Doc Values
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Expert: obtains single byte field values from the * {@link org.apache.lucene.search.FieldCache FieldCache} * using <code>getBytes()</code> and makes those values * available as other numeric types, casting as needed. * * @lucene.experimental * * @see org.apache.lucene.search.function.FieldCacheSource for requirements * on the field. * * <p><b>NOTE</b>: with the switch in 2.9 to segment-based * searching, if {@link #getValues} is invoked with a * composite (multi-segment) reader, this can easily cause * double RAM usage for the values in the FieldCache. It's * best to switch your application to pass only atomic * (single segment) readers to this API.</p> */	TokenNameCOMMENT_JAVADOC	 Expert: obtains single byte field values from the {@link org.apache.lucene.search.FieldCache FieldCache} using <code>getBytes()</code> and makes those values available as other numeric types, casting as needed. * @lucene.experimental * @see org.apache.lucene.search.function.FieldCacheSource for requirements on the field. * <p><b>NOTE</b>: with the switch in 2.9 to segment-based searching, if {@link #getValues} is invoked with a composite (multi-segment) reader, this can easily cause double RAM usage for the values in the FieldCache. It's best to switch your application to pass only atomic (single segment) readers to this API.</p> 
public	TokenNamepublic	
class	TokenNameclass	
ByteFieldSource	TokenNameIdentifier	 Byte Field Source
extends	TokenNameextends	
FieldCacheSource	TokenNameIdentifier	 Field Cache Source
{	TokenNameLBRACE	
private	TokenNameprivate	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
ByteParser	TokenNameIdentifier	 Byte Parser
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
/** * Create a cached byte field source with default string-to-byte parser. */	TokenNameCOMMENT_JAVADOC	 Create a cached byte field source with default string-to-byte parser. 
public	TokenNamepublic	
ByteFieldSource	TokenNameIdentifier	 Byte Field Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a cached byte field source with a specific string-to-byte parser. */	TokenNameCOMMENT_JAVADOC	 Create a cached byte field source with a specific string-to-byte parser. 
public	TokenNamepublic	
ByteFieldSource	TokenNameIdentifier	 Byte Field Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
ByteParser	TokenNameIdentifier	 Byte Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.function.ValueSource#description() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.function.ValueSource#description() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"byte("	TokenNameStringLiteral	byte(
+	TokenNamePLUS	
super	TokenNamesuper	
.	TokenNameDOT	
description	TokenNameIdentifier	 description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.function.FieldCacheSource#getCachedValues(org.apache.lucene.search.FieldCache, java.lang.String, org.apache.lucene.index.IndexReader) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.function.FieldCacheSource#getCachedValues(org.apache.lucene.search.FieldCache, java.lang.String, org.apache.lucene.index.IndexReader) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arr	TokenNameIdentifier	 arr
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DocValues	TokenNameIdentifier	 Doc Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.function.DocValues#floatVal(int) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.function.DocValues#floatVal(int) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
floatVal	TokenNameIdentifier	 float Val
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arr	TokenNameIdentifier	 arr
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.function.DocValues#intVal(int) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.function.DocValues#intVal(int) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
intVal	TokenNameIdentifier	 int Val
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arr	TokenNameIdentifier	 arr
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.function.DocValues#toString(int) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.function.DocValues#toString(int) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
description	TokenNameIdentifier	 description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
'='	TokenNameCharacterLiteral	
+	TokenNamePLUS	
intVal	TokenNameIdentifier	 int Val
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.function.DocValues#getInnerArray() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.function.DocValues#getInnerArray() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
Object	TokenNameIdentifier	 Object
getInnerArray	TokenNameIdentifier	 get Inner Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arr	TokenNameIdentifier	 arr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.function.FieldCacheSource#cachedFieldSourceEquals(org.apache.lucene.search.function.FieldCacheSource) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.function.FieldCacheSource#cachedFieldSourceEquals(org.apache.lucene.search.function.FieldCacheSource) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
cachedFieldSourceEquals	TokenNameIdentifier	 cached Field Source Equals
(	TokenNameLPAREN	
FieldCacheSource	TokenNameIdentifier	 Field Cache Source
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
ByteFieldSource	TokenNameIdentifier	 Byte Field Source
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ByteFieldSource	TokenNameIdentifier	 Byte Field Source
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ByteFieldSource	TokenNameIdentifier	 Byte Field Source
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.function.FieldCacheSource#cachedFieldSourceHashCode() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.function.FieldCacheSource#cachedFieldSourceHashCode() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
cachedFieldSourceHashCode	TokenNameIdentifier	 cached Field Source Hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parser	TokenNameIdentifier	 parser
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
