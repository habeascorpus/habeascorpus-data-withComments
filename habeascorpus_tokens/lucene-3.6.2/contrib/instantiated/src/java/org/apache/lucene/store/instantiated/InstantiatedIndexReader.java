package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
instantiated	TokenNameIdentifier	 instantiated
;	TokenNameSEMICOLON	
/** * Copyright 2006 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2006 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
index	TokenNameIdentifier	 index
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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
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
BitVector	TokenNameIdentifier	 Bit Vector
;	TokenNameSEMICOLON	
/** * An InstantiatedIndexReader is not a snapshot in time, it is completely in * sync with the latest commit to the store! * <p> * Consider using InstantiatedIndex as if it was immutable. * * @deprecated contrib/instantiated will be removed in 4.0; * you can use the memory codec to hold all postings in RAM */	TokenNameCOMMENT_JAVADOC	 An InstantiatedIndexReader is not a snapshot in time, it is completely in sync with the latest commit to the store! <p> Consider using InstantiatedIndex as if it was immutable. * @deprecated contrib/instantiated will be removed in 4.0; you can use the memory codec to hold all postings in RAM 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
InstantiatedIndexReader	TokenNameIdentifier	 Instantiated Index Reader
extends	TokenNameextends	
IndexReader	TokenNameIdentifier	 Index Reader
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
InstantiatedIndex	TokenNameIdentifier	 Instantiated Index
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InstantiatedIndexReader	TokenNameIdentifier	 Instantiated Index Reader
(	TokenNameLPAREN	
InstantiatedIndex	TokenNameIdentifier	 Instantiated Index
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
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
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An InstantiatedIndexReader is not a snapshot in time, it is completely in * sync with the latest commit to the store! * * @return output from {@link InstantiatedIndex#getVersion()} in associated instantiated index. */	TokenNameCOMMENT_JAVADOC	 An InstantiatedIndexReader is not a snapshot in time, it is completely in sync with the latest commit to the store! * @return output from {@link InstantiatedIndex#getVersion()} in associated instantiated index. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getFieldInfos	TokenNameIdentifier	 get Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An InstantiatedIndexReader is always current! * * Check whether this IndexReader is still using the current (i.e., most * recently committed) version of the index. If a writer has committed any * changes to the index since this reader was opened, this will return * <code>false</code>, in which case you must open a new IndexReader in * order to see the changes. See the description of the <a * href="IndexWriter.html#autoCommit"><code>autoCommit</code></a> flag * which controls when the {@link IndexWriter} actually commits changes to the * index. * * @return always true * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * @throws UnsupportedOperationException unless overridden in subclass */	TokenNameCOMMENT_JAVADOC	 An InstantiatedIndexReader is always current! * Check whether this IndexReader is still using the current (i.e., most recently committed) version of the index. If a writer has committed any changes to the index since this reader was opened, this will return <code>false</code>, in which case you must open a new IndexReader in order to see the changes. See the description of the <a href="IndexWriter.html#autoCommit"><code>autoCommit</code></a> flag which controls when the {@link IndexWriter} actually commits changes to the index. * @return always true @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error @throws UnsupportedOperationException unless overridden in subclass 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isCurrent	TokenNameIdentifier	 is Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InstantiatedIndex	TokenNameIdentifier	 Instantiated Index
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
BitVector	TokenNameIdentifier	 Bit Vector
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
NormUpdate	TokenNameIdentifier	 Norm Update
>>	TokenNameRIGHT_SHIFT	
uncommittedNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 uncommitted Norms By Field Name And Document Number
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
class	TokenNameclass	
NormUpdate	TokenNameIdentifier	 Norm Update
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NormUpdate	TokenNameIdentifier	 Norm Update
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
byte	TokenNamebyte	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
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
// todo i suppose this value could be cached, but array#length and bitvector#count is fast. 	TokenNameCOMMENT_LINE	todo i suppose this value could be cached, but array#length and bitvector#count is fast. 
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentsByNumber	TokenNameIdentifier	 get Documents By Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numDocs	TokenNameIdentifier	 num Docs
-=	TokenNameMINUS_EQUAL	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getDeletedDocuments	TokenNameIdentifier	 get Deleted Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numDocs	TokenNameIdentifier	 num Docs
-=	TokenNameMINUS_EQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getDeletedDocuments	TokenNameIdentifier	 get Deleted Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentsByNumber	TokenNameIdentifier	 get Documents By Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
return	TokenNamereturn	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getDeletedDocuments	TokenNameIdentifier	 get Deleted Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getDeletedDocuments	TokenNameIdentifier	 get Deleted Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getDeletedDocuments	TokenNameIdentifier	 get Deleted Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
doDelete	TokenNameIdentifier	 do Delete
(	TokenNameLPAREN	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// dont delete if already deleted 	TokenNameCOMMENT_LINE	dont delete if already deleted 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getDeletedDocuments	TokenNameIdentifier	 get Deleted Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getDeletedDocuments	TokenNameIdentifier	 get Deleted Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
=	TokenNameEQUAL	
new	TokenNamenew	
BitVector	TokenNameIdentifier	 Bit Vector
(	TokenNameLPAREN	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
doUndeleteAll	TokenNameIdentifier	 do Undelete All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// todo: read/write lock 	TokenNameCOMMENT_LINE	todo: read/write lock 
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// todo: read/write unlock 	TokenNameCOMMENT_LINE	todo: read/write unlock 
}	TokenNameRBRACE	
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
// todo: read/write lock 	TokenNameCOMMENT_LINE	todo: read/write lock 
// 1. update norms 	TokenNameCOMMENT_LINE	1. update norms 
if	TokenNameif	
(	TokenNameLPAREN	
uncommittedNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 uncommitted Norms By Field Name And Document Number
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
NormUpdate	TokenNameIdentifier	 Norm Update
>>	TokenNameRIGHT_SHIFT	
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
uncommittedNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 uncommitted Norms By Field Name And Document Number
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 get Norms By Field Name And Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
NormUpdate	TokenNameIdentifier	 Norm Update
normUpdate	TokenNameIdentifier	 norm Update
:	TokenNameCOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
norms	TokenNameIdentifier	 norms
[	TokenNameLBRACKET	
normUpdate	TokenNameIdentifier	 norm Update
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
normUpdate	TokenNameIdentifier	 norm Update
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
uncommittedNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 uncommitted Norms By Field Name And Document Number
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 2. remove deleted documents 	TokenNameCOMMENT_LINE	2. remove deleted documents 
if	TokenNameif	
(	TokenNameLPAREN	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getDeletedDocuments	TokenNameIdentifier	 get Deleted Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
setDeletedDocuments	TokenNameIdentifier	 set Deleted Documents
(	TokenNameLPAREN	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getDeletedDocuments	TokenNameIdentifier	 get Deleted Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
uncommittedDeletedDocuments	TokenNameIdentifier	 uncommitted Deleted Documents
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// todo unlock read/writelock 	TokenNameCOMMENT_LINE	todo unlock read/writelock 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
doClose	TokenNameIdentifier	 do Close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// ignored 	TokenNameCOMMENT_LINE	ignored 
// todo perhaps release all associated instances? 	TokenNameCOMMENT_LINE	todo perhaps release all associated instances? 
}	TokenNameRBRACE	
/** * Return the {@link org.apache.lucene.document.Document} at the <code>n</code><sup>th</sup> * position. <p> * <b>Warning!</b> * The resulting document is the actual stored document instance * and not a deserialized clone as retuned by an IndexReader * over a {@link org.apache.lucene.store.Directory}. * I.e., if you need to touch the document, clone it first! * <p> * This can also be seen as a feature for live changes of stored values, * but be careful! Adding a field with an name unknown to the index * or to a field with previously no stored values will make * {@link org.apache.lucene.store.instantiated.InstantiatedIndexReader#getFieldInfos()} * out of sync, causing problems for instance when merging the * instantiated index to another index. <p> * This implementation ignores the field selector! All stored fields are always returned! * <p> * * @param n document number * @param fieldSelector ignored * @return The stored fields of the {@link org.apache.lucene.document.Document} at the nth position * @throws CorruptIndexException if the index is corrupt * @throws IOException if there is a low-level IO error * * @see org.apache.lucene.document.Fieldable * @see org.apache.lucene.document.FieldSelector * @see org.apache.lucene.document.SetBasedFieldSelector * @see org.apache.lucene.document.LoadFirstFieldSelector */	TokenNameCOMMENT_JAVADOC	 Return the {@link org.apache.lucene.document.Document} at the <code>n</code><sup>th</sup> position. <p> <b>Warning!</b> The resulting document is the actual stored document instance and not a deserialized clone as retuned by an IndexReader over a {@link org.apache.lucene.store.Directory}. I.e., if you need to touch the document, clone it first! <p> This can also be seen as a feature for live changes of stored values, but be careful! Adding a field with an name unknown to the index or to a field with previously no stored values will make {@link org.apache.lucene.store.instantiated.InstantiatedIndexReader#getFieldInfos()} out of sync, causing problems for instance when merging the instantiated index to another index. <p> This implementation ignores the field selector! All stored fields are always returned! <p> * @param n document number @param fieldSelector ignored @return The stored fields of the {@link org.apache.lucene.document.Document} at the nth position @throws CorruptIndexException if the index is corrupt @throws IOException if there is a low-level IO error * @see org.apache.lucene.document.Fieldable @see org.apache.lucene.document.FieldSelector @see org.apache.lucene.document.SetBasedFieldSelector @see org.apache.lucene.document.LoadFirstFieldSelector 
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
return	TokenNamereturn	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentsByNumber	TokenNameIdentifier	 get Documents By Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * never ever touch these values. it is the true values, unless norms have * been touched. */	TokenNameCOMMENT_JAVADOC	 never ever touch these values. it is the true values, unless norms have been touched. 
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
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 get Norms By Field Name And Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
norms	TokenNameIdentifier	 norms
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// todo a static final zero length attribute? 	TokenNameCOMMENT_LINE	todo a static final zero length attribute? 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uncommittedNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 uncommitted Norms By Field Name And Document Number
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
norms	TokenNameIdentifier	 norms
=	TokenNameEQUAL	
norms	TokenNameIdentifier	 norms
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
NormUpdate	TokenNameIdentifier	 Norm Update
>	TokenNameGREATER	
updated	TokenNameIdentifier	 updated
=	TokenNameEQUAL	
uncommittedNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 uncommitted Norms By Field Name And Document Number
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
updated	TokenNameIdentifier	 updated
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
NormUpdate	TokenNameIdentifier	 Norm Update
normUpdate	TokenNameIdentifier	 norm Update
:	TokenNameCOLON	
updated	TokenNameIdentifier	 updated
)	TokenNameRPAREN	
{	TokenNameLBRACE	
norms	TokenNameIdentifier	 norms
[	TokenNameLBRACKET	
normUpdate	TokenNameIdentifier	 norm Update
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
normUpdate	TokenNameIdentifier	 norm Update
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
norms	TokenNameIdentifier	 norms
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
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 get Norms By Field Name And Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
norms	TokenNameIdentifier	 norms
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
norms	TokenNameIdentifier	 norms
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
norms	TokenNameIdentifier	 norms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
doSetNorm	TokenNameIdentifier	 do Set Norm
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
byte	TokenNamebyte	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uncommittedNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 uncommitted Norms By Field Name And Document Number
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uncommittedNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 uncommitted Norms By Field Name And Document Number
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
NormUpdate	TokenNameIdentifier	 Norm Update
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 get Norms By Field Name And Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
NormUpdate	TokenNameIdentifier	 Norm Update
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
uncommittedNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 uncommitted Norms By Field Name And Document Number
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
NormUpdate	TokenNameIdentifier	 Norm Update
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uncommittedNormsByFieldNameAndDocumentNumber	TokenNameIdentifier	 uncommitted Norms By Field Name And Document Number
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
NormUpdate	TokenNameIdentifier	 Norm Update
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
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
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
findTerm	TokenNameIdentifier	 find Term
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
getAssociatedDocuments	TokenNameIdentifier	 get Associated Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
new	TokenNamenew	
InstantiatedTermEnum	TokenNameIdentifier	 Instantiated Term Enum
(	TokenNameLPAREN	
this	TokenNamethis	
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
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
findTerm	TokenNameIdentifier	 find Term
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
InstantiatedTermEnum	TokenNameIdentifier	 Instantiated Term Enum
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
getTermIndex	TokenNameIdentifier	 get Term Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
startPos	TokenNameIdentifier	 start Pos
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getOrderedTerms	TokenNameIdentifier	 get Ordered Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
.	TokenNameDOT	
termComparator	TokenNameIdentifier	 term Comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startPos	TokenNameIdentifier	 start Pos
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startPos	TokenNameIdentifier	 start Pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
startPos	TokenNameIdentifier	 start Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
InstantiatedTermEnum	TokenNameIdentifier	 Instantiated Term Enum
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
startPos	TokenNameIdentifier	 start Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
new	TokenNamenew	
InstantiatedTermDocs	TokenNameIdentifier	 Instantiated Term Docs
(	TokenNameLPAREN	
this	TokenNamethis	
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
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
InstantiatedAllTermDocs	TokenNameIdentifier	 Instantiated All Term Docs
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
InstantiatedTermDocs	TokenNameIdentifier	 Instantiated Term Docs
termDocs	TokenNameIdentifier	 term Docs
=	TokenNameEQUAL	
new	TokenNamenew	
InstantiatedTermDocs	TokenNameIdentifier	 Instantiated Term Docs
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
termDocs	TokenNameIdentifier	 term Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
new	TokenNamenew	
InstantiatedTermPositions	TokenNameIdentifier	 Instantiated Term Positions
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTermFreqVectors	TokenNameIdentifier	 get Term Freq Vectors
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InstantiatedDocument	TokenNameIdentifier	 Instantiated Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentsByNumber	TokenNameIdentifier	 get Documents By Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
docNumber	TokenNameIdentifier	 doc Number
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getVectorSpace	TokenNameIdentifier	 get Vector Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getVectorSpace	TokenNameIdentifier	 get Vector Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getVectorSpace	TokenNameIdentifier	 get Vector Space
(	TokenNameLPAREN	
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
InstantiatedTermPositionVector	TokenNameIdentifier	 Instantiated Term Position Vector
(	TokenNameLPAREN	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentsByNumber	TokenNameIdentifier	 get Documents By Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
docNumber	TokenNameIdentifier	 doc Number
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InstantiatedDocument	TokenNameIdentifier	 Instantiated Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentsByNumber	TokenNameIdentifier	 get Documents By Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
docNumber	TokenNameIdentifier	 doc Number
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getVectorSpace	TokenNameIdentifier	 get Vector Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getVectorSpace	TokenNameIdentifier	 get Vector Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
InstantiatedTermPositionVector	TokenNameIdentifier	 Instantiated Term Position Vector
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
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
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InstantiatedDocument	TokenNameIdentifier	 Instantiated Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentsByNumber	TokenNameIdentifier	 get Documents By Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
docNumber	TokenNameIdentifier	 doc Number
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getVectorSpace	TokenNameIdentifier	 get Vector Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getVectorSpace	TokenNameIdentifier	 get Vector Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
>	TokenNameGREATER	
tv	TokenNameIdentifier	 tv
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getVectorSpace	TokenNameIdentifier	 get Vector Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
setExpectations	TokenNameIdentifier	 set Expectations
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
tv	TokenNameIdentifier	 tv
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
tdi	TokenNameIdentifier	 tdi
:	TokenNameCOLON	
tv	TokenNameIdentifier	 tv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
map	TokenNameIdentifier	 map
(	TokenNameLPAREN	
tdi	TokenNameIdentifier	 tdi
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tdi	TokenNameIdentifier	 tdi
.	TokenNameDOT	
getTermPositions	TokenNameIdentifier	 get Term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
tdi	TokenNameIdentifier	 tdi
.	TokenNameDOT	
getTermOffsets	TokenNameIdentifier	 get Term Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tdi	TokenNameIdentifier	 tdi
.	TokenNameDOT	
getTermPositions	TokenNameIdentifier	 get Term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
InstantiatedDocument	TokenNameIdentifier	 Instantiated Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentsByNumber	TokenNameIdentifier	 get Documents By Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
docNumber	TokenNameIdentifier	 doc Number
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
>>	TokenNameRIGHT_SHIFT	
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getVectorSpace	TokenNameIdentifier	 get Vector Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
setExpectations	TokenNameIdentifier	 set Expectations
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
tdi	TokenNameIdentifier	 tdi
:	TokenNameCOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
map	TokenNameIdentifier	 map
(	TokenNameLPAREN	
tdi	TokenNameIdentifier	 tdi
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tdi	TokenNameIdentifier	 tdi
.	TokenNameDOT	
getTermPositions	TokenNameIdentifier	 get Term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
tdi	TokenNameIdentifier	 tdi
.	TokenNameDOT	
getTermOffsets	TokenNameIdentifier	 get Term Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tdi	TokenNameIdentifier	 tdi
.	TokenNameDOT	
getTermPositions	TokenNameIdentifier	 get Term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
