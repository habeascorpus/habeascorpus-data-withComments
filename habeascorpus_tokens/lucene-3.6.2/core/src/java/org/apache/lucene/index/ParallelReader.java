package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
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
*	TokenNameMULTIPLY	
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
Document	TokenNameIdentifier	 Document
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
FieldSelector	TokenNameIdentifier	 Field Selector
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
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
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
Fieldable	TokenNameIdentifier	 Fieldable
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
ReaderUtil	TokenNameIdentifier	 Reader Util
;	TokenNameSEMICOLON	
/** An IndexReader which reads multiple, parallel indexes. Each index added * must have the same number of documents, but typically each contains * different fields. Each document contains the union of the fields of all * documents with the same document number. When searching, matches for a * query term are from the first index added that has the field. * * <p>This is useful, e.g., with collections that have large fields which * change rarely and small fields that change more frequently. The smaller * fields may be re-indexed in a new index and both indexes may be searched * together. * * <p><strong>Warning:</strong> It is up to you to make sure all indexes * are created and modified the same way. For example, if you add * documents to one index, you need to add the same documents in the * same order to the other indexes. <em>Failure to do so will result in * undefined behavior</em>. */	TokenNameCOMMENT_JAVADOC	 An IndexReader which reads multiple, parallel indexes. Each index added must have the same number of documents, but typically each contains different fields. Each document contains the union of the fields of all documents with the same document number. When searching, matches for a query term are from the first index added that has the field. * <p>This is useful, e.g., with collections that have large fields which change rarely and small fields that change more frequently. The smaller fields may be re-indexed in a new index and both indexes may be searched together. * <p><strong>Warning:</strong> It is up to you to make sure all indexes are created and modified the same way. For example, if you add documents to one index, you need to add the same documents in the same order to the other indexes. <em>Failure to do so will result in undefined behavior</em>. 
public	TokenNamepublic	
class	TokenNameclass	
ParallelReader	TokenNameIdentifier	 Parallel Reader
extends	TokenNameextends	
IndexReader	TokenNameIdentifier	 Index Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
readers	TokenNameIdentifier	 readers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
decrefOnClose	TokenNameIdentifier	 decref On Close
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remember which subreaders to decRef on close 	TokenNameCOMMENT_LINE	remember which subreaders to decRef on close 
boolean	TokenNameboolean	
incRefReaders	TokenNameIdentifier	 inc Ref Readers
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
fieldToReader	TokenNameIdentifier	 field To Reader
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
storedFieldReaders	TokenNameIdentifier	 stored Field Readers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasDeletions	TokenNameIdentifier	 has Deletions
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
/** Construct a ParallelReader. * <p>Note that all subreaders are closed if this ParallelReader is closed.</p> */	TokenNameCOMMENT_JAVADOC	 Construct a ParallelReader. <p>Note that all subreaders are closed if this ParallelReader is closed.</p> 
public	TokenNamepublic	
ParallelReader	TokenNameIdentifier	 Parallel Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Construct a ParallelReader. * @param closeSubReaders indicates whether the subreaders should be closed * when this ParallelReader is closed */	TokenNameCOMMENT_JAVADOC	 Construct a ParallelReader. @param closeSubReaders indicates whether the subreaders should be closed when this ParallelReader is closed 
public	TokenNamepublic	
ParallelReader	TokenNameIdentifier	 Parallel Reader
(	TokenNameLPAREN	
boolean	TokenNameboolean	
closeSubReaders	TokenNameIdentifier	 close Sub Readers
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
incRefReaders	TokenNameIdentifier	 inc Ref Readers
=	TokenNameEQUAL	
!	TokenNameNOT	
closeSubReaders	TokenNameIdentifier	 close Sub Readers
;	TokenNameSEMICOLON	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
new	TokenNamenew	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
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
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"ParallelReader("	TokenNameStringLiteral	ParallelReader(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
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
/** Add an IndexReader. * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Add an IndexReader. @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add an IndexReader whose stored fields will not be returned. This can * accelerate search when stored fields are only needed from a subset of * the IndexReaders. * * @throws IllegalArgumentException if not all indexes contain the same number * of documents * @throws IllegalArgumentException if not all indexes have the same value * of {@link IndexReader#maxDoc()} * @throws IOException if there is a low-level IO error */	TokenNameCOMMENT_JAVADOC	 Add an IndexReader whose stored fields will not be returned. This can accelerate search when stored fields are only needed from a subset of the IndexReaders. * @throws IllegalArgumentException if not all indexes contain the same number of documents @throws IllegalArgumentException if not all indexes have the same value of {@link IndexReader#maxDoc()} @throws IOException if there is a low-level IO error 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreStoredFields	TokenNameIdentifier	 ignore Stored Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
// check compatibility 	TokenNameCOMMENT_LINE	check compatibility 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"All readers must have same maxDoc: "	TokenNameStringLiteral	All readers must have same maxDoc: 
+	TokenNamePLUS	
maxDoc	TokenNameIdentifier	 max Doc
+	TokenNamePLUS	
"!="	TokenNameStringLiteral	!=
+	TokenNamePLUS	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"All readers must have same numDocs: "	TokenNameStringLiteral	All readers must have same numDocs: 
+	TokenNamePLUS	
numDocs	TokenNameIdentifier	 num Docs
+	TokenNamePLUS	
"!="	TokenNameStringLiteral	!=
+	TokenNamePLUS	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInfos	TokenNameIdentifier	 Field Infos
readerFieldInfos	TokenNameIdentifier	 reader Field Infos
=	TokenNameEQUAL	
ReaderUtil	TokenNameIdentifier	 Reader Util
.	TokenNameDOT	
getMergedFieldInfos	TokenNameIdentifier	 get Merged Field Infos
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
:	TokenNameCOLON	
readerFieldInfos	TokenNameIdentifier	 reader Field Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// update fieldToReader map 	TokenNameCOMMENT_LINE	update fieldToReader map 
// NOTE: first reader having a given field "wins": 	TokenNameCOMMENT_LINE	NOTE: first reader having a given field "wins": 
if	TokenNameif	
(	TokenNameLPAREN	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ignoreStoredFields	TokenNameIdentifier	 ignore Stored Fields
)	TokenNameRPAREN	
storedFieldReaders	TokenNameIdentifier	 stored Field Readers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add to storedFieldReaders 	TokenNameCOMMENT_LINE	add to storedFieldReaders 
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
incRefReaders	TokenNameIdentifier	 inc Ref Readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
decrefOnClose	TokenNameIdentifier	 decref On Close
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
incRefReaders	TokenNameIdentifier	 inc Ref Readers
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
FieldInfos	TokenNameIdentifier	 Field Infos
getFieldInfos	TokenNameIdentifier	 get Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
IndexReader	TokenNameIdentifier	 Index Reader
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
doReopen	TokenNameIdentifier	 do Reopen
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @throws UnsupportedOperationException ParallelReaders cannot support changing the readOnly flag * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #doOpenIfChanged()} instead. */	TokenNameCOMMENT_JAVADOC	 @throws UnsupportedOperationException ParallelReaders cannot support changing the readOnly flag @deprecated Write support will be removed in Lucene 4.0. Use {@link #doOpenIfChanged()} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
IndexReader	TokenNameIdentifier	 Index Reader
doOpenIfChanged	TokenNameIdentifier	 do Open If Changed
(	TokenNameLPAREN	
boolean	TokenNameboolean	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"ParallelReader does not support reopening with changing readOnly flag. "	TokenNameStringLiteral	ParallelReader does not support reopening with changing readOnly flag. 
+	TokenNamePLUS	
"Use IndexReader.openIfChanged(IndexReader) instead."	TokenNameStringLiteral	Use IndexReader.openIfChanged(IndexReader) instead.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
doReopen	TokenNameIdentifier	 do Reopen
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @throws UnsupportedOperationException ParallelReaders cannot support changing the readOnly flag * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #clone()} instead. */	TokenNameCOMMENT_JAVADOC	 @throws UnsupportedOperationException ParallelReaders cannot support changing the readOnly flag @deprecated Write support will be removed in Lucene 4.0. Use {@link #clone()} instead. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
IndexReader	TokenNameIdentifier	 Index Reader
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
boolean	TokenNameboolean	
openReadOnly	TokenNameIdentifier	 open Read Only
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"ParallelReader does not support cloning with changing readOnly flag. "	TokenNameStringLiteral	ParallelReader does not support cloning with changing readOnly flag. 
+	TokenNamePLUS	
"Use IndexReader.clone() instead."	TokenNameStringLiteral	Use IndexReader.clone() instead.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
IndexReader	TokenNameIdentifier	 Index Reader
doReopen	TokenNameIdentifier	 do Reopen
(	TokenNameLPAREN	
boolean	TokenNameboolean	
doClone	TokenNameIdentifier	 do Clone
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
reopened	TokenNameIdentifier	 reopened
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
newReaders	TokenNameIdentifier	 new Readers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
oldReader	TokenNameIdentifier	 old Reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doClone	TokenNameIdentifier	 do Clone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
)	TokenNameRPAREN	
oldReader	TokenNameIdentifier	 old Reader
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reopened	TokenNameIdentifier	 reopened
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
oldReader	TokenNameIdentifier	 old Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reopened	TokenNameIdentifier	 reopened
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
oldReader	TokenNameIdentifier	 old Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
newReaders	TokenNameIdentifier	 new Readers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
&&	TokenNameAND_AND	
reopened	TokenNameIdentifier	 reopened
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
newReaders	TokenNameIdentifier	 new Readers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
newReaders	TokenNameIdentifier	 new Readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
!=	TokenNameNOT_EQUAL	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// keep going - we want to clean up as much as possible 	TokenNameCOMMENT_LINE	keep going - we want to clean up as much as possible 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reopened	TokenNameIdentifier	 reopened
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
newDecrefOnClose	TokenNameIdentifier	 new Decref On Close
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParallelReader	TokenNameIdentifier	 Parallel Reader
pr	TokenNameIdentifier	 pr
=	TokenNameEQUAL	
new	TokenNamenew	
ParallelReader	TokenNameIdentifier	 Parallel Reader
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
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
oldReader	TokenNameIdentifier	 old Reader
=	TokenNameEQUAL	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
newReader	TokenNameIdentifier	 new Reader
=	TokenNameEQUAL	
newReaders	TokenNameIdentifier	 new Readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
==	TokenNameEQUAL_EQUAL	
oldReader	TokenNameIdentifier	 old Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newDecrefOnClose	TokenNameIdentifier	 new Decref On Close
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newReader	TokenNameIdentifier	 new Reader
.	TokenNameDOT	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// this is a new subreader instance, so on close() we don't 	TokenNameCOMMENT_LINE	this is a new subreader instance, so on close() we don't 
// decRef but close it 	TokenNameCOMMENT_LINE	decRef but close it 
newDecrefOnClose	TokenNameIdentifier	 new Decref On Close
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pr	TokenNameIdentifier	 pr
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newReader	TokenNameIdentifier	 new Reader
,	TokenNameCOMMA	
!	TokenNameNOT	
storedFieldReaders	TokenNameIdentifier	 stored Field Readers
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
oldReader	TokenNameIdentifier	 old Reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pr	TokenNameIdentifier	 pr
.	TokenNameDOT	
decrefOnClose	TokenNameIdentifier	 decref On Close
=	TokenNameEQUAL	
newDecrefOnClose	TokenNameIdentifier	 new Decref On Close
;	TokenNameSEMICOLON	
pr	TokenNameIdentifier	 pr
.	TokenNameDOT	
incRefReaders	TokenNameIdentifier	 inc Ref Readers
=	TokenNameEQUAL	
incRefReaders	TokenNameIdentifier	 inc Ref Readers
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pr	TokenNameIdentifier	 pr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// No subreader was refreshed 	TokenNameCOMMENT_LINE	No subreader was refreshed 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't call ensureOpen() here (it could affect performance) 	TokenNameCOMMENT_LINE	Don't call ensureOpen() here (it could affect performance) 
return	TokenNamereturn	
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't call ensureOpen() here (it could affect performance) 	TokenNameCOMMENT_LINE	Don't call ensureOpen() here (it could affect performance) 
return	TokenNamereturn	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hasDeletions	TokenNameIdentifier	 has Deletions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check first reader 	TokenNameCOMMENT_LINE	check first reader 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't call ensureOpen() here (it could affect performance) 	TokenNameCOMMENT_LINE	Don't call ensureOpen() here (it could affect performance) 
if	TokenNameif	
(	TokenNameLPAREN	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
doDelete	TokenNameIdentifier	 do Delete
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hasDeletions	TokenNameIdentifier	 has Deletions
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
doUndeleteAll	TokenNameIdentifier	 do Undelete All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
undeleteAll	TokenNameIdentifier	 undelete All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hasDeletions	TokenNameIdentifier	 has Deletions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// append fields from storedFieldReaders 	TokenNameCOMMENT_LINE	append fields from storedFieldReaders 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
FieldSelector	TokenNameIdentifier	 Field Selector
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
storedFieldReaders	TokenNameIdentifier	 stored Field Readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
include	TokenNameIdentifier	 include
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fieldSelector	TokenNameIdentifier	 field Selector
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
include	TokenNameIdentifier	 include
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
:	TokenNameCOLON	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldSelector	TokenNameIdentifier	 field Selector
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
NO_LOAD	TokenNameIdentifier	 NO  LOAD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
include	TokenNameIdentifier	 include
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
include	TokenNameIdentifier	 include
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Fieldable	TokenNameIdentifier	 Fieldable
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
.	TokenNameDOT	
getFields	TokenNameIdentifier	 get Fields
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
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get all vectors 	TokenNameCOMMENT_LINE	get all vectors 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTermFreqVectors	TokenNameIdentifier	 get Term Freq Vectors
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
>	TokenNameGREATER	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
vector	TokenNameIdentifier	 vector
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
vector	TokenNameIdentifier	 vector
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
vector	TokenNameIdentifier	 vector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
[	TokenNameLBRACKET	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNorms	TokenNameIdentifier	 has Norms
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
hasNorms	TokenNameIdentifier	 has Norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
doSetNorm	TokenNameIdentifier	 do Set Norm
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
byte	TokenNamebyte	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
doSetNorm	TokenNameIdentifier	 do Set Norm
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermEnum	TokenNameIdentifier	 Term Enum
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ParallelTermEnum	TokenNameIdentifier	 Parallel Term Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermEnum	TokenNameIdentifier	 Term Enum
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ParallelTermEnum	TokenNameIdentifier	 Parallel Term Enum
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ParallelTermDocs	TokenNameIdentifier	 Parallel Term Docs
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ParallelTermDocs	TokenNameIdentifier	 Parallel Term Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermPositions	TokenNameIdentifier	 Term Positions
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ParallelTermPositions	TokenNameIdentifier	 Parallel Term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks recursively if all subreaders are up to date. */	TokenNameCOMMENT_JAVADOC	 Checks recursively if all subreaders are up to date. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isCurrent	TokenNameIdentifier	 is Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
isCurrent	TokenNameIdentifier	 is Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// all subreaders are up to date 	TokenNameCOMMENT_LINE	all subreaders are up to date 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isOptimized	TokenNameIdentifier	 is Optimized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
isOptimized	TokenNameIdentifier	 is Optimized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// all subindexes are optimized 	TokenNameCOMMENT_LINE	all subindexes are optimized 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Not implemented. * @throws UnsupportedOperationException */	TokenNameCOMMENT_JAVADOC	 Not implemented. @throws UnsupportedOperationException 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"ParallelReader does not support this method."	TokenNameStringLiteral	ParallelReader does not support this method.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for testing 	TokenNameCOMMENT_LINE	for testing 
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSubReaders	TokenNameIdentifier	 get Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
doCommit	TokenNameIdentifier	 do Commit
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
commitUserData	TokenNameIdentifier	 commit User Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
commitUserData	TokenNameIdentifier	 commit User Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
doClose	TokenNameIdentifier	 do Close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
decrefOnClose	TokenNameIdentifier	 decref On Close
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
ParallelTermEnum	TokenNameIdentifier	 Parallel Term Enum
extends	TokenNameextends	
TermEnum	TokenNameIdentifier	 Term Enum
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fieldIterator	TokenNameIdentifier	 field Iterator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TermEnum	TokenNameIdentifier	 Term Enum
termEnum	TokenNameIdentifier	 term Enum
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ParallelTermEnum	TokenNameIdentifier	 Parallel Term Enum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
firstKey	TokenNameIdentifier	 first Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No fields, so keep field == null, termEnum == null 	TokenNameCOMMENT_LINE	No fields, so keep field == null, termEnum == null 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
termEnum	TokenNameIdentifier	 term Enum
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ParallelTermEnum	TokenNameIdentifier	 Parallel Term Enum
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
termEnum	TokenNameIdentifier	 term Enum
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// another term in this field? 	TokenNameCOMMENT_LINE	another term in this field? 
if	TokenNameif	
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// yes, keep going 	TokenNameCOMMENT_LINE	yes, keep going 
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// close old termEnum 	TokenNameCOMMENT_LINE	close old termEnum 
// find the next field with terms, if any 	TokenNameCOMMENT_LINE	find the next field with terms, if any 
if	TokenNameif	
(	TokenNameLPAREN	
fieldIterator	TokenNameIdentifier	 field Iterator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldIterator	TokenNameIdentifier	 field Iterator
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
tailMap	TokenNameIdentifier	 tail Map
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldIterator	TokenNameIdentifier	 field Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Skip field to get next one 	TokenNameCOMMENT_LINE	Skip field to get next one 
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fieldIterator	TokenNameIdentifier	 field Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fieldIterator	TokenNameIdentifier	 field Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termEnum	TokenNameIdentifier	 term Enum
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// no more fields 	TokenNameCOMMENT_LINE	no more fields 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// wrap a TermDocs in order to support seek(Term) 	TokenNameCOMMENT_LINE	wrap a TermDocs in order to support seek(Term) 
private	TokenNameprivate	
class	TokenNameclass	
ParallelTermDocs	TokenNameIdentifier	 Parallel Term Docs
implements	TokenNameimplements	
TermDocs	TokenNameIdentifier	 Term Docs
{	TokenNameLBRACE	
protected	TokenNameprotected	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ParallelTermDocs	TokenNameIdentifier	 Parallel Term Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ParallelTermDocs	TokenNameIdentifier	 Parallel Term Docs
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
termDocs	TokenNameIdentifier	 term Docs
=	TokenNameEQUAL	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termDocs	TokenNameIdentifier	 term Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
TermEnum	TokenNameIdentifier	 Term Enum
termEnum	TokenNameIdentifier	 term Enum
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
termDocs	TokenNameIdentifier	 term Docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freqs	TokenNameIdentifier	 freqs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
termDocs	TokenNameIdentifier	 term Docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
freqs	TokenNameIdentifier	 freqs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
termDocs	TokenNameIdentifier	 term Docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
termDocs	TokenNameIdentifier	 term Docs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
ParallelTermPositions	TokenNameIdentifier	 Parallel Term Positions
extends	TokenNameextends	
ParallelTermDocs	TokenNameIdentifier	 Parallel Term Docs
implements	TokenNameimplements	
TermPositions	TokenNameIdentifier	 Term Positions
{	TokenNameLBRACE	
public	TokenNamepublic	
ParallelTermPositions	TokenNameIdentifier	 Parallel Term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
fieldToReader	TokenNameIdentifier	 field To Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termDocs	TokenNameIdentifier	 term Docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// It is an error to call this if there is no next position, e.g. if termDocs==null 	TokenNameCOMMENT_LINE	It is an error to call this if there is no next position, e.g. if termDocs==null 
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
)	TokenNameRPAREN	
termDocs	TokenNameIdentifier	 term Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPayloadLength	TokenNameIdentifier	 get Payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
)	TokenNameRPAREN	
termDocs	TokenNameIdentifier	 term Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
getPayloadLength	TokenNameIdentifier	 get Payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
)	TokenNameRPAREN	
termDocs	TokenNameIdentifier	 term Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: Remove warning after API has been finalized 	TokenNameCOMMENT_LINE	TODO: Remove warning after API has been finalized 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
)	TokenNameRPAREN	
termDocs	TokenNameIdentifier	 term Docs
)	TokenNameRPAREN	
.	TokenNameDOT	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
