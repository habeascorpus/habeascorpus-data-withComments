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
ArrayList	TokenNameIdentifier	 Array List
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DocIdSet	TokenNameIdentifier	 Doc Id Set
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
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
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
Filter	TokenNameIdentifier	 Filter
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
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
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
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
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
ReaderUtil	TokenNameIdentifier	 Reader Util
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
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * Split an index based on a {@link Filter}. */	TokenNameCOMMENT_JAVADOC	 Split an index based on a {@link Filter}. 
public	TokenNamepublic	
class	TokenNameclass	
PKIndexSplitter	TokenNameIdentifier	 PK Index Splitter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Filter	TokenNameIdentifier	 Filter
docsInFirstIndex	TokenNameIdentifier	 docs In First Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir2	TokenNameIdentifier	 dir2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
config1	TokenNameIdentifier	 config1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
config2	TokenNameIdentifier	 config2
;	TokenNameSEMICOLON	
/** * Split an index based on a {@link Filter}. All documents that match the filter * are sent to dir1, remaining ones to dir2. * @deprecated use {@link #PKIndexSplitter(Version, Directory, Directory, Directory, Filter)} instead. * This constructor will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Split an index based on a {@link Filter}. All documents that match the filter are sent to dir1, remaining ones to dir2. @deprecated use {@link #PKIndexSplitter(Version, Directory, Directory, Directory, Filter)} instead. This constructor will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
PKIndexSplitter	TokenNameIdentifier	 PK Index Splitter
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
docsInFirstIndex	TokenNameIdentifier	 docs In First Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
docsInFirstIndex	TokenNameIdentifier	 docs In First Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Split an index based on a given primary key term * and a 'middle' term. If the middle term is present, it's * sent to dir2. * @deprecated use {@link #PKIndexSplitter(Version, Directory, Directory, Directory, Term)} * instead. This constructor will be removed in Lucene 4.0. */	TokenNameCOMMENT_JAVADOC	 Split an index based on a given primary key term and a 'middle' term. If the middle term is present, it's sent to dir2. @deprecated use {@link #PKIndexSplitter(Version, Directory, Directory, Directory, Term)} instead. This constructor will be removed in Lucene 4.0. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
PKIndexSplitter	TokenNameIdentifier	 PK Index Splitter
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
midTerm	TokenNameIdentifier	 mid Term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
new	TokenNamenew	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
(	TokenNameLPAREN	
midTerm	TokenNameIdentifier	 mid Term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
midTerm	TokenNameIdentifier	 mid Term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Split an index based on a {@link Filter}. All documents that match the filter * are sent to dir1, remaining ones to dir2. */	TokenNameCOMMENT_JAVADOC	 Split an index based on a {@link Filter}. All documents that match the filter are sent to dir1, remaining ones to dir2. 
public	TokenNamepublic	
PKIndexSplitter	TokenNameIdentifier	 PK Index Splitter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
docsInFirstIndex	TokenNameIdentifier	 docs In First Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
docsInFirstIndex	TokenNameIdentifier	 docs In First Index
,	TokenNameCOMMA	
newDefaultConfig	TokenNameIdentifier	 new Default Config
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newDefaultConfig	TokenNameIdentifier	 new Default Config
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
newDefaultConfig	TokenNameIdentifier	 new Default Config
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
.	TokenNameDOT	
setOpenMode	TokenNameIdentifier	 set Open Mode
(	TokenNameLPAREN	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
CREATE	TokenNameIdentifier	 CREATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PKIndexSplitter	TokenNameIdentifier	 PK Index Splitter
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
docsInFirstIndex	TokenNameIdentifier	 docs In First Index
,	TokenNameCOMMA	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
config1	TokenNameIdentifier	 config1
,	TokenNameCOMMA	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
config2	TokenNameIdentifier	 config2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
dir1	TokenNameIdentifier	 dir1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dir2	TokenNameIdentifier	 dir2
=	TokenNameEQUAL	
dir2	TokenNameIdentifier	 dir2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docsInFirstIndex	TokenNameIdentifier	 docs In First Index
=	TokenNameEQUAL	
docsInFirstIndex	TokenNameIdentifier	 docs In First Index
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
config1	TokenNameIdentifier	 config1
=	TokenNameEQUAL	
config1	TokenNameIdentifier	 config1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
config2	TokenNameIdentifier	 config2
=	TokenNameEQUAL	
config2	TokenNameIdentifier	 config2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Split an index based on a given primary key term * and a 'middle' term. If the middle term is present, it's * sent to dir2. */	TokenNameCOMMENT_JAVADOC	 Split an index based on a given primary key term and a 'middle' term. If the middle term is present, it's sent to dir2. 
public	TokenNamepublic	
PKIndexSplitter	TokenNameIdentifier	 PK Index Splitter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
midTerm	TokenNameIdentifier	 mid Term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
new	TokenNamenew	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
(	TokenNameLPAREN	
midTerm	TokenNameIdentifier	 mid Term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
midTerm	TokenNameIdentifier	 mid Term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PKIndexSplitter	TokenNameIdentifier	 PK Index Splitter
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
midTerm	TokenNameIdentifier	 mid Term
,	TokenNameCOMMA	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
config1	TokenNameIdentifier	 config1
,	TokenNameCOMMA	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
config2	TokenNameIdentifier	 config2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
new	TokenNamenew	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
(	TokenNameLPAREN	
midTerm	TokenNameIdentifier	 mid Term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
midTerm	TokenNameIdentifier	 mid Term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
config1	TokenNameIdentifier	 config1
,	TokenNameCOMMA	
config2	TokenNameIdentifier	 config2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// pass an individual config in here since one config can not be reused! 	TokenNameCOMMENT_LINE	pass an individual config in here since one config can not be reused! 
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
config1	TokenNameIdentifier	 config1
,	TokenNameCOMMA	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docsInFirstIndex	TokenNameIdentifier	 docs In First Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
config2	TokenNameIdentifier	 config2
,	TokenNameCOMMA	
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docsInFirstIndex	TokenNameIdentifier	 docs In First Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
config	TokenNameIdentifier	 config
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
preserveFilter	TokenNameIdentifier	 preserve Filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
negateFilter	TokenNameIdentifier	 negate Filter
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexWriter	TokenNameIdentifier	 Index Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
leaves	TokenNameIdentifier	 leaves
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ReaderUtil	TokenNameIdentifier	 Reader Util
.	TokenNameDOT	
gatherSubReaders	TokenNameIdentifier	 gather Sub Readers
(	TokenNameLPAREN	
leaves	TokenNameIdentifier	 leaves
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
=	TokenNameEQUAL	
new	TokenNamenew	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
leaves	TokenNameIdentifier	 leaves
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
{	TokenNameLBRACE	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
DocumentFilteredAtomicIndexReader	TokenNameIdentifier	 Document Filtered Atomic Index Reader
(	TokenNameLPAREN	
leaves	TokenNameIdentifier	 leaves
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
preserveFilter	TokenNameIdentifier	 preserve Filter
,	TokenNameCOMMA	
negateFilter	TokenNameIdentifier	 negate Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addIndexes	TokenNameIdentifier	 add Indexes
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DocumentFilteredAtomicIndexReader	TokenNameIdentifier	 Document Filtered Atomic Index Reader
extends	TokenNameextends	
FilterIndexReader	TokenNameIdentifier	 Filter Index Reader
{	TokenNameLBRACE	
final	TokenNamefinal	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
readerDels	TokenNameIdentifier	 reader Dels
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DocumentFilteredAtomicIndexReader	TokenNameIdentifier	 Document Filtered Atomic Index Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
preserveFilter	TokenNameIdentifier	 preserve Filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
negateFilter	TokenNameIdentifier	 negate Filter
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocIdSet	TokenNameIdentifier	 Doc Id Set
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
preserveFilter	TokenNameIdentifier	 preserve Filter
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// this is somehow inverse, if we negate the filter, we delete all documents it matches! 	TokenNameCOMMENT_LINE	this is somehow inverse, if we negate the filter, we delete all documents it matches! 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
negateFilter	TokenNameIdentifier	 negate Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
hasDeletions	TokenNameIdentifier	 has Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
in	TokenNameIdentifier	 in
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
readerDels	TokenNameIdentifier	 reader Dels
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
return	TokenNamereturn	
numDocs	TokenNameIdentifier	 num Docs
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
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
numDocs	TokenNameIdentifier	 num Docs
)	TokenNameRPAREN	
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
readerDels	TokenNameIdentifier	 reader Dels
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
null	TokenNamenull	
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
return	TokenNamereturn	
new	TokenNamenew	
FilterTermPositions	TokenNameIdentifier	 Filter Term Positions
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
boolean	TokenNameboolean	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
readerDels	TokenNameIdentifier	 reader Dels
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
