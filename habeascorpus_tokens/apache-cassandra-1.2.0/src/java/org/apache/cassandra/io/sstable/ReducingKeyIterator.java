/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
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
IMergeIterator	TokenNameIdentifier	 I Merge Iterator
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
/** * Caller must acquire and release references to the sstables used here. */	TokenNameCOMMENT_JAVADOC	 Caller must acquire and release references to the sstables used here. 
public	TokenNamepublic	
class	TokenNameclass	
ReducingKeyIterator	TokenNameIdentifier	 Reducing Key Iterator
implements	TokenNameimplements	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
IMergeIterator	TokenNameIdentifier	 I Merge Iterator
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
>	TokenNameGREATER	
mi	TokenNameIdentifier	 mi
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ReducingKeyIterator	TokenNameIdentifier	 Reducing Key Iterator
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
sstables	TokenNameIdentifier	 sstables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
KeyIterator	TokenNameIdentifier	 Key Iterator
>	TokenNameGREATER	
iters	TokenNameIdentifier	 iters
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
KeyIterator	TokenNameIdentifier	 Key Iterator
>	TokenNameGREATER	
(	TokenNameLPAREN	
sstables	TokenNameIdentifier	 sstables
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
:	TokenNameCOLON	
sstables	TokenNameIdentifier	 sstables
)	TokenNameRPAREN	
iters	TokenNameIdentifier	 iters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
KeyIterator	TokenNameIdentifier	 Key Iterator
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
MergeIterator	TokenNameIdentifier	 Merge Iterator
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
iters	TokenNameIdentifier	 iters
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
new	TokenNamenew	
MergeIterator	TokenNameIdentifier	 Merge Iterator
.	TokenNameDOT	
Reducer	TokenNameIdentifier	 Reducer
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DecoratedKey	TokenNameIdentifier	 Decorated Key
reduced	TokenNameIdentifier	 reduced
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
trivialReduceIsTrivial	TokenNameIdentifier	 trivial Reduce Is Trivial
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reduced	TokenNameIdentifier	 reduced
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
DecoratedKey	TokenNameIdentifier	 Decorated Key
getReduced	TokenNameIdentifier	 get Reduced
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reduced	TokenNameIdentifier	 reduced
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
for	TokenNamefor	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
:	TokenNameCOLON	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
iterators	TokenNameIdentifier	 iterators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getTotalBytes	TokenNameIdentifier	 get Total Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
:	TokenNameCOLON	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
iterators	TokenNameIdentifier	 iterators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
KeyIterator	TokenNameIdentifier	 Key Iterator
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
getTotalBytes	TokenNameIdentifier	 get Total Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getBytesRead	TokenNameIdentifier	 get Bytes Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
:	TokenNameCOLON	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
iterators	TokenNameIdentifier	 iterators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
KeyIterator	TokenNameIdentifier	 Key Iterator
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytesRead	TokenNameIdentifier	 get Bytes Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Secondary index build"	TokenNameStringLiteral	Secondary index build
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DecoratedKey	TokenNameIdentifier	 Decorated Key
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mi	TokenNameIdentifier	 mi
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
}	TokenNameRBRACE	
