/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
columniterator	TokenNameIdentifier	 columniterator
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
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ColumnFamily	TokenNameIdentifier	 Column Family
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
DecoratedKey	TokenNameIdentifier	 Decorated Key
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
RowIndexEntry	TokenNameIdentifier	 Row Index Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
ColumnSlice	TokenNameIdentifier	 Column Slice
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
SSTableReader	TokenNameIdentifier	 SS Table Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileDataInput	TokenNameIdentifier	 File Data Input
;	TokenNameSEMICOLON	
/** * A Column Iterator over SSTable */	TokenNameCOMMENT_JAVADOC	 A Column Iterator over SSTable 
public	TokenNamepublic	
class	TokenNameclass	
SSTableSliceIterator	TokenNameIdentifier	 SS Table Slice Iterator
implements	TokenNameimplements	
ISSTableColumnIterator	TokenNameIdentifier	 ISS Table Column Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SSTableSliceIterator	TokenNameIdentifier	 SS Table Slice Iterator
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
ColumnSlice	TokenNameIdentifier	 Column Slice
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
slices	TokenNameIdentifier	 slices
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
RowIndexEntry	TokenNameIdentifier	 Row Index Entry
indexEntry	TokenNameIdentifier	 index Entry
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
SSTableReader	TokenNameIdentifier	 SS Table Reader
.	TokenNameDOT	
Operator	TokenNameIdentifier	 Operator
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
indexEntry	TokenNameIdentifier	 index Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
createReader	TokenNameIdentifier	 create Reader
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
indexEntry	TokenNameIdentifier	 index Entry
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
slices	TokenNameIdentifier	 slices
,	TokenNameCOMMA	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An iterator for a slice within an SSTable * @param sstable Table for the CFS we are reading from * @param file Optional parameter that input is read from. If null is passed, this class creates an appropriate one automatically. * If this class creates, it will close the underlying file when #close() is called. * If a caller passes a non-null argument, this class will NOT close the underlying file when the iterator is closed (i.e. the caller is responsible for closing the file) * In all cases the caller should explicitly #close() this iterator. * @param key The key the requested slice resides under * @param slices the column slices * @param reversed Results are returned in reverse order iff reversed is true. * @param indexEntry position of the row */	TokenNameCOMMENT_JAVADOC	 An iterator for a slice within an SSTable @param sstable Table for the CFS we are reading from @param file Optional parameter that input is read from. If null is passed, this class creates an appropriate one automatically. If this class creates, it will close the underlying file when #close() is called. If a caller passes a non-null argument, this class will NOT close the underlying file when the iterator is closed (i.e. the caller is responsible for closing the file) In all cases the caller should explicitly #close() this iterator. @param key The key the requested slice resides under @param slices the column slices @param reversed Results are returned in reverse order iff reversed is true. @param indexEntry position of the row 
public	TokenNamepublic	
SSTableSliceIterator	TokenNameIdentifier	 SS Table Slice Iterator
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
FileDataInput	TokenNameIdentifier	 File Data Input
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
ColumnSlice	TokenNameIdentifier	 Column Slice
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
slices	TokenNameIdentifier	 slices
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
,	TokenNameCOMMA	
RowIndexEntry	TokenNameIdentifier	 Row Index Entry
indexEntry	TokenNameIdentifier	 index Entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
createReader	TokenNameIdentifier	 create Reader
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
indexEntry	TokenNameIdentifier	 index Entry
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
slices	TokenNameIdentifier	 slices
,	TokenNameCOMMA	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
createReader	TokenNameIdentifier	 create Reader
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
RowIndexEntry	TokenNameIdentifier	 Row Index Entry
indexEntry	TokenNameIdentifier	 index Entry
,	TokenNameCOMMA	
FileDataInput	TokenNameIdentifier	 File Data Input
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
ColumnSlice	TokenNameIdentifier	 Column Slice
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
slices	TokenNameIdentifier	 slices
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
slices	TokenNameIdentifier	 slices
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
slices	TokenNameIdentifier	 slices
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
reversed	TokenNameIdentifier	 reversed
?	TokenNameQUESTION	
new	TokenNamenew	
SimpleSliceReader	TokenNameIdentifier	 Simple Slice Reader
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
indexEntry	TokenNameIdentifier	 index Entry
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
slices	TokenNameIdentifier	 slices
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
IndexedSliceReader	TokenNameIdentifier	 Indexed Slice Reader
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
indexEntry	TokenNameIdentifier	 index Entry
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
slices	TokenNameIdentifier	 slices
,	TokenNameCOMMA	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SSTableReader	TokenNameIdentifier	 SS Table Reader
getSStable	TokenNameIdentifier	 get S Stable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DecoratedKey	TokenNameIdentifier	 Decorated Key
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnFamily	TokenNameIdentifier	 Column Family
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
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
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
