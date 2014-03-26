/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
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
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
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
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
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
MessageOut	TokenNameIdentifier	 Message Out
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
IndexClause	TokenNameIdentifier	 Index Clause
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
SlicePredicate	TokenNameIdentifier	 Slice Predicate
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
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
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
TDeserializer	TokenNameIdentifier	 T Deserializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
TSerializer	TokenNameIdentifier	 T Serializer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
IndexScanCommand	TokenNameIdentifier	 Index Scan Command
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IndexScanCommandSerializer	TokenNameIdentifier	 Index Scan Command Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexScanCommandSerializer	TokenNameIdentifier	 Index Scan Command Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
column_family	TokenNameIdentifier	 column family
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
IndexClause	TokenNameIdentifier	 Index Clause
index_clause	TokenNameIdentifier	 index clause
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
SlicePredicate	TokenNameIdentifier	 Slice Predicate
predicate	TokenNameIdentifier	 predicate
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
range	TokenNameIdentifier	 range
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IndexScanCommand	TokenNameIdentifier	 Index Scan Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
column_family	TokenNameIdentifier	 column family
,	TokenNameCOMMA	
IndexClause	TokenNameIdentifier	 Index Clause
index_clause	TokenNameIdentifier	 index clause
,	TokenNameCOMMA	
SlicePredicate	TokenNameIdentifier	 Slice Predicate
predicate	TokenNameIdentifier	 predicate
,	TokenNameCOMMA	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
column_family	TokenNameIdentifier	 column family
=	TokenNameEQUAL	
column_family	TokenNameIdentifier	 column family
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
index_clause	TokenNameIdentifier	 index clause
=	TokenNameEQUAL	
index_clause	TokenNameIdentifier	 index clause
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
predicate	TokenNameIdentifier	 predicate
=	TokenNameEQUAL	
predicate	TokenNameIdentifier	 predicate
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
range	TokenNameIdentifier	 range
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
IndexScanCommand	TokenNameIdentifier	 Index Scan Command
>	TokenNameGREATER	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
IndexScanCommand	TokenNameIdentifier	 Index Scan Command
>	TokenNameGREATER	
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
.	TokenNameDOT	
INDEX_SCAN	TokenNameIdentifier	 INDEX  SCAN
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
IndexScanCommandSerializer	TokenNameIdentifier	 Index Scan Command Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
IndexScanCommand	TokenNameIdentifier	 Index Scan Command
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
IndexScanCommand	TokenNameIdentifier	 Index Scan Command
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
version	TokenNameIdentifier	 version
<	TokenNameLESS	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_12	TokenNameIdentifier	 VERSION 12
;	TokenNameSEMICOLON	
// 1.2 only uses RangeScanCommand 	TokenNameCOMMENT_LINE	1.2 only uses RangeScanCommand 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
column_family	TokenNameIdentifier	 column family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TSerializer	TokenNameIdentifier	 T Serializer
ser	TokenNameIdentifier	 ser
=	TokenNameEQUAL	
new	TokenNamenew	
TSerializer	TokenNameIdentifier	 T Serializer
(	TokenNameLPAREN	
new	TokenNamenew	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
ser	TokenNameIdentifier	 ser
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
index_clause	TokenNameIdentifier	 index clause
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
ser	TokenNameIdentifier	 ser
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
predicate	TokenNameIdentifier	 predicate
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
range	TokenNameIdentifier	 range
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IndexScanCommand	TokenNameIdentifier	 Index Scan Command
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
version	TokenNameIdentifier	 version
<	TokenNameLESS	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_12	TokenNameIdentifier	 VERSION 12
;	TokenNameSEMICOLON	
// 1.2 only uses RangeScanCommand 	TokenNameCOMMENT_LINE	1.2 only uses RangeScanCommand 
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexClause	TokenNameIdentifier	 Index Clause
indexClause	TokenNameIdentifier	 index Clause
=	TokenNameEQUAL	
new	TokenNamenew	
IndexClause	TokenNameIdentifier	 Index Clause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SlicePredicate	TokenNameIdentifier	 Slice Predicate
predicate	TokenNameIdentifier	 predicate
=	TokenNameEQUAL	
new	TokenNamenew	
SlicePredicate	TokenNameIdentifier	 Slice Predicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TDeserializer	TokenNameIdentifier	 T Deserializer
dser	TokenNameIdentifier	 dser
=	TokenNameEQUAL	
new	TokenNamenew	
TDeserializer	TokenNameIdentifier	 T Deserializer
(	TokenNameLPAREN	
new	TokenNamenew	
TBinaryProtocol	TokenNameIdentifier	 T Binary Protocol
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dser	TokenNameIdentifier	 dser
,	TokenNameCOMMA	
indexClause	TokenNameIdentifier	 index Clause
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dser	TokenNameIdentifier	 dser
,	TokenNameCOMMA	
predicate	TokenNameIdentifier	 predicate
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
.	TokenNameDOT	
toRowBounds	TokenNameIdentifier	 to Row Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
IndexScanCommand	TokenNameIdentifier	 Index Scan Command
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
indexClause	TokenNameIdentifier	 index Clause
,	TokenNameCOMMA	
predicate	TokenNameIdentifier	 predicate
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
IndexScanCommand	TokenNameIdentifier	 Index Scan Command
object	TokenNameIdentifier	 object
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
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
}	TokenNameRBRACE	
