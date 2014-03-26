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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
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
IOUtils	TokenNameIdentifier	 IO Utils
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
_TestUtil	TokenNameIdentifier	 Test Util
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
FacetTestUtils	TokenNameIdentifier	 Facet Test Utils
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
FacetTestUtils	TokenNameIdentifier	 Facet Test Utils
.	TokenNameDOT	
IndexTaxonomyReaderPair	TokenNameIdentifier	 Index Taxonomy Reader Pair
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
FacetTestUtils	TokenNameIdentifier	 Facet Test Utils
.	TokenNameDOT	
IndexTaxonomyWriterPair	TokenNameIdentifier	 Index Taxonomy Writer Pair
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
DefaultFacetIndexingParams	TokenNameIdentifier	 Default Facet Indexing Params
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
TestTotalFacetCounts	TokenNameIdentifier	 Test Total Facet Counts
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
initCache	TokenNameIdentifier	 init Cache
(	TokenNameLPAREN	
int	TokenNameint	
numEntries	TokenNameIdentifier	 num Entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TotalFacetCountsCache	TokenNameIdentifier	 Total Facet Counts Cache
.	TokenNameDOT	
getSingleton	TokenNameIdentifier	 get Singleton
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TotalFacetCountsCache	TokenNameIdentifier	 Total Facet Counts Cache
.	TokenNameDOT	
getSingleton	TokenNameIdentifier	 get Singleton
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setCacheSize	TokenNameIdentifier	 set Cache Size
(	TokenNameLPAREN	
numEntries	TokenNameIdentifier	 num Entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set to keep one in mem 	TokenNameCOMMENT_LINE	Set to keep one in mem 
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testWriteRead	TokenNameIdentifier	 test Write Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
doTestWriteRead	TokenNameIdentifier	 do Test Write Read
(	TokenNameLPAREN	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doTestWriteRead	TokenNameIdentifier	 do Test Write Read
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doTestWriteRead	TokenNameIdentifier	 do Test Write Read
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doTestWriteRead	TokenNameIdentifier	 do Test Write Read
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doTestWriteRead	TokenNameIdentifier	 do Test Write Read
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
doTestWriteRead	TokenNameIdentifier	 do Test Write Read
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
partitionSize	TokenNameIdentifier	 partition Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
initCache	TokenNameIdentifier	 init Cache
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create temporary RAMDirectories 	TokenNameCOMMENT_LINE	Create temporary RAMDirectories 
Directory	TokenNameIdentifier	 Directory
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dirs	TokenNameIdentifier	 dirs
=	TokenNameEQUAL	
FacetTestUtils	TokenNameIdentifier	 Facet Test Utils
.	TokenNameDOT	
createIndexTaxonomyDirs	TokenNameIdentifier	 create Index Taxonomy Dirs
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create our index/taxonomy writers 	TokenNameCOMMENT_LINE	Create our index/taxonomy writers 
IndexTaxonomyWriterPair	TokenNameIdentifier	 Index Taxonomy Writer Pair
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
writers	TokenNameIdentifier	 writers
=	TokenNameEQUAL	
FacetTestUtils	TokenNameIdentifier	 Facet Test Utils
.	TokenNameDOT	
createIndexTaxonomyWriterPair	TokenNameIdentifier	 create Index Taxonomy Writer Pair
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DefaultFacetIndexingParams	TokenNameIdentifier	 Default Facet Indexing Params
iParams	TokenNameIdentifier	 i Params
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultFacetIndexingParams	TokenNameIdentifier	 Default Facet Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
fixedPartitionSize	TokenNameIdentifier	 fixed Partition Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
partitionSize	TokenNameIdentifier	 partition Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// The counts that the TotalFacetCountsArray should have after adding 	TokenNameCOMMENT_LINE	The counts that the TotalFacetCountsArray should have after adding 
// the below facets to the index. 	TokenNameCOMMENT_LINE	the below facets to the index. 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expectedCounts	TokenNameIdentifier	 expected Counts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// Add a facet to the index 	TokenNameCOMMENT_LINE	Add a facet to the index 
TestTotalFacetCountsCache	TokenNameIdentifier	 Test Total Facet Counts Cache
.	TokenNameDOT	
addFacets	TokenNameIdentifier	 add Facets
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexWriter	TokenNameIdentifier	 index Writer
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
taxWriter	TokenNameIdentifier	 tax Writer
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestTotalFacetCountsCache	TokenNameIdentifier	 Test Total Facet Counts Cache
.	TokenNameDOT	
addFacets	TokenNameIdentifier	 add Facets
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexWriter	TokenNameIdentifier	 index Writer
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
taxWriter	TokenNameIdentifier	 tax Writer
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"d"	TokenNameStringLiteral	d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestTotalFacetCountsCache	TokenNameIdentifier	 Test Total Facet Counts Cache
.	TokenNameDOT	
addFacets	TokenNameIdentifier	 add Facets
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexWriter	TokenNameIdentifier	 index Writer
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
taxWriter	TokenNameIdentifier	 tax Writer
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"e"	TokenNameStringLiteral	e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestTotalFacetCountsCache	TokenNameIdentifier	 Test Total Facet Counts Cache
.	TokenNameDOT	
addFacets	TokenNameIdentifier	 add Facets
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexWriter	TokenNameIdentifier	 index Writer
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
taxWriter	TokenNameIdentifier	 tax Writer
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"d"	TokenNameStringLiteral	d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestTotalFacetCountsCache	TokenNameIdentifier	 Test Total Facet Counts Cache
.	TokenNameDOT	
addFacets	TokenNameIdentifier	 add Facets
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexWriter	TokenNameIdentifier	 index Writer
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
taxWriter	TokenNameIdentifier	 tax Writer
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"g"	TokenNameStringLiteral	g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestTotalFacetCountsCache	TokenNameIdentifier	 Test Total Facet Counts Cache
.	TokenNameDOT	
addFacets	TokenNameIdentifier	 add Facets
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexWriter	TokenNameIdentifier	 index Writer
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
taxWriter	TokenNameIdentifier	 tax Writer
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"z"	TokenNameStringLiteral	z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestTotalFacetCountsCache	TokenNameIdentifier	 Test Total Facet Counts Cache
.	TokenNameDOT	
addFacets	TokenNameIdentifier	 add Facets
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexWriter	TokenNameIdentifier	 index Writer
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
taxWriter	TokenNameIdentifier	 tax Writer
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestTotalFacetCountsCache	TokenNameIdentifier	 Test Total Facet Counts Cache
.	TokenNameDOT	
addFacets	TokenNameIdentifier	 add Facets
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexWriter	TokenNameIdentifier	 index Writer
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
taxWriter	TokenNameIdentifier	 tax Writer
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TestTotalFacetCountsCache	TokenNameIdentifier	 Test Total Facet Counts Cache
.	TokenNameDOT	
addFacets	TokenNameIdentifier	 add Facets
(	TokenNameLPAREN	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexWriter	TokenNameIdentifier	 index Writer
,	TokenNameCOMMA	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
taxWriter	TokenNameIdentifier	 tax Writer
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Commit Changes 	TokenNameCOMMENT_LINE	Commit Changes 
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writers	TokenNameIdentifier	 writers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexTaxonomyReaderPair	TokenNameIdentifier	 Index Taxonomy Reader Pair
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readers	TokenNameIdentifier	 readers
=	TokenNameEQUAL	
FacetTestUtils	TokenNameIdentifier	 Facet Test Utils
.	TokenNameDOT	
createIndexTaxonomyReaderPair	TokenNameIdentifier	 create Index Taxonomy Reader Pair
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
intArray	TokenNameIdentifier	 int Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
iParams	TokenNameIdentifier	 i Params
.	TokenNameDOT	
getPartitionSize	TokenNameIdentifier	 get Partition Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
TotalFacetCountsCache	TokenNameIdentifier	 Total Facet Counts Cache
tfcc	TokenNameIdentifier	 tfcc
=	TokenNameEQUAL	
TotalFacetCountsCache	TokenNameIdentifier	 Total Facet Counts Cache
.	TokenNameDOT	
getSingleton	TokenNameIdentifier	 get Singleton
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tmpFile	TokenNameIdentifier	 tmp File
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"tmp"	TokenNameStringLiteral	tmp
,	TokenNameCOMMA	
TEMP_DIR	TokenNameIdentifier	 TEMP  DIR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tfcc	TokenNameIdentifier	 tfcc
.	TokenNameDOT	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
tmpFile	TokenNameIdentifier	 tmp File
,	TokenNameCOMMA	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
taxReader	TokenNameIdentifier	 tax Reader
,	TokenNameCOMMA	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tfcc	TokenNameIdentifier	 tfcc
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// not really required because TFCC overrides on load(), but in the test we need not rely on this. 	TokenNameCOMMENT_LINE	not really required because TFCC overrides on load(), but in the test we need not rely on this. 
tfcc	TokenNameIdentifier	 tfcc
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
tmpFile	TokenNameIdentifier	 tmp File
,	TokenNameCOMMA	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
taxReader	TokenNameIdentifier	 tax Reader
,	TokenNameCOMMA	
iParams	TokenNameIdentifier	 i Params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now retrieve the one just loaded 	TokenNameCOMMENT_LINE	now retrieve the one just loaded 
TotalFacetCounts	TokenNameIdentifier	 Total Facet Counts
totalCounts	TokenNameIdentifier	 total Counts
=	TokenNameEQUAL	
tfcc	TokenNameIdentifier	 tfcc
.	TokenNameDOT	
getTotalCounts	TokenNameIdentifier	 get Total Counts
(	TokenNameLPAREN	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
taxReader	TokenNameIdentifier	 tax Reader
,	TokenNameCOMMA	
iParams	TokenNameIdentifier	 i Params
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
partition	TokenNameIdentifier	 partition
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
expectedCounts	TokenNameIdentifier	 expected Counts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
partitionSize	TokenNameIdentifier	 partition Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totalCounts	TokenNameIdentifier	 total Counts
.	TokenNameDOT	
fillTotalCountsForPartition	TokenNameIdentifier	 fill Total Counts For Partition
(	TokenNameLPAREN	
intArray	TokenNameIdentifier	 int Array
,	TokenNameCOMMA	
partition	TokenNameIdentifier	 partition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
partitionExpectedCounts	TokenNameIdentifier	 partition Expected Counts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
partitionSize	TokenNameIdentifier	 partition Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
nToCopy	TokenNameIdentifier	 n To Copy
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
partitionSize	TokenNameIdentifier	 partition Size
,	TokenNameCOMMA	
expectedCounts	TokenNameIdentifier	 expected Counts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
expectedCounts	TokenNameIdentifier	 expected Counts
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
partitionExpectedCounts	TokenNameIdentifier	 partition Expected Counts
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nToCopy	TokenNameIdentifier	 n To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Wrong counts! for partition "	TokenNameStringLiteral	Wrong counts! for partition 
+	TokenNamePLUS	
partition	TokenNameIdentifier	 partition
+	TokenNamePLUS	
" Expected: "	TokenNameStringLiteral	 Expected: 
+	TokenNamePLUS	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
partitionExpectedCounts	TokenNameIdentifier	 partition Expected Counts
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Actual: "	TokenNameStringLiteral	 Actual: 
+	TokenNamePLUS	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
intArray	TokenNameIdentifier	 int Array
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
partitionExpectedCounts	TokenNameIdentifier	 partition Expected Counts
,	TokenNameCOMMA	
intArray	TokenNameIdentifier	 int Array
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
partition	TokenNameIdentifier	 partition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpFile	TokenNameIdentifier	 tmp File
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
