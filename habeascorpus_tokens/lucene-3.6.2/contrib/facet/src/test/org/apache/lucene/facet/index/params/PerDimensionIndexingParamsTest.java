package	TokenNamepackage	
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
Term	TokenNameIdentifier	 Term
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
PerDimensionIndexingParams	TokenNameIdentifier	 Per Dimension Indexing Params
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
DrillDown	TokenNameIdentifier	 Drill Down
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
CategoryPath	TokenNameIdentifier	 Category Path
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PartitionsUtils	TokenNameIdentifier	 Partitions Utils
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
PerDimensionIndexingParamsTest	TokenNameIdentifier	 Per Dimension Indexing Params Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testTopLevelSettings	TokenNameIdentifier	 test Top Level Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
ifip	TokenNameIdentifier	 ifip
=	TokenNameEQUAL	
new	TokenNamenew	
PerDimensionIndexingParams	TokenNameIdentifier	 Per Dimension Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Missing default category list"	TokenNameStringLiteral	Missing default category list
,	TokenNameCOMMA	
ifip	TokenNameIdentifier	 ifip
.	TokenNameDOT	
getAllCategoryListParams	TokenNameIdentifier	 get All Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Expected default category list term is $facets:$fulltree$"	TokenNameStringLiteral	Expected default category list term is $facets:$fulltree$
,	TokenNameCOMMA	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"$facets"	TokenNameStringLiteral	$facets
,	TokenNameCOMMA	
"$fulltree$"	TokenNameStringLiteral	$fulltree$
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ifip	TokenNameIdentifier	 ifip
.	TokenNameDOT	
getCategoryListParams	TokenNameIdentifier	 get Category List Params
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expectedDDText	TokenNameIdentifier	 expected DD Text
=	TokenNameEQUAL	
"a"	TokenNameStringLiteral	a
+	TokenNamePLUS	
ifip	TokenNameIdentifier	 ifip
.	TokenNameDOT	
getFacetDelimChar	TokenNameIdentifier	 get Facet Delim Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"b"	TokenNameStringLiteral	b
;	TokenNameSEMICOLON	
CategoryPath	TokenNameIdentifier	 Category Path
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong drill-down term"	TokenNameStringLiteral	wrong drill-down term
,	TokenNameCOMMA	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"$facets"	TokenNameStringLiteral	$facets
,	TokenNameCOMMA	
expectedDDText	TokenNameIdentifier	 expected DD Text
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DrillDown	TokenNameIdentifier	 Drill Down
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
ifip	TokenNameIdentifier	 ifip
,	TokenNameCOMMA	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
20	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
numchars	TokenNameIdentifier	 numchars
=	TokenNameEQUAL	
ifip	TokenNameIdentifier	 ifip
.	TokenNameDOT	
drillDownTermText	TokenNameIdentifier	 drill Down Term Text
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"3 characters should be written"	TokenNameStringLiteral	3 characters should be written
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numchars	TokenNameIdentifier	 numchars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong drill-down term text"	TokenNameStringLiteral	wrong drill-down term text
,	TokenNameCOMMA	
expectedDDText	TokenNameIdentifier	 expected DD Text
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numchars	TokenNameIdentifier	 numchars
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryListParams	TokenNameIdentifier	 Category List Params
clParams	TokenNameIdentifier	 cl Params
=	TokenNameEQUAL	
ifip	TokenNameIdentifier	 ifip
.	TokenNameDOT	
getCategoryListParams	TokenNameIdentifier	 get Category List Params
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"partition for all ordinals is the first"	TokenNameStringLiteral	partition for all ordinals is the first
,	TokenNameCOMMA	
"$fulltree$"	TokenNameStringLiteral	$fulltree$
,	TokenNameCOMMA	
PartitionsUtils	TokenNameIdentifier	 Partitions Utils
.	TokenNameDOT	
partitionNameByOrdinal	TokenNameIdentifier	 partition Name By Ordinal
(	TokenNameLPAREN	
ifip	TokenNameIdentifier	 ifip
,	TokenNameCOMMA	
clParams	TokenNameIdentifier	 cl Params
,	TokenNameCOMMA	
250	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"for partition 0, the same name should be returned"	TokenNameStringLiteral	for partition 0, the same name should be returned
,	TokenNameCOMMA	
"$fulltree$"	TokenNameStringLiteral	$fulltree$
,	TokenNameCOMMA	
PartitionsUtils	TokenNameIdentifier	 Partitions Utils
.	TokenNameDOT	
partitionName	TokenNameIdentifier	 partition Name
(	TokenNameLPAREN	
clParams	TokenNameIdentifier	 cl Params
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"for any other, it's the concatenation of name + partition"	TokenNameStringLiteral	for any other, it's the concatenation of name + partition
,	TokenNameCOMMA	
"$fulltree$1"	TokenNameStringLiteral	$fulltree$1
,	TokenNameCOMMA	
PartitionsUtils	TokenNameIdentifier	 Partitions Utils
.	TokenNameDOT	
partitionName	TokenNameIdentifier	 partition Name
(	TokenNameLPAREN	
clParams	TokenNameIdentifier	 cl Params
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"default partition number is always 0"	TokenNameStringLiteral	default partition number is always 0
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
PartitionsUtils	TokenNameIdentifier	 Partitions Utils
.	TokenNameDOT	
partitionNumber	TokenNameIdentifier	 partition Number
(	TokenNameLPAREN	
ifip	TokenNameIdentifier	 ifip
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"default partition size is unbounded"	TokenNameStringLiteral	default partition size is unbounded
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
ifip	TokenNameIdentifier	 ifip
.	TokenNameDOT	
getPartitionSize	TokenNameIdentifier	 get Partition Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCategoryListParamsAddition	TokenNameIdentifier	 test Category List Params Addition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PerDimensionIndexingParams	TokenNameIdentifier	 Per Dimension Indexing Params
tlfip	TokenNameIdentifier	 tlfip
=	TokenNameEQUAL	
new	TokenNamenew	
PerDimensionIndexingParams	TokenNameIdentifier	 Per Dimension Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryListParams	TokenNameIdentifier	 Category List Params
clp	TokenNameIdentifier	 clp
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryListParams	TokenNameIdentifier	 Category List Params
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"clp"	TokenNameStringLiteral	clp
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tlfip	TokenNameIdentifier	 tlfip
.	TokenNameDOT	
addCategoryListParams	TokenNameIdentifier	 add Category List Params
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clp	TokenNameIdentifier	 clp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Expected category list term is "	TokenNameStringLiteral	Expected category list term is 
+	TokenNamePLUS	
clp	TokenNameIdentifier	 clp
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clp	TokenNameIdentifier	 clp
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tlfip	TokenNameIdentifier	 tlfip
.	TokenNameDOT	
getCategoryListParams	TokenNameIdentifier	 get Category List Params
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
"Unexpected default category list "	TokenNameStringLiteral	Unexpected default category list 
+	TokenNamePLUS	
clp	TokenNameIdentifier	 clp
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clp	TokenNameIdentifier	 clp
,	TokenNameCOMMA	
tlfip	TokenNameIdentifier	 tlfip
.	TokenNameDOT	
getCategoryListParams	TokenNameIdentifier	 get Category List Params
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
