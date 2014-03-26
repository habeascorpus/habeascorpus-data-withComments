/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Expert: obtains the ordinal of the field value from the default Lucene * {@link org.apache.lucene.search.FieldCache Fieldcache} using getStringIndex(). * <p> * The native lucene index order is used to assign an ordinal value for each field value. * <p * Field values (terms) are lexicographically ordered by unicode value, and numbered starting at 1. * <p> * Example: * <br>If there were only three field values: "apple","banana","pear" * <br>then ord("apple")=1, ord("banana")=2, ord("pear")=3 * <p> * WARNING: * ord() depends on the position in an index and can thus change * when other documents are inserted or deleted, * or if a MultiSearcher is used. * * @lucene.experimental * * <p><b>NOTE</b>: with the switch in 2.9 to segment-based * searching, if {@link #getValues} is invoked with a * composite (multi-segment) reader, this can easily cause * double RAM usage for the values in the FieldCache. It's * best to switch your application to pass only atomic * (single segment) readers to this API.</p> */	TokenNameCOMMENT_JAVADOC	 Expert: obtains the ordinal of the field value from the default Lucene {@link org.apache.lucene.search.FieldCache Fieldcache} using getStringIndex(). <p> The native lucene index order is used to assign an ordinal value for each field value. <p Field values (terms) are lexicographically ordered by unicode value, and numbered starting at 1. <p> Example: <br>If there were only three field values: "apple","banana","pear" <br>then ord("apple")=1, ord("banana")=2, ord("pear")=3 <p> WARNING: ord() depends on the position in an index and can thus change when other documents are inserted or deleted, or if a MultiSearcher is used. * @lucene.experimental * <p><b>NOTE</b>: with the switch in 2.9 to segment-based searching, if {@link #getValues} is invoked with a composite (multi-segment) reader, this can easily cause double RAM usage for the values in the FieldCache. It's best to switch your application to pass only atomic (single segment) readers to this API.</p> 
public	TokenNamepublic	
class	TokenNameclass	
OrdFieldSource	TokenNameIdentifier	 Ord Field Source
extends	TokenNameextends	
ValueSource	TokenNameIdentifier	 Value Source
{	TokenNameLBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
/** * Constructor for a certain field. * @param field field whose values order is used. */	TokenNameCOMMENT_JAVADOC	 Constructor for a certain field. @param field field whose values order is used. 
public	TokenNamepublic	
OrdFieldSource	TokenNameIdentifier	 Ord Field Source
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
"ord("	TokenNameStringLiteral	ord(
+	TokenNamePLUS	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see org.apache.lucene.search.function.ValueSource#getValues(org.apache.lucene.index.IndexReader) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.function.ValueSource#getValues(org.apache.lucene.index.IndexReader) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocValues	TokenNameIdentifier	 Doc Values
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arr	TokenNameIdentifier	 arr
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
.	TokenNameDOT	
order	TokenNameIdentifier	 order
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
/*(non-Javadoc) @see org.apache.lucene.search.function.DocValues#strVal(int) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see org.apache.lucene.search.function.DocValues#strVal(int) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
strVal	TokenNameIdentifier	 str Val
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the string value of the ordinal, not the string itself 	TokenNameCOMMENT_LINE	the string value of the ordinal, not the string itself 
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
arr	TokenNameIdentifier	 arr
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
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
/*(non-Javadoc) @see java.lang.Object#equals(java.lang.Object) */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see java.lang.Object#equals(java.lang.Object) 
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
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
OrdFieldSource	TokenNameIdentifier	 Ord Field Source
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
OrdFieldSource	TokenNameIdentifier	 Ord Field Source
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OrdFieldSource	TokenNameIdentifier	 Ord Field Source
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
hcode	TokenNameIdentifier	 hcode
=	TokenNameEQUAL	
OrdFieldSource	TokenNameIdentifier	 Ord Field Source
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*(non-Javadoc) @see java.lang.Object#hashCode() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see java.lang.Object#hashCode() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hcode	TokenNameIdentifier	 hcode
+	TokenNamePLUS	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
