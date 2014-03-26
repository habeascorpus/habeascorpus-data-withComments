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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
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
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
IPartitioner	TokenNameIdentifier	 I Partitioner
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
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
/** * Two approaches to building an IndexSummary: * 1. Call maybeAddEntry with every potential index entry * 2. Call shouldAddEntry, [addEntry,] incrementRowid */	TokenNameCOMMENT_JAVADOC	 Two approaches to building an IndexSummary: 1. Call maybeAddEntry with every potential index entry 2. Call shouldAddEntry, [addEntry,] incrementRowid 
public	TokenNamepublic	
class	TokenNameclass	
IndexSummary	TokenNameIdentifier	 Index Summary
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IndexSummarySerializer	TokenNameIdentifier	 Index Summary Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSummarySerializer	TokenNameIdentifier	 Index Summary Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
positions	TokenNameIdentifier	 positions
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
keysWritten	TokenNameIdentifier	 keys Written
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IndexSummary	TokenNameIdentifier	 Index Summary
(	TokenNameLPAREN	
long	TokenNamelong	
expectedKeys	TokenNameIdentifier	 expected Keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
expectedEntries	TokenNameIdentifier	 expected Entries
=	TokenNameEQUAL	
expectedKeys	TokenNameIdentifier	 expected Keys
/	TokenNameDIVIDE	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getIndexInterval	TokenNameIdentifier	 get Index Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expectedEntries	TokenNameIdentifier	 expected Entries
>	TokenNameGREATER	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
// TODO: that's a _lot_ of keys, or a very low interval 	TokenNameCOMMENT_LINE	TODO: that's a _lot_ of keys, or a very low interval 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Cannot use index_interval of "	TokenNameStringLiteral	Cannot use index_interval of 
+	TokenNamePLUS	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getIndexInterval	TokenNameIdentifier	 get Index Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" with "	TokenNameStringLiteral	 with 
+	TokenNamePLUS	
expectedKeys	TokenNameIdentifier	 expected Keys
+	TokenNamePLUS	
" (expected) keys."	TokenNameStringLiteral	 (expected) keys.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
expectedEntries	TokenNameIdentifier	 expected Entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
>	TokenNameGREATER	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
expectedEntries	TokenNameIdentifier	 expected Entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
IndexSummary	TokenNameIdentifier	 Index Summary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
incrementRowid	TokenNameIdentifier	 increment Rowid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keysWritten	TokenNameIdentifier	 keys Written
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldAddEntry	TokenNameIdentifier	 should Add Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keysWritten	TokenNameIdentifier	 keys Written
%	TokenNameREMAINDER	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getIndexInterval	TokenNameIdentifier	 get Index Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addEntry	TokenNameIdentifier	 add Entry
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
long	TokenNamelong	
indexPosition	TokenNameIdentifier	 index Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SSTable	TokenNameIdentifier	 SS Table
.	TokenNameDOT	
getMinimalKey	TokenNameIdentifier	 get Minimal Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
indexPosition	TokenNameIdentifier	 index Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
maybeAddEntry	TokenNameIdentifier	 maybe Add Entry
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
decoratedKey	TokenNameIdentifier	 decorated Key
,	TokenNameCOMMA	
long	TokenNamelong	
indexPosition	TokenNameIdentifier	 index Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shouldAddEntry	TokenNameIdentifier	 should Add Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
addEntry	TokenNameIdentifier	 add Entry
(	TokenNameLPAREN	
decoratedKey	TokenNameIdentifier	 decorated Key
,	TokenNameCOMMA	
indexPosition	TokenNameIdentifier	 index Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incrementRowid	TokenNameIdentifier	 increment Rowid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
>	TokenNameGREATER	
getKeys	TokenNameIdentifier	 get Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
complete	TokenNameIdentifier	 complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
trimToSize	TokenNameIdentifier	 trim To Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
trimToSize	TokenNameIdentifier	 trim To Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
IndexSummarySerializer	TokenNameIdentifier	 Index Summary Serializer
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
IndexSummary	TokenNameIdentifier	 Index Summary
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"keysize and the position sizes are not same."	TokenNameStringLiteral	keysize and the position sizes are not same.
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getIndexInterval	TokenNameIdentifier	 get Index Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
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
t	TokenNameIdentifier	 t
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
writeWithLength	TokenNameIdentifier	 write With Length
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
IndexSummary	TokenNameIdentifier	 Index Summary
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexSummary	TokenNameIdentifier	 Index Summary
summary	TokenNameIdentifier	 summary
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSummary	TokenNameIdentifier	 Index Summary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getIndexInterval	TokenNameIdentifier	 get Index Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Cannot read the saved summary because Index Interval changed."	TokenNameStringLiteral	Cannot read the saved summary because Index Interval changed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
readWithLength	TokenNameIdentifier	 read With Length
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
summary	TokenNameIdentifier	 summary
.	TokenNameDOT	
addEntry	TokenNameIdentifier	 add Entry
(	TokenNameLPAREN	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
decorateKey	TokenNameIdentifier	 decorate Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
summary	TokenNameIdentifier	 summary
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
