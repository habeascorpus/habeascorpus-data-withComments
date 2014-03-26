/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
LinkedBlockingQueue	TokenNameIdentifier	 Linked Blocking Queue
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
AbstractIterator	TokenNameIdentifier	 Abstract Iterator
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
IAsyncResult	TokenNameIdentifier	 I Async Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessageIn	TokenNameIdentifier	 Message In
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
Pair	TokenNameIdentifier	 Pair
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
/** * Turns RangeSliceReply objects into row (string -> CF) maps, resolving * to the most recent ColumnFamily and setting up read repairs as necessary. */	TokenNameCOMMENT_JAVADOC	 Turns RangeSliceReply objects into row (string -> CF) maps, resolving to the most recent ColumnFamily and setting up read repairs as necessary. 
public	TokenNamepublic	
class	TokenNameclass	
RangeSliceResponseResolver	TokenNameIdentifier	 Range Slice Response Resolver
implements	TokenNameimplements	
IResponseResolver	TokenNameIdentifier	 I Response Resolver
<	TokenNameLESS	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
,	TokenNameCOMMA	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
>>	TokenNameRIGHT_SHIFT	
pairComparator	TokenNameIdentifier	 pair Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
sources	TokenNameIdentifier	 sources
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
>>	TokenNameRIGHT_SHIFT	
responses	TokenNameIdentifier	 responses
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedBlockingQueue	TokenNameIdentifier	 Linked Blocking Queue
<	TokenNameLESS	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IAsyncResult	TokenNameIdentifier	 I Async Result
>	TokenNameGREATER	
repairResults	TokenNameIdentifier	 repair Results
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IAsyncResult	TokenNameIdentifier	 I Async Result
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RangeSliceResponseResolver	TokenNameIdentifier	 Range Slice Response Resolver
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSources	TokenNameIdentifier	 set Sources
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
endpoints	TokenNameIdentifier	 endpoints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sources	TokenNameIdentifier	 sources
=	TokenNameEQUAL	
endpoints	TokenNameIdentifier	 endpoints
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
>	TokenNameGREATER	
response	TokenNameIdentifier	 response
=	TokenNameEQUAL	
responses	TokenNameIdentifier	 responses
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Note: this would deserialize the response a 2nd time if getData was called first. 	TokenNameCOMMENT_LINE	Note: this would deserialize the response a 2nd time if getData was called first. 
// (this is not currently an issue since we don't do read repair for range queries.) 	TokenNameCOMMENT_LINE	(this is not currently an issue since we don't do read repair for range queries.) 
public	TokenNamepublic	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
RowIterator	TokenNameIdentifier	 Row Iterator
>	TokenNameGREATER	
iters	TokenNameIdentifier	 iters
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
RowIterator	TokenNameIdentifier	 Row Iterator
>	TokenNameGREATER	
(	TokenNameLPAREN	
responses	TokenNameIdentifier	 responses
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
>	TokenNameGREATER	
response	TokenNameIdentifier	 response
:	TokenNameCOLON	
responses	TokenNameIdentifier	 responses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
reply	TokenNameIdentifier	 reply
=	TokenNameEQUAL	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
payload	TokenNameIdentifier	 payload
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iters	TokenNameIdentifier	 iters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
RowIterator	TokenNameIdentifier	 Row Iterator
(	TokenNameLPAREN	
reply	TokenNameIdentifier	 reply
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for each row, compute the combination of all different versions seen, and repair incomplete versions 	TokenNameCOMMENT_LINE	for each row, compute the combination of all different versions seen, and repair incomplete versions 
// TODO do we need to call close? 	TokenNameCOMMENT_LINE	TODO do we need to call close? 
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
MergeIterator	TokenNameIdentifier	 Merge Iterator
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
iters	TokenNameIdentifier	 iters
,	TokenNameCOMMA	
pairComparator	TokenNameIdentifier	 pair Comparator
,	TokenNameCOMMA	
new	TokenNamenew	
Reducer	TokenNameIdentifier	 Reducer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
resolvedRows	TokenNameIdentifier	 resolved Rows
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
resolvedRows	TokenNameIdentifier	 resolved Rows
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resolvedRows	TokenNameIdentifier	 resolved Rows
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
preprocess	TokenNameIdentifier	 preprocess
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
responses	TokenNameIdentifier	 responses
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDataPresent	TokenNameIdentifier	 is Data Present
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
responses	TokenNameIdentifier	 responses
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
RowIterator	TokenNameIdentifier	 Row Iterator
extends	TokenNameextends	
AbstractIterator	TokenNameIdentifier	 Abstract Iterator
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
>>	TokenNameRIGHT_SHIFT	
implements	TokenNameimplements	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
InetAddress	TokenNameIdentifier	 Inet Address
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RowIterator	TokenNameIdentifier	 Row Iterator
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
computeNext	TokenNameIdentifier	 compute Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
:	TokenNameCOLON	
endOfData	TokenNameIdentifier	 end Of Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
RangeSliceReply	TokenNameIdentifier	 Range Slice Reply
>>	TokenNameRIGHT_SHIFT	
getMessages	TokenNameIdentifier	 get Messages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
responses	TokenNameIdentifier	 responses
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
Reducer	TokenNameIdentifier	 Reducer
extends	TokenNameextends	
MergeIterator	TokenNameIdentifier	 Merge Iterator
.	TokenNameDOT	
Reducer	TokenNameIdentifier	 Reducer
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
,	TokenNameCOMMA	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
versions	TokenNameIdentifier	 versions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
(	TokenNameLPAREN	
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
versionSources	TokenNameIdentifier	 version Sources
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
(	TokenNameLPAREN	
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
,	TokenNameCOMMA	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
versionSources	TokenNameIdentifier	 version Sources
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Row	TokenNameIdentifier	 Row
getReduced	TokenNameIdentifier	 get Reduced
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
.	TokenNameDOT	
resolveSuperset	TokenNameIdentifier	 resolve Superset
(	TokenNameLPAREN	
versions	TokenNameIdentifier	 versions
)	TokenNameRPAREN	
:	TokenNameCOLON	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// add placeholder rows for sources that didn't have any data, so maybeScheduleRepairs sees them 	TokenNameCOMMENT_LINE	add placeholder rows for sources that didn't have any data, so maybeScheduleRepairs sees them 
for	TokenNamefor	
(	TokenNameLPAREN	
InetAddress	TokenNameIdentifier	 Inet Address
source	TokenNameIdentifier	 source
:	TokenNameCOLON	
sources	TokenNameIdentifier	 sources
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
versionSources	TokenNameIdentifier	 version Sources
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
versionSources	TokenNameIdentifier	 version Sources
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// resolved can be null even if versions doesn't have all nulls because of the call to removeDeleted in resolveSuperSet 	TokenNameCOMMENT_LINE	resolved can be null even if versions doesn't have all nulls because of the call to removeDeleted in resolveSuperSet 
if	TokenNameif	
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
repairResults	TokenNameIdentifier	 repair Results
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
RowRepairResolver	TokenNameIdentifier	 Row Repair Resolver
.	TokenNameDOT	
scheduleRepairs	TokenNameIdentifier	 schedule Repairs
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
,	TokenNameCOMMA	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
versions	TokenNameIdentifier	 versions
,	TokenNameCOMMA	
versionSources	TokenNameIdentifier	 version Sources
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
versionSources	TokenNameIdentifier	 version Sources
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Row	TokenNameIdentifier	 Row
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
