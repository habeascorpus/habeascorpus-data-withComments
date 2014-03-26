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
compaction	TokenNameIdentifier	 compaction
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
columniterator	TokenNameIdentifier	 columniterator
.	TokenNameDOT	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
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
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
MergeIterator	TokenNameIdentifier	 Merge Iterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CompactionIterable	TokenNameIdentifier	 Compaction Iterable
extends	TokenNameextends	
AbstractCompactionIterable	TokenNameIdentifier	 Abstract Compaction Iterable
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
row	TokenNameIdentifier	 row
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
i1	TokenNameIdentifier	 i1
,	TokenNameCOMMA	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
i2	TokenNameIdentifier	 i2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i1	TokenNameIdentifier	 i1
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CompactionIterable	TokenNameIdentifier	 Compaction Iterable
(	TokenNameLPAREN	
OperationType	TokenNameIdentifier	 Operation Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ICompactionScanner	TokenNameIdentifier	 I Compaction Scanner
>	TokenNameGREATER	
scanners	TokenNameIdentifier	 scanners
,	TokenNameCOMMA	
CompactionController	TokenNameIdentifier	 Compaction Controller
controller	TokenNameIdentifier	 controller
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
controller	TokenNameIdentifier	 controller
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
scanners	TokenNameIdentifier	 scanners
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MergeIterator	TokenNameIdentifier	 Merge Iterator
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
scanners	TokenNameIdentifier	 scanners
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
new	TokenNamenew	
Reducer	TokenNameIdentifier	 Reducer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getCompactionInfo	TokenNameIdentifier	 get Compaction Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
class	TokenNameclass	
Reducer	TokenNameIdentifier	 Reducer
extends	TokenNameextends	
MergeIterator	TokenNameIdentifier	 Merge Iterator
.	TokenNameDOT	
Reducer	TokenNameIdentifier	 Reducer
<	TokenNameLESS	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
,	TokenNameCOMMA	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
>	TokenNameGREATER	
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
>	TokenNameGREATER	
rows	TokenNameIdentifier	 rows
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
getReduced	TokenNameIdentifier	 get Reduced
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
AbstractCompactedRow	TokenNameIdentifier	 Abstract Compacted Row
compactedRow	TokenNameIdentifier	 compacted Row
=	TokenNameEQUAL	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
getCompactedRow	TokenNameIdentifier	 get Compacted Row
(	TokenNameLPAREN	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
>	TokenNameGREATER	
(	TokenNameLPAREN	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compactedRow	TokenNameIdentifier	 compacted Row
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
invalidateCachedRow	TokenNameIdentifier	 invalidate Cached Row
(	TokenNameLPAREN	
compactedRow	TokenNameIdentifier	 compacted Row
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If the row is cached, we call removeDeleted on at read time it to have coherent query returns, 	TokenNameCOMMENT_LINE	If the row is cached, we call removeDeleted on at read time it to have coherent query returns, 
// but if the row is not pushed out of the cache, obsolete tombstones will persist indefinitely. 	TokenNameCOMMENT_LINE	but if the row is not pushed out of the cache, obsolete tombstones will persist indefinitely. 
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
removeDeletedInCache	TokenNameIdentifier	 remove Deleted In Cache
(	TokenNameLPAREN	
compactedRow	TokenNameIdentifier	 compacted Row
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
compactedRow	TokenNameIdentifier	 compacted Row
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
++	TokenNamePLUS_PLUS	
%	TokenNameREMAINDER	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ICompactionScanner	TokenNameIdentifier	 I Compaction Scanner
scanner	TokenNameIdentifier	 scanner
:	TokenNameCOLON	
scanners	TokenNameIdentifier	 scanners
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
getCurrentPosition	TokenNameIdentifier	 get Current Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesRead	TokenNameIdentifier	 bytes Read
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
mayThrottle	TokenNameIdentifier	 may Throttle
(	TokenNameLPAREN	
bytesRead	TokenNameIdentifier	 bytes Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
