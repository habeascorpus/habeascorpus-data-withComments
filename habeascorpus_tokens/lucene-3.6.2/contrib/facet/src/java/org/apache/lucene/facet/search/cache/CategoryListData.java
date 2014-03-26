package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
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
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
CategoryListParams	TokenNameIdentifier	 Category List Params
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
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
collections	TokenNameIdentifier	 collections
.	TokenNameDOT	
IntArray	TokenNameIdentifier	 Int Array
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Category list data maintained in RAM. * <p> * Speeds up facets accumulation when more RAM is available. * <p> * Note that this will consume more memory: one int (4 bytes) for each category * of each document. * <p> * Note: at the moment this class is insensitive to updates of the index, and, * in particular, does not make use of Lucene's ability to refresh a single * segment. * <p> * See {@link CategoryListCache#register(CategoryListParams, CategoryListData)} * and * {@link CategoryListCache#loadAndRegister(CategoryListParams, IndexReader, TaxonomyReader, FacetIndexingParams)}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Category list data maintained in RAM. <p> Speeds up facets accumulation when more RAM is available. <p> Note that this will consume more memory: one int (4 bytes) for each category of each document. <p> Note: at the moment this class is insensitive to updates of the index, and, in particular, does not make use of Lucene's ability to refresh a single segment. <p> See {@link CategoryListCache#register(CategoryListParams, CategoryListData)} and {@link CategoryListCache#loadAndRegister(CategoryListParams, IndexReader, TaxonomyReader, FacetIndexingParams)}. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
CategoryListData	TokenNameIdentifier	 Category List Data
{	TokenNameLBRACE	
// TODO (Facet): experiment with different orders - p-d-c vs. current d-p-c. 	TokenNameCOMMENT_LINE	TODO (Facet): experiment with different orders - p-d-c vs. current d-p-c. 
private	TokenNameprivate	
transient	TokenNametransient	
volatile	TokenNamevolatile	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docPartitionCategories	TokenNameIdentifier	 doc Partition Categories
;	TokenNameSEMICOLON	
/** * Empty constructor for extensions with modified computation of the data. */	TokenNameCOMMENT_JAVADOC	 Empty constructor for extensions with modified computation of the data. 
protected	TokenNameprotected	
CategoryListData	TokenNameIdentifier	 Category List Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Compute category list data for caching for faster iteration. */	TokenNameCOMMENT_JAVADOC	 Compute category list data for caching for faster iteration. 
CategoryListData	TokenNameIdentifier	 Category List Data
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxo	TokenNameIdentifier	 taxo
,	TokenNameCOMMA	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
iparams	TokenNameIdentifier	 iparams
,	TokenNameCOMMA	
CategoryListParams	TokenNameIdentifier	 Category List Params
clp	TokenNameIdentifier	 clp
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dpf	TokenNameIdentifier	 dpf
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
maxDoc	TokenNameIdentifier	 max Doc
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
numPartitions	TokenNameIdentifier	 num Partitions
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
taxo	TokenNameIdentifier	 taxo
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
iparams	TokenNameIdentifier	 iparams
.	TokenNameDOT	
getPartitionSize	TokenNameIdentifier	 get Partition Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntArray	TokenNameIdentifier	 Int Array
docCategories	TokenNameIdentifier	 doc Categories
=	TokenNameEQUAL	
new	TokenNamenew	
IntArray	TokenNameIdentifier	 Int Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
part	TokenNameIdentifier	 part
<	TokenNameLESS	
numPartitions	TokenNameIdentifier	 num Partitions
;	TokenNameSEMICOLON	
part	TokenNameIdentifier	 part
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
cli	TokenNameIdentifier	 cli
=	TokenNameEQUAL	
clp	TokenNameIdentifier	 clp
.	TokenNameDOT	
createCategoryListIterator	TokenNameIdentifier	 create Category List Iterator
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
<	TokenNameLESS	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docCategories	TokenNameIdentifier	 doc Categories
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dpf	TokenNameIdentifier	 dpf
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dpf	TokenNameIdentifier	 dpf
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numPartitions	TokenNameIdentifier	 num Partitions
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
category	TokenNameIdentifier	 category
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
category	TokenNameIdentifier	 category
=	TokenNameEQUAL	
cli	TokenNameIdentifier	 cli
.	TokenNameDOT	
nextCategory	TokenNameIdentifier	 next Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docCategories	TokenNameIdentifier	 doc Categories
.	TokenNameDOT	
addToArray	TokenNameIdentifier	 add To Array
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
category	TokenNameIdentifier	 category
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
docCategories	TokenNameIdentifier	 doc Categories
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dpf	TokenNameIdentifier	 dpf
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
part	TokenNameIdentifier	 part
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dpf	TokenNameIdentifier	 dpf
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
part	TokenNameIdentifier	 part
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docCategories	TokenNameIdentifier	 doc Categories
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
docPartitionCategories	TokenNameIdentifier	 doc Partition Categories
=	TokenNameEQUAL	
dpf	TokenNameIdentifier	 dpf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Iterate on the category list data for the specified partition. */	TokenNameCOMMENT_JAVADOC	 Iterate on the category list data for the specified partition. 
public	TokenNamepublic	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
int	TokenNameint	
partition	TokenNameIdentifier	 partition
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RAMCategoryListIterator	TokenNameIdentifier	 RAM Category List Iterator
(	TokenNameLPAREN	
partition	TokenNameIdentifier	 partition
,	TokenNameCOMMA	
docPartitionCategories	TokenNameIdentifier	 doc Partition Categories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Internal: category list iterator over uncompressed category info in RAM */	TokenNameCOMMENT_JAVADOC	 Internal: category list iterator over uncompressed category info in RAM 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
RAMCategoryListIterator	TokenNameIdentifier	 RAM Category List Iterator
implements	TokenNameimplements	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
part	TokenNameIdentifier	 part
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dpc	TokenNameIdentifier	 dpc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currDoc	TokenNameIdentifier	 curr Doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nextCategoryIndex	TokenNameIdentifier	 next Category Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
RAMCategoryListIterator	TokenNameIdentifier	 RAM Category List Iterator
(	TokenNameLPAREN	
int	TokenNameint	
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docPartitionCategories	TokenNameIdentifier	 doc Partition Categories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
part	TokenNameIdentifier	 part
;	TokenNameSEMICOLON	
dpc	TokenNameIdentifier	 dpc
=	TokenNameEQUAL	
docPartitionCategories	TokenNameIdentifier	 doc Partition Categories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
dpc	TokenNameIdentifier	 dpc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
dpc	TokenNameIdentifier	 dpc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
part	TokenNameIdentifier	 part
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
nextCategory	TokenNameIdentifier	 next Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nextCategoryIndex	TokenNameIdentifier	 next Category Index
>=	TokenNameGREATER_EQUAL	
dpc	TokenNameIdentifier	 dpc
[	TokenNameLBRACKET	
currDoc	TokenNameIdentifier	 curr Doc
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
part	TokenNameIdentifier	 part
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1L	TokenNameLongLiteral	
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dpc	TokenNameIdentifier	 dpc
[	TokenNameLBRACKET	
currDoc	TokenNameIdentifier	 curr Doc
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
part	TokenNameIdentifier	 part
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
nextCategoryIndex	TokenNameIdentifier	 next Category Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
dpc	TokenNameIdentifier	 dpc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
docId	TokenNameIdentifier	 doc Id
&&	TokenNameAND_AND	
dpc	TokenNameIdentifier	 dpc
[	TokenNameLBRACKET	
docId	TokenNameIdentifier	 doc Id
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
dpc	TokenNameIdentifier	 dpc
[	TokenNameLBRACKET	
docId	TokenNameIdentifier	 doc Id
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
part	TokenNameIdentifier	 part
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currDoc	TokenNameIdentifier	 curr Doc
=	TokenNameEQUAL	
docId	TokenNameIdentifier	 doc Id
;	TokenNameSEMICOLON	
nextCategoryIndex	TokenNameIdentifier	 next Category Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
