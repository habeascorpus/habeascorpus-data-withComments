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
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
MultiTermDocs	TokenNameIdentifier	 Multi Term Docs
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
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
MultiTermEnum	TokenNameIdentifier	 Multi Term Enum
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
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
MultiTermPositions	TokenNameIdentifier	 Multi Term Positions
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
Similarity	TokenNameIdentifier	 Similarity
;	TokenNameSEMICOLON	
/** An IndexReader which reads multiple indexes, appending * their content. */	TokenNameCOMMENT_JAVADOC	 An IndexReader which reads multiple indexes, appending their content. 
public	TokenNamepublic	
class	TokenNameclass	
MultiReader	TokenNameIdentifier	 Multi Reader
extends	TokenNameextends	
IndexReader	TokenNameIdentifier	 Index Reader
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
starts	TokenNameIdentifier	 starts
;	TokenNameSEMICOLON	
// 1st docno for each segment 	TokenNameCOMMENT_LINE	1st docno for each segment 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decrefOnClose	TokenNameIdentifier	 decref On Close
;	TokenNameSEMICOLON	
// remember which subreaders to decRef on close 	TokenNameCOMMENT_LINE	remember which subreaders to decRef on close 
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
normsCache	TokenNameIdentifier	 norms Cache
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasDeletions	TokenNameIdentifier	 has Deletions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * <p>Construct a MultiReader aggregating the named set of (sub)readers. * Directory locking for delete, undeleteAll, and setNorm operations is * left to the subreaders. </p> * <p>Note that all subreaders are closed if this Multireader is closed.</p> * @param subReaders set of (sub)readers */	TokenNameCOMMENT_JAVADOC	 <p>Construct a MultiReader aggregating the named set of (sub)readers. Directory locking for delete, undeleteAll, and setNorm operations is left to the subreaders. </p> <p>Note that all subreaders are closed if this Multireader is closed.</p> @param subReaders set of (sub)readers 
public	TokenNamepublic	
MultiReader	TokenNameIdentifier	 Multi Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
...	TokenNameELLIPSIS	
subReaders	TokenNameIdentifier	 sub Readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Construct a MultiReader aggregating the named set of (sub)readers. * Directory locking for delete, undeleteAll, and setNorm operations is * left to the subreaders. </p> * @param closeSubReaders indicates whether the subreaders should be closed * when this MultiReader is closed * @param subReaders set of (sub)readers */	TokenNameCOMMENT_JAVADOC	 <p>Construct a MultiReader aggregating the named set of (sub)readers. Directory locking for delete, undeleteAll, and setNorm operations is left to the subreaders. </p> @param closeSubReaders indicates whether the subreaders should be closed when this MultiReader is closed @param subReaders set of (sub)readers 
public	TokenNamepublic	
MultiReader	TokenNameIdentifier	 Multi Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
boolean	TokenNameboolean	
closeSubReaders	TokenNameIdentifier	 close Sub Readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
closeSubReaders	TokenNameIdentifier	 close Sub Readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decrefOnClose	TokenNameIdentifier	 decref On Close
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
decrefOnClose	TokenNameIdentifier	 decref On Close
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
MultiReader	TokenNameIdentifier	 Multi Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decrefOnClose	TokenNameIdentifier	 decref On Close
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
subReaders	TokenNameIdentifier	 sub Readers
=	TokenNameEQUAL	
subReaders	TokenNameIdentifier	 sub Readers
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
decrefOnClose	TokenNameIdentifier	 decref On Close
=	TokenNameEQUAL	
decrefOnClose	TokenNameIdentifier	 decref On Close
;	TokenNameSEMICOLON	
starts	TokenNameIdentifier	 starts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// build starts array 	TokenNameCOMMENT_LINE	build starts array 
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
maxDoc	TokenNameIdentifier	 max Doc
+=	TokenNamePLUS_EQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// compute maxDocs 	TokenNameCOMMENT_LINE	compute maxDocs 
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasDeletions	TokenNameIdentifier	 has Deletions
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
maxDoc	TokenNameIdentifier	 max Doc
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
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"call getFieldInfos() on each sub reader, or use ReaderUtil.getMergedFieldInfos, instead"	TokenNameStringLiteral	call getFieldInfos() on each sub reader, or use ReaderUtil.getMergedFieldInfos, instead
)	TokenNameRPAREN	
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
/** * @throws UnsupportedOperationException MultiReaders cannot support changing the readOnly flag * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #doOpenIfChanged()} instead. */	TokenNameCOMMENT_JAVADOC	 @throws UnsupportedOperationException MultiReaders cannot support changing the readOnly flag @deprecated Write support will be removed in Lucene 4.0. Use {@link #doOpenIfChanged()} instead. 
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
"MultiReader does not support reopening with changing readOnly flag. "	TokenNameStringLiteral	MultiReader does not support reopening with changing readOnly flag. 
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
/** * @throws UnsupportedOperationException MultiReaders cannot support changing the readOnly flag * @deprecated Write support will be removed in Lucene 4.0. * Use {@link #clone()} instead. */	TokenNameCOMMENT_JAVADOC	 @throws UnsupportedOperationException MultiReaders cannot support changing the readOnly flag @deprecated Write support will be removed in Lucene 4.0. Use {@link #clone()} instead. 
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
"MultiReader does not support cloning with changing readOnly flag. "	TokenNameStringLiteral	MultiReader does not support cloning with changing readOnly flag. 
+	TokenNamePLUS	
"Use IndexReader.clone() instead."	TokenNameStringLiteral	Use IndexReader.clone() instead.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If clone is true then we clone each of the subreaders * @param doClone * @return New IndexReader, or null if open/clone is not necessary * @throws CorruptIndexException * @throws IOException */	TokenNameCOMMENT_JAVADOC	 If clone is true then we clone each of the subreaders @param doClone @return New IndexReader, or null if open/clone is not necessary @throws CorruptIndexException @throws IOException 
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
changed	TokenNameIdentifier	 changed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newSubReaders	TokenNameIdentifier	 new Sub Readers
=	TokenNameEQUAL	
new	TokenNamenew	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doClone	TokenNameIdentifier	 do Clone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newSubReaders	TokenNameIdentifier	 new Sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
)	TokenNameRPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
changed	TokenNameIdentifier	 changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
newSubReader	TokenNameIdentifier	 new Sub Reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
openIfChanged	TokenNameIdentifier	 open If Changed
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newSubReader	TokenNameIdentifier	 new Sub Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newSubReaders	TokenNameIdentifier	 new Sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newSubReader	TokenNameIdentifier	 new Sub Reader
;	TokenNameSEMICOLON	
changed	TokenNameIdentifier	 changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newSubReaders	TokenNameIdentifier	 new Sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
changed	TokenNameIdentifier	 changed
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
newSubReaders	TokenNameIdentifier	 new Sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newSubReaders	TokenNameIdentifier	 new Sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
newSubReaders	TokenNameIdentifier	 new Sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
changed	TokenNameIdentifier	 changed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newDecrefOnClose	TokenNameIdentifier	 new Decref On Close
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newSubReaders	TokenNameIdentifier	 new Sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newSubReaders	TokenNameIdentifier	 new Sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
incRef	TokenNameIdentifier	 inc Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newDecrefOnClose	TokenNameIdentifier	 new Decref On Close
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiReader	TokenNameIdentifier	 Multi Reader
(	TokenNameLPAREN	
newSubReaders	TokenNameIdentifier	 new Sub Readers
,	TokenNameCOMMA	
newDecrefOnClose	TokenNameIdentifier	 new Decref On Close
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTermFreqVectors	TokenNameIdentifier	 get Term Freq Vectors
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dispatch to segment 	TokenNameCOMMENT_LINE	dispatch to segment 
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
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
docNumber	TokenNameIdentifier	 doc Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
docNumber	TokenNameIdentifier	 doc Number
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
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
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
docNumber	TokenNameIdentifier	 doc Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
docNumber	TokenNameIdentifier	 doc Number
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
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
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
// NOTE: multiple threads may wind up init'ing 	TokenNameCOMMENT_LINE	NOTE: multiple threads may wind up init'ing 
// numDocs... but that's harmless 	TokenNameCOMMENT_LINE	numDocs... but that's harmless 
if	TokenNameif	
(	TokenNameLPAREN	
numDocs	TokenNameIdentifier	 num Docs
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check cache 	TokenNameCOMMENT_LINE	check cache 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// cache miss--recompute 	TokenNameCOMMENT_LINE	cache miss--recompute 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sum from readers 	TokenNameCOMMENT_LINE	sum from readers 
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
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
// Don't call ensureOpen() here (it could affect performance) 	TokenNameCOMMENT_LINE	Don't call ensureOpen() here (it could affect performance) 
return	TokenNamereturn	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inherit javadoc 	TokenNameCOMMENT_LINE	inherit javadoc 
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
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
fieldSelector	TokenNameIdentifier	 field Selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dispatch to segment reader 	TokenNameCOMMENT_LINE	dispatch to segment reader 
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
// Don't call ensureOpen() here (it could affect performance) 	TokenNameCOMMENT_LINE	Don't call ensureOpen() here (it could affect performance) 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dispatch to segment reader 	TokenNameCOMMENT_LINE	dispatch to segment reader 
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
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
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
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// invalidate cache 	TokenNameCOMMENT_LINE	invalidate cache 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dispatch to segment reader 	TokenNameCOMMENT_LINE	dispatch to segment reader 
hasDeletions	TokenNameIdentifier	 has Deletions
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
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
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
undeleteAll	TokenNameIdentifier	 undelete All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasDeletions	TokenNameIdentifier	 has Deletions
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// invalidate cache 	TokenNameCOMMENT_LINE	invalidate cache 
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find reader for doc n: 	TokenNameCOMMENT_LINE	find reader for doc n: 
return	TokenNamereturn	
DirectoryReader	TokenNameIdentifier	 Directory Reader
.	TokenNameDOT	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
starts	TokenNameIdentifier	 starts
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
hasNorms	TokenNameIdentifier	 has Norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
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
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
normsCache	TokenNameIdentifier	 norms Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
// cache hit 	TokenNameCOMMENT_LINE	cache hit 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasNorms	TokenNameIdentifier	 has Norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
normsCache	TokenNameIdentifier	 norms Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// update cache 	TokenNameCOMMENT_LINE	update cache 
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
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
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
normsCache	TokenNameIdentifier	 norms Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
// read from segments 	TokenNameCOMMENT_LINE	read from segments 
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
hasNorms	TokenNameIdentifier	 has Norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
encodeNormValue	TokenNameIdentifier	 encode Norm Value
(	TokenNameLPAREN	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// cache hit 	TokenNameCOMMENT_LINE	cache hit 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// read from segments 	TokenNameCOMMENT_LINE	read from segments 
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
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
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
normsCache	TokenNameIdentifier	 norms Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
normsCache	TokenNameIdentifier	 norms Cache
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clear cache 	TokenNameCOMMENT_LINE	clear cache 
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
readerIndex	TokenNameIdentifier	 reader Index
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find segment num 	TokenNameCOMMENT_LINE	find segment num 
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
setNorm	TokenNameIdentifier	 set Norm
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// dispatch 	TokenNameCOMMENT_LINE	dispatch 
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
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Optimize single segment case: 	TokenNameCOMMENT_LINE	Optimize single segment case: 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiTermEnum	TokenNameIdentifier	 Multi Term Enum
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Optimize single segment case: 	TokenNameCOMMENT_LINE	Optimize single segment case: 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiTermEnum	TokenNameIdentifier	 Multi Term Enum
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// sum freqs in segments 	TokenNameCOMMENT_LINE	sum freqs in segments 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
total	TokenNameIdentifier	 total
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
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Optimize single segment case: 	TokenNameCOMMENT_LINE	Optimize single segment case: 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiTermDocs	TokenNameIdentifier	 Multi Term Docs
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
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
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Optimize single segment case: 	TokenNameCOMMENT_LINE	Optimize single segment case: 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
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
ensureOpen	TokenNameIdentifier	 ensure Open
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Optimize single segment case: 	TokenNameCOMMENT_LINE	Optimize single segment case: 
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiTermPositions	TokenNameIdentifier	 Multi Term Positions
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
starts	TokenNameIdentifier	 starts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
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
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
=	TokenNameEQUAL	
null	TokenNamenull	
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
decrefOnClose	TokenNameIdentifier	 decref On Close
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
decRef	TokenNameIdentifier	 dec Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ioe	TokenNameIdentifier	 ioe
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// throw the first exception 	TokenNameCOMMENT_LINE	throw the first exception 
if	TokenNameif	
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ioe	TokenNameIdentifier	 ioe
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
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
"MultiReader does not support this method."	TokenNameStringLiteral	MultiReader does not support this method.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subReaders	TokenNameIdentifier	 sub Readers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
