/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutput	TokenNameIdentifier	 Data Output
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
TypeSizes	TokenNameIdentifier	 Type Sizes
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
ISerializer	TokenNameIdentifier	 I Serializer
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
MessagingService	TokenNameIdentifier	 Messaging Service
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SerializingCacheProvider	TokenNameIdentifier	 Serializing Cache Provider
implements	TokenNameimplements	
IRowCacheProvider	TokenNameIdentifier	 I Row Cache Provider
{	TokenNameLBRACE	
public	TokenNamepublic	
ICache	TokenNameIdentifier	 I Cache
<	TokenNameLESS	
RowCacheKey	TokenNameIdentifier	 Row Cache Key
,	TokenNameCOMMA	
IRowCacheEntry	TokenNameIdentifier	 I Row Cache Entry
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
long	TokenNamelong	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SerializingCache	TokenNameIdentifier	 Serializing Cache
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
capacity	TokenNameIdentifier	 capacity
,	TokenNameCOMMA	
new	TokenNamenew	
RowCacheSerializer	TokenNameIdentifier	 Row Cache Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Package protected for tests 	TokenNameCOMMENT_LINE	Package protected for tests 
static	TokenNamestatic	
class	TokenNameclass	
RowCacheSerializer	TokenNameIdentifier	 Row Cache Serializer
implements	TokenNameimplements	
ISerializer	TokenNameIdentifier	 I Serializer
<	TokenNameLESS	
IRowCacheEntry	TokenNameIdentifier	 I Row Cache Entry
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
IRowCacheEntry	TokenNameIdentifier	 I Row Cache Entry
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// unlike CFS we don't support nulls, since there is no need for that in the cache 	TokenNameCOMMENT_LINE	unlike CFS we don't support nulls, since there is no need for that in the cache 
boolean	TokenNameboolean	
isSentinel	TokenNameIdentifier	 is Sentinel
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
instanceof	TokenNameinstanceof	
RowCacheSentinel	TokenNameIdentifier	 Row Cache Sentinel
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBoolean	TokenNameIdentifier	 write Boolean
(	TokenNameLPAREN	
isSentinel	TokenNameIdentifier	 is Sentinel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isSentinel	TokenNameIdentifier	 is Sentinel
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RowCacheSentinel	TokenNameIdentifier	 Row Cache Sentinel
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
.	TokenNameDOT	
sentinelId	TokenNameIdentifier	 sentinel Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IRowCacheEntry	TokenNameIdentifier	 I Row Cache Entry
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isSentinel	TokenNameIdentifier	 is Sentinel
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readBoolean	TokenNameIdentifier	 read Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isSentinel	TokenNameIdentifier	 is Sentinel
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
RowCacheSentinel	TokenNameIdentifier	 Row Cache Sentinel
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
IRowCacheEntry	TokenNameIdentifier	 I Row Cache Entry
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
typeSizes	TokenNameIdentifier	 type Sizes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
instanceof	TokenNameinstanceof	
RowCacheSentinel	TokenNameIdentifier	 Row Cache Sentinel
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
typeSizes	TokenNameIdentifier	 type Sizes
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RowCacheSentinel	TokenNameIdentifier	 Row Cache Sentinel
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
.	TokenNameDOT	
sentinelId	TokenNameIdentifier	 sentinel Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
,	TokenNameCOMMA	
typeSizes	TokenNameIdentifier	 type Sizes
,	TokenNameCOMMA	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
