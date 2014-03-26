package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
DocIdBitSet	TokenNameIdentifier	 Doc Id Bit Set
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BitSet	TokenNameIdentifier	 Bit Set
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexWriter	TokenNameIdentifier	 Index Writer
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
OpenMode	TokenNameIdentifier	 Open Mode
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
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
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
TestScorerPerf	TokenNameIdentifier	 Test Scorer Perf
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
boolean	TokenNameboolean	
validate	TokenNameIdentifier	 validate
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// set to false when doing performance testing 	TokenNameCOMMENT_LINE	set to false when doing performance testing 
BitSet	TokenNameIdentifier	 Bit Set
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sets	TokenNameIdentifier	 sets
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
// TODO: this should be setUp().... 	TokenNameCOMMENT_LINE	TODO: this should be setUp().... 
public	TokenNamepublic	
void	TokenNamevoid	
createDummySearcher	TokenNameIdentifier	 create Dummy Searcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Create a dummy index with nothing in it. 	TokenNameCOMMENT_LINE	Create a dummy index with nothing in it. 
// This could possibly fail if Lucene starts checking for docid ranges... 	TokenNameCOMMENT_LINE	This could possibly fail if Lucene starts checking for docid ranges... 
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
iw	TokenNameIdentifier	 iw
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
createRandomTerms	TokenNameIdentifier	 create Random Terms
(	TokenNameLPAREN	
int	TokenNameint	
nDocs	TokenNameIdentifier	 n Docs
,	TokenNameCOMMA	
int	TokenNameint	
nTerms	TokenNameIdentifier	 n Terms
,	TokenNameCOMMA	
double	TokenNamedouble	
power	TokenNameIdentifier	 power
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
nTerms	TokenNameIdentifier	 n Terms
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
nTerms	TokenNameIdentifier	 n Terms
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
nTerms	TokenNameIdentifier	 n Terms
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
nTerms	TokenNameIdentifier	 n Terms
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// make first terms less frequent 	TokenNameCOMMENT_LINE	make first terms less frequent 
freq	TokenNameIdentifier	 freq
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
power	TokenNameIdentifier	 power
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
'A'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IndexWriter	TokenNameIdentifier	 Index Writer
iw	TokenNameIdentifier	 iw
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setOpenMode	TokenNameIdentifier	 set Open Mode
(	TokenNameLPAREN	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
CREATE	TokenNameIdentifier	 CREATE
)	TokenNameRPAREN	
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
nDocs	TokenNameIdentifier	 n Docs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nTerms	TokenNameIdentifier	 n Terms
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(d); 	TokenNameCOMMENT_LINE	System.out.println(d); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BitSet	TokenNameIdentifier	 Bit Set
randBitSet	TokenNameIdentifier	 rand Bit Set
(	TokenNameLPAREN	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
,	TokenNameCOMMA	
int	TokenNameint	
numBitsToSet	TokenNameIdentifier	 num Bits To Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BitSet	TokenNameIdentifier	 Bit Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
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
numBitsToSet	TokenNameIdentifier	 num Bits To Set
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
set	TokenNameIdentifier	 set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BitSet	TokenNameIdentifier	 Bit Set
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
randBitSets	TokenNameIdentifier	 rand Bit Sets
(	TokenNameLPAREN	
int	TokenNameint	
numSets	TokenNameIdentifier	 num Sets
,	TokenNameCOMMA	
int	TokenNameint	
setSize	TokenNameIdentifier	 set Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BitSet	TokenNameIdentifier	 Bit Set
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sets	TokenNameIdentifier	 sets
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
[	TokenNameLBRACKET	
numSets	TokenNameIdentifier	 num Sets
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
sets	TokenNameIdentifier	 sets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sets	TokenNameIdentifier	 sets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
randBitSet	TokenNameIdentifier	 rand Bit Set
(	TokenNameLPAREN	
setSize	TokenNameIdentifier	 set Size
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
setSize	TokenNameIdentifier	 set Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sets	TokenNameIdentifier	 sets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
CountingHitCollector	TokenNameIdentifier	 Counting Hit Collector
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
// use it to avoid any possibility of being eliminated by hotspot 	TokenNameCOMMENT_LINE	use it to avoid any possibility of being eliminated by hotspot 
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getSum	TokenNameIdentifier	 get Sum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MatchingHitCollector	TokenNameIdentifier	 Matching Hit Collector
extends	TokenNameextends	
CountingHitCollector	TokenNameIdentifier	 Counting Hit Collector
{	TokenNameLBRACE	
BitSet	TokenNameIdentifier	 Bit Set
answer	TokenNameIdentifier	 answer
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MatchingHitCollector	TokenNameIdentifier	 Matching Hit Collector
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
answer	TokenNameIdentifier	 answer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
answer	TokenNameIdentifier	 answer
=	TokenNameEQUAL	
answer	TokenNameIdentifier	 answer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
answer	TokenNameIdentifier	 answer
.	TokenNameDOT	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
!=	TokenNameNOT_EQUAL	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Expected doc "	TokenNameStringLiteral	Expected doc 
+	TokenNamePLUS	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
" but got "	TokenNameStringLiteral	 but got 
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
BitSet	TokenNameIdentifier	 Bit Set
addClause	TokenNameIdentifier	 add Clause
(	TokenNameLPAREN	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
BitSet	TokenNameIdentifier	 Bit Set
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
BitSet	TokenNameIdentifier	 Bit Set
rnd	TokenNameIdentifier	 rnd
=	TokenNameEQUAL	
sets	TokenNameIdentifier	 sets
[	TokenNameLBRACKET	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sets	TokenNameIdentifier	 sets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DocIdBitSet	TokenNameIdentifier	 Doc Id Bit Set
(	TokenNameLPAREN	
rnd	TokenNameIdentifier	 rnd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
)	TokenNameRPAREN	
rnd	TokenNameIdentifier	 rnd
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
rnd	TokenNameIdentifier	 rnd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
doConjunctions	TokenNameIdentifier	 do Conjunctions
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
int	TokenNameint	
maxClauses	TokenNameIdentifier	 max Clauses
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
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
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nClauses	TokenNameIdentifier	 n Clauses
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxClauses	TokenNameIdentifier	 max Clauses
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// min 2 clauses 	TokenNameCOMMENT_LINE	min 2 clauses 
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BitSet	TokenNameIdentifier	 Bit Set
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nClauses	TokenNameIdentifier	 n Clauses
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
addClause	TokenNameIdentifier	 add Clause
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CountingHitCollector	TokenNameIdentifier	 Counting Hit Collector
hc	TokenNameIdentifier	 hc
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
?	TokenNameQUESTION	
new	TokenNamenew	
MatchingHitCollector	TokenNameIdentifier	 Matching Hit Collector
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
CountingHitCollector	TokenNameIdentifier	 Counting Hit Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
hc	TokenNameIdentifier	 hc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
hc	TokenNameIdentifier	 hc
.	TokenNameDOT	
getSum	TokenNameIdentifier	 get Sum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
hc	TokenNameIdentifier	 hc
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println(hc.getCount()); 	TokenNameCOMMENT_LINE	System.out.println(hc.getCount()); 
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
doNestedConjunctions	TokenNameIdentifier	 do Nested Conjunctions
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
int	TokenNameint	
maxOuterClauses	TokenNameIdentifier	 max Outer Clauses
,	TokenNameCOMMA	
int	TokenNameint	
maxClauses	TokenNameIdentifier	 max Clauses
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
nMatches	TokenNameIdentifier	 n Matches
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
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
oClauses	TokenNameIdentifier	 o Clauses
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxOuterClauses	TokenNameIdentifier	 max Outer Clauses
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
oq	TokenNameIdentifier	 oq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BitSet	TokenNameIdentifier	 Bit Set
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
o	TokenNameIdentifier	 o
<	TokenNameLESS	
oClauses	TokenNameIdentifier	 o Clauses
;	TokenNameSEMICOLON	
o	TokenNameIdentifier	 o
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nClauses	TokenNameIdentifier	 n Clauses
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxClauses	TokenNameIdentifier	 max Clauses
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// min 2 clauses 	TokenNameCOMMENT_LINE	min 2 clauses 
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nClauses	TokenNameIdentifier	 n Clauses
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
addClause	TokenNameIdentifier	 add Clause
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
oq	TokenNameIdentifier	 oq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// outer 	TokenNameCOMMENT_LINE	outer 
CountingHitCollector	TokenNameIdentifier	 Counting Hit Collector
hc	TokenNameIdentifier	 hc
=	TokenNameEQUAL	
validate	TokenNameIdentifier	 validate
?	TokenNameQUESTION	
new	TokenNamenew	
MatchingHitCollector	TokenNameIdentifier	 Matching Hit Collector
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
CountingHitCollector	TokenNameIdentifier	 Counting Hit Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
oq	TokenNameIdentifier	 oq
,	TokenNameCOMMA	
hc	TokenNameIdentifier	 hc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nMatches	TokenNameIdentifier	 n Matches
+=	TokenNamePLUS_EQUAL	
hc	TokenNameIdentifier	 hc
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
hc	TokenNameIdentifier	 hc
.	TokenNameDOT	
getSum	TokenNameIdentifier	 get Sum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
hc	TokenNameIdentifier	 hc
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println(hc.getCount()); 	TokenNameCOMMENT_LINE	System.out.println(hc.getCount()); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Average number of matches="	TokenNameStringLiteral	Average number of matches=
+	TokenNamePLUS	
(	TokenNameLPAREN	
nMatches	TokenNameIdentifier	 n Matches
/	TokenNameDIVIDE	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
doTermConjunctions	TokenNameIdentifier	 do Term Conjunctions
(	TokenNameLPAREN	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
termsInIndex	TokenNameIdentifier	 terms In Index
,	TokenNameCOMMA	
int	TokenNameint	
maxClauses	TokenNameIdentifier	 max Clauses
,	TokenNameCOMMA	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
nMatches	TokenNameIdentifier	 n Matches
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
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nClauses	TokenNameIdentifier	 n Clauses
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxClauses	TokenNameIdentifier	 max Clauses
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// min 2 clauses 	TokenNameCOMMENT_LINE	min 2 clauses 
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BitSet	TokenNameIdentifier	 Bit Set
termflag	TokenNameIdentifier	 termflag
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
termsInIndex	TokenNameIdentifier	 terms In Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nClauses	TokenNameIdentifier	 n Clauses
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tnum	TokenNameIdentifier	 tnum
;	TokenNameSEMICOLON	
// don't pick same clause twice 	TokenNameCOMMENT_LINE	don't pick same clause twice 
tnum	TokenNameIdentifier	 tnum
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
termsInIndex	TokenNameIdentifier	 terms In Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termflag	TokenNameIdentifier	 termflag
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tnum	TokenNameIdentifier	 tnum
)	TokenNameRPAREN	
)	TokenNameRPAREN	
tnum	TokenNameIdentifier	 tnum
=	TokenNameEQUAL	
termflag	TokenNameIdentifier	 termflag
.	TokenNameDOT	
nextClearBit	TokenNameIdentifier	 next Clear Bit
(	TokenNameLPAREN	
tnum	TokenNameIdentifier	 tnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tnum	TokenNameIdentifier	 tnum
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
tnum	TokenNameIdentifier	 tnum
>=	TokenNameGREATER_EQUAL	
termsInIndex	TokenNameIdentifier	 terms In Index
)	TokenNameRPAREN	
tnum	TokenNameIdentifier	 tnum
=	TokenNameEQUAL	
termflag	TokenNameIdentifier	 termflag
.	TokenNameDOT	
nextClearBit	TokenNameIdentifier	 next Clear Bit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termflag	TokenNameIdentifier	 termflag
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
tnum	TokenNameIdentifier	 tnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
tq	TokenNameIdentifier	 tq
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
tnum	TokenNameIdentifier	 tnum
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CountingHitCollector	TokenNameIdentifier	 Counting Hit Collector
hc	TokenNameIdentifier	 hc
=	TokenNameEQUAL	
new	TokenNamenew	
CountingHitCollector	TokenNameIdentifier	 Counting Hit Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
hc	TokenNameIdentifier	 hc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nMatches	TokenNameIdentifier	 n Matches
+=	TokenNamePLUS_EQUAL	
hc	TokenNameIdentifier	 hc
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
hc	TokenNameIdentifier	 hc
.	TokenNameDOT	
getSum	TokenNameIdentifier	 get Sum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Average number of matches="	TokenNameStringLiteral	Average number of matches=
+	TokenNamePLUS	
(	TokenNameLPAREN	
nMatches	TokenNameIdentifier	 n Matches
/	TokenNameDIVIDE	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
doNestedTermConjunctions	TokenNameIdentifier	 do Nested Term Conjunctions
(	TokenNameLPAREN	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
termsInIndex	TokenNameIdentifier	 terms In Index
,	TokenNameCOMMA	
int	TokenNameint	
maxOuterClauses	TokenNameIdentifier	 max Outer Clauses
,	TokenNameCOMMA	
int	TokenNameint	
maxClauses	TokenNameIdentifier	 max Clauses
,	TokenNameCOMMA	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
nMatches	TokenNameIdentifier	 n Matches
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
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
oClauses	TokenNameIdentifier	 o Clauses
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxOuterClauses	TokenNameIdentifier	 max Outer Clauses
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
oq	TokenNameIdentifier	 oq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
o	TokenNameIdentifier	 o
<	TokenNameLESS	
oClauses	TokenNameIdentifier	 o Clauses
;	TokenNameSEMICOLON	
o	TokenNameIdentifier	 o
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nClauses	TokenNameIdentifier	 n Clauses
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxClauses	TokenNameIdentifier	 max Clauses
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// min 2 clauses 	TokenNameCOMMENT_LINE	min 2 clauses 
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BitSet	TokenNameIdentifier	 Bit Set
termflag	TokenNameIdentifier	 termflag
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
termsInIndex	TokenNameIdentifier	 terms In Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nClauses	TokenNameIdentifier	 n Clauses
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tnum	TokenNameIdentifier	 tnum
;	TokenNameSEMICOLON	
// don't pick same clause twice 	TokenNameCOMMENT_LINE	don't pick same clause twice 
tnum	TokenNameIdentifier	 tnum
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
termsInIndex	TokenNameIdentifier	 terms In Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termflag	TokenNameIdentifier	 termflag
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tnum	TokenNameIdentifier	 tnum
)	TokenNameRPAREN	
)	TokenNameRPAREN	
tnum	TokenNameIdentifier	 tnum
=	TokenNameEQUAL	
termflag	TokenNameIdentifier	 termflag
.	TokenNameDOT	
nextClearBit	TokenNameIdentifier	 next Clear Bit
(	TokenNameLPAREN	
tnum	TokenNameIdentifier	 tnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tnum	TokenNameIdentifier	 tnum
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
tnum	TokenNameIdentifier	 tnum
>=	TokenNameGREATER_EQUAL	
25	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
tnum	TokenNameIdentifier	 tnum
=	TokenNameEQUAL	
termflag	TokenNameIdentifier	 termflag
.	TokenNameDOT	
nextClearBit	TokenNameIdentifier	 next Clear Bit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termflag	TokenNameIdentifier	 termflag
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
tnum	TokenNameIdentifier	 tnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
tq	TokenNameIdentifier	 tq
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
tnum	TokenNameIdentifier	 tnum
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inner 	TokenNameCOMMENT_LINE	inner 
oq	TokenNameIdentifier	 oq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// outer 	TokenNameCOMMENT_LINE	outer 
CountingHitCollector	TokenNameIdentifier	 Counting Hit Collector
hc	TokenNameIdentifier	 hc
=	TokenNameEQUAL	
new	TokenNamenew	
CountingHitCollector	TokenNameIdentifier	 Counting Hit Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
oq	TokenNameIdentifier	 oq
,	TokenNameCOMMA	
hc	TokenNameIdentifier	 hc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nMatches	TokenNameIdentifier	 n Matches
+=	TokenNamePLUS_EQUAL	
hc	TokenNameIdentifier	 hc
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
hc	TokenNameIdentifier	 hc
.	TokenNameDOT	
getSum	TokenNameIdentifier	 get Sum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Average number of matches="	TokenNameStringLiteral	Average number of matches=
+	TokenNamePLUS	
(	TokenNameLPAREN	
nMatches	TokenNameIdentifier	 n Matches
/	TokenNameDIVIDE	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
doSloppyPhrase	TokenNameIdentifier	 do Sloppy Phrase
(	TokenNameLPAREN	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
termsInIndex	TokenNameIdentifier	 terms In Index
,	TokenNameCOMMA	
int	TokenNameint	
maxClauses	TokenNameIdentifier	 max Clauses
,	TokenNameCOMMA	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
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
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nClauses	TokenNameIdentifier	 n Clauses
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxClauses	TokenNameIdentifier	 max Clauses
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// min 2 clauses 	TokenNameCOMMENT_LINE	min 2 clauses 
PhraseQuery	TokenNameIdentifier	 Phrase Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nClauses	TokenNameIdentifier	 n Clauses
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tnum	TokenNameIdentifier	 tnum
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
termsInIndex	TokenNameIdentifier	 terms In Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
tnum	TokenNameIdentifier	 tnum
+	TokenNamePLUS	
'A'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
termsInIndex	TokenNameIdentifier	 terms In Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this could be random too 	TokenNameCOMMENT_LINE	this could be random too 
CountingHitCollector	TokenNameIdentifier	 Counting Hit Collector
hc	TokenNameIdentifier	 hc
=	TokenNameEQUAL	
new	TokenNamenew	
CountingHitCollector	TokenNameIdentifier	 Counting Hit Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
hc	TokenNameIdentifier	 hc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
hc	TokenNameIdentifier	 hc
.	TokenNameDOT	
getSum	TokenNameIdentifier	 get Sum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testConjunctions	TokenNameIdentifier	 test Conjunctions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// test many small sets... the bugs will be found on boundary conditions 	TokenNameCOMMENT_LINE	test many small sets... the bugs will be found on boundary conditions 
createDummySearcher	TokenNameIdentifier	 create Dummy Searcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validate	TokenNameIdentifier	 validate
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
sets	TokenNameIdentifier	 sets
=	TokenNameEQUAL	
randBitSets	TokenNameIdentifier	 rand Bit Sets
(	TokenNameLPAREN	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doConjunctions	TokenNameIdentifier	 do Conjunctions
(	TokenNameLPAREN	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doNestedConjunctions	TokenNameIdentifier	 do Nested Conjunctions
(	TokenNameLPAREN	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** int bigIter=10; public void testConjunctionPerf() throws Exception { r = newRandom(); createDummySearcher(); validate=false; sets=randBitSets(32,1000000); for (int i=0; i<bigIter; i++) { long start = System.currentTimeMillis(); doConjunctions(500,6); long end = System.currentTimeMillis(); if (VERBOSE) System.out.println("milliseconds="+(end-start)); } s.close(); } public void testNestedConjunctionPerf() throws Exception { r = newRandom(); createDummySearcher(); validate=false; sets=randBitSets(32,1000000); for (int i=0; i<bigIter; i++) { long start = System.currentTimeMillis(); doNestedConjunctions(500,3,3); long end = System.currentTimeMillis(); if (VERBOSE) System.out.println("milliseconds="+(end-start)); } s.close(); } public void testConjunctionTerms() throws Exception { r = newRandom(); validate=false; RAMDirectory dir = new RAMDirectory(); if (VERBOSE) System.out.println("Creating index"); createRandomTerms(100000,25,.5, dir); s = new IndexSearcher(dir, true); if (VERBOSE) System.out.println("Starting performance test"); for (int i=0; i<bigIter; i++) { long start = System.currentTimeMillis(); doTermConjunctions(s,25,5,1000); long end = System.currentTimeMillis(); if (VERBOSE) System.out.println("milliseconds="+(end-start)); } s.close(); } public void testNestedConjunctionTerms() throws Exception { r = newRandom(); validate=false; RAMDirectory dir = new RAMDirectory(); if (VERBOSE) System.out.println("Creating index"); createRandomTerms(100000,25,.2, dir); s = new IndexSearcher(dir, true); if (VERBOSE) System.out.println("Starting performance test"); for (int i=0; i<bigIter; i++) { long start = System.currentTimeMillis(); doNestedTermConjunctions(s,25,3,3,200); long end = System.currentTimeMillis(); if (VERBOSE) System.out.println("milliseconds="+(end-start)); } s.close(); } public void testSloppyPhrasePerf() throws Exception { r = newRandom(); validate=false; RAMDirectory dir = new RAMDirectory(); if (VERBOSE) System.out.println("Creating index"); createRandomTerms(100000,25,2,dir); s = new IndexSearcher(dir, true); if (VERBOSE) System.out.println("Starting performance test"); for (int i=0; i<bigIter; i++) { long start = System.currentTimeMillis(); doSloppyPhrase(s,25,2,1000); long end = System.currentTimeMillis(); if (VERBOSE) System.out.println("milliseconds="+(end-start)); } s.close(); } ***/	TokenNameCOMMENT_JAVADOC	* int bigIter=10; public void testConjunctionPerf() throws Exception { r = newRandom(); createDummySearcher(); validate=false; sets=randBitSets(32,1000000); for (int i=0; i<bigIter; i++) { long start = System.currentTimeMillis(); doConjunctions(500,6); long end = System.currentTimeMillis(); if (VERBOSE) System.out.println("milliseconds="+(end-start)); } s.close(); } public void testNestedConjunctionPerf() throws Exception { r = newRandom(); createDummySearcher(); validate=false; sets=randBitSets(32,1000000); for (int i=0; i<bigIter; i++) { long start = System.currentTimeMillis(); doNestedConjunctions(500,3,3); long end = System.currentTimeMillis(); if (VERBOSE) System.out.println("milliseconds="+(end-start)); } s.close(); } public void testConjunctionTerms() throws Exception { r = newRandom(); validate=false; RAMDirectory dir = new RAMDirectory(); if (VERBOSE) System.out.println("Creating index"); createRandomTerms(100000,25,.5, dir); s = new IndexSearcher(dir, true); if (VERBOSE) System.out.println("Starting performance test"); for (int i=0; i<bigIter; i++) { long start = System.currentTimeMillis(); doTermConjunctions(s,25,5,1000); long end = System.currentTimeMillis(); if (VERBOSE) System.out.println("milliseconds="+(end-start)); } s.close(); } public void testNestedConjunctionTerms() throws Exception { r = newRandom(); validate=false; RAMDirectory dir = new RAMDirectory(); if (VERBOSE) System.out.println("Creating index"); createRandomTerms(100000,25,.2, dir); s = new IndexSearcher(dir, true); if (VERBOSE) System.out.println("Starting performance test"); for (int i=0; i<bigIter; i++) { long start = System.currentTimeMillis(); doNestedTermConjunctions(s,25,3,3,200); long end = System.currentTimeMillis(); if (VERBOSE) System.out.println("milliseconds="+(end-start)); } s.close(); } public void testSloppyPhrasePerf() throws Exception { r = newRandom(); validate=false; RAMDirectory dir = new RAMDirectory(); if (VERBOSE) System.out.println("Creating index"); createRandomTerms(100000,25,2,dir); s = new IndexSearcher(dir, true); if (VERBOSE) System.out.println("Starting performance test"); for (int i=0; i<bigIter; i++) { long start = System.currentTimeMillis(); doSloppyPhrase(s,25,2,1000); long end = System.currentTimeMillis(); if (VERBOSE) System.out.println("milliseconds="+(end-start)); } s.close(); } **
}	TokenNameRBRACE	
